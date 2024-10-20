package deob;

import java.io.File;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class162[] field987 = new class162[4];

    @ObfuscatedName("client.ag")
    public static boolean field975 = true;

    @ObfuscatedName("client.ap")
    public static int field1168 = 1;

    @ObfuscatedName("client.af")
    public static int field927 = 0;

    @ObfuscatedName("client.bb")
    public static int field1203 = 0;

    @ObfuscatedName("client.bv")
    public static boolean field930 = false;

    @ObfuscatedName("client.bt")
    public static boolean field931 = false;

    @ObfuscatedName("client.bl")
    public static int field932 = 0;

    @ObfuscatedName("client.bw")
    public static int field934 = 0;

    @ObfuscatedName("client.bm")
    public static boolean field935 = true;

    @ObfuscatedName("client.bj")
    public static int field936 = 0;

    @ObfuscatedName("client.bx")
    public static long field937 = 1L;

    @ObfuscatedName("client.bh")
    public static int field1131 = -1;

    @ObfuscatedName("client.bs")
    public static int field954 = -1;

    @ObfuscatedName("client.bu")
    public static int field940 = -1;

    @ObfuscatedName("client.bn")
    public static boolean field1091 = true;

    @ObfuscatedName("client.bf")
    public static boolean field942 = false;

    @ObfuscatedName("client.bd")
    public static int field943 = 0;

    @ObfuscatedName("client.by")
    public static int field944 = 0;

    @ObfuscatedName("client.bq")
    public static int field945 = 0;

    @ObfuscatedName("client.ba")
    public static int field1184 = 0;

    @ObfuscatedName("client.bk")
    public static int field947 = 0;

    @ObfuscatedName("client.bi")
    public static int field1198 = 0;

    @ObfuscatedName("client.cd")
    public static int field949 = 0;

    @ObfuscatedName("client.cg")
    public static int field981 = 0;

    @ObfuscatedName("client.cw")
    public static int field951 = 0;

    @ObfuscatedName("client.ck")
    public static class92 field1013 = class92.field1442;

    @ObfuscatedName("client.ch")
    public static class92 field953 = class92.field1442;

    @ObfuscatedName("client.ca")
    public static int field1192 = 0;

    @ObfuscatedName("client.cf")
    public static int field955 = 0;

    @ObfuscatedName("client.cc")
    public static int field956 = 0;

    @ObfuscatedName("client.dl")
    public static int field957 = 0;

    @ObfuscatedName("client.dk")
    public static int field995 = 0;

    @ObfuscatedName("client.db")
    public static int field959 = 0;

    @ObfuscatedName("client.dt")
    public static int field960 = 0;

    @ObfuscatedName("client.ds")
    public static int field1094 = 0;

    @ObfuscatedName("client.dq")
    public static byte[] field962 = null;

    @ObfuscatedName("client.dh")
    public static class87[] field963 = new class87[32768];

    @ObfuscatedName("client.dp")
    public static int field938 = 0;

    @ObfuscatedName("client.du")
    public static int[] field950 = new int[32768];

    @ObfuscatedName("client.dv")
    public static int field966 = 0;

    @ObfuscatedName("client.do")
    public static int[] field1027 = new int[250];

    @ObfuscatedName("client.ef")
    public static class180 field969 = new class180(5000);

    @ObfuscatedName("client.et")
    public static class180 field970 = new class180(5000);

    @ObfuscatedName("client.ex")
    public static class180 field971 = new class180(15000);

    @ObfuscatedName("client.ek")
    public static int field972 = 0;

    @ObfuscatedName("client.ep")
    public static int field982 = 0;

    @ObfuscatedName("client.ec")
    public static int field974 = 0;

    @ObfuscatedName("client.ed")
    public static int field1207 = 0;

    @ObfuscatedName("client.ew")
    public static int field965 = 0;

    @ObfuscatedName("client.em")
    public static int field977 = 0;

    @ObfuscatedName("client.eb")
    public static int field978 = 0;

    @ObfuscatedName("client.ej")
    public static int field979 = 0;

    @ObfuscatedName("client.en")
    public static boolean field980 = false;

    @ObfuscatedName("client.ey")
    public static HashMap field1135 = new HashMap();

    @ObfuscatedName("client.eg")
    public static int field1084 = 0;

    @ObfuscatedName("client.ff")
    public static int field983 = 1;

    @ObfuscatedName("client.fn")
    public static int field984 = 0;

    @ObfuscatedName("client.fb")
    public static int field985 = 1;

    @ObfuscatedName("client.fs")
    public static int field1105 = 0;

    @ObfuscatedName("client.fu")
    public static boolean field988 = false;

    @ObfuscatedName("client.fy")
    public static int[][][] field989 = new int[4][13][13];

    @ObfuscatedName("client.fd")
    public static final int[] field990 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fo")
    public static int field1073 = 0;

    @ObfuscatedName("client.fp")
    public static int field1136 = 2;

    @ObfuscatedName("client.fm")
    public static int field1034 = 0;

    @ObfuscatedName("client.fl")
    public static int field994 = 2;

    @ObfuscatedName("client.fa")
    public static int field952 = 0;

    @ObfuscatedName("client.fe")
    public static int field996 = 1;

    @ObfuscatedName("client.fx")
    public static int field992 = 0;

    @ObfuscatedName("client.fr")
    public static int field1086 = 0;

    @ObfuscatedName("client.fk")
    public static int field999 = 2;

    @ObfuscatedName("client.fw")
    public static int field1000 = 0;

    @ObfuscatedName("client.gr")
    public static int field1001 = 1;

    @ObfuscatedName("client.gt")
    public static int field1002 = 0;

    @ObfuscatedName("client.ga")
    public static int field1003 = 0;

    @ObfuscatedName("client.gy")
    public static int field1109 = 2301979;

    @ObfuscatedName("client.gj")
    public static int field991 = 5063219;

    @ObfuscatedName("client.gu")
    public static int field1006 = 3353893;

    @ObfuscatedName("client.gh")
    public static int field1007 = 7759444;

    @ObfuscatedName("client.gd")
    public static boolean field1008 = false;

    @ObfuscatedName("client.gx")
    public static int field1009 = 0;

    @ObfuscatedName("client.gg")
    public static int field1053 = 128;

    @ObfuscatedName("client.he")
    public static int field1011 = 0;

    @ObfuscatedName("client.hk")
    public static int field1149 = 0;

    @ObfuscatedName("client.hf")
    public static int field1196 = 0;

    @ObfuscatedName("client.hg")
    public static int field1014 = 0;

    @ObfuscatedName("client.hb")
    public static int field1056 = 0;

    @ObfuscatedName("client.hx")
    public static int field1016 = 50;

    @ObfuscatedName("client.ho")
    public static int field1017 = 0;

    @ObfuscatedName("client.hj")
    public static boolean field1018 = false;

    @ObfuscatedName("client.hi")
    public static int field1019 = 0;

    @ObfuscatedName("client.hh")
    public static int field1047 = 0;

    @ObfuscatedName("client.hs")
    public static int field1021 = 50;

    @ObfuscatedName("client.hc")
    public static int[] field1022 = new int[field1021];

    @ObfuscatedName("client.hv")
    public static int[] field1023 = new int[field1021];

    @ObfuscatedName("client.hq")
    public static int[] field1010 = new int[field1021];

    @ObfuscatedName("client.hr")
    public static int[] field1025 = new int[field1021];

    @ObfuscatedName("client.ha")
    public static int[] field939 = new int[field1021];

    @ObfuscatedName("client.hl")
    public static int[] field1152 = new int[field1021];

    @ObfuscatedName("client.hp")
    public static int[] field1028 = new int[field1021];

    @ObfuscatedName("client.hw")
    public static String[] field1029 = new String[field1021];

    @ObfuscatedName("client.hy")
    public static int[][] field1059 = new int[104][104];

    @ObfuscatedName("client.hu")
    public static int field958 = 0;

    @ObfuscatedName("client.hm")
    public static int field1032 = -1;

    @ObfuscatedName("client.hd")
    public static int field993 = -1;

    @ObfuscatedName("client.ht")
    public static int field1191 = 0;

    @ObfuscatedName("client.ii")
    public static int field1035 = 0;

    @ObfuscatedName("client.iq")
    public static int field968 = 0;

    @ObfuscatedName("client.ih")
    public static int field1037 = 0;

    @ObfuscatedName("client.im")
    public static int field998 = 0;

    @ObfuscatedName("client.io")
    public static int field1115 = 0;

    @ObfuscatedName("client.ip")
    public static int field1040 = 0;

    @ObfuscatedName("client.ir")
    public static int field1041 = 0;

    @ObfuscatedName("client.ia")
    public static int field1042 = 0;

    @ObfuscatedName("client.iv")
    public static int field1043 = 0;

    @ObfuscatedName("client.it")
    public static String field1082 = null;

    @ObfuscatedName("client.ik")
    public static boolean field1044 = false;

    @ObfuscatedName("client.iw")
    public static int field1045 = 0;

    @ObfuscatedName("client.ie")
    public static int field1046 = 0;

    @ObfuscatedName("client.il")
    public static class75[] field967 = new class75[2048];

    @ObfuscatedName("client.ig")
    public static int field1049 = -1;

    @ObfuscatedName("client.id")
    public static int field1050 = 0;

    @ObfuscatedName("client.iy")
    public static int field1051 = 0;

    @ObfuscatedName("client.in")
    public static int[] field1052 = new int[1000];

    @ObfuscatedName("client.jr")
    public static final int[] field1107 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.jo")
    public static String[] field1064 = new String[8];

    @ObfuscatedName("client.jf")
    public static boolean[] field1096 = new boolean[8];

    @ObfuscatedName("client.ju")
    public static int[] field1124 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.jq")
    public static int field1057 = -1;

    @ObfuscatedName("client.ja")
    public static class194[][][] field986 = new class194[4][104][104];

    @ObfuscatedName("client.jp")
    public static class194 field1087 = new class194();

    @ObfuscatedName("client.jm")
    public static class194 field1060 = new class194();

    @ObfuscatedName("client.jy")
    public static class194 field1061 = new class194();

    @ObfuscatedName("client.ji")
    public static int[] field1202 = new int[25];

    @ObfuscatedName("client.jc")
    public static int[] field973 = new int[25];

    @ObfuscatedName("client.je")
    public static int[] field1078 = new int[25];

    @ObfuscatedName("client.js")
    public static int field1065 = 0;

    @ObfuscatedName("client.jh")
    public static boolean field925 = false;

    @ObfuscatedName("client.jw")
    public static int field1067 = 0;

    @ObfuscatedName("client.jb")
    public static int[] field1020 = new int[500];

    @ObfuscatedName("client.jj")
    public static int[] field1069 = new int[500];

    @ObfuscatedName("client.jl")
    public static int[] field1024 = new int[500];

    @ObfuscatedName("client.jz")
    public static int[] field1071 = new int[500];

    @ObfuscatedName("client.jk")
    public static String[] field1072 = new String[500];

    @ObfuscatedName("client.ke")
    public static String[] field964 = new String[500];

    @ObfuscatedName("client.ka")
    public static boolean field1074 = false;

    @ObfuscatedName("client.kq")
    public static int field1075 = -1;

    @ObfuscatedName("client.kj")
    public static boolean field1076 = false;

    @ObfuscatedName("client.kt")
    public static int field1077 = -1;

    @ObfuscatedName("client.ks")
    public static int field1004 = -1;

    @ObfuscatedName("client.kh")
    public static int field1055 = 0;

    @ObfuscatedName("client.kc")
    public static int field1080 = 50;

    @ObfuscatedName("client.ki")
    public static int field941 = 0;

    @ObfuscatedName("client.kz")
    public static boolean field1083 = false;

    @ObfuscatedName("client.kl")
    public static int field1159 = -1;

    @ObfuscatedName("client.kb")
    public static int field1085 = -1;

    @ObfuscatedName("client.kd")
    public static String field1079 = null;

    @ObfuscatedName("client.ku")
    public static String field1160 = null;

    @ObfuscatedName("client.kp")
    public static int field1088 = -1;

    @ObfuscatedName("client.kn")
    public static class191 field1089 = new class191(8);

    @ObfuscatedName("client.kf")
    public static int field1090 = 0;

    @ObfuscatedName("client.kx")
    public static int field1142 = 0;

    @ObfuscatedName("client.kg")
    public static class217 field1092 = null;

    @ObfuscatedName("client.ld")
    public static int field1093 = 0;

    @ObfuscatedName("client.lk")
    public static int field1081 = 0;

    @ObfuscatedName("client.lj")
    public static int field1095 = 0;

    @ObfuscatedName("client.lz")
    public static int field1066 = -1;

    @ObfuscatedName("client.lg")
    public static boolean field1097 = false;

    @ObfuscatedName("client.lw")
    public static boolean field1098 = false;

    @ObfuscatedName("client.li")
    public static boolean field1200 = false;

    @ObfuscatedName("client.lb")
    public static class217 field1100 = null;

    @ObfuscatedName("client.la")
    public static class217 field1101 = null;

    @ObfuscatedName("client.lo")
    public static class217 field1102 = null;

    @ObfuscatedName("client.le")
    public static int field1103 = 0;

    @ObfuscatedName("client.lr")
    public static int field1104 = 0;

    @ObfuscatedName("client.lq")
    public static class217 field1106 = null;

    @ObfuscatedName("client.lf")
    public static boolean field1070 = false;

    @ObfuscatedName("client.ly")
    public static int field1176 = -1;

    @ObfuscatedName("client.lt")
    public static int field1108 = -1;

    @ObfuscatedName("client.lh")
    public static boolean field1177 = false;

    @ObfuscatedName("client.lu")
    public static int field1110 = -1;

    @ObfuscatedName("client.lc")
    public static int field961 = -1;

    @ObfuscatedName("client.ll")
    public static boolean field1112 = false;

    @ObfuscatedName("client.ls")
    public static int field1113 = 1;

    @ObfuscatedName("client.mq")
    public static int[] field1114 = new int[32];

    @ObfuscatedName("client.me")
    public static int field976 = 0;

    @ObfuscatedName("client.mk")
    public static int[] field1116 = new int[32];

    @ObfuscatedName("client.mh")
    public static int field1117 = 0;

    @ObfuscatedName("client.mj")
    public static int[] field1118 = new int[32];

    @ObfuscatedName("client.mt")
    public static int field1068 = 0;

    @ObfuscatedName("client.md")
    public static int field1120 = 0;

    @ObfuscatedName("client.mp")
    public static int field1026 = 0;

    @ObfuscatedName("client.mr")
    public static int field1122 = 0;

    @ObfuscatedName("client.mf")
    public static int field1111 = 0;

    @ObfuscatedName("client.mm")
    public static int field1005 = 0;

    @ObfuscatedName("client.mu")
    public static int field1125 = 0;

    @ObfuscatedName("client.mb")
    public static int field1126 = 0;

    @ObfuscatedName("client.mg")
    public static class194 field1036 = new class194();

    @ObfuscatedName("client.mi")
    public static class194 field1128 = new class194();

    @ObfuscatedName("client.mw")
    public static class194 field1129 = new class194();

    @ObfuscatedName("client.mx")
    public static class191 field1130 = new class191(512);

    @ObfuscatedName("client.my")
    public static int field1062 = 0;

    @ObfuscatedName("client.mz")
    public static int field1132 = -2;

    @ObfuscatedName("client.mv")
    public static boolean[] field1133 = new boolean[100];

    @ObfuscatedName("client.ma")
    public static boolean[] field1134 = new boolean[100];

    @ObfuscatedName("client.ml")
    public static boolean[] field1031 = new boolean[100];

    @ObfuscatedName("client.na")
    public static int[] field1058 = new int[100];

    @ObfuscatedName("client.ny")
    public static int[] field1137 = new int[100];

    @ObfuscatedName("client.nl")
    public static int[] field1138 = new int[100];

    @ObfuscatedName("client.nq")
    public static int[] field1139 = new int[100];

    @ObfuscatedName("client.ne")
    public static int field1140 = 0;

    @ObfuscatedName("client.nn")
    public static long field1141 = 0L;

    @ObfuscatedName("client.ng")
    public static boolean field1048 = true;

    @ObfuscatedName("client.nz")
    public static int[] field1143 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ns")
    public static int field1144 = 0;

    @ObfuscatedName("client.nf")
    public static int field1033 = 0;

    @ObfuscatedName("client.nc")
    public static String field1146 = "";

    @ObfuscatedName("client.nb")
    public static long[] field1147 = new long[100];

    @ObfuscatedName("client.nt")
    public static int field1148 = 0;

    @ObfuscatedName("client.nw")
    public static int field1038 = 0;

    @ObfuscatedName("client.nj")
    public static int[] field1150 = new int[128];

    @ObfuscatedName("client.nx")
    public static int[] field1151 = new int[128];

    @ObfuscatedName("client.nu")
    public static long field926 = -1L;

    @ObfuscatedName("client.os")
    public static String field1153 = null;

    @ObfuscatedName("client.ov")
    public static String field1154 = null;

    @ObfuscatedName("client.oq")
    public static int field1155 = -1;

    @ObfuscatedName("client.ol")
    public static int field1156 = 0;

    @ObfuscatedName("client.oe")
    public static int[] field1157 = new int[1000];

    @ObfuscatedName("client.oo")
    public static int[] field1012 = new int[1000];

    @ObfuscatedName("client.or")
    public static class286[] field928 = new class286[1000];

    @ObfuscatedName("client.of")
    public static int field948 = 0;

    @ObfuscatedName("client.on")
    public static int field1161 = 0;

    @ObfuscatedName("client.ob")
    public static int field1162 = 0;

    @ObfuscatedName("client.ow")
    public static int field1163 = 255;

    @ObfuscatedName("client.ot")
    public static int field1164 = -1;

    @ObfuscatedName("client.oj")
    public static boolean field1015 = false;

    @ObfuscatedName("client.ox")
    public static int field1166 = 127;

    @ObfuscatedName("client.oz")
    public static int field1099 = 127;

    @ObfuscatedName("client.pm")
    public static int field1182 = 0;

    @ObfuscatedName("client.pl")
    public static int[] field1169 = new int[50];

    @ObfuscatedName("client.pp")
    public static int[] field1170 = new int[50];

    @ObfuscatedName("client.ps")
    public static int[] field1171 = new int[50];

    @ObfuscatedName("client.pt")
    public static int[] field1172 = new int[50];

    @ObfuscatedName("client.pu")
    public static class106[] field1173 = new class106[50];

    @ObfuscatedName("client.py")
    public static boolean field1174 = false;

    @ObfuscatedName("client.pb")
    public static boolean[] field1175 = new boolean[5];

    @ObfuscatedName("client.px")
    public static int[] field1165 = new int[5];

    @ObfuscatedName("client.pk")
    public static int[] field997 = new int[5];

    @ObfuscatedName("client.qd")
    public static int[] field1178 = new int[5];

    @ObfuscatedName("client.qc")
    public static int[] field1179 = new int[5];

    @ObfuscatedName("client.qq")
    public static short field1180 = 256;

    @ObfuscatedName("client.qr")
    public static short field1181 = 205;

    @ObfuscatedName("client.qk")
    public static short field1127 = 256;

    @ObfuscatedName("client.qa")
    public static short field1183 = 320;

    @ObfuscatedName("client.qo")
    public static short field1167 = 1;

    @ObfuscatedName("client.qn")
    public static short field1185 = 32767;

    @ObfuscatedName("client.qp")
    public static short field1186 = 1;

    @ObfuscatedName("client.qm")
    public static short field1187 = 32767;

    @ObfuscatedName("client.qf")
    public static int field1188 = 0;

    @ObfuscatedName("client.qt")
    public static int field1189 = 0;

    @ObfuscatedName("client.qe")
    public static int field1190 = 0;

    @ObfuscatedName("client.qu")
    public static int field946 = 0;

    @ObfuscatedName("client.qw")
    public static int field1123 = 0;

    @ObfuscatedName("client.qg")
    public static int field1193 = 0;

    @ObfuscatedName("client.qy")
    public static int field1194 = 0;

    @ObfuscatedName("client.qv")
    public static class66[] field1195 = new class66[400];

    @ObfuscatedName("client.qb")
    public static class196 field1030 = new class196();

    @ObfuscatedName("client.qi")
    public static int field1197 = 0;

    @ObfuscatedName("client.qh")
    public static class71[] field1119 = new class71[400];

    @ObfuscatedName("client.qs")
    public static class214 field1199 = new class214();

    @ObfuscatedName("client.qz")
    public static int field1039 = -1;

    @ObfuscatedName("client.qj")
    public static int field1201 = -1;

    @ObfuscatedName("client.ri")
    public static class17[] field1145 = new class17[8];

    @ObfuscatedName("client.rl")
    public static long field1121 = -1L;

    @ObfuscatedName("client.rp")
    public static long field1204 = -1L;

    @ObfuscatedName("client.rk")
    public static final class74 field1205 = new class74();

    @ObfuscatedName("client.rw")
    public static int[] field1206 = new int[50];

    @ObfuscatedName("client.rx")
    public static int[] field1054 = new int[50];

    @ObfuscatedName("az.eh(I)Lkr;")
    public static class289 method566() {
        return Statics.field601;
    }

    @ObfuscatedName("client.ad(I)V")
    public final void method794() {
    }

    public final void init() {
        if (!this.method773()) {
            return;
        }
        class275[] var1 = class275.method3678();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class275 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3727);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3727)) {
                    case 1:
                        Statics.field444 = var4;
                        break;
                    case 2:
                        field1168 = Integer.parseInt(var4);
                    case 3:
                    case 4:
                    case 5:
                    default:
                        break;
                    case 6:
                        int var5 = Integer.parseInt(var4);
                        class232[] var6 = class232.method470();
                        int var7 = 0;
                        class232 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class232 var8 = var6[var7];
                            if (var8.field3197 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field2333 = var9;
                        break;
                    case 7:
                        Statics.field1063 = var4;
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class89.field1414)) {
                        }
                        break;
                    case 9:
                        Statics.field2619 = Integer.parseInt(var4);
                        break;
                    case 10:
                        Statics.field481 = Integer.parseInt(var4);
                        break;
                    case 11:
                        field932 = Integer.parseInt(var4);
                        break;
                    case 12:
                        class233[] var10 = new class233[] { class233.field3200, class233.field3202, class233.field3205, class233.field3203, class233.field3199, class233.field3201 };
                        Statics.field1208 = (class233) class169.method2353(var10, Integer.parseInt(var4));
                        if (Statics.field1208 == class233.field3200) {
                            Statics.field929 = class290.field3863;
                        } else {
                            Statics.field929 = class290.field3862;
                        }
                        break;
                    case 13:
                        field927 = Integer.parseInt(var4);
                        break;
                    case 14:
                        field1203 = Integer.parseInt(var4);
                        break;
                    case 15:
                        if (var4.equalsIgnoreCase(class89.field1414)) {
                            field930 = true;
                        } else {
                            field930 = false;
                        }
                }
            }
        }
        class140.field2095 = false;
        field931 = false;
        Statics.field2362 = this.getCodeBase().getHost();
        String var11 = Statics.field2333.field3195;
        byte var12 = 0;
        try {
            Statics.field2446 = 17;
            Statics.field515 = var12;
            try {
                Statics.field2264 = System.getProperty("os.name");
            } catch (Exception var51) {
                Statics.field2264 = "Unknown";
            }
            Statics.field2262 = Statics.field2264.toLowerCase();
            try {
                Statics.field1384 = System.getProperty("user.home");
                if (Statics.field1384 != null) {
                    Statics.field1384 = Statics.field1384 + "/";
                }
            } catch (Exception var50) {
            }
            try {
                if (Statics.field2262.startsWith("win")) {
                    if (Statics.field1384 == null) {
                        Statics.field1384 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1384 == null) {
                    Statics.field1384 = System.getenv("HOME");
                }
                if (Statics.field1384 != null) {
                    Statics.field1384 = Statics.field1384 + "/";
                }
            } catch (Exception var49) {
            }
            if (Statics.field1384 == null) {
                Statics.field1384 = "~/";
            }
            Statics.field534 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1384, "/tmp/", "" };
            Statics.field2154 = new String[] { ".jagex_cache_" + Statics.field515, ".file_store_" + Statics.field515 };
            int var16 = 0;
            label244: while (var16 < 4) {
                String var17 = var16 == 0 ? "" : "" + var16;
                Statics.field2258 = new File(Statics.field1384, "jagex_cl_oldschool_" + var11 + var17 + ".dat");
                String var18 = null;
                String var19 = null;
                boolean var20 = false;
                if (Statics.field2258.exists()) {
                    try {
                        class125 var21 = new class125(Statics.field2258, "rw", 10000L);
                        class174 var22 = new class174((int) var21.method2155());
                        while (var22.field2399 < var22.field2405.length) {
                            int var23 = var21.method2143(var22.field2405, var22.field2399, var22.field2405.length - var22.field2399);
                            if (var23 == -1) {
                                throw new IOException();
                            }
                            var22.field2399 += var23;
                        }
                        var22.field2399 = 0;
                        int var24 = var22.method3061();
                        if (var24 < 1 || var24 > 3) {
                            throw new IOException("" + var24);
                        }
                        int var25 = 0;
                        if (var24 > 1) {
                            var25 = var22.method3061();
                        }
                        if (var24 <= 2) {
                            var18 = var22.method2889();
                            if (var25 == 1) {
                                var19 = var22.method2889();
                            }
                        } else {
                            var18 = var22.method2890();
                            if (var25 == 1) {
                                var19 = var22.method2890();
                            }
                        }
                        var21.method2157();
                    } catch (IOException var53) {
                        var53.printStackTrace();
                    }
                    if (var18 != null) {
                        File var27 = new File(var18);
                        if (!var27.exists()) {
                            var18 = null;
                        }
                    }
                    if (var18 != null) {
                        File var28 = new File(var18, "test.dat");
                        if (!class156.method991(var28, true)) {
                            var18 = null;
                        }
                    }
                }
                if (var18 == null && var16 == 0) {
                    label220: for (int var29 = 0; var29 < Statics.field2154.length; var29++) {
                        for (int var30 = 0; var30 < Statics.field534.length; var30++) {
                            File var31 = new File(Statics.field534[var30] + Statics.field2154[var29] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var31.exists() && class156.method991(new File(var31, "test.dat"), true)) {
                                var18 = var31.toString();
                                var20 = true;
                                break label220;
                            }
                        }
                    }
                }
                if (var18 == null) {
                    var18 = Statics.field1384 + File.separatorChar + "jagexcache" + var17 + File.separatorChar + "oldschool" + File.separatorChar + var11 + File.separatorChar;
                    var20 = true;
                }
                if (var19 != null) {
                    File var32 = new File(var19);
                    File var33 = new File(var18);
                    try {
                        File[] var34 = var32.listFiles();
                        File[] var35 = var34;
                        for (int var36 = 0; var36 < var35.length; var36++) {
                            File var37 = var35[var36];
                            File var38 = new File(var33, var37.getName());
                            boolean var39 = var37.renameTo(var38);
                            if (!var39) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var52) {
                        var52.printStackTrace();
                    }
                    var20 = true;
                }
                if (var20) {
                    class156.method1009(new File(var18), (File) null);
                }
                File var41 = new File(var18);
                Statics.field2159 = var41;
                if (!Statics.field2159.exists()) {
                    Statics.field2159.mkdirs();
                }
                File[] var42 = Statics.field2159.listFiles();
                if (var42 == null) {
                    break;
                }
                File[] var43 = var42;
                int var44 = 0;
                while (true) {
                    if (var44 >= var43.length) {
                        break label244;
                    }
                    File var45 = var43[var44];
                    if (!class156.method991(var45, false)) {
                        var16++;
                        break;
                    }
                    var44++;
                }
            }
            File var46 = Statics.field2159;
            Statics.field2269 = var46;
            if (!Statics.field2269.exists()) {
                throw new RuntimeException("");
            }
            class158.field2272 = true;
            class156.method1068();
            class156.field2260 = new class124(new class125(class158.method500("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class156.field2263 = new class124(new class125(class158.method500("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field33 = new class124[Statics.field2446];
            for (int var47 = 0; var47 < Statics.field2446; var47++) {
                Statics.field33[var47] = new class124(new class125(class158.method500("main_file_cache.idx" + var47), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var54) {
            class153.method2658((String) null, var54);
        }
        Statics.field3633 = this;
        this.method786(765, 503, 148);
    }

    @ObfuscatedName("client.ak(I)V")
    public final void method785() {
        Statics.field482 = field1203 == 0 ? 43594 : field1168 + 40000;
        Statics.field530 = field1203 == 0 ? 443 : field1168 + 50000;
        Statics.field1531 = Statics.field482;
        Statics.field324 = class215.field2639;
        Statics.field2628 = class215.field2632;
        Statics.field1399 = class215.field2634;
        Statics.field2621 = class215.field2635;
        this.method810();
        this.method766();
        Statics.field17 = this.method804();
        Statics.field862 = new class161(255, class156.field2260, class156.field2263, 500000);
        class125 var1 = null;
        class82 var2 = new class82();
        try {
            var1 = class156.method150("", Statics.field1208.field3204, false);
            byte[] var3 = new byte[(int) var1.method2155()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method2143(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class82(new class174(var3));
        } catch (Exception var14) {
        }
        try {
            if (var1 != null) {
                var1.method2157();
            }
        } catch (Exception var13) {
        }
        Statics.field248 = var2;
        this.method800();
        String var10 = Statics.field736;
        class57.field700 = this;
        class57.field706 = var10;
        if (field1203 != 0) {
            field942 = true;
        }
        int var11 = Statics.field248.field1326;
        field1141 = 0L;
        if (var11 >= 2) {
            field1048 = true;
        } else {
            field1048 = false;
        }
        int var12 = field1048 ? 2 : 1;
        if (var12 == 1) {
            Statics.field3633.method760(765, 503);
        } else {
            Statics.field3633.method760(7680, 2160);
        }
        if (field934 >= 25) {
            method19();
        }
    }

    @ObfuscatedName("client.aq(I)V")
    public final void method816() {
        field936++;
        this.method1078();
        while (true) {
            class194 var1 = class237.field3248;
            class234 var2;
            synchronized (class237.field3248) {
                var2 = (class234) class237.field3243.method3306();
            }
            if (var2 == null) {
                try {
                    if (class204.field2509 == 1) {
                        int var4 = Statics.field2510.method3387();
                        if (var4 > 0 && Statics.field2510.method3393()) {
                            int var5 = var4 - Statics.field2518;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2510.method3411(var5);
                        } else {
                            Statics.field2510.method3443();
                            Statics.field2510.method3390();
                            if (Statics.field786 == null) {
                                class204.field2509 = 0;
                            } else {
                                class204.field2509 = 2;
                            }
                            Statics.field2844 = null;
                            Statics.field336 = null;
                        }
                    }
                } catch (Exception var12) {
                    var12.printStackTrace();
                    Statics.field2510.method3443();
                    class204.field2509 = 0;
                    Statics.field2844 = null;
                    Statics.field336 = null;
                    Statics.field786 = null;
                }
                method59();
                class51.method309();
                class60 var7 = class60.field754;
                synchronized (class60.field754) {
                    class60.field755 = class60.field745;
                    class60.field749 = class60.field746;
                    class60.field750 = class60.field747;
                    class60.field743 = class60.field763;
                    class60.field748 = class60.field752;
                    class60.field757 = class60.field753;
                    class60.field758 = class60.field761;
                    class60.field763 = 0;
                }
                if (Statics.field17 != null) {
                    int var9 = Statics.field17.method651();
                    field1126 = var9;
                }
                if (field934 == 0) {
                    method941();
                    class59.method1628();
                } else if (field934 == 5) {
                    class93.method4274(this);
                    method941();
                    class59.method1628();
                } else if (field934 == 10 || field934 == 11) {
                    class93.method4274(this);
                } else if (field934 == 20) {
                    class93.method4274(this);
                    this.method1081();
                } else if (field934 == 25) {
                    method106();
                }
                if (field934 == 30) {
                    this.method1082();
                } else if (field934 == 40 || field934 == 45) {
                    this.method1081();
                }
                return;
            }
            var2.field3211.method3873(var2.field3210, (int) var2.field2473, var2.field3216, false);
        }
    }

    @ObfuscatedName("client.ax(ZB)V")
    public final void method787(boolean arg0) {
        boolean var2;
        label160: {
            try {
                if (class204.field2509 == 2) {
                    if (Statics.field2844 == null) {
                        Statics.field2844 = class210.method3569(Statics.field786, Statics.field2512, Statics.field2513);
                        if (Statics.field2844 == null) {
                            var2 = false;
                            break label160;
                        }
                    }
                    if (Statics.field336 == null) {
                        Statics.field336 = new class113(Statics.field2508, Statics.field2515);
                    }
                    if (Statics.field2510.method3388(Statics.field2844, Statics.field2507, Statics.field336, 22050)) {
                        Statics.field2510.method3385();
                        Statics.field2510.method3411(Statics.field2514);
                        Statics.field2510.method3391(Statics.field2844, Statics.field2516);
                        class204.field2509 = 0;
                        Statics.field2844 = null;
                        Statics.field336 = null;
                        Statics.field786 = null;
                        var2 = true;
                        break label160;
                    }
                }
            } catch (Exception var12) {
                var12.printStackTrace();
                Statics.field2510.method3443();
                class204.field2509 = 0;
                Statics.field2844 = null;
                Statics.field336 = null;
                Statics.field786 = null;
            }
            var2 = false;
        }
        if (var2 && field1015 && Statics.field2066 != null) {
            Statics.field2066.method1864();
        }
        if ((field934 == 10 || field934 == 20 || field934 == 30) && field1141 != 0L && class176.method2862() > field1141) {
            int var5 = field1048 ? 2 : 1;
            field1141 = 0L;
            if (var5 >= 2) {
                field1048 = true;
            } else {
                field1048 = false;
            }
            int var6 = field1048 ? 2 : 1;
            if (var6 == 1) {
                Statics.field3633.method760(765, 503);
            } else {
                Statics.field3633.method760(7680, 2160);
            }
            if (field934 >= 25) {
                method19();
            }
        }
        if (arg0) {
            for (int var7 = 0; var7 < 100; var7++) {
                field1133[var7] = true;
            }
        }
        if (field934 == 0) {
            this.method844(class93.field1464, class93.field1465, arg0);
        } else if (field934 == 5) {
            class93.method1577(Statics.field1323, Statics.field619, Statics.field531, arg0);
        } else if (field934 == 10 || field934 == 11) {
            class93.method1577(Statics.field1323, Statics.field619, Statics.field531, arg0);
        } else if (field934 == 20) {
            class93.method1577(Statics.field1323, Statics.field619, Statics.field531, arg0);
        } else if (field934 == 25) {
            if (field1105 == 1) {
                if (field1084 > field983) {
                    field983 = field1084;
                }
                int var8 = (field983 * 50 - field1084 * 50) / field983;
                method7(class226.field2870 + class89.field1423 + class89.field1417 + var8 + "%" + class89.field1418, false);
            } else if (field1105 == 2) {
                if (field984 > field985) {
                    field985 = field984;
                }
                int var9 = (field985 * 50 - field984 * 50) / field985 + 50;
                method7(class226.field2870 + class89.field1423 + class89.field1417 + var9 + "%" + class89.field1418, false);
            } else {
                method7(class226.field2870, false);
            }
        } else if (field934 == 30) {
            this.method1085();
        } else if (field934 == 40) {
            method7(class226.field2871 + class89.field1423 + class226.field2872, false);
        } else if (field934 == 45) {
            method7(class226.field2998, false);
        }
        if (field934 == 30 && field1140 == 0 && !arg0) {
            for (int var10 = 0; var10 < field1062; var10++) {
                if (field1134[var10]) {
                    Statics.field603.method751(field1058[var10], field1137[var10], field1138[var10], field1139[var10]);
                    field1134[var10] = false;
                }
            }
        } else if (field934 > 0) {
            Statics.field603.method744(0, 0);
            for (int var11 = 0; var11 < field1062; var11++) {
                field1134[var11] = false;
            }
        }
    }

    @ObfuscatedName("client.ac(I)V")
    public final void method788() {
        if (Statics.field874.method1657()) {
            Statics.field874.method1655();
        }
        if (Statics.field394 != null) {
            Statics.field394.field875 = false;
        }
        Statics.field394 = null;
        if (Statics.field3329 != null) {
            Statics.field3329.method2711();
            Statics.field3329 = null;
        }
        if (class51.field657 != null) {
            class51 var1 = class51.field657;
            synchronized (class51.field657) {
                class51.field657 = null;
            }
        }
        if (class60.field754 != null) {
            class60 var3 = class60.field754;
            synchronized (class60.field754) {
                class60.field754 = null;
            }
        }
        Statics.field17 = null;
        if (Statics.field2066 != null) {
            Statics.field2066.method1865();
        }
        if (Statics.field756 != null) {
            Statics.field756.method1865();
        }
        class239.method3764();
        Object var5 = class237.field3245;
        synchronized (class237.field3245) {
            if (class237.field3244 != 0) {
                class237.field3244 = 1;
                try {
                    class237.field3245.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        class156.method3724();
    }

    @ObfuscatedName("du.eg(II)V")
    public static void method2180(int arg0) {
        if (field934 == arg0) {
            return;
        }
        if (field934 == 0) {
            Statics.field3633.method771();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field995 = 0;
            field959 = 0;
            field960 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2641 != null) {
            Statics.field2641.method2711();
            Statics.field2641 = null;
        }
        if (field934 == 25) {
            field1105 = 0;
            field1084 = 0;
            field983 = 1;
            field984 = 0;
            field985 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            Statics.method2633(Statics.field2195, Statics.field323, true, 0);
        } else if (arg0 == 20) {
            Statics.method2633(Statics.field2195, Statics.field323, true, field934 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            Statics.method2633(Statics.field2195, Statics.field323, false, 4);
        } else {
            class93.method1917();
        }
        field934 = arg0;
    }

    @ObfuscatedName("client.ff(I)V")
    public void method1078() {
        if (field934 != 1000) {
            boolean var1 = class239.method1645();
            if (!var1) {
                this.method1083();
            }
        }
    }

    @ObfuscatedName("client.fn(I)V")
    public void method1083() {
        if (class239.field3278 >= 4) {
            this.method824("js5crc");
            field934 = 1000;
            return;
        }
        if (class239.field3279 >= 4) {
            if (field934 <= 5) {
                this.method824("js5io");
                field934 = 1000;
                return;
            }
            field956 = 3000;
            class239.field3279 = 3;
        }
        if (--field956 + 1 > 0) {
            return;
        }
        try {
            if (field955 == 0) {
                Statics.field1431 = Statics.field721.method2672(Statics.field2362, Statics.field1531);
                field955++;
            }
            if (field955 == 1) {
                if (Statics.field1431.field2244 == 2) {
                    this.method1080(-1);
                    return;
                }
                if (Statics.field1431.field2244 == 1) {
                    field955++;
                }
            }
            if (field955 == 2) {
                Statics.field1777 = new class160((Socket) Statics.field1431.field2240, Statics.field721);
                class174 var1 = new class174(5);
                var1.method2865(15);
                var1.method2868(148);
                Statics.field1777.method2723(var1.field2405, 0, 5);
                field955++;
                Statics.field273 = class176.method2862();
            }
            if (field955 == 3) {
                if (field934 <= 5 || Statics.field1777.method2710() > 0) {
                    int var2 = Statics.field1777.method2716();
                    if (var2 != 0) {
                        this.method1080(var2);
                        return;
                    }
                    field955++;
                } else if (class176.method2862() - Statics.field273 > 30000L) {
                    this.method1080(-2);
                    return;
                }
            }
            if (field955 == 4) {
                class160 var3 = Statics.field1777;
                boolean var4 = field934 > 20;
                if (Statics.field3273 != null) {
                    try {
                        Statics.field3273.method2711();
                    } catch (Exception var14) {
                    }
                    Statics.field3273 = null;
                }
                Statics.field3273 = var3;
                class239.method2849(var4);
                class239.field3265.field2399 = 0;
                Statics.field238 = null;
                Statics.field560 = null;
                class239.field3274 = 0;
                while (true) {
                    class235 var6 = (class235) class239.field3276.method3252();
                    if (var6 == null) {
                        while (true) {
                            class235 var7 = (class235) class239.field3271.method3252();
                            if (var7 == null) {
                                if (class239.field3277 != 0) {
                                    try {
                                        class174 var8 = new class174(4);
                                        var8.method2865(4);
                                        var8.method2865(class239.field3277);
                                        var8.method2990(0);
                                        Statics.field3273.method2723(var8.field2405, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3273.method2711();
                                        } catch (Exception var12) {
                                        }
                                        class239.field3279++;
                                        Statics.field3273 = null;
                                    }
                                }
                                class239.field3262 = 0;
                                Statics.field3264 = class176.method2862();
                                Statics.field1431 = null;
                                Statics.field1777 = null;
                                field955 = 0;
                                field957 = 0;
                                return;
                            }
                            class239.field3268.method3186(var7);
                            class239.field3269.method3248(var7, var7.field2473);
                            class239.field3270++;
                            class239.field3272--;
                        }
                    }
                    class239.field3261.method3248(var6, var6.field2473);
                    class239.field3267++;
                    class239.field3266--;
                }
            }
        } catch (IOException var15) {
            this.method1080(-3);
        }
    }

    @ObfuscatedName("client.fb(II)V")
    public void method1080(int arg0) {
        Statics.field1431 = null;
        Statics.field1777 = null;
        field955 = 0;
        if (Statics.field482 == Statics.field1531) {
            Statics.field1531 = Statics.field530;
        } else {
            Statics.field1531 = Statics.field482;
        }
        field957++;
        if (field957 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field934 <= 5) {
                this.method824("js5connect_full");
                field934 = 1000;
            } else {
                field956 = 3000;
            }
        } else if (field957 >= 2 && arg0 == 6) {
            this.method824("js5connect_outofdate");
            field934 = 1000;
        } else if (field957 >= 4) {
            if (field934 <= 5) {
                this.method824("js5connect");
                field934 = 1000;
            } else {
                field956 = 3000;
            }
        }
    }

    @ObfuscatedName("bg.fs(B)V")
    public static void method941() {
        if (field1192 == 0) {
            Statics.field15 = new class140(4, 104, 104, class62.field782);
            for (int var0 = 0; var0 < 4; var0++) {
                field987[var0] = new class162(104, 104);
            }
            Statics.field759 = new class286(512, 512);
            class93.field1465 = class226.field2873;
            class93.field1464 = 5;
            field1192 = 20;
        } else if (field1192 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class137.field2046[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class140.method2477(var1, 500, 800, 512, 334);
            class93.field1465 = class226.field2874;
            class93.field1464 = 10;
            field1192 = 30;
        } else if (field1192 == 30) {
            Statics.field612 = method702(0, false, true, true);
            Statics.field3628 = method702(1, false, true, true);
            Statics.field1447 = method702(2, true, false, true);
            Statics.field260 = method702(3, false, true, true);
            Statics.field1546 = method702(4, false, true, true);
            Statics.field2158 = method702(5, true, true, true);
            Statics.field606 = method702(6, true, true, false);
            Statics.field9 = method702(7, false, true, true);
            Statics.field323 = method702(8, false, true, true);
            Statics.field1408 = method702(9, false, true, true);
            Statics.field2195 = method702(10, false, true, true);
            Statics.field311 = method702(11, false, true, true);
            Statics.field2353 = method702(12, false, true, true);
            Statics.field694 = method702(13, true, false, true);
            Statics.field275 = method702(14, false, true, false);
            Statics.field425 = method702(15, false, true, true);
            Statics.field784 = method702(16, false, true, false);
            class93.field1465 = class226.field2875;
            class93.field1464 = 20;
            field1192 = 40;
        } else if (field1192 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field612.method3870() * 4 / 100;
            int var8 = var7 + Statics.field3628.method3870() * 4 / 100;
            int var9 = var8 + Statics.field1447.method3870() * 2 / 100;
            int var10 = var9 + Statics.field260.method3870() * 2 / 100;
            int var11 = var10 + Statics.field1546.method3870() * 6 / 100;
            int var12 = var11 + Statics.field2158.method3870() * 4 / 100;
            int var13 = var12 + Statics.field606.method3870() * 2 / 100;
            int var14 = var13 + Statics.field9.method3870() * 58 / 100;
            int var15 = var14 + Statics.field323.method3870() * 2 / 100;
            int var16 = var15 + Statics.field1408.method3870() * 2 / 100;
            int var17 = var16 + Statics.field2195.method3870() * 2 / 100;
            int var18 = var17 + Statics.field311.method3870() * 2 / 100;
            int var19 = var18 + Statics.field2353.method3870() * 2 / 100;
            int var20 = var19 + Statics.field694.method3870() * 2 / 100;
            int var21 = var20 + Statics.field275.method3870() * 2 / 100;
            int var22 = var21 + Statics.field425.method3870() * 2 / 100;
            int var23 = var22 + Statics.field784.method3870() * 2 / 100;
            if (var23 == 100) {
                class93.field1465 = class226.field2877;
                class93.field1464 = 30;
                field1192 = 45;
            } else {
                if (var23 != 0) {
                    class93.field1465 = class226.field2876 + var23 + "%";
                }
                class93.field1464 = 30;
            }
        } else if (field1192 == 45) {
            boolean var24 = !field931;
            Statics.field3212 = 22050;
            Statics.field1665 = var24;
            Statics.field1648 = 2;
            class205 var25 = new class205();
            var25.method3394(9, 128);
            Statics.field2066 = class110.method158(Statics.field721, 0, 22050);
            Statics.field2066.method1861(var25);
            class204.method311(Statics.field425, Statics.field275, Statics.field1546, var25);
            Statics.field756 = class110.method158(Statics.field721, 1, 2048);
            Statics.field329 = new class103();
            Statics.field756.method1861(Statics.field329);
            Statics.field2897 = new class117(22050, Statics.field3212);
            class93.field1465 = class226.field3118;
            class93.field1464 = 35;
            field1192 = 50;
            Statics.field314 = new class263(Statics.field323, Statics.field694);
        } else if (field1192 == 50) {
            class262[] var26 = new class262[] { class262.field3630, class262.field3629, class262.field3625, class262.field3635, class262.field3636, class262.field3634 };
            int var27 = var26.length;
            class263 var28 = Statics.field314;
            class262[] var29 = new class262[] { class262.field3630, class262.field3629, class262.field3625, class262.field3635, class262.field3636, class262.field3634 };
            field1135 = var28.method4373(var29);
            if (field1135.size() < var27) {
                class93.field1465 = class226.field2879 + field1135.size() * 100 / var27 + "%";
                class93.field1464 = 40;
            } else {
                Statics.field619 = (class264) field1135.get(class262.field3635);
                Statics.field531 = (class264) field1135.get(class262.field3634);
                Statics.field1323 = (class264) field1135.get(class262.field3625);
                Statics.field867 = new class292(true);
                class93.field1465 = class226.field2880;
                class93.field1464 = 40;
                field1192 = 60;
            }
        } else if (field1192 == 60) {
            int var30 = class93.method2646(Statics.field2195, Statics.field323);
            int var31 = class93.method1647();
            if (var30 < var31) {
                class93.field1465 = class226.field2881 + var30 * 100 / var31 + "%";
                class93.field1464 = 50;
            } else {
                class93.field1465 = class226.field3069;
                class93.field1464 = 50;
                method2180(5);
                field1192 = 70;
            }
        } else if (field1192 == 70) {
            if (Statics.field1447.method3765()) {
                class260.method1578(Statics.field1447);
                class247.method22(Statics.field1447);
                class238 var32 = Statics.field1447;
                class238 var33 = Statics.field9;
                Statics.field3370 = var32;
                Statics.field3358 = var33;
                Statics.field3360 = Statics.field3370.method3787(3);
                class256.method3953(Statics.field1447, Statics.field9, field931);
                class238 var34 = Statics.field1447;
                class238 var35 = Statics.field9;
                Statics.field3568 = var34;
                Statics.field3585 = var35;
                class238 var36 = Statics.field1447;
                Statics.field3407 = var36;
                class257.method2850(Statics.field1447, Statics.field9, field930, Statics.field619);
                class261.method2794(Statics.field1447, Statics.field612, Statics.field3628);
                class238 var37 = Statics.field1447;
                class238 var38 = Statics.field9;
                Statics.field3348 = var37;
                Statics.field3339 = var38;
                class238 var39 = Statics.field1447;
                Statics.field3392 = var39;
                class238 var40 = Statics.field1447;
                Statics.field3293 = var40;
                Statics.field3290 = Statics.field3293.method3787(16);
                class238 var41 = Statics.field260;
                class238 var42 = Statics.field9;
                class238 var43 = Statics.field323;
                class238 var44 = Statics.field694;
                Statics.field2647 = var41;
                Statics.field2751 = var42;
                Statics.field2310 = var43;
                Statics.field1877 = var44;
                Statics.field628 = new class217[Statics.field2647.method3790()][];
                Statics.field2238 = new boolean[Statics.field2647.method3790()];
                class238 var45 = Statics.field1447;
                Statics.field3286 = var45;
                class254.method3081(Statics.field1447);
                class244.method1885(Statics.field1447);
                class245.method3080(Statics.field1447);
                class238 var46 = Statics.field1447;
                Statics.field3400 = var46;
                Statics.field874 = new class98();
                class238 var47 = Statics.field1447;
                class238 var48 = Statics.field323;
                class238 var49 = Statics.field694;
                Statics.field3442 = var47;
                Statics.field3420 = var48;
                Statics.field2640 = var49;
                class249.method1069(Statics.field1447, Statics.field323);
                class243.method232(Statics.field1447, Statics.field323);
                class93.field1465 = class226.field3096;
                class93.field1464 = 60;
                field1192 = 80;
            } else {
                class93.field1465 = class226.field2920 + Statics.field1447.method3882() + "%";
                class93.field1464 = 60;
            }
        } else if (field1192 == 80) {
            int var50 = 0;
            if (Statics.field330 == null) {
                Statics.field330 = class287.method51(Statics.field323, "compass", "");
            } else {
                var50++;
            }
            if (Statics.field453 == null) {
                Statics.field453 = class287.method51(Statics.field323, "mapedge", "");
            } else {
                var50++;
            }
            if (Statics.field247 == null) {
                Statics.field247 = class287.method1008(Statics.field323, "mapscene", "");
            } else {
                var50++;
            }
            if (Statics.field2443 == null) {
                Statics.field2443 = class287.method9(Statics.field323, "headicons_pk", "");
            } else {
                var50++;
            }
            if (Statics.field821 == null) {
                Statics.field821 = class287.method9(Statics.field323, "headicons_prayer", "");
            } else {
                var50++;
            }
            if (Statics.field602 == null) {
                Statics.field602 = class287.method9(Statics.field323, "headicons_hint", "");
            } else {
                var50++;
            }
            if (Statics.field459 == null) {
                Statics.field459 = class287.method9(Statics.field323, "mapmarker", "");
            } else {
                var50++;
            }
            if (Statics.field3259 == null) {
                Statics.field3259 = class287.method9(Statics.field323, "cross", "");
            } else {
                var50++;
            }
            if (Statics.field378 == null) {
                Statics.field378 = class287.method9(Statics.field323, "mapdots", "");
            } else {
                var50++;
            }
            if (Statics.field3640 == null) {
                Statics.field3640 = class287.method1008(Statics.field323, "scrollbar", "");
            } else {
                var50++;
            }
            if (Statics.field347 == null) {
                Statics.field347 = class287.method1008(Statics.field323, "mod_icons", "");
            } else {
                var50++;
            }
            if (var50 < 11) {
                class93.field1465 = class226.field2885 + var50 * 100 / 12 + "%";
                class93.field1464 = 70;
            } else {
                Statics.field3664 = Statics.field347;
                Statics.field453.method4660();
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 21.0D) - 10;
                int var53 = (int) (Math.random() * 21.0D) - 10;
                int var54 = (int) (Math.random() * 41.0D) - 20;
                Statics.field247[0].method4641(var51 + var54, var52 + var54, var53 + var54);
                class93.field1465 = class226.field2898;
                class93.field1464 = 70;
                field1192 = 90;
            }
        } else if (field1192 == 90) {
            if (Statics.field1408.method3765()) {
                class126 var55 = new class126(Statics.field1408, Statics.field323, 20, 0.8D, field931 ? 64 : 128);
                class137.method2383(var55);
                class137.method2363(0.8D);
                class93.field1465 = class226.field2888;
                class93.field1464 = 90;
                field1192 = 110;
            } else {
                class93.field1465 = class226.field2887 + Statics.field1408.method3882() + "%";
                class93.field1464 = 90;
            }
        } else if (field1192 == 110) {
            Statics.field394 = new class72();
            Statics.field721.method2673(Statics.field394, 10);
            class93.field1465 = class226.field2889;
            class93.field1464 = 94;
            field1192 = 120;
        } else if (field1192 == 120) {
            if (Statics.field2195.method3788("huffman", "")) {
                class166 var56 = new class166(Statics.field2195.method3799("huffman", ""));
                Statics.field3666 = var56;
                class93.field1465 = class226.field2891;
                class93.field1464 = 96;
                field1192 = 130;
            } else {
                class93.field1465 = class226.field2890 + "%";
                class93.field1464 = 96;
            }
        } else if (field1192 == 130) {
            if (!Statics.field260.method3765()) {
                class93.field1465 = class226.field3060 + Statics.field260.method3882() * 4 / 5 + "%";
                class93.field1464 = 100;
            } else if (!Statics.field2353.method3765()) {
                class93.field1465 = class226.field3060 + (80 + Statics.field2353.method3882() / 6) + "%";
                class93.field1464 = 100;
            } else if (Statics.field694.method3765()) {
                class93.field1465 = class226.field2893;
                class93.field1464 = 98;
                field1192 = 140;
            } else {
                class93.field1465 = class226.field3060 + (96 + Statics.field694.method3882() / 50) + "%";
                class93.field1464 = 100;
            }
        } else if (field1192 == 140) {
            if (Statics.field784.method3789(class41.field565.field567)) {
                if (Statics.field601 == null) {
                    Statics.field601 = new class289();
                    Statics.field601.method4915(Statics.field784, Statics.field1323, field1135, Statics.field247);
                }
                int var57 = Statics.field601.method4797();
                if (var57 < 100) {
                    class93.field1465 = class226.field2894 + (var57 * 9 / 10 + 10) + "%";
                } else {
                    class93.field1465 = class226.field2895;
                    class93.field1464 = 100;
                    field1192 = 150;
                }
            } else {
                class93.field1465 = class226.field2894 + Statics.field784.method3772(class41.field565.field567) / 10 + "%";
            }
        } else if (field1192 == 150) {
            method2180(10);
        }
    }

    @ObfuscatedName("bc.fv(IZZZI)Lix;")
    public static class238 method702(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class161 var4 = null;
        if (class156.field2260 != null) {
            var4 = new class161(arg0, class156.field2260, Statics.field33[arg0], 1000000);
        }
        return new class238(var4, Statics.field862, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ft(B)V")
    public final void method1081() {
        try {
            if (field995 == 0) {
                if (Statics.field3329 != null) {
                    Statics.field3329.method2711();
                    Statics.field3329 = null;
                }
                Statics.field1158 = null;
                field980 = false;
                field959 = 0;
                field995 = 1;
            }
            if (field995 == 1) {
                if (Statics.field1158 == null) {
                    Statics.field1158 = Statics.field721.method2672(Statics.field2362, Statics.field1531);
                }
                if (Statics.field1158.field2244 == 2) {
                    throw new IOException();
                }
                if (Statics.field1158.field2244 == 1) {
                    Statics.field3329 = new class160((Socket) Statics.field1158.field2240, Statics.field721);
                    Statics.field1158 = null;
                    field995 = 2;
                }
            }
            if (field995 == 2) {
                field969.field2399 = 0;
                field969.method2865(14);
                Statics.field3329.method2723(field969.field2405, 0, 1);
                field971.field2399 = 0;
                field995 = 3;
            }
            if (field995 == 3) {
                if (Statics.field2066 != null) {
                    Statics.field2066.method1883();
                }
                if (Statics.field756 != null) {
                    Statics.field756.method1883();
                }
                int var1 = Statics.field3329.method2716();
                if (Statics.field2066 != null) {
                    Statics.field2066.method1883();
                }
                if (Statics.field756 != null) {
                    Statics.field756.method1883();
                }
                if (var1 != 0) {
                    Statics.method78(var1);
                    return;
                }
                field971.field2399 = 0;
                field995 = 4;
            }
            if (field995 == 4) {
                if (field971.field2399 < 8) {
                    int var2 = Statics.field3329.method2710();
                    if (var2 > 8 - field971.field2399) {
                        var2 = 8 - field971.field2399;
                    }
                    if (var2 > 0) {
                        Statics.field3329.method2712(field971.field2405, field971.field2399, var2);
                        field971.field2399 += var2;
                    }
                }
                if (field971.field2399 == 8) {
                    field971.field2399 = 0;
                    Statics.field369 = field971.method2910();
                    field995 = 5;
                }
            }
            if (field995 == 5) {
                int[] var3 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field369 >> 32), (int) (Statics.field369 & 0xFFFFFFFFFFFFFFFFL) };
                field969.field2399 = 0;
                field969.method2865(1);
                field969.method2865(class93.field1473.method17());
                field969.method2868(var3[0]);
                field969.method2868(var3[1]);
                field969.method2868(var3[2]);
                field969.method2868(var3[3]);
                switch(class93.field1473.field2221) {
                    case 0:
                    case 1:
                        field969.method2867(Statics.field1560);
                        field969.field2399 += 5;
                        break;
                    case 2:
                        field969.method2868((Integer) Statics.field248.field1331.get(class271.method26(class93.field1472)));
                        field969.field2399 += 4;
                        break;
                    case 3:
                        field969.field2399 += 8;
                }
                field969.method2871(class93.field1475);
                field969.method2900(class91.field1438, class91.field1436);
                field970.field2399 = 0;
                if (field934 == 40) {
                    field970.method2865(18);
                } else {
                    field970.method2865(16);
                }
                field970.method2990(0);
                int var4 = field970.field2399;
                field970.method2868(148);
                field970.method2874(field969.field2405, 0, field969.field2399);
                int var5 = field970.field2399;
                field970.method2871(class93.field1472);
                field970.method2865((field1048 ? 1 : 0) << 1 | (field931 ? 1 : 0));
                field970.method2990(Statics.field618);
                field970.method2990(Statics.field2309);
                method1043(field970);
                field970.method2871(Statics.field1063);
                field970.method2868(Statics.field481);
                class174 var6 = new class174(Statics.field867.method4987());
                Statics.field867.method4989(var6);
                field970.method2874(var6.field2405, 0, var6.field2405.length);
                field970.method2865(Statics.field2619);
                field970.method2868(0);
                field970.method2868(Statics.field612.field3232);
                field970.method2868(Statics.field3628.field3232);
                field970.method2868(Statics.field1447.field3232);
                field970.method2868(Statics.field260.field3232);
                field970.method2868(Statics.field1546.field3232);
                field970.method2868(Statics.field2158.field3232);
                field970.method2868(Statics.field606.field3232);
                field970.method2868(Statics.field9.field3232);
                field970.method2868(Statics.field323.field3232);
                field970.method2868(Statics.field1408.field3232);
                field970.method2868(Statics.field2195.field3232);
                field970.method2868(Statics.field311.field3232);
                field970.method2868(Statics.field2353.field3232);
                field970.method2868(Statics.field694.field3232);
                field970.method2868(Statics.field275.field3232);
                field970.method2868(Statics.field425.field3232);
                field970.method2868(Statics.field784.field3232);
                field970.method2898(var3, var5, field970.field2399);
                field970.method2876(field970.field2399 - var4);
                Statics.field3329.method2723(field970.field2405, 0, field970.field2399);
                field969.method3104(var3);
                for (int var7 = 0; var7 < 4; var7++) {
                    var3[var7] += 50;
                }
                field971.method3104(var3);
                field995 = 6;
            }
            if (field995 == 6 && Statics.field3329.method2710() > 0) {
                int var8 = Statics.field3329.method2716();
                if (var8 == 21 && field934 == 20) {
                    field995 = 7;
                } else if (var8 == 2) {
                    field995 = 9;
                } else if (var8 == 15 && field934 == 40) {
                    field972 = -1;
                    field995 = 13;
                } else if (var8 == 23 && field960 < 1) {
                    field960++;
                    field995 = 0;
                } else if (var8 == 29) {
                    field995 = 11;
                } else {
                    Statics.method78(var8);
                    return;
                }
            }
            if (field995 == 7 && Statics.field3329.method2710() > 0) {
                field1094 = (Statics.field3329.method2716() + 3) * 60;
                field995 = 8;
            }
            if (field995 == 8) {
                field959 = 0;
                class93.method56(class226.field2899, class226.field2900, field1094 / 60 + class226.field3047);
                if (--field1094 <= 0) {
                    field995 = 0;
                }
            } else {
                if (field995 == 9 && Statics.field3329.method2710() >= 13) {
                    boolean var9 = Statics.field3329.method2716() == 1;
                    Statics.field3329.method2712(field971.field2405, 0, 4);
                    field971.field2399 = 0;
                    boolean var10 = false;
                    if (var9) {
                        int var11 = field971.method3106() << 24;
                        int var12 = var11 | field971.method3106() << 16;
                        int var13 = var12 | field971.method3106() << 8;
                        int var14 = var13 | field971.method3106();
                        int var15 = class271.method26(class93.field1472);
                        if (Statics.field248.field1331.size() >= 10 && !Statics.field248.field1331.containsKey(var15)) {
                            Iterator var16 = Statics.field248.field1331.entrySet().iterator();
                            var16.next();
                            var16.remove();
                        }
                        Statics.field248.field1331.put(var15, var14);
                        Statics.method4();
                    }
                    field1095 = Statics.field3329.method2716();
                    field1097 = Statics.field3329.method2716() == 1;
                    field1049 = Statics.field3329.method2716();
                    field1049 <<= 0x8;
                    field1049 += Statics.field3329.method2716();
                    field1050 = Statics.field3329.method2716();
                    Statics.field3329.method2712(field971.field2405, 0, 1);
                    field971.field2399 = 0;
                    field982 = field971.method3106();
                    Statics.field3329.method2712(field971.field2405, 0, 2);
                    field971.field2399 = 0;
                    field972 = field971.method2882();
                    try {
                        client var17 = Statics.field3633;
                        JSObject.getWindow(var17).call("zap", (Object[]) null);
                    } catch (Throwable var41) {
                    }
                    field995 = 10;
                }
                if (field995 != 10) {
                    if (field995 == 11 && Statics.field3329.method2710() >= 2) {
                        field971.field2399 = 0;
                        Statics.field3329.method2712(field971.field2405, 0, 2);
                        field971.field2399 = 0;
                        Statics.field2854 = field971.method2882();
                        field995 = 12;
                    }
                    if (field995 == 12 && Statics.field3329.method2710() >= Statics.field2854) {
                        field971.field2399 = 0;
                        Statics.field3329.method2712(field971.field2405, 0, Statics.field2854);
                        field971.field2399 = 0;
                        String var36 = field971.method2884();
                        String var37 = field971.method2884();
                        String var38 = field971.method2884();
                        class93.method56(var36, var37, var38);
                        method2180(10);
                    }
                    if (field995 == 13) {
                        if (field972 == -1) {
                            if (Statics.field3329.method2710() < 2) {
                                return;
                            }
                            Statics.field3329.method2712(field971.field2405, 0, 2);
                            field971.field2399 = 0;
                            field972 = field971.method2882();
                        }
                        if (Statics.field3329.method2710() >= field972) {
                            Statics.field3329.method2712(field971.field2405, 0, field972);
                            field971.field2399 = 0;
                            int var39 = field972;
                            method229();
                            class97.method111(field971);
                            if (field971.field2399 != var39) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field959++;
                        if (field959 > 2000) {
                            if (field960 < 1) {
                                if (Statics.field482 == Statics.field1531) {
                                    Statics.field1531 = Statics.field530;
                                } else {
                                    Statics.field1531 = Statics.field482;
                                }
                                field960++;
                                field995 = 0;
                            } else {
                                Statics.method78(-3);
                            }
                        }
                    }
                } else if (Statics.field3329.method2710() >= field972) {
                    field971.field2399 = 0;
                    Statics.field3329.method2712(field971.field2405, 0, field972);
                    field937 = 1L;
                    field940 = -1;
                    Statics.field394.field879 = 0;
                    Statics.field343 = true;
                    field1091 = true;
                    field926 = -1L;
                    class281.field3756 = new class192();
                    field969.field2399 = 0;
                    field971.field2399 = 0;
                    field982 = -1;
                    field965 = -1;
                    field977 = -1;
                    field978 = -1;
                    field974 = 0;
                    field943 = 0;
                    field979 = 0;
                    field944 = 0;
                    method946();
                    class60.method1541(0);
                    class99.method40();
                    field941 = 0;
                    field1083 = false;
                    field1182 = 0;
                    field1073 = (int) (Math.random() * 100.0D) - 50;
                    field1034 = (int) (Math.random() * 110.0D) - 55;
                    field952 = (int) (Math.random() * 80.0D) - 40;
                    field1086 = (int) (Math.random() * 120.0D) - 60;
                    field1000 = (int) (Math.random() * 30.0D) - 20;
                    field1011 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field1162 = 0;
                    field1155 = -1;
                    field948 = 0;
                    field1161 = 0;
                    field1013 = class92.field1442;
                    field953 = class92.field1442;
                    field938 = 0;
                    class97.method1396();
                    for (int var19 = 0; var19 < 2048; var19++) {
                        field967[var19] = null;
                    }
                    for (int var20 = 0; var20 < 32768; var20++) {
                        field963[var20] = null;
                    }
                    field1057 = -1;
                    field1060.method3301();
                    field1061.method3301();
                    for (int var21 = 0; var21 < 4; var21++) {
                        for (int var22 = 0; var22 < 104; var22++) {
                            for (int var23 = 0; var23 < 104; var23++) {
                                field986[var21][var22][var23] = null;
                            }
                        }
                    }
                    field1087 = new class194();
                    field1194 = 0;
                    field1193 = 0;
                    field1197 = 0;
                    for (int var24 = 0; var24 < Statics.field3290; var24++) {
                        class242 var25 = (class242) class242.field3291.method3235((long) var24);
                        class242 var26;
                        if (var25 == null) {
                            byte[] var27 = Statics.field3293.method3768(16, var24);
                            class242 var28 = new class242();
                            if (var27 != null) {
                                var28.method3922(new class174(var27));
                            }
                            class242.field3291.method3234(var28, (long) var24);
                            var26 = var28;
                        } else {
                            var26 = var25;
                        }
                        if (var26 != null) {
                            class212.field2612[var24] = 0;
                            class212.field2613[var24] = 0;
                        }
                    }
                    Statics.field874.method1656();
                    field1066 = -1;
                    if (field1088 != -1) {
                        class217.method3130(field1088);
                    }
                    for (class69 var30 = (class69) field1089.method3252(); var30 != null; var30 = (class69) field1089.method3257()) {
                        method1626(var30, true);
                    }
                    field1088 = -1;
                    field1089 = new class191(8);
                    field1092 = null;
                    method946();
                    field1199.method3641((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var31 = 0; var31 < 8; var31++) {
                        field1064[var31] = null;
                        field1096[var31] = false;
                    }
                    class64.method1();
                    field935 = true;
                    for (int var32 = 0; var32 < 100; var32++) {
                        field1133[var32] = true;
                    }
                    field969.method3116(226);
                    class180 var33 = field969;
                    int var34 = field1048 ? 2 : 1;
                    var33.method2865(var34);
                    field969.method2990(Statics.field618);
                    field969.method2990(Statics.field2309);
                    field1153 = null;
                    Statics.field417 = 0;
                    Statics.field263 = null;
                    for (int var35 = 0; var35 < 8; var35++) {
                        field1145[var35] = new class17();
                    }
                    Statics.field834 = null;
                    class97.method111(field971);
                    Statics.field1322 = -1;
                    method2(false);
                    field982 = -1;
                }
            }
        } catch (IOException var42) {
            if (field960 < 1) {
                if (Statics.field482 == Statics.field1531) {
                    Statics.field1531 = Statics.field530;
                } else {
                    Statics.field1531 = Statics.field482;
                }
                field960++;
                field995 = 0;
            } else {
                Statics.method78(-2);
            }
        }
    }

    @ObfuscatedName("au.fc(B)V")
    public static void method229() {
        field969.field2399 = 0;
        field971.field2399 = 0;
        field982 = -1;
        field965 = -1;
        field977 = -1;
        field978 = -1;
        field972 = 0;
        field974 = 0;
        field943 = 0;
        method946();
        field1162 = 0;
        field948 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field967[var0] = null;
        }
        Statics.field803 = null;
        for (int var1 = 0; var1 < field963.length; var1++) {
            class87 var2 = field963[var1];
            if (var2 != null) {
                var2.field1277 = -1;
                var2.field1266 = false;
            }
        }
        class64.method1();
        method2180(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field1133[var3] = true;
        }
        method19();
    }

    @ObfuscatedName("bj.fh(I)V")
    public static final void method1007() {
        if (Statics.field3329 != null) {
            Statics.field3329.method2711();
            Statics.field3329 = null;
        }
        method218();
        Statics.field15.method2443();
        for (int var0 = 0; var0 < 4; var0++) {
            field987[var0].method2744();
        }
        System.gc();
        class204.method3077(2);
        field1164 = -1;
        field1015 = false;
        class83.method2842();
        method2180(10);
    }

    @ObfuscatedName("aw.fq(S)V")
    public static final void method218() {
        class260.field3594.method3232();
        class247.method2356();
        class248.field3361.method3232();
        class256.method3759();
        class259.field3558.method3232();
        class259.field3559.method3232();
        class257.field3498.method3232();
        class257.field3501.method3232();
        class257.field3549.method3232();
        class261.field3609.method3232();
        class261.field3607.method3232();
        class246.method3757();
        class251.method2175();
        class242.method1562();
        class255.method2183();
        class249.field3376.method3232();
        class249.field3385.method3232();
        class253.field3403.method3232();
        Statics.method695();
        class243.method3751();
        class214.field2631.method3232();
        class217.field2756.method3232();
        class217.field2650.method3232();
        class217.field2780.method3232();
        class217.field2658.method3232();
        ((class126) Statics.field2029).method2165();
        class100.field1552.method3232();
        Statics.field612.method3830();
        Statics.field3628.method3830();
        Statics.field260.method3830();
        Statics.field1546.method3830();
        Statics.field2158.method3830();
        Statics.field606.method3830();
        Statics.field9.method3830();
        Statics.field323.method3830();
        Statics.field1408.method3830();
        Statics.field2195.method3830();
        Statics.field311.method3830();
        Statics.field2353.method3830();
    }

    @ObfuscatedName("l.fj(I)V")
    public static final void method52() {
        if (field979 > 0) {
            method1007();
        } else {
            method2180(40);
            Statics.field2641 = Statics.field3329;
            Statics.field3329 = null;
        }
    }

    @ObfuscatedName("client.fu(B)V")
    public final void method1082() {
        if (field943 > 1) {
            field943--;
        }
        if (field979 > 0) {
            field979--;
        }
        if (field980) {
            field980 = false;
            method52();
            return;
        }
        if (!field925) {
            method946();
            field1072[0] = class226.field3099;
            field964[0] = "";
            field1024[0] = 1006;
            field1067 = 1;
        }
        for (int var1 = 0; var1 < 100 && this.method1086(); var1++) {
        }
        if (field934 != 30) {
            return;
        }
        while (class281.method3741()) {
            field969.method3116(74);
            field969.method2865(0);
            int var2 = field969.field2399;
            class281.method3504(field969);
            field969.method2968(field969.field2399 - var2);
        }
        Object var3 = Statics.field394.field870;
        synchronized (Statics.field394.field870) {
            if (!field975) {
                Statics.field394.field879 = 0;
            } else if (class60.field743 != 0 || Statics.field394.field879 >= 40) {
                field969.method3116(54);
                field969.method2865(0);
                int var4 = field969.field2399;
                int var5 = 0;
                for (int var6 = 0; var6 < Statics.field394.field879 && field969.field2399 - var4 < 240; var6++) {
                    var5++;
                    int var7 = Statics.field394.field873[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = Statics.field394.field872[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (Statics.field394.field873[var6] == -1 && Statics.field394.field872[var6] == -1) {
                        var8 = -1;
                        var7 = -1;
                        var9 = 524287;
                    }
                    if (field1131 != var8 || field954 != var7) {
                        int var10 = var8 - field1131;
                        field1131 = var8;
                        int var11 = var7 - field954;
                        field954 = var7;
                        if (field940 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            field969.method2990((field940 << 12) + (var10 << 6) + var11);
                            field940 = 0;
                        } else if (field940 < 8) {
                            field969.method2867((field940 << 19) + 8388608 + var9);
                            field940 = 0;
                        } else {
                            field969.method2868((field940 << 19) + -1073741824 + var9);
                            field940 = 0;
                        }
                    } else if (field940 < 2047) {
                        field940++;
                    }
                }
                field969.method2968(field969.field2399 - var4);
                if (var5 >= Statics.field394.field879) {
                    Statics.field394.field879 = 0;
                } else {
                    Statics.field394.field879 -= var5;
                    for (int var12 = 0; var12 < Statics.field394.field879; var12++) {
                        Statics.field394.field872[var12] = Statics.field394.field872[var5 + var12];
                        Statics.field394.field873[var12] = Statics.field394.field873[var5 + var12];
                    }
                }
            }
        }
        if (class60.field743 == 1 || !Statics.field500 && class60.field743 == 4 || class60.field743 == 2) {
            long var14 = (class60.field758 - field937 * -1L) / 50L;
            if (var14 > 4095L) {
                var14 = 4095L;
            }
            field937 = class60.field758 * -1L;
            int var16 = class60.field757;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > Statics.field2309) {
                var16 = Statics.field2309;
            }
            int var17 = class60.field748;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > Statics.field618) {
                var17 = Statics.field618;
            }
            int var18 = (int) var14;
            field969.method3116(171);
            field969.method2990((var18 << 1) + (class60.field743 == 2 ? 1 : 0));
            field969.method2990(var17);
            field969.method2990(var16);
        }
        if (class51.field672 > 0) {
            field969.method3116(3);
            field969.method2990(0);
            int var19 = field969.field2399;
            long var20 = class176.method2862();
            for (int var22 = 0; var22 < class51.field672; var22++) {
                long var23 = var20 - field926;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field926 = var20;
                field969.method2918((int) var23);
                field969.method2904(class51.field671[var22]);
            }
            field969.method2876(field969.field2399 - var19);
        }
        if (field1017 > 0) {
            field1017--;
        }
        if (class51.field660[96] || class51.field660[97] || class51.field660[98] || class51.field660[99]) {
            field1018 = true;
        }
        if (field1018 && field1017 <= 0) {
            field1017 = 20;
            field1018 = false;
            field969.method3116(50);
            field969.method3057(field1053);
            field969.method2911(field1011);
        }
        if (Statics.field343 && !field1091) {
            field1091 = true;
            field969.method3116(154);
            field969.method2865(1);
        }
        if (!Statics.field343 && field1091) {
            field1091 = false;
            field969.method3116(154);
            field969.method2865(0);
        }
        method124();
        if (field934 != 30) {
            return;
        }
        for (class77 var25 = (class77) field1087.method3303(); var25 != null; var25 = (class77) field1087.method3297()) {
            if (var25.field1221 > 0) {
                var25.field1221--;
            }
            if (var25.field1221 == 0) {
                if (var25.field1210 >= 0) {
                    int var26 = var25.field1210;
                    int var27 = var25.field1223;
                    class256 var28 = class256.method4092(var26);
                    if (var27 == 11) {
                        var27 = 10;
                    }
                    if (var27 >= 5 && var27 <= 8) {
                        var27 = 4;
                    }
                    boolean var29 = var28.method4156(var27);
                    if (!var29) {
                        continue;
                    }
                }
                method1010(var25.field1216, var25.field1211, var25.field1222, var25.field1213, var25.field1210, var25.field1215, var25.field1223);
                var25.method3290();
            } else {
                if (var25.field1220 > 0) {
                    var25.field1220--;
                }
                if (var25.field1220 == 0 && var25.field1222 >= 1 && var25.field1213 >= 1 && var25.field1222 <= 102 && var25.field1213 <= 102) {
                    if (var25.field1217 >= 0) {
                        int var30 = var25.field1217;
                        int var31 = var25.field1224;
                        class256 var32 = class256.method4092(var30);
                        if (var31 == 11) {
                            var31 = 10;
                        }
                        if (var31 >= 5 && var31 <= 8) {
                            var31 = 4;
                        }
                        boolean var33 = var32.method4156(var31);
                        if (!var33) {
                            continue;
                        }
                    }
                    method1010(var25.field1216, var25.field1211, var25.field1222, var25.field1213, var25.field1217, var25.field1218, var25.field1224);
                    var25.field1220 = -1;
                    if (var25.field1217 == var25.field1210 && var25.field1210 == -1) {
                        var25.method3290();
                    } else if (var25.field1217 == var25.field1210 && var25.field1218 == var25.field1215 && var25.field1224 == var25.field1223) {
                        var25.method3290();
                    }
                }
            }
        }
        int var10002;
        for (int var34 = 0; var34 < field1182; var34++) {
            var10002 = field1171[var34]--;
            if (field1171[var34] >= -10) {
                class106 var36 = field1173[var34];
                if (var36 == null) {
                    class106 var10000 = (class106) null;
                    var36 = class106.method1795(Statics.field1546, field1169[var34], 0);
                    if (var36 == null) {
                        continue;
                    }
                    field1171[var34] += var36.method1785();
                    field1173[var34] = var36;
                }
                if (field1171[var34] < 0) {
                    int var43;
                    if (field1172[var34] == 0) {
                        var43 = field1166;
                    } else {
                        int var37 = (field1172[var34] & 0xFF) * 128;
                        int var38 = field1172[var34] >> 16 & 0xFF;
                        int var39 = var38 * 128 + 64 - Statics.field803.field1273;
                        if (var39 < 0) {
                            var39 = -var39;
                        }
                        int var40 = field1172[var34] >> 8 & 0xFF;
                        int var41 = var40 * 128 + 64 - Statics.field803.field1240;
                        if (var41 < 0) {
                            var41 = -var41;
                        }
                        int var42 = var39 + var41 - 128;
                        if (var42 > var37) {
                            field1171[var34] = -100;
                            continue;
                        }
                        if (var42 < 0) {
                            var42 = 0;
                        }
                        var43 = field1099 * (var37 - var42) / var37;
                    }
                    if (var43 > 0) {
                        class108 var44 = var36.method1783().method1830(Statics.field2897);
                        class118 var45 = class118.method2032(var44, 100, var43);
                        var45.method1946(field1170[var34] - 1);
                        Statics.field329.method1733(var45);
                    }
                    field1171[var34] = -100;
                }
            } else {
                field1182--;
                for (int var35 = var34; var35 < field1182; var35++) {
                    field1169[var35] = field1169[var35 + 1];
                    field1173[var35] = field1173[var35 + 1];
                    field1170[var35] = field1170[var35 + 1];
                    field1171[var35] = field1171[var35 + 1];
                    field1172[var35] = field1172[var35 + 1];
                }
                var34--;
            }
        }
        if (field1015 && !class204.method1575()) {
            if (field1163 != 0 && field1164 != -1) {
                class204.method219(Statics.field606, field1164, 0, field1163, false);
            }
            field1015 = false;
        }
        field974++;
        if (field974 > 750) {
            method52();
            return;
        }
        method221();
        for (int var46 = 0; var46 < field938; var46++) {
            int var47 = field950[var46];
            class87 var48 = field963[var47];
            if (var48 != null) {
                method700(var48, var48.field1400.field3562);
            }
        }
        method3141();
        field1003++;
        if (field1037 != 0) {
            field968 += 20;
            if (field968 >= 400) {
                field1037 = 0;
            }
        }
        if (Statics.field2406 != null) {
            field998++;
            if (field998 >= 15) {
                method1571(Statics.field2406);
                Statics.field2406 = null;
            }
        }
        class217 var49 = Statics.field3372;
        class217 var50 = Statics.field1212;
        Statics.field3372 = null;
        Statics.field1212 = null;
        field1106 = null;
        field1177 = false;
        field1070 = false;
        field1038 = 0;
        while (class51.method69() && field1038 < 128) {
            if (field1095 >= 2 && class51.field660[82] && Statics.field2347 == 66) {
                String var51 = class99.method2635();
                Statics.field3633.method863(var51);
            } else {
                field1151[field1038] = Statics.field2347;
                field1150[field1038] = Statics.field3239;
                field1038++;
            }
        }
        if (field1088 != -1) {
            int var52 = field1088;
            int var53 = Statics.field618;
            int var54 = Statics.field2309;
            if (class217.method1012(var52)) {
                method225(Statics.field628[var52], -1, 0, 0, var53, var54, 0, 0);
            }
        }
        field1113++;
        while (true) {
            class70 var55;
            class217 var56;
            class217 var57;
            do {
                var55 = (class70) field1128.method3306();
                if (var55 == null) {
                    while (true) {
                        class70 var58;
                        class217 var59;
                        class217 var60;
                        do {
                            var58 = (class70) field1129.method3306();
                            if (var58 == null) {
                                while (true) {
                                    class70 var61;
                                    class217 var62;
                                    class217 var63;
                                    do {
                                        var61 = (class70) field1036.method3306();
                                        if (var61 == null) {
                                            this.method1087();
                                            if (Statics.field601 != null) {
                                                Statics.field601.method4804(Statics.field2137, (Statics.field803.field1273 >> 7) + Statics.field669, (Statics.field803.field1240 >> 7) + Statics.field3674, false);
                                                Statics.field601.method4818();
                                            }
                                            if (field1101 != null) {
                                                this.method1309();
                                            }
                                            if (Statics.field1514 != null) {
                                                method1571(Statics.field1514);
                                                field1045++;
                                                if (class60.field755 == 0) {
                                                    if (!field1044) {
                                                        label933: {
                                                            label682: {
                                                                int var70 = method8();
                                                                if (field1067 > 2) {
                                                                    if (field1065 == 1 && !method2638()) {
                                                                        break label682;
                                                                    }
                                                                    boolean var71;
                                                                    if (var70 < 0) {
                                                                        var71 = false;
                                                                    } else {
                                                                        int var72 = field1024[var70];
                                                                        if (var72 >= 2000) {
                                                                            var72 -= 2000;
                                                                        }
                                                                        if (var72 == 1007) {
                                                                            var71 = true;
                                                                        } else {
                                                                            var71 = false;
                                                                        }
                                                                    }
                                                                    if (var71) {
                                                                        break label682;
                                                                    }
                                                                }
                                                                if (field1067 > 0) {
                                                                    int var73 = field1041;
                                                                    int var74 = field1042;
                                                                    method1013(Statics.field282, var73, var74);
                                                                    Statics.field282 = null;
                                                                }
                                                                break label933;
                                                            }
                                                            this.method1088(field1041, field1042);
                                                        }
                                                    } else if (Statics.field2156 == Statics.field1514 && field1043 != field1040) {
                                                        class217 var64 = Statics.field1514;
                                                        byte var65 = 0;
                                                        if (field1142 == 1 && var64.field2659 == 206) {
                                                            var65 = 1;
                                                        }
                                                        if (var64.field2773[field1043] <= 0) {
                                                            var65 = 0;
                                                        }
                                                        if (class218.method222(method191(var64))) {
                                                            int var66 = field1040;
                                                            int var67 = field1043;
                                                            var64.field2773[var67] = var64.field2773[var66];
                                                            var64.field2774[var67] = var64.field2774[var66];
                                                            var64.field2773[var66] = -1;
                                                            var64.field2774[var66] = 0;
                                                        } else if (var65 == 1) {
                                                            int var68 = field1040;
                                                            int var69 = field1043;
                                                            while (var68 != var69) {
                                                                if (var68 > var69) {
                                                                    var64.method3685(var68 - 1, var68);
                                                                    var68--;
                                                                } else if (var68 < var69) {
                                                                    var64.method3685(var68 + 1, var68);
                                                                    var68++;
                                                                }
                                                            }
                                                        } else {
                                                            var64.method3685(field1043, field1040);
                                                        }
                                                        field969.method3116(19);
                                                        field969.method2991(Statics.field1514.field2655);
                                                        field969.method2911(field1040);
                                                        field969.method2999(var65);
                                                        field969.method3057(field1043);
                                                    }
                                                    field998 = 10;
                                                    class60.field743 = 0;
                                                    Statics.field1514 = null;
                                                } else if (field1045 >= 5 && (class60.field749 > field1041 + 5 || class60.field749 < field1041 - 5 || class60.field750 > field1042 + 5 || class60.field750 < field1042 - 5)) {
                                                    field1044 = true;
                                                }
                                            }
                                            if (class140.method2481()) {
                                                int var75 = class140.field2104;
                                                int var76 = class140.field2105;
                                                field969.method3116(96);
                                                field969.method2865(5);
                                                field969.method2904(class51.field660[82] ? (class51.field660[81] ? 2 : 1) : 0);
                                                field969.method2990(Statics.field3674 + var76);
                                                field969.method2990(Statics.field669 + var75);
                                                class140.method2608();
                                                field1191 = class60.field748;
                                                field1035 = class60.field757;
                                                field1037 = 1;
                                                field968 = 0;
                                                field948 = var75;
                                                field1161 = var76;
                                            }
                                            if (Statics.field3372 != var49) {
                                                if (var49 != null) {
                                                    method1571(var49);
                                                }
                                                if (Statics.field3372 != null) {
                                                    method1571(Statics.field3372);
                                                }
                                            }
                                            if (Statics.field1212 != var50 && field1080 == field1055) {
                                                if (var50 != null) {
                                                    method1571(var50);
                                                }
                                                if (Statics.field1212 != null) {
                                                    method1571(Statics.field1212);
                                                }
                                            }
                                            if (Statics.field1212 == null) {
                                                if (field1055 > 0) {
                                                    field1055--;
                                                }
                                            } else if (field1055 < field1080) {
                                                field1055++;
                                                if (field1080 == field1055) {
                                                    method1571(Statics.field1212);
                                                }
                                            }
                                            int var77 = field1073 + Statics.field803.field1273;
                                            int var78 = field1034 + Statics.field803.field1240;
                                            if (Statics.field861 - var77 < -500 || Statics.field861 - var77 > 500 || Statics.field457 - var78 < -500 || Statics.field457 - var78 > 500) {
                                                Statics.field861 = var77;
                                                Statics.field457 = var78;
                                            }
                                            if (Statics.field861 != var77) {
                                                Statics.field861 += (var77 - Statics.field861) / 16;
                                            }
                                            if (Statics.field457 != var78) {
                                                Statics.field457 += (var78 - Statics.field457) / 16;
                                            }
                                            if (class60.field755 == 4 && Statics.field500) {
                                                int var79 = class60.field750 - field1056;
                                                field1196 = var79 * 2;
                                                field1056 = var79 == -1 || var79 == 1 ? class60.field750 : (field1056 + class60.field750) / 2;
                                                int var80 = field1014 - class60.field749;
                                                field1149 = var80 * 2;
                                                field1014 = var80 == -1 || var80 == 1 ? class60.field749 : (field1014 + class60.field749) / 2;
                                            } else {
                                                if (class51.field660[96]) {
                                                    field1149 += (-24 - field1149) / 2;
                                                } else if (class51.field660[97]) {
                                                    field1149 += (24 - field1149) / 2;
                                                } else {
                                                    field1149 /= 2;
                                                }
                                                if (class51.field660[98]) {
                                                    field1196 += (12 - field1196) / 2;
                                                } else if (class51.field660[99]) {
                                                    field1196 += (-12 - field1196) / 2;
                                                } else {
                                                    field1196 /= 2;
                                                }
                                                field1056 = class60.field750;
                                                field1014 = class60.field749;
                                            }
                                            field1011 = field1149 / 2 + field1011 & 0x7FF;
                                            field1053 += field1196 / 2;
                                            if (field1053 < 128) {
                                                field1053 = 128;
                                            }
                                            if (field1053 > 383) {
                                                field1053 = 383;
                                            }
                                            int var81 = Statics.field861 >> 7;
                                            int var82 = Statics.field457 >> 7;
                                            int var83 = method306(Statics.field861, Statics.field457, Statics.field2137);
                                            int var84 = 0;
                                            if (var81 > 3 && var82 > 3 && var81 < 100 && var82 < 100) {
                                                for (int var85 = var81 - 4; var85 <= var81 + 4; var85++) {
                                                    for (int var86 = var82 - 4; var86 <= var82 + 4; var86++) {
                                                        int var87 = Statics.field2137;
                                                        if (var87 < 3 && (class62.field770[1][var85][var86] & 0x2) == 2) {
                                                            var87++;
                                                        }
                                                        int var88 = var83 - class62.field782[var87][var85][var86];
                                                        if (var88 > var84) {
                                                            var84 = var88;
                                                        }
                                                    }
                                                }
                                            }
                                            int var89 = var84 * 192;
                                            if (var89 > 98048) {
                                                var89 = 98048;
                                            }
                                            if (var89 < 32768) {
                                                var89 = 32768;
                                            }
                                            if (var89 > field1019) {
                                                field1019 += (var89 - field1019) / 24;
                                            } else if (var89 < field1019) {
                                                field1019 += (var89 - field1019) / 80;
                                            }
                                            if (field1174) {
                                                method1011();
                                            }
                                            for (int var90 = 0; var90 < 5; var90++) {
                                                var10002 = field1179[var90]++;
                                            }
                                            Statics.field874.method1679();
                                            int var91 = class60.method2438();
                                            int var92 = class51.method938();
                                            if (var91 > 15000 && var92 > 15000) {
                                                field979 = 250;
                                                class60.method1541(14500);
                                                field969.method3116(224);
                                            }
                                            field992++;
                                            if (field992 > 500) {
                                                field992 = 0;
                                                int var93 = (int) (Math.random() * 8.0D);
                                                if ((var93 & 0x1) == 1) {
                                                    field1073 += field1136;
                                                }
                                                if ((var93 & 0x2) == 2) {
                                                    field1034 += field994;
                                                }
                                                if ((var93 & 0x4) == 4) {
                                                    field952 += field996;
                                                }
                                            }
                                            if (field1073 < -50) {
                                                field1136 = 2;
                                            }
                                            if (field1073 > 50) {
                                                field1136 = -2;
                                            }
                                            if (field1034 < -55) {
                                                field994 = 2;
                                            }
                                            if (field1034 > 55) {
                                                field994 = -2;
                                            }
                                            if (field952 < -40) {
                                                field996 = 1;
                                            }
                                            if (field952 > 40) {
                                                field996 = -1;
                                            }
                                            field1002++;
                                            if (field1002 > 500) {
                                                field1002 = 0;
                                                int var94 = (int) (Math.random() * 8.0D);
                                                if ((var94 & 0x1) == 1) {
                                                    field1086 += field999;
                                                }
                                                if ((var94 & 0x2) == 2) {
                                                    field1000 += field1001;
                                                }
                                            }
                                            if (field1086 < -60) {
                                                field999 = 2;
                                            }
                                            if (field1086 > 60) {
                                                field999 = -2;
                                            }
                                            if (field1000 < -20) {
                                                field1001 = 1;
                                            }
                                            if (field1000 > 10) {
                                                field1001 = -1;
                                            }
                                            for (class68 var95 = (class68) field1030.method3331(); var95 != null; var95 = (class68) field1030.method3326()) {
                                                if ((long) var95.field837 < class176.method2862() / 1000L - 5L) {
                                                    if (var95.field838 > 0) {
                                                        class99.method2665(5, "", var95.field842 + class226.field3007);
                                                    }
                                                    if (var95.field838 == 0) {
                                                        class99.method2665(5, "", var95.field842 + class226.field3008);
                                                    }
                                                    var95.method3334();
                                                }
                                            }
                                            field1207++;
                                            if (field1207 > 50) {
                                                field969.method3116(203);
                                            }
                                            try {
                                                if (Statics.field3329 != null && field969.field2399 > 0) {
                                                    Statics.field3329.method2723(field969.field2405, 0, field969.field2399);
                                                    field969.field2399 = 0;
                                                    field1207 = 0;
                                                }
                                            } catch (IOException var97) {
                                                method52();
                                            }
                                            return;
                                        }
                                        var62 = var61.field850;
                                        if (var62.field2656 < 0) {
                                            break;
                                        }
                                        var63 = class217.method3122(var62.field2674);
                                    } while (var63 == null || var63.field2779 == null || var62.field2656 >= var63.field2779.length || var63.field2779[var62.field2656] != var62);
                                    class84.method68(var61);
                                }
                            }
                            var59 = var58.field850;
                            if (var59.field2656 < 0) {
                                break;
                            }
                            var60 = class217.method3122(var59.field2674);
                        } while (var60 == null || var60.field2779 == null || var59.field2656 >= var60.field2779.length || var60.field2779[var59.field2656] != var59);
                        class84.method68(var58);
                    }
                }
                var56 = var55.field850;
                if (var56.field2656 < 0) {
                    break;
                }
                var57 = class217.method3122(var56.field2674);
            } while (var57 == null || var57.field2779 == null || var56.field2656 >= var57.field2779.length || var57.field2779[var56.field2656] != var56);
            class84.method68(var55);
        }
    }

    @ObfuscatedName("c.fy(I)V")
    public static final void method59() {
        if (Statics.field756 != null) {
            Statics.field756.method1862();
        }
        if (Statics.field2066 != null) {
            Statics.field2066.method1862();
        }
    }

    @ObfuscatedName("bh.fd(Ljn;IIII)V")
    public static void method1014(class261 arg0, int arg1, int arg2, int arg3) {
        if (field1182 >= 50 || field1099 == 0 || arg0.field3614 == null || arg1 >= arg0.field3614.length) {
            return;
        }
        int var4 = arg0.field3614[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1169[field1182] = var5;
        field1170[field1182] = var6;
        field1171[field1182] = 0;
        field1173[field1182] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1172[field1182] = (var8 << 16) + (var9 << 8) + var7;
        field1182++;
    }

    @ObfuscatedName("ao.fg(IIIB)V")
    public static void method319(int arg0, int arg1, int arg2) {
        if (field1166 == 0 || arg1 == 0 || field1182 >= 50) {
            return;
        }
        field1169[field1182] = arg0;
        field1170[field1182] = arg1;
        field1171[field1182] = arg2;
        field1173[field1182] = null;
        field1172[field1182] = 0;
        field1182++;
    }

    @ObfuscatedName("ja.fz(II)V")
    public static void method4473(int arg0) {
        if (arg0 == -1 && !field1015) {
            Statics.field2510.method3443();
            class204.field2509 = 1;
            Statics.field786 = null;
        } else if (arg0 != -1 && field1164 != arg0 && field1163 != 0 && !field1015) {
            Statics.method1495(2, Statics.field606, arg0, 0, field1163, false);
        }
        field1164 = arg0;
    }

    @ObfuscatedName("n.fo(B)V")
    public static final void method124() {
        if (Statics.field2137 == field1155) {
            return;
        }
        field1155 = Statics.field2137;
        int var0 = Statics.field2137;
        int[] var1 = Statics.field759.field3791;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field770[var0][var6][var4] & 0x18) == 0) {
                    Statics.field15.method2564(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class62.field770[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field15.method2564(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field759.method4676();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field770[var0][var10][var9] & 0x18) == 0) {
                    method3740(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class62.field770[var0 + 1][var10][var9] & 0x8) != 0) {
                    method3740(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1156 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field15.method2471(Statics.field2137, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class256.method4092(var14).field3455;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field987[Statics.field2137].field2307;
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
                        field928[field1156] = Statics.field3304[var15].method3932(false);
                        field1157[field1156] = var16;
                        field1012[field1156] = var17;
                        field1156++;
                    }
                }
            }
        }
        Statics.field603.method4637();
    }

    @ObfuscatedName("fk.fp(I)V")
    public static final void method3141() {
        int[] var0 = class97.field1532;
        for (int var1 = 0; var1 < class97.field1522; var1++) {
            class75 var2 = field967[var0[var1]];
            if (var2 != null && var2.field1265 > 0) {
                var2.field1265--;
                if (var2.field1265 == 0) {
                    var2.field1252 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field938; var3++) {
            int var4 = field950[var3];
            class87 var5 = field963[var4];
            if (var5 != null && var5.field1265 > 0) {
                var5.field1265--;
                if (var5.field1265 == 0) {
                    var5.field1252 = null;
                }
            }
        }
    }

    @ObfuscatedName("bz.fm(I)V")
    public static final void method1011() {
        int var0 = Statics.field1209 * 128 + 64;
        int var1 = Statics.field2592 * 128 + 64;
        int var2 = method306(var0, var1, Statics.field2137) - Statics.field1516;
        if (Statics.field2255 < var0) {
            Statics.field2255 += Statics.field458 * (var0 - Statics.field2255) / 1000 + Statics.field501;
            if (Statics.field2255 > var0) {
                Statics.field2255 = var0;
            }
        }
        if (Statics.field2255 > var0) {
            Statics.field2255 -= Statics.field458 * (Statics.field2255 - var0) / 1000 + Statics.field501;
            if (Statics.field2255 < var0) {
                Statics.field2255 = var0;
            }
        }
        if (Statics.field768 < var2) {
            Statics.field768 += Statics.field458 * (var2 - Statics.field768) / 1000 + Statics.field501;
            if (Statics.field768 > var2) {
                Statics.field768 = var2;
            }
        }
        if (Statics.field768 > var2) {
            Statics.field768 -= Statics.field458 * (Statics.field768 - var2) / 1000 + Statics.field501;
            if (Statics.field768 < var2) {
                Statics.field768 = var2;
            }
        }
        if (Statics.field2270 < var1) {
            Statics.field2270 += Statics.field458 * (var1 - Statics.field2270) / 1000 + Statics.field501;
            if (Statics.field2270 > var1) {
                Statics.field2270 = var1;
            }
        }
        if (Statics.field2270 > var1) {
            Statics.field2270 -= Statics.field458 * (Statics.field2270 - var1) / 1000 + Statics.field501;
            if (Statics.field2270 < var1) {
                Statics.field2270 = var1;
            }
        }
        int var3 = Statics.field833 * 128 + 64;
        int var4 = Statics.field2439 * 128 + 64;
        int var5 = method306(var3, var4, Statics.field2137) - Statics.field2290;
        int var6 = var3 - Statics.field2255;
        int var7 = var5 - Statics.field768;
        int var8 = var4 - Statics.field2270;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field891 < var10) {
            Statics.field891 += Statics.field2224 * (var10 - Statics.field891) / 1000 + Statics.field2415;
            if (Statics.field891 > var10) {
                Statics.field891 = var10;
            }
        }
        if (Statics.field891 > var10) {
            Statics.field891 -= Statics.field2224 * (Statics.field891 - var10) / 1000 + Statics.field2415;
            if (Statics.field891 < var10) {
                Statics.field891 = var10;
            }
        }
        int var12 = var11 - Statics.field348;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field348 += Statics.field2224 * var12 / 1000 + Statics.field2415;
            Statics.field348 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field348 -= Statics.field2224 * -var12 / 1000 + Statics.field2415;
            Statics.field348 &= 0x7FF;
        }
        int var13 = var11 - Statics.field348;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field348 = var11;
        }
    }

    @ObfuscatedName("ai.fl(B)V")
    public static final void method221() {
        int var0 = class97.field1522;
        int[] var1 = class97.field1532;
        for (int var2 = 0; var2 < var0; var2++) {
            class75 var3 = field967[var1[var2]];
            if (var3 != null) {
                method700(var3, 1);
            }
        }
    }

    @ObfuscatedName("bc.fa(Lcd;II)V")
    public static final void method700(class79 arg0, int arg1) {
        if (arg0.field1275 > field936) {
            int var2 = arg0.field1275 - field936;
            int var3 = arg0.field1281 * 128 + arg0.field1243 * 64;
            int var4 = arg0.field1283 * 128 + arg0.field1243 * 64;
            arg0.field1273 += (var3 - arg0.field1273) / var2;
            arg0.field1240 += (var4 - arg0.field1240) / var2;
            arg0.field1276 = 0;
            arg0.field1290 = arg0.field1287;
        } else if (arg0.field1286 >= field936) {
            method478(arg0);
        } else {
            method67(arg0);
        }
        if (arg0.field1273 < 128 || arg0.field1240 < 128 || arg0.field1273 >= 13184 || arg0.field1240 >= 13184) {
            arg0.field1259 = -1;
            arg0.field1249 = -1;
            arg0.field1275 = 0;
            arg0.field1286 = 0;
            arg0.field1273 = arg0.field1294[0] * 128 + arg0.field1243 * 64;
            arg0.field1240 = arg0.field1296[0] * 128 + arg0.field1243 * 64;
            arg0.method1405();
        }
        if (Statics.field803 == arg0 && (arg0.field1273 < 1536 || arg0.field1240 < 1536 || arg0.field1273 >= 11776 || arg0.field1240 >= 11776)) {
            arg0.field1259 = -1;
            arg0.field1249 = -1;
            arg0.field1275 = 0;
            arg0.field1286 = 0;
            arg0.field1273 = arg0.field1294[0] * 128 + arg0.field1243 * 64;
            arg0.field1240 = arg0.field1296[0] * 128 + arg0.field1243 * 64;
            arg0.method1405();
        }
        method6(arg0);
        Statics.method65(arg0);
    }

    @ObfuscatedName("aq.fe(Lcd;I)V")
    public static final void method478(class79 arg0) {
        if (field936 == arg0.field1286 || arg0.field1259 == -1 || arg0.field1282 != 0 || arg0.field1248 + 1 > class261.method3746(arg0.field1259).field3613[arg0.field1272]) {
            int var1 = arg0.field1286 - arg0.field1275;
            int var2 = field936 - arg0.field1275;
            int var3 = arg0.field1281 * 128 + arg0.field1243 * 64;
            int var4 = arg0.field1283 * 128 + arg0.field1243 * 64;
            int var5 = arg0.field1297 * 128 + arg0.field1243 * 64;
            int var6 = arg0.field1243 * 64 + arg0.field1242 * 128;
            arg0.field1273 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1240 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1276 = 0;
        arg0.field1290 = arg0.field1287;
        arg0.field1241 = arg0.field1290;
    }

    @ObfuscatedName("c.fx(Lcd;I)V")
    public static final void method67(class79 arg0) {
        arg0.field1269 = arg0.field1244;
        if (arg0.field1293 == 0) {
            arg0.field1276 = 0;
            return;
        }
        if (arg0.field1259 != -1 && arg0.field1282 == 0) {
            class261 var1 = class261.method3746(arg0.field1259);
            if (arg0.field1270 > 0 && var1.field3620 == 0) {
                arg0.field1276++;
                return;
            }
            if (arg0.field1270 <= 0 && var1.field3624 == 0) {
                arg0.field1276++;
                return;
            }
        }
        int var2 = arg0.field1273;
        int var3 = arg0.field1240;
        int var4 = arg0.field1294[arg0.field1293 - 1] * 128 + arg0.field1243 * 64;
        int var5 = arg0.field1296[arg0.field1293 - 1] * 128 + arg0.field1243 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1290 = 1280;
            } else if (var3 > var5) {
                arg0.field1290 = 1792;
            } else {
                arg0.field1290 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1290 = 768;
            } else if (var3 > var5) {
                arg0.field1290 = 256;
            } else {
                arg0.field1290 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1290 = 1024;
        } else if (var3 > var5) {
            arg0.field1290 = 0;
        }
        byte var6 = arg0.field1298[arg0.field1293 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1273 = var4;
            arg0.field1240 = var5;
            arg0.field1293--;
            if (arg0.field1270 > 0) {
                arg0.field1270--;
            }
            return;
        }
        int var7 = arg0.field1290 - arg0.field1241 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1284;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1247;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1250;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1271;
        }
        if (var8 == -1) {
            var8 = arg0.field1247;
        }
        arg0.field1269 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class87) {
            var10 = ((class87) arg0).field1400.field3590;
        }
        if (var10) {
            if (arg0.field1290 != arg0.field1241 && arg0.field1277 == -1 && arg0.field1292 != 0) {
                var9 = 2;
            }
            if (arg0.field1293 > 2) {
                var9 = 6;
            }
            if (arg0.field1293 > 3) {
                var9 = 8;
            }
            if (arg0.field1276 > 0 && arg0.field1293 > 1) {
                var9 = 8;
                arg0.field1276--;
            }
        } else {
            if (arg0.field1293 > 1) {
                var9 = 6;
            }
            if (arg0.field1293 > 2) {
                var9 = 8;
            }
            if (arg0.field1276 > 0 && arg0.field1293 > 1) {
                var9 = 8;
                arg0.field1276--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1269 == arg0.field1247 && arg0.field1251 != -1) {
            arg0.field1269 = arg0.field1251;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1273 += var9;
                if (arg0.field1273 > var4) {
                    arg0.field1273 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1273 -= var9;
                if (arg0.field1273 < var4) {
                    arg0.field1273 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1240 += var9;
                if (arg0.field1240 > var5) {
                    arg0.field1240 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1240 -= var9;
                if (arg0.field1240 < var5) {
                    arg0.field1240 = var5;
                }
            }
        }
        if (arg0.field1273 == var4 && arg0.field1240 == var5) {
            arg0.field1293--;
            if (arg0.field1270 > 0) {
                arg0.field1270--;
            }
        }
    }

    @ObfuscatedName("w.fr(Lcd;I)V")
    public static final void method6(class79 arg0) {
        if (arg0.field1292 == 0) {
            return;
        }
        if (arg0.field1277 != -1) {
            class79 var1 = null;
            if (arg0.field1277 < 32768) {
                var1 = field963[arg0.field1277];
            } else if (arg0.field1277 >= 32768) {
                var1 = field967[arg0.field1277 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1273 - var1.field1273;
                int var3 = arg0.field1240 - var1.field1240;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1290 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1266) {
                arg0.field1277 = -1;
                arg0.field1266 = false;
            }
        }
        if (arg0.field1267 != -1 && (arg0.field1293 == 0 || arg0.field1276 > 0)) {
            arg0.field1290 = arg0.field1267;
            arg0.field1267 = -1;
        }
        int var4 = arg0.field1290 - arg0.field1241 & 0x7FF;
        if (var4 == 0 && arg0.field1266) {
            arg0.field1277 = -1;
            arg0.field1266 = false;
        }
        if (var4 == 0) {
            arg0.field1253 = 0;
            return;
        }
        arg0.field1253++;
        if (var4 > 1024) {
            arg0.field1241 -= arg0.field1292;
            boolean var5 = true;
            if (var4 < arg0.field1292 || var4 > 2048 - arg0.field1292) {
                arg0.field1241 = arg0.field1290;
                var5 = false;
            }
            if (arg0.field1269 == arg0.field1244 && (arg0.field1253 > 25 || var5)) {
                if (arg0.field1291 == -1) {
                    arg0.field1269 = arg0.field1247;
                } else {
                    arg0.field1269 = arg0.field1291;
                }
            }
        } else {
            arg0.field1241 += arg0.field1292;
            boolean var6 = true;
            if (var4 < arg0.field1292 || var4 > 2048 - arg0.field1292) {
                arg0.field1241 = arg0.field1290;
                var6 = false;
            }
            if (arg0.field1269 == arg0.field1244 && (arg0.field1253 > 25 || var6)) {
                if (arg0.field1246 == -1) {
                    arg0.field1269 = arg0.field1247;
                } else {
                    arg0.field1269 = arg0.field1246;
                }
            }
        }
        arg0.field1241 &= 0x7FF;
    }

    @ObfuscatedName("bc.fw(Lbq;IIB)V")
    public static void method701(class75 arg0, int arg1, int arg2) {
        if (arg0.field1259 == arg1 && arg1 != -1) {
            int var3 = class261.method3746(arg1).field3622;
            if (var3 == 1) {
                arg0.field1272 = 0;
                arg0.field1248 = 0;
                arg0.field1282 = arg2;
                arg0.field1263 = 0;
            }
            if (var3 == 2) {
                arg0.field1263 = 0;
            }
        } else if (arg1 == -1 || arg0.field1259 == -1 || class261.method3746(arg1).field3606 >= class261.method3746(arg0.field1259).field3606) {
            arg0.field1259 = arg1;
            arg0.field1272 = 0;
            arg0.field1248 = 0;
            arg0.field1282 = arg2;
            arg0.field1263 = 0;
            arg0.field1270 = arg0.field1293;
        }
    }

    @ObfuscatedName("r.gr(B)V")
    public static void method19() {
        field969.method3116(226);
        class180 var0 = field969;
        int var1 = field1048 ? 2 : 1;
        var0.method2865(var1);
        field969.method2990(Statics.field618);
        field969.method2990(Statics.field2309);
    }

    @ObfuscatedName("client.f(I)V")
    public final void method768() {
        field1141 = class176.method2862() + 500L;
        this.method1084();
        if (field1088 != -1) {
            this.method1089(true);
        }
    }

    @ObfuscatedName("client.gt(I)V")
    public void method1084() {
        int var1 = Statics.field618;
        int var2 = Statics.field2309;
        if (this.field729 < var1) {
            int var3 = this.field729;
        }
        if (this.field727 < var2) {
            int var4 = this.field727;
        }
        if (Statics.field248 == null) {
            return;
        }
        try {
            client var5 = Statics.field3633;
            int var6 = field1048 ? 2 : 1;
            class53.method687(var5, "resize", new Object[] { var6 });
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.ga(B)V")
    public final void method1085() {
        if (field1088 != -1) {
            int var1 = field1088;
            if (class217.method1012(var1)) {
                method133(Statics.field628[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field1062; var2++) {
            if (field1133[var2]) {
                field1134[var2] = true;
            }
            field1031[var2] = field1133[var2];
            field1133[var2] = false;
        }
        field1132 = field936;
        field1077 = -1;
        field1004 = -1;
        Statics.field2156 = null;
        if (field1088 != -1) {
            field1062 = 0;
            method2686(field1088, 0, 0, Statics.field618, Statics.field2309, 0, 0, -1);
        }
        class282.method4554();
        if (field925) {
            method4758();
        } else if (field1077 != -1) {
            int var3 = field1077;
            int var4 = field1004;
            if (field1067 >= 2 || field941 != 0 || field1083) {
                int var5 = method8();
                String var6;
                if (field941 == 1 && field1067 < 2) {
                    var6 = class226.field2988 + class226.field3093 + field1082 + " " + class89.field1419;
                } else if (field1083 && field1067 < 2) {
                    var6 = field1079 + class226.field3093 + field1160 + " " + class89.field1419;
                } else {
                    String var7;
                    if (var5 < 0) {
                        var7 = "";
                    } else if (field964[var5].length() > 0) {
                        var7 = field1072[var5] + class226.field3093 + field964[var5];
                    } else {
                        var7 = field1072[var5];
                    }
                    var6 = var7;
                }
                if (field1067 > 2) {
                    var6 = var6 + class89.method3729(16777215) + " " + '/' + " " + (field1067 - 2) + class226.field3029;
                }
                Statics.field1323.method4409(var6, var3 + 4, var4 + 15, 16777215, 0, field936 / 1000);
            }
        }
        if (field1140 == 3) {
            for (int var8 = 0; var8 < field1062; var8++) {
                if (field1031[var8]) {
                    class282.method4562(field1058[var8], field1137[var8], field1138[var8], field1139[var8], 16711935, 128);
                } else if (field1134[var8]) {
                    class282.method4562(field1058[var8], field1137[var8], field1138[var8], field1139[var8], 16711680, 128);
                }
            }
        }
        class83.method21(Statics.field2137, Statics.field803.field1273, Statics.field803.field1240, field1003);
        field1003 = 0;
    }

    @ObfuscatedName("a.gp(Ljava/lang/String;ZI)V")
    public static final void method7(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field531.method4387(arg0, 250);
        int var6 = Statics.field531.method4388(arg0, 250) * 13;
        class282.method4614(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class282.method4589(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field531.method4420(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method3590(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field603.method744(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field1062; var11++) {
            if (field1138[var11] + field1058[var11] > var7 && field1058[var11] < var7 + var9 && field1139[var11] + field1137[var11] > var8 && field1137[var11] < var8 + var10) {
                field1134[var11] = true;
            }
        }
    }

    @ObfuscatedName("au.gn(IIIII)V")
    public static final void method234(int arg0, int arg1, int arg2, int arg3) {
        field958++;
        method557(class67.field831);
        boolean var4 = false;
        if (field1057 >= 0) {
            int var5 = class97.field1522;
            int[] var6 = class97.field1532;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field1057 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method557(class67.field829);
        }
        method1483(true);
        method557(var4 ? class67.field830 : class67.field835);
        method1483(false);
        for (class94 var8 = (class94) field1060.method3303(); var8 != null; var8 = (class94) field1060.method3297()) {
            if (Statics.field2137 != var8.field1504 || field936 > var8.field1486) {
                var8.method3290();
            } else if (field936 >= var8.field1483) {
                if (var8.field1492 > 0) {
                    class87 var9 = field963[var8.field1492 - 1];
                    if (var9 != null && var9.field1273 >= 0 && var9.field1273 < 13312 && var9.field1240 >= 0 && var9.field1240 < 13312) {
                        var8.method1609(var9.field1273, var9.field1240, method306(var9.field1273, var9.field1240, var8.field1504) - var8.field1482, field936);
                    }
                }
                if (var8.field1492 < 0) {
                    int var10 = -var8.field1492 - 1;
                    class75 var11;
                    if (field1049 == var10) {
                        var11 = Statics.field803;
                    } else {
                        var11 = field967[var10];
                    }
                    if (var11 != null && var11.field1273 >= 0 && var11.field1273 < 13312 && var11.field1240 >= 0 && var11.field1240 < 13312) {
                        var8.method1609(var11.field1273, var11.field1240, method306(var11.field1273, var11.field1240, var8.field1504) - var8.field1482, field936);
                    }
                }
                var8.method1610(field1003);
                Statics.field15.method2453(Statics.field2137, (int) var8.field1494, (int) var8.field1496, (int) var8.field1488, 60, var8, var8.field1502, -1, false);
            }
        }
        for (class85 var12 = (class85) field1061.method3303(); var12 != null; var12 = (class85) field1061.method3297()) {
            if (Statics.field2137 != var12.field1380 || var12.field1373) {
                var12.method3290();
            } else if (field936 >= var12.field1374) {
                var12.method1546(field1003);
                if (var12.field1373) {
                    var12.method3290();
                } else {
                    Statics.field15.method2453(var12.field1380, var12.field1375, var12.field1377, var12.field1378, 60, var12, 0, -1, false);
                }
            }
        }
        method1619(arg0, arg1, arg2, arg3, true);
        int var13 = field1188;
        int var14 = field1189;
        int var15 = field1190;
        int var16 = field946;
        class282.method4630(var13, var14, var13 + var15, var14 + var16);
        class137.method2358();
        if (!field1174) {
            int var17 = field1053;
            if (field1019 / 256 > var17) {
                var17 = field1019 / 256;
            }
            if (field1175[4] && field997[4] + 128 > var17) {
                var17 = field997[4] + 128;
            }
            int var18 = field952 + field1011 & 0x7FF;
            method1017(Statics.field861, method306(Statics.field803.field1273, Statics.field803.field1240, Statics.field2137) - field1016, Statics.field457, var17, var18, var17 * 3 + 600);
        }
        int var31;
        if (field1174) {
            int var32;
            if (Statics.field248.field1336) {
                var32 = Statics.field2137;
            } else {
                int var33 = method306(Statics.field2255, Statics.field2270, Statics.field2137);
                if (var33 - Statics.field768 >= 800 || (class62.field770[Statics.field2137][Statics.field2255 >> 7][Statics.field2270 >> 7] & 0x4) == 0) {
                    var32 = 3;
                } else {
                    var32 = Statics.field2137;
                }
            }
            var31 = var32;
        } else {
            int var19;
            if (Statics.field248.field1336) {
                var19 = Statics.field2137;
            } else {
                label517: {
                    int var20 = 3;
                    if (Statics.field891 < 310) {
                        int var21 = Statics.field2255 >> 7;
                        int var22 = Statics.field2270 >> 7;
                        int var23 = Statics.field803.field1273 >> 7;
                        int var24 = Statics.field803.field1240 >> 7;
                        if (var21 < 0 || var22 < 0 || var21 >= 104 || var22 >= 104) {
                            var19 = Statics.field2137;
                            break label517;
                        }
                        if ((class62.field770[Statics.field2137][var21][var22] & 0x4) != 0) {
                            var20 = Statics.field2137;
                        }
                        int var25;
                        if (var23 > var21) {
                            var25 = var23 - var21;
                        } else {
                            var25 = var21 - var23;
                        }
                        int var26;
                        if (var24 > var22) {
                            var26 = var24 - var22;
                        } else {
                            var26 = var22 - var24;
                        }
                        if (var25 > var26) {
                            int var27 = var26 * 65536 / var25;
                            int var28 = 32768;
                            while (var21 != var23) {
                                if (var21 < var23) {
                                    var21++;
                                } else if (var21 > var23) {
                                    var21--;
                                }
                                if ((class62.field770[Statics.field2137][var21][var22] & 0x4) != 0) {
                                    var20 = Statics.field2137;
                                }
                                var28 += var27;
                                if (var28 >= 65536) {
                                    var28 -= 65536;
                                    if (var22 < var24) {
                                        var22++;
                                    } else if (var22 > var24) {
                                        var22--;
                                    }
                                    if ((class62.field770[Statics.field2137][var21][var22] & 0x4) != 0) {
                                        var20 = Statics.field2137;
                                    }
                                }
                            }
                        } else {
                            int var29 = var25 * 65536 / var26;
                            int var30 = 32768;
                            while (var22 != var24) {
                                if (var22 < var24) {
                                    var22++;
                                } else if (var22 > var24) {
                                    var22--;
                                }
                                if ((class62.field770[Statics.field2137][var21][var22] & 0x4) != 0) {
                                    var20 = Statics.field2137;
                                }
                                var30 += var29;
                                if (var30 >= 65536) {
                                    var30 -= 65536;
                                    if (var21 < var23) {
                                        var21++;
                                    } else if (var21 > var23) {
                                        var21--;
                                    }
                                    if ((class62.field770[Statics.field2137][var21][var22] & 0x4) != 0) {
                                        var20 = Statics.field2137;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field803.field1273 >= 0 && Statics.field803.field1240 >= 0 && Statics.field803.field1273 < 13312 && Statics.field803.field1240 < 13312) {
                        if ((class62.field770[Statics.field2137][Statics.field803.field1273 >> 7][Statics.field803.field1240 >> 7] & 0x4) != 0) {
                            var20 = Statics.field2137;
                        }
                        var19 = var20;
                    } else {
                        var19 = Statics.field2137;
                    }
                }
            }
            var31 = var19;
        }
        int var34 = Statics.field2255;
        int var35 = Statics.field768;
        int var36 = Statics.field2270;
        int var37 = Statics.field891;
        int var38 = Statics.field348;
        for (int var39 = 0; var39 < 5; var39++) {
            if (field1175[var39]) {
                int var40 = (int) (Math.random() * (double) (field1165[var39] * 2 + 1) - (double) field1165[var39] + Math.sin((double) field1178[var39] / 100.0D * (double) field1179[var39]) * (double) field997[var39]);
                if (var39 == 0) {
                    Statics.field2255 += var40;
                }
                if (var39 == 1) {
                    Statics.field768 += var40;
                }
                if (var39 == 2) {
                    Statics.field2270 += var40;
                }
                if (var39 == 3) {
                    Statics.field348 = Statics.field348 + var40 & 0x7FF;
                }
                if (var39 == 4) {
                    Statics.field891 += var40;
                    if (Statics.field891 < 128) {
                        Statics.field891 = 128;
                    }
                    if (Statics.field891 > 383) {
                        Statics.field891 = 383;
                    }
                }
            }
        }
        int var41 = class60.field749;
        int var42 = class60.field750;
        if (class60.field743 != 0) {
            var41 = class60.field748;
            var42 = class60.field757;
        }
        if (var41 >= var13 && var41 < var13 + var15 && var42 >= var14 && var42 < var14 + var16) {
            int var43 = var41 - var13;
            int var44 = var42 - var14;
            class135.field2015 = var43;
            class135.field2009 = var44;
            class135.field2004 = true;
            class135.field2011 = 0;
            class135.field2005 = false;
        } else {
            class135.method233();
        }
        method59();
        class282.method4614(var13, var14, var15, var16, 0);
        method59();
        int var45 = class137.field2032;
        class137.field2032 = field1123;
        Statics.field15.method2483(Statics.field2255, Statics.field768, Statics.field2270, Statics.field891, Statics.field348, var31);
        class8.method24();
        class137.field2032 = var45;
        method59();
        Statics.field15.method2456();
        field1047 = 0;
        boolean var46 = false;
        int var47 = -1;
        int var48 = class97.field1522;
        int[] var49 = class97.field1532;
        for (int var50 = 0; var50 < field938 + var48; var50++) {
            class79 var51;
            if (var50 < var48) {
                var51 = field967[var49[var50]];
                if (field1057 == var49[var50]) {
                    var46 = true;
                    var47 = var50;
                    continue;
                }
            } else {
                var51 = field963[field950[var50 - var48]];
            }
            method192(var51, var50, var13, var14, var15, var16);
        }
        if (var46) {
            method192(field967[field1057], var47, var13, var14, var15, var16);
        }
        for (int var52 = 0; var52 < field1047; var52++) {
            int var53 = field1022[var52];
            int var54 = field1023[var52];
            int var55 = field1025[var52];
            int var56 = field1010[var52];
            boolean var57 = true;
            while (var57) {
                var57 = false;
                for (int var58 = 0; var58 < var52; var58++) {
                    if (var54 + 2 > field1023[var58] - field1010[var58] && var54 - var56 < field1023[var58] + 2 && var53 - var55 < field1025[var58] + field1022[var58] && var53 + var55 > field1022[var58] - field1025[var58] && field1023[var58] - field1010[var58] < var54) {
                        var54 = field1023[var58] - field1010[var58];
                        var57 = true;
                    }
                }
            }
            field1032 = field1022[var52];
            field993 = field1023[var52] = var54;
            String var59 = field1029[var52];
            if (field1090 == 0) {
                int var60 = 16776960;
                if (field939[var52] < 6) {
                    var60 = field1143[field939[var52]];
                }
                if (field939[var52] == 6) {
                    var60 = field958 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field939[var52] == 7) {
                    var60 = field958 % 20 < 10 ? 255 : 65535;
                }
                if (field939[var52] == 8) {
                    var60 = field958 % 20 < 10 ? 45056 : 8454016;
                }
                if (field939[var52] == 9) {
                    int var61 = 150 - field1028[var52];
                    if (var61 < 50) {
                        var60 = var61 * 1280 + 16711680;
                    } else if (var61 < 100) {
                        var60 = 16776960 - (var61 - 50) * 327680;
                    } else if (var61 < 150) {
                        var60 = (var61 - 100) * 5 + 65280;
                    }
                }
                if (field939[var52] == 10) {
                    int var62 = 150 - field1028[var52];
                    if (var62 < 50) {
                        var60 = var62 * 5 + 16711680;
                    } else if (var62 < 100) {
                        var60 = 16711935 - (var62 - 50) * 327680;
                    } else if (var62 < 150) {
                        var60 = (var62 - 100) * 327680 + 255 - (var62 - 100) * 5;
                    }
                }
                if (field939[var52] == 11) {
                    int var63 = 150 - field1028[var52];
                    if (var63 < 50) {
                        var60 = 16777215 - var63 * 327685;
                    } else if (var63 < 100) {
                        var60 = (var63 - 50) * 327685 + 65280;
                    } else if (var63 < 150) {
                        var60 = 16777215 - (var63 - 100) * 327680;
                    }
                }
                if (field1152[var52] == 0) {
                    Statics.field1323.method4393(var59, field1032 + var13, field993 + var14, var60, 0);
                }
                if (field1152[var52] == 1) {
                    Statics.field1323.method4395(var59, field1032 + var13, field993 + var14, var60, 0, field958);
                }
                if (field1152[var52] == 2) {
                    Statics.field1323.method4396(var59, field1032 + var13, field993 + var14, var60, 0, field958);
                }
                if (field1152[var52] == 3) {
                    Statics.field1323.method4405(var59, field1032 + var13, field993 + var14, var60, 0, field958, 150 - field1028[var52]);
                }
                if (field1152[var52] == 4) {
                    int var64 = (150 - field1028[var52]) * (Statics.field1323.method4408(var59) + 100) / 150;
                    class282.method4556(field1032 + var13 - 50, var14, field1032 + var13 + 50, var14 + var16);
                    Statics.field1323.method4422(var59, field1032 + var13 + 50 - var64, field993 + var14, var60, 0);
                    class282.method4630(var13, var14, var13 + var15, var14 + var16);
                }
                if (field1152[var52] == 5) {
                    int var65 = 150 - field1028[var52];
                    int var66 = 0;
                    if (var65 < 25) {
                        var66 = var65 - 25;
                    } else if (var65 > 125) {
                        var66 = var65 - 125;
                    }
                    class282.method4556(var13, field993 + var14 - Statics.field1323.field3650 - 1, var13 + var15, field993 + var14 + 5);
                    Statics.field1323.method4393(var59, field1032 + var13, field993 + var14 + var66, var60, 0);
                    class282.method4630(var13, var14, var13 + var15, var14 + var16);
                }
            } else {
                Statics.field1323.method4393(var59, field1032 + var13, field993 + var14, 16776960, 0);
            }
        }
        if (field944 == 2) {
            method1493((field947 - Statics.field669 << 7) + field981, (field1198 - Statics.field3674 << 7) + field951, field949 * 2);
            if (field1032 > -1 && field936 % 20 < 10) {
                Statics.field602[0].method4659(field1032 + var13 - 12, field993 + var14 - 28);
            }
        }
        ((class126) Statics.field2029).method2166(field1003);
        method4525(var13, var14, var15, var16);
        Statics.field2255 = var34;
        Statics.field768 = var35;
        Statics.field2270 = var36;
        Statics.field891 = var37;
        Statics.field348 = var38;
        if (field935) {
            byte var67 = 0;
            int var68 = class239.field3267 + class239.field3266 + var67;
            if (var68 == 0) {
                field935 = false;
            }
        }
        if (field935) {
            class282.method4614(var13, var14, var15, var16, 0);
            method7(class226.field2870, false);
        }
    }

    @ObfuscatedName("cz.gk(IIIIZI)V")
    public static final void method1619(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1181 - field1180) * var5 / 100 + field1180;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1186) {
            short var8 = field1186;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1185) {
                var6 = field1185;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class282.method4554();
                    class282.method4614(arg0, arg1, var10, arg3, -16777216);
                    class282.method4614(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1187) {
            short var11 = field1187;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1167) {
                var6 = field1167;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class282.method4554();
                    class282.method4614(arg0, arg1, arg2, var13, -16777216);
                    class282.method4614(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1183 - field1127) * var5 / 100 + field1127;
        field1123 = arg3 * var6 * var14 / 85504 << 1;
        if (field1190 != arg2 || field946 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class137.field2046[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class140.method2477(var15, 500, 800, arg2, arg3);
        }
        field1188 = arg0;
        field1189 = arg1;
        field1190 = arg2;
        field946 = arg3;
    }

    @ObfuscatedName("am.go(Lbz;I)V")
    public static final void method557(class67 arg0) {
        if (Statics.field803.field1273 >> 7 == field948 && Statics.field803.field1240 >> 7 == field1161) {
            field948 = 0;
        }
        int var1 = class97.field1522;
        int[] var2 = class97.field1532;
        int var3 = var1;
        if (class67.field831 == arg0 || class67.field829 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class75 var5;
            int var6;
            if (class67.field831 == arg0) {
                var5 = Statics.field803;
                var6 = Statics.field803.field915 << 14;
            } else if (class67.field829 == arg0) {
                var5 = field967[field1057];
                var6 = field1057 << 14;
            } else {
                var5 = field967[var2[var4]];
                var6 = var2[var4] << 14;
                if (class67.field830 == arg0 && field1057 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method1046() && !var5.field911) {
                var5.field909 = false;
                if ((field931 && var1 > 50 || var1 > 200) && class67.field831 != arg0 && var5.field1269 == var5.field1244) {
                    var5.field909 = true;
                }
                int var7 = var5.field1273 >> 7;
                int var8 = var5.field1240 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field904 == null || field936 < var5.field899 || field936 >= var5.field906) {
                        if ((var5.field1273 & 0x7F) == 64 && (var5.field1240 & 0x7F) == 64) {
                            if (field958 == field1059[var7][var8]) {
                                continue;
                            }
                            field1059[var7][var8] = field958;
                        }
                        var5.field898 = method306(var5.field1273, var5.field1240, Statics.field2137);
                        Statics.field15.method2453(Statics.field2137, var5.field1273, var5.field1240, var5.field898, 60, var5, var5.field1241, var6, var5.field1268);
                    } else {
                        var5.field909 = false;
                        var5.field898 = method306(var5.field1273, var5.field1240, Statics.field2137);
                        Statics.field15.method2454(Statics.field2137, var5.field1273, var5.field1240, var5.field898, 60, var5, var5.field1241, var6, var5.field892, var5.field900, var5.field907, var5.field908);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cq.gq(ZI)V")
    public static final void method1483(boolean arg0) {
        for (int var1 = 0; var1 < field938; var1++) {
            class87 var2 = field963[field950[var1]];
            int var3 = (field950[var1] << 14) + 536870912;
            if (var2 != null && var2.method1046() && var2.field1400.field3581 == arg0 && var2.field1400.method4302()) {
                int var4 = var2.field1273 >> 7;
                int var5 = var2.field1240 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1243 == 1 && (var2.field1273 & 0x7F) == 64 && (var2.field1240 & 0x7F) == 64) {
                        if (field958 == field1059[var4][var5]) {
                            continue;
                        }
                        field1059[var4][var5] = field958;
                    }
                    if (!var2.field1400.field3589) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field15.method2453(Statics.field2137, var2.field1273, var2.field1240, method306(var2.field1273 + (var2.field1243 * 64 - 64), var2.field1240 + (var2.field1243 * 64 - 64), Statics.field2137), var2.field1243 * 64 - 64 + 60, var2, var2.field1241, var3, var2.field1268);
                }
            }
        }
    }

    @ObfuscatedName("ah.gs(Lcd;IIIIIB)V")
    public static final void method192(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1046()) {
            return;
        }
        if (arg0 instanceof class87) {
            class259 var6 = ((class87) arg0).field1400;
            if (var6.field3586 != null) {
                var6 = var6.method4282();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class97.field1522;
        int[] var8 = class97.field1532;
        int var9 = 3;
        if (!arg0.field1264.method3269()) {
            Statics.method1544(arg0, arg0.field1289 + 15);
            for (class86 var10 = (class86) arg0.field1264.method3266(); var10 != null; var10 = (class86) arg0.field1264.method3277()) {
                class80 var11 = var10.method1550(field936);
                if (var11 != null) {
                    class249 var12 = var10.field1389;
                    class286 var13 = var12.method4051();
                    class286 var14 = var12.method4046();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3386;
                    } else {
                        if (var12.field3387 * 2 < var14.field3786) {
                            var15 = var12.field3387;
                        }
                        var16 = var14.field3786 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field936 - var11.field1299;
                    int var20 = var11.field1301 * var16 / var12.field3386;
                    int var23;
                    if (var11.field1302 > var19) {
                        int var21 = var12.field3382 == 0 ? 0 : var19 / var12.field3382 * var12.field3382;
                        int var22 = var11.field1300 * var16 / var12.field3386;
                        var23 = (var20 - var22) * var21 / var11.field1302 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1302 + var12.field3383 - var19;
                        if (var12.field3379 >= 0) {
                            var17 = (var24 << 8) / (var12.field3383 - var12.field3379);
                        }
                    }
                    if (var11.field1301 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field1032 + arg2 - (var16 >> 1);
                    int var26 = field993 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field1032 > -1) {
                            class282.method4614(var25, var26, var23, 5, 65280);
                            class282.method4614(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3788;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4674(var27, var26, var17);
                            class282.method4556(var27, var26, var27 + var28, var26 + var29);
                            var14.method4674(var27, var26, var17);
                        } else {
                            var13.method4659(var27, var26);
                            class282.method4556(var27, var26, var27 + var28, var26 + var29);
                            var14.method4659(var27, var26);
                        }
                        class282.method4630(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1552()) {
                    var10.method3290();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class75 var30 = (class75) arg0;
            if (var30.field911) {
                return;
            }
            if (var30.field895 != -1 || var30.field894 != -1) {
                Statics.method1544(arg0, arg0.field1289 + 15);
                if (field1032 > -1) {
                    if (var30.field895 != -1) {
                        Statics.field2443[var30.field895].method4659(field1032 + arg2 - 12, field993 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field894 != -1) {
                        Statics.field821[var30.field894].method4659(field1032 + arg2 - 12, field993 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field944 == 10 && field1184 == var8[arg1]) {
                Statics.method1544(arg0, arg0.field1289 + 15);
                if (field1032 > -1) {
                    Statics.field602[1].method4659(field1032 + arg2 - 12, field993 + arg3 - var9);
                }
            }
        } else {
            class259 var31 = ((class87) arg0).field1400;
            if (var31.field3586 != null) {
                var31 = var31.method4282();
            }
            if (var31.field3584 >= 0 && var31.field3584 < Statics.field821.length) {
                Statics.method1544(arg0, arg0.field1289 + 15);
                if (field1032 > -1) {
                    Statics.field821[var31.field3584].method4659(field1032 + arg2 - 12, field993 + arg3 - 30);
                }
            }
            if (field944 == 1 && field945 == field950[arg1 - var7] && field936 % 20 < 10) {
                Statics.method1544(arg0, arg0.field1289 + 15);
                if (field1032 > -1) {
                    Statics.field602[0].method4659(field1032 + arg2 - 12, field993 + arg3 - 28);
                }
            }
        }
        if (arg0.field1252 != null && (arg1 >= var7 || !arg0.field1254 && (field1144 == 4 || !arg0.field1285 && (field1144 == 0 || field1144 == 3 || field1144 == 1 && method159(((class75) arg0).field913, false))))) {
            Statics.method1544(arg0, arg0.field1289);
            if (field1032 > -1 && field1047 < field1021) {
                field1025[field1047] = Statics.field1323.method4408(arg0.field1252) / 2;
                field1010[field1047] = Statics.field1323.field3650;
                field1022[field1047] = field1032;
                field1023[field1047] = field993;
                field939[field1047] = arg0.field1256;
                field1152[field1047] = arg0.field1257;
                field1028[field1047] = arg0.field1265;
                field1029[field1047] = arg0.field1252;
                field1047++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1261[var32];
            int var34 = arg0.field1295[var32];
            class255 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field936) {
                    continue;
                }
                var35 = class255.method2793(arg0.field1295[var32]);
                var36 = var35.field3429;
                if (var35 != null && var35.field3440 != null) {
                    var35 = var35.method4124();
                    if (var35 == null) {
                        arg0.field1261[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1262[var32];
            class255 var38 = null;
            if (var37 >= 0) {
                var38 = class255.method2793(var37);
                if (var38 != null && var38.field3440 != null) {
                    var38 = var38.method4124();
                }
            }
            if (var33 - var36 <= field936) {
                if (var35 == null) {
                    arg0.field1261[var32] = -1;
                } else {
                    Statics.method1544(arg0, arg0.field1289 / 2);
                    if (field1032 > -1) {
                        if (var32 == 1) {
                            field993 -= 20;
                        }
                        if (var32 == 2) {
                            field1032 -= 15;
                            field993 -= 10;
                        }
                        if (var32 == 3) {
                            field1032 += 15;
                            field993 -= 10;
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
                        class286 var64 = var35.method4126();
                        if (var64 != null) {
                            var43 = var64.field3786;
                            int var65 = var64.field3788;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3785;
                        }
                        class286 var66 = var35.method4143();
                        if (var66 != null) {
                            var44 = var66.field3786;
                            int var67 = var66.field3788;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3785;
                        }
                        class286 var68 = var35.method4148();
                        if (var68 != null) {
                            var45 = var68.field3786;
                            int var69 = var68.field3788;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3785;
                        }
                        class286 var70 = var35.method4150();
                        if (var70 != null) {
                            var46 = var70.field3786;
                            int var71 = var70.field3788;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3785;
                        }
                        if (var38 != null) {
                            var51 = var38.method4126();
                            if (var51 != null) {
                                var55 = var51.field3786;
                                int var72 = var51.field3788;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3785;
                            }
                            var52 = var38.method4143();
                            if (var52 != null) {
                                var56 = var52.field3786;
                                int var73 = var52.field3788;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3785;
                            }
                            var53 = var38.method4148();
                            if (var53 != null) {
                                var57 = var53.field3786;
                                int var74 = var53.field3788;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3785;
                            }
                            var54 = var38.method4150();
                            if (var54 != null) {
                                var58 = var54.field3786;
                                int var75 = var54.field3788;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3785;
                            }
                        }
                        class264 var76 = var35.method4147();
                        if (var76 == null) {
                            var76 = Statics.field619;
                        }
                        class264 var77;
                        if (var38 == null) {
                            var77 = Statics.field619;
                        } else {
                            var77 = var38.method4147();
                            if (var77 == null) {
                                var77 = Statics.field619;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4123(arg0.field1260[var32]);
                        int var83 = var76.method4408(var82);
                        if (var38 != null) {
                            var79 = var38.method4123(arg0.field1274[var32]);
                            var81 = var77.method4408(var79);
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
                        int var100 = arg0.field1261[var32] - field936;
                        int var101 = var35.field3434 - var35.field3434 * var100 / var35.field3429;
                        int var102 = var35.field3435 * var100 / var35.field3429 + -var35.field3435;
                        int var103 = field1032 + arg2 - (var92 >> 1) + var101;
                        int var104 = field993 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3441 + var104 + 15;
                        int var108 = var107 - var76.field3651;
                        int var109 = var76.field3652 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3441 + var104 + 15;
                            int var111 = var110 - var77.field3651;
                            int var112 = var77.field3652 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3436 >= 0) {
                            var115 = (var100 << 8) / (var35.field3429 - var35.field3436);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4674(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4674(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4674(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4674(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4397(var82, var90 + var103, var107, var35.field3439, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4674(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4674(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4674(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4674(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4397(var79, var98 + var103, var110, var38.field3439, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4659(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4659(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4659(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4659(var93 + var103 - var50, var104);
                            }
                            var76.method4422(var82, var90 + var103, var107, var35.field3439 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4659(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4659(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4659(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4659(var97 + var103 - var62, var104);
                                }
                                var77.method4422(var79, var98 + var103, var110, var38.field3439 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ji.gf(IIIIB)V")
    public static final void method4525(int arg0, int arg1, int arg2, int arg3) {
        if (field1037 == 1) {
            Statics.field3259[field968 / 100].method4659(field1191 - 8, field1035 - 8);
        }
        if (field1037 == 2) {
            Statics.field3259[field968 / 100 + 4].method4659(field1191 - 8, field1035 - 8);
        }
        field1046 = 0;
        int var4 = (Statics.field803.field1273 >> 7) + Statics.field669;
        int var5 = (Statics.field803.field1240 >> 7) + Statics.field3674;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field1046 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field1046 = 1;
        }
        if (field1046 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field1046 = 0;
        }
    }

    @ObfuscatedName("cq.gw(IIII)V")
    public static final void method1493(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field1032 = -1;
            field993 = -1;
            return;
        }
        int var3 = method306(arg0, arg1, Statics.field2137) - arg2;
        int var4 = arg0 - Statics.field2255;
        int var5 = var3 - Statics.field768;
        int var6 = arg1 - Statics.field2270;
        int var7 = class137.field2046[Statics.field891];
        int var8 = class137.field2023[Statics.field891];
        int var9 = class137.field2046[Statics.field348];
        int var10 = class137.field2023[Statics.field348];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field1032 = field1123 * var11 / var15 + field1190 / 2;
            field993 = field1123 * var14 / var15 + field946 / 2;
        } else {
            field1032 = -1;
            field993 = -1;
        }
    }

    @ObfuscatedName("ar.gc(IIII)I")
    public static final int method306(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field770[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field782[var5][var3][var4] + class62.field782[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field782[var5][var3][var4 + 1] + class62.field782[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bu.gi(IIIIIIB)V")
    public static final void method1017(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class137.field2046[var6];
            int var12 = class137.field2023[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class137.field2046[var7];
            int var15 = class137.field2023[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field2255 = arg0 - var8;
        Statics.field768 = arg1 - var9;
        Statics.field2270 = arg2 - var10;
        Statics.field891 = arg3;
        Statics.field348 = arg4;
    }

    @ObfuscatedName("w.gy(ZI)V")
    public static final void method2(boolean arg0) {
        field988 = arg0;
        if (!field988) {
            int var1 = field971.method2915();
            int var2 = field971.method2915();
            int var3 = field971.method2882();
            Statics.field416 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field416[var4][var5] = field971.method2885();
                }
            }
            Statics.field692 = new int[var3];
            Statics.field395 = new int[var3];
            Statics.field617 = new int[var3];
            Statics.field2430 = new byte[var3][];
            Statics.field291 = new byte[var3][];
            boolean var6 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var1 / 8 == 48) {
                var6 = true;
            }
            if (var2 / 8 == 48 && var1 / 8 == 148) {
                var6 = true;
            }
            int var7 = 0;
            for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
                for (int var9 = (var1 - 6) / 8; var9 <= (var1 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    if (!var6 || var9 != 49 && var9 != 149 && var9 != 147 && var8 != 50 && (var8 != 49 || var9 != 47)) {
                        Statics.field692[var7] = var10;
                        Statics.field395[var7] = Statics.field2158.method3800("m" + var8 + "_" + var9);
                        Statics.field617[var7] = Statics.field2158.method3800("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method1916(var2, var1, true);
            return;
        }
        int var11 = field971.method2914();
        int var12 = field971.method2915();
        boolean var13 = field971.method3026() == 1;
        int var14 = field971.method2882();
        field971.method3129();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field971.method3107(1);
                    if (var18 == 1) {
                        field989[var15][var16][var17] = field971.method3107(26);
                    } else {
                        field989[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field971.method3103();
        Statics.field416 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field416[var19][var20] = field971.method2885();
            }
        }
        Statics.field692 = new int[var14];
        Statics.field395 = new int[var14];
        Statics.field617 = new int[var14];
        Statics.field2430 = new byte[var14][];
        Statics.field291 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field989[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field692[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field692[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field395[var21] = Statics.field2158.method3800("m" + var30 + "_" + var31);
                            Statics.field617[var21] = Statics.field2158.method3800("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method1916(var12, var11, !var13);
    }

    @ObfuscatedName("dt.gj(IIZI)V")
    public static final void method1916(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field1322 == arg0 && Statics.field1778 == arg1) {
            return;
        }
        Statics.field1322 = arg0;
        Statics.field1778 = arg1;
        method2180(25);
        method7(class226.field2870, true);
        int var3 = Statics.field669;
        int var4 = Statics.field3674;
        Statics.field669 = (arg0 - 6) * 8;
        Statics.field3674 = (arg1 - 6) * 8;
        int var5 = Statics.field669 - var3;
        int var6 = Statics.field3674 - var4;
        int var7 = Statics.field669;
        int var8 = Statics.field3674;
        for (int var9 = 0; var9 < 32768; var9++) {
            class87 var10 = field963[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1294[var11] -= var5;
                    var10.field1296[var11] -= var6;
                }
                var10.field1273 -= var5 * 128;
                var10.field1240 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class75 var13 = field967[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1294[var14] -= var5;
                    var13.field1296[var14] -= var6;
                }
                var13.field1273 -= var5 * 128;
                var13.field1240 -= var6 * 128;
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
                        field986[var25][var21][var22] = field986[var25][var23][var24];
                    } else {
                        field986[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class77 var26 = (class77) field1087.method3303(); var26 != null; var26 = (class77) field1087.method3297()) {
            var26.field1222 -= var5;
            var26.field1213 -= var6;
            if (var26.field1222 < 0 || var26.field1213 < 0 || var26.field1222 >= 104 || var26.field1213 >= 104) {
                var26.method3290();
            }
        }
        if (field948 != 0) {
            field948 -= var5;
            field1161 -= var6;
        }
        field1182 = 0;
        field1174 = false;
        field1155 = -1;
        field1061.method3301();
        field1060.method3301();
        for (int var27 = 0; var27 < 4; var27++) {
            field987[var27].method2744();
        }
    }

    @ObfuscatedName("ar.gu(ZI)V")
    public static final void method304(boolean arg0) {
        method59();
        field1207++;
        if (field1207 < 50 && !arg0) {
            return;
        }
        field1207 = 0;
        if (field980 || Statics.field3329 == null) {
            return;
        }
        field969.method3116(203);
        try {
            Statics.field3329.method2723(field969.field2405, 0, field969.field2399);
            field969.field2399 = 0;
        } catch (IOException var2) {
            field980 = true;
        }
    }

    @ObfuscatedName("f.gh(I)V")
    public static final void method106() {
        method304(false);
        field1084 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2430.length; var1++) {
            if (Statics.field395[var1] != -1 && Statics.field2430[var1] == null) {
                Statics.field2430[var1] = Statics.field2158.method3768(Statics.field395[var1], 0);
                if (Statics.field2430[var1] == null) {
                    var0 = false;
                    field1084++;
                }
            }
            if (Statics.field617[var1] != -1 && Statics.field291[var1] == null) {
                Statics.field291[var1] = Statics.field2158.method3769(Statics.field617[var1], 0, Statics.field416[var1]);
                if (Statics.field291[var1] == null) {
                    var0 = false;
                    field1084++;
                }
            }
        }
        if (!var0) {
            field1105 = 1;
            return;
        }
        field984 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2430.length; var3++) {
            byte[] var4 = Statics.field291[var3];
            if (var4 != null) {
                int var5 = (Statics.field692[var3] >> 8) * 64 - Statics.field669;
                int var6 = (Statics.field692[var3] & 0xFF) * 64 - Statics.field3674;
                if (field988) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class62.method4369(var4, var5, var6);
            }
        }
        if (!var2) {
            field1105 = 2;
            return;
        }
        if (field1105 != 0) {
            method7(class226.field2870 + class89.field1423 + class89.field1417 + 100 + "%" + class89.field1418, true);
        }
        method59();
        method218();
        method59();
        Statics.field15.method2443();
        method59();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field987[var7].method2744();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class62.field770[var8][var9][var10] = 0;
                }
            }
        }
        method59();
        class62.method469();
        int var11 = Statics.field2430.length;
        class83.method2842();
        method304(true);
        if (!field988) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field692[var12] >> 8) * 64 - Statics.field669;
                int var14 = (Statics.field692[var12] & 0xFF) * 64 - Statics.field3674;
                byte[] var15 = Statics.field2430[var12];
                if (var15 != null) {
                    method59();
                    int var16 = Statics.field1322 * 8 - 48;
                    int var17 = Statics.field1778 * 8 - 48;
                    class162[] var18 = field987;
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 64; var20++) {
                            for (int var21 = 0; var21 < 64; var21++) {
                                if (var13 + var20 > 0 && var13 + var20 < 103 && var14 + var21 > 0 && var14 + var21 < 103) {
                                    var18[var19].field2307[var13 + var20][var14 + var21] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class174 var22 = new class174(var15);
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 64; var24++) {
                            for (int var25 = 0; var25 < 64; var25++) {
                                class62.method1547(var22, var23, var13 + var24, var14 + var25, var16, var17, 0);
                            }
                        }
                    }
                }
            }
            for (int var26 = 0; var26 < var11; var26++) {
                int var27 = (Statics.field692[var26] >> 8) * 64 - Statics.field669;
                int var28 = (Statics.field692[var26] & 0xFF) * 64 - Statics.field3674;
                byte[] var29 = Statics.field2430[var26];
                if (var29 == null && Statics.field1778 < 800) {
                    method59();
                    class62.method193(var27, var28, 64, 64);
                }
            }
            method304(true);
            for (int var30 = 0; var30 < var11; var30++) {
                byte[] var31 = Statics.field291[var30];
                if (var31 != null) {
                    int var32 = (Statics.field692[var30] >> 8) * 64 - Statics.field669;
                    int var33 = (Statics.field692[var30] & 0xFF) * 64 - Statics.field3674;
                    method59();
                    class140 var34 = Statics.field15;
                    class162[] var35 = field987;
                    class174 var36 = new class174(var31);
                    int var37 = -1;
                    while (true) {
                        int var38 = var36.method2893();
                        if (var38 == 0) {
                            break;
                        }
                        var37 += var38;
                        int var39 = 0;
                        while (true) {
                            int var40 = var36.method2893();
                            if (var40 == 0) {
                                break;
                            }
                            var39 += var40 - 1;
                            int var41 = var39 & 0x3F;
                            int var42 = var39 >> 6 & 0x3F;
                            int var43 = var39 >> 12;
                            int var44 = var36.method3061();
                            int var45 = var44 >> 2;
                            int var46 = var44 & 0x3;
                            int var47 = var32 + var42;
                            int var48 = var33 + var41;
                            if (var47 > 0 && var48 > 0 && var47 < 103 && var48 < 103) {
                                int var49 = var43;
                                if ((class62.field770[1][var47][var48] & 0x2) == 2) {
                                    var49 = var43 - 1;
                                }
                                class162 var50 = null;
                                if (var49 >= 0) {
                                    var50 = var35[var49];
                                }
                                class62.method3585(var43, var47, var48, var37, var46, var45, var34, var50);
                            }
                        }
                    }
                }
            }
        }
        if (field988) {
            for (int var51 = 0; var51 < 4; var51++) {
                method59();
                for (int var52 = 0; var52 < 13; var52++) {
                    for (int var53 = 0; var53 < 13; var53++) {
                        boolean var54 = false;
                        int var55 = field989[var51][var52][var53];
                        if (var55 != -1) {
                            int var56 = var55 >> 24 & 0x3;
                            int var57 = var55 >> 1 & 0x3;
                            int var58 = var55 >> 14 & 0x3FF;
                            int var59 = var55 >> 3 & 0x7FF;
                            int var60 = (var58 / 8 << 8) + var59 / 8;
                            for (int var61 = 0; var61 < Statics.field692.length; var61++) {
                                if (Statics.field692[var61] == var60 && Statics.field2430[var61] != null) {
                                    class62.method310(Statics.field2430[var61], var51, var52 * 8, var53 * 8, var56, (var58 & 0x7) * 8, (var59 & 0x7) * 8, var57, field987);
                                    var54 = true;
                                    break;
                                }
                            }
                        }
                        if (!var54) {
                            int var62 = var51;
                            int var63 = var52 * 8;
                            int var64 = var53 * 8;
                            for (int var65 = 0; var65 < 8; var65++) {
                                for (int var66 = 0; var66 < 8; var66++) {
                                    class62.field782[var62][var63 + var65][var64 + var66] = 0;
                                }
                            }
                            if (var63 > 0) {
                                for (int var67 = 1; var67 < 8; var67++) {
                                    class62.field782[var62][var63][var64 + var67] = class62.field782[var62][var63 - 1][var64 + var67];
                                }
                            }
                            if (var64 > 0) {
                                for (int var68 = 1; var68 < 8; var68++) {
                                    class62.field782[var62][var63 + var68][var64] = class62.field782[var62][var63 + var68][var64 - 1];
                                }
                            }
                            if (var63 > 0 && class62.field782[var62][var63 - 1][var64] != 0) {
                                class62.field782[var62][var63][var64] = class62.field782[var62][var63 - 1][var64];
                            } else if (var64 > 0 && class62.field782[var62][var63][var64 - 1] != 0) {
                                class62.field782[var62][var63][var64] = class62.field782[var62][var63][var64 - 1];
                            } else if (var63 > 0 && var64 > 0 && class62.field782[var62][var63 - 1][var64 - 1] != 0) {
                                class62.field782[var62][var63][var64] = class62.field782[var62][var63 - 1][var64 - 1];
                            }
                        }
                    }
                }
            }
            for (int var69 = 0; var69 < 13; var69++) {
                for (int var70 = 0; var70 < 13; var70++) {
                    int var71 = field989[0][var69][var70];
                    if (var71 == -1) {
                        class62.method193(var69 * 8, var70 * 8, 8, 8);
                    }
                }
            }
            method304(true);
            for (int var72 = 0; var72 < 4; var72++) {
                method59();
                for (int var73 = 0; var73 < 13; var73++) {
                    for (int var74 = 0; var74 < 13; var74++) {
                        int var75 = field989[var72][var73][var74];
                        if (var75 != -1) {
                            int var76 = var75 >> 24 & 0x3;
                            int var77 = var75 >> 1 & 0x3;
                            int var78 = var75 >> 14 & 0x3FF;
                            int var79 = var75 >> 3 & 0x7FF;
                            int var80 = (var78 / 8 << 8) + var79 / 8;
                            for (int var81 = 0; var81 < Statics.field692.length; var81++) {
                                if (Statics.field692[var81] == var80 && Statics.field291[var81] != null) {
                                    class62.method12(Statics.field291[var81], var72, var73 * 8, var74 * 8, var76, (var78 & 0x7) * 8, (var79 & 0x7) * 8, var77, Statics.field15, field987);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method304(true);
        method218();
        method59();
        class62.method1398(Statics.field15, field987);
        method304(true);
        int var82 = class62.field771;
        if (var82 > Statics.field2137) {
            var82 = Statics.field2137;
        }
        if (var82 < Statics.field2137 - 1) {
            int var83 = Statics.field2137 - 1;
        }
        if (field931) {
            Statics.field15.method2509(class62.field771);
        } else {
            Statics.field15.method2509(0);
        }
        for (int var84 = 0; var84 < 104; var84++) {
            for (int var85 = 0; var85 < 104; var85++) {
                method2645(var84, var85);
            }
        }
        method59();
        for (class77 var86 = (class77) field1087.method3303(); var86 != null; var86 = (class77) field1087.method3297()) {
            if (var86.field1221 == -1) {
                var86.field1220 = 0;
                method11(var86);
            } else {
                var86.method3290();
            }
        }
        class256.field3488.method3232();
        if (Statics.field3633.method858()) {
            field969.method3116(219);
            field969.method2868(1057001181);
        }
        if (!field988) {
            int var87 = (Statics.field1322 - 6) / 8;
            int var88 = (Statics.field1322 + 6) / 8;
            int var89 = (Statics.field1778 - 6) / 8;
            int var90 = (Statics.field1778 + 6) / 8;
            for (int var91 = var87 - 1; var91 <= var88 + 1; var91++) {
                for (int var92 = var89 - 1; var92 <= var90 + 1; var92++) {
                    if (var91 < var87 || var91 > var88 || var92 < var89 || var92 > var90) {
                        Statics.field2158.method3797("m" + var91 + "_" + var92);
                        Statics.field2158.method3797("l" + var91 + "_" + var92);
                    }
                }
            }
        }
        method2180(30);
        method59();
        class62.method685();
        field969.method3116(111);
        class59.method1628();
    }

    @ObfuscatedName("hv.gd(IIIIII)V")
    public static final void method3740(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field15.method2468(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field15.method2472(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field759.field3791;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class256 var13 = class256.method4092(var12);
            if (var13.field3476 == -1) {
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
                class285 var14 = Statics.field247[var13.field3476];
                if (var14 != null) {
                    int var15 = (var13.field3462 * 4 - var14.field3779) / 2;
                    int var16 = (var13.field3450 * 4 - var14.field3784) / 2;
                    var14.method4642(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3450) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field15.method2470(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field15.method2472(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class256 var22 = class256.method4092(var21);
            if (var22.field3476 != -1) {
                class285 var23 = Statics.field247[var22.field3476];
                if (var23 != null) {
                    int var24 = (var22.field3462 * 4 - var23.field3779) / 2;
                    int var25 = (var22.field3450 * 4 - var23.field3784) / 2;
                    var23.method4642(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3450) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field759.field3791;
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
        int var29 = Statics.field15.method2471(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class256 var31 = class256.method4092(var30);
        if (var31.field3476 == -1) {
            return;
        }
        class285 var32 = Statics.field247[var31.field3476];
        if (var32 != null) {
            int var33 = (var31.field3462 * 4 - var32.field3779) / 2;
            int var34 = (var31.field3450 * 4 - var32.field3784) / 2;
            var32.method4642(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3450) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.gx(I)Z")
    public final boolean method1086() {
        if (Statics.field3329 == null) {
            return false;
        }
        try {
            int var1 = Statics.field3329.method2710();
            if (var1 == 0) {
                return false;
            }
            if (field982 == -1) {
                Statics.field3329.method2712(field971.field2405, 0, 1);
                field971.field2399 = 0;
                field982 = field971.method3106();
                field972 = class273.field3710[field982];
                var1--;
            }
            if (field972 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                Statics.field3329.method2712(field971.field2405, 0, 1);
                field972 = field971.field2405[0] & 0xFF;
                var1--;
            }
            if (field972 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                Statics.field3329.method2712(field971.field2405, 0, 2);
                field971.field2399 = 0;
                field972 = field971.method2882();
                var1 -= 2;
            }
            if (var1 < field972) {
                return false;
            }
            field971.field2399 = 0;
            Statics.field3329.method2712(field971.field2405, 0, field972);
            field974 = 0;
            field978 = field977;
            field977 = field965;
            field965 = field982;
            if (field982 == 51) {
                field1174 = false;
                for (int var2 = 0; var2 < 5; var2++) {
                    field1175[var2] = false;
                }
                field982 = -1;
                return true;
            }
            if (field982 == 136) {
                int var3 = field971.method2924();
                class217 var4 = class217.method3122(var3);
                var4.field2662 = 3;
                var4.field2699 = Statics.field803.field917.method3617();
                method1571(var4);
                field982 = -1;
                return true;
            }
            if (field982 == 228) {
                String var5 = field971.method2884();
                int var6 = field971.method2882();
                byte var7 = field971.method2930();
                boolean var8 = false;
                if (var7 == -128) {
                    var8 = true;
                }
                if (var8) {
                    if (Statics.field417 == 0) {
                        field982 = -1;
                        return true;
                    }
                    boolean var9 = false;
                    int var10;
                    for (var10 = 0; var10 < Statics.field417 && (!Statics.field263[var10].field919.equals(var5) || Statics.field263[var10].field921 != var6); var10++) {
                    }
                    if (var10 < Statics.field417) {
                        while (var10 < Statics.field417 - 1) {
                            Statics.field263[var10] = Statics.field263[var10 + 1];
                            var10++;
                        }
                        Statics.field417--;
                        Statics.field263[Statics.field417] = null;
                    }
                } else {
                    field971.method2884();
                    class76 var11 = new class76();
                    var11.field919 = var5;
                    var11.field920 = class268.method1070(var11.field919, Statics.field929);
                    var11.field921 = var6;
                    var11.field922 = var7;
                    int var12;
                    for (var12 = Statics.field417 - 1; var12 >= 0; var12--) {
                        int var13 = Statics.field263[var12].field920.compareTo(var11.field920);
                        if (var13 == 0) {
                            Statics.field263[var12].field921 = var6;
                            Statics.field263[var12].field922 = var7;
                            if (var5.equals(Statics.field803.field913)) {
                                Statics.field511 = var7;
                            }
                            field1122 = field1113;
                            field982 = -1;
                            return true;
                        }
                        if (var13 < 0) {
                            break;
                        }
                    }
                    if (Statics.field417 >= Statics.field263.length) {
                        field982 = -1;
                        return true;
                    }
                    for (int var14 = Statics.field417 - 1; var14 > var12; var14--) {
                        Statics.field263[var14 + 1] = Statics.field263[var14];
                    }
                    if (Statics.field417 == 0) {
                        Statics.field263 = new class76[100];
                    }
                    Statics.field263[var12 + 1] = var11;
                    Statics.field417++;
                    if (var5.equals(Statics.field803.field913)) {
                        Statics.field511 = var7;
                    }
                }
                field1122 = field1113;
                field982 = -1;
                return true;
            }
            if (field982 == 118) {
                for (int var15 = 0; var15 < class212.field2613.length; var15++) {
                    if (class212.field2613[var15] != class212.field2612[var15]) {
                        class212.field2613[var15] = class212.field2612[var15];
                        method1481(var15);
                        field1114[++field976 - 1 & 0x1F] = var15;
                    }
                }
                field982 = -1;
                return true;
            }
            if (field982 == 64) {
                field1174 = true;
                Statics.field1209 = field971.method3061();
                Statics.field2592 = field971.method3061();
                Statics.field1516 = field971.method2882();
                Statics.field501 = field971.method3061();
                Statics.field458 = field971.method3061();
                if (Statics.field458 >= 100) {
                    Statics.field2255 = Statics.field1209 * 128 + 64;
                    Statics.field2270 = Statics.field2592 * 128 + 64;
                    Statics.field768 = method306(Statics.field2255, Statics.field2270, Statics.field2137) - Statics.field1516;
                }
                field982 = -1;
                return true;
            }
            if (field982 == 200) {
                int var16 = field971.method3061();
                int var17 = field971.method3061();
                int var18 = field971.method3061();
                int var19 = field971.method3061();
                field1175[var16] = true;
                field1165[var16] = var17;
                field997[var16] = var18;
                field1178[var16] = var19;
                field1179[var16] = 0;
                field982 = -1;
                return true;
            }
            if (field982 == 106) {
                int var20 = field971.method2882();
                int var21 = field971.method2885();
                int var22 = field971.method2914();
                int var23 = field971.method3052();
                class217 var24 = class217.method3122(var21);
                if (var24.field2706 != var20 || var24.field2707 != var22 || var24.field2651 != var23) {
                    var24.field2706 = var20;
                    var24.field2707 = var22;
                    var24.field2651 = var23;
                    method1571(var24);
                }
                field982 = -1;
                return true;
            }
            if (field982 == 67) {
                String var25 = field971.method2884();
                Object[] var26 = new Object[var25.length() + 1];
                for (int var27 = var25.length() - 1; var27 >= 0; var27--) {
                    if (var25.charAt(var27) == 's') {
                        var26[var27 + 1] = field971.method2884();
                    } else {
                        var26[var27 + 1] = Integer.valueOf(field971.method2885());
                    }
                }
                var26[0] = Integer.valueOf(field971.method2885());
                class70 var28 = new class70();
                var28.field858 = var26;
                class84.method68(var28);
                field982 = -1;
                return true;
            }
            if (field982 == 41) {
                int var29 = field971.method2882();
                int var30 = field971.method3061();
                int var31 = field971.method2882();
                method319(var29, var30, var31);
                field982 = -1;
                return true;
            }
            if (field982 == 245) {
                class97.method1396();
                for (int var32 = 0; var32 < 2048; var32++) {
                    field967[var32] = null;
                }
                class97.method111(field971);
                field982 = -1;
                return true;
            }
            if (field982 == 174) {
                int var33 = field971.method3061();
                if (field971.method3061() == 0) {
                    field1145[var33] = new class17();
                    field971.field2399 += 18;
                } else {
                    field971.field2399--;
                    field1145[var33] = new class17(field971, false);
                }
                field1111 = field1113;
                field982 = -1;
                return true;
            }
            if (field982 == 229) {
                field1174 = true;
                Statics.field833 = field971.method3061();
                Statics.field2439 = field971.method3061();
                Statics.field2290 = field971.method2882();
                Statics.field2415 = field971.method3061();
                Statics.field2224 = field971.method3061();
                if (Statics.field2224 >= 100) {
                    int var34 = Statics.field833 * 128 + 64;
                    int var35 = Statics.field2439 * 128 + 64;
                    int var36 = method306(var34, var35, Statics.field2137) - Statics.field2290;
                    int var37 = var34 - Statics.field2255;
                    int var38 = var36 - Statics.field768;
                    int var39 = var35 - Statics.field2270;
                    int var40 = (int) Math.sqrt((double) (var37 * var37 + var39 * var39));
                    Statics.field891 = (int) (Math.atan2((double) var38, (double) var40) * 325.949D) & 0x7FF;
                    Statics.field348 = (int) (Math.atan2((double) var37, (double) var39) * -325.949D) & 0x7FF;
                    if (Statics.field891 < 128) {
                        Statics.field891 = 128;
                    }
                    if (Statics.field891 > 383) {
                        Statics.field891 = 383;
                    }
                }
                field982 = -1;
                return true;
            }
            if (field982 == 145) {
                Statics.field429 = field971.method3058();
                Statics.field901 = field971.method3061();
                for (int var41 = Statics.field901; var41 < Statics.field901 + 8; var41++) {
                    for (int var42 = Statics.field429; var42 < Statics.field429 + 8; var42++) {
                        if (field986[Statics.field2137][var41][var42] != null) {
                            field986[Statics.field2137][var41][var42] = null;
                            method2645(var41, var42);
                        }
                    }
                }
                for (class77 var43 = (class77) field1087.method3303(); var43 != null; var43 = (class77) field1087.method3297()) {
                    if (var43.field1222 >= Statics.field901 && var43.field1222 < Statics.field901 + 8 && var43.field1213 >= Statics.field429 && var43.field1213 < Statics.field429 + 8 && Statics.field2137 == var43.field1216) {
                        var43.field1221 = 0;
                    }
                }
                field982 = -1;
                return true;
            }
            if (field982 == 29) {
                method1026();
                field1093 = field971.method3061();
                field1125 = field1113;
                field982 = -1;
                return true;
            }
            if (field982 == 95) {
                boolean var44 = field971.method3061() == 1;
                if (var44) {
                    Statics.field600 = class176.method2862() - field971.method2910();
                    Statics.field834 = new class14(field971, true);
                } else {
                    Statics.field834 = null;
                }
                field1005 = field1113;
                field982 = -1;
                return true;
            }
            if (field982 == 27) {
                field1194 = 1;
                field1026 = field1113;
                field982 = -1;
                return true;
            }
            if (field982 == 184) {
                for (int var45 = 0; var45 < field967.length; var45++) {
                    if (field967[var45] != null) {
                        field967[var45].field1259 = -1;
                    }
                }
                for (int var46 = 0; var46 < field963.length; var46++) {
                    if (field963[var46] != null) {
                        field963[var46].field1259 = -1;
                    }
                }
                field982 = -1;
                return true;
            }
            if (field982 == 21) {
                int var47 = field971.method2907();
                String var48 = field971.method2884();
                int var49 = field971.method3061();
                if (var49 >= 1 && var49 <= 8) {
                    if (var48.equalsIgnoreCase("null")) {
                        var48 = null;
                    }
                    field1064[var49 - 1] = var48;
                    field1096[var49 - 1] = var47 == 0;
                }
                field982 = -1;
                return true;
            }
            if (field982 == 201) {
                int var50 = field971.method2923();
                int var51 = field971.method3052();
                class217 var52 = class217.method3122(var50);
                if (var52.field2662 != 2 || var52.field2699 != var51) {
                    var52.field2662 = 2;
                    var52.field2699 = var51;
                    method1571(var52);
                }
                field982 = -1;
                return true;
            }
            if (field982 == 151) {
                int var53 = field971.method2914();
                int var54 = field971.method2924();
                int var55 = field971.method3052();
                class217 var56 = class217.method3122(var54);
                var56.field2711 = (var53 << 16) + var55;
                field982 = -1;
                return true;
            }
            if (field982 == 141) {
                int var57 = field971.method2922();
                int var58 = field971.method2922();
                int var59 = field971.method2885();
                class217 var60 = class217.method3122(var59);
                if (var60.field2701 != var57 || var60.field2665 != var58 || var60.field2660 != 0 || var60.field2661 != 0) {
                    var60.field2701 = var57;
                    var60.field2665 = var58;
                    var60.field2660 = 0;
                    var60.field2661 = 0;
                    method1571(var60);
                    this.method1218(var60);
                    if (var60.field2657 == 0) {
                        method485(Statics.field628[var59 >> 16], var60, false);
                    }
                }
                field982 = -1;
                return true;
            }
            if (field982 == 111) {
                String var61 = field971.method2884();
                int var62 = field971.method2924();
                class217 var63 = class217.method3122(var62);
                if (!var61.equals(var63.field2715)) {
                    var63.field2715 = var61;
                    method1571(var63);
                }
                field982 = -1;
                return true;
            }
            if (field982 == 195) {
                int var64 = field971.method2924();
                Statics.field340 = Statics.field721.method2676(var64);
                field982 = -1;
                return true;
            }
            if (field982 == 107) {
                int var65 = field971.method2882();
                class64 var66 = (class64) class64.field806.method3249((long) var65);
                if (var66 != null) {
                    var66.method3290();
                }
                field1116[++field1117 - 1 & 0x1F] = var65 & 0x7FFF;
                field982 = -1;
                return true;
            }
            if (field982 == 114) {
                Statics.field429 = field971.method3061();
                Statics.field901 = field971.method3058();
                while (field971.field2399 < field972) {
                    field982 = field971.method3061();
                    method1424();
                }
                field982 = -1;
                return true;
            }
            if (field982 == 17) {
                int var67 = field972 + field971.field2399;
                int var68 = field971.method2882();
                int var69 = field971.method2882();
                if (field1088 != var68) {
                    field1088 = var68;
                    this.method1089(false);
                    method3739(field1088);
                    class84.method1027(field1088);
                    for (int var70 = 0; var70 < 100; var70++) {
                        field1133[var70] = true;
                    }
                }
                while (var69-- > 0) {
                    int var71 = field971.method2885();
                    int var72 = field971.method2882();
                    int var73 = field971.method3061();
                    class69 var74 = (class69) field1089.method3249((long) var71);
                    if (var74 != null && var74.field844 != var72) {
                        method1626(var74, true);
                        var74 = null;
                    }
                    if (var74 == null) {
                        var74 = method220(var71, var72, var73);
                    }
                    var74.field846 = true;
                }
                for (class69 var75 = (class69) field1089.method3252(); var75 != null; var75 = (class69) field1089.method3257()) {
                    if (var75.field846) {
                        var75.field846 = false;
                    } else {
                        method1626(var75, true);
                    }
                }
                field1130 = new class191(512);
                while (field971.field2399 < var67) {
                    int var76 = field971.method2885();
                    int var77 = field971.method2882();
                    int var78 = field971.method2882();
                    int var79 = field971.method2885();
                    for (int var80 = var77; var80 <= var78; var80++) {
                        long var81 = ((long) var76 << 32) + (long) var80;
                        field1130.method3248(new class199(var79), var81);
                    }
                }
                field982 = -1;
                return true;
            }
            if (field982 == 25) {
                field948 = field971.method3061();
                if (field948 == 255) {
                    field948 = 0;
                }
                field1161 = field971.method3061();
                if (field1161 == 255) {
                    field1161 = 0;
                }
                field982 = -1;
                return true;
            }
            if (field982 == 40) {
                int var83 = field971.method2924();
                int var84 = field971.method2924();
                class69 var85 = (class69) field1089.method3249((long) var84);
                class69 var86 = (class69) field1089.method3249((long) var83);
                if (var86 != null) {
                    method1626(var86, var85 == null || var85.field844 != var86.field844);
                }
                if (var85 != null) {
                    var85.method3290();
                    field1089.method3248(var85, (long) var83);
                }
                class217 var87 = class217.method3122(var84);
                if (var87 != null) {
                    method1571(var87);
                }
                class217 var88 = class217.method3122(var83);
                if (var88 != null) {
                    method1571(var88);
                    method485(Statics.field628[var88.field2655 >>> 16], var88, true);
                }
                if (field1088 != -1) {
                    int var89 = field1088;
                    if (class217.method1012(var89)) {
                        method23(Statics.field628[var89], 1);
                    }
                }
                field982 = -1;
                return true;
            }
            if (field982 == 15) {
                field971.field2399 += 28;
                if (field971.method2902()) {
                    method495(field971, field971.field2399 - 28);
                }
                field982 = -1;
                return true;
            }
            if (field982 == 251) {
                Statics.field901 = field971.method3061();
                Statics.field429 = field971.method2907();
                field982 = -1;
                return true;
            }
            if (field982 == 163) {
                String var90 = field971.method2884();
                long var91 = (long) field971.method2882();
                long var93 = (long) field971.method2917();
                class231 var95 = (class231) class169.method2353(class231.method3711(), field971.method3061());
                long var96 = (var91 << 32) + var93;
                boolean var98 = false;
                for (int var99 = 0; var99 < 100; var99++) {
                    if (field1147[var99] == var96) {
                        var98 = true;
                        break;
                    }
                }
                if (method3(var90)) {
                    var98 = true;
                }
                if (!var98 && field1046 == 0) {
                    field1147[field1148] = var96;
                    field1148 = (field1148 + 1) % 100;
                    class180 var100 = field971;
                    String var104;
                    try {
                        int var101 = var100.method2893();
                        if (var101 > 32767) {
                            var101 = 32767;
                        }
                        byte[] var102 = new byte[var101];
                        var100.field2399 += Statics.field3666.method2796(var100.field2405, var100.field2399, var102, 0, var101);
                        String var103 = class267.method647(var102, 0, var101);
                        var104 = var103;
                    } catch (Exception var314) {
                        var104 = "Cabbage";
                    }
                    String var107 = class265.method4466(class271.method2640(var104));
                    byte var108;
                    if (var95.field3185) {
                        var108 = 7;
                    } else {
                        var108 = 3;
                    }
                    if (var95.field3187 == -1) {
                        class99.method2665(var108, var90, var107);
                    } else {
                        class99.method2665(var108, class89.method548(var95.field3187) + var90, var107);
                    }
                }
                field982 = -1;
                return true;
            }
            if (field982 == 235) {
                byte var109 = field971.method2941();
                int var110 = field971.method3052();
                class212.field2612[var110] = var109;
                if (class212.field2613[var110] != var109) {
                    class212.field2613[var110] = var109;
                }
                method1481(var110);
                field1114[++field976 - 1 & 0x1F] = var110;
                field982 = -1;
                return true;
            }
            if (field982 == 105) {
                int var111 = field971.method2914();
                int var112 = field971.method2923();
                class212.field2612[var111] = var112;
                if (class212.field2613[var111] != var112) {
                    class212.field2613[var111] = var112;
                }
                method1481(var111);
                field1114[++field976 - 1 & 0x1F] = var111;
                field982 = -1;
                return true;
            }
            if (field982 == 79) {
                field944 = field971.method3061();
                if (field944 == 1) {
                    field945 = field971.method2882();
                }
                if (field944 >= 2 && field944 <= 6) {
                    if (field944 == 2) {
                        field981 = 64;
                        field951 = 64;
                    }
                    if (field944 == 3) {
                        field981 = 0;
                        field951 = 64;
                    }
                    if (field944 == 4) {
                        field981 = 128;
                        field951 = 64;
                    }
                    if (field944 == 5) {
                        field981 = 64;
                        field951 = 0;
                    }
                    if (field944 == 6) {
                        field981 = 64;
                        field951 = 128;
                    }
                    field944 = 2;
                    field947 = field971.method2882();
                    field1198 = field971.method2882();
                    field949 = field971.method3061();
                }
                if (field944 == 10) {
                    field1184 = field971.method2882();
                }
                field982 = -1;
                return true;
            }
            if (field982 == 98) {
                field1144 = field971.method3061();
                field1033 = field971.method3061();
                field982 = -1;
                return true;
            }
            if (field982 == 56 || field982 == 58 || field982 == 202 || field982 == 82 || field982 == 63 || field982 == 92 || field982 == 97 || field982 == 44 || field982 == 194 || field982 == 215) {
                method1424();
                field982 = -1;
                return true;
            }
            if (field982 == 28) {
                int var113 = field971.method2909();
                class217 var114 = class217.method3122(var113);
                for (int var115 = 0; var115 < var114.field2773.length; var115++) {
                    var114.field2773[var115] = -1;
                    var114.field2773[var115] = 0;
                }
                method1571(var114);
                field982 = -1;
                return true;
            }
            if (field982 == 72) {
                method1026();
                int var116 = field971.method2885();
                int var117 = field971.method3061();
                int var118 = field971.method2907();
                field1078[var117] = var116;
                field1202[var117] = var118;
                field973[var117] = 1;
                for (int var119 = 0; var119 < 98; var119++) {
                    if (var116 >= class223.field2846[var119]) {
                        field973[var117] = var119 + 2;
                    }
                }
                field1118[++field1068 - 1 & 0x1F] = var117;
                field982 = -1;
                return true;
            }
            if (field982 == 196) {
                int var120 = field971.method2885();
                int var121 = field971.method2885();
                if (Statics.field559 == null || !Statics.field559.isValid()) {
                    try {
                        Iterator var122 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var122.hasNext()) {
                            GarbageCollectorMXBean var123 = (GarbageCollectorMXBean) var122.next();
                            if (var123.isValid()) {
                                Statics.field559 = var123;
                                field1204 = -1L;
                                field1121 = -1L;
                            }
                        }
                    } catch (Throwable var315) {
                    }
                }
                long var125 = class176.method2862();
                int var127 = -1;
                if (Statics.field559 != null) {
                    long var128 = Statics.field559.getCollectionTime();
                    if (field1121 != -1L) {
                        long var130 = var128 - field1121;
                        long var132 = var125 - field1204;
                        if (var132 != 0L) {
                            var127 = (int) (var130 * 100L / var132);
                        }
                    }
                    field1121 = var128;
                    field1204 = var125;
                }
                field969.method3116(174);
                field969.method2999(var127);
                field969.method2868(var120);
                field969.method2967(var121);
                field969.method2999(field718);
                field982 = -1;
                return true;
            }
            if (field982 == 238) {
                String var134 = field971.method2884();
                long var135 = field971.method2910();
                long var137 = (long) field971.method2882();
                long var139 = (long) field971.method2917();
                class231 var141 = (class231) class169.method2353(class231.method3711(), field971.method3061());
                long var142 = (var137 << 32) + var139;
                boolean var144 = false;
                for (int var145 = 0; var145 < 100; var145++) {
                    if (field1147[var145] == var142) {
                        var144 = true;
                        break;
                    }
                }
                if (var141.field3189 && method3(var134)) {
                    var144 = true;
                }
                if (!var144 && field1046 == 0) {
                    field1147[field1148] = var142;
                    field1148 = (field1148 + 1) % 100;
                    class180 var146 = field971;
                    String var150;
                    try {
                        int var147 = var146.method2893();
                        if (var147 > 32767) {
                            var147 = 32767;
                        }
                        byte[] var148 = new byte[var147];
                        var146.field2399 += Statics.field3666.method2796(var146.field2405, var146.field2399, var148, 0, var147);
                        String var149 = class267.method647(var148, 0, var147);
                        var150 = var149;
                    } catch (Exception var313) {
                        var150 = "Cabbage";
                    }
                    String var153 = class265.method4466(class271.method2640(var150));
                    if (var141.field3187 == -1) {
                        class99.method307(9, var134, var153, class269.method741(var135));
                    } else {
                        class99.method307(9, class89.method548(var141.field3187) + var134, var153, class269.method741(var135));
                    }
                }
                field982 = -1;
                return true;
            }
            if (field982 == 119) {
                int var154 = field971.method2885();
                int var155 = field971.method2915();
                int var156 = var155 >> 10 & 0x1F;
                int var157 = var155 >> 5 & 0x1F;
                int var158 = var155 & 0x1F;
                int var159 = (var158 << 3) + (var156 << 19) + (var157 << 11);
                class217 var160 = class217.method3122(var154);
                if (var160.field2680 != var159) {
                    var160.field2680 = var159;
                    method1571(var160);
                }
                field982 = -1;
                return true;
            }
            if (field982 == 220) {
                int var161 = field971.method2885();
                int var162 = field971.method2882();
                if (var161 < -70000) {
                    var162 += 32768;
                }
                class217 var163;
                if (var161 >= 0) {
                    var163 = class217.method3122(var161);
                } else {
                    var163 = null;
                }
                while (field971.field2399 < field972) {
                    int var164 = field971.method2893();
                    int var165 = field971.method2882();
                    int var166 = 0;
                    if (var165 != 0) {
                        var166 = field971.method3061();
                        if (var166 == 255) {
                            var166 = field971.method2885();
                        }
                    }
                    if (var163 != null && var164 >= 0 && var164 < var163.field2773.length) {
                        var163.field2773[var164] = var165;
                        var163.field2774[var164] = var166;
                    }
                    class64.method1399(var162, var164, var165 - 1, var166);
                }
                if (var163 != null) {
                    method1571(var163);
                }
                method1026();
                field1116[++field1117 - 1 & 0x1F] = var162 & 0x7FFF;
                field982 = -1;
                return true;
            }
            if (field982 == 30) {
                String var167 = field971.method2884();
                class180 var168 = field971;
                String var172;
                try {
                    int var169 = var168.method2893();
                    if (var169 > 32767) {
                        var169 = 32767;
                    }
                    byte[] var170 = new byte[var169];
                    var168.field2399 += Statics.field3666.method2796(var168.field2405, var168.field2399, var170, 0, var169);
                    String var171 = class267.method647(var170, 0, var169);
                    var172 = var171;
                } catch (Exception var312) {
                    var172 = "Cabbage";
                }
                String var175 = class265.method4466(class271.method2640(var172));
                class99.method2665(6, var167, var175);
                field982 = -1;
                return true;
            }
            if (field982 == 159) {
                int var176 = field971.method3052();
                int var177 = field971.method2923();
                int var178 = field971.method2907();
                class69 var179 = (class69) field1089.method3249((long) var177);
                if (var179 != null) {
                    method1626(var179, var179.field844 != var176);
                }
                method220(var177, var176, var178);
                field982 = -1;
                return true;
            }
            if (field982 == 214) {
                class281.method3909(field971, field972);
                field982 = -1;
                return true;
            }
            if (field982 == 166) {
                method2(true);
                field971.method3106();
                int var180 = field971.method2882();
                class180 var181 = field971;
                int var182 = var181.field2399;
                class97.field1526 = 0;
                class97.method1579(var181);
                class97.method1480(var181);
                if (var181.field2399 - var182 != var180) {
                    throw new RuntimeException(var181.field2399 - var182 + " " + var180);
                }
                field982 = -1;
                return true;
            }
            if (field982 == 7) {
                if (field1088 != -1) {
                    int var183 = field1088;
                    if (class217.method1012(var183)) {
                        method23(Statics.field628[var183], 0);
                    }
                }
                field982 = -1;
                return true;
            }
            if (field982 == 182) {
                while (field971.field2399 < field972) {
                    int var184 = field971.method3061();
                    boolean var185 = (var184 & 0x1) == 1;
                    String var186 = field971.method2884();
                    String var187 = field971.method2884();
                    field971.method2884();
                    for (int var188 = 0; var188 < field1197; var188++) {
                        class71 var189 = field1119[var188];
                        if (var185) {
                            if (var187.equals(var189.field864)) {
                                var189.field864 = var186;
                                var189.field863 = var187;
                                var186 = null;
                                break;
                            }
                        } else if (var186.equals(var189.field864)) {
                            var189.field864 = var186;
                            var189.field863 = var187;
                            var186 = null;
                            break;
                        }
                    }
                    if (var186 != null && field1197 < 400) {
                        class71 var190 = new class71();
                        field1119[field1197] = var190;
                        var190.field864 = var186;
                        var190.field863 = var187;
                        field1197++;
                    }
                }
                field1026 = field1113;
                field982 = -1;
                return true;
            }
            if (field982 == 134) {
                int var191 = field971.method2923();
                int var192 = field971.method3013();
                class217 var193 = class217.method3122(var191);
                if (var193.field2718 != var192 || var192 == -1) {
                    var193.field2718 = var192;
                    var193.field2789 = 0;
                    var193.field2778 = 0;
                    method1571(var193);
                }
                field982 = -1;
                return true;
            }
            if (field982 == 96) {
                class180 var194 = field971;
                int var195 = field972;
                int var196 = var194.field2399;
                class97.field1526 = 0;
                class97.method1579(var194);
                class97.method1480(var194);
                if (var194.field2399 - var196 != var195) {
                    throw new RuntimeException(var194.field2399 - var196 + " " + var195);
                }
                field982 = -1;
                return true;
            }
            if (field982 == 14) {
                int var197 = field971.method2923();
                int var198 = field971.method2924();
                int var199 = field971.method2882();
                if (var199 == 65535) {
                    var199 = -1;
                }
                class217 var200 = class217.method3122(var197);
                if (var200.field2654) {
                    var200.field2775 = var199;
                    var200.field2713 = var198;
                    class257 var202 = class257.method3084(var199);
                    var200.field2706 = var202.field3511;
                    var200.field2707 = var202.field3512;
                    var200.field2744 = var202.field3513;
                    var200.field2704 = var202.field3514;
                    var200.field2705 = var202.field3534;
                    var200.field2651 = var202.field3545;
                    if (var202.field3529 == 1) {
                        var200.field2785 = 1;
                    } else {
                        var200.field2785 = 2;
                    }
                    if (var200.field2710 > 0) {
                        var200.field2651 = var200.field2651 * 32 / var200.field2710;
                    } else if (var200.field2666 > 0) {
                        var200.field2651 = var200.field2651 * 32 / var200.field2666;
                    }
                    method1571(var200);
                } else if (var199 == -1) {
                    var200.field2662 = 0;
                    field982 = -1;
                    return true;
                } else {
                    class257 var201 = class257.method3084(var199);
                    var200.field2662 = 4;
                    var200.field2699 = var199;
                    var200.field2706 = var201.field3511;
                    var200.field2707 = var201.field3512;
                    var200.field2651 = var201.field3545 * 100 / var198;
                    method1571(var200);
                }
                field982 = -1;
                return true;
            }
            if (field982 == 24) {
                int var203 = field971.method2923();
                int var204 = field971.method2915();
                class217 var205 = class217.method3122(var203);
                if (var205.field2662 != 1 || var205.field2699 != var204) {
                    var205.field2662 = 1;
                    var205.field2699 = var204;
                    method1571(var205);
                }
                field982 = -1;
                return true;
            }
            if (field982 == 218) {
                class81 var206 = new class81();
                var206.field1318 = field971.method2884();
                var206.field1315 = field971.method2882();
                int var207 = field971.method2885();
                var206.field1316 = var207;
                method2180(45);
                Statics.field3329.method2711();
                Statics.field3329 = null;
                class93.method1576(var206);
                field982 = -1;
                return false;
            }
            if (field982 == 139) {
                method3612(false);
                field982 = -1;
                return true;
            }
            if (field982 == 227) {
                method3612(true);
                field982 = -1;
                return true;
            }
            if (field982 == 225) {
                int var208 = field971.method2924();
                boolean var209 = field971.method2907() == 1;
                class217 var210 = class217.method3122(var208);
                if (var210.field2675 != var209) {
                    var210.field2675 = var209;
                    method1571(var210);
                }
                field982 = -1;
                return true;
            }
            if (field982 == 52) {
                while (field971.field2399 < field972) {
                    boolean var211 = field971.method3061() == 1;
                    String var212 = field971.method2884();
                    String var213 = field971.method2884();
                    int var214 = field971.method2882();
                    int var215 = field971.method3061();
                    int var216 = field971.method3061();
                    boolean var217 = (var216 & 0x2) != 0;
                    boolean var218 = (var216 & 0x1) != 0;
                    if (var214 > 0) {
                        field971.method2884();
                        field971.method3061();
                        field971.method2885();
                    }
                    field971.method2884();
                    for (int var219 = 0; var219 < field1193; var219++) {
                        class66 var220 = field1195[var219];
                        if (var211) {
                            if (var213.equals(var220.field827)) {
                                var220.field827 = var212;
                                var220.field822 = var213;
                                var212 = null;
                                break;
                            }
                        } else if (var212.equals(var220.field827)) {
                            if (var220.field823 != var214) {
                                boolean var221 = true;
                                for (class68 var222 = (class68) field1030.method3331(); var222 != null; var222 = (class68) field1030.method3326()) {
                                    if (var222.field842.equals(var212)) {
                                        if (var214 != 0 && var222.field838 == 0) {
                                            var222.method3334();
                                            var221 = false;
                                        } else if (var214 == 0 && var222.field838 != 0) {
                                            var222.method3334();
                                            var221 = false;
                                        }
                                    }
                                }
                                if (var221) {
                                    field1030.method3327(new class68(var212, var214));
                                }
                                var220.field823 = var214;
                            }
                            var220.field822 = var213;
                            var220.field824 = var215;
                            var220.field825 = var217;
                            var220.field826 = var218;
                            var212 = null;
                            break;
                        }
                    }
                    if (var212 != null && field1193 < 400) {
                        class66 var223 = new class66();
                        field1195[field1193] = var223;
                        var223.field827 = var212;
                        var223.field822 = var213;
                        var223.field823 = var214;
                        var223.field824 = var215;
                        var223.field825 = var217;
                        var223.field826 = var218;
                        field1193++;
                    }
                }
                field1194 = 2;
                field1026 = field1113;
                boolean var224 = false;
                int var225 = field1193;
                while (var225 > 0) {
                    boolean var226 = true;
                    var225--;
                    for (int var227 = 0; var227 < var225; var227++) {
                        boolean var228 = false;
                        class66 var229 = field1195[var227];
                        class66 var230 = field1195[var227 + 1];
                        if (field1168 != var229.field823 && field1168 == var230.field823) {
                            var228 = true;
                        }
                        if (!var228 && var229.field823 == 0 && var230.field823 != 0) {
                            var228 = true;
                        }
                        if (!var228 && !var229.field825 && var230.field825) {
                            var228 = true;
                        }
                        if (!var228 && !var229.field826 && var230.field826) {
                            var228 = true;
                        }
                        if (var228) {
                            class66 var231 = field1195[var227];
                            field1195[var227] = field1195[var227 + 1];
                            field1195[var227 + 1] = var231;
                            var226 = false;
                        }
                    }
                    if (var226) {
                        break;
                    }
                }
                field982 = -1;
                return true;
            }
            if (field982 == 190) {
                field1122 = field1113;
                if (field972 == 0) {
                    field1153 = null;
                    field1154 = null;
                    Statics.field417 = 0;
                    Statics.field263 = null;
                    field982 = -1;
                    return true;
                }
                field1154 = field971.method2884();
                long var232 = field971.method2910();
                field1153 = class269.method1073(var232);
                Statics.field272 = field971.method2930();
                int var234 = field971.method3061();
                if (var234 == 255) {
                    field982 = -1;
                    return true;
                }
                Statics.field417 = var234;
                class76[] var235 = new class76[100];
                for (int var236 = 0; var236 < Statics.field417; var236++) {
                    var235[var236] = new class76();
                    var235[var236].field919 = field971.method2884();
                    var235[var236].field920 = class268.method1070(var235[var236].field919, Statics.field929);
                    var235[var236].field921 = field971.method2882();
                    var235[var236].field922 = field971.method2930();
                    field971.method2884();
                    if (var235[var236].field919.equals(Statics.field803.field913)) {
                        Statics.field511 = var235[var236].field922;
                    }
                }
                boolean var237 = false;
                int var238 = Statics.field417;
                while (var238 > 0) {
                    boolean var239 = true;
                    var238--;
                    for (int var240 = 0; var240 < var238; var240++) {
                        if (var235[var240].field920.compareTo(var235[var240 + 1].field920) > 0) {
                            class76 var241 = var235[var240];
                            var235[var240] = var235[var240 + 1];
                            var235[var240 + 1] = var241;
                            var239 = false;
                        }
                    }
                    if (var239) {
                        break;
                    }
                }
                Statics.field263 = var235;
                field982 = -1;
                return true;
            }
            if (field982 == 129) {
                int var242 = field971.method2885();
                class69 var243 = (class69) field1089.method3249((long) var242);
                if (var243 != null) {
                    method1626(var243, true);
                }
                if (field1092 != null) {
                    method1571(field1092);
                    field1092 = null;
                }
                field982 = -1;
                return true;
            }
            if (field982 == 247) {
                field1162 = field971.method3061();
                field982 = -1;
                return true;
            }
            if (field982 == 36) {
                int var244 = field971.method2893();
                boolean var245 = field971.method3061() == 1;
                String var246 = "";
                boolean var247 = false;
                if (var245) {
                    var246 = field971.method2884();
                    if (method3(var246)) {
                        var247 = true;
                    }
                }
                String var248 = field971.method2884();
                if (!var247) {
                    class99.method2665(var244, var246, var248);
                }
                field982 = -1;
                return true;
            }
            if (field982 == 239) {
                int var249 = field971.method3061();
                class277[] var250 = new class277[] { class277.field3740, class277.field3738, class277.field3741 };
                class277[] var251 = var250;
                int var252 = 0;
                class277 var254;
                while (true) {
                    if (var252 >= var251.length) {
                        var254 = null;
                        break;
                    }
                    class277 var253 = var251[var252];
                    if (var253.field3739 == var249) {
                        var254 = var253;
                        break;
                    }
                    var252++;
                }
                Statics.field788 = var254;
                field982 = -1;
                return true;
            }
            if (field982 == 240) {
                int var255 = field971.method3052();
                field1088 = var255;
                this.method1089(false);
                method3739(var255);
                class84.method1027(field1088);
                for (int var256 = 0; var256 < 100; var256++) {
                    field1133[var256] = true;
                }
                field982 = -1;
                return true;
            }
            if (field982 == 243) {
                int var257 = field971.method2885();
                int var258 = field971.method2882();
                class217 var259 = class217.method3122(var257);
                if (var259 != null && var259.field2657 == 0) {
                    if (var258 > var259.field2679 - var259.field2671) {
                        var258 = var259.field2679 - var259.field2671;
                    }
                    if (var258 < 0) {
                        var258 = 0;
                    }
                    if (var259.field2677 != var258) {
                        var259.field2677 = var258;
                        method1571(var259);
                    }
                }
                field982 = -1;
                return true;
            }
            if (field982 == 207) {
                int var260 = field971.method2915();
                if (var260 == 65535) {
                    var260 = -1;
                }
                method4473(var260);
                field982 = -1;
                return true;
            }
            if (field982 == 46) {
                int var261 = field971.method2882();
                if (var261 == 65535) {
                    var261 = -1;
                }
                int var262 = field971.method2917();
                if (field1163 != 0 && var261 != -1) {
                    class204.method219(Statics.field311, var261, 0, field1163, false);
                    field1015 = true;
                }
                field982 = -1;
                return true;
            }
            if (field982 == 237) {
                for (int var263 = 0; var263 < Statics.field3290; var263++) {
                    class242 var264 = (class242) class242.field3291.method3235((long) var263);
                    class242 var265;
                    if (var264 == null) {
                        byte[] var266 = Statics.field3293.method3768(16, var263);
                        class242 var267 = new class242();
                        if (var266 != null) {
                            var267.method3922(new class174(var266));
                        }
                        class242.field3291.method3234(var267, (long) var263);
                        var265 = var267;
                    } else {
                        var265 = var264;
                    }
                    if (var265 != null) {
                        class212.field2612[var263] = 0;
                        class212.field2613[var263] = 0;
                    }
                }
                method1026();
                field976 += 32;
                field982 = -1;
                return true;
            }
            if (field982 == 177) {
                method1007();
                field982 = -1;
                return false;
            }
            if (field982 == 155) {
                String var269 = field971.method2884();
                Statics.field1063 = var269;
                try {
                    String var270 = Statics.field3633.getParameter(class275.field3720.field3727);
                    String var271 = Statics.field3633.getParameter(class275.field3733.field3727);
                    String var272 = var270 + "settings=" + var269 + "; version=1; path=/; domain=" + var271;
                    String var273;
                    if (var269.length() == 0) {
                        var273 = var272 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var274 = var272 + "; Expires=";
                        long var275 = class176.method2862() + 94608000000L;
                        class183.field2447.setTime(new Date(var275));
                        int var277 = class183.field2447.get(7);
                        int var278 = class183.field2447.get(5);
                        int var279 = class183.field2447.get(2);
                        int var280 = class183.field2447.get(1);
                        int var281 = class183.field2447.get(11);
                        int var282 = class183.field2447.get(12);
                        int var283 = class183.field2447.get(13);
                        String var284 = class183.field2444[var277 - 1] + ", " + var278 / 10 + var278 % 10 + "-" + class183.field2445[0][var279] + "-" + var280 + " " + var281 / 10 + var281 % 10 + ":" + var282 / 10 + var282 % 10 + ":" + var283 / 10 + var283 % 10 + " GMT";
                        var273 = var274 + var284 + "; Max-Age=" + 94608000L;
                    }
                    client var285 = Statics.field3633;
                    String var286 = "document.cookie=\"" + var273 + "\"";
                    JSObject.getWindow(var285).eval(var286);
                } catch (Throwable var311) {
                }
                field982 = -1;
                return true;
            }
            if (field982 == 156) {
                method2(false);
                field971.method3106();
                int var288 = field971.method2882();
                class180 var289 = field971;
                int var290 = var289.field2399;
                class97.field1526 = 0;
                class97.method1579(var289);
                class97.method1480(var289);
                if (var289.field2399 - var290 != var288) {
                    throw new RuntimeException(var289.field2399 - var290 + " " + var288);
                }
                field982 = -1;
                return true;
            }
            if (field982 == 248) {
                int var291 = field971.method3052();
                if (var291 == 65535) {
                    var291 = -1;
                }
                int var292 = field971.method2915();
                if (var292 == 65535) {
                    var292 = -1;
                }
                int var293 = field971.method2924();
                int var294 = field971.method2885();
                for (int var295 = var291; var295 <= var292; var295++) {
                    long var296 = ((long) var294 << 32) + (long) var295;
                    class193 var298 = field1130.method3249(var296);
                    if (var298 != null) {
                        var298.method3290();
                    }
                    field1130.method3248(new class199(var293), var296);
                }
                field982 = -1;
                return true;
            }
            if (field982 == 75) {
                field943 = field971.method2882() * 30;
                field1125 = field1113;
                field982 = -1;
                return true;
            }
            if (field982 == 122) {
                method1026();
                field1081 = field971.method3013();
                field1125 = field1113;
                field982 = -1;
                return true;
            }
            if (field982 == 124) {
                int var299 = field971.method2885();
                int var300 = field971.method2882();
                if (var299 < -70000) {
                    var300 += 32768;
                }
                class217 var301;
                if (var299 >= 0) {
                    var301 = class217.method3122(var299);
                } else {
                    var301 = null;
                }
                if (var301 != null) {
                    for (int var302 = 0; var302 < var301.field2773.length; var302++) {
                        var301.field2773[var302] = 0;
                        var301.field2774[var302] = 0;
                    }
                }
                class64.method3955(var300);
                int var303 = field971.method2882();
                for (int var304 = 0; var304 < var303; var304++) {
                    int var305 = field971.method2907();
                    if (var305 == 255) {
                        var305 = field971.method2924();
                    }
                    int var306 = field971.method2915();
                    if (var301 != null && var304 < var301.field2773.length) {
                        var301.field2773[var304] = var306;
                        var301.field2774[var304] = var305;
                    }
                    class64.method1399(var300, var304, var306 - 1, var305);
                }
                if (var301 != null) {
                    method1571(var301);
                }
                method1026();
                field1116[++field1117 - 1 & 0x1F] = var300 & 0x7FFF;
                field982 = -1;
                return true;
            }
            class153.method2658("" + field982 + class89.field1415 + field977 + class89.field1415 + field978 + class89.field1415 + field972, (Throwable) null);
            method1007();
        } catch (IOException var316) {
            method52();
        } catch (Exception var317) {
            String var309 = "" + field982 + class89.field1415 + field977 + class89.field1415 + field978 + class89.field1415 + field972 + class89.field1415 + (Statics.field669 + Statics.field803.field1294[0]) + class89.field1415 + (Statics.field3674 + Statics.field803.field1296[0]) + class89.field1415;
            for (int var310 = 0; var310 < field972 && var310 < 50; var310++) {
                var309 = var309 + field971.field2405[var310] + class89.field1415;
            }
            class153.method2658(var309, var317);
            method1007();
        }
        return true;
    }

    @ObfuscatedName("cd.gb(B)V")
    public static final void method1424() {
        if (field982 == 44) {
            int var0 = field971.method3061();
            int var1 = (var0 >> 4 & 0x7) + Statics.field901;
            int var2 = (var0 & 0x7) + Statics.field429;
            int var3 = field971.method3026();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field990[var4];
            int var7 = field971.method2915();
            if (var1 >= 0 && var2 >= 0 && var1 < 103 && var2 < 103) {
                if (var6 == 0) {
                    class143 var8 = Statics.field15.method2464(Statics.field2137, var1, var2);
                    if (var8 != null) {
                        int var9 = var8.field2139 >> 14 & 0x7FFF;
                        if (var4 == 2) {
                            var8.field2142 = new class101(var9, 2, var5 + 4, Statics.field2137, var1, var2, var7, false, var8.field2142);
                            var8.field2143 = new class101(var9, 2, var5 + 1 & 0x3, Statics.field2137, var1, var2, var7, false, var8.field2143);
                        } else {
                            var8.field2142 = new class101(var9, var4, var5, Statics.field2137, var1, var2, var7, false, var8.field2142);
                        }
                    }
                }
                if (var6 == 1) {
                    class148 var10 = Statics.field15.method2465(Statics.field2137, var1, var2);
                    if (var10 != null) {
                        int var11 = var10.field2193 >> 14 & 0x7FFF;
                        if (var4 == 4 || var4 == 5) {
                            var10.field2191 = new class101(var11, 4, var5, Statics.field2137, var1, var2, var7, false, var10.field2191);
                        } else if (var4 == 6) {
                            var10.field2191 = new class101(var11, 4, var5 + 4, Statics.field2137, var1, var2, var7, false, var10.field2191);
                        } else if (var4 == 7) {
                            var10.field2191 = new class101(var11, 4, (var5 + 2 & 0x3) + 4, Statics.field2137, var1, var2, var7, false, var10.field2191);
                        } else if (var4 == 8) {
                            var10.field2191 = new class101(var11, 4, var5 + 4, Statics.field2137, var1, var2, var7, false, var10.field2191);
                            var10.field2186 = new class101(var11, 4, (var5 + 2 & 0x3) + 4, Statics.field2137, var1, var2, var7, false, var10.field2186);
                        }
                    }
                }
                if (var6 == 2) {
                    class149 var12 = Statics.field15.method2466(Statics.field2137, var1, var2);
                    if (var4 == 11) {
                        var4 = 10;
                    }
                    if (var12 != null) {
                        var12.field2200 = new class101(var12.field2208 >> 14 & 0x7FFF, var4, var5, Statics.field2137, var1, var2, var7, false, var12.field2200);
                    }
                }
                if (var6 == 3) {
                    class130 var13 = Statics.field15.method2467(Statics.field2137, var1, var2);
                    if (var13 != null) {
                        var13.field1874 = new class101(var13.field1875 >> 14 & 0x7FFF, 22, var5, Statics.field2137, var1, var2, var7, false, var13.field1874);
                    }
                }
            }
        } else if (field982 == 82) {
            int var14 = field971.method3061();
            int var15 = (var14 >> 4 & 0x7) + Statics.field901;
            int var16 = (var14 & 0x7) + Statics.field429;
            int var17 = field971.method2882();
            int var18 = field971.method3061();
            int var19 = field971.method2882();
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                int var20 = var15 * 128 + 64;
                int var21 = var16 * 128 + 64;
                class85 var22 = new class85(var17, Statics.field2137, var20, var21, method306(var20, var21, Statics.field2137) - var18, var19, field936);
                field1061.method3322(var22);
            }
        } else {
            if (field982 == 56) {
                int var23 = field971.method3061();
                int var24 = (var23 >> 4 & 0x7) + Statics.field901;
                int var25 = (var23 & 0x7) + Statics.field429;
                int var26 = field971.method2882();
                int var27 = field971.method3061();
                int var28 = var27 >> 4 & 0xF;
                int var29 = var27 & 0x7;
                int var30 = field971.method3061();
                if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
                    int var31 = var28 + 1;
                    if (Statics.field803.field1294[0] >= var24 - var31 && Statics.field803.field1294[0] <= var24 + var31 && Statics.field803.field1296[0] >= var25 - var31 && Statics.field803.field1296[0] <= var25 + var31 && field1099 != 0 && var29 > 0 && field1182 < 50) {
                        field1169[field1182] = var26;
                        field1170[field1182] = var29;
                        field1171[field1182] = var30;
                        field1173[field1182] = null;
                        field1172[field1182] = (var24 << 16) + (var25 << 8) + var28;
                        field1182++;
                    }
                }
            }
            if (field982 == 202) {
                byte var32 = field971.method2941();
                int var33 = field971.method2882();
                int var34 = field971.method3052();
                int var35 = field971.method3058();
                int var36 = (var35 >> 4 & 0x7) + Statics.field901;
                int var37 = (var35 & 0x7) + Statics.field429;
                byte var38 = field971.method2906();
                int var39 = field971.method2915();
                int var40 = field971.method3052();
                int var41 = field971.method3026();
                int var42 = var41 >> 2;
                int var43 = var41 & 0x3;
                int var44 = field990[var42];
                byte var45 = field971.method2906();
                byte var46 = field971.method2906();
                class75 var47;
                if (field1049 == var34) {
                    var47 = Statics.field803;
                } else {
                    var47 = field967[var34];
                }
                if (var47 != null) {
                    class256 var48 = class256.method4092(var39);
                    int var49;
                    int var50;
                    if (var43 == 1 || var43 == 3) {
                        var49 = var48.field3450;
                        var50 = var48.field3462;
                    } else {
                        var49 = var48.field3462;
                        var50 = var48.field3450;
                    }
                    int var51 = (var49 >> 1) + var36;
                    int var52 = (var49 + 1 >> 1) + var36;
                    int var53 = (var50 >> 1) + var37;
                    int var54 = (var50 + 1 >> 1) + var37;
                    int[][] var55 = class62.field782[Statics.field2137];
                    int var56 = var55[var51][var53] + var55[var52][var53] + var55[var51][var54] + var55[var52][var54] >> 2;
                    int var57 = (var36 << 7) + (var49 << 6);
                    int var58 = (var37 << 7) + (var50 << 6);
                    class134 var59 = var48.method4159(var42, var43, var55, var57, var56, var58);
                    if (var59 != null) {
                        method71(Statics.field2137, var36, var37, var44, -1, 0, 0, var33 + 1, var40 + 1);
                        var47.field899 = field936 + var33;
                        var47.field906 = field936 + var40;
                        var47.field904 = var59;
                        var47.field903 = var36 * 128 + var49 * 64;
                        var47.field893 = var37 * 128 + var50 * 64;
                        var47.field902 = var56;
                        if (var46 > var45) {
                            byte var60 = var46;
                            var46 = var45;
                            var45 = var60;
                        }
                        if (var32 > var38) {
                            byte var61 = var32;
                            var32 = var38;
                            var38 = var61;
                        }
                        var47.field892 = var36 + var46;
                        var47.field907 = var36 + var45;
                        var47.field900 = var32 + var37;
                        var47.field908 = var37 + var38;
                    }
                }
            }
            if (field982 == 194) {
                int var62 = field971.method3061();
                int var63 = var62 >> 2;
                int var64 = var62 & 0x3;
                int var65 = field990[var63];
                int var66 = field971.method3061();
                int var67 = (var66 >> 4 & 0x7) + Statics.field901;
                int var68 = (var66 & 0x7) + Statics.field429;
                if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                    method71(Statics.field2137, var67, var68, var65, -1, var63, var64, 0, -1);
                }
            } else if (field982 == 215) {
                int var69 = field971.method3026();
                int var70 = var69 >> 2;
                int var71 = var69 & 0x3;
                int var72 = field990[var70];
                int var73 = field971.method2914();
                int var74 = field971.method2907();
                int var75 = (var74 >> 4 & 0x7) + Statics.field901;
                int var76 = (var74 & 0x7) + Statics.field429;
                if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
                    method71(Statics.field2137, var75, var76, var72, var73, var70, var71, 0, -1);
                }
            } else if (field982 == 97) {
                int var77 = field971.method2914();
                int var78 = field971.method2907();
                int var79 = (var78 >> 4 & 0x7) + Statics.field901;
                int var80 = (var78 & 0x7) + Statics.field429;
                int var81 = field971.method3052();
                if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                    class95 var82 = new class95();
                    var82.field1513 = var81;
                    var82.field1510 = var77;
                    if (field986[Statics.field2137][var79][var80] == null) {
                        field986[Statics.field2137][var79][var80] = new class194();
                    }
                    field986[Statics.field2137][var79][var80].method3322(var82);
                    method2645(var79, var80);
                }
            } else if (field982 == 63) {
                int var83 = field971.method3061();
                int var84 = (var83 >> 4 & 0x7) + Statics.field901;
                int var85 = (var83 & 0x7) + Statics.field429;
                int var86 = var84 + field971.method2930();
                int var87 = var85 + field971.method2930();
                int var88 = field971.method3013();
                int var89 = field971.method2882();
                int var90 = field971.method3061() * 4;
                int var91 = field971.method3061() * 4;
                int var92 = field971.method2882();
                int var93 = field971.method2882();
                int var94 = field971.method3061();
                int var95 = field971.method3061();
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104 && var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104 && var89 != 65535) {
                    int var96 = var84 * 128 + 64;
                    int var97 = var85 * 128 + 64;
                    int var98 = var86 * 128 + 64;
                    int var99 = var87 * 128 + 64;
                    class94 var100 = new class94(var89, Statics.field2137, var96, var97, method306(var96, var97, Statics.field2137) - var90, field936 + var92, field936 + var93, var94, var95, var88, var91);
                    var100.method1609(var98, var99, method306(var98, var99, Statics.field2137) - var91, field936 + var92);
                    field1060.method3322(var100);
                }
            } else if (field982 == 92) {
                int var101 = field971.method3061();
                int var102 = (var101 >> 4 & 0x7) + Statics.field901;
                int var103 = (var101 & 0x7) + Statics.field429;
                int var104 = field971.method2914();
                if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                    class194 var105 = field986[Statics.field2137][var102][var103];
                    if (var105 != null) {
                        for (class95 var106 = (class95) var105.method3303(); var106 != null; var106 = (class95) var105.method3297()) {
                            if ((var104 & 0x7FFF) == var106.field1513) {
                                var106.method3290();
                                break;
                            }
                        }
                        if (var105.method3303() == null) {
                            field986[Statics.field2137][var102][var103] = null;
                        }
                        method2645(var102, var103);
                    }
                }
            } else if (field982 == 58) {
                int var107 = field971.method3061();
                int var108 = (var107 >> 4 & 0x7) + Statics.field901;
                int var109 = (var107 & 0x7) + Statics.field429;
                int var110 = field971.method2882();
                int var111 = field971.method2882();
                int var112 = field971.method2882();
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                    class194 var113 = field986[Statics.field2137][var108][var109];
                    if (var113 != null) {
                        for (class95 var114 = (class95) var113.method3303(); var114 != null; var114 = (class95) var113.method3297()) {
                            if ((var110 & 0x7FFF) == var114.field1513 && var114.field1510 == var111) {
                                var114.field1510 = var112;
                                break;
                            }
                        }
                        method2645(var108, var109);
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.ge(IIIIIIIIIB)V")
    public static final void method71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) field1087.method3303(); var10 != null; var10 = (class77) field1087.method3297()) {
            if (var10.field1216 == arg0 && var10.field1222 == arg1 && var10.field1213 == arg2 && var10.field1211 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1216 = arg0;
            var9.field1211 = arg3;
            var9.field1222 = arg1;
            var9.field1213 = arg2;
            method11(var9);
            field1087.method3322(var9);
        }
        var9.field1217 = arg4;
        var9.field1224 = arg5;
        var9.field1218 = arg6;
        var9.field1220 = arg7;
        var9.field1221 = arg8;
    }

    @ObfuscatedName("t.gv(Lbk;I)V")
    public static final void method11(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1211 == 0) {
            var1 = Statics.field15.method2468(arg0.field1216, arg0.field1222, arg0.field1213);
        }
        if (arg0.field1211 == 1) {
            var1 = Statics.field15.method2570(arg0.field1216, arg0.field1222, arg0.field1213);
        }
        if (arg0.field1211 == 2) {
            var1 = Statics.field15.method2470(arg0.field1216, arg0.field1222, arg0.field1213);
        }
        if (arg0.field1211 == 3) {
            var1 = Statics.field15.method2471(arg0.field1216, arg0.field1222, arg0.field1213);
        }
        if (var1 != 0) {
            int var5 = Statics.field15.method2472(arg0.field1216, arg0.field1222, arg0.field1213, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1210 = var2;
        arg0.field1223 = var3;
        arg0.field1215 = var4;
    }

    @ObfuscatedName("bx.gl(IIIIIIII)V")
    public static final void method1010(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field931 && Statics.field2137 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field15.method2468(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field15.method2570(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field15.method2470(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field15.method2471(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field15.method2472(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field15.method2469(arg0, arg2, arg3);
                class256 var15 = class256.method4092(var12);
                if (var15.field3464 != 0) {
                    field987[arg0].method2750(arg2, arg3, var13, var14, var15.field3457);
                }
            }
            if (arg1 == 1) {
                Statics.field15.method2588(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field15.method2461(arg0, arg2, arg3);
                class256 var16 = class256.method4092(var12);
                if (var16.field3462 + arg2 > 103 || var16.field3462 + arg3 > 103 || var16.field3450 + arg2 > 103 || var16.field3450 + arg3 > 103) {
                    return;
                }
                if (var16.field3464 != 0) {
                    field987[arg0].method2751(arg2, arg3, var16.field3462, var16.field3450, var14, var16.field3457);
                }
            }
            if (arg1 == 3) {
                Statics.field15.method2462(arg0, arg2, arg3);
                class256 var17 = class256.method4092(var12);
                if (var17.field3464 == 1) {
                    field987[arg0].method2761(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field770[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class140 var19 = Statics.field15;
        class162 var20 = field987[arg0];
        class256 var21 = class256.method4092(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field3450;
            var23 = var21.field3462;
        } else {
            var22 = var21.field3462;
            var23 = var21.field3450;
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
        int[][] var28 = class62.field782[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field3489 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field3452 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class142 var34;
            if (var21.field3470 == -1 && var21.field3473 == null) {
                var34 = var21.method4159(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class101(arg4, 22, arg5, var18, arg2, arg3, var21.field3470, true, (class142) null);
            }
            var19.method2449(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field3464 == 1) {
                var20.method2756(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class142 var57;
            if (var21.field3470 == -1 && var21.field3473 == null) {
                var57 = var21.method4159(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class101(arg4, 10, arg5, var18, arg2, arg3, var21.field3470, true, (class142) null);
            }
            if (var57 != null) {
                var19.method2455(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field3464 != 0) {
                var20.method2745(arg2, arg3, var22, var23, var21.field3457);
            }
        } else if (arg6 >= 12) {
            class142 var35;
            if (var21.field3470 == -1 && var21.field3473 == null) {
                var35 = var21.method4159(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class101(arg4, arg6, arg5, var18, arg2, arg3, var21.field3470, true, (class142) null);
            }
            var19.method2455(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field3464 != 0) {
                var20.method2745(arg2, arg3, var22, var23, var21.field3457);
            }
        } else if (arg6 == 0) {
            class142 var36;
            if (var21.field3470 == -1 && var21.field3473 == null) {
                var36 = var21.method4159(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class101(arg4, 0, arg5, var18, arg2, arg3, var21.field3470, true, (class142) null);
            }
            var19.method2451(arg0, arg2, arg3, var29, var36, (class142) null, class62.field776[arg5], 0, var32, var33);
            if (var21.field3464 != 0) {
                var20.method2760(arg2, arg3, arg6, arg5, var21.field3457);
            }
        } else if (arg6 == 1) {
            class142 var37;
            if (var21.field3470 == -1 && var21.field3473 == null) {
                var37 = var21.method4159(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class101(arg4, 1, arg5, var18, arg2, arg3, var21.field3470, true, (class142) null);
            }
            var19.method2451(arg0, arg2, arg3, var29, var37, (class142) null, class62.field777[arg5], 0, var32, var33);
            if (var21.field3464 != 0) {
                var20.method2760(arg2, arg3, arg6, arg5, var21.field3457);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class142 var39;
            class142 var40;
            if (var21.field3470 == -1 && var21.field3473 == null) {
                var39 = var21.method4159(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method4159(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class101(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field3470, true, (class142) null);
                var40 = new class101(arg4, 2, var38, var18, arg2, arg3, var21.field3470, true, (class142) null);
            }
            var19.method2451(arg0, arg2, arg3, var29, var39, var40, class62.field776[arg5], class62.field776[var38], var32, var33);
            if (var21.field3464 != 0) {
                var20.method2760(arg2, arg3, arg6, arg5, var21.field3457);
            }
        } else if (arg6 == 3) {
            class142 var41;
            if (var21.field3470 == -1 && var21.field3473 == null) {
                var41 = var21.method4159(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class101(arg4, 3, arg5, var18, arg2, arg3, var21.field3470, true, (class142) null);
            }
            var19.method2451(arg0, arg2, arg3, var29, var41, (class142) null, class62.field777[arg5], 0, var32, var33);
            if (var21.field3464 != 0) {
                var20.method2760(arg2, arg3, arg6, arg5, var21.field3457);
            }
        } else if (arg6 == 9) {
            class142 var42;
            if (var21.field3470 == -1 && var21.field3473 == null) {
                var42 = var21.method4159(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class101(arg4, arg6, arg5, var18, arg2, arg3, var21.field3470, true, (class142) null);
            }
            var19.method2455(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field3464 != 0) {
                var20.method2745(arg2, arg3, var22, var23, var21.field3457);
            }
        } else if (arg6 == 4) {
            class142 var43;
            if (var21.field3470 == -1 && var21.field3473 == null) {
                var43 = var21.method4159(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class101(arg4, 4, arg5, var18, arg2, arg3, var21.field3470, true, (class142) null);
            }
            var19.method2452(arg0, arg2, arg3, var29, var43, (class142) null, class62.field776[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method2468(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class256.method4092(var45 >> 14 & 0x7FFF).field3463;
            }
            class142 var46;
            if (var21.field3470 == -1 && var21.field3473 == null) {
                var46 = var21.method4159(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class101(arg4, 4, arg5, var18, arg2, arg3, var21.field3470, true, (class142) null);
            }
            var19.method2452(arg0, arg2, arg3, var29, var46, (class142) null, class62.field776[arg5], 0, class62.field778[arg5] * var44, class62.field779[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method2468(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class256.method4092(var48 >> 14 & 0x7FFF).field3463 / 2;
            }
            class142 var49;
            if (var21.field3470 == -1 && var21.field3473 == null) {
                var49 = var21.method4159(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class101(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3470, true, (class142) null);
            }
            var19.method2452(arg0, arg2, arg3, var29, var49, (class142) null, 256, arg5, class62.field773[arg5] * var47, class62.field787[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class142 var51;
            if (var21.field3470 == -1 && var21.field3473 == null) {
                var51 = var21.method4159(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class101(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field3470, true, (class142) null);
            }
            var19.method2452(arg0, arg2, arg3, var29, var51, (class142) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method2468(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class256.method4092(var53 >> 14 & 0x7FFF).field3463 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class142 var55;
            class142 var56;
            if (var21.field3470 == -1 && var21.field3473 == null) {
                var55 = var21.method4159(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method4159(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class101(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3470, true, (class142) null);
                var56 = new class101(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field3470, true, (class142) null);
            }
            var19.method2452(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class62.field773[arg5] * var52, class62.field787[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ei.gz(IIB)V")
    public static final void method2645(int arg0, int arg1) {
        class194 var2 = field986[Statics.field2137][arg0][arg1];
        if (var2 == null) {
            Statics.field15.method2442(Statics.field2137, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class95 var5 = null;
        for (class95 var6 = (class95) var2.method3303(); var6 != null; var6 = (class95) var2.method3297()) {
            class257 var7 = class257.method3084(var6.field1513);
            long var8 = (long) var7.field3510;
            if (var7.field3529 == 1) {
                var8 = (long) (var6.field1510 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field15.method2442(Statics.field2137, arg0, arg1);
            return;
        }
        var2.method3299(var5);
        class95 var10 = null;
        class95 var11 = null;
        for (class95 var12 = (class95) var2.method3303(); var12 != null; var12 = (class95) var2.method3297()) {
            if (var5.field1513 != var12.field1513) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1513 != var12.field1513 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field15.method2598(Statics.field2137, arg0, arg1, method306(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2137), var5, var13, var10, var11);
    }

    @ObfuscatedName("hx.gg(ZS)V")
    public static final void method3612(boolean arg0) {
        field1051 = 0;
        field966 = 0;
        field971.method3129();
        int var1 = field971.method3107(8);
        if (var1 < field938) {
            for (int var2 = var1; var2 < field938; var2++) {
                field1052[++field1051 - 1] = field950[var2];
            }
        }
        if (var1 > field938) {
            throw new RuntimeException("");
        }
        field938 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field950[var3];
            class87 var5 = field963[var4];
            int var6 = field971.method3107(1);
            if (var6 == 0) {
                field950[++field938 - 1] = var4;
                var5.field1288 = field936;
            } else {
                int var7 = field971.method3107(2);
                if (var7 == 0) {
                    field950[++field938 - 1] = var4;
                    var5.field1288 = field936;
                    field1027[++field966 - 1] = var4;
                } else if (var7 == 1) {
                    field950[++field938 - 1] = var4;
                    var5.field1288 = field936;
                    int var8 = field971.method3107(3);
                    var5.method1558(var8, (byte) 1);
                    int var9 = field971.method3107(1);
                    if (var9 == 1) {
                        field1027[++field966 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field950[++field938 - 1] = var4;
                    var5.field1288 = field936;
                    int var10 = field971.method3107(3);
                    var5.method1558(var10, (byte) 2);
                    int var11 = field971.method3107(3);
                    var5.method1558(var11, (byte) 2);
                    int var12 = field971.method3107(1);
                    if (var12 == 1) {
                        field1027[++field966 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field1052[++field1051 - 1] = var4;
                }
            }
        }
        method501(arg0);
        for (int var13 = 0; var13 < field966; var13++) {
            int var14 = field1027[var13];
            class87 var15 = field963[var14];
            int var16 = field971.method3061();
            if ((var16 & 0x4) != 0) {
                int var17 = field971.method2915();
                if (var17 == 65535) {
                    var17 = -1;
                }
                int var18 = field971.method2907();
                if (var15.field1259 == var17 && var17 != -1) {
                    int var19 = class261.method3746(var17).field3622;
                    if (var19 == 1) {
                        var15.field1272 = 0;
                        var15.field1248 = 0;
                        var15.field1282 = var18;
                        var15.field1263 = 0;
                    }
                    if (var19 == 2) {
                        var15.field1263 = 0;
                    }
                } else if (var17 == -1 || var15.field1259 == -1 || class261.method3746(var17).field3606 >= class261.method3746(var15.field1259).field3606) {
                    var15.field1259 = var17;
                    var15.field1272 = 0;
                    var15.field1248 = 0;
                    var15.field1282 = var18;
                    var15.field1263 = 0;
                    var15.field1270 = var15.field1293;
                }
            }
            if ((var16 & 0x2) != 0) {
                var15.field1249 = field971.method2882();
                int var20 = field971.method2923();
                var15.field1239 = var20 >> 16;
                var15.field1279 = (var20 & 0xFFFF) + field936;
                var15.field1245 = 0;
                var15.field1278 = 0;
                if (var15.field1279 > field936) {
                    var15.field1245 = -1;
                }
                if (var15.field1249 == 65535) {
                    var15.field1249 = -1;
                }
            }
            if ((var16 & 0x8) != 0) {
                var15.field1252 = field971.method2884();
                var15.field1265 = 100;
            }
            if ((var16 & 0x1) != 0) {
                var15.field1277 = field971.method2882();
                if (var15.field1277 == 65535) {
                    var15.field1277 = -1;
                }
            }
            if ((var16 & 0x10) != 0) {
                int var21 = field971.method3061();
                if (var21 > 0) {
                    for (int var22 = 0; var22 < var21; var22++) {
                        int var23 = -1;
                        int var24 = -1;
                        int var25 = -1;
                        int var26 = field971.method2893();
                        if (var26 == 32767) {
                            var26 = field971.method2893();
                            var24 = field971.method2893();
                            var23 = field971.method2893();
                            var25 = field971.method2893();
                        } else if (var26 == 32766) {
                            var26 = -1;
                        } else {
                            var24 = field971.method2893();
                        }
                        int var27 = field971.method2893();
                        var15.method1406(var26, var24, var23, var25, field936, var27);
                    }
                }
                int var28 = field971.method3026();
                if (var28 > 0) {
                    for (int var29 = 0; var29 < var28; var29++) {
                        int var30 = field971.method2893();
                        int var31 = field971.method2893();
                        if (var31 == 32767) {
                            var15.method1417(var30);
                        } else {
                            int var32 = field971.method2893();
                            int var33 = field971.method3061();
                            int var34 = var31 > 0 ? field971.method3058() : var33;
                            var15.method1407(var30, field936, var31, var32, var33, var34);
                        }
                    }
                }
            }
            if ((var16 & 0x40) != 0) {
                var15.field1400 = class259.method471(field971.method2914());
                var15.field1243 = var15.field1400.field3562;
                var15.field1292 = var15.field1400.field3574;
                var15.field1247 = var15.field1400.field3557;
                var15.field1284 = var15.field1400.field3578;
                var15.field1271 = var15.field1400.field3576;
                var15.field1250 = var15.field1400.field3571;
                var15.field1244 = var15.field1400.field3565;
                var15.field1291 = var15.field1400.field3556;
                var15.field1246 = var15.field1400.field3567;
            }
            if ((var16 & 0x20) != 0) {
                int var35 = field971.method2914();
                int var36 = field971.method2882();
                int var37 = var15.field1273 - (var35 - Statics.field669 - Statics.field669) * 64;
                int var38 = var15.field1240 - (var36 - Statics.field3674 - Statics.field3674) * 64;
                if (var37 != 0 || var38 != 0) {
                    var15.field1267 = (int) (Math.atan2((double) var37, (double) var38) * 325.949D) & 0x7FF;
                }
            }
        }
        for (int var39 = 0; var39 < field1051; var39++) {
            int var40 = field1052[var39];
            if (field936 != field963[var40].field1288) {
                field963[var40].field1400 = null;
                field963[var40] = null;
            }
        }
        if (field972 != field971.field2399) {
            throw new RuntimeException(field971.field2399 + class89.field1415 + field972);
        }
        for (int var41 = 0; var41 < field938; var41++) {
            if (field963[field950[var41]] == null) {
                throw new RuntimeException(var41 + class89.field1415 + field938);
            }
        }
    }

    @ObfuscatedName("at.he(ZI)V")
    public static final void method501(boolean arg0) {
        while (true) {
            if (field971.method3109(field972) >= 27) {
                int var1 = field971.method3107(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field963[var1] == null) {
                        field963[var1] = new class87();
                        var2 = true;
                    }
                    class87 var3 = field963[var1];
                    field950[++field938 - 1] = var1;
                    var3.field1288 = field936;
                    int var4 = field1124[field971.method3107(3)];
                    if (var2) {
                        var3.field1290 = var3.field1241 = var4;
                    }
                    int var5 = field971.method3107(1);
                    int var6;
                    if (arg0) {
                        var6 = field971.method3107(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field971.method3107(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7 = field971.method3107(1);
                    if (var7 == 1) {
                        field1027[++field966 - 1] = var1;
                    }
                    int var8;
                    if (arg0) {
                        var8 = field971.method3107(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field971.method3107(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field1400 = class259.method471(field971.method3107(14));
                    var3.field1243 = var3.field1400.field3562;
                    var3.field1292 = var3.field1400.field3574;
                    if (var3.field1292 == 0) {
                        var3.field1241 = 0;
                    }
                    var3.field1247 = var3.field1400.field3557;
                    var3.field1284 = var3.field1400.field3578;
                    var3.field1271 = var3.field1400.field3576;
                    var3.field1250 = var3.field1400.field3571;
                    var3.field1244 = var3.field1400.field3565;
                    var3.field1291 = var3.field1400.field3556;
                    var3.field1246 = var3.field1400.field3567;
                    var3.method1556(Statics.field803.field1294[0] + var6, Statics.field803.field1296[0] + var8, var5 == 1);
                    continue;
                }
            }
            field971.method3103();
            return;
        }
    }

    @ObfuscatedName("bg.hk(I)V")
    public static void method946() {
        field1067 = 0;
        field1075 = -1;
        field925 = false;
    }

    @ObfuscatedName("ke.hf(I)V")
    public static final void method4758() {
        int var0 = Statics.field797;
        int var1 = Statics.field2620;
        int var2 = Statics.field451;
        int var3 = Statics.field886;
        int var4 = 6116423;
        class282.method4614(var0, var1, var2, var3, var4);
        class282.method4614(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class282.method4589(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1323.method4422(class226.field3122, var0 + 3, var1 + 14, var4, -1);
        int var5 = class60.field749;
        int var6 = class60.field750;
        for (int var7 = 0; var7 < field1067; var7++) {
            int var8 = (field1067 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class264 var10 = Statics.field1323;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field964[var7].length() > 0) {
                var11 = field1072[var7] + class226.field3093 + field964[var7];
            } else {
                var11 = field1072[var7];
            }
            var10.method4422(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field797;
        int var13 = Statics.field2620;
        int var14 = Statics.field451;
        int var15 = Statics.field886;
        for (int var16 = 0; var16 < field1062; var16++) {
            if (field1138[var16] + field1058[var16] > var12 && field1058[var16] < var12 + var14 && field1139[var16] + field1137[var16] > var13 && field1137[var16] < var13 + var15) {
                field1134[var16] = true;
            }
        }
    }

    @ObfuscatedName("hb.hg(IIIII)V")
    public static final void method3590(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1062; var4++) {
            if (field1138[var4] + field1058[var4] > arg0 && field1058[var4] < arg0 + arg2 && field1139[var4] + field1137[var4] > arg1 && field1137[var4] < arg1 + arg3) {
                field1133[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hb(I)V")
    public final void method1087() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field1067 - 1; var2++) {
                if (field1024[var2] < 1000 && field1024[var2 + 1] > 1000) {
                    String var3 = field964[var2];
                    field964[var2] = field964[var2 + 1];
                    field964[var2 + 1] = var3;
                    String var4 = field1072[var2];
                    field1072[var2] = field1072[var2 + 1];
                    field1072[var2 + 1] = var4;
                    int var5 = field1024[var2];
                    field1024[var2] = field1024[var2 + 1];
                    field1024[var2 + 1] = var5;
                    int var6 = field1020[var2];
                    field1020[var2] = field1020[var2 + 1];
                    field1020[var2 + 1] = var6;
                    int var7 = field1069[var2];
                    field1069[var2] = field1069[var2 + 1];
                    field1069[var2 + 1] = var7;
                    int var8 = field1071[var2];
                    field1071[var2] = field1071[var2 + 1];
                    field1071[var2 + 1] = var8;
                    if (field1075 != -1) {
                        if (field1075 == var2) {
                            field1075 = var2 + 1;
                        } else if (field1075 == var2 + 1) {
                            field1075 = var2;
                        }
                    }
                    var1 = false;
                }
            }
        }
        if (Statics.field1514 != null || field1101 != null) {
            return;
        }
        int var9 = class60.field743;
        if (field925) {
            if (var9 != 1 && (Statics.field500 || var9 != 4)) {
                int var10 = class60.field749;
                int var11 = class60.field750;
                if (var10 < Statics.field797 - 10 || var10 > Statics.field797 + Statics.field451 + 10 || var11 < Statics.field2620 - 10 || var11 > Statics.field886 + Statics.field2620 + 10) {
                    field925 = false;
                    method3590(Statics.field797, Statics.field2620, Statics.field451, Statics.field886);
                }
            }
            if (var9 == 1 || !Statics.field500 && var9 == 4) {
                int var12 = Statics.field797;
                int var13 = Statics.field2620;
                int var14 = Statics.field451;
                int var15 = class60.field748;
                int var16 = class60.field757;
                int var17 = -1;
                for (int var18 = 0; var18 < field1067; var18++) {
                    int var19 = (field1067 - 1 - var18) * 15 + var13 + 31;
                    if (var15 > var12 && var15 < var12 + var14 && var16 > var19 - 13 && var16 < var19 + 3) {
                        var17 = var18;
                    }
                }
                if (var17 != -1 && var17 >= 0) {
                    int var20 = field1020[var17];
                    int var21 = field1069[var17];
                    int var22 = field1024[var17];
                    int var23 = field1071[var17];
                    String var24 = field1072[var17];
                    String var25 = field964[var17];
                    method1618(var20, var21, var22, var23, var24, var25, class60.field748, class60.field757);
                }
                field925 = false;
                method3590(Statics.field797, Statics.field2620, Statics.field451, Statics.field886);
            }
            return;
        }
        int var26 = method8();
        if ((var9 == 1 || !Statics.field500 && var9 == 4) && var26 >= 0) {
            int var27 = field1024[var26];
            if (var27 == 39 || var27 == 40 || var27 == 41 || var27 == 42 || var27 == 43 || var27 == 33 || var27 == 34 || var27 == 35 || var27 == 36 || var27 == 37 || var27 == 38 || var27 == 1005) {
                label261: {
                    int var28 = field1020[var26];
                    int var29 = field1069[var26];
                    class217 var30 = class217.method3122(var29);
                    int var31 = method191(var30);
                    boolean var32 = (var31 >> 28 & 0x1) != 0;
                    if (!var32) {
                        class218 var10000 = (class218) null;
                        if (!class218.method222(method191(var30))) {
                            break label261;
                        }
                    }
                    if (Statics.field1514 != null && !field1044) {
                        int var33 = method8();
                        if (field1065 != 1) {
                            boolean var34;
                            if (var33 < 0) {
                                var34 = false;
                            } else {
                                int var35 = field1024[var33];
                                if (var35 >= 2000) {
                                    var35 -= 2000;
                                }
                                if (var35 == 1007) {
                                    var34 = true;
                                } else {
                                    var34 = false;
                                }
                            }
                            if (!var34 && field1067 > 0) {
                                int var36 = field1041;
                                int var37 = field1042;
                                method1013(Statics.field282, var36, var37);
                                Statics.field282 = null;
                            }
                        }
                    }
                    field1044 = false;
                    field1045 = 0;
                    if (Statics.field1514 != null) {
                        method1571(Statics.field1514);
                    }
                    Statics.field1514 = class217.method3122(var29);
                    field1040 = var28;
                    field1041 = class60.field748;
                    field1042 = class60.field757;
                    if (var26 >= 0) {
                        Statics.field282 = new class90();
                        Statics.field282.field1434 = field1020[var26];
                        Statics.field282.field1430 = field1069[var26];
                        Statics.field282.field1428 = field1024[var26];
                        Statics.field282.field1429 = field1071[var26];
                        Statics.field282.field1426 = field1072[var26];
                    }
                    method1571(Statics.field1514);
                    return;
                }
            }
        }
        if (var9 == 1 || !Statics.field500 && var9 == 4) {
            label265: {
                if (field1065 != 1 || field1067 <= 2 || method2638()) {
                    boolean var38;
                    if (var26 < 0) {
                        var38 = false;
                    } else {
                        int var39 = field1024[var26];
                        if (var39 >= 2000) {
                            var39 -= 2000;
                        }
                        if (var39 == 1007) {
                            var38 = true;
                        } else {
                            var38 = false;
                        }
                    }
                    if (!var38) {
                        break label265;
                    }
                }
                var9 = 2;
            }
        }
        if ((var9 == 1 || !Statics.field500 && var9 == 4) && field1067 > 0 && var26 >= 0) {
            int var40 = field1020[var26];
            int var41 = field1069[var26];
            int var42 = field1024[var26];
            int var43 = field1071[var26];
            String var44 = field1072[var26];
            String var45 = field964[var26];
            method1618(var40, var41, var42, var43, var44, var45, class60.field748, class60.field757);
        }
        if (var9 == 2 && field1067 > 0) {
            this.method1088(class60.field748, class60.field757);
        }
    }

    @ObfuscatedName("client.hx(III)V")
    public final void method1088(int arg0, int arg1) {
        int var3 = Statics.field1323.method4408(class226.field3122);
        for (int var4 = 0; var4 < field1067; var4++) {
            class264 var5 = Statics.field1323;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field964[var4].length() > 0) {
                var6 = field1072[var4] + class226.field3093 + field964[var4];
            } else {
                var6 = field1072[var4];
            }
            int var7 = var5.method4408(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field1067 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field618) {
            var9 = Statics.field618 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field2309) {
            var10 = Statics.field2309 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field15.method2479(Statics.field2137, arg0, arg1, false);
        field925 = true;
        Statics.field797 = var9;
        Statics.field2620 = var10;
        Statics.field451 = var3;
        Statics.field886 = field1067 * 15 + 22;
    }

    @ObfuscatedName("bh.hn(Lcf;III)V")
    public static final void method1013(class90 arg0, int arg1, int arg2) {
        method1618(arg0.field1434, arg0.field1430, arg0.field1428, arg0.field1429, arg0.field1426, arg0.field1426, arg1, arg2);
    }

    @ObfuscatedName("cz.hz(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1618(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 3) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            field948 = arg0;
            field1161 = arg1;
            field969.method3116(250);
            field969.method2990(Statics.field669 + arg0);
            field969.method3057(Statics.field3674 + arg1);
            field969.method2913(arg3 >> 14 & 0x7FFF);
            field969.method2865(class51.field660[82] ? 1 : 0);
        }
        if (arg2 == 26) {
            method1918();
        }
        if (arg2 == 8) {
            class87 var8 = field963[arg3];
            if (var8 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(92);
                field969.method2911(arg3);
                field969.method2868(Statics.field2599);
                field969.method2911(field1159);
                field969.method2865(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 44) {
            class75 var9 = field967[arg3];
            if (var9 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(68);
                field969.method3057(arg3);
                field969.method2904(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class217 var10 = class217.method3369(arg1, arg0);
            if (var10 != null) {
                method943(arg3, arg1, arg0, var10.field2775, arg5);
            }
        }
        if (arg2 == 5) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            field948 = arg0;
            field1161 = arg1;
            field969.method3116(229);
            field969.method2990(Statics.field669 + arg0);
            field969.method2913(arg3 >> 14 & 0x7FFF);
            field969.method2911(Statics.field3674 + arg1);
            field969.method2901(class51.field660[82] ? 1 : 0);
        }
        if (arg2 == 7) {
            class87 var11 = field963[arg3];
            if (var11 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(157);
                field969.method2865(class51.field660[82] ? 1 : 0);
                field969.method2913(arg3);
                field969.method2967(Statics.field572);
                field969.method2913(Statics.field3222);
                field969.method2990(Statics.field3213);
            }
        }
        if (arg2 == 40) {
            field969.method3116(108);
            field969.method2911(arg0);
            field969.method2913(arg3);
            field969.method2967(arg1);
            field998 = 0;
            Statics.field2406 = class217.method3122(arg1);
            field1115 = arg0;
        }
        if (arg2 == 16) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            field948 = arg0;
            field1161 = arg1;
            field969.method3116(210);
            field969.method3057(Statics.field3222);
            field969.method2913(Statics.field3213);
            field969.method2990(Statics.field3674 + arg1);
            field969.method2911(Statics.field669 + arg0);
            field969.method2921(Statics.field572);
            field969.method2911(arg3);
            field969.method2904(class51.field660[82] ? 1 : 0);
        }
        if (arg2 == 1005) {
            class217 var12 = class217.method3122(arg1);
            if (var12 == null || var12.field2774[arg0] < 100000) {
                field969.method3116(72);
                field969.method2913(arg3);
            } else {
                class99.method2665(27, "", var12.field2774[arg0] + " x " + class257.method3084(arg3).field3505);
            }
            field998 = 0;
            Statics.field2406 = class217.method3122(arg1);
            field1115 = arg0;
        }
        if (arg2 == 15) {
            class75 var13 = field967[arg3];
            if (var13 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(173);
                field969.method2921(Statics.field2599);
                field969.method2913(arg3);
                field969.method2865(class51.field660[82] ? 1 : 0);
                field969.method2990(field1159);
            }
        }
        if (arg2 == 33) {
            field969.method3116(8);
            field969.method2967(arg1);
            field969.method2913(arg3);
            field969.method2911(arg0);
            field998 = 0;
            Statics.field2406 = class217.method3122(arg1);
            field1115 = arg0;
        }
        if (arg2 == 34) {
            field969.method3116(198);
            field969.method2911(arg3);
            field969.method2921(arg1);
            field969.method2913(arg0);
            field998 = 0;
            Statics.field2406 = class217.method3122(arg1);
            field1115 = arg0;
        }
        if (arg2 == 1001) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            field948 = arg0;
            field1161 = arg1;
            field969.method3116(45);
            field969.method2990(arg3 >> 14 & 0x7FFF);
            field969.method2901(class51.field660[82] ? 1 : 0);
            field969.method2911(Statics.field669 + arg0);
            field969.method2990(Statics.field3674 + arg1);
        }
        if (arg2 == 2) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            field948 = arg0;
            field1161 = arg1;
            field969.method3116(187);
            field969.method2913(Statics.field3674 + arg1);
            field969.method2990(field1159);
            field969.method2868(Statics.field2599);
            field969.method2911(Statics.field669 + arg0);
            field969.method2865(class51.field660[82] ? 1 : 0);
            field969.method2911(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 24) {
            class217 var14 = class217.method3122(arg1);
            boolean var15 = true;
            if (var14.field2659 > 0) {
                var15 = Statics.method35(var14);
            }
            if (var15) {
                field969.method3116(53);
                field969.method2868(arg1);
            }
        }
        if (arg2 == 38) {
            method682();
            class217 var16 = class217.method3122(arg1);
            field941 = 1;
            Statics.field3213 = arg0;
            Statics.field572 = arg1;
            Statics.field3222 = arg3;
            method1571(var16);
            field1082 = class89.method3729(16748608) + class257.method3084(arg3).field3505 + class89.method3729(16777215);
            if (field1082 == null) {
                field1082 = "null";
            }
            return;
        }
        if (arg2 == 37) {
            field969.method3116(44);
            field969.method2967(arg1);
            field969.method2990(arg3);
            field969.method2990(arg0);
            field998 = 0;
            Statics.field2406 = class217.method3122(arg1);
            field1115 = arg0;
        }
        if (arg2 == 1002) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            field969.method3116(75);
            field969.method2913(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 29) {
            field969.method3116(53);
            field969.method2868(arg1);
            class217 var17 = class217.method3122(arg1);
            if (var17.field2766 != null && var17.field2766[0][0] == 5) {
                int var18 = var17.field2766[0][1];
                if (class212.field2613[var18] != var17.field2646[0]) {
                    class212.field2613[var18] = var17.field2646[0];
                    method1481(var18);
                }
            }
        }
        if (arg2 == 17) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            field948 = arg0;
            field1161 = arg1;
            field969.method3116(149);
            field969.method2967(Statics.field2599);
            field969.method2913(field1159);
            field969.method2990(arg3);
            field969.method2999(class51.field660[82] ? 1 : 0);
            field969.method2911(Statics.field669 + arg0);
            field969.method2913(Statics.field3674 + arg1);
        }
        if (arg2 == 23) {
            if (field925) {
                Statics.field15.method2448();
            } else {
                Statics.field15.method2479(Statics.field2137, arg0, arg1, true);
            }
        }
        if (arg2 == 9) {
            class87 var19 = field963[arg3];
            if (var19 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(36);
                field969.method2865(class51.field660[82] ? 1 : 0);
                field969.method2911(arg3);
            }
        }
        if (arg2 == 49) {
            class75 var20 = field967[arg3];
            if (var20 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(186);
                field969.method2904(class51.field660[82] ? 1 : 0);
                field969.method2990(arg3);
            }
        }
        if (arg2 == 18) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            field948 = arg0;
            field1161 = arg1;
            field969.method3116(233);
            field969.method2990(arg3);
            field969.method2904(class51.field660[82] ? 1 : 0);
            field969.method3057(Statics.field3674 + arg1);
            field969.method3057(Statics.field669 + arg0);
        }
        if (arg2 == 4) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            field948 = arg0;
            field1161 = arg1;
            field969.method3116(196);
            field969.method2911(arg3 >> 14 & 0x7FFF);
            field969.method2990(Statics.field669 + arg0);
            field969.method2913(Statics.field3674 + arg1);
            field969.method2904(class51.field660[82] ? 1 : 0);
        }
        if (arg2 == 10) {
            class87 var21 = field963[arg3];
            if (var21 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(165);
                field969.method3057(arg3);
                field969.method2901(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 25) {
            class217 var22 = class217.method3369(arg1, arg0);
            if (var22 != null) {
                method682();
                int var25 = method191(var22);
                int var26 = var25 >> 11 & 0x3F;
                method1582(arg1, arg0, var26, var22.field2775);
                field941 = 0;
                field1079 = method2778(var22);
                if (field1079 == null) {
                    field1079 = "Null";
                }
                if (var22.field2654) {
                    field1160 = var22.field2728 + class89.method3729(16777215);
                } else {
                    field1160 = class89.method3729(65280) + var22.field2767 + class89.method3729(16777215);
                }
            }
            return;
        }
        if (arg2 == 43) {
            field969.method3116(166);
            field969.method2990(arg3);
            field969.method2991(arg1);
            field969.method3057(arg0);
            field998 = 0;
            Statics.field2406 = class217.method3122(arg1);
            field1115 = arg0;
        }
        if (arg2 == 50) {
            class75 var27 = field967[arg3];
            if (var27 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(204);
                field969.method2904(class51.field660[82] ? 1 : 0);
                field969.method2913(arg3);
            }
        }
        if (arg2 == 19) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            field948 = arg0;
            field1161 = arg1;
            field969.method3116(118);
            field969.method2913(Statics.field3674 + arg1);
            field969.method2990(arg3);
            field969.method3057(Statics.field669 + arg0);
            field969.method2865(class51.field660[82] ? 1 : 0);
        }
        if (arg2 == 1) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            field948 = arg0;
            field1161 = arg1;
            field969.method3116(230);
            field969.method2911(Statics.field3222);
            field969.method2967(Statics.field572);
            field969.method2865(class51.field660[82] ? 1 : 0);
            field969.method2990(Statics.field3674 + arg1);
            field969.method2990(Statics.field669 + arg0);
            field969.method2990(arg3 >> 14 & 0x7FFF);
            field969.method2913(Statics.field3213);
        }
        if (arg2 == 1003) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            class87 var28 = field963[arg3];
            if (var28 != null) {
                class259 var29 = var28.field1400;
                if (var29.field3586 != null) {
                    var29 = var29.method4282();
                }
                if (var29 != null) {
                    field969.method3116(120);
                    field969.method2990(var29.field3560);
                }
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field601.method4847(arg2, arg3, new class213(arg0), new class213(arg1));
        }
        if (arg2 == 45) {
            class75 var30 = field967[arg3];
            if (var30 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(227);
                field969.method2911(arg3);
                field969.method2904(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field969.method3116(122);
            field969.method2911(arg0);
            field969.method2868(arg1);
            field969.method2990(arg3);
            field998 = 0;
            Statics.field2406 = class217.method3122(arg1);
            field1115 = arg0;
        }
        if (arg2 == 21) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            field948 = arg0;
            field1161 = arg1;
            field969.method3116(5);
            field969.method3057(arg3);
            field969.method2904(class51.field660[82] ? 1 : 0);
            field969.method2990(Statics.field3674 + arg1);
            field969.method2911(Statics.field669 + arg0);
        }
        if (arg2 == 22) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            field948 = arg0;
            field1161 = arg1;
            field969.method3116(231);
            field969.method2990(Statics.field669 + arg0);
            field969.method2990(Statics.field3674 + arg1);
            field969.method2913(arg3);
            field969.method2901(class51.field660[82] ? 1 : 0);
        }
        if (arg2 == 47) {
            class75 var31 = field967[arg3];
            if (var31 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(191);
                field969.method2990(arg3);
                field969.method2904(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field969.method3116(29);
            field969.method2991(arg1);
            field969.method2921(Statics.field572);
            field969.method3057(arg3);
            field969.method2913(arg0);
            field969.method2990(Statics.field3213);
            field969.method2990(Statics.field3222);
            field998 = 0;
            Statics.field2406 = class217.method3122(arg1);
            field1115 = arg0;
        }
        if (arg2 == 28) {
            field969.method3116(53);
            field969.method2868(arg1);
            class217 var32 = class217.method3122(arg1);
            if (var32.field2766 != null && var32.field2766[0][0] == 5) {
                int var33 = var32.field2766[0][1];
                class212.field2613[var33] = 1 - class212.field2613[var33];
                method1481(var33);
            }
        }
        if (arg2 == 35) {
            field969.method3116(183);
            field969.method2868(arg1);
            field969.method2990(arg3);
            field969.method2913(arg0);
            field998 = 0;
            Statics.field2406 = class217.method3122(arg1);
            field1115 = arg0;
        }
        if (arg2 == 42) {
            field969.method3116(129);
            field969.method2911(arg0);
            field969.method2868(arg1);
            field969.method2911(arg3);
            field998 = 0;
            Statics.field2406 = class217.method3122(arg1);
            field1115 = arg0;
        }
        if (arg2 == 11) {
            class87 var34 = field963[arg3];
            if (var34 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(86);
                field969.method2990(arg3);
                field969.method2865(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 12) {
            class87 var35 = field963[arg3];
            if (var35 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(97);
                field969.method2901(class51.field660[82] ? 1 : 0);
                field969.method2911(arg3);
            }
        }
        if (arg2 == 51) {
            class75 var36 = field967[arg3];
            if (var36 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(113);
                field969.method2911(arg3);
                field969.method2865(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 13) {
            class87 var37 = field963[arg3];
            if (var37 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(246);
                field969.method2904(class51.field660[82] ? 1 : 0);
                field969.method2913(arg3);
            }
        }
        if (arg2 == 48) {
            class75 var38 = field967[arg3];
            if (var38 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(37);
                field969.method3057(arg3);
                field969.method2901(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 46) {
            class75 var39 = field967[arg3];
            if (var39 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(28);
                field969.method2913(arg3);
                field969.method2904(class51.field660[82] ? 1 : 0);
            }
        }
        if (arg2 == 41) {
            field969.method3116(251);
            field969.method2967(arg1);
            field969.method3057(arg0);
            field969.method2990(arg3);
            field998 = 0;
            Statics.field2406 = class217.method3122(arg1);
            field1115 = arg0;
        }
        if (arg2 == 1004) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            field969.method3116(72);
            field969.method2913(arg3);
        }
        if (arg2 == 58) {
            class217 var40 = class217.method3369(arg1, arg0);
            if (var40 != null) {
                field969.method3116(99);
                field969.method2967(Statics.field2599);
                field969.method2911(field1085);
                field969.method2868(arg1);
                field969.method2911(field1159);
                field969.method2990(arg0);
                field969.method2990(var40.field2775);
            }
        }
        if (arg2 == 32) {
            field969.method3116(158);
            field969.method2990(arg0);
            field969.method2913(arg3);
            field969.method2868(arg1);
            field969.method2868(Statics.field2599);
            field969.method2911(field1159);
            field998 = 0;
            Statics.field2406 = class217.method3122(arg1);
            field1115 = arg0;
        }
        if (arg2 == 14) {
            class75 var41 = field967[arg3];
            if (var41 != null) {
                field1191 = arg6;
                field1035 = arg7;
                field1037 = 2;
                field968 = 0;
                field948 = arg0;
                field1161 = arg1;
                field969.method3116(39);
                field969.method2913(arg3);
                field969.method2967(Statics.field572);
                field969.method3057(Statics.field3222);
                field969.method2904(class51.field660[82] ? 1 : 0);
                field969.method2990(Statics.field3213);
            }
        }
        if (arg2 == 20) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            field948 = arg0;
            field1161 = arg1;
            field969.method3116(168);
            field969.method2904(class51.field660[82] ? 1 : 0);
            field969.method3057(Statics.field3674 + arg1);
            field969.method2913(Statics.field669 + arg0);
            field969.method2911(arg3);
        }
        if (arg2 == 36) {
            field969.method3116(160);
            field969.method2990(arg3);
            field969.method2921(arg1);
            field969.method2990(arg0);
            field998 = 0;
            Statics.field2406 = class217.method3122(arg1);
            field1115 = arg0;
        }
        if (arg2 == 30 && field1092 == null) {
            Statics.method908(arg1, arg0);
            field1092 = class217.method3369(arg1, arg0);
            method1571(field1092);
        }
        if (arg2 == 6) {
            field1191 = arg6;
            field1035 = arg7;
            field1037 = 2;
            field968 = 0;
            field948 = arg0;
            field1161 = arg1;
            field969.method3116(38);
            field969.method2990(Statics.field3674 + arg1);
            field969.method3057(Statics.field669 + arg0);
            field969.method2904(class51.field660[82] ? 1 : 0);
            field969.method2913(arg3 >> 14 & 0x7FFF);
        }
        if (field941 != 0) {
            field941 = 0;
            method1571(class217.method3122(Statics.field572));
        }
        if (field1083) {
            method682();
        }
        if (Statics.field2406 != null && field998 == 0) {
            method1571(Statics.field2406);
        }
    }

    @ObfuscatedName("bg.ho(ILjava/lang/String;I)V")
    public static void method942(int arg0, String arg1) {
        int var2 = class97.field1522;
        int[] var3 = class97.field1532;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class75 var6 = field967[var3[var5]];
            if (var6 != null && Statics.field803 != var6 && var6.field913 != null && var6.field913.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field969.method3116(68);
                    field969.method3057(var3[var5]);
                    field969.method2904(0);
                } else if (arg0 == 4) {
                    field969.method3116(191);
                    field969.method2990(var3[var5]);
                    field969.method2904(0);
                } else if (arg0 == 6) {
                    field969.method3116(186);
                    field969.method2904(0);
                    field969.method2990(var3[var5]);
                } else if (arg0 == 7) {
                    field969.method3116(204);
                    field969.method2904(0);
                    field969.method2913(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class99.method2665(4, "", class226.field2892 + arg1);
        }
    }

    @ObfuscatedName("cp.hj(IIIII)V")
    public static void method1582(int arg0, int arg1, int arg2, int arg3) {
        class217 var4 = class217.method3369(arg0, arg1);
        if (var4 != null && var4.field2746 != null) {
            class70 var5 = new class70();
            var5.field850 = var4;
            var5.field858 = var4.field2746;
            class84.method68(var5);
        }
        field1085 = arg3;
        field1083 = true;
        Statics.field2599 = arg0;
        field1159 = arg1;
        Statics.field391 = arg2;
        method1571(var4);
    }

    @ObfuscatedName("aj.hi(B)V")
    public static void method682() {
        if (!field1083) {
            return;
        }
        class217 var0 = class217.method3369(Statics.field2599, field1159);
        if (var0 != null && var0.field2747 != null) {
            class70 var1 = new class70();
            var1.field850 = var0;
            var1.field858 = var0.field2747;
            class84.method68(var1);
        }
        field1083 = false;
        method1571(var0);
    }

    @ObfuscatedName("bg.hs(IIIILjava/lang/String;S)V")
    public static void method943(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class217 var5 = class217.method3369(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2755 != null) {
            class70 var6 = new class70();
            var6.field850 = var5;
            var6.field853 = arg0;
            var6.field857 = arg4;
            var6.field858 = var5.field2755;
            class84.method68(var6);
        }
        boolean var7 = true;
        if (var5.field2659 > 0) {
            var7 = Statics.method35(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method191(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field969.method3116(78);
            field969.method2868(arg1);
            field969.method2990(arg2);
            field969.method2990(arg3);
        }
        if (arg0 == 2) {
            field969.method3116(218);
            field969.method2868(arg1);
            field969.method2990(arg2);
            field969.method2990(arg3);
        }
        if (arg0 == 3) {
            field969.method3116(216);
            field969.method2868(arg1);
            field969.method2990(arg2);
            field969.method2990(arg3);
        }
        if (arg0 == 4) {
            field969.method3116(169);
            field969.method2868(arg1);
            field969.method2990(arg2);
            field969.method2990(arg3);
        }
        if (arg0 == 5) {
            field969.method3116(104);
            field969.method2868(arg1);
            field969.method2990(arg2);
            field969.method2990(arg3);
        }
        if (arg0 == 6) {
            field969.method3116(228);
            field969.method2868(arg1);
            field969.method2990(arg2);
            field969.method2990(arg3);
        }
        if (arg0 == 7) {
            field969.method3116(244);
            field969.method2868(arg1);
            field969.method2990(arg2);
            field969.method2990(arg3);
        }
        if (arg0 == 8) {
            field969.method3116(190);
            field969.method2868(arg1);
            field969.method2990(arg2);
            field969.method2990(arg3);
        }
        if (arg0 == 9) {
            field969.method3116(35);
            field969.method2868(arg1);
            field969.method2990(arg2);
            field969.method2990(arg3);
        }
        if (arg0 == 10) {
            field969.method3116(91);
            field969.method2868(arg1);
            field969.method2990(arg2);
            field969.method2990(arg3);
        }
    }

    @ObfuscatedName("g.hv(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method154(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field925 || field1067 >= 500) {
            return;
        }
        field1072[field1067] = arg0;
        field964[field1067] = arg1;
        field1024[field1067] = arg2;
        field1071[field1067] = arg3;
        field1020[field1067] = arg4;
        field1069[field1067] = arg5;
        if (arg6) {
            field1075 = field1067;
        }
        field1067++;
    }

    @ObfuscatedName("a.hq(S)I")
    public static final int method8() {
        if (field1067 <= 0) {
            return -1;
        } else if (field1076 && class51.field660[81] && field1075 != -1) {
            return field1075;
        } else {
            return field1067 - 1;
        }
    }

    @ObfuscatedName("en.hr(I)Z")
    public static final boolean method2638() {
        if (field1067 <= 0) {
            return false;
        } else {
            return field1076 && class51.field660[81] && field1075 != -1;
        }
    }

    @ObfuscatedName("p.ha(I)V")
    public static void method134() {
        for (int var0 = 0; var0 < field1067; var0++) {
            if (method706(field1024[var0])) {
                if (var0 < field1067 - 1) {
                    for (int var1 = var0; var1 < field1067 - 1; var1++) {
                        field1072[var1] = field1072[var1 + 1];
                        field964[var1] = field964[var1 + 1];
                        field1024[var1] = field1024[var1 + 1];
                        field1071[var1] = field1071[var1 + 1];
                        field1020[var1] = field1020[var1 + 1];
                        field1069[var1] = field1069[var1 + 1];
                    }
                }
                field1067--;
            }
        }
    }

    @ObfuscatedName("be.hl(IS)Z")
    public static boolean method706(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ay.hp(Liy;IIII)V")
    public static final void method312(class259 arg0, int arg1, int arg2, int arg3) {
        if (field1067 >= 400) {
            return;
        }
        if (arg0.field3586 != null) {
            arg0 = arg0.method4282();
        }
        if (arg0 == null || !arg0.field3589 || arg0.field3591 && field1066 != arg1) {
            return;
        }
        String var4 = arg0.field3561;
        if (arg0.field3572 != 0) {
            int var6 = arg0.field3572;
            int var7 = Statics.field803.field896;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class89.method3729(16711680);
            } else if (var8 < -6) {
                var9 = class89.method3729(16723968);
            } else if (var8 < -3) {
                var9 = class89.method3729(16740352);
            } else if (var8 < 0) {
                var9 = class89.method3729(16756736);
            } else if (var8 > 9) {
                var9 = class89.method3729(65280);
            } else if (var8 > 6) {
                var9 = class89.method3729(4259584);
            } else if (var8 > 3) {
                var9 = class89.method3729(8453888);
            } else if (var8 > 0) {
                var9 = class89.method3729(12648192);
            } else {
                var9 = class89.method3729(16776960);
            }
            var4 = var4 + var9 + " " + class89.field1417 + class226.field3109 + arg0.field3572 + class89.field1418;
        }
        if (arg0.field3591 && field1074) {
            Statics.method3079(class226.field3011, class89.method3729(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field941 == 1) {
            Statics.method3079(class226.field2988, field1082 + " " + class89.field1419 + " " + class89.method3729(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1083) {
            int var10 = arg0.field3591 && field1074 ? 2000 : 0;
            String[] var11 = arg0.field3573;
            if (field1200) {
                var11 = method4097(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class226.field3012)) {
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
                        Statics.method3079(var11[var12], class89.method3729(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class226.field3012)) {
                        short var15 = 0;
                        if (field953 != class92.field1442) {
                            if (field953 == class92.field1441 || field953 == class92.field1443 && arg0.field3572 > Statics.field803.field896) {
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
                            Statics.method3079(var11[var14], class89.method3729(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3591 || !field1074) {
                Statics.method3079(class226.field3011, class89.method3729(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field391 & 0x2) == 2) {
            Statics.method3079(field1079, field1160 + " " + class89.field1419 + " " + class89.method3729(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("fw.hw(Lbq;IIII)V")
    public static final void method3148(class75 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field803 == arg0 || field1067 >= 400) {
            return;
        }
        String var9;
        if (arg0.field897 == 0) {
            String var4 = arg0.field905[0] + arg0.field913 + arg0.field905[1];
            int var5 = arg0.field896;
            int var6 = Statics.field803.field896;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class89.method3729(16711680);
            } else if (var7 < -6) {
                var8 = class89.method3729(16723968);
            } else if (var7 < -3) {
                var8 = class89.method3729(16740352);
            } else if (var7 < 0) {
                var8 = class89.method3729(16756736);
            } else if (var7 > 9) {
                var8 = class89.method3729(65280);
            } else if (var7 > 6) {
                var8 = class89.method3729(4259584);
            } else if (var7 > 3) {
                var8 = class89.method3729(8453888);
            } else if (var7 > 0) {
                var8 = class89.method3729(12648192);
            } else {
                var8 = class89.method3729(16776960);
            }
            var9 = var4 + var8 + " " + class89.field1417 + class226.field3109 + arg0.field896 + class89.field1418 + arg0.field905[2];
        } else {
            var9 = arg0.field905[0] + arg0.field913 + arg0.field905[1] + " " + class89.field1417 + class226.field3013 + arg0.field897 + class89.field1418 + arg0.field905[2];
        }
        if (field941 == 1) {
            Statics.method3079(class226.field2988, field1082 + " " + class89.field1419 + " " + class89.method3729(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field1083) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field1064[var10] != null) {
                    short var11 = 0;
                    if (field1064[var10].equalsIgnoreCase(class226.field3012)) {
                        if (field1013 == class92.field1442) {
                            continue;
                        }
                        if (field1013 == class92.field1441 || field1013 == class92.field1443 && arg0.field896 > Statics.field803.field896) {
                            var11 = 2000;
                        }
                        if (Statics.field803.field910 != 0 && arg0.field910 != 0) {
                            if (Statics.field803.field910 == arg0.field910) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field1096[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field1107[var10] + var11;
                    Statics.method3079(field1064[var10], class89.method3729(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field391 & 0x8) == 8) {
            Statics.method3079(field1079, field1160 + " " + class89.field1419 + " " + class89.method3729(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field1067; var14++) {
            if (field1024[var14] == 23) {
                field964[var14] = class89.method3729(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("eo.hy(IIIIIIIIB)V")
    public static final void method2686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class217.method1012(arg0)) {
            Statics.field3642 = null;
            Statics.method2637(Statics.field628[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field3642 != null) {
                Statics.method2637(Statics.field3642, -1412584499, arg1, arg2, arg3, arg4, Statics.field1238, Statics.field3690, arg7);
                Statics.field3642 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1133[var8] = true;
            }
        } else {
            field1133[arg7] = true;
        }
    }

    @ObfuscatedName("af.hm(Ljava/lang/String;Lho;S)Ljava/lang/String;")
    public static String method679(String arg0, class217 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method3089(arg1, var2 - 1);
                    String var6;
                    if (var5 < 999999999) {
                        var6 = Integer.toString(var5);
                    } else {
                        var6 = "*";
                    }
                    arg0 = var4 + var6 + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var7 = arg0.indexOf("%dns");
                if (var7 == -1) {
                    break;
                }
                String var8 = "";
                if (Statics.field340 != null) {
                    var8 = class271.method152(Statics.field340.field2246);
                    if (Statics.field340.field2240 != null) {
                        var8 = (String) Statics.field340.field2240;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("al.hd(II)Ljava/lang/String;")
    public static final String method599(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class89.field1415 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class89.method3729(65408) + var1.substring(0, var1.length() - 8) + class226.field3021 + " " + class89.field1417 + var1 + class89.field1418 + class89.field1422;
        } else if (var1.length() > 6) {
            return " " + class89.method3729(16777215) + var1.substring(0, var1.length() - 4) + class226.field3023 + " " + class89.field1417 + var1 + class89.field1418 + class89.field1422;
        } else {
            return " " + class89.method3729(16776960) + var1 + class89.field1422;
        }
    }

    @ObfuscatedName("client.ht(ZB)V")
    public final void method1089(boolean arg0) {
        method194(field1088, Statics.field618, Statics.field2309, arg0);
    }

    @ObfuscatedName("client.ii(Lho;I)V")
    public void method1218(class217 arg0) {
        class217 var2 = arg0.field2674 == -1 ? null : class217.method3122(arg0.field2674);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field618;
            var4 = Statics.field2309;
        } else {
            var3 = var2.field2750;
            var4 = var2.field2671;
        }
        method2636(arg0, var3, var4, false);
        method57(arg0, var3, var4);
    }

    @ObfuscatedName("ax.iq([Lho;Lho;ZI)V")
    public static void method485(class217[] arg0, class217 arg1, boolean arg2) {
        int var3 = arg1.field2649 == 0 ? arg1.field2750 : arg1.field2649;
        int var4 = arg1.field2679 == 0 ? arg1.field2671 : arg1.field2679;
        method1022(arg0, arg1.field2655, var3, var4, arg2);
        if (arg1.field2779 != null) {
            method1022(arg1.field2779, arg1.field2655, var3, var4, arg2);
        }
        class69 var5 = (class69) field1089.method3249((long) arg1.field2655);
        if (var5 != null) {
            method194(var5.field844, var3, var4, arg2);
        }
        if (arg1.field2659 == 1337) {
        }
    }

    @ObfuscatedName("ah.ih(IIIZI)V")
    public static final void method194(int arg0, int arg1, int arg2, boolean arg3) {
        if (class217.method1012(arg0)) {
            method1022(Statics.field628[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bu.ix([Lho;IIIZI)V")
    public static void method1022(class217[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class217 var6 = arg0[var5];
            if (var6 != null && var6.field2674 == arg1) {
                method2636(var6, arg2, arg3, arg4);
                method57(var6, arg2, arg3);
                if (var6.field2676 > var6.field2649 - var6.field2750) {
                    var6.field2676 = var6.field2649 - var6.field2750;
                }
                if (var6.field2676 < 0) {
                    var6.field2676 = 0;
                }
                if (var6.field2677 > var6.field2679 - var6.field2671) {
                    var6.field2677 = var6.field2679 - var6.field2671;
                }
                if (var6.field2677 < 0) {
                    var6.field2677 = 0;
                }
                if (var6.field2657 == 0) {
                    method485(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ej.ic(Lho;IIZI)V")
    public static void method2636(class217 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2750;
        int var5 = arg0.field2671;
        if (arg0.field2684 == 0) {
            arg0.field2750 = arg0.field2666;
        } else if (arg0.field2684 == 1) {
            arg0.field2750 = arg1 - arg0.field2666;
        } else if (arg0.field2684 == 2) {
            arg0.field2750 = arg0.field2666 * arg1 >> 14;
        }
        if (arg0.field2663 == 0) {
            arg0.field2671 = arg0.field2708;
        } else if (arg0.field2663 == 1) {
            arg0.field2671 = arg2 - arg0.field2708;
        } else if (arg0.field2663 == 2) {
            arg0.field2671 = arg0.field2708 * arg2 >> 14;
        }
        if (arg0.field2684 == 4) {
            arg0.field2750 = arg0.field2672 * arg0.field2671 / arg0.field2673;
        }
        if (arg0.field2663 == 4) {
            arg0.field2671 = arg0.field2750 * arg0.field2673 / arg0.field2672;
        }
        if (field1098 && arg0.field2657 == 0) {
            if (arg0.field2671 < 5 && arg0.field2750 < 5) {
                arg0.field2671 = 5;
                arg0.field2750 = 5;
            } else {
                if (arg0.field2671 <= 0) {
                    arg0.field2671 = 5;
                }
                if (arg0.field2750 <= 0) {
                    arg0.field2750 = 5;
                }
            }
        }
        if (arg0.field2659 == 1337) {
            field1100 = arg0;
        }
        if (arg3 && arg0.field2764 != null && (arg0.field2750 != var4 || arg0.field2671 != var5)) {
            class70 var6 = new class70();
            var6.field850 = arg0;
            var6.field858 = arg0.field2764;
            field1036.method3322(var6);
        }
    }

    @ObfuscatedName("c.im(Lho;IIS)V")
    public static void method57(class217 arg0, int arg1, int arg2) {
        if (arg0.field2660 == 0) {
            arg0.field2668 = arg0.field2701;
        } else if (arg0.field2660 == 1) {
            arg0.field2668 = (arg1 - arg0.field2750) / 2 + arg0.field2701;
        } else if (arg0.field2660 == 2) {
            arg0.field2668 = arg1 - arg0.field2750 - arg0.field2701;
        } else if (arg0.field2660 == 3) {
            arg0.field2668 = arg0.field2701 * arg1 >> 14;
        } else if (arg0.field2660 == 4) {
            arg0.field2668 = (arg0.field2701 * arg1 >> 14) + (arg1 - arg0.field2750) / 2;
        } else {
            arg0.field2668 = arg1 - arg0.field2750 - (arg0.field2701 * arg1 >> 14);
        }
        if (arg0.field2661 == 0) {
            arg0.field2669 = arg0.field2665;
        } else if (arg0.field2661 == 1) {
            arg0.field2669 = (arg2 - arg0.field2671) / 2 + arg0.field2665;
        } else if (arg0.field2661 == 2) {
            arg0.field2669 = arg2 - arg0.field2671 - arg0.field2665;
        } else if (arg0.field2661 == 3) {
            arg0.field2669 = arg0.field2665 * arg2 >> 14;
        } else if (arg0.field2661 == 4) {
            arg0.field2669 = (arg0.field2665 * arg2 >> 14) + (arg2 - arg0.field2671) / 2;
        } else {
            arg0.field2669 = arg2 - arg0.field2671 - (arg0.field2665 * arg2 >> 14);
        }
        if (!field1098 || arg0.field2657 != 0) {
            return;
        }
        if (arg0.field2668 < 0) {
            arg0.field2668 = 0;
        } else if (arg0.field2750 + arg0.field2668 > arg1) {
            arg0.field2668 = arg1 - arg0.field2750;
        }
        if (arg0.field2669 < 0) {
            arg0.field2669 = 0;
        } else if (arg0.field2671 + arg0.field2669 > arg2) {
            arg0.field2669 = arg2 - arg0.field2671;
        }
    }

    @ObfuscatedName("fa.iz(Lho;IIIIIII)V")
    public static final void method3088(class217 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field1008) {
            field1009 = 32;
        } else {
            field1009 = 0;
        }
        field1008 = false;
        if (class60.field755 == 1 || !Statics.field500 && class60.field755 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2677 -= 4;
                method1571(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2677 += 4;
                method1571(arg0);
            } else if (arg5 >= arg1 - field1009 && arg5 < field1009 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2677 = (arg4 - arg3) * var8 / var9;
                method1571(arg0);
                field1008 = true;
            }
        }
        if (field1126 == 0) {
            return;
        }
        int var10 = arg0.field2750;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2677 += field1126 * 45;
            method1571(arg0);
        }
    }

    @ObfuscatedName("ar.io(Lho;I)Z")
    public static final boolean method235(class217 arg0) {
        if (arg0.field2768 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2768.length; var1++) {
            int var2 = method3089(arg0, var1);
            int var3 = arg0.field2646[var1];
            if (arg0.field2768[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2768[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2768[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fe.ij(Lho;II)I")
    public static final int method3089(class217 arg0, int arg1) {
        if (arg0.field2766 == null || arg1 >= arg0.field2766.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2766[arg1];
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
                    var7 = field1202[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field973[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1078[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class217 var11 = class217.method3122(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class257.method3084(var12).field3518 || field930)) {
                        for (int var13 = 0; var13 < var11.field2773.length; var13++) {
                            if (var12 + 1 == var11.field2773[var13]) {
                                var7 += var11.field2774[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class212.field2613[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class223.field2846[field973[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class212.field2613[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field803.field896;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class223.field2845[var14]) {
                            var7 += field973[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class217 var17 = class217.method3122(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class257.method3084(var18).field3518 || field930)) {
                        for (int var19 = 0; var19 < var17.field2773.length; var19++) {
                            if (var18 + 1 == var17.field2773[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1093;
                }
                if (var6 == 12) {
                    var7 = field1081;
                }
                if (var6 == 13) {
                    int var20 = class212.field2613[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class212.method227(var22);
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
                    var7 = (Statics.field803.field1273 >> 7) + Statics.field669;
                }
                if (var6 == 19) {
                    var7 = (Statics.field803.field1240 >> 7) + Statics.field3674;
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

    @ObfuscatedName("g.if(Lho;IIB)V")
    public static final void method156(class217 arg0, int arg1, int arg2) {
        if (arg0.field2698 == 1) {
            Statics.method3079(arg0.field2772, "", 24, 0, 0, arg0.field2655);
        }
        if (arg0.field2698 == 2 && !field1083) {
            String var3 = method2778(arg0);
            if (var3 != null) {
                Statics.method3079(var3, class89.method3729(65280) + arg0.field2767, 25, 0, -1, arg0.field2655);
            }
        }
        if (arg0.field2698 == 3) {
            Statics.method3079(class226.field3020, "", 26, 0, 0, arg0.field2655);
        }
        if (arg0.field2698 == 4) {
            Statics.method3079(arg0.field2772, "", 28, 0, 0, arg0.field2655);
        }
        if (arg0.field2698 == 5) {
            Statics.method3079(arg0.field2772, "", 29, 0, 0, arg0.field2655);
        }
        if (arg0.field2698 == 6 && field1092 == null) {
            Statics.method3079(arg0.field2772, "", 30, 0, -1, arg0.field2655);
        }
        if (arg0.field2657 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2671; var5++) {
                for (int var6 = 0; var6 < arg0.field2750; var6++) {
                    int var7 = (arg0.field2765 + 32) * var6;
                    int var8 = (arg0.field2722 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2776[var4];
                        var8 += arg0.field2724[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field1043 = var4;
                        Statics.field2156 = arg0;
                        if (arg0.field2773[var4] > 0) {
                            class257 var9 = class257.method3084(arg0.field2773[var4] - 1);
                            if (field941 == 1 && class218.method2706(method191(arg0))) {
                                if (Statics.field572 != arg0.field2655 || Statics.field3213 != var4) {
                                    Statics.method3079(class226.field2988, field1082 + " " + class89.field1419 + " " + class89.method3729(16748608) + var9.field3505, 31, var9.field3515, var4, arg0.field2655);
                                }
                            } else if (!field1083 || !class218.method2706(method191(arg0))) {
                                String[] var10 = var9.field3520;
                                if (field1200) {
                                    var10 = method4097(var10);
                                }
                                int var11 = var9.method4265();
                                if (class218.method2706(method191(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        boolean var13 = var11 == var12;
                                        if (var10 != null && var10[var12] != null) {
                                            byte var14;
                                            if (var12 == 3) {
                                                var14 = 36;
                                            } else {
                                                var14 = 37;
                                            }
                                            method154(var10[var12], class89.method3729(16748608) + var9.field3505, var14, var9.field3515, var4, arg0.field2655, var13);
                                        } else if (var12 == 4) {
                                            method154(class226.field3019, class89.method3729(16748608) + var9.field3505, 37, var9.field3515, var4, arg0.field2655, var13);
                                        }
                                    }
                                }
                                if (class218.method3497(method191(arg0))) {
                                    Statics.method3079(class226.field2988, class89.method3729(16748608) + var9.field3505, 38, var9.field3515, var4, arg0.field2655);
                                }
                                if (class218.method2706(method191(arg0)) && var10 != null) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        boolean var16 = var11 == var15;
                                        if (var10[var15] != null) {
                                            byte var17 = 0;
                                            if (var15 == 0) {
                                                var17 = 33;
                                            }
                                            if (var15 == 1) {
                                                var17 = 34;
                                            }
                                            if (var15 == 2) {
                                                var17 = 35;
                                            }
                                            method154(var10[var15], class89.method3729(16748608) + var9.field3505, var17, var9.field3515, var4, arg0.field2655, var16);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field2740;
                                if (field1200) {
                                    var18 = method4097(var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 39;
                                            }
                                            if (var19 == 1) {
                                                var20 = 40;
                                            }
                                            if (var19 == 2) {
                                                var20 = 41;
                                            }
                                            if (var19 == 3) {
                                                var20 = 42;
                                            }
                                            if (var19 == 4) {
                                                var20 = 43;
                                            }
                                            Statics.method3079(var18[var19], class89.method3729(16748608) + var9.field3505, var20, var9.field3515, var4, arg0.field2655);
                                        }
                                    }
                                }
                                Statics.method3079(class226.field3011, class89.method3729(16748608) + var9.field3505, 1005, var9.field3515, var4, arg0.field2655);
                            } else if ((Statics.field391 & 0x10) == 16) {
                                Statics.method3079(field1079, field1160 + " " + class89.field1419 + " " + class89.method3729(16748608) + var9.field3505, 32, var9.field3515, var4, arg0.field2655);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2654) {
            return;
        }
        if (!field1083) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = method132(arg0, var21);
                if (var22 != null) {
                    Statics.method3079(var22, arg0.field2728, 1007, var21 + 1, arg0.field2656, arg0.field2655);
                }
            }
            String var23 = method2778(arg0);
            if (var23 != null) {
                Statics.method3079(var23, arg0.field2728, 25, 0, arg0.field2656, arg0.field2655);
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = method132(arg0, var24);
                if (var25 != null) {
                    Statics.method3079(var25, arg0.field2728, 57, var24 + 1, arg0.field2656, arg0.field2655);
                }
            }
            if (class218.method2437(method191(arg0))) {
                Statics.method3079(class226.field3041, "", 30, 0, arg0.field2656, arg0.field2655);
            }
        } else if (class218.method1425(method191(arg0)) && (Statics.field391 & 0x20) == 32) {
            Statics.method3079(field1079, field1160 + " " + class89.field1419 + " " + arg0.field2728, 58, 0, arg0.field2656, arg0.field2655);
        }
    }

    @ObfuscatedName("an.ip([Lho;IIIIIIII)V")
    public static final void method225(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class217 var9 = arg0[var8];
            if (var9 != null && (!var9.field2654 || var9.field2657 == 0 || var9.field2735 || method191(var9) != 0 || field1102 == var9 || var9.field2659 == 1338) && var9.field2674 == arg1 && (!var9.field2654 || !method494(var9))) {
                int var10 = var9.field2668 + arg6;
                int var11 = var9.field2669 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2657 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2657 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2750 + var10;
                    int var19 = var9.field2671 + var11;
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
                    int var22 = var9.field2750 + var10;
                    int var23 = var9.field2671 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1101 == var9) {
                    field1177 = true;
                    field1110 = var10;
                    field961 = var11;
                }
                if (!var9.field2654 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field749;
                    int var25 = class60.field750;
                    if (class60.field743 != 0) {
                        var24 = class60.field748;
                        var25 = class60.field757;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2659 == 1337) {
                        if (!field935 && !field925 && var26) {
                            if (field941 == 0 && !field1083) {
                                Statics.method3079(class226.field2923, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var27 = -1;
                            int var28 = -1;
                            for (int var29 = 0; var29 < class135.field2011; var29++) {
                                int var30 = class135.field2012[var29];
                                int var31 = var30 & 0x7F;
                                int var32 = var30 >> 7 & 0x7F;
                                int var33 = var30 >> 29 & 0x3;
                                int var34 = var30 >> 14 & 0x7FFF;
                                if (var28 != var30) {
                                    var28 = var30;
                                    if (var33 == 2 && Statics.field15.method2472(Statics.field2137, var31, var32, var30) >= 0) {
                                        class256 var35 = class256.method4092(var34);
                                        if (var35.field3473 != null) {
                                            var35 = var35.method4199();
                                        }
                                        if (var35 == null) {
                                            continue;
                                        }
                                        if (field941 == 1) {
                                            Statics.method3079(class226.field2988, field1082 + " " + class89.field1419 + " " + class89.method3729(65535) + var35.field3482, 1, var30, var31, var32);
                                        } else if (!field1083) {
                                            String[] var36 = var35.field3474;
                                            if (field1200) {
                                                var36 = method4097(var36);
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
                                                        Statics.method3079(var36[var37], class89.method3729(65535) + var35.field3482, var38, var30, var31, var32);
                                                    }
                                                }
                                            }
                                            Statics.method3079(class226.field3011, class89.method3729(65535) + var35.field3482, 1002, var35.field3446 << 14, var31, var32);
                                        } else if ((Statics.field391 & 0x4) == 4) {
                                            Statics.method3079(field1079, field1160 + " " + class89.field1419 + " " + class89.method3729(65535) + var35.field3482, 2, var30, var31, var32);
                                        }
                                    }
                                    if (var33 == 1) {
                                        class87 var39 = field963[var34];
                                        if (var39 == null) {
                                            continue;
                                        }
                                        if (var39.field1400.field3562 == 1 && (var39.field1273 & 0x7F) == 64 && (var39.field1240 & 0x7F) == 64) {
                                            for (int var40 = 0; var40 < field938; var40++) {
                                                class87 var41 = field963[field950[var40]];
                                                if (var41 != null && var39 != var41 && var41.field1400.field3562 == 1 && var39.field1273 == var41.field1273 && var39.field1240 == var41.field1240) {
                                                    method312(var41.field1400, field950[var40], var31, var32);
                                                }
                                            }
                                            int var42 = class97.field1522;
                                            int[] var43 = class97.field1532;
                                            for (int var44 = 0; var44 < var42; var44++) {
                                                class75 var45 = field967[var43[var44]];
                                                if (var45 != null && var39.field1273 == var45.field1273 && var39.field1240 == var45.field1240) {
                                                    method3148(var45, var43[var44], var31, var32);
                                                }
                                            }
                                        }
                                        method312(var39.field1400, var34, var31, var32);
                                    }
                                    if (var33 == 0) {
                                        class75 var46 = field967[var34];
                                        if (var46 == null) {
                                            continue;
                                        }
                                        if ((var46.field1273 & 0x7F) == 64 && (var46.field1240 & 0x7F) == 64) {
                                            for (int var47 = 0; var47 < field938; var47++) {
                                                class87 var48 = field963[field950[var47]];
                                                if (var48 != null && var48.field1400.field3562 == 1 && var46.field1273 == var48.field1273 && var46.field1240 == var48.field1240) {
                                                    method312(var48.field1400, field950[var47], var31, var32);
                                                }
                                            }
                                            int var49 = class97.field1522;
                                            int[] var50 = class97.field1532;
                                            for (int var51 = 0; var51 < var49; var51++) {
                                                class75 var52 = field967[var50[var51]];
                                                if (var52 != null && var46 != var52 && var46.field1273 == var52.field1273 && var46.field1240 == var52.field1240) {
                                                    method3148(var52, var50[var51], var31, var32);
                                                }
                                            }
                                        }
                                        if (field1057 == var34) {
                                            var27 = var30;
                                        } else {
                                            method3148(var46, var34, var31, var32);
                                        }
                                    }
                                    if (var33 == 3) {
                                        class194 var53 = field986[Statics.field2137][var31][var32];
                                        if (var53 != null) {
                                            for (class95 var54 = (class95) var53.method3304(); var54 != null; var54 = (class95) var53.method3310()) {
                                                class257 var55 = class257.method3084(var54.field1513);
                                                if (field941 == 1) {
                                                    Statics.method3079(class226.field2988, field1082 + " " + class89.field1419 + " " + class89.method3729(16748608) + var55.field3505, 16, var54.field1513, var31, var32);
                                                } else if (!field1083) {
                                                    String[] var56 = var55.field3519;
                                                    if (field1200) {
                                                        var56 = method4097(var56);
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
                                                            Statics.method3079(var56[var57], class89.method3729(16748608) + var55.field3505, var58, var54.field1513, var31, var32);
                                                        } else if (var57 == 2) {
                                                            Statics.method3079(class226.field2861, class89.method3729(16748608) + var55.field3505, 20, var54.field1513, var31, var32);
                                                        }
                                                    }
                                                    Statics.method3079(class226.field3011, class89.method3729(16748608) + var55.field3505, 1004, var54.field1513, var31, var32);
                                                } else if ((Statics.field391 & 0x1) == 1) {
                                                    Statics.method3079(field1079, field1160 + " " + class89.field1419 + " " + class89.method3729(16748608) + var55.field3505, 17, var54.field1513, var31, var32);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var27 != -1) {
                                int var59 = var27 & 0x7F;
                                int var60 = var27 >> 7 & 0x7F;
                                class75 var61 = field967[field1057];
                                method3148(var61, field1057, var59, var60);
                            }
                        }
                    } else if (var9.field2659 != 1338) {
                        if (var9.field2659 == 1400) {
                            Statics.field601.method4857(class60.field749, class60.field750, var26, var10, var11, var9.field2750, var9.field2671);
                        }
                        if (!field925 && var26) {
                            if (var9.field2659 == 1400) {
                                Statics.field601.method4845(var10, var11, var9.field2750, var9.field2671, var24, var25);
                            } else {
                                method156(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2657 == 0) {
                            if (!var9.field2654 && method494(var9) && Statics.field3372 != var9) {
                                continue;
                            }
                            method225(arg0, var9.field2655, var12, var13, var14, var15, var10 - var9.field2676, var11 - var9.field2677);
                            if (var9.field2779 != null) {
                                method225(var9.field2779, var9.field2655, var12, var13, var14, var15, var10 - var9.field2676, var11 - var9.field2677);
                            }
                            class69 var76 = (class69) field1089.method3249((long) var9.field2655);
                            if (var76 != null) {
                                if (var76.field845 == 0 && class60.field749 >= var12 && class60.field750 >= var13 && class60.field749 < var14 && class60.field750 < var15 && !field925 && !field1098) {
                                    for (class70 var77 = (class70) field1036.method3303(); var77 != null; var77 = (class70) field1036.method3297()) {
                                        if (var77.field849) {
                                            var77.method3290();
                                            var77.field850.field2777 = false;
                                        }
                                    }
                                    if (Statics.field2810 == 0) {
                                        field1101 = null;
                                        field1102 = null;
                                    }
                                    if (!field925) {
                                        method946();
                                        field1072[0] = class226.field3099;
                                        field964[0] = "";
                                        field1024[0] = 1006;
                                        field1067 = 1;
                                    }
                                }
                                int var78 = var76.field844;
                                if (class217.method1012(var78)) {
                                    method225(Statics.field628[var78], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2654) {
                            if (var9.field2686) {
                                if (class60.field749 >= var12 && class60.field750 >= var13 && class60.field749 < var14 && class60.field750 < var15) {
                                    for (class70 var79 = (class70) field1036.method3303(); var79 != null; var79 = (class70) field1036.method3297()) {
                                        if (var79.field849) {
                                            var79.method3290();
                                            var79.field850.field2777 = false;
                                        }
                                    }
                                    if (Statics.field2810 == 0) {
                                        field1101 = null;
                                        field1102 = null;
                                    }
                                    if (!field925) {
                                        field1072[0] = class226.field3099;
                                        field964[0] = "";
                                        field1024[0] = 1006;
                                        field1067 = 1;
                                    }
                                }
                            } else if (var9.field2784 && class60.field749 >= var12 && class60.field750 >= var13 && class60.field749 < var14 && class60.field750 < var15) {
                                for (class70 var80 = (class70) field1036.method3303(); var80 != null; var80 = (class70) field1036.method3297()) {
                                    if (var80.field849 && var80.field850.field2733 == var80.field858) {
                                        var80.method3290();
                                    }
                                }
                            }
                            boolean var81;
                            if (class60.field749 >= var12 && class60.field750 >= var13 && class60.field749 < var14 && class60.field750 < var15) {
                                var81 = true;
                            } else {
                                var81 = false;
                            }
                            boolean var82 = false;
                            if ((class60.field755 == 1 || !Statics.field500 && class60.field755 == 4) && var81) {
                                var82 = true;
                            }
                            boolean var83 = false;
                            if ((class60.field743 == 1 || !Statics.field500 && class60.field743 == 4) && class60.field748 >= var12 && class60.field757 >= var13 && class60.field748 < var14 && class60.field757 < var15) {
                                var83 = true;
                            }
                            if (var83) {
                                method2632(var9, class60.field748 - var10, class60.field757 - var11);
                            }
                            if (var9.field2659 == 1400) {
                                Statics.field601.method4799(class60.field749, class60.field750, var81 & var82);
                            }
                            if (field1101 != null && field1101 != var9 && var81 && class218.method2440(method191(var9))) {
                                field1106 = var9;
                            }
                            if (field1102 == var9) {
                                field1070 = true;
                                field1176 = var10;
                                field1108 = var11;
                            }
                            if (var9.field2735) {
                                if (var81 && field1126 != 0 && var9.field2733 != null) {
                                    class70 var84 = new class70();
                                    var84.field849 = true;
                                    var84.field850 = var9;
                                    var84.field854 = field1126;
                                    var84.field858 = var9.field2733;
                                    field1036.method3322(var84);
                                }
                                if (field1101 != null || Statics.field1514 != null || field925) {
                                    var83 = false;
                                    var82 = false;
                                    var81 = false;
                                }
                                if (!var9.field2781 && var83) {
                                    var9.field2781 = true;
                                    if (var9.field2726 != null) {
                                        class70 var85 = new class70();
                                        var85.field849 = true;
                                        var85.field850 = var9;
                                        var85.field851 = class60.field748 - var10;
                                        var85.field854 = class60.field757 - var11;
                                        var85.field858 = var9.field2726;
                                        field1036.method3322(var85);
                                    }
                                }
                                if (var9.field2781 && var82 && var9.field2678 != null) {
                                    class70 var86 = new class70();
                                    var86.field849 = true;
                                    var86.field850 = var9;
                                    var86.field851 = class60.field749 - var10;
                                    var86.field854 = class60.field750 - var11;
                                    var86.field858 = var9.field2678;
                                    field1036.method3322(var86);
                                }
                                if (var9.field2781 && !var82) {
                                    var9.field2781 = false;
                                    if (var9.field2739 != null) {
                                        class70 var87 = new class70();
                                        var87.field849 = true;
                                        var87.field850 = var9;
                                        var87.field851 = class60.field749 - var10;
                                        var87.field854 = class60.field750 - var11;
                                        var87.field858 = var9.field2739;
                                        field1129.method3322(var87);
                                    }
                                }
                                if (var82 && var9.field2723 != null) {
                                    class70 var88 = new class70();
                                    var88.field849 = true;
                                    var88.field850 = var9;
                                    var88.field851 = class60.field749 - var10;
                                    var88.field854 = class60.field750 - var11;
                                    var88.field858 = var9.field2723;
                                    field1036.method3322(var88);
                                }
                                if (!var9.field2777 && var81) {
                                    var9.field2777 = true;
                                    if (var9.field2741 != null) {
                                        class70 var89 = new class70();
                                        var89.field849 = true;
                                        var89.field850 = var9;
                                        var89.field851 = class60.field749 - var10;
                                        var89.field854 = class60.field750 - var11;
                                        var89.field858 = var9.field2741;
                                        field1036.method3322(var89);
                                    }
                                }
                                if (var9.field2777 && var81 && var9.field2742 != null) {
                                    class70 var90 = new class70();
                                    var90.field849 = true;
                                    var90.field850 = var9;
                                    var90.field851 = class60.field749 - var10;
                                    var90.field854 = class60.field750 - var11;
                                    var90.field858 = var9.field2742;
                                    field1036.method3322(var90);
                                }
                                if (var9.field2777 && !var81) {
                                    var9.field2777 = false;
                                    if (var9.field2743 != null) {
                                        class70 var91 = new class70();
                                        var91.field849 = true;
                                        var91.field850 = var9;
                                        var91.field851 = class60.field749 - var10;
                                        var91.field854 = class60.field750 - var11;
                                        var91.field858 = var9.field2743;
                                        field1129.method3322(var91);
                                    }
                                }
                                if (var9.field2754 != null) {
                                    class70 var92 = new class70();
                                    var92.field850 = var9;
                                    var92.field858 = var9.field2754;
                                    field1128.method3322(var92);
                                }
                                if (var9.field2748 != null && field976 > var9.field2737) {
                                    if (var9.field2749 == null || field976 - var9.field2737 > 32) {
                                        class70 var97 = new class70();
                                        var97.field850 = var9;
                                        var97.field858 = var9.field2748;
                                        field1036.method3322(var97);
                                    } else {
                                        label791: for (int var93 = var9.field2737; var93 < field976; var93++) {
                                            int var94 = field1114[var93 & 0x1F];
                                            for (int var95 = 0; var95 < var9.field2749.length; var95++) {
                                                if (var9.field2749[var95] == var94) {
                                                    class70 var96 = new class70();
                                                    var96.field850 = var9;
                                                    var96.field858 = var9.field2748;
                                                    field1036.method3322(var96);
                                                    break label791;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2737 = field976;
                                }
                                if (var9.field2719 != null && field1117 > var9.field2670) {
                                    if (var9.field2788 == null || field1117 - var9.field2670 > 32) {
                                        class70 var102 = new class70();
                                        var102.field850 = var9;
                                        var102.field858 = var9.field2719;
                                        field1036.method3322(var102);
                                    } else {
                                        label767: for (int var98 = var9.field2670; var98 < field1117; var98++) {
                                            int var99 = field1116[var98 & 0x1F];
                                            for (int var100 = 0; var100 < var9.field2788.length; var100++) {
                                                if (var9.field2788[var100] == var99) {
                                                    class70 var101 = new class70();
                                                    var101.field850 = var9;
                                                    var101.field858 = var9.field2719;
                                                    field1036.method3322(var101);
                                                    break label767;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2670 = field1117;
                                }
                                if (var9.field2752 != null && field1068 > var9.field2667) {
                                    if (var9.field2753 == null || field1068 - var9.field2667 > 32) {
                                        class70 var107 = new class70();
                                        var107.field850 = var9;
                                        var107.field858 = var9.field2752;
                                        field1036.method3322(var107);
                                    } else {
                                        label743: for (int var103 = var9.field2667; var103 < field1068; var103++) {
                                            int var104 = field1118[var103 & 0x1F];
                                            for (int var105 = 0; var105 < var9.field2753.length; var105++) {
                                                if (var9.field2753[var105] == var104) {
                                                    class70 var106 = new class70();
                                                    var106.field850 = var9;
                                                    var106.field858 = var9.field2752;
                                                    field1036.method3322(var106);
                                                    break label743;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2667 = field1068;
                                }
                                if (field1120 > var9.field2782 && var9.field2757 != null) {
                                    class70 var108 = new class70();
                                    var108.field850 = var9;
                                    var108.field858 = var9.field2757;
                                    field1036.method3322(var108);
                                }
                                if (field1026 > var9.field2782 && var9.field2759 != null) {
                                    class70 var109 = new class70();
                                    var109.field850 = var9;
                                    var109.field858 = var9.field2759;
                                    field1036.method3322(var109);
                                }
                                if (field1122 > var9.field2782 && var9.field2760 != null) {
                                    class70 var110 = new class70();
                                    var110.field850 = var9;
                                    var110.field858 = var9.field2760;
                                    field1036.method3322(var110);
                                }
                                if (field1111 > var9.field2782 && var9.field2664 != null) {
                                    class70 var111 = new class70();
                                    var111.field850 = var9;
                                    var111.field858 = var9.field2664;
                                    field1036.method3322(var111);
                                }
                                if (field1005 > var9.field2782 && var9.field2702 != null) {
                                    class70 var112 = new class70();
                                    var112.field850 = var9;
                                    var112.field858 = var9.field2702;
                                    field1036.method3322(var112);
                                }
                                if (field1125 > var9.field2782 && var9.field2761 != null) {
                                    class70 var113 = new class70();
                                    var113.field850 = var9;
                                    var113.field858 = var9.field2761;
                                    field1036.method3322(var113);
                                }
                                var9.field2782 = field1113;
                                if (var9.field2762 != null) {
                                    for (int var114 = 0; var114 < field1038; var114++) {
                                        class70 var115 = new class70();
                                        var115.field850 = var9;
                                        var115.field855 = field1151[var114];
                                        var115.field856 = field1150[var114];
                                        var115.field858 = var9.field2762;
                                        field1036.method3322(var115);
                                    }
                                }
                            }
                        }
                        if (!var9.field2654 && field1101 == null && Statics.field1514 == null && !field925) {
                            if ((var9.field2770 >= 0 || var9.field2682 != 0) && class60.field749 >= var12 && class60.field750 >= var13 && class60.field749 < var14 && class60.field750 < var15) {
                                if (var9.field2770 >= 0) {
                                    Statics.field3372 = arg0[var9.field2770];
                                } else {
                                    Statics.field3372 = var9;
                                }
                            }
                            if (var9.field2657 == 8 && class60.field749 >= var12 && class60.field750 >= var13 && class60.field749 < var14 && class60.field750 < var15) {
                                Statics.field1212 = var9;
                            }
                            if (var9.field2679 > var9.field2671) {
                                method3088(var9, var9.field2750 + var10, var11, var9.field2671, var9.field2679, class60.field749, class60.field750);
                            }
                        }
                    } else if ((field1162 == 0 || field1162 == 3) && (class60.field743 == 1 || !Statics.field500 && class60.field743 == 4)) {
                        class211 var62 = var9.method3660(true);
                        if (var62 != null) {
                            int var63 = class60.field748 - var10;
                            int var64 = class60.field757 - var11;
                            if (var62.method3577(var63, var64)) {
                                int var65 = var63 - var62.field2608 / 2;
                                int var66 = var64 - var62.field2603 / 2;
                                int var67 = field1086 + field1011 & 0x7FF;
                                int var68 = class137.field2046[var67];
                                int var69 = class137.field2023[var67];
                                int var70 = (field1000 + 256) * var68 >> 8;
                                int var71 = (field1000 + 256) * var69 >> 8;
                                int var72 = var65 * var71 + var66 * var70 >> 11;
                                int var73 = var66 * var71 - var65 * var70 >> 11;
                                int var74 = Statics.field803.field1273 + var72 >> 7;
                                int var75 = Statics.field803.field1240 - var73 >> 7;
                                field969.method3116(115);
                                field969.method2865(18);
                                field969.method2904(class51.field660[82] ? (class51.field660[81] ? 2 : 1) : 0);
                                field969.method2990(Statics.field3674 + var75);
                                field969.method2990(Statics.field669 + var74);
                                field969.method2865(var65);
                                field969.method2865(var66);
                                field969.method2990(field1011);
                                field969.method2865(57);
                                field969.method2865(field1086);
                                field969.method2865(field1000);
                                field969.method2865(89);
                                field969.method2990(Statics.field803.field1273);
                                field969.method2990(Statics.field803.field1240);
                                field969.method2865(63);
                                field948 = var74;
                                field1161 = var75;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.ir([Lho;II)V")
    public static final void method23(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2657 == 0) {
                    if (var3.field2779 != null) {
                        method23(var3.field2779, arg1);
                    }
                    class69 var4 = (class69) field1089.method3249((long) var3.field2655);
                    if (var4 != null) {
                        int var5 = var4.field844;
                        if (class217.method1012(var5)) {
                            method23(Statics.field628[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2732 != null) {
                    class70 var6 = new class70();
                    var6.field850 = var3;
                    var6.field858 = var3.field2732;
                    class84.method68(var6);
                }
                if (arg1 == 1 && var3.field2763 != null) {
                    if (var3.field2656 >= 0) {
                        class217 var7 = class217.method3122(var3.field2655);
                        if (var7 == null || var7.field2779 == null || var3.field2656 >= var7.field2779.length || var7.field2779[var3.field2656] != var3) {
                            continue;
                        }
                    }
                    class70 var8 = new class70();
                    var8.field850 = var3;
                    var8.field858 = var3.field2763;
                    class84.method68(var8);
                }
            }
        }
    }

    @ObfuscatedName("em.ia(Lho;III)V")
    public static final void method2632(class217 arg0, int arg1, int arg2) {
        if (field1101 != null || field925 || arg0 == null) {
            return;
        }
        class217 var3 = arg0;
        int var4 = method191(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class217 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = class217.method3122(var3.field2674);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class217 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2709;
        }
        if (var9 == null) {
            return;
        }
        field1101 = arg0;
        class217 var11 = arg0;
        int var12 = method191(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class217 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = class217.method3122(var11.field2674);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class217 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2709;
        }
        field1102 = var17;
        field1103 = arg1;
        field1104 = arg2;
        Statics.field2810 = 0;
        field1112 = false;
        int var19 = method8();
        if (var19 != -1) {
            Statics.field282 = new class90();
            Statics.field282.field1434 = field1020[var19];
            Statics.field282.field1430 = field1069[var19];
            Statics.field282.field1428 = field1024[var19];
            Statics.field282.field1429 = field1071[var19];
            Statics.field282.field1426 = field1072[var19];
        }
        return;
    }

    @ObfuscatedName("client.iv(I)V")
    public final void method1309() {
        method1571(field1101);
        Statics.field2810++;
        if (field1177 && field1070) {
            int var1 = class60.field749;
            int var2 = class60.field750;
            int var3 = var1 - field1103;
            int var4 = var2 - field1104;
            if (var3 < field1176) {
                var3 = field1176;
            }
            if (field1101.field2750 + var3 > field1176 + field1102.field2750) {
                var3 = field1176 + field1102.field2750 - field1101.field2750;
            }
            if (var4 < field1108) {
                var4 = field1108;
            }
            if (field1101.field2671 + var4 > field1108 + field1102.field2671) {
                var4 = field1108 + field1102.field2671 - field1101.field2671;
            }
            int var5 = var3 - field1110;
            int var6 = var4 - field961;
            int var7 = field1101.field2731;
            if (Statics.field2810 > field1101.field2721 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1112 = true;
            }
            int var8 = field1102.field2676 + (var3 - field1176);
            int var9 = field1102.field2677 + (var4 - field1108);
            if (field1101.field2644 != null && field1112) {
                class70 var10 = new class70();
                var10.field850 = field1101;
                var10.field851 = var8;
                var10.field854 = var9;
                var10.field858 = field1101.field2644;
                class84.method68(var10);
            }
            if (class60.field755 == 0) {
                if (field1112) {
                    if (field1101.field2745 != null) {
                        class70 var11 = new class70();
                        var11.field850 = field1101;
                        var11.field851 = var8;
                        var11.field854 = var9;
                        var11.field860 = field1106;
                        var11.field858 = field1101.field2745;
                        class84.method68(var11);
                    }
                    if (field1106 != null) {
                        class217 var12 = field1101;
                        int var13 = method191(var12);
                        int var14 = var13 >> 17 & 0x7;
                        int var15 = var14;
                        class217 var16;
                        if (var14 == 0) {
                            var16 = null;
                        } else {
                            int var17 = 0;
                            while (true) {
                                if (var17 >= var15) {
                                    var16 = var12;
                                    break;
                                }
                                var12 = class217.method3122(var12.field2674);
                                if (var12 == null) {
                                    var16 = null;
                                    break;
                                }
                                var17++;
                            }
                        }
                        if (var16 != null) {
                            field969.method3116(101);
                            field969.method2967(field1106.field2655);
                            field969.method3057(field1106.field2656);
                            field969.method2868(field1101.field2655);
                            field969.method2911(field1101.field2656);
                            field969.method2990(field1101.field2775);
                            field969.method2990(field1106.field2775);
                        }
                    }
                } else {
                    label125: {
                        label95: {
                            int var18 = method8();
                            if (field1067 > 2) {
                                if (field1065 == 1 && !method2638()) {
                                    break label95;
                                }
                                boolean var19;
                                if (var18 < 0) {
                                    var19 = false;
                                } else {
                                    int var20 = field1024[var18];
                                    if (var20 >= 2000) {
                                        var20 -= 2000;
                                    }
                                    if (var20 == 1007) {
                                        var19 = true;
                                    } else {
                                        var19 = false;
                                    }
                                }
                                if (var19) {
                                    break label95;
                                }
                            }
                            if (field1067 > 0) {
                                int var21 = field1110 + field1103;
                                int var22 = field961 + field1104;
                                method1013(Statics.field282, var21, var22);
                                Statics.field282 = null;
                            }
                            break label125;
                        }
                        this.method1088(field1110 + field1103, field961 + field1104);
                    }
                }
                field1101 = null;
            }
        } else if (Statics.field2810 > 1) {
            field1101 = null;
        }
    }

    @ObfuscatedName("cv.it(Lho;I)V")
    public static void method1571(class217 arg0) {
        if (field1132 == arg0.field2787) {
            field1133[arg0.field2786] = true;
        }
    }

    @ObfuscatedName("bu.ik(B)V")
    public static void method1026() {
        for (class69 var0 = (class69) field1089.method3252(); var0 != null; var0 = (class69) field1089.method3257()) {
            int var1 = var0.field844;
            if (class217.method1012(var1)) {
                boolean var2 = true;
                class217[] var3 = Statics.field628[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2654;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2473;
                    class217 var6 = class217.method3122(var5);
                    if (var6 != null) {
                        method1571(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ie.iw([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method4097(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("hv.ie(II)V")
    public static final void method3739(int arg0) {
        if (!class217.method1012(arg0)) {
            return;
        }
        class217[] var1 = Statics.field628[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3 != null) {
                var3.field2789 = 0;
                var3.field2778 = 0;
            }
        }
    }

    @ObfuscatedName("p.ib([Lho;II)V")
    public static final void method133(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null && var3.field2674 == arg1 && (!var3.field2654 || !method494(var3))) {
                if (var3.field2657 == 0) {
                    if (!var3.field2654 && method494(var3) && Statics.field3372 != var3) {
                        continue;
                    }
                    method133(arg0, var3.field2655);
                    if (var3.field2779 != null) {
                        method133(var3.field2779, var3.field2655);
                    }
                    class69 var4 = (class69) field1089.method3249((long) var3.field2655);
                    if (var4 != null) {
                        int var5 = var4.field844;
                        if (class217.method1012(var5)) {
                            method133(Statics.field628[var5], -1);
                        }
                    }
                }
                if (var3.field2657 == 6) {
                    if (var3.field2718 != -1 || var3.field2703 != -1) {
                        boolean var6 = method235(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2703;
                        } else {
                            var7 = var3.field2718;
                        }
                        if (var7 != -1) {
                            class261 var8 = class261.method3746(var7);
                            var3.field2778 += field1003;
                            while (var3.field2778 > var8.field3613[var3.field2789]) {
                                var3.field2778 -= var8.field3613[var3.field2789];
                                var3.field2789++;
                                if (var3.field2789 >= var8.field3610.length) {
                                    var3.field2789 -= var8.field3611;
                                    if (var3.field2789 < 0 || var3.field2789 >= var8.field3610.length) {
                                        var3.field2789 = 0;
                                    }
                                }
                                method1571(var3);
                            }
                        }
                    }
                    if (var3.field2711 != 0 && !var3.field2654) {
                        int var9 = var3.field2711 >> 16;
                        int var10 = var3.field2711 << 16 >> 16;
                        int var11 = field1003 * var9;
                        int var12 = field1003 * var10;
                        var3.field2706 = var3.field2706 + var11 & 0x7FF;
                        var3.field2707 = var3.field2707 + var12 & 0x7FF;
                        method1571(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cl.il(II)V")
    public static final void method1481(int arg0) {
        method1026();
        for (class83 var1 = (class83) class83.field1350.method3303(); var1 != null; var1 = (class83) class83.field1350.method3297()) {
            if (var1.field1346 != null) {
                var1.method1484();
            }
        }
        class242 var2 = (class242) class242.field3291.method3235((long) arg0);
        class242 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3293.method3768(16, arg0);
            class242 var5 = new class242();
            if (var4 != null) {
                var5.method3922(new class174(var4));
            }
            class242.field3291.method3234(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        int var6 = var3.field3292;
        if (var6 == 0) {
            return;
        }
        int var7 = class212.field2613[arg0];
        if (var6 == 1) {
            if (var7 == 1) {
                class137.method2363(0.9D);
                ((class126) Statics.field2029).method2160(0.9D);
            }
            if (var7 == 2) {
                class137.method2363(0.8D);
                ((class126) Statics.field2029).method2160(0.8D);
            }
            if (var7 == 3) {
                class137.method2363(0.7D);
                ((class126) Statics.field2029).method2160(0.7D);
            }
            if (var7 == 4) {
                class137.method2363(0.6D);
                ((class126) Statics.field2029).method2160(0.6D);
            }
            class257.method503();
        }
        if (var6 == 3) {
            short var8 = 0;
            if (var7 == 0) {
                var8 = 255;
            }
            if (var7 == 1) {
                var8 = 192;
            }
            if (var7 == 2) {
                var8 = 128;
            }
            if (var7 == 3) {
                var8 = 64;
            }
            if (var7 == 4) {
                var8 = 0;
            }
            if (field1163 != var8) {
                if (field1163 == 0 && field1164 != -1) {
                    class204.method219(Statics.field606, field1164, 0, var8, false);
                    field1015 = false;
                } else if (var8 == 0) {
                    Statics.field2510.method3443();
                    class204.field2509 = 1;
                    Statics.field786 = null;
                    field1015 = false;
                } else {
                    class204.method1644(var8);
                }
                field1163 = var8;
            }
        }
        if (var6 == 4) {
            if (var7 == 0) {
                field1166 = 127;
            }
            if (var7 == 1) {
                field1166 = 96;
            }
            if (var7 == 2) {
                field1166 = 64;
            }
            if (var7 == 3) {
                field1166 = 32;
            }
            if (var7 == 4) {
                field1166 = 0;
            }
        }
        if (var6 == 5) {
            field1065 = var7;
        }
        if (var6 == 6) {
            field1090 = var7;
        }
        if (var6 == 9) {
            field1142 = var7;
        }
        if (var6 == 10) {
            if (var7 == 0) {
                field1099 = 127;
            }
            if (var7 == 1) {
                field1099 = 96;
            }
            if (var7 == 2) {
                field1099 = 64;
            }
            if (var7 == 3) {
                field1099 = 32;
            }
            if (var7 == 4) {
                field1099 = 0;
            }
        }
        if (var6 == 17) {
            field1066 = var7 & 0xFFFF;
        }
        if (var6 == 18) {
            field1013 = (class92) class169.method2353(class92.method644(), var7);
            if (field1013 == null) {
                field1013 = class92.field1443;
            }
        }
        if (var6 == 19) {
            if (var7 == -1) {
                field1057 = -1;
            } else {
                field1057 = var7 & 0x7FF;
            }
        }
        if (var6 == 22) {
            field953 = (class92) class169.method2353(class92.method644(), var7);
            if (field953 == null) {
                field953 = class92.field1443;
            }
        }
    }

    @ObfuscatedName("p.iu(Lho;I)V")
    public static final void method135(class217 arg0) {
        int var1 = arg0.field2659;
        if (var1 == 324) {
            if (field1039 == -1) {
                field1039 = arg0.field2690;
                field1201 = arg0.field2691;
            }
            if (field1199.field2623) {
                arg0.field2690 = field1039;
            } else {
                arg0.field2690 = field1201;
            }
        } else if (var1 == 325) {
            if (field1039 == -1) {
                field1039 = arg0.field2690;
                field1201 = arg0.field2691;
            }
            if (field1199.field2623) {
                arg0.field2690 = field1201;
            } else {
                arg0.field2690 = field1039;
            }
        } else if (var1 == 327) {
            arg0.field2706 = 150;
            arg0.field2707 = (int) (Math.sin((double) field936 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2662 = 5;
            arg0.field2699 = 0;
        } else if (var1 == 328) {
            arg0.field2706 = 150;
            arg0.field2707 = (int) (Math.sin((double) field936 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2662 = 5;
            arg0.field2699 = 1;
        }
    }

    @ObfuscatedName("dt.ig(I)V")
    public static final void method1918() {
        field969.method3116(131);
        for (class69 var0 = (class69) field1089.method3252(); var0 != null; var0 = (class69) field1089.method3257()) {
            if (var0.field845 == 0 || var0.field845 == 3) {
                method1626(var0, true);
            }
        }
        if (field1092 != null) {
            method1571(field1092);
            field1092 = null;
        }
    }

    @ObfuscatedName("ai.id(IIIB)Lbs;")
    public static final class69 method220(int arg0, int arg1, int arg2) {
        class69 var3 = new class69();
        var3.field844 = arg1;
        var3.field845 = arg2;
        field1089.method3248(var3, (long) arg0);
        method3739(arg1);
        class217 var4 = class217.method3122(arg0);
        method1571(var4);
        if (field1092 != null) {
            method1571(field1092);
            field1092 = null;
        }
        method134();
        method485(Statics.field628[arg0 >> 16], var4, false);
        class84.method1027(arg1);
        if (field1088 != -1) {
            int var5 = field1088;
            if (class217.method1012(var5)) {
                method23(Statics.field628[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("ci.is(Lbs;ZB)V")
    public static final void method1626(class69 arg0, boolean arg1) {
        int var2 = arg0.field844;
        int var3 = (int) arg0.field2473;
        arg0.method3290();
        if (arg1 && var2 != -1 && Statics.field2238[var2]) {
            Statics.field2647.method3781(var2);
            if (Statics.field628[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field628[var2].length; var5++) {
                    if (Statics.field628[var2][var5] != null) {
                        if (Statics.field628[var2][var5].field2657 == 2) {
                            var4 = false;
                        } else {
                            Statics.field628[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field628[var2] = null;
                }
                Statics.field2238[var2] = false;
            }
        }
        method3503(var2);
        class217 var6 = class217.method3122(var3);
        if (var6 != null) {
            method1571(var6);
        }
        method134();
        if (field1088 != -1) {
            int var7 = field1088;
            if (class217.method1012(var7)) {
                method23(Statics.field628[var7], 1);
            }
        }
    }

    @ObfuscatedName("bd.in(IIIILjk;Lhf;I)V")
    public static final void method1035(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method499(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field1086 + field1011 & 0x7FF;
        int var8 = class137.field2046[var7];
        int var9 = class137.field2023[var7];
        int var10 = var8 * 256 / (field1000 + 256);
        int var11 = var9 * 256 / (field1000 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field453.method4735(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("at.jn(IIIILjk;Lhf;B)V")
    public static final void method499(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field1086 + field1011 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class137.field2046[var6];
        int var9 = class137.field2023[var6];
        int var10 = var8 * 256 / (field1000 + 256);
        int var11 = var9 * 256 / (field1000 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method4678(arg5.field2608 / 2 + var12 - arg4.field3790 / 2, arg5.field2603 / 2 - var13 - arg4.field3793 / 2, arg0, arg1, arg5.field2608, arg5.field2603, arg5.field2605, arg5.field2609);
        } else {
            arg4.method4659(arg5.field2608 / 2 + arg0 + var12 - arg4.field3790 / 2, arg5.field2603 / 2 + arg1 - var13 - arg4.field3793 / 2);
        }
    }

    @ObfuscatedName("x.jr(Ljava/lang/String;ZI)Z")
    public static boolean method159(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class268.method1070(arg0, Statics.field929);
        for (int var3 = 0; var3 < field1193; var3++) {
            if (var2.equalsIgnoreCase(class268.method1070(field1195[var3].field827, Statics.field929)) && (!arg1 || field1195[var3].field823 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class268.method1070(Statics.field803.field913, Statics.field929))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("w.jo(Ljava/lang/String;I)Z")
    public static boolean method3(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class268.method1070(arg0, Statics.field929);
        for (int var2 = 0; var2 < field1197; var2++) {
            class71 var3 = field1119[var2];
            if (var1.equalsIgnoreCase(class268.method1070(var3.field864, Statics.field929))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class268.method1070(var3.field863, Statics.field929))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ey.jf(Ljava/lang/String;ZI)V")
    public static final void method2648(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field1197 < 100 || field1050 == 1) || field1197 >= 400) {
            class99.method2665(31, "", class226.field3110);
            return;
        }
        String var2 = class268.method1070(arg0, Statics.field929);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field1197; var3++) {
            class71 var4 = field1119[var3];
            String var5 = class268.method1070(var4.field864, Statics.field929);
            if (var5 != null && var5.equals(var2)) {
                class99.method2665(31, "", arg0 + class226.field2978);
                return;
            }
            if (var4.field863 != null) {
                String var6 = class268.method1070(var4.field863, Statics.field929);
                if (var6 != null && var6.equals(var2)) {
                    class99.method2665(31, "", arg0 + class226.field2978);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field1193; var7++) {
            class66 var8 = field1195[var7];
            String var9 = class268.method1070(var8.field827, Statics.field929);
            if (var9 != null && var9.equals(var2)) {
                class99.method2665(31, "", class226.field3034 + arg0 + class226.field2951);
                return;
            }
            if (var8.field822 != null) {
                String var10 = class268.method1070(var8.field822, Statics.field929);
                if (var10 != null && var10.equals(var2)) {
                    class99.method2665(31, "", class226.field3034 + arg0 + class226.field2951);
                    return;
                }
            }
        }
        if (class268.method1070(Statics.field803.field913, Statics.field929).equals(var2)) {
            class99.method2665(31, "", class226.field3031);
        } else {
            field969.method3116(33);
            field969.method2865(class174.method4370(arg0));
            field969.method2871(arg0);
        }
    }

    @ObfuscatedName("co.ju(Ljava/lang/String;I)V")
    public static final void method1716(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class268.method1070(arg0, Statics.field929);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1193; var2++) {
            class66 var3 = field1195[var2];
            String var4 = var3.field827;
            String var5 = class268.method1070(var4, Statics.field929);
            if (class278.method4526(arg0, var1, var4, var5)) {
                field1193--;
                for (int var6 = var2; var6 < field1193; var6++) {
                    field1195[var6] = field1195[var6 + 1];
                }
                field1026 = field1113;
                field969.method3116(87);
                field969.method2865(class174.method4370(arg0));
                field969.method2871(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("af.jq(Ljava/lang/String;B)V")
    public static final void method680(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class268.method1070(arg0, Statics.field929);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1197; var2++) {
            class71 var3 = field1119[var2];
            String var4 = var3.field864;
            String var5 = class268.method1070(var4, Statics.field929);
            if (class278.method4526(arg0, var1, var4, var5)) {
                field1197--;
                for (int var6 = var2; var6 < field1197; var6++) {
                    field1119[var6] = field1119[var6 + 1];
                }
                field1026 = field1113;
                field969.method3116(215);
                field969.method2865(class174.method4370(arg0));
                field969.method2871(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("b.ja(Ljava/lang/String;I)V")
    public static final void method103(String arg0) {
        if (Statics.field263 != null) {
            field969.method3116(34);
            field969.method2865(class174.method4370(arg0));
            field969.method2871(arg0);
        }
    }

    @ObfuscatedName("cu.jp(Ljava/lang/String;I)V")
    public static final void method1643(String arg0) {
        if (!arg0.equals("")) {
            field969.method3116(73);
            field969.method2865(class174.method4370(arg0));
            field969.method2871(arg0);
        }
    }

    @ObfuscatedName("cd.jm(I)V")
    public static final void method1415() {
        field969.method3116(73);
        field969.method2865(0);
    }

    @ObfuscatedName("gl.jy(IB)V")
    public static void method3503(int arg0) {
        for (class199 var1 = (class199) field1130.method3252(); var1 != null; var1 = (class199) field1130.method3257()) {
            if ((long) arg0 == (var1.field2473 >> 48 & 0xFFFFL)) {
                var1.method3290();
            }
        }
    }

    @ObfuscatedName("ah.ji(Lho;I)I")
    public static int method191(class217 arg0) {
        class199 var1 = (class199) field1130.method3249(((long) arg0.field2655 << 32) + (long) arg0.field2656);
        return var1 == null ? arg0.field2695 : var1.field2488;
    }

    @ObfuscatedName("ac.jc(Lho;B)Z")
    public static boolean method494(class217 arg0) {
        if (field1098) {
            if (method191(arg0) != 0) {
                return false;
            }
            if (arg0.field2657 == 0) {
                return false;
            }
        }
        return arg0.field2675;
    }

    @ObfuscatedName("p.je(Lho;II)Ljava/lang/String;")
    public static String method132(class217 arg0, int arg1) {
        int var2 = method191(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2755 == null) {
            return null;
        } else if (arg0.field2729 == null || arg0.field2729.length <= arg1 || arg0.field2729[arg1] == null || arg0.field2729[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2729[arg1];
        }
    }

    @ObfuscatedName("fc.js(Lho;I)Ljava/lang/String;")
    public static String method2778(class217 arg0) {
        int var1 = method191(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2734 == null || arg0.field2734.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2734;
        }
    }

    @ObfuscatedName("an.jh(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method226(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field1203 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field1203 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field1203 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field1203 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field1203 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1063 != null) {
            var3 = "/p=" + Statics.field1063;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field932 + "/a=" + Statics.field481 + var3 + "/";
    }

    @ObfuscatedName("ac.jx(Lfp;II)V")
    public static void method495(class174 arg0, int arg1) {
        byte[] var2 = arg0.field2405;
        if (field962 == null) {
            field962 = new byte[24];
        }
        class184.method3168(var2, arg1, field962, 0, 24);
        if (class156.field2259 == null) {
            return;
        }
        try {
            class156.field2259.method2114(0L);
            class156.field2259.method2115(arg0.field2405, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("by.jg(Lfp;I)V")
    public static void method1043(class174 arg0) {
        if (field962 == null) {
            byte[] var1 = class156.method477();
            arg0.method2874(var1, 0, var1.length);
        } else {
            arg0.method2874(field962, 0, field962.length);
        }
    }
}
