package deob;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class162[] field976 = new class162[4];

    @ObfuscatedName("client.ao")
    public static boolean field1061 = true;

    @ObfuscatedName("client.bz")
    public static int field915 = 1;

    @ObfuscatedName("client.bd")
    public static int field916 = 0;

    @ObfuscatedName("client.bh")
    public static int field949 = 0;

    @ObfuscatedName("client.bo")
    public static boolean field996 = false;

    @ObfuscatedName("client.bi")
    public static boolean field919 = false;

    @ObfuscatedName("client.bn")
    public static int field920 = 0;

    @ObfuscatedName("client.bs")
    public static int field922 = 0;

    @ObfuscatedName("client.bc")
    public static boolean field923 = true;

    @ObfuscatedName("client.bw")
    public static int field929 = 0;

    @ObfuscatedName("client.bp")
    public static long field925 = 1L;

    @ObfuscatedName("client.bq")
    public static int field927 = -1;

    @ObfuscatedName("client.be")
    public static int field928 = -1;

    @ObfuscatedName("client.bv")
    public static int field970 = -1;

    @ObfuscatedName("client.bb")
    public static boolean field930 = true;

    @ObfuscatedName("client.bt")
    public static boolean field931 = false;

    @ObfuscatedName("client.bf")
    public static int field1071 = 0;

    @ObfuscatedName("client.br")
    public static int field993 = 0;

    @ObfuscatedName("client.bx")
    public static int field934 = 0;

    @ObfuscatedName("client.cm")
    public static int field1151 = 0;

    @ObfuscatedName("client.cf")
    public static int field1044 = 0;

    @ObfuscatedName("client.cw")
    public static int field937 = 0;

    @ObfuscatedName("client.cc")
    public static int field961 = 0;

    @ObfuscatedName("client.cy")
    public static int field939 = 0;

    @ObfuscatedName("client.cq")
    public static int field1118 = 0;

    @ObfuscatedName("client.cj")
    public static class92 field941 = class92.field1394;

    @ObfuscatedName("client.ct")
    public static class92 field1162 = class92.field1394;

    @ObfuscatedName("client.cb")
    public static int field1048 = 0;

    @ObfuscatedName("client.cu")
    public static int field935 = 0;

    @ObfuscatedName("client.cg")
    public static int field933 = 0;

    @ObfuscatedName("client.dt")
    public static int field977 = 0;

    @ObfuscatedName("client.do")
    public static int field948 = 0;

    @ObfuscatedName("client.df")
    public static int field947 = 0;

    @ObfuscatedName("client.da")
    public static int field950 = 0;

    @ObfuscatedName("client.dy")
    public static int field951 = 0;

    @ObfuscatedName("client.dz")
    public static byte[] field952 = null;

    @ObfuscatedName("client.dv")
    public static class87[] field1050 = new class87[32768];

    @ObfuscatedName("client.dj")
    public static int field954 = 0;

    @ObfuscatedName("client.dd")
    public static int[] field955 = new int[32768];

    @ObfuscatedName("client.dr")
    public static int field956 = 0;

    @ObfuscatedName("client.eg")
    public static int[] field957 = new int[250];

    @ObfuscatedName("client.ec")
    public static class180 field958 = new class180(5000);

    @ObfuscatedName("client.ee")
    public static class180 field1133 = new class180(5000);

    @ObfuscatedName("client.ei")
    public static class180 field1168 = new class180(15000);

    @ObfuscatedName("client.em")
    public static int field926 = 0;

    @ObfuscatedName("client.ej")
    public static int field1002 = 0;

    @ObfuscatedName("client.ex")
    public static int field963 = 0;

    @ObfuscatedName("client.ev")
    public static int field964 = 0;

    @ObfuscatedName("client.et")
    public static int field965 = 0;

    @ObfuscatedName("client.es")
    public static int field1060 = 0;

    @ObfuscatedName("client.ea")
    public static int field967 = 0;

    @ObfuscatedName("client.eh")
    public static int field968 = 0;

    @ObfuscatedName("client.eq")
    public static boolean field959 = false;

    @ObfuscatedName("client.ep")
    public static HashMap field1003 = new HashMap();

    @ObfuscatedName("client.fm")
    public static int field971 = 0;

    @ObfuscatedName("client.fb")
    public static int field972 = 1;

    @ObfuscatedName("client.fz")
    public static int field973 = 0;

    @ObfuscatedName("client.fu")
    public static int field1025 = 1;

    @ObfuscatedName("client.fh")
    public static int field975 = 0;

    @ObfuscatedName("client.fa")
    public static boolean field1045 = false;

    @ObfuscatedName("client.fj")
    public static int[][][] field1134 = new int[4][13][13];

    @ObfuscatedName("client.fs")
    public static final int[] field979 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fe")
    public static int field1067 = 0;

    @ObfuscatedName("client.gb")
    public static int field981 = 2301979;

    @ObfuscatedName("client.gj")
    public static int field1033 = 5063219;

    @ObfuscatedName("client.gq")
    public static int field983 = 3353893;

    @ObfuscatedName("client.gi")
    public static int field1128 = 7759444;

    @ObfuscatedName("client.gg")
    public static boolean field1077 = false;

    @ObfuscatedName("client.gh")
    public static int field986 = 0;

    @ObfuscatedName("client.gx")
    public static int field988 = 128;

    @ObfuscatedName("client.go")
    public static int field1019 = 0;

    @ObfuscatedName("client.gy")
    public static int field990 = 0;

    @ObfuscatedName("client.gm")
    public static int field1016 = 0;

    @ObfuscatedName("client.gr")
    public static int field992 = 0;

    @ObfuscatedName("client.gw")
    public static int field1079 = 0;

    @ObfuscatedName("client.gl")
    public static int field994 = 50;

    @ObfuscatedName("client.gu")
    public static int field995 = 0;

    @ObfuscatedName("client.hf")
    public static boolean field1147 = false;

    @ObfuscatedName("client.ht")
    public static int field997 = 0;

    @ObfuscatedName("client.hm")
    public static int field962 = 0;

    @ObfuscatedName("client.hu")
    public static int field999 = 50;

    @ObfuscatedName("client.hs")
    public static int[] field1000 = new int[field999];

    @ObfuscatedName("client.hp")
    public static int[] field1001 = new int[field999];

    @ObfuscatedName("client.ha")
    public static int[] field982 = new int[field999];

    @ObfuscatedName("client.hw")
    public static int[] field1052 = new int[field999];

    @ObfuscatedName("client.ho")
    public static int[] field1088 = new int[field999];

    @ObfuscatedName("client.hc")
    public static int[] field1005 = new int[field999];

    @ObfuscatedName("client.hy")
    public static int[] field1006 = new int[field999];

    @ObfuscatedName("client.hg")
    public static String[] field1007 = new String[field999];

    @ObfuscatedName("client.hk")
    public static int[][] field1008 = new int[104][104];

    @ObfuscatedName("client.hr")
    public static int field1022 = 0;

    @ObfuscatedName("client.hi")
    public static int field1010 = -1;

    @ObfuscatedName("client.hv")
    public static int field974 = -1;

    @ObfuscatedName("client.hq")
    public static int field1012 = 0;

    @ObfuscatedName("client.hz")
    public static int field1013 = 0;

    @ObfuscatedName("client.hd")
    public static int field1014 = 0;

    @ObfuscatedName("client.hb")
    public static int field953 = 0;

    @ObfuscatedName("client.hj")
    public static int field1076 = 0;

    @ObfuscatedName("client.hn")
    public static int field1183 = 0;

    @ObfuscatedName("client.hx")
    public static int field989 = 0;

    @ObfuscatedName("client.im")
    public static int field1144 = 0;

    @ObfuscatedName("client.ip")
    public static int field1020 = 0;

    @ObfuscatedName("client.ie")
    public static int field1021 = 0;

    @ObfuscatedName("client.ig")
    public static boolean field1102 = false;

    @ObfuscatedName("client.ir")
    public static int field1023 = 0;

    @ObfuscatedName("client.if")
    public static int field1024 = 0;

    @ObfuscatedName("client.is")
    public static class75[] field1070 = new class75[2048];

    @ObfuscatedName("client.ii")
    public static int field1026 = -1;

    @ObfuscatedName("client.iy")
    public static int field1027 = 0;

    @ObfuscatedName("client.ik")
    public static int field1028 = 0;

    @ObfuscatedName("client.in")
    public static int[] field1029 = new int[1000];

    @ObfuscatedName("client.ij")
    public static final int[] field1030 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.iv")
    public static String[] field1031 = new String[8];

    @ObfuscatedName("client.ih")
    public static boolean[] field1032 = new boolean[8];

    @ObfuscatedName("client.id")
    public static int[] field984 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.it")
    public static String field1059 = null;

    @ObfuscatedName("client.ic")
    public static int field1034 = -1;

    @ObfuscatedName("client.il")
    public static class194[][][] field1035 = new class194[4][104][104];

    @ObfuscatedName("client.ib")
    public static class194 field1177 = new class194();

    @ObfuscatedName("client.io")
    public static class194 field1037 = new class194();

    @ObfuscatedName("client.jc")
    public static class194 field1038 = new class194();

    @ObfuscatedName("client.jp")
    public static int[] field1120 = new int[25];

    @ObfuscatedName("client.jn")
    public static int[] field945 = new int[25];

    @ObfuscatedName("client.jt")
    public static int[] field1041 = new int[25];

    @ObfuscatedName("client.jv")
    public static int field1042 = 0;

    @ObfuscatedName("client.jh")
    public static boolean field1043 = false;

    @ObfuscatedName("client.jy")
    public static int field1176 = 0;

    @ObfuscatedName("client.jo")
    public static int[] field1155 = new int[500];

    @ObfuscatedName("client.jg")
    public static int[] field1046 = new int[500];

    @ObfuscatedName("client.jr")
    public static int[] field1047 = new int[500];

    @ObfuscatedName("client.jz")
    public static int[] field1111 = new int[500];

    @ObfuscatedName("client.jb")
    public static String[] field1049 = new String[500];

    @ObfuscatedName("client.jl")
    public static String[] field1114 = new String[500];

    @ObfuscatedName("client.je")
    public static boolean[] field985 = new boolean[500];

    @ObfuscatedName("client.jf")
    public static boolean field1098 = false;

    @ObfuscatedName("client.jq")
    public static boolean field1053 = false;

    @ObfuscatedName("client.ju")
    public static int field1054 = -1;

    @ObfuscatedName("client.jm")
    public static int field1055 = -1;

    @ObfuscatedName("client.ki")
    public static int field918 = 0;

    @ObfuscatedName("client.kw")
    public static int field1122 = 50;

    @ObfuscatedName("client.kb")
    public static int field1058 = 0;

    @ObfuscatedName("client.ku")
    public static boolean field1125 = false;

    @ObfuscatedName("client.kv")
    public static int field1056 = -1;

    @ObfuscatedName("client.kj")
    public static int field1062 = -1;

    @ObfuscatedName("client.kp")
    public static String field1063 = null;

    @ObfuscatedName("client.kl")
    public static String field1064 = null;

    @ObfuscatedName("client.ks")
    public static int field940 = -1;

    @ObfuscatedName("client.kf")
    public static class191 field1066 = new class191(8);

    @ObfuscatedName("client.kt")
    public static int field917 = 0;

    @ObfuscatedName("client.ko")
    public static int field1068 = 0;

    @ObfuscatedName("client.kx")
    public static class217 field1069 = null;

    @ObfuscatedName("client.kq")
    public static int field1145 = 0;

    @ObfuscatedName("client.ky")
    public static int field1096 = 0;

    @ObfuscatedName("client.kz")
    public static int field1072 = 0;

    @ObfuscatedName("client.kh")
    public static int field1073 = -1;

    @ObfuscatedName("client.kd")
    public static boolean field1074 = false;

    @ObfuscatedName("client.kc")
    public static boolean field1075 = false;

    @ObfuscatedName("client.ka")
    public static boolean field1175 = false;

    @ObfuscatedName("client.kr")
    public static class217 field978 = null;

    @ObfuscatedName("client.kk")
    public static class217 field1078 = null;

    @ObfuscatedName("client.lk")
    public static class217 field1148 = null;

    @ObfuscatedName("client.le")
    public static int field1080 = 0;

    @ObfuscatedName("client.lb")
    public static int field1161 = 0;

    @ObfuscatedName("client.ld")
    public static class217 field924 = null;

    @ObfuscatedName("client.lw")
    public static boolean field1083 = false;

    @ObfuscatedName("client.lj")
    public static int field1084 = -1;

    @ObfuscatedName("client.lu")
    public static int field1085 = -1;

    @ObfuscatedName("client.lt")
    public static boolean field1086 = false;

    @ObfuscatedName("client.lq")
    public static int field1087 = -1;

    @ObfuscatedName("client.lm")
    public static int field932 = -1;

    @ObfuscatedName("client.li")
    public static boolean field1089 = false;

    @ObfuscatedName("client.la")
    public static int field1090 = 1;

    @ObfuscatedName("client.lf")
    public static int[] field1091 = new int[32];

    @ObfuscatedName("client.lz")
    public static int field1092 = 0;

    @ObfuscatedName("client.lh")
    public static int[] field1093 = new int[32];

    @ObfuscatedName("client.lx")
    public static int field1146 = 0;

    @ObfuscatedName("client.ls")
    public static int[] field1095 = new int[32];

    @ObfuscatedName("client.lv")
    public static int field944 = 0;

    @ObfuscatedName("client.lp")
    public static int field1097 = 0;

    @ObfuscatedName("client.ln")
    public static int field1143 = 0;

    @ObfuscatedName("client.mm")
    public static int field938 = 0;

    @ObfuscatedName("client.mt")
    public static int field1100 = 0;

    @ObfuscatedName("client.mc")
    public static int field1101 = 0;

    @ObfuscatedName("client.ms")
    public static int field1099 = 0;

    @ObfuscatedName("client.me")
    public static int field1103 = 0;

    @ObfuscatedName("client.mx")
    public static class194 field1104 = new class194();

    @ObfuscatedName("client.mj")
    public static class194 field1105 = new class194();

    @ObfuscatedName("client.mw")
    public static class194 field1106 = new class194();

    @ObfuscatedName("client.mg")
    public static class191 field1107 = new class191(512);

    @ObfuscatedName("client.ma")
    public static int field1108 = 0;

    @ObfuscatedName("client.mn")
    public static int field1109 = -2;

    @ObfuscatedName("client.md")
    public static boolean[] field1110 = new boolean[100];

    @ObfuscatedName("client.mb")
    public static boolean[] field1065 = new boolean[100];

    @ObfuscatedName("client.mr")
    public static boolean[] field1112 = new boolean[100];

    @ObfuscatedName("client.mk")
    public static int[] field1113 = new int[100];

    @ObfuscatedName("client.mo")
    public static int[] field921 = new int[100];

    @ObfuscatedName("client.mh")
    public static int[] field969 = new int[100];

    @ObfuscatedName("client.mz")
    public static int[] field1116 = new int[100];

    @ObfuscatedName("client.ml")
    public static int field1117 = 0;

    @ObfuscatedName("client.mf")
    public static long field1051 = 0L;

    @ObfuscatedName("client.mi")
    public static boolean field1119 = true;

    @ObfuscatedName("client.nr")
    public static int[] field943 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.nb")
    public static int field1018 = 0;

    @ObfuscatedName("client.ng")
    public static int field1004 = 0;

    @ObfuscatedName("client.nf")
    public static String field1123 = "";

    @ObfuscatedName("client.nl")
    public static long[] field1124 = new long[100];

    @ObfuscatedName("client.ns")
    public static int field1115 = 0;

    @ObfuscatedName("client.np")
    public static int field1126 = 0;

    @ObfuscatedName("client.nk")
    public static int[] field1127 = new int[128];

    @ObfuscatedName("client.nx")
    public static int[] field1121 = new int[128];

    @ObfuscatedName("client.nc")
    public static long field1129 = -1L;

    @ObfuscatedName("client.na")
    public static String field1130 = null;

    @ObfuscatedName("client.nj")
    public static String field1131 = null;

    @ObfuscatedName("client.nv")
    public static int field1132 = -1;

    @ObfuscatedName("client.nm")
    public static int field1057 = 0;

    @ObfuscatedName("client.nh")
    public static int[] field1040 = new int[1000];

    @ObfuscatedName("client.oj")
    public static int[] field1135 = new int[1000];

    @ObfuscatedName("client.od")
    public static class286[] field1136 = new class286[1000];

    @ObfuscatedName("client.ou")
    public static int field1017 = 0;

    @ObfuscatedName("client.oh")
    public static int field1138 = 0;

    @ObfuscatedName("client.oe")
    public static int field1139 = 0;

    @ObfuscatedName("client.ok")
    public static int field1140 = 255;

    @ObfuscatedName("client.ob")
    public static int field1141 = -1;

    @ObfuscatedName("client.ox")
    public static boolean field1142 = false;

    @ObfuscatedName("client.ow")
    public static int field1137 = 127;

    @ObfuscatedName("client.oy")
    public static int field1036 = 127;

    @ObfuscatedName("client.ot")
    public static int field936 = 0;

    @ObfuscatedName("client.op")
    public static int[] field1082 = new int[50];

    @ObfuscatedName("client.oq")
    public static int[] field1152 = new int[50];

    @ObfuscatedName("client.on")
    public static int[] field1011 = new int[50];

    @ObfuscatedName("client.oz")
    public static int[] field1149 = new int[50];

    @ObfuscatedName("client.pn")
    public static class106[] field1150 = new class106[50];

    @ObfuscatedName("client.pj")
    public static boolean field1009 = false;

    @ObfuscatedName("client.pd")
    public static boolean[] field960 = new boolean[5];

    @ObfuscatedName("client.ph")
    public static int[] field1153 = new int[5];

    @ObfuscatedName("client.pw")
    public static int[] field1154 = new int[5];

    @ObfuscatedName("client.pp")
    public static int[] field1094 = new int[5];

    @ObfuscatedName("client.pl")
    public static int[] field1156 = new int[5];

    @ObfuscatedName("client.pk")
    public static short field1164 = 256;

    @ObfuscatedName("client.pq")
    public static short field1158 = 205;

    @ObfuscatedName("client.px")
    public static short field1159 = 256;

    @ObfuscatedName("client.pg")
    public static short field1160 = 320;

    @ObfuscatedName("client.pe")
    public static short field914 = 1;

    @ObfuscatedName("client.pc")
    public static short field980 = 32767;

    @ObfuscatedName("client.py")
    public static short field1163 = 1;

    @ObfuscatedName("client.qg")
    public static short field966 = 32767;

    @ObfuscatedName("client.qk")
    public static int field1165 = 0;

    @ObfuscatedName("client.qr")
    public static int field1166 = 0;

    @ObfuscatedName("client.ql")
    public static int field1167 = 0;

    @ObfuscatedName("client.qa")
    public static int field1015 = 0;

    @ObfuscatedName("client.qb")
    public static int field1169 = 0;

    @ObfuscatedName("client.qw")
    public static int field1170 = 0;

    @ObfuscatedName("client.qh")
    public static int field1171 = 0;

    @ObfuscatedName("client.qz")
    public static class66[] field1172 = new class66[400];

    @ObfuscatedName("client.qu")
    public static class196 field1173 = new class196();

    @ObfuscatedName("client.qj")
    public static int field1174 = 0;

    @ObfuscatedName("client.qo")
    public static class71[] field998 = new class71[400];

    @ObfuscatedName("client.qx")
    public static class214 field1081 = new class214();

    @ObfuscatedName("client.qe")
    public static int field1157 = -1;

    @ObfuscatedName("client.qf")
    public static int field1178 = -1;

    @ObfuscatedName("client.qp")
    public static class17[] field1179 = new class17[8];

    @ObfuscatedName("client.rl")
    public static final class74 field1180 = new class74();

    @ObfuscatedName("client.rh")
    public static int[] field1181 = new int[50];

    @ObfuscatedName("client.ri")
    public static int[] field1182 = new int[50];

    @ObfuscatedName("bb.ek(I)Lkw;")
    public static class289 method979() {
        return Statics.field991;
    }

    @ObfuscatedName("client.ae(S)V")
    public final void method752() {
    }

    public final void init() {
        if (!this.method728()) {
            return;
        }
        class275[] var1 = new class275[] { class275.field3703, class275.field3699, class275.field3704, class275.field3706, class275.field3701, class275.field3702, class275.field3705, class275.field3712, class275.field3708, class275.field3711, class275.field3707, class275.field3698, class275.field3710, class275.field3700, class275.field3709 };
        class275[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class275 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3713);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3713)) {
                    case 1:
                        int var6 = Integer.parseInt(var5);
                        class232[] var7 = new class232[] { class232.field3159, class232.field3155, class232.field3157, class232.field3152 };
                        class232[] var8 = var7;
                        int var9 = 0;
                        class232 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class232 var10 = var8[var9];
                            if (var10.field3153 == var6) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field2374 = var11;
                    case 2:
                    case 5:
                    case 12:
                    default:
                        break;
                    case 3:
                        field949 = Integer.parseInt(var5);
                        break;
                    case 4:
                        field920 = Integer.parseInt(var5);
                        break;
                    case 6:
                        field915 = Integer.parseInt(var5);
                        break;
                    case 7:
                        Statics.field942 = Integer.parseInt(var5);
                        break;
                    case 8:
                        Statics.field2784 = var5;
                        break;
                    case 9:
                        if (var5.equalsIgnoreCase(class89.field1369)) {
                            field996 = true;
                        } else {
                            field996 = false;
                        }
                        break;
                    case 10:
                        Statics.field431 = var5;
                        break;
                    case 11:
                        field916 = Integer.parseInt(var5);
                        break;
                    case 13:
                        if (var5.equalsIgnoreCase(class89.field1369)) {
                        }
                        break;
                    case 14:
                        Statics.field324 = Integer.parseInt(var5);
                        break;
                    case 15:
                        class233[] var12 = new class233[] { class233.field3161, class233.field3165, class233.field3163, class233.field3162, class233.field3167, class233.field3164 };
                        Statics.field1498 = (class233) class169.method454(var12, Integer.parseInt(var5));
                        if (Statics.field1498 == class233.field3165) {
                            Statics.field332 = class290.field3846;
                        } else {
                            Statics.field332 = class290.field3845;
                        }
                }
            }
        }
        method1565();
        Statics.field1521 = this.getCodeBase().getHost();
        String var13 = Statics.field2374.field3156;
        byte var14 = 0;
        try {
            class156.method1380("oldschool", var13, var14, 17);
        } catch (Exception var16) {
            class153.method463((String) null, var16);
        }
        Statics.field1353 = this;
        this.method726(765, 503, 150);
    }

    @ObfuscatedName("cu.ee(I)V")
    public static final void method1565() {
        class140.field2040 = false;
        field919 = false;
    }

    @ObfuscatedName("client.am(B)V")
    public final void method742() {
        Statics.field828 = field949 == 0 ? 43594 : field915 + 40000;
        Statics.field457 = field949 == 0 ? 443 : field915 + 50000;
        Statics.field311 = Statics.field828;
        Statics.field2584 = class215.field2598;
        Statics.field2591 = class215.field2596;
        Statics.field3297 = class215.field2597;
        Statics.field2592 = class215.field2600;
        this.method720();
        this.method721();
        Statics.field439 = this.method717();
        Statics.field1348 = new class161(255, class156.field2212, class156.field2204, 500000);
        Statics.field479 = class82.method880();
        this.method718();
        class57.method453(this, Statics.field2413);
        if (field949 != 0) {
            field931 = true;
        }
        int var1 = Statics.field479.field1302;
        field1051 = 0L;
        if (var1 >= 2) {
            field1119 = true;
        } else {
            field1119 = false;
        }
        int var2 = field1119 ? 2 : 1;
        if (var2 == 1) {
            Statics.field1353.method825(765, 503);
        } else {
            Statics.field1353.method825(7680, 2160);
        }
        if (field922 >= 25) {
            method940();
        }
    }

    @ObfuscatedName("client.ag(I)V")
    public final void method743() {
        field929++;
        this.method1183();
        class237.method2745();
        try {
            if (class204.field2472 == 1) {
                int var1 = Statics.field2471.method3392();
                if (var1 > 0 && Statics.field2471.method3398()) {
                    int var2 = var1 - Statics.field1525;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2471.method3391(var2);
                } else {
                    Statics.field2471.method3397();
                    Statics.field2471.method3395();
                    if (Statics.field2816 == null) {
                        class204.field2472 = 0;
                    } else {
                        class204.field2472 = 2;
                    }
                    Statics.field2476 = null;
                    Statics.field261 = null;
                }
            }
        } catch (Exception var12) {
            var12.printStackTrace();
            Statics.field2471.method3397();
            class204.field2472 = 0;
            Statics.field2476 = null;
            Statics.field261 = null;
            Statics.field2816 = null;
        }
        method2598();
        class51.method530();
        class60 var4 = class60.field725;
        synchronized (class60.field725) {
            class60.field734 = class60.field727;
            class60.field731 = class60.field728;
            class60.field732 = class60.field729;
            class60.field730 = class60.field733;
            class60.field738 = class60.field740;
            class60.field724 = class60.field735;
            class60.field723 = class60.field736;
            class60.field733 = 0;
        }
        if (Statics.field439 != null) {
            int var6 = Statics.field439.method612();
            field1103 = var6;
        }
        if (field922 == 0) {
            method2663();
            Statics.field1751.method2626();
            for (int var7 = 0; var7 < 32; var7++) {
                field697[var7] = 0L;
            }
            for (int var8 = 0; var8 < 32; var8++) {
                field687[var8] = 0L;
            }
            Statics.field693 = 0;
        } else if (field922 == 5) {
            class93.method2664(this);
            method2663();
            Statics.field1751.method2626();
            for (int var9 = 0; var9 < 32; var9++) {
                field697[var9] = 0L;
            }
            for (int var10 = 0; var10 < 32; var10++) {
                field687[var10] = 0L;
            }
            Statics.field693 = 0;
        } else if (field922 == 10 || field922 == 11) {
            class93.method2664(this);
        } else if (field922 == 20) {
            class93.method2664(this);
            this.method1012();
        } else if (field922 == 25) {
            method477();
        }
        if (field922 == 30) {
            this.method1013();
        } else if (field922 == 40 || field922 == 45) {
            this.method1012();
        }
    }

    @ObfuscatedName("client.av(ZI)V")
    public final void method744(boolean arg0) {
        boolean var2;
        label162: {
            try {
                if (class204.field2472 == 2) {
                    if (Statics.field2476 == null) {
                        Statics.field2476 = class210.method3568(Statics.field2816, Statics.field2469, Statics.field2474);
                        if (Statics.field2476 == null) {
                            var2 = false;
                            break label162;
                        }
                    }
                    if (Statics.field261 == null) {
                        Statics.field261 = new class113(Statics.field3645, Statics.field2470);
                    }
                    if (Statics.field2471.method3393(Statics.field2476, Statics.field2477, Statics.field261, 22050)) {
                        Statics.field2471.method3427();
                        Statics.field2471.method3391(Statics.field514);
                        Statics.field2471.method3396(Statics.field2476, Statics.field2475);
                        class204.field2472 = 0;
                        Statics.field2476 = null;
                        Statics.field261 = null;
                        Statics.field2816 = null;
                        var2 = true;
                        break label162;
                    }
                }
            } catch (Exception var12) {
                var12.printStackTrace();
                Statics.field2471.method3397();
                class204.field2472 = 0;
                Statics.field2476 = null;
                Statics.field261 = null;
                Statics.field2816 = null;
            }
            var2 = false;
        }
        if (var2 && field1142 && Statics.field1965 != null) {
            Statics.field1965.method1813();
        }
        if ((field922 == 10 || field922 == 20 || field922 == 30) && field1051 != 0L && class176.method2679() > field1051) {
            int var5 = field1119 ? 2 : 1;
            field1051 = 0L;
            if (var5 >= 2) {
                field1119 = true;
            } else {
                field1119 = false;
            }
            int var6 = field1119 ? 2 : 1;
            if (var6 == 1) {
                Statics.field1353.method825(765, 503);
            } else {
                Statics.field1353.method825(7680, 2160);
            }
            if (field922 >= 25) {
                method940();
            }
        }
        if (arg0) {
            for (int var7 = 0; var7 < 100; var7++) {
                field1110[var7] = true;
            }
        }
        if (field922 == 0) {
            this.method746(class93.field1399, class93.field1416, arg0);
        } else if (field922 == 5) {
            class93.method3704(Statics.field3286, Statics.field294, Statics.field1626, arg0);
        } else if (field922 == 10 || field922 == 11) {
            class93.method3704(Statics.field3286, Statics.field294, Statics.field1626, arg0);
        } else if (field922 == 20) {
            class93.method3704(Statics.field3286, Statics.field294, Statics.field1626, arg0);
        } else if (field922 == 25) {
            if (field975 == 1) {
                if (field971 > field972) {
                    field972 = field971;
                }
                int var8 = (field972 * 50 - field971 * 50) / field972;
                method2761(class226.field2835 + class89.field1372 + class89.field1377 + var8 + "%" + class89.field1373, false);
            } else if (field975 == 2) {
                if (field973 > field1025) {
                    field1025 = field973;
                }
                int var9 = (field1025 * 50 - field973 * 50) / field1025 + 50;
                method2761(class226.field2835 + class89.field1372 + class89.field1377 + var9 + "%" + class89.field1373, false);
            } else {
                method2761(class226.field2835, false);
            }
        } else if (field922 == 30) {
            this.method1015();
        } else if (field922 == 40) {
            method2761(class226.field2836 + class89.field1372 + class226.field2837, false);
        } else if (field922 == 45) {
            method2761(class226.field2983, false);
        }
        if (field922 == 30 && field1117 == 0 && !arg0 && !field1119) {
            for (int var10 = 0; var10 < field1108; var10++) {
                if (field1065[var10]) {
                    Statics.field418.method701(field1113[var10], field921[var10], field969[var10], field1116[var10]);
                    field1065[var10] = false;
                }
            }
        } else if (field922 > 0) {
            Statics.field418.method700(0, 0);
            for (int var11 = 0; var11 < field1108; var11++) {
                field1065[var11] = false;
            }
        }
    }

    @ObfuscatedName("client.al(I)V")
    public final void method745() {
        if (Statics.field1492.method1610()) {
            Statics.field1492.method1607();
        }
        if (Statics.field1039 != null) {
            Statics.field1039.field855 = false;
        }
        Statics.field1039 = null;
        if (Statics.field273 != null) {
            Statics.field273.method2684();
            Statics.field273 = null;
        }
        class51.method652();
        if (class60.field725 != null) {
            class60 var1 = class60.field725;
            synchronized (class60.field725) {
                class60.field725 = null;
            }
        }
        Statics.field439 = null;
        if (Statics.field1965 != null) {
            Statics.field1965.method1803();
        }
        if (Statics.field867 != null) {
            Statics.field867.method1803();
        }
        class239.method1653();
        class237.method971();
        try {
            class156.field2212.method2089();
            for (int var3 = 0; var3 < Statics.field224; var3++) {
                Statics.field2200[var3].method2089();
            }
            class156.field2204.method2089();
            class156.field2208.method2089();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("ef.ei(II)V")
    public static void method2630(int arg0) {
        if (field922 == arg0) {
            return;
        }
        if (field922 == 0) {
            Statics.field1353.method747();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field948 = 0;
            field947 = 0;
            field950 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field681 != null) {
            Statics.field681.method2684();
            Statics.field681 = null;
        }
        if (field922 == 25) {
            field975 = 0;
            field971 = 0;
            field972 = 1;
            field973 = 0;
            field1025 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class93.method48(Statics.field388, Statics.field3670, true, 0);
        } else if (arg0 == 20) {
            class93.method48(Statics.field388, Statics.field3670, true, field922 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class93.method48(Statics.field388, Statics.field3670, false, 4);
        } else {
            class93.method948();
        }
        field922 = arg0;
    }

    @ObfuscatedName("client.em(I)V")
    public void method1183() {
        if (field922 == 1000) {
            return;
        }
        long var1 = class176.method2679();
        int var3 = (int) (var1 - Statics.field3224);
        Statics.field3224 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class239.field3230 += var3;
        boolean var4;
        if (class239.field3229 == 0 && class239.field3239 == 0 && class239.field3222 == 0 && class239.field3226 == 0) {
            var4 = true;
        } else if (Statics.field3227 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class239.field3230 > 30000) {
                        throw new IOException();
                    }
                    while (class239.field3239 < 20 && class239.field3226 > 0) {
                        class235 var5 = (class235) class239.field3225.method3241();
                        class174 var6 = new class174(4);
                        var6.method2922(1);
                        var6.method2847((int) var5.field2437);
                        Statics.field3227.method2689(var6.field2355, 0, 4);
                        class239.field3234.method3239(var5, var5.field2437);
                        class239.field3226--;
                        class239.field3239++;
                    }
                    while (class239.field3229 < 20 && class239.field3222 > 0) {
                        class235 var7 = (class235) class239.field3233.method3175();
                        class174 var8 = new class174(4);
                        var8.method2922(0);
                        var8.method2847((int) var7.field2437);
                        Statics.field3227.method2689(var8.field2355, 0, 4);
                        var7.method3320();
                        class239.field3232.method3239(var7, var7.field2437);
                        class239.field3222--;
                        class239.field3229++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3227.method2687();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class239.field3230 = 0;
                        byte var11 = 0;
                        if (Statics.field3238 == null) {
                            var11 = 8;
                        } else if (class239.field3236 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class239.field3235.field2357;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3227.method2688(class239.field3235.field2355, class239.field3235.field2357, var12);
                            if (class239.field3240 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class239.field3235.field2355[class239.field3235.field2357 + var13] ^= class239.field3240;
                                }
                            }
                            class239.field3235.field2357 += var12;
                            if (class239.field3235.field2357 < var11) {
                                break;
                            }
                            if (Statics.field3238 == null) {
                                class239.field3235.field2357 = 0;
                                int var14 = class239.field3235.method2843();
                                int var15 = class239.field3235.method2861();
                                int var16 = class239.field3235.method2843();
                                int var17 = class239.field3235.method2987();
                                long var18 = (long) ((var14 << 16) + var15);
                                class235 var20 = (class235) class239.field3234.method3251(var18);
                                Statics.field2559 = true;
                                if (var20 == null) {
                                    var20 = (class235) class239.field3232.method3251(var18);
                                    Statics.field2559 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field3238 = var20;
                                Statics.field2155 = new class174(var17 + var21 + Statics.field3238.field3178);
                                Statics.field2155.method2922(var16);
                                Statics.field2155.method3024(var17);
                                class239.field3236 = 8;
                                class239.field3235.field2357 = 0;
                            } else if (class239.field3236 == 0) {
                                if (class239.field3235.field2355[0] == -1) {
                                    class239.field3236 = 1;
                                    class239.field3235.field2357 = 0;
                                } else {
                                    Statics.field3238 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2155.field2355.length - Statics.field3238.field3178;
                            int var23 = 512 - class239.field3236;
                            if (var23 > var22 - Statics.field2155.field2357) {
                                var23 = var22 - Statics.field2155.field2357;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3227.method2688(Statics.field2155.field2355, Statics.field2155.field2357, var23);
                            if (class239.field3240 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2155.field2355[Statics.field2155.field2357 + var24] ^= class239.field3240;
                                }
                            }
                            Statics.field2155.field2357 += var23;
                            class239.field3236 += var23;
                            if (Statics.field2155.field2357 == var22) {
                                if (Statics.field3238.field2437 == 16711935L) {
                                    Statics.field621 = Statics.field2155;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class238 var26 = class239.field3243[var25];
                                        if (var26 != null) {
                                            Statics.field621.field2357 = var25 * 8 + 5;
                                            int var27 = Statics.field621.method2987();
                                            int var28 = Statics.field621.method2987();
                                            var26.method3826(var27, var28);
                                        }
                                    }
                                } else {
                                    class239.field3223.reset();
                                    class239.field3223.update(Statics.field2155.field2355, 0, var22);
                                    int var29 = (int) class239.field3223.getValue();
                                    if (Statics.field3238.field3179 != var29) {
                                        try {
                                            Statics.field3227.method2684();
                                        } catch (Exception var35) {
                                        }
                                        class239.field3241++;
                                        Statics.field3227 = null;
                                        class239.field3240 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class239.field3241 = 0;
                                    class239.field3242 = 0;
                                    Statics.field3238.field3177.method3827((int) (Statics.field3238.field2437 & 0xFFFFL), Statics.field2155.field2355, (Statics.field3238.field2437 & 0xFF0000L) == 16711680L, Statics.field2559);
                                }
                                Statics.field3238.method3287();
                                if (Statics.field2559) {
                                    class239.field3239--;
                                } else {
                                    class239.field3229--;
                                }
                                class239.field3236 = 0;
                                Statics.field3238 = null;
                                Statics.field2155 = null;
                            } else {
                                if (class239.field3236 != 512) {
                                    break;
                                }
                                class239.field3236 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3227.method2684();
                } catch (Exception var34) {
                }
                class239.field3242++;
                Statics.field3227 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1207();
        }
    }

    @ObfuscatedName("client.ej(I)V")
    public void method1207() {
        if (class239.field3241 >= 4) {
            this.method724("js5crc");
            field922 = 1000;
            return;
        }
        if (class239.field3242 >= 4) {
            if (field922 <= 5) {
                this.method724("js5io");
                field922 = 1000;
                return;
            }
            field933 = 3000;
            class239.field3242 = 3;
        }
        if (--field933 + 1 > 0) {
            return;
        }
        try {
            if (field935 == 0) {
                Statics.field312 = Statics.field699.method2639(Statics.field1521, Statics.field311);
                field935++;
            }
            if (field935 == 1) {
                if (Statics.field312.field2189 == 2) {
                    this.method1011(-1);
                    return;
                }
                if (Statics.field312.field2189 == 1) {
                    field935++;
                }
            }
            if (field935 == 2) {
                Statics.field325 = new class160((Socket) Statics.field312.field2193, Statics.field699);
                class174 var1 = new class174(5);
                var1.method2922(15);
                var1.method3024(150);
                Statics.field325.method2689(var1.field2355, 0, 5);
                field935++;
                Statics.field1480 = class176.method2679();
            }
            if (field935 == 3) {
                if (field922 <= 5 || Statics.field325.method2687() > 0) {
                    int var2 = Statics.field325.method2686();
                    if (var2 != 0) {
                        this.method1011(var2);
                        return;
                    }
                    field935++;
                } else if (class176.method2679() - Statics.field1480 > 30000L) {
                    this.method1011(-2);
                    return;
                }
            }
            if (field935 == 4) {
                class160 var3 = Statics.field325;
                boolean var4 = field922 > 20;
                if (Statics.field3227 != null) {
                    try {
                        Statics.field3227.method2684();
                    } catch (Exception var14) {
                    }
                    Statics.field3227 = null;
                }
                Statics.field3227 = var3;
                class239.method1512(var4);
                class239.field3235.field2357 = 0;
                Statics.field3238 = null;
                Statics.field2155 = null;
                class239.field3236 = 0;
                while (true) {
                    class235 var6 = (class235) class239.field3234.method3241();
                    if (var6 == null) {
                        while (true) {
                            class235 var7 = (class235) class239.field3232.method3241();
                            if (var7 == null) {
                                if (class239.field3240 != 0) {
                                    try {
                                        class174 var8 = new class174(4);
                                        var8.method2922(4);
                                        var8.method2922(class239.field3240);
                                        var8.method2846(0);
                                        Statics.field3227.method2689(var8.field2355, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3227.method2684();
                                        } catch (Exception var12) {
                                        }
                                        class239.field3242++;
                                        Statics.field3227 = null;
                                    }
                                }
                                class239.field3230 = 0;
                                Statics.field3224 = class176.method2679();
                                Statics.field312 = null;
                                Statics.field325 = null;
                                field935 = 0;
                                field977 = 0;
                                return;
                            }
                            class239.field3233.method3178(var7);
                            class239.field3228.method3239(var7, var7.field2437);
                            class239.field3222++;
                            class239.field3229--;
                        }
                    }
                    class239.field3225.method3239(var6, var6.field2437);
                    class239.field3226++;
                    class239.field3239--;
                }
            }
        } catch (IOException var15) {
            this.method1011(-3);
        }
    }

    @ObfuscatedName("client.ex(IB)V")
    public void method1011(int arg0) {
        Statics.field312 = null;
        Statics.field325 = null;
        field935 = 0;
        if (Statics.field828 == Statics.field311) {
            Statics.field311 = Statics.field457;
        } else {
            Statics.field311 = Statics.field828;
        }
        field977++;
        if (field977 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field922 <= 5) {
                this.method724("js5connect_full");
                field922 = 1000;
            } else {
                field933 = 3000;
            }
        } else if (field977 >= 2 && arg0 == 6) {
            this.method724("js5connect_outofdate");
            field922 = 1000;
        } else if (field977 >= 4) {
            if (field922 <= 5) {
                this.method724("js5connect");
                field922 = 1000;
            } else {
                field933 = 3000;
            }
        }
    }

    @ObfuscatedName("ew.ev(I)V")
    public static void method2663() {
        if (field1048 == 0) {
            Statics.field315 = new class140(4, 104, 104, class62.field763);
            for (int var0 = 0; var0 < 4; var0++) {
                field976[var0] = new class162(104, 104);
            }
            Statics.field577 = new class286(512, 512);
            class93.field1416 = class226.field2838;
            class93.field1399 = 5;
            field1048 = 20;
        } else if (field1048 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class137.field1983[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class140.method2440(var1, 500, 800, 512, 334);
            class93.field1416 = class226.field2839;
            class93.field1399 = 10;
            field1048 = 30;
        } else if (field1048 == 30) {
            Statics.field507 = method931(0, false, true, true);
            Statics.field1632 = method931(1, false, true, true);
            Statics.field946 = method931(2, true, false, true);
            Statics.field3569 = method931(3, false, true, true);
            Statics.field354 = method931(4, false, true, true);
            Statics.field2401 = method931(5, true, true, true);
            Statics.field232 = method931(6, true, true, false);
            Statics.field9 = method931(7, false, true, true);
            Statics.field3670 = method931(8, false, true, true);
            Statics.field377 = method931(9, false, true, true);
            Statics.field388 = method931(10, false, true, true);
            Statics.field2817 = method931(11, false, true, true);
            Statics.field272 = method931(12, false, true, true);
            Statics.field745 = method931(13, true, false, true);
            Statics.field1526 = method931(14, false, true, false);
            Statics.field1432 = method931(15, false, true, true);
            Statics.field1463 = method931(16, false, true, false);
            class93.field1416 = class226.field2915;
            class93.field1399 = 20;
            field1048 = 40;
        } else if (field1048 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field507.method3838() * 4 / 100;
            int var8 = var7 + Statics.field1632.method3838() * 4 / 100;
            int var9 = var8 + Statics.field946.method3838() * 2 / 100;
            int var10 = var9 + Statics.field3569.method3838() * 2 / 100;
            int var11 = var10 + Statics.field354.method3838() * 6 / 100;
            int var12 = var11 + Statics.field2401.method3838() * 4 / 100;
            int var13 = var12 + Statics.field232.method3838() * 2 / 100;
            int var14 = var13 + Statics.field9.method3838() * 58 / 100;
            int var15 = var14 + Statics.field3670.method3838() * 2 / 100;
            int var16 = var15 + Statics.field377.method3838() * 2 / 100;
            int var17 = var16 + Statics.field388.method3838() * 2 / 100;
            int var18 = var17 + Statics.field2817.method3838() * 2 / 100;
            int var19 = var18 + Statics.field272.method3838() * 2 / 100;
            int var20 = var19 + Statics.field745.method3838() * 2 / 100;
            int var21 = var20 + Statics.field1526.method3838() * 2 / 100;
            int var22 = var21 + Statics.field1432.method3838() * 2 / 100;
            int var23 = var22 + Statics.field1463.method3838() * 2 / 100;
            if (var23 == 100) {
                class93.field1416 = class226.field2993;
                class93.field1399 = 30;
                field1048 = 45;
            } else {
                if (var23 != 0) {
                    class93.field1416 = class226.field3043 + var23 + "%";
                }
                class93.field1399 = 30;
            }
        } else if (field1048 == 45) {
            boolean var24 = !field919;
            Statics.field1276 = 22050;
            Statics.field234 = var24;
            Statics.field3608 = 2;
            class205 var25 = new class205();
            var25.method3399(9, 128);
            Statics.field1965 = class110.method1573(Statics.field699, 0, 22050);
            Statics.field1965.method1801(var25);
            class204.method2820(Statics.field1432, Statics.field1526, Statics.field354, var25);
            Statics.field867 = class110.method1573(Statics.field699, 1, 2048);
            Statics.field5 = new class103();
            Statics.field867.method1801(Statics.field5);
            Statics.field238 = new class117(22050, Statics.field1276);
            class93.field1416 = class226.field2843;
            class93.field1399 = 35;
            field1048 = 50;
            Statics.field603 = new class263(Statics.field3670, Statics.field745);
        } else if (field1048 == 50) {
            int var26 = class262.method4307().length;
            field1003 = Statics.field603.method4311(class262.method4307());
            if (field1003.size() < var26) {
                class93.field1416 = class226.field3000 + field1003.size() * 100 / var26 + "%";
                class93.field1399 = 40;
            } else {
                Statics.field294 = (class264) field1003.get(class262.field3609);
                Statics.field1626 = (class264) field1003.get(class262.field3601);
                Statics.field3286 = (class264) field1003.get(class262.field3602);
                Statics.field2601 = new class292(true);
                class93.field1416 = class226.field2845;
                class93.field1399 = 40;
                field1048 = 60;
            }
        } else if (field1048 == 60) {
            int var27 = class93.method1386(Statics.field388, Statics.field3670);
            int var28 = class93.method3068();
            if (var27 < var28) {
                class93.field1416 = class226.field2846 + var27 * 100 / var28 + "%";
                class93.field1399 = 50;
            } else {
                class93.field1416 = class226.field2847;
                class93.field1399 = 50;
                method2630(5);
                field1048 = 70;
            }
        } else if (field1048 == 70) {
            if (Statics.field946.method3718()) {
                class238 var29 = Statics.field946;
                Statics.field3571 = var29;
                class238 var30 = Statics.field946;
                Statics.field3319 = var30;
                class238 var31 = Statics.field946;
                class238 var32 = Statics.field9;
                Statics.field3335 = var31;
                Statics.field3329 = var32;
                Statics.field3324 = Statics.field3335.method3739(3);
                class238 var33 = Statics.field946;
                class238 var34 = Statics.field9;
                boolean var35 = field919;
                Statics.field3412 = var33;
                Statics.field512 = var34;
                class256.field3429 = var35;
                class259.method647(Statics.field946, Statics.field9);
                class238 var36 = Statics.field946;
                Statics.field3371 = var36;
                class238 var37 = Statics.field946;
                class238 var38 = Statics.field9;
                boolean var39 = field996;
                class264 var40 = Statics.field294;
                Statics.field3253 = var37;
                Statics.field3467 = var38;
                Statics.field2239 = var39;
                Statics.field3468 = Statics.field3253.method3739(10);
                Statics.field524 = var40;
                class261.method1359(Statics.field946, Statics.field507, Statics.field1632);
                class238 var41 = Statics.field946;
                class238 var42 = Statics.field9;
                Statics.field3298 = var41;
                Statics.field3299 = var42;
                class251.method3372(Statics.field946);
                class238 var43 = Statics.field946;
                Statics.field3257 = var43;
                Statics.field2606 = Statics.field3257.method3739(16);
                class217.method687(Statics.field3569, Statics.field9, Statics.field3670, Statics.field745);
                class238 var44 = Statics.field946;
                Statics.field31 = var44;
                class254.method3495(Statics.field946);
                class238 var45 = Statics.field946;
                Statics.field3287 = var45;
                class238 var46 = Statics.field946;
                Statics.field3294 = var46;
                class252.method2603(Statics.field946);
                Statics.field1492 = new class98();
                class255.method144(Statics.field946, Statics.field3670, Statics.field745);
                class238 var47 = Statics.field946;
                class238 var48 = Statics.field3670;
                Statics.field3337 = var47;
                Statics.field3343 = var48;
                class243.method3077(Statics.field946, Statics.field3670);
                class93.field1416 = class226.field2849;
                class93.field1399 = 60;
                field1048 = 80;
            } else {
                class93.field1416 = class226.field2905 + Statics.field946.method3829() + "%";
                class93.field1399 = 60;
            }
        } else if (field1048 == 80) {
            int var49 = 0;
            if (Statics.field896 == null) {
                class238 var50 = Statics.field3670;
                int var51 = var50.method3730("compass");
                int var52 = var50.method3731(var51, "");
                class286 var53 = class287.method4240(var50, var51, var52);
                Statics.field896 = var53;
            } else {
                var49++;
            }
            if (Statics.field240 == null) {
                class238 var54 = Statics.field3670;
                int var55 = var54.method3730("mapedge");
                int var56 = var54.method3731(var55, "");
                class286 var57 = class287.method4240(var54, var55, var56);
                Statics.field240 = var57;
            } else {
                var49++;
            }
            if (Statics.field1520 == null) {
                Statics.field1520 = class287.method4440(Statics.field3670, "mapscene", "");
            } else {
                var49++;
            }
            if (Statics.field2293 == null) {
                Statics.field2293 = class287.method4441(Statics.field3670, "headicons_pk", "");
            } else {
                var49++;
            }
            if (Statics.field2406 == null) {
                Statics.field2406 = class287.method4441(Statics.field3670, "headicons_prayer", "");
            } else {
                var49++;
            }
            if (Statics.field1431 == null) {
                Statics.field1431 = class287.method4441(Statics.field3670, "headicons_hint", "");
            } else {
                var49++;
            }
            if (Statics.field389 == null) {
                Statics.field389 = class287.method4441(Statics.field3670, "mapmarker", "");
            } else {
                var49++;
            }
            if (Statics.field1320 == null) {
                Statics.field1320 = class287.method4441(Statics.field3670, "cross", "");
            } else {
                var49++;
            }
            if (Statics.field376 == null) {
                Statics.field376 = class287.method4441(Statics.field3670, "mapdots", "");
            } else {
                var49++;
            }
            if (Statics.field3180 == null) {
                Statics.field3180 = class287.method4440(Statics.field3670, "scrollbar", "");
            } else {
                var49++;
            }
            if (Statics.field2777 == null) {
                Statics.field2777 = class287.method4440(Statics.field3670, "mod_icons", "");
            } else {
                var49++;
            }
            if (var49 < 11) {
                class93.field1416 = class226.field3020 + var49 * 100 / 12 + "%";
                class93.field1399 = 70;
            } else {
                Statics.field3629 = Statics.field2777;
                Statics.field240.method4634();
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1520[0].method4597(var58 + var61, var59 + var61, var60 + var61);
                class93.field1416 = class226.field3052;
                class93.field1399 = 70;
                field1048 = 90;
            }
        } else if (field1048 == 90) {
            if (Statics.field377.method3718()) {
                class126 var62 = new class126(Statics.field377, Statics.field3670, 20, 0.8D, field919 ? 64 : 128);
                class137.method2353(var62);
                class137.method2344(0.8D);
                class93.field1416 = class226.field2865;
                class93.field1399 = 90;
                field1048 = 110;
            } else {
                class93.field1416 = class226.field2852 + Statics.field377.method3829() + "%";
                class93.field1399 = 90;
            }
        } else if (field1048 == 110) {
            Statics.field1039 = new class72();
            Statics.field699.method2645(Statics.field1039, 10);
            class93.field1416 = class226.field2854;
            class93.field1399 = 94;
            field1048 = 120;
        } else if (field1048 == 120) {
            if (Statics.field388.method3734("huffman", "")) {
                class166 var63 = new class166(Statics.field388.method3733("huffman", ""));
                Statics.field3643 = var63;
                class93.field1416 = class226.field2856;
                class93.field1399 = 96;
                field1048 = 130;
            } else {
                class93.field1416 = class226.field2855 + "%";
                class93.field1399 = 96;
            }
        } else if (field1048 == 130) {
            if (!Statics.field3569.method3718()) {
                class93.field1416 = class226.field2872 + Statics.field3569.method3829() * 4 / 5 + "%";
                class93.field1399 = 100;
            } else if (!Statics.field272.method3718()) {
                class93.field1416 = class226.field2872 + (80 + Statics.field272.method3829() / 6) + "%";
                class93.field1399 = 100;
            } else if (Statics.field745.method3718()) {
                class93.field1416 = class226.field3051;
                class93.field1399 = 98;
                field1048 = 140;
            } else {
                class93.field1416 = class226.field2872 + (96 + Statics.field745.method3829() / 50) + "%";
                class93.field1399 = 100;
            }
        } else if (field1048 == 140) {
            if (Statics.field1463.method3735(class41.field541.field550)) {
                if (Statics.field991 == null) {
                    Statics.field991 = new class289();
                    Statics.field991.method4761(Statics.field1463, Statics.field3286, field1003, Statics.field1520);
                }
                int var64 = Statics.field991.method4762();
                if (var64 < 100) {
                    class93.field1416 = class226.field2859 + (var64 * 9 / 10 + 10) + "%";
                } else {
                    class93.field1416 = class226.field2860;
                    class93.field1399 = 100;
                    field1048 = 150;
                }
            } else {
                class93.field1416 = class226.field2859 + Statics.field1463.method3737(class41.field541.field550) / 10 + "%";
            }
        } else if (field1048 == 150) {
            method2630(10);
        }
    }

    @ObfuscatedName("bj.et(IZZZI)Lix;")
    public static class238 method931(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class161 var4 = null;
        if (class156.field2212 != null) {
            var4 = new class161(arg0, class156.field2212, Statics.field2200[arg0], 1000000);
        }
        return new class238(var4, Statics.field1348, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.es(I)V")
    public final void method1012() {
        try {
            if (field948 == 0) {
                if (Statics.field273 != null) {
                    Statics.field273.method2684();
                    Statics.field273 = null;
                }
                Statics.field257 = null;
                field959 = false;
                field947 = 0;
                field948 = 1;
            }
            if (field948 == 1) {
                if (Statics.field257 == null) {
                    Statics.field257 = Statics.field699.method2639(Statics.field1521, Statics.field311);
                }
                if (Statics.field257.field2189 == 2) {
                    throw new IOException();
                }
                if (Statics.field257.field2189 == 1) {
                    Statics.field273 = new class160((Socket) Statics.field257.field2193, Statics.field699);
                    Statics.field257 = null;
                    field948 = 2;
                }
            }
            if (field948 == 2) {
                field958.field2357 = 0;
                field958.method2922(14);
                Statics.field273.method2689(field958.field2355, 0, 1);
                field1168.field2357 = 0;
                field948 = 3;
            }
            if (field948 == 3) {
                if (Statics.field1965 != null) {
                    Statics.field1965.method1818();
                }
                if (Statics.field867 != null) {
                    Statics.field867.method1818();
                }
                int var1 = Statics.field273.method2686();
                if (Statics.field1965 != null) {
                    Statics.field1965.method1818();
                }
                if (Statics.field867 != null) {
                    Statics.field867.method1818();
                }
                if (var1 != 0) {
                    method45(var1);
                    return;
                }
                field1168.field2357 = 0;
                field948 = 4;
            }
            if (field948 == 4) {
                if (field1168.field2357 < 8) {
                    int var2 = Statics.field273.method2687();
                    if (var2 > 8 - field1168.field2357) {
                        var2 = 8 - field1168.field2357;
                    }
                    if (var2 > 0) {
                        Statics.field273.method2688(field1168.field2355, field1168.field2357, var2);
                        field1168.field2357 += var2;
                    }
                }
                if (field1168.field2357 == 8) {
                    field1168.field2357 = 0;
                    Statics.field2216 = field1168.method2865();
                    field948 = 5;
                }
            }
            if (field948 == 5) {
                int[] var3 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field2216 >> 32), (int) (Statics.field2216 & 0xFFFFFFFFFFFFFFFFL) };
                field958.field2357 = 0;
                field958.method2922(1);
                field958.method2922(class93.field1423.method13());
                field958.method3024(var3[0]);
                field958.method3024(var3[1]);
                field958.method3024(var3[2]);
                field958.method3024(var3[3]);
                switch(class93.field1423.field2160) {
                    case 0:
                        field958.field2357 += 8;
                        break;
                    case 1:
                    case 2:
                        field958.method2847(Statics.field847);
                        field958.field2357 += 5;
                        break;
                    case 3:
                        field958.method3024((Integer) Statics.field479.field1303.get(Statics.method3916(class93.field1422)));
                        field958.field2357 += 4;
                }
                field958.method2851(class93.field1405);
                field958.method2880(class91.field1385, class91.field1384);
                field1133.field2357 = 0;
                if (field922 == 40) {
                    field1133.method2922(18);
                } else {
                    field1133.method2922(16);
                }
                field1133.method2846(0);
                int var4 = field1133.field2357;
                field1133.method3024(150);
                field1133.method2957(field958.field2355, 0, field958.field2357);
                int var5 = field1133.field2357;
                field1133.method2851(class93.field1422);
                field1133.method2922((field1119 ? 1 : 0) << 1 | (field919 ? 1 : 0));
                field1133.method2846(Statics.field584);
                field1133.method2846(Statics.field248);
                class180 var6 = field1133;
                if (field952 == null) {
                    byte[] var7 = new byte[24];
                    try {
                        class156.field2208.method2063(0L);
                        class156.field2208.method2071(var7);
                        int var8;
                        for (var8 = 0; var8 < 24 && var7[var8] == 0; var8++) {
                        }
                        if (var8 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var32) {
                        for (int var10 = 0; var10 < 24; var10++) {
                            var7[var10] = -1;
                        }
                    }
                    var6.method2957(var7, 0, var7.length);
                } else {
                    var6.method2957(field952, 0, field952.length);
                }
                field1133.method2851(Statics.field431);
                field1133.method3024(Statics.field324);
                class174 var13 = new class174(Statics.field2601.method4941());
                Statics.field2601.method4940(var13);
                field1133.method2957(var13.field2355, 0, var13.field2355.length);
                field1133.method2922(Statics.field942);
                field1133.method3024(0);
                field1133.method3024(Statics.field507.field3191);
                field1133.method3024(Statics.field1632.field3191);
                field1133.method3024(Statics.field946.field3191);
                field1133.method3024(Statics.field3569.field3191);
                field1133.method3024(Statics.field354.field3191);
                field1133.method3024(Statics.field2401.field3191);
                field1133.method3024(Statics.field232.field3191);
                field1133.method3024(Statics.field9.field3191);
                field1133.method3024(Statics.field3670.field3191);
                field1133.method3024(Statics.field377.field3191);
                field1133.method3024(Statics.field388.field3191);
                field1133.method3024(Statics.field2817.field3191);
                field1133.method3024(Statics.field272.field3191);
                field1133.method3024(Statics.field745.field3191);
                field1133.method3024(Statics.field1526.field3191);
                field1133.method3024(Statics.field1432.field3191);
                field1133.method3024(Statics.field1463.field3191);
                field1133.method2849(var3, var5, field1133.field2357);
                field1133.method2855(field1133.field2357 - var4);
                Statics.field273.method2689(field1133.field2355, 0, field1133.field2357);
                field958.method3095(var3);
                for (int var14 = 0; var14 < 4; var14++) {
                    var3[var14] += 50;
                }
                field1168.method3095(var3);
                field948 = 6;
            }
            if (field948 == 6 && Statics.field273.method2687() > 0) {
                int var15 = Statics.field273.method2686();
                if (var15 == 21 && field922 == 20) {
                    field948 = 7;
                } else if (var15 == 2) {
                    field948 = 9;
                } else if (var15 == 15 && field922 == 40) {
                    field926 = -1;
                    field948 = 13;
                } else if (var15 == 23 && field950 < 1) {
                    field950++;
                    field948 = 0;
                } else if (var15 == 29) {
                    field948 = 11;
                } else {
                    method45(var15);
                    return;
                }
            }
            if (field948 == 7 && Statics.field273.method2687() > 0) {
                field951 = (Statics.field273.method2686() + 3) * 60;
                field948 = 8;
            }
            if (field948 == 8) {
                field947 = 0;
                class93.method157(class226.field2966, class226.field3069, field951 / 60 + class226.field3048);
                if (--field951 <= 0) {
                    field948 = 0;
                }
            } else {
                if (field948 == 9 && Statics.field273.method2687() >= 13) {
                    boolean var16 = Statics.field273.method2686() == 1;
                    Statics.field273.method2688(field1168.field2355, 0, 4);
                    field1168.field2357 = 0;
                    boolean var17 = false;
                    if (var16) {
                        int var18 = field1168.method3097() << 24;
                        int var19 = var18 | field1168.method3097() << 16;
                        int var20 = var19 | field1168.method3097() << 8;
                        int var21 = var20 | field1168.method3097();
                        int var22 = Statics.method3916(class93.field1422);
                        if (Statics.field479.field1303.size() >= 10 && !Statics.field479.field1303.containsKey(var22)) {
                            Iterator var23 = Statics.field479.field1303.entrySet().iterator();
                            var23.next();
                            var23.remove();
                        }
                        Statics.field479.field1303.put(var22, var21);
                        class82.method43();
                    }
                    field1072 = Statics.field273.method2686();
                    field1074 = Statics.field273.method2686() == 1;
                    field1026 = Statics.field273.method2686();
                    field1026 <<= 0x8;
                    field1026 += Statics.field273.method2686();
                    field1027 = Statics.field273.method2686();
                    Statics.field273.method2688(field1168.field2355, 0, 1);
                    field1168.field2357 = 0;
                    field1002 = field1168.method3097();
                    Statics.field273.method2688(field1168.field2355, 0, 2);
                    field1168.field2357 = 0;
                    field926 = field1168.method2861();
                    try {
                        client var24 = Statics.field1353;
                        JSObject.getWindow(var24).call("zap", (Object[]) null);
                    } catch (Throwable var31) {
                    }
                    field948 = 10;
                }
                if (field948 != 10) {
                    if (field948 == 11 && Statics.field273.method2687() >= 2) {
                        field1168.field2357 = 0;
                        Statics.field273.method2688(field1168.field2355, 0, 2);
                        field1168.field2357 = 0;
                        Statics.field306 = field1168.method2861();
                        field948 = 12;
                    }
                    if (field948 == 12 && Statics.field273.method2687() >= Statics.field306) {
                        field1168.field2357 = 0;
                        Statics.field273.method2688(field1168.field2355, 0, Statics.field306);
                        field1168.field2357 = 0;
                        String var26 = field1168.method2867();
                        String var27 = field1168.method2867();
                        String var28 = field1168.method2867();
                        class93.method157(var26, var27, var28);
                        method2630(10);
                    }
                    if (field948 == 13) {
                        if (field926 == -1) {
                            if (Statics.field273.method2687() < 2) {
                                return;
                            }
                            Statics.field273.method2688(field1168.field2355, 0, 2);
                            field1168.field2357 = 0;
                            field926 = field1168.method2861();
                        }
                        if (Statics.field273.method2687() >= field926) {
                            Statics.field273.method2688(field1168.field2355, 0, field926);
                            field1168.field2357 = 0;
                            int var29 = field926;
                            method1002();
                            class97.method4595(field1168);
                            if (field1168.field2357 != var29) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field947++;
                        if (field947 > 2000) {
                            if (field950 < 1) {
                                if (Statics.field828 == Statics.field311) {
                                    Statics.field311 = Statics.field457;
                                } else {
                                    Statics.field311 = Statics.field828;
                                }
                                field950++;
                                field948 = 0;
                            } else {
                                method45(-3);
                            }
                        }
                    }
                } else if (Statics.field273.method2687() >= field926) {
                    field1168.field2357 = 0;
                    Statics.field273.method2688(field1168.field2355, 0, field926);
                    method4308();
                    class97.method4595(field1168);
                    Statics.field2405 = -1;
                    method2220(false);
                    field1002 = -1;
                }
            }
        } catch (IOException var33) {
            if (field950 < 1) {
                if (Statics.field828 == Statics.field311) {
                    Statics.field311 = Statics.field457;
                } else {
                    Statics.field311 = Statics.field828;
                }
                field950++;
                field948 = 0;
            } else {
                method45(-2);
            }
        }
    }

    @ObfuscatedName("jp.ea(I)V")
    public static void method4308() {
        field925 = 1L;
        field970 = -1;
        Statics.field1039.field851 = 0;
        Statics.field426 = true;
        field930 = true;
        field1129 = -1L;
        class281.method3701();
        field958.field2357 = 0;
        field1168.field2357 = 0;
        field1002 = -1;
        field965 = -1;
        field1060 = -1;
        field967 = -1;
        field963 = 0;
        field1071 = 0;
        field968 = 0;
        field993 = 0;
        field1176 = 0;
        field1043 = false;
        class60.method1447(0);
        class99.field1495.clear();
        class99.field1496.method3204();
        class99.field1494.method3362();
        class99.field1497 = 0;
        field1058 = 0;
        field1125 = false;
        field936 = 0;
        field1019 = 0;
        field1139 = 0;
        field1132 = -1;
        field1017 = 0;
        field1138 = 0;
        field941 = class92.field1394;
        field1162 = class92.field1394;
        field954 = 0;
        class97.method533();
        for (int var0 = 0; var0 < 2048; var0++) {
            field1070[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field1050[var1] = null;
        }
        field1034 = -1;
        field1037.method3289();
        field1038.method3289();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field1035[var2][var3][var4] = null;
                }
            }
        }
        field1177 = new class194();
        field1171 = 0;
        field1170 = 0;
        field1174 = 0;
        for (int var5 = 0; var5 < Statics.field2606; var5++) {
            class242 var6 = class242.method1566(var5);
            if (var6 != null) {
                class212.field2575[var5] = 0;
                class212.field2573[var5] = 0;
            }
        }
        Statics.field1492.method1605();
        field1073 = -1;
        if (field940 != -1) {
            class217.method1636(field940);
        }
        for (class69 var7 = (class69) field1066.method3241(); var7 != null; var7 = (class69) field1066.method3242()) {
            method930(var7, true);
        }
        field940 = -1;
        field1066 = new class191(8);
        field1069 = null;
        field1176 = 0;
        field1043 = false;
        field1081.method3597((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field1031[var8] = null;
            field1032[var8] = false;
        }
        class64.field775 = new class191(32);
        field923 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field1110[var9] = true;
        }
        method940();
        field1130 = null;
        Statics.field3260 = 0;
        Statics.field632 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field1179[var10] = new class17();
        }
        Statics.field3252 = null;
    }

    @ObfuscatedName("bt.eh(I)V")
    public static void method1002() {
        field958.field2357 = 0;
        field1168.field2357 = 0;
        field1002 = -1;
        field965 = -1;
        field1060 = -1;
        field967 = -1;
        field926 = 0;
        field963 = 0;
        field1071 = 0;
        field1176 = 0;
        field1043 = false;
        field1139 = 0;
        field1017 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1070[var0] = null;
        }
        Statics.field3110 = null;
        for (int var1 = 0; var1 < field1050.length; var1++) {
            class87 var2 = field1050[var1];
            if (var2 != null) {
                var2.field1236 = -1;
                var2.field1250 = false;
            }
        }
        class64.field775 = new class191(32);
        method2630(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field1110[var3] = true;
        }
        method940();
    }

    @ObfuscatedName("w.eq(IS)V")
    public static void method45(int arg0) {
        if (arg0 == -3) {
            class93.method157(class226.field2867, class226.field3075, class226.field3002);
        } else if (arg0 == -2) {
            class93.method157(class226.field2901, class226.field2871, class226.field2937);
        } else if (arg0 == -1) {
            class93.method157(class226.field2873, class226.field2955, class226.field2922);
        } else if (arg0 == 3) {
            class93.field1417 = 3;
        } else if (arg0 == 4) {
            class93.method157(class226.field3104, class226.field2877, class226.field2878);
        } else if (arg0 == 5) {
            class93.method157(class226.field2879, class226.field2921, class226.field2998);
        } else if (arg0 == 6) {
            class93.method157(class226.field2882, class226.field2883, class226.field2933);
        } else if (arg0 == 7) {
            class93.method157(class226.field2885, class226.field2886, class226.field3084);
        } else if (arg0 == 8) {
            class93.method157(class226.field2888, class226.field2889, class226.field2943);
        } else if (arg0 == 9) {
            class93.method157(class226.field2891, class226.field3046, class226.field2897);
        } else if (arg0 == 10) {
            class93.method157(class226.field2894, class226.field3103, class226.field2851);
        } else if (arg0 == 11) {
            class93.method157(class226.field2858, class226.field2898, class226.field2970);
        } else if (arg0 == 12) {
            class93.method157(class226.field2900, class226.field2848, class226.field2902);
        } else if (arg0 == 13) {
            class93.method157(class226.field2903, class226.field2927, class226.field2988);
        } else if (arg0 == 14) {
            class93.method157(class226.field2906, class226.field2995, class226.field2895);
        } else if (arg0 == 16) {
            class93.method157(class226.field2909, class226.field2910, class226.field3023);
        } else if (arg0 == 17) {
            class93.method157(class226.field2912, class226.field2913, class226.field2914);
        } else if (arg0 == 18) {
            class93.method157(class226.field2827, class226.field2916, class226.field2917);
        } else if (arg0 == 19) {
            class93.method157(class226.field2952, class226.field2919, class226.field2920);
        } else if (arg0 == 20) {
            class93.method157(class226.field2965, class226.field2850, class226.field2923);
        } else if (arg0 == 22) {
            class93.method157(class226.field2924, class226.field2925, class226.field2840);
        } else if (arg0 == 23) {
            class93.method157(class226.field2981, class226.field2928, class226.field2929);
        } else if (arg0 == 24) {
            class93.method157(class226.field2930, class226.field2874, class226.field2932);
        } else if (arg0 == 25) {
            class93.method157(class226.field2863, class226.field3105, class226.field2935);
        } else if (arg0 == 26) {
            class93.method157(class226.field2936, class226.field3033, class226.field2938);
        } else if (arg0 == 27) {
            class93.method157(class226.field2939, class226.field2940, class226.field2941);
        } else if (arg0 == 31) {
            class93.method157(class226.field2948, class226.field2949, class226.field2950);
        } else if (arg0 == 32) {
            class93.method157(class226.field2951, class226.field2853, class226.field2953);
        } else if (arg0 == 37) {
            class93.method157(class226.field2954, class226.field3064, class226.field3079);
        } else if (arg0 == 38) {
            class93.method157(class226.field2957, class226.field3056, class226.field2959);
        } else if (arg0 == 55) {
            class93.method157(class226.field2960, class226.field2961, class226.field2944);
        } else if (arg0 == 56) {
            class93.method157(class226.field2963, class226.field2964, class226.field3082);
            method2630(11);
            return;
        } else if (arg0 == 57) {
            class93.method157(class226.field2880, class226.field2967, class226.field2968);
            method2630(11);
            return;
        } else {
            class93.method157(class226.field2969, class226.field2896, class226.field2887);
        }
        method2630(10);
    }

    @ObfuscatedName("au.el(I)V")
    public static final void method603() {
        if (Statics.field273 != null) {
            Statics.field273.method2684();
            Statics.field273 = null;
        }
        method18();
        Statics.field315.method2424();
        for (int var0 = 0; var0 < 4; var0++) {
            field976[var0].method2715();
        }
        System.gc();
        class204.method1869(2);
        field1141 = -1;
        field1142 = false;
        for (class83 var1 = (class83) class83.field1312.method3296(); var1 != null; var1 = (class83) class83.field1312.method3298()) {
            if (var1.field1309 != null) {
                Statics.field5.method1674(var1.field1309);
                var1.field1309 = null;
            }
            if (var1.field1317 != null) {
                Statics.field5.method1674(var1.field1317);
                var1.field1317 = null;
            }
        }
        class83.field1312.method3289();
        method2630(10);
        try {
            client var2 = Statics.field1353;
            JSObject.getWindow(var2).call("loggedout", (Object[]) null);
        } catch (Throwable var4) {
        }
    }

    @ObfuscatedName("m.ez(I)V")
    public static final void method18() {
        class260.method1366();
        class247.method2422();
        class248.method1533();
        class256.field3413.method3223();
        class256.field3444.method3223();
        class256.field3415.method3223();
        class256.field3414.method3223();
        class259.method171();
        class257.method2824();
        class261.method942();
        class246.method3692();
        class251.field3355.method3223();
        class242.field3259.method3223();
        class255.method2760();
        class249.method3074();
        class253.field3369.method3223();
        class252.field3365.method3223();
        class243.field3264.method3223();
        class214.method691();
        class217.field2612.method3223();
        class217.field2613.method3223();
        class217.field2710.method3223();
        class217.field2615.method3223();
        ((class126) Statics.field1995).method2132();
        class100.field1507.method3223();
        Statics.field507.method3728();
        Statics.field1632.method3728();
        Statics.field3569.method3728();
        Statics.field354.method3728();
        Statics.field2401.method3728();
        Statics.field232.method3728();
        Statics.field9.method3728();
        Statics.field3670.method3728();
        Statics.field377.method3728();
        Statics.field388.method3728();
        Statics.field2817.method3728();
        Statics.field272.method3728();
    }

    @ObfuscatedName("client.eu(B)V")
    public final void method1013() {
        if (field1071 > 1) {
            field1071--;
        }
        if (field968 > 0) {
            field968--;
        }
        if (field959) {
            field959 = false;
            if (field968 > 0) {
                method603();
            } else {
                method2630(40);
                Statics.field681 = Statics.field273;
                Statics.field273 = null;
            }
            return;
        }
        if (!field1043) {
            method608();
        }
        for (int var1 = 0; var1 < 100 && this.method1016(); var1++) {
        }
        if (field922 != 30) {
            return;
        }
        while (class281.method3136()) {
            field958.method3096(203);
            field958.method2922(0);
            int var2 = field958.field2357;
            class281.method3676(field958);
            field958.method3010(field958.field2357 - var2);
        }
        Object var3 = Statics.field1039.field850;
        synchronized (Statics.field1039.field850) {
            if (!field1061) {
                Statics.field1039.field851 = 0;
            } else if (class60.field730 != 0 || Statics.field1039.field851 >= 40) {
                field958.method3096(44);
                field958.method2922(0);
                int var4 = field958.field2357;
                int var5 = 0;
                for (int var6 = 0; var6 < Statics.field1039.field851 && field958.field2357 - var4 < 240; var6++) {
                    var5++;
                    int var7 = Statics.field1039.field853[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 502) {
                        var7 = 502;
                    }
                    int var8 = Statics.field1039.field854[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 764) {
                        var8 = 764;
                    }
                    int var9 = var7 * 765 + var8;
                    if (Statics.field1039.field853[var6] == -1 && Statics.field1039.field854[var6] == -1) {
                        var8 = -1;
                        var7 = -1;
                        var9 = 524287;
                    }
                    if (field927 != var8 || field928 != var7) {
                        int var10 = var8 - field927;
                        field927 = var8;
                        int var11 = var7 - field928;
                        field928 = var7;
                        if (field970 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            field958.method2846((field970 << 12) + (var10 << 6) + var11);
                            field970 = 0;
                        } else if (field970 < 8) {
                            field958.method2847((field970 << 19) + 8388608 + var9);
                            field970 = 0;
                        } else {
                            field958.method3024((field970 << 19) + -1073741824 + var9);
                            field970 = 0;
                        }
                    } else if (field970 < 2047) {
                        field970++;
                    }
                }
                field958.method3010(field958.field2357 - var4);
                if (var5 >= Statics.field1039.field851) {
                    Statics.field1039.field851 = 0;
                } else {
                    Statics.field1039.field851 -= var5;
                    for (int var12 = 0; var12 < Statics.field1039.field851; var12++) {
                        Statics.field1039.field854[var12] = Statics.field1039.field854[var5 + var12];
                        Statics.field1039.field853[var12] = Statics.field1039.field853[var5 + var12];
                    }
                }
            }
        }
        if (class60.field730 == 1 || !Statics.field700 && class60.field730 == 4 || class60.field730 == 2) {
            long var14 = (class60.field723 - field925 * -1L) / 50L;
            if (var14 > 4095L) {
                var14 = 4095L;
            }
            field925 = class60.field723 * -1L;
            int var16 = class60.field724;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > Statics.field248) {
                var16 = Statics.field248;
            }
            int var17 = class60.field738;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > Statics.field584) {
                var17 = Statics.field584;
            }
            int var18 = (int) var14;
            field958.method3096(178);
            field958.method2846((var18 << 1) + (class60.field730 == 2 ? 1 : 0));
            field958.method2846(var17);
            field958.method2846(var16);
        }
        if (class51.field628 > 0) {
            field958.method3096(88);
            field958.method2846(0);
            int var19 = field958.field2357;
            long var20 = class176.method2679();
            for (int var22 = 0; var22 < class51.field628; var22++) {
                long var23 = var20 - field1129;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field1129 = var20;
                field958.method2981(class51.field643[var22]);
                field958.method2899((int) var23);
            }
            field958.method2855(field958.field2357 - var19);
        }
        if (field995 > 0) {
            field995--;
        }
        if (class51.field637[96] || class51.field637[97] || class51.field637[98] || class51.field637[99]) {
            field1147 = true;
        }
        if (field1147 && field995 <= 0) {
            field995 = 20;
            field1147 = false;
            field958.method3096(229);
            field958.method2892(field1019);
            field958.method2893(field988);
        }
        if (Statics.field426 && !field930) {
            field930 = true;
            field958.method3096(116);
            field958.method2922(1);
        }
        if (!Statics.field426 && field930) {
            field930 = false;
            field958.method3096(116);
            field958.method2922(0);
        }
        if (Statics.field251 != field1132) {
            field1132 = Statics.field251;
            method3389(Statics.field251);
        }
        if (field922 != 30) {
            return;
        }
        for (class77 var25 = (class77) field1177.method3296(); var25 != null; var25 = (class77) field1177.method3298()) {
            if (var25.field1194 > 0) {
                var25.field1194--;
            }
            if (var25.field1194 != 0) {
                if (var25.field1195 > 0) {
                    var25.field1195--;
                }
                if (var25.field1195 == 0 && var25.field1187 >= 1 && var25.field1188 >= 1 && var25.field1187 <= 102 && var25.field1188 <= 102 && (var25.field1192 < 0 || class62.method237(var25.field1192, var25.field1189))) {
                    method229(var25.field1185, var25.field1186, var25.field1187, var25.field1188, var25.field1192, var25.field1193, var25.field1189);
                    var25.field1195 = -1;
                    if (var25.field1197 == var25.field1192 && var25.field1197 == -1) {
                        var25.method3287();
                    } else if (var25.field1197 == var25.field1192 && var25.field1193 == var25.field1190 && var25.field1191 == var25.field1189) {
                        var25.method3287();
                    }
                }
            } else if (var25.field1197 < 0 || class62.method237(var25.field1197, var25.field1191)) {
                method229(var25.field1185, var25.field1186, var25.field1187, var25.field1188, var25.field1197, var25.field1190, var25.field1191);
                var25.method3287();
            }
        }
        method1003();
        field963++;
        if (field963 <= 750) {
            int var26 = class97.field1470;
            int[] var27 = class97.field1471;
            for (int var28 = 0; var28 < var26; var28++) {
                class75 var29 = field1070[var27[var28]];
                if (var29 != null) {
                    method1437(var29, 1);
                }
            }
            method661();
            method1599();
            field1067++;
            if (field953 != 0) {
                field1014 += 20;
                if (field1014 >= 400) {
                    field953 = 0;
                }
            }
            if (Statics.field263 != null) {
                field1076++;
                if (field1076 >= 15) {
                    method148(Statics.field263);
                    Statics.field263 = null;
                }
            }
            class217 var30 = Statics.field15;
            class217 var31 = Statics.field617;
            Statics.field15 = null;
            Statics.field617 = null;
            field924 = null;
            field1086 = false;
            field1083 = false;
            field1126 = 0;
            while (class51.method455() && field1126 < 128) {
                if (field1072 >= 2 && class51.field637[82] && Statics.field2772 == 66) {
                    String var32 = class99.method2090();
                    Statics.field1353.method719(var32);
                } else {
                    field1121[field1126] = Statics.field2772;
                    field1127[field1126] = Statics.field3119;
                    field1126++;
                }
            }
            if (field940 != -1) {
                method230(field940, 0, 0, Statics.field584, Statics.field248, 0, 0);
            }
            field1090++;
            while (true) {
                class70 var33;
                class217 var34;
                class217 var35;
                do {
                    var33 = (class70) field1105.method3291();
                    if (var33 == null) {
                        while (true) {
                            class70 var36;
                            class217 var37;
                            class217 var38;
                            do {
                                var36 = (class70) field1106.method3291();
                                if (var36 == null) {
                                    while (true) {
                                        class70 var39;
                                        class217 var40;
                                        class217 var41;
                                        do {
                                            var39 = (class70) field1104.method3291();
                                            if (var39 == null) {
                                                this.method1017();
                                                if (Statics.field991 != null) {
                                                    Statics.field991.method4913(Statics.field251, (Statics.field3110.field1211 >> 7) + Statics.field329, (Statics.field3110.field1219 >> 7) + Statics.field2282, false);
                                                    Statics.field991.method4809();
                                                }
                                                if (field1078 != null) {
                                                    this.method1021();
                                                }
                                                if (Statics.field282 != null) {
                                                    method148(Statics.field282);
                                                    field1023++;
                                                    if (class60.field734 == 0) {
                                                        if (field1102) {
                                                            if (Statics.field282 == Statics.field2371 && field989 != field1021) {
                                                                class217 var42 = Statics.field282;
                                                                byte var43 = 0;
                                                                if (field1068 == 1 && var42.field2622 == 206) {
                                                                    var43 = 1;
                                                                }
                                                                if (var42.field2736[field1021] <= 0) {
                                                                    var43 = 0;
                                                                }
                                                                if (class218.method91(method887(var42))) {
                                                                    int var44 = field989;
                                                                    int var45 = field1021;
                                                                    var42.field2736[var45] = var42.field2736[var44];
                                                                    var42.field2737[var45] = var42.field2737[var44];
                                                                    var42.field2736[var44] = -1;
                                                                    var42.field2737[var44] = 0;
                                                                } else if (var43 == 1) {
                                                                    int var46 = field989;
                                                                    int var47 = field1021;
                                                                    while (var46 != var47) {
                                                                        if (var46 > var47) {
                                                                            var42.method3636(var46 - 1, var46);
                                                                            var46--;
                                                                        } else if (var46 < var47) {
                                                                            var42.method3636(var46 + 1, var46);
                                                                            var46++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var42.method3636(field1021, field989);
                                                                }
                                                                field958.method3096(52);
                                                                field958.method2963(Statics.field282.field2683);
                                                                field958.method2885(var43);
                                                                field958.method2891(field1021);
                                                                field958.method2893(field989);
                                                            }
                                                        } else if (this.method1260()) {
                                                            this.method1019(field1144, field1020);
                                                        } else if (field1176 > 0) {
                                                            method524(field1144, field1020);
                                                        }
                                                        field1076 = 10;
                                                        class60.field730 = 0;
                                                        Statics.field282 = null;
                                                    } else if (field1023 >= 5 && (class60.field731 > field1144 + 5 || class60.field731 < field1144 - 5 || class60.field732 > field1020 + 5 || class60.field732 < field1020 - 5)) {
                                                        field1102 = true;
                                                    }
                                                }
                                                if (class140.method2463()) {
                                                    int var48 = class140.field2049;
                                                    int var49 = class140.field2043;
                                                    field958.method3096(54);
                                                    field958.method2922(5);
                                                    field958.method2846(Statics.field329 + var48);
                                                    field958.method2892(Statics.field2282 + var49);
                                                    field958.method2981(class51.field637[82] ? (class51.field637[81] ? 2 : 1) : 0);
                                                    class140.method2524();
                                                    field1012 = class60.field738;
                                                    field1013 = class60.field724;
                                                    field953 = 1;
                                                    field1014 = 0;
                                                    field1017 = var48;
                                                    field1138 = var49;
                                                }
                                                if (Statics.field15 != var30) {
                                                    if (var30 != null) {
                                                        method148(var30);
                                                    }
                                                    if (Statics.field15 != null) {
                                                        method148(Statics.field15);
                                                    }
                                                }
                                                if (Statics.field617 != var31 && field918 == field1122) {
                                                    if (var31 != null) {
                                                        method148(var31);
                                                    }
                                                    if (Statics.field617 != null) {
                                                        method148(Statics.field617);
                                                    }
                                                }
                                                if (Statics.field617 == null) {
                                                    if (field918 > 0) {
                                                        field918--;
                                                    }
                                                } else if (field918 < field1122) {
                                                    field918++;
                                                    if (field918 == field1122) {
                                                        method148(Statics.field617);
                                                    }
                                                }
                                                int var50 = Statics.field3110.field1211;
                                                int var51 = Statics.field3110.field1219;
                                                if (Statics.field3169 - var50 < -500 || Statics.field3169 - var50 > 500 || Statics.field2214 - var51 < -500 || Statics.field2214 - var51 > 500) {
                                                    Statics.field3169 = var50;
                                                    Statics.field2214 = var51;
                                                }
                                                if (Statics.field3169 != var50) {
                                                    Statics.field3169 += (var50 - Statics.field3169) / 16;
                                                }
                                                if (Statics.field2214 != var51) {
                                                    Statics.field2214 += (var51 - Statics.field2214) / 16;
                                                }
                                                if (class60.field734 == 4 && Statics.field700) {
                                                    int var52 = class60.field732 - field1079;
                                                    field1016 = var52 * 2;
                                                    field1079 = var52 == -1 || var52 == 1 ? class60.field732 : (field1079 + class60.field732) / 2;
                                                    int var53 = field992 - class60.field731;
                                                    field990 = var53 * 2;
                                                    field992 = var53 == -1 || var53 == 1 ? class60.field731 : (field992 + class60.field731) / 2;
                                                } else {
                                                    if (class51.field637[96]) {
                                                        field990 += (-24 - field990) / 2;
                                                    } else if (class51.field637[97]) {
                                                        field990 += (24 - field990) / 2;
                                                    } else {
                                                        field990 /= 2;
                                                    }
                                                    if (class51.field637[98]) {
                                                        field1016 += (12 - field1016) / 2;
                                                    } else if (class51.field637[99]) {
                                                        field1016 += (-12 - field1016) / 2;
                                                    } else {
                                                        field1016 /= 2;
                                                    }
                                                    field1079 = class60.field732;
                                                    field992 = class60.field731;
                                                }
                                                field1019 = field990 / 2 + field1019 & 0x7FF;
                                                field988 += field1016 / 2;
                                                if (field988 < 128) {
                                                    field988 = 128;
                                                }
                                                if (field988 > 383) {
                                                    field988 = 383;
                                                }
                                                int var54 = Statics.field3169 >> 7;
                                                int var55 = Statics.field2214 >> 7;
                                                int var56 = method161(Statics.field3169, Statics.field2214, Statics.field251);
                                                int var57 = 0;
                                                if (var54 > 3 && var55 > 3 && var54 < 100 && var55 < 100) {
                                                    for (int var58 = var54 - 4; var58 <= var54 + 4; var58++) {
                                                        for (int var59 = var55 - 4; var59 <= var55 + 4; var59++) {
                                                            int var60 = Statics.field251;
                                                            if (var60 < 3 && (class62.field752[1][var58][var59] & 0x2) == 2) {
                                                                var60++;
                                                            }
                                                            int var61 = var56 - class62.field763[var60][var58][var59];
                                                            if (var61 > var57) {
                                                                var57 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var62 = var57 * 192;
                                                if (var62 > 98048) {
                                                    var62 = 98048;
                                                }
                                                if (var62 < 32768) {
                                                    var62 = 32768;
                                                }
                                                if (var62 > field997) {
                                                    field997 += (var62 - field997) / 24;
                                                } else if (var62 < field997) {
                                                    field997 += (var62 - field997) / 80;
                                                }
                                                if (field1009) {
                                                    method130();
                                                }
                                                for (int var63 = 0; var63 < 5; var63++) {
                                                    int var10002 = field1156[var63]++;
                                                }
                                                Statics.field1492.method1603();
                                                int var64 = ++class60.field726 - 1;
                                                int var66 = class51.method1657();
                                                if (var64 > 15000 && var66 > 15000) {
                                                    field968 = 250;
                                                    class60.method1447(14500);
                                                    field958.method3096(157);
                                                }
                                                for (class68 var67 = (class68) field1173.method3325(); var67 != null; var67 = (class68) field1173.method3326()) {
                                                    if ((long) var67.field820 < class176.method2679() / 1000L - 5L) {
                                                        if (var67.field816 > 0) {
                                                            class99.method1574(5, "", var67.field814 + class226.field2972);
                                                        }
                                                        if (var67.field816 == 0) {
                                                            class99.method1574(5, "", var67.field814 + class226.field2973);
                                                        }
                                                        var67.method3337();
                                                    }
                                                }
                                                field964++;
                                                if (field964 > 50) {
                                                    field958.method3096(251);
                                                }
                                                try {
                                                    if (Statics.field273 != null && field958.field2357 > 0) {
                                                        Statics.field273.method2689(field958.field2355, 0, field958.field2357);
                                                        field958.field2357 = 0;
                                                        field964 = 0;
                                                    }
                                                } catch (IOException var69) {
                                                    if (field968 > 0) {
                                                        method603();
                                                    } else {
                                                        method2630(40);
                                                        Statics.field681 = Statics.field273;
                                                        Statics.field273 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var40 = var39.field830;
                                            if (var40.field2619 < 0) {
                                                break;
                                            }
                                            var41 = class217.method3861(var40.field2637);
                                        } while (var41 == null || var41.field2742 == null || var40.field2619 >= var41.field2742.length || var41.field2742[var40.field2619] != var40);
                                        class84.method963(var39);
                                    }
                                }
                                var37 = var36.field830;
                                if (var37.field2619 < 0) {
                                    break;
                                }
                                var38 = class217.method3861(var37.field2637);
                            } while (var38 == null || var38.field2742 == null || var37.field2619 >= var38.field2742.length || var38.field2742[var37.field2619] != var37);
                            class84.method963(var36);
                        }
                    }
                    var34 = var33.field830;
                    if (var34.field2619 < 0) {
                        break;
                    }
                    var35 = class217.method3861(var34.field2637);
                } while (var35 == null || var35.field2742 == null || var34.field2619 >= var35.field2742.length || var35.field2742[var34.field2619] != var34);
                class84.method963(var33);
            }
        } else if (field968 > 0) {
            method603();
        } else {
            method2630(40);
            Statics.field681 = Statics.field273;
            Statics.field273 = null;
        }
    }

    @ObfuscatedName("ex.eb(B)V")
    public static final void method2598() {
        if (Statics.field867 != null) {
            Statics.field867.method1802();
        }
        if (Statics.field1965 != null) {
            Statics.field1965.method1802();
        }
    }

    @ObfuscatedName("bf.ep(I)V")
    public static final void method1003() {
        for (int var0 = 0; var0 < field936; var0++) {
            int var10002 = field1011[var0]--;
            if (field1011[var0] >= -10) {
                class106 var2 = field1150[var0];
                if (var2 == null) {
                    class106 var10000 = (class106) null;
                    var2 = class106.method1735(Statics.field354, field1082[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field1011[var0] += var2.method1736();
                    field1150[var0] = var2;
                }
                if (field1011[var0] < 0) {
                    int var9;
                    if (field1149[var0] == 0) {
                        var9 = field1137;
                    } else {
                        int var3 = (field1149[var0] & 0xFF) * 128;
                        int var4 = field1149[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field3110.field1211;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field1149[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field3110.field1219;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field1011[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field1036 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class108 var10 = var2.method1728().method1774(Statics.field238);
                        class118 var11 = class118.method1892(var10, 100, var9);
                        var11.method1895(field1152[var0] - 1);
                        Statics.field5.method1673(var11);
                    }
                    field1011[var0] = -100;
                }
            } else {
                field936--;
                for (int var1 = var0; var1 < field936; var1++) {
                    field1082[var1] = field1082[var1 + 1];
                    field1150[var1] = field1150[var1 + 1];
                    field1152[var1] = field1152[var1 + 1];
                    field1011[var1] = field1011[var1 + 1];
                    field1149[var1] = field1149[var1 + 1];
                }
                var0--;
            }
        }
        if (field1142 && !class204.method3581()) {
            if (field1140 != 0 && field1141 != -1) {
                class204.method128(Statics.field232, field1141, 0, field1140, false);
            }
            field1142 = false;
        }
    }

    @ObfuscatedName("at.ef(Ljc;IIII)V")
    public static void method460(class261 arg0, int arg1, int arg2, int arg3) {
        if (field936 >= 50 || field1036 == 0 || arg0.field3587 == null || arg1 >= arg0.field3587.length) {
            return;
        }
        int var4 = arg0.field3587[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1082[field936] = var5;
        field1152[field936] = var6;
        field1011[field936] = 0;
        field1150[field936] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1149[field936] = (var8 << 16) + (var9 << 8) + var7;
        field936++;
    }

    @ObfuscatedName("et.er(IIII)V")
    public static void method2606(int arg0, int arg1, int arg2) {
        if (field1137 == 0 || arg1 == 0 || field936 >= 50) {
            return;
        }
        field1082[field936] = arg0;
        field1152[field936] = arg1;
        field1011[field936] = arg2;
        field1150[field936] = null;
        field1149[field936] = 0;
        field936++;
    }

    @ObfuscatedName("ap.ew(II)V")
    public static void method199(int arg0) {
        if (arg0 == -1 && !field1142) {
            class204.method1347();
        } else if (arg0 != -1 && field1141 != arg0 && field1140 != 0 && !field1142) {
            class204.method2326(2, Statics.field232, arg0, 0, field1140, false);
        }
        field1141 = arg0;
    }

    @ObfuscatedName("o.ey(III)V")
    public static void method4(int arg0, int arg1) {
        if (field1140 != 0 && arg0 != -1) {
            class204.method128(Statics.field2817, arg0, 0, field1140, false);
            field1142 = true;
        }
    }

    @ObfuscatedName("bo.fr(Lho;IIS)V")
    public static final void method843(class217 arg0, int arg1, int arg2) {
        if (field1139 != 0 && field1139 != 3 || class60.field730 != 1 && Statics.field700 || class60.field730 != 4) {
            return;
        }
        class211 var3 = arg0.method3641(true);
        if (var3 == null) {
            return;
        }
        int var4 = class60.field738 - arg1;
        int var5 = class60.field724 - arg2;
        if (!var3.method3576(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2570 / 2;
        int var7 = var5 - var3.field2567 / 2;
        int var8 = field1019 & 0x7FF;
        int var9 = class137.field1983[var8];
        int var10 = class137.field1973[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field3110.field1211 + var11 >> 7;
        int var14 = Statics.field3110.field1219 - var12 >> 7;
        field958.method3096(108);
        field958.method2922(18);
        field958.method2846(Statics.field329 + var13);
        field958.method2892(Statics.field2282 + var14);
        field958.method2981(class51.field637[82] ? (class51.field637[81] ? 2 : 1) : 0);
        field958.method2922(var6);
        field958.method2922(var7);
        field958.method2846(field1019);
        field958.method2922(57);
        field958.method2922(0);
        field958.method2922(0);
        field958.method2922(89);
        field958.method2846(Statics.field3110.field1211);
        field958.method2846(Statics.field3110.field1219);
        field958.method2922(63);
        field1017 = var13;
        field1138 = var14;
    }

    @ObfuscatedName("cs.fg(I)V")
    public static final void method1599() {
        int[] var0 = class97.field1471;
        for (int var1 = 0; var1 < class97.field1470; var1++) {
            class75 var2 = field1070[var0[var1]];
            if (var2 != null && var2.field1226 > 0) {
                var2.field1226--;
                if (var2.field1226 == 0) {
                    var2.field1223 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field954; var3++) {
            int var4 = field955[var3];
            class87 var5 = field1050[var4];
            if (var5 != null && var5.field1226 > 0) {
                var5.field1226--;
                if (var5.field1226 == 0) {
                    var5.field1223 = null;
                }
            }
        }
    }

    @ObfuscatedName("l.fm(I)V")
    public static final void method130() {
        int var0 = Statics.field903 * 128 + 64;
        int var1 = Statics.field551 * 128 + 64;
        int var2 = method161(var0, var1, Statics.field251) - Statics.field449;
        if (Statics.field871 < var0) {
            Statics.field871 += Statics.field799 * (var0 - Statics.field871) / 1000 + Statics.field2137;
            if (Statics.field871 > var0) {
                Statics.field871 = var0;
            }
        }
        if (Statics.field871 > var0) {
            Statics.field871 -= Statics.field799 * (Statics.field871 - var0) / 1000 + Statics.field2137;
            if (Statics.field871 < var0) {
                Statics.field871 = var0;
            }
        }
        if (Statics.field826 < var2) {
            Statics.field826 += Statics.field799 * (var2 - Statics.field826) / 1000 + Statics.field2137;
            if (Statics.field826 > var2) {
                Statics.field826 = var2;
            }
        }
        if (Statics.field826 > var2) {
            Statics.field826 -= Statics.field799 * (Statics.field826 - var2) / 1000 + Statics.field2137;
            if (Statics.field826 < var2) {
                Statics.field826 = var2;
            }
        }
        if (Statics.field987 < var1) {
            Statics.field987 += Statics.field799 * (var1 - Statics.field987) / 1000 + Statics.field2137;
            if (Statics.field987 > var1) {
                Statics.field987 = var1;
            }
        }
        if (Statics.field987 > var1) {
            Statics.field987 -= Statics.field799 * (Statics.field987 - var1) / 1000 + Statics.field2137;
            if (Statics.field987 < var1) {
                Statics.field987 = var1;
            }
        }
        int var3 = Statics.field259 * 128 + 64;
        int var4 = Statics.field1482 * 128 + 64;
        int var5 = method161(var3, var4, Statics.field251) - Statics.field2381;
        int var6 = var3 - Statics.field871;
        int var7 = var5 - Statics.field826;
        int var8 = var4 - Statics.field987;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field252 < var10) {
            Statics.field252 += Statics.field334 * (var10 - Statics.field252) / 1000 + Statics.field3660;
            if (Statics.field252 > var10) {
                Statics.field252 = var10;
            }
        }
        if (Statics.field252 > var10) {
            Statics.field252 -= Statics.field334 * (Statics.field252 - var10) / 1000 + Statics.field3660;
            if (Statics.field252 < var10) {
                Statics.field252 = var10;
            }
        }
        int var12 = var11 - Statics.field3209;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field3209 += Statics.field334 * var12 / 1000 + Statics.field3660;
            Statics.field3209 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field3209 -= Statics.field334 * -var12 / 1000 + Statics.field3660;
            Statics.field3209 &= 0x7FF;
        }
        int var13 = var11 - Statics.field3209;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field3209 = var11;
        }
    }

    @ObfuscatedName("bu.fb(I)V")
    public static final void method661() {
        for (int var0 = 0; var0 < field954; var0++) {
            int var1 = field955[var0];
            class87 var2 = field1050[var1];
            if (var2 != null) {
                method1437(var2, var2.field1359.field3533);
            }
        }
    }

    @ObfuscatedName("cy.fz(Lcm;IB)V")
    public static final void method1437(class79 arg0, int arg1) {
        if (arg0.field1256 > field929) {
            int var2 = arg0.field1256 - field929;
            int var3 = arg0.field1237 * 128 + arg0.field1214 * 64;
            int var4 = arg0.field1254 * 128 + arg0.field1214 * 64;
            arg0.field1211 += (var3 - arg0.field1211) / var2;
            arg0.field1219 += (var4 - arg0.field1219) / var2;
            arg0.field1268 = 0;
            arg0.field1257 = arg0.field1258;
        } else if (arg0.field1269 >= field929) {
            method4309(arg0);
        } else {
            arg0.field1239 = arg0.field1253;
            if (arg0.field1252 == 0) {
                arg0.field1268 = 0;
            } else {
                label213: {
                    if (arg0.field1242 != -1 && arg0.field1232 == 0) {
                        class261 var5 = Statics.method240(arg0.field1242);
                        if (arg0.field1220 > 0 && var5.field3595 == 0) {
                            arg0.field1268++;
                            break label213;
                        }
                        if (arg0.field1220 <= 0 && var5.field3596 == 0) {
                            arg0.field1268++;
                            break label213;
                        }
                    }
                    int var6 = arg0.field1211;
                    int var7 = arg0.field1219;
                    int var8 = arg0.field1210[arg0.field1252 - 1] * 128 + arg0.field1214 * 64;
                    int var9 = arg0.field1264[arg0.field1252 - 1] * 128 + arg0.field1214 * 64;
                    if (var6 < var8) {
                        if (var7 < var9) {
                            arg0.field1257 = 1280;
                        } else if (var7 > var9) {
                            arg0.field1257 = 1792;
                        } else {
                            arg0.field1257 = 1536;
                        }
                    } else if (var6 > var8) {
                        if (var7 < var9) {
                            arg0.field1257 = 768;
                        } else if (var7 > var9) {
                            arg0.field1257 = 256;
                        } else {
                            arg0.field1257 = 512;
                        }
                    } else if (var7 < var9) {
                        arg0.field1257 = 1024;
                    } else if (var7 > var9) {
                        arg0.field1257 = 0;
                    }
                    byte var10 = arg0.field1267[arg0.field1252 - 1];
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        int var11 = arg0.field1257 - arg0.field1212 & 0x7FF;
                        if (var11 > 1024) {
                            var11 -= 2048;
                        }
                        int var12 = arg0.field1265;
                        if (var11 >= -256 && var11 <= 256) {
                            var12 = arg0.field1218;
                        } else if (var11 >= 256 && var11 < 768) {
                            var12 = arg0.field1221;
                        } else if (var11 >= -768 && var11 <= -256) {
                            var12 = arg0.field1245;
                        }
                        if (var12 == -1) {
                            var12 = arg0.field1218;
                        }
                        arg0.field1239 = var12;
                        int var13 = 4;
                        boolean var14 = true;
                        if (arg0 instanceof class87) {
                            var14 = ((class87) arg0).field1359.field3561;
                        }
                        if (var14) {
                            if (arg0.field1257 != arg0.field1212 && arg0.field1236 == -1 && arg0.field1233 != 0) {
                                var13 = 2;
                            }
                            if (arg0.field1252 > 2) {
                                var13 = 6;
                            }
                            if (arg0.field1252 > 3) {
                                var13 = 8;
                            }
                            if (arg0.field1268 > 0 && arg0.field1252 > 1) {
                                var13 = 8;
                                arg0.field1268--;
                            }
                        } else {
                            if (arg0.field1252 > 1) {
                                var13 = 6;
                            }
                            if (arg0.field1252 > 2) {
                                var13 = 8;
                            }
                            if (arg0.field1268 > 0 && arg0.field1252 > 1) {
                                var13 = 8;
                                arg0.field1268--;
                            }
                        }
                        if (var10 == 2) {
                            var13 <<= 0x1;
                        }
                        if (var13 >= 8 && arg0.field1239 == arg0.field1218 && arg0.field1222 != -1) {
                            arg0.field1239 = arg0.field1222;
                        }
                        if (var6 != var8 || var7 != var9) {
                            if (var6 < var8) {
                                arg0.field1211 += var13;
                                if (arg0.field1211 > var8) {
                                    arg0.field1211 = var8;
                                }
                            } else if (var6 > var8) {
                                arg0.field1211 -= var13;
                                if (arg0.field1211 < var8) {
                                    arg0.field1211 = var8;
                                }
                            }
                            if (var7 < var9) {
                                arg0.field1219 += var13;
                                if (arg0.field1219 > var9) {
                                    arg0.field1219 = var9;
                                }
                            } else if (var7 > var9) {
                                arg0.field1219 -= var13;
                                if (arg0.field1219 < var9) {
                                    arg0.field1219 = var9;
                                }
                            }
                        }
                        if (arg0.field1211 == var8 && arg0.field1219 == var9) {
                            arg0.field1252--;
                            if (arg0.field1220 > 0) {
                                arg0.field1220--;
                            }
                        }
                    } else {
                        arg0.field1211 = var8;
                        arg0.field1219 = var9;
                        arg0.field1252--;
                        if (arg0.field1220 > 0) {
                            arg0.field1220--;
                        }
                    }
                }
            }
        }
        if (arg0.field1211 < 128 || arg0.field1219 < 128 || arg0.field1211 >= 13184 || arg0.field1219 >= 13184) {
            arg0.field1242 = -1;
            arg0.field1247 = -1;
            arg0.field1256 = 0;
            arg0.field1269 = 0;
            arg0.field1211 = arg0.field1210[0] * 128 + arg0.field1214 * 64;
            arg0.field1219 = arg0.field1264[0] * 128 + arg0.field1214 * 64;
            arg0.method1362();
        }
        if (Statics.field3110 == arg0 && (arg0.field1211 < 1536 || arg0.field1219 < 1536 || arg0.field1211 >= 11776 || arg0.field1219 >= 11776)) {
            arg0.field1242 = -1;
            arg0.field1247 = -1;
            arg0.field1256 = 0;
            arg0.field1269 = 0;
            arg0.field1211 = arg0.field1210[0] * 128 + arg0.field1214 * 64;
            arg0.field1219 = arg0.field1264[0] * 128 + arg0.field1214 * 64;
            arg0.method1362();
        }
        method146(arg0);
        method4310(arg0);
    }

    @ObfuscatedName("jp.fu(Lcm;I)V")
    public static final void method4309(class79 arg0) {
        if (field929 == arg0.field1269 || arg0.field1242 == -1 || arg0.field1232 != 0 || arg0.field1244 + 1 > Statics.method240(arg0.field1242).field3586[arg0.field1243]) {
            int var1 = arg0.field1269 - arg0.field1256;
            int var2 = field929 - arg0.field1256;
            int var3 = arg0.field1237 * 128 + arg0.field1214 * 64;
            int var4 = arg0.field1254 * 128 + arg0.field1214 * 64;
            int var5 = arg0.field1266 * 128 + arg0.field1214 * 64;
            int var6 = arg0.field1255 * 128 + arg0.field1214 * 64;
            arg0.field1211 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1219 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1268 = 0;
        arg0.field1257 = arg0.field1258;
        arg0.field1212 = arg0.field1257;
    }

    @ObfuscatedName("j.fh(Lcm;I)V")
    public static final void method146(class79 arg0) {
        if (arg0.field1233 == 0) {
            return;
        }
        if (arg0.field1236 != -1) {
            class79 var1 = null;
            if (arg0.field1236 < 32768) {
                var1 = field1050[arg0.field1236];
            } else if (arg0.field1236 >= 32768) {
                var1 = field1070[arg0.field1236 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1211 - var1.field1211;
                int var3 = arg0.field1219 - var1.field1219;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1257 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1250) {
                arg0.field1236 = -1;
                arg0.field1250 = false;
            }
        }
        if (arg0.field1238 != -1 && (arg0.field1252 == 0 || arg0.field1268 > 0)) {
            arg0.field1257 = arg0.field1238;
            arg0.field1238 = -1;
        }
        int var4 = arg0.field1257 - arg0.field1212 & 0x7FF;
        if (var4 == 0 && arg0.field1250) {
            arg0.field1236 = -1;
            arg0.field1250 = false;
        }
        if (var4 == 0) {
            arg0.field1261 = 0;
            return;
        }
        arg0.field1261++;
        if (var4 > 1024) {
            arg0.field1212 -= arg0.field1233;
            boolean var5 = true;
            if (var4 < arg0.field1233 || var4 > 2048 - arg0.field1233) {
                arg0.field1212 = arg0.field1257;
                var5 = false;
            }
            if (arg0.field1253 == arg0.field1239 && (arg0.field1261 > 25 || var5)) {
                if (arg0.field1216 == -1) {
                    arg0.field1239 = arg0.field1218;
                } else {
                    arg0.field1239 = arg0.field1216;
                }
            }
        } else {
            arg0.field1212 += arg0.field1233;
            boolean var6 = true;
            if (var4 < arg0.field1233 || var4 > 2048 - arg0.field1233) {
                arg0.field1212 = arg0.field1257;
                var6 = false;
            }
            if (arg0.field1253 == arg0.field1239 && (arg0.field1261 > 25 || var6)) {
                if (arg0.field1217 == -1) {
                    arg0.field1239 = arg0.field1218;
                } else {
                    arg0.field1239 = arg0.field1217;
                }
            }
        }
        arg0.field1212 &= 0x7FF;
    }

    @ObfuscatedName("jp.fk(Lcm;I)V")
    public static final void method4310(class79 arg0) {
        arg0.field1234 = false;
        if (arg0.field1239 != -1) {
            class261 var1 = Statics.method240(arg0.field1239);
            if (var1 == null || var1.field3584 == null) {
                arg0.field1239 = -1;
            } else {
                arg0.field1241++;
                if (arg0.field1215 < var1.field3584.length && arg0.field1241 > var1.field3586[arg0.field1215]) {
                    arg0.field1241 = 1;
                    arg0.field1215++;
                    method460(var1, arg0.field1215, arg0.field1211, arg0.field1219);
                }
                if (arg0.field1215 >= var1.field3584.length) {
                    arg0.field1241 = 0;
                    arg0.field1215 = 0;
                    method460(var1, arg0.field1215, arg0.field1211, arg0.field1219);
                }
            }
        }
        if (arg0.field1247 != -1 && field929 >= arg0.field1213) {
            if (arg0.field1248 < 0) {
                arg0.field1248 = 0;
            }
            int var2 = class246.method3494(arg0.field1247).field3300;
            if (var2 == -1) {
                arg0.field1247 = -1;
            } else {
                class261 var3 = Statics.method240(var2);
                if (var3 == null || var3.field3584 == null) {
                    arg0.field1247 = -1;
                } else {
                    arg0.field1249++;
                    if (arg0.field1248 < var3.field3584.length && arg0.field1249 > var3.field3586[arg0.field1248]) {
                        arg0.field1249 = 1;
                        arg0.field1248++;
                        method460(var3, arg0.field1248, arg0.field1211, arg0.field1219);
                    }
                    if (arg0.field1248 >= var3.field3584.length && (arg0.field1248 < 0 || arg0.field1248 >= var3.field3584.length)) {
                        arg0.field1247 = -1;
                    }
                }
            }
        }
        if (arg0.field1242 != -1 && arg0.field1232 <= 1) {
            class261 var4 = Statics.method240(arg0.field1242);
            if (var4.field3595 == 1 && arg0.field1220 > 0 && arg0.field1256 <= field929 && arg0.field1269 < field929) {
                arg0.field1232 = 1;
                return;
            }
        }
        if (arg0.field1242 != -1 && arg0.field1232 == 0) {
            class261 var5 = Statics.method240(arg0.field1242);
            if (var5 == null || var5.field3584 == null) {
                arg0.field1242 = -1;
            } else {
                arg0.field1244++;
                if (arg0.field1243 < var5.field3584.length && arg0.field1244 > var5.field3586[arg0.field1243]) {
                    arg0.field1244 = 1;
                    arg0.field1243++;
                    method460(var5, arg0.field1243, arg0.field1211, arg0.field1219);
                }
                if (arg0.field1243 >= var5.field3584.length) {
                    arg0.field1243 -= var5.field3588;
                    arg0.field1246++;
                    if (arg0.field1246 >= var5.field3594) {
                        arg0.field1242 = -1;
                    } else if (arg0.field1243 >= 0 && arg0.field1243 < var5.field3584.length) {
                        method460(var5, arg0.field1243, arg0.field1211, arg0.field1219);
                    } else {
                        arg0.field1242 = -1;
                    }
                }
                arg0.field1234 = var5.field3579;
            }
        }
        if (arg0.field1232 > 0) {
            arg0.field1232--;
        }
    }

    @ObfuscatedName("t.fo(Lbt;III)V")
    public static void method73(class75 arg0, int arg1, int arg2) {
        if (arg0.field1242 == arg1 && arg1 != -1) {
            int var3 = Statics.method240(arg1).field3597;
            if (var3 == 1) {
                arg0.field1243 = 0;
                arg0.field1244 = 0;
                arg0.field1232 = arg2;
                arg0.field1246 = 0;
            }
            if (var3 == 2) {
                arg0.field1246 = 0;
            }
        } else if (arg1 == -1 || arg0.field1242 == -1 || Statics.method240(arg1).field3591 >= Statics.method240(arg0.field1242).field3591) {
            arg0.field1242 = arg1;
            arg0.field1243 = 0;
            arg0.field1244 = 0;
            arg0.field1232 = arg2;
            arg0.field1246 = 0;
            arg0.field1220 = arg0.field1252;
        }
    }

    @ObfuscatedName("an.fq(I)I")
    public static int method456() {
        return field1119 ? 2 : 1;
    }

    @ObfuscatedName("bm.fw(S)V")
    public static void method940() {
        field958.method3096(36);
        class180 var0 = field958;
        int var1 = field1119 ? 2 : 1;
        var0.method2922(var1);
        field958.method2846(Statics.field584);
        field958.method2846(Statics.field248);
    }

    @ObfuscatedName("client.v(I)V")
    public final void method789() {
        field1051 = class176.method2679() + 500L;
        this.method1014();
        if (field940 != -1) {
            this.method1053(true);
        }
    }

    @ObfuscatedName("client.fd(I)V")
    public void method1014() {
        int var1 = Statics.field584;
        int var2 = Statics.field248;
        if (this.field710 < var1) {
            int var3 = this.field710;
        }
        if (this.field709 < var2) {
            int var4 = this.field709;
        }
        if (Statics.field479 == null) {
            return;
        }
        try {
            client var5 = Statics.field1353;
            Object[] var6 = new Object[] { method456() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.fn(I)V")
    public final void method1015() {
        if (field940 != -1) {
            method697(field940);
        }
        for (int var1 = 0; var1 < field1108; var1++) {
            if (field1110[var1]) {
                field1065[var1] = true;
            }
            field1112[var1] = field1110[var1];
            field1110[var1] = false;
        }
        field1109 = field929;
        field1054 = -1;
        field1055 = -1;
        Statics.field2371 = null;
        if (field940 != -1) {
            field1108 = 0;
            method2604(field940, 0, 0, Statics.field584, Statics.field248, 0, 0, -1);
        }
        class282.method4501();
        if (field1043) {
            method955();
        } else if (field1054 != -1) {
            int var2 = field1054;
            int var3 = field1055;
            if (field1176 >= 2 || field1058 != 0 || field1125) {
                int var4 = method461();
                String var5;
                if (field1058 == 1 && field1176 < 2) {
                    var5 = class226.field2975 + class226.field2985 + field1059 + " " + class89.field1375;
                } else if (field1125 && field1176 < 2) {
                    var5 = field1063 + class226.field2985 + field1064 + " " + class89.field1375;
                } else {
                    var5 = method969(var4);
                }
                if (field1176 > 2) {
                    var5 = var5 + class89.method40(16777215) + " " + '/' + " " + (field1176 - 2) + class226.field2979;
                }
                Statics.field3286.method4375(var5, var2 + 4, var3 + 15, 16777215, 0, field929 / 1000);
            }
        }
        if (field1117 == 3) {
            for (int var6 = 0; var6 < field1108; var6++) {
                if (field1112[var6]) {
                    class282.method4499(field1113[var6], field921[var6], field969[var6], field1116[var6], 16711935, 128);
                } else if (field1065[var6]) {
                    class282.method4499(field1113[var6], field921[var6], field969[var6], field1116[var6], 16711680, 128);
                }
            }
        }
        int var7 = Statics.field251;
        int var8 = Statics.field3110.field1211;
        int var9 = Statics.field3110.field1219;
        int var10 = field1067;
        for (class83 var11 = (class83) class83.field1312.method3296(); var11 != null; var11 = (class83) class83.field1312.method3298()) {
            if (var11.field1313 != -1 || var11.field1315 != null) {
                int var12 = 0;
                if (var8 > var11.field1308) {
                    var12 += var8 - var11.field1308;
                } else if (var8 < var11.field1316) {
                    var12 += var11.field1316 - var8;
                }
                if (var9 > var11.field1318) {
                    var12 += var9 - var11.field1318;
                } else if (var9 < var11.field1307) {
                    var12 += var11.field1307 - var9;
                }
                if (var12 - 64 > var11.field1310 || field1036 == 0 || var11.field1305 != var7) {
                    if (var11.field1309 != null) {
                        Statics.field5.method1674(var11.field1309);
                        var11.field1309 = null;
                    }
                    if (var11.field1317 != null) {
                        Statics.field5.method1674(var11.field1317);
                        var11.field1317 = null;
                    }
                } else {
                    var12 -= 64;
                    if (var12 < 0) {
                        var12 = 0;
                    }
                    int var13 = field1036 * (var11.field1310 - var12) / var11.field1310;
                    class106 var10000;
                    if (var11.field1309 != null) {
                        var11.field1309.method1896(var13);
                    } else if (var11.field1313 >= 0) {
                        var10000 = (class106) null;
                        class106 var14 = class106.method1735(Statics.field354, var11.field1313, 0);
                        if (var14 != null) {
                            class108 var15 = var14.method1728().method1774(Statics.field238);
                            class118 var16 = class118.method1892(var15, 100, var13);
                            var16.method1895(-1);
                            Statics.field5.method1673(var16);
                            var11.field1309 = var16;
                        }
                    }
                    if (var11.field1317 != null) {
                        var11.field1317.method1896(var13);
                        if (!var11.field1317.method3286()) {
                            var11.field1317 = null;
                        }
                    } else if (var11.field1315 != null && (var11.field1304 -= var10) <= 0) {
                        int var17 = (int) (Math.random() * (double) var11.field1315.length);
                        var10000 = (class106) null;
                        class106 var18 = class106.method1735(Statics.field354, var11.field1315[var17], 0);
                        if (var18 != null) {
                            class108 var19 = var18.method1728().method1774(Statics.field238);
                            class118 var20 = class118.method1892(var19, 100, var13);
                            var20.method1895(0);
                            Statics.field5.method1673(var20);
                            var11.field1317 = var20;
                            var11.field1304 = var11.field1306 + (int) (Math.random() * (double) (var11.field1314 - var11.field1306));
                        }
                    }
                }
            }
        }
        field1067 = 0;
    }

    @ObfuscatedName("fk.ff(Ljava/lang/String;ZB)V")
    public static final void method2761(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1626.method4328(arg0, 250);
        int var6 = Statics.field1626.method4329(arg0, 250) * 13;
        class282.method4510(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class282.method4523(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1626.method4335(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2600(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field418.method700(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field1108; var11++) {
            if (field969[var11] + field1113[var11] > var7 && field1113[var11] < var7 + var9 && field921[var11] + field1116[var11] > var8 && field921[var11] < var8 + var10) {
                field1065[var11] = true;
            }
        }
    }

    @ObfuscatedName("y.fa(IIIII)V")
    public static final void method116(int arg0, int arg1, int arg2, int arg3) {
        field1022++;
        method162(class67.field811);
        boolean var4 = false;
        if (field1034 >= 0) {
            int var5 = class97.field1470;
            int[] var6 = class97.field1471;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field1034 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method162(class67.field809);
        }
        method1501(true);
        method162(var4 ? class67.field810 : class67.field812);
        method1501(false);
        for (class94 var8 = (class94) field1037.method3296(); var8 != null; var8 = (class94) field1037.method3298()) {
            if (Statics.field251 != var8.field1434 || field929 > var8.field1440) {
                var8.method3287();
            } else if (field929 >= var8.field1454) {
                if (var8.field1442 > 0) {
                    class87 var9 = field1050[var8.field1442 - 1];
                    if (var9 != null && var9.field1211 >= 0 && var9.field1211 < 13312 && var9.field1219 >= 0 && var9.field1219 < 13312) {
                        var8.method1567(var9.field1211, var9.field1219, method161(var9.field1211, var9.field1219, var8.field1434) - var8.field1438, field929);
                    }
                }
                if (var8.field1442 < 0) {
                    int var10 = -var8.field1442 - 1;
                    class75 var11;
                    if (field1026 == var10) {
                        var11 = Statics.field3110;
                    } else {
                        var11 = field1070[var10];
                    }
                    if (var11 != null && var11.field1211 >= 0 && var11.field1211 < 13312 && var11.field1219 >= 0 && var11.field1219 < 13312) {
                        var8.method1567(var11.field1211, var11.field1219, method161(var11.field1211, var11.field1219, var8.field1434) - var8.field1438, field929);
                    }
                }
                var8.method1570(field1067);
                Statics.field315.method2478(Statics.field251, (int) var8.field1443, (int) var8.field1446, (int) var8.field1447, 60, var8, var8.field1451, -1, false);
            }
        }
        for (class85 var12 = (class85) field1038.method3296(); var12 != null; var12 = (class85) field1038.method3298()) {
            if (Statics.field251 != var12.field1337 || var12.field1346) {
                var12.method3287();
            } else if (field929 >= var12.field1338) {
                var12.method1495(field1067);
                if (var12.field1346) {
                    var12.method3287();
                } else {
                    Statics.field315.method2478(var12.field1337, var12.field1347, var12.field1341, var12.field1342, 60, var12, 0, -1, false);
                }
            }
        }
        method142(arg0, arg1, arg2, arg3, true);
        int var13 = field1165;
        int var14 = field1166;
        int var15 = field1167;
        int var16 = field1015;
        class282.method4528(var13, var14, var13 + var15, var14 + var16);
        class137.method2331();
        if (!field1009) {
            int var17 = field988;
            if (field997 / 256 > var17) {
                var17 = field997 / 256;
            }
            if (field960[4] && field1154[4] + 128 > var17) {
                var17 = field1154[4] + 128;
            }
            int var18 = field1019 & 0x7FF;
            int var19 = Statics.field3169;
            int var20 = method161(Statics.field3110.field1211, Statics.field3110.field1219, Statics.field251) - field994;
            int var21 = Statics.field2214;
            int var22 = var17 * 3 + 600;
            int var23 = 2048 - var17 & 0x7FF;
            int var24 = 2048 - var18 & 0x7FF;
            int var25 = 0;
            int var26 = 0;
            int var27 = var22;
            if (var23 != 0) {
                int var28 = class137.field1983[var23];
                int var29 = class137.field1973[var23];
                int var30 = var26 * var29 - var22 * var28 >> 16;
                var27 = var26 * var28 + var22 * var29 >> 16;
                var26 = var30;
            }
            if (var24 != 0) {
                int var31 = class137.field1983[var24];
                int var32 = class137.field1973[var24];
                int var33 = var25 * var32 + var27 * var31 >> 16;
                var27 = var27 * var32 - var25 * var31 >> 16;
                var25 = var33;
            }
            Statics.field871 = var19 - var25;
            Statics.field826 = var20 - var26;
            Statics.field987 = var21 - var27;
            Statics.field252 = var17;
            Statics.field3209 = var18;
        }
        int var46;
        if (field1009) {
            var46 = method2762();
        } else {
            int var34;
            if (Statics.field479.field1299) {
                var34 = Statics.field251;
            } else {
                label550: {
                    int var35 = 3;
                    if (Statics.field252 < 310) {
                        int var36 = Statics.field871 >> 7;
                        int var37 = Statics.field987 >> 7;
                        int var38 = Statics.field3110.field1211 >> 7;
                        int var39 = Statics.field3110.field1219 >> 7;
                        if (var36 < 0 || var37 < 0 || var36 >= 104 || var37 >= 104) {
                            var34 = Statics.field251;
                            break label550;
                        }
                        if ((class62.field752[Statics.field251][var36][var37] & 0x4) != 0) {
                            var35 = Statics.field251;
                        }
                        int var40;
                        if (var38 > var36) {
                            var40 = var38 - var36;
                        } else {
                            var40 = var36 - var38;
                        }
                        int var41;
                        if (var39 > var37) {
                            var41 = var39 - var37;
                        } else {
                            var41 = var37 - var39;
                        }
                        if (var40 > var41) {
                            int var42 = var41 * 65536 / var40;
                            int var43 = 32768;
                            while (var36 != var38) {
                                if (var36 < var38) {
                                    var36++;
                                } else if (var36 > var38) {
                                    var36--;
                                }
                                if ((class62.field752[Statics.field251][var36][var37] & 0x4) != 0) {
                                    var35 = Statics.field251;
                                }
                                var43 += var42;
                                if (var43 >= 65536) {
                                    var43 -= 65536;
                                    if (var37 < var39) {
                                        var37++;
                                    } else if (var37 > var39) {
                                        var37--;
                                    }
                                    if ((class62.field752[Statics.field251][var36][var37] & 0x4) != 0) {
                                        var35 = Statics.field251;
                                    }
                                }
                            }
                        } else {
                            int var44 = var40 * 65536 / var41;
                            int var45 = 32768;
                            while (var37 != var39) {
                                if (var37 < var39) {
                                    var37++;
                                } else if (var37 > var39) {
                                    var37--;
                                }
                                if ((class62.field752[Statics.field251][var36][var37] & 0x4) != 0) {
                                    var35 = Statics.field251;
                                }
                                var45 += var44;
                                if (var45 >= 65536) {
                                    var45 -= 65536;
                                    if (var36 < var38) {
                                        var36++;
                                    } else if (var36 > var38) {
                                        var36--;
                                    }
                                    if ((class62.field752[Statics.field251][var36][var37] & 0x4) != 0) {
                                        var35 = Statics.field251;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field3110.field1211 >= 0 && Statics.field3110.field1219 >= 0 && Statics.field3110.field1211 < 13312 && Statics.field3110.field1219 < 13312) {
                        if ((class62.field752[Statics.field251][Statics.field3110.field1211 >> 7][Statics.field3110.field1219 >> 7] & 0x4) != 0) {
                            var35 = Statics.field251;
                        }
                        var34 = var35;
                    } else {
                        var34 = Statics.field251;
                    }
                }
            }
            var46 = var34;
        }
        int var47 = Statics.field871;
        int var48 = Statics.field826;
        int var49 = Statics.field987;
        int var50 = Statics.field252;
        int var51 = Statics.field3209;
        for (int var52 = 0; var52 < 5; var52++) {
            if (field960[var52]) {
                int var53 = (int) (Math.random() * (double) (field1153[var52] * 2 + 1) - (double) field1153[var52] + Math.sin((double) field1094[var52] / 100.0D * (double) field1156[var52]) * (double) field1154[var52]);
                if (var52 == 0) {
                    Statics.field871 += var53;
                }
                if (var52 == 1) {
                    Statics.field826 += var53;
                }
                if (var52 == 2) {
                    Statics.field987 += var53;
                }
                if (var52 == 3) {
                    Statics.field3209 = Statics.field3209 + var53 & 0x7FF;
                }
                if (var52 == 4) {
                    Statics.field252 += var53;
                    if (Statics.field252 < 128) {
                        Statics.field252 = 128;
                    }
                    if (Statics.field252 > 383) {
                        Statics.field252 = 383;
                    }
                }
            }
        }
        int var54 = class60.field731;
        int var55 = class60.field732;
        if (class60.field730 != 0) {
            var54 = class60.field738;
            var55 = class60.field724;
        }
        if (var54 >= var13 && var54 < var13 + var15 && var55 >= var14 && var55 < var14 + var16) {
            int var56 = var54 - var13;
            int var57 = var55 - var14;
            class135.field1954 = var56;
            class135.field1949 = var57;
            class135.field1958 = true;
            class135.field1955 = 0;
            class135.field1952 = false;
        } else {
            class135.method4306();
        }
        method2598();
        class282.method4510(var13, var14, var15, var16, 0);
        method2598();
        int var58 = class137.field1984;
        class137.field1984 = field1169;
        Statics.field315.method2465(Statics.field871, Statics.field826, Statics.field987, Statics.field252, Statics.field3209, var46);
        while (true) {
            class10 var59 = (class10) class8.field220.method3261();
            if (var59 == null) {
                class137.field1984 = var58;
                method2598();
                Statics.field315.method2438();
                field962 = 0;
                boolean var60 = false;
                int var61 = -1;
                int var62 = class97.field1470;
                int[] var63 = class97.field1471;
                for (int var64 = 0; var64 < field954 + var62; var64++) {
                    class79 var65;
                    if (var64 < var62) {
                        var65 = field1070[var63[var64]];
                        if (field1034 == var63[var64]) {
                            var60 = true;
                            var61 = var64;
                            continue;
                        }
                    } else {
                        var65 = field1050[field955[var64 - var62]];
                    }
                    method3706(var65, var64, var13, var14, var15, var16);
                }
                if (var60) {
                    method3706(field1070[field1034], var61, var13, var14, var15, var16);
                }
                for (int var66 = 0; var66 < field962; var66++) {
                    int var67 = field1000[var66];
                    int var68 = field1001[var66];
                    int var69 = field1052[var66];
                    int var70 = field982[var66];
                    boolean var71 = true;
                    while (var71) {
                        var71 = false;
                        for (int var72 = 0; var72 < var66; var72++) {
                            if (var68 + 2 > field1001[var72] - field982[var72] && var68 - var70 < field1001[var72] + 2 && var67 - var69 < field1052[var72] + field1000[var72] && var67 + var69 > field1000[var72] - field1052[var72] && field1001[var72] - field982[var72] < var68) {
                                var68 = field1001[var72] - field982[var72];
                                var71 = true;
                            }
                        }
                    }
                    field1010 = field1000[var66];
                    field974 = field1001[var66] = var68;
                    String var73 = field1007[var66];
                    if (field917 == 0) {
                        int var74 = 16776960;
                        if (field1088[var66] < 6) {
                            var74 = field943[field1088[var66]];
                        }
                        if (field1088[var66] == 6) {
                            var74 = field1022 % 20 < 10 ? 16711680 : 16776960;
                        }
                        if (field1088[var66] == 7) {
                            var74 = field1022 % 20 < 10 ? 255 : 65535;
                        }
                        if (field1088[var66] == 8) {
                            var74 = field1022 % 20 < 10 ? 45056 : 8454016;
                        }
                        if (field1088[var66] == 9) {
                            int var75 = 150 - field1006[var66];
                            if (var75 < 50) {
                                var74 = var75 * 1280 + 16711680;
                            } else if (var75 < 100) {
                                var74 = 16776960 - (var75 - 50) * 327680;
                            } else if (var75 < 150) {
                                var74 = (var75 - 100) * 5 + 65280;
                            }
                        }
                        if (field1088[var66] == 10) {
                            int var76 = 150 - field1006[var66];
                            if (var76 < 50) {
                                var74 = var76 * 5 + 16711680;
                            } else if (var76 < 100) {
                                var74 = 16711935 - (var76 - 50) * 327680;
                            } else if (var76 < 150) {
                                var74 = (var76 - 100) * 327680 + 255 - (var76 - 100) * 5;
                            }
                        }
                        if (field1088[var66] == 11) {
                            int var77 = 150 - field1006[var66];
                            if (var77 < 50) {
                                var74 = 16777215 - var77 * 327685;
                            } else if (var77 < 100) {
                                var74 = (var77 - 50) * 327685 + 65280;
                            } else if (var77 < 150) {
                                var74 = 16777215 - (var77 - 100) * 327680;
                            }
                        }
                        if (field1005[var66] == 0) {
                            Statics.field3286.method4334(var73, field1010 + var13, field974 + var14, var74, 0);
                        }
                        if (field1005[var66] == 1) {
                            Statics.field3286.method4336(var73, field1010 + var13, field974 + var14, var74, 0, field1022);
                        }
                        if (field1005[var66] == 2) {
                            Statics.field3286.method4337(var73, field1010 + var13, field974 + var14, var74, 0, field1022);
                        }
                        if (field1005[var66] == 3) {
                            Statics.field3286.method4406(var73, field1010 + var13, field974 + var14, var74, 0, field1022, 150 - field1006[var66]);
                        }
                        if (field1005[var66] == 4) {
                            int var78 = (150 - field1006[var66]) * (Statics.field3286.method4326(var73) + 100) / 150;
                            class282.method4591(field1010 + var13 - 50, var14, field1010 + var13 + 50, var14 + var16);
                            Statics.field3286.method4331(var73, field1010 + var13 + 50 - var78, field974 + var14, var74, 0);
                            class282.method4528(var13, var14, var13 + var15, var14 + var16);
                        }
                        if (field1005[var66] == 5) {
                            int var79 = 150 - field1006[var66];
                            int var80 = 0;
                            if (var79 < 25) {
                                var80 = var79 - 25;
                            } else if (var79 > 125) {
                                var80 = var79 - 125;
                            }
                            class282.method4591(var13, field974 + var14 - Statics.field3286.field3626 - 1, var13 + var15, field974 + var14 + 5);
                            Statics.field3286.method4334(var73, field1010 + var13, field974 + var14 + var80, var74, 0);
                            class282.method4528(var13, var14, var13 + var15, var14 + var16);
                        }
                    } else {
                        Statics.field3286.method4334(var73, field1010 + var13, field974 + var14, 16776960, 0);
                    }
                }
                method2609(var13, var14);
                ((class126) Statics.field1995).method2119(field1067);
                if (field953 == 1) {
                    Statics.field1320[field1014 / 100].method4631(field1012 - 8, field1013 - 8);
                }
                if (field953 == 2) {
                    Statics.field1320[field1014 / 100 + 4].method4631(field1012 - 8, field1013 - 8);
                }
                field1024 = 0;
                int var81 = (Statics.field3110.field1211 >> 7) + Statics.field329;
                int var82 = (Statics.field3110.field1219 >> 7) + Statics.field2282;
                if (var81 >= 3053 && var81 <= 3156 && var82 >= 3056 && var82 <= 3136) {
                    field1024 = 1;
                }
                if (var81 >= 3072 && var81 <= 3118 && var82 >= 9492 && var82 <= 9535) {
                    field1024 = 1;
                }
                if (field1024 == 1 && var81 >= 3139 && var81 <= 3199 && var82 >= 3008 && var82 <= 3062) {
                    field1024 = 0;
                }
                Statics.field871 = var47;
                Statics.field826 = var48;
                Statics.field987 = var49;
                Statics.field252 = var50;
                Statics.field3209 = var51;
                if (field923 && class239.method662(true, false) == 0) {
                    field923 = false;
                }
                if (field923) {
                    class282.method4510(var13, var14, var15, var16, 0);
                    method2761(class226.field2835, false);
                }
                return;
            }
            var59.method38();
        }
    }

    @ObfuscatedName("f.fj(IIIIZB)V")
    public static final void method142(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1158 - field1164) * var5 / 100 + field1164;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1163) {
            short var8 = field1163;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field980) {
                var6 = field980;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class282.method4501();
                    class282.method4510(arg0, arg1, var10, arg3, -16777216);
                    class282.method4510(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field966) {
            short var11 = field966;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field914) {
                var6 = field914;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class282.method4501();
                    class282.method4510(arg0, arg1, arg2, var13, -16777216);
                    class282.method4510(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1160 - field1159) * var5 / 100 + field1159;
        field1169 = arg3 * var6 * var14 / 85504 << 1;
        if (field1167 != arg2 || field1015 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class137.field1983[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class140.method2440(var15, 500, 800, arg2, arg3);
        }
        field1165 = arg0;
        field1166 = arg1;
        field1167 = arg2;
        field1015 = arg3;
    }

    @ObfuscatedName("b.fs(Lbc;I)V")
    public static final void method162(class67 arg0) {
        if (Statics.field3110.field1211 >> 7 == field1017 && Statics.field3110.field1219 >> 7 == field1138) {
            field1017 = 0;
        }
        int var1 = class97.field1470;
        int[] var2 = class97.field1471;
        int var3 = var1;
        if (class67.field811 == arg0 || class67.field809 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class75 var5;
            int var6;
            if (class67.field811 == arg0) {
                var5 = Statics.field3110;
                var6 = Statics.field3110.field902 << 14;
            } else if (class67.field809 == arg0) {
                var5 = field1070[field1034];
                var6 = field1034 << 14;
            } else {
                var5 = field1070[var2[var4]];
                var6 = var2[var4] << 14;
                if (class67.field810 == arg0 && field1034 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method980() && !var5.field894) {
                var5.field898 = false;
                if ((field919 && var1 > 50 || var1 > 200) && class67.field811 != arg0 && var5.field1253 == var5.field1239) {
                    var5.field898 = true;
                }
                int var7 = var5.field1211 >> 7;
                int var8 = var5.field1219 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field889 == null || field929 < var5.field905 || field929 >= var5.field876) {
                        if ((var5.field1211 & 0x7F) == 64 && (var5.field1219 & 0x7F) == 64) {
                            if (field1022 == field1008[var7][var8]) {
                                continue;
                            }
                            field1008[var7][var8] = field1022;
                        }
                        var5.field883 = method161(var5.field1211, var5.field1219, Statics.field251);
                        Statics.field315.method2478(Statics.field251, var5.field1211, var5.field1219, var5.field883, 60, var5, var5.field1212, var6, var5.field1234);
                    } else {
                        var5.field898 = false;
                        var5.field883 = method161(var5.field1211, var5.field1219, Statics.field251);
                        Statics.field315.method2436(Statics.field251, var5.field1211, var5.field1219, var5.field883, 60, var5, var5.field1212, var6, var5.field890, var5.field891, var5.field892, var5.field893);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cp.fp(ZI)V")
    public static final void method1501(boolean arg0) {
        for (int var1 = 0; var1 < field954; var1++) {
            class87 var2 = field1050[field955[var1]];
            int var3 = (field955[var1] << 14) + 536870912;
            if (var2 != null && var2.method980() && var2.field1359.field3552 == arg0 && var2.field1359.method4203()) {
                int var4 = var2.field1211 >> 7;
                int var5 = var2.field1219 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1214 == 1 && (var2.field1211 & 0x7F) == 64 && (var2.field1219 & 0x7F) == 64) {
                        if (field1022 == field1008[var4][var5]) {
                            continue;
                        }
                        field1008[var4][var5] = field1022;
                    }
                    if (!var2.field1359.field3560) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field315.method2478(Statics.field251, var2.field1211, var2.field1219, method161(var2.field1211 + (var2.field1214 * 64 - 64), var2.field1219 + (var2.field1214 * 64 - 64), Statics.field251), var2.field1214 * 64 - 64 + 60, var2, var2.field1212, var3, var2.field1234);
                }
            }
        }
    }

    @ObfuscatedName("fk.fy(I)I")
    public static final int method2762() {
        if (Statics.field479.field1299) {
            return Statics.field251;
        } else {
            int var0 = method161(Statics.field871, Statics.field987, Statics.field251);
            return var0 - Statics.field826 >= 800 || (class62.field752[Statics.field251][Statics.field871 >> 7][Statics.field987 >> 7] & 0x4) == 0 ? 3 : Statics.field251;
        }
    }

    @ObfuscatedName("es.fe(III)V")
    public static final void method2609(int arg0, int arg1) {
        if (field993 == 2) {
            method149((field1044 - Statics.field329 << 7) + field939, (field937 - Statics.field2282 << 7) + field1118, field961 * 2);
            if (field1010 > -1 && field929 % 20 < 10) {
                Statics.field1431[0].method4631(field1010 + arg0 - 12, field974 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("hl.fx(Lcm;IIIIII)V")
    public static final void method3706(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method980()) {
            return;
        }
        if (arg0 instanceof class87) {
            class259 var6 = ((class87) arg0).field1359;
            if (var6.field3557 != null) {
                var6 = var6.method4231();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class97.field1470;
        int[] var8 = class97.field1471;
        int var9 = 3;
        if (!arg0.field1235.method3265()) {
            method16(arg0, arg0.field1260 + 15);
            for (class86 var10 = (class86) arg0.field1235.method3262(); var10 != null; var10 = (class86) arg0.field1235.method3276()) {
                class80 var11 = var10.method1504(field929);
                if (var11 != null) {
                    class249 var12 = var10.field1355;
                    class286 var13 = var12.method3984();
                    class286 var14 = var12.method3975();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3349;
                    } else {
                        if (var12.field3350 * 2 < var14.field3778) {
                            var15 = var12.field3350;
                        }
                        var16 = var14.field3778 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field929 - var11.field1277;
                    int var20 = var11.field1274 * var16 / var12.field3349;
                    int var23;
                    if (var11.field1278 > var19) {
                        int var21 = var12.field3345 == 0 ? 0 : var19 / var12.field3345 * var12.field3345;
                        int var22 = var11.field1273 * var16 / var12.field3349;
                        var23 = (var20 - var22) * var21 / var11.field1278 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1278 + var12.field3347 - var19;
                        if (var12.field3344 >= 0) {
                            var17 = (var24 << 8) / (var12.field3347 - var12.field3344);
                        }
                    }
                    if (var11.field1274 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field1010 + arg2 - (var16 >> 1);
                    int var26 = field974 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field1010 > -1) {
                            class282.method4510(var25, var26, var23, 5, 65280);
                            class282.method4510(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3768;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4697(var27, var26, var17);
                            class282.method4591(var27, var26, var27 + var28, var26 + var29);
                            var14.method4697(var27, var26, var17);
                        } else {
                            var13.method4631(var27, var26);
                            class282.method4591(var27, var26, var27 + var28, var26 + var29);
                            var14.method4631(var27, var26);
                        }
                        class282.method4528(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1510()) {
                    var10.method3287();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class75 var30 = (class75) arg0;
            if (var30.field894) {
                return;
            }
            if (var30.field878 != -1 || var30.field879 != -1) {
                method16(arg0, arg0.field1260 + 15);
                if (field1010 > -1) {
                    if (var30.field878 != -1) {
                        Statics.field2293[var30.field878].method4631(field1010 + arg2 - 12, field974 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field879 != -1) {
                        Statics.field2406[var30.field879].method4631(field1010 + arg2 - 12, field974 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field993 == 10 && field1151 == var8[arg1]) {
                method16(arg0, arg0.field1260 + 15);
                if (field1010 > -1) {
                    Statics.field1431[1].method4631(field1010 + arg2 - 12, field974 + arg3 - var9);
                }
            }
        } else {
            class259 var31 = ((class87) arg0).field1359;
            if (var31.field3557 != null) {
                var31 = var31.method4231();
            }
            if (var31.field3555 >= 0 && var31.field3555 < Statics.field2406.length) {
                method16(arg0, arg0.field1260 + 15);
                if (field1010 > -1) {
                    Statics.field2406[var31.field3555].method4631(field1010 + arg2 - 12, field974 + arg3 - 30);
                }
            }
            if (field993 == 1 && field934 == field955[arg1 - var7] && field929 % 20 < 10) {
                method16(arg0, arg0.field1260 + 15);
                if (field1010 > -1) {
                    Statics.field1431[0].method4631(field1010 + arg2 - 12, field974 + arg3 - 28);
                }
            }
        }
        if (arg0.field1223 != null && (arg1 >= var7 || !arg0.field1225 && (field1018 == 4 || !arg0.field1224 && (field1018 == 0 || field1018 == 3 || field1018 == 1 && method2617(((class75) arg0).field884, false))))) {
            method16(arg0, arg0.field1260);
            if (field1010 > -1 && field962 < field999) {
                field1052[field962] = Statics.field3286.method4326(arg0.field1223) / 2;
                field982[field962] = Statics.field3286.field3626;
                field1000[field962] = field1010;
                field1001[field962] = field974;
                field1088[field962] = arg0.field1227;
                field1005[field962] = arg0.field1228;
                field1006[field962] = arg0.field1226;
                field1007[field962] = arg0.field1223;
                field962++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1263[var32];
            int var34 = arg0.field1230[var32];
            class255 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field929) {
                    continue;
                }
                var35 = class255.method2842(arg0.field1230[var32]);
                var36 = var35.field3397;
                if (var35 != null && var35.field3408 != null) {
                    var35 = var35.method4082();
                    if (var35 == null) {
                        arg0.field1263[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1262[var32];
            class255 var38 = null;
            if (var37 >= 0) {
                var38 = class255.method2842(var37);
                if (var38 != null && var38.field3408 != null) {
                    var38 = var38.method4082();
                }
            }
            if (var33 - var36 <= field929) {
                if (var35 == null) {
                    arg0.field1263[var32] = -1;
                } else {
                    method16(arg0, arg0.field1260 / 2);
                    if (field1010 > -1) {
                        if (var32 == 1) {
                            field974 -= 20;
                        }
                        if (var32 == 2) {
                            field1010 -= 15;
                            field974 -= 10;
                        }
                        if (var32 == 3) {
                            field1010 += 15;
                            field974 -= 10;
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
                        class286 var64 = var35.method4057();
                        if (var64 != null) {
                            var43 = var64.field3778;
                            int var65 = var64.field3768;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3771;
                        }
                        class286 var66 = var35.method4053();
                        if (var66 != null) {
                            var44 = var66.field3778;
                            int var67 = var66.field3768;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3771;
                        }
                        class286 var68 = var35.method4058();
                        if (var68 != null) {
                            var45 = var68.field3778;
                            int var69 = var68.field3768;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3771;
                        }
                        class286 var70 = var35.method4059();
                        if (var70 != null) {
                            var46 = var70.field3778;
                            int var71 = var70.field3768;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3771;
                        }
                        if (var38 != null) {
                            var51 = var38.method4057();
                            if (var51 != null) {
                                var55 = var51.field3778;
                                int var72 = var51.field3768;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3771;
                            }
                            var52 = var38.method4053();
                            if (var52 != null) {
                                var56 = var52.field3778;
                                int var73 = var52.field3768;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3771;
                            }
                            var53 = var38.method4058();
                            if (var53 != null) {
                                var57 = var53.field3778;
                                int var74 = var53.field3768;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3771;
                            }
                            var54 = var38.method4059();
                            if (var54 != null) {
                                var58 = var54.field3778;
                                int var75 = var54.field3768;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3771;
                            }
                        }
                        class264 var76 = var35.method4060();
                        if (var76 == null) {
                            var76 = Statics.field294;
                        }
                        class264 var77;
                        if (var38 == null) {
                            var77 = Statics.field294;
                        } else {
                            var77 = var38.method4060();
                            if (var77 == null) {
                                var77 = Statics.field294;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4056(arg0.field1231[var32]);
                        int var83 = var76.method4326(var82);
                        if (var38 != null) {
                            var79 = var38.method4056(arg0.field1270[var32]);
                            var81 = var77.method4326(var79);
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
                        int var100 = arg0.field1263[var32] - field929;
                        int var101 = var35.field3396 - var35.field3396 * var100 / var35.field3397;
                        int var102 = var35.field3392 * var100 / var35.field3397 + -var35.field3392;
                        int var103 = field1010 + arg2 - (var92 >> 1) + var101;
                        int var104 = field974 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3407 + var104 + 15;
                        int var108 = var107 - var76.field3634;
                        int var109 = var76.field3628 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3407 + var104 + 15;
                            int var111 = var110 - var77.field3634;
                            int var112 = var77.field3628 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3404 >= 0) {
                            var115 = (var100 << 8) / (var35.field3397 - var35.field3404);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4697(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4697(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4697(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4697(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4344(var82, var90 + var103, var107, var35.field3410, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4697(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4697(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4697(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4697(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4344(var79, var98 + var103, var110, var38.field3410, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4631(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4631(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4631(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4631(var93 + var103 - var50, var104);
                            }
                            var76.method4331(var82, var90 + var103, var107, var35.field3410 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4631(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4631(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4631(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4631(var97 + var103 - var62, var104);
                                }
                                var77.method4331(var79, var98 + var103, var110, var38.field3410 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.fl(Lcm;II)V")
    public static final void method16(class79 arg0, int arg1) {
        method149(arg0.field1211, arg0.field1219, arg1);
    }

    @ObfuscatedName("n.fi(IIII)V")
    public static final void method149(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field1010 = -1;
            field974 = -1;
            return;
        }
        int var3 = method161(arg0, arg1, Statics.field251) - arg2;
        int var4 = arg0 - Statics.field871;
        int var5 = var3 - Statics.field826;
        int var6 = arg1 - Statics.field987;
        int var7 = class137.field1983[Statics.field252];
        int var8 = class137.field1973[Statics.field252];
        int var9 = class137.field1983[Statics.field3209];
        int var10 = class137.field1973[Statics.field3209];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field1010 = field1169 * var11 / var15 + field1167 / 2;
            field974 = field1169 * var14 / var15 + field1015 / 2;
        } else {
            field1010 = -1;
            field974 = -1;
        }
    }

    @ObfuscatedName("z.fv(IIIB)I")
    public static final int method161(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field752[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field763[var5][var3][var4] + class62.field763[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field763[var5][var3][var4 + 1] + class62.field763[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("dr.ft(ZB)V")
    public static final void method2220(boolean arg0) {
        field1045 = arg0;
        if (!field1045) {
            int var1 = field1168.method2894();
            int var2 = field1168.method2894();
            int var3 = field1168.method2861();
            Statics.field537 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field537[var4][var5] = field1168.method2987();
                }
            }
            Statics.field1208 = new int[var3];
            Statics.field808 = new int[var3];
            Statics.field2815 = new int[var3];
            Statics.field2004 = new byte[var3][];
            Statics.field2287 = new byte[var3][];
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
                        Statics.field1208[var7] = var10;
                        Statics.field808[var7] = Statics.field2401.method3730("m" + var8 + "_" + var9);
                        Statics.field2815[var7] = Statics.field2401.method3730("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method63(var1, var2, true);
            return;
        }
        int var11 = field1168.method2895();
        int var12 = field1168.method2895();
        boolean var13 = field1168.method3044() == 1;
        int var14 = field1168.method2861();
        field1168.method3098();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field1168.method3108(1);
                    if (var18 == 1) {
                        field1134[var15][var16][var17] = field1168.method3108(26);
                    } else {
                        field1134[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field1168.method3100();
        Statics.field537 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field537[var19][var20] = field1168.method2987();
            }
        }
        Statics.field1208 = new int[var14];
        Statics.field808 = new int[var14];
        Statics.field2815 = new int[var14];
        Statics.field2004 = new byte[var14][];
        Statics.field2287 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field1134[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field1208[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field1208[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field808[var21] = Statics.field2401.method3730("m" + var30 + "_" + var31);
                            Statics.field2815[var21] = Statics.field2401.method3730("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method63(var11, var12, !var13);
    }

    @ObfuscatedName("t.fc(IIZI)V")
    public static final void method63(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field2405 == arg0 && Statics.field2089 == arg1) {
            return;
        }
        Statics.field2405 = arg0;
        Statics.field2089 = arg1;
        method2630(25);
        method2761(class226.field2835, true);
        int var3 = Statics.field329;
        int var4 = Statics.field2282;
        Statics.field329 = (arg0 - 6) * 8;
        Statics.field2282 = (arg1 - 6) * 8;
        int var5 = Statics.field329 - var3;
        int var6 = Statics.field2282 - var4;
        int var7 = Statics.field329;
        int var8 = Statics.field2282;
        for (int var9 = 0; var9 < 32768; var9++) {
            class87 var10 = field1050[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1210[var11] -= var5;
                    var10.field1264[var11] -= var6;
                }
                var10.field1211 -= var5 * 128;
                var10.field1219 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class75 var13 = field1070[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1210[var14] -= var5;
                    var13.field1264[var14] -= var6;
                }
                var13.field1211 -= var5 * 128;
                var13.field1219 -= var6 * 128;
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
                        field1035[var25][var21][var22] = field1035[var25][var23][var24];
                    } else {
                        field1035[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class77 var26 = (class77) field1177.method3296(); var26 != null; var26 = (class77) field1177.method3298()) {
            var26.field1187 -= var5;
            var26.field1188 -= var6;
            if (var26.field1187 < 0 || var26.field1188 < 0 || var26.field1187 >= 104 || var26.field1188 >= 104) {
                var26.method3287();
            }
        }
        if (field1017 != 0) {
            field1017 -= var5;
            field1138 -= var6;
        }
        field936 = 0;
        field1009 = false;
        field1132 = -1;
        field1038.method3289();
        field1037.method3289();
        for (int var27 = 0; var27 < 4; var27++) {
            field976[var27].method2715();
        }
    }

    @ObfuscatedName("o.gd(ZI)V")
    public static final void method3(boolean arg0) {
        method2598();
        field964++;
        if (field964 < 50 && !arg0) {
            return;
        }
        field964 = 0;
        if (field959 || Statics.field273 == null) {
            return;
        }
        field958.method3096(251);
        try {
            Statics.field273.method2689(field958.field2355, 0, field958.field2357);
            field958.field2357 = 0;
        } catch (IOException var2) {
            field959 = true;
        }
    }

    @ObfuscatedName("ac.gt(I)V")
    public static final void method477() {
        method3(false);
        field971 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2004.length; var1++) {
            if (Statics.field808[var1] != -1 && Statics.field2004[var1] == null) {
                Statics.field2004[var1] = Statics.field2401.method3741(Statics.field808[var1], 0);
                if (Statics.field2004[var1] == null) {
                    var0 = false;
                    field971++;
                }
            }
            if (Statics.field2815[var1] != -1 && Statics.field2287[var1] == null) {
                Statics.field2287[var1] = Statics.field2401.method3715(Statics.field2815[var1], 0, Statics.field537[var1]);
                if (Statics.field2287[var1] == null) {
                    var0 = false;
                    field971++;
                }
            }
        }
        if (!var0) {
            field975 = 1;
            return;
        }
        field973 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2004.length; var3++) {
            byte[] var4 = Statics.field2287[var3];
            if (var4 != null) {
                int var5 = (Statics.field1208[var3] >> 8) * 64 - Statics.field329;
                int var6 = (Statics.field1208[var3] & 0xFF) * 64 - Statics.field2282;
                if (field1045) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class174 var9 = new class174(var4);
                int var10 = -1;
                label1127: while (true) {
                    int var11 = var9.method3016();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method3016();
                            if (var16 == 0) {
                                continue label1127;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2843() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class256 var22 = class256.method2825(var10);
                                if (var19 != 22 || !field919 || var22.field3430 != 0 || var22.field3428 == 1 || var22.field3449) {
                                    if (!var22.method4096()) {
                                        field973++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method3016();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2843();
                    }
                }
            }
        }
        if (!var2) {
            field975 = 2;
            return;
        }
        if (field975 != 0) {
            method2761(class226.field2835 + class89.field1372 + class89.field1377 + 100 + "%" + class89.field1373, true);
        }
        method2598();
        method18();
        method2598();
        Statics.field315.method2424();
        method2598();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field976[var23].method2715();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class62.field752[var24][var25][var26] = 0;
                }
            }
        }
        method2598();
        class62.field755 = 99;
        Statics.field2823 = new byte[4][104][104];
        Statics.field29 = new byte[4][104][104];
        Statics.field753 = new byte[4][104][104];
        Statics.field289 = new byte[4][104][104];
        Statics.field756 = new int[4][105][105];
        Statics.field1950 = new byte[4][105][105];
        Statics.field757 = new int[105][105];
        Statics.field3651 = new int[104];
        Statics.field487 = new int[104];
        Statics.field3648 = new int[104];
        Statics.field2226 = new int[104];
        Statics.field2394 = new int[104];
        int var27 = Statics.field2004.length;
        for (class83 var28 = (class83) class83.field1312.method3296(); var28 != null; var28 = (class83) class83.field1312.method3298()) {
            if (var28.field1309 != null) {
                Statics.field5.method1674(var28.field1309);
                var28.field1309 = null;
            }
            if (var28.field1317 != null) {
                Statics.field5.method1674(var28.field1317);
                var28.field1317 = null;
            }
        }
        class83.field1312.method3289();
        method3(true);
        if (!field1045) {
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = (Statics.field1208[var29] >> 8) * 64 - Statics.field329;
                int var31 = (Statics.field1208[var29] & 0xFF) * 64 - Statics.field2282;
                byte[] var32 = Statics.field2004[var29];
                if (var32 != null) {
                    method2598();
                    class62.method238(var32, var30, var31, Statics.field2405 * 8 - 48, Statics.field2089 * 8 - 48, field976);
                }
            }
            for (int var33 = 0; var33 < var27; var33++) {
                int var34 = (Statics.field1208[var33] >> 8) * 64 - Statics.field329;
                int var35 = (Statics.field1208[var33] & 0xFF) * 64 - Statics.field2282;
                byte[] var36 = Statics.field2004[var33];
                if (var36 == null && Statics.field2089 < 800) {
                    method2598();
                    class62.method648(var34, var35, 64, 64);
                }
            }
            method3(true);
            for (int var37 = 0; var37 < var27; var37++) {
                byte[] var38 = Statics.field2287[var37];
                if (var38 != null) {
                    int var39 = (Statics.field1208[var37] >> 8) * 64 - Statics.field329;
                    int var40 = (Statics.field1208[var37] & 0xFF) * 64 - Statics.field2282;
                    method2598();
                    class62.method844(var38, var39, var40, Statics.field315, field976);
                }
            }
        }
        if (field1045) {
            for (int var41 = 0; var41 < 4; var41++) {
                method2598();
                for (int var42 = 0; var42 < 13; var42++) {
                    for (int var43 = 0; var43 < 13; var43++) {
                        boolean var44 = false;
                        int var45 = field1134[var41][var42][var43];
                        if (var45 != -1) {
                            int var46 = var45 >> 24 & 0x3;
                            int var47 = var45 >> 1 & 0x3;
                            int var48 = var45 >> 14 & 0x3FF;
                            int var49 = var45 >> 3 & 0x7FF;
                            int var50 = (var48 / 8 << 8) + var49 / 8;
                            for (int var51 = 0; var51 < Statics.field1208.length; var51++) {
                                if (Statics.field1208[var51] == var50 && Statics.field2004[var51] != null) {
                                    byte[] var52 = Statics.field2004[var51];
                                    int var53 = var42 * 8;
                                    int var54 = var43 * 8;
                                    int var55 = (var48 & 0x7) * 8;
                                    int var56 = (var49 & 0x7) * 8;
                                    class162[] var57 = field976;
                                    for (int var58 = 0; var58 < 8; var58++) {
                                        for (int var59 = 0; var59 < 8; var59++) {
                                            if (var53 + var58 > 0 && var53 + var58 < 103 && var54 + var59 > 0 && var54 + var59 < 103) {
                                                var57[var41].field2260[var53 + var58][var54 + var59] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class174 var60 = new class174(var52);
                                    for (int var61 = 0; var61 < 4; var61++) {
                                        for (int var62 = 0; var62 < 64; var62++) {
                                            for (int var63 = 0; var63 < 64; var63++) {
                                                if (var46 == var61 && var62 >= var55 && var62 < var55 + 8 && var63 >= var56 && var63 < var56 + 8) {
                                                    int var67 = var62 & 0x7;
                                                    int var68 = var63 & 0x7;
                                                    int var70 = var47 & 0x3;
                                                    int var71;
                                                    if (var70 == 0) {
                                                        var71 = var67;
                                                    } else if (var70 == 1) {
                                                        var71 = var68;
                                                    } else if (var70 == 2) {
                                                        var71 = 7 - var67;
                                                    } else {
                                                        var71 = 7 - var68;
                                                    }
                                                    int var74 = var53 + var71;
                                                    int var76 = var62 & 0x7;
                                                    int var77 = var63 & 0x7;
                                                    int var79 = var47 & 0x3;
                                                    int var80;
                                                    if (var79 == 0) {
                                                        var80 = var77;
                                                    } else if (var79 == 1) {
                                                        var80 = 7 - var76;
                                                    } else if (var79 == 2) {
                                                        var80 = 7 - var77;
                                                    } else {
                                                        var80 = var76;
                                                    }
                                                    class62.method478(var60, var41, var74, var54 + var80, 0, 0, var47);
                                                } else {
                                                    class62.method478(var60, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var44 = true;
                                    break;
                                }
                            }
                        }
                        if (!var44) {
                            class62.method933(var41, var42 * 8, var43 * 8);
                        }
                    }
                }
            }
            for (int var81 = 0; var81 < 13; var81++) {
                for (int var82 = 0; var82 < 13; var82++) {
                    int var83 = field1134[0][var81][var82];
                    if (var83 == -1) {
                        class62.method648(var81 * 8, var82 * 8, 8, 8);
                    }
                }
            }
            method3(true);
            for (int var84 = 0; var84 < 4; var84++) {
                method2598();
                for (int var85 = 0; var85 < 13; var85++) {
                    label962: for (int var86 = 0; var86 < 13; var86++) {
                        int var87 = field1134[var84][var85][var86];
                        if (var87 != -1) {
                            int var88 = var87 >> 24 & 0x3;
                            int var89 = var87 >> 1 & 0x3;
                            int var90 = var87 >> 14 & 0x3FF;
                            int var91 = var87 >> 3 & 0x7FF;
                            int var92 = (var90 / 8 << 8) + var91 / 8;
                            for (int var93 = 0; var93 < Statics.field1208.length; var93++) {
                                if (Statics.field1208[var93] == var92 && Statics.field2287[var93] != null) {
                                    byte[] var94 = Statics.field2287[var93];
                                    int var95 = var85 * 8;
                                    int var96 = var86 * 8;
                                    int var97 = (var90 & 0x7) * 8;
                                    int var98 = (var91 & 0x7) * 8;
                                    class140 var99 = Statics.field315;
                                    class162[] var100 = field976;
                                    class174 var101 = new class174(var94);
                                    int var102 = -1;
                                    while (true) {
                                        int var103 = var101.method3016();
                                        if (var103 == 0) {
                                            continue label962;
                                        }
                                        var102 += var103;
                                        int var104 = 0;
                                        while (true) {
                                            int var105 = var101.method3016();
                                            if (var105 == 0) {
                                                break;
                                            }
                                            var104 += var105 - 1;
                                            int var106 = var104 & 0x3F;
                                            int var107 = var104 >> 6 & 0x3F;
                                            int var108 = var104 >> 12;
                                            int var109 = var101.method2843();
                                            int var110 = var109 >> 2;
                                            int var111 = var109 & 0x3;
                                            if (var88 == var108 && var107 >= var97 && var107 < var97 + 8 && var106 >= var98 && var106 < var98 + 8) {
                                                class256 var112 = class256.method2825(var102);
                                                int var114 = var107 & 0x7;
                                                int var115 = var106 & 0x7;
                                                int var117 = var112.field3426;
                                                int var118 = var112.field3425;
                                                if ((var111 & 0x1) == 1) {
                                                    int var119 = var117;
                                                    var117 = var118;
                                                    var118 = var119;
                                                }
                                                int var120 = var89 & 0x3;
                                                int var121;
                                                if (var120 == 0) {
                                                    var121 = var114;
                                                } else if (var120 == 1) {
                                                    var121 = var115;
                                                } else if (var120 == 2) {
                                                    var121 = 7 - var114 - (var117 - 1);
                                                } else {
                                                    var121 = 7 - var115 - (var118 - 1);
                                                }
                                                int var122 = var95 + var121;
                                                int var124 = var107 & 0x7;
                                                int var125 = var106 & 0x7;
                                                int var127 = var112.field3426;
                                                int var128 = var112.field3425;
                                                if ((var111 & 0x1) == 1) {
                                                    int var129 = var127;
                                                    var127 = var128;
                                                    var128 = var129;
                                                }
                                                int var130 = var89 & 0x3;
                                                int var131;
                                                if (var130 == 0) {
                                                    var131 = var125;
                                                } else if (var130 == 1) {
                                                    var131 = 7 - var124 - (var127 - 1);
                                                } else if (var130 == 2) {
                                                    var131 = 7 - var125 - (var128 - 1);
                                                } else {
                                                    var131 = var124;
                                                }
                                                int var132 = var96 + var131;
                                                if (var122 > 0 && var132 > 0 && var122 < 103 && var132 < 103) {
                                                    int var133 = var84;
                                                    if ((class62.field752[1][var122][var132] & 0x2) == 2) {
                                                        var133 = var84 - 1;
                                                    }
                                                    class162 var134 = null;
                                                    if (var133 >= 0) {
                                                        var134 = var100[var133];
                                                    }
                                                    class62.method170(var84, var122, var132, var102, var89 + var111 & 0x3, var110, var99, var134);
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
        method3(true);
        method18();
        method2598();
        class140 var135 = Statics.field315;
        class162[] var136 = field976;
        for (int var137 = 0; var137 < 4; var137++) {
            for (int var138 = 0; var138 < 104; var138++) {
                for (int var139 = 0; var139 < 104; var139++) {
                    if ((class62.field752[var137][var138][var139] & 0x1) == 1) {
                        int var140 = var137;
                        if ((class62.field752[1][var138][var139] & 0x2) == 2) {
                            var140 = var137 - 1;
                        }
                        if (var140 >= 0) {
                            var136[var140].method2741(var138, var139);
                        }
                    }
                }
            }
        }
        class62.field751 += (int) (Math.random() * 5.0D) - 2;
        if (class62.field751 < -8) {
            class62.field751 = -8;
        }
        if (class62.field751 > 8) {
            class62.field751 = 8;
        }
        class62.field754 += (int) (Math.random() * 5.0D) - 2;
        if (class62.field754 < -16) {
            class62.field754 = -16;
        }
        if (class62.field754 > 16) {
            class62.field754 = 16;
        }
        for (int var141 = 0; var141 < 4; var141++) {
            byte[][] var142 = Statics.field1950[var141];
            int var143 = (int) Math.sqrt(5100.0D);
            int var144 = var143 * 768 >> 8;
            for (int var145 = 1; var145 < 103; var145++) {
                for (int var146 = 1; var146 < 103; var146++) {
                    int var147 = class62.field763[var141][var146 + 1][var145] - class62.field763[var141][var146 - 1][var145];
                    int var148 = class62.field763[var141][var146][var145 + 1] - class62.field763[var141][var146][var145 - 1];
                    int var149 = (int) Math.sqrt((double) (var148 * var148 + var147 * var147 + 65536));
                    int var150 = (var147 << 8) / var149;
                    int var151 = 65536 / var149;
                    int var152 = (var148 << 8) / var149;
                    int var153 = (var152 * -50 + var150 * -50 + var151 * -10) / var144 + 96;
                    int var154 = (var142[var146][var145] >> 1) + (var142[var146][var145 + 1] >> 3) + (var142[var146][var145 - 1] >> 2) + (var142[var146 - 1][var145] >> 2) + (var142[var146 + 1][var145] >> 3);
                    Statics.field757[var146][var145] = var153 - var154;
                }
            }
            for (int var155 = 0; var155 < 104; var155++) {
                Statics.field3651[var155] = 0;
                Statics.field487[var155] = 0;
                Statics.field3648[var155] = 0;
                Statics.field2226[var155] = 0;
                Statics.field2394[var155] = 0;
            }
            for (int var156 = -5; var156 < 109; var156++) {
                for (int var157 = 0; var157 < 104; var157++) {
                    int var158 = var156 + 5;
                    int var10002;
                    if (var158 >= 0 && var158 < 104) {
                        int var159 = Statics.field2823[var141][var158][var157] & 0xFF;
                        if (var159 > 0) {
                            class247 var160 = class247.method2764(var159 - 1);
                            Statics.field3651[var157] += var160.field3318;
                            Statics.field487[var157] += var160.field3321;
                            Statics.field3648[var157] += var160.field3320;
                            Statics.field2226[var157] += var160.field3316;
                            var10002 = Statics.field2394[var157]++;
                        }
                    }
                    int var161 = var156 - 5;
                    if (var161 >= 0 && var161 < 104) {
                        int var162 = Statics.field2823[var141][var161][var157] & 0xFF;
                        if (var162 > 0) {
                            class247 var163 = class247.method2764(var162 - 1);
                            Statics.field3651[var157] -= var163.field3318;
                            Statics.field487[var157] -= var163.field3321;
                            Statics.field3648[var157] -= var163.field3320;
                            Statics.field2226[var157] -= var163.field3316;
                            var10002 = Statics.field2394[var157]--;
                        }
                    }
                }
                if (var156 >= 1 && var156 < 103) {
                    int var164 = 0;
                    int var165 = 0;
                    int var166 = 0;
                    int var167 = 0;
                    int var168 = 0;
                    for (int var169 = -5; var169 < 109; var169++) {
                        int var170 = var169 + 5;
                        if (var170 >= 0 && var170 < 104) {
                            var164 += Statics.field3651[var170];
                            var165 += Statics.field487[var170];
                            var166 += Statics.field3648[var170];
                            var167 += Statics.field2226[var170];
                            var168 += Statics.field2394[var170];
                        }
                        int var171 = var169 - 5;
                        if (var171 >= 0 && var171 < 104) {
                            var164 -= Statics.field3651[var171];
                            var165 -= Statics.field487[var171];
                            var166 -= Statics.field3648[var171];
                            var167 -= Statics.field2226[var171];
                            var168 -= Statics.field2394[var171];
                        }
                        if (var169 >= 1 && var169 < 103 && (!field919 || (class62.field752[0][var156][var169] & 0x2) != 0 || (class62.field752[var141][var156][var169] & 0x10) == 0)) {
                            if (var141 < class62.field755) {
                                class62.field755 = var141;
                            }
                            int var172 = Statics.field2823[var141][var156][var169] & 0xFF;
                            int var173 = Statics.field29[var141][var156][var169] & 0xFF;
                            if (var172 > 0 || var173 > 0) {
                                int var174 = class62.field763[var141][var156][var169];
                                int var175 = class62.field763[var141][var156 + 1][var169];
                                int var176 = class62.field763[var141][var156 + 1][var169 + 1];
                                int var177 = class62.field763[var141][var156][var169 + 1];
                                int var178 = Statics.field757[var156][var169];
                                int var179 = Statics.field757[var156 + 1][var169];
                                int var180 = Statics.field757[var156 + 1][var169 + 1];
                                int var181 = Statics.field757[var156][var169 + 1];
                                int var182 = -1;
                                int var183 = -1;
                                if (var172 > 0) {
                                    int var184 = var164 * 256 / var167;
                                    int var185 = var165 / var168;
                                    int var186 = var166 / var168;
                                    var182 = class62.method4427(var184, var185, var186);
                                    int var187 = class62.field751 + var184 & 0xFF;
                                    int var188 = class62.field754 + var186;
                                    if (var188 < 0) {
                                        var188 = 0;
                                    } else if (var188 > 255) {
                                        var188 = 255;
                                    }
                                    var183 = class62.method4427(var187, var185, var188);
                                }
                                if (var141 > 0) {
                                    boolean var189 = true;
                                    if (var172 == 0 && Statics.field753[var141][var156][var169] != 0) {
                                        var189 = false;
                                    }
                                    if (var173 > 0 && !class260.method2681(var173 - 1).field3568) {
                                        var189 = false;
                                    }
                                    if (var189 && var174 == var175 && var174 == var176 && var174 == var177) {
                                        Statics.field756[var141][var156][var169] |= 0x924;
                                    }
                                }
                                int var190 = 0;
                                if (var183 != -1) {
                                    var190 = class137.field1994[class62.method532(var183, 96)];
                                }
                                if (var173 == 0) {
                                    var135.method2429(var141, var156, var169, 0, 0, -1, var174, var175, var176, var177, class62.method532(var182, var178), class62.method532(var182, var179), class62.method532(var182, var180), class62.method532(var182, var181), 0, 0, 0, 0, var190, 0);
                                } else {
                                    int var191 = Statics.field753[var141][var156][var169] + 1;
                                    byte var192 = Statics.field289[var141][var156][var169];
                                    class260 var193 = class260.method2681(var173 - 1);
                                    int var194 = var193.field3567;
                                    int var195;
                                    int var196;
                                    if (var194 >= 0) {
                                        var195 = Statics.field1995.method2122(var194);
                                        var196 = -1;
                                    } else if (var193.field3566 == 16711935) {
                                        var196 = -2;
                                        var194 = -1;
                                        var195 = -2;
                                    } else {
                                        var196 = class62.method4427(var193.field3570, var193.field3578, var193.field3574);
                                        int var197 = class62.field751 + var193.field3570 & 0xFF;
                                        int var198 = class62.field754 + var193.field3574;
                                        if (var198 < 0) {
                                            var198 = 0;
                                        } else if (var198 > 255) {
                                            var198 = 255;
                                        }
                                        var195 = class62.method4427(var197, var193.field3578, var198);
                                    }
                                    int var199 = 0;
                                    if (var195 != -2) {
                                        var199 = class137.field1994[class62.method2324(var195, 96)];
                                    }
                                    if (var193.field3564 != -1) {
                                        int var200 = class62.field751 + var193.field3573 & 0xFF;
                                        int var201 = class62.field754 + var193.field3575;
                                        if (var201 < 0) {
                                            var201 = 0;
                                        } else if (var201 > 255) {
                                            var201 = 255;
                                        }
                                        int var202 = class62.method4427(var200, var193.field3572, var201);
                                        var199 = class137.field1994[class62.method2324(var202, 96)];
                                    }
                                    var135.method2429(var141, var156, var169, var191, var192, var194, var174, var175, var176, var177, class62.method532(var182, var178), class62.method532(var182, var179), class62.method532(var182, var180), class62.method532(var182, var181), class62.method2324(var196, var178), class62.method2324(var196, var179), class62.method2324(var196, var180), class62.method2324(var196, var181), var190, var199);
                                }
                            }
                        }
                    }
                }
            }
            for (int var203 = 1; var203 < 103; var203++) {
                for (int var204 = 1; var204 < 103; var204++) {
                    var135.method2550(var141, var204, var203, class62.method954(var141, var204, var203));
                }
            }
            Statics.field2823[var141] = (byte[][]) null;
            Statics.field29[var141] = (byte[][]) null;
            Statics.field753[var141] = (byte[][]) null;
            Statics.field289[var141] = (byte[][]) null;
            Statics.field1950[var141] = (byte[][]) null;
        }
        var135.method2566(-50, -10, -50);
        for (int var205 = 0; var205 < 104; var205++) {
            for (int var206 = 0; var206 < 104; var206++) {
                if ((class62.field752[1][var205][var206] & 0x2) == 2) {
                    var135.method2480(var205, var206);
                }
            }
        }
        int var207 = 1;
        int var208 = 2;
        int var209 = 4;
        for (int var210 = 0; var210 < 4; var210++) {
            if (var210 > 0) {
                var207 <<= 0x3;
                var208 <<= 0x3;
                var209 <<= 0x3;
            }
            for (int var211 = 0; var211 <= var210; var211++) {
                for (int var212 = 0; var212 <= 104; var212++) {
                    for (int var213 = 0; var213 <= 104; var213++) {
                        if ((Statics.field756[var211][var213][var212] & var207) != 0) {
                            int var214 = var212;
                            int var215 = var212;
                            int var216 = var211;
                            int var217 = var211;
                            while (var214 > 0 && (Statics.field756[var211][var213][var214 - 1] & var207) != 0) {
                                var214--;
                            }
                            while (var215 < 104 && (Statics.field756[var211][var213][var215 + 1] & var207) != 0) {
                                var215++;
                            }
                            label697: while (var216 > 0) {
                                for (int var218 = var214; var218 <= var215; var218++) {
                                    if ((Statics.field756[var216 - 1][var213][var218] & var207) == 0) {
                                        break label697;
                                    }
                                }
                                var216--;
                            }
                            label686: while (var217 < var210) {
                                for (int var219 = var214; var219 <= var215; var219++) {
                                    if ((Statics.field756[var217 + 1][var213][var219] & var207) == 0) {
                                        break label686;
                                    }
                                }
                                var217++;
                            }
                            int var220 = (var217 + 1 - var216) * (var215 - var214 + 1);
                            if (var220 >= 8) {
                                short var221 = 240;
                                int var222 = class62.field763[var217][var213][var214] - var221;
                                int var223 = class62.field763[var216][var213][var214];
                                class140.method2427(var210, 1, var213 * 128, var213 * 128, var214 * 128, var215 * 128 + 128, var222, var223);
                                for (int var224 = var216; var224 <= var217; var224++) {
                                    for (int var225 = var214; var225 <= var215; var225++) {
                                        Statics.field756[var224][var213][var225] &= ~var207;
                                    }
                                }
                            }
                        }
                        if ((Statics.field756[var211][var213][var212] & var208) != 0) {
                            int var226 = var213;
                            int var227 = var213;
                            int var228 = var211;
                            int var229 = var211;
                            while (var226 > 0 && (Statics.field756[var211][var226 - 1][var212] & var208) != 0) {
                                var226--;
                            }
                            while (var227 < 104 && (Statics.field756[var211][var227 + 1][var212] & var208) != 0) {
                                var227++;
                            }
                            label750: while (var228 > 0) {
                                for (int var230 = var226; var230 <= var227; var230++) {
                                    if ((Statics.field756[var228 - 1][var230][var212] & var208) == 0) {
                                        break label750;
                                    }
                                }
                                var228--;
                            }
                            label739: while (var229 < var210) {
                                for (int var231 = var226; var231 <= var227; var231++) {
                                    if ((Statics.field756[var229 + 1][var231][var212] & var208) == 0) {
                                        break label739;
                                    }
                                }
                                var229++;
                            }
                            int var232 = (var229 + 1 - var228) * (var227 - var226 + 1);
                            if (var232 >= 8) {
                                short var233 = 240;
                                int var234 = class62.field763[var229][var226][var212] - var233;
                                int var235 = class62.field763[var228][var226][var212];
                                class140.method2427(var210, 2, var226 * 128, var227 * 128 + 128, var212 * 128, var212 * 128, var234, var235);
                                for (int var236 = var228; var236 <= var229; var236++) {
                                    for (int var237 = var226; var237 <= var227; var237++) {
                                        Statics.field756[var236][var237][var212] &= ~var208;
                                    }
                                }
                            }
                        }
                        if ((Statics.field756[var211][var213][var212] & var209) != 0) {
                            int var238 = var213;
                            int var239 = var213;
                            int var240 = var212;
                            int var241 = var212;
                            while (var240 > 0 && (Statics.field756[var211][var213][var240 - 1] & var209) != 0) {
                                var240--;
                            }
                            while (var241 < 104 && (Statics.field756[var211][var213][var241 + 1] & var209) != 0) {
                                var241++;
                            }
                            label803: while (var238 > 0) {
                                for (int var242 = var240; var242 <= var241; var242++) {
                                    if ((Statics.field756[var211][var238 - 1][var242] & var209) == 0) {
                                        break label803;
                                    }
                                }
                                var238--;
                            }
                            label792: while (var239 < 104) {
                                for (int var243 = var240; var243 <= var241; var243++) {
                                    if ((Statics.field756[var211][var239 + 1][var243] & var209) == 0) {
                                        break label792;
                                    }
                                }
                                var239++;
                            }
                            if ((var239 - var238 + 1) * (var241 - var240 + 1) >= 4) {
                                int var244 = class62.field763[var211][var238][var240];
                                class140.method2427(var210, 4, var238 * 128, var239 * 128 + 128, var240 * 128, var241 * 128 + 128, var244, var244);
                                for (int var245 = var238; var245 <= var239; var245++) {
                                    for (int var246 = var240; var246 <= var241; var246++) {
                                        Statics.field756[var211][var245][var246] &= ~var209;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method3(true);
        int var247 = class62.field755;
        if (var247 > Statics.field251) {
            var247 = Statics.field251;
        }
        if (var247 < Statics.field251 - 1) {
            int var248 = Statics.field251 - 1;
        }
        if (field919) {
            Statics.field315.method2568(class62.field755);
        } else {
            Statics.field315.method2568(0);
        }
        for (int var249 = 0; var249 < 104; var249++) {
            for (int var250 = 0; var250 < 104; var250++) {
                method1671(var249, var250);
            }
        }
        method2598();
        method479();
        class256.field3444.method3223();
        if (Statics.field1353.method751()) {
            field958.method3096(10);
            field958.method3024(1057001181);
        }
        if (!field1045) {
            int var251 = (Statics.field2405 - 6) / 8;
            int var252 = (Statics.field2405 + 6) / 8;
            int var253 = (Statics.field2089 - 6) / 8;
            int var254 = (Statics.field2089 + 6) / 8;
            for (int var255 = var251 - 1; var255 <= var252 + 1; var255++) {
                for (int var256 = var253 - 1; var256 <= var254 + 1; var256++) {
                    if (var255 < var251 || var255 > var252 || var256 < var253 || var256 > var254) {
                        Statics.field2401.method3736("m" + var255 + "_" + var256);
                        Statics.field2401.method3736("l" + var255 + "_" + var256);
                    }
                }
            }
        }
        method2630(30);
        method2598();
        Statics.field2823 = (byte[][][]) null;
        Statics.field29 = (byte[][][]) null;
        Statics.field753 = (byte[][][]) null;
        Statics.field289 = (byte[][][]) null;
        Statics.field756 = (int[][][]) null;
        Statics.field1950 = (byte[][][]) null;
        Statics.field757 = (int[][]) null;
        Statics.field3651 = null;
        Statics.field487 = null;
        Statics.field3648 = null;
        Statics.field2226 = null;
        Statics.field2394 = null;
        field958.method3096(70);
        Statics.field1751.method2626();
        for (int var257 = 0; var257 < 32; var257++) {
            field697[var257] = 0L;
        }
        for (int var258 = 0; var258 < 32; var258++) {
            field687[var258] = 0L;
        }
        Statics.field693 = 0;
    }

    @ObfuscatedName("gw.gv(II)V")
    public static final void method3389(int arg0) {
        int[] var1 = Statics.field577.field3770;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field752[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field315.method2531(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class62.field752[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field315.method2531(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field577.method4622();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field752[arg0][var10][var9] & 0x18) == 0) {
                    method1379(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class62.field752[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method1379(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1057 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field315.method2453(Statics.field251, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class256.method2825(var14).field3439;
                    if (var15 >= 0) {
                        field1136[field1057] = Statics.field3266[var15].method3875(false);
                        field1040[field1057] = var11;
                        field1135[field1057] = var12;
                        field1057++;
                    }
                }
            }
        }
        Statics.field418.method4592();
    }

    @ObfuscatedName("cm.ga(IIIIIB)V")
    public static final void method1379(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field315.method2567(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field315.method2522(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field577.field3770;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class256 var13 = class256.method2825(var12);
            if (var13.field3421 == -1) {
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
                class285 var14 = Statics.field1520[var13.field3421];
                if (var14 != null) {
                    int var15 = (var13.field3426 * 4 - var14.field3762) / 2;
                    int var16 = (var13.field3425 * 4 - var14.field3761) / 2;
                    var14.method4614(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3425) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field315.method2452(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field315.method2522(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class256 var22 = class256.method2825(var21);
            if (var22.field3421 != -1) {
                class285 var23 = Statics.field1520[var22.field3421];
                if (var23 != null) {
                    int var24 = (var22.field3426 * 4 - var23.field3762) / 2;
                    int var25 = (var22.field3425 * 4 - var23.field3761) / 2;
                    var23.method4614(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3425) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field577.field3770;
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
        int var29 = Statics.field315.method2453(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class256 var31 = class256.method2825(var30);
        if (var31.field3421 == -1) {
            return;
        }
        class285 var32 = Statics.field1520[var31.field3421];
        if (var32 != null) {
            int var33 = (var31.field3426 * 4 - var32.field3762) / 2;
            int var34 = (var31.field3425 * 4 - var32.field3761) / 2;
            var32.method4614(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3425) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.gk(I)Z")
    public final boolean method1016() {
        if (Statics.field273 == null) {
            return false;
        }
        try {
            int var1 = Statics.field273.method2687();
            if (var1 == 0) {
                return false;
            }
            if (field1002 == -1) {
                Statics.field273.method2688(field1168.field2355, 0, 1);
                field1168.field2357 = 0;
                field1002 = field1168.method3097();
                field926 = class273.field3691[field1002];
                var1--;
            }
            if (field926 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                Statics.field273.method2688(field1168.field2355, 0, 1);
                field926 = field1168.field2355[0] & 0xFF;
                var1--;
            }
            if (field926 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                Statics.field273.method2688(field1168.field2355, 0, 2);
                field1168.field2357 = 0;
                field926 = field1168.method2861();
                var1 -= 2;
            }
            if (var1 < field926) {
                return false;
            }
            field1168.field2357 = 0;
            Statics.field273.method2688(field1168.field2355, 0, field926);
            field963 = 0;
            field967 = field1060;
            field1060 = field965;
            field965 = field1002;
            if (field1002 == 49) {
                int var2 = field1168.method3016();
                boolean var3 = field1168.method2843() == 1;
                String var4 = "";
                boolean var5 = false;
                if (var3) {
                    var4 = field1168.method2867();
                    if (method645(var4)) {
                        var5 = true;
                    }
                }
                String var6 = field1168.method2867();
                if (!var5) {
                    class99.method1574(var2, var4, var6);
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 104) {
                Statics.field2194 = field1168.method2886();
                Statics.field1294 = field1168.method2843();
                for (int var7 = Statics.field1294; var7 < Statics.field1294 + 8; var7++) {
                    for (int var8 = Statics.field2194; var8 < Statics.field2194 + 8; var8++) {
                        if (field1035[Statics.field251][var7][var8] != null) {
                            field1035[Statics.field251][var7][var8] = null;
                            method1671(var7, var8);
                        }
                    }
                }
                for (class77 var9 = (class77) field1177.method3296(); var9 != null; var9 = (class77) field1177.method3298()) {
                    if (var9.field1187 >= Statics.field1294 && var9.field1187 < Statics.field1294 + 8 && var9.field1188 >= Statics.field2194 && var9.field1188 < Statics.field2194 + 8 && Statics.field251 == var9.field1185) {
                        var9.field1194 = 0;
                    }
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 231) {
                int var10 = field1168.method2987();
                class69 var11 = (class69) field1066.method3251((long) var10);
                if (var11 != null) {
                    method930(var11, true);
                }
                if (field1069 != null) {
                    method148(field1069);
                    field1069 = null;
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 209) {
                int var12 = field1168.method2894();
                int var13 = field1168.method3049();
                class212.field2575[var12] = var13;
                if (class212.field2573[var12] != var13) {
                    class212.field2573[var12] = var13;
                }
                method2774(var12);
                field1091[++field1092 - 1 & 0x1F] = var12;
                field1002 = -1;
                return true;
            }
            if (field1002 == 243) {
                field1018 = field1168.method2843();
                field1004 = field1168.method2843();
                field1002 = -1;
                return true;
            }
            if (field1002 == 138) {
                int var14 = field1168.method2906();
                int var15 = field1168.method2895();
                if (var15 == 65535) {
                    var15 = -1;
                }
                int var16 = field1168.method2905();
                class217 var17 = class217.method3861(var14);
                if (var17.field2617) {
                    var17.field2726 = var15;
                    var17.field2636 = var16;
                    class257 var19 = class257.method44(var15);
                    var17.field2712 = var19.field3480;
                    var17.field2670 = var19.field3481;
                    var17.field2671 = var19.field3483;
                    var17.field2662 = var19.field3463;
                    var17.field2668 = var19.field3484;
                    var17.field2623 = var19.field3489;
                    if (var19.field3485 == 1) {
                        var17.field2676 = 1;
                    } else {
                        var17.field2676 = 2;
                    }
                    if (var17.field2745 > 0) {
                        var17.field2623 = var17.field2623 * 32 / var17.field2745;
                    } else if (var17.field2629 > 0) {
                        var17.field2623 = var17.field2623 * 32 / var17.field2629;
                    }
                    method148(var17);
                } else if (var15 == -1) {
                    var17.field2661 = 0;
                    field1002 = -1;
                    return true;
                } else {
                    class257 var18 = class257.method44(var15);
                    var17.field2661 = 4;
                    var17.field2725 = var15;
                    var17.field2712 = var18.field3480;
                    var17.field2670 = var18.field3481;
                    var17.field2623 = var18.field3489 * 100 / var16;
                    method148(var17);
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 170) {
                int var20 = field1168.method3049();
                Statics.field374 = Statics.field699.method2641(var20);
                field1002 = -1;
                return true;
            }
            if (field1002 == 187) {
                field1009 = true;
                Statics.field903 = field1168.method2843();
                Statics.field551 = field1168.method2843();
                Statics.field449 = field1168.method2861();
                Statics.field2137 = field1168.method2843();
                Statics.field799 = field1168.method2843();
                if (Statics.field799 >= 100) {
                    Statics.field871 = Statics.field903 * 128 + 64;
                    Statics.field987 = Statics.field551 * 128 + 64;
                    Statics.field826 = method161(Statics.field871, Statics.field987, Statics.field251) - Statics.field449;
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 12) {
                boolean var21 = field1168.method3044() == 1;
                int var22 = field1168.method2906();
                class217 var23 = class217.method3861(var22);
                if (var23.field2638 != var21) {
                    var23.field2638 = var21;
                    method148(var23);
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 152) {
                String var24 = field1168.method2867();
                long var25 = field1168.method2865();
                long var27 = (long) field1168.method2861();
                long var29 = (long) field1168.method2994();
                class231 var31 = (class231) class169.method454(class231.method4044(), field1168.method2843());
                long var32 = (var27 << 32) + var29;
                boolean var34 = false;
                for (int var35 = 0; var35 < 100; var35++) {
                    if (field1124[var35] == var32) {
                        var34 = true;
                        break;
                    }
                }
                if (var31.field3140 && method645(var24)) {
                    var34 = true;
                }
                if (!var34 && field1024 == 0) {
                    field1124[field1115] = var32;
                    field1115 = (field1115 + 1) % 100;
                    class180 var36 = field1168;
                    String var37 = class266.method228(var36, 32767);
                    String var38 = class265.method4330(class271.method3577(var37));
                    if (var31.field3147 == -1) {
                        class99.method2103(9, var24, var38, class269.method2618(var25));
                    } else {
                        int var39 = var31.field3147;
                        String var40 = "<img=" + var39 + ">";
                        class99.method2103(9, var40 + var24, var38, class269.method2618(var25));
                    }
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 198) {
                while (field1168.field2357 < field926) {
                    int var41 = field1168.method2843();
                    boolean var42 = (var41 & 0x1) == 1;
                    String var43 = field1168.method2867();
                    String var44 = field1168.method2867();
                    field1168.method2867();
                    for (int var45 = 0; var45 < field1174; var45++) {
                        class71 var46 = field998[var45];
                        if (var42) {
                            if (var44.equals(var46.field846)) {
                                var46.field846 = var43;
                                var46.field845 = var44;
                                var43 = null;
                                break;
                            }
                        } else if (var43.equals(var46.field846)) {
                            var46.field846 = var43;
                            var46.field845 = var44;
                            var43 = null;
                            break;
                        }
                    }
                    if (var43 != null && field1174 < 400) {
                        class71 var47 = new class71();
                        field998[field1174] = var47;
                        var47.field846 = var43;
                        var47.field845 = var44;
                        field1174++;
                    }
                }
                field1143 = field1090;
                field1002 = -1;
                return true;
            }
            if (field1002 == 26) {
                int var48 = field1168.method2843();
                if (field1168.method2843() == 0) {
                    field1179[var48] = new class17();
                    field1168.field2357 += 18;
                } else {
                    field1168.field2357--;
                    field1179[var48] = new class17(field1168, false);
                }
                field1100 = field1090;
                field1002 = -1;
                return true;
            }
            if (field1002 == 218) {
                method3694(false);
                field1002 = -1;
                return true;
            }
            if (field1002 == 9) {
                int var49 = field1168.method2905();
                String var50 = field1168.method2867();
                class217 var51 = class217.method3861(var49);
                if (!var50.equals(var51.field2667)) {
                    var51.field2667 = var50;
                    method148(var51);
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 67) {
                Statics.field655 = class277.method1388(field1168.method2843());
                field1002 = -1;
                return true;
            }
            if (field1002 == 52) {
                int var52 = field926 + field1168.field2357;
                int var53 = field1168.method2861();
                int var54 = field1168.method2861();
                if (field940 != var53) {
                    field940 = var53;
                    this.method1053(false);
                    method528(field940);
                    Statics.method2680(field940);
                    for (int var55 = 0; var55 < 100; var55++) {
                        field1110[var55] = true;
                    }
                }
                while (var54-- > 0) {
                    int var56 = field1168.method2987();
                    int var57 = field1168.method2861();
                    int var58 = field1168.method2843();
                    class69 var59 = (class69) field1066.method3251((long) var56);
                    if (var59 != null && var59.field825 != var57) {
                        method930(var59, true);
                        var59 = null;
                    }
                    if (var59 == null) {
                        var59 = method46(var56, var57, var58);
                    }
                    var59.field824 = true;
                }
                for (class69 var60 = (class69) field1066.method3241(); var60 != null; var60 = (class69) field1066.method3242()) {
                    if (var60.field824) {
                        var60.field824 = false;
                    } else {
                        method930(var60, true);
                    }
                }
                field1107 = new class191(512);
                while (field1168.field2357 < var52) {
                    int var61 = field1168.method2987();
                    int var62 = field1168.method2861();
                    int var63 = field1168.method2861();
                    int var64 = field1168.method2987();
                    for (int var65 = var62; var65 <= var63; var65++) {
                        long var66 = ((long) var61 << 32) + (long) var65;
                        field1107.method3239(new class199(var64), var66);
                    }
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 140) {
                method2220(false);
                field1168.method3097();
                int var68 = field1168.method2861();
                Statics.method2597(field1168, var68);
                field1002 = -1;
                return true;
            }
            if (field1002 == 126) {
                class81 var69 = new class81();
                var69.field1291 = field1168.method2867();
                var69.field1288 = field1168.method2861();
                int var70 = field1168.method2987();
                var69.field1289 = var70;
                method2630(45);
                Statics.field273.method2684();
                Statics.field273 = null;
                class93.method3758(var69);
                field1002 = -1;
                return false;
            }
            if (field1002 == 156) {
                while (field1168.field2357 < field926) {
                    boolean var71 = field1168.method2843() == 1;
                    String var72 = field1168.method2867();
                    String var73 = field1168.method2867();
                    int var74 = field1168.method2861();
                    int var75 = field1168.method2843();
                    int var76 = field1168.method2843();
                    boolean var77 = (var76 & 0x2) != 0;
                    boolean var78 = (var76 & 0x1) != 0;
                    if (var74 > 0) {
                        field1168.method2867();
                        field1168.method2843();
                        field1168.method2987();
                    }
                    field1168.method2867();
                    for (int var79 = 0; var79 < field1170; var79++) {
                        class66 var80 = field1172[var79];
                        if (var71) {
                            if (var73.equals(var80.field805)) {
                                var80.field805 = var72;
                                var80.field800 = var73;
                                var72 = null;
                                break;
                            }
                        } else if (var72.equals(var80.field805)) {
                            if (var80.field801 != var74) {
                                boolean var81 = true;
                                for (class68 var82 = (class68) field1173.method3325(); var82 != null; var82 = (class68) field1173.method3326()) {
                                    if (var82.field814.equals(var72)) {
                                        if (var74 != 0 && var82.field816 == 0) {
                                            var82.method3337();
                                            var81 = false;
                                        } else if (var74 == 0 && var82.field816 != 0) {
                                            var82.method3337();
                                            var81 = false;
                                        }
                                    }
                                }
                                if (var81) {
                                    field1173.method3329(new class68(var72, var74));
                                }
                                var80.field801 = var74;
                            }
                            var80.field800 = var73;
                            var80.field802 = var75;
                            var80.field803 = var77;
                            var80.field804 = var78;
                            var72 = null;
                            break;
                        }
                    }
                    if (var72 != null && field1170 < 400) {
                        class66 var83 = new class66();
                        field1172[field1170] = var83;
                        var83.field805 = var72;
                        var83.field800 = var73;
                        var83.field801 = var74;
                        var83.field802 = var75;
                        var83.field803 = var77;
                        var83.field804 = var78;
                        field1170++;
                    }
                }
                field1171 = 2;
                field1143 = field1090;
                boolean var84 = false;
                int var85 = field1170;
                while (var85 > 0) {
                    boolean var86 = true;
                    var85--;
                    for (int var87 = 0; var87 < var85; var87++) {
                        boolean var88 = false;
                        class66 var89 = field1172[var87];
                        class66 var90 = field1172[var87 + 1];
                        if (field915 != var89.field801 && field915 == var90.field801) {
                            var88 = true;
                        }
                        if (!var88 && var89.field801 == 0 && var90.field801 != 0) {
                            var88 = true;
                        }
                        if (!var88 && !var89.field803 && var90.field803) {
                            var88 = true;
                        }
                        if (!var88 && !var89.field804 && var90.field804) {
                            var88 = true;
                        }
                        if (var88) {
                            class66 var91 = field1172[var87];
                            field1172[var87] = field1172[var87 + 1];
                            field1172[var87 + 1] = var91;
                            var86 = false;
                        }
                    }
                    if (var86) {
                        break;
                    }
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 143) {
                int var92 = field1168.method2894();
                int var93 = field1168.method2987();
                int var94 = field1168.method2888();
                class69 var95 = (class69) field1066.method3251((long) var93);
                if (var95 != null) {
                    method930(var95, var95.field825 != var92);
                }
                method46(var93, var92, var94);
                field1002 = -1;
                return true;
            }
            if (field1002 == 219) {
                int var96 = field1168.method2848();
                int var97 = field1168.method2905();
                class217 var98 = class217.method3861(var97);
                if (var98.field2665 != var96 || var96 == -1) {
                    var98.field2665 = var96;
                    var98.field2740 = 0;
                    var98.field2677 = 0;
                    method148(var98);
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 73) {
                String var99 = field1168.method2867();
                class180 var100 = field1168;
                String var101 = class266.method228(var100, 32767);
                String var102 = class265.method4330(class271.method3577(var101));
                class99.method1574(6, var99, var102);
                field1002 = -1;
                return true;
            }
            if (field1002 == 96) {
                String var103 = field1168.method2867();
                Object[] var104 = new Object[var103.length() + 1];
                for (int var105 = var103.length() - 1; var105 >= 0; var105--) {
                    if (var103.charAt(var105) == 's') {
                        var104[var105 + 1] = field1168.method2867();
                    } else {
                        var104[var105 + 1] = Integer.valueOf(field1168.method2987());
                    }
                }
                var104[0] = Integer.valueOf(field1168.method2987());
                class70 var106 = new class70();
                var106.field832 = var104;
                class84.method963(var106);
                field1002 = -1;
                return true;
            }
            if (field1002 == 166) {
                method603();
                field1002 = -1;
                return false;
            }
            if (field1002 == 248) {
                int var107 = field1168.method2861();
                class64 var108 = (class64) class64.field775.method3251((long) var107);
                if (var108 != null) {
                    var108.method3287();
                }
                field1093[++field1146 - 1 & 0x1F] = var107 & 0x7FFF;
                field1002 = -1;
                return true;
            }
            if (field1002 == 159) {
                method131();
                field1096 = field1168.method3061();
                field1099 = field1090;
                field1002 = -1;
                return true;
            }
            if (field1002 == 24) {
                class281.method36(field1168, field926);
                field1002 = -1;
                return true;
            }
            if (field1002 == 203) {
                class97.method533();
                for (int var109 = 0; var109 < 2048; var109++) {
                    field1070[var109] = null;
                }
                class97.method4595(field1168);
                field1002 = -1;
                return true;
            }
            if (field1002 == 72) {
                field1171 = 1;
                field1143 = field1090;
                field1002 = -1;
                return true;
            }
            if (field1002 == 70) {
                method131();
                field1145 = field1168.method2843();
                field1099 = field1090;
                field1002 = -1;
                return true;
            }
            if (field1002 == 19) {
                method2220(true);
                field1168.method3097();
                int var110 = field1168.method2861();
                Statics.method2597(field1168, var110);
                field1002 = -1;
                return true;
            }
            if (field1002 == 202) {
                method3694(true);
                field1002 = -1;
                return true;
            }
            if (field1002 == 22) {
                field1009 = false;
                for (int var111 = 0; var111 < 5; var111++) {
                    field960[var111] = false;
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 81) {
                field1009 = true;
                Statics.field259 = field1168.method2843();
                Statics.field1482 = field1168.method2843();
                Statics.field2381 = field1168.method2861();
                Statics.field3660 = field1168.method2843();
                Statics.field334 = field1168.method2843();
                if (Statics.field334 >= 100) {
                    int var112 = Statics.field259 * 128 + 64;
                    int var113 = Statics.field1482 * 128 + 64;
                    int var114 = method161(var112, var113, Statics.field251) - Statics.field2381;
                    int var115 = var112 - Statics.field871;
                    int var116 = var114 - Statics.field826;
                    int var117 = var113 - Statics.field987;
                    int var118 = (int) Math.sqrt((double) (var115 * var115 + var117 * var117));
                    Statics.field252 = (int) (Math.atan2((double) var116, (double) var118) * 325.949D) & 0x7FF;
                    Statics.field3209 = (int) (Math.atan2((double) var115, (double) var117) * -325.949D) & 0x7FF;
                    if (Statics.field252 < 128) {
                        Statics.field252 = 128;
                    }
                    if (Statics.field252 > 383) {
                        Statics.field252 = 383;
                    }
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 199) {
                int var119 = field1168.method2894();
                int var120 = field1168.method2906();
                class217 var121 = class217.method3861(var120);
                if (var121.field2661 != 1 || var121.field2725 != var119) {
                    var121.field2661 = 1;
                    var121.field2725 = var119;
                    method148(var121);
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 117) {
                boolean var122 = field1168.method2843() == 1;
                if (var122) {
                    Statics.field281 = class176.method2679() - field1168.method2865();
                    Statics.field3252 = new class14(field1168, true);
                } else {
                    Statics.field3252 = null;
                }
                field1101 = field1090;
                field1002 = -1;
                return true;
            }
            if (field1002 == 79) {
                int var123 = field1168.method2906();
                int var124 = field1168.method3061();
                int var125 = field1168.method2898();
                class217 var126 = class217.method3861(var123);
                if (var126.field2672 != var125 || var126.field2628 != var124 || var126.field2715 != 0 || var126.field2624 != 0) {
                    var126.field2672 = var125;
                    var126.field2628 = var124;
                    var126.field2715 = 0;
                    var126.field2624 = 0;
                    method148(var126);
                    this.method1143(var126);
                    if (var126.field2620 == 0) {
                        method1353(Statics.field2616[var123 >> 16], var126, false);
                    }
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 206) {
                int var127 = field1168.method3049();
                int var128 = field1168.method2905();
                class69 var129 = (class69) field1066.method3251((long) var128);
                class69 var130 = (class69) field1066.method3251((long) var127);
                if (var130 != null) {
                    method930(var130, var129 == null || var129.field825 != var130.field825);
                }
                if (var129 != null) {
                    var129.method3287();
                    field1066.method3239(var129, (long) var127);
                }
                class217 var131 = class217.method3861(var128);
                if (var131 != null) {
                    method148(var131);
                }
                class217 var132 = class217.method3861(var127);
                if (var132 != null) {
                    method148(var132);
                    method1353(Statics.field2616[var132.field2683 >>> 16], var132, true);
                }
                if (field940 != -1) {
                    method3558(field940, 1);
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 102) {
                field938 = field1090;
                if (field926 == 0) {
                    field1130 = null;
                    field1131 = null;
                    Statics.field3260 = 0;
                    Statics.field632 = null;
                    field1002 = -1;
                    return true;
                }
                field1131 = field1168.method2867();
                long var133 = field1168.method2865();
                field1130 = class269.method3560(var133);
                Statics.field373 = field1168.method3014();
                int var135 = field1168.method2843();
                if (var135 == 255) {
                    field1002 = -1;
                    return true;
                }
                Statics.field3260 = var135;
                class76[] var136 = new class76[100];
                for (int var137 = 0; var137 < Statics.field3260; var137++) {
                    var136[var137] = new class76();
                    var136[var137].field906 = field1168.method2867();
                    var136[var137].field907 = class268.method3629(var136[var137].field906, Statics.field332);
                    var136[var137].field908 = field1168.method2861();
                    var136[var137].field913 = field1168.method3014();
                    field1168.method2867();
                    if (var136[var137].field906.equals(Statics.field3110.field884)) {
                        Statics.field1279 = var136[var137].field913;
                    }
                }
                boolean var138 = false;
                int var139 = Statics.field3260;
                while (var139 > 0) {
                    boolean var140 = true;
                    var139--;
                    for (int var141 = 0; var141 < var139; var141++) {
                        if (var136[var141].field907.compareTo(var136[var141 + 1].field907) > 0) {
                            class76 var142 = var136[var141];
                            var136[var141] = var136[var141 + 1];
                            var136[var141 + 1] = var142;
                            var140 = false;
                        }
                    }
                    if (var140) {
                        break;
                    }
                }
                Statics.field632 = var136;
                field1002 = -1;
                return true;
            }
            if (field1002 == 241) {
                method131();
                int var143 = field1168.method2843();
                int var144 = field1168.method2906();
                int var145 = field1168.method2888();
                field1041[var143] = var144;
                field1120[var143] = var145;
                field945[var143] = 1;
                for (int var146 = 0; var146 < 98; var146++) {
                    if (var144 >= class223.field2818[var146]) {
                        field945[var143] = var146 + 2;
                    }
                }
                field1095[++field944 - 1 & 0x1F] = var143;
                field1002 = -1;
                return true;
            }
            if (field1002 == 201) {
                Statics.field1294 = field1168.method2888();
                Statics.field2194 = field1168.method2886();
                field1002 = -1;
                return true;
            }
            if (field1002 == 139) {
                int var147 = field1168.method2905();
                int var148 = field1168.method2896();
                class217 var149 = class217.method3861(var147);
                if (var149.field2661 != 2 || var149.field2725 != var148) {
                    var149.field2661 = 2;
                    var149.field2725 = var148;
                    method148(var149);
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 192) {
                field1139 = field1168.method2843();
                field1002 = -1;
                return true;
            }
            if (field1002 == 239 || field1002 == 23 || field1002 == 217 || field1002 == 234 || field1002 == 183 || field1002 == 240 || field1002 == 153 || field1002 == 76 || field1002 == 45 || field1002 == 157) {
                method972();
                field1002 = -1;
                return true;
            }
            if (field1002 == 225) {
                String var150 = field1168.method2867();
                int var151 = field1168.method2861();
                byte var152 = field1168.method3014();
                boolean var153 = false;
                if (var152 == -128) {
                    var153 = true;
                }
                if (var153) {
                    if (Statics.field3260 == 0) {
                        field1002 = -1;
                        return true;
                    }
                    boolean var154 = false;
                    int var155;
                    for (var155 = 0; var155 < Statics.field3260 && (!Statics.field632[var155].field906.equals(var150) || Statics.field632[var155].field908 != var151); var155++) {
                    }
                    if (var155 < Statics.field3260) {
                        while (var155 < Statics.field3260 - 1) {
                            Statics.field632[var155] = Statics.field632[var155 + 1];
                            var155++;
                        }
                        Statics.field3260--;
                        Statics.field632[Statics.field3260] = null;
                    }
                } else {
                    field1168.method2867();
                    class76 var156 = new class76();
                    var156.field906 = var150;
                    var156.field907 = class268.method3629(var156.field906, Statics.field332);
                    var156.field908 = var151;
                    var156.field913 = var152;
                    int var157;
                    for (var157 = Statics.field3260 - 1; var157 >= 0; var157--) {
                        int var158 = Statics.field632[var157].field907.compareTo(var156.field907);
                        if (var158 == 0) {
                            Statics.field632[var157].field908 = var151;
                            Statics.field632[var157].field913 = var152;
                            if (var150.equals(Statics.field3110.field884)) {
                                Statics.field1279 = var152;
                            }
                            field938 = field1090;
                            field1002 = -1;
                            return true;
                        }
                        if (var158 < 0) {
                            break;
                        }
                    }
                    if (Statics.field3260 >= Statics.field632.length) {
                        field1002 = -1;
                        return true;
                    }
                    for (int var159 = Statics.field3260 - 1; var159 > var157; var159--) {
                        Statics.field632[var159 + 1] = Statics.field632[var159];
                    }
                    if (Statics.field3260 == 0) {
                        Statics.field632 = new class76[100];
                    }
                    Statics.field632[var157 + 1] = var156;
                    Statics.field3260++;
                    if (var150.equals(Statics.field3110.field884)) {
                        Statics.field1279 = var152;
                    }
                }
                field938 = field1090;
                field1002 = -1;
                return true;
            }
            if (field1002 == 249) {
                String var160 = field1168.method2867();
                Statics.field431 = var160;
                try {
                    String var161 = Statics.field1353.getParameter(class275.field3709.field3713);
                    String var162 = Statics.field1353.getParameter(class275.field3711.field3713);
                    String var163 = var161 + "settings=" + var160 + "; version=1; path=/; domain=" + var162;
                    String var164;
                    if (var160.length() == 0) {
                        var164 = var163 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var164 = var163 + "; Expires=" + class183.method1888(class176.method2679() + 94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    client var165 = Statics.field1353;
                    String var166 = "document.cookie=\"" + var164 + "\"";
                    JSObject.getWindow(var165).eval(var166);
                } catch (Throwable var278) {
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 68) {
                Statics.method2597(field1168, field926);
                field1002 = -1;
                return true;
            }
            if (field1002 == 101) {
                int var168 = field1168.method2896();
                if (var168 == 65535) {
                    var168 = -1;
                }
                method199(var168);
                field1002 = -1;
                return true;
            }
            if (field1002 == 18) {
                int var169 = field1168.method2895();
                if (var169 == 65535) {
                    var169 = -1;
                }
                int var170 = field1168.method2900();
                method4(var169, var170);
                field1002 = -1;
                return true;
            }
            if (field1002 == 148) {
                int var171 = field1168.method2987();
                int var172 = field1168.method2861();
                if (var171 < -70000) {
                    var172 += 32768;
                }
                class217 var173;
                if (var171 >= 0) {
                    var173 = class217.method3861(var171);
                } else {
                    var173 = null;
                }
                while (field1168.field2357 < field926) {
                    int var174 = field1168.method3016();
                    int var175 = field1168.method2861();
                    int var176 = 0;
                    if (var175 != 0) {
                        var176 = field1168.method2843();
                        if (var176 == 255) {
                            var176 = field1168.method2987();
                        }
                    }
                    if (var173 != null && var174 >= 0 && var174 < var173.field2736.length) {
                        var173.field2736[var174] = var175;
                        var173.field2737[var174] = var176;
                    }
                    class64.method3696(var172, var174, var175 - 1, var176);
                }
                if (var173 != null) {
                    method148(var173);
                }
                method131();
                field1093[++field1146 - 1 & 0x1F] = var172 & 0x7FFF;
                field1002 = -1;
                return true;
            }
            if (field1002 == 178) {
                int var177 = field1168.method2895();
                int var178 = field1168.method2905();
                int var179 = var177 >> 10 & 0x1F;
                int var180 = var177 >> 5 & 0x1F;
                int var181 = var177 & 0x1F;
                int var182 = (var181 << 3) + (var179 << 19) + (var180 << 11);
                class217 var183 = class217.method3861(var178);
                if (var183.field2607 != var182) {
                    var183.field2607 = var182;
                    method148(var183);
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 58) {
                int var184 = field1168.method2843();
                int var185 = field1168.method2843();
                int var186 = field1168.method2843();
                int var187 = field1168.method2843();
                field960[var184] = true;
                field1153[var184] = var185;
                field1154[var184] = var186;
                field1094[var184] = var187;
                field1156[var184] = 0;
                field1002 = -1;
                return true;
            }
            if (field1002 == 21) {
                int var188 = field1168.method2861();
                byte var189 = field1168.method3014();
                class212.field2575[var188] = var189;
                if (class212.field2573[var188] != var189) {
                    class212.field2573[var188] = var189;
                }
                method2774(var188);
                field1091[++field1092 - 1 & 0x1F] = var188;
                field1002 = -1;
                return true;
            }
            if (field1002 == 44) {
                int var190 = field1168.method2987();
                int var191 = field1168.method2861();
                if (var190 < -70000) {
                    var191 += 32768;
                }
                class217 var192;
                if (var190 >= 0) {
                    var192 = class217.method3861(var190);
                } else {
                    var192 = null;
                }
                if (var192 != null) {
                    for (int var193 = 0; var193 < var192.field2736.length; var193++) {
                        var192.field2736[var193] = 0;
                        var192.field2737[var193] = 0;
                    }
                }
                class64 var194 = (class64) class64.field775.method3251((long) var191);
                if (var194 != null) {
                    for (int var195 = 0; var195 < var194.field780.length; var195++) {
                        var194.field780[var195] = -1;
                        var194.field776[var195] = 0;
                    }
                }
                int var196 = field1168.method2861();
                for (int var197 = 0; var197 < var196; var197++) {
                    int var198 = field1168.method2888();
                    if (var198 == 255) {
                        var198 = field1168.method2987();
                    }
                    int var199 = field1168.method2861();
                    if (var192 != null && var197 < var192.field2736.length) {
                        var192.field2736[var197] = var199;
                        var192.field2737[var197] = var198;
                    }
                    class64.method3696(var191, var197, var199 - 1, var198);
                }
                if (var192 != null) {
                    method148(var192);
                }
                method131();
                field1093[++field1146 - 1 & 0x1F] = var191 & 0x7FFF;
                field1002 = -1;
                return true;
            }
            if (field1002 == 113) {
                field1071 = field1168.method2895() * 30;
                field1099 = field1090;
                field1002 = -1;
                return true;
            }
            if (field1002 == 20) {
                for (int var200 = 0; var200 < Statics.field2606; var200++) {
                    class242 var201 = class242.method1566(var200);
                    if (var201 != null) {
                        class212.field2575[var200] = 0;
                        class212.field2573[var200] = 0;
                    }
                }
                method131();
                field1092 += 32;
                field1002 = -1;
                return true;
            }
            if (field1002 == 2) {
                field1017 = field1168.method2843();
                if (field1017 == 255) {
                    field1017 = 0;
                }
                field1138 = field1168.method2843();
                if (field1138 == 255) {
                    field1138 = 0;
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 172) {
                String var202 = field1168.method2867();
                long var203 = (long) field1168.method2861();
                long var205 = (long) field1168.method2994();
                class231 var207 = (class231) class169.method454(class231.method4044(), field1168.method2843());
                long var208 = (var203 << 32) + var205;
                boolean var210 = false;
                for (int var211 = 0; var211 < 100; var211++) {
                    if (field1124[var211] == var208) {
                        var210 = true;
                        break;
                    }
                }
                if (method645(var202)) {
                    var210 = true;
                }
                if (!var210 && field1024 == 0) {
                    field1124[field1115] = var208;
                    field1115 = (field1115 + 1) % 100;
                    class180 var212 = field1168;
                    String var213 = class266.method228(var212, 32767);
                    String var214 = class265.method4330(class271.method3577(var213));
                    byte var215;
                    if (var207.field3148) {
                        var215 = 7;
                    } else {
                        var215 = 3;
                    }
                    if (var207.field3147 == -1) {
                        class99.method1574(var215, var202, var214);
                    } else {
                        int var217 = var207.field3147;
                        String var218 = "<img=" + var217 + ">";
                        class99.method1574(var215, var218 + var202, var214);
                    }
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 64) {
                field993 = field1168.method2843();
                if (field993 == 1) {
                    field934 = field1168.method2861();
                }
                if (field993 >= 2 && field993 <= 6) {
                    if (field993 == 2) {
                        field939 = 64;
                        field1118 = 64;
                    }
                    if (field993 == 3) {
                        field939 = 0;
                        field1118 = 64;
                    }
                    if (field993 == 4) {
                        field939 = 128;
                        field1118 = 64;
                    }
                    if (field993 == 5) {
                        field939 = 64;
                        field1118 = 0;
                    }
                    if (field993 == 6) {
                        field939 = 64;
                        field1118 = 128;
                    }
                    field993 = 2;
                    field1044 = field1168.method2861();
                    field937 = field1168.method2861();
                    field961 = field1168.method2843();
                }
                if (field993 == 10) {
                    field1151 = field1168.method2861();
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 6) {
                Statics.field1294 = field1168.method2843();
                Statics.field2194 = field1168.method3044();
                while (field1168.field2357 < field926) {
                    field1002 = field1168.method2843();
                    method972();
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 125) {
                int var219 = field1168.method2888();
                int var220 = field1168.method3044();
                String var221 = field1168.method2867();
                if (var220 >= 1 && var220 <= 8) {
                    if (var221.equalsIgnoreCase("null")) {
                        var221 = null;
                    }
                    field1031[var220 - 1] = var221;
                    field1032[var220 - 1] = var219 == 0;
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 158) {
                int var222 = field1168.method2906();
                int var223 = field1168.method2861();
                int var224 = field1168.method2896();
                class217 var225 = class217.method3861(var222);
                var225.field2674 = (var224 << 16) + var223;
                field1002 = -1;
                return true;
            }
            if (field1002 == 84) {
                for (int var226 = 0; var226 < class212.field2573.length; var226++) {
                    if (class212.field2575[var226] != class212.field2573[var226]) {
                        class212.field2573[var226] = class212.field2575[var226];
                        method2774(var226);
                        field1091[++field1092 - 1 & 0x1F] = var226;
                    }
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 168) {
                int var227 = field1168.method3049();
                class217 var228 = class217.method3861(var227);
                for (int var229 = 0; var229 < var228.field2736.length; var229++) {
                    var228.field2736[var229] = -1;
                    var228.field2736[var229] = 0;
                }
                method148(var228);
                field1002 = -1;
                return true;
            }
            if (field1002 == 195) {
                int var230 = field1168.method2894();
                int var231 = field1168.method2894();
                int var232 = field1168.method2895();
                int var233 = field1168.method2906();
                class217 var234 = class217.method3861(var233);
                if (var234.field2712 != var230 || var234.field2670 != var231 || var234.field2623 != var232) {
                    var234.field2712 = var230;
                    var234.field2670 = var231;
                    var234.field2623 = var232;
                    method148(var234);
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 211) {
                for (int var235 = 0; var235 < field1070.length; var235++) {
                    if (field1070[var235] != null) {
                        field1070[var235].field1242 = -1;
                    }
                }
                for (int var236 = 0; var236 < field1050.length; var236++) {
                    if (field1050[var236] != null) {
                        field1050[var236].field1242 = -1;
                    }
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 162) {
                int var237 = field1168.method2894();
                field940 = var237;
                this.method1053(false);
                method528(var237);
                Statics.method2680(field940);
                for (int var238 = 0; var238 < 100; var238++) {
                    field1110[var238] = true;
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 123) {
                field1168.field2357 += 28;
                if (field1168.method2882()) {
                    class180 var239 = field1168;
                    int var240 = field1168.field2357 - 28;
                    byte[] var241 = var239.field2355;
                    if (field952 == null) {
                        field952 = new byte[24];
                    }
                    class184.method3142(var241, var240, field952, 0, 24);
                    class156.method132(var239, var240);
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 107) {
                int var242 = field1168.method2861();
                int var243 = field1168.method2843();
                int var244 = field1168.method2861();
                method2606(var242, var243, var244);
                field1002 = -1;
                return true;
            }
            if (field1002 == 161) {
                int var245 = field1168.method2987();
                int var246 = field1168.method2987();
                int var247 = 0;
                if (Statics.field316 == null || !Statics.field316.isValid()) {
                    try {
                        Iterator var248 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var248.hasNext()) {
                            GarbageCollectorMXBean var249 = (GarbageCollectorMXBean) var248.next();
                            if (var249.isValid()) {
                                Statics.field316 = var249;
                                field719 = -1L;
                                field718 = -1L;
                            }
                        }
                    } catch (Throwable var279) {
                    }
                }
                if (Statics.field316 != null) {
                    long var251 = class176.method2679();
                    long var253 = Statics.field316.getCollectionTime();
                    if (field718 != -1L) {
                        long var255 = var253 - field718;
                        long var257 = var251 - field719;
                        if (var257 != 0L) {
                            var247 = (int) (var255 * 100L / var257);
                        }
                    }
                    field718 = var253;
                    field719 = var251;
                }
                field958.method3096(160);
                field958.method2884(field696);
                field958.method2931(var245);
                field958.method2903(var246);
                field958.method2922(var247);
                field1002 = -1;
                return true;
            }
            if (field1002 == 242) {
                int var261 = field1168.method2905();
                class217 var262 = class217.method3861(var261);
                var262.field2661 = 3;
                var262.field2725 = Statics.field3110.field888.method3612();
                method148(var262);
                field1002 = -1;
                return true;
            }
            if (field1002 == 90) {
                int var263 = field1168.method3049();
                int var264 = field1168.method2896();
                class217 var265 = class217.method3861(var263);
                if (var265 != null && var265.field2620 == 0) {
                    if (var264 > var265.field2733 - var265.field2634) {
                        var264 = var265.field2733 - var265.field2634;
                    }
                    if (var264 < 0) {
                        var264 = 0;
                    }
                    if (var265.field2627 != var264) {
                        var265.field2627 = var264;
                        method148(var265);
                    }
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 54) {
                int var266 = field1168.method2905();
                int var267 = field1168.method2895();
                if (var267 == 65535) {
                    var267 = -1;
                }
                int var268 = field1168.method2861();
                if (var268 == 65535) {
                    var268 = -1;
                }
                int var269 = field1168.method2905();
                for (int var270 = var267; var270 <= var268; var270++) {
                    long var271 = ((long) var266 << 32) + (long) var270;
                    class193 var273 = field1107.method3251(var271);
                    if (var273 != null) {
                        var273.method3287();
                    }
                    field1107.method3239(new class199(var269), var271);
                }
                field1002 = -1;
                return true;
            }
            if (field1002 == 46) {
                if (field940 != -1) {
                    method3558(field940, 0);
                }
                field1002 = -1;
                return true;
            }
            class153.method463("" + field1002 + class89.field1370 + field1060 + class89.field1370 + field967 + class89.field1370 + field926, (Throwable) null);
            method603();
        } catch (IOException var280) {
            if (field968 > 0) {
                method603();
            } else {
                method2630(40);
                Statics.field681 = Statics.field273;
                Statics.field273 = null;
            }
        } catch (Exception var281) {
            String var276 = "" + field1002 + class89.field1370 + field1060 + class89.field1370 + field967 + class89.field1370 + field926 + class89.field1370 + (Statics.field329 + Statics.field3110.field1210[0]) + class89.field1370 + (Statics.field2282 + Statics.field3110.field1264[0]) + class89.field1370;
            for (int var277 = 0; var277 < field926 && var277 < 50; var277++) {
                var276 = var276 + field1168.field2355[var277] + class89.field1370;
            }
            class153.method463(var276, var281);
            method603();
        }
        return true;
    }

    @ObfuscatedName("bv.gb(B)V")
    public static final void method972() {
        if (field1002 == 45) {
            int var0 = field1168.method2843();
            int var1 = var0 >> 2;
            int var2 = var0 & 0x3;
            int var3 = field979[var1];
            int var4 = field1168.method3044();
            int var5 = (var4 >> 4 & 0x7) + Statics.field1294;
            int var6 = (var4 & 0x7) + Statics.field2194;
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                method1157(Statics.field251, var5, var6, var3, -1, var1, var2, 0, -1);
            }
        } else if (field1002 == 23) {
            int var7 = field1168.method2843();
            int var8 = (var7 >> 4 & 0x7) + Statics.field1294;
            int var9 = (var7 & 0x7) + Statics.field2194;
            int var10 = field1168.method2861();
            int var11 = field1168.method2861();
            int var12 = field1168.method2861();
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                class194 var13 = field1035[Statics.field251][var8][var9];
                if (var13 != null) {
                    for (class95 var14 = (class95) var13.method3296(); var14 != null; var14 = (class95) var13.method3298()) {
                        if ((var10 & 0x7FFF) == var14.field1460 && var14.field1461 == var11) {
                            var14.field1461 = var12;
                            break;
                        }
                    }
                    method1671(var8, var9);
                }
            }
        } else if (field1002 == 157) {
            int var15 = field1168.method2861();
            int var16 = field1168.method2888();
            int var17 = var16 >> 2;
            int var18 = var16 & 0x3;
            int var19 = field979[var17];
            int var20 = field1168.method3044();
            int var21 = (var20 >> 4 & 0x7) + Statics.field1294;
            int var22 = (var20 & 0x7) + Statics.field2194;
            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                method1157(Statics.field251, var21, var22, var19, var15, var17, var18, 0, -1);
            }
        } else if (field1002 == 76) {
            int var23 = field1168.method2888();
            int var24 = var23 >> 2;
            int var25 = var23 & 0x3;
            int var26 = field979[var24];
            int var27 = field1168.method2896();
            int var28 = field1168.method2843();
            int var29 = (var28 >> 4 & 0x7) + Statics.field1294;
            int var30 = (var28 & 0x7) + Statics.field2194;
            if (var29 >= 0 && var30 >= 0 && var29 < 103 && var30 < 103) {
                if (var26 == 0) {
                    class143 var31 = Statics.field315.method2446(Statics.field251, var29, var30);
                    if (var31 != null) {
                        int var32 = var31.field2093 >> 14 & 0x7FFF;
                        if (var24 == 2) {
                            var31.field2091 = new class101(var32, 2, var25 + 4, Statics.field251, var29, var30, var27, false, var31.field2091);
                            var31.field2092 = new class101(var32, 2, var25 + 1 & 0x3, Statics.field251, var29, var30, var27, false, var31.field2092);
                        } else {
                            var31.field2091 = new class101(var32, var24, var25, Statics.field251, var29, var30, var27, false, var31.field2091);
                        }
                    }
                }
                if (var26 == 1) {
                    class148 var33 = Statics.field315.method2447(Statics.field251, var29, var30);
                    if (var33 != null) {
                        int var34 = var33.field2133 >> 14 & 0x7FFF;
                        if (var24 == 4 || var24 == 5) {
                            var33.field2131 = new class101(var34, 4, var25, Statics.field251, var29, var30, var27, false, var33.field2131);
                        } else if (var24 == 6) {
                            var33.field2131 = new class101(var34, 4, var25 + 4, Statics.field251, var29, var30, var27, false, var33.field2131);
                        } else if (var24 == 7) {
                            var33.field2131 = new class101(var34, 4, (var25 + 2 & 0x3) + 4, Statics.field251, var29, var30, var27, false, var33.field2131);
                        } else if (var24 == 8) {
                            var33.field2131 = new class101(var34, 4, var25 + 4, Statics.field251, var29, var30, var27, false, var33.field2131);
                            var33.field2132 = new class101(var34, 4, (var25 + 2 & 0x3) + 4, Statics.field251, var29, var30, var27, false, var33.field2132);
                        }
                    }
                }
                if (var26 == 2) {
                    class149 var35 = Statics.field315.method2448(Statics.field251, var29, var30);
                    if (var24 == 11) {
                        var24 = 10;
                    }
                    if (var35 != null) {
                        var35.field2140 = new class101(var35.field2152 >> 14 & 0x7FFF, var24, var25, Statics.field251, var29, var30, var27, false, var35.field2140);
                    }
                }
                if (var26 == 3) {
                    class130 var36 = Statics.field315.method2425(Statics.field251, var29, var30);
                    if (var36 != null) {
                        var36.field1824 = new class101(var36.field1825 >> 14 & 0x7FFF, 22, var25, Statics.field251, var29, var30, var27, false, var36.field1824);
                    }
                }
            }
        } else if (field1002 == 240) {
            int var37 = field1168.method2843();
            int var38 = (var37 >> 4 & 0x7) + Statics.field1294;
            int var39 = (var37 & 0x7) + Statics.field2194;
            int var40 = field1168.method2896();
            if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                class194 var41 = field1035[Statics.field251][var38][var39];
                if (var41 != null) {
                    for (class95 var42 = (class95) var41.method3296(); var42 != null; var42 = (class95) var41.method3298()) {
                        if ((var40 & 0x7FFF) == var42.field1460) {
                            var42.method3287();
                            break;
                        }
                    }
                    if (var41.method3296() == null) {
                        field1035[Statics.field251][var38][var39] = null;
                    }
                    method1671(var38, var39);
                }
            }
        } else {
            if (field1002 == 239) {
                int var43 = field1168.method2843();
                int var44 = (var43 >> 4 & 0x7) + Statics.field1294;
                int var45 = (var43 & 0x7) + Statics.field2194;
                int var46 = field1168.method2861();
                int var47 = field1168.method2843();
                int var48 = var47 >> 4 & 0xF;
                int var49 = var47 & 0x7;
                int var50 = field1168.method2843();
                if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                    int var51 = var48 + 1;
                    if (Statics.field3110.field1210[0] >= var44 - var51 && Statics.field3110.field1210[0] <= var44 + var51 && Statics.field3110.field1264[0] >= var45 - var51 && Statics.field3110.field1264[0] <= var45 + var51 && field1036 != 0 && var49 > 0 && field936 < 50) {
                        field1082[field936] = var46;
                        field1152[field936] = var49;
                        field1011[field936] = var50;
                        field1150[field936] = null;
                        field1149[field936] = (var44 << 16) + (var45 << 8) + var48;
                        field936++;
                    }
                }
            }
            if (field1002 == 234) {
                int var52 = field1168.method2843();
                int var53 = (var52 >> 4 & 0x7) + Statics.field1294;
                int var54 = (var52 & 0x7) + Statics.field2194;
                int var55 = field1168.method2861();
                int var56 = field1168.method2843();
                int var57 = field1168.method2861();
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                    int var58 = var53 * 128 + 64;
                    int var59 = var54 * 128 + 64;
                    class85 var60 = new class85(var55, Statics.field251, var58, var59, method161(var58, var59, Statics.field251) - var56, var57, field929);
                    field1038.method3290(var60);
                }
            } else {
                if (field1002 == 217) {
                    int var61 = field1168.method2861();
                    byte var62 = field1168.method3062();
                    byte var63 = field1168.method3062();
                    int var64 = field1168.method2894();
                    int var65 = field1168.method2886();
                    int var66 = var65 >> 2;
                    int var67 = var65 & 0x3;
                    int var68 = field979[var66];
                    byte var69 = field1168.method2951();
                    int var70 = field1168.method2861();
                    int var71 = field1168.method2896();
                    byte var72 = field1168.method3014();
                    int var73 = field1168.method2843();
                    int var74 = (var73 >> 4 & 0x7) + Statics.field1294;
                    int var75 = (var73 & 0x7) + Statics.field2194;
                    class75 var76;
                    if (field1026 == var71) {
                        var76 = Statics.field3110;
                    } else {
                        var76 = field1070[var71];
                    }
                    if (var76 != null) {
                        class256 var77 = class256.method2825(var64);
                        int var78;
                        int var79;
                        if (var67 == 1 || var67 == 3) {
                            var78 = var77.field3425;
                            var79 = var77.field3426;
                        } else {
                            var78 = var77.field3426;
                            var79 = var77.field3425;
                        }
                        int var80 = (var78 >> 1) + var74;
                        int var81 = (var78 + 1 >> 1) + var74;
                        int var82 = (var79 >> 1) + var75;
                        int var83 = (var79 + 1 >> 1) + var75;
                        int[][] var84 = class62.field763[Statics.field251];
                        int var85 = var84[var80][var82] + var84[var81][var82] + var84[var80][var83] + var84[var81][var83] >> 2;
                        int var86 = (var74 << 7) + (var78 << 6);
                        int var87 = (var75 << 7) + (var79 << 6);
                        class134 var88 = var77.method4098(var66, var67, var84, var86, var85, var87);
                        if (var88 != null) {
                            method1157(Statics.field251, var74, var75, var68, -1, 0, 0, var61 + 1, var70 + 1);
                            var76.field905 = field929 + var61;
                            var76.field876 = field929 + var70;
                            var76.field889 = var88;
                            var76.field886 = var74 * 128 + var78 * 64;
                            var76.field877 = var75 * 128 + var79 * 64;
                            var76.field887 = var85;
                            if (var62 > var69) {
                                byte var89 = var62;
                                var62 = var69;
                                var69 = var89;
                            }
                            if (var72 > var63) {
                                byte var90 = var72;
                                var72 = var63;
                                var63 = var90;
                            }
                            var76.field890 = var62 + var74;
                            var76.field892 = var69 + var74;
                            var76.field891 = var72 + var75;
                            var76.field893 = var63 + var75;
                        }
                    }
                }
                if (field1002 == 183) {
                    int var91 = field1168.method2843();
                    int var92 = (var91 >> 4 & 0x7) + Statics.field1294;
                    int var93 = (var91 & 0x7) + Statics.field2194;
                    int var94 = var92 + field1168.method3014();
                    int var95 = var93 + field1168.method3014();
                    int var96 = field1168.method3061();
                    int var97 = field1168.method2861();
                    int var98 = field1168.method2843() * 4;
                    int var99 = field1168.method2843() * 4;
                    int var100 = field1168.method2861();
                    int var101 = field1168.method2861();
                    int var102 = field1168.method2843();
                    int var103 = field1168.method2843();
                    if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104 && var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104 && var97 != 65535) {
                        int var104 = var92 * 128 + 64;
                        int var105 = var93 * 128 + 64;
                        int var106 = var94 * 128 + 64;
                        int var107 = var95 * 128 + 64;
                        class94 var108 = new class94(var97, Statics.field251, var104, var105, method161(var104, var105, Statics.field251) - var98, field929 + var100, field929 + var101, var102, var103, var96, var99);
                        var108.method1567(var106, var107, method161(var106, var107, Statics.field251) - var99, field929 + var100);
                        field1037.method3290(var108);
                    }
                } else if (field1002 == 153) {
                    int var109 = field1168.method2861();
                    int var110 = field1168.method2894();
                    int var111 = field1168.method2843();
                    int var112 = (var111 >> 4 & 0x7) + Statics.field1294;
                    int var113 = (var111 & 0x7) + Statics.field2194;
                    if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                        class95 var114 = new class95();
                        var114.field1460 = var110;
                        var114.field1461 = var109;
                        if (field1035[Statics.field251][var112][var113] == null) {
                            field1035[Statics.field251][var112][var113] = new class194();
                        }
                        field1035[Statics.field251][var112][var113].method3290(var114);
                        method1671(var112, var113);
                    }
                }
            }
        }
    }

    @ObfuscatedName("client.gj(IIIIIIIIII)V")
    public static final void method1157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) field1177.method3296(); var10 != null; var10 = (class77) field1177.method3298()) {
            if (var10.field1185 == arg0 && var10.field1187 == arg1 && var10.field1188 == arg2 && var10.field1186 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1185 = arg0;
            var9.field1186 = arg3;
            var9.field1187 = arg1;
            var9.field1188 = arg2;
            method9(var9);
            field1177.method3290(var9);
        }
        var9.field1192 = arg4;
        var9.field1189 = arg5;
        var9.field1193 = arg6;
        var9.field1195 = arg7;
        var9.field1194 = arg8;
    }

    @ObfuscatedName("ae.gq(I)V")
    public static final void method479() {
        for (class77 var0 = (class77) field1177.method3296(); var0 != null; var0 = (class77) field1177.method3298()) {
            if (var0.field1194 == -1) {
                var0.field1195 = 0;
                method9(var0);
            } else {
                var0.method3287();
            }
        }
    }

    @ObfuscatedName("u.gi(Lbr;I)V")
    public static final void method9(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1186 == 0) {
            var1 = Statics.field315.method2567(arg0.field1185, arg0.field1187, arg0.field1188);
        }
        if (arg0.field1186 == 1) {
            var1 = Statics.field315.method2423(arg0.field1185, arg0.field1187, arg0.field1188);
        }
        if (arg0.field1186 == 2) {
            var1 = Statics.field315.method2452(arg0.field1185, arg0.field1187, arg0.field1188);
        }
        if (arg0.field1186 == 3) {
            var1 = Statics.field315.method2453(arg0.field1185, arg0.field1187, arg0.field1188);
        }
        if (var1 != 0) {
            int var5 = Statics.field315.method2522(arg0.field1185, arg0.field1187, arg0.field1188, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1197 = var2;
        arg0.field1191 = var3;
        arg0.field1190 = var4;
    }

    @ObfuscatedName("ag.gg(IIIIIIIB)V")
    public static final void method229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field919 && Statics.field251 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field315.method2567(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field315.method2423(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field315.method2452(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field315.method2453(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field315.method2522(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field315.method2441(arg0, arg2, arg3);
                class256 var15 = class256.method2825(var12);
                if (var15.field3428 != 0) {
                    field976[arg0].method2721(arg2, arg3, var13, var14, var15.field3440);
                }
            }
            if (arg1 == 1) {
                Statics.field315.method2442(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field315.method2443(arg0, arg2, arg3);
                class256 var16 = class256.method2825(var12);
                if (var16.field3426 + arg2 > 103 || var16.field3426 + arg3 > 103 || var16.field3425 + arg2 > 103 || var16.field3425 + arg3 > 103) {
                    return;
                }
                if (var16.field3428 != 0) {
                    field976[arg0].method2722(arg2, arg3, var16.field3426, var16.field3425, var14, var16.field3440);
                }
            }
            if (arg1 == 3) {
                Statics.field315.method2459(arg0, arg2, arg3);
                class256 var17 = class256.method2825(var12);
                if (var17.field3428 == 1) {
                    field976[arg0].method2718(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field752[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class140 var19 = Statics.field315;
        class162 var20 = field976[arg0];
        class256 var21 = class256.method2825(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field3425;
            var23 = var21.field3426;
        } else {
            var22 = var21.field3426;
            var23 = var21.field3425;
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
        int[][] var28 = class62.field763[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field3430 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field3432 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class142 var34;
            if (var21.field3434 == -1 && var21.field3452 == null) {
                var34 = var21.method4098(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class101(arg4, 22, arg5, var18, arg2, arg3, var21.field3434, true, (class142) null);
            }
            var19.method2533(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field3428 == 1) {
                var20.method2719(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class142 var57;
            if (var21.field3434 == -1 && var21.field3452 == null) {
                var57 = var21.method4098(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class101(arg4, 10, arg5, var18, arg2, arg3, var21.field3434, true, (class142) null);
            }
            if (var57 != null) {
                var19.method2434(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field3428 != 0) {
                var20.method2744(arg2, arg3, var22, var23, var21.field3440);
            }
        } else if (arg6 >= 12) {
            class142 var35;
            if (var21.field3434 == -1 && var21.field3452 == null) {
                var35 = var21.method4098(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class101(arg4, arg6, arg5, var18, arg2, arg3, var21.field3434, true, (class142) null);
            }
            var19.method2434(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field3428 != 0) {
                var20.method2744(arg2, arg3, var22, var23, var21.field3440);
            }
        } else if (arg6 == 0) {
            class142 var36;
            if (var21.field3434 == -1 && var21.field3452 == null) {
                var36 = var21.method4098(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class101(arg4, 0, arg5, var18, arg2, arg3, var21.field3434, true, (class142) null);
            }
            var19.method2432(arg0, arg2, arg3, var29, var36, (class142) null, class62.field764[arg5], 0, var32, var33);
            if (var21.field3428 != 0) {
                var20.method2716(arg2, arg3, arg6, arg5, var21.field3440);
            }
        } else if (arg6 == 1) {
            class142 var37;
            if (var21.field3434 == -1 && var21.field3452 == null) {
                var37 = var21.method4098(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class101(arg4, 1, arg5, var18, arg2, arg3, var21.field3434, true, (class142) null);
            }
            var19.method2432(arg0, arg2, arg3, var29, var37, (class142) null, class62.field758[arg5], 0, var32, var33);
            if (var21.field3428 != 0) {
                var20.method2716(arg2, arg3, arg6, arg5, var21.field3440);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class142 var39;
            class142 var40;
            if (var21.field3434 == -1 && var21.field3452 == null) {
                var39 = var21.method4098(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method4098(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class101(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field3434, true, (class142) null);
                var40 = new class101(arg4, 2, var38, var18, arg2, arg3, var21.field3434, true, (class142) null);
            }
            var19.method2432(arg0, arg2, arg3, var29, var39, var40, class62.field764[arg5], class62.field764[var38], var32, var33);
            if (var21.field3428 != 0) {
                var20.method2716(arg2, arg3, arg6, arg5, var21.field3440);
            }
        } else if (arg6 == 3) {
            class142 var41;
            if (var21.field3434 == -1 && var21.field3452 == null) {
                var41 = var21.method4098(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class101(arg4, 3, arg5, var18, arg2, arg3, var21.field3434, true, (class142) null);
            }
            var19.method2432(arg0, arg2, arg3, var29, var41, (class142) null, class62.field758[arg5], 0, var32, var33);
            if (var21.field3428 != 0) {
                var20.method2716(arg2, arg3, arg6, arg5, var21.field3440);
            }
        } else if (arg6 == 9) {
            class142 var42;
            if (var21.field3434 == -1 && var21.field3452 == null) {
                var42 = var21.method4098(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class101(arg4, arg6, arg5, var18, arg2, arg3, var21.field3434, true, (class142) null);
            }
            var19.method2434(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field3428 != 0) {
                var20.method2744(arg2, arg3, var22, var23, var21.field3440);
            }
        } else if (arg6 == 4) {
            class142 var43;
            if (var21.field3434 == -1 && var21.field3452 == null) {
                var43 = var21.method4098(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class101(arg4, 4, arg5, var18, arg2, arg3, var21.field3434, true, (class142) null);
            }
            var19.method2433(arg0, arg2, arg3, var29, var43, (class142) null, class62.field764[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method2567(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class256.method2825(var45 >> 14 & 0x7FFF).field3448;
            }
            class142 var46;
            if (var21.field3434 == -1 && var21.field3452 == null) {
                var46 = var21.method4098(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class101(arg4, 4, arg5, var18, arg2, arg3, var21.field3434, true, (class142) null);
            }
            var19.method2433(arg0, arg2, arg3, var29, var46, (class142) null, class62.field764[arg5], 0, class62.field759[arg5] * var44, class62.field760[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method2567(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class256.method2825(var48 >> 14 & 0x7FFF).field3448 / 2;
            }
            class142 var49;
            if (var21.field3434 == -1 && var21.field3452 == null) {
                var49 = var21.method4098(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class101(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3434, true, (class142) null);
            }
            var19.method2433(arg0, arg2, arg3, var29, var49, (class142) null, 256, arg5, class62.field761[arg5] * var47, class62.field762[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class142 var51;
            if (var21.field3434 == -1 && var21.field3452 == null) {
                var51 = var21.method4098(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class101(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field3434, true, (class142) null);
            }
            var19.method2433(arg0, arg2, arg3, var29, var51, (class142) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method2567(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class256.method2825(var53 >> 14 & 0x7FFF).field3448 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class142 var55;
            class142 var56;
            if (var21.field3434 == -1 && var21.field3452 == null) {
                var55 = var21.method4098(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method4098(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class101(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3434, true, (class142) null);
                var56 = new class101(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field3434, true, (class142) null);
            }
            var19.method2433(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class62.field761[arg5] * var52, class62.field762[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("ca.gh(IIB)V")
    public static final void method1671(int arg0, int arg1) {
        class194 var2 = field1035[Statics.field251][arg0][arg1];
        if (var2 == null) {
            Statics.field315.method2561(Statics.field251, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class95 var5 = null;
        for (class95 var6 = (class95) var2.method3296(); var6 != null; var6 = (class95) var2.method3298()) {
            class257 var7 = class257.method44(var6.field1460);
            long var8 = (long) var7.field3482;
            if (var7.field3485 == 1) {
                var8 = (long) (var6.field1461 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field315.method2561(Statics.field251, arg0, arg1);
            return;
        }
        var2.method3292(var5);
        class95 var10 = null;
        class95 var11 = null;
        for (class95 var12 = (class95) var2.method3296(); var12 != null; var12 = (class95) var2.method3298()) {
            if (var5.field1460 != var12.field1460) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1460 != var12.field1460 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field315.method2431(Statics.field251, arg0, arg1, method161(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field251), var5, var13, var10, var11);
    }

    @ObfuscatedName("hv.ge(ZI)V")
    public static final void method3694(boolean arg0) {
        field1028 = 0;
        field956 = 0;
        method3697();
        method3799(arg0);
        method606();
        for (int var1 = 0; var1 < field1028; var1++) {
            int var2 = field1029[var1];
            if (field929 != field1050[var2].field1259) {
                field1050[var2].field1359 = null;
                field1050[var2] = null;
            }
        }
        if (field926 != field1168.field2357) {
            throw new RuntimeException(field1168.field2357 + class89.field1370 + field926);
        }
        for (int var3 = 0; var3 < field954; var3++) {
            if (field1050[field955[var3]] == null) {
                throw new RuntimeException(var3 + class89.field1370 + field954);
            }
        }
    }

    @ObfuscatedName("hz.gc(I)V")
    public static final void method3697() {
        field1168.method3098();
        int var0 = field1168.method3108(8);
        if (var0 < field954) {
            for (int var1 = var0; var1 < field954; var1++) {
                field1029[++field1028 - 1] = field955[var1];
            }
        }
        if (var0 > field954) {
            throw new RuntimeException("");
        }
        field954 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field955[var2];
            class87 var4 = field1050[var3];
            int var5 = field1168.method3108(1);
            if (var5 == 0) {
                field955[++field954 - 1] = var3;
                var4.field1259 = field929;
            } else {
                int var6 = field1168.method3108(2);
                if (var6 == 0) {
                    field955[++field954 - 1] = var3;
                    var4.field1259 = field929;
                    field957[++field956 - 1] = var3;
                } else if (var6 == 1) {
                    field955[++field954 - 1] = var3;
                    var4.field1259 = field929;
                    int var7 = field1168.method3108(3);
                    var4.method1513(var7, (byte) 1);
                    int var8 = field1168.method3108(1);
                    if (var8 == 1) {
                        field957[++field956 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field955[++field954 - 1] = var3;
                    var4.field1259 = field929;
                    int var9 = field1168.method3108(3);
                    var4.method1513(var9, (byte) 2);
                    int var10 = field1168.method3108(3);
                    var4.method1513(var10, (byte) 2);
                    int var11 = field1168.method3108(1);
                    if (var11 == 1) {
                        field957[++field956 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field1029[++field1028 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ip.gf(ZI)V")
    public static final void method3799(boolean arg0) {
        while (true) {
            if (field1168.method3106(field926) >= 27) {
                int var1 = field1168.method3108(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field1050[var1] == null) {
                        field1050[var1] = new class87();
                        var2 = true;
                    }
                    class87 var3 = field1050[var1];
                    field955[++field954 - 1] = var1;
                    var3.field1259 = field929;
                    int var4;
                    if (arg0) {
                        var4 = field1168.method3108(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = field1168.method3108(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }
                    var3.field1359 = class259.method200(field1168.method3108(14));
                    int var5 = field1168.method3108(1);
                    int var6;
                    if (arg0) {
                        var6 = field1168.method3108(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = field1168.method3108(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7 = field1168.method3108(1);
                    if (var7 == 1) {
                        field957[++field956 - 1] = var1;
                    }
                    int var8 = field984[field1168.method3108(3)];
                    if (var2) {
                        var3.field1257 = var3.field1212 = var8;
                    }
                    var3.field1214 = var3.field1359.field3533;
                    var3.field1233 = var3.field1359.field3556;
                    if (var3.field1233 == 0) {
                        var3.field1212 = 0;
                    }
                    var3.field1218 = var3.field1359.field3539;
                    var3.field1265 = var3.field1359.field3540;
                    var3.field1245 = var3.field1359.field3541;
                    var3.field1221 = var3.field1359.field3542;
                    var3.field1253 = var3.field1359.field3548;
                    var3.field1216 = var3.field1359.field3551;
                    var3.field1217 = var3.field1359.field3538;
                    var3.method1514(Statics.field3110.field1210[0] + var4, Statics.field3110.field1264[0] + var6, var5 == 1);
                    continue;
                }
            }
            field1168.method3100();
            return;
        }
    }

    @ObfuscatedName("au.gp(I)V")
    public static final void method606() {
        for (int var0 = 0; var0 < field956; var0++) {
            int var1 = field957[var0];
            class87 var2 = field1050[var1];
            int var3 = field1168.method2843();
            if ((var3 & 0x4) != 0) {
                var2.field1236 = field1168.method2896();
                if (var2.field1236 == 65535) {
                    var2.field1236 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                int var4 = field1168.method2896();
                int var5 = field1168.method2896();
                int var6 = var2.field1211 - (var4 - Statics.field329 - Statics.field329) * 64;
                int var7 = var2.field1219 - (var5 - Statics.field2282 - Statics.field2282) * 64;
                if (var6 != 0 || var7 != 0) {
                    var2.field1238 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field1359 = class259.method200(field1168.method2896());
                var2.field1214 = var2.field1359.field3533;
                var2.field1233 = var2.field1359.field3556;
                var2.field1218 = var2.field1359.field3539;
                var2.field1265 = var2.field1359.field3540;
                var2.field1245 = var2.field1359.field3541;
                var2.field1221 = var2.field1359.field3542;
                var2.field1253 = var2.field1359.field3548;
                var2.field1216 = var2.field1359.field3551;
                var2.field1217 = var2.field1359.field3538;
            }
            if ((var3 & 0x1) != 0) {
                int var8 = field1168.method2886();
                if (var8 > 0) {
                    for (int var9 = 0; var9 < var8; var9++) {
                        int var10 = -1;
                        int var11 = -1;
                        int var12 = -1;
                        int var13 = field1168.method3016();
                        if (var13 == 32767) {
                            var13 = field1168.method3016();
                            var11 = field1168.method3016();
                            var10 = field1168.method3016();
                            var12 = field1168.method3016();
                        } else if (var13 == 32766) {
                            var13 = -1;
                        } else {
                            var11 = field1168.method3016();
                        }
                        int var14 = field1168.method3016();
                        var2.method1372(var13, var11, var10, var12, field929, var14);
                    }
                }
                int var15 = field1168.method2843();
                if (var15 > 0) {
                    for (int var16 = 0; var16 < var15; var16++) {
                        int var17 = field1168.method3016();
                        int var18 = field1168.method3016();
                        if (var18 == 32767) {
                            var2.method1365(var17);
                        } else {
                            int var19 = field1168.method3016();
                            int var20 = field1168.method2843();
                            int var21 = var18 > 0 ? field1168.method3044() : var20;
                            var2.method1364(var17, field929, var18, var19, var20, var21);
                        }
                    }
                }
            }
            if ((var3 & 0x2) != 0) {
                int var22 = field1168.method2894();
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = field1168.method2886();
                if (var2.field1242 == var22 && var22 != -1) {
                    int var24 = Statics.method240(var22).field3597;
                    if (var24 == 1) {
                        var2.field1243 = 0;
                        var2.field1244 = 0;
                        var2.field1232 = var23;
                        var2.field1246 = 0;
                    }
                    if (var24 == 2) {
                        var2.field1246 = 0;
                    }
                } else if (var22 == -1 || var2.field1242 == -1 || Statics.method240(var22).field3591 >= Statics.method240(var2.field1242).field3591) {
                    var2.field1242 = var22;
                    var2.field1243 = 0;
                    var2.field1244 = 0;
                    var2.field1232 = var23;
                    var2.field1246 = 0;
                    var2.field1220 = var2.field1252;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field1247 = field1168.method2861();
                int var25 = field1168.method2905();
                var2.field1251 = var25 >> 16;
                var2.field1213 = (var25 & 0xFFFF) + field929;
                var2.field1248 = 0;
                var2.field1249 = 0;
                if (var2.field1213 > field929) {
                    var2.field1248 = -1;
                }
                if (var2.field1247 == 65535) {
                    var2.field1247 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field1223 = field1168.method2867();
                var2.field1226 = 100;
            }
        }
    }

    @ObfuscatedName("au.gs(B)V")
    public static void method608() {
        field1176 = 0;
        field1043 = false;
        field1049[0] = class226.field2842;
        field1114[0] = "";
        field1047[0] = 1006;
        field985[0] = false;
        field1176 = 1;
    }

    @ObfuscatedName("by.gx(I)V")
    public static final void method955() {
        int var0 = Statics.field508;
        int var1 = Statics.field3201;
        int var2 = Statics.field450;
        int var3 = Statics.field2166;
        int var4 = 6116423;
        class282.method4510(var0, var1, var2, var3, var4);
        class282.method4510(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class282.method4523(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field3286.method4331(class226.field2978, var0 + 3, var1 + 14, var4, -1);
        int var5 = class60.field731;
        int var6 = class60.field732;
        for (int var7 = 0; var7 < field1176; var7++) {
            int var8 = (field1176 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field3286.method4331(method969(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field508;
        int var11 = Statics.field3201;
        int var12 = Statics.field450;
        int var13 = Statics.field2166;
        for (int var14 = 0; var14 < field1108; var14++) {
            if (field969[var14] + field1113[var14] > var10 && field1113[var14] < var10 + var12 && field921[var14] + field1116[var14] > var11 && field921[var14] < var11 + var13) {
                field1065[var14] = true;
            }
        }
    }

    @ObfuscatedName("ex.go(IIIII)V")
    public static final void method2600(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1108; var4++) {
            if (field969[var4] + field1113[var4] > arg0 && field1113[var4] < arg0 + arg2 && field921[var4] + field1116[var4] > arg1 && field921[var4] < arg1 + arg3) {
                field1110[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.gy(I)V")
    public final void method1017() {
        method1534();
        if (Statics.field282 != null || field1078 != null) {
            return;
        }
        int var1 = class60.field730;
        if (field1043) {
            if (var1 != 1 && (Statics.field700 || var1 != 4)) {
                int var2 = class60.field731;
                int var3 = class60.field732;
                if (var2 < Statics.field508 - 10 || var2 > Statics.field508 + Statics.field450 + 10 || var3 < Statics.field3201 - 10 || var3 > Statics.field3201 + Statics.field2166 + 10) {
                    field1043 = false;
                    method2600(Statics.field508, Statics.field3201, Statics.field450, Statics.field2166);
                }
            }
            if (var1 == 1 || !Statics.field700 && var1 == 4) {
                int var4 = Statics.field508;
                int var5 = Statics.field3201;
                int var6 = Statics.field450;
                int var7 = class60.field738;
                int var8 = class60.field724;
                int var9 = -1;
                for (int var10 = 0; var10 < field1176; var10++) {
                    int var11 = (field1176 - 1 - var10) * 15 + var5 + 31;
                    if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                        var9 = var10;
                    }
                }
                if (var9 != -1 && var9 >= 0) {
                    int var12 = field1155[var9];
                    int var13 = field1046[var9];
                    int var14 = field1047[var9];
                    int var15 = field1111[var9];
                    String var16 = field1049[var9];
                    String var17 = field1114[var9];
                    method2758(var12, var13, var14, var15, var16, var17, class60.field738, class60.field724);
                }
                field1043 = false;
                method2600(Statics.field508, Statics.field3201, Statics.field450, Statics.field2166);
            }
            return;
        }
        int var18 = method461();
        if ((var1 == 1 || !Statics.field700 && var1 == 4) && var18 >= 0) {
            int var19 = field1047[var18];
            if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                int var20 = field1155[var18];
                int var21 = field1046[var18];
                class217 var22 = class217.method3861(var21);
                if (class218.method41(method887(var22)) || class218.method91(method887(var22))) {
                    if (Statics.field282 != null && !field1102 && field1176 > 0 && !this.method1260()) {
                        int var23 = field1144;
                        int var24 = field1020;
                        class90 var25 = Statics.field670;
                        method2758(var25.field1380, var25.field1378, var25.field1379, var25.field1381, var25.field1382, var25.field1382, var23, var24);
                        Statics.field670 = null;
                    }
                    field1102 = false;
                    field1023 = 0;
                    if (Statics.field282 != null) {
                        method148(Statics.field282);
                    }
                    Statics.field282 = class217.method3861(var21);
                    field989 = var20;
                    field1144 = class60.field738;
                    field1020 = class60.field724;
                    if (var18 >= 0) {
                        Statics.field670 = new class90();
                        Statics.field670.field1380 = field1155[var18];
                        Statics.field670.field1378 = field1046[var18];
                        Statics.field670.field1379 = field1047[var18];
                        Statics.field670.field1381 = field1111[var18];
                        Statics.field670.field1382 = field1049[var18];
                    }
                    method148(Statics.field282);
                    return;
                }
            }
        }
        if ((var1 == 1 || !Statics.field700 && var1 == 4) && this.method1260()) {
            var1 = 2;
        }
        if ((var1 == 1 || !Statics.field700 && var1 == 4) && field1176 > 0 && var18 >= 0) {
            int var26 = field1155[var18];
            int var27 = field1046[var18];
            int var28 = field1047[var18];
            int var29 = field1111[var18];
            String var30 = field1049[var18];
            String var31 = field1114[var18];
            method2758(var26, var27, var28, var29, var30, var31, class60.field738, class60.field724);
        }
        if (var1 == 2 && field1176 > 0) {
            this.method1019(class60.field738, class60.field724);
        }
    }

    @ObfuscatedName("client.gm(B)Z")
    public final boolean method1260() {
        int var1 = method461();
        return field1176 > 2 && (field1042 == 1 && !field985[var1] || method949(var1));
    }

    @ObfuscatedName("client.gr(III)V")
    public final void method1019(int arg0, int arg1) {
        int var3 = Statics.field3286.method4326(class226.field2978);
        for (int var4 = 0; var4 < field1176; var4++) {
            int var5 = Statics.field3286.method4326(method969(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field1176 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field584) {
            var7 = Statics.field584 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field248) {
            var8 = Statics.field248 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field315.method2461(Statics.field251, arg0, arg1, false);
        field1043 = true;
        Statics.field508 = var7;
        Statics.field3201 = var8;
        Statics.field450 = var3;
        Statics.field2166 = field1176 * 15 + 22;
    }

    @ObfuscatedName("bs.gw(II)Z")
    public static final boolean method949(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field1047[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("fh.gl(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2758(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class217 var8 = class217.method2714(arg1, arg0);
            if (var8 != null) {
                int var9 = var8.field2726;
                class217 var10 = class217.method2714(arg1, arg0);
                if (var10 != null) {
                    if (var10.field2718 != null) {
                        class70 var11 = new class70();
                        var11.field830 = var10;
                        var11.field838 = arg3;
                        var11.field839 = arg5;
                        var11.field832 = var10.field2718;
                        class84.method963(var11);
                    }
                    boolean var12 = true;
                    if (var10.field2622 > 0) {
                        var12 = method3699(var10);
                    }
                    if (var12 && class218.method1646(method887(var10), arg3 - 1)) {
                        if (arg3 == 1) {
                            field958.method3096(166);
                            field958.method3024(arg1);
                            field958.method2846(arg0);
                            field958.method2846(var9);
                        }
                        if (arg3 == 2) {
                            field958.method3096(47);
                            field958.method3024(arg1);
                            field958.method2846(arg0);
                            field958.method2846(var9);
                        }
                        if (arg3 == 3) {
                            field958.method3096(74);
                            field958.method3024(arg1);
                            field958.method2846(arg0);
                            field958.method2846(var9);
                        }
                        if (arg3 == 4) {
                            field958.method3096(187);
                            field958.method3024(arg1);
                            field958.method2846(arg0);
                            field958.method2846(var9);
                        }
                        if (arg3 == 5) {
                            field958.method3096(169);
                            field958.method3024(arg1);
                            field958.method2846(arg0);
                            field958.method2846(var9);
                        }
                        if (arg3 == 6) {
                            field958.method3096(188);
                            field958.method3024(arg1);
                            field958.method2846(arg0);
                            field958.method2846(var9);
                        }
                        if (arg3 == 7) {
                            field958.method3096(164);
                            field958.method3024(arg1);
                            field958.method2846(arg0);
                            field958.method2846(var9);
                        }
                        if (arg3 == 8) {
                            field958.method3096(103);
                            field958.method3024(arg1);
                            field958.method2846(arg0);
                            field958.method2846(var9);
                        }
                        if (arg3 == 9) {
                            field958.method3096(79);
                            field958.method3024(arg1);
                            field958.method2846(arg0);
                            field958.method2846(var9);
                        }
                        if (arg3 == 10) {
                            field958.method3096(27);
                            field958.method3024(arg1);
                            field958.method2846(arg0);
                            field958.method2846(var9);
                        }
                    }
                }
            }
        }
        if (arg2 == 36) {
            field958.method3096(120);
            field958.method2931(arg1);
            field958.method2893(arg0);
            field958.method2846(arg3);
            field1076 = 0;
            Statics.field263 = class217.method3861(arg1);
            field1183 = arg0;
        }
        if (arg2 == 51) {
            class75 var13 = field1070[arg3];
            if (var13 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(56);
                field958.method2846(arg3);
                field958.method2885(class51.field637[82] ? 1 : 0);
            }
        }
        if (arg2 == 9) {
            class87 var14 = field1050[arg3];
            if (var14 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(75);
                field958.method2891(arg3);
                field958.method2922(class51.field637[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field958.method3096(204);
            field958.method2892(field1056);
            field958.method2931(Statics.field748);
            field958.method2891(arg0);
            field958.method2893(arg3);
            field958.method2903(arg1);
            field1076 = 0;
            Statics.field263 = class217.method3861(arg1);
            field1183 = arg0;
        }
        if (arg2 == 31) {
            field958.method3096(198);
            field958.method2903(arg1);
            field958.method2891(arg0);
            field958.method2892(arg3);
            field958.method2931(Statics.field233);
            field958.method2846(Statics.field596);
            field958.method2891(Statics.field355);
            field1076 = 0;
            Statics.field263 = class217.method3861(arg1);
            field1183 = arg0;
        }
        if (arg2 == 1003) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            class87 var15 = field1050[arg3];
            if (var15 != null) {
                class259 var16 = var15.field1359;
                if (var16.field3557 != null) {
                    var16 = var16.method4231();
                }
                if (var16 != null) {
                    field958.method3096(205);
                    field958.method2893(var16.field3544);
                }
            }
        }
        if (arg2 == 29) {
            field958.method3096(186);
            field958.method3024(arg1);
            class217 var17 = class217.method3861(arg1);
            if (var17.field2730 != null && var17.field2730[0][0] == 5) {
                int var18 = var17.field2730[0][1];
                if (class212.field2573[var18] != var17.field2642[0]) {
                    class212.field2573[var18] = var17.field2642[0];
                    method2774(var18);
                }
            }
        }
        if (arg2 == 21) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            field1017 = arg0;
            field1138 = arg1;
            field958.method3096(110);
            field958.method2892(Statics.field329 + arg0);
            field958.method2981(class51.field637[82] ? 1 : 0);
            field958.method2846(arg3);
            field958.method2892(Statics.field2282 + arg1);
        }
        if (arg2 == 20) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            field1017 = arg0;
            field1138 = arg1;
            field958.method3096(231);
            field958.method2893(Statics.field2282 + arg1);
            field958.method2885(class51.field637[82] ? 1 : 0);
            field958.method2891(Statics.field329 + arg0);
            field958.method2891(arg3);
        }
        if (arg2 == 40) {
            field958.method3096(152);
            field958.method2891(arg3);
            field958.method2891(arg0);
            field958.method2903(arg1);
            field1076 = 0;
            Statics.field263 = class217.method3861(arg1);
            field1183 = arg0;
        }
        if (arg2 == 42) {
            field958.method3096(182);
            field958.method2892(arg0);
            field958.method3024(arg1);
            field958.method2892(arg3);
            field1076 = 0;
            Statics.field263 = class217.method3861(arg1);
            field1183 = arg0;
        }
        if (arg2 == 49) {
            class75 var19 = field1070[arg3];
            if (var19 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(73);
                field958.method2885(class51.field637[82] ? 1 : 0);
                field958.method2893(arg3);
            }
        }
        if (arg2 == 1005) {
            class217 var20 = class217.method3861(arg1);
            if (var20 == null || var20.field2737[arg0] < 100000) {
                field958.method3096(238);
                field958.method2891(arg3);
            } else {
                class99.method1574(27, "", var20.field2737[arg0] + " x " + class257.method44(arg3).field3474);
            }
            field1076 = 0;
            Statics.field263 = class217.method3861(arg1);
            field1183 = arg0;
        }
        if (arg2 == 24) {
            class217 var21 = class217.method3861(arg1);
            boolean var22 = true;
            if (var21.field2622 > 0) {
                var22 = method3699(var21);
            }
            if (var22) {
                field958.method3096(186);
                field958.method3024(arg1);
            }
        }
        if (arg2 == 48) {
            class75 var23 = field1070[arg3];
            if (var23 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(55);
                field958.method2892(arg3);
                field958.method2922(class51.field637[82] ? 1 : 0);
            }
        }
        if (arg2 == 11) {
            class87 var24 = field1050[arg3];
            if (var24 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(137);
                field958.method2892(arg3);
                field958.method2922(class51.field637[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field958.method3096(31);
            field958.method2963(arg1);
            field958.method2891(arg0);
            field958.method2846(arg3);
            field1076 = 0;
            Statics.field263 = class217.method3861(arg1);
            field1183 = arg0;
        }
        if (arg2 == 8) {
            class87 var25 = field1050[arg3];
            if (var25 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(64);
                field958.method2893(field1056);
                field958.method2903(Statics.field748);
                field958.method2884(class51.field637[82] ? 1 : 0);
                field958.method2891(arg3);
            }
        }
        if (arg2 == 16) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            field1017 = arg0;
            field1138 = arg1;
            field958.method3096(141);
            field958.method2893(Statics.field2282 + arg1);
            field958.method2893(Statics.field329 + arg0);
            field958.method2892(arg3);
            field958.method3024(Statics.field233);
            field958.method2891(Statics.field355);
            field958.method2846(Statics.field596);
            field958.method2922(class51.field637[82] ? 1 : 0);
        }
        if (arg2 == 26) {
            method3700();
        }
        if (arg2 == 25) {
            class217 var26 = class217.method2714(arg1, arg0);
            if (var26 != null) {
                method7();
                int var29 = method887(var26);
                int var30 = var29 >> 11 & 0x3F;
                method2601(arg1, arg0, var30, var26.field2726);
                field1058 = 0;
                int var31 = method887(var26);
                int var32 = var31 >> 11 & 0x3F;
                String var33;
                if (var32 == 0) {
                    var33 = null;
                } else if (var26.field2697 == null || var26.field2697.trim().length() == 0) {
                    var33 = null;
                } else {
                    var33 = var26.field2697;
                }
                field1063 = var33;
                if (field1063 == null) {
                    field1063 = "Null";
                }
                if (var26.field2617) {
                    field1064 = var26.field2721 + class89.method40(16777215);
                } else {
                    field1064 = class89.method40(65280) + var26.field2734 + class89.method40(16777215);
                }
            }
            return;
        }
        if (arg2 == 12) {
            class87 var34 = field1050[arg3];
            if (var34 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(1);
                field958.method2891(arg3);
                field958.method2981(class51.field637[82] ? 1 : 0);
            }
        }
        if (arg2 == 4) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            field1017 = arg0;
            field1138 = arg1;
            field958.method3096(91);
            field958.method2981(class51.field637[82] ? 1 : 0);
            field958.method2846(arg3 >> 14 & 0x7FFF);
            field958.method2846(Statics.field329 + arg0);
            field958.method2846(Statics.field2282 + arg1);
        }
        if (arg2 == 1002) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            field958.method3096(200);
            field958.method2892(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field991.method4812(arg2, arg3, new class213(arg0), new class213(arg1));
        }
        if (arg2 == 45) {
            class75 var35 = field1070[arg3];
            if (var35 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(53);
                field958.method2846(arg3);
                field958.method2885(class51.field637[82] ? 1 : 0);
            }
        }
        if (arg2 == 1001) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            field1017 = arg0;
            field1138 = arg1;
            field958.method3096(115);
            field958.method2846(Statics.field329 + arg0);
            field958.method2892(arg3 >> 14 & 0x7FFF);
            field958.method2885(class51.field637[82] ? 1 : 0);
            field958.method2891(Statics.field2282 + arg1);
        }
        if (arg2 == 43) {
            field958.method3096(134);
            field958.method2893(arg3);
            field958.method2892(arg0);
            field958.method2963(arg1);
            field1076 = 0;
            Statics.field263 = class217.method3861(arg1);
            field1183 = arg0;
        }
        if (arg2 == 37) {
            field958.method3096(13);
            field958.method2846(arg0);
            field958.method3024(arg1);
            field958.method2892(arg3);
            field1076 = 0;
            Statics.field263 = class217.method3861(arg1);
            field1183 = arg0;
        }
        if (arg2 == 58) {
            class217 var36 = class217.method2714(arg1, arg0);
            if (var36 != null) {
                field958.method3096(127);
                field958.method2846(var36.field2726);
                field958.method2846(arg0);
                field958.method2891(field1062);
                field958.method2931(Statics.field748);
                field958.method2891(field1056);
                field958.method2963(arg1);
            }
        }
        if (arg2 == 3) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            field1017 = arg0;
            field1138 = arg1;
            field958.method3096(21);
            field958.method2891(Statics.field329 + arg0);
            field958.method2981(class51.field637[82] ? 1 : 0);
            field958.method2893(arg3 >> 14 & 0x7FFF);
            field958.method2893(Statics.field2282 + arg1);
        }
        if (arg2 == 6) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            field1017 = arg0;
            field1138 = arg1;
            field958.method3096(131);
            field958.method2891(arg3 >> 14 & 0x7FFF);
            field958.method2892(Statics.field329 + arg0);
            field958.method2846(Statics.field2282 + arg1);
            field958.method2884(class51.field637[82] ? 1 : 0);
        }
        if (arg2 == 13) {
            class87 var37 = field1050[arg3];
            if (var37 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(227);
                field958.method2884(class51.field637[82] ? 1 : 0);
                field958.method2892(arg3);
            }
        }
        if (arg2 == 44) {
            class75 var38 = field1070[arg3];
            if (var38 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(139);
                field958.method2885(class51.field637[82] ? 1 : 0);
                field958.method2891(arg3);
            }
        }
        if (arg2 == 10) {
            class87 var39 = field1050[arg3];
            if (var39 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(136);
                field958.method2922(class51.field637[82] ? 1 : 0);
                field958.method2893(arg3);
            }
        }
        if (arg2 == 1) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            field1017 = arg0;
            field1138 = arg1;
            field958.method3096(122);
            field958.method2846(Statics.field355);
            field958.method2892(Statics.field596);
            field958.method2891(Statics.field329 + arg0);
            field958.method2892(arg3 >> 14 & 0x7FFF);
            field958.method2893(Statics.field2282 + arg1);
            field958.method2922(class51.field637[82] ? 1 : 0);
            field958.method2963(Statics.field233);
        }
        if (arg2 == 5) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            field1017 = arg0;
            field1138 = arg1;
            field958.method3096(105);
            field958.method2884(class51.field637[82] ? 1 : 0);
            field958.method2846(Statics.field329 + arg0);
            field958.method2893(Statics.field2282 + arg1);
            field958.method2892(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 41) {
            field958.method3096(147);
            field958.method2846(arg3);
            field958.method2846(arg0);
            field958.method3024(arg1);
            field1076 = 0;
            Statics.field263 = class217.method3861(arg1);
            field1183 = arg0;
        }
        if (arg2 == 17) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            field1017 = arg0;
            field1138 = arg1;
            field958.method3096(100);
            field958.method2884(class51.field637[82] ? 1 : 0);
            field958.method2892(Statics.field2282 + arg1);
            field958.method2891(arg3);
            field958.method2892(Statics.field329 + arg0);
            field958.method2846(field1056);
            field958.method2903(Statics.field748);
        }
        if (arg2 == 15) {
            class75 var40 = field1070[arg3];
            if (var40 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(30);
                field958.method2903(Statics.field748);
                field958.method2884(class51.field637[82] ? 1 : 0);
                field958.method2892(arg3);
                field958.method2893(field1056);
            }
        }
        if (arg2 == 28) {
            field958.method3096(186);
            field958.method3024(arg1);
            class217 var41 = class217.method3861(arg1);
            if (var41.field2730 != null && var41.field2730[0][0] == 5) {
                int var42 = var41.field2730[0][1];
                class212.field2573[var42] = 1 - class212.field2573[var42];
                method2774(var42);
            }
        }
        if (arg2 == 30 && field1069 == null) {
            method943(arg1, arg0);
            field1069 = class217.method2714(arg1, arg0);
            method148(field1069);
        }
        if (arg2 == 14) {
            class75 var43 = field1070[arg3];
            if (var43 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(112);
                field958.method2892(Statics.field596);
                field958.method2891(Statics.field355);
                field958.method2893(arg3);
                field958.method2981(class51.field637[82] ? 1 : 0);
                field958.method2931(Statics.field233);
            }
        }
        if (arg2 == 47) {
            class75 var44 = field1070[arg3];
            if (var44 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(184);
                field958.method2885(class51.field637[82] ? 1 : 0);
                field958.method2846(arg3);
            }
        }
        if (arg2 == 22) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            field1017 = arg0;
            field1138 = arg1;
            field958.method3096(19);
            field958.method2893(Statics.field2282 + arg1);
            field958.method2892(arg3);
            field958.method2922(class51.field637[82] ? 1 : 0);
            field958.method2846(Statics.field329 + arg0);
        }
        if (arg2 == 38) {
            method7();
            class217 var45 = class217.method3861(arg1);
            field1058 = 1;
            Statics.field355 = arg0;
            Statics.field233 = arg1;
            Statics.field596 = arg3;
            method148(var45);
            field1059 = class89.method40(16748608) + class257.method44(arg3).field3474 + class89.method40(16777215);
            if (field1059 == null) {
                field1059 = "null";
            }
            return;
        }
        if (arg2 == 1004) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            field958.method3096(238);
            field958.method2891(arg3);
        }
        if (arg2 == 18) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            field1017 = arg0;
            field1138 = arg1;
            field958.method3096(190);
            field958.method2893(Statics.field329 + arg0);
            field958.method2846(Statics.field2282 + arg1);
            field958.method2884(class51.field637[82] ? 1 : 0);
            field958.method2846(arg3);
        }
        if (arg2 == 7) {
            class87 var46 = field1050[arg3];
            if (var46 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(8);
                field958.method2893(arg3);
                field958.method2963(Statics.field233);
                field958.method2922(class51.field637[82] ? 1 : 0);
                field958.method2893(Statics.field596);
                field958.method2891(Statics.field355);
            }
        }
        if (arg2 == 19) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            field1017 = arg0;
            field1138 = arg1;
            field958.method3096(102);
            field958.method2891(arg3);
            field958.method2893(Statics.field2282 + arg1);
            field958.method2922(class51.field637[82] ? 1 : 0);
            field958.method2846(Statics.field329 + arg0);
        }
        if (arg2 == 50) {
            class75 var47 = field1070[arg3];
            if (var47 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(118);
                field958.method2892(arg3);
                field958.method2981(class51.field637[82] ? 1 : 0);
            }
        }
        if (arg2 == 35) {
            field958.method3096(117);
            field958.method2931(arg1);
            field958.method2891(arg0);
            field958.method2891(arg3);
            field1076 = 0;
            Statics.field263 = class217.method3861(arg1);
            field1183 = arg0;
        }
        if (arg2 == 34) {
            field958.method3096(167);
            field958.method2846(arg0);
            field958.method2893(arg3);
            field958.method2903(arg1);
            field1076 = 0;
            Statics.field263 = class217.method3861(arg1);
            field1183 = arg0;
        }
        if (arg2 == 23) {
            if (field1043) {
                Statics.field315.method2462();
            } else {
                Statics.field315.method2461(Statics.field251, arg0, arg1, true);
            }
        }
        if (arg2 == 33) {
            field958.method3096(94);
            field958.method3024(arg1);
            field958.method2892(arg0);
            field958.method2893(arg3);
            field1076 = 0;
            Statics.field263 = class217.method3861(arg1);
            field1183 = arg0;
        }
        if (arg2 == 2) {
            field1012 = arg6;
            field1013 = arg7;
            field953 = 2;
            field1014 = 0;
            field1017 = arg0;
            field1138 = arg1;
            field958.method3096(99);
            field958.method2892(field1056);
            field958.method2846(arg3 >> 14 & 0x7FFF);
            field958.method2981(class51.field637[82] ? 1 : 0);
            field958.method2891(Statics.field329 + arg0);
            field958.method3024(Statics.field748);
            field958.method2892(Statics.field2282 + arg1);
        }
        if (arg2 == 46) {
            class75 var48 = field1070[arg3];
            if (var48 != null) {
                field1012 = arg6;
                field1013 = arg7;
                field953 = 2;
                field1014 = 0;
                field1017 = arg0;
                field1138 = arg1;
                field958.method3096(0);
                field958.method2892(arg3);
                field958.method2981(class51.field637[82] ? 1 : 0);
            }
        }
        if (field1058 != 0) {
            field1058 = 0;
            method148(class217.method3861(Statics.field233));
        }
        if (field1125) {
            method7();
        }
        if (Statics.field263 != null && field1076 == 0) {
            method148(Statics.field263);
        }
    }

    @ObfuscatedName("ev.gz(IIIII)V")
    public static void method2601(int arg0, int arg1, int arg2, int arg3) {
        class217 var4 = class217.method2714(arg0, arg1);
        if (var4 != null && var4.field2748 != null) {
            class70 var5 = new class70();
            var5.field830 = var4;
            var5.field832 = var4.field2748;
            class84.method963(var5);
        }
        field1062 = arg3;
        field1125 = true;
        Statics.field748 = arg0;
        field1056 = arg1;
        Statics.field535 = arg2;
        method148(var4);
    }

    @ObfuscatedName("i.gn(I)V")
    public static void method7() {
        if (!field1125) {
            return;
        }
        class217 var0 = class217.method2714(Statics.field748, field1056);
        if (var0 != null && var0.field2696 != null) {
            class70 var1 = new class70();
            var1.field830 = var0;
            var1.field832 = var0.field2696;
            class84.method963(var1);
        }
        field1125 = false;
        method148(var0);
    }

    @ObfuscatedName("ba.gu(III)V")
    public static void method943(int arg0, int arg1) {
        field958.method3096(189);
        field958.method2892(arg1);
        field958.method2963(arg0);
    }

    @ObfuscatedName("cr.hf(I)V")
    public static final void method1534() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field1176 - 1; var1++) {
                if (field1047[var1] < 1000 && field1047[var1 + 1] > 1000) {
                    String var2 = field1114[var1];
                    field1114[var1] = field1114[var1 + 1];
                    field1114[var1 + 1] = var2;
                    String var3 = field1049[var1];
                    field1049[var1] = field1049[var1 + 1];
                    field1049[var1 + 1] = var3;
                    int var4 = field1047[var1];
                    field1047[var1] = field1047[var1 + 1];
                    field1047[var1 + 1] = var4;
                    int var5 = field1155[var1];
                    field1155[var1] = field1155[var1 + 1];
                    field1155[var1 + 1] = var5;
                    int var6 = field1046[var1];
                    field1046[var1] = field1046[var1 + 1];
                    field1046[var1 + 1] = var6;
                    int var7 = field1111[var1];
                    field1111[var1] = field1111[var1 + 1];
                    field1111[var1 + 1] = var7;
                    boolean var8 = field985[var1];
                    field985[var1] = field985[var1 + 1];
                    field985[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("jp.ht(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method4305(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var12 = false;
        if (field1043 || field1176 >= 500) {
            return;
        }
        field1049[field1176] = arg0;
        field1114[field1176] = arg1;
        field1047[field1176] = arg2;
        field1111[field1176] = arg3;
        field1155[field1176] = arg4;
        field1046[field1176] = arg5;
        field985[field1176] = var12;
        field1176++;
    }

    @ObfuscatedName("at.hm(I)I")
    public static final int method461() {
        return field1176 - 1;
    }

    @ObfuscatedName("x.hu(I)V")
    public static void method35() {
        for (int var0 = 0; var0 < field1176; var0++) {
            if (method2763(field1047[var0])) {
                if (var0 < field1176 - 1) {
                    for (int var1 = var0; var1 < field1176 - 1; var1++) {
                        field1049[var1] = field1049[var1 + 1];
                        field1114[var1] = field1114[var1 + 1];
                        field1047[var1] = field1047[var1 + 1];
                        field1111[var1] = field1111[var1 + 1];
                        field1155[var1] = field1155[var1 + 1];
                        field1046[var1] = field1046[var1 + 1];
                        field985[var1] = field985[var1 + 1];
                    }
                }
                field1176--;
            }
        }
    }

    @ObfuscatedName("fk.hs(II)Z")
    public static boolean method2763(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("bv.hp(II)Ljava/lang/String;")
    public static String method969(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field1114[arg0].length() > 0) {
            return field1049[arg0] + class226.field2985 + field1114[arg0];
        } else {
            return field1049[arg0];
        }
    }

    @ObfuscatedName("es.ha(IIIIS)V")
    public static final void method2610(int arg0, int arg1, int arg2, int arg3) {
        if (field1058 == 0 && !field1125) {
            method4305(class226.field2980, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class135.field1955; var6++) {
            int var7 = class135.field1956[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field315.method2522(Statics.field251, var8, var9, var7) >= 0) {
                    class256 var12 = class256.method2825(var11);
                    if (var12.field3452 != null) {
                        var12 = var12.method4115();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field1058 == 1) {
                        method4305(class226.field2975, field1059 + " " + class89.field1375 + " " + class89.method40(65535) + var12.field3458, 1, var7, var8, var9);
                    } else if (!field1125) {
                        String[] var13 = var12.field3438;
                        if (field1175) {
                            var13 = method3809(var13);
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
                                    method4305(var13[var14], class89.method40(65535) + var12.field3458, var15, var7, var8, var9);
                                }
                            }
                        }
                        method4305(class226.field2976, class89.method40(65535) + var12.field3458, 1002, var12.field3418 << 14, var8, var9);
                    } else if ((Statics.field535 & 0x4) == 4) {
                        method4305(field1063, field1064 + " " + class89.field1375 + " " + class89.method40(65535) + var12.field3458, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class87 var16 = field1050[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field1359.field3533 == 1 && (var16.field1211 & 0x7F) == 64 && (var16.field1219 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field954; var17++) {
                            class87 var18 = field1050[field955[var17]];
                            if (var18 != null && var16 != var18 && var18.field1359.field3533 == 1 && var16.field1211 == var18.field1211 && var16.field1219 == var18.field1219) {
                                method3069(var18.field1359, field955[var17], var8, var9);
                            }
                        }
                        int var19 = class97.field1470;
                        int[] var20 = class97.field1471;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class75 var22 = field1070[var20[var21]];
                            if (var22 != null && var16.field1211 == var22.field1211 && var16.field1219 == var22.field1219) {
                                method119(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method3069(var16.field1359, var11, var8, var9);
                }
                if (var10 == 0) {
                    class75 var23 = field1070[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field1211 & 0x7F) == 64 && (var23.field1219 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field954; var24++) {
                            class87 var25 = field1050[field955[var24]];
                            if (var25 != null && var25.field1359.field3533 == 1 && var23.field1211 == var25.field1211 && var23.field1219 == var25.field1219) {
                                method3069(var25.field1359, field955[var24], var8, var9);
                            }
                        }
                        int var26 = class97.field1470;
                        int[] var27 = class97.field1471;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class75 var29 = field1070[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field1211 == var29.field1211 && var23.field1219 == var29.field1219) {
                                method119(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field1034 == var11) {
                        var4 = var7;
                    } else {
                        method119(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class194 var30 = field1035[Statics.field251][var8][var9];
                    if (var30 != null) {
                        for (class95 var31 = (class95) var30.method3297(); var31 != null; var31 = (class95) var30.method3304()) {
                            class257 var32 = class257.method44(var31.field1460);
                            if (field1058 == 1) {
                                method4305(class226.field2975, field1059 + " " + class89.field1375 + " " + class89.method40(16748608) + var32.field3474, 16, var31.field1460, var8, var9);
                            } else if (!field1125) {
                                String[] var33 = var32.field3488;
                                if (field1175) {
                                    var33 = method3809(var33);
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
                                        method4305(var33[var34], class89.method40(16748608) + var32.field3474, var35, var31.field1460, var8, var9);
                                    } else if (var34 == 2) {
                                        method4305(class226.field2826, class89.method40(16748608) + var32.field3474, 20, var31.field1460, var8, var9);
                                    }
                                }
                                method4305(class226.field2976, class89.method40(16748608) + var32.field3474, 1004, var31.field1460, var8, var9);
                            } else if ((Statics.field535 & 0x1) == 1) {
                                method4305(field1063, field1064 + " " + class89.field1375 + " " + class89.method40(16748608) + var32.field3474, 17, var31.field1460, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class75 var38 = field1070[field1034];
            method119(var38, field1034, var36, var37);
        }
    }

    @ObfuscatedName("fy.hw(Lib;IIIB)V")
    public static final void method3069(class259 arg0, int arg1, int arg2, int arg3) {
        if (field1176 >= 400) {
            return;
        }
        if (arg0.field3557 != null) {
            arg0 = arg0.method4231();
        }
        if (arg0 == null || !arg0.field3560 || arg0.field3534 && field1073 != arg1) {
            return;
        }
        String var4 = arg0.field3532;
        if (arg0.field3528 != 0) {
            int var6 = arg0.field3528;
            int var7 = Statics.field3110.field880;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class89.method40(16711680);
            } else if (var8 < -6) {
                var9 = class89.method40(16723968);
            } else if (var8 < -3) {
                var9 = class89.method40(16740352);
            } else if (var8 < 0) {
                var9 = class89.method40(16756736);
            } else if (var8 > 9) {
                var9 = class89.method40(65280);
            } else if (var8 > 6) {
                var9 = class89.method40(4259584);
            } else if (var8 > 3) {
                var9 = class89.method40(8453888);
            } else if (var8 > 0) {
                var9 = class89.method40(12648192);
            } else {
                var9 = class89.method40(16776960);
            }
            var4 = var4 + var9 + " " + class89.field1377 + class226.field2884 + arg0.field3528 + class89.field1373;
        }
        if (arg0.field3534 && field1098) {
            method4305(class226.field2976, class89.method40(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1058 == 1) {
            method4305(class226.field2975, field1059 + " " + class89.field1375 + " " + class89.method40(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1125) {
            int var10 = arg0.field3534 && field1098 ? 2000 : 0;
            String[] var11 = arg0.field3547;
            if (field1175) {
                var11 = method3809(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class226.field2977)) {
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
                        method4305(var11[var12], class89.method40(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class226.field2977)) {
                        short var15 = 0;
                        if (field1162 != class92.field1394) {
                            if (field1162 == class92.field1388 || field1162 == class92.field1387 && arg0.field3528 > Statics.field3110.field880) {
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
                            method4305(var11[var14], class89.method40(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3534 || !field1098) {
                method4305(class226.field2976, class89.method40(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field535 & 0x2) == 2) {
            method4305(field1063, field1064 + " " + class89.field1375 + " " + class89.method40(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("y.ho(Lbt;IIII)V")
    public static final void method119(class75 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field3110 == arg0 || field1176 >= 400) {
            return;
        }
        String var9;
        if (arg0.field882 == 0) {
            String var4 = arg0.field881[0] + arg0.field884 + arg0.field881[1];
            int var5 = arg0.field880;
            int var6 = Statics.field3110.field880;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class89.method40(16711680);
            } else if (var7 < -6) {
                var8 = class89.method40(16723968);
            } else if (var7 < -3) {
                var8 = class89.method40(16740352);
            } else if (var7 < 0) {
                var8 = class89.method40(16756736);
            } else if (var7 > 9) {
                var8 = class89.method40(65280);
            } else if (var7 > 6) {
                var8 = class89.method40(4259584);
            } else if (var7 > 3) {
                var8 = class89.method40(8453888);
            } else if (var7 > 0) {
                var8 = class89.method40(12648192);
            } else {
                var8 = class89.method40(16776960);
            }
            var9 = var4 + var8 + " " + class89.field1377 + class226.field2884 + arg0.field880 + class89.field1373 + arg0.field881[2];
        } else {
            var9 = arg0.field881[0] + arg0.field884 + arg0.field881[1] + " " + class89.field1377 + class226.field2982 + arg0.field882 + class89.field1373 + arg0.field881[2];
        }
        if (field1058 == 1) {
            method4305(class226.field2975, field1059 + " " + class89.field1375 + " " + class89.method40(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field1125) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field1031[var10] != null) {
                    short var11 = 0;
                    if (field1031[var10].equalsIgnoreCase(class226.field2977)) {
                        if (field941 == class92.field1394) {
                            continue;
                        }
                        if (field941 == class92.field1388 || field941 == class92.field1387 && arg0.field880 > Statics.field3110.field880) {
                            var11 = 2000;
                        }
                        if (Statics.field3110.field895 != 0 && arg0.field895 != 0) {
                            if (Statics.field3110.field895 == arg0.field895) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field1032[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field1030[var10] + var11;
                    method4305(field1031[var10], class89.method40(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field535 & 0x8) == 8) {
            method4305(field1063, field1064 + " " + class89.field1375 + " " + class89.method40(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field1176; var14++) {
            if (field1047[var14] == 23) {
                field1114[var14] = class89.method40(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ev.hc(IIIIIIIIB)V")
    public static final void method2604(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class217.method42(arg0)) {
            Statics.field347 = null;
            method1357(Statics.field2616[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field347 != null) {
                method1357(Statics.field347, -1412584499, arg1, arg2, arg3, arg4, Statics.field411, Statics.field2294, arg7);
                Statics.field347 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1110[var8] = true;
            }
        } else {
            field1110[arg7] = true;
        }
    }

    @ObfuscatedName("bx.hy([Lho;IIIIIIIIB)V")
    public static final void method1357(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class282.method4528(arg2, arg3, arg4, arg5);
        class137.method2331();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class217 var10 = arg0[var9];
            if (var10 != null && (var10.field2637 == arg1 || arg1 == -1412584499 && field1078 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1113[field1108] = var10.field2631 + arg6;
                    field921[field1108] = var10.field2632 + arg7;
                    field969[field1108] = var10.field2714;
                    field1116[field1108] = var10.field2634;
                    var11 = ++field1108 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2732 = var11;
                var10.field2729 = field929;
                if (!var10.field2617 || !method47(var10)) {
                    if (var10.field2622 > 0) {
                        int var12 = var10.field2622;
                        if (var12 == 324) {
                            if (field1157 == -1) {
                                field1157 = var10.field2618;
                                field1178 = var10.field2654;
                            }
                            if (field1081.field2585) {
                                var10.field2618 = field1157;
                            } else {
                                var10.field2618 = field1178;
                            }
                        } else if (var12 == 325) {
                            if (field1157 == -1) {
                                field1157 = var10.field2618;
                                field1178 = var10.field2654;
                            }
                            if (field1081.field2585) {
                                var10.field2618 = field1178;
                            } else {
                                var10.field2618 = field1157;
                            }
                        } else if (var12 == 327) {
                            var10.field2712 = 150;
                            var10.field2670 = (int) (Math.sin((double) field929 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2661 = 5;
                            var10.field2725 = 0;
                        } else if (var12 == 328) {
                            var10.field2712 = 150;
                            var10.field2670 = (int) (Math.sin((double) field929 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2661 = 5;
                            var10.field2725 = 1;
                        }
                    }
                    int var13 = var10.field2631 + arg6;
                    int var14 = var10.field2632 + arg7;
                    int var15 = var10.field2649;
                    if (field1078 == var10) {
                        if (arg1 != -1412584499 && !var10.field2713) {
                            Statics.field347 = arg0;
                            Statics.field411 = arg6;
                            Statics.field2294 = arg7;
                            continue;
                        }
                        if (field1089 && field1083) {
                            int var16 = class60.field731;
                            int var17 = class60.field732;
                            int var18 = var16 - field1080;
                            int var19 = var17 - field1161;
                            if (var18 < field1084) {
                                var18 = field1084;
                            }
                            if (var10.field2714 + var18 > field1084 + field1148.field2714) {
                                var18 = field1084 + field1148.field2714 - var10.field2714;
                            }
                            if (var19 < field1085) {
                                var19 = field1085;
                            }
                            if (var10.field2634 + var19 > field1085 + field1148.field2634) {
                                var19 = field1085 + field1148.field2634 - var10.field2634;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2713) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2620 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2620 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2714 + var13;
                        int var27 = var10.field2634 + var14;
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
                        int var30 = var10.field2714 + var13;
                        int var31 = var10.field2634 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2617 || var20 < var22 && var21 < var23) {
                        if (var10.field2622 != 0) {
                            if (var10.field2622 == 1336) {
                                if (field931) {
                                    var14 += 15;
                                    Statics.field1626.method4364("Fps:" + field696, var10.field2714 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field919) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field919) {
                                        var34 = 16711680;
                                    }
                                    Statics.field1626.method4364("Mem:" + var33 + "k", var10.field2714 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2622 == 1337) {
                                field1054 = var13;
                                field1055 = var14;
                                method116(var13, var14, var10.field2714, var10.field2634);
                                field1110[var10.field2732] = true;
                                class282.method4528(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2622 == 1338) {
                                method2598();
                                class211 var35 = var10.method3641(false);
                                if (var35 != null) {
                                    class282.method4528(var13, var14, var35.field2570 + var13, var35.field2567 + var14);
                                    if (field1139 == 2 || field1139 == 5) {
                                        class282.method4525(var13, var14, 0, var35.field2569, var35.field2568);
                                    } else {
                                        int var36 = field1019 & 0x7FF;
                                        int var37 = Statics.field3110.field1211 / 32 + 48;
                                        int var38 = 464 - Statics.field3110.field1219 / 32;
                                        Statics.field577.method4695(var13, var14, var35.field2570, var35.field2567, var37, var38, var36, 256, var35.field2569, var35.field2568);
                                        for (int var39 = 0; var39 < field1057; var39++) {
                                            int var40 = field1040[var39] * 4 + 2 - Statics.field3110.field1211 / 32;
                                            int var41 = field1135[var39] * 4 + 2 - Statics.field3110.field1219 / 32;
                                            method1528(var13, var14, var40, var41, field1136[var39], var35);
                                        }
                                        int var42 = 0;
                                        while (true) {
                                            if (var42 >= 104) {
                                                for (int var47 = 0; var47 < field954; var47++) {
                                                    class87 var48 = field1050[field955[var47]];
                                                    if (var48 != null && var48.method980()) {
                                                        class259 var49 = var48.field1359;
                                                        if (var49 != null && var49.field3557 != null) {
                                                            var49 = var49.method4231();
                                                        }
                                                        if (var49 != null && var49.field3549 && var49.field3560) {
                                                            int var50 = var48.field1211 / 32 - Statics.field3110.field1211 / 32;
                                                            int var51 = var48.field1219 / 32 - Statics.field3110.field1219 / 32;
                                                            method1528(var13, var14, var50, var51, Statics.field376[1], var35);
                                                        }
                                                    }
                                                }
                                                int var52 = class97.field1470;
                                                int[] var53 = class97.field1471;
                                                for (int var54 = 0; var54 < var52; var54++) {
                                                    class75 var55 = field1070[var53[var54]];
                                                    if (var55 != null && var55.method980() && !var55.field894 && Statics.field3110 != var55) {
                                                        int var56 = var55.field1211 / 32 - Statics.field3110.field1211 / 32;
                                                        int var57 = var55.field1219 / 32 - Statics.field3110.field1219 / 32;
                                                        boolean var58 = false;
                                                        if (method2617(var55.field884, true)) {
                                                            var58 = true;
                                                        }
                                                        boolean var59 = false;
                                                        for (int var60 = 0; var60 < Statics.field3260; var60++) {
                                                            if (var55.field884.equals(Statics.field632[var60].field906)) {
                                                                var59 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var61 = false;
                                                        if (Statics.field3110.field895 != 0 && var55.field895 != 0 && Statics.field3110.field895 == var55.field895) {
                                                            var61 = true;
                                                        }
                                                        if (var58) {
                                                            method1528(var13, var14, var56, var57, Statics.field376[3], var35);
                                                        } else if (var61) {
                                                            method1528(var13, var14, var56, var57, Statics.field376[4], var35);
                                                        } else if (var59) {
                                                            method1528(var13, var14, var56, var57, Statics.field376[5], var35);
                                                        } else {
                                                            method1528(var13, var14, var56, var57, Statics.field376[2], var35);
                                                        }
                                                    }
                                                }
                                                if (field993 != 0 && field929 % 20 < 10) {
                                                    if (field993 == 1 && field934 >= 0 && field934 < field1050.length) {
                                                        class87 var62 = field1050[field934];
                                                        if (var62 != null) {
                                                            int var63 = var62.field1211 / 32 - Statics.field3110.field1211 / 32;
                                                            int var64 = var62.field1219 / 32 - Statics.field3110.field1219 / 32;
                                                            method1419(var13, var14, var63, var64, Statics.field389[1], var35);
                                                        }
                                                    }
                                                    if (field993 == 2) {
                                                        int var65 = field1044 * 4 - Statics.field329 * 4 + 2 - Statics.field3110.field1211 / 32;
                                                        int var66 = field937 * 4 - Statics.field2282 * 4 + 2 - Statics.field3110.field1219 / 32;
                                                        method1419(var13, var14, var65, var66, Statics.field389[1], var35);
                                                    }
                                                    if (field993 == 10 && field1151 >= 0 && field1151 < field1070.length) {
                                                        class75 var67 = field1070[field1151];
                                                        if (var67 != null) {
                                                            int var68 = var67.field1211 / 32 - Statics.field3110.field1211 / 32;
                                                            int var69 = var67.field1219 / 32 - Statics.field3110.field1219 / 32;
                                                            method1419(var13, var14, var68, var69, Statics.field389[1], var35);
                                                        }
                                                    }
                                                }
                                                if (field1017 != 0) {
                                                    int var70 = field1017 * 4 + 2 - Statics.field3110.field1211 / 32;
                                                    int var71 = field1138 * 4 + 2 - Statics.field3110.field1219 / 32;
                                                    method1528(var13, var14, var70, var71, Statics.field389[0], var35);
                                                }
                                                if (!Statics.field3110.field894) {
                                                    class282.method4510(var35.field2570 / 2 + var13 - 1, var35.field2567 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var43 = 0; var43 < 104; var43++) {
                                                class194 var44 = field1035[Statics.field251][var42][var43];
                                                if (var44 != null) {
                                                    int var45 = var42 * 4 + 2 - Statics.field3110.field1211 / 32;
                                                    int var46 = var43 * 4 + 2 - Statics.field3110.field1219 / 32;
                                                    method1528(var13, var14, var45, var46, Statics.field376[0], var35);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                    field1065[var11] = true;
                                }
                                class282.method4528(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2622 == 1339) {
                                method231(var10, var13, var14, var11);
                                class282.method4528(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2622 == 1400) {
                                Statics.field991.method4777(var13, var14, var10.field2714, var10.field2634, field929);
                            }
                            if (var10.field2622 == 1401) {
                                Statics.field991.method4778(var13, var14, var10.field2714, var10.field2634);
                            }
                        }
                        if (var10.field2620 == 0) {
                            if (!var10.field2617 && method47(var10) && Statics.field15 != var10) {
                                continue;
                            }
                            if (!var10.field2617) {
                                if (var10.field2627 > var10.field2733 - var10.field2634) {
                                    var10.field2627 = var10.field2733 - var10.field2634;
                                }
                                if (var10.field2627 < 0) {
                                    var10.field2627 = 0;
                                }
                            }
                            method1357(arg0, var10.field2683, var20, var21, var22, var23, var13 - var10.field2639, var14 - var10.field2627, var11);
                            if (var10.field2742 != null) {
                                method1357(var10.field2742, var10.field2683, var20, var21, var22, var23, var13 - var10.field2639, var14 - var10.field2627, var11);
                            }
                            class69 var72 = (class69) field1066.method3251((long) var10.field2683);
                            if (var72 != null) {
                                method2604(var72.field825, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class282.method4528(arg2, arg3, arg4, arg5);
                            class137.method2331();
                        }
                        if (field1119 || field1112[var11] || field1117 > 1) {
                            if (var10.field2620 == 0 && !var10.field2617 && var10.field2733 > var10.field2634) {
                                int var73 = var10.field2714 + var13;
                                int var74 = var10.field2627;
                                int var75 = var10.field2634;
                                int var76 = var10.field2733;
                                Statics.field3180[0].method4614(var73, var14);
                                Statics.field3180[1].method4614(var73, var14 + var75 - 16);
                                class282.method4510(var73, var14 + 16, 16, var75 - 32, field981);
                                int var77 = (var75 - 32) * var75 / var76;
                                if (var77 < 8) {
                                    var77 = 8;
                                }
                                int var78 = (var75 - 32 - var77) * var74 / (var76 - var75);
                                class282.method4510(var73, var14 + 16 + var78, 16, var77, field1033);
                                class282.method4546(var73, var14 + 16 + var78, var77, field1128);
                                class282.method4546(var73 + 1, var14 + 16 + var78, var77, field1128);
                                class282.method4519(var73, var14 + 16 + var78, 16, field1128);
                                class282.method4519(var73, var14 + 17 + var78, 16, field1128);
                                class282.method4546(var73 + 15, var14 + 16 + var78, var77, field983);
                                class282.method4546(var73 + 14, var14 + 17 + var78, var77 - 1, field983);
                                class282.method4519(var73, var14 + 15 + var78 + var77, 16, field983);
                                class282.method4519(var73 + 1, var14 + 14 + var78 + var77, 15, field983);
                            }
                            if (var10.field2620 != 1) {
                                if (var10.field2620 == 2) {
                                    int var79 = 0;
                                    for (int var80 = 0; var80 < var10.field2630; var80++) {
                                        for (int var81 = 0; var81 < var10.field2629; var81++) {
                                            int var82 = (var10.field2684 + 32) * var81 + var13;
                                            int var83 = (var10.field2704 + 32) * var80 + var14;
                                            if (var79 < 20) {
                                                var82 += var10.field2686[var79];
                                                var83 += var10.field2678[var79];
                                            }
                                            if (var10.field2736[var79] > 0) {
                                                boolean var84 = false;
                                                boolean var85 = false;
                                                int var86 = var10.field2736[var79] - 1;
                                                if (var82 + 32 > arg2 && var82 < arg4 && var83 + 32 > arg3 && var83 < arg5 || Statics.field282 == var10 && field989 == var79) {
                                                    class286 var87;
                                                    if (field1058 == 1 && Statics.field355 == var79 && Statics.field233 == var10.field2683) {
                                                        var87 = Statics.method2112(var86, var10.field2737[var79], 2, 0, 2, false);
                                                    } else {
                                                        var87 = Statics.method2112(var86, var10.field2737[var79], 1, 3153952, 2, false);
                                                    }
                                                    if (var87 == null) {
                                                        method148(var10);
                                                    } else if (Statics.field282 == var10 && field989 == var79) {
                                                        int var88 = class60.field731 - field1144;
                                                        int var89 = class60.field732 - field1020;
                                                        if (var88 < 5 && var88 > -5) {
                                                            var88 = 0;
                                                        }
                                                        if (var89 < 5 && var89 > -5) {
                                                            var89 = 0;
                                                        }
                                                        if (field1023 < 5) {
                                                            var88 = 0;
                                                            var89 = 0;
                                                        }
                                                        var87.method4697(var82 + var88, var83 + var89, 128);
                                                        if (arg1 != -1) {
                                                            class217 var90 = arg0[arg1 & 0xFFFF];
                                                            if (var83 + var89 < class282.field3744 && var90.field2627 > 0) {
                                                                int var91 = field1067 * (class282.field3744 - var83 - var89) / 3;
                                                                if (var91 > field1067 * 10) {
                                                                    var91 = field1067 * 10;
                                                                }
                                                                if (var91 > var90.field2627) {
                                                                    var91 = var90.field2627;
                                                                }
                                                                var90.field2627 -= var91;
                                                                field1020 += var91;
                                                                method148(var90);
                                                            }
                                                            if (var83 + var89 + 32 > class282.field3742 && var90.field2627 < var90.field2733 - var90.field2634) {
                                                                int var92 = field1067 * (var83 + var89 + 32 - class282.field3742) / 3;
                                                                if (var92 > field1067 * 10) {
                                                                    var92 = field1067 * 10;
                                                                }
                                                                if (var92 > var90.field2733 - var90.field2634 - var90.field2627) {
                                                                    var92 = var90.field2733 - var90.field2634 - var90.field2627;
                                                                }
                                                                var90.field2627 += var92;
                                                                field1020 -= var92;
                                                                method148(var90);
                                                            }
                                                        }
                                                    } else if (Statics.field263 == var10 && field1183 == var79) {
                                                        var87.method4697(var82, var83, 128);
                                                    } else {
                                                        var87.method4631(var82, var83);
                                                    }
                                                }
                                            } else if (var10.field2688 != null && var79 < 20) {
                                                class286 var93 = var10.method3656(var79);
                                                if (var93 != null) {
                                                    var93.method4631(var82, var83);
                                                } else if (class217.field2675) {
                                                    method148(var10);
                                                }
                                            }
                                            var79++;
                                        }
                                    }
                                } else if (var10.field2620 == 3) {
                                    int var94;
                                    if (method1836(var10)) {
                                        var94 = var10.field2644;
                                        if (Statics.field15 == var10 && var10.field2646 != 0) {
                                            var94 = var10.field2646;
                                        }
                                    } else {
                                        var94 = var10.field2607;
                                        if (Statics.field15 == var10 && var10.field2633 != 0) {
                                            var94 = var10.field2633;
                                        }
                                    }
                                    if (var10.field2647) {
                                        switch(var10.field2648.field3752) {
                                            case 1:
                                                class282.method4511(var13, var14, var10.field2714, var10.field2634, var10.field2607, var10.field2644, 256 - (var10.field2649 & 0xFF), 256 - (var10.field2650 & 0xFF));
                                                break;
                                            case 2:
                                                class282.method4504(var13, var14, var10.field2714, var10.field2634, var10.field2607, var10.field2644, 256 - (var10.field2649 & 0xFF), 256 - (var10.field2650 & 0xFF));
                                                break;
                                            case 3:
                                                class282.method4544(var13, var14, var10.field2714, var10.field2634, var10.field2607, var10.field2644, 256 - (var10.field2649 & 0xFF), 256 - (var10.field2650 & 0xFF));
                                                break;
                                            case 4:
                                                class282.method4514(var13, var14, var10.field2714, var10.field2634, var10.field2607, var10.field2644, 256 - (var10.field2649 & 0xFF), 256 - (var10.field2650 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class282.method4510(var13, var14, var10.field2714, var10.field2634, var94);
                                                } else {
                                                    class282.method4499(var13, var14, var10.field2714, var10.field2634, var94, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class282.method4523(var13, var14, var10.field2714, var10.field2634, var94);
                                    } else {
                                        class282.method4518(var13, var14, var10.field2714, var10.field2634, var94, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2620 == 4) {
                                    class264 var95 = var10.method3638();
                                    if (var95 != null) {
                                        String var96 = var10.field2667;
                                        int var97;
                                        if (method1836(var10)) {
                                            var97 = var10.field2644;
                                            if (Statics.field15 == var10 && var10.field2646 != 0) {
                                                var97 = var10.field2646;
                                            }
                                            if (var10.field2679.length() > 0) {
                                                var96 = var10.field2679;
                                            }
                                        } else {
                                            var97 = var10.field2607;
                                            if (Statics.field15 == var10 && var10.field2633 != 0) {
                                                var97 = var10.field2633;
                                            }
                                        }
                                        if (var10.field2617 && var10.field2726 != -1) {
                                            class257 var98 = class257.method44(var10.field2726);
                                            var96 = var98.field3474;
                                            if (var96 == null) {
                                                var96 = "null";
                                            }
                                            if ((var98.field3485 == 1 || var10.field2636 != 1) && var10.field2636 != -1) {
                                                var96 = class89.method40(16748608) + var96 + class89.field1376 + " " + 'x' + method1524(var10.field2636);
                                            }
                                        }
                                        if (field1069 == var10) {
                                            class226 var10000 = (class226) null;
                                            var96 = class226.field2983;
                                            var97 = var10.field2607;
                                        }
                                        if (!var10.field2617) {
                                            var96 = method947(var96, var10);
                                        }
                                        var95.method4335(var96, var13, var14, var10.field2714, var10.field2634, var97, var10.field2716 ? 0 : -1, var10.field2719, var10.field2682, var10.field2645);
                                    } else if (class217.field2675) {
                                        method148(var10);
                                    }
                                } else if (var10.field2620 == 5) {
                                    if (var10.field2617) {
                                        class286 var100;
                                        if (var10.field2726 == -1) {
                                            var100 = var10.method3657(false);
                                        } else {
                                            var100 = Statics.method2112(var10.field2726, var10.field2636, var10.field2655, var10.field2658, var10.field2676, false);
                                        }
                                        if (var100 != null) {
                                            int var101 = var100.field3773;
                                            int var102 = var100.field3774;
                                            if (var10.field2656) {
                                                class282.method4591(var13, var14, var10.field2714 + var13, var10.field2634 + var14);
                                                int var103 = (var10.field2714 + (var101 - 1)) / var101;
                                                int var104 = (var10.field2634 + (var102 - 1)) / var102;
                                                for (int var105 = 0; var105 < var103; var105++) {
                                                    for (int var106 = 0; var106 < var104; var106++) {
                                                        if (var10.field2708 != 0) {
                                                            var100.method4644(var101 / 2 + var101 * var105 + var13, var102 / 2 + var102 * var106 + var14, var10.field2708, 4096);
                                                        } else if (var15 == 0) {
                                                            var100.method4631(var101 * var105 + var13, var102 * var106 + var14);
                                                        } else {
                                                            var100.method4697(var101 * var105 + var13, var102 * var106 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class282.method4528(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var107 = var10.field2714 * 4096 / var101;
                                                if (var10.field2708 != 0) {
                                                    var100.method4644(var10.field2714 / 2 + var13, var10.field2634 / 2 + var14, var10.field2708, var107);
                                                } else if (var15 != 0) {
                                                    var100.method4639(var13, var14, var10.field2714, var10.field2634, 256 - (var15 & 0xFF));
                                                } else if (var10.field2714 == var101 && var10.field2634 == var102) {
                                                    var100.method4631(var13, var14);
                                                } else {
                                                    var100.method4633(var13, var14, var10.field2714, var10.field2634);
                                                }
                                            }
                                        } else if (class217.field2675) {
                                            method148(var10);
                                        }
                                    } else {
                                        class286 var99 = var10.method3657(method1836(var10));
                                        if (var99 != null) {
                                            var99.method4631(var13, var14);
                                        } else if (class217.field2675) {
                                            method148(var10);
                                        }
                                    }
                                } else if (var10.field2620 == 6) {
                                    boolean var108 = method1836(var10);
                                    int var109;
                                    if (var108) {
                                        var109 = var10.field2666;
                                    } else {
                                        var109 = var10.field2665;
                                    }
                                    class134 var110 = null;
                                    int var111 = 0;
                                    if (var10.field2726 != -1) {
                                        class257 var112 = class257.method44(var10.field2726);
                                        if (var112 != null) {
                                            class257 var113 = var112.method4144(var10.field2636);
                                            var110 = var113.method4188(1);
                                            if (var110 == null) {
                                                method148(var10);
                                            } else {
                                                var110.method2240();
                                                var111 = var110.field2085 / 2;
                                            }
                                        }
                                    } else if (var10.field2661 == 5) {
                                        if (var10.field2725 == 0) {
                                            var110 = field1081.method3603((class261) null, -1, (class261) null, -1);
                                        } else {
                                            var110 = Statics.field3110.method983();
                                        }
                                    } else if (var109 == -1) {
                                        var110 = var10.method3640((class261) null, -1, var108, Statics.field3110.field888);
                                        if (var110 == null && class217.field2675) {
                                            method148(var10);
                                        }
                                    } else {
                                        class261 var114 = Statics.method240(var109);
                                        var110 = var10.method3640(var114, var10.field2740, var108, Statics.field3110.field888);
                                        if (var110 == null && class217.field2675) {
                                            method148(var10);
                                        }
                                    }
                                    class137.method2409(var10.field2714 / 2 + var13, var10.field2634 / 2 + var14);
                                    int var115 = var10.field2623 * class137.field1983[var10.field2712] >> 16;
                                    int var116 = var10.field2623 * class137.field1973[var10.field2712] >> 16;
                                    if (var110 != null) {
                                        if (var10.field2617) {
                                            var110.method2240();
                                            if (var10.field2681) {
                                                var110.method2253(0, var10.field2670, var10.field2671, var10.field2712, var10.field2662, var10.field2668 + var111 + var115, var10.field2668 + var116, var10.field2623);
                                            } else {
                                                var110.method2283(0, var10.field2670, var10.field2671, var10.field2712, var10.field2662, var10.field2668 + var111 + var115, var10.field2668 + var116);
                                            }
                                        } else {
                                            var110.method2283(0, var10.field2670, 0, var10.field2712, 0, var115, var116);
                                        }
                                    }
                                    class137.method2335();
                                } else {
                                    if (var10.field2620 == 7) {
                                        class264 var117 = var10.method3638();
                                        if (var117 == null) {
                                            if (class217.field2675) {
                                                method148(var10);
                                            }
                                            continue;
                                        }
                                        int var118 = 0;
                                        for (int var119 = 0; var119 < var10.field2630; var119++) {
                                            for (int var120 = 0; var120 < var10.field2629; var120++) {
                                                if (var10.field2736[var118] > 0) {
                                                    class257 var121 = class257.method44(var10.field2736[var118] - 1);
                                                    String var122;
                                                    if (var121.field3485 != 1 && var10.field2737[var118] == 1) {
                                                        var122 = class89.method40(16748608) + var121.field3474 + class89.field1376;
                                                    } else {
                                                        var122 = class89.method40(16748608) + var121.field3474 + class89.field1376 + " " + 'x' + method1524(var10.field2737[var118]);
                                                    }
                                                    int var123 = (var10.field2684 + 115) * var120 + var13;
                                                    int var124 = (var10.field2704 + 12) * var119 + var14;
                                                    if (var10.field2719 == 0) {
                                                        var117.method4331(var122, var123, var124, var10.field2607, var10.field2716 ? 0 : -1);
                                                    } else if (var10.field2719 == 1) {
                                                        var117.method4334(var122, var10.field2714 / 2 + var123, var124, var10.field2607, var10.field2716 ? 0 : -1);
                                                    } else {
                                                        var117.method4364(var122, var10.field2714 + var123 - 1, var124, var10.field2607, var10.field2716 ? 0 : -1);
                                                    }
                                                }
                                                var118++;
                                            }
                                        }
                                    }
                                    if (var10.field2620 == 8 && Statics.field617 == var10 && field918 == field1122) {
                                        int var125 = 0;
                                        int var126 = 0;
                                        class264 var127 = Statics.field1626;
                                        String var128 = var10.field2667;
                                        String var129 = method947(var128, var10);
                                        while (var129.length() > 0) {
                                            int var130 = var129.indexOf(class89.field1372);
                                            String var131;
                                            if (var130 == -1) {
                                                var131 = var129;
                                                var129 = "";
                                            } else {
                                                var131 = var129.substring(0, var130);
                                                var129 = var129.substring(var130 + 4);
                                            }
                                            int var132 = var127.method4326(var131);
                                            if (var132 > var125) {
                                                var125 = var132;
                                            }
                                            var126 += var127.field3626 + 1;
                                        }
                                        var125 += 6;
                                        var126 += 7;
                                        int var133 = var10.field2714 + var13 - 5 - var125;
                                        int var134 = var10.field2634 + var14 + 5;
                                        if (var133 < var13 + 5) {
                                            var133 = var13 + 5;
                                        }
                                        if (var125 + var133 > arg4) {
                                            var133 = arg4 - var125;
                                        }
                                        if (var126 + var134 > arg5) {
                                            var134 = arg5 - var126;
                                        }
                                        class282.method4510(var133, var134, var125, var126, 16777120);
                                        class282.method4523(var133, var134, var125, var126, 0);
                                        String var135 = var10.field2667;
                                        int var136 = var127.field3626 + var134 + 2;
                                        String var137 = method947(var135, var10);
                                        while (var137.length() > 0) {
                                            int var138 = var137.indexOf(class89.field1372);
                                            String var139;
                                            if (var138 == -1) {
                                                var139 = var137;
                                                var137 = "";
                                            } else {
                                                var139 = var137.substring(0, var138);
                                                var137 = var137.substring(var138 + 4);
                                            }
                                            var127.method4331(var139, var133 + 3, var136, 0, -1);
                                            var136 += var127.field3626 + 1;
                                        }
                                    }
                                    if (var10.field2620 == 9) {
                                        int var140;
                                        int var141;
                                        int var142;
                                        int var143;
                                        if (var10.field2664) {
                                            var140 = var13;
                                            var141 = var10.field2634 + var14;
                                            var142 = var10.field2714 + var13;
                                            var143 = var14;
                                        } else {
                                            var140 = var13;
                                            var141 = var14;
                                            var142 = var10.field2714 + var13;
                                            var143 = var10.field2634 + var14;
                                        }
                                        if (var10.field2651 == 1) {
                                            class282.method4502(var140, var141, var142, var143, var10.field2607);
                                        } else {
                                            method886(var140, var141, var142, var143, var10.field2607, var10.field2651);
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

    @ObfuscatedName("bn.hg(IIIIIIB)V")
    public static final void method886(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        int var8 = var6 >= 0 ? var6 : -var6;
        int var9 = var7 >= 0 ? var7 : -var7;
        int var10 = var8;
        if (var8 < var9) {
            var10 = var9;
        }
        if (var10 == 0) {
            return;
        }
        int var11 = (var6 << 16) / var10;
        int var12 = (var7 << 16) / var10;
        if (var12 <= var11) {
            var11 = -var11;
        } else {
            var12 = -var12;
        }
        int var13 = arg5 * var12 >> 17;
        int var14 = arg5 * var12 + 1 >> 17;
        int var15 = arg5 * var11 >> 17;
        int var16 = arg5 * var11 + 1 >> 17;
        int var17 = arg0 - class282.field3745;
        int var18 = arg1 - class282.field3744;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class137.method2401(var19, var20, var21);
        class137.method2342(var23, var24, var25, var19, var20, var21, arg4);
        class137.method2401(var19, var21, var22);
        class137.method2342(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("bs.hk(Ljava/lang/String;Lho;I)Ljava/lang/String;")
    public static String method947(String arg0, class217 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method3076(arg1, var2 - 1);
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
                if (Statics.field374 != null) {
                    var8 = class271.method882(Statics.field374.field2191);
                    if (Statics.field374.field2193 != null) {
                        var8 = (String) Statics.field374.field2193;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cj.hr(IB)Ljava/lang/String;")
    public static final String method1524(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class89.field1370 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class89.method40(65408) + var1.substring(0, var1.length() - 8) + class226.field2986 + " " + class89.field1377 + var1 + class89.field1373 + class89.field1376;
        } else if (var1.length() > 6) {
            return " " + class89.method40(16777215) + var1.substring(0, var1.length() - 4) + class226.field3026 + " " + class89.field1377 + var1 + class89.field1373 + class89.field1376;
        } else {
            return " " + class89.method40(16776960) + var1 + class89.field1376;
        }
    }

    @ObfuscatedName("client.hi(ZI)V")
    public final void method1053(boolean arg0) {
        int var2 = field940;
        int var3 = Statics.field584;
        int var4 = Statics.field248;
        if (class217.method42(var2)) {
            method504(Statics.field2616[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.hv(Lho;S)V")
    public void method1143(class217 arg0) {
        class217 var2 = arg0.field2637 == -1 ? null : class217.method3861(arg0.field2637);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field584;
            var4 = Statics.field248;
        } else {
            var3 = var2.field2714;
            var4 = var2.field2634;
        }
        method2327(arg0, var3, var4, false);
        method2328(arg0, var3, var4);
    }

    @ObfuscatedName("bx.hq([Lho;Lho;ZB)V")
    public static void method1353(class217[] arg0, class217 arg1, boolean arg2) {
        int var3 = arg1.field2641 == 0 ? arg1.field2714 : arg1.field2641;
        int var4 = arg1.field2733 == 0 ? arg1.field2634 : arg1.field2733;
        method504(arg0, arg1.field2683, var3, var4, arg2);
        if (arg1.field2742 != null) {
            method504(arg1.field2742, arg1.field2683, var3, var4, arg2);
        }
        class69 var5 = (class69) field1066.method3251((long) arg1.field2683);
        if (var5 != null) {
            int var6 = var5.field825;
            if (class217.method42(var6)) {
                method504(Statics.field2616[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2622 == 1337) {
        }
    }

    @ObfuscatedName("ae.hz([Lho;IIIZB)V")
    public static void method504(class217[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class217 var6 = arg0[var5];
            if (var6 != null && var6.field2637 == arg1) {
                method2327(var6, arg2, arg3, arg4);
                method2328(var6, arg2, arg3);
                if (var6.field2639 > var6.field2641 - var6.field2714) {
                    var6.field2639 = var6.field2641 - var6.field2714;
                }
                if (var6.field2639 < 0) {
                    var6.field2639 = 0;
                }
                if (var6.field2627 > var6.field2733 - var6.field2634) {
                    var6.field2627 = var6.field2733 - var6.field2634;
                }
                if (var6.field2627 < 0) {
                    var6.field2627 = 0;
                }
                if (var6.field2620 == 0) {
                    method1353(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ek.hd(Lho;IIZB)V")
    public static void method2327(class217 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2714;
        int var5 = arg0.field2634;
        if (arg0.field2625 == 0) {
            arg0.field2714 = arg0.field2629;
        } else if (arg0.field2625 == 1) {
            arg0.field2714 = arg1 - arg0.field2629;
        } else if (arg0.field2625 == 2) {
            arg0.field2714 = arg0.field2629 * arg1 >> 14;
        }
        if (arg0.field2626 == 0) {
            arg0.field2634 = arg0.field2630;
        } else if (arg0.field2626 == 1) {
            arg0.field2634 = arg2 - arg0.field2630;
        } else if (arg0.field2626 == 2) {
            arg0.field2634 = arg0.field2630 * arg2 >> 14;
        }
        if (arg0.field2625 == 4) {
            arg0.field2714 = arg0.field2635 * arg0.field2634 / arg0.field2750;
        }
        if (arg0.field2626 == 4) {
            arg0.field2634 = arg0.field2750 * arg0.field2714 / arg0.field2635;
        }
        if (field1075 && arg0.field2620 == 0) {
            if (arg0.field2634 < 5 && arg0.field2714 < 5) {
                arg0.field2634 = 5;
                arg0.field2714 = 5;
            } else {
                if (arg0.field2634 <= 0) {
                    arg0.field2634 = 5;
                }
                if (arg0.field2714 <= 0) {
                    arg0.field2714 = 5;
                }
            }
        }
        if (arg0.field2622 == 1337) {
            field978 = arg0;
        }
        if (arg3 && arg0.field2673 != null && (arg0.field2714 != var4 || arg0.field2634 != var5)) {
            class70 var6 = new class70();
            var6.field830 = arg0;
            var6.field832 = arg0.field2673;
            field1104.method3290(var6);
        }
    }

    @ObfuscatedName("ek.hb(Lho;III)V")
    public static void method2328(class217 arg0, int arg1, int arg2) {
        if (arg0.field2715 == 0) {
            arg0.field2631 = arg0.field2672;
        } else if (arg0.field2715 == 1) {
            arg0.field2631 = (arg1 - arg0.field2714) / 2 + arg0.field2672;
        } else if (arg0.field2715 == 2) {
            arg0.field2631 = arg1 - arg0.field2714 - arg0.field2672;
        } else if (arg0.field2715 == 3) {
            arg0.field2631 = arg0.field2672 * arg1 >> 14;
        } else if (arg0.field2715 == 4) {
            arg0.field2631 = (arg0.field2672 * arg1 >> 14) + (arg1 - arg0.field2714) / 2;
        } else {
            arg0.field2631 = arg1 - arg0.field2714 - (arg0.field2672 * arg1 >> 14);
        }
        if (arg0.field2624 == 0) {
            arg0.field2632 = arg0.field2628;
        } else if (arg0.field2624 == 1) {
            arg0.field2632 = (arg2 - arg0.field2634) / 2 + arg0.field2628;
        } else if (arg0.field2624 == 2) {
            arg0.field2632 = arg2 - arg0.field2634 - arg0.field2628;
        } else if (arg0.field2624 == 3) {
            arg0.field2632 = arg0.field2628 * arg2 >> 14;
        } else if (arg0.field2624 == 4) {
            arg0.field2632 = (arg0.field2628 * arg2 >> 14) + (arg2 - arg0.field2634) / 2;
        } else {
            arg0.field2632 = arg2 - arg0.field2634 - (arg0.field2628 * arg2 >> 14);
        }
        if (!field1075 || arg0.field2620 != 0) {
            return;
        }
        if (arg0.field2631 < 0) {
            arg0.field2631 = 0;
        } else if (arg0.field2714 + arg0.field2631 > arg1) {
            arg0.field2631 = arg1 - arg0.field2714;
        }
        if (arg0.field2632 < 0) {
            arg0.field2632 = 0;
        } else if (arg0.field2634 + arg0.field2632 > arg2) {
            arg0.field2632 = arg2 - arg0.field2634;
        }
    }

    @ObfuscatedName("aj.hh(Lho;IIIIIII)V")
    public static final void method203(class217 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field1077) {
            field986 = 32;
        } else {
            field986 = 0;
        }
        field1077 = false;
        if (class60.field734 == 1 || !Statics.field700 && class60.field734 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2627 -= 4;
                method148(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2627 += 4;
                method148(arg0);
            } else if (arg5 >= arg1 - field986 && arg5 < field986 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2627 = (arg4 - arg3) * var8 / var9;
                method148(arg0);
                field1077 = true;
            }
        }
        if (field1103 == 0) {
            return;
        }
        int var10 = arg0.field2714;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2627 += field1103 * 45;
            method148(arg0);
        }
    }

    @ObfuscatedName("di.hj(Lho;B)Z")
    public static final boolean method1836(class217 arg0) {
        if (arg0.field2731 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2731.length; var1++) {
            int var2 = method3076(arg0, var1);
            int var3 = arg0.field2642[var1];
            if (arg0.field2731[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2731[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2731[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fe.hn(Lho;IB)I")
    public static final int method3076(class217 arg0, int arg1) {
        if (arg0.field2730 == null || arg1 >= arg0.field2730.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2730[arg1];
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
                    var7 = field1120[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field945[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1041[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class217 var11 = class217.method3861(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class257.method44(var12).field3487 || field996)) {
                        for (int var13 = 0; var13 < var11.field2736.length; var13++) {
                            if (var12 + 1 == var11.field2736[var13]) {
                                var7 += var11.field2737[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class212.field2573[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class223.field2818[field945[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class212.field2573[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field3110.field880;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class223.field2814[var14]) {
                            var7 += field945[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class217 var17 = class217.method3861(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class257.method44(var18).field3487 || field996)) {
                        for (int var19 = 0; var19 < var17.field2736.length; var19++) {
                            if (var18 + 1 == var17.field2736[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1145;
                }
                if (var6 == 12) {
                    var7 = field1096;
                }
                if (var6 == 13) {
                    int var20 = class212.field2573[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class212.method117(var22);
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
                    var7 = (Statics.field3110.field1211 >> 7) + Statics.field329;
                }
                if (var6 == 19) {
                    var7 = (Statics.field3110.field1219 >> 7) + Statics.field2282;
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

    @ObfuscatedName("ak.hl(Lho;Lic;IIZB)V")
    public static final void method429(class217 arg0, class257 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3508;
        byte var6 = -1;
        String var7 = null;
        if (var5 != null && var5[arg3] != null) {
            if (arg3 == 0) {
                var6 = 33;
            } else if (arg3 == 1) {
                var6 = 34;
            } else if (arg3 == 2) {
                var6 = 35;
            } else if (arg3 == 3) {
                var6 = 36;
            } else {
                var6 = 37;
            }
            var7 = var5[arg3];
        } else if (arg3 == 4) {
            var6 = 37;
            var7 = class226.field2934;
        }
        if (var6 == -1 || var7 == null) {
            return;
        }
        String var9 = class89.method40(16748608) + arg1.field3474;
        int var11 = arg1.field3472;
        int var13 = arg0.field2683;
        if (field1043 || field1176 >= 500) {
            return;
        }
        field1049[field1176] = var7;
        field1114[field1176] = var9;
        field1047[field1176] = var6;
        field1111[field1176] = var11;
        field1155[field1176] = arg2;
        field1046[field1176] = var13;
        field985[field1176] = arg4;
        field1176++;
    }

    @ObfuscatedName("bb.he(Lho;III)V")
    public static final void method978(class217 arg0, int arg1, int arg2) {
        if (arg0.field2621 == 1) {
            method4305(arg0.field2735, "", 24, 0, 0, arg0.field2683);
        }
        if (arg0.field2621 == 2 && !field1125) {
            int var3 = method887(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2697 == null || arg0.field2697.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2697;
            }
            if (var5 != null) {
                method4305(var5, class89.method40(65280) + arg0.field2734, 25, 0, -1, arg0.field2683);
            }
        }
        if (arg0.field2621 == 3) {
            method4305(class226.field2984, "", 26, 0, 0, arg0.field2683);
        }
        if (arg0.field2621 == 4) {
            method4305(arg0.field2735, "", 28, 0, 0, arg0.field2683);
        }
        if (arg0.field2621 == 5) {
            method4305(arg0.field2735, "", 29, 0, 0, arg0.field2683);
        }
        if (arg0.field2621 == 6 && field1069 == null) {
            method4305(arg0.field2735, "", 30, 0, -1, arg0.field2683);
        }
        if (arg0.field2620 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2634; var8++) {
                for (int var9 = 0; var9 < arg0.field2714; var9++) {
                    int var10 = (arg0.field2684 + 32) * var9;
                    int var11 = (arg0.field2704 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2686[var7];
                        var11 += arg0.field2678[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field1021 = var7;
                        Statics.field2371 = arg0;
                        if (arg0.field2736[var7] > 0) {
                            label307: {
                                class257 var12 = class257.method44(arg0.field2736[var7] - 1);
                                if (field1058 == 1) {
                                    int var13 = method887(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        if (Statics.field233 != arg0.field2683 || Statics.field355 != var7) {
                                            method4305(class226.field2975, field1059 + " " + class89.field1375 + " " + class89.method40(16748608) + var12.field3474, 31, var12.field3472, var7, arg0.field2683);
                                        }
                                        break label307;
                                    }
                                }
                                if (field1125) {
                                    int var15 = method887(arg0);
                                    boolean var16 = (var15 >> 30 & 0x1) != 0;
                                    if (var16) {
                                        if ((Statics.field535 & 0x10) == 16) {
                                            method4305(field1063, field1064 + " " + class89.field1375 + " " + class89.method40(16748608) + var12.field3474, 32, var12.field3472, var7, arg0.field2683);
                                        }
                                        break label307;
                                    }
                                }
                                String[] var17 = var12.field3508;
                                if (field1175) {
                                    var17 = method3809(var17);
                                }
                                int var18 = -1;
                                if (field1053 && class51.field637[81]) {
                                    var18 = var12.method4143();
                                }
                                int var19 = method887(arg0);
                                boolean var20 = (var19 >> 30 & 0x1) != 0;
                                if (var20) {
                                    for (int var21 = 4; var21 >= 3; var21--) {
                                        if (var18 != var21) {
                                            method429(arg0, var12, var7, var21, false);
                                        }
                                    }
                                }
                                int var22 = method887(arg0);
                                boolean var23 = (var22 >> 31 & 0x1) != 0;
                                if (var23) {
                                    method4305(class226.field2975, class89.method40(16748608) + var12.field3474, 38, var12.field3472, var7, arg0.field2683);
                                }
                                int var24 = method887(arg0);
                                boolean var25 = (var24 >> 30 & 0x1) != 0;
                                if (var25) {
                                    if (var17 != null) {
                                        for (int var26 = 2; var26 >= 0; var26--) {
                                            if (var18 != var26) {
                                                method429(arg0, var12, var7, var26, false);
                                            }
                                        }
                                    }
                                    if (var18 >= 0) {
                                        method429(arg0, var12, var7, var18, true);
                                    }
                                }
                                String[] var27 = arg0.field2689;
                                if (field1175) {
                                    var27 = method3809(var27);
                                }
                                if (var27 != null) {
                                    for (int var28 = 4; var28 >= 0; var28--) {
                                        if (var27[var28] != null) {
                                            byte var29 = 0;
                                            if (var28 == 0) {
                                                var29 = 39;
                                            }
                                            if (var28 == 1) {
                                                var29 = 40;
                                            }
                                            if (var28 == 2) {
                                                var29 = 41;
                                            }
                                            if (var28 == 3) {
                                                var29 = 42;
                                            }
                                            if (var28 == 4) {
                                                var29 = 43;
                                            }
                                            method4305(var27[var28], class89.method40(16748608) + var12.field3474, var29, var12.field3472, var7, arg0.field2683);
                                        }
                                    }
                                }
                                method4305(class226.field2976, class89.method40(16748608) + var12.field3474, 1005, var12.field3472, var7, arg0.field2683);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2617) {
            return;
        }
        if (!field1125) {
            for (int var30 = 9; var30 >= 5; var30--) {
                String var31 = method656(arg0, var30);
                if (var31 != null) {
                    method4305(var31, arg0.field2721, 1007, var30 + 1, arg0.field2619, arg0.field2683);
                }
            }
            int var32 = method887(arg0);
            int var33 = var32 >> 11 & 0x3F;
            String var34;
            if (var33 == 0) {
                var34 = null;
            } else if (arg0.field2697 == null || arg0.field2697.trim().length() == 0) {
                var34 = null;
            } else {
                var34 = arg0.field2697;
            }
            if (var34 != null) {
                method4305(var34, arg0.field2721, 25, 0, arg0.field2619, arg0.field2683);
            }
            for (int var36 = 4; var36 >= 0; var36--) {
                String var37 = method656(arg0, var36);
                if (var37 != null) {
                    method4305(var37, arg0.field2721, 57, var36 + 1, arg0.field2619, arg0.field2683);
                }
            }
            int var38 = method887(arg0);
            boolean var39 = (var38 & 0x1) != 0;
            if (var39) {
                method4305(class226.field3066, "", 30, 0, arg0.field2619, arg0.field2683);
            }
        } else if (class218.method2704(method887(arg0)) && (Statics.field535 & 0x20) == 32) {
            method4305(field1063, field1064 + " " + class89.field1375 + " " + arg0.field2721, 58, 0, arg0.field2619, arg0.field2683);
        }
    }

    @ObfuscatedName("ag.hx(IIIIIIIB)V")
    public static final void method230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class217.method42(arg0)) {
            method8(Statics.field2616[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("i.im([Lho;IIIIIIII)V")
    public static final void method8(class217[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class217 var9 = arg0[var8];
            if (var9 != null && (!var9.field2617 || var9.field2620 == 0 || var9.field2698 || method887(var9) != 0 || field1148 == var9 || var9.field2622 == 1338) && var9.field2637 == arg1 && (!var9.field2617 || !method47(var9))) {
                int var10 = var9.field2631 + arg6;
                int var11 = var9.field2632 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2620 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2620 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2714 + var10;
                    int var19 = var9.field2634 + var11;
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
                    int var22 = var9.field2714 + var10;
                    int var23 = var9.field2634 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1078 == var9) {
                    field1086 = true;
                    field1087 = var10;
                    field932 = var11;
                }
                if (!var9.field2617 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field731;
                    int var25 = class60.field732;
                    if (class60.field730 != 0) {
                        var24 = class60.field738;
                        var25 = class60.field724;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2622 == 1337) {
                        if (!field923 && !field1043 && var26) {
                            method2610(var24, var25, var12, var13);
                        }
                    } else if (var9.field2622 == 1338) {
                        method843(var9, var10, var11);
                    } else {
                        if (var9.field2622 == 1400) {
                            Statics.field991.method4763(class60.field731, class60.field732, var26, var10, var11, var9.field2714, var9.field2634);
                        }
                        if (!field1043 && var26) {
                            if (var9.field2622 == 1400) {
                                Statics.field991.method4810(var10, var11, var9.field2714, var9.field2634, var24, var25);
                            } else {
                                method978(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2620 == 0) {
                            if (!var9.field2617 && method47(var9) && Statics.field15 != var9) {
                                continue;
                            }
                            method8(arg0, var9.field2683, var12, var13, var14, var15, var10 - var9.field2639, var11 - var9.field2627);
                            if (var9.field2742 != null) {
                                method8(var9.field2742, var9.field2683, var12, var13, var14, var15, var10 - var9.field2639, var11 - var9.field2627);
                            }
                            class69 var27 = (class69) field1066.method3251((long) var9.field2683);
                            if (var27 != null) {
                                if (var27.field823 == 0 && class60.field731 >= var12 && class60.field732 >= var13 && class60.field731 < var14 && class60.field732 < var15 && !field1043 && !field1075) {
                                    for (class70 var28 = (class70) field1104.method3296(); var28 != null; var28 = (class70) field1104.method3298()) {
                                        if (var28.field835) {
                                            var28.method3287();
                                            var28.field830.field2743 = false;
                                        }
                                    }
                                    if (Statics.field3611 == 0) {
                                        field1078 = null;
                                        field1148 = null;
                                    }
                                    if (!field1043) {
                                        method608();
                                    }
                                }
                                method230(var27.field825, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2617) {
                            if (var9.field2751) {
                                if (class60.field731 >= var12 && class60.field732 >= var13 && class60.field731 < var14 && class60.field732 < var15) {
                                    for (class70 var29 = (class70) field1104.method3296(); var29 != null; var29 = (class70) field1104.method3298()) {
                                        if (var29.field835) {
                                            var29.method3287();
                                            var29.field830.field2743 = false;
                                        }
                                    }
                                    if (Statics.field3611 == 0) {
                                        field1078 = null;
                                        field1148 = null;
                                    }
                                    if (!field1043) {
                                        method608();
                                    }
                                }
                            } else if (var9.field2752 && class60.field731 >= var12 && class60.field732 >= var13 && class60.field731 < var14 && class60.field732 < var15) {
                                for (class70 var30 = (class70) field1104.method3296(); var30 != null; var30 = (class70) field1104.method3298()) {
                                    if (var30.field835 && var30.field830.field2657 == var30.field832) {
                                        var30.method3287();
                                    }
                                }
                            }
                            boolean var31;
                            if (class60.field731 >= var12 && class60.field732 >= var13 && class60.field731 < var14 && class60.field732 < var15) {
                                var31 = true;
                            } else {
                                var31 = false;
                            }
                            boolean var32 = false;
                            if ((class60.field734 == 1 || !Statics.field700 && class60.field734 == 4) && var31) {
                                var32 = true;
                            }
                            boolean var33 = false;
                            if ((class60.field730 == 1 || !Statics.field700 && class60.field730 == 4) && class60.field738 >= var12 && class60.field724 >= var13 && class60.field738 < var14 && class60.field724 < var15) {
                                var33 = true;
                            }
                            if (var33) {
                                method945(var9, class60.field738 - var10, class60.field724 - var11);
                            }
                            if (var9.field2622 == 1400) {
                                Statics.field991.method4850(class60.field731, class60.field732, var31 & var32);
                            }
                            if (field1078 != null && field1078 != var9 && var31 && class218.method2773(method887(var9))) {
                                field924 = var9;
                            }
                            if (field1148 == var9) {
                                field1083 = true;
                                field1084 = var10;
                                field1085 = var11;
                            }
                            if (var9.field2698) {
                                if (var31 && field1103 != 0 && var9.field2657 != null) {
                                    class70 var34 = new class70();
                                    var34.field835 = true;
                                    var34.field830 = var9;
                                    var34.field834 = field1103;
                                    var34.field832 = var9.field2657;
                                    field1104.method3290(var34);
                                }
                                if (field1078 != null || Statics.field282 != null || field1043) {
                                    var33 = false;
                                    var32 = false;
                                    var31 = false;
                                }
                                if (!var9.field2744 && var33) {
                                    var9.field2744 = true;
                                    if (var9.field2700 != null) {
                                        class70 var35 = new class70();
                                        var35.field835 = true;
                                        var35.field830 = var9;
                                        var35.field833 = class60.field738 - var10;
                                        var35.field834 = class60.field724 - var11;
                                        var35.field832 = var9.field2700;
                                        field1104.method3290(var35);
                                    }
                                }
                                if (var9.field2744 && var32 && var9.field2701 != null) {
                                    class70 var36 = new class70();
                                    var36.field835 = true;
                                    var36.field830 = var9;
                                    var36.field833 = class60.field731 - var10;
                                    var36.field834 = class60.field732 - var11;
                                    var36.field832 = var9.field2701;
                                    field1104.method3290(var36);
                                }
                                if (var9.field2744 && !var32) {
                                    var9.field2744 = false;
                                    if (var9.field2685 != null) {
                                        class70 var37 = new class70();
                                        var37.field835 = true;
                                        var37.field830 = var9;
                                        var37.field833 = class60.field731 - var10;
                                        var37.field834 = class60.field732 - var11;
                                        var37.field832 = var9.field2685;
                                        field1106.method3290(var37);
                                    }
                                }
                                if (var32 && var9.field2703 != null) {
                                    class70 var38 = new class70();
                                    var38.field835 = true;
                                    var38.field830 = var9;
                                    var38.field833 = class60.field731 - var10;
                                    var38.field834 = class60.field732 - var11;
                                    var38.field832 = var9.field2703;
                                    field1104.method3290(var38);
                                }
                                if (!var9.field2743 && var31) {
                                    var9.field2743 = true;
                                    if (var9.field2727 != null) {
                                        class70 var39 = new class70();
                                        var39.field835 = true;
                                        var39.field830 = var9;
                                        var39.field833 = class60.field731 - var10;
                                        var39.field834 = class60.field732 - var11;
                                        var39.field832 = var9.field2727;
                                        field1104.method3290(var39);
                                    }
                                }
                                if (var9.field2743 && var31 && var9.field2705 != null) {
                                    class70 var40 = new class70();
                                    var40.field835 = true;
                                    var40.field830 = var9;
                                    var40.field833 = class60.field731 - var10;
                                    var40.field834 = class60.field732 - var11;
                                    var40.field832 = var9.field2705;
                                    field1104.method3290(var40);
                                }
                                if (var9.field2743 && !var31) {
                                    var9.field2743 = false;
                                    if (var9.field2706 != null) {
                                        class70 var41 = new class70();
                                        var41.field835 = true;
                                        var41.field830 = var9;
                                        var41.field833 = class60.field731 - var10;
                                        var41.field834 = class60.field732 - var11;
                                        var41.field832 = var9.field2706;
                                        field1106.method3290(var41);
                                    }
                                }
                                if (var9.field2717 != null) {
                                    class70 var42 = new class70();
                                    var42.field830 = var9;
                                    var42.field832 = var9.field2717;
                                    field1105.method3290(var42);
                                }
                                if (var9.field2711 != null && field1092 > var9.field2746) {
                                    if (var9.field2611 == null || field1092 - var9.field2746 > 32) {
                                        class70 var47 = new class70();
                                        var47.field830 = var9;
                                        var47.field832 = var9.field2711;
                                        field1104.method3290(var47);
                                    } else {
                                        label495: for (int var43 = var9.field2746; var43 < field1092; var43++) {
                                            int var44 = field1091[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var9.field2611.length; var45++) {
                                                if (var9.field2611[var45] == var44) {
                                                    class70 var46 = new class70();
                                                    var46.field830 = var9;
                                                    var46.field832 = var9.field2711;
                                                    field1104.method3290(var46);
                                                    break label495;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2746 = field1092;
                                }
                                if (var9.field2749 != null && field1146 > var9.field2747) {
                                    if (var9.field2680 == null || field1146 - var9.field2747 > 32) {
                                        class70 var52 = new class70();
                                        var52.field830 = var9;
                                        var52.field832 = var9.field2749;
                                        field1104.method3290(var52);
                                    } else {
                                        label471: for (int var48 = var9.field2747; var48 < field1146; var48++) {
                                            int var49 = field1093[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var9.field2680.length; var50++) {
                                                if (var9.field2680[var50] == var49) {
                                                    class70 var51 = new class70();
                                                    var51.field830 = var9;
                                                    var51.field832 = var9.field2749;
                                                    field1104.method3290(var51);
                                                    break label471;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2747 = field1146;
                                }
                                if (var9.field2660 != null && field944 > var9.field2643) {
                                    if (var9.field2609 == null || field944 - var9.field2643 > 32) {
                                        class70 var57 = new class70();
                                        var57.field830 = var9;
                                        var57.field832 = var9.field2660;
                                        field1104.method3290(var57);
                                    } else {
                                        label447: for (int var53 = var9.field2643; var53 < field944; var53++) {
                                            int var54 = field1095[var53 & 0x1F];
                                            for (int var55 = 0; var55 < var9.field2609.length; var55++) {
                                                if (var9.field2609[var55] == var54) {
                                                    class70 var56 = new class70();
                                                    var56.field830 = var9;
                                                    var56.field832 = var9.field2660;
                                                    field1104.method3290(var56);
                                                    break label447;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2643 = field944;
                                }
                                if (field1097 > var9.field2709 && var9.field2720 != null) {
                                    class70 var58 = new class70();
                                    var58.field830 = var9;
                                    var58.field832 = var9.field2720;
                                    field1104.method3290(var58);
                                }
                                if (field1143 > var9.field2709 && var9.field2722 != null) {
                                    class70 var59 = new class70();
                                    var59.field830 = var9;
                                    var59.field832 = var9.field2722;
                                    field1104.method3290(var59);
                                }
                                if (field938 > var9.field2709 && var9.field2723 != null) {
                                    class70 var60 = new class70();
                                    var60.field830 = var9;
                                    var60.field832 = var9.field2723;
                                    field1104.method3290(var60);
                                }
                                if (field1100 > var9.field2709 && var9.field2728 != null) {
                                    class70 var61 = new class70();
                                    var61.field830 = var9;
                                    var61.field832 = var9.field2728;
                                    field1104.method3290(var61);
                                }
                                if (field1101 > var9.field2709 && var9.field2614 != null) {
                                    class70 var62 = new class70();
                                    var62.field830 = var9;
                                    var62.field832 = var9.field2614;
                                    field1104.method3290(var62);
                                }
                                if (field1099 > var9.field2709 && var9.field2724 != null) {
                                    class70 var63 = new class70();
                                    var63.field830 = var9;
                                    var63.field832 = var9.field2724;
                                    field1104.method3290(var63);
                                }
                                var9.field2709 = field1090;
                                if (var9.field2640 != null) {
                                    for (int var64 = 0; var64 < field1126; var64++) {
                                        class70 var65 = new class70();
                                        var65.field830 = var9;
                                        var65.field837 = field1121[var64];
                                        var65.field841 = field1127[var64];
                                        var65.field832 = var9.field2640;
                                        field1104.method3290(var65);
                                    }
                                }
                            }
                        }
                        if (!var9.field2617 && field1078 == null && Statics.field282 == null && !field1043) {
                            if ((var9.field2741 >= 0 || var9.field2633 != 0) && class60.field731 >= var12 && class60.field732 >= var13 && class60.field731 < var14 && class60.field732 < var15) {
                                if (var9.field2741 >= 0) {
                                    Statics.field15 = arg0[var9.field2741];
                                } else {
                                    Statics.field15 = var9;
                                }
                            }
                            if (var9.field2620 == 8 && class60.field731 >= var12 && class60.field732 >= var13 && class60.field731 < var14 && class60.field732 < var15) {
                                Statics.field617 = var9;
                            }
                            if (var9.field2733 > var9.field2634) {
                                method203(var9, var9.field2714 + var10, var11, var9.field2634, var9.field2733, class60.field731, class60.field732);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hf.ip(III)V")
    public static final void method3558(int arg0, int arg1) {
        if (class217.method42(arg0)) {
            method236(Statics.field2616[arg0], arg1);
        }
    }

    @ObfuscatedName("av.ie([Lho;II)V")
    public static final void method236(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2620 == 0) {
                    if (var3.field2742 != null) {
                        method236(var3.field2742, arg1);
                    }
                    class69 var4 = (class69) field1066.method3251((long) var3.field2683);
                    if (var4 != null) {
                        method3558(var4.field825, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2691 != null) {
                    class70 var5 = new class70();
                    var5.field830 = var3;
                    var5.field832 = var3.field2691;
                    class84.method963(var5);
                }
                if (arg1 == 1 && var3.field2695 != null) {
                    if (var3.field2619 >= 0) {
                        class217 var6 = class217.method3861(var3.field2683);
                        if (var6 == null || var6.field2742 == null || var3.field2619 >= var6.field2742.length || var6.field2742[var3.field2619] != var3) {
                            continue;
                        }
                    }
                    class70 var7 = new class70();
                    var7.field830 = var3;
                    var7.field832 = var3.field2695;
                    class84.method963(var7);
                }
            }
        }
    }

    @ObfuscatedName("ba.ix(Lho;III)V")
    public static final void method945(class217 arg0, int arg1, int arg2) {
        if (field1078 != null || field1043 || arg0 == null) {
            return;
        }
        class217 var3 = method75(arg0);
        if (var3 == null) {
            var3 = arg0.field2693;
        }
        if (var3 == null) {
            return;
        }
        field1078 = arg0;
        class217 var5 = method75(arg0);
        if (var5 == null) {
            var5 = arg0.field2693;
        }
        field1148 = var5;
        field1080 = arg1;
        field1161 = arg2;
        Statics.field3611 = 0;
        field1089 = false;
        int var7 = method461();
        if (var7 != -1) {
            Statics.field670 = new class90();
            Statics.field670.field1380 = field1155[var7];
            Statics.field670.field1378 = field1046[var7];
            Statics.field670.field1379 = field1047[var7];
            Statics.field670.field1381 = field1111[var7];
            Statics.field670.field1382 = field1049[var7];
        }
        return;
    }

    @ObfuscatedName("client.ig(I)V")
    public final void method1021() {
        method148(field1078);
        Statics.field3611++;
        if (field1086 && field1083) {
            int var1 = class60.field731;
            int var2 = class60.field732;
            int var3 = var1 - field1080;
            int var4 = var2 - field1161;
            if (var3 < field1084) {
                var3 = field1084;
            }
            if (field1078.field2714 + var3 > field1084 + field1148.field2714) {
                var3 = field1084 + field1148.field2714 - field1078.field2714;
            }
            if (var4 < field1085) {
                var4 = field1085;
            }
            if (field1078.field2634 + var4 > field1085 + field1148.field2634) {
                var4 = field1085 + field1148.field2634 - field1078.field2634;
            }
            int var5 = var3 - field1087;
            int var6 = var4 - field932;
            int var7 = field1078.field2694;
            if (Statics.field3611 > field1078.field2702 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1089 = true;
            }
            int var8 = field1148.field2639 + (var3 - field1084);
            int var9 = field1148.field2627 + (var4 - field1085);
            if (field1078.field2707 != null && field1089) {
                class70 var10 = new class70();
                var10.field830 = field1078;
                var10.field833 = var8;
                var10.field834 = var9;
                var10.field832 = field1078.field2707;
                class84.method963(var10);
            }
            if (class60.field734 == 0) {
                if (field1089) {
                    if (field1078.field2652 != null) {
                        class70 var11 = new class70();
                        var11.field830 = field1078;
                        var11.field833 = var8;
                        var11.field834 = var9;
                        var11.field836 = field924;
                        var11.field832 = field1078.field2652;
                        class84.method963(var11);
                    }
                    if (field924 != null && method75(field1078) != null) {
                        field958.method3096(62);
                        field958.method3024(field1078.field2683);
                        field958.method2892(field1078.field2726);
                        field958.method2893(field924.field2619);
                        field958.method2846(field1078.field2619);
                        field958.method2893(field924.field2726);
                        field958.method2903(field924.field2683);
                    }
                } else if (this.method1260()) {
                    this.method1019(field1087 + field1080, field932 + field1161);
                } else if (field1176 > 0) {
                    int var12 = field1087 + field1080;
                    int var13 = field932 + field1161;
                    class90 var14 = Statics.field670;
                    method2758(var14.field1380, var14.field1378, var14.field1379, var14.field1381, var14.field1382, var14.field1382, var12, var13);
                    Statics.field670 = null;
                }
                field1078 = null;
            }
        } else if (Statics.field3611 > 1) {
            field1078 = null;
        }
    }

    @ObfuscatedName("ai.ir(III)V")
    public static void method524(int arg0, int arg1) {
        class90 var2 = Statics.field670;
        method2758(var2.field1380, var2.field1378, var2.field1379, var2.field1381, var2.field1382, var2.field1382, arg0, arg1);
        Statics.field670 = null;
    }

    @ObfuscatedName("j.if(Lho;I)V")
    public static void method148(class217 arg0) {
        if (field1109 == arg0.field2729) {
            field1110[arg0.field2732] = true;
        }
    }

    @ObfuscatedName("l.iw(B)V")
    public static void method131() {
        for (class69 var0 = (class69) field1066.method3241(); var0 != null; var0 = (class69) field1066.method3242()) {
            int var1 = var0.field825;
            if (class217.method42(var1)) {
                boolean var2 = true;
                class217[] var3 = Statics.field2616[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2617;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2437;
                    class217 var6 = class217.method3861(var5);
                    if (var6 != null) {
                        method148(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ip.is([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method3809(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ai.iu(II)V")
    public static final void method528(int arg0) {
        if (!class217.method42(arg0)) {
            return;
        }
        class217[] var1 = Statics.field2616[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class217 var3 = var1[var2];
            if (var3 != null) {
                var3.field2740 = 0;
                var3.field2677 = 0;
            }
        }
    }

    @ObfuscatedName("bg.ii(II)V")
    public static final void method697(int arg0) {
        if (class217.method42(arg0)) {
            method3702(Statics.field2616[arg0], -1);
        }
    }

    @ObfuscatedName("hn.iz([Lho;IB)V")
    public static final void method3702(class217[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class217 var3 = arg0[var2];
            if (var3 != null && var3.field2637 == arg1 && (!var3.field2617 || !method47(var3))) {
                if (var3.field2620 == 0) {
                    if (!var3.field2617 && method47(var3) && Statics.field15 != var3) {
                        continue;
                    }
                    method3702(arg0, var3.field2683);
                    if (var3.field2742 != null) {
                        method3702(var3.field2742, var3.field2683);
                    }
                    class69 var4 = (class69) field1066.method3251((long) var3.field2683);
                    if (var4 != null) {
                        method697(var4.field825);
                    }
                }
                if (var3.field2620 == 6) {
                    if (var3.field2665 != -1 || var3.field2666 != -1) {
                        boolean var5 = method1836(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2666;
                        } else {
                            var6 = var3.field2665;
                        }
                        if (var6 != -1) {
                            class261 var7 = Statics.method240(var6);
                            var3.field2677 += field1067;
                            while (var3.field2677 > var7.field3586[var3.field2740]) {
                                var3.field2677 -= var7.field3586[var3.field2740];
                                var3.field2740++;
                                if (var3.field2740 >= var7.field3584.length) {
                                    var3.field2740 -= var7.field3588;
                                    if (var3.field2740 < 0 || var3.field2740 >= var7.field3584.length) {
                                        var3.field2740 = 0;
                                    }
                                }
                                method148(var3);
                            }
                        }
                    }
                    if (var3.field2674 != 0 && !var3.field2617) {
                        int var8 = var3.field2674 >> 16;
                        int var9 = var3.field2674 << 16 >> 16;
                        int var10 = field1067 * var8;
                        int var11 = field1067 * var9;
                        var3.field2712 = var3.field2712 + var10 & 0x7FF;
                        var3.field2670 = var3.field2670 + var11 & 0x7FF;
                        method148(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fo.iy(II)V")
    public static final void method2774(int arg0) {
        method131();
        class83.method605();
        int var1 = class242.method1566(arg0).field3258;
        if (var1 == 0) {
            return;
        }
        int var2 = class212.field2573[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class137.method2344(0.9D);
                ((class126) Statics.field1995).method2131(0.9D);
            }
            if (var2 == 2) {
                class137.method2344(0.8D);
                ((class126) Statics.field1995).method2131(0.8D);
            }
            if (var2 == 3) {
                class137.method2344(0.7D);
                ((class126) Statics.field1995).method2131(0.7D);
            }
            if (var2 == 4) {
                class137.method2344(0.6D);
                ((class126) Statics.field1995).method2131(0.6D);
            }
            class257.field3477.method3223();
        }
        if (var1 == 3) {
            short var3 = 0;
            if (var2 == 0) {
                var3 = 255;
            }
            if (var2 == 1) {
                var3 = 192;
            }
            if (var2 == 2) {
                var3 = 128;
            }
            if (var2 == 3) {
                var3 = 64;
            }
            if (var2 == 4) {
                var3 = 0;
            }
            if (field1140 != var3) {
                if (field1140 == 0 && field1141 != -1) {
                    class204.method128(Statics.field232, field1141, 0, var3, false);
                    field1142 = false;
                } else if (var3 == 0) {
                    class204.method1347();
                    field1142 = false;
                } else if (class204.field2472 == 0) {
                    Statics.field2471.method3391(var3);
                } else {
                    Statics.field514 = var3;
                }
                field1140 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field1137 = 127;
            }
            if (var2 == 1) {
                field1137 = 96;
            }
            if (var2 == 2) {
                field1137 = 64;
            }
            if (var2 == 3) {
                field1137 = 32;
            }
            if (var2 == 4) {
                field1137 = 0;
            }
        }
        if (var1 == 5) {
            field1042 = var2;
        }
        if (var1 == 6) {
            field917 = var2;
        }
        if (var1 == 9) {
            field1068 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field1036 = 127;
            }
            if (var2 == 1) {
                field1036 = 96;
            }
            if (var2 == 2) {
                field1036 = 64;
            }
            if (var2 == 3) {
                field1036 = 32;
            }
            if (var2 == 4) {
                field1036 = 0;
            }
        }
        if (var1 == 17) {
            field1073 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class92[] var4 = new class92[] { class92.field1387, class92.field1389, class92.field1394, class92.field1388 };
            field941 = (class92) class169.method454(var4, var2);
            if (field941 == null) {
                field941 = class92.field1387;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field1034 = -1;
            } else {
                field1034 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class92[] var5 = new class92[] { class92.field1387, class92.field1389, class92.field1394, class92.field1388 };
        field1162 = (class92) class169.method454(var5, var2);
        if (field1162 == null) {
            field1162 = class92.field1387;
        }
    }

    @ObfuscatedName("hj.iq(I)V")
    public static final void method3700() {
        field958.method3096(170);
        for (class69 var0 = (class69) field1066.method3241(); var0 != null; var0 = (class69) field1066.method3242()) {
            if (var0.field823 == 0 || var0.field823 == 3) {
                method930(var0, true);
            }
        }
        if (field1069 != null) {
            method148(field1069);
            field1069 = null;
        }
    }

    @ObfuscatedName("w.ik(IIIB)Lbp;")
    public static final class69 method46(int arg0, int arg1, int arg2) {
        class69 var3 = new class69();
        var3.field825 = arg1;
        var3.field823 = arg2;
        field1066.method3239(var3, (long) arg0);
        method528(arg1);
        class217 var4 = class217.method3861(arg0);
        method148(var4);
        if (field1069 != null) {
            method148(field1069);
            field1069 = null;
        }
        method35();
        method1353(Statics.field2616[arg0 >> 16], var4, false);
        Statics.method2680(arg1);
        if (field940 != -1) {
            method3558(field940, 1);
        }
        return var3;
    }

    @ObfuscatedName("bj.in(Lbp;ZI)V")
    public static final void method930(class69 arg0, boolean arg1) {
        int var2 = arg0.field825;
        int var3 = (int) arg0.field2437;
        arg0.method3287();
        if (arg1) {
            class217.method1636(var2);
        }
        for (class199 var4 = (class199) field1107.method3241(); var4 != null; var4 = (class199) field1107.method3242()) {
            if ((var4.field2437 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method3287();
            }
        }
        class217 var5 = class217.method3861(var3);
        if (var5 != null) {
            method148(var5);
        }
        method35();
        if (field940 != -1) {
            method3558(field940, 1);
        }
    }

    @ObfuscatedName("hh.ia(Lho;I)Z")
    public static final boolean method3699(class217 arg0) {
        int var1 = arg0.field2622;
        if (var1 == 205) {
            field968 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1081.method3598(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1081.method3618(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1081.method3600(false);
        }
        if (var1 == 325) {
            field1081.method3600(true);
        }
        if (var1 == 326) {
            field958.method3096(87);
            field1081.method3601(field958);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ag.ij(Lho;IIIB)V")
    public static final void method231(class217 arg0, int arg1, int arg2, int arg3) {
        class211 var4 = arg0.method3641(false);
        if (var4 == null) {
            return;
        }
        if (field1139 < 3) {
            Statics.field896.method4695(arg1, arg2, var4.field2570, var4.field2567, 25, 25, field1019, 256, var4.field2569, var4.field2568);
        } else {
            class282.method4525(arg1, arg2, 0, var4.field2569, var4.field2568);
        }
    }

    @ObfuscatedName("cw.iv(IIIILjj;Lhm;B)V")
    public static final void method1419(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1528(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field1019 & 0x7FF;
        int var8 = class137.field1983[var7];
        int var9 = class137.field1973[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        Statics.field240.method4643(arg0 + 94 + var14 + 4 - 10, arg1 + 83 - var15 - 20, 20, 20, 15, 15, var12, 256);
    }

    @ObfuscatedName("ct.ih(IIIILjj;Lhm;I)V")
    public static final void method1528(int arg0, int arg1, int arg2, int arg3, class286 arg4, class211 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field1019 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class137.field1983[var6];
        int var9 = class137.field1973[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method4641(arg5.field2570 / 2 + var10 - arg4.field3773 / 2, arg5.field2567 / 2 - var11 - arg4.field3774 / 2, arg0, arg1, arg5.field2570, arg5.field2567, arg5.field2569, arg5.field2568);
        } else {
            arg4.method4631(arg5.field2570 / 2 + arg0 + var10 - arg4.field3773 / 2, arg5.field2567 / 2 + arg1 - var11 - arg4.field3774 / 2);
        }
    }

    @ObfuscatedName("el.id(Ljava/lang/String;ZI)Z")
    public static boolean method2617(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class268.method3629(arg0, Statics.field332);
        for (int var3 = 0; var3 < field1170; var3++) {
            if (var2.equalsIgnoreCase(class268.method3629(field1172[var3].field805, Statics.field332)) && (!arg1 || field1172[var3].field801 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class268.method3629(Statics.field3110.field884, Statics.field332))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ay.it(Ljava/lang/String;B)Z")
    public static boolean method645(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class268.method3629(arg0, Statics.field332);
        for (int var2 = 0; var2 < field1174; var2++) {
            class71 var3 = field998[var2];
            if (var1.equalsIgnoreCase(class268.method3629(var3.field846, Statics.field332))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class268.method3629(var3.field845, Statics.field332))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("at.ic(Ljava/lang/String;B)V")
    public static final void method462(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field1170 < 200 || field1027 == 1) || field1170 >= 400) {
            class99.method1574(30, "", class226.field2991);
            return;
        }
        String var1 = class268.method3629(arg0, Statics.field332);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1170; var2++) {
            class66 var3 = field1172[var2];
            String var4 = class268.method3629(var3.field805, Statics.field332);
            if (var4 != null && var4.equals(var1)) {
                class99.method1574(30, "", arg0 + class226.field2992);
                return;
            }
            if (var3.field800 != null) {
                String var5 = class268.method3629(var3.field800, Statics.field332);
                if (var5 != null && var5.equals(var1)) {
                    class99.method1574(30, "", arg0 + class226.field2992);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field1174; var6++) {
            class71 var7 = field998[var6];
            String var8 = class268.method3629(var7.field846, Statics.field332);
            if (var8 != null && var8.equals(var1)) {
                class99.method1574(30, "", class226.field3094 + arg0 + class226.field3039);
                return;
            }
            if (var7.field845 != null) {
                String var9 = class268.method3629(var7.field845, Statics.field332);
                if (var9 != null && var9.equals(var1)) {
                    class99.method1574(30, "", class226.field3094 + arg0 + class226.field3039);
                    return;
                }
            }
        }
        if (class268.method3629(Statics.field3110.field884, Statics.field332).equals(var1)) {
            class99.method1574(30, "", class226.field2958);
        } else {
            field958.method3096(133);
            field958.method2922(class174.method84(arg0));
            field958.method2851(arg0);
        }
    }

    @ObfuscatedName("u.il(Ljava/lang/String;ZI)V")
    public static final void method11(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field1174 < 100 || field1027 == 1) || field1174 >= 400) {
            class99.method1574(31, "", class226.field3055);
            return;
        }
        String var2 = class268.method3629(arg0, Statics.field332);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field1174; var3++) {
            class71 var4 = field998[var3];
            String var5 = class268.method3629(var4.field846, Statics.field332);
            if (var5 != null && var5.equals(var2)) {
                class99.method1574(31, "", arg0 + class226.field2857);
                return;
            }
            if (var4.field845 != null) {
                String var6 = class268.method3629(var4.field845, Statics.field332);
                if (var6 != null && var6.equals(var2)) {
                    class99.method1574(31, "", arg0 + class226.field2857);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field1170; var7++) {
            class66 var8 = field1172[var7];
            String var9 = class268.method3629(var8.field805, Statics.field332);
            if (var9 != null && var9.equals(var2)) {
                class99.method1574(31, "", class226.field2999 + arg0 + class226.field2862);
                return;
            }
            if (var8.field800 != null) {
                String var10 = class268.method3629(var8.field800, Statics.field332);
                if (var10 != null && var10.equals(var2)) {
                    class99.method1574(31, "", class226.field2999 + arg0 + class226.field2862);
                    return;
                }
            }
        }
        if (class268.method3629(Statics.field3110.field884, Statics.field332).equals(var2)) {
            class99.method1574(31, "", class226.field2996);
        } else {
            field958.method3096(11);
            field958.method2922(class174.method84(arg0));
            field958.method2851(arg0);
        }
    }

    @ObfuscatedName("ic.ib(Ljava/lang/String;B)V")
    public static final void method4199(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class268.method3629(arg0, Statics.field332);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1170; var2++) {
            class66 var3 = field1172[var2];
            String var4 = var3.field805;
            String var5 = class268.method3629(var4, Statics.field332);
            if (class278.method934(arg0, var1, var4, var5)) {
                field1170--;
                for (int var6 = var2; var6 < field1170; var6++) {
                    field1172[var6] = field1172[var6 + 1];
                }
                field1143 = field1090;
                field958.method3096(26);
                field958.method2922(class174.method84(arg0));
                field958.method2851(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("aw.io(Ljava/lang/String;II)V")
    public static final void method467(String arg0, int arg1) {
        field958.method3096(90);
        field958.method2922(class174.method84(arg0) + 1);
        field958.method2851(arg0);
        field958.method2884(arg1);
    }

    @ObfuscatedName("bn.jc(Lho;B)I")
    public static int method887(class217 arg0) {
        class199 var1 = (class199) field1107.method3251(((long) arg0.field2683 << 32) + (long) arg0.field2619);
        return var1 == null ? arg0.field2690 : var1.field2452;
    }

    @ObfuscatedName("t.jp(Lho;B)Lho;")
    public static class217 method75(class217 arg0) {
        int var1 = class218.method1575(method887(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class217.method3861(arg0.field2637);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("w.jn(Lho;I)Z")
    public static boolean method47(class217 arg0) {
        if (field1075) {
            if (method887(arg0) != 0) {
                return false;
            }
            if (arg0.field2620 == 0) {
                return false;
            }
        }
        return arg0.field2638;
    }

    @ObfuscatedName("ao.jt(Lho;IB)Ljava/lang/String;")
    public static String method656(class217 arg0, int arg1) {
        if (!class218.method1646(method887(arg0), arg1) && arg0.field2718 == null) {
            return null;
        } else if (arg0.field2692 == null || arg0.field2692.length <= arg1 || arg0.field2692[arg1] == null || arg0.field2692[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2692[arg1];
        }
    }

    @ObfuscatedName("ab.jv(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method316(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field949 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field949 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field949 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field949 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field949 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field431 != null) {
            var3 = "/p=" + Statics.field431;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field920 + "/a=" + Statics.field324 + var3 + "/";
    }

    @ObfuscatedName("ep.jh(Ljava/lang/String;ZI)V")
    public static void method2628(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3468; var5++) {
            class257 var6 = class257.method44(var5);
            if ((!arg1 || var6.field3514) && var6.field3506 == -1 && var6.field3474.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field381 = -1;
                    Statics.field362 = null;
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
        Statics.field362 = var3;
        Statics.field1335 = 0;
        Statics.field381 = var4;
        String[] var9 = new String[Statics.field381];
        for (int var10 = 0; var10 < Statics.field381; var10++) {
            var9[var10] = class257.method44(var3[var10]).field3474;
        }
        class171.method1422(var9, Statics.field362);
    }
}
