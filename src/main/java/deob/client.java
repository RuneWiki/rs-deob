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
    public static class165[] field1053 = new class165[4];

    @ObfuscatedName("client.ak")
    public static boolean field1172 = true;

    @ObfuscatedName("client.aw")
    public static int field1007 = 1;

    @ObfuscatedName("client.an")
    public static int field950 = 0;

    @ObfuscatedName("client.bk")
    public static int field920 = 0;

    @ObfuscatedName("client.bf")
    public static boolean field1136 = false;

    @ObfuscatedName("client.bl")
    public static boolean field1082 = false;

    @ObfuscatedName("client.bp")
    public static int field1129 = 0;

    @ObfuscatedName("client.bw")
    public static int field1175 = 0;

    @ObfuscatedName("client.bz")
    public static boolean field925 = true;

    @ObfuscatedName("client.bn")
    public static int field948 = 0;

    @ObfuscatedName("client.bd")
    public static long field1156 = 1L;

    @ObfuscatedName("client.bi")
    public static int field951 = -1;

    @ObfuscatedName("client.bu")
    public static int field929 = -1;

    @ObfuscatedName("client.bg")
    public static int field930 = -1;

    @ObfuscatedName("client.bj")
    public static boolean field931 = true;

    @ObfuscatedName("client.bb")
    public static boolean field932 = false;

    @ObfuscatedName("client.be")
    public static int field933 = 0;

    @ObfuscatedName("client.bt")
    public static int field934 = 0;

    @ObfuscatedName("client.bo")
    public static int field935 = 0;

    @ObfuscatedName("client.bx")
    public static int field936 = 0;

    @ObfuscatedName("client.ba")
    public static int field937 = 0;

    @ObfuscatedName("client.bq")
    public static int field938 = 0;

    @ObfuscatedName("client.cy")
    public static int field1067 = 0;

    @ObfuscatedName("client.cd")
    public static int field940 = 0;

    @ObfuscatedName("client.ci")
    public static int field941 = 0;

    @ObfuscatedName("client.ct")
    public static class92 field942 = class92.field1415;

    @ObfuscatedName("client.cg")
    public static class92 field918 = class92.field1415;

    @ObfuscatedName("client.cz")
    public static int field944 = 0;

    @ObfuscatedName("client.cw")
    public static int field945 = 0;

    @ObfuscatedName("client.cl")
    public static int field946 = 0;

    @ObfuscatedName("client.dx")
    public static int field947 = 0;

    @ObfuscatedName("client.dd")
    public static int field990 = 0;

    @ObfuscatedName("client.di")
    public static int field949 = 0;

    @ObfuscatedName("client.dz")
    public static int field989 = 0;

    @ObfuscatedName("client.dw")
    public static int field986 = 0;

    @ObfuscatedName("client.ds")
    public static byte[] field952 = null;

    @ObfuscatedName("client.dy")
    public static class87[] field953 = new class87[32768];

    @ObfuscatedName("client.dv")
    public static int field954 = 0;

    @ObfuscatedName("client.dj")
    public static int[] field955 = new int[32768];

    @ObfuscatedName("client.dr")
    public static int field956 = 0;

    @ObfuscatedName("client.dn")
    public static int[] field1111 = new int[250];

    @ObfuscatedName("client.ec")
    public static class183 field958 = new class183(5000);

    @ObfuscatedName("client.ev")
    public static class183 field959 = new class183(5000);

    @ObfuscatedName("client.eu")
    public static class183 field960 = new class183(15000);

    @ObfuscatedName("client.ep")
    public static int field961 = 0;

    @ObfuscatedName("client.em")
    public static int field1074 = 0;

    @ObfuscatedName("client.es")
    public static int field963 = 0;

    @ObfuscatedName("client.ed")
    public static int field1051 = 0;

    @ObfuscatedName("client.en")
    public static int field1028 = 0;

    @ObfuscatedName("client.eg")
    public static int field966 = 0;

    @ObfuscatedName("client.ee")
    public static int field976 = 0;

    @ObfuscatedName("client.ez")
    public static int field1095 = 0;

    @ObfuscatedName("client.ex")
    public static boolean field969 = false;

    @ObfuscatedName("client.ey")
    public static HashMap field1153 = new HashMap();

    @ObfuscatedName("client.ft")
    public static int field1135 = 0;

    @ObfuscatedName("client.fr")
    public static int field1029 = 1;

    @ObfuscatedName("client.fi")
    public static int field973 = 0;

    @ObfuscatedName("client.fq")
    public static int field1019 = 1;

    @ObfuscatedName("client.fh")
    public static int field975 = 0;

    @ObfuscatedName("client.ff")
    public static boolean field1127 = false;

    @ObfuscatedName("client.fj")
    public static int[][][] field1149 = new int[4][13][13];

    @ObfuscatedName("client.fp")
    public static final int[] field979 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fk")
    public static int field980 = 0;

    @ObfuscatedName("client.fg")
    public static int field981 = 2;

    @ObfuscatedName("client.fs")
    public static int field1049 = 0;

    @ObfuscatedName("client.fu")
    public static int field1005 = 2;

    @ObfuscatedName("client.fy")
    public static int field1085 = 0;

    @ObfuscatedName("client.fc")
    public static int field985 = 1;

    @ObfuscatedName("client.fn")
    public static int field983 = 0;

    @ObfuscatedName("client.fd")
    public static int field987 = 0;

    @ObfuscatedName("client.gd")
    public static int field988 = 2;

    @ObfuscatedName("client.gz")
    public static int field994 = 0;

    @ObfuscatedName("client.gj")
    public static int field939 = 1;

    @ObfuscatedName("client.go")
    public static int field991 = 0;

    @ObfuscatedName("client.gk")
    public static int field992 = 0;

    @ObfuscatedName("client.gp")
    public static int field1150 = 2301979;

    @ObfuscatedName("client.gc")
    public static int field1090 = 5063219;

    @ObfuscatedName("client.gv")
    public static int field995 = 3353893;

    @ObfuscatedName("client.gh")
    public static int field1137 = 7759444;

    @ObfuscatedName("client.gx")
    public static boolean field997 = false;

    @ObfuscatedName("client.gi")
    public static int field927 = 0;

    @ObfuscatedName("client.hm")
    public static int field971 = 128;

    @ObfuscatedName("client.hb")
    public static int field1000 = 0;

    @ObfuscatedName("client.hf")
    public static int field1001 = 0;

    @ObfuscatedName("client.ha")
    public static int field1002 = 0;

    @ObfuscatedName("client.hu")
    public static int field1003 = 0;

    @ObfuscatedName("client.hc")
    public static int field923 = 0;

    @ObfuscatedName("client.hp")
    public static int field1058 = 50;

    @ObfuscatedName("client.hz")
    public static int field1006 = 0;

    @ObfuscatedName("client.he")
    public static boolean field916 = false;

    @ObfuscatedName("client.hx")
    public static int field1055 = 0;

    @ObfuscatedName("client.hv")
    public static int field1009 = 0;

    @ObfuscatedName("client.hd")
    public static int field1010 = 50;

    @ObfuscatedName("client.hw")
    public static int[] field1011 = new int[field1010];

    @ObfuscatedName("client.hj")
    public static int[] field1012 = new int[field1010];

    @ObfuscatedName("client.hg")
    public static int[] field1182 = new int[field1010];

    @ObfuscatedName("client.hs")
    public static int[] field1014 = new int[field1010];

    @ObfuscatedName("client.hk")
    public static int[] field922 = new int[field1010];

    @ObfuscatedName("client.hr")
    public static int[] field1016 = new int[field1010];

    @ObfuscatedName("client.hi")
    public static int[] field1017 = new int[field1010];

    @ObfuscatedName("client.ho")
    public static String[] field1018 = new String[field1010];

    @ObfuscatedName("client.hh")
    public static int[][] field968 = new int[104][104];

    @ObfuscatedName("client.hl")
    public static int field1020 = 0;

    @ObfuscatedName("client.ht")
    public static int field977 = -1;

    @ObfuscatedName("client.io")
    public static int field1022 = -1;

    @ObfuscatedName("client.it")
    public static String field1070 = null;

    @ObfuscatedName("client.iu")
    public static int field1023 = 0;

    @ObfuscatedName("client.iw")
    public static int field1024 = 0;

    @ObfuscatedName("client.ik")
    public static int field1025 = 0;

    @ObfuscatedName("client.ir")
    public static int field1026 = 0;

    @ObfuscatedName("client.ij")
    public static int field1186 = 0;

    @ObfuscatedName("client.in")
    public static int field1040 = 0;

    @ObfuscatedName("client.ie")
    public static int field972 = 0;

    @ObfuscatedName("client.ig")
    public static int field1013 = 0;

    @ObfuscatedName("client.ic")
    public static int field1092 = 0;

    @ObfuscatedName("client.ii")
    public static int field1032 = 0;

    @ObfuscatedName("client.ia")
    public static boolean field1033 = false;

    @ObfuscatedName("client.id")
    public static int field1084 = 0;

    @ObfuscatedName("client.il")
    public static int field1035 = 0;

    @ObfuscatedName("client.iv")
    public static class75[] field970 = new class75[2048];

    @ObfuscatedName("client.if")
    public static int field1037 = -1;

    @ObfuscatedName("client.ih")
    public static int field1164 = 0;

    @ObfuscatedName("client.jd")
    public static int field1039 = 0;

    @ObfuscatedName("client.ji")
    public static int[] field1112 = new int[1000];

    @ObfuscatedName("client.jw")
    public static final int[] field1041 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.jk")
    public static String[] field998 = new String[8];

    @ObfuscatedName("client.jt")
    public static boolean[] field1043 = new boolean[8];

    @ObfuscatedName("client.jb")
    public static int[] field1044 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.jo")
    public static int field1190 = -1;

    @ObfuscatedName("client.jj")
    public static class197[][][] field1046 = new class197[4][104][104];

    @ObfuscatedName("client.jg")
    public static class197 field1047 = new class197();

    @ObfuscatedName("client.jh")
    public static class197 field1048 = new class197();

    @ObfuscatedName("client.jq")
    public static class197 field1185 = new class197();

    @ObfuscatedName("client.jv")
    public static int[] field1050 = new int[25];

    @ObfuscatedName("client.jp")
    public static int[] field993 = new int[25];

    @ObfuscatedName("client.jn")
    public static int[] field1052 = new int[25];

    @ObfuscatedName("client.jf")
    public static int field926 = 0;

    @ObfuscatedName("client.jy")
    public static boolean field1108 = false;

    @ObfuscatedName("client.jm")
    public static int field957 = 0;

    @ObfuscatedName("client.ju")
    public static int[] field1056 = new int[500];

    @ObfuscatedName("client.js")
    public static int[] field1057 = new int[500];

    @ObfuscatedName("client.jx")
    public static int[] field1123 = new int[500];

    @ObfuscatedName("client.kz")
    public static int[] field1059 = new int[500];

    @ObfuscatedName("client.kc")
    public static String[] field1060 = new String[500];

    @ObfuscatedName("client.kb")
    public static String[] field1061 = new String[500];

    @ObfuscatedName("client.kq")
    public static boolean field1062 = false;

    @ObfuscatedName("client.kn")
    public static int field1063 = -1;

    @ObfuscatedName("client.kp")
    public static boolean field1064 = false;

    @ObfuscatedName("client.kh")
    public static int field1065 = -1;

    @ObfuscatedName("client.ku")
    public static int field1066 = -1;

    @ObfuscatedName("client.kt")
    public static int field1034 = 0;

    @ObfuscatedName("client.kr")
    public static int field1068 = 50;

    @ObfuscatedName("client.kj")
    public static int field1069 = 0;

    @ObfuscatedName("client.kw")
    public static boolean field1030 = false;

    @ObfuscatedName("client.kv")
    public static int field1072 = -1;

    @ObfuscatedName("client.ki")
    public static int field1073 = -1;

    @ObfuscatedName("client.ky")
    public static String field1094 = null;

    @ObfuscatedName("client.ko")
    public static String field1075 = null;

    @ObfuscatedName("client.kg")
    public static int field1076 = -1;

    @ObfuscatedName("client.kk")
    public static class194 field1077 = new class194(8);

    @ObfuscatedName("client.km")
    public static int field1078 = 0;

    @ObfuscatedName("client.ld")
    public static int field1079 = 0;

    @ObfuscatedName("client.ls")
    public static class220 field1080 = null;

    @ObfuscatedName("client.lc")
    public static int field984 = 0;

    @ObfuscatedName("client.lt")
    public static int field1015 = 0;

    @ObfuscatedName("client.lo")
    public static int field1083 = 0;

    @ObfuscatedName("client.lq")
    public static int field978 = -1;

    @ObfuscatedName("client.ln")
    public static boolean field1081 = false;

    @ObfuscatedName("client.lu")
    public static boolean field1086 = false;

    @ObfuscatedName("client.le")
    public static boolean field1110 = false;

    @ObfuscatedName("client.lf")
    public static class220 field1088 = null;

    @ObfuscatedName("client.lx")
    public static class220 field1089 = null;

    @ObfuscatedName("client.lj")
    public static class220 field1114 = null;

    @ObfuscatedName("client.lm")
    public static int field1091 = 0;

    @ObfuscatedName("client.la")
    public static int field1098 = 0;

    @ObfuscatedName("client.lv")
    public static class220 field1093 = null;

    @ObfuscatedName("client.lp")
    public static boolean field1031 = false;

    @ObfuscatedName("client.lg")
    public static int field1132 = -1;

    @ObfuscatedName("client.lz")
    public static int field1113 = -1;

    @ObfuscatedName("client.lr")
    public static boolean field1097 = false;

    @ObfuscatedName("client.lb")
    public static int field982 = -1;

    @ObfuscatedName("client.lw")
    public static int field1099 = -1;

    @ObfuscatedName("client.lh")
    public static boolean field1100 = false;

    @ObfuscatedName("client.mt")
    public static int field1101 = 1;

    @ObfuscatedName("client.mh")
    public static int[] field1102 = new int[32];

    @ObfuscatedName("client.mm")
    public static int field1103 = 0;

    @ObfuscatedName("client.mc")
    public static int[] field1104 = new int[32];

    @ObfuscatedName("client.mb")
    public static int field1105 = 0;

    @ObfuscatedName("client.mg")
    public static int[] field1106 = new int[32];

    @ObfuscatedName("client.mf")
    public static int field1107 = 0;

    @ObfuscatedName("client.mx")
    public static int field996 = 0;

    @ObfuscatedName("client.ml")
    public static int field1109 = 0;

    @ObfuscatedName("client.ms")
    public static int field965 = 0;

    @ObfuscatedName("client.mr")
    public static int field1169 = 0;

    @ObfuscatedName("client.my")
    public static int field1036 = 0;

    @ObfuscatedName("client.mj")
    public static int field1071 = 0;

    @ObfuscatedName("client.mu")
    public static int field1008 = 0;

    @ObfuscatedName("client.md")
    public static class197 field1115 = new class197();

    @ObfuscatedName("client.mo")
    public static class197 field1116 = new class197();

    @ObfuscatedName("client.mk")
    public static class197 field1117 = new class197();

    @ObfuscatedName("client.mn")
    public static class194 field1118 = new class194(512);

    @ObfuscatedName("client.mw")
    public static int field921 = 0;

    @ObfuscatedName("client.ma")
    public static int field1120 = -2;

    @ObfuscatedName("client.mz")
    public static boolean[] field1121 = new boolean[100];

    @ObfuscatedName("client.np")
    public static boolean[] field1122 = new boolean[100];

    @ObfuscatedName("client.nk")
    public static boolean[] field1125 = new boolean[100];

    @ObfuscatedName("client.ne")
    public static int[] field1124 = new int[100];

    @ObfuscatedName("client.nc")
    public static int[] field1144 = new int[100];

    @ObfuscatedName("client.nh")
    public static int[] field1126 = new int[100];

    @ObfuscatedName("client.ng")
    public static int[] field1096 = new int[100];

    @ObfuscatedName("client.nn")
    public static int field1128 = 0;

    @ObfuscatedName("client.nu")
    public static long field1188 = 0L;

    @ObfuscatedName("client.na")
    public static boolean field1130 = true;

    @ObfuscatedName("client.ni")
    public static int[] field1131 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.nv")
    public static int field943 = 0;

    @ObfuscatedName("client.no")
    public static int field1133 = 0;

    @ObfuscatedName("client.nt")
    public static String field1134 = "";

    @ObfuscatedName("client.nx")
    public static long[] field1158 = new long[100];

    @ObfuscatedName("client.nl")
    public static int field1021 = 0;

    @ObfuscatedName("client.nf")
    public static int field1027 = 0;

    @ObfuscatedName("client.nb")
    public static int[] field1138 = new int[128];

    @ObfuscatedName("client.of")
    public static int[] field1139 = new int[128];

    @ObfuscatedName("client.ow")
    public static long field1140 = -1L;

    @ObfuscatedName("client.oh")
    public static String field1141 = null;

    @ObfuscatedName("client.oi")
    public static String field964 = null;

    @ObfuscatedName("client.oy")
    public static int field1143 = -1;

    @ObfuscatedName("client.oo")
    public static int field1004 = 0;

    @ObfuscatedName("client.op")
    public static int[] field1145 = new int[1000];

    @ObfuscatedName("client.ot")
    public static int[] field1146 = new int[1000];

    @ObfuscatedName("client.on")
    public static class289[] field1147 = new class289[1000];

    @ObfuscatedName("client.ou")
    public static int field1148 = 0;

    @ObfuscatedName("client.ox")
    public static int field999 = 0;

    @ObfuscatedName("client.oc")
    public static int field1054 = 0;

    @ObfuscatedName("client.oj")
    public static int field1151 = 255;

    @ObfuscatedName("client.oq")
    public static int field1152 = -1;

    @ObfuscatedName("client.ol")
    public static boolean field1119 = false;

    @ObfuscatedName("client.pf")
    public static int field1154 = 127;

    @ObfuscatedName("client.pb")
    public static int field1155 = 127;

    @ObfuscatedName("client.pt")
    public static int field1045 = 0;

    @ObfuscatedName("client.pu")
    public static int[] field1157 = new int[50];

    @ObfuscatedName("client.pc")
    public static int[] field1087 = new int[50];

    @ObfuscatedName("client.pk")
    public static int[] field1159 = new int[50];

    @ObfuscatedName("client.ps")
    public static int[] field1160 = new int[50];

    @ObfuscatedName("client.pe")
    public static class106[] field1161 = new class106[50];

    @ObfuscatedName("client.pj")
    public static boolean field1162 = false;

    @ObfuscatedName("client.pl")
    public static boolean[] field1163 = new boolean[5];

    @ObfuscatedName("client.qb")
    public static int[] field1167 = new int[5];

    @ObfuscatedName("client.qs")
    public static int[] field1165 = new int[5];

    @ObfuscatedName("client.qn")
    public static int[] field1166 = new int[5];

    @ObfuscatedName("client.qk")
    public static int[] field1042 = new int[5];

    @ObfuscatedName("client.qm")
    public static short field1168 = 256;

    @ObfuscatedName("client.qg")
    public static short field1038 = 205;

    @ObfuscatedName("client.qe")
    public static short field1170 = 256;

    @ObfuscatedName("client.qu")
    public static short field1171 = 320;

    @ObfuscatedName("client.qy")
    public static short field974 = 1;

    @ObfuscatedName("client.qa")
    public static short field1173 = 32767;

    @ObfuscatedName("client.qz")
    public static short field1174 = 1;

    @ObfuscatedName("client.qx")
    public static short field928 = 32767;

    @ObfuscatedName("client.qf")
    public static int field1176 = 0;

    @ObfuscatedName("client.qr")
    public static int field1177 = 0;

    @ObfuscatedName("client.qi")
    public static int field1178 = 0;

    @ObfuscatedName("client.ql")
    public static int field1179 = 0;

    @ObfuscatedName("client.qh")
    public static int field1180 = 0;

    @ObfuscatedName("client.qp")
    public static int field1181 = 0;

    @ObfuscatedName("client.qv")
    public static int field1142 = 0;

    @ObfuscatedName("client.qt")
    public static class66[] field1183 = new class66[400];

    @ObfuscatedName("client.qc")
    public static class199 field1184 = new class199();

    @ObfuscatedName("client.qo")
    public static int field919 = 0;

    @ObfuscatedName("client.qj")
    public static class71[] field917 = new class71[400];

    @ObfuscatedName("client.qw")
    public static class217 field1187 = new class217();

    @ObfuscatedName("client.ra")
    public static int field962 = -1;

    @ObfuscatedName("client.rv")
    public static int field1189 = -1;

    @ObfuscatedName("client.rp")
    public static class17[] field967 = new class17[8];

    @ObfuscatedName("client.rb")
    public static long field1191 = -1L;

    @ObfuscatedName("client.rg")
    public static long field1192 = -1L;

    @ObfuscatedName("client.re")
    public static final class74 field1193 = new class74();

    @ObfuscatedName("client.rz")
    public static int[] field1194 = new int[50];

    @ObfuscatedName("client.rt")
    public static int[] field1195 = new int[50];

    @ObfuscatedName("ad.em(B)Lkn;")
    public static class292 method493() {
        return Statics.field1219;
    }

    @ObfuscatedName("client.ac(B)V")
    public final void method844() {
    }

    public final void init() {
        if (!this.method748()) {
            return;
        }
        class278[] var1 = class278.method22();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class278 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3737);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3737)) {
                    case 1:
                        if (var4.equalsIgnoreCase(class89.field1385)) {
                            field1136 = true;
                        } else {
                            field1136 = false;
                        }
                        break;
                    case 2:
                        field1129 = Integer.parseInt(var4);
                        break;
                    case 3:
                        Statics.field3687 = (class236) class172.method1577(class236.method1756(), Integer.parseInt(var4));
                        if (Statics.field3687 == class236.field3215) {
                            Statics.field3218 = class293.field3858;
                        } else {
                            Statics.field3218 = class293.field3867;
                        }
                        break;
                    case 4:
                        if (var4.equalsIgnoreCase(class89.field1385)) {
                        }
                    case 5:
                    case 8:
                    default:
                        break;
                    case 6:
                        field920 = Integer.parseInt(var4);
                        break;
                    case 7:
                        Statics.field2653 = var4;
                        break;
                    case 9:
                        field1007 = Integer.parseInt(var4);
                        break;
                    case 10:
                        Statics.field600 = var4;
                        break;
                    case 11:
                        Statics.field2175 = Integer.parseInt(var4);
                        break;
                    case 12:
                        Statics.field594 = Integer.parseInt(var4);
                        break;
                    case 13:
                        field950 = Integer.parseInt(var4);
                        break;
                    case 14:
                        Statics.field3372 = class235.method151(Integer.parseInt(var4));
                }
            }
        }
        method1562();
        Statics.field510 = this.getCodeBase().getHost();
        String var5 = Statics.field3372.field3207;
        byte var6 = 0;
        try {
            Statics.field2254 = 17;
            Statics.field653 = var6;
            try {
                Statics.field602 = System.getProperty("os.name");
            } catch (Exception var20) {
                Statics.field602 = "Unknown";
            }
            Statics.field2340 = Statics.field602.toLowerCase();
            try {
                Statics.field2261 = System.getProperty("user.home");
                if (Statics.field2261 != null) {
                    Statics.field2261 = Statics.field2261 + "/";
                }
            } catch (Exception var19) {
            }
            try {
                if (Statics.field2340.startsWith("win")) {
                    if (Statics.field2261 == null) {
                        Statics.field2261 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2261 == null) {
                    Statics.field2261 = System.getenv("HOME");
                }
                if (Statics.field2261 != null) {
                    Statics.field2261 = Statics.field2261 + "/";
                }
            } catch (Exception var18) {
            }
            if (Statics.field2261 == null) {
                Statics.field2261 = "~/";
            }
            Statics.field2198 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2261, "/tmp/", "" };
            Statics.field589 = new String[] { ".jagex_cache_" + Statics.field653, ".file_store_" + Statics.field653 };
            label122: for (int var10 = 0; var10 < 4; var10++) {
                Statics.field2253 = class157.method47("oldschool", var5, var10);
                if (!Statics.field2253.exists()) {
                    Statics.field2253.mkdirs();
                }
                File[] var11 = Statics.field2253.listFiles();
                if (var11 == null) {
                    break;
                }
                File[] var12 = var11;
                int var13 = 0;
                while (true) {
                    if (var13 >= var12.length) {
                        break label122;
                    }
                    File var14 = var12[var13];
                    if (!class157.method716(var14, false)) {
                        break;
                    }
                    var13++;
                }
            }
            File var15 = Statics.field2253;
            Statics.field2267 = var15;
            if (!Statics.field2267.exists()) {
                throw new RuntimeException("");
            }
            class160.field2269 = true;
            class157.method1954();
            class157.field2258 = new class124(new class125(class160.method3815("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class157.field2251 = new class124(new class125(class160.method3815("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field310 = new class124[Statics.field2254];
            for (int var16 = 0; var16 < Statics.field2254; var16++) {
                Statics.field310[var16] = new class124(new class125(class160.method3815("main_file_cache.idx" + var16), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var21) {
            class154.method1971((String) null, var21);
        }
        Statics.field336 = this;
        this.method818(765, 503, 146);
    }

    @ObfuscatedName("cr.ed(I)V")
    public static final void method1562() {
        class140.field2079 = false;
        field1082 = false;
    }

    @ObfuscatedName("client.aq(I)V")
    public final void method797() {
        Statics.field819 = field920 == 0 ? 43594 : field1007 + 40000;
        Statics.field2633 = field920 == 0 ? 443 : field1007 + 50000;
        Statics.field685 = Statics.field819;
        Statics.field1292 = class218.field2651;
        Statics.field817 = class218.field2647;
        Statics.field2641 = class218.field2648;
        Statics.field2414 = class218.field2649;
        this.method754();
        this.method741();
        Statics.field668 = this.method738();
        Statics.field683 = new class163(255, class157.field2258, class157.field2251, 500000);
        Statics.field1375 = class82.method494();
        this.method739();
        class57.method973(this, Statics.field230);
        if (field920 != 0) {
            field932 = true;
        }
        method2698(Statics.field1375.field1316);
    }

    @ObfuscatedName("client.aj(S)V")
    public final void method763() {
        field948++;
        this.method1049();
        class240.method168();
        class207.method1569();
        method212();
        class51.method8();
        class60 var1 = class60.field729;
        synchronized (class60.field729) {
            class60.field728 = class60.field725;
            class60.field742 = class60.field726;
            class60.field738 = class60.field727;
            class60.field735 = class60.field731;
            class60.field736 = class60.field732;
            class60.field724 = class60.field733;
            class60.field737 = class60.field734;
            class60.field731 = 0;
        }
        if (Statics.field668 != null) {
            int var3 = Statics.field668.method635();
            field1008 = var3;
        }
        if (field1175 == 0) {
            method975();
            Statics.field710.method2711();
            for (int var4 = 0; var4 < 32; var4++) {
                field698[var4] = 0L;
            }
            for (int var5 = 0; var5 < 32; var5++) {
                field699[var5] = 0L;
            }
            Statics.field2629 = 0;
        } else if (field1175 == 5) {
            class93.method2905(this);
            method975();
            Statics.field710.method2711();
            for (int var6 = 0; var6 < 32; var6++) {
                field698[var6] = 0L;
            }
            for (int var7 = 0; var7 < 32; var7++) {
                field699[var7] = 0L;
            }
            Statics.field2629 = 0;
        } else if (field1175 == 10 || field1175 == 11) {
            class93.method2905(this);
        } else if (field1175 == 20) {
            class93.method2905(this);
            this.method1051();
        } else if (field1175 == 25) {
            method1038(false);
            field1135 = 0;
            boolean var8 = true;
            for (int var9 = 0; var9 < Statics.field352.length; var9++) {
                if (Statics.field2654[var9] != -1 && Statics.field352[var9] == null) {
                    Statics.field352[var9] = Statics.field2216.method3840(Statics.field2654[var9], 0);
                    if (Statics.field352[var9] == null) {
                        var8 = false;
                        field1135++;
                    }
                }
                if (Statics.field3694[var9] != -1 && Statics.field3643[var9] == null) {
                    Statics.field3643[var9] = Statics.field2216.method3841(Statics.field3694[var9], 0, Statics.field518[var9]);
                    if (Statics.field3643[var9] == null) {
                        var8 = false;
                        field1135++;
                    }
                }
            }
            if (var8) {
                field973 = 0;
                boolean var10 = true;
                for (int var11 = 0; var11 < Statics.field352.length; var11++) {
                    byte[] var12 = Statics.field3643[var11];
                    if (var12 != null) {
                        int var13 = (Statics.field239[var11] >> 8) * 64 - Statics.field590;
                        int var14 = (Statics.field239[var11] & 0xFF) * 64 - Statics.field617;
                        if (field1127) {
                            var13 = 10;
                            var14 = 10;
                        }
                        var10 &= class62.method1592(var12, var13, var14);
                    }
                }
                if (var10) {
                    if (field975 != 0) {
                        method2742(class229.field3039 + class89.field1390 + class89.field1387 + 100 + "%" + class89.field1388, true);
                    }
                    method212();
                    method901();
                    method212();
                    Statics.field1498.method2522();
                    method212();
                    System.gc();
                    for (int var15 = 0; var15 < 4; var15++) {
                        field1053[var15].method2849();
                    }
                    for (int var16 = 0; var16 < 4; var16++) {
                        for (int var17 = 0; var17 < 104; var17++) {
                            for (int var18 = 0; var18 < 104; var18++) {
                                class62.field750[var16][var17][var18] = 0;
                            }
                        }
                    }
                    method212();
                    class62.field749 = 99;
                    Statics.field751 = new byte[4][104][104];
                    Statics.field2344 = new byte[4][104][104];
                    Statics.field3299 = new byte[4][104][104];
                    Statics.field753 = new byte[4][104][104];
                    Statics.field249 = new int[4][105][105];
                    Statics.field860 = new byte[4][105][105];
                    Statics.field764 = new int[105][105];
                    Statics.field366 = new int[104];
                    Statics.field3740 = new int[104];
                    Statics.field354 = new int[104];
                    Statics.field2515 = new int[104];
                    Statics.field805 = new int[104];
                    int var19 = Statics.field352.length;
                    for (class83 var20 = (class83) class83.field1326.method3389(); var20 != null; var20 = (class83) class83.field1326.method3385()) {
                        if (var20.field1328 != null) {
                            Statics.field283.method1766(var20.field1328);
                            var20.field1328 = null;
                        }
                        if (var20.field1335 != null) {
                            Statics.field283.method1766(var20.field1335);
                            var20.field1335 = null;
                        }
                    }
                    class83.field1326.method3409();
                    method1038(true);
                    if (!field1127) {
                        for (int var21 = 0; var21 < var19; var21++) {
                            int var22 = (Statics.field239[var21] >> 8) * 64 - Statics.field590;
                            int var23 = (Statics.field239[var21] & 0xFF) * 64 - Statics.field617;
                            byte[] var24 = Statics.field352[var21];
                            if (var24 != null) {
                                method212();
                                class62.method3174(var24, var22, var23, Statics.field769 * 8 - 48, Statics.field522 * 8 - 48, field1053);
                            }
                        }
                        for (int var25 = 0; var25 < var19; var25++) {
                            int var26 = (Statics.field239[var25] >> 8) * 64 - Statics.field590;
                            int var27 = (Statics.field239[var25] & 0xFF) * 64 - Statics.field617;
                            byte[] var28 = Statics.field352[var25];
                            if (var28 == null && Statics.field522 < 800) {
                                method212();
                                class62.method1024(var26, var27, 64, 64);
                            }
                        }
                        method1038(true);
                        for (int var29 = 0; var29 < var19; var29++) {
                            byte[] var30 = Statics.field3643[var29];
                            if (var30 != null) {
                                int var31 = (Statics.field239[var29] >> 8) * 64 - Statics.field590;
                                int var32 = (Statics.field239[var29] & 0xFF) * 64 - Statics.field617;
                                method212();
                                class62.method999(var30, var31, var32, Statics.field1498, field1053);
                            }
                        }
                    }
                    if (field1127) {
                        int var33 = 0;
                        label969: while (true) {
                            if (var33 >= 4) {
                                for (int var44 = 0; var44 < 13; var44++) {
                                    for (int var45 = 0; var45 < 13; var45++) {
                                        int var46 = field1149[0][var44][var45];
                                        if (var46 == -1) {
                                            class62.method1024(var44 * 8, var45 * 8, 8, 8);
                                        }
                                    }
                                }
                                method1038(true);
                                int var47 = 0;
                                while (true) {
                                    if (var47 >= 4) {
                                        break label969;
                                    }
                                    method212();
                                    for (int var48 = 0; var48 < 13; var48++) {
                                        label926: for (int var49 = 0; var49 < 13; var49++) {
                                            int var50 = field1149[var47][var48][var49];
                                            if (var50 != -1) {
                                                int var51 = var50 >> 24 & 0x3;
                                                int var52 = var50 >> 1 & 0x3;
                                                int var53 = var50 >> 14 & 0x3FF;
                                                int var54 = var50 >> 3 & 0x7FF;
                                                int var55 = (var53 / 8 << 8) + var54 / 8;
                                                for (int var56 = 0; var56 < Statics.field239.length; var56++) {
                                                    if (Statics.field239[var56] == var55 && Statics.field3643[var56] != null) {
                                                        byte[] var57 = Statics.field3643[var56];
                                                        int var58 = var48 * 8;
                                                        int var59 = var49 * 8;
                                                        int var60 = (var53 & 0x7) * 8;
                                                        int var61 = (var54 & 0x7) * 8;
                                                        class140 var62 = Statics.field1498;
                                                        class165[] var63 = field1053;
                                                        class177 var64 = new class177(var57);
                                                        int var65 = -1;
                                                        while (true) {
                                                            int var66 = var64.method2978();
                                                            if (var66 == 0) {
                                                                continue label926;
                                                            }
                                                            var65 += var66;
                                                            int var67 = 0;
                                                            while (true) {
                                                                int var68 = var64.method2978();
                                                                if (var68 == 0) {
                                                                    break;
                                                                }
                                                                var67 += var68 - 1;
                                                                int var69 = var67 & 0x3F;
                                                                int var70 = var67 >> 6 & 0x3F;
                                                                int var71 = var67 >> 12;
                                                                int var72 = var64.method2965();
                                                                int var73 = var72 >> 2;
                                                                int var74 = var72 & 0x3;
                                                                if (var51 == var71 && var70 >= var60 && var70 < var60 + 8 && var69 >= var61 && var69 < var61 + 8) {
                                                                    class259 var75 = class259.method653(var65);
                                                                    int var76 = var58 + class219.method2769(var70 & 0x7, var69 & 0x7, var52, var75.field3484, var75.field3463, var74);
                                                                    int var77 = var59 + class219.method1554(var70 & 0x7, var69 & 0x7, var52, var75.field3484, var75.field3463, var74);
                                                                    if (var76 > 0 && var77 > 0 && var76 < 103 && var77 < 103) {
                                                                        int var78 = var47;
                                                                        if ((class62.field750[1][var76][var77] & 0x2) == 2) {
                                                                            var78 = var47 - 1;
                                                                        }
                                                                        class165 var79 = null;
                                                                        if (var78 >= 0) {
                                                                            var79 = var63[var78];
                                                                        }
                                                                        class62.method68(var47, var76, var77, var65, var52 + var74 & 0x3, var73, var62, var79);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var47++;
                                }
                            }
                            method212();
                            for (int var34 = 0; var34 < 13; var34++) {
                                for (int var35 = 0; var35 < 13; var35++) {
                                    boolean var36 = false;
                                    int var37 = field1149[var33][var34][var35];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 0x3;
                                        int var39 = var37 >> 1 & 0x3;
                                        int var40 = var37 >> 14 & 0x3FF;
                                        int var41 = var37 >> 3 & 0x7FF;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < Statics.field239.length; var43++) {
                                            if (Statics.field239[var43] == var42 && Statics.field352[var43] != null) {
                                                class62.method477(Statics.field352[var43], var33, var34 * 8, var35 * 8, var38, (var40 & 0x7) * 8, (var41 & 0x7) * 8, var39, field1053);
                                                var36 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var36) {
                                        Statics.method19(var33, var34 * 8, var35 * 8);
                                    }
                                }
                            }
                            var33++;
                        }
                    }
                    method1038(true);
                    method901();
                    method212();
                    class140 var80 = Statics.field1498;
                    class165[] var81 = field1053;
                    for (int var82 = 0; var82 < 4; var82++) {
                        for (int var83 = 0; var83 < 104; var83++) {
                            for (int var84 = 0; var84 < 104; var84++) {
                                if ((class62.field750[var82][var83][var84] & 0x1) == 1) {
                                    int var85 = var82;
                                    if ((class62.field750[1][var83][var84] & 0x2) == 2) {
                                        var85 = var82 - 1;
                                    }
                                    if (var85 >= 0) {
                                        var81[var85].method2874(var83, var84);
                                    }
                                }
                            }
                        }
                    }
                    class62.field757 += (int) (Math.random() * 5.0D) - 2;
                    if (class62.field757 < -8) {
                        class62.field757 = -8;
                    }
                    if (class62.field757 > 8) {
                        class62.field757 = 8;
                    }
                    class62.field762 += (int) (Math.random() * 5.0D) - 2;
                    if (class62.field762 < -16) {
                        class62.field762 = -16;
                    }
                    if (class62.field762 > 16) {
                        class62.field762 = 16;
                    }
                    for (int var86 = 0; var86 < 4; var86++) {
                        byte[][] var87 = Statics.field860[var86];
                        int var88 = (int) Math.sqrt(5100.0D);
                        int var89 = var88 * 768 >> 8;
                        for (int var90 = 1; var90 < 103; var90++) {
                            for (int var91 = 1; var91 < 103; var91++) {
                                int var92 = class62.field756[var86][var91 + 1][var90] - class62.field756[var86][var91 - 1][var90];
                                int var93 = class62.field756[var86][var91][var90 + 1] - class62.field756[var86][var91][var90 - 1];
                                int var94 = (int) Math.sqrt((double) (var93 * var93 + var92 * var92 + 65536));
                                int var95 = (var92 << 8) / var94;
                                int var96 = 65536 / var94;
                                int var97 = (var93 << 8) / var94;
                                int var98 = (var97 * -50 + var95 * -50 + var96 * -10) / var89 + 96;
                                int var99 = (var87[var91][var90] >> 1) + (var87[var91][var90 + 1] >> 3) + (var87[var91][var90 - 1] >> 2) + (var87[var91 - 1][var90] >> 2) + (var87[var91 + 1][var90] >> 3);
                                Statics.field764[var91][var90] = var98 - var99;
                            }
                        }
                        for (int var100 = 0; var100 < 104; var100++) {
                            Statics.field366[var100] = 0;
                            Statics.field3740[var100] = 0;
                            Statics.field354[var100] = 0;
                            Statics.field2515[var100] = 0;
                            Statics.field805[var100] = 0;
                        }
                        for (int var101 = -5; var101 < 109; var101++) {
                            for (int var102 = 0; var102 < 104; var102++) {
                                int var103 = var101 + 5;
                                int var10002;
                                if (var103 >= 0 && var103 < 104) {
                                    int var104 = Statics.field751[var86][var103][var102] & 0xFF;
                                    if (var104 > 0) {
                                        class250 var105 = class250.method3832(var104 - 1);
                                        Statics.field366[var102] += var105.field3355;
                                        Statics.field3740[var102] += var105.field3352;
                                        Statics.field354[var102] += var105.field3358;
                                        Statics.field2515[var102] += var105.field3353;
                                        var10002 = Statics.field805[var102]++;
                                    }
                                }
                                int var106 = var101 - 5;
                                if (var106 >= 0 && var106 < 104) {
                                    int var107 = Statics.field751[var86][var106][var102] & 0xFF;
                                    if (var107 > 0) {
                                        class250 var108 = class250.method3832(var107 - 1);
                                        Statics.field366[var102] -= var108.field3355;
                                        Statics.field3740[var102] -= var108.field3352;
                                        Statics.field354[var102] -= var108.field3358;
                                        Statics.field2515[var102] -= var108.field3353;
                                        var10002 = Statics.field805[var102]--;
                                    }
                                }
                            }
                            if (var101 >= 1 && var101 < 103) {
                                int var109 = 0;
                                int var110 = 0;
                                int var111 = 0;
                                int var112 = 0;
                                int var113 = 0;
                                for (int var114 = -5; var114 < 109; var114++) {
                                    int var115 = var114 + 5;
                                    if (var115 >= 0 && var115 < 104) {
                                        var109 += Statics.field366[var115];
                                        var110 += Statics.field3740[var115];
                                        var111 += Statics.field354[var115];
                                        var112 += Statics.field2515[var115];
                                        var113 += Statics.field805[var115];
                                    }
                                    int var116 = var114 - 5;
                                    if (var116 >= 0 && var116 < 104) {
                                        var109 -= Statics.field366[var116];
                                        var110 -= Statics.field3740[var116];
                                        var111 -= Statics.field354[var116];
                                        var112 -= Statics.field2515[var116];
                                        var113 -= Statics.field805[var116];
                                    }
                                    if (var114 >= 1 && var114 < 103 && (!field1082 || (class62.field750[0][var101][var114] & 0x2) != 0 || (class62.field750[var86][var101][var114] & 0x10) == 0)) {
                                        if (var86 < class62.field749) {
                                            class62.field749 = var86;
                                        }
                                        int var117 = Statics.field751[var86][var101][var114] & 0xFF;
                                        int var118 = Statics.field2344[var86][var101][var114] & 0xFF;
                                        if (var117 > 0 || var118 > 0) {
                                            int var119 = class62.field756[var86][var101][var114];
                                            int var120 = class62.field756[var86][var101 + 1][var114];
                                            int var121 = class62.field756[var86][var101 + 1][var114 + 1];
                                            int var122 = class62.field756[var86][var101][var114 + 1];
                                            int var123 = Statics.field764[var101][var114];
                                            int var124 = Statics.field764[var101 + 1][var114];
                                            int var125 = Statics.field764[var101 + 1][var114 + 1];
                                            int var126 = Statics.field764[var101][var114 + 1];
                                            int var127 = -1;
                                            int var128 = -1;
                                            if (var117 > 0) {
                                                int var129 = var109 * 256 / var112;
                                                int var130 = var110 / var113;
                                                int var131 = var111 / var113;
                                                var127 = class62.method3170(var129, var130, var131);
                                                int var132 = class62.field757 + var129 & 0xFF;
                                                int var133 = class62.field762 + var131;
                                                if (var133 < 0) {
                                                    var133 = 0;
                                                } else if (var133 > 255) {
                                                    var133 = 255;
                                                }
                                                var128 = class62.method3170(var132, var130, var133);
                                            }
                                            if (var86 > 0) {
                                                boolean var134 = true;
                                                if (var117 == 0 && Statics.field3299[var86][var101][var114] != 0) {
                                                    var134 = false;
                                                }
                                                if (var118 > 0 && !class263.method2693(var118 - 1).field3605) {
                                                    var134 = false;
                                                }
                                                if (var134 && var119 == var120 && var119 == var121 && var119 == var122) {
                                                    Statics.field249[var86][var101][var114] |= 0x924;
                                                }
                                            }
                                            int var135 = 0;
                                            if (var128 != -1) {
                                                var135 = class137.field2035[class62.method550(var128, 96)];
                                            }
                                            if (var118 == 0) {
                                                var80.method2527(var86, var101, var114, 0, 0, -1, var119, var120, var121, var122, class62.method550(var127, var123), class62.method550(var127, var124), class62.method550(var127, var125), class62.method550(var127, var126), 0, 0, 0, 0, var135, 0);
                                            } else {
                                                int var136 = Statics.field3299[var86][var101][var114] + 1;
                                                byte var137 = Statics.field753[var86][var101][var114];
                                                class263 var138 = class263.method2693(var118 - 1);
                                                int var139 = var138.field3604;
                                                int var140;
                                                int var141;
                                                if (var139 >= 0) {
                                                    var140 = Statics.field2009.method2228(var139);
                                                    var141 = -1;
                                                } else if (var138.field3603 == 16711935) {
                                                    var141 = -2;
                                                    var139 = -1;
                                                    var140 = -2;
                                                } else {
                                                    var141 = class62.method3170(var138.field3607, var138.field3601, var138.field3609);
                                                    int var142 = class62.field757 + var138.field3607 & 0xFF;
                                                    int var143 = class62.field762 + var138.field3609;
                                                    if (var143 < 0) {
                                                        var143 = 0;
                                                    } else if (var143 > 255) {
                                                        var143 = 255;
                                                    }
                                                    var140 = class62.method3170(var142, var138.field3601, var143);
                                                }
                                                int var144 = 0;
                                                if (var140 != -2) {
                                                    var144 = class137.field2035[class62.method2718(var140, 96)];
                                                }
                                                if (var138.field3606 != -1) {
                                                    int var145 = class62.field757 + var138.field3610 & 0xFF;
                                                    int var146 = class62.field762 + var138.field3612;
                                                    if (var146 < 0) {
                                                        var146 = 0;
                                                    } else if (var146 > 255) {
                                                        var146 = 255;
                                                    }
                                                    int var147 = class62.method3170(var145, var138.field3611, var146);
                                                    var144 = class137.field2035[class62.method2718(var147, 96)];
                                                }
                                                var80.method2527(var86, var101, var114, var136, var137, var139, var119, var120, var121, var122, class62.method550(var127, var123), class62.method550(var127, var124), class62.method550(var127, var125), class62.method550(var127, var126), class62.method2718(var141, var123), class62.method2718(var141, var124), class62.method2718(var141, var125), class62.method2718(var141, var126), var135, var144);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var148 = 1; var148 < 103; var148++) {
                            for (int var149 = 1; var149 < 103; var149++) {
                                int var154;
                                if ((class62.field750[var86][var149][var148] & 0x8) != 0) {
                                    var154 = 0;
                                } else if (var86 <= 0 || (class62.field750[1][var149][var148] & 0x2) == 0) {
                                    var154 = var86;
                                } else {
                                    var154 = var86 - 1;
                                }
                                var80.method2526(var86, var149, var148, var154);
                            }
                        }
                        Statics.field751[var86] = (byte[][]) null;
                        Statics.field2344[var86] = (byte[][]) null;
                        Statics.field3299[var86] = (byte[][]) null;
                        Statics.field753[var86] = (byte[][]) null;
                        Statics.field860[var86] = (byte[][]) null;
                    }
                    var80.method2552(-50, -10, -50);
                    for (int var155 = 0; var155 < 104; var155++) {
                        for (int var156 = 0; var156 < 104; var156++) {
                            if ((class62.field750[1][var155][var156] & 0x2) == 2) {
                                var80.method2524(var155, var156);
                            }
                        }
                    }
                    int var157 = 1;
                    int var158 = 2;
                    int var159 = 4;
                    for (int var160 = 0; var160 < 4; var160++) {
                        if (var160 > 0) {
                            var157 <<= 0x3;
                            var158 <<= 0x3;
                            var159 <<= 0x3;
                        }
                        for (int var161 = 0; var161 <= var160; var161++) {
                            for (int var162 = 0; var162 <= 104; var162++) {
                                for (int var163 = 0; var163 <= 104; var163++) {
                                    if ((Statics.field249[var161][var163][var162] & var157) != 0) {
                                        int var164 = var162;
                                        int var165 = var162;
                                        int var166 = var161;
                                        int var167 = var161;
                                        while (var164 > 0 && (Statics.field249[var161][var163][var164 - 1] & var157) != 0) {
                                            var164--;
                                        }
                                        while (var165 < 104 && (Statics.field249[var161][var163][var165 + 1] & var157) != 0) {
                                            var165++;
                                        }
                                        label645: while (var166 > 0) {
                                            for (int var168 = var164; var168 <= var165; var168++) {
                                                if ((Statics.field249[var166 - 1][var163][var168] & var157) == 0) {
                                                    break label645;
                                                }
                                            }
                                            var166--;
                                        }
                                        label634: while (var167 < var160) {
                                            for (int var169 = var164; var169 <= var165; var169++) {
                                                if ((Statics.field249[var167 + 1][var163][var169] & var157) == 0) {
                                                    break label634;
                                                }
                                            }
                                            var167++;
                                        }
                                        int var170 = (var167 + 1 - var166) * (var165 - var164 + 1);
                                        if (var170 >= 8) {
                                            short var171 = 240;
                                            int var172 = class62.field756[var167][var163][var164] - var171;
                                            int var173 = class62.field756[var166][var163][var164];
                                            class140.method2525(var160, 1, var163 * 128, var163 * 128, var164 * 128, var165 * 128 + 128, var172, var173);
                                            for (int var174 = var166; var174 <= var167; var174++) {
                                                for (int var175 = var164; var175 <= var165; var175++) {
                                                    Statics.field249[var174][var163][var175] &= ~var157;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field249[var161][var163][var162] & var158) != 0) {
                                        int var176 = var163;
                                        int var177 = var163;
                                        int var178 = var161;
                                        int var179 = var161;
                                        while (var176 > 0 && (Statics.field249[var161][var176 - 1][var162] & var158) != 0) {
                                            var176--;
                                        }
                                        while (var177 < 104 && (Statics.field249[var161][var177 + 1][var162] & var158) != 0) {
                                            var177++;
                                        }
                                        label698: while (var178 > 0) {
                                            for (int var180 = var176; var180 <= var177; var180++) {
                                                if ((Statics.field249[var178 - 1][var180][var162] & var158) == 0) {
                                                    break label698;
                                                }
                                            }
                                            var178--;
                                        }
                                        label687: while (var179 < var160) {
                                            for (int var181 = var176; var181 <= var177; var181++) {
                                                if ((Statics.field249[var179 + 1][var181][var162] & var158) == 0) {
                                                    break label687;
                                                }
                                            }
                                            var179++;
                                        }
                                        int var182 = (var179 + 1 - var178) * (var177 - var176 + 1);
                                        if (var182 >= 8) {
                                            short var183 = 240;
                                            int var184 = class62.field756[var179][var176][var162] - var183;
                                            int var185 = class62.field756[var178][var176][var162];
                                            class140.method2525(var160, 2, var176 * 128, var177 * 128 + 128, var162 * 128, var162 * 128, var184, var185);
                                            for (int var186 = var178; var186 <= var179; var186++) {
                                                for (int var187 = var176; var187 <= var177; var187++) {
                                                    Statics.field249[var186][var187][var162] &= ~var158;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field249[var161][var163][var162] & var159) != 0) {
                                        int var188 = var163;
                                        int var189 = var163;
                                        int var190 = var162;
                                        int var191 = var162;
                                        while (var190 > 0 && (Statics.field249[var161][var163][var190 - 1] & var159) != 0) {
                                            var190--;
                                        }
                                        while (var191 < 104 && (Statics.field249[var161][var163][var191 + 1] & var159) != 0) {
                                            var191++;
                                        }
                                        label751: while (var188 > 0) {
                                            for (int var192 = var190; var192 <= var191; var192++) {
                                                if ((Statics.field249[var161][var188 - 1][var192] & var159) == 0) {
                                                    break label751;
                                                }
                                            }
                                            var188--;
                                        }
                                        label740: while (var189 < 104) {
                                            for (int var193 = var190; var193 <= var191; var193++) {
                                                if ((Statics.field249[var161][var189 + 1][var193] & var159) == 0) {
                                                    break label740;
                                                }
                                            }
                                            var189++;
                                        }
                                        if ((var189 - var188 + 1) * (var191 - var190 + 1) >= 4) {
                                            int var194 = class62.field756[var161][var188][var190];
                                            class140.method2525(var160, 4, var188 * 128, var189 * 128 + 128, var190 * 128, var191 * 128 + 128, var194, var194);
                                            for (int var195 = var188; var195 <= var189; var195++) {
                                                for (int var196 = var190; var196 <= var191; var196++) {
                                                    Statics.field249[var161][var195][var196] &= ~var159;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method1038(true);
                    int var197 = class62.field749;
                    if (var197 > Statics.field2342) {
                        var197 = Statics.field2342;
                    }
                    if (var197 < Statics.field2342 - 1) {
                        int var198 = Statics.field2342 - 1;
                    }
                    if (field1082) {
                        Statics.field1498.method2529(class62.field749);
                    } else {
                        Statics.field1498.method2529(0);
                    }
                    for (int var199 = 0; var199 < 104; var199++) {
                        for (int var200 = 0; var200 < 104; var200++) {
                            method926(var199, var200);
                        }
                    }
                    method212();
                    method181();
                    class259.field3450.method3316();
                    if (Statics.field336.method823()) {
                        field958.method3195(201);
                        field958.method2953(1057001181);
                    }
                    if (!field1127) {
                        int var201 = (Statics.field769 - 6) / 8;
                        int var202 = (Statics.field769 + 6) / 8;
                        int var203 = (Statics.field522 - 6) / 8;
                        int var204 = (Statics.field522 + 6) / 8;
                        for (int var205 = var201 - 1; var205 <= var202 + 1; var205++) {
                            for (int var206 = var203 - 1; var206 <= var204 + 1; var206++) {
                                if (var205 < var201 || var205 > var202 || var206 < var203 || var206 > var204) {
                                    Statics.field2216.method3861("m" + var205 + "_" + var206);
                                    Statics.field2216.method3861("l" + var205 + "_" + var206);
                                }
                            }
                        }
                    }
                    method4463(30);
                    method212();
                    class62.method2695();
                    field958.method3195(200);
                    Statics.field710.method2711();
                    for (int var207 = 0; var207 < 32; var207++) {
                        field698[var207] = 0L;
                    }
                    for (int var208 = 0; var208 < 32; var208++) {
                        field699[var208] = 0L;
                    }
                    Statics.field2629 = 0;
                } else {
                    field975 = 2;
                }
            } else {
                field975 = 1;
            }
        }
        if (field1175 == 30) {
            this.method1278();
        } else if (field1175 == 40 || field1175 == 45) {
            this.method1051();
        }
    }

    @ObfuscatedName("client.as(ZI)V")
    public final void method854(boolean arg0) {
        boolean var2 = class207.method1571();
        if (var2 && field1119 && Statics.field2836 != null) {
            Statics.field2836.method1896();
        }
        if ((field1175 == 10 || field1175 == 20 || field1175 == 30) && field1188 != 0L && class179.method3585() > field1188) {
            method2698(method954());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field1121[var3] = true;
            }
        }
        if (field1175 == 0) {
            this.method766(class93.field1436, class93.field1432, arg0);
        } else if (field1175 == 5) {
            class93.method906(Statics.field2460, Statics.field603, Statics.field269, arg0);
        } else if (field1175 == 10 || field1175 == 11) {
            class93.method906(Statics.field2460, Statics.field603, Statics.field269, arg0);
        } else if (field1175 == 20) {
            class93.method906(Statics.field2460, Statics.field603, Statics.field269, arg0);
        } else if (field1175 == 25) {
            if (field975 == 1) {
                if (field1135 > field1029) {
                    field1029 = field1135;
                }
                int var4 = (field1029 * 50 - field1135 * 50) / field1029;
                method2742(class229.field3039 + class89.field1390 + class89.field1387 + var4 + "%" + class89.field1388, false);
            } else if (field975 == 2) {
                if (field973 > field1019) {
                    field1019 = field973;
                }
                int var5 = (field1019 * 50 - field973 * 50) / field1019 + 50;
                method2742(class229.field3039 + class89.field1390 + class89.field1387 + var5 + "%" + class89.field1388, false);
            } else {
                method2742(class229.field3039, false);
            }
        } else if (field1175 == 30) {
            this.method1054();
        } else if (field1175 == 40) {
            method2742(class229.field3000 + class89.field1390 + class229.field3117, false);
        } else if (field1175 == 45) {
            method2742(class229.field2880, false);
        }
        if (field1175 == 30 && field1128 == 0 && !arg0 && !field1130) {
            for (int var6 = 0; var6 < field921; var6++) {
                if (field1122[var6]) {
                    Statics.field715.method734(field1124[var6], field1144[var6], field1126[var6], field1096[var6]);
                    field1122[var6] = false;
                }
            }
        } else if (field1175 > 0) {
            Statics.field715.method731(0, 0);
            for (int var7 = 0; var7 < field921; var7++) {
                field1122[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.av(I)V")
    public final void method765() {
        if (Statics.field236.method1678()) {
            Statics.field236.method1680();
        }
        if (Statics.field911 != null) {
            Statics.field911.field855 = false;
        }
        Statics.field911 = null;
        if (Statics.field1868 != null) {
            Statics.field1868.method2794();
            Statics.field1868 = null;
        }
        if (class51.field637 != null) {
            class51 var1 = class51.field637;
            synchronized (class51.field637) {
                class51.field637 = null;
            }
        }
        if (class60.field729 != null) {
            class60 var3 = class60.field729;
            synchronized (class60.field729) {
                class60.field729 = null;
            }
        }
        Statics.field668 = null;
        if (Statics.field2836 != null) {
            Statics.field2836.method1890();
        }
        if (Statics.field2821 != null) {
            Statics.field2821.method1890();
        }
        class242.method1555();
        class240.method1746();
        class157.method3817();
    }

    @ObfuscatedName("jk.en(II)V")
    public static void method4463(int arg0) {
        if (field1175 == arg0) {
            return;
        }
        if (field1175 == 0) {
            Statics.field336.method767();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field990 = 0;
            field949 = 0;
            field989 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field429 != null) {
            Statics.field429.method2794();
            Statics.field429 = null;
        }
        if (field1175 == 25) {
            field975 = 0;
            field1135 = 0;
            field1029 = 1;
            field973 = 0;
            field1019 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class93.method661(Statics.field1513, Statics.field3399, true, 0);
        } else if (arg0 == 20) {
            class93.method661(Statics.field1513, Statics.field3399, true, field1175 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class93.method661(Statics.field1513, Statics.field3399, false, 4);
        } else {
            class93.method48();
        }
        field1175 = arg0;
    }

    @ObfuscatedName("client.eg(I)V")
    public void method1049() {
        if (field1175 == 1000) {
            return;
        }
        long var1 = class179.method3585();
        int var3 = (int) (var1 - Statics.field3269);
        Statics.field3269 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class242.field3267 += var3;
        boolean var4;
        if (class242.field3285 == 0 && class242.field3272 == 0 && class242.field3275 == 0 && class242.field3270 == 0) {
            var4 = true;
        } else if (Statics.field3268 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class242.field3267 > 30000) {
                        throw new IOException();
                    }
                    while (class242.field3272 < 20 && class242.field3270 > 0) {
                        class238 var5 = (class238) class242.field3273.method3332();
                        class177 var6 = new class177(4);
                        var6.method3129(1);
                        var6.method2952((int) var5.field2487);
                        Statics.field3268.method2791(var6.field2403, 0, 4);
                        class242.field3280.method3330(var5, var5.field2487);
                        class242.field3270--;
                        class242.field3272++;
                    }
                    while (class242.field3285 < 20 && class242.field3275 > 0) {
                        class238 var7 = (class238) class242.field3281.method3267();
                        class177 var8 = new class177(4);
                        var8.method3129(0);
                        var8.method2952((int) var7.field2487);
                        Statics.field3268.method2791(var8.field2403, 0, 4);
                        var7.method3413();
                        class242.field3276.method3330(var7, var7.field2487);
                        class242.field3275--;
                        class242.field3285++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3268.method2802();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class242.field3267 = 0;
                        byte var11 = 0;
                        if (Statics.field1220 == null) {
                            var11 = 8;
                        } else if (class242.field3279 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class242.field3278.field2402;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3268.method2801(class242.field3278.field2403, class242.field3278.field2402, var12);
                            if (class242.field3283 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class242.field3278.field2403[class242.field3278.field2402 + var13] ^= class242.field3283;
                                }
                            }
                            class242.field3278.field2402 += var12;
                            if (class242.field3278.field2402 < var11) {
                                break;
                            }
                            if (Statics.field1220 == null) {
                                class242.field3278.field2402 = 0;
                                int var14 = class242.field3278.method2965();
                                int var15 = class242.field3278.method2967();
                                int var16 = class242.field3278.method2965();
                                int var17 = class242.field3278.method2970();
                                long var18 = (long) ((var14 << 16) + var15);
                                class238 var20 = (class238) class242.field3280.method3339(var18);
                                Statics.field599 = true;
                                if (var20 == null) {
                                    var20 = (class238) class242.field3276.method3339(var18);
                                    Statics.field599 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1220 = var20;
                                Statics.field2817 = new class177(var17 + var21 + Statics.field1220.field3228);
                                Statics.field2817.method3129(var16);
                                Statics.field2817.method2953(var17);
                                class242.field3279 = 8;
                                class242.field3278.field2402 = 0;
                            } else if (class242.field3279 == 0) {
                                if (class242.field3278.field2403[0] == -1) {
                                    class242.field3279 = 1;
                                    class242.field3278.field2402 = 0;
                                } else {
                                    Statics.field1220 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2817.field2403.length - Statics.field1220.field3228;
                            int var23 = 512 - class242.field3279;
                            if (var23 > var22 - Statics.field2817.field2402) {
                                var23 = var22 - Statics.field2817.field2402;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3268.method2801(Statics.field2817.field2403, Statics.field2817.field2402, var23);
                            if (class242.field3283 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2817.field2403[Statics.field2817.field2402 + var24] ^= class242.field3283;
                                }
                            }
                            Statics.field2817.field2402 += var23;
                            class242.field3279 += var23;
                            if (Statics.field2817.field2402 == var22) {
                                if (Statics.field1220.field2487 == 16711935L) {
                                    Statics.field854 = Statics.field2817;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class241 var26 = class242.field3282[var25];
                                        if (var26 != null) {
                                            Statics.field854.field2402 = var25 * 8 + 5;
                                            int var27 = Statics.field854.method2970();
                                            int var28 = Statics.field854.method2970();
                                            var26.method3944(var27, var28);
                                        }
                                    }
                                } else {
                                    class242.field3287.reset();
                                    class242.field3287.update(Statics.field2817.field2403, 0, var22);
                                    int var29 = (int) class242.field3287.getValue();
                                    if (Statics.field1220.field3229 != var29) {
                                        try {
                                            Statics.field3268.method2794();
                                        } catch (Exception var35) {
                                        }
                                        class242.field3284++;
                                        Statics.field3268 = null;
                                        class242.field3283 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class242.field3284 = 0;
                                    class242.field3277 = 0;
                                    Statics.field1220.field3230.method3945((int) (Statics.field1220.field2487 & 0xFFFFL), Statics.field2817.field2403, (Statics.field1220.field2487 & 0xFF0000L) == 16711680L, Statics.field599);
                                }
                                Statics.field1220.method3372();
                                if (Statics.field599) {
                                    class242.field3272--;
                                } else {
                                    class242.field3285--;
                                }
                                class242.field3279 = 0;
                                Statics.field1220 = null;
                                Statics.field2817 = null;
                            } else {
                                if (class242.field3279 != 512) {
                                    break;
                                }
                                class242.field3279 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3268.method2794();
                } catch (Exception var34) {
                }
                class242.field3277++;
                Statics.field3268 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1101();
        }
    }

    @ObfuscatedName("client.ee(I)V")
    public void method1101() {
        if (class242.field3284 >= 4) {
            this.method788("js5crc");
            field1175 = 1000;
            return;
        }
        if (class242.field3277 >= 4) {
            if (field1175 <= 5) {
                this.method788("js5io");
                field1175 = 1000;
                return;
            }
            field946 = 3000;
            class242.field3277 = 3;
        }
        if (--field946 + 1 > 0) {
            return;
        }
        try {
            if (field945 == 0) {
                Statics.field2401 = Statics.field719.method2755(Statics.field510, Statics.field685);
                field945++;
            }
            if (field945 == 1) {
                if (Statics.field2401.field2238 == 2) {
                    this.method1225(-1);
                    return;
                }
                if (Statics.field2401.field2238 == 1) {
                    field945++;
                }
            }
            if (field945 == 2) {
                Socket var1 = (Socket) Statics.field2401.field2240;
                class161 var2 = new class161(var1, 131072);
                Statics.field329 = var2;
                class177 var3 = new class177(5);
                var3.method3129(15);
                var3.method2953(146);
                Statics.field329.method2791(var3.field2403, 0, 5);
                field945++;
                Statics.field421 = class179.method3585();
            }
            if (field945 == 3) {
                if (Statics.field329.method2802() > 0) {
                    int var4 = Statics.field329.method2793();
                    if (var4 != 0) {
                        this.method1225(var4);
                        return;
                    }
                    field945++;
                } else if (Statics.field329.method2802() == -1 || class179.method3585() - Statics.field421 > 30000L) {
                    this.method1225(-2);
                    return;
                }
            }
            if (field945 == 4) {
                class242.method3967(Statics.field329, field1175 > 20);
                Statics.field2401 = null;
                Statics.field329 = null;
                field945 = 0;
                field947 = 0;
            }
        } catch (IOException var6) {
            this.method1225(-3);
        }
    }

    @ObfuscatedName("client.ez(II)V")
    public void method1225(int arg0) {
        Statics.field2401 = null;
        Statics.field329 = null;
        field945 = 0;
        if (Statics.field819 == Statics.field685) {
            Statics.field685 = Statics.field2633;
        } else {
            Statics.field685 = Statics.field819;
        }
        field947++;
        if (field947 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field1175 <= 5) {
                this.method788("js5connect_full");
                field1175 = 1000;
            } else {
                field946 = 3000;
            }
        } else if (field947 >= 2 && arg0 == 6) {
            this.method788("js5connect_outofdate");
            field1175 = 1000;
        } else if (field947 >= 4) {
            if (field1175 <= 5) {
                this.method788("js5connect");
                field1175 = 1000;
            } else {
                field946 = 3000;
            }
        }
    }

    @ObfuscatedName("bu.ex(I)V")
    public static void method975() {
        if (field944 == 0) {
            Statics.field1498 = new class140(4, 104, 104, class62.field756);
            for (int var0 = 0; var0 < 4; var0++) {
                field1053[var0] = new class165(104, 104);
            }
            Statics.field875 = new class289(512, 512);
            class93.field1432 = class229.field2884;
            class93.field1436 = 5;
            field944 = 20;
        } else if (field944 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class137.field2034[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class140.method2556(var1, 500, 800, 512, 334);
            class93.field1432 = class229.field2988;
            class93.field1436 = 10;
            field944 = 30;
        } else if (field944 == 30) {
            Statics.field574 = method1713(0, false, true, true);
            Statics.field588 = method1713(1, false, true, true);
            Statics.field1527 = method1713(2, true, false, true);
            Statics.field321 = method1713(3, false, true, true);
            Statics.field582 = method1713(4, false, true, true);
            Statics.field2216 = method1713(5, true, true, true);
            Statics.field666 = method1713(6, true, true, false);
            Statics.field587 = method1713(7, false, true, true);
            Statics.field3399 = method1713(8, false, true, true);
            Statics.field2530 = method1713(9, false, true, true);
            Statics.field1513 = method1713(10, false, true, true);
            Statics.field306 = method1713(11, false, true, true);
            Statics.field18 = method1713(12, false, true, true);
            Statics.field615 = method1713(13, true, false, true);
            Statics.field797 = method1713(14, false, true, false);
            Statics.field13 = method1713(15, false, true, true);
            Statics.field3288 = method1713(16, false, true, false);
            class93.field1432 = class229.field3079;
            class93.field1436 = 20;
            field944 = 40;
        } else if (field944 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field574.method3966() * 4 / 100;
            int var8 = var7 + Statics.field588.method3966() * 4 / 100;
            int var9 = var8 + Statics.field1527.method3966() * 2 / 100;
            int var10 = var9 + Statics.field321.method3966() * 2 / 100;
            int var11 = var10 + Statics.field582.method3966() * 6 / 100;
            int var12 = var11 + Statics.field2216.method3966() * 4 / 100;
            int var13 = var12 + Statics.field666.method3966() * 2 / 100;
            int var14 = var13 + Statics.field587.method3966() * 58 / 100;
            int var15 = var14 + Statics.field3399.method3966() * 2 / 100;
            int var16 = var15 + Statics.field2530.method3966() * 2 / 100;
            int var17 = var16 + Statics.field1513.method3966() * 2 / 100;
            int var18 = var17 + Statics.field306.method3966() * 2 / 100;
            int var19 = var18 + Statics.field18.method3966() * 2 / 100;
            int var20 = var19 + Statics.field615.method3966() * 2 / 100;
            int var21 = var20 + Statics.field797.method3966() * 2 / 100;
            int var22 = var21 + Statics.field13.method3966() * 2 / 100;
            int var23 = var22 + Statics.field3288.method3966() * 2 / 100;
            if (var23 == 100) {
                class93.field1432 = class229.field3140;
                class93.field1436 = 30;
                field944 = 45;
            } else {
                if (var23 != 0) {
                    class93.field1432 = class229.field2887 + var23 + "%";
                }
                class93.field1436 = 30;
            }
        } else if (field944 == 45) {
            class110.method1745(22050, !field1082, 2);
            class208 var24 = new class208();
            var24.method3582(9, 128);
            Statics.field2836 = class110.method953(Statics.field719, 0, 22050);
            Statics.field2836.method1917(var24);
            class207.method2842(Statics.field13, Statics.field797, Statics.field582, var24);
            Statics.field2821 = class110.method953(Statics.field719, 1, 2048);
            Statics.field283 = new class103();
            Statics.field2821.method1917(Statics.field283);
            Statics.field248 = new class117(22050, Statics.field1634);
            class93.field1432 = class229.field3078;
            class93.field1436 = 35;
            field944 = 50;
            Statics.field334 = new class266(Statics.field3399, Statics.field615);
        } else if (field944 == 50) {
            int var25 = class265.method4461().length;
            class266 var26 = Statics.field334;
            class265[] var27 = new class265[] { class265.field3637, class265.field3638, class265.field3636, class265.field3644, class265.field3639, class265.field3640 };
            field1153 = var26.method4467(var27);
            if (field1153.size() < var25) {
                class93.field1432 = class229.field2890 + field1153.size() * 100 / var25 + "%";
                class93.field1436 = 40;
            } else {
                Statics.field603 = (class267) field1153.get(class265.field3639);
                Statics.field269 = (class267) field1153.get(class265.field3636);
                Statics.field2460 = (class267) field1153.get(class265.field3644);
                Statics.field520 = new class295(true);
                class93.field1432 = class229.field2913;
                class93.field1436 = 40;
                field944 = 60;
            }
        } else if (field944 == 60) {
            class241 var28 = Statics.field1513;
            class241 var29 = Statics.field3399;
            int var30 = 0;
            if (var28.method3869("title.jpg", "")) {
                var30++;
            }
            if (var29.method3869("logo", "")) {
                var30++;
            }
            if (var29.method3869("logo_deadman_mode", "")) {
                var30++;
            }
            if (var29.method3869("titlebox", "")) {
                var30++;
            }
            if (var29.method3869("titlebutton", "")) {
                var30++;
            }
            if (var29.method3869("runes", "")) {
                var30++;
            }
            if (var29.method3869("title_mute", "")) {
                var30++;
            }
            if (var29.method3869("options_radio_buttons,0", "")) {
                var30++;
            }
            if (var29.method3869("options_radio_buttons,2", "")) {
                var30++;
            }
            var29.method3869("sl_back", "");
            var29.method3869("sl_flags", "");
            var29.method3869("sl_arrows", "");
            var29.method3869("sl_stars", "");
            var29.method3869("sl_button", "");
            int var33 = class93.method628();
            if (var30 < var33) {
                class93.field1432 = class229.field3100 + var30 * 100 / var33 + "%";
                class93.field1436 = 50;
            } else {
                class93.field1432 = class229.field2893;
                class93.field1436 = 50;
                method4463(5);
                field944 = 70;
            }
        } else if (field944 == 70) {
            if (Statics.field1527.method3873()) {
                class241 var34 = Statics.field1527;
                Statics.field3613 = var34;
                class241 var35 = Statics.field1527;
                Statics.field3356 = var35;
                class251.method17(Statics.field1527, Statics.field587);
                class259.method2811(Statics.field1527, Statics.field587, field1082);
                Statics.method4200(Statics.field1527, Statics.field587);
                class241 var36 = Statics.field1527;
                Statics.field3410 = var36;
                class260.method660(Statics.field1527, Statics.field587, field1136, Statics.field603);
                class241 var37 = Statics.field1527;
                class241 var38 = Statics.field574;
                class241 var39 = Statics.field588;
                Statics.field3634 = var37;
                Statics.field3618 = var38;
                Statics.field3625 = var39;
                class249.method3202(Statics.field1527, Statics.field587);
                class254.method3808(Statics.field1527);
                class241 var40 = Statics.field1527;
                Statics.field3301 = var40;
                Statics.field3300 = Statics.field3301.method3858(16);
                class241 var41 = Statics.field321;
                class241 var42 = Statics.field587;
                class241 var43 = Statics.field3399;
                class241 var44 = Statics.field615;
                Statics.field2666 = var41;
                Statics.field2661 = var42;
                Statics.field2652 = var43;
                Statics.field3422 = var44;
                Statics.field2627 = new class220[Statics.field2666.method3852()][];
                Statics.field722 = new boolean[Statics.field2666.method3852()];
                class241 var45 = Statics.field1527;
                Statics.field3297 = var45;
                class241 var46 = Statics.field1527;
                Statics.field3415 = var46;
                class247.method2884(Statics.field1527);
                class248.method2324(Statics.field1527);
                class241 var47 = Statics.field1527;
                Statics.field3401 = var47;
                Statics.field236 = new class98();
                class258.method1634(Statics.field1527, Statics.field3399, Statics.field615);
                class252.method2340(Statics.field1527, Statics.field3399);
                class246.method2699(Statics.field1527, Statics.field3399);
                class93.field1432 = class229.field2895;
                class93.field1436 = 60;
                field944 = 80;
            } else {
                class93.field1432 = class229.field2975 + Statics.field1527.method3948() + "%";
                class93.field1436 = 60;
            }
        } else if (field944 == 80) {
            int var48 = 0;
            if (Statics.field560 == null) {
                class241 var49 = Statics.field3399;
                int var50 = var49.method3855("compass");
                int var51 = var49.method3856(var50, "");
                class289 var52 = class290.method4624(var49, var50, var51);
                Statics.field560 = var52;
            } else {
                var48++;
            }
            if (Statics.field1499 == null) {
                class241 var53 = Statics.field3399;
                int var54 = var53.method3855("mapedge");
                int var55 = var53.method3856(var54, "");
                class289 var56 = class290.method4624(var53, var54, var55);
                Statics.field1499 = var56;
            } else {
                var48++;
            }
            if (Statics.field363 == null) {
                Statics.field363 = class290.method1401(Statics.field3399, "mapscene", "");
            } else {
                var48++;
            }
            if (Statics.field843 == null) {
                Statics.field843 = class290.method1672(Statics.field3399, "headicons_pk", "");
            } else {
                var48++;
            }
            if (Statics.field658 == null) {
                Statics.field658 = class290.method1672(Statics.field3399, "headicons_prayer", "");
            } else {
                var48++;
            }
            if (Statics.field1209 == null) {
                Statics.field1209 = class290.method1672(Statics.field3399, "headicons_hint", "");
            } else {
                var48++;
            }
            if (Statics.field326 == null) {
                Statics.field326 = class290.method1672(Statics.field3399, "mapmarker", "");
            } else {
                var48++;
            }
            if (Statics.field345 == null) {
                Statics.field345 = class290.method1672(Statics.field3399, "cross", "");
            } else {
                var48++;
            }
            if (Statics.field823 == null) {
                Statics.field823 = class290.method1672(Statics.field3399, "mapdots", "");
            } else {
                var48++;
            }
            if (Statics.field779 == null) {
                Statics.field779 = class290.method1401(Statics.field3399, "scrollbar", "");
            } else {
                var48++;
            }
            if (Statics.field647 == null) {
                Statics.field647 = class290.method1401(Statics.field3399, "mod_icons", "");
            } else {
                var48++;
            }
            if (var48 < 11) {
                class93.field1432 = class229.field2896 + var48 * 100 / 12 + "%";
                class93.field1436 = 70;
            } else {
                Statics.field3660 = Statics.field647;
                Statics.field1499.method4787();
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 41.0D) - 20;
                Statics.field363[0].method4743(var57 + var60, var58 + var60, var59 + var60);
                class93.field1432 = class229.field2897;
                class93.field1436 = 70;
                field944 = 90;
            }
        } else if (field944 == 90) {
            if (Statics.field2530.method3873()) {
                class126 var61 = new class126(Statics.field2530, Statics.field3399, 20, 0.8D, field1082 ? 64 : 128);
                class137.method2435(var61);
                class137.method2438(0.8D);
                class93.field1432 = class229.field2899;
                class93.field1436 = 90;
                field944 = 110;
            } else {
                class93.field1432 = class229.field2898 + Statics.field2530.method3948() + "%";
                class93.field1436 = 90;
            }
        } else if (field944 == 110) {
            Statics.field911 = new class72();
            Statics.field719.method2756(Statics.field911, 10);
            class93.field1432 = class229.field2900;
            class93.field1436 = 94;
            field944 = 120;
        } else if (field944 == 120) {
            if (Statics.field1513.method3869("huffman", "")) {
                class169 var62 = new class169(Statics.field1513.method3899("huffman", ""));
                Statics.field3677 = var62;
                class93.field1432 = class229.field2902;
                class93.field1436 = 96;
                field944 = 130;
            } else {
                class93.field1432 = class229.field2901 + "%";
                class93.field1436 = 96;
            }
        } else if (field944 == 130) {
            if (!Statics.field321.method3873()) {
                class93.field1432 = class229.field2953 + Statics.field321.method3948() * 4 / 5 + "%";
                class93.field1436 = 100;
            } else if (!Statics.field18.method3873()) {
                class93.field1432 = class229.field2953 + (80 + Statics.field18.method3948() / 6) + "%";
                class93.field1436 = 100;
            } else if (Statics.field615.method3873()) {
                class93.field1432 = class229.field2904;
                class93.field1436 = 98;
                field944 = 140;
            } else {
                class93.field1432 = class229.field2953 + (96 + Statics.field615.method3948() / 50) + "%";
                class93.field1436 = 100;
            }
        } else if (field944 == 140) {
            if (Statics.field3288.method3846(class41.field537.field542)) {
                if (Statics.field1219 == null) {
                    Statics.field1219 = new class292();
                    Statics.field1219.method5013(Statics.field3288, Statics.field2460, field1153, Statics.field363);
                }
                int var63 = Statics.field1219.method4983();
                if (var63 < 100) {
                    class93.field1432 = class229.field3109 + (var63 * 9 / 10 + 10) + "%";
                } else {
                    class93.field1432 = class229.field2906;
                    class93.field1436 = 100;
                    field944 = 150;
                }
            } else {
                class93.field1432 = class229.field3109 + Statics.field3288.method3923(class41.field537.field542) / 10 + "%";
            }
        } else if (field944 == 150) {
            method4463(10);
        }
    }

    @ObfuscatedName("cp.er(IZZZB)Lir;")
    public static class241 method1713(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class163 var4 = null;
        if (class157.field2258 != null) {
            var4 = new class163(arg0, class157.field2258, Statics.field310[arg0], 1000000);
        }
        return new class241(var4, Statics.field683, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ej(I)V")
    public final void method1051() {
        try {
            if (field990 == 0) {
                if (Statics.field1868 != null) {
                    Statics.field1868.method2794();
                    Statics.field1868 = null;
                }
                Statics.field491 = null;
                field969 = false;
                field949 = 0;
                field990 = 1;
            }
            if (field990 == 1) {
                if (Statics.field491 == null) {
                    Statics.field491 = Statics.field719.method2755(Statics.field510, Statics.field685);
                }
                if (Statics.field491.field2238 == 2) {
                    throw new IOException();
                }
                if (Statics.field491.field2238 == 1) {
                    Socket var1 = (Socket) Statics.field491.field2240;
                    class161 var2 = new class161(var1, 40000);
                    Statics.field1868 = var2;
                    Statics.field491 = null;
                    field990 = 2;
                }
            }
            if (field990 == 2) {
                field958.field2402 = 0;
                field958.method3129(14);
                Statics.field1868.method2791(field958.field2403, 0, 1);
                field960.field2402 = 0;
                field990 = 3;
            }
            if (field990 == 3) {
                if (Statics.field2836 != null) {
                    Statics.field2836.method1920();
                }
                if (Statics.field2821 != null) {
                    Statics.field2821.method1920();
                }
                if (!Statics.field1868.method2790(1)) {
                    return;
                }
                int var3 = Statics.field1868.method2793();
                if (Statics.field2836 != null) {
                    Statics.field2836.method1920();
                }
                if (Statics.field2821 != null) {
                    Statics.field2821.method1920();
                }
                if (var3 != 0) {
                    method21(var3);
                    return;
                }
                field960.field2402 = 0;
                field990 = 4;
            }
            if (field990 == 4) {
                if (field960.field2402 < 8) {
                    int var4 = Statics.field1868.method2802();
                    if (var4 > 8 - field960.field2402) {
                        var4 = 8 - field960.field2402;
                    }
                    if (var4 > 0) {
                        Statics.field1868.method2801(field960.field2403, field960.field2402, var4);
                        field960.field2402 += var4;
                    }
                }
                if (field960.field2402 == 8) {
                    field960.field2402 = 0;
                    Statics.field535 = field960.method2971();
                    field990 = 5;
                }
            }
            if (field990 == 5) {
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field535 >> 32), (int) (Statics.field535 & 0xFFFFFFFFFFFFFFFFL) };
                field958.field2402 = 0;
                field958.method3129(1);
                field958.method3129(class93.field1418.method16());
                field958.method2953(var5[0]);
                field958.method2953(var5[1]);
                field958.method2953(var5[2]);
                field958.method2953(var5[3]);
                switch(class93.field1418.field2196) {
                    case 0:
                        field958.field2402 += 8;
                        break;
                    case 1:
                    case 2:
                        field958.method2952(Statics.field1351);
                        field958.field2402 += 5;
                        break;
                    case 3:
                        field958.method2953((Integer) Statics.field1375.field1312.get(class274.method3695(class93.field1438)));
                        field958.field2402 += 4;
                }
                field958.method2956(class93.field1435);
                field958.method3019(class91.field1407, class91.field1405);
                field959.field2402 = 0;
                if (field1175 == 40) {
                    field959.method3129(18);
                } else {
                    field959.method3129(16);
                }
                field959.method2951(0);
                int var6 = field959.field2402;
                field959.method2953(146);
                field959.method2959(field958.field2403, 0, field958.field2402);
                int var7 = field959.field2402;
                field959.method2956(class93.field1438);
                field959.method3129((field1130 ? 1 : 0) << 1 | (field1082 ? 1 : 0));
                field959.method2951(Statics.field35);
                field959.method2951(Statics.field806);
                method4466(field959);
                field959.method2956(Statics.field600);
                field959.method2953(Statics.field2175);
                class177 var8 = new class177(Statics.field520.method5080());
                Statics.field520.method5079(var8);
                field959.method2959(var8.field2403, 0, var8.field2403.length);
                field959.method3129(Statics.field594);
                field959.method2953(0);
                field959.method2953(Statics.field574.field3246);
                field959.method2953(Statics.field588.field3246);
                field959.method2953(Statics.field1527.field3246);
                field959.method2953(Statics.field321.field3246);
                field959.method2953(Statics.field582.field3246);
                field959.method2953(Statics.field2216.field3246);
                field959.method2953(Statics.field666.field3246);
                field959.method2953(Statics.field587.field3246);
                field959.method2953(Statics.field3399.field3246);
                field959.method2953(Statics.field2530.field3246);
                field959.method2953(Statics.field1513.field3246);
                field959.method2953(Statics.field306.field3246);
                field959.method2953(Statics.field18.field3246);
                field959.method2953(Statics.field615.field3246);
                field959.method2953(Statics.field797.field3246);
                field959.method2953(Statics.field13.field3246);
                field959.method2953(Statics.field3288.field3246);
                field959.method3070(var5, var7, field959.field2402);
                field959.method2961(field959.field2402 - var6);
                Statics.field1868.method2791(field959.field2403, 0, field959.field2402);
                field958.method3194(var5);
                for (int var9 = 0; var9 < 4; var9++) {
                    var5[var9] += 50;
                }
                field960.method3194(var5);
                field990 = 6;
            }
            if (field990 == 6 && Statics.field1868.method2802() > 0) {
                int var10 = Statics.field1868.method2793();
                if (var10 == 21 && field1175 == 20) {
                    field990 = 7;
                } else if (var10 == 2) {
                    field990 = 9;
                } else if (var10 == 15 && field1175 == 40) {
                    field961 = -1;
                    field990 = 13;
                } else if (var10 == 23 && field989 < 1) {
                    field989++;
                    field990 = 0;
                } else if (var10 == 29) {
                    field990 = 11;
                } else {
                    method21(var10);
                    return;
                }
            }
            if (field990 == 7 && Statics.field1868.method2802() > 0) {
                field986 = (Statics.field1868.method2793() + 3) * 60;
                field990 = 8;
            }
            if (field990 == 8) {
                field949 = 0;
                Statics.method164(class229.field2910, class229.field2911, field986 / 60 + class229.field3123);
                if (--field986 <= 0) {
                    field990 = 0;
                }
            } else {
                if (field990 == 9 && Statics.field1868.method2802() >= 13) {
                    boolean var11 = Statics.field1868.method2793() == 1;
                    Statics.field1868.method2801(field960.field2403, 0, 4);
                    field960.field2402 = 0;
                    boolean var12 = false;
                    if (var11) {
                        int var13 = field960.method3196() << 24;
                        int var14 = var13 | field960.method3196() << 16;
                        int var15 = var14 | field960.method3196() << 8;
                        int var16 = var15 | field960.method3196();
                        int var17 = class274.method3695(class93.field1438);
                        if (Statics.field1375.field1312.size() >= 10 && !Statics.field1375.field1312.containsKey(var17)) {
                            Iterator var18 = Statics.field1375.field1312.entrySet().iterator();
                            var18.next();
                            var18.remove();
                        }
                        Statics.field1375.field1312.put(var17, var16);
                        class82.method221();
                    }
                    field1083 = Statics.field1868.method2793();
                    field1081 = Statics.field1868.method2793() == 1;
                    field1037 = Statics.field1868.method2793();
                    field1037 <<= 0x8;
                    field1037 += Statics.field1868.method2793();
                    field1164 = Statics.field1868.method2793();
                    Statics.field1868.method2801(field960.field2403, 0, 1);
                    field960.field2402 = 0;
                    field1074 = field960.method3196();
                    Statics.field1868.method2801(field960.field2403, 0, 2);
                    field960.field2402 = 0;
                    field961 = field960.method2967();
                    try {
                        class53.method669(Statics.field336, "zap");
                    } catch (Throwable var29) {
                    }
                    field990 = 10;
                }
                if (field990 != 10) {
                    if (field990 == 11 && Statics.field1868.method2802() >= 2) {
                        field960.field2402 = 0;
                        Statics.field1868.method2801(field960.field2403, 0, 2);
                        field960.field2402 = 0;
                        Statics.field567 = field960.method2967();
                        field990 = 12;
                    }
                    if (field990 == 12 && Statics.field1868.method2802() >= Statics.field567) {
                        field960.field2402 = 0;
                        Statics.field1868.method2801(field960.field2403, 0, Statics.field567);
                        field960.field2402 = 0;
                        String var20 = field960.method2973();
                        String var21 = field960.method2973();
                        String var22 = field960.method2973();
                        Statics.method164(var20, var21, var22);
                        method4463(10);
                    }
                    if (field990 == 13) {
                        if (field961 == -1) {
                            if (Statics.field1868.method2802() < 2) {
                                return;
                            }
                            Statics.field1868.method2801(field960.field2403, 0, 2);
                            field960.field2402 = 0;
                            field961 = field960.method2967();
                        }
                        if (Statics.field1868.method2802() >= field961) {
                            Statics.field1868.method2801(field960.field2403, 0, field961);
                            field960.field2402 = 0;
                            int var23 = field961;
                            field958.field2402 = 0;
                            field960.field2402 = 0;
                            field1074 = -1;
                            field1028 = -1;
                            field966 = -1;
                            field976 = -1;
                            field961 = 0;
                            field963 = 0;
                            field933 = 0;
                            field957 = 0;
                            field1063 = -1;
                            field1108 = false;
                            field1054 = 0;
                            field1148 = 0;
                            for (int var24 = 0; var24 < 2048; var24++) {
                                field970[var24] = null;
                            }
                            Statics.field300 = null;
                            for (int var25 = 0; var25 < field953.length; var25++) {
                                class87 var26 = field953[var25];
                                if (var26 != null) {
                                    var26.field1250 = -1;
                                    var26.field1257 = false;
                                }
                            }
                            class64.field775 = new class194(32);
                            method4463(30);
                            for (int var27 = 0; var27 < 100; var27++) {
                                field1121[var27] = true;
                            }
                            method1470();
                            class97.method579(field960);
                            if (field960.field2402 != var23) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field949++;
                        if (field949 > 2000) {
                            if (field989 < 1) {
                                if (Statics.field819 == Statics.field685) {
                                    Statics.field685 = Statics.field2633;
                                } else {
                                    Statics.field685 = Statics.field819;
                                }
                                field989++;
                                field990 = 0;
                            } else {
                                method21(-3);
                            }
                        }
                    }
                } else if (Statics.field1868.method2802() >= field961) {
                    field960.field2402 = 0;
                    Statics.field1868.method2801(field960.field2403, 0, field961);
                    method3795();
                    class97.method579(field960);
                    Statics.field769 = -1;
                    method3228(false);
                    field1074 = -1;
                }
            }
        } catch (IOException var30) {
            if (field989 < 1) {
                if (Statics.field819 == Statics.field685) {
                    Statics.field685 = Statics.field2633;
                } else {
                    Statics.field685 = Statics.field819;
                }
                field989++;
                field990 = 0;
            } else {
                method21(-2);
            }
        }
    }

    @ObfuscatedName("hx.et(I)V")
    public static void method3795() {
        field1156 = 1L;
        field930 = -1;
        Statics.field911.field848 = 0;
        Statics.field2280 = true;
        field931 = true;
        field1140 = -1L;
        class284.method325();
        field958.field2402 = 0;
        field960.field2402 = 0;
        field1074 = -1;
        field1028 = -1;
        field966 = -1;
        field976 = -1;
        field963 = 0;
        field933 = 0;
        field1095 = 0;
        field934 = 0;
        method137();
        class60.method38(0);
        class99.field1517.clear();
        class99.field1515.method3285();
        class99.field1516.method3459();
        class99.field1518 = 0;
        field1069 = 0;
        field1030 = false;
        field1045 = 0;
        field980 = (int) (Math.random() * 100.0D) - 50;
        field1049 = (int) (Math.random() * 110.0D) - 55;
        field1085 = (int) (Math.random() * 80.0D) - 40;
        field987 = (int) (Math.random() * 120.0D) - 60;
        field994 = (int) (Math.random() * 30.0D) - 20;
        field1000 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field1054 = 0;
        field1143 = -1;
        field1148 = 0;
        field999 = 0;
        field942 = class92.field1415;
        field918 = class92.field1415;
        field954 = 0;
        class97.field1488 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class97.field1487[var0] = null;
            class97.field1489[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field970[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field953[var2] = null;
        }
        field1190 = -1;
        field1048.method3409();
        field1185.method3409();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field1046[var3][var4][var5] = null;
                }
            }
        }
        field1047 = new class197();
        field1142 = 0;
        field1181 = 0;
        field919 = 0;
        for (int var6 = 0; var6 < Statics.field3300; var6++) {
            class245 var7 = class245.method3237(var6);
            if (var7 != null) {
                class215.field2625[var6] = 0;
                class215.field2623[var6] = 0;
            }
        }
        Statics.field236.method1690();
        field978 = -1;
        if (field1076 != -1) {
            class220.method214(field1076);
        }
        for (class69 var8 = (class69) field1077.method3332(); var8 != null; var8 = (class69) field1077.method3333()) {
            method927(var8, true);
        }
        field1076 = -1;
        field1077 = new class194(8);
        field1080 = null;
        field957 = 0;
        field1063 = -1;
        field1108 = false;
        field1187.method3723((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field998[var9] = null;
            field1043[var9] = false;
        }
        class64.field775 = new class194(32);
        field925 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field1121[var10] = true;
        }
        method1470();
        field1141 = null;
        Statics.field15 = 0;
        Statics.field747 = null;
        for (int var11 = 0; var11 < 8; var11++) {
            field967[var11] = new class17();
        }
        Statics.field1780 = null;
    }

    @ObfuscatedName("t.eh(IB)V")
    public static void method21(int arg0) {
        if (arg0 == -3) {
            Statics.method164(class229.field2970, class229.field2914, class229.field2915);
        } else if (arg0 == -2) {
            Statics.method164(class229.field2916, class229.field3054, class229.field2918);
        } else if (arg0 == -1) {
            Statics.method164(class229.field2919, class229.field2938, class229.field2921);
        } else if (arg0 == 3) {
            class93.field1433 = 3;
        } else if (arg0 == 4) {
            Statics.method164(class229.field2922, class229.field2923, class229.field2924);
        } else if (arg0 == 5) {
            Statics.method164(class229.field2925, class229.field2983, class229.field2927);
        } else if (arg0 == 6) {
            Statics.method164(class229.field2928, class229.field2929, class229.field2926);
        } else if (arg0 == 7) {
            Statics.method164(class229.field2931, class229.field2932, class229.field3008);
        } else if (arg0 == 8) {
            Statics.method164(class229.field2934, class229.field3107, class229.field2936);
        } else if (arg0 == 9) {
            Statics.method164(class229.field3115, class229.field2894, class229.field2886);
        } else if (arg0 == 10) {
            Statics.method164(class229.field2942, class229.field2941, class229.field2881);
        } else if (arg0 == 11) {
            Statics.method164(class229.field2943, class229.field2944, class229.field3050);
        } else if (arg0 == 12) {
            Statics.method164(class229.field2939, class229.field3116, class229.field2948);
        } else if (arg0 == 13) {
            Statics.method164(class229.field3133, class229.field2950, class229.field2998);
        } else if (arg0 == 14) {
            Statics.method164(class229.field2952, class229.field3022, class229.field2954);
        } else if (arg0 == 16) {
            Statics.method164(class229.field3092, class229.field2956, class229.field2957);
        } else if (arg0 == 17) {
            Statics.method164(class229.field3016, class229.field2959, class229.field2960);
        } else if (arg0 == 18) {
            Statics.method164(class229.field2961, class229.field2962, class229.field2963);
        } else if (arg0 == 19) {
            Statics.method164(class229.field2964, class229.field3150, class229.field3020);
        } else if (arg0 == 20) {
            Statics.method164(class229.field2967, class229.field2968, class229.field2969);
        } else if (arg0 == 22) {
            Statics.method164(class229.field3068, class229.field2971, class229.field2972);
        } else if (arg0 == 23) {
            Statics.method164(class229.field2973, class229.field3097, class229.field3101);
        } else if (arg0 == 24) {
            Statics.method164(class229.field2976, class229.field2977, class229.field2978);
        } else if (arg0 == 25) {
            Statics.method164(class229.field2979, class229.field2980, class229.field3034);
        } else if (arg0 == 26) {
            Statics.method164(class229.field3086, class229.field2888, class229.field2984);
        } else if (arg0 == 27) {
            Statics.method164(class229.field2985, class229.field3033, class229.field3147);
        } else if (arg0 == 31) {
            Statics.method164(class229.field2903, class229.field2995, class229.field2996);
        } else if (arg0 == 32) {
            Statics.method164(class229.field2997, class229.field2879, class229.field2974);
        } else if (arg0 == 37) {
            Statics.method164(class229.field2994, class229.field3001, class229.field3002);
        } else if (arg0 == 38) {
            Statics.method164(class229.field3003, class229.field3004, class229.field3005);
        } else if (arg0 == 55) {
            Statics.method164(class229.field3006, class229.field2871, class229.field2982);
        } else if (arg0 == 56) {
            Statics.method164(class229.field3009, class229.field2885, class229.field3011);
            method4463(11);
            return;
        } else if (arg0 == 57) {
            Statics.method164(class229.field3012, class229.field3013, class229.field3014);
            method4463(11);
            return;
        } else {
            Statics.method164(class229.field3015, class229.field3051, class229.field3017);
        }
        method4463(10);
    }

    @ObfuscatedName("kz.ey(B)V")
    public static final void method4740() {
        if (Statics.field1868 != null) {
            Statics.field1868.method2794();
            Statics.field1868 = null;
        }
        method901();
        Statics.field1498.method2522();
        for (int var0 = 0; var0 < 4; var0++) {
            field1053[var0].method2849();
        }
        System.gc();
        class207.field2523 = 1;
        Statics.field3408 = null;
        Statics.field1408 = -1;
        Statics.field3684 = -1;
        Statics.field2526 = 0;
        Statics.field353 = false;
        Statics.field2525 = 2;
        field1152 = -1;
        field1119 = false;
        for (class83 var1 = (class83) class83.field1326.method3389(); var1 != null; var1 = (class83) class83.field1326.method3385()) {
            if (var1.field1328 != null) {
                Statics.field283.method1766(var1.field1328);
                var1.field1328 = null;
            }
            if (var1.field1335 != null) {
                Statics.field283.method1766(var1.field1335);
                var1.field1335 = null;
            }
        }
        class83.field1326.method3409();
        method4463(10);
    }

    @ObfuscatedName("br.eo(I)V")
    public static final void method901() {
        class263.method2822();
        class250.method4();
        class251.field3363.method3316();
        class259.method2828();
        class262.method243();
        class260.method3809();
        class264.field3632.method3316();
        class264.field3619.method3316();
        class249.method668();
        class254.field3397.method3316();
        class245.method1042();
        class258.method707();
        class252.field3377.method3316();
        class252.field3390.method3316();
        class256.field3407.method3316();
        class255.method4049();
        class246.method970();
        class217.field2643.method3316();
        class220.field2662.method3316();
        class220.field2663.method3316();
        class220.field2664.method3316();
        class220.field2665.method3316();
        ((class126) Statics.field2009).method2220();
        class100.field1522.method3316();
        Statics.field574.method3854();
        Statics.field588.method3854();
        Statics.field321.method3854();
        Statics.field582.method3854();
        Statics.field2216.method3854();
        Statics.field666.method3854();
        Statics.field587.method3854();
        Statics.field3399.method3854();
        Statics.field2530.method3854();
        Statics.field1513.method3854();
        Statics.field306.method3854();
        Statics.field18.method3854();
    }

    @ObfuscatedName("ah.ei(I)V")
    public static final void method545() {
        if (field1095 > 0) {
            method4740();
        } else {
            method4463(40);
            Statics.field429 = Statics.field1868;
            Statics.field1868 = null;
        }
    }

    @ObfuscatedName("client.eq(I)V")
    public final void method1278() {
        if (field933 > 1) {
            field933--;
        }
        if (field1095 > 0) {
            field1095--;
        }
        if (field969) {
            field969 = false;
            method545();
            return;
        }
        if (!field1108) {
            method71();
        }
        for (int var1 = 0; var1 < 100 && this.method1055(); var1++) {
        }
        if (field1175 != 30) {
            return;
        }
        while (true) {
            class283 var2 = (class283) class284.field3763.method3352();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                Object var5 = Statics.field911.field847;
                synchronized (Statics.field911.field847) {
                    if (!field1172) {
                        Statics.field911.field848 = 0;
                    } else if (class60.field735 != 0 || Statics.field911.field848 >= 40) {
                        field958.method3195(218);
                        field958.method3129(0);
                        int var6 = field958.field2402;
                        int var7 = 0;
                        for (int var8 = 0; var8 < Statics.field911.field848 && field958.field2402 - var6 < 240; var8++) {
                            var7++;
                            int var9 = Statics.field911.field846[var8];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 502) {
                                var9 = 502;
                            }
                            int var10 = Statics.field911.field849[var8];
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > 764) {
                                var10 = 764;
                            }
                            int var11 = var9 * 765 + var10;
                            if (Statics.field911.field846[var8] == -1 && Statics.field911.field849[var8] == -1) {
                                var10 = -1;
                                var9 = -1;
                                var11 = 524287;
                            }
                            if (field951 != var10 || field929 != var9) {
                                int var12 = var10 - field951;
                                field951 = var10;
                                int var13 = var9 - field929;
                                field929 = var9;
                                if (field930 < 8 && var12 >= -32 && var12 <= 31 && var13 >= -32 && var13 <= 31) {
                                    var12 += 32;
                                    var13 += 32;
                                    field958.method2951((field930 << 12) + (var12 << 6) + var13);
                                    field930 = 0;
                                } else if (field930 < 8) {
                                    field958.method2952((field930 << 19) + 8388608 + var11);
                                    field930 = 0;
                                } else {
                                    field958.method2953((field930 << 19) + -1073741824 + var11);
                                    field930 = 0;
                                }
                            } else if (field930 < 2047) {
                                field930++;
                            }
                        }
                        field958.method2954(field958.field2402 - var6);
                        if (var7 >= Statics.field911.field848) {
                            Statics.field911.field848 = 0;
                        } else {
                            Statics.field911.field848 -= var7;
                            for (int var14 = 0; var14 < Statics.field911.field848; var14++) {
                                Statics.field911.field849[var14] = Statics.field911.field849[var7 + var14];
                                Statics.field911.field846[var14] = Statics.field911.field846[var7 + var14];
                            }
                        }
                    }
                }
                if (class60.field735 == 1 || !Statics.field242 && class60.field735 == 4 || class60.field735 == 2) {
                    long var16 = (class60.field737 - field1156 * -1L) / 50L;
                    if (var16 > 4095L) {
                        var16 = 4095L;
                    }
                    field1156 = class60.field737 * -1L;
                    int var18 = class60.field724;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > Statics.field806) {
                        var18 = Statics.field806;
                    }
                    int var19 = class60.field736;
                    if (var19 < 0) {
                        var19 = 0;
                    } else if (var19 > Statics.field35) {
                        var19 = Statics.field35;
                    }
                    int var20 = (int) var16;
                    field958.method3195(153);
                    field958.method2951((var20 << 1) + (class60.field735 == 2 ? 1 : 0));
                    field958.method2951(var19);
                    field958.method2951(var18);
                }
                if (class51.field641 > 0) {
                    field958.method3195(205);
                    field958.method2951(0);
                    int var21 = field958.field2402;
                    long var22 = class179.method3585();
                    for (int var24 = 0; var24 < class51.field641; var24++) {
                        long var25 = var22 - field1140;
                        if (var25 > 16777215L) {
                            var25 = 16777215L;
                        }
                        field1140 = var22;
                        field958.method2991(class51.field640[var24]);
                        field958.method3005((int) var25);
                    }
                    field958.method2961(field958.field2402 - var21);
                }
                if (field1006 > 0) {
                    field1006--;
                }
                if (class51.field629[96] || class51.field629[97] || class51.field629[98] || class51.field629[99]) {
                    field916 = true;
                }
                if (field916 && field1006 <= 0) {
                    field1006 = 20;
                    field916 = false;
                    field958.method3195(58);
                    field958.method2951(field1000);
                    field958.method3098(field971);
                }
                if (Statics.field2280 && !field931) {
                    field931 = true;
                    field958.method3195(124);
                    field958.method3129(1);
                }
                if (!Statics.field2280 && field931) {
                    field931 = false;
                    field958.method3195(124);
                    field958.method3129(0);
                }
                method3828();
                if (field1175 != 30) {
                    return;
                }
                for (class77 var27 = (class77) field1047.method3389(); var27 != null; var27 = (class77) field1047.method3385()) {
                    if (var27.field1205 > 0) {
                        var27.field1205--;
                    }
                    if (var27.field1205 == 0) {
                        if (var27.field1200 >= 0) {
                            int var28 = var27.field1200;
                            int var29 = var27.field1202;
                            class259 var30 = class259.method653(var28);
                            if (var29 == 11) {
                                var29 = 10;
                            }
                            if (var29 >= 5 && var29 <= 8) {
                                var29 = 4;
                            }
                            boolean var31 = var30.method4289(var29);
                            if (!var31) {
                                continue;
                            }
                        }
                        method3807(var27.field1208, var27.field1197, var27.field1198, var27.field1207, var27.field1200, var27.field1201, var27.field1202);
                        var27.method3372();
                    } else {
                        if (var27.field1206 > 0) {
                            var27.field1206--;
                        }
                        if (var27.field1206 == 0 && var27.field1198 >= 1 && var27.field1207 >= 1 && var27.field1198 <= 102 && var27.field1207 <= 102) {
                            if (var27.field1203 >= 0) {
                                int var32 = var27.field1203;
                                int var33 = var27.field1196;
                                class259 var34 = class259.method653(var32);
                                if (var33 == 11) {
                                    var33 = 10;
                                }
                                if (var33 >= 5 && var33 <= 8) {
                                    var33 = 4;
                                }
                                boolean var35 = var34.method4289(var33);
                                if (!var35) {
                                    continue;
                                }
                            }
                            method3807(var27.field1208, var27.field1197, var27.field1198, var27.field1207, var27.field1203, var27.field1204, var27.field1196);
                            var27.field1206 = -1;
                            if (var27.field1203 == var27.field1200 && var27.field1200 == -1) {
                                var27.method3372();
                            } else if (var27.field1203 == var27.field1200 && var27.field1204 == var27.field1201 && var27.field1202 == var27.field1196) {
                                var27.method3372();
                            }
                        }
                    }
                }
                method1653();
                field963++;
                if (field963 > 750) {
                    method545();
                    return;
                }
                int var36 = class97.field1488;
                int[] var37 = class97.field1491;
                for (int var38 = 0; var38 < var36; var38++) {
                    class75 var39 = field970[var37[var38]];
                    if (var39 != null) {
                        method96(var39, 1);
                    }
                }
                method714();
                method1393();
                field992++;
                if (field1026 != 0) {
                    field1025 += 20;
                    if (field1025 >= 400) {
                        field1026 = 0;
                    }
                }
                if (Statics.field19 != null) {
                    field1186++;
                    if (field1186 >= 15) {
                        method1456(Statics.field19);
                        Statics.field19 = null;
                    }
                }
                class220 var40 = Statics.field254;
                class220 var41 = Statics.field788;
                Statics.field254 = null;
                Statics.field788 = null;
                field1093 = null;
                field1097 = false;
                field1031 = false;
                field1027 = 0;
                while (Statics.method4403() && field1027 < 128) {
                    if (field1083 >= 2 && class51.field629[82] && Statics.field2115 == 66) {
                        String var42 = "";
                        Iterator var43 = class99.field1515.iterator();
                        while (var43.hasNext()) {
                            class73 var44 = (class73) var43.next();
                            var42 = var42 + var44.field868 + ':' + var44.field862 + '\n';
                        }
                        Statics.field336.method740(var42);
                    } else {
                        field1139[field1027] = Statics.field2115;
                        field1138[field1027] = Statics.field442;
                        field1027++;
                    }
                }
                if (field1076 != -1) {
                    method52(field1076, 0, 0, Statics.field35, Statics.field806, 0, 0);
                }
                field1101++;
                while (true) {
                    class70 var47;
                    class220 var48;
                    class220 var49;
                    do {
                        var47 = (class70) field1116.method3381();
                        if (var47 == null) {
                            while (true) {
                                class70 var50;
                                class220 var51;
                                class220 var52;
                                do {
                                    var50 = (class70) field1117.method3381();
                                    if (var50 == null) {
                                        while (true) {
                                            class70 var53;
                                            class220 var54;
                                            class220 var55;
                                            do {
                                                var53 = (class70) field1115.method3381();
                                                if (var53 == null) {
                                                    this.method1202();
                                                    if (Statics.field1219 != null) {
                                                        Statics.field1219.method4907(Statics.field2342, (Statics.field300.field1282 >> 7) + Statics.field590, (Statics.field300.field1225 >> 7) + Statics.field617, false);
                                                        Statics.field1219.method5064();
                                                    }
                                                    if (field1089 != null) {
                                                        this.method1060();
                                                    }
                                                    if (Statics.field664 != null) {
                                                        method1456(Statics.field664);
                                                        field1084++;
                                                        if (class60.field728 == 0) {
                                                            if (!field1033) {
                                                                int var64 = method1633();
                                                                if (field957 > 2 && (field926 == 1 && !method997() || method965(var64))) {
                                                                    this.method1057(field1013, field1092);
                                                                } else if (field957 > 0) {
                                                                    method677(field1013, field1092);
                                                                }
                                                            } else if (Statics.field664 == Statics.field1872 && field972 != field1032) {
                                                                class220 var56 = Statics.field664;
                                                                byte var57 = 0;
                                                                if (field1079 == 1 && var56.field2722 == 206) {
                                                                    var57 = 1;
                                                                }
                                                                if (var56.field2754[field1032] <= 0) {
                                                                    var57 = 0;
                                                                }
                                                                int var58 = method1955(var56);
                                                                boolean var59 = (var58 >> 29 & 0x1) != 0;
                                                                if (var59) {
                                                                    int var60 = field972;
                                                                    int var61 = field1032;
                                                                    var56.field2754[var61] = var56.field2754[var60];
                                                                    var56.field2787[var61] = var56.field2787[var60];
                                                                    var56.field2754[var60] = -1;
                                                                    var56.field2787[var60] = 0;
                                                                } else if (var57 == 1) {
                                                                    int var62 = field972;
                                                                    int var63 = field1032;
                                                                    while (var62 != var63) {
                                                                        if (var62 > var63) {
                                                                            var56.method3768(var62 - 1, var62);
                                                                            var62--;
                                                                        } else if (var62 < var63) {
                                                                            var56.method3768(var62 + 1, var62);
                                                                            var62++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var56.method3768(field1032, field972);
                                                                }
                                                                field958.method3195(73);
                                                                field958.method3129(var57);
                                                                field958.method2953(Statics.field664.field2668);
                                                                field958.method2951(field972);
                                                                field958.method2951(field1032);
                                                            }
                                                            field1186 = 10;
                                                            class60.field735 = 0;
                                                            Statics.field664 = null;
                                                        } else if (field1084 >= 5 && (class60.field742 > field1013 + 5 || class60.field742 < field1013 - 5 || class60.field738 > field1092 + 5 || class60.field738 < field1092 - 5)) {
                                                            field1033 = true;
                                                        }
                                                    }
                                                    if (class140.method2533()) {
                                                        int var65 = class140.field2103;
                                                        int var66 = class140.field2112;
                                                        field958.method3195(63);
                                                        field958.method3129(5);
                                                        field958.method2951(Statics.field617 + var66);
                                                        field958.method2998(Statics.field590 + var65);
                                                        field958.method2997(class51.field629[82] ? (class51.field629[81] ? 2 : 1) : 0);
                                                        class140.method2577();
                                                        field1023 = class60.field736;
                                                        field1024 = class60.field724;
                                                        field1026 = 1;
                                                        field1025 = 0;
                                                        field1148 = var65;
                                                        field999 = var66;
                                                    }
                                                    if (Statics.field254 != var40) {
                                                        if (var40 != null) {
                                                            method1456(var40);
                                                        }
                                                        if (Statics.field254 != null) {
                                                            method1456(Statics.field254);
                                                        }
                                                    }
                                                    if (Statics.field788 != var41 && field1068 == field1034) {
                                                        if (var41 != null) {
                                                            method1456(var41);
                                                        }
                                                        if (Statics.field788 != null) {
                                                            method1456(Statics.field788);
                                                        }
                                                    }
                                                    if (Statics.field788 == null) {
                                                        if (field1034 > 0) {
                                                            field1034--;
                                                        }
                                                    } else if (field1034 < field1068) {
                                                        field1034++;
                                                        if (field1068 == field1034) {
                                                            method1456(Statics.field788);
                                                        }
                                                    }
                                                    method682();
                                                    if (field1162) {
                                                        int var67 = Statics.field1404 * 128 + 64;
                                                        int var68 = Statics.field490 * 128 + 64;
                                                        int var69 = method971(var67, var68, Statics.field2342) - Statics.field533;
                                                        if (Statics.field1520 < var67) {
                                                            Statics.field1520 += Statics.field351 * (var67 - Statics.field1520) / 1000 + Statics.field2448;
                                                            if (Statics.field1520 > var67) {
                                                                Statics.field1520 = var67;
                                                            }
                                                        }
                                                        if (Statics.field1520 > var67) {
                                                            Statics.field1520 -= Statics.field351 * (Statics.field1520 - var67) / 1000 + Statics.field2448;
                                                            if (Statics.field1520 < var67) {
                                                                Statics.field1520 = var67;
                                                            }
                                                        }
                                                        if (Statics.field740 < var69) {
                                                            Statics.field740 += Statics.field351 * (var69 - Statics.field740) / 1000 + Statics.field2448;
                                                            if (Statics.field740 > var69) {
                                                                Statics.field740 = var69;
                                                            }
                                                        }
                                                        if (Statics.field740 > var69) {
                                                            Statics.field740 -= Statics.field351 * (Statics.field740 - var69) / 1000 + Statics.field2448;
                                                            if (Statics.field740 < var69) {
                                                                Statics.field740 = var69;
                                                            }
                                                        }
                                                        if (Statics.field271 < var68) {
                                                            Statics.field271 += Statics.field351 * (var68 - Statics.field271) / 1000 + Statics.field2448;
                                                            if (Statics.field271 > var68) {
                                                                Statics.field271 = var68;
                                                            }
                                                        }
                                                        if (Statics.field271 > var68) {
                                                            Statics.field271 -= Statics.field351 * (Statics.field271 - var68) / 1000 + Statics.field2448;
                                                            if (Statics.field271 < var68) {
                                                                Statics.field271 = var68;
                                                            }
                                                        }
                                                        int var70 = Statics.field256 * 128 + 64;
                                                        int var71 = Statics.field3678 * 128 + 64;
                                                        int var72 = method971(var70, var71, Statics.field2342) - Statics.field851;
                                                        int var73 = var70 - Statics.field1520;
                                                        int var74 = var72 - Statics.field740;
                                                        int var75 = var71 - Statics.field271;
                                                        int var76 = (int) Math.sqrt((double) (var73 * var73 + var75 * var75));
                                                        int var77 = (int) (Math.atan2((double) var74, (double) var76) * 325.949D) & 0x7FF;
                                                        int var78 = (int) (Math.atan2((double) var73, (double) var75) * -325.949D) & 0x7FF;
                                                        if (var77 < 128) {
                                                            var77 = 128;
                                                        }
                                                        if (var77 > 383) {
                                                            var77 = 383;
                                                        }
                                                        if (Statics.field763 < var77) {
                                                            Statics.field763 += Statics.field257 * (var77 - Statics.field763) / 1000 + Statics.field320;
                                                            if (Statics.field763 > var77) {
                                                                Statics.field763 = var77;
                                                            }
                                                        }
                                                        if (Statics.field763 > var77) {
                                                            Statics.field763 -= Statics.field257 * (Statics.field763 - var77) / 1000 + Statics.field320;
                                                            if (Statics.field763 < var77) {
                                                                Statics.field763 = var77;
                                                            }
                                                        }
                                                        int var79 = var78 - Statics.field1417;
                                                        if (var79 > 1024) {
                                                            var79 -= 2048;
                                                        }
                                                        if (var79 < -1024) {
                                                            var79 += 2048;
                                                        }
                                                        if (var79 > 0) {
                                                            Statics.field1417 += Statics.field257 * var79 / 1000 + Statics.field320;
                                                            Statics.field1417 &= 0x7FF;
                                                        }
                                                        if (var79 < 0) {
                                                            Statics.field1417 -= Statics.field257 * -var79 / 1000 + Statics.field320;
                                                            Statics.field1417 &= 0x7FF;
                                                        }
                                                        int var80 = var78 - Statics.field1417;
                                                        if (var80 > 1024) {
                                                            var80 -= 2048;
                                                        }
                                                        if (var80 < -1024) {
                                                            var80 += 2048;
                                                        }
                                                        if (var80 < 0 && var79 > 0 || var80 > 0 && var79 < 0) {
                                                            Statics.field1417 = var78;
                                                        }
                                                    }
                                                    for (int var81 = 0; var81 < 5; var81++) {
                                                        int var10002 = field1042[var81]++;
                                                    }
                                                    Statics.field236.method1708();
                                                    int var82 = Statics.method492();
                                                    int var83 = class51.field634;
                                                    if (var82 > 15000 && var83 > 15000) {
                                                        field1095 = 250;
                                                        class60.method38(14500);
                                                        field958.method3195(11);
                                                    }
                                                    field983++;
                                                    if (field983 > 500) {
                                                        field983 = 0;
                                                        int var85 = (int) (Math.random() * 8.0D);
                                                        if ((var85 & 0x1) == 1) {
                                                            field980 += field981;
                                                        }
                                                        if ((var85 & 0x2) == 2) {
                                                            field1049 += field1005;
                                                        }
                                                        if ((var85 & 0x4) == 4) {
                                                            field1085 += field985;
                                                        }
                                                    }
                                                    if (field980 < -50) {
                                                        field981 = 2;
                                                    }
                                                    if (field980 > 50) {
                                                        field981 = -2;
                                                    }
                                                    if (field1049 < -55) {
                                                        field1005 = 2;
                                                    }
                                                    if (field1049 > 55) {
                                                        field1005 = -2;
                                                    }
                                                    if (field1085 < -40) {
                                                        field985 = 1;
                                                    }
                                                    if (field1085 > 40) {
                                                        field985 = -1;
                                                    }
                                                    field991++;
                                                    if (field991 > 500) {
                                                        field991 = 0;
                                                        int var86 = (int) (Math.random() * 8.0D);
                                                        if ((var86 & 0x1) == 1) {
                                                            field987 += field988;
                                                        }
                                                        if ((var86 & 0x2) == 2) {
                                                            field994 += field939;
                                                        }
                                                    }
                                                    if (field987 < -60) {
                                                        field988 = 2;
                                                    }
                                                    if (field987 > 60) {
                                                        field988 = -2;
                                                    }
                                                    if (field994 < -20) {
                                                        field939 = 1;
                                                    }
                                                    if (field994 > 10) {
                                                        field939 = -1;
                                                    }
                                                    for (class68 var87 = (class68) field1184.method3419(); var87 != null; var87 = (class68) field1184.method3418()) {
                                                        if ((long) var87.field816 < class179.method3585() / 1000L - 5L) {
                                                            if (var87.field811 > 0) {
                                                                class99.method968(5, "", var87.field810 + class229.field3018);
                                                            }
                                                            if (var87.field811 == 0) {
                                                                class99.method968(5, "", var87.field810 + class229.field3019);
                                                            }
                                                            var87.method3427();
                                                        }
                                                    }
                                                    field1051++;
                                                    if (field1051 > 50) {
                                                        field958.method3195(72);
                                                    }
                                                    try {
                                                        if (Statics.field1868 != null && field958.field2402 > 0) {
                                                            Statics.field1868.method2791(field958.field2403, 0, field958.field2402);
                                                            field958.field2402 = 0;
                                                            field1051 = 0;
                                                        }
                                                    } catch (IOException var89) {
                                                        method545();
                                                    }
                                                    return;
                                                }
                                                var54 = var53.field830;
                                                if (var54.field2669 < 0) {
                                                    break;
                                                }
                                                var55 = class220.method2339(var54.field2693);
                                            } while (var55 == null || var55.field2770 == null || var54.field2669 >= var55.field2770.length || var55.field2770[var54.field2669] != var54);
                                            class84.method152(var53);
                                        }
                                    }
                                    var51 = var50.field830;
                                    if (var51.field2669 < 0) {
                                        break;
                                    }
                                    var52 = class220.method2339(var51.field2693);
                                } while (var52 == null || var52.field2770 == null || var51.field2669 >= var52.field2770.length || var52.field2770[var51.field2669] != var51);
                                class84.method152(var50);
                            }
                        }
                        var48 = var47.field830;
                        if (var48.field2669 < 0) {
                            break;
                        }
                        var49 = class220.method2339(var48.field2693);
                    } while (var49 == null || var49.field2770 == null || var48.field2669 >= var49.field2770.length || var49.field2770[var48.field2669] != var48);
                    class84.method152(var47);
                }
            }
            field958.method3195(94);
            field958.method3129(0);
            int var4 = field958.field2402;
            class284.method1640(field958);
            field958.method2954(field958.field2402 - var4);
        }
    }

    @ObfuscatedName("ap.ek(I)V")
    public static final void method212() {
        if (Statics.field2821 != null) {
            Statics.field2821.method1888();
        }
        if (Statics.field2836 != null) {
            Statics.field2836.method1888();
        }
    }

    @ObfuscatedName("ce.ef(B)V")
    public static final void method1653() {
        for (int var0 = 0; var0 < field1045; var0++) {
            int var10002 = field1159[var0]--;
            if (field1159[var0] >= -10) {
                class106 var2 = field1161[var0];
                if (var2 == null) {
                    class106 var10000 = (class106) null;
                    var2 = class106.method1822(Statics.field582, field1157[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field1159[var0] += var2.method1823();
                    field1161[var0] = var2;
                }
                if (field1159[var0] < 0) {
                    int var9;
                    if (field1160[var0] == 0) {
                        var9 = field1154;
                    } else {
                        int var3 = (field1160[var0] & 0xFF) * 128;
                        int var4 = field1160[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field300.field1282;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field1160[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field300.field1225;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field1159[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field1155 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class108 var10 = var2.method1821().method1864(Statics.field248);
                        class118 var11 = class118.method1991(var10, 100, var9);
                        var11.method2072(field1087[var0] - 1);
                        Statics.field283.method1800(var11);
                    }
                    field1159[var0] = -100;
                }
            } else {
                field1045--;
                for (int var1 = var0; var1 < field1045; var1++) {
                    field1157[var1] = field1157[var1 + 1];
                    field1161[var1] = field1161[var1 + 1];
                    field1087[var1] = field1087[var1 + 1];
                    field1159[var1] = field1159[var1 + 1];
                    field1160[var1] = field1160[var1 + 1];
                }
                var0--;
            }
        }
        if (field1119 && !class207.method1940()) {
            if (field1151 != 0 && field1152 != -1) {
                class207.method1045(Statics.field666, field1152, 0, field1151, false);
            }
            field1119 = false;
        }
    }

    @ObfuscatedName("fi.fa(Ljw;IIII)V")
    public static void method2814(class264 arg0, int arg1, int arg2, int arg3) {
        if (field1045 >= 50 || field1155 == 0 || arg0.field3623 == null || arg1 >= arg0.field3623.length) {
            return;
        }
        int var4 = arg0.field3623[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1157[field1045] = var5;
        field1087[field1045] = var6;
        field1159[field1045] = 0;
        field1161[field1045] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1160[field1045] = (var8 << 16) + (var9 << 8) + var7;
        field1045++;
    }

    @ObfuscatedName("io.ft(I)V")
    public static final void method3828() {
        if (Statics.field2342 == field1143) {
            return;
        }
        field1143 = Statics.field2342;
        int var0 = Statics.field2342;
        int[] var1 = Statics.field875.field3801;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field750[var0][var6][var4] & 0x18) == 0) {
                    Statics.field1498.method2545(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class62.field750[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1498.method2545(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field875.method4766();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field750[var0][var10][var9] & 0x18) == 0) {
                    method680(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class62.field750[var0 + 1][var10][var9] & 0x8) != 0) {
                    method680(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1004 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1498.method2586(Statics.field2342, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class259.method653(var14).field3475;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field1053[Statics.field2342].field2305;
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
                        field1147[field1004] = Statics.field3305[var15].method4007(false);
                        field1145[field1004] = var16;
                        field1146[field1004] = var17;
                        field1004++;
                    }
                }
            }
        }
        Statics.field715.method4735();
    }

    @ObfuscatedName("fx.fr(Lhe;III)V")
    public static final void method2934(class220 arg0, int arg1, int arg2) {
        if (field1054 != 0 && field1054 != 3 || class60.field735 != 1 && Statics.field242 || class60.field735 != 4) {
            return;
        }
        class214 var3 = arg0.method3747(true);
        if (var3 == null) {
            return;
        }
        int var4 = class60.field736 - arg1;
        int var5 = class60.field724 - arg2;
        if (!var3.method3676(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2618 / 2;
        int var7 = var5 - var3.field2617 / 2;
        int var8 = field987 + field1000 & 0x7FF;
        int var9 = class137.field2034[var8];
        int var10 = class137.field2019[var8];
        int var11 = (field994 + 256) * var9 >> 8;
        int var12 = (field994 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field300.field1282 + var13 >> 7;
        int var16 = Statics.field300.field1225 - var14 >> 7;
        field958.method3195(115);
        field958.method3129(18);
        field958.method2951(Statics.field617 + var16);
        field958.method2998(Statics.field590 + var15);
        field958.method2997(class51.field629[82] ? (class51.field629[81] ? 2 : 1) : 0);
        field958.method3129(var6);
        field958.method3129(var7);
        field958.method2951(field1000);
        field958.method3129(57);
        field958.method3129(field987);
        field958.method3129(field994);
        field958.method3129(89);
        field958.method2951(Statics.field300.field1282);
        field958.method2951(Statics.field300.field1225);
        field958.method3129(63);
        field1148 = var15;
        field999 = var16;
    }

    @ObfuscatedName("bq.fi(I)V")
    public static final void method1393() {
        int[] var0 = class97.field1491;
        for (int var1 = 0; var1 < class97.field1488; var1++) {
            class75 var2 = field970[var0[var1]];
            if (var2 != null && var2.field1251 > 0) {
                var2.field1251--;
                if (var2.field1251 == 0) {
                    var2.field1237 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field954; var3++) {
            int var4 = field955[var3];
            class87 var5 = field953[var4];
            if (var5 != null && var5.field1251 > 0) {
                var5.field1251--;
                if (var5.field1251 == 0) {
                    var5.field1237 = null;
                }
            }
        }
    }

    @ObfuscatedName("al.fq(Ljava/lang/String;I)V")
    public static final void method615(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1375.field1314 = !Statics.field1375.field1314;
            class82.method221();
            if (Statics.field1375.field1314) {
                class99.method968(99, "", "Roofs are now all hidden");
            } else {
                class99.method968(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field932 = !field932;
        }
        if (arg0.equalsIgnoreCase("clickbox")) {
            class134.field1980 = !class134.field1980;
            class99.method968(99, "", "Clickbox Mode: " + (class134.field1980 ? "AABB" : "Legacy"));
        }
        if (field1083 >= 2) {
            if (arg0.equalsIgnoreCase("aabb")) {
                if (!class8.field235) {
                    class8.field235 = true;
                    class8.field233 = class12.field279;
                    class99.method968(99, "", "AABB boxes: All");
                } else if (class8.field233 == class12.field279) {
                    class8.field235 = true;
                    class8.field233 = class12.field270;
                    class99.method968(99, "", "AABB boxes: Mouse Over");
                } else {
                    class8.field235 = false;
                    class99.method968(99, "", "AABB boxes: Off");
                }
            }
            if (arg0.equalsIgnoreCase("legacyboxes")) {
                class8.field234 = !class8.field234;
                class99.method968(99, "", "Show legacy boxes: " + class8.field234);
            }
            if (arg0.equalsIgnoreCase("geotests")) {
                class8.field232 = !class8.field232;
                class99.method968(99, "", "Show geometry tests: " + class8.field232);
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field932 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field932 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method545();
            }
            if (arg0.equalsIgnoreCase("errortest") && field920 == 2) {
                throw new RuntimeException();
            }
        }
        field958.method3195(57);
        field958.method3129(arg0.length() + 1);
        field958.method2956(arg0);
    }

    @ObfuscatedName("bv.fh(I)V")
    public static final void method682() {
        int var0 = field980 + Statics.field300.field1282;
        int var1 = field1049 + Statics.field300.field1225;
        if (Statics.field565 - var0 < -500 || Statics.field565 - var0 > 500 || Statics.field669 - var1 < -500 || Statics.field669 - var1 > 500) {
            Statics.field565 = var0;
            Statics.field669 = var1;
        }
        if (Statics.field565 != var0) {
            Statics.field565 += (var0 - Statics.field565) / 16;
        }
        if (Statics.field669 != var1) {
            Statics.field669 += (var1 - Statics.field669) / 16;
        }
        if (class60.field728 == 4 && Statics.field242) {
            int var2 = class60.field738 - field923;
            field1002 = var2 * 2;
            field923 = var2 == -1 || var2 == 1 ? class60.field738 : (field923 + class60.field738) / 2;
            int var3 = field1003 - class60.field742;
            field1001 = var3 * 2;
            field1003 = var3 == -1 || var3 == 1 ? class60.field742 : (field1003 + class60.field742) / 2;
        } else {
            if (class51.field629[96]) {
                field1001 += (-24 - field1001) / 2;
            } else if (class51.field629[97]) {
                field1001 += (24 - field1001) / 2;
            } else {
                field1001 /= 2;
            }
            if (class51.field629[98]) {
                field1002 += (12 - field1002) / 2;
            } else if (class51.field629[99]) {
                field1002 += (-12 - field1002) / 2;
            } else {
                field1002 /= 2;
            }
            field923 = class60.field738;
            field1003 = class60.field742;
        }
        field1000 = field1001 / 2 + field1000 & 0x7FF;
        field971 += field1002 / 2;
        if (field971 < 128) {
            field971 = 128;
        }
        if (field971 > 383) {
            field971 = 383;
        }
        int var4 = Statics.field565 >> 7;
        int var5 = Statics.field669 >> 7;
        int var6 = method971(Statics.field565, Statics.field669, Statics.field2342);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field2342;
                    if (var10 < 3 && (class62.field750[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class62.field756[var10][var8][var9];
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
        if (var12 > field1055) {
            field1055 += (var12 - field1055) / 24;
        } else if (var12 < field1055) {
            field1055 += (var12 - field1055) / 80;
        }
    }

    @ObfuscatedName("bl.fe(S)V")
    public static final void method714() {
        for (int var0 = 0; var0 < field954; var0++) {
            int var1 = field955[var0];
            class87 var2 = field953[var1];
            if (var2 != null) {
                method96(var2, var2.field1374.field3581);
            }
        }
    }

    @ObfuscatedName("r.fw(Lcy;IB)V")
    public static final void method96(class79 arg0, int arg1) {
        if (arg0.field1270 > field948) {
            method991(arg0);
        } else if (arg0.field1240 >= field948) {
            if (field948 == arg0.field1240 || arg0.field1256 == -1 || arg0.field1266 != 0 || arg0.field1258 + 1 > class264.method341(arg0.field1256).field3631[arg0.field1241]) {
                int var2 = arg0.field1240 - arg0.field1270;
                int var3 = field948 - arg0.field1270;
                int var4 = arg0.field1271 * 64 + arg0.field1261 * 128;
                int var5 = arg0.field1271 * 64 + arg0.field1248 * 128;
                int var6 = arg0.field1271 * 64 + arg0.field1267 * 128;
                int var7 = arg0.field1271 * 64 + arg0.field1224 * 128;
                arg0.field1282 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field1225 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field1228 = 0;
            arg0.field1275 = arg0.field1272;
            arg0.field1226 = arg0.field1275;
        } else {
            method4459(arg0);
        }
        if (arg0.field1282 < 128 || arg0.field1225 < 128 || arg0.field1282 >= 13184 || arg0.field1225 >= 13184) {
            arg0.field1256 = -1;
            arg0.field1254 = -1;
            arg0.field1270 = 0;
            arg0.field1240 = 0;
            arg0.field1282 = arg0.field1279[0] * 128 + arg0.field1271 * 64;
            arg0.field1225 = arg0.field1280[0] * 128 + arg0.field1271 * 64;
            arg0.method1394();
        }
        if (Statics.field300 == arg0 && (arg0.field1282 < 1536 || arg0.field1225 < 1536 || arg0.field1282 >= 11776 || arg0.field1225 >= 11776)) {
            arg0.field1256 = -1;
            arg0.field1254 = -1;
            arg0.field1270 = 0;
            arg0.field1240 = 0;
            arg0.field1282 = arg0.field1279[0] * 128 + arg0.field1271 * 64;
            arg0.field1225 = arg0.field1280[0] * 128 + arg0.field1271 * 64;
            arg0.method1394();
        }
        if (arg0.field1269 != 0) {
            if (arg0.field1250 != -1) {
                class79 var8 = null;
                if (arg0.field1250 < 32768) {
                    var8 = field953[arg0.field1250];
                } else if (arg0.field1250 >= 32768) {
                    var8 = field970[arg0.field1250 - 32768];
                }
                if (var8 != null) {
                    int var9 = arg0.field1282 - var8.field1282;
                    int var10 = arg0.field1225 - var8.field1225;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field1275 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1257) {
                    arg0.field1250 = -1;
                    arg0.field1257 = false;
                }
            }
            if (arg0.field1234 != -1 && (arg0.field1278 == 0 || arg0.field1228 > 0)) {
                arg0.field1275 = arg0.field1234;
                arg0.field1234 = -1;
            }
            int var11 = arg0.field1275 - arg0.field1226 & 0x7FF;
            if (var11 == 0 && arg0.field1257) {
                arg0.field1250 = -1;
                arg0.field1257 = false;
            }
            if (var11 == 0) {
                arg0.field1276 = 0;
            } else {
                arg0.field1276++;
                if (var11 > 1024) {
                    arg0.field1226 -= arg0.field1269;
                    boolean var12 = true;
                    if (var11 < arg0.field1269 || var11 > 2048 - arg0.field1269) {
                        arg0.field1226 = arg0.field1275;
                        var12 = false;
                    }
                    if (arg0.field1253 == arg0.field1229 && (arg0.field1276 > 25 || var12)) {
                        if (arg0.field1230 == -1) {
                            arg0.field1253 = arg0.field1232;
                        } else {
                            arg0.field1253 = arg0.field1230;
                        }
                    }
                } else {
                    arg0.field1226 += arg0.field1269;
                    boolean var13 = true;
                    if (var11 < arg0.field1269 || var11 > 2048 - arg0.field1269) {
                        arg0.field1226 = arg0.field1275;
                        var13 = false;
                    }
                    if (arg0.field1253 == arg0.field1229 && (arg0.field1276 > 25 || var13)) {
                        if (arg0.field1242 == -1) {
                            arg0.field1253 = arg0.field1232;
                        } else {
                            arg0.field1253 = arg0.field1242;
                        }
                    }
                }
                arg0.field1226 &= 0x7FF;
            }
        }
        method3(arg0);
    }

    @ObfuscatedName("bb.fb(Lcy;B)V")
    public static final void method991(class79 arg0) {
        int var1 = arg0.field1270 - field948;
        int var2 = arg0.field1271 * 64 + arg0.field1261 * 128;
        int var3 = arg0.field1271 * 64 + arg0.field1248 * 128;
        arg0.field1282 += (var2 - arg0.field1282) / var1;
        arg0.field1225 += (var3 - arg0.field1225) / var1;
        arg0.field1228 = 0;
        arg0.field1275 = arg0.field1272;
    }

    @ObfuscatedName("jw.fm(Lcy;I)V")
    public static final void method4459(class79 arg0) {
        arg0.field1253 = arg0.field1229;
        if (arg0.field1278 == 0) {
            arg0.field1228 = 0;
            return;
        }
        if (arg0.field1256 != -1 && arg0.field1266 == 0) {
            class264 var1 = class264.method341(arg0.field1256);
            if (arg0.field1283 > 0 && var1.field3615 == 0) {
                arg0.field1228++;
                return;
            }
            if (arg0.field1283 <= 0 && var1.field3629 == 0) {
                arg0.field1228++;
                return;
            }
        }
        int var2 = arg0.field1282;
        int var3 = arg0.field1225;
        int var4 = arg0.field1279[arg0.field1278 - 1] * 128 + arg0.field1271 * 64;
        int var5 = arg0.field1280[arg0.field1278 - 1] * 128 + arg0.field1271 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1275 = 1280;
            } else if (var3 > var5) {
                arg0.field1275 = 1792;
            } else {
                arg0.field1275 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1275 = 768;
            } else if (var3 > var5) {
                arg0.field1275 = 256;
            } else {
                arg0.field1275 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1275 = 1024;
        } else if (var3 > var5) {
            arg0.field1275 = 0;
        }
        byte var6 = arg0.field1235[arg0.field1278 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1282 = var4;
            arg0.field1225 = var5;
            arg0.field1278--;
            if (arg0.field1283 > 0) {
                arg0.field1283--;
            }
            return;
        }
        int var7 = arg0.field1275 - arg0.field1226 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1233;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1232;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1239;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1268;
        }
        if (var8 == -1) {
            var8 = arg0.field1232;
        }
        arg0.field1253 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class87) {
            var10 = ((class87) arg0).field1374.field3594;
        }
        if (var10) {
            if (arg0.field1275 != arg0.field1226 && arg0.field1250 == -1 && arg0.field1269 != 0) {
                var9 = 2;
            }
            if (arg0.field1278 > 2) {
                var9 = 6;
            }
            if (arg0.field1278 > 3) {
                var9 = 8;
            }
            if (arg0.field1228 > 0 && arg0.field1278 > 1) {
                var9 = 8;
                arg0.field1228--;
            }
        } else {
            if (arg0.field1278 > 1) {
                var9 = 6;
            }
            if (arg0.field1278 > 2) {
                var9 = 8;
            }
            if (arg0.field1228 > 0 && arg0.field1278 > 1) {
                var9 = 8;
                arg0.field1228--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1253 == arg0.field1232 && arg0.field1236 != -1) {
            arg0.field1253 = arg0.field1236;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1282 += var9;
                if (arg0.field1282 > var4) {
                    arg0.field1282 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1282 -= var9;
                if (arg0.field1282 < var4) {
                    arg0.field1282 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1225 += var9;
                if (arg0.field1225 > var5) {
                    arg0.field1225 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1225 -= var9;
                if (arg0.field1225 < var5) {
                    arg0.field1225 = var5;
                }
            }
        }
        if (arg0.field1282 == var4 && arg0.field1225 == var5) {
            arg0.field1278--;
            if (arg0.field1283 > 0) {
                arg0.field1283--;
            }
        }
    }

    @ObfuscatedName("f.fz(Lcy;S)V")
    public static final void method3(class79 arg0) {
        arg0.field1227 = false;
        if (arg0.field1253 != -1) {
            class264 var1 = class264.method341(arg0.field1253);
            if (var1 == null || var1.field3620 == null) {
                arg0.field1253 = -1;
            } else {
                arg0.field1255++;
                if (arg0.field1252 < var1.field3620.length && arg0.field1255 > var1.field3631[arg0.field1252]) {
                    arg0.field1255 = 1;
                    arg0.field1252++;
                    method2814(var1, arg0.field1252, arg0.field1282, arg0.field1225);
                }
                if (arg0.field1252 >= var1.field3620.length) {
                    arg0.field1255 = 0;
                    arg0.field1252 = 0;
                    method2814(var1, arg0.field1252, arg0.field1282, arg0.field1225);
                }
            }
        }
        if (arg0.field1254 != -1 && field948 >= arg0.field1264) {
            if (arg0.field1262 < 0) {
                arg0.field1262 = 0;
            }
            int var2 = class249.method3835(arg0.field1254).field3338;
            if (var2 == -1) {
                arg0.field1254 = -1;
            } else {
                class264 var3 = class264.method341(var2);
                if (var3 == null || var3.field3620 == null) {
                    arg0.field1254 = -1;
                } else {
                    arg0.field1231++;
                    if (arg0.field1262 < var3.field3620.length && arg0.field1231 > var3.field3631[arg0.field1262]) {
                        arg0.field1231 = 1;
                        arg0.field1262++;
                        method2814(var3, arg0.field1262, arg0.field1282, arg0.field1225);
                    }
                    if (arg0.field1262 >= var3.field3620.length && (arg0.field1262 < 0 || arg0.field1262 >= var3.field3620.length)) {
                        arg0.field1254 = -1;
                    }
                }
            }
        }
        if (arg0.field1256 != -1 && arg0.field1266 <= 1) {
            class264 var4 = class264.method341(arg0.field1256);
            if (var4.field3615 == 1 && arg0.field1283 > 0 && arg0.field1270 <= field948 && arg0.field1240 < field948) {
                arg0.field1266 = 1;
                return;
            }
        }
        if (arg0.field1256 != -1 && arg0.field1266 == 0) {
            class264 var5 = class264.method341(arg0.field1256);
            if (var5 == null || var5.field3620 == null) {
                arg0.field1256 = -1;
            } else {
                arg0.field1258++;
                if (arg0.field1241 < var5.field3620.length && arg0.field1258 > var5.field3631[arg0.field1241]) {
                    arg0.field1258 = 1;
                    arg0.field1241++;
                    method2814(var5, arg0.field1241, arg0.field1282, arg0.field1225);
                }
                if (arg0.field1241 >= var5.field3620.length) {
                    arg0.field1241 -= var5.field3624;
                    arg0.field1260++;
                    if (arg0.field1260 >= var5.field3630) {
                        arg0.field1256 = -1;
                    } else if (arg0.field1241 >= 0 && arg0.field1241 < var5.field3620.length) {
                        method2814(var5, arg0.field1241, arg0.field1282, arg0.field1225);
                    } else {
                        arg0.field1256 = -1;
                    }
                }
                arg0.field1227 = var5.field3626;
            }
        }
        if (arg0.field1266 > 0) {
            arg0.field1266--;
        }
    }

    @ObfuscatedName("by.fl(Lbo;III)V")
    public static void method948(class75 arg0, int arg1, int arg2) {
        if (arg0.field1256 == arg1 && arg1 != -1) {
            int var3 = class264.method341(arg1).field3633;
            if (var3 == 1) {
                arg0.field1241 = 0;
                arg0.field1258 = 0;
                arg0.field1266 = arg2;
                arg0.field1260 = 0;
            }
            if (var3 == 2) {
                arg0.field1260 = 0;
            }
        } else if (arg1 == -1 || arg0.field1256 == -1 || class264.method341(arg1).field3617 >= class264.method341(arg0.field1256).field3617) {
            arg0.field1256 = arg1;
            arg0.field1241 = 0;
            arg0.field1258 = 0;
            arg0.field1266 = arg2;
            arg0.field1260 = 0;
            arg0.field1283 = arg0.field1278;
        }
    }

    @ObfuscatedName("bw.fo(I)I")
    public static int method954() {
        return field1130 ? 2 : 1;
    }

    @ObfuscatedName("ee.ff(IS)V")
    public static void method2698(int arg0) {
        field1188 = 0L;
        if (arg0 >= 2) {
            field1130 = true;
        } else {
            field1130 = false;
        }
        int var1 = field1130 ? 2 : 1;
        if (var1 == 1) {
            Statics.field336.method839(765, 503);
        } else {
            Statics.field336.method839(7680, 2160);
        }
        if (field1175 >= 25) {
            method1470();
        }
    }

    @ObfuscatedName("cu.fj(I)V")
    public static void method1470() {
        field958.method3195(126);
        class183 var0 = field958;
        int var1 = field1130 ? 2 : 1;
        var0.method3129(var1);
        field958.method2951(Statics.field35);
        field958.method2951(Statics.field806);
    }

    @ObfuscatedName("client.l(B)V")
    public final void method870() {
        field1188 = class179.method3585() + 500L;
        this.method1053();
        if (field1076 != -1) {
            this.method1046(true);
        }
    }

    @ObfuscatedName("client.fp(I)V")
    public void method1053() {
        int var1 = Statics.field35;
        int var2 = Statics.field806;
        if (this.field700 < var1) {
            int var3 = this.field700;
        }
        if (this.field701 < var2) {
            int var4 = this.field701;
        }
        if (Statics.field1375 == null) {
            return;
        }
        try {
            client var5 = Statics.field336;
            Object[] var6 = new Object[] { method954() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.fx(I)V")
    public final void method1054() {
        if (field1076 != -1) {
            method654(field1076);
        }
        for (int var1 = 0; var1 < field921; var1++) {
            if (field1121[var1]) {
                field1122[var1] = true;
            }
            field1125[var1] = field1121[var1];
            field1121[var1] = false;
        }
        field1120 = field948;
        field1065 = -1;
        field1066 = -1;
        Statics.field1872 = null;
        if (field1076 != -1) {
            field921 = 0;
            method6(field1076, 0, 0, Statics.field35, Statics.field806, 0, 0, -1);
        }
        class285.method4707();
        if (field1108) {
            int var2 = Statics.field2849;
            int var3 = Statics.field39;
            int var4 = Statics.field2656;
            int var5 = Statics.field1678;
            int var6 = 6116423;
            class285.method4701(var2, var3, var4, var5, var6);
            class285.method4701(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class285.method4734(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field2460.method4503(class229.field2920, var2 + 3, var3 + 14, var6, -1);
            int var7 = class60.field742;
            int var8 = class60.field738;
            for (int var9 = 0; var9 < field957; var9++) {
                int var10 = (field957 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                Statics.field2460.method4503(method490(var9), var2 + 3, var10, var11, 0);
            }
            int var12 = Statics.field2849;
            int var13 = Statics.field39;
            int var14 = Statics.field2656;
            int var15 = Statics.field1678;
            for (int var16 = 0; var16 < field921; var16++) {
                if (field1126[var16] + field1124[var16] > var12 && field1124[var16] < var12 + var14 && field1144[var16] + field1096[var16] > var13 && field1144[var16] < var13 + var15) {
                    field1122[var16] = true;
                }
            }
        } else if (field1065 != -1) {
            method1043(field1065, field1066);
        }
        if (field1128 == 3) {
            for (int var17 = 0; var17 < field921; var17++) {
                if (field1125[var17]) {
                    class285.method4662(field1124[var17], field1144[var17], field1126[var17], field1096[var17], 16711935, 128);
                } else if (field1122[var17]) {
                    class285.method4662(field1124[var17], field1144[var17], field1126[var17], field1096[var17], 16711680, 128);
                }
            }
        }
        class83.method541(Statics.field2342, Statics.field300.field1282, Statics.field300.field1225, field992);
        field992 = 0;
    }

    @ObfuscatedName("ei.fv(Ljava/lang/String;ZI)V")
    public static final void method2742(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field269.method4484(arg0, 250);
        int var6 = Statics.field269.method4485(arg0, 250) * 13;
        class285.method4701(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class285.method4734(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field269.method4491(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method247(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field715.method731(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field921; var11++) {
            if (field1126[var11] + field1124[var11] > var7 && field1124[var11] < var7 + var9 && field1144[var11] + field1096[var11] > var8 && field1144[var11] < var8 + var10) {
                field1122[var11] = true;
            }
        }
    }

    @ObfuscatedName("bl.fk(IIIIZI)V")
    public static final void method705(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1038 - field1168) * var5 / 100 + field1168;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1174) {
            short var8 = field1174;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1173) {
                var6 = field1173;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class285.method4707();
                    class285.method4701(arg0, arg1, var10, arg3, -16777216);
                    class285.method4701(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field928) {
            short var11 = field928;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field974) {
                var6 = field974;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class285.method4707();
                    class285.method4701(arg0, arg1, arg2, var13, -16777216);
                    class285.method4701(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1171 - field1170) * var5 / 100 + field1170;
        field1180 = arg3 * var6 * var14 / 85504 << 1;
        if (field1178 != arg2 || field1179 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class137.field2034[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class140.method2556(var15, 500, 800, arg2, arg3);
        }
        field1176 = arg0;
        field1177 = arg1;
        field1178 = arg2;
        field1179 = arg3;
    }

    @ObfuscatedName("bt.fg(Lbm;I)V")
    public static final void method1001(class67 arg0) {
        if (Statics.field300.field1282 >> 7 == field1148 && Statics.field300.field1225 >> 7 == field999) {
            field1148 = 0;
        }
        int var1 = class97.field1488;
        int[] var2 = class97.field1491;
        int var3 = var1;
        if (class67.field803 == arg0 || class67.field804 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class75 var5;
            int var6;
            if (class67.field803 == arg0) {
                var5 = Statics.field300;
                var6 = Statics.field300.field902 << 14;
            } else if (class67.field804 == arg0) {
                var5 = field970[field1190];
                var6 = field1190 << 14;
            } else {
                var5 = field970[var2[var4]];
                var6 = var2[var4] << 14;
                if (class67.field809 == arg0 && field1190 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method1014() && !var5.field900) {
                var5.field886 = false;
                if ((field1082 && var1 > 50 || var1 > 200) && class67.field803 != arg0 && var5.field1253 == var5.field1229) {
                    var5.field886 = true;
                }
                int var7 = var5.field1282 >> 7;
                int var8 = var5.field1225 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field893 == null || field948 < var5.field888 || field948 >= var5.field889) {
                        if ((var5.field1282 & 0x7F) == 64 && (var5.field1225 & 0x7F) == 64) {
                            if (field1020 == field968[var7][var8]) {
                                continue;
                            }
                            field968[var7][var8] = field1020;
                        }
                        var5.field899 = method971(var5.field1282, var5.field1225, Statics.field2342);
                        Statics.field1498.method2669(Statics.field2342, var5.field1282, var5.field1225, var5.field899, 60, var5, var5.field1226, var6, var5.field1227);
                    } else {
                        var5.field886 = false;
                        var5.field899 = method971(var5.field1282, var5.field1225, Statics.field2342);
                        Statics.field1498.method2534(Statics.field2342, var5.field1282, var5.field1225, var5.field899, 60, var5, var5.field1226, var6, var5.field901, var5.field895, var5.field896, var5.field897);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bs.fs(ZI)V")
    public static final void method907(boolean arg0) {
        for (int var1 = 0; var1 < field954; var1++) {
            class87 var2 = field953[field955[var1]];
            int var3 = (field955[var1] << 14) + 536870912;
            if (var2 != null && var2.method1014() && var2.field1374.field3589 == arg0 && var2.field1374.method4368()) {
                int var4 = var2.field1282 >> 7;
                int var5 = var2.field1225 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1271 == 1 && (var2.field1282 & 0x7F) == 64 && (var2.field1225 & 0x7F) == 64) {
                        if (field1020 == field968[var4][var5]) {
                            continue;
                        }
                        field968[var4][var5] = field1020;
                    }
                    if (!var2.field1374.field3597) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1498.method2669(Statics.field2342, var2.field1282, var2.field1225, method971(var2.field1282 + (var2.field1271 * 64 - 64), var2.field1225 + (var2.field1271 * 64 - 64), Statics.field2342), var2.field1271 * 64 - 64 + 60, var2, var2.field1226, var3, var2.field1227);
                }
            }
        }
    }

    @ObfuscatedName("bd.fu(I)V")
    public static final void method969() {
        for (class85 var0 = (class85) field1185.method3389(); var0 != null; var0 = (class85) field1185.method3385()) {
            if (Statics.field2342 != var0.field1360 || var0.field1361) {
                var0.method3372();
            } else if (field948 >= var0.field1362) {
                var0.method1551(field992);
                if (var0.field1361) {
                    var0.method3372();
                } else {
                    Statics.field1498.method2669(var0.field1360, var0.field1358, var0.field1355, var0.field1357, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("dz.fy(I)I")
    public static final int method1956() {
        if (Statics.field1375.field1314) {
            return Statics.field2342;
        } else {
            int var0 = method971(Statics.field1520, Statics.field271, Statics.field2342);
            return var0 - Statics.field740 >= 800 || (class62.field750[Statics.field2342][Statics.field1520 >> 7][Statics.field271 >> 7] & 0x4) == 0 ? 3 : Statics.field2342;
        }
    }

    @ObfuscatedName("ag.fc(Lcy;IIIIIB)V")
    public static final void method467(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1014()) {
            return;
        }
        if (arg0 instanceof class87) {
            class262 var6 = ((class87) arg0).field1374;
            if (var6.field3588 != null) {
                var6 = var6.method4388();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class97.field1488;
        int[] var8 = class97.field1491;
        int var9 = 3;
        if (!arg0.field1244.method3351()) {
            method540(arg0, arg0.field1274 + 15);
            for (class86 var10 = (class86) arg0.field1244.method3352(); var10 != null; var10 = (class86) arg0.field1244.method3367()) {
                class80 var11 = var10.method1559(field948);
                if (var11 != null) {
                    class252 var12 = var10.field1366;
                    class289 var13 = var12.method4123();
                    class289 var14 = var12.method4130();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3388;
                    } else {
                        if (var12.field3382 * 2 < var14.field3791) {
                            var15 = var12.field3382;
                        }
                        var16 = var14.field3791 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field948 - var11.field1286;
                    int var20 = var11.field1288 * var16 / var12.field3388;
                    int var23;
                    if (var11.field1289 > var19) {
                        int var21 = var12.field3384 == 0 ? 0 : var19 / var12.field3384 * var12.field3384;
                        int var22 = var11.field1287 * var16 / var12.field3388;
                        var23 = (var20 - var22) * var21 / var11.field1289 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1289 + var12.field3375 - var19;
                        if (var12.field3383 >= 0) {
                            var17 = (var24 << 8) / (var12.field3375 - var12.field3383);
                        }
                    }
                    if (var11.field1288 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field977 + arg2 - (var16 >> 1);
                    int var26 = field1022 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field977 > -1) {
                            class285.method4701(var25, var26, var23, 5, 65280);
                            class285.method4701(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3792;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4820(var27, var26, var17);
                            class285.method4656(var27, var26, var27 + var28, var26 + var29);
                            var14.method4820(var27, var26, var17);
                        } else {
                            var13.method4795(var27, var26);
                            class285.method4656(var27, var26, var27 + var28, var26 + var29);
                            var14.method4795(var27, var26);
                        }
                        class285.method4655(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1560()) {
                    var10.method3372();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class75 var30 = (class75) arg0;
            if (var30.field900) {
                return;
            }
            if (var30.field881 != -1 || var30.field879 != -1) {
                method540(arg0, arg0.field1274 + 15);
                if (field977 > -1) {
                    if (var30.field881 != -1) {
                        Statics.field843[var30.field881].method4795(field977 + arg2 - 12, field1022 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field879 != -1) {
                        Statics.field658[var30.field879].method4795(field977 + arg2 - 12, field1022 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field934 == 10 && field936 == var8[arg1]) {
                method540(arg0, arg0.field1274 + 15);
                if (field977 > -1) {
                    Statics.field1209[1].method4795(field977 + arg2 - 12, field1022 + arg3 - var9);
                }
            }
        } else {
            class262 var31 = ((class87) arg0).field1374;
            if (var31.field3588 != null) {
                var31 = var31.method4388();
            }
            if (var31.field3566 >= 0 && var31.field3566 < Statics.field658.length) {
                method540(arg0, arg0.field1274 + 15);
                if (field977 > -1) {
                    Statics.field658[var31.field3566].method4795(field977 + arg2 - 12, field1022 + arg3 - 30);
                }
            }
            if (field934 == 1 && field935 == field955[arg1 - var7] && field948 % 20 < 10) {
                method540(arg0, arg0.field1274 + 15);
                if (field977 > -1) {
                    Statics.field1209[0].method4795(field977 + arg2 - 12, field1022 + arg3 - 28);
                }
            }
        }
        if (arg0.field1237 != null && (arg1 >= var7 || !arg0.field1245 && (field943 == 4 || !arg0.field1238 && (field943 == 0 || field943 == 3 || field943 == 1 && method470(((class75) arg0).field891, false))))) {
            method540(arg0, arg0.field1274);
            if (field977 > -1 && field1009 < field1010) {
                field1014[field1009] = Statics.field2460.method4487(arg0.field1237) / 2;
                field1182[field1009] = Statics.field2460.field3659;
                field1011[field1009] = field977;
                field1012[field1009] = field1022;
                field922[field1009] = arg0.field1263;
                field1016[field1009] = arg0.field1281;
                field1017[field1009] = arg0.field1251;
                field1018[field1009] = arg0.field1237;
                field1009++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1246[var32];
            int var34 = arg0.field1277[var32];
            class258 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field948) {
                    continue;
                }
                var35 = class258.method1406(arg0.field1277[var32]);
                var36 = var35.field3430;
                if (var35 != null && var35.field3441 != null) {
                    var35 = var35.method4208();
                    if (var35 == null) {
                        arg0.field1246[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1247[var32];
            class258 var38 = null;
            if (var37 >= 0) {
                var38 = class258.method1406(var37);
                if (var38 != null && var38.field3441 != null) {
                    var38 = var38.method4208();
                }
            }
            if (var33 - var36 <= field948) {
                if (var35 == null) {
                    arg0.field1246[var32] = -1;
                } else {
                    method540(arg0, arg0.field1274 / 2);
                    if (field977 > -1) {
                        if (var32 == 1) {
                            field1022 -= 20;
                        }
                        if (var32 == 2) {
                            field977 -= 15;
                            field1022 -= 10;
                        }
                        if (var32 == 3) {
                            field977 += 15;
                            field1022 -= 10;
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
                        class289 var51 = null;
                        class289 var52 = null;
                        class289 var53 = null;
                        class289 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class289 var64 = var35.method4222();
                        if (var64 != null) {
                            var43 = var64.field3791;
                            int var65 = var64.field3792;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3793;
                        }
                        class289 var66 = var35.method4235();
                        if (var66 != null) {
                            var44 = var66.field3791;
                            int var67 = var66.field3792;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3793;
                        }
                        class289 var68 = var35.method4223();
                        if (var68 != null) {
                            var45 = var68.field3791;
                            int var69 = var68.field3792;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3793;
                        }
                        class289 var70 = var35.method4230();
                        if (var70 != null) {
                            var46 = var70.field3791;
                            int var71 = var70.field3792;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3793;
                        }
                        if (var38 != null) {
                            var51 = var38.method4222();
                            if (var51 != null) {
                                var55 = var51.field3791;
                                int var72 = var51.field3792;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3793;
                            }
                            var52 = var38.method4235();
                            if (var52 != null) {
                                var56 = var52.field3791;
                                int var73 = var52.field3792;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3793;
                            }
                            var53 = var38.method4223();
                            if (var53 != null) {
                                var57 = var53.field3791;
                                int var74 = var53.field3792;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3793;
                            }
                            var54 = var38.method4230();
                            if (var54 != null) {
                                var58 = var54.field3791;
                                int var75 = var54.field3792;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3793;
                            }
                        }
                        class267 var76 = var35.method4213();
                        if (var76 == null) {
                            var76 = Statics.field603;
                        }
                        class267 var77;
                        if (var38 == null) {
                            var77 = Statics.field603;
                        } else {
                            var77 = var38.method4213();
                            if (var77 == null) {
                                var77 = Statics.field603;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4209(arg0.field1249[var32]);
                        int var83 = var76.method4487(var82);
                        if (var38 != null) {
                            var79 = var38.method4209(arg0.field1259[var32]);
                            var81 = var77.method4487(var79);
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
                        int var100 = arg0.field1246[var32] - field948;
                        int var101 = var35.field3425 - var35.field3425 * var100 / var35.field3430;
                        int var102 = var35.field3445 * var100 / var35.field3430 + -var35.field3445;
                        int var103 = field977 + arg2 - (var92 >> 1) + var101;
                        int var104 = field1022 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3440 + var104 + 15;
                        int var108 = var107 - var76.field3653;
                        int var109 = var76.field3661 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3440 + var104 + 15;
                            int var111 = var110 - var77.field3653;
                            int var112 = var77.field3661 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3427 >= 0) {
                            var115 = (var100 << 8) / (var35.field3430 - var35.field3427);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4820(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4820(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4820(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4820(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4533(var82, var90 + var103, var107, var35.field3429, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4820(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4820(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4820(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4820(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4533(var79, var98 + var103, var110, var38.field3429, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4795(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4795(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4795(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4795(var93 + var103 - var50, var104);
                            }
                            var76.method4503(var82, var90 + var103, var107, var35.field3429 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4795(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4795(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4795(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4795(var97 + var103 - var62, var104);
                                }
                                var77.method4503(var79, var98 + var103, var110, var38.field3429 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.fn(Lcy;II)V")
    public static final void method540(class79 arg0, int arg1) {
        Statics.method454(arg0.field1282, arg0.field1225, arg1);
    }

    @ObfuscatedName("bm.gd(IIII)I")
    public static final int method971(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field750[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field756[var5][var3][var4] + class62.field756[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field756[var5][var3][var4 + 1] + class62.field756[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ik.gz(IIIIIIB)V")
    public static final void method3937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class137.field2034[var6];
            int var12 = class137.field2019[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class137.field2034[var7];
            int var15 = class137.field2019[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1520 = arg0 - var8;
        Statics.field740 = arg1 - var9;
        Statics.field271 = arg2 - var10;
        Statics.field763 = arg3;
        Statics.field1417 = arg4;
    }

    @ObfuscatedName("gj.gj(ZI)V")
    public static final void method3228(boolean arg0) {
        field1127 = arg0;
        if (!field1127) {
            int var1 = field960.method2967();
            int var2 = field960.method2967();
            int var3 = field960.method2967();
            Statics.field518 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field518[var4][var5] = field960.method2970();
                }
            }
            Statics.field239 = new int[var3];
            Statics.field2654 = new int[var3];
            Statics.field3694 = new int[var3];
            Statics.field352 = new byte[var3][];
            Statics.field3643 = new byte[var3][];
            boolean var6 = false;
            if ((var1 / 8 == 48 || var1 / 8 == 49) && var2 / 8 == 48) {
                var6 = true;
            }
            if (var1 / 8 == 48 && var2 / 8 == 148) {
                var6 = true;
            }
            int var7 = 0;
            for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    if (!var6 || var9 != 49 && var9 != 149 && var9 != 147 && var8 != 50 && (var8 != 49 || var9 != 47)) {
                        Statics.field239[var7] = var10;
                        Statics.field2654[var7] = Statics.field2216.method3855("m" + var8 + "_" + var9);
                        Statics.field3694[var7] = Statics.field2216.method3855("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method658(var1, var2, true);
            return;
        }
        int var11 = field960.method3001();
        int var12 = field960.method3125();
        boolean var13 = field960.method2965() == 1;
        int var14 = field960.method2967();
        field960.method3197();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field960.method3198(1);
                    if (var18 == 1) {
                        field1149[var15][var16][var17] = field960.method3198(26);
                    } else {
                        field1149[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field960.method3199();
        Statics.field518 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field518[var19][var20] = field960.method2970();
            }
        }
        Statics.field239 = new int[var14];
        Statics.field2654 = new int[var14];
        Statics.field3694 = new int[var14];
        Statics.field352 = new byte[var14][];
        Statics.field3643 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field1149[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field239[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field239[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field2654[var21] = Statics.field2216.method3855("m" + var30 + "_" + var31);
                            Statics.field3694[var21] = Statics.field2216.method3855("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method658(var12, var11, !var13);
    }

    @ObfuscatedName("an.go(IIZI)V")
    public static final void method658(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field769 == arg0 && Statics.field522 == arg1) {
            return;
        }
        Statics.field769 = arg0;
        Statics.field522 = arg1;
        method4463(25);
        method2742(class229.field3039, true);
        int var3 = Statics.field590;
        int var4 = Statics.field617;
        Statics.field590 = (arg0 - 6) * 8;
        Statics.field617 = (arg1 - 6) * 8;
        int var5 = Statics.field590 - var3;
        int var6 = Statics.field617 - var4;
        int var7 = Statics.field590;
        int var8 = Statics.field617;
        for (int var9 = 0; var9 < 32768; var9++) {
            class87 var10 = field953[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1279[var11] -= var5;
                    var10.field1280[var11] -= var6;
                }
                var10.field1282 -= var5 * 128;
                var10.field1225 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class75 var13 = field970[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1279[var14] -= var5;
                    var13.field1280[var14] -= var6;
                }
                var13.field1282 -= var5 * 128;
                var13.field1225 -= var6 * 128;
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
        for (class77 var26 = (class77) field1047.method3389(); var26 != null; var26 = (class77) field1047.method3385()) {
            var26.field1198 -= var5;
            var26.field1207 -= var6;
            if (var26.field1198 < 0 || var26.field1207 < 0 || var26.field1198 >= 104 || var26.field1207 >= 104) {
                var26.method3372();
            }
        }
        if (field1148 != 0) {
            field1148 -= var5;
            field999 -= var6;
        }
        field1045 = 0;
        field1162 = false;
        field1143 = -1;
        field1185.method3409();
        field1048.method3409();
        for (int var27 = 0; var27 < 4; var27++) {
            field1053[var27].method2849();
        }
    }

    @ObfuscatedName("bo.gk(ZI)V")
    public static final void method1038(boolean arg0) {
        method212();
        field1051++;
        if (field1051 < 50 && !arg0) {
            return;
        }
        field1051 = 0;
        if (field969 || Statics.field1868 == null) {
            return;
        }
        field958.method3195(72);
        try {
            Statics.field1868.method2791(field958.field2403, 0, field958.field2402);
            field958.field2402 = 0;
        } catch (IOException var2) {
            field969 = true;
        }
    }

    @ObfuscatedName("bv.gn(IIIIII)V")
    public static final void method680(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1498.method2548(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1498.method2547(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field875.field3801;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class259 var13 = class259.method653(var12);
            if (var13.field3447 == -1) {
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
                class288 var14 = Statics.field363[var13.field3447];
                if (var14 != null) {
                    int var15 = (var13.field3484 * 4 - var14.field3782) / 2;
                    int var16 = (var13.field3463 * 4 - var14.field3785) / 2;
                    var14.method4744(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3463) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1498.method2550(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1498.method2547(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class259 var22 = class259.method653(var21);
            if (var22.field3447 != -1) {
                class288 var23 = Statics.field363[var22.field3447];
                if (var23 != null) {
                    int var24 = (var22.field3484 * 4 - var23.field3782) / 2;
                    int var25 = (var22.field3463 * 4 - var23.field3785) / 2;
                    var23.method4744(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3463) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field875.field3801;
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
        int var29 = Statics.field1498.method2586(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class259 var31 = class259.method653(var30);
        if (var31.field3447 == -1) {
            return;
        }
        class288 var32 = Statics.field363[var31.field3447];
        if (var32 != null) {
            int var33 = (var31.field3484 * 4 - var32.field3782) / 2;
            int var34 = (var31.field3463 * 4 - var32.field3785) / 2;
            var32.method4744(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3463) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.ga(I)Z")
    public final boolean method1055() {
        if (Statics.field1868 == null) {
            return false;
        }
        try {
            int var1 = Statics.field1868.method2802();
            if (var1 <= 0) {
                return false;
            }
            if (field1074 == -1) {
                Statics.field1868.method2801(field960.field2403, 0, 1);
                field960.field2402 = 0;
                field1074 = field960.method3196();
                field961 = class276.field3713[field1074];
                var1--;
            }
            if (field961 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                Statics.field1868.method2801(field960.field2403, 0, 1);
                field961 = field960.field2403[0] & 0xFF;
                var1--;
            }
            if (field961 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                Statics.field1868.method2801(field960.field2403, 0, 2);
                field960.field2402 = 0;
                field961 = field960.method2967();
                var1 -= 2;
            }
            if (var1 < field961) {
                return false;
            }
            field960.field2402 = 0;
            Statics.field1868.method2801(field960.field2403, 0, field961);
            field963 = 0;
            field976 = field966;
            field966 = field1028;
            field1028 = field1074;
            if (field1074 == 58) {
                int var2 = field960.method3009();
                class220 var3 = class220.method2339(var2);
                var3.field2711 = 3;
                var3.field2767 = Statics.field300.field898.method3704();
                method1456(var3);
                field1074 = -1;
                return true;
            }
            if (field1074 == 187) {
                int var4 = field960.method2965();
                int var5 = field960.method2965();
                int var6 = field960.method2965();
                int var7 = field960.method2965();
                field1163[var4] = true;
                field1167[var4] = var5;
                field1165[var4] = var6;
                field1166[var4] = var7;
                field1042[var4] = 0;
                field1074 = -1;
                return true;
            }
            if (field1074 == 21) {
                field1162 = true;
                Statics.field256 = field960.method2965();
                Statics.field3678 = field960.method2965();
                Statics.field851 = field960.method2967();
                Statics.field320 = field960.method2965();
                Statics.field257 = field960.method2965();
                if (Statics.field257 >= 100) {
                    int var8 = Statics.field256 * 128 + 64;
                    int var9 = Statics.field3678 * 128 + 64;
                    int var10 = method971(var8, var9, Statics.field2342) - Statics.field851;
                    int var11 = var8 - Statics.field1520;
                    int var12 = var10 - Statics.field740;
                    int var13 = var9 - Statics.field271;
                    int var14 = (int) Math.sqrt((double) (var11 * var11 + var13 * var13));
                    Statics.field763 = (int) (Math.atan2((double) var12, (double) var14) * 325.949D) & 0x7FF;
                    Statics.field1417 = (int) (Math.atan2((double) var11, (double) var13) * -325.949D) & 0x7FF;
                    if (Statics.field763 < 128) {
                        Statics.field763 = 128;
                    }
                    if (Statics.field763 > 383) {
                        Statics.field763 = 383;
                    }
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 119) {
                int var15 = field960.method3001();
                if (var15 == 65535) {
                    var15 = -1;
                }
                if (var15 == -1 && !field1119) {
                    class207.method2821();
                } else if (var15 != -1 && field1152 != var15 && field1151 != 0 && !field1119) {
                    class207.method2708(2, Statics.field666, var15, 0, field1151, false);
                }
                field1152 = var15;
                field1074 = -1;
                return true;
            }
            if (field1074 == 219) {
                int var16 = field960.method2996();
                int var17 = field960.method3001();
                if (var17 == 65535) {
                    var17 = -1;
                }
                if (field1151 != 0 && var17 != -1) {
                    class207.method1045(Statics.field306, var17, 0, field1151, false);
                    field1119 = true;
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 213) {
                while (field960.field2402 < field961) {
                    boolean var18 = field960.method2965() == 1;
                    String var19 = field960.method2973();
                    String var20 = field960.method2973();
                    int var21 = field960.method2967();
                    int var22 = field960.method2965();
                    int var23 = field960.method2965();
                    boolean var24 = (var23 & 0x2) != 0;
                    boolean var25 = (var23 & 0x1) != 0;
                    if (var21 > 0) {
                        field960.method2973();
                        field960.method2965();
                        field960.method2970();
                    }
                    field960.method2973();
                    for (int var26 = 0; var26 < field1181; var26++) {
                        class66 var27 = field1183[var26];
                        if (var18) {
                            if (var20.equals(var27.field791)) {
                                var27.field791 = var19;
                                var27.field790 = var20;
                                var19 = null;
                                break;
                            }
                        } else if (var19.equals(var27.field791)) {
                            if (var27.field792 != var21) {
                                boolean var28 = true;
                                for (class68 var29 = (class68) field1184.method3419(); var29 != null; var29 = (class68) field1184.method3418()) {
                                    if (var29.field810.equals(var19)) {
                                        if (var21 != 0 && var29.field811 == 0) {
                                            var29.method3427();
                                            var28 = false;
                                        } else if (var21 == 0 && var29.field811 != 0) {
                                            var29.method3427();
                                            var28 = false;
                                        }
                                    }
                                }
                                if (var28) {
                                    field1184.method3417(new class68(var19, var21));
                                }
                                var27.field792 = var21;
                            }
                            var27.field790 = var20;
                            var27.field801 = var22;
                            var27.field794 = var24;
                            var27.field795 = var25;
                            var19 = null;
                            break;
                        }
                    }
                    if (var19 != null && field1181 < 400) {
                        class66 var30 = new class66();
                        field1183[field1181] = var30;
                        var30.field791 = var19;
                        var30.field790 = var20;
                        var30.field792 = var21;
                        var30.field801 = var22;
                        var30.field794 = var24;
                        var30.field795 = var25;
                        field1181++;
                    }
                }
                field1142 = 2;
                field1109 = field1101;
                boolean var31 = false;
                int var32 = field1181;
                while (var32 > 0) {
                    boolean var33 = true;
                    var32--;
                    for (int var34 = 0; var34 < var32; var34++) {
                        boolean var35 = false;
                        class66 var36 = field1183[var34];
                        class66 var37 = field1183[var34 + 1];
                        if (field1007 != var36.field792 && field1007 == var37.field792) {
                            var35 = true;
                        }
                        if (!var35 && var36.field792 == 0 && var37.field792 != 0) {
                            var35 = true;
                        }
                        if (!var35 && !var36.field794 && var37.field794) {
                            var35 = true;
                        }
                        if (!var35 && !var36.field795 && var37.field795) {
                            var35 = true;
                        }
                        if (var35) {
                            class66 var38 = field1183[var34];
                            field1183[var34] = field1183[var34 + 1];
                            field1183[var34 + 1] = var38;
                            var33 = false;
                        }
                    }
                    if (var33) {
                        break;
                    }
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 140) {
                field933 = field960.method3125() * 30;
                field1071 = field1101;
                field1074 = -1;
                return true;
            }
            if (field1074 == 118) {
                Statics.field451 = class280.method4204(field960.method2965());
                field1074 = -1;
                return true;
            }
            if (field1074 == 171) {
                Statics.field511 = field960.method2999();
                Statics.field1376 = field960.method2965();
                field1074 = -1;
                return true;
            }
            if (field1074 == 179) {
                String var39 = field960.method2973();
                long var40 = (long) field960.method2967();
                long var42 = (long) field960.method2969();
                class234[] var44 = new class234[] { class234.field3193, class234.field3195, class234.field3199, class234.field3202, class234.field3194, class234.field3192 };
                class234 var45 = (class234) class172.method1577(var44, field960.method2965());
                long var46 = (var40 << 32) + var42;
                boolean var48 = false;
                for (int var49 = 0; var49 < 100; var49++) {
                    if (field1158[var49] == var46) {
                        var48 = true;
                        break;
                    }
                }
                if (method4625(var39)) {
                    var48 = true;
                }
                if (!var48 && field1035 == 0) {
                    field1158[field1021] = var46;
                    field1021 = (field1021 + 1) % 100;
                    String var50 = class268.method4486(class274.method3483(class269.method1407(field960)));
                    byte var51;
                    if (var45.field3196) {
                        var51 = 7;
                    } else {
                        var51 = 3;
                    }
                    if (var45.field3198 == -1) {
                        class99.method968(var51, var39, var50);
                    } else {
                        class99.method968(var51, class89.method3799(var45.field3198) + var39, var50);
                    }
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 90) {
                int var52 = field960.method2970();
                int var53 = field960.method2967();
                if (var52 < -70000) {
                    var53 += 32768;
                }
                class220 var54;
                if (var52 >= 0) {
                    var54 = class220.method2339(var52);
                } else {
                    var54 = null;
                }
                if (var54 != null) {
                    for (int var55 = 0; var55 < var54.field2754.length; var55++) {
                        var54.field2754[var55] = 0;
                        var54.field2787[var55] = 0;
                    }
                }
                class64.method246(var53);
                int var56 = field960.method2967();
                for (int var57 = 0; var57 < var56; var57++) {
                    int var58 = field960.method3125();
                    int var59 = field960.method2992();
                    if (var59 == 255) {
                        var59 = field960.method3011();
                    }
                    if (var54 != null && var57 < var54.field2754.length) {
                        var54.field2754[var57] = var58;
                        var54.field2787[var57] = var59;
                    }
                    class64.method462(var53, var57, var58 - 1, var59);
                }
                if (var54 != null) {
                    method1456(var54);
                }
                method1589();
                field1104[++field1105 - 1 & 0x1F] = var53 & 0x7FFF;
                field1074 = -1;
                return true;
            }
            if (field1074 == 42 || field1074 == 23 || field1074 == 208 || field1074 == 185 || field1074 == 56 || field1074 == 62 || field1074 == 78 || field1074 == 253 || field1074 == 182 || field1074 == 79) {
                method54();
                field1074 = -1;
                return true;
            }
            if (field1074 == 233) {
                int var60 = field960.method2970();
                int var61 = field960.method2967();
                if (var61 == 65535) {
                    var61 = -1;
                }
                int var62 = field960.method3009();
                class220 var63 = class220.method2339(var62);
                if (var63.field2667) {
                    var63.field2788 = var61;
                    var63.field2672 = var60;
                    class260 var65 = class260.method3655(var61);
                    var63.field2719 = var65.field3518;
                    var63.field2720 = var65.field3519;
                    var63.field2738 = var65.field3520;
                    var63.field2717 = var65.field3521;
                    var63.field2718 = var65.field3500;
                    var63.field2782 = var65.field3534;
                    if (var65.field3523 == 1) {
                        var63.field2726 = 1;
                    } else {
                        var63.field2726 = 2;
                    }
                    if (var63.field2783 > 0) {
                        var63.field2782 = var63.field2782 * 32 / var63.field2783;
                    } else if (var63.field2679 > 0) {
                        var63.field2782 = var63.field2782 * 32 / var63.field2679;
                    }
                    method1456(var63);
                } else if (var61 == -1) {
                    var63.field2711 = 0;
                    field1074 = -1;
                    return true;
                } else {
                    class260 var64 = class260.method3655(var61);
                    var63.field2711 = 4;
                    var63.field2767 = var61;
                    var63.field2719 = var64.field3518;
                    var63.field2720 = var64.field3519;
                    var63.field2782 = var64.field3534 * 100 / var60;
                    method1456(var63);
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 157) {
                int var66 = field960.method3011();
                int var67 = field960.method3125();
                int var68 = var67 >> 10 & 0x1F;
                int var69 = var67 >> 5 & 0x1F;
                int var70 = var67 & 0x1F;
                int var71 = (var70 << 3) + (var68 << 19) + (var69 << 11);
                class220 var72 = class220.method2339(var66);
                if (var72.field2798 != var71) {
                    var72.field2798 = var71;
                    method1456(var72);
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 76) {
                class284.method4639(field960, field961);
                field1074 = -1;
                return true;
            }
            if (field1074 == 246) {
                int var73 = field960.method2967();
                int var74 = field960.method3001();
                int var75 = field960.method3009();
                int var76 = field960.method3125();
                class220 var77 = class220.method2339(var75);
                if (var77.field2719 != var73 || var77.field2720 != var74 || var77.field2782 != var76) {
                    var77.field2719 = var73;
                    var77.field2720 = var74;
                    var77.field2782 = var76;
                    method1456(var77);
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 166) {
                class97.method2783(field960, field961);
                field1074 = -1;
                return true;
            }
            if (field1074 == 237) {
                method1039(false);
                field1074 = -1;
                return true;
            }
            if (field1074 == 217) {
                int var78 = field960.method3103();
                int var79 = field960.method2999();
                int var80 = field960.method3125();
                class69 var81 = (class69) field1077.method3339((long) var78);
                if (var81 != null) {
                    method927(var81, var81.field825 != var80);
                }
                class69 var82 = new class69();
                var82.field825 = var80;
                var82.field824 = var79;
                field1077.method3330(var82, (long) var78);
                method1420(var80);
                class220 var83 = class220.method2339(var78);
                method1456(var83);
                if (field1080 != null) {
                    method1456(field1080);
                    field1080 = null;
                }
                method951();
                method2902(Statics.field2627[var78 >> 16], var83, false);
                class84.method56(var80);
                if (field1076 != -1) {
                    int var84 = field1076;
                    if (class220.method4620(var84)) {
                        method1(Statics.field2627[var84], 1);
                    }
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 94) {
                method1039(true);
                field1074 = -1;
                return true;
            }
            if (field1074 == 144) {
                method1589();
                field984 = field960.method2965();
                field1071 = field1101;
                field1074 = -1;
                return true;
            }
            if (field1074 == 173) {
                int var85 = field960.method3103();
                boolean var86 = field960.method2965() == 1;
                class220 var87 = class220.method2339(var85);
                if (var87.field2746 != var86) {
                    var87.field2746 = var86;
                    method1456(var87);
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 91) {
                field1148 = field960.method2965();
                if (field1148 == 255) {
                    field1148 = 0;
                }
                field999 = field960.method2965();
                if (field999 == 255) {
                    field999 = 0;
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 241) {
                String var88 = field960.method2973();
                Object[] var89 = new Object[var88.length() + 1];
                for (int var90 = var88.length() - 1; var90 >= 0; var90--) {
                    if (var88.charAt(var90) == 's') {
                        var89[var90 + 1] = field960.method2973();
                    } else {
                        var89[var90 + 1] = Integer.valueOf(field960.method2970());
                    }
                }
                var89[0] = Integer.valueOf(field960.method2970());
                class70 var91 = new class70();
                var91.field838 = var89;
                class84.method152(var91);
                field1074 = -1;
                return true;
            }
            if (field1074 == 188) {
                int var92 = field960.method3009();
                int var93 = field960.method3166();
                class215.field2625[var93] = var92;
                if (class215.field2623[var93] != var92) {
                    class215.field2623[var93] = var92;
                }
                method3796(var93);
                field1102[++field1103 - 1 & 0x1F] = var93;
                field1074 = -1;
                return true;
            }
            if (field1074 == 74) {
                field943 = field960.method2965();
                field1133 = field960.method2965();
                field1074 = -1;
                return true;
            }
            if (field1074 == 113) {
                String var94 = field960.method2973();
                long var95 = field960.method2971();
                long var97 = (long) field960.method2967();
                long var99 = (long) field960.method2969();
                class234 var101 = (class234) class172.method1577(class234.method531(), field960.method2965());
                long var102 = (var97 << 32) + var99;
                boolean var104 = false;
                for (int var105 = 0; var105 < 100; var105++) {
                    if (field1158[var105] == var102) {
                        var104 = true;
                        break;
                    }
                }
                if (var101.field3200 && method4625(var94)) {
                    var104 = true;
                }
                if (!var104 && field1035 == 0) {
                    field1158[field1021] = var102;
                    field1021 = (field1021 + 1) % 100;
                    class183 var106 = field960;
                    String var110;
                    try {
                        int var107 = var106.method2978();
                        if (var107 > 32767) {
                            var107 = 32767;
                        }
                        byte[] var108 = new byte[var107];
                        var106.field2402 += Statics.field3677.method2894(var106.field2403, var106.field2402, var108, 0, var107);
                        String var109 = class270.method4048(var108, 0, var107);
                        var110 = var109;
                    } catch (Exception var284) {
                        var110 = "Cabbage";
                    }
                    String var113 = class268.method4486(class274.method3483(var110));
                    if (var101.field3198 == -1) {
                        class99.method3663(9, var94, var113, class272.method1730(var95));
                    } else {
                        class99.method3663(9, class89.method3799(var101.field3198) + var94, var113, class272.method1730(var95));
                    }
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 38) {
                int var114 = field960.method3103();
                int var115 = field960.method3062();
                class220 var116 = class220.method2339(var114);
                if (var116.field2715 != var115 || var115 == -1) {
                    var116.field2715 = var115;
                    var116.field2741 = 0;
                    var116.field2709 = 0;
                    method1456(var116);
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 164) {
                method4740();
                field1074 = -1;
                return false;
            }
            if (field1074 == 57) {
                field960.field2402 += 28;
                if (field960.method2988()) {
                    class183 var117 = field960;
                    int var118 = field960.field2402 - 28;
                    byte[] var119 = var117.field2403;
                    if (field952 == null) {
                        field952 = new byte[24];
                    }
                    class187.method3239(var119, var118, field952, 0, 24);
                    class157.method91(var117, var118);
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 51) {
                field1162 = false;
                for (int var120 = 0; var120 < 5; var120++) {
                    field1163[var120] = false;
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 15) {
                method3228(true);
                field960.method3196();
                int var121 = field960.method2967();
                class97.method2783(field960, var121);
                field1074 = -1;
                return true;
            }
            if (field1074 == 101) {
                method1589();
                int var122 = field960.method3002();
                int var123 = field960.method2970();
                int var124 = field960.method3002();
                field1052[var124] = var123;
                field1050[var124] = var122;
                field993[var124] = 1;
                for (int var125 = 0; var125 < 98; var125++) {
                    if (var123 >= class226.field2854[var125]) {
                        field993[var124] = var125 + 2;
                    }
                }
                field1106[++field1107 - 1 & 0x1F] = var124;
                field1074 = -1;
                return true;
            }
            if (field1074 == 106) {
                int var126 = field960.method2978();
                boolean var127 = field960.method2965() == 1;
                String var128 = "";
                boolean var129 = false;
                if (var127) {
                    var128 = field960.method2973();
                    if (method4625(var128)) {
                        var129 = true;
                    }
                }
                String var130 = field960.method2973();
                if (!var129) {
                    class99.method968(var126, var128, var130);
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 202) {
                field1054 = field960.method2965();
                field1074 = -1;
                return true;
            }
            if (field1074 == 205) {
                for (int var131 = 0; var131 < class215.field2623.length; var131++) {
                    if (class215.field2625[var131] != class215.field2623[var131]) {
                        class215.field2623[var131] = class215.field2625[var131];
                        method3796(var131);
                        field1102[++field1103 - 1 & 0x1F] = var131;
                    }
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 155) {
                int var132 = field960.method3001();
                class64.method2882(var132);
                field1104[++field1105 - 1 & 0x1F] = var132 & 0x7FFF;
                field1074 = -1;
                return true;
            }
            if (field1074 == 146) {
                int var133 = field960.method3103();
                int var134 = field960.method3011();
                class69 var135 = (class69) field1077.method3339((long) var134);
                class69 var136 = (class69) field1077.method3339((long) var133);
                if (var136 != null) {
                    method927(var136, var135 == null || var135.field825 != var136.field825);
                }
                if (var135 != null) {
                    var135.method3372();
                    field1077.method3330(var135, (long) var133);
                }
                class220 var137 = class220.method2339(var134);
                if (var137 != null) {
                    method1456(var137);
                }
                class220 var138 = class220.method2339(var133);
                if (var138 != null) {
                    method1456(var138);
                    method2902(Statics.field2627[var138.field2668 >>> 16], var138, true);
                }
                if (field1076 != -1) {
                    int var139 = field1076;
                    if (class220.method4620(var139)) {
                        method1(Statics.field2627[var139], 1);
                    }
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 130) {
                if (field1076 != -1) {
                    int var140 = field1076;
                    if (class220.method4620(var140)) {
                        method1(Statics.field2627[var140], 0);
                    }
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 186) {
                for (int var141 = 0; var141 < field970.length; var141++) {
                    if (field970[var141] != null) {
                        field970[var141].field1256 = -1;
                    }
                }
                for (int var142 = 0; var142 < field953.length; var142++) {
                    if (field953[var142] != null) {
                        field953[var142].field1256 = -1;
                    }
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 97) {
                int var143 = field960.method3011();
                class220 var144 = class220.method2339(var143);
                for (int var145 = 0; var145 < var144.field2754.length; var145++) {
                    var144.field2754[var145] = -1;
                    var144.field2754[var145] = 0;
                }
                method1456(var144);
                field1074 = -1;
                return true;
            }
            if (field1074 == 111) {
                int var146 = field960.method2970();
                class69 var147 = (class69) field1077.method3339((long) var146);
                if (var147 != null) {
                    method927(var147, true);
                }
                if (field1080 != null) {
                    method1456(field1080);
                    field1080 = null;
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 199) {
                int var148 = field960.method2970();
                int var149 = field960.method3166();
                class220 var150 = class220.method2339(var148);
                if (var150 != null && var150.field2670 == 0) {
                    if (var149 > var150.field2748 - var150.field2684) {
                        var149 = var150.field2748 - var150.field2684;
                    }
                    if (var149 < 0) {
                        var149 = 0;
                    }
                    if (var150.field2690 != var149) {
                        var150.field2690 = var149;
                        method1456(var150);
                    }
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 220) {
                method1589();
                field1015 = field960.method3157();
                field1071 = field1101;
                field1074 = -1;
                return true;
            }
            if (field1074 == 191) {
                method3805(field960.method2973());
                field1074 = -1;
                return true;
            }
            if (field1074 == 14) {
                int var151 = field960.method2967();
                int var152 = field960.method2965();
                int var153 = field960.method2967();
                if (field1154 != 0 && var152 != 0 && field1045 < 50) {
                    field1157[field1045] = var151;
                    field1087[field1045] = var152;
                    field1159[field1045] = var153;
                    field1161[field1045] = null;
                    field1160[field1045] = 0;
                    field1045++;
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 85) {
                int var157 = field961 + field960.field2402;
                int var158 = field960.method2967();
                int var159 = field960.method2967();
                if (field1076 != var158) {
                    field1076 = var158;
                    this.method1046(false);
                    method1420(field1076);
                    class84.method56(field1076);
                    for (int var160 = 0; var160 < 100; var160++) {
                        field1121[var160] = true;
                    }
                }
                while (var159-- > 0) {
                    int var161 = field960.method2970();
                    int var162 = field960.method2967();
                    int var163 = field960.method2965();
                    class69 var164 = (class69) field1077.method3339((long) var161);
                    if (var164 != null && var164.field825 != var162) {
                        method927(var164, true);
                        var164 = null;
                    }
                    if (var164 == null) {
                        class69 var165 = new class69();
                        var165.field825 = var162;
                        var165.field824 = var163;
                        field1077.method3330(var165, (long) var161);
                        method1420(var162);
                        class220 var166 = class220.method2339(var161);
                        method1456(var166);
                        if (field1080 != null) {
                            method1456(field1080);
                            field1080 = null;
                        }
                        method951();
                        method2902(Statics.field2627[var161 >> 16], var166, false);
                        class84.method56(var162);
                        if (field1076 != -1) {
                            int var167 = field1076;
                            if (class220.method4620(var167)) {
                                method1(Statics.field2627[var167], 1);
                            }
                        }
                        var164 = var165;
                    }
                    var164.field820 = true;
                }
                for (class69 var169 = (class69) field1077.method3332(); var169 != null; var169 = (class69) field1077.method3333()) {
                    if (var169.field820) {
                        var169.field820 = false;
                    } else {
                        method927(var169, true);
                    }
                }
                field1118 = new class194(512);
                while (field960.field2402 < var157) {
                    int var170 = field960.method2970();
                    int var171 = field960.method2967();
                    int var172 = field960.method2967();
                    int var173 = field960.method2970();
                    for (int var174 = var171; var174 <= var172; var174++) {
                        long var175 = ((long) var170 << 32) + (long) var174;
                        field1118.method3330(new class202(var173), var175);
                    }
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 11) {
                int var177 = field960.method2967();
                field1076 = var177;
                this.method1046(false);
                method1420(var177);
                class84.method56(field1076);
                for (int var178 = 0; var178 < 100; var178++) {
                    field1121[var178] = true;
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 48) {
                method3228(false);
                field960.method3196();
                int var179 = field960.method2967();
                class97.method2783(field960, var179);
                field1074 = -1;
                return true;
            }
            if (field1074 == 148) {
                field1142 = 1;
                field1109 = field1101;
                field1074 = -1;
                return true;
            }
            if (field1074 == 137) {
                int var180 = field960.method3166();
                int var181 = field960.method3103();
                class220 var182 = class220.method2339(var181);
                if (var182.field2711 != 2 || var182.field2767 != var180) {
                    var182.field2711 = 2;
                    var182.field2767 = var180;
                    method1456(var182);
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 159) {
                int var183 = field960.method2970();
                int var184 = field960.method2967();
                if (var183 < -70000) {
                    var184 += 32768;
                }
                class220 var185;
                if (var183 >= 0) {
                    var185 = class220.method2339(var183);
                } else {
                    var185 = null;
                }
                while (field960.field2402 < field961) {
                    int var186 = field960.method2978();
                    int var187 = field960.method2967();
                    int var188 = 0;
                    if (var187 != 0) {
                        var188 = field960.method2965();
                        if (var188 == 255) {
                            var188 = field960.method2970();
                        }
                    }
                    if (var185 != null && var186 >= 0 && var186 < var185.field2754.length) {
                        var185.field2754[var186] = var187;
                        var185.field2787[var186] = var188;
                    }
                    class64.method462(var184, var186, var187 - 1, var188);
                }
                if (var185 != null) {
                    method1456(var185);
                }
                method1589();
                field1104[++field1105 - 1 & 0x1F] = var184 & 0x7FFF;
                field1074 = -1;
                return true;
            }
            if (field1074 == 172) {
                for (int var189 = 0; var189 < Statics.field3300; var189++) {
                    class245 var190 = class245.method3237(var189);
                    if (var190 != null) {
                        class215.field2625[var189] = 0;
                        class215.field2623[var189] = 0;
                    }
                }
                method1589();
                field1103 += 32;
                field1074 = -1;
                return true;
            }
            if (field1074 == 50) {
                int var191 = field960.method2965();
                if (field960.method2965() == 0) {
                    field967[var191] = new class17();
                    field960.field2402 += 18;
                } else {
                    field960.field2402--;
                    field967[var191] = new class17(field960, false);
                }
                field1169 = field1101;
                field1074 = -1;
                return true;
            }
            if (field1074 == 248) {
                while (field960.field2402 < field961) {
                    int var192 = field960.method2965();
                    boolean var193 = (var192 & 0x1) == 1;
                    String var194 = field960.method2973();
                    String var195 = field960.method2973();
                    field960.method2973();
                    for (int var196 = 0; var196 < field919; var196++) {
                        class71 var197 = field917[var196];
                        if (var193) {
                            if (var195.equals(var197.field842)) {
                                var197.field842 = var194;
                                var197.field841 = var195;
                                var194 = null;
                                break;
                            }
                        } else if (var194.equals(var197.field842)) {
                            var197.field842 = var194;
                            var197.field841 = var195;
                            var194 = null;
                            break;
                        }
                    }
                    if (var194 != null && field919 < 400) {
                        class71 var198 = new class71();
                        field917[field919] = var198;
                        var198.field842 = var194;
                        var198.field841 = var195;
                        field919++;
                    }
                }
                field1109 = field1101;
                field1074 = -1;
                return true;
            }
            if (field1074 == 216) {
                Statics.field511 = field960.method3002();
                Statics.field1376 = field960.method3002();
                while (field960.field2402 < field961) {
                    field1074 = field960.method2965();
                    method54();
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 66) {
                int var199 = field960.method3011();
                int var200 = field960.method3001();
                int var201 = field960.method3166();
                class220 var202 = class220.method2339(var199);
                var202.field2724 = (var200 << 16) + var201;
                field1074 = -1;
                return true;
            }
            if (field1074 == 40) {
                int var203 = field960.method3103();
                int var204 = field960.method3125();
                class220 var205 = class220.method2339(var203);
                if (var205.field2711 != 1 || var205.field2767 != var204) {
                    var205.field2711 = 1;
                    var205.field2767 = var204;
                    method1456(var205);
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 83) {
                String var206 = field960.method2973();
                int var207 = field960.method2967();
                byte var208 = field960.method2966();
                boolean var209 = false;
                if (var208 == -128) {
                    var209 = true;
                }
                if (var209) {
                    if (Statics.field15 == 0) {
                        field1074 = -1;
                        return true;
                    }
                    boolean var210 = false;
                    int var211;
                    for (var211 = 0; var211 < Statics.field15 && (!Statics.field747[var211].field910.equals(var206) || Statics.field747[var211].field908 != var207); var211++) {
                    }
                    if (var211 < Statics.field15) {
                        while (var211 < Statics.field15 - 1) {
                            Statics.field747[var211] = Statics.field747[var211 + 1];
                            var211++;
                        }
                        Statics.field15--;
                        Statics.field747[Statics.field15] = null;
                    }
                } else {
                    field960.method2973();
                    class76 var212 = new class76();
                    var212.field910 = var206;
                    var212.field907 = class271.method3664(var212.field910, Statics.field3218);
                    var212.field908 = var207;
                    var212.field915 = var208;
                    int var213;
                    for (var213 = Statics.field15 - 1; var213 >= 0; var213--) {
                        int var214 = Statics.field747[var213].field907.compareTo(var212.field907);
                        if (var214 == 0) {
                            Statics.field747[var213].field908 = var207;
                            Statics.field747[var213].field915 = var208;
                            if (var206.equals(Statics.field300.field891)) {
                                Statics.field616 = var208;
                            }
                            field965 = field1101;
                            field1074 = -1;
                            return true;
                        }
                        if (var214 < 0) {
                            break;
                        }
                    }
                    if (Statics.field15 >= Statics.field747.length) {
                        field1074 = -1;
                        return true;
                    }
                    for (int var215 = Statics.field15 - 1; var215 > var213; var215--) {
                        Statics.field747[var215 + 1] = Statics.field747[var215];
                    }
                    if (Statics.field15 == 0) {
                        Statics.field747 = new class76[100];
                    }
                    Statics.field747[var213 + 1] = var212;
                    Statics.field15++;
                    if (var206.equals(Statics.field300.field891)) {
                        Statics.field616 = var208;
                    }
                }
                field965 = field1101;
                field1074 = -1;
                return true;
            }
            if (field1074 == 206) {
                int var216 = field960.method3002();
                int var217 = field960.method2965();
                String var218 = field960.method2973();
                if (var217 >= 1 && var217 <= 8) {
                    if (var218.equalsIgnoreCase("null")) {
                        var218 = null;
                    }
                    field998[var217 - 1] = var218;
                    field1043[var217 - 1] = var216 == 0;
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 252) {
                boolean var219 = field960.method2965() == 1;
                if (var219) {
                    Statics.field406 = class179.method3585() - field960.method2971();
                    Statics.field1780 = new class14(field960, true);
                } else {
                    Statics.field1780 = null;
                }
                field1036 = field1101;
                field1074 = -1;
                return true;
            }
            if (field1074 == 19) {
                Statics.field511 = field960.method2992();
                Statics.field1376 = field960.method2965();
                for (int var220 = Statics.field511; var220 < Statics.field511 + 8; var220++) {
                    for (int var221 = Statics.field1376; var221 < Statics.field1376 + 8; var221++) {
                        if (field1046[Statics.field2342][var220][var221] != null) {
                            field1046[Statics.field2342][var220][var221] = null;
                            method926(var220, var221);
                        }
                    }
                }
                for (class77 var222 = (class77) field1047.method3389(); var222 != null; var222 = (class77) field1047.method3385()) {
                    if (var222.field1198 >= Statics.field511 && var222.field1198 < Statics.field511 + 8 && var222.field1207 >= Statics.field1376 && var222.field1207 < Statics.field1376 + 8 && Statics.field2342 == var222.field1208) {
                        var222.field1205 = 0;
                    }
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 71) {
                int var223 = field960.method2970();
                int var224 = field960.method2970();
                if (Statics.field3271 == null || !Statics.field3271.isValid()) {
                    try {
                        Iterator var225 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var225.hasNext()) {
                            GarbageCollectorMXBean var226 = (GarbageCollectorMXBean) var225.next();
                            if (var226.isValid()) {
                                Statics.field3271 = var226;
                                field1192 = -1L;
                                field1191 = -1L;
                            }
                        }
                    } catch (Throwable var285) {
                    }
                }
                long var228 = class179.method3585();
                int var230 = -1;
                if (Statics.field3271 != null) {
                    long var231 = Statics.field3271.getCollectionTime();
                    if (field1191 != -1L) {
                        long var233 = var231 - field1191;
                        long var235 = var228 - field1192;
                        if (var235 != 0L) {
                            var230 = (int) (var233 * 100L / var235);
                        }
                    }
                    field1191 = var231;
                    field1192 = var228;
                }
                field958.method3195(155);
                field958.method2997(var230);
                field958.method2991(field716);
                field958.method2953(var223);
                field958.method3078(var224);
                field1074 = -1;
                return true;
            }
            if (field1074 == 80) {
                class81 var237 = new class81();
                var237.field1311 = field960.method2973();
                var237.field1303 = field960.method2967();
                int var238 = field960.method2970();
                var237.field1300 = var238;
                method4463(45);
                Statics.field1868.method2794();
                Statics.field1868 = null;
                class93.method806(var237);
                field1074 = -1;
                return false;
            }
            if (field1074 == 224) {
                int var239 = field960.method3103();
                Statics.field272 = Statics.field719.method2762(var239);
                field1074 = -1;
                return true;
            }
            if (field1074 == 211) {
                int var240 = field960.method3125();
                byte var241 = field960.method2966();
                class215.field2625[var240] = var241;
                if (class215.field2623[var240] != var241) {
                    class215.field2623[var240] = var241;
                }
                method3796(var240);
                field1102[++field1103 - 1 & 0x1F] = var240;
                field1074 = -1;
                return true;
            }
            if (field1074 == 114) {
                int var242 = field960.method3009();
                String var243 = field960.method2973();
                class220 var244 = class220.method2339(var242);
                if (!var243.equals(var244.field2728)) {
                    var244.field2728 = var243;
                    method1456(var244);
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 156) {
                field1162 = true;
                Statics.field1404 = field960.method2965();
                Statics.field490 = field960.method2965();
                Statics.field533 = field960.method2967();
                Statics.field2448 = field960.method2965();
                Statics.field351 = field960.method2965();
                if (Statics.field351 >= 100) {
                    Statics.field1520 = Statics.field1404 * 128 + 64;
                    Statics.field271 = Statics.field490 * 128 + 64;
                    Statics.field740 = method971(Statics.field1520, Statics.field271, Statics.field2342) - Statics.field533;
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 67) {
                int var245 = field960.method3003();
                int var246 = field960.method3103();
                int var247 = field960.method3062();
                class220 var248 = class220.method2339(var246);
                if (var248.field2692 != var245 || var248.field2678 != var247 || var248.field2673 != 0 || var248.field2772 != 0) {
                    var248.field2692 = var245;
                    var248.field2678 = var247;
                    var248.field2673 = 0;
                    var248.field2772 = 0;
                    method1456(var248);
                    this.method1059(var248);
                    if (var248.field2670 == 0) {
                        method2902(Statics.field2627[var246 >> 16], var248, false);
                    }
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 2) {
                field965 = field1101;
                if (field961 == 0) {
                    field1141 = null;
                    field964 = null;
                    Statics.field15 = 0;
                    Statics.field747 = null;
                    field1074 = -1;
                    return true;
                }
                field964 = field960.method2973();
                long var249 = field960.method2971();
                long var251 = var249;
                String var253;
                if (var249 <= 0L || var249 >= 6582952005840035281L) {
                    var253 = null;
                } else if (var249 % 37L == 0L) {
                    var253 = null;
                } else {
                    int var254 = 0;
                    for (long var255 = var249; var255 != 0L; var255 /= 37L) {
                        var254++;
                    }
                    StringBuilder var257 = new StringBuilder(var254);
                    while (var251 != 0L) {
                        long var258 = var251;
                        var251 /= 37L;
                        var257.append(class272.field3685[(int) (var258 - var251 * 37L)]);
                    }
                    var253 = var257.reverse().toString();
                }
                field1141 = var253;
                Statics.field2520 = field960.method2966();
                int var260 = field960.method2965();
                if (var260 == 255) {
                    field1074 = -1;
                    return true;
                }
                Statics.field15 = var260;
                class76[] var261 = new class76[100];
                for (int var262 = 0; var262 < Statics.field15; var262++) {
                    var261[var262] = new class76();
                    var261[var262].field910 = field960.method2973();
                    var261[var262].field907 = class271.method3664(var261[var262].field910, Statics.field3218);
                    var261[var262].field908 = field960.method2967();
                    var261[var262].field915 = field960.method2966();
                    field960.method2973();
                    if (var261[var262].field910.equals(Statics.field300.field891)) {
                        Statics.field616 = var261[var262].field915;
                    }
                }
                boolean var263 = false;
                int var264 = Statics.field15;
                while (var264 > 0) {
                    boolean var265 = true;
                    var264--;
                    for (int var266 = 0; var266 < var264; var266++) {
                        if (var261[var266].field907.compareTo(var261[var266 + 1].field907) > 0) {
                            class76 var267 = var261[var266];
                            var261[var266] = var261[var266 + 1];
                            var261[var266 + 1] = var267;
                            var265 = false;
                        }
                    }
                    if (var265) {
                        break;
                    }
                }
                Statics.field747 = var261;
                field1074 = -1;
                return true;
            }
            if (field1074 == 128) {
                class97.field1488 = 0;
                for (int var268 = 0; var268 < 2048; var268++) {
                    class97.field1487[var268] = null;
                    class97.field1489[var268] = 1;
                }
                for (int var269 = 0; var269 < 2048; var269++) {
                    field970[var269] = null;
                }
                class97.method579(field960);
                field1074 = -1;
                return true;
            }
            if (field1074 == 231) {
                field934 = field960.method2965();
                if (field934 == 1) {
                    field935 = field960.method2967();
                }
                if (field934 >= 2 && field934 <= 6) {
                    if (field934 == 2) {
                        field940 = 64;
                        field941 = 64;
                    }
                    if (field934 == 3) {
                        field940 = 0;
                        field941 = 64;
                    }
                    if (field934 == 4) {
                        field940 = 128;
                        field941 = 64;
                    }
                    if (field934 == 5) {
                        field940 = 64;
                        field941 = 0;
                    }
                    if (field934 == 6) {
                        field940 = 64;
                        field941 = 128;
                    }
                    field934 = 2;
                    field937 = field960.method2967();
                    field938 = field960.method2967();
                    field1067 = field960.method2965();
                }
                if (field934 == 10) {
                    field936 = field960.method2967();
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 136) {
                int var270 = field960.method3166();
                if (var270 == 65535) {
                    var270 = -1;
                }
                int var271 = field960.method3103();
                int var272 = field960.method2967();
                if (var272 == 65535) {
                    var272 = -1;
                }
                int var273 = field960.method3009();
                for (int var274 = var270; var274 <= var272; var274++) {
                    long var275 = ((long) var273 << 32) + (long) var274;
                    class196 var277 = field1118.method3339(var275);
                    if (var277 != null) {
                        var277.method3372();
                    }
                    field1118.method3330(new class202(var271), var275);
                }
                field1074 = -1;
                return true;
            }
            if (field1074 == 81) {
                String var278 = field960.method2973();
                String var279 = class268.method4486(class274.method3483(class269.method1407(field960)));
                class99.method968(6, var278, var279);
                field1074 = -1;
                return true;
            }
            class154.method1971("" + field1074 + class89.field1386 + field966 + class89.field1386 + field976 + class89.field1386 + field961, (Throwable) null);
            method4740();
        } catch (IOException var286) {
            method545();
        } catch (Exception var287) {
            String var282 = "" + field1074 + class89.field1386 + field966 + class89.field1386 + field976 + class89.field1386 + field961 + class89.field1386 + (Statics.field590 + Statics.field300.field1279[0]) + class89.field1386 + (Statics.field617 + Statics.field300.field1280[0]) + class89.field1386;
            for (int var283 = 0; var283 < field961 && var283 < 50; var283++) {
                var282 = var282 + field960.field2403[var283] + class89.field1386;
            }
            class154.method1971(var282, var287);
            method4740();
        }
        return true;
    }

    @ObfuscatedName("q.gm(I)V")
    public static final void method54() {
        if (field1074 == 56) {
            int var0 = field960.method2965();
            int var1 = (var0 >> 4 & 0x7) + Statics.field511;
            int var2 = (var0 & 0x7) + Statics.field1376;
            int var3 = var1 + field960.method2966();
            int var4 = var2 + field960.method2966();
            int var5 = field960.method3157();
            int var6 = field960.method2967();
            int var7 = field960.method2965() * 4;
            int var8 = field960.method2965() * 4;
            int var9 = field960.method2967();
            int var10 = field960.method2967();
            int var11 = field960.method2965();
            int var12 = field960.method2965();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var6 != 65535) {
                int var13 = var1 * 128 + 64;
                int var14 = var2 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var4 * 128 + 64;
                class94 var17 = new class94(var6, Statics.field2342, var13, var14, method971(var13, var14, Statics.field2342) - var7, field948 + var9, field948 + var10, var11, var12, var5, var8);
                var17.method1635(var15, var16, method971(var15, var16, Statics.field2342) - var8, field948 + var9);
                field1048.method3394(var17);
            }
        } else if (field1074 == 23) {
            int var18 = field960.method2965();
            int var19 = (var18 >> 4 & 0x7) + Statics.field511;
            int var20 = (var18 & 0x7) + Statics.field1376;
            int var21 = field960.method2967();
            int var22 = field960.method2967();
            int var23 = field960.method2967();
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                class197 var24 = field1046[Statics.field2342][var19][var20];
                if (var24 != null) {
                    for (class95 var25 = (class95) var24.method3389(); var25 != null; var25 = (class95) var24.method3385()) {
                        if ((var21 & 0x7FFF) == var25.field1475 && var25.field1476 == var22) {
                            var25.field1476 = var23;
                            break;
                        }
                    }
                    method926(var19, var20);
                }
            }
        } else if (field1074 == 79) {
            int var26 = field960.method3002();
            int var27 = (var26 >> 4 & 0x7) + Statics.field511;
            int var28 = (var26 & 0x7) + Statics.field1376;
            int var29 = field960.method2992();
            int var30 = var29 >> 2;
            int var31 = var29 & 0x3;
            int var32 = field979[var30];
            int var33 = field960.method3125();
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                method115(Statics.field2342, var27, var28, var32, var33, var30, var31, 0, -1);
            }
        } else if (field1074 == 62) {
            int var34 = field960.method3001();
            int var35 = field960.method2965();
            int var36 = (var35 >> 4 & 0x7) + Statics.field511;
            int var37 = (var35 & 0x7) + Statics.field1376;
            if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                class197 var38 = field1046[Statics.field2342][var36][var37];
                if (var38 != null) {
                    for (class95 var39 = (class95) var38.method3389(); var39 != null; var39 = (class95) var38.method3385()) {
                        if ((var34 & 0x7FFF) == var39.field1475) {
                            var39.method3372();
                            break;
                        }
                    }
                    if (var38.method3389() == null) {
                        field1046[Statics.field2342][var36][var37] = null;
                    }
                    method926(var36, var37);
                }
            }
        } else {
            if (field1074 == 42) {
                int var40 = field960.method2965();
                int var41 = (var40 >> 4 & 0x7) + Statics.field511;
                int var42 = (var40 & 0x7) + Statics.field1376;
                int var43 = field960.method2967();
                int var44 = field960.method2965();
                int var45 = var44 >> 4 & 0xF;
                int var46 = var44 & 0x7;
                int var47 = field960.method2965();
                if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                    int var48 = var45 + 1;
                    if (Statics.field300.field1279[0] >= var41 - var48 && Statics.field300.field1279[0] <= var41 + var48 && Statics.field300.field1280[0] >= var42 - var48 && Statics.field300.field1280[0] <= var42 + var48 && field1155 != 0 && var46 > 0 && field1045 < 50) {
                        field1157[field1045] = var43;
                        field1087[field1045] = var46;
                        field1159[field1045] = var47;
                        field1161[field1045] = null;
                        field1160[field1045] = (var41 << 16) + (var42 << 8) + var45;
                        field1045++;
                    }
                }
            }
            if (field1074 == 253) {
                int var49 = field960.method2965();
                int var50 = (var49 >> 4 & 0x7) + Statics.field511;
                int var51 = (var49 & 0x7) + Statics.field1376;
                int var52 = field960.method2999();
                int var53 = var52 >> 2;
                int var54 = var52 & 0x3;
                int var55 = field979[var53];
                int var56 = field960.method3125();
                if (var50 >= 0 && var51 >= 0 && var50 < 103 && var51 < 103) {
                    if (var55 == 0) {
                        class143 var57 = Statics.field1498.method2523(Statics.field2342, var50, var51);
                        if (var57 != null) {
                            int var58 = var57.field2118 >> 14 & 0x7FFF;
                            if (var53 == 2) {
                                var57.field2123 = new class101(var58, 2, var54 + 4, Statics.field2342, var50, var51, var56, false, var57.field2123);
                                var57.field2124 = new class101(var58, 2, var54 + 1 & 0x3, Statics.field2342, var50, var51, var56, false, var57.field2124);
                            } else {
                                var57.field2123 = new class101(var58, var53, var54, Statics.field2342, var50, var51, var56, false, var57.field2123);
                            }
                        }
                    }
                    if (var55 == 1) {
                        class148 var59 = Statics.field1498.method2631(Statics.field2342, var50, var51);
                        if (var59 != null) {
                            int var60 = var59.field2169 >> 14 & 0x7FFF;
                            if (var53 == 4 || var53 == 5) {
                                var59.field2167 = new class101(var60, 4, var54, Statics.field2342, var50, var51, var56, false, var59.field2167);
                            } else if (var53 == 6) {
                                var59.field2167 = new class101(var60, 4, var54 + 4, Statics.field2342, var50, var51, var56, false, var59.field2167);
                            } else if (var53 == 7) {
                                var59.field2167 = new class101(var60, 4, (var54 + 2 & 0x3) + 4, Statics.field2342, var50, var51, var56, false, var59.field2167);
                            } else if (var53 == 8) {
                                var59.field2167 = new class101(var60, 4, var54 + 4, Statics.field2342, var50, var51, var56, false, var59.field2167);
                                var59.field2171 = new class101(var60, 4, (var54 + 2 & 0x3) + 4, Statics.field2342, var50, var51, var56, false, var59.field2171);
                            }
                        }
                    }
                    if (var55 == 2) {
                        class149 var61 = Statics.field1498.method2546(Statics.field2342, var50, var51);
                        if (var53 == 11) {
                            var53 = 10;
                        }
                        if (var61 != null) {
                            var61.field2179 = new class101(var61.field2187 >> 14 & 0x7FFF, var53, var54, Statics.field2342, var50, var51, var56, false, var61.field2179);
                        }
                    }
                    if (var55 == 3) {
                        class130 var62 = Statics.field1498.method2665(Statics.field2342, var50, var51);
                        if (var62 != null) {
                            var62.field1865 = new class101(var62.field1866 >> 14 & 0x7FFF, 22, var54, Statics.field2342, var50, var51, var56, false, var62.field1865);
                        }
                    }
                }
            } else {
                if (field1074 == 208) {
                    byte var63 = field960.method2995();
                    byte var64 = field960.method3139();
                    int var65 = field960.method2967();
                    byte var66 = field960.method2993();
                    byte var67 = field960.method2995();
                    int var68 = field960.method2967();
                    int var69 = field960.method2967();
                    int var70 = field960.method3166();
                    int var71 = field960.method2999();
                    int var72 = (var71 >> 4 & 0x7) + Statics.field511;
                    int var73 = (var71 & 0x7) + Statics.field1376;
                    int var74 = field960.method2965();
                    int var75 = var74 >> 2;
                    int var76 = var74 & 0x3;
                    int var77 = field979[var75];
                    class75 var78;
                    if (field1037 == var69) {
                        var78 = Statics.field300;
                    } else {
                        var78 = field970[var69];
                    }
                    if (var78 != null) {
                        class259 var79 = class259.method653(var68);
                        int var80;
                        int var81;
                        if (var76 == 1 || var76 == 3) {
                            var80 = var79.field3463;
                            var81 = var79.field3484;
                        } else {
                            var80 = var79.field3484;
                            var81 = var79.field3463;
                        }
                        int var82 = (var80 >> 1) + var72;
                        int var83 = (var80 + 1 >> 1) + var72;
                        int var84 = (var81 >> 1) + var73;
                        int var85 = (var81 + 1 >> 1) + var73;
                        int[][] var86 = class62.field756[Statics.field2342];
                        int var87 = var86[var82][var84] + var86[var83][var84] + var86[var82][var85] + var86[var83][var85] >> 2;
                        int var88 = (var72 << 7) + (var80 << 6);
                        int var89 = (var73 << 7) + (var81 << 6);
                        class134 var90 = var79.method4243(var75, var76, var86, var88, var87, var89);
                        if (var90 != null) {
                            method115(Statics.field2342, var72, var73, var77, -1, 0, 0, var70 + 1, var65 + 1);
                            var78.field888 = field948 + var70;
                            var78.field889 = field948 + var65;
                            var78.field893 = var90;
                            var78.field880 = var72 * 128 + var80 * 64;
                            var78.field892 = var73 * 128 + var81 * 64;
                            var78.field887 = var87;
                            if (var63 > var64) {
                                byte var91 = var63;
                                var63 = var64;
                                var64 = var91;
                            }
                            if (var66 > var67) {
                                byte var92 = var66;
                                var66 = var67;
                                var67 = var92;
                            }
                            var78.field901 = var63 + var72;
                            var78.field896 = var64 + var72;
                            var78.field895 = var66 + var73;
                            var78.field897 = var67 + var73;
                        }
                    }
                }
                if (field1074 == 182) {
                    int var93 = field960.method2999();
                    int var94 = var93 >> 2;
                    int var95 = var93 & 0x3;
                    int var96 = field979[var94];
                    int var97 = field960.method2992();
                    int var98 = (var97 >> 4 & 0x7) + Statics.field511;
                    int var99 = (var97 & 0x7) + Statics.field1376;
                    if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                        method115(Statics.field2342, var98, var99, var96, -1, var94, var95, 0, -1);
                    }
                } else if (field1074 == 185) {
                    int var100 = field960.method2965();
                    int var101 = (var100 >> 4 & 0x7) + Statics.field511;
                    int var102 = (var100 & 0x7) + Statics.field1376;
                    int var103 = field960.method2967();
                    int var104 = field960.method2965();
                    int var105 = field960.method2967();
                    if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                        int var106 = var101 * 128 + 64;
                        int var107 = var102 * 128 + 64;
                        class85 var108 = new class85(var103, Statics.field2342, var106, var107, method971(var106, var107, Statics.field2342) - var104, var105, field948);
                        field1185.method3394(var108);
                    }
                } else if (field1074 == 78) {
                    int var109 = field960.method3002();
                    int var110 = (var109 >> 4 & 0x7) + Statics.field511;
                    int var111 = (var109 & 0x7) + Statics.field1376;
                    int var112 = field960.method3001();
                    int var113 = field960.method3001();
                    if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                        class95 var114 = new class95();
                        var114.field1475 = var112;
                        var114.field1476 = var113;
                        if (field1046[Statics.field2342][var110][var111] == null) {
                            field1046[Statics.field2342][var110][var111] = new class197();
                        }
                        field1046[Statics.field2342][var110][var111].method3394(var114);
                        method926(var110, var111);
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.gs(IIIIIIIIIB)V")
    public static final void method115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) field1047.method3389(); var10 != null; var10 = (class77) field1047.method3385()) {
            if (var10.field1208 == arg0 && var10.field1198 == arg1 && var10.field1207 == arg2 && var10.field1197 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1208 = arg0;
            var9.field1197 = arg3;
            var9.field1198 = arg1;
            var9.field1207 = arg2;
            method3460(var9);
            field1047.method3394(var9);
        }
        var9.field1203 = arg4;
        var9.field1196 = arg5;
        var9.field1204 = arg6;
        var9.field1206 = arg7;
        var9.field1205 = arg8;
    }

    @ObfuscatedName("v.gy(B)V")
    public static final void method181() {
        for (class77 var0 = (class77) field1047.method3389(); var0 != null; var0 = (class77) field1047.method3385()) {
            if (var0.field1205 == -1) {
                var0.field1206 = 0;
                method3460(var0);
            } else {
                var0.method3372();
            }
        }
    }

    @ObfuscatedName("gl.gb(Lba;I)V")
    public static final void method3460(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1197 == 0) {
            var1 = Statics.field1498.method2548(arg0.field1208, arg0.field1198, arg0.field1207);
        }
        if (arg0.field1197 == 1) {
            var1 = Statics.field1498.method2549(arg0.field1208, arg0.field1198, arg0.field1207);
        }
        if (arg0.field1197 == 2) {
            var1 = Statics.field1498.method2550(arg0.field1208, arg0.field1198, arg0.field1207);
        }
        if (arg0.field1197 == 3) {
            var1 = Statics.field1498.method2586(arg0.field1208, arg0.field1198, arg0.field1207);
        }
        if (var1 != 0) {
            int var5 = Statics.field1498.method2547(arg0.field1208, arg0.field1198, arg0.field1207, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1200 = var2;
        arg0.field1202 = var3;
        arg0.field1201 = var4;
    }

    @ObfuscatedName("hs.gu(IIIIIIII)V")
    public static final void method3807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field1082 && Statics.field2342 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1498.method2548(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1498.method2549(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1498.method2550(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1498.method2586(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1498.method2547(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1498.method2539(arg0, arg2, arg3);
                class259 var15 = class259.method653(var12);
                if (var15.field3464 != 0) {
                    field1053[arg0].method2854(arg2, arg3, var13, var14, var15.field3452);
                }
            }
            if (arg1 == 1) {
                Statics.field1498.method2579(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1498.method2541(arg0, arg2, arg3);
                class259 var16 = class259.method653(var12);
                if (var16.field3484 + arg2 > 103 || var16.field3484 + arg3 > 103 || var16.field3463 + arg2 > 103 || var16.field3463 + arg3 > 103) {
                    return;
                }
                if (var16.field3464 != 0) {
                    field1053[arg0].method2852(arg2, arg3, var16.field3484, var16.field3463, var14, var16.field3452);
                }
            }
            if (arg1 == 3) {
                Statics.field1498.method2659(arg0, arg2, arg3);
                class259 var17 = class259.method653(var12);
                if (var17.field3464 == 1) {
                    field1053[arg0].method2857(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field750[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class140 var19 = Statics.field1498;
        class165 var20 = field1053[arg0];
        class259 var21 = class259.method653(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field3463;
            var23 = var21.field3484;
        } else {
            var22 = var21.field3484;
            var23 = var21.field3463;
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
        int[][] var28 = class62.field756[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field3466 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field3487 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class142 var34;
            if (var21.field3473 == -1 && var21.field3488 == null) {
                var34 = var21.method4243(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class101(arg4, 22, arg5, var18, arg2, arg3, var21.field3473, true, (class142) null);
            }
            var19.method2528(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field3464 == 1) {
                var20.method2864(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class142 var57;
            if (var21.field3473 == -1 && var21.field3488 == null) {
                var57 = var21.method4243(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class101(arg4, 10, arg5, var18, arg2, arg3, var21.field3473, true, (class142) null);
            }
            if (var57 != null) {
                var19.method2532(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field3464 != 0) {
                var20.method2851(arg2, arg3, var22, var23, var21.field3452);
            }
        } else if (arg6 >= 12) {
            class142 var35;
            if (var21.field3473 == -1 && var21.field3488 == null) {
                var35 = var21.method4243(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class101(arg4, arg6, arg5, var18, arg2, arg3, var21.field3473, true, (class142) null);
            }
            var19.method2532(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field3464 != 0) {
                var20.method2851(arg2, arg3, var22, var23, var21.field3452);
            }
        } else if (arg6 == 0) {
            class142 var36;
            if (var21.field3473 == -1 && var21.field3488 == null) {
                var36 = var21.method4243(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class101(arg4, 0, arg5, var18, arg2, arg3, var21.field3473, true, (class142) null);
            }
            var19.method2530(arg0, arg2, arg3, var29, var36, (class142) null, class62.field755[arg5], 0, var32, var33);
            if (var21.field3464 != 0) {
                var20.method2865(arg2, arg3, arg6, arg5, var21.field3452);
            }
        } else if (arg6 == 1) {
            class142 var37;
            if (var21.field3473 == -1 && var21.field3488 == null) {
                var37 = var21.method4243(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class101(arg4, 1, arg5, var18, arg2, arg3, var21.field3473, true, (class142) null);
            }
            var19.method2530(arg0, arg2, arg3, var29, var37, (class142) null, class62.field760[arg5], 0, var32, var33);
            if (var21.field3464 != 0) {
                var20.method2865(arg2, arg3, arg6, arg5, var21.field3452);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class142 var39;
            class142 var40;
            if (var21.field3473 == -1 && var21.field3488 == null) {
                var39 = var21.method4243(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method4243(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class101(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field3473, true, (class142) null);
                var40 = new class101(arg4, 2, var38, var18, arg2, arg3, var21.field3473, true, (class142) null);
            }
            var19.method2530(arg0, arg2, arg3, var29, var39, var40, class62.field755[arg5], class62.field755[var38], var32, var33);
            if (var21.field3464 != 0) {
                var20.method2865(arg2, arg3, arg6, arg5, var21.field3452);
            }
        } else if (arg6 == 3) {
            class142 var41;
            if (var21.field3473 == -1 && var21.field3488 == null) {
                var41 = var21.method4243(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class101(arg4, 3, arg5, var18, arg2, arg3, var21.field3473, true, (class142) null);
            }
            var19.method2530(arg0, arg2, arg3, var29, var41, (class142) null, class62.field760[arg5], 0, var32, var33);
            if (var21.field3464 != 0) {
                var20.method2865(arg2, arg3, arg6, arg5, var21.field3452);
            }
        } else if (arg6 == 9) {
            class142 var42;
            if (var21.field3473 == -1 && var21.field3488 == null) {
                var42 = var21.method4243(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class101(arg4, arg6, arg5, var18, arg2, arg3, var21.field3473, true, (class142) null);
            }
            var19.method2532(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field3464 != 0) {
                var20.method2851(arg2, arg3, var22, var23, var21.field3452);
            }
        } else if (arg6 == 4) {
            class142 var43;
            if (var21.field3473 == -1 && var21.field3488 == null) {
                var43 = var21.method4243(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class101(arg4, 4, arg5, var18, arg2, arg3, var21.field3473, true, (class142) null);
            }
            var19.method2531(arg0, arg2, arg3, var29, var43, (class142) null, class62.field755[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method2548(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class259.method653(var45 >> 14 & 0x7FFF).field3471;
            }
            class142 var46;
            if (var21.field3473 == -1 && var21.field3488 == null) {
                var46 = var21.method4243(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class101(arg4, 4, arg5, var18, arg2, arg3, var21.field3473, true, (class142) null);
            }
            var19.method2531(arg0, arg2, arg3, var29, var46, (class142) null, class62.field755[arg5], 0, class62.field758[arg5] * var44, class62.field754[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method2548(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class259.method653(var48 >> 14 & 0x7FFF).field3471 / 2;
            }
            class142 var49;
            if (var21.field3473 == -1 && var21.field3488 == null) {
                var49 = var21.method4243(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class101(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3473, true, (class142) null);
            }
            var19.method2531(arg0, arg2, arg3, var29, var49, (class142) null, 256, arg5, class62.field759[arg5] * var47, class62.field761[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class142 var51;
            if (var21.field3473 == -1 && var21.field3488 == null) {
                var51 = var21.method4243(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class101(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field3473, true, (class142) null);
            }
            var19.method2531(arg0, arg2, arg3, var29, var51, (class142) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method2548(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class259.method653(var53 >> 14 & 0x7FFF).field3471 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class142 var55;
            class142 var56;
            if (var21.field3473 == -1 && var21.field3488 == null) {
                var55 = var21.method4243(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method4243(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class101(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3473, true, (class142) null);
                var56 = new class101(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field3473, true, (class142) null);
            }
            var19.method2531(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class62.field759[arg5] * var52, class62.field761[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("by.gq(III)V")
    public static final void method926(int arg0, int arg1) {
        class197 var2 = field1046[Statics.field2342][arg0][arg1];
        if (var2 == null) {
            Statics.field1498.method2544(Statics.field2342, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class95 var5 = null;
        for (class95 var6 = (class95) var2.method3389(); var6 != null; var6 = (class95) var2.method3385()) {
            class260 var7 = class260.method3655(var6.field1475);
            long var8 = (long) var7.field3524;
            if (var7.field3523 == 1) {
                var8 = (long) (var6.field1476 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1498.method2544(Statics.field2342, arg0, arg1);
            return;
        }
        var2.method3379(var5);
        class95 var10 = null;
        class95 var11 = null;
        for (class95 var12 = (class95) var2.method3389(); var12 != null; var12 = (class95) var2.method3385()) {
            if (var5.field1475 != var12.field1475) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1475 != var12.field1475 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1498.method2622(Statics.field2342, arg0, arg1, method971(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2342), var5, var13, var10, var11);
    }

    @ObfuscatedName("bo.gr(ZI)V")
    public static final void method1039(boolean arg0) {
        field1039 = 0;
        field956 = 0;
        method496();
        method323(arg0);
        method1036();
        for (int var1 = 0; var1 < field1039; var1++) {
            int var2 = field1112[var1];
            if (field948 != field953[var2].field1273) {
                field953[var2].field1374 = null;
                field953[var2] = null;
            }
        }
        if (field961 != field960.field2402) {
            throw new RuntimeException(field960.field2402 + class89.field1386 + field961);
        }
        for (int var3 = 0; var3 < field954; var3++) {
            if (field953[field955[var3]] == null) {
                throw new RuntimeException(var3 + class89.field1386 + field954);
            }
        }
    }

    @ObfuscatedName("ad.gt(I)V")
    public static final void method496() {
        field960.method3197();
        int var0 = field960.method3198(8);
        if (var0 < field954) {
            for (int var1 = var0; var1 < field954; var1++) {
                field1112[++field1039 - 1] = field955[var1];
            }
        }
        if (var0 > field954) {
            throw new RuntimeException("");
        }
        field954 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field955[var2];
            class87 var4 = field953[var3];
            int var5 = field960.method3198(1);
            if (var5 == 0) {
                field955[++field954 - 1] = var3;
                var4.field1273 = field948;
            } else {
                int var6 = field960.method3198(2);
                if (var6 == 0) {
                    field955[++field954 - 1] = var3;
                    var4.field1273 = field948;
                    field1111[++field956 - 1] = var3;
                } else if (var6 == 1) {
                    field955[++field954 - 1] = var3;
                    var4.field1273 = field948;
                    int var7 = field960.method3198(3);
                    var4.method1572(var7, (byte) 1);
                    int var8 = field960.method3198(1);
                    if (var8 == 1) {
                        field1111[++field956 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field955[++field954 - 1] = var3;
                    var4.field1273 = field948;
                    int var9 = field960.method3198(3);
                    var4.method1572(var9, (byte) 2);
                    int var10 = field960.method3198(3);
                    var4.method1572(var10, (byte) 2);
                    int var11 = field960.method3198(1);
                    if (var11 == 1) {
                        field1111[++field956 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field1112[++field1039 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("aj.gf(ZB)V")
    public static final void method323(boolean arg0) {
        while (true) {
            if (field960.method3200(field961) >= 27) {
                int var1 = field960.method3198(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field953[var1] == null) {
                        field953[var1] = new class87();
                        var2 = true;
                    }
                    class87 var3 = field953[var1];
                    field955[++field954 - 1] = var1;
                    var3.field1273 = field948;
                    int var4;
                    if (arg0) {
                        var4 = field960.method3198(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = field960.method3198(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }
                    int var5;
                    if (arg0) {
                        var5 = field960.method3198(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field960.method3198(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field1044[field960.method3198(3)];
                    if (var2) {
                        var3.field1275 = var3.field1226 = var6;
                    }
                    var3.field1374 = class262.method4152(field960.method3198(14));
                    int var7 = field960.method3198(1);
                    if (var7 == 1) {
                        field1111[++field956 - 1] = var1;
                    }
                    int var8 = field960.method3198(1);
                    var3.field1271 = var3.field1374.field3581;
                    var3.field1269 = var3.field1374.field3598;
                    if (var3.field1269 == 0) {
                        var3.field1226 = 0;
                    }
                    var3.field1232 = var3.field1374.field3576;
                    var3.field1233 = var3.field1374.field3577;
                    var3.field1268 = var3.field1374.field3578;
                    var3.field1239 = var3.field1374.field3579;
                    var3.field1229 = var3.field1374.field3573;
                    var3.field1230 = var3.field1374.field3587;
                    var3.field1242 = var3.field1374.field3585;
                    var3.method1574(Statics.field300.field1279[0] + var5, Statics.field300.field1280[0] + var4, var8 == 1);
                    continue;
                }
            }
            field960.method3199();
            return;
        }
    }

    @ObfuscatedName("bo.gp(S)V")
    public static final void method1036() {
        for (int var0 = 0; var0 < field956; var0++) {
            int var1 = field1111[var0];
            class87 var2 = field953[var1];
            int var3 = field960.method2965();
            if ((var3 & 0x2) != 0) {
                int var4 = field960.method3166();
                int var5 = field960.method3125();
                int var6 = var2.field1282 - (var4 - Statics.field590 - Statics.field590) * 64;
                int var7 = var2.field1225 - (var5 - Statics.field617 - Statics.field617) * 64;
                if (var6 != 0 || var7 != 0) {
                    var2.field1234 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field1250 = field960.method2967();
                if (var2.field1250 == 65535) {
                    var2.field1250 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var8 = field960.method3002();
                if (var8 > 0) {
                    for (int var9 = 0; var9 < var8; var9++) {
                        int var10 = -1;
                        int var11 = -1;
                        int var12 = -1;
                        int var13 = field960.method2978();
                        if (var13 == 32767) {
                            var13 = field960.method2978();
                            var11 = field960.method2978();
                            var10 = field960.method2978();
                            var12 = field960.method2978();
                        } else if (var13 == 32766) {
                            var13 = -1;
                        } else {
                            var11 = field960.method2978();
                        }
                        int var14 = field960.method2978();
                        var2.method1397(var13, var11, var10, var12, field948, var14);
                    }
                }
                int var15 = field960.method2999();
                if (var15 > 0) {
                    for (int var16 = 0; var16 < var15; var16++) {
                        int var17 = field960.method2978();
                        int var18 = field960.method2978();
                        if (var18 == 32767) {
                            var2.method1399(var17);
                        } else {
                            int var19 = field960.method2978();
                            int var20 = field960.method2999();
                            int var21 = var18 > 0 ? field960.method3002() : var20;
                            var2.method1398(var17, field948, var18, var19, var20, var21);
                        }
                    }
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field1237 = field960.method2973();
                var2.field1251 = 100;
            }
            if ((var3 & 0x40) != 0) {
                int var22 = field960.method2967();
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = field960.method2965();
                if (var2.field1256 == var22 && var22 != -1) {
                    int var24 = class264.method341(var22).field3633;
                    if (var24 == 1) {
                        var2.field1241 = 0;
                        var2.field1258 = 0;
                        var2.field1266 = var23;
                        var2.field1260 = 0;
                    }
                    if (var24 == 2) {
                        var2.field1260 = 0;
                    }
                } else if (var22 == -1 || var2.field1256 == -1 || class264.method341(var22).field3617 >= class264.method341(var2.field1256).field3617) {
                    var2.field1256 = var22;
                    var2.field1241 = 0;
                    var2.field1258 = 0;
                    var2.field1266 = var23;
                    var2.field1260 = 0;
                    var2.field1283 = var2.field1278;
                }
            }
            if ((var3 & 0x1) != 0) {
                var2.field1374 = class262.method4152(field960.method3125());
                var2.field1271 = var2.field1374.field3581;
                var2.field1269 = var2.field1374.field3598;
                var2.field1232 = var2.field1374.field3576;
                var2.field1233 = var2.field1374.field3577;
                var2.field1268 = var2.field1374.field3578;
                var2.field1239 = var2.field1374.field3579;
                var2.field1229 = var2.field1374.field3573;
                var2.field1230 = var2.field1374.field3587;
                var2.field1242 = var2.field1374.field3585;
            }
            if ((var3 & 0x4) != 0) {
                var2.field1254 = field960.method3166();
                int var25 = field960.method2970();
                var2.field1265 = var25 >> 16;
                var2.field1264 = (var25 & 0xFFFF) + field948;
                var2.field1262 = 0;
                var2.field1231 = 0;
                if (var2.field1264 > field948) {
                    var2.field1262 = -1;
                }
                if (var2.field1254 == 65535) {
                    var2.field1254 = -1;
                }
            }
        }
    }

    @ObfuscatedName("i.gc(I)V")
    public static void method137() {
        field957 = 0;
        field1063 = -1;
        field1108 = false;
    }

    @ObfuscatedName("k.gv(I)V")
    public static void method71() {
        field957 = 0;
        field1063 = -1;
        field1108 = false;
        field1060[0] = class229.field3108;
        field1061[0] = "";
        field1123[0] = 1006;
        field957 = 1;
    }

    @ObfuscatedName("bx.gh(III)V")
    public static final void method1043(int arg0, int arg1) {
        if (field957 < 2 && field1069 == 0 && !field1030) {
            return;
        }
        int var2 = method1633();
        String var3;
        if (field1069 == 1 && field957 < 2) {
            var3 = class229.field3021 + class229.field3031 + field1070 + " " + class89.field1389;
        } else if (field1030 && field957 < 2) {
            var3 = field1094 + class229.field3031 + field1075 + " " + class89.field1389;
        } else {
            var3 = method490(var2);
        }
        if (field957 > 2) {
            var3 = var3 + class89.method72(16777215) + " " + '/' + " " + (field957 - 2) + class229.field3025;
        }
        Statics.field2460.method4508(var3, arg0 + 4, arg1 + 15, 16777215, 0, field948 / 1000);
    }

    @ObfuscatedName("af.gx(IIIII)V")
    public static final void method247(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field921; var4++) {
            if (field1126[var4] + field1124[var4] > arg0 && field1124[var4] < arg0 + arg2 && field1144[var4] + field1096[var4] > arg1 && field1144[var4] < arg1 + arg3) {
                field1121[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.gi(I)V")
    public final void method1202() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field957 - 1; var2++) {
                if (field1123[var2] < 1000 && field1123[var2 + 1] > 1000) {
                    String var3 = field1061[var2];
                    field1061[var2] = field1061[var2 + 1];
                    field1061[var2 + 1] = var3;
                    String var4 = field1060[var2];
                    field1060[var2] = field1060[var2 + 1];
                    field1060[var2 + 1] = var4;
                    int var5 = field1123[var2];
                    field1123[var2] = field1123[var2 + 1];
                    field1123[var2 + 1] = var5;
                    int var6 = field1056[var2];
                    field1056[var2] = field1056[var2 + 1];
                    field1056[var2 + 1] = var6;
                    int var7 = field1057[var2];
                    field1057[var2] = field1057[var2 + 1];
                    field1057[var2 + 1] = var7;
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
        if (Statics.field664 != null || field1089 != null) {
            return;
        }
        int var9 = class60.field735;
        if (field1108) {
            if (var9 != 1 && (Statics.field242 || var9 != 4)) {
                int var10 = class60.field742;
                int var11 = class60.field738;
                if (var10 < Statics.field2849 - 10 || var10 > Statics.field2849 + Statics.field2656 + 10 || var11 < Statics.field39 - 10 || var11 > Statics.field39 + Statics.field1678 + 10) {
                    field1108 = false;
                    method247(Statics.field2849, Statics.field39, Statics.field2656, Statics.field1678);
                }
            }
            if (var9 == 1 || !Statics.field242 && var9 == 4) {
                int var12 = Statics.field2849;
                int var13 = Statics.field39;
                int var14 = Statics.field2656;
                int var15 = class60.field736;
                int var16 = class60.field724;
                int var17 = -1;
                for (int var18 = 0; var18 < field957; var18++) {
                    int var19 = (field957 - 1 - var18) * 15 + var13 + 31;
                    if (var15 > var12 && var15 < var12 + var14 && var16 > var19 - 13 && var16 < var19 + 3) {
                        var17 = var18;
                    }
                }
                if (var17 != -1 && var17 >= 0) {
                    int var20 = field1056[var17];
                    int var21 = field1057[var17];
                    int var22 = field1123[var17];
                    int var23 = field1059[var17];
                    String var24 = field1060[var17];
                    String var25 = field1061[var17];
                    method7(var20, var21, var22, var23, var24, var25, class60.field736, class60.field724);
                }
                field1108 = false;
                method247(Statics.field2849, Statics.field39, Statics.field2656, Statics.field1678);
            }
            return;
        }
        int var26 = method1633();
        if ((var9 == 1 || !Statics.field242 && var9 == 4) && var26 >= 0) {
            int var27 = field1123[var26];
            if (var27 == 39 || var27 == 40 || var27 == 41 || var27 == 42 || var27 == 43 || var27 == 33 || var27 == 34 || var27 == 35 || var27 == 36 || var27 == 37 || var27 == 38 || var27 == 1005) {
                label243: {
                    int var28 = field1056[var26];
                    int var29 = field1057[var26];
                    class220 var30 = class220.method2339(var29);
                    int var31 = method1955(var30);
                    boolean var32 = (var31 >> 28 & 0x1) != 0;
                    if (!var32) {
                        int var33 = method1955(var30);
                        boolean var34 = (var33 >> 29 & 0x1) != 0;
                        if (!var34) {
                            break label243;
                        }
                    }
                    if (Statics.field664 != null && !field1033) {
                        int var35 = method1633();
                        if (field926 != 1 && !method965(var35) && field957 > 0) {
                            method677(field1013, field1092);
                        }
                    }
                    field1033 = false;
                    field1084 = 0;
                    if (Statics.field664 != null) {
                        method1456(Statics.field664);
                    }
                    Statics.field664 = class220.method2339(var29);
                    field972 = var28;
                    field1013 = class60.field736;
                    field1092 = class60.field724;
                    if (var26 >= 0) {
                        method1705(var26);
                    }
                    method1456(Statics.field664);
                    return;
                }
            }
        }
        if ((var9 == 1 || !Statics.field242 && var9 == 4) && (field926 == 1 && field957 > 2 && !method997() || method965(var26))) {
            var9 = 2;
        }
        if ((var9 == 1 || !Statics.field242 && var9 == 4) && field957 > 0 && var26 >= 0) {
            int var36 = field1056[var26];
            int var37 = field1057[var26];
            int var38 = field1123[var26];
            int var39 = field1059[var26];
            String var40 = field1060[var26];
            String var41 = field1061[var26];
            method7(var36, var37, var38, var39, var40, var41, class60.field736, class60.field724);
        }
        if (var9 == 2 && field957 > 0) {
            this.method1057(class60.field736, class60.field724);
        }
    }

    @ObfuscatedName("client.gg(IIB)V")
    public final void method1057(int arg0, int arg1) {
        int var3 = Statics.field2460.method4487(class229.field2920);
        for (int var4 = 0; var4 < field957; var4++) {
            int var5 = Statics.field2460.method4487(method490(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field957 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field35) {
            var7 = Statics.field35 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field806) {
            var8 = Statics.field806 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field1498.method2558(Statics.field2342, arg0, arg1, false);
        field1108 = true;
        Statics.field2849 = var7;
        Statics.field39 = var8;
        Statics.field2656 = var3;
        Statics.field1678 = field957 * 15 + 22;
    }

    @ObfuscatedName("bz.gl(II)Z")
    public static final boolean method965(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field1123[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bi.ge(Lcw;IIB)V")
    public static final void method974(class90 arg0, int arg1, int arg2) {
        method7(arg0.field1402, arg0.field1400, arg0.field1398, arg0.field1399, arg0.field1396, arg0.field1396, arg1, arg2);
    }

    @ObfuscatedName("h.gw(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method7(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 46) {
            class75 var8 = field970[arg3];
            if (var8 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(189);
                field958.method2989(class51.field629[82] ? 1 : 0);
                field958.method3072(arg3);
            }
        }
        if (arg2 == 1002) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            field958.method3195(228);
            field958.method3098(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 9) {
            class87 var9 = field953[arg3];
            if (var9 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(81);
                field958.method2989(class51.field629[82] ? 1 : 0);
                field958.method2951(arg3);
            }
        }
        if (arg2 == 3) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            field1148 = arg0;
            field999 = arg1;
            field958.method3195(0);
            field958.method3098(Statics.field590 + arg0);
            field958.method2989(class51.field629[82] ? 1 : 0);
            field958.method2998(arg3 >> 14 & 0x7FFF);
            field958.method3098(Statics.field617 + arg1);
        }
        if (arg2 == 1004) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            field958.method3195(55);
            field958.method2951(arg3);
        }
        if (arg2 == 11) {
            class87 var10 = field953[arg3];
            if (var10 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(144);
                field958.method2998(arg3);
                field958.method3129(class51.field629[82] ? 1 : 0);
            }
        }
        if (arg2 == 2) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            field1148 = arg0;
            field999 = arg1;
            field958.method3195(6);
            field958.method2998(arg3 >> 14 & 0x7FFF);
            field958.method2998(field1072);
            field958.method3098(Statics.field617 + arg1);
            field958.method3008(Statics.field2516);
            field958.method2998(Statics.field590 + arg0);
            field958.method3129(class51.field629[82] ? 1 : 0);
        }
        if (arg2 == 33) {
            field958.method3195(131);
            field958.method2998(arg3);
            field958.method3078(arg1);
            field958.method3072(arg0);
            field1186 = 0;
            Statics.field19 = class220.method2339(arg1);
            field1040 = arg0;
        }
        if (arg2 == 41) {
            field958.method3195(82);
            field958.method2998(arg3);
            field958.method2998(arg0);
            field958.method3165(arg1);
            field1186 = 0;
            Statics.field19 = class220.method2339(arg1);
            field1040 = arg0;
        }
        if (arg2 == 4) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            field1148 = arg0;
            field999 = arg1;
            field958.method3195(192);
            field958.method2951(Statics.field617 + arg1);
            field958.method3072(arg3 >> 14 & 0x7FFF);
            field958.method3098(Statics.field590 + arg0);
            field958.method2997(class51.field629[82] ? 1 : 0);
        }
        if (arg2 == 45) {
            class75 var11 = field970[arg3];
            if (var11 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(234);
                field958.method3098(arg3);
                field958.method3129(class51.field629[82] ? 1 : 0);
            }
        }
        if (arg2 == 24) {
            class220 var12 = class220.method2339(arg1);
            boolean var13 = true;
            if (var12.field2722 > 0) {
                var13 = method495(var12);
            }
            if (var13) {
                field958.method3195(127);
                field958.method2953(arg1);
            }
        }
        if (arg2 == 32) {
            field958.method3195(97);
            field958.method2998(arg3);
            field958.method3165(Statics.field2516);
            field958.method3072(arg0);
            field958.method3165(arg1);
            field958.method2998(field1072);
            field1186 = 0;
            Statics.field19 = class220.method2339(arg1);
            field1040 = arg0;
        }
        if (arg2 == 15) {
            class75 var14 = field970[arg3];
            if (var14 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(156);
                field958.method2998(field1072);
                field958.method2997(class51.field629[82] ? 1 : 0);
                field958.method3078(Statics.field2516);
                field958.method3072(arg3);
            }
        }
        if (arg2 == 49) {
            class75 var15 = field970[arg3];
            if (var15 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(198);
                field958.method2989(class51.field629[82] ? 1 : 0);
                field958.method2951(arg3);
            }
        }
        if (arg2 == 35) {
            field958.method3195(101);
            field958.method2951(arg0);
            field958.method3008(arg1);
            field958.method3098(arg3);
            field1186 = 0;
            Statics.field19 = class220.method2339(arg1);
            field1040 = arg0;
        }
        if (arg2 == 51) {
            class75 var16 = field970[arg3];
            if (var16 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(119);
                field958.method2998(arg3);
                field958.method2991(class51.field629[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field958.method3195(127);
            field958.method2953(arg1);
            class220 var17 = class220.method2339(arg1);
            if (var17.field2780 != null && var17.field2780[0][0] == 5) {
                int var18 = var17.field2780[0][1];
                if (class215.field2623[var18] != var17.field2705[0]) {
                    class215.field2623[var18] = var17.field2705[0];
                    method3796(var18);
                }
            }
        }
        if (arg2 == 20) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            field1148 = arg0;
            field999 = arg1;
            field958.method3195(87);
            field958.method2997(class51.field629[82] ? 1 : 0);
            field958.method2998(Statics.field617 + arg1);
            field958.method3072(Statics.field590 + arg0);
            field958.method3098(arg3);
        }
        if (arg2 == 1001) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            field1148 = arg0;
            field999 = arg1;
            field958.method3195(175);
            field958.method3098(Statics.field590 + arg0);
            field958.method2951(Statics.field617 + arg1);
            field958.method2951(arg3 >> 14 & 0x7FFF);
            field958.method2989(class51.field629[82] ? 1 : 0);
        }
        if (arg2 == 21) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            field1148 = arg0;
            field999 = arg1;
            field958.method3195(108);
            field958.method3129(class51.field629[82] ? 1 : 0);
            field958.method2998(arg3);
            field958.method2951(Statics.field590 + arg0);
            field958.method2951(Statics.field617 + arg1);
        }
        if (arg2 == 31) {
            field958.method3195(21);
            field958.method3098(arg0);
            field958.method3072(Statics.field1664);
            field958.method3078(arg1);
            field958.method3078(Statics.field1447);
            field958.method3098(arg3);
            field958.method3072(Statics.field2213);
            field1186 = 0;
            Statics.field19 = class220.method2339(arg1);
            field1040 = arg0;
        }
        if (arg2 == 42) {
            field958.method3195(45);
            field958.method3098(arg3);
            field958.method2998(arg0);
            field958.method2953(arg1);
            field1186 = 0;
            Statics.field19 = class220.method2339(arg1);
            field1040 = arg0;
        }
        if (arg2 == 37) {
            field958.method3195(229);
            field958.method2951(arg3);
            field958.method2953(arg1);
            field958.method3072(arg0);
            field1186 = 0;
            Statics.field19 = class220.method2339(arg1);
            field1040 = arg0;
        }
        if (arg2 == 58) {
            class220 var19 = class220.method2938(arg1, arg0);
            if (var19 != null) {
                field958.method3195(239);
                field958.method2951(var19.field2788);
                field958.method2953(arg1);
                field958.method2998(arg0);
                field958.method2953(Statics.field2516);
                field958.method3072(field1073);
                field958.method3098(field1072);
            }
        }
        if (arg2 == 44) {
            class75 var20 = field970[arg3];
            if (var20 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(206);
                field958.method2998(arg3);
                field958.method2991(class51.field629[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field958.method3195(91);
            field958.method3165(arg1);
            field958.method2998(arg3);
            field958.method2998(arg0);
            field1186 = 0;
            Statics.field19 = class220.method2339(arg1);
            field1040 = arg0;
        }
        if (arg2 == 22) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            field1148 = arg0;
            field999 = arg1;
            field958.method3195(123);
            field958.method3072(Statics.field617 + arg1);
            field958.method2998(arg3);
            field958.method3072(Statics.field590 + arg0);
            field958.method2997(class51.field629[82] ? 1 : 0);
        }
        if (arg2 == 10) {
            class87 var21 = field953[arg3];
            if (var21 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(27);
                field958.method2998(arg3);
                field958.method3129(class51.field629[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            if (field1108) {
                Statics.field1498.method2653();
            } else {
                Statics.field1498.method2558(Statics.field2342, arg0, arg1, true);
            }
        }
        if (arg2 == 30 && field1080 == null) {
            method627(arg1, arg0);
            field1080 = class220.method2938(arg1, arg0);
            method1456(field1080);
        }
        if (arg2 == 1) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            field1148 = arg0;
            field999 = arg1;
            field958.method3195(77);
            field958.method3098(arg3 >> 14 & 0x7FFF);
            field958.method2951(Statics.field2213);
            field958.method3129(class51.field629[82] ? 1 : 0);
            field958.method3078(Statics.field1447);
            field958.method3098(Statics.field590 + arg0);
            field958.method3098(Statics.field1664);
            field958.method3098(Statics.field617 + arg1);
        }
        if (arg2 == 1005) {
            class220 var22 = class220.method2339(arg1);
            if (var22 == null || var22.field2787[arg0] < 100000) {
                field958.method3195(55);
                field958.method2951(arg3);
            } else {
                class99.method968(27, "", var22.field2787[arg0] + " x " + class260.method3655(arg3).field3512);
            }
            field1186 = 0;
            Statics.field19 = class220.method2339(arg1);
            field1040 = arg0;
        }
        if (arg2 == 34) {
            field958.method3195(28);
            field958.method3078(arg1);
            field958.method3098(arg3);
            field958.method2998(arg0);
            field1186 = 0;
            Statics.field19 = class220.method2339(arg1);
            field1040 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class220 var23 = class220.method2938(arg1, arg0);
            if (var23 != null) {
                method186(arg3, arg1, arg0, var23.field2788, arg5);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1219.method4949(arg2, arg3, new class216(arg0), new class216(arg1));
        }
        if (arg2 == 5) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            field1148 = arg0;
            field999 = arg1;
            field958.method3195(219);
            field958.method3098(Statics.field590 + arg0);
            field958.method2998(Statics.field617 + arg1);
            field958.method2997(class51.field629[82] ? 1 : 0);
            field958.method3072(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 8) {
            class87 var24 = field953[arg3];
            if (var24 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(118);
                field958.method3098(field1072);
                field958.method3078(Statics.field2516);
                field958.method2951(arg3);
                field958.method2989(class51.field629[82] ? 1 : 0);
            }
        }
        if (arg2 == 12) {
            class87 var25 = field953[arg3];
            if (var25 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(182);
                field958.method3129(class51.field629[82] ? 1 : 0);
                field958.method3098(arg3);
            }
        }
        if (arg2 == 38) {
            method3187();
            class220 var26 = class220.method2339(arg1);
            field1069 = 1;
            Statics.field2213 = arg0;
            Statics.field1447 = arg1;
            Statics.field1664 = arg3;
            method1456(var26);
            field1070 = class89.method72(16748608) + class260.method3655(arg3).field3512 + class89.method72(16777215);
            if (field1070 == null) {
                field1070 = "null";
            }
            return;
        }
        if (arg2 == 13) {
            class87 var27 = field953[arg3];
            if (var27 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(8);
                field958.method3072(arg3);
                field958.method2991(class51.field629[82] ? 1 : 0);
            }
        }
        if (arg2 == 28) {
            field958.method3195(127);
            field958.method2953(arg1);
            class220 var28 = class220.method2339(arg1);
            if (var28.field2780 != null && var28.field2780[0][0] == 5) {
                int var29 = var28.field2780[0][1];
                class215.field2623[var29] = 1 - class215.field2623[var29];
                method3796(var29);
            }
        }
        if (arg2 == 1003) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            class87 var30 = field953[arg3];
            if (var30 != null) {
                class262 var31 = var30.field1374;
                if (var31.field3588 != null) {
                    var31 = var31.method4388();
                }
                if (var31 != null) {
                    field958.method3195(215);
                    field958.method2951(var31.field3568);
                }
            }
        }
        if (arg2 == 40) {
            field958.method3195(78);
            field958.method3072(arg0);
            field958.method3072(arg3);
            field958.method3165(arg1);
            field1186 = 0;
            Statics.field19 = class220.method2339(arg1);
            field1040 = arg0;
        }
        if (arg2 == 16) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            field1148 = arg0;
            field999 = arg1;
            field958.method3195(64);
            field958.method3008(Statics.field1447);
            field958.method3072(Statics.field1664);
            field958.method2998(Statics.field617 + arg1);
            field958.method3072(arg3);
            field958.method3072(Statics.field2213);
            field958.method2991(class51.field629[82] ? 1 : 0);
            field958.method3098(Statics.field590 + arg0);
        }
        if (arg2 == 43) {
            field958.method3195(44);
            field958.method2998(arg3);
            field958.method2998(arg0);
            field958.method3078(arg1);
            field1186 = 0;
            Statics.field19 = class220.method2339(arg1);
            field1040 = arg0;
        }
        if (arg2 == 7) {
            class87 var32 = field953[arg3];
            if (var32 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(184);
                field958.method3072(Statics.field1664);
                field958.method2997(class51.field629[82] ? 1 : 0);
                field958.method3098(Statics.field2213);
                field958.method3078(Statics.field1447);
                field958.method2951(arg3);
            }
        }
        if (arg2 == 39) {
            field958.method3195(111);
            field958.method3098(arg3);
            field958.method2951(arg0);
            field958.method2953(arg1);
            field1186 = 0;
            Statics.field19 = class220.method2339(arg1);
            field1040 = arg0;
        }
        if (arg2 == 26) {
            method1747();
        }
        if (arg2 == 18) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            field1148 = arg0;
            field999 = arg1;
            field958.method3195(100);
            field958.method3098(arg3);
            field958.method2998(Statics.field617 + arg1);
            field958.method2991(class51.field629[82] ? 1 : 0);
            field958.method2951(Statics.field590 + arg0);
        }
        if (arg2 == 17) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            field1148 = arg0;
            field999 = arg1;
            field958.method3195(151);
            field958.method2991(class51.field629[82] ? 1 : 0);
            field958.method3165(Statics.field2516);
            field958.method2951(Statics.field590 + arg0);
            field958.method2998(field1072);
            field958.method3072(Statics.field617 + arg1);
            field958.method3072(arg3);
        }
        if (arg2 == 48) {
            class75 var33 = field970[arg3];
            if (var33 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(191);
                field958.method3072(arg3);
                field958.method2989(class51.field629[82] ? 1 : 0);
            }
        }
        if (arg2 == 19) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            field1148 = arg0;
            field999 = arg1;
            field958.method3195(52);
            field958.method2951(Statics.field617 + arg1);
            field958.method2998(Statics.field590 + arg0);
            field958.method3072(arg3);
            field958.method2991(class51.field629[82] ? 1 : 0);
        }
        if (arg2 == 14) {
            class75 var34 = field970[arg3];
            if (var34 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(251);
                field958.method2951(Statics.field2213);
                field958.method2951(Statics.field1664);
                field958.method3165(Statics.field1447);
                field958.method2997(class51.field629[82] ? 1 : 0);
                field958.method2998(arg3);
            }
        }
        if (arg2 == 47) {
            class75 var35 = field970[arg3];
            if (var35 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(173);
                field958.method2989(class51.field629[82] ? 1 : 0);
                field958.method2998(arg3);
            }
        }
        if (arg2 == 25) {
            class220 var36 = class220.method2938(arg1, arg0);
            if (var36 != null) {
                method3187();
                method182(arg1, arg0, class221.method95(method1955(var36)), var36.field2788);
                field1069 = 0;
                field1094 = method1405(var36);
                if (field1094 == null) {
                    field1094 = "Null";
                }
                if (var36.field2667) {
                    field1075 = var36.field2687 + class89.method72(16777215);
                } else {
                    field1075 = class89.method72(65280) + var36.field2784 + class89.method72(16777215);
                }
            }
            return;
        }
        if (arg2 == 50) {
            class75 var37 = field970[arg3];
            if (var37 != null) {
                field1023 = arg6;
                field1024 = arg7;
                field1026 = 2;
                field1025 = 0;
                field1148 = arg0;
                field999 = arg1;
                field958.method3195(162);
                field958.method2951(arg3);
                field958.method3129(class51.field629[82] ? 1 : 0);
            }
        }
        if (arg2 == 6) {
            field1023 = arg6;
            field1024 = arg7;
            field1026 = 2;
            field1025 = 0;
            field1148 = arg0;
            field999 = arg1;
            field958.method3195(66);
            field958.method2991(class51.field629[82] ? 1 : 0);
            field958.method2951(Statics.field590 + arg0);
            field958.method2998(arg3 >> 14 & 0x7FFF);
            field958.method3098(Statics.field617 + arg1);
        }
        if (field1069 != 0) {
            field1069 = 0;
            method1456(class220.method2339(Statics.field1447));
        }
        if (field1030) {
            method3187();
        }
        if (Statics.field19 != null && field1186 == 0) {
            method1456(Statics.field19);
        }
    }

    @ObfuscatedName("ai.hy(ILjava/lang/String;I)V")
    public static void method667(int arg0, String arg1) {
        int var2 = class97.field1488;
        int[] var3 = class97.field1491;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class75 var6 = field970[var3[var5]];
            if (var6 != null && Statics.field300 != var6 && var6.field891 != null && var6.field891.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field958.method3195(206);
                    field958.method2998(var3[var5]);
                    field958.method2991(0);
                } else if (arg0 == 4) {
                    field958.method3195(173);
                    field958.method2989(0);
                    field958.method2998(var3[var5]);
                } else if (arg0 == 6) {
                    field958.method3195(198);
                    field958.method2989(0);
                    field958.method2951(var3[var5]);
                } else if (arg0 == 7) {
                    field958.method3195(162);
                    field958.method2951(var3[var5]);
                    field958.method3129(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class99.method968(4, "", class229.field3143 + arg1);
        }
    }

    @ObfuscatedName("v.hm(IIIII)V")
    public static void method182(int arg0, int arg1, int arg2, int arg3) {
        class220 var4 = class220.method2938(arg0, arg1);
        if (var4 != null && var4.field2759 != null) {
            class70 var5 = new class70();
            var5.field830 = var4;
            var5.field838 = var4.field2759;
            class84.method152(var5);
        }
        field1073 = arg3;
        field1030 = true;
        Statics.field2516 = arg0;
        field1072 = arg1;
        Statics.field469 = arg2;
        method1456(var4);
    }

    @ObfuscatedName("fc.hb(I)V")
    public static void method3187() {
        if (!field1030) {
            return;
        }
        class220 var0 = class220.method2938(Statics.field2516, field1072);
        if (var0 != null && var0.field2760 != null) {
            class70 var1 = new class70();
            var1.field830 = var0;
            var1.field838 = var0.field2760;
            class84.method152(var1);
        }
        field1030 = false;
        method1456(var0);
    }

    @ObfuscatedName("au.hf(IIB)V")
    public static void method627(int arg0, int arg1) {
        field958.method3195(165);
        field958.method3165(arg0);
        field958.method2998(arg1);
    }

    @ObfuscatedName("ap.ha(IIIILjava/lang/String;I)V")
    public static void method186(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class220 var5 = class220.method2938(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2768 != null) {
            class70 var6 = new class70();
            var6.field830 = var5;
            var6.field832 = arg0;
            var6.field836 = arg4;
            var6.field838 = var5.field2768;
            class84.method152(var6);
        }
        boolean var7 = true;
        if (var5.field2722 > 0) {
            var7 = method495(var5);
        }
        if (!var7 || !class221.method2430(method1955(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field958.method3195(38);
            field958.method2953(arg1);
            field958.method2951(arg2);
            field958.method2951(arg3);
        }
        if (arg0 == 2) {
            field958.method3195(217);
            field958.method2953(arg1);
            field958.method2951(arg2);
            field958.method2951(arg3);
        }
        if (arg0 == 3) {
            field958.method3195(12);
            field958.method2953(arg1);
            field958.method2951(arg2);
            field958.method2951(arg3);
        }
        if (arg0 == 4) {
            field958.method3195(32);
            field958.method2953(arg1);
            field958.method2951(arg2);
            field958.method2951(arg3);
        }
        if (arg0 == 5) {
            field958.method3195(49);
            field958.method2953(arg1);
            field958.method2951(arg2);
            field958.method2951(arg3);
        }
        if (arg0 == 6) {
            field958.method3195(154);
            field958.method2953(arg1);
            field958.method2951(arg2);
            field958.method2951(arg3);
        }
        if (arg0 == 7) {
            field958.method3195(76);
            field958.method2953(arg1);
            field958.method2951(arg2);
            field958.method2951(arg3);
        }
        if (arg0 == 8) {
            field958.method3195(166);
            field958.method2953(arg1);
            field958.method2951(arg2);
            field958.method2951(arg3);
        }
        if (arg0 == 9) {
            field958.method3195(183);
            field958.method2953(arg1);
            field958.method2951(arg2);
            field958.method2951(arg3);
        }
        if (arg0 == 10) {
            field958.method3195(185);
            field958.method2953(arg1);
            field958.method2951(arg2);
            field958.method2951(arg3);
        }
    }

    @ObfuscatedName("o.hu(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method51(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method1748(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("cn.hc(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method1748(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field1108 || field957 >= 500) {
            return;
        }
        field1060[field957] = arg0;
        field1061[field957] = arg1;
        field1123[field957] = arg2;
        field1059[field957] = arg3;
        field1056[field957] = arg4;
        field1057[field957] = arg5;
        if (arg6) {
            field1063 = field957;
        }
        field957++;
    }

    @ObfuscatedName("cb.hp(I)I")
    public static final int method1633() {
        if (field957 <= 0) {
            return -1;
        } else if (field1064 && class51.field629[81] && field1063 != -1) {
            return field1063;
        } else {
            return field957 - 1;
        }
    }

    @ObfuscatedName("be.hn(I)Z")
    public static final boolean method997() {
        if (field957 <= 0) {
            return false;
        } else {
            return field1064 && class51.field629[81] && field1063 != -1;
        }
    }

    @ObfuscatedName("by.hq(I)V")
    public static void method951() {
        for (int var0 = 0; var0 < field957; var0++) {
            int var1 = field1123[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field957 - 1) {
                    for (int var3 = var0; var3 < field957 - 1; var3++) {
                        field1060[var3] = field1060[var3 + 1];
                        field1061[var3] = field1061[var3 + 1];
                        field1123[var3] = field1123[var3 + 1];
                        field1059[var3] = field1059[var3 + 1];
                        field1056[var3] = field1056[var3 + 1];
                        field1057[var3] = field1057[var3 + 1];
                    }
                }
                field957--;
            }
        }
    }

    @ObfuscatedName("ax.hz(II)Ljava/lang/String;")
    public static String method490(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field1061[arg0].length() > 0) {
            return field1060[arg0] + class229.field3031 + field1061[arg0];
        } else {
            return field1060[arg0];
        }
    }

    @ObfuscatedName("by.he(IIIII)V")
    public static final void method949(int arg0, int arg1, int arg2, int arg3) {
        if (field1069 == 0 && !field1030) {
            method51(class229.field3130, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class135.field2002; var6++) {
            int var7 = class135.field1995[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field1498.method2547(Statics.field2342, var8, var9, var7) >= 0) {
                    class259 var12 = class259.method653(var11);
                    if (var12.field3488 != null) {
                        var12 = var12.method4246();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field1069 == 1) {
                        method51(class229.field3021, field1070 + " " + class89.field1389 + " " + class89.method72(65535) + var12.field3457, 1, var7, var8, var9);
                    } else if (!field1030) {
                        String[] var13 = var12.field3474;
                        if (field1110) {
                            var13 = method244(var13);
                        }
                        if (var13 != null) {
                            for (int var14 = 4; var14 >= 0; var14--) {
                                if (var13[var14] != null) {
                                    short var15 = 0;
                                    if (var14 == 0) {
                                        var15 = 3;
                                    }
                                    if (var14 == 1) {
                                        var15 = 4;
                                    }
                                    if (var14 == 2) {
                                        var15 = 5;
                                    }
                                    if (var14 == 3) {
                                        var15 = 6;
                                    }
                                    if (var14 == 4) {
                                        var15 = 1001;
                                    }
                                    method51(var13[var14], class89.method72(65535) + var12.field3457, var15, var7, var8, var9);
                                }
                            }
                        }
                        method51(class229.field3128, class89.method72(65535) + var12.field3457, 1002, var12.field3454 << 14, var8, var9);
                    } else if ((Statics.field469 & 0x4) == 4) {
                        method51(field1094, field1075 + " " + class89.field1389 + " " + class89.method72(65535) + var12.field3457, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class87 var16 = field953[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field1374.field3581 == 1 && (var16.field1282 & 0x7F) == 64 && (var16.field1225 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field954; var17++) {
                            class87 var18 = field953[field955[var17]];
                            if (var18 != null && var16 != var18 && var18.field1374.field3581 == 1 && var16.field1282 == var18.field1282 && var16.field1225 == var18.field1225) {
                                method2236(var18.field1374, field955[var17], var8, var9);
                            }
                        }
                        int var19 = class97.field1488;
                        int[] var20 = class97.field1491;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class75 var22 = field970[var20[var21]];
                            if (var22 != null && var16.field1282 == var22.field1282 && var16.field1225 == var22.field1225) {
                                method458(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method2236(var16.field1374, var11, var8, var9);
                }
                if (var10 == 0) {
                    class75 var23 = field970[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field1282 & 0x7F) == 64 && (var23.field1225 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field954; var24++) {
                            class87 var25 = field953[field955[var24]];
                            if (var25 != null && var25.field1374.field3581 == 1 && var23.field1282 == var25.field1282 && var23.field1225 == var25.field1225) {
                                method2236(var25.field1374, field955[var24], var8, var9);
                            }
                        }
                        int var26 = class97.field1488;
                        int[] var27 = class97.field1491;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class75 var29 = field970[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field1282 == var29.field1282 && var23.field1225 == var29.field1225) {
                                method458(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field1190 == var11) {
                        var4 = var7;
                    } else {
                        method458(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class197 var30 = field1046[Statics.field2342][var8][var9];
                    if (var30 != null) {
                        for (class95 var31 = (class95) var30.method3410(); var31 != null; var31 = (class95) var30.method3386()) {
                            class260 var32 = class260.method3655(var31.field1475);
                            if (field1069 == 1) {
                                method51(class229.field3021, field1070 + " " + class89.field1389 + " " + class89.method72(16748608) + var32.field3512, 16, var31.field1475, var8, var9);
                            } else if (!field1030) {
                                String[] var33 = var32.field3526;
                                if (field1110) {
                                    var33 = method244(var33);
                                }
                                for (int var34 = 4; var34 >= 0; var34--) {
                                    if (var33 != null && var33[var34] != null) {
                                        byte var35 = 0;
                                        if (var34 == 0) {
                                            var35 = 18;
                                        }
                                        if (var34 == 1) {
                                            var35 = 19;
                                        }
                                        if (var34 == 2) {
                                            var35 = 20;
                                        }
                                        if (var34 == 3) {
                                            var35 = 21;
                                        }
                                        if (var34 == 4) {
                                            var35 = 22;
                                        }
                                        method51(var33[var34], class89.method72(16748608) + var32.field3512, var35, var31.field1475, var8, var9);
                                    } else if (var34 == 2) {
                                        method51(class229.field2872, class89.method72(16748608) + var32.field3512, 20, var31.field1475, var8, var9);
                                    }
                                }
                                method51(class229.field3128, class89.method72(16748608) + var32.field3512, 1004, var31.field1475, var8, var9);
                            } else if ((Statics.field469 & 0x1) == 1) {
                                method51(field1094, field1075 + " " + class89.field1389 + " " + class89.method72(16748608) + var32.field3512, 17, var31.field1475, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class75 var38 = field970[field1190];
            method458(var38, field1190, var36, var37);
        }
    }

    @ObfuscatedName("dr.hx(Lji;IIII)V")
    public static final void method2236(class262 arg0, int arg1, int arg2, int arg3) {
        if (field957 >= 400) {
            return;
        }
        if (arg0.field3588 != null) {
            arg0 = arg0.method4388();
        }
        if (arg0 == null || !arg0.field3597 || arg0.field3599 && field978 != arg1) {
            return;
        }
        String var4 = arg0.field3569;
        if (arg0.field3586 != 0) {
            int var6 = arg0.field3586;
            int var7 = Statics.field300.field885;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class89.method72(16711680);
            } else if (var8 < -6) {
                var9 = class89.method72(16723968);
            } else if (var8 < -3) {
                var9 = class89.method72(16740352);
            } else if (var8 < 0) {
                var9 = class89.method72(16756736);
            } else if (var8 > 9) {
                var9 = class89.method72(65280);
            } else if (var8 > 6) {
                var9 = class89.method72(4259584);
            } else if (var8 > 3) {
                var9 = class89.method72(8453888);
            } else if (var8 > 0) {
                var9 = class89.method72(12648192);
            } else {
                var9 = class89.method72(16776960);
            }
            var4 = var4 + var9 + " " + class89.field1387 + class229.field3027 + arg0.field3586 + class89.field1388;
        }
        if (arg0.field3599 && field1062) {
            method51(class229.field3128, class89.method72(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1069 == 1) {
            method51(class229.field3021, field1070 + " " + class89.field1389 + " " + class89.method72(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1030) {
            int var10 = arg0.field3599 && field1062 ? 2000 : 0;
            String[] var11 = arg0.field3584;
            if (field1110) {
                var11 = method244(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class229.field3023)) {
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
                        method51(var11[var12], class89.method72(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class229.field3023)) {
                        short var15 = 0;
                        if (field918 != class92.field1415) {
                            if (field918 == class92.field1412 || field918 == class92.field1411 && arg0.field3586 > Statics.field300.field885) {
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
                            method51(var11[var14], class89.method72(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3599 || !field1062) {
                method51(class229.field3128, class89.method72(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field469 & 0x2) == 2) {
            method51(field1094, field1075 + " " + class89.field1389 + " " + class89.method72(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("as.hv(Lbo;IIII)V")
    public static final void method458(class75 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field300 == arg0 || field957 >= 400) {
            return;
        }
        String var9;
        if (arg0.field890 == 0) {
            String var4 = arg0.field884[0] + arg0.field891 + arg0.field884[1];
            int var5 = arg0.field885;
            int var6 = Statics.field300.field885;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class89.method72(16711680);
            } else if (var7 < -6) {
                var8 = class89.method72(16723968);
            } else if (var7 < -3) {
                var8 = class89.method72(16740352);
            } else if (var7 < 0) {
                var8 = class89.method72(16756736);
            } else if (var7 > 9) {
                var8 = class89.method72(65280);
            } else if (var7 > 6) {
                var8 = class89.method72(4259584);
            } else if (var7 > 3) {
                var8 = class89.method72(8453888);
            } else if (var7 > 0) {
                var8 = class89.method72(12648192);
            } else {
                var8 = class89.method72(16776960);
            }
            var9 = var4 + var8 + " " + class89.field1387 + class229.field3027 + arg0.field885 + class89.field1388 + arg0.field884[2];
        } else {
            var9 = arg0.field884[0] + arg0.field891 + arg0.field884[1] + " " + class89.field1387 + class229.field3028 + arg0.field890 + class89.field1388 + arg0.field884[2];
        }
        if (field1069 == 1) {
            method51(class229.field3021, field1070 + " " + class89.field1389 + " " + class89.method72(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field1030) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field998[var10] != null) {
                    short var11 = 0;
                    if (field998[var10].equalsIgnoreCase(class229.field3023)) {
                        if (field942 == class92.field1415) {
                            continue;
                        }
                        if (field942 == class92.field1412 || field942 == class92.field1411 && arg0.field885 > Statics.field300.field885) {
                            var11 = 2000;
                        }
                        if (Statics.field300.field882 != 0 && arg0.field882 != 0) {
                            if (Statics.field300.field882 == arg0.field882) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field1043[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field1041[var10] + var11;
                    method51(field998[var10], class89.method72(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field469 & 0x8) == 8) {
            method51(field1094, field1075 + " " + class89.field1389 + " " + class89.method72(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field957; var14++) {
            if (field1123[var14] == 23) {
                field1061[var14] = class89.method72(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("m.hd(IIIIIIIII)V")
    public static final void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class220.method4620(arg0)) {
            Statics.field667 = null;
            method11(Statics.field2627[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field667 != null) {
                method11(Statics.field667, -1412584499, arg1, arg2, arg3, arg4, Statics.field2232, Statics.field1482, arg7);
                Statics.field667 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1121[var8] = true;
            }
        } else {
            field1121[arg7] = true;
        }
    }

    @ObfuscatedName("h.hw([Lhe;IIIIIIIII)V")
    public static final void method11(class220[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class285.method4655(arg2, arg3, arg4, arg5);
        class137.method2433();
        label1420: for (int var9 = 0; var9 < arg0.length; var9++) {
            class220 var10 = arg0[var9];
            if (var10 != null && (var10.field2693 == arg1 || arg1 == -1412584499 && field1089 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1124[field921] = var10.field2681 + arg6;
                    field1144[field921] = var10.field2682 + arg7;
                    field1126[field921] = var10.field2683;
                    field1096[field921] = var10.field2684;
                    var11 = ++field921 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2785 = var11;
                var10.field2800 = field948;
                if (!var10.field2667 || !Statics.method1485(var10)) {
                    if (var10.field2722 > 0) {
                        int var12 = var10.field2722;
                        if (var12 == 324) {
                            if (field962 == -1) {
                                field962 = var10.field2703;
                                field1189 = var10.field2704;
                            }
                            if (field1187.field2637) {
                                var10.field2703 = field962;
                            } else {
                                var10.field2703 = field1189;
                            }
                        } else if (var12 == 325) {
                            if (field962 == -1) {
                                field962 = var10.field2703;
                                field1189 = var10.field2704;
                            }
                            if (field1187.field2637) {
                                var10.field2703 = field1189;
                            } else {
                                var10.field2703 = field962;
                            }
                        } else if (var12 == 327) {
                            var10.field2719 = 150;
                            var10.field2720 = (int) (Math.sin((double) field948 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2711 = 5;
                            var10.field2767 = 0;
                        } else if (var12 == 328) {
                            var10.field2719 = 150;
                            var10.field2720 = (int) (Math.sin((double) field948 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2711 = 5;
                            var10.field2767 = 1;
                        }
                    }
                    int var13 = var10.field2681 + arg6;
                    int var14 = var10.field2682 + arg7;
                    int var15 = var10.field2699;
                    if (field1089 == var10) {
                        if (arg1 != -1412584499 && !var10.field2725) {
                            Statics.field667 = arg0;
                            Statics.field2232 = arg6;
                            Statics.field1482 = arg7;
                            continue;
                        }
                        if (field1100 && field1031) {
                            int var16 = class60.field742;
                            int var17 = class60.field738;
                            int var18 = var16 - field1091;
                            int var19 = var17 - field1098;
                            if (var18 < field1132) {
                                var18 = field1132;
                            }
                            if (var10.field2683 + var18 > field1132 + field1114.field2683) {
                                var18 = field1132 + field1114.field2683 - var10.field2683;
                            }
                            if (var19 < field1113) {
                                var19 = field1113;
                            }
                            if (var10.field2684 + var19 > field1113 + field1114.field2684) {
                                var19 = field1113 + field1114.field2684 - var10.field2684;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2725) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2670 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2670 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2683 + var13;
                        int var27 = var10.field2684 + var14;
                        if (var26 < var13) {
                            var24 = var26;
                            var26 = var13;
                        }
                        if (var27 < var14) {
                            var25 = var27;
                            var27 = var14;
                        }
                        var26++;
                        var27++;
                        var20 = var24 > arg2 ? var24 : arg2;
                        var21 = var25 > arg3 ? var25 : arg3;
                        var22 = var26 < arg4 ? var26 : arg4;
                        var23 = var27 < arg5 ? var27 : arg5;
                    } else {
                        int var30 = var10.field2683 + var13;
                        int var31 = var10.field2684 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2667 || var20 < var22 && var21 < var23) {
                        if (var10.field2722 != 0) {
                            if (var10.field2722 == 1336) {
                                if (field932) {
                                    var14 += 15;
                                    Statics.field269.method4489("Fps:" + field716, var10.field2683 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field1082) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field1082) {
                                        var34 = 16711680;
                                    }
                                    Statics.field269.method4489("Mem:" + var33 + "k", var10.field2683 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2722 == 1337) {
                                field1065 = var13;
                                field1066 = var14;
                                int var37 = var10.field2683;
                                int var38 = var10.field2684;
                                field1020++;
                                method1001(class67.field803);
                                boolean var39 = false;
                                if (field1190 >= 0) {
                                    int var40 = class97.field1488;
                                    int[] var41 = class97.field1491;
                                    for (int var42 = 0; var42 < var40; var42++) {
                                        if (field1190 == var41[var42]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method1001(class67.field804);
                                }
                                method907(true);
                                method1001(var39 ? class67.field809 : class67.field802);
                                method907(false);
                                for (class94 var43 = (class94) field1048.method3389(); var43 != null; var43 = (class94) field1048.method3385()) {
                                    if (Statics.field2342 != var43.field1449 || field948 > var43.field1455) {
                                        var43.method3372();
                                    } else if (field948 >= var43.field1459) {
                                        if (var43.field1458 > 0) {
                                            class87 var44 = field953[var43.field1458 - 1];
                                            if (var44 != null && var44.field1282 >= 0 && var44.field1282 < 13312 && var44.field1225 >= 0 && var44.field1225 < 13312) {
                                                var43.method1635(var44.field1282, var44.field1225, method971(var44.field1282, var44.field1225, var43.field1449) - var43.field1453, field948);
                                            }
                                        }
                                        if (var43.field1458 < 0) {
                                            int var45 = -var43.field1458 - 1;
                                            class75 var46;
                                            if (field1037 == var45) {
                                                var46 = Statics.field300;
                                            } else {
                                                var46 = field970[var45];
                                            }
                                            if (var46 != null && var46.field1282 >= 0 && var46.field1282 < 13312 && var46.field1225 >= 0 && var46.field1225 < 13312) {
                                                var43.method1635(var46.field1282, var46.field1225, method971(var46.field1282, var46.field1225, var43.field1449) - var43.field1453, field948);
                                            }
                                        }
                                        var43.method1637(field992);
                                        Statics.field1498.method2669(Statics.field2342, (int) var43.field1448, (int) var43.field1461, (int) var43.field1456, 60, var43, var43.field1468, -1, false);
                                    }
                                }
                                method969();
                                method705(var13, var14, var37, var38, true);
                                int var47 = field1176;
                                int var48 = field1177;
                                int var49 = field1178;
                                int var50 = field1179;
                                class285.method4655(var47, var48, var47 + var49, var48 + var50);
                                class137.method2433();
                                if (!field1162) {
                                    int var51 = field971;
                                    if (field1055 / 256 > var51) {
                                        var51 = field1055 / 256;
                                    }
                                    if (field1163[4] && field1165[4] + 128 > var51) {
                                        var51 = field1165[4] + 128;
                                    }
                                    int var52 = field1085 + field1000 & 0x7FF;
                                    method3937(Statics.field565, method971(Statics.field300.field1282, Statics.field300.field1225, Statics.field2342) - field1058, Statics.field669, var51, var52, var51 * 3 + 600);
                                }
                                int var65;
                                if (field1162) {
                                    var65 = method1956();
                                } else {
                                    int var53;
                                    if (Statics.field1375.field1314) {
                                        var53 = Statics.field2342;
                                    } else {
                                        label1539: {
                                            int var54 = 3;
                                            if (Statics.field763 < 310) {
                                                int var55 = Statics.field1520 >> 7;
                                                int var56 = Statics.field271 >> 7;
                                                int var57 = Statics.field300.field1282 >> 7;
                                                int var58 = Statics.field300.field1225 >> 7;
                                                if (var55 < 0 || var56 < 0 || var55 >= 104 || var56 >= 104) {
                                                    var53 = Statics.field2342;
                                                    break label1539;
                                                }
                                                if ((class62.field750[Statics.field2342][var55][var56] & 0x4) != 0) {
                                                    var54 = Statics.field2342;
                                                }
                                                int var59;
                                                if (var57 > var55) {
                                                    var59 = var57 - var55;
                                                } else {
                                                    var59 = var55 - var57;
                                                }
                                                int var60;
                                                if (var58 > var56) {
                                                    var60 = var58 - var56;
                                                } else {
                                                    var60 = var56 - var58;
                                                }
                                                if (var59 > var60) {
                                                    int var61 = var60 * 65536 / var59;
                                                    int var62 = 32768;
                                                    while (var55 != var57) {
                                                        if (var55 < var57) {
                                                            var55++;
                                                        } else if (var55 > var57) {
                                                            var55--;
                                                        }
                                                        if ((class62.field750[Statics.field2342][var55][var56] & 0x4) != 0) {
                                                            var54 = Statics.field2342;
                                                        }
                                                        var62 += var61;
                                                        if (var62 >= 65536) {
                                                            var62 -= 65536;
                                                            if (var56 < var58) {
                                                                var56++;
                                                            } else if (var56 > var58) {
                                                                var56--;
                                                            }
                                                            if ((class62.field750[Statics.field2342][var55][var56] & 0x4) != 0) {
                                                                var54 = Statics.field2342;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int var63 = var59 * 65536 / var60;
                                                    int var64 = 32768;
                                                    while (var56 != var58) {
                                                        if (var56 < var58) {
                                                            var56++;
                                                        } else if (var56 > var58) {
                                                            var56--;
                                                        }
                                                        if ((class62.field750[Statics.field2342][var55][var56] & 0x4) != 0) {
                                                            var54 = Statics.field2342;
                                                        }
                                                        var64 += var63;
                                                        if (var64 >= 65536) {
                                                            var64 -= 65536;
                                                            if (var55 < var57) {
                                                                var55++;
                                                            } else if (var55 > var57) {
                                                                var55--;
                                                            }
                                                            if ((class62.field750[Statics.field2342][var55][var56] & 0x4) != 0) {
                                                                var54 = Statics.field2342;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (Statics.field300.field1282 >= 0 && Statics.field300.field1225 >= 0 && Statics.field300.field1282 < 13312 && Statics.field300.field1225 < 13312) {
                                                if ((class62.field750[Statics.field2342][Statics.field300.field1282 >> 7][Statics.field300.field1225 >> 7] & 0x4) != 0) {
                                                    var54 = Statics.field2342;
                                                }
                                                var53 = var54;
                                            } else {
                                                var53 = Statics.field2342;
                                            }
                                        }
                                    }
                                    var65 = var53;
                                }
                                int var66 = Statics.field1520;
                                int var67 = Statics.field740;
                                int var68 = Statics.field271;
                                int var69 = Statics.field763;
                                int var70 = Statics.field1417;
                                for (int var71 = 0; var71 < 5; var71++) {
                                    if (field1163[var71]) {
                                        int var72 = (int) (Math.random() * (double) (field1167[var71] * 2 + 1) - (double) field1167[var71] + Math.sin((double) field1166[var71] / 100.0D * (double) field1042[var71]) * (double) field1165[var71]);
                                        if (var71 == 0) {
                                            Statics.field1520 += var72;
                                        }
                                        if (var71 == 1) {
                                            Statics.field740 += var72;
                                        }
                                        if (var71 == 2) {
                                            Statics.field271 += var72;
                                        }
                                        if (var71 == 3) {
                                            Statics.field1417 = Statics.field1417 + var72 & 0x7FF;
                                        }
                                        if (var71 == 4) {
                                            Statics.field763 += var72;
                                            if (Statics.field763 < 128) {
                                                Statics.field763 = 128;
                                            }
                                            if (Statics.field763 > 383) {
                                                Statics.field763 = 383;
                                            }
                                        }
                                    }
                                }
                                int var73 = class60.field742;
                                int var74 = class60.field738;
                                if (class60.field735 != 0) {
                                    var73 = class60.field736;
                                    var74 = class60.field724;
                                }
                                if (var73 >= var47 && var73 < var47 + var49 && var74 >= var48 && var74 < var48 + var50) {
                                    int var75 = var73 - var47;
                                    int var76 = var74 - var48;
                                    class135.field1993 = var75;
                                    class135.field1994 = var76;
                                    class135.field1998 = true;
                                    class135.field2002 = 0;
                                    class135.field1996 = false;
                                } else {
                                    class135.method1714();
                                }
                                method212();
                                class285.method4701(var47, var48, var49, var50, 0);
                                method212();
                                int var77 = class137.field2030;
                                class137.field2030 = field1180;
                                Statics.field1498.method2562(Statics.field1520, Statics.field740, Statics.field271, Statics.field763, Statics.field1417, var65);
                                while (true) {
                                    class10 var78 = (class10) class8.field237.method3347();
                                    if (var78 == null) {
                                        class137.field2030 = var77;
                                        method212();
                                        Statics.field1498.method2536();
                                        field1009 = 0;
                                        boolean var79 = false;
                                        int var80 = -1;
                                        int var81 = class97.field1488;
                                        int[] var82 = class97.field1491;
                                        for (int var83 = 0; var83 < field954 + var81; var83++) {
                                            class79 var84;
                                            if (var83 < var81) {
                                                var84 = field970[var82[var83]];
                                                if (field1190 == var82[var83]) {
                                                    var79 = true;
                                                    var80 = var83;
                                                    continue;
                                                }
                                            } else {
                                                var84 = field953[field955[var83 - var81]];
                                            }
                                            method467(var84, var83, var47, var48, var49, var50);
                                        }
                                        if (var79) {
                                            method467(field970[field1190], var80, var47, var48, var49, var50);
                                        }
                                        for (int var85 = 0; var85 < field1009; var85++) {
                                            int var86 = field1011[var85];
                                            int var87 = field1012[var85];
                                            int var88 = field1014[var85];
                                            int var89 = field1182[var85];
                                            boolean var90 = true;
                                            while (var90) {
                                                var90 = false;
                                                for (int var91 = 0; var91 < var85; var91++) {
                                                    if (var87 + 2 > field1012[var91] - field1182[var91] && var87 - var89 < field1012[var91] + 2 && var86 - var88 < field1014[var91] + field1011[var91] && var86 + var88 > field1011[var91] - field1014[var91] && field1012[var91] - field1182[var91] < var87) {
                                                        var87 = field1012[var91] - field1182[var91];
                                                        var90 = true;
                                                    }
                                                }
                                            }
                                            field977 = field1011[var85];
                                            field1022 = field1012[var85] = var87;
                                            String var92 = field1018[var85];
                                            if (field1078 == 0) {
                                                int var93 = 16776960;
                                                if (field922[var85] < 6) {
                                                    var93 = field1131[field922[var85]];
                                                }
                                                if (field922[var85] == 6) {
                                                    var93 = field1020 % 20 < 10 ? 16711680 : 16776960;
                                                }
                                                if (field922[var85] == 7) {
                                                    var93 = field1020 % 20 < 10 ? 255 : 65535;
                                                }
                                                if (field922[var85] == 8) {
                                                    var93 = field1020 % 20 < 10 ? 45056 : 8454016;
                                                }
                                                if (field922[var85] == 9) {
                                                    int var94 = 150 - field1017[var85];
                                                    if (var94 < 50) {
                                                        var93 = var94 * 1280 + 16711680;
                                                    } else if (var94 < 100) {
                                                        var93 = 16776960 - (var94 - 50) * 327680;
                                                    } else if (var94 < 150) {
                                                        var93 = (var94 - 100) * 5 + 65280;
                                                    }
                                                }
                                                if (field922[var85] == 10) {
                                                    int var95 = 150 - field1017[var85];
                                                    if (var95 < 50) {
                                                        var93 = var95 * 5 + 16711680;
                                                    } else if (var95 < 100) {
                                                        var93 = 16711935 - (var95 - 50) * 327680;
                                                    } else if (var95 < 150) {
                                                        var93 = (var95 - 100) * 327680 + 255 - (var95 - 100) * 5;
                                                    }
                                                }
                                                if (field922[var85] == 11) {
                                                    int var96 = 150 - field1017[var85];
                                                    if (var96 < 50) {
                                                        var93 = 16777215 - var96 * 327685;
                                                    } else if (var96 < 100) {
                                                        var93 = (var96 - 50) * 327685 + 65280;
                                                    } else if (var96 < 150) {
                                                        var93 = 16777215 - (var96 - 100) * 327680;
                                                    }
                                                }
                                                if (field1016[var85] == 0) {
                                                    Statics.field2460.method4490(var92, field977 + var47, field1022 + var48, var93, 0);
                                                }
                                                if (field1016[var85] == 1) {
                                                    Statics.field2460.method4492(var92, field977 + var47, field1022 + var48, var93, 0, field1020);
                                                }
                                                if (field1016[var85] == 2) {
                                                    Statics.field2460.method4510(var92, field977 + var47, field1022 + var48, var93, 0, field1020);
                                                }
                                                if (field1016[var85] == 3) {
                                                    Statics.field2460.method4550(var92, field977 + var47, field1022 + var48, var93, 0, field1020, 150 - field1017[var85]);
                                                }
                                                if (field1016[var85] == 4) {
                                                    int var97 = (150 - field1017[var85]) * (Statics.field2460.method4487(var92) + 100) / 150;
                                                    class285.method4656(field977 + var47 - 50, var48, field977 + var47 + 50, var48 + var50);
                                                    Statics.field2460.method4503(var92, field977 + var47 + 50 - var97, field1022 + var48, var93, 0);
                                                    class285.method4655(var47, var48, var47 + var49, var48 + var50);
                                                }
                                                if (field1016[var85] == 5) {
                                                    int var98 = 150 - field1017[var85];
                                                    int var99 = 0;
                                                    if (var98 < 25) {
                                                        var99 = var98 - 25;
                                                    } else if (var98 > 125) {
                                                        var99 = var98 - 125;
                                                    }
                                                    class285.method4656(var47, field1022 + var48 - Statics.field2460.field3659 - 1, var47 + var49, field1022 + var48 + 5);
                                                    Statics.field2460.method4490(var92, field977 + var47, field1022 + var48 + var99, var93, 0);
                                                    class285.method4655(var47, var48, var47 + var49, var48 + var50);
                                                }
                                            } else {
                                                Statics.field2460.method4490(var92, field977 + var47, field1022 + var48, 16776960, 0);
                                            }
                                        }
                                        if (field934 == 2) {
                                            Statics.method454((field937 - Statics.field590 << 7) + field940, (field938 - Statics.field617 << 7) + field941, field1067 * 2);
                                            if (field977 > -1 && field948 % 20 < 10) {
                                                Statics.field1209[0].method4795(field977 + var47 - 12, field1022 + var48 - 28);
                                            }
                                        }
                                        ((class126) Statics.field2009).method2221(field992);
                                        if (field1026 == 1) {
                                            Statics.field345[field1025 / 100].method4795(field1023 - 8, field1024 - 8);
                                        }
                                        if (field1026 == 2) {
                                            Statics.field345[field1025 / 100 + 4].method4795(field1023 - 8, field1024 - 8);
                                        }
                                        field1035 = 0;
                                        int var100 = (Statics.field300.field1282 >> 7) + Statics.field590;
                                        int var101 = (Statics.field300.field1225 >> 7) + Statics.field617;
                                        if (var100 >= 3053 && var100 <= 3156 && var101 >= 3056 && var101 <= 3136) {
                                            field1035 = 1;
                                        }
                                        if (var100 >= 3072 && var100 <= 3118 && var101 >= 9492 && var101 <= 9535) {
                                            field1035 = 1;
                                        }
                                        if (field1035 == 1 && var100 >= 3139 && var100 <= 3199 && var101 >= 3008 && var101 <= 3062) {
                                            field1035 = 0;
                                        }
                                        Statics.field1520 = var66;
                                        Statics.field740 = var67;
                                        Statics.field271 = var68;
                                        Statics.field763 = var69;
                                        Statics.field1417 = var70;
                                        if (field925) {
                                            byte var102 = 0;
                                            int var103 = class242.field3272 + class242.field3270 + var102;
                                            if (var103 == 0) {
                                                field925 = false;
                                            }
                                        }
                                        if (field925) {
                                            class285.method4701(var47, var48, var49, var50, 0);
                                            method2742(class229.field3039, false);
                                        }
                                        field1121[var10.field2785] = true;
                                        class285.method4655(arg2, arg3, arg4, arg5);
                                        continue label1420;
                                    }
                                    var78.method37();
                                }
                            }
                            if (var10.field2722 == 1338) {
                                method212();
                                class214 var105 = var10.method3747(false);
                                if (var105 != null) {
                                    class285.method4655(var13, var14, var105.field2618 + var13, var105.field2617 + var14);
                                    if (field1054 == 2 || field1054 == 5) {
                                        class285.method4678(var13, var14, 0, var105.field2620, var105.field2619);
                                    } else {
                                        int var106 = field987 + field1000 & 0x7FF;
                                        int var107 = Statics.field300.field1282 / 32 + 48;
                                        int var108 = 464 - Statics.field300.field1225 / 32;
                                        Statics.field875.method4785(var13, var14, var105.field2618, var105.field2617, var107, var108, var106, field994 + 256, var105.field2620, var105.field2619);
                                        for (int var109 = 0; var109 < field1004; var109++) {
                                            int var110 = field1145[var109] * 4 + 2 - Statics.field300.field1282 / 32;
                                            int var111 = field1146[var109] * 4 + 2 - Statics.field300.field1225 / 32;
                                            method12(var13, var14, var110, var111, field1147[var109], var105);
                                        }
                                        int var112 = 0;
                                        while (true) {
                                            if (var112 >= 104) {
                                                for (int var117 = 0; var117 < field954; var117++) {
                                                    class87 var118 = field953[field955[var117]];
                                                    if (var118 != null && var118.method1014()) {
                                                        class262 var119 = var118.field1374;
                                                        if (var119 != null && var119.field3588 != null) {
                                                            var119 = var119.method4388();
                                                        }
                                                        if (var119 != null && var119.field3592 && var119.field3597) {
                                                            int var120 = var118.field1282 / 32 - Statics.field300.field1282 / 32;
                                                            int var121 = var118.field1225 / 32 - Statics.field300.field1225 / 32;
                                                            method12(var13, var14, var120, var121, Statics.field823[1], var105);
                                                        }
                                                    }
                                                }
                                                int var122 = class97.field1488;
                                                int[] var123 = class97.field1491;
                                                for (int var124 = 0; var124 < var122; var124++) {
                                                    class75 var125 = field970[var123[var124]];
                                                    if (var125 != null && var125.method1014() && !var125.field900 && Statics.field300 != var125) {
                                                        int var126 = var125.field1282 / 32 - Statics.field300.field1282 / 32;
                                                        int var127 = var125.field1225 / 32 - Statics.field300.field1225 / 32;
                                                        boolean var128 = false;
                                                        if (method470(var125.field891, true)) {
                                                            var128 = true;
                                                        }
                                                        boolean var129 = false;
                                                        for (int var130 = 0; var130 < Statics.field15; var130++) {
                                                            if (var125.field891.equals(Statics.field747[var130].field910)) {
                                                                var129 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var131 = false;
                                                        if (Statics.field300.field882 != 0 && var125.field882 != 0 && Statics.field300.field882 == var125.field882) {
                                                            var131 = true;
                                                        }
                                                        if (var128) {
                                                            method12(var13, var14, var126, var127, Statics.field823[3], var105);
                                                        } else if (var131) {
                                                            method12(var13, var14, var126, var127, Statics.field823[4], var105);
                                                        } else if (var129) {
                                                            method12(var13, var14, var126, var127, Statics.field823[5], var105);
                                                        } else {
                                                            method12(var13, var14, var126, var127, Statics.field823[2], var105);
                                                        }
                                                    }
                                                }
                                                if (field934 != 0 && field948 % 20 < 10) {
                                                    if (field934 == 1 && field935 >= 0 && field935 < field953.length) {
                                                        class87 var132 = field953[field935];
                                                        if (var132 != null) {
                                                            int var133 = var132.field1282 / 32 - Statics.field300.field1282 / 32;
                                                            int var134 = var132.field1225 / 32 - Statics.field300.field1225 / 32;
                                                            method1958(var13, var14, var133, var134, Statics.field326[1], var105);
                                                        }
                                                    }
                                                    if (field934 == 2) {
                                                        int var135 = field937 * 4 - Statics.field590 * 4 + 2 - Statics.field300.field1282 / 32;
                                                        int var136 = field938 * 4 - Statics.field617 * 4 + 2 - Statics.field300.field1225 / 32;
                                                        method1958(var13, var14, var135, var136, Statics.field326[1], var105);
                                                    }
                                                    if (field934 == 10 && field936 >= 0 && field936 < field970.length) {
                                                        class75 var137 = field970[field936];
                                                        if (var137 != null) {
                                                            int var138 = var137.field1282 / 32 - Statics.field300.field1282 / 32;
                                                            int var139 = var137.field1225 / 32 - Statics.field300.field1225 / 32;
                                                            method1958(var13, var14, var138, var139, Statics.field326[1], var105);
                                                        }
                                                    }
                                                }
                                                if (field1148 != 0) {
                                                    int var140 = field1148 * 4 + 2 - Statics.field300.field1282 / 32;
                                                    int var141 = field999 * 4 + 2 - Statics.field300.field1225 / 32;
                                                    method12(var13, var14, var140, var141, Statics.field326[0], var105);
                                                }
                                                if (!Statics.field300.field900) {
                                                    class285.method4701(var105.field2618 / 2 + var13 - 1, var105.field2617 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var113 = 0; var113 < 104; var113++) {
                                                class197 var114 = field1046[Statics.field2342][var112][var113];
                                                if (var114 != null) {
                                                    int var115 = var112 * 4 + 2 - Statics.field300.field1282 / 32;
                                                    int var116 = var113 * 4 + 2 - Statics.field300.field1225 / 32;
                                                    method12(var13, var14, var115, var116, Statics.field823[0], var105);
                                                }
                                            }
                                            var112++;
                                        }
                                    }
                                    field1122[var11] = true;
                                }
                                class285.method4655(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2722 == 1339) {
                                class214 var142 = var10.method3747(false);
                                if (var142 != null) {
                                    if (field1054 < 3) {
                                        Statics.field560.method4785(var13, var14, var142.field2618, var142.field2617, 25, 25, field1000, 256, var142.field2620, var142.field2619);
                                    } else {
                                        class285.method4678(var13, var14, 0, var142.field2620, var142.field2619);
                                    }
                                }
                                class285.method4655(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2722 == 1400) {
                                Statics.field1219.method4915(var13, var14, var10.field2683, var10.field2684, field948);
                            }
                            if (var10.field2722 == 1401) {
                                Statics.field1219.method4916(var13, var14, var10.field2683, var10.field2684);
                            }
                        }
                        if (var10.field2670 == 0) {
                            if (!var10.field2667 && Statics.method1485(var10) && Statics.field254 != var10) {
                                continue;
                            }
                            if (!var10.field2667) {
                                if (var10.field2690 > var10.field2748 - var10.field2684) {
                                    var10.field2690 = var10.field2748 - var10.field2684;
                                }
                                if (var10.field2690 < 0) {
                                    var10.field2690 = 0;
                                }
                            }
                            method11(arg0, var10.field2668, var20, var21, var22, var23, var13 - var10.field2694, var14 - var10.field2690, var11);
                            if (var10.field2770 != null) {
                                method11(var10.field2770, var10.field2668, var20, var21, var22, var23, var13 - var10.field2694, var14 - var10.field2690, var11);
                            }
                            class69 var143 = (class69) field1077.method3339((long) var10.field2668);
                            if (var143 != null) {
                                int var144 = var143.field825;
                                if (class220.method4620(var144)) {
                                    Statics.field667 = null;
                                    method11(Statics.field2627[var144], -1, var20, var21, var22, var23, var13, var14, var11);
                                    if (Statics.field667 != null) {
                                        method11(Statics.field667, -1412584499, var20, var21, var22, var23, Statics.field2232, Statics.field1482, var11);
                                        Statics.field667 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var145 = 0; var145 < 100; var145++) {
                                        field1121[var145] = true;
                                    }
                                } else {
                                    field1121[var11] = true;
                                }
                            }
                            class285.method4655(arg2, arg3, arg4, arg5);
                            class137.method2433();
                        }
                        if (field1130 || field1125[var11] || field1128 > 1) {
                            if (var10.field2670 == 0 && !var10.field2667 && var10.field2748 > var10.field2684) {
                                int var146 = var10.field2683 + var13;
                                int var147 = var10.field2690;
                                int var148 = var10.field2684;
                                int var149 = var10.field2748;
                                Statics.field779[0].method4744(var146, var14);
                                Statics.field779[1].method4744(var146, var14 + var148 - 16);
                                class285.method4701(var146, var14 + 16, 16, var148 - 32, field1150);
                                int var150 = (var148 - 32) * var148 / var149;
                                if (var150 < 8) {
                                    var150 = 8;
                                }
                                int var151 = (var148 - 32 - var150) * var147 / (var149 - var148);
                                class285.method4701(var146, var14 + 16 + var151, 16, var150, field1090);
                                class285.method4674(var146, var14 + 16 + var151, var150, field1137);
                                class285.method4674(var146 + 1, var14 + 16 + var151, var150, field1137);
                                class285.method4672(var146, var14 + 16 + var151, 16, field1137);
                                class285.method4672(var146, var14 + 17 + var151, 16, field1137);
                                class285.method4674(var146 + 15, var14 + 16 + var151, var150, field995);
                                class285.method4674(var146 + 14, var14 + 17 + var151, var150 - 1, field995);
                                class285.method4672(var146, var14 + 15 + var151 + var150, 16, field995);
                                class285.method4672(var146 + 1, var14 + 14 + var151 + var150, 15, field995);
                            }
                            if (var10.field2670 != 1) {
                                if (var10.field2670 == 2) {
                                    int var152 = 0;
                                    for (int var153 = 0; var153 < var10.field2680; var153++) {
                                        for (int var154 = 0; var154 < var10.field2679; var154++) {
                                            int var155 = (var10.field2677 + 32) * var154 + var13;
                                            int var156 = (var10.field2674 + 32) * var153 + var14;
                                            if (var152 < 20) {
                                                var155 += var10.field2707[var152];
                                                var156 += var10.field2795[var152];
                                            }
                                            if (var10.field2754[var152] > 0) {
                                                boolean var157 = false;
                                                boolean var158 = false;
                                                int var159 = var10.field2754[var152] - 1;
                                                if (var155 + 32 > arg2 && var155 < arg4 && var156 + 32 > arg3 && var156 < arg5 || Statics.field664 == var10 && field972 == var152) {
                                                    class289 var160;
                                                    if (field1069 == 1 && Statics.field2213 == var152 && Statics.field1447 == var10.field2668) {
                                                        var160 = class260.method220(var159, var10.field2787[var152], 2, 0, 2, false);
                                                    } else {
                                                        var160 = class260.method220(var159, var10.field2787[var152], 1, 3153952, 2, false);
                                                    }
                                                    if (var160 == null) {
                                                        method1456(var10);
                                                    } else if (Statics.field664 == var10 && field972 == var152) {
                                                        int var161 = class60.field742 - field1013;
                                                        int var162 = class60.field738 - field1092;
                                                        if (var161 < 5 && var161 > -5) {
                                                            var161 = 0;
                                                        }
                                                        if (var162 < 5 && var162 > -5) {
                                                            var162 = 0;
                                                        }
                                                        if (field1084 < 5) {
                                                            var161 = 0;
                                                            var162 = 0;
                                                        }
                                                        var160.method4820(var155 + var161, var156 + var162, 128);
                                                        if (arg1 != -1) {
                                                            class220 var163 = arg0[arg1 & 0xFFFF];
                                                            if (var156 + var162 < class285.field3765 && var163.field2690 > 0) {
                                                                int var164 = field992 * (class285.field3765 - var156 - var162) / 3;
                                                                if (var164 > field992 * 10) {
                                                                    var164 = field992 * 10;
                                                                }
                                                                if (var164 > var163.field2690) {
                                                                    var164 = var163.field2690;
                                                                }
                                                                var163.field2690 -= var164;
                                                                field1092 += var164;
                                                                method1456(var163);
                                                            }
                                                            if (var156 + var162 + 32 > class285.field3769 && var163.field2690 < var163.field2748 - var163.field2684) {
                                                                int var165 = field992 * (var156 + var162 + 32 - class285.field3769) / 3;
                                                                if (var165 > field992 * 10) {
                                                                    var165 = field992 * 10;
                                                                }
                                                                if (var165 > var163.field2748 - var163.field2684 - var163.field2690) {
                                                                    var165 = var163.field2748 - var163.field2684 - var163.field2690;
                                                                }
                                                                var163.field2690 += var165;
                                                                field1092 -= var165;
                                                                method1456(var163);
                                                            }
                                                        }
                                                    } else if (Statics.field19 == var10 && field1040 == var152) {
                                                        var160.method4820(var155, var156, 128);
                                                    } else {
                                                        var160.method4795(var155, var156);
                                                    }
                                                }
                                            } else if (var10.field2786 != null && var152 < 20) {
                                                class289 var166 = var10.method3745(var152);
                                                if (var166 != null) {
                                                    var166.method4795(var155, var156);
                                                } else if (class220.field2660) {
                                                    method1456(var10);
                                                }
                                            }
                                            var152++;
                                        }
                                    }
                                } else if (var10.field2670 == 3) {
                                    int var167;
                                    if (method167(var10)) {
                                        var167 = var10.field2735;
                                        if (Statics.field254 == var10 && var10.field2756 != 0) {
                                            var167 = var10.field2756;
                                        }
                                    } else {
                                        var167 = var10.field2798;
                                        if (Statics.field254 == var10 && var10.field2695 != 0) {
                                            var167 = var10.field2695;
                                        }
                                    }
                                    if (var10.field2697) {
                                        switch(var10.field2698.field3778) {
                                            case 1:
                                                class285.method4653(var13, var14, var10.field2683, var10.field2684, var10.field2798, var10.field2735, 256 - (var10.field2699 & 0xFF), 256 - (var10.field2700 & 0xFF));
                                                break;
                                            case 2:
                                                class285.method4665(var13, var14, var10.field2683, var10.field2684, var10.field2798, var10.field2735, 256 - (var10.field2699 & 0xFF), 256 - (var10.field2700 & 0xFF));
                                                break;
                                            case 3:
                                                class285.method4666(var13, var14, var10.field2683, var10.field2684, var10.field2798, var10.field2735, 256 - (var10.field2699 & 0xFF), 256 - (var10.field2700 & 0xFF));
                                                break;
                                            case 4:
                                                class285.method4667(var13, var14, var10.field2683, var10.field2684, var10.field2798, var10.field2735, 256 - (var10.field2699 & 0xFF), 256 - (var10.field2700 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class285.method4701(var13, var14, var10.field2683, var10.field2684, var167);
                                                } else {
                                                    class285.method4662(var13, var14, var10.field2683, var10.field2684, var167, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class285.method4734(var13, var14, var10.field2683, var10.field2684, var167);
                                    } else {
                                        class285.method4671(var13, var14, var10.field2683, var10.field2684, var167, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2670 == 4) {
                                    class267 var168 = var10.method3746();
                                    if (var168 != null) {
                                        String var169 = var10.field2728;
                                        int var170;
                                        if (method167(var10)) {
                                            var170 = var10.field2735;
                                            if (Statics.field254 == var10 && var10.field2756 != 0) {
                                                var170 = var10.field2756;
                                            }
                                            if (var10.field2740.length() > 0) {
                                                var169 = var10.field2740;
                                            }
                                        } else {
                                            var170 = var10.field2798;
                                            if (Statics.field254 == var10 && var10.field2695 != 0) {
                                                var170 = var10.field2695;
                                            }
                                        }
                                        if (var10.field2667 && var10.field2788 != -1) {
                                            class260 var171 = class260.method3655(var10.field2788);
                                            var169 = var171.field3512;
                                            if (var169 == null) {
                                                var169 = "null";
                                            }
                                            if ((var171.field3523 == 1 || var10.field2672 != 1) && var10.field2672 != -1) {
                                                var169 = class89.method72(16748608) + var169 + class89.field1384 + " " + 'x' + method1558(var10.field2672);
                                            }
                                        }
                                        if (field1080 == var10) {
                                            class229 var10000 = (class229) null;
                                            var169 = class229.field2880;
                                            var170 = var10.field2798;
                                        }
                                        if (!var10.field2667) {
                                            var169 = method497(var169, var10);
                                        }
                                        var168.method4491(var169, var13, var14, var10.field2683, var10.field2684, var170, var10.field2733 ? 0 : -1, var10.field2731, var10.field2732, var10.field2730);
                                    } else if (class220.field2660) {
                                        method1456(var10);
                                    }
                                } else if (var10.field2670 == 5) {
                                    if (var10.field2667) {
                                        class289 var173;
                                        if (var10.field2788 == -1) {
                                            var173 = var10.method3743(false);
                                        } else {
                                            var173 = class260.method220(var10.field2788, var10.field2672, var10.field2801, var10.field2708, var10.field2726, false);
                                        }
                                        if (var173 != null) {
                                            int var174 = var173.field3795;
                                            int var175 = var173.field3800;
                                            if (var10.field2706) {
                                                class285.method4656(var13, var14, var10.field2683 + var13, var10.field2684 + var14);
                                                int var176 = (var10.field2683 + (var174 - 1)) / var174;
                                                int var177 = (var10.field2684 + (var175 - 1)) / var175;
                                                for (int var178 = 0; var178 < var176; var178++) {
                                                    for (int var179 = 0; var179 < var177; var179++) {
                                                        if (var10.field2721 != 0) {
                                                            var173.method4794(var174 / 2 + var174 * var178 + var13, var175 / 2 + var175 * var179 + var14, var10.field2721, 4096);
                                                        } else if (var15 == 0) {
                                                            var173.method4795(var174 * var178 + var13, var175 * var179 + var14);
                                                        } else {
                                                            var173.method4820(var174 * var178 + var13, var175 * var179 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class285.method4655(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var180 = var10.field2683 * 4096 / var174;
                                                if (var10.field2721 != 0) {
                                                    var173.method4794(var10.field2683 / 2 + var13, var10.field2684 / 2 + var14, var10.field2721, var180);
                                                } else if (var15 != 0) {
                                                    var173.method4782(var13, var14, var10.field2683, var10.field2684, 256 - (var15 & 0xFF));
                                                } else if (var10.field2683 == var174 && var10.field2684 == var175) {
                                                    var173.method4795(var13, var14);
                                                } else {
                                                    var173.method4777(var13, var14, var10.field2683, var10.field2684);
                                                }
                                            }
                                        } else if (class220.field2660) {
                                            method1456(var10);
                                        }
                                    } else {
                                        class289 var172 = var10.method3743(method167(var10));
                                        if (var172 != null) {
                                            var172.method4795(var13, var14);
                                        } else if (class220.field2660) {
                                            method1456(var10);
                                        }
                                    }
                                } else if (var10.field2670 == 6) {
                                    boolean var181 = method167(var10);
                                    int var182;
                                    if (var181) {
                                        var182 = var10.field2737;
                                    } else {
                                        var182 = var10.field2715;
                                    }
                                    class134 var183 = null;
                                    int var184 = 0;
                                    if (var10.field2788 != -1) {
                                        class260 var185 = class260.method3655(var10.field2788);
                                        if (var185 != null) {
                                            class260 var186 = var185.method4301(var10.field2672);
                                            var183 = var186.method4312(1);
                                            if (var183 == null) {
                                                method1456(var10);
                                            } else {
                                                var183.method2346();
                                                var184 = var183.field2117 / 2;
                                            }
                                        }
                                    } else if (var10.field2711 == 5) {
                                        if (var10.field2767 == 0) {
                                            var183 = field1187.method3702((class264) null, -1, (class264) null, -1);
                                        } else {
                                            var183 = Statics.field300.method1016();
                                        }
                                    } else if (var182 == -1) {
                                        var183 = var10.method3755((class264) null, -1, var181, Statics.field300.field898);
                                        if (var183 == null && class220.field2660) {
                                            method1456(var10);
                                        }
                                    } else {
                                        class264 var187 = class264.method341(var182);
                                        var183 = var10.method3755(var187, var10.field2741, var181, Statics.field300.field898);
                                        if (var183 == null && class220.field2660) {
                                            method1456(var10);
                                        }
                                    }
                                    class137.method2436(var10.field2683 / 2 + var13, var10.field2684 / 2 + var14);
                                    int var188 = var10.field2782 * class137.field2034[var10.field2719] >> 16;
                                    int var189 = var10.field2782 * class137.field2019[var10.field2719] >> 16;
                                    if (var183 != null) {
                                        if (var10.field2667) {
                                            var183.method2346();
                                            if (var10.field2792) {
                                                var183.method2360(0, var10.field2720, var10.field2738, var10.field2719, var10.field2717, var10.field2718 + var184 + var188, var10.field2718 + var189, var10.field2782);
                                            } else {
                                                var183.method2359(0, var10.field2720, var10.field2738, var10.field2719, var10.field2717, var10.field2718 + var184 + var188, var10.field2718 + var189);
                                            }
                                        } else {
                                            var183.method2359(0, var10.field2720, 0, var10.field2719, 0, var188, var189);
                                        }
                                    }
                                    class137.method2452();
                                } else {
                                    if (var10.field2670 == 7) {
                                        class267 var190 = var10.method3746();
                                        if (var190 == null) {
                                            if (class220.field2660) {
                                                method1456(var10);
                                            }
                                            continue;
                                        }
                                        int var191 = 0;
                                        for (int var192 = 0; var192 < var10.field2680; var192++) {
                                            for (int var193 = 0; var193 < var10.field2679; var193++) {
                                                if (var10.field2754[var191] > 0) {
                                                    class260 var194 = class260.method3655(var10.field2754[var191] - 1);
                                                    String var195;
                                                    if (var194.field3523 != 1 && var10.field2787[var191] == 1) {
                                                        var195 = class89.method72(16748608) + var194.field3512 + class89.field1384;
                                                    } else {
                                                        var195 = class89.method72(16748608) + var194.field3512 + class89.field1384 + " " + 'x' + method1558(var10.field2787[var191]);
                                                    }
                                                    int var196 = (var10.field2677 + 115) * var193 + var13;
                                                    int var197 = (var10.field2674 + 12) * var192 + var14;
                                                    if (var10.field2731 == 0) {
                                                        var190.method4503(var195, var196, var197, var10.field2798, var10.field2733 ? 0 : -1);
                                                    } else if (var10.field2731 == 1) {
                                                        var190.method4490(var195, var10.field2683 / 2 + var196, var197, var10.field2798, var10.field2733 ? 0 : -1);
                                                    } else {
                                                        var190.method4489(var195, var10.field2683 + var196 - 1, var197, var10.field2798, var10.field2733 ? 0 : -1);
                                                    }
                                                }
                                                var191++;
                                            }
                                        }
                                    }
                                    if (var10.field2670 == 8 && Statics.field788 == var10 && field1068 == field1034) {
                                        int var198 = 0;
                                        int var199 = 0;
                                        class267 var200 = Statics.field269;
                                        String var201 = var10.field2728;
                                        String var202 = method497(var201, var10);
                                        while (var202.length() > 0) {
                                            int var203 = var202.indexOf(class89.field1390);
                                            String var204;
                                            if (var203 == -1) {
                                                var204 = var202;
                                                var202 = "";
                                            } else {
                                                var204 = var202.substring(0, var203);
                                                var202 = var202.substring(var203 + 4);
                                            }
                                            int var205 = var200.method4487(var204);
                                            if (var205 > var198) {
                                                var198 = var205;
                                            }
                                            var199 += var200.field3659 + 1;
                                        }
                                        var198 += 6;
                                        var199 += 7;
                                        int var206 = var10.field2683 + var13 - 5 - var198;
                                        int var207 = var10.field2684 + var14 + 5;
                                        if (var206 < var13 + 5) {
                                            var206 = var13 + 5;
                                        }
                                        if (var198 + var206 > arg4) {
                                            var206 = arg4 - var198;
                                        }
                                        if (var199 + var207 > arg5) {
                                            var207 = arg5 - var199;
                                        }
                                        class285.method4701(var206, var207, var198, var199, 16777120);
                                        class285.method4734(var206, var207, var198, var199, 0);
                                        String var208 = var10.field2728;
                                        int var209 = var200.field3659 + var207 + 2;
                                        String var210 = method497(var208, var10);
                                        while (var210.length() > 0) {
                                            int var211 = var210.indexOf(class89.field1390);
                                            String var212;
                                            if (var211 == -1) {
                                                var212 = var210;
                                                var210 = "";
                                            } else {
                                                var212 = var210.substring(0, var211);
                                                var210 = var210.substring(var211 + 4);
                                            }
                                            var200.method4503(var212, var206 + 3, var209, 0, -1);
                                            var209 += var200.field3659 + 1;
                                        }
                                    }
                                    if (var10.field2670 == 9) {
                                        int var213;
                                        int var214;
                                        int var215;
                                        int var216;
                                        if (var10.field2702) {
                                            var213 = var13;
                                            var214 = var10.field2684 + var14;
                                            var215 = var10.field2683 + var13;
                                            var216 = var14;
                                        } else {
                                            var213 = var13;
                                            var214 = var14;
                                            var215 = var10.field2683 + var13;
                                            var216 = var10.field2684 + var14;
                                        }
                                        if (var10.field2799 == 1) {
                                            class285.method4676(var213, var214, var215, var216, var10.field2798);
                                        } else {
                                            int var219 = var10.field2798;
                                            int var220 = var10.field2799;
                                            int var221 = var215 - var213;
                                            int var222 = var216 - var214;
                                            int var223 = var221 >= 0 ? var221 : -var221;
                                            int var224 = var222 >= 0 ? var222 : -var222;
                                            int var225 = var223;
                                            if (var223 < var224) {
                                                var225 = var224;
                                            }
                                            if (var225 != 0) {
                                                int var226 = (var221 << 16) / var225;
                                                int var227 = (var222 << 16) / var225;
                                                if (var227 <= var226) {
                                                    var226 = -var226;
                                                } else {
                                                    var227 = -var227;
                                                }
                                                int var228 = var220 * var227 >> 17;
                                                int var229 = var220 * var227 + 1 >> 17;
                                                int var230 = var220 * var226 >> 17;
                                                int var231 = var220 * var226 + 1 >> 17;
                                                int var232 = var213 - class285.field3770;
                                                int var233 = var214 - class285.field3765;
                                                int var234 = var228 + var232;
                                                int var235 = var232 - var229;
                                                int var236 = var221 + var232 - var229;
                                                int var237 = var221 + var232 + var228;
                                                int var238 = var230 + var233;
                                                int var239 = var233 - var231;
                                                int var240 = var222 + var233 - var231;
                                                int var241 = var222 + var233 + var230;
                                                class137.method2441(var234, var235, var236);
                                                class137.method2444(var238, var239, var240, var234, var235, var236, var219);
                                                class137.method2441(var234, var236, var237);
                                                class137.method2444(var238, var240, var241, var234, var236, var237, var219);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ad.hj(Ljava/lang/String;Lhe;I)Ljava/lang/String;")
    public static String method497(String arg0, class220 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method547(arg1, var2 - 1);
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
                if (Statics.field272 != null) {
                    var8 = class274.method3814(Statics.field272.field2235);
                    if (Statics.field272.field2240 != null) {
                        var8 = (String) Statics.field272.field2240;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cr.hg(II)Ljava/lang/String;")
    public static final String method1558(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class89.field1386 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class89.method72(65408) + var1.substring(0, var1.length() - 8) + class229.field3032 + " " + class89.field1387 + var1 + class89.field1388 + class89.field1384;
        } else if (var1.length() > 6) {
            return " " + class89.method72(16777215) + var1.substring(0, var1.length() - 4) + class229.field3049 + " " + class89.field1387 + var1 + class89.field1388 + class89.field1384;
        } else {
            return " " + class89.method72(16776960) + var1 + class89.field1384;
        }
    }

    @ObfuscatedName("client.hs(ZB)V")
    public final void method1046(boolean arg0) {
        int var2 = field1076;
        int var3 = Statics.field35;
        int var4 = Statics.field806;
        if (class220.method4620(var2)) {
            method4422(Statics.field2627[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.hk(Lhe;I)V")
    public void method1059(class220 arg0) {
        class220 var2 = arg0.field2693 == -1 ? null : class220.method2339(arg0.field2693);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field35;
            var4 = Statics.field806;
        } else {
            var3 = var2.field2683;
            var4 = var2.field2684;
        }
        method987(arg0, var3, var4, false);
        method2948(arg0, var3, var4);
    }

    @ObfuscatedName("ff.hr([Lhe;Lhe;ZI)V")
    public static void method2902(class220[] arg0, class220 arg1, boolean arg2) {
        int var3 = arg1.field2691 == 0 ? arg1.field2683 : arg1.field2691;
        int var4 = arg1.field2748 == 0 ? arg1.field2684 : arg1.field2748;
        method4422(arg0, arg1.field2668, var3, var4, arg2);
        if (arg1.field2770 != null) {
            method4422(arg1.field2770, arg1.field2668, var3, var4, arg2);
        }
        class69 var5 = (class69) field1077.method3339((long) arg1.field2668);
        if (var5 != null) {
            int var6 = var5.field825;
            if (class220.method4620(var6)) {
                method4422(Statics.field2627[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2722 == 1337) {
        }
    }

    @ObfuscatedName("je.hi([Lhe;IIIZI)V")
    public static void method4422(class220[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class220 var6 = arg0[var5];
            if (var6 != null && var6.field2693 == arg1) {
                method987(var6, arg2, arg3, arg4);
                method2948(var6, arg2, arg3);
                if (var6.field2694 > var6.field2691 - var6.field2683) {
                    var6.field2694 = var6.field2691 - var6.field2683;
                }
                if (var6.field2694 < 0) {
                    var6.field2694 = 0;
                }
                if (var6.field2690 > var6.field2748 - var6.field2684) {
                    var6.field2690 = var6.field2748 - var6.field2684;
                }
                if (var6.field2690 < 0) {
                    var6.field2690 = 0;
                }
                if (var6.field2670 == 0) {
                    method2902(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("bj.ho(Lhe;IIZB)V")
    public static void method987(class220 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2683;
        int var5 = arg0.field2684;
        if (arg0.field2675 == 0) {
            arg0.field2683 = arg0.field2679;
        } else if (arg0.field2675 == 1) {
            arg0.field2683 = arg1 - arg0.field2679;
        } else if (arg0.field2675 == 2) {
            arg0.field2683 = arg0.field2679 * arg1 >> 14;
        }
        if (arg0.field2701 == 0) {
            arg0.field2684 = arg0.field2680;
        } else if (arg0.field2701 == 1) {
            arg0.field2684 = arg2 - arg0.field2680;
        } else if (arg0.field2701 == 2) {
            arg0.field2684 = arg0.field2680 * arg2 >> 14;
        }
        if (arg0.field2675 == 4) {
            arg0.field2683 = arg0.field2685 * arg0.field2684 / arg0.field2686;
        }
        if (arg0.field2701 == 4) {
            arg0.field2684 = arg0.field2686 * arg0.field2683 / arg0.field2685;
        }
        if (field1086 && arg0.field2670 == 0) {
            if (arg0.field2684 < 5 && arg0.field2683 < 5) {
                arg0.field2684 = 5;
                arg0.field2683 = 5;
            } else {
                if (arg0.field2684 <= 0) {
                    arg0.field2684 = 5;
                }
                if (arg0.field2683 <= 0) {
                    arg0.field2683 = 5;
                }
            }
        }
        if (arg0.field2722 == 1337) {
            field1088 = arg0;
        }
        if (arg3 && arg0.field2777 != null && (arg0.field2683 != var4 || arg0.field2684 != var5)) {
            class70 var6 = new class70();
            var6.field830 = arg0;
            var6.field838 = arg0.field2777;
            field1115.method3394(var6);
        }
    }

    @ObfuscatedName("fg.hh(Lhe;III)V")
    public static void method2948(class220 arg0, int arg1, int arg2) {
        if (arg0.field2673 == 0) {
            arg0.field2681 = arg0.field2692;
        } else if (arg0.field2673 == 1) {
            arg0.field2681 = (arg1 - arg0.field2683) / 2 + arg0.field2692;
        } else if (arg0.field2673 == 2) {
            arg0.field2681 = arg1 - arg0.field2683 - arg0.field2692;
        } else if (arg0.field2673 == 3) {
            arg0.field2681 = arg0.field2692 * arg1 >> 14;
        } else if (arg0.field2673 == 4) {
            arg0.field2681 = (arg0.field2692 * arg1 >> 14) + (arg1 - arg0.field2683) / 2;
        } else {
            arg0.field2681 = arg1 - arg0.field2683 - (arg0.field2692 * arg1 >> 14);
        }
        if (arg0.field2772 == 0) {
            arg0.field2682 = arg0.field2678;
        } else if (arg0.field2772 == 1) {
            arg0.field2682 = (arg2 - arg0.field2684) / 2 + arg0.field2678;
        } else if (arg0.field2772 == 2) {
            arg0.field2682 = arg2 - arg0.field2684 - arg0.field2678;
        } else if (arg0.field2772 == 3) {
            arg0.field2682 = arg0.field2678 * arg2 >> 14;
        } else if (arg0.field2772 == 4) {
            arg0.field2682 = (arg0.field2678 * arg2 >> 14) + (arg2 - arg0.field2684) / 2;
        } else {
            arg0.field2682 = arg2 - arg0.field2684 - (arg0.field2678 * arg2 >> 14);
        }
        if (!field1086 || arg0.field2670 != 0) {
            return;
        }
        if (arg0.field2681 < 0) {
            arg0.field2681 = 0;
        } else if (arg0.field2683 + arg0.field2681 > arg1) {
            arg0.field2681 = arg1 - arg0.field2683;
        }
        if (arg0.field2682 < 0) {
            arg0.field2682 = 0;
        } else if (arg0.field2684 + arg0.field2682 > arg2) {
            arg0.field2682 = arg2 - arg0.field2684;
        }
    }

    @ObfuscatedName("b.hl(Lhe;I)Z")
    public static final boolean method167(class220 arg0) {
        if (arg0.field2781 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2781.length; var1++) {
            int var2 = method547(arg0, var1);
            int var3 = arg0.field2705[var1];
            if (arg0.field2781[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2781[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2781[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ah.ht(Lhe;IB)I")
    public static final int method547(class220 arg0, int arg1) {
        if (arg0.field2780 == null || arg1 >= arg0.field2780.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2780[arg1];
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
                    var7 = field1050[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field993[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1052[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class220 var11 = class220.method2339(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class260.method3655(var12).field3525 || field1136)) {
                        for (int var13 = 0; var13 < var11.field2754.length; var13++) {
                            if (var12 + 1 == var11.field2754[var13]) {
                                var7 += var11.field2787[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class215.field2623[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class226.field2854[field993[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class215.field2623[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field300.field885;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class226.field2858[var14]) {
                            var7 += field993[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class220 var17 = class220.method2339(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class260.method3655(var18).field3525 || field1136)) {
                        for (int var19 = 0; var19 < var17.field2754.length; var19++) {
                            if (var18 + 1 == var17.field2754[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field984;
                }
                if (var6 == 12) {
                    var7 = field1015;
                }
                if (var6 == 13) {
                    int var20 = class215.field2623[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class215.method2427(var22);
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
                    var7 = (Statics.field300.field1282 >> 7) + Statics.field590;
                }
                if (var6 == 19) {
                    var7 = (Statics.field300.field1225 >> 7) + Statics.field617;
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

    @ObfuscatedName("ai.io(Lhe;III)V")
    public static final void method663(class220 arg0, int arg1, int arg2) {
        if (arg0.field2671 == 1) {
            method51(arg0.field2775, "", 24, 0, 0, arg0.field2668);
        }
        if (arg0.field2671 == 2 && !field1030) {
            String var3 = method1405(arg0);
            if (var3 != null) {
                method51(var3, class89.method72(65280) + arg0.field2784, 25, 0, -1, arg0.field2668);
            }
        }
        if (arg0.field2671 == 3) {
            method51(class229.field3030, "", 26, 0, 0, arg0.field2668);
        }
        if (arg0.field2671 == 4) {
            method51(arg0.field2775, "", 28, 0, 0, arg0.field2668);
        }
        if (arg0.field2671 == 5) {
            method51(arg0.field2775, "", 29, 0, 0, arg0.field2668);
        }
        if (arg0.field2671 == 6 && field1080 == null) {
            method51(arg0.field2775, "", 30, 0, -1, arg0.field2668);
        }
        if (arg0.field2670 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2684; var5++) {
                for (int var6 = 0; var6 < arg0.field2683; var6++) {
                    int var7 = (arg0.field2677 + 32) * var6;
                    int var8 = (arg0.field2674 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2707[var4];
                        var8 += arg0.field2795[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field1032 = var4;
                        Statics.field1872 = arg0;
                        if (arg0.field2754[var4] > 0) {
                            label334: {
                                class260 var9 = class260.method3655(arg0.field2754[var4] - 1);
                                if (field1069 == 1) {
                                    int var10 = method1955(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field1447 != arg0.field2668 || Statics.field2213 != var4) {
                                            method51(class229.field3021, field1070 + " " + class89.field1389 + " " + class89.method72(16748608) + var9.field3512, 31, var9.field3510, var4, arg0.field2668);
                                        }
                                        break label334;
                                    }
                                }
                                if (field1030) {
                                    int var12 = method1955(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field469 & 0x10) == 16) {
                                            method51(field1094, field1075 + " " + class89.field1389 + " " + class89.method72(16748608) + var9.field3512, 32, var9.field3510, var4, arg0.field2668);
                                        }
                                        break label334;
                                    }
                                }
                                String[] var14 = var9.field3527;
                                if (field1110) {
                                    var14 = method244(var14);
                                }
                                int var15 = var9.method4308();
                                int var16 = method1955(arg0);
                                boolean var17 = (var16 >> 30 & 0x1) != 0;
                                if (var17) {
                                    for (int var18 = 4; var18 >= 3; var18--) {
                                        boolean var19 = var15 == var18;
                                        if (var14 != null && var14[var18] != null) {
                                            byte var20;
                                            if (var18 == 3) {
                                                var20 = 36;
                                            } else {
                                                var20 = 37;
                                            }
                                            method1748(var14[var18], class89.method72(16748608) + var9.field3512, var20, var9.field3510, var4, arg0.field2668, var19);
                                        } else if (var18 == 4) {
                                            method1748(class229.field2873, class89.method72(16748608) + var9.field3512, 37, var9.field3510, var4, arg0.field2668, var19);
                                        }
                                    }
                                }
                                int var21 = method1955(arg0);
                                boolean var22 = (var21 >> 31 & 0x1) != 0;
                                if (var22) {
                                    method51(class229.field3021, class89.method72(16748608) + var9.field3512, 38, var9.field3510, var4, arg0.field2668);
                                }
                                int var23 = method1955(arg0);
                                boolean var24 = (var23 >> 30 & 0x1) != 0;
                                if (var24 && var14 != null) {
                                    for (int var25 = 2; var25 >= 0; var25--) {
                                        boolean var26 = var15 == var25;
                                        if (var14[var25] != null) {
                                            byte var27 = 0;
                                            if (var25 == 0) {
                                                var27 = 33;
                                            }
                                            if (var25 == 1) {
                                                var27 = 34;
                                            }
                                            if (var25 == 2) {
                                                var27 = 35;
                                            }
                                            method1748(var14[var25], class89.method72(16748608) + var9.field3512, var27, var9.field3510, var4, arg0.field2668, var26);
                                        }
                                    }
                                }
                                String[] var28 = arg0.field2739;
                                if (field1110) {
                                    var28 = method244(var28);
                                }
                                if (var28 != null) {
                                    for (int var29 = 4; var29 >= 0; var29--) {
                                        if (var28[var29] != null) {
                                            byte var30 = 0;
                                            if (var29 == 0) {
                                                var30 = 39;
                                            }
                                            if (var29 == 1) {
                                                var30 = 40;
                                            }
                                            if (var29 == 2) {
                                                var30 = 41;
                                            }
                                            if (var29 == 3) {
                                                var30 = 42;
                                            }
                                            if (var29 == 4) {
                                                var30 = 43;
                                            }
                                            method51(var28[var29], class89.method72(16748608) + var9.field3512, var30, var9.field3510, var4, arg0.field2668);
                                        }
                                    }
                                }
                                method51(class229.field3128, class89.method72(16748608) + var9.field3512, 1005, var9.field3510, var4, arg0.field2668);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2667) {
            return;
        }
        if (!field1030) {
            for (int var31 = 9; var31 >= 5; var31--) {
                String var32;
                if (!class221.method2430(method1955(arg0), var31) && arg0.field2768 == null) {
                    var32 = null;
                } else if (arg0.field2712 == null || arg0.field2712.length <= var31 || arg0.field2712[var31] == null || arg0.field2712[var31].trim().length() == 0) {
                    var32 = null;
                } else {
                    var32 = arg0.field2712[var31];
                }
                if (var32 != null) {
                    method51(var32, arg0.field2687, 1007, var31 + 1, arg0.field2669, arg0.field2668);
                }
            }
            String var34 = method1405(arg0);
            if (var34 != null) {
                method51(var34, arg0.field2687, 25, 0, arg0.field2669, arg0.field2668);
            }
            for (int var35 = 4; var35 >= 0; var35--) {
                String var36;
                if (!class221.method2430(method1955(arg0), var35) && arg0.field2768 == null) {
                    var36 = null;
                } else if (arg0.field2712 == null || arg0.field2712.length <= var35 || arg0.field2712[var35] == null || arg0.field2712[var35].trim().length() == 0) {
                    var36 = null;
                } else {
                    var36 = arg0.field2712[var35];
                }
                if (var36 != null) {
                    method51(var36, arg0.field2687, 57, var35 + 1, arg0.field2669, arg0.field2668);
                }
            }
            if (class221.method1763(method1955(arg0))) {
                method51(class229.field2877, "", 30, 0, arg0.field2669, arg0.field2668);
            }
        } else if (class221.method539(method1955(arg0)) && (Statics.field469 & 0x20) == 32) {
            method51(field1094, field1075 + " " + class89.field1389 + " " + arg0.field2687, 58, 0, arg0.field2669, arg0.field2668);
        }
    }

    @ObfuscatedName("o.it(IIIIIIII)V")
    public static final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class220.method4620(arg0)) {
            method2213(Statics.field2627[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("dv.ix([Lhe;IIIIIIIB)V")
    public static final void method2213(class220[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class220 var9 = arg0[var8];
            if (var9 != null && (!var9.field2667 || var9.field2670 == 0 || var9.field2729 || method1955(var9) != 0 || field1114 == var9 || var9.field2722 == 1338) && var9.field2693 == arg1 && (!var9.field2667 || !Statics.method1485(var9))) {
                int var10 = var9.field2681 + arg6;
                int var11 = var9.field2682 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2670 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2670 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2683 + var10;
                    int var19 = var9.field2684 + var11;
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
                    int var22 = var9.field2683 + var10;
                    int var23 = var9.field2684 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1089 == var9) {
                    field1097 = true;
                    field982 = var10;
                    field1099 = var11;
                }
                if (!var9.field2667 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field742;
                    int var25 = class60.field738;
                    if (class60.field735 != 0) {
                        var24 = class60.field736;
                        var25 = class60.field724;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2722 == 1337) {
                        if (!field925 && !field1108 && var26) {
                            method949(var24, var25, var12, var13);
                        }
                    } else if (var9.field2722 == 1338) {
                        method2934(var9, var10, var11);
                    } else {
                        if (var9.field2722 == 1400) {
                            Statics.field1219.method4901(class60.field742, class60.field738, var26, var10, var11, var9.field2683, var9.field2684);
                        }
                        if (!field1108 && var26) {
                            if (var9.field2722 == 1400) {
                                Statics.field1219.method5026(var10, var11, var9.field2683, var9.field2684, var24, var25);
                            } else {
                                method663(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2670 == 0) {
                            if (!var9.field2667 && Statics.method1485(var9) && Statics.field254 != var9) {
                                continue;
                            }
                            method2213(arg0, var9.field2668, var12, var13, var14, var15, var10 - var9.field2694, var11 - var9.field2690);
                            if (var9.field2770 != null) {
                                method2213(var9.field2770, var9.field2668, var12, var13, var14, var15, var10 - var9.field2694, var11 - var9.field2690);
                            }
                            class69 var27 = (class69) field1077.method3339((long) var9.field2668);
                            if (var27 != null) {
                                if (var27.field824 == 0 && class60.field742 >= var12 && class60.field738 >= var13 && class60.field742 < var14 && class60.field738 < var15 && !field1108 && !field1086) {
                                    for (class70 var28 = (class70) field1115.method3389(); var28 != null; var28 = (class70) field1115.method3385()) {
                                        if (var28.field828) {
                                            var28.method3372();
                                            var28.field830.field2779 = false;
                                        }
                                    }
                                    if (Statics.field1776 == 0) {
                                        field1089 = null;
                                        field1114 = null;
                                    }
                                    if (!field1108) {
                                        method71();
                                    }
                                }
                                method52(var27.field825, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2667) {
                            if (var9.field2688) {
                                if (class60.field742 >= var12 && class60.field738 >= var13 && class60.field742 < var14 && class60.field738 < var15) {
                                    for (class70 var29 = (class70) field1115.method3389(); var29 != null; var29 = (class70) field1115.method3385()) {
                                        if (var29.field828) {
                                            var29.method3372();
                                            var29.field830.field2779 = false;
                                        }
                                    }
                                    if (Statics.field1776 == 0) {
                                        field1089 = null;
                                        field1114 = null;
                                    }
                                    if (!field1108) {
                                        field1060[0] = class229.field3108;
                                        field1061[0] = "";
                                        field1123[0] = 1006;
                                        field957 = 1;
                                    }
                                }
                            } else if (var9.field2802 && class60.field742 >= var12 && class60.field738 >= var13 && class60.field742 < var14 && class60.field738 < var15) {
                                for (class70 var30 = (class70) field1115.method3389(); var30 != null; var30 = (class70) field1115.method3385()) {
                                    if (var30.field828 && var30.field830.field2769 == var30.field838) {
                                        var30.method3372();
                                    }
                                }
                            }
                            boolean var31;
                            if (class60.field742 >= var12 && class60.field738 >= var13 && class60.field742 < var14 && class60.field738 < var15) {
                                var31 = true;
                            } else {
                                var31 = false;
                            }
                            boolean var32 = false;
                            if ((class60.field728 == 1 || !Statics.field242 && class60.field728 == 4) && var31) {
                                var32 = true;
                            }
                            boolean var33 = false;
                            if ((class60.field735 == 1 || !Statics.field242 && class60.field735 == 4) && class60.field736 >= var12 && class60.field724 >= var13 && class60.field736 < var14 && class60.field724 < var15) {
                                var33 = true;
                            }
                            if (var33) {
                                method359(var9, class60.field736 - var10, class60.field724 - var11);
                            }
                            if (var9.field2722 == 1400) {
                                Statics.field1219.method4902(class60.field742, class60.field738, var31 & var32);
                            }
                            if (field1089 != null && field1089 != var9 && var31 && class221.method1985(method1955(var9))) {
                                field1093 = var9;
                            }
                            if (field1114 == var9) {
                                field1031 = true;
                                field1132 = var10;
                                field1113 = var11;
                            }
                            if (var9.field2729) {
                                if (var31 && field1008 != 0 && var9.field2769 != null) {
                                    class70 var34 = new class70();
                                    var34.field828 = true;
                                    var34.field830 = var9;
                                    var34.field831 = field1008;
                                    var34.field838 = var9.field2769;
                                    field1115.method3394(var34);
                                }
                                if (field1089 != null || Statics.field664 != null || field1108) {
                                    var33 = false;
                                    var32 = false;
                                    var31 = false;
                                }
                                if (!var9.field2794 && var33) {
                                    var9.field2794 = true;
                                    if (var9.field2750 != null) {
                                        class70 var35 = new class70();
                                        var35.field828 = true;
                                        var35.field830 = var9;
                                        var35.field827 = class60.field736 - var10;
                                        var35.field831 = class60.field724 - var11;
                                        var35.field838 = var9.field2750;
                                        field1115.method3394(var35);
                                    }
                                }
                                if (var9.field2794 && var32 && var9.field2751 != null) {
                                    class70 var36 = new class70();
                                    var36.field828 = true;
                                    var36.field830 = var9;
                                    var36.field827 = class60.field742 - var10;
                                    var36.field831 = class60.field738 - var11;
                                    var36.field838 = var9.field2751;
                                    field1115.method3394(var36);
                                }
                                if (var9.field2794 && !var32) {
                                    var9.field2794 = false;
                                    if (var9.field2752 != null) {
                                        class70 var37 = new class70();
                                        var37.field828 = true;
                                        var37.field830 = var9;
                                        var37.field827 = class60.field742 - var10;
                                        var37.field831 = class60.field738 - var11;
                                        var37.field838 = var9.field2752;
                                        field1117.method3394(var37);
                                    }
                                }
                                if (var32 && var9.field2755 != null) {
                                    class70 var38 = new class70();
                                    var38.field828 = true;
                                    var38.field830 = var9;
                                    var38.field827 = class60.field742 - var10;
                                    var38.field831 = class60.field738 - var11;
                                    var38.field838 = var9.field2755;
                                    field1115.method3394(var38);
                                }
                                if (!var9.field2779 && var31) {
                                    var9.field2779 = true;
                                    if (var9.field2789 != null) {
                                        class70 var39 = new class70();
                                        var39.field828 = true;
                                        var39.field830 = var9;
                                        var39.field827 = class60.field742 - var10;
                                        var39.field831 = class60.field738 - var11;
                                        var39.field838 = var9.field2789;
                                        field1115.method3394(var39);
                                    }
                                }
                                if (var9.field2779 && var31 && var9.field2696 != null) {
                                    class70 var40 = new class70();
                                    var40.field828 = true;
                                    var40.field830 = var9;
                                    var40.field827 = class60.field742 - var10;
                                    var40.field831 = class60.field738 - var11;
                                    var40.field838 = var9.field2696;
                                    field1115.method3394(var40);
                                }
                                if (var9.field2779 && !var31) {
                                    var9.field2779 = false;
                                    if (var9.field2723 != null) {
                                        class70 var41 = new class70();
                                        var41.field828 = true;
                                        var41.field830 = var9;
                                        var41.field827 = class60.field742 - var10;
                                        var41.field831 = class60.field738 - var11;
                                        var41.field838 = var9.field2723;
                                        field1117.method3394(var41);
                                    }
                                }
                                if (var9.field2736 != null) {
                                    class70 var42 = new class70();
                                    var42.field830 = var9;
                                    var42.field838 = var9.field2736;
                                    field1116.method3394(var42);
                                }
                                if (var9.field2657 != null && field1103 > var9.field2796) {
                                    if (var9.field2762 == null || field1103 - var9.field2796 > 32) {
                                        class70 var47 = new class70();
                                        var47.field830 = var9;
                                        var47.field838 = var9.field2657;
                                        field1115.method3394(var47);
                                    } else {
                                        label556: for (int var43 = var9.field2796; var43 < field1103; var43++) {
                                            int var44 = field1102[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var9.field2762.length; var45++) {
                                                if (var9.field2762[var45] == var44) {
                                                    class70 var46 = new class70();
                                                    var46.field830 = var9;
                                                    var46.field838 = var9.field2657;
                                                    field1115.method3394(var46);
                                                    break label556;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2796 = field1103;
                                }
                                if (var9.field2763 != null && field1105 > var9.field2797) {
                                    if (var9.field2764 == null || field1105 - var9.field2797 > 32) {
                                        class70 var52 = new class70();
                                        var52.field830 = var9;
                                        var52.field838 = var9.field2763;
                                        field1115.method3394(var52);
                                    } else {
                                        label532: for (int var48 = var9.field2797; var48 < field1105; var48++) {
                                            int var49 = field1104[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var9.field2764.length; var50++) {
                                                if (var9.field2764[var50] == var49) {
                                                    class70 var51 = new class70();
                                                    var51.field830 = var9;
                                                    var51.field838 = var9.field2763;
                                                    field1115.method3394(var51);
                                                    break label532;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2797 = field1105;
                                }
                                if (var9.field2765 != null && field1107 > var9.field2716) {
                                    if (var9.field2766 == null || field1107 - var9.field2716 > 32) {
                                        class70 var57 = new class70();
                                        var57.field830 = var9;
                                        var57.field838 = var9.field2765;
                                        field1115.method3394(var57);
                                    } else {
                                        label508: for (int var53 = var9.field2716; var53 < field1107; var53++) {
                                            int var54 = field1106[var53 & 0x1F];
                                            for (int var55 = 0; var55 < var9.field2766.length; var55++) {
                                                if (var9.field2766[var55] == var54) {
                                                    class70 var56 = new class70();
                                                    var56.field830 = var9;
                                                    var56.field838 = var9.field2765;
                                                    field1115.method3394(var56);
                                                    break label508;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2716 = field1107;
                                }
                                if (field996 > var9.field2790 && var9.field2742 != null) {
                                    class70 var58 = new class70();
                                    var58.field830 = var9;
                                    var58.field838 = var9.field2742;
                                    field1115.method3394(var58);
                                }
                                if (field1109 > var9.field2790 && var9.field2753 != null) {
                                    class70 var59 = new class70();
                                    var59.field830 = var9;
                                    var59.field838 = var9.field2753;
                                    field1115.method3394(var59);
                                }
                                if (field965 > var9.field2790 && var9.field2773 != null) {
                                    class70 var60 = new class70();
                                    var60.field830 = var9;
                                    var60.field838 = var9.field2773;
                                    field1115.method3394(var60);
                                }
                                if (field1169 > var9.field2790 && var9.field2778 != null) {
                                    class70 var61 = new class70();
                                    var61.field830 = var9;
                                    var61.field838 = var9.field2778;
                                    field1115.method3394(var61);
                                }
                                if (field1036 > var9.field2790 && var9.field2791 != null) {
                                    class70 var62 = new class70();
                                    var62.field830 = var9;
                                    var62.field838 = var9.field2791;
                                    field1115.method3394(var62);
                                }
                                if (field1071 > var9.field2790 && var9.field2774 != null) {
                                    class70 var63 = new class70();
                                    var63.field830 = var9;
                                    var63.field838 = var9.field2774;
                                    field1115.method3394(var63);
                                }
                                var9.field2790 = field1101;
                                if (var9.field2771 != null) {
                                    for (int var64 = 0; var64 < field1027; var64++) {
                                        class70 var65 = new class70();
                                        var65.field830 = var9;
                                        var65.field834 = field1139[var64];
                                        var65.field835 = field1138[var64];
                                        var65.field838 = var9.field2771;
                                        field1115.method3394(var65);
                                    }
                                }
                            }
                        }
                        if (!var9.field2667 && field1089 == null && Statics.field664 == null && !field1108) {
                            if ((var9.field2689 >= 0 || var9.field2695 != 0) && class60.field742 >= var12 && class60.field738 >= var13 && class60.field742 < var14 && class60.field738 < var15) {
                                if (var9.field2689 >= 0) {
                                    Statics.field254 = arg0[var9.field2689];
                                } else {
                                    Statics.field254 = var9;
                                }
                            }
                            if (var9.field2670 == 8 && class60.field742 >= var12 && class60.field738 >= var13 && class60.field742 < var14 && class60.field738 < var15) {
                                Statics.field788 = var9;
                            }
                            if (var9.field2748 > var9.field2684) {
                                int var66 = var9.field2683 + var10;
                                int var67 = var9.field2684;
                                int var68 = var9.field2748;
                                int var69 = class60.field742;
                                int var70 = class60.field738;
                                if (field997) {
                                    field927 = 32;
                                } else {
                                    field927 = 0;
                                }
                                field997 = false;
                                if (class60.field728 == 1 || !Statics.field242 && class60.field728 == 4) {
                                    if (var69 >= var66 && var69 < var66 + 16 && var70 >= var11 && var70 < var11 + 16) {
                                        var9.field2690 -= 4;
                                        method1456(var9);
                                    } else if (var69 >= var66 && var69 < var66 + 16 && var70 >= var11 + var67 - 16 && var70 < var11 + var67) {
                                        var9.field2690 += 4;
                                        method1456(var9);
                                    } else if (var69 >= var66 - field927 && var69 < field927 + var66 + 16 && var70 >= var11 + 16 && var70 < var11 + var67 - 16) {
                                        int var71 = (var67 - 32) * var67 / var68;
                                        if (var71 < 8) {
                                            var71 = 8;
                                        }
                                        int var72 = var70 - var11 - 16 - var71 / 2;
                                        int var73 = var67 - 32 - var71;
                                        var9.field2690 = (var68 - var67) * var72 / var73;
                                        method1456(var9);
                                        field997 = true;
                                    }
                                }
                                if (field1008 != 0) {
                                    int var74 = var9.field2683;
                                    if (var69 >= var66 - var74 && var70 >= var11 && var69 < var66 + 16 && var70 <= var11 + var67) {
                                        var9.field2690 += field1008 * 45;
                                        method1456(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.iu([Lhe;II)V")
    public static final void method1(class220[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class220 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2670 == 0) {
                    if (var3.field2770 != null) {
                        method1(var3.field2770, arg1);
                    }
                    class69 var4 = (class69) field1077.method3339((long) var3.field2668);
                    if (var4 != null) {
                        int var5 = var4.field825;
                        if (class220.method4620(var5)) {
                            method1(Statics.field2627[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2761 != null) {
                    class70 var6 = new class70();
                    var6.field830 = var3;
                    var6.field838 = var3.field2761;
                    class84.method152(var6);
                }
                if (arg1 == 1 && var3.field2776 != null) {
                    if (var3.field2669 >= 0) {
                        class220 var7 = class220.method2339(var3.field2668);
                        if (var7 == null || var7.field2770 == null || var3.field2669 >= var7.field2770.length || var7.field2770[var3.field2669] != var3) {
                            continue;
                        }
                    }
                    class70 var8 = new class70();
                    var8.field830 = var3;
                    var8.field838 = var3.field2776;
                    class84.method152(var8);
                }
            }
        }
    }

    @ObfuscatedName("as.iw(Lhe;III)V")
    public static final void method359(class220 arg0, int arg1, int arg2) {
        if (field1089 != null || field1108 || arg0 == null) {
            return;
        }
        class220 var3 = method2426(arg0);
        if (var3 == null) {
            var3 = arg0.field2743;
        }
        if (var3 == null) {
            return;
        }
        field1089 = arg0;
        class220 var5 = method2426(arg0);
        if (var5 == null) {
            var5 = arg0.field2743;
        }
        field1114 = var5;
        field1091 = arg1;
        field1098 = arg2;
        Statics.field1776 = 0;
        field1100 = false;
        int var7 = method1633();
        if (var7 != -1) {
            method1705(var7);
        }
        return;
    }

    @ObfuscatedName("client.ik(I)V")
    public final void method1060() {
        method1456(field1089);
        Statics.field1776++;
        if (field1097 && field1031) {
            int var1 = class60.field742;
            int var2 = class60.field738;
            int var3 = var1 - field1091;
            int var4 = var2 - field1098;
            if (var3 < field1132) {
                var3 = field1132;
            }
            if (field1089.field2683 + var3 > field1132 + field1114.field2683) {
                var3 = field1132 + field1114.field2683 - field1089.field2683;
            }
            if (var4 < field1113) {
                var4 = field1113;
            }
            if (field1089.field2684 + var4 > field1113 + field1114.field2684) {
                var4 = field1113 + field1114.field2684 - field1089.field2684;
            }
            int var5 = var3 - field982;
            int var6 = var4 - field1099;
            int var7 = field1089.field2744;
            if (Statics.field1776 > field1089.field2745 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1100 = true;
            }
            int var8 = field1114.field2694 + (var3 - field1132);
            int var9 = field1114.field2690 + (var4 - field1113);
            if (field1089.field2757 != null && field1100) {
                class70 var10 = new class70();
                var10.field830 = field1089;
                var10.field827 = var8;
                var10.field831 = var9;
                var10.field838 = field1089.field2757;
                class84.method152(var10);
            }
            if (class60.field728 == 0) {
                if (field1100) {
                    if (field1089.field2758 != null) {
                        class70 var11 = new class70();
                        var11.field830 = field1089;
                        var11.field827 = var8;
                        var11.field831 = var9;
                        var11.field829 = field1093;
                        var11.field838 = field1089.field2758;
                        class84.method152(var11);
                    }
                    if (field1093 != null && method2426(field1089) != null) {
                        field958.method3195(174);
                        field958.method2998(field1089.field2788);
                        field958.method3008(field1089.field2668);
                        field958.method3165(field1093.field2668);
                        field958.method2951(field1089.field2669);
                        field958.method2998(field1093.field2788);
                        field958.method2998(field1093.field2669);
                    }
                } else {
                    int var12 = method1633();
                    if (field957 > 2 && !(field926 != 1 || method997()) || method965(var12)) {
                        this.method1057(field982 + field1091, field1099 + field1098);
                    } else if (field957 > 0) {
                        method677(field982 + field1091, field1099 + field1098);
                    }
                }
                field1089 = null;
            }
        } else if (Statics.field1776 > 1) {
            field1089 = null;
        }
    }

    @ObfuscatedName("cp.ir(II)V")
    public static void method1705(int arg0) {
        Statics.field1913 = new class90();
        Statics.field1913.field1402 = field1056[arg0];
        Statics.field1913.field1400 = field1057[arg0];
        Statics.field1913.field1398 = field1123[arg0];
        Statics.field1913.field1399 = field1059[arg0];
        Statics.field1913.field1396 = field1060[arg0];
    }

    @ObfuscatedName("bh.ip(IIB)V")
    public static void method677(int arg0, int arg1) {
        method974(Statics.field1913, arg0, arg1);
        Statics.field1913 = null;
    }

    @ObfuscatedName("ci.ij(Lhe;I)V")
    public static void method1456(class220 arg0) {
        if (field1120 == arg0.field2800) {
            field1121[arg0.field2785] = true;
        }
    }

    @ObfuscatedName("cw.in(B)V")
    public static void method1589() {
        for (class69 var0 = (class69) field1077.method3332(); var0 != null; var0 = (class69) field1077.method3333()) {
            int var1 = var0.field825;
            if (class220.method4620(var1)) {
                boolean var2 = true;
                class220[] var3 = Statics.field2627[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2667;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2487;
                    class220 var6 = class220.method2339(var5);
                    if (var6 != null) {
                        method1456(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("af.is([Ljava/lang/String;S)[Ljava/lang/String;")
    public static final String[] method244(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ci.iq(IB)V")
    public static final void method1420(int arg0) {
        if (!class220.method4620(arg0)) {
            return;
        }
        class220[] var1 = Statics.field2627[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class220 var3 = var1[var2];
            if (var3 != null) {
                var3.field2741 = 0;
                var3.field2709 = 0;
            }
        }
    }

    @ObfuscatedName("an.ie(II)V")
    public static final void method654(int arg0) {
        if (class220.method4620(arg0)) {
            method468(Statics.field2627[arg0], -1);
        }
    }

    @ObfuscatedName("ag.iz([Lhe;II)V")
    public static final void method468(class220[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class220 var3 = arg0[var2];
            if (var3 != null && var3.field2693 == arg1 && (!var3.field2667 || !Statics.method1485(var3))) {
                if (var3.field2670 == 0) {
                    if (!var3.field2667 && Statics.method1485(var3) && Statics.field254 != var3) {
                        continue;
                    }
                    method468(arg0, var3.field2668);
                    if (var3.field2770 != null) {
                        method468(var3.field2770, var3.field2668);
                    }
                    class69 var4 = (class69) field1077.method3339((long) var3.field2668);
                    if (var4 != null) {
                        method654(var4.field825);
                    }
                }
                if (var3.field2670 == 6) {
                    if (var3.field2715 != -1 || var3.field2737 != -1) {
                        boolean var5 = method167(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2737;
                        } else {
                            var6 = var3.field2715;
                        }
                        if (var6 != -1) {
                            class264 var7 = class264.method341(var6);
                            var3.field2709 += field992;
                            while (var3.field2709 > var7.field3631[var3.field2741]) {
                                var3.field2709 -= var7.field3631[var3.field2741];
                                var3.field2741++;
                                if (var3.field2741 >= var7.field3620.length) {
                                    var3.field2741 -= var7.field3624;
                                    if (var3.field2741 < 0 || var3.field2741 >= var7.field3620.length) {
                                        var3.field2741 = 0;
                                    }
                                }
                                method1456(var3);
                            }
                        }
                    }
                    if (var3.field2724 != 0 && !var3.field2667) {
                        int var8 = var3.field2724 >> 16;
                        int var9 = var3.field2724 << 16 >> 16;
                        int var10 = field992 * var8;
                        int var11 = field992 * var9;
                        var3.field2719 = var3.field2719 + var10 & 0x7FF;
                        var3.field2720 = var3.field2720 + var11 & 0x7FF;
                        method1456(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hd.ig(II)V")
    public static final void method3796(int arg0) {
        method1589();
        for (class83 var1 = (class83) class83.field1326.method3389(); var1 != null; var1 = (class83) class83.field1326.method3385()) {
            if (var1.field1334 != null) {
                var1.method1473();
            }
        }
        int var2 = class245.method3237(arg0).field3302;
        if (var2 == 0) {
            return;
        }
        int var3 = class215.field2623[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class137.method2438(0.9D);
                ((class126) Statics.field2009).method2215(0.9D);
            }
            if (var3 == 2) {
                class137.method2438(0.8D);
                ((class126) Statics.field2009).method2215(0.8D);
            }
            if (var3 == 3) {
                class137.method2438(0.7D);
                ((class126) Statics.field2009).method2215(0.7D);
            }
            if (var3 == 4) {
                class137.method2438(0.6D);
                ((class126) Statics.field2009).method2215(0.6D);
            }
            class260.method715();
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
            if (field1151 != var4) {
                if (field1151 == 0 && field1152 != -1) {
                    class207.method1045(Statics.field666, field1152, 0, var4, false);
                    field1119 = false;
                } else if (var4 == 0) {
                    class207.method2821();
                    field1119 = false;
                } else if (class207.field2523 == 0) {
                    Statics.field2522.method3515(var4);
                } else {
                    Statics.field2526 = var4;
                }
                field1151 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field1154 = 127;
            }
            if (var3 == 1) {
                field1154 = 96;
            }
            if (var3 == 2) {
                field1154 = 64;
            }
            if (var3 == 3) {
                field1154 = 32;
            }
            if (var3 == 4) {
                field1154 = 0;
            }
        }
        if (var2 == 5) {
            field926 = var3;
        }
        if (var2 == 6) {
            field1078 = var3;
        }
        if (var2 == 9) {
            field1079 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field1155 = 127;
            }
            if (var3 == 1) {
                field1155 = 96;
            }
            if (var3 == 2) {
                field1155 = 64;
            }
            if (var3 == 3) {
                field1155 = 32;
            }
            if (var3 == 4) {
                field1155 = 0;
            }
        }
        if (var2 == 17) {
            field978 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field942 = (class92) class172.method1577(class92.method1593(), var3);
            if (field942 == null) {
                field942 = class92.field1411;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field1190 = -1;
            } else {
                field1190 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field918 = (class92) class172.method1577(class92.method1593(), var3);
            if (field918 == null) {
                field918 = class92.field1411;
            }
        }
    }

    @ObfuscatedName("cq.ic(B)V")
    public static final void method1747() {
        field958.method3195(7);
        for (class69 var0 = (class69) field1077.method3332(); var0 != null; var0 = (class69) field1077.method3333()) {
            if (var0.field824 == 0 || var0.field824 == 3) {
                method927(var0, true);
            }
        }
        if (field1080 != null) {
            method1456(field1080);
            field1080 = null;
        }
    }

    @ObfuscatedName("by.ii(Lbu;ZB)V")
    public static final void method927(class69 arg0, boolean arg1) {
        int var2 = arg0.field825;
        int var3 = (int) arg0.field2487;
        arg0.method3372();
        if (arg1) {
            class220.method214(var2);
        }
        for (class202 var4 = (class202) field1118.method3332(); var4 != null; var4 = (class202) field1118.method3333()) {
            if ((long) var2 == (var4.field2487 >> 48 & 0xFFFFL)) {
                var4.method3372();
            }
        }
        class220 var5 = class220.method2339(var3);
        if (var5 != null) {
            method1456(var5);
        }
        method951();
        if (field1076 != -1) {
            int var6 = field1076;
            if (class220.method4620(var6)) {
                method1(Statics.field2627[var6], 1);
            }
        }
    }

    @ObfuscatedName("ad.ia(Lhe;I)Z")
    public static final boolean method495(class220 arg0) {
        int var1 = arg0.field2722;
        if (var1 == 205) {
            field1095 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1187.method3697(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1187.method3698(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1187.method3699(false);
        }
        if (var1 == 325) {
            field1187.method3699(true);
        }
        if (var1 == 326) {
            field958.method3195(223);
            field1187.method3700(field958);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dz.id(IIIILkb;Lhu;I)V")
    public static final void method1958(int arg0, int arg1, int arg2, int arg3, class289 arg4, class214 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method12(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field987 + field1000 & 0x7FF;
        int var8 = class137.field2034[var7];
        int var9 = class137.field2019[var7];
        int var10 = var8 * 256 / (field994 + 256);
        int var11 = var9 * 256 / (field994 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field1499.method4786(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("h.il(IIIILkb;Lhu;B)V")
    public static final void method12(int arg0, int arg1, int arg2, int arg3, class289 arg4, class214 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field987 + field1000 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class137.field2034[var6];
        int var9 = class137.field2019[var6];
        int var10 = var8 * 256 / (field994 + 256);
        int var11 = var9 * 256 / (field994 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method4784(arg5.field2618 / 2 + var12 - arg4.field3795 / 2, arg5.field2617 / 2 - var13 - arg4.field3800 / 2, arg0, arg1, arg5.field2618, arg5.field2617, arg5.field2620, arg5.field2619);
        } else {
            arg4.method4795(arg5.field2618 / 2 + arg0 + var12 - arg4.field3795 / 2, arg5.field2617 / 2 + arg1 - var13 - arg4.field3800 / 2);
        }
    }

    @ObfuscatedName("ay.im(Ljava/lang/String;ZB)Z")
    public static boolean method470(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class271.method3664(arg0, Statics.field3218);
        for (int var3 = 0; var3 < field1181; var3++) {
            if (var2.equalsIgnoreCase(class271.method3664(field1183[var3].field791, Statics.field3218)) && (!arg1 || field1183[var3].field792 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class271.method3664(Statics.field300.field891, Statics.field3218))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jc.iv(Ljava/lang/String;I)Z")
    public static boolean method4625(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class271.method3664(arg0, Statics.field3218);
        for (int var2 = 0; var2 < field919; var2++) {
            class71 var3 = field917[var2];
            if (var1.equalsIgnoreCase(class271.method3664(var3.field842, Statics.field3218))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class271.method3664(var3.field841, Statics.field3218))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ay.iy(Ljava/lang/String;B)V")
    public static final void method478(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field1181 < 200 || field1164 == 1) || field1181 >= 400) {
            class99.method968(30, "", class229.field3037);
            return;
        }
        String var1 = class271.method3664(arg0, Statics.field3218);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1181; var2++) {
            class66 var3 = field1183[var2];
            String var4 = class271.method3664(var3.field791, Statics.field3218);
            if (var4 != null && var4.equals(var1)) {
                class99.method968(30, "", arg0 + class229.field3038);
                return;
            }
            if (var3.field790 != null) {
                String var5 = class271.method3664(var3.field790, Statics.field3218);
                if (var5 != null && var5.equals(var1)) {
                    class99.method968(30, "", arg0 + class229.field3038);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field919; var6++) {
            class71 var7 = field917[var6];
            String var8 = class271.method3664(var7.field842, Statics.field3218);
            if (var8 != null && var8.equals(var1)) {
                class99.method968(30, "", class229.field3043 + arg0 + class229.field2889);
                return;
            }
            if (var7.field841 != null) {
                String var9 = class271.method3664(var7.field841, Statics.field3218);
                if (var9 != null && var9.equals(var1)) {
                    class99.method968(30, "", class229.field3043 + arg0 + class229.field2889);
                    return;
                }
            }
        }
        if (class271.method3664(Statics.field300.field891, Statics.field3218).equals(var1)) {
            class99.method968(30, "", class229.field3041);
        } else {
            field958.method3195(208);
            field958.method3129(class177.method2707(arg0));
            field958.method2956(arg0);
        }
    }

    @ObfuscatedName("bg.if(Ljava/lang/String;II)V")
    public static final void method984(String arg0, int arg1) {
        field958.method3195(47);
        field958.method3129(class177.method2707(arg0) + 1);
        field958.method2956(arg0);
        field958.method2997(arg1);
    }

    @ObfuscatedName("q.ih(Ljava/lang/String;I)V")
    public static final void method55(String arg0) {
        if (Statics.field747 != null) {
            field958.method3195(138);
            field958.method3129(class177.method2707(arg0));
            field958.method2956(arg0);
        }
    }

    @ObfuscatedName("dz.ib(Lhe;I)I")
    public static int method1955(class220 arg0) {
        class202 var1 = (class202) field1118.method3339(((long) arg0.field2668 << 32) + (long) arg0.field2669);
        return var1 == null ? arg0.field2676 : var1.field2501;
    }

    @ObfuscatedName("ec.jd(Lhe;I)Lhe;")
    public static class220 method2426(class220 arg0) {
        int var1 = method1955(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class220.method2339(arg0.field2693);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("cy.je(Lhe;B)Ljava/lang/String;")
    public static String method1405(class220 arg0) {
        if (class221.method95(method1955(arg0)) == 0) {
            return null;
        } else if (arg0.field2747 == null || arg0.field2747.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2747;
        }
    }

    @ObfuscatedName("gj.jw(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method3235(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field920 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field920 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field920 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field920 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field920 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field600 != null) {
            var3 = "/p=" + Statics.field600;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field1129 + "/a=" + Statics.field2175 + var3 + "/";
    }

    @ObfuscatedName("hj.jk(Ljava/lang/String;I)V")
    public static void method3805(String arg0) {
        Statics.field600 = arg0;
        try {
            String var1 = Statics.field336.getParameter(class278.field3722.field3737);
            String var2 = Statics.field336.getParameter(class278.field3735.field3737);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class179.method3585() + 94608000000L;
                class186.field2456.setTime(new Date(var6));
                int var8 = class186.field2456.get(7);
                int var9 = class186.field2456.get(5);
                int var10 = class186.field2456.get(2);
                int var11 = class186.field2456.get(1);
                int var12 = class186.field2456.get(11);
                int var13 = class186.field2456.get(12);
                int var14 = class186.field2456.get(13);
                String var15 = class186.field2455[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class186.field2454[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field336;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("jk.jt(Lfs;I)V")
    public static void method4466(class177 arg0) {
        if (field952 == null) {
            byte[] var1 = class157.method456();
            arg0.method2959(var1, 0, var1.length);
        } else {
            arg0.method2959(field952, 0, field952.length);
        }
    }
}
