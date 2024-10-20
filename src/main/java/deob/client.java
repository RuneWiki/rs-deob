package deob;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class60 implements class303 {

    @ObfuscatedName("client.w")
    public static class177[] field893 = new class177[4];

    @ObfuscatedName("client.ay")
    public static boolean field1046 = true;

    @ObfuscatedName("client.bm")
    public static int field871 = 1;

    @ObfuscatedName("client.bx")
    public static int field935 = 0;

    @ObfuscatedName("client.bf")
    public static int field873 = 0;

    @ObfuscatedName("client.bu")
    public static boolean field874 = false;

    @ObfuscatedName("client.br")
    public static boolean field875 = false;

    @ObfuscatedName("client.bk")
    public static int field980 = 0;

    @ObfuscatedName("client.be")
    public static int field878 = -1;

    @ObfuscatedName("client.bq")
    public static boolean field879 = false;

    @ObfuscatedName("client.bh")
    public static int field880 = 0;

    @ObfuscatedName("client.bt")
    public static boolean field881 = true;

    @ObfuscatedName("client.bi")
    public static int field929 = 0;

    @ObfuscatedName("client.bc")
    public static long field1107 = 1L;

    @ObfuscatedName("client.by")
    public static int field884 = -1;

    @ObfuscatedName("client.bz")
    public static int field1114 = -1;

    @ObfuscatedName("client.bw")
    public static int field886 = -1;

    @ObfuscatedName("client.bb")
    public static boolean field887 = true;

    @ObfuscatedName("client.ba")
    public static boolean field888 = false;

    @ObfuscatedName("client.bd")
    public static int field889 = 0;

    @ObfuscatedName("client.bg")
    public static int field890 = 0;

    @ObfuscatedName("client.cd")
    public static int field1037 = 0;

    @ObfuscatedName("client.cf")
    public static int field892 = 0;

    @ObfuscatedName("client.ce")
    public static int field1033 = 0;

    @ObfuscatedName("client.cl")
    public static int field1014 = 0;

    @ObfuscatedName("client.cg")
    public static int field1010 = 0;

    @ObfuscatedName("client.cb")
    public static int field896 = 0;

    @ObfuscatedName("client.cv")
    public static int field897 = 0;

    @ObfuscatedName("client.cu")
    public static class90 field998 = class90.field1352;

    @ObfuscatedName("client.cm")
    public static class90 field1011 = class90.field1352;

    @ObfuscatedName("client.ci")
    public static int field900 = 0;

    @ObfuscatedName("client.cc")
    public static int field901 = 0;

    @ObfuscatedName("client.ca")
    public static int field1047 = 0;

    @ObfuscatedName("client.dv")
    public static int field903 = 0;

    @ObfuscatedName("client.ds")
    public static int field904 = 0;

    @ObfuscatedName("client.dq")
    public static int field984 = 0;

    @ObfuscatedName("client.da")
    public static int field906 = 0;

    @ObfuscatedName("client.dh")
    public static int field907 = 0;

    @ObfuscatedName("client.dd")
    public static class159 field908 = class159.field2173;

    @ObfuscatedName("client.db")
    public static byte[] field909 = null;

    @ObfuscatedName("client.dn")
    public static class85[] field910 = new class85[32768];

    @ObfuscatedName("client.dz")
    public static int field1131 = 0;

    @ObfuscatedName("client.dj")
    public static int[] field966 = new int[32768];

    @ObfuscatedName("client.ej")
    public static int field1038 = 0;

    @ObfuscatedName("client.ei")
    public static int[] field891 = new int[250];

    @ObfuscatedName("client.ez")
    public static final class100 field958 = new class100();

    @ObfuscatedName("client.eo")
    public static int field916 = 0;

    @ObfuscatedName("client.el")
    public static boolean field917 = false;

    @ObfuscatedName("client.ex")
    public static boolean field918 = true;

    @ObfuscatedName("client.ed")
    public static class295 field919 = new class295();

    @ObfuscatedName("client.es")
    public static HashMap field905 = new HashMap();

    @ObfuscatedName("client.eh")
    public static int field921 = 0;

    @ObfuscatedName("client.ec")
    public static int field922 = 1;

    @ObfuscatedName("client.eu")
    public static int field923 = 0;

    @ObfuscatedName("client.eg")
    public static int field924 = 1;

    @ObfuscatedName("client.fc")
    public static int field925 = 0;

    @ObfuscatedName("client.fn")
    public static boolean field928 = false;

    @ObfuscatedName("client.fo")
    public static int[][][] field911 = new int[4][13][13];

    @ObfuscatedName("client.fe")
    public static final int[] field930 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fd")
    public static int field931 = 0;

    @ObfuscatedName("client.fl")
    public static int field933 = 2301979;

    @ObfuscatedName("client.ga")
    public static int field934 = 5063219;

    @ObfuscatedName("client.gj")
    public static int field870 = 3353893;

    @ObfuscatedName("client.gh")
    public static int field876 = 7759444;

    @ObfuscatedName("client.gq")
    public static boolean field937 = false;

    @ObfuscatedName("client.gk")
    public static int field920 = 0;

    @ObfuscatedName("client.gc")
    public static int field939 = 128;

    @ObfuscatedName("client.gu")
    public static int field1044 = 0;

    @ObfuscatedName("client.gn")
    public static int field941 = 0;

    @ObfuscatedName("client.gb")
    public static int field942 = 0;

    @ObfuscatedName("client.gl")
    public static int field898 = 0;

    @ObfuscatedName("client.gv")
    public static int field944 = 0;

    @ObfuscatedName("client.gt")
    public static int field961 = 0;

    @ObfuscatedName("client.gs")
    public static int field946 = 50;

    @ObfuscatedName("client.gw")
    public static int field947 = 0;

    @ObfuscatedName("client.gi")
    public static int field948 = 0;

    @ObfuscatedName("client.gd")
    public static int field949 = 0;

    @ObfuscatedName("client.ha")
    public static int field1060 = 12;

    @ObfuscatedName("client.hz")
    public static int field951 = 6;

    @ObfuscatedName("client.hg")
    public static int field971 = 0;

    @ObfuscatedName("client.hd")
    public static boolean field1062 = false;

    @ObfuscatedName("client.hi")
    public static int field954 = 0;

    @ObfuscatedName("client.hh")
    public static boolean field955 = false;

    @ObfuscatedName("client.hm")
    public static int field885 = 0;

    @ObfuscatedName("client.hj")
    public static int field957 = 0;

    @ObfuscatedName("client.hr")
    public static int field945 = 50;

    @ObfuscatedName("client.ht")
    public static int[] field1091 = new int[field945];

    @ObfuscatedName("client.hp")
    public static int[] field970 = new int[field945];

    @ObfuscatedName("client.hs")
    public static int[] field960 = new int[field945];

    @ObfuscatedName("client.hl")
    public static int[] field962 = new int[field945];

    @ObfuscatedName("client.hc")
    public static int[] field963 = new int[field945];

    @ObfuscatedName("client.he")
    public static int[] field964 = new int[field945];

    @ObfuscatedName("client.hv")
    public static int[] field965 = new int[field945];

    @ObfuscatedName("client.hy")
    public static String[] field1039 = new String[field945];

    @ObfuscatedName("client.hb")
    public static int[][] field967 = new int[104][104];

    @ObfuscatedName("client.hk")
    public static int field1138 = 0;

    @ObfuscatedName("client.hq")
    public static int field1120 = -1;

    @ObfuscatedName("client.hf")
    public static int field1141 = -1;

    @ObfuscatedName("client.hw")
    public static int field926 = 0;

    @ObfuscatedName("client.hn")
    public static int field972 = 0;

    @ObfuscatedName("client.ho")
    public static int field973 = 0;

    @ObfuscatedName("client.hx")
    public static int field974 = 0;

    @ObfuscatedName("client.iw")
    public static boolean field975 = true;

    @ObfuscatedName("client.ik")
    public static int field976 = 0;

    @ObfuscatedName("client.if")
    public static int field977 = 0;

    @ObfuscatedName("client.it")
    public static String field1024 = null;

    @ObfuscatedName("client.in")
    public static int field978 = 0;

    @ObfuscatedName("client.im")
    public static int field979 = 0;

    @ObfuscatedName("client.ir")
    public static int field913 = 0;

    @ObfuscatedName("client.iu")
    public static int field981 = 0;

    @ObfuscatedName("client.iv")
    public static boolean field1052 = false;

    @ObfuscatedName("client.il")
    public static int field983 = 0;

    @ObfuscatedName("client.ia")
    public static int field899 = 0;

    @ObfuscatedName("client.ig")
    public static boolean field1098 = true;

    @ObfuscatedName("client.is")
    public static class73[] field986 = new class73[2048];

    @ObfuscatedName("client.iy")
    public static int field987 = -1;

    @ObfuscatedName("client.ih")
    public static int field988 = 0;

    @ObfuscatedName("client.io")
    public static boolean field989 = true;

    @ObfuscatedName("client.jn")
    public static int field1101 = 0;

    @ObfuscatedName("client.ju")
    public static int field991 = 0;

    @ObfuscatedName("client.jh")
    public static int[] field1028 = new int[1000];

    @ObfuscatedName("client.jb")
    public static final int[] field993 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.js")
    public static String[] field994 = new String[8];

    @ObfuscatedName("client.jw")
    public static boolean[] field995 = new boolean[8];

    @ObfuscatedName("client.jm")
    public static int[] field996 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.jq")
    public static int field1113 = -1;

    @ObfuscatedName("client.jg")
    public static class218[][][] field915 = new class218[4][104][104];

    @ObfuscatedName("client.je")
    public static class218 field999 = new class218();

    @ObfuscatedName("client.jk")
    public static class218 field1000 = new class218();

    @ObfuscatedName("client.jj")
    public static class218 field1001 = new class218();

    @ObfuscatedName("client.jl")
    public static int[] field1006 = new int[25];

    @ObfuscatedName("client.jt")
    public static int[] field1003 = new int[25];

    @ObfuscatedName("client.jp")
    public static int[] field1002 = new int[25];

    @ObfuscatedName("client.jy")
    public static int field1005 = 0;

    @ObfuscatedName("client.jd")
    public static boolean field1069 = false;

    @ObfuscatedName("client.kj")
    public static int field1004 = 0;

    @ObfuscatedName("client.ke")
    public static int[] field1008 = new int[500];

    @ObfuscatedName("client.ks")
    public static int[] field914 = new int[500];

    @ObfuscatedName("client.ko")
    public static int[] field1108 = new int[500];

    @ObfuscatedName("client.km")
    public static int[] field950 = new int[500];

    @ObfuscatedName("client.kd")
    public static String[] field1059 = new String[500];

    @ObfuscatedName("client.ka")
    public static String[] field1013 = new String[500];

    @ObfuscatedName("client.kw")
    public static boolean[] field1087 = new boolean[500];

    @ObfuscatedName("client.kb")
    public static boolean field1015 = false;

    @ObfuscatedName("client.ku")
    public static boolean field982 = false;

    @ObfuscatedName("client.kr")
    public static boolean field1017 = false;

    @ObfuscatedName("client.kx")
    public static boolean field1018 = true;

    @ObfuscatedName("client.kt")
    public static int field992 = -1;

    @ObfuscatedName("client.kl")
    public static int field1020 = -1;

    @ObfuscatedName("client.kq")
    public static int field1116 = 0;

    @ObfuscatedName("client.kz")
    public static int field1022 = 50;

    @ObfuscatedName("client.kh")
    public static int field1023 = 0;

    @ObfuscatedName("client.kk")
    public static boolean field895 = false;

    @ObfuscatedName("client.kc")
    public static int field1026 = -1;

    @ObfuscatedName("client.ki")
    public static int field894 = -1;

    @ObfuscatedName("client.li")
    public static String field1093 = null;

    @ObfuscatedName("client.lq")
    public static String field1029 = null;

    @ObfuscatedName("client.lr")
    public static int field1016 = -1;

    @ObfuscatedName("client.la")
    public static class215 field1031 = new class215(8);

    @ObfuscatedName("client.lk")
    public static int field1032 = 0;

    @ObfuscatedName("client.lz")
    public static int field1097 = 0;

    @ObfuscatedName("client.le")
    public static class243 field1034 = null;

    @ObfuscatedName("client.ln")
    public static int field1125 = 0;

    @ObfuscatedName("client.lo")
    public static int field1036 = 0;

    @ObfuscatedName("client.lt")
    public static int field1102 = 0;

    @ObfuscatedName("client.lx")
    public static int field1049 = -1;

    @ObfuscatedName("client.lm")
    public static boolean field1021 = false;

    @ObfuscatedName("client.lf")
    public static class243 field1040 = null;

    @ObfuscatedName("client.lv")
    public static class243 field1041 = null;

    @ObfuscatedName("client.lc")
    public static class243 field938 = null;

    @ObfuscatedName("client.lu")
    public static int field1043 = 0;

    @ObfuscatedName("client.lj")
    public static int field1115 = 0;

    @ObfuscatedName("client.ll")
    public static class243 field990 = null;

    @ObfuscatedName("client.ld")
    public static boolean field1054 = false;

    @ObfuscatedName("client.lb")
    public static int field1009 = -1;

    @ObfuscatedName("client.lw")
    public static int field1048 = -1;

    @ObfuscatedName("client.lp")
    public static boolean field959 = false;

    @ObfuscatedName("client.lh")
    public static int field1050 = -1;

    @ObfuscatedName("client.ly")
    public static int field883 = -1;

    @ObfuscatedName("client.ls")
    public static boolean field1051 = false;

    @ObfuscatedName("client.mg")
    public static int field1066 = 1;

    @ObfuscatedName("client.mn")
    public static int[] field985 = new int[32];

    @ObfuscatedName("client.mr")
    public static int field1055 = 0;

    @ObfuscatedName("client.my")
    public static int[] field1056 = new int[32];

    @ObfuscatedName("client.me")
    public static int field1057 = 0;

    @ObfuscatedName("client.ml")
    public static int[] field1058 = new int[32];

    @ObfuscatedName("client.mw")
    public static int field1053 = 0;

    @ObfuscatedName("client.md")
    public static int field1089 = 0;

    @ObfuscatedName("client.mz")
    public static int field1061 = 0;

    @ObfuscatedName("client.mm")
    public static int field968 = 0;

    @ObfuscatedName("client.mf")
    public static int field1063 = 0;

    @ObfuscatedName("client.mt")
    public static int field1064 = 0;

    @ObfuscatedName("client.mx")
    public static int field1065 = 0;

    @ObfuscatedName("client.mh")
    public static int field1082 = 0;

    @ObfuscatedName("client.mq")
    public static class218 field1067 = new class218();

    @ObfuscatedName("client.mi")
    public static class218 field1068 = new class218();

    @ObfuscatedName("client.mj")
    public static class218 field1126 = new class218();

    @ObfuscatedName("client.ma")
    public static class215 field1070 = new class215(512);

    @ObfuscatedName("client.nx")
    public static int field927 = 0;

    @ObfuscatedName("client.nz")
    public static int field1072 = -2;

    @ObfuscatedName("client.nh")
    public static boolean[] field1073 = new boolean[100];

    @ObfuscatedName("client.np")
    public static boolean[] field1074 = new boolean[100];

    @ObfuscatedName("client.ny")
    public static boolean[] field1075 = new boolean[100];

    @ObfuscatedName("client.nl")
    public static int[] field1042 = new int[100];

    @ObfuscatedName("client.nj")
    public static int[] field1077 = new int[100];

    @ObfuscatedName("client.ni")
    public static int[] field1071 = new int[100];

    @ObfuscatedName("client.nr")
    public static int[] field1079 = new int[100];

    @ObfuscatedName("client.nu")
    public static int field1080 = 0;

    @ObfuscatedName("client.no")
    public static long field1081 = 0L;

    @ObfuscatedName("client.ns")
    public static boolean field1025 = true;

    @ObfuscatedName("client.ne")
    public static int[] field1083 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.nv")
    public static int field1084 = 0;

    @ObfuscatedName("client.na")
    public static int field1085 = 0;

    @ObfuscatedName("client.nw")
    public static String field1086 = "";

    @ObfuscatedName("client.ng")
    public static long[] field1078 = new long[100];

    @ObfuscatedName("client.os")
    public static int field1088 = 0;

    @ObfuscatedName("client.ov")
    public static int field953 = 0;

    @ObfuscatedName("client.ob")
    public static int[] field1090 = new int[128];

    @ObfuscatedName("client.ok")
    public static int[] field969 = new int[128];

    @ObfuscatedName("client.og")
    public static long field1092 = -1L;

    @ObfuscatedName("client.oo")
    public static int field882 = -1;

    @ObfuscatedName("client.oc")
    public static int field1094 = 0;

    @ObfuscatedName("client.ox")
    public static int[] field1095 = new int[1000];

    @ObfuscatedName("client.oy")
    public static int[] field1096 = new int[1000];

    @ObfuscatedName("client.oj")
    public static class332[] field1118 = new class332[1000];

    @ObfuscatedName("client.oz")
    public static int field1137 = 0;

    @ObfuscatedName("client.oq")
    public static int field1099 = 0;

    @ObfuscatedName("client.oe")
    public static int field1100 = 0;

    @ObfuscatedName("client.or")
    public static int field997 = 255;

    @ObfuscatedName("client.op")
    public static int field1027 = -1;

    @ObfuscatedName("client.oh")
    public static boolean field1103 = false;

    @ObfuscatedName("client.pf")
    public static int field1076 = 127;

    @ObfuscatedName("client.pt")
    public static int field952 = 127;

    @ObfuscatedName("client.pa")
    public static int field1106 = 0;

    @ObfuscatedName("client.pd")
    public static int[] field1104 = new int[50];

    @ObfuscatedName("client.pi")
    public static int[] field1030 = new int[50];

    @ObfuscatedName("client.po")
    public static int[] field1109 = new int[50];

    @ObfuscatedName("client.pe")
    public static int[] field1110 = new int[50];

    @ObfuscatedName("client.ph")
    public static class104[] field1111 = new class104[50];

    @ObfuscatedName("client.pw")
    public static boolean field1112 = false;

    @ObfuscatedName("client.pq")
    public static boolean[] field956 = new boolean[5];

    @ObfuscatedName("client.qd")
    public static int[] field943 = new int[5];

    @ObfuscatedName("client.qa")
    public static int[] field1007 = new int[5];

    @ObfuscatedName("client.qe")
    public static int[] field940 = new int[5];

    @ObfuscatedName("client.qh")
    public static int[] field1117 = new int[5];

    @ObfuscatedName("client.ql")
    public static short field1121 = 256;

    @ObfuscatedName("client.qk")
    public static short field1119 = 205;

    @ObfuscatedName("client.qo")
    public static short field1019 = 256;

    @ObfuscatedName("client.qi")
    public static short field1105 = 320;

    @ObfuscatedName("client.qw")
    public static short field1122 = 1;

    @ObfuscatedName("client.qp")
    public static short field1123 = 32767;

    @ObfuscatedName("client.qb")
    public static short field1124 = 1;

    @ObfuscatedName("client.qz")
    public static short field912 = 32767;

    @ObfuscatedName("client.qj")
    public static int field1012 = 0;

    @ObfuscatedName("client.qn")
    public static int field1127 = 0;

    @ObfuscatedName("client.qy")
    public static int field1128 = 0;

    @ObfuscatedName("client.qx")
    public static int field1129 = 0;

    @ObfuscatedName("client.qf")
    public static int field1130 = 0;

    @ObfuscatedName("client.qm")
    public static class240 field1133 = new class240();

    @ObfuscatedName("client.qg")
    public static int field1045 = -1;

    @ObfuscatedName("client.qc")
    public static int field1139 = -1;

    @ObfuscatedName("client.qv")
    public static class17[] field1134 = new class17[8];

    @ObfuscatedName("client.rf")
    public static class74 field1135 = new class74();

    @ObfuscatedName("client.re")
    public static int field1136 = -1;

    @ObfuscatedName("client.rs")
    public static ArrayList field872 = new ArrayList(10);

    @ObfuscatedName("client.rn")
    public static int field936 = 0;

    @ObfuscatedName("client.rj")
    public static final class72 field902 = new class72();

    @ObfuscatedName("client.rr")
    public static int[] field1035 = new int[50];

    @ObfuscatedName("client.rc")
    public static int[] field1132 = new int[50];

    @ObfuscatedName("cu.es(I)Llp;")
    public static class335 method1736() {
        return Statics.field1244;
    }

    @ObfuscatedName("client.ar(I)V")
    public final void method814() {
    }

    public final void init() {
        if (!this.method794()) {
            return;
        }
        class294[] var1 = new class294[] { class294.field3813, class294.field3812, class294.field3811, class294.field3802, class294.field3810, class294.field3800, class294.field3808, class294.field3815, class294.field3806, class294.field3809, class294.field3814, class294.field3805, class294.field3804, class294.field3807, class294.field3801, class294.field3803 };
        class294[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class294 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3816);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3816)) {
                    case 1:
                        field935 = Integer.parseInt(var5);
                        break;
                    case 2:
                        if (field878 == -1) {
                            field878 = Integer.parseInt(var5);
                        }
                    case 3:
                    case 6:
                    default:
                        break;
                    case 4:
                        field871 = Integer.parseInt(var5);
                        break;
                    case 5:
                        if (var5.equalsIgnoreCase(class87.field1332)) {
                            field874 = true;
                        } else {
                            field874 = false;
                        }
                        break;
                    case 7:
                        if (var5.equalsIgnoreCase(class87.field1332)) {
                        }
                        break;
                    case 8:
                        Statics.field796 = Integer.parseInt(var5);
                        break;
                    case 9:
                        Statics.field877 = var5;
                        break;
                    case 10:
                        Statics.field1921 = Statics.method17(Integer.parseInt(var5));
                        break;
                    case 11:
                        field980 = Integer.parseInt(var5);
                        break;
                    case 12:
                        Statics.field658 = var5;
                        break;
                    case 13:
                        Statics.field3436 = (class259) class190.method4146(class259.method4141(), Integer.parseInt(var5));
                        if (Statics.field3436 == class259.field3367) {
                            Statics.field2519 = class336.field4070;
                        } else {
                            Statics.field2519 = class336.field4071;
                        }
                        break;
                    case 14:
                        field873 = Integer.parseInt(var5);
                        break;
                    case 15:
                        field918 = Integer.parseInt(var5) != 0;
                }
            }
        }
        class138.field2037 = false;
        field875 = false;
        Statics.field1423 = this.getCodeBase().getHost();
        String var6 = Statics.field1921.field3358;
        byte var7 = 0;
        try {
            class168.method2457("oldschool", var6, var7, 17);
        } catch (Exception var9) {
            class165.method1744((String) null, var9);
        }
        Statics.field359 = this;
        this.method877(765, 503, 168);
    }

    @ObfuscatedName("client.ag(B)V")
    public final void method914() {
        class196.method2823(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field2687 = field873 == 0 ? 43594 : field871 + 40000;
        Statics.field2961 = field873 == 0 ? 443 : field871 + 50000;
        Statics.field2050 = Statics.field2687;
        Statics.field2795 = class241.field2806;
        Statics.field2792 = class241.field2801;
        Statics.field247 = class241.field2802;
        Statics.field2136 = class241.field2803;
        Statics.field593 = new class148();
        this.method786();
        this.method787();
        Statics.field1361 = this.method783();
        Statics.field330 = new class175(255, class168.field2225, class168.field2223, 500000);
        class123 var1 = null;
        class79 var2 = new class79();
        try {
            var1 = class168.method1723("", Statics.field3436.field3366, false);
            byte[] var3 = new byte[(int) var1.method2324()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method2325(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class79(new class195(var3));
        } catch (Exception var10) {
        }
        try {
            if (var1 != null) {
                var1.method2326();
            }
        } catch (Exception var9) {
        }
        Statics.field1142 = var2;
        this.method879();
        class58.method65(this, Statics.field516);
        if (field873 != 0) {
            field888 = true;
        }
        method719(Statics.field1142.field1245);
        Statics.field426 = new class80(Statics.field2519);
    }

    @ObfuscatedName("client.at(B)V")
    public final void method805() {
        field929++;
        this.method1141();
        while (true) {
            class218 var1 = class263.field3395;
            class260 var2;
            synchronized (class263.field3395) {
                var2 = (class260) class263.field3396.method3693();
            }
            if (var2 == null) {
                try {
                    if (class230.field2688 == 1) {
                        int var4 = Statics.field2691.method3904();
                        if (var4 > 0 && Statics.field2691.method3816()) {
                            int var5 = var4 - Statics.field12;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2691.method3800(var5);
                        } else {
                            Statics.field2691.method3806();
                            Statics.field2691.method3807();
                            if (Statics.field2512 == null) {
                                class230.field2688 = 0;
                            } else {
                                class230.field2688 = 2;
                            }
                            Statics.field1301 = null;
                            Statics.field1966 = null;
                        }
                    }
                } catch (Exception var283) {
                    var283.printStackTrace();
                    Statics.field2691.method3806();
                    class230.field2688 = 0;
                    Statics.field1301 = null;
                    Statics.field1966 = null;
                    Statics.field2512 = null;
                }
                Statics.method35();
                class52.method2832();
                class61 var7 = class61.field718;
                synchronized (class61.field718) {
                    class61.field729 = class61.field720;
                    class61.field717 = class61.field725;
                    class61.field715 = class61.field724;
                    class61.field730 = class61.field726;
                    class61.field731 = class61.field727;
                    class61.field732 = class61.field721;
                    class61.field733 = class61.field722;
                    class61.field726 = 0;
                }
                if (Statics.field1361 != null) {
                    int var9 = Statics.field1361.method665();
                    field1082 = var9;
                }
                if (field880 == 0) {
                    method2937();
                    Statics.field2131.method2934();
                    for (int var10 = 0; var10 < 32; var10++) {
                        field689[var10] = 0L;
                    }
                    for (int var11 = 0; var11 < 32; var11++) {
                        field710[var11] = 0L;
                    }
                    Statics.field685 = 0;
                } else if (field880 == 5) {
                    class91.method3039(this);
                    method2937();
                    Statics.field2131.method2934();
                    for (int var12 = 0; var12 < 32; var12++) {
                        field689[var12] = 0L;
                    }
                    for (int var13 = 0; var13 < 32; var13++) {
                        field710[var13] = 0L;
                    }
                    Statics.field685 = 0;
                } else if (field880 == 10 || field880 == 11) {
                    class91.method3039(this);
                } else if (field880 == 20) {
                    class91.method3039(this);
                    this.method1144();
                } else if (field880 == 25) {
                    method722(false);
                    field921 = 0;
                    boolean var14 = true;
                    for (int var15 = 0; var15 < Statics.field3545.length; var15++) {
                        if (Statics.field770[var15] != -1 && Statics.field3545[var15] == null) {
                            Statics.field3545[var15] = Statics.field814.method4241(Statics.field770[var15], 0);
                            if (Statics.field3545[var15] == null) {
                                var14 = false;
                                field921++;
                            }
                        }
                        if (Statics.field3889[var15] != -1 && Statics.field1140[var15] == null) {
                            Statics.field1140[var15] = Statics.field814.method4158(Statics.field3889[var15], 0, Statics.field2153[var15]);
                            if (Statics.field1140[var15] == null) {
                                var14 = false;
                                field921++;
                            }
                        }
                    }
                    if (var14) {
                        field923 = 0;
                        boolean var16 = true;
                        for (int var17 = 0; var17 < Statics.field3545.length; var17++) {
                            byte[] var18 = Statics.field1140[var17];
                            if (var18 != null) {
                                int var19 = (Statics.field3837[var17] >> 8) * 64 - Statics.field2048;
                                int var20 = (Statics.field3837[var17] & 0xFF) * 64 - Statics.field360;
                                if (field928) {
                                    var19 = 10;
                                    var20 = 10;
                                }
                                boolean var22 = true;
                                class195 var23 = new class195(var18);
                                int var24 = -1;
                                label1276: while (true) {
                                    int var25 = var23.method3219();
                                    if (var25 == 0) {
                                        var16 &= var22;
                                        break;
                                    }
                                    var24 += var25;
                                    int var26 = 0;
                                    boolean var27 = false;
                                    while (true) {
                                        while (!var27) {
                                            int var29 = var23.method3219();
                                            if (var29 == 0) {
                                                continue label1276;
                                            }
                                            var26 += var29 - 1;
                                            int var30 = var26 & 0x3F;
                                            int var31 = var26 >> 6 & 0x3F;
                                            int var32 = var23.method3205() >> 2;
                                            int var33 = var19 + var31;
                                            int var34 = var20 + var30;
                                            if (var33 > 0 && var34 > 0 && var33 < 103 && var34 < 103) {
                                                class283 var35 = class283.method713(var24);
                                                if (var32 != 22 || !field875 || var35.field3598 != 0 || var35.field3608 == 1 || var35.field3606) {
                                                    if (!var35.method4641()) {
                                                        field923++;
                                                        var22 = false;
                                                    }
                                                    var27 = true;
                                                }
                                            }
                                        }
                                        int var28 = var23.method3219();
                                        if (var28 == 0) {
                                            break;
                                        }
                                        var23.method3205();
                                    }
                                }
                            }
                        }
                        if (var16) {
                            if (field925 != 0) {
                                method1536(class252.field3035 + class87.field1335 + class87.field1329 + 100 + "%" + class87.field1333, true);
                            }
                            Statics.method35();
                            Statics.field3341.method2625();
                            for (int var37 = 0; var37 < 4; var37++) {
                                field893[var37].method3072();
                            }
                            for (int var38 = 0; var38 < 4; var38++) {
                                for (int var39 = 0; var39 < 104; var39++) {
                                    for (int var40 = 0; var40 < 104; var40++) {
                                        class63.field740[var38][var39][var40] = 0;
                                    }
                                }
                            }
                            Statics.method35();
                            class63.field748 = 99;
                            Statics.field742 = new byte[4][104][104];
                            Statics.field743 = new byte[4][104][104];
                            Statics.field744 = new byte[4][104][104];
                            Statics.field749 = new byte[4][104][104];
                            Statics.field2521 = new int[4][105][105];
                            Statics.field3832 = new byte[4][105][105];
                            Statics.field1355 = new int[105][105];
                            Statics.field655 = new int[104];
                            Statics.field2497 = new int[104];
                            Statics.field3315 = new int[104];
                            Statics.field496 = new int[104];
                            Statics.field1357 = new int[104];
                            int var41 = Statics.field3545.length;
                            class81.method958();
                            method722(true);
                            if (!field928) {
                                int var42 = 0;
                                label1214: while (true) {
                                    if (var42 >= var41) {
                                        for (int var56 = 0; var56 < var41; var56++) {
                                            int var57 = (Statics.field3837[var56] >> 8) * 64 - Statics.field2048;
                                            int var58 = (Statics.field3837[var56] & 0xFF) * 64 - Statics.field360;
                                            byte[] var59 = Statics.field3545[var56];
                                            if (var59 == null && Statics.field302 < 800) {
                                                Statics.method35();
                                                class63.method43(var57, var58, 64, 64);
                                            }
                                        }
                                        method722(true);
                                        int var60 = 0;
                                        while (true) {
                                            if (var60 >= var41) {
                                                break label1214;
                                            }
                                            byte[] var61 = Statics.field1140[var60];
                                            if (var61 != null) {
                                                int var62 = (Statics.field3837[var60] >> 8) * 64 - Statics.field2048;
                                                int var63 = (Statics.field3837[var60] & 0xFF) * 64 - Statics.field360;
                                                Statics.method35();
                                                class63.method74(var61, var62, var63, Statics.field3341, field893);
                                            }
                                            var60++;
                                        }
                                    }
                                    int var43 = (Statics.field3837[var42] >> 8) * 64 - Statics.field2048;
                                    int var44 = (Statics.field3837[var42] & 0xFF) * 64 - Statics.field360;
                                    byte[] var45 = Statics.field3545[var42];
                                    if (var45 != null) {
                                        Statics.method35();
                                        int var46 = Statics.field762 * 8 - 48;
                                        int var47 = Statics.field302 * 8 - 48;
                                        class177[] var48 = field893;
                                        int var49 = 0;
                                        label1211: while (true) {
                                            if (var49 >= 4) {
                                                class195 var52 = new class195(var45);
                                                int var53 = 0;
                                                while (true) {
                                                    if (var53 >= 4) {
                                                        break label1211;
                                                    }
                                                    for (int var54 = 0; var54 < 64; var54++) {
                                                        for (int var55 = 0; var55 < 64; var55++) {
                                                            Statics.method3799(var52, var53, var43 + var54, var44 + var55, var46, var47, 0);
                                                        }
                                                    }
                                                    var53++;
                                                }
                                            }
                                            for (int var50 = 0; var50 < 64; var50++) {
                                                for (int var51 = 0; var51 < 64; var51++) {
                                                    if (var43 + var50 > 0 && var43 + var50 < 103 && var44 + var51 > 0 && var44 + var51 < 103) {
                                                        var48[var49].field2273[var43 + var50][var44 + var51] &= 0xFEFFFFFF;
                                                    }
                                                }
                                            }
                                            var49++;
                                        }
                                    }
                                    var42++;
                                }
                            }
                            if (field928) {
                                int var64 = 0;
                                label1160: while (true) {
                                    if (var64 >= 4) {
                                        for (int var95 = 0; var95 < 13; var95++) {
                                            for (int var96 = 0; var96 < 13; var96++) {
                                                int var97 = field911[0][var95][var96];
                                                if (var97 == -1) {
                                                    class63.method43(var95 * 8, var96 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method722(true);
                                        int var98 = 0;
                                        while (true) {
                                            if (var98 >= 4) {
                                                break label1160;
                                            }
                                            Statics.method35();
                                            for (int var99 = 0; var99 < 13; var99++) {
                                                label1083: for (int var100 = 0; var100 < 13; var100++) {
                                                    int var101 = field911[var98][var99][var100];
                                                    if (var101 != -1) {
                                                        int var102 = var101 >> 24 & 0x3;
                                                        int var103 = var101 >> 1 & 0x3;
                                                        int var104 = var101 >> 14 & 0x3FF;
                                                        int var105 = var101 >> 3 & 0x7FF;
                                                        int var106 = (var104 / 8 << 8) + var105 / 8;
                                                        for (int var107 = 0; var107 < Statics.field3837.length; var107++) {
                                                            if (Statics.field3837[var107] == var106 && Statics.field1140[var107] != null) {
                                                                byte[] var108 = Statics.field1140[var107];
                                                                int var109 = var99 * 8;
                                                                int var110 = var100 * 8;
                                                                int var111 = (var104 & 0x7) * 8;
                                                                int var112 = (var105 & 0x7) * 8;
                                                                class138 var113 = Statics.field3341;
                                                                class177[] var114 = field893;
                                                                class195 var115 = new class195(var108);
                                                                int var116 = -1;
                                                                while (true) {
                                                                    int var117 = var115.method3219();
                                                                    if (var117 == 0) {
                                                                        continue label1083;
                                                                    }
                                                                    var116 += var117;
                                                                    int var118 = 0;
                                                                    while (true) {
                                                                        int var119 = var115.method3219();
                                                                        if (var119 == 0) {
                                                                            break;
                                                                        }
                                                                        var118 += var119 - 1;
                                                                        int var120 = var118 & 0x3F;
                                                                        int var121 = var118 >> 6 & 0x3F;
                                                                        int var122 = var118 >> 12;
                                                                        int var123 = var115.method3205();
                                                                        int var124 = var123 >> 2;
                                                                        int var125 = var123 & 0x3;
                                                                        if (var102 == var122 && var121 >= var111 && var121 < var111 + 8 && var120 >= var112 && var120 < var112 + 8) {
                                                                            class283 var126 = class283.method713(var116);
                                                                            int var128 = var121 & 0x7;
                                                                            int var129 = var120 & 0x7;
                                                                            int var131 = var126.field3595;
                                                                            int var132 = var126.field3607;
                                                                            if ((var125 & 0x1) == 1) {
                                                                                int var133 = var131;
                                                                                var131 = var132;
                                                                                var132 = var133;
                                                                            }
                                                                            int var134 = var103 & 0x3;
                                                                            int var135;
                                                                            if (var134 == 0) {
                                                                                var135 = var128;
                                                                            } else if (var134 == 1) {
                                                                                var135 = var129;
                                                                            } else if (var134 == 2) {
                                                                                var135 = 7 - var128 - (var131 - 1);
                                                                            } else {
                                                                                var135 = 7 - var129 - (var132 - 1);
                                                                            }
                                                                            int var136 = var109 + var135;
                                                                            int var138 = var121 & 0x7;
                                                                            int var139 = var120 & 0x7;
                                                                            int var141 = var126.field3595;
                                                                            int var142 = var126.field3607;
                                                                            if ((var125 & 0x1) == 1) {
                                                                                int var143 = var141;
                                                                                var141 = var142;
                                                                                var142 = var143;
                                                                            }
                                                                            int var144 = var103 & 0x3;
                                                                            int var145;
                                                                            if (var144 == 0) {
                                                                                var145 = var139;
                                                                            } else if (var144 == 1) {
                                                                                var145 = 7 - var138 - (var141 - 1);
                                                                            } else if (var144 == 2) {
                                                                                var145 = 7 - var139 - (var142 - 1);
                                                                            } else {
                                                                                var145 = var138;
                                                                            }
                                                                            int var146 = var110 + var145;
                                                                            if (var136 > 0 && var146 > 0 && var136 < 103 && var146 < 103) {
                                                                                int var147 = var98;
                                                                                if ((class63.field740[1][var136][var146] & 0x2) == 2) {
                                                                                    var147 = var98 - 1;
                                                                                }
                                                                                class177 var148 = null;
                                                                                if (var147 >= 0) {
                                                                                    var148 = var114[var147];
                                                                                }
                                                                                class63.method566(var98, var136, var146, var116, var103 + var125 & 0x3, var124, var113, var148);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var98++;
                                        }
                                    }
                                    Statics.method35();
                                    for (int var65 = 0; var65 < 13; var65++) {
                                        for (int var66 = 0; var66 < 13; var66++) {
                                            boolean var67 = false;
                                            int var68 = field911[var64][var65][var66];
                                            if (var68 != -1) {
                                                int var69 = var68 >> 24 & 0x3;
                                                int var70 = var68 >> 1 & 0x3;
                                                int var71 = var68 >> 14 & 0x3FF;
                                                int var72 = var68 >> 3 & 0x7FF;
                                                int var73 = (var71 / 8 << 8) + var72 / 8;
                                                for (int var74 = 0; var74 < Statics.field3837.length; var74++) {
                                                    if (Statics.field3837[var74] == var73 && Statics.field3545[var74] != null) {
                                                        byte[] var75 = Statics.field3545[var74];
                                                        int var76 = var65 * 8;
                                                        int var77 = var66 * 8;
                                                        int var78 = (var71 & 0x7) * 8;
                                                        int var79 = (var72 & 0x7) * 8;
                                                        class177[] var80 = field893;
                                                        for (int var81 = 0; var81 < 8; var81++) {
                                                            for (int var82 = 0; var82 < 8; var82++) {
                                                                if (var76 + var81 > 0 && var76 + var81 < 103 && var77 + var82 > 0 && var77 + var82 < 103) {
                                                                    var80[var64].field2273[var76 + var81][var77 + var82] &= 0xFEFFFFFF;
                                                                }
                                                            }
                                                        }
                                                        class195 var83 = new class195(var75);
                                                        for (int var84 = 0; var84 < 4; var84++) {
                                                            for (int var85 = 0; var85 < 64; var85++) {
                                                                for (int var86 = 0; var86 < 64; var86++) {
                                                                    if (var69 == var84 && var85 >= var78 && var85 < var78 + 8 && var86 >= var79 && var86 < var79 + 8) {
                                                                        int var90 = var85 & 0x7;
                                                                        int var91 = var86 & 0x7;
                                                                        int var93 = var70 & 0x3;
                                                                        int var94;
                                                                        if (var93 == 0) {
                                                                            var94 = var90;
                                                                        } else if (var93 == 1) {
                                                                            var94 = var91;
                                                                        } else if (var93 == 2) {
                                                                            var94 = 7 - var90;
                                                                        } else {
                                                                            var94 = 7 - var91;
                                                                        }
                                                                        Statics.method3799(var83, var64, var76 + var94, var77 + class242.method2908(var85 & 0x7, var86 & 0x7, var70), 0, 0, var70);
                                                                    } else {
                                                                        Statics.method3799(var83, 0, -1, -1, 0, 0, 0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        var67 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var67) {
                                                class63.method2822(var64, var65 * 8, var66 * 8);
                                            }
                                        }
                                    }
                                    var64++;
                                }
                            }
                            method722(true);
                            Statics.method35();
                            class138 var149 = Statics.field3341;
                            class177[] var150 = field893;
                            for (int var151 = 0; var151 < 4; var151++) {
                                for (int var152 = 0; var152 < 104; var152++) {
                                    for (int var153 = 0; var153 < 104; var153++) {
                                        if ((class63.field740[var151][var152][var153] & 0x1) == 1) {
                                            int var154 = var151;
                                            if ((class63.field740[1][var152][var153] & 0x2) == 2) {
                                                var154 = var151 - 1;
                                            }
                                            if (var154 >= 0) {
                                                var150[var154].method3075(var152, var153);
                                            }
                                        }
                                    }
                                }
                            }
                            class63.field752 += (int) (Math.random() * 5.0D) - 2;
                            if (class63.field752 < -8) {
                                class63.field752 = -8;
                            }
                            if (class63.field752 > 8) {
                                class63.field752 = 8;
                            }
                            class63.field746 += (int) (Math.random() * 5.0D) - 2;
                            if (class63.field746 < -16) {
                                class63.field746 = -16;
                            }
                            if (class63.field746 > 16) {
                                class63.field746 = 16;
                            }
                            for (int var155 = 0; var155 < 4; var155++) {
                                byte[][] var156 = Statics.field3832[var155];
                                int var157 = (int) Math.sqrt(5100.0D);
                                int var158 = var157 * 768 >> 8;
                                for (int var159 = 1; var159 < 103; var159++) {
                                    for (int var160 = 1; var160 < 103; var160++) {
                                        int var161 = class63.field745[var155][var160 + 1][var159] - class63.field745[var155][var160 - 1][var159];
                                        int var162 = class63.field745[var155][var160][var159 + 1] - class63.field745[var155][var160][var159 - 1];
                                        int var163 = (int) Math.sqrt((double) (var162 * var162 + var161 * var161 + 65536));
                                        int var164 = (var161 << 8) / var163;
                                        int var165 = 65536 / var163;
                                        int var166 = (var162 << 8) / var163;
                                        int var167 = (var166 * -50 + var164 * -50 + var165 * -10) / var158 + 96;
                                        int var168 = (var156[var160][var159] >> 1) + (var156[var160][var159 + 1] >> 3) + (var156[var160][var159 - 1] >> 2) + (var156[var160 - 1][var159] >> 2) + (var156[var160 + 1][var159] >> 3);
                                        Statics.field1355[var160][var159] = var167 - var168;
                                    }
                                }
                                for (int var169 = 0; var169 < 104; var169++) {
                                    Statics.field655[var169] = 0;
                                    Statics.field2497[var169] = 0;
                                    Statics.field3315[var169] = 0;
                                    Statics.field496[var169] = 0;
                                    Statics.field1357[var169] = 0;
                                }
                                for (int var170 = -5; var170 < 109; var170++) {
                                    for (int var171 = 0; var171 < 104; var171++) {
                                        int var172 = var170 + 5;
                                        int var10002;
                                        if (var172 >= 0 && var172 < 104) {
                                            int var173 = Statics.field742[var155][var172][var171] & 0xFF;
                                            if (var173 > 0) {
                                                class274 var174 = class274.method2456(var173 - 1);
                                                Statics.field655[var171] += var174.field3502;
                                                Statics.field2497[var171] += var174.field3506;
                                                Statics.field3315[var171] += var174.field3507;
                                                Statics.field496[var171] += var174.field3508;
                                                var10002 = Statics.field1357[var171]++;
                                            }
                                        }
                                        int var175 = var170 - 5;
                                        if (var175 >= 0 && var175 < 104) {
                                            int var176 = Statics.field742[var155][var175][var171] & 0xFF;
                                            if (var176 > 0) {
                                                class274 var177 = class274.method2456(var176 - 1);
                                                Statics.field655[var171] -= var177.field3502;
                                                Statics.field2497[var171] -= var177.field3506;
                                                Statics.field3315[var171] -= var177.field3507;
                                                Statics.field496[var171] -= var177.field3508;
                                                var10002 = Statics.field1357[var171]--;
                                            }
                                        }
                                    }
                                    if (var170 >= 1 && var170 < 103) {
                                        int var178 = 0;
                                        int var179 = 0;
                                        int var180 = 0;
                                        int var181 = 0;
                                        int var182 = 0;
                                        for (int var183 = -5; var183 < 109; var183++) {
                                            int var184 = var183 + 5;
                                            if (var184 >= 0 && var184 < 104) {
                                                var178 += Statics.field655[var184];
                                                var179 += Statics.field2497[var184];
                                                var180 += Statics.field3315[var184];
                                                var181 += Statics.field496[var184];
                                                var182 += Statics.field1357[var184];
                                            }
                                            int var185 = var183 - 5;
                                            if (var185 >= 0 && var185 < 104) {
                                                var178 -= Statics.field655[var185];
                                                var179 -= Statics.field2497[var185];
                                                var180 -= Statics.field3315[var185];
                                                var181 -= Statics.field496[var185];
                                                var182 -= Statics.field1357[var185];
                                            }
                                            if (var183 >= 1 && var183 < 103 && (!field875 || (class63.field740[0][var170][var183] & 0x2) != 0 || (class63.field740[var155][var170][var183] & 0x10) == 0)) {
                                                if (var155 < class63.field748) {
                                                    class63.field748 = var155;
                                                }
                                                int var186 = Statics.field742[var155][var170][var183] & 0xFF;
                                                int var187 = Statics.field743[var155][var170][var183] & 0xFF;
                                                if (var186 > 0 || var187 > 0) {
                                                    int var188 = class63.field745[var155][var170][var183];
                                                    int var189 = class63.field745[var155][var170 + 1][var183];
                                                    int var190 = class63.field745[var155][var170 + 1][var183 + 1];
                                                    int var191 = class63.field745[var155][var170][var183 + 1];
                                                    int var192 = Statics.field1355[var170][var183];
                                                    int var193 = Statics.field1355[var170 + 1][var183];
                                                    int var194 = Statics.field1355[var170 + 1][var183 + 1];
                                                    int var195 = Statics.field1355[var170][var183 + 1];
                                                    int var196 = -1;
                                                    int var197 = -1;
                                                    if (var186 > 0) {
                                                        int var198 = var178 * 256 / var181;
                                                        int var199 = var179 / var182;
                                                        int var200 = var180 / var182;
                                                        var196 = class63.method4127(var198, var199, var200);
                                                        int var201 = class63.field752 + var198 & 0xFF;
                                                        int var202 = class63.field746 + var200;
                                                        if (var202 < 0) {
                                                            var202 = 0;
                                                        } else if (var202 > 255) {
                                                            var202 = 255;
                                                        }
                                                        var197 = class63.method4127(var201, var199, var202);
                                                    }
                                                    if (var155 > 0) {
                                                        boolean var203 = true;
                                                        if (var186 == 0 && Statics.field744[var155][var170][var183] != 0) {
                                                            var203 = false;
                                                        }
                                                        if (var187 > 0 && !class287.method1829(var187 - 1).field3745) {
                                                            var203 = false;
                                                        }
                                                        if (var203 && var188 == var189 && var188 == var190 && var188 == var191) {
                                                            Statics.field2521[var155][var170][var183] |= 0x924;
                                                        }
                                                    }
                                                    int var204 = 0;
                                                    if (var197 != -1) {
                                                        var204 = class135.field1959[class63.method2824(var197, 96)];
                                                    }
                                                    if (var187 == 0) {
                                                        var149.method2630(var155, var170, var183, 0, 0, -1, var188, var189, var190, var191, class63.method2824(var196, var192), class63.method2824(var196, var193), class63.method2824(var196, var194), class63.method2824(var196, var195), 0, 0, 0, 0, var204, 0);
                                                    } else {
                                                        int var205 = Statics.field744[var155][var170][var183] + 1;
                                                        byte var206 = Statics.field749[var155][var170][var183];
                                                        class287 var207 = class287.method1829(var187 - 1);
                                                        int var208 = var207.field3744;
                                                        int var209;
                                                        int var210;
                                                        if (var208 >= 0) {
                                                            var209 = Statics.field1950.method2351(var208);
                                                            var210 = -1;
                                                        } else if (var207.field3743 == 16711935) {
                                                            var210 = -2;
                                                            var208 = -1;
                                                            var209 = -2;
                                                        } else {
                                                            var210 = class63.method4127(var207.field3751, var207.field3748, var207.field3749);
                                                            int var211 = class63.field752 + var207.field3751 & 0xFF;
                                                            int var212 = class63.field746 + var207.field3749;
                                                            if (var212 < 0) {
                                                                var212 = 0;
                                                            } else if (var212 > 255) {
                                                                var212 = 255;
                                                            }
                                                            var209 = class63.method4127(var211, var207.field3748, var212);
                                                        }
                                                        int var213 = 0;
                                                        if (var209 != -2) {
                                                            var213 = class135.field1959[class63.method920(var209, 96)];
                                                        }
                                                        if (var207.field3750 != -1) {
                                                            int var214 = class63.field752 + var207.field3746 & 0xFF;
                                                            int var215 = class63.field746 + var207.field3747;
                                                            if (var215 < 0) {
                                                                var215 = 0;
                                                            } else if (var215 > 255) {
                                                                var215 = 255;
                                                            }
                                                            int var216 = class63.method4127(var214, var207.field3742, var215);
                                                            var213 = class135.field1959[class63.method920(var216, 96)];
                                                        }
                                                        var149.method2630(var155, var170, var183, var205, var206, var208, var188, var189, var190, var191, class63.method2824(var196, var192), class63.method2824(var196, var193), class63.method2824(var196, var194), class63.method2824(var196, var195), class63.method920(var210, var192), class63.method920(var210, var193), class63.method920(var210, var194), class63.method920(var210, var195), var204, var213);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var217 = 1; var217 < 103; var217++) {
                                    for (int var218 = 1; var218 < 103; var218++) {
                                        int var223;
                                        if ((class63.field740[var155][var218][var217] & 0x8) != 0) {
                                            var223 = 0;
                                        } else if (var155 <= 0 || (class63.field740[1][var218][var217] & 0x2) == 0) {
                                            var223 = var155;
                                        } else {
                                            var223 = var155 - 1;
                                        }
                                        var149.method2807(var155, var218, var217, var223);
                                    }
                                }
                                Statics.field742[var155] = (byte[][]) null;
                                Statics.field743[var155] = (byte[][]) null;
                                Statics.field744[var155] = (byte[][]) null;
                                Statics.field749[var155] = (byte[][]) null;
                                Statics.field3832[var155] = (byte[][]) null;
                            }
                            var149.method2656(-50, -10, -50);
                            for (int var224 = 0; var224 < 104; var224++) {
                                for (int var225 = 0; var225 < 104; var225++) {
                                    if ((class63.field740[1][var224][var225] & 0x2) == 2) {
                                        var149.method2627(var224, var225);
                                    }
                                }
                            }
                            int var226 = 1;
                            int var227 = 2;
                            int var228 = 4;
                            for (int var229 = 0; var229 < 4; var229++) {
                                if (var229 > 0) {
                                    var226 <<= 0x3;
                                    var227 <<= 0x3;
                                    var228 <<= 0x3;
                                }
                                for (int var230 = 0; var230 <= var229; var230++) {
                                    for (int var231 = 0; var231 <= 104; var231++) {
                                        for (int var232 = 0; var232 <= 104; var232++) {
                                            if ((Statics.field2521[var230][var232][var231] & var226) != 0) {
                                                int var233 = var231;
                                                int var234 = var231;
                                                int var235 = var230;
                                                int var236 = var230;
                                                while (var233 > 0 && (Statics.field2521[var230][var232][var233 - 1] & var226) != 0) {
                                                    var233--;
                                                }
                                                while (var234 < 104 && (Statics.field2521[var230][var232][var234 + 1] & var226) != 0) {
                                                    var234++;
                                                }
                                                label802: while (var235 > 0) {
                                                    for (int var237 = var233; var237 <= var234; var237++) {
                                                        if ((Statics.field2521[var235 - 1][var232][var237] & var226) == 0) {
                                                            break label802;
                                                        }
                                                    }
                                                    var235--;
                                                }
                                                label791: while (var236 < var229) {
                                                    for (int var238 = var233; var238 <= var234; var238++) {
                                                        if ((Statics.field2521[var236 + 1][var232][var238] & var226) == 0) {
                                                            break label791;
                                                        }
                                                    }
                                                    var236++;
                                                }
                                                int var239 = (var236 + 1 - var235) * (var234 - var233 + 1);
                                                if (var239 >= 8) {
                                                    short var240 = 240;
                                                    int var241 = class63.field745[var236][var232][var233] - var240;
                                                    int var242 = class63.field745[var235][var232][var233];
                                                    class138.method2628(var229, 1, var232 * 128, var232 * 128, var233 * 128, var234 * 128 + 128, var241, var242);
                                                    for (int var243 = var235; var243 <= var236; var243++) {
                                                        for (int var244 = var233; var244 <= var234; var244++) {
                                                            Statics.field2521[var243][var232][var244] &= ~var226;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field2521[var230][var232][var231] & var227) != 0) {
                                                int var245 = var232;
                                                int var246 = var232;
                                                int var247 = var230;
                                                int var248 = var230;
                                                while (var245 > 0 && (Statics.field2521[var230][var245 - 1][var231] & var227) != 0) {
                                                    var245--;
                                                }
                                                while (var246 < 104 && (Statics.field2521[var230][var246 + 1][var231] & var227) != 0) {
                                                    var246++;
                                                }
                                                label855: while (var247 > 0) {
                                                    for (int var249 = var245; var249 <= var246; var249++) {
                                                        if ((Statics.field2521[var247 - 1][var249][var231] & var227) == 0) {
                                                            break label855;
                                                        }
                                                    }
                                                    var247--;
                                                }
                                                label844: while (var248 < var229) {
                                                    for (int var250 = var245; var250 <= var246; var250++) {
                                                        if ((Statics.field2521[var248 + 1][var250][var231] & var227) == 0) {
                                                            break label844;
                                                        }
                                                    }
                                                    var248++;
                                                }
                                                int var251 = (var248 + 1 - var247) * (var246 - var245 + 1);
                                                if (var251 >= 8) {
                                                    short var252 = 240;
                                                    int var253 = class63.field745[var248][var245][var231] - var252;
                                                    int var254 = class63.field745[var247][var245][var231];
                                                    class138.method2628(var229, 2, var245 * 128, var246 * 128 + 128, var231 * 128, var231 * 128, var253, var254);
                                                    for (int var255 = var247; var255 <= var248; var255++) {
                                                        for (int var256 = var245; var256 <= var246; var256++) {
                                                            Statics.field2521[var255][var256][var231] &= ~var227;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field2521[var230][var232][var231] & var228) != 0) {
                                                int var257 = var232;
                                                int var258 = var232;
                                                int var259 = var231;
                                                int var260 = var231;
                                                while (var259 > 0 && (Statics.field2521[var230][var232][var259 - 1] & var228) != 0) {
                                                    var259--;
                                                }
                                                while (var260 < 104 && (Statics.field2521[var230][var232][var260 + 1] & var228) != 0) {
                                                    var260++;
                                                }
                                                label908: while (var257 > 0) {
                                                    for (int var261 = var259; var261 <= var260; var261++) {
                                                        if ((Statics.field2521[var230][var257 - 1][var261] & var228) == 0) {
                                                            break label908;
                                                        }
                                                    }
                                                    var257--;
                                                }
                                                label897: while (var258 < 104) {
                                                    for (int var262 = var259; var262 <= var260; var262++) {
                                                        if ((Statics.field2521[var230][var258 + 1][var262] & var228) == 0) {
                                                            break label897;
                                                        }
                                                    }
                                                    var258++;
                                                }
                                                if ((var258 - var257 + 1) * (var260 - var259 + 1) >= 4) {
                                                    int var263 = class63.field745[var230][var257][var259];
                                                    class138.method2628(var229, 4, var257 * 128, var258 * 128 + 128, var259 * 128, var260 * 128 + 128, var263, var263);
                                                    for (int var264 = var257; var264 <= var258; var264++) {
                                                        for (int var265 = var259; var265 <= var260; var265++) {
                                                            Statics.field2521[var230][var264][var265] &= ~var228;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method722(true);
                            int var266 = class63.field748;
                            if (var266 > Statics.field270) {
                                var266 = Statics.field270;
                            }
                            if (var266 < Statics.field270 - 1) {
                                int var267 = Statics.field270 - 1;
                            }
                            if (field875) {
                                Statics.field3341.method2626(class63.field748);
                            } else {
                                Statics.field3341.method2626(0);
                            }
                            for (int var268 = 0; var268 < 104; var268++) {
                                for (int var269 = 0; var269 < 104; var269++) {
                                    method142(var268, var269);
                                }
                            }
                            Statics.method35();
                            for (class75 var270 = (class75) field999.method3707(); var270 != null; var270 = (class75) field999.method3697()) {
                                if (var270.field1154 == -1) {
                                    var270.field1153 = 0;
                                    method1134(var270);
                                } else {
                                    var270.method3681();
                                }
                            }
                            class283.field3594.method3604();
                            if (Statics.field359.method813()) {
                                class185 var271 = class185.method267(class182.field2434, field958.field1485);
                                var271.field2505.method3405(1057001181);
                                field958.method1882(var271);
                            }
                            if (!field928) {
                                int var272 = (Statics.field762 - 6) / 8;
                                int var273 = (Statics.field762 + 6) / 8;
                                int var274 = (Statics.field302 - 6) / 8;
                                int var275 = (Statics.field302 + 6) / 8;
                                for (int var276 = var272 - 1; var276 <= var273 + 1; var276++) {
                                    for (int var277 = var274 - 1; var277 <= var275 + 1; var277++) {
                                        if (var276 < var272 || var276 > var273 || var277 < var274 || var277 > var275) {
                                            Statics.field814.method4181("m" + var276 + "_" + var277);
                                            Statics.field814.method4181("l" + var276 + "_" + var277);
                                        }
                                    }
                                }
                            }
                            method1003(30);
                            Statics.method35();
                            class63.method1721();
                            class185 var278 = class185.method267(class182.field2465, field958.field1485);
                            field958.method1882(var278);
                            Statics.field2131.method2934();
                            for (int var279 = 0; var279 < 32; var279++) {
                                field689[var279] = 0L;
                            }
                            for (int var280 = 0; var280 < 32; var280++) {
                                field710[var280] = 0L;
                            }
                            Statics.field685 = 0;
                        } else {
                            field925 = 2;
                        }
                    } else {
                        field925 = 1;
                    }
                }
                if (field880 == 30) {
                    this.method1145();
                } else if (field880 == 40 || field880 == 45) {
                    this.method1144();
                }
                return;
            }
            var2.field3371.method4264(var2.field3369, (int) var2.field2652, var2.field3368, false);
        }
    }

    @ObfuscatedName("client.ac(ZB)V")
    public final void method892(boolean arg0) {
        boolean var2;
        label145: {
            try {
                if (class230.field2688 == 2) {
                    if (Statics.field1301 == null) {
                        Statics.field1301 = class236.method3981(Statics.field2512, Statics.field1932, Statics.field285);
                        if (Statics.field1301 == null) {
                            var2 = false;
                            break label145;
                        }
                    }
                    if (Statics.field1966 == null) {
                        Statics.field1966 = new class111(Statics.field2690, Statics.field2692);
                    }
                    if (Statics.field2691.method3802(Statics.field1301, Statics.field2689, Statics.field1966, 22050)) {
                        Statics.field2691.method3803();
                        Statics.field2691.method3800(Statics.field1331);
                        Statics.field2691.method3805(Statics.field1301, Statics.field2693);
                        class230.field2688 = 0;
                        Statics.field1301 = null;
                        Statics.field1966 = null;
                        Statics.field2512 = null;
                        var2 = true;
                        break label145;
                    }
                }
            } catch (Exception var11) {
                var11.printStackTrace();
                Statics.field2691.method3806();
                class230.field2688 = 0;
                Statics.field1301 = null;
                Statics.field1966 = null;
                Statics.field2512 = null;
            }
            var2 = false;
        }
        if (var2 && field1103 && Statics.field2162 != null) {
            Statics.field2162.method2025();
        }
        if ((field880 == 10 || field880 == 20 || field880 == 30) && field1081 != 0L && class197.method1005() > field1081) {
            int var5 = field1025 ? 2 : 1;
            method719(var5);
        }
        if (arg0) {
            for (int var6 = 0; var6 < 100; var6++) {
                field1073[var6] = true;
            }
        }
        if (field880 == 0) {
            this.method808(class91.field1374, class91.field1363, arg0);
        } else if (field880 == 5) {
            class91.method3974(Statics.field830, Statics.field653, Statics.field338, arg0);
        } else if (field880 == 10 || field880 == 11) {
            class91.method3974(Statics.field830, Statics.field653, Statics.field338, arg0);
        } else if (field880 == 20) {
            class91.method3974(Statics.field830, Statics.field653, Statics.field338, arg0);
        } else if (field880 == 25) {
            if (field925 == 1) {
                if (field921 > field922) {
                    field922 = field921;
                }
                int var7 = (field922 * 50 - field921 * 50) / field922;
                method1536(class252.field3035 + class87.field1335 + class87.field1329 + var7 + "%" + class87.field1333, false);
            } else if (field925 == 2) {
                if (field923 > field924) {
                    field924 = field923;
                }
                int var8 = (field924 * 50 - field923 * 50) / field924 + 50;
                method1536(class252.field3035 + class87.field1335 + class87.field1329 + var8 + "%" + class87.field1333, false);
            } else {
                method1536(class252.field3035, false);
            }
        } else if (field880 == 30) {
            this.method1147();
        } else if (field880 == 40) {
            method1536(class252.field3036 + class87.field1335 + class252.field3264, false);
        } else if (field880 == 45) {
            method1536(class252.field3123, false);
        }
        if (field880 == 30 && field1080 == 0 && !arg0 && !field1025) {
            for (int var9 = 0; var9 < field927; var9++) {
                if (field1074[var9]) {
                    Statics.field535.method763(field1042[var9], field1077[var9], field1071[var9], field1079[var9]);
                    field1074[var9] = false;
                }
            }
        } else if (field880 > 0) {
            Statics.field535.method762(0, 0);
            for (int var10 = 0; var10 < field927; var10++) {
                field1074[var10] = false;
            }
        }
    }

    @ObfuscatedName("client.aa(B)V")
    public final void method807() {
        if (Statics.field1973.method1805()) {
            Statics.field1973.method1802();
        }
        if (Statics.field521 != null) {
            Statics.field521.field819 = false;
        }
        Statics.field521 = null;
        field958.method1874();
        if (class52.field637 != null) {
            class52 var1 = class52.field637;
            synchronized (class52.field637) {
                class52.field637 = null;
            }
        }
        if (class61.field718 != null) {
            class61 var3 = class61.field718;
            synchronized (class61.field718) {
                class61.field718 = null;
            }
        }
        Statics.field1361 = null;
        if (Statics.field2162 != null) {
            Statics.field2162.method2029();
        }
        if (Statics.field831 != null) {
            Statics.field831.method2029();
        }
        if (Statics.field3425 != null) {
            Statics.field3425.method3014();
        }
        Object var5 = class263.field3398;
        synchronized (class263.field3398) {
            if (class263.field3402 != 0) {
                class263.field3402 = 1;
                try {
                    class263.field3398.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        if (Statics.field593 != null) {
            Statics.field593.method2837();
            Statics.field593 = null;
        }
        class168.method524();
    }

    @ObfuscatedName("be.eq(II)V")
    public static void method1003(int arg0) {
        if (field880 == arg0) {
            return;
        }
        if (field880 == 0) {
            Statics.field359.method809();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field904 = 0;
            field984 = 0;
            field906 = 0;
            field919.method4824(arg0);
            if (arg0 != 20) {
                method221(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2070 != null) {
            Statics.field2070.method3014();
            Statics.field2070 = null;
        }
        if (field880 == 25) {
            field925 = 0;
            field921 = 0;
            field922 = 1;
            field923 = 0;
            field924 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class91.method1117(Statics.field3829, Statics.field2147, true, 0);
        } else if (arg0 == 20) {
            class91.method1117(Statics.field3829, Statics.field2147, true, field880 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class91.method1117(Statics.field3829, Statics.field2147, false, 4);
        } else if (Statics.field1388) {
            Statics.field3399 = null;
            Statics.field1389 = null;
            Statics.field1362 = null;
            Statics.field3939 = null;
            Statics.field1382 = null;
            Statics.field467 = null;
            Statics.field674 = null;
            Statics.field1364 = null;
            Statics.field1394 = null;
            Statics.field41 = null;
            Statics.field277 = null;
            Statics.field2781 = null;
            Statics.field1226 = null;
            Statics.field2224 = null;
            Statics.field348 = null;
            Statics.field763 = null;
            Statics.field299 = null;
            Statics.field345 = null;
            Statics.field820 = null;
            Statics.field288 = null;
            Statics.field2514 = null;
            Statics.field1586 = null;
            class230.field2688 = 1;
            Statics.field2512 = null;
            Statics.field1932 = -1;
            Statics.field285 = -1;
            Statics.field1331 = 0;
            Statics.field2693 = false;
            Statics.field12 = 2;
            class265.method1708(true);
            Statics.field1388 = false;
        }
        field880 = arg0;
    }

    @ObfuscatedName("client.ev(I)V")
    public void method1141() {
        if (field880 != 1000) {
            boolean var1 = class265.method871();
            if (!var1) {
                this.method1142();
            }
        }
    }

    @ObfuscatedName("client.ek(I)V")
    public void method1142() {
        if (class265.field3431 >= 4) {
            this.method810("js5crc");
            field880 = 1000;
            return;
        }
        if (class265.field3432 >= 4) {
            if (field880 <= 5) {
                this.method810("js5io");
                field880 = 1000;
                return;
            }
            field1047 = 3000;
            class265.field3432 = 3;
        }
        if (--field1047 + 1 > 0) {
            return;
        }
        try {
            if (field901 == 0) {
                Statics.field298 = Statics.field683.method2982(Statics.field1423, Statics.field2050);
                field901++;
            }
            if (field901 == 1) {
                if (Statics.field298.field2204 == 2) {
                    this.method1375(-1);
                    return;
                }
                if (Statics.field298.field2204 == 1) {
                    field901++;
                }
            }
            if (field901 == 2) {
                if (field918) {
                    Statics.field23 = Statics.method1006((Socket) Statics.field298.field2206, 40000, 5000);
                } else {
                    Statics.field23 = new class174((Socket) Statics.field298.field2206, Statics.field683, 5000);
                }
                class195 var1 = new class195(5);
                var1.method3189(15);
                var1.method3405(168);
                Statics.field23.method3020(var1.field2574, 0, 5);
                field901++;
                Statics.field464 = class197.method1005();
            }
            if (field901 == 3) {
                if (Statics.field23.method3028() > 0 || !field918 && field880 <= 5) {
                    int var2 = Statics.field23.method3011();
                    if (var2 != 0) {
                        this.method1375(var2);
                        return;
                    }
                    field901++;
                } else if (class197.method1005() - Statics.field464 > 30000L) {
                    this.method1375(-2);
                    return;
                }
            }
            if (field901 == 4) {
                class265.method1030(Statics.field23, field880 > 20);
                Statics.field298 = null;
                Statics.field23 = null;
                field901 = 0;
                field903 = 0;
            }
        } catch (IOException var4) {
            this.method1375(-3);
        }
    }

    @ObfuscatedName("client.er(IB)V")
    public void method1375(int arg0) {
        Statics.field298 = null;
        Statics.field23 = null;
        field901 = 0;
        if (Statics.field2687 == Statics.field2050) {
            Statics.field2050 = Statics.field2961;
        } else {
            Statics.field2050 = Statics.field2687;
        }
        field903++;
        if (field903 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field880 <= 5) {
                this.method810("js5connect_full");
                field880 = 1000;
            } else {
                field1047 = 3000;
            }
        } else if (field903 >= 2 && arg0 == 6) {
            this.method810("js5connect_outofdate");
            field880 = 1000;
        } else if (field903 >= 4) {
            if (field880 <= 5) {
                this.method810("js5connect");
                field880 = 1000;
            } else {
                field1047 = 3000;
            }
        }
    }

    @ObfuscatedName("bo.ee(Ljn;Ljava/lang/String;I)V")
    public static void method995(class264 arg0, String arg1) {
        class65 var2 = new class65(arg0, arg1);
        field872.add(var2);
    }

    @ObfuscatedName("fw.eh(I)V")
    public static void method2937() {
        if (field900 == 0) {
            Statics.field3341 = new class138(4, 104, 104, class63.field745);
            for (int var0 = 0; var0 < 4; var0++) {
                field893[var0] = new class177(104, 104);
            }
            Statics.field240 = new class332(512, 512);
            class91.field1363 = class252.field3038;
            class91.field1374 = 5;
            field900 = 20;
        } else if (field900 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class135.field1963[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class138.method2660(var1, 500, 800, 512, 334);
            class91.field1363 = class252.field3279;
            class91.field1374 = 10;
            field900 = 30;
        } else if (field900 == 30) {
            Statics.field833 = method3433(0, false, true, true);
            Statics.field1442 = method3433(1, false, true, true);
            Statics.field367 = method3433(2, true, false, true);
            Statics.field397 = method3433(3, false, true, true);
            Statics.field654 = method3433(4, false, true, true);
            Statics.field814 = method3433(5, true, true, true);
            Statics.field2606 = method3433(6, true, true, true);
            Statics.field324 = method3433(7, false, true, true);
            Statics.field2147 = method3433(8, false, true, true);
            Statics.field650 = method3433(9, false, true, true);
            Statics.field3829 = method3433(10, false, true, true);
            Statics.field2531 = method3433(11, false, true, true);
            Statics.field2533 = method3433(12, false, true, true);
            Statics.field640 = method3433(13, true, false, true);
            Statics.field545 = method3433(14, false, true, true);
            Statics.field811 = method3433(15, false, true, true);
            Statics.field1455 = method3433(16, true, true, true);
            class91.field1363 = class252.field3040;
            class91.field1374 = 20;
            field900 = 40;
        } else if (field900 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field833.method4261() * 4 / 100;
            int var8 = var7 + Statics.field1442.method4261() * 4 / 100;
            int var9 = var8 + Statics.field367.method4261() * 2 / 100;
            int var10 = var9 + Statics.field397.method4261() * 2 / 100;
            int var11 = var10 + Statics.field654.method4261() * 6 / 100;
            int var12 = var11 + Statics.field814.method4261() * 4 / 100;
            int var13 = var12 + Statics.field2606.method4261() * 2 / 100;
            int var14 = var13 + Statics.field324.method4261() * 58 / 100;
            int var15 = var14 + Statics.field2147.method4261() * 2 / 100;
            int var16 = var15 + Statics.field650.method4261() * 2 / 100;
            int var17 = var16 + Statics.field3829.method4261() * 2 / 100;
            int var18 = var17 + Statics.field2531.method4261() * 2 / 100;
            int var19 = var18 + Statics.field2533.method4261() * 2 / 100;
            int var20 = var19 + Statics.field640.method4261() * 2 / 100;
            int var21 = var20 + Statics.field545.method4261() * 2 / 100;
            int var22 = var21 + Statics.field811.method4261() * 2 / 100;
            int var23 = var22 + Statics.field1455.method4261() * 2 / 100;
            if (var23 == 100) {
                method995(Statics.field833, "Animations");
                method995(Statics.field1442, "Skeletons");
                method995(Statics.field654, "Sound FX");
                method995(Statics.field814, "Maps");
                method995(Statics.field2606, "Music Tracks");
                method995(Statics.field324, "Models");
                method995(Statics.field2147, "Sprites");
                method995(Statics.field2531, "Music Jingles");
                method995(Statics.field545, "Music Samples");
                method995(Statics.field811, "Music Patches");
                method995(Statics.field1455, "World Map");
                class91.field1363 = class252.field3215;
                class91.field1374 = 30;
                field900 = 45;
            } else {
                if (var23 != 0) {
                    class91.field1363 = class252.field3071 + var23 + "%";
                }
                class91.field1374 = 30;
            }
        } else if (field900 == 45) {
            class108.method1532(22050, !field875, 2);
            class231 var24 = new class231();
            var24.method3846(9, 128);
            Statics.field2162 = class108.method4851(Statics.field683, 0, 22050);
            Statics.field2162.method2031(var24);
            class230.method4(Statics.field811, Statics.field545, Statics.field654, var24);
            Statics.field831 = class108.method4851(Statics.field683, 1, 2048);
            Statics.field728 = new class101();
            Statics.field831.method2031(Statics.field728);
            Statics.field447 = new class115(22050, Statics.field1582);
            class91.field1363 = class252.field3043;
            class91.field1374 = 35;
            field900 = 50;
            Statics.field1972 = new class311(Statics.field2147, Statics.field640);
        } else if (field900 == 50) {
            class310[] var25 = new class310[] { class310.field3880, class310.field3879, class310.field3881, class310.field3882, class310.field3883, class310.field3887 };
            int var26 = var25.length;
            class311 var27 = Statics.field1972;
            class310[] var28 = new class310[] { class310.field3880, class310.field3879, class310.field3881, class310.field3882, class310.field3883, class310.field3887 };
            field905 = var27.method5069(var28);
            if (field905.size() < var26) {
                class91.field1363 = class252.field3044 + field905.size() * 100 / var26 + "%";
                class91.field1374 = 40;
            } else {
                Statics.field653 = (class312) field905.get(class310.field3880);
                Statics.field338 = (class312) field905.get(class310.field3879);
                Statics.field830 = (class312) field905.get(class310.field3881);
                Statics.field1218 = new class338(true);
                class91.field1363 = class252.field3045;
                class91.field1374 = 40;
                field900 = 60;
            }
        } else if (field900 == 60) {
            class264 var29 = Statics.field3829;
            class264 var30 = Statics.field2147;
            int var31 = 0;
            if (var29.method4179("title.jpg", "")) {
                var31++;
            }
            if (var30.method4179("logo", "")) {
                var31++;
            }
            if (var30.method4179("logo_deadman_mode", "")) {
                var31++;
            }
            if (var30.method4179("titlebox", "")) {
                var31++;
            }
            if (var30.method4179("titlebutton", "")) {
                var31++;
            }
            if (var30.method4179("runes", "")) {
                var31++;
            }
            if (var30.method4179("title_mute", "")) {
                var31++;
            }
            if (var30.method4179("options_radio_buttons,0", "")) {
                var31++;
            }
            if (var30.method4179("options_radio_buttons,2", "")) {
                var31++;
            }
            if (var30.method4179("options_radio_buttons,4", "")) {
                var31++;
            }
            if (var30.method4179("options_radio_buttons,6", "")) {
                var31++;
            }
            var30.method4179("sl_back", "");
            var30.method4179("sl_flags", "");
            var30.method4179("sl_arrows", "");
            var30.method4179("sl_stars", "");
            var30.method4179("sl_button", "");
            int var34 = class91.method953();
            if (var31 < var34) {
                class91.field1363 = class252.field3109 + var31 * 100 / var34 + "%";
                class91.field1374 = 50;
            } else {
                class91.field1363 = class252.field3047;
                class91.field1374 = 50;
                method1003(5);
                field900 = 70;
            }
        } else if (field900 == 70) {
            if (Statics.field367.method4253()) {
                class264 var35 = Statics.field367;
                Statics.field306 = var35;
                class274.method4049(Statics.field367);
                class264 var36 = Statics.field367;
                class264 var37 = Statics.field324;
                Statics.field3512 = var36;
                Statics.field3517 = var37;
                Statics.field3520 = Statics.field3512.method4207(3);
                class283.method3448(Statics.field367, Statics.field324, field875);
                class264 var38 = Statics.field367;
                class264 var39 = Statics.field324;
                Statics.field3735 = var38;
                Statics.field3705 = var39;
                class280.method28(Statics.field367);
                class264 var40 = Statics.field367;
                class264 var41 = Statics.field324;
                boolean var42 = field874;
                class312 var43 = Statics.field653;
                Statics.field3646 = var40;
                Statics.field3647 = var41;
                Statics.field2177 = var42;
                Statics.field1584 = Statics.field3646.method4207(10);
                Statics.field446 = var43;
                class288.method1785(Statics.field367, Statics.field833, Statics.field1442);
                class273.method199(Statics.field367, Statics.field324);
                class264 var44 = Statics.field367;
                Statics.field3542 = var44;
                class269.method2881(Statics.field367);
                Statics.method1779(Statics.field397, Statics.field324, Statics.field2147, Statics.field640);
                class268.method178(Statics.field367);
                class281.method371(Statics.field367);
                class271.method2365(Statics.field367);
                class272.method161(Statics.field367);
                class264 var45 = Statics.field367;
                Statics.field3548 = var45;
                Statics.field1973 = new class95();
                class282.method4151(Statics.field367, Statics.field2147, Statics.field640);
                class276.method4667(Statics.field367, Statics.field2147);
                class270.method1119(Statics.field367, Statics.field2147);
                class91.field1363 = class252.field3049;
                class91.field1374 = 60;
                field900 = 80;
            } else {
                class91.field1363 = class252.field3048 + Statics.field367.method4268() + "%";
                class91.field1374 = 60;
            }
        } else if (field900 == 80) {
            int var46 = 0;
            if (Statics.field238 == null) {
                class264 var47 = Statics.field2147;
                int var48 = var47.method4175("compass");
                int var49 = var47.method4176(var48, "");
                class332 var50 = class333.method704(var47, var48, var49);
                Statics.field238 = var50;
            } else {
                var46++;
            }
            if (Statics.field932 == null) {
                class264 var51 = Statics.field2147;
                int var52 = var51.method4175("mapedge");
                int var53 = var51.method4176(var52, "");
                class332 var54 = class333.method704(var51, var52, var53);
                Statics.field932 = var54;
            } else {
                var46++;
            }
            if (Statics.field1799 == null) {
                Statics.field1799 = class333.method562(Statics.field2147, "mapscene", "");
            } else {
                var46++;
            }
            if (Statics.field712 == null) {
                Statics.field712 = class333.method4256(Statics.field2147, "headicons_pk", "");
            } else {
                var46++;
            }
            if (Statics.field3890 == null) {
                Statics.field3890 = class333.method4256(Statics.field2147, "headicons_prayer", "");
            } else {
                var46++;
            }
            if (Statics.field274 == null) {
                Statics.field274 = class333.method4256(Statics.field2147, "headicons_hint", "");
            } else {
                var46++;
            }
            if (Statics.field331 == null) {
                Statics.field331 = class333.method4256(Statics.field2147, "mapmarker", "");
            } else {
                var46++;
            }
            if (Statics.field3014 == null) {
                Statics.field3014 = class333.method4256(Statics.field2147, "cross", "");
            } else {
                var46++;
            }
            if (Statics.field607 == null) {
                Statics.field607 = class333.method4256(Statics.field2147, "mapdots", "");
            } else {
                var46++;
            }
            if (Statics.field322 == null) {
                Statics.field322 = class333.method562(Statics.field2147, "scrollbar", "");
            } else {
                var46++;
            }
            if (Statics.field25 == null) {
                Statics.field25 = class333.method562(Statics.field2147, "mod_icons", "");
            } else {
                var46++;
            }
            if (var46 < 11) {
                class91.field1363 = class252.field3073 + var46 * 100 / 12 + "%";
                class91.field1374 = 70;
            } else {
                Statics.field3904 = Statics.field25;
                Statics.field932.method5411();
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1799[0].method5385(var55 + var58, var56 + var58, var57 + var58);
                class91.field1363 = class252.field3235;
                class91.field1374 = 70;
                field900 = 90;
            }
        } else if (field900 == 90) {
            if (Statics.field650.method4253()) {
                Statics.field2962 = new class124(Statics.field650, Statics.field2147, 20, 0.8D, field875 ? 64 : 128);
                class135.method2557(Statics.field2962);
                class135.method2575(0.8D);
                field900 = 100;
            } else {
                class91.field1363 = class252.field3052 + "0%";
                class91.field1374 = 90;
            }
        } else if (field900 == 100) {
            int var59 = Statics.field2962.method2345();
            if (var59 < 100) {
                class91.field1363 = class252.field3052 + var59 + "%";
                class91.field1374 = 90;
            } else {
                class91.field1363 = class252.field3145;
                class91.field1374 = 90;
                field900 = 110;
            }
        } else if (field900 == 110) {
            Statics.field521 = new class70();
            Statics.field683.method2972(Statics.field521, 10);
            class91.field1363 = class252.field3180;
            class91.field1374 = 92;
            field900 = 120;
        } else if (field900 == 120) {
            if (Statics.field3829.method4179("huffman", "")) {
                class187 var60 = new class187(Statics.field3829.method4178("huffman", ""));
                Statics.field3918 = var60;
                class91.field1363 = class252.field3115;
                class91.field1374 = 94;
                field900 = 130;
            } else {
                class91.field1363 = class252.field3214 + "%";
                class91.field1374 = 94;
            }
        } else if (field900 == 130) {
            if (!Statics.field397.method4253()) {
                class91.field1363 = class252.field3057 + Statics.field397.method4268() * 4 / 5 + "%";
                class91.field1374 = 96;
            } else if (!Statics.field2533.method4253()) {
                class91.field1363 = class252.field3057 + (80 + Statics.field2533.method4268() / 6) + "%";
                class91.field1374 = 96;
            } else if (Statics.field640.method4253()) {
                class91.field1363 = class252.field3058;
                class91.field1374 = 98;
                field900 = 140;
            } else {
                class91.field1363 = class252.field3057 + (96 + Statics.field640.method4268() / 50) + "%";
                class91.field1374 = 96;
            }
        } else if (field900 == 140) {
            class91.field1374 = 100;
            if (Statics.field1455.method4180(class42.field536.field539)) {
                if (Statics.field1244 == null) {
                    Statics.field1244 = new class335();
                    Statics.field1244.method5567(Statics.field1455, Statics.field830, field905, Statics.field1799);
                }
                int var61 = Statics.field1244.method5618();
                if (var61 < 100) {
                    class91.field1363 = class252.field3059 + (var61 * 9 / 10 + 10) + "%";
                } else {
                    class91.field1363 = class252.field3268;
                    field900 = 150;
                }
            } else {
                class91.field1363 = class252.field3059 + Statics.field1455.method4182(class42.field536.field539) / 10 + "%";
            }
        } else if (field900 == 150) {
            method1003(10);
        }
    }

    @ObfuscatedName("gn.ec(IZZZI)Ljn;")
    public static class264 method3433(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class175 var4 = null;
        if (class168.field2225 != null) {
            var4 = new class175(arg0, class168.field2225, Statics.field371[arg0], 1000000);
        }
        return new class264(var4, Statics.field330, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.eu(B)V")
    public final void method1144() {
        class170 var1 = field958.method1870();
        class202 var2 = field958.field1492;
        try {
            if (field904 == 0) {
                if (var1 != null) {
                    var1.method3014();
                    var1 = null;
                }
                Statics.field365 = null;
                field917 = false;
                field984 = 0;
                field904 = 1;
            }
            if (field904 == 1) {
                if (Statics.field365 == null) {
                    Statics.field365 = Statics.field683.method2982(Statics.field1423, Statics.field2050);
                }
                if (Statics.field365.field2204 == 2) {
                    throw new IOException();
                }
                if (Statics.field365.field2204 == 1) {
                    if (field918) {
                        var1 = Statics.method1006((Socket) Statics.field365.field2206, 40000, 5000);
                    } else {
                        var1 = new class174((Socket) Statics.field365.field2206, Statics.field683, 5000);
                    }
                    field958.method1871(var1);
                    Statics.field365 = null;
                    field904 = 2;
                }
            }
            if (field904 == 2) {
                field958.method1868();
                class185 var3 = class185.method3121();
                var3.field2509 = null;
                var3.field2504 = 0;
                var3.field2505 = new class202(5000);
                var3.field2505.method3189(class183.field2489.field2488);
                field958.method1882(var3);
                field958.method1869();
                var2.field2575 = 0;
                field904 = 3;
            }
            if (field904 == 3) {
                if (Statics.field2162 != null) {
                    Statics.field2162.method2033();
                }
                if (Statics.field831 != null) {
                    Statics.field831.method2033();
                }
                boolean var6 = true;
                if (field918 && !var1.method3010(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method3011();
                    if (Statics.field2162 != null) {
                        Statics.field2162.method2033();
                    }
                    if (Statics.field831 != null) {
                        Statics.field831.method2033();
                    }
                    if (var7 != 0) {
                        method938(var7);
                        return;
                    }
                    var2.field2575 = 0;
                    field904 = 4;
                }
            }
            if (field904 == 4) {
                if (var2.field2575 < 8) {
                    int var8 = var1.method3028();
                    if (var8 > 8 - var2.field2575) {
                        var8 = 8 - var2.field2575;
                    }
                    if (var8 > 0) {
                        var1.method3024(var2.field2574, var2.field2575, var8);
                        var2.field2575 += var8;
                    }
                }
                if (var2.field2575 == 8) {
                    var2.field2575 = 0;
                    Statics.field2127 = var2.method3211();
                    field904 = 5;
                }
            }
            if (field904 == 5) {
                field958.field1492.field2575 = 0;
                field958.method1868();
                class202 var9 = new class202(500);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field2127 >> 32), (int) (Statics.field2127 & 0xFFFFFFFFFFFFFFFFL) };
                var9.field2575 = 0;
                var9.method3189(1);
                var9.method3189(field908.method8());
                var9.method3405(var10[0]);
                var9.method3405(var10[1]);
                var9.method3405(var10[2]);
                var9.method3405(var10[3]);
                switch(field908.field2175) {
                    case 0:
                        var9.method3405((Integer) Statics.field1142.field1248.get(class319.method3787(class91.field1381)));
                        var9.field2575 += 4;
                        break;
                    case 1:
                    case 3:
                        var9.method3191(Statics.field370);
                        var9.field2575 += 5;
                        break;
                    case 2:
                        var9.field2575 += 8;
                }
                var9.method3214(class91.field1393);
                var9.method3372(class89.field1346, class89.field1347);
                class185 var11 = class185.method3121();
                var11.field2509 = null;
                var11.field2504 = 0;
                var11.field2505 = new class202(5000);
                var11.field2505.field2575 = 0;
                if (field880 == 40) {
                    var11.field2505.method3189(class183.field2487.field2488);
                } else {
                    var11.field2505.method3189(class183.field2486.field2488);
                }
                var11.field2505.method3190(0);
                int var14 = var11.field2505.field2575;
                var11.field2505.method3405(168);
                var11.field2505.method3345(var9.field2574, 0, var9.field2575);
                int var15 = var11.field2505.field2575;
                var11.field2505.method3214(class91.field1381);
                var11.field2505.method3189((field1025 ? 1 : 0) << 1 | (field875 ? 1 : 0));
                var11.field2505.method3190(Statics.field472);
                var11.field2505.method3190(Statics.field3509);
                class202 var16 = var11.field2505;
                if (field909 == null) {
                    byte[] var17 = class168.method2938();
                    var16.method3345(var17, 0, var17.length);
                } else {
                    var16.method3345(field909, 0, field909.length);
                }
                var11.field2505.method3214(Statics.field658);
                var11.field2505.method3405(Statics.field796);
                class195 var18 = new class195(Statics.field1218.method5745());
                Statics.field1218.method5744(var18);
                var11.field2505.method3345(var18.field2574, 0, var18.field2574.length);
                var11.field2505.method3189(field878);
                var11.field2505.method3405(0);
                var11.field2505.method3405(Statics.field833.field3387);
                var11.field2505.method3405(Statics.field1442.field3387);
                var11.field2505.method3405(Statics.field367.field3387);
                var11.field2505.method3405(Statics.field397.field3387);
                var11.field2505.method3405(Statics.field654.field3387);
                var11.field2505.method3405(Statics.field814.field3387);
                var11.field2505.method3405(Statics.field2606.field3387);
                var11.field2505.method3405(Statics.field324.field3387);
                var11.field2505.method3405(Statics.field2147.field3387);
                var11.field2505.method3405(Statics.field650.field3387);
                var11.field2505.method3405(Statics.field3829.field3387);
                var11.field2505.method3405(Statics.field2531.field3387);
                var11.field2505.method3405(Statics.field2533.field3387);
                var11.field2505.method3405(Statics.field640.field3387);
                var11.field2505.method3405(Statics.field545.field3387);
                var11.field2505.method3405(Statics.field811.field3387);
                var11.field2505.method3405(Statics.field1455.field3387);
                var11.field2505.method3225(var10, var15, var11.field2505.field2575);
                var11.field2505.method3201(var11.field2505.field2575 - var14);
                field958.method1882(var11);
                field958.method1869();
                field958.field1485 = new class203(var10);
                for (int var19 = 0; var19 < 4; var19++) {
                    var10[var19] += 50;
                }
                var2.method3457(var10);
                field904 = 6;
            }
            if (field904 == 6 && var1.method3028() > 0) {
                int var20 = var1.method3011();
                if (var20 == 21 && field880 == 20) {
                    field904 = 7;
                } else if (var20 == 2) {
                    field904 = 9;
                } else if (var20 == 15 && field880 == 40) {
                    field958.field1482 = -1;
                    field904 = 13;
                } else if (var20 == 23 && field906 < 1) {
                    field906++;
                    field904 = 0;
                } else if (var20 == 29) {
                    field904 = 11;
                } else {
                    method938(var20);
                    return;
                }
            }
            if (field904 == 7 && var1.method3028() > 0) {
                field907 = (var1.method3011() + 3) * 60;
                field904 = 8;
            }
            if (field904 == 8) {
                field984 = 0;
                class91.method42(class252.field3080, class252.field3065, field907 / 60 + class252.field3066);
                if (--field907 <= 0) {
                    field904 = 0;
                }
            } else {
                if (field904 == 9 && var1.method3028() >= 13) {
                    boolean var21 = var1.method3011() == 1;
                    var1.method3024(var2.field2574, 0, 4);
                    var2.field2575 = 0;
                    boolean var22 = false;
                    if (var21) {
                        int var23 = var2.method3460() << 24;
                        int var24 = var23 | var2.method3460() << 16;
                        int var25 = var24 | var2.method3460() << 8;
                        int var26 = var25 | var2.method3460();
                        int var27 = class319.method3787(class91.field1381);
                        if (Statics.field1142.field1248.size() >= 10 && !Statics.field1142.field1248.containsKey(var27)) {
                            Iterator var28 = Statics.field1142.field1248.entrySet().iterator();
                            var28.next();
                            var28.remove();
                        }
                        Statics.field1142.field1248.put(var27, var26);
                    }
                    if (class91.field1383) {
                        Statics.field1142.field1246 = class91.field1381;
                    } else {
                        Statics.field1142.field1246 = null;
                    }
                    class79.method949();
                    field1102 = var1.method3011();
                    field1021 = var1.method3011() == 1;
                    field987 = var1.method3011();
                    field987 <<= 0x8;
                    field987 += var1.method3011();
                    field988 = var1.method3011();
                    var1.method3024(var2.field2574, 0, 1);
                    var2.field2575 = 0;
                    class181[] var29 = new class181[] { class181.field2326, class181.field2305, class181.field2376, class181.field2301, class181.field2302, class181.field2352, class181.field2304, class181.field2342, class181.field2306, class181.field2307, class181.field2308, class181.field2363, class181.field2310, class181.field2311, class181.field2312, class181.field2313, class181.field2314, class181.field2315, class181.field2345, class181.field2331, class181.field2327, class181.field2319, class181.field2320, class181.field2321, class181.field2322, class181.field2323, class181.field2329, class181.field2303, class181.field2334, class181.field2317, class181.field2328, class181.field2337, class181.field2330, class181.field2378, class181.field2332, class181.field2333, class181.field2380, class181.field2300, class181.field2336, class181.field2299, class181.field2338, class181.field2298, class181.field2340, class181.field2341, class181.field2370, class181.field2343, class181.field2344, class181.field2358, class181.field2346, class181.field2347, class181.field2348, class181.field2349, class181.field2350, class181.field2351, class181.field2362, class181.field2353, class181.field2354, class181.field2361, class181.field2339, class181.field2357, class181.field2318, class181.field2359, class181.field2325, class181.field2335, class181.field2369, class181.field2356, class181.field2364, class181.field2365, class181.field2366, class181.field2367, class181.field2368, class181.field2324, class181.field2382, class181.field2371, class181.field2372, class181.field2373, class181.field2374, class181.field2375, class181.field2316, class181.field2377, class181.field2355, class181.field2379, class181.field2360, class181.field2381 };
                    int var31 = var2.method3464();
                    if (var31 < 0 || var31 >= var29.length) {
                        throw new IOException(var31 + " " + var2.field2575);
                    }
                    field958.field1487 = var29[var31];
                    field958.field1482 = field958.field1487.field2383;
                    var1.method3024(var2.field2574, 0, 2);
                    var2.field2575 = 0;
                    field958.field1482 = var2.method3207();
                    try {
                        class54.method711(Statics.field359, "zap");
                    } catch (Throwable var38) {
                    }
                    field904 = 10;
                }
                if (field904 != 10) {
                    if (field904 == 11 && var1.method3028() >= 2) {
                        var2.field2575 = 0;
                        var1.method3024(var2.field2574, 0, 2);
                        var2.field2575 = 0;
                        Statics.field3946 = var2.method3207();
                        field904 = 12;
                    }
                    if (field904 == 12 && var1.method3028() >= Statics.field3946) {
                        var2.field2575 = 0;
                        var1.method3024(var2.field2574, 0, Statics.field3946);
                        var2.field2575 = 0;
                        String var33 = var2.method3284();
                        String var34 = var2.method3284();
                        String var35 = var2.method3284();
                        class91.method42(var33, var34, var35);
                        method1003(10);
                    }
                    if (field904 == 13) {
                        if (field958.field1482 == -1) {
                            if (var1.method3028() < 2) {
                                return;
                            }
                            var1.method3024(var2.field2574, 0, 2);
                            var2.field2575 = 0;
                            field958.field1482 = var2.method3207();
                        }
                        if (var1.method3028() >= field958.field1482) {
                            var1.method3024(var2.field2574, 0, field958.field1482);
                            var2.field2575 = 0;
                            int var36 = field958.field1482;
                            field919.method4842();
                            method511();
                            class94.method7(var2);
                            if (var2.field2575 != var36) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field984++;
                        if (field984 > 2000) {
                            if (field906 < 1) {
                                if (Statics.field2687 == Statics.field2050) {
                                    Statics.field2050 = Statics.field2961;
                                } else {
                                    Statics.field2050 = Statics.field2687;
                                }
                                field906++;
                                field904 = 0;
                            } else {
                                method938(-3);
                            }
                        }
                    }
                } else if (var1.method3028() >= field958.field1482) {
                    var2.field2575 = 0;
                    var1.method3024(var2.field2574, 0, field958.field1482);
                    field919.method4825();
                    method1023();
                    class94.method7(var2);
                    Statics.field762 = -1;
                    method6(false, var2);
                    field958.field1487 = null;
                }
            }
        } catch (IOException var39) {
            if (field906 < 1) {
                if (Statics.field2687 == Statics.field2050) {
                    Statics.field2050 = Statics.field2961;
                } else {
                    Statics.field2050 = Statics.field2687;
                }
                field906++;
                field904 = 0;
            } else {
                method938(-2);
            }
        }
    }

    @ObfuscatedName("bt.eg(B)V")
    public static void method1023() {
        field1107 = 1L;
        field886 = -1;
        Statics.field521.field817 = 0;
        Statics.field2799 = true;
        field887 = true;
        field1092 = -1L;
        class327.method2862();
        field958.method1868();
        field958.field1492.field2575 = 0;
        field958.field1487 = null;
        field958.field1496 = null;
        field958.field1493 = null;
        field958.field1494 = null;
        field958.field1482 = 0;
        field958.field1481 = 0;
        field889 = 0;
        field916 = 0;
        field890 = 0;
        field1004 = 0;
        field1069 = false;
        class61.method189(0);
        class96.field1452.clear();
        class96.field1451.method3569();
        class96.field1454.method3769();
        class96.field1453 = 0;
        field1023 = 0;
        field895 = false;
        field1106 = 0;
        field1044 = 0;
        field961 = 0;
        Statics.field26 = null;
        field1100 = 0;
        field882 = -1;
        field1137 = 0;
        field1099 = 0;
        field998 = class90.field1352;
        field1011 = class90.field1352;
        field1131 = 0;
        class94.field1432 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class94.field1431[var0] = null;
            class94.field1430[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field986[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field910[var2] = null;
        }
        field1113 = -1;
        field1000.method3695();
        field1001.method3695();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field915[var3][var4][var5] = null;
                }
            }
        }
        field999 = new class218();
        Statics.field426.method1611();
        for (int var6 = 0; var6 < Statics.field3778; var6++) {
            class269 var7 = (class269) class269.field3452.method3601((long) var6);
            class269 var8;
            if (var7 == null) {
                byte[] var9 = Statics.field3451.method4241(16, var6);
                class269 var10 = new class269();
                if (var9 != null) {
                    var10.method4341(new class195(var9));
                }
                class269.field3452.method3603(var10, (long) var6);
                var8 = var10;
            } else {
                var8 = var7;
            }
            if (var8 != null) {
                class238.field2778[var6] = 0;
                class238.field2779[var6] = 0;
            }
        }
        Statics.field1973.method1800();
        field1049 = -1;
        if (field1016 != -1) {
            int var12 = field1016;
            if (var12 != -1 && Statics.field2158[var12]) {
                Statics.field2137.method4172(var12);
                if (Statics.field812[var12] != null) {
                    boolean var13 = true;
                    for (int var14 = 0; var14 < Statics.field812[var12].length; var14++) {
                        if (Statics.field812[var12][var14] != null) {
                            if (Statics.field812[var12][var14].field2825 == 2) {
                                var13 = false;
                            } else {
                                Statics.field812[var12][var14] = null;
                            }
                        }
                    }
                    if (var13) {
                        Statics.field812[var12] = null;
                    }
                    Statics.field2158[var12] = false;
                }
            }
        }
        for (class68 var15 = (class68) field1031.method3641(); var15 != null; var15 = (class68) field1031.method3640()) {
            method757(var15, true);
        }
        field1016 = -1;
        field1031 = new class215(8);
        field1034 = null;
        field1004 = 0;
        field1069 = false;
        field1133.method4035((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var16 = 0; var16 < 8; var16++) {
            field994[var16] = null;
            field995[var16] = false;
        }
        class66.method506();
        field881 = true;
        for (int var17 = 0; var17 < 100; var17++) {
            field1073[var17] = true;
        }
        method957();
        Statics.field696 = null;
        for (int var18 = 0; var18 < 8; var18++) {
            field1134[var18] = new class17();
        }
        Statics.field656 = null;
    }

    @ObfuscatedName("av.fc(B)V")
    public static void method511() {
        field958.method1868();
        field958.field1492.field2575 = 0;
        field958.field1487 = null;
        field958.field1496 = null;
        field958.field1493 = null;
        field958.field1494 = null;
        field958.field1482 = 0;
        field958.field1481 = 0;
        field889 = 0;
        field1004 = 0;
        field1069 = false;
        field1100 = 0;
        field1137 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field986[var0] = null;
        }
        Statics.field642 = null;
        for (int var1 = 0; var1 < field910.length; var1++) {
            class85 var2 = field910[var1];
            if (var2 != null) {
                var2.field1207 = -1;
                var2.field1157 = false;
            }
        }
        class66.method506();
        method1003(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field1073[var3] = true;
        }
        method957();
    }

    @ObfuscatedName("bk.fu(II)V")
    public static void method938(int arg0) {
        if (arg0 == -3) {
            class91.method42(class252.field3067, class252.field3054, class252.field3154);
        } else if (arg0 == -2) {
            class91.method42(class252.field3070, class252.field3182, class252.field3072);
        } else if (arg0 == -1) {
            class91.method42(class252.field3220, class252.field3074, class252.field3116);
        } else if (arg0 == 3) {
            class91.field1376 = 3;
        } else if (arg0 == 4) {
            class91.method42(class252.field3282, class252.field3077, class252.field3158);
        } else if (arg0 == 5) {
            class91.method42(class252.field3118, class252.field3241, class252.field3081);
        } else if (arg0 == 6) {
            class91.method42(class252.field3082, class252.field3083, class252.field3084);
        } else if (arg0 == 7) {
            class91.method42(class252.field3085, class252.field3086, class252.field3087);
        } else if (arg0 == 8) {
            class91.method42(class252.field3056, class252.field3151, class252.field3090);
        } else if (arg0 == 9) {
            class91.method42(class252.field3091, class252.field3104, class252.field3093);
        } else if (arg0 == 10) {
            class91.method42(class252.field3094, class252.field3095, class252.field3096);
        } else if (arg0 == 11) {
            class91.method42(class252.field3255, class252.field3236, class252.field3099);
        } else if (arg0 == 12) {
            class91.method42(class252.field3100, class252.field3101, class252.field3102);
        } else if (arg0 == 13) {
            class91.method42(class252.field3103, class252.field3209, class252.field3181);
        } else if (arg0 == 14) {
            class91.method42(class252.field3225, class252.field3107, class252.field3108);
        } else if (arg0 == 16) {
            class91.method42(class252.field3300, class252.field3110, class252.field3111);
        } else if (arg0 == 17) {
            class91.method42(class252.field3112, class252.field3113, class252.field3114);
        } else if (arg0 == 18) {
            class91.method42(class252.field3029, class252.field3068, class252.field3117);
        } else if (arg0 == 19) {
            class91.method42(class252.field3259, class252.field3119, class252.field3251);
        } else if (arg0 == 20) {
            class91.method42(class252.field3121, class252.field3122, class252.field3098);
        } else if (arg0 == 22) {
            class91.method42(class252.field3124, class252.field3125, class252.field3126);
        } else if (arg0 == 23) {
            class91.method42(class252.field3127, class252.field3128, class252.field3129);
        } else if (arg0 == 24) {
            class91.method42(class252.field3130, class252.field3131, class252.field3132);
        } else if (arg0 == 25) {
            class91.method42(class252.field3088, class252.field3134, class252.field3135);
        } else if (arg0 == 26) {
            class91.method42(class252.field3136, class252.field3137, class252.field3024);
        } else if (arg0 == 27) {
            class91.method42(class252.field3139, class252.field3234, class252.field3141);
        } else if (arg0 == 31) {
            class91.method42(class252.field3148, class252.field3149, class252.field3150);
        } else if (arg0 == 32) {
            class91.method42(class252.field3303, class252.field3152, class252.field3153);
        } else if (arg0 == 37) {
            class91.method42(class252.field3161, class252.field3097, class252.field3144);
        } else if (arg0 == 38) {
            class91.method42(class252.field3164, class252.field3217, class252.field3133);
        } else if (arg0 == 55) {
            class91.method42(class252.field3160, class252.field3284, class252.field3290);
        } else if (arg0 == 56) {
            class91.method42(class252.field3276, class252.field3190, class252.field3162);
            method1003(11);
            return;
        } else if (arg0 == 57) {
            class91.method42(class252.field3166, class252.field3167, class252.field3168);
            method1003(11);
            return;
        } else {
            class91.method42(class252.field3169, class252.field3170, class252.field3171);
        }
        method1003(10);
    }

    @ObfuscatedName("js.fg(I)V")
    public static final void method4350() {
        field958.method1874();
        class287.field3752.method3604();
        class274.field3503.method3604();
        class275.field3514.method3604();
        class283.method3106();
        class286.method4134();
        class284.field3673.method3604();
        class284.field3697.method3604();
        class284.field3650.method3604();
        class288.method5190();
        class273.method1731();
        class278.field3540.method3604();
        class269.method226();
        class282.field3569.method3604();
        class282.field3570.method3604();
        class282.field3571.method3604();
        class276.field3525.method3604();
        class276.field3532.method3604();
        class280.field3554.method3604();
        class279.method1827();
        class270.method4139();
        class240.method3033();
        Statics.method190();
        ((class124) Statics.field1950).method2346();
        class97.field1460.method3604();
        Statics.field833.method4173();
        Statics.field1442.method4173();
        Statics.field397.method4173();
        Statics.field654.method4173();
        Statics.field814.method4173();
        Statics.field2606.method4173();
        Statics.field324.method4173();
        Statics.field2147.method4173();
        Statics.field650.method4173();
        Statics.field3829.method4173();
        Statics.field2531.method4173();
        Statics.field2533.method4173();
        Statics.field3341.method2625();
        for (int var0 = 0; var0 < 4; var0++) {
            field893[var0].method3072();
        }
        System.gc();
        class230.field2688 = 1;
        Statics.field2512 = null;
        Statics.field1932 = -1;
        Statics.field285 = -1;
        Statics.field1331 = 0;
        Statics.field2693 = false;
        Statics.field12 = 2;
        field1027 = -1;
        field1103 = false;
        class81.method958();
        method1003(10);
    }

    @ObfuscatedName("ab.fz(ZI)V")
    public static final void method221(boolean arg0) {
        if (arg0) {
            field908 = class91.field1386 ? class159.field2172 : class159.field2174;
        } else {
            field908 = Statics.field1142.field1248.containsKey(class319.method3787(class91.field1381)) ? class159.field2178 : class159.field2173;
        }
    }

    @ObfuscatedName("client.ft(I)V")
    public final void method1145() {
        if (field889 > 1) {
            field889--;
        }
        if (field916 > 0) {
            field916--;
        }
        if (field917) {
            field917 = false;
            if (field916 > 0) {
                method4350();
            } else {
                field919.method4823();
                method1003(40);
                Statics.field2070 = field958.method1870();
                field958.method1873();
            }
            return;
        }
        if (!field1069) {
            method187();
        }
        for (int var1 = 0; var1 < 100 && this.method1148(field958); var1++) {
        }
        if (field880 != 30) {
            return;
        }
        while (class327.method255()) {
            class185 var2 = class185.method267(class182.field2451, field958.field1485);
            var2.field2505.method3189(0);
            int var3 = var2.field2505.field2575;
            class327.method66(var2.field2505);
            var2.field2505.method3202(var2.field2505.field2575 - var3);
            field958.method1882(var2);
        }
        if (field919.field3826) {
            class185 var4 = class185.method267(class182.field2415, field958.field1485);
            var4.field2505.method3189(0);
            int var5 = var4.field2505.field2575;
            field919.method4837(var4.field2505);
            var4.field2505.method3202(var4.field2505.field2575 - var5);
            field958.method1882(var4);
            field919.method4826();
        }
        Object var6 = Statics.field521.field810;
        synchronized (Statics.field521.field810) {
            if (!field1046) {
                Statics.field521.field817 = 0;
            } else if (class61.field730 != 0 || Statics.field521.field817 >= 40) {
                class185 var7 = class185.method267(class182.field2477, field958.field1485);
                var7.field2505.method3189(0);
                int var8 = var7.field2505.field2575;
                int var9 = 0;
                for (int var10 = 0; var10 < Statics.field521.field817 && var7.field2505.field2575 - var8 < 240; var10++) {
                    var9++;
                    int var11 = Statics.field521.field813[var10];
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 502) {
                        var11 = 502;
                    }
                    int var12 = Statics.field521.field809[var10];
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 764) {
                        var12 = 764;
                    }
                    int var13 = var11 * 765 + var12;
                    if (Statics.field521.field813[var10] == -1 && Statics.field521.field809[var10] == -1) {
                        var12 = -1;
                        var11 = -1;
                        var13 = 524287;
                    }
                    if (field884 != var12 || field1114 != var11) {
                        int var14 = var12 - field884;
                        field884 = var12;
                        int var15 = var11 - field1114;
                        field1114 = var11;
                        if (field886 < 8 && var14 >= -32 && var14 <= 31 && var15 >= -32 && var15 <= 31) {
                            var14 += 32;
                            var15 += 32;
                            var7.field2505.method3190((field886 << 12) + (var14 << 6) + var15);
                            field886 = 0;
                        } else if (field886 < 8) {
                            var7.field2505.method3191((field886 << 19) + 8388608 + var13);
                            field886 = 0;
                        } else {
                            var7.field2505.method3405((field886 << 19) + -1073741824 + var13);
                            field886 = 0;
                        }
                    } else if (field886 < 2047) {
                        field886++;
                    }
                }
                var7.field2505.method3202(var7.field2505.field2575 - var8);
                field958.method1882(var7);
                if (var9 >= Statics.field521.field817) {
                    Statics.field521.field817 = 0;
                } else {
                    Statics.field521.field817 -= var9;
                    for (int var16 = 0; var16 < Statics.field521.field817; var16++) {
                        Statics.field521.field809[var16] = Statics.field521.field809[var9 + var16];
                        Statics.field521.field813[var16] = Statics.field521.field813[var9 + var16];
                    }
                }
            }
        }
        if (class61.field730 == 1 || !Statics.field590 && class61.field730 == 4 || class61.field730 == 2) {
            long var18 = (class61.field733 - field1107 * -1L) / 50L;
            if (var18 > 4095L) {
                var18 = 4095L;
            }
            field1107 = class61.field733 * -1L;
            int var20 = class61.field732;
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > Statics.field3509) {
                var20 = Statics.field3509;
            }
            int var21 = class61.field731;
            if (var21 < 0) {
                var21 = 0;
            } else if (var21 > Statics.field472) {
                var21 = Statics.field472;
            }
            int var22 = (int) var18;
            class185 var23 = class185.method267(class182.field2448, field958.field1485);
            var23.field2505.method3190((class61.field730 == 2 ? 1 : 0) + (var22 << 1));
            var23.field2505.method3190(var21);
            var23.field2505.method3190(var20);
            field958.method1882(var23);
        }
        if (class52.field639 > 0) {
            class185 var24 = class185.method267(class182.field2385, field958.field1485);
            var24.field2505.method3190(0);
            int var25 = var24.field2505.field2575;
            long var26 = class197.method1005();
            for (int var28 = 0; var28 < class52.field639; var28++) {
                long var29 = var26 - field1092;
                if (var29 > 16777215L) {
                    var29 = 16777215L;
                }
                field1092 = var26;
                var24.field2505.method3231(class52.field631[var28]);
                var24.field2505.method3410((int) var29);
            }
            var24.field2505.method3201(var24.field2505.field2575 - var25);
            field958.method1882(var24);
        }
        if (field954 > 0) {
            field954--;
        }
        if (class52.field625[96] || class52.field625[97] || class52.field625[98] || class52.field625[99]) {
            field955 = true;
        }
        if (field955 && field954 <= 0) {
            field954 = 20;
            field955 = false;
            class185 var31 = class185.method267(class182.field2403, field958.field1485);
            var31.field2505.method3190(field939);
            var31.field2505.method3216(field1044);
            field958.method1882(var31);
        }
        if (Statics.field2799 && !field887) {
            field887 = true;
            class185 var32 = class185.method267(class182.field2409, field958.field1485);
            var32.field2505.method3189(1);
            field958.method1882(var32);
        }
        if (!Statics.field2799 && field887) {
            field887 = false;
            class185 var33 = class185.method267(class182.field2409, field958.field1485);
            var33.field2505.method3189(0);
            field958.method1882(var33);
        }
        if (Statics.field1244 != null) {
            Statics.field1244.method5569();
        }
        if (Statics.field250) {
            if (Statics.field696 != null) {
                Statics.field696.method4939();
            }
            method525();
            Statics.field250 = false;
        }
        if (Statics.field270 != field882) {
            field882 = Statics.field270;
            method1028(Statics.field270);
        }
        if (field880 != 30) {
            return;
        }
        for (class75 var34 = (class75) field999.method3707(); var34 != null; var34 = (class75) field999.method3697()) {
            if (var34.field1154 > 0) {
                var34.field1154--;
            }
            if (var34.field1154 != 0) {
                if (var34.field1153 > 0) {
                    var34.field1153--;
                }
                if (var34.field1153 == 0 && var34.field1144 >= 1 && var34.field1146 >= 1 && var34.field1144 <= 102 && var34.field1146 <= 102 && (var34.field1150 < 0 || class63.method1066(var34.field1150, var34.field1152))) {
                    method3001(var34.field1155, var34.field1149, var34.field1144, var34.field1146, var34.field1150, var34.field1151, var34.field1152);
                    var34.field1153 = -1;
                    if (var34.field1150 == var34.field1147 && var34.field1147 == -1) {
                        var34.method3681();
                    } else if (var34.field1150 == var34.field1147 && var34.field1151 == var34.field1145 && var34.field1152 == var34.field1148) {
                        var34.method3681();
                    }
                }
            } else if (var34.field1147 < 0 || class63.method1066(var34.field1147, var34.field1148)) {
                method3001(var34.field1155, var34.field1149, var34.field1144, var34.field1146, var34.field1147, var34.field1145, var34.field1148);
                var34.method3681();
            }
        }
        Statics.method262();
        field958.field1481++;
        if (field958.field1481 <= 750) {
            int var35 = class94.field1432;
            int[] var36 = class94.field1437;
            for (int var37 = 0; var37 < var35; var37++) {
                class73 var38 = field986[var36[var37]];
                if (var38 != null) {
                    method223(var38, 1);
                }
            }
            for (int var39 = 0; var39 < field1131; var39++) {
                int var40 = field966[var39];
                class85 var41 = field910[var40];
                if (var41 != null) {
                    method223(var41, var41.field1317.field3721);
                }
            }
            int[] var42 = class94.field1437;
            for (int var43 = 0; var43 < class94.field1432; var43++) {
                class73 var44 = field986[var42[var43]];
                if (var44 != null && var44.field1174 > 0) {
                    var44.field1174--;
                    if (var44.field1174 == 0) {
                        var44.field1171 = null;
                    }
                }
            }
            for (int var45 = 0; var45 < field1131; var45++) {
                int var46 = field966[var45];
                class85 var47 = field910[var46];
                if (var47 != null && var47.field1174 > 0) {
                    var47.field1174--;
                    if (var47.field1174 == 0) {
                        var47.field1171 = null;
                    }
                }
            }
            field931++;
            if (field974 != 0) {
                field973 += 20;
                if (field973 >= 400) {
                    field974 = 0;
                }
            }
            if (Statics.field18 != null) {
                field976++;
                if (field976 >= 15) {
                    method5068(Statics.field18);
                    Statics.field18 = null;
                }
            }
            class243 var48 = Statics.field260;
            class243 var49 = Statics.field235;
            Statics.field260 = null;
            Statics.field235 = null;
            field990 = null;
            field959 = false;
            field1054 = false;
            field953 = 0;
            while (class52.method2932() && field953 < 128) {
                if (field1102 >= 2 && class52.field625[82] && Statics.field1425 == 66) {
                    String var50 = "";
                    Iterator var51 = class96.field1451.iterator();
                    while (var51.hasNext()) {
                        class71 var52 = (class71) var51.next();
                        var50 = var50 + var52.field824 + ':' + var52.field827 + '\n';
                    }
                    Statics.field359.method785(var50);
                } else if (field961 != 1 || Statics.field508 <= 0) {
                    field969[field953] = Statics.field1425;
                    field1090[field953] = Statics.field508;
                    field953++;
                }
            }
            boolean var55 = field1102 >= 2;
            if (var55 && class52.field625[82] && class52.field625[81] && field1082 != 0) {
                int var56 = Statics.field642.field857 - field1082;
                if (var56 < 0) {
                    var56 = 0;
                } else if (var56 > 3) {
                    var56 = 3;
                }
                if (Statics.field642.field857 != var56) {
                    method155(Statics.field2048 + Statics.field642.field1213[0], Statics.field360 + Statics.field642.field1214[0], var56, false);
                }
                field1082 = 0;
            }
            if (field1016 != -1) {
                method362(field1016, 0, 0, Statics.field472, Statics.field3509, 0, 0);
            }
            field1066++;
            while (true) {
                class69 var57;
                class243 var58;
                class243 var59;
                do {
                    var57 = (class69) field1068.method3693();
                    if (var57 == null) {
                        while (true) {
                            class69 var60;
                            class243 var61;
                            class243 var62;
                            do {
                                var60 = (class69) field1126.method3693();
                                if (var60 == null) {
                                    while (true) {
                                        class69 var63;
                                        class243 var64;
                                        class243 var65;
                                        do {
                                            var63 = (class69) field1067.method3693();
                                            if (var63 == null) {
                                                this.method1307();
                                                if (Statics.field1244 != null) {
                                                    Statics.field1244.method5579(Statics.field270, (Statics.field642.field1211 >> 7) + Statics.field2048, (Statics.field642.field1188 >> 7) + Statics.field360, false);
                                                    Statics.field1244.method5595();
                                                }
                                                if (field1041 != null) {
                                                    this.method1154();
                                                }
                                                if (Statics.field2138 != null) {
                                                    method5068(Statics.field2138);
                                                    field983++;
                                                    if (class61.field729 == 0) {
                                                        if (field1052) {
                                                            if (Statics.field493 == Statics.field2138 && field981 != field978) {
                                                                class243 var66 = Statics.field2138;
                                                                byte var67 = 0;
                                                                if (field1097 == 1 && var66.field2827 == 206) {
                                                                    var67 = 1;
                                                                }
                                                                if (var66.field2903[field981] <= 0) {
                                                                    var67 = 0;
                                                                }
                                                                int var68 = method2446(var66);
                                                                boolean var69 = (var68 >> 29 & 0x1) != 0;
                                                                if (var69) {
                                                                    int var70 = field978;
                                                                    int var71 = field981;
                                                                    var66.field2903[var71] = var66.field2903[var70];
                                                                    var66.field2942[var71] = var66.field2942[var70];
                                                                    var66.field2903[var70] = -1;
                                                                    var66.field2942[var70] = 0;
                                                                } else if (var67 == 1) {
                                                                    int var72 = field978;
                                                                    int var73 = field981;
                                                                    while (var72 != var73) {
                                                                        if (var72 > var73) {
                                                                            var66.method4100(var72 - 1, var72);
                                                                            var72--;
                                                                        } else if (var72 < var73) {
                                                                            var66.method4100(var72 + 1, var72);
                                                                            var72++;
                                                                        }
                                                                    }
                                                                } else {
                                                                    var66.method4100(field981, field978);
                                                                }
                                                                class185 var74 = class185.method267(class182.field2424, field958.field1485);
                                                                var74.field2505.method3189(var67);
                                                                var74.field2505.method3190(field978);
                                                                var74.field2505.method3239(field981);
                                                                var74.field2505.method3240(Statics.field2138.field2826);
                                                                field958.method1882(var74);
                                                            }
                                                        } else if (this.method1150()) {
                                                            this.method1151(field979, field913);
                                                        } else if (field1004 > 0) {
                                                            int var75 = field979;
                                                            int var76 = field913;
                                                            class88 var77 = Statics.field1422;
                                                            method3488(var77.field1339, var77.field1340, var77.field1341, var77.field1342, var77.field1343, var77.field1343, var75, var76);
                                                            Statics.field1422 = null;
                                                        }
                                                        field976 = 10;
                                                        class61.field730 = 0;
                                                        Statics.field2138 = null;
                                                    } else if (field983 >= 5 && (class61.field717 > field979 + 5 || class61.field717 < field979 - 5 || class61.field715 > field913 + 5 || class61.field715 < field913 - 5)) {
                                                        field1052 = true;
                                                    }
                                                }
                                                if (class138.method2679()) {
                                                    int var78 = class138.field2013;
                                                    int var79 = class138.field2025;
                                                    class185 var80 = class185.method267(class182.field2396, field958.field1485);
                                                    var80.field2505.method3189(5);
                                                    var80.field2505.method3230(class52.field625[82] ? (class52.field625[81] ? 2 : 1) : 0);
                                                    var80.field2505.method3238(Statics.field360 + var79);
                                                    var80.field2505.method3239(Statics.field2048 + var78);
                                                    field958.method1882(var80);
                                                    class138.method2665();
                                                    field926 = class61.field731;
                                                    field972 = class61.field732;
                                                    field974 = 1;
                                                    field973 = 0;
                                                    field1137 = var78;
                                                    field1099 = var79;
                                                }
                                                if (Statics.field260 != var48) {
                                                    if (var48 != null) {
                                                        method5068(var48);
                                                    }
                                                    if (Statics.field260 != null) {
                                                        method5068(Statics.field260);
                                                    }
                                                }
                                                if (Statics.field235 != var49 && field1116 == field1022) {
                                                    if (var49 != null) {
                                                        method5068(var49);
                                                    }
                                                    if (Statics.field235 != null) {
                                                        method5068(Statics.field235);
                                                    }
                                                }
                                                if (Statics.field235 == null) {
                                                    if (field1116 > 0) {
                                                        field1116--;
                                                    }
                                                } else if (field1116 < field1022) {
                                                    field1116++;
                                                    if (field1116 == field1022) {
                                                        method5068(Statics.field235);
                                                    }
                                                }
                                                method4985();
                                                if (field1112) {
                                                    method4104();
                                                }
                                                for (int var81 = 0; var81 < 5; var81++) {
                                                    int var10002 = field1117[var81]++;
                                                }
                                                Statics.field1973.method1804();
                                                int var82 = class61.method2830();
                                                int var83 = class52.method224();
                                                if (var82 > 15000 && var83 > 15000) {
                                                    field916 = 250;
                                                    class61.method189(14500);
                                                    class185 var84 = class185.method267(class182.field2483, field958.field1485);
                                                    field958.method1882(var84);
                                                }
                                                Statics.field426.method1590();
                                                field958.field1486++;
                                                if (field958.field1486 > 50) {
                                                    class185 var85 = class185.method267(class182.field2453, field958.field1485);
                                                    field958.method1882(var85);
                                                }
                                                try {
                                                    field958.method1869();
                                                } catch (IOException var87) {
                                                    if (field916 > 0) {
                                                        method4350();
                                                    } else {
                                                        field919.method4823();
                                                        method1003(40);
                                                        Statics.field2070 = field958.method1870();
                                                        field958.method1873();
                                                    }
                                                }
                                                return;
                                            }
                                            var64 = var63.field798;
                                            if (var64.field2824 < 0) {
                                                break;
                                            }
                                            var65 = class243.method577(var64.field2899);
                                        } while (var65 == null || var65.field2947 == null || var64.field2824 >= var65.field2947.length || var65.field2947[var64.field2824] != var64);
                                        class82.method2061(var63);
                                    }
                                }
                                var61 = var60.field798;
                                if (var61.field2824 < 0) {
                                    break;
                                }
                                var62 = class243.method577(var61.field2899);
                            } while (var62 == null || var62.field2947 == null || var61.field2824 >= var62.field2947.length || var62.field2947[var61.field2824] != var61);
                            class82.method2061(var60);
                        }
                    }
                    var58 = var57.field798;
                    if (var58.field2824 < 0) {
                        break;
                    }
                    var59 = class243.method577(var58.field2899);
                } while (var59 == null || var59.field2947 == null || var58.field2824 >= var59.field2947.length || var59.field2947[var58.field2824] != var58);
                class82.method2061(var57);
            }
        } else if (field916 > 0) {
            method4350();
        } else {
            field919.method4823();
            method1003(40);
            Statics.field2070 = field958.method1870();
            field958.method1873();
        }
    }

    @ObfuscatedName("jp.fj(Lke;IIII)V")
    public static void method4517(class288 arg0, int arg1, int arg2, int arg3) {
        if (field1106 >= 50 || field952 == 0 || arg0.field3760 == null || arg1 >= arg0.field3760.length) {
            return;
        }
        int var4 = arg0.field3760[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1104[field1106] = var5;
        field1030[field1106] = var6;
        field1109[field1106] = 0;
        field1111[field1106] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1110[field1106] = (var8 << 16) + (var9 << 8) + var7;
        field1106++;
    }

    @ObfuscatedName("by.fn(Lin;III)V")
    public static final void method1068(class243 arg0, int arg1, int arg2) {
        if (field1100 != 0 && field1100 != 3 || class61.field730 != 1 && Statics.field590 || class61.field730 != 4) {
            return;
        }
        class237 var3 = arg0.method4064(true);
        if (var3 == null) {
            return;
        }
        int var4 = class61.field731 - arg1;
        int var5 = class61.field732 - arg2;
        if (!var3.method3985(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2774 / 2;
        int var7 = var5 - var3.field2773 / 2;
        int var8 = field1044 & 0x7FF;
        int var9 = class135.field1963[var8];
        int var10 = class135.field1964[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field642.field1211 + var11 >> 7;
        int var14 = Statics.field642.field1188 - var12 >> 7;
        class185 var15 = class185.method267(class182.field2397, field958.field1485);
        var15.field2505.method3189(18);
        var15.field2505.method3230(class52.field625[82] ? (class52.field625[81] ? 2 : 1) : 0);
        var15.field2505.method3238(Statics.field360 + var14);
        var15.field2505.method3239(Statics.field2048 + var13);
        var15.field2505.method3189(var6);
        var15.field2505.method3189(var7);
        var15.field2505.method3190(field1044);
        var15.field2505.method3189(57);
        var15.field2505.method3189(0);
        var15.field2505.method3189(0);
        var15.field2505.method3189(89);
        var15.field2505.method3190(Statics.field642.field1211);
        var15.field2505.method3190(Statics.field642.field1188);
        var15.field2505.method3189(63);
        field958.method1882(var15);
        field1137 = var13;
        field1099 = var14;
    }

    @ObfuscatedName("bz.fo(Ljava/lang/String;I)V")
    public static final void method1118(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1142.field1241 = !Statics.field1142.field1241;
            class79.method949();
            if (Statics.field1142.field1241) {
                class96.method752(99, "", "Roofs are now all hidden");
            } else {
                class96.method752(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field888 = !field888;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field989 = !field989;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field1018 = !field1018;
        }
        if (field1102 >= 2) {
            if (arg0.equalsIgnoreCase("aabb")) {
                if (!class8.field239) {
                    class8.field239 = true;
                    class8.field234 = class12.field267;
                } else if (class8.field234 == class12.field267) {
                    class8.field239 = true;
                    class8.field234 = class12.field276;
                } else {
                    class8.field239 = false;
                }
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field1244.field4017 = !Statics.field1244.field4017;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field888 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field888 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field916 > 0) {
                    method4350();
                } else {
                    field919.method4823();
                    method1003(40);
                    Statics.field2070 = field958.method1870();
                    field958.method1873();
                }
            }
            if (arg0.equalsIgnoreCase("cs")) {
                class96.method752(99, "", "" + field918);
            }
            if (arg0.equalsIgnoreCase("errortest") && field873 == 2) {
                throw new RuntimeException();
            }
        }
        class185 var1 = class185.method267(class182.field2416, field958.field1485);
        var1.field2505.method3189(arg0.length() + 1);
        var1.field2505.method3214(arg0);
        field958.method1882(var1);
    }

    @ObfuscatedName("in.fe(I)V")
    public static final void method4104() {
        int var0 = Statics.field756 * 128 + 64;
        int var1 = Statics.field498 * 128 + 64;
        int var2 = method4325(var0, var1, Statics.field270) - Statics.field2052;
        if (Statics.field864 < var0) {
            Statics.field864 += Statics.field3332 * (var0 - Statics.field864) / 1000 + Statics.field417;
            if (Statics.field864 > var0) {
                Statics.field864 = var0;
            }
        }
        if (Statics.field864 > var0) {
            Statics.field864 -= Statics.field3332 * (Statics.field864 - var0) / 1000 + Statics.field417;
            if (Statics.field864 < var0) {
                Statics.field864 = var0;
            }
        }
        if (Statics.field2122 < var2) {
            Statics.field2122 += Statics.field3332 * (var2 - Statics.field2122) / 1000 + Statics.field417;
            if (Statics.field2122 > var2) {
                Statics.field2122 = var2;
            }
        }
        if (Statics.field2122 > var2) {
            Statics.field2122 -= Statics.field3332 * (Statics.field2122 - var2) / 1000 + Statics.field417;
            if (Statics.field2122 < var2) {
                Statics.field2122 = var2;
            }
        }
        if (Statics.field343 < var1) {
            Statics.field343 += Statics.field3332 * (var1 - Statics.field343) / 1000 + Statics.field417;
            if (Statics.field343 > var1) {
                Statics.field343 = var1;
            }
        }
        if (Statics.field343 > var1) {
            Statics.field343 -= Statics.field3332 * (Statics.field343 - var1) / 1000 + Statics.field417;
            if (Statics.field343 < var1) {
                Statics.field343 = var1;
            }
        }
        int var3 = Statics.field3698 * 128 + 64;
        int var4 = Statics.field249 * 128 + 64;
        int var5 = method4325(var3, var4, Statics.field270) - Statics.field2218;
        int var6 = var3 - Statics.field864;
        int var7 = var5 - Statics.field2122;
        int var8 = var4 - Statics.field343;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field318 < var10) {
            Statics.field318 += Statics.field231 * (var10 - Statics.field318) / 1000 + Statics.field303;
            if (Statics.field318 > var10) {
                Statics.field318 = var10;
            }
        }
        if (Statics.field318 > var10) {
            Statics.field318 -= Statics.field231 * (Statics.field318 - var10) / 1000 + Statics.field303;
            if (Statics.field318 < var10) {
                Statics.field318 = var10;
            }
        }
        int var12 = var11 - Statics.field418;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field418 += Statics.field231 * var12 / 1000 + Statics.field303;
            Statics.field418 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field418 -= Statics.field231 * -var12 / 1000 + Statics.field303;
            Statics.field418 &= 0x7FF;
        }
        int var13 = var11 - Statics.field418;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field418 = var11;
        }
    }

    @ObfuscatedName("kl.fi(I)V")
    public static final void method4985() {
        if (field961 == 0) {
            int var0 = Statics.field642.field1211;
            int var1 = Statics.field642.field1188;
            if (Statics.field2229 - var0 < -500 || Statics.field2229 - var0 > 500 || Statics.field579 - var1 < -500 || Statics.field579 - var1 > 500) {
                Statics.field2229 = var0;
                Statics.field579 = var1;
            }
            if (Statics.field2229 != var0) {
                Statics.field2229 += (var0 - Statics.field2229) / 16;
            }
            if (Statics.field579 != var1) {
                Statics.field579 += (var1 - Statics.field579) / 16;
            }
            int var2 = Statics.field2229 >> 7;
            int var3 = Statics.field579 >> 7;
            int var4 = method4325(Statics.field2229, Statics.field579, Statics.field270);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field270;
                        if (var8 < 3 && (class63.field740[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class63.field745[var8][var6][var7];
                        if (var9 > var5) {
                            var5 = var9;
                        }
                    }
                }
            }
            int var10 = var5 * 192;
            if (var10 > 98048) {
                var10 = 98048;
            }
            if (var10 < 32768) {
                var10 = 32768;
            }
            if (var10 > field885) {
                field885 += (var10 - field885) / 24;
            } else if (var10 < field885) {
                field885 += (var10 - field885) / 80;
            }
            Statics.field3641 = method4325(Statics.field642.field1211, Statics.field642.field1188, Statics.field270) - field946;
        } else if (field961 == 1) {
            if (field1062 && Statics.field642 != null) {
                int var11 = Statics.field642.field1213[0];
                int var12 = Statics.field642.field1214[0];
                if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                    Statics.field2229 = Statics.field642.field1211;
                    int var13 = method4325(Statics.field642.field1211, Statics.field642.field1188, Statics.field270) - field946;
                    if (var13 < Statics.field3641) {
                        Statics.field3641 = var13;
                    }
                    Statics.field579 = Statics.field642.field1188;
                    field1062 = false;
                }
            }
            short var14 = -1;
            if (class52.field625[33]) {
                var14 = 0;
            } else if (class52.field625[49]) {
                var14 = 1024;
            }
            if (class52.field625[48]) {
                if (var14 == 0) {
                    var14 = 1792;
                } else if (var14 == 1024) {
                    var14 = 1280;
                } else {
                    var14 = 1536;
                }
            } else if (class52.field625[50]) {
                if (var14 == 0) {
                    var14 = 256;
                } else if (var14 == 1024) {
                    var14 = 768;
                } else {
                    var14 = 512;
                }
            }
            byte var15 = 0;
            if (class52.field625[35]) {
                var15 = -1;
            } else if (class52.field625[51]) {
                var15 = 1;
            }
            int var16 = 0;
            if (var14 >= 0 || var15 != 0) {
                int var17 = class52.field625[81] ? field951 : field1060;
                var16 = var17 * 16;
                field948 = var14;
                field949 = var15;
            }
            if (field947 < var16) {
                field947 += var16 / 8;
                if (field947 > var16) {
                    field947 = var16;
                }
            } else if (field947 > var16) {
                field947 = field947 * 9 / 10;
            }
            if (field947 > 0) {
                int var18 = field947 / 16;
                if (field948 >= 0) {
                    int var19 = field948 - Statics.field418 & 0x7FF;
                    int var20 = class135.field1963[var19];
                    int var21 = class135.field1964[var19];
                    Statics.field2229 += var18 * var20 / 65536;
                    Statics.field579 += var18 * var21 / 65536;
                }
                if (field949 != 0) {
                    Statics.field3641 += field949 * var18;
                    if (Statics.field3641 > 0) {
                        Statics.field3641 = 0;
                    }
                }
            } else {
                field948 = -1;
                field949 = -1;
            }
            if (class52.field625[13]) {
                method77();
            }
        }
        if (class61.field729 == 4 && Statics.field590) {
            int var22 = class61.field715 - field944;
            field942 = var22 * 2;
            field944 = var22 == -1 || var22 == 1 ? class61.field715 : (field944 + class61.field715) / 2;
            int var23 = field898 - class61.field717;
            field941 = var23 * 2;
            field898 = var23 == -1 || var23 == 1 ? class61.field717 : (field898 + class61.field717) / 2;
        } else {
            if (class52.field625[96]) {
                field941 += (-24 - field941) / 2;
            } else if (class52.field625[97]) {
                field941 += (24 - field941) / 2;
            } else {
                field941 /= 2;
            }
            if (class52.field625[98]) {
                field942 += (12 - field942) / 2;
            } else if (class52.field625[99]) {
                field942 += (-12 - field942) / 2;
            } else {
                field942 /= 2;
            }
            field944 = class61.field715;
            field898 = class61.field717;
        }
        field1044 = field941 / 2 + field1044 & 0x7FF;
        field939 += field942 / 2;
        if (field939 < 128) {
            field939 = 128;
        }
        if (field939 > 383) {
            field939 = 383;
        }
    }

    @ObfuscatedName("ab.fp(Lba;II)V")
    public static final void method223(class76 arg0, int arg1) {
        if (arg0.field1167 > field929) {
            int var2 = arg0.field1167 - field929;
            int var3 = arg0.field1204 * 128 + arg0.field1173 * 64;
            int var4 = arg0.field1200 * 128 + arg0.field1173 * 64;
            arg0.field1211 += (var3 - arg0.field1211) / var2;
            arg0.field1188 += (var4 - arg0.field1188) / var2;
            arg0.field1159 = 0;
            arg0.field1209 = arg0.field1172;
        } else if (arg0.field1205 >= field929) {
            method4632(arg0);
        } else {
            method114(arg0);
        }
        if (arg0.field1211 < 128 || arg0.field1188 < 128 || arg0.field1211 >= 13184 || arg0.field1188 >= 13184) {
            arg0.field1190 = -1;
            arg0.field1195 = -1;
            arg0.field1167 = 0;
            arg0.field1205 = 0;
            arg0.field1211 = arg0.field1213[0] * 128 + arg0.field1173 * 64;
            arg0.field1188 = arg0.field1214[0] * 128 + arg0.field1173 * 64;
            arg0.method1512();
        }
        if (Statics.field642 == arg0 && (arg0.field1211 < 1536 || arg0.field1188 < 1536 || arg0.field1211 >= 11776 || arg0.field1188 >= 11776)) {
            arg0.field1190 = -1;
            arg0.field1195 = -1;
            arg0.field1167 = 0;
            arg0.field1205 = 0;
            arg0.field1211 = arg0.field1213[0] * 128 + arg0.field1173 * 64;
            arg0.field1188 = arg0.field1214[0] * 128 + arg0.field1173 * 64;
            arg0.method1512();
        }
        method597(arg0);
        method38(arg0);
    }

    @ObfuscatedName("ja.fd(Lba;S)V")
    public static final void method4632(class76 arg0) {
        if (field929 == arg0.field1205 || arg0.field1190 == -1 || arg0.field1192 != 0 || arg0.field1216 + 1 > class288.method1535(arg0.field1190).field3764[arg0.field1191]) {
            int var1 = arg0.field1205 - arg0.field1167;
            int var2 = field929 - arg0.field1167;
            int var3 = arg0.field1204 * 128 + arg0.field1173 * 64;
            int var4 = arg0.field1200 * 128 + arg0.field1173 * 64;
            int var5 = arg0.field1201 * 128 + arg0.field1173 * 64;
            int var6 = arg0.field1203 * 128 + arg0.field1173 * 64;
            arg0.field1211 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1188 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1159 = 0;
        arg0.field1209 = arg0.field1172;
        arg0.field1161 = arg0.field1209;
    }

    @ObfuscatedName("v.fh(Lba;I)V")
    public static final void method114(class76 arg0) {
        arg0.field1187 = arg0.field1202;
        if (arg0.field1212 == 0) {
            arg0.field1159 = 0;
            return;
        }
        if (arg0.field1190 != -1 && arg0.field1192 == 0) {
            class288 var1 = class288.method1535(arg0.field1190);
            if (arg0.field1217 > 0 && var1.field3769 == 0) {
                arg0.field1159++;
                return;
            }
            if (arg0.field1217 <= 0 && var1.field3770 == 0) {
                arg0.field1159++;
                return;
            }
        }
        int var2 = arg0.field1211;
        int var3 = arg0.field1188;
        int var4 = arg0.field1213[arg0.field1212 - 1] * 128 + arg0.field1173 * 64;
        int var5 = arg0.field1214[arg0.field1212 - 1] * 128 + arg0.field1173 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1209 = 1280;
            } else if (var3 > var5) {
                arg0.field1209 = 1792;
            } else {
                arg0.field1209 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1209 = 768;
            } else if (var3 > var5) {
                arg0.field1209 = 256;
            } else {
                arg0.field1209 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1209 = 1024;
        } else if (var3 > var5) {
            arg0.field1209 = 0;
        }
        byte var6 = arg0.field1215[arg0.field1212 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1211 = var4;
            arg0.field1188 = var5;
            arg0.field1212--;
            if (arg0.field1217 > 0) {
                arg0.field1217--;
            }
            return;
        }
        int var7 = arg0.field1209 - arg0.field1161 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1210;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1166;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1178;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1168;
        }
        if (var8 == -1) {
            var8 = arg0.field1166;
        }
        arg0.field1187 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class85) {
            var10 = ((class85) arg0).field1317.field3738;
        }
        if (var10) {
            if (arg0.field1209 != arg0.field1161 && arg0.field1207 == -1 && arg0.field1206 != 0) {
                var9 = 2;
            }
            if (arg0.field1212 > 2) {
                var9 = 6;
            }
            if (arg0.field1212 > 3) {
                var9 = 8;
            }
            if (arg0.field1159 > 0 && arg0.field1212 > 1) {
                var9 = 8;
                arg0.field1159--;
            }
        } else {
            if (arg0.field1212 > 1) {
                var9 = 6;
            }
            if (arg0.field1212 > 2) {
                var9 = 8;
            }
            if (arg0.field1159 > 0 && arg0.field1212 > 1) {
                var9 = 8;
                arg0.field1159--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1187 == arg0.field1166 && arg0.field1170 != -1) {
            arg0.field1187 = arg0.field1170;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1211 += var9;
                if (arg0.field1211 > var4) {
                    arg0.field1211 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1211 -= var9;
                if (arg0.field1211 < var4) {
                    arg0.field1211 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1188 += var9;
                if (arg0.field1188 > var5) {
                    arg0.field1188 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1188 -= var9;
                if (arg0.field1188 < var5) {
                    arg0.field1188 = var5;
                }
            }
        }
        if (arg0.field1211 == var4 && arg0.field1188 == var5) {
            arg0.field1212--;
            if (arg0.field1217 > 0) {
                arg0.field1217--;
            }
        }
    }

    @ObfuscatedName("ae.fa(Lba;B)V")
    public static final void method597(class76 arg0) {
        if (arg0.field1206 == 0) {
            return;
        }
        if (arg0.field1207 != -1) {
            class76 var1 = null;
            if (arg0.field1207 < 32768) {
                var1 = field910[arg0.field1207];
            } else if (arg0.field1207 >= 32768) {
                var1 = field986[arg0.field1207 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1211 - var1.field1211;
                int var3 = arg0.field1188 - var1.field1188;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1209 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1157) {
                arg0.field1207 = -1;
                arg0.field1157 = false;
            }
        }
        if (arg0.field1186 != -1 && (arg0.field1212 == 0 || arg0.field1159 > 0)) {
            arg0.field1209 = arg0.field1186;
            arg0.field1186 = -1;
        }
        int var4 = arg0.field1209 - arg0.field1161 & 0x7FF;
        if (var4 == 0 && arg0.field1157) {
            arg0.field1207 = -1;
            arg0.field1157 = false;
        }
        if (var4 == 0) {
            arg0.field1185 = 0;
            return;
        }
        arg0.field1185++;
        if (var4 > 1024) {
            arg0.field1161 -= arg0.field1206;
            boolean var5 = true;
            if (var4 < arg0.field1206 || var4 > 2048 - arg0.field1206) {
                arg0.field1161 = arg0.field1209;
                var5 = false;
            }
            if (arg0.field1202 == arg0.field1187 && (arg0.field1185 > 25 || var5)) {
                if (arg0.field1164 == -1) {
                    arg0.field1187 = arg0.field1166;
                } else {
                    arg0.field1187 = arg0.field1164;
                }
            }
        } else {
            arg0.field1161 += arg0.field1206;
            boolean var6 = true;
            if (var4 < arg0.field1206 || var4 > 2048 - arg0.field1206) {
                arg0.field1161 = arg0.field1209;
                var6 = false;
            }
            if (arg0.field1202 == arg0.field1187 && (arg0.field1185 > 25 || var6)) {
                if (arg0.field1165 == -1) {
                    arg0.field1187 = arg0.field1166;
                } else {
                    arg0.field1187 = arg0.field1165;
                }
            }
        }
        arg0.field1161 &= 0x7FF;
    }

    @ObfuscatedName("x.fy(Lba;B)V")
    public static final void method38(class76 arg0) {
        arg0.field1160 = false;
        if (arg0.field1187 != -1) {
            class288 var1 = class288.method1535(arg0.field1187);
            if (var1 == null || var1.field3758 == null) {
                arg0.field1187 = -1;
            } else {
                arg0.field1189++;
                if (arg0.field1163 < var1.field3758.length && arg0.field1189 > var1.field3764[arg0.field1163]) {
                    arg0.field1189 = 1;
                    arg0.field1163++;
                    method4517(var1, arg0.field1163, arg0.field1211, arg0.field1188);
                }
                if (arg0.field1163 >= var1.field3758.length) {
                    arg0.field1189 = 0;
                    arg0.field1163 = 0;
                    method4517(var1, arg0.field1163, arg0.field1211, arg0.field1188);
                }
            }
        }
        if (arg0.field1195 != -1 && field929 >= arg0.field1198) {
            if (arg0.field1196 < 0) {
                arg0.field1196 = 0;
            }
            int var2 = class273.method1734(arg0.field1195).field3498;
            if (var2 == -1) {
                arg0.field1195 = -1;
            } else {
                class288 var3 = class288.method1535(var2);
                if (var3 == null || var3.field3758 == null) {
                    arg0.field1195 = -1;
                } else {
                    arg0.field1197++;
                    if (arg0.field1196 < var3.field3758.length && arg0.field1197 > var3.field3764[arg0.field1196]) {
                        arg0.field1197 = 1;
                        arg0.field1196++;
                        method4517(var3, arg0.field1196, arg0.field1211, arg0.field1188);
                    }
                    if (arg0.field1196 >= var3.field3758.length && (arg0.field1196 < 0 || arg0.field1196 >= var3.field3758.length)) {
                        arg0.field1195 = -1;
                    }
                }
            }
        }
        if (arg0.field1190 != -1 && arg0.field1192 <= 1) {
            class288 var4 = class288.method1535(arg0.field1190);
            if (var4.field3769 == 1 && arg0.field1217 > 0 && arg0.field1167 <= field929 && arg0.field1205 < field929) {
                arg0.field1192 = 1;
                return;
            }
        }
        if (arg0.field1190 != -1 && arg0.field1192 == 0) {
            class288 var5 = class288.method1535(arg0.field1190);
            if (var5 == null || var5.field3758 == null) {
                arg0.field1190 = -1;
            } else {
                arg0.field1216++;
                if (arg0.field1191 < var5.field3758.length && arg0.field1216 > var5.field3764[arg0.field1191]) {
                    arg0.field1216 = 1;
                    arg0.field1191++;
                    method4517(var5, arg0.field1191, arg0.field1211, arg0.field1188);
                }
                if (arg0.field1191 >= var5.field3758.length) {
                    arg0.field1191 -= var5.field3762;
                    arg0.field1194++;
                    if (arg0.field1194 >= var5.field3753) {
                        arg0.field1190 = -1;
                    } else if (arg0.field1191 >= 0 && arg0.field1191 < var5.field3758.length) {
                        method4517(var5, arg0.field1191, arg0.field1211, arg0.field1188);
                    } else {
                        arg0.field1190 = -1;
                    }
                }
                arg0.field1160 = var5.field3754;
            }
        }
        if (arg0.field1192 > 0) {
            arg0.field1192--;
        }
    }

    @ObfuscatedName("eb.fx(Lbz;III)V")
    public static void method2834(class73 arg0, int arg1, int arg2) {
        if (arg0.field1190 == arg1 && arg1 != -1) {
            int var3 = class288.method1535(arg1).field3761;
            if (var3 == 1) {
                arg0.field1191 = 0;
                arg0.field1216 = 0;
                arg0.field1192 = arg2;
                arg0.field1194 = 0;
            }
            if (var3 == 2) {
                arg0.field1194 = 0;
            }
        } else if (arg1 == -1 || arg0.field1190 == -1 || class288.method1535(arg1).field3768 >= class288.method1535(arg0.field1190).field3768) {
            arg0.field1190 = arg1;
            arg0.field1191 = 0;
            arg0.field1216 = 0;
            arg0.field1192 = arg2;
            arg0.field1194 = 0;
            arg0.field1217 = arg0.field1212;
        }
    }

    @ObfuscatedName("bl.ff(IB)V")
    public static void method719(int arg0) {
        field1081 = 0L;
        if (arg0 >= 2) {
            field1025 = true;
        } else {
            field1025 = false;
        }
        int var1 = field1025 ? 2 : 1;
        if (var1 == 1) {
            Statics.field359.method781(765, 503);
        } else {
            Statics.field359.method781(7680, 2160);
        }
        if (field880 >= 25) {
            method957();
        }
    }

    @ObfuscatedName("bn.fq(B)V")
    public static void method957() {
        class185 var0 = class185.method267(class182.field2405, field958.field1485);
        class202 var1 = var0.field2505;
        int var2 = field1025 ? 2 : 1;
        var1.method3189(var2);
        var0.field2505.method3190(Statics.field472);
        var0.field2505.method3190(Statics.field3509);
        field958.method1882(var0);
    }

    @ObfuscatedName("client.a(I)V")
    public final void method789() {
        field1081 = class197.method1005() + 500L;
        this.method1146();
        if (field1016 != -1) {
            this.method1207(true);
        }
    }

    @ObfuscatedName("client.fb(S)V")
    public void method1146() {
        int var1 = Statics.field472;
        int var2 = Statics.field3509;
        if (this.field681 < var1) {
            int var3 = this.field681;
        }
        if (this.field713 < var2) {
            int var4 = this.field713;
        }
        if (Statics.field1142 == null) {
            return;
        }
        try {
            client var5 = Statics.field359;
            int var6 = field1025 ? 2 : 1;
            class54.method707(var5, "resize", new Object[] { var6 });
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.fk(I)V")
    public final void method1147() {
        if (field1016 != -1) {
            int var1 = field1016;
            if (class243.method3175(var1)) {
                method651(Statics.field812[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field927; var2++) {
            if (field1073[var2]) {
                field1074[var2] = true;
            }
            field1075[var2] = field1073[var2];
            field1073[var2] = false;
        }
        field1072 = field929;
        field992 = -1;
        field1020 = -1;
        Statics.field493 = null;
        if (field1016 != -1) {
            field927 = 0;
            method1737(field1016, 0, 0, Statics.field472, Statics.field3509, 0, 0, -1);
        }
        class328.method5286();
        if (field1069) {
            method3429();
        } else if (field992 != -1) {
            method1745(field992, field1020);
        }
        if (field1080 == 3) {
            for (int var3 = 0; var3 < field927; var3++) {
                if (field1075[var3]) {
                    class328.method5294(field1042[var3], field1077[var3], field1071[var3], field1079[var3], 16711935, 128);
                } else if (field1074[var3]) {
                    class328.method5294(field1042[var3], field1077[var3], field1071[var3], field1079[var3], 16711680, 128);
                }
            }
        }
        int var4 = Statics.field270;
        int var5 = Statics.field642.field1211;
        int var6 = Statics.field642.field1188;
        int var7 = field931;
        for (class81 var8 = (class81) class81.field1264.method3707(); var8 != null; var8 = (class81) class81.field1264.method3697()) {
            if (var8.field1265 != -1 || var8.field1275 != null) {
                int var9 = 0;
                if (var5 > var8.field1270) {
                    var9 += var5 - var8.field1270;
                } else if (var5 < var8.field1266) {
                    var9 += var8.field1266 - var5;
                }
                if (var6 > var8.field1263) {
                    var9 += var6 - var8.field1263;
                } else if (var6 < var8.field1262) {
                    var9 += var8.field1262 - var6;
                }
                if (var9 - 64 > var8.field1274 || field952 == 0 || var8.field1260 != var4) {
                    if (var8.field1267 != null) {
                        Statics.field728.method1890(var8.field1267);
                        var8.field1267 = null;
                    }
                    if (var8.field1272 != null) {
                        Statics.field728.method1890(var8.field1272);
                        var8.field1272 = null;
                    }
                } else {
                    var9 -= 64;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = field952 * (var8.field1274 - var9) / var8.field1274;
                    class104 var10000;
                    if (var8.field1267 != null) {
                        var8.field1267.method2126(var10);
                    } else if (var8.field1265 >= 0) {
                        var10000 = (class104) null;
                        class104 var11 = class104.method1953(Statics.field654, var8.field1265, 0);
                        if (var11 != null) {
                            class106 var12 = var11.method1952().method1995(Statics.field447);
                            class116 var13 = class116.method2122(var12, 100, var10);
                            var13.method2125(-1);
                            Statics.field728.method1889(var13);
                            var8.field1267 = var13;
                        }
                    }
                    if (var8.field1272 != null) {
                        var8.field1272.method2126(var10);
                        if (!var8.field1272.method3682()) {
                            var8.field1272 = null;
                        }
                    } else if (var8.field1275 != null && (var8.field1271 -= var7) <= 0) {
                        int var14 = (int) (Math.random() * (double) var8.field1275.length);
                        var10000 = (class104) null;
                        class104 var15 = class104.method1953(Statics.field654, var8.field1275[var14], 0);
                        if (var15 != null) {
                            class106 var16 = var15.method1952().method1995(Statics.field447);
                            class116 var17 = class116.method2122(var16, 100, var10);
                            var17.method2125(0);
                            Statics.field728.method1889(var17);
                            var8.field1272 = var17;
                            var8.field1271 = var8.field1268 + (int) (Math.random() * (double) (var8.field1269 - var8.field1268));
                        }
                    }
                }
            }
        }
        field931 = 0;
    }

    @ObfuscatedName("bd.fr(Ljava/lang/String;ZB)V")
    public static final void method1536(String arg0, boolean arg1) {
        if (!field1098) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field338.method5085(arg0, 250);
        int var6 = Statics.field338.method5086(arg0, 250) * 13;
        class328.method5295(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class328.method5302(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field338.method5092(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method373(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field535.method762(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field927; var11++) {
            if (field1071[var11] + field1042[var11] > var7 && field1042[var11] < var7 + var9 && field1079[var11] + field1077[var11] > var8 && field1077[var11] < var8 + var10) {
                field1074[var11] = true;
            }
        }
    }

    @ObfuscatedName("al.fv(IIIII)V")
    public static final void method276(int arg0, int arg1, int arg2, int arg3) {
        field1138++;
        method2443();
        if (field989) {
            method564(Statics.field642, false);
        }
        if (field1113 >= 0 && field986[field1113] != null) {
            method564(field986[field1113], false);
        }
        method3490(true);
        method661();
        method3490(false);
        method3118();
        for (class83 var4 = (class83) field1001.method3707(); var4 != null; var4 = (class83) field1001.method3697()) {
            if (Statics.field270 != var4.field1295 || var4.field1300) {
                var4.method3681();
            } else if (field929 >= var4.field1294) {
                var4.method1705(field931);
                if (var4.field1300) {
                    var4.method3681();
                } else {
                    Statics.field3341.method2636(var4.field1295, var4.field1296, var4.field1297, var4.field1298, 60, var4, 0, -1, false);
                }
            }
        }
        method497(arg0, arg1, arg2, arg3, true);
        int var5 = field1012;
        int var6 = field1127;
        int var7 = field1128;
        int var8 = field1129;
        class328.method5287(var5, var6, var5 + var7, var6 + var8);
        class135.method2586();
        if (!field1112) {
            int var9 = field939;
            if (field885 / 256 > var9) {
                var9 = field885 / 256;
            }
            if (field956[4] && field1007[4] + 128 > var9) {
                var9 = field1007[4] + 128;
            }
            int var10 = field1044 & 0x7FF;
            int var11 = Statics.field2229;
            int var12 = Statics.field3641;
            int var13 = Statics.field579;
            int var14 = var9 * 3 + 600;
            int var15 = 2048 - var9 & 0x7FF;
            int var16 = 2048 - var10 & 0x7FF;
            int var17 = 0;
            int var18 = 0;
            int var19 = var14;
            if (var15 != 0) {
                int var20 = class135.field1963[var15];
                int var21 = class135.field1964[var15];
                int var22 = var18 * var21 - var14 * var20 >> 16;
                var19 = var18 * var20 + var14 * var21 >> 16;
                var18 = var22;
            }
            if (var16 != 0) {
                int var23 = class135.field1963[var16];
                int var24 = class135.field1964[var16];
                int var25 = var17 * var24 + var19 * var23 >> 16;
                var19 = var19 * var24 - var17 * var23 >> 16;
                var17 = var25;
            }
            Statics.field864 = var11 - var17;
            Statics.field2122 = var12 - var18;
            Statics.field343 = var13 - var19;
            Statics.field318 = var9;
            Statics.field418 = var10;
            if (field961 == 1 && field1102 >= 2 && field929 % 50 == 0 && (Statics.field2229 >> 7 != Statics.field642.field1211 >> 7 || Statics.field579 >> 7 != Statics.field642.field1188 >> 7)) {
                int var26 = Statics.field642.field857;
                int var27 = (Statics.field2229 >> 7) + Statics.field2048;
                int var28 = (Statics.field579 >> 7) + Statics.field360;
                method155(var27, var28, var26, true);
            }
        }
        int var41;
        if (field1112) {
            var41 = method718();
        } else {
            int var29;
            if (Statics.field1142.field1241) {
                var29 = Statics.field270;
            } else {
                label489: {
                    int var30 = 3;
                    if (Statics.field318 < 310) {
                        label481: {
                            int var31;
                            int var32;
                            if (field961 == 1) {
                                var31 = Statics.field2229 >> 7;
                                var32 = Statics.field579 >> 7;
                            } else {
                                var31 = Statics.field642.field1211 >> 7;
                                var32 = Statics.field642.field1188 >> 7;
                            }
                            int var33 = Statics.field864 >> 7;
                            int var34 = Statics.field343 >> 7;
                            if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                                if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                                    if ((class63.field740[Statics.field270][var33][var34] & 0x4) != 0) {
                                        var30 = Statics.field270;
                                    }
                                    int var35;
                                    if (var31 > var33) {
                                        var35 = var31 - var33;
                                    } else {
                                        var35 = var33 - var31;
                                    }
                                    int var36;
                                    if (var32 > var34) {
                                        var36 = var32 - var34;
                                    } else {
                                        var36 = var34 - var32;
                                    }
                                    if (var35 > var36) {
                                        int var37 = var36 * 65536 / var35;
                                        int var38 = 32768;
                                        while (true) {
                                            if (var31 == var33) {
                                                break label481;
                                            }
                                            if (var33 < var31) {
                                                var33++;
                                            } else if (var33 > var31) {
                                                var33--;
                                            }
                                            if ((class63.field740[Statics.field270][var33][var34] & 0x4) != 0) {
                                                var30 = Statics.field270;
                                            }
                                            var38 += var37;
                                            if (var38 >= 65536) {
                                                var38 -= 65536;
                                                if (var34 < var32) {
                                                    var34++;
                                                } else if (var34 > var32) {
                                                    var34--;
                                                }
                                                if ((class63.field740[Statics.field270][var33][var34] & 0x4) != 0) {
                                                    var30 = Statics.field270;
                                                }
                                            }
                                        }
                                    } else {
                                        if (var36 > 0) {
                                            int var39 = var35 * 65536 / var36;
                                            int var40 = 32768;
                                            while (var32 != var34) {
                                                if (var34 < var32) {
                                                    var34++;
                                                } else if (var34 > var32) {
                                                    var34--;
                                                }
                                                if ((class63.field740[Statics.field270][var33][var34] & 0x4) != 0) {
                                                    var30 = Statics.field270;
                                                }
                                                var40 += var39;
                                                if (var40 >= 65536) {
                                                    var40 -= 65536;
                                                    if (var33 < var31) {
                                                        var33++;
                                                    } else if (var33 > var31) {
                                                        var33--;
                                                    }
                                                    if ((class63.field740[Statics.field270][var33][var34] & 0x4) != 0) {
                                                        var30 = Statics.field270;
                                                    }
                                                }
                                            }
                                        }
                                        break label481;
                                    }
                                }
                                var29 = Statics.field270;
                                break label489;
                            }
                            var29 = Statics.field270;
                            break label489;
                        }
                    }
                    if (Statics.field642.field1211 >= 0 && Statics.field642.field1188 >= 0 && Statics.field642.field1211 < 13312 && Statics.field642.field1188 < 13312) {
                        if ((class63.field740[Statics.field270][Statics.field642.field1211 >> 7][Statics.field642.field1188 >> 7] & 0x4) != 0) {
                            var30 = Statics.field270;
                        }
                        var29 = var30;
                    } else {
                        var29 = Statics.field270;
                    }
                }
            }
            var41 = var29;
        }
        int var42 = Statics.field864;
        int var43 = Statics.field2122;
        int var44 = Statics.field343;
        int var45 = Statics.field318;
        int var46 = Statics.field418;
        for (int var47 = 0; var47 < 5; var47++) {
            if (field956[var47]) {
                int var48 = (int) (Math.random() * (double) (field943[var47] * 2 + 1) - (double) field943[var47] + Math.sin((double) field940[var47] / 100.0D * (double) field1117[var47]) * (double) field1007[var47]);
                if (var47 == 0) {
                    Statics.field864 += var48;
                }
                if (var47 == 1) {
                    Statics.field2122 += var48;
                }
                if (var47 == 2) {
                    Statics.field343 += var48;
                }
                if (var47 == 3) {
                    Statics.field418 = Statics.field418 + var48 & 0x7FF;
                }
                if (var47 == 4) {
                    Statics.field318 += var48;
                    if (Statics.field318 < 128) {
                        Statics.field318 = 128;
                    }
                    if (Statics.field318 > 383) {
                        Statics.field318 = 383;
                    }
                }
            }
        }
        int var49 = class61.field717;
        int var50 = class61.field715;
        if (class61.field730 != 0) {
            var49 = class61.field731;
            var50 = class61.field732;
        }
        if (var49 >= var5 && var49 < var5 + var7 && var50 >= var6 && var50 < var6 + var8) {
            int var51 = var49 - var5;
            int var52 = var50 - var6;
            class133.field1923 = var51;
            class133.field1919 = var52;
            class133.field1929 = true;
            class133.field1928 = 0;
            class133.field1922 = false;
        } else {
            class133.field1929 = false;
            class133.field1928 = 0;
        }
        Statics.method35();
        class328.method5295(var5, var6, var7, var8, 0);
        Statics.method35();
        int var53 = class135.field1942;
        class135.field1942 = field1130;
        Statics.field3341.method2653(Statics.field864, Statics.field2122, Statics.field343, Statics.field318, Statics.field418, var41);
        while (true) {
            class10 var54 = (class10) class8.field236.method3654();
            if (var54 == null) {
                class135.field1942 = var53;
                Statics.method35();
                Statics.field3341.method2639();
                field957 = 0;
                boolean var55 = false;
                int var56 = -1;
                int var57 = -1;
                int var58 = class94.field1432;
                int[] var59 = class94.field1437;
                for (int var60 = 0; var60 < field1131 + var58; var60++) {
                    class76 var61;
                    if (var60 < var58) {
                        var61 = field986[var59[var60]];
                        if (field1113 == var59[var60]) {
                            var55 = true;
                            var56 = var60;
                            continue;
                        }
                        if (Statics.field642 == var61) {
                            var57 = var60;
                            continue;
                        }
                    } else {
                        var61 = field910[field966[var60 - var58]];
                    }
                    method3185(var61, var60, var5, var6, var7, var8);
                }
                if (field989 && var57 != -1) {
                    method3185(Statics.field642, var57, var5, var6, var7, var8);
                }
                if (var55) {
                    method3185(field986[field1113], var56, var5, var6, var7, var8);
                }
                for (int var62 = 0; var62 < field957; var62++) {
                    int var63 = field1091[var62];
                    int var64 = field970[var62];
                    int var65 = field962[var62];
                    int var66 = field960[var62];
                    boolean var67 = true;
                    while (var67) {
                        var67 = false;
                        for (int var68 = 0; var68 < var62; var68++) {
                            if (var64 + 2 > field970[var68] - field960[var68] && var64 - var66 < field970[var68] + 2 && var63 - var65 < field962[var68] + field1091[var68] && var63 + var65 > field1091[var68] - field962[var68] && field970[var68] - field960[var68] < var64) {
                                var64 = field970[var68] - field960[var68];
                                var67 = true;
                            }
                        }
                    }
                    field1120 = field1091[var62];
                    field1141 = field970[var62] = var64;
                    String var69 = field1039[var62];
                    if (field1032 == 0) {
                        int var70 = 16776960;
                        if (field963[var62] < 6) {
                            var70 = field1083[field963[var62]];
                        }
                        if (field963[var62] == 6) {
                            var70 = field1138 % 20 < 10 ? 16711680 : 16776960;
                        }
                        if (field963[var62] == 7) {
                            var70 = field1138 % 20 < 10 ? 255 : 65535;
                        }
                        if (field963[var62] == 8) {
                            var70 = field1138 % 20 < 10 ? 45056 : 8454016;
                        }
                        if (field963[var62] == 9) {
                            int var71 = 150 - field965[var62];
                            if (var71 < 50) {
                                var70 = var71 * 1280 + 16711680;
                            } else if (var71 < 100) {
                                var70 = 16776960 - (var71 - 50) * 327680;
                            } else if (var71 < 150) {
                                var70 = (var71 - 100) * 5 + 65280;
                            }
                        }
                        if (field963[var62] == 10) {
                            int var72 = 150 - field965[var62];
                            if (var72 < 50) {
                                var70 = var72 * 5 + 16711680;
                            } else if (var72 < 100) {
                                var70 = 16711935 - (var72 - 50) * 327680;
                            } else if (var72 < 150) {
                                var70 = (var72 - 100) * 327680 + 255 - (var72 - 100) * 5;
                            }
                        }
                        if (field963[var62] == 11) {
                            int var73 = 150 - field965[var62];
                            if (var73 < 50) {
                                var70 = 16777215 - var73 * 327685;
                            } else if (var73 < 100) {
                                var70 = (var73 - 50) * 327685 + 65280;
                            } else if (var73 < 150) {
                                var70 = 16777215 - (var73 - 100) * 327680;
                            }
                        }
                        if (field964[var62] == 0) {
                            Statics.field830.method5091(var69, field1120 + var5, field1141 + var6, var70, 0);
                        }
                        if (field964[var62] == 1) {
                            Statics.field830.method5093(var69, field1120 + var5, field1141 + var6, var70, 0, field1138);
                        }
                        if (field964[var62] == 2) {
                            Statics.field830.method5094(var69, field1120 + var5, field1141 + var6, var70, 0, field1138);
                        }
                        if (field964[var62] == 3) {
                            Statics.field830.method5095(var69, field1120 + var5, field1141 + var6, var70, 0, field1138, 150 - field965[var62]);
                        }
                        if (field964[var62] == 4) {
                            int var74 = (150 - field965[var62]) * (Statics.field830.method5144(var69) + 100) / 150;
                            class328.method5288(field1120 + var5 - 50, var6, field1120 + var5 + 50, var6 + var8);
                            Statics.field830.method5088(var69, field1120 + var5 + 50 - var74, field1141 + var6, var70, 0);
                            class328.method5287(var5, var6, var5 + var7, var6 + var8);
                        }
                        if (field964[var62] == 5) {
                            int var75 = 150 - field965[var62];
                            int var76 = 0;
                            if (var75 < 25) {
                                var76 = var75 - 25;
                            } else if (var75 > 125) {
                                var76 = var75 - 125;
                            }
                            class328.method5288(var5, field1141 + var6 - Statics.field830.field3896 - 1, var5 + var7, field1141 + var6 + 5);
                            Statics.field830.method5091(var69, field1120 + var5, field1141 + var6 + var76, var70, 0);
                            class328.method5287(var5, var6, var5 + var7, var6 + var8);
                        }
                    } else {
                        Statics.field830.method5091(var69, field1120 + var5, field1141 + var6, 16776960, 0);
                    }
                }
                method508(var5, var6);
                ((class124) Statics.field1950).method2352(field931);
                if (field975) {
                    if (field974 == 1) {
                        Statics.field3014[field973 / 100].method5514(field926 - 8, field972 - 8);
                    }
                    if (field974 == 2) {
                        Statics.field3014[field973 / 100 + 4].method5514(field926 - 8, field972 - 8);
                    }
                }
                method4128();
                Statics.field864 = var42;
                Statics.field2122 = var43;
                Statics.field343 = var44;
                Statics.field318 = var45;
                Statics.field418 = var46;
                if (field881) {
                    byte var77 = 0;
                    int var78 = class265.field3429 + class265.field3419 + var77;
                    if (var78 == 0) {
                        field881 = false;
                    }
                }
                if (field881) {
                    class328.method5295(var5, var6, var7, var8, 0);
                    method1536(class252.field3035, false);
                }
                return;
            }
            var54.method30();
        }
    }

    @ObfuscatedName("ai.fs(IIIIZI)V")
    public static final void method497(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1119 - field1121) * var5 / 100 + field1121;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1124) {
            short var8 = field1124;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field1123) {
                var6 = field1123;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class328.method5286();
                    class328.method5295(arg0, arg1, var10, arg3, -16777216);
                    class328.method5295(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field912) {
            short var11 = field912;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1122) {
                var6 = field1122;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class328.method5286();
                    class328.method5295(arg0, arg1, arg2, var13, -16777216);
                    class328.method5295(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1105 - field1019) * var5 / 100 + field1019;
        field1130 = arg3 * var6 * var14 / 85504 << 1;
        if (field1128 != arg2 || field1129 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class135.field1963[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class138.method2660(var15, 500, 800, arg2, arg3);
        }
        field1012 = arg0;
        field1127 = arg1;
        field1128 = arg2;
        field1129 = arg3;
    }

    @ObfuscatedName("dn.fl(I)V")
    public static void method2443() {
        if (Statics.field642.field1211 >> 7 == field1137 && Statics.field642.field1188 >> 7 == field1099) {
            field1137 = 0;
        }
    }

    @ObfuscatedName("as.ga(I)V")
    public static void method661() {
        int var0 = class94.field1432;
        int[] var1 = class94.field1437;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field1113 != var1[var2] && field987 != var1[var2]) {
                method564(field986[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("ad.gj(Lbz;ZB)V")
    public static void method564(class73 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1084() || arg0.field856) {
            return;
        }
        int var2 = arg0.field837 << 14;
        arg0.field854 = false;
        if ((field875 && class94.field1432 > 50 || class94.field1432 > 200) && arg1 && arg0.field1202 == arg0.field1187) {
            arg0.field854 = true;
        }
        int var3 = arg0.field1211 >> 7;
        int var4 = arg0.field1188 >> 7;
        if (var3 < 0 || var3 >= 104 || var4 < 0 || var4 >= 104) {
            return;
        }
        if (arg0.field849 != null && field929 >= arg0.field847 && field929 < arg0.field845) {
            arg0.field854 = false;
            arg0.field843 = method4325(arg0.field1211, arg0.field1188, Statics.field270);
            arg0.field1162 = field929;
            Statics.field3341.method2644(Statics.field270, arg0.field1211, arg0.field1188, arg0.field843, 60, arg0, arg0.field1161, var2, arg0.field850, arg0.field851, arg0.field852, arg0.field853);
            return;
        }
        if ((arg0.field1211 & 0x7F) == 64 && (arg0.field1188 & 0x7F) == 64) {
            if (field1138 == field967[var3][var4]) {
                return;
            }
            field967[var3][var4] = field1138;
        }
        arg0.field843 = method4325(arg0.field1211, arg0.field1188, Statics.field270);
        arg0.field1162 = field929;
        Statics.field3341.method2636(Statics.field270, arg0.field1211, arg0.field1188, arg0.field843, 60, arg0, arg0.field1161, var2, arg0.field1160);
    }

    @ObfuscatedName("gx.gh(ZI)V")
    public static final void method3490(boolean arg0) {
        for (int var1 = 0; var1 < field1131; var1++) {
            class85 var2 = field910[field966[var1]];
            int var3 = (field966[var1] << 14) + 536870912;
            if (var2 != null && var2.method1084() && var2.field1317.field3729 == arg0 && var2.field1317.method4735()) {
                int var4 = var2.field1211 >> 7;
                int var5 = var2.field1188 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1173 == 1 && (var2.field1211 & 0x7F) == 64 && (var2.field1188 & 0x7F) == 64) {
                        if (field1138 == field967[var4][var5]) {
                            continue;
                        }
                        field967[var4][var5] = field1138;
                    }
                    if (!var2.field1317.field3725) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    var2.field1162 = field929;
                    Statics.field3341.method2636(Statics.field270, var2.field1211, var2.field1188, method4325(var2.field1211 + (var2.field1173 * 64 - 64), var2.field1188 + (var2.field1173 * 64 - 64), Statics.field270), var2.field1173 * 64 - 64 + 60, var2, var2.field1161, var3, var2.field1160);
                }
            }
        }
    }

    @ObfuscatedName("fk.gq(B)V")
    public static final void method3118() {
        for (class92 var0 = (class92) field1000.method3707(); var0 != null; var0 = (class92) field1000.method3697()) {
            if (Statics.field270 != var0.field1398 || field929 > var0.field1404) {
                var0.method3681();
            } else if (field929 >= var0.field1419) {
                if (var0.field1407 > 0) {
                    class85 var1 = field910[var0.field1407 - 1];
                    if (var1 != null && var1.field1211 >= 0 && var1.field1211 < 13312 && var1.field1188 >= 0 && var1.field1188 < 13312) {
                        var0.method1776(var1.field1211, var1.field1188, method4325(var1.field1211, var1.field1188, var0.field1398) - var0.field1402, field929);
                    }
                }
                if (var0.field1407 < 0) {
                    int var2 = -var0.field1407 - 1;
                    class73 var3;
                    if (field987 == var2) {
                        var3 = Statics.field642;
                    } else {
                        var3 = field986[var2];
                    }
                    if (var3 != null && var3.field1211 >= 0 && var3.field1211 < 13312 && var3.field1188 >= 0 && var3.field1188 < 13312) {
                        var0.method1776(var3.field1211, var3.field1188, method4325(var3.field1211, var3.field1188, var0.field1398) - var0.field1402, field929);
                    }
                }
                var0.method1781(field931);
                Statics.field3341.method2636(Statics.field270, (int) var0.field1409, (int) var0.field1410, (int) var0.field1412, 60, var0, var0.field1417, -1, false);
            }
        }
    }

    @ObfuscatedName("bl.gk(I)I")
    public static final int method718() {
        if (Statics.field1142.field1241) {
            return Statics.field270;
        } else {
            int var0 = method4325(Statics.field864, Statics.field343, Statics.field270);
            return var0 - Statics.field2122 >= 800 || (class63.field740[Statics.field270][Statics.field864 >> 7][Statics.field343 >> 7] & 0x4) == 0 ? 3 : Statics.field270;
        }
    }

    @ObfuscatedName("av.gm(IIB)V")
    public static final void method508(int arg0, int arg1) {
        if (field890 == 2) {
            method2074((field1033 - Statics.field2048 << 7) + field896, (field1014 - Statics.field360 << 7) + field897, field1010 * 2);
            if (field1120 > -1 && field929 % 20 < 10) {
                Statics.field274[0].method5514(field1120 + arg0 - 12, field1141 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("bt.gf(I)Z")
    public static boolean method1021() {
        return (field1101 & 0x4) != 0;
    }

    @ObfuscatedName("gx.go(S)Z")
    public static boolean method3502() {
        return (field1101 & 0x1) != 0;
    }

    @ObfuscatedName("bg.gr(I)Z")
    public static boolean method1577() {
        return (field1101 & 0x2) != 0;
    }

    @ObfuscatedName("az.gz(I)Z")
    public static boolean method502() {
        return (field1101 & 0x8) != 0;
    }

    @ObfuscatedName("gp.gy(Lba;IIIIII)V")
    public static final void method3185(class76 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1084()) {
            return;
        }
        if (arg0 instanceof class85) {
            class286 var6 = ((class85) arg0).field1317;
            if (var6.field3723 != null) {
                var6 = var6.method4755();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class94.field1432;
        int[] var8 = class94.field1437;
        byte var9 = 0;
        if (arg1 < var7 && field929 == arg0.field1162) {
            class73 var10 = (class73) arg0;
            boolean var11;
            if (field1101 == 0) {
                var11 = false;
            } else if (Statics.field642 == var10) {
                var11 = method502();
            } else {
                var11 = method1021() || method3502() && var10.method1108() || method1577() && var10.method1090();
            }
            if (var11) {
                class73 var12 = (class73) arg0;
                if (arg1 < var7) {
                    method273(arg0, arg0.field1208 + 15);
                    class313 var13 = (class313) field905.get(class310.field3879);
                    byte var14 = 9;
                    var13.method5091(var12.field842.method5015(), field1120 + arg2, field1141 + arg3 - var14, 16777215, 0);
                    var9 = 18;
                }
            }
        }
        int var15 = -2;
        if (!arg0.field1183.method3658()) {
            method273(arg0, arg0.field1208 + 15);
            for (class84 var16 = (class84) arg0.field1183.method3655(); var16 != null; var16 = (class84) arg0.field1183.method3657()) {
                class77 var17 = var16.method1711(field929);
                if (var17 != null) {
                    class276 var18 = var16.field1307;
                    class332 var19 = var18.method4477();
                    class332 var20 = var18.method4476();
                    int var21 = 0;
                    int var22;
                    if (var19 == null || var20 == null) {
                        var22 = var18.field3536;
                    } else {
                        if (var18.field3526 * 2 < var20.field3983) {
                            var21 = var18.field3526;
                        }
                        var22 = var20.field3983 - var21 * 2;
                    }
                    int var23 = 255;
                    boolean var24 = true;
                    int var25 = field929 - var17.field1221;
                    int var26 = var17.field1220 * var22 / var18.field3536;
                    int var29;
                    if (var17.field1223 > var25) {
                        int var27 = var18.field3531 == 0 ? 0 : var25 / var18.field3531 * var18.field3531;
                        int var28 = var17.field1219 * var22 / var18.field3536;
                        var29 = (var26 - var28) * var27 / var17.field1223 + var28;
                    } else {
                        var29 = var26;
                        int var30 = var17.field1223 + var18.field3523 - var25;
                        if (var18.field3524 >= 0) {
                            var23 = (var30 << 8) / (var18.field3523 - var18.field3524);
                        }
                    }
                    if (var17.field1220 > 0 && var29 < 1) {
                        var29 = 1;
                    }
                    if (var19 == null || var20 == null) {
                        var15 += 5;
                        if (field1120 > -1) {
                            int var36 = field1120 + arg2 - (var22 >> 1);
                            int var37 = field1141 + arg3 - var15;
                            class328.method5295(var36, var37, var29, 5, 65280);
                            class328.method5295(var29 + var36, var37, var22 - var29, 5, 16711680);
                        }
                        var15 += 2;
                    } else {
                        int var31;
                        if (var22 == var29) {
                            var31 = var21 * 2 + var29;
                        } else {
                            var31 = var21 + var29;
                        }
                        int var32 = var19.field3988;
                        var15 += var32;
                        int var33 = field1120 + arg2 - (var22 >> 1);
                        int var34 = field1141 + arg3 - var15;
                        int var35 = var33 - var21;
                        if (var23 >= 0 && var23 < 255) {
                            var19.method5471(var35, var34, var23);
                            class328.method5288(var35, var34, var31 + var35, var32 + var34);
                            var20.method5471(var35, var34, var23);
                        } else {
                            var19.method5514(var35, var34);
                            class328.method5288(var35, var34, var31 + var35, var32 + var34);
                            var20.method5514(var35, var34);
                        }
                        class328.method5287(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var15 += 2;
                    }
                } else if (var16.method1709()) {
                    var16.method3681();
                }
            }
        }
        if (var15 == -2) {
            var15 += 7;
        }
        int var38 = var9 + var15;
        if (arg1 < var7) {
            class73 var39 = (class73) arg0;
            if (var39.field856) {
                return;
            }
            if (var39.field839 != -1 || var39.field858 != -1) {
                method273(arg0, arg0.field1208 + 15);
                if (field1120 > -1) {
                    if (var39.field839 != -1) {
                        var38 += 25;
                        Statics.field712[var39.field839].method5514(field1120 + arg2 - 12, field1141 + arg3 - var38);
                    }
                    if (var39.field858 != -1) {
                        var38 += 25;
                        Statics.field3890[var39.field858].method5514(field1120 + arg2 - 12, field1141 + arg3 - var38);
                    }
                }
            }
            if (arg1 >= 0 && field890 == 10 && field892 == var8[arg1]) {
                method273(arg0, arg0.field1208 + 15);
                if (field1120 > -1) {
                    int var40 = Statics.field274[1].field3988 + var38;
                    Statics.field274[1].method5514(field1120 + arg2 - 12, field1141 + arg3 - var40);
                }
            }
        } else {
            class286 var41 = ((class85) arg0).field1317;
            if (var41.field3723 != null) {
                var41 = var41.method4755();
            }
            if (var41.field3716 >= 0 && var41.field3716 < Statics.field3890.length) {
                method273(arg0, arg0.field1208 + 15);
                if (field1120 > -1) {
                    Statics.field3890[var41.field3716].method5514(field1120 + arg2 - 12, field1141 + arg3 - 30);
                }
            }
            if (field890 == 1 && field1037 == field966[arg1 - var7] && field929 % 20 < 10) {
                method273(arg0, arg0.field1208 + 15);
                if (field1120 > -1) {
                    Statics.field274[0].method5514(field1120 + arg2 - 12, field1141 + arg3 - 28);
                }
            }
        }
        if (arg0.field1171 != null && (arg1 >= var7 || !arg0.field1158 && (field1084 == 4 || !arg0.field1169 && (field1084 == 0 || field1084 == 3 || field1084 == 1 && ((class73) arg0).method1108())))) {
            method273(arg0, arg0.field1208);
            if (field1120 > -1 && field957 < field945) {
                field962[field957] = Statics.field830.method5144(arg0.field1171) / 2;
                field960[field957] = Statics.field830.field3896;
                field1091[field957] = field1120;
                field970[field957] = field1141;
                field963[field957] = arg0.field1175;
                field964[field957] = arg0.field1176;
                field965[field957] = arg0.field1174;
                field1039[field957] = arg0.field1171;
                field957++;
            }
        }
        for (int var42 = 0; var42 < 4; var42++) {
            int var43 = arg0.field1180[var42];
            int var44 = arg0.field1181[var42];
            class282 var45 = null;
            int var46 = 0;
            if (var44 >= 0) {
                if (var43 <= field929) {
                    continue;
                }
                var45 = class282.method3145(arg0.field1181[var42]);
                var46 = var45.field3576;
                if (var45 != null && var45.field3587 != null) {
                    var45 = var45.method4576();
                    if (var45 == null) {
                        arg0.field1180[var42] = -1;
                        continue;
                    }
                }
            } else if (var43 < 0) {
                continue;
            }
            int var47 = arg0.field1184[var42];
            class282 var48 = null;
            if (var47 >= 0) {
                var48 = class282.method3145(var47);
                if (var48 != null && var48.field3587 != null) {
                    var48 = var48.method4576();
                }
            }
            if (var43 - var46 <= field929) {
                if (var45 == null) {
                    arg0.field1180[var42] = -1;
                } else {
                    method273(arg0, arg0.field1208 / 2);
                    if (field1120 > -1) {
                        if (var42 == 1) {
                            field1141 -= 20;
                        }
                        if (var42 == 2) {
                            field1120 -= 15;
                            field1141 -= 10;
                        }
                        if (var42 == 3) {
                            field1120 += 15;
                            field1141 -= 10;
                        }
                        Object var49 = null;
                        Object var50 = null;
                        Object var51 = null;
                        Object var52 = null;
                        int var53 = 0;
                        int var54 = 0;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        class332 var61 = null;
                        class332 var62 = null;
                        class332 var63 = null;
                        class332 var64 = null;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        class332 var74 = var45.method4582();
                        if (var74 != null) {
                            var53 = var74.field3983;
                            int var75 = var74.field3988;
                            if (var75 > var73) {
                                var73 = var75;
                            }
                            var57 = var74.field3989;
                        }
                        class332 var76 = var45.method4605();
                        if (var76 != null) {
                            var54 = var76.field3983;
                            int var77 = var76.field3988;
                            if (var77 > var73) {
                                var73 = var77;
                            }
                            var58 = var76.field3989;
                        }
                        class332 var78 = var45.method4580();
                        if (var78 != null) {
                            var55 = var78.field3983;
                            int var79 = var78.field3988;
                            if (var79 > var73) {
                                var73 = var79;
                            }
                            var59 = var78.field3989;
                        }
                        class332 var80 = var45.method4595();
                        if (var80 != null) {
                            var56 = var80.field3983;
                            int var81 = var80.field3988;
                            if (var81 > var73) {
                                var73 = var81;
                            }
                            var60 = var80.field3989;
                        }
                        if (var48 != null) {
                            var61 = var48.method4582();
                            if (var61 != null) {
                                var65 = var61.field3983;
                                int var82 = var61.field3988;
                                if (var82 > var73) {
                                    var73 = var82;
                                }
                                var69 = var61.field3989;
                            }
                            var62 = var48.method4605();
                            if (var62 != null) {
                                var66 = var62.field3983;
                                int var83 = var62.field3988;
                                if (var83 > var73) {
                                    var73 = var83;
                                }
                                var70 = var62.field3989;
                            }
                            var63 = var48.method4580();
                            if (var63 != null) {
                                var67 = var63.field3983;
                                int var84 = var63.field3988;
                                if (var84 > var73) {
                                    var73 = var84;
                                }
                                var71 = var63.field3989;
                            }
                            var64 = var48.method4595();
                            if (var64 != null) {
                                var68 = var64.field3983;
                                int var85 = var64.field3988;
                                if (var85 > var73) {
                                    var73 = var85;
                                }
                                var72 = var64.field3989;
                            }
                        }
                        class312 var86 = var45.method4584();
                        if (var86 == null) {
                            var86 = Statics.field653;
                        }
                        class312 var87;
                        if (var48 == null) {
                            var87 = Statics.field653;
                        } else {
                            var87 = var48.method4584();
                            if (var87 == null) {
                                var87 = Statics.field653;
                            }
                        }
                        Object var88 = null;
                        String var89 = null;
                        boolean var90 = false;
                        int var91 = 0;
                        String var92 = var45.method4577(arg0.field1179[var42]);
                        int var93 = var86.method5144(var92);
                        if (var48 != null) {
                            var89 = var48.method4577(arg0.field1182[var42]);
                            var91 = var87.method5144(var89);
                        }
                        int var94 = 0;
                        int var95 = 0;
                        if (var54 > 0) {
                            if (var78 == null && var80 == null) {
                                var94 = 1;
                            } else {
                                var94 = var93 / var54 + 1;
                            }
                        }
                        if (var48 != null && var66 > 0) {
                            if (var63 == null && var64 == null) {
                                var95 = 1;
                            } else {
                                var95 = var91 / var66 + 1;
                            }
                        }
                        int var96 = 0;
                        int var97 = var96;
                        if (var53 > 0) {
                            var96 += var53;
                        }
                        var96 += 2;
                        int var98 = var96;
                        if (var55 > 0) {
                            var96 += var55;
                        }
                        int var99 = var96;
                        int var100 = var96;
                        int var102;
                        if (var54 > 0) {
                            int var101 = var54 * var94;
                            var102 = var96 + var101;
                            var100 = (var101 - var93) / 2 + var96;
                        } else {
                            var102 = var93 + var96;
                        }
                        int var103 = var102;
                        if (var56 > 0) {
                            var102 += var56;
                        }
                        int var104 = 0;
                        int var105 = 0;
                        int var106 = 0;
                        int var107 = 0;
                        int var108 = 0;
                        if (var48 != null) {
                            var102 += 2;
                            var104 = var102;
                            if (var65 > 0) {
                                var102 += var65;
                            }
                            var102 += 2;
                            var105 = var102;
                            if (var67 > 0) {
                                var102 += var67;
                            }
                            var106 = var102;
                            var108 = var102;
                            if (var66 > 0) {
                                int var109 = var66 * var95;
                                var102 += var109;
                                var108 += (var109 - var91) / 2;
                            } else {
                                var102 += var91;
                            }
                            var107 = var102;
                            if (var68 > 0) {
                                var102 += var68;
                            }
                        }
                        int var110 = arg0.field1180[var42] - field929;
                        int var111 = var45.field3572 - var45.field3572 * var110 / var45.field3576;
                        int var112 = var45.field3582 * var110 / var45.field3576 + -var45.field3582;
                        int var113 = field1120 + arg2 - (var102 >> 1) + var111;
                        int var114 = field1141 + arg3 - 12 + var112;
                        int var115 = var114;
                        int var116 = var73 + var114;
                        int var117 = var45.field3585 + var114 + 15;
                        int var118 = var117 - var86.field3902;
                        int var119 = var86.field3901 + var117;
                        if (var118 < var114) {
                            var115 = var118;
                        }
                        if (var119 > var116) {
                            var116 = var119;
                        }
                        int var120 = 0;
                        if (var48 != null) {
                            var120 = var48.field3585 + var114 + 15;
                            int var121 = var120 - var87.field3902;
                            int var122 = var87.field3901 + var120;
                            if (var121 < var115) {
                                ;
                            }
                            if (var122 > var116) {
                                ;
                            }
                        }
                        int var125 = 255;
                        if (var45.field3583 >= 0) {
                            var125 = (var110 << 8) / (var45.field3576 - var45.field3583);
                        }
                        if (var125 >= 0 && var125 < 255) {
                            if (var74 != null) {
                                var74.method5471(var97 + var113 - var57, var114, var125);
                            }
                            if (var78 != null) {
                                var78.method5471(var98 + var113 - var59, var114, var125);
                            }
                            if (var76 != null) {
                                for (int var126 = 0; var126 < var94; var126++) {
                                    var76.method5471(var54 * var126 + (var99 + var113 - var58), var114, var125);
                                }
                            }
                            if (var80 != null) {
                                var80.method5471(var103 + var113 - var60, var114, var125);
                            }
                            var86.method5089(var92, var100 + var113, var117, var45.field3575, 0, var125);
                            if (var48 != null) {
                                if (var61 != null) {
                                    var61.method5471(var104 + var113 - var69, var114, var125);
                                }
                                if (var63 != null) {
                                    var63.method5471(var105 + var113 - var71, var114, var125);
                                }
                                if (var62 != null) {
                                    for (int var127 = 0; var127 < var95; var127++) {
                                        var62.method5471(var66 * var127 + (var106 + var113 - var70), var114, var125);
                                    }
                                }
                                if (var64 != null) {
                                    var64.method5471(var107 + var113 - var72, var114, var125);
                                }
                                var87.method5089(var89, var108 + var113, var120, var48.field3575, 0, var125);
                            }
                        } else {
                            if (var74 != null) {
                                var74.method5514(var97 + var113 - var57, var114);
                            }
                            if (var78 != null) {
                                var78.method5514(var98 + var113 - var59, var114);
                            }
                            if (var76 != null) {
                                for (int var128 = 0; var128 < var94; var128++) {
                                    var76.method5514(var54 * var128 + (var99 + var113 - var58), var114);
                                }
                            }
                            if (var80 != null) {
                                var80.method5514(var103 + var113 - var60, var114);
                            }
                            var86.method5088(var92, var100 + var113, var117, var45.field3575 | 0xFF000000, 0);
                            if (var48 != null) {
                                if (var61 != null) {
                                    var61.method5514(var104 + var113 - var69, var114);
                                }
                                if (var63 != null) {
                                    var63.method5514(var105 + var113 - var71, var114);
                                }
                                if (var62 != null) {
                                    for (int var129 = 0; var129 < var95; var129++) {
                                        var62.method5514(var66 * var129 + (var106 + var113 - var70), var114);
                                    }
                                }
                                if (var64 != null) {
                                    var64.method5514(var107 + var113 - var72, var114);
                                }
                                var87.method5088(var89, var108 + var113, var120, var48.field3575 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("iv.gp(I)V")
    public static final void method4128() {
        field899 = 0;
        int var0 = (Statics.field642.field1211 >> 7) + Statics.field2048;
        int var1 = (Statics.field642.field1188 >> 7) + Statics.field360;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field899 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field899 = 1;
        }
        if (field899 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field899 = 0;
        }
    }

    @ObfuscatedName("al.gc(Lba;IS)V")
    public static final void method273(class76 arg0, int arg1) {
        method2074(arg0.field1211, arg0.field1188, arg1);
    }

    @ObfuscatedName("dm.gu(IIII)V")
    public static final void method2074(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field1120 = -1;
            field1141 = -1;
            return;
        }
        int var3 = method4325(arg0, arg1, Statics.field270) - arg2;
        int var4 = arg0 - Statics.field864;
        int var5 = var3 - Statics.field2122;
        int var6 = arg1 - Statics.field343;
        int var7 = class135.field1963[Statics.field318];
        int var8 = class135.field1964[Statics.field318];
        int var9 = class135.field1963[Statics.field418];
        int var10 = class135.field1964[Statics.field418];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field1120 = field1130 * var11 / var15 + field1128 / 2;
            field1141 = field1130 * var14 / var15 + field1129 / 2;
        } else {
            field1120 = -1;
            field1141 = -1;
        }
    }

    @ObfuscatedName("jh.gn(IIII)I")
    public static final int method4325(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class63.field740[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class63.field745[var5][var3][var4] + class63.field745[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class63.field745[var5][var3][var4 + 1] + class63.field745[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("d.gb(ZLgs;I)V")
    public static final void method6(boolean arg0, class202 arg1) {
        field928 = arg0;
        if (!field928) {
            int var2 = arg1.method3243();
            int var3 = arg1.method3242();
            int var4 = arg1.method3207();
            Statics.field2153 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2153[var5][var6] = arg1.method3254();
                }
            }
            Statics.field3837 = new int[var4];
            Statics.field770 = new int[var4];
            Statics.field3889 = new int[var4];
            Statics.field3545 = new byte[var4][];
            Statics.field1140 = new byte[var4][];
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
                        Statics.field3837[var8] = var11;
                        Statics.field770[var8] = Statics.field814.method4175("m" + var9 + "_" + var10);
                        Statics.field3889[var8] = Statics.field814.method4175("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method4819(var3, var2, true);
            return;
        }
        boolean var12 = arg1.method3226() == 1;
        int var13 = arg1.method3242();
        int var14 = arg1.method3242();
        int var15 = arg1.method3207();
        arg1.method3463();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3477(1);
                    if (var19 == 1) {
                        field911[var16][var17][var18] = arg1.method3477(26);
                    } else {
                        field911[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3465();
        Statics.field2153 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field2153[var20][var21] = arg1.method3254();
            }
        }
        Statics.field3837 = new int[var15];
        Statics.field770 = new int[var15];
        Statics.field3889 = new int[var15];
        Statics.field3545 = new byte[var15][];
        Statics.field1140 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field911[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field3837[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field3837[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field770[var22] = Statics.field814.method4175("m" + var31 + "_" + var32);
                            Statics.field3889[var22] = Statics.field814.method4175("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method4819(var13, var14, !var12);
    }

    @ObfuscatedName("ko.gl(IIZB)V")
    public static final void method4819(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field762 == arg0 && Statics.field302 == arg1) {
            return;
        }
        Statics.field762 = arg0;
        Statics.field302 = arg1;
        method1003(25);
        method1536(class252.field3035, true);
        int var3 = Statics.field2048;
        int var4 = Statics.field360;
        Statics.field2048 = (arg0 - 6) * 8;
        Statics.field360 = (arg1 - 6) * 8;
        int var5 = Statics.field2048 - var3;
        int var6 = Statics.field360 - var4;
        int var7 = Statics.field2048;
        int var8 = Statics.field360;
        for (int var9 = 0; var9 < 32768; var9++) {
            class85 var10 = field910[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1213[var11] -= var5;
                    var10.field1214[var11] -= var6;
                }
                var10.field1211 -= var5 * 128;
                var10.field1188 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class73 var13 = field986[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1213[var14] -= var5;
                    var13.field1214[var14] -= var6;
                }
                var13.field1211 -= var5 * 128;
                var13.field1188 -= var6 * 128;
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
                        field915[var25][var21][var22] = field915[var25][var23][var24];
                    } else {
                        field915[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class75 var26 = (class75) field999.method3707(); var26 != null; var26 = (class75) field999.method3697()) {
            var26.field1144 -= var5;
            var26.field1146 -= var6;
            if (var26.field1144 < 0 || var26.field1146 < 0 || var26.field1144 >= 104 || var26.field1146 >= 104) {
                var26.method3681();
            }
        }
        if (field1137 != 0) {
            field1137 -= var5;
            field1099 -= var6;
        }
        field1106 = 0;
        field1112 = false;
        Statics.field864 -= var5 << 7;
        Statics.field343 -= var6 << 7;
        Statics.field2229 -= var5 << 7;
        Statics.field579 -= var6 << 7;
        field882 = -1;
        field1001.method3695();
        field1000.method3695();
        for (int var27 = 0; var27 < 4; var27++) {
            field893[var27].method3072();
        }
    }

    @ObfuscatedName("bf.gv(ZI)V")
    public static final void method722(boolean arg0) {
        Statics.method35();
        field958.field1486++;
        if (field958.field1486 < 50 && !arg0) {
            return;
        }
        field958.field1486 = 0;
        if (field917 || field958.method1870() == null) {
            return;
        }
        class185 var1 = class185.method267(class182.field2453, field958.field1485);
        field958.method1882(var1);
        try {
            field958.method1869();
        } catch (IOException var3) {
            field917 = true;
        }
    }

    @ObfuscatedName("bi.gt(II)V")
    public static final void method1028(int arg0) {
        int[] var1 = Statics.field240.field3984;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class63.field740[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field3341.method2659(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class63.field740[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field3341.method2659(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field240.method5410();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class63.field740[arg0][var10][var9] & 0x18) == 0) {
                    method1065(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class63.field740[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method1065(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1094 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field3341.method2637(Statics.field270, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class283.method713(var14).field3619;
                    if (var15 >= 0) {
                        field1118[field1094] = Statics.field3455[var15].method4385(false);
                        field1095[field1094] = var11;
                        field1096[field1094] = var12;
                        field1094++;
                    }
                }
            }
        }
        Statics.field535.method5379();
    }

    @ObfuscatedName("bv.gs(IIIIIB)V")
    public static final void method1065(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field3341.method2651(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field3341.method2764(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field240.field3984;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class283 var13 = class283.method713(var12);
            if (var13.field3593 == -1) {
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
                class331 var14 = Statics.field1799[var13.field3593];
                if (var14 != null) {
                    int var15 = (var13.field3595 * 4 - var14.field3975) / 2;
                    int var16 = (var13.field3607 * 4 - var14.field3977) / 2;
                    var14.method5386(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3607) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field3341.method2661(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field3341.method2764(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class283 var22 = class283.method713(var21);
            if (var22.field3593 != -1) {
                class331 var23 = Statics.field1799[var22.field3593];
                if (var23 != null) {
                    int var24 = (var22.field3595 * 4 - var23.field3975) / 2;
                    int var25 = (var22.field3607 * 4 - var23.field3977) / 2;
                    var23.method5386(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3607) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field240.field3984;
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
        int var29 = Statics.field3341.method2637(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class283 var31 = class283.method713(var30);
        if (var31.field3593 == -1) {
            return;
        }
        class331 var32 = Statics.field1799[var31.field3593];
        if (var32 != null) {
            int var33 = (var31.field3595 * 4 - var32.field3975) / 2;
            int var34 = (var31.field3607 * 4 - var32.field3977) / 2;
            var32.method5386(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3607) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.gx(Lcq;I)Z")
    public final boolean method1148(class100 arg0) {
        class170 var2 = arg0.method1870();
        class202 var3 = arg0.field1492;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1487 == null) {
                if (arg0.field1490) {
                    if (!var2.method3010(1)) {
                        return false;
                    }
                    var2.method3024(arg0.field1492.field2574, 0, 1);
                    arg0.field1481 = 0;
                    arg0.field1490 = false;
                }
                var3.field2575 = 0;
                if (var3.method3461()) {
                    if (!var2.method3010(1)) {
                        return false;
                    }
                    var2.method3024(arg0.field1492.field2574, 1, 1);
                    arg0.field1481 = 0;
                }
                arg0.field1490 = true;
                class181[] var4 = new class181[] { class181.field2326, class181.field2305, class181.field2376, class181.field2301, class181.field2302, class181.field2352, class181.field2304, class181.field2342, class181.field2306, class181.field2307, class181.field2308, class181.field2363, class181.field2310, class181.field2311, class181.field2312, class181.field2313, class181.field2314, class181.field2315, class181.field2345, class181.field2331, class181.field2327, class181.field2319, class181.field2320, class181.field2321, class181.field2322, class181.field2323, class181.field2329, class181.field2303, class181.field2334, class181.field2317, class181.field2328, class181.field2337, class181.field2330, class181.field2378, class181.field2332, class181.field2333, class181.field2380, class181.field2300, class181.field2336, class181.field2299, class181.field2338, class181.field2298, class181.field2340, class181.field2341, class181.field2370, class181.field2343, class181.field2344, class181.field2358, class181.field2346, class181.field2347, class181.field2348, class181.field2349, class181.field2350, class181.field2351, class181.field2362, class181.field2353, class181.field2354, class181.field2361, class181.field2339, class181.field2357, class181.field2318, class181.field2359, class181.field2325, class181.field2335, class181.field2369, class181.field2356, class181.field2364, class181.field2365, class181.field2366, class181.field2367, class181.field2368, class181.field2324, class181.field2382, class181.field2371, class181.field2372, class181.field2373, class181.field2374, class181.field2375, class181.field2316, class181.field2377, class181.field2355, class181.field2379, class181.field2360, class181.field2381 };
                int var6 = var3.method3464();
                if (var6 < 0 || var6 >= var4.length) {
                    throw new IOException(var6 + " " + var3.field2575);
                }
                arg0.field1487 = var4[var6];
                arg0.field1482 = arg0.field1487.field2383;
            }
            if (arg0.field1482 == -1) {
                if (!var2.method3010(1)) {
                    return false;
                }
                arg0.method1870().method3024(var3.field2574, 0, 1);
                arg0.field1482 = var3.field2574[0] & 0xFF;
            }
            if (arg0.field1482 == -2) {
                if (!var2.method3010(2)) {
                    return false;
                }
                arg0.method1870().method3024(var3.field2574, 0, 2);
                var3.field2575 = 0;
                arg0.field1482 = var3.method3207();
            }
            if (!var2.method3010(arg0.field1482)) {
                return false;
            }
            var3.field2575 = 0;
            var2.method3024(var3.field2574, 0, arg0.field1482);
            arg0.field1481 = 0;
            field919.method4822();
            arg0.field1494 = arg0.field1493;
            arg0.field1493 = arg0.field1496;
            arg0.field1496 = arg0.field1487;
            if (class181.field2299 == arg0.field1487) {
                int var7 = var3.method3254();
                class243 var8 = class243.method577(var7);
                var8.field2866 = 3;
                var8.field2867 = Statics.field642.field848.method4024();
                method5068(var8);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2365 == arg0.field1487) {
                int var9 = var3.method3244();
                int var10 = var3.method3250();
                int var11 = var3.method3283();
                class243 var12 = class243.method577(var10);
                if (var12.field2832 != var9 || var12.field2853 != var11 || var12.field2817 != 0 || var12.field2829 != 0) {
                    var12.field2832 = var9;
                    var12.field2853 = var11;
                    var12.field2817 = 0;
                    var12.field2829 = 0;
                    method5068(var12);
                    this.method1494(var12);
                    if (var12.field2825 == 0) {
                        method1733(Statics.field812[var10 >> 16], var12, false);
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2328 == arg0.field1487) {
                int var13 = var3.method3254();
                class68 var14 = (class68) field1031.method3637((long) var13);
                if (var14 != null) {
                    method757(var14, true);
                }
                if (field1034 != null) {
                    method5068(field1034);
                    field1034 = null;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2344 == arg0.field1487) {
                field1085 = var3.method3226();
                field1084 = var3.method3234();
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2343 == arg0.field1487) {
                int var15 = var3.method3254();
                int var16 = var3.method3207();
                class238.field2778[var16] = var15;
                if (class238.field2779[var16] != var15) {
                    class238.field2779[var16] = var15;
                }
                method131(var16);
                field985[++field1055 - 1 & 0x1F] = var16;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2314 == arg0.field1487) {
                int var17 = var3.method3205();
                if (var3.method3205() == 0) {
                    field1134[var17] = new class17();
                    var3.field2575 += 18;
                } else {
                    var3.field2575--;
                    field1134[var17] = new class17(var3, false);
                }
                field1063 = field1066;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2372 == arg0.field1487) {
                String var18 = var3.method3284();
                Object[] var19 = new Object[var18.length() + 1];
                for (int var20 = var18.length() - 1; var20 >= 0; var20--) {
                    if (var18.charAt(var20) == 's') {
                        var19[var20 + 1] = var3.method3284();
                    } else {
                        var19[var20 + 1] = Integer.valueOf(var3.method3254());
                    }
                }
                var19[0] = Integer.valueOf(var3.method3254());
                class69 var21 = new class69();
                var21.field808 = var19;
                class82.method2061(var21);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2313 == arg0.field1487) {
                for (int var22 = 0; var22 < field986.length; var22++) {
                    if (field986[var22] != null) {
                        field986[var22].field1190 = -1;
                    }
                }
                for (int var23 = 0; var23 < field910.length; var23++) {
                    if (field910[var23] != null) {
                        field910[var23].field1190 = -1;
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2359 == arg0.field1487) {
                Statics.field3552 = var3.method3324();
                Statics.field795 = var3.method3226();
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2336 == arg0.field1487) {
                int var24 = var3.method3250();
                int var25 = var3.method3241();
                if (var25 == 65535) {
                    var25 = -1;
                }
                int var26 = var3.method3252();
                int var27 = var3.method3241();
                if (var27 == 65535) {
                    var27 = -1;
                }
                for (int var28 = var25; var28 <= var27; var28++) {
                    long var29 = ((long) var24 << 32) + (long) var28;
                    class217 var31 = field1070.method3637(var29);
                    if (var31 != null) {
                        var31.method3681();
                    }
                    field1070.method3638(new class224(var26), var29);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2332 == arg0.field1487) {
                int var32 = var3.method3205();
                field961 = var32;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2356 == arg0.field1487) {
                String var33 = var3.method3284();
                int var34 = var3.method3205();
                int var35 = var3.method3205();
                if (var34 >= 1 && var34 <= 8) {
                    if (var33.equalsIgnoreCase(class252.field3032)) {
                        var33 = null;
                    }
                    field994[var34 - 1] = var33;
                    field995[var34 - 1] = var35 == 0;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2298 == arg0.field1487) {
                method6(false, arg0.field1492);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2355 == arg0.field1487) {
                field1100 = var3.method3205();
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2366 == arg0.field1487) {
                boolean var36 = var3.method3226() == 1;
                int var37 = var3.method3252();
                class243 var38 = class243.method577(var37);
                if (var38.field2843 != var36) {
                    var38.field2843 = var36;
                    method5068(var38);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2308 == arg0.field1487) {
                method6(true, arg0.field1492);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2351 == arg0.field1487) {
                method756(class184.field2492);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2317 == arg0.field1487) {
                int var39 = var3.method3251();
                int var40 = var3.method3234();
                int var41 = var3.method3241();
                class68 var42 = (class68) field1031.method3637((long) var39);
                if (var42 != null) {
                    method757(var42, var42.field790 != var41);
                }
                method4152(var39, var41, var40);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2371 == arg0.field1487) {
                field889 = var3.method3243() * 30;
                field1065 = field1066;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2323 == arg0.field1487) {
                Statics.field795 = var3.method3324();
                Statics.field3552 = var3.method3226();
                while (var3.field2575 < arg0.field1482) {
                    int var43 = var3.method3205();
                    class184[] var44 = new class184[] { class184.field2492, class184.field2491, class184.field2502, class184.field2493, class184.field2490, class184.field2495, class184.field2494, class184.field2496, class184.field2498, class184.field2499 };
                    class184 var45 = var44[var43];
                    method756(var45);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2321 == arg0.field1487) {
                method756(class184.field2494);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2338 == arg0.field1487) {
                int var46 = arg0.field1482;
                int var47 = var3.field2575;
                class94.field1439 = 0;
                int var48 = 0;
                var3.method3463();
                for (int var49 = 0; var49 < class94.field1432; var49++) {
                    int var50 = class94.field1437[var49];
                    if ((class94.field1429[var50] & 0x1) == 0) {
                        if (var48 > 0) {
                            var48--;
                            class94.field1429[var50] = (byte) (class94.field1429[var50] | 0x2);
                        } else {
                            int var51 = var3.method3477(1);
                            if (var51 == 0) {
                                var48 = class94.method1644(var3);
                                class94.field1429[var50] = (byte) (class94.field1429[var50] | 0x2);
                            } else {
                                class94.method172(var3, var50);
                            }
                        }
                    }
                }
                var3.method3465();
                if (var48 != 0) {
                    throw new RuntimeException();
                }
                var3.method3463();
                for (int var52 = 0; var52 < class94.field1432; var52++) {
                    int var53 = class94.field1437[var52];
                    if ((class94.field1429[var53] & 0x1) != 0) {
                        if (var48 > 0) {
                            var48--;
                            class94.field1429[var53] = (byte) (class94.field1429[var53] | 0x2);
                        } else {
                            int var54 = var3.method3477(1);
                            if (var54 == 0) {
                                var48 = class94.method1644(var3);
                                class94.field1429[var53] = (byte) (class94.field1429[var53] | 0x2);
                            } else {
                                class94.method172(var3, var53);
                            }
                        }
                    }
                }
                var3.method3465();
                if (var48 != 0) {
                    throw new RuntimeException();
                }
                var3.method3463();
                for (int var55 = 0; var55 < class94.field1434; var55++) {
                    int var56 = class94.field1436[var55];
                    if ((class94.field1429[var56] & 0x1) != 0) {
                        if (var48 > 0) {
                            var48--;
                            class94.field1429[var56] = (byte) (class94.field1429[var56] | 0x2);
                        } else {
                            int var57 = var3.method3477(1);
                            if (var57 == 0) {
                                var48 = class94.method1644(var3);
                                class94.field1429[var56] = (byte) (class94.field1429[var56] | 0x2);
                            } else if (class94.method1029(var3, var56)) {
                                class94.field1429[var56] = (byte) (class94.field1429[var56] | 0x2);
                            }
                        }
                    }
                }
                var3.method3465();
                if (var48 != 0) {
                    throw new RuntimeException();
                }
                var3.method3463();
                for (int var58 = 0; var58 < class94.field1434; var58++) {
                    int var59 = class94.field1436[var58];
                    if ((class94.field1429[var59] & 0x1) == 0) {
                        if (var48 > 0) {
                            var48--;
                            class94.field1429[var59] = (byte) (class94.field1429[var59] | 0x2);
                        } else {
                            int var60 = var3.method3477(1);
                            if (var60 == 0) {
                                var48 = class94.method1644(var3);
                                class94.field1429[var59] = (byte) (class94.field1429[var59] | 0x2);
                            } else if (class94.method1029(var3, var59)) {
                                class94.field1429[var59] = (byte) (class94.field1429[var59] | 0x2);
                            }
                        }
                    }
                }
                var3.method3465();
                if (var48 != 0) {
                    throw new RuntimeException();
                }
                class94.field1432 = 0;
                class94.field1434 = 0;
                for (int var61 = 1; var61 < 2048; var61++) {
                    class94.field1429[var61] = (byte) (class94.field1429[var61] >> 1);
                    class73 var62 = field986[var61];
                    if (var62 == null) {
                        class94.field1436[++class94.field1434 - 1] = var61;
                    } else {
                        class94.field1437[++class94.field1432 - 1] = var61;
                    }
                }
                for (int var63 = 0; var63 < class94.field1439; var63++) {
                    int var64 = class94.field1440[var63];
                    class73 var65 = field986[var64];
                    int var66 = var3.method3205();
                    if ((var66 & 0x20) != 0) {
                        var66 += var3.method3205() << 8;
                    }
                    class94.method4483(var3, var64, var65, var66);
                }
                if (var3.field2575 - var47 != var46) {
                    throw new RuntimeException(var3.field2575 - var47 + " " + var46);
                }
                if (Statics.field26 != null) {
                    field1136 = field929;
                    Statics.field26.method4304();
                    for (int var67 = 0; var67 < field986.length; var67++) {
                        if (field986[var67] != null) {
                            Statics.field26.method4319((field986[var67].field1211 >> 7) + Statics.field2048, (field986[var67].field1188 >> 7) + Statics.field360);
                        }
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2319 == arg0.field1487) {
                int var68 = var3.method3254();
                if (field971 != var68) {
                    field971 = var68;
                    method31();
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2369 == arg0.field1487) {
                field1112 = false;
                for (int var69 = 0; var69 < 5; var69++) {
                    field956[var69] = false;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2370 == arg0.field1487) {
                method756(class184.field2491);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2345 == arg0.field1487) {
                String var70 = var3.method3284();
                Statics.field658 = var70;
                try {
                    String var71 = Statics.field359.getParameter(class294.field3812.field3816);
                    String var72 = Statics.field359.getParameter(class294.field3809.field3816);
                    String var73 = var71 + "settings=" + var70 + "; version=1; path=/; domain=" + var72;
                    String var74;
                    if (var70.length() == 0) {
                        var74 = var73 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        String var75 = var73 + "; Expires=";
                        long var76 = class197.method1005() + 94608000000L;
                        class205.field2621.setTime(new Date(var76));
                        int var78 = class205.field2621.get(7);
                        int var79 = class205.field2621.get(5);
                        int var80 = class205.field2621.get(2);
                        int var81 = class205.field2621.get(1);
                        int var82 = class205.field2621.get(11);
                        int var83 = class205.field2621.get(12);
                        int var84 = class205.field2621.get(13);
                        String var85 = class205.field2620[var78 - 1] + ", " + var79 / 10 + var79 % 10 + "-" + class205.field2622[0][var80] + "-" + var81 + " " + var82 / 10 + var82 % 10 + ":" + var83 / 10 + var83 % 10 + ":" + var84 / 10 + var84 % 10 + " GMT";
                        var74 = var75 + var85 + "; Max-Age=" + 94608000L;
                    }
                    client var86 = Statics.field359;
                    String var87 = "document.cookie=\"" + var74 + "\"";
                    JSObject.getWindow(var86).eval(var87);
                } catch (Throwable var299) {
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2327 == arg0.field1487) {
                if (Statics.field696 != null) {
                    Statics.field696.method5043(var3);
                }
                field968 = field1066;
                Statics.field250 = true;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2349 == arg0.field1487) {
                class78 var89 = new class78();
                var89.field1235 = var3.method3284();
                var89.field1236 = var3.method3207();
                int var90 = var3.method3254();
                var89.field1234 = var90;
                method1003(45);
                var2.method3014();
                Object var91 = null;
                class91.method587(var89);
                arg0.field1487 = null;
                return false;
            }
            if (class181.field2373 == arg0.field1487) {
                method756(class184.field2495);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2303 == arg0.field1487) {
                int var92 = var3.method3244();
                int var93 = var3.method3252();
                class243 var94 = class243.method577(var93);
                if (var94.field2870 != var92 || var92 == -1) {
                    var94.field2870 = var92;
                    var94.field2936 = 0;
                    var94.field2946 = 0;
                    method5068(var94);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2376 == arg0.field1487) {
                int var95 = var3.method3207();
                int var96 = var3.method3250();
                class243 var97 = class243.method577(var96);
                if (var97 != null && var97.field2825 == 0) {
                    if (var95 > var97.field2934 - var97.field2919) {
                        var95 = var97.field2934 - var97.field2919;
                    }
                    if (var95 < 0) {
                        var95 = 0;
                    }
                    if (var97.field2845 != var95) {
                        var97.field2845 = var95;
                        method5068(var97);
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2380 == arg0.field1487) {
                int var98 = var3.method3251();
                int var99 = var3.method3207();
                class243 var100 = class243.method577(var98);
                if (var100.field2866 != 2 || var100.field2867 != var99) {
                    var100.field2866 = 2;
                    var100.field2867 = var99;
                    method5068(var100);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2315 == arg0.field1487) {
                int var101 = var3.method3254();
                class243 var102 = class243.method577(var101);
                for (int var103 = 0; var103 < var102.field2903.length; var103++) {
                    var102.field2903[var103] = -1;
                    var102.field2903[var103] = 0;
                }
                method5068(var102);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2312 == arg0.field1487) {
                int var104 = var3.method3242();
                byte var105 = var3.method3210();
                class238.field2778[var104] = var105;
                if (class238.field2779[var104] != var105) {
                    class238.field2779[var104] = var105;
                }
                method131(var104);
                field985[++field1055 - 1 & 0x1F] = var104;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2341 == arg0.field1487) {
                method4138();
                field1125 = var3.method3205();
                field1065 = field1066;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2306 == arg0.field1487) {
                int var106 = var3.method3251();
                int var107 = var3.method3252();
                class68 var108 = (class68) field1031.method3637((long) var107);
                class68 var109 = (class68) field1031.method3637((long) var106);
                if (var109 != null) {
                    method757(var109, var108 == null || var108.field790 != var109.field790);
                }
                if (var108 != null) {
                    var108.method3681();
                    field1031.method3638(var108, (long) var106);
                }
                class243 var110 = class243.method577(var107);
                if (var110 != null) {
                    method5068(var110);
                }
                class243 var111 = class243.method577(var106);
                if (var111 != null) {
                    method5068(var111);
                    method1733(Statics.field812[var111.field2826 >>> 16], var111, true);
                }
                if (field1016 != -1) {
                    method1856(field1016, 1);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2311 == arg0.field1487) {
                int var112 = var3.method3254();
                int var113 = var3.method3207();
                if (var112 < -70000) {
                    var113 += 32768;
                }
                class243 var114;
                if (var112 >= 0) {
                    var114 = class243.method577(var112);
                } else {
                    var114 = null;
                }
                if (var114 != null) {
                    for (int var115 = 0; var115 < var114.field2903.length; var115++) {
                        var114.field2903[var115] = 0;
                        var114.field2942[var115] = 0;
                    }
                }
                class66 var116 = (class66) class66.field772.method3637((long) var113);
                if (var116 != null) {
                    for (int var117 = 0; var117 < var116.field769.length; var117++) {
                        var116.field769[var117] = -1;
                        var116.field768[var117] = 0;
                    }
                }
                int var118 = var3.method3207();
                for (int var119 = 0; var119 < var118; var119++) {
                    int var120 = var3.method3226();
                    if (var120 == 255) {
                        var120 = var3.method3250();
                    }
                    int var121 = var3.method3243();
                    if (var114 != null && var119 < var114.field2903.length) {
                        var114.field2903[var119] = var121;
                        var114.field2942[var119] = var120;
                    }
                    class66.method1525(var113, var119, var121 - 1, var120);
                }
                if (var114 != null) {
                    method5068(var114);
                }
                method4138();
                field1056[++field1057 - 1 & 0x1F] = var113 & 0x7FFF;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2339 == arg0.field1487) {
                int var122 = var3.method3252();
                int var123 = var3.method3243();
                int var124 = var3.method3242();
                class243 var125 = class243.method577(var122);
                var125.field2905 = (var123 << 16) + var124;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2360 == arg0.field1487) {
                int var126 = var3.method3207();
                if (var126 == 65535) {
                    var126 = -1;
                }
                if (var126 == -1 && !field1103) {
                    class230.method2916();
                } else if (var126 != -1 && field1027 != var126 && field997 != 0 && !field1103) {
                    class230.method2958(2, Statics.field2606, var126, 0, field997, false);
                }
                field1027 = var126;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2379 == arg0.field1487) {
                int var127 = var3.method3207();
                if (var127 == 65535) {
                    var127 = -1;
                }
                int var128 = var3.method3246();
                if (field997 != 0 && var127 != -1) {
                    class230.method3130(Statics.field2531, var127, 0, field997, false);
                    field1103 = true;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2367 == arg0.field1487) {
                if (arg0.field1482 == 0) {
                    Statics.field696 = null;
                } else {
                    if (Statics.field696 == null) {
                        Statics.field696 = new class308(Statics.field2519, Statics.field359);
                    }
                    Statics.field696.method5049(var3);
                }
                field968 = field1066;
                Statics.field250 = true;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2361 == arg0.field1487) {
                int var129 = var3.method3241();
                if (var129 == 65535) {
                    var129 = -1;
                }
                int var130 = var3.method3251();
                int var131 = var3.method3251();
                class243 var132 = class243.method577(var131);
                if (var132.field2822) {
                    var132.field2943 = var129;
                    var132.field2944 = var130;
                    class284 var134 = class284.method660(var129);
                    var132.field2812 = var134.field3659;
                    var132.field2875 = var134.field3660;
                    var132.field2945 = var134.field3690;
                    var132.field2872 = var134.field3662;
                    var132.field2813 = var134.field3663;
                    var132.field2811 = var134.field3658;
                    if (var134.field3664 == 1) {
                        var132.field2854 = 1;
                    } else {
                        var132.field2854 = 2;
                    }
                    if (var132.field2881 > 0) {
                        var132.field2811 = var132.field2811 * 32 / var132.field2881;
                    } else if (var132.field2957 > 0) {
                        var132.field2811 = var132.field2811 * 32 / var132.field2957;
                    }
                    method5068(var132);
                } else if (var129 == -1) {
                    var132.field2866 = 0;
                    arg0.field1487 = null;
                    return true;
                } else {
                    class284 var133 = class284.method660(var129);
                    var132.field2866 = 4;
                    var132.field2867 = var129;
                    var132.field2812 = var133.field3659;
                    var132.field2875 = var133.field3660;
                    var132.field2811 = var133.field3658 * 100 / var130;
                    method5068(var132);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2378 == arg0.field1487) {
                method482(false, var3);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2304 == arg0.field1487) {
                int var135 = arg0.field1482;
                class326 var136 = new class326();
                var136.field3947 = var3.method3205();
                var136.field3948 = var3.method3254();
                var136.field3949 = new int[var136.field3947];
                var136.field3950 = new int[var136.field3947];
                var136.field3951 = new Field[var136.field3947];
                var136.field3952 = new int[var136.field3947];
                var136.field3953 = new Method[var136.field3947];
                var136.field3954 = new byte[var136.field3947][][];
                for (int var137 = 0; var137 < var136.field3947; var137++) {
                    try {
                        int var138 = var3.method3205();
                        if (var138 == 0 || var138 == 1 || var138 == 2) {
                            String var139 = var3.method3284();
                            String var140 = var3.method3284();
                            int var141 = 0;
                            if (var138 == 1) {
                                var141 = var3.method3254();
                            }
                            var136.field3949[var137] = var138;
                            var136.field3952[var137] = var141;
                            if (class327.method5019(var139).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var136.field3951[var137] = class327.method5019(var139).getDeclaredField(var140);
                        } else if (var138 == 3 || var138 == 4) {
                            String var142 = var3.method3284();
                            String var143 = var3.method3284();
                            int var144 = var3.method3205();
                            String[] var145 = new String[var144];
                            for (int var146 = 0; var146 < var144; var146++) {
                                var145[var146] = var3.method3284();
                            }
                            String var147 = var3.method3284();
                            byte[][] var148 = new byte[var144][];
                            if (var138 == 3) {
                                for (int var149 = 0; var149 < var144; var149++) {
                                    int var150 = var3.method3254();
                                    var148[var149] = new byte[var150];
                                    var3.method3217(var148[var149], 0, var150);
                                }
                            }
                            var136.field3949[var137] = var138;
                            Class[] var151 = new Class[var144];
                            for (int var152 = 0; var152 < var144; var152++) {
                                var151[var152] = class327.method5019(var145[var152]);
                            }
                            Class var153 = class327.method5019(var147);
                            if (class327.method5019(var142).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var154 = class327.method5019(var142).getDeclaredMethods();
                            Method[] var155 = var154;
                            for (int var156 = 0; var156 < var155.length; var156++) {
                                Method var157 = var155[var156];
                                if (var157.getName().equals(var143)) {
                                    Class[] var158 = var157.getParameterTypes();
                                    if (var151.length == var158.length) {
                                        boolean var159 = true;
                                        for (int var160 = 0; var160 < var151.length; var160++) {
                                            if (var151[var160] != var158[var160]) {
                                                var159 = false;
                                                break;
                                            }
                                        }
                                        if (var159 && var153 == var157.getReturnType()) {
                                            var136.field3953[var137] = var157;
                                        }
                                    }
                                }
                            }
                            var136.field3954[var137] = var148;
                        }
                    } catch (ClassNotFoundException var301) {
                        var136.field3950[var137] = -1;
                    } catch (SecurityException var302) {
                        var136.field3950[var137] = -2;
                    } catch (NullPointerException var303) {
                        var136.field3950[var137] = -3;
                    } catch (Exception var304) {
                        var136.field3950[var137] = -4;
                    } catch (Throwable var305) {
                        var136.field3950[var137] = -5;
                    }
                }
                class327.field3955.method3652(var136);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2333 == arg0.field1487) {
                String var166 = var3.method3284();
                int var167 = var3.method3254();
                class243 var168 = class243.method577(var167);
                if (!var166.equals(var168.field2883)) {
                    var168.field2883 = var166;
                    method5068(var168);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2375 == arg0.field1487) {
                for (int var169 = 0; var169 < class238.field2779.length; var169++) {
                    if (class238.field2779[var169] != class238.field2778[var169]) {
                        class238.field2779[var169] = class238.field2778[var169];
                        method131(var169);
                        field985[++field1055 - 1 & 0x1F] = var169;
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2335 == arg0.field1487) {
                var3.field2575 += 28;
                if (var3.method3228()) {
                    method4145(var3, var3.field2575 - 28);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2318 == arg0.field1487) {
                method756(class184.field2499);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2324 == arg0.field1487) {
                method756(class184.field2496);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2364 == arg0.field1487) {
                int var170 = var3.method3242();
                field1016 = var170;
                this.method1207(false);
                method39(var170);
                class82.method158(field1016);
                for (int var171 = 0; var171 < 100; var171++) {
                    field1073[var171] = true;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2330 == arg0.field1487) {
                Statics.field3552 = var3.method3234();
                Statics.field795 = var3.method3205();
                for (int var172 = Statics.field795; var172 < Statics.field795 + 8; var172++) {
                    for (int var173 = Statics.field3552; var173 < Statics.field3552 + 8; var173++) {
                        if (field915[Statics.field270][var172][var173] != null) {
                            field915[Statics.field270][var172][var173] = null;
                            method142(var172, var173);
                        }
                    }
                }
                for (class75 var174 = (class75) field999.method3707(); var174 != null; var174 = (class75) field999.method3697()) {
                    if (var174.field1144 >= Statics.field795 && var174.field1144 < Statics.field795 + 8 && var174.field1146 >= Statics.field3552 && var174.field1146 < Statics.field3552 + 8 && Statics.field270 == var174.field1155) {
                        var174.field1154 = 0;
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2368 == arg0.field1487) {
                boolean var175 = var3.method3212();
                if (!var175) {
                    Statics.field26 = null;
                } else if (Statics.field26 == null) {
                    Statics.field26 = new class266();
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2362 == arg0.field1487) {
                method756(class184.field2502);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2382 == arg0.field1487) {
                Statics.field580 = class321.method2(var3.method3205());
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2334 == arg0.field1487) {
                int var176 = var3.method3242();
                int var177 = var3.method3242();
                int var178 = var3.method3251();
                int var179 = var3.method3242();
                class243 var180 = class243.method577(var178);
                if (var180.field2812 != var176 || var180.field2875 != var179 || var180.field2811 != var177) {
                    var180.field2812 = var176;
                    var180.field2875 = var179;
                    var180.field2811 = var177;
                    method5068(var180);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2337 == arg0.field1487) {
                Statics.field426.method1589(var3, arg0.field1482);
                field1061 = field1066;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2347 == arg0.field1487) {
                method482(true, var3);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2374 == arg0.field1487) {
                method756(class184.field2490);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2307 == arg0.field1487) {
                int var181 = var3.method3207();
                int var182 = var3.method3251();
                int var183 = var181 >> 10 & 0x1F;
                int var184 = var181 >> 5 & 0x1F;
                int var185 = var181 & 0x1F;
                int var186 = (var185 << 3) + (var183 << 19) + (var184 << 11);
                class243 var187 = class243.method577(var182);
                if (var187.field2848 != var186) {
                    var187.field2848 = var186;
                    method5068(var187);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2331 == arg0.field1487) {
                boolean var188 = var3.method3205() == 1;
                if (var188) {
                    Statics.field835 = class197.method1005() - var3.method3211();
                    Statics.field656 = new class14(var3, true);
                } else {
                    Statics.field656 = null;
                }
                field1064 = field1066;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2340 == arg0.field1487) {
                String var189 = var3.method3284();
                long var190 = (long) var3.method3207();
                long var192 = (long) var3.method3233();
                class257[] var194 = new class257[] { class257.field3346, class257.field3345, class257.field3347, class257.field3350, class257.field3351, class257.field3348 };
                class257 var195 = (class257) class190.method4146(var194, var3.method3205());
                long var196 = (var190 << 32) + var192;
                boolean var198 = false;
                for (int var199 = 0; var199 < 100; var199++) {
                    if (field1078[var199] == var196) {
                        var198 = true;
                        break;
                    }
                }
                if (Statics.field426.method1593(new class306(var189, Statics.field2519))) {
                    var198 = true;
                }
                if (!var198 && field899 == 0) {
                    field1078[field1088] = var196;
                    field1088 = (field1088 + 1) % 100;
                    String var200 = class313.method5087(class319.method5003(class314.method2826(var3)));
                    byte var201;
                    if (var195.field3352) {
                        var201 = 7;
                    } else {
                        var201 = 3;
                    }
                    if (var195.field3349 == -1) {
                        class96.method752(var201, var189, var200);
                    } else {
                        int var203 = var195.field3349;
                        String var204 = "<img=" + var203 + ">";
                        class96.method752(var201, var204 + var189, var200);
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2325 == arg0.field1487) {
                int var205 = var3.method3242();
                int var206 = var3.method3251();
                class243 var207 = class243.method577(var206);
                if (var207.field2866 != 1 || var207.field2867 != var205) {
                    var207.field2866 = 1;
                    var207.field2867 = var205;
                    method5068(var207);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2342 == arg0.field1487) {
                field890 = var3.method3205();
                if (field890 == 1) {
                    field1037 = var3.method3207();
                }
                if (field890 >= 2 && field890 <= 6) {
                    if (field890 == 2) {
                        field896 = 64;
                        field897 = 64;
                    }
                    if (field890 == 3) {
                        field896 = 0;
                        field897 = 64;
                    }
                    if (field890 == 4) {
                        field896 = 128;
                        field897 = 64;
                    }
                    if (field890 == 5) {
                        field896 = 64;
                        field897 = 0;
                    }
                    if (field890 == 6) {
                        field896 = 64;
                        field897 = 128;
                    }
                    field890 = 2;
                    field1033 = var3.method3207();
                    field1014 = var3.method3207();
                    field1010 = var3.method3205();
                }
                if (field890 == 10) {
                    field892 = var3.method3207();
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2301 == arg0.field1487) {
                if (field1016 != -1) {
                    method1856(field1016, 0);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2348 == arg0.field1487) {
                int var208 = var3.method3243();
                class66 var209 = (class66) class66.field772.method3637((long) var208);
                if (var209 != null) {
                    var209.method3681();
                }
                field1056[++field1057 - 1 & 0x1F] = var208 & 0x7FFF;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2352 == arg0.field1487) {
                String var210 = var3.method3284();
                String var211 = class313.method5087(class319.method5003(class314.method2826(var3)));
                class96.method752(6, var210, var211);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2377 == arg0.field1487) {
                int var212 = var3.method3219();
                boolean var213 = var3.method3205() == 1;
                String var214 = "";
                boolean var215 = false;
                if (var213) {
                    var214 = var3.method3284();
                    if (Statics.field426.method1593(new class306(var214, Statics.field2519))) {
                        var215 = true;
                    }
                }
                String var216 = var3.method3284();
                if (!var215) {
                    class96.method752(var212, var214, var216);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2322 == arg0.field1487) {
                Statics.field426.field1255.method4906(var3, arg0.field1482);
                method3434();
                field1061 = field1066;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2346 == arg0.field1487) {
                field1112 = true;
                Statics.field3698 = var3.method3205();
                Statics.field249 = var3.method3205();
                Statics.field2218 = var3.method3207();
                Statics.field303 = var3.method3205();
                Statics.field231 = var3.method3205();
                if (Statics.field231 >= 100) {
                    int var217 = Statics.field3698 * 128 + 64;
                    int var218 = Statics.field249 * 128 + 64;
                    int var219 = method4325(var217, var218, Statics.field270) - Statics.field2218;
                    int var220 = var217 - Statics.field864;
                    int var221 = var219 - Statics.field2122;
                    int var222 = var218 - Statics.field343;
                    int var223 = (int) Math.sqrt((double) (var220 * var220 + var222 * var222));
                    Statics.field318 = (int) (Math.atan2((double) var221, (double) var223) * 325.949D) & 0x7FF;
                    Statics.field418 = (int) (Math.atan2((double) var220, (double) var222) * -325.949D) & 0x7FF;
                    if (Statics.field318 < 128) {
                        Statics.field318 = 128;
                    }
                    if (Statics.field318 > 383) {
                        Statics.field318 = 383;
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2316 == arg0.field1487) {
                for (int var224 = 0; var224 < Statics.field3778; var224++) {
                    class269 var225 = class269.method2870(var224);
                    if (var225 != null) {
                        class238.field2778[var224] = 0;
                        class238.field2779[var224] = 0;
                    }
                }
                method4138();
                field1055 += 32;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2320 == arg0.field1487) {
                String var226 = var3.method3284();
                long var227 = var3.method3211();
                long var229 = (long) var3.method3207();
                long var231 = (long) var3.method3233();
                class257[] var233 = new class257[] { class257.field3346, class257.field3345, class257.field3347, class257.field3350, class257.field3351, class257.field3348 };
                class257 var234 = (class257) class190.method4146(var233, var3.method3205());
                long var235 = (var229 << 32) + var231;
                boolean var237 = false;
                for (int var238 = 0; var238 < 100; var238++) {
                    if (field1078[var238] == var235) {
                        var237 = true;
                        break;
                    }
                }
                if (var234.field3353 && Statics.field426.method1593(new class306(var226, Statics.field2519))) {
                    var237 = true;
                }
                if (!var237 && field899 == 0) {
                    field1078[field1088] = var235;
                    field1088 = (field1088 + 1) % 100;
                    String var239 = class313.method5087(class319.method5003(class314.method2826(var3)));
                    if (var234.field3349 == -1) {
                        class96.method157(9, var226, var239, class317.method4140(var227));
                    } else {
                        int var240 = var234.field3349;
                        String var241 = "<img=" + var240 + ">";
                        class96.method157(9, var241 + var226, var239, class317.method4140(var227));
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2310 == arg0.field1487) {
                int var242 = var3.method3205();
                int var243 = var3.method3205();
                int var244 = var3.method3205();
                int var245 = var3.method3205();
                field956[var242] = true;
                field943[var242] = var243;
                field1007[var242] = var244;
                field940[var242] = var245;
                field1117[var242] = 0;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2363 == arg0.field1487) {
                int var246 = var3.method3254();
                int var247 = var3.method3207();
                if (var246 < -70000) {
                    var247 += 32768;
                }
                class243 var248;
                if (var246 >= 0) {
                    var248 = class243.method577(var246);
                } else {
                    var248 = null;
                }
                while (var3.field2575 < arg0.field1482) {
                    int var249 = var3.method3219();
                    int var250 = var3.method3207();
                    int var251 = 0;
                    if (var250 != 0) {
                        var251 = var3.method3205();
                        if (var251 == 255) {
                            var251 = var3.method3254();
                        }
                    }
                    if (var248 != null && var249 >= 0 && var249 < var248.field2903.length) {
                        var248.field2903[var249] = var250;
                        var248.field2942[var249] = var251;
                    }
                    class66.method1525(var247, var249, var250 - 1, var251);
                }
                if (var248 != null) {
                    method5068(var248);
                }
                method4138();
                field1056[++field1057 - 1 & 0x1F] = var247 & 0x7FFF;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2305 == arg0.field1487) {
                method756(class184.field2498);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2358 == arg0.field1487) {
                field1112 = true;
                Statics.field756 = var3.method3205();
                Statics.field498 = var3.method3205();
                Statics.field2052 = var3.method3207();
                Statics.field417 = var3.method3205();
                Statics.field3332 = var3.method3205();
                if (Statics.field3332 >= 100) {
                    Statics.field864 = Statics.field756 * 128 + 64;
                    Statics.field343 = Statics.field498 * 128 + 64;
                    Statics.field2122 = method4325(Statics.field864, Statics.field343, Statics.field270) - Statics.field2052;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2354 == arg0.field1487) {
                int var252 = var3.method3207();
                int var253 = var3.method3205();
                int var254 = var3.method3207();
                if (field1076 != 0 && var253 != 0 && field1106 < 50) {
                    field1104[field1106] = var252;
                    field1030[field1106] = var253;
                    field1109[field1106] = var254;
                    field1111[field1106] = null;
                    field1110[field1106] = 0;
                    field1106++;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2381 == arg0.field1487) {
                int var258 = arg0.field1482 + var3.field2575;
                int var259 = var3.method3207();
                int var260 = var3.method3207();
                if (field1016 != var259) {
                    field1016 = var259;
                    this.method1207(false);
                    method39(field1016);
                    class82.method158(field1016);
                    for (int var261 = 0; var261 < 100; var261++) {
                        field1073[var261] = true;
                    }
                }
                while (var260-- > 0) {
                    int var262 = var3.method3254();
                    int var263 = var3.method3207();
                    int var264 = var3.method3205();
                    class68 var265 = (class68) field1031.method3637((long) var262);
                    if (var265 != null && var265.field790 != var263) {
                        method757(var265, true);
                        var265 = null;
                    }
                    if (var265 == null) {
                        var265 = method4152(var262, var263, var264);
                    }
                    var265.field794 = true;
                }
                for (class68 var266 = (class68) field1031.method3641(); var266 != null; var266 = (class68) field1031.method3640()) {
                    if (var266.field794) {
                        var266.field794 = false;
                    } else {
                        method757(var266, true);
                    }
                }
                field1070 = new class215(512);
                while (var3.field2575 < var258) {
                    int var267 = var3.method3254();
                    int var268 = var3.method3207();
                    int var269 = var3.method3207();
                    int var270 = var3.method3254();
                    for (int var271 = var268; var271 <= var269; var271++) {
                        long var272 = ((long) var267 << 32) + (long) var271;
                        field1070.method3638(new class224(var270), var272);
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2329 == arg0.field1487) {
                method756(class184.field2493);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2357 == arg0.field1487) {
                int var274 = var3.method3254();
                int var275 = var3.method3254();
                int var276 = 0;
                if (Statics.field3403 == null || !Statics.field3403.isValid()) {
                    try {
                        Iterator var277 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var277.hasNext()) {
                            GarbageCollectorMXBean var278 = (GarbageCollectorMXBean) var277.next();
                            if (var278.isValid()) {
                                Statics.field3403 = var278;
                                field698 = -1L;
                                field692 = -1L;
                            }
                        }
                    } catch (Throwable var300) {
                    }
                }
                if (Statics.field3403 != null) {
                    long var280 = class197.method1005();
                    long var282 = Statics.field3403.getCollectionTime();
                    if (field692 != -1L) {
                        long var284 = var282 - field692;
                        long var286 = var280 - field698;
                        if (var286 != 0L) {
                            var276 = (int) (var284 * 100L / var286);
                        }
                    }
                    field692 = var282;
                    field698 = var280;
                }
                class185 var290 = class185.method267(class182.field2412, field958.field1485);
                var290.field2505.method3189(field699);
                var290.field2505.method3247(var274);
                var290.field2505.method3405(var275);
                var290.field2505.method3231(var276);
                field958.method1882(var290);
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2350 == arg0.field1487) {
                field1137 = var3.method3205();
                if (field1137 == 255) {
                    field1137 = 0;
                }
                field1099 = var3.method3205();
                if (field1099 == 255) {
                    field1099 = 0;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2302 == arg0.field1487) {
                Statics.field426.method1588();
                field1061 = field1066;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2326 == arg0.field1487) {
                method4350();
                arg0.field1487 = null;
                return false;
            }
            if (class181.field2353 == arg0.field1487) {
                method4138();
                field1036 = var3.method3346();
                field1065 = field1066;
                arg0.field1487 = null;
                return true;
            }
            if (class181.field2300 == arg0.field1487) {
                method4138();
                int var291 = var3.method3250();
                int var292 = var3.method3226();
                int var293 = var3.method3324();
                field1002[var292] = var291;
                field1006[var292] = var293;
                field1003[var292] = 1;
                for (int var294 = 0; var294 < 98; var294++) {
                    if (var291 >= class249.field3013[var294]) {
                        field1003[var292] = var294 + 2;
                    }
                }
                field1058[++field1053 - 1 & 0x1F] = var292;
                arg0.field1487 = null;
                return true;
            }
            class165.method1744("" + (arg0.field1487 == null ? -1 : arg0.field1487.field2309) + class87.field1330 + (arg0.field1493 == null ? -1 : arg0.field1493.field2309) + class87.field1330 + (arg0.field1494 == null ? -1 : arg0.field1494.field2309) + class87.field1330 + arg0.field1482, (Throwable) null);
            method4350();
        } catch (IOException var306) {
            if (field916 > 0) {
                method4350();
            } else {
                field919.method4823();
                method1003(40);
                Statics.field2070 = field958.method1870();
                field958.method1873();
            }
        } catch (Exception var307) {
            String var297 = "" + (arg0.field1487 == null ? -1 : arg0.field1487.field2309) + class87.field1330 + (arg0.field1493 == null ? -1 : arg0.field1493.field2309) + class87.field1330 + (arg0.field1494 == null ? -1 : arg0.field1494.field2309) + class87.field1330 + arg0.field1482 + class87.field1330 + (Statics.field2048 + Statics.field642.field1213[0]) + class87.field1330 + (Statics.field360 + Statics.field642.field1214[0]) + class87.field1330;
            for (int var298 = 0; var298 < arg0.field1482 && var298 < 50; var298++) {
                var297 = var297 + var3.field2574[var298] + class87.field1330;
            }
            class165.method1744(var297, var307);
            method4350();
        }
        return true;
    }

    @ObfuscatedName("bs.ge(Lgj;I)V")
    public static final void method756(class184 arg0) {
        class202 var1 = field958.field1492;
        if (class184.field2493 == arg0) {
            int var2 = var1.method3205();
            int var3 = (var2 >> 4 & 0x7) + Statics.field795;
            int var4 = (var2 & 0x7) + Statics.field3552;
            int var5 = var1.method3234();
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = field930[var6];
            int var9 = var1.method3241();
            if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) {
                if (var8 == 0) {
                    class141 var10 = Statics.field3341.method2647(Statics.field270, var3, var4);
                    if (var10 != null) {
                        int var11 = var10.field2060 >> 14 & 0x7FFF;
                        if (var6 == 2) {
                            var10.field2056 = new class98(var11, 2, var7 + 4, Statics.field270, var3, var4, var9, false, var10.field2056);
                            var10.field2061 = new class98(var11, 2, var7 + 1 & 0x3, Statics.field270, var3, var4, var9, false, var10.field2061);
                        } else {
                            var10.field2056 = new class98(var11, var6, var7, Statics.field270, var3, var4, var9, false, var10.field2056);
                        }
                    }
                }
                if (var8 == 1) {
                    class146 var12 = Statics.field3341.method2701(Statics.field270, var3, var4);
                    if (var12 != null) {
                        int var13 = var12.field2104 >> 14 & 0x7FFF;
                        if (var6 == 4 || var6 == 5) {
                            var12.field2102 = new class98(var13, 4, var7, Statics.field270, var3, var4, var9, false, var12.field2102);
                        } else if (var6 == 6) {
                            var12.field2102 = new class98(var13, 4, var7 + 4, Statics.field270, var3, var4, var9, false, var12.field2102);
                        } else if (var6 == 7) {
                            var12.field2102 = new class98(var13, 4, (var7 + 2 & 0x3) + 4, Statics.field270, var3, var4, var9, false, var12.field2102);
                        } else if (var6 == 8) {
                            var12.field2102 = new class98(var13, 4, var7 + 4, Statics.field270, var3, var4, var9, false, var12.field2102);
                            var12.field2103 = new class98(var13, 4, (var7 + 2 & 0x3) + 4, Statics.field270, var3, var4, var9, false, var12.field2103);
                        }
                    }
                }
                if (var8 == 2) {
                    class147 var14 = Statics.field3341.method2649(Statics.field270, var3, var4);
                    if (var6 == 11) {
                        var6 = 10;
                    }
                    if (var14 != null) {
                        var14.field2112 = new class98(var14.field2123 >> 14 & 0x7FFF, var6, var7, Statics.field270, var3, var4, var9, false, var14.field2112);
                    }
                }
                if (var8 == 3) {
                    class128 var15 = Statics.field3341.method2650(Statics.field270, var3, var4);
                    if (var15 != null) {
                        var15.field1795 = new class98(var15.field1797 >> 14 & 0x7FFF, 22, var7, Statics.field270, var3, var4, var9, false, var15.field1795);
                    }
                }
            }
        } else if (class184.field2492 == arg0) {
            int var16 = var1.method3234() * 4;
            byte var17 = var1.method3413();
            int var18 = var1.method3243();
            int var19 = var1.method3205();
            int var20 = var1.method3241();
            int var21 = var1.method3207();
            int var22 = var1.method3244();
            int var23 = var1.method3205();
            int var24 = var1.method3234() * 4;
            byte var25 = var1.method3210();
            int var26 = var1.method3205();
            int var27 = (var26 >> 4 & 0x7) + Statics.field795;
            int var28 = (var26 & 0x7) + Statics.field3552;
            int var29 = var17 + var27;
            int var30 = var25 + var28;
            if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104 && var20 != 65535) {
                int var31 = var27 * 128 + 64;
                int var32 = var28 * 128 + 64;
                int var33 = var29 * 128 + 64;
                int var34 = var30 * 128 + 64;
                class92 var35 = new class92(var20, Statics.field270, var31, var32, method4325(var31, var32, Statics.field270) - var16, field929 + var21, field929 + var18, var19, var23, var22, var24);
                var35.method1776(var33, var34, method4325(var33, var34, Statics.field270) - var24, field929 + var21);
                field1000.method3690(var35);
            }
        } else {
            if (class184.field2502 == arg0) {
                int var36 = var1.method3241();
                int var37 = var1.method3241();
                byte var38 = var1.method3210();
                int var39 = var1.method3205();
                int var40 = (var39 >> 4 & 0x7) + Statics.field795;
                int var41 = (var39 & 0x7) + Statics.field3552;
                int var42 = var1.method3207();
                byte var43 = var1.method3322();
                byte var44 = var1.method3236();
                byte var45 = var1.method3413();
                int var46 = var1.method3241();
                int var47 = var1.method3234();
                int var48 = var47 >> 2;
                int var49 = var47 & 0x3;
                int var50 = field930[var48];
                class73 var51;
                if (field987 == var42) {
                    var51 = Statics.field642;
                } else {
                    var51 = field986[var42];
                }
                if (var51 != null) {
                    class283 var52 = class283.method713(var46);
                    int var53;
                    int var54;
                    if (var49 == 1 || var49 == 3) {
                        var53 = var52.field3607;
                        var54 = var52.field3595;
                    } else {
                        var53 = var52.field3595;
                        var54 = var52.field3607;
                    }
                    int var55 = (var53 >> 1) + var40;
                    int var56 = (var53 + 1 >> 1) + var40;
                    int var57 = (var54 >> 1) + var41;
                    int var58 = (var54 + 1 >> 1) + var41;
                    int[][] var59 = class63.field745[Statics.field270];
                    int var60 = var59[var55][var57] + var59[var56][var57] + var59[var55][var58] + var59[var56][var58] >> 2;
                    int var61 = (var40 << 7) + (var53 << 6);
                    int var62 = (var41 << 7) + (var54 << 6);
                    class132 var63 = var52.method4613(var48, var49, var59, var61, var60, var62);
                    if (var63 != null) {
                        method4299(Statics.field270, var40, var41, var50, -1, 0, 0, var37 + 1, var36 + 1);
                        var51.field847 = field929 + var37;
                        var51.field845 = field929 + var36;
                        var51.field849 = var63;
                        var51.field846 = var40 * 128 + var53 * 64;
                        var51.field844 = var41 * 128 + var54 * 64;
                        var51.field859 = var60;
                        if (var38 > var44) {
                            byte var64 = var38;
                            var38 = var44;
                            var44 = var64;
                        }
                        if (var45 > var43) {
                            byte var65 = var45;
                            var45 = var43;
                            var43 = var65;
                        }
                        var51.field850 = var38 + var40;
                        var51.field852 = var40 + var44;
                        var51.field851 = var41 + var45;
                        var51.field853 = var41 + var43;
                    }
                }
            }
            if (class184.field2490 == arg0) {
                int var66 = var1.method3324();
                int var67 = (var66 >> 4 & 0x7) + Statics.field795;
                int var68 = (var66 & 0x7) + Statics.field3552;
                int var69 = var1.method3324();
                int var70 = var69 >> 2;
                int var71 = var69 & 0x3;
                int var72 = field930[var70];
                if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                    method4299(Statics.field270, var67, var68, var72, -1, var70, var71, 0, -1);
                }
            } else if (class184.field2491 == arg0) {
                int var73 = var1.method3243();
                int var74 = var1.method3205();
                int var75 = (var74 >> 4 & 0x7) + Statics.field795;
                int var76 = (var74 & 0x7) + Statics.field3552;
                int var77 = var1.method3243();
                int var78 = var1.method3242();
                if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
                    class218 var79 = field915[Statics.field270][var75][var76];
                    if (var79 != null) {
                        for (class93 var80 = (class93) var79.method3707(); var80 != null; var80 = (class93) var79.method3697()) {
                            if ((var78 & 0x7FFF) == var80.field1427 && var80.field1424 == var77) {
                                var80.field1424 = var73;
                                break;
                            }
                        }
                        method142(var75, var76);
                    }
                }
            } else if (class184.field2498 == arg0) {
                int var81 = var1.method3226();
                int var82 = (var81 >> 4 & 0x7) + Statics.field795;
                int var83 = (var81 & 0x7) + Statics.field3552;
                int var84 = var1.method3241();
                int var85 = var1.method3324();
                int var86 = var1.method3242();
                if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
                    int var87 = var82 * 128 + 64;
                    int var88 = var83 * 128 + 64;
                    class83 var89 = new class83(var86, Statics.field270, var87, var88, method4325(var87, var88, Statics.field270) - var85, var84, field929);
                    field1001.method3690(var89);
                }
            } else {
                if (class184.field2496 == arg0) {
                    int var90 = var1.method3234();
                    int var91 = (var90 >> 4 & 0x7) + Statics.field795;
                    int var92 = (var90 & 0x7) + Statics.field3552;
                    int var93 = var1.method3324();
                    int var94 = var93 >> 4 & 0xF;
                    int var95 = var93 & 0x7;
                    int var96 = var1.method3205();
                    int var97 = var1.method3242();
                    if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                        int var98 = var94 + 1;
                        if (Statics.field642.field1213[0] >= var91 - var98 && Statics.field642.field1213[0] <= var91 + var98 && Statics.field642.field1214[0] >= var92 - var98 && Statics.field642.field1214[0] <= var92 + var98 && field952 != 0 && var95 > 0 && field1106 < 50) {
                            field1104[field1106] = var97;
                            field1030[field1106] = var95;
                            field1109[field1106] = var96;
                            field1111[field1106] = null;
                            field1110[field1106] = (var91 << 16) + (var92 << 8) + var94;
                            field1106++;
                        }
                    }
                }
                if (class184.field2495 == arg0) {
                    int var99 = var1.method3324();
                    int var100 = (var99 >> 4 & 0x7) + Statics.field795;
                    int var101 = (var99 & 0x7) + Statics.field3552;
                    int var102 = var1.method3241();
                    int var103 = var1.method3243();
                    if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                        class93 var104 = new class93();
                        var104.field1427 = var102;
                        var104.field1424 = var103;
                        if (field915[Statics.field270][var100][var101] == null) {
                            field915[Statics.field270][var100][var101] = new class218();
                        }
                        field915[Statics.field270][var100][var101].method3690(var104);
                        method142(var100, var101);
                    }
                } else if (class184.field2499 == arg0) {
                    int var105 = var1.method3205();
                    int var106 = (var105 >> 4 & 0x7) + Statics.field795;
                    int var107 = (var105 & 0x7) + Statics.field3552;
                    int var108 = var1.method3241();
                    int var109 = var1.method3234();
                    int var110 = var109 >> 2;
                    int var111 = var109 & 0x3;
                    int var112 = field930[var110];
                    if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                        method4299(Statics.field270, var106, var107, var112, var108, var110, var111, 0, -1);
                    }
                } else if (class184.field2494 == arg0) {
                    int var113 = var1.method3205();
                    int var114 = (var113 >> 4 & 0x7) + Statics.field795;
                    int var115 = (var113 & 0x7) + Statics.field3552;
                    int var116 = var1.method3207();
                    if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                        class218 var117 = field915[Statics.field270][var114][var115];
                        if (var117 != null) {
                            for (class93 var118 = (class93) var117.method3707(); var118 != null; var118 = (class93) var117.method3697()) {
                                if ((var116 & 0x7FFF) == var118.field1427) {
                                    var118.method3681();
                                    break;
                                }
                            }
                            if (var117.method3707() == null) {
                                field915[Statics.field270][var114][var115] = null;
                            }
                            method142(var114, var115);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ju.gg(IIIIIIIIII)V")
    public static final void method4299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class75 var9 = null;
        for (class75 var10 = (class75) field999.method3707(); var10 != null; var10 = (class75) field999.method3697()) {
            if (var10.field1155 == arg0 && var10.field1144 == arg1 && var10.field1146 == arg2 && var10.field1149 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class75();
            var9.field1155 = arg0;
            var9.field1149 = arg3;
            var9.field1144 = arg1;
            var9.field1146 = arg2;
            method1134(var9);
            field999.method3690(var9);
        }
        var9.field1150 = arg4;
        var9.field1152 = arg5;
        var9.field1151 = arg6;
        var9.field1153 = arg7;
        var9.field1154 = arg8;
    }

    @ObfuscatedName("bw.gw(Lbb;I)V")
    public static final void method1134(class75 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1149 == 0) {
            var1 = Statics.field3341.method2651(arg0.field1155, arg0.field1144, arg0.field1146);
        }
        if (arg0.field1149 == 1) {
            var1 = Statics.field3341.method2652(arg0.field1155, arg0.field1144, arg0.field1146);
        }
        if (arg0.field1149 == 2) {
            var1 = Statics.field3341.method2661(arg0.field1155, arg0.field1144, arg0.field1146);
        }
        if (arg0.field1149 == 3) {
            var1 = Statics.field3341.method2637(arg0.field1155, arg0.field1144, arg0.field1146);
        }
        if (var1 != 0) {
            int var5 = Statics.field3341.method2764(arg0.field1155, arg0.field1144, arg0.field1146, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1147 = var2;
        arg0.field1148 = var3;
        arg0.field1145 = var4;
    }

    @ObfuscatedName("fi.gi(IIIIIIIB)V")
    public static final void method3001(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field875 && Statics.field270 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field3341.method2651(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3341.method2652(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3341.method2661(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3341.method2637(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field3341.method2764(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3341.method2642(arg0, arg2, arg3);
                class283 var15 = class283.method713(var12);
                if (var15.field3608 != 0) {
                    field893[arg0].method3105(arg2, arg3, var13, var14, var15.field3609);
                }
            }
            if (arg1 == 1) {
                Statics.field3341.method2712(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3341.method2808(arg0, arg2, arg3);
                class283 var16 = class283.method713(var12);
                if (var16.field3595 + arg2 > 103 || var16.field3595 + arg3 > 103 || var16.field3607 + arg2 > 103 || var16.field3607 + arg3 > 103) {
                    return;
                }
                if (var16.field3608 != 0) {
                    field893[arg0].method3084(arg2, arg3, var16.field3595, var16.field3607, var14, var16.field3609);
                }
            }
            if (arg1 == 3) {
                Statics.field3341.method2624(arg0, arg2, arg3);
                class283 var17 = class283.method713(var12);
                if (var17.field3608 == 1) {
                    field893[arg0].method3092(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class63.field740[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class63.method4143(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field3341, field893[arg0]);
    }

    @ObfuscatedName("r.gd(III)V")
    public static final void method142(int arg0, int arg1) {
        class218 var2 = field915[Statics.field270][arg0][arg1];
        if (var2 == null) {
            Statics.field3341.method2646(Statics.field270, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class93 var5 = null;
        for (class93 var6 = (class93) var2.method3707(); var6 != null; var6 = (class93) var2.method3697()) {
            class284 var7 = class284.method660(var6.field1427);
            long var8 = (long) var7.field3665;
            if (var7.field3664 == 1) {
                var8 = (long) (var6.field1424 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3341.method2646(Statics.field270, arg0, arg1);
            return;
        }
        var2.method3691(var5);
        class93 var10 = null;
        class93 var11 = null;
        for (class93 var12 = (class93) var2.method3707(); var12 != null; var12 = (class93) var2.method3697()) {
            if (var5.field1427 != var12.field1427) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1427 != var12.field1427 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field3341.method2632(Statics.field270, arg0, arg1, method4325(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field270), var5, var13, var10, var11);
    }

    @ObfuscatedName("ai.hu(ZLgs;B)V")
    public static final void method482(boolean arg0, class202 arg1) {
        field991 = 0;
        field1038 = 0;
        class202 var2 = field958.field1492;
        var2.method3463();
        int var3 = var2.method3477(8);
        if (var3 < field1131) {
            for (int var4 = var3; var4 < field1131; var4++) {
                field1028[++field991 - 1] = field966[var4];
            }
        }
        if (var3 > field1131) {
            throw new RuntimeException("");
        }
        field1131 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field966[var5];
            class85 var7 = field910[var6];
            int var8 = var2.method3477(1);
            if (var8 == 0) {
                field966[++field1131 - 1] = var6;
                var7.field1193 = field929;
            } else {
                int var9 = var2.method3477(2);
                if (var9 == 0) {
                    field966[++field1131 - 1] = var6;
                    var7.field1193 = field929;
                    field891[++field1038 - 1] = var6;
                } else if (var9 == 1) {
                    field966[++field1131 - 1] = var6;
                    var7.field1193 = field929;
                    int var10 = var2.method3477(3);
                    var7.method1724(var10, (byte) 1);
                    int var11 = var2.method3477(1);
                    if (var11 == 1) {
                        field891[++field1038 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field966[++field1131 - 1] = var6;
                    var7.field1193 = field929;
                    int var12 = var2.method3477(3);
                    var7.method1724(var12, (byte) 2);
                    int var13 = var2.method3477(3);
                    var7.method1724(var13, (byte) 2);
                    int var14 = var2.method3477(1);
                    if (var14 == 1) {
                        field891[++field1038 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field1028[++field991 - 1] = var6;
                }
            }
        }
        method261(arg0, arg1);
        method2842(arg1);
        for (int var15 = 0; var15 < field991; var15++) {
            int var16 = field1028[var15];
            if (field929 != field910[var16].field1193) {
                field910[var16].field1317 = null;
                field910[var16] = null;
            }
        }
        if (field958.field1482 != arg1.field2575) {
            throw new RuntimeException(arg1.field2575 + class87.field1330 + field958.field1482);
        }
        for (int var17 = 0; var17 < field1131; var17++) {
            if (field910[field966[var17]] == null) {
                throw new RuntimeException(var17 + class87.field1330 + field1131);
            }
        }
    }

    @ObfuscatedName("ag.ha(ZLgs;B)V")
    public static final void method261(boolean arg0, class202 arg1) {
        while (true) {
            if (arg1.method3466(field958.field1482) >= 27) {
                int var2 = arg1.method3477(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field910[var2] == null) {
                        field910[var2] = new class85();
                        var3 = true;
                    }
                    class85 var4 = field910[var2];
                    field966[++field1131 - 1] = var2;
                    var4.field1193 = field929;
                    int var5 = arg1.method3477(1);
                    if (var5 == 1) {
                        field891[++field1038 - 1] = var2;
                    }
                    int var6;
                    if (arg0) {
                        var6 = arg1.method3477(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = arg1.method3477(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7 = field996[arg1.method3477(3)];
                    if (var3) {
                        var4.field1209 = var4.field1161 = var7;
                    }
                    var4.field1317 = class286.method3973(arg1.method3477(14));
                    int var8;
                    if (arg0) {
                        var8 = arg1.method3477(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = arg1.method3477(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    int var9 = arg1.method3477(1);
                    var4.field1173 = var4.field1317.field3721;
                    var4.field1206 = var4.field1317.field3734;
                    if (var4.field1206 == 0) {
                        var4.field1161 = 0;
                    }
                    var4.field1166 = var4.field1317.field3733;
                    var4.field1210 = var4.field1317.field3737;
                    var4.field1168 = var4.field1317.field3718;
                    var4.field1178 = var4.field1317.field3707;
                    var4.field1202 = var4.field1317.field3713;
                    var4.field1164 = var4.field1317.field3717;
                    var4.field1165 = var4.field1317.field3715;
                    var4.method1725(Statics.field642.field1213[0] + var6, Statics.field642.field1214[0] + var8, var9 == 1);
                    continue;
                }
            }
            arg1.method3465();
            return;
        }
    }

    @ObfuscatedName("eq.hz(Lgs;I)V")
    public static final void method2842(class202 arg0) {
        for (int var1 = 0; var1 < field1038; var1++) {
            int var2 = field891[var1];
            class85 var3 = field910[var2];
            int var4 = arg0.method3205();
            if ((var4 & 0x4) != 0) {
                int var5 = arg0.method3207();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = arg0.method3234();
                if (var3.field1190 == var5 && var5 != -1) {
                    int var7 = class288.method1535(var5).field3761;
                    if (var7 == 1) {
                        var3.field1191 = 0;
                        var3.field1216 = 0;
                        var3.field1192 = var6;
                        var3.field1194 = 0;
                    }
                    if (var7 == 2) {
                        var3.field1194 = 0;
                    }
                } else if (var5 == -1 || var3.field1190 == -1 || class288.method1535(var5).field3768 >= class288.method1535(var3.field1190).field3768) {
                    var3.field1190 = var5;
                    var3.field1191 = 0;
                    var3.field1216 = 0;
                    var3.field1192 = var6;
                    var3.field1194 = 0;
                    var3.field1217 = var3.field1212;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1317 = class286.method3973(arg0.method3207());
                var3.field1173 = var3.field1317.field3721;
                var3.field1206 = var3.field1317.field3734;
                var3.field1166 = var3.field1317.field3733;
                var3.field1210 = var3.field1317.field3737;
                var3.field1168 = var3.field1317.field3718;
                var3.field1178 = var3.field1317.field3707;
                var3.field1202 = var3.field1317.field3713;
                var3.field1164 = var3.field1317.field3717;
                var3.field1165 = var3.field1317.field3715;
            }
            if ((var4 & 0x2) != 0) {
                int var8 = arg0.method3207();
                int var9 = arg0.method3242();
                int var10 = var3.field1211 - (var8 - Statics.field2048 - Statics.field2048) * 64;
                int var11 = var3.field1188 - (var9 - Statics.field360 - Statics.field360) * 64;
                if (var10 != 0 || var11 != 0) {
                    var3.field1186 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field1207 = arg0.method3243();
                if (var3.field1207 == 65535) {
                    var3.field1207 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var12 = arg0.method3226();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = -1;
                        int var17 = arg0.method3219();
                        if (var17 == 32767) {
                            var17 = arg0.method3219();
                            var15 = arg0.method3219();
                            var14 = arg0.method3219();
                            var16 = arg0.method3219();
                        } else if (var17 == 32766) {
                            var17 = -1;
                        } else {
                            var15 = arg0.method3219();
                        }
                        int var18 = arg0.method3219();
                        var3.method1514(var17, var15, var14, var16, field929, var18);
                    }
                }
                int var19 = arg0.method3226();
                if (var19 > 0) {
                    for (int var20 = 0; var20 < var19; var20++) {
                        int var21 = arg0.method3219();
                        int var22 = arg0.method3219();
                        if (var22 == 32767) {
                            var3.method1516(var21);
                        } else {
                            int var23 = arg0.method3219();
                            int var24 = arg0.method3234();
                            int var25 = var22 > 0 ? arg0.method3234() : var24;
                            var3.method1515(var21, field929, var22, var23, var24, var25);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field1195 = arg0.method3243();
                int var26 = arg0.method3250();
                var3.field1199 = var26 >> 16;
                var3.field1198 = (var26 & 0xFFFF) + field929;
                var3.field1196 = 0;
                var3.field1197 = 0;
                if (var3.field1198 > field929) {
                    var3.field1196 = -1;
                }
                if (var3.field1195 == 65535) {
                    var3.field1195 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field1171 = arg0.method3284();
                var3.field1174 = 100;
            }
        }
    }

    @ObfuscatedName("h.hg(Lbz;IIBB)V")
    public static final void method10(class73 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1213[0];
        int var5 = arg0.field1214[0];
        int var6 = arg0.method1080();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = class178.method3043(var4, var5, arg0.method1080(), method515(arg1, arg2), field893[arg0.field857], true, field1035, field1132);
        if (var7 >= 1) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method1073(field1035[var8], field1132[var8], arg3);
            }
        }
    }

    @ObfuscatedName("am.hd(IIB)Lfr;")
    public static class179 method515(int arg0, int arg1) {
        field902.field2297 = arg0;
        field902.field2294 = arg1;
        field902.field2295 = 1;
        field902.field2296 = 1;
        return field902;
    }

    @ObfuscatedName("e.hi(I)V")
    public static void method187() {
        field1004 = 0;
        field1069 = false;
        field1059[0] = class252.field3187;
        field1013[0] = "";
        field1108[0] = 1006;
        field1087[0] = false;
        field1004 = 1;
    }

    @ObfuscatedName("ci.hh(III)V")
    public static final void method1745(int arg0, int arg1) {
        if (field1004 < 2 && field1023 == 0 && !field895 || !field1018) {
            return;
        }
        int var2 = field1004 - 1;
        String var4;
        if (field1023 == 1 && field1004 < 2) {
            var4 = class252.field3175 + class252.field3185 + field1024 + " " + class87.field1334;
        } else if (field895 && field1004 < 2) {
            var4 = field1093 + class252.field3185 + field1029 + " " + class87.field1334;
        } else {
            String var5;
            if (var2 < 0) {
                var5 = "";
            } else if (field1013[var2].length() > 0) {
                var5 = field1059[var2] + class252.field3185 + field1013[var2];
            } else {
                var5 = field1059[var2];
            }
            var4 = var5;
        }
        if (field1004 > 2) {
            var4 = var4 + class87.method585(16777215) + " " + '/' + " " + (field1004 - 2) + class252.field3179;
        }
        Statics.field830.method5141(var4, arg0 + 4, arg1 + 15, 16777215, 0, field929 / 1000);
    }

    @ObfuscatedName("gu.hm(B)V")
    public static final void method3429() {
        int var0 = Statics.field657;
        int var1 = Statics.field755;
        int var2 = Statics.field2976;
        int var3 = Statics.field1456;
        int var4 = 6116423;
        class328.method5295(var0, var1, var2, var3, var4);
        class328.method5295(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class328.method5302(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field830.method5088(class252.field3269, var0 + 3, var1 + 14, var4, -1);
        int var5 = class61.field717;
        int var6 = class61.field715;
        for (int var7 = 0; var7 < field1004; var7++) {
            int var8 = (field1004 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class312 var10 = Statics.field830;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field1013[var7].length() > 0) {
                var11 = field1059[var7] + class252.field3185 + field1013[var7];
            } else {
                var11 = field1059[var7];
            }
            var10.method5088(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field657;
        int var13 = Statics.field755;
        int var14 = Statics.field2976;
        int var15 = Statics.field1456;
        for (int var16 = 0; var16 < field927; var16++) {
            if (field1071[var16] + field1042[var16] > var12 && field1042[var16] < var12 + var14 && field1079[var16] + field1077[var16] > var13 && field1077[var16] < var13 + var15) {
                field1074[var16] = true;
            }
        }
    }

    @ObfuscatedName("aq.hj(IIIII)V")
    public static final void method373(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field927; var4++) {
            if (field1071[var4] + field1042[var4] > arg0 && field1042[var4] < arg0 + arg2 && field1079[var4] + field1077[var4] > arg1 && field1077[var4] < arg1 + arg3) {
                field1073[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hr(I)V")
    public final void method1307() {
        method1020();
        if (Statics.field2138 != null || field1041 != null) {
            return;
        }
        int var12;
        int var15;
        int var16;
        label193: {
            int var1 = class61.field730;
            if (field1069) {
                if (var1 != 1 && (Statics.field590 || var1 != 4)) {
                    int var2 = class61.field717;
                    int var3 = class61.field715;
                    if (var2 < Statics.field657 - 10 || var2 > Statics.field657 + Statics.field2976 + 10 || var3 < Statics.field755 - 10 || var3 > Statics.field755 + Statics.field1456 + 10) {
                        field1069 = false;
                        method373(Statics.field657, Statics.field755, Statics.field2976, Statics.field1456);
                    }
                }
                if (var1 == 1 || !Statics.field590 && var1 == 4) {
                    int var4 = Statics.field657;
                    int var5 = Statics.field755;
                    int var6 = Statics.field2976;
                    int var7 = class61.field731;
                    int var8 = class61.field732;
                    int var9 = -1;
                    for (int var10 = 0; var10 < field1004; var10++) {
                        int var11 = (field1004 - 1 - var10) * 15 + var5 + 31;
                        if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                            var9 = var10;
                        }
                    }
                    if (var9 != -1) {
                        method3120(var9);
                    }
                    field1069 = false;
                    method373(Statics.field657, Statics.field755, Statics.field2976, Statics.field1456);
                }
            } else {
                var12 = field1004 - 1;
                if ((var1 == 1 || !Statics.field590 && var1 == 4) && var12 >= 0) {
                    int var14 = field1108[var12];
                    if (var14 == 39 || var14 == 40 || var14 == 41 || var14 == 42 || var14 == 43 || var14 == 33 || var14 == 34 || var14 == 35 || var14 == 36 || var14 == 37 || var14 == 38 || var14 == 1005) {
                        var15 = field1008[var12];
                        var16 = field914[var12];
                        class243 var17 = class243.method577(var16);
                        int var18 = method2446(var17);
                        boolean var19 = (var18 >> 28 & 0x1) != 0;
                        if (var19) {
                            break label193;
                        }
                        int var20 = method2446(var17);
                        boolean var21 = (var20 >> 29 & 0x1) != 0;
                        if (var21) {
                            break label193;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field590 && var1 == 4) && this.method1150()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field590 && var1 == 4) && field1004 > 0) {
                    method3120(var12);
                }
                if (var1 == 2 && field1004 > 0) {
                    this.method1151(class61.field731, class61.field732);
                }
            }
            return;
        }
        if (Statics.field2138 != null && !field1052 && field1004 > 0 && !this.method1150()) {
            int var22 = field979;
            int var23 = field913;
            class88 var24 = Statics.field1422;
            method3488(var24.field1339, var24.field1340, var24.field1341, var24.field1342, var24.field1343, var24.field1343, var22, var23);
            Statics.field1422 = null;
        }
        field1052 = false;
        field983 = 0;
        if (Statics.field2138 != null) {
            method5068(Statics.field2138);
        }
        Statics.field2138 = class243.method577(var16);
        field978 = var15;
        field979 = class61.field731;
        field913 = class61.field732;
        if (var12 >= 0) {
            Statics.method173(var12);
        }
        method5068(Statics.field2138);
    }

    @ObfuscatedName("client.ht(B)Z")
    public final boolean method1150() {
        int var1 = field1004 - 1;
        boolean var3 = field1005 == 1 && field1004 > 2;
        if (!var3) {
            boolean var4;
            if (var1 < 0) {
                var4 = false;
            } else {
                int var5 = field1108[var1];
                if (var5 >= 2000) {
                    var5 -= 2000;
                }
                if (var5 == 1007) {
                    var4 = true;
                } else {
                    var4 = false;
                }
            }
            var3 = var4;
        }
        return var3 && !field1087[var1];
    }

    @ObfuscatedName("client.hp(III)V")
    public final void method1151(int arg0, int arg1) {
        int var3 = Statics.field830.method5144(class252.field3269);
        for (int var4 = 0; var4 < field1004; var4++) {
            class312 var5 = Statics.field830;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field1013[var4].length() > 0) {
                var6 = field1059[var4] + class252.field3185 + field1013[var4];
            } else {
                var6 = field1059[var4];
            }
            int var7 = var5.method5144(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field1004 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field472) {
            var9 = Statics.field472 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field3509) {
            var10 = Statics.field3509 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field3341.method2662(Statics.field270, arg0, arg1, false);
        field1069 = true;
        Statics.field657 = var9;
        Statics.field755 = var10;
        Statics.field2976 = var3;
        Statics.field1456 = field1004 * 15 + 22;
    }

    @ObfuscatedName("fr.hs(IB)V")
    public static final void method3120(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field1008[arg0];
        int var2 = field914[arg0];
        int var3 = field1108[arg0];
        int var4 = field950[arg0];
        String var5 = field1059[arg0];
        String var6 = field1013[arg0];
        method3488(var1, var2, var3, var4, var5, var6, class61.field731, class61.field732);
    }

    @ObfuscatedName("gs.hl(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method3488(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 29) {
            class185 var8 = class185.method267(class182.field2461, field958.field1485);
            var8.field2505.method3405(arg1);
            field958.method1882(var8);
            class243 var9 = class243.method577(arg1);
            if (var9.field2953 != null && var9.field2953[0][0] == 5) {
                int var10 = var9.field2953[0][1];
                if (class238.field2779[var10] != var9.field2937[0]) {
                    class238.field2779[var10] = var9.field2937[0];
                    method131(var10);
                }
            }
        }
        if (arg2 == 41) {
            class185 var11 = class185.method267(class182.field2440, field958.field1485);
            var11.field2505.method3238(arg3);
            var11.field2505.method3247(arg1);
            var11.field2505.method3216(arg0);
            field958.method1882(var11);
            field976 = 0;
            Statics.field18 = class243.method577(arg1);
            field977 = arg0;
        }
        if (arg2 == 13) {
            class85 var12 = field910[arg3];
            if (var12 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var13 = class185.method267(class182.field2455, field958.field1485);
                var13.field2505.method3216(arg3);
                var13.field2505.method3230(class52.field625[82] ? 1 : 0);
                field958.method1882(var13);
            }
        }
        if (arg2 == 1) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            field1137 = arg0;
            field1099 = arg1;
            class185 var14 = class185.method267(class182.field2394, field958.field1485);
            var14.field2505.method3238(Statics.field17);
            var14.field2505.method3216(arg3 >> 14 & 0x7FFF);
            var14.field2505.method3216(Statics.field2129);
            var14.field2505.method3239(Statics.field2048 + arg0);
            var14.field2505.method3247(Statics.field252);
            var14.field2505.method3229(class52.field625[82] ? 1 : 0);
            var14.field2505.method3216(Statics.field360 + arg1);
            field958.method1882(var14);
        }
        if (arg2 == 50) {
            class73 var15 = field986[arg3];
            if (var15 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var16 = class185.method267(class182.field2392, field958.field1485);
                var16.field2505.method3190(arg3);
                var16.field2505.method3230(class52.field625[82] ? 1 : 0);
                field958.method1882(var16);
            }
        }
        if (arg2 == 2) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            field1137 = arg0;
            field1099 = arg1;
            class185 var17 = class185.method267(class182.field2462, field958.field1485);
            var17.field2505.method3229(class52.field625[82] ? 1 : 0);
            var17.field2505.method3249(Statics.field2769);
            var17.field2505.method3216(field1026);
            var17.field2505.method3190(Statics.field360 + arg1);
            var17.field2505.method3216(arg3 >> 14 & 0x7FFF);
            var17.field2505.method3216(Statics.field2048 + arg0);
            field958.method1882(var17);
        }
        if (arg2 == 51) {
            class73 var18 = field986[arg3];
            if (var18 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var19 = class185.method267(class182.field2388, field958.field1485);
                var19.field2505.method3239(arg3);
                var19.field2505.method3229(class52.field625[82] ? 1 : 0);
                field958.method1882(var19);
            }
        }
        if (arg2 == 20) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            field1137 = arg0;
            field1099 = arg1;
            class185 var20 = class185.method267(class182.field2400, field958.field1485);
            var20.field2505.method3238(Statics.field2048 + arg0);
            var20.field2505.method3216(arg3);
            var20.field2505.method3239(Statics.field360 + arg1);
            var20.field2505.method3229(class52.field625[82] ? 1 : 0);
            field958.method1882(var20);
        }
        if (arg2 == 31) {
            class185 var21 = class185.method267(class182.field2445, field958.field1485);
            var21.field2505.method3247(Statics.field252);
            var21.field2505.method3249(arg1);
            var21.field2505.method3238(Statics.field17);
            var21.field2505.method3216(Statics.field2129);
            var21.field2505.method3239(arg3);
            var21.field2505.method3216(arg0);
            field958.method1882(var21);
            field976 = 0;
            Statics.field18 = class243.method577(arg1);
            field977 = arg0;
        }
        if (arg2 == 38) {
            method2907();
            class243 var22 = class243.method577(arg1);
            field1023 = 1;
            Statics.field2129 = arg0;
            Statics.field252 = arg1;
            Statics.field17 = arg3;
            method5068(var22);
            field1024 = class87.method585(16748608) + class284.method660(arg3).field3674 + class87.method585(16777215);
            if (field1024 == null) {
                field1024 = class252.field3032;
            }
            return;
        }
        if (arg2 == 10) {
            class85 var23 = field910[arg3];
            if (var23 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var24 = class185.method267(class182.field2475, field958.field1485);
                var24.field2505.method3216(arg3);
                var24.field2505.method3229(class52.field625[82] ? 1 : 0);
                field958.method1882(var24);
            }
        }
        if (arg2 == 44) {
            class73 var25 = field986[arg3];
            if (var25 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var26 = class185.method267(class182.field2402, field958.field1485);
                var26.field2505.method3230(class52.field625[82] ? 1 : 0);
                var26.field2505.method3239(arg3);
                field958.method1882(var26);
            }
        }
        if (arg2 == 28) {
            class185 var27 = class185.method267(class182.field2461, field958.field1485);
            var27.field2505.method3405(arg1);
            field958.method1882(var27);
            class243 var28 = class243.method577(arg1);
            if (var28.field2953 != null && var28.field2953[0][0] == 5) {
                int var29 = var28.field2953[0][1];
                class238.field2779[var29] = 1 - class238.field2779[var29];
                method131(var29);
            }
        }
        if (arg2 == 1001) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            field1137 = arg0;
            field1099 = arg1;
            class185 var30 = class185.method267(class182.field2444, field958.field1485);
            var30.field2505.method3216(Statics.field360 + arg1);
            var30.field2505.method3216(arg3 >> 14 & 0x7FFF);
            var30.field2505.method3231(class52.field625[82] ? 1 : 0);
            var30.field2505.method3216(Statics.field2048 + arg0);
            field958.method1882(var30);
        }
        if (arg2 == 22) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            field1137 = arg0;
            field1099 = arg1;
            class185 var31 = class185.method267(class182.field2468, field958.field1485);
            var31.field2505.method3239(Statics.field360 + arg1);
            var31.field2505.method3190(arg3);
            var31.field2505.method3231(class52.field625[82] ? 1 : 0);
            var31.field2505.method3239(Statics.field2048 + arg0);
            field958.method1882(var31);
        }
        if (arg2 == 5) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            field1137 = arg0;
            field1099 = arg1;
            class185 var32 = class185.method267(class182.field2470, field958.field1485);
            var32.field2505.method3239(arg3 >> 14 & 0x7FFF);
            var32.field2505.method3230(class52.field625[82] ? 1 : 0);
            var32.field2505.method3239(Statics.field360 + arg1);
            var32.field2505.method3190(Statics.field2048 + arg0);
            field958.method1882(var32);
        }
        if (arg2 == 18) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            field1137 = arg0;
            field1099 = arg1;
            class185 var33 = class185.method267(class182.field2454, field958.field1485);
            var33.field2505.method3216(Statics.field360 + arg1);
            var33.field2505.method3238(Statics.field2048 + arg0);
            var33.field2505.method3229(class52.field625[82] ? 1 : 0);
            var33.field2505.method3238(arg3);
            field958.method1882(var33);
        }
        if (arg2 == 17) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            field1137 = arg0;
            field1099 = arg1;
            class185 var34 = class185.method267(class182.field2389, field958.field1485);
            var34.field2505.method3247(Statics.field2769);
            var34.field2505.method3190(Statics.field360 + arg1);
            var34.field2505.method3190(field1026);
            var34.field2505.method3229(class52.field625[82] ? 1 : 0);
            var34.field2505.method3238(Statics.field2048 + arg0);
            var34.field2505.method3239(arg3);
            field958.method1882(var34);
        }
        if (arg2 == 4) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            field1137 = arg0;
            field1099 = arg1;
            class185 var35 = class185.method267(class182.field2467, field958.field1485);
            var35.field2505.method3190(Statics.field2048 + arg0);
            var35.field2505.method3190(Statics.field360 + arg1);
            var35.field2505.method3229(class52.field625[82] ? 1 : 0);
            var35.field2505.method3216(arg3 >> 14 & 0x7FFF);
            field958.method1882(var35);
        }
        if (arg2 == 11) {
            class85 var36 = field910[arg3];
            if (var36 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var37 = class185.method267(class182.field2459, field958.field1485);
                var37.field2505.method3229(class52.field625[82] ? 1 : 0);
                var37.field2505.method3238(arg3);
                field958.method1882(var37);
            }
        }
        if (arg2 == 48) {
            class73 var38 = field986[arg3];
            if (var38 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var39 = class185.method267(class182.field2426, field958.field1485);
                var39.field2505.method3189(class52.field625[82] ? 1 : 0);
                var39.field2505.method3239(arg3);
                field958.method1882(var39);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class243 var40 = class243.method5065(arg1, arg0);
            if (var40 != null) {
                int var41 = var40.field2943;
                class243 var42 = class243.method5065(arg1, arg0);
                if (var42 != null) {
                    if (var42.field2874 != null) {
                        class69 var43 = new class69();
                        var43.field798 = var42;
                        var43.field802 = arg3;
                        var43.field797 = arg5;
                        var43.field808 = var42.field2874;
                        class82.method2061(var43);
                    }
                    boolean var44 = true;
                    if (var42.field2827 > 0) {
                        var44 = Statics.method3149(var42);
                    }
                    if (var44 && class244.method1853(method2446(var42), arg3 - 1)) {
                        if (arg3 == 1) {
                            class185 var45 = class185.method267(class182.field2469, field958.field1485);
                            var45.field2505.method3405(arg1);
                            var45.field2505.method3190(arg0);
                            var45.field2505.method3190(var41);
                            field958.method1882(var45);
                        }
                        if (arg3 == 2) {
                            class185 var46 = class185.method267(class182.field2422, field958.field1485);
                            var46.field2505.method3405(arg1);
                            var46.field2505.method3190(arg0);
                            var46.field2505.method3190(var41);
                            field958.method1882(var46);
                        }
                        if (arg3 == 3) {
                            class185 var47 = class185.method267(class182.field2418, field958.field1485);
                            var47.field2505.method3405(arg1);
                            var47.field2505.method3190(arg0);
                            var47.field2505.method3190(var41);
                            field958.method1882(var47);
                        }
                        if (arg3 == 4) {
                            class185 var48 = class185.method267(class182.field2446, field958.field1485);
                            var48.field2505.method3405(arg1);
                            var48.field2505.method3190(arg0);
                            var48.field2505.method3190(var41);
                            field958.method1882(var48);
                        }
                        if (arg3 == 5) {
                            class185 var49 = class185.method267(class182.field2423, field958.field1485);
                            var49.field2505.method3405(arg1);
                            var49.field2505.method3190(arg0);
                            var49.field2505.method3190(var41);
                            field958.method1882(var49);
                        }
                        if (arg3 == 6) {
                            class185 var50 = class185.method267(class182.field2479, field958.field1485);
                            var50.field2505.method3405(arg1);
                            var50.field2505.method3190(arg0);
                            var50.field2505.method3190(var41);
                            field958.method1882(var50);
                        }
                        if (arg3 == 7) {
                            class185 var51 = class185.method267(class182.field2431, field958.field1485);
                            var51.field2505.method3405(arg1);
                            var51.field2505.method3190(arg0);
                            var51.field2505.method3190(var41);
                            field958.method1882(var51);
                        }
                        if (arg3 == 8) {
                            class185 var52 = class185.method267(class182.field2480, field958.field1485);
                            var52.field2505.method3405(arg1);
                            var52.field2505.method3190(arg0);
                            var52.field2505.method3190(var41);
                            field958.method1882(var52);
                        }
                        if (arg3 == 9) {
                            class185 var53 = class185.method267(class182.field2404, field958.field1485);
                            var53.field2505.method3405(arg1);
                            var53.field2505.method3190(arg0);
                            var53.field2505.method3190(var41);
                            field958.method1882(var53);
                        }
                        if (arg3 == 10) {
                            class185 var54 = class185.method267(class182.field2430, field958.field1485);
                            var54.field2505.method3405(arg1);
                            var54.field2505.method3190(arg0);
                            var54.field2505.method3190(var41);
                            field958.method1882(var54);
                        }
                    }
                }
            }
        }
        if (arg2 == 12) {
            class85 var55 = field910[arg3];
            if (var55 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var56 = class185.method267(class182.field2474, field958.field1485);
                var56.field2505.method3231(class52.field625[82] ? 1 : 0);
                var56.field2505.method3190(arg3);
                field958.method1882(var56);
            }
        }
        if (arg2 == 47) {
            class73 var57 = field986[arg3];
            if (var57 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var58 = class185.method267(class182.field2432, field958.field1485);
                var58.field2505.method3189(class52.field625[82] ? 1 : 0);
                var58.field2505.method3190(arg3);
                field958.method1882(var58);
            }
        }
        if (arg2 == 45) {
            class73 var59 = field986[arg3];
            if (var59 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var60 = class185.method267(class182.field2425, field958.field1485);
                var60.field2505.method3190(arg3);
                var60.field2505.method3189(class52.field625[82] ? 1 : 0);
                field958.method1882(var60);
            }
        }
        if (arg2 == 39) {
            class185 var61 = class185.method267(class182.field2464, field958.field1485);
            var61.field2505.method3190(arg3);
            var61.field2505.method3247(arg1);
            var61.field2505.method3216(arg0);
            field958.method1882(var61);
            field976 = 0;
            Statics.field18 = class243.method577(arg1);
            field977 = arg0;
        }
        if (arg2 == 21) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            field1137 = arg0;
            field1099 = arg1;
            class185 var62 = class185.method267(class182.field2417, field958.field1485);
            var62.field2505.method3216(Statics.field2048 + arg0);
            var62.field2505.method3239(Statics.field360 + arg1);
            var62.field2505.method3190(arg3);
            var62.field2505.method3230(class52.field625[82] ? 1 : 0);
            field958.method1882(var62);
        }
        if (arg2 == 8) {
            class85 var63 = field910[arg3];
            if (var63 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var64 = class185.method267(class182.field2407, field958.field1485);
                var64.field2505.method3216(field1026);
                var64.field2505.method3231(class52.field625[82] ? 1 : 0);
                var64.field2505.method3238(arg3);
                var64.field2505.method3405(Statics.field2769);
                field958.method1882(var64);
            }
        }
        if (arg2 == 14) {
            class73 var65 = field986[arg3];
            if (var65 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var66 = class185.method267(class182.field2442, field958.field1485);
                var66.field2505.method3405(Statics.field252);
                var66.field2505.method3230(class52.field625[82] ? 1 : 0);
                var66.field2505.method3190(Statics.field17);
                var66.field2505.method3216(Statics.field2129);
                var66.field2505.method3239(arg3);
                field958.method1882(var66);
            }
        }
        if (arg2 == 46) {
            class73 var67 = field986[arg3];
            if (var67 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var68 = class185.method267(class182.field2408, field958.field1485);
                var68.field2505.method3229(class52.field625[82] ? 1 : 0);
                var68.field2505.method3216(arg3);
                field958.method1882(var68);
            }
        }
        if (arg2 == 1004) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            class185 var69 = class185.method267(class182.field2439, field958.field1485);
            var69.field2505.method3216(arg3);
            field958.method1882(var69);
        }
        if (arg2 == 15) {
            class73 var70 = field986[arg3];
            if (var70 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var71 = class185.method267(class182.field2443, field958.field1485);
                var71.field2505.method3189(class52.field625[82] ? 1 : 0);
                var71.field2505.method3216(field1026);
                var71.field2505.method3405(Statics.field2769);
                var71.field2505.method3239(arg3);
                field958.method1882(var71);
            }
        }
        if (arg2 == 16) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            field1137 = arg0;
            field1099 = arg1;
            class185 var72 = class185.method267(class182.field2420, field958.field1485);
            var72.field2505.method3189(class52.field625[82] ? 1 : 0);
            var72.field2505.method3216(Statics.field2048 + arg0);
            var72.field2505.method3239(arg3);
            var72.field2505.method3239(Statics.field2129);
            var72.field2505.method3190(Statics.field17);
            var72.field2505.method3247(Statics.field252);
            var72.field2505.method3216(Statics.field360 + arg1);
            field958.method1882(var72);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1244.method5671(arg2, arg3, new class239(arg0), new class239(arg1));
        }
        if (arg2 == 3) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            field1137 = arg0;
            field1099 = arg1;
            class185 var73 = class185.method267(class182.field2395, field958.field1485);
            var73.field2505.method3190(Statics.field360 + arg1);
            var73.field2505.method3238(Statics.field2048 + arg0);
            var73.field2505.method3231(class52.field625[82] ? 1 : 0);
            var73.field2505.method3190(arg3 >> 14 & 0x7FFF);
            field958.method1882(var73);
        }
        if (arg2 == 49) {
            class73 var74 = field986[arg3];
            if (var74 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var75 = class185.method267(class182.field2473, field958.field1485);
                var75.field2505.method3189(class52.field625[82] ? 1 : 0);
                var75.field2505.method3239(arg3);
                field958.method1882(var75);
            }
        }
        if (arg2 == 7) {
            class85 var76 = field910[arg3];
            if (var76 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var77 = class185.method267(class182.field2428, field958.field1485);
                var77.field2505.method3249(Statics.field252);
                var77.field2505.method3231(class52.field625[82] ? 1 : 0);
                var77.field2505.method3238(arg3);
                var77.field2505.method3238(Statics.field17);
                var77.field2505.method3190(Statics.field2129);
                field958.method1882(var77);
            }
        }
        if (arg2 == 35) {
            class185 var78 = class185.method267(class182.field2449, field958.field1485);
            var78.field2505.method3249(arg1);
            var78.field2505.method3238(arg0);
            var78.field2505.method3190(arg3);
            field958.method1882(var78);
            field976 = 0;
            Statics.field18 = class243.method577(arg1);
            field977 = arg0;
        }
        if (arg2 == 19) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            field1137 = arg0;
            field1099 = arg1;
            class185 var79 = class185.method267(class182.field2438, field958.field1485);
            var79.field2505.method3239(Statics.field2048 + arg0);
            var79.field2505.method3238(arg3);
            var79.field2505.method3190(Statics.field360 + arg1);
            var79.field2505.method3189(class52.field625[82] ? 1 : 0);
            field958.method1882(var79);
        }
        if (arg2 == 1003) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            class85 var80 = field910[arg3];
            if (var80 != null) {
                class286 var81 = var80.field1317;
                if (var81.field3723 != null) {
                    var81 = var81.method4755();
                }
                if (var81 != null) {
                    class185 var82 = class185.method267(class182.field2456, field958.field1485);
                    var82.field2505.method3238(var81.field3708);
                    field958.method1882(var82);
                }
            }
        }
        if (arg2 == 36) {
            class185 var83 = class185.method267(class182.field2384, field958.field1485);
            var83.field2505.method3239(arg3);
            var83.field2505.method3247(arg1);
            var83.field2505.method3190(arg0);
            field958.method1882(var83);
            field976 = 0;
            Statics.field18 = class243.method577(arg1);
            field977 = arg0;
        }
        if (arg2 == 30 && field1034 == null) {
            method87(arg1, arg0);
            field1034 = class243.method5065(arg1, arg0);
            method5068(field1034);
        }
        if (arg2 == 33) {
            class185 var84 = class185.method267(class182.field2419, field958.field1485);
            var84.field2505.method3249(arg1);
            var84.field2505.method3239(arg3);
            var84.field2505.method3190(arg0);
            field958.method1882(var84);
            field976 = 0;
            Statics.field18 = class243.method577(arg1);
            field977 = arg0;
        }
        if (arg2 == 42) {
            class185 var85 = class185.method267(class182.field2427, field958.field1485);
            var85.field2505.method3216(arg3);
            var85.field2505.method3216(arg0);
            var85.field2505.method3405(arg1);
            field958.method1882(var85);
            field976 = 0;
            Statics.field18 = class243.method577(arg1);
            field977 = arg0;
        }
        if (arg2 == 43) {
            class185 var86 = class185.method267(class182.field2450, field958.field1485);
            var86.field2505.method3249(arg1);
            var86.field2505.method3239(arg3);
            var86.field2505.method3216(arg0);
            field958.method1882(var86);
            field976 = 0;
            Statics.field18 = class243.method577(arg1);
            field977 = arg0;
        }
        if (arg2 == 1005) {
            class243 var87 = class243.method577(arg1);
            if (var87 == null || var87.field2942[arg0] < 100000) {
                class185 var88 = class185.method267(class182.field2439, field958.field1485);
                var88.field2505.method3216(arg3);
                field958.method1882(var88);
            } else {
                class96.method752(27, "", var87.field2942[arg0] + " x " + class284.method660(arg3).field3674);
            }
            field976 = 0;
            Statics.field18 = class243.method577(arg1);
            field977 = arg0;
        }
        if (arg2 == 1002) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            class185 var89 = class185.method267(class182.field2413, field958.field1485);
            var89.field2505.method3238(arg3 >> 14 & 0x7FFF);
            field958.method1882(var89);
        }
        if (arg2 == 25) {
            class243 var90 = class243.method5065(arg1, arg0);
            if (var90 != null) {
                method2907();
                method721(arg1, arg0, class244.method4137(method2446(var90)), var90.field2943);
                field1023 = 0;
                String var91;
                if (class244.method4137(method2446(var90)) == 0) {
                    var91 = null;
                } else if (var90.field2902 == null || var90.field2902.trim().length() == 0) {
                    var91 = null;
                } else {
                    var91 = var90.field2902;
                }
                field1093 = var91;
                if (field1093 == null) {
                    field1093 = "Null";
                }
                if (var90.field2822) {
                    field1029 = var90.field2847 + class87.method585(16777215);
                } else {
                    field1029 = class87.method585(65280) + var90.field2939 + class87.method585(16777215);
                }
            }
            return;
        }
        if (arg2 == 24) {
            class243 var92 = class243.method577(arg1);
            boolean var93 = true;
            if (var92.field2827 > 0) {
                var93 = Statics.method3149(var92);
            }
            if (var93) {
                class185 var94 = class185.method267(class182.field2461, field958.field1485);
                var94.field2505.method3405(arg1);
                field958.method1882(var94);
            }
        }
        if (arg2 == 26) {
            class185 var95 = class185.method267(class182.field2429, field958.field1485);
            field958.method1882(var95);
            for (class68 var96 = (class68) field1031.method3641(); var96 != null; var96 = (class68) field1031.method3640()) {
                if (var96.field789 == 0 || var96.field789 == 3) {
                    method757(var96, true);
                }
            }
            if (field1034 != null) {
                method5068(field1034);
                field1034 = null;
            }
        }
        if (arg2 == 6) {
            field926 = arg6;
            field972 = arg7;
            field974 = 2;
            field973 = 0;
            field1137 = arg0;
            field1099 = arg1;
            class185 var97 = class185.method267(class182.field2452, field958.field1485);
            var97.field2505.method3231(class52.field625[82] ? 1 : 0);
            var97.field2505.method3190(arg3 >> 14 & 0x7FFF);
            var97.field2505.method3216(Statics.field2048 + arg0);
            var97.field2505.method3238(Statics.field360 + arg1);
            field958.method1882(var97);
        }
        if (arg2 == 34) {
            class185 var98 = class185.method267(class182.field2441, field958.field1485);
            var98.field2505.method3238(arg0);
            var98.field2505.method3249(arg1);
            var98.field2505.method3239(arg3);
            field958.method1882(var98);
            field976 = 0;
            Statics.field18 = class243.method577(arg1);
            field977 = arg0;
        }
        if (arg2 == 32) {
            class185 var99 = class185.method267(class182.field2457, field958.field1485);
            var99.field2505.method3247(Statics.field2769);
            var99.field2505.method3247(arg1);
            var99.field2505.method3239(arg0);
            var99.field2505.method3238(field1026);
            var99.field2505.method3190(arg3);
            field958.method1882(var99);
            field976 = 0;
            Statics.field18 = class243.method577(arg1);
            field977 = arg0;
        }
        if (arg2 == 40) {
            class185 var100 = class185.method267(class182.field2447, field958.field1485);
            var100.field2505.method3247(arg1);
            var100.field2505.method3239(arg3);
            var100.field2505.method3216(arg0);
            field958.method1882(var100);
            field976 = 0;
            Statics.field18 = class243.method577(arg1);
            field977 = arg0;
        }
        if (arg2 == 37) {
            class185 var101 = class185.method267(class182.field2437, field958.field1485);
            var101.field2505.method3216(arg3);
            var101.field2505.method3249(arg1);
            var101.field2505.method3190(arg0);
            field958.method1882(var101);
            field976 = 0;
            Statics.field18 = class243.method577(arg1);
            field977 = arg0;
        }
        if (arg2 == 58) {
            class243 var102 = class243.method5065(arg1, arg0);
            if (var102 != null) {
                class185 var103 = class185.method267(class182.field2401, field958.field1485);
                var103.field2505.method3240(arg1);
                var103.field2505.method3249(Statics.field2769);
                var103.field2505.method3216(field894);
                var103.field2505.method3190(var102.field2943);
                var103.field2505.method3216(arg0);
                var103.field2505.method3238(field1026);
                field958.method1882(var103);
            }
        }
        if (arg2 == 9) {
            class85 var104 = field910[arg3];
            if (var104 != null) {
                field926 = arg6;
                field972 = arg7;
                field974 = 2;
                field973 = 0;
                field1137 = arg0;
                field1099 = arg1;
                class185 var105 = class185.method267(class182.field2421, field958.field1485);
                var105.field2505.method3231(class52.field625[82] ? 1 : 0);
                var105.field2505.method3238(arg3);
                field958.method1882(var105);
            }
        }
        if (arg2 == 23) {
            if (field1069) {
                Statics.field3341.method2770();
            } else {
                Statics.field3341.method2662(Statics.field270, arg0, arg1, true);
            }
        }
        if (field1023 != 0) {
            field1023 = 0;
            method5068(class243.method577(Statics.field252));
        }
        if (field895) {
            method2907();
        }
        if (Statics.field18 != null && field976 == 0) {
            method5068(Statics.field18);
        }
    }

    @ObfuscatedName("at.hc(ILjava/lang/String;B)V")
    public static void method266(int arg0, String arg1) {
        int var2 = class94.field1432;
        int[] var3 = class94.field1437;
        boolean var4 = false;
        class306 var5 = new class306(arg1, Statics.field2519);
        for (int var6 = 0; var6 < var2; var6++) {
            class73 var7 = field986[var3[var6]];
            if (var7 != null && Statics.field642 != var7 && var7.field842 != null && var7.field842.equals(var5)) {
                if (arg0 == 1) {
                    class185 var8 = class185.method267(class182.field2402, field958.field1485);
                    var8.field2505.method3230(0);
                    var8.field2505.method3239(var3[var6]);
                    field958.method1882(var8);
                } else if (arg0 == 4) {
                    class185 var9 = class185.method267(class182.field2432, field958.field1485);
                    var9.field2505.method3189(0);
                    var9.field2505.method3190(var3[var6]);
                    field958.method1882(var9);
                } else if (arg0 == 6) {
                    class185 var10 = class185.method267(class182.field2473, field958.field1485);
                    var10.field2505.method3189(0);
                    var10.field2505.method3239(var3[var6]);
                    field958.method1882(var10);
                } else if (arg0 == 7) {
                    class185 var11 = class185.method267(class182.field2392, field958.field1485);
                    var11.field2505.method3190(var3[var6]);
                    var11.field2505.method3230(0);
                    field958.method1882(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class96.method752(4, "", class252.field3174 + arg1);
        }
    }

    @ObfuscatedName("bf.he(IIIII)V")
    public static void method721(int arg0, int arg1, int arg2, int arg3) {
        class243 var4 = class243.method5065(arg0, arg1);
        if (var4 != null && var4.field2833 != null) {
            class69 var5 = new class69();
            var5.field798 = var4;
            var5.field808 = var4.field2833;
            class82.method2061(var5);
        }
        field894 = arg3;
        field895 = true;
        Statics.field2769 = arg0;
        field1026 = arg1;
        Statics.field1608 = arg2;
        method5068(var4);
    }

    @ObfuscatedName("eu.hv(I)V")
    public static void method2907() {
        if (!field895) {
            return;
        }
        class243 var0 = class243.method5065(Statics.field2769, field1026);
        if (var0 != null && var0.field2915 != null) {
            class69 var1 = new class69();
            var1.field798 = var0;
            var1.field808 = var0.field2915;
            class82.method2061(var1);
        }
        field895 = false;
        method5068(var0);
    }

    @ObfuscatedName("s.hy(III)V")
    public static void method87(int arg0, int arg1) {
        class185 var2 = class185.method267(class182.field2406, field958.field1485);
        var2.field2505.method3190(arg1);
        var2.field2505.method3247(arg0);
        field958.method1882(var2);
    }

    @ObfuscatedName("bt.hb(I)V")
    public static final void method1020() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field1004 - 1; var1++) {
                if (field1108[var1] < 1000 && field1108[var1 + 1] > 1000) {
                    String var2 = field1013[var1];
                    field1013[var1] = field1013[var1 + 1];
                    field1013[var1 + 1] = var2;
                    String var3 = field1059[var1];
                    field1059[var1] = field1059[var1 + 1];
                    field1059[var1 + 1] = var3;
                    int var4 = field1108[var1];
                    field1108[var1] = field1108[var1 + 1];
                    field1108[var1 + 1] = var4;
                    int var5 = field1008[var1];
                    field1008[var1] = field1008[var1 + 1];
                    field1008[var1 + 1] = var5;
                    int var6 = field914[var1];
                    field914[var1] = field914[var1 + 1];
                    field914[var1 + 1] = var6;
                    int var7 = field950[var1];
                    field950[var1] = field950[var1 + 1];
                    field950[var1 + 1] = var7;
                    boolean var8 = field1087[var1];
                    field1087[var1] = field1087[var1 + 1];
                    field1087[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("db.hk(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2372(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var12 = false;
        if (field1069 || field1004 >= 500) {
            return;
        }
        field1059[field1004] = arg0;
        field1013[field1004] = arg1;
        field1108[field1004] = arg2;
        field950[field1004] = arg3;
        field1008[field1004] = arg4;
        field914[field1004] = arg5;
        field1087[field1004] = var12;
        field1004++;
    }

    @ObfuscatedName("bo.hq(I)V")
    public static void method996() {
        for (int var0 = 0; var0 < field1004; var0++) {
            int var1 = field1108[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field1004 - 1) {
                    for (int var3 = var0; var3 < field1004 - 1; var3++) {
                        field1059[var3] = field1059[var3 + 1];
                        field1013[var3] = field1013[var3 + 1];
                        field1108[var3] = field1108[var3 + 1];
                        field950[var3] = field950[var3 + 1];
                        field1008[var3] = field1008[var3 + 1];
                        field914[var3] = field914[var3 + 1];
                        field1087[var3] = field1087[var3 + 1];
                    }
                }
                field1004--;
            }
        }
    }

    @ObfuscatedName("bl.hf(IIIIB)V")
    public static final void method720(int arg0, int arg1, int arg2, int arg3) {
        if (field1023 == 0 && !field895) {
            method2372(class252.field3155, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class133.field1928; var6++) {
            int var7 = class133.field1930[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field3341.method2764(Statics.field270, var8, var9, var7) >= 0) {
                    class283 var12 = class283.method713(var11);
                    if (var12.field3632 != null) {
                        var12 = var12.method4616();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field1023 == 1) {
                        method2372(class252.field3175, field1024 + " " + class87.field1334 + " " + class87.method585(65535) + var12.field3601, 1, var7, var8, var9);
                    } else if (!field895) {
                        String[] var13 = var12.field3603;
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
                                    method2372(var13[var14], class87.method585(65535) + var12.field3601, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2372(class252.field3176, class87.method585(65535) + var12.field3601, 1002, var12.field3590 << 14, var8, var9);
                    } else if ((Statics.field1608 & 0x4) == 4) {
                        method2372(field1093, field1029 + " " + class87.field1334 + " " + class87.method585(65535) + var12.field3601, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class85 var16 = field910[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field1317.field3721 == 1 && (var16.field1211 & 0x7F) == 64 && (var16.field1188 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field1131; var17++) {
                            class85 var18 = field910[field966[var17]];
                            if (var18 != null && var16 != var18 && var18.field1317.field3721 == 1 && var16.field1211 == var18.field1211 && var16.field1188 == var18.field1188) {
                                method698(var18.field1317, field966[var17], var8, var9);
                            }
                        }
                        int var19 = class94.field1432;
                        int[] var20 = class94.field1437;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class73 var22 = field986[var20[var21]];
                            if (var22 != null && var16.field1211 == var22.field1211 && var16.field1188 == var22.field1188) {
                                method2986(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method698(var16.field1317, var11, var8, var9);
                }
                if (var10 == 0) {
                    class73 var23 = field986[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field1211 & 0x7F) == 64 && (var23.field1188 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field1131; var24++) {
                            class85 var25 = field910[field966[var24]];
                            if (var25 != null && var25.field1317.field3721 == 1 && var23.field1211 == var25.field1211 && var23.field1188 == var25.field1188) {
                                method698(var25.field1317, field966[var24], var8, var9);
                            }
                        }
                        int var26 = class94.field1432;
                        int[] var27 = class94.field1437;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class73 var29 = field986[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field1211 == var29.field1211 && var23.field1188 == var29.field1188) {
                                method2986(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field1113 == var11) {
                        var4 = var7;
                    } else {
                        method2986(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class218 var30 = field915[Statics.field270][var8][var9];
                    if (var30 != null) {
                        for (class93 var31 = (class93) var30.method3708(); var31 != null; var31 = (class93) var30.method3698()) {
                            class284 var32 = class284.method660(var31.field1427);
                            if (field1023 == 1) {
                                method2372(class252.field3175, field1024 + " " + class87.field1334 + " " + class87.method585(16748608) + var32.field3674, 16, var31.field1427, var8, var9);
                            } else if (!field895) {
                                String[] var33 = var32.field3667;
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
                                        method2372(var33[var34], class87.method585(16748608) + var32.field3674, var35, var31.field1427, var8, var9);
                                    } else if (var34 == 2) {
                                        method2372(class252.field3025, class87.method585(16748608) + var32.field3674, 20, var31.field1427, var8, var9);
                                    }
                                }
                                method2372(class252.field3176, class87.method585(16748608) + var32.field3674, 1004, var31.field1427, var8, var9);
                            } else if ((Statics.field1608 & 0x1) == 1) {
                                method2372(field1093, field1029 + " " + class87.field1334 + " " + class87.method585(16748608) + var32.field3674, 17, var31.field1427, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class73 var38 = field986[field1113];
            method2986(var38, field1113, var36, var37);
        }
    }

    @ObfuscatedName("ay.hw(Ljr;IIIB)V")
    public static final void method698(class286 arg0, int arg1, int arg2, int arg3) {
        if (field1004 >= 400) {
            return;
        }
        if (arg0.field3723 != null) {
            arg0 = arg0.method4755();
        }
        if (arg0 == null || !arg0.field3725 || arg0.field3739 && field1049 != arg1) {
            return;
        }
        String var4 = arg0.field3709;
        if (arg0.field3726 != 0) {
            var4 = var4 + method1511(arg0.field3726, Statics.field642.field841) + " " + class87.field1329 + class252.field3211 + arg0.field3726 + class87.field1333;
        }
        if (arg0.field3739 && field1015) {
            method2372(class252.field3176, class87.method585(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1023 == 1) {
            method2372(class252.field3175, field1024 + " " + class87.field1334 + " " + class87.method585(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field895) {
            int var5 = arg0.field3739 && field1015 ? 2000 : 0;
            String[] var6 = arg0.field3724;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class252.field3039)) {
                        int var8 = 0;
                        if (var7 == 0) {
                            var8 = var5 + 9;
                        }
                        if (var7 == 1) {
                            var8 = var5 + 10;
                        }
                        if (var7 == 2) {
                            var8 = var5 + 11;
                        }
                        if (var7 == 3) {
                            var8 = var5 + 12;
                        }
                        if (var7 == 4) {
                            var8 = var5 + 13;
                        }
                        method2372(var6[var7], class87.method585(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class252.field3039)) {
                        short var10 = 0;
                        if (field1011 != class90.field1352) {
                            if (field1011 == class90.field1350 || field1011 == class90.field1351 && arg0.field3726 > Statics.field642.field841) {
                                var10 = 2000;
                            }
                            int var11 = 0;
                            if (var9 == 0) {
                                var11 = var10 + 9;
                            }
                            if (var9 == 1) {
                                var11 = var10 + 10;
                            }
                            if (var9 == 2) {
                                var11 = var10 + 11;
                            }
                            if (var9 == 3) {
                                var11 = var10 + 12;
                            }
                            if (var9 == 4) {
                                var11 = var10 + 13;
                            }
                            method2372(var6[var9], class87.method585(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3739 || !field1015) {
                method2372(class252.field3176, class87.method585(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1608 & 0x2) == 2) {
            method2372(field1093, field1029 + " " + class87.field1334 + " " + class87.method585(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("fe.hn(Lbz;IIII)V")
    public static final void method2986(class73 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field642 == arg0 || field1004 >= 400) {
            return;
        }
        String var4;
        if (arg0.field863 == 0) {
            var4 = arg0.field840[0] + arg0.field842 + arg0.field840[1] + method1511(arg0.field841, Statics.field642.field841) + " " + class87.field1329 + class252.field3211 + arg0.field841 + class87.field1333 + arg0.field840[2];
        } else {
            var4 = arg0.field840[0] + arg0.field842 + arg0.field840[1] + " " + class87.field1329 + class252.field3229 + arg0.field863 + class87.field1333 + arg0.field840[2];
        }
        if (field1023 == 1) {
            method2372(class252.field3175, field1024 + " " + class87.field1334 + " " + class87.method585(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field895) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field994[var5] != null) {
                    short var6 = 0;
                    if (field994[var5].equalsIgnoreCase(class252.field3039)) {
                        if (field998 == class90.field1352) {
                            continue;
                        }
                        if (field998 == class90.field1350 || field998 == class90.field1351 && arg0.field841 > Statics.field642.field841) {
                            var6 = 2000;
                        }
                        if (Statics.field642.field855 != 0 && arg0.field855 != 0) {
                            if (Statics.field642.field855 == arg0.field855) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field995[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field993[var5] + var6;
                    method2372(field994[var5], class87.method585(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1608 & 0x8) == 8) {
            method2372(field1093, field1029 + " " + class87.field1334 + " " + class87.method585(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field1004; var9++) {
            if (field1108[var9] == 23) {
                field1013[var9] = class87.method585(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("bb.ho(IIB)Ljava/lang/String;")
    public static final String method1511(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class87.method585(16711680);
        } else if (var2 < -6) {
            return class87.method585(16723968);
        } else if (var2 < -3) {
            return class87.method585(16740352);
        } else if (var2 < 0) {
            return class87.method585(16756736);
        } else if (var2 > 9) {
            return class87.method585(65280);
        } else if (var2 > 6) {
            return class87.method585(4259584);
        } else if (var2 > 3) {
            return class87.method585(8453888);
        } else if (var2 > 0) {
            return class87.method585(12648192);
        } else {
            return class87.method585(16776960);
        }
    }

    @ObfuscatedName("cw.hx(IIIIIIIII)V")
    public static final void method1737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class243.method3175(arg0)) {
            Statics.field786 = null;
            method714(Statics.field812[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field786 != null) {
                method714(Statics.field786, -1412584499, arg1, arg2, arg3, arg4, Statics.field1311, Statics.field301, arg7);
                Statics.field786 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1073[var8] = true;
            }
        } else {
            field1073[arg7] = true;
        }
    }

    @ObfuscatedName("bl.iw([Lin;IIIIIIIII)V")
    public static final void method714(class243[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class328.method5287(arg2, arg3, arg4, arg5);
        class135.method2586();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class243 var10 = arg0[var9];
            if (var10 != null && (var10.field2899 == arg1 || arg1 == -1412584499 && field1041 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1042[field927] = var10.field2823 + arg6;
                    field1077[field927] = var10.field2837 + arg7;
                    field1071[field927] = var10.field2838;
                    field1079[field927] = var10.field2919;
                    var11 = ++field927 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2954 = var11;
                var10.field2955 = field929;
                if (var10.field2822) {
                    boolean var12 = var10.field2843;
                    if (var12) {
                        continue;
                    }
                }
                if (var10.field2827 > 0) {
                    method1738(var10);
                }
                int var13 = var10.field2823 + arg6;
                int var14 = var10.field2837 + arg7;
                int var15 = var10.field2849;
                if (field1041 == var10) {
                    if (arg1 != -1412584499 && !var10.field2901) {
                        Statics.field786 = arg0;
                        Statics.field1311 = arg6;
                        Statics.field301 = arg7;
                        continue;
                    }
                    if (field1051 && field1054) {
                        int var16 = class61.field717;
                        int var17 = class61.field715;
                        int var18 = var16 - field1043;
                        int var19 = var17 - field1115;
                        if (var18 < field1009) {
                            var18 = field1009;
                        }
                        if (var10.field2838 + var18 > field1009 + field938.field2838) {
                            var18 = field1009 + field938.field2838 - var10.field2838;
                        }
                        if (var19 < field1048) {
                            var19 = field1048;
                        }
                        if (var10.field2919 + var19 > field1048 + field938.field2919) {
                            var19 = field1048 + field938.field2919 - var10.field2919;
                        }
                        var13 = var18;
                        var14 = var19;
                    }
                    if (!var10.field2901) {
                        var15 = 128;
                    }
                }
                int var20;
                int var21;
                int var22;
                int var23;
                if (var10.field2825 == 2) {
                    var20 = arg2;
                    var21 = arg3;
                    var22 = arg4;
                    var23 = arg5;
                } else if (var10.field2825 == 9) {
                    int var24 = var13;
                    int var25 = var14;
                    int var26 = var10.field2838 + var13;
                    int var27 = var10.field2919 + var14;
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
                    int var30 = var10.field2838 + var13;
                    int var31 = var10.field2919 + var14;
                    var20 = var13 > arg2 ? var13 : arg2;
                    var21 = var14 > arg3 ? var14 : arg3;
                    var22 = var30 < arg4 ? var30 : arg4;
                    var23 = var31 < arg5 ? var31 : arg5;
                }
                if (!var10.field2822 || var20 < var22 && var21 < var23) {
                    if (var10.field2827 != 0) {
                        if (var10.field2827 == 1336) {
                            if (field888) {
                                var14 += 15;
                                Statics.field338.method5090("Fps:" + field699, var10.field2838 + var13, var14, 16776960, -1);
                                var14 += 15;
                                Runtime var32 = Runtime.getRuntime();
                                int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                int var34 = 16776960;
                                if (var33 > 327680 && !field875) {
                                    var34 = 16711680;
                                }
                                Statics.field338.method5090("Mem:" + var33 + "k", var10.field2838 + var13, var14, var34, -1);
                                var14 += 15;
                            }
                            continue;
                        }
                        if (var10.field2827 == 1337) {
                            field992 = var13;
                            field1020 = var14;
                            method276(var13, var14, var10.field2838, var10.field2919);
                            field1073[var10.field2954] = true;
                            class328.method5287(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2827 == 1338) {
                            Statics.method35();
                            class237 var35 = var10.method4064(false);
                            if (var35 != null) {
                                class328.method5287(var13, var14, var35.field2774 + var13, var35.field2773 + var14);
                                if (field1100 == 2 || field1100 == 5) {
                                    class328.method5310(var13, var14, 0, var35.field2775, var35.field2772);
                                } else {
                                    int var36 = field1044 & 0x7FF;
                                    int var37 = Statics.field642.field1211 / 32 + 48;
                                    int var38 = 464 - Statics.field642.field1188 / 32;
                                    Statics.field240.method5436(var13, var14, var35.field2774, var35.field2773, var37, var38, var36, 256, var35.field2775, var35.field2772);
                                    for (int var39 = 0; var39 < field1094; var39++) {
                                        int var40 = field1095[var39] * 4 + 2 - Statics.field642.field1211 / 32;
                                        int var41 = field1096[var39] * 4 + 2 - Statics.field642.field1188 / 32;
                                        method510(var13, var14, var40, var41, field1118[var39], var35);
                                    }
                                    int var42 = 0;
                                    while (true) {
                                        if (var42 >= 104) {
                                            for (int var47 = 0; var47 < field1131; var47++) {
                                                class85 var48 = field910[field966[var47]];
                                                if (var48 != null && var48.method1084()) {
                                                    class286 var49 = var48.field1317;
                                                    if (var49 != null && var49.field3723 != null) {
                                                        var49 = var49.method4755();
                                                    }
                                                    if (var49 != null && var49.field3710 && var49.field3725) {
                                                        int var50 = var48.field1211 / 32 - Statics.field642.field1211 / 32;
                                                        int var51 = var48.field1188 / 32 - Statics.field642.field1188 / 32;
                                                        method510(var13, var14, var50, var51, Statics.field607[1], var35);
                                                    }
                                                }
                                            }
                                            int var52 = class94.field1432;
                                            int[] var53 = class94.field1437;
                                            for (int var54 = 0; var54 < var52; var54++) {
                                                class73 var55 = field986[var53[var54]];
                                                if (var55 != null && var55.method1084() && !var55.field856 && Statics.field642 != var55) {
                                                    int var56 = var55.field1211 / 32 - Statics.field642.field1211 / 32;
                                                    int var57 = var55.field1188 / 32 - Statics.field642.field1188 / 32;
                                                    boolean var58 = false;
                                                    if (Statics.field642.field855 != 0 && var55.field855 != 0 && Statics.field642.field855 == var55.field855) {
                                                        var58 = true;
                                                    }
                                                    if (var55.method1108()) {
                                                        method510(var13, var14, var56, var57, Statics.field607[3], var35);
                                                    } else if (var58) {
                                                        method510(var13, var14, var56, var57, Statics.field607[4], var35);
                                                    } else if (var55.method1090()) {
                                                        method510(var13, var14, var56, var57, Statics.field607[5], var35);
                                                    } else {
                                                        method510(var13, var14, var56, var57, Statics.field607[2], var35);
                                                    }
                                                }
                                            }
                                            if (field890 != 0 && field929 % 20 < 10) {
                                                if (field890 == 1 && field1037 >= 0 && field1037 < field910.length) {
                                                    class85 var59 = field910[field1037];
                                                    if (var59 != null) {
                                                        int var60 = var59.field1211 / 32 - Statics.field642.field1211 / 32;
                                                        int var61 = var59.field1188 / 32 - Statics.field642.field1188 / 32;
                                                        method2623(var13, var14, var60, var61, Statics.field331[1], var35);
                                                    }
                                                }
                                                if (field890 == 2) {
                                                    int var62 = field1033 * 4 - Statics.field2048 * 4 + 2 - Statics.field642.field1211 / 32;
                                                    int var63 = field1014 * 4 - Statics.field360 * 4 + 2 - Statics.field642.field1188 / 32;
                                                    method2623(var13, var14, var62, var63, Statics.field331[1], var35);
                                                }
                                                if (field890 == 10 && field892 >= 0 && field892 < field986.length) {
                                                    class73 var64 = field986[field892];
                                                    if (var64 != null) {
                                                        int var65 = var64.field1211 / 32 - Statics.field642.field1211 / 32;
                                                        int var66 = var64.field1188 / 32 - Statics.field642.field1188 / 32;
                                                        method2623(var13, var14, var65, var66, Statics.field331[1], var35);
                                                    }
                                                }
                                            }
                                            if (field1137 != 0) {
                                                int var67 = field1137 * 4 + 2 - Statics.field642.field1211 / 32;
                                                int var68 = field1099 * 4 + 2 - Statics.field642.field1188 / 32;
                                                method510(var13, var14, var67, var68, Statics.field331[0], var35);
                                            }
                                            if (!Statics.field642.field856) {
                                                class328.method5295(var35.field2774 / 2 + var13 - 1, var35.field2773 / 2 + var14 - 1, 3, 3, 16777215);
                                            }
                                            break;
                                        }
                                        for (int var43 = 0; var43 < 104; var43++) {
                                            class218 var44 = field915[Statics.field270][var42][var43];
                                            if (var44 != null) {
                                                int var45 = var42 * 4 + 2 - Statics.field642.field1211 / 32;
                                                int var46 = var43 * 4 + 2 - Statics.field642.field1188 / 32;
                                                method510(var13, var14, var45, var46, Statics.field607[0], var35);
                                            }
                                        }
                                        var42++;
                                    }
                                }
                                field1074[var11] = true;
                            }
                            class328.method5287(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2827 == 1339) {
                            method191(var10, var13, var14, var11);
                            class328.method5287(arg2, arg3, arg4, arg5);
                            continue;
                        }
                        if (var10.field2827 == 1400) {
                            Statics.field1244.method5692(var13, var14, var10.field2838, var10.field2919, field929);
                        }
                        if (var10.field2827 == 1401) {
                            Statics.field1244.method5613(var13, var14, var10.field2838, var10.field2919);
                        }
                    }
                    if (var10.field2825 == 0) {
                        if (!var10.field2822) {
                            boolean var69 = var10.field2843;
                            if (var69 && Statics.field260 != var10) {
                                continue;
                            }
                        }
                        if (!var10.field2822) {
                            if (var10.field2845 > var10.field2934 - var10.field2919) {
                                var10.field2845 = var10.field2934 - var10.field2919;
                            }
                            if (var10.field2845 < 0) {
                                var10.field2845 = 0;
                            }
                        }
                        method714(arg0, var10.field2826, var20, var21, var22, var23, var13 - var10.field2844, var14 - var10.field2845, var11);
                        if (var10.field2947 != null) {
                            method714(var10.field2947, var10.field2826, var20, var21, var22, var23, var13 - var10.field2844, var14 - var10.field2845, var11);
                        }
                        class68 var70 = (class68) field1031.method3637((long) var10.field2826);
                        if (var70 != null) {
                            method1737(var70.field790, var20, var21, var22, var23, var13, var14, var11);
                        }
                        class328.method5287(arg2, arg3, arg4, arg5);
                        class135.method2586();
                    }
                    if (field1025 || field1075[var11] || field1080 > 1) {
                        if (var10.field2825 == 0 && !var10.field2822 && var10.field2934 > var10.field2919) {
                            method2890(var10.field2838 + var13, var14, var10.field2845, var10.field2919, var10.field2934);
                        }
                        if (var10.field2825 != 1) {
                            if (var10.field2825 == 2) {
                                int var71 = 0;
                                for (int var72 = 0; var72 < var10.field2835; var72++) {
                                    for (int var73 = 0; var73 < var10.field2957; var73++) {
                                        int var74 = (var10.field2889 + 32) * var73 + var13;
                                        int var75 = (var10.field2890 + 32) * var72 + var14;
                                        if (var71 < 20) {
                                            var74 += var10.field2891[var71];
                                            var75 += var10.field2916[var71];
                                        }
                                        if (var10.field2903[var71] > 0) {
                                            boolean var76 = false;
                                            boolean var77 = false;
                                            int var78 = var10.field2903[var71] - 1;
                                            if (var74 + 32 > arg2 && var74 < arg4 && var75 + 32 > arg3 && var75 < arg5 || Statics.field2138 == var10 && field978 == var71) {
                                                class332 var79;
                                                if (field1023 == 1 && Statics.field2129 == var71 && Statics.field252 == var10.field2826) {
                                                    var79 = class284.method274(var78, var10.field2942[var71], 2, 0, 2, false);
                                                } else {
                                                    var79 = class284.method274(var78, var10.field2942[var71], 1, 3153952, 2, false);
                                                }
                                                if (var79 == null) {
                                                    method5068(var10);
                                                } else if (Statics.field2138 == var10 && field978 == var71) {
                                                    int var80 = class61.field717 - field979;
                                                    int var81 = class61.field715 - field913;
                                                    if (var80 < 5 && var80 > -5) {
                                                        var80 = 0;
                                                    }
                                                    if (var81 < 5 && var81 > -5) {
                                                        var81 = 0;
                                                    }
                                                    if (field983 < 5) {
                                                        var80 = 0;
                                                        var81 = 0;
                                                    }
                                                    var79.method5471(var74 + var80, var75 + var81, 128);
                                                    if (arg1 != -1) {
                                                        class243 var82 = arg0[arg1 & 0xFFFF];
                                                        if (var75 + var81 < class328.field3957 && var82.field2845 > 0) {
                                                            int var83 = field931 * (class328.field3957 - var75 - var81) / 3;
                                                            if (var83 > field931 * 10) {
                                                                var83 = field931 * 10;
                                                            }
                                                            if (var83 > var82.field2845) {
                                                                var83 = var82.field2845;
                                                            }
                                                            var82.field2845 -= var83;
                                                            field913 += var83;
                                                            method5068(var82);
                                                        }
                                                        if (var75 + var81 + 32 > class328.field3960 && var82.field2845 < var82.field2934 - var82.field2919) {
                                                            int var84 = field931 * (var75 + var81 + 32 - class328.field3960) / 3;
                                                            if (var84 > field931 * 10) {
                                                                var84 = field931 * 10;
                                                            }
                                                            if (var84 > var82.field2934 - var82.field2919 - var82.field2845) {
                                                                var84 = var82.field2934 - var82.field2919 - var82.field2845;
                                                            }
                                                            var82.field2845 += var84;
                                                            field913 -= var84;
                                                            method5068(var82);
                                                        }
                                                    }
                                                } else if (Statics.field18 == var10 && field977 == var71) {
                                                    var79.method5471(var74, var75, 128);
                                                } else {
                                                    var79.method5514(var74, var75);
                                                }
                                            }
                                        } else if (var10.field2893 != null && var71 < 20) {
                                            class332 var85 = var10.method4062(var71);
                                            if (var85 != null) {
                                                var85.method5514(var74, var75);
                                            } else if (class243.field2821) {
                                                method5068(var10);
                                            }
                                        }
                                        var71++;
                                    }
                                }
                            } else if (var10.field2825 == 3) {
                                int var86;
                                if (method234(var10)) {
                                    var86 = var10.field2842;
                                    if (Statics.field260 == var10 && var10.field2909 != 0) {
                                        var86 = var10.field2909;
                                    }
                                } else {
                                    var86 = var10.field2848;
                                    if (Statics.field260 == var10 && var10.field2850 != 0) {
                                        var86 = var10.field2850;
                                    }
                                }
                                if (var10.field2877) {
                                    switch(var10.field2910.field3971) {
                                        case 1:
                                            class328.method5296(var13, var14, var10.field2838, var10.field2919, var10.field2848, var10.field2842, 256 - (var10.field2849 & 0xFF), 256 - (var10.field2855 & 0xFF));
                                            break;
                                        case 2:
                                            class328.method5315(var13, var14, var10.field2838, var10.field2919, var10.field2848, var10.field2842, 256 - (var10.field2849 & 0xFF), 256 - (var10.field2855 & 0xFF));
                                            break;
                                        case 3:
                                            class328.method5298(var13, var14, var10.field2838, var10.field2919, var10.field2848, var10.field2842, 256 - (var10.field2849 & 0xFF), 256 - (var10.field2855 & 0xFF));
                                            break;
                                        case 4:
                                            class328.method5299(var13, var14, var10.field2838, var10.field2919, var10.field2848, var10.field2842, 256 - (var10.field2849 & 0xFF), 256 - (var10.field2855 & 0xFF));
                                            break;
                                        default:
                                            if (var15 == 0) {
                                                class328.method5295(var13, var14, var10.field2838, var10.field2919, var86);
                                            } else {
                                                class328.method5294(var13, var14, var10.field2838, var10.field2919, var86, 256 - (var15 & 0xFF));
                                            }
                                    }
                                } else if (var15 == 0) {
                                    class328.method5302(var13, var14, var10.field2838, var10.field2919, var86);
                                } else {
                                    class328.method5303(var13, var14, var10.field2838, var10.field2919, var86, 256 - (var15 & 0xFF));
                                }
                            } else if (var10.field2825 == 4) {
                                class312 var87 = var10.method4054();
                                if (var87 != null) {
                                    String var88 = var10.field2883;
                                    int var89;
                                    if (method234(var10)) {
                                        var89 = var10.field2842;
                                        if (Statics.field260 == var10 && var10.field2909 != 0) {
                                            var89 = var10.field2909;
                                        }
                                        if (var10.field2884.length() > 0) {
                                            var88 = var10.field2884;
                                        }
                                    } else {
                                        var89 = var10.field2848;
                                        if (Statics.field260 == var10 && var10.field2850 != 0) {
                                            var89 = var10.field2850;
                                        }
                                    }
                                    if (var10.field2822 && var10.field2943 != -1) {
                                        class284 var90 = class284.method660(var10.field2943);
                                        var88 = var90.field3674;
                                        if (var88 == null) {
                                            var88 = class252.field3032;
                                        }
                                        if ((var90.field3664 == 1 || var10.field2944 != 1) && var10.field2944 != -1) {
                                            var88 = class87.method585(16748608) + var88 + class87.field1337 + " " + 'x' + method3031(var10.field2944);
                                        }
                                    }
                                    if (field1034 == var10) {
                                        var88 = class252.field3123;
                                        var89 = var10.field2848;
                                    }
                                    if (!var10.field2822) {
                                        var88 = method1022(var88, var10);
                                    }
                                    var87.method5092(var88, var13, var14, var10.field2838, var10.field2919, var89, var10.field2931 ? 0 : -1, var10.field2886, var10.field2834, var10.field2885);
                                } else if (class243.field2821) {
                                    method5068(var10);
                                }
                            } else if (var10.field2825 == 5) {
                                if (var10.field2822) {
                                    class332 var92;
                                    if (var10.field2943 == -1) {
                                        var92 = var10.method4070(false);
                                    } else {
                                        var92 = class284.method274(var10.field2943, var10.field2944, var10.field2862, var10.field2873, var10.field2854, false);
                                    }
                                    if (var92 != null) {
                                        int var93 = var92.field3987;
                                        int var94 = var92.field3990;
                                        if (var10.field2861) {
                                            class328.method5288(var13, var14, var10.field2838 + var13, var10.field2919 + var14);
                                            int var95 = (var10.field2838 + (var93 - 1)) / var93;
                                            int var96 = (var10.field2919 + (var94 - 1)) / var94;
                                            for (int var97 = 0; var97 < var95; var97++) {
                                                for (int var98 = 0; var98 < var96; var98++) {
                                                    if (var10.field2860 != 0) {
                                                        var92.method5438(var93 / 2 + var93 * var97 + var13, var94 / 2 + var94 * var98 + var14, var10.field2860, 4096);
                                                    } else if (var15 == 0) {
                                                        var92.method5514(var93 * var97 + var13, var94 * var98 + var14);
                                                    } else {
                                                        var92.method5471(var93 * var97 + var13, var94 * var98 + var14, 256 - (var15 & 0xFF));
                                                    }
                                                }
                                            }
                                            class328.method5287(arg2, arg3, arg4, arg5);
                                        } else {
                                            int var99 = var10.field2838 * 4096 / var93;
                                            if (var10.field2860 != 0) {
                                                var92.method5438(var10.field2838 / 2 + var13, var10.field2919 / 2 + var14, var10.field2860, var99);
                                            } else if (var15 != 0) {
                                                var92.method5427(var13, var14, var10.field2838, var10.field2919, 256 - (var15 & 0xFF));
                                            } else if (var10.field2838 == var93 && var10.field2919 == var94) {
                                                var92.method5514(var13, var14);
                                            } else {
                                                var92.method5421(var13, var14, var10.field2838, var10.field2919);
                                            }
                                        }
                                    } else if (class243.field2821) {
                                        method5068(var10);
                                    }
                                } else {
                                    class332 var91 = var10.method4070(method234(var10));
                                    if (var91 != null) {
                                        var91.method5514(var13, var14);
                                    } else if (class243.field2821) {
                                        method5068(var10);
                                    }
                                }
                            } else if (var10.field2825 == 6) {
                                boolean var100 = method234(var10);
                                int var101;
                                if (var100) {
                                    var101 = var10.field2856;
                                } else {
                                    var101 = var10.field2870;
                                }
                                class132 var102 = null;
                                int var103 = 0;
                                if (var10.field2943 != -1) {
                                    class284 var104 = class284.method660(var10.field2943);
                                    if (var104 != null) {
                                        class284 var105 = var104.method4677(var10.field2944);
                                        var102 = var105.method4717(1);
                                        if (var102 == null) {
                                            method5068(var10);
                                        } else {
                                            var102.method2512();
                                            var103 = var102.field2054 / 2;
                                        }
                                    }
                                } else if (var10.field2866 == 5) {
                                    if (var10.field2867 == 0) {
                                        var102 = field1133.method4022((class288) null, -1, (class288) null, -1);
                                    } else {
                                        var102 = Statics.field642.method1081();
                                    }
                                } else if (var101 == -1) {
                                    var102 = var10.method4072((class288) null, -1, var100, Statics.field642.field848);
                                    if (var102 == null && class243.field2821) {
                                        method5068(var10);
                                    }
                                } else {
                                    class288 var106 = class288.method1535(var101);
                                    var102 = var10.method4072(var106, var10.field2936, var100, Statics.field642.field848);
                                    if (var102 == null && class243.field2821) {
                                        method5068(var10);
                                    }
                                }
                                class135.method2553(var10.field2838 / 2 + var13, var10.field2919 / 2 + var14);
                                int var107 = var10.field2811 * class135.field1963[var10.field2812] >> 16;
                                int var108 = var10.field2811 * class135.field1964[var10.field2812] >> 16;
                                if (var102 != null) {
                                    if (var10.field2822) {
                                        var102.method2512();
                                        if (var10.field2880) {
                                            var102.method2521(0, var10.field2875, var10.field2945, var10.field2812, var10.field2872, var10.field2813 + var103 + var107, var10.field2813 + var108, var10.field2811);
                                        } else {
                                            var102.method2507(0, var10.field2875, var10.field2945, var10.field2812, var10.field2872, var10.field2813 + var103 + var107, var10.field2813 + var108);
                                        }
                                    } else {
                                        var102.method2507(0, var10.field2875, 0, var10.field2812, 0, var107, var108);
                                    }
                                }
                                class135.method2555();
                            } else {
                                if (var10.field2825 == 7) {
                                    class312 var109 = var10.method4054();
                                    if (var109 == null) {
                                        if (class243.field2821) {
                                            method5068(var10);
                                        }
                                        continue;
                                    }
                                    int var110 = 0;
                                    for (int var111 = 0; var111 < var10.field2835; var111++) {
                                        for (int var112 = 0; var112 < var10.field2957; var112++) {
                                            if (var10.field2903[var110] > 0) {
                                                class284 var113 = class284.method660(var10.field2903[var110] - 1);
                                                String var114;
                                                if (var113.field3664 != 1 && var10.field2942[var110] == 1) {
                                                    var114 = class87.method585(16748608) + var113.field3674 + class87.field1337;
                                                } else {
                                                    var114 = class87.method585(16748608) + var113.field3674 + class87.field1337 + " " + 'x' + method3031(var10.field2942[var110]);
                                                }
                                                int var115 = (var10.field2889 + 115) * var112 + var13;
                                                int var116 = (var10.field2890 + 12) * var111 + var14;
                                                if (var10.field2886 == 0) {
                                                    var109.method5088(var114, var115, var116, var10.field2848, var10.field2931 ? 0 : -1);
                                                } else if (var10.field2886 == 1) {
                                                    var109.method5091(var114, var10.field2838 / 2 + var115, var116, var10.field2848, var10.field2931 ? 0 : -1);
                                                } else {
                                                    var109.method5090(var114, var10.field2838 + var115 - 1, var116, var10.field2848, var10.field2931 ? 0 : -1);
                                                }
                                            }
                                            var110++;
                                        }
                                    }
                                }
                                if (var10.field2825 == 8 && Statics.field235 == var10 && field1116 == field1022) {
                                    int var117 = 0;
                                    int var118 = 0;
                                    class312 var119 = Statics.field338;
                                    String var120 = var10.field2883;
                                    String var121 = method1022(var120, var10);
                                    while (var121.length() > 0) {
                                        int var122 = var121.indexOf(class87.field1335);
                                        String var123;
                                        if (var122 == -1) {
                                            var123 = var121;
                                            var121 = "";
                                        } else {
                                            var123 = var121.substring(0, var122);
                                            var121 = var121.substring(var122 + 4);
                                        }
                                        int var124 = var119.method5144(var123);
                                        if (var124 > var117) {
                                            var117 = var124;
                                        }
                                        var118 += var119.field3896 + 1;
                                    }
                                    var117 += 6;
                                    var118 += 7;
                                    int var125 = var10.field2838 + var13 - 5 - var117;
                                    int var126 = var10.field2919 + var14 + 5;
                                    if (var125 < var13 + 5) {
                                        var125 = var13 + 5;
                                    }
                                    if (var117 + var125 > arg4) {
                                        var125 = arg4 - var117;
                                    }
                                    if (var118 + var126 > arg5) {
                                        var126 = arg5 - var118;
                                    }
                                    class328.method5295(var125, var126, var117, var118, 16777120);
                                    class328.method5302(var125, var126, var117, var118, 0);
                                    String var127 = var10.field2883;
                                    int var128 = var119.field3896 + var126 + 2;
                                    String var129 = method1022(var127, var10);
                                    while (var129.length() > 0) {
                                        int var130 = var129.indexOf(class87.field1335);
                                        String var131;
                                        if (var130 == -1) {
                                            var131 = var129;
                                            var129 = "";
                                        } else {
                                            var131 = var129.substring(0, var130);
                                            var129 = var129.substring(var130 + 4);
                                        }
                                        var119.method5088(var131, var125 + 3, var128, 0, -1);
                                        var128 += var119.field3896 + 1;
                                    }
                                }
                                if (var10.field2825 == 9) {
                                    int var132;
                                    int var133;
                                    int var134;
                                    int var135;
                                    if (var10.field2904) {
                                        var132 = var13;
                                        var133 = var10.field2919 + var14;
                                        var134 = var10.field2838 + var13;
                                        var135 = var14;
                                    } else {
                                        var132 = var13;
                                        var133 = var14;
                                        var134 = var10.field2838 + var13;
                                        var135 = var10.field2919 + var14;
                                    }
                                    if (var10.field2958 == 1) {
                                        class328.method5332(var132, var133, var134, var135, var10.field2848);
                                    } else {
                                        method3(var132, var133, var134, var135, var10.field2848, var10.field2958);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.ie(IIIIIII)V")
    public static final void method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class328.field3961;
        int var18 = arg1 - class328.field3957;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class135.method2561(var19, var20, var21);
        class135.method2611(var23, var24, var25, var19, var20, var21, arg4);
        class135.method2561(var19, var21, var22);
        class135.method2611(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("bt.ik(Ljava/lang/String;Lin;I)Ljava/lang/String;")
    public static String method1022(String arg0, class243 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method5064(arg1, var2 - 1);
                    String var6;
                    if (var5 < 999999999) {
                        var6 = Integer.toString(var5);
                    } else {
                        var6 = "*";
                    }
                    arg0 = var4 + var6 + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("fd.if(II)Ljava/lang/String;")
    public static final String method3031(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class87.field1330 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class87.method585(65408) + var1.substring(0, var1.length() - 8) + class252.field3194 + " " + class87.field1329 + var1 + class87.field1333 + class87.field1337;
        } else if (var1.length() > 6) {
            return " " + class87.method585(16777215) + var1.substring(0, var1.length() - 4) + class252.field3076 + " " + class87.field1329 + var1 + class87.field1333 + class87.field1337;
        } else {
            return " " + class87.method585(16776960) + var1 + class87.field1337;
        }
    }

    @ObfuscatedName("client.ix(ZI)V")
    public final void method1207(boolean arg0) {
        method578(field1016, Statics.field472, Statics.field3509, arg0);
    }

    @ObfuscatedName("client.ic(Lin;I)V")
    public void method1494(class243 arg0) {
        class243 var2 = arg0.field2899 == -1 ? null : class243.method577(arg0.field2899);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field472;
            var4 = Statics.field3509;
        } else {
            var3 = var2.field2838;
            var4 = var2.field2919;
        }
        method40(arg0, var3, var4, false);
        method41(arg0, var3, var4);
    }

    @ObfuscatedName("cu.ii([Lin;Lin;ZI)V")
    public static void method1733(class243[] arg0, class243 arg1, boolean arg2) {
        int var3 = arg1.field2846 == 0 ? arg1.field2838 : arg1.field2846;
        int var4 = arg1.field2934 == 0 ? arg1.field2919 : arg1.field2934;
        method674(arg0, arg1.field2826, var3, var4, arg2);
        if (arg1.field2947 != null) {
            method674(arg1.field2947, arg1.field2826, var3, var4, arg2);
        }
        class68 var5 = (class68) field1031.method3637((long) arg1.field2826);
        if (var5 != null) {
            method578(var5.field790, var3, var4, arg2);
        }
        if (arg1.field2827 == 1337) {
        }
    }

    @ObfuscatedName("ar.it(IIIZI)V")
    public static final void method578(int arg0, int arg1, int arg2, boolean arg3) {
        if (class243.method3175(arg0)) {
            method674(Statics.field812[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ay.in([Lin;IIIZI)V")
    public static void method674(class243[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class243 var6 = arg0[var5];
            if (var6 != null && var6.field2899 == arg1) {
                method40(var6, arg2, arg3, arg4);
                method41(var6, arg2, arg3);
                if (var6.field2844 > var6.field2846 - var6.field2838) {
                    var6.field2844 = var6.field2846 - var6.field2838;
                }
                if (var6.field2844 < 0) {
                    var6.field2844 = 0;
                }
                if (var6.field2845 > var6.field2934 - var6.field2919) {
                    var6.field2845 = var6.field2934 - var6.field2919;
                }
                if (var6.field2845 < 0) {
                    var6.field2845 = 0;
                }
                if (var6.field2825 == 0) {
                    method1733(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("y.im(Lin;IIZI)V")
    public static void method40(class243 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2838;
        int var5 = arg0.field2919;
        if (arg0.field2830 == 0) {
            arg0.field2838 = arg0.field2957;
        } else if (arg0.field2830 == 1) {
            arg0.field2838 = arg1 - arg0.field2957;
        } else if (arg0.field2830 == 2) {
            arg0.field2838 = arg0.field2957 * arg1 >> 14;
        }
        if (arg0.field2831 == 0) {
            arg0.field2919 = arg0.field2835;
        } else if (arg0.field2831 == 1) {
            arg0.field2919 = arg2 - arg0.field2835;
        } else if (arg0.field2831 == 2) {
            arg0.field2919 = arg0.field2835 * arg2 >> 14;
        }
        if (arg0.field2830 == 4) {
            arg0.field2838 = arg0.field2919 * arg0.field2840 / arg0.field2841;
        }
        if (arg0.field2831 == 4) {
            arg0.field2919 = arg0.field2841 * arg0.field2838 / arg0.field2840;
        }
        if (arg0.field2827 == 1337) {
            field1040 = arg0;
        }
        if (arg3 && arg0.field2932 != null && (arg0.field2838 != var4 || arg0.field2919 != var5)) {
            class69 var6 = new class69();
            var6.field798 = arg0;
            var6.field808 = arg0.field2932;
            field1067.method3690(var6);
        }
    }

    @ObfuscatedName("y.ir(Lin;III)V")
    public static void method41(class243 arg0, int arg1, int arg2) {
        if (arg0.field2817 == 0) {
            arg0.field2823 = arg0.field2832;
        } else if (arg0.field2817 == 1) {
            arg0.field2823 = (arg1 - arg0.field2838) / 2 + arg0.field2832;
        } else if (arg0.field2817 == 2) {
            arg0.field2823 = arg1 - arg0.field2838 - arg0.field2832;
        } else if (arg0.field2817 == 3) {
            arg0.field2823 = arg0.field2832 * arg1 >> 14;
        } else if (arg0.field2817 == 4) {
            arg0.field2823 = (arg0.field2832 * arg1 >> 14) + (arg1 - arg0.field2838) / 2;
        } else {
            arg0.field2823 = arg1 - arg0.field2838 - (arg0.field2832 * arg1 >> 14);
        }
        if (arg0.field2829 == 0) {
            arg0.field2837 = arg0.field2853;
        } else if (arg0.field2829 == 1) {
            arg0.field2837 = (arg2 - arg0.field2919) / 2 + arg0.field2853;
        } else if (arg0.field2829 == 2) {
            arg0.field2837 = arg2 - arg0.field2919 - arg0.field2853;
        } else if (arg0.field2829 == 3) {
            arg0.field2837 = arg0.field2853 * arg2 >> 14;
        } else if (arg0.field2829 == 4) {
            arg0.field2837 = (arg0.field2853 * arg2 >> 14) + (arg2 - arg0.field2919) / 2;
        } else {
            arg0.field2837 = arg2 - arg0.field2919 - (arg0.field2853 * arg2 >> 14);
        }
    }

    @ObfuscatedName("l.iu(Lin;IIIIIII)V")
    public static final void method79(class243 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field937) {
            field920 = 32;
        } else {
            field920 = 0;
        }
        field937 = false;
        if (class61.field729 == 1 || !Statics.field590 && class61.field729 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2845 -= 4;
                method5068(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2845 += 4;
                method5068(arg0);
            } else if (arg5 >= arg1 - field920 && arg5 < field920 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2845 = (arg4 - arg3) * var8 / var9;
                method5068(arg0);
                field937 = true;
            }
        }
        if (field1082 == 0) {
            return;
        }
        int var10 = arg0.field2838;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2845 += field1082 * 45;
            method5068(arg0);
        }
    }

    @ObfuscatedName("eh.iv(IIIIII)V")
    public static final void method2890(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field322[0].method5386(arg0, arg1);
        Statics.field322[1].method5386(arg0, arg1 + arg3 - 16);
        class328.method5295(arg0, arg1 + 16, 16, arg3 - 32, field933);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class328.method5295(arg0, arg1 + 16 + var6, 16, var5, field934);
        class328.method5370(arg0, arg1 + 16 + var6, var5, field876);
        class328.method5370(arg0 + 1, arg1 + 16 + var6, var5, field876);
        class328.method5304(arg0, arg1 + 16 + var6, 16, field876);
        class328.method5304(arg0, arg1 + 17 + var6, 16, field876);
        class328.method5370(arg0 + 15, arg1 + 16 + var6, var5, field870);
        class328.method5370(arg0 + 14, arg1 + 17 + var6, var5 - 1, field870);
        class328.method5304(arg0, arg1 + 15 + var6 + var5, 16, field870);
        class328.method5304(arg0 + 1, arg1 + 14 + var6 + var5, 15, field870);
    }

    @ObfuscatedName("ap.il(Lin;B)Z")
    public static final boolean method234(class243 arg0) {
        if (arg0.field2839 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2839.length; var1++) {
            int var2 = method5064(arg0, var1);
            int var3 = arg0.field2937[var1];
            if (arg0.field2839[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2839[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2839[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("kk.ia(Lin;IB)I")
    public static final int method5064(class243 arg0, int arg1) {
        if (arg0.field2953 == null || arg1 >= arg0.field2953.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2953[arg1];
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
                    var7 = field1006[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field1003[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1002[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class243 var11 = class243.method577(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class284.method660(var12).field3661 || field874)) {
                        for (int var13 = 0; var13 < var11.field2903.length; var13++) {
                            if (var12 + 1 == var11.field2903[var13]) {
                                var7 += var11.field2942[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class238.field2779[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class249.field3013[field1003[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class238.field2779[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field642.field841;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class249.field3012[var14]) {
                            var7 += field1003[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class243 var17 = class243.method577(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class284.method660(var18).field3661 || field874)) {
                        for (int var19 = 0; var19 < var17.field2903.length; var19++) {
                            if (var18 + 1 == var17.field2903[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1125;
                }
                if (var6 == 12) {
                    var7 = field1036;
                }
                if (var6 == 13) {
                    int var20 = class238.field2779[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class238.method1854(var22);
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
                    var7 = (Statics.field642.field1211 >> 7) + Statics.field2048;
                }
                if (var6 == 19) {
                    var7 = (Statics.field642.field1188 >> 7) + Statics.field360;
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

    @ObfuscatedName("de.id(Lin;Ljo;IIZI)V")
    public static final void method2077(class243 arg0, class284 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3668;
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
            var7 = class252.field3026;
        }
        if (var6 == -1 || var7 == null) {
            return;
        }
        String var9 = class87.method585(16748608) + arg1.field3674;
        int var11 = arg1.field3643;
        int var13 = arg0.field2826;
        if (field1069 || field1004 >= 500) {
            return;
        }
        field1059[field1004] = var7;
        field1013[field1004] = var9;
        field1108[field1004] = var6;
        field950[field1004] = var11;
        field1008[field1004] = arg2;
        field914[field1004] = var13;
        field1087[field1004] = arg4;
        field1004++;
    }

    @ObfuscatedName("p.ig(ZI)V")
    public static void method179(boolean arg0) {
        field1017 = arg0;
    }

    @ObfuscatedName("bd.ij(I)Z")
    public static boolean method1534() {
        return field1017 || class52.field625[81];
    }

    @ObfuscatedName("ah.is(IIIIIIII)V")
    public static final void method362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class243.method3175(arg0)) {
            method5224(Statics.field812[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("le.ib([Lin;IIIIIIIB)V")
    public static final void method5224(class243[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class243 var9 = arg0[var8];
            if (var9 != null && (!var9.field2822 || var9.field2825 == 0 || var9.field2892 || method2446(var9) != 0 || field938 == var9 || var9.field2827 == 1338) && var9.field2899 == arg1) {
                if (var9.field2822) {
                    boolean var10 = var9.field2843;
                    if (var10) {
                        continue;
                    }
                }
                int var11 = var9.field2823 + arg6;
                int var12 = var9.field2837 + arg7;
                int var13;
                int var14;
                int var15;
                int var16;
                if (var9.field2825 == 2) {
                    var13 = arg2;
                    var14 = arg3;
                    var15 = arg4;
                    var16 = arg5;
                } else if (var9.field2825 == 9) {
                    int var17 = var11;
                    int var18 = var12;
                    int var19 = var9.field2838 + var11;
                    int var20 = var9.field2919 + var12;
                    if (var19 < var11) {
                        var17 = var19;
                        var19 = var11;
                    }
                    if (var20 < var12) {
                        var18 = var20;
                        var20 = var12;
                    }
                    var19++;
                    var20++;
                    var13 = var17 > arg2 ? var17 : arg2;
                    var14 = var18 > arg3 ? var18 : arg3;
                    var15 = var19 < arg4 ? var19 : arg4;
                    var16 = var20 < arg5 ? var20 : arg5;
                } else {
                    int var23 = var9.field2838 + var11;
                    int var24 = var9.field2919 + var12;
                    var13 = var11 > arg2 ? var11 : arg2;
                    var14 = var12 > arg3 ? var12 : arg3;
                    var15 = var23 < arg4 ? var23 : arg4;
                    var16 = var24 < arg5 ? var24 : arg5;
                }
                if (field1041 == var9) {
                    field959 = true;
                    field1050 = var11;
                    field883 = var12;
                }
                if (!var9.field2822 || var13 < var15 && var14 < var16) {
                    int var25 = class61.field717;
                    int var26 = class61.field715;
                    if (class61.field730 != 0) {
                        var25 = class61.field731;
                        var26 = class61.field732;
                    }
                    boolean var27 = var25 >= var13 && var26 >= var14 && var25 < var15 && var26 < var16;
                    if (var9.field2827 == 1337) {
                        if (!field881 && !field1069 && var27) {
                            method720(var25, var26, var13, var14);
                        }
                    } else if (var9.field2827 == 1338) {
                        method1068(var9, var11, var12);
                    } else {
                        if (var9.field2827 == 1400) {
                            Statics.field1244.method5570(class61.field717, class61.field715, var27, var11, var12, var9.field2838, var9.field2919);
                        }
                        if (!field1069 && var27) {
                            if (var9.field2827 == 1400) {
                                Statics.field1244.method5638(var11, var12, var9.field2838, var9.field2919, var25, var26);
                            } else {
                                int var28 = var25 - var11;
                                int var29 = var26 - var12;
                                if (var9.field2933 == 1) {
                                    method2372(var9.field2940, "", 24, 0, 0, var9.field2826);
                                }
                                if (var9.field2933 == 2 && !field895) {
                                    String var30;
                                    if (class244.method4137(method2446(var9)) == 0) {
                                        var30 = null;
                                    } else if (var9.field2902 == null || var9.field2902.trim().length() == 0) {
                                        var30 = null;
                                    } else {
                                        var30 = var9.field2902;
                                    }
                                    if (var30 != null) {
                                        method2372(var30, class87.method585(65280) + var9.field2939, 25, 0, -1, var9.field2826);
                                    }
                                }
                                if (var9.field2933 == 3) {
                                    method2372(class252.field3184, "", 26, 0, 0, var9.field2826);
                                }
                                if (var9.field2933 == 4) {
                                    method2372(var9.field2940, "", 28, 0, 0, var9.field2826);
                                }
                                if (var9.field2933 == 5) {
                                    method2372(var9.field2940, "", 29, 0, 0, var9.field2826);
                                }
                                if (var9.field2933 == 6 && field1034 == null) {
                                    method2372(var9.field2940, "", 30, 0, -1, var9.field2826);
                                }
                                if (var9.field2825 == 2) {
                                    int var32 = 0;
                                    for (int var33 = 0; var33 < var9.field2919; var33++) {
                                        for (int var34 = 0; var34 < var9.field2838; var34++) {
                                            int var35 = (var9.field2889 + 32) * var34;
                                            int var36 = (var9.field2890 + 32) * var33;
                                            if (var32 < 20) {
                                                var35 += var9.field2891[var32];
                                                var36 += var9.field2916[var32];
                                            }
                                            if (var28 >= var35 && var29 >= var36 && var28 < var35 + 32 && var29 < var36 + 32) {
                                                field981 = var32;
                                                Statics.field493 = var9;
                                                if (var9.field2903[var32] > 0) {
                                                    label1014: {
                                                        class284 var37 = class284.method660(var9.field2903[var32] - 1);
                                                        if (field1023 == 1) {
                                                            int var38 = method2446(var9);
                                                            boolean var39 = (var38 >> 30 & 0x1) != 0;
                                                            if (var39) {
                                                                if (Statics.field252 != var9.field2826 || Statics.field2129 != var32) {
                                                                    method2372(class252.field3175, field1024 + " " + class87.field1334 + " " + class87.method585(16748608) + var37.field3674, 31, var37.field3643, var32, var9.field2826);
                                                                }
                                                                break label1014;
                                                            }
                                                        }
                                                        if (field895) {
                                                            int var40 = method2446(var9);
                                                            boolean var41 = (var40 >> 30 & 0x1) != 0;
                                                            if (var41) {
                                                                if ((Statics.field1608 & 0x10) == 16) {
                                                                    method2372(field1093, field1029 + " " + class87.field1334 + " " + class87.method585(16748608) + var37.field3674, 32, var37.field3643, var32, var9.field2826);
                                                                }
                                                                break label1014;
                                                            }
                                                        }
                                                        String[] var42 = var37.field3668;
                                                        int var43 = -1;
                                                        if (field982 && method1534()) {
                                                            var43 = var37.method4684();
                                                        }
                                                        int var44 = method2446(var9);
                                                        boolean var45 = (var44 >> 30 & 0x1) != 0;
                                                        if (var45) {
                                                            for (int var46 = 4; var46 >= 3; var46--) {
                                                                if (var43 != var46) {
                                                                    method2077(var9, var37, var32, var46, false);
                                                                }
                                                            }
                                                        }
                                                        class244 var10000 = (class244) null;
                                                        if (class244.method5013(method2446(var9))) {
                                                            method2372(class252.field3175, class87.method585(16748608) + var37.field3674, 38, var37.field3643, var32, var9.field2826);
                                                        }
                                                        int var47 = method2446(var9);
                                                        boolean var48 = (var47 >> 30 & 0x1) != 0;
                                                        if (var48) {
                                                            for (int var49 = 2; var49 >= 0; var49--) {
                                                                if (var43 != var49) {
                                                                    method2077(var9, var37, var32, var49, false);
                                                                }
                                                            }
                                                            if (var43 >= 0) {
                                                                method2077(var9, var37, var32, var43, true);
                                                            }
                                                        }
                                                        String[] var50 = var9.field2894;
                                                        if (var50 != null) {
                                                            for (int var51 = 4; var51 >= 0; var51--) {
                                                                if (var50[var51] != null) {
                                                                    byte var52 = 0;
                                                                    if (var51 == 0) {
                                                                        var52 = 39;
                                                                    }
                                                                    if (var51 == 1) {
                                                                        var52 = 40;
                                                                    }
                                                                    if (var51 == 2) {
                                                                        var52 = 41;
                                                                    }
                                                                    if (var51 == 3) {
                                                                        var52 = 42;
                                                                    }
                                                                    if (var51 == 4) {
                                                                        var52 = 43;
                                                                    }
                                                                    method2372(var50[var51], class87.method585(16748608) + var37.field3674, var52, var37.field3643, var32, var9.field2826);
                                                                }
                                                            }
                                                        }
                                                        method2372(class252.field3176, class87.method585(16748608) + var37.field3674, 1005, var37.field3643, var32, var9.field2826);
                                                    }
                                                }
                                            }
                                            var32++;
                                        }
                                    }
                                }
                                if (var9.field2822) {
                                    if (!field895) {
                                        for (int var53 = 9; var53 >= 5; var53--) {
                                            String var54;
                                            if (!class244.method1853(method2446(var9), var53) && var9.field2874 == null) {
                                                var54 = null;
                                            } else if (var9.field2897 == null || var9.field2897.length <= var53 || var9.field2897[var53] == null || var9.field2897[var53].trim().length() == 0) {
                                                var54 = null;
                                            } else {
                                                var54 = var9.field2897[var53];
                                            }
                                            if (var54 != null) {
                                                method2372(var54, var9.field2847, 1007, var53 + 1, var9.field2824, var9.field2826);
                                            }
                                        }
                                        String var56;
                                        if (class244.method4137(method2446(var9)) == 0) {
                                            var56 = null;
                                        } else if (var9.field2902 == null || var9.field2902.trim().length() == 0) {
                                            var56 = null;
                                        } else {
                                            var56 = var9.field2902;
                                        }
                                        if (var56 != null) {
                                            method2372(var56, var9.field2847, 25, 0, var9.field2824, var9.field2826);
                                        }
                                        for (int var58 = 4; var58 >= 0; var58--) {
                                            String var59;
                                            if (!class244.method1853(method2446(var9), var58) && var9.field2874 == null) {
                                                var59 = null;
                                            } else if (var9.field2897 == null || var9.field2897.length <= var58 || var9.field2897[var58] == null || var9.field2897[var58].trim().length() == 0) {
                                                var59 = null;
                                            } else {
                                                var59 = var9.field2897[var58];
                                            }
                                            if (var59 != null) {
                                                method2372(var59, var9.field2847, 57, var58 + 1, var9.field2824, var9.field2826);
                                            }
                                        }
                                        int var61 = method2446(var9);
                                        boolean var62 = (var61 & 0x1) != 0;
                                        if (var62) {
                                            method2372(class252.field3079, "", 30, 0, var9.field2824, var9.field2826);
                                        }
                                    } else if (class244.method2442(method2446(var9)) && (Statics.field1608 & 0x20) == 32) {
                                        method2372(field1093, field1029 + " " + class87.field1334 + " " + var9.field2847, 58, 0, var9.field2824, var9.field2826);
                                    }
                                }
                            }
                        }
                        if (var9.field2825 == 0) {
                            if (!var9.field2822) {
                                boolean var63 = var9.field2843;
                                if (var63 && Statics.field260 != var9) {
                                    continue;
                                }
                            }
                            method5224(arg0, var9.field2826, var13, var14, var15, var16, var11 - var9.field2844, var12 - var9.field2845);
                            if (var9.field2947 != null) {
                                method5224(var9.field2947, var9.field2826, var13, var14, var15, var16, var11 - var9.field2844, var12 - var9.field2845);
                            }
                            class68 var64 = (class68) field1031.method3637((long) var9.field2826);
                            if (var64 != null) {
                                if (var64.field789 == 0 && class61.field717 >= var13 && class61.field715 >= var14 && class61.field717 < var15 && class61.field715 < var16 && !field1069) {
                                    for (class69 var65 = (class69) field1067.method3707(); var65 != null; var65 = (class69) field1067.method3697()) {
                                        if (var65.field806) {
                                            var65.method3681();
                                            var65.field798.field2836 = false;
                                        }
                                    }
                                    if (Statics.field661 == 0) {
                                        field1041 = null;
                                        field938 = null;
                                    }
                                    if (!field1069) {
                                        method187();
                                    }
                                }
                                method362(var64.field790, var13, var14, var15, var16, var11, var12);
                            }
                        }
                        if (var9.field2822) {
                            if (var9.field2956) {
                                if (class61.field717 >= var13 && class61.field715 >= var14 && class61.field717 < var15 && class61.field715 < var16) {
                                    for (class69 var66 = (class69) field1067.method3707(); var66 != null; var66 = (class69) field1067.method3697()) {
                                        if (var66.field806) {
                                            var66.method3681();
                                            var66.field798.field2836 = false;
                                        }
                                    }
                                    if (Statics.field661 == 0) {
                                        field1041 = null;
                                        field938 = null;
                                    }
                                    if (!field1069) {
                                        method187();
                                    }
                                }
                            } else if (var9.field2896 && class61.field717 >= var13 && class61.field715 >= var14 && class61.field717 < var15 && class61.field715 < var16) {
                                for (class69 var67 = (class69) field1067.method3707(); var67 != null; var67 = (class69) field1067.method3697()) {
                                    if (var67.field806 && var67.field798.field2926 == var67.field808) {
                                        var67.method3681();
                                    }
                                }
                            }
                            boolean var68;
                            if (class61.field717 >= var13 && class61.field715 >= var14 && class61.field717 < var15 && class61.field715 < var16) {
                                var68 = true;
                            } else {
                                var68 = false;
                            }
                            boolean var69 = false;
                            if ((class61.field729 == 1 || !Statics.field590 && class61.field729 == 4) && var68) {
                                var69 = true;
                            }
                            boolean var70 = false;
                            if ((class61.field730 == 1 || !Statics.field590 && class61.field730 == 4) && class61.field731 >= var13 && class61.field732 >= var14 && class61.field731 < var15 && class61.field732 < var16) {
                                var70 = true;
                            }
                            if (var70) {
                                method228(var9, class61.field731 - var11, class61.field732 - var12);
                            }
                            if (var9.field2827 == 1400) {
                                Statics.field1244.method5571(var25, var26, var68 & var69, var68 & var70);
                            }
                            if (field1041 != null && field1041 != var9 && var68) {
                                int var71 = method2446(var9);
                                boolean var72 = (var71 >> 20 & 0x1) != 0;
                                if (var72) {
                                    field990 = var9;
                                }
                            }
                            if (field938 == var9) {
                                field1054 = true;
                                field1009 = var11;
                                field1048 = var12;
                            }
                            if (var9.field2892) {
                                if (var68 && field1082 != 0 && var9.field2926 != null) {
                                    class69 var73 = new class69();
                                    var73.field806 = true;
                                    var73.field798 = var9;
                                    var73.field799 = field1082;
                                    var73.field808 = var9.field2926;
                                    field1067.method3690(var73);
                                }
                                if (field1041 != null || Statics.field2138 != null || field1069) {
                                    var70 = false;
                                    var69 = false;
                                    var68 = false;
                                }
                                if (!var9.field2949 && var70) {
                                    var9.field2949 = true;
                                    if (var9.field2863 != null) {
                                        class69 var74 = new class69();
                                        var74.field806 = true;
                                        var74.field798 = var9;
                                        var74.field800 = class61.field731 - var11;
                                        var74.field799 = class61.field732 - var12;
                                        var74.field808 = var9.field2863;
                                        field1067.method3690(var74);
                                    }
                                }
                                if (var9.field2949 && var69 && var9.field2906 != null) {
                                    class69 var75 = new class69();
                                    var75.field806 = true;
                                    var75.field798 = var9;
                                    var75.field800 = class61.field717 - var11;
                                    var75.field799 = class61.field715 - var12;
                                    var75.field808 = var9.field2906;
                                    field1067.method3690(var75);
                                }
                                if (var9.field2949 && !var69) {
                                    var9.field2949 = false;
                                    if (var9.field2907 != null) {
                                        class69 var76 = new class69();
                                        var76.field806 = true;
                                        var76.field798 = var9;
                                        var76.field800 = class61.field717 - var11;
                                        var76.field799 = class61.field715 - var12;
                                        var76.field808 = var9.field2907;
                                        field1126.method3690(var76);
                                    }
                                }
                                if (var69 && var9.field2908 != null) {
                                    class69 var77 = new class69();
                                    var77.field806 = true;
                                    var77.field798 = var9;
                                    var77.field800 = class61.field717 - var11;
                                    var77.field799 = class61.field715 - var12;
                                    var77.field808 = var9.field2908;
                                    field1067.method3690(var77);
                                }
                                if (!var9.field2836 && var68) {
                                    var9.field2836 = true;
                                    if (var9.field2941 != null) {
                                        class69 var78 = new class69();
                                        var78.field806 = true;
                                        var78.field798 = var9;
                                        var78.field800 = class61.field717 - var11;
                                        var78.field799 = class61.field715 - var12;
                                        var78.field808 = var9.field2941;
                                        field1067.method3690(var78);
                                    }
                                }
                                if (var9.field2836 && var68 && var9.field2887 != null) {
                                    class69 var79 = new class69();
                                    var79.field806 = true;
                                    var79.field798 = var9;
                                    var79.field800 = class61.field717 - var11;
                                    var79.field799 = class61.field715 - var12;
                                    var79.field808 = var9.field2887;
                                    field1067.method3690(var79);
                                }
                                if (var9.field2836 && !var68) {
                                    var9.field2836 = false;
                                    if (var9.field2895 != null) {
                                        class69 var80 = new class69();
                                        var80.field806 = true;
                                        var80.field798 = var9;
                                        var80.field800 = class61.field717 - var11;
                                        var80.field799 = class61.field715 - var12;
                                        var80.field808 = var9.field2895;
                                        field1126.method3690(var80);
                                    }
                                }
                                if (var9.field2922 != null) {
                                    class69 var81 = new class69();
                                    var81.field798 = var9;
                                    var81.field808 = var9.field2922;
                                    field1068.method3690(var81);
                                }
                                if (var9.field2879 != null && field1055 > var9.field2951) {
                                    if (var9.field2924 == null || field1055 - var9.field2951 > 32) {
                                        class69 var86 = new class69();
                                        var86.field798 = var9;
                                        var86.field808 = var9.field2879;
                                        field1067.method3690(var86);
                                    } else {
                                        label680: for (int var82 = var9.field2951; var82 < field1055; var82++) {
                                            int var83 = field985[var82 & 0x1F];
                                            for (int var84 = 0; var84 < var9.field2924.length; var84++) {
                                                if (var9.field2924[var84] == var83) {
                                                    class69 var85 = new class69();
                                                    var85.field798 = var9;
                                                    var85.field808 = var9.field2879;
                                                    field1067.method3690(var85);
                                                    break label680;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2951 = field1055;
                                }
                                if (var9.field2918 != null && field1057 > var9.field2952) {
                                    if (var9.field2911 == null || field1057 - var9.field2952 > 32) {
                                        class69 var91 = new class69();
                                        var91.field798 = var9;
                                        var91.field808 = var9.field2918;
                                        field1067.method3690(var91);
                                    } else {
                                        label656: for (int var87 = var9.field2952; var87 < field1057; var87++) {
                                            int var88 = field1056[var87 & 0x1F];
                                            for (int var89 = 0; var89 < var9.field2911.length; var89++) {
                                                if (var9.field2911[var89] == var88) {
                                                    class69 var90 = new class69();
                                                    var90.field798 = var9;
                                                    var90.field808 = var9.field2918;
                                                    field1067.method3690(var90);
                                                    break label656;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2952 = field1057;
                                }
                                if (var9.field2920 != null && field1053 > var9.field2857) {
                                    if (var9.field2921 == null || field1053 - var9.field2857 > 32) {
                                        class69 var96 = new class69();
                                        var96.field798 = var9;
                                        var96.field808 = var9.field2920;
                                        field1067.method3690(var96);
                                    } else {
                                        label632: for (int var92 = var9.field2857; var92 < field1053; var92++) {
                                            int var93 = field1058[var92 & 0x1F];
                                            for (int var94 = 0; var94 < var9.field2921.length; var94++) {
                                                if (var9.field2921[var94] == var93) {
                                                    class69 var95 = new class69();
                                                    var95.field798 = var9;
                                                    var95.field808 = var9.field2920;
                                                    field1067.method3690(var95);
                                                    break label632;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2857 = field1053;
                                }
                                if (field1089 > var9.field2950 && var9.field2925 != null) {
                                    class69 var97 = new class69();
                                    var97.field798 = var9;
                                    var97.field808 = var9.field2925;
                                    field1067.method3690(var97);
                                }
                                if (field1061 > var9.field2950 && var9.field2927 != null) {
                                    class69 var98 = new class69();
                                    var98.field798 = var9;
                                    var98.field808 = var9.field2927;
                                    field1067.method3690(var98);
                                }
                                if (field968 > var9.field2950 && var9.field2928 != null) {
                                    class69 var99 = new class69();
                                    var99.field798 = var9;
                                    var99.field808 = var9.field2928;
                                    field1067.method3690(var99);
                                }
                                if (field1063 > var9.field2950 && var9.field2871 != null) {
                                    class69 var100 = new class69();
                                    var100.field798 = var9;
                                    var100.field808 = var9.field2871;
                                    field1067.method3690(var100);
                                }
                                if (field1064 > var9.field2950 && var9.field2948 != null) {
                                    class69 var101 = new class69();
                                    var101.field798 = var9;
                                    var101.field808 = var9.field2948;
                                    field1067.method3690(var101);
                                }
                                if (field1065 > var9.field2950 && var9.field2929 != null) {
                                    class69 var102 = new class69();
                                    var102.field798 = var9;
                                    var102.field808 = var9.field2929;
                                    field1067.method3690(var102);
                                }
                                var9.field2950 = field1066;
                                if (var9.field2930 != null) {
                                    for (int var103 = 0; var103 < field953; var103++) {
                                        class69 var104 = new class69();
                                        var104.field798 = var9;
                                        var104.field804 = field969[var103];
                                        var104.field805 = field1090[var103];
                                        var104.field808 = var9.field2930;
                                        field1067.method3690(var104);
                                    }
                                }
                            }
                        }
                        if (!var9.field2822 && field1041 == null && Statics.field2138 == null && !field1069) {
                            if ((var9.field2938 >= 0 || var9.field2850 != 0) && class61.field717 >= var13 && class61.field715 >= var14 && class61.field717 < var15 && class61.field715 < var16) {
                                if (var9.field2938 >= 0) {
                                    Statics.field260 = arg0[var9.field2938];
                                } else {
                                    Statics.field260 = var9;
                                }
                            }
                            if (var9.field2825 == 8 && class61.field717 >= var13 && class61.field715 >= var14 && class61.field717 < var15 && class61.field715 < var16) {
                                Statics.field235 = var9;
                            }
                            if (var9.field2934 > var9.field2919) {
                                method79(var9, var9.field2838 + var11, var12, var9.field2919, var9.field2934, class61.field717, class61.field715);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ct.iy(III)V")
    public static final void method1856(int arg0, int arg1) {
        if (class243.method3175(arg0)) {
            method3984(Statics.field812[arg0], arg1);
        }
    }

    @ObfuscatedName("ik.ih([Lin;II)V")
    public static final void method3984(class243[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class243 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2825 == 0) {
                    if (var3.field2947 != null) {
                        method3984(var3.field2947, arg1);
                    }
                    class68 var4 = (class68) field1031.method3637((long) var3.field2826);
                    if (var4 != null) {
                        method1856(var4.field790, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2876 != null) {
                    class69 var5 = new class69();
                    var5.field798 = var3;
                    var5.field808 = var3.field2876;
                    class82.method2061(var5);
                }
                if (arg1 == 1 && var3.field2851 != null) {
                    if (var3.field2824 >= 0) {
                        class243 var6 = class243.method577(var3.field2826);
                        if (var6 == null || var6.field2947 == null || var3.field2824 >= var6.field2947.length || var6.field2947[var3.field2824] != var3) {
                            continue;
                        }
                    }
                    class69 var7 = new class69();
                    var7.field798 = var3;
                    var7.field808 = var3.field2851;
                    class82.method2061(var7);
                }
            }
        }
    }

    @ObfuscatedName("ap.ip(Lin;III)V")
    public static final void method228(class243 arg0, int arg1, int arg2) {
        if (field1041 != null || field1069 || arg0 == null || method495(arg0) == null) {
            return;
        }
        field1041 = arg0;
        field938 = method495(arg0);
        field1043 = arg1;
        field1115 = arg2;
        Statics.field661 = 0;
        field1051 = false;
        int var3 = field1004 - 1;
        if (var3 != -1) {
            Statics.method173(var3);
        }
    }

    @ObfuscatedName("client.iz(I)V")
    public final void method1154() {
        method5068(field1041);
        Statics.field661++;
        if (field959 && field1054) {
            int var1 = class61.field717;
            int var2 = class61.field715;
            int var3 = var1 - field1043;
            int var4 = var2 - field1115;
            if (var3 < field1009) {
                var3 = field1009;
            }
            if (field1041.field2838 + var3 > field1009 + field938.field2838) {
                var3 = field1009 + field938.field2838 - field1041.field2838;
            }
            if (var4 < field1048) {
                var4 = field1048;
            }
            if (field1041.field2919 + var4 > field1048 + field938.field2919) {
                var4 = field1048 + field938.field2919 - field1041.field2919;
            }
            int var5 = var3 - field1050;
            int var6 = var4 - field883;
            int var7 = field1041.field2852;
            if (Statics.field661 > field1041.field2900 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1051 = true;
            }
            int var8 = field938.field2844 + (var3 - field1009);
            int var9 = field938.field2845 + (var4 - field1048);
            if (field1041.field2912 != null && field1051) {
                class69 var10 = new class69();
                var10.field798 = field1041;
                var10.field800 = var8;
                var10.field799 = var9;
                var10.field808 = field1041.field2912;
                class82.method2061(var10);
            }
            if (class61.field729 == 0) {
                if (field1051) {
                    if (field1041.field2913 != null) {
                        class69 var11 = new class69();
                        var11.field798 = field1041;
                        var11.field800 = var8;
                        var11.field799 = var9;
                        var11.field803 = field990;
                        var11.field808 = field1041.field2913;
                        class82.method2061(var11);
                    }
                    if (field990 != null && method4308(field1041) != null) {
                        class185 var12 = class185.method267(class182.field2466, field958.field1485);
                        var12.field2505.method3190(field990.field2943);
                        var12.field2505.method3216(field990.field2824);
                        var12.field2505.method3238(field1041.field2824);
                        var12.field2505.method3405(field1041.field2826);
                        var12.field2505.method3190(field1041.field2943);
                        var12.field2505.method3240(field990.field2826);
                        field958.method1882(var12);
                    }
                } else if (this.method1150()) {
                    this.method1151(field1050 + field1043, field883 + field1115);
                } else if (field1004 > 0) {
                    int var13 = field1050 + field1043;
                    int var14 = field883 + field1115;
                    class88 var15 = Statics.field1422;
                    method3488(var15.field1339, var15.field1340, var15.field1341, var15.field1342, var15.field1343, var15.field1343, var13, var14);
                    Statics.field1422 = null;
                }
                field1041 = null;
            }
        } else if (Statics.field661 > 1) {
            field1041 = null;
        }
    }

    @ObfuscatedName("kp.iq(Lin;I)V")
    public static void method5068(class243 arg0) {
        if (field1072 == arg0.field2955) {
            field1073[arg0.field2954] = true;
        }
    }

    @ObfuscatedName("ig.jz(B)V")
    public static void method4138() {
        for (class68 var0 = (class68) field1031.method3641(); var0 != null; var0 = (class68) field1031.method3640()) {
            int var1 = var0.field790;
            if (class243.method3175(var1)) {
                boolean var2 = true;
                class243[] var3 = Statics.field812[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2822;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2652;
                    class243 var6 = class243.method577(var5);
                    if (var6 != null) {
                        method5068(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.jf(Lin;I)Lin;")
    public static class243 method495(class243 arg0) {
        class243 var1 = method4308(arg0);
        if (var1 == null) {
            var1 = arg0.field2898;
        }
        return var1;
    }

    @ObfuscatedName("x.jv(II)V")
    public static final void method39(int arg0) {
        if (!class243.method3175(arg0)) {
            return;
        }
        class243[] var1 = Statics.field812[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class243 var3 = var1[var2];
            if (var3 != null) {
                var3.field2936 = 0;
                var3.field2946 = 0;
            }
        }
    }

    @ObfuscatedName("aw.jn([Lin;IB)V")
    public static final void method651(class243[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class243 var3 = arg0[var2];
            if (var3 != null && var3.field2899 == arg1) {
                if (var3.field2822) {
                    boolean var4 = var3.field2843;
                    if (var4) {
                        continue;
                    }
                }
                if (var3.field2825 == 0) {
                    if (!var3.field2822) {
                        boolean var5 = var3.field2843;
                        if (var5 && Statics.field260 != var3) {
                            continue;
                        }
                    }
                    method651(arg0, var3.field2826);
                    if (var3.field2947 != null) {
                        method651(var3.field2947, var3.field2826);
                    }
                    class68 var6 = (class68) field1031.method3637((long) var3.field2826);
                    if (var6 != null) {
                        int var7 = var6.field790;
                        if (class243.method3175(var7)) {
                            method651(Statics.field812[var7], -1);
                        }
                    }
                }
                if (var3.field2825 == 6) {
                    if (var3.field2870 != -1 || var3.field2856 != -1) {
                        boolean var8 = method234(var3);
                        int var9;
                        if (var8) {
                            var9 = var3.field2856;
                        } else {
                            var9 = var3.field2870;
                        }
                        if (var9 != -1) {
                            class288 var10 = class288.method1535(var9);
                            var3.field2946 += field931;
                            while (var3.field2946 > var10.field3764[var3.field2936]) {
                                var3.field2946 -= var10.field3764[var3.field2936];
                                var3.field2936++;
                                if (var3.field2936 >= var10.field3758.length) {
                                    var3.field2936 -= var10.field3762;
                                    if (var3.field2936 < 0 || var3.field2936 >= var10.field3758.length) {
                                        var3.field2936 = 0;
                                    }
                                }
                                method5068(var3);
                            }
                        }
                    }
                    if (var3.field2905 != 0 && !var3.field2822) {
                        int var11 = var3.field2905 >> 16;
                        int var12 = var3.field2905 << 16 >> 16;
                        int var13 = field931 * var11;
                        int var14 = field931 * var12;
                        var3.field2812 = var3.field2812 + var13 & 0x7FF;
                        var3.field2875 = var3.field2875 + var14 & 0x7FF;
                        method5068(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.ju(II)V")
    public static final void method131(int arg0) {
        method4138();
        for (class81 var1 = (class81) class81.field1264.method3707(); var1 != null; var1 = (class81) class81.field1264.method3697()) {
            if (var1.field1273 != null) {
                var1.method1649();
            }
        }
        int var2 = class269.method2870(arg0).field3453;
        if (var2 == 0) {
            return;
        }
        int var3 = class238.field2779[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class135.method2575(0.9D);
                ((class124) Statics.field1950).method2358(0.9D);
            }
            if (var3 == 2) {
                class135.method2575(0.8D);
                ((class124) Statics.field1950).method2358(0.8D);
            }
            if (var3 == 3) {
                class135.method2575(0.7D);
                ((class124) Statics.field1950).method2358(0.7D);
            }
            if (var3 == 4) {
                class135.method2575(0.6D);
                ((class124) Statics.field1950).method2358(0.6D);
            }
            class284.field3650.method3604();
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
            if (field997 != var4) {
                if (field997 == 0 && field1027 != -1) {
                    class230.method3130(Statics.field2606, field1027, 0, var4, false);
                    field1103 = false;
                } else if (var4 == 0) {
                    class230.method2916();
                    field1103 = false;
                } else {
                    class230.method5223(var4);
                }
                field997 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field1076 = 127;
            }
            if (var3 == 1) {
                field1076 = 96;
            }
            if (var3 == 2) {
                field1076 = 64;
            }
            if (var3 == 3) {
                field1076 = 32;
            }
            if (var3 == 4) {
                field1076 = 0;
            }
        }
        if (var2 == 5) {
            field1005 = var3;
        }
        if (var2 == 6) {
            field1032 = var3;
        }
        if (var2 == 9) {
            field1097 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field952 = 127;
            }
            if (var3 == 1) {
                field952 = 96;
            }
            if (var3 == 2) {
                field952 = 64;
            }
            if (var3 == 3) {
                field952 = 32;
            }
            if (var3 == 4) {
                field952 = 0;
            }
        }
        if (var2 == 17) {
            field1049 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field998 = (class90) class190.method4146(class90.method579(), var3);
            if (field998 == null) {
                field998 = class90.field1351;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field1113 = -1;
            } else {
                field1113 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field1011 = (class90) class190.method4146(class90.method579(), var3);
            if (field1011 == null) {
                field1011 = class90.field1351;
            }
        }
    }

    @ObfuscatedName("cw.jh(Lin;I)V")
    public static final void method1738(class243 arg0) {
        int var1 = arg0.field2827;
        if (var1 == 324) {
            if (field1045 == -1) {
                field1045 = arg0.field2858;
                field1139 = arg0.field2859;
            }
            if (field1133.field2791) {
                arg0.field2858 = field1045;
            } else {
                arg0.field2858 = field1139;
            }
        } else if (var1 == 325) {
            if (field1045 == -1) {
                field1045 = arg0.field2858;
                field1139 = arg0.field2859;
            }
            if (field1133.field2791) {
                arg0.field2858 = field1139;
            } else {
                arg0.field2858 = field1045;
            }
        } else if (var1 == 327) {
            arg0.field2812 = 150;
            arg0.field2875 = (int) (Math.sin((double) field929 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2866 = 5;
            arg0.field2867 = 0;
        } else if (var1 == 328) {
            arg0.field2812 = 150;
            arg0.field2875 = (int) (Math.sin((double) field929 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2866 = 5;
            arg0.field2867 = 1;
        }
    }

    @ObfuscatedName("iq.jx(IIII)Lbt;")
    public static final class68 method4152(int arg0, int arg1, int arg2) {
        class68 var3 = new class68();
        var3.field790 = arg1;
        var3.field789 = arg2;
        field1031.method3638(var3, (long) arg0);
        method39(arg1);
        class243 var4 = class243.method577(arg0);
        method5068(var4);
        if (field1034 != null) {
            method5068(field1034);
            field1034 = null;
        }
        method996();
        method1733(Statics.field812[arg0 >> 16], var4, false);
        class82.method158(arg1);
        if (field1016 != -1) {
            method1856(field1016, 1);
        }
        return var3;
    }

    @ObfuscatedName("bs.jb(Lbt;ZB)V")
    public static final void method757(class68 arg0, boolean arg1) {
        int var2 = arg0.field790;
        int var3 = (int) arg0.field2652;
        arg0.method3681();
        if (arg1 && var2 != -1 && Statics.field2158[var2]) {
            Statics.field2137.method4172(var2);
            if (Statics.field812[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field812[var2].length; var5++) {
                    if (Statics.field812[var2][var5] != null) {
                        if (Statics.field812[var2][var5].field2825 == 2) {
                            var4 = false;
                        } else {
                            Statics.field812[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field812[var2] = null;
                }
                Statics.field2158[var2] = false;
            }
        }
        for (class224 var6 = (class224) field1070.method3641(); var6 != null; var6 = (class224) field1070.method3640()) {
            if ((var6.field2652 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3681();
            }
        }
        class243 var7 = class243.method577(var3);
        if (var7 != null) {
            method5068(var7);
        }
        method996();
        if (field1016 != -1) {
            method1856(field1016, 1);
        }
    }

    @ObfuscatedName("c.jw(Lin;IIII)V")
    public static final void method191(class243 arg0, int arg1, int arg2, int arg3) {
        class237 var4 = arg0.method4064(false);
        if (var4 == null) {
            return;
        }
        if (field1100 < 3) {
            Statics.field238.method5436(arg1, arg2, var4.field2774, var4.field2773, 25, 25, field1044, 256, var4.field2775, var4.field2772);
        } else {
            class328.method5310(arg1, arg2, 0, var4.field2775, var4.field2772);
        }
    }

    @ObfuscatedName("eo.jm(IIIILld;Lik;I)V")
    public static final void method2623(int arg0, int arg1, int arg2, int arg3, class332 arg4, class237 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method510(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field1044 & 0x7FF;
        int var8 = class135.field1963[var7];
        int var9 = class135.field1964[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2774 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field932.method5437(arg5.field2774 / 2 + arg0 - var17 / 2 + var15, arg5.field2773 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("av.jq(IIIILld;Lik;B)V")
    public static final void method510(int arg0, int arg1, int arg2, int arg3, class332 arg4, class237 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field1044 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class135.field1963[var6];
        int var9 = class135.field1964[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5435(arg5.field2774 / 2 + var10 - arg4.field3987 / 2, arg5.field2773 / 2 - var11 - arg4.field3990 / 2, arg0, arg1, arg5.field2774, arg5.field2773, arg5.field2775, arg5.field2772);
        } else {
            arg4.method5514(arg5.field2774 / 2 + arg0 + var10 - arg4.field3987 / 2, arg5.field2773 / 2 + arg1 - var11 - arg4.field3990 / 2);
        }
    }

    @ObfuscatedName("gb.jg(I)V")
    public static final void method3434() {
        class96.method1527();
        if (Statics.field696 != null) {
            Statics.field696.method5045();
        }
    }

    @ObfuscatedName("ax.je(I)V")
    public static final void method525() {
        for (int var0 = 0; var0 < class94.field1432; var0++) {
            class73 var1 = field986[class94.field1437[var0]];
            var1.method1078();
        }
    }

    @ObfuscatedName("bw.jk(I)V")
    public static final void method1135() {
        field1061 = field1066;
    }

    @ObfuscatedName("l.jj(Ljava/lang/String;B)V")
    public static final void method69(String arg0) {
        if (Statics.field696 != null) {
            class185 var1 = class185.method267(class182.field2393, field958.field1485);
            var1.field2505.method3189(class195.method451(arg0));
            var1.field2505.method3214(arg0);
            field958.method1882(var1);
        }
    }

    @ObfuscatedName("dn.jl(B)V")
    public static final void method2444() {
        class185 var0 = class185.method267(class182.field2399, field958.field1485);
        var0.field2505.method3189(0);
        field958.method1882(var0);
    }

    @ObfuscatedName("dn.jt(Lin;I)I")
    public static int method2446(class243 arg0) {
        class224 var1 = (class224) field1070.method3637(((long) arg0.field2826 << 32) + (long) arg0.field2824);
        return var1 == null ? arg0.field2914 : var1.field2669;
    }

    @ObfuscatedName("jh.jp(Lin;I)Lin;")
    public static class243 method4308(class243 arg0) {
        int var1 = class244.method1647(method2446(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class243.method577(arg0.field2899);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("jx.jy(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method4329(String arg0, boolean arg1) {
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
        if (Statics.field658 != null) {
            var3 = "/p=" + Statics.field658;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field980 + "/a=" + Statics.field796 + var3 + "/";
    }

    @ObfuscatedName("n.jd(Ljava/lang/String;ZI)V")
    public static void method61(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1584; var5++) {
            class284 var6 = class284.method660(var5);
            if ((!arg1 || var6.field3693) && var6.field3685 == -1 && var6.field3674.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field738 = -1;
                    Statics.field1249 = null;
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
        Statics.field1249 = var3;
        Statics.field1288 = 0;
        Statics.field738 = var4;
        String[] var9 = new String[Statics.field738];
        for (int var10 = 0; var10 < Statics.field738; var10++) {
            var9[var10] = class284.method660(var3[var10]).field3674;
        }
        short[] var11 = Statics.field1249;
        class192.method3440(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("ju.jc([BII)V")
    public static void method4298(byte[] arg0, int arg1) {
        if (field909 == null) {
            field909 = new byte[24];
        }
        class206.method3509(arg0, arg1, field909, 0, 24);
    }

    @ObfuscatedName("ih.ja(Lgc;IB)V")
    public static void method4145(class195 arg0, int arg1) {
        method4298(arg0.field2574, arg1);
        class168.method2075(arg0, arg1);
    }

    @ObfuscatedName("client.jo(B)Lkz;")
    public class306 method1155() {
        return Statics.field642 == null ? null : Statics.field642.field842;
    }

    @ObfuscatedName("j.ji(IIIZB)V")
    public static void method155(int arg0, int arg1, int arg2, boolean arg3) {
        class185 var4 = class185.method267(class182.field2458, field958.field1485);
        var4.field2505.method3247(arg3 ? field971 : 0);
        var4.field2505.method3216(arg0);
        var4.field2505.method3231(arg2);
        var4.field2505.method3190(arg1);
        field958.method1882(var4);
    }

    @ObfuscatedName("l.jr(I)V")
    public static void method77() {
        field958.method1882(class185.method267(class182.field2478, field958.field1485));
        field961 = 0;
    }

    @ObfuscatedName("u.kj(I)V")
    public static void method31() {
        if (field961 == 1) {
            field1062 = true;
        }
    }

    @ObfuscatedName("kp.ke(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method5067(String arg0) {
        class257[] var1 = new class257[] { class257.field3346, class257.field3345, class257.field3347, class257.field3350, class257.field3351, class257.field3348 };
        class257[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class257 var4 = var2[var3];
            if (var4.field3349 != -1) {
                int var6 = var4.field3349;
                String var7 = "<img=" + var6 + ">";
                if (arg0.startsWith(var7)) {
                    arg0 = arg0.substring(6 + Integer.toString(var4.field3349).length());
                    break;
                }
            }
        }
        return arg0;
    }
}
