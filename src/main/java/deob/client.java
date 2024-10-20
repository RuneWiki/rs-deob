package deob;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class163[] field975 = new class163[4];

    @ObfuscatedName("client.aa")
    public static boolean field942 = true;

    @ObfuscatedName("client.bn")
    public static int field917 = 1;

    @ObfuscatedName("client.bo")
    public static int field918 = 0;

    @ObfuscatedName("client.ba")
    public static int field919 = 0;

    @ObfuscatedName("client.bp")
    public static boolean field920 = false;

    @ObfuscatedName("client.bi")
    public static boolean field1109 = false;

    @ObfuscatedName("client.by")
    public static int field1014 = 0;

    @ObfuscatedName("client.br")
    public static int field923 = 0;

    @ObfuscatedName("client.bm")
    public static boolean field924 = true;

    @ObfuscatedName("client.bj")
    public static int field925 = 0;

    @ObfuscatedName("client.bb")
    public static long field1182 = 1L;

    @ObfuscatedName("client.bl")
    public static int field1136 = -1;

    @ObfuscatedName("client.bt")
    public static int field928 = -1;

    @ObfuscatedName("client.bw")
    public static int field938 = -1;

    @ObfuscatedName("client.bs")
    public static boolean field1058 = true;

    @ObfuscatedName("client.bh")
    public static boolean field931 = false;

    @ObfuscatedName("client.bk")
    public static int field932 = 0;

    @ObfuscatedName("client.bv")
    public static int field1104 = 0;

    @ObfuscatedName("client.be")
    public static int field934 = 0;

    @ObfuscatedName("client.cp")
    public static int field997 = 0;

    @ObfuscatedName("client.cs")
    public static int field933 = 0;

    @ObfuscatedName("client.cq")
    public static int field926 = 0;

    @ObfuscatedName("client.ct")
    public static int field1169 = 0;

    @ObfuscatedName("client.cm")
    public static int field939 = 0;

    @ObfuscatedName("client.cu")
    public static int field1015 = 0;

    @ObfuscatedName("client.cg")
    public static class93 field941 = class93.field1411;

    @ObfuscatedName("client.co")
    public static class93 field1090 = class93.field1411;

    @ObfuscatedName("client.cn")
    public static int field943 = 0;

    @ObfuscatedName("client.cx")
    public static int field960 = 0;

    @ObfuscatedName("client.cb")
    public static int field945 = 0;

    @ObfuscatedName("client.dt")
    public static int field946 = 0;

    @ObfuscatedName("client.dp")
    public static int field947 = 0;

    @ObfuscatedName("client.dz")
    public static int field948 = 0;

    @ObfuscatedName("client.dh")
    public static int field949 = 0;

    @ObfuscatedName("client.di")
    public static int field1156 = 0;

    @ObfuscatedName("client.da")
    public static byte[] field951 = null;

    @ObfuscatedName("client.dx")
    public static class88[] field952 = new class88[32768];

    @ObfuscatedName("client.dr")
    public static int field953 = 0;

    @ObfuscatedName("client.dn")
    public static int[] field954 = new int[32768];

    @ObfuscatedName("client.dy")
    public static int field982 = 0;

    @ObfuscatedName("client.eh")
    public static int[] field956 = new int[250];

    @ObfuscatedName("client.es")
    public static class181 field957 = new class181(5000);

    @ObfuscatedName("client.eo")
    public static class181 field1174 = new class181(5000);

    @ObfuscatedName("client.ev")
    public static class181 field959 = new class181(15000);

    @ObfuscatedName("client.ex")
    public static int field1000 = 0;

    @ObfuscatedName("client.ep")
    public static int field961 = 0;

    @ObfuscatedName("client.ej")
    public static int field969 = 0;

    @ObfuscatedName("client.er")
    public static int field991 = 0;

    @ObfuscatedName("client.eg")
    public static int field927 = 0;

    @ObfuscatedName("client.en")
    public static int field1060 = 0;

    @ObfuscatedName("client.eq")
    public static int field966 = 0;

    @ObfuscatedName("client.ea")
    public static int field1041 = 0;

    @ObfuscatedName("client.el")
    public static boolean field968 = false;

    @ObfuscatedName("client.et")
    public static HashMap field992 = new HashMap();

    @ObfuscatedName("client.fv")
    public static int field1124 = 0;

    @ObfuscatedName("client.fy")
    public static int field930 = 1;

    @ObfuscatedName("client.fq")
    public static int field972 = 0;

    @ObfuscatedName("client.fo")
    public static int field973 = 1;

    @ObfuscatedName("client.fz")
    public static int field974 = 0;

    @ObfuscatedName("client.fa")
    public static boolean field1023 = false;

    @ObfuscatedName("client.fr")
    public static int[][][] field977 = new int[4][13][13];

    @ObfuscatedName("client.fk")
    public static final int[] field978 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fx")
    public static int field1021 = 0;

    @ObfuscatedName("client.gr")
    public static int field980 = 2301979;

    @ObfuscatedName("client.gc")
    public static int field981 = 5063219;

    @ObfuscatedName("client.gq")
    public static int field971 = 3353893;

    @ObfuscatedName("client.gk")
    public static int field983 = 7759444;

    @ObfuscatedName("client.gf")
    public static boolean field984 = false;

    @ObfuscatedName("client.gx")
    public static int field985 = 0;

    @ObfuscatedName("client.gh")
    public static int field986 = 128;

    @ObfuscatedName("client.ge")
    public static int field987 = 0;

    @ObfuscatedName("client.gt")
    public static int field1146 = 0;

    @ObfuscatedName("client.gj")
    public static int field989 = 0;

    @ObfuscatedName("client.gi")
    public static int field990 = 0;

    @ObfuscatedName("client.gp")
    public static int field964 = 0;

    @ObfuscatedName("client.gl")
    public static int field979 = 50;

    @ObfuscatedName("client.ho")
    public static int field993 = 0;

    @ObfuscatedName("client.hf")
    public static boolean field994 = false;

    @ObfuscatedName("client.hu")
    public static int field995 = 0;

    @ObfuscatedName("client.ha")
    public static int field996 = 0;

    @ObfuscatedName("client.hp")
    public static int field1074 = 50;

    @ObfuscatedName("client.hq")
    public static int[] field1033 = new int[field1074];

    @ObfuscatedName("client.hn")
    public static int[] field999 = new int[field1074];

    @ObfuscatedName("client.hk")
    public static int[] field1065 = new int[field1074];

    @ObfuscatedName("client.hz")
    public static int[] field1001 = new int[field1074];

    @ObfuscatedName("client.hg")
    public static int[] field1002 = new int[field1074];

    @ObfuscatedName("client.hi")
    public static int[] field1003 = new int[field1074];

    @ObfuscatedName("client.ht")
    public static int[] field1004 = new int[field1074];

    @ObfuscatedName("client.hc")
    public static String[] field1005 = new String[field1074];

    @ObfuscatedName("client.hs")
    public static int[][] field1006 = new int[104][104];

    @ObfuscatedName("client.hh")
    public static int field1007 = 0;

    @ObfuscatedName("client.hj")
    public static int field1022 = -1;

    @ObfuscatedName("client.hv")
    public static int field1009 = -1;

    @ObfuscatedName("client.hy")
    public static int field1030 = 0;

    @ObfuscatedName("client.hr")
    public static int field1011 = 0;

    @ObfuscatedName("client.hd")
    public static int field1012 = 0;

    @ObfuscatedName("client.hw")
    public static int field1096 = 0;

    @ObfuscatedName("client.hl")
    public static int field1157 = 0;

    @ObfuscatedName("client.he")
    public static int field958 = 0;

    @ObfuscatedName("client.ig")
    public static int field1127 = 0;

    @ObfuscatedName("client.ic")
    public static int field1017 = 0;

    @ObfuscatedName("client.it")
    public static String field1057 = null;

    @ObfuscatedName("client.ik")
    public static int field1018 = 0;

    @ObfuscatedName("client.id")
    public static int field1019 = 0;

    @ObfuscatedName("client.ie")
    public static boolean field1105 = false;

    @ObfuscatedName("client.iy")
    public static int field1080 = 0;

    @ObfuscatedName("client.im")
    public static int field1132 = 0;

    @ObfuscatedName("client.io")
    public static class76[] field1099 = new class76[2048];

    @ObfuscatedName("client.iu")
    public static int field1129 = -1;

    @ObfuscatedName("client.ib")
    public static int field1078 = 0;

    @ObfuscatedName("client.il")
    public static int field1026 = 0;

    @ObfuscatedName("client.iv")
    public static int[] field1027 = new int[1000];

    @ObfuscatedName("client.iw")
    public static final int[] field1028 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.iq")
    public static String[] field922 = new String[8];

    @ObfuscatedName("client.ip")
    public static boolean[] field1020 = new boolean[8];

    @ObfuscatedName("client.ia")
    public static int[] field1031 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ii")
    public static int field1032 = -1;

    @ObfuscatedName("client.ij")
    public static class195[][][] field1131 = new class195[4][104][104];

    @ObfuscatedName("client.in")
    public static class195 field1034 = new class195();

    @ObfuscatedName("client.jh")
    public static class195 field1035 = new class195();

    @ObfuscatedName("client.jd")
    public static class195 field1071 = new class195();

    @ObfuscatedName("client.jn")
    public static int[] field1037 = new int[25];

    @ObfuscatedName("client.jy")
    public static int[] field1038 = new int[25];

    @ObfuscatedName("client.jk")
    public static int[] field1039 = new int[25];

    @ObfuscatedName("client.jv")
    public static int field1040 = 0;

    @ObfuscatedName("client.jm")
    public static boolean field936 = false;

    @ObfuscatedName("client.jw")
    public static int field929 = 0;

    @ObfuscatedName("client.jj")
    public static int[] field1043 = new int[500];

    @ObfuscatedName("client.jb")
    public static int[] field1044 = new int[500];

    @ObfuscatedName("client.jo")
    public static int[] field1045 = new int[500];

    @ObfuscatedName("client.jf")
    public static int[] field1046 = new int[500];

    @ObfuscatedName("client.jg")
    public static String[] field937 = new String[500];

    @ObfuscatedName("client.jt")
    public static String[] field1048 = new String[500];

    @ObfuscatedName("client.js")
    public static boolean[] field1049 = new boolean[500];

    @ObfuscatedName("client.jz")
    public static boolean field1143 = false;

    @ObfuscatedName("client.jl")
    public static boolean field1010 = false;

    @ObfuscatedName("client.jx")
    public static int field1052 = -1;

    @ObfuscatedName("client.je")
    public static int field1053 = -1;

    @ObfuscatedName("client.kl")
    public static int field1054 = 0;

    @ObfuscatedName("client.kv")
    public static int field1055 = 50;

    @ObfuscatedName("client.kt")
    public static int field1056 = 0;

    @ObfuscatedName("client.kj")
    public static boolean field970 = false;

    @ObfuscatedName("client.kb")
    public static int field1059 = -1;

    @ObfuscatedName("client.km")
    public static int field921 = -1;

    @ObfuscatedName("client.ku")
    public static String field998 = null;

    @ObfuscatedName("client.kh")
    public static String field1062 = null;

    @ObfuscatedName("client.kq")
    public static int field1029 = -1;

    @ObfuscatedName("client.kf")
    public static class192 field1180 = new class192(8);

    @ObfuscatedName("client.ke")
    public static int field1024 = 0;

    @ObfuscatedName("client.ko")
    public static int field1151 = 0;

    @ObfuscatedName("client.ks")
    public static class218 field1067 = null;

    @ObfuscatedName("client.kc")
    public static int field1068 = 0;

    @ObfuscatedName("client.kw")
    public static int field1069 = 0;

    @ObfuscatedName("client.kz")
    public static int field1070 = 0;

    @ObfuscatedName("client.ky")
    public static int field955 = -1;

    @ObfuscatedName("client.ka")
    public static boolean field1072 = false;

    @ObfuscatedName("client.kr")
    public static boolean field1073 = false;

    @ObfuscatedName("client.kd")
    public static boolean field935 = false;

    @ObfuscatedName("client.kk")
    public static class218 field1170 = null;

    @ObfuscatedName("client.lr")
    public static class218 field1118 = null;

    @ObfuscatedName("client.lj")
    public static class218 field1077 = null;

    @ObfuscatedName("client.ly")
    public static int field1013 = 0;

    @ObfuscatedName("client.lg")
    public static int field1079 = 0;

    @ObfuscatedName("client.lk")
    public static class218 field1121 = null;

    @ObfuscatedName("client.le")
    public static boolean field1081 = false;

    @ObfuscatedName("client.li")
    public static int field1082 = -1;

    @ObfuscatedName("client.lf")
    public static int field1083 = -1;

    @ObfuscatedName("client.lb")
    public static boolean field1084 = false;

    @ObfuscatedName("client.lh")
    public static int field1085 = -1;

    @ObfuscatedName("client.lo")
    public static int field1086 = -1;

    @ObfuscatedName("client.lq")
    public static boolean field1087 = false;

    @ObfuscatedName("client.lt")
    public static int field1088 = 1;

    @ObfuscatedName("client.ll")
    public static int[] field1089 = new int[32];

    @ObfuscatedName("client.ln")
    public static int field1175 = 0;

    @ObfuscatedName("client.lp")
    public static int[] field1091 = new int[32];

    @ObfuscatedName("client.lz")
    public static int field1016 = 0;

    @ObfuscatedName("client.ls")
    public static int[] field1093 = new int[32];

    @ObfuscatedName("client.ld")
    public static int field1094 = 0;

    @ObfuscatedName("client.lx")
    public static int field1095 = 0;

    @ObfuscatedName("client.mf")
    public static int field1092 = 0;

    @ObfuscatedName("client.mh")
    public static int field1097 = 0;

    @ObfuscatedName("client.md")
    public static int field1098 = 0;

    @ObfuscatedName("client.me")
    public static int field1047 = 0;

    @ObfuscatedName("client.my")
    public static int field1100 = 0;

    @ObfuscatedName("client.mw")
    public static int field1101 = 0;

    @ObfuscatedName("client.mm")
    public static class195 field1102 = new class195();

    @ObfuscatedName("client.mo")
    public static class195 field1103 = new class195();

    @ObfuscatedName("client.mv")
    public static class195 field1042 = new class195();

    @ObfuscatedName("client.mu")
    public static class192 field988 = new class192(512);

    @ObfuscatedName("client.mn")
    public static int field1106 = 0;

    @ObfuscatedName("client.mx")
    public static int field1107 = -2;

    @ObfuscatedName("client.ma")
    public static boolean[] field1108 = new boolean[100];

    @ObfuscatedName("client.mr")
    public static boolean[] field1160 = new boolean[100];

    @ObfuscatedName("client.mk")
    public static boolean[] field1051 = new boolean[100];

    @ObfuscatedName("client.mj")
    public static int[] field1111 = new int[100];

    @ObfuscatedName("client.mz")
    public static int[] field1112 = new int[100];

    @ObfuscatedName("client.ms")
    public static int[] field1113 = new int[100];

    @ObfuscatedName("client.mq")
    public static int[] field1025 = new int[100];

    @ObfuscatedName("client.mp")
    public static int field1115 = 0;

    @ObfuscatedName("client.mb")
    public static long field1116 = 0L;

    @ObfuscatedName("client.mt")
    public static boolean field1117 = true;

    @ObfuscatedName("client.nc")
    public static int[] field1119 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.nk")
    public static int field1120 = 0;

    @ObfuscatedName("client.nx")
    public static int field1128 = 0;

    @ObfuscatedName("client.nm")
    public static String field1122 = "";

    @ObfuscatedName("client.nv")
    public static long[] field1123 = new long[100];

    @ObfuscatedName("client.nr")
    public static int field1066 = 0;

    @ObfuscatedName("client.nu")
    public static int field1125 = 0;

    @ObfuscatedName("client.ng")
    public static int[] field1126 = new int[128];

    @ObfuscatedName("client.nz")
    public static int[] field1114 = new int[128];

    @ObfuscatedName("client.ns")
    public static long field944 = -1L;

    @ObfuscatedName("client.na")
    public static String field916 = null;

    @ObfuscatedName("client.nt")
    public static String field1130 = null;

    @ObfuscatedName("client.np")
    public static int field950 = -1;

    @ObfuscatedName("client.nd")
    public static int field1133 = 0;

    @ObfuscatedName("client.oc")
    public static int[] field1134 = new int[1000];

    @ObfuscatedName("client.om")
    public static int[] field1135 = new int[1000];

    @ObfuscatedName("client.op")
    public static class287[] field1076 = new class287[1000];

    @ObfuscatedName("client.oi")
    public static int field1137 = 0;

    @ObfuscatedName("client.ok")
    public static int field967 = 0;

    @ObfuscatedName("client.od")
    public static int field1139 = 0;

    @ObfuscatedName("client.on")
    public static int field1061 = 255;

    @ObfuscatedName("client.ou")
    public static int field1141 = -1;

    @ObfuscatedName("client.oy")
    public static boolean field1142 = false;

    @ObfuscatedName("client.os")
    public static int field1110 = 127;

    @ObfuscatedName("client.oe")
    public static int field1144 = 127;

    @ObfuscatedName("client.ow")
    public static int field1145 = 0;

    @ObfuscatedName("client.oo")
    public static int[] field1176 = new int[50];

    @ObfuscatedName("client.ov")
    public static int[] field1147 = new int[50];

    @ObfuscatedName("client.ox")
    public static int[] field1148 = new int[50];

    @ObfuscatedName("client.pn")
    public static int[] field1149 = new int[50];

    @ObfuscatedName("client.pw")
    public static class107[] field1150 = new class107[50];

    @ObfuscatedName("client.pc")
    public static boolean field940 = false;

    @ObfuscatedName("client.ps")
    public static boolean[] field1152 = new boolean[5];

    @ObfuscatedName("client.pz")
    public static int[] field1153 = new int[5];

    @ObfuscatedName("client.pi")
    public static int[] field1154 = new int[5];

    @ObfuscatedName("client.pb")
    public static int[] field1155 = new int[5];

    @ObfuscatedName("client.pq")
    public static int[] field963 = new int[5];

    @ObfuscatedName("client.pe")
    public static short field1184 = 256;

    @ObfuscatedName("client.pp")
    public static short field1158 = 205;

    @ObfuscatedName("client.pk")
    public static short field1159 = 256;

    @ObfuscatedName("client.pd")
    public static short field1063 = 320;

    @ObfuscatedName("client.pm")
    public static short field965 = 1;

    @ObfuscatedName("client.pl")
    public static short field1162 = 32767;

    @ObfuscatedName("client.ql")
    public static short field1163 = 1;

    @ObfuscatedName("client.qy")
    public static short field1164 = 32767;

    @ObfuscatedName("client.qf")
    public static int field1165 = 0;

    @ObfuscatedName("client.qc")
    public static int field1166 = 0;

    @ObfuscatedName("client.qq")
    public static int field1050 = 0;

    @ObfuscatedName("client.qi")
    public static int field1168 = 0;

    @ObfuscatedName("client.qh")
    public static int field1167 = 0;

    @ObfuscatedName("client.qb")
    public static int field976 = 0;

    @ObfuscatedName("client.qp")
    public static int field1171 = 0;

    @ObfuscatedName("client.qo")
    public static class66[] field1172 = new class66[400];

    @ObfuscatedName("client.qa")
    public static class197 field1173 = new class197();

    @ObfuscatedName("client.qe")
    public static int field1064 = 0;

    @ObfuscatedName("client.qt")
    public static class72[] field1183 = new class72[400];

    @ObfuscatedName("client.qg")
    public static class215 field1036 = new class215();

    @ObfuscatedName("client.qs")
    public static int field1177 = -1;

    @ObfuscatedName("client.qd")
    public static int field1178 = -1;

    @ObfuscatedName("client.qz")
    public static class17[] field1179 = new class17[8];

    @ObfuscatedName("client.rc")
    public static final class75 field1008 = new class75();

    @ObfuscatedName("client.rj")
    public static int[] field1181 = new int[50];

    @ObfuscatedName("client.rg")
    public static int[] field1140 = new int[50];

    @ObfuscatedName("i.ed(I)Lkv;")
    public static class290 method166() {
        return Statics.field30;
    }

    @ObfuscatedName("client.ai(I)V")
    public final void method749() {
    }

    public final void init() {
        if (!this.method829()) {
            return;
        }
        class276[] var1 = class276.method3948();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class276 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3709);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3709)) {
                    case 1:
                        Statics.field524 = Integer.parseInt(var4);
                        break;
                    case 2:
                        Statics.field806 = var4;
                        break;
                    case 3:
                        Statics.field470 = Integer.parseInt(var4);
                        break;
                    case 4:
                        field917 = Integer.parseInt(var4);
                        break;
                    case 5:
                        Statics.field425 = (class234) class170.method2298(class234.method1083(), Integer.parseInt(var4));
                        if (Statics.field425 == class234.field3175) {
                            Statics.field423 = class291.field3842;
                        } else {
                            Statics.field423 = class291.field3844;
                        }
                    case 6:
                    case 13:
                    default:
                        break;
                    case 7:
                        field1014 = Integer.parseInt(var4);
                        break;
                    case 8:
                        if (var4.equalsIgnoreCase(class90.field1389)) {
                            field920 = true;
                        } else {
                            field920 = false;
                        }
                        break;
                    case 9:
                        if (var4.equalsIgnoreCase(class90.field1389)) {
                        }
                        break;
                    case 10:
                        field918 = Integer.parseInt(var4);
                        break;
                    case 11:
                        Statics.field3234 = class233.method2849(Integer.parseInt(var4));
                        break;
                    case 12:
                        field919 = Integer.parseInt(var4);
                        break;
                    case 14:
                        Statics.field863 = var4;
                }
            }
        }
        class141.field2057 = false;
        field1109 = false;
        Statics.field790 = this.getCodeBase().getHost();
        String var5 = Statics.field3234.field3168;
        byte var6 = 0;
        try {
            class157.method2726("oldschool", var5, var6, 17);
        } catch (Exception var8) {
            class154.method1592((String) null, var8);
        }
        Statics.field32 = this;
        this.method830(765, 503, 152);
    }

    @ObfuscatedName("client.ac(I)V")
    public final void method769() {
        Statics.field2824 = field919 == 0 ? 43594 : field917 + 40000;
        Statics.field833 = field919 == 0 ? 443 : field917 + 50000;
        Statics.field420 = Statics.field2824;
        Statics.field3535 = class216.field2609;
        Statics.field2595 = class216.field2606;
        Statics.field1991 = class216.field2607;
        Statics.field3730 = class216.field2608;
        Statics.field340 = new class70();
        this.method850();
        this.method748();
        Statics.field588 = this.method747();
        Statics.field651 = new class162(255, class157.field2232, class157.field2233, 500000);
        class126 var1 = null;
        class82 var2 = new class82();
        try {
            var1 = Statics.method2219("", Statics.field425.field3176, false);
            byte[] var3 = new byte[(int) var1.method2178()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method2177(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class82(new class175(var3));
        } catch (Exception var13) {
        }
        try {
            if (var1 != null) {
                var1.method2187();
            }
        } catch (Exception var12) {
        }
        Statics.field2198 = var2;
        this.method861();
        String var10 = Statics.field3142;
        class57.field665 = this;
        class57.field662 = var10;
        if (field919 != 0) {
            field931 = true;
        }
        int var11 = Statics.field2198.field1297;
        field1116 = 0L;
        if (var11 >= 2) {
            field1117 = true;
        } else {
            field1117 = false;
        }
        if (method2313() == 1) {
            Statics.field32.method745(765, 503);
        } else {
            Statics.field32.method745(7680, 2160);
        }
        if (field923 >= 25) {
            method107();
        }
    }

    @ObfuscatedName("client.ak(I)V")
    public final void method770() {
        field925++;
        this.method1088();
        while (true) {
            class195 var1 = class238.field3216;
            class235 var2;
            synchronized (class238.field3216) {
                var2 = (class235) class238.field3215.method3341();
            }
            if (var2 == null) {
                class205.method87();
                method465();
                class51.method121();
                class60 var4 = class60.field713;
                synchronized (class60.field713) {
                    class60.field712 = class60.field730;
                    class60.field719 = class60.field716;
                    class60.field720 = class60.field717 * 1389860993;
                    class60.field735 = class60.field721;
                    class60.field726 = class60.field722;
                    class60.field727 = class60.field723;
                    class60.field728 = class60.field724;
                    class60.field721 = 0;
                }
                if (Statics.field588 != null) {
                    int var6 = Statics.field588.method645();
                    field1101 = var6;
                }
                if (field923 == 0) {
                    method1055();
                    Statics.field3173.method2715();
                    for (int var7 = 0; var7 < 32; var7++) {
                        field680[var7] = 0L;
                    }
                    for (int var8 = 0; var8 < 32; var8++) {
                        field709[var8] = 0L;
                    }
                    Statics.field2581 = 0;
                } else if (field923 == 5) {
                    class94.method1569(this);
                    method1055();
                    Statics.field3173.method2715();
                    for (int var9 = 0; var9 < 32; var9++) {
                        field680[var9] = 0L;
                    }
                    for (int var10 = 0; var10 < 32; var10++) {
                        field709[var10] = 0L;
                    }
                    Statics.field2581 = 0;
                } else if (field923 == 10 || field923 == 11) {
                    class94.method1569(this);
                } else if (field923 == 20) {
                    class94.method1569(this);
                    this.method1090();
                } else if (field923 == 25) {
                    method513();
                }
                if (field923 == 30) {
                    this.method1091();
                } else if (field923 == 40 || field923 == 45) {
                    this.method1090();
                }
                return;
            }
            var2.field3188.method3910(var2.field3187, (int) var2.field2451, var2.field3186, false);
        }
    }

    @ObfuscatedName("client.ad(ZI)V")
    public final void method771(boolean arg0) {
        boolean var2 = class205.method1707();
        if (var2 && field1142 && Statics.field1214 != null) {
            Statics.field1214.method1894();
        }
        if ((field923 == 10 || field923 == 20 || field923 == 30) && field1116 != 0L && class177.method2903() > field1116) {
            int var3 = method2313();
            field1116 = 0L;
            if (var3 >= 2) {
                field1117 = true;
            } else {
                field1117 = false;
            }
            if (method2313() == 1) {
                Statics.field32.method745(765, 503);
            } else {
                Statics.field32.method745(7680, 2160);
            }
            if (field923 >= 25) {
                method107();
            }
        }
        if (arg0) {
            for (int var4 = 0; var4 < 100; var4++) {
                field1108[var4] = true;
            }
        }
        if (field923 == 0) {
            this.method773(class94.field1434, class94.field1435, arg0);
        } else if (field923 == 5) {
            class94.method4(Statics.field407, Statics.field853, Statics.field3847, arg0);
        } else if (field923 == 10 || field923 == 11) {
            class94.method4(Statics.field407, Statics.field853, Statics.field3847, arg0);
        } else if (field923 == 20) {
            class94.method4(Statics.field407, Statics.field853, Statics.field3847, arg0);
        } else if (field923 == 25) {
            if (field974 == 1) {
                if (field1124 > field930) {
                    field930 = field1124;
                }
                int var5 = (field930 * 50 - field1124 * 50) / field930;
                method162(class227.field2836 + class90.field1382 + class90.field1377 + var5 + "%" + class90.field1390, false);
            } else if (field974 == 2) {
                if (field972 > field973) {
                    field973 = field972;
                }
                int var6 = (field973 * 50 - field972 * 50) / field973 + 50;
                method162(class227.field2836 + class90.field1382 + class90.field1377 + var6 + "%" + class90.field1390, false);
            } else {
                method162(class227.field2836, false);
            }
        } else if (field923 == 30) {
            this.method1107();
        } else if (field923 == 40) {
            method162(class227.field2837 + class90.field1382 + class227.field2838, false);
        } else if (field923 == 45) {
            method162(class227.field2984, false);
        }
        if (field923 == 30 && field1115 == 0 && !arg0 && !field1117) {
            for (int var7 = 0; var7 < field1106; var7++) {
                if (field1160[var7]) {
                    Statics.field323.method729(field1111[var7], field1112[var7], field1113[var7], field1025[var7]);
                    field1160[var7] = false;
                }
            }
        } else if (field923 > 0) {
            Statics.field323.method727(0, 0);
            for (int var8 = 0; var8 < field1106; var8++) {
                field1160[var8] = false;
            }
        }
    }

    @ObfuscatedName("client.at(I)V")
    public final void method772() {
        if (Statics.field602.method1709()) {
            Statics.field602.method1700();
        }
        if (Statics.field2206 != null) {
            Statics.field2206.field862 = false;
        }
        Statics.field2206 = null;
        if (Statics.field2312 != null) {
            Statics.field2312.method2792();
            Statics.field2312 = null;
        }
        if (class51.field622 != null) {
            class51 var1 = class51.field622;
            synchronized (class51.field622) {
                class51.field622 = null;
            }
        }
        if (class60.field713 != null) {
            class60 var3 = class60.field713;
            synchronized (class60.field713) {
                class60.field713 = null;
            }
        }
        Statics.field588 = null;
        if (Statics.field1214 != null) {
            Statics.field1214.method1895();
        }
        if (Statics.field1858 != null) {
            Statics.field1858.method1895();
        }
        class240.method1606();
        Object var5 = class238.field3218;
        synchronized (class238.field3218) {
            if (class238.field3217 != 0) {
                class238.field3217 = 1;
                try {
                    class238.field3218.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        if (Statics.field340 != null) {
            Statics.field340.method1005();
            Statics.field340 = null;
        }
        class157.method3799();
    }

    @ObfuscatedName("ao.ee(II)V")
    public static void method241(int arg0) {
        if (field923 == arg0) {
            return;
        }
        if (field923 == 0) {
            Statics.field32.method774();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field947 = 0;
            field948 = 0;
            field949 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field342 != null) {
            Statics.field342.method2792();
            Statics.field342 = null;
        }
        if (field923 == 25) {
            field974 = 0;
            field1124 = 0;
            field930 = 1;
            field972 = 0;
            field973 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class94.method1608(Statics.field856, Statics.field441, true, 0);
        } else if (arg0 == 20) {
            class94.method1608(Statics.field856, Statics.field441, true, field923 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class94.method1608(Statics.field856, Statics.field441, false, 4);
        } else {
            class94.method2701();
        }
        field923 = arg0;
    }

    @ObfuscatedName("client.ey(B)V")
    public void method1088() {
        if (field923 == 1000) {
            return;
        }
        long var1 = class177.method2903();
        int var3 = (int) (var1 - Statics.field3240);
        Statics.field3240 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class240.field3252 += var3;
        boolean var4;
        if (class240.field3247 == 0 && class240.field3242 == 0 && class240.field3236 == 0 && class240.field3250 == 0) {
            var4 = true;
        } else if (Statics.field3238 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class240.field3252 > 30000) {
                        throw new IOException();
                    }
                    while (class240.field3242 < 20 && class240.field3250 > 0) {
                        class236 var5 = (class236) class240.field3239.method3295();
                        class175 var6 = new class175(4);
                        var6.method2913(1);
                        var6.method2915((int) var5.field2451);
                        Statics.field3238.method2785(var6.field2376, 0, 4);
                        class240.field3237.method3293(var5, var5.field2451);
                        class240.field3250--;
                        class240.field3242++;
                    }
                    while (class240.field3247 < 20 && class240.field3236 > 0) {
                        class236 var7 = (class236) class240.field3243.method3232();
                        class175 var8 = new class175(4);
                        var8.method2913(0);
                        var8.method2915((int) var7.field2451);
                        Statics.field3238.method2785(var8.field2376, 0, 4);
                        var7.method3380();
                        class240.field3241.method3293(var7, var7.field2451);
                        class240.field3236--;
                        class240.field3247++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3238.method2787();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class240.field3252 = 0;
                        byte var11 = 0;
                        if (Statics.field1386 == null) {
                            var11 = 8;
                        } else if (class240.field3249 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class240.field3248.field2381;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3238.method2789(class240.field3248.field2376, class240.field3248.field2381, var12);
                            if (class240.field3244 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class240.field3248.field2376[class240.field3248.field2381 + var13] ^= class240.field3244;
                                }
                            }
                            class240.field3248.field2381 += var12;
                            if (class240.field3248.field2381 < var11) {
                                break;
                            }
                            if (Statics.field1386 == null) {
                                class240.field3248.field2381 = 0;
                                int var14 = class240.field3248.method2928();
                                int var15 = class240.field3248.method3091();
                                int var16 = class240.field3248.method2928();
                                int var17 = class240.field3248.method2933();
                                long var18 = (long) ((var14 << 16) + var15);
                                class236 var20 = (class236) class240.field3237.method3294(var18);
                                Statics.field2329 = true;
                                if (var20 == null) {
                                    var20 = (class236) class240.field3241.method3294(var18);
                                    Statics.field2329 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1386 = var20;
                                Statics.field3651 = new class175(var17 + var21 + Statics.field1386.field3192);
                                Statics.field3651.method2913(var16);
                                Statics.field3651.method2916(var17);
                                class240.field3249 = 8;
                                class240.field3248.field2381 = 0;
                            } else if (class240.field3249 == 0) {
                                if (class240.field3248.field2376[0] == -1) {
                                    class240.field3249 = 1;
                                    class240.field3248.field2381 = 0;
                                } else {
                                    Statics.field1386 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field3651.field2376.length - Statics.field1386.field3192;
                            int var23 = 512 - class240.field3249;
                            if (var23 > var22 - Statics.field3651.field2381) {
                                var23 = var22 - Statics.field3651.field2381;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3238.method2789(Statics.field3651.field2376, Statics.field3651.field2381, var23);
                            if (class240.field3244 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field3651.field2376[Statics.field3651.field2381 + var24] ^= class240.field3244;
                                }
                            }
                            Statics.field3651.field2381 += var23;
                            class240.field3249 += var23;
                            if (Statics.field3651.field2381 == var22) {
                                if (Statics.field1386.field2451 == 16711935L) {
                                    Statics.field324 = Statics.field3651;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class239 var26 = class240.field3251[var25];
                                        if (var26 != null) {
                                            Statics.field324.field2381 = var25 * 8 + 5;
                                            int var27 = Statics.field324.method2933();
                                            int var28 = Statics.field324.method2933();
                                            var26.method3915(var27, var28);
                                        }
                                    }
                                } else {
                                    class240.field3245.reset();
                                    class240.field3245.update(Statics.field3651.field2376, 0, var22);
                                    int var29 = (int) class240.field3245.getValue();
                                    if (Statics.field1386.field3194 != var29) {
                                        try {
                                            Statics.field3238.method2792();
                                        } catch (Exception var35) {
                                        }
                                        class240.field3253++;
                                        Statics.field3238 = null;
                                        class240.field3244 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class240.field3253 = 0;
                                    class240.field3254 = 0;
                                    Statics.field1386.field3193.method3914((int) (Statics.field1386.field2451 & 0xFFFFL), Statics.field3651.field2376, (Statics.field1386.field2451 & 0xFF0000L) == 16711680L, Statics.field2329);
                                }
                                Statics.field1386.method3333();
                                if (Statics.field2329) {
                                    class240.field3242--;
                                } else {
                                    class240.field3247--;
                                }
                                class240.field3249 = 0;
                                Statics.field1386 = null;
                                Statics.field3651 = null;
                            } else {
                                if (class240.field3249 != 512) {
                                    break;
                                }
                                class240.field3249 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3238.method2792();
                } catch (Exception var34) {
                }
                class240.field3254++;
                Statics.field3238 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1089();
        }
    }

    @ObfuscatedName("client.eb(I)V")
    public void method1089() {
        if (class240.field3253 >= 4) {
            this.method816("js5crc");
            field923 = 1000;
            return;
        }
        if (class240.field3254 >= 4) {
            if (field923 <= 5) {
                this.method816("js5io");
                field923 = 1000;
                return;
            }
            field945 = 3000;
            class240.field3254 = 3;
        }
        if (--field945 + 1 > 0) {
            return;
        }
        try {
            if (field960 == 0) {
                Statics.field2035 = Statics.field299.method2732(Statics.field790, Statics.field420);
                field960++;
            }
            if (field960 == 1) {
                if (Statics.field2035.field2211 == 2) {
                    this.method1318(-1);
                    return;
                }
                if (Statics.field2035.field2211 == 1) {
                    field960++;
                }
            }
            if (field960 == 2) {
                Statics.field445 = new class161((Socket) Statics.field2035.field2215, Statics.field299);
                class175 var1 = new class175(5);
                var1.method2913(15);
                var1.method2916(152);
                Statics.field445.method2785(var1.field2376, 0, 5);
                field960++;
                Statics.field2330 = class177.method2903();
            }
            if (field960 == 3) {
                if (field923 <= 5 || Statics.field445.method2787() > 0) {
                    int var2 = Statics.field445.method2786();
                    if (var2 != 0) {
                        this.method1318(var2);
                        return;
                    }
                    field960++;
                } else if (class177.method2903() - Statics.field2330 > 30000L) {
                    this.method1318(-2);
                    return;
                }
            }
            if (field960 == 4) {
                class240.method4430(Statics.field445, field923 > 20);
                Statics.field2035 = null;
                Statics.field445 = null;
                field960 = 0;
                field946 = 0;
            }
        } catch (IOException var4) {
            this.method1318(-3);
        }
    }

    @ObfuscatedName("client.fi(II)V")
    public void method1318(int arg0) {
        Statics.field2035 = null;
        Statics.field445 = null;
        field960 = 0;
        if (Statics.field420 == Statics.field2824) {
            Statics.field420 = Statics.field833;
        } else {
            Statics.field420 = Statics.field2824;
        }
        field946++;
        if (field946 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field923 <= 5) {
                this.method816("js5connect_full");
                field923 = 1000;
            } else {
                field945 = 3000;
            }
        } else if (field946 >= 2 && arg0 == 6) {
            this.method816("js5connect_outofdate");
            field923 = 1000;
        } else if (field946 >= 4) {
            if (field923 <= 5) {
                this.method816("js5connect");
                field923 = 1000;
            } else {
                field945 = 3000;
            }
        }
    }

    @ObfuscatedName("bk.fw(B)V")
    public static void method1055() {
        if (field943 == 0) {
            Statics.field1335 = new class141(4, 104, 104, class62.field761);
            for (int var0 = 0; var0 < 4; var0++) {
                field975[var0] = new class163(104, 104);
            }
            Statics.field668 = new class287(512, 512);
            class94.field1435 = class227.field3072;
            class94.field1434 = 5;
            field943 = 20;
        } else if (field943 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class138.field2004[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class141.method2647(var1, 500, 800, 512, 334);
            class94.field1435 = class227.field2897;
            class94.field1434 = 10;
            field943 = 30;
        } else if (field943 == 30) {
            Statics.field788 = method179(0, false, true, true);
            Statics.field3848 = method179(1, false, true, true);
            Statics.field442 = method179(2, true, false, true);
            Statics.field3354 = method179(3, false, true, true);
            Statics.field1273 = method179(4, false, true, true);
            Statics.field2242 = method179(5, true, true, true);
            Statics.field3307 = method179(6, true, true, false);
            Statics.field321 = method179(7, false, true, true);
            Statics.field441 = method179(8, false, true, true);
            Statics.field742 = method179(9, false, true, true);
            Statics.field856 = method179(10, false, true, true);
            Statics.field475 = method179(11, false, true, true);
            Statics.field3390 = method179(12, false, true, true);
            Statics.field825 = method179(13, true, false, true);
            Statics.field647 = method179(14, false, true, false);
            Statics.field343 = method179(15, false, true, true);
            Statics.field293 = method179(16, false, true, false);
            class94.field1435 = class227.field3025;
            class94.field1434 = 20;
            field943 = 40;
        } else if (field943 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field788.method3918() * 4 / 100;
            int var8 = var7 + Statics.field3848.method3918() * 4 / 100;
            int var9 = var8 + Statics.field442.method3918() * 2 / 100;
            int var10 = var9 + Statics.field3354.method3918() * 2 / 100;
            int var11 = var10 + Statics.field1273.method3918() * 6 / 100;
            int var12 = var11 + Statics.field2242.method3918() * 4 / 100;
            int var13 = var12 + Statics.field3307.method3918() * 2 / 100;
            int var14 = var13 + Statics.field321.method3918() * 58 / 100;
            int var15 = var14 + Statics.field441.method3918() * 2 / 100;
            int var16 = var15 + Statics.field742.method3918() * 2 / 100;
            int var17 = var16 + Statics.field856.method3918() * 2 / 100;
            int var18 = var17 + Statics.field475.method3918() * 2 / 100;
            int var19 = var18 + Statics.field3390.method3918() * 2 / 100;
            int var20 = var19 + Statics.field825.method3918() * 2 / 100;
            int var21 = var20 + Statics.field647.method3918() * 2 / 100;
            int var22 = var21 + Statics.field343.method3918() * 2 / 100;
            int var23 = var22 + Statics.field293.method3918() * 2 / 100;
            if (var23 == 100) {
                class94.field1435 = class227.field2843;
                class94.field1434 = 30;
                field943 = 45;
            } else {
                if (var23 != 0) {
                    class94.field1435 = class227.field2842 + var23 + "%";
                }
                class94.field1434 = 30;
            }
        } else if (field943 == 45) {
            boolean var24 = !field1109;
            Statics.field1618 = 22050;
            Statics.field375 = var24;
            Statics.field250 = 2;
            class206 var25 = new class206();
            var25.method3455(9, 128);
            Statics.field1214 = class111.method3184(Statics.field299, 0, 22050);
            Statics.field1214.method1891(var25);
            class205.method1021(Statics.field343, Statics.field647, Statics.field1273, var25);
            Statics.field1858 = class111.method3184(Statics.field299, 1, 2048);
            Statics.field514 = new class104();
            Statics.field1858.method1891(Statics.field514);
            Statics.field3115 = new class118(22050, Statics.field1618);
            class94.field1435 = class227.field3004;
            class94.field1434 = 35;
            field943 = 50;
            Statics.field1270 = new class264(Statics.field441, Statics.field825);
        } else if (field943 == 50) {
            int var26 = class263.method4435().length;
            field992 = Statics.field1270.method4439(class263.method4435());
            if (field992.size() < var26) {
                class94.field1435 = class227.field2845 + field992.size() * 100 / var26 + "%";
                class94.field1434 = 40;
            } else {
                Statics.field853 = (class265) field992.get(class263.field3624);
                Statics.field3847 = (class265) field992.get(class263.field3614);
                Statics.field407 = (class265) field992.get(class263.field3615);
                Statics.field732 = new class293(true);
                class94.field1435 = class227.field2883;
                class94.field1434 = 40;
                field943 = 60;
            }
        } else if (field943 == 60) {
            int var27 = class94.method1597(Statics.field856, Statics.field441);
            int var28 = class94.method677();
            if (var27 < var28) {
                class94.field1435 = class227.field2847 + var27 * 100 / var28 + "%";
                class94.field1434 = 50;
            } else {
                class94.field1435 = class227.field3046;
                class94.field1434 = 50;
                method241(5);
                field943 = 70;
            }
        } else if (field943 == 70) {
            if (Statics.field442.method3833()) {
                class239 var29 = Statics.field442;
                Statics.field3591 = var29;
                class248.method3638(Statics.field442);
                class249.method3444(Statics.field442, Statics.field321);
                class239 var30 = Statics.field442;
                class239 var31 = Statics.field321;
                boolean var32 = field1109;
                Statics.field3669 = var30;
                Statics.field3462 = var31;
                class257.field3453 = var32;
                class260.method2191(Statics.field442, Statics.field321);
                class254.method551(Statics.field442);
                class239 var33 = Statics.field442;
                class239 var34 = Statics.field321;
                boolean var35 = field920;
                class265 var36 = Statics.field853;
                Statics.field1326 = var33;
                Statics.field2587 = var34;
                Statics.field3480 = var35;
                Statics.field3481 = Statics.field1326.method3828(10);
                Statics.field2401 = var36;
                class239 var37 = Statics.field442;
                class239 var38 = Statics.field788;
                class239 var39 = Statics.field3848;
                Statics.field3607 = var37;
                Statics.field3594 = var38;
                Statics.field318 = var39;
                class247.method3995(Statics.field442, Statics.field321);
                class252.method2698(Statics.field442);
                class243.method207(Statics.field442);
                class218.method9(Statics.field3354, Statics.field321, Statics.field441, Statics.field825);
                class242.method724(Statics.field442);
                class239 var40 = Statics.field442;
                Statics.field3394 = var40;
                class245.method1614(Statics.field442);
                class239 var41 = Statics.field442;
                Statics.field339 = var41;
                class239 var42 = Statics.field442;
                Statics.field3385 = var42;
                Statics.field602 = new class99();
                class256.method536(Statics.field442, Statics.field441, Statics.field825);
                class239 var43 = Statics.field442;
                class239 var44 = Statics.field441;
                Statics.field3358 = var43;
                Statics.field3356 = var44;
                class244.method2711(Statics.field442, Statics.field441);
                class94.field1435 = class227.field2850;
                class94.field1434 = 60;
                field943 = 80;
            } else {
                class94.field1435 = class227.field2849 + Statics.field442.method3913() + "%";
                class94.field1434 = 60;
            }
        } else if (field943 == 80) {
            int var45 = 0;
            if (Statics.field273 == null) {
                Statics.field273 = class288.method4572(Statics.field441, "compass", "");
            } else {
                var45++;
            }
            if (Statics.field740 == null) {
                Statics.field740 = class288.method4572(Statics.field441, "mapedge", "");
            } else {
                var45++;
            }
            if (Statics.field322 == null) {
                Statics.field322 = Statics.method49(Statics.field441, "mapscene", "");
            } else {
                var45++;
            }
            if (Statics.field794 == null) {
                Statics.field794 = class288.method3780(Statics.field441, "headicons_pk", "");
            } else {
                var45++;
            }
            if (Statics.field1653 == null) {
                Statics.field1653 = class288.method3780(Statics.field441, "headicons_prayer", "");
            } else {
                var45++;
            }
            if (Statics.field3384 == null) {
                Statics.field3384 = class288.method3780(Statics.field441, "headicons_hint", "");
            } else {
                var45++;
            }
            if (Statics.field1524 == null) {
                Statics.field1524 = class288.method3780(Statics.field441, "mapmarker", "");
            } else {
                var45++;
            }
            if (Statics.field2422 == null) {
                Statics.field2422 = class288.method3780(Statics.field441, "cross", "");
            } else {
                var45++;
            }
            if (Statics.field582 == null) {
                Statics.field582 = class288.method3780(Statics.field441, "mapdots", "");
            } else {
                var45++;
            }
            if (Statics.field402 == null) {
                Statics.field402 = Statics.method49(Statics.field441, "scrollbar", "");
            } else {
                var45++;
            }
            if (Statics.field243 == null) {
                Statics.field243 = Statics.method49(Statics.field441, "mod_icons", "");
            } else {
                var45++;
            }
            if (var45 < 11) {
                class94.field1435 = class227.field2851 + var45 * 100 / 12 + "%";
                class94.field1434 = 70;
            } else {
                Statics.field3638 = Statics.field243;
                Statics.field740.method4758();
                int var46 = (int) (Math.random() * 21.0D) - 10;
                int var47 = (int) (Math.random() * 21.0D) - 10;
                int var48 = (int) (Math.random() * 21.0D) - 10;
                int var49 = (int) (Math.random() * 41.0D) - 20;
                Statics.field322[0].method4733(var46 + var49, var47 + var49, var48 + var49);
                class94.field1435 = class227.field2852;
                class94.field1434 = 70;
                field943 = 90;
            }
        } else if (field943 == 90) {
            if (Statics.field742.method3833()) {
                class127 var50 = new class127(Statics.field742, Statics.field441, 20, 0.8D, field1109 ? 64 : 128);
                class138.method2487(var50);
                class138.method2433(0.8D);
                class94.field1435 = class227.field2928;
                class94.field1434 = 90;
                field943 = 110;
            } else {
                class94.field1435 = class227.field3088 + Statics.field742.method3913() + "%";
                class94.field1434 = 90;
            }
        } else if (field943 == 110) {
            Statics.field2206 = new class73();
            Statics.field299.method2731(Statics.field2206, 10);
            class94.field1435 = class227.field3008;
            class94.field1434 = 94;
            field943 = 120;
        } else if (field943 == 120) {
            if (Statics.field856.method3837("huffman", "")) {
                class167 var51 = new class167(Statics.field856.method3846("huffman", ""));
                class267.method583(var51);
                class94.field1435 = class227.field3038;
                class94.field1434 = 96;
                field943 = 130;
            } else {
                class94.field1435 = class227.field2856 + "%";
                class94.field1434 = 96;
            }
        } else if (field943 == 130) {
            if (!Statics.field3354.method3833()) {
                class94.field1435 = class227.field2864 + Statics.field3354.method3913() * 4 / 5 + "%";
                class94.field1434 = 100;
            } else if (!Statics.field3390.method3833()) {
                class94.field1435 = class227.field2864 + (80 + Statics.field3390.method3913() / 6) + "%";
                class94.field1434 = 100;
            } else if (Statics.field825.method3833()) {
                class94.field1435 = class227.field3023;
                class94.field1434 = 98;
                field943 = 140;
            } else {
                class94.field1435 = class227.field2864 + (96 + Statics.field825.method3913() / 50) + "%";
                class94.field1434 = 100;
            }
        } else if (field943 == 140) {
            if (Statics.field293.method3870(class41.field543.field541)) {
                if (Statics.field30 == null) {
                    Statics.field30 = new class290();
                    Statics.field30.method4891(Statics.field293, Statics.field407, field992, Statics.field322);
                }
                int var52 = Statics.field30.method4892();
                if (var52 < 100) {
                    class94.field1435 = class227.field3037 + (var52 * 9 / 10 + 10) + "%";
                } else {
                    class94.field1435 = class227.field2861;
                    class94.field1434 = 100;
                    field943 = 150;
                }
            } else {
                class94.field1435 = class227.field3037 + Statics.field293.method3840(class41.field543.field541) / 10 + "%";
            }
        } else if (field943 == 150) {
            method241(10);
        }
    }

    @ObfuscatedName("q.fe(IZZZB)Lid;")
    public static class239 method179(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class162 var4 = null;
        if (class157.field2232 != null) {
            var4 = new class162(arg0, class157.field2232, Statics.field2228[arg0], 1000000);
        }
        return new class239(var4, Statics.field651, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fv(I)V")
    public final void method1090() {
        try {
            if (field947 == 0) {
                if (Statics.field2312 != null) {
                    Statics.field2312.method2792();
                    Statics.field2312 = null;
                }
                Statics.field497 = null;
                field968 = false;
                field948 = 0;
                field947 = 1;
            }
            if (field947 == 1) {
                if (Statics.field497 == null) {
                    Statics.field497 = Statics.field299.method2732(Statics.field790, Statics.field420);
                }
                if (Statics.field497.field2211 == 2) {
                    throw new IOException();
                }
                if (Statics.field497.field2211 == 1) {
                    Statics.field2312 = new class161((Socket) Statics.field497.field2215, Statics.field299);
                    Statics.field497 = null;
                    field947 = 2;
                }
            }
            if (field947 == 2) {
                field957.field2381 = 0;
                field957.method2913(14);
                Statics.field2312.method2785(field957.field2376, 0, 1);
                field959.field2381 = 0;
                field947 = 3;
            }
            if (field947 == 3) {
                if (Statics.field1214 != null) {
                    Statics.field1214.method1893();
                }
                if (Statics.field1858 != null) {
                    Statics.field1858.method1893();
                }
                int var1 = Statics.field2312.method2786();
                if (Statics.field1214 != null) {
                    Statics.field1214.method1893();
                }
                if (Statics.field1858 != null) {
                    Statics.field1858.method1893();
                }
                if (var1 != 0) {
                    method529(var1);
                    return;
                }
                field959.field2381 = 0;
                field947 = 4;
            }
            if (field947 == 4) {
                if (field959.field2381 < 8) {
                    int var2 = Statics.field2312.method2787();
                    if (var2 > 8 - field959.field2381) {
                        var2 = 8 - field959.field2381;
                    }
                    if (var2 > 0) {
                        Statics.field2312.method2789(field959.field2376, field959.field2381, var2);
                        field959.field2381 += var2;
                    }
                }
                if (field959.field2381 == 8) {
                    field959.field2381 = 0;
                    Statics.field27 = field959.method2934();
                    field947 = 5;
                }
            }
            if (field947 == 5) {
                int[] var3 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field27 >> 32), (int) (Statics.field27 & 0xFFFFFFFFFFFFFFFFL) };
                field957.field2381 = 0;
                field957.method2913(1);
                field957.method2913(class94.field1448.method6());
                field957.method2916(var3[0]);
                field957.method2916(var3[1]);
                field957.method2916(var3[2]);
                field957.method2916(var3[3]);
                switch(class94.field1448.field2183) {
                    case 0:
                    case 1:
                        field957.method2915(Statics.field604);
                        field957.field2381 += 5;
                        break;
                    case 2:
                        field957.method2916((Integer) Statics.field2198.field1294.get(class272.method4019(class94.field1441)));
                        field957.field2381 += 4;
                        break;
                    case 3:
                        field957.field2381 += 8;
                }
                field957.method2927(class94.field1451);
                field957.method2949(class92.field1402, class92.field1401);
                field1174.field2381 = 0;
                if (field923 == 40) {
                    field1174.method2913(18);
                } else {
                    field1174.method2913(16);
                }
                field1174.method2914(0);
                int var4 = field1174.field2381;
                field1174.method2916(152);
                field1174.method3122(field957.field2376, 0, field957.field2381);
                int var5 = field1174.field2381;
                field1174.method2927(class94.field1441);
                field1174.method2913((field1117 ? 1 : 0) << 1 | (field1109 ? 1 : 0));
                field1174.method2914(Statics.field1365);
                field1174.method2914(Statics.field3269);
                method1037(field1174);
                field1174.method2927(Statics.field863);
                field1174.method2916(Statics.field524);
                class175 var6 = new class175(Statics.field732.method5086());
                Statics.field732.method5094(var6);
                field1174.method3122(var6.field2376, 0, var6.field2376.length);
                field1174.method2913(Statics.field470);
                field1174.method2916(0);
                field1174.method2916(Statics.field788.field3209);
                field1174.method2916(Statics.field3848.field3209);
                field1174.method2916(Statics.field442.field3209);
                field1174.method2916(Statics.field3354.field3209);
                field1174.method2916(Statics.field1273.field3209);
                field1174.method2916(Statics.field2242.field3209);
                field1174.method2916(Statics.field3307.field3209);
                field1174.method2916(Statics.field321.field3209);
                field1174.method2916(Statics.field441.field3209);
                field1174.method2916(Statics.field742.field3209);
                field1174.method2916(Statics.field856.field3209);
                field1174.method2916(Statics.field475.field3209);
                field1174.method2916(Statics.field3390.field3209);
                field1174.method2916(Statics.field825.field3209);
                field1174.method2916(Statics.field647.field3209);
                field1174.method2916(Statics.field343.field3209);
                field1174.method2916(Statics.field293.field3209);
                field1174.method2947(var3, var5, field1174.field2381);
                field1174.method2936(field1174.field2381 - var4);
                Statics.field2312.method2785(field1174.field2376, 0, field1174.field2381);
                field957.method3153(var3);
                for (int var7 = 0; var7 < 4; var7++) {
                    var3[var7] += 50;
                }
                field959.method3153(var3);
                field947 = 6;
            }
            if (field947 == 6 && Statics.field2312.method2787() > 0) {
                int var8 = Statics.field2312.method2786();
                if (var8 == 21 && field923 == 20) {
                    field947 = 7;
                } else if (var8 == 2) {
                    field947 = 9;
                } else if (var8 == 15 && field923 == 40) {
                    field1000 = -1;
                    field947 = 13;
                } else if (var8 == 23 && field949 < 1) {
                    field949++;
                    field947 = 0;
                } else if (var8 == 29) {
                    field947 = 11;
                } else {
                    method529(var8);
                    return;
                }
            }
            if (field947 == 7 && Statics.field2312.method2787() > 0) {
                field1156 = (Statics.field2312.method2786() + 3) * 60;
                field947 = 8;
            }
            if (field947 == 8) {
                field948 = 0;
                class94.method148(class227.field2865, class227.field2866, field1156 / 60 + class227.field2867);
                if (--field1156 <= 0) {
                    field947 = 0;
                }
            } else {
                if (field947 == 9 && Statics.field2312.method2787() >= 13) {
                    boolean var9 = Statics.field2312.method2786() == 1;
                    Statics.field2312.method2789(field959.field2376, 0, 4);
                    field959.field2381 = 0;
                    boolean var10 = false;
                    if (var9) {
                        int var11 = field959.method3155() << 24;
                        int var12 = var11 | field959.method3155() << 16;
                        int var13 = var12 | field959.method3155() << 8;
                        int var14 = var13 | field959.method3155();
                        int var15 = class272.method4019(class94.field1441);
                        if (Statics.field2198.field1294.size() >= 10 && !Statics.field2198.field1294.containsKey(var15)) {
                            Iterator var16 = Statics.field2198.field1294.entrySet().iterator();
                            var16.next();
                            var16.remove();
                        }
                        Statics.field2198.field1294.put(var15, var14);
                        class82.method1649();
                    }
                    field1070 = Statics.field2312.method2786();
                    field1072 = Statics.field2312.method2786() == 1;
                    field1129 = Statics.field2312.method2786();
                    field1129 <<= 0x8;
                    field1129 += Statics.field2312.method2786();
                    field1078 = Statics.field2312.method2786();
                    Statics.field2312.method2789(field959.field2376, 0, 1);
                    field959.field2381 = 0;
                    field961 = field959.method3155();
                    Statics.field2312.method2789(field959.field2376, 0, 2);
                    field959.field2381 = 0;
                    field1000 = field959.method3091();
                    try {
                        client var17 = Statics.field32;
                        JSObject.getWindow(var17).call("zap", (Object[]) null);
                    } catch (Throwable var24) {
                    }
                    field947 = 10;
                }
                if (field947 != 10) {
                    if (field947 == 11 && Statics.field2312.method2787() >= 2) {
                        field959.field2381 = 0;
                        Statics.field2312.method2789(field959.field2376, 0, 2);
                        field959.field2381 = 0;
                        Statics.field1283 = field959.method3091();
                        field947 = 12;
                    }
                    if (field947 == 12 && Statics.field2312.method2787() >= Statics.field1283) {
                        field959.field2381 = 0;
                        Statics.field2312.method2789(field959.field2376, 0, Statics.field1283);
                        field959.field2381 = 0;
                        String var19 = field959.method3113();
                        String var20 = field959.method3113();
                        String var21 = field959.method3113();
                        class94.method148(var19, var20, var21);
                        method241(10);
                    }
                    if (field947 == 13) {
                        if (field1000 == -1) {
                            if (Statics.field2312.method2787() < 2) {
                                return;
                            }
                            Statics.field2312.method2789(field959.field2376, 0, 2);
                            field959.field2381 = 0;
                            field1000 = field959.method3091();
                        }
                        if (Statics.field2312.method2787() >= field1000) {
                            Statics.field2312.method2789(field959.field2376, 0, field1000);
                            field959.field2381 = 0;
                            int var22 = field1000;
                            method1593();
                            class98.method3903(field959);
                            if (field959.field2381 != var22) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field948++;
                        if (field948 > 2000) {
                            if (field949 < 1) {
                                if (Statics.field420 == Statics.field2824) {
                                    Statics.field420 = Statics.field833;
                                } else {
                                    Statics.field420 = Statics.field2824;
                                }
                                field949++;
                                field947 = 0;
                            } else {
                                method529(-3);
                            }
                        }
                    }
                } else if (Statics.field2312.method2787() >= field1000) {
                    field959.field2381 = 0;
                    Statics.field2312.method2789(field959.field2376, 0, field1000);
                    method3786();
                    class98.method3903(field959);
                    Statics.field606 = -1;
                    method4442(false);
                    field961 = -1;
                }
            }
        } catch (IOException var25) {
            if (field949 < 1) {
                if (Statics.field420 == Statics.field2824) {
                    Statics.field420 = Statics.field833;
                } else {
                    Statics.field420 = Statics.field2824;
                }
                field949++;
                field947 = 0;
            } else {
                method529(-2);
            }
        }
    }

    @ObfuscatedName("hj.fy(B)V")
    public static void method3786() {
        field1182 = 1L;
        field938 = -1;
        Statics.field2206.field858 = 0;
        Statics.field227 = true;
        field1058 = true;
        field944 = -1L;
        class282.method1582();
        field957.field2381 = 0;
        field959.field2381 = 0;
        field961 = -1;
        field927 = -1;
        field1060 = -1;
        field966 = -1;
        field969 = 0;
        field932 = 0;
        field1041 = 0;
        field1104 = 0;
        field929 = 0;
        field936 = false;
        class60.field711 = 0;
        class100.field1518.clear();
        class100.field1517.method3251();
        class100.field1521.method3418();
        class100.field1516 = 0;
        field1056 = 0;
        field970 = false;
        field1145 = 0;
        field987 = 0;
        field1139 = 0;
        field950 = -1;
        field1137 = 0;
        field967 = 0;
        field941 = class93.field1411;
        field1090 = class93.field1411;
        field953 = 0;
        class98.method1657();
        for (int var0 = 0; var0 < 2048; var0++) {
            field1099[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field952[var1] = null;
        }
        field1032 = -1;
        field1035.method3366();
        field1071.method3366();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field1131[var2][var3][var4] = null;
                }
            }
        }
        field1034 = new class195();
        field1171 = 0;
        field976 = 0;
        field1064 = 0;
        for (int var5 = 0; var5 < Statics.field3271; var5++) {
            class243 var6 = class243.method467(var5);
            if (var6 != null) {
                class213.field2583[var5] = 0;
                class213.field2585[var5] = 0;
            }
        }
        Statics.field602.method1693();
        field955 = -1;
        if (field1029 != -1) {
            class218.method1742(field1029);
        }
        for (class69 var7 = (class69) field1180.method3295(); var7 != null; var7 = (class69) field1180.method3302()) {
            method135(var7, true);
        }
        field1029 = -1;
        field1180 = new class192(8);
        field1067 = null;
        field929 = 0;
        field936 = false;
        field1036.method3669((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field922[var8] = null;
            field1020[var8] = false;
        }
        class64.field775 = new class192(32);
        field924 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field1108[var9] = true;
        }
        method107();
        field916 = null;
        Statics.field34 = 0;
        Statics.field468 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field1179[var10] = new class17();
        }
        Statics.field2328 = null;
    }

    @ObfuscatedName("ch.fq(I)V")
    public static void method1593() {
        field957.field2381 = 0;
        field959.field2381 = 0;
        field961 = -1;
        field927 = -1;
        field1060 = -1;
        field966 = -1;
        field1000 = 0;
        field969 = 0;
        field932 = 0;
        field929 = 0;
        field936 = false;
        field1139 = 0;
        field1137 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1099[var0] = null;
        }
        Statics.field655 = null;
        for (int var1 = 0; var1 < field952.length; var1++) {
            class88 var2 = field952[var1];
            if (var2 != null) {
                var2.field1232 = -1;
                var2.field1243 = false;
            }
        }
        class64.field775 = new class192(32);
        method241(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field1108[var3] = true;
        }
        method107();
    }

    @ObfuscatedName("af.fo(II)V")
    public static void method529(int arg0) {
        if (arg0 == -3) {
            class94.method148(class227.field2963, class227.field2869, class227.field2870);
        } else if (arg0 == -2) {
            class94.method148(class227.field2871, class227.field3064, class227.field2977);
        } else if (arg0 == -1) {
            class94.method148(class227.field3063, class227.field2875, class227.field2998);
        } else if (arg0 == 3) {
            class94.field1443 = 3;
        } else if (arg0 == 4) {
            class94.method148(class227.field2877, class227.field2878, class227.field2879);
        } else if (arg0 == 5) {
            class94.method148(class227.field2880, class227.field2956, class227.field3082);
        } else if (arg0 == 6) {
            class94.method148(class227.field2992, class227.field2884, class227.field2885);
        } else if (arg0 == 7) {
            class94.method148(class227.field2833, class227.field2887, class227.field2896);
        } else if (arg0 == 8) {
            class94.method148(class227.field2889, class227.field2890, class227.field2943);
        } else if (arg0 == 9) {
            class94.method148(class227.field2892, class227.field2893, class227.field2894);
        } else if (arg0 == 10) {
            class94.method148(class227.field2895, class227.field2868, class227.field3030);
        } else if (arg0 == 11) {
            class94.method148(class227.field3011, class227.field2899, class227.field2958);
        } else if (arg0 == 12) {
            class94.method148(class227.field2901, class227.field3071, class227.field3014);
        } else if (arg0 == 13) {
            class94.method148(class227.field2904, class227.field2926, class227.field3016);
        } else if (arg0 == 14) {
            class94.method148(class227.field2873, class227.field2908, class227.field2855);
        } else if (arg0 == 16) {
            class94.method148(class227.field2891, class227.field2857, class227.field2912);
        } else if (arg0 == 17) {
            class94.method148(class227.field2913, class227.field2914, class227.field2915);
        } else if (arg0 == 18) {
            class94.method148(class227.field3066, class227.field2917, class227.field2918);
        } else if (arg0 == 19) {
            class94.method148(class227.field2919, class227.field2920, class227.field2921);
        } else if (arg0 == 20) {
            class94.method148(class227.field3045, class227.field2923, class227.field2924);
        } else if (arg0 == 22) {
            class94.method148(class227.field2925, class227.field2853, class227.field2826);
        } else if (arg0 == 23) {
            class94.method148(class227.field2834, class227.field2929, class227.field2916);
        } else if (arg0 == 24) {
            class94.method148(class227.field2931, class227.field2932, class227.field2933);
        } else if (arg0 == 25) {
            class94.method148(class227.field2934, class227.field2996, class227.field3053);
        } else if (arg0 == 26) {
            class94.method148(class227.field2937, class227.field2938, class227.field2939);
        } else if (arg0 == 27) {
            class94.method148(class227.field2940, class227.field2941, class227.field2942);
        } else if (arg0 == 31) {
            class94.method148(class227.field2949, class227.field2859, class227.field2951);
        } else if (arg0 == 32) {
            class94.method148(class227.field2952, class227.field2953, class227.field2954);
        } else if (arg0 == 37) {
            class94.method148(class227.field2955, class227.field2854, class227.field2957);
        } else if (arg0 == 38) {
            class94.method148(class227.field3002, class227.field2959, class227.field2976);
        } else if (arg0 == 55) {
            class94.method148(class227.field2961, class227.field2911, class227.field3080);
        } else if (arg0 == 56) {
            class94.method148(class227.field2964, class227.field2886, class227.field2966);
            method241(11);
            return;
        } else if (arg0 == 57) {
            class94.method148(class227.field2967, class227.field2968, class227.field2902);
            method241(11);
            return;
        } else {
            class94.method148(class227.field2846, class227.field2971, class227.field2972);
        }
        method241(10);
    }

    @ObfuscatedName("ay.fz(B)V")
    public static final void method214() {
        if (Statics.field2312 != null) {
            Statics.field2312.method2792();
            Statics.field2312 = null;
        }
        method1407();
        Statics.field1335.method2544();
        for (int var0 = 0; var0 < 4; var0++) {
            field975[var0].method2813();
        }
        System.gc();
        class205.field2488 = 1;
        Statics.field2489 = null;
        Statics.field274 = -1;
        Statics.field2490 = -1;
        Statics.field2491 = 0;
        Statics.field473 = false;
        Statics.field2492 = 2;
        field1141 = -1;
        field1142 = false;
        class83.method164();
        method241(10);
    }

    @ObfuscatedName("be.fg(I)V")
    public static final void method1407() {
        class261.method1();
        class248.method582();
        class249.field3345.method3282();
        class257.field3429.method3282();
        class257.field3438.method3282();
        class257.field3431.method3282();
        class257.field3467.method3282();
        class260.field3544.method3282();
        class260.field3577.method3282();
        class258.field3482.method3282();
        class258.field3483.method3282();
        class258.field3484.method3282();
        class262.method1567();
        class247.method211();
        class252.method3706();
        class243.method3773();
        class256.field3420.method3282();
        class256.field3406.method3282();
        class256.field3407.method3282();
        class250.method675();
        class254.method3550();
        class253.method136();
        class244.field3279.method3282();
        class215.field2597.method3282();
        class218.field2618.method3282();
        class218.field2657.method3282();
        class218.field2620.method3282();
        class218.field2695.method3282();
        ((class127) Statics.field2014).method2201();
        class101.field1526.method3282();
        Statics.field788.method3831();
        Statics.field3848.method3831();
        Statics.field3354.method3831();
        Statics.field1273.method3831();
        Statics.field2242.method3831();
        Statics.field3307.method3831();
        Statics.field321.method3831();
        Statics.field441.method3831();
        Statics.field742.method3831();
        Statics.field856.method3831();
        Statics.field475.method3831();
        Statics.field3390.method3831();
    }

    @ObfuscatedName("fi.fn(I)V")
    public static final void method2761() {
        if (field1041 > 0) {
            method214();
        } else {
            method241(40);
            Statics.field342 = Statics.field2312;
            Statics.field2312 = null;
        }
    }

    @ObfuscatedName("client.fu(B)V")
    public final void method1091() {
        if (field932 > 1) {
            field932--;
        }
        if (field1041 > 0) {
            field1041--;
        }
        if (field968) {
            field968 = false;
            method2761();
            return;
        }
        if (!field936) {
            method13();
        }
        for (int var1 = 0; var1 < 100 && this.method1281(); var1++) {
        }
        if (field923 != 30) {
            return;
        }
        while (true) {
            class281 var2 = (class281) class282.field3738.method3313();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                Object var5 = Statics.field2206.field860;
                synchronized (Statics.field2206.field860) {
                    if (!field942) {
                        Statics.field2206.field858 = 0;
                    } else if (class60.field735 != 0 || Statics.field2206.field858 >= 40) {
                        field957.method3154(39);
                        field957.method2913(0);
                        int var6 = field957.field2381;
                        int var7 = 0;
                        for (int var8 = 0; var8 < Statics.field2206.field858 && field957.field2381 - var6 < 240; var8++) {
                            var7++;
                            int var9 = Statics.field2206.field864[var8];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 502) {
                                var9 = 502;
                            }
                            int var10 = Statics.field2206.field861[var8];
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > 764) {
                                var10 = 764;
                            }
                            int var11 = var9 * 765 + var10;
                            if (Statics.field2206.field864[var8] == -1 && Statics.field2206.field861[var8] == -1) {
                                var10 = -1;
                                var9 = -1;
                                var11 = 524287;
                            }
                            if (field1136 != var10 || field928 != var9) {
                                int var12 = var10 - field1136;
                                field1136 = var10;
                                int var13 = var9 - field928;
                                field928 = var9;
                                if (field938 < 8 && var12 >= -32 && var12 <= 31 && var13 >= -32 && var13 <= 31) {
                                    var12 += 32;
                                    var13 += 32;
                                    field957.method2914((field938 << 12) + (var12 << 6) + var13);
                                    field938 = 0;
                                } else if (field938 < 8) {
                                    field957.method2915((field938 << 19) + 8388608 + var11);
                                    field938 = 0;
                                } else {
                                    field957.method2916((field938 << 19) + -1073741824 + var11);
                                    field938 = 0;
                                }
                            } else if (field938 < 2047) {
                                field938++;
                            }
                        }
                        field957.method2981(field957.field2381 - var6);
                        if (var7 >= Statics.field2206.field858) {
                            Statics.field2206.field858 = 0;
                        } else {
                            Statics.field2206.field858 -= var7;
                            for (int var14 = 0; var14 < Statics.field2206.field858; var14++) {
                                Statics.field2206.field861[var14] = Statics.field2206.field861[var7 + var14];
                                Statics.field2206.field864[var14] = Statics.field2206.field864[var7 + var14];
                            }
                        }
                    }
                }
                if (class60.field735 == 1 || !Statics.field646 && class60.field735 == 4 || class60.field735 == 2) {
                    long var16 = (class60.field728 - field1182 * -1L) / 50L;
                    if (var16 > 4095L) {
                        var16 = 4095L;
                    }
                    field1182 = class60.field728 * -1L;
                    int var18 = class60.field727;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > Statics.field3269) {
                        var18 = Statics.field3269;
                    }
                    int var19 = class60.field726;
                    if (var19 < 0) {
                        var19 = 0;
                    } else if (var19 > Statics.field1365) {
                        var19 = Statics.field1365;
                    }
                    int var20 = (int) var16;
                    field957.method3154(123);
                    field957.method2914((var20 << 1) + (class60.field735 == 2 ? 1 : 0));
                    field957.method2914(var19);
                    field957.method2914(var18);
                }
                if (class51.field644 > 0) {
                    field957.method3154(36);
                    field957.method2914(0);
                    int var21 = field957.field2381;
                    long var22 = class177.method2903();
                    for (int var24 = 0; var24 < class51.field644; var24++) {
                        long var25 = var22 - field944;
                        if (var25 > 16777215L) {
                            var25 = 16777215L;
                        }
                        field944 = var22;
                        field957.method2969((int) var25);
                        field957.method2954(class51.field638[var24]);
                    }
                    field957.method2936(field957.field2381 - var21);
                }
                if (field993 > 0) {
                    field993--;
                }
                if (class51.field632[96] || class51.field632[97] || class51.field632[98] || class51.field632[99]) {
                    field994 = true;
                }
                if (field994 && field993 <= 0) {
                    field993 = 20;
                    field994 = false;
                    field957.method3154(7);
                    field957.method2963(field987);
                    field957.method2961(field986);
                }
                if (Statics.field227 && !field1058) {
                    field1058 = true;
                    field957.method3154(205);
                    field957.method2913(1);
                }
                if (!Statics.field227 && field1058) {
                    field1058 = false;
                    field957.method3154(205);
                    field957.method2913(0);
                }
                if (Statics.field424 != field950) {
                    field950 = Statics.field424;
                    method240(Statics.field424);
                }
                if (field923 != 30) {
                    return;
                }
                for (class78 var27 = (class78) field1034.method3348(); var27 != null; var27 = (class78) field1034.method3350()) {
                    if (var27.field1191 > 0) {
                        var27.field1191--;
                    }
                    if (var27.field1191 == 0) {
                        if (var27.field1190 >= 0) {
                            int var28 = var27.field1190;
                            int var29 = var27.field1192;
                            class257 var30 = class257.method247(var28);
                            if (var29 == 11) {
                                var29 = 10;
                            }
                            if (var29 >= 5 && var29 <= 8) {
                                var29 = 4;
                            }
                            boolean var31 = var30.method4223(var29);
                            if (!var31) {
                                continue;
                            }
                        }
                        method636(var27.field1194, var27.field1187, var27.field1188, var27.field1186, var27.field1190, var27.field1203, var27.field1192);
                        var27.method3333();
                    } else {
                        if (var27.field1196 > 0) {
                            var27.field1196--;
                        }
                        if (var27.field1196 == 0 && var27.field1188 >= 1 && var27.field1186 >= 1 && var27.field1188 <= 102 && var27.field1186 <= 102) {
                            if (var27.field1193 >= 0) {
                                int var32 = var27.field1193;
                                int var33 = var27.field1195;
                                class257 var34 = class257.method247(var32);
                                if (var33 == 11) {
                                    var33 = 10;
                                }
                                if (var33 >= 5 && var33 <= 8) {
                                    var33 = 4;
                                }
                                boolean var35 = var34.method4223(var33);
                                if (!var35) {
                                    continue;
                                }
                            }
                            method636(var27.field1194, var27.field1187, var27.field1188, var27.field1186, var27.field1193, var27.field1197, var27.field1195);
                            var27.field1196 = -1;
                            if (var27.field1193 == var27.field1190 && var27.field1190 == -1) {
                                var27.method3333();
                            } else if (var27.field1193 == var27.field1190 && var27.field1203 == var27.field1197 && var27.field1195 == var27.field1192) {
                                var27.method3333();
                            }
                        }
                    }
                }
                method579();
                field969++;
                if (field969 > 750) {
                    method2761();
                    return;
                }
                int var36 = class98.field1494;
                int[] var37 = class98.field1495;
                for (int var38 = 0; var38 < var36; var38++) {
                    class76 var39 = field1099[var37[var38]];
                    if (var39 != null) {
                        method1408(var39, 1);
                    }
                }
                for (int var40 = 0; var40 < field953; var40++) {
                    int var41 = field954[var40];
                    class88 var42 = field952[var41];
                    if (var42 != null) {
                        method1408(var42, var42.field1364.field3548);
                    }
                }
                method628();
                field1021++;
                if (field1096 != 0) {
                    field1012 += 20;
                    if (field1012 >= 400) {
                        field1096 = 0;
                    }
                }
                if (Statics.field3111 != null) {
                    field1157++;
                    if (field1157 >= 15) {
                        method4218(Statics.field3111);
                        Statics.field3111 = null;
                    }
                }
                class218 var43 = Statics.field570;
                class218 var44 = Statics.field603;
                Statics.field570 = null;
                Statics.field603 = null;
                field1121 = null;
                field1084 = false;
                field1081 = false;
                field1125 = 0;
                while (class51.method249() && field1125 < 128) {
                    if (field1070 >= 2 && class51.field632[82] && Statics.field2590 == 66) {
                        String var45 = class100.method145();
                        Statics.field32.method765(var45);
                    } else {
                        field1114[field1125] = Statics.field2590;
                        field1126[field1125] = Statics.field1293;
                        field1125++;
                    }
                }
                if (field1029 != -1) {
                    int var46 = field1029;
                    int var47 = Statics.field1365;
                    int var48 = Statics.field3269;
                    if (class218.method48(var46)) {
                        method3805(Statics.field1482[var46], -1, 0, 0, var47, var48, 0, 0);
                    }
                }
                field1088++;
                while (true) {
                    class71 var49;
                    class218 var50;
                    class218 var51;
                    do {
                        var49 = (class71) field1103.method3341();
                        if (var49 == null) {
                            while (true) {
                                class71 var52;
                                class218 var53;
                                class218 var54;
                                do {
                                    var52 = (class71) field1042.method3341();
                                    if (var52 == null) {
                                        while (true) {
                                            class71 var55;
                                            class218 var56;
                                            class218 var57;
                                            do {
                                                var55 = (class71) field1102.method3341();
                                                if (var55 == null) {
                                                    this.method1375();
                                                    if (Statics.field30 != null) {
                                                        Statics.field30.method4954(Statics.field424, (Statics.field655.field1221 >> 7) + Statics.field376, (Statics.field655.field1207 >> 7) + Statics.field847, false);
                                                        Statics.field30.method4913();
                                                    }
                                                    if (field1118 != null) {
                                                        this.method1100();
                                                    }
                                                    if (Statics.field452 != null) {
                                                        method4218(Statics.field452);
                                                        field1080++;
                                                        if (class60.field712 == 0) {
                                                            if (field1105) {
                                                                if (Statics.field452 == Statics.field2196 && field1127 != field1019) {
                                                                    class218 var58 = Statics.field452;
                                                                    byte var59 = 0;
                                                                    if (field1151 == 1 && var58.field2714 == 206) {
                                                                        var59 = 1;
                                                                    }
                                                                    if (var58.field2742[field1019] <= 0) {
                                                                        var59 = 0;
                                                                    }
                                                                    int var60 = method76(var58);
                                                                    boolean var61 = (var60 >> 29 & 0x1) != 0;
                                                                    if (var61) {
                                                                        int var62 = field1127;
                                                                        int var63 = field1019;
                                                                        var58.field2742[var63] = var58.field2742[var62];
                                                                        var58.field2617[var63] = var58.field2617[var62];
                                                                        var58.field2742[var62] = -1;
                                                                        var58.field2617[var62] = 0;
                                                                    } else if (var59 == 1) {
                                                                        int var64 = field1127;
                                                                        int var65 = field1019;
                                                                        while (var64 != var65) {
                                                                            if (var64 > var65) {
                                                                                var58.method3721(var64 - 1, var64);
                                                                                var64--;
                                                                            } else if (var64 < var65) {
                                                                                var58.method3721(var64 + 1, var64);
                                                                                var64++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var58.method3721(field1019, field1127);
                                                                    }
                                                                    field957.method3154(187);
                                                                    field957.method2963(field1127);
                                                                    field957.method2961(field1019);
                                                                    field957.method2952(var59);
                                                                    field957.method2930(Statics.field452.field2624);
                                                                }
                                                            } else if (this.method1096()) {
                                                                this.method1092(field1017, field1018);
                                                            } else if (field929 > 0) {
                                                                int var66 = field1017;
                                                                int var67 = field1018;
                                                                method1044(Statics.field234, var66, var67);
                                                                Statics.field234 = null;
                                                            }
                                                            field1157 = 10;
                                                            class60.field735 = 0;
                                                            Statics.field452 = null;
                                                        } else if (field1080 >= 5 && (class60.field719 > field1017 + 5 || class60.field719 < field1017 - 5 || class60.field720 * 752920449 > field1018 + 5 || class60.field720 * 752920449 < field1018 - 5)) {
                                                            field1105 = true;
                                                        }
                                                    }
                                                    if (class141.method2580()) {
                                                        int var68 = class141.field2082;
                                                        int var69 = class141.field2098;
                                                        field957.method3154(130);
                                                        field957.method2913(5);
                                                        field957.method2952(class51.field632[82] ? (class51.field632[81] ? 2 : 1) : 0);
                                                        field957.method2963(Statics.field847 + var69);
                                                        field957.method2914(Statics.field376 + var68);
                                                        class141.method2561();
                                                        field1030 = class60.field726;
                                                        field1011 = class60.field727;
                                                        field1096 = 1;
                                                        field1012 = 0;
                                                        field1137 = var68;
                                                        field967 = var69;
                                                    }
                                                    if (Statics.field570 != var43) {
                                                        if (var43 != null) {
                                                            method4218(var43);
                                                        }
                                                        if (Statics.field570 != null) {
                                                            method4218(Statics.field570);
                                                        }
                                                    }
                                                    if (Statics.field603 != var44 && field1055 == field1054) {
                                                        if (var44 != null) {
                                                            method4218(var44);
                                                        }
                                                        if (Statics.field603 != null) {
                                                            method4218(Statics.field603);
                                                        }
                                                    }
                                                    if (Statics.field603 == null) {
                                                        if (field1054 > 0) {
                                                            field1054--;
                                                        }
                                                    } else if (field1054 < field1055) {
                                                        field1054++;
                                                        if (field1055 == field1054) {
                                                            method4218(Statics.field603);
                                                        }
                                                    }
                                                    int var70 = Statics.field655.field1221;
                                                    int var71 = Statics.field655.field1207;
                                                    if (Statics.field2306 - var70 < -500 || Statics.field2306 - var70 > 500 || Statics.field1624 - var71 < -500 || Statics.field1624 - var71 > 500) {
                                                        Statics.field2306 = var70;
                                                        Statics.field1624 = var71;
                                                    }
                                                    if (Statics.field2306 != var70) {
                                                        Statics.field2306 += (var70 - Statics.field2306) / 16;
                                                    }
                                                    if (Statics.field1624 != var71) {
                                                        Statics.field1624 += (var71 - Statics.field1624) / 16;
                                                    }
                                                    if (class60.field712 == 4 && Statics.field646) {
                                                        int var72 = class60.field720 * 752920449 - field964 * 752920449;
                                                        field989 = var72 * 2;
                                                        field964 = (var72 == -1 || var72 == 1 ? class60.field720 * 752920449 : (field964 * 752920449 + class60.field720 * 752920449) / 2) * 1389860993;
                                                        int var73 = field990 - class60.field719;
                                                        field1146 = var73 * 2;
                                                        field990 = var73 == -1 || var73 == 1 ? class60.field719 : (field990 + class60.field719) / 2;
                                                    } else {
                                                        if (class51.field632[96]) {
                                                            field1146 += (-24 - field1146) / 2;
                                                        } else if (class51.field632[97]) {
                                                            field1146 += (24 - field1146) / 2;
                                                        } else {
                                                            field1146 /= 2;
                                                        }
                                                        if (class51.field632[98]) {
                                                            field989 += (12 - field989) / 2;
                                                        } else if (class51.field632[99]) {
                                                            field989 += (-12 - field989) / 2;
                                                        } else {
                                                            field989 /= 2;
                                                        }
                                                        field964 = class60.field720;
                                                        field990 = class60.field719;
                                                    }
                                                    field987 = field1146 / 2 + field987 & 0x7FF;
                                                    field986 += field989 / 2;
                                                    if (field986 < 128) {
                                                        field986 = 128;
                                                    }
                                                    if (field986 > 383) {
                                                        field986 = 383;
                                                    }
                                                    int var74 = Statics.field2306 >> 7;
                                                    int var75 = Statics.field1624 >> 7;
                                                    int var76 = method995(Statics.field2306, Statics.field1624, Statics.field424);
                                                    int var77 = 0;
                                                    if (var74 > 3 && var75 > 3 && var74 < 100 && var75 < 100) {
                                                        for (int var78 = var74 - 4; var78 <= var74 + 4; var78++) {
                                                            for (int var79 = var75 - 4; var79 <= var75 + 4; var79++) {
                                                                int var80 = Statics.field424;
                                                                if (var80 < 3 && (class62.field755[1][var78][var79] & 0x2) == 2) {
                                                                    var80++;
                                                                }
                                                                int var81 = var76 - class62.field761[var80][var78][var79];
                                                                if (var81 > var77) {
                                                                    var77 = var81;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var82 = var77 * 192;
                                                    if (var82 > 98048) {
                                                        var82 = 98048;
                                                    }
                                                    if (var82 < 32768) {
                                                        var82 = 32768;
                                                    }
                                                    if (var82 > field995) {
                                                        field995 += (var82 - field995) / 24;
                                                    } else if (var82 < field995) {
                                                        field995 += (var82 - field995) / 80;
                                                    }
                                                    if (field940) {
                                                        method1013();
                                                    }
                                                    for (int var83 = 0; var83 < 5; var83++) {
                                                        int var10002 = field963[var83]++;
                                                    }
                                                    Statics.field602.method1726();
                                                    int var84 = class60.method3714();
                                                    int var85 = class51.method2426();
                                                    if (var84 > 15000 && var85 > 15000) {
                                                        field1041 = 250;
                                                        class60.field711 = 14500;
                                                        field957.method3154(134);
                                                    }
                                                    for (class68 var86 = (class68) field1173.method3383(); var86 != null; var86 = (class68) field1173.method3384()) {
                                                        if ((long) var86.field817 < class177.method2903() / 1000L - 5L) {
                                                            if (var86.field819 > 0) {
                                                                Statics.method206(5, "", var86.field815 + class227.field2973);
                                                            }
                                                            if (var86.field819 == 0) {
                                                                Statics.method206(5, "", var86.field815 + class227.field2974);
                                                            }
                                                            var86.method3390();
                                                        }
                                                    }
                                                    field991++;
                                                    if (field991 > 50) {
                                                        field957.method3154(98);
                                                    }
                                                    try {
                                                        if (Statics.field2312 != null && field957.field2381 > 0) {
                                                            Statics.field2312.method2785(field957.field2376, 0, field957.field2381);
                                                            field957.field2381 = 0;
                                                            field991 = 0;
                                                        }
                                                    } catch (IOException var88) {
                                                        method2761();
                                                    }
                                                    return;
                                                }
                                                var56 = var55.field837;
                                                if (var56.field2726 < 0) {
                                                    break;
                                                }
                                                var57 = class218.method4538(var56.field2643);
                                            } while (var57 == null || var57.field2615 == null || var56.field2726 >= var57.field2615.length || var57.field2615[var56.field2726] != var56);
                                            class85.method1409(var55);
                                        }
                                    }
                                    var53 = var52.field837;
                                    if (var53.field2726 < 0) {
                                        break;
                                    }
                                    var54 = class218.method4538(var53.field2643);
                                } while (var54 == null || var54.field2615 == null || var53.field2726 >= var54.field2615.length || var54.field2615[var53.field2726] != var53);
                                class85.method1409(var52);
                            }
                        }
                        var50 = var49.field837;
                        if (var50.field2726 < 0) {
                            break;
                        }
                        var51 = class218.method4538(var50.field2643);
                    } while (var51 == null || var51.field2615 == null || var50.field2726 >= var51.field2615.length || var51.field2615[var50.field2726] != var50);
                    class85.method1409(var49);
                }
            }
            field957.method3154(227);
            field957.method2913(0);
            int var4 = field957.field2381;
            class282.method627(field957);
            field957.method2981(field957.field2381 - var4);
        }
    }

    @ObfuscatedName("aw.fp(I)V")
    public static final void method465() {
        if (Statics.field1858 != null) {
            Statics.field1858.method1892();
        }
        if (Statics.field1214 != null) {
            Statics.field1214.method1892();
        }
    }

    @ObfuscatedName("ab.fs(I)V")
    public static final void method579() {
        for (int var0 = 0; var0 < field1145; var0++) {
            int var10002 = field1148[var0]--;
            if (field1148[var0] >= -10) {
                class107 var2 = field1150[var0];
                if (var2 == null) {
                    class107 var10000 = (class107) null;
                    var2 = class107.method1820(Statics.field1273, field1176[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field1148[var0] += var2.method1819();
                    field1150[var0] = var2;
                }
                if (field1148[var0] < 0) {
                    int var9;
                    if (field1149[var0] == 0) {
                        var9 = field1110;
                    } else {
                        int var3 = (field1149[var0] & 0xFF) * 128;
                        int var4 = field1149[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field655.field1221;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field1149[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field655.field1207;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field1148[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field1144 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class109 var10 = var2.method1818().method1865(Statics.field3115);
                        class119 var11 = class119.method1979(var10, 100, var9);
                        var11.method2105(field1147[var0] - 1);
                        Statics.field514.method1769(var11);
                    }
                    field1148[var0] = -100;
                }
            } else {
                field1145--;
                for (int var1 = var0; var1 < field1145; var1++) {
                    field1176[var1] = field1176[var1 + 1];
                    field1150[var1] = field1150[var1 + 1];
                    field1147[var1] = field1147[var1 + 1];
                    field1148[var1] = field1148[var1 + 1];
                    field1149[var1] = field1149[var1 + 1];
                }
                var0--;
            }
        }
        if (!field1142) {
            return;
        }
        boolean var12;
        if (class205.field2488 == 0) {
            var12 = Statics.field2487.method3454();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field1061 != 0 && field1141 != -1) {
                class205.method248(Statics.field3307, field1141, 0, field1061, false);
            }
            field1142 = false;
        }
    }

    @ObfuscatedName("g.fd(Ljd;IIIS)V")
    public static void method2(class262 arg0, int arg1, int arg2, int arg3) {
        if (field1145 >= 50 || field1144 == 0 || arg0.field3600 == null || arg1 >= arg0.field3600.length) {
            return;
        }
        int var4 = arg0.field3600[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1176[field1145] = var5;
        field1147[field1145] = var6;
        field1148[field1145] = 0;
        field1150[field1145] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1149[field1145] = (var8 << 16) + (var9 << 8) + var7;
        field1145++;
    }

    @ObfuscatedName("br.fl(Lhg;III)V")
    public static final void method996(class218 arg0, int arg1, int arg2) {
        if (field1139 != 0 && field1139 != 3 || class60.field735 != 1 && Statics.field646 || class60.field735 != 4) {
            return;
        }
        class212 var3 = arg0.method3726(true);
        if (var3 == null) {
            return;
        }
        int var4 = class60.field726 - arg1;
        int var5 = class60.field727 - arg2;
        if (!var3.method3637(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2578 / 2;
        int var7 = var5 - var3.field2579 / 2;
        int var8 = field987 & 0x7FF;
        int var9 = class138.field2004[var8];
        int var10 = class138.field2027[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field655.field1221 + var11 >> 7;
        int var14 = Statics.field655.field1207 - var12 >> 7;
        field957.method3154(20);
        field957.method2913(18);
        field957.method2952(class51.field632[82] ? (class51.field632[81] ? 2 : 1) : 0);
        field957.method2963(Statics.field847 + var14);
        field957.method2914(Statics.field376 + var13);
        field957.method2913(var6);
        field957.method2913(var7);
        field957.method2914(field987);
        field957.method2913(57);
        field957.method2913(0);
        field957.method2913(0);
        field957.method2913(89);
        field957.method2914(Statics.field655.field1221);
        field957.method2914(Statics.field655.field1207);
        field957.method2913(63);
        field1137 = var13;
        field967 = var14;
    }

    @ObfuscatedName("ai.fa(I)V")
    public static final void method628() {
        int[] var0 = class98.field1495;
        for (int var1 = 0; var1 < class98.field1494; var1++) {
            class76 var2 = field1099[var0[var1]];
            if (var2 != null && var2.field1222 > 0) {
                var2.field1222--;
                if (var2.field1222 == 0) {
                    var2.field1219 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field953; var3++) {
            int var4 = field954[var3];
            class88 var5 = field952[var4];
            if (var5 != null && var5.field1222 > 0) {
                var5.field1222--;
                if (var5.field1222 == 0) {
                    var5.field1219 = null;
                }
            }
        }
    }

    @ObfuscatedName("bz.fr(Ljava/lang/String;B)V")
    public static final void method992(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2198.field1296 = !Statics.field2198.field1296;
            class82.method1649();
            if (Statics.field2198.field1296) {
                Statics.method206(99, "", "Roofs are now all hidden");
            } else {
                Statics.method206(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field931 = !field931;
        }
        if (arg0.equalsIgnoreCase("clickbox")) {
            class135.field1977 = !class135.field1977;
            Statics.method206(99, "", "Clickbox Mode: " + (class135.field1977 ? "AABB" : "Legacy"));
        }
        if (field1070 >= 2) {
            if (arg0.equalsIgnoreCase("aabb")) {
                if (!class8.field232) {
                    class8.field232 = true;
                    class8.field229 = class12.field266;
                    Statics.method206(99, "", "AABB boxes: All");
                } else if (class8.field229 == class12.field266) {
                    class8.field232 = true;
                    class8.field229 = class12.field268;
                    Statics.method206(99, "", "AABB boxes: Mouse Over");
                } else {
                    class8.field232 = false;
                    Statics.method206(99, "", "AABB boxes: Off");
                }
            }
            if (arg0.equalsIgnoreCase("legacyboxes")) {
                class8.field236 = !class8.field236;
                Statics.method206(99, "", "Show legacy boxes: " + class8.field236);
            }
            if (arg0.equalsIgnoreCase("geotests")) {
                class8.field228 = !class8.field228;
                Statics.method206(99, "", "Show geometry tests: " + class8.field228);
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field931 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field931 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2761();
            }
            if (arg0.equalsIgnoreCase("errortest") && field919 == 2) {
                throw new RuntimeException();
            }
        }
        field957.method3154(115);
        field957.method2913(arg0.length() + 1);
        field957.method2927(arg0);
    }

    @ObfuscatedName("bl.fk(I)V")
    public static final void method1013() {
        int var0 = Statics.field249 * 128 + 64;
        int var1 = Statics.field523 * 128 + 64;
        int var2 = method995(var0, var1, Statics.field424) - Statics.field506;
        if (Statics.field3685 < var0) {
            Statics.field3685 += Statics.field875 * (var0 - Statics.field3685) / 1000 + Statics.field316;
            if (Statics.field3685 > var0) {
                Statics.field3685 = var0;
            }
        }
        if (Statics.field3685 > var0) {
            Statics.field3685 -= Statics.field875 * (Statics.field3685 - var0) / 1000 + Statics.field316;
            if (Statics.field3685 < var0) {
                Statics.field3685 = var0;
            }
        }
        if (Statics.field1198 < var2) {
            Statics.field1198 += Statics.field875 * (var2 - Statics.field1198) / 1000 + Statics.field316;
            if (Statics.field1198 > var2) {
                Statics.field1198 = var2;
            }
        }
        if (Statics.field1198 > var2) {
            Statics.field1198 -= Statics.field875 * (Statics.field1198 - var2) / 1000 + Statics.field316;
            if (Statics.field1198 < var2) {
                Statics.field1198 = var2;
            }
        }
        if (Statics.field2314 < var1) {
            Statics.field2314 += Statics.field875 * (var1 - Statics.field2314) / 1000 + Statics.field316;
            if (Statics.field2314 > var1) {
                Statics.field2314 = var1;
            }
        }
        if (Statics.field2314 > var1) {
            Statics.field2314 -= Statics.field875 * (Statics.field2314 - var1) / 1000 + Statics.field316;
            if (Statics.field2314 < var1) {
                Statics.field2314 = var1;
            }
        }
        int var3 = Statics.field2240 * 128 + 64;
        int var4 = Statics.field511 * 128 + 64;
        int var5 = method995(var3, var4, Statics.field424) - Statics.field2808;
        int var6 = var3 - Statics.field3685;
        int var7 = var5 - Statics.field1198;
        int var8 = var4 - Statics.field2314;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field3370 < var10) {
            Statics.field3370 += Statics.field2181 * (var10 - Statics.field3370) / 1000 + Statics.field2419;
            if (Statics.field3370 > var10) {
                Statics.field3370 = var10;
            }
        }
        if (Statics.field3370 > var10) {
            Statics.field3370 -= Statics.field2181 * (Statics.field3370 - var10) / 1000 + Statics.field2419;
            if (Statics.field3370 < var10) {
                Statics.field3370 = var10;
            }
        }
        int var12 = var11 - Statics.field906;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field906 += Statics.field2181 * var12 / 1000 + Statics.field2419;
            Statics.field906 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field906 -= Statics.field2181 * -var12 / 1000 + Statics.field2419;
            Statics.field906 &= 0x7FF;
        }
        int var13 = var11 - Statics.field906;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field906 = var11;
        }
    }

    @ObfuscatedName("be.fh(Lcp;II)V")
    public static final void method1408(class79 arg0, int arg1) {
        if (arg0.field1239 > field925) {
            method40(arg0);
        } else if (arg0.field1253 >= field925) {
            method958(arg0);
        } else {
            arg0.field1235 = arg0.field1211;
            if (arg0.field1260 == 0) {
                arg0.field1264 = 0;
            } else {
                label309: {
                    if (arg0.field1238 != -1 && arg0.field1241 == 0) {
                        class262 var2 = class262.method1025(arg0.field1238);
                        if (arg0.field1265 > 0 && var2.field3608 == 0) {
                            arg0.field1264++;
                            break label309;
                        }
                        if (arg0.field1265 <= 0 && var2.field3609 == 0) {
                            arg0.field1264++;
                            break label309;
                        }
                    }
                    int var3 = arg0.field1221;
                    int var4 = arg0.field1207;
                    int var5 = arg0.field1261[arg0.field1260 - 1] * 128 + arg0.field1255 * 64;
                    int var6 = arg0.field1262[arg0.field1260 - 1] * 128 + arg0.field1255 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field1217 = 1280;
                        } else if (var4 > var6) {
                            arg0.field1217 = 1792;
                        } else {
                            arg0.field1217 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field1217 = 768;
                        } else if (var4 > var6) {
                            arg0.field1217 = 256;
                        } else {
                            arg0.field1217 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field1217 = 1024;
                    } else if (var4 > var6) {
                        arg0.field1217 = 0;
                    }
                    byte var7 = arg0.field1263[arg0.field1260 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field1217 - arg0.field1208 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field1215;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field1242;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field1212;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field1250;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field1242;
                        }
                        arg0.field1235 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class88) {
                            var11 = ((class88) arg0).field1364.field3576;
                        }
                        if (var11) {
                            if (arg0.field1217 != arg0.field1208 && arg0.field1232 == -1 && arg0.field1230 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field1260 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field1260 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field1264 > 0 && arg0.field1260 > 1) {
                                var10 = 8;
                                arg0.field1264--;
                            }
                        } else {
                            if (arg0.field1260 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field1260 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field1264 > 0 && arg0.field1260 > 1) {
                                var10 = 8;
                                arg0.field1264--;
                            }
                        }
                        if (var7 == 2) {
                            var10 <<= 0x1;
                        }
                        if (var10 >= 8 && arg0.field1242 == arg0.field1235 && arg0.field1257 != -1) {
                            arg0.field1235 = arg0.field1257;
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field1221 += var10;
                                if (arg0.field1221 > var5) {
                                    arg0.field1221 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field1221 -= var10;
                                if (arg0.field1221 < var5) {
                                    arg0.field1221 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field1207 += var10;
                                if (arg0.field1207 > var6) {
                                    arg0.field1207 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field1207 -= var10;
                                if (arg0.field1207 < var6) {
                                    arg0.field1207 = var6;
                                }
                            }
                        }
                        if (arg0.field1221 == var5 && arg0.field1207 == var6) {
                            arg0.field1260--;
                            if (arg0.field1265 > 0) {
                                arg0.field1265--;
                            }
                        }
                    } else {
                        arg0.field1221 = var5;
                        arg0.field1207 = var6;
                        arg0.field1260--;
                        if (arg0.field1265 > 0) {
                            arg0.field1265--;
                        }
                    }
                }
            }
        }
        if (arg0.field1221 < 128 || arg0.field1207 < 128 || arg0.field1221 >= 13184 || arg0.field1207 >= 13184) {
            arg0.field1238 = -1;
            arg0.field1234 = -1;
            arg0.field1239 = 0;
            arg0.field1253 = 0;
            arg0.field1221 = arg0.field1261[0] * 128 + arg0.field1255 * 64;
            arg0.field1207 = arg0.field1262[0] * 128 + arg0.field1255 * 64;
            arg0.method1414();
        }
        if (Statics.field655 == arg0 && (arg0.field1221 < 1536 || arg0.field1207 < 1536 || arg0.field1221 >= 11776 || arg0.field1207 >= 11776)) {
            arg0.field1238 = -1;
            arg0.field1234 = -1;
            arg0.field1239 = 0;
            arg0.field1253 = 0;
            arg0.field1221 = arg0.field1261[0] * 128 + arg0.field1255 * 64;
            arg0.field1207 = arg0.field1262[0] * 128 + arg0.field1255 * 64;
            arg0.method1414();
        }
        if (arg0.field1230 != 0) {
            if (arg0.field1232 != -1) {
                class79 var12 = null;
                if (arg0.field1232 < 32768) {
                    var12 = field952[arg0.field1232];
                } else if (arg0.field1232 >= 32768) {
                    var12 = field1099[arg0.field1232 - 32768];
                }
                if (var12 != null) {
                    int var13 = arg0.field1221 - var12.field1221;
                    int var14 = arg0.field1207 - var12.field1207;
                    if (var13 != 0 || var14 != 0) {
                        arg0.field1217 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1243) {
                    arg0.field1232 = -1;
                    arg0.field1243 = false;
                }
            }
            if (arg0.field1206 != -1 && (arg0.field1260 == 0 || arg0.field1264 > 0)) {
                arg0.field1217 = arg0.field1206;
                arg0.field1206 = -1;
            }
            int var15 = arg0.field1217 - arg0.field1208 & 0x7FF;
            if (var15 == 0 && arg0.field1243) {
                arg0.field1232 = -1;
                arg0.field1243 = false;
            }
            if (var15 == 0) {
                arg0.field1258 = 0;
            } else {
                arg0.field1258++;
                if (var15 > 1024) {
                    arg0.field1208 -= arg0.field1230;
                    boolean var16 = true;
                    if (var15 < arg0.field1230 || var15 > 2048 - arg0.field1230) {
                        arg0.field1208 = arg0.field1217;
                        var16 = false;
                    }
                    if (arg0.field1235 == arg0.field1211 && (arg0.field1258 > 25 || var16)) {
                        if (arg0.field1228 == -1) {
                            arg0.field1235 = arg0.field1242;
                        } else {
                            arg0.field1235 = arg0.field1228;
                        }
                    }
                } else {
                    arg0.field1208 += arg0.field1230;
                    boolean var17 = true;
                    if (var15 < arg0.field1230 || var15 > 2048 - arg0.field1230) {
                        arg0.field1208 = arg0.field1217;
                        var17 = false;
                    }
                    if (arg0.field1235 == arg0.field1211 && (arg0.field1258 > 25 || var17)) {
                        if (arg0.field1213 == -1) {
                            arg0.field1235 = arg0.field1242;
                        } else {
                            arg0.field1235 = arg0.field1213;
                        }
                    }
                }
                arg0.field1208 &= 0x7FF;
            }
        }
        method4020(arg0);
    }

    @ObfuscatedName("u.ff(Lcp;B)V")
    public static final void method40(class79 arg0) {
        int var1 = arg0.field1239 - field925;
        int var2 = arg0.field1255 * 64 + arg0.field1248 * 128;
        int var3 = arg0.field1255 * 64 + arg0.field1252 * 128;
        arg0.field1221 += (var2 - arg0.field1221) / var1;
        arg0.field1207 += (var3 - arg0.field1207) / var1;
        arg0.field1264 = 0;
        arg0.field1217 = arg0.field1254;
    }

    @ObfuscatedName("bc.fx(Lcp;I)V")
    public static final void method958(class79 arg0) {
        if (field925 == arg0.field1253 || arg0.field1238 == -1 || arg0.field1241 != 0 || arg0.field1240 + 1 > class262.method1025(arg0.field1238).field3599[arg0.field1218]) {
            int var1 = arg0.field1253 - arg0.field1239;
            int var2 = field925 - arg0.field1239;
            int var3 = arg0.field1255 * 64 + arg0.field1248 * 128;
            int var4 = arg0.field1255 * 64 + arg0.field1252 * 128;
            int var5 = arg0.field1255 * 64 + arg0.field1249 * 128;
            int var6 = arg0.field1255 * 64 + arg0.field1229 * 128;
            arg0.field1221 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1207 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1264 = 0;
        arg0.field1217 = arg0.field1254;
        arg0.field1208 = arg0.field1217;
    }

    @ObfuscatedName("iu.fc(Lcp;B)V")
    public static final void method4020(class79 arg0) {
        arg0.field1209 = false;
        if (arg0.field1235 != -1) {
            class262 var1 = class262.method1025(arg0.field1235);
            if (var1 == null || var1.field3596 == null) {
                arg0.field1235 = -1;
            } else {
                arg0.field1237++;
                if (arg0.field1236 < var1.field3596.length && arg0.field1237 > var1.field3599[arg0.field1236]) {
                    arg0.field1237 = 1;
                    arg0.field1236++;
                    method2(var1, arg0.field1236, arg0.field1221, arg0.field1207);
                }
                if (arg0.field1236 >= var1.field3596.length) {
                    arg0.field1237 = 0;
                    arg0.field1236 = 0;
                    method2(var1, arg0.field1236, arg0.field1221, arg0.field1207);
                }
            }
        }
        if (arg0.field1234 != -1 && field925 >= arg0.field1251) {
            if (arg0.field1210 < 0) {
                arg0.field1210 = 0;
            }
            int var2 = class247.method891(arg0.field1234).field3332;
            if (var2 == -1) {
                arg0.field1234 = -1;
            } else {
                class262 var3 = class262.method1025(var2);
                if (var3 == null || var3.field3596 == null) {
                    arg0.field1234 = -1;
                } else {
                    arg0.field1245++;
                    if (arg0.field1210 < var3.field3596.length && arg0.field1245 > var3.field3599[arg0.field1210]) {
                        arg0.field1245 = 1;
                        arg0.field1210++;
                        method2(var3, arg0.field1210, arg0.field1221, arg0.field1207);
                    }
                    if (arg0.field1210 >= var3.field3596.length && (arg0.field1210 < 0 || arg0.field1210 >= var3.field3596.length)) {
                        arg0.field1234 = -1;
                    }
                }
            }
        }
        if (arg0.field1238 != -1 && arg0.field1241 <= 1) {
            class262 var4 = class262.method1025(arg0.field1238);
            if (var4.field3608 == 1 && arg0.field1265 > 0 && arg0.field1239 <= field925 && arg0.field1253 < field925) {
                arg0.field1241 = 1;
                return;
            }
        }
        if (arg0.field1238 != -1 && arg0.field1241 == 0) {
            class262 var5 = class262.method1025(arg0.field1238);
            if (var5 == null || var5.field3596 == null) {
                arg0.field1238 = -1;
            } else {
                arg0.field1240++;
                if (arg0.field1218 < var5.field3596.length && arg0.field1240 > var5.field3599[arg0.field1218]) {
                    arg0.field1240 = 1;
                    arg0.field1218++;
                    method2(var5, arg0.field1218, arg0.field1221, arg0.field1207);
                }
                if (arg0.field1218 >= var5.field3596.length) {
                    arg0.field1218 -= var5.field3601;
                    arg0.field1247++;
                    if (arg0.field1247 >= var5.field3597) {
                        arg0.field1238 = -1;
                    } else if (arg0.field1218 >= 0 && arg0.field1218 < var5.field3596.length) {
                        method2(var5, arg0.field1218, arg0.field1221, arg0.field1207);
                    } else {
                        arg0.field1238 = -1;
                    }
                }
                arg0.field1209 = var5.field3603;
            }
        }
        if (arg0.field1241 > 0) {
            arg0.field1241--;
        }
    }

    @ObfuscatedName("ir.fm(Lbk;III)V")
    public static void method4006(class76 arg0, int arg1, int arg2) {
        if (arg0.field1238 == arg1 && arg1 != -1) {
            int var3 = class262.method1025(arg1).field3610;
            if (var3 == 1) {
                arg0.field1218 = 0;
                arg0.field1240 = 0;
                arg0.field1241 = arg2;
                arg0.field1247 = 0;
            }
            if (var3 == 2) {
                arg0.field1247 = 0;
            }
        } else if (arg1 == -1 || arg0.field1238 == -1 || class262.method1025(arg1).field3612 >= class262.method1025(arg0.field1238).field3612) {
            arg0.field1238 = arg1;
            arg0.field1218 = 0;
            arg0.field1240 = 0;
            arg0.field1241 = arg2;
            arg0.field1247 = 0;
            arg0.field1265 = arg0.field1260;
        }
    }

    @ObfuscatedName("ei.ft(I)I")
    public static int method2313() {
        return field1117 ? 2 : 1;
    }

    @ObfuscatedName("m.fb(I)V")
    public static void method107() {
        field957.method3154(30);
        field957.method2913(method2313());
        field957.method2914(Statics.field1365);
        field957.method2914(Statics.field3269);
    }

    @ObfuscatedName("client.a(I)V")
    public final void method859() {
        field1116 = class177.method2903() + 500L;
        this.method1093();
        if (field1029 != -1) {
            this.method1098(true);
        }
    }

    @ObfuscatedName("client.fj(I)V")
    public void method1093() {
        int var1 = Statics.field1365;
        int var2 = Statics.field3269;
        if (this.field683 < var1) {
            int var3 = this.field683;
        }
        if (this.field705 < var2) {
            int var4 = this.field705;
        }
        if (Statics.field2198 == null) {
            return;
        }
        try {
            client var5 = Statics.field32;
            Object[] var6 = new Object[] { method2313() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.gy(I)V")
    public final void method1107() {
        if (field1029 != -1) {
            int var1 = field1029;
            if (class218.method48(var1)) {
                method3811(Statics.field1482[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field1106; var2++) {
            if (field1108[var2]) {
                field1160[var2] = true;
            }
            field1051[var2] = field1108[var2];
            field1108[var2] = false;
        }
        field1107 = field925;
        field1052 = -1;
        field1053 = -1;
        Statics.field2196 = null;
        if (field1029 != -1) {
            field1106 = 0;
            method321(field1029, 0, 0, Statics.field1365, Statics.field3269, 0, 0, -1);
        }
        class283.method4640();
        if (field936) {
            int var9 = Statics.field1358;
            int var10 = Statics.field814;
            int var11 = Statics.field1983;
            int var12 = Statics.field715;
            int var13 = 6116423;
            class283.method4649(var9, var10, var11, var12, var13);
            class283.method4649(var9 + 1, var10 + 1, var11 - 2, 16, 0);
            class283.method4656(var9 + 1, var10 + 18, var11 - 2, var12 - 19, 0);
            Statics.field407.method4459(class227.field2979, var9 + 3, var10 + 14, var13, -1);
            int var14 = class60.field719;
            int var15 = class60.field720 * 752920449;
            for (int var16 = 0; var16 < field929; var16++) {
                int var17 = (field929 - 1 - var16) * 15 + var10 + 31;
                int var18 = 16777215;
                if (var14 > var9 && var14 < var9 + var11 && var15 > var17 - 13 && var15 < var17 + 3) {
                    var18 = 16776960;
                }
                class265 var19 = Statics.field407;
                String var20;
                if (var16 < 0) {
                    var20 = "";
                } else if (field1048[var16].length() > 0) {
                    var20 = field937[var16] + class227.field2986 + field1048[var16];
                } else {
                    var20 = field937[var16];
                }
                var19.method4459(var20, var9 + 3, var17, var18, 0);
            }
            method931(Statics.field1358, Statics.field814, Statics.field1983, Statics.field715);
        } else if (field1052 != -1) {
            int var3 = field1052;
            int var4 = field1053;
            if (field929 >= 2 || field1056 != 0 || field970) {
                int var5 = field929 - 1;
                String var7;
                if (field1056 == 1 && field929 < 2) {
                    var7 = class227.field2844 + class227.field2986 + field1057 + " " + class90.field1381;
                } else if (field970 && field929 < 2) {
                    var7 = field998 + class227.field2986 + field1062 + " " + class90.field1381;
                } else {
                    String var8;
                    if (var5 < 0) {
                        var8 = "";
                    } else if (field1048[var5].length() > 0) {
                        var8 = field937[var5] + class227.field2986 + field1048[var5];
                    } else {
                        var8 = field937[var5];
                    }
                    var7 = var8;
                }
                if (field929 > 2) {
                    var7 = var7 + class90.method2799(16777215) + " " + '/' + " " + (field929 - 2) + class227.field2980;
                }
                Statics.field407.method4467(var7, var3 + 4, var4 + 15, 16777215, 0, field925 / 1000);
            }
        }
        if (field1115 == 3) {
            for (int var21 = 0; var21 < field1106; var21++) {
                if (field1051[var21]) {
                    class283.method4648(field1111[var21], field1112[var21], field1113[var21], field1025[var21], 16711935, 128);
                } else if (field1160[var21]) {
                    class283.method4648(field1111[var21], field1112[var21], field1113[var21], field1025[var21], 16711680, 128);
                }
            }
        }
        Statics.method1600(Statics.field424, Statics.field655.field1221, Statics.field655.field1207, field1021);
        field1021 = 0;
    }

    @ObfuscatedName("i.gg(Ljava/lang/String;ZI)V")
    public static final void method162(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field3847.method4456(arg0, 250);
        int var6 = Statics.field3847.method4457(arg0, 250) * 13;
        class283.method4649(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class283.method4656(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field3847.method4463(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2800(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field323.method727(0, 0);
        } else {
            method931(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("bu.go(IIIII)V")
    public static final void method981(int arg0, int arg1, int arg2, int arg3) {
        field1007++;
        method1605(class67.field812);
        boolean var4 = false;
        if (field1032 >= 0) {
            int var5 = class98.field1494;
            int[] var6 = class98.field1495;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field1032 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method1605(class67.field807);
        }
        method2841(true);
        method1605(var4 ? class67.field811 : class67.field808);
        method2841(false);
        for (class95 var8 = (class95) field1035.method3348(); var8 != null; var8 = (class95) field1035.method3350()) {
            if (Statics.field424 != var8.field1455 || field925 > var8.field1469) {
                var8.method3333();
            } else if (field925 >= var8.field1476) {
                if (var8.field1464 > 0) {
                    class88 var9 = field952[var8.field1464 - 1];
                    if (var9 != null && var9.field1221 >= 0 && var9.field1221 < 13312 && var9.field1207 >= 0 && var9.field1207 < 13312) {
                        var8.method1656(var9.field1221, var9.field1207, method995(var9.field1221, var9.field1207, var8.field1455) - var8.field1459, field925);
                    }
                }
                if (var8.field1464 < 0) {
                    int var10 = -var8.field1464 - 1;
                    class76 var11;
                    if (field1129 == var10) {
                        var11 = Statics.field655;
                    } else {
                        var11 = field1099[var10];
                    }
                    if (var11 != null && var11.field1221 >= 0 && var11.field1221 < 13312 && var11.field1207 >= 0 && var11.field1207 < 13312) {
                        var8.method1656(var11.field1221, var11.field1207, method995(var11.field1221, var11.field1207, var8.field1455) - var8.field1459, field925);
                    }
                }
                var8.method1651(field1021);
                Statics.field1335.method2523(Statics.field424, (int) var8.field1478, (int) var8.field1467, (int) var8.field1462, 60, var8, var8.field1474, -1, false);
            }
        }
        method161();
        method92(arg0, arg1, arg2, arg3, true);
        int var12 = field1165;
        int var13 = field1166;
        int var14 = field1050;
        int var15 = field1168;
        class283.method4641(var12, var13, var12 + var14, var13 + var15);
        class138.method2428();
        if (!field940) {
            int var16 = field986;
            if (field995 / 256 > var16) {
                var16 = field995 / 256;
            }
            if (field1152[4] && field1154[4] + 128 > var16) {
                var16 = field1154[4] + 128;
            }
            int var17 = field987 & 0x7FF;
            int var18 = Statics.field2306;
            int var19 = method995(Statics.field655.field1221, Statics.field655.field1207, Statics.field424) - field979;
            int var20 = Statics.field1624;
            int var21 = var16 * 3 + 600;
            int var22 = 2048 - var16 & 0x7FF;
            int var23 = 2048 - var17 & 0x7FF;
            int var24 = 0;
            int var25 = 0;
            int var26 = var21;
            if (var22 != 0) {
                int var27 = class138.field2004[var22];
                int var28 = class138.field2027[var22];
                int var29 = var25 * var28 - var21 * var27 >> 16;
                var26 = var25 * var27 + var21 * var28 >> 16;
                var25 = var29;
            }
            if (var23 != 0) {
                int var30 = class138.field2004[var23];
                int var31 = class138.field2027[var23];
                int var32 = var24 * var31 + var26 * var30 >> 16;
                var26 = var26 * var31 - var24 * var30 >> 16;
                var24 = var32;
            }
            Statics.field3685 = var18 - var24;
            Statics.field1198 = var19 - var25;
            Statics.field2314 = var20 - var26;
            Statics.field3370 = var16;
            Statics.field906 = var17;
        }
        int var45;
        if (field940) {
            int var46;
            if (Statics.field2198.field1296) {
                var46 = Statics.field424;
            } else {
                int var47 = method995(Statics.field3685, Statics.field2314, Statics.field424);
                if (var47 - Statics.field1198 >= 800 || (class62.field755[Statics.field424][Statics.field3685 >> 7][Statics.field2314 >> 7] & 0x4) == 0) {
                    var46 = 3;
                } else {
                    var46 = Statics.field424;
                }
            }
            var45 = var46;
        } else {
            int var33;
            if (Statics.field2198.field1296) {
                var33 = Statics.field424;
            } else {
                label329: {
                    int var34 = 3;
                    if (Statics.field3370 < 310) {
                        int var35 = Statics.field3685 >> 7;
                        int var36 = Statics.field2314 >> 7;
                        int var37 = Statics.field655.field1221 >> 7;
                        int var38 = Statics.field655.field1207 >> 7;
                        if (var35 < 0 || var36 < 0 || var35 >= 104 || var36 >= 104) {
                            var33 = Statics.field424;
                            break label329;
                        }
                        if ((class62.field755[Statics.field424][var35][var36] & 0x4) != 0) {
                            var34 = Statics.field424;
                        }
                        int var39;
                        if (var37 > var35) {
                            var39 = var37 - var35;
                        } else {
                            var39 = var35 - var37;
                        }
                        int var40;
                        if (var38 > var36) {
                            var40 = var38 - var36;
                        } else {
                            var40 = var36 - var38;
                        }
                        if (var39 > var40) {
                            int var41 = var40 * 65536 / var39;
                            int var42 = 32768;
                            while (var35 != var37) {
                                if (var35 < var37) {
                                    var35++;
                                } else if (var35 > var37) {
                                    var35--;
                                }
                                if ((class62.field755[Statics.field424][var35][var36] & 0x4) != 0) {
                                    var34 = Statics.field424;
                                }
                                var42 += var41;
                                if (var42 >= 65536) {
                                    var42 -= 65536;
                                    if (var36 < var38) {
                                        var36++;
                                    } else if (var36 > var38) {
                                        var36--;
                                    }
                                    if ((class62.field755[Statics.field424][var35][var36] & 0x4) != 0) {
                                        var34 = Statics.field424;
                                    }
                                }
                            }
                        } else {
                            int var43 = var39 * 65536 / var40;
                            int var44 = 32768;
                            while (var36 != var38) {
                                if (var36 < var38) {
                                    var36++;
                                } else if (var36 > var38) {
                                    var36--;
                                }
                                if ((class62.field755[Statics.field424][var35][var36] & 0x4) != 0) {
                                    var34 = Statics.field424;
                                }
                                var44 += var43;
                                if (var44 >= 65536) {
                                    var44 -= 65536;
                                    if (var35 < var37) {
                                        var35++;
                                    } else if (var35 > var37) {
                                        var35--;
                                    }
                                    if ((class62.field755[Statics.field424][var35][var36] & 0x4) != 0) {
                                        var34 = Statics.field424;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field655.field1221 >= 0 && Statics.field655.field1207 >= 0 && Statics.field655.field1221 < 13312 && Statics.field655.field1207 < 13312) {
                        if ((class62.field755[Statics.field424][Statics.field655.field1221 >> 7][Statics.field655.field1207 >> 7] & 0x4) != 0) {
                            var34 = Statics.field424;
                        }
                        var33 = var34;
                    } else {
                        var33 = Statics.field424;
                    }
                }
            }
            var45 = var33;
        }
        int var48 = Statics.field3685;
        int var49 = Statics.field1198;
        int var50 = Statics.field2314;
        int var51 = Statics.field3370;
        int var52 = Statics.field906;
        for (int var53 = 0; var53 < 5; var53++) {
            if (field1152[var53]) {
                int var54 = (int) (Math.random() * (double) (field1153[var53] * 2 + 1) - (double) field1153[var53] + Math.sin((double) field1155[var53] / 100.0D * (double) field963[var53]) * (double) field1154[var53]);
                if (var53 == 0) {
                    Statics.field3685 += var54;
                }
                if (var53 == 1) {
                    Statics.field1198 += var54;
                }
                if (var53 == 2) {
                    Statics.field2314 += var54;
                }
                if (var53 == 3) {
                    Statics.field906 = Statics.field906 + var54 & 0x7FF;
                }
                if (var53 == 4) {
                    Statics.field3370 += var54;
                    if (Statics.field3370 < 128) {
                        Statics.field3370 = 128;
                    }
                    if (Statics.field3370 > 383) {
                        Statics.field3370 = 383;
                    }
                }
            }
        }
        int var55 = class60.field719;
        int var56 = class60.field720 * 752920449;
        if (class60.field735 != 0) {
            var55 = class60.field726;
            var56 = class60.field727;
        }
        if (var55 >= var12 && var55 < var12 + var14 && var56 >= var13 && var56 < var13 + var15) {
            int var57 = var55 - var12;
            int var58 = var56 - var13;
            class136.field1984 = var57;
            class136.field1992 = var58;
            class136.field1985 = true;
            class136.field1989 = 0;
            class136.field1994 = false;
        } else {
            class136.method1404();
        }
        method465();
        class283.method4649(var12, var13, var14, var15, 0);
        method465();
        int var59 = class138.field2012;
        class138.field2012 = field1167;
        Statics.field1335.method2552(Statics.field3685, Statics.field1198, Statics.field2314, Statics.field3370, Statics.field906, var45);
        class8.method2722();
        class138.field2012 = var59;
        method465();
        Statics.field1335.method2511();
        method50(var12, var13, var14, var15);
        method2870(var12, var13);
        ((class127) Statics.field2014).method2199(field1021);
        method546(var12, var13, var14, var15);
        Statics.field3685 = var48;
        Statics.field1198 = var49;
        Statics.field2314 = var50;
        Statics.field3370 = var51;
        Statics.field906 = var52;
        if (field924) {
            byte var60 = 0;
            int var61 = class240.field3250 + class240.field3242 + var60;
            if (var61 == 0) {
                field924 = false;
            }
        }
        if (field924) {
            class283.method4649(var12, var13, var14, var15, 0);
            method162(class227.field2836, false);
        }
    }

    @ObfuscatedName("m.ga(IIIIZI)V")
    public static final void method92(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1158 - field1184) * var5 / 100 + field1184;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1163) {
            short var8 = field1163;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1162) {
                var6 = field1162;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class283.method4640();
                    class283.method4649(arg0, arg1, var10, arg3, -16777216);
                    class283.method4649(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1164) {
            short var11 = field1164;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field965) {
                var6 = field965;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class283.method4640();
                    class283.method4649(arg0, arg1, arg2, var13, -16777216);
                    class283.method4649(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1063 - field1159) * var5 / 100 + field1159;
        field1167 = arg3 * var6 * var14 / 85504 << 1;
        if (field1050 != arg2 || field1168 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class138.field2004[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class141.method2647(var15, 500, 800, arg2, arg3);
        }
        field1165 = arg0;
        field1166 = arg1;
        field1050 = arg2;
        field1168 = arg3;
    }

    @ObfuscatedName("ca.gb(Lbm;I)V")
    public static final void method1605(class67 arg0) {
        if (Statics.field655.field1221 >> 7 == field1137 && Statics.field655.field1207 >> 7 == field967) {
            field1137 = 0;
        }
        int var1 = class98.field1494;
        int[] var2 = class98.field1495;
        int var3 = var1;
        if (class67.field812 == arg0 || class67.field807 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class76 var5;
            int var6;
            if (class67.field812 == arg0) {
                var5 = Statics.field655;
                var6 = Statics.field655.field902 << 14;
            } else if (class67.field807 == arg0) {
                var5 = field1099[field1032];
                var6 = field1032 << 14;
            } else {
                var5 = field1099[var2[var4]];
                var6 = var2[var4] << 14;
                if (class67.field811 == arg0 && field1032 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method1057() && !var5.field900) {
                var5.field899 = false;
                if ((field1109 && var1 > 50 || var1 > 200) && class67.field812 != arg0 && var5.field1235 == var5.field1211) {
                    var5.field899 = true;
                }
                int var7 = var5.field1221 >> 7;
                int var8 = var5.field1207 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field893 == null || field925 < var5.field884 || field925 >= var5.field882) {
                        if ((var5.field1221 & 0x7F) == 64 && (var5.field1207 & 0x7F) == 64) {
                            if (field1007 == field1006[var7][var8]) {
                                continue;
                            }
                            field1006[var7][var8] = field1007;
                        }
                        var5.field887 = method995(var5.field1221, var5.field1207, Statics.field424);
                        Statics.field1335.method2523(Statics.field424, var5.field1221, var5.field1207, var5.field887, 60, var5, var5.field1208, var6, var5.field1209);
                    } else {
                        var5.field899 = false;
                        var5.field887 = method995(var5.field1221, var5.field1207, Statics.field424);
                        Statics.field1335.method2638(Statics.field424, var5.field1221, var5.field1207, var5.field887, 60, var5, var5.field1208, var6, var5.field904, var5.field895, var5.field880, var5.field888);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fo.gw(ZB)V")
    public static final void method2841(boolean arg0) {
        for (int var1 = 0; var1 < field953; var1++) {
            class88 var2 = field952[field954[var1]];
            int var3 = (field954[var1] << 14) + 536870912;
            if (var2 != null && var2.method1057() && var2.field1364.field3553 == arg0 && var2.field1364.method4376()) {
                int var4 = var2.field1221 >> 7;
                int var5 = var2.field1207 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1255 == 1 && (var2.field1221 & 0x7F) == 64 && (var2.field1207 & 0x7F) == 64) {
                        if (field1007 == field1006[var4][var5]) {
                            continue;
                        }
                        field1006[var4][var5] = field1007;
                    }
                    if (!var2.field1364.field3575) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1335.method2523(Statics.field424, var2.field1221, var2.field1207, method995(var2.field1221 + (var2.field1255 * 64 - 64), var2.field1207 + (var2.field1255 * 64 - 64), Statics.field424), var2.field1255 * 64 - 64 + 60, var2, var2.field1208, var3, var2.field1209);
                }
            }
        }
    }

    @ObfuscatedName("x.gr(B)V")
    public static final void method161() {
        for (class86 var0 = (class86) field1071.method3348(); var0 != null; var0 = (class86) field1071.method3350()) {
            if (Statics.field424 != var0.field1345 || var0.field1352) {
                var0.method3333();
            } else if (field925 >= var0.field1344) {
                var0.method1566(field1021);
                if (var0.field1352) {
                    var0.method3333();
                } else {
                    Statics.field1335.method2523(var0.field1345, var0.field1346, var0.field1347, var0.field1348, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("fu.gc(III)V")
    public static final void method2870(int arg0, int arg1) {
        if (field1104 == 2) {
            method1943((field933 - Statics.field376 << 7) + field939, (field926 - Statics.field847 << 7) + field1015, field1169 * 2);
            if (field1022 > -1 && field925 % 20 < 10) {
                Statics.field3384[0].method4809(field1022 + arg0 - 12, field1009 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("bz.gq(Lcp;IIIIII)V")
    public static final void method993(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1057()) {
            return;
        }
        if (arg0 instanceof class88) {
            class260 var6 = ((class88) arg0).field1364;
            if (var6.field3572 != null) {
                var6 = var6.method4372();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class98.field1494;
        int[] var8 = class98.field1495;
        int var9 = 3;
        if (!arg0.field1231.method3316()) {
            method3779(arg0, arg0.field1256 + 15);
            for (class87 var10 = (class87) arg0.field1231.method3313(); var10 != null; var10 = (class87) arg0.field1231.method3315()) {
                class80 var11 = var10.method1573(field925);
                if (var11 != null) {
                    class250 var12 = var10.field1355;
                    class287 var13 = var12.method4096();
                    class287 var14 = var12.method4094();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3367;
                    } else {
                        if (var12.field3355 * 2 < var14.field3765) {
                            var15 = var12.field3355;
                        }
                        var16 = var14.field3765 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field925 - var11.field1274;
                    int var20 = var11.field1269 * var16 / var12.field3367;
                    int var23;
                    if (var11.field1271 > var19) {
                        int var21 = var12.field3369 == 0 ? 0 : var19 / var12.field3369 * var12.field3369;
                        int var22 = var11.field1268 * var16 / var12.field3367;
                        var23 = (var20 - var22) * var21 / var11.field1271 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1271 + var12.field3364 - var19;
                        if (var12.field3366 >= 0) {
                            var17 = (var24 << 8) / (var12.field3364 - var12.field3366);
                        }
                    }
                    if (var11.field1269 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field1022 + arg2 - (var16 >> 1);
                    int var26 = field1009 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field1022 > -1) {
                            class283.method4649(var25, var26, var23, 5, 65280);
                            class283.method4649(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3770;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4772(var27, var26, var17);
                            class283.method4642(var27, var26, var27 + var28, var26 + var29);
                            var14.method4772(var27, var26, var17);
                        } else {
                            var13.method4809(var27, var26);
                            class283.method4642(var27, var26, var27 + var28, var26 + var29);
                            var14.method4809(var27, var26);
                        }
                        class283.method4641(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1574()) {
                    var10.method3333();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class76 var30 = (class76) arg0;
            if (var30.field900) {
                return;
            }
            if (var30.field894 != -1 || var30.field883 != -1) {
                method3779(arg0, arg0.field1256 + 15);
                if (field1022 > -1) {
                    if (var30.field894 != -1) {
                        Statics.field794[var30.field894].method4809(field1022 + arg2 - 12, field1009 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field883 != -1) {
                        Statics.field1653[var30.field883].method4809(field1022 + arg2 - 12, field1009 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field1104 == 10 && field997 == var8[arg1]) {
                method3779(arg0, arg0.field1256 + 15);
                if (field1022 > -1) {
                    Statics.field3384[1].method4809(field1022 + arg2 - 12, field1009 + arg3 - var9);
                }
            }
        } else {
            class260 var31 = ((class88) arg0).field1364;
            if (var31.field3572 != null) {
                var31 = var31.method4372();
            }
            if (var31.field3570 >= 0 && var31.field3570 < Statics.field1653.length) {
                method3779(arg0, arg0.field1256 + 15);
                if (field1022 > -1) {
                    Statics.field1653[var31.field3570].method4809(field1022 + arg2 - 12, field1009 + arg3 - 30);
                }
            }
            if (field1104 == 1 && field934 == field954[arg1 - var7] && field925 % 20 < 10) {
                method3779(arg0, arg0.field1256 + 15);
                if (field1022 > -1) {
                    Statics.field3384[0].method4809(field1022 + arg2 - 12, field1009 + arg3 - 28);
                }
            }
        }
        if (arg0.field1219 != null && (arg1 >= var7 || !arg0.field1259 && (field1120 == 4 || !arg0.field1220 && (field1120 == 0 || field1120 == 3 || field1120 == 1 && method44(((class76) arg0).field896, false))))) {
            method3779(arg0, arg0.field1256);
            if (field1022 > -1 && field996 < field1074) {
                field1001[field996] = Statics.field407.method4454(arg0.field1219) / 2;
                field1065[field996] = Statics.field407.field3645;
                field1033[field996] = field1022;
                field999[field996] = field1009;
                field1002[field996] = arg0.field1223;
                field1003[field996] = arg0.field1224;
                field1004[field996] = arg0.field1222;
                field1005[field996] = arg0.field1219;
                field996++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1233[var32];
            int var34 = arg0.field1226[var32];
            class256 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field925) {
                    continue;
                }
                var35 = class256.method1427(arg0.field1226[var32]);
                var36 = var35.field3405;
                if (var35 != null && var35.field3422 != null) {
                    var35 = var35.method4184();
                    if (var35 == null) {
                        arg0.field1233[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1216[var32];
            class256 var38 = null;
            if (var37 >= 0) {
                var38 = class256.method1427(var37);
                if (var38 != null && var38.field3422 != null) {
                    var38 = var38.method4184();
                }
            }
            if (var33 - var36 <= field925) {
                if (var35 == null) {
                    arg0.field1233[var32] = -1;
                } else {
                    method3779(arg0, arg0.field1256 / 2);
                    if (field1022 > -1) {
                        if (var32 == 1) {
                            field1009 -= 20;
                        }
                        if (var32 == 2) {
                            field1022 -= 15;
                            field1009 -= 10;
                        }
                        if (var32 == 3) {
                            field1022 += 15;
                            field1009 -= 10;
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
                        class287 var51 = null;
                        class287 var52 = null;
                        class287 var53 = null;
                        class287 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class287 var64 = var35.method4196();
                        if (var64 != null) {
                            var43 = var64.field3765;
                            int var65 = var64.field3770;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3767;
                        }
                        class287 var66 = var35.method4187();
                        if (var66 != null) {
                            var44 = var66.field3765;
                            int var67 = var66.field3770;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3767;
                        }
                        class287 var68 = var35.method4202();
                        if (var68 != null) {
                            var45 = var68.field3765;
                            int var69 = var68.field3770;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3767;
                        }
                        class287 var70 = var35.method4189();
                        if (var70 != null) {
                            var46 = var70.field3765;
                            int var71 = var70.field3770;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3767;
                        }
                        if (var38 != null) {
                            var51 = var38.method4196();
                            if (var51 != null) {
                                var55 = var51.field3765;
                                int var72 = var51.field3770;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3767;
                            }
                            var52 = var38.method4187();
                            if (var52 != null) {
                                var56 = var52.field3765;
                                int var73 = var52.field3770;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3767;
                            }
                            var53 = var38.method4202();
                            if (var53 != null) {
                                var57 = var53.field3765;
                                int var74 = var53.field3770;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3767;
                            }
                            var54 = var38.method4189();
                            if (var54 != null) {
                                var58 = var54.field3765;
                                int var75 = var54.field3770;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3767;
                            }
                        }
                        class265 var76 = var35.method4190();
                        if (var76 == null) {
                            var76 = Statics.field853;
                        }
                        class265 var77;
                        if (var38 == null) {
                            var77 = Statics.field853;
                        } else {
                            var77 = var38.method4190();
                            if (var77 == null) {
                                var77 = Statics.field853;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4185(arg0.field1227[var32]);
                        int var83 = var76.method4454(var82);
                        if (var38 != null) {
                            var79 = var38.method4185(arg0.field1244[var32]);
                            var81 = var77.method4454(var79);
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
                        int var100 = arg0.field1233[var32] - field925;
                        int var101 = var35.field3416 - var35.field3416 * var100 / var35.field3405;
                        int var102 = var35.field3411 * var100 / var35.field3405 + -var35.field3411;
                        int var103 = field1022 + arg2 - (var92 >> 1) + var101;
                        int var104 = field1009 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3410 + var104 + 15;
                        int var108 = var107 - var76.field3631;
                        int var109 = var76.field3637 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3410 + var104 + 15;
                            int var111 = var110 - var77.field3631;
                            int var112 = var77.field3637 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3402 >= 0) {
                            var115 = (var100 << 8) / (var35.field3405 - var35.field3402);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4772(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4772(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4772(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4772(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4527(var82, var90 + var103, var107, var35.field3418, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4772(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4772(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4772(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4772(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4527(var79, var98 + var103, var110, var38.field3418, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4809(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4809(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4809(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4809(var93 + var103 - var50, var104);
                            }
                            var76.method4459(var82, var90 + var103, var107, var35.field3418 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4809(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4809(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4809(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4809(var97 + var103 - var62, var104);
                                }
                                var77.method4459(var79, var98 + var103, var110, var38.field3418 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.gk(IIIII)V")
    public static final void method50(int arg0, int arg1, int arg2, int arg3) {
        field996 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class98.field1494;
        int[] var7 = class98.field1495;
        for (int var8 = 0; var8 < field953 + var6; var8++) {
            class79 var9;
            if (var8 < var6) {
                var9 = field1099[var7[var8]];
                if (field1032 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field952[field954[var8 - var6]];
            }
            method993(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method993(field1099[field1032], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field996; var10++) {
            int var11 = field1033[var10];
            int var12 = field999[var10];
            int var13 = field1001[var10];
            int var14 = field1065[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field999[var16] - field1065[var16] && var12 - var14 < field999[var16] + 2 && var11 - var13 < field1033[var16] + field1001[var16] && var11 + var13 > field1033[var16] - field1001[var16] && field999[var16] - field1065[var16] < var12) {
                        var12 = field999[var16] - field1065[var16];
                        var15 = true;
                    }
                }
            }
            field1022 = field1033[var10];
            field1009 = field999[var10] = var12;
            String var17 = field1005[var10];
            if (field1024 == 0) {
                int var18 = 16776960;
                if (field1002[var10] < 6) {
                    var18 = field1119[field1002[var10]];
                }
                if (field1002[var10] == 6) {
                    var18 = field1007 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field1002[var10] == 7) {
                    var18 = field1007 % 20 < 10 ? 255 : 65535;
                }
                if (field1002[var10] == 8) {
                    var18 = field1007 % 20 < 10 ? 45056 : 8454016;
                }
                if (field1002[var10] == 9) {
                    int var19 = 150 - field1004[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field1002[var10] == 10) {
                    int var20 = 150 - field1004[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field1002[var10] == 11) {
                    int var21 = 150 - field1004[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field1003[var10] == 0) {
                    Statics.field407.method4462(var17, field1022 + arg0, field1009 + arg1, var18, 0);
                }
                if (field1003[var10] == 1) {
                    Statics.field407.method4464(var17, field1022 + arg0, field1009 + arg1, var18, 0, field1007);
                }
                if (field1003[var10] == 2) {
                    Statics.field407.method4465(var17, field1022 + arg0, field1009 + arg1, var18, 0, field1007);
                }
                if (field1003[var10] == 3) {
                    Statics.field407.method4520(var17, field1022 + arg0, field1009 + arg1, var18, 0, field1007, 150 - field1004[var10]);
                }
                if (field1003[var10] == 4) {
                    int var22 = (150 - field1004[var10]) * (Statics.field407.method4454(var17) + 100) / 150;
                    class283.method4642(field1022 + arg0 - 50, arg1, field1022 + arg0 + 50, arg1 + arg3);
                    Statics.field407.method4459(var17, field1022 + arg0 + 50 - var22, field1009 + arg1, var18, 0);
                    class283.method4641(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field1003[var10] == 5) {
                    int var23 = 150 - field1004[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class283.method4642(arg0, field1009 + arg1 - Statics.field407.field3645 - 1, arg0 + arg2, field1009 + arg1 + 5);
                    Statics.field407.method4462(var17, field1022 + arg0, field1009 + arg1 + var24, var18, 0);
                    class283.method4641(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field407.method4462(var17, field1022 + arg0, field1009 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("bc.gf(B)V")
    public static final void method949() {
        field1132 = 0;
        int var0 = (Statics.field655.field1221 >> 7) + Statics.field376;
        int var1 = (Statics.field655.field1207 >> 7) + Statics.field847;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field1132 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field1132 = 1;
        }
        if (field1132 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field1132 = 0;
        }
    }

    @ObfuscatedName("as.gx(IIIII)V")
    public static final void method546(int arg0, int arg1, int arg2, int arg3) {
        if (field1096 == 1) {
            Statics.field2422[field1012 / 100].method4809(field1030 - 8, field1011 - 8);
        }
        if (field1096 == 2) {
            Statics.field2422[field1012 / 100 + 4].method4809(field1030 - 8, field1011 - 8);
        }
        method949();
    }

    @ObfuscatedName("hs.gv(Lcp;IS)V")
    public static final void method3779(class79 arg0, int arg1) {
        method1943(arg0.field1221, arg0.field1207, arg1);
    }

    @ObfuscatedName("dp.gz(IIII)V")
    public static final void method1943(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field1022 = -1;
            field1009 = -1;
            return;
        }
        int var3 = method995(arg0, arg1, Statics.field424) - arg2;
        int var4 = arg0 - Statics.field3685;
        int var5 = var3 - Statics.field1198;
        int var6 = arg1 - Statics.field2314;
        int var7 = class138.field2004[Statics.field3370];
        int var8 = class138.field2027[Statics.field3370];
        int var9 = class138.field2004[Statics.field906];
        int var10 = class138.field2027[Statics.field906];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field1022 = field1167 * var11 / var15 + field1050 / 2;
            field1009 = field1167 * var14 / var15 + field1168 / 2;
        } else {
            field1022 = -1;
            field1009 = -1;
        }
    }

    @ObfuscatedName("br.gu(IIII)I")
    public static final int method995(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field755[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field761[var5][var3][var4] + class62.field761[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field761[var5][var3][var4 + 1] + class62.field761[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("jy.gd(ZB)V")
    public static final void method4442(boolean arg0) {
        field1023 = arg0;
        if (!field1023) {
            int var1 = field959.method2966();
            int var2 = field959.method2966();
            int var3 = field959.method3091();
            Statics.field708 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field708[var4][var5] = field959.method2933();
                }
            }
            Statics.field664 = new int[var3];
            Statics.field28 = new int[var3];
            Statics.field37 = new int[var3];
            Statics.field710 = new byte[var3][];
            Statics.field3270 = new byte[var3][];
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
                        Statics.field664[var7] = var10;
                        Statics.field28[var7] = Statics.field2242.method3829("m" + var8 + "_" + var9);
                        Statics.field37[var7] = Statics.field2242.method3829("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method252(var2, var1, true);
            return;
        }
        int var11 = field959.method2966();
        boolean var12 = field959.method2957() == 1;
        int var13 = field959.method3091();
        int var14 = field959.method3091();
        field959.method3152();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field959.method3157(1);
                    if (var18 == 1) {
                        field977[var15][var16][var17] = field959.method3157(26);
                    } else {
                        field977[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field959.method3158();
        Statics.field708 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field708[var19][var20] = field959.method2933();
            }
        }
        Statics.field664 = new int[var14];
        Statics.field28 = new int[var14];
        Statics.field37 = new int[var14];
        Statics.field710 = new byte[var14][];
        Statics.field3270 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field977[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field664[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field664[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field28[var21] = Statics.field2242.method3829("m" + var30 + "_" + var31);
                            Statics.field37[var21] = Statics.field2242.method3829("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method252(var11, var13, !var12);
    }

    @ObfuscatedName("al.gs(IIZB)V")
    public static final void method252(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field606 == arg0 && Statics.field827 == arg1) {
            return;
        }
        Statics.field606 = arg0;
        Statics.field827 = arg1;
        method241(25);
        method162(class227.field2836, true);
        int var3 = Statics.field376;
        int var4 = Statics.field847;
        Statics.field376 = (arg0 - 6) * 8;
        Statics.field847 = (arg1 - 6) * 8;
        int var5 = Statics.field376 - var3;
        int var6 = Statics.field847 - var4;
        int var7 = Statics.field376;
        int var8 = Statics.field847;
        for (int var9 = 0; var9 < 32768; var9++) {
            class88 var10 = field952[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1261[var11] -= var5;
                    var10.field1262[var11] -= var6;
                }
                var10.field1221 -= var5 * 128;
                var10.field1207 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class76 var13 = field1099[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1261[var14] -= var5;
                    var13.field1262[var14] -= var6;
                }
                var13.field1221 -= var5 * 128;
                var13.field1207 -= var6 * 128;
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
                        field1131[var25][var21][var22] = field1131[var25][var23][var24];
                    } else {
                        field1131[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class78 var26 = (class78) field1034.method3348(); var26 != null; var26 = (class78) field1034.method3350()) {
            var26.field1188 -= var5;
            var26.field1186 -= var6;
            if (var26.field1188 < 0 || var26.field1186 < 0 || var26.field1188 >= 104 || var26.field1186 >= 104) {
                var26.method3333();
            }
        }
        if (field1137 != 0) {
            field1137 -= var5;
            field967 -= var6;
        }
        field1145 = 0;
        field940 = false;
        field950 = -1;
        field1071.method3366();
        field1035.method3366();
        for (int var27 = 0; var27 < 4; var27++) {
            field975[var27].method2813();
        }
    }

    @ObfuscatedName("ai.gh(ZB)V")
    public static final void method629(boolean arg0) {
        method465();
        field991++;
        if (field991 < 50 && !arg0) {
            return;
        }
        field991 = 0;
        if (field968 || Statics.field2312 == null) {
            return;
        }
        field957.method3154(98);
        try {
            Statics.field2312.method2785(field957.field2376, 0, field957.field2381);
            field957.field2381 = 0;
        } catch (IOException var2) {
            field968 = true;
        }
    }

    @ObfuscatedName("af.ge(I)V")
    public static final void method513() {
        method629(false);
        field1124 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field710.length; var1++) {
            if (Statics.field28[var1] != -1 && Statics.field710[var1] == null) {
                Statics.field710[var1] = Statics.field2242.method3817(Statics.field28[var1], 0);
                if (Statics.field710[var1] == null) {
                    var0 = false;
                    field1124++;
                }
            }
            if (Statics.field37[var1] != -1 && Statics.field3270[var1] == null) {
                Statics.field3270[var1] = Statics.field2242.method3856(Statics.field37[var1], 0, Statics.field708[var1]);
                if (Statics.field3270[var1] == null) {
                    var0 = false;
                    field1124++;
                }
            }
        }
        if (!var0) {
            field974 = 1;
            return;
        }
        field972 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field710.length; var3++) {
            byte[] var4 = Statics.field3270[var3];
            if (var4 != null) {
                int var5 = (Statics.field664[var3] >> 8) * 64 - Statics.field376;
                int var6 = (Statics.field664[var3] & 0xFF) * 64 - Statics.field847;
                if (field1023) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class62.method120(var4, var5, var6);
            }
        }
        if (!var2) {
            field974 = 2;
            return;
        }
        if (field974 != 0) {
            method162(class227.field2836 + class90.field1382 + class90.field1377 + 100 + "%" + class90.field1390, true);
        }
        method465();
        method1407();
        method465();
        Statics.field1335.method2544();
        method465();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field975[var7].method2813();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class62.field755[var8][var9][var10] = 0;
                }
            }
        }
        method465();
        class62.field754 = 99;
        Statics.field1404 = new byte[4][104][104];
        Statics.field745 = new byte[4][104][104];
        Statics.field1410 = new byte[4][104][104];
        Statics.field505 = new byte[4][104][104];
        Statics.field749 = new int[4][105][105];
        Statics.field1547 = new byte[4][105][105];
        Statics.field757 = new int[105][105];
        Statics.field331 = new int[104];
        Statics.field1853 = new int[104];
        Statics.field474 = new int[104];
        Statics.field747 = new int[104];
        Statics.field743 = new int[104];
        int var11 = Statics.field710.length;
        class83.method164();
        method629(true);
        if (!field1023) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field664[var12] >> 8) * 64 - Statics.field376;
                int var14 = (Statics.field664[var12] & 0xFF) * 64 - Statics.field847;
                byte[] var15 = Statics.field710[var12];
                if (var15 != null) {
                    method465();
                    int var16 = Statics.field606 * 8 - 48;
                    int var17 = Statics.field827 * 8 - 48;
                    class163[] var18 = field975;
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 64; var20++) {
                            for (int var21 = 0; var21 < 64; var21++) {
                                if (var13 + var20 > 0 && var13 + var20 < 103 && var14 + var21 > 0 && var14 + var21 < 103) {
                                    var18[var19].field2280[var13 + var20][var14 + var21] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class175 var22 = new class175(var15);
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 64; var24++) {
                            for (int var25 = 0; var25 < 64; var25++) {
                                class62.method1002(var22, var23, var13 + var24, var14 + var25, var16, var17, 0);
                            }
                        }
                    }
                }
            }
            for (int var26 = 0; var26 < var11; var26++) {
                int var27 = (Statics.field664[var26] >> 8) * 64 - Statics.field376;
                int var28 = (Statics.field664[var26] & 0xFF) * 64 - Statics.field847;
                byte[] var29 = Statics.field710[var26];
                if (var29 == null && Statics.field827 < 800) {
                    method465();
                    class62.method1647(var27, var28, 64, 64);
                }
            }
            method629(true);
            for (int var30 = 0; var30 < var11; var30++) {
                byte[] var31 = Statics.field3270[var30];
                if (var31 != null) {
                    int var32 = (Statics.field664[var30] >> 8) * 64 - Statics.field376;
                    int var33 = (Statics.field664[var30] & 0xFF) * 64 - Statics.field847;
                    method465();
                    class141 var34 = Statics.field1335;
                    class163[] var35 = field975;
                    class175 var36 = new class175(var31);
                    int var37 = -1;
                    while (true) {
                        int var38 = var36.method3046();
                        if (var38 == 0) {
                            break;
                        }
                        var37 += var38;
                        int var39 = 0;
                        while (true) {
                            int var40 = var36.method3046();
                            if (var40 == 0) {
                                break;
                            }
                            var39 += var40 - 1;
                            int var41 = var39 & 0x3F;
                            int var42 = var39 >> 6 & 0x3F;
                            int var43 = var39 >> 12;
                            int var44 = var36.method2928();
                            int var45 = var44 >> 2;
                            int var46 = var44 & 0x3;
                            int var47 = var32 + var42;
                            int var48 = var33 + var41;
                            if (var47 > 0 && var48 > 0 && var47 < 103 && var48 < 103) {
                                int var49 = var43;
                                if ((class62.field755[1][var47][var48] & 0x2) == 2) {
                                    var49 = var43 - 1;
                                }
                                class163 var50 = null;
                                if (var49 >= 0) {
                                    var50 = var35[var49];
                                }
                                class62.method2300(var43, var47, var48, var37, var46, var45, var34, var50);
                            }
                        }
                    }
                }
            }
        }
        if (field1023) {
            for (int var51 = 0; var51 < 4; var51++) {
                method465();
                for (int var52 = 0; var52 < 13; var52++) {
                    for (int var53 = 0; var53 < 13; var53++) {
                        boolean var54 = false;
                        int var55 = field977[var51][var52][var53];
                        if (var55 != -1) {
                            int var56 = var55 >> 24 & 0x3;
                            int var57 = var55 >> 1 & 0x3;
                            int var58 = var55 >> 14 & 0x3FF;
                            int var59 = var55 >> 3 & 0x7FF;
                            int var60 = (var58 / 8 << 8) + var59 / 8;
                            for (int var61 = 0; var61 < Statics.field664.length; var61++) {
                                if (Statics.field664[var61] == var60 && Statics.field710[var61] != null) {
                                    byte[] var62 = Statics.field710[var61];
                                    int var63 = var52 * 8;
                                    int var64 = var53 * 8;
                                    int var65 = (var58 & 0x7) * 8;
                                    int var66 = (var59 & 0x7) * 8;
                                    class163[] var67 = field975;
                                    for (int var68 = 0; var68 < 8; var68++) {
                                        for (int var69 = 0; var69 < 8; var69++) {
                                            if (var63 + var68 > 0 && var63 + var68 < 103 && var64 + var69 > 0 && var64 + var69 < 103) {
                                                var67[var51].field2280[var63 + var68][var64 + var69] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class175 var70 = new class175(var62);
                                    for (int var71 = 0; var71 < 4; var71++) {
                                        for (int var72 = 0; var72 < 64; var72++) {
                                            for (int var73 = 0; var73 < 64; var73++) {
                                                if (var56 == var71 && var72 >= var65 && var72 < var65 + 8 && var73 >= var66 && var73 < var66 + 8) {
                                                    int var77 = var72 & 0x7;
                                                    int var78 = var73 & 0x7;
                                                    int var80 = var57 & 0x3;
                                                    int var81;
                                                    if (var80 == 0) {
                                                        var81 = var77;
                                                    } else if (var80 == 1) {
                                                        var81 = var78;
                                                    } else if (var80 == 2) {
                                                        var81 = 7 - var77;
                                                    } else {
                                                        var81 = 7 - var78;
                                                    }
                                                    int var84 = var63 + var81;
                                                    int var86 = var72 & 0x7;
                                                    int var87 = var73 & 0x7;
                                                    int var89 = var57 & 0x3;
                                                    int var90;
                                                    if (var89 == 0) {
                                                        var90 = var87;
                                                    } else if (var89 == 1) {
                                                        var90 = 7 - var86;
                                                    } else if (var89 == 2) {
                                                        var90 = 7 - var87;
                                                    } else {
                                                        var90 = var86;
                                                    }
                                                    class62.method1002(var70, var51, var84, var64 + var90, 0, 0, var57);
                                                } else {
                                                    class62.method1002(var70, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var54 = true;
                                    break;
                                }
                            }
                        }
                        if (!var54) {
                            int var91 = var51;
                            int var92 = var52 * 8;
                            int var93 = var53 * 8;
                            for (int var94 = 0; var94 < 8; var94++) {
                                for (int var95 = 0; var95 < 8; var95++) {
                                    class62.field761[var91][var92 + var94][var93 + var95] = 0;
                                }
                            }
                            if (var92 > 0) {
                                for (int var96 = 1; var96 < 8; var96++) {
                                    class62.field761[var91][var92][var93 + var96] = class62.field761[var91][var92 - 1][var93 + var96];
                                }
                            }
                            if (var93 > 0) {
                                for (int var97 = 1; var97 < 8; var97++) {
                                    class62.field761[var91][var92 + var97][var93] = class62.field761[var91][var92 + var97][var93 - 1];
                                }
                            }
                            if (var92 > 0 && class62.field761[var91][var92 - 1][var93] != 0) {
                                class62.field761[var91][var92][var93] = class62.field761[var91][var92 - 1][var93];
                            } else if (var93 > 0 && class62.field761[var91][var92][var93 - 1] != 0) {
                                class62.field761[var91][var92][var93] = class62.field761[var91][var92][var93 - 1];
                            } else if (var92 > 0 && var93 > 0 && class62.field761[var91][var92 - 1][var93 - 1] != 0) {
                                class62.field761[var91][var92][var93] = class62.field761[var91][var92 - 1][var93 - 1];
                            }
                        }
                    }
                }
            }
            for (int var98 = 0; var98 < 13; var98++) {
                for (int var99 = 0; var99 < 13; var99++) {
                    int var100 = field977[0][var98][var99];
                    if (var100 == -1) {
                        class62.method1647(var98 * 8, var99 * 8, 8, 8);
                    }
                }
            }
            method629(true);
            for (int var101 = 0; var101 < 4; var101++) {
                method465();
                for (int var102 = 0; var102 < 13; var102++) {
                    for (int var103 = 0; var103 < 13; var103++) {
                        int var104 = field977[var101][var102][var103];
                        if (var104 != -1) {
                            int var105 = var104 >> 24 & 0x3;
                            int var106 = var104 >> 1 & 0x3;
                            int var107 = var104 >> 14 & 0x3FF;
                            int var108 = var104 >> 3 & 0x7FF;
                            int var109 = (var107 / 8 << 8) + var108 / 8;
                            for (int var110 = 0; var110 < Statics.field664.length; var110++) {
                                if (Statics.field664[var110] == var109 && Statics.field3270[var110] != null) {
                                    class62.method35(Statics.field3270[var110], var101, var102 * 8, var103 * 8, var105, (var107 & 0x7) * 8, (var108 & 0x7) * 8, var106, Statics.field1335, field975);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method629(true);
        method1407();
        method465();
        class62.method243(Statics.field1335, field975);
        method629(true);
        int var111 = class62.field754;
        if (var111 > Statics.field424) {
            var111 = Statics.field424;
        }
        if (var111 < Statics.field424 - 1) {
            int var112 = Statics.field424 - 1;
        }
        if (field1109) {
            Statics.field1335.method2513(class62.field754);
        } else {
            Statics.field1335.method2513(0);
        }
        for (int var113 = 0; var113 < 104; var113++) {
            for (int var114 = 0; var114 < 104; var114++) {
                method466(var113, var114);
            }
        }
        method465();
        method980();
        class257.field3438.method3282();
        if (Statics.field32.method778()) {
            field957.method3154(81);
            field957.method2916(1057001181);
        }
        if (!field1023) {
            int var115 = (Statics.field606 - 6) / 8;
            int var116 = (Statics.field606 + 6) / 8;
            int var117 = (Statics.field827 - 6) / 8;
            int var118 = (Statics.field827 + 6) / 8;
            for (int var119 = var115 - 1; var119 <= var116 + 1; var119++) {
                for (int var120 = var117 - 1; var120 <= var118 + 1; var120++) {
                    if (var119 < var115 || var119 > var116 || var120 < var117 || var120 > var118) {
                        Statics.field2242.method3839("m" + var119 + "_" + var120);
                        Statics.field2242.method3839("l" + var119 + "_" + var120);
                    }
                }
            }
        }
        method241(30);
        method465();
        class62.method682();
        field957.method3154(247);
        Statics.field3173.method2715();
        for (int var121 = 0; var121 < 32; var121++) {
            field680[var121] = 0L;
        }
        for (int var122 = 0; var122 < 32; var122++) {
            field709[var122] = 0L;
        }
        Statics.field2581 = 0;
    }

    @ObfuscatedName("ah.gt(II)V")
    public static final void method240(int arg0) {
        int[] var1 = Statics.field668.field3771;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field755[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1335.method2522(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class62.field755[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1335.method2522(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field668.method4757();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field755[arg0][var10][var9] & 0x18) == 0) {
                    method196(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class62.field755[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method196(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1133 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1335.method2540(Statics.field424, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class257.method247(var14).field3457;
                    if (var15 >= 0) {
                        field1076[field1133] = Statics.field3277[var15].method3981(false);
                        field1134[field1133] = var11;
                        field1135[field1133] = var12;
                        field1133++;
                    }
                }
            }
        }
        Statics.field323.method4726();
    }

    @ObfuscatedName("ag.gj(IIIIII)V")
    public static final void method196(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1335.method2537(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1335.method2541(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field668.field3771;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class257 var13 = class257.method247(var12);
            if (var13.field3445 == -1) {
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
                class286 var14 = Statics.field322[var13.field3445];
                if (var14 != null) {
                    int var15 = (var13.field3476 * 4 - var14.field3758) / 2;
                    int var16 = (var13.field3443 * 4 - var14.field3759) / 2;
                    var14.method4734(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3443) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1335.method2539(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1335.method2541(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class257 var22 = class257.method247(var21);
            if (var22.field3445 != -1) {
                class286 var23 = Statics.field322[var22.field3445];
                if (var23 != null) {
                    int var24 = (var22.field3476 * 4 - var23.field3758) / 2;
                    int var25 = (var22.field3443 * 4 - var23.field3759) / 2;
                    var23.method4734(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3443) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field668.field3771;
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
        int var29 = Statics.field1335.method2540(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class257 var31 = class257.method247(var30);
        if (var31.field3445 == -1) {
            return;
        }
        class286 var32 = Statics.field322[var31.field3445];
        if (var32 != null) {
            int var33 = (var31.field3476 * 4 - var32.field3758) / 2;
            int var34 = (var31.field3443 * 4 - var32.field3759) / 2;
            var32.method4734(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3443) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.gi(B)Z")
    public final boolean method1281() {
        if (Statics.field2312 == null) {
            return false;
        }
        try {
            int var1 = Statics.field2312.method2787();
            if (var1 == 0) {
                return false;
            }
            if (field961 == -1) {
                Statics.field2312.method2789(field959.field2376, 0, 1);
                field959.field2381 = 0;
                field961 = field959.method3155();
                field1000 = class274.field3681[field961];
                var1--;
            }
            if (field1000 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                Statics.field2312.method2789(field959.field2376, 0, 1);
                field1000 = field959.field2376[0] & 0xFF;
                var1--;
            }
            if (field1000 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                Statics.field2312.method2789(field959.field2376, 0, 2);
                field959.field2381 = 0;
                field1000 = field959.method3091();
                var1 -= 2;
            }
            if (var1 < field1000) {
                return false;
            }
            field959.field2381 = 0;
            Statics.field2312.method2789(field959.field2376, 0, field1000);
            field969 = 0;
            field966 = field1060;
            field1060 = field927;
            field927 = field961;
            if (field961 == 150) {
                field932 = field959.method2965() * 30;
                field1100 = field1088;
                field961 = -1;
                return true;
            }
            if (field961 == 230) {
                class98.method73(field959, field1000);
                field961 = -1;
                return true;
            }
            if (field961 == 145) {
                method1972(field959.method3113());
                field961 = -1;
                return true;
            }
            if (field961 == 127) {
                while (field959.field2381 < field1000) {
                    int var2 = field959.method2928();
                    boolean var3 = (var2 & 0x1) == 1;
                    String var4 = field959.method3113();
                    String var5 = field959.method3113();
                    field959.method3113();
                    for (int var6 = 0; var6 < field1064; var6++) {
                        class72 var7 = field1183[var6];
                        if (var3) {
                            if (var5.equals(var7.field857)) {
                                var7.field857 = var4;
                                var7.field852 = var5;
                                var4 = null;
                                break;
                            }
                        } else if (var4.equals(var7.field857)) {
                            var7.field857 = var4;
                            var7.field852 = var5;
                            var4 = null;
                            break;
                        }
                    }
                    if (var4 != null && field1064 < 400) {
                        class72 var8 = new class72();
                        field1183[field1064] = var8;
                        var8.field857 = var4;
                        var8.field852 = var5;
                        field1064++;
                    }
                }
                field1092 = field1088;
                field961 = -1;
                return true;
            }
            if (field961 == 31) {
                method5();
                field1069 = field959.method2931();
                field1100 = field1088;
                field961 = -1;
                return true;
            }
            if (field961 == 57) {
                field1137 = field959.method2928();
                if (field1137 == 255) {
                    field1137 = 0;
                }
                field967 = field959.method2928();
                if (field967 == 255) {
                    field967 = 0;
                }
                field961 = -1;
                return true;
            }
            if (field961 == 175) {
                while (field959.field2381 < field1000) {
                    boolean var9 = field959.method2928() == 1;
                    String var10 = field959.method3113();
                    String var11 = field959.method3113();
                    int var12 = field959.method3091();
                    int var13 = field959.method2928();
                    int var14 = field959.method2928();
                    boolean var15 = (var14 & 0x2) != 0;
                    boolean var16 = (var14 & 0x1) != 0;
                    if (var12 > 0) {
                        field959.method3113();
                        field959.method2928();
                        field959.method2933();
                    }
                    field959.method3113();
                    for (int var17 = 0; var17 < field976; var17++) {
                        class66 var18 = field1172[var17];
                        if (var9) {
                            if (var11.equals(var18.field802)) {
                                var18.field802 = var10;
                                var18.field797 = var11;
                                var10 = null;
                                break;
                            }
                        } else if (var10.equals(var18.field802)) {
                            if (var18.field803 != var12) {
                                boolean var19 = true;
                                for (class68 var20 = (class68) field1173.method3383(); var20 != null; var20 = (class68) field1173.method3384()) {
                                    if (var20.field815.equals(var10)) {
                                        if (var12 != 0 && var20.field819 == 0) {
                                            var20.method3390();
                                            var19 = false;
                                        } else if (var12 == 0 && var20.field819 != 0) {
                                            var20.method3390();
                                            var19 = false;
                                        }
                                    }
                                }
                                if (var19) {
                                    field1173.method3381(new class68(var10, var12));
                                }
                                var18.field803 = var12;
                            }
                            var18.field797 = var11;
                            var18.field798 = var13;
                            var18.field800 = var15;
                            var18.field801 = var16;
                            var10 = null;
                            break;
                        }
                    }
                    if (var10 != null && field976 < 400) {
                        class66 var21 = new class66();
                        field1172[field976] = var21;
                        var21.field802 = var10;
                        var21.field797 = var11;
                        var21.field803 = var12;
                        var21.field798 = var13;
                        var21.field800 = var15;
                        var21.field801 = var16;
                        field976++;
                    }
                }
                field1171 = 2;
                field1092 = field1088;
                boolean var22 = false;
                int var23 = field976;
                while (var23 > 0) {
                    boolean var24 = true;
                    var23--;
                    for (int var25 = 0; var25 < var23; var25++) {
                        boolean var26 = false;
                        class66 var27 = field1172[var25];
                        class66 var28 = field1172[var25 + 1];
                        if (field917 != var27.field803 && field917 == var28.field803) {
                            var26 = true;
                        }
                        if (!var26 && var27.field803 == 0 && var28.field803 != 0) {
                            var26 = true;
                        }
                        if (!var26 && !var27.field800 && var28.field800) {
                            var26 = true;
                        }
                        if (!var26 && !var27.field801 && var28.field801) {
                            var26 = true;
                        }
                        if (var26) {
                            class66 var29 = field1172[var25];
                            field1172[var25] = field1172[var25 + 1];
                            field1172[var25 + 1] = var29;
                            var24 = false;
                        }
                    }
                    if (var24) {
                        break;
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 103) {
                method718(false);
                field961 = -1;
                return true;
            }
            if (field961 == 165) {
                int var30 = field959.method2957();
                int var31 = field959.method2976();
                int var32 = field959.method3091();
                class69 var33 = (class69) field1180.method3294((long) var31);
                if (var33 != null) {
                    method135(var33, var33.field822 != var32);
                }
                method2712(var31, var32, var30);
                field961 = -1;
                return true;
            }
            if (field961 == 236) {
                int var34 = field959.method3103();
                class218 var35 = class218.method4538(var34);
                var35.field2667 = 3;
                var35.field2683 = Statics.field655.field881.method3677();
                method4218(var35);
                field961 = -1;
                return true;
            }
            if (field961 == 226) {
                int var36 = field959.method3091();
                int var37 = field959.method3103();
                class218 var38 = class218.method4538(var37);
                if (var38.field2667 != 1 || var38.field2683 != var36) {
                    var38.field2667 = 1;
                    var38.field2683 = var36;
                    method4218(var38);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 148) {
                int var39 = field959.method2968();
                int var40 = field959.method2976();
                class218 var41 = class218.method4538(var40);
                if (var41.field2634 != var39 || var39 == -1) {
                    var41.field2634 = var39;
                    var41.field2746 = 0;
                    var41.field2747 = 0;
                    method4218(var41);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 59) {
                int var42 = field959.method2933();
                int var43 = field959.method2933();
                int var44 = 0;
                if (Statics.field879 == null || !Statics.field879.isValid()) {
                    try {
                        Iterator var45 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var45.hasNext()) {
                            GarbageCollectorMXBean var46 = (GarbageCollectorMXBean) var45.next();
                            if (var46.isValid()) {
                                Statics.field879 = var46;
                                field704 = -1L;
                                field703 = -1L;
                            }
                        }
                    } catch (Throwable var338) {
                    }
                }
                if (Statics.field879 != null) {
                    long var48 = class177.method2903();
                    long var50 = Statics.field879.getCollectionTime();
                    if (field703 != -1L) {
                        long var52 = var50 - field703;
                        long var54 = var48 - field704;
                        if (var54 != 0L) {
                            var44 = (int) (var52 * 100L / var54);
                        }
                    }
                    field703 = var50;
                    field704 = var48;
                }
                field957.method3154(89);
                field957.method2952(field678);
                field957.method2971(var42);
                field957.method2971(var43);
                field957.method2913(var44);
                field961 = -1;
                return true;
            }
            if (field961 == 222) {
                field959.field2381 += 28;
                if (field959.method3044()) {
                    class181 var58 = field959;
                    int var59 = field959.field2381 - 28;
                    method134(var58.field2376, var59);
                    class157.method1385(var58, var59);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 211) {
                Statics.field792 = field959.method2957();
                Statics.field673 = field959.method2956();
                for (int var60 = Statics.field673; var60 < Statics.field673 + 8; var60++) {
                    for (int var61 = Statics.field792; var61 < Statics.field792 + 8; var61++) {
                        if (field1131[Statics.field424][var60][var61] != null) {
                            field1131[Statics.field424][var60][var61] = null;
                            method466(var60, var61);
                        }
                    }
                }
                for (class78 var62 = (class78) field1034.method3348(); var62 != null; var62 = (class78) field1034.method3350()) {
                    if (var62.field1188 >= Statics.field673 && var62.field1188 < Statics.field673 + 8 && var62.field1186 >= Statics.field792 && var62.field1186 < Statics.field792 + 8 && Statics.field424 == var62.field1194) {
                        var62.field1191 = 0;
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 125) {
                for (int var63 = 0; var63 < class213.field2585.length; var63++) {
                    if (class213.field2585[var63] != class213.field2583[var63]) {
                        class213.field2585[var63] = class213.field2583[var63];
                        method11(var63);
                        field1089[++field1175 - 1 & 0x1F] = var63;
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 235) {
                int var64 = field959.method3091();
                int var65 = field959.method2928();
                int var66 = field959.method3091();
                if (field1110 != 0 && var65 != 0 && field1145 < 50) {
                    field1176[field1145] = var64;
                    field1147[field1145] = var65;
                    field1148[field1145] = var66;
                    field1150[field1145] = null;
                    field1149[field1145] = 0;
                    field1145++;
                }
                field961 = -1;
                return true;
            }
            if (field961 == 172) {
                boolean var70 = field959.method2928() == 1;
                if (var70) {
                    Statics.field666 = class177.method2903() - field959.method2934();
                    Statics.field2328 = new class14(field959, true);
                } else {
                    Statics.field2328 = null;
                }
                field1047 = field1088;
                field961 = -1;
                return true;
            }
            if (field961 == 0) {
                int var71 = field959.method2976();
                String var72 = field959.method3113();
                class218 var73 = class218.method4538(var71);
                if (!var72.equals(var73.field2684)) {
                    var73.field2684 = var72;
                    method4218(var73);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 4) {
                String var74 = field959.method3113();
                long var75 = field959.method2934();
                long var77 = (long) field959.method3091();
                long var79 = (long) field959.method2932();
                class232 var81 = (class232) class170.method2298(class232.method1018(), field959.method2928());
                long var82 = (var77 << 32) + var79;
                boolean var84 = false;
                for (int var85 = 0; var85 < 100; var85++) {
                    if (field1123[var85] == var82) {
                        var84 = true;
                        break;
                    }
                }
                if (var81.field3153 && method163(var74)) {
                    var84 = true;
                }
                if (!var84 && field1132 == 0) {
                    field1123[field1066] = var82;
                    field1066 = (field1066 + 1) % 100;
                    class181 var86 = field959;
                    String var90;
                    try {
                        int var87 = var86.method3046();
                        if (var87 > 32767) {
                            var87 = 32767;
                        }
                        byte[] var88 = new byte[var87];
                        var86.field2381 += Statics.field275.method2869(var86.field2376, var86.field2381, var88, 0, var87);
                        String var89 = class268.method3715(var88, 0, var87);
                        var90 = var89;
                    } catch (Exception var332) {
                        var90 = "Cabbage";
                    }
                    String var93 = class266.method4458(class272.method4539(var90));
                    if (var81.field3159 == -1) {
                        class100.method112(9, var74, var93, class270.method3160(var75));
                    } else {
                        int var94 = var81.field3159;
                        String var95 = "<img=" + var94 + ">";
                        class100.method112(9, var95 + var74, var93, class270.method3160(var75));
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 69) {
                for (int var96 = 0; var96 < Statics.field3271; var96++) {
                    class243 var97 = class243.method467(var96);
                    if (var97 != null) {
                        class213.field2583[var96] = 0;
                        class213.field2585[var96] = 0;
                    }
                }
                method5();
                field1175 += 32;
                field961 = -1;
                return true;
            }
            if (field961 == 20) {
                boolean var98 = field959.method2956() == 1;
                int var99 = field959.method2933();
                class218 var100 = class218.method4538(var99);
                if (var100.field2644 != var98) {
                    var100.field2644 = var98;
                    method4218(var100);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 67) {
                int var101 = field959.method2965();
                int var102 = field959.method2976();
                class213.field2583[var101] = var102;
                if (class213.field2585[var101] != var102) {
                    class213.field2585[var101] = var102;
                }
                method11(var101);
                field1089[++field1175 - 1 & 0x1F] = var101;
                field961 = -1;
                return true;
            }
            if (field961 == 104) {
                String var103 = field959.method3113();
                Object[] var104 = new Object[var103.length() + 1];
                for (int var105 = var103.length() - 1; var105 >= 0; var105--) {
                    if (var103.charAt(var105) == 's') {
                        var104[var105 + 1] = field959.method3113();
                    } else {
                        var104[var105 + 1] = Integer.valueOf(field959.method2933());
                    }
                }
                var104[0] = Integer.valueOf(field959.method2933());
                class71 var106 = new class71();
                var106.field850 = var104;
                class85.method1409(var106);
                field961 = -1;
                return true;
            }
            if (field961 == 105) {
                int var107 = field959.method3103();
                int var108 = field959.method2933();
                int var109 = field959.method2965();
                if (var109 == 65535) {
                    var109 = -1;
                }
                int var110 = field959.method3091();
                if (var110 == 65535) {
                    var110 = -1;
                }
                for (int var111 = var110; var111 <= var109; var111++) {
                    long var112 = ((long) var108 << 32) + (long) var111;
                    class194 var114 = field988.method3294(var112);
                    if (var114 != null) {
                        var114.method3333();
                    }
                    field988.method3293(new class200(var107), var112);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 233) {
                field1097 = field1088;
                if (field1000 == 0) {
                    field916 = null;
                    field1130 = null;
                    Statics.field34 = 0;
                    Statics.field468 = null;
                    field961 = -1;
                    return true;
                }
                field1130 = field959.method3113();
                long var115 = field959.method2934();
                long var117 = var115;
                String var119;
                if (var115 <= 0L || var115 >= 6582952005840035281L) {
                    var119 = null;
                } else if (var115 % 37L == 0L) {
                    var119 = null;
                } else {
                    int var120 = 0;
                    for (long var121 = var115; var121 != 0L; var121 /= 37L) {
                        var120++;
                    }
                    StringBuilder var123 = new StringBuilder(var120);
                    while (var117 != 0L) {
                        long var124 = var117;
                        var117 /= 37L;
                        var123.append(class270.field3661[(int) (var124 - var117 * 37L)]);
                    }
                    var119 = var123.reverse().toString();
                }
                field916 = var119;
                Statics.field1138 = field959.method2998();
                int var126 = field959.method2928();
                if (var126 == 255) {
                    field961 = -1;
                    return true;
                }
                Statics.field34 = var126;
                class77[] var127 = new class77[100];
                for (int var128 = 0; var128 < Statics.field34; var128++) {
                    var127[var128] = new class77();
                    var127[var128].field911 = field959.method3113();
                    var127[var128].field913 = class269.method46(var127[var128].field911, Statics.field423);
                    var127[var128].field912 = field959.method3091();
                    var127[var128].field910 = field959.method2998();
                    field959.method3113();
                    if (var127[var128].field911.equals(Statics.field655.field896)) {
                        Statics.field805 = var127[var128].field910;
                    }
                }
                boolean var129 = false;
                int var130 = Statics.field34;
                while (var130 > 0) {
                    boolean var131 = true;
                    var130--;
                    for (int var132 = 0; var132 < var130; var132++) {
                        if (var127[var132].field913.compareTo(var127[var132 + 1].field913) > 0) {
                            class77 var133 = var127[var132];
                            var127[var132] = var127[var132 + 1];
                            var127[var132 + 1] = var133;
                            var131 = false;
                        }
                    }
                    if (var131) {
                        break;
                    }
                }
                Statics.field468 = var127;
                field961 = -1;
                return true;
            }
            if (field961 == 237) {
                class81 var134 = new class81();
                var134.field1291 = field959.method3113();
                var134.field1284 = field959.method3091();
                int var135 = field959.method2933();
                var134.field1285 = var135;
                method241(45);
                Statics.field2312.method2792();
                Statics.field2312 = null;
                class94.method926(var134);
                field961 = -1;
                return false;
            }
            if (field961 == 212) {
                int var136 = field959.method3090();
                if (var136 == 65535) {
                    var136 = -1;
                }
                if (var136 == -1 && !field1142) {
                    Statics.field2487.method3479();
                    class205.field2488 = 1;
                    Statics.field2489 = null;
                } else if (var136 != -1 && field1141 != var136 && field1061 != 0 && !field1142) {
                    class239 var137 = Statics.field3307;
                    int var138 = field1061;
                    class205.field2488 = 1;
                    Statics.field2489 = var137;
                    Statics.field274 = var136;
                    Statics.field2490 = 0;
                    Statics.field2491 = var138;
                    Statics.field473 = false;
                    Statics.field2492 = 2;
                }
                field1141 = var136;
                field961 = -1;
                return true;
            }
            if (field961 == 97) {
                int var139 = field959.method2970();
                int var140 = field959.method3091();
                if (var140 == 65535) {
                    var140 = -1;
                }
                if (field1061 != 0 && var140 != -1) {
                    class205.method248(Statics.field475, var140, 0, field1061, false);
                    field1142 = true;
                }
                field961 = -1;
                return true;
            }
            if (field961 == 29) {
                method718(true);
                field961 = -1;
                return true;
            }
            if (field961 == 89) {
                int var141 = field959.method2965();
                int var142 = field959.method2933();
                class218 var143 = class218.method4538(var142);
                if (var143.field2667 != 2 || var143.field2683 != var141) {
                    var143.field2667 = 2;
                    var143.field2683 = var141;
                    method4218(var143);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 111) {
                if (field1029 != -1) {
                    int var144 = field1029;
                    if (class218.method48(var144)) {
                        method250(Statics.field1482[var144], 0);
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 126) {
                int var145 = field959.method2933();
                int var146 = field959.method3091();
                if (var145 < -70000) {
                    var146 += 32768;
                }
                class218 var147;
                if (var145 >= 0) {
                    var147 = class218.method4538(var145);
                } else {
                    var147 = null;
                }
                while (field959.field2381 < field1000) {
                    int var148 = field959.method3046();
                    int var149 = field959.method3091();
                    int var150 = 0;
                    if (var149 != 0) {
                        var150 = field959.method2928();
                        if (var150 == 255) {
                            var150 = field959.method2933();
                        }
                    }
                    if (var147 != null && var148 >= 0 && var148 < var147.field2742.length) {
                        var147.field2742[var148] = var149;
                        var147.field2617[var148] = var150;
                    }
                    class64.method475(var146, var148, var149 - 1, var150);
                }
                if (var147 != null) {
                    method4218(var147);
                }
                method5();
                field1091[++field1016 - 1 & 0x1F] = var146 & 0x7FFF;
                field961 = -1;
                return true;
            }
            if (field961 == 118) {
                Statics.field654 = class278.method2906(field959.method2928());
                field961 = -1;
                return true;
            }
            if (field961 == 207) {
                byte var151 = field959.method2960();
                int var152 = field959.method3090();
                class213.field2583[var152] = var151;
                if (class213.field2585[var152] != var151) {
                    class213.field2585[var152] = var151;
                }
                method11(var152);
                field1089[++field1175 - 1 & 0x1F] = var152;
                field961 = -1;
                return true;
            }
            if (field961 == 146) {
                int var153 = field959.method2933();
                class69 var154 = (class69) field1180.method3294((long) var153);
                if (var154 != null) {
                    method135(var154, true);
                }
                if (field1067 != null) {
                    method4218(field1067);
                    field1067 = null;
                }
                field961 = -1;
                return true;
            }
            if (field961 == 51) {
                int var155 = field959.method2931();
                int var156 = field959.method2941();
                int var157 = field959.method2919();
                class218 var158 = class218.method4538(var157);
                if (var158.field2633 != var155 || var158.field2666 != var156 || var158.field2716 != 0 || var158.field2630 != 0) {
                    var158.field2633 = var155;
                    var158.field2666 = var156;
                    var158.field2716 = 0;
                    var158.field2630 = 0;
                    method4218(var158);
                    this.method1099(var158);
                    if (var158.field2757 == 0) {
                        method1078(Statics.field1482[var157 >> 16], var158, false);
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 242) {
                field1139 = field959.method2928();
                field961 = -1;
                return true;
            }
            if (field961 == 95) {
                Statics.field673 = field959.method2928();
                Statics.field792 = field959.method2957();
                while (field959.field2381 < field1000) {
                    field961 = field959.method2928();
                    method489();
                }
                field961 = -1;
                return true;
            }
            if (field961 == 141) {
                field940 = true;
                Statics.field249 = field959.method2928();
                Statics.field523 = field959.method2928();
                Statics.field506 = field959.method3091();
                Statics.field316 = field959.method2928();
                Statics.field875 = field959.method2928();
                if (Statics.field875 >= 100) {
                    Statics.field3685 = Statics.field249 * 128 + 64;
                    Statics.field2314 = Statics.field523 * 128 + 64;
                    Statics.field1198 = method995(Statics.field3685, Statics.field2314, Statics.field424) - Statics.field506;
                }
                field961 = -1;
                return true;
            }
            if (field961 == 189) {
                int var159 = field959.method2966();
                int var160 = field959.method3091();
                int var161 = field959.method3090();
                int var162 = field959.method2976();
                class218 var163 = class218.method4538(var162);
                if (var163.field2675 != var159 || var163.field2705 != var160 || var163.field2631 != var161) {
                    var163.field2675 = var159;
                    var163.field2705 = var160;
                    var163.field2631 = var161;
                    method4218(var163);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 187) {
                field1171 = 1;
                field1092 = field1088;
                field961 = -1;
                return true;
            }
            if (field961 == 22) {
                method4442(false);
                field959.method3155();
                int var164 = field959.method3091();
                class98.method73(field959, var164);
                field961 = -1;
                return true;
            }
            if (field961 == 135) {
                method5();
                field1068 = field959.method2928();
                field1100 = field1088;
                field961 = -1;
                return true;
            }
            if (field961 == 26) {
                int var165 = field959.method2928();
                int var166 = field959.method2928();
                int var167 = field959.method2928();
                int var168 = field959.method2928();
                field1152[var165] = true;
                field1153[var165] = var166;
                field1154[var165] = var167;
                field1155[var165] = var168;
                field963[var165] = 0;
                field961 = -1;
                return true;
            }
            if (field961 == 214) {
                int var169 = field959.method3103();
                int var170 = field959.method2933();
                class69 var171 = (class69) field1180.method3294((long) var170);
                class69 var172 = (class69) field1180.method3294((long) var169);
                if (var172 != null) {
                    method135(var172, var171 == null || var171.field822 != var172.field822);
                }
                if (var171 != null) {
                    var171.method3333();
                    field1180.method3293(var171, (long) var169);
                }
                class218 var173 = class218.method4538(var170);
                if (var173 != null) {
                    method4218(var173);
                }
                class218 var174 = class218.method4538(var169);
                if (var174 != null) {
                    method4218(var174);
                    method1078(Statics.field1482[var174.field2624 >>> 16], var174, true);
                }
                if (field1029 != -1) {
                    int var175 = field1029;
                    if (class218.method48(var175)) {
                        method250(Statics.field1482[var175], 1);
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 100) {
                field940 = false;
                for (int var176 = 0; var176 < 5; var176++) {
                    field1152[var176] = false;
                }
                field961 = -1;
                return true;
            }
            if (field961 == 116) {
                Statics.field792 = field959.method2955();
                Statics.field673 = field959.method2956();
                field961 = -1;
                return true;
            }
            if (field961 == 179) {
                field940 = true;
                Statics.field2240 = field959.method2928();
                Statics.field511 = field959.method2928();
                Statics.field2808 = field959.method3091();
                Statics.field2419 = field959.method2928();
                Statics.field2181 = field959.method2928();
                if (Statics.field2181 >= 100) {
                    int var177 = Statics.field2240 * 128 + 64;
                    int var178 = Statics.field511 * 128 + 64;
                    int var179 = method995(var177, var178, Statics.field424) - Statics.field2808;
                    int var180 = var177 - Statics.field3685;
                    int var181 = var179 - Statics.field1198;
                    int var182 = var178 - Statics.field2314;
                    int var183 = (int) Math.sqrt((double) (var180 * var180 + var182 * var182));
                    Statics.field3370 = (int) (Math.atan2((double) var181, (double) var183) * 325.949D) & 0x7FF;
                    Statics.field906 = (int) (Math.atan2((double) var180, (double) var182) * -325.949D) & 0x7FF;
                    if (Statics.field3370 < 128) {
                        Statics.field3370 = 128;
                    }
                    if (Statics.field3370 > 383) {
                        Statics.field3370 = 383;
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 122) {
                class181 var184 = field959;
                int var185 = field1000;
                class281 var186 = new class281();
                var186.field3728 = var184.method2928();
                var186.field3731 = var184.method2933();
                var186.field3729 = new int[var186.field3728];
                var186.field3727 = new int[var186.field3728];
                var186.field3735 = new Field[var186.field3728];
                var186.field3732 = new int[var186.field3728];
                var186.field3733 = new Method[var186.field3728];
                var186.field3734 = new byte[var186.field3728][][];
                for (int var187 = 0; var187 < var186.field3728; var187++) {
                    try {
                        int var188 = var184.method2928();
                        if (var188 == 0 || var188 == 1 || var188 == 2) {
                            String var189 = var184.method3113();
                            String var190 = var184.method3113();
                            int var191 = 0;
                            if (var188 == 1) {
                                var191 = var184.method2933();
                            }
                            var186.field3729[var187] = var188;
                            var186.field3732[var187] = var191;
                            if (class282.method1973(var189).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var186.field3735[var187] = class282.method1973(var189).getDeclaredField(var190);
                        } else if (var188 == 3 || var188 == 4) {
                            String var192 = var184.method3113();
                            String var193 = var184.method3113();
                            int var194 = var184.method2928();
                            String[] var195 = new String[var194];
                            for (int var196 = 0; var196 < var194; var196++) {
                                var195[var196] = var184.method3113();
                            }
                            String var197 = var184.method3113();
                            byte[][] var198 = new byte[var194][];
                            if (var188 == 3) {
                                for (int var199 = 0; var199 < var194; var199++) {
                                    int var200 = var184.method2933();
                                    var198[var199] = new byte[var200];
                                    var184.method2939(var198[var199], 0, var200);
                                }
                            }
                            var186.field3729[var187] = var188;
                            Class[] var201 = new Class[var194];
                            for (int var202 = 0; var202 < var194; var202++) {
                                var201[var202] = class282.method1973(var195[var202]);
                            }
                            Class var203 = class282.method1973(var197);
                            if (class282.method1973(var192).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var204 = class282.method1973(var192).getDeclaredMethods();
                            Method[] var205 = var204;
                            for (int var206 = 0; var206 < var205.length; var206++) {
                                Method var207 = var205[var206];
                                if (var207.getName().equals(var193)) {
                                    Class[] var208 = var207.getParameterTypes();
                                    if (var201.length == var208.length) {
                                        boolean var209 = true;
                                        for (int var210 = 0; var210 < var201.length; var210++) {
                                            if (var201[var210] != var208[var210]) {
                                                var209 = false;
                                                break;
                                            }
                                        }
                                        if (var209 && var203 == var207.getReturnType()) {
                                            var186.field3733[var187] = var207;
                                        }
                                    }
                                }
                            }
                            var186.field3734[var187] = var198;
                        }
                    } catch (ClassNotFoundException var333) {
                        var186.field3727[var187] = -1;
                    } catch (SecurityException var334) {
                        var186.field3727[var187] = -2;
                    } catch (NullPointerException var335) {
                        var186.field3727[var187] = -3;
                    } catch (Exception var336) {
                        var186.field3727[var187] = -4;
                    } catch (Throwable var337) {
                        var186.field3727[var187] = -5;
                    }
                }
                class282.field3738.method3326(var186);
                field961 = -1;
                return true;
            }
            if (field961 == 169) {
                int var216 = field959.method2966();
                if (var216 == 65535) {
                    var216 = -1;
                }
                int var217 = field959.method2933();
                int var218 = field959.method2919();
                class218 var219 = class218.method4538(var218);
                if (var219.field2623) {
                    var219.field2612 = var216;
                    var219.field2745 = var217;
                    class258 var221 = class258.method4627(var216);
                    var219.field2675 = var221.field3494;
                    var219.field2705 = var221.field3532;
                    var219.field2677 = var221.field3516;
                    var219.field2664 = var221.field3496;
                    var219.field2622 = var221.field3501;
                    var219.field2631 = var221.field3492;
                    if (var221.field3485 == 1) {
                        var219.field2682 = 1;
                    } else {
                        var219.field2682 = 2;
                    }
                    if (var219.field2679 > 0) {
                        var219.field2631 = var219.field2631 * 32 / var219.field2679;
                    } else if (var219.field2635 > 0) {
                        var219.field2631 = var219.field2631 * 32 / var219.field2635;
                    }
                    method4218(var219);
                } else if (var216 == -1) {
                    var219.field2667 = 0;
                    field961 = -1;
                    return true;
                } else {
                    class258 var220 = class258.method4627(var216);
                    var219.field2667 = 4;
                    var219.field2683 = var216;
                    var219.field2675 = var220.field3494;
                    var219.field2705 = var220.field3532;
                    var219.field2631 = var220.field3492 * 100 / var217;
                    method4218(var219);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 186) {
                class98.method1657();
                for (int var222 = 0; var222 < 2048; var222++) {
                    field1099[var222] = null;
                }
                class98.method3903(field959);
                field961 = -1;
                return true;
            }
            if (field961 == 167) {
                int var223 = field959.method2965();
                int var224 = field959.method3091();
                int var225 = field959.method3103();
                class218 var226 = class218.method4538(var225);
                var226.field2680 = (var223 << 16) + var224;
                field961 = -1;
                return true;
            }
            if (field961 == 8) {
                field1120 = field959.method2928();
                field1128 = field959.method2928();
                field961 = -1;
                return true;
            }
            if (field961 == 241) {
                field1104 = field959.method2928();
                if (field1104 == 1) {
                    field934 = field959.method3091();
                }
                if (field1104 >= 2 && field1104 <= 6) {
                    if (field1104 == 2) {
                        field939 = 64;
                        field1015 = 64;
                    }
                    if (field1104 == 3) {
                        field939 = 0;
                        field1015 = 64;
                    }
                    if (field1104 == 4) {
                        field939 = 128;
                        field1015 = 64;
                    }
                    if (field1104 == 5) {
                        field939 = 64;
                        field1015 = 0;
                    }
                    if (field1104 == 6) {
                        field939 = 64;
                        field1015 = 128;
                    }
                    field1104 = 2;
                    field933 = field959.method3091();
                    field926 = field959.method3091();
                    field1169 = field959.method2928();
                }
                if (field1104 == 10) {
                    field997 = field959.method3091();
                }
                field961 = -1;
                return true;
            }
            if (field961 == 140) {
                String var227 = field959.method3113();
                class181 var228 = field959;
                String var232;
                try {
                    int var229 = var228.method3046();
                    if (var229 > 32767) {
                        var229 = 32767;
                    }
                    byte[] var230 = new byte[var229];
                    var228.field2381 += Statics.field275.method2869(var228.field2376, var228.field2381, var230, 0, var229);
                    String var231 = class268.method3715(var230, 0, var229);
                    var232 = var231;
                } catch (Exception var331) {
                    var232 = "Cabbage";
                }
                String var235 = class266.method4458(class272.method4539(var232));
                Statics.method206(6, var227, var235);
                field961 = -1;
                return true;
            }
            if (field961 == 11) {
                int var236 = field959.method2928();
                if (field959.method2928() == 0) {
                    field1179[var236] = new class17();
                    field959.field2381 += 18;
                } else {
                    field959.field2381--;
                    field1179[var236] = new class17(field959, false);
                }
                field1098 = field1088;
                field961 = -1;
                return true;
            }
            if (field961 == 181) {
                int var237 = field1000 + field959.field2381;
                int var238 = field959.method3091();
                int var239 = field959.method3091();
                if (field1029 != var238) {
                    field1029 = var238;
                    this.method1098(false);
                    method1000(field1029);
                    class85.method3932(field1029);
                    for (int var240 = 0; var240 < 100; var240++) {
                        field1108[var240] = true;
                    }
                }
                while (var239-- > 0) {
                    int var241 = field959.method2933();
                    int var242 = field959.method3091();
                    int var243 = field959.method2928();
                    class69 var244 = (class69) field1180.method3294((long) var241);
                    if (var244 != null && var244.field822 != var242) {
                        method135(var244, true);
                        var244 = null;
                    }
                    if (var244 == null) {
                        var244 = method2712(var241, var242, var243);
                    }
                    var244.field823 = true;
                }
                for (class69 var245 = (class69) field1180.method3295(); var245 != null; var245 = (class69) field1180.method3302()) {
                    if (var245.field823) {
                        var245.field823 = false;
                    } else {
                        method135(var245, true);
                    }
                }
                field988 = new class192(512);
                while (field959.field2381 < var237) {
                    int var246 = field959.method2933();
                    int var247 = field959.method3091();
                    int var248 = field959.method3091();
                    int var249 = field959.method2933();
                    for (int var250 = var247; var250 <= var248; var250++) {
                        long var251 = ((long) var246 << 32) + (long) var250;
                        field988.method3293(new class200(var249), var251);
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 62 || field961 == 1 || field961 == 224 || field961 == 37 || field961 == 3 || field961 == 14 || field961 == 215 || field961 == 101 || field961 == 191 || field961 == 245) {
                method489();
                field961 = -1;
                return true;
            }
            if (field961 == 168) {
                int var253 = field959.method3046();
                boolean var254 = field959.method2928() == 1;
                String var255 = "";
                boolean var256 = false;
                if (var254) {
                    var255 = field959.method3113();
                    if (method163(var255)) {
                        var256 = true;
                    }
                }
                String var257 = field959.method3113();
                if (!var256) {
                    Statics.method206(var253, var255, var257);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 12) {
                method4442(true);
                field959.method3155();
                int var258 = field959.method3091();
                class98.method73(field959, var258);
                field961 = -1;
                return true;
            }
            if (field961 == 61) {
                int var259 = field959.method3091();
                field1029 = var259;
                this.method1098(false);
                method1000(var259);
                class85.method3932(field1029);
                for (int var260 = 0; var260 < 100; var260++) {
                    field1108[var260] = true;
                }
                field961 = -1;
                return true;
            }
            if (field961 == 197) {
                method214();
                field961 = -1;
                return false;
            }
            if (field961 == 38) {
                int var261 = field959.method3091();
                class64 var262 = (class64) class64.field775.method3294((long) var261);
                if (var262 != null) {
                    var262.method3333();
                }
                field1091[++field1016 - 1 & 0x1F] = var261 & 0x7FFF;
                field961 = -1;
                return true;
            }
            if (field961 == 244) {
                for (int var263 = 0; var263 < field1099.length; var263++) {
                    if (field1099[var263] != null) {
                        field1099[var263].field1238 = -1;
                    }
                }
                for (int var264 = 0; var264 < field952.length; var264++) {
                    if (field952[var264] != null) {
                        field952[var264].field1238 = -1;
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 2) {
                int var265 = field959.method2976();
                Statics.field878 = Statics.field299.method2747(var265);
                field961 = -1;
                return true;
            }
            if (field961 == 113) {
                int var266 = field959.method2966();
                int var267 = field959.method3103();
                int var268 = var266 >> 10 & 0x1F;
                int var269 = var266 >> 5 & 0x1F;
                int var270 = var266 & 0x1F;
                int var271 = (var270 << 3) + (var268 << 19) + (var269 << 11);
                class218 var272 = class218.method4538(var267);
                if (var272.field2649 != var271) {
                    var272.field2649 = var271;
                    method4218(var272);
                }
                field961 = -1;
                return true;
            }
            if (field961 == 81) {
                String var273 = field959.method3113();
                int var274 = field959.method3091();
                byte var275 = field959.method2998();
                boolean var276 = false;
                if (var275 == -128) {
                    var276 = true;
                }
                if (var276) {
                    if (Statics.field34 == 0) {
                        field961 = -1;
                        return true;
                    }
                    boolean var277 = false;
                    int var278;
                    for (var278 = 0; var278 < Statics.field34 && (!Statics.field468[var278].field911.equals(var273) || Statics.field468[var278].field912 != var274); var278++) {
                    }
                    if (var278 < Statics.field34) {
                        while (var278 < Statics.field34 - 1) {
                            Statics.field468[var278] = Statics.field468[var278 + 1];
                            var278++;
                        }
                        Statics.field34--;
                        Statics.field468[Statics.field34] = null;
                    }
                } else {
                    field959.method3113();
                    class77 var279 = new class77();
                    var279.field911 = var273;
                    var279.field913 = class269.method46(var279.field911, Statics.field423);
                    var279.field912 = var274;
                    var279.field910 = var275;
                    int var280;
                    for (var280 = Statics.field34 - 1; var280 >= 0; var280--) {
                        int var281 = Statics.field468[var280].field913.compareTo(var279.field913);
                        if (var281 == 0) {
                            Statics.field468[var280].field912 = var274;
                            Statics.field468[var280].field910 = var275;
                            if (var273.equals(Statics.field655.field896)) {
                                Statics.field805 = var275;
                            }
                            field1097 = field1088;
                            field961 = -1;
                            return true;
                        }
                        if (var281 < 0) {
                            break;
                        }
                    }
                    if (Statics.field34 >= Statics.field468.length) {
                        field961 = -1;
                        return true;
                    }
                    for (int var282 = Statics.field34 - 1; var282 > var280; var282--) {
                        Statics.field468[var282 + 1] = Statics.field468[var282];
                    }
                    if (Statics.field34 == 0) {
                        Statics.field468 = new class77[100];
                    }
                    Statics.field468[var280 + 1] = var279;
                    Statics.field34++;
                    if (var273.equals(Statics.field655.field896)) {
                        Statics.field805 = var275;
                    }
                }
                field1097 = field1088;
                field961 = -1;
                return true;
            }
            if (field961 == 160) {
                int var283 = field959.method2933();
                class218 var284 = class218.method4538(var283);
                for (int var285 = 0; var285 < var284.field2742.length; var285++) {
                    var284.field2742[var285] = -1;
                    var284.field2742[var285] = 0;
                }
                method4218(var284);
                field961 = -1;
                return true;
            }
            if (field961 == 182) {
                int var286 = field959.method2919();
                int var287 = field959.method2966();
                class218 var288 = class218.method4538(var286);
                if (var288 != null && var288.field2757 == 0) {
                    if (var287 > var288.field2750 - var288.field2640) {
                        var287 = var288.field2750 - var288.field2640;
                    }
                    if (var287 < 0) {
                        var287 = 0;
                    }
                    if (var288.field2646 != var287) {
                        var288.field2646 = var287;
                        method4218(var288);
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 227) {
                String var289 = field959.method3113();
                long var290 = (long) field959.method3091();
                long var292 = (long) field959.method2932();
                class232 var294 = (class232) class170.method2298(class232.method1018(), field959.method2928());
                long var295 = (var290 << 32) + var292;
                boolean var297 = false;
                for (int var298 = 0; var298 < 100; var298++) {
                    if (field1123[var298] == var295) {
                        var297 = true;
                        break;
                    }
                }
                if (method163(var289)) {
                    var297 = true;
                }
                if (!var297 && field1132 == 0) {
                    field1123[field1066] = var295;
                    field1066 = (field1066 + 1) % 100;
                    class181 var299 = field959;
                    String var303;
                    try {
                        int var300 = var299.method3046();
                        if (var300 > 32767) {
                            var300 = 32767;
                        }
                        byte[] var301 = new byte[var300];
                        var299.field2381 += Statics.field275.method2869(var299.field2376, var299.field2381, var301, 0, var300);
                        String var302 = class268.method3715(var301, 0, var300);
                        var303 = var302;
                    } catch (Exception var330) {
                        var303 = "Cabbage";
                    }
                    String var306 = class266.method4458(class272.method4539(var303));
                    byte var307;
                    if (var294.field3164) {
                        var307 = 7;
                    } else {
                        var307 = 3;
                    }
                    if (var294.field3159 == -1) {
                        Statics.method206(var307, var289, var306);
                    } else {
                        int var309 = var294.field3159;
                        String var310 = "<img=" + var309 + ">";
                        Statics.method206(var307, var310 + var289, var306);
                    }
                }
                field961 = -1;
                return true;
            }
            if (field961 == 155) {
                int var311 = field959.method2933();
                int var312 = field959.method3091();
                if (var311 < -70000) {
                    var312 += 32768;
                }
                class218 var313;
                if (var311 >= 0) {
                    var313 = class218.method4538(var311);
                } else {
                    var313 = null;
                }
                if (var313 != null) {
                    for (int var314 = 0; var314 < var313.field2742.length; var314++) {
                        var313.field2742[var314] = 0;
                        var313.field2617[var314] = 0;
                    }
                }
                class64.method25(var312);
                int var315 = field959.method3091();
                for (int var316 = 0; var316 < var315; var316++) {
                    int var317 = field959.method2955();
                    if (var317 == 255) {
                        var317 = field959.method3103();
                    }
                    int var318 = field959.method2965();
                    if (var313 != null && var316 < var313.field2742.length) {
                        var313.field2742[var316] = var318;
                        var313.field2617[var316] = var317;
                    }
                    class64.method475(var312, var316, var318 - 1, var317);
                }
                if (var313 != null) {
                    method4218(var313);
                }
                method5();
                field1091[++field1016 - 1 & 0x1F] = var312 & 0x7FFF;
                field961 = -1;
                return true;
            }
            if (field961 == 194) {
                int var319 = field959.method2956();
                String var320 = field959.method3113();
                int var321 = field959.method2955();
                if (var319 >= 1 && var319 <= 8) {
                    if (var320.equalsIgnoreCase("null")) {
                        var320 = null;
                    }
                    field922[var319 - 1] = var320;
                    field1020[var319 - 1] = var321 == 0;
                }
                field961 = -1;
                return true;
            }
            if (field961 == 70) {
                method5();
                int var322 = field959.method3103();
                int var323 = field959.method2955();
                int var324 = field959.method2957();
                field1039[var324] = var322;
                field1037[var324] = var323;
                field1038[var324] = 1;
                for (int var325 = 0; var325 < 98; var325++) {
                    if (var322 >= class224.field2809[var325]) {
                        field1038[var324] = var325 + 2;
                    }
                }
                field1093[++field1094 - 1 & 0x1F] = var324;
                field961 = -1;
                return true;
            }
            class154.method1592("" + field961 + class90.field1376 + field1060 + class90.field1376 + field966 + class90.field1376 + field1000, (Throwable) null);
            method214();
        } catch (IOException var339) {
            method2761();
        } catch (Exception var340) {
            String var328 = "" + field961 + class90.field1376 + field1060 + class90.field1376 + field966 + class90.field1376 + field1000 + class90.field1376 + (Statics.field376 + Statics.field655.field1261[0]) + class90.field1376 + (Statics.field847 + Statics.field655.field1262[0]) + class90.field1376;
            for (int var329 = 0; var329 < field1000 && var329 < 50; var329++) {
                var328 = var328 + field959.field2376[var329] + class90.field1376;
            }
            class154.method1592(var328, var340);
            method214();
        }
        return true;
    }

    @ObfuscatedName("at.gp(B)V")
    public static final void method489() {
        if (field961 == 245) {
            int var0 = field959.method2957();
            int var1 = (var0 >> 4 & 0x7) + Statics.field673;
            int var2 = (var0 & 0x7) + Statics.field792;
            int var3 = field959.method3091();
            int var4 = field959.method2956();
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = field978[var5];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method4429(Statics.field424, var1, var2, var7, var3, var5, var6, 0, -1);
            }
        } else if (field961 == 37) {
            int var8 = field959.method2928();
            int var9 = (var8 >> 4 & 0x7) + Statics.field673;
            int var10 = (var8 & 0x7) + Statics.field792;
            int var11 = field959.method3091();
            int var12 = field959.method2928();
            int var13 = field959.method3091();
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                int var14 = var9 * 128 + 64;
                int var15 = var10 * 128 + 64;
                class86 var16 = new class86(var11, Statics.field424, var14, var15, method995(var14, var15, Statics.field424) - var12, var13, field925);
                field1071.method3379(var16);
            }
        } else if (field961 == 14) {
            int var17 = field959.method2965();
            int var18 = field959.method2955();
            int var19 = (var18 >> 4 & 0x7) + Statics.field673;
            int var20 = (var18 & 0x7) + Statics.field792;
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                class195 var21 = field1131[Statics.field424][var19][var20];
                if (var21 != null) {
                    for (class96 var22 = (class96) var21.method3348(); var22 != null; var22 = (class96) var21.method3350()) {
                        if ((var17 & 0x7FFF) == var22.field1483) {
                            var22.method3333();
                            break;
                        }
                    }
                    if (var21.method3348() == null) {
                        field1131[Statics.field424][var19][var20] = null;
                    }
                    method466(var19, var20);
                }
            }
        } else if (field961 == 1) {
            int var23 = field959.method2928();
            int var24 = (var23 >> 4 & 0x7) + Statics.field673;
            int var25 = (var23 & 0x7) + Statics.field792;
            int var26 = field959.method3091();
            int var27 = field959.method3091();
            int var28 = field959.method3091();
            if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
                class195 var29 = field1131[Statics.field424][var24][var25];
                if (var29 != null) {
                    for (class96 var30 = (class96) var29.method3348(); var30 != null; var30 = (class96) var29.method3350()) {
                        if ((var26 & 0x7FFF) == var30.field1483 && var30.field1481 == var27) {
                            var30.field1481 = var28;
                            break;
                        }
                    }
                    method466(var24, var25);
                }
            }
        } else if (field961 == 101) {
            int var31 = field959.method2956();
            int var32 = var31 >> 2;
            int var33 = var31 & 0x3;
            int var34 = field978[var32];
            int var35 = field959.method2965();
            int var36 = field959.method2928();
            int var37 = (var36 >> 4 & 0x7) + Statics.field673;
            int var38 = (var36 & 0x7) + Statics.field792;
            if (var37 >= 0 && var38 >= 0 && var37 < 103 && var38 < 103) {
                if (var34 == 0) {
                    class144 var39 = Statics.field1335.method2534(Statics.field424, var37, var38);
                    if (var39 != null) {
                        int var40 = var39.field2121 >> 14 & 0x7FFF;
                        if (var32 == 2) {
                            var39.field2119 = new class102(var40, 2, var33 + 4, Statics.field424, var37, var38, var35, false, var39.field2119);
                            var39.field2120 = new class102(var40, 2, var33 + 1 & 0x3, Statics.field424, var37, var38, var35, false, var39.field2120);
                        } else {
                            var39.field2119 = new class102(var40, var32, var33, Statics.field424, var37, var38, var35, false, var39.field2119);
                        }
                    }
                }
                if (var34 == 1) {
                    class149 var41 = Statics.field1335.method2535(Statics.field424, var37, var38);
                    if (var41 != null) {
                        int var42 = var41.field2163 >> 14 & 0x7FFF;
                        if (var32 == 4 || var32 == 5) {
                            var41.field2159 = new class102(var42, 4, var33, Statics.field424, var37, var38, var35, false, var41.field2159);
                        } else if (var32 == 6) {
                            var41.field2159 = new class102(var42, 4, var33 + 4, Statics.field424, var37, var38, var35, false, var41.field2159);
                        } else if (var32 == 7) {
                            var41.field2159 = new class102(var42, 4, (var33 + 2 & 0x3) + 4, Statics.field424, var37, var38, var35, false, var41.field2159);
                        } else if (var32 == 8) {
                            var41.field2159 = new class102(var42, 4, var33 + 4, Statics.field424, var37, var38, var35, false, var41.field2159);
                            var41.field2162 = new class102(var42, 4, (var33 + 2 & 0x3) + 4, Statics.field424, var37, var38, var35, false, var41.field2162);
                        }
                    }
                }
                if (var34 == 2) {
                    class150 var43 = Statics.field1335.method2686(Statics.field424, var37, var38);
                    if (var32 == 11) {
                        var32 = 10;
                    }
                    if (var43 != null) {
                        var43.field2170 = new class102(var43.field2178 >> 14 & 0x7FFF, var32, var33, Statics.field424, var37, var38, var35, false, var43.field2170);
                    }
                }
                if (var34 == 3) {
                    class131 var44 = Statics.field1335.method2536(Statics.field424, var37, var38);
                    if (var44 != null) {
                        var44.field1857 = new class102(var44.field1850 >> 14 & 0x7FFF, 22, var33, Statics.field424, var37, var38, var35, false, var44.field1857);
                    }
                }
            }
        } else if (field961 == 191) {
            int var45 = field959.method2928();
            int var46 = (var45 >> 4 & 0x7) + Statics.field673;
            int var47 = (var45 & 0x7) + Statics.field792;
            int var48 = field959.method2955();
            int var49 = var48 >> 2;
            int var50 = var48 & 0x3;
            int var51 = field978[var49];
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                method4429(Statics.field424, var46, var47, var51, -1, var49, var50, 0, -1);
            }
        } else if (field961 == 215) {
            int var52 = field959.method3090();
            int var53 = field959.method2956();
            int var54 = (var53 >> 4 & 0x7) + Statics.field673;
            int var55 = (var53 & 0x7) + Statics.field792;
            int var56 = field959.method3090();
            if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                class96 var57 = new class96();
                var57.field1483 = var56;
                var57.field1481 = var52;
                if (field1131[Statics.field424][var54][var55] == null) {
                    field1131[Statics.field424][var54][var55] = new class195();
                }
                field1131[Statics.field424][var54][var55].method3379(var57);
                method466(var54, var55);
            }
        } else {
            if (field961 == 62) {
                int var58 = field959.method2928();
                int var59 = (var58 >> 4 & 0x7) + Statics.field673;
                int var60 = (var58 & 0x7) + Statics.field792;
                int var61 = field959.method3091();
                int var62 = field959.method2928();
                int var63 = var62 >> 4 & 0xF;
                int var64 = var62 & 0x7;
                int var65 = field959.method2928();
                if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                    int var66 = var63 + 1;
                    if (Statics.field655.field1261[0] >= var59 - var66 && Statics.field655.field1261[0] <= var59 + var66 && Statics.field655.field1262[0] >= var60 - var66 && Statics.field655.field1262[0] <= var60 + var66 && field1144 != 0 && var64 > 0 && field1145 < 50) {
                        field1176[field1145] = var61;
                        field1147[field1145] = var64;
                        field1148[field1145] = var65;
                        field1150[field1145] = null;
                        field1149[field1145] = (var59 << 16) + (var60 << 8) + var63;
                        field1145++;
                    }
                }
            }
            if (field961 == 224) {
                int var67 = field959.method2966();
                int var68 = field959.method2966();
                int var69 = field959.method2966();
                byte var70 = field959.method2998();
                int var71 = field959.method2928();
                int var72 = (var71 >> 4 & 0x7) + Statics.field673;
                int var73 = (var71 & 0x7) + Statics.field792;
                int var74 = field959.method3091();
                byte var75 = field959.method3056();
                int var76 = field959.method2928();
                int var77 = var76 >> 2;
                int var78 = var76 & 0x3;
                int var79 = field978[var77];
                byte var80 = field959.method2959();
                byte var81 = field959.method2960();
                class76 var82;
                if (field1129 == var74) {
                    var82 = Statics.field655;
                } else {
                    var82 = field1099[var74];
                }
                if (var82 != null) {
                    class257 var83 = class257.method247(var69);
                    int var84;
                    int var85;
                    if (var78 == 1 || var78 == 3) {
                        var84 = var83.field3443;
                        var85 = var83.field3476;
                    } else {
                        var84 = var83.field3476;
                        var85 = var83.field3443;
                    }
                    int var86 = (var84 >> 1) + var72;
                    int var87 = (var84 + 1 >> 1) + var72;
                    int var88 = (var85 >> 1) + var73;
                    int var89 = (var85 + 1 >> 1) + var73;
                    int[][] var90 = class62.field761[Statics.field424];
                    int var91 = var90[var86][var88] + var90[var87][var88] + var90[var86][var89] + var90[var87][var89] >> 2;
                    int var92 = (var72 << 7) + (var84 << 6);
                    int var93 = (var73 << 7) + (var85 << 6);
                    class135 var94 = var83.method4226(var77, var78, var90, var92, var91, var93);
                    if (var94 != null) {
                        method4429(Statics.field424, var72, var73, var79, -1, 0, 0, var68 + 1, var67 + 1);
                        var82.field884 = field925 + var68;
                        var82.field882 = field925 + var67;
                        var82.field893 = var94;
                        var82.field890 = var72 * 128 + var84 * 64;
                        var82.field892 = var73 * 128 + var85 * 64;
                        var82.field891 = var91;
                        if (var70 > var75) {
                            byte var95 = var70;
                            var70 = var75;
                            var75 = var95;
                        }
                        if (var80 > var81) {
                            byte var96 = var80;
                            var80 = var81;
                            var81 = var96;
                        }
                        var82.field904 = var70 + var72;
                        var82.field880 = var72 + var75;
                        var82.field895 = var73 + var80;
                        var82.field888 = var73 + var81;
                    }
                }
            }
            if (field961 == 3) {
                int var97 = field959.method2928();
                int var98 = (var97 >> 4 & 0x7) + Statics.field673;
                int var99 = (var97 & 0x7) + Statics.field792;
                int var100 = var98 + field959.method2998();
                int var101 = var99 + field959.method2998();
                int var102 = field959.method2931();
                int var103 = field959.method3091();
                int var104 = field959.method2928() * 4;
                int var105 = field959.method2928() * 4;
                int var106 = field959.method3091();
                int var107 = field959.method3091();
                int var108 = field959.method2928();
                int var109 = field959.method2928();
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                    int var110 = var98 * 128 + 64;
                    int var111 = var99 * 128 + 64;
                    int var112 = var100 * 128 + 64;
                    int var113 = var101 * 128 + 64;
                    class95 var114 = new class95(var103, Statics.field424, var110, var111, method995(var110, var111, Statics.field424) - var104, field925 + var106, field925 + var107, var108, var109, var102, var105);
                    var114.method1656(var112, var113, method995(var112, var113, Statics.field424) - var105, field925 + var106);
                    field1035.method3379(var114);
                }
            }
        }
    }

    @ObfuscatedName("jd.gl(IIIIIIIIIB)V")
    public static final void method4429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class78 var9 = null;
        for (class78 var10 = (class78) field1034.method3348(); var10 != null; var10 = (class78) field1034.method3350()) {
            if (var10.field1194 == arg0 && var10.field1188 == arg1 && var10.field1186 == arg2 && var10.field1187 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class78();
            var9.field1194 = arg0;
            var9.field1187 = arg3;
            var9.field1188 = arg1;
            var9.field1186 = arg2;
            method4394(var9);
            field1034.method3379(var9);
        }
        var9.field1193 = arg4;
        var9.field1195 = arg5;
        var9.field1197 = arg6;
        var9.field1196 = arg7;
        var9.field1191 = arg8;
    }

    @ObfuscatedName("bu.gn(I)V")
    public static final void method980() {
        for (class78 var0 = (class78) field1034.method3348(); var0 != null; var0 = (class78) field1034.method3350()) {
            if (var0.field1191 == -1) {
                var0.field1196 = 0;
                method4394(var0);
            } else {
                var0.method3333();
            }
        }
    }

    @ObfuscatedName("jh.gm(Lbe;B)V")
    public static final void method4394(class78 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1187 == 0) {
            var1 = Statics.field1335.method2537(arg0.field1194, arg0.field1188, arg0.field1186);
        }
        if (arg0.field1187 == 1) {
            var1 = Statics.field1335.method2538(arg0.field1194, arg0.field1188, arg0.field1186);
        }
        if (arg0.field1187 == 2) {
            var1 = Statics.field1335.method2539(arg0.field1194, arg0.field1188, arg0.field1186);
        }
        if (arg0.field1187 == 3) {
            var1 = Statics.field1335.method2540(arg0.field1194, arg0.field1188, arg0.field1186);
        }
        if (var1 != 0) {
            int var5 = Statics.field1335.method2541(arg0.field1194, arg0.field1188, arg0.field1186, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1190 = var2;
        arg0.field1192 = var3;
        arg0.field1203 = var4;
    }

    @ObfuscatedName("an.ho(IIIIIIIB)V")
    public static final void method636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field1109 && Statics.field424 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1335.method2537(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1335.method2538(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1335.method2539(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1335.method2540(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1335.method2541(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1335.method2527(arg0, arg2, arg3);
                class257 var15 = class257.method247(var12);
                if (var15.field3442 != 0) {
                    field975[arg0].method2838(arg2, arg3, var13, var14, var15.field3434);
                }
            }
            if (arg1 == 1) {
                Statics.field1335.method2530(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1335.method2531(arg0, arg2, arg3);
                class257 var16 = class257.method247(var12);
                if (var16.field3476 + arg2 > 103 || var16.field3476 + arg3 > 103 || var16.field3443 + arg2 > 103 || var16.field3443 + arg3 > 103) {
                    return;
                }
                if (var16.field3442 != 0) {
                    field975[arg0].method2820(arg2, arg3, var16.field3476, var16.field3443, var14, var16.field3434);
                }
            }
            if (arg1 == 3) {
                Statics.field1335.method2532(arg0, arg2, arg3);
                class257 var17 = class257.method247(var12);
                if (var17.field3442 == 1) {
                    field975[arg0].method2822(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field755[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class62.method577(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field1335, field975[arg0]);
    }

    @ObfuscatedName("aw.hf(IIB)V")
    public static final void method466(int arg0, int arg1) {
        class195 var2 = field1131[Statics.field424][arg0][arg1];
        if (var2 == null) {
            Statics.field1335.method2533(Statics.field424, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class96 var5 = null;
        for (class96 var6 = (class96) var2.method3348(); var6 != null; var6 = (class96) var2.method3350()) {
            class258 var7 = class258.method4627(var6.field1483);
            long var8 = (long) var7.field3499;
            if (var7.field3485 == 1) {
                var8 = (long) (var6.field1481 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1335.method2533(Statics.field424, arg0, arg1);
            return;
        }
        var2.method3343(var5);
        class96 var10 = null;
        class96 var11 = null;
        for (class96 var12 = (class96) var2.method3348(); var12 != null; var12 = (class96) var2.method3350()) {
            if (var5.field1483 != var12.field1483) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1483 != var12.field1483 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1335.method2524(Statics.field424, arg0, arg1, method995(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field424), var5, var13, var10, var11);
    }

    @ObfuscatedName("bg.hu(ZB)V")
    public static final void method718(boolean arg0) {
        field1026 = 0;
        field982 = 0;
        field959.method3152();
        int var1 = field959.method3157(8);
        if (var1 < field953) {
            for (int var2 = var1; var2 < field953; var2++) {
                field1027[++field1026 - 1] = field954[var2];
            }
        }
        if (var1 > field953) {
            throw new RuntimeException("");
        }
        field953 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field954[var3];
            class88 var5 = field952[var4];
            int var6 = field959.method3157(1);
            if (var6 == 0) {
                field954[++field953 - 1] = var4;
                var5.field1246 = field925;
            } else {
                int var7 = field959.method3157(2);
                if (var7 == 0) {
                    field954[++field953 - 1] = var4;
                    var5.field1246 = field925;
                    field956[++field982 - 1] = var4;
                } else if (var7 == 1) {
                    field954[++field953 - 1] = var4;
                    var5.field1246 = field925;
                    int var8 = field959.method3157(3);
                    var5.method1584(var8, (byte) 1);
                    int var9 = field959.method3157(1);
                    if (var9 == 1) {
                        field956[++field982 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field954[++field953 - 1] = var4;
                    var5.field1246 = field925;
                    int var10 = field959.method3157(3);
                    var5.method1584(var10, (byte) 2);
                    int var11 = field959.method3157(3);
                    var5.method1584(var11, (byte) 2);
                    int var12 = field959.method3157(1);
                    if (var12 == 1) {
                        field956[++field982 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field1027[++field1026 - 1] = var4;
                }
            }
        }
        Statics.method672(arg0);
        method150();
        for (int var13 = 0; var13 < field1026; var13++) {
            int var14 = field1027[var13];
            if (field925 != field952[var14].field1246) {
                field952[var14].field1364 = null;
                field952[var14] = null;
            }
        }
        if (field1000 != field959.field2381) {
            throw new RuntimeException(field959.field2381 + class90.field1376 + field1000);
        }
        for (int var15 = 0; var15 < field953; var15++) {
            if (field952[field954[var15]] == null) {
                throw new RuntimeException(var15 + class90.field1376 + field953);
            }
        }
    }

    @ObfuscatedName("f.hp(I)V")
    public static final void method150() {
        for (int var0 = 0; var0 < field982; var0++) {
            int var1 = field956[var0];
            class88 var2 = field952[var1];
            int var3 = field959.method2928();
            if ((var3 & 0x10) != 0) {
                int var4 = field959.method3091();
                int var5 = field959.method3090();
                int var6 = var2.field1221 - (var4 - Statics.field376 - Statics.field376) * 64;
                int var7 = var2.field1207 - (var5 - Statics.field847 - Statics.field847) * 64;
                if (var6 != 0 || var7 != 0) {
                    var2.field1206 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x40) != 0) {
                int var8 = field959.method2957();
                if (var8 > 0) {
                    for (int var9 = 0; var9 < var8; var9++) {
                        int var10 = -1;
                        int var11 = -1;
                        int var12 = -1;
                        int var13 = field959.method3046();
                        if (var13 == 32767) {
                            var13 = field959.method3046();
                            var11 = field959.method3046();
                            var10 = field959.method3046();
                            var12 = field959.method3046();
                        } else if (var13 == 32766) {
                            var13 = -1;
                        } else {
                            var11 = field959.method3046();
                        }
                        int var14 = field959.method3046();
                        var2.method1410(var13, var11, var10, var12, field925, var14);
                    }
                }
                int var15 = field959.method2955();
                if (var15 > 0) {
                    for (int var16 = 0; var16 < var15; var16++) {
                        int var17 = field959.method3046();
                        int var18 = field959.method3046();
                        if (var18 == 32767) {
                            var2.method1412(var17);
                        } else {
                            int var19 = field959.method3046();
                            int var20 = field959.method2956();
                            int var21 = var18 > 0 ? field959.method2957() : var20;
                            var2.method1411(var17, field925, var18, var19, var20, var21);
                        }
                    }
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field1364 = class260.method137(field959.method3090());
                var2.field1255 = var2.field1364.field3548;
                var2.field1230 = var2.field1364.field3571;
                var2.field1242 = var2.field1364.field3554;
                var2.field1215 = var2.field1364.field3555;
                var2.field1250 = var2.field1364.field3549;
                var2.field1212 = var2.field1364.field3557;
                var2.field1211 = var2.field1364.field3551;
                var2.field1228 = var2.field1364.field3552;
                var2.field1213 = var2.field1364.field3547;
            }
            if ((var3 & 0x2) != 0) {
                var2.field1234 = field959.method3091();
                int var22 = field959.method2919();
                var2.field1266 = var22 >> 16;
                var2.field1251 = (var22 & 0xFFFF) + field925;
                var2.field1210 = 0;
                var2.field1245 = 0;
                if (var2.field1251 > field925) {
                    var2.field1210 = -1;
                }
                if (var2.field1234 == 65535) {
                    var2.field1234 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field1219 = field959.method3113();
                var2.field1222 = 100;
            }
            if ((var3 & 0x8) != 0) {
                var2.field1232 = field959.method2966();
                if (var2.field1232 == 65535) {
                    var2.field1232 = -1;
                }
            }
            if ((var3 & 0x1) != 0) {
                int var23 = field959.method3091();
                if (var23 == 65535) {
                    var23 = -1;
                }
                int var24 = field959.method2957();
                if (var2.field1238 == var23 && var23 != -1) {
                    int var25 = class262.method1025(var23).field3610;
                    if (var25 == 1) {
                        var2.field1218 = 0;
                        var2.field1240 = 0;
                        var2.field1241 = var24;
                        var2.field1247 = 0;
                    }
                    if (var25 == 2) {
                        var2.field1247 = 0;
                    }
                } else if (var23 == -1 || var2.field1238 == -1 || class262.method1025(var23).field3612 >= class262.method1025(var2.field1238).field3612) {
                    var2.field1238 = var23;
                    var2.field1218 = 0;
                    var2.field1240 = 0;
                    var2.field1241 = var24;
                    var2.field1247 = 0;
                    var2.field1265 = var2.field1260;
                }
            }
        }
    }

    @ObfuscatedName("k.hq(I)V")
    public static void method13() {
        field929 = 0;
        field936 = false;
        field937[0] = class227.field3065;
        field1048[0] = "";
        field1045[0] = 1006;
        field1049[0] = false;
        field929 = 1;
    }

    @ObfuscatedName("fy.hn(IIIIB)V")
    public static final void method2800(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1106; var4++) {
            if (field1113[var4] + field1111[var4] > arg0 && field1111[var4] < arg0 + arg2 && field1112[var4] + field1025[var4] > arg1 && field1112[var4] < arg1 + arg3) {
                field1108[var4] = true;
            }
        }
    }

    @ObfuscatedName("by.hk(IIIIB)V")
    public static final void method931(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1106; var4++) {
            if (field1113[var4] + field1111[var4] > arg0 && field1111[var4] < arg0 + arg2 && field1112[var4] + field1025[var4] > arg1 && field1112[var4] < arg1 + arg3) {
                field1160[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hz(I)V")
    public final void method1375() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field929 - 1; var2++) {
                if (field1045[var2] < 1000 && field1045[var2 + 1] > 1000) {
                    String var3 = field1048[var2];
                    field1048[var2] = field1048[var2 + 1];
                    field1048[var2 + 1] = var3;
                    String var4 = field937[var2];
                    field937[var2] = field937[var2 + 1];
                    field937[var2 + 1] = var4;
                    int var5 = field1045[var2];
                    field1045[var2] = field1045[var2 + 1];
                    field1045[var2 + 1] = var5;
                    int var6 = field1043[var2];
                    field1043[var2] = field1043[var2 + 1];
                    field1043[var2 + 1] = var6;
                    int var7 = field1044[var2];
                    field1044[var2] = field1044[var2 + 1];
                    field1044[var2 + 1] = var7;
                    int var8 = field1046[var2];
                    field1046[var2] = field1046[var2 + 1];
                    field1046[var2 + 1] = var8;
                    boolean var9 = field1049[var2];
                    field1049[var2] = field1049[var2 + 1];
                    field1049[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field452 != null || field1118 != null) {
            return;
        }
        int var10 = class60.field735;
        if (field936) {
            if (var10 != 1 && (Statics.field646 || var10 != 4)) {
                int var11 = class60.field719;
                int var12 = class60.field720 * 752920449;
                if (var11 < Statics.field1358 - 10 || var11 > Statics.field1983 + Statics.field1358 + 10 || var12 < Statics.field814 - 10 || var12 > Statics.field814 + Statics.field715 + 10) {
                    field936 = false;
                    method2800(Statics.field1358, Statics.field814, Statics.field1983, Statics.field715);
                }
            }
            if (var10 == 1 || !Statics.field646 && var10 == 4) {
                int var13 = Statics.field1358;
                int var14 = Statics.field814;
                int var15 = Statics.field1983;
                int var16 = class60.field726;
                int var17 = class60.field727;
                int var18 = -1;
                for (int var19 = 0; var19 < field929; var19++) {
                    int var20 = (field929 - 1 - var19) * 15 + var14 + 31;
                    if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                        var18 = var19;
                    }
                }
                if (var18 != -1) {
                    method679(var18);
                }
                field936 = false;
                method2800(Statics.field1358, Statics.field814, Statics.field1983, Statics.field715);
            }
            return;
        }
        int var21 = field929 - 1;
        if ((var10 == 1 || !Statics.field646 && var10 == 4) && var21 >= 0) {
            int var23 = field1045[var21];
            if (var23 == 39 || var23 == 40 || var23 == 41 || var23 == 42 || var23 == 43 || var23 == 33 || var23 == 34 || var23 == 35 || var23 == 36 || var23 == 37 || var23 == 38 || var23 == 1005) {
                label209: {
                    int var24 = field1043[var21];
                    int var25 = field1044[var21];
                    class218 var26 = class218.method4538(var25);
                    if (!class219.method1011(method76(var26))) {
                        int var27 = method76(var26);
                        boolean var28 = (var27 >> 29 & 0x1) != 0;
                        if (!var28) {
                            break label209;
                        }
                    }
                    if (Statics.field452 != null && !field1105 && field929 > 0 && !this.method1096()) {
                        int var29 = field1017;
                        int var30 = field1018;
                        method1044(Statics.field234, var29, var30);
                        Statics.field234 = null;
                    }
                    field1105 = false;
                    field1080 = 0;
                    if (Statics.field452 != null) {
                        method4218(Statics.field452);
                    }
                    Statics.field452 = class218.method4538(var25);
                    field1127 = var24;
                    field1017 = class60.field726;
                    field1018 = class60.field727;
                    if (var21 >= 0) {
                        method1042(var21);
                    }
                    method4218(Statics.field452);
                    return;
                }
            }
        }
        if ((var10 == 1 || !Statics.field646 && var10 == 4) && this.method1096()) {
            var10 = 2;
        }
        if ((var10 == 1 || !Statics.field646 && var10 == 4) && field929 > 0) {
            method679(var21);
        }
        if (var10 == 2 && field929 > 0) {
            this.method1092(class60.field726, class60.field727);
        }
    }

    @ObfuscatedName("client.hg(I)Z")
    public final boolean method1096() {
        int var1 = field929 - 1;
        if (field929 > 2) {
            if (field1040 == 1 && !field1049[var1]) {
                return true;
            }
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field1045[var1];
                if (var4 >= 2000) {
                    var4 -= 2000;
                }
                if (var4 == 1007) {
                    var3 = true;
                } else {
                    var3 = false;
                }
            }
            if (var3) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("client.hi(III)V")
    public final void method1092(int arg0, int arg1) {
        int var3 = Statics.field407.method4454(class227.field2979);
        for (int var4 = 0; var4 < field929; var4++) {
            class265 var5 = Statics.field407;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field1048[var4].length() > 0) {
                var6 = field937[var4] + class227.field2986 + field1048[var4];
            } else {
                var6 = field937[var4];
            }
            int var7 = var5.method4454(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field929 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field1365) {
            var9 = Statics.field1365 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field3269) {
            var10 = Statics.field3269 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field1335.method2548(Statics.field424, arg0, arg1, false);
        field936 = true;
        Statics.field1358 = var9;
        Statics.field814 = var10;
        Statics.field1983 = var3;
        Statics.field715 = field929 * 15 + 22;
    }

    @ObfuscatedName("aa.ht(II)V")
    public static final void method679(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field1043[arg0];
        int var2 = field1044[arg0];
        int var3 = field1045[arg0];
        int var4 = field1046[arg0];
        String var5 = field937[arg0];
        String var6 = field1048[arg0];
        method1509(var1, var2, var3, var4, var5, var6, class60.field726, class60.field727);
    }

    @ObfuscatedName("bh.hc(Lca;III)V")
    public static final void method1044(class91 arg0, int arg1, int arg2) {
        method1509(arg0.field1393, arg0.field1391, arg0.field1395, arg0.field1394, arg0.field1398, arg0.field1398, arg1, arg2);
    }

    @ObfuscatedName("cu.hs(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1509(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 50) {
            class76 var8 = field1099[arg3];
            if (var8 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(253);
                field957.method2952(class51.field632[82] ? 1 : 0);
                field957.method2961(arg3);
            }
        }
        if (arg2 == 8) {
            class88 var9 = field952[arg3];
            if (var9 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(176);
                field957.method2963(field1059);
                field957.method2952(class51.field632[82] ? 1 : 0);
                field957.method2962(arg3);
                field957.method2971(Statics.field348);
            }
        }
        if (arg2 == 48) {
            class76 var10 = field1099[arg3];
            if (var10 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(162);
                field957.method2962(arg3);
                field957.method3029(class51.field632[82] ? 1 : 0);
            }
        }
        if (arg2 == 46) {
            class76 var11 = field1099[arg3];
            if (var11 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(186);
                field957.method2963(arg3);
                field957.method3029(class51.field632[82] ? 1 : 0);
            }
        }
        if (arg2 == 42) {
            field957.method3154(116);
            field957.method2916(arg1);
            field957.method2963(arg0);
            field957.method2963(arg3);
            field1157 = 0;
            Statics.field3111 = class218.method4538(arg1);
            field958 = arg0;
        }
        if (arg2 == 18) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            field1137 = arg0;
            field967 = arg1;
            field957.method3154(138);
            field957.method3029(class51.field632[82] ? 1 : 0);
            field957.method2914(arg3);
            field957.method2961(Statics.field847 + arg1);
            field957.method2962(Statics.field376 + arg0);
        }
        if (arg2 == 12) {
            class88 var12 = field952[arg3];
            if (var12 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(181);
                field957.method2914(arg3);
                field957.method2954(class51.field632[82] ? 1 : 0);
            }
        }
        if (arg2 == 28) {
            field957.method3154(216);
            field957.method2916(arg1);
            class218 var13 = class218.method4538(arg1);
            if (var13.field2738 != null && var13.field2738[0][0] == 5) {
                int var14 = var13.field2738[0][1];
                class213.field2585[var14] = 1 - class213.field2585[var14];
                method11(var14);
            }
        }
        if (arg2 == 40) {
            field957.method3154(143);
            field957.method2961(arg3);
            field957.method2971(arg1);
            field957.method2962(arg0);
            field1157 = 0;
            Statics.field3111 = class218.method4538(arg1);
            field958 = arg0;
        }
        if (arg2 == 49) {
            class76 var15 = field1099[arg3];
            if (var15 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(217);
                field957.method2961(arg3);
                field957.method2952(class51.field632[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field957.method3154(77);
            field957.method2971(arg1);
            field957.method2962(arg3);
            field957.method2914(arg0);
            field1157 = 0;
            Statics.field3111 = class218.method4538(arg1);
            field958 = arg0;
        }
        if (arg2 == 30 && field1067 == null) {
            method3(arg1, arg0);
            field1067 = Statics.method177(arg1, arg0);
            method4218(field1067);
        }
        if (arg2 == 16) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            field1137 = arg0;
            field967 = arg1;
            field957.method3154(163);
            field957.method2961(Statics.field2114);
            field957.method2961(Statics.field376 + arg0);
            field957.method2913(class51.field632[82] ? 1 : 0);
            field957.method2914(arg3);
            field957.method2961(Statics.field847 + arg1);
            field957.method2914(Statics.field450);
            field957.method2971(Statics.field262);
        }
        if (arg2 == 43) {
            field957.method3154(211);
            field957.method2963(arg3);
            field957.method2916(arg1);
            field957.method2961(arg0);
            field1157 = 0;
            Statics.field3111 = class218.method4538(arg1);
            field958 = arg0;
        }
        if (arg2 == 22) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            field1137 = arg0;
            field967 = arg1;
            field957.method3154(32);
            field957.method2961(arg3);
            field957.method2963(Statics.field847 + arg1);
            field957.method2914(Statics.field376 + arg0);
            field957.method2954(class51.field632[82] ? 1 : 0);
        }
        if (arg2 == 44) {
            class76 var16 = field1099[arg3];
            if (var16 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(56);
                field957.method3029(class51.field632[82] ? 1 : 0);
                field957.method2963(arg3);
            }
        }
        if (arg2 == 35) {
            field957.method3154(19);
            field957.method2916(arg1);
            field957.method2914(arg3);
            field957.method2962(arg0);
            field1157 = 0;
            Statics.field3111 = class218.method4538(arg1);
            field958 = arg0;
        }
        if (arg2 == 10) {
            class88 var17 = field952[arg3];
            if (var17 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(121);
                field957.method2961(arg3);
                field957.method2913(class51.field632[82] ? 1 : 0);
            }
        }
        if (arg2 == 51) {
            class76 var18 = field1099[arg3];
            if (var18 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(213);
                field957.method2913(class51.field632[82] ? 1 : 0);
                field957.method2962(arg3);
            }
        }
        if (arg2 == 13) {
            class88 var19 = field952[arg3];
            if (var19 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(148);
                field957.method2962(arg3);
                field957.method2954(class51.field632[82] ? 1 : 0);
            }
        }
        if (arg2 == 24) {
            class218 var20 = class218.method4538(arg1);
            boolean var21 = true;
            if (var20.field2714 > 0) {
                var21 = method468(var20);
            }
            if (var21) {
                field957.method3154(216);
                field957.method2916(arg1);
            }
        }
        if (arg2 == 34) {
            field957.method3154(65);
            field957.method2961(arg3);
            field957.method2961(arg0);
            field957.method2971(arg1);
            field1157 = 0;
            Statics.field3111 = class218.method4538(arg1);
            field958 = arg0;
        }
        if (arg2 == 45) {
            class76 var22 = field1099[arg3];
            if (var22 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(170);
                field957.method2952(class51.field632[82] ? 1 : 0);
                field957.method2963(arg3);
            }
        }
        if (arg2 == 6) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            field1137 = arg0;
            field967 = arg1;
            field957.method3154(220);
            field957.method2952(class51.field632[82] ? 1 : 0);
            field957.method2963(arg3 >> 14 & 0x7FFF);
            field957.method2963(Statics.field847 + arg1);
            field957.method2962(Statics.field376 + arg0);
        }
        if (arg2 == 19) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            field1137 = arg0;
            field967 = arg1;
            field957.method3154(237);
            field957.method3029(class51.field632[82] ? 1 : 0);
            field957.method2914(arg3);
            field957.method2962(Statics.field376 + arg0);
            field957.method2963(Statics.field847 + arg1);
        }
        if (arg2 == 41) {
            field957.method3154(128);
            field957.method2963(arg0);
            field957.method2914(arg3);
            field957.method2916(arg1);
            field1157 = 0;
            Statics.field3111 = class218.method4538(arg1);
            field958 = arg0;
        }
        if (arg2 == 1003) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            class88 var23 = field952[arg3];
            if (var23 != null) {
                class260 var24 = var23.field1364;
                if (var24.field3572 != null) {
                    var24 = var24.method4372();
                }
                if (var24 != null) {
                    field957.method3154(35);
                    field957.method2961(var24.field3546);
                }
            }
        }
        if (arg2 == 1) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            field1137 = arg0;
            field967 = arg1;
            field957.method3154(8);
            field957.method2914(arg3 >> 14 & 0x7FFF);
            field957.method2963(Statics.field2114);
            field957.method2914(Statics.field376 + arg0);
            field957.method2961(Statics.field847 + arg1);
            field957.method2963(Statics.field450);
            field957.method2952(class51.field632[82] ? 1 : 0);
            field957.method2972(Statics.field262);
        }
        if (arg2 == 36) {
            field957.method3154(129);
            field957.method2930(arg1);
            field957.method2914(arg3);
            field957.method2963(arg0);
            field1157 = 0;
            Statics.field3111 = class218.method4538(arg1);
            field958 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class218 var25 = Statics.method177(arg1, arg0);
            if (var25 != null) {
                method312(arg3, arg1, arg0, var25.field2612, arg5);
            }
        }
        if (arg2 == 14) {
            class76 var26 = field1099[arg3];
            if (var26 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(55);
                field957.method3029(class51.field632[82] ? 1 : 0);
                field957.method2963(Statics.field2114);
                field957.method2963(Statics.field450);
                field957.method2930(Statics.field262);
                field957.method2914(arg3);
            }
        }
        if (arg2 == 23) {
            if (field936) {
                Statics.field1335.method2639();
            } else {
                Statics.field1335.method2548(Statics.field424, arg0, arg1, true);
            }
        }
        if (arg2 == 38) {
            Statics.method3797();
            class218 var27 = class218.method4538(arg1);
            field1056 = 1;
            Statics.field450 = arg0;
            Statics.field262 = arg1;
            Statics.field2114 = arg3;
            method4218(var27);
            field1057 = class90.method2799(16748608) + class258.method4627(arg3).field3487 + class90.method2799(16777215);
            if (field1057 == null) {
                field1057 = "null";
            }
            return;
        }
        if (arg2 == 37) {
            field957.method3154(189);
            field957.method2971(arg1);
            field957.method2963(arg0);
            field957.method2962(arg3);
            field1157 = 0;
            Statics.field3111 = class218.method4538(arg1);
            field958 = arg0;
        }
        if (arg2 == 17) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            field1137 = arg0;
            field967 = arg1;
            field957.method3154(22);
            field957.method2952(class51.field632[82] ? 1 : 0);
            field957.method2963(arg3);
            field957.method2963(Statics.field847 + arg1);
            field957.method2972(Statics.field348);
            field957.method2962(field1059);
            field957.method2962(Statics.field376 + arg0);
        }
        if (arg2 == 9) {
            class88 var28 = field952[arg3];
            if (var28 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(61);
                field957.method2962(arg3);
                field957.method2913(class51.field632[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field957.method3154(108);
            field957.method2961(Statics.field2114);
            field957.method2914(arg3);
            field957.method2961(Statics.field450);
            field957.method2971(arg1);
            field957.method2972(Statics.field262);
            field957.method2914(arg0);
            field1157 = 0;
            Statics.field3111 = class218.method4538(arg1);
            field958 = arg0;
        }
        if (arg2 == 1001) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            field1137 = arg0;
            field967 = arg1;
            field957.method3154(31);
            field957.method2963(Statics.field376 + arg0);
            field957.method2954(class51.field632[82] ? 1 : 0);
            field957.method2962(Statics.field847 + arg1);
            field957.method2914(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 33) {
            field957.method3154(173);
            field957.method2963(arg3);
            field957.method2930(arg1);
            field957.method2914(arg0);
            field1157 = 0;
            Statics.field3111 = class218.method4538(arg1);
            field958 = arg0;
        }
        if (arg2 == 26) {
            method432();
        }
        if (arg2 == 58) {
            class218 var29 = Statics.method177(arg1, arg0);
            if (var29 != null) {
                field957.method3154(11);
                field957.method2962(field921);
                field957.method2962(field1059);
                field957.method2963(var29.field2612);
                field957.method2963(arg0);
                field957.method2916(Statics.field348);
                field957.method2916(arg1);
            }
        }
        if (arg2 == 1004) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            field957.method3154(96);
            field957.method2962(arg3);
        }
        if (arg2 == 32) {
            field957.method3154(161);
            field957.method2963(arg3);
            field957.method2963(arg0);
            field957.method2972(Statics.field348);
            field957.method2962(field1059);
            field957.method2916(arg1);
            field1157 = 0;
            Statics.field3111 = class218.method4538(arg1);
            field958 = arg0;
        }
        if (arg2 == 20) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            field1137 = arg0;
            field967 = arg1;
            field957.method3154(254);
            field957.method3029(class51.field632[82] ? 1 : 0);
            field957.method2963(Statics.field847 + arg1);
            field957.method2962(Statics.field376 + arg0);
            field957.method2914(arg3);
        }
        if (arg2 == 21) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            field1137 = arg0;
            field967 = arg1;
            field957.method3154(206);
            field957.method2961(Statics.field376 + arg0);
            field957.method2961(Statics.field847 + arg1);
            field957.method3029(class51.field632[82] ? 1 : 0);
            field957.method2914(arg3);
        }
        if (arg2 == 1005) {
            class218 var30 = class218.method4538(arg1);
            if (var30 == null || var30.field2617[arg0] < 100000) {
                field957.method3154(96);
                field957.method2962(arg3);
            } else {
                Statics.method206(27, "", var30.field2617[arg0] + " x " + class258.method4627(arg3).field3487);
            }
            field1157 = 0;
            Statics.field3111 = class218.method4538(arg1);
            field958 = arg0;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field30.method4942(arg2, arg3, new class214(arg0), new class214(arg1));
        }
        if (arg2 == 47) {
            class76 var31 = field1099[arg3];
            if (var31 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(29);
                field957.method3029(class51.field632[82] ? 1 : 0);
                field957.method2962(arg3);
            }
        }
        if (arg2 == 7) {
            class88 var32 = field952[arg3];
            if (var32 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(100);
                field957.method2962(Statics.field450);
                field957.method2962(Statics.field2114);
                field957.method2954(class51.field632[82] ? 1 : 0);
                field957.method2963(arg3);
                field957.method2916(Statics.field262);
            }
        }
        if (arg2 == 4) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            field1137 = arg0;
            field967 = arg1;
            field957.method3154(119);
            field957.method2963(Statics.field847 + arg1);
            field957.method2913(class51.field632[82] ? 1 : 0);
            field957.method2962(arg3 >> 14 & 0x7FFF);
            field957.method2963(Statics.field376 + arg0);
        }
        if (arg2 == 2) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            field1137 = arg0;
            field967 = arg1;
            field957.method3154(25);
            field957.method2961(field1059);
            field957.method2961(Statics.field847 + arg1);
            field957.method2914(Statics.field376 + arg0);
            field957.method2954(class51.field632[82] ? 1 : 0);
            field957.method2961(arg3 >> 14 & 0x7FFF);
            field957.method2930(Statics.field348);
        }
        if (arg2 == 5) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            field1137 = arg0;
            field967 = arg1;
            field957.method3154(238);
            field957.method2963(Statics.field847 + arg1);
            field957.method2963(arg3 >> 14 & 0x7FFF);
            field957.method2954(class51.field632[82] ? 1 : 0);
            field957.method2914(Statics.field376 + arg0);
        }
        if (arg2 == 11) {
            class88 var33 = field952[arg3];
            if (var33 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(37);
                field957.method2914(arg3);
                field957.method2913(class51.field632[82] ? 1 : 0);
            }
        }
        if (arg2 == 1002) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            field957.method3154(231);
            field957.method2914(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 25) {
            class218 var34 = Statics.method177(arg1, arg0);
            if (var34 != null) {
                Statics.method3797();
                int var35 = method76(var34);
                int var36 = var35 >> 11 & 0x3F;
                int var38 = var34.field2612;
                class218 var39 = Statics.method177(arg1, arg0);
                if (var39 != null && var39.field2715 != null) {
                    class71 var40 = new class71();
                    var40.field837 = var39;
                    var40.field850 = var39.field2715;
                    class85.method1409(var40);
                }
                field921 = var38;
                field970 = true;
                Statics.field348 = arg1;
                field1059 = arg0;
                Statics.field5 = var36;
                method4218(var39);
                field1056 = 0;
                field998 = method1030(var34);
                if (field998 == null) {
                    field998 = "Null";
                }
                if (var34.field2623) {
                    field1062 = var34.field2697 + class90.method2799(16777215);
                } else {
                    field1062 = class90.method2799(65280) + var34.field2653 + class90.method2799(16777215);
                }
            }
            return;
        }
        if (arg2 == 15) {
            class76 var41 = field1099[arg3];
            if (var41 != null) {
                field1030 = arg6;
                field1011 = arg7;
                field1096 = 2;
                field1012 = 0;
                field1137 = arg0;
                field967 = arg1;
                field957.method3154(125);
                field957.method2971(Statics.field348);
                field957.method2962(arg3);
                field957.method2961(field1059);
                field957.method2952(class51.field632[82] ? 1 : 0);
            }
        }
        if (arg2 == 3) {
            field1030 = arg6;
            field1011 = arg7;
            field1096 = 2;
            field1012 = 0;
            field1137 = arg0;
            field967 = arg1;
            field957.method3154(13);
            field957.method2962(arg3 >> 14 & 0x7FFF);
            field957.method2914(Statics.field376 + arg0);
            field957.method2963(Statics.field847 + arg1);
            field957.method2913(class51.field632[82] ? 1 : 0);
        }
        if (arg2 == 29) {
            field957.method3154(216);
            field957.method2916(arg1);
            class218 var42 = class218.method4538(arg1);
            if (var42.field2738 != null && var42.field2738[0][0] == 5) {
                int var43 = var42.field2738[0][1];
                if (class213.field2585[var43] != var42.field2735[0]) {
                    class213.field2585[var43] = var42.field2735[0];
                    method11(var43);
                }
            }
        }
        if (field1056 != 0) {
            field1056 = 0;
            method4218(class218.method4538(Statics.field262));
        }
        if (field970) {
            Statics.method3797();
        }
        if (Statics.field3111 != null && field1157 == 0) {
            method4218(Statics.field3111);
        }
    }

    @ObfuscatedName("bm.hh(ILjava/lang/String;I)V")
    public static void method997(int arg0, String arg1) {
        int var2 = class98.field1494;
        int[] var3 = class98.field1495;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class76 var6 = field1099[var3[var5]];
            if (var6 != null && Statics.field655 != var6 && var6.field896 != null && var6.field896.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field957.method3154(56);
                    field957.method3029(0);
                    field957.method2963(var3[var5]);
                } else if (arg0 == 4) {
                    field957.method3154(29);
                    field957.method3029(0);
                    field957.method2962(var3[var5]);
                } else if (arg0 == 6) {
                    field957.method3154(217);
                    field957.method2961(var3[var5]);
                    field957.method2952(0);
                } else if (arg0 == 7) {
                    field957.method3154(253);
                    field957.method2952(0);
                    field957.method2961(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            Statics.method206(4, "", class227.field2975 + arg1);
        }
    }

    @ObfuscatedName("y.hv(III)V")
    public static void method3(int arg0, int arg1) {
        field957.method3154(80);
        field957.method2962(arg1);
        field957.method2971(arg0);
    }

    @ObfuscatedName("ae.hy(IIIILjava/lang/String;I)V")
    public static void method312(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class218 var5 = Statics.method177(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2724 != null) {
            class71 var6 = new class71();
            var6.field837 = var5;
            var6.field840 = arg0;
            var6.field841 = arg4;
            var6.field850 = var5.field2724;
            class85.method1409(var6);
        }
        boolean var7 = true;
        if (var5.field2714 > 0) {
            var7 = method468(var5);
        }
        if (!var7 || !class219.method2729(method76(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field957.method3154(71);
            field957.method2916(arg1);
            field957.method2914(arg2);
            field957.method2914(arg3);
        }
        if (arg0 == 2) {
            field957.method3154(42);
            field957.method2916(arg1);
            field957.method2914(arg2);
            field957.method2914(arg3);
        }
        if (arg0 == 3) {
            field957.method3154(190);
            field957.method2916(arg1);
            field957.method2914(arg2);
            field957.method2914(arg3);
        }
        if (arg0 == 4) {
            field957.method3154(95);
            field957.method2916(arg1);
            field957.method2914(arg2);
            field957.method2914(arg3);
        }
        if (arg0 == 5) {
            field957.method3154(73);
            field957.method2916(arg1);
            field957.method2914(arg2);
            field957.method2914(arg3);
        }
        if (arg0 == 6) {
            field957.method3154(184);
            field957.method2916(arg1);
            field957.method2914(arg2);
            field957.method2914(arg3);
        }
        if (arg0 == 7) {
            field957.method3154(67);
            field957.method2916(arg1);
            field957.method2914(arg2);
            field957.method2914(arg3);
        }
        if (arg0 == 8) {
            field957.method3154(127);
            field957.method2916(arg1);
            field957.method2914(arg2);
            field957.method2914(arg3);
        }
        if (arg0 == 9) {
            field957.method3154(197);
            field957.method2916(arg1);
            field957.method2914(arg2);
            field957.method2914(arg3);
        }
        if (arg0 == 10) {
            field957.method3154(155);
            field957.method2916(arg1);
            field957.method2914(arg2);
            field957.method2914(arg3);
        }
    }

    @ObfuscatedName("fn.hr(Ljava/lang/String;Ljava/lang/String;IIIIS)V")
    public static final void method2862(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var12 = false;
        if (field936 || field929 >= 500) {
            return;
        }
        field937[field929] = arg0;
        field1048[field929] = arg1;
        field1045[field929] = arg2;
        field1046[field929] = arg3;
        field1043[field929] = arg4;
        field1044[field929] = arg5;
        field1049[field929] = var12;
        field929++;
    }

    @ObfuscatedName("k.hd(B)V")
    public static void method12() {
        for (int var0 = 0; var0 < field929; var0++) {
            int var1 = field1045[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field929 - 1) {
                    for (int var3 = var0; var3 < field929 - 1; var3++) {
                        field937[var3] = field937[var3 + 1];
                        field1048[var3] = field1048[var3 + 1];
                        field1045[var3] = field1045[var3 + 1];
                        field1046[var3] = field1046[var3 + 1];
                        field1043[var3] = field1043[var3 + 1];
                        field1044[var3] = field1044[var3 + 1];
                        field1049[var3] = field1049[var3 + 1];
                    }
                }
                field929--;
            }
        }
    }

    @ObfuscatedName("h.hw(Lin;IIIB)V")
    public static final void method62(class260 arg0, int arg1, int arg2, int arg3) {
        if (field929 >= 400) {
            return;
        }
        if (arg0.field3572 != null) {
            arg0 = arg0.method4372();
        }
        if (arg0 == null || !arg0.field3575 || arg0.field3560 && field955 != arg1) {
            return;
        }
        String var4 = arg0.field3542;
        if (arg0.field3564 != 0) {
            int var6 = arg0.field3564;
            int var7 = Statics.field655.field885;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class90.method2799(16711680);
            } else if (var8 < -6) {
                var9 = class90.method2799(16723968);
            } else if (var8 < -3) {
                var9 = class90.method2799(16740352);
            } else if (var8 < 0) {
                var9 = class90.method2799(16756736);
            } else if (var8 > 9) {
                var9 = class90.method2799(65280);
            } else if (var8 > 6) {
                var9 = class90.method2799(4259584);
            } else if (var8 > 3) {
                var9 = class90.method2799(8453888);
            } else if (var8 > 0) {
                var9 = class90.method2799(12648192);
            } else {
                var9 = class90.method2799(16776960);
            }
            var4 = var4 + var9 + " " + class90.field1377 + class227.field2982 + arg0.field3564 + class90.field1390;
        }
        if (arg0.field3560 && field1143) {
            method2862(class227.field2960, class90.method2799(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1056 == 1) {
            method2862(class227.field2844, field1057 + " " + class90.field1381 + " " + class90.method2799(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field970) {
            int var10 = arg0.field3560 && field1143 ? 2000 : 0;
            String[] var11 = arg0.field3562;
            if (field935) {
                var11 = method1565(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class227.field2898)) {
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
                        method2862(var11[var12], class90.method2799(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class227.field2898)) {
                        short var15 = 0;
                        if (field1090 != class93.field1411) {
                            if (field1090 == class93.field1418 || field1090 == class93.field1409 && arg0.field3564 > Statics.field655.field885) {
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
                            method2862(var11[var14], class90.method2799(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3560 || !field1143) {
                method2862(class227.field2960, class90.method2799(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field5 & 0x2) == 2) {
            method2862(field998, field1062 + " " + class90.field1381 + " " + class90.method2799(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("eg.hx(Lbk;IIII)V")
    public static final void method2697(class76 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field655 == arg0 || field929 >= 400) {
            return;
        }
        String var9;
        if (arg0.field886 == 0) {
            String var4 = arg0.field898[0] + arg0.field896 + arg0.field898[1];
            int var5 = arg0.field885;
            int var6 = Statics.field655.field885;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class90.method2799(16711680);
            } else if (var7 < -6) {
                var8 = class90.method2799(16723968);
            } else if (var7 < -3) {
                var8 = class90.method2799(16740352);
            } else if (var7 < 0) {
                var8 = class90.method2799(16756736);
            } else if (var7 > 9) {
                var8 = class90.method2799(65280);
            } else if (var7 > 6) {
                var8 = class90.method2799(4259584);
            } else if (var7 > 3) {
                var8 = class90.method2799(8453888);
            } else if (var7 > 0) {
                var8 = class90.method2799(12648192);
            } else {
                var8 = class90.method2799(16776960);
            }
            var9 = var4 + var8 + " " + class90.field1377 + class227.field2982 + arg0.field885 + class90.field1390 + arg0.field898[2];
        } else {
            var9 = arg0.field898[0] + arg0.field896 + arg0.field898[1] + " " + class90.field1377 + class227.field2983 + arg0.field886 + class90.field1390 + arg0.field898[2];
        }
        if (field1056 == 1) {
            method2862(class227.field2844, field1057 + " " + class90.field1381 + " " + class90.method2799(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field970) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field922[var10] != null) {
                    short var11 = 0;
                    if (field922[var10].equalsIgnoreCase(class227.field2898)) {
                        if (field941 == class93.field1411) {
                            continue;
                        }
                        if (field941 == class93.field1418 || field941 == class93.field1409 && arg0.field885 > Statics.field655.field885) {
                            var11 = 2000;
                        }
                        if (Statics.field655.field905 != 0 && arg0.field905 != 0) {
                            if (Statics.field655.field905 == arg0.field905) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field1020[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field1028[var10] + var11;
                    method2862(field922[var10], class90.method2799(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field5 & 0x8) == 8) {
            method2862(field998, field1062 + " " + class90.field1381 + " " + class90.method2799(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field929; var14++) {
            if (field1045[var14] == 23) {
                field1048[var14] = class90.method2799(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ax.hl(IIIIIIIII)V")
    public static final void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class218.method48(arg0)) {
            Statics.field907 = null;
            method195(Statics.field1482[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field907 != null) {
                method195(Statics.field907, -1412584499, arg1, arg2, arg3, arg4, Statics.field296, Statics.field1400, arg7);
                Statics.field907 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1108[var8] = true;
            }
        } else {
            field1108[arg7] = true;
        }
    }

    @ObfuscatedName("ag.he([Lhg;IIIIIIIIB)V")
    public static final void method195(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class283.method4641(arg2, arg3, arg4, arg5);
        class138.method2428();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class218 var10 = arg0[var9];
            if (var10 != null && (var10.field2643 == arg1 || arg1 == -1412584499 && field1118 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1111[field1106] = var10.field2637 + arg6;
                    field1112[field1106] = var10.field2638 + arg7;
                    field1113[field1106] = var10.field2639;
                    field1025[field1106] = var10.field2640;
                    var11 = ++field1106 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2755 = var11;
                var10.field2692 = field925;
                if (!var10.field2623 || !method492(var10)) {
                    if (var10.field2714 > 0) {
                        int var12 = var10.field2714;
                        if (var12 == 324) {
                            if (field1177 == -1) {
                                field1177 = var10.field2659;
                                field1178 = var10.field2660;
                            }
                            if (field1036.field2596) {
                                var10.field2659 = field1177;
                            } else {
                                var10.field2659 = field1178;
                            }
                        } else if (var12 == 325) {
                            if (field1177 == -1) {
                                field1177 = var10.field2659;
                                field1178 = var10.field2660;
                            }
                            if (field1036.field2596) {
                                var10.field2659 = field1178;
                            } else {
                                var10.field2659 = field1177;
                            }
                        } else if (var12 == 327) {
                            var10.field2675 = 150;
                            var10.field2705 = (int) (Math.sin((double) field925 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2667 = 5;
                            var10.field2683 = 0;
                        } else if (var12 == 328) {
                            var10.field2675 = 150;
                            var10.field2705 = (int) (Math.sin((double) field925 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2667 = 5;
                            var10.field2683 = 1;
                        }
                    }
                    int var13 = var10.field2637 + arg6;
                    int var14 = var10.field2638 + arg7;
                    int var15 = var10.field2655;
                    if (field1118 == var10) {
                        if (arg1 != -1412584499 && !var10.field2702) {
                            Statics.field907 = arg0;
                            Statics.field296 = arg6;
                            Statics.field1400 = arg7;
                            continue;
                        }
                        if (field1087 && field1081) {
                            int var16 = class60.field719;
                            int var17 = class60.field720 * 752920449;
                            int var18 = var16 - field1013;
                            int var19 = var17 - field1079;
                            if (var18 < field1082) {
                                var18 = field1082;
                            }
                            if (var10.field2639 + var18 > field1082 + field1077.field2639) {
                                var18 = field1082 + field1077.field2639 - var10.field2639;
                            }
                            if (var19 < field1083) {
                                var19 = field1083;
                            }
                            if (var10.field2640 + var19 > field1083 + field1077.field2640) {
                                var19 = field1083 + field1077.field2640 - var10.field2640;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2702) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2757 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2757 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2639 + var13;
                        int var27 = var10.field2640 + var14;
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
                        int var30 = var10.field2639 + var13;
                        int var31 = var10.field2640 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2623 || var20 < var22 && var21 < var23) {
                        if (var10.field2714 != 0) {
                            if (var10.field2714 == 1336) {
                                if (field931) {
                                    var14 += 15;
                                    Statics.field3847.method4461("Fps:" + field678, var10.field2639 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field1109) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field1109) {
                                        var34 = 16711680;
                                    }
                                    Statics.field3847.method4461("Mem:" + var33 + "k", var10.field2639 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2714 == 1337) {
                                field1052 = var13;
                                field1053 = var14;
                                method981(var13, var14, var10.field2639, var10.field2640);
                                field1108[var10.field2755] = true;
                                class283.method4641(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2714 == 1338) {
                                method465();
                                class212 var35 = var10.method3726(false);
                                if (var35 != null) {
                                    class283.method4641(var13, var14, var35.field2578 + var13, var35.field2579 + var14);
                                    if (field1139 == 2 || field1139 == 5) {
                                        class283.method4664(var13, var14, 0, var35.field2582, var35.field2580);
                                    } else {
                                        int var36 = field987 & 0x7FF;
                                        int var37 = Statics.field655.field1221 / 32 + 48;
                                        int var38 = 464 - Statics.field655.field1207 / 32;
                                        Statics.field668.method4850(var13, var14, var35.field2578, var35.field2579, var37, var38, var36, 256, var35.field2582, var35.field2580);
                                        for (int var39 = 0; var39 < field1133; var39++) {
                                            int var40 = field1134[var39] * 4 + 2 - Statics.field655.field1221 / 32;
                                            int var41 = field1135[var39] * 4 + 2 - Statics.field655.field1207 / 32;
                                            method4608(var13, var14, var40, var41, field1076[var39], var35);
                                        }
                                        int var42 = 0;
                                        while (true) {
                                            if (var42 >= 104) {
                                                for (int var47 = 0; var47 < field953; var47++) {
                                                    class88 var48 = field952[field954[var47]];
                                                    if (var48 != null && var48.method1057()) {
                                                        class260 var49 = var48.field1364;
                                                        if (var49 != null && var49.field3572 != null) {
                                                            var49 = var49.method4372();
                                                        }
                                                        if (var49 != null && var49.field3567 && var49.field3575) {
                                                            int var50 = var48.field1221 / 32 - Statics.field655.field1221 / 32;
                                                            int var51 = var48.field1207 / 32 - Statics.field655.field1207 / 32;
                                                            method4608(var13, var14, var50, var51, Statics.field582[1], var35);
                                                        }
                                                    }
                                                }
                                                int var52 = class98.field1494;
                                                int[] var53 = class98.field1495;
                                                for (int var54 = 0; var54 < var52; var54++) {
                                                    class76 var55 = field1099[var53[var54]];
                                                    if (var55 != null && var55.method1057() && !var55.field900 && Statics.field655 != var55) {
                                                        int var56 = var55.field1221 / 32 - Statics.field655.field1221 / 32;
                                                        int var57 = var55.field1207 / 32 - Statics.field655.field1207 / 32;
                                                        boolean var58 = false;
                                                        if (method44(var55.field896, true)) {
                                                            var58 = true;
                                                        }
                                                        boolean var59 = false;
                                                        for (int var60 = 0; var60 < Statics.field34; var60++) {
                                                            if (var55.field896.equals(Statics.field468[var60].field911)) {
                                                                var59 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var61 = false;
                                                        if (Statics.field655.field905 != 0 && var55.field905 != 0 && Statics.field655.field905 == var55.field905) {
                                                            var61 = true;
                                                        }
                                                        if (var58) {
                                                            method4608(var13, var14, var56, var57, Statics.field582[3], var35);
                                                        } else if (var61) {
                                                            method4608(var13, var14, var56, var57, Statics.field582[4], var35);
                                                        } else if (var59) {
                                                            method4608(var13, var14, var56, var57, Statics.field582[5], var35);
                                                        } else {
                                                            method4608(var13, var14, var56, var57, Statics.field582[2], var35);
                                                        }
                                                    }
                                                }
                                                if (field1104 != 0 && field925 % 20 < 10) {
                                                    if (field1104 == 1 && field934 >= 0 && field934 < field952.length) {
                                                        class88 var62 = field952[field934];
                                                        if (var62 != null) {
                                                            int var63 = var62.field1221 / 32 - Statics.field655.field1221 / 32;
                                                            int var64 = var62.field1207 / 32 - Statics.field655.field1207 / 32;
                                                            method3794(var13, var14, var63, var64, Statics.field1524[1], var35);
                                                        }
                                                    }
                                                    if (field1104 == 2) {
                                                        int var65 = field933 * 4 - Statics.field376 * 4 + 2 - Statics.field655.field1221 / 32;
                                                        int var66 = field926 * 4 - Statics.field847 * 4 + 2 - Statics.field655.field1207 / 32;
                                                        method3794(var13, var14, var65, var66, Statics.field1524[1], var35);
                                                    }
                                                    if (field1104 == 10 && field997 >= 0 && field997 < field1099.length) {
                                                        class76 var67 = field1099[field997];
                                                        if (var67 != null) {
                                                            int var68 = var67.field1221 / 32 - Statics.field655.field1221 / 32;
                                                            int var69 = var67.field1207 / 32 - Statics.field655.field1207 / 32;
                                                            method3794(var13, var14, var68, var69, Statics.field1524[1], var35);
                                                        }
                                                    }
                                                }
                                                if (field1137 != 0) {
                                                    int var70 = field1137 * 4 + 2 - Statics.field655.field1221 / 32;
                                                    int var71 = field967 * 4 + 2 - Statics.field655.field1207 / 32;
                                                    method4608(var13, var14, var70, var71, Statics.field1524[0], var35);
                                                }
                                                if (!Statics.field655.field900) {
                                                    class283.method4649(var35.field2578 / 2 + var13 - 1, var35.field2579 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var43 = 0; var43 < 104; var43++) {
                                                class195 var44 = field1131[Statics.field424][var42][var43];
                                                if (var44 != null) {
                                                    int var45 = var42 * 4 + 2 - Statics.field655.field1221 / 32;
                                                    int var46 = var43 * 4 + 2 - Statics.field655.field1207 / 32;
                                                    method4608(var13, var14, var45, var46, Statics.field582[0], var35);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                    field1160[var11] = true;
                                }
                                class283.method4641(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2714 == 1339) {
                                method3813(var10, var13, var14, var11);
                                class283.method4641(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2714 == 1400) {
                                Statics.field30.method4901(var13, var14, var10.field2639, var10.field2640, field925);
                            }
                            if (var10.field2714 == 1401) {
                                Statics.field30.method4908(var13, var14, var10.field2639, var10.field2640);
                            }
                        }
                        if (var10.field2757 == 0) {
                            if (!var10.field2623 && method492(var10) && Statics.field570 != var10) {
                                continue;
                            }
                            if (!var10.field2623) {
                                if (var10.field2646 > var10.field2750 - var10.field2640) {
                                    var10.field2646 = var10.field2750 - var10.field2640;
                                }
                                if (var10.field2646 < 0) {
                                    var10.field2646 = 0;
                                }
                            }
                            method195(arg0, var10.field2624, var20, var21, var22, var23, var13 - var10.field2674, var14 - var10.field2646, var11);
                            if (var10.field2615 != null) {
                                method195(var10.field2615, var10.field2624, var20, var21, var22, var23, var13 - var10.field2674, var14 - var10.field2646, var11);
                            }
                            class69 var72 = (class69) field1180.method3294((long) var10.field2624);
                            if (var72 != null) {
                                method321(var72.field822, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class283.method4641(arg2, arg3, arg4, arg5);
                            class138.method2428();
                        }
                        if (field1117 || field1051[var11] || field1115 > 1) {
                            if (var10.field2757 == 0 && !var10.field2623 && var10.field2750 > var10.field2640) {
                                int var73 = var10.field2639 + var13;
                                int var74 = var10.field2646;
                                int var75 = var10.field2640;
                                int var76 = var10.field2750;
                                Statics.field402[0].method4734(var73, var14);
                                Statics.field402[1].method4734(var73, var14 + var75 - 16);
                                class283.method4649(var73, var14 + 16, 16, var75 - 32, field980);
                                int var77 = (var75 - 32) * var75 / var76;
                                if (var77 < 8) {
                                    var77 = 8;
                                }
                                int var78 = (var75 - 32 - var77) * var74 / (var76 - var75);
                                class283.method4649(var73, var14 + 16 + var78, 16, var77, field981);
                                class283.method4660(var73, var14 + 16 + var78, var77, field983);
                                class283.method4660(var73 + 1, var14 + 16 + var78, var77, field983);
                                class283.method4658(var73, var14 + 16 + var78, 16, field983);
                                class283.method4658(var73, var14 + 17 + var78, 16, field983);
                                class283.method4660(var73 + 15, var14 + 16 + var78, var77, field971);
                                class283.method4660(var73 + 14, var14 + 17 + var78, var77 - 1, field971);
                                class283.method4658(var73, var14 + 15 + var78 + var77, 16, field971);
                                class283.method4658(var73 + 1, var14 + 14 + var78 + var77, 15, field971);
                            }
                            if (var10.field2757 != 1) {
                                if (var10.field2757 == 2) {
                                    int var79 = 0;
                                    for (int var80 = 0; var80 < var10.field2636; var80++) {
                                        for (int var81 = 0; var81 < var10.field2635; var81++) {
                                            int var82 = (var10.field2690 + 32) * var81 + var13;
                                            int var83 = (var10.field2691 + 32) * var80 + var14;
                                            if (var79 < 20) {
                                                var82 += var10.field2671[var79];
                                                var83 += var10.field2693[var79];
                                            }
                                            if (var10.field2742[var79] > 0) {
                                                boolean var84 = false;
                                                boolean var85 = false;
                                                int var86 = var10.field2742[var79] - 1;
                                                if (var82 + 32 > arg2 && var82 < arg4 && var83 + 32 > arg3 && var83 < arg5 || Statics.field452 == var10 && field1127 == var79) {
                                                    class287 var87;
                                                    if (field1056 == 1 && Statics.field450 == var79 && Statics.field262 == var10.field2624) {
                                                        var87 = class258.method2777(var86, var10.field2617[var79], 2, 0, 2, false);
                                                    } else {
                                                        var87 = class258.method2777(var86, var10.field2617[var79], 1, 3153952, 2, false);
                                                    }
                                                    if (var87 == null) {
                                                        method4218(var10);
                                                    } else if (Statics.field452 == var10 && field1127 == var79) {
                                                        int var88 = class60.field719 - field1017;
                                                        int var89 = class60.field720 * 752920449 - field1018;
                                                        if (var88 < 5 && var88 > -5) {
                                                            var88 = 0;
                                                        }
                                                        if (var89 < 5 && var89 > -5) {
                                                            var89 = 0;
                                                        }
                                                        if (field1080 < 5) {
                                                            var88 = 0;
                                                            var89 = 0;
                                                        }
                                                        var87.method4772(var82 + var88, var83 + var89, 128);
                                                        if (arg1 != -1) {
                                                            class218 var90 = arg0[arg1 & 0xFFFF];
                                                            if (var83 + var89 < class283.field3742 && var90.field2646 > 0) {
                                                                int var91 = field1021 * (class283.field3742 - var83 - var89) / 3;
                                                                if (var91 > field1021 * 10) {
                                                                    var91 = field1021 * 10;
                                                                }
                                                                if (var91 > var90.field2646) {
                                                                    var91 = var90.field2646;
                                                                }
                                                                var90.field2646 -= var91;
                                                                field1018 += var91;
                                                                method4218(var90);
                                                            }
                                                            if (var83 + var89 + 32 > class283.field3745 && var90.field2646 < var90.field2750 - var90.field2640) {
                                                                int var92 = field1021 * (var83 + var89 + 32 - class283.field3745) / 3;
                                                                if (var92 > field1021 * 10) {
                                                                    var92 = field1021 * 10;
                                                                }
                                                                if (var92 > var90.field2750 - var90.field2640 - var90.field2646) {
                                                                    var92 = var90.field2750 - var90.field2640 - var90.field2646;
                                                                }
                                                                var90.field2646 += var92;
                                                                field1018 -= var92;
                                                                method4218(var90);
                                                            }
                                                        }
                                                    } else if (Statics.field3111 == var10 && field958 == var79) {
                                                        var87.method4772(var82, var83, 128);
                                                    } else {
                                                        var87.method4809(var82, var83);
                                                    }
                                                }
                                            } else if (var10.field2710 != null && var79 < 20) {
                                                class287 var93 = var10.method3724(var79);
                                                if (var93 != null) {
                                                    var93.method4809(var82, var83);
                                                } else if (class218.field2719) {
                                                    method4218(var10);
                                                }
                                            }
                                            var79++;
                                        }
                                    }
                                } else if (var10.field2757 == 3) {
                                    int var94;
                                    if (Statics.method1039(var10)) {
                                        var94 = var10.field2650;
                                        if (Statics.field570 == var10 && var10.field2632 != 0) {
                                            var94 = var10.field2632;
                                        }
                                    } else {
                                        var94 = var10.field2649;
                                        if (Statics.field570 == var10 && var10.field2651 != 0) {
                                            var94 = var10.field2651;
                                        }
                                    }
                                    if (var10.field2656) {
                                        switch(var10.field2654.field3755) {
                                            case 1:
                                                class283.method4650(var13, var14, var10.field2639, var10.field2640, var10.field2649, var10.field2650, 256 - (var10.field2655 & 0xFF), 256 - (var10.field2645 & 0xFF));
                                                break;
                                            case 2:
                                                class283.method4651(var13, var14, var10.field2639, var10.field2640, var10.field2649, var10.field2650, 256 - (var10.field2655 & 0xFF), 256 - (var10.field2645 & 0xFF));
                                                break;
                                            case 3:
                                                class283.method4671(var13, var14, var10.field2639, var10.field2640, var10.field2649, var10.field2650, 256 - (var10.field2655 & 0xFF), 256 - (var10.field2645 & 0xFF));
                                                break;
                                            case 4:
                                                class283.method4687(var13, var14, var10.field2639, var10.field2640, var10.field2649, var10.field2650, 256 - (var10.field2655 & 0xFF), 256 - (var10.field2645 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class283.method4649(var13, var14, var10.field2639, var10.field2640, var94);
                                                } else {
                                                    class283.method4648(var13, var14, var10.field2639, var10.field2640, var94, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class283.method4656(var13, var14, var10.field2639, var10.field2640, var94);
                                    } else {
                                        class283.method4657(var13, var14, var10.field2639, var10.field2640, var94, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2757 == 4) {
                                    class265 var95 = var10.method3751();
                                    if (var95 != null) {
                                        String var96 = var10.field2684;
                                        int var97;
                                        if (Statics.method1039(var10)) {
                                            var97 = var10.field2650;
                                            if (Statics.field570 == var10 && var10.field2632 != 0) {
                                                var97 = var10.field2632;
                                            }
                                            if (var10.field2685.length() > 0) {
                                                var96 = var10.field2685;
                                            }
                                        } else {
                                            var97 = var10.field2649;
                                            if (Statics.field570 == var10 && var10.field2651 != 0) {
                                                var97 = var10.field2651;
                                            }
                                        }
                                        if (var10.field2623 && var10.field2612 != -1) {
                                            class258 var98 = class258.method4627(var10.field2612);
                                            var96 = var98.field3487;
                                            if (var96 == null) {
                                                var96 = "null";
                                            }
                                            if ((var98.field3485 == 1 || var10.field2745 != 1) && var10.field2745 != -1) {
                                                var96 = class90.method2799(16748608) + var96 + class90.field1379 + " " + 'x' + method2510(var10.field2745);
                                            }
                                        }
                                        if (field1067 == var10) {
                                            class227 var10000 = (class227) null;
                                            var96 = class227.field2984;
                                            var97 = var10.field2649;
                                        }
                                        if (!var10.field2623) {
                                            var96 = method476(var96, var10);
                                        }
                                        var95.method4463(var96, var13, var14, var10.field2639, var10.field2640, var97, var10.field2689 ? 0 : -1, var10.field2744, var10.field2758, var10.field2752);
                                    } else if (class218.field2719) {
                                        method4218(var10);
                                    }
                                } else if (var10.field2757 == 5) {
                                    if (var10.field2623) {
                                        class287 var100;
                                        if (var10.field2612 == -1) {
                                            var100 = var10.method3722(false);
                                        } else {
                                            var100 = class258.method2777(var10.field2612, var10.field2745, var10.field2663, var10.field2756, var10.field2682, false);
                                        }
                                        if (var100 != null) {
                                            int var101 = var100.field3764;
                                            int var102 = var100.field3774;
                                            if (var10.field2662) {
                                                class283.method4642(var13, var14, var10.field2639 + var13, var10.field2640 + var14);
                                                int var103 = (var10.field2639 + (var101 - 1)) / var101;
                                                int var104 = (var10.field2640 + (var102 - 1)) / var102;
                                                for (int var105 = 0; var105 < var103; var105++) {
                                                    for (int var106 = 0; var106 < var104; var106++) {
                                                        if (var10.field2629 != 0) {
                                                            var100.method4779(var101 / 2 + var101 * var105 + var13, var102 / 2 + var102 * var106 + var14, var10.field2629, 4096);
                                                        } else if (var15 == 0) {
                                                            var100.method4809(var101 * var105 + var13, var102 * var106 + var14);
                                                        } else {
                                                            var100.method4772(var101 * var105 + var13, var102 * var106 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class283.method4641(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var107 = var10.field2639 * 4096 / var101;
                                                if (var10.field2629 != 0) {
                                                    var100.method4779(var10.field2639 / 2 + var13, var10.field2640 / 2 + var14, var10.field2629, var107);
                                                } else if (var15 != 0) {
                                                    var100.method4774(var13, var14, var10.field2639, var10.field2640, 256 - (var15 & 0xFF));
                                                } else if (var10.field2639 == var101 && var10.field2640 == var102) {
                                                    var100.method4809(var13, var14);
                                                } else {
                                                    var100.method4768(var13, var14, var10.field2639, var10.field2640);
                                                }
                                            }
                                        } else if (class218.field2719) {
                                            method4218(var10);
                                        }
                                    } else {
                                        class287 var99 = var10.method3722(Statics.method1039(var10));
                                        if (var99 != null) {
                                            var99.method4809(var13, var14);
                                        } else if (class218.field2719) {
                                            method4218(var10);
                                        }
                                    }
                                } else if (var10.field2757 == 6) {
                                    boolean var108 = Statics.method1039(var10);
                                    int var109;
                                    if (var108) {
                                        var109 = var10.field2621;
                                    } else {
                                        var109 = var10.field2634;
                                    }
                                    class135 var110 = null;
                                    int var111 = 0;
                                    if (var10.field2612 != -1) {
                                        class258 var112 = class258.method4627(var10.field2612);
                                        if (var112 != null) {
                                            class258 var113 = var112.method4278(var10.field2745);
                                            var110 = var113.method4309(1);
                                            if (var110 == null) {
                                                method4218(var10);
                                            } else {
                                                var110.method2320();
                                                var111 = var110.field2113 / 2;
                                            }
                                        }
                                    } else if (var10.field2667 == 5) {
                                        if (var10.field2683 == 0) {
                                            var110 = field1036.method3694((class262) null, -1, (class262) null, -1);
                                        } else {
                                            var110 = Statics.field655.method1081();
                                        }
                                    } else if (var109 == -1) {
                                        var110 = var10.method3725((class262) null, -1, var108, Statics.field655.field881);
                                        if (var110 == null && class218.field2719) {
                                            method4218(var10);
                                        }
                                    } else {
                                        class262 var114 = class262.method1025(var109);
                                        var110 = var10.method3725(var114, var10.field2746, var108, Statics.field655.field881);
                                        if (var110 == null && class218.field2719) {
                                            method4218(var10);
                                        }
                                    }
                                    class138.method2431(var10.field2639 / 2 + var13, var10.field2640 / 2 + var14);
                                    int var115 = var10.field2631 * class138.field2004[var10.field2675] >> 16;
                                    int var116 = var10.field2631 * class138.field2027[var10.field2675] >> 16;
                                    if (var110 != null) {
                                        if (var10.field2623) {
                                            var110.method2320();
                                            if (var10.field2681) {
                                                var110.method2334(0, var10.field2705, var10.field2677, var10.field2675, var10.field2664, var10.field2622 + var111 + var115, var10.field2622 + var116, var10.field2631);
                                            } else {
                                                var110.method2333(0, var10.field2705, var10.field2677, var10.field2675, var10.field2664, var10.field2622 + var111 + var115, var10.field2622 + var116);
                                            }
                                        } else {
                                            var110.method2333(0, var10.field2705, 0, var10.field2675, 0, var115, var116);
                                        }
                                    }
                                    class138.method2430();
                                } else {
                                    if (var10.field2757 == 7) {
                                        class265 var117 = var10.method3751();
                                        if (var117 == null) {
                                            if (class218.field2719) {
                                                method4218(var10);
                                            }
                                            continue;
                                        }
                                        int var118 = 0;
                                        for (int var119 = 0; var119 < var10.field2636; var119++) {
                                            for (int var120 = 0; var120 < var10.field2635; var120++) {
                                                if (var10.field2742[var118] > 0) {
                                                    class258 var121 = class258.method4627(var10.field2742[var118] - 1);
                                                    String var122;
                                                    if (var121.field3485 != 1 && var10.field2617[var118] == 1) {
                                                        var122 = class90.method2799(16748608) + var121.field3487 + class90.field1379;
                                                    } else {
                                                        var122 = class90.method2799(16748608) + var121.field3487 + class90.field1379 + " " + 'x' + method2510(var10.field2617[var118]);
                                                    }
                                                    int var123 = (var10.field2690 + 115) * var120 + var13;
                                                    int var124 = (var10.field2691 + 12) * var119 + var14;
                                                    if (var10.field2744 == 0) {
                                                        var117.method4459(var122, var123, var124, var10.field2649, var10.field2689 ? 0 : -1);
                                                    } else if (var10.field2744 == 1) {
                                                        var117.method4462(var122, var10.field2639 / 2 + var123, var124, var10.field2649, var10.field2689 ? 0 : -1);
                                                    } else {
                                                        var117.method4461(var122, var10.field2639 + var123 - 1, var124, var10.field2649, var10.field2689 ? 0 : -1);
                                                    }
                                                }
                                                var118++;
                                            }
                                        }
                                    }
                                    if (var10.field2757 == 8 && Statics.field603 == var10 && field1055 == field1054) {
                                        int var125 = 0;
                                        int var126 = 0;
                                        class265 var127 = Statics.field3847;
                                        String var128 = var10.field2684;
                                        String var129 = method476(var128, var10);
                                        while (var129.length() > 0) {
                                            int var130 = var129.indexOf(class90.field1382);
                                            String var131;
                                            if (var130 == -1) {
                                                var131 = var129;
                                                var129 = "";
                                            } else {
                                                var131 = var129.substring(0, var130);
                                                var129 = var129.substring(var130 + 4);
                                            }
                                            int var132 = var127.method4454(var131);
                                            if (var132 > var125) {
                                                var125 = var132;
                                            }
                                            var126 += var127.field3645 + 1;
                                        }
                                        var125 += 6;
                                        var126 += 7;
                                        int var133 = var10.field2639 + var13 - 5 - var125;
                                        int var134 = var10.field2640 + var14 + 5;
                                        if (var133 < var13 + 5) {
                                            var133 = var13 + 5;
                                        }
                                        if (var125 + var133 > arg4) {
                                            var133 = arg4 - var125;
                                        }
                                        if (var126 + var134 > arg5) {
                                            var134 = arg5 - var126;
                                        }
                                        class283.method4649(var133, var134, var125, var126, 16777120);
                                        class283.method4656(var133, var134, var125, var126, 0);
                                        String var135 = var10.field2684;
                                        int var136 = var127.field3645 + var134 + 2;
                                        String var137 = method476(var135, var10);
                                        while (var137.length() > 0) {
                                            int var138 = var137.indexOf(class90.field1382);
                                            String var139;
                                            if (var138 == -1) {
                                                var139 = var137;
                                                var137 = "";
                                            } else {
                                                var139 = var137.substring(0, var138);
                                                var137 = var137.substring(var138 + 4);
                                            }
                                            var127.method4459(var139, var133 + 3, var136, 0, -1);
                                            var136 += var127.field3645 + 1;
                                        }
                                    }
                                    if (var10.field2757 == 9) {
                                        int var140;
                                        int var141;
                                        int var142;
                                        int var143;
                                        if (var10.field2658) {
                                            var140 = var13;
                                            var141 = var10.field2640 + var14;
                                            var142 = var10.field2639 + var13;
                                            var143 = var14;
                                        } else {
                                            var140 = var13;
                                            var141 = var14;
                                            var142 = var10.field2639 + var13;
                                            var143 = var10.field2640 + var14;
                                        }
                                        if (var10.field2688 == 1) {
                                            class283.method4688(var140, var141, var142, var143, var10.field2649);
                                        } else {
                                            method3173(var140, var141, var142, var143, var10.field2649, var10.field2688);
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

    @ObfuscatedName("fb.hb(IIIIIII)V")
    public static final void method3173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class283.field3744;
        int var18 = arg1 - class283.field3742;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class138.method2436(var19, var20, var21);
        class138.method2441(var23, var24, var25, var19, var20, var21, arg4);
        class138.method2436(var19, var21, var22);
        class138.method2441(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("ak.hm(Ljava/lang/String;Lhg;B)Ljava/lang/String;")
    public static String method476(String arg0, class218 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method1062(method72(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field878 != null) {
                    var5 = class272.method2805(Statics.field878.field2213);
                    if (Statics.field878.field2215 != null) {
                        var5 = (String) Statics.field878.field2215;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ep.ig(IB)Ljava/lang/String;")
    public static final String method2510(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class90.field1376 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class90.method2799(65408) + var1.substring(0, var1.length() - 8) + class227.field2987 + " " + class90.field1377 + var1 + class90.field1390 + class90.field1379;
        } else if (var1.length() > 6) {
            return " " + class90.method2799(16777215) + var1.substring(0, var1.length() - 4) + class227.field2989 + " " + class90.field1377 + var1 + class90.field1390 + class90.field1379;
        } else {
            return " " + class90.method2799(16776960) + var1 + class90.field1379;
        }
    }

    @ObfuscatedName("client.ic(ZI)V")
    public final void method1098(boolean arg0) {
        int var2 = field1029;
        int var3 = Statics.field1365;
        int var4 = Statics.field3269;
        if (class218.method48(var2)) {
            method165(Statics.field1482[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.it(Lhg;I)V")
    public void method1099(class218 arg0) {
        class218 var2 = arg0.field2643 == -1 ? null : class218.method4538(arg0.field2643);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1365;
            var4 = Statics.field3269;
        } else {
            var3 = var2.field2639;
            var4 = var2.field2640;
        }
        method3443(arg0, var3, var4, false);
        method3798(arg0, var3, var4);
    }

    @ObfuscatedName("bk.ik([Lhg;Lhg;ZI)V")
    public static void method1078(class218[] arg0, class218 arg1, boolean arg2) {
        int var3 = arg1.field2647 == 0 ? arg1.field2639 : arg1.field2647;
        int var4 = arg1.field2750 == 0 ? arg1.field2640 : arg1.field2750;
        method165(arg0, arg1.field2624, var3, var4, arg2);
        if (arg1.field2615 != null) {
            method165(arg1.field2615, arg1.field2624, var3, var4, arg2);
        }
        class69 var5 = (class69) field1180.method3294((long) arg1.field2624);
        if (var5 != null) {
            int var6 = var5.field822;
            if (class218.method48(var6)) {
                method165(Statics.field1482[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2714 == 1337) {
        }
    }

    @ObfuscatedName("i.id([Lhg;IIIZI)V")
    public static void method165(class218[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class218 var6 = arg0[var5];
            if (var6 != null && var6.field2643 == arg1) {
                method3443(var6, arg2, arg3, arg4);
                method3798(var6, arg2, arg3);
                if (var6.field2674 > var6.field2647 - var6.field2639) {
                    var6.field2674 = var6.field2647 - var6.field2639;
                }
                if (var6.field2674 < 0) {
                    var6.field2674 = 0;
                }
                if (var6.field2646 > var6.field2750 - var6.field2640) {
                    var6.field2646 = var6.field2750 - var6.field2640;
                }
                if (var6.field2646 < 0) {
                    var6.field2646 = 0;
                }
                if (var6.field2757 == 0) {
                    method1078(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("gp.ie(Lhg;IIZI)V")
    public static void method3443(class218 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2639;
        int var5 = arg0.field2640;
        if (arg0.field2628 == 0) {
            arg0.field2639 = arg0.field2635;
        } else if (arg0.field2628 == 1) {
            arg0.field2639 = arg1 - arg0.field2635;
        } else if (arg0.field2628 == 2) {
            arg0.field2639 = arg0.field2635 * arg1 >> 14;
        }
        if (arg0.field2652 == 0) {
            arg0.field2640 = arg0.field2636;
        } else if (arg0.field2652 == 1) {
            arg0.field2640 = arg2 - arg0.field2636;
        } else if (arg0.field2652 == 2) {
            arg0.field2640 = arg0.field2636 * arg2 >> 14;
        }
        if (arg0.field2628 == 4) {
            arg0.field2639 = arg0.field2641 * arg0.field2640 / arg0.field2642;
        }
        if (arg0.field2652 == 4) {
            arg0.field2640 = arg0.field2642 * arg0.field2639 / arg0.field2641;
        }
        if (field1073 && arg0.field2757 == 0) {
            if (arg0.field2640 < 5 && arg0.field2639 < 5) {
                arg0.field2640 = 5;
                arg0.field2639 = 5;
            } else {
                if (arg0.field2640 <= 0) {
                    arg0.field2640 = 5;
                }
                if (arg0.field2639 <= 0) {
                    arg0.field2639 = 5;
                }
            }
        }
        if (arg0.field2714 == 1337) {
            field1170 = arg0;
        }
        if (arg3 && arg0.field2733 != null && (arg0.field2639 != var4 || arg0.field2640 != var5)) {
            class71 var6 = new class71();
            var6.field837 = arg0;
            var6.field850 = arg0.field2733;
            field1102.method3379(var6);
        }
    }

    @ObfuscatedName("hw.iy(Lhg;IIB)V")
    public static void method3798(class218 arg0, int arg1, int arg2) {
        if (arg0.field2716 == 0) {
            arg0.field2637 = arg0.field2633;
        } else if (arg0.field2716 == 1) {
            arg0.field2637 = (arg1 - arg0.field2639) / 2 + arg0.field2633;
        } else if (arg0.field2716 == 2) {
            arg0.field2637 = arg1 - arg0.field2639 - arg0.field2633;
        } else if (arg0.field2716 == 3) {
            arg0.field2637 = arg0.field2633 * arg1 >> 14;
        } else if (arg0.field2716 == 4) {
            arg0.field2637 = (arg0.field2633 * arg1 >> 14) + (arg1 - arg0.field2639) / 2;
        } else {
            arg0.field2637 = arg1 - arg0.field2639 - (arg0.field2633 * arg1 >> 14);
        }
        if (arg0.field2630 == 0) {
            arg0.field2638 = arg0.field2666;
        } else if (arg0.field2630 == 1) {
            arg0.field2638 = (arg2 - arg0.field2640) / 2 + arg0.field2666;
        } else if (arg0.field2630 == 2) {
            arg0.field2638 = arg2 - arg0.field2640 - arg0.field2666;
        } else if (arg0.field2630 == 3) {
            arg0.field2638 = arg0.field2666 * arg2 >> 14;
        } else if (arg0.field2630 == 4) {
            arg0.field2638 = (arg0.field2666 * arg2 >> 14) + (arg2 - arg0.field2640) / 2;
        } else {
            arg0.field2638 = arg2 - arg0.field2640 - (arg0.field2666 * arg2 >> 14);
        }
        if (!field1073 || arg0.field2757 != 0) {
            return;
        }
        if (arg0.field2637 < 0) {
            arg0.field2637 = 0;
        } else if (arg0.field2639 + arg0.field2637 > arg1) {
            arg0.field2637 = arg1 - arg0.field2639;
        }
        if (arg0.field2638 < 0) {
            arg0.field2638 = 0;
        } else if (arg0.field2640 + arg0.field2638 > arg2) {
            arg0.field2638 = arg2 - arg0.field2640;
        }
    }

    @ObfuscatedName("bk.im(IB)Ljava/lang/String;")
    public static final String method1062(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("s.io(Lhg;II)I")
    public static final int method72(class218 arg0, int arg1) {
        if (arg0.field2738 == null || arg1 >= arg0.field2738.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2738[arg1];
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
                    var7 = field1037[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1038[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1039[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class218 var11 = class218.method4538(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class258.method4627(var12).field3500 || field920)) {
                        for (int var13 = 0; var13 < var11.field2742.length; var13++) {
                            if (var12 + 1 == var11.field2742[var13]) {
                                var7 += var11.field2617[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class213.field2585[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class224.field2809[field1038[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class213.field2585[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field655.field885;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class224.field2813[var14]) {
                            var7 += field1038[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class218 var17 = class218.method4538(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class258.method4627(var18).field3500 || field920)) {
                        for (int var19 = 0; var19 < var17.field2742.length; var19++) {
                            if (var18 + 1 == var17.field2742[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1068;
                }
                if (var6 == 12) {
                    var7 = field1069;
                }
                if (var6 == 13) {
                    int var20 = class213.field2585[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class213.method3619(var22);
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
                    var7 = (Statics.field655.field1221 >> 7) + Statics.field376;
                }
                if (var6 == 19) {
                    var7 = (Statics.field655.field1207 >> 7) + Statics.field847;
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

    @ObfuscatedName("p.ir(Lhg;Lii;IIZB)V")
    public static final void method146(class218 arg0, class258 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3502;
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
            var7 = class227.field2828;
        }
        if (var6 == -1 || var7 == null) {
            return;
        }
        String var9 = class90.method2799(16748608) + arg1.field3487;
        int var11 = arg1.field3527;
        int var13 = arg0.field2624;
        if (field936 || field929 >= 500) {
            return;
        }
        field937[field929] = var7;
        field1048[field929] = var9;
        field1045[field929] = var6;
        field1046[field929] = var11;
        field1043[field929] = arg2;
        field1044[field929] = var13;
        field1049[field929] = arg4;
        field929++;
    }

    @ObfuscatedName("hb.iu([Lhg;IIIIIIIB)V")
    public static final void method3805(class218[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class218 var9 = arg0[var8];
            if (var9 != null && (!var9.field2623 || var9.field2757 == 0 || var9.field2740 || method76(var9) != 0 || field1077 == var9 || var9.field2714 == 1338) && var9.field2643 == arg1 && (!var9.field2623 || !method492(var9))) {
                int var10 = var9.field2637 + arg6;
                int var11 = var9.field2638 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2757 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2757 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2639 + var10;
                    int var19 = var9.field2640 + var11;
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
                    int var22 = var9.field2639 + var10;
                    int var23 = var9.field2640 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1118 == var9) {
                    field1084 = true;
                    field1085 = var10;
                    field1086 = var11;
                }
                if (!var9.field2623 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field719;
                    int var25 = class60.field720 * 752920449;
                    if (class60.field735 != 0) {
                        var24 = class60.field726;
                        var25 = class60.field727;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2714 == 1337) {
                        if (!field924 && !field936 && var26) {
                            if (field1056 == 0 && !field970) {
                                method2862(class227.field2860, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var27 = -1;
                            int var28 = -1;
                            for (int var29 = 0; var29 < class136.field1989; var29++) {
                                int var30 = class136.field1990[var29];
                                int var31 = var30 & 0x7F;
                                int var32 = var30 >> 7 & 0x7F;
                                int var33 = var30 >> 29 & 0x3;
                                int var34 = var30 >> 14 & 0x7FFF;
                                if (var28 != var30) {
                                    var28 = var30;
                                    if (var33 == 2 && Statics.field1335.method2541(Statics.field424, var31, var32, var30) >= 0) {
                                        class257 var35 = class257.method247(var34);
                                        if (var35.field3468 != null) {
                                            var35 = var35.method4229();
                                        }
                                        if (var35 == null) {
                                            continue;
                                        }
                                        if (field1056 == 1) {
                                            method2862(class227.field2844, field1057 + " " + class90.field1381 + " " + class90.method2799(65535) + var35.field3437, 1, var30, var31, var32);
                                        } else if (!field970) {
                                            String[] var36 = var35.field3427;
                                            if (field935) {
                                                var36 = method1565(var36);
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
                                                        method2862(var36[var37], class90.method2799(65535) + var35.field3437, var38, var30, var31, var32);
                                                    }
                                                }
                                            }
                                            method2862(class227.field2960, class90.method2799(65535) + var35.field3437, 1002, var35.field3428 << 14, var31, var32);
                                        } else if ((Statics.field5 & 0x4) == 4) {
                                            method2862(field998, field1062 + " " + class90.field1381 + " " + class90.method2799(65535) + var35.field3437, 2, var30, var31, var32);
                                        }
                                    }
                                    if (var33 == 1) {
                                        class88 var39 = field952[var34];
                                        if (var39 == null) {
                                            continue;
                                        }
                                        if (var39.field1364.field3548 == 1 && (var39.field1221 & 0x7F) == 64 && (var39.field1207 & 0x7F) == 64) {
                                            for (int var40 = 0; var40 < field953; var40++) {
                                                class88 var41 = field952[field954[var40]];
                                                if (var41 != null && var39 != var41 && var41.field1364.field3548 == 1 && var39.field1221 == var41.field1221 && var39.field1207 == var41.field1207) {
                                                    method62(var41.field1364, field954[var40], var31, var32);
                                                }
                                            }
                                            int var42 = class98.field1494;
                                            int[] var43 = class98.field1495;
                                            for (int var44 = 0; var44 < var42; var44++) {
                                                class76 var45 = field1099[var43[var44]];
                                                if (var45 != null && var39.field1221 == var45.field1221 && var39.field1207 == var45.field1207) {
                                                    method2697(var45, var43[var44], var31, var32);
                                                }
                                            }
                                        }
                                        method62(var39.field1364, var34, var31, var32);
                                    }
                                    if (var33 == 0) {
                                        class76 var46 = field1099[var34];
                                        if (var46 == null) {
                                            continue;
                                        }
                                        if ((var46.field1221 & 0x7F) == 64 && (var46.field1207 & 0x7F) == 64) {
                                            for (int var47 = 0; var47 < field953; var47++) {
                                                class88 var48 = field952[field954[var47]];
                                                if (var48 != null && var48.field1364.field3548 == 1 && var46.field1221 == var48.field1221 && var46.field1207 == var48.field1207) {
                                                    method62(var48.field1364, field954[var47], var31, var32);
                                                }
                                            }
                                            int var49 = class98.field1494;
                                            int[] var50 = class98.field1495;
                                            for (int var51 = 0; var51 < var49; var51++) {
                                                class76 var52 = field1099[var50[var51]];
                                                if (var52 != null && var46 != var52 && var46.field1221 == var52.field1221 && var46.field1207 == var52.field1207) {
                                                    method2697(var52, var50[var51], var31, var32);
                                                }
                                            }
                                        }
                                        if (field1032 == var34) {
                                            var27 = var30;
                                        } else {
                                            method2697(var46, var34, var31, var32);
                                        }
                                    }
                                    if (var33 == 3) {
                                        class195 var53 = field1131[Statics.field424][var31][var32];
                                        if (var53 != null) {
                                            for (class96 var54 = (class96) var53.method3349(); var54 != null; var54 = (class96) var53.method3351()) {
                                                class258 var55 = class258.method4627(var54.field1483);
                                                if (field1056 == 1) {
                                                    method2862(class227.field2844, field1057 + " " + class90.field1381 + " " + class90.method2799(16748608) + var55.field3487, 16, var54.field1483, var31, var32);
                                                } else if (!field970) {
                                                    String[] var56 = var55.field3524;
                                                    if (field935) {
                                                        var56 = method1565(var56);
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
                                                            method2862(var56[var57], class90.method2799(16748608) + var55.field3487, var58, var54.field1483, var31, var32);
                                                        } else if (var57 == 2) {
                                                            method2862(class227.field2827, class90.method2799(16748608) + var55.field3487, 20, var54.field1483, var31, var32);
                                                        }
                                                    }
                                                    method2862(class227.field2960, class90.method2799(16748608) + var55.field3487, 1004, var54.field1483, var31, var32);
                                                } else if ((Statics.field5 & 0x1) == 1) {
                                                    method2862(field998, field1062 + " " + class90.field1381 + " " + class90.method2799(16748608) + var55.field3487, 17, var54.field1483, var31, var32);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var27 != -1) {
                                int var59 = var27 & 0x7F;
                                int var60 = var27 >> 7 & 0x7F;
                                class76 var61 = field1099[field1032];
                                method2697(var61, field1032, var59, var60);
                            }
                        }
                    } else if (var9.field2714 == 1338) {
                        method996(var9, var10, var11);
                    } else {
                        if (var9.field2714 == 1400) {
                            Statics.field30.method4893(class60.field719, class60.field720 * 752920449, var26, var10, var11, var9.field2639, var9.field2640);
                        }
                        if (!field936 && var26) {
                            if (var9.field2714 == 1400) {
                                Statics.field30.method4896(var10, var11, var9.field2639, var9.field2640, var24, var25);
                            } else {
                                int var62 = var24 - var10;
                                int var63 = var25 - var11;
                                if (var9.field2627 == 1) {
                                    method2862(var9.field2741, "", 24, 0, 0, var9.field2624);
                                }
                                if (var9.field2627 == 2 && !field970) {
                                    String var64 = method1030(var9);
                                    if (var64 != null) {
                                        method2862(var64, class90.method2799(65280) + var9.field2653, 25, 0, -1, var9.field2624);
                                    }
                                }
                                if (var9.field2627 == 3) {
                                    method2862(class227.field2985, "", 26, 0, 0, var9.field2624);
                                }
                                if (var9.field2627 == 4) {
                                    method2862(var9.field2741, "", 28, 0, 0, var9.field2624);
                                }
                                if (var9.field2627 == 5) {
                                    method2862(var9.field2741, "", 29, 0, 0, var9.field2624);
                                }
                                if (var9.field2627 == 6 && field1067 == null) {
                                    method2862(var9.field2741, "", 30, 0, -1, var9.field2624);
                                }
                                if (var9.field2757 == 2) {
                                    int var65 = 0;
                                    for (int var66 = 0; var66 < var9.field2640; var66++) {
                                        for (int var67 = 0; var67 < var9.field2639; var67++) {
                                            int var68 = (var9.field2690 + 32) * var67;
                                            int var69 = (var9.field2691 + 32) * var66;
                                            if (var65 < 20) {
                                                var68 += var9.field2671[var65];
                                                var69 += var9.field2693[var65];
                                            }
                                            if (var62 >= var68 && var63 >= var69 && var62 < var68 + 32 && var63 < var69 + 32) {
                                                field1019 = var65;
                                                Statics.field2196 = var9;
                                                if (var9.field2742[var65] > 0) {
                                                    label1301: {
                                                        class258 var70 = class258.method4627(var9.field2742[var65] - 1);
                                                        if (field1056 == 1) {
                                                            int var71 = method76(var9);
                                                            boolean var72 = (var71 >> 30 & 0x1) != 0;
                                                            if (var72) {
                                                                if (Statics.field262 != var9.field2624 || Statics.field450 != var65) {
                                                                    method2862(class227.field2844, field1057 + " " + class90.field1381 + " " + class90.method2799(16748608) + var70.field3487, 31, var70.field3527, var65, var9.field2624);
                                                                }
                                                                break label1301;
                                                            }
                                                        }
                                                        if (!field970 || !class219.method723(method76(var9))) {
                                                            String[] var73 = var70.field3502;
                                                            if (field935) {
                                                                String[] var74 = method1565(var73);
                                                            }
                                                            int var75 = -1;
                                                            if (field1010 && class51.field632[81]) {
                                                                var75 = var70.method4285();
                                                            }
                                                            int var76 = method76(var9);
                                                            boolean var77 = (var76 >> 30 & 0x1) != 0;
                                                            if (var77) {
                                                                for (int var78 = 4; var78 >= 3; var78--) {
                                                                    if (var75 != var78) {
                                                                        method146(var9, var70, var65, var78, false);
                                                                    }
                                                                }
                                                            }
                                                            int var79 = method76(var9);
                                                            boolean var80 = (var79 >> 31 & 0x1) != 0;
                                                            if (var80) {
                                                                method2862(class227.field2844, class90.method2799(16748608) + var70.field3487, 38, var70.field3527, var65, var9.field2624);
                                                            }
                                                            class219 var10000 = (class219) null;
                                                            if (class219.method723(method76(var9))) {
                                                                for (int var81 = 2; var81 >= 0; var81--) {
                                                                    if (var75 != var81) {
                                                                        method146(var9, var70, var65, var81, false);
                                                                    }
                                                                }
                                                                if (var75 >= 0) {
                                                                    method146(var9, var70, var65, var75, true);
                                                                }
                                                            }
                                                            String[] var82 = var9.field2672;
                                                            if (field935) {
                                                                var82 = method1565(var82);
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
                                                                        method2862(var82[var83], class90.method2799(16748608) + var70.field3487, var84, var70.field3527, var65, var9.field2624);
                                                                    }
                                                                }
                                                            }
                                                            method2862(class227.field2960, class90.method2799(16748608) + var70.field3487, 1005, var70.field3527, var65, var9.field2624);
                                                        } else if ((Statics.field5 & 0x10) == 16) {
                                                            method2862(field998, field1062 + " " + class90.field1381 + " " + class90.method2799(16748608) + var70.field3487, 32, var70.field3527, var65, var9.field2624);
                                                        }
                                                    }
                                                }
                                            }
                                            var65++;
                                        }
                                    }
                                }
                                if (var9.field2623) {
                                    if (!field970) {
                                        for (int var85 = 9; var85 >= 5; var85--) {
                                            String var86 = method109(var9, var85);
                                            if (var86 != null) {
                                                method2862(var86, var9.field2697, 1007, var85 + 1, var9.field2726, var9.field2624);
                                            }
                                        }
                                        String var87 = method1030(var9);
                                        if (var87 != null) {
                                            method2862(var87, var9.field2697, 25, 0, var9.field2726, var9.field2624);
                                        }
                                        for (int var88 = 4; var88 >= 0; var88--) {
                                            String var89 = method109(var9, var88);
                                            if (var89 != null) {
                                                method2862(var89, var9.field2697, 57, var88 + 1, var9.field2726, var9.field2624);
                                            }
                                        }
                                        if (class219.method3189(method76(var9))) {
                                            method2862(class227.field2832, "", 30, 0, var9.field2726, var9.field2624);
                                        }
                                    } else if (class219.method1604(method76(var9)) && (Statics.field5 & 0x20) == 32) {
                                        method2862(field998, field1062 + " " + class90.field1381 + " " + var9.field2697, 58, 0, var9.field2726, var9.field2624);
                                    }
                                }
                            }
                        }
                        if (var9.field2757 == 0) {
                            if (!var9.field2623 && method492(var9) && Statics.field570 != var9) {
                                continue;
                            }
                            method3805(arg0, var9.field2624, var12, var13, var14, var15, var10 - var9.field2674, var11 - var9.field2646);
                            if (var9.field2615 != null) {
                                method3805(var9.field2615, var9.field2624, var12, var13, var14, var15, var10 - var9.field2674, var11 - var9.field2646);
                            }
                            class69 var90 = (class69) field1180.method3294((long) var9.field2624);
                            if (var90 != null) {
                                if (var90.field824 == 0 && class60.field719 >= var12 && class60.field720 * 752920449 >= var13 && class60.field719 < var14 && class60.field720 * 752920449 < var15 && !field936 && !field1073) {
                                    for (class71 var91 = (class71) field1102.method3348(); var91 != null; var91 = (class71) field1102.method3350()) {
                                        if (var91.field835) {
                                            var91.method3333();
                                            var91.field837.field2749 = false;
                                        }
                                    }
                                    if (Statics.field1780 == 0) {
                                        field1118 = null;
                                        field1077 = null;
                                    }
                                    if (!field936) {
                                        field929 = 0;
                                        field936 = false;
                                        field937[0] = class227.field3065;
                                        field1048[0] = "";
                                        field1045[0] = 1006;
                                        field1049[0] = false;
                                        field929 = 1;
                                    }
                                }
                                int var92 = var90.field822;
                                if (class218.method48(var92)) {
                                    method3805(Statics.field1482[var92], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2623) {
                            if (var9.field2703) {
                                if (class60.field719 >= var12 && class60.field720 * 752920449 >= var13 && class60.field719 < var14 && class60.field720 * 752920449 < var15) {
                                    for (class71 var93 = (class71) field1102.method3348(); var93 != null; var93 = (class71) field1102.method3350()) {
                                        if (var93.field835) {
                                            var93.method3333();
                                            var93.field837.field2749 = false;
                                        }
                                    }
                                    if (Statics.field1780 == 0) {
                                        field1118 = null;
                                        field1077 = null;
                                    }
                                    if (!field936) {
                                        method13();
                                    }
                                }
                            } else if (var9.field2686 && class60.field719 >= var12 && class60.field720 * 752920449 >= var13 && class60.field719 < var14 && class60.field720 * 752920449 < var15) {
                                for (class71 var94 = (class71) field1102.method3348(); var94 != null; var94 = (class71) field1102.method3350()) {
                                    if (var94.field835 && var94.field837.field2619 == var94.field850) {
                                        var94.method3333();
                                    }
                                }
                            }
                            boolean var95;
                            if (class60.field719 >= var12 && class60.field720 * 752920449 >= var13 && class60.field719 < var14 && class60.field720 * 752920449 < var15) {
                                var95 = true;
                            } else {
                                var95 = false;
                            }
                            boolean var96 = false;
                            if ((class60.field712 == 1 || !Statics.field646 && class60.field712 == 4) && var95) {
                                var96 = true;
                            }
                            boolean var97 = false;
                            if ((class60.field735 == 1 || !Statics.field646 && class60.field735 == 4) && class60.field726 >= var12 && class60.field727 >= var13 && class60.field726 < var14 && class60.field727 < var15) {
                                var97 = true;
                            }
                            if (var97) {
                                method15(var9, class60.field726 - var10, class60.field727 - var11);
                            }
                            if (var9.field2714 == 1400) {
                                Statics.field30.method4894(class60.field719, class60.field720 * 752920449, var95 & var96);
                            }
                            if (field1118 != null && field1118 != var9 && var95) {
                                int var98 = method76(var9);
                                boolean var99 = (var98 >> 20 & 0x1) != 0;
                                if (var99) {
                                    field1121 = var9;
                                }
                            }
                            if (field1077 == var9) {
                                field1081 = true;
                                field1082 = var10;
                                field1083 = var11;
                            }
                            if (var9.field2740) {
                                if (var95 && field1101 != 0 && var9.field2619 != null) {
                                    class71 var100 = new class71();
                                    var100.field835 = true;
                                    var100.field837 = var9;
                                    var100.field845 = field1101;
                                    var100.field850 = var9.field2619;
                                    field1102.method3379(var100);
                                }
                                if (field1118 != null || Statics.field452 != null || field936) {
                                    var97 = false;
                                    var96 = false;
                                    var95 = false;
                                }
                                if (!var9.field2723 && var97) {
                                    var9.field2723 = true;
                                    if (var9.field2706 != null) {
                                        class71 var101 = new class71();
                                        var101.field835 = true;
                                        var101.field837 = var9;
                                        var101.field838 = class60.field726 - var10;
                                        var101.field845 = class60.field727 - var11;
                                        var101.field850 = var9.field2706;
                                        field1102.method3379(var101);
                                    }
                                }
                                if (var9.field2723 && var96 && var9.field2707 != null) {
                                    class71 var102 = new class71();
                                    var102.field835 = true;
                                    var102.field837 = var9;
                                    var102.field838 = class60.field719 - var10;
                                    var102.field845 = class60.field720 * 752920449 - var11;
                                    var102.field850 = var9.field2707;
                                    field1102.method3379(var102);
                                }
                                if (var9.field2723 && !var96) {
                                    var9.field2723 = false;
                                    if (var9.field2708 != null) {
                                        class71 var103 = new class71();
                                        var103.field835 = true;
                                        var103.field837 = var9;
                                        var103.field838 = class60.field719 - var10;
                                        var103.field845 = class60.field720 * 752920449 - var11;
                                        var103.field850 = var9.field2708;
                                        field1042.method3379(var103);
                                    }
                                }
                                if (var96 && var9.field2712 != null) {
                                    class71 var104 = new class71();
                                    var104.field835 = true;
                                    var104.field837 = var9;
                                    var104.field838 = class60.field719 - var10;
                                    var104.field845 = class60.field720 * 752920449 - var11;
                                    var104.field850 = var9.field2712;
                                    field1102.method3379(var104);
                                }
                                if (!var9.field2749 && var95) {
                                    var9.field2749 = true;
                                    if (var9.field2748 != null) {
                                        class71 var105 = new class71();
                                        var105.field835 = true;
                                        var105.field837 = var9;
                                        var105.field838 = class60.field719 - var10;
                                        var105.field845 = class60.field720 * 752920449 - var11;
                                        var105.field850 = var9.field2748;
                                        field1102.method3379(var105);
                                    }
                                }
                                if (var9.field2749 && var95 && var9.field2711 != null) {
                                    class71 var106 = new class71();
                                    var106.field835 = true;
                                    var106.field837 = var9;
                                    var106.field838 = class60.field719 - var10;
                                    var106.field845 = class60.field720 * 752920449 - var11;
                                    var106.field850 = var9.field2711;
                                    field1102.method3379(var106);
                                }
                                if (var9.field2749 && !var95) {
                                    var9.field2749 = false;
                                    if (var9.field2678 != null) {
                                        class71 var107 = new class71();
                                        var107.field835 = true;
                                        var107.field837 = var9;
                                        var107.field838 = class60.field719 - var10;
                                        var107.field845 = class60.field720 * 752920449 - var11;
                                        var107.field850 = var9.field2678;
                                        field1042.method3379(var107);
                                    }
                                }
                                if (var9.field2661 != null) {
                                    class71 var108 = new class71();
                                    var108.field837 = var9;
                                    var108.field850 = var9.field2661;
                                    field1103.method3379(var108);
                                }
                                if (var9.field2668 != null && field1175 > var9.field2709) {
                                    if (var9.field2718 == null || field1175 - var9.field2709 > 32) {
                                        class71 var113 = new class71();
                                        var113.field837 = var9;
                                        var113.field850 = var9.field2668;
                                        field1102.method3379(var113);
                                    } else {
                                        label976: for (int var109 = var9.field2709; var109 < field1175; var109++) {
                                            int var110 = field1089[var109 & 0x1F];
                                            for (int var111 = 0; var111 < var9.field2718.length; var111++) {
                                                if (var9.field2718[var111] == var110) {
                                                    class71 var112 = new class71();
                                                    var112.field837 = var9;
                                                    var112.field850 = var9.field2668;
                                                    field1102.method3379(var112);
                                                    break label976;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2709 = field1175;
                                }
                                if (var9.field2730 != null && field1016 > var9.field2753) {
                                    if (var9.field2720 == null || field1016 - var9.field2753 > 32) {
                                        class71 var118 = new class71();
                                        var118.field837 = var9;
                                        var118.field850 = var9.field2730;
                                        field1102.method3379(var118);
                                    } else {
                                        label952: for (int var114 = var9.field2753; var114 < field1016; var114++) {
                                            int var115 = field1091[var114 & 0x1F];
                                            for (int var116 = 0; var116 < var9.field2720.length; var116++) {
                                                if (var9.field2720[var116] == var115) {
                                                    class71 var117 = new class71();
                                                    var117.field837 = var9;
                                                    var117.field850 = var9.field2730;
                                                    field1102.method3379(var117);
                                                    break label952;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2753 = field1016;
                                }
                                if (var9.field2721 != null && field1094 > var9.field2754) {
                                    if (var9.field2722 == null || field1094 - var9.field2754 > 32) {
                                        class71 var123 = new class71();
                                        var123.field837 = var9;
                                        var123.field850 = var9.field2721;
                                        field1102.method3379(var123);
                                    } else {
                                        label928: for (int var119 = var9.field2754; var119 < field1094; var119++) {
                                            int var120 = field1093[var119 & 0x1F];
                                            for (int var121 = 0; var121 < var9.field2722.length; var121++) {
                                                if (var9.field2722[var121] == var120) {
                                                    class71 var122 = new class71();
                                                    var122.field837 = var9;
                                                    var122.field850 = var9.field2721;
                                                    field1102.method3379(var122);
                                                    break label928;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2754 = field1094;
                                }
                                if (field1095 > var9.field2687 && var9.field2751 != null) {
                                    class71 var124 = new class71();
                                    var124.field837 = var9;
                                    var124.field850 = var9.field2751;
                                    field1102.method3379(var124);
                                }
                                if (field1092 > var9.field2687 && var9.field2743 != null) {
                                    class71 var125 = new class71();
                                    var125.field837 = var9;
                                    var125.field850 = var9.field2743;
                                    field1102.method3379(var125);
                                }
                                if (field1097 > var9.field2687 && var9.field2729 != null) {
                                    class71 var126 = new class71();
                                    var126.field837 = var9;
                                    var126.field850 = var9.field2729;
                                    field1102.method3379(var126);
                                }
                                if (field1098 > var9.field2687 && var9.field2734 != null) {
                                    class71 var127 = new class71();
                                    var127.field837 = var9;
                                    var127.field850 = var9.field2734;
                                    field1102.method3379(var127);
                                }
                                if (field1047 > var9.field2687 && var9.field2717 != null) {
                                    class71 var128 = new class71();
                                    var128.field837 = var9;
                                    var128.field850 = var9.field2717;
                                    field1102.method3379(var128);
                                }
                                if (field1100 > var9.field2687 && var9.field2676 != null) {
                                    class71 var129 = new class71();
                                    var129.field837 = var9;
                                    var129.field850 = var9.field2676;
                                    field1102.method3379(var129);
                                }
                                var9.field2687 = field1088;
                                if (var9.field2727 != null) {
                                    for (int var130 = 0; var130 < field1125; var130++) {
                                        class71 var131 = new class71();
                                        var131.field837 = var9;
                                        var131.field842 = field1114[var130];
                                        var131.field843 = field1126[var130];
                                        var131.field850 = var9.field2727;
                                        field1102.method3379(var131);
                                    }
                                }
                            }
                        }
                        if (!var9.field2623 && field1118 == null && Statics.field452 == null && !field936) {
                            if ((var9.field2739 >= 0 || var9.field2651 != 0) && class60.field719 >= var12 && class60.field720 * 752920449 >= var13 && class60.field719 < var14 && class60.field720 * 752920449 < var15) {
                                if (var9.field2739 >= 0) {
                                    Statics.field570 = arg0[var9.field2739];
                                } else {
                                    Statics.field570 = var9;
                                }
                            }
                            if (var9.field2757 == 8 && class60.field719 >= var12 && class60.field720 * 752920449 >= var13 && class60.field719 < var14 && class60.field720 * 752920449 < var15) {
                                Statics.field603 = var9;
                            }
                            if (var9.field2750 > var9.field2640) {
                                int var132 = var9.field2639 + var10;
                                int var133 = var9.field2640;
                                int var134 = var9.field2750;
                                int var135 = class60.field719;
                                int var136 = class60.field720 * 752920449;
                                if (field984) {
                                    field985 = 32;
                                } else {
                                    field985 = 0;
                                }
                                field984 = false;
                                if (class60.field712 == 1 || !Statics.field646 && class60.field712 == 4) {
                                    if (var135 >= var132 && var135 < var132 + 16 && var136 >= var11 && var136 < var11 + 16) {
                                        var9.field2646 -= 4;
                                        method4218(var9);
                                    } else if (var135 >= var132 && var135 < var132 + 16 && var136 >= var11 + var133 - 16 && var136 < var11 + var133) {
                                        var9.field2646 += 4;
                                        method4218(var9);
                                    } else if (var135 >= var132 - field985 && var135 < field985 + var132 + 16 && var136 >= var11 + 16 && var136 < var11 + var133 - 16) {
                                        int var137 = (var133 - 32) * var133 / var134;
                                        if (var137 < 8) {
                                            var137 = 8;
                                        }
                                        int var138 = var136 - var11 - 16 - var137 / 2;
                                        int var139 = var133 - 32 - var137;
                                        var9.field2646 = (var134 - var133) * var138 / var139;
                                        method4218(var9);
                                        field984 = true;
                                    }
                                }
                                if (field1101 != 0) {
                                    int var140 = var9.field2639;
                                    if (var135 >= var132 - var140 && var136 >= var11 && var135 < var132 + 16 && var136 <= var11 + var133) {
                                        var9.field2646 += field1101 * 45;
                                        method4218(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.ib([Lhg;IB)V")
    public static final void method250(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2757 == 0) {
                    if (var3.field2615 != null) {
                        method250(var3.field2615, arg1);
                    }
                    class69 var4 = (class69) field1180.method3294((long) var3.field2624);
                    if (var4 != null) {
                        int var5 = var4.field822;
                        if (class218.method48(var5)) {
                            method250(Statics.field1482[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2731 != null) {
                    class71 var6 = new class71();
                    var6.field837 = var3;
                    var6.field850 = var3.field2731;
                    class85.method1409(var6);
                }
                if (arg1 == 1 && var3.field2732 != null) {
                    if (var3.field2726 >= 0) {
                        class218 var7 = class218.method4538(var3.field2624);
                        if (var7 == null || var7.field2615 == null || var3.field2726 >= var7.field2615.length || var7.field2615[var3.field2726] != var3) {
                            continue;
                        }
                    }
                    class71 var8 = new class71();
                    var8.field837 = var3;
                    var8.field850 = var3.field2732;
                    class85.method1409(var8);
                }
            }
        }
    }

    @ObfuscatedName("k.if(Lhg;III)V")
    public static final void method15(class218 arg0, int arg1, int arg2) {
        if (field1118 != null || field936 || arg0 == null || method696(arg0) == null) {
            return;
        }
        field1118 = arg0;
        field1077 = method696(arg0);
        field1013 = arg1;
        field1079 = arg2;
        Statics.field1780 = 0;
        field1087 = false;
        int var3 = field929 - 1;
        if (var3 != -1) {
            method1042(var3);
        }
    }

    @ObfuscatedName("client.il(B)V")
    public final void method1100() {
        method4218(field1118);
        Statics.field1780++;
        if (field1084 && field1081) {
            int var1 = class60.field719;
            int var2 = class60.field720 * 752920449;
            int var3 = var1 - field1013;
            int var4 = var2 - field1079;
            if (var3 < field1082) {
                var3 = field1082;
            }
            if (field1118.field2639 + var3 > field1082 + field1077.field2639) {
                var3 = field1082 + field1077.field2639 - field1118.field2639;
            }
            if (var4 < field1083) {
                var4 = field1083;
            }
            if (field1118.field2640 + var4 > field1083 + field1077.field2640) {
                var4 = field1083 + field1077.field2640 - field1118.field2640;
            }
            int var5 = var3 - field1085;
            int var6 = var4 - field1086;
            int var7 = field1118.field2700;
            if (Statics.field1780 > field1118.field2701 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1087 = true;
            }
            int var8 = field1077.field2674 + (var3 - field1082);
            int var9 = field1077.field2646 + (var4 - field1083);
            if (field1118.field2713 != null && field1087) {
                class71 var10 = new class71();
                var10.field837 = field1118;
                var10.field838 = var8;
                var10.field845 = var9;
                var10.field850 = field1118.field2713;
                class85.method1409(var10);
            }
            if (class60.field712 == 0) {
                if (field1087) {
                    if (field1118.field2626 != null) {
                        class71 var11 = new class71();
                        var11.field837 = field1118;
                        var11.field838 = var8;
                        var11.field845 = var9;
                        var11.field836 = field1121;
                        var11.field850 = field1118.field2626;
                        class85.method1409(var11);
                    }
                    if (field1121 != null && method1022(field1118) != null) {
                        field957.method3154(178);
                        field957.method2961(field1118.field2726);
                        field957.method2961(field1118.field2612);
                        field957.method2961(field1121.field2726);
                        field957.method2930(field1118.field2624);
                        field957.method2963(field1121.field2612);
                        field957.method2916(field1121.field2624);
                    }
                } else if (this.method1096()) {
                    this.method1092(field1085 + field1013, field1086 + field1079);
                } else if (field929 > 0) {
                    int var12 = field1085 + field1013;
                    int var13 = field1086 + field1079;
                    method1044(Statics.field234, var12, var13);
                    Statics.field234 = null;
                }
                field1118 = null;
            }
        } else if (Statics.field1780 > 1) {
            field1118 = null;
        }
    }

    @ObfuscatedName("bh.iv(II)V")
    public static void method1042(int arg0) {
        Statics.field234 = new class91();
        Statics.field234.field1393 = field1043[arg0];
        Statics.field234.field1391 = field1044[arg0];
        Statics.field234.field1395 = field1045[arg0];
        Statics.field234.field1394 = field1046[arg0];
        Statics.field234.field1398 = field937[arg0];
    }

    @ObfuscatedName("ix.iz(Lhg;I)V")
    public static void method4218(class218 arg0) {
        if (field1107 == arg0.field2692) {
            field1108[arg0.field2755] = true;
        }
    }

    @ObfuscatedName("y.ih(I)V")
    public static void method5() {
        for (class69 var0 = (class69) field1180.method3295(); var0 != null; var0 = (class69) field1180.method3302()) {
            int var1 = var0.field822;
            if (class218.method48(var1)) {
                boolean var2 = true;
                class218[] var3 = Statics.field1482[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2623;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2451;
                    class218 var6 = class218.method4538(var5);
                    if (var6 != null) {
                        method4218(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bq.iw(Lhg;I)Lhg;")
    public static class218 method696(class218 arg0) {
        class218 var1 = method1022(arg0);
        if (var1 == null) {
            var1 = arg0.field2699;
        }
        return var1;
    }

    @ObfuscatedName("cj.iq([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1565(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("bb.ip(II)V")
    public static final void method1000(int arg0) {
        if (!class218.method48(arg0)) {
            return;
        }
        class218[] var1 = Statics.field1482[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class218 var3 = var1[var2];
            if (var3 != null) {
                var3.field2746 = 0;
                var3.field2747 = 0;
            }
        }
    }

    @ObfuscatedName("hm.ix([Lhg;II)V")
    public static final void method3811(class218[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class218 var3 = arg0[var2];
            if (var3 != null && var3.field2643 == arg1 && (!var3.field2623 || !method492(var3))) {
                if (var3.field2757 == 0) {
                    if (!var3.field2623 && method492(var3) && Statics.field570 != var3) {
                        continue;
                    }
                    method3811(arg0, var3.field2624);
                    if (var3.field2615 != null) {
                        method3811(var3.field2615, var3.field2624);
                    }
                    class69 var4 = (class69) field1180.method3294((long) var3.field2624);
                    if (var4 != null) {
                        int var5 = var4.field822;
                        if (class218.method48(var5)) {
                            method3811(Statics.field1482[var5], -1);
                        }
                    }
                }
                if (var3.field2757 == 6) {
                    if (var3.field2634 != -1 || var3.field2621 != -1) {
                        boolean var6 = Statics.method1039(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2621;
                        } else {
                            var7 = var3.field2634;
                        }
                        if (var7 != -1) {
                            class262 var8 = class262.method1025(var7);
                            var3.field2747 += field1021;
                            while (var3.field2747 > var8.field3599[var3.field2746]) {
                                var3.field2747 -= var8.field3599[var3.field2746];
                                var3.field2746++;
                                if (var3.field2746 >= var8.field3596.length) {
                                    var3.field2746 -= var8.field3601;
                                    if (var3.field2746 < 0 || var3.field2746 >= var8.field3596.length) {
                                        var3.field2746 = 0;
                                    }
                                }
                                method4218(var3);
                            }
                        }
                    }
                    if (var3.field2680 != 0 && !var3.field2623) {
                        int var9 = var3.field2680 >> 16;
                        int var10 = var3.field2680 << 16 >> 16;
                        int var11 = field1021 * var9;
                        int var12 = field1021 * var10;
                        var3.field2675 = var3.field2675 + var11 & 0x7FF;
                        var3.field2705 = var3.field2705 + var12 & 0x7FF;
                        method4218(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.ia(IB)V")
    public static final void method11(int arg0) {
        method5();
        class83.method4727();
        int var1 = class243.method467(arg0).field3273;
        if (var1 == 0) {
            return;
        }
        int var2 = class213.field2585[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class138.method2433(0.9D);
                ((class127) Statics.field2014).method2194(0.9D);
            }
            if (var2 == 2) {
                class138.method2433(0.8D);
                ((class127) Statics.field2014).method2194(0.8D);
            }
            if (var2 == 3) {
                class138.method2433(0.7D);
                ((class127) Statics.field2014).method2194(0.7D);
            }
            if (var2 == 4) {
                class138.method2433(0.6D);
                ((class127) Statics.field2014).method2194(0.6D);
            }
            class258.field3484.method3282();
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
            if (field1061 != var3) {
                if (field1061 == 0 && field1141 != -1) {
                    class205.method248(Statics.field3307, field1141, 0, var3, false);
                    field1142 = false;
                } else if (var3 == 0) {
                    Statics.field2487.method3479();
                    class205.field2488 = 1;
                    Statics.field2489 = null;
                    field1142 = false;
                } else {
                    class205.method1571(var3);
                }
                field1061 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field1110 = 127;
            }
            if (var2 == 1) {
                field1110 = 96;
            }
            if (var2 == 2) {
                field1110 = 64;
            }
            if (var2 == 3) {
                field1110 = 32;
            }
            if (var2 == 4) {
                field1110 = 0;
            }
        }
        if (var1 == 5) {
            field1040 = var2;
        }
        if (var1 == 6) {
            field1024 = var2;
        }
        if (var1 == 9) {
            field1151 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field1144 = 127;
            }
            if (var2 == 1) {
                field1144 = 96;
            }
            if (var2 == 2) {
                field1144 = 64;
            }
            if (var2 == 3) {
                field1144 = 32;
            }
            if (var2 == 4) {
                field1144 = 0;
            }
        }
        if (var1 == 17) {
            field955 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field941 = (class93) class170.method2298(class93.method4437(), var2);
            if (field941 == null) {
                field941 = class93.field1409;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field1032 = -1;
            } else {
                field1032 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field1090 = (class93) class170.method2298(class93.method4437(), var2);
            if (field1090 == null) {
                field1090 = class93.field1409;
            }
        }
    }

    @ObfuscatedName("az.ii(I)V")
    public static final void method432() {
        field957.method3154(183);
        for (class69 var0 = (class69) field1180.method3295(); var0 != null; var0 = (class69) field1180.method3302()) {
            if (var0.field824 == 0 || var0.field824 == 3) {
                method135(var0, true);
            }
        }
        if (field1067 != null) {
            method4218(field1067);
            field1067 = null;
        }
    }

    @ObfuscatedName("eu.ij(IIII)Lbb;")
    public static final class69 method2712(int arg0, int arg1, int arg2) {
        class69 var3 = new class69();
        var3.field822 = arg1;
        var3.field824 = arg2;
        field1180.method3293(var3, (long) arg0);
        method1000(arg1);
        class218 var4 = class218.method4538(arg0);
        method4218(var4);
        if (field1067 != null) {
            method4218(field1067);
            field1067 = null;
        }
        method12();
        method1078(Statics.field1482[arg0 >> 16], var4, false);
        class85.method3932(arg1);
        if (field1029 != -1) {
            int var5 = field1029;
            if (class218.method48(var5)) {
                method250(Statics.field1482[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("t.in(Lbb;ZI)V")
    public static final void method135(class69 arg0, boolean arg1) {
        int var2 = arg0.field822;
        int var3 = (int) arg0.field2451;
        arg0.method3333();
        if (arg1) {
            class218.method1742(var2);
        }
        method680(var2);
        class218 var4 = class218.method4538(var3);
        if (var4 != null) {
            method4218(var4);
        }
        method12();
        if (field1029 != -1) {
            int var5 = field1029;
            if (class218.method48(var5)) {
                method250(Statics.field1482[var5], 1);
            }
        }
    }

    @ObfuscatedName("av.jh(Lhg;B)Z")
    public static final boolean method468(class218 arg0) {
        int var1 = arg0.field2714;
        if (var1 == 205) {
            field1041 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1036.method3670(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1036.method3681(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1036.method3674(false);
        }
        if (var1 == 325) {
            field1036.method3674(true);
        }
        if (var1 == 326) {
            field957.method3154(194);
            field1036.method3673(field957);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("hm.jd(Lhg;IIIB)V")
    public static final void method3813(class218 arg0, int arg1, int arg2, int arg3) {
        class212 var4 = arg0.method3726(false);
        if (var4 == null) {
            return;
        }
        if (field1139 < 3) {
            Statics.field273.method4850(arg1, arg2, var4.field2578, var4.field2579, 25, 25, field987, 256, var4.field2582, var4.field2580);
        } else {
            class283.method4664(arg1, arg2, 0, var4.field2582, var4.field2580);
        }
    }

    @ObfuscatedName("hr.jn(IIIILkn;Lha;I)V")
    public static final void method3794(int arg0, int arg1, int arg2, int arg3, class287 arg4, class212 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method4608(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field987 & 0x7FF;
        int var8 = class138.field2004[var7];
        int var9 = class138.field2027[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        Statics.field740.method4778(arg0 + 94 + var14 + 4 - 10, arg1 + 83 - var15 - 20, 20, 20, 15, 15, var12, 256);
    }

    @ObfuscatedName("jf.jy(IIIILkn;Lha;I)V")
    public static final void method4608(int arg0, int arg1, int arg2, int arg3, class287 arg4, class212 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field987 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class138.field2004[var6];
        int var9 = class138.field2027[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method4776(arg5.field2578 / 2 + var10 - arg4.field3764 / 2, arg5.field2579 / 2 - var11 - arg4.field3774 / 2, arg0, arg1, arg5.field2578, arg5.field2579, arg5.field2582, arg5.field2580);
        } else {
            arg4.method4809(arg5.field2578 / 2 + arg0 + var10 - arg4.field3764 / 2, arg5.field2579 / 2 + arg1 - var11 - arg4.field3774 / 2);
        }
    }

    @ObfuscatedName("u.jk(Ljava/lang/String;ZI)Z")
    public static boolean method44(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class269.method46(arg0, Statics.field423);
        for (int var3 = 0; var3 < field976; var3++) {
            if (var2.equalsIgnoreCase(class269.method46(field1172[var3].field802, Statics.field423)) && (!arg1 || field1172[var3].field803 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class269.method46(Statics.field655.field896, Statics.field423))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("i.jv(Ljava/lang/String;B)Z")
    public static boolean method163(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class269.method46(arg0, Statics.field423);
        for (int var2 = 0; var2 < field1064; var2++) {
            class72 var3 = field1183[var2];
            if (var1.equalsIgnoreCase(class269.method46(var3.field857, Statics.field423))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class269.method46(var3.field852, Statics.field423))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("t.jm(Ljava/lang/String;I)V")
    public static final void method124(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field976 < 200 || field1078 == 1) || field976 >= 400) {
            Statics.method206(30, "", class227.field3040);
            return;
        }
        String var1 = class269.method46(arg0, Statics.field423);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field976; var2++) {
            class66 var3 = field1172[var2];
            String var4 = class269.method46(var3.field802, Statics.field423);
            if (var4 != null && var4.equals(var1)) {
                Statics.method206(30, "", arg0 + class227.field2993);
                return;
            }
            if (var3.field797 != null) {
                String var5 = class269.method46(var3.field797, Statics.field423);
                if (var5 != null && var5.equals(var1)) {
                    Statics.method206(30, "", arg0 + class227.field2993);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field1064; var6++) {
            class72 var7 = field1183[var6];
            String var8 = class269.method46(var7.field857, Statics.field423);
            if (var8 != null && var8.equals(var1)) {
                Statics.method206(30, "", class227.field2840 + arg0 + class227.field2999);
                return;
            }
            if (var7.field852 != null) {
                String var9 = class269.method46(var7.field852, Statics.field423);
                if (var9 != null && var9.equals(var1)) {
                    Statics.method206(30, "", class227.field2840 + arg0 + class227.field2999);
                    return;
                }
            }
        }
        if (class269.method46(Statics.field655.field896, Statics.field423).equals(var1)) {
            Statics.method206(30, "", class227.field3031);
        } else {
            field957.method3154(68);
            field957.method2913(class175.method563(arg0));
            field957.method2927(arg0);
        }
    }

    @ObfuscatedName("hi.jq(Ljava/lang/String;ZI)V")
    public static final void method3772(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field1064 < 100 || field1078 == 1) || field1064 >= 400) {
            Statics.method206(31, "", class227.field2994);
            return;
        }
        String var2 = class269.method46(arg0, Statics.field423);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field1064; var3++) {
            class72 var4 = field1183[var3];
            String var5 = class269.method46(var4.field857, Statics.field423);
            if (var5 != null && var5.equals(var2)) {
                Statics.method206(31, "", arg0 + class227.field2995);
                return;
            }
            if (var4.field852 != null) {
                String var6 = class269.method46(var4.field852, Statics.field423);
                if (var6 != null && var6.equals(var2)) {
                    Statics.method206(31, "", arg0 + class227.field2995);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field976; var7++) {
            class66 var8 = field1172[var7];
            String var9 = class269.method46(var8.field802, Statics.field423);
            if (var9 != null && var9.equals(var2)) {
                Statics.method206(31, "", class227.field3000 + arg0 + class227.field3001);
                return;
            }
            if (var8.field797 != null) {
                String var10 = class269.method46(var8.field797, Statics.field423);
                if (var10 != null && var10.equals(var2)) {
                    Statics.method206(31, "", class227.field3000 + arg0 + class227.field3001);
                    return;
                }
            }
        }
        if (class269.method46(Statics.field655.field896, Statics.field423).equals(var2)) {
            Statics.method206(31, "", class227.field2910);
        } else {
            field957.method3154(214);
            field957.method2913(class175.method563(arg0));
            field957.method2927(arg0);
        }
    }

    @ObfuscatedName("v.ji(Ljava/lang/String;I)V")
    public static final void method19(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class269.method46(arg0, Statics.field423);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field976; var2++) {
            class66 var3 = field1172[var2];
            String var4 = var3.field802;
            String var5 = class269.method46(var4, Statics.field423);
            if (class279.method1648(arg0, var1, var4, var5)) {
                field976--;
                for (int var6 = var2; var6 < field976; var6++) {
                    field1172[var6] = field1172[var6 + 1];
                }
                field1092 = field1088;
                field957.method3154(195);
                field957.method2913(class175.method563(arg0));
                field957.method2927(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("fi.ja(Ljava/lang/String;II)V")
    public static final void method2753(String arg0, int arg1) {
        field957.method3154(2);
        field957.method2913(class175.method563(arg0) + 1);
        field957.method2927(arg0);
        field957.method2913(arg1);
    }

    @ObfuscatedName("av.jc(Ljava/lang/String;I)V")
    public static final void method469(String arg0) {
        if (Statics.field468 != null) {
            field957.method3154(78);
            field957.method2913(class175.method563(arg0));
            field957.method2927(arg0);
        }
    }

    @ObfuscatedName("ch.jr(I)V")
    public static final void method1598() {
        field957.method3154(59);
        field957.method2913(0);
    }

    @ObfuscatedName("aa.jw(IB)V")
    public static void method680(int arg0) {
        for (class200 var1 = (class200) field988.method3295(); var1 != null; var1 = (class200) field988.method3302()) {
            if ((long) arg0 == (var1.field2451 >> 48 & 0xFFFFL)) {
                var1.method3333();
            }
        }
    }

    @ObfuscatedName("c.jj(Lhg;B)I")
    public static int method76(class218 arg0) {
        class200 var1 = (class200) field988.method3294(((long) arg0.field2624 << 32) + (long) arg0.field2726);
        return var1 == null ? arg0.field2696 : var1.field2466;
    }

    @ObfuscatedName("bt.jb(Lhg;I)Lhg;")
    public static class218 method1022(class218 arg0) {
        int var1 = method76(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class218.method4538(arg0.field2643);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("af.jo(Lhg;I)Z")
    public static boolean method492(class218 arg0) {
        if (field1073) {
            if (method76(arg0) != 0) {
                return false;
            }
            if (arg0.field2757 == 0) {
                return false;
            }
        }
        return arg0.field2644;
    }

    @ObfuscatedName("m.jf(Lhg;IB)Ljava/lang/String;")
    public static String method109(class218 arg0, int arg1) {
        if (!class219.method2729(method76(arg0), arg1) && arg0.field2724 == null) {
            return null;
        } else if (arg0.field2698 == null || arg0.field2698.length <= arg1 || arg0.field2698[arg1] == null || arg0.field2698[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2698[arg1];
        }
    }

    @ObfuscatedName("bw.jg(Lhg;B)Ljava/lang/String;")
    public static String method1030(class218 arg0) {
        int var1 = method76(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2725 == null || arg0.field2725.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2725;
        }
    }

    @ObfuscatedName("cn.jt(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1603(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field919 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field919 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field919 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field919 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field919 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field863 != null) {
            var3 = "/p=" + Statics.field863;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field1014 + "/a=" + Statics.field524 + var3 + "/";
    }

    @ObfuscatedName("du.js(Ljava/lang/String;I)V")
    public static void method1972(String arg0) {
        Statics.field863 = arg0;
        try {
            String var1 = Statics.field32.getParameter(class276.field3698.field3709);
            String var2 = Statics.field32.getParameter(class276.field3694.field3709);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class177.method2903() + 94608000000L;
                class184.field2425.setTime(new Date(var6));
                int var8 = class184.field2425.get(7);
                int var9 = class184.field2425.get(5);
                int var10 = class184.field2425.get(2);
                int var11 = class184.field2425.get(1);
                int var12 = class184.field2425.get(11);
                int var13 = class184.field2425.get(12);
                int var14 = class184.field2425.get(13);
                String var15 = class184.field2423[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class184.field2427[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class53.method684(Statics.field32, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }

    @ObfuscatedName("h.jz(Ljava/lang/String;ZI)V")
    public static void method61(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3481; var5++) {
            class258 var6 = class258.method4627(var5);
            if ((!arg1 || var6.field3522) && var6.field3519 == -1 && var6.field3487.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field374 = -1;
                    Statics.field2191 = null;
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
        Statics.field2191 = var3;
        Statics.field828 = 0;
        Statics.field374 = var4;
        String[] var9 = new String[Statics.field374];
        for (int var10 = 0; var10 < Statics.field374; var10++) {
            var9[var10] = class258.method4627(var3[var10]).field3487;
        }
        class172.method24(var9, Statics.field2191);
    }

    @ObfuscatedName("t.ju([BIB)V")
    public static void method134(byte[] arg0, int arg1) {
        if (field951 == null) {
            field951 = new byte[24];
        }
        class185.method3219(arg0, arg1, field951, 0, 24);
    }

    @ObfuscatedName("bs.jl(Lfh;I)V")
    public static void method1037(class175 arg0) {
        if (field951 == null) {
            byte[] var1 = class157.method3789();
            arg0.method3122(var1, 0, var1.length);
        } else {
            arg0.method3122(field951, 0, field951.length);
        }
    }
}
