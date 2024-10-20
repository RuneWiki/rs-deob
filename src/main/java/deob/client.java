package deob;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class59 {

    @ObfuscatedName("client.w")
    public static class163[] field922 = new class163[4];

    @ObfuscatedName("client.ar")
    public static boolean field1081 = true;

    @ObfuscatedName("client.bu")
    public static int field871 = 1;

    @ObfuscatedName("client.bk")
    public static int field872 = 0;

    @ObfuscatedName("client.bl")
    public static int field873 = 0;

    @ObfuscatedName("client.bn")
    public static boolean field874 = false;

    @ObfuscatedName("client.bt")
    public static boolean field875 = false;

    @ObfuscatedName("client.bz")
    public static int field1061 = 0;

    @ObfuscatedName("client.br")
    public static int field877 = 0;

    @ObfuscatedName("client.bc")
    public static boolean field878 = true;

    @ObfuscatedName("client.bp")
    public static int field1054 = 0;

    @ObfuscatedName("client.bi")
    public static long field880 = 1L;

    @ObfuscatedName("client.bb")
    public static int field1091 = -1;

    @ObfuscatedName("client.bx")
    public static int field1055 = -1;

    @ObfuscatedName("client.by")
    public static int field883 = -1;

    @ObfuscatedName("client.bq")
    public static boolean field884 = true;

    @ObfuscatedName("client.bh")
    public static boolean field941 = false;

    @ObfuscatedName("client.bs")
    public static int field1096 = 0;

    @ObfuscatedName("client.bv")
    public static int field917 = 0;

    @ObfuscatedName("client.bf")
    public static int field888 = 0;

    @ObfuscatedName("client.cn")
    public static int field889 = 0;

    @ObfuscatedName("client.cd")
    public static int field890 = 0;

    @ObfuscatedName("client.ca")
    public static int field891 = 0;

    @ObfuscatedName("client.ce")
    public static int field892 = 0;

    @ObfuscatedName("client.cr")
    public static int field893 = 0;

    @ObfuscatedName("client.cc")
    public static int field894 = 0;

    @ObfuscatedName("client.ck")
    public static class91 field923 = class91.field1328;

    @ObfuscatedName("client.cj")
    public static class91 field942 = class91.field1328;

    @ObfuscatedName("client.ci")
    public static int field939 = 0;

    @ObfuscatedName("client.cf")
    public static int field898 = 0;

    @ObfuscatedName("client.ch")
    public static int field899 = 0;

    @ObfuscatedName("client.do")
    public static int field900 = 0;

    @ObfuscatedName("client.dk")
    public static int field925 = 0;

    @ObfuscatedName("client.ds")
    public static int field901 = 0;

    @ObfuscatedName("client.df")
    public static int field903 = 0;

    @ObfuscatedName("client.dp")
    public static int field904 = 0;

    @ObfuscatedName("client.dr")
    public static class151 field905 = class151.field2117;

    @ObfuscatedName("client.dj")
    public static byte[] field1041 = null;

    @ObfuscatedName("client.dc")
    public static class86[] field907 = new class86[32768];

    @ObfuscatedName("client.dd")
    public static int field1016 = 0;

    @ObfuscatedName("client.dz")
    public static int[] field909 = new int[32768];

    @ObfuscatedName("client.ee")
    public static int field910 = 0;

    @ObfuscatedName("client.ep")
    public static int[] field1021 = new int[250];

    @ObfuscatedName("client.ev")
    public static final class101 field953 = new class101();

    @ObfuscatedName("client.ed")
    public static int field913 = 0;

    @ObfuscatedName("client.ej")
    public static boolean field914 = false;

    @ObfuscatedName("client.ec")
    public static class284 field971 = new class284();

    @ObfuscatedName("client.ef")
    public static HashMap field916 = new HashMap();

    @ObfuscatedName("client.ek")
    public static int field1030 = 0;

    @ObfuscatedName("client.em")
    public static int field918 = 1;

    @ObfuscatedName("client.ew")
    public static int field919 = 0;

    @ObfuscatedName("client.et")
    public static int field920 = 1;

    @ObfuscatedName("client.er")
    public static int field921 = 0;

    @ObfuscatedName("client.fd")
    public static boolean field959 = false;

    @ObfuscatedName("client.fm")
    public static int[][][] field885 = new int[4][13][13];

    @ObfuscatedName("client.fh")
    public static final int[] field956 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fj")
    public static int field926 = 0;

    @ObfuscatedName("client.fv")
    public static int field915 = 2301979;

    @ObfuscatedName("client.fn")
    public static int field928 = 5063219;

    @ObfuscatedName("client.gm")
    public static int field929 = 3353893;

    @ObfuscatedName("client.gk")
    public static int field930 = 7759444;

    @ObfuscatedName("client.ge")
    public static boolean field1093 = false;

    @ObfuscatedName("client.gn")
    public static int field932 = 0;

    @ObfuscatedName("client.gq")
    public static int field933 = 128;

    @ObfuscatedName("client.gl")
    public static int field934 = 0;

    @ObfuscatedName("client.gd")
    public static int field935 = 0;

    @ObfuscatedName("client.gt")
    public static int field1078 = 0;

    @ObfuscatedName("client.gc")
    public static int field937 = 0;

    @ObfuscatedName("client.gr")
    public static int field1020 = 0;

    @ObfuscatedName("client.gx")
    public static int field951 = 50;

    @ObfuscatedName("client.gj")
    public static int field940 = 0;

    @ObfuscatedName("client.gu")
    public static boolean field984 = false;

    @ObfuscatedName("client.gp")
    public static int field1103 = 0;

    @ObfuscatedName("client.gb")
    public static int field943 = 0;

    @ObfuscatedName("client.gf")
    public static int field944 = 50;

    @ObfuscatedName("client.gy")
    public static int[] field1131 = new int[field944];

    @ObfuscatedName("client.gg")
    public static int[] field946 = new int[field944];

    @ObfuscatedName("client.gw")
    public static int[] field945 = new int[field944];

    @ObfuscatedName("client.ha")
    public static int[] field948 = new int[field944];

    @ObfuscatedName("client.ho")
    public static int[] field949 = new int[field944];

    @ObfuscatedName("client.hb")
    public static int[] field1100 = new int[field944];

    @ObfuscatedName("client.hp")
    public static int[] field1066 = new int[field944];

    @ObfuscatedName("client.hg")
    public static String[] field952 = new String[field944];

    @ObfuscatedName("client.hi")
    public static int[][] field1050 = new int[104][104];

    @ObfuscatedName("client.hj")
    public static int field954 = 0;

    @ObfuscatedName("client.hr")
    public static int field955 = -1;

    @ObfuscatedName("client.hv")
    public static int field1065 = -1;

    @ObfuscatedName("client.hm")
    public static int field957 = 0;

    @ObfuscatedName("client.hc")
    public static int field958 = 0;

    @ObfuscatedName("client.hq")
    public static int field938 = 0;

    @ObfuscatedName("client.hd")
    public static int field908 = 0;

    @ObfuscatedName("client.ht")
    public static int field1067 = 0;

    @ObfuscatedName("client.hk")
    public static int field962 = 0;

    @ObfuscatedName("client.hy")
    public static int field895 = 0;

    @ObfuscatedName("client.hh")
    public static int field964 = 0;

    @ObfuscatedName("client.hz")
    public static int field965 = 0;

    @ObfuscatedName("client.hs")
    public static int field966 = 0;

    @ObfuscatedName("client.he")
    public static boolean field967 = false;

    @ObfuscatedName("client.hu")
    public static int field968 = 0;

    @ObfuscatedName("client.hx")
    public static int field969 = 0;

    @ObfuscatedName("client.ip")
    public static class74[] field1113 = new class74[2048];

    @ObfuscatedName("client.ij")
    public static int field1052 = -1;

    @ObfuscatedName("client.in")
    public static int field972 = 0;

    @ObfuscatedName("client.ig")
    public static int field973 = 0;

    @ObfuscatedName("client.ii")
    public static int[] field974 = new int[1000];

    @ObfuscatedName("client.ik")
    public static final int[] field975 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ih")
    public static String[] field976 = new String[8];

    @ObfuscatedName("client.iy")
    public static boolean[] field977 = new boolean[8];

    @ObfuscatedName("client.ic")
    public static int[] field978 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ia")
    public static int field979 = -1;

    @ObfuscatedName("client.it")
    public static String field1119 = null;

    @ObfuscatedName("client.if")
    public static class201[][][] field887 = new class201[4][104][104];

    @ObfuscatedName("client.ie")
    public static class201 field1051 = new class201();

    @ObfuscatedName("client.io")
    public static class201 field982 = new class201();

    @ObfuscatedName("client.iv")
    public static class201 field983 = new class201();

    @ObfuscatedName("client.iw")
    public static int[] field896 = new int[25];

    @ObfuscatedName("client.ir")
    public static int[] field985 = new int[25];

    @ObfuscatedName("client.il")
    public static int[] field986 = new int[25];

    @ObfuscatedName("client.ib")
    public static int field987 = 0;

    @ObfuscatedName("client.iq")
    public static boolean field988 = false;

    @ObfuscatedName("client.ju")
    public static int field989 = 0;

    @ObfuscatedName("client.jc")
    public static int[] field990 = new int[500];

    @ObfuscatedName("client.jy")
    public static int[] field991 = new int[500];

    @ObfuscatedName("client.jf")
    public static int[] field876 = new int[500];

    @ObfuscatedName("client.jd")
    public static int[] field993 = new int[500];

    @ObfuscatedName("client.jp")
    public static String[] field994 = new String[500];

    @ObfuscatedName("client.jt")
    public static String[] field995 = new String[500];

    @ObfuscatedName("client.jg")
    public static boolean[] field996 = new boolean[500];

    @ObfuscatedName("client.ji")
    public static boolean field997 = false;

    @ObfuscatedName("client.jm")
    public static boolean field998 = false;

    @ObfuscatedName("client.jv")
    public static int field999 = -1;

    @ObfuscatedName("client.jh")
    public static int field1000 = -1;

    @ObfuscatedName("client.ja")
    public static int field1001 = 0;

    @ObfuscatedName("client.jk")
    public static int field1002 = 50;

    @ObfuscatedName("client.jn")
    public static int field1003 = 0;

    @ObfuscatedName("client.jq")
    public static boolean field1005 = false;

    @ObfuscatedName("client.kf")
    public static int field1006 = -1;

    @ObfuscatedName("client.kp")
    public static int field1007 = -1;

    @ObfuscatedName("client.kc")
    public static String field1008 = null;

    @ObfuscatedName("client.ky")
    public static String field1009 = null;

    @ObfuscatedName("client.ki")
    public static int field1010 = -1;

    @ObfuscatedName("client.kn")
    public static class198 field1026 = new class198(8);

    @ObfuscatedName("client.ko")
    public static int field1012 = 0;

    @ObfuscatedName("client.kd")
    public static int field1120 = 0;

    @ObfuscatedName("client.ku")
    public static class224 field1014 = null;

    @ObfuscatedName("client.kb")
    public static int field963 = 0;

    @ObfuscatedName("client.kz")
    public static int field1075 = 0;

    @ObfuscatedName("client.kl")
    public static int field1017 = 0;

    @ObfuscatedName("client.km")
    public static int field879 = -1;

    @ObfuscatedName("client.kh")
    public static boolean field1019 = false;

    @ObfuscatedName("client.kt")
    public static boolean field1082 = false;

    @ObfuscatedName("client.ka")
    public static boolean field870 = false;

    @ObfuscatedName("client.kj")
    public static class224 field924 = null;

    @ObfuscatedName("client.kv")
    public static class224 field1023 = null;

    @ObfuscatedName("client.kx")
    public static class224 field1024 = null;

    @ObfuscatedName("client.ks")
    public static int field1025 = 0;

    @ObfuscatedName("client.kg")
    public static int field1088 = 0;

    @ObfuscatedName("client.kq")
    public static class224 field1042 = null;

    @ObfuscatedName("client.ke")
    public static boolean field1028 = false;

    @ObfuscatedName("client.kk")
    public static int field1029 = -1;

    @ObfuscatedName("client.kw")
    public static int field881 = -1;

    @ObfuscatedName("client.lh")
    public static boolean field1069 = false;

    @ObfuscatedName("client.la")
    public static int field1032 = -1;

    @ObfuscatedName("client.li")
    public static int field1033 = -1;

    @ObfuscatedName("client.lo")
    public static boolean field1064 = false;

    @ObfuscatedName("client.lr")
    public static int field1101 = 1;

    @ObfuscatedName("client.lu")
    public static int[] field1036 = new int[32];

    @ObfuscatedName("client.le")
    public static int field1129 = 0;

    @ObfuscatedName("client.lf")
    public static int[] field1038 = new int[32];

    @ObfuscatedName("client.lq")
    public static int field992 = 0;

    @ObfuscatedName("client.lm")
    public static int[] field1040 = new int[32];

    @ObfuscatedName("client.lc")
    public static int field1035 = 0;

    @ObfuscatedName("client.ll")
    public static int field936 = 0;

    @ObfuscatedName("client.lj")
    public static int field1043 = 0;

    @ObfuscatedName("client.lk")
    public static int field1044 = 0;

    @ObfuscatedName("client.lt")
    public static int field1045 = 0;

    @ObfuscatedName("client.ls")
    public static int field1046 = 0;

    @ObfuscatedName("client.lg")
    public static int field1047 = 0;

    @ObfuscatedName("client.lw")
    public static int field1048 = 0;

    @ObfuscatedName("client.mf")
    public static class201 field1049 = new class201();

    @ObfuscatedName("client.mv")
    public static class201 field1062 = new class201();

    @ObfuscatedName("client.mg")
    public static class201 field960 = new class201();

    @ObfuscatedName("client.me")
    public static class198 field902 = new class198(512);

    @ObfuscatedName("client.mx")
    public static int field981 = 0;

    @ObfuscatedName("client.mn")
    public static int field1011 = -2;

    @ObfuscatedName("client.mw")
    public static boolean[] field1056 = new boolean[100];

    @ObfuscatedName("client.my")
    public static boolean[] field1057 = new boolean[100];

    @ObfuscatedName("client.mu")
    public static boolean[] field897 = new boolean[100];

    @ObfuscatedName("client.mq")
    public static int[] field1059 = new int[100];

    @ObfuscatedName("client.mm")
    public static int[] field931 = new int[100];

    @ObfuscatedName("client.ma")
    public static int[] field1037 = new int[100];

    @ObfuscatedName("client.mp")
    public static int[] field1013 = new int[100];

    @ObfuscatedName("client.mh")
    public static int field1063 = 0;

    @ObfuscatedName("client.mj")
    public static long field1031 = 0L;

    @ObfuscatedName("client.mt")
    public static boolean field1097 = true;

    @ObfuscatedName("client.mb")
    public static int[] field1039 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.mz")
    public static int field1058 = 0;

    @ObfuscatedName("client.ne")
    public static int field906 = 0;

    @ObfuscatedName("client.nm")
    public static String field1015 = "";

    @ObfuscatedName("client.nj")
    public static long[] field1070 = new long[100];

    @ObfuscatedName("client.nh")
    public static int field1071 = 0;

    @ObfuscatedName("client.nv")
    public static int field886 = 0;

    @ObfuscatedName("client.nz")
    public static int[] field1073 = new int[128];

    @ObfuscatedName("client.nx")
    public static int[] field1074 = new int[128];

    @ObfuscatedName("client.nk")
    public static long field1053 = -1L;

    @ObfuscatedName("client.nf")
    public static String field1076 = null;

    @ObfuscatedName("client.nq")
    public static String field1077 = null;

    @ObfuscatedName("client.ny")
    public static int field1079 = -1;

    @ObfuscatedName("client.na")
    public static int field1080 = 0;

    @ObfuscatedName("client.nw")
    public static int[] field1121 = new int[1000];

    @ObfuscatedName("client.nn")
    public static int[] field970 = new int[1000];

    @ObfuscatedName("client.nr")
    public static class295[] field1083 = new class295[1000];

    @ObfuscatedName("client.nd")
    public static int field1084 = 0;

    @ObfuscatedName("client.nb")
    public static int field1085 = 0;

    @ObfuscatedName("client.on")
    public static int field1086 = 0;

    @ObfuscatedName("client.oh")
    public static int field1060 = 255;

    @ObfuscatedName("client.ox")
    public static int field1027 = -1;

    @ObfuscatedName("client.ot")
    public static boolean field1089 = false;

    @ObfuscatedName("client.ob")
    public static int field1090 = 127;

    @ObfuscatedName("client.og")
    public static int field1068 = 127;

    @ObfuscatedName("client.oa")
    public static int field1092 = 0;

    @ObfuscatedName("client.oq")
    public static int[] field911 = new int[50];

    @ObfuscatedName("client.ol")
    public static int[] field1094 = new int[50];

    @ObfuscatedName("client.oy")
    public static int[] field1095 = new int[50];

    @ObfuscatedName("client.om")
    public static int[] field1034 = new int[50];

    @ObfuscatedName("client.ok")
    public static class105[] field980 = new class105[50];

    @ObfuscatedName("client.op")
    public static boolean field1098 = false;

    @ObfuscatedName("client.pt")
    public static boolean[] field1099 = new boolean[5];

    @ObfuscatedName("client.pn")
    public static int[] field950 = new int[5];

    @ObfuscatedName("client.pr")
    public static int[] field1072 = new int[5];

    @ObfuscatedName("client.pj")
    public static int[] field1102 = new int[5];

    @ObfuscatedName("client.pl")
    public static int[] field947 = new int[5];

    @ObfuscatedName("client.ph")
    public static short field1104 = 256;

    @ObfuscatedName("client.ps")
    public static short field1105 = 205;

    @ObfuscatedName("client.pd")
    public static short field1106 = 256;

    @ObfuscatedName("client.pe")
    public static short field1107 = 320;

    @ObfuscatedName("client.pb")
    public static short field1108 = 1;

    @ObfuscatedName("client.pi")
    public static short field912 = 32767;

    @ObfuscatedName("client.pq")
    public static short field882 = 1;

    @ObfuscatedName("client.pv")
    public static short field1109 = 32767;

    @ObfuscatedName("client.po")
    public static int field1112 = 0;

    @ObfuscatedName("client.pg")
    public static int field1110 = 0;

    @ObfuscatedName("client.px")
    public static int field1114 = 0;

    @ObfuscatedName("client.pm")
    public static int field1115 = 0;

    @ObfuscatedName("client.pp")
    public static int field1116 = 0;

    @ObfuscatedName("client.pz")
    public static int field1117 = 0;

    @ObfuscatedName("client.qi")
    public static int field1022 = 0;

    @ObfuscatedName("client.qa")
    public static class66[] field1004 = new class66[400];

    @ObfuscatedName("client.qx")
    public static class203 field1118 = new class203();

    @ObfuscatedName("client.qd")
    public static int field1018 = 0;

    @ObfuscatedName("client.qt")
    public static class70[] field1122 = new class70[400];

    @ObfuscatedName("client.qq")
    public static class221 field1123 = new class221();

    @ObfuscatedName("client.qp")
    public static int field1124 = -1;

    @ObfuscatedName("client.qv")
    public static int field1125 = -1;

    @ObfuscatedName("client.qc")
    public static class17[] field1126 = new class17[8];

    @ObfuscatedName("client.qu")
    public static class75 field1127 = new class75();

    @ObfuscatedName("client.qm")
    public static final class73 field961 = new class73();

    @ObfuscatedName("client.qw")
    public static int[] field1130 = new int[50];

    @ObfuscatedName("client.qh")
    public static int[] field1087 = new int[50];

    @ObfuscatedName("v.ek(I)Lkz;")
    public static class298 method14() {
        return Statics.field1128;
    }

    @ObfuscatedName("client.af(I)V")
    public final void method820() {
    }

    public final void init() {
        if (!this.method860()) {
            return;
        }
        class283[] var1 = new class283[] { class283.field3772, class283.field3764, class283.field3761, class283.field3769, class283.field3762, class283.field3766, class283.field3760, class283.field3771, class283.field3770, class283.field3773, class283.field3763, class283.field3768, class283.field3765, class283.field3767, class283.field3759 };
        class283[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class283 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3774);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3774)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class88.field1311)) {
                            field874 = true;
                        } else {
                            field874 = false;
                        }
                        break;
                    case 2:
                        field873 = Integer.parseInt(var5);
                        break;
                    case 3:
                        Statics.field481 = Integer.parseInt(var5);
                        break;
                    case 4:
                        Statics.field825 = var5;
                    case 5:
                    case 13:
                    case 14:
                    default:
                        break;
                    case 6:
                        Statics.field529 = (class240) class176.method676(class240.method1991(), Integer.parseInt(var5));
                        if (Statics.field529 == class240.field3261) {
                            Statics.field719 = class299.field3911;
                        } else {
                            Statics.field719 = class299.field3919;
                        }
                        break;
                    case 7:
                        Statics.field512 = var5;
                        break;
                    case 8:
                        field1061 = Integer.parseInt(var5);
                        break;
                    case 9:
                        field872 = Integer.parseInt(var5);
                        break;
                    case 10:
                        Statics.field2444 = Integer.parseInt(var5);
                        break;
                    case 11:
                        if (var5.equalsIgnoreCase(class88.field1311)) {
                        }
                        break;
                    case 12:
                        field871 = Integer.parseInt(var5);
                        break;
                    case 15:
                        Statics.field690 = class239.method3820(Integer.parseInt(var5));
                }
            }
        }
        Statics.method1066();
        Statics.field2130 = this.getCodeBase().getHost();
        String var6 = Statics.field690.field3249;
        byte var7 = 0;
        try {
            Statics.field2159 = 17;
            Statics.field3343 = var7;
            try {
                Statics.field3684 = System.getProperty("os.name");
            } catch (Exception var21) {
                Statics.field3684 = "Unknown";
            }
            Statics.field1315 = Statics.field3684.toLowerCase();
            try {
                Statics.field1605 = System.getProperty("user.home");
                if (Statics.field1605 != null) {
                    Statics.field1605 = Statics.field1605 + "/";
                }
            } catch (Exception var20) {
            }
            try {
                if (Statics.field1315.startsWith("win")) {
                    if (Statics.field1605 == null) {
                        Statics.field1605 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1605 == null) {
                    Statics.field1605 = System.getenv("HOME");
                }
                if (Statics.field1605 != null) {
                    Statics.field1605 = Statics.field1605 + "/";
                }
            } catch (Exception var19) {
            }
            if (Statics.field1605 == null) {
                Statics.field1605 = "~/";
            }
            Statics.field561 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1605, "/tmp/", "" };
            Statics.field2165 = new String[] { ".jagex_cache_" + Statics.field3343, ".file_store_" + Statics.field3343 };
            label122: for (int var11 = 0; var11 < 4; var11++) {
                Statics.field329 = class157.method1631("oldschool", var6, var11);
                if (!Statics.field329.exists()) {
                    Statics.field329.mkdirs();
                }
                File[] var12 = Statics.field329.listFiles();
                if (var12 == null) {
                    break;
                }
                File[] var13 = var12;
                int var14 = 0;
                while (true) {
                    if (var14 >= var13.length) {
                        break label122;
                    }
                    File var15 = var13[var14];
                    if (!class157.method221(var15, false)) {
                        break;
                    }
                    var14++;
                }
            }
            File var16 = Statics.field329;
            Statics.field2168 = var16;
            if (!Statics.field2168.exists()) {
                throw new RuntimeException("");
            }
            class159.field2170 = true;
            class157.method586();
            class157.field2163 = new class123(new class124(class159.method3878("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class157.field2160 = new class123(new class124(class159.method3878("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2157 = new class123[Statics.field2159];
            for (int var17 = 0; var17 < Statics.field2159; var17++) {
                Statics.field2157[var17] = new class123(new class124(class159.method3878("main_file_cache.idx" + var17), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var22) {
            class154.method355((String) null, var22);
        }
        Statics.field247 = this;
        this.method800(765, 503, 157);
    }

    @ObfuscatedName("client.at(I)V")
    public final void method878() {
        class182.method2755(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field1457 = field873 == 0 ? 43594 : field871 + 40000;
        Statics.field816 = field873 == 0 ? 443 : field871 + 50000;
        Statics.field251 = Statics.field1457;
        Statics.field2702 = class222.field2708;
        Statics.field2703 = class222.field2710;
        Statics.field267 = class222.field2711;
        Statics.field3740 = class222.field2709;
        Statics.field3254 = new class149();
        this.method865();
        this.method795();
        Statics.field650 = this.method791();
        Statics.field2126 = new class162(255, class157.field2163, class157.field2160, 500000);
        Statics.field2494 = class81.method75();
        this.method792();
        String var2 = Statics.field28;
        class57.field654 = this;
        class57.field643 = var2;
        if (field873 != 0) {
            field941 = true;
        }
        method181(Statics.field2494.field1231);
    }

    @ObfuscatedName("client.an(I)V")
    public final void method817() {
        field1054++;
        this.method1113();
        while (true) {
            class201 var1 = class244.field3298;
            class241 var2;
            synchronized (class244.field3298) {
                var2 = (class241) class244.field3296.method3499();
            }
            if (var2 == null) {
                class211.method512();
                method1645();
                Statics.method665();
                class60 var4 = class60.field708;
                synchronized (class60.field708) {
                    class60.field707 = class60.field718;
                    class60.field705 = class60.field704;
                    class60.field709 = class60.field706;
                    class60.field714 = class60.field710;
                    class60.field715 = class60.field711;
                    class60.field716 = class60.field712;
                    class60.field702 = class60.field713;
                    class60.field710 = 0;
                }
                if (Statics.field650 != null) {
                    int var6 = Statics.field650.method689();
                    field1048 = var6;
                }
                if (field877 == 0) {
                    method1797();
                    Statics.field698.method2778();
                    for (int var7 = 0; var7 < 32; var7++) {
                        field670[var7] = 0L;
                    }
                    for (int var8 = 0; var8 < 32; var8++) {
                        field672[var8] = 0L;
                    }
                    Statics.field250 = 0;
                } else if (field877 == 5) {
                    class92.method2743(this);
                    method1797();
                    Statics.field698.method2778();
                    for (int var9 = 0; var9 < 32; var9++) {
                        field670[var9] = 0L;
                    }
                    for (int var10 = 0; var10 < 32; var10++) {
                        field672[var10] = 0L;
                    }
                    Statics.field250 = 0;
                } else if (field877 == 10 || field877 == 11) {
                    class92.method2743(this);
                } else if (field877 == 20) {
                    class92.method2743(this);
                    this.method1116();
                } else if (field877 == 25) {
                    method1767();
                }
                if (field877 == 30) {
                    this.method1117();
                } else if (field877 == 40 || field877 == 45) {
                    this.method1116();
                }
                return;
            }
            var2.field3271.method4039(var2.field3267, (int) var2.field2563, var2.field3266, false);
        }
    }

    @ObfuscatedName("client.ah(ZI)V")
    public final void method884(boolean arg0) {
        boolean var2;
        label145: {
            try {
                if (class211.field2595 == 2) {
                    if (Statics.field2602 == null) {
                        Statics.field2602 = class217.method3751(Statics.field2517, Statics.field2599, Statics.field2600);
                        if (Statics.field2602 == null) {
                            var2 = false;
                            break label145;
                        }
                    }
                    if (Statics.field540 == null) {
                        Statics.field540 = new class112(Statics.field2598, Statics.field3811);
                    }
                    if (Statics.field2597.method3568(Statics.field2602, Statics.field2601, Statics.field540, 22050)) {
                        Statics.field2597.method3569();
                        Statics.field2597.method3566(Statics.field486);
                        Statics.field2597.method3572(Statics.field2602, Statics.field2596);
                        class211.field2595 = 0;
                        Statics.field2602 = null;
                        Statics.field540 = null;
                        Statics.field2517 = null;
                        var2 = true;
                        break label145;
                    }
                }
            } catch (Exception var11) {
                var11.printStackTrace();
                Statics.field2597.method3664();
                class211.field2595 = 0;
                Statics.field2602 = null;
                Statics.field540 = null;
                Statics.field2517 = null;
            }
            var2 = false;
        }
        if (var2 && field1089 && Statics.field19 != null) {
            Statics.field19.method1934();
        }
        if ((field877 == 10 || field877 == 20 || field877 == 30) && field1031 != 0L && class183.method4541() > field1031) {
            int var5 = field1097 ? 2 : 1;
            method181(var5);
        }
        if (arg0) {
            for (int var6 = 0; var6 < 100; var6++) {
                field1056[var6] = true;
            }
        }
        if (field877 == 0) {
            this.method816(class92.field1349, class92.field1350, arg0);
        } else if (field877 == 5) {
            class92.method2262(Statics.field321, Statics.field581, Statics.field598, arg0);
        } else if (field877 == 10 || field877 == 11) {
            class92.method2262(Statics.field321, Statics.field581, Statics.field598, arg0);
        } else if (field877 == 20) {
            class92.method2262(Statics.field321, Statics.field581, Statics.field598, arg0);
        } else if (field877 == 25) {
            if (field921 == 1) {
                if (field1030 > field918) {
                    field918 = field1030;
                }
                int var7 = (field918 * 50 - field1030 * 50) / field918;
                method1033(class233.field3103 + class88.field1313 + class88.field1310 + var7 + "%" + class88.field1308, false);
            } else if (field921 == 2) {
                if (field919 > field920) {
                    field920 = field919;
                }
                int var8 = (field920 * 50 - field919 * 50) / field920 + 50;
                method1033(class233.field3103 + class88.field1313 + class88.field1310 + var8 + "%" + class88.field1308, false);
            } else {
                method1033(class233.field3103, false);
            }
        } else if (field877 == 30) {
            this.method1119();
        } else if (field877 == 40) {
            method1033(class233.field2934 + class88.field1313 + class233.field2935, false);
        } else if (field877 == 45) {
            method1033(class233.field3112, false);
        }
        if (field877 == 30 && field1063 == 0 && !arg0 && !field1097) {
            for (int var9 = 0; var9 < field981; var9++) {
                if (field1057[var9]) {
                    Statics.field780.method777(field1059[var9], field931[var9], field1037[var9], field1013[var9]);
                    field1057[var9] = false;
                }
            }
        } else if (field877 > 0) {
            Statics.field780.method776(0, 0);
            for (int var10 = 0; var10 < field981; var10++) {
                field1057[var10] = false;
            }
        }
    }

    @ObfuscatedName("client.am(B)V")
    public final void method863() {
        if (Statics.field10.method1717()) {
            Statics.field10.method1714();
        }
        if (Statics.field32 != null) {
            Statics.field32.field804 = false;
        }
        Statics.field32 = null;
        field953.method1802();
        class51.method2921();
        if (class60.field708 != null) {
            class60 var1 = class60.field708;
            synchronized (class60.field708) {
                class60.field708 = null;
            }
        }
        Statics.field650 = null;
        if (Statics.field19 != null) {
            Statics.field19.method1937();
        }
        if (Statics.field280 != null) {
            Statics.field280.method1937();
        }
        class246.method1578();
        Object var3 = class244.field3301;
        synchronized (class244.field3301) {
            if (class244.field3297 != 0) {
                class244.field3297 = 1;
                try {
                    class244.field3301.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        if (Statics.field3254 != null) {
            Statics.field3254.method2763();
            Statics.field3254 = null;
        }
        try {
            class157.field2163.method2221();
            for (int var6 = 0; var6 < Statics.field2159; var6++) {
                Statics.field2157[var6].method2221();
            }
            class157.field2160.method2221();
            class157.field2161.method2221();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("kp.et(II)V")
    public static void method4762(int arg0) {
        if (field877 == arg0) {
            return;
        }
        if (field877 == 0) {
            Statics.field247.method877();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field925 = 0;
            field901 = 0;
            field903 = 0;
            field971.method4726(arg0);
            if (arg0 != 20) {
                method3914(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field824 != null) {
            Statics.field824.method2851();
            Statics.field824 = null;
        }
        if (field877 == 25) {
            field921 = 0;
            field1030 = 0;
            field918 = 1;
            field919 = 0;
            field920 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class92.method1053(Statics.field1564, Statics.field1426, true, 0);
        } else if (arg0 == 20) {
            class92.method1053(Statics.field1564, Statics.field1426, true, field877 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class92.method1053(Statics.field1564, Statics.field1426, false, 4);
        } else if (Statics.field1362) {
            Statics.field1334 = null;
            Statics.field1335 = null;
            Statics.field1336 = null;
            Statics.field1337 = null;
            Statics.field1369 = null;
            Statics.field1342 = null;
            Statics.field1340 = null;
            Statics.field2047 = null;
            Statics.field3860 = null;
            Statics.field411 = null;
            Statics.field3432 = null;
            Statics.field652 = null;
            Statics.field351 = null;
            Statics.field751 = null;
            Statics.field868 = null;
            Statics.field1459 = null;
            Statics.field822 = null;
            Statics.field3654 = null;
            Statics.field3244 = null;
            Statics.field467 = null;
            Statics.field1289 = null;
            Statics.field282 = null;
            class211.method511(2);
            class246.method255(true);
            Statics.field1362 = false;
        }
        field877 = arg0;
    }

    @ObfuscatedName("client.er(I)V")
    public void method1113() {
        if (field877 != 1000) {
            boolean var1 = class246.method3();
            if (!var1) {
                this.method1167();
            }
        }
    }

    @ObfuscatedName("client.fs(I)V")
    public void method1167() {
        if (class246.field3331 >= 4) {
            this.method901("js5crc");
            field877 = 1000;
            return;
        }
        if (class246.field3332 >= 4) {
            if (field877 <= 5) {
                this.method901("js5io");
                field877 = 1000;
                return;
            }
            field899 = 3000;
            class246.field3332 = 3;
        }
        if (--field899 + 1 > 0) {
            return;
        }
        try {
            if (field898 == 0) {
                Statics.field550 = Statics.field671.method2796(Statics.field2130, Statics.field251);
                field898++;
            }
            if (field898 == 1) {
                if (Statics.field550.field2141 == 2) {
                    this.method1115(-1);
                    return;
                }
                if (Statics.field550.field2141 == 1) {
                    field898++;
                }
            }
            if (field898 == 2) {
                Statics.field2707 = new class161((Socket) Statics.field550.field2147, Statics.field671, 5000);
                class181 var1 = new class181(5);
                var1.method2996(15);
                var1.method2999(157);
                Statics.field2707.method2828(var1.field2499, 0, 5);
                field898++;
                Statics.field296 = class183.method4541();
            }
            if (field898 == 3) {
                if (field877 <= 5 || Statics.field2707.method2829() > 0) {
                    int var2 = Statics.field2707.method2830();
                    if (var2 != 0) {
                        this.method1115(var2);
                        return;
                    }
                    field898++;
                } else if (class183.method4541() - Statics.field296 > 30000L) {
                    this.method1115(-2);
                    return;
                }
            }
            if (field898 == 4) {
                class161 var3 = Statics.field2707;
                boolean var4 = field877 > 20;
                if (Statics.field3317 != null) {
                    try {
                        Statics.field3317.method2851();
                    } catch (Exception var14) {
                    }
                    Statics.field3317 = null;
                }
                Statics.field3317 = var3;
                class246.method255(var4);
                class246.field3326.field2498 = 0;
                Statics.field2113 = null;
                Statics.field2079 = null;
                class246.field3318 = 0;
                while (true) {
                    class242 var6 = (class242) class246.field3319.method3433();
                    if (var6 == null) {
                        while (true) {
                            class242 var7 = (class242) class246.field3314.method3433();
                            if (var7 == null) {
                                if (class246.field3330 != 0) {
                                    try {
                                        class181 var8 = new class181(4);
                                        var8.method2996(4);
                                        var8.method2996(class246.field3330);
                                        var8.method2997(0);
                                        Statics.field3317.method2828(var8.field2499, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field3317.method2851();
                                        } catch (Exception var12) {
                                        }
                                        class246.field3332++;
                                        Statics.field3317 = null;
                                    }
                                }
                                class246.field3315 = 0;
                                Statics.field3316 = class183.method4541();
                                Statics.field550 = null;
                                Statics.field2707 = null;
                                field898 = 0;
                                field900 = 0;
                                return;
                            }
                            class246.field3327.method3370(var7);
                            class246.field3322.method3431(var7, var7.field2563);
                            class246.field3328++;
                            class246.field3325--;
                        }
                    }
                    class246.field3323.method3431(var6, var6.field2563);
                    class246.field3321++;
                    class246.field3324--;
                }
            }
        } catch (IOException var15) {
            this.method1115(-3);
        }
    }

    @ObfuscatedName("client.fq(IB)V")
    public void method1115(int arg0) {
        Statics.field550 = null;
        Statics.field2707 = null;
        field898 = 0;
        if (Statics.field251 == Statics.field1457) {
            Statics.field251 = Statics.field816;
        } else {
            Statics.field251 = Statics.field1457;
        }
        field900++;
        if (field900 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field877 <= 5) {
                this.method901("js5connect_full");
                field877 = 1000;
            } else {
                field899 = 3000;
            }
        } else if (field900 >= 2 && arg0 == 6) {
            this.method901("js5connect_outofdate");
            field877 = 1000;
        } else if (field900 >= 4) {
            if (field877 <= 5) {
                this.method901("js5connect");
                field877 = 1000;
            } else {
                field899 = 3000;
            }
        }
    }

    @ObfuscatedName("cx.fp(I)V")
    public static void method1797() {
        if (field939 == 0) {
            Statics.field649 = new class139(4, 104, 104, class62.field740);
            for (int var0 = 0; var0 < 4; var0++) {
                field922[var0] = new class163(104, 104);
            }
            Statics.field508 = new class295(512, 512);
            class92.field1350 = class233.field2936;
            class92.field1349 = 5;
            field939 = 20;
        } else if (field939 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class136.field1947[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class139.method2585(var1, 500, 800, 512, 334);
            class92.field1350 = class233.field3081;
            class92.field1349 = 10;
            field939 = 30;
        } else if (field939 == 30) {
            Statics.field1420 = method2740(0, false, true, true);
            Statics.field428 = method2740(1, false, true, true);
            Statics.field307 = method2740(2, true, false, true);
            Statics.field2116 = method2740(3, false, true, true);
            Statics.field1839 = method2740(4, false, true, true);
            Statics.field648 = method2740(5, true, true, true);
            Statics.field334 = method2740(6, true, true, false);
            Statics.field592 = method2740(7, false, true, true);
            Statics.field1426 = method2740(8, false, true, true);
            Statics.field274 = method2740(9, false, true, true);
            Statics.field1564 = method2740(10, false, true, true);
            Statics.field3233 = method2740(11, false, true, true);
            Statics.field549 = method2740(12, false, true, true);
            Statics.field383 = method2740(13, true, false, true);
            Statics.field498 = method2740(14, false, true, false);
            Statics.field2453 = method2740(15, false, true, true);
            Statics.field632 = method2740(16, false, true, false);
            class92.field1350 = class233.field3089;
            class92.field1349 = 20;
            field939 = 40;
        } else if (field939 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1420.method4055() * 4 / 100;
            int var8 = var7 + Statics.field428.method4055() * 4 / 100;
            int var9 = var8 + Statics.field307.method4055() * 2 / 100;
            int var10 = var9 + Statics.field2116.method4055() * 2 / 100;
            int var11 = var10 + Statics.field1839.method4055() * 6 / 100;
            int var12 = var11 + Statics.field648.method4055() * 4 / 100;
            int var13 = var12 + Statics.field334.method4055() * 2 / 100;
            int var14 = var13 + Statics.field592.method4055() * 58 / 100;
            int var15 = var14 + Statics.field1426.method4055() * 2 / 100;
            int var16 = var15 + Statics.field274.method4055() * 2 / 100;
            int var17 = var16 + Statics.field1564.method4055() * 2 / 100;
            int var18 = var17 + Statics.field3233.method4055() * 2 / 100;
            int var19 = var18 + Statics.field549.method4055() * 2 / 100;
            int var20 = var19 + Statics.field383.method4055() * 2 / 100;
            int var21 = var20 + Statics.field498.method4055() * 2 / 100;
            int var22 = var21 + Statics.field2453.method4055() * 2 / 100;
            int var23 = var22 + Statics.field632.method4055() * 2 / 100;
            if (var23 == 100) {
                class92.field1350 = class233.field2940;
                class92.field1349 = 30;
                field939 = 45;
            } else {
                if (var23 != 0) {
                    class92.field1350 = class233.field2993 + var23 + "%";
                }
                class92.field1349 = 30;
            }
        } else if (field939 == 45) {
            class109.method99(22050, !field875, 2);
            class212 var24 = new class212();
            var24.method3574(9, 128);
            Statics.field19 = class109.method2548(Statics.field671, 0, 22050);
            Statics.field19.method1932(var24);
            class211.method191(Statics.field2453, Statics.field498, Statics.field1839, var24);
            Statics.field280 = class109.method2548(Statics.field671, 1, 2048);
            Statics.field3676 = new class102();
            Statics.field280.method1932(Statics.field3676);
            Statics.field2921 = new class116(22050, Statics.field1554);
            class92.field1350 = class233.field2941;
            class92.field1349 = 35;
            field939 = 50;
            Statics.field582 = new class270(Statics.field1426, Statics.field383);
        } else if (field939 == 50) {
            int var25 = class269.method4540().length;
            field916 = Statics.field582.method4544(class269.method4540());
            if (field916.size() < var25) {
                class92.field1350 = class233.field2942 + field916.size() * 100 / var25 + "%";
                class92.field1349 = 40;
            } else {
                Statics.field581 = (class271) field916.get(class269.field3678);
                Statics.field598 = (class271) field916.get(class269.field3674);
                Statics.field321 = (class271) field916.get(class269.field3679);
                Statics.field1204 = new class301(true);
                class92.field1350 = class233.field2943;
                class92.field1349 = 40;
                field939 = 60;
            }
        } else if (field939 == 60) {
            int var26 = class92.method2825(Statics.field1564, Statics.field1426);
            byte var27 = 11;
            if (var26 < var27) {
                class92.field1350 = class233.field2944 + var26 * 100 / var27 + "%";
                class92.field1349 = 50;
            } else {
                class92.field1350 = class233.field2945;
                class92.field1349 = 50;
                method4762(5);
                field939 = 70;
            }
        } else if (field939 == 70) {
            if (Statics.field307.method3934()) {
                class267.method4075(Statics.field307);
                class245 var29 = Statics.field307;
                Statics.field3401 = var29;
                class245 var30 = Statics.field307;
                class245 var31 = Statics.field592;
                Statics.field3404 = var30;
                Statics.field3410 = var31;
                Statics.field3408 = Statics.field3404.method3941(3);
                class245 var32 = Statics.field307;
                class245 var33 = Statics.field592;
                boolean var34 = field875;
                Statics.field3487 = var32;
                Statics.field3489 = var33;
                class263.field3531 = var34;
                class245 var35 = Statics.field307;
                class245 var36 = Statics.field592;
                Statics.field3616 = var35;
                Statics.field3605 = var36;
                class260.method179(Statics.field307);
                class245 var37 = Statics.field307;
                class245 var38 = Statics.field592;
                boolean var39 = field874;
                class271 var40 = Statics.field581;
                Statics.field3596 = var37;
                Statics.field3539 = var38;
                Statics.field3334 = var39;
                Statics.field3544 = Statics.field3596.method3941(10);
                Statics.field3548 = var40;
                class245 var41 = Statics.field307;
                class245 var42 = Statics.field1420;
                class245 var43 = Statics.field428;
                Statics.field18 = var41;
                Statics.field3668 = var42;
                Statics.field3666 = var43;
                class253.method2979(Statics.field307, Statics.field592);
                class258.method189(Statics.field307);
                class245 var44 = Statics.field307;
                Statics.field627 = var44;
                Statics.field3345 = Statics.field627.method3941(16);
                class245 var45 = Statics.field2116;
                class245 var46 = Statics.field592;
                class245 var47 = Statics.field1426;
                class245 var48 = Statics.field383;
                Statics.field575 = var45;
                Statics.field2719 = var46;
                Statics.field387 = var47;
                Statics.field2720 = var48;
                Statics.field3299 = new class224[Statics.field575.method3942()][];
                Statics.field243 = new boolean[Statics.field575.method3942()];
                class245 var49 = Statics.field307;
                Statics.field3341 = var49;
                class245 var50 = Statics.field307;
                Statics.field3457 = var50;
                class251.method3906(Statics.field307);
                class252.method2975(Statics.field307);
                class245 var51 = Statics.field307;
                Statics.field3447 = var51;
                Statics.field10 = new class96();
                class262.method1031(Statics.field307, Statics.field1426, Statics.field383);
                class256.method2734(Statics.field307, Statics.field1426);
                class245 var52 = Statics.field307;
                class245 var53 = Statics.field1426;
                Statics.field3366 = var53;
                if (var52.method3934()) {
                    Statics.field3351 = var52.method3941(35);
                    Statics.field3359 = new class250[Statics.field3351];
                    for (int var54 = 0; var54 < Statics.field3351; var54++) {
                        byte[] var55 = var52.method3930(35, var54);
                        if (var55 != null) {
                            Statics.field3359[var54] = new class250(var54);
                            Statics.field3359[var54].method4100(new class181(var55));
                            Statics.field3359[var54].method4102();
                        }
                    }
                }
                class92.field1350 = class233.field2947;
                class92.field1349 = 60;
                field939 = 80;
            } else {
                class92.field1350 = class233.field2946 + Statics.field307.method4041() + "%";
                class92.field1349 = 60;
            }
        } else if (field939 == 80) {
            int var56 = 0;
            if (Statics.field21 == null) {
                Statics.field21 = class296.method3889(Statics.field1426, "compass", "");
            } else {
                var56++;
            }
            if (Statics.field485 == null) {
                Statics.field485 = class296.method3889(Statics.field1426, "mapedge", "");
            } else {
                var56++;
            }
            if (Statics.field3251 == null) {
                Statics.field3251 = class296.method2775(Statics.field1426, "mapscene", "");
            } else {
                var56++;
            }
            if (Statics.field1682 == null) {
                Statics.field1682 = class296.method3223(Statics.field1426, "headicons_pk", "");
            } else {
                var56++;
            }
            if (Statics.field831 == null) {
                Statics.field831 = class296.method3223(Statics.field1426, "headicons_prayer", "");
            } else {
                var56++;
            }
            if (Statics.field2912 == null) {
                Statics.field2912 = class296.method3223(Statics.field1426, "headicons_hint", "");
            } else {
                var56++;
            }
            if (Statics.field802 == null) {
                Statics.field802 = class296.method3223(Statics.field1426, "mapmarker", "");
            } else {
                var56++;
            }
            if (Statics.field1288 == null) {
                Statics.field1288 = class296.method3223(Statics.field1426, "cross", "");
            } else {
                var56++;
            }
            if (Statics.field242 == null) {
                Statics.field242 = class296.method3223(Statics.field1426, "mapdots", "");
            } else {
                var56++;
            }
            if (Statics.field628 == null) {
                Statics.field628 = class296.method2775(Statics.field1426, "scrollbar", "");
            } else {
                var56++;
            }
            if (Statics.field2501 == null) {
                Statics.field2501 = class296.method2775(Statics.field1426, "mod_icons", "");
            } else {
                var56++;
            }
            if (var56 < 11) {
                class92.field1350 = class233.field3090 + var56 * 100 / 12 + "%";
                class92.field1349 = 70;
            } else {
                Statics.field3704 = Statics.field2501;
                Statics.field485.method4893();
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 41.0D) - 20;
                Statics.field3251[0].method4859(var57 + var60, var58 + var60, var59 + var60);
                class92.field1350 = class233.field3179;
                class92.field1349 = 70;
                field939 = 90;
            }
        } else if (field939 == 90) {
            if (Statics.field274.method3934()) {
                class125 var61 = new class125(Statics.field274, Statics.field1426, 20, 0.8D, field875 ? 64 : 128);
                class136.method2540(var61);
                class136.method2534(0.8D);
                class92.field1350 = class233.field2951;
                class92.field1349 = 90;
                field939 = 110;
            } else {
                class92.field1350 = class233.field3007 + Statics.field274.method4041() + "%";
                class92.field1349 = 90;
            }
        } else if (field939 == 110) {
            Statics.field32 = new class71();
            Statics.field671.method2797(Statics.field32, 10);
            class92.field1350 = class233.field2952;
            class92.field1349 = 92;
            field939 = 120;
        } else if (field939 == 120) {
            if (Statics.field1564.method3946("huffman", "")) {
                class173 var62 = new class173(Statics.field1564.method3959("huffman", ""));
                Statics.field3718 = var62;
                class92.field1350 = class233.field3050;
                class92.field1349 = 94;
                field939 = 130;
            } else {
                class92.field1350 = class233.field2953 + "%";
                class92.field1349 = 94;
            }
        } else if (field939 == 130) {
            if (!Statics.field2116.method3934()) {
                class92.field1350 = class233.field2955 + Statics.field2116.method4041() * 4 / 5 + "%";
                class92.field1349 = 96;
            } else if (!Statics.field549.method3934()) {
                class92.field1350 = class233.field2955 + (80 + Statics.field549.method4041() / 6) + "%";
                class92.field1349 = 96;
            } else if (Statics.field383.method3934()) {
                class92.field1350 = class233.field2956;
                class92.field1349 = 98;
                field939 = 140;
            } else {
                class92.field1350 = class233.field2955 + (96 + Statics.field383.method4041() / 50) + "%";
                class92.field1349 = 96;
            }
        } else if (field939 == 140) {
            class92.field1349 = 100;
            if (Statics.field632.method3951(class41.field515.field513)) {
                if (Statics.field1128 == null) {
                    Statics.field1128 = new class298();
                    Statics.field1128.method5027(Statics.field632, Statics.field321, field916, Statics.field3251);
                }
                int var63 = Statics.field1128.method5088();
                if (var63 < 100) {
                    class92.field1350 = class233.field3169 + (var63 * 9 / 10 + 10) + "%";
                } else {
                    class92.field1350 = class233.field2958;
                    field939 = 150;
                }
            } else {
                class92.field1350 = class233.field3169 + Statics.field632.method3974(class41.field515.field513) / 10 + "%";
            }
        } else if (field939 == 150) {
            method4762(10);
        }
    }

    @ObfuscatedName("ea.ff(IZZZB)Liy;")
    public static class245 method2740(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class162 var4 = null;
        if (class157.field2163 != null) {
            var4 = new class162(arg0, class157.field2163, Statics.field2157[arg0], 1000000);
        }
        return new class245(var4, Statics.field2126, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ft(I)V")
    public final void method1116() {
        class161 var1 = field953.method1786();
        class187 var2 = field953.field1470;
        try {
            if (field925 == 0) {
                if (var1 != null) {
                    var1.method2851();
                    var1 = null;
                }
                Statics.field29 = null;
                field914 = false;
                field901 = 0;
                field925 = 1;
            }
            if (field925 == 1) {
                if (Statics.field29 == null) {
                    Statics.field29 = Statics.field671.method2796(Statics.field2130, Statics.field251);
                }
                if (Statics.field29.field2141 == 2) {
                    throw new IOException();
                }
                if (Statics.field29.field2141 == 1) {
                    field953.method1784(new class161((Socket) Statics.field29.field2147, Statics.field671, 5000));
                    var1 = field953.method1786();
                    Statics.field29 = null;
                    field925 = 2;
                }
            }
            if (field925 == 2) {
                field953.method1781();
                class171 var3 = class171.method50();
                var3.field2425 = null;
                var3.field2428 = 0;
                var3.field2424 = new class187(5000);
                var3.field2424.method2996(class169.field2408.field2409);
                field953.method1783(var3);
                field953.method1790();
                var2.field2498 = 0;
                field925 = 3;
            }
            if (field925 == 3) {
                if (Statics.field19 != null) {
                    Statics.field19.method1938();
                }
                if (Statics.field280 != null) {
                    Statics.field280.method1938();
                }
                int var6 = var1.method2830();
                if (Statics.field19 != null) {
                    Statics.field19.method1938();
                }
                if (Statics.field280 != null) {
                    Statics.field280.method1938();
                }
                if (var6 != 0) {
                    method261(var6);
                    return;
                }
                var2.field2498 = 0;
                field925 = 4;
            }
            if (field925 == 4) {
                if (var2.field2498 < 8) {
                    int var7 = var1.method2829();
                    if (var7 > 8 - var2.field2498) {
                        var7 = 8 - var2.field2498;
                    }
                    if (var7 > 0) {
                        var1.method2833(var2.field2499, var2.field2498, var7);
                        var2.field2498 += var7;
                    }
                }
                if (var2.field2498 == 8) {
                    var2.field2498 = 0;
                    Statics.field745 = var2.method3018();
                    field925 = 5;
                }
            }
            if (field925 == 5) {
                field953.field1470.field2498 = 0;
                field953.method1781();
                class187 var8 = new class187(500);
                int[] var9 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field745 >> 32), (int) (Statics.field745 & 0xFFFFFFFFFFFFFFFFL) };
                var8.field2498 = 0;
                var8.method2996(1);
                var8.method2996(field905.method9());
                var8.method2999(var9[0]);
                var8.method2999(var9[1]);
                var8.method2999(var9[2]);
                var8.method2999(var9[3]);
                switch(field905.field2119) {
                    case 0:
                    case 3:
                        var8.method2998(Statics.field1430);
                        var8.field2498 += 5;
                        break;
                    case 1:
                        var8.method2999((Integer) Statics.field2494.field1234.get(class278.method3747(class92.field1343)));
                        var8.field2498 += 4;
                        break;
                    case 2:
                        var8.field2498 += 8;
                }
                var8.method3003(class92.field1364);
                var8.method3034(class90.field1322, class90.field1323);
                class171 var10 = class171.method50();
                var10.field2425 = null;
                var10.field2428 = 0;
                var10.field2424 = new class187(5000);
                var10.field2424.field2498 = 0;
                if (field877 == 40) {
                    var10.field2424.method2996(class169.field2405.field2409);
                } else {
                    var10.field2424.method2996(class169.field2407.field2409);
                }
                var10.field2424.method2997(0);
                int var13 = var10.field2424.field2498;
                var10.field2424.method2999(157);
                var10.field2424.method3006(var8.field2499, 0, var8.field2498);
                int var14 = var10.field2424.field2498;
                var10.field2424.method3003(class92.field1343);
                var10.field2424.method2996((field1097 ? 1 : 0) << 1 | (field875 ? 1 : 0));
                var10.field2424.method2997(Statics.field1842);
                var10.field2424.method2997(Statics.field1324);
                method3739(var10.field2424);
                var10.field2424.method3003(Statics.field512);
                var10.field2424.method2999(Statics.field481);
                class181 var15 = new class181(Statics.field1204.method5217());
                Statics.field1204.method5216(var15);
                var10.field2424.method3006(var15.field2499, 0, var15.field2499.length);
                var10.field2424.method2996(Statics.field2444);
                var10.field2424.method2999(0);
                var10.field2424.method2999(Statics.field1420.field3279);
                var10.field2424.method2999(Statics.field428.field3279);
                var10.field2424.method2999(Statics.field307.field3279);
                var10.field2424.method2999(Statics.field2116.field3279);
                var10.field2424.method2999(Statics.field1839.field3279);
                var10.field2424.method2999(Statics.field648.field3279);
                var10.field2424.method2999(Statics.field334.field3279);
                var10.field2424.method2999(Statics.field592.field3279);
                var10.field2424.method2999(Statics.field1426.field3279);
                var10.field2424.method2999(Statics.field274.field3279);
                var10.field2424.method2999(Statics.field1564.field3279);
                var10.field2424.method2999(Statics.field3233.field3279);
                var10.field2424.method2999(Statics.field549.field3279);
                var10.field2424.method2999(Statics.field383.field3279);
                var10.field2424.method2999(Statics.field498.field3279);
                var10.field2424.method2999(Statics.field2453.field3279);
                var10.field2424.method2999(Statics.field632.field3279);
                var10.field2424.method3139(var9, var14, var10.field2424.field2498);
                var10.field2424.method3137(var10.field2424.field2498 - var13);
                field953.method1783(var10);
                field953.method1790();
                field953.field1479 = new class188(var9);
                for (int var16 = 0; var16 < 4; var16++) {
                    var9[var16] += 50;
                }
                var2.method3279(var9);
                field925 = 6;
            }
            if (field925 == 6 && var1.method2829() > 0) {
                int var17 = var1.method2830();
                if (var17 == 21 && field877 == 20) {
                    field925 = 7;
                } else if (var17 == 2) {
                    field925 = 9;
                } else if (var17 == 15 && field877 == 40) {
                    field953.field1472 = -1;
                    field925 = 13;
                } else if (var17 == 23 && field903 < 1) {
                    field903++;
                    field925 = 0;
                } else if (var17 == 29) {
                    field925 = 11;
                } else {
                    method261(var17);
                    return;
                }
            }
            if (field925 == 7 && var1.method2829() > 0) {
                field904 = (var1.method2830() + 3) * 60;
                field925 = 8;
            }
            if (field925 == 8) {
                field901 = 0;
                class92.method39(class233.field2962, class233.field2963, field904 / 60 + class233.field3123);
                if (--field904 <= 0) {
                    field925 = 0;
                }
            } else {
                if (field925 == 9 && var1.method2829() >= 13) {
                    boolean var18 = var1.method2830() == 1;
                    var1.method2833(var2.field2499, 0, 4);
                    var2.field2498 = 0;
                    boolean var19 = false;
                    if (var18) {
                        int var20 = var2.method3293() << 24;
                        int var21 = var20 | var2.method3293() << 16;
                        int var22 = var21 | var2.method3293() << 8;
                        int var23 = var22 | var2.method3293();
                        int var24 = class278.method3747(class92.field1343);
                        if (Statics.field2494.field1234.size() >= 10 && !Statics.field2494.field1234.containsKey(var24)) {
                            Iterator var25 = Statics.field2494.field1234.entrySet().iterator();
                            var25.next();
                            var25.remove();
                        }
                        Statics.field2494.field1234.put(var24, var23);
                    }
                    if (class92.field1358) {
                        Statics.field2494.field1232 = class92.field1343;
                    } else {
                        Statics.field2494.field1232 = null;
                    }
                    class81.method2914();
                    field1017 = var1.method2830();
                    field1019 = var1.method2830() == 1;
                    field1052 = var1.method2830();
                    field1052 <<= 0x8;
                    field1052 += var1.method2830();
                    field972 = var1.method2830();
                    var1.method2833(var2.field2499, 0, 1);
                    var2.field2498 = 0;
                    class167[] var26 = class167.method2753();
                    int var27 = var2.method3276();
                    if (var27 < 0 || var27 >= var26.length) {
                        throw new IOException(var27 + " " + var2.field2498);
                    }
                    field953.field1471 = var26[var27];
                    field953.field1472 = field953.field1471.field2305;
                    var1.method2833(var2.field2499, 0, 2);
                    var2.field2498 = 0;
                    field953.field1472 = var2.method3009();
                    try {
                        class53.method728(Statics.field247, "zap");
                    } catch (Throwable var53) {
                    }
                    field925 = 10;
                }
                if (field925 != 10) {
                    if (field925 == 11 && var1.method2829() >= 2) {
                        var2.field2498 = 0;
                        var1.method2833(var2.field2499, 0, 2);
                        var2.field2498 = 0;
                        Statics.field596 = var2.method3009();
                        field925 = 12;
                    }
                    if (field925 == 12 && var1.method2829() >= Statics.field596) {
                        var2.field2498 = 0;
                        var1.method2833(var2.field2499, 0, Statics.field596);
                        var2.field2498 = 0;
                        String var44 = var2.method3021();
                        String var45 = var2.method3021();
                        String var46 = var2.method3021();
                        class92.method39(var44, var45, var46);
                        method4762(10);
                    }
                    if (field925 == 13) {
                        if (field953.field1472 == -1) {
                            if (var1.method2829() < 2) {
                                return;
                            }
                            var1.method2833(var2.field2499, 0, 2);
                            var2.field2498 = 0;
                            field953.field1472 = var2.method3009();
                        }
                        if (var1.method2829() >= field953.field1472) {
                            var1.method2833(var2.field2499, 0, field953.field1472);
                            var2.field2498 = 0;
                            int var47 = field953.field1472;
                            field971.method4743();
                            field953.method1781();
                            field953.field1470.field2498 = 0;
                            field953.field1471 = null;
                            field953.field1465 = null;
                            field953.field1477 = null;
                            field953.field1478 = null;
                            field953.field1472 = 0;
                            field953.field1476 = 0;
                            field1096 = 0;
                            method454();
                            field1086 = 0;
                            field1084 = 0;
                            for (int var48 = 0; var48 < 2048; var48++) {
                                field1113[var48] = null;
                            }
                            Statics.field601 = null;
                            for (int var49 = 0; var49 < field907.length; var49++) {
                                class86 var50 = field907[var49];
                                if (var50 != null) {
                                    var50.field1201 = -1;
                                    var50.field1171 = false;
                                }
                            }
                            class64.method742();
                            method4762(30);
                            for (int var51 = 0; var51 < 100; var51++) {
                                field1056[var51] = true;
                            }
                            method21();
                            class95.method3904(var2);
                            if (var2.field2498 != var47) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field901++;
                        if (field901 > 2000) {
                            if (field903 < 1) {
                                if (Statics.field251 == Statics.field1457) {
                                    Statics.field251 = Statics.field816;
                                } else {
                                    Statics.field251 = Statics.field1457;
                                }
                                field903++;
                                field925 = 0;
                            } else {
                                method261(-3);
                            }
                        }
                    }
                } else if (var1.method2829() >= field953.field1472) {
                    var2.field2498 = 0;
                    var1.method2833(var2.field2499, 0, field953.field1472);
                    field971.method4723();
                    field880 = 1L;
                    field883 = -1;
                    Statics.field32.field812 = 0;
                    Statics.field475 = true;
                    field884 = true;
                    field1053 = -1L;
                    class290.method4232();
                    field953.method1781();
                    field953.field1470.field2498 = 0;
                    field953.field1471 = null;
                    field953.field1465 = null;
                    field953.field1477 = null;
                    field953.field1478 = null;
                    field953.field1472 = 0;
                    field953.field1476 = 0;
                    field1096 = 0;
                    field913 = 0;
                    field917 = 0;
                    method454();
                    class60.field703 = 0;
                    class97.field1435.clear();
                    class97.field1434.method3390();
                    class97.field1428.method3544();
                    class97.field1429 = 0;
                    field1003 = 0;
                    field1005 = false;
                    field1092 = 0;
                    field934 = 0;
                    field1086 = 0;
                    field1079 = -1;
                    field1084 = 0;
                    field1085 = 0;
                    field923 = class91.field1328;
                    field942 = class91.field1328;
                    field1016 = 0;
                    class95.field1406 = 0;
                    for (int var29 = 0; var29 < 2048; var29++) {
                        class95.field1405[var29] = null;
                        class95.field1412[var29] = 1;
                    }
                    for (int var30 = 0; var30 < 2048; var30++) {
                        field1113[var30] = null;
                    }
                    for (int var31 = 0; var31 < 32768; var31++) {
                        field907[var31] = null;
                    }
                    field979 = -1;
                    field982.method3506();
                    field983.method3506();
                    for (int var32 = 0; var32 < 4; var32++) {
                        for (int var33 = 0; var33 < 104; var33++) {
                            for (int var34 = 0; var34 < 104; var34++) {
                                field887[var32][var33][var34] = null;
                            }
                        }
                    }
                    field1051 = new class201();
                    field1022 = 0;
                    field1117 = 0;
                    field1018 = 0;
                    for (int var35 = 0; var35 < Statics.field3345; var35++) {
                        class249 var36 = class249.method1109(var35);
                        if (var36 != null) {
                            class219.field2688[var35] = 0;
                            class219.field2689[var35] = 0;
                        }
                    }
                    Statics.field10.method1737();
                    field879 = -1;
                    if (field1010 != -1) {
                        int var37 = field1010;
                        if (var37 != -1 && Statics.field243[var37]) {
                            Statics.field575.method3943(var37);
                            if (Statics.field3299[var37] != null) {
                                boolean var38 = true;
                                for (int var39 = 0; var39 < Statics.field3299[var37].length; var39++) {
                                    if (Statics.field3299[var37][var39] != null) {
                                        if (Statics.field3299[var37][var39].field2809 == 2) {
                                            var38 = false;
                                        } else {
                                            Statics.field3299[var37][var39] = null;
                                        }
                                    }
                                }
                                if (var38) {
                                    Statics.field3299[var37] = null;
                                }
                                Statics.field243[var37] = false;
                            }
                        }
                    }
                    for (class68 var40 = (class68) field1026.method3433(); var40 != null; var40 = (class68) field1026.method3440()) {
                        method2748(var40, true);
                    }
                    field1010 = -1;
                    field1026 = new class198(8);
                    field1014 = null;
                    method454();
                    field1123.method3786((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var41 = 0; var41 < 8; var41++) {
                        field976[var41] = null;
                        field977[var41] = false;
                    }
                    class64.method742();
                    field878 = true;
                    for (int var42 = 0; var42 < 100; var42++) {
                        field1056[var42] = true;
                    }
                    method21();
                    field1076 = null;
                    Statics.field927 = 0;
                    Statics.field1456 = null;
                    for (int var43 = 0; var43 < 8; var43++) {
                        field1126[var43] = new class17();
                    }
                    Statics.field2447 = null;
                    class95.method3904(var2);
                    Statics.field2919 = -1;
                    method2739(false, var2);
                    field953.field1471 = null;
                }
            }
        } catch (IOException var54) {
            if (field903 < 1) {
                if (Statics.field251 == Statics.field1457) {
                    Statics.field251 = Statics.field816;
                } else {
                    Statics.field251 = Statics.field1457;
                }
                field903++;
                field925 = 0;
            } else {
                method261(-2);
            }
        }
    }

    @ObfuscatedName("as.fe(II)V")
    public static void method261(int arg0) {
        if (arg0 == -3) {
            class92.method39(class233.field2965, class233.field2937, class233.field3045);
        } else if (arg0 == -2) {
            class92.method39(class233.field2974, class233.field2969, class233.field2970);
        } else if (arg0 == -1) {
            class92.method39(class233.field3193, class233.field2972, class233.field2973);
        } else if (arg0 == 3) {
            class92.field1338 = 3;
        } else if (arg0 == 4) {
            class92.method39(class233.field3012, class233.field2975, class233.field3167);
        } else if (arg0 == 5) {
            class92.method39(class233.field3047, class233.field2978, class233.field2979);
        } else if (arg0 == 6) {
            class92.method39(class233.field2939, class233.field2981, class233.field2982);
        } else if (arg0 == 7) {
            class92.method39(class233.field2983, class233.field2984, class233.field3125);
        } else if (arg0 == 8) {
            class92.method39(class233.field2986, class233.field2987, class233.field2988);
        } else if (arg0 == 9) {
            class92.method39(class233.field2989, class233.field2990, class233.field2991);
        } else if (arg0 == 10) {
            class92.method39(class233.field2992, class233.field2985, class233.field2994);
        } else if (arg0 == 11) {
            class92.method39(class233.field2995, class233.field3172, class233.field2938);
        } else if (arg0 == 12) {
            class92.method39(class233.field3149, class233.field2999, class233.field3000);
        } else if (arg0 == 13) {
            class92.method39(class233.field3001, class233.field3002, class233.field3159);
        } else if (arg0 == 14) {
            class92.method39(class233.field3029, class233.field3004, class233.field3187);
        } else if (arg0 == 16) {
            class92.method39(class233.field2996, class233.field3184, class233.field2998);
        } else if (arg0 == 17) {
            class92.method39(class233.field3010, class233.field3175, class233.field3061);
        } else if (arg0 == 18) {
            class92.method39(class233.field3013, class233.field3014, class233.field3015);
        } else if (arg0 == 19) {
            class92.method39(class233.field3163, class233.field2928, class233.field3018);
        } else if (arg0 == 20) {
            class92.method39(class233.field2971, class233.field3020, class233.field2933);
        } else if (arg0 == 22) {
            class92.method39(class233.field3017, class233.field3023, class233.field3157);
        } else if (arg0 == 23) {
            class92.method39(class233.field3105, class233.field3006, class233.field3027);
        } else if (arg0 == 24) {
            class92.method39(class233.field3028, class233.field2961, class233.field3059);
        } else if (arg0 == 25) {
            class92.method39(class233.field3031, class233.field3032, class233.field3033);
        } else if (arg0 == 26) {
            class92.method39(class233.field3034, class233.field3035, class233.field3036);
        } else if (arg0 == 27) {
            class92.method39(class233.field3122, class233.field3043, class233.field3039);
        } else if (arg0 == 31) {
            class92.method39(class233.field3046, class233.field3079, class233.field3048);
        } else if (arg0 == 32) {
            class92.method39(class233.field3093, class233.field3194, class233.field3052);
        } else if (arg0 == 37) {
            class92.method39(class233.field3150, class233.field3053, class233.field3054);
        } else if (arg0 == 38) {
            class92.method39(class233.field3055, class233.field3056, class233.field3057);
        } else if (arg0 == 55) {
            class92.method39(class233.field3058, class233.field3141, class233.field3060);
        } else if (arg0 == 56) {
            class92.method39(class233.field3188, class233.field3030, class233.field3063);
            method4762(11);
            return;
        } else if (arg0 == 57) {
            class92.method39(class233.field3019, class233.field3065, class233.field3106);
            method4762(11);
            return;
        } else {
            class92.method39(class233.field3067, class233.field3186, class233.field3069);
        }
        method4762(10);
    }

    @ObfuscatedName("fn.fa(I)V")
    public static final void method3241() {
        field953.method1802();
        method1523();
        Statics.field649.method2550();
        for (int var0 = 0; var0 < 4; var0++) {
            field922[var0].method2866();
        }
        System.gc();
        class211.method511(2);
        field1027 = -1;
        field1089 = false;
        class82.method4226();
        method4762(10);
    }

    @ObfuscatedName("cd.fd(I)V")
    public static final void method1523() {
        class267.field3652.method3423();
        class254.method3909();
        class255.method3738();
        class263.field3529.method3423();
        class263.field3491.method3423();
        class263.field3516.method3423();
        class263.field3490.method3423();
        class266.field3606.method3423();
        class266.field3607.method3423();
        class264.method1359();
        class268.field3658.method3423();
        class268.field3669.method3423();
        class253.field3379.method3423();
        class253.field3384.method3423();
        class258.method1619();
        class249.field3348.method3423();
        class262.field3483.method3423();
        class262.field3466.method3423();
        class262.field3486.method3423();
        class256.method192();
        class260.method3242();
        class259.field3441.method3423();
        class250.field3352.method3423();
        class221.field2696.method3423();
        class224.field2721.method3423();
        class224.field2798.method3423();
        class224.field2723.method3423();
        class224.field2724.method3423();
        ((class125) Statics.field1956).method2269();
        class98.field1446.method3423();
        Statics.field1420.method3944();
        Statics.field428.method3944();
        Statics.field2116.method3944();
        Statics.field1839.method3944();
        Statics.field648.method3944();
        Statics.field334.method3944();
        Statics.field592.method3944();
        Statics.field1426.method3944();
        Statics.field274.method3944();
        Statics.field1564.method3944();
        Statics.field3233.method3944();
        Statics.field549.method3944();
    }

    @ObfuscatedName("bp.fm(I)V")
    public static final void method1037() {
        if (field913 > 0) {
            method3241();
        } else {
            field971.method4725();
            method4762(40);
            Statics.field824 = field953.method1786();
            field953.method1785();
        }
    }

    @ObfuscatedName("in.fh(ZI)V")
    public static final void method3914(boolean arg0) {
        if (arg0) {
            field905 = class92.field1339 ? class151.field2118 : class151.field2121;
        } else {
            field905 = Statics.field2494.field1234.containsKey(class278.method3747(class92.field1343)) ? class151.field2120 : class151.field2117;
        }
    }

    @ObfuscatedName("client.fw(B)V")
    public final void method1117() {
        if (field1096 > 1) {
            field1096--;
        }
        if (field913 > 0) {
            field913--;
        }
        if (field914) {
            field914 = false;
            method1037();
            return;
        }
        if (!field988) {
            method454();
            field994[0] = class233.field3162;
            field995[0] = "";
            field876[0] = 1006;
            field996[0] = false;
            field989 = 1;
        }
        for (int var1 = 0; var1 < 100 && this.method1357(field953); var1++) {
        }
        if (field877 != 30) {
            return;
        }
        while (true) {
            class289 var2 = (class289) class290.field3812.method3453();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field971.field3777) {
                    class171 var6 = class171.method1482(class168.field2322, field953.field1479);
                    var6.field2424.method2996(0);
                    int var7 = var6.field2424.field2498;
                    field971.method4730(var6.field2424);
                    var6.field2424.method3014(var6.field2424.field2498 - var7);
                    field953.method1783(var6);
                    field971.method4728();
                }
                Object var8 = Statics.field32.field805;
                synchronized (Statics.field32.field805) {
                    if (!field1081) {
                        Statics.field32.field812 = 0;
                    } else if (class60.field714 != 0 || Statics.field32.field812 >= 40) {
                        class171 var9 = class171.method1482(class168.field2310, field953.field1479);
                        var9.field2424.method2996(0);
                        int var10 = var9.field2424.field2498;
                        int var11 = 0;
                        for (int var12 = 0; var12 < Statics.field32.field812 && var9.field2424.field2498 - var10 < 240; var12++) {
                            var11++;
                            int var13 = Statics.field32.field808[var12];
                            if (var13 < 0) {
                                var13 = 0;
                            } else if (var13 > 502) {
                                var13 = 502;
                            }
                            int var14 = Statics.field32.field807[var12];
                            if (var14 < 0) {
                                var14 = 0;
                            } else if (var14 > 764) {
                                var14 = 764;
                            }
                            int var15 = var13 * 765 + var14;
                            if (Statics.field32.field808[var12] == -1 && Statics.field32.field807[var12] == -1) {
                                var14 = -1;
                                var13 = -1;
                                var15 = 524287;
                            }
                            if (field1091 != var14 || field1055 != var13) {
                                int var16 = var14 - field1091;
                                field1091 = var14;
                                int var17 = var13 - field1055;
                                field1055 = var13;
                                if (field883 < 8 && var16 >= -32 && var16 <= 31 && var17 >= -32 && var17 <= 31) {
                                    var16 += 32;
                                    var17 += 32;
                                    var9.field2424.method2997((field883 << 12) + (var16 << 6) + var17);
                                    field883 = 0;
                                } else if (field883 < 8) {
                                    var9.field2424.method2998((field883 << 19) + 8388608 + var15);
                                    field883 = 0;
                                } else {
                                    var9.field2424.method2999((field883 << 19) + -1073741824 + var15);
                                    field883 = 0;
                                }
                            } else if (field883 < 2047) {
                                field883++;
                            }
                        }
                        var9.field2424.method3014(var9.field2424.field2498 - var10);
                        field953.method1783(var9);
                        if (var11 >= Statics.field32.field812) {
                            Statics.field32.field812 = 0;
                        } else {
                            Statics.field32.field812 -= var11;
                            for (int var18 = 0; var18 < Statics.field32.field812; var18++) {
                                Statics.field32.field807[var18] = Statics.field32.field807[var11 + var18];
                                Statics.field32.field808[var18] = Statics.field32.field808[var11 + var18];
                            }
                        }
                    }
                }
                if (class60.field714 == 1 || !Statics.field1400 && class60.field714 == 4 || class60.field714 == 2) {
                    long var20 = (class60.field702 - field880 * -1L) / 50L;
                    if (var20 > 4095L) {
                        var20 = 4095L;
                    }
                    field880 = class60.field702 * -1L;
                    int var22 = class60.field716;
                    if (var22 < 0) {
                        var22 = 0;
                    } else if (var22 > Statics.field1324) {
                        var22 = Statics.field1324;
                    }
                    int var23 = class60.field715;
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 > Statics.field1842) {
                        var23 = Statics.field1842;
                    }
                    int var24 = (int) var20;
                    class171 var25 = class171.method1482(class168.field2309, field953.field1479);
                    var25.field2424.method2997((class60.field714 == 2 ? 1 : 0) + (var24 << 1));
                    var25.field2424.method2997(var23);
                    var25.field2424.method2997(var22);
                    field953.method1783(var25);
                }
                if (class51.field606 > 0) {
                    class171 var26 = class171.method1482(class168.field2307, field953.field1479);
                    var26.field2424.method2997(0);
                    int var27 = var26.field2424.field2498;
                    long var28 = class183.method4541();
                    for (int var30 = 0; var30 < class51.field606; var30++) {
                        long var31 = var28 - field1053;
                        if (var31 > 16777215L) {
                            var31 = 16777215L;
                        }
                        field1053 = var28;
                        var26.field2424.method3054((int) var31);
                        var26.field2424.method3038(class51.field615[var30]);
                    }
                    var26.field2424.method3137(var26.field2424.field2498 - var27);
                    field953.method1783(var26);
                }
                if (field940 > 0) {
                    field940--;
                }
                if (class51.field619[96] || class51.field619[97] || class51.field619[98] || class51.field619[99]) {
                    field984 = true;
                }
                if (field984 && field940 <= 0) {
                    field940 = 20;
                    field984 = false;
                    class171 var33 = class171.method1482(class168.field2312, field953.field1479);
                    var33.field2424.method3046(field933);
                    var33.field2424.method3067(field934);
                    field953.method1783(var33);
                }
                if (Statics.field475 && !field884) {
                    field884 = true;
                    class171 var34 = class171.method1482(class168.field2311, field953.field1479);
                    var34.field2424.method2996(1);
                    field953.method1783(var34);
                }
                if (!Statics.field475 && field884) {
                    field884 = false;
                    class171 var35 = class171.method1482(class168.field2311, field953.field1479);
                    var35.field2424.method2996(0);
                    field953.method1783(var35);
                }
                method736();
                if (field877 != 30) {
                    return;
                }
                for (class77 var36 = (class77) field1051.method3486(); var36 != null; var36 = (class77) field1051.method3507()) {
                    if (var36.field1138 > 0) {
                        var36.field1138--;
                    }
                    if (var36.field1138 != 0) {
                        if (var36.field1142 > 0) {
                            var36.field1142--;
                        }
                        if (var36.field1142 == 0 && var36.field1134 >= 1 && var36.field1139 >= 1 && var36.field1134 <= 102 && var36.field1139 <= 102 && (var36.field1132 < 0 || class62.method1462(var36.field1132, var36.field1141))) {
                            method504(var36.field1140, var36.field1133, var36.field1134, var36.field1139, var36.field1132, var36.field1143, var36.field1141);
                            var36.field1142 = -1;
                            if (var36.field1136 == var36.field1132 && var36.field1136 == -1) {
                                var36.method3476();
                            } else if (var36.field1136 == var36.field1132 && var36.field1143 == var36.field1137 && var36.field1141 == var36.field1135) {
                                var36.method3476();
                            }
                        }
                    } else if (var36.field1136 < 0 || class62.method1462(var36.field1136, var36.field1135)) {
                        method504(var36.field1140, var36.field1133, var36.field1134, var36.field1139, var36.field1136, var36.field1137, var36.field1135);
                        var36.method3476();
                    }
                }
                method969();
                field953.field1476++;
                if (field953.field1476 > 750) {
                    method1037();
                    return;
                }
                method3821();
                method3673();
                int[] var37 = class95.field1407;
                for (int var38 = 0; var38 < class95.field1406; var38++) {
                    class74 var39 = field1113[var37[var38]];
                    if (var39 != null && var39.field1149 > 0) {
                        var39.field1149--;
                        if (var39.field1149 == 0) {
                            var39.field1157 = null;
                        }
                    }
                }
                for (int var40 = 0; var40 < field1016; var40++) {
                    int var41 = field909[var40];
                    class86 var42 = field907[var41];
                    if (var42 != null && var42.field1149 > 0) {
                        var42.field1149--;
                        if (var42.field1149 == 0) {
                            var42.field1157 = null;
                        }
                    }
                }
                field926++;
                if (field908 != 0) {
                    field938 += 20;
                    if (field938 >= 400) {
                        field908 = 0;
                    }
                }
                if (Statics.field2421 != null) {
                    field1067++;
                    if (field1067 >= 15) {
                        method353(Statics.field2421);
                        Statics.field2421 = null;
                    }
                }
                class224 var43 = Statics.field752;
                class224 var44 = Statics.field281;
                Statics.field752 = null;
                Statics.field281 = null;
                field1042 = null;
                field1069 = false;
                field1028 = false;
                field886 = 0;
                while (class51.method720() && field886 < 128) {
                    if (field1017 >= 2 && class51.field619[82] && Statics.field1290 == 66) {
                        String var45 = "";
                        Iterator var46 = class97.field1434.iterator();
                        while (var46.hasNext()) {
                            class72 var47 = (class72) var46.next();
                            var45 = var45 + var47.field814 + ':' + var47.field819 + '\n';
                        }
                        Statics.field247.method840(var45);
                    } else {
                        field1074[field886] = Statics.field1290;
                        field1073[field886] = Statics.field3793;
                        field886++;
                    }
                }
                if (method594() && class51.field619[82] && class51.field619[81] && field1048 != 0) {
                    int var50 = Statics.field601.field853 - field1048;
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 3) {
                        var50 = 3;
                    }
                    if (Statics.field601.field853 != var50) {
                        int var51 = Statics.field1709 + Statics.field601.field1199[0];
                        int var52 = Statics.field1710 + Statics.field601.field1172[0];
                        class171 var53 = class171.method1482(class168.field2387, field953.field1479);
                        var53.field2424.method2997(var52);
                        var53.field2424.method3067(var51);
                        var53.field2424.method2996(var50);
                        field953.method1783(var53);
                    }
                    field1048 = 0;
                }
                if (field1010 != -1) {
                    method934(field1010, 0, 0, Statics.field1842, Statics.field1324, 0, 0);
                }
                field1101++;
                while (true) {
                    class69 var54;
                    class224 var55;
                    class224 var56;
                    do {
                        var54 = (class69) field1062.method3499();
                        if (var54 == null) {
                            while (true) {
                                class69 var57;
                                class224 var58;
                                class224 var59;
                                do {
                                    var57 = (class69) field960.method3499();
                                    if (var57 == null) {
                                        while (true) {
                                            class69 var60;
                                            class224 var61;
                                            class224 var62;
                                            do {
                                                var60 = (class69) field1049.method3499();
                                                if (var60 == null) {
                                                    this.method1121();
                                                    if (Statics.field1128 != null) {
                                                        Statics.field1128.method5110(Statics.field801, (Statics.field601.field1188 >> 7) + Statics.field1709, (Statics.field601.field1145 >> 7) + Statics.field1710, false);
                                                        Statics.field1128.method5130();
                                                    }
                                                    if (field1023 != null) {
                                                        this.method1126();
                                                    }
                                                    if (Statics.field865 != null) {
                                                        method353(Statics.field865);
                                                        field968++;
                                                        if (class60.field707 == 0) {
                                                            if (field967) {
                                                                if (Statics.field865 == Statics.field1587 && field966 != field895) {
                                                                    class224 var63 = Statics.field865;
                                                                    byte var64 = 0;
                                                                    if (field1120 == 1 && var63.field2840 == 206) {
                                                                        var64 = 1;
                                                                    }
                                                                    if (var63.field2845[field966] <= 0) {
                                                                        var64 = 0;
                                                                    }
                                                                    int var65 = method1528(var63);
                                                                    boolean var66 = (var65 >> 29 & 0x1) != 0;
                                                                    if (var66) {
                                                                        int var67 = field895;
                                                                        int var68 = field966;
                                                                        var63.field2845[var68] = var63.field2845[var67];
                                                                        var63.field2846[var68] = var63.field2846[var67];
                                                                        var63.field2845[var67] = -1;
                                                                        var63.field2846[var67] = 0;
                                                                    } else if (var64 == 1) {
                                                                        int var69 = field895;
                                                                        int var70 = field966;
                                                                        while (var69 != var70) {
                                                                            if (var69 > var70) {
                                                                                var63.method3869(var69 - 1, var69);
                                                                                var69--;
                                                                            } else if (var69 < var70) {
                                                                                var63.method3869(var69 + 1, var69);
                                                                                var69++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var63.method3869(field966, field895);
                                                                    }
                                                                    class171 var71 = class171.method1482(class168.field2391, field953.field1479);
                                                                    var71.field2424.method3016(Statics.field865.field2764);
                                                                    var71.field2424.method3130(var64);
                                                                    var71.field2424.method3046(field966);
                                                                    var71.field2424.method3067(field895);
                                                                    field953.method1783(var71);
                                                                }
                                                            } else if (this.method1122()) {
                                                                this.method1387(field964, field965);
                                                            } else if (field989 > 0) {
                                                                int var72 = field964;
                                                                int var73 = field965;
                                                                class89 var74 = Statics.field556;
                                                                method1049(var74.field1321, var74.field1317, var74.field1318, var74.field1319, var74.field1320, var74.field1320, var72, var73);
                                                                Statics.field556 = null;
                                                            }
                                                            field1067 = 10;
                                                            class60.field714 = 0;
                                                            Statics.field865 = null;
                                                        } else if (field968 >= 5 && (class60.field705 > field964 + 5 || class60.field705 < field964 - 5 || class60.field709 > field965 + 5 || class60.field709 < field965 - 5)) {
                                                            field967 = true;
                                                        }
                                                    }
                                                    if (class139.method2549()) {
                                                        int var75 = class139.field2006;
                                                        int var76 = class139.field2007;
                                                        class171 var77 = class171.method1482(class168.field2401, field953.field1479);
                                                        var77.field2424.method2996(5);
                                                        var77.field2424.method3067(Statics.field1710 + var76);
                                                        var77.field2424.method3067(Statics.field1709 + var75);
                                                        var77.field2424.method3101(class51.field619[82] ? (class51.field619[81] ? 2 : 1) : 0);
                                                        field953.method1783(var77);
                                                        class139.method2590();
                                                        field957 = class60.field715;
                                                        field958 = class60.field716;
                                                        field908 = 1;
                                                        field938 = 0;
                                                        field1084 = var75;
                                                        field1085 = var76;
                                                    }
                                                    if (Statics.field752 != var43) {
                                                        if (var43 != null) {
                                                            method353(var43);
                                                        }
                                                        if (Statics.field752 != null) {
                                                            method353(Statics.field752);
                                                        }
                                                    }
                                                    if (Statics.field281 != var44 && field1002 == field1001) {
                                                        if (var44 != null) {
                                                            method353(var44);
                                                        }
                                                        if (Statics.field281 != null) {
                                                            method353(Statics.field281);
                                                        }
                                                    }
                                                    if (Statics.field281 == null) {
                                                        if (field1001 > 0) {
                                                            field1001--;
                                                        }
                                                    } else if (field1001 < field1002) {
                                                        field1001++;
                                                        if (field1002 == field1001) {
                                                            method353(Statics.field281);
                                                        }
                                                    }
                                                    method3564();
                                                    if (field1098) {
                                                        method178();
                                                    }
                                                    for (int var78 = 0; var78 < 5; var78++) {
                                                        int var10002 = field947[var78]++;
                                                    }
                                                    Statics.field10.method1716();
                                                    int var79 = ++class60.field703 - 1;
                                                    int var81 = class51.method176();
                                                    if (var79 > 15000 && var81 > 15000) {
                                                        field913 = 250;
                                                        class60.field703 = 14500;
                                                        class171 var82 = class171.method1482(class168.field2354, field953.field1479);
                                                        field953.method1783(var82);
                                                    }
                                                    for (class67 var83 = (class67) field1118.method3518(); var83 != null; var83 = (class67) field1118.method3515()) {
                                                        if ((long) var83.field779 < class183.method4541() / 1000L - 5L) {
                                                            if (var83.field778 > 0) {
                                                                class97.method1752(5, "", var83.field777 + class233.field3070);
                                                            }
                                                            if (var83.field778 == 0) {
                                                                class97.method1752(5, "", var83.field777 + class233.field3071);
                                                            }
                                                            var83.method3526();
                                                        }
                                                    }
                                                    field953.field1467++;
                                                    if (field953.field1467 > 50) {
                                                        class171 var84 = class171.method1482(class168.field2308, field953.field1479);
                                                        field953.method1783(var84);
                                                    }
                                                    try {
                                                        field953.method1790();
                                                    } catch (IOException var86) {
                                                        method1037();
                                                    }
                                                    return;
                                                }
                                                var61 = var60.field795;
                                                if (var61.field2728 < 0) {
                                                    break;
                                                }
                                                var62 = class224.method1468(var61.field2746);
                                            } while (var62 == null || var62.field2856 == null || var61.field2728 >= var62.field2856.length || var62.field2856[var61.field2728] != var61);
                                            class83.method1986(var60);
                                        }
                                    }
                                    var58 = var57.field795;
                                    if (var58.field2728 < 0) {
                                        break;
                                    }
                                    var59 = class224.method1468(var58.field2746);
                                } while (var59 == null || var59.field2856 == null || var58.field2728 >= var59.field2856.length || var59.field2856[var58.field2728] != var58);
                                class83.method1986(var57);
                            }
                        }
                        var55 = var54.field795;
                        if (var55.field2728 < 0) {
                            break;
                        }
                        var56 = class224.method1468(var55.field2746);
                    } while (var56 == null || var56.field2856 == null || var55.field2728 >= var56.field2856.length || var56.field2856[var55.field2728] != var55);
                    class83.method1986(var54);
                }
            }
            class171 var4 = class171.method1482(class168.field2316, field953.field1479);
            var4.field2424.method2996(0);
            int var5 = var4.field2424.field2498;
            Statics.method1525(var4.field2424);
            var4.field2424.method3014(var4.field2424.field2498 - var5);
            field953.method1783(var4);
        }
    }

    @ObfuscatedName("co.fo(B)V")
    public static final void method1645() {
        if (Statics.field280 != null) {
            Statics.field280.method1933();
        }
        if (Statics.field19 != null) {
            Statics.field19.method1933();
        }
    }

    @ObfuscatedName("bz.fj(I)V")
    public static final void method969() {
        for (int var0 = 0; var0 < field1092; var0++) {
            int var10002 = field1095[var0]--;
            if (field1095[var0] >= -10) {
                class105 var2 = field980[var0];
                if (var2 == null) {
                    class105 var10000 = (class105) null;
                    var2 = class105.method1859(Statics.field1839, field911[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field1095[var0] += var2.method1860();
                    field980[var0] = var2;
                }
                if (field1095[var0] < 0) {
                    int var9;
                    if (field1034[var0] == 0) {
                        var9 = field1090;
                    } else {
                        int var3 = (field1034[var0] & 0xFF) * 128;
                        int var4 = field1034[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field601.field1188;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field1034[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field601.field1145;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field1095[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field1068 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class107 var10 = var2.method1866().method1908(Statics.field2921);
                        class117 var11 = class117.method2042(var10, 100, var9);
                        var11.method2027(field1094[var0] - 1);
                        Statics.field3676.method1804(var11);
                    }
                    field1095[var0] = -100;
                }
            } else {
                field1092--;
                for (int var1 = var0; var1 < field1092; var1++) {
                    field911[var1] = field911[var1 + 1];
                    field980[var1] = field980[var1 + 1];
                    field1094[var1] = field1094[var1 + 1];
                    field1095[var1] = field1095[var1 + 1];
                    field1034[var1] = field1034[var1 + 1];
                }
                var0--;
            }
        }
        if (!field1089) {
            return;
        }
        boolean var12;
        if (class211.field2595 == 0) {
            var12 = Statics.field2597.method3573();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field1060 != 0 && field1027 != -1) {
                class211.method3245(Statics.field334, field1027, 0, field1060, false);
            }
            field1089 = false;
        }
    }

    @ObfuscatedName("az.fi(Ljf;IIIS)V")
    public static void method529(class268 arg0, int arg1, int arg2, int arg3) {
        if (field1092 >= 50 || field1068 == 0 || arg0.field3663 == null || arg1 >= arg0.field3663.length) {
            return;
        }
        int var4 = arg0.field3663[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field911[field1092] = var5;
        field1094[field1092] = var6;
        field1095[field1092] = 0;
        field980[field1092] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1034[field1092] = (var8 << 16) + (var9 << 8) + var7;
        field1092++;
    }

    @ObfuscatedName("w.fg(IB)V")
    public static void method74(int arg0) {
        if (arg0 == -1 && !field1089) {
            class211.method2290();
        } else if (arg0 != -1 && field1027 != arg0 && field1060 != 0 && !field1089) {
            class245 var1 = Statics.field334;
            int var2 = field1060;
            class211.field2595 = 1;
            Statics.field2517 = var1;
            Statics.field2599 = arg0;
            Statics.field2600 = 0;
            Statics.field486 = var2;
            Statics.field2596 = false;
            Statics.field585 = 2;
        }
        field1027 = arg0;
    }

    @ObfuscatedName("bk.fy(I)V")
    public static final void method736() {
        if (Statics.field801 == field1079) {
            return;
        }
        field1079 = Statics.field801;
        int var0 = Statics.field801;
        int[] var1 = Statics.field508.field3850;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field732[var0][var6][var4] & 0x18) == 0) {
                    Statics.field649.method2584(var1, var5, 512, var0, var6, var4);
                }
                if (var0 < 3 && (class62.field732[var0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field649.method2584(var1, var5, 512, var0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field508.method4883();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field732[var0][var10][var9] & 0x18) == 0) {
                    method519(var0, var10, var9, var7, var8);
                }
                if (var0 < 3 && (class62.field732[var0 + 1][var10][var9] & 0x8) != 0) {
                    method519(var0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1080 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field649.method2711(Statics.field801, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class263.method190(var14).field3493;
                    if (var15 >= 0) {
                        field1083[field1080] = Statics.field3359[var15].method4119(false);
                        field1121[field1080] = var11;
                        field970[field1080] = var12;
                        field1080++;
                    }
                }
            }
        }
        Statics.field780.method4856();
    }

    @ObfuscatedName("jd.fc(Ljava/lang/String;I)V")
    public static final void method4542(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2494.field1227 = !Statics.field2494.field1227;
            class81.method2914();
            if (Statics.field2494.field1227) {
                class97.method1752(99, "", "Roofs are now all hidden");
            } else {
                class97.method1752(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field941 = !field941;
        }
        if (field1017 >= 2) {
            if (arg0.equalsIgnoreCase("aabb")) {
                if (!class8.field234) {
                    class8.field234 = true;
                    class8.field230 = class12.field262;
                } else if (class8.field230 == class12.field262) {
                    class8.field234 = true;
                    class8.field230 = class12.field264;
                } else {
                    class8.field234 = false;
                }
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field941 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field941 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method1037();
            }
            if (arg0.equalsIgnoreCase("errortest") && field873 == 2) {
                throw new RuntimeException();
            }
        }
        class171 var1 = class171.method1482(class168.field2346, field953.field1479);
        var1.field2424.method2996(arg0.length() + 1);
        var1.field2424.method3003(arg0);
        field953.method1783(var1);
    }

    @ObfuscatedName("d.fr(I)V")
    public static final void method178() {
        int var0 = Statics.field2533 * 128 + 64;
        int var1 = Statics.field310 * 128 + 64;
        int var2 = method1051(var0, var1, Statics.field801) - Statics.field266;
        if (Statics.field404 < var0) {
            Statics.field404 += Statics.field326 * (var0 - Statics.field404) / 1000 + Statics.field359;
            if (Statics.field404 > var0) {
                Statics.field404 = var0;
            }
        }
        if (Statics.field404 > var0) {
            Statics.field404 -= Statics.field326 * (Statics.field404 - var0) / 1000 + Statics.field359;
            if (Statics.field404 < var0) {
                Statics.field404 = var0;
            }
        }
        if (Statics.field809 < var2) {
            Statics.field809 += Statics.field326 * (var2 - Statics.field809) / 1000 + Statics.field359;
            if (Statics.field809 > var2) {
                Statics.field809 = var2;
            }
        }
        if (Statics.field809 > var2) {
            Statics.field809 -= Statics.field326 * (Statics.field809 - var2) / 1000 + Statics.field359;
            if (Statics.field809 < var2) {
                Statics.field809 = var2;
            }
        }
        if (Statics.field858 < var1) {
            Statics.field858 += Statics.field326 * (var1 - Statics.field858) / 1000 + Statics.field359;
            if (Statics.field858 > var1) {
                Statics.field858 = var1;
            }
        }
        if (Statics.field858 > var1) {
            Statics.field858 -= Statics.field326 * (Statics.field858 - var1) / 1000 + Statics.field359;
            if (Statics.field858 < var1) {
                Statics.field858 = var1;
            }
        }
        int var3 = Statics.field468 * 128 + 64;
        int var4 = Statics.field762 * 128 + 64;
        int var5 = method1051(var3, var4, Statics.field801) - Statics.field1208;
        int var6 = var3 - Statics.field404;
        int var7 = var5 - Statics.field809;
        int var8 = var4 - Statics.field858;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field403 < var10) {
            Statics.field403 += Statics.field239 * (var10 - Statics.field403) / 1000 + Statics.field1689;
            if (Statics.field403 > var10) {
                Statics.field403 = var10;
            }
        }
        if (Statics.field403 > var10) {
            Statics.field403 -= Statics.field239 * (Statics.field403 - var10) / 1000 + Statics.field1689;
            if (Statics.field403 < var10) {
                Statics.field403 = var10;
            }
        }
        int var12 = var11 - Statics.field2906;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field2906 += Statics.field239 * var12 / 1000 + Statics.field1689;
            Statics.field2906 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field2906 -= Statics.field239 * -var12 / 1000 + Statics.field1689;
            Statics.field2906 &= 0x7FF;
        }
        int var13 = var11 - Statics.field2906;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field2906 = var11;
        }
    }

    @ObfuscatedName("hb.fx(I)V")
    public static final void method3564() {
        int var0 = Statics.field601.field1188;
        int var1 = Statics.field601.field1145;
        if (Statics.field376 - var0 < -500 || Statics.field376 - var0 > 500 || Statics.field466 - var1 < -500 || Statics.field466 - var1 > 500) {
            Statics.field376 = var0;
            Statics.field466 = var1;
        }
        if (Statics.field376 != var0) {
            Statics.field376 += (var0 - Statics.field376) / 16;
        }
        if (Statics.field466 != var1) {
            Statics.field466 += (var1 - Statics.field466) / 16;
        }
        if (class60.field707 == 4 && Statics.field1400) {
            int var2 = class60.field709 - field1020;
            field1078 = var2 * 2;
            field1020 = var2 == -1 || var2 == 1 ? class60.field709 : (field1020 + class60.field709) / 2;
            int var3 = field937 - class60.field705;
            field935 = var3 * 2;
            field937 = var3 == -1 || var3 == 1 ? class60.field705 : (field937 + class60.field705) / 2;
        } else {
            if (class51.field619[96]) {
                field935 += (-24 - field935) / 2;
            } else if (class51.field619[97]) {
                field935 += (24 - field935) / 2;
            } else {
                field935 /= 2;
            }
            if (class51.field619[98]) {
                field1078 += (12 - field1078) / 2;
            } else if (class51.field619[99]) {
                field1078 += (-12 - field1078) / 2;
            } else {
                field1078 /= 2;
            }
            field1020 = class60.field709;
            field937 = class60.field705;
        }
        field934 = field935 / 2 + field934 & 0x7FF;
        field933 += field1078 / 2;
        if (field933 < 128) {
            field933 = 128;
        }
        if (field933 > 383) {
            field933 = 383;
        }
        int var4 = Statics.field376 >> 7;
        int var5 = Statics.field466 >> 7;
        int var6 = method1051(Statics.field376, Statics.field466, Statics.field801);
        int var7 = 0;
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; var9++) {
                    int var10 = Statics.field801;
                    if (var10 < 3 && (class62.field732[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var6 - class62.field740[var10][var8][var9];
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
        if (var12 > field1103) {
            field1103 += (var12 - field1103) / 24;
        } else if (var12 < field1103) {
            field1103 += (var12 - field1103) / 80;
        }
    }

    @ObfuscatedName("ht.fu(I)V")
    public static final void method3821() {
        int var0 = class95.field1406;
        int[] var1 = class95.field1407;
        for (int var2 = 0; var2 < var0; var2++) {
            class74 var3 = field1113[var1[var2]];
            if (var3 != null) {
                method2908(var3, 1);
            }
        }
    }

    @ObfuscatedName("hp.fb(I)V")
    public static final void method3673() {
        for (int var0 = 0; var0 < field1016; var0++) {
            int var1 = field909[var0];
            class86 var2 = field907[var1];
            if (var2 != null) {
                method2908(var2, var2.field1293.field3626);
            }
        }
    }

    @ObfuscatedName("fw.fk(Lbf;II)V")
    public static final void method2908(class78 arg0, int arg1) {
        if (arg0.field1165 > field1054) {
            int var2 = arg0.field1165 - field1054;
            int var3 = arg0.field1202 * 64 + arg0.field1186 * 128;
            int var4 = arg0.field1202 * 64 + arg0.field1160 * 128;
            arg0.field1188 += (var3 - arg0.field1188) / var2;
            arg0.field1145 += (var4 - arg0.field1145) / var2;
            arg0.field1158 = 0;
            arg0.field1195 = arg0.field1192;
        } else if (arg0.field1178 >= field1054) {
            method256(arg0);
        } else {
            arg0.field1173 = arg0.field1175;
            if (arg0.field1198 == 0) {
                arg0.field1158 = 0;
            } else {
                label418: {
                    if (arg0.field1176 != -1 && arg0.field1179 == 0) {
                        class268 var5 = class268.method2289(arg0.field1176);
                        if (arg0.field1187 > 0 && var5.field3671 == 0) {
                            arg0.field1158++;
                            break label418;
                        }
                        if (arg0.field1187 <= 0 && var5.field3672 == 0) {
                            arg0.field1158++;
                            break label418;
                        }
                    }
                    int var6 = arg0.field1188;
                    int var7 = arg0.field1145;
                    int var8 = arg0.field1199[arg0.field1198 - 1] * 128 + arg0.field1202 * 64;
                    int var9 = arg0.field1172[arg0.field1198 - 1] * 128 + arg0.field1202 * 64;
                    if (var6 < var8) {
                        if (var7 < var9) {
                            arg0.field1195 = 1280;
                        } else if (var7 > var9) {
                            arg0.field1195 = 1792;
                        } else {
                            arg0.field1195 = 1536;
                        }
                    } else if (var6 > var8) {
                        if (var7 < var9) {
                            arg0.field1195 = 768;
                        } else if (var7 > var9) {
                            arg0.field1195 = 256;
                        } else {
                            arg0.field1195 = 512;
                        }
                    } else if (var7 < var9) {
                        arg0.field1195 = 1024;
                    } else if (var7 > var9) {
                        arg0.field1195 = 0;
                    }
                    byte var10 = arg0.field1190[arg0.field1198 - 1];
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        int var11 = arg0.field1195 - arg0.field1146 & 0x7FF;
                        if (var11 > 1024) {
                            var11 -= 2048;
                        }
                        int var12 = arg0.field1153;
                        if (var11 >= -256 && var11 <= 256) {
                            var12 = arg0.field1152;
                        } else if (var11 >= 256 && var11 < 768) {
                            var12 = arg0.field1155;
                        } else if (var11 >= -768 && var11 <= -256) {
                            var12 = arg0.field1154;
                        }
                        if (var12 == -1) {
                            var12 = arg0.field1152;
                        }
                        arg0.field1173 = var12;
                        int var13 = 4;
                        boolean var14 = true;
                        if (arg0 instanceof class86) {
                            var14 = ((class86) arg0).field1293.field3619;
                        }
                        if (var14) {
                            if (arg0.field1195 != arg0.field1146 && arg0.field1201 == -1 && arg0.field1197 != 0) {
                                var13 = 2;
                            }
                            if (arg0.field1198 > 2) {
                                var13 = 6;
                            }
                            if (arg0.field1198 > 3) {
                                var13 = 8;
                            }
                            if (arg0.field1158 > 0 && arg0.field1198 > 1) {
                                var13 = 8;
                                arg0.field1158--;
                            }
                        } else {
                            if (arg0.field1198 > 1) {
                                var13 = 6;
                            }
                            if (arg0.field1198 > 2) {
                                var13 = 8;
                            }
                            if (arg0.field1158 > 0 && arg0.field1198 > 1) {
                                var13 = 8;
                                arg0.field1158--;
                            }
                        }
                        if (var10 == 2) {
                            var13 <<= 0x1;
                        }
                        if (var13 >= 8 && arg0.field1173 == arg0.field1152 && arg0.field1156 != -1) {
                            arg0.field1173 = arg0.field1156;
                        }
                        if (var6 != var8 || var7 != var9) {
                            if (var6 < var8) {
                                arg0.field1188 += var13;
                                if (arg0.field1188 > var8) {
                                    arg0.field1188 = var8;
                                }
                            } else if (var6 > var8) {
                                arg0.field1188 -= var13;
                                if (arg0.field1188 < var8) {
                                    arg0.field1188 = var8;
                                }
                            }
                            if (var7 < var9) {
                                arg0.field1145 += var13;
                                if (arg0.field1145 > var9) {
                                    arg0.field1145 = var9;
                                }
                            } else if (var7 > var9) {
                                arg0.field1145 -= var13;
                                if (arg0.field1145 < var9) {
                                    arg0.field1145 = var9;
                                }
                            }
                        }
                        if (arg0.field1188 == var8 && arg0.field1145 == var9) {
                            arg0.field1198--;
                            if (arg0.field1187 > 0) {
                                arg0.field1187--;
                            }
                        }
                    } else {
                        arg0.field1188 = var8;
                        arg0.field1145 = var9;
                        arg0.field1198--;
                        if (arg0.field1187 > 0) {
                            arg0.field1187--;
                        }
                    }
                }
            }
        }
        if (arg0.field1188 < 128 || arg0.field1145 < 128 || arg0.field1188 >= 13184 || arg0.field1145 >= 13184) {
            arg0.field1176 = -1;
            arg0.field1181 = -1;
            arg0.field1165 = 0;
            arg0.field1178 = 0;
            arg0.field1188 = arg0.field1199[0] * 128 + arg0.field1202 * 64;
            arg0.field1145 = arg0.field1172[0] * 128 + arg0.field1202 * 64;
            arg0.method1477();
        }
        if (Statics.field601 == arg0 && (arg0.field1188 < 1536 || arg0.field1145 < 1536 || arg0.field1188 >= 11776 || arg0.field1145 >= 11776)) {
            arg0.field1176 = -1;
            arg0.field1181 = -1;
            arg0.field1165 = 0;
            arg0.field1178 = 0;
            arg0.field1188 = arg0.field1199[0] * 128 + arg0.field1202 * 64;
            arg0.field1145 = arg0.field1172[0] * 128 + arg0.field1202 * 64;
            arg0.method1477();
        }
        if (arg0.field1197 != 0) {
            if (arg0.field1201 != -1) {
                class78 var15 = null;
                if (arg0.field1201 < 32768) {
                    var15 = field907[arg0.field1201];
                } else if (arg0.field1201 >= 32768) {
                    var15 = field1113[arg0.field1201 - 32768];
                }
                if (var15 != null) {
                    int var16 = arg0.field1188 - var15.field1188;
                    int var17 = arg0.field1145 - var15.field1145;
                    if (var16 != 0 || var17 != 0) {
                        arg0.field1195 = (int) (Math.atan2((double) var16, (double) var17) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1171) {
                    arg0.field1201 = -1;
                    arg0.field1171 = false;
                }
            }
            if (arg0.field1203 != -1 && (arg0.field1198 == 0 || arg0.field1158 > 0)) {
                arg0.field1195 = arg0.field1203;
                arg0.field1203 = -1;
            }
            int var18 = arg0.field1195 - arg0.field1146 & 0x7FF;
            if (var18 == 0 && arg0.field1171) {
                arg0.field1201 = -1;
                arg0.field1171 = false;
            }
            if (var18 == 0) {
                arg0.field1196 = 0;
            } else {
                arg0.field1196++;
                if (var18 > 1024) {
                    arg0.field1146 -= arg0.field1197;
                    boolean var19 = true;
                    if (var18 < arg0.field1197 || var18 > 2048 - arg0.field1197) {
                        arg0.field1146 = arg0.field1195;
                        var19 = false;
                    }
                    if (arg0.field1175 == arg0.field1173 && (arg0.field1196 > 25 || var19)) {
                        if (arg0.field1150 == -1) {
                            arg0.field1173 = arg0.field1152;
                        } else {
                            arg0.field1173 = arg0.field1150;
                        }
                    }
                } else {
                    arg0.field1146 += arg0.field1197;
                    boolean var20 = true;
                    if (var18 < arg0.field1197 || var18 > 2048 - arg0.field1197) {
                        arg0.field1146 = arg0.field1195;
                        var20 = false;
                    }
                    if (arg0.field1175 == arg0.field1173 && (arg0.field1196 > 25 || var20)) {
                        if (arg0.field1151 == -1) {
                            arg0.field1173 = arg0.field1152;
                        } else {
                            arg0.field1173 = arg0.field1151;
                        }
                    }
                }
                arg0.field1146 &= 0x7FF;
            }
        }
        arg0.field1147 = false;
        if (arg0.field1173 != -1) {
            class268 var22 = class268.method2289(arg0.field1173);
            if (var22 == null || var22.field3660 == null) {
                arg0.field1173 = -1;
            } else {
                arg0.field1194++;
                if (arg0.field1174 < var22.field3660.length && arg0.field1194 > var22.field3662[arg0.field1174]) {
                    arg0.field1194 = 1;
                    arg0.field1174++;
                    method529(var22, arg0.field1174, arg0.field1188, arg0.field1145);
                }
                if (arg0.field1174 >= var22.field3660.length) {
                    arg0.field1194 = 0;
                    arg0.field1174 = 0;
                    method529(var22, arg0.field1174, arg0.field1188, arg0.field1145);
                }
            }
        }
        if (arg0.field1181 != -1 && field1054 >= arg0.field1184) {
            if (arg0.field1182 < 0) {
                arg0.field1182 = 0;
            }
            int var23 = class253.method4750(arg0.field1181).field3387;
            if (var23 == -1) {
                arg0.field1181 = -1;
            } else {
                class268 var24 = class268.method2289(var23);
                if (var24 == null || var24.field3660 == null) {
                    arg0.field1181 = -1;
                } else {
                    arg0.field1183++;
                    if (arg0.field1182 < var24.field3660.length && arg0.field1183 > var24.field3662[arg0.field1182]) {
                        arg0.field1183 = 1;
                        arg0.field1182++;
                        method529(var24, arg0.field1182, arg0.field1188, arg0.field1145);
                    }
                    if (arg0.field1182 >= var24.field3660.length && (arg0.field1182 < 0 || arg0.field1182 >= var24.field3660.length)) {
                        arg0.field1181 = -1;
                    }
                }
            }
        }
        if (arg0.field1176 != -1 && arg0.field1179 <= 1) {
            class268 var25 = class268.method2289(arg0.field1176);
            if (var25.field3671 == 1 && arg0.field1187 > 0 && arg0.field1165 <= field1054 && arg0.field1178 < field1054) {
                arg0.field1179 = 1;
                return;
            }
        }
        if (arg0.field1176 != -1 && arg0.field1179 == 0) {
            class268 var26 = class268.method2289(arg0.field1176);
            if (var26 == null || var26.field3660 == null) {
                arg0.field1176 = -1;
            } else {
                arg0.field1180++;
                if (arg0.field1177 < var26.field3660.length && arg0.field1180 > var26.field3662[arg0.field1177]) {
                    arg0.field1180 = 1;
                    arg0.field1177++;
                    method529(var26, arg0.field1177, arg0.field1188, arg0.field1145);
                }
                if (arg0.field1177 >= var26.field3660.length) {
                    arg0.field1177 -= var26.field3664;
                    arg0.field1164++;
                    if (arg0.field1164 >= var26.field3673) {
                        arg0.field1176 = -1;
                    } else if (arg0.field1177 >= 0 && arg0.field1177 < var26.field3660.length) {
                        method529(var26, arg0.field1177, arg0.field1188, arg0.field1145);
                    } else {
                        arg0.field1176 = -1;
                    }
                }
                arg0.field1147 = var26.field3657;
            }
        }
        if (arg0.field1179 > 0) {
            arg0.field1179--;
        }
    }

    @ObfuscatedName("ab.fl(Lbf;I)V")
    public static final void method256(class78 arg0) {
        if (field1054 == arg0.field1178 || arg0.field1176 == -1 || arg0.field1179 != 0 || arg0.field1180 + 1 > class268.method2289(arg0.field1176).field3662[arg0.field1177]) {
            int var1 = arg0.field1178 - arg0.field1165;
            int var2 = field1054 - arg0.field1165;
            int var3 = arg0.field1202 * 64 + arg0.field1186 * 128;
            int var4 = arg0.field1202 * 64 + arg0.field1160 * 128;
            int var5 = arg0.field1202 * 64 + arg0.field1144 * 128;
            int var6 = arg0.field1202 * 64 + arg0.field1200 * 128;
            arg0.field1188 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1145 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1158 = 0;
        arg0.field1195 = arg0.field1192;
        arg0.field1146 = arg0.field1195;
    }

    @ObfuscatedName("ak.fz(Lbq;IIS)V")
    public static void method462(class74 arg0, int arg1, int arg2) {
        if (arg0.field1176 == arg1 && arg1 != -1) {
            int var3 = class268.method2289(arg1).field3656;
            if (var3 == 1) {
                arg0.field1177 = 0;
                arg0.field1180 = 0;
                arg0.field1179 = arg2;
                arg0.field1164 = 0;
            }
            if (var3 == 2) {
                arg0.field1164 = 0;
            }
        } else if (arg1 == -1 || arg0.field1176 == -1 || class268.method2289(arg1).field3667 >= class268.method2289(arg0.field1176).field3667) {
            arg0.field1176 = arg1;
            arg0.field1177 = 0;
            arg0.field1180 = 0;
            arg0.field1179 = arg2;
            arg0.field1164 = 0;
            arg0.field1187 = arg0.field1198;
        }
    }

    @ObfuscatedName("s.fv(II)V")
    public static void method181(int arg0) {
        field1031 = 0L;
        if (arg0 >= 2) {
            field1097 = true;
        } else {
            field1097 = false;
        }
        int var1 = field1097 ? 2 : 1;
        if (var1 == 1) {
            Statics.field247.method790(765, 503);
        } else {
            Statics.field247.method790(7680, 2160);
        }
        if (field877 >= 25) {
            method21();
        }
    }

    @ObfuscatedName("e.fn(I)V")
    public static void method21() {
        class171 var0 = class171.method1482(class168.field2314, field953.field1479);
        class187 var1 = var0.field2424;
        int var2 = field1097 ? 2 : 1;
        var1.method2996(var2);
        var0.field2424.method2997(Statics.field1842);
        var0.field2424.method2997(Statics.field1324);
        field953.method1783(var0);
    }

    @ObfuscatedName("client.y(I)V")
    public final void method809() {
        field1031 = class183.method4541() + 500L;
        this.method1114();
        if (field1010 != -1) {
            this.method1124(true);
        }
    }

    @ObfuscatedName("client.gm(I)V")
    public void method1114() {
        int var1 = Statics.field1842;
        int var2 = Statics.field1324;
        if (this.field674 < var1) {
            int var3 = this.field674;
        }
        if (this.field675 < var2) {
            int var4 = this.field675;
        }
        if (Statics.field2494 == null) {
            return;
        }
        try {
            client var5 = Statics.field247;
            int var6 = field1097 ? 2 : 1;
            Object[] var7 = new Object[] { var6 };
            JSObject.getWindow(var5).call("resize", var7);
        } catch (Throwable var9) {
        }
    }

    @ObfuscatedName("client.gk(I)V")
    public final void method1119() {
        if (field1010 != -1) {
            int var1 = field1010;
            if (class224.method1621(var1)) {
                method61(Statics.field3299[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field981; var2++) {
            if (field1056[var2]) {
                field1057[var2] = true;
            }
            field897[var2] = field1056[var2];
            field1056[var2] = false;
        }
        field1011 = field1054;
        field999 = -1;
        field1000 = -1;
        Statics.field1587 = null;
        if (field1010 != -1) {
            field981 = 0;
            method73(field1010, 0, 0, Statics.field1842, Statics.field1324, 0, 0, -1);
        }
        class291.method4768();
        if (field988) {
            method3326();
        } else if (field999 != -1) {
            int var3 = field999;
            int var4 = field1000;
            if (field989 >= 2 || field1003 != 0 || field1005) {
                int var5 = field989 - 1;
                String var7;
                if (field1003 == 1 && field989 < 2) {
                    var7 = class233.field3073 + class233.field3083 + field1119 + " " + class88.field1309;
                } else if (field1005 && field989 < 2) {
                    var7 = field1008 + class233.field3083 + field1009 + " " + class88.field1309;
                } else {
                    var7 = method165(var5);
                }
                if (field989 > 2) {
                    var7 = var7 + class88.method2738(16777215) + " " + '/' + " " + (field989 - 2) + class233.field3077;
                }
                Statics.field321.method4568(var7, var3 + 4, var4 + 15, 16777215, 0, field1054 / 1000);
            }
        }
        if (field1063 == 3) {
            for (int var8 = 0; var8 < field981; var8++) {
                if (field897[var8]) {
                    class291.method4775(field1059[var8], field931[var8], field1037[var8], field1013[var8], 16711935, 128);
                } else if (field1057[var8]) {
                    class291.method4775(field1059[var8], field931[var8], field1037[var8], field1013[var8], 16711680, 128);
                }
            }
        }
        class82.method1694(Statics.field801, Statics.field601.field1188, Statics.field601.field1145, field926);
        field926 = 0;
    }

    @ObfuscatedName("bc.ge(Ljava/lang/String;ZI)V")
    public static final void method1033(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field598.method4583(arg0, 250);
        int var6 = Statics.field598.method4558(arg0, 250) * 13;
        class291.method4776(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class291.method4782(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field598.method4564(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method170(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field780.method776(0, 0);
        } else {
            method3248(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("iv.gn(IIIIB)V")
    public static final void method4161(int arg0, int arg1, int arg2, int arg3) {
        field954++;
        if (Statics.field601.field1188 >> 7 == field1084 && Statics.field601.field1145 >> 7 == field1085) {
            field1084 = 0;
        }
        method2937(Statics.field601, false);
        if (field979 >= 0 && field1113[field979] != null) {
            method2937(field1113[field979], false);
        }
        method592(true);
        method210();
        method592(false);
        method1611();
        method948();
        method2973(arg0, arg1, arg2, arg3, true);
        int var4 = field1112;
        int var5 = field1110;
        int var6 = field1114;
        int var7 = field1115;
        class291.method4833(var4, var5, var4 + var6, var5 + var7);
        class136.method2476();
        if (!field1098) {
            int var8 = field933;
            if (field1103 / 256 > var8) {
                var8 = field1103 / 256;
            }
            if (field1099[4] && field1072[4] + 128 > var8) {
                var8 = field1072[4] + 128;
            }
            int var9 = field934 & 0x7FF;
            method84(Statics.field376, method1051(Statics.field601.field1188, Statics.field601.field1145, Statics.field801) - field951, Statics.field466, var8, var9, var8 * 3 + 600);
        }
        int var22;
        if (field1098) {
            var22 = method3926();
        } else {
            int var10;
            if (Statics.field2494.field1227) {
                var10 = Statics.field801;
            } else {
                label417: {
                    int var11 = 3;
                    if (Statics.field403 < 310) {
                        int var12 = Statics.field404 >> 7;
                        int var13 = Statics.field858 >> 7;
                        int var14 = Statics.field601.field1188 >> 7;
                        int var15 = Statics.field601.field1145 >> 7;
                        if (var12 < 0 || var13 < 0 || var12 >= 104 || var13 >= 104) {
                            var10 = Statics.field801;
                            break label417;
                        }
                        if ((class62.field732[Statics.field801][var12][var13] & 0x4) != 0) {
                            var11 = Statics.field801;
                        }
                        int var16;
                        if (var14 > var12) {
                            var16 = var14 - var12;
                        } else {
                            var16 = var12 - var14;
                        }
                        int var17;
                        if (var15 > var13) {
                            var17 = var15 - var13;
                        } else {
                            var17 = var13 - var15;
                        }
                        if (var16 > var17) {
                            int var18 = var17 * 65536 / var16;
                            int var19 = 32768;
                            while (var12 != var14) {
                                if (var12 < var14) {
                                    var12++;
                                } else if (var12 > var14) {
                                    var12--;
                                }
                                if ((class62.field732[Statics.field801][var12][var13] & 0x4) != 0) {
                                    var11 = Statics.field801;
                                }
                                var19 += var18;
                                if (var19 >= 65536) {
                                    var19 -= 65536;
                                    if (var13 < var15) {
                                        var13++;
                                    } else if (var13 > var15) {
                                        var13--;
                                    }
                                    if ((class62.field732[Statics.field801][var12][var13] & 0x4) != 0) {
                                        var11 = Statics.field801;
                                    }
                                }
                            }
                        } else {
                            int var20 = var16 * 65536 / var17;
                            int var21 = 32768;
                            while (var13 != var15) {
                                if (var13 < var15) {
                                    var13++;
                                } else if (var13 > var15) {
                                    var13--;
                                }
                                if ((class62.field732[Statics.field801][var12][var13] & 0x4) != 0) {
                                    var11 = Statics.field801;
                                }
                                var21 += var20;
                                if (var21 >= 65536) {
                                    var21 -= 65536;
                                    if (var12 < var14) {
                                        var12++;
                                    } else if (var12 > var14) {
                                        var12--;
                                    }
                                    if ((class62.field732[Statics.field801][var12][var13] & 0x4) != 0) {
                                        var11 = Statics.field801;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field601.field1188 >= 0 && Statics.field601.field1145 >= 0 && Statics.field601.field1188 < 13312 && Statics.field601.field1145 < 13312) {
                        if ((class62.field732[Statics.field801][Statics.field601.field1188 >> 7][Statics.field601.field1145 >> 7] & 0x4) != 0) {
                            var11 = Statics.field801;
                        }
                        var10 = var11;
                    } else {
                        var10 = Statics.field801;
                    }
                }
            }
            var22 = var10;
        }
        int var23 = Statics.field404;
        int var24 = Statics.field809;
        int var25 = Statics.field858;
        int var26 = Statics.field403;
        int var27 = Statics.field2906;
        for (int var28 = 0; var28 < 5; var28++) {
            if (field1099[var28]) {
                int var29 = (int) (Math.random() * (double) (field950[var28] * 2 + 1) - (double) field950[var28] + Math.sin((double) field1102[var28] / 100.0D * (double) field947[var28]) * (double) field1072[var28]);
                if (var28 == 0) {
                    Statics.field404 += var29;
                }
                if (var28 == 1) {
                    Statics.field809 += var29;
                }
                if (var28 == 2) {
                    Statics.field858 += var29;
                }
                if (var28 == 3) {
                    Statics.field2906 = Statics.field2906 + var29 & 0x7FF;
                }
                if (var28 == 4) {
                    Statics.field403 += var29;
                    if (Statics.field403 < 128) {
                        Statics.field403 = 128;
                    }
                    if (Statics.field403 > 383) {
                        Statics.field403 = 383;
                    }
                }
            }
        }
        int var30 = class60.field705;
        int var31 = class60.field709;
        if (class60.field714 != 0) {
            var30 = class60.field715;
            var31 = class60.field716;
        }
        if (var30 >= var4 && var30 < var4 + var6 && var31 >= var5 && var31 < var5 + var7) {
            int var32 = var30 - var4;
            int var33 = var31 - var5;
            class134.field1915 = var32;
            class134.field1913 = var33;
            class134.field1918 = true;
            class134.field1922 = 0;
            class134.field1916 = false;
        } else {
            class134.method2930();
        }
        method1645();
        class291.method4776(var4, var5, var6, var7, 0);
        method1645();
        int var34 = class136.field1941;
        class136.field1941 = field1116;
        Statics.field649.method2591(Statics.field404, Statics.field809, Statics.field858, Statics.field403, Statics.field2906, var22);
        class8.method100();
        class136.field1941 = var34;
        method1645();
        Statics.field649.method2564();
        field943 = 0;
        boolean var35 = false;
        int var36 = -1;
        int var37 = class95.field1406;
        int[] var38 = class95.field1407;
        for (int var39 = 0; var39 < field1016 + var37; var39++) {
            class78 var40;
            if (var39 < var37) {
                var40 = field1113[var38[var39]];
                if (field979 == var38[var39]) {
                    var35 = true;
                    var36 = var39;
                    continue;
                }
            } else {
                var40 = field907[field909[var39 - var37]];
            }
            method51(var40, var39, var4, var5, var6, var7);
        }
        if (var35) {
            method51(field1113[field979], var36, var4, var5, var6, var7);
        }
        for (int var41 = 0; var41 < field943; var41++) {
            int var42 = field1131[var41];
            int var43 = field946[var41];
            int var44 = field948[var41];
            int var45 = field945[var41];
            boolean var46 = true;
            while (var46) {
                var46 = false;
                for (int var47 = 0; var47 < var41; var47++) {
                    if (var43 + 2 > field946[var47] - field945[var47] && var43 - var45 < field946[var47] + 2 && var42 - var44 < field948[var47] + field1131[var47] && var42 + var44 > field1131[var47] - field948[var47] && field946[var47] - field945[var47] < var43) {
                        var43 = field946[var47] - field945[var47];
                        var46 = true;
                    }
                }
            }
            field955 = field1131[var41];
            field1065 = field946[var41] = var43;
            String var48 = field952[var41];
            if (field1012 == 0) {
                int var49 = 16776960;
                if (field949[var41] < 6) {
                    var49 = field1039[field949[var41]];
                }
                if (field949[var41] == 6) {
                    var49 = field954 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field949[var41] == 7) {
                    var49 = field954 % 20 < 10 ? 255 : 65535;
                }
                if (field949[var41] == 8) {
                    var49 = field954 % 20 < 10 ? 45056 : 8454016;
                }
                if (field949[var41] == 9) {
                    int var50 = 150 - field1066[var41];
                    if (var50 < 50) {
                        var49 = var50 * 1280 + 16711680;
                    } else if (var50 < 100) {
                        var49 = 16776960 - (var50 - 50) * 327680;
                    } else if (var50 < 150) {
                        var49 = (var50 - 100) * 5 + 65280;
                    }
                }
                if (field949[var41] == 10) {
                    int var51 = 150 - field1066[var41];
                    if (var51 < 50) {
                        var49 = var51 * 5 + 16711680;
                    } else if (var51 < 100) {
                        var49 = 16711935 - (var51 - 50) * 327680;
                    } else if (var51 < 150) {
                        var49 = (var51 - 100) * 327680 + 255 - (var51 - 100) * 5;
                    }
                }
                if (field949[var41] == 11) {
                    int var52 = 150 - field1066[var41];
                    if (var52 < 50) {
                        var49 = 16777215 - var52 * 327685;
                    } else if (var52 < 100) {
                        var49 = (var52 - 50) * 327685 + 65280;
                    } else if (var52 < 150) {
                        var49 = 16777215 - (var52 - 100) * 327680;
                    }
                }
                if (field1100[var41] == 0) {
                    Statics.field321.method4563(var48, field955 + var4, field1065 + var5, var49, 0);
                }
                if (field1100[var41] == 1) {
                    Statics.field321.method4565(var48, field955 + var4, field1065 + var5, var49, 0, field954);
                }
                if (field1100[var41] == 2) {
                    Statics.field321.method4566(var48, field955 + var4, field1065 + var5, var49, 0, field954);
                }
                if (field1100[var41] == 3) {
                    Statics.field321.method4552(var48, field955 + var4, field1065 + var5, var49, 0, field954, 150 - field1066[var41]);
                }
                if (field1100[var41] == 4) {
                    int var53 = (150 - field1066[var41]) * (Statics.field321.method4555(var48) + 100) / 150;
                    class291.method4770(field955 + var4 - 50, var5, field955 + var4 + 50, var5 + var7);
                    Statics.field321.method4560(var48, field955 + var4 + 50 - var53, field1065 + var5, var49, 0);
                    class291.method4833(var4, var5, var4 + var6, var5 + var7);
                }
                if (field1100[var41] == 5) {
                    int var54 = 150 - field1066[var41];
                    int var55 = 0;
                    if (var54 < 25) {
                        var55 = var54 - 25;
                    } else if (var54 > 125) {
                        var55 = var54 - 125;
                    }
                    class291.method4770(var4, field1065 + var5 - Statics.field321.field3698 - 1, var4 + var6, field1065 + var5 + 5);
                    Statics.field321.method4563(var48, field955 + var4, field1065 + var5 + var55, var49, 0);
                    class291.method4833(var4, var5, var4 + var6, var5 + var7);
                }
            } else {
                Statics.field321.method4563(var48, field955 + var4, field1065 + var5, 16776960, 0);
            }
        }
        if (field917 == 2) {
            method7((field890 - Statics.field1709 << 7) + field893, (field891 - Statics.field1710 << 7) + field894, field892 * 2);
            if (field955 > -1 && field1054 % 20 < 10) {
                Statics.field2912[0].method4892(field955 + var4 - 12, field1065 + var5 - 28);
            }
        }
        ((class125) Statics.field1956).method2270(field926);
        if (field908 == 1) {
            Statics.field1288[field938 / 100].method4892(field957 - 8, field958 - 8);
        }
        if (field908 == 2) {
            Statics.field1288[field938 / 100 + 4].method4892(field957 - 8, field958 - 8);
        }
        method289();
        Statics.field404 = var23;
        Statics.field809 = var24;
        Statics.field858 = var25;
        Statics.field403 = var26;
        Statics.field2906 = var27;
        if (field878 && class246.method3925(true, false) == 0) {
            field878 = false;
        }
        if (field878) {
            class291.method4776(var4, var5, var6, var7, 0);
            method1033(class233.field3103, false);
        }
    }

    @ObfuscatedName("fu.gi(IIIIZI)V")
    public static final void method2973(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1105 - field1104) * var5 / 100 + field1104;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field882) {
            short var8 = field882;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field912) {
                var6 = field912;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class291.method4768();
                    class291.method4776(arg0, arg1, var10, arg3, -16777216);
                    class291.method4776(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1109) {
            short var11 = field1109;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1108) {
                var6 = field1108;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class291.method4768();
                    class291.method4776(arg0, arg1, arg2, var13, -16777216);
                    class291.method4776(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1107 - field1106) * var5 / 100 + field1106;
        field1116 = arg3 * var6 * var14 / 85504 << 1;
        if (field1114 != arg2 || field1115 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class136.field1947[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class139.method2585(var15, 500, 800, arg2, arg3);
        }
        field1112 = arg0;
        field1110 = arg1;
        field1114 = arg2;
        field1115 = arg3;
    }

    @ObfuscatedName("al.ga(B)V")
    public static void method210() {
        int var0 = class95.field1406;
        int[] var1 = class95.field1407;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field979 != var1[var2] && field1052 != var1[var2]) {
                method2937(field1113[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("fy.gs(Lbq;ZI)V")
    public static void method2937(class74 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1073() || arg0.field845) {
            return;
        }
        int var2 = arg0.field854 << 14;
        arg0.field850 = false;
        if ((field875 && class95.field1406 > 50 || class95.field1406 > 200) && arg1 && arg0.field1175 == arg0.field1173) {
            arg0.field850 = true;
        }
        int var3 = arg0.field1188 >> 7;
        int var4 = arg0.field1145 >> 7;
        if (var3 < 0 || var3 >= 104 || var4 < 0 || var4 >= 104) {
            return;
        }
        if (arg0.field835 != null && field1054 >= arg0.field840 && field1054 < arg0.field841) {
            arg0.field850 = false;
            arg0.field832 = method1051(arg0.field1188, arg0.field1145, Statics.field801);
            Statics.field649.method2562(Statics.field801, arg0.field1188, arg0.field1145, arg0.field832, 60, arg0, arg0.field1146, var2, arg0.field846, arg0.field837, arg0.field848, arg0.field849);
            return;
        }
        if ((arg0.field1188 & 0x7F) == 64 && (arg0.field1145 & 0x7F) == 64) {
            if (field954 == field1050[var3][var4]) {
                return;
            }
            field1050[var3][var4] = field954;
        }
        arg0.field832 = method1051(arg0.field1188, arg0.field1145, Statics.field801);
        Statics.field649.method2689(Statics.field801, arg0.field1188, arg0.field1145, arg0.field832, 60, arg0, arg0.field1146, var2, arg0.field1147);
    }

    @ObfuscatedName("ai.gv(ZI)V")
    public static final void method592(boolean arg0) {
        for (int var1 = 0; var1 < field1016; var1++) {
            class86 var2 = field907[field909[var1]];
            int var3 = (field909[var1] << 14) + 536870912;
            if (var2 != null && var2.method1073() && var2.field1293.field3627 == arg0 && var2.field1293.method4460()) {
                int var4 = var2.field1188 >> 7;
                int var5 = var2.field1145 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1202 == 1 && (var2.field1188 & 0x7F) == 64 && (var2.field1145 & 0x7F) == 64) {
                        if (field954 == field1050[var4][var5]) {
                            continue;
                        }
                        field1050[var4][var5] = field954;
                    }
                    if (!var2.field1293.field3615) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field649.method2689(Statics.field801, var2.field1188, var2.field1145, method1051(var2.field1188 + (var2.field1202 * 64 - 64), var2.field1145 + (var2.field1202 * 64 - 64), Statics.field801), var2.field1202 * 64 - 64 + 60, var2, var2.field1146, var3, var2.field1147);
                }
            }
        }
    }

    @ObfuscatedName("cy.gz(I)V")
    public static final void method1611() {
        for (class93 var0 = (class93) field982.method3486(); var0 != null; var0 = (class93) field982.method3507()) {
            if (Statics.field801 != var0.field1390 || field1054 > var0.field1375) {
                var0.method3476();
            } else if (field1054 >= var0.field1377) {
                if (var0.field1372 > 0) {
                    class86 var1 = field907[var0.field1372 - 1];
                    if (var1 != null && var1.field1188 >= 0 && var1.field1188 < 13312 && var1.field1145 >= 0 && var1.field1145 < 13312) {
                        var0.method1678(var1.field1188, var1.field1145, method1051(var1.field1188, var1.field1145, var0.field1390) - var0.field1376, field1054);
                    }
                }
                if (var0.field1372 < 0) {
                    int var2 = -var0.field1372 - 1;
                    class74 var3;
                    if (field1052 == var2) {
                        var3 = Statics.field601;
                    } else {
                        var3 = field1113[var2];
                    }
                    if (var3 != null && var3.field1188 >= 0 && var3.field1188 < 13312 && var3.field1145 >= 0 && var3.field1145 < 13312) {
                        var0.method1678(var3.field1188, var3.field1145, method1051(var3.field1188, var3.field1145, var0.field1390) - var0.field1376, field1054);
                    }
                }
                var0.method1676(field926);
                Statics.field649.method2689(Statics.field801, (int) var0.field1383, (int) var0.field1379, (int) var0.field1384, 60, var0, var0.field1381, -1, false);
            }
        }
    }

    @ObfuscatedName("bt.gq(I)V")
    public static final void method948() {
        for (class84 var0 = (class84) field983.method3486(); var0 != null; var0 = (class84) field983.method3507()) {
            if (Statics.field801 != var0.field1272 || var0.field1279) {
                var0.method3476();
            } else if (field1054 >= var0.field1271) {
                var0.method1602(field926);
                if (var0.field1279) {
                    var0.method3476();
                } else {
                    Statics.field649.method2689(var0.field1272, var0.field1273, var0.field1274, var0.field1278, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("iu.gl(I)I")
    public static final int method3926() {
        if (Statics.field2494.field1227) {
            return Statics.field801;
        } else {
            int var0 = method1051(Statics.field404, Statics.field858, Statics.field801);
            return var0 - Statics.field809 >= 800 || (class62.field732[Statics.field801][Statics.field404 >> 7][Statics.field858 >> 7] & 0x4) == 0 ? 3 : Statics.field801;
        }
    }

    @ObfuscatedName("a.gd(Lbf;IIIIIB)V")
    public static final void method51(class78 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1073()) {
            return;
        }
        if (arg0 instanceof class86) {
            class266 var6 = ((class86) arg0).field1293;
            if (var6.field3634 != null) {
                var6 = var6.method4481();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class95.field1406;
        int[] var8 = class95.field1407;
        int var9 = 3;
        if (!arg0.field1169.method3456()) {
            method292(arg0, arg0.field1162 + 15);
            for (class85 var10 = (class85) arg0.field1169.method3453(); var10 != null; var10 = (class85) arg0.field1169.method3455()) {
                class79 var11 = var10.method1608(field1054);
                if (var11 != null) {
                    class256 var12 = var10.field1283;
                    class295 var13 = var12.method4218();
                    class295 var14 = var12.method4208();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3430;
                    } else {
                        if (var12.field3431 * 2 < var14.field3840) {
                            var15 = var12.field3431;
                        }
                        var16 = var14.field3840 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field1054 - var11.field1206;
                    int var20 = var11.field1205 * var16 / var12.field3430;
                    int var23;
                    if (var11.field1207 > var19) {
                        int var21 = var12.field3428 == 0 ? 0 : var19 / var12.field3428 * var12.field3428;
                        int var22 = var11.field1210 * var16 / var12.field3430;
                        var23 = (var20 - var22) * var21 / var11.field1207 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1207 + var12.field3427 - var19;
                        if (var12.field3416 >= 0) {
                            var17 = (var24 << 8) / (var12.field3427 - var12.field3416);
                        }
                    }
                    if (var11.field1205 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field955 + arg2 - (var16 >> 1);
                    int var26 = field1065 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field955 > -1) {
                            class291.method4776(var25, var26, var23, 5, 65280);
                            class291.method4776(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3839;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method4939(var27, var26, var17);
                            class291.method4770(var27, var26, var27 + var28, var26 + var29);
                            var14.method4939(var27, var26, var17);
                        } else {
                            var13.method4892(var27, var26);
                            class291.method4770(var27, var26, var27 + var28, var26 + var29);
                            var14.method4892(var27, var26);
                        }
                        class291.method4833(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1609()) {
                    var10.method3476();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class74 var30 = (class74) arg0;
            if (var30.field845) {
                return;
            }
            if (var30.field857 != -1 || var30.field843 != -1) {
                method292(arg0, arg0.field1162 + 15);
                if (field955 > -1) {
                    if (var30.field857 != -1) {
                        Statics.field1682[var30.field857].method4892(field955 + arg2 - 12, field1065 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field843 != -1) {
                        Statics.field831[var30.field843].method4892(field955 + arg2 - 12, field1065 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field917 == 10 && field889 == var8[arg1]) {
                method292(arg0, arg0.field1162 + 15);
                if (field955 > -1) {
                    Statics.field2912[1].method4892(field955 + arg2 - 12, field1065 + arg3 - var9);
                }
            }
        } else {
            class266 var31 = ((class86) arg0).field1293;
            if (var31.field3634 != null) {
                var31 = var31.method4481();
            }
            if (var31.field3632 >= 0 && var31.field3632 < Statics.field831.length) {
                method292(arg0, arg0.field1162 + 15);
                if (field955 > -1) {
                    Statics.field831[var31.field3632].method4892(field955 + arg2 - 12, field1065 + arg3 - 30);
                }
            }
            if (field917 == 1 && field888 == field909[arg1 - var7] && field1054 % 20 < 10) {
                method292(arg0, arg0.field1162 + 15);
                if (field955 > -1) {
                    Statics.field2912[0].method4892(field955 + arg2 - 12, field1065 + arg3 - 28);
                }
            }
        }
        if (arg0.field1157 != null && (arg1 >= var7 || !arg0.field1159 && (field1058 == 4 || !arg0.field1148 && (field1058 == 0 || field1058 == 3 || field1058 == 1 && method1463(((class74) arg0).field852, false))))) {
            method292(arg0, arg0.field1162);
            if (field955 > -1 && field943 < field944) {
                field948[field943] = Statics.field321.method4555(arg0.field1157) / 2;
                field945[field943] = Statics.field321.field3698;
                field1131[field943] = field955;
                field946[field943] = field1065;
                field949[field943] = arg0.field1161;
                field1100[field943] = arg0.field1189;
                field1066[field943] = arg0.field1149;
                field952[field943] = arg0.field1157;
                field943++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1166[var32];
            int var34 = arg0.field1170[var32];
            class262 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field1054) {
                    continue;
                }
                var35 = class262.method47(arg0.field1170[var32]);
                var36 = var35.field3473;
                if (var35 != null && var35.field3484 != null) {
                    var35 = var35.method4290();
                    if (var35 == null) {
                        arg0.field1166[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1167[var32];
            class262 var38 = null;
            if (var37 >= 0) {
                var38 = class262.method47(var37);
                if (var38 != null && var38.field3484 != null) {
                    var38 = var38.method4290();
                }
            }
            if (var33 - var36 <= field1054) {
                if (var35 == null) {
                    arg0.field1166[var32] = -1;
                } else {
                    method292(arg0, arg0.field1162 / 2);
                    if (field955 > -1) {
                        if (var32 == 1) {
                            field1065 -= 20;
                        }
                        if (var32 == 2) {
                            field955 -= 15;
                            field1065 -= 10;
                        }
                        if (var32 == 3) {
                            field955 += 15;
                            field1065 -= 10;
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
                        class295 var51 = null;
                        class295 var52 = null;
                        class295 var53 = null;
                        class295 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class295 var64 = var35.method4292();
                        if (var64 != null) {
                            var43 = var64.field3840;
                            int var65 = var64.field3839;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3842;
                        }
                        class295 var66 = var35.method4293();
                        if (var66 != null) {
                            var44 = var66.field3840;
                            int var67 = var66.field3839;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3842;
                        }
                        class295 var68 = var35.method4324();
                        if (var68 != null) {
                            var45 = var68.field3840;
                            int var69 = var68.field3839;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3842;
                        }
                        class295 var70 = var35.method4295();
                        if (var70 != null) {
                            var46 = var70.field3840;
                            int var71 = var70.field3839;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3842;
                        }
                        if (var38 != null) {
                            var51 = var38.method4292();
                            if (var51 != null) {
                                var55 = var51.field3840;
                                int var72 = var51.field3839;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3842;
                            }
                            var52 = var38.method4293();
                            if (var52 != null) {
                                var56 = var52.field3840;
                                int var73 = var52.field3839;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3842;
                            }
                            var53 = var38.method4324();
                            if (var53 != null) {
                                var57 = var53.field3840;
                                int var74 = var53.field3839;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3842;
                            }
                            var54 = var38.method4295();
                            if (var54 != null) {
                                var58 = var54.field3840;
                                int var75 = var54.field3839;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3842;
                            }
                        }
                        class271 var76 = var35.method4296();
                        if (var76 == null) {
                            var76 = Statics.field581;
                        }
                        class271 var77;
                        if (var38 == null) {
                            var77 = Statics.field581;
                        } else {
                            var77 = var38.method4296();
                            if (var77 == null) {
                                var77 = Statics.field581;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4318(arg0.field1191[var32]);
                        int var83 = var76.method4555(var82);
                        if (var38 != null) {
                            var79 = var38.method4318(arg0.field1168[var32]);
                            var81 = var77.method4555(var79);
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
                        int var100 = arg0.field1166[var32] - field1054;
                        int var101 = var35.field3478 - var35.field3478 * var100 / var35.field3473;
                        int var102 = var35.field3479 * var100 / var35.field3473 + -var35.field3479;
                        int var103 = field955 + arg2 - (var92 >> 1) + var101;
                        int var104 = field1065 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3471 + var104 + 15;
                        int var108 = var107 - var76.field3702;
                        int var109 = var76.field3715 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3471 + var104 + 15;
                            int var111 = var110 - var77.field3702;
                            int var112 = var77.field3715 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3465 >= 0) {
                            var115 = (var100 << 8) / (var35.field3473 - var35.field3465);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method4939(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method4939(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method4939(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method4939(var93 + var103 - var50, var104, var115);
                            }
                            var76.method4561(var82, var90 + var103, var107, var35.field3472, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4939(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method4939(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method4939(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4939(var97 + var103 - var62, var104, var115);
                                }
                                var77.method4561(var79, var98 + var103, var110, var38.field3472, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method4892(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method4892(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method4892(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method4892(var93 + var103 - var50, var104);
                            }
                            var76.method4560(var82, var90 + var103, var107, var35.field3472 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method4892(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method4892(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method4892(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method4892(var97 + var103 - var62, var104);
                                }
                                var77.method4560(var79, var98 + var103, var110, var38.field3472 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ap.gt(I)V")
    public static final void method289() {
        field969 = 0;
        int var0 = (Statics.field601.field1188 >> 7) + Statics.field1709;
        int var1 = (Statics.field601.field1145 >> 7) + Statics.field1710;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field969 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field969 = 1;
        }
        if (field969 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field969 = 0;
        }
    }

    @ObfuscatedName("ap.gc(Lbf;II)V")
    public static final void method292(class78 arg0, int arg1) {
        method7(arg0.field1188, arg0.field1145, arg1);
    }

    @ObfuscatedName("j.gr(IIIB)V")
    public static final void method7(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field955 = -1;
            field1065 = -1;
            return;
        }
        int var3 = method1051(arg0, arg1, Statics.field801) - arg2;
        int var4 = arg0 - Statics.field404;
        int var5 = var3 - Statics.field809;
        int var6 = arg1 - Statics.field858;
        int var7 = class136.field1947[Statics.field403];
        int var8 = class136.field1953[Statics.field403];
        int var9 = class136.field1947[Statics.field2906];
        int var10 = class136.field1953[Statics.field2906];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field955 = field1116 * var11 / var15 + field1114 / 2;
            field1065 = field1116 * var14 / var15 + field1115 / 2;
        } else {
            field955 = -1;
            field1065 = -1;
        }
    }

    @ObfuscatedName("bb.gx(IIII)I")
    public static final int method1051(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field732[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field740[var5][var3][var4] + class62.field740[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field740[var5][var3][var4 + 1] + class62.field740[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("k.go(IIIIIII)V")
    public static final void method84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class136.field1947[var6];
            int var12 = class136.field1953[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class136.field1947[var7];
            int var15 = class136.field1953[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field404 = arg0 - var8;
        Statics.field809 = arg1 - var9;
        Statics.field858 = arg2 - var10;
        Statics.field403 = arg3;
        Statics.field2906 = arg4;
    }

    @ObfuscatedName("ea.gh(ZLgi;B)V")
    public static final void method2739(boolean arg0, class187 arg1) {
        field959 = arg0;
        if (!field959) {
            int var2 = arg1.method3049();
            int var3 = arg1.method3050();
            int var4 = arg1.method3009();
            Statics.field336 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field336[var5][var6] = arg1.method3017();
                }
            }
            Statics.field1445 = new int[var4];
            Statics.field3439 = new int[var4];
            Statics.field3440 = new int[var4];
            Statics.field2108 = new byte[var4][];
            Statics.field483 = new byte[var4][];
            boolean var7 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
                var7 = true;
            }
            if (var3 / 8 == 48 && var2 / 8 == 148) {
                var7 = true;
            }
            int var8 = 0;
            for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    if (!var7 || var10 != 49 && var10 != 149 && var10 != 147 && var9 != 50 && (var9 != 49 || var10 != 47)) {
                        Statics.field1445[var8] = var11;
                        Statics.field3439[var8] = Statics.field648.method3985("m" + var9 + "_" + var10);
                        Statics.field3440[var8] = Statics.field648.method3985("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method2(var3, var2, true);
            return;
        }
        boolean var12 = arg1.method3040() == 1;
        int var13 = arg1.method3049();
        int var14 = arg1.method3051();
        int var15 = arg1.method3009();
        arg1.method3277();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3278(1);
                    if (var19 == 1) {
                        field885[var16][var17][var18] = arg1.method3278(26);
                    } else {
                        field885[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3296();
        Statics.field336 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field336[var20][var21] = arg1.method3017();
            }
        }
        Statics.field1445 = new int[var15];
        Statics.field3439 = new int[var15];
        Statics.field3440 = new int[var15];
        Statics.field2108 = new byte[var15][];
        Statics.field483 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field885[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field1445[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field1445[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field3439[var22] = Statics.field648.method3985("m" + var31 + "_" + var32);
                            Statics.field3440[var22] = Statics.field648.method3985("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method2(var14, var13, !var12);
    }

    @ObfuscatedName("p.gj(IIZI)V")
    public static final void method2(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field2919 == arg0 && Statics.field1368 == arg1) {
            return;
        }
        Statics.field2919 = arg0;
        Statics.field1368 = arg1;
        method4762(25);
        method1033(class233.field3103, true);
        int var3 = Statics.field1709;
        int var4 = Statics.field1710;
        Statics.field1709 = (arg0 - 6) * 8;
        Statics.field1710 = (arg1 - 6) * 8;
        int var5 = Statics.field1709 - var3;
        int var6 = Statics.field1710 - var4;
        int var7 = Statics.field1709;
        int var8 = Statics.field1710;
        for (int var9 = 0; var9 < 32768; var9++) {
            class86 var10 = field907[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1199[var11] -= var5;
                    var10.field1172[var11] -= var6;
                }
                var10.field1188 -= var5 * 128;
                var10.field1145 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class74 var13 = field1113[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1199[var14] -= var5;
                    var13.field1172[var14] -= var6;
                }
                var13.field1188 -= var5 * 128;
                var13.field1145 -= var6 * 128;
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
                        field887[var25][var21][var22] = field887[var25][var23][var24];
                    } else {
                        field887[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class77 var26 = (class77) field1051.method3486(); var26 != null; var26 = (class77) field1051.method3507()) {
            var26.field1134 -= var5;
            var26.field1139 -= var6;
            if (var26.field1134 < 0 || var26.field1139 < 0 || var26.field1134 >= 104 || var26.field1139 >= 104) {
                var26.method3476();
            }
        }
        if (field1084 != 0) {
            field1084 -= var5;
            field1085 -= var6;
        }
        field1092 = 0;
        field1098 = false;
        field1079 = -1;
        field983.method3506();
        field982.method3506();
        for (int var27 = 0; var27 < 4; var27++) {
            field922[var27].method2866();
        }
    }

    @ObfuscatedName("jm.gu(ZI)V")
    public static final void method4646(boolean arg0) {
        method1645();
        field953.field1467++;
        if (field953.field1467 < 50 && !arg0) {
            return;
        }
        field953.field1467 = 0;
        if (field914 || field953.method1786() == null) {
            return;
        }
        class171 var1 = class171.method1482(class168.field2308, field953.field1479);
        field953.method1783(var1);
        try {
            field953.method1790();
        } catch (IOException var3) {
            field914 = true;
        }
    }

    @ObfuscatedName("cq.gp(I)V")
    public static final void method1767() {
        method4646(false);
        field1030 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2108.length; var1++) {
            if (Statics.field3439[var1] != -1 && Statics.field2108[var1] == null) {
                Statics.field2108[var1] = Statics.field648.method3930(Statics.field3439[var1], 0);
                if (Statics.field2108[var1] == null) {
                    var0 = false;
                    field1030++;
                }
            }
            if (Statics.field3440[var1] != -1 && Statics.field483[var1] == null) {
                Statics.field483[var1] = Statics.field648.method3931(Statics.field3440[var1], 0, Statics.field336[var1]);
                if (Statics.field483[var1] == null) {
                    var0 = false;
                    field1030++;
                }
            }
        }
        if (!var0) {
            field921 = 1;
            return;
        }
        field919 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2108.length; var3++) {
            byte[] var4 = Statics.field483[var3];
            if (var4 != null) {
                int var5 = (Statics.field1445[var3] >> 8) * 64 - Statics.field1709;
                int var6 = (Statics.field1445[var3] & 0xFF) * 64 - Statics.field1710;
                if (field959) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class181 var9 = new class181(var4);
                int var10 = -1;
                label1019: while (true) {
                    int var11 = var9.method3140();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method3140();
                            if (var16 == 0) {
                                continue label1019;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method3012() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class263 var22 = class263.method190(var10);
                                if (var19 != 22 || !field875 || var22.field3507 != 0 || var22.field3527 == 1 || var22.field3526) {
                                    if (!var22.method4332()) {
                                        field919++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method3140();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method3012();
                    }
                }
            }
        }
        if (!var2) {
            field921 = 2;
            return;
        }
        if (field921 != 0) {
            method1033(class233.field3103 + class88.field1313 + class88.field1310 + 100 + "%" + class88.field1308, true);
        }
        method1645();
        method1523();
        method1645();
        Statics.field649.method2550();
        method1645();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field922[var23].method2866();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class62.field732[var24][var25][var26] = 0;
                }
            }
        }
        method1645();
        class62.method3147();
        int var27 = Statics.field2108.length;
        class82.method4226();
        method4646(true);
        if (!field959) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field1445[var28] >> 8) * 64 - Statics.field1709;
                int var30 = (Statics.field1445[var28] & 0xFF) * 64 - Statics.field1710;
                byte[] var31 = Statics.field2108[var28];
                if (var31 != null) {
                    method1645();
                    class62.method2288(var31, var29, var30, Statics.field2919 * 8 - 48, Statics.field1368 * 8 - 48, field922);
                }
            }
            for (int var32 = 0; var32 < var27; var32++) {
                int var33 = (Statics.field1445[var32] >> 8) * 64 - Statics.field1709;
                int var34 = (Statics.field1445[var32] & 0xFF) * 64 - Statics.field1710;
                byte[] var35 = Statics.field2108[var32];
                if (var35 == null && Statics.field1368 < 800) {
                    method1645();
                    class62.method1466(var33, var34, 64, 64);
                }
            }
            method4646(true);
            for (int var36 = 0; var36 < var27; var36++) {
                byte[] var37 = Statics.field483[var36];
                if (var37 != null) {
                    int var38 = (Statics.field1445[var36] >> 8) * 64 - Statics.field1709;
                    int var39 = (Statics.field1445[var36] & 0xFF) * 64 - Statics.field1710;
                    method1645();
                    class62.method526(var37, var38, var39, Statics.field649, field922);
                }
            }
        }
        if (field959) {
            for (int var40 = 0; var40 < 4; var40++) {
                method1645();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        boolean var43 = false;
                        int var44 = field885[var40][var41][var42];
                        if (var44 != -1) {
                            int var45 = var44 >> 24 & 0x3;
                            int var46 = var44 >> 1 & 0x3;
                            int var47 = var44 >> 14 & 0x3FF;
                            int var48 = var44 >> 3 & 0x7FF;
                            int var49 = (var47 / 8 << 8) + var48 / 8;
                            for (int var50 = 0; var50 < Statics.field1445.length; var50++) {
                                if (Statics.field1445[var50] == var49 && Statics.field2108[var50] != null) {
                                    class62.method1400(Statics.field2108[var50], var40, var41 * 8, var42 * 8, var45, (var47 & 0x7) * 8, (var48 & 0x7) * 8, var46, field922);
                                    var43 = true;
                                    break;
                                }
                            }
                        }
                        if (!var43) {
                            class62.method1702(var40, var41 * 8, var42 * 8);
                        }
                    }
                }
            }
            for (int var51 = 0; var51 < 13; var51++) {
                for (int var52 = 0; var52 < 13; var52++) {
                    int var53 = field885[0][var51][var52];
                    if (var53 == -1) {
                        class62.method1466(var51 * 8, var52 * 8, 8, 8);
                    }
                }
            }
            method4646(true);
            for (int var54 = 0; var54 < 4; var54++) {
                method1645();
                for (int var55 = 0; var55 < 13; var55++) {
                    label894: for (int var56 = 0; var56 < 13; var56++) {
                        int var57 = field885[var54][var55][var56];
                        if (var57 != -1) {
                            int var58 = var57 >> 24 & 0x3;
                            int var59 = var57 >> 1 & 0x3;
                            int var60 = var57 >> 14 & 0x3FF;
                            int var61 = var57 >> 3 & 0x7FF;
                            int var62 = (var60 / 8 << 8) + var61 / 8;
                            for (int var63 = 0; var63 < Statics.field1445.length; var63++) {
                                if (Statics.field1445[var63] == var62 && Statics.field483[var63] != null) {
                                    byte[] var64 = Statics.field483[var63];
                                    int var65 = var55 * 8;
                                    int var66 = var56 * 8;
                                    int var67 = (var60 & 0x7) * 8;
                                    int var68 = (var61 & 0x7) * 8;
                                    class139 var69 = Statics.field649;
                                    class163[] var70 = field922;
                                    class181 var71 = new class181(var64);
                                    int var72 = -1;
                                    while (true) {
                                        int var73 = var71.method3140();
                                        if (var73 == 0) {
                                            continue label894;
                                        }
                                        var72 += var73;
                                        int var74 = 0;
                                        while (true) {
                                            int var75 = var71.method3140();
                                            if (var75 == 0) {
                                                break;
                                            }
                                            var74 += var75 - 1;
                                            int var76 = var74 & 0x3F;
                                            int var77 = var74 >> 6 & 0x3F;
                                            int var78 = var74 >> 12;
                                            int var79 = var71.method3012();
                                            int var80 = var79 >> 2;
                                            int var81 = var79 & 0x3;
                                            if (var58 == var78 && var77 >= var67 && var77 < var67 + 8 && var76 >= var68 && var76 < var68 + 8) {
                                                class263 var82 = class263.method190(var72);
                                                int var83 = var65 + class223.method1107(var77 & 0x7, var76 & 0x7, var59, var82.field3503, var82.field3525, var81);
                                                int var84 = var66 + class223.method732(var77 & 0x7, var76 & 0x7, var59, var82.field3503, var82.field3525, var81);
                                                if (var83 > 0 && var84 > 0 && var83 < 103 && var84 < 103) {
                                                    int var85 = var54;
                                                    if ((class62.field732[1][var83][var84] & 0x2) == 2) {
                                                        var85 = var54 - 1;
                                                    }
                                                    class163 var86 = null;
                                                    if (var85 >= 0) {
                                                        var86 = var70[var85];
                                                    }
                                                    class62.method2792(var54, var83, var84, var72, var59 + var81 & 0x3, var80, var69, var86);
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
        method4646(true);
        method1523();
        method1645();
        class139 var87 = Statics.field649;
        class163[] var88 = field922;
        for (int var89 = 0; var89 < 4; var89++) {
            for (int var90 = 0; var90 < 104; var90++) {
                for (int var91 = 0; var91 < 104; var91++) {
                    if ((class62.field732[var89][var90][var91] & 0x1) == 1) {
                        int var92 = var89;
                        if ((class62.field732[1][var90][var91] & 0x2) == 2) {
                            var92 = var89 - 1;
                        }
                        if (var92 >= 0) {
                            var88[var92].method2869(var90, var91);
                        }
                    }
                }
            }
        }
        class62.field738 += (int) (Math.random() * 5.0D) - 2;
        if (class62.field738 < -8) {
            class62.field738 = -8;
        }
        if (class62.field738 > 8) {
            class62.field738 = 8;
        }
        class62.field731 += (int) (Math.random() * 5.0D) - 2;
        if (class62.field731 < -16) {
            class62.field731 = -16;
        }
        if (class62.field731 > 16) {
            class62.field731 = 16;
        }
        for (int var93 = 0; var93 < 4; var93++) {
            byte[][] var94 = Statics.field739[var93];
            int var95 = (int) Math.sqrt(5100.0D);
            int var96 = var95 * 768 >> 8;
            for (int var97 = 1; var97 < 103; var97++) {
                for (int var98 = 1; var98 < 103; var98++) {
                    int var99 = class62.field740[var93][var98 + 1][var97] - class62.field740[var93][var98 - 1][var97];
                    int var100 = class62.field740[var93][var98][var97 + 1] - class62.field740[var93][var98][var97 - 1];
                    int var101 = (int) Math.sqrt((double) (var100 * var100 + var99 * var99 + 65536));
                    int var102 = (var99 << 8) / var101;
                    int var103 = 65536 / var101;
                    int var104 = (var100 << 8) / var101;
                    int var105 = (var104 * -50 + var102 * -50 + var103 * -10) / var96 + 96;
                    int var106 = (var94[var98][var97] >> 1) + (var94[var98][var97 + 1] >> 3) + (var94[var98][var97 - 1] >> 2) + (var94[var98 - 1][var97] >> 2) + (var94[var98 + 1][var97] >> 3);
                    Statics.field2687[var98][var97] = var105 - var106;
                }
            }
            for (int var107 = 0; var107 < 104; var107++) {
                Statics.field730[var107] = 0;
                Statics.field633[var107] = 0;
                Statics.field1228[var107] = 0;
                Statics.field3400[var107] = 0;
                Statics.field729[var107] = 0;
            }
            for (int var108 = -5; var108 < 109; var108++) {
                for (int var109 = 0; var109 < 104; var109++) {
                    int var110 = var108 + 5;
                    int var10002;
                    if (var110 >= 0 && var110 < 104) {
                        int var111 = Statics.field727[var93][var110][var109] & 0xFF;
                        if (var111 > 0) {
                            class254 var112 = class254.method5(var111 - 1);
                            Statics.field730[var109] += var112.field3397;
                            Statics.field633[var109] += var112.field3398;
                            Statics.field1228[var109] += var112.field3395;
                            Statics.field3400[var109] += var112.field3399;
                            var10002 = Statics.field729[var109]++;
                        }
                    }
                    int var113 = var108 - 5;
                    if (var113 >= 0 && var113 < 104) {
                        int var114 = Statics.field727[var93][var113][var109] & 0xFF;
                        if (var114 > 0) {
                            class254 var115 = class254.method5(var114 - 1);
                            Statics.field730[var109] -= var115.field3397;
                            Statics.field633[var109] -= var115.field3398;
                            Statics.field1228[var109] -= var115.field3395;
                            Statics.field3400[var109] -= var115.field3399;
                            var10002 = Statics.field729[var109]--;
                        }
                    }
                }
                if (var108 >= 1 && var108 < 103) {
                    int var116 = 0;
                    int var117 = 0;
                    int var118 = 0;
                    int var119 = 0;
                    int var120 = 0;
                    for (int var121 = -5; var121 < 109; var121++) {
                        int var122 = var121 + 5;
                        if (var122 >= 0 && var122 < 104) {
                            var116 += Statics.field730[var122];
                            var117 += Statics.field633[var122];
                            var118 += Statics.field1228[var122];
                            var119 += Statics.field3400[var122];
                            var120 += Statics.field729[var122];
                        }
                        int var123 = var121 - 5;
                        if (var123 >= 0 && var123 < 104) {
                            var116 -= Statics.field730[var123];
                            var117 -= Statics.field633[var123];
                            var118 -= Statics.field1228[var123];
                            var119 -= Statics.field3400[var123];
                            var120 -= Statics.field729[var123];
                        }
                        if (var121 >= 1 && var121 < 103 && (!field875 || (class62.field732[0][var108][var121] & 0x2) != 0 || (class62.field732[var93][var108][var121] & 0x10) == 0)) {
                            if (var93 < class62.field726) {
                                class62.field726 = var93;
                            }
                            int var124 = Statics.field727[var93][var108][var121] & 0xFF;
                            int var125 = Statics.field3791[var93][var108][var121] & 0xFF;
                            if (var124 > 0 || var125 > 0) {
                                int var126 = class62.field740[var93][var108][var121];
                                int var127 = class62.field740[var93][var108 + 1][var121];
                                int var128 = class62.field740[var93][var108 + 1][var121 + 1];
                                int var129 = class62.field740[var93][var108][var121 + 1];
                                int var130 = Statics.field2687[var108][var121];
                                int var131 = Statics.field2687[var108 + 1][var121];
                                int var132 = Statics.field2687[var108 + 1][var121 + 1];
                                int var133 = Statics.field2687[var108][var121 + 1];
                                int var134 = -1;
                                int var135 = -1;
                                if (var124 > 0) {
                                    int var136 = var116 * 256 / var119;
                                    int var137 = var117 / var120;
                                    int var138 = var118 / var120;
                                    var134 = Statics.method598(var136, var137, var138);
                                    int var139 = class62.field738 + var136 & 0xFF;
                                    int var140 = class62.field731 + var138;
                                    if (var140 < 0) {
                                        var140 = 0;
                                    } else if (var140 > 255) {
                                        var140 = 255;
                                    }
                                    var135 = Statics.method598(var139, var137, var140);
                                }
                                if (var93 > 0) {
                                    boolean var141 = true;
                                    if (var124 == 0 && Statics.field728[var93][var108][var121] != 0) {
                                        var141 = false;
                                    }
                                    if (var125 > 0 && !class267.method1587(var125 - 1).field3646) {
                                        var141 = false;
                                    }
                                    if (var141 && var126 == var127 && var126 == var128 && var126 == var129) {
                                        Statics.field1711[var93][var108][var121] |= 0x924;
                                    }
                                }
                                int var142 = 0;
                                if (var135 != -1) {
                                    var142 = class136.field1951[class62.method4722(var135, 96)];
                                }
                                if (var125 == 0) {
                                    var87.method2597(var93, var108, var121, 0, 0, -1, var126, var127, var128, var129, class62.method4722(var134, var130), class62.method4722(var134, var131), class62.method4722(var134, var132), class62.method4722(var134, var133), 0, 0, 0, 0, var142, 0);
                                } else {
                                    int var143 = Statics.field728[var93][var108][var121] + 1;
                                    byte var144 = Statics.field491[var93][var108][var121];
                                    class267 var145 = class267.method1587(var125 - 1);
                                    int var146 = var145.field3645;
                                    int var147;
                                    int var148;
                                    if (var146 >= 0) {
                                        var147 = Statics.field1956.method2266(var146);
                                        var148 = -1;
                                    } else if (var145.field3643 == 16711935) {
                                        var148 = -2;
                                        var146 = -1;
                                        var147 = -2;
                                    } else {
                                        var148 = Statics.method598(var145.field3644, var145.field3649, var145.field3650);
                                        int var149 = class62.field738 + var145.field3644 & 0xFF;
                                        int var150 = class62.field731 + var145.field3650;
                                        if (var150 < 0) {
                                            var150 = 0;
                                        } else if (var150 > 255) {
                                            var150 = 255;
                                        }
                                        var147 = Statics.method598(var149, var145.field3649, var150);
                                    }
                                    int var151 = 0;
                                    if (var147 != -2) {
                                        var151 = class136.field1951[class62.method536(var147, 96)];
                                    }
                                    if (var145.field3647 != -1) {
                                        int var152 = class62.field738 + var145.field3642 & 0xFF;
                                        int var153 = class62.field731 + var145.field3653;
                                        if (var153 < 0) {
                                            var153 = 0;
                                        } else if (var153 > 255) {
                                            var153 = 255;
                                        }
                                        int var154 = Statics.method598(var152, var145.field3651, var153);
                                        var151 = class136.field1951[class62.method536(var154, 96)];
                                    }
                                    var87.method2597(var93, var108, var121, var143, var144, var146, var126, var127, var128, var129, class62.method4722(var134, var130), class62.method4722(var134, var131), class62.method4722(var134, var132), class62.method4722(var134, var133), class62.method536(var148, var130), class62.method536(var148, var131), class62.method536(var148, var132), class62.method536(var148, var133), var142, var151);
                                }
                            }
                        }
                    }
                }
            }
            for (int var155 = 1; var155 < 103; var155++) {
                for (int var156 = 1; var156 < 103; var156++) {
                    int var161;
                    if ((class62.field732[var93][var156][var155] & 0x8) != 0) {
                        var161 = 0;
                    } else if (var93 <= 0 || (class62.field732[1][var156][var155] & 0x2) == 0) {
                        var161 = var93;
                    } else {
                        var161 = var93 - 1;
                    }
                    var87.method2554(var93, var156, var155, var161);
                }
            }
            Statics.field727[var93] = (byte[][]) null;
            Statics.field3791[var93] = (byte[][]) null;
            Statics.field728[var93] = (byte[][]) null;
            Statics.field491[var93] = (byte[][]) null;
            Statics.field739[var93] = (byte[][]) null;
        }
        var87.method2581(-50, -10, -50);
        for (int var162 = 0; var162 < 104; var162++) {
            for (int var163 = 0; var163 < 104; var163++) {
                if ((class62.field732[1][var162][var163] & 0x2) == 2) {
                    var87.method2552(var162, var163);
                }
            }
        }
        int var164 = 1;
        int var165 = 2;
        int var166 = 4;
        for (int var167 = 0; var167 < 4; var167++) {
            if (var167 > 0) {
                var164 <<= 0x3;
                var165 <<= 0x3;
                var166 <<= 0x3;
            }
            for (int var168 = 0; var168 <= var167; var168++) {
                for (int var169 = 0; var169 <= 104; var169++) {
                    for (int var170 = 0; var170 <= 104; var170++) {
                        if ((Statics.field1711[var168][var170][var169] & var164) != 0) {
                            int var171 = var169;
                            int var172 = var169;
                            int var173 = var168;
                            int var174 = var168;
                            while (var171 > 0 && (Statics.field1711[var168][var170][var171 - 1] & var164) != 0) {
                                var171--;
                            }
                            while (var172 < 104 && (Statics.field1711[var168][var170][var172 + 1] & var164) != 0) {
                                var172++;
                            }
                            label622: while (var173 > 0) {
                                for (int var175 = var171; var175 <= var172; var175++) {
                                    if ((Statics.field1711[var173 - 1][var170][var175] & var164) == 0) {
                                        break label622;
                                    }
                                }
                                var173--;
                            }
                            label611: while (var174 < var167) {
                                for (int var176 = var171; var176 <= var172; var176++) {
                                    if ((Statics.field1711[var174 + 1][var170][var176] & var164) == 0) {
                                        break label611;
                                    }
                                }
                                var174++;
                            }
                            int var177 = (var174 + 1 - var173) * (var172 - var171 + 1);
                            if (var177 >= 8) {
                                short var178 = 240;
                                int var179 = class62.field740[var174][var170][var171] - var178;
                                int var180 = class62.field740[var173][var170][var171];
                                class139.method2553(var167, 1, var170 * 128, var170 * 128, var171 * 128, var172 * 128 + 128, var179, var180);
                                for (int var181 = var173; var181 <= var174; var181++) {
                                    for (int var182 = var171; var182 <= var172; var182++) {
                                        Statics.field1711[var181][var170][var182] &= ~var164;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1711[var168][var170][var169] & var165) != 0) {
                            int var183 = var170;
                            int var184 = var170;
                            int var185 = var168;
                            int var186 = var168;
                            while (var183 > 0 && (Statics.field1711[var168][var183 - 1][var169] & var165) != 0) {
                                var183--;
                            }
                            while (var184 < 104 && (Statics.field1711[var168][var184 + 1][var169] & var165) != 0) {
                                var184++;
                            }
                            label675: while (var185 > 0) {
                                for (int var187 = var183; var187 <= var184; var187++) {
                                    if ((Statics.field1711[var185 - 1][var187][var169] & var165) == 0) {
                                        break label675;
                                    }
                                }
                                var185--;
                            }
                            label664: while (var186 < var167) {
                                for (int var188 = var183; var188 <= var184; var188++) {
                                    if ((Statics.field1711[var186 + 1][var188][var169] & var165) == 0) {
                                        break label664;
                                    }
                                }
                                var186++;
                            }
                            int var189 = (var186 + 1 - var185) * (var184 - var183 + 1);
                            if (var189 >= 8) {
                                short var190 = 240;
                                int var191 = class62.field740[var186][var183][var169] - var190;
                                int var192 = class62.field740[var185][var183][var169];
                                class139.method2553(var167, 2, var183 * 128, var184 * 128 + 128, var169 * 128, var169 * 128, var191, var192);
                                for (int var193 = var185; var193 <= var186; var193++) {
                                    for (int var194 = var183; var194 <= var184; var194++) {
                                        Statics.field1711[var193][var194][var169] &= ~var165;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1711[var168][var170][var169] & var166) != 0) {
                            int var195 = var170;
                            int var196 = var170;
                            int var197 = var169;
                            int var198 = var169;
                            while (var197 > 0 && (Statics.field1711[var168][var170][var197 - 1] & var166) != 0) {
                                var197--;
                            }
                            while (var198 < 104 && (Statics.field1711[var168][var170][var198 + 1] & var166) != 0) {
                                var198++;
                            }
                            label728: while (var195 > 0) {
                                for (int var199 = var197; var199 <= var198; var199++) {
                                    if ((Statics.field1711[var168][var195 - 1][var199] & var166) == 0) {
                                        break label728;
                                    }
                                }
                                var195--;
                            }
                            label717: while (var196 < 104) {
                                for (int var200 = var197; var200 <= var198; var200++) {
                                    if ((Statics.field1711[var168][var196 + 1][var200] & var166) == 0) {
                                        break label717;
                                    }
                                }
                                var196++;
                            }
                            if ((var196 - var195 + 1) * (var198 - var197 + 1) >= 4) {
                                int var201 = class62.field740[var168][var195][var197];
                                class139.method2553(var167, 4, var195 * 128, var196 * 128 + 128, var197 * 128, var198 * 128 + 128, var201, var201);
                                for (int var202 = var195; var202 <= var196; var202++) {
                                    for (int var203 = var197; var203 <= var198; var203++) {
                                        Statics.field1711[var168][var202][var203] &= ~var166;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method4646(true);
        int var204 = class62.field726;
        if (var204 > Statics.field801) {
            var204 = Statics.field801;
        }
        if (var204 < Statics.field801 - 1) {
            int var205 = Statics.field801 - 1;
        }
        if (field875) {
            Statics.field649.method2551(class62.field726);
        } else {
            Statics.field649.method2551(0);
        }
        for (int var206 = 0; var206 < 104; var206++) {
            for (int var207 = 0; var207 < 104; var207++) {
                method225(var206, var207);
            }
        }
        method1645();
        for (class77 var208 = (class77) field1051.method3486(); var208 != null; var208 = (class77) field1051.method3507()) {
            if (var208.field1138 == -1) {
                var208.field1142 = 0;
                method3785(var208);
            } else {
                var208.method3476();
            }
        }
        class263.field3491.method3423();
        if (Statics.field247.method805()) {
            class171 var209 = class171.method1482(class168.field2313, field953.field1479);
            var209.field2424.method2999(1057001181);
            field953.method1783(var209);
        }
        if (!field959) {
            int var210 = (Statics.field2919 - 6) / 8;
            int var211 = (Statics.field2919 + 6) / 8;
            int var212 = (Statics.field1368 - 6) / 8;
            int var213 = (Statics.field1368 + 6) / 8;
            for (int var214 = var210 - 1; var214 <= var211 + 1; var214++) {
                for (int var215 = var212 - 1; var215 <= var213 + 1; var215++) {
                    if (var214 < var210 || var214 > var211 || var215 < var212 || var215 > var213) {
                        Statics.field648.method3952("m" + var214 + "_" + var215);
                        Statics.field648.method3952("l" + var214 + "_" + var215);
                    }
                }
            }
        }
        method4762(30);
        method1645();
        class62.method596();
        class171 var216 = class171.method1482(class168.field2388, field953.field1479);
        field953.method1783(var216);
        Statics.field698.method2778();
        for (int var217 = 0; var217 < 32; var217++) {
            field670[var217] = 0L;
        }
        for (int var218 = 0; var218 < 32; var218++) {
            field672[var218] = 0L;
        }
        Statics.field250 = 0;
    }

    @ObfuscatedName("ay.gb(IIIIII)V")
    public static final void method519(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field649.method2583(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field649.method2681(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field508.field3850;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class263 var13 = class263.method190(var12);
            if (var13.field3517 == -1) {
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
                class294 var14 = Statics.field3251[var13.field3517];
                if (var14 != null) {
                    int var15 = (var13.field3503 * 4 - var14.field3834) / 2;
                    int var16 = (var13.field3525 * 4 - var14.field3833) / 2;
                    var14.method4860(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3525) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field649.method2620(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field649.method2681(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class263 var22 = class263.method190(var21);
            if (var22.field3517 != -1) {
                class294 var23 = Statics.field3251[var22.field3517];
                if (var23 != null) {
                    int var24 = (var22.field3503 * 4 - var23.field3834) / 2;
                    int var25 = (var22.field3525 * 4 - var23.field3833) / 2;
                    var23.method4860(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3525) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field508.field3850;
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
        int var29 = Statics.field649.method2711(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class263 var31 = class263.method190(var30);
        if (var31.field3517 == -1) {
            return;
        }
        class294 var32 = Statics.field3251[var31.field3517];
        if (var32 != null) {
            int var33 = (var31.field3503 * 4 - var32.field3834) / 2;
            int var34 = (var31.field3525 * 4 - var32.field3833) / 2;
            var32.method4860(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3525) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.gf(Lcx;I)Z")
    public final boolean method1357(class101 arg0) {
        class161 var2 = arg0.method1786();
        class187 var3 = arg0.field1470;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1471 == null) {
                if (arg0.field1475) {
                    if (!var2.method2832(1)) {
                        return false;
                    }
                    var2.method2833(arg0.field1470.field2499, 0, 1);
                    arg0.field1476 = 0;
                    arg0.field1475 = false;
                }
                var3.field2498 = 0;
                if (var3.method3275()) {
                    if (!var2.method2832(1)) {
                        return false;
                    }
                    var2.method2833(arg0.field1470.field2499, 1, 1);
                    arg0.field1476 = 0;
                }
                arg0.field1475 = true;
                class167[] var4 = class167.method2753();
                int var5 = var3.method3276();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field2498);
                }
                arg0.field1471 = var4[var5];
                arg0.field1472 = arg0.field1471.field2305;
            }
            if (arg0.field1472 == -1) {
                if (!var2.method2832(1)) {
                    return false;
                }
                arg0.method1786().method2833(var3.field2499, 0, 1);
                arg0.field1472 = var3.field2499[0] & 0xFF;
            }
            if (arg0.field1472 == -2) {
                if (!var2.method2832(2)) {
                    return false;
                }
                arg0.method1786().method2833(var3.field2499, 0, 2);
                var3.field2498 = 0;
                arg0.field1472 = var3.method3009();
            }
            if (!var2.method2832(arg0.field1472)) {
                return false;
            }
            var3.field2498 = 0;
            var2.method2833(var3.field2499, 0, arg0.field1472);
            arg0.field1476 = 0;
            field971.method4731();
            arg0.field1478 = arg0.field1477;
            arg0.field1477 = arg0.field1465;
            arg0.field1465 = arg0.field1471;
            if (class167.field2252 == arg0.field1471) {
                int var6 = var3.method3050();
                int var7 = var3.method3058();
                class224 var8 = class224.method1468(var7);
                if (var8 != null && var8.field2809 == 0) {
                    if (var6 > var8.field2751 - var8.field2775) {
                        var6 = var8.field2751 - var8.field2775;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (var8.field2749 != var6) {
                        var8.field2749 = var6;
                        method353(var8);
                    }
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2282 == arg0.field1471) {
                int var9 = var3.method3012();
                int var10 = var3.method3012();
                int var11 = var3.method3012();
                int var12 = var3.method3012();
                field1099[var9] = true;
                field950[var9] = var10;
                field1072[var9] = var11;
                field1102[var9] = var12;
                field947[var9] = 0;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2290 == arg0.field1471) {
                int var13 = var3.method3053();
                int var14 = var3.method3017();
                class224 var15 = class224.method1468(var14);
                if (var15.field2774 != var13 || var13 == -1) {
                    var15.field2774 = var13;
                    var15.field2738 = 0;
                    var15.field2850 = 0;
                    method353(var15);
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2285 == arg0.field1471) {
                method501();
                field1075 = var3.method3015();
                field1047 = field1101;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2240 == arg0.field1471) {
                for (int var16 = 0; var16 < class219.field2689.length; var16++) {
                    if (class219.field2689[var16] != class219.field2688[var16]) {
                        class219.field2689[var16] = class219.field2688[var16];
                        method1766(var16);
                        field1036[++field1129 - 1 & 0x1F] = var16;
                    }
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2231 == arg0.field1471) {
                method17(class170.field2411);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2284 == arg0.field1471) {
                int var17 = var3.method3009();
                int var18 = var3.method3012();
                int var19 = var3.method3009();
                if (field1090 != 0 && var18 != 0 && field1092 < 50) {
                    field911[field1092] = var17;
                    field1094[field1092] = var18;
                    field1095[field1092] = var19;
                    field980[field1092] = null;
                    field1034[field1092] = 0;
                    field1092++;
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2280 == arg0.field1471) {
                field917 = var3.method3012();
                if (field917 == 1) {
                    field888 = var3.method3009();
                }
                if (field917 >= 2 && field917 <= 6) {
                    if (field917 == 2) {
                        field893 = 64;
                        field894 = 64;
                    }
                    if (field917 == 3) {
                        field893 = 0;
                        field894 = 64;
                    }
                    if (field917 == 4) {
                        field893 = 128;
                        field894 = 64;
                    }
                    if (field917 == 5) {
                        field893 = 64;
                        field894 = 0;
                    }
                    if (field917 == 6) {
                        field893 = 64;
                        field894 = 128;
                    }
                    field917 = 2;
                    field890 = var3.method3009();
                    field891 = var3.method3009();
                    field892 = var3.method3012();
                }
                if (field917 == 10) {
                    field889 = var3.method3009();
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2245 == arg0.field1471) {
                int var23 = var3.method3040();
                int var24 = var3.method3049();
                int var25 = var3.method3019();
                class68 var26 = (class68) field1026.method3444((long) var25);
                if (var26 != null) {
                    method2748(var26, var26.field781 != var24);
                }
                method4(var25, var24, var23);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2262 == arg0.field1471) {
                method17(class170.field2416);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2277 == arg0.field1471) {
                for (int var27 = 0; var27 < Statics.field3345; var27++) {
                    class249 var28 = class249.method1109(var27);
                    if (var28 != null) {
                        class219.field2688[var27] = 0;
                        class219.field2689[var27] = 0;
                    }
                }
                method501();
                field1129 += 32;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2278 == arg0.field1471) {
                field1086 = var3.method3012();
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2283 == arg0.field1471) {
                boolean var29 = var3.method3134() == 1;
                int var30 = var3.method3019();
                class224 var31 = class224.method1468(var30);
                if (var31.field2747 != var29) {
                    var31.field2747 = var29;
                    method353(var31);
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2300 == arg0.field1471) {
                method501();
                int var32 = var3.method3058();
                int var33 = var3.method3041();
                int var34 = var3.method3012();
                field986[var33] = var32;
                field896[var33] = var34;
                field985[var33] = 1;
                for (int var35 = 0; var35 < 98; var35++) {
                    if (var32 >= class230.field2910[var35]) {
                        field985[var33] = var35 + 2;
                    }
                }
                field1040[++field1035 - 1 & 0x1F] = var33;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2295 == arg0.field1471) {
                int var36 = var3.method3049();
                byte var37 = var3.method3043();
                class219.field2688[var36] = var37;
                if (class219.field2689[var36] != var37) {
                    class219.field2689[var36] = var37;
                }
                method1766(var36);
                field1036[++field1129 - 1 & 0x1F] = var36;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2267 == arg0.field1471) {
                field1098 = true;
                Statics.field468 = var3.method3012();
                Statics.field762 = var3.method3012();
                Statics.field1208 = var3.method3009();
                Statics.field1689 = var3.method3012();
                Statics.field239 = var3.method3012();
                if (Statics.field239 >= 100) {
                    int var38 = Statics.field468 * 128 + 64;
                    int var39 = Statics.field762 * 128 + 64;
                    int var40 = method1051(var38, var39, Statics.field801) - Statics.field1208;
                    int var41 = var38 - Statics.field404;
                    int var42 = var40 - Statics.field809;
                    int var43 = var39 - Statics.field858;
                    int var44 = (int) Math.sqrt((double) (var41 * var41 + var43 * var43));
                    Statics.field403 = (int) (Math.atan2((double) var42, (double) var44) * 325.949D) & 0x7FF;
                    Statics.field2906 = (int) (Math.atan2((double) var41, (double) var43) * -325.949D) & 0x7FF;
                    if (Statics.field403 < 128) {
                        Statics.field403 = 128;
                    }
                    if (Statics.field403 > 383) {
                        Statics.field403 = 383;
                    }
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2254 == arg0.field1471) {
                int var45 = var3.method3017();
                class224 var46 = class224.method1468(var45);
                for (int var47 = 0; var47 < var46.field2845.length; var47++) {
                    var46.field2845[var47] = -1;
                    var46.field2845[var47] = 0;
                }
                method353(var46);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2301 == arg0.field1471) {
                while (var3.field2498 < arg0.field1472) {
                    boolean var48 = var3.method3012() == 1;
                    String var49 = var3.method3021();
                    String var50 = var3.method3021();
                    int var51 = var3.method3009();
                    int var52 = var3.method3012();
                    int var53 = var3.method3012();
                    boolean var54 = (var53 & 0x2) != 0;
                    boolean var55 = (var53 & 0x1) != 0;
                    if (var51 > 0) {
                        var3.method3021();
                        var3.method3012();
                        var3.method3017();
                    }
                    var3.method3021();
                    for (int var56 = 0; var56 < field1117; var56++) {
                        class66 var57 = field1004[var56];
                        if (var48) {
                            if (var50.equals(var57.field773)) {
                                var57.field773 = var49;
                                var57.field768 = var50;
                                var49 = null;
                                break;
                            }
                        } else if (var49.equals(var57.field773)) {
                            if (var57.field774 != var51) {
                                boolean var58 = true;
                                for (class67 var59 = (class67) field1118.method3518(); var59 != null; var59 = (class67) field1118.method3515()) {
                                    if (var59.field777.equals(var49)) {
                                        if (var51 != 0 && var59.field778 == 0) {
                                            var59.method3526();
                                            var58 = false;
                                        } else if (var51 == 0 && var59.field778 != 0) {
                                            var59.method3526();
                                            var58 = false;
                                        }
                                    }
                                }
                                if (var58) {
                                    field1118.method3516(new class67(var49, var51));
                                }
                                var57.field774 = var51;
                            }
                            var57.field768 = var50;
                            var57.field770 = var52;
                            var57.field771 = var54;
                            var57.field772 = var55;
                            var49 = null;
                            break;
                        }
                    }
                    if (var49 != null && field1117 < 400) {
                        class66 var60 = new class66();
                        field1004[field1117] = var60;
                        var60.field773 = var49;
                        var60.field768 = var50;
                        var60.field774 = var51;
                        var60.field770 = var52;
                        var60.field771 = var54;
                        var60.field772 = var55;
                        field1117++;
                    }
                }
                field1022 = 2;
                field1043 = field1101;
                boolean var61 = false;
                int var62 = field1117;
                while (var62 > 0) {
                    boolean var63 = true;
                    var62--;
                    for (int var64 = 0; var64 < var62; var64++) {
                        boolean var65 = false;
                        class66 var66 = field1004[var64];
                        class66 var67 = field1004[var64 + 1];
                        if (field871 != var66.field774 && field871 == var67.field774) {
                            var65 = true;
                        }
                        if (!var65 && var66.field774 == 0 && var67.field774 != 0) {
                            var65 = true;
                        }
                        if (!var65 && !var66.field771 && var67.field771) {
                            var65 = true;
                        }
                        if (!var65 && !var66.field772 && var67.field772) {
                            var65 = true;
                        }
                        if (var65) {
                            class66 var68 = field1004[var64];
                            field1004[var64] = field1004[var64 + 1];
                            field1004[var64 + 1] = var68;
                            var63 = false;
                        }
                    }
                    if (var63) {
                        break;
                    }
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2268 == arg0.field1471) {
                if (field1010 != -1) {
                    int var69 = field1010;
                    if (class224.method1621(var69)) {
                        Statics.method2822(Statics.field3299[var69], 0);
                    }
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2237 == arg0.field1471) {
                String var70 = var3.method3021();
                String var71 = class272.method4559(class278.method4379(class273.method2864(var3)));
                class97.method1752(6, var70, var71);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2288 == arg0.field1471) {
                while (var3.field2498 < arg0.field1472) {
                    int var72 = var3.method3012();
                    boolean var73 = (var72 & 0x1) == 1;
                    String var74 = var3.method3021();
                    String var75 = var3.method3021();
                    var3.method3021();
                    for (int var76 = 0; var76 < field1018; var76++) {
                        class70 var77 = field1122[var76];
                        if (var73) {
                            if (var75.equals(var77.field799)) {
                                var77.field799 = var74;
                                var77.field803 = var75;
                                var74 = null;
                                break;
                            }
                        } else if (var74.equals(var77.field799)) {
                            var77.field799 = var74;
                            var77.field803 = var75;
                            var74 = null;
                            break;
                        }
                    }
                    if (var74 != null && field1018 < 400) {
                        class70 var78 = new class70();
                        field1122[field1018] = var78;
                        var78.field799 = var74;
                        var78.field803 = var75;
                        field1018++;
                    }
                }
                field1043 = field1101;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2303 == arg0.field1471) {
                class95.method1598(var3, arg0.field1472);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2298 == arg0.field1471) {
                int var79 = var3.method3017();
                int var80 = var3.method3009();
                if (var79 < -70000) {
                    var80 += 32768;
                }
                class224 var81;
                if (var79 >= 0) {
                    var81 = class224.method1468(var79);
                } else {
                    var81 = null;
                }
                while (var3.field2498 < arg0.field1472) {
                    int var82 = var3.method3140();
                    int var83 = var3.method3009();
                    int var84 = 0;
                    if (var83 != 0) {
                        var84 = var3.method3012();
                        if (var84 == 255) {
                            var84 = var3.method3017();
                        }
                    }
                    if (var81 != null && var82 >= 0 && var82 < var81.field2845.length) {
                        var81.field2845[var82] = var83;
                        var81.field2846[var82] = var84;
                    }
                    class64.method48(var80, var82, var83 - 1, var84);
                }
                if (var81 != null) {
                    method353(var81);
                }
                method501();
                field1038[++field992 - 1 & 0x1F] = var80 & 0x7FFF;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2253 == arg0.field1471) {
                int var85 = var3.method3153();
                int var86 = var3.method3053();
                int var87 = var3.method3017();
                class224 var88 = class224.method1468(var87);
                if (var88.field2818 != var86 || var88.field2758 != var85 || var88.field2732 != 0 || var88.field2733 != 0) {
                    var88.field2818 = var86;
                    var88.field2758 = var85;
                    var88.field2732 = 0;
                    var88.field2733 = 0;
                    method353(var88);
                    this.method1128(var88);
                    if (var88.field2809 == 0) {
                        method169(Statics.field3299[var87 >> 16], var88, false);
                    }
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2275 == arg0.field1471) {
                int var89 = var3.method3051();
                class64 var90 = (class64) class64.field750.method3444((long) var89);
                if (var90 != null) {
                    var90.method3476();
                }
                field1038[++field992 - 1 & 0x1F] = var89 & 0x7FFF;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2249 == arg0.field1471) {
                class95.field1406 = 0;
                for (int var91 = 0; var91 < 2048; var91++) {
                    class95.field1405[var91] = null;
                    class95.field1412[var91] = 1;
                }
                for (int var92 = 0; var92 < 2048; var92++) {
                    field1113[var92] = null;
                }
                class95.method3904(var3);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2243 == arg0.field1471) {
                int var93 = arg0.field1472 + var3.field2498;
                int var94 = var3.method3009();
                int var95 = var3.method3009();
                if (field1010 != var94) {
                    field1010 = var94;
                    this.method1124(false);
                    method3791(field1010);
                    class83.method257(field1010);
                    for (int var96 = 0; var96 < 100; var96++) {
                        field1056[var96] = true;
                    }
                }
                while (var95-- > 0) {
                    int var97 = var3.method3017();
                    int var98 = var3.method3009();
                    int var99 = var3.method3012();
                    class68 var100 = (class68) field1026.method3444((long) var97);
                    if (var100 != null && var100.field781 != var98) {
                        method2748(var100, true);
                        var100 = null;
                    }
                    if (var100 == null) {
                        var100 = method4(var97, var98, var99);
                    }
                    var100.field783 = true;
                }
                for (class68 var101 = (class68) field1026.method3433(); var101 != null; var101 = (class68) field1026.method3440()) {
                    if (var101.field783) {
                        var101.field783 = false;
                    } else {
                        method2748(var101, true);
                    }
                }
                field902 = new class198(512);
                while (var3.field2498 < var93) {
                    int var102 = var3.method3017();
                    int var103 = var3.method3009();
                    int var104 = var3.method3009();
                    int var105 = var3.method3017();
                    for (int var106 = var103; var106 <= var104; var106++) {
                        long var107 = ((long) var102 << 32) + (long) var106;
                        field902.method3431(new class206(var105), var107);
                    }
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2242 == arg0.field1471) {
                method17(class170.field2413);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2255 == arg0.field1471) {
                int var109 = var3.method3017();
                int var110 = var3.method3049();
                if (var110 == 65535) {
                    var110 = -1;
                }
                int var111 = var3.method3060();
                class224 var112 = class224.method1468(var109);
                if (var112.field2857) {
                    var112.field2829 = var110;
                    var112.field2848 = var111;
                    class264 var114 = class264.method4124(var110);
                    var112.field2855 = var114.field3557;
                    var112.field2779 = var114.field3556;
                    var112.field2780 = var114.field3569;
                    var112.field2776 = var114.field3560;
                    var112.field2769 = var114.field3592;
                    var112.field2781 = var114.field3547;
                    if (var114.field3559 == 1) {
                        var112.field2785 = 1;
                    } else {
                        var112.field2785 = 2;
                    }
                    if (var112.field2782 > 0) {
                        var112.field2781 = var112.field2781 * 32 / var112.field2782;
                    } else if (var112.field2726 > 0) {
                        var112.field2781 = var112.field2781 * 32 / var112.field2726;
                    }
                    method353(var112);
                } else if (var110 == -1) {
                    var112.field2770 = 0;
                    arg0.field1471 = null;
                    return true;
                } else {
                    class264 var113 = class264.method4124(var110);
                    var112.field2770 = 4;
                    var112.field2771 = var110;
                    var112.field2855 = var113.field3557;
                    var112.field2779 = var113.field3556;
                    var112.field2781 = var113.field3547 * 100 / var111;
                    method353(var112);
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2281 == arg0.field1471) {
                int var115 = var3.method3012();
                if (var3.method3012() == 0) {
                    field1126[var115] = new class17();
                    var3.field2498 += 18;
                } else {
                    var3.field2498--;
                    field1126[var115] = new class17(var3, false);
                }
                field1045 = field1101;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2260 == arg0.field1471) {
                int var116 = var3.method3060();
                class224 var117 = class224.method1468(var116);
                var117.field2770 = 3;
                var117.field2771 = Statics.field601.field833.method3787();
                method353(var117);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2299 == arg0.field1471) {
                method532(true, var3);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2297 == arg0.field1471) {
                int var118 = var3.method3017();
                int var119 = var3.method3009();
                if (var118 < -70000) {
                    var119 += 32768;
                }
                class224 var120;
                if (var118 >= 0) {
                    var120 = class224.method1468(var118);
                } else {
                    var120 = null;
                }
                if (var120 != null) {
                    for (int var121 = 0; var121 < var120.field2845.length; var121++) {
                        var120.field2845[var121] = 0;
                        var120.field2846[var121] = 0;
                    }
                }
                class64.method510(var119);
                int var122 = var3.method3009();
                for (int var123 = 0; var123 < var122; var123++) {
                    int var124 = var3.method3049();
                    int var125 = var3.method3134();
                    if (var125 == 255) {
                        var125 = var3.method3019();
                    }
                    if (var120 != null && var123 < var120.field2845.length) {
                        var120.field2845[var123] = var124;
                        var120.field2846[var123] = var125;
                    }
                    class64.method48(var119, var123, var124 - 1, var125);
                }
                if (var120 != null) {
                    method353(var120);
                }
                method501();
                field1038[++field992 - 1 & 0x1F] = var119 & 0x7FFF;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2296 == arg0.field1471) {
                Statics.field656 = var3.method3012();
                Statics.field2106 = var3.method3134();
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2293 == arg0.field1471) {
                int var126 = var3.method3009();
                if (var126 == 65535) {
                    var126 = -1;
                }
                method74(var126);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2292 == arg0.field1471) {
                int var127 = var3.method3075();
                int var128 = var3.method3009();
                if (var128 == 65535) {
                    var128 = -1;
                }
                if (field1060 != 0 && var128 != -1) {
                    class211.method3245(Statics.field3233, var128, 0, field1060, false);
                    field1089 = true;
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2234 == arg0.field1471) {
                method17(class170.field2414);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2247 == arg0.field1471) {
                String var129 = var3.method3021();
                Object[] var130 = new Object[var129.length() + 1];
                for (int var131 = var129.length() - 1; var131 >= 0; var131--) {
                    if (var129.charAt(var131) == 's') {
                        var130[var131 + 1] = var3.method3021();
                    } else {
                        var130[var131 + 1] = Integer.valueOf(var3.method3017());
                    }
                }
                var130[0] = Integer.valueOf(var3.method3017());
                class69 var132 = new class69();
                var132.field792 = var130;
                class83.method1986(var132);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2258 == arg0.field1471) {
                int var133 = var3.method3049();
                int var134 = var3.method3060();
                int var135 = var133 >> 10 & 0x1F;
                int var136 = var133 >> 5 & 0x1F;
                int var137 = var133 & 0x1F;
                int var138 = (var137 << 3) + (var135 << 19) + (var136 << 11);
                class224 var139 = class224.method1468(var134);
                if (var139.field2752 != var138) {
                    var139.field2752 = var138;
                    method353(var139);
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2286 == arg0.field1471) {
                int var140 = var3.method3019();
                int var141 = var3.method3019();
                class68 var142 = (class68) field1026.method3444((long) var141);
                class68 var143 = (class68) field1026.method3444((long) var140);
                if (var143 != null) {
                    method2748(var143, var142 == null || var142.field781 != var143.field781);
                }
                if (var142 != null) {
                    var142.method3476();
                    field1026.method3431(var142, (long) var140);
                }
                class224 var144 = class224.method1468(var141);
                if (var144 != null) {
                    method353(var144);
                }
                class224 var145 = class224.method1468(var140);
                if (var145 != null) {
                    method353(var145);
                    method169(Statics.field3299[var145.field2764 >>> 16], var145, true);
                }
                if (field1010 != -1) {
                    int var146 = field1010;
                    if (class224.method1621(var146)) {
                        Statics.method2822(Statics.field3299[var146], 1);
                    }
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2221 == arg0.field1471) {
                field1084 = var3.method3012();
                if (field1084 == 255) {
                    field1084 = 0;
                }
                field1085 = var3.method3012();
                if (field1085 == 255) {
                    field1085 = 0;
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2289 == arg0.field1471) {
                field1058 = var3.method3134();
                field906 = var3.method3041();
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2244 == arg0.field1471) {
                int var147 = var3.method3017();
                class68 var148 = (class68) field1026.method3444((long) var147);
                if (var148 != null) {
                    method2748(var148, true);
                }
                if (field1014 != null) {
                    method353(field1014);
                    field1014 = null;
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2276 == arg0.field1471) {
                method2739(false, arg0.field1470);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2246 == arg0.field1471) {
                int var149 = var3.method3050();
                field1010 = var149;
                this.method1124(false);
                method3791(var149);
                class83.method257(field1010);
                for (int var150 = 0; var150 < 100; var150++) {
                    field1056[var150] = true;
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2287 == arg0.field1471) {
                method501();
                field963 = var3.method3012();
                field1047 = field1101;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2294 == arg0.field1471) {
                int var151 = var3.method3050();
                int var152 = var3.method3019();
                class219.field2688[var151] = var152;
                if (class219.field2689[var151] != var152) {
                    class219.field2689[var151] = var152;
                }
                method1766(var151);
                field1036[++field1129 - 1 & 0x1F] = var151;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2228 == arg0.field1471) {
                method17(class170.field2419);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2224 == arg0.field1471) {
                method3241();
                arg0.field1471 = null;
                return false;
            }
            if (class167.field2226 == arg0.field1471) {
                int var153 = var3.method3017();
                Statics.field3272 = Statics.field671.method2803(var153);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2270 == arg0.field1471) {
                int var154 = var3.method3017();
                int var155 = var3.method3017();
                int var156 = class59.method2737();
                class171 var157 = class171.method1482(class168.field2358, field953.field1479);
                var157.field2424.method3038(field694);
                var157.field2424.method3130(var156);
                var157.field2424.method3016(var154);
                var157.field2424.method3022(var155);
                field953.method1783(var157);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2251 == arg0.field1471) {
                int var158 = var3.method3019();
                int var159 = var3.method3051();
                int var160 = var3.method3049();
                int var161 = var3.method3050();
                class224 var162 = class224.method1468(var158);
                if (var162.field2855 != var160 || var162.field2779 != var159 || var162.field2781 != var161) {
                    var162.field2855 = var160;
                    var162.field2779 = var159;
                    var162.field2781 = var161;
                    method353(var162);
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2273 == arg0.field1471) {
                String var163 = var3.method3021();
                long var164 = var3.method3018();
                long var166 = (long) var3.method3009();
                long var168 = (long) var3.method3075();
                class238 var170 = (class238) class176.method676(class238.method102(), var3.method3012());
                long var171 = (var166 << 32) + var168;
                boolean var173 = false;
                for (int var174 = 0; var174 < 100; var174++) {
                    if (field1070[var174] == var171) {
                        var173 = true;
                        break;
                    }
                }
                if (var170.field3236 && method2378(var163)) {
                    var173 = true;
                }
                if (!var173 && field969 == 0) {
                    field1070[field1071] = var171;
                    field1071 = (field1071 + 1) % 100;
                    String var175 = class272.method4559(class278.method4379(class273.method2864(var3)));
                    if (var170.field3241 == -1) {
                        Statics.method1768(9, var163, var175, class276.method1540(var164));
                    } else {
                        int var176 = var170.field3241;
                        String var177 = "<img=" + var176 + ">";
                        Statics.method1768(9, var177 + var163, var175, class276.method1540(var164));
                    }
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2236 == arg0.field1471) {
                Statics.field656 = var3.method3134();
                Statics.field2106 = var3.method3134();
                for (int var178 = Statics.field656; var178 < Statics.field656 + 8; var178++) {
                    for (int var179 = Statics.field2106; var179 < Statics.field2106 + 8; var179++) {
                        if (field887[Statics.field801][var178][var179] != null) {
                            field887[Statics.field801][var178][var179] = null;
                            method225(var178, var179);
                        }
                    }
                }
                for (class77 var180 = (class77) field1051.method3486(); var180 != null; var180 = (class77) field1051.method3507()) {
                    if (var180.field1134 >= Statics.field656 && var180.field1134 < Statics.field656 + 8 && var180.field1139 >= Statics.field2106 && var180.field1139 < Statics.field2106 + 8 && Statics.field801 == var180.field1140) {
                        var180.field1138 = 0;
                    }
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2235 == arg0.field1471) {
                method17(class170.field2415);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2233 == arg0.field1471) {
                method71(var3.method3021());
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2223 == arg0.field1471) {
                class80 var181 = new class80();
                var181.field1223 = var3.method3021();
                var181.field1219 = var3.method3009();
                int var182 = var3.method3017();
                var181.field1212 = var182;
                method4762(45);
                var2.method2851();
                Object var183 = null;
                class92.method1103(var181);
                arg0.field1471 = null;
                return false;
            }
            if (class167.field2261 == arg0.field1471) {
                int var184 = var3.method3049();
                int var185 = var3.method3050();
                int var186 = var3.method3060();
                class224 var187 = class224.method1468(var186);
                var187.field2783 = (var184 << 16) + var185;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2256 == arg0.field1471) {
                field1098 = true;
                Statics.field2533 = var3.method3012();
                Statics.field310 = var3.method3012();
                Statics.field266 = var3.method3009();
                Statics.field359 = var3.method3012();
                Statics.field326 = var3.method3012();
                if (Statics.field326 >= 100) {
                    Statics.field404 = Statics.field2533 * 128 + 64;
                    Statics.field858 = Statics.field310 * 128 + 64;
                    Statics.field809 = method1051(Statics.field404, Statics.field858, Statics.field801) - Statics.field266;
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2248 == arg0.field1471) {
                int var188 = var3.method3050();
                if (var188 == 65535) {
                    var188 = -1;
                }
                int var189 = var3.method3009();
                if (var189 == 65535) {
                    var189 = -1;
                }
                int var190 = var3.method3058();
                int var191 = var3.method3060();
                for (int var192 = var188; var192 <= var189; var192++) {
                    long var193 = ((long) var190 << 32) + (long) var192;
                    class200 var195 = field902.method3444(var193);
                    if (var195 != null) {
                        var195.method3476();
                    }
                    field902.method3431(new class206(var191), var193);
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2263 == arg0.field1471) {
                int var196 = var3.method3051();
                int var197 = var3.method3058();
                class224 var198 = class224.method1468(var197);
                if (var198.field2770 != 1 || var198.field2771 != var196) {
                    var198.field2770 = 1;
                    var198.field2771 = var196;
                    method353(var198);
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2250 == arg0.field1471) {
                method532(false, var3);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2291 == arg0.field1471) {
                method17(class170.field2418);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2266 == arg0.field1471) {
                field1098 = false;
                for (int var199 = 0; var199 < 5; var199++) {
                    field1099[var199] = false;
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2239 == arg0.field1471) {
                Statics.field656 = var3.method3134();
                Statics.field2106 = var3.method3134();
                while (var3.field2498 < arg0.field1472) {
                    int var200 = var3.method3012();
                    class170 var201 = class170.method1753()[var200];
                    method17(var201);
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2241 == arg0.field1471) {
                field1022 = 1;
                field1043 = field1101;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2259 == arg0.field1471) {
                boolean var202 = var3.method3012() == 1;
                if (var202) {
                    Statics.field736 = class183.method4541() - var3.method3018();
                    Statics.field2447 = new class14(var3, true);
                } else {
                    Statics.field2447 = null;
                }
                field1046 = field1101;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2257 == arg0.field1471) {
                for (int var203 = 0; var203 < field1113.length; var203++) {
                    if (field1113[var203] != null) {
                        field1113[var203].field1176 = -1;
                    }
                }
                for (int var204 = 0; var204 < field907.length; var204++) {
                    if (field907[var204] != null) {
                        field907[var204].field1176 = -1;
                    }
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2302 == arg0.field1471) {
                int var205 = var3.method3140();
                boolean var206 = var3.method3012() == 1;
                String var207 = "";
                boolean var208 = false;
                if (var206) {
                    var207 = var3.method3021();
                    if (method2378(var207)) {
                        var208 = true;
                    }
                }
                String var209 = var3.method3021();
                if (!var208) {
                    class97.method1752(var205, var207, var209);
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2265 == arg0.field1471) {
                var3.field2498 += 28;
                if (var3.method3036()) {
                    int var210 = var3.field2498 - 28;
                    byte[] var211 = var3.field2499;
                    if (field1041 == null) {
                        field1041 = new byte[24];
                    }
                    class191.method3332(var211, var210, field1041, 0, 24);
                    if (class157.field2161 != null) {
                        try {
                            class157.field2161.method2211(0L);
                            class157.field2161.method2226(var3.field2499, var210, 24);
                        } catch (Exception var301) {
                        }
                    }
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2279 == arg0.field1471) {
                int var213 = arg0.field1472;
                class289 var214 = new class289();
                var214.field3800 = var3.method3012();
                var214.field3799 = var3.method3017();
                var214.field3805 = new int[var214.field3800];
                var214.field3802 = new int[var214.field3800];
                var214.field3801 = new Field[var214.field3800];
                var214.field3804 = new int[var214.field3800];
                var214.field3803 = new Method[var214.field3800];
                var214.field3806 = new byte[var214.field3800][][];
                for (int var215 = 0; var215 < var214.field3800; var215++) {
                    try {
                        int var216 = var3.method3012();
                        if (var216 == 0 || var216 == 1 || var216 == 2) {
                            String var217 = var3.method3021();
                            String var218 = var3.method3021();
                            int var219 = 0;
                            if (var216 == 1) {
                                var219 = var3.method3017();
                            }
                            var214.field3805[var215] = var216;
                            var214.field3804[var215] = var219;
                            if (Statics.method1038(var217).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var214.field3801[var215] = Statics.method1038(var217).getDeclaredField(var218);
                        } else if (var216 == 3 || var216 == 4) {
                            String var220 = var3.method3021();
                            String var221 = var3.method3021();
                            int var222 = var3.method3012();
                            String[] var223 = new String[var222];
                            for (int var224 = 0; var224 < var222; var224++) {
                                var223[var224] = var3.method3021();
                            }
                            String var225 = var3.method3021();
                            byte[][] var226 = new byte[var222][];
                            if (var216 == 3) {
                                for (int var227 = 0; var227 < var222; var227++) {
                                    int var228 = var3.method3017();
                                    var226[var227] = new byte[var228];
                                    var3.method3024(var226[var227], 0, var228);
                                }
                            }
                            var214.field3805[var215] = var216;
                            Class[] var229 = new Class[var222];
                            for (int var230 = 0; var230 < var222; var230++) {
                                var229[var230] = Statics.method1038(var223[var230]);
                            }
                            Class var231 = Statics.method1038(var225);
                            if (Statics.method1038(var220).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var232 = Statics.method1038(var220).getDeclaredMethods();
                            Method[] var233 = var232;
                            for (int var234 = 0; var234 < var233.length; var234++) {
                                Method var235 = var233[var234];
                                if (var235.getName().equals(var221)) {
                                    Class[] var236 = var235.getParameterTypes();
                                    if (var229.length == var236.length) {
                                        boolean var237 = true;
                                        for (int var238 = 0; var238 < var229.length; var238++) {
                                            if (var229[var238] != var236[var238]) {
                                                var237 = false;
                                                break;
                                            }
                                        }
                                        if (var237 && var231 == var235.getReturnType()) {
                                            var214.field3803[var215] = var235;
                                        }
                                    }
                                }
                            }
                            var214.field3806[var215] = var226;
                        }
                    } catch (ClassNotFoundException var302) {
                        var214.field3802[var215] = -1;
                    } catch (SecurityException var303) {
                        var214.field3802[var215] = -2;
                    } catch (NullPointerException var304) {
                        var214.field3802[var215] = -3;
                    } catch (Exception var305) {
                        var214.field3802[var215] = -4;
                    } catch (Throwable var306) {
                        var214.field3802[var215] = -5;
                    }
                }
                class290.field3812.method3461(var214);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2229 == arg0.field1471) {
                method17(class170.field2417);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2264 == arg0.field1471) {
                int var244 = var3.method3019();
                String var245 = var3.method3021();
                class224 var246 = class224.method1468(var244);
                if (!var245.equals(var246.field2787)) {
                    var246.field2787 = var245;
                    method353(var246);
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2227 == arg0.field1471) {
                int var247 = var3.method3051();
                int var248 = var3.method3058();
                class224 var249 = class224.method1468(var248);
                if (var249.field2770 != 2 || var249.field2771 != var247) {
                    var249.field2770 = 2;
                    var249.field2771 = var247;
                    method353(var249);
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2232 == arg0.field1471) {
                int var250 = var3.method3041();
                int var251 = var3.method3041();
                String var252 = var3.method3021();
                if (var251 >= 1 && var251 <= 8) {
                    if (var252.equalsIgnoreCase("null")) {
                        var252 = null;
                    }
                    field976[var251 - 1] = var252;
                    field977[var251 - 1] = var250 == 0;
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2272 == arg0.field1471) {
                field1044 = field1101;
                if (arg0.field1472 == 0) {
                    field1076 = null;
                    field1077 = null;
                    Statics.field927 = 0;
                    Statics.field1456 = null;
                    arg0.field1471 = null;
                    return true;
                }
                field1077 = var3.method3021();
                long var253 = var3.method3018();
                long var255 = var253;
                String var257;
                if (var253 <= 0L || var253 >= 6582952005840035281L) {
                    var257 = null;
                } else if (var253 % 37L == 0L) {
                    var257 = null;
                } else {
                    int var258 = 0;
                    for (long var259 = var253; var259 != 0L; var259 /= 37L) {
                        var258++;
                    }
                    StringBuilder var261 = new StringBuilder(var258);
                    while (var255 != 0L) {
                        long var262 = var255;
                        var255 /= 37L;
                        var261.append(class276.field3728[(int) (var262 - var255 * 37L)]);
                    }
                    var257 = var261.reverse().toString();
                }
                field1076 = var257;
                Statics.field806 = var3.method3013();
                int var264 = var3.method3012();
                if (var264 == 255) {
                    arg0.field1471 = null;
                    return true;
                }
                Statics.field927 = var264;
                class76[] var265 = new class76[100];
                for (int var266 = 0; var266 < Statics.field927; var266++) {
                    var265[var266] = new class76();
                    var265[var266].field862 = var3.method3021();
                    var265[var266].field863 = class275.method3310(var265[var266].field862, Statics.field719);
                    var265[var266].field864 = var3.method3009();
                    var265[var266].field869 = var3.method3013();
                    var3.method3021();
                    if (var265[var266].field862.equals(Statics.field601.field852)) {
                        Statics.field249 = var265[var266].field869;
                    }
                }
                boolean var267 = false;
                int var268 = Statics.field927;
                while (var268 > 0) {
                    boolean var269 = true;
                    var268--;
                    for (int var270 = 0; var270 < var268; var270++) {
                        if (var265[var270].field863.compareTo(var265[var270 + 1].field863) > 0) {
                            class76 var271 = var265[var270];
                            var265[var270] = var265[var270 + 1];
                            var265[var270 + 1] = var271;
                            var269 = false;
                        }
                    }
                    if (var269) {
                        break;
                    }
                }
                Statics.field1456 = var265;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2271 == arg0.field1471) {
                String var272 = var3.method3021();
                int var273 = var3.method3009();
                byte var274 = var3.method3013();
                boolean var275 = false;
                if (var274 == -128) {
                    var275 = true;
                }
                if (var275) {
                    if (Statics.field927 == 0) {
                        arg0.field1471 = null;
                        return true;
                    }
                    boolean var276 = false;
                    int var277;
                    for (var277 = 0; var277 < Statics.field927 && (!Statics.field1456[var277].field862.equals(var272) || Statics.field1456[var277].field864 != var273); var277++) {
                    }
                    if (var277 < Statics.field927) {
                        while (var277 < Statics.field927 - 1) {
                            Statics.field1456[var277] = Statics.field1456[var277 + 1];
                            var277++;
                        }
                        Statics.field927--;
                        Statics.field1456[Statics.field927] = null;
                    }
                } else {
                    var3.method3021();
                    class76 var278 = new class76();
                    var278.field862 = var272;
                    var278.field863 = class275.method3310(var278.field862, Statics.field719);
                    var278.field864 = var273;
                    var278.field869 = var274;
                    int var279;
                    for (var279 = Statics.field927 - 1; var279 >= 0; var279--) {
                        int var280 = Statics.field1456[var279].field863.compareTo(var278.field863);
                        if (var280 == 0) {
                            Statics.field1456[var279].field864 = var273;
                            Statics.field1456[var279].field869 = var274;
                            if (var272.equals(Statics.field601.field852)) {
                                Statics.field249 = var274;
                            }
                            field1044 = field1101;
                            arg0.field1471 = null;
                            return true;
                        }
                        if (var280 < 0) {
                            break;
                        }
                    }
                    if (Statics.field927 >= Statics.field1456.length) {
                        arg0.field1471 = null;
                        return true;
                    }
                    for (int var281 = Statics.field927 - 1; var281 > var279; var281--) {
                        Statics.field1456[var281 + 1] = Statics.field1456[var281];
                    }
                    if (Statics.field927 == 0) {
                        Statics.field1456 = new class76[100];
                    }
                    Statics.field1456[var279 + 1] = var278;
                    Statics.field927++;
                    if (var272.equals(Statics.field601.field852)) {
                        Statics.field249 = var274;
                    }
                }
                field1044 = field1101;
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2222 == arg0.field1471) {
                method2739(true, arg0.field1470);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2230 == arg0.field1471) {
                method17(class170.field2412);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2269 == arg0.field1471) {
                Statics.field2433 = class286.method4099(var3.method3012());
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2274 == arg0.field1471) {
                String var282 = var3.method3021();
                long var283 = (long) var3.method3009();
                long var285 = (long) var3.method3075();
                class238 var287 = (class238) class176.method676(class238.method102(), var3.method3012());
                long var288 = (var283 << 32) + var285;
                boolean var290 = false;
                for (int var291 = 0; var291 < 100; var291++) {
                    if (field1070[var291] == var288) {
                        var290 = true;
                        break;
                    }
                }
                if (method2378(var282)) {
                    var290 = true;
                }
                if (!var290 && field969 == 0) {
                    field1070[field1071] = var288;
                    field1071 = (field1071 + 1) % 100;
                    String var292 = class272.method4559(class278.method4379(class273.method2864(var3)));
                    byte var293;
                    if (var287.field3240) {
                        var293 = 7;
                    } else {
                        var293 = 3;
                    }
                    if (var287.field3241 == -1) {
                        class97.method1752(var293, var282, var292);
                    } else {
                        int var295 = var287.field3241;
                        String var296 = "<img=" + var295 + ">";
                        class97.method1752(var293, var296 + var282, var292);
                    }
                }
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2238 == arg0.field1471) {
                method17(class170.field2420);
                arg0.field1471 = null;
                return true;
            }
            if (class167.field2225 == arg0.field1471) {
                field1096 = var3.method3050() * 30;
                field1047 = field1101;
                arg0.field1471 = null;
                return true;
            }
            class154.method355("" + (arg0.field1471 == null ? -1 : arg0.field1471.field2304) + class88.field1307 + (arg0.field1477 == null ? -1 : arg0.field1477.field2304) + class88.field1307 + (arg0.field1478 == null ? -1 : arg0.field1478.field2304) + class88.field1307 + arg0.field1472, (Throwable) null);
            method3241();
        } catch (IOException var307) {
            method1037();
        } catch (Exception var308) {
            String var299 = "" + (arg0.field1471 == null ? -1 : arg0.field1471.field2304) + class88.field1307 + (arg0.field1477 == null ? -1 : arg0.field1477.field2304) + class88.field1307 + (arg0.field1478 == null ? -1 : arg0.field1478.field2304) + class88.field1307 + arg0.field1472 + class88.field1307 + (Statics.field1709 + Statics.field601.field1199[0]) + class88.field1307 + (Statics.field1710 + Statics.field601.field1172[0]) + class88.field1307;
            for (int var300 = 0; var300 < arg0.field1472 && var300 < 50; var300++) {
                var299 = var299 + var3.field2499[var300] + class88.field1307;
            }
            class154.method355(var299, var308);
            method3241();
        }
        return true;
    }

    @ObfuscatedName("e.gy(Lfi;I)V")
    public static final void method17(class170 arg0) {
        class187 var1 = field953.field1470;
        if (class170.field2419 == arg0) {
            int var2 = var1.method3134();
            int var3 = (var2 >> 4 & 0x7) + Statics.field656;
            int var4 = (var2 & 0x7) + Statics.field2106;
            int var5 = var1.method3134();
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = field956[var6];
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                method1541(Statics.field801, var3, var4, var8, -1, var6, var7, 0, -1);
            }
        } else if (class170.field2416 == arg0) {
            int var9 = var1.method3041();
            int var10 = (var9 >> 4 & 0x7) + Statics.field656;
            int var11 = (var9 & 0x7) + Statics.field2106;
            int var12 = var1.method3012();
            int var13 = var12 >> 2;
            int var14 = var12 & 0x3;
            int var15 = field956[var13];
            int var16 = var1.method3050();
            if (var10 >= 0 && var11 >= 0 && var10 < 103 && var11 < 103) {
                if (var15 == 0) {
                    class142 var17 = Statics.field649.method2659(Statics.field801, var10, var11);
                    if (var17 != null) {
                        int var18 = var17.field2045 >> 14 & 0x7FFF;
                        if (var13 == 2) {
                            var17.field2043 = new class99(var18, 2, var14 + 4, Statics.field801, var10, var11, var16, false, var17.field2043);
                            var17.field2044 = new class99(var18, 2, var14 + 1 & 0x3, Statics.field801, var10, var11, var16, false, var17.field2044);
                        } else {
                            var17.field2043 = new class99(var18, var13, var14, Statics.field801, var10, var11, var16, false, var17.field2043);
                        }
                    }
                }
                if (var15 == 1) {
                    class147 var19 = Statics.field649.method2573(Statics.field801, var10, var11);
                    if (var19 != null) {
                        int var20 = var19.field2088 >> 14 & 0x7FFF;
                        if (var13 == 4 || var13 == 5) {
                            var19.field2086 = new class99(var20, 4, var14, Statics.field801, var10, var11, var16, false, var19.field2086);
                        } else if (var13 == 6) {
                            var19.field2086 = new class99(var20, 4, var14 + 4, Statics.field801, var10, var11, var16, false, var19.field2086);
                        } else if (var13 == 7) {
                            var19.field2086 = new class99(var20, 4, (var14 + 2 & 0x3) + 4, Statics.field801, var10, var11, var16, false, var19.field2086);
                        } else if (var13 == 8) {
                            var19.field2086 = new class99(var20, 4, var14 + 4, Statics.field801, var10, var11, var16, false, var19.field2086);
                            var19.field2087 = new class99(var20, 4, (var14 + 2 & 0x3) + 4, Statics.field801, var10, var11, var16, false, var19.field2087);
                        }
                    }
                }
                if (var15 == 2) {
                    class148 var21 = Statics.field649.method2713(Statics.field801, var10, var11);
                    if (var13 == 11) {
                        var13 = 10;
                    }
                    if (var21 != null) {
                        var21.field2101 = new class99(var21.field2103 >> 14 & 0x7FFF, var13, var14, Statics.field801, var10, var11, var16, false, var21.field2101);
                    }
                }
                if (var15 == 3) {
                    class129 var22 = Statics.field649.method2575(Statics.field801, var10, var11);
                    if (var22 != null) {
                        var22.field1784 = new class99(var22.field1785 >> 14 & 0x7FFF, 22, var14, Statics.field801, var10, var11, var16, false, var22.field1784);
                    }
                }
            }
        } else if (class170.field2414 == arg0) {
            int var23 = var1.method3050();
            int var24 = var1.method3051();
            int var25 = var1.method3012();
            int var26 = (var25 >> 4 & 0x7) + Statics.field656;
            int var27 = (var25 & 0x7) + Statics.field2106;
            int var28 = var1.method3040();
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                int var29 = var26 * 128 + 64;
                int var30 = var27 * 128 + 64;
                class84 var31 = new class84(var23, Statics.field801, var29, var30, method1051(var29, var30, Statics.field801) - var28, var24, field1054);
                field983.method3480(var31);
            }
        } else if (class170.field2415 == arg0) {
            int var32 = var1.method3040() * 4;
            int var33 = var1.method3049();
            int var34 = var1.method3041() * 4;
            int var35 = var1.method3012();
            int var36 = var1.method3040();
            byte var37 = var1.method3043();
            int var38 = var1.method3012();
            int var39 = (var38 >> 4 & 0x7) + Statics.field656;
            int var40 = (var38 & 0x7) + Statics.field2106;
            int var41 = var1.method3009();
            byte var42 = var1.method3110();
            int var43 = var1.method3049();
            int var44 = var1.method3053();
            int var45 = var39 + var42;
            int var46 = var37 + var40;
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104 && var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104 && var41 != 65535) {
                int var47 = var39 * 128 + 64;
                int var48 = var40 * 128 + 64;
                int var49 = var45 * 128 + 64;
                int var50 = var46 * 128 + 64;
                class93 var51 = new class93(var41, Statics.field801, var47, var48, method1051(var47, var48, Statics.field801) - var32, field1054 + var43, field1054 + var33, var35, var36, var44, var34);
                var51.method1678(var49, var50, method1051(var49, var50, Statics.field801) - var34, field1054 + var43);
                field982.method3480(var51);
            }
        } else if (class170.field2420 == arg0) {
            int var52 = var1.method3049();
            int var53 = var1.method3134();
            int var54 = var53 >> 2;
            int var55 = var53 & 0x3;
            int var56 = field956[var54];
            int var57 = var1.method3012();
            int var58 = (var57 >> 4 & 0x7) + Statics.field656;
            int var59 = (var57 & 0x7) + Statics.field2106;
            if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                method1541(Statics.field801, var58, var59, var56, var52, var54, var55, 0, -1);
            }
        } else if (class170.field2412 == arg0) {
            int var60 = var1.method3009();
            int var61 = var1.method3009();
            int var62 = var1.method3009();
            int var63 = var1.method3040();
            int var64 = (var63 >> 4 & 0x7) + Statics.field656;
            int var65 = (var63 & 0x7) + Statics.field2106;
            if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                class201 var66 = field887[Statics.field801][var64][var65];
                if (var66 != null) {
                    for (class94 var67 = (class94) var66.method3486(); var67 != null; var67 = (class94) var66.method3507()) {
                        if ((var61 & 0x7FFF) == var67.field1401 && var67.field1397 == var62) {
                            var67.field1397 = var60;
                            break;
                        }
                    }
                    method225(var64, var65);
                }
            }
        } else if (class170.field2417 == arg0) {
            int var68 = var1.method3009();
            int var69 = var1.method3040();
            int var70 = (var69 >> 4 & 0x7) + Statics.field656;
            int var71 = (var69 & 0x7) + Statics.field2106;
            int var72 = var1.method3050();
            if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                class94 var73 = new class94();
                var73.field1401 = var72;
                var73.field1397 = var68;
                if (field887[Statics.field801][var70][var71] == null) {
                    field887[Statics.field801][var70][var71] = new class201();
                }
                field887[Statics.field801][var70][var71].method3480(var73);
                method225(var70, var71);
            }
        } else {
            if (class170.field2413 == arg0) {
                int var74 = var1.method3012();
                int var75 = var1.method3040();
                int var76 = (var75 >> 4 & 0x7) + Statics.field656;
                int var77 = (var75 & 0x7) + Statics.field2106;
                int var78 = var1.method3041();
                int var79 = var78 >> 4 & 0xF;
                int var80 = var78 & 0x7;
                int var81 = var1.method3049();
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                    int var82 = var79 + 1;
                    if (Statics.field601.field1199[0] >= var76 - var82 && Statics.field601.field1199[0] <= var76 + var82 && Statics.field601.field1172[0] >= var77 - var82 && Statics.field601.field1172[0] <= var77 + var82 && field1068 != 0 && var80 > 0 && field1092 < 50) {
                        field911[field1092] = var81;
                        field1094[field1092] = var80;
                        field1095[field1092] = var74;
                        field980[field1092] = null;
                        field1034[field1092] = (var76 << 16) + (var77 << 8) + var79;
                        field1092++;
                    }
                }
            }
            if (class170.field2418 == arg0) {
                int var83 = var1.method3050();
                int var84 = var1.method3041();
                int var85 = (var84 >> 4 & 0x7) + Statics.field656;
                int var86 = (var84 & 0x7) + Statics.field2106;
                if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                    class201 var87 = field887[Statics.field801][var85][var86];
                    if (var87 != null) {
                        for (class94 var88 = (class94) var87.method3486(); var88 != null; var88 = (class94) var87.method3507()) {
                            if ((var83 & 0x7FFF) == var88.field1401) {
                                var88.method3476();
                                break;
                            }
                        }
                        if (var87.method3486() == null) {
                            field887[Statics.field801][var85][var86] = null;
                        }
                        method225(var85, var86);
                    }
                }
            } else if (class170.field2411 == arg0) {
                byte var89 = var1.method3045();
                byte var90 = var1.method3110();
                int var91 = var1.method3009();
                byte var92 = var1.method3013();
                int var93 = var1.method3012();
                int var94 = (var93 >> 4 & 0x7) + Statics.field656;
                int var95 = (var93 & 0x7) + Statics.field2106;
                byte var96 = var1.method3043();
                int var97 = var1.method3050();
                int var98 = var1.method3041();
                int var99 = var98 >> 2;
                int var100 = var98 & 0x3;
                int var101 = field956[var99];
                int var102 = var1.method3050();
                int var103 = var1.method3009();
                class74 var104;
                if (field1052 == var97) {
                    var104 = Statics.field601;
                } else {
                    var104 = field1113[var97];
                }
                if (var104 != null) {
                    class263 var105 = class263.method190(var102);
                    int var106;
                    int var107;
                    if (var100 == 1 || var100 == 3) {
                        var106 = var105.field3525;
                        var107 = var105.field3503;
                    } else {
                        var106 = var105.field3503;
                        var107 = var105.field3525;
                    }
                    int var108 = (var106 >> 1) + var94;
                    int var109 = (var106 + 1 >> 1) + var94;
                    int var110 = (var107 >> 1) + var95;
                    int var111 = (var107 + 1 >> 1) + var95;
                    int[][] var112 = class62.field740[Statics.field801];
                    int var113 = var112[var108][var110] + var112[var109][var110] + var112[var108][var111] + var112[var109][var111] >> 2;
                    int var114 = (var94 << 7) + (var106 << 6);
                    int var115 = (var95 << 7) + (var107 << 6);
                    class133 var116 = var105.method4334(var99, var100, var112, var114, var113, var115);
                    if (var116 != null) {
                        method1541(Statics.field801, var94, var95, var101, -1, 0, 0, var91 + 1, var103 + 1);
                        var104.field840 = field1054 + var91;
                        var104.field841 = field1054 + var103;
                        var104.field835 = var116;
                        var104.field847 = var94 * 128 + var106 * 64;
                        var104.field839 = var95 * 128 + var107 * 64;
                        var104.field842 = var113;
                        if (var89 > var96) {
                            byte var117 = var89;
                            var89 = var96;
                            var96 = var117;
                        }
                        if (var92 > var90) {
                            byte var118 = var92;
                            var92 = var90;
                            var90 = var118;
                        }
                        var104.field846 = var89 + var94;
                        var104.field848 = var94 + var96;
                        var104.field837 = var92 + var95;
                        var104.field849 = var90 + var95;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ca.gg(IIIIIIIIII)V")
    public static final void method1541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class77 var9 = null;
        for (class77 var10 = (class77) field1051.method3486(); var10 != null; var10 = (class77) field1051.method3507()) {
            if (var10.field1140 == arg0 && var10.field1134 == arg1 && var10.field1139 == arg2 && var10.field1133 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class77();
            var9.field1140 = arg0;
            var9.field1133 = arg3;
            var9.field1134 = arg1;
            var9.field1139 = arg2;
            method3785(var9);
            field1051.method3480(var9);
        }
        var9.field1132 = arg4;
        var9.field1141 = arg5;
        var9.field1143 = arg6;
        var9.field1142 = arg7;
        var9.field1138 = arg8;
    }

    @ObfuscatedName("hq.gw(Lbv;I)V")
    public static final void method3785(class77 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1133 == 0) {
            var1 = Statics.field649.method2583(arg0.field1140, arg0.field1134, arg0.field1139);
        }
        if (arg0.field1133 == 1) {
            var1 = Statics.field649.method2577(arg0.field1140, arg0.field1134, arg0.field1139);
        }
        if (arg0.field1133 == 2) {
            var1 = Statics.field649.method2620(arg0.field1140, arg0.field1134, arg0.field1139);
        }
        if (arg0.field1133 == 3) {
            var1 = Statics.field649.method2711(arg0.field1140, arg0.field1134, arg0.field1139);
        }
        if (var1 != 0) {
            int var5 = Statics.field649.method2681(arg0.field1140, arg0.field1134, arg0.field1139, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1136 = var2;
        arg0.field1135 = var3;
        arg0.field1137 = var4;
    }

    @ObfuscatedName("an.ha(IIIIIIII)V")
    public static final void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field875 && Statics.field801 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field649.method2583(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field649.method2577(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field649.method2620(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field649.method2711(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field649.method2681(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field649.method2693(arg0, arg2, arg3);
                class263 var15 = class263.method190(var12);
                if (var15.field3527 != 0) {
                    field922[arg0].method2883(arg2, arg3, var13, var14, var15.field3506);
                }
            }
            if (arg1 == 1) {
                Statics.field649.method2568(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field649.method2569(arg0, arg2, arg3);
                class263 var16 = class263.method190(var12);
                if (var16.field3503 + arg2 > 103 || var16.field3503 + arg3 > 103 || var16.field3525 + arg2 > 103 || var16.field3525 + arg3 > 103) {
                    return;
                }
                if (var16.field3527 != 0) {
                    field922[arg0].method2873(arg2, arg3, var16.field3503, var16.field3525, var14, var16.field3506);
                }
            }
            if (arg1 == 3) {
                Statics.field649.method2570(arg0, arg2, arg3);
                class263 var17 = class263.method190(var12);
                if (var17.field3527 == 1) {
                    field922[arg0].method2894(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field732[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class62.method5016(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field649, field922[arg0]);
    }

    @ObfuscatedName("ao.ho(III)V")
    public static final void method225(int arg0, int arg1) {
        class201 var2 = field887[Statics.field801][arg0][arg1];
        if (var2 == null) {
            Statics.field649.method2677(Statics.field801, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class94 var5 = null;
        for (class94 var6 = (class94) var2.method3486(); var6 != null; var6 = (class94) var2.method3507()) {
            class264 var7 = class264.method4124(var6.field1401);
            long var8 = (long) var7.field3563;
            if (var7.field3559 == 1) {
                var8 = (long) (var6.field1397 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field649.method2677(Statics.field801, arg0, arg1);
            return;
        }
        var2.method3482(var5);
        class94 var10 = null;
        class94 var11 = null;
        for (class94 var12 = (class94) var2.method3486(); var12 != null; var12 = (class94) var2.method3507()) {
            if (var5.field1401 != var12.field1401) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1401 != var12.field1401 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field649.method2698(Statics.field801, arg0, arg1, method1051(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field801), var5, var13, var10, var11);
    }

    @ObfuscatedName("aw.hb(ZLgi;I)V")
    public static final void method532(boolean arg0, class187 arg1) {
        field973 = 0;
        field910 = 0;
        method1467();
        while (arg1.method3274(field953.field1472) >= 27) {
            int var2 = arg1.method3278(15);
            if (var2 == 32767) {
                break;
            }
            boolean var32 = false;
            if (field907[var2] == null) {
                field907[var2] = new class86();
                var32 = true;
            }
            class86 var33 = field907[var2];
            field909[++field1016 - 1] = var2;
            var33.field1193 = field1054;
            int var34 = field978[arg1.method3278(3)];
            if (var32) {
                var33.field1195 = var33.field1146 = var34;
            }
            int var35 = arg1.method3278(1);
            if (var35 == 1) {
                field1021[++field910 - 1] = var2;
            }
            int var36;
            if (arg0) {
                var36 = arg1.method3278(8);
                if (var36 > 127) {
                    var36 -= 256;
                }
            } else {
                var36 = arg1.method3278(5);
                if (var36 > 15) {
                    var36 -= 32;
                }
            }
            var33.field1293 = class266.method1704(arg1.method3278(14));
            int var37;
            if (arg0) {
                var37 = arg1.method3278(8);
                if (var37 > 127) {
                    var37 -= 256;
                }
            } else {
                var37 = arg1.method3278(5);
                if (var37 > 15) {
                    var37 -= 32;
                }
            }
            int var38 = arg1.method3278(1);
            var33.field1202 = var33.field1293.field3626;
            var33.field1197 = var33.field1293.field3633;
            if (var33.field1197 == 0) {
                var33.field1146 = 0;
            }
            var33.field1152 = var33.field1293.field3608;
            var33.field1153 = var33.field1293.field3617;
            var33.field1154 = var33.field1293.field3618;
            var33.field1155 = var33.field1293.field3609;
            var33.field1175 = var33.field1293.field3613;
            var33.field1150 = var33.field1293.field3636;
            var33.field1151 = var33.field1293.field3604;
            var33.method1624(Statics.field601.field1199[0] + var36, Statics.field601.field1172[0] + var37, var38 == 1);
        }
        arg1.method3296();
        for (int var3 = 0; var3 < field910; var3++) {
            int var4 = field1021[var3];
            class86 var5 = field907[var4];
            int var6 = arg1.method3012();
            if ((var6 & 0x8) != 0) {
                var5.field1157 = arg1.method3021();
                var5.field1149 = 100;
            }
            if ((var6 & 0x2) != 0) {
                var5.field1181 = arg1.method3051();
                int var7 = arg1.method3019();
                var5.field1185 = var7 >> 16;
                var5.field1184 = (var7 & 0xFFFF) + field1054;
                var5.field1182 = 0;
                var5.field1183 = 0;
                if (var5.field1184 > field1054) {
                    var5.field1182 = -1;
                }
                if (var5.field1181 == 65535) {
                    var5.field1181 = -1;
                }
            }
            if ((var6 & 0x4) != 0) {
                int var8 = arg1.method3040();
                if (var8 > 0) {
                    for (int var9 = 0; var9 < var8; var9++) {
                        int var10 = -1;
                        int var11 = -1;
                        int var12 = -1;
                        int var13 = arg1.method3140();
                        if (var13 == 32767) {
                            var13 = arg1.method3140();
                            var11 = arg1.method3140();
                            var10 = arg1.method3140();
                            var12 = arg1.method3140();
                        } else if (var13 == 32766) {
                            var13 = -1;
                        } else {
                            var11 = arg1.method3140();
                        }
                        int var14 = arg1.method3140();
                        var5.method1473(var13, var11, var10, var12, field1054, var14);
                    }
                }
                int var15 = arg1.method3134();
                if (var15 > 0) {
                    for (int var16 = 0; var16 < var15; var16++) {
                        int var17 = arg1.method3140();
                        int var18 = arg1.method3140();
                        if (var18 == 32767) {
                            var5.method1475(var17);
                        } else {
                            int var19 = arg1.method3140();
                            int var20 = arg1.method3041();
                            int var21 = var18 > 0 ? arg1.method3041() : var20;
                            var5.method1474(var17, field1054, var18, var19, var20, var21);
                        }
                    }
                }
            }
            if ((var6 & 0x10) != 0) {
                int var22 = arg1.method3050();
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = arg1.method3041();
                if (var5.field1176 == var22 && var22 != -1) {
                    int var24 = class268.method2289(var22).field3656;
                    if (var24 == 1) {
                        var5.field1177 = 0;
                        var5.field1180 = 0;
                        var5.field1179 = var23;
                        var5.field1164 = 0;
                    }
                    if (var24 == 2) {
                        var5.field1164 = 0;
                    }
                } else if (var22 == -1 || var5.field1176 == -1 || class268.method2289(var22).field3667 >= class268.method2289(var5.field1176).field3667) {
                    var5.field1176 = var22;
                    var5.field1177 = 0;
                    var5.field1180 = 0;
                    var5.field1179 = var23;
                    var5.field1164 = 0;
                    var5.field1187 = var5.field1198;
                }
            }
            if ((var6 & 0x40) != 0) {
                int var25 = arg1.method3009();
                int var26 = arg1.method3050();
                int var27 = var5.field1188 - (var25 - Statics.field1709 - Statics.field1709) * 64;
                int var28 = var5.field1145 - (var26 - Statics.field1710 - Statics.field1710) * 64;
                if (var27 != 0 || var28 != 0) {
                    var5.field1203 = (int) (Math.atan2((double) var27, (double) var28) * 325.949D) & 0x7FF;
                }
            }
            if ((var6 & 0x1) != 0) {
                var5.field1293 = class266.method1704(arg1.method3051());
                var5.field1202 = var5.field1293.field3626;
                var5.field1197 = var5.field1293.field3633;
                var5.field1152 = var5.field1293.field3608;
                var5.field1153 = var5.field1293.field3617;
                var5.field1154 = var5.field1293.field3618;
                var5.field1155 = var5.field1293.field3609;
                var5.field1175 = var5.field1293.field3613;
                var5.field1150 = var5.field1293.field3636;
                var5.field1151 = var5.field1293.field3604;
            }
            if ((var6 & 0x20) != 0) {
                var5.field1201 = arg1.method3009();
                if (var5.field1201 == 65535) {
                    var5.field1201 = -1;
                }
            }
        }
        for (int var29 = 0; var29 < field973; var29++) {
            int var30 = field974[var29];
            if (field1054 != field907[var30].field1193) {
                field907[var30].field1293 = null;
                field907[var30] = null;
            }
        }
        if (field953.field1472 != arg1.field2498) {
            throw new RuntimeException(arg1.field2498 + class88.field1307 + field953.field1472);
        }
        for (int var31 = 0; var31 < field1016; var31++) {
            if (field907[field909[var31]] == null) {
                throw new RuntimeException(var31 + class88.field1307 + field1016);
            }
        }
    }

    @ObfuscatedName("bv.hp(I)V")
    public static final void method1467() {
        class187 var0 = field953.field1470;
        var0.method3277();
        int var1 = var0.method3278(8);
        if (var1 < field1016) {
            for (int var2 = var1; var2 < field1016; var2++) {
                field974[++field973 - 1] = field909[var2];
            }
        }
        if (var1 > field1016) {
            throw new RuntimeException("");
        }
        field1016 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field909[var3];
            class86 var5 = field907[var4];
            int var6 = var0.method3278(1);
            if (var6 == 0) {
                field909[++field1016 - 1] = var4;
                var5.field1193 = field1054;
            } else {
                int var7 = var0.method3278(2);
                if (var7 == 0) {
                    field909[++field1016 - 1] = var4;
                    var5.field1193 = field1054;
                    field1021[++field910 - 1] = var4;
                } else if (var7 == 1) {
                    field909[++field1016 - 1] = var4;
                    var5.field1193 = field1054;
                    int var8 = var0.method3278(3);
                    var5.method1628(var8, (byte) 1);
                    int var9 = var0.method3278(1);
                    if (var9 == 1) {
                        field1021[++field910 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field909[++field1016 - 1] = var4;
                    var5.field1193 = field1054;
                    int var10 = var0.method3278(3);
                    var5.method1628(var10, (byte) 2);
                    int var11 = var0.method3278(3);
                    var5.method1628(var11, (byte) 2);
                    int var12 = var0.method3278(1);
                    if (var12 == 1) {
                        field1021[++field910 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field974[++field973 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("ak.hg(I)V")
    public static void method454() {
        field989 = 0;
        field988 = false;
    }

    @ObfuscatedName("gv.hi(B)V")
    public static final void method3326() {
        int var0 = Statics.field1680;
        int var1 = Statics.field567;
        int var2 = Statics.field3434;
        int var3 = Statics.field316;
        int var4 = 6116423;
        class291.method4776(var0, var1, var2, var3, var4);
        class291.method4776(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class291.method4782(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field321.method4560(class233.field3076, var0 + 3, var1 + 14, var4, -1);
        int var5 = class60.field705;
        int var6 = class60.field709;
        for (int var7 = 0; var7 < field989; var7++) {
            int var8 = (field989 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field321.method4560(method165(var7), var0 + 3, var8, var9, 0);
        }
        method3248(Statics.field1680, Statics.field567, Statics.field3434, Statics.field316);
    }

    @ObfuscatedName("d.hj(IIIII)V")
    public static final void method170(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field981; var4++) {
            if (field1059[var4] + field1037[var4] > arg0 && field1059[var4] < arg0 + arg2 && field931[var4] + field1013[var4] > arg1 && field931[var4] < arg1 + arg3) {
                field1056[var4] = true;
            }
        }
    }

    @ObfuscatedName("gm.hr(IIIIB)V")
    public static final void method3248(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field981; var4++) {
            if (field1059[var4] + field1037[var4] > arg0 && field1059[var4] < arg0 + arg2 && field931[var4] + field1013[var4] > arg1 && field931[var4] < arg1 + arg3) {
                field1057[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hv(B)V")
    public final void method1121() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field989 - 1; var2++) {
                if (field876[var2] < 1000 && field876[var2 + 1] > 1000) {
                    String var3 = field995[var2];
                    field995[var2] = field995[var2 + 1];
                    field995[var2 + 1] = var3;
                    String var4 = field994[var2];
                    field994[var2] = field994[var2 + 1];
                    field994[var2 + 1] = var4;
                    int var5 = field876[var2];
                    field876[var2] = field876[var2 + 1];
                    field876[var2 + 1] = var5;
                    int var6 = field990[var2];
                    field990[var2] = field990[var2 + 1];
                    field990[var2 + 1] = var6;
                    int var7 = field991[var2];
                    field991[var2] = field991[var2 + 1];
                    field991[var2 + 1] = var7;
                    int var8 = field993[var2];
                    field993[var2] = field993[var2 + 1];
                    field993[var2 + 1] = var8;
                    boolean var9 = field996[var2];
                    field996[var2] = field996[var2 + 1];
                    field996[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field865 != null || field1023 != null) {
            return;
        }
        int var21;
        int var24;
        int var25;
        label214: {
            int var10 = class60.field714;
            if (field988) {
                if (var10 != 1 && (Statics.field1400 || var10 != 4)) {
                    int var11 = class60.field705;
                    int var12 = class60.field709;
                    if (var11 < Statics.field1680 - 10 || var11 > Statics.field3434 + Statics.field1680 + 10 || var12 < Statics.field567 - 10 || var12 > Statics.field567 + Statics.field316 + 10) {
                        field988 = false;
                        method170(Statics.field1680, Statics.field567, Statics.field3434, Statics.field316);
                    }
                }
                if (var10 == 1 || !Statics.field1400 && var10 == 4) {
                    int var13 = Statics.field1680;
                    int var14 = Statics.field567;
                    int var15 = Statics.field3434;
                    int var16 = class60.field715;
                    int var17 = class60.field716;
                    int var18 = -1;
                    for (int var19 = 0; var19 < field989; var19++) {
                        int var20 = (field989 - 1 - var19) * 15 + var14 + 31;
                        if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                            var18 = var19;
                        }
                    }
                    if (var18 != -1) {
                        method2905(var18);
                    }
                    field988 = false;
                    method170(Statics.field1680, Statics.field567, Statics.field3434, Statics.field316);
                }
            } else {
                var21 = field989 - 1;
                if ((var10 == 1 || !Statics.field1400 && var10 == 4) && var21 >= 0) {
                    int var23 = field876[var21];
                    if (var23 == 39 || var23 == 40 || var23 == 41 || var23 == 42 || var23 == 43 || var23 == 33 || var23 == 34 || var23 == 35 || var23 == 36 || var23 == 37 || var23 == 38 || var23 == 1005) {
                        var24 = field990[var21];
                        var25 = field991[var21];
                        class224 var26 = class224.method1468(var25);
                        int var27 = method1528(var26);
                        boolean var28 = (var27 >> 28 & 0x1) != 0;
                        if (var28) {
                            break label214;
                        }
                        int var29 = method1528(var26);
                        boolean var30 = (var29 >> 29 & 0x1) != 0;
                        if (var30) {
                            break label214;
                        }
                    }
                }
                if ((var10 == 1 || !Statics.field1400 && var10 == 4) && this.method1122()) {
                    var10 = 2;
                }
                if ((var10 == 1 || !Statics.field1400 && var10 == 4) && field989 > 0) {
                    method2905(var21);
                }
                if (var10 == 2 && field989 > 0) {
                    this.method1387(class60.field715, class60.field716);
                }
            }
            return;
        }
        if (Statics.field865 != null && !field967 && field989 > 0 && !this.method1122()) {
            int var31 = field964;
            int var32 = field965;
            class89 var33 = Statics.field556;
            method1049(var33.field1321, var33.field1317, var33.field1318, var33.field1319, var33.field1320, var33.field1320, var31, var32);
            Statics.field556 = null;
        }
        field967 = false;
        field968 = 0;
        if (Statics.field865 != null) {
            method353(Statics.field865);
        }
        Statics.field865 = class224.method1468(var25);
        field895 = var24;
        field964 = class60.field715;
        field965 = class60.field716;
        if (var21 >= 0) {
            method743(var21);
        }
        method353(Statics.field865);
    }

    @ObfuscatedName("client.hm(B)Z")
    public final boolean method1122() {
        int var1 = field989 - 1;
        if (field989 > 2) {
            if (field987 == 1 && !field996[var1]) {
                return true;
            }
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field876[var1];
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

    @ObfuscatedName("client.hc(III)V")
    public final void method1387(int arg0, int arg1) {
        int var3 = Statics.field321.method4555(class233.field3076);
        for (int var4 = 0; var4 < field989; var4++) {
            int var5 = Statics.field321.method4555(method165(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field989 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field1842) {
            var7 = Statics.field1842 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field1324) {
            var8 = Statics.field1324 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field649.method2587(Statics.field801, arg0, arg1, false);
        field988 = true;
        Statics.field1680 = var7;
        Statics.field567 = var8;
        Statics.field3434 = var3;
        Statics.field316 = field989 * 15 + 22;
    }

    @ObfuscatedName("fm.hq(II)V")
    public static final void method2905(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field990[arg0];
        int var2 = field991[arg0];
        int var3 = field876[arg0];
        int var4 = field993[arg0];
        String var5 = field994[arg0];
        String var6 = field995[arg0];
        method1049(var1, var2, var3, var4, var5, var6, class60.field715, class60.field716);
    }

    @ObfuscatedName("bg.hd(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1049(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class224 var8 = class224.method3325(arg1, arg0);
            if (var8 != null) {
                method224(arg3, arg1, arg0, var8.field2829, arg5);
            }
        }
        if (arg2 == 34) {
            class171 var9 = class171.method1482(class168.field2362, field953.field1479);
            var9.field2424.method2999(arg1);
            var9.field2424.method2997(arg3);
            var9.field2424.method2997(arg0);
            field953.method1783(var9);
            field1067 = 0;
            Statics.field2421 = class224.method1468(arg1);
            field962 = arg0;
        }
        if (arg2 == 49) {
            class74 var10 = field1113[arg3];
            if (var10 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var11 = class171.method1482(class168.field2356, field953.field1479);
                var11.field2424.method3038(class51.field619[82] ? 1 : 0);
                var11.field2424.method3046(arg3);
                field953.method1783(var11);
            }
        }
        if (arg2 == 26) {
            class171 var12 = class171.method1482(class168.field2375, field953.field1479);
            field953.method1783(var12);
            for (class68 var13 = (class68) field1026.method3433(); var13 != null; var13 = (class68) field1026.method3440()) {
                if (var13.field784 == 0 || var13.field784 == 3) {
                    method2748(var13, true);
                }
            }
            if (field1014 != null) {
                method353(field1014);
                field1014 = null;
            }
        }
        if (arg2 == 32) {
            class171 var14 = class171.method1482(class168.field2366, field953.field1479);
            var14.field2424.method3173(Statics.field268);
            var14.field2424.method3046(arg3);
            var14.field2424.method3097(arg0);
            var14.field2424.method2997(field1006);
            var14.field2424.method2999(arg1);
            field953.method1783(var14);
            field1067 = 0;
            Statics.field2421 = class224.method1468(arg1);
            field962 = arg0;
        }
        if (arg2 == 16) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            field1084 = arg0;
            field1085 = arg1;
            class171 var15 = class171.method1482(class168.field2336, field953.field1479);
            var15.field2424.method3101(class51.field619[82] ? 1 : 0);
            var15.field2424.method3173(Statics.field34);
            var15.field2424.method3067(Statics.field1709 + arg0);
            var15.field2424.method3067(arg3);
            var15.field2424.method3046(Statics.field1710 + arg1);
            var15.field2424.method3067(Statics.field697);
            var15.field2424.method3046(Statics.field625);
            field953.method1783(var15);
        }
        if (arg2 == 4) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            field1084 = arg0;
            field1085 = arg1;
            class171 var16 = class171.method1482(class168.field2367, field953.field1479);
            var16.field2424.method3046(Statics.field1709 + arg0);
            var16.field2424.method3046(Statics.field1710 + arg1);
            var16.field2424.method2996(class51.field619[82] ? 1 : 0);
            var16.field2424.method2997(arg3 >> 14 & 0x7FFF);
            field953.method1783(var16);
        }
        if (arg2 == 46) {
            class74 var17 = field1113[arg3];
            if (var17 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var18 = class171.method1482(class168.field2353, field953.field1479);
                var18.field2424.method2997(arg3);
                var18.field2424.method3130(class51.field619[82] ? 1 : 0);
                field953.method1783(var18);
            }
        }
        if (arg2 == 10) {
            class86 var19 = field907[arg3];
            if (var19 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var20 = class171.method1482(class168.field2338, field953.field1479);
                var20.field2424.method3067(arg3);
                var20.field2424.method3130(class51.field619[82] ? 1 : 0);
                field953.method1783(var20);
            }
        }
        if (arg2 == 40) {
            class171 var21 = class171.method1482(class168.field2369, field953.field1479);
            var21.field2424.method3097(arg0);
            var21.field2424.method2999(arg1);
            var21.field2424.method3097(arg3);
            field953.method1783(var21);
            field1067 = 0;
            Statics.field2421 = class224.method1468(arg1);
            field962 = arg0;
        }
        if (arg2 == 45) {
            class74 var22 = field1113[arg3];
            if (var22 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var23 = class171.method1482(class168.field2379, field953.field1479);
                var23.field2424.method3046(arg3);
                var23.field2424.method3101(class51.field619[82] ? 1 : 0);
                field953.method1783(var23);
            }
        }
        if (arg2 == 1003) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            class86 var24 = field907[arg3];
            if (var24 != null) {
                class266 var25 = var24.field1293;
                if (var25.field3634 != null) {
                    var25 = var25.method4481();
                }
                if (var25 != null) {
                    class171 var26 = class171.method1482(class168.field2386, field953.field1479);
                    var26.field2424.method3067(var25.field3623);
                    field953.method1783(var26);
                }
            }
        }
        if (arg2 == 28) {
            class171 var27 = class171.method1482(class168.field2381, field953.field1479);
            var27.field2424.method2999(arg1);
            field953.method1783(var27);
            class224 var28 = class224.method1468(arg1);
            if (var28.field2839 != null && var28.field2839[0][0] == 5) {
                int var29 = var28.field2839[0][1];
                class219.field2689[var29] = 1 - class219.field2689[var29];
                method1766(var29);
            }
        }
        if (arg2 == 1004) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            class171 var30 = class171.method1482(class168.field2329, field953.field1479);
            var30.field2424.method3046(arg3);
            field953.method1783(var30);
        }
        if (arg2 == 30 && field1014 == null) {
            method500(arg1, arg0);
            field1014 = class224.method3325(arg1, arg0);
            method353(field1014);
        }
        if (arg2 == 5) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            field1084 = arg0;
            field1085 = arg1;
            class171 var31 = class171.method1482(class168.field2350, field953.field1479);
            var31.field2424.method3097(arg3 >> 14 & 0x7FFF);
            var31.field2424.method3101(class51.field619[82] ? 1 : 0);
            var31.field2424.method3067(Statics.field1710 + arg1);
            var31.field2424.method3097(Statics.field1709 + arg0);
            field953.method1783(var31);
        }
        if (arg2 == 37) {
            class171 var32 = class171.method1482(class168.field2365, field953.field1479);
            var32.field2424.method3067(arg3);
            var32.field2424.method3022(arg1);
            var32.field2424.method3067(arg0);
            field953.method1783(var32);
            field1067 = 0;
            Statics.field2421 = class224.method1468(arg1);
            field962 = arg0;
        }
        if (arg2 == 17) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            field1084 = arg0;
            field1085 = arg1;
            class171 var33 = class171.method1482(class168.field2335, field953.field1479);
            var33.field2424.method3097(Statics.field1710 + arg1);
            var33.field2424.method3067(Statics.field1709 + arg0);
            var33.field2424.method3046(field1006);
            var33.field2424.method3016(Statics.field268);
            var33.field2424.method2997(arg3);
            var33.field2424.method3038(class51.field619[82] ? 1 : 0);
            field953.method1783(var33);
        }
        if (arg2 == 58) {
            class224 var34 = class224.method3325(arg1, arg0);
            if (var34 != null) {
                class171 var35 = class171.method1482(class168.field2319, field953.field1479);
                var35.field2424.method3173(Statics.field268);
                var35.field2424.method2997(field1007);
                var35.field2424.method2997(var34.field2829);
                var35.field2424.method3067(arg0);
                var35.field2424.method2997(field1006);
                var35.field2424.method3016(arg1);
                field953.method1783(var35);
            }
        }
        if (arg2 == 1005) {
            class224 var36 = class224.method1468(arg1);
            if (var36 == null || var36.field2846[arg0] < 100000) {
                class171 var37 = class171.method1482(class168.field2329, field953.field1479);
                var37.field2424.method3046(arg3);
                field953.method1783(var37);
            } else {
                class97.method1752(27, "", var36.field2846[arg0] + " x " + class264.method4124(arg3).field3551);
            }
            field1067 = 0;
            Statics.field2421 = class224.method1468(arg1);
            field962 = arg0;
        }
        if (arg2 == 21) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            field1084 = arg0;
            field1085 = arg1;
            class171 var38 = class171.method1482(class168.field2333, field953.field1479);
            var38.field2424.method2996(class51.field619[82] ? 1 : 0);
            var38.field2424.method3067(Statics.field1710 + arg1);
            var38.field2424.method2997(Statics.field1709 + arg0);
            var38.field2424.method3046(arg3);
            field953.method1783(var38);
        }
        if (arg2 == 2) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            field1084 = arg0;
            field1085 = arg1;
            class171 var39 = class171.method1482(class168.field2349, field953.field1479);
            var39.field2424.method2997(Statics.field1709 + arg0);
            var39.field2424.method3097(Statics.field1710 + arg1);
            var39.field2424.method2996(class51.field619[82] ? 1 : 0);
            var39.field2424.method3097(arg3 >> 14 & 0x7FFF);
            var39.field2424.method2999(Statics.field268);
            var39.field2424.method3097(field1006);
            field953.method1783(var39);
        }
        if (arg2 == 1001) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            field1084 = arg0;
            field1085 = arg1;
            class171 var40 = class171.method1482(class168.field2348, field953.field1479);
            var40.field2424.method2997(arg3 >> 14 & 0x7FFF);
            var40.field2424.method3038(class51.field619[82] ? 1 : 0);
            var40.field2424.method2997(Statics.field1709 + arg0);
            var40.field2424.method3046(Statics.field1710 + arg1);
            field953.method1783(var40);
        }
        if (arg2 == 18) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            field1084 = arg0;
            field1085 = arg1;
            class171 var41 = class171.method1482(class168.field2330, field953.field1479);
            var41.field2424.method3067(Statics.field1709 + arg0);
            var41.field2424.method3097(Statics.field1710 + arg1);
            var41.field2424.method2996(class51.field619[82] ? 1 : 0);
            var41.field2424.method3046(arg3);
            field953.method1783(var41);
        }
        if (arg2 == 35) {
            class171 var42 = class171.method1482(class168.field2363, field953.field1479);
            var42.field2424.method2997(arg3);
            var42.field2424.method3046(arg0);
            var42.field2424.method3173(arg1);
            field953.method1783(var42);
            field1067 = 0;
            Statics.field2421 = class224.method1468(arg1);
            field962 = arg0;
        }
        if (arg2 == 43) {
            class171 var43 = class171.method1482(class168.field2372, field953.field1479);
            var43.field2424.method3173(arg1);
            var43.field2424.method3046(arg3);
            var43.field2424.method3097(arg0);
            field953.method1783(var43);
            field1067 = 0;
            Statics.field2421 = class224.method1468(arg1);
            field962 = arg0;
        }
        if (arg2 == 41) {
            class171 var44 = class171.method1482(class168.field2370, field953.field1479);
            var44.field2424.method3067(arg3);
            var44.field2424.method2997(arg0);
            var44.field2424.method3173(arg1);
            field953.method1783(var44);
            field1067 = 0;
            Statics.field2421 = class224.method1468(arg1);
            field962 = arg0;
        }
        if (arg2 == 23) {
            if (field988) {
                Statics.field649.method2588();
            } else {
                Statics.field649.method2587(Statics.field801, arg0, arg1, true);
            }
        }
        if (arg2 == 44) {
            class74 var45 = field1113[arg3];
            if (var45 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var46 = class171.method1482(class168.field2351, field953.field1479);
                var46.field2424.method3130(class51.field619[82] ? 1 : 0);
                var46.field2424.method3097(arg3);
                field953.method1783(var46);
            }
        }
        if (arg2 == 19) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            field1084 = arg0;
            field1085 = arg1;
            class171 var47 = class171.method1482(class168.field2321, field953.field1479);
            var47.field2424.method3067(arg3);
            var47.field2424.method3046(Statics.field1709 + arg0);
            var47.field2424.method3038(class51.field619[82] ? 1 : 0);
            var47.field2424.method3046(Statics.field1710 + arg1);
            field953.method1783(var47);
        }
        if (arg2 == 1) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            field1084 = arg0;
            field1085 = arg1;
            class171 var48 = class171.method1482(class168.field2334, field953.field1479);
            var48.field2424.method3067(arg3 >> 14 & 0x7FFF);
            var48.field2424.method2997(Statics.field697);
            var48.field2424.method3067(Statics.field1710 + arg1);
            var48.field2424.method2999(Statics.field34);
            var48.field2424.method3130(class51.field619[82] ? 1 : 0);
            var48.field2424.method3046(Statics.field1709 + arg0);
            var48.field2424.method3046(Statics.field625);
            field953.method1783(var48);
        }
        if (arg2 == 14) {
            class74 var49 = field1113[arg3];
            if (var49 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var50 = class171.method1482(class168.field2345, field953.field1479);
                var50.field2424.method3046(Statics.field625);
                var50.field2424.method3097(arg3);
                var50.field2424.method3067(Statics.field697);
                var50.field2424.method3173(Statics.field34);
                var50.field2424.method2996(class51.field619[82] ? 1 : 0);
                field953.method1783(var50);
            }
        }
        if (arg2 == 36) {
            class171 var51 = class171.method1482(class168.field2364, field953.field1479);
            var51.field2424.method3022(arg1);
            var51.field2424.method3046(arg3);
            var51.field2424.method3067(arg0);
            field953.method1783(var51);
            field1067 = 0;
            Statics.field2421 = class224.method1468(arg1);
            field962 = arg0;
        }
        if (arg2 == 24) {
            class224 var52 = class224.method1468(arg1);
            boolean var53 = true;
            if (var52.field2840 > 0) {
                var53 = method1048(var52);
            }
            if (var53) {
                class171 var54 = class171.method1482(class168.field2381, field953.field1479);
                var54.field2424.method2999(arg1);
                field953.method1783(var54);
            }
        }
        if (arg2 == 3) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            field1084 = arg0;
            field1085 = arg1;
            class171 var55 = class171.method1482(class168.field2341, field953.field1479);
            var55.field2424.method3097(Statics.field1709 + arg0);
            var55.field2424.method2997(arg3 >> 14 & 0x7FFF);
            var55.field2424.method3097(Statics.field1710 + arg1);
            var55.field2424.method3038(class51.field619[82] ? 1 : 0);
            field953.method1783(var55);
        }
        if (arg2 == 13) {
            class86 var56 = field907[arg3];
            if (var56 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var57 = class171.method1482(class168.field2315, field953.field1479);
                var57.field2424.method2996(class51.field619[82] ? 1 : 0);
                var57.field2424.method3067(arg3);
                field953.method1783(var57);
            }
        }
        if (arg2 == 25) {
            class224 var58 = class224.method3325(arg1, arg0);
            if (var58 != null) {
                method1089();
                int var59 = class225.method1601(method1528(var58));
                int var60 = var58.field2829;
                class224 var61 = class224.method3325(arg1, arg0);
                if (var61 != null && var61.field2832 != null) {
                    class69 var62 = new class69();
                    var62.field795 = var61;
                    var62.field792 = var61.field2832;
                    class83.method1986(var62);
                }
                field1007 = var60;
                field1005 = true;
                Statics.field268 = arg1;
                field1006 = arg0;
                Statics.field2903 = var59;
                method353(var61);
                field1003 = 0;
                field1008 = method2827(var58);
                if (field1008 == null) {
                    field1008 = "Null";
                }
                if (var58.field2857) {
                    field1009 = var58.field2800 + class88.method2738(16777215);
                } else {
                    field1009 = class88.method2738(65280) + var58.field2843 + class88.method2738(16777215);
                }
            }
            return;
        }
        if (arg2 == 48) {
            class74 var63 = field1113[arg3];
            if (var63 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var64 = class171.method1482(class168.field2396, field953.field1479);
                var64.field2424.method3130(class51.field619[82] ? 1 : 0);
                var64.field2424.method3067(arg3);
                field953.method1783(var64);
            }
        }
        if (arg2 == 8) {
            class86 var65 = field907[arg3];
            if (var65 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var66 = class171.method1482(class168.field2342, field953.field1479);
                var66.field2424.method3067(arg3);
                var66.field2424.method3173(Statics.field268);
                var66.field2424.method3067(field1006);
                var66.field2424.method3101(class51.field619[82] ? 1 : 0);
                field953.method1783(var66);
            }
        }
        if (arg2 == 31) {
            class171 var67 = class171.method1482(class168.field2374, field953.field1479);
            var67.field2424.method2997(arg0);
            var67.field2424.method3046(arg3);
            var67.field2424.method3097(Statics.field625);
            var67.field2424.method2997(Statics.field697);
            var67.field2424.method2999(arg1);
            var67.field2424.method3022(Statics.field34);
            field953.method1783(var67);
            field1067 = 0;
            Statics.field2421 = class224.method1468(arg1);
            field962 = arg0;
        }
        if (arg2 == 50) {
            class74 var68 = field1113[arg3];
            if (var68 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var69 = class171.method1482(class168.field2357, field953.field1479);
                var69.field2424.method3101(class51.field619[82] ? 1 : 0);
                var69.field2424.method3097(arg3);
                field953.method1783(var69);
            }
        }
        if (arg2 == 15) {
            class74 var70 = field1113[arg3];
            if (var70 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var71 = class171.method1482(class168.field2359, field953.field1479);
                var71.field2424.method3173(Statics.field268);
                var71.field2424.method3038(class51.field619[82] ? 1 : 0);
                var71.field2424.method2997(arg3);
                var71.field2424.method2997(field1006);
                field953.method1783(var71);
            }
        }
        if (arg2 == 22) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            field1084 = arg0;
            field1085 = arg1;
            class171 var72 = class171.method1482(class168.field2326, field953.field1479);
            var72.field2424.method3046(arg3);
            var72.field2424.method3101(class51.field619[82] ? 1 : 0);
            var72.field2424.method3097(Statics.field1709 + arg0);
            var72.field2424.method3067(Statics.field1710 + arg1);
            field953.method1783(var72);
        }
        if (arg2 == 6) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            field1084 = arg0;
            field1085 = arg1;
            class171 var73 = class171.method1482(class168.field2378, field953.field1479);
            var73.field2424.method3097(Statics.field1710 + arg1);
            var73.field2424.method3097(arg3 >> 14 & 0x7FFF);
            var73.field2424.method3046(Statics.field1709 + arg0);
            var73.field2424.method3038(class51.field619[82] ? 1 : 0);
            field953.method1783(var73);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1128.method5078(arg2, arg3, new class220(arg0), new class220(arg1));
        }
        if (arg2 == 11) {
            class86 var74 = field907[arg3];
            if (var74 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var75 = class171.method1482(class168.field2339, field953.field1479);
                var75.field2424.method3097(arg3);
                var75.field2424.method3101(class51.field619[82] ? 1 : 0);
                field953.method1783(var75);
            }
        }
        if (arg2 == 39) {
            class171 var76 = class171.method1482(class168.field2360, field953.field1479);
            var76.field2424.method3067(arg3);
            var76.field2424.method3046(arg0);
            var76.field2424.method3022(arg1);
            field953.method1783(var76);
            field1067 = 0;
            Statics.field2421 = class224.method1468(arg1);
            field962 = arg0;
        }
        if (arg2 == 29) {
            class171 var77 = class171.method1482(class168.field2381, field953.field1479);
            var77.field2424.method2999(arg1);
            field953.method1783(var77);
            class224 var78 = class224.method1468(arg1);
            if (var78.field2839 != null && var78.field2839[0][0] == 5) {
                int var79 = var78.field2839[0][1];
                if (class219.field2689[var79] != var78.field2717[0]) {
                    class219.field2689[var79] = var78.field2717[0];
                    method1766(var79);
                }
            }
        }
        if (arg2 == 12) {
            class86 var80 = field907[arg3];
            if (var80 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var81 = class171.method1482(class168.field2318, field953.field1479);
                var81.field2424.method3038(class51.field619[82] ? 1 : 0);
                var81.field2424.method2997(arg3);
                field953.method1783(var81);
            }
        }
        if (arg2 == 20) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            field1084 = arg0;
            field1085 = arg1;
            class171 var82 = class171.method1482(class168.field2332, field953.field1479);
            var82.field2424.method3097(Statics.field1710 + arg1);
            var82.field2424.method3046(Statics.field1709 + arg0);
            var82.field2424.method3046(arg3);
            var82.field2424.method3038(class51.field619[82] ? 1 : 0);
            field953.method1783(var82);
        }
        if (arg2 == 47) {
            class74 var83 = field1113[arg3];
            if (var83 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var84 = class171.method1482(class168.field2344, field953.field1479);
                var84.field2424.method3046(arg3);
                var84.field2424.method3038(class51.field619[82] ? 1 : 0);
                field953.method1783(var84);
            }
        }
        if (arg2 == 51) {
            class74 var85 = field1113[arg3];
            if (var85 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var86 = class171.method1482(class168.field2306, field953.field1479);
                var86.field2424.method2996(class51.field619[82] ? 1 : 0);
                var86.field2424.method3067(arg3);
                field953.method1783(var86);
            }
        }
        if (arg2 == 42) {
            class171 var87 = class171.method1482(class168.field2371, field953.field1479);
            var87.field2424.method3097(arg3);
            var87.field2424.method3097(arg0);
            var87.field2424.method3173(arg1);
            field953.method1783(var87);
            field1067 = 0;
            Statics.field2421 = class224.method1468(arg1);
            field962 = arg0;
        }
        if (arg2 == 1002) {
            field957 = arg6;
            field958 = arg7;
            field908 = 2;
            field938 = 0;
            class171 var88 = class171.method1482(class168.field2317, field953.field1479);
            var88.field2424.method3067(arg3 >> 14 & 0x7FFF);
            field953.method1783(var88);
        }
        if (arg2 == 7) {
            class86 var89 = field907[arg3];
            if (var89 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var90 = class171.method1482(class168.field2390, field953.field1479);
                var90.field2424.method2997(Statics.field697);
                var90.field2424.method3067(Statics.field625);
                var90.field2424.method3038(class51.field619[82] ? 1 : 0);
                var90.field2424.method2999(Statics.field34);
                var90.field2424.method3067(arg3);
                field953.method1783(var90);
            }
        }
        if (arg2 == 33) {
            class171 var91 = class171.method1482(class168.field2361, field953.field1479);
            var91.field2424.method3097(arg3);
            var91.field2424.method3173(arg1);
            var91.field2424.method3067(arg0);
            field953.method1783(var91);
            field1067 = 0;
            Statics.field2421 = class224.method1468(arg1);
            field962 = arg0;
        }
        if (arg2 == 38) {
            method1089();
            class224 var92 = class224.method1468(arg1);
            field1003 = 1;
            Statics.field697 = arg0;
            Statics.field34 = arg1;
            Statics.field625 = arg3;
            method353(var92);
            field1119 = class88.method2738(16748608) + class264.method4124(arg3).field3551 + class88.method2738(16777215);
            if (field1119 == null) {
                field1119 = "null";
            }
            return;
        }
        if (arg2 == 9) {
            class86 var93 = field907[arg3];
            if (var93 != null) {
                field957 = arg6;
                field958 = arg7;
                field908 = 2;
                field938 = 0;
                field1084 = arg0;
                field1085 = arg1;
                class171 var94 = class171.method1482(class168.field2394, field953.field1479);
                var94.field2424.method3038(class51.field619[82] ? 1 : 0);
                var94.field2424.method3067(arg3);
                field953.method1783(var94);
            }
        }
        if (field1003 != 0) {
            field1003 = 0;
            method353(class224.method1468(Statics.field34));
        }
        if (field1005) {
            method1089();
        }
        if (Statics.field2421 != null && field1067 == 0) {
            method353(Statics.field2421);
        }
    }

    @ObfuscatedName("bq.hw(S)V")
    public static void method1089() {
        if (!field1005) {
            return;
        }
        class224 var0 = class224.method3325(Statics.field268, field1006);
        if (var0 != null && var0.field2819 != null) {
            class69 var1 = new class69();
            var1.field795 = var0;
            var1.field792 = var0.field2819;
            class83.method1986(var1);
        }
        field1005 = false;
        method353(var0);
    }

    @ObfuscatedName("at.ht(IIB)V")
    public static void method500(int arg0, int arg1) {
        class171 var2 = class171.method1482(class168.field2340, field953.field1479);
        var2.field2424.method3016(arg0);
        var2.field2424.method3046(arg1);
        field953.method1783(var2);
    }

    @ObfuscatedName("ao.hk(IIIILjava/lang/String;I)V")
    public static void method224(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class224 var5 = class224.method3325(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2827 != null) {
            class69 var6 = new class69();
            var6.field795 = var5;
            var6.field790 = arg0;
            var6.field794 = arg4;
            var6.field792 = var5.field2827;
            class83.method1986(var6);
        }
        boolean var7 = true;
        if (var5.field2840 > 0) {
            var7 = method1048(var5);
        }
        if (!var7 || !class225.method2019(method1528(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class171 var8 = class171.method1482(class168.field2320, field953.field1479);
            var8.field2424.method2999(arg1);
            var8.field2424.method2997(arg2);
            var8.field2424.method2997(arg3);
            field953.method1783(var8);
        }
        if (arg0 == 2) {
            class171 var9 = class171.method1482(class168.field2373, field953.field1479);
            var9.field2424.method2999(arg1);
            var9.field2424.method2997(arg2);
            var9.field2424.method2997(arg3);
            field953.method1783(var9);
        }
        if (arg0 == 3) {
            class171 var10 = class171.method1482(class168.field2393, field953.field1479);
            var10.field2424.method2999(arg1);
            var10.field2424.method2997(arg2);
            var10.field2424.method2997(arg3);
            field953.method1783(var10);
        }
        if (arg0 == 4) {
            class171 var11 = class171.method1482(class168.field2323, field953.field1479);
            var11.field2424.method2999(arg1);
            var11.field2424.method2997(arg2);
            var11.field2424.method2997(arg3);
            field953.method1783(var11);
        }
        if (arg0 == 5) {
            class171 var12 = class171.method1482(class168.field2324, field953.field1479);
            var12.field2424.method2999(arg1);
            var12.field2424.method2997(arg2);
            var12.field2424.method2997(arg3);
            field953.method1783(var12);
        }
        if (arg0 == 6) {
            class171 var13 = class171.method1482(class168.field2325, field953.field1479);
            var13.field2424.method2999(arg1);
            var13.field2424.method2997(arg2);
            var13.field2424.method2997(arg3);
            field953.method1783(var13);
        }
        if (arg0 == 7) {
            class171 var14 = class171.method1482(class168.field2399, field953.field1479);
            var14.field2424.method2999(arg1);
            var14.field2424.method2997(arg2);
            var14.field2424.method2997(arg3);
            field953.method1783(var14);
        }
        if (arg0 == 8) {
            class171 var15 = class171.method1482(class168.field2327, field953.field1479);
            var15.field2424.method2999(arg1);
            var15.field2424.method2997(arg2);
            var15.field2424.method2997(arg3);
            field953.method1783(var15);
        }
        if (arg0 == 9) {
            class171 var16 = class171.method1482(class168.field2328, field953.field1479);
            var16.field2424.method2999(arg1);
            var16.field2424.method2997(arg2);
            var16.field2424.method2997(arg3);
            field953.method1783(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class171 var17 = class171.method1482(class168.field2352, field953.field1479);
        var17.field2424.method2999(arg1);
        var17.field2424.method2997(arg2);
        var17.field2424.method2997(arg3);
        field953.method1783(var17);
    }

    @ObfuscatedName("bz.hf(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method968(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method3324(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("gs.hl(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method3324(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field988 || field989 >= 500) {
            return;
        }
        field994[field989] = arg0;
        field995[field989] = arg1;
        field876[field989] = arg2;
        field993[field989] = arg3;
        field990[field989] = arg4;
        field991[field989] = arg5;
        field996[field989] = arg6;
        field989++;
    }

    @ObfuscatedName("fy.hy(B)V")
    public static void method2935() {
        for (int var0 = 0; var0 < field989; var0++) {
            int var1 = field876[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field989 - 1) {
                    for (int var3 = var0; var3 < field989 - 1; var3++) {
                        field994[var3] = field994[var3 + 1];
                        field995[var3] = field995[var3 + 1];
                        field876[var3] = field876[var3 + 1];
                        field993[var3] = field993[var3 + 1];
                        field990[var3] = field990[var3 + 1];
                        field991[var3] = field991[var3 + 1];
                        field996[var3] = field996[var3 + 1];
                    }
                }
                field989--;
            }
        }
    }

    @ObfuscatedName("o.hh(II)Ljava/lang/String;")
    public static String method165(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field995[arg0].length() > 0) {
            return field994[arg0] + class233.field3083 + field995[arg0];
        } else {
            return field994[arg0];
        }
    }

    @ObfuscatedName("aw.hz(Ljc;IIII)V")
    public static final void method574(class266 arg0, int arg1, int arg2, int arg3) {
        if (field989 >= 400) {
            return;
        }
        if (arg0.field3634 != null) {
            arg0 = arg0.method4481();
        }
        if (arg0 == null || !arg0.field3615 || arg0.field3639 && field879 != arg1) {
            return;
        }
        String var4 = arg0.field3629;
        if (arg0.field3637 != 0) {
            int var6 = arg0.field3637;
            int var7 = Statics.field601.field836;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class88.method2738(16711680);
            } else if (var8 < -6) {
                var9 = class88.method2738(16723968);
            } else if (var8 < -3) {
                var9 = class88.method2738(16740352);
            } else if (var8 < 0) {
                var9 = class88.method2738(16756736);
            } else if (var8 > 9) {
                var9 = class88.method2738(65280);
            } else if (var8 > 6) {
                var9 = class88.method2738(4259584);
            } else if (var8 > 3) {
                var9 = class88.method2738(8453888);
            } else if (var8 > 0) {
                var9 = class88.method2738(12648192);
            } else {
                var9 = class88.method2738(16776960);
            }
            var4 = var4 + var9 + " " + class88.field1310 + class233.field3203 + arg0.field3637 + class88.field1308;
        }
        if (arg0.field3639 && field997) {
            method968(class233.field3074, class88.method2738(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1003 == 1) {
            method968(class233.field3073, field1119 + " " + class88.field1309 + " " + class88.method2738(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1005) {
            int var10 = arg0.field3639 && field997 ? 2000 : 0;
            String[] var11 = arg0.field3624;
            if (field870) {
                var11 = method1030(var11);
            }
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class233.field3075)) {
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
                        method968(var11[var12], class88.method2738(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class233.field3075)) {
                        short var15 = 0;
                        if (field942 != class91.field1328) {
                            if (field942 == class91.field1326 || field942 == class91.field1329 && arg0.field3637 > Statics.field601.field836) {
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
                            method968(var11[var14], class88.method2738(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3639 || !field997) {
                method968(class233.field3074, class88.method2738(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field2903 & 0x2) == 2) {
            method968(field1008, field1009 + " " + class88.field1309 + " " + class88.method2738(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ci.hs(Lbq;IIIB)V")
    public static final void method1642(class74 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field601 == arg0 || field989 >= 400) {
            return;
        }
        String var9;
        if (arg0.field838 == 0) {
            String var4 = arg0.field834[0] + arg0.field852 + arg0.field834[1];
            int var5 = arg0.field836;
            int var6 = Statics.field601.field836;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class88.method2738(16711680);
            } else if (var7 < -6) {
                var8 = class88.method2738(16723968);
            } else if (var7 < -3) {
                var8 = class88.method2738(16740352);
            } else if (var7 < 0) {
                var8 = class88.method2738(16756736);
            } else if (var7 > 9) {
                var8 = class88.method2738(65280);
            } else if (var7 > 6) {
                var8 = class88.method2738(4259584);
            } else if (var7 > 3) {
                var8 = class88.method2738(8453888);
            } else if (var7 > 0) {
                var8 = class88.method2738(12648192);
            } else {
                var8 = class88.method2738(16776960);
            }
            var9 = var4 + var8 + " " + class88.field1310 + class233.field3203 + arg0.field836 + class88.field1308 + arg0.field834[2];
        } else {
            var9 = arg0.field834[0] + arg0.field852 + arg0.field834[1] + " " + class88.field1310 + class233.field3080 + arg0.field838 + class88.field1308 + arg0.field834[2];
        }
        if (field1003 == 1) {
            method968(class233.field3073, field1119 + " " + class88.field1309 + " " + class88.method2738(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field1005) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field976[var10] != null) {
                    short var11 = 0;
                    if (field976[var10].equalsIgnoreCase(class233.field3075)) {
                        if (field923 == class91.field1328) {
                            continue;
                        }
                        if (field923 == class91.field1326 || field923 == class91.field1329 && arg0.field836 > Statics.field601.field836) {
                            var11 = 2000;
                        }
                        if (Statics.field601.field851 != 0 && arg0.field851 != 0) {
                            if (Statics.field601.field851 == arg0.field851) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field977[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field975[var10] + var11;
                    method968(field976[var10], class88.method2738(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2903 & 0x8) == 8) {
            method968(field1008, field1009 + " " + class88.field1309 + " " + class88.method2738(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field989; var14++) {
            if (field876[var14] == 23) {
                field995[var14] = class88.method2738(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("w.he(IIIIIIIII)V")
    public static final void method73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class224.method1621(arg0)) {
            Statics.field631 = null;
            method572(Statics.field3299[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field631 != null) {
                method572(Statics.field631, -1412584499, arg1, arg2, arg3, arg4, Statics.field810, Statics.field1707, arg7);
                Statics.field631 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1056[var8] = true;
            }
        } else {
            field1056[arg7] = true;
        }
    }

    @ObfuscatedName("aw.hu([Lhk;IIIIIIIII)V")
    public static final void method572(class224[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class291.method4833(arg2, arg3, arg4, arg5);
        class136.method2476();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class224 var10 = arg0[var9];
            if (var10 != null && (var10.field2746 == arg1 || arg1 == -1412584499 && field1023 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1059[field981] = var10.field2740 + arg6;
                    field931[field981] = var10.field2741 + arg7;
                    field1037[field981] = var10.field2742;
                    field1013[field981] = var10.field2775;
                    var11 = ++field981 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2777 = var11;
                var10.field2859 = field1054;
                if (!var10.field2857 || !method4263(var10)) {
                    if (var10.field2840 > 0) {
                        int var12 = var10.field2840;
                        if (var12 == 324) {
                            if (field1124 == -1) {
                                field1124 = var10.field2762;
                                field1125 = var10.field2861;
                            }
                            if (field1123.field2698) {
                                var10.field2762 = field1124;
                            } else {
                                var10.field2762 = field1125;
                            }
                        } else if (var12 == 325) {
                            if (field1124 == -1) {
                                field1124 = var10.field2762;
                                field1125 = var10.field2861;
                            }
                            if (field1123.field2698) {
                                var10.field2762 = field1125;
                            } else {
                                var10.field2762 = field1124;
                            }
                        } else if (var12 == 327) {
                            var10.field2855 = 150;
                            var10.field2779 = (int) (Math.sin((double) field1054 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2770 = 5;
                            var10.field2771 = 0;
                        } else if (var12 == 328) {
                            var10.field2855 = 150;
                            var10.field2779 = (int) (Math.sin((double) field1054 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2770 = 5;
                            var10.field2771 = 1;
                        }
                    }
                    int var13 = var10.field2740 + arg6;
                    int var14 = var10.field2741 + arg7;
                    int var15 = var10.field2727;
                    if (field1023 == var10) {
                        if (arg1 != -1412584499 && !var10.field2805) {
                            Statics.field631 = arg0;
                            Statics.field810 = arg6;
                            Statics.field1707 = arg7;
                            continue;
                        }
                        if (field1064 && field1028) {
                            int var16 = class60.field705;
                            int var17 = class60.field709;
                            int var18 = var16 - field1025;
                            int var19 = var17 - field1088;
                            if (var18 < field1029) {
                                var18 = field1029;
                            }
                            if (var10.field2742 + var18 > field1029 + field1024.field2742) {
                                var18 = field1029 + field1024.field2742 - var10.field2742;
                            }
                            if (var19 < field881) {
                                var19 = field881;
                            }
                            if (var10.field2775 + var19 > field881 + field1024.field2775) {
                                var19 = field881 + field1024.field2775 - var10.field2775;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2805) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2809 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2809 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2742 + var13;
                        int var27 = var10.field2775 + var14;
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
                        int var30 = var10.field2742 + var13;
                        int var31 = var10.field2775 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2857 || var20 < var22 && var21 < var23) {
                        if (var10.field2840 != 0) {
                            if (var10.field2840 == 1336) {
                                if (field941) {
                                    var14 += 15;
                                    Statics.field598.method4562("Fps:" + field694, var10.field2742 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field875) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field875) {
                                        var34 = 16711680;
                                    }
                                    Statics.field598.method4562("Mem:" + var33 + "k", var10.field2742 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2840 == 1337) {
                                field999 = var13;
                                field1000 = var14;
                                method4161(var13, var14, var10.field2742, var10.field2775);
                                field1056[var10.field2777] = true;
                                class291.method4833(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2840 == 1338) {
                                method52(var10, var13, var14, var11);
                                class291.method4833(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2840 == 1339) {
                                method599(var10, var13, var14, var11);
                                class291.method4833(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2840 == 1400) {
                                Statics.field1128.method5044(var13, var14, var10.field2742, var10.field2775, field1054);
                            }
                            if (var10.field2840 == 1401) {
                                Statics.field1128.method5045(var13, var14, var10.field2742, var10.field2775);
                            }
                        }
                        if (var10.field2809 == 0) {
                            if (!var10.field2857 && method4263(var10) && Statics.field752 != var10) {
                                continue;
                            }
                            if (!var10.field2857) {
                                if (var10.field2749 > var10.field2751 - var10.field2775) {
                                    var10.field2749 = var10.field2751 - var10.field2775;
                                }
                                if (var10.field2749 < 0) {
                                    var10.field2749 = 0;
                                }
                            }
                            method572(arg0, var10.field2764, var20, var21, var22, var23, var13 - var10.field2748, var14 - var10.field2749, var11);
                            if (var10.field2856 != null) {
                                method572(var10.field2856, var10.field2764, var20, var21, var22, var23, var13 - var10.field2748, var14 - var10.field2749, var11);
                            }
                            class68 var35 = (class68) field1026.method3444((long) var10.field2764);
                            if (var35 != null) {
                                method73(var35.field781, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class291.method4833(arg2, arg3, arg4, arg5);
                            class136.method2476();
                        }
                        if (field1097 || field897[var11] || field1063 > 1) {
                            if (var10.field2809 == 0 && !var10.field2857 && var10.field2751 > var10.field2775) {
                                method576(var10.field2742 + var13, var14, var10.field2749, var10.field2775, var10.field2751);
                            }
                            if (var10.field2809 != 1) {
                                if (var10.field2809 == 2) {
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < var10.field2739; var37++) {
                                        for (int var38 = 0; var38 < var10.field2726; var38++) {
                                            int var39 = (var10.field2793 + 32) * var38 + var13;
                                            int var40 = (var10.field2794 + 32) * var37 + var14;
                                            if (var36 < 20) {
                                                var39 += var10.field2795[var36];
                                                var40 += var10.field2796[var36];
                                            }
                                            if (var10.field2845[var36] > 0) {
                                                boolean var41 = false;
                                                boolean var42 = false;
                                                int var43 = var10.field2845[var36] - 1;
                                                if (var39 + 32 > arg2 && var39 < arg4 && var40 + 32 > arg3 && var40 < arg5 || Statics.field865 == var10 && field895 == var36) {
                                                    class295 var44;
                                                    if (field1003 == 1 && Statics.field697 == var36 && Statics.field34 == var10.field2764) {
                                                        var44 = Statics.method49(var43, var10.field2846[var36], 2, 0, 2, false);
                                                    } else {
                                                        var44 = Statics.method49(var43, var10.field2846[var36], 1, 3153952, 2, false);
                                                    }
                                                    if (var44 == null) {
                                                        method353(var10);
                                                    } else if (Statics.field865 == var10 && field895 == var36) {
                                                        int var45 = class60.field705 - field964;
                                                        int var46 = class60.field709 - field965;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (field968 < 5) {
                                                            var45 = 0;
                                                            var46 = 0;
                                                        }
                                                        var44.method4939(var39 + var45, var40 + var46, 128);
                                                        if (arg1 != -1) {
                                                            class224 var47 = arg0[arg1 & 0xFFFF];
                                                            if (var40 + var46 < class291.field3816 && var47.field2749 > 0) {
                                                                int var48 = field926 * (class291.field3816 - var40 - var46) / 3;
                                                                if (var48 > field926 * 10) {
                                                                    var48 = field926 * 10;
                                                                }
                                                                if (var48 > var47.field2749) {
                                                                    var48 = var47.field2749;
                                                                }
                                                                var47.field2749 -= var48;
                                                                field965 += var48;
                                                                method353(var47);
                                                            }
                                                            if (var40 + var46 + 32 > class291.field3813 && var47.field2749 < var47.field2751 - var47.field2775) {
                                                                int var49 = field926 * (var40 + var46 + 32 - class291.field3813) / 3;
                                                                if (var49 > field926 * 10) {
                                                                    var49 = field926 * 10;
                                                                }
                                                                if (var49 > var47.field2751 - var47.field2775 - var47.field2749) {
                                                                    var49 = var47.field2751 - var47.field2775 - var47.field2749;
                                                                }
                                                                var47.field2749 += var49;
                                                                field965 -= var49;
                                                                method353(var47);
                                                            }
                                                        }
                                                    } else if (Statics.field2421 == var10 && field962 == var36) {
                                                        var44.method4939(var39, var40, 128);
                                                    } else {
                                                        var44.method4892(var39, var40);
                                                    }
                                                }
                                            } else if (var10.field2797 != null && var36 < 20) {
                                                class295 var50 = var10.method3829(var36);
                                                if (var50 != null) {
                                                    var50.method4892(var39, var40);
                                                } else if (class224.field2725) {
                                                    method353(var10);
                                                }
                                            }
                                            var36++;
                                        }
                                    }
                                } else if (var10.field2809 == 3) {
                                    int var51;
                                    if (method2910(var10)) {
                                        var51 = var10.field2754;
                                        if (Statics.field752 == var10 && var10.field2755 != 0) {
                                            var51 = var10.field2755;
                                        }
                                    } else {
                                        var51 = var10.field2752;
                                        if (Statics.field752 == var10 && var10.field2810 != 0) {
                                            var51 = var10.field2810;
                                        }
                                    }
                                    if (var10.field2815) {
                                        switch(var10.field2757.field3828) {
                                            case 1:
                                                class291.method4784(var13, var14, var10.field2742, var10.field2775, var10.field2752, var10.field2754, 256 - (var10.field2727 & 0xFF), 256 - (var10.field2759 & 0xFF));
                                                break;
                                            case 2:
                                                class291.method4777(var13, var14, var10.field2742, var10.field2775, var10.field2752, var10.field2754, 256 - (var10.field2727 & 0xFF), 256 - (var10.field2759 & 0xFF));
                                                break;
                                            case 3:
                                                class291.method4778(var13, var14, var10.field2742, var10.field2775, var10.field2752, var10.field2754, 256 - (var10.field2727 & 0xFF), 256 - (var10.field2759 & 0xFF));
                                                break;
                                            case 4:
                                                class291.method4779(var13, var14, var10.field2742, var10.field2775, var10.field2752, var10.field2754, 256 - (var10.field2727 & 0xFF), 256 - (var10.field2759 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class291.method4776(var13, var14, var10.field2742, var10.field2775, var51);
                                                } else {
                                                    class291.method4775(var13, var14, var10.field2742, var10.field2775, var51, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class291.method4782(var13, var14, var10.field2742, var10.field2775, var51);
                                    } else {
                                        class291.method4783(var13, var14, var10.field2742, var10.field2775, var51, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2809 == 4) {
                                    class271 var52 = var10.method3836();
                                    if (var52 != null) {
                                        String var53 = var10.field2787;
                                        int var54;
                                        if (method2910(var10)) {
                                            var54 = var10.field2754;
                                            if (Statics.field752 == var10 && var10.field2755 != 0) {
                                                var54 = var10.field2755;
                                            }
                                            if (var10.field2788.length() > 0) {
                                                var53 = var10.field2788;
                                            }
                                        } else {
                                            var54 = var10.field2752;
                                            if (Statics.field752 == var10 && var10.field2810 != 0) {
                                                var54 = var10.field2810;
                                            }
                                        }
                                        if (var10.field2857 && var10.field2829 != -1) {
                                            class264 var55 = class264.method4124(var10.field2829);
                                            var53 = var55.field3551;
                                            if (var53 == null) {
                                                var53 = "null";
                                            }
                                            if ((var55.field3559 == 1 || var10.field2848 != 1) && var10.field2848 != -1) {
                                                var53 = class88.method2738(16748608) + var53 + class88.field1314 + " " + 'x' + method3891(var10.field2848);
                                            }
                                        }
                                        if (field1014 == var10) {
                                            class233 var10000 = (class233) null;
                                            var53 = class233.field3112;
                                            var54 = var10.field2752;
                                        }
                                        if (!var10.field2857) {
                                            var53 = method1998(var53, var10);
                                        }
                                        var52.method4564(var53, var13, var14, var10.field2742, var10.field2775, var54, var10.field2714 ? 0 : -1, var10.field2854, var10.field2753, var10.field2789);
                                    } else if (class224.field2725) {
                                        method353(var10);
                                    }
                                } else if (var10.field2809 == 5) {
                                    if (var10.field2857) {
                                        class295 var57;
                                        if (var10.field2829 == -1) {
                                            var57 = var10.method3835(false);
                                        } else {
                                            var57 = Statics.method49(var10.field2829, var10.field2848, var10.field2778, var10.field2767, var10.field2785, false);
                                        }
                                        if (var57 != null) {
                                            int var58 = var57.field3844;
                                            int var59 = var57.field3845;
                                            if (var10.field2765) {
                                                class291.method4770(var13, var14, var10.field2742 + var13, var10.field2775 + var14);
                                                int var60 = (var10.field2742 + (var58 - 1)) / var58;
                                                int var61 = (var10.field2775 + (var59 - 1)) / var59;
                                                for (int var62 = 0; var62 < var60; var62++) {
                                                    for (int var63 = 0; var63 < var61; var63++) {
                                                        if (var10.field2716 != 0) {
                                                            var57.method4905(var58 / 2 + var58 * var62 + var13, var59 / 2 + var59 * var63 + var14, var10.field2716, 4096);
                                                        } else if (var15 == 0) {
                                                            var57.method4892(var58 * var62 + var13, var59 * var63 + var14);
                                                        } else {
                                                            var57.method4939(var58 * var62 + var13, var59 * var63 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class291.method4833(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var64 = var10.field2742 * 4096 / var58;
                                                if (var10.field2716 != 0) {
                                                    var57.method4905(var10.field2742 / 2 + var13, var10.field2775 / 2 + var14, var10.field2716, var64);
                                                } else if (var15 != 0) {
                                                    var57.method4972(var13, var14, var10.field2742, var10.field2775, 256 - (var15 & 0xFF));
                                                } else if (var10.field2742 == var58 && var10.field2775 == var59) {
                                                    var57.method4892(var13, var14);
                                                } else {
                                                    var57.method4909(var13, var14, var10.field2742, var10.field2775);
                                                }
                                            }
                                        } else if (class224.field2725) {
                                            method353(var10);
                                        }
                                    } else {
                                        class295 var56 = var10.method3835(method2910(var10));
                                        if (var56 != null) {
                                            var56.method4892(var13, var14);
                                        } else if (class224.field2725) {
                                            method353(var10);
                                        }
                                    }
                                } else if (var10.field2809 == 6) {
                                    boolean var65 = method2910(var10);
                                    int var66;
                                    if (var65) {
                                        var66 = var10.field2807;
                                    } else {
                                        var66 = var10.field2774;
                                    }
                                    class133 var67 = null;
                                    int var68 = 0;
                                    if (var10.field2829 != -1) {
                                        class264 var69 = class264.method4124(var10.field2829);
                                        if (var69 != null) {
                                            class264 var70 = var69.method4390(var10.field2848);
                                            var67 = var70.method4389(1);
                                            if (var67 == null) {
                                                method353(var10);
                                            } else {
                                                var67.method2385();
                                                var68 = var67.field2037 / 2;
                                            }
                                        }
                                    } else if (var10.field2770 == 5) {
                                        if (var10.field2771 == 0) {
                                            var67 = field1123.method3790((class268) null, -1, (class268) null, -1);
                                        } else {
                                            var67 = Statics.field601.method1070();
                                        }
                                    } else if (var66 == -1) {
                                        var67 = var10.method3846((class268) null, -1, var65, Statics.field601.field833);
                                        if (var67 == null && class224.field2725) {
                                            method353(var10);
                                        }
                                    } else {
                                        class268 var71 = class268.method2289(var66);
                                        var67 = var10.method3846(var71, var10.field2738, var65, Statics.field601.field833);
                                        if (var67 == null && class224.field2725) {
                                            method353(var10);
                                        }
                                    }
                                    class136.method2517(var10.field2742 / 2 + var13, var10.field2775 / 2 + var14);
                                    int var72 = var10.field2781 * class136.field1947[var10.field2855] >> 16;
                                    int var73 = var10.field2781 * class136.field1953[var10.field2855] >> 16;
                                    if (var67 != null) {
                                        if (var10.field2857) {
                                            var67.method2385();
                                            if (var10.field2784) {
                                                var67.method2410(0, var10.field2779, var10.field2780, var10.field2855, var10.field2776, var10.field2769 + var68 + var72, var10.field2769 + var73, var10.field2781);
                                            } else {
                                                var67.method2398(0, var10.field2779, var10.field2780, var10.field2855, var10.field2776, var10.field2769 + var68 + var72, var10.field2769 + var73);
                                            }
                                        } else {
                                            var67.method2398(0, var10.field2779, 0, var10.field2855, 0, var72, var73);
                                        }
                                    }
                                    class136.method2475();
                                } else {
                                    if (var10.field2809 == 7) {
                                        class271 var74 = var10.method3836();
                                        if (var74 == null) {
                                            if (class224.field2725) {
                                                method353(var10);
                                            }
                                            continue;
                                        }
                                        int var75 = 0;
                                        for (int var76 = 0; var76 < var10.field2739; var76++) {
                                            for (int var77 = 0; var77 < var10.field2726; var77++) {
                                                if (var10.field2845[var75] > 0) {
                                                    class264 var78 = class264.method4124(var10.field2845[var75] - 1);
                                                    String var79;
                                                    if (var78.field3559 != 1 && var10.field2846[var75] == 1) {
                                                        var79 = class88.method2738(16748608) + var78.field3551 + class88.field1314;
                                                    } else {
                                                        var79 = class88.method2738(16748608) + var78.field3551 + class88.field1314 + " " + 'x' + method3891(var10.field2846[var75]);
                                                    }
                                                    int var80 = (var10.field2793 + 115) * var77 + var13;
                                                    int var81 = (var10.field2794 + 12) * var76 + var14;
                                                    if (var10.field2854 == 0) {
                                                        var74.method4560(var79, var80, var81, var10.field2752, var10.field2714 ? 0 : -1);
                                                    } else if (var10.field2854 == 1) {
                                                        var74.method4563(var79, var10.field2742 / 2 + var80, var81, var10.field2752, var10.field2714 ? 0 : -1);
                                                    } else {
                                                        var74.method4562(var79, var10.field2742 + var80 - 1, var81, var10.field2752, var10.field2714 ? 0 : -1);
                                                    }
                                                }
                                                var75++;
                                            }
                                        }
                                    }
                                    if (var10.field2809 == 8 && Statics.field281 == var10 && field1002 == field1001) {
                                        int var82 = 0;
                                        int var83 = 0;
                                        class271 var84 = Statics.field598;
                                        String var85 = var10.field2787;
                                        String var86 = method1998(var85, var10);
                                        while (var86.length() > 0) {
                                            int var87 = var86.indexOf(class88.field1313);
                                            String var88;
                                            if (var87 == -1) {
                                                var88 = var86;
                                                var86 = "";
                                            } else {
                                                var88 = var86.substring(0, var87);
                                                var86 = var86.substring(var87 + 4);
                                            }
                                            int var89 = var84.method4555(var88);
                                            if (var89 > var82) {
                                                var82 = var89;
                                            }
                                            var83 += var84.field3698 + 1;
                                        }
                                        var82 += 6;
                                        var83 += 7;
                                        int var90 = var10.field2742 + var13 - 5 - var82;
                                        int var91 = var10.field2775 + var14 + 5;
                                        if (var90 < var13 + 5) {
                                            var90 = var13 + 5;
                                        }
                                        if (var82 + var90 > arg4) {
                                            var90 = arg4 - var82;
                                        }
                                        if (var83 + var91 > arg5) {
                                            var91 = arg5 - var83;
                                        }
                                        class291.method4776(var90, var91, var82, var83, 16777120);
                                        class291.method4782(var90, var91, var82, var83, 0);
                                        String var92 = var10.field2787;
                                        int var93 = var84.field3698 + var91 + 2;
                                        String var94 = method1998(var92, var10);
                                        while (var94.length() > 0) {
                                            int var95 = var94.indexOf(class88.field1313);
                                            String var96;
                                            if (var95 == -1) {
                                                var96 = var94;
                                                var94 = "";
                                            } else {
                                                var96 = var94.substring(0, var95);
                                                var94 = var94.substring(var95 + 4);
                                            }
                                            var84.method4560(var96, var90 + 3, var93, 0, -1);
                                            var93 += var84.field3698 + 1;
                                        }
                                    }
                                    if (var10.field2809 == 9) {
                                        int var97;
                                        int var98;
                                        int var99;
                                        int var100;
                                        if (var10.field2761) {
                                            var97 = var13;
                                            var98 = var10.field2775 + var14;
                                            var99 = var10.field2742 + var13;
                                            var100 = var14;
                                        } else {
                                            var97 = var13;
                                            var98 = var14;
                                            var99 = var10.field2742 + var13;
                                            var100 = var10.field2775 + var14;
                                        }
                                        if (var10.field2760 == 1) {
                                            class291.method4788(var97, var98, var99, var100, var10.field2752);
                                        } else {
                                            method164(var97, var98, var99, var100, var10.field2752, var10.field2760);
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

    @ObfuscatedName("z.hx(IIIIIII)V")
    public static final void method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class291.field3815;
        int var18 = arg1 - class291.field3816;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class136.method2505(var19, var20, var21);
        class136.method2484(var23, var24, var25, var19, var20, var21, arg4);
        class136.method2505(var19, var21, var22);
        class136.method2484(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("dn.hn(Ljava/lang/String;Lhk;I)Ljava/lang/String;")
    public static String method1998(String arg0, class224 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method1741(method63(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field3272 != null) {
                    var5 = class278.method2545(Statics.field3272.field2145);
                    if (Statics.field3272.field2147 != null) {
                        var5 = (String) Statics.field3272.field2147;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("hy.ip(II)Ljava/lang/String;")
    public static final String method3891(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class88.field1307 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class88.method2738(65408) + var1.substring(0, var1.length() - 8) + class233.field3084 + " " + class88.field1310 + var1 + class88.field1308 + class88.field1314;
        } else if (var1.length() > 6) {
            return " " + class88.method2738(16777215) + var1.substring(0, var1.length() - 4) + class233.field3086 + " " + class88.field1310 + var1 + class88.field1308 + class88.field1314;
        } else {
            return " " + class88.method2738(16776960) + var1 + class88.field1314;
        }
    }

    @ObfuscatedName("client.is(ZB)V")
    public final void method1124(boolean arg0) {
        int var2 = field1010;
        int var3 = Statics.field1842;
        int var4 = Statics.field1324;
        if (class224.method1621(var2)) {
            method2826(Statics.field3299[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.ij(Lhk;I)V")
    public void method1128(class224 arg0) {
        class224 var2 = arg0.field2746 == -1 ? null : class224.method1468(arg0.field2746);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1842;
            var4 = Statics.field1324;
        } else {
            var3 = var2.field2742;
            var4 = var2.field2775;
        }
        method2784(arg0, var3, var4, false);
        method96(arg0, var3, var4);
    }

    @ObfuscatedName("d.in([Lhk;Lhk;ZI)V")
    public static void method169(class224[] arg0, class224 arg1, boolean arg2) {
        int var3 = arg1.field2823 == 0 ? arg1.field2742 : arg1.field2823;
        int var4 = arg1.field2751 == 0 ? arg1.field2775 : arg1.field2751;
        method2826(arg0, arg1.field2764, var3, var4, arg2);
        if (arg1.field2856 != null) {
            method2826(arg1.field2856, arg1.field2764, var3, var4, arg2);
        }
        class68 var5 = (class68) field1026.method3444((long) arg1.field2764);
        if (var5 != null) {
            int var6 = var5.field781;
            if (class224.method1621(var6)) {
                method2826(Statics.field3299[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2840 == 1337) {
        }
    }

    @ObfuscatedName("ff.id([Lhk;IIIZB)V")
    public static void method2826(class224[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class224 var6 = arg0[var5];
            if (var6 != null && var6.field2746 == arg1) {
                method2784(var6, arg2, arg3, arg4);
                method96(var6, arg2, arg3);
                if (var6.field2748 > var6.field2823 - var6.field2742) {
                    var6.field2748 = var6.field2823 - var6.field2742;
                }
                if (var6.field2748 < 0) {
                    var6.field2748 = 0;
                }
                if (var6.field2749 > var6.field2751 - var6.field2775) {
                    var6.field2749 = var6.field2751 - var6.field2775;
                }
                if (var6.field2749 < 0) {
                    var6.field2749 = 0;
                }
                if (var6.field2809 == 0) {
                    method169(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("em.ig(Lhk;IIZI)V")
    public static void method2784(class224 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2742;
        int var5 = arg0.field2775;
        if (arg0.field2835 == 0) {
            arg0.field2742 = arg0.field2726;
        } else if (arg0.field2835 == 1) {
            arg0.field2742 = arg1 - arg0.field2726;
        } else if (arg0.field2835 == 2) {
            arg0.field2742 = arg0.field2726 * arg1 >> 14;
        }
        if (arg0.field2735 == 0) {
            arg0.field2775 = arg0.field2739;
        } else if (arg0.field2735 == 1) {
            arg0.field2775 = arg2 - arg0.field2739;
        } else if (arg0.field2735 == 2) {
            arg0.field2775 = arg0.field2739 * arg2 >> 14;
        }
        if (arg0.field2835 == 4) {
            arg0.field2742 = arg0.field2803 * arg0.field2775 / arg0.field2745;
        }
        if (arg0.field2735 == 4) {
            arg0.field2775 = arg0.field2745 * arg0.field2742 / arg0.field2803;
        }
        if (field1082 && arg0.field2809 == 0) {
            if (arg0.field2775 < 5 && arg0.field2742 < 5) {
                arg0.field2775 = 5;
                arg0.field2742 = 5;
            } else {
                if (arg0.field2775 <= 0) {
                    arg0.field2775 = 5;
                }
                if (arg0.field2742 <= 0) {
                    arg0.field2742 = 5;
                }
            }
        }
        if (arg0.field2840 == 1337) {
            field924 = arg0;
        }
        if (arg3 && arg0.field2836 != null && (arg0.field2742 != var4 || arg0.field2775 != var5)) {
            class69 var6 = new class69();
            var6.field795 = arg0;
            var6.field792 = arg0.field2836;
            field1049.method3480(var6);
        }
    }

    @ObfuscatedName("t.ii(Lhk;III)V")
    public static void method96(class224 arg0, int arg1, int arg2) {
        if (arg0.field2732 == 0) {
            arg0.field2740 = arg0.field2818;
        } else if (arg0.field2732 == 1) {
            arg0.field2740 = (arg1 - arg0.field2742) / 2 + arg0.field2818;
        } else if (arg0.field2732 == 2) {
            arg0.field2740 = arg1 - arg0.field2742 - arg0.field2818;
        } else if (arg0.field2732 == 3) {
            arg0.field2740 = arg0.field2818 * arg1 >> 14;
        } else if (arg0.field2732 == 4) {
            arg0.field2740 = (arg0.field2818 * arg1 >> 14) + (arg1 - arg0.field2742) / 2;
        } else {
            arg0.field2740 = arg1 - arg0.field2742 - (arg0.field2818 * arg1 >> 14);
        }
        if (arg0.field2733 == 0) {
            arg0.field2741 = arg0.field2758;
        } else if (arg0.field2733 == 1) {
            arg0.field2741 = (arg2 - arg0.field2775) / 2 + arg0.field2758;
        } else if (arg0.field2733 == 2) {
            arg0.field2741 = arg2 - arg0.field2775 - arg0.field2758;
        } else if (arg0.field2733 == 3) {
            arg0.field2741 = arg0.field2758 * arg2 >> 14;
        } else if (arg0.field2733 == 4) {
            arg0.field2741 = (arg0.field2758 * arg2 >> 14) + (arg2 - arg0.field2775) / 2;
        } else {
            arg0.field2741 = arg2 - arg0.field2775 - (arg0.field2758 * arg2 >> 14);
        }
        if (!field1082 || arg0.field2809 != 0) {
            return;
        }
        if (arg0.field2740 < 0) {
            arg0.field2740 = 0;
        } else if (arg0.field2742 + arg0.field2740 > arg1) {
            arg0.field2740 = arg1 - arg0.field2742;
        }
        if (arg0.field2741 < 0) {
            arg0.field2741 = 0;
        } else if (arg0.field2775 + arg0.field2741 > arg2) {
            arg0.field2741 = arg2 - arg0.field2775;
        }
    }

    @ObfuscatedName("aw.iu(IIIIIB)V")
    public static final void method576(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field628[0].method4860(arg0, arg1);
        Statics.field628[1].method4860(arg0, arg1 + arg3 - 16);
        class291.method4776(arg0, arg1 + 16, 16, arg3 - 32, field915);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class291.method4776(arg0, arg1 + 16 + var6, 16, var5, field928);
        class291.method4807(arg0, arg1 + 16 + var6, var5, field930);
        class291.method4807(arg0 + 1, arg1 + 16 + var6, var5, field930);
        class291.method4855(arg0, arg1 + 16 + var6, 16, field930);
        class291.method4855(arg0, arg1 + 17 + var6, 16, field930);
        class291.method4807(arg0 + 15, arg1 + 16 + var6, var5, field929);
        class291.method4807(arg0 + 14, arg1 + 17 + var6, var5 - 1, field929);
        class291.method4855(arg0, arg1 + 15 + var6 + var5, 16, field929);
        class291.method4855(arg0 + 1, arg1 + 14 + var6 + var5, 15, field929);
    }

    @ObfuscatedName("cl.ik(IB)Ljava/lang/String;")
    public static final String method1741(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("fj.ih(Lhk;B)Z")
    public static final boolean method2910(class224 arg0) {
        if (arg0.field2792 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2792.length; var1++) {
            int var2 = method63(arg0, var1);
            int var3 = arg0.field2717[var1];
            if (arg0.field2792[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2792[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2792[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("y.iy(Lhk;IB)I")
    public static final int method63(class224 arg0, int arg1) {
        if (arg0.field2839 == null || arg1 >= arg0.field2839.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2839[arg1];
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
                    var7 = field896[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field985[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field986[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class224 var11 = class224.method1468(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class264.method4124(var12).field3564 || field874)) {
                        for (int var13 = 0; var13 < var11.field2845.length; var13++) {
                            if (var12 + 1 == var11.field2845[var13]) {
                                var7 += var11.field2846[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class219.field2689[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class230.field2910[field985[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class219.field2689[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field601.field836;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class230.field2909[var14]) {
                            var7 += field985[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class224 var17 = class224.method1468(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class264.method4124(var18).field3564 || field874)) {
                        for (int var19 = 0; var19 < var17.field2845.length; var19++) {
                            if (var18 + 1 == var17.field2845[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field963;
                }
                if (var6 == 12) {
                    var7 = field1075;
                }
                if (var6 == 13) {
                    int var20 = class219.field2689[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class219.method1684(var22);
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
                    var7 = (Statics.field601.field1188 >> 7) + Statics.field1709;
                }
                if (var6 == 19) {
                    var7 = (Statics.field601.field1145 >> 7) + Statics.field1710;
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

    @ObfuscatedName("an.ix(Lhk;Ljx;IIZB)V")
    public static final void method505(class224 arg0, class264 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3565;
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
            var7 = class233.field2925;
        }
        if (var6 != -1 && var7 != null) {
            method3324(var7, class88.method2738(16748608) + arg1.field3551, var6, arg1.field3549, arg2, arg0.field2764, arg4);
        }
    }

    @ObfuscatedName("bn.ic(IIIIIIIB)V")
    public static final void method934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class224.method1621(arg0)) {
            Statics.method1026(Statics.field3299[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ep.if(Lhk;IIB)V")
    public static final void method2377(class224 arg0, int arg1, int arg2) {
        if (field1023 != null || field988 || arg0 == null) {
            return;
        }
        class224 var3 = arg0;
        int var4 = method1528(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class224 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = class224.method1468(var3.field2746);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class224 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2828;
        }
        if (var9 == null) {
            return;
        }
        field1023 = arg0;
        class224 var11 = arg0;
        int var12 = method1528(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class224 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = class224.method1468(var11.field2746);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class224 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2828;
        }
        field1024 = var17;
        field1025 = arg1;
        field1088 = arg2;
        Statics.field226 = 0;
        field1064 = false;
        int var19 = field989 - 1;
        if (var19 != -1) {
            method743(var19);
        }
        return;
    }

    @ObfuscatedName("client.ie(B)V")
    public final void method1126() {
        method353(field1023);
        Statics.field226++;
        if (field1069 && field1028) {
            int var1 = class60.field705;
            int var2 = class60.field709;
            int var3 = var1 - field1025;
            int var4 = var2 - field1088;
            if (var3 < field1029) {
                var3 = field1029;
            }
            if (field1023.field2742 + var3 > field1029 + field1024.field2742) {
                var3 = field1029 + field1024.field2742 - field1023.field2742;
            }
            if (var4 < field881) {
                var4 = field881;
            }
            if (field1023.field2775 + var4 > field881 + field1024.field2775) {
                var4 = field881 + field1024.field2775 - field1023.field2775;
            }
            int var5 = var3 - field1032;
            int var6 = var4 - field1033;
            int var7 = field1023.field2790;
            if (Statics.field226 > field1023.field2804 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1064 = true;
            }
            int var8 = field1024.field2748 + (var3 - field1029);
            int var9 = field1024.field2749 + (var4 - field881);
            if (field1023.field2817 != null && field1064) {
                class69 var10 = new class69();
                var10.field795 = field1023;
                var10.field788 = var8;
                var10.field789 = var9;
                var10.field792 = field1023.field2817;
                class83.method1986(var10);
            }
            if (class60.field707 == 0) {
                if (field1064) {
                    if (field1023.field2744 != null) {
                        class69 var11 = new class69();
                        var11.field795 = field1023;
                        var11.field788 = var8;
                        var11.field789 = var9;
                        var11.field791 = field1042;
                        var11.field792 = field1023.field2744;
                        class83.method1986(var11);
                    }
                    if (field1042 != null) {
                        class224 var12 = field1023;
                        int var13 = method1528(var12);
                        int var14 = var13 >> 17 & 0x7;
                        int var15 = var14;
                        class224 var16;
                        if (var14 == 0) {
                            var16 = null;
                        } else {
                            int var17 = 0;
                            while (true) {
                                if (var17 >= var15) {
                                    var16 = var12;
                                    break;
                                }
                                var12 = class224.method1468(var12.field2746);
                                if (var12 == null) {
                                    var16 = null;
                                    break;
                                }
                                var17++;
                            }
                        }
                        if (var16 != null) {
                            class171 var18 = class171.method1482(class168.field2331, field953.field1479);
                            var18.field2424.method3046(field1042.field2829);
                            var18.field2424.method3022(field1042.field2764);
                            var18.field2424.method3097(field1023.field2829);
                            var18.field2424.method3046(field1042.field2728);
                            var18.field2424.method2999(field1023.field2764);
                            var18.field2424.method3097(field1023.field2728);
                            field953.method1783(var18);
                        }
                    }
                } else if (this.method1122()) {
                    this.method1387(field1032 + field1025, field1088 + field1033);
                } else if (field989 > 0) {
                    int var19 = field1032 + field1025;
                    int var20 = field1088 + field1033;
                    class89 var21 = Statics.field556;
                    method1049(var21.field1321, var21.field1317, var21.field1318, var21.field1319, var21.field1320, var21.field1320, var19, var20);
                    Statics.field556 = null;
                }
                field1023 = null;
            }
        } else if (Statics.field226 > 1) {
            field1023 = null;
        }
    }

    @ObfuscatedName("bo.io(IB)V")
    public static void method743(int arg0) {
        Statics.field556 = new class89();
        Statics.field556.field1321 = field990[arg0];
        Statics.field556.field1317 = field991[arg0];
        Statics.field556.field1318 = field876[arg0];
        Statics.field556.field1319 = field993[arg0];
        Statics.field556.field1320 = field994[arg0];
    }

    @ObfuscatedName("ap.iv(Lhk;I)V")
    public static void method353(class224 arg0) {
        if (field1011 == arg0.field2859) {
            field1056[arg0.field2777] = true;
        }
    }

    @ObfuscatedName("at.iw(I)V")
    public static void method501() {
        for (class68 var0 = (class68) field1026.method3433(); var0 != null; var0 = (class68) field1026.method3440()) {
            int var1 = var0.field781;
            if (class224.method1621(var1)) {
                boolean var2 = true;
                class224[] var3 = Statics.field3299[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2857;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2563;
                    class224 var6 = class224.method1468(var5);
                    if (var6 != null) {
                        method353(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("br.ir([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1030(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("hd.iz(IB)V")
    public static final void method3791(int arg0) {
        if (!class224.method1621(arg0)) {
            return;
        }
        class224[] var1 = Statics.field3299[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class224 var3 = var1[var2];
            if (var3 != null) {
                var3.field2738 = 0;
                var3.field2850 = 0;
            }
        }
    }

    @ObfuscatedName("y.il([Lhk;II)V")
    public static final void method61(class224[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class224 var3 = arg0[var2];
            if (var3 != null && var3.field2746 == arg1 && (!var3.field2857 || !method4263(var3))) {
                if (var3.field2809 == 0) {
                    if (!var3.field2857 && method4263(var3) && Statics.field752 != var3) {
                        continue;
                    }
                    method61(arg0, var3.field2764);
                    if (var3.field2856 != null) {
                        method61(var3.field2856, var3.field2764);
                    }
                    class68 var4 = (class68) field1026.method3444((long) var3.field2764);
                    if (var4 != null) {
                        int var5 = var4.field781;
                        if (class224.method1621(var5)) {
                            method61(Statics.field3299[var5], -1);
                        }
                    }
                }
                if (var3.field2809 == 6) {
                    if (var3.field2774 != -1 || var3.field2807 != -1) {
                        boolean var6 = method2910(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2807;
                        } else {
                            var7 = var3.field2774;
                        }
                        if (var7 != -1) {
                            class268 var8 = class268.method2289(var7);
                            var3.field2850 += field926;
                            while (var3.field2850 > var8.field3662[var3.field2738]) {
                                var3.field2850 -= var8.field3662[var3.field2738];
                                var3.field2738++;
                                if (var3.field2738 >= var8.field3660.length) {
                                    var3.field2738 -= var8.field3664;
                                    if (var3.field2738 < 0 || var3.field2738 >= var8.field3660.length) {
                                        var3.field2738 = 0;
                                    }
                                }
                                method353(var3);
                            }
                        }
                    }
                    if (var3.field2783 != 0 && !var3.field2857) {
                        int var9 = var3.field2783 >> 16;
                        int var10 = var3.field2783 << 16 >> 16;
                        int var11 = field926 * var9;
                        int var12 = field926 * var10;
                        var3.field2855 = var3.field2855 + var11 & 0x7FF;
                        var3.field2779 = var3.field2779 + var12 & 0x7FF;
                        method353(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cq.ib(II)V")
    public static final void method1766(int arg0) {
        method501();
        for (class82 var1 = (class82) class82.field1251.method3486(); var1 != null; var1 = (class82) class82.field1251.method3507()) {
            if (var1.field1252 != null) {
                var1.method1543();
            }
        }
        int var2 = class249.method1109(arg0).field3344;
        if (var2 == 0) {
            return;
        }
        int var3 = class219.field2689[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class136.method2534(0.9D);
                ((class125) Statics.field1956).method2280(0.9D);
            }
            if (var3 == 2) {
                class136.method2534(0.8D);
                ((class125) Statics.field1956).method2280(0.8D);
            }
            if (var3 == 3) {
                class136.method2534(0.7D);
                ((class125) Statics.field1956).method2280(0.7D);
            }
            if (var3 == 4) {
                class136.method2534(0.6D);
                ((class125) Statics.field1956).method2280(0.6D);
            }
            class264.field3540.method3423();
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
            if (field1060 != var4) {
                if (field1060 == 0 && field1027 != -1) {
                    class211.method3245(Statics.field334, field1027, 0, var4, false);
                    field1089 = false;
                } else if (var4 == 0) {
                    class211.method2290();
                    field1089 = false;
                } else if (class211.field2595 == 0) {
                    Statics.field2597.method3566(var4);
                } else {
                    Statics.field486 = var4;
                }
                field1060 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field1090 = 127;
            }
            if (var3 == 1) {
                field1090 = 96;
            }
            if (var3 == 2) {
                field1090 = 64;
            }
            if (var3 == 3) {
                field1090 = 32;
            }
            if (var3 == 4) {
                field1090 = 0;
            }
        }
        if (var2 == 5) {
            field987 = var3;
        }
        if (var2 == 6) {
            field1012 = var3;
        }
        if (var2 == 9) {
            field1120 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field1068 = 127;
            }
            if (var3 == 1) {
                field1068 = 96;
            }
            if (var3 == 2) {
                field1068 = 64;
            }
            if (var3 == 3) {
                field1068 = 32;
            }
            if (var3 == 4) {
                field1068 = 0;
            }
        }
        if (var2 == 17) {
            field879 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class91[] var5 = new class91[] { class91.field1328, class91.field1327, class91.field1326, class91.field1329 };
            field923 = (class91) class176.method676(var5, var3);
            if (field923 == null) {
                field923 = class91.field1329;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field979 = -1;
            } else {
                field979 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class91[] var6 = new class91[] { class91.field1328, class91.field1327, class91.field1326, class91.field1329 };
        field942 = (class91) class176.method676(var6, var3);
        if (field942 == null) {
            field942 = class91.field1329;
        }
    }

    @ObfuscatedName("i.iq(IIIB)Lbp;")
    public static final class68 method4(int arg0, int arg1, int arg2) {
        class68 var3 = new class68();
        var3.field781 = arg1;
        var3.field784 = arg2;
        field1026.method3431(var3, (long) arg0);
        method3791(arg1);
        class224 var4 = class224.method1468(arg0);
        method353(var4);
        if (field1014 != null) {
            method353(field1014);
            field1014 = null;
        }
        method2935();
        method169(Statics.field3299[arg0 >> 16], var4, false);
        class83.method257(arg1);
        if (field1010 != -1) {
            int var5 = field1010;
            if (class224.method1621(var5)) {
                Statics.method2822(Statics.field3299[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("ez.im(Lbp;ZI)V")
    public static final void method2748(class68 arg0, boolean arg1) {
        int var2 = arg0.field781;
        int var3 = (int) arg0.field2563;
        arg0.method3476();
        if (arg1 && var2 != -1 && Statics.field243[var2]) {
            Statics.field575.method3943(var2);
            if (Statics.field3299[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field3299[var2].length; var5++) {
                    if (Statics.field3299[var2][var5] != null) {
                        if (Statics.field3299[var2][var5].field2809 == 2) {
                            var4 = false;
                        } else {
                            Statics.field3299[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field3299[var2] = null;
                }
                Statics.field243[var2] = false;
            }
        }
        for (class206 var6 = (class206) field902.method3433(); var6 != null; var6 = (class206) field902.method3440()) {
            if ((long) var2 == (var6.field2563 >> 48 & 0xFFFFL)) {
                var6.method3476();
            }
        }
        class224 var7 = class224.method1468(var3);
        if (var7 != null) {
            method353(var7);
        }
        method2935();
        if (field1010 != -1) {
            int var8 = field1010;
            if (class224.method1621(var8)) {
                Statics.method2822(Statics.field3299[var8], 1);
            }
        }
    }

    @ObfuscatedName("bg.jz(Lhk;S)Z")
    public static final boolean method1048(class224 arg0) {
        int var1 = arg0.field2840;
        if (var1 == 205) {
            field913 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1123.method3811(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1123.method3788(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1123.method3795(false);
        }
        if (var1 == 325) {
            field1123.method3795(true);
        }
        if (var1 == 326) {
            class171 var6 = class171.method1482(class168.field2385, field953.field1479);
            field1123.method3819(var6.field2424);
            field953.method1783(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("a.jb(Lhk;IIIB)V")
    public static final void method52(class224 arg0, int arg1, int arg2, int arg3) {
        method1645();
        class218 var4 = arg0.method3859(false);
        if (var4 == null) {
            return;
        }
        class291.method4833(arg1, arg2, var4.field2684 + arg1, var4.field2681 + arg2);
        if (field1086 == 2 || field1086 == 5) {
            class291.method4790(arg1, arg2, 0, var4.field2682, var4.field2683);
        } else {
            int var5 = field934 & 0x7FF;
            int var6 = Statics.field601.field1188 / 32 + 48;
            int var7 = 464 - Statics.field601.field1145 / 32;
            Statics.field508.method4903(arg1, arg2, var4.field2684, var4.field2681, var6, var7, var5, 256, var4.field2682, var4.field2683);
            for (int var8 = 0; var8 < field1080; var8++) {
                int var9 = field1121[var8] * 4 + 2 - Statics.field601.field1188 / 32;
                int var10 = field970[var8] * 4 + 2 - Statics.field601.field1145 / 32;
                method773(arg1, arg2, var9, var10, field1083[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class201 var13 = field887[Statics.field801][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field601.field1188 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field601.field1145 / 32;
                        method773(arg1, arg2, var14, var15, Statics.field242[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field1016; var16++) {
                class86 var17 = field907[field909[var16]];
                if (var17 != null && var17.method1073()) {
                    class266 var18 = var17.field1293;
                    if (var18 != null && var18.field3634 != null) {
                        var18 = var18.method4481();
                    }
                    if (var18 != null && var18.field3625 && var18.field3615) {
                        int var19 = var17.field1188 / 32 - Statics.field601.field1188 / 32;
                        int var20 = var17.field1145 / 32 - Statics.field601.field1145 / 32;
                        method773(arg1, arg2, var19, var20, Statics.field242[1], var4);
                    }
                }
            }
            int var21 = class95.field1406;
            int[] var22 = class95.field1407;
            for (int var23 = 0; var23 < var21; var23++) {
                class74 var24 = field1113[var22[var23]];
                if (var24 != null && var24.method1073() && !var24.field845 && Statics.field601 != var24) {
                    int var25 = var24.field1188 / 32 - Statics.field601.field1188 / 32;
                    int var26 = var24.field1145 / 32 - Statics.field601.field1145 / 32;
                    boolean var27 = false;
                    if (method1463(var24.field852, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field927; var29++) {
                        if (var24.field852.equals(Statics.field1456[var29].field862)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field601.field851 != 0 && var24.field851 != 0 && Statics.field601.field851 == var24.field851) {
                        var30 = true;
                    }
                    if (var27) {
                        method773(arg1, arg2, var25, var26, Statics.field242[3], var4);
                    } else if (var30) {
                        method773(arg1, arg2, var25, var26, Statics.field242[4], var4);
                    } else if (var28) {
                        method773(arg1, arg2, var25, var26, Statics.field242[5], var4);
                    } else {
                        method773(arg1, arg2, var25, var26, Statics.field242[2], var4);
                    }
                }
            }
            if (field917 != 0 && field1054 % 20 < 10) {
                if (field917 == 1 && field888 >= 0 && field888 < field907.length) {
                    class86 var31 = field907[field888];
                    if (var31 != null) {
                        int var32 = var31.field1188 / 32 - Statics.field601.field1188 / 32;
                        int var33 = var31.field1145 / 32 - Statics.field601.field1145 / 32;
                        method1763(arg1, arg2, var32, var33, Statics.field802[1], var4);
                    }
                }
                if (field917 == 2) {
                    int var34 = field890 * 4 - Statics.field1709 * 4 + 2 - Statics.field601.field1188 / 32;
                    int var35 = field891 * 4 - Statics.field1710 * 4 + 2 - Statics.field601.field1145 / 32;
                    method1763(arg1, arg2, var34, var35, Statics.field802[1], var4);
                }
                if (field917 == 10 && field889 >= 0 && field889 < field1113.length) {
                    class74 var36 = field1113[field889];
                    if (var36 != null) {
                        int var37 = var36.field1188 / 32 - Statics.field601.field1188 / 32;
                        int var38 = var36.field1145 / 32 - Statics.field601.field1145 / 32;
                        method1763(arg1, arg2, var37, var38, Statics.field802[1], var4);
                    }
                }
            }
            if (field1084 != 0) {
                int var39 = field1084 * 4 + 2 - Statics.field601.field1188 / 32;
                int var40 = field1085 * 4 + 2 - Statics.field601.field1145 / 32;
                method773(arg1, arg2, var39, var40, Statics.field802[0], var4);
            }
            if (!Statics.field601.field845) {
                class291.method4776(var4.field2684 / 2 + arg1 - 1, var4.field2681 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field1057[arg3] = true;
    }

    @ObfuscatedName("ai.jj(Lhk;IIII)V")
    public static final void method599(class224 arg0, int arg1, int arg2, int arg3) {
        class218 var4 = arg0.method3859(false);
        if (var4 == null) {
            return;
        }
        if (field1086 < 3) {
            Statics.field21.method4903(arg1, arg2, var4.field2684, var4.field2681, 25, 25, field934, 256, var4.field2682, var4.field2683);
        } else {
            class291.method4790(arg1, arg2, 0, var4.field2682, var4.field2683);
        }
    }

    @ObfuscatedName("cw.jx(IIIILkd;Lhm;I)V")
    public static final void method1763(int arg0, int arg1, int arg2, int arg3, class295 arg4, class218 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method773(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field934 & 0x7FF;
        int var8 = class136.field1947[var7];
        int var9 = class136.field1953[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2684 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field485.method4979(arg5.field2684 / 2 + arg0 - var17 / 2 + var15, arg5.field2681 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("bw.ju(IIIILkd;Lhm;I)V")
    public static final void method773(int arg0, int arg1, int arg2, int arg3, class295 arg4, class218 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field934 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class136.field1947[var6];
        int var9 = class136.field1953[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method4902(arg5.field2684 / 2 + var10 - arg4.field3844 / 2, arg5.field2681 / 2 - var11 - arg4.field3845 / 2, arg0, arg1, arg5.field2684, arg5.field2681, arg5.field2682, arg5.field2683);
        } else {
            arg4.method4892(arg5.field2684 / 2 + arg0 + var10 - arg4.field3844 / 2, arg5.field2681 / 2 + arg1 - var11 - arg4.field3845 / 2);
        }
    }

    @ObfuscatedName("client.jc(Ljava/lang/String;ZB)Z")
    public static boolean method1463(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class275.method3310(arg0, Statics.field719);
        for (int var3 = 0; var3 < field1117; var3++) {
            if (var2.equalsIgnoreCase(class275.method3310(field1004[var3].field773, Statics.field719)) && (!arg1 || field1004[var3].field774 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class275.method3310(Statics.field601.field852, Statics.field719))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ep.jy(Ljava/lang/String;B)Z")
    public static boolean method2378(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class275.method3310(arg0, Statics.field719);
        for (int var2 = 0; var2 < field1018; var2++) {
            class70 var3 = field1122[var2];
            if (var1.equalsIgnoreCase(class275.method3310(var3.field799, Statics.field719))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class275.method3310(var3.field803, Statics.field719))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ak.jf(Ljava/lang/String;ZB)V")
    public static final void method493(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field1018 < 100 || field972 == 1) || field1018 >= 400) {
            class97.method1752(31, "", class233.field3091);
            return;
        }
        String var2 = class275.method3310(arg0, Statics.field719);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field1018; var3++) {
            class70 var4 = field1122[var3];
            String var5 = class275.method3310(var4.field799, Statics.field719);
            if (var5 != null && var5.equals(var2)) {
                class97.method1752(31, "", arg0 + class233.field3024);
                return;
            }
            if (var4.field803 != null) {
                String var6 = class275.method3310(var4.field803, Statics.field719);
                if (var6 != null && var6.equals(var2)) {
                    class97.method1752(31, "", arg0 + class233.field3024);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field1117; var7++) {
            class66 var8 = field1004[var7];
            String var9 = class275.method3310(var8.field773, Statics.field719);
            if (var9 != null && var9.equals(var2)) {
                class97.method1752(31, "", class233.field3171 + arg0 + class233.field3098);
                return;
            }
            if (var8.field768 != null) {
                String var10 = class275.method3310(var8.field768, Statics.field719);
                if (var10 != null && var10.equals(var2)) {
                    class97.method1752(31, "", class233.field3171 + arg0 + class233.field3098);
                    return;
                }
            }
        }
        if (class275.method3310(Statics.field601.field852, Statics.field719).equals(var2)) {
            class97.method1752(31, "", class233.field2923);
        } else {
            class171 var11 = class171.method1482(class168.field2347, field953.field1479);
            var11.field2424.method2996(class181.method1683(arg0));
            var11.field2424.method3003(arg0);
            field953.method1783(var11);
        }
    }

    @ObfuscatedName("u.jd(Ljava/lang/String;I)V")
    public static final void method133(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class275.method3310(arg0, Statics.field719);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field1018; var2++) {
            class70 var3 = field1122[var2];
            String var4 = var3.field799;
            String var5 = class275.method3310(var4, Statics.field719);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field1018--;
                for (int var7 = var2; var7 < field1018; var7++) {
                    field1122[var7] = field1122[var7 + 1];
                }
                field1043 = field1101;
                class171 var8 = class171.method1482(class168.field2392, field953.field1479);
                var8.field2424.method2996(class181.method1683(arg0));
                var8.field2424.method3003(arg0);
                field953.method1783(var8);
                break;
            }
        }
    }

    @ObfuscatedName("b.jp(Ljava/lang/String;I)V")
    public static final void method41(String arg0) {
        if (Statics.field1456 != null) {
            class171 var1 = class171.method1482(class168.field2382, field953.field1479);
            var1.field2424.method2996(class181.method1683(arg0));
            var1.field2424.method3003(arg0);
            field953.method1783(var1);
        }
    }

    @ObfuscatedName("r.jt(Ljava/lang/String;I)V")
    public static final void method147(String arg0) {
        if (!arg0.equals("")) {
            class171 var1 = class171.method1482(class168.field2377, field953.field1479);
            var1.field2424.method2996(class181.method1683(arg0));
            var1.field2424.method3003(arg0);
            field953.method1783(var1);
        }
    }

    @ObfuscatedName("cu.jg(B)V")
    public static final void method1739() {
        class171 var0 = class171.method1482(class168.field2377, field953.field1479);
        var0.field2424.method2996(0);
        field953.method1783(var0);
    }

    @ObfuscatedName("ca.ji(Lhk;B)I")
    public static int method1528(class224 arg0) {
        class206 var1 = (class206) field902.method3444(((long) arg0.field2764 << 32) + (long) arg0.field2728);
        return var1 == null ? arg0.field2729 : var1.field2577;
    }

    @ObfuscatedName("iq.jr(Lhk;B)Z")
    public static boolean method4263(class224 arg0) {
        if (field1082) {
            if (method1528(arg0) != 0) {
                return false;
            }
            if (arg0.field2809 == 0) {
                return false;
            }
        }
        return arg0.field2747;
    }

    @ObfuscatedName("ff.jm(Lhk;I)Ljava/lang/String;")
    public static String method2827(class224 arg0) {
        if (class225.method1601(method1528(arg0)) == 0) {
            return null;
        } else if (arg0.field2806 == null || arg0.field2806.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2806;
        }
    }

    @ObfuscatedName("f.jv(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method188(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field873 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field873 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field873 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field873 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field873 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field512 != null) {
            var3 = "/p=" + Statics.field512;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field1061 + "/a=" + Statics.field481 + var3 + "/";
    }

    @ObfuscatedName("w.jh(Ljava/lang/String;I)V")
    public static void method71(String arg0) {
        Statics.field512 = arg0;
        try {
            String var1 = Statics.field247.getParameter(class283.field3771.field3774);
            String var2 = Statics.field247.getParameter(class283.field3763.field3774);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class190.method678(class183.method4541() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field247;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("z.je(Ljava/lang/String;ZI)V")
    public static void method162(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3544; var5++) {
            class264 var6 = class264.method4124(var5);
            if ((!arg1 || var6.field3591) && var6.field3588 == -1 && var6.field3551.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field552 = -1;
                    Statics.field636 = null;
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
        Statics.field636 = var3;
        Statics.field844 = 0;
        Statics.field552 = var4;
        String[] var9 = new String[Statics.field552];
        for (int var10 = 0; var10 < Statics.field552; var10++) {
            var9[var10] = class264.method4124(var3[var10]).field3551;
        }
        class178.method182(var9, Statics.field636);
    }

    @ObfuscatedName("hj.jo(Lfv;B)V")
    public static void method3739(class181 arg0) {
        if (field1041 != null) {
            arg0.method3006(field1041, 0, field1041.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class157.field2161.method2211(0L);
            class157.field2161.method2236(var1);
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
        arg0.method3006(var1, 0, var1.length);
    }

    @ObfuscatedName("ai.js(I)Z")
    public static boolean method594() {
        return field1017 >= 2;
    }
}
