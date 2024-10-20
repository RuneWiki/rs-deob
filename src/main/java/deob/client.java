package deob;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class60 implements class303 {

    @ObfuscatedName("client.w")
    public static class177[] field886 = new class177[4];

    @ObfuscatedName("client.av")
    public static boolean field879 = true;

    @ObfuscatedName("client.bc")
    public static int field1084 = 1;

    @ObfuscatedName("client.br")
    public static int field858 = 0;

    @ObfuscatedName("client.bl")
    public static int field860 = 0;

    @ObfuscatedName("client.bz")
    public static boolean field1031 = false;

    @ObfuscatedName("client.bt")
    public static boolean field862 = false;

    @ObfuscatedName("client.bm")
    public static int field863 = 0;

    @ObfuscatedName("client.bn")
    public static int field986 = 0;

    @ObfuscatedName("client.bw")
    public static boolean field1069 = true;

    @ObfuscatedName("client.bg")
    public static int field866 = 0;

    @ObfuscatedName("client.bi")
    public static long field867 = 1L;

    @ObfuscatedName("client.bv")
    public static int field911 = -1;

    @ObfuscatedName("client.ba")
    public static int field869 = -1;

    @ObfuscatedName("client.bd")
    public static int field870 = -1;

    @ObfuscatedName("client.bp")
    public static boolean field865 = true;

    @ObfuscatedName("client.bh")
    public static boolean field1034 = false;

    @ObfuscatedName("client.bk")
    public static int field1070 = 0;

    @ObfuscatedName("client.bo")
    public static int field901 = 0;

    @ObfuscatedName("client.bq")
    public static int field875 = 0;

    @ObfuscatedName("client.cg")
    public static int field1083 = 0;

    @ObfuscatedName("client.cd")
    public static int field1095 = 0;

    @ObfuscatedName("client.cl")
    public static int field878 = 0;

    @ObfuscatedName("client.co")
    public static int field885 = 0;

    @ObfuscatedName("client.cs")
    public static int field936 = 0;

    @ObfuscatedName("client.ci")
    public static int field881 = 0;

    @ObfuscatedName("client.ce")
    public static class90 field882 = class90.field1329;

    @ObfuscatedName("client.ck")
    public static class90 field883 = class90.field1329;

    @ObfuscatedName("client.cn")
    public static int field884 = 0;

    @ObfuscatedName("client.cw")
    public static int field949 = 0;

    @ObfuscatedName("client.cp")
    public static int field874 = 0;

    @ObfuscatedName("client.dq")
    public static int field888 = 0;

    @ObfuscatedName("client.dm")
    public static int field889 = 0;

    @ObfuscatedName("client.ds")
    public static int field1077 = 0;

    @ObfuscatedName("client.dn")
    public static int field891 = 0;

    @ObfuscatedName("client.dp")
    public static int field892 = 0;

    @ObfuscatedName("client.dr")
    public static class159 field1041 = class159.field2146;

    @ObfuscatedName("client.di")
    public static byte[] field890 = null;

    @ObfuscatedName("client.dz")
    public static class85[] field1035 = new class85[32768];

    @ObfuscatedName("client.dv")
    public static int field896 = 0;

    @ObfuscatedName("client.du")
    public static int[] field897 = new int[32768];

    @ObfuscatedName("client.dy")
    public static int field868 = 0;

    @ObfuscatedName("client.ew")
    public static int[] field899 = new int[250];

    @ObfuscatedName("client.ex")
    public static final class100 field900 = new class100();

    @ObfuscatedName("client.eu")
    public static int field887 = 0;

    @ObfuscatedName("client.ej")
    public static boolean field902 = false;

    @ObfuscatedName("client.ec")
    public static boolean field903 = true;

    @ObfuscatedName("client.ef")
    public static class295 field1078 = new class295();

    @ObfuscatedName("client.ea")
    public static HashMap field1082 = new HashMap();

    @ObfuscatedName("client.er")
    public static int field1106 = 0;

    @ObfuscatedName("client.ee")
    public static int field907 = 1;

    @ObfuscatedName("client.en")
    public static int field908 = 0;

    @ObfuscatedName("client.ev")
    public static int field909 = 1;

    @ObfuscatedName("client.eg")
    public static int field910 = 0;

    @ObfuscatedName("client.fs")
    public static boolean field983 = false;

    @ObfuscatedName("client.fm")
    public static int[][][] field913 = new int[4][13][13];

    @ObfuscatedName("client.fa")
    public static final int[] field914 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.ft")
    public static int field915 = 0;

    @ObfuscatedName("client.fk")
    public static int field990 = 2301979;

    @ObfuscatedName("client.fn")
    public static int field917 = 5063219;

    @ObfuscatedName("client.gs")
    public static int field918 = 3353893;

    @ObfuscatedName("client.gh")
    public static int field956 = 7759444;

    @ObfuscatedName("client.gl")
    public static boolean field1025 = false;

    @ObfuscatedName("client.ga")
    public static int field921 = 0;

    @ObfuscatedName("client.gn")
    public static int field880 = 128;

    @ObfuscatedName("client.gy")
    public static int field923 = 0;

    @ObfuscatedName("client.gv")
    public static int field924 = 0;

    @ObfuscatedName("client.gq")
    public static int field1097 = 0;

    @ObfuscatedName("client.gp")
    public static int field926 = 0;

    @ObfuscatedName("client.gg")
    public static int field927 = 0;

    @ObfuscatedName("client.gi")
    public static int field928 = 0;

    @ObfuscatedName("client.gr")
    public static int field929 = 50;

    @ObfuscatedName("client.gt")
    public static int field893 = 0;

    @ObfuscatedName("client.gf")
    public static int field898 = 0;

    @ObfuscatedName("client.gw")
    public static int field932 = 0;

    @ObfuscatedName("client.gz")
    public static int field933 = 0;

    @ObfuscatedName("client.hq")
    public static boolean field934 = false;

    @ObfuscatedName("client.hd")
    public static int field935 = 0;

    @ObfuscatedName("client.hb")
    public static boolean field1121 = false;

    @ObfuscatedName("client.hg")
    public static int field937 = 0;

    @ObfuscatedName("client.hp")
    public static int field864 = 0;

    @ObfuscatedName("client.hw")
    public static int field939 = 50;

    @ObfuscatedName("client.he")
    public static int[] field940 = new int[field939];

    @ObfuscatedName("client.hs")
    public static int[] field941 = new int[field939];

    @ObfuscatedName("client.ho")
    public static int[] field1086 = new int[field939];

    @ObfuscatedName("client.hv")
    public static int[] field943 = new int[field939];

    @ObfuscatedName("client.hu")
    public static int[] field944 = new int[field939];

    @ObfuscatedName("client.hf")
    public static int[] field916 = new int[field939];

    @ObfuscatedName("client.hh")
    public static int[] field972 = new int[field939];

    @ObfuscatedName("client.ha")
    public static String[] field947 = new String[field939];

    @ObfuscatedName("client.hx")
    public static int[][] field948 = new int[104][104];

    @ObfuscatedName("client.hm")
    public static int field1109 = 0;

    @ObfuscatedName("client.hy")
    public static int field950 = -1;

    @ObfuscatedName("client.hj")
    public static int field951 = -1;

    @ObfuscatedName("client.hr")
    public static int field952 = 0;

    @ObfuscatedName("client.hn")
    public static int field931 = 0;

    @ObfuscatedName("client.hi")
    public static int field954 = 0;

    @ObfuscatedName("client.hc")
    public static int field876 = 0;

    @ObfuscatedName("client.hl")
    public static boolean field979 = true;

    @ObfuscatedName("client.hz")
    public static int field957 = 0;

    @ObfuscatedName("client.ht")
    public static int field958 = 0;

    @ObfuscatedName("client.ik")
    public static int field959 = 0;

    @ObfuscatedName("client.id")
    public static int field1049 = 0;

    @ObfuscatedName("client.ic")
    public static int field961 = 0;

    @ObfuscatedName("client.ij")
    public static int field919 = 0;

    @ObfuscatedName("client.in")
    public static boolean field963 = false;

    @ObfuscatedName("client.ia")
    public static int field964 = 0;

    @ObfuscatedName("client.iw")
    public static int field965 = 0;

    @ObfuscatedName("client.im")
    public static boolean field966 = true;

    @ObfuscatedName("client.il")
    public static class73[] field967 = new class73[2048];

    @ObfuscatedName("client.ii")
    public static int field1091 = -1;

    @ObfuscatedName("client.ie")
    public static int field969 = 0;

    @ObfuscatedName("client.iv")
    public static boolean field970 = true;

    @ObfuscatedName("client.iq")
    public static int field989 = 0;

    @ObfuscatedName("client.it")
    public static String field1005 = null;

    @ObfuscatedName("client.jt")
    public static int field999 = 0;

    @ObfuscatedName("client.jk")
    public static int[] field973 = new int[1000];

    @ObfuscatedName("client.js")
    public static final int[] field974 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.jv")
    public static String[] field975 = new String[8];

    @ObfuscatedName("client.jj")
    public static boolean[] field976 = new boolean[8];

    @ObfuscatedName("client.jh")
    public static int[] field977 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.jp")
    public static int field1104 = -1;

    @ObfuscatedName("client.jo")
    public static class218[][][] field962 = new class218[4][104][104];

    @ObfuscatedName("client.jw")
    public static class218 field980 = new class218();

    @ObfuscatedName("client.jr")
    public static class218 field871 = new class218();

    @ObfuscatedName("client.ju")
    public static class218 field1001 = new class218();

    @ObfuscatedName("client.jq")
    public static int[] field906 = new int[25];

    @ObfuscatedName("client.jy")
    public static int[] field984 = new int[25];

    @ObfuscatedName("client.je")
    public static int[] field985 = new int[25];

    @ObfuscatedName("client.jc")
    public static int field925 = 0;

    @ObfuscatedName("client.jl")
    public static boolean field987 = false;

    @ObfuscatedName("client.jd")
    public static int field1075 = 0;

    @ObfuscatedName("client.jx")
    public static int[] field1047 = new int[500];

    @ObfuscatedName("client.jz")
    public static int[] field953 = new int[500];

    @ObfuscatedName("client.jg")
    public static int[] field991 = new int[500];

    @ObfuscatedName("client.kg")
    public static int[] field992 = new int[500];

    @ObfuscatedName("client.ki")
    public static String[] field988 = new String[500];

    @ObfuscatedName("client.kk")
    public static String[] field994 = new String[500];

    @ObfuscatedName("client.kc")
    public static boolean[] field995 = new boolean[500];

    @ObfuscatedName("client.ka")
    public static boolean field938 = false;

    @ObfuscatedName("client.kh")
    public static boolean field997 = false;

    @ObfuscatedName("client.kt")
    public static boolean field998 = false;

    @ObfuscatedName("client.ky")
    public static boolean field1050 = true;

    @ObfuscatedName("client.ku")
    public static int field1000 = -1;

    @ObfuscatedName("client.km")
    public static int field920 = -1;

    @ObfuscatedName("client.kb")
    public static int field1002 = 0;

    @ObfuscatedName("client.kz")
    public static int field1003 = 50;

    @ObfuscatedName("client.kf")
    public static int field1004 = 0;

    @ObfuscatedName("client.kv")
    public static boolean field1006 = false;

    @ObfuscatedName("client.ke")
    public static int field1043 = -1;

    @ObfuscatedName("client.kd")
    public static int field1008 = -1;

    @ObfuscatedName("client.kr")
    public static String field1098 = null;

    @ObfuscatedName("client.kp")
    public static String field942 = null;

    @ObfuscatedName("client.kw")
    public static int field1011 = -1;

    @ObfuscatedName("client.lk")
    public static class215 field1012 = new class215(8);

    @ObfuscatedName("client.le")
    public static int field1013 = 0;

    @ObfuscatedName("client.lz")
    public static int field1014 = 0;

    @ObfuscatedName("client.ld")
    public static class243 field1015 = null;

    @ObfuscatedName("client.lg")
    public static int field1016 = 0;

    @ObfuscatedName("client.la")
    public static int field1017 = 0;

    @ObfuscatedName("client.lw")
    public static int field1018 = 0;

    @ObfuscatedName("client.lf")
    public static int field1009 = -1;

    @ObfuscatedName("client.lh")
    public static boolean field1020 = false;

    @ObfuscatedName("client.ll")
    public static class243 field1021 = null;

    @ObfuscatedName("client.lm")
    public static class243 field1022 = null;

    @ObfuscatedName("client.lj")
    public static class243 field1023 = null;

    @ObfuscatedName("client.lo")
    public static int field1024 = 0;

    @ObfuscatedName("client.lu")
    public static int field1057 = 0;

    @ObfuscatedName("client.lx")
    public static class243 field1026 = null;

    @ObfuscatedName("client.lc")
    public static boolean field1027 = false;

    @ObfuscatedName("client.lr")
    public static int field1028 = -1;

    @ObfuscatedName("client.lb")
    public static int field1029 = -1;

    @ObfuscatedName("client.lv")
    public static boolean field1030 = false;

    @ObfuscatedName("client.ly")
    public static int field946 = -1;

    @ObfuscatedName("client.li")
    public static int field1032 = -1;

    @ObfuscatedName("client.ls")
    public static boolean field1033 = false;

    @ObfuscatedName("client.mb")
    public static int field857 = 1;

    @ObfuscatedName("client.mm")
    public static int[] field1055 = new int[32];

    @ObfuscatedName("client.mg")
    public static int field1113 = 0;

    @ObfuscatedName("client.mc")
    public static int[] field1037 = new int[32];

    @ObfuscatedName("client.ms")
    public static int field1038 = 0;

    @ObfuscatedName("client.mn")
    public static int[] field1039 = new int[32];

    @ObfuscatedName("client.mr")
    public static int field1040 = 0;

    @ObfuscatedName("client.mq")
    public static int field1080 = 0;

    @ObfuscatedName("client.mp")
    public static int field1042 = 0;

    @ObfuscatedName("client.mh")
    public static int field1036 = 0;

    @ObfuscatedName("client.mo")
    public static int field945 = 0;

    @ObfuscatedName("client.mw")
    public static int field1045 = 0;

    @ObfuscatedName("client.mv")
    public static int field1046 = 0;

    @ObfuscatedName("client.me")
    public static int field1103 = 0;

    @ObfuscatedName("client.mt")
    public static class218 field1048 = new class218();

    @ObfuscatedName("client.ma")
    public static class218 field1019 = new class218();

    @ObfuscatedName("client.mx")
    public static class218 field978 = new class218();

    @ObfuscatedName("client.mi")
    public static class215 field1051 = new class215(512);

    @ObfuscatedName("client.mu")
    public static int field1052 = 0;

    @ObfuscatedName("client.mf")
    public static int field1053 = -2;

    @ObfuscatedName("client.mz")
    public static boolean[] field1054 = new boolean[100];

    @ObfuscatedName("client.nv")
    public static boolean[] field1044 = new boolean[100];

    @ObfuscatedName("client.nh")
    public static boolean[] field1056 = new boolean[100];

    @ObfuscatedName("client.nz")
    public static int[] field930 = new int[100];

    @ObfuscatedName("client.nt")
    public static int[] field1058 = new int[100];

    @ObfuscatedName("client.nn")
    public static int[] field1059 = new int[100];

    @ObfuscatedName("client.nx")
    public static int[] field1060 = new int[100];

    @ObfuscatedName("client.ng")
    public static int field1061 = 0;

    @ObfuscatedName("client.nc")
    public static long field1062 = 0L;

    @ObfuscatedName("client.ns")
    public static boolean field1063 = true;

    @ObfuscatedName("client.nr")
    public static int[] field1064 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.nl")
    public static int field873 = 0;

    @ObfuscatedName("client.nw")
    public static int field1066 = 0;

    @ObfuscatedName("client.ni")
    public static String field1067 = "";

    @ObfuscatedName("client.no")
    public static long[] field1068 = new long[100];

    @ObfuscatedName("client.nk")
    public static int field922 = 0;

    @ObfuscatedName("client.nj")
    public static int field981 = 0;

    @ObfuscatedName("client.ne")
    public static int[] field1071 = new int[128];

    @ObfuscatedName("client.os")
    public static int[] field1072 = new int[128];

    @ObfuscatedName("client.oe")
    public static long field1073 = -1L;

    @ObfuscatedName("client.oz")
    public static int field1074 = -1;

    @ObfuscatedName("client.oc")
    public static int field1007 = 0;

    @ObfuscatedName("client.oq")
    public static int[] field1076 = new int[1000];

    @ObfuscatedName("client.oa")
    public static int[] field1065 = new int[1000];

    @ObfuscatedName("client.on")
    public static class332[] field1099 = new class332[1000];

    @ObfuscatedName("client.ot")
    public static int field1079 = 0;

    @ObfuscatedName("client.oi")
    public static int field1112 = 0;

    @ObfuscatedName("client.or")
    public static int field1081 = 0;

    @ObfuscatedName("client.ox")
    public static int field982 = 255;

    @ObfuscatedName("client.of")
    public static int field1116 = -1;

    @ObfuscatedName("client.ov")
    public static boolean field971 = false;

    @ObfuscatedName("client.oy")
    public static int field1085 = 127;

    @ObfuscatedName("client.oo")
    public static int field912 = 127;

    @ObfuscatedName("client.pw")
    public static int field1087 = 0;

    @ObfuscatedName("client.pp")
    public static int[] field1088 = new int[50];

    @ObfuscatedName("client.po")
    public static int[] field1089 = new int[50];

    @ObfuscatedName("client.py")
    public static int[] field1090 = new int[50];

    @ObfuscatedName("client.pk")
    public static int[] field905 = new int[50];

    @ObfuscatedName("client.pm")
    public static class104[] field960 = new class104[50];

    @ObfuscatedName("client.pd")
    public static boolean field1093 = false;

    @ObfuscatedName("client.pz")
    public static boolean[] field1094 = new boolean[5];

    @ObfuscatedName("client.pj")
    public static int[] field996 = new int[5];

    @ObfuscatedName("client.pb")
    public static int[] field895 = new int[5];

    @ObfuscatedName("client.pv")
    public static int[] field904 = new int[5];

    @ObfuscatedName("client.pr")
    public static int[] field1092 = new int[5];

    @ObfuscatedName("client.qy")
    public static short field872 = 256;

    @ObfuscatedName("client.qp")
    public static short field1100 = 205;

    @ObfuscatedName("client.qo")
    public static short field1101 = 256;

    @ObfuscatedName("client.qg")
    public static short field1102 = 320;

    @ObfuscatedName("client.qa")
    public static short field894 = 1;

    @ObfuscatedName("client.qw")
    public static short field861 = 32767;

    @ObfuscatedName("client.qv")
    public static short field1105 = 1;

    @ObfuscatedName("client.qi")
    public static short field993 = 32767;

    @ObfuscatedName("client.qx")
    public static int field1107 = 0;

    @ObfuscatedName("client.qh")
    public static int field1108 = 0;

    @ObfuscatedName("client.qj")
    public static int field877 = 0;

    @ObfuscatedName("client.qn")
    public static int field1110 = 0;

    @ObfuscatedName("client.qu")
    public static int field1111 = 0;

    @ObfuscatedName("client.qs")
    public static class240 field1010 = new class240();

    @ObfuscatedName("client.qq")
    public static int field968 = -1;

    @ObfuscatedName("client.qd")
    public static int field1114 = -1;

    @ObfuscatedName("client.qr")
    public static class17[] field1115 = new class17[8];

    @ObfuscatedName("client.qb")
    public static class74 field859 = new class74();

    @ObfuscatedName("client.rd")
    public static int field1117 = -1;

    @ObfuscatedName("client.rx")
    public static ArrayList field1118 = new ArrayList(10);

    @ObfuscatedName("client.ru")
    public static int field1119 = 0;

    @ObfuscatedName("client.rz")
    public static final class72 field1120 = new class72();

    @ObfuscatedName("client.rp")
    public static int[] field1096 = new int[50];

    @ObfuscatedName("client.rf")
    public static int[] field1122 = new int[50];

    @ObfuscatedName("ea.ec(I)Llp;")
    public static class335 method2904() {
        return Statics.field3008;
    }

    @ObfuscatedName("client.ax(B)V")
    public final void method769() {
    }

    public final void init() {
        if (!this.method762()) {
            return;
        }
        class294[] var1 = new class294[] { class294.field3810, class294.field3804, class294.field3800, class294.field3802, class294.field3797, class294.field3795, class294.field3807, class294.field3801, class294.field3798, class294.field3799, class294.field3811, class294.field3796, class294.field3809, class294.field3808, class294.field3803, class294.field3805 };
        class294[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class294 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3794);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3794)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class87.field1311)) {
                        }
                        break;
                    case 2:
                        Statics.field760 = Integer.parseInt(var5);
                        break;
                    case 3:
                        field858 = Integer.parseInt(var5);
                        break;
                    case 4:
                        field863 = Integer.parseInt(var5);
                        break;
                    case 5:
                        Statics.field2119 = (class259) class190.method500(class259.method471(), Integer.parseInt(var5));
                        if (Statics.field2119 == class259.field3353) {
                            Statics.field347 = class336.field4067;
                        } else {
                            Statics.field347 = class336.field4071;
                        }
                        break;
                    case 6:
                        if (var5.equalsIgnoreCase(class87.field1311)) {
                            field1031 = true;
                        } else {
                            field1031 = false;
                        }
                        break;
                    case 7:
                        field903 = Integer.parseInt(var5) != 0;
                        break;
                    case 8:
                        Statics.field564 = class258.method4246(Integer.parseInt(var5));
                        break;
                    case 9:
                        Statics.field2603 = Integer.parseInt(var5);
                    case 10:
                    case 12:
                    default:
                        break;
                    case 11:
                        Statics.field376 = var5;
                        break;
                    case 13:
                        Statics.field614 = var5;
                        break;
                    case 14:
                        field860 = Integer.parseInt(var5);
                        break;
                    case 15:
                        field1084 = Integer.parseInt(var5);
                }
            }
        }
        class138.field1992 = false;
        field862 = false;
        Statics.field249 = this.getCodeBase().getHost();
        String var6 = Statics.field564.field3347;
        byte var7 = 0;
        try {
            Statics.field2196 = 17;
            Statics.field656 = var7;
            try {
                Statics.field1138 = System.getProperty("os.name");
            } catch (Exception var28) {
                Statics.field1138 = "Unknown";
            }
            Statics.field2205 = Statics.field1138.toLowerCase();
            try {
                Statics.field1326 = System.getProperty("user.home");
                if (Statics.field1326 != null) {
                    Statics.field1326 = Statics.field1326 + "/";
                }
            } catch (Exception var27) {
            }
            try {
                if (Statics.field2205.startsWith("win")) {
                    if (Statics.field1326 == null) {
                        Statics.field1326 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1326 == null) {
                    Statics.field1326 = System.getenv("HOME");
                }
                if (Statics.field1326 != null) {
                    Statics.field1326 = Statics.field1326 + "/";
                }
            } catch (Exception var26) {
            }
            if (Statics.field1326 == null) {
                Statics.field1326 = "~/";
            }
            Statics.field2202 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1326, "/tmp/", "" };
            Statics.field2195 = new String[] { ".jagex_cache_" + Statics.field656, ".file_store_" + Statics.field656 };
            label164: for (int var11 = 0; var11 < 4; var11++) {
                Statics.field2198 = class168.method2891("oldschool", var6, var11);
                if (!Statics.field2198.exists()) {
                    Statics.field2198.mkdirs();
                }
                File[] var12 = Statics.field2198.listFiles();
                if (var12 == null) {
                    break;
                }
                File[] var13 = var12;
                int var14 = 0;
                while (true) {
                    if (var14 >= var13.length) {
                        break label164;
                    }
                    File var15 = var13[var14];
                    if (!class168.method210(var15, false)) {
                        break;
                    }
                    var14++;
                }
            }
            File var16 = Statics.field2198;
            Statics.field2213 = var16;
            if (!Statics.field2213.exists()) {
                throw new RuntimeException("");
            }
            class171.field2215 = true;
            try {
                File var17 = new File(Statics.field1326, "random.dat");
                if (var17.exists()) {
                    class168.field2199 = new class122(new class123(var17, "rw", 25L), 24, 0);
                } else {
                    label142: for (int var18 = 0; var18 < Statics.field2195.length; var18++) {
                        for (int var19 = 0; var19 < Statics.field2202.length; var19++) {
                            File var20 = new File(Statics.field2202[var19] + Statics.field2195[var18] + File.separatorChar + "random.dat");
                            if (var20.exists()) {
                                class168.field2199 = new class122(new class123(var20, "rw", 25L), 24, 0);
                                break label142;
                            }
                        }
                    }
                }
                if (class168.field2199 == null) {
                    RandomAccessFile var21 = new RandomAccessFile(var17, "rw");
                    int var22 = var21.read();
                    var21.seek(0L);
                    var21.write(var22);
                    var21.seek(0L);
                    var21.close();
                    class168.field2199 = new class122(new class123(var17, "rw", 25L), 24, 0);
                }
            } catch (IOException var29) {
            }
            class168.field2200 = new class122(new class123(class171.method6("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class168.field2201 = new class122(new class123(class171.method6("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field654 = new class122[Statics.field2196];
            for (int var24 = 0; var24 < Statics.field2196; var24++) {
                Statics.field654[var24] = new class122(new class123(class171.method6("main_file_cache.idx" + var24), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var30) {
            class165.method2426((String) null, var30);
        }
        Statics.field357 = this;
        this.method760(765, 503, 165);
    }

    @ObfuscatedName("client.ai(B)V")
    public final void method775() {
        class196.method3122(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field2760 = field860 == 0 ? 43594 : field1084 + 40000;
        Statics.field574 = field860 == 0 ? 443 : field1084 + 50000;
        Statics.field2996 = Statics.field2760;
        Statics.field315 = class241.field2808;
        Statics.field2777 = class241.field2803;
        Statics.field822 = class241.field2804;
        Statics.field2581 = class241.field2805;
        Statics.field578 = new class148();
        this.method754();
        this.method869();
        Statics.field397 = this.method751();
        Statics.field1317 = new class175(255, class168.field2200, class168.field2201, 500000);
        class123 var1 = null;
        class79 var2 = new class79();
        try {
            var1 = class168.method1806("", Statics.field2119.field3357, false);
            byte[] var3 = new byte[(int) var1.method2364()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method2374(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class79(new class195(var3));
        } catch (Exception var12) {
        }
        try {
            if (var1 != null) {
                var1.method2367();
            }
        } catch (Exception var11) {
        }
        Statics.field663 = var2;
        this.method757();
        String var10 = Statics.field426;
        class58.field668 = this;
        if (var10 != null) {
            class58.field669 = var10;
        }
        if (field860 != 0) {
            field1034 = true;
        }
        method4904(Statics.field663.field1226);
        Statics.field1319 = new class80(Statics.field347);
    }

    @ObfuscatedName("client.az(I)V")
    public final void method865() {
        field866++;
        this.method1119();
        class263.method1508();
        class230.method881();
        method3188();
        class52.method2986();
        class61 var1 = class61.field717;
        synchronized (class61.field717) {
            class61.field718 = class61.field719;
            class61.field723 = class61.field720;
            class61.field715 = class61.field721;
            class61.field729 = class61.field730;
            class61.field722 = class61.field726;
            class61.field728 = class61.field727;
            class61.field732 = class61.field725;
            class61.field730 = 0;
        }
        if (Statics.field397 != null) {
            int var3 = Statics.field397.method641();
            field1103 = var3;
        }
        if (field986 == 0) {
            method3076();
            class60.method962();
        } else if (field986 == 5) {
            class91.method2909(this);
            method3076();
            class60.method962();
        } else if (field986 == 10 || field986 == 11) {
            class91.method2909(this);
        } else if (field986 == 20) {
            class91.method2909(this);
            this.method1100();
        } else if (field986 == 25) {
            method4230(false);
            field1106 = 0;
            boolean var4 = true;
            for (int var5 = 0; var5 < Statics.field2571.length; var5++) {
                if (Statics.field476[var5] != -1 && Statics.field2571[var5] == null) {
                    Statics.field2571[var5] = Statics.field3342.method4273(Statics.field476[var5], 0);
                    if (Statics.field2571[var5] == null) {
                        var4 = false;
                        field1106++;
                    }
                }
                if (Statics.field298[var5] != -1 && Statics.field321[var5] == null) {
                    Statics.field321[var5] = Statics.field3342.method4348(Statics.field298[var5], 0, Statics.field2147[var5]);
                    if (Statics.field321[var5] == null) {
                        var4 = false;
                        field1106++;
                    }
                }
            }
            if (var4) {
                field908 = 0;
                boolean var6 = true;
                for (int var7 = 0; var7 < Statics.field2571.length; var7++) {
                    byte[] var8 = Statics.field321[var7];
                    if (var8 != null) {
                        int var9 = (Statics.field464[var7] >> 8) * 64 - Statics.field445;
                        int var10 = (Statics.field464[var7] & 0xFF) * 64 - Statics.field3556;
                        if (field983) {
                            var9 = 10;
                            var10 = 10;
                        }
                        boolean var12 = true;
                        class195 var13 = new class195(var8);
                        int var14 = -1;
                        label534: while (true) {
                            int var15 = var13.method3380();
                            if (var15 == 0) {
                                var6 &= var12;
                                break;
                            }
                            var14 += var15;
                            int var16 = 0;
                            boolean var17 = false;
                            while (true) {
                                while (!var17) {
                                    int var19 = var13.method3380();
                                    if (var19 == 0) {
                                        continue label534;
                                    }
                                    var16 += var19 - 1;
                                    int var20 = var16 & 0x3F;
                                    int var21 = var16 >> 6 & 0x3F;
                                    int var22 = var13.method3330() >> 2;
                                    int var23 = var9 + var21;
                                    int var24 = var10 + var20;
                                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                                        class283 var25 = class283.method3065(var14);
                                        if (var22 != 22 || !field862 || var25.field3608 != 0 || var25.field3616 == 1 || var25.field3632) {
                                            if (!var25.method4707()) {
                                                field908++;
                                                var12 = false;
                                            }
                                            var17 = true;
                                        }
                                    }
                                }
                                int var18 = var13.method3380();
                                if (var18 == 0) {
                                    break;
                                }
                                var13.method3330();
                            }
                        }
                    }
                }
                if (var6) {
                    if (field910 != 0) {
                        method680(class252.field3030 + class87.field1307 + class87.field1305 + 100 + "%" + class87.field1304, true);
                    }
                    method3188();
                    Statics.field1312.method2873();
                    for (int var27 = 0; var27 < 4; var27++) {
                        field886[var27].method3139();
                    }
                    for (int var28 = 0; var28 < 4; var28++) {
                        for (int var29 = 0; var29 < 104; var29++) {
                            for (int var30 = 0; var30 < 104; var30++) {
                                class63.field736[var28][var29][var30] = 0;
                            }
                        }
                    }
                    method3188();
                    class63.field737 = 99;
                    Statics.field2108 = new byte[4][104][104];
                    Statics.field745 = new byte[4][104][104];
                    Statics.field735 = new byte[4][104][104];
                    Statics.field740 = new byte[4][104][104];
                    Statics.field739 = new int[4][105][105];
                    Statics.field741 = new byte[4][105][105];
                    Statics.field742 = new int[105][105];
                    Statics.field328 = new int[104];
                    Statics.field3920 = new int[104];
                    Statics.field322 = new int[104];
                    Statics.field431 = new int[104];
                    Statics.field317 = new int[104];
                    int var31 = Statics.field2571.length;
                    class81.method17();
                    method4230(true);
                    if (!field983) {
                        for (int var32 = 0; var32 < var31; var32++) {
                            int var33 = (Statics.field464[var32] >> 8) * 64 - Statics.field445;
                            int var34 = (Statics.field464[var32] & 0xFF) * 64 - Statics.field3556;
                            byte[] var35 = Statics.field2571[var32];
                            if (var35 != null) {
                                method3188();
                                Statics.method544(var35, var33, var34, Statics.field752 * 8 - 48, Statics.field10 * 8 - 48, field886);
                            }
                        }
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var37 = (Statics.field464[var36] >> 8) * 64 - Statics.field445;
                            int var38 = (Statics.field464[var36] & 0xFF) * 64 - Statics.field3556;
                            byte[] var39 = Statics.field2571[var36];
                            if (var39 == null && Statics.field10 < 800) {
                                method3188();
                                class63.method2918(var37, var38, 64, 64);
                            }
                        }
                        method4230(true);
                        for (int var40 = 0; var40 < var31; var40++) {
                            byte[] var41 = Statics.field321[var40];
                            if (var41 != null) {
                                int var42 = (Statics.field464[var40] >> 8) * 64 - Statics.field445;
                                int var43 = (Statics.field464[var40] & 0xFF) * 64 - Statics.field3556;
                                method3188();
                                class63.method3177(var41, var42, var43, Statics.field1312, field886);
                            }
                        }
                    }
                    if (field983) {
                        int var44 = 0;
                        label452: while (true) {
                            if (var44 >= 4) {
                                for (int var84 = 0; var84 < 13; var84++) {
                                    for (int var85 = 0; var85 < 13; var85++) {
                                        int var86 = field913[0][var84][var85];
                                        if (var86 == -1) {
                                            class63.method2918(var84 * 8, var85 * 8, 8, 8);
                                        }
                                    }
                                }
                                method4230(true);
                                int var87 = 0;
                                while (true) {
                                    if (var87 >= 4) {
                                        break label452;
                                    }
                                    method3188();
                                    for (int var88 = 0; var88 < 13; var88++) {
                                        label375: for (int var89 = 0; var89 < 13; var89++) {
                                            int var90 = field913[var87][var88][var89];
                                            if (var90 != -1) {
                                                int var91 = var90 >> 24 & 0x3;
                                                int var92 = var90 >> 1 & 0x3;
                                                int var93 = var90 >> 14 & 0x3FF;
                                                int var94 = var90 >> 3 & 0x7FF;
                                                int var95 = (var93 / 8 << 8) + var94 / 8;
                                                for (int var96 = 0; var96 < Statics.field464.length; var96++) {
                                                    if (Statics.field464[var96] == var95 && Statics.field321[var96] != null) {
                                                        byte[] var97 = Statics.field321[var96];
                                                        int var98 = var88 * 8;
                                                        int var99 = var89 * 8;
                                                        int var100 = (var93 & 0x7) * 8;
                                                        int var101 = (var94 & 0x7) * 8;
                                                        class138 var102 = Statics.field1312;
                                                        class177[] var103 = field886;
                                                        class195 var104 = new class195(var97);
                                                        int var105 = -1;
                                                        while (true) {
                                                            int var106 = var104.method3380();
                                                            if (var106 == 0) {
                                                                continue label375;
                                                            }
                                                            var105 += var106;
                                                            int var107 = 0;
                                                            while (true) {
                                                                int var108 = var104.method3380();
                                                                if (var108 == 0) {
                                                                    break;
                                                                }
                                                                var107 += var108 - 1;
                                                                int var109 = var107 & 0x3F;
                                                                int var110 = var107 >> 6 & 0x3F;
                                                                int var111 = var107 >> 12;
                                                                int var112 = var104.method3330();
                                                                int var113 = var112 >> 2;
                                                                int var114 = var112 & 0x3;
                                                                if (var91 == var111 && var110 >= var100 && var110 < var100 + 8 && var109 >= var101 && var109 < var101 + 8) {
                                                                    class283 var115 = class283.method3065(var105);
                                                                    int var116 = var98 + class242.method1728(var110 & 0x7, var109 & 0x7, var92, var115.field3604, var115.field3605, var114);
                                                                    int var117 = var99 + class242.method4566(var110 & 0x7, var109 & 0x7, var92, var115.field3604, var115.field3605, var114);
                                                                    if (var116 > 0 && var117 > 0 && var116 < 103 && var117 < 103) {
                                                                        int var118 = var87;
                                                                        if ((class63.field736[1][var116][var117] & 0x2) == 2) {
                                                                            var118 = var87 - 1;
                                                                        }
                                                                        class177 var119 = null;
                                                                        if (var118 >= 0) {
                                                                            var119 = var103[var118];
                                                                        }
                                                                        class63.method29(var87, var116, var117, var105, var92 + var114 & 0x3, var113, var102, var119);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var87++;
                                }
                            }
                            method3188();
                            for (int var45 = 0; var45 < 13; var45++) {
                                for (int var46 = 0; var46 < 13; var46++) {
                                    boolean var47 = false;
                                    int var48 = field913[var44][var45][var46];
                                    if (var48 != -1) {
                                        int var49 = var48 >> 24 & 0x3;
                                        int var50 = var48 >> 1 & 0x3;
                                        int var51 = var48 >> 14 & 0x3FF;
                                        int var52 = var48 >> 3 & 0x7FF;
                                        int var53 = (var51 / 8 << 8) + var52 / 8;
                                        for (int var54 = 0; var54 < Statics.field464.length; var54++) {
                                            if (Statics.field464[var54] == var53 && Statics.field2571[var54] != null) {
                                                byte[] var55 = Statics.field2571[var54];
                                                int var56 = var45 * 8;
                                                int var57 = var46 * 8;
                                                int var58 = (var51 & 0x7) * 8;
                                                int var59 = (var52 & 0x7) * 8;
                                                class177[] var60 = field886;
                                                for (int var61 = 0; var61 < 8; var61++) {
                                                    for (int var62 = 0; var62 < 8; var62++) {
                                                        if (var56 + var61 > 0 && var56 + var61 < 103 && var57 + var62 > 0 && var57 + var62 < 103) {
                                                            var60[var44].field2266[var56 + var61][var57 + var62] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class195 var63 = new class195(var55);
                                                for (int var64 = 0; var64 < 4; var64++) {
                                                    for (int var65 = 0; var65 < 64; var65++) {
                                                        for (int var66 = 0; var66 < 64; var66++) {
                                                            if (var49 == var64 && var65 >= var58 && var65 < var58 + 8 && var66 >= var59 && var66 < var59 + 8) {
                                                                int var70 = var65 & 0x7;
                                                                int var71 = var66 & 0x7;
                                                                int var73 = var50 & 0x3;
                                                                int var74;
                                                                if (var73 == 0) {
                                                                    var74 = var70;
                                                                } else if (var73 == 1) {
                                                                    var74 = var71;
                                                                } else if (var73 == 2) {
                                                                    var74 = 7 - var70;
                                                                } else {
                                                                    var74 = 7 - var71;
                                                                }
                                                                int var77 = var56 + var74;
                                                                int var79 = var65 & 0x7;
                                                                int var80 = var66 & 0x7;
                                                                int var82 = var50 & 0x3;
                                                                int var83;
                                                                if (var82 == 0) {
                                                                    var83 = var80;
                                                                } else if (var82 == 1) {
                                                                    var83 = 7 - var79;
                                                                } else if (var82 == 2) {
                                                                    var83 = 7 - var80;
                                                                } else {
                                                                    var83 = var79;
                                                                }
                                                                Statics.method3074(var63, var44, var77, var57 + var83, 0, 0, var50);
                                                            } else {
                                                                Statics.method3074(var63, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var47 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var47) {
                                        class63.method1916(var44, var45 * 8, var46 * 8);
                                    }
                                }
                            }
                            var44++;
                        }
                    }
                    method4230(true);
                    method3188();
                    class63.method182(Statics.field1312, field886);
                    method4230(true);
                    int var120 = class63.field737;
                    if (var120 > Statics.field505) {
                        var120 = Statics.field505;
                    }
                    if (var120 < Statics.field505 - 1) {
                        int var121 = Statics.field505 - 1;
                    }
                    if (field862) {
                        Statics.field1312.method2754(class63.field737);
                    } else {
                        Statics.field1312.method2754(0);
                    }
                    for (int var122 = 0; var122 < 104; var122++) {
                        for (int var123 = 0; var123 < 104; var123++) {
                            method177(var122, var123);
                        }
                    }
                    method3188();
                    method989();
                    class283.field3592.method3700();
                    if (Statics.field357.method805()) {
                        class185 var124 = class185.method251(class182.field2422, field900.field1471);
                        var124.field2497.method3326(1057001181);
                        field900.method1921(var124);
                    }
                    if (!field983) {
                        int var125 = (Statics.field752 - 6) / 8;
                        int var126 = (Statics.field752 + 6) / 8;
                        int var127 = (Statics.field10 - 6) / 8;
                        int var128 = (Statics.field10 + 6) / 8;
                        for (int var129 = var125 - 1; var129 <= var126 + 1; var129++) {
                            for (int var130 = var127 - 1; var130 <= var128 + 1; var130++) {
                                if (var129 < var125 || var129 > var126 || var130 < var127 || var130 > var128) {
                                    Statics.field3342.method4297("m" + var129 + "_" + var130);
                                    Statics.field3342.method4297("l" + var129 + "_" + var130);
                                }
                            }
                        }
                    }
                    method4667(30);
                    method3188();
                    class63.method150();
                    class185 var131 = class185.method251(class182.field2458, field900.field1471);
                    field900.method1921(var131);
                    class60.method962();
                } else {
                    field910 = 2;
                }
            } else {
                field910 = 1;
            }
        }
        if (field986 == 30) {
            this.method1213();
        } else if (field986 == 40 || field986 == 45) {
            this.method1100();
        }
    }

    @ObfuscatedName("client.aq(ZI)V")
    public final void method777(boolean arg0) {
        boolean var2 = class230.method921();
        if (var2 && field971 && Statics.field3703 != null) {
            Statics.field3703.method2084();
        }
        if ((field986 == 10 || field986 == 20 || field986 == 30) && field1062 != 0L && class197.method1501() > field1062) {
            int var3 = method238();
            field1062 = 0L;
            if (var3 >= 2) {
                field1063 = true;
            } else {
                field1063 = false;
            }
            if (method238() == 1) {
                Statics.field357.method788(765, 503);
            } else {
                Statics.field357.method788(7680, 2160);
            }
            if (field986 >= 25) {
                class185 var4 = class185.method251(class182.field2416, field900.field1471);
                var4.field2497.method3243(method238());
                var4.field2497.method3360(Statics.field695);
                var4.field2497.method3360(Statics.field2582);
                field900.method1921(var4);
            }
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field1054[var5] = true;
            }
        }
        if (field986 == 0) {
            this.method779(class91.field1352, class91.field1349, arg0);
        } else if (field986 == 5) {
            class91.method3574(Statics.field2079, Statics.field548, Statics.field648, arg0);
        } else if (field986 == 10 || field986 == 11) {
            class91.method3574(Statics.field2079, Statics.field548, Statics.field648, arg0);
        } else if (field986 == 20) {
            class91.method3574(Statics.field2079, Statics.field548, Statics.field648, arg0);
        } else if (field986 == 25) {
            if (field910 == 1) {
                if (field1106 > field907) {
                    field907 = field1106;
                }
                int var6 = (field907 * 50 - field1106 * 50) / field907;
                method680(class252.field3030 + class87.field1307 + class87.field1305 + var6 + "%" + class87.field1304, false);
            } else if (field910 == 2) {
                if (field908 > field909) {
                    field909 = field908;
                }
                int var7 = (field909 * 50 - field908 * 50) / field909 + 50;
                method680(class252.field3030 + class87.field1307 + class87.field1305 + var7 + "%" + class87.field1304, false);
            } else {
                method680(class252.field3030, false);
            }
        } else if (field986 == 30) {
            this.method1194();
        } else if (field986 == 40) {
            method680(class252.field3031 + class87.field1307 + class252.field3032, false);
        } else if (field986 == 45) {
            method680(class252.field3178, false);
        }
        if (field986 == 30 && field1061 == 0 && !arg0 && !field1063) {
            for (int var8 = 0; var8 < field1052; var8++) {
                if (field1044[var8]) {
                    Statics.field340.method734(field930[var8], field1058[var8], field1059[var8], field1060[var8]);
                    field1044[var8] = false;
                }
            }
        } else if (field986 > 0) {
            Statics.field340.method733(0, 0);
            for (int var9 = 0; var9 < field1052; var9++) {
                field1044[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ae(S)V")
    public final void method860() {
        if (Statics.field1438.method1843()) {
            Statics.field1438.method1840();
        }
        if (Statics.field263 != null) {
            Statics.field263.field809 = false;
        }
        Statics.field263 = null;
        field900.method1931();
        if (class52.field634 != null) {
            class52 var1 = class52.field634;
            synchronized (class52.field634) {
                class52.field634 = null;
            }
        }
        if (class61.field717 != null) {
            class61 var3 = class61.field717;
            synchronized (class61.field717) {
                class61.field717 = null;
            }
        }
        Statics.field397 = null;
        if (Statics.field3703 != null) {
            Statics.field3703.method2085();
        }
        if (Statics.field1464 != null) {
            Statics.field1464.method2085();
        }
        if (Statics.field3420 != null) {
            Statics.field3420.method3049();
        }
        Object var5 = class263.field3392;
        synchronized (class263.field3392) {
            if (class263.field3395 != 0) {
                class263.field3395 = 1;
                try {
                    class263.field3392.wait();
                } catch (InterruptedException var10) {
                }
            }
        }
        if (Statics.field578 != null) {
            Statics.field578.method2917();
            Statics.field578 = null;
        }
        try {
            class168.field2200.method2343();
            for (int var8 = 0; var8 < Statics.field2196; var8++) {
                Statics.field654[var8].method2343();
            }
            class168.field2201.method2343();
            class168.field2199.method2343();
        } catch (Exception var13) {
        }
    }

    @ObfuscatedName("jn.eb(IB)V")
    public static void method4667(int arg0) {
        if (field986 == arg0) {
            return;
        }
        if (field986 == 0) {
            Statics.field357.method780();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field889 = 0;
            field1077 = 0;
            field891 = 0;
            field1078.method4909(arg0);
            if (arg0 != 20) {
                method15(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1913 != null) {
            Statics.field1913.method3049();
            Statics.field1913 = null;
        }
        if (field986 == 25) {
            field910 = 0;
            field1106 = 0;
            field907 = 1;
            field908 = 0;
            field909 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class91.method8(Statics.field313, Statics.field2028, true, 0);
        } else if (arg0 == 20) {
            class91.method8(Statics.field313, Statics.field2028, true, field986 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class91.method8(Statics.field313, Statics.field2028, false, 4);
        } else {
            class91.method1527();
        }
        field986 = arg0;
    }

    @ObfuscatedName("client.ey(I)V")
    public void method1119() {
        if (field986 == 1000) {
            return;
        }
        long var1 = class197.method1501();
        int var3 = (int) (var1 - Statics.field3415);
        Statics.field3415 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class265.field3408 += var3;
        boolean var4;
        if (class265.field3417 == 0 && class265.field3407 == 0 && class265.field3406 == 0 && class265.field3410 == 0) {
            var4 = true;
        } else if (Statics.field3420 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class265.field3408 > 30000) {
                        throw new IOException();
                    }
                    while (class265.field3407 < 200 && class265.field3410 > 0) {
                        class261 var5 = (class261) class265.field3409.method3739();
                        class195 var6 = new class195(4);
                        var6.method3243(1);
                        var6.method3325((int) var5.field2655);
                        Statics.field3420.method3050(var6.field2569, 0, 4);
                        class265.field3411.method3745(var5, var5.field2655);
                        class265.field3410--;
                        class265.field3407++;
                    }
                    while (class265.field3417 < 200 && class265.field3406 > 0) {
                        class261 var7 = (class261) class265.field3412.method3640();
                        class195 var8 = new class195(4);
                        var8.method3243(0);
                        var8.method3325((int) var7.field2655);
                        Statics.field3420.method3050(var8.field2569, 0, 4);
                        var7.method3828();
                        class265.field3416.method3745(var7, var7.field2655);
                        class265.field3406--;
                        class265.field3417++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3420.method3054();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class265.field3408 = 0;
                        byte var11 = 0;
                        if (Statics.field304 == null) {
                            var11 = 8;
                        } else if (class265.field3413 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class265.field3418.field2568;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3420.method3057(class265.field3418.field2569, class265.field3418.field2568, var12);
                            if (class265.field3423 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class265.field3418.field2569[class265.field3418.field2568 + var13] ^= class265.field3423;
                                }
                            }
                            class265.field3418.field2568 += var12;
                            if (class265.field3418.field2568 < var11) {
                                break;
                            }
                            if (Statics.field304 == null) {
                                class265.field3418.field2568 = 0;
                                int var14 = class265.field3418.method3330();
                                int var15 = class265.field3418.method3269();
                                int var16 = class265.field3418.method3330();
                                int var17 = class265.field3418.method3264();
                                long var18 = (long) ((var14 << 16) + var15);
                                class261 var20 = (class261) class265.field3411.method3736(var18);
                                Statics.field282 = true;
                                if (var20 == null) {
                                    var20 = (class261) class265.field3416.method3736(var18);
                                    Statics.field282 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field304 = var20;
                                Statics.field3419 = new class195(var17 + var21 + Statics.field304.field3367);
                                Statics.field3419.method3243(var16);
                                Statics.field3419.method3326(var17);
                                class265.field3413 = 8;
                                class265.field3418.field2568 = 0;
                            } else if (class265.field3413 == 0) {
                                if (class265.field3418.field2569[0] == -1) {
                                    class265.field3413 = 1;
                                    class265.field3418.field2568 = 0;
                                } else {
                                    Statics.field304 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field3419.field2569.length - Statics.field304.field3367;
                            int var23 = 512 - class265.field3413;
                            if (var23 > var22 - Statics.field3419.field2568) {
                                var23 = var22 - Statics.field3419.field2568;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3420.method3057(Statics.field3419.field2569, Statics.field3419.field2568, var23);
                            if (class265.field3423 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field3419.field2569[Statics.field3419.field2568 + var24] ^= class265.field3423;
                                }
                            }
                            Statics.field3419.field2568 += var23;
                            class265.field3413 += var23;
                            if (Statics.field3419.field2568 == var22) {
                                if (Statics.field304.field2655 == 16711935L) {
                                    Statics.field334 = Statics.field3419;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class264 var26 = class265.field3425[var25];
                                        if (var26 != null) {
                                            Statics.field334.field2568 = var25 * 8 + 5;
                                            int var27 = Statics.field334.method3264();
                                            int var28 = Statics.field334.method3264();
                                            var26.method4380(var27, var28);
                                        }
                                    }
                                } else {
                                    class265.field3421.reset();
                                    class265.field3421.update(Statics.field3419.field2569, 0, var22);
                                    int var29 = (int) class265.field3421.getValue();
                                    if (Statics.field304.field3368 != var29) {
                                        try {
                                            Statics.field3420.method3049();
                                        } catch (Exception var35) {
                                        }
                                        class265.field3424++;
                                        Statics.field3420 = null;
                                        class265.field3423 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class265.field3424 = 0;
                                    class265.field3422 = 0;
                                    Statics.field304.field3366.method4401((int) (Statics.field304.field2655 & 0xFFFFL), Statics.field3419.field2569, (Statics.field304.field2655 & 0xFF0000L) == 16711680L, Statics.field282);
                                }
                                Statics.field304.method3785();
                                if (Statics.field282) {
                                    class265.field3407--;
                                } else {
                                    class265.field3417--;
                                }
                                class265.field3413 = 0;
                                Statics.field304 = null;
                                Statics.field3419 = null;
                            } else {
                                if (class265.field3413 != 512) {
                                    break;
                                }
                                class265.field3413 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3420.method3049();
                } catch (Exception var34) {
                }
                class265.field3422++;
                Statics.field3420 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1098();
        }
    }

    @ObfuscatedName("client.em(I)V")
    public void method1098() {
        if (class265.field3424 >= 4) {
            this.method781("js5crc");
            field986 = 1000;
            return;
        }
        if (class265.field3422 >= 4) {
            if (field986 <= 5) {
                this.method781("js5io");
                field986 = 1000;
                return;
            }
            field874 = 3000;
            class265.field3422 = 3;
        }
        if (--field874 + 1 > 0) {
            return;
        }
        try {
            if (field949 == 0) {
                Statics.field856 = Statics.field698.method3034(Statics.field249, Statics.field2996);
                field949++;
            }
            if (field949 == 1) {
                if (Statics.field856.field2179 == 2) {
                    this.method1099(-1);
                    return;
                }
                if (Statics.field856.field2179 == 1) {
                    field949++;
                }
            }
            if (field949 == 2) {
                if (field903) {
                    Socket var1 = (Socket) Statics.field856.field2176;
                    class172 var2 = new class172(var1, 40000, 5000);
                    Statics.field373 = var2;
                } else {
                    Statics.field373 = new class174((Socket) Statics.field856.field2176, Statics.field698, 5000);
                }
                class195 var3 = new class195(5);
                var3.method3243(15);
                var3.method3326(165);
                Statics.field373.method3050(var3.field2569, 0, 5);
                field949++;
                Statics.field3930 = class197.method1501();
            }
            if (field949 == 3) {
                if (Statics.field373.method3054() > 0 || !field903 && field986 <= 5) {
                    int var4 = Statics.field373.method3048();
                    if (var4 != 0) {
                        this.method1099(var4);
                        return;
                    }
                    field949++;
                } else if (class197.method1501() - Statics.field3930 > 30000L) {
                    this.method1099(-2);
                    return;
                }
            }
            if (field949 == 4) {
                class170 var5 = Statics.field373;
                boolean var6 = field986 > 20;
                if (Statics.field3420 != null) {
                    try {
                        Statics.field3420.method3049();
                    } catch (Exception var16) {
                    }
                    Statics.field3420 = null;
                }
                Statics.field3420 = var5;
                class265.method467(var6);
                class265.field3418.field2568 = 0;
                Statics.field304 = null;
                Statics.field3419 = null;
                class265.field3413 = 0;
                while (true) {
                    class261 var8 = (class261) class265.field3411.method3739();
                    if (var8 == null) {
                        while (true) {
                            class261 var9 = (class261) class265.field3416.method3739();
                            if (var9 == null) {
                                if (class265.field3423 != 0) {
                                    try {
                                        class195 var10 = new class195(4);
                                        var10.method3243(4);
                                        var10.method3243(class265.field3423);
                                        var10.method3360(0);
                                        Statics.field3420.method3050(var10.field2569, 0, 4);
                                    } catch (IOException var15) {
                                        try {
                                            Statics.field3420.method3049();
                                        } catch (Exception var14) {
                                        }
                                        class265.field3422++;
                                        Statics.field3420 = null;
                                    }
                                }
                                class265.field3408 = 0;
                                Statics.field3415 = class197.method1501();
                                Statics.field856 = null;
                                Statics.field373 = null;
                                field949 = 0;
                                field888 = 0;
                                return;
                            }
                            class265.field3412.method3638(var9);
                            class265.field3414.method3745(var9, var9.field2655);
                            class265.field3406++;
                            class265.field3417--;
                        }
                    }
                    class265.field3409.method3745(var8, var8.field2655);
                    class265.field3410++;
                    class265.field3407--;
                }
            }
        } catch (IOException var17) {
            this.method1099(-3);
        }
    }

    @ObfuscatedName("client.ei(IB)V")
    public void method1099(int arg0) {
        Statics.field856 = null;
        Statics.field373 = null;
        field949 = 0;
        if (Statics.field2996 == Statics.field2760) {
            Statics.field2996 = Statics.field574;
        } else {
            Statics.field2996 = Statics.field2760;
        }
        field888++;
        if (field888 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field986 <= 5) {
                this.method781("js5connect_full");
                field986 = 1000;
            } else {
                field874 = 3000;
            }
        } else if (field888 >= 2 && arg0 == 6) {
            this.method781("js5connect_outofdate");
            field986 = 1000;
        } else if (field888 >= 4) {
            if (field986 <= 5) {
                this.method781("js5connect");
                field986 = 1000;
            } else {
                field874 = 3000;
            }
        }
    }

    @ObfuscatedName("fv.et(Ljs;Ljava/lang/String;B)V")
    public static void method3035(class264 arg0, String arg1) {
        class65 var2 = new class65(arg0, arg1);
        field1118.add(var2);
    }

    @ObfuscatedName("ff.ea(I)V")
    public static void method3076() {
        if (field884 == 0) {
            Statics.field1312 = new class138(4, 104, 104, class63.field738);
            for (int var0 = 0; var0 < 4; var0++) {
                field886[var0] = new class177(104, 104);
            }
            Statics.field382 = new class332(512, 512);
            class91.field1349 = class252.field3033;
            class91.field1352 = 5;
            field884 = 20;
        } else if (field884 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class135.field1940[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class138.method2735(var1, 500, 800, 512, 334);
            class91.field1349 = class252.field3034;
            class91.field1352 = 10;
            field884 = 30;
        } else if (field884 == 30) {
            Statics.field348 = method5251(0, false, true, true);
            Statics.field38 = method5251(1, false, true, true);
            Statics.field244 = method5251(2, true, false, true);
            Statics.field2583 = method5251(3, false, true, true);
            Statics.field2279 = method5251(4, false, true, true);
            Statics.field3342 = method5251(5, true, true, true);
            Statics.field2129 = method5251(6, true, true, true);
            Statics.field955 = method5251(7, false, true, true);
            Statics.field2028 = method5251(8, false, true, true);
            Statics.field1301 = method5251(9, false, true, true);
            Statics.field313 = method5251(10, false, true, true);
            Statics.field771 = method5251(11, false, true, true);
            Statics.field9 = method5251(12, false, true, true);
            Statics.field336 = method5251(13, true, false, true);
            Statics.field2122 = method5251(14, false, true, true);
            Statics.field662 = method5251(15, false, true, true);
            Statics.field2374 = method5251(16, true, true, true);
            class91.field1349 = class252.field3291;
            class91.field1352 = 20;
            field884 = 40;
        } else if (field884 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field348.method4378() * 4 / 100;
            int var8 = var7 + Statics.field38.method4378() * 4 / 100;
            int var9 = var8 + Statics.field244.method4378() * 2 / 100;
            int var10 = var9 + Statics.field2583.method4378() * 2 / 100;
            int var11 = var10 + Statics.field2279.method4378() * 6 / 100;
            int var12 = var11 + Statics.field3342.method4378() * 4 / 100;
            int var13 = var12 + Statics.field2129.method4378() * 2 / 100;
            int var14 = var13 + Statics.field955.method4378() * 58 / 100;
            int var15 = var14 + Statics.field2028.method4378() * 2 / 100;
            int var16 = var15 + Statics.field1301.method4378() * 2 / 100;
            int var17 = var16 + Statics.field313.method4378() * 2 / 100;
            int var18 = var17 + Statics.field771.method4378() * 2 / 100;
            int var19 = var18 + Statics.field9.method4378() * 2 / 100;
            int var20 = var19 + Statics.field336.method4378() * 2 / 100;
            int var21 = var20 + Statics.field2122.method4378() * 2 / 100;
            int var22 = var21 + Statics.field662.method4378() * 2 / 100;
            int var23 = var22 + Statics.field2374.method4378() * 2 / 100;
            if (var23 == 100) {
                method3035(Statics.field348, "Animations");
                method3035(Statics.field38, "Skeletons");
                method3035(Statics.field2279, "Sound FX");
                method3035(Statics.field3342, "Maps");
                method3035(Statics.field2129, "Music Tracks");
                method3035(Statics.field955, "Models");
                method3035(Statics.field2028, "Sprites");
                method3035(Statics.field771, "Music Jingles");
                method3035(Statics.field2122, "Music Samples");
                method3035(Statics.field662, "Music Patches");
                method3035(Statics.field2374, "World Map");
                class91.field1349 = class252.field3037;
                class91.field1352 = 30;
                field884 = 45;
            } else {
                if (var23 != 0) {
                    class91.field1349 = class252.field3036 + var23 + "%";
                }
                class91.field1352 = 30;
            }
        } else if (field884 == 45) {
            boolean var24 = !field862;
            Statics.field646 = 22050;
            Statics.field1557 = var24;
            Statics.field310 = 2;
            class231 var25 = new class231();
            var25.method3915(9, 128);
            Statics.field3703 = class108.method499(Statics.field698, 0, 22050);
            Statics.field3703.method2081(var25);
            class264 var26 = Statics.field662;
            class264 var27 = Statics.field2122;
            class264 var28 = Statics.field2279;
            Statics.field2689 = var26;
            Statics.field2694 = var27;
            Statics.field2690 = var28;
            Statics.field2691 = var25;
            Statics.field1464 = class108.method499(Statics.field698, 1, 2048);
            Statics.field432 = new class101();
            Statics.field1464.method2081(Statics.field432);
            Statics.field674 = new class115(22050, Statics.field646);
            class91.field1349 = class252.field3038;
            class91.field1352 = 35;
            field884 = 50;
            Statics.field2207 = new class311(Statics.field2028, Statics.field336);
        } else if (field884 == 50) {
            class310[] var29 = new class310[] { class310.field3870, class310.field3873, class310.field3869, class310.field3872, class310.field3871, class310.field3868 };
            int var30 = var29.length;
            class311 var31 = Statics.field2207;
            class310[] var32 = new class310[] { class310.field3870, class310.field3873, class310.field3869, class310.field3872, class310.field3871, class310.field3868 };
            field1082 = var31.method5146(var32);
            if (field1082.size() < var30) {
                class91.field1349 = class252.field3039 + field1082.size() * 100 / var30 + "%";
                class91.field1352 = 40;
            } else {
                Statics.field548 = (class312) field1082.get(class310.field3873);
                Statics.field648 = (class312) field1082.get(class310.field3872);
                Statics.field2079 = (class312) field1082.get(class310.field3870);
                Statics.field349 = new class338(true);
                class91.field1349 = class252.field3040;
                class91.field1352 = 40;
                field884 = 60;
            }
        } else if (field884 == 60) {
            int var33 = class91.method1521(Statics.field313, Statics.field2028);
            byte var34 = 11;
            if (var33 < var34) {
                class91.field1349 = class252.field3041 + var33 * 100 / var34 + "%";
                class91.field1352 = 50;
            } else {
                class91.field1349 = class252.field3042;
                class91.field1352 = 50;
                method4667(5);
                field884 = 70;
            }
        } else if (field884 == 70) {
            if (Statics.field244.method4278()) {
                class287.method1570(Statics.field244);
                class274.method2389(Statics.field244);
                class264 var36 = Statics.field244;
                class264 var37 = Statics.field955;
                Statics.field14 = var36;
                Statics.field3511 = var37;
                Statics.field3509 = Statics.field14.method4285(3);
                class264 var38 = Statics.field244;
                class264 var39 = Statics.field955;
                boolean var40 = field862;
                Statics.field3610 = var38;
                Statics.field3590 = var39;
                class283.field3618 = var40;
                class264 var41 = Statics.field244;
                class264 var42 = Statics.field955;
                Statics.field3941 = var41;
                Statics.field3711 = var42;
                class280.method2996(Statics.field244);
                class264 var43 = Statics.field244;
                class264 var44 = Statics.field955;
                boolean var45 = field1031;
                class312 var46 = Statics.field548;
                Statics.field278 = var43;
                Statics.field3773 = var44;
                Statics.field3643 = var45;
                Statics.field3644 = Statics.field278.method4285(10);
                Statics.field3960 = var46;
                class288.method4247(Statics.field244, Statics.field348, Statics.field38);
                class264 var47 = Statics.field244;
                class264 var48 = Statics.field955;
                Statics.field3494 = var47;
                Statics.field3481 = var48;
                class278.method22(Statics.field244);
                class264 var49 = Statics.field244;
                Statics.field3446 = var49;
                Statics.field3447 = Statics.field3446.method4285(16);
                class264 var50 = Statics.field2583;
                class264 var51 = Statics.field955;
                class264 var52 = Statics.field2028;
                class264 var53 = Statics.field336;
                Statics.field23 = var50;
                Statics.field31 = var51;
                Statics.field429 = var52;
                Statics.field2819 = var53;
                Statics.field2817 = new class243[Statics.field23.method4311()][];
                Statics.field2863 = new boolean[Statics.field23.method4311()];
                class268.method2924(Statics.field244);
                class264 var54 = Statics.field244;
                Statics.field3557 = var54;
                class264 var55 = Statics.field244;
                Statics.field3472 = var55;
                class264 var56 = Statics.field244;
                Statics.field3476 = var56;
                class264 var57 = Statics.field244;
                Statics.field3548 = var57;
                Statics.field1438 = new class95();
                class282.method2903(Statics.field244, Statics.field2028, Statics.field336);
                class264 var58 = Statics.field244;
                class264 var59 = Statics.field2028;
                Statics.field3516 = var58;
                Statics.field3517 = var59;
                class270.method4234(Statics.field244, Statics.field2028);
                class91.field1349 = class252.field3044;
                class91.field1352 = 60;
                field884 = 80;
            } else {
                class91.field1349 = class252.field3053 + Statics.field244.method4385() + "%";
                class91.field1352 = 60;
            }
        } else if (field884 == 80) {
            int var60 = 0;
            if (Statics.field1958 == null) {
                class264 var61 = Statics.field2028;
                int var62 = var61.method4290("compass");
                int var63 = var61.method4292(var62, "");
                class332 var64 = class333.method560(var61, var62, var63);
                Statics.field1958 = var64;
            } else {
                var60++;
            }
            if (Statics.field2211 == null) {
                class264 var65 = Statics.field2028;
                int var66 = var65.method4290("mapedge");
                int var67 = var65.method4292(var66, "");
                class332 var68 = class333.method560(var65, var66, var67);
                Statics.field2211 = var68;
            } else {
                var60++;
            }
            if (Statics.field2101 == null) {
                Statics.field2101 = class333.method4253(Statics.field2028, "mapscene", "");
            } else {
                var60++;
            }
            if (Statics.field2811 == null) {
                Statics.field2811 = class333.method250(Statics.field2028, "headicons_pk", "");
            } else {
                var60++;
            }
            if (Statics.field3533 == null) {
                Statics.field3533 = class333.method250(Statics.field2028, "headicons_prayer", "");
            } else {
                var60++;
            }
            if (Statics.field1954 == null) {
                Statics.field1954 = class333.method250(Statics.field2028, "headicons_hint", "");
            } else {
                var60++;
            }
            if (Statics.field27 == null) {
                Statics.field27 = class333.method250(Statics.field2028, "mapmarker", "");
            } else {
                var60++;
            }
            if (Statics.field3547 == null) {
                Statics.field3547 = class333.method250(Statics.field2028, "cross", "");
            } else {
                var60++;
            }
            if (Statics.field388 == null) {
                Statics.field388 = class333.method250(Statics.field2028, "mapdots", "");
            } else {
                var60++;
            }
            if (Statics.field2769 == null) {
                Statics.field2769 = class333.method4253(Statics.field2028, "scrollbar", "");
            } else {
                var60++;
            }
            if (Statics.field239 == null) {
                Statics.field239 = class333.method4253(Statics.field2028, "mod_icons", "");
            } else {
                var60++;
            }
            if (var60 < 11) {
                class91.field1349 = class252.field3216 + var60 * 100 / 12 + "%";
                class91.field1352 = 70;
            } else {
                Statics.field3891 = Statics.field239;
                Statics.field2211.method5482();
                int var69 = (int) (Math.random() * 21.0D) - 10;
                int var70 = (int) (Math.random() * 21.0D) - 10;
                int var71 = (int) (Math.random() * 21.0D) - 10;
                int var72 = (int) (Math.random() * 41.0D) - 20;
                Statics.field2101[0].method5425(var69 + var72, var70 + var72, var71 + var72);
                class91.field1349 = class252.field3046;
                class91.field1352 = 70;
                field884 = 90;
            }
        } else if (field884 == 90) {
            if (Statics.field1301.method4278()) {
                Statics.field273 = new class124(Statics.field1301, Statics.field2028, 20, 0.8D, field862 ? 64 : 128);
                class135.method2655(Statics.field273);
                class135.method2619(0.8D);
                field884 = 100;
            } else {
                class91.field1349 = class252.field3047 + "0%";
                class91.field1352 = 90;
            }
        } else if (field884 == 100) {
            int var73 = Statics.field273.method2391();
            if (var73 < 100) {
                class91.field1349 = class252.field3047 + var73 + "%";
                class91.field1352 = 90;
            } else {
                class91.field1349 = class252.field3223;
                class91.field1352 = 90;
                field884 = 110;
            }
        } else if (field884 == 110) {
            Statics.field263 = new class70();
            Statics.field698.method3022(Statics.field263, 10);
            class91.field1349 = class252.field3183;
            class91.field1352 = 92;
            field884 = 120;
        } else if (field884 == 120) {
            if (Statics.field313.method4335("huffman", "")) {
                class187 var74 = new class187(Statics.field313.method4294("huffman", ""));
                class314.method4798(var74);
                class91.field1349 = class252.field3051;
                class91.field1352 = 94;
                field884 = 130;
            } else {
                class91.field1349 = class252.field3050 + "%";
                class91.field1352 = 94;
            }
        } else if (field884 == 130) {
            if (!Statics.field2583.method4278()) {
                class91.field1349 = class252.field3052 + Statics.field2583.method4385() * 4 / 5 + "%";
                class91.field1352 = 96;
            } else if (!Statics.field9.method4278()) {
                class91.field1349 = class252.field3052 + (80 + Statics.field9.method4385() / 6) + "%";
                class91.field1352 = 96;
            } else if (Statics.field336.method4278()) {
                class91.field1349 = class252.field3244;
                class91.field1352 = 98;
                field884 = 140;
            } else {
                class91.field1349 = class252.field3052 + (96 + Statics.field336.method4385() / 50) + "%";
                class91.field1352 = 96;
            }
        } else if (field884 == 140) {
            class91.field1352 = 100;
            if (Statics.field2374.method4358(class42.field547.field543)) {
                if (Statics.field3008 == null) {
                    Statics.field3008 = new class335();
                    Statics.field3008.method5691(Statics.field2374, Statics.field2079, field1082, Statics.field2101);
                }
                int var75 = Statics.field3008.method5621();
                if (var75 < 100) {
                    class91.field1349 = class252.field3054 + (var75 * 9 / 10 + 10) + "%";
                } else {
                    class91.field1349 = class252.field3055;
                    field884 = 150;
                }
            } else {
                class91.field1349 = class252.field3054 + Statics.field2374.method4298(class42.field547.field543) / 10 + "%";
            }
        } else if (field884 == 150) {
            method4667(10);
        }
    }

    @ObfuscatedName("lg.eq(IZZZI)Ljs;")
    public static class264 method5251(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class175 var4 = null;
        if (class168.field2200 != null) {
            var4 = new class175(arg0, class168.field2200, Statics.field654[arg0], 1000000);
        }
        return new class264(var4, Statics.field1317, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.ep(I)V")
    public final void method1100() {
        class170 var1 = field900.method1917();
        class202 var2 = field900.field1473;
        try {
            if (field889 == 0) {
                if (var1 != null) {
                    var1.method3049();
                    var1 = null;
                }
                Statics.field234 = null;
                field902 = false;
                field1077 = 0;
                field889 = 1;
            }
            if (field889 == 1) {
                if (Statics.field234 == null) {
                    Statics.field234 = Statics.field698.method3034(Statics.field249, Statics.field2996);
                }
                if (Statics.field234.field2179 == 2) {
                    throw new IOException();
                }
                if (Statics.field234.field2179 == 1) {
                    if (field903) {
                        Socket var3 = (Socket) Statics.field234.field2176;
                        class172 var4 = new class172(var3, 40000, 5000);
                        var1 = var4;
                    } else {
                        var1 = new class174((Socket) Statics.field234.field2176, Statics.field698, 5000);
                    }
                    field900.method1920(var1);
                    Statics.field234 = null;
                    field889 = 2;
                }
            }
            if (field889 == 2) {
                field900.method1918();
                class185 var5;
                if (class185.field2498 == 0) {
                    var5 = new class185();
                } else {
                    var5 = class185.field2495[--class185.field2498];
                }
                var5.field2499 = null;
                var5.field2494 = 0;
                var5.field2497 = new class202(5000);
                var5.field2497.method3243(class183.field2480.field2479);
                field900.method1921(var5);
                field900.method1919();
                var2.field2568 = 0;
                field889 = 3;
            }
            if (field889 == 3) {
                if (Statics.field3703 != null) {
                    Statics.field3703.method2088();
                }
                if (Statics.field1464 != null) {
                    Statics.field1464.method2088();
                }
                boolean var9 = true;
                if (field903 && !var1.method3061(1)) {
                    var9 = false;
                }
                if (var9) {
                    int var10 = var1.method3048();
                    if (Statics.field3703 != null) {
                        Statics.field3703.method2088();
                    }
                    if (Statics.field1464 != null) {
                        Statics.field1464.method2088();
                    }
                    if (var10 != 0) {
                        method2892(var10);
                        return;
                    }
                    var2.field2568 = 0;
                    field889 = 4;
                }
            }
            if (field889 == 4) {
                if (var2.field2568 < 8) {
                    int var11 = var1.method3054();
                    if (var11 > 8 - var2.field2568) {
                        var11 = 8 - var2.field2568;
                    }
                    if (var11 > 0) {
                        var1.method3057(var2.field2569, var2.field2568, var11);
                        var2.field2568 += var11;
                    }
                }
                if (var2.field2568 == 8) {
                    var2.field2568 = 0;
                    Statics.field604 = var2.method3265();
                    field889 = 5;
                }
            }
            if (field889 == 5) {
                field900.field1473.field2568 = 0;
                field900.method1918();
                class202 var12 = new class202(500);
                int[] var13 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field604 >> 32), (int) (Statics.field604 & 0xFFFFFFFFFFFFFFFFL) };
                var12.field2568 = 0;
                var12.method3243(1);
                var12.method3243(field1041.method12());
                var12.method3326(var13[0]);
                var12.method3326(var13[1]);
                var12.method3326(var13[2]);
                var12.method3326(var13[3]);
                switch(field1041.field2145) {
                    case 0:
                        var12.method3326((Integer) Statics.field663.field1225.get(class319.method5019(class91.field1359)));
                        var12.field2568 += 4;
                        break;
                    case 1:
                    case 3:
                        var12.method3325(Statics.field15);
                        var12.field2568 += 5;
                        break;
                    case 2:
                        var12.field2568 += 8;
                }
                var12.method3250(class91.field1366);
                var12.method3353(class89.field1322, class89.field1323);
                class185 var14;
                if (class185.field2498 == 0) {
                    var14 = new class185();
                } else {
                    var14 = class185.field2495[--class185.field2498];
                }
                var14.field2499 = null;
                var14.field2494 = 0;
                var14.field2497 = new class202(5000);
                var14.field2497.field2568 = 0;
                if (field986 == 40) {
                    var14.field2497.method3243(class183.field2482.field2479);
                } else {
                    var14.field2497.method3243(class183.field2475.field2479);
                }
                var14.field2497.method3360(0);
                int var18 = var14.field2497.field2568;
                var14.field2497.method3326(165);
                var14.field2497.method3253(var12.field2569, 0, var12.field2568);
                int var19 = var14.field2497.field2568;
                var14.field2497.method3250(class91.field1359);
                var14.field2497.method3243((field1063 ? 1 : 0) << 1 | (field862 ? 1 : 0));
                var14.field2497.method3360(Statics.field695);
                var14.field2497.method3360(Statics.field2582);
                method996(var14.field2497);
                var14.field2497.method3250(Statics.field376);
                var14.field2497.method3326(Statics.field760);
                class195 var20 = new class195(Statics.field349.method5786());
                Statics.field349.method5788(var20);
                var14.field2497.method3253(var20.field2569, 0, var20.field2569.length);
                var14.field2497.method3243(Statics.field2603);
                var14.field2497.method3326(0);
                var14.field2497.method3326(Statics.field348.field3384);
                var14.field2497.method3326(Statics.field38.field3384);
                var14.field2497.method3326(Statics.field244.field3384);
                var14.field2497.method3326(Statics.field2583.field3384);
                var14.field2497.method3326(Statics.field2279.field3384);
                var14.field2497.method3326(Statics.field3342.field3384);
                var14.field2497.method3326(Statics.field2129.field3384);
                var14.field2497.method3326(Statics.field955.field3384);
                var14.field2497.method3326(Statics.field2028.field3384);
                var14.field2497.method3326(Statics.field1301.field3384);
                var14.field2497.method3326(Statics.field313.field3384);
                var14.field2497.method3326(Statics.field771.field3384);
                var14.field2497.method3326(Statics.field9.field3384);
                var14.field2497.method3326(Statics.field336.field3384);
                var14.field2497.method3326(Statics.field2122.field3384);
                var14.field2497.method3326(Statics.field662.field3384);
                var14.field2497.method3326(Statics.field2374.field3384);
                var14.field2497.method3279(var13, var19, var14.field2497.field2568);
                var14.field2497.method3271(var14.field2497.field2568 - var18);
                field900.method1921(var14);
                field900.method1919();
                field900.field1471 = new class203(var13);
                for (int var21 = 0; var21 < 4; var21++) {
                    var13[var21] += 50;
                }
                var2.method3539(var13);
                field889 = 6;
            }
            if (field889 == 6 && var1.method3054() > 0) {
                int var22 = var1.method3048();
                if (var22 == 21 && field986 == 20) {
                    field889 = 7;
                } else if (var22 == 2) {
                    field889 = 9;
                } else if (var22 == 15 && field986 == 40) {
                    field900.field1469 = -1;
                    field889 = 13;
                } else if (var22 == 23 && field891 < 1) {
                    field891++;
                    field889 = 0;
                } else if (var22 == 29) {
                    field889 = 11;
                } else {
                    method2892(var22);
                    return;
                }
            }
            if (field889 == 7 && var1.method3054() > 0) {
                field892 = (var1.method3048() + 3) * 60;
                field889 = 8;
            }
            if (field889 == 8) {
                field1077 = 0;
                class91.method667(class252.field3059, class252.field3060, field892 / 60 + class252.field3259);
                if (--field892 <= 0) {
                    field889 = 0;
                }
            } else {
                if (field889 == 9 && var1.method3054() >= 13) {
                    boolean var23 = var1.method3048() == 1;
                    var1.method3057(var2.field2569, 0, 4);
                    var2.field2568 = 0;
                    boolean var24 = false;
                    if (var23) {
                        int var25 = var2.method3541() << 24;
                        int var26 = var25 | var2.method3541() << 16;
                        int var27 = var26 | var2.method3541() << 8;
                        int var28 = var27 | var2.method3541();
                        int var29 = class319.method5019(class91.field1359);
                        if (Statics.field663.field1225.size() >= 10 && !Statics.field663.field1225.containsKey(var29)) {
                            Iterator var30 = Statics.field663.field1225.entrySet().iterator();
                            var30.next();
                            var30.remove();
                        }
                        Statics.field663.field1225.put(var29, var28);
                    }
                    if (class91.field1338) {
                        Statics.field663.field1227 = class91.field1359;
                    } else {
                        Statics.field663.field1227 = null;
                    }
                    class79.method1027();
                    field1018 = var1.method3048();
                    field1020 = var1.method3048() == 1;
                    field1091 = var1.method3048();
                    field1091 <<= 0x8;
                    field1091 += var1.method3048();
                    field969 = var1.method3048();
                    var1.method3057(var2.field2569, 0, 1);
                    var2.field2568 = 0;
                    class181[] var31 = class181.method4233();
                    int var32 = var2.method3543();
                    if (var32 < 0 || var32 >= var31.length) {
                        throw new IOException(var32 + " " + var2.field2568);
                    }
                    field900.field1474 = var31[var32];
                    field900.field1469 = field900.field1474.field2373;
                    var1.method3057(var2.field2569, 0, 2);
                    var2.field2568 = 0;
                    field900.field1469 = var2.method3269();
                    try {
                        class54.method683(Statics.field357, "zap");
                    } catch (Throwable var56) {
                    }
                    field889 = 10;
                }
                if (field889 != 10) {
                    if (field889 == 11 && var1.method3054() >= 2) {
                        var2.field2568 = 0;
                        var1.method3057(var2.field2569, 0, 2);
                        var2.field2568 = 0;
                        Statics.field1961 = var2.method3269();
                        field889 = 12;
                    }
                    if (field889 == 12 && var1.method3054() >= Statics.field1961) {
                        var2.field2568 = 0;
                        var1.method3057(var2.field2569, 0, Statics.field1961);
                        var2.field2568 = 0;
                        String var46 = var2.method3268();
                        String var47 = var2.method3268();
                        String var48 = var2.method3268();
                        class91.method667(var46, var47, var48);
                        method4667(10);
                    }
                    if (field889 == 13) {
                        if (field900.field1469 == -1) {
                            if (var1.method3054() < 2) {
                                return;
                            }
                            var1.method3057(var2.field2569, 0, 2);
                            var2.field2568 = 0;
                            field900.field1469 = var2.method3269();
                        }
                        if (var1.method3054() >= field900.field1469) {
                            var1.method3057(var2.field2569, 0, field900.field1469);
                            var2.field2568 = 0;
                            int var49 = field900.field1469;
                            field1078.method4932();
                            field900.method1918();
                            field900.field1473.field2568 = 0;
                            field900.field1474 = null;
                            field900.field1479 = null;
                            field900.field1480 = null;
                            field900.field1481 = null;
                            field900.field1469 = 0;
                            field900.field1477 = 0;
                            field1070 = 0;
                            method474();
                            field1081 = 0;
                            field1079 = 0;
                            for (int var50 = 0; var50 < 2048; var50++) {
                                field967[var50] = null;
                            }
                            Statics.field302 = null;
                            for (int var51 = 0; var51 < field1035.length; var51++) {
                                class85 var52 = field1035[var51];
                                if (var52 != null) {
                                    var52.field1139 = -1;
                                    var52.field1167 = false;
                                }
                            }
                            class66.method213();
                            method4667(30);
                            for (int var53 = 0; var53 < 100; var53++) {
                                field1054[var53] = true;
                            }
                            class185 var54 = class185.method251(class182.field2416, field900.field1471);
                            var54.field2497.method3243(method238());
                            var54.field2497.method3360(Statics.field695);
                            var54.field2497.method3360(Statics.field2582);
                            field900.method1921(var54);
                            class94.method4902(var2);
                            if (var2.field2568 != var49) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field1077++;
                        if (field1077 > 2000) {
                            if (field891 < 1) {
                                if (Statics.field2996 == Statics.field2760) {
                                    Statics.field2996 = Statics.field574;
                                } else {
                                    Statics.field2996 = Statics.field2760;
                                }
                                field891++;
                                field889 = 0;
                            } else {
                                method2892(-3);
                            }
                        }
                    }
                } else if (var1.method3054() >= field900.field1469) {
                    var2.field2568 = 0;
                    var1.method3057(var2.field2569, 0, field900.field1469);
                    field1078.method4910();
                    field867 = 1L;
                    field870 = -1;
                    Statics.field263.field808 = 0;
                    Statics.field3806 = true;
                    field865 = true;
                    field1073 = -1L;
                    class327.method4636();
                    field900.method1918();
                    field900.field1473.field2568 = 0;
                    field900.field1474 = null;
                    field900.field1479 = null;
                    field900.field1480 = null;
                    field900.field1481 = null;
                    field900.field1469 = 0;
                    field900.field1477 = 0;
                    field1070 = 0;
                    field887 = 0;
                    field901 = 0;
                    method474();
                    class61.method880(0);
                    class96.field1434.clear();
                    class96.field1431.method3663();
                    class96.field1432.method3868();
                    class96.field1435 = 0;
                    field1004 = 0;
                    field1006 = false;
                    field1087 = 0;
                    field923 = 0;
                    field928 = 0;
                    Statics.field853 = null;
                    field1081 = 0;
                    field1074 = -1;
                    field1079 = 0;
                    field1112 = 0;
                    field882 = class90.field1329;
                    field883 = class90.field1329;
                    field896 = 0;
                    class94.method1832();
                    for (int var34 = 0; var34 < 2048; var34++) {
                        field967[var34] = null;
                    }
                    for (int var35 = 0; var35 < 32768; var35++) {
                        field1035[var35] = null;
                    }
                    field1104 = -1;
                    field871.method3792();
                    field1001.method3792();
                    for (int var36 = 0; var36 < 4; var36++) {
                        for (int var37 = 0; var37 < 104; var37++) {
                            for (int var38 = 0; var38 < 104; var38++) {
                                field962[var36][var37][var38] = null;
                            }
                        }
                    }
                    field980 = new class218();
                    Statics.field1319.method1620();
                    for (int var39 = 0; var39 < Statics.field3447; var39++) {
                        class269 var40 = class269.method4248(var39);
                        if (var40 != null) {
                            class238.field2784[var39] = 0;
                            class238.field2783[var39] = 0;
                        }
                    }
                    Statics.field1438.method1838();
                    field1009 = -1;
                    if (field1011 != -1) {
                        class243.method1886(field1011);
                    }
                    for (class68 var41 = (class68) field1012.method3739(); var41 != null; var41 = (class68) field1012.method3740()) {
                        method4249(var41, true);
                    }
                    field1011 = -1;
                    field1012 = new class215(8);
                    field1015 = null;
                    method474();
                    field1010.method4126((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var42 = 0; var42 < 8; var42++) {
                        field975[var42] = null;
                        field976[var42] = false;
                    }
                    class66.method213();
                    field1069 = true;
                    for (int var43 = 0; var43 < 100; var43++) {
                        field1054[var43] = true;
                    }
                    class185 var44 = class185.method251(class182.field2416, field900.field1471);
                    var44.field2497.method3243(method238());
                    var44.field2497.method3360(Statics.field695);
                    var44.field2497.method3360(Statics.field2582);
                    field900.method1921(var44);
                    Statics.field785 = null;
                    for (int var45 = 0; var45 < 8; var45++) {
                        field1115[var45] = new class17();
                    }
                    Statics.field2095 = null;
                    class94.method4902(var2);
                    Statics.field752 = -1;
                    method1796(false, var2);
                    field900.field1474 = null;
                }
            }
        } catch (IOException var57) {
            if (field891 < 1) {
                if (Statics.field2996 == Statics.field2760) {
                    Statics.field2996 = Statics.field574;
                } else {
                    Statics.field2996 = Statics.field2760;
                }
                field891++;
                field889 = 0;
            } else {
                method2892(-2);
            }
        }
    }

    @ObfuscatedName("ey.ed(II)V")
    public static void method2892(int arg0) {
        if (arg0 == -3) {
            class91.method667(class252.field3062, class252.field3063, class252.field3064);
        } else if (arg0 == -2) {
            class91.method667(class252.field3254, class252.field3188, class252.field3131);
        } else if (arg0 == -1) {
            class91.method667(class252.field3068, class252.field3069, class252.field3019);
        } else if (arg0 == 3) {
            class91.field1354 = 3;
        } else if (arg0 == 4) {
            class91.method667(class252.field3239, class252.field3072, class252.field3073);
        } else if (arg0 == 5) {
            class91.method667(class252.field3121, class252.field3075, class252.field3065);
        } else if (arg0 == 6) {
            class91.method667(class252.field3077, class252.field3111, class252.field3079);
        } else if (arg0 == 7) {
            class91.method667(class252.field3080, class252.field3081, class252.field3082);
        } else if (arg0 == 8) {
            class91.method667(class252.field3083, class252.field3114, class252.field3085);
        } else if (arg0 == 9) {
            class91.method667(class252.field3086, class252.field3087, class252.field3088);
        } else if (arg0 == 10) {
            class91.method667(class252.field3173, class252.field3196, class252.field3091);
        } else if (arg0 == 11) {
            class91.method667(class252.field3092, class252.field3093, class252.field3179);
        } else if (arg0 == 12) {
            class91.method667(class252.field3095, class252.field3096, class252.field3097);
        } else if (arg0 == 13) {
            class91.method667(class252.field3098, class252.field3099, class252.field3100);
        } else if (arg0 == 14) {
            class91.method667(class252.field3101, class252.field3102, class252.field3103);
        } else if (arg0 == 16) {
            class91.method667(class252.field3104, class252.field3105, class252.field3106);
        } else if (arg0 == 17) {
            class91.method667(class252.field3107, class252.field3108, class252.field3125);
        } else if (arg0 == 18) {
            class91.method667(class252.field3110, class252.field3238, class252.field3112);
        } else if (arg0 == 19) {
            class91.method667(class252.field3113, class252.field3153, class252.field3115);
        } else if (arg0 == 20) {
            class91.method667(class252.field3116, class252.field3117, class252.field3118);
        } else if (arg0 == 22) {
            class91.method667(class252.field3119, class252.field3192, class252.field3027);
        } else if (arg0 == 23) {
            class91.method667(class252.field3122, class252.field3123, class252.field3124);
        } else if (arg0 == 24) {
            class91.method667(class252.field3090, class252.field3126, class252.field3127);
        } else if (arg0 == 25) {
            class91.method667(class252.field3128, class252.field3129, class252.field3130);
        } else if (arg0 == 26) {
            class91.method667(class252.field3070, class252.field3048, class252.field3257);
        } else if (arg0 == 27) {
            class91.method667(class252.field3134, class252.field3135, class252.field3049);
        } else if (arg0 == 31) {
            class91.method667(class252.field3143, class252.field3202, class252.field3145);
        } else if (arg0 == 32) {
            class91.method667(class252.field3146, class252.field3147, class252.field3148);
        } else if (arg0 == 37) {
            class91.method667(class252.field3026, class252.field3227, class252.field3025);
        } else if (arg0 == 38) {
            class91.method667(class252.field3152, class252.field3061, class252.field3154);
        } else if (arg0 == 55) {
            class91.method667(class252.field3084, class252.field3120, class252.field3157);
        } else if (arg0 == 56) {
            class91.method667(class252.field3158, class252.field3159, class252.field3197);
            method4667(11);
            return;
        } else if (arg0 == 57) {
            class91.method667(class252.field3218, class252.field3162, class252.field3295);
            method4667(11);
            return;
        } else {
            class91.method667(class252.field3175, class252.field3161, class252.field3166);
        }
        method4667(10);
    }

    @ObfuscatedName("i.ez(I)V")
    public static final void method71() {
        field900.method1931();
        class287.field3751.method3700();
        class274.method2935();
        class275.method3891();
        class283.field3591.method3700();
        class283.field3592.method3700();
        class283.field3593.method3700();
        class283.field3594.method3700();
        class286.method4365();
        class284.method143();
        class288.field3759.method3700();
        class288.field3755.method3700();
        class273.method3509();
        class278.method3097();
        class269.field3445.method3700();
        class282.field3566.method3700();
        class282.field3567.method3700();
        class282.field3568.method3700();
        class276.method3150();
        class280.field3549.method3700();
        class279.field3542.method3700();
        class270.method1713();
        Statics.method696();
        class243.field2820.method3700();
        class243.field2918.method3700();
        class243.field2871.method3700();
        class243.field2823.method3700();
        ((class124) Statics.field1941).method2397();
        class97.field1440.method3700();
        Statics.field348.method4296();
        Statics.field38.method4296();
        Statics.field2583.method4296();
        Statics.field2279.method4296();
        Statics.field3342.method4296();
        Statics.field2129.method4296();
        Statics.field955.method4296();
        Statics.field2028.method4296();
        Statics.field1301.method4296();
        Statics.field313.method4296();
        Statics.field771.method4296();
        Statics.field9.method4296();
        Statics.field1312.method2873();
        for (int var0 = 0; var0 < 4; var0++) {
            field886[var0].method3139();
        }
        System.gc();
        class230.field2695 = 1;
        Statics.field2688 = null;
        Statics.field2692 = -1;
        Statics.field1332 = -1;
        Statics.field2693 = 0;
        Statics.field507 = false;
        Statics.field3700 = 2;
        field1116 = -1;
        field971 = false;
        class81.method17();
        method4667(10);
    }

    @ObfuscatedName("bc.eo(I)V")
    public static final void method678() {
        if (field887 > 0) {
            method71();
        } else {
            field1078.method4933();
            method4667(40);
            Statics.field1913 = field900.method1917();
            field900.method1922();
        }
    }

    @ObfuscatedName("e.ek(ZI)V")
    public static final void method15(boolean arg0) {
        if (arg0) {
            field1041 = class91.field1364 ? class159.field2142 : class159.field2144;
        } else {
            field1041 = Statics.field663.field1225.containsKey(class319.method5019(class91.field1359)) ? class159.field2141 : class159.field2146;
        }
    }

    @ObfuscatedName("client.er(B)V")
    public final void method1213() {
        if (field1070 > 1) {
            field1070--;
        }
        if (field887 > 0) {
            field887--;
        }
        if (field902) {
            field902 = false;
            method678();
            return;
        }
        if (!field987) {
            method474();
            field988[0] = class252.field3045;
            field994[0] = "";
            field991[0] = 1006;
            field995[0] = false;
            field1075 = 1;
        }
        for (int var1 = 0; var1 < 100 && this.method1104(field900); var1++) {
        }
        if (field986 != 30) {
            return;
        }
        while (true) {
            class326 var2 = (class326) class327.field3951.method3762();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field1078.field3814) {
                    class185 var6 = class185.method251(class182.field2405, field900.field1471);
                    var6.field2497.method3243(0);
                    int var7 = var6.field2497.field2568;
                    field1078.method4913(var6.field2497);
                    var6.field2497.method3256(var6.field2497.field2568 - var7);
                    field900.method1921(var6);
                    field1078.method4912();
                }
                Object var8 = Statics.field263.field804;
                synchronized (Statics.field263.field804) {
                    if (!field879) {
                        Statics.field263.field808 = 0;
                    } else if (class61.field729 != 0 || Statics.field263.field808 >= 40) {
                        class185 var9 = class185.method251(class182.field2446, field900.field1471);
                        var9.field2497.method3243(0);
                        int var10 = var9.field2497.field2568;
                        int var11 = 0;
                        for (int var12 = 0; var12 < Statics.field263.field808 && var9.field2497.field2568 - var10 < 240; var12++) {
                            var11++;
                            int var13 = Statics.field263.field807[var12];
                            if (var13 < 0) {
                                var13 = 0;
                            } else if (var13 > 502) {
                                var13 = 502;
                            }
                            int var14 = Statics.field263.field806[var12];
                            if (var14 < 0) {
                                var14 = 0;
                            } else if (var14 > 764) {
                                var14 = 764;
                            }
                            int var15 = var13 * 765 + var14;
                            if (Statics.field263.field807[var12] == -1 && Statics.field263.field806[var12] == -1) {
                                var14 = -1;
                                var13 = -1;
                                var15 = 524287;
                            }
                            if (field911 != var14 || field869 != var13) {
                                int var16 = var14 - field911;
                                field911 = var14;
                                int var17 = var13 - field869;
                                field869 = var13;
                                if (field870 < 8 && var16 >= -32 && var16 <= 31 && var17 >= -32 && var17 <= 31) {
                                    var16 += 32;
                                    var17 += 32;
                                    var9.field2497.method3360((field870 << 12) + (var16 << 6) + var17);
                                    field870 = 0;
                                } else if (field870 < 8) {
                                    var9.field2497.method3325((field870 << 19) + 8388608 + var15);
                                    field870 = 0;
                                } else {
                                    var9.field2497.method3326((field870 << 19) + -1073741824 + var15);
                                    field870 = 0;
                                }
                            } else if (field870 < 2047) {
                                field870++;
                            }
                        }
                        var9.field2497.method3256(var9.field2497.field2568 - var10);
                        field900.method1921(var9);
                        if (var11 >= Statics.field263.field808) {
                            Statics.field263.field808 = 0;
                        } else {
                            Statics.field263.field808 -= var11;
                            for (int var18 = 0; var18 < Statics.field263.field808; var18++) {
                                Statics.field263.field806[var18] = Statics.field263.field806[var11 + var18];
                                Statics.field263.field807[var18] = Statics.field263.field807[var11 + var18];
                            }
                        }
                    }
                }
                if (class61.field729 == 1 || !Statics.field3560 && class61.field729 == 4 || class61.field729 == 2) {
                    long var20 = (class61.field732 - field867 * -1L) / 50L;
                    if (var20 > 4095L) {
                        var20 = 4095L;
                    }
                    field867 = class61.field732 * -1L;
                    int var22 = class61.field728;
                    if (var22 < 0) {
                        var22 = 0;
                    } else if (var22 > Statics.field2582) {
                        var22 = Statics.field2582;
                    }
                    int var23 = class61.field722;
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 > Statics.field695) {
                        var23 = Statics.field695;
                    }
                    int var24 = (int) var20;
                    class185 var25 = class185.method251(class182.field2431, field900.field1471);
                    var25.field2497.method3360((var24 << 1) + (class61.field729 == 2 ? 1 : 0));
                    var25.field2497.method3360(var23);
                    var25.field2497.method3360(var22);
                    field900.method1921(var25);
                }
                if (class52.field640 > 0) {
                    class185 var26 = class185.method251(class182.field2377, field900.field1471);
                    var26.field2497.method3360(0);
                    int var27 = var26.field2497.field2568;
                    long var28 = class197.method1501();
                    for (int var30 = 0; var30 < class52.field640; var30++) {
                        long var31 = var28 - field1073;
                        if (var31 > 16777215L) {
                            var31 = 16777215L;
                        }
                        field1073 = var28;
                        var26.field2497.method3274(class52.field639[var30]);
                        var26.field2497.method3325((int) var31);
                    }
                    var26.field2497.method3271(var26.field2497.field2568 - var27);
                    field900.method1921(var26);
                }
                if (field935 > 0) {
                    field935--;
                }
                if (class52.field637[96] || class52.field637[97] || class52.field637[98] || class52.field637[99]) {
                    field1121 = true;
                }
                if (field1121 && field935 <= 0) {
                    field935 = 20;
                    field1121 = false;
                    class185 var33 = class185.method251(class182.field2471, field900.field1471);
                    var33.field2497.method3360(field880);
                    var33.field2497.method3360(field923);
                    field900.method1921(var33);
                }
                if (Statics.field3806 && !field865) {
                    field865 = true;
                    class185 var34 = class185.method251(class182.field2380, field900.field1471);
                    var34.field2497.method3243(1);
                    field900.method1921(var34);
                }
                if (!Statics.field3806 && field865) {
                    field865 = false;
                    class185 var35 = class185.method251(class182.field2380, field900.field1471);
                    var35.field2497.method3243(0);
                    field900.method1921(var35);
                }
                if (Statics.field3008 != null) {
                    Statics.field3008.method5603();
                }
                if (Statics.field589) {
                    if (Statics.field785 != null) {
                        Statics.field785.method5010();
                    }
                    method108();
                    Statics.field589 = false;
                }
                if (Statics.field505 != field1074) {
                    field1074 = Statics.field505;
                    int var36 = Statics.field505;
                    int[] var37 = Statics.field382.field3983;
                    int var38 = var37.length;
                    for (int var39 = 0; var39 < var38; var39++) {
                        var37[var39] = 0;
                    }
                    for (int var40 = 1; var40 < 103; var40++) {
                        int var41 = (103 - var40) * 2048 + 24628;
                        for (int var42 = 1; var42 < 103; var42++) {
                            if ((class63.field736[var36][var42][var40] & 0x18) == 0) {
                                Statics.field1312.method2764(var37, var41, 512, var36, var42, var40);
                            }
                            if (var36 < 3 && (class63.field736[var36 + 1][var42][var40] & 0x8) != 0) {
                                Statics.field1312.method2764(var37, var41, 512, var36 + 1, var42, var40);
                            }
                            var41 += 4;
                        }
                    }
                    int var43 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var44 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field382.method5447();
                    for (int var45 = 1; var45 < 103; var45++) {
                        for (int var46 = 1; var46 < 103; var46++) {
                            if ((class63.field736[var36][var46][var45] & 0x18) == 0) {
                                method30(var36, var46, var45, var43, var44);
                            }
                            if (var36 < 3 && (class63.field736[var36 + 1][var46][var45] & 0x8) != 0) {
                                method30(var36 + 1, var46, var45, var43, var44);
                            }
                        }
                    }
                    field1007 = 0;
                    for (int var47 = 0; var47 < 104; var47++) {
                        for (int var48 = 0; var48 < 104; var48++) {
                            int var49 = Statics.field1312.method2852(Statics.field505, var47, var48);
                            if (var49 != 0) {
                                int var50 = var49 >> 14 & 0x7FFF;
                                int var51 = class283.method3065(var50).field3617;
                                if (var51 >= 0) {
                                    field1099[field1007] = Statics.field3450[var51].method4492(false);
                                    field1076[field1007] = var47;
                                    field1065[field1007] = var48;
                                    field1007++;
                                }
                            }
                        }
                    }
                    Statics.field340.method5416();
                }
                if (field986 != 30) {
                    return;
                }
                method19();
                method495();
                field900.field1477++;
                if (field900.field1477 > 750) {
                    method678();
                    return;
                }
                int var52 = class94.field1407;
                int[] var53 = class94.field1408;
                for (int var54 = 0; var54 < var52; var54++) {
                    class73 var55 = field967[var53[var54]];
                    if (var55 != null) {
                        method3075(var55, 1);
                    }
                }
                method3226();
                method3239();
                field915++;
                if (field876 != 0) {
                    field954 += 20;
                    if (field954 >= 400) {
                        field876 = 0;
                    }
                }
                if (Statics.field478 != null) {
                    field957++;
                    if (field957 >= 15) {
                        method3073(Statics.field478);
                        Statics.field478 = null;
                    }
                }
                class243 var56 = Statics.field580;
                class243 var57 = Statics.field498;
                Statics.field580 = null;
                Statics.field498 = null;
                field1026 = null;
                field1030 = false;
                field1027 = false;
                field981 = 0;
                while (class52.method181() && field981 < 128) {
                    if (field1018 >= 2 && class52.field637[82] && Statics.field1570 == 66) {
                        String var58 = class96.method1709();
                        Statics.field357.method753(var58);
                    } else if (field928 != 1 || Statics.field352 <= 0) {
                        field1072[field981] = Statics.field1570;
                        field1071[field981] = Statics.field352;
                        field981++;
                    }
                }
                boolean var59 = field1018 >= 2;
                if (var59 && class52.field637[82] && class52.field637[81] && field1103 != 0) {
                    int var60 = Statics.field302.field845 - field1103;
                    if (var60 < 0) {
                        var60 = 0;
                    } else if (var60 > 3) {
                        var60 = 3;
                    }
                    if (Statics.field302.field845 != var60) {
                        method9(Statics.field445 + Statics.field302.field1195[0], Statics.field3556 + Statics.field302.field1196[0], var60, false);
                    }
                    field1103 = 0;
                }
                if (field1011 != -1) {
                    method117(field1011, 0, 0, Statics.field695, Statics.field2582, 0, 0);
                }
                field857++;
                while (true) {
                    class69 var61;
                    class243 var62;
                    class243 var63;
                    do {
                        var61 = (class69) field1019.method3796();
                        if (var61 == null) {
                            while (true) {
                                class69 var64;
                                class243 var65;
                                class243 var66;
                                do {
                                    var64 = (class69) field978.method3796();
                                    if (var64 == null) {
                                        while (true) {
                                            class69 var67;
                                            class243 var68;
                                            class243 var69;
                                            do {
                                                var67 = (class69) field1048.method3796();
                                                if (var67 == null) {
                                                    this.method1105();
                                                    method334();
                                                    if (field1022 != null) {
                                                        this.method1110();
                                                    }
                                                    if (Statics.field2148 != null) {
                                                        method3073(Statics.field2148);
                                                        field964++;
                                                        if (class61.field718 == 0) {
                                                            if (field963) {
                                                                if (Statics.field2148 == Statics.field2115 && field959 != field919) {
                                                                    class243 var70 = Statics.field2148;
                                                                    byte var71 = 0;
                                                                    if (field1014 == 1 && var70.field2922 == 206) {
                                                                        var71 = 1;
                                                                    }
                                                                    if (var70.field2944[field919] <= 0) {
                                                                        var71 = 0;
                                                                    }
                                                                    if (class244.method4240(method1737(var70))) {
                                                                        int var72 = field959;
                                                                        int var73 = field919;
                                                                        var70.field2944[var73] = var70.field2944[var72];
                                                                        var70.field2954[var73] = var70.field2954[var72];
                                                                        var70.field2944[var72] = -1;
                                                                        var70.field2954[var72] = 0;
                                                                    } else if (var71 == 1) {
                                                                        int var74 = field959;
                                                                        int var75 = field919;
                                                                        while (var74 != var75) {
                                                                            if (var74 > var75) {
                                                                                var70.method4199(var74 - 1, var74);
                                                                                var74--;
                                                                            } else if (var74 < var75) {
                                                                                var70.method4199(var74 + 1, var74);
                                                                                var74++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var70.method4199(field919, field959);
                                                                    }
                                                                    class185 var76 = class185.method251(class182.field2448, field900.field1471);
                                                                    var76.field2497.method3274(var71);
                                                                    var76.field2497.method3304(Statics.field2148.field2856);
                                                                    var76.field2497.method3432(field959);
                                                                    var76.field2497.method3360(field919);
                                                                    field900.method1921(var76);
                                                                }
                                                            } else if (this.method1160()) {
                                                                this.method1107(field1049, field961);
                                                            } else if (field1075 > 0) {
                                                                int var77 = field1049;
                                                                int var78 = field961;
                                                                method482(Statics.field2103, var77, var78);
                                                                Statics.field2103 = null;
                                                            }
                                                            field957 = 10;
                                                            class61.field729 = 0;
                                                            Statics.field2148 = null;
                                                        } else if (field964 >= 5 && (class61.field723 > field1049 + 5 || class61.field723 < field1049 - 5 || class61.field715 > field961 + 5 || class61.field715 < field961 - 5)) {
                                                            field963 = true;
                                                        }
                                                    }
                                                    if (class138.method2775()) {
                                                        int var79 = class138.field1998;
                                                        int var80 = class138.field1986;
                                                        class185 var81 = class185.method251(class182.field2461, field900.field1471);
                                                        var81.field2497.method3243(5);
                                                        var81.field2497.method3243(class52.field637[82] ? (class52.field637[81] ? 2 : 1) : 0);
                                                        var81.field2497.method3294(Statics.field3556 + var80);
                                                        var81.field2497.method3360(Statics.field445 + var79);
                                                        field900.method1921(var81);
                                                        class138.method2740();
                                                        field952 = class61.field722;
                                                        field931 = class61.field728;
                                                        field876 = 1;
                                                        field954 = 0;
                                                        field1079 = var79;
                                                        field1112 = var80;
                                                    }
                                                    if (Statics.field580 != var56) {
                                                        if (var56 != null) {
                                                            method3073(var56);
                                                        }
                                                        if (Statics.field580 != null) {
                                                            method3073(Statics.field580);
                                                        }
                                                    }
                                                    if (Statics.field498 != var57 && field1003 == field1002) {
                                                        if (var57 != null) {
                                                            method3073(var57);
                                                        }
                                                        if (Statics.field498 != null) {
                                                            method3073(Statics.field498);
                                                        }
                                                    }
                                                    if (Statics.field498 == null) {
                                                        if (field1002 > 0) {
                                                            field1002--;
                                                        }
                                                    } else if (field1002 < field1003) {
                                                        field1002++;
                                                        if (field1003 == field1002) {
                                                            method3073(Statics.field498);
                                                        }
                                                    }
                                                    method549();
                                                    if (field1093) {
                                                        int var82 = Statics.field531 * 128 + 64;
                                                        int var83 = Statics.field521 * 128 + 64;
                                                        int var84 = method466(var82, var83, Statics.field505) - Statics.field2174;
                                                        if (Statics.field1606 < var82) {
                                                            Statics.field1606 += Statics.field316 * (var82 - Statics.field1606) / 1000 + Statics.field265;
                                                            if (Statics.field1606 > var82) {
                                                                Statics.field1606 = var82;
                                                            }
                                                        }
                                                        if (Statics.field1606 > var82) {
                                                            Statics.field1606 -= Statics.field316 * (Statics.field1606 - var82) / 1000 + Statics.field265;
                                                            if (Statics.field1606 < var82) {
                                                                Statics.field1606 = var82;
                                                            }
                                                        }
                                                        if (Statics.field617 < var84) {
                                                            Statics.field617 += Statics.field316 * (var84 - Statics.field617) / 1000 + Statics.field265;
                                                            if (Statics.field617 > var84) {
                                                                Statics.field617 = var84;
                                                            }
                                                        }
                                                        if (Statics.field617 > var84) {
                                                            Statics.field617 -= Statics.field316 * (Statics.field617 - var84) / 1000 + Statics.field265;
                                                            if (Statics.field617 < var84) {
                                                                Statics.field617 = var84;
                                                            }
                                                        }
                                                        if (Statics.field446 < var83) {
                                                            Statics.field446 += Statics.field316 * (var83 - Statics.field446) / 1000 + Statics.field265;
                                                            if (Statics.field446 > var83) {
                                                                Statics.field446 = var83;
                                                            }
                                                        }
                                                        if (Statics.field446 > var83) {
                                                            Statics.field446 -= Statics.field316 * (Statics.field446 - var83) / 1000 + Statics.field265;
                                                            if (Statics.field446 < var83) {
                                                                Statics.field446 = var83;
                                                            }
                                                        }
                                                        int var85 = Statics.field18 * 128 + 64;
                                                        int var86 = Statics.field276 * 128 + 64;
                                                        int var87 = method466(var85, var86, Statics.field505) - Statics.field2686;
                                                        int var88 = var85 - Statics.field1606;
                                                        int var89 = var87 - Statics.field617;
                                                        int var90 = var86 - Statics.field446;
                                                        int var91 = (int) Math.sqrt((double) (var88 * var88 + var90 * var90));
                                                        int var92 = (int) (Math.atan2((double) var89, (double) var91) * 325.949D) & 0x7FF;
                                                        int var93 = (int) (Math.atan2((double) var88, (double) var90) * -325.949D) & 0x7FF;
                                                        if (var92 < 128) {
                                                            var92 = 128;
                                                        }
                                                        if (var92 > 383) {
                                                            var92 = 383;
                                                        }
                                                        if (Statics.field658 < var92) {
                                                            Statics.field658 += Statics.field1833 * (var92 - Statics.field658) / 1000 + Statics.field734;
                                                            if (Statics.field658 > var92) {
                                                                Statics.field658 = var92;
                                                            }
                                                        }
                                                        if (Statics.field658 > var92) {
                                                            Statics.field658 -= Statics.field1833 * (Statics.field658 - var92) / 1000 + Statics.field734;
                                                            if (Statics.field658 < var92) {
                                                                Statics.field658 = var92;
                                                            }
                                                        }
                                                        int var94 = var93 - Statics.field3373;
                                                        if (var94 > 1024) {
                                                            var94 -= 2048;
                                                        }
                                                        if (var94 < -1024) {
                                                            var94 += 2048;
                                                        }
                                                        if (var94 > 0) {
                                                            Statics.field3373 += Statics.field1833 * var94 / 1000 + Statics.field734;
                                                            Statics.field3373 &= 0x7FF;
                                                        }
                                                        if (var94 < 0) {
                                                            Statics.field3373 -= Statics.field1833 * -var94 / 1000 + Statics.field734;
                                                            Statics.field3373 &= 0x7FF;
                                                        }
                                                        int var95 = var93 - Statics.field3373;
                                                        if (var95 > 1024) {
                                                            var95 -= 2048;
                                                        }
                                                        if (var95 < -1024) {
                                                            var95 += 2048;
                                                        }
                                                        if (var95 < 0 && var94 > 0 || var95 > 0 && var94 < 0) {
                                                            Statics.field3373 = var93;
                                                        }
                                                    }
                                                    for (int var96 = 0; var96 < 5; var96++) {
                                                        int var10002 = field1092[var96]++;
                                                    }
                                                    Statics.field1438.method1842();
                                                    int var97 = class61.method4854();
                                                    int var98 = class52.method2897();
                                                    if (var97 > 15000 && var98 > 15000) {
                                                        field887 = 250;
                                                        class61.method880(14500);
                                                        class185 var99 = class185.method251(class182.field2456, field900.field1471);
                                                        field900.method1921(var99);
                                                    }
                                                    Statics.field1319.method1575();
                                                    field900.field1478++;
                                                    if (field900.field1478 > 50) {
                                                        class185 var100 = class185.method251(class182.field2452, field900.field1471);
                                                        field900.method1921(var100);
                                                    }
                                                    try {
                                                        field900.method1919();
                                                    } catch (IOException var102) {
                                                        method678();
                                                    }
                                                    return;
                                                }
                                                var68 = var67.field788;
                                                if (var68.field2827 < 0) {
                                                    break;
                                                }
                                                var69 = class243.method20(var68.field2845);
                                            } while (var69 == null || var69.field2822 == null || var68.field2827 >= var69.field2822.length || var69.field2822[var68.field2827] != var68);
                                            class82.method697(var67);
                                        }
                                    }
                                    var65 = var64.field788;
                                    if (var65.field2827 < 0) {
                                        break;
                                    }
                                    var66 = class243.method20(var65.field2845);
                                } while (var66 == null || var66.field2822 == null || var65.field2827 >= var66.field2822.length || var66.field2822[var65.field2827] != var65);
                                class82.method697(var64);
                            }
                        }
                        var62 = var61.field788;
                        if (var62.field2827 < 0) {
                            break;
                        }
                        var63 = class243.method20(var62.field2845);
                    } while (var63 == null || var63.field2822 == null || var62.field2827 >= var63.field2822.length || var63.field2822[var62.field2827] != var62);
                    class82.method697(var61);
                }
            }
            class185 var4 = class185.method251(class182.field2389, field900.field1471);
            var4.field2497.method3243(0);
            int var5 = var4.field2497.field2568;
            class327.method2896(var4.field2497);
            var4.field2497.method3256(var4.field2497.field2568 - var5);
            field900.method1921(var4);
        }
    }

    @ObfuscatedName("go.ee(I)V")
    public static final void method3188() {
        if (Statics.field1464 != null) {
            Statics.field1464.method2082();
        }
        if (Statics.field3703 != null) {
            Statics.field3703.method2082();
        }
    }

    @ObfuscatedName("ao.en(I)V")
    public static final void method495() {
        for (int var0 = 0; var0 < field1087; var0++) {
            int var10002 = field1090[var0]--;
            if (field1090[var0] >= -10) {
                class104 var2 = field960[var0];
                if (var2 == null) {
                    class104 var10000 = (class104) null;
                    var2 = class104.method2011(Statics.field2279, field1088[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field1090[var0] += var2.method2012();
                    field960[var0] = var2;
                }
                if (field1090[var0] < 0) {
                    int var9;
                    if (field905[var0] == 0) {
                        var9 = field1085;
                    } else {
                        int var3 = (field905[var0] & 0xFF) * 128;
                        int var4 = field905[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field302.field1186;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field905[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field302.field1151;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field1090[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field912 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class106 var10 = var2.method2001().method2050(Statics.field674);
                        class116 var11 = class116.method2174(var10, 100, var9);
                        var11.method2176(field1089[var0] - 1);
                        Statics.field432.method1942(var11);
                    }
                    field1090[var0] = -100;
                }
            } else {
                field1087--;
                for (int var1 = var0; var1 < field1087; var1++) {
                    field1088[var1] = field1088[var1 + 1];
                    field960[var1] = field960[var1 + 1];
                    field1089[var1] = field1089[var1 + 1];
                    field1090[var1] = field1090[var1 + 1];
                    field905[var1] = field905[var1 + 1];
                }
                var0--;
            }
        }
        if (!field971) {
            return;
        }
        boolean var12;
        if (class230.field2695 == 0) {
            var12 = Statics.field2691.method3920();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field982 != 0 && field1116 != -1) {
                class230.method992(Statics.field2129, field1116, 0, field982, false);
            }
            field971 = false;
        }
    }

    @ObfuscatedName("at.ev(Lki;IIII)V")
    public static void method504(class288 arg0, int arg1, int arg2, int arg3) {
        if (field1087 >= 50 || field912 == 0 || arg0.field3766 == null || arg1 >= arg0.field3766.length) {
            return;
        }
        int var4 = arg0.field3766[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1088[field1087] = var5;
        field1089[field1087] = var6;
        field1090[field1087] = 0;
        field960[field1087] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field905[field1087] = (var8 << 16) + (var9 << 8) + var7;
        field1087++;
    }

    @ObfuscatedName("be.eg(IIII)V")
    public static void method964(int arg0, int arg1, int arg2) {
        if (field1085 == 0 || arg1 == 0 || field1087 >= 50) {
            return;
        }
        field1088[field1087] = arg0;
        field1089[field1087] = arg1;
        field1090[field1087] = arg2;
        field960[field1087] = null;
        field905[field1087] = 0;
        field1087++;
    }

    @ObfuscatedName("gn.fd(B)V")
    public static final void method3239() {
        int[] var0 = class94.field1408;
        for (int var1 = 0; var1 < class94.field1407; var1++) {
            class73 var2 = field967[var0[var1]];
            if (var2 != null && var2.field1156 > 0) {
                var2.field1156--;
                if (var2.field1156 == 0) {
                    var2.field1153 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field896; var3++) {
            int var4 = field897[var3];
            class85 var5 = field1035[var4];
            if (var5 != null && var5.field1156 > 0) {
                var5.field1156--;
                if (var5.field1156 == 0) {
                    var5.field1153 = null;
                }
            }
        }
    }

    @ObfuscatedName("ax.fq(B)V")
    public static final void method549() {
        if (field928 == 0) {
            int var0 = Statics.field302.field1186;
            int var1 = Statics.field302.field1151;
            if (Statics.field444 - var0 < -500 || Statics.field444 - var0 > 500 || Statics.field2219 - var1 < -500 || Statics.field2219 - var1 > 500) {
                Statics.field444 = var0;
                Statics.field2219 = var1;
            }
            if (Statics.field444 != var0) {
                Statics.field444 += (var0 - Statics.field444) / 16;
            }
            if (Statics.field2219 != var1) {
                Statics.field2219 += (var1 - Statics.field2219) / 16;
            }
            int var2 = Statics.field444 >> 7;
            int var3 = Statics.field2219 >> 7;
            int var4 = method466(Statics.field444, Statics.field2219, Statics.field505);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field505;
                        if (var8 < 3 && (class63.field736[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class63.field738[var8][var6][var7];
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
            if (var10 > field937) {
                field937 += (var10 - field937) / 24;
            } else if (var10 < field937) {
                field937 += (var10 - field937) / 80;
            }
            Statics.field477 = method466(Statics.field302.field1186, Statics.field302.field1151, Statics.field505) - field929;
        } else if (field928 == 1) {
            if (field934 && Statics.field302 != null) {
                int var11 = Statics.field302.field1195[0];
                int var12 = Statics.field302.field1196[0];
                if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                    Statics.field444 = Statics.field302.field1186;
                    Statics.field477 = method466(Statics.field302.field1186, Statics.field302.field1151, Statics.field505) - field929;
                    Statics.field2219 = Statics.field302.field1151;
                    field934 = false;
                }
            }
            short var13 = -1;
            if (class52.field637[33]) {
                var13 = 0;
            } else if (class52.field637[49]) {
                var13 = 1024;
            }
            if (class52.field637[48]) {
                if (var13 == 0) {
                    var13 = 1792;
                } else if (var13 == 1024) {
                    var13 = 1280;
                } else {
                    var13 = 1536;
                }
            } else if (class52.field637[50]) {
                if (var13 == 0) {
                    var13 = 256;
                } else if (var13 == 1024) {
                    var13 = 768;
                } else {
                    var13 = 512;
                }
            }
            byte var14 = 0;
            if (class52.field637[35]) {
                var14 = -1;
            } else if (class52.field637[51]) {
                var14 = 1;
            }
            int var15 = 0;
            if (var13 >= 0 || var14 != 0) {
                var15 = class52.field637[81] ? 128 : 64;
                field898 = var13;
                field932 = var14;
            }
            if (field893 < var15) {
                field893 += var15 / 8;
                if (field893 > var15) {
                    field893 = var15;
                }
            } else if (field893 > var15) {
                field893 = field893 * 9 / 10;
            }
            if (field893 > 0) {
                int var16 = field893 / 16;
                if (field898 >= 0) {
                    int var17 = field898 - Statics.field3373 & 0x7FF;
                    int var18 = class135.field1940[var17];
                    int var19 = class135.field1945[var17];
                    Statics.field444 += var16 * var18 / 65536;
                    Statics.field2219 += var16 * var19 / 65536;
                }
                if (field932 != 0) {
                    Statics.field477 += field932 * var16;
                    if (Statics.field477 > 0) {
                        Statics.field477 = 0;
                    }
                }
            } else {
                field898 = -1;
                field932 = -1;
            }
            if (class52.field637[13]) {
                method13();
            }
        }
        if (class61.field718 == 4 && Statics.field3560) {
            int var20 = class61.field715 - field927;
            field1097 = var20 * 2;
            field927 = var20 == -1 || var20 == 1 ? class61.field715 : (field927 + class61.field715) / 2;
            int var21 = field926 - class61.field723;
            field924 = var21 * 2;
            field926 = var21 == -1 || var21 == 1 ? class61.field723 : (field926 + class61.field723) / 2;
        } else {
            if (class52.field637[96]) {
                field924 += (-24 - field924) / 2;
            } else if (class52.field637[97]) {
                field924 += (24 - field924) / 2;
            } else {
                field924 /= 2;
            }
            if (class52.field637[98]) {
                field1097 += (12 - field1097) / 2;
            } else if (class52.field637[99]) {
                field1097 += (-12 - field1097) / 2;
            } else {
                field1097 /= 2;
            }
            field927 = class61.field715;
            field926 = class61.field723;
        }
        field923 = field924 / 2 + field923 & 0x7FF;
        field880 += field1097 / 2;
        if (field880 < 128) {
            field880 = 128;
        }
        if (field880 > 383) {
            field880 = 383;
        }
    }

    @ObfuscatedName("gj.fr(I)V")
    public static final void method3226() {
        for (int var0 = 0; var0 < field896; var0++) {
            int var1 = field897[var0];
            class85 var2 = field1035[var1];
            if (var2 != null) {
                method3075(var2, var2.field1292.field3710);
            }
        }
    }

    @ObfuscatedName("fg.fy(Lbk;II)V")
    public static final void method3075(class76 arg0, int arg1) {
        if (arg0.field1189 > field866) {
            method31(arg0);
        } else if (arg0.field1187 >= field866) {
            if (field866 == arg0.field1187 || arg0.field1172 == -1 || arg0.field1175 != 0 || arg0.field1174 + 1 > class288.method4510(arg0.field1172).field3758[arg0.field1173]) {
                int var2 = arg0.field1187 - arg0.field1189;
                int var3 = field866 - arg0.field1189;
                int var4 = arg0.field1194 * 64 + arg0.field1168 * 128;
                int var5 = arg0.field1194 * 64 + arg0.field1147 * 128;
                int var6 = arg0.field1194 * 64 + arg0.field1182 * 128;
                int var7 = arg0.field1194 * 64 + arg0.field1185 * 128;
                arg0.field1186 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field1151 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field1198 = 0;
            arg0.field1191 = arg0.field1188;
            arg0.field1183 = arg0.field1191;
        } else {
            arg0.field1169 = arg0.field1181;
            if (arg0.field1193 == 0) {
                arg0.field1198 = 0;
            } else {
                label225: {
                    if (arg0.field1172 != -1 && arg0.field1175 == 0) {
                        class288 var8 = class288.method4510(arg0.field1172);
                        if (arg0.field1199 > 0 && var8.field3767 == 0) {
                            arg0.field1198++;
                            break label225;
                        }
                        if (arg0.field1199 <= 0 && var8.field3768 == 0) {
                            arg0.field1198++;
                            break label225;
                        }
                    }
                    int var9 = arg0.field1186;
                    int var10 = arg0.field1151;
                    int var11 = arg0.field1195[arg0.field1193 - 1] * 128 + arg0.field1194 * 64;
                    int var12 = arg0.field1196[arg0.field1193 - 1] * 128 + arg0.field1194 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field1191 = 1280;
                        } else if (var10 > var12) {
                            arg0.field1191 = 1792;
                        } else {
                            arg0.field1191 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field1191 = 768;
                        } else if (var10 > var12) {
                            arg0.field1191 = 256;
                        } else {
                            arg0.field1191 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field1191 = 1024;
                    } else if (var10 > var12) {
                        arg0.field1191 = 0;
                    }
                    byte var13 = arg0.field1160[arg0.field1193 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field1191 - arg0.field1183 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field1140;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field1164;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field1148;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field1150;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field1164;
                        }
                        arg0.field1169 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class85) {
                            var17 = ((class85) arg0).field1292.field3709;
                        }
                        if (var17) {
                            if (arg0.field1191 != arg0.field1183 && arg0.field1139 == -1 && arg0.field1184 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field1193 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field1193 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field1198 > 0 && arg0.field1193 > 1) {
                                var16 = 8;
                                arg0.field1198--;
                            }
                        } else {
                            if (arg0.field1193 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field1193 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field1198 > 0 && arg0.field1193 > 1) {
                                var16 = 8;
                                arg0.field1198--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field1169 == arg0.field1164 && arg0.field1152 != -1) {
                            arg0.field1169 = arg0.field1152;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field1186 += var16;
                                if (arg0.field1186 > var11) {
                                    arg0.field1186 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field1186 -= var16;
                                if (arg0.field1186 < var11) {
                                    arg0.field1186 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field1151 += var16;
                                if (arg0.field1151 > var12) {
                                    arg0.field1151 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field1151 -= var16;
                                if (arg0.field1151 < var12) {
                                    arg0.field1151 = var12;
                                }
                            }
                        }
                        if (arg0.field1186 == var11 && arg0.field1151 == var12) {
                            arg0.field1193--;
                            if (arg0.field1199 > 0) {
                                arg0.field1199--;
                            }
                        }
                    } else {
                        arg0.field1186 = var11;
                        arg0.field1151 = var12;
                        arg0.field1193--;
                        if (arg0.field1199 > 0) {
                            arg0.field1199--;
                        }
                    }
                }
            }
        }
        if (arg0.field1186 < 128 || arg0.field1151 < 128 || arg0.field1186 >= 13184 || arg0.field1151 >= 13184) {
            arg0.field1172 = -1;
            arg0.field1177 = -1;
            arg0.field1189 = 0;
            arg0.field1187 = 0;
            arg0.field1186 = arg0.field1195[0] * 128 + arg0.field1194 * 64;
            arg0.field1151 = arg0.field1196[0] * 128 + arg0.field1194 * 64;
            arg0.method1504();
        }
        if (Statics.field302 == arg0 && (arg0.field1186 < 1536 || arg0.field1151 < 1536 || arg0.field1186 >= 11776 || arg0.field1151 >= 11776)) {
            arg0.field1172 = -1;
            arg0.field1177 = -1;
            arg0.field1189 = 0;
            arg0.field1187 = 0;
            arg0.field1186 = arg0.field1195[0] * 128 + arg0.field1194 * 64;
            arg0.field1151 = arg0.field1196[0] * 128 + arg0.field1194 * 64;
            arg0.method1504();
        }
        method4252(arg0);
        method559(arg0);
    }

    @ObfuscatedName("k.fl(Lbk;I)V")
    public static final void method31(class76 arg0) {
        int var1 = arg0.field1189 - field866;
        int var2 = arg0.field1194 * 64 + arg0.field1168 * 128;
        int var3 = arg0.field1194 * 64 + arg0.field1147 * 128;
        arg0.field1186 += (var2 - arg0.field1186) / var1;
        arg0.field1151 += (var3 - arg0.field1151) / var1;
        arg0.field1198 = 0;
        arg0.field1191 = arg0.field1188;
    }

    @ObfuscatedName("io.fu(Lbk;B)V")
    public static final void method4252(class76 arg0) {
        if (arg0.field1184 == 0) {
            return;
        }
        if (arg0.field1139 != -1) {
            class76 var1 = null;
            if (arg0.field1139 < 32768) {
                var1 = field1035[arg0.field1139];
            } else if (arg0.field1139 >= 32768) {
                var1 = field967[arg0.field1139 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1186 - var1.field1186;
                int var3 = arg0.field1151 - var1.field1151;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1191 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1167) {
                arg0.field1139 = -1;
                arg0.field1167 = false;
            }
        }
        if (arg0.field1143 != -1 && (arg0.field1193 == 0 || arg0.field1198 > 0)) {
            arg0.field1191 = arg0.field1143;
            arg0.field1143 = -1;
        }
        int var4 = arg0.field1191 - arg0.field1183 & 0x7FF;
        if (var4 == 0 && arg0.field1167) {
            arg0.field1139 = -1;
            arg0.field1167 = false;
        }
        if (var4 == 0) {
            arg0.field1192 = 0;
            return;
        }
        arg0.field1192++;
        if (var4 > 1024) {
            arg0.field1183 -= arg0.field1184;
            boolean var5 = true;
            if (var4 < arg0.field1184 || var4 > 2048 - arg0.field1184) {
                arg0.field1183 = arg0.field1191;
                var5 = false;
            }
            if (arg0.field1181 == arg0.field1169 && (arg0.field1192 > 25 || var5)) {
                if (arg0.field1146 == -1) {
                    arg0.field1169 = arg0.field1164;
                } else {
                    arg0.field1169 = arg0.field1146;
                }
            }
        } else {
            arg0.field1183 += arg0.field1184;
            boolean var6 = true;
            if (var4 < arg0.field1184 || var4 > 2048 - arg0.field1184) {
                arg0.field1183 = arg0.field1191;
                var6 = false;
            }
            if (arg0.field1181 == arg0.field1169 && (arg0.field1192 > 25 || var6)) {
                if (arg0.field1149 == -1) {
                    arg0.field1169 = arg0.field1164;
                } else {
                    arg0.field1169 = arg0.field1149;
                }
            }
        }
        arg0.field1183 &= 0x7FF;
    }

    @ObfuscatedName("ah.fh(Lbk;I)V")
    public static final void method559(class76 arg0) {
        arg0.field1142 = false;
        if (arg0.field1169 != -1) {
            class288 var1 = class288.method4510(arg0.field1169);
            if (var1 == null || var1.field3764 == null) {
                arg0.field1169 = -1;
            } else {
                arg0.field1171++;
                if (arg0.field1170 < var1.field3764.length && arg0.field1171 > var1.field3758[arg0.field1170]) {
                    arg0.field1171 = 1;
                    arg0.field1170++;
                    method504(var1, arg0.field1170, arg0.field1186, arg0.field1151);
                }
                if (arg0.field1170 >= var1.field3764.length) {
                    arg0.field1171 = 0;
                    arg0.field1170 = 0;
                    method504(var1, arg0.field1170, arg0.field1186, arg0.field1151);
                }
            }
        }
        if (arg0.field1177 != -1 && field866 >= arg0.field1180) {
            if (arg0.field1178 < 0) {
                arg0.field1178 = 0;
            }
            int var2 = class273.method698(arg0.field1177).field3485;
            if (var2 == -1) {
                arg0.field1177 = -1;
            } else {
                class288 var3 = class288.method4510(var2);
                if (var3 == null || var3.field3764 == null) {
                    arg0.field1177 = -1;
                } else {
                    arg0.field1179++;
                    if (arg0.field1178 < var3.field3764.length && arg0.field1179 > var3.field3758[arg0.field1178]) {
                        arg0.field1179 = 1;
                        arg0.field1178++;
                        method504(var3, arg0.field1178, arg0.field1186, arg0.field1151);
                    }
                    if (arg0.field1178 >= var3.field3764.length && (arg0.field1178 < 0 || arg0.field1178 >= var3.field3764.length)) {
                        arg0.field1177 = -1;
                    }
                }
            }
        }
        if (arg0.field1172 != -1 && arg0.field1175 <= 1) {
            class288 var4 = class288.method4510(arg0.field1172);
            if (var4.field3767 == 1 && arg0.field1199 > 0 && arg0.field1189 <= field866 && arg0.field1187 < field866) {
                arg0.field1175 = 1;
                return;
            }
        }
        if (arg0.field1172 != -1 && arg0.field1175 == 0) {
            class288 var5 = class288.method4510(arg0.field1172);
            if (var5 == null || var5.field3764 == null) {
                arg0.field1172 = -1;
            } else {
                arg0.field1174++;
                if (arg0.field1173 < var5.field3764.length && arg0.field1174 > var5.field3758[arg0.field1173]) {
                    arg0.field1174 = 1;
                    arg0.field1173++;
                    method504(var5, arg0.field1173, arg0.field1186, arg0.field1151);
                }
                if (arg0.field1173 >= var5.field3764.length) {
                    arg0.field1173 -= var5.field3760;
                    arg0.field1176++;
                    if (arg0.field1176 >= var5.field3754) {
                        arg0.field1172 = -1;
                    } else if (arg0.field1173 >= 0 && arg0.field1173 < var5.field3764.length) {
                        method504(var5, arg0.field1173, arg0.field1186, arg0.field1151);
                    } else {
                        arg0.field1172 = -1;
                    }
                }
                arg0.field1142 = var5.field3762;
            }
        }
        if (arg0.field1175 > 0) {
            arg0.field1175--;
        }
    }

    @ObfuscatedName("ai.fs(B)V")
    public static void method334() {
        if (Statics.field3008 != null) {
            Statics.field3008.method5705(Statics.field505, (Statics.field302.field1186 >> 7) + Statics.field445, (Statics.field302.field1151 >> 7) + Statics.field3556, false);
            Statics.field3008.method5630();
        }
    }

    @ObfuscatedName("la.fm(Lbd;III)V")
    public static void method5258(class73 arg0, int arg1, int arg2) {
        if (arg0.field1172 == arg1 && arg1 != -1) {
            int var3 = class288.method4510(arg1).field3756;
            if (var3 == 1) {
                arg0.field1173 = 0;
                arg0.field1174 = 0;
                arg0.field1175 = arg2;
                arg0.field1176 = 0;
            }
            if (var3 == 2) {
                arg0.field1176 = 0;
            }
        } else if (arg1 == -1 || arg0.field1172 == -1 || class288.method4510(arg1).field3763 >= class288.method4510(arg0.field1172).field3763) {
            arg0.field1172 = arg1;
            arg0.field1173 = 0;
            arg0.field1174 = 0;
            arg0.field1175 = arg2;
            arg0.field1176 = 0;
            arg0.field1199 = arg0.field1193;
        }
    }

    @ObfuscatedName("aw.fa(I)I")
    public static int method238() {
        return field1063 ? 2 : 1;
    }

    @ObfuscatedName("ks.fv(IB)V")
    public static void method4904(int arg0) {
        field1062 = 0L;
        if (arg0 >= 2) {
            field1063 = true;
        } else {
            field1063 = false;
        }
        if (method238() == 1) {
            Statics.field357.method788(765, 503);
        } else {
            Statics.field357.method788(7680, 2160);
        }
        if (field986 < 25) {
            return;
        }
        class185 var1 = class185.method251(class182.field2416, field900.field1471);
        var1.field2497.method3243(method238());
        var1.field2497.method3360(Statics.field695);
        var1.field2497.method3360(Statics.field2582);
        field900.method1921(var1);
    }

    @ObfuscatedName("client.v(I)V")
    public final void method799() {
        field1062 = class197.method1501() + 500L;
        this.method1102();
        if (field1011 != -1) {
            this.method1108(true);
        }
    }

    @ObfuscatedName("client.fe(B)V")
    public void method1102() {
        int var1 = Statics.field695;
        int var2 = Statics.field2582;
        if (this.field679 < var1) {
            int var3 = this.field679;
        }
        if (this.field692 < var2) {
            int var4 = this.field692;
        }
        if (Statics.field663 != null) {
            try {
                class54.method684(Statics.field357, "resize", new Object[] { method238() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.ft(B)V")
    public final void method1194() {
        if (field1011 != -1) {
            method3594(field1011);
        }
        for (int var1 = 0; var1 < field1052; var1++) {
            if (field1054[var1]) {
                field1044[var1] = true;
            }
            field1056[var1] = field1054[var1];
            field1054[var1] = false;
        }
        field1053 = field866;
        field1000 = -1;
        field920 = -1;
        Statics.field2115 = null;
        if (field1011 != -1) {
            field1052 = 0;
            method1(field1011, 0, 0, Statics.field695, Statics.field2582, 0, 0, -1);
        }
        class328.method5339();
        if (field987) {
            int var7 = Statics.field803;
            int var8 = Statics.field3389;
            int var9 = Statics.field1290;
            int var10 = Statics.field3878;
            int var11 = 6116423;
            class328.method5381(var7, var8, var9, var10, var11);
            class328.method5381(var7 + 1, var8 + 1, var9 - 2, 16, 0);
            class328.method5394(var7 + 1, var8 + 18, var9 - 2, var10 - 19, 0);
            Statics.field2079.method5232(class252.field3299, var7 + 3, var8 + 14, var11, -1);
            int var12 = class61.field723;
            int var13 = class61.field715;
            for (int var14 = 0; var14 < field1075; var14++) {
                int var15 = (field1075 - 1 - var14) * 15 + var8 + 31;
                int var16 = 16777215;
                if (var12 > var7 && var12 < var7 + var9 && var13 > var15 - 13 && var13 < var15 + 3) {
                    var16 = 16776960;
                }
                Statics.field2079.method5232(method161(var14), var7 + 3, var15, var16, 0);
            }
            method3161(Statics.field803, Statics.field3389, Statics.field1290, Statics.field3878);
        } else if (field1000 != -1) {
            int var2 = field1000;
            int var3 = field920;
            if ((field1075 >= 2 || field1004 != 0 || field1006) && field1050) {
                int var4 = field1075 - 1;
                String var6;
                if (field1004 == 1 && field1075 < 2) {
                    var6 = class252.field3170 + class252.field3180 + field1005 + " " + class87.field1306;
                } else if (field1006 && field1075 < 2) {
                    var6 = field1098 + class252.field3180 + field942 + " " + class87.field1306;
                } else {
                    var6 = method161(var4);
                }
                if (field1075 > 2) {
                    var6 = var6 + class87.method3100(16777215) + " " + '/' + " " + (field1075 - 2) + class252.field3174;
                }
                Statics.field2079.method5170(var6, var2 + 4, var3 + 15, 16777215, 0, field866 / 1000);
            }
        }
        if (field1061 == 3) {
            for (int var17 = 0; var17 < field1052; var17++) {
                if (field1056[var17]) {
                    class328.method5347(field930[var17], field1058[var17], field1059[var17], field1060[var17], 16711935, 128);
                } else if (field1044[var17]) {
                    class328.method5347(field930[var17], field1058[var17], field1059[var17], field1060[var17], 16711680, 128);
                }
            }
        }
        class81.method64(Statics.field505, Statics.field302.field1186, Statics.field302.field1151, field915);
        field915 = 0;
    }

    @ObfuscatedName("bc.fi(Ljava/lang/String;ZI)V")
    public static final void method680(String arg0, boolean arg1) {
        if (!field966) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field648.method5205(arg0, 250);
        int var6 = Statics.field648.method5160(arg0, 250) * 13;
        class328.method5381(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class328.method5394(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field648.method5174(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2933(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field340.method733(0, 0);
        } else {
            method3161(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("fz.fw(IIIIZI)V")
    public static final void method3101(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1100 - field872) * var5 / 100 + field872;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field1105) {
            short var8 = field1105;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field861) {
                var6 = field861;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class328.method5339();
                    class328.method5381(arg0, arg1, var10, arg3, -16777216);
                    class328.method5381(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field993) {
            short var11 = field993;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field894) {
                var6 = field894;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class328.method5339();
                    class328.method5381(arg0, arg1, arg2, var13, -16777216);
                    class328.method5381(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field1102 - field1101) * var5 / 100 + field1101;
        field1111 = arg3 * var6 * var14 / 85504 << 1;
        if (field877 != arg2 || field1110 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class135.field1940[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class138.method2735(var15, 500, 800, arg2, arg3);
        }
        field1107 = arg0;
        field1108 = arg1;
        field877 = arg2;
        field1110 = arg3;
    }

    @ObfuscatedName("cc.fg(I)V")
    public static void method1750() {
        if (field970) {
            method2612(Statics.field302, false);
        }
    }

    @ObfuscatedName("t.ff(S)V")
    public static void method65() {
        if (field1104 >= 0 && field967[field1104] != null) {
            method2612(field967[field1104], false);
        }
    }

    @ObfuscatedName("gt.fx(I)V")
    public static void method3596() {
        int var0 = class94.field1407;
        int[] var1 = class94.field1408;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field1104 != var1[var2] && field1091 != var1[var2]) {
                method2612(field967[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("ex.fp(Lbd;ZI)V")
    public static void method2612(class73 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1048() || arg0.field844) {
            return;
        }
        int var2 = arg0.field846 << 14;
        arg0.field842 = false;
        if ((field862 && class94.field1407 > 50 || class94.field1407 > 200) && arg1 && arg0.field1181 == arg0.field1169) {
            arg0.field842 = true;
        }
        int var3 = arg0.field1186 >> 7;
        int var4 = arg0.field1151 >> 7;
        if (var3 < 0 || var3 >= 104 || var4 < 0 || var4 >= 104) {
            return;
        }
        if (arg0.field837 != null && field866 >= arg0.field832 && field866 < arg0.field823) {
            arg0.field842 = false;
            arg0.field840 = method466(arg0.field1186, arg0.field1151, Statics.field505);
            arg0.field1144 = field866;
            Statics.field1312.method2729(Statics.field505, arg0.field1186, arg0.field1151, arg0.field840, 60, arg0, arg0.field1183, var2, arg0.field833, arg0.field839, arg0.field847, arg0.field835);
            return;
        }
        if ((arg0.field1186 & 0x7F) == 64 && (arg0.field1151 & 0x7F) == 64) {
            if (field1109 == field948[var3][var4]) {
                return;
            }
            field948[var3][var4] = field1109;
        }
        arg0.field840 = method466(arg0.field1186, arg0.field1151, Statics.field505);
        arg0.field1144 = field866;
        Statics.field1312.method2794(Statics.field505, arg0.field1186, arg0.field1151, arg0.field840, 60, arg0, arg0.field1183, var2, arg0.field1142);
    }

    @ObfuscatedName("ap.fz(ZI)V")
    public static final void method211(boolean arg0) {
        for (int var1 = 0; var1 < field896; var1++) {
            class85 var2 = field1035[field897[var1]];
            int var3 = (field897[var1] << 14) + 536870912;
            if (var2 != null && var2.method1048() && var2.field1292.field3740 == arg0 && var2.field1292.method4822()) {
                int var4 = var2.field1186 >> 7;
                int var5 = var2.field1151 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1194 == 1 && (var2.field1186 & 0x7F) == 64 && (var2.field1151 & 0x7F) == 64) {
                        if (field1109 == field948[var4][var5]) {
                            continue;
                        }
                        field948[var4][var5] = field1109;
                    }
                    if (!var2.field1292.field3719) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    var2.field1144 = field866;
                    Statics.field1312.method2794(Statics.field505, var2.field1186, var2.field1151, method466(var2.field1186 + (var2.field1194 * 64 - 64), var2.field1151 + (var2.field1194 * 64 - 64), Statics.field505), var2.field1194 * 64 - 64 + 60, var2, var2.field1183, var3, var2.field1142);
                }
            }
        }
    }

    @ObfuscatedName("eq.fb(I)V")
    public static final void method2905() {
        for (class92 var0 = (class92) field871.method3798(); var0 != null; var0 = (class92) field871.method3800()) {
            if (Statics.field505 != var0.field1373 || field866 > var0.field1372) {
                var0.method3785();
            } else if (field866 >= var0.field1378) {
                if (var0.field1382 > 0) {
                    class85 var1 = field1035[var0.field1382 - 1];
                    if (var1 != null && var1.field1186 >= 0 && var1.field1186 < 13312 && var1.field1151 >= 0 && var1.field1151 < 13312) {
                        var0.method1801(var1.field1186, var1.field1151, method466(var1.field1186, var1.field1151, var0.field1373) - var0.field1377, field866);
                    }
                }
                if (var0.field1382 < 0) {
                    int var2 = -var0.field1382 - 1;
                    class73 var3;
                    if (field1091 == var2) {
                        var3 = Statics.field302;
                    } else {
                        var3 = field967[var2];
                    }
                    if (var3 != null && var3.field1186 >= 0 && var3.field1186 < 13312 && var3.field1151 >= 0 && var3.field1151 < 13312) {
                        var0.method1801(var3.field1186, var3.field1151, method466(var3.field1186, var3.field1151, var0.field1373) - var0.field1377, field866);
                    }
                }
                var0.method1798(field915);
                Statics.field1312.method2794(Statics.field505, (int) var0.field1391, (int) var0.field1385, (int) var0.field1386, 60, var0, var0.field1379, -1, false);
            }
        }
    }

    @ObfuscatedName("bf.fo(I)V")
    public static final void method913() {
        for (class83 var0 = (class83) field1001.method3798(); var0 != null; var0 = (class83) field1001.method3800()) {
            if (Statics.field505 != var0.field1283 || var0.field1281) {
                var0.method3785();
            } else if (field866 >= var0.field1275) {
                var0.method1706(field915);
                if (var0.field1281) {
                    var0.method3785();
                } else {
                    Statics.field1312.method2794(var0.field1283, var0.field1272, var0.field1278, var0.field1277, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("cd.fj(B)I")
    public static final int method1593() {
        if (Statics.field663.field1224) {
            return Statics.field505;
        }
        int var0 = 3;
        if (Statics.field658 < 310) {
            int var1;
            int var2;
            if (field928 == 1) {
                var1 = Statics.field444 >> 7;
                var2 = Statics.field2219 >> 7;
            } else {
                var1 = Statics.field302.field1186 >> 7;
                var2 = Statics.field302.field1151 >> 7;
            }
            int var3 = Statics.field1606 >> 7;
            int var4 = Statics.field446 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field505;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field505;
            }
            if ((class63.field736[Statics.field505][var3][var4] & 0x4) != 0) {
                var0 = Statics.field505;
            }
            int var5;
            if (var1 > var3) {
                var5 = var1 - var3;
            } else {
                var5 = var3 - var1;
            }
            int var6;
            if (var2 > var4) {
                var6 = var2 - var4;
            } else {
                var6 = var4 - var2;
            }
            if (var5 > var6) {
                int var7 = var6 * 65536 / var5;
                int var8 = 32768;
                while (var1 != var3) {
                    if (var3 < var1) {
                        var3++;
                    } else if (var3 > var1) {
                        var3--;
                    }
                    if ((class63.field736[Statics.field505][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field505;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class63.field736[Statics.field505][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field505;
                        }
                    }
                }
            } else if (var6 > 0) {
                int var9 = var5 * 65536 / var6;
                int var10 = 32768;
                while (var2 != var4) {
                    if (var4 < var2) {
                        var4++;
                    } else if (var4 > var2) {
                        var4--;
                    }
                    if ((class63.field736[Statics.field505][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field505;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class63.field736[Statics.field505][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field505;
                        }
                    }
                }
            }
        }
        if (Statics.field302.field1186 >= 0 && Statics.field302.field1151 >= 0 && Statics.field302.field1186 < 13312 && Statics.field302.field1151 < 13312) {
            if ((class63.field736[Statics.field505][Statics.field302.field1186 >> 7][Statics.field302.field1151 >> 7] & 0x4) != 0) {
                var0 = Statics.field505;
            }
            return var0;
        } else {
            return Statics.field505;
        }
    }

    @ObfuscatedName("jh.fc(B)Z")
    public static boolean method4442() {
        return (field989 & 0x4) != 0;
    }

    @ObfuscatedName("bv.fk(B)Z")
    public static boolean method1029() {
        return (field989 & 0x1) != 0;
    }

    @ObfuscatedName("cw.fn(B)Z")
    public static boolean method1804() {
        return (field989 & 0x8) != 0;
    }

    @ObfuscatedName("is.gs(Lbd;B)Z")
    public static boolean method4228(class73 arg0) {
        if (field989 == 0) {
            return false;
        } else if (Statics.field302 == arg0) {
            return method1804();
        } else {
            boolean var1 = method4442() || method1029() && arg0.method1037();
            if (!var1) {
                boolean var2 = (field989 & 0x2) != 0;
                var1 = var2 && arg0.method1064();
            }
            return var1;
        }
    }

    @ObfuscatedName("bi.gh(Lbk;IIIIII)V")
    public static final void method988(class76 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1048()) {
            return;
        }
        if (arg0 instanceof class85) {
            class286 var6 = ((class85) arg0).field1292;
            if (var6.field3734 != null) {
                var6 = var6.method4853();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class94.field1407;
        int[] var8 = class94.field1408;
        byte var9 = 0;
        if (arg1 < var7 && field866 == arg0.field1144 && method4228((class73) arg0)) {
            class73 var10 = (class73) arg0;
            if (arg1 < var7) {
                method2975(arg0, arg0.field1190 + 15);
                class313 var11 = (class313) field1082.get(class310.field3872);
                byte var12 = 9;
                var11.method5222(var10.field848.method5095(), field950 + arg2, field951 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field1165.method3755()) {
            method2975(arg0, arg0.field1190 + 15);
            for (class84 var14 = (class84) arg0.field1165.method3762(); var14 != null; var14 = (class84) arg0.field1165.method3756()) {
                class77 var15 = var14.method1716(field866);
                if (var15 != null) {
                    class276 var16 = var14.field1287;
                    class332 var17 = var16.method4589();
                    class332 var18 = var16.method4588();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field3529;
                    } else {
                        if (var16.field3530 * 2 < var18.field3981) {
                            var19 = var16.field3530;
                        }
                        var20 = var18.field3981 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field866 - var15.field1203;
                    int var24 = var15.field1202 * var20 / var16.field3529;
                    int var27;
                    if (var15.field1205 > var23) {
                        int var25 = var16.field3525 == 0 ? 0 : var23 / var16.field3525 * var16.field3525;
                        int var26 = var15.field1201 * var20 / var16.field3529;
                        var27 = (var24 - var26) * var25 / var15.field1205 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field1205 + var16.field3526 - var23;
                        if (var16.field3524 >= 0) {
                            var21 = (var28 << 8) / (var16.field3526 - var16.field3524);
                        }
                    }
                    if (var15.field1202 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field950 > -1) {
                            int var34 = field950 + arg2 - (var20 >> 1);
                            int var35 = field951 + arg3 - var13;
                            class328.method5381(var34, var35, var27, 5, 65280);
                            class328.method5381(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field3988;
                        var13 += var30;
                        int var31 = field950 + arg2 - (var20 >> 1);
                        int var32 = field951 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method5462(var33, var32, var21);
                            class328.method5341(var33, var32, var29 + var33, var30 + var32);
                            var18.method5462(var33, var32, var21);
                        } else {
                            var17.method5459(var33, var32);
                            class328.method5341(var33, var32, var29 + var33, var30 + var32);
                            var18.method5459(var33, var32);
                        }
                        class328.method5340(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method1717()) {
                    var14.method3785();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class73 var37 = (class73) arg0;
            if (var37.field844) {
                return;
            }
            if (var37.field825 != -1 || var37.field826 != -1) {
                method2975(arg0, arg0.field1190 + 15);
                if (field950 > -1) {
                    if (var37.field825 != -1) {
                        var36 += 25;
                        Statics.field2811[var37.field825].method5459(field950 + arg2 - 12, field951 + arg3 - var36);
                    }
                    if (var37.field826 != -1) {
                        var36 += 25;
                        Statics.field3533[var37.field826].method5459(field950 + arg2 - 12, field951 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field901 == 10 && field1083 == var8[arg1]) {
                method2975(arg0, arg0.field1190 + 15);
                if (field950 > -1) {
                    int var38 = Statics.field1954[1].field3988 + var36;
                    Statics.field1954[1].method5459(field950 + arg2 - 12, field951 + arg3 - var38);
                }
            }
        } else {
            class286 var39 = ((class85) arg0).field1292;
            if (var39.field3734 != null) {
                var39 = var39.method4853();
            }
            if (var39.field3722 >= 0 && var39.field3722 < Statics.field3533.length) {
                method2975(arg0, arg0.field1190 + 15);
                if (field950 > -1) {
                    Statics.field3533[var39.field3722].method5459(field950 + arg2 - 12, field951 + arg3 - 30);
                }
            }
            if (field901 == 1 && field875 == field897[arg1 - var7] && field866 % 20 < 10) {
                method2975(arg0, arg0.field1190 + 15);
                if (field950 > -1) {
                    Statics.field1954[0].method5459(field950 + arg2 - 12, field951 + arg3 - 28);
                }
            }
        }
        if (arg0.field1153 != null && (arg1 >= var7 || !arg0.field1155 && (field873 == 4 || !arg0.field1154 && (field873 == 0 || field873 == 3 || field873 == 1 && ((class73) arg0).method1037())))) {
            method2975(arg0, arg0.field1190);
            if (field950 > -1 && field864 < field939) {
                field943[field864] = Statics.field2079.method5224(arg0.field1153) / 2;
                field1086[field864] = Statics.field2079.field3885;
                field940[field864] = field950;
                field941[field864] = field951;
                field944[field864] = arg0.field1157;
                field916[field864] = arg0.field1197;
                field972[field864] = arg0.field1156;
                field947[field864] = arg0.field1153;
                field864++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field1162[var40];
            int var42 = arg0.field1145[var40];
            class282 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field866) {
                    continue;
                }
                var43 = class282.method4257(arg0.field1145[var40]);
                var44 = var43.field3573;
                if (var43 != null && var43.field3584 != null) {
                    var43 = var43.method4674();
                    if (var43 == null) {
                        arg0.field1162[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field1163[var40];
            class282 var46 = null;
            if (var45 >= 0) {
                var46 = class282.method4257(var45);
                if (var46 != null && var46.field3584 != null) {
                    var46 = var46.method4674();
                }
            }
            if (var41 - var44 <= field866) {
                if (var43 == null) {
                    arg0.field1162[var40] = -1;
                } else {
                    method2975(arg0, arg0.field1190 / 2);
                    if (field950 > -1) {
                        if (var40 == 1) {
                            field951 -= 20;
                        }
                        if (var40 == 2) {
                            field950 -= 15;
                            field951 -= 10;
                        }
                        if (var40 == 3) {
                            field950 += 15;
                            field951 -= 10;
                        }
                        Object var47 = null;
                        Object var48 = null;
                        Object var49 = null;
                        Object var50 = null;
                        int var51 = 0;
                        int var52 = 0;
                        int var53 = 0;
                        int var54 = 0;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        class332 var59 = null;
                        class332 var60 = null;
                        class332 var61 = null;
                        class332 var62 = null;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        class332 var72 = var43.method4676();
                        if (var72 != null) {
                            var51 = var72.field3981;
                            int var73 = var72.field3988;
                            if (var73 > var71) {
                                var71 = var73;
                            }
                            var55 = var72.field3982;
                        }
                        class332 var74 = var43.method4677();
                        if (var74 != null) {
                            var52 = var74.field3981;
                            int var75 = var74.field3988;
                            if (var75 > var71) {
                                var71 = var75;
                            }
                            var56 = var74.field3982;
                        }
                        class332 var76 = var43.method4678();
                        if (var76 != null) {
                            var53 = var76.field3981;
                            int var77 = var76.field3988;
                            if (var77 > var71) {
                                var71 = var77;
                            }
                            var57 = var76.field3982;
                        }
                        class332 var78 = var43.method4689();
                        if (var78 != null) {
                            var54 = var78.field3981;
                            int var79 = var78.field3988;
                            if (var79 > var71) {
                                var71 = var79;
                            }
                            var58 = var78.field3982;
                        }
                        if (var46 != null) {
                            var59 = var46.method4676();
                            if (var59 != null) {
                                var63 = var59.field3981;
                                int var80 = var59.field3988;
                                if (var80 > var71) {
                                    var71 = var80;
                                }
                                var67 = var59.field3982;
                            }
                            var60 = var46.method4677();
                            if (var60 != null) {
                                var64 = var60.field3981;
                                int var81 = var60.field3988;
                                if (var81 > var71) {
                                    var71 = var81;
                                }
                                var68 = var60.field3982;
                            }
                            var61 = var46.method4678();
                            if (var61 != null) {
                                var65 = var61.field3981;
                                int var82 = var61.field3988;
                                if (var82 > var71) {
                                    var71 = var82;
                                }
                                var69 = var61.field3982;
                            }
                            var62 = var46.method4689();
                            if (var62 != null) {
                                var66 = var62.field3981;
                                int var83 = var62.field3988;
                                if (var83 > var71) {
                                    var71 = var83;
                                }
                                var70 = var62.field3982;
                            }
                        }
                        class312 var84 = var43.method4680();
                        if (var84 == null) {
                            var84 = Statics.field548;
                        }
                        class312 var85;
                        if (var46 == null) {
                            var85 = Statics.field548;
                        } else {
                            var85 = var46.method4680();
                            if (var85 == null) {
                                var85 = Statics.field548;
                            }
                        }
                        Object var86 = null;
                        String var87 = null;
                        boolean var88 = false;
                        int var89 = 0;
                        String var90 = var43.method4675(arg0.field1161[var40]);
                        int var91 = var84.method5224(var90);
                        if (var46 != null) {
                            var87 = var46.method4675(arg0.field1166[var40]);
                            var89 = var85.method5224(var87);
                        }
                        int var92 = 0;
                        int var93 = 0;
                        if (var52 > 0) {
                            if (var76 == null && var78 == null) {
                                var92 = 1;
                            } else {
                                var92 = var91 / var52 + 1;
                            }
                        }
                        if (var46 != null && var64 > 0) {
                            if (var61 == null && var62 == null) {
                                var93 = 1;
                            } else {
                                var93 = var89 / var64 + 1;
                            }
                        }
                        int var94 = 0;
                        int var95 = var94;
                        if (var51 > 0) {
                            var94 += var51;
                        }
                        var94 += 2;
                        int var96 = var94;
                        if (var53 > 0) {
                            var94 += var53;
                        }
                        int var97 = var94;
                        int var98 = var94;
                        int var100;
                        if (var52 > 0) {
                            int var99 = var52 * var92;
                            var100 = var94 + var99;
                            var98 = (var99 - var91) / 2 + var94;
                        } else {
                            var100 = var91 + var94;
                        }
                        int var101 = var100;
                        if (var54 > 0) {
                            var100 += var54;
                        }
                        int var102 = 0;
                        int var103 = 0;
                        int var104 = 0;
                        int var105 = 0;
                        int var106 = 0;
                        if (var46 != null) {
                            var100 += 2;
                            var102 = var100;
                            if (var63 > 0) {
                                var100 += var63;
                            }
                            var100 += 2;
                            var103 = var100;
                            if (var65 > 0) {
                                var100 += var65;
                            }
                            var104 = var100;
                            var106 = var100;
                            if (var64 > 0) {
                                int var107 = var64 * var93;
                                var100 += var107;
                                var106 += (var107 - var89) / 2;
                            } else {
                                var100 += var89;
                            }
                            var105 = var100;
                            if (var66 > 0) {
                                var100 += var66;
                            }
                        }
                        int var108 = arg0.field1162[var40] - field866;
                        int var109 = var43.field3585 - var43.field3585 * var108 / var43.field3573;
                        int var110 = var43.field3579 * var108 / var43.field3573 + -var43.field3579;
                        int var111 = field950 + arg2 - (var100 >> 1) + var109;
                        int var112 = field951 + arg3 - 12 + var110;
                        int var113 = var112;
                        int var114 = var71 + var112;
                        int var115 = var43.field3583 + var112 + 15;
                        int var116 = var115 - var84.field3899;
                        int var117 = var84.field3890 + var115;
                        if (var116 < var112) {
                            var113 = var116;
                        }
                        if (var117 > var114) {
                            var114 = var117;
                        }
                        int var118 = 0;
                        if (var46 != null) {
                            var118 = var46.field3583 + var112 + 15;
                            int var119 = var118 - var85.field3899;
                            int var120 = var85.field3890 + var118;
                            if (var119 < var113) {
                                ;
                            }
                            if (var120 > var114) {
                                ;
                            }
                        }
                        int var123 = 255;
                        if (var43.field3587 >= 0) {
                            var123 = (var108 << 8) / (var43.field3573 - var43.field3587);
                        }
                        if (var123 >= 0 && var123 < 255) {
                            if (var72 != null) {
                                var72.method5462(var95 + var111 - var55, var112, var123);
                            }
                            if (var76 != null) {
                                var76.method5462(var96 + var111 - var57, var112, var123);
                            }
                            if (var74 != null) {
                                for (int var124 = 0; var124 < var92; var124++) {
                                    var74.method5462(var52 * var124 + (var97 + var111 - var56), var112, var123);
                                }
                            }
                            if (var78 != null) {
                                var78.method5462(var101 + var111 - var58, var112, var123);
                            }
                            var84.method5165(var90, var98 + var111, var115, var43.field3570, 0, var123);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5462(var102 + var111 - var67, var112, var123);
                                }
                                if (var61 != null) {
                                    var61.method5462(var103 + var111 - var69, var112, var123);
                                }
                                if (var60 != null) {
                                    for (int var125 = 0; var125 < var93; var125++) {
                                        var60.method5462(var64 * var125 + (var104 + var111 - var68), var112, var123);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5462(var105 + var111 - var70, var112, var123);
                                }
                                var85.method5165(var87, var106 + var111, var118, var46.field3570, 0, var123);
                            }
                        } else {
                            if (var72 != null) {
                                var72.method5459(var95 + var111 - var55, var112);
                            }
                            if (var76 != null) {
                                var76.method5459(var96 + var111 - var57, var112);
                            }
                            if (var74 != null) {
                                for (int var126 = 0; var126 < var92; var126++) {
                                    var74.method5459(var52 * var126 + (var97 + var111 - var56), var112);
                                }
                            }
                            if (var78 != null) {
                                var78.method5459(var101 + var111 - var58, var112);
                            }
                            var84.method5232(var90, var98 + var111, var115, var43.field3570 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var59 != null) {
                                    var59.method5459(var102 + var111 - var67, var112);
                                }
                                if (var61 != null) {
                                    var61.method5459(var103 + var111 - var69, var112);
                                }
                                if (var60 != null) {
                                    for (int var127 = 0; var127 < var93; var127++) {
                                        var60.method5459(var64 * var127 + (var104 + var111 - var68), var112);
                                    }
                                }
                                if (var62 != null) {
                                    var62.method5459(var105 + var111 - var70, var112);
                                }
                                var85.method5232(var87, var106 + var111, var118, var46.field3570 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.gl(I)V")
    public static final void method241() {
        field965 = 0;
        int var0 = (Statics.field302.field1186 >> 7) + Statics.field445;
        int var1 = (Statics.field302.field1151 >> 7) + Statics.field3556;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field965 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field965 = 1;
        }
        if (field965 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field965 = 0;
        }
    }

    @ObfuscatedName("ef.ga(IIIII)V")
    public static final void method2887(int arg0, int arg1, int arg2, int arg3) {
        if (field979) {
            if (field876 == 1) {
                Statics.field3547[field954 / 100].method5459(field952 - 8, field931 - 8);
            }
            if (field876 == 2) {
                Statics.field3547[field954 / 100 + 4].method5459(field952 - 8, field931 - 8);
            }
        }
        method241();
    }

    @ObfuscatedName("fd.go(Lbk;II)V")
    public static final void method2975(class76 arg0, int arg1) {
        method2988(arg0.field1186, arg0.field1151, arg1);
    }

    @ObfuscatedName("fl.gu(IIII)V")
    public static final void method2988(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field950 = -1;
            field951 = -1;
            return;
        }
        int var3 = method466(arg0, arg1, Statics.field505) - arg2;
        int var4 = arg0 - Statics.field1606;
        int var5 = var3 - Statics.field617;
        int var6 = arg1 - Statics.field446;
        int var7 = class135.field1940[Statics.field658];
        int var8 = class135.field1945[Statics.field658];
        int var9 = class135.field1940[Statics.field3373];
        int var10 = class135.field1945[Statics.field3373];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field950 = field1111 * var11 / var15 + field877 / 2;
            field951 = field1111 * var14 / var15 + field1110 / 2;
        } else {
            field950 = -1;
            field951 = -1;
        }
    }

    @ObfuscatedName("az.gx(IIII)I")
    public static final int method466(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class63.field736[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class63.field738[var5][var3][var4] + class63.field738[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class63.field738[var5][var3][var4 + 1] + class63.field738[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("iu.gd(IIIIIIB)V")
    public static final void method4075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class135.field1940[var6];
            int var12 = class135.field1945[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class135.field1940[var7];
            int var15 = class135.field1945[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1606 = arg0 - var8;
        Statics.field617 = arg1 - var9;
        Statics.field446 = arg2 - var10;
        Statics.field658 = arg3;
        Statics.field3373 = arg4;
        if (field928 == 1 && field1018 >= 2 && field866 % 50 == 0 && (Statics.field444 >> 7 != Statics.field302.field1186 >> 7 || Statics.field2219 >> 7 != Statics.field302.field1151 >> 7)) {
            int var17 = Statics.field302.field845;
            int var18 = (Statics.field444 >> 7) + Statics.field445;
            int var19 = (Statics.field2219 >> 7) + Statics.field3556;
            method9(var18, var19, var17, true);
        }
    }

    @ObfuscatedName("cx.gj(ZLgb;I)V")
    public static final void method1796(boolean arg0, class202 arg1) {
        field983 = arg0;
        if (!field983) {
            int var2 = arg1.method3298();
            int var3 = arg1.method3298();
            int var4 = arg1.method3269();
            Statics.field2147 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2147[var5][var6] = arg1.method3264();
                }
            }
            Statics.field464 = new int[var4];
            Statics.field476 = new int[var4];
            Statics.field298 = new int[var4];
            Statics.field2571 = new byte[var4][];
            Statics.field321 = new byte[var4][];
            boolean var7 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var3 / 8 == 48) {
                var7 = true;
            }
            if (var2 / 8 == 48 && var3 / 8 == 148) {
                var7 = true;
            }
            int var8 = 0;
            for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                for (int var10 = (var3 - 6) / 8; var10 <= (var3 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    if (!var7 || var10 != 49 && var10 != 149 && var10 != 147 && var9 != 50 && (var9 != 49 || var10 != 47)) {
                        Statics.field464[var8] = var11;
                        Statics.field476[var8] = Statics.field3342.method4290("m" + var9 + "_" + var10);
                        Statics.field298[var8] = Statics.field3342.method4290("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method247(var2, var3, true);
            return;
        }
        boolean var12 = arg1.method3261() == 1;
        int var13 = arg1.method3298();
        int var14 = arg1.method3354();
        int var15 = arg1.method3269();
        arg1.method3544();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3545(1);
                    if (var19 == 1) {
                        field913[var16][var17][var18] = arg1.method3545(26);
                    } else {
                        field913[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3546();
        Statics.field2147 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field2147[var20][var21] = arg1.method3264();
            }
        }
        Statics.field464 = new int[var15];
        Statics.field476 = new int[var15];
        Statics.field298 = new int[var15];
        Statics.field2571 = new byte[var15][];
        Statics.field321 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field913[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field464[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field464[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field476[var22] = Statics.field3342.method4290("m" + var31 + "_" + var32);
                            Statics.field298[var22] = Statics.field3342.method4290("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method247(var14, var13, !var12);
    }

    @ObfuscatedName("as.gm(IIZB)V")
    public static final void method247(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field752 == arg0 && Statics.field10 == arg1) {
            return;
        }
        Statics.field752 = arg0;
        Statics.field10 = arg1;
        method4667(25);
        method680(class252.field3030, true);
        int var3 = Statics.field445;
        int var4 = Statics.field3556;
        Statics.field445 = (arg0 - 6) * 8;
        Statics.field3556 = (arg1 - 6) * 8;
        int var5 = Statics.field445 - var3;
        int var6 = Statics.field3556 - var4;
        int var7 = Statics.field445;
        int var8 = Statics.field3556;
        for (int var9 = 0; var9 < 32768; var9++) {
            class85 var10 = field1035[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1195[var11] -= var5;
                    var10.field1196[var11] -= var6;
                }
                var10.field1186 -= var5 * 128;
                var10.field1151 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class73 var13 = field967[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1195[var14] -= var5;
                    var13.field1196[var14] -= var6;
                }
                var13.field1186 -= var5 * 128;
                var13.field1151 -= var6 * 128;
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
                        field962[var25][var21][var22] = field962[var25][var23][var24];
                    } else {
                        field962[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class75 var26 = (class75) field980.method3798(); var26 != null; var26 = (class75) field980.method3800()) {
            var26.field1127 -= var5;
            var26.field1128 -= var6;
            if (var26.field1127 < 0 || var26.field1128 < 0 || var26.field1127 >= 104 || var26.field1128 >= 104) {
                var26.method3785();
            }
        }
        if (field1079 != 0) {
            field1079 -= var5;
            field1112 -= var6;
        }
        field1087 = 0;
        field1093 = false;
        Statics.field1606 -= var5 << 7;
        Statics.field446 -= var6 << 7;
        Statics.field444 -= var5 << 7;
        Statics.field2219 -= var6 << 7;
        field1074 = -1;
        field1001.method3792();
        field871.method3792();
        for (int var27 = 0; var27 < 4; var27++) {
            field886[var27].method3139();
        }
    }

    @ObfuscatedName("is.ge(ZI)V")
    public static final void method4230(boolean arg0) {
        method3188();
        field900.field1478++;
        if (field900.field1478 < 50 && !arg0) {
            return;
        }
        field900.field1478 = 0;
        if (field902 || field900.method1917() == null) {
            return;
        }
        class185 var1 = class185.method251(class182.field2452, field900.field1471);
        field900.method1921(var1);
        try {
            field900.method1919();
        } catch (IOException var3) {
            field902 = true;
        }
    }

    @ObfuscatedName("k.gn(IIIIIB)V")
    public static final void method30(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1312.method2762(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1312.method2730(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field382.field3983;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class283 var13 = class283.method3065(var12);
            if (var13.field3609 == -1) {
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
                class331 var14 = Statics.field2101[var13.field3609];
                if (var14 != null) {
                    int var15 = (var13.field3604 * 4 - var14.field3976) / 2;
                    int var16 = (var13.field3605 * 4 - var14.field3974) / 2;
                    var14.method5434(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3605) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1312.method2712(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1312.method2730(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class283 var22 = class283.method3065(var21);
            if (var22.field3609 != -1) {
                class331 var23 = Statics.field2101[var22.field3609];
                if (var23 != null) {
                    int var24 = (var22.field3604 * 4 - var23.field3976) / 2;
                    int var25 = (var22.field3605 * 4 - var23.field3974) / 2;
                    var23.method5434(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3605) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field382.field3983;
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
        int var29 = Statics.field1312.method2852(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class283 var31 = class283.method3065(var30);
        if (var31.field3609 == -1) {
            return;
        }
        class331 var32 = Statics.field2101[var31.field3609];
        if (var32 != null) {
            int var33 = (var31.field3604 * 4 - var32.field3976) / 2;
            int var34 = (var31.field3605 * 4 - var32.field3974) / 2;
            var32.method5434(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3605) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.gy(Lcb;I)Z")
    public final boolean method1104(class100 arg0) {
        class170 var2 = arg0.method1917();
        class202 var3 = arg0.field1473;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1474 == null) {
                if (arg0.field1475) {
                    if (!var2.method3061(1)) {
                        return false;
                    }
                    var2.method3057(arg0.field1473.field2569, 0, 1);
                    arg0.field1477 = 0;
                    arg0.field1475 = false;
                }
                var3.field2568 = 0;
                if (var3.method3542()) {
                    if (!var2.method3061(1)) {
                        return false;
                    }
                    var2.method3057(arg0.field1473.field2569, 1, 1);
                    arg0.field1477 = 0;
                }
                arg0.field1475 = true;
                class181[] var4 = class181.method4233();
                int var5 = var3.method3543();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field2568);
                }
                arg0.field1474 = var4[var5];
                arg0.field1469 = arg0.field1474.field2373;
            }
            if (arg0.field1469 == -1) {
                if (!var2.method3061(1)) {
                    return false;
                }
                arg0.method1917().method3057(var3.field2569, 0, 1);
                arg0.field1469 = var3.field2569[0] & 0xFF;
            }
            if (arg0.field1469 == -2) {
                if (!var2.method3061(2)) {
                    return false;
                }
                arg0.method1917().method3057(var3.field2569, 0, 2);
                var3.field2568 = 0;
                arg0.field1469 = var3.method3269();
            }
            if (!var2.method3061(arg0.field1469)) {
                return false;
            }
            var3.field2568 = 0;
            var2.method3057(var3.field2569, 0, arg0.field1469);
            arg0.field1477 = 0;
            field1078.method4907();
            arg0.field1481 = arg0.field1480;
            arg0.field1480 = arg0.field1479;
            arg0.field1479 = arg0.field1474;
            if (class181.field2341 == arg0.field1474) {
                method94(var3.method3268());
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2306 == arg0.field1474) {
                int var6 = var3.method3264();
                int var7 = var3.method3269();
                if (var6 < -70000) {
                    var7 += 32768;
                }
                class243 var8;
                if (var6 >= 0) {
                    var8 = class243.method20(var6);
                } else {
                    var8 = null;
                }
                while (var3.field2568 < arg0.field1469) {
                    int var9 = var3.method3380();
                    int var10 = var3.method3269();
                    int var11 = 0;
                    if (var10 != 0) {
                        var11 = var3.method3330();
                        if (var11 == 255) {
                            var11 = var3.method3264();
                        }
                    }
                    if (var8 != null && var9 >= 0 && var9 < var8.field2944.length) {
                        var8.field2944[var9] = var10;
                        var8.field2954[var9] = var11;
                    }
                    class66.method472(var7, var9, var10 - 1, var11);
                }
                if (var8 != null) {
                    method3073(var8);
                }
                method7();
                field1037[++field1038 - 1 & 0x1F] = var7 & 0x7FFF;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2347 == arg0.field1474) {
                Statics.field1319.method1574();
                field1042 = field857;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2339 == arg0.field1474) {
                byte var12 = var3.method3421();
                int var13 = var3.method3269();
                class238.field2784[var13] = var12;
                if (class238.field2783[var13] != var12) {
                    class238.field2783[var13] = var12;
                }
                method2934(var13);
                field1055[++field1113 - 1 & 0x1F] = var13;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2320 == arg0.field1474) {
                int var14 = var3.method3305();
                int var15 = var3.method3307();
                class68 var16 = (class68) field1012.method3736((long) var14);
                class68 var17 = (class68) field1012.method3736((long) var15);
                if (var17 != null) {
                    method4249(var17, var16 == null || var16.field784 != var17.field784);
                }
                if (var16 != null) {
                    var16.method3785();
                    field1012.method3745(var16, (long) var15);
                }
                class243 var18 = class243.method20(var14);
                if (var18 != null) {
                    method3073(var18);
                }
                class243 var19 = class243.method20(var15);
                if (var19 != null) {
                    method3073(var19);
                    method3162(Statics.field2817[var19.field2856 >>> 16], var19, true);
                }
                if (field1011 != -1) {
                    int var20 = field1011;
                    if (class243.method129(var20)) {
                        method1515(Statics.field2817[var20], 1);
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2330 == arg0.field1474) {
                field1093 = false;
                for (int var21 = 0; var21 < 5; var21++) {
                    field1094[var21] = false;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2309 == arg0.field1474) {
                int var22 = var3.method3269();
                int var23 = var3.method3296();
                int var24 = var3.method3354();
                int var25 = var3.method3307();
                class243 var26 = class243.method20(var25);
                if (var26.field2877 != var24 || var26.field2878 != var23 || var26.field2898 != var22) {
                    var26.field2877 = var24;
                    var26.field2878 = var23;
                    var26.field2898 = var22;
                    method3073(var26);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2291 == arg0.field1474) {
                String var27 = var3.method3268();
                Object[] var28 = new Object[var27.length() + 1];
                for (int var29 = var27.length() - 1; var29 >= 0; var29--) {
                    if (var27.charAt(var29) == 's') {
                        var28[var29 + 1] = var3.method3268();
                    } else {
                        var28[var29 + 1] = Integer.valueOf(var3.method3264());
                    }
                }
                var28[0] = Integer.valueOf(var3.method3264());
                class69 var30 = new class69();
                var30.field790 = var28;
                class82.method697(var30);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2307 == arg0.field1474) {
                int var31 = var3.method3296();
                int var32 = var3.method3264();
                int var33 = var31 >> 10 & 0x1F;
                int var34 = var31 >> 5 & 0x1F;
                int var35 = var31 & 0x1F;
                int var36 = (var35 << 3) + (var33 << 19) + (var34 << 11);
                class243 var37 = class243.method20(var32);
                if (var37.field2929 != var36) {
                    var37.field2929 = var36;
                    method3073(var37);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2367 == arg0.field1474) {
                field1093 = true;
                Statics.field18 = var3.method3330();
                Statics.field276 = var3.method3330();
                Statics.field2686 = var3.method3269();
                Statics.field734 = var3.method3330();
                Statics.field1833 = var3.method3330();
                if (Statics.field1833 >= 100) {
                    int var38 = Statics.field18 * 128 + 64;
                    int var39 = Statics.field276 * 128 + 64;
                    int var40 = method466(var38, var39, Statics.field505) - Statics.field2686;
                    int var41 = var38 - Statics.field1606;
                    int var42 = var40 - Statics.field617;
                    int var43 = var39 - Statics.field446;
                    int var44 = (int) Math.sqrt((double) (var41 * var41 + var43 * var43));
                    Statics.field658 = (int) (Math.atan2((double) var42, (double) var44) * 325.949D) & 0x7FF;
                    Statics.field3373 = (int) (Math.atan2((double) var41, (double) var43) * -325.949D) & 0x7FF;
                    if (Statics.field658 < 128) {
                        Statics.field658 = 128;
                    }
                    if (Statics.field658 > 383) {
                        Statics.field658 = 383;
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2313 == arg0.field1474) {
                boolean var45 = var3.method3330() == 1;
                if (var45) {
                    Statics.field3304 = class197.method1501() - var3.method3265();
                    Statics.field2095 = new class14(var3, true);
                } else {
                    Statics.field2095 = null;
                }
                field1045 = field857;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2328 == arg0.field1474) {
                int var46 = var3.method3305();
                int var47 = var3.method3354();
                int var48 = var3.method3330();
                class68 var49 = (class68) field1012.method3736((long) var46);
                if (var49 != null) {
                    method4249(var49, var49.field784 != var47);
                }
                method882(var46, var47, var48);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2300 == arg0.field1474) {
                int var50 = var3.method3264();
                int var51 = var3.method3269();
                if (var50 < -70000) {
                    var51 += 32768;
                }
                class243 var52;
                if (var50 >= 0) {
                    var52 = class243.method20(var50);
                } else {
                    var52 = null;
                }
                if (var52 != null) {
                    for (int var53 = 0; var53 < var52.field2944.length; var53++) {
                        var52.field2944[var53] = 0;
                        var52.field2954[var53] = 0;
                    }
                }
                class66 var54 = (class66) class66.field769.method3736((long) var51);
                if (var54 != null) {
                    for (int var55 = 0; var55 < var54.field768.length; var55++) {
                        var54.field768[var55] = -1;
                        var54.field767[var55] = 0;
                    }
                }
                int var56 = var3.method3269();
                for (int var57 = 0; var57 < var56; var57++) {
                    int var58 = var3.method3296();
                    int var59 = var3.method3330();
                    if (var59 == 255) {
                        var59 = var3.method3264();
                    }
                    if (var52 != null && var57 < var52.field2944.length) {
                        var52.field2944[var57] = var58;
                        var52.field2954[var57] = var59;
                    }
                    class66.method472(var51, var57, var58 - 1, var59);
                }
                if (var52 != null) {
                    method3073(var52);
                }
                method7();
                field1037[++field1038 - 1 & 0x1F] = var51 & 0x7FFF;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2294 == arg0.field1474) {
                int var60 = var3.method3264();
                int var61 = var3.method3269();
                class243 var62 = class243.method20(var60);
                if (var62.field2866 != 1 || var62.field2910 != var61) {
                    var62.field2866 = 1;
                    var62.field2910 = var61;
                    method3073(var62);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2288 == arg0.field1474) {
                Statics.field413 = var3.method3287();
                Statics.field1240 = var3.method3288();
                while (var3.field2568 < arg0.field1469) {
                    int var63 = var3.method3330();
                    class184[] var64 = new class184[] { class184.field2485, class184.field2484, class184.field2486, class184.field2483, class184.field2487, class184.field2488, class184.field2489, class184.field2491, class184.field2490, class184.field2492 };
                    class184 var65 = var64[var63];
                    method977(var65);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2324 == arg0.field1474) {
                class94.method4269(var3, arg0.field1469);
                method212();
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2298 == arg0.field1474) {
                Statics.field413 = var3.method3287();
                Statics.field1240 = var3.method3288();
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2356 == arg0.field1474) {
                int var66 = var3.method3330();
                int var67 = var3.method3330();
                int var68 = var3.method3330();
                int var69 = var3.method3330();
                field1094[var66] = true;
                field996[var66] = var67;
                field895[var66] = var68;
                field904[var66] = var69;
                field1092[var66] = 0;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2295 == arg0.field1474) {
                int var70 = var3.method3264();
                if (field933 != var70) {
                    field933 = var70;
                    method128();
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2353 == arg0.field1474) {
                Statics.field1240 = var3.method3287();
                Statics.field413 = var3.method3330();
                for (int var71 = Statics.field413; var71 < Statics.field413 + 8; var71++) {
                    for (int var72 = Statics.field1240; var72 < Statics.field1240 + 8; var72++) {
                        if (field962[Statics.field505][var71][var72] != null) {
                            field962[Statics.field505][var71][var72] = null;
                            method177(var71, var72);
                        }
                    }
                }
                for (class75 var73 = (class75) field980.method3798(); var73 != null; var73 = (class75) field980.method3800()) {
                    if (var73.field1127 >= Statics.field413 && var73.field1127 < Statics.field413 + 8 && var73.field1128 >= Statics.field1240 && var73.field1128 < Statics.field1240 + 8 && Statics.field505 == var73.field1134) {
                        var73.field1135 = 0;
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2372 == arg0.field1474) {
                int var74 = var3.method3307();
                int var75 = var3.method3296();
                class243 var76 = class243.method20(var74);
                if (var76 != null && var76.field2893 == 0) {
                    if (var75 > var76.field2850 - var76.field2950) {
                        var75 = var76.field2850 - var76.field2950;
                    }
                    if (var75 < 0) {
                        var75 = 0;
                    }
                    if (var76.field2905 != var75) {
                        var76.field2905 = var75;
                        method3073(var76);
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2370 == arg0.field1474) {
                int var77 = var3.method3269();
                if (var77 == 65535) {
                    var77 = -1;
                }
                if (var77 == -1 && !field971) {
                    class230.method3514();
                } else if (var77 != -1 && field1116 != var77 && field982 != 0 && !field971) {
                    class230.method4241(2, Statics.field2129, var77, 0, field982, false);
                }
                field1116 = var77;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2296 == arg0.field1474) {
                int var78 = var3.method3336();
                int var79 = var3.method3354();
                if (var79 == 65535) {
                    var79 = -1;
                }
                if (field982 != 0 && var79 != -1) {
                    class230.method992(Statics.field771, var79, 0, field982, false);
                    field971 = true;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2343 == arg0.field1474) {
                method977(class184.field2485);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2318 == arg0.field1474) {
                int var80 = var3.method3296();
                if (var80 == 65535) {
                    var80 = -1;
                }
                int var81 = var3.method3305();
                int var82 = var3.method3305();
                class243 var83 = class243.method20(var82);
                if (var83.field2825) {
                    var83.field2946 = var80;
                    var83.field2896 = var81;
                    class284 var85 = class284.method4245(var80);
                    var83.field2877 = var85.field3656;
                    var83.field2878 = var85.field3657;
                    var83.field2879 = var85.field3674;
                    var83.field2875 = var85.field3659;
                    var83.field2876 = var85.field3660;
                    var83.field2898 = var85.field3682;
                    if (var85.field3661 == 1) {
                        var83.field2959 = 1;
                    } else {
                        var83.field2959 = 2;
                    }
                    if (var83.field2881 > 0) {
                        var83.field2898 = var83.field2898 * 32 / var83.field2881;
                    } else if (var83.field2837 > 0) {
                        var83.field2898 = var83.field2898 * 32 / var83.field2837;
                    }
                    method3073(var83);
                } else if (var80 == -1) {
                    var83.field2866 = 0;
                    arg0.field1474 = null;
                    return true;
                } else {
                    class284 var84 = class284.method4245(var80);
                    var83.field2866 = 4;
                    var83.field2910 = var80;
                    var83.field2877 = var84.field3656;
                    var83.field2878 = var84.field3657;
                    var83.field2898 = var84.field3682 * 100 / var81;
                    method3073(var83);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2317 == arg0.field1474) {
                method1796(true, arg0.field1473);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2302 == arg0.field1474) {
                method977(class184.field2486);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2350 == arg0.field1474) {
                String var86 = var3.method3268();
                String var87 = class314.method3170(var3, 32767);
                String var88 = class313.method5161(class319.method1030(var87));
                class96.method140(6, var86, var88);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2323 == arg0.field1474) {
                method977(class184.field2487);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2366 == arg0.field1474) {
                int var89 = var3.method3264();
                int var90 = var3.method3264();
                int var91 = 0;
                if (Statics.field422 == null || !Statics.field422.isValid()) {
                    try {
                        Iterator var92 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var92.hasNext()) {
                            GarbageCollectorMXBean var93 = (GarbageCollectorMXBean) var92.next();
                            if (var93.isValid()) {
                                Statics.field422 = var93;
                                field705 = -1L;
                                field712 = -1L;
                            }
                        }
                    } catch (Throwable var227) {
                    }
                }
                if (Statics.field422 != null) {
                    long var95 = class197.method1501();
                    long var97 = Statics.field422.getCollectionTime();
                    if (field712 != -1L) {
                        long var99 = var97 - field712;
                        long var101 = var95 - field705;
                        if (var101 != 0L) {
                            var91 = (int) (var99 * 100L / var101);
                        }
                    }
                    field712 = var97;
                    field705 = var95;
                }
                class185 var105 = class185.method251(class182.field2392, field900.field1471);
                var105.field2497.method3243(var91);
                var105.field2497.method3468(var89);
                var105.field2497.method3468(var90);
                var105.field2497.method3274(field686);
                field900.method1921(var105);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2290 == arg0.field1474) {
                method1639(true, var3);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2348 == arg0.field1474) {
                method7();
                int var106 = var3.method3287();
                int var107 = var3.method3264();
                int var108 = var3.method3261();
                field985[var106] = var107;
                field906[var106] = var108;
                field984[var106] = 1;
                for (int var109 = 0; var109 < 98; var109++) {
                    if (var107 >= class249.field3011[var109]) {
                        field984[var106] = var109 + 2;
                    }
                }
                field1039[++field1040 - 1 & 0x1F] = var106;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2322 == arg0.field1474) {
                field901 = var3.method3330();
                if (field901 == 1) {
                    field875 = var3.method3269();
                }
                if (field901 >= 2 && field901 <= 6) {
                    if (field901 == 2) {
                        field936 = 64;
                        field881 = 64;
                    }
                    if (field901 == 3) {
                        field936 = 0;
                        field881 = 64;
                    }
                    if (field901 == 4) {
                        field936 = 128;
                        field881 = 64;
                    }
                    if (field901 == 5) {
                        field936 = 64;
                        field881 = 0;
                    }
                    if (field901 == 6) {
                        field936 = 64;
                        field881 = 128;
                    }
                    field901 = 2;
                    field1095 = var3.method3269();
                    field878 = var3.method3269();
                    field885 = var3.method3330();
                }
                if (field901 == 10) {
                    field1083 = var3.method3269();
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2335 == arg0.field1474) {
                method1796(false, arg0.field1473);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2349 == arg0.field1474) {
                int var110 = var3.method3262();
                int var111 = var3.method3306();
                class243 var112 = class243.method20(var111);
                if (var112.field2821 != var110 || var110 == -1) {
                    var112.field2821 = var110;
                    var112.field2948 = 0;
                    var112.field2949 = 0;
                    method3073(var112);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2369 == arg0.field1474) {
                int var113 = var3.method3296();
                field1011 = var113;
                this.method1108(false);
                method242(var113);
                class82.method333(field1011);
                for (int var114 = 0; var114 < 100; var114++) {
                    field1054[var114] = true;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2363 == arg0.field1474) {
                int var115 = var3.method3462();
                int var116 = var3.method3262();
                int var117 = var3.method3305();
                class243 var118 = class243.method20(var117);
                if (var118.field2835 != var115 || var118.field2886 != var116 || var118.field2831 != 0 || var118.field2832 != 0) {
                    var118.field2835 = var115;
                    var118.field2886 = var116;
                    var118.field2831 = 0;
                    var118.field2832 = 0;
                    method3073(var118);
                    this.method1109(var118);
                    if (var118.field2893 == 0) {
                        method3162(Statics.field2817[var117 >> 16], var118, false);
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2310 == arg0.field1474) {
                method977(class184.field2484);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2301 == arg0.field1474) {
                field1093 = true;
                Statics.field531 = var3.method3330();
                Statics.field521 = var3.method3330();
                Statics.field2174 = var3.method3269();
                Statics.field265 = var3.method3330();
                Statics.field316 = var3.method3330();
                if (Statics.field316 >= 100) {
                    Statics.field1606 = Statics.field531 * 128 + 64;
                    Statics.field446 = Statics.field521 * 128 + 64;
                    Statics.field617 = method466(Statics.field1606, Statics.field446, Statics.field505) - Statics.field2174;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2331 == arg0.field1474) {
                int var119 = var3.method3305();
                class243 var120 = class243.method20(var119);
                for (int var121 = 0; var121 < var120.field2944.length; var121++) {
                    var120.field2944[var121] = -1;
                    var120.field2944[var121] = 0;
                }
                method3073(var120);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2316 == arg0.field1474) {
                for (int var122 = 0; var122 < field967.length; var122++) {
                    if (field967[var122] != null) {
                        field967[var122].field1172 = -1;
                    }
                }
                for (int var123 = 0; var123 < field1035.length; var123++) {
                    if (field1035[var123] != null) {
                        field1035[var123].field1172 = -1;
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2334 == arg0.field1474) {
                class78 var124 = new class78();
                var124.field1218 = var3.method3268();
                var124.field1215 = var3.method3269();
                int var125 = var3.method3264();
                var124.field1216 = var125;
                method4667(45);
                var2.method3049();
                Object var126 = null;
                class91.method90(var124);
                arg0.field1474 = null;
                return false;
            }
            if (class181.field2355 == arg0.field1474) {
                int var127 = var3.method3261();
                String var128 = var3.method3268();
                int var129 = var3.method3287();
                if (var127 >= 1 && var127 <= 8) {
                    if (var128.equalsIgnoreCase(class252.field3160)) {
                        var128 = null;
                    }
                    field975[var127 - 1] = var128;
                    field976[var127 - 1] = var129 == 0;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2325 == arg0.field1474) {
                field873 = var3.method3288();
                field1066 = var3.method3261();
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2305 == arg0.field1474) {
                int var130 = var3.method3296();
                if (var130 == 65535) {
                    var130 = -1;
                }
                int var131 = var3.method3307();
                int var132 = var3.method3305();
                int var133 = var3.method3354();
                if (var133 == 65535) {
                    var133 = -1;
                }
                for (int var134 = var133; var134 <= var130; var134++) {
                    long var135 = ((long) var132 << 32) + (long) var134;
                    class217 var137 = field1051.method3736(var135);
                    if (var137 != null) {
                        var137.method3785();
                    }
                    field1051.method3745(new class224(var131), var135);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2297 == arg0.field1474) {
                int var138 = var3.method3330();
                class321[] var139 = new class321[] { class321.field3927, class321.field3929, class321.field3925 };
                class321[] var140 = var139;
                int var141 = 0;
                class321 var143;
                while (true) {
                    if (var141 >= var140.length) {
                        var143 = null;
                        break;
                    }
                    class321 var142 = var140[var141];
                    if (var142.field3928 == var138) {
                        var143 = var142;
                        break;
                    }
                    var141++;
                }
                Statics.field251 = var143;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2357 == arg0.field1474) {
                field1081 = var3.method3330();
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2321 == arg0.field1474) {
                method977(class184.field2492);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2368 == arg0.field1474) {
                for (int var144 = 0; var144 < class238.field2783.length; var144++) {
                    if (class238.field2784[var144] != class238.field2783[var144]) {
                        class238.field2783[var144] = class238.field2784[var144];
                        method2934(var144);
                        field1055[++field1113 - 1 & 0x1F] = var144;
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2352 == arg0.field1474) {
                int var145 = arg0.field1469 + var3.field2568;
                int var146 = var3.method3269();
                int var147 = var3.method3269();
                if (field1011 != var146) {
                    field1011 = var146;
                    this.method1108(false);
                    method242(field1011);
                    class82.method333(field1011);
                    for (int var148 = 0; var148 < 100; var148++) {
                        field1054[var148] = true;
                    }
                }
                while (var147-- > 0) {
                    int var149 = var3.method3264();
                    int var150 = var3.method3269();
                    int var151 = var3.method3330();
                    class68 var152 = (class68) field1012.method3736((long) var149);
                    if (var152 != null && var152.field784 != var150) {
                        method4249(var152, true);
                        var152 = null;
                    }
                    if (var152 == null) {
                        var152 = method882(var149, var150, var151);
                    }
                    var152.field781 = true;
                }
                for (class68 var153 = (class68) field1012.method3739(); var153 != null; var153 = (class68) field1012.method3740()) {
                    if (var153.field781) {
                        var153.field781 = false;
                    } else {
                        method4249(var153, true);
                    }
                }
                field1051 = new class215(512);
                while (var3.field2568 < var145) {
                    int var154 = var3.method3264();
                    int var155 = var3.method3269();
                    int var156 = var3.method3269();
                    int var157 = var3.method3264();
                    for (int var158 = var155; var158 <= var156; var158++) {
                        long var159 = ((long) var154 << 32) + (long) var158;
                        field1051.method3745(new class224(var157), var159);
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2344 == arg0.field1474) {
                method977(class184.field2483);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2314 == arg0.field1474) {
                boolean var161 = var3.method3330() == 1;
                int var162 = var3.method3306();
                class243 var163 = class243.method20(var162);
                if (var163.field2846 != var161) {
                    var163.field2846 = var161;
                    method3073(var163);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2358 == arg0.field1474) {
                if (field1011 != -1) {
                    int var164 = field1011;
                    if (class243.method129(var164)) {
                        method1515(Statics.field2817[var164], 0);
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2326 == arg0.field1474) {
                int var165 = var3.method3264();
                String var166 = var3.method3268();
                class243 var167 = class243.method20(var165);
                if (!var166.equals(var167.field2833)) {
                    var167.field2833 = var166;
                    method3073(var167);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2354 == arg0.field1474) {
                method977(class184.field2491);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2362 == arg0.field1474) {
                method977(class184.field2490);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2308 == arg0.field1474) {
                var3.field2568 += 28;
                if (var3.method3283()) {
                    method681(var3, var3.field2568 - 28);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2299 == arg0.field1474) {
                int var168 = var3.method3354();
                int var169 = var3.method3306();
                int var170 = var3.method3269();
                class243 var171 = class243.method20(var169);
                var171.field2882 = (var170 << 16) + var168;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2346 == arg0.field1474) {
                if (arg0.field1469 == 0) {
                    Statics.field785 = null;
                } else {
                    if (Statics.field785 == null) {
                        Statics.field785 = new class308(Statics.field347, Statics.field357);
                    }
                    Statics.field785.method5132(var3);
                }
                field1036 = field857;
                Statics.field589 = true;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2371 == arg0.field1474) {
                method7();
                field1017 = var3.method3262();
                field1046 = field857;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2293 == arg0.field1474) {
                method1639(false, var3);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2342 == arg0.field1474) {
                method7();
                field1016 = var3.method3330();
                field1046 = field857;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2333 == arg0.field1474) {
                if (Statics.field785 != null) {
                    Statics.field785.method5123(var3);
                }
                field1036 = field857;
                Statics.field589 = true;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2332 == arg0.field1474) {
                Statics.field1319.method1582(var3, arg0.field1469);
                field1042 = field857;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2315 == arg0.field1474) {
                int var172 = var3.method3330();
                if (var3.method3330() == 0) {
                    field1115[var172] = new class17();
                    var3.field2568 += 18;
                } else {
                    var3.field2568--;
                    field1115[var172] = new class17(var3, false);
                }
                field945 = field857;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2311 == arg0.field1474) {
                for (int var173 = 0; var173 < Statics.field3447; var173++) {
                    class269 var174 = class269.method4248(var173);
                    if (var174 != null) {
                        class238.field2784[var173] = 0;
                        class238.field2783[var173] = 0;
                    }
                }
                method7();
                field1113 += 32;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2304 == arg0.field1474) {
                int var175 = var3.method3298();
                int var176 = var3.method3307();
                class238.field2784[var175] = var176;
                if (class238.field2783[var175] != var176) {
                    class238.field2783[var175] = var176;
                }
                method2934(var175);
                field1055[++field1113 - 1 & 0x1F] = var175;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2351 == arg0.field1474) {
                int var177 = var3.method3354();
                int var178 = var3.method3306();
                class243 var179 = class243.method20(var178);
                if (var179.field2866 != 2 || var179.field2910 != var177) {
                    var179.field2866 = 2;
                    var179.field2910 = var177;
                    method3073(var179);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2359 == arg0.field1474) {
                method977(class184.field2488);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2336 == arg0.field1474) {
                int var180 = var3.method3264();
                class68 var181 = (class68) field1012.method3736((long) var180);
                if (var181 != null) {
                    method4249(var181, true);
                }
                if (field1015 != null) {
                    method3073(field1015);
                    field1015 = null;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2319 == arg0.field1474) {
                String var182 = var3.method3268();
                long var183 = var3.method3265();
                long var185 = (long) var3.method3269();
                long var187 = (long) var3.method3263();
                class257 var189 = (class257) class190.method500(class257.method4166(), var3.method3330());
                long var190 = (var185 << 32) + var187;
                boolean var192 = false;
                for (int var193 = 0; var193 < 100; var193++) {
                    if (field1068[var193] == var190) {
                        var192 = true;
                        break;
                    }
                }
                if (var189.field3334 && Statics.field1319.method1578(new class306(var182, Statics.field347))) {
                    var192 = true;
                }
                if (!var192 && field965 == 0) {
                    field1068[field922] = var190;
                    field922 = (field922 + 1) % 100;
                    String var194 = class314.method3170(var3, 32767);
                    String var195 = class313.method5161(class319.method1030(var194));
                    if (var189.field3339 == -1) {
                        class96.method1803(9, var182, var195, class317.method955(var183));
                    } else {
                        class96.method1803(9, class87.method693(var189.field3339) + var182, var195, class317.method955(var183));
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2338 == arg0.field1474) {
                Statics.field1319.field1234.method4988(var3, arg0.field1469);
                method468();
                field1042 = field857;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2360 == arg0.field1474) {
                field1070 = var3.method3269() * 30;
                field1046 = field857;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2327 == arg0.field1474) {
                int var196 = var3.method3269();
                int var197 = var3.method3330();
                int var198 = var3.method3269();
                method964(var196, var197, var198);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2340 == arg0.field1474) {
                int var199 = var3.method3307();
                class243 var200 = class243.method20(var199);
                var200.field2866 = 3;
                var200.field2910 = Statics.field302.field824.method4133();
                method3073(var200);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2289 == arg0.field1474) {
                String var201 = var3.method3268();
                long var202 = (long) var3.method3269();
                long var204 = (long) var3.method3263();
                class257 var206 = (class257) class190.method500(class257.method4166(), var3.method3330());
                long var207 = (var202 << 32) + var204;
                boolean var209 = false;
                for (int var210 = 0; var210 < 100; var210++) {
                    if (field1068[var210] == var207) {
                        var209 = true;
                        break;
                    }
                }
                if (Statics.field1319.method1578(new class306(var201, Statics.field347))) {
                    var209 = true;
                }
                if (!var209 && field965 == 0) {
                    field1068[field922] = var207;
                    field922 = (field922 + 1) % 100;
                    String var211 = class314.method3170(var3, 32767);
                    String var212 = class313.method5161(class319.method1030(var211));
                    byte var213;
                    if (var206.field3340) {
                        var213 = 7;
                    } else {
                        var213 = 3;
                    }
                    if (var206.field3339 == -1) {
                        class96.method140(var213, var201, var212);
                    } else {
                        class96.method140(var213, class87.method693(var206.field3339) + var201, var212);
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2364 == arg0.field1474) {
                method977(class184.field2489);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2345 == arg0.field1474) {
                int var214 = var3.method3354();
                class66 var215 = (class66) class66.field769.method3736((long) var214);
                if (var215 != null) {
                    var215.method3785();
                }
                field1037[++field1038 - 1 & 0x1F] = var214 & 0x7FFF;
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2361 == arg0.field1474) {
                boolean var216 = var3.method3266();
                if (!var216) {
                    Statics.field853 = null;
                } else if (Statics.field853 == null) {
                    Statics.field853 = new class266();
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2303 == arg0.field1474) {
                method71();
                arg0.field1474 = null;
                return false;
            }
            if (class181.field2365 == arg0.field1474) {
                field1079 = var3.method3330();
                if (field1079 == 255) {
                    field1079 = 0;
                }
                field1112 = var3.method3330();
                if (field1112 == 255) {
                    field1112 = 0;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2292 == arg0.field1474) {
                class327.method4255(var3, arg0.field1469);
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2337 == arg0.field1474) {
                int var217 = var3.method3380();
                boolean var218 = var3.method3330() == 1;
                String var219 = "";
                boolean var220 = false;
                if (var218) {
                    var219 = var3.method3268();
                    if (Statics.field1319.method1578(new class306(var219, Statics.field347))) {
                        var220 = true;
                    }
                }
                String var221 = var3.method3268();
                if (!var220) {
                    class96.method140(var217, var219, var221);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class181.field2312 == arg0.field1474) {
                int var222 = var3.method3330();
                field928 = var222;
                arg0.field1474 = null;
                return true;
            }
            class165.method2426("" + (arg0.field1474 == null ? -1 : arg0.field1474.field2329) + class87.field1302 + (arg0.field1480 == null ? -1 : arg0.field1480.field2329) + class87.field1302 + (arg0.field1481 == null ? -1 : arg0.field1481.field2329) + class87.field1302 + arg0.field1469, (Throwable) null);
            method71();
        } catch (IOException var228) {
            method678();
        } catch (Exception var229) {
            String var225 = "" + (arg0.field1474 == null ? -1 : arg0.field1474.field2329) + class87.field1302 + (arg0.field1480 == null ? -1 : arg0.field1480.field2329) + class87.field1302 + (arg0.field1481 == null ? -1 : arg0.field1481.field2329) + class87.field1302 + arg0.field1469 + class87.field1302 + (Statics.field445 + Statics.field302.field1195[0]) + class87.field1302 + (Statics.field3556 + Statics.field302.field1196[0]) + class87.field1302;
            for (int var226 = 0; var226 < arg0.field1469 && var226 < 50; var226++) {
                var225 = var225 + var3.field2569[var226] + class87.field1302;
            }
            class165.method2426(var225, var229);
            method71();
        }
        return true;
    }

    @ObfuscatedName("bn.gv(Lgh;S)V")
    public static final void method977(class184 arg0) {
        class202 var1 = field900.field1473;
        if (class184.field2488 == arg0) {
            int var2 = var1.method3296();
            int var3 = var1.method3287();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field914[var4];
            int var7 = var1.method3288();
            int var8 = (var7 >> 4 & 0x7) + Statics.field413;
            int var9 = (var7 & 0x7) + Statics.field1240;
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                method2987(Statics.field505, var8, var9, var6, var2, var4, var5, 0, -1);
            }
            return;
        }
        if (class184.field2486 == arg0) {
            int var10 = var1.method3330();
            int var11 = var10 >> 4 & 0xF;
            int var12 = var10 & 0x7;
            int var13 = var1.method3288();
            int var14 = (var13 >> 4 & 0x7) + Statics.field413;
            int var15 = (var13 & 0x7) + Statics.field1240;
            int var16 = var1.method3354();
            int var17 = var1.method3261();
            if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                int var18 = var11 + 1;
                if (Statics.field302.field1195[0] >= var14 - var18 && Statics.field302.field1195[0] <= var14 + var18 && Statics.field302.field1196[0] >= var15 - var18 && Statics.field302.field1196[0] <= var15 + var18 && field912 != 0 && var12 > 0 && field1087 < 50) {
                    field1088[field1087] = var16;
                    field1089[field1087] = var12;
                    field1090[field1087] = var17;
                    field960[field1087] = null;
                    field905[field1087] = (var14 << 16) + (var15 << 8) + var11;
                    field1087++;
                }
            }
        }
        if (class184.field2485 == arg0) {
            int var19 = var1.method3288();
            int var20 = var19 >> 2;
            int var21 = var19 & 0x3;
            int var22 = field914[var20];
            int var23 = var1.method3261();
            int var24 = (var23 >> 4 & 0x7) + Statics.field413;
            int var25 = (var23 & 0x7) + Statics.field1240;
            int var26 = var1.method3298();
            int var27 = var1.method3298();
            byte var28 = var1.method3421();
            byte var29 = var1.method3290();
            byte var30 = var1.method3291();
            int var31 = var1.method3296();
            int var32 = var1.method3269();
            byte var33 = var1.method3421();
            class73 var34;
            if (field1091 == var32) {
                var34 = Statics.field302;
            } else {
                var34 = field967[var32];
            }
            if (var34 != null) {
                class283 var35 = class283.method3065(var27);
                int var36;
                int var37;
                if (var21 == 1 || var21 == 3) {
                    var36 = var35.field3605;
                    var37 = var35.field3604;
                } else {
                    var36 = var35.field3604;
                    var37 = var35.field3605;
                }
                int var38 = (var36 >> 1) + var24;
                int var39 = (var36 + 1 >> 1) + var24;
                int var40 = (var37 >> 1) + var25;
                int var41 = (var37 + 1 >> 1) + var25;
                int[][] var42 = class63.field738[Statics.field505];
                int var43 = var42[var38][var40] + var42[var39][var40] + var42[var38][var41] + var42[var39][var41] >> 2;
                int var44 = (var24 << 7) + (var36 << 6);
                int var45 = (var25 << 7) + (var37 << 6);
                class132 var46 = var35.method4708(var20, var21, var42, var44, var43, var45);
                if (var46 != null) {
                    method2987(Statics.field505, var24, var25, var22, -1, 0, 0, var26 + 1, var31 + 1);
                    var34.field832 = field866 + var26;
                    var34.field823 = field866 + var31;
                    var34.field837 = var46;
                    var34.field831 = var24 * 128 + var36 * 64;
                    var34.field836 = var25 * 128 + var37 * 64;
                    var34.field838 = var43;
                    if (var30 > var28) {
                        byte var47 = var30;
                        var30 = var28;
                        var28 = var47;
                    }
                    if (var29 > var33) {
                        byte var48 = var29;
                        var29 = var33;
                        var33 = var48;
                    }
                    var34.field833 = var24 + var30;
                    var34.field847 = var24 + var28;
                    var34.field839 = var25 + var29;
                    var34.field835 = var25 + var33;
                }
            }
        }
        if (class184.field2489 == arg0) {
            byte var49 = var1.method3291();
            int var50 = var1.method3300();
            int var51 = var1.method3298();
            int var52 = var1.method3287() * 4;
            int var53 = var1.method3269();
            byte var54 = var1.method3290();
            int var55 = var1.method3354();
            int var56 = var1.method3261();
            int var57 = (var56 >> 4 & 0x7) + Statics.field413;
            int var58 = (var56 & 0x7) + Statics.field1240;
            int var59 = var1.method3330();
            int var60 = var1.method3287();
            int var61 = var1.method3288() * 4;
            int var62 = var54 + var57;
            int var63 = var49 + var58;
            if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104 && var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && var53 != 65535) {
                int var64 = var57 * 128 + 64;
                int var65 = var58 * 128 + 64;
                int var66 = var62 * 128 + 64;
                int var67 = var63 * 128 + 64;
                class92 var68 = new class92(var53, Statics.field505, var64, var65, method466(var64, var65, Statics.field505) - var52, field866 + var51, field866 + var55, var60, var59, var50, var61);
                var68.method1801(var66, var67, method466(var66, var67, Statics.field505) - var61, field866 + var51);
                field871.method3793(var68);
            }
        } else if (class184.field2492 == arg0) {
            int var69 = var1.method3261();
            int var70 = var1.method3354();
            int var71 = var1.method3288();
            int var72 = (var71 >> 4 & 0x7) + Statics.field413;
            int var73 = (var71 & 0x7) + Statics.field1240;
            int var74 = var1.method3354();
            if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
                int var75 = var72 * 128 + 64;
                int var76 = var73 * 128 + 64;
                class83 var77 = new class83(var70, Statics.field505, var75, var76, method466(var75, var76, Statics.field505) - var69, var74, field866);
                field1001.method3793(var77);
            }
        } else if (class184.field2491 == arg0) {
            int var78 = var1.method3261();
            int var79 = var78 >> 2;
            int var80 = var78 & 0x3;
            int var81 = field914[var79];
            int var82 = var1.method3269();
            int var83 = var1.method3287();
            int var84 = (var83 >> 4 & 0x7) + Statics.field413;
            int var85 = (var83 & 0x7) + Statics.field1240;
            if (var84 >= 0 && var85 >= 0 && var84 < 103 && var85 < 103) {
                if (var81 == 0) {
                    class141 var86 = Statics.field1312.method2776(Statics.field505, var84, var85);
                    if (var86 != null) {
                        int var87 = var86.field2036 >> 14 & 0x7FFF;
                        if (var79 == 2) {
                            var86.field2034 = new class98(var87, 2, var80 + 4, Statics.field505, var84, var85, var82, false, var86.field2034);
                            var86.field2031 = new class98(var87, 2, var80 + 1 & 0x3, Statics.field505, var84, var85, var82, false, var86.field2031);
                        } else {
                            var86.field2034 = new class98(var87, var79, var80, Statics.field505, var84, var85, var82, false, var86.field2034);
                        }
                    }
                }
                if (var81 == 1) {
                    class146 var88 = Statics.field1312.method2723(Statics.field505, var84, var85);
                    if (var88 != null) {
                        int var89 = var88.field2077 >> 14 & 0x7FFF;
                        if (var79 == 4 || var79 == 5) {
                            var88.field2075 = new class98(var89, 4, var80, Statics.field505, var84, var85, var82, false, var88.field2075);
                        } else if (var79 == 6) {
                            var88.field2075 = new class98(var89, 4, var80 + 4, Statics.field505, var84, var85, var82, false, var88.field2075);
                        } else if (var79 == 7) {
                            var88.field2075 = new class98(var89, 4, (var80 + 2 & 0x3) + 4, Statics.field505, var84, var85, var82, false, var88.field2075);
                        } else if (var79 == 8) {
                            var88.field2075 = new class98(var89, 4, var80 + 4, Statics.field505, var84, var85, var82, false, var88.field2075);
                            var88.field2076 = new class98(var89, 4, (var80 + 2 & 0x3) + 4, Statics.field505, var84, var85, var82, false, var88.field2076);
                        }
                    }
                }
                if (var81 == 2) {
                    class147 var90 = Statics.field1312.method2726(Statics.field505, var84, var85);
                    if (var79 == 11) {
                        var79 = 10;
                    }
                    if (var90 != null) {
                        var90.field2090 = new class98(var90.field2093 >> 14 & 0x7FFF, var79, var80, Statics.field505, var84, var85, var82, false, var90.field2090);
                    }
                }
                if (var81 == 3) {
                    class128 var91 = Statics.field1312.method2725(Statics.field505, var84, var85);
                    if (var91 != null) {
                        var91.field1779 = new class98(var91.field1780 >> 14 & 0x7FFF, 22, var80, Statics.field505, var84, var85, var82, false, var91.field1779);
                    }
                }
            }
        } else if (class184.field2487 == arg0) {
            int var92 = var1.method3269();
            int var93 = var1.method3261();
            int var94 = (var93 >> 4 & 0x7) + Statics.field413;
            int var95 = (var93 & 0x7) + Statics.field1240;
            int var96 = var1.method3296();
            if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                class93 var97 = new class93();
                var97.field1398 = var96;
                var97.field1401 = var92;
                if (field962[Statics.field505][var94][var95] == null) {
                    field962[Statics.field505][var94][var95] = new class218();
                }
                field962[Statics.field505][var94][var95].method3793(var97);
                method177(var94, var95);
            }
        } else if (class184.field2490 == arg0) {
            int var98 = var1.method3330();
            int var99 = (var98 >> 4 & 0x7) + Statics.field413;
            int var100 = (var98 & 0x7) + Statics.field1240;
            int var101 = var1.method3261();
            int var102 = var101 >> 2;
            int var103 = var101 & 0x3;
            int var104 = field914[var102];
            if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                method2987(Statics.field505, var99, var100, var104, -1, var102, var103, 0, -1);
            }
        } else if (class184.field2484 == arg0) {
            int var105 = var1.method3269();
            int var106 = var1.method3261();
            int var107 = (var106 >> 4 & 0x7) + Statics.field413;
            int var108 = (var106 & 0x7) + Statics.field1240;
            int var109 = var1.method3296();
            int var110 = var1.method3296();
            if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                class218 var111 = field962[Statics.field505][var107][var108];
                if (var111 != null) {
                    for (class93 var112 = (class93) var111.method3798(); var112 != null; var112 = (class93) var111.method3800()) {
                        if ((var105 & 0x7FFF) == var112.field1398 && var112.field1401 == var110) {
                            var112.field1401 = var109;
                            break;
                        }
                    }
                    method177(var107, var108);
                }
            }
        } else if (class184.field2483 == arg0) {
            int var113 = var1.method3296();
            int var114 = var1.method3287();
            int var115 = (var114 >> 4 & 0x7) + Statics.field413;
            int var116 = (var114 & 0x7) + Statics.field1240;
            if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                class218 var117 = field962[Statics.field505][var115][var116];
                if (var117 != null) {
                    for (class93 var118 = (class93) var117.method3798(); var118 != null; var118 = (class93) var117.method3800()) {
                        if ((var113 & 0x7FFF) == var118.field1398) {
                            var118.method3785();
                            break;
                        }
                    }
                    if (var117.method3798() == null) {
                        field962[Statics.field505][var115][var116] = null;
                    }
                    method177(var115, var116);
                }
            }
        }
    }

    @ObfuscatedName("fr.gq(IIIIIIIIII)V")
    public static final void method2987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class75 var9 = null;
        for (class75 var10 = (class75) field980.method3798(); var10 != null; var10 = (class75) field980.method3800()) {
            if (var10.field1134 == arg0 && var10.field1127 == arg1 && var10.field1128 == arg2 && var10.field1131 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class75();
            var9.field1134 = arg0;
            var9.field1131 = arg3;
            var9.field1127 = arg1;
            var9.field1128 = arg2;
            method1726(var9);
            field980.method3793(var9);
        }
        var9.field1132 = arg4;
        var9.field1126 = arg5;
        var9.field1133 = arg6;
        var9.field1125 = arg7;
        var9.field1135 = arg8;
    }

    @ObfuscatedName("bi.gp(I)V")
    public static final void method989() {
        for (class75 var0 = (class75) field980.method3798(); var0 != null; var0 = (class75) field980.method3800()) {
            if (var0.field1135 == -1) {
                var0.field1125 = 0;
                method1726(var0);
            } else {
                var0.method3785();
            }
        }
    }

    @ObfuscatedName("ci.gg(Lbh;B)V")
    public static final void method1726(class75 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1131 == 0) {
            var1 = Statics.field1312.method2762(arg0.field1134, arg0.field1127, arg0.field1128);
        }
        if (arg0.field1131 == 1) {
            var1 = Statics.field1312.method2802(arg0.field1134, arg0.field1127, arg0.field1128);
        }
        if (arg0.field1131 == 2) {
            var1 = Statics.field1312.method2712(arg0.field1134, arg0.field1127, arg0.field1128);
        }
        if (arg0.field1131 == 3) {
            var1 = Statics.field1312.method2852(arg0.field1134, arg0.field1127, arg0.field1128);
        }
        if (var1 != 0) {
            int var5 = Statics.field1312.method2730(arg0.field1134, arg0.field1127, arg0.field1128, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1129 = var2;
        arg0.field1136 = var3;
        arg0.field1130 = var4;
    }

    @ObfuscatedName("y.gi(B)V")
    public static final void method19() {
        for (class75 var0 = (class75) field980.method3798(); var0 != null; var0 = (class75) field980.method3800()) {
            if (var0.field1135 > 0) {
                var0.field1135--;
            }
            if (var0.field1135 != 0) {
                if (var0.field1125 > 0) {
                    var0.field1125--;
                }
                if (var0.field1125 == 0 && var0.field1127 >= 1 && var0.field1128 >= 1 && var0.field1127 <= 102 && var0.field1128 <= 102 && (var0.field1132 < 0 || class63.method730(var0.field1132, var0.field1126))) {
                    method1831(var0.field1134, var0.field1131, var0.field1127, var0.field1128, var0.field1132, var0.field1133, var0.field1126);
                    var0.field1125 = -1;
                    if (var0.field1132 == var0.field1129 && var0.field1129 == -1) {
                        var0.method3785();
                    } else if (var0.field1132 == var0.field1129 && var0.field1133 == var0.field1130 && var0.field1136 == var0.field1126) {
                        var0.method3785();
                    }
                }
            } else if (var0.field1129 < 0 || class63.method730(var0.field1129, var0.field1136)) {
                method1831(var0.field1134, var0.field1131, var0.field1127, var0.field1128, var0.field1129, var0.field1130, var0.field1136);
                var0.method3785();
            }
        }
    }

    @ObfuscatedName("ch.gr(IIIIIIII)V")
    public static final void method1831(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field862 && Statics.field505 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1312.method2762(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1312.method2802(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1312.method2712(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1312.method2852(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1312.method2730(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1312.method2717(arg0, arg2, arg3);
                class283 var15 = class283.method3065(var12);
                if (var15.field3616 != 0) {
                    field886[arg0].method3119(arg2, arg3, var13, var14, var15.field3607);
                }
            }
            if (arg1 == 1) {
                Statics.field1312.method2718(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1312.method2846(arg0, arg2, arg3);
                class283 var16 = class283.method3065(var12);
                if (var16.field3604 + arg2 > 103 || var16.field3604 + arg3 > 103 || var16.field3605 + arg2 > 103 || var16.field3605 + arg3 > 103) {
                    return;
                }
                if (var16.field3616 != 0) {
                    field886[arg0].method3123(arg2, arg3, var16.field3604, var16.field3605, var14, var16.field3607);
                }
            }
            if (arg1 == 3) {
                Statics.field1312.method2720(arg0, arg2, arg3);
                class283 var17 = class283.method3065(var12);
                if (var17.field3616 == 1) {
                    field886[arg0].method3127(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class63.field736[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class138 var19 = Statics.field1312;
        class177 var20 = field886[arg0];
        class283 var21 = class283.method3065(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field3605;
            var23 = var21.field3604;
        } else {
            var22 = var21.field3604;
            var23 = var21.field3605;
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
        int[][] var28 = class63.field738[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field3608 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field3629 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class140 var34;
            if (var21.field3612 == -1 && var21.field3630 == null) {
                var34 = var21.method4708(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class98(arg4, 22, arg5, var18, arg2, arg3, var21.field3612, true, (class140) null);
            }
            var19.method2706(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field3616 == 1) {
                var20.method3116(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class140 var57;
            if (var21.field3612 == -1 && var21.field3630 == null) {
                var57 = var21.method4708(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class98(arg4, 10, arg5, var18, arg2, arg3, var21.field3612, true, (class140) null);
            }
            if (var57 != null) {
                var19.method2710(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field3616 != 0) {
                var20.method3115(arg2, arg3, var22, var23, var21.field3607);
            }
        } else if (arg6 >= 12) {
            class140 var35;
            if (var21.field3612 == -1 && var21.field3630 == null) {
                var35 = var21.method4708(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class98(arg4, arg6, arg5, var18, arg2, arg3, var21.field3612, true, (class140) null);
            }
            var19.method2710(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field3616 != 0) {
                var20.method3115(arg2, arg3, var22, var23, var21.field3607);
            }
        } else if (arg6 == 0) {
            class140 var36;
            if (var21.field3612 == -1 && var21.field3630 == null) {
                var36 = var21.method4708(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class98(arg4, 0, arg5, var18, arg2, arg3, var21.field3612, true, (class140) null);
            }
            var19.method2708(arg0, arg2, arg3, var29, var36, (class140) null, class63.field744[arg5], 0, var32, var33);
            if (var21.field3616 != 0) {
                var20.method3114(arg2, arg3, arg6, arg5, var21.field3607);
            }
        } else if (arg6 == 1) {
            class140 var37;
            if (var21.field3612 == -1 && var21.field3630 == null) {
                var37 = var21.method4708(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class98(arg4, 1, arg5, var18, arg2, arg3, var21.field3612, true, (class140) null);
            }
            var19.method2708(arg0, arg2, arg3, var29, var37, (class140) null, class63.field750[arg5], 0, var32, var33);
            if (var21.field3616 != 0) {
                var20.method3114(arg2, arg3, arg6, arg5, var21.field3607);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class140 var39;
            class140 var40;
            if (var21.field3612 == -1 && var21.field3630 == null) {
                var39 = var21.method4708(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method4708(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class98(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field3612, true, (class140) null);
                var40 = new class98(arg4, 2, var38, var18, arg2, arg3, var21.field3612, true, (class140) null);
            }
            var19.method2708(arg0, arg2, arg3, var29, var39, var40, class63.field744[arg5], class63.field744[var38], var32, var33);
            if (var21.field3616 != 0) {
                var20.method3114(arg2, arg3, arg6, arg5, var21.field3607);
            }
        } else if (arg6 == 3) {
            class140 var41;
            if (var21.field3612 == -1 && var21.field3630 == null) {
                var41 = var21.method4708(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class98(arg4, 3, arg5, var18, arg2, arg3, var21.field3612, true, (class140) null);
            }
            var19.method2708(arg0, arg2, arg3, var29, var41, (class140) null, class63.field750[arg5], 0, var32, var33);
            if (var21.field3616 != 0) {
                var20.method3114(arg2, arg3, arg6, arg5, var21.field3607);
            }
        } else if (arg6 == 9) {
            class140 var42;
            if (var21.field3612 == -1 && var21.field3630 == null) {
                var42 = var21.method4708(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class98(arg4, arg6, arg5, var18, arg2, arg3, var21.field3612, true, (class140) null);
            }
            var19.method2710(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field3616 != 0) {
                var20.method3115(arg2, arg3, var22, var23, var21.field3607);
            }
        } else if (arg6 == 4) {
            class140 var43;
            if (var21.field3612 == -1 && var21.field3630 == null) {
                var43 = var21.method4708(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class98(arg4, 4, arg5, var18, arg2, arg3, var21.field3612, true, (class140) null);
            }
            var19.method2709(arg0, arg2, arg3, var29, var43, (class140) null, class63.field744[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method2762(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class283.method3065(var45 >> 14 & 0x7FFF).field3635;
            }
            class140 var46;
            if (var21.field3612 == -1 && var21.field3630 == null) {
                var46 = var21.method4708(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class98(arg4, 4, arg5, var18, arg2, arg3, var21.field3612, true, (class140) null);
            }
            var19.method2709(arg0, arg2, arg3, var29, var46, (class140) null, class63.field744[arg5], 0, class63.field746[arg5] * var44, class63.field747[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method2762(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class283.method3065(var48 >> 14 & 0x7FFF).field3635 / 2;
            }
            class140 var49;
            if (var21.field3612 == -1 && var21.field3630 == null) {
                var49 = var21.method4708(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class98(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3612, true, (class140) null);
            }
            var19.method2709(arg0, arg2, arg3, var29, var49, (class140) null, 256, arg5, class63.field748[arg5] * var47, class63.field749[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class140 var51;
            if (var21.field3612 == -1 && var21.field3630 == null) {
                var51 = var21.method4708(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class98(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field3612, true, (class140) null);
            }
            var19.method2709(arg0, arg2, arg3, var29, var51, (class140) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method2762(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class283.method3065(var53 >> 14 & 0x7FFF).field3635 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class140 var55;
            class140 var56;
            if (var21.field3612 == -1 && var21.field3630 == null) {
                var55 = var21.method4708(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method4708(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class98(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field3612, true, (class140) null);
                var56 = new class98(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field3612, true, (class140) null);
            }
            var19.method2709(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class63.field748[arg5] * var52, class63.field749[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("o.gb(IIB)V")
    public static final void method177(int arg0, int arg1) {
        class218 var2 = field962[Statics.field505][arg0][arg1];
        if (var2 == null) {
            Statics.field1312.method2721(Statics.field505, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class93 var5 = null;
        for (class93 var6 = (class93) var2.method3798(); var6 != null; var6 = (class93) var2.method3800()) {
            class284 var7 = class284.method4245(var6.field1398);
            long var8 = (long) var7.field3691;
            if (var7.field3661 == 1) {
                var8 = (long) (var6.field1401 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1312.method2721(Statics.field505, arg0, arg1);
            return;
        }
        var2.method3794(var5);
        class93 var10 = null;
        class93 var11 = null;
        for (class93 var12 = (class93) var2.method3798(); var12 != null; var12 = (class93) var2.method3800()) {
            if (var5.field1398 != var12.field1398) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1398 != var12.field1398 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1312.method2733(Statics.field505, arg0, arg1, method466(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field505), var5, var13, var10, var11);
    }

    @ObfuscatedName("cd.gc(ZLgb;I)V")
    public static final void method1639(boolean arg0, class202 arg1) {
        field999 = 0;
        field868 = 0;
        method1089();
        method5(arg0, arg1);
        for (int var2 = 0; var2 < field868; var2++) {
            int var3 = field899[var2];
            class85 var4 = field1035[var3];
            int var5 = arg1.method3330();
            if ((var5 & 0x4) != 0) {
                var4.field1139 = arg1.method3296();
                if (var4.field1139 == 65535) {
                    var4.field1139 = -1;
                }
            }
            if ((var5 & 0x8) != 0) {
                int var6 = arg1.method3288();
                if (var6 > 0) {
                    for (int var7 = 0; var7 < var6; var7++) {
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = -1;
                        int var11 = arg1.method3380();
                        if (var11 == 32767) {
                            var11 = arg1.method3380();
                            var9 = arg1.method3380();
                            var8 = arg1.method3380();
                            var10 = arg1.method3380();
                        } else if (var11 == 32766) {
                            var11 = -1;
                        } else {
                            var9 = arg1.method3380();
                        }
                        int var12 = arg1.method3380();
                        var4.method1505(var11, var9, var8, var10, field866, var12);
                    }
                }
                int var13 = arg1.method3330();
                if (var13 > 0) {
                    for (int var14 = 0; var14 < var13; var14++) {
                        int var15 = arg1.method3380();
                        int var16 = arg1.method3380();
                        if (var16 == 32767) {
                            var4.method1507(var15);
                        } else {
                            int var17 = arg1.method3380();
                            int var18 = arg1.method3287();
                            int var19 = var16 > 0 ? arg1.method3288() : var18;
                            var4.method1506(var15, field866, var16, var17, var18, var19);
                        }
                    }
                }
            }
            if ((var5 & 0x20) != 0) {
                int var20 = arg1.method3354();
                int var21 = arg1.method3269();
                int var22 = var4.field1186 - (var20 - Statics.field445 - Statics.field445) * 64;
                int var23 = var4.field1151 - (var21 - Statics.field3556 - Statics.field3556) * 64;
                if (var22 != 0 || var23 != 0) {
                    var4.field1143 = (int) (Math.atan2((double) var22, (double) var23) * 325.949D) & 0x7FF;
                }
            }
            if ((var5 & 0x1) != 0) {
                var4.field1292 = class286.method4254(arg1.method3296());
                var4.field1194 = var4.field1292.field3710;
                var4.field1184 = var4.field1292.field3723;
                var4.field1164 = var4.field1292.field3732;
                var4.field1140 = var4.field1292.field3729;
                var4.field1150 = var4.field1292.field3718;
                var4.field1148 = var4.field1292.field3735;
                var4.field1181 = var4.field1292.field3713;
                var4.field1146 = var4.field1292.field3714;
                var4.field1149 = var4.field1292.field3715;
            }
            if ((var5 & 0x2) != 0) {
                int var24 = arg1.method3296();
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var25 = arg1.method3261();
                if (var4.field1172 == var24 && var24 != -1) {
                    int var26 = class288.method4510(var24).field3756;
                    if (var26 == 1) {
                        var4.field1173 = 0;
                        var4.field1174 = 0;
                        var4.field1175 = var25;
                        var4.field1176 = 0;
                    }
                    if (var26 == 2) {
                        var4.field1176 = 0;
                    }
                } else if (var24 == -1 || var4.field1172 == -1 || class288.method4510(var24).field3763 >= class288.method4510(var4.field1172).field3763) {
                    var4.field1172 = var24;
                    var4.field1173 = 0;
                    var4.field1174 = 0;
                    var4.field1175 = var25;
                    var4.field1176 = 0;
                    var4.field1199 = var4.field1193;
                }
            }
            if ((var5 & 0x40) != 0) {
                var4.field1177 = arg1.method3298();
                int var27 = arg1.method3264();
                var4.field1158 = var27 >> 16;
                var4.field1180 = (var27 & 0xFFFF) + field866;
                var4.field1178 = 0;
                var4.field1179 = 0;
                if (var4.field1180 > field866) {
                    var4.field1178 = -1;
                }
                if (var4.field1177 == 65535) {
                    var4.field1177 = -1;
                }
            }
            if ((var5 & 0x10) != 0) {
                var4.field1153 = arg1.method3268();
                var4.field1156 = 100;
            }
        }
        for (int var28 = 0; var28 < field999; var28++) {
            int var29 = field973[var28];
            if (field866 != field1035[var29].field1141) {
                field1035[var29].field1292 = null;
                field1035[var29] = null;
            }
        }
        if (field900.field1469 != arg1.field2568) {
            throw new RuntimeException(arg1.field2568 + class87.field1302 + field900.field1469);
        }
        for (int var30 = 0; var30 < field896; var30++) {
            if (field1035[field897[var30]] == null) {
                throw new RuntimeException(var30 + class87.field1302 + field896);
            }
        }
    }

    @ObfuscatedName("bp.gk(I)V")
    public static final void method1089() {
        class202 var0 = field900.field1473;
        var0.method3544();
        int var1 = var0.method3545(8);
        if (var1 < field896) {
            for (int var2 = var1; var2 < field896; var2++) {
                field973[++field999 - 1] = field897[var2];
            }
        }
        if (var1 > field896) {
            throw new RuntimeException("");
        }
        field896 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field897[var3];
            class85 var5 = field1035[var4];
            int var6 = var0.method3545(1);
            if (var6 == 0) {
                field897[++field896 - 1] = var4;
                var5.field1141 = field866;
            } else {
                int var7 = var0.method3545(2);
                if (var7 == 0) {
                    field897[++field896 - 1] = var4;
                    var5.field1141 = field866;
                    field899[++field868 - 1] = var4;
                } else if (var7 == 1) {
                    field897[++field896 - 1] = var4;
                    var5.field1141 = field866;
                    int var8 = var0.method3545(3);
                    var5.method1732(var8, (byte) 1);
                    int var9 = var0.method3545(1);
                    if (var9 == 1) {
                        field899[++field868 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field897[++field896 - 1] = var4;
                    var5.field1141 = field866;
                    int var10 = var0.method3545(3);
                    var5.method1732(var10, (byte) 2);
                    int var11 = var0.method3545(3);
                    var5.method1732(var11, (byte) 2);
                    int var12 = var0.method3545(1);
                    if (var12 == 1) {
                        field899[++field868 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field973[++field999 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("z.gt(ZLgb;I)V")
    public static final void method5(boolean arg0, class202 arg1) {
        while (true) {
            if (arg1.method3547(field900.field1469) >= 27) {
                int var2 = arg1.method3545(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field1035[var2] == null) {
                        field1035[var2] = new class85();
                        var3 = true;
                    }
                    class85 var4 = field1035[var2];
                    field897[++field896 - 1] = var2;
                    var4.field1141 = field866;
                    int var5 = field977[arg1.method3545(3)];
                    if (var3) {
                        var4.field1191 = var4.field1183 = var5;
                    }
                    int var6;
                    if (arg0) {
                        var6 = arg1.method3545(8);
                        if (var6 > 127) {
                            var6 -= 256;
                        }
                    } else {
                        var6 = arg1.method3545(5);
                        if (var6 > 15) {
                            var6 -= 32;
                        }
                    }
                    int var7;
                    if (arg0) {
                        var7 = arg1.method3545(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = arg1.method3545(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    var4.field1292 = class286.method4254(arg1.method3545(14));
                    int var8 = arg1.method3545(1);
                    int var9 = arg1.method3545(1);
                    if (var9 == 1) {
                        field899[++field868 - 1] = var2;
                    }
                    var4.field1194 = var4.field1292.field3710;
                    var4.field1184 = var4.field1292.field3723;
                    if (var4.field1184 == 0) {
                        var4.field1183 = 0;
                    }
                    var4.field1164 = var4.field1292.field3732;
                    var4.field1140 = var4.field1292.field3729;
                    var4.field1150 = var4.field1292.field3718;
                    var4.field1148 = var4.field1292.field3735;
                    var4.field1181 = var4.field1292.field3713;
                    var4.field1146 = var4.field1292.field3714;
                    var4.field1149 = var4.field1292.field3715;
                    var4.method1731(Statics.field302.field1195[0] + var6, Statics.field302.field1196[0] + var7, var8 == 1);
                    continue;
                }
            }
            arg1.method3546();
            return;
        }
    }

    @ObfuscatedName("gd.gf(Lbd;IIBI)V")
    public static final void method3221(class73 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1195[0];
        int var5 = arg0.field1196[0];
        int var6 = arg0.method1077();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method1077();
        class179 var8 = method3511(arg1, arg2);
        class177 var9 = field886[arg0.field845];
        int[] var10 = field1096;
        int[] var11 = field1122;
        for (int var12 = 0; var12 < 128; var12++) {
            for (int var13 = 0; var13 < 128; var13++) {
                class178.field2273[var12][var13] = 0;
                class178.field2271[var12][var13] = 99999999;
            }
        }
        boolean var29;
        if (var7 == 1) {
            int var14 = var4;
            int var15 = var5;
            byte var16 = 64;
            byte var17 = 64;
            int var18 = var4 - var16;
            int var19 = var5 - var17;
            class178.field2273[var16][var17] = 99;
            class178.field2271[var16][var17] = 0;
            byte var20 = 0;
            int var21 = 0;
            class178.field2275[var20] = var4;
            int var70 = var20 + 1;
            class178.field2276[var20] = var5;
            int[][] var22 = var9.field2266;
            boolean var27;
            while (true) {
                if (var70 == var21) {
                    Statics.field277 = var14;
                    Statics.field2272 = var15;
                    var27 = false;
                    break;
                }
                var14 = class178.field2275[var21];
                var15 = class178.field2276[var21];
                var21 = var21 + 1 & 0xFFF;
                int var23 = var14 - var18;
                int var24 = var15 - var19;
                int var25 = var14 - var9.field2267;
                int var26 = var15 - var9.field2263;
                if (var8.method1034(1, var14, var15, var9)) {
                    Statics.field277 = var14;
                    Statics.field2272 = var15;
                    var27 = true;
                    break;
                }
                int var28 = class178.field2271[var23][var24] + 1;
                if (var23 > 0 && class178.field2273[var23 - 1][var24] == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0) {
                    class178.field2275[var70] = var14 - 1;
                    class178.field2276[var70] = var15;
                    var70 = var70 + 1 & 0xFFF;
                    class178.field2273[var23 - 1][var24] = 2;
                    class178.field2271[var23 - 1][var24] = var28;
                }
                if (var23 < 127 && class178.field2273[var23 + 1][var24] == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0) {
                    class178.field2275[var70] = var14 + 1;
                    class178.field2276[var70] = var15;
                    var70 = var70 + 1 & 0xFFF;
                    class178.field2273[var23 + 1][var24] = 8;
                    class178.field2271[var23 + 1][var24] = var28;
                }
                if (var24 > 0 && class178.field2273[var23][var24 - 1] == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class178.field2275[var70] = var14;
                    class178.field2276[var70] = var15 - 1;
                    var70 = var70 + 1 & 0xFFF;
                    class178.field2273[var23][var24 - 1] = 1;
                    class178.field2271[var23][var24 - 1] = var28;
                }
                if (var24 < 127 && class178.field2273[var23][var24 + 1] == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class178.field2275[var70] = var14;
                    class178.field2276[var70] = var15 + 1;
                    var70 = var70 + 1 & 0xFFF;
                    class178.field2273[var23][var24 + 1] = 4;
                    class178.field2271[var23][var24 + 1] = var28;
                }
                if (var23 > 0 && var24 > 0 && class178.field2273[var23 - 1][var24 - 1] == 0 && (var22[var25 - 1][var26 - 1] & 0x124010E) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class178.field2275[var70] = var14 - 1;
                    class178.field2276[var70] = var15 - 1;
                    var70 = var70 + 1 & 0xFFF;
                    class178.field2273[var23 - 1][var24 - 1] = 3;
                    class178.field2271[var23 - 1][var24 - 1] = var28;
                }
                if (var23 < 127 && var24 > 0 && class178.field2273[var23 + 1][var24 - 1] == 0 && (var22[var25 + 1][var26 - 1] & 0x1240183) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 - 1] & 0x1240102) == 0) {
                    class178.field2275[var70] = var14 + 1;
                    class178.field2276[var70] = var15 - 1;
                    var70 = var70 + 1 & 0xFFF;
                    class178.field2273[var23 + 1][var24 - 1] = 9;
                    class178.field2271[var23 + 1][var24 - 1] = var28;
                }
                if (var23 > 0 && var24 < 127 && class178.field2273[var23 - 1][var24 + 1] == 0 && (var22[var25 - 1][var26 + 1] & 0x1240138) == 0 && (var22[var25 - 1][var26] & 0x1240108) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class178.field2275[var70] = var14 - 1;
                    class178.field2276[var70] = var15 + 1;
                    var70 = var70 + 1 & 0xFFF;
                    class178.field2273[var23 - 1][var24 + 1] = 6;
                    class178.field2271[var23 - 1][var24 + 1] = var28;
                }
                if (var23 < 127 && var24 < 127 && class178.field2273[var23 + 1][var24 + 1] == 0 && (var22[var25 + 1][var26 + 1] & 0x12401E0) == 0 && (var22[var25 + 1][var26] & 0x1240180) == 0 && (var22[var25][var26 + 1] & 0x1240120) == 0) {
                    class178.field2275[var70] = var14 + 1;
                    class178.field2276[var70] = var15 + 1;
                    var70 = var70 + 1 & 0xFFF;
                    class178.field2273[var23 + 1][var24 + 1] = 12;
                    class178.field2271[var23 + 1][var24 + 1] = var28;
                }
            }
            var29 = var27;
        } else if (var7 == 2) {
            int var30 = var4;
            int var31 = var5;
            byte var32 = 64;
            byte var33 = 64;
            int var34 = var4 - var32;
            int var35 = var5 - var33;
            class178.field2273[var32][var33] = 99;
            class178.field2271[var32][var33] = 0;
            byte var36 = 0;
            int var37 = 0;
            class178.field2275[var36] = var4;
            int var71 = var36 + 1;
            class178.field2276[var36] = var5;
            int[][] var38 = var9.field2266;
            boolean var43;
            while (true) {
                if (var71 == var37) {
                    Statics.field277 = var30;
                    Statics.field2272 = var31;
                    var43 = false;
                    break;
                }
                var30 = class178.field2275[var37];
                var31 = class178.field2276[var37];
                var37 = var37 + 1 & 0xFFF;
                int var39 = var30 - var34;
                int var40 = var31 - var35;
                int var41 = var30 - var9.field2267;
                int var42 = var31 - var9.field2263;
                if (var8.method1034(2, var30, var31, var9)) {
                    Statics.field277 = var30;
                    Statics.field2272 = var31;
                    var43 = true;
                    break;
                }
                int var44 = class178.field2271[var39][var40] + 1;
                if (var39 > 0 && class178.field2273[var39 - 1][var40] == 0 && (var38[var41 - 1][var42] & 0x124010E) == 0 && (var38[var41 - 1][var42 + 1] & 0x1240138) == 0) {
                    class178.field2275[var71] = var30 - 1;
                    class178.field2276[var71] = var31;
                    var71 = var71 + 1 & 0xFFF;
                    class178.field2273[var39 - 1][var40] = 2;
                    class178.field2271[var39 - 1][var40] = var44;
                }
                if (var39 < 126 && class178.field2273[var39 + 1][var40] == 0 && (var38[var41 + 2][var42] & 0x1240183) == 0 && (var38[var41 + 2][var42 + 1] & 0x12401E0) == 0) {
                    class178.field2275[var71] = var30 + 1;
                    class178.field2276[var71] = var31;
                    var71 = var71 + 1 & 0xFFF;
                    class178.field2273[var39 + 1][var40] = 8;
                    class178.field2271[var39 + 1][var40] = var44;
                }
                if (var40 > 0 && class178.field2273[var39][var40 - 1] == 0 && (var38[var41][var42 - 1] & 0x124010E) == 0 && (var38[var41 + 1][var42 - 1] & 0x1240183) == 0) {
                    class178.field2275[var71] = var30;
                    class178.field2276[var71] = var31 - 1;
                    var71 = var71 + 1 & 0xFFF;
                    class178.field2273[var39][var40 - 1] = 1;
                    class178.field2271[var39][var40 - 1] = var44;
                }
                if (var40 < 126 && class178.field2273[var39][var40 + 1] == 0 && (var38[var41][var42 + 2] & 0x1240138) == 0 && (var38[var41 + 1][var42 + 2] & 0x12401E0) == 0) {
                    class178.field2275[var71] = var30;
                    class178.field2276[var71] = var31 + 1;
                    var71 = var71 + 1 & 0xFFF;
                    class178.field2273[var39][var40 + 1] = 4;
                    class178.field2271[var39][var40 + 1] = var44;
                }
                if (var39 > 0 && var40 > 0 && class178.field2273[var39 - 1][var40 - 1] == 0 && (var38[var41 - 1][var42] & 0x124013E) == 0 && (var38[var41 - 1][var42 - 1] & 0x124010E) == 0 && (var38[var41][var42 - 1] & 0x124018F) == 0) {
                    class178.field2275[var71] = var30 - 1;
                    class178.field2276[var71] = var31 - 1;
                    var71 = var71 + 1 & 0xFFF;
                    class178.field2273[var39 - 1][var40 - 1] = 3;
                    class178.field2271[var39 - 1][var40 - 1] = var44;
                }
                if (var39 < 126 && var40 > 0 && class178.field2273[var39 + 1][var40 - 1] == 0 && (var38[var41 + 1][var42 - 1] & 0x124018F) == 0 && (var38[var41 + 2][var42 - 1] & 0x1240183) == 0 && (var38[var41 + 2][var42] & 0x12401E3) == 0) {
                    class178.field2275[var71] = var30 + 1;
                    class178.field2276[var71] = var31 - 1;
                    var71 = var71 + 1 & 0xFFF;
                    class178.field2273[var39 + 1][var40 - 1] = 9;
                    class178.field2271[var39 + 1][var40 - 1] = var44;
                }
                if (var39 > 0 && var40 < 126 && class178.field2273[var39 - 1][var40 + 1] == 0 && (var38[var41 - 1][var42 + 1] & 0x124013E) == 0 && (var38[var41 - 1][var42 + 2] & 0x1240138) == 0 && (var38[var41][var42 + 2] & 0x12401F8) == 0) {
                    class178.field2275[var71] = var30 - 1;
                    class178.field2276[var71] = var31 + 1;
                    var71 = var71 + 1 & 0xFFF;
                    class178.field2273[var39 - 1][var40 + 1] = 6;
                    class178.field2271[var39 - 1][var40 + 1] = var44;
                }
                if (var39 < 126 && var40 < 126 && class178.field2273[var39 + 1][var40 + 1] == 0 && (var38[var41 + 1][var42 + 2] & 0x12401F8) == 0 && (var38[var41 + 2][var42 + 2] & 0x12401E0) == 0 && (var38[var41 + 2][var42 + 1] & 0x12401E3) == 0) {
                    class178.field2275[var71] = var30 + 1;
                    class178.field2276[var71] = var31 + 1;
                    var71 = var71 + 1 & 0xFFF;
                    class178.field2273[var39 + 1][var40 + 1] = 12;
                    class178.field2271[var39 + 1][var40 + 1] = var44;
                }
            }
            var29 = var43;
        } else {
            var29 = class178.method3090(var4, var5, var7, var8, var9);
        }
        int var63;
        label424: {
            int var45 = var4 - 64;
            int var46 = var5 - 64;
            int var47 = Statics.field277;
            int var48 = Statics.field2272;
            if (!var29) {
                int var49 = Integer.MAX_VALUE;
                int var50 = Integer.MAX_VALUE;
                byte var51 = 10;
                int var52 = var8.field2283;
                int var53 = var8.field2280;
                int var54 = var8.field2281;
                int var55 = var8.field2282;
                for (int var56 = var52 - var51; var56 <= var51 + var52; var56++) {
                    for (int var57 = var53 - var51; var57 <= var51 + var53; var57++) {
                        int var58 = var56 - var45;
                        int var59 = var57 - var46;
                        if (var58 >= 0 && var59 >= 0 && var58 < 128 && var59 < 128 && class178.field2271[var58][var59] < 100) {
                            int var60 = 0;
                            if (var56 < var52) {
                                var60 = var52 - var56;
                            } else if (var56 > var52 + var54 - 1) {
                                var60 = var56 - (var52 + var54 - 1);
                            }
                            int var61 = 0;
                            if (var57 < var53) {
                                var61 = var53 - var57;
                            } else if (var57 > var53 + var55 - 1) {
                                var61 = var57 - (var53 + var55 - 1);
                            }
                            int var62 = var60 * var60 + var61 * var61;
                            if (var62 < var49 || var49 == var62 && class178.field2271[var58][var59] < var50) {
                                var49 = var62;
                                var50 = class178.field2271[var58][var59];
                                var47 = var56;
                                var48 = var57;
                            }
                        }
                    }
                }
                if (var49 == Integer.MAX_VALUE) {
                    var63 = -1;
                    break label424;
                }
            }
            if (var4 == var47 && var5 == var48) {
                var63 = 0;
            } else {
                byte var64 = 0;
                class178.field2275[var64] = var47;
                int var72 = var64 + 1;
                class178.field2276[var64] = var48;
                int var65;
                int var66 = var65 = class178.field2273[var47 - var45][var48 - var46];
                while (var4 != var47 || var5 != var48) {
                    if (var65 != var66) {
                        var65 = var66;
                        class178.field2275[var72] = var47;
                        class178.field2276[var72++] = var48;
                    }
                    if ((var66 & 0x2) != 0) {
                        var47++;
                    } else if ((var66 & 0x8) != 0) {
                        var47--;
                    }
                    if ((var66 & 0x1) != 0) {
                        var48++;
                    } else if ((var66 & 0x4) != 0) {
                        var48--;
                    }
                    var66 = class178.field2273[var47 - var45][var48 - var46];
                }
                int var67 = 0;
                while (var72-- > 0) {
                    var10[var67] = class178.field2275[var72];
                    var11[var67++] = class178.field2276[var72];
                    if (var67 >= var10.length) {
                        break;
                    }
                }
                var63 = var67;
            }
        }
        int var68 = var63;
        if (var63 >= 1) {
            for (int var69 = 0; var69 < var68 - 1; var69++) {
                arg0.method1057(field1096[var69], field1122[var69], arg3);
            }
        }
    }

    @ObfuscatedName("gq.gw(IIB)Lfj;")
    public static class179 method3511(int arg0, int arg1) {
        field1120.field2283 = arg0;
        field1120.field2280 = arg1;
        field1120.field2281 = 1;
        field1120.field2282 = 1;
        return field1120;
    }

    @ObfuscatedName("ad.gz(B)V")
    public static void method474() {
        field1075 = 0;
        field987 = false;
    }

    @ObfuscatedName("eo.hq(IIIII)V")
    public static final void method2933(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1052; var4++) {
            if (field930[var4] + field1059[var4] > arg0 && field930[var4] < arg0 + arg2 && field1060[var4] + field1058[var4] > arg1 && field1058[var4] < arg1 + arg3) {
                field1054[var4] = true;
            }
        }
    }

    @ObfuscatedName("gs.hd(IIIII)V")
    public static final void method3161(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1052; var4++) {
            if (field930[var4] + field1059[var4] > arg0 && field930[var4] < arg0 + arg2 && field1060[var4] + field1058[var4] > arg1 && field1058[var4] < arg1 + arg3) {
                field1044[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hb(I)V")
    public final void method1105() {
        method4235();
        if (Statics.field2148 != null || field1022 != null) {
            return;
        }
        int var18;
        int var21;
        int var22;
        label191: {
            int var1 = class61.field729;
            if (field987) {
                if (var1 != 1 && (Statics.field3560 || var1 != 4)) {
                    int var2 = class61.field723;
                    int var3 = class61.field715;
                    if (var2 < Statics.field803 - 10 || var2 > Statics.field803 + Statics.field1290 + 10 || var3 < Statics.field3389 - 10 || var3 > Statics.field3878 + Statics.field3389 + 10) {
                        field987 = false;
                        method2933(Statics.field803, Statics.field3389, Statics.field1290, Statics.field3878);
                    }
                }
                if (var1 == 1 || !Statics.field3560 && var1 == 4) {
                    int var4 = Statics.field803;
                    int var5 = Statics.field3389;
                    int var6 = Statics.field1290;
                    int var7 = class61.field722;
                    int var8 = class61.field728;
                    int var9 = -1;
                    for (int var10 = 0; var10 < field1075; var10++) {
                        int var11 = (field1075 - 1 - var10) * 15 + var5 + 31;
                        if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                            var9 = var10;
                        }
                    }
                    if (var9 != -1 && var9 >= 0) {
                        int var12 = field1047[var9];
                        int var13 = field953[var9];
                        int var14 = field991[var9];
                        int var15 = field992[var9];
                        String var16 = field988[var9];
                        String var17 = field994[var9];
                        method958(var12, var13, var14, var15, var16, var17, class61.field722, class61.field728);
                    }
                    field987 = false;
                    method2933(Statics.field803, Statics.field3389, Statics.field1290, Statics.field3878);
                }
            } else {
                var18 = field1075 - 1;
                if ((var1 == 1 || !Statics.field3560 && var1 == 4) && var18 >= 0) {
                    int var20 = field991[var18];
                    if (var20 == 39 || var20 == 40 || var20 == 41 || var20 == 42 || var20 == 43 || var20 == 33 || var20 == 34 || var20 == 35 || var20 == 36 || var20 == 37 || var20 == 38 || var20 == 1005) {
                        var21 = field1047[var18];
                        var22 = field953[var18];
                        class243 var23 = class243.method20(var22);
                        int var24 = method1737(var23);
                        boolean var25 = (var24 >> 28 & 0x1) != 0;
                        if (var25) {
                            break label191;
                        }
                        class244 var10000 = (class244) null;
                        if (class244.method4240(method1737(var23))) {
                            break label191;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field3560 && var1 == 4) && this.method1160()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field3560 && var1 == 4) && field1075 > 0 && var18 >= 0) {
                    int var28 = field1047[var18];
                    int var29 = field953[var18];
                    int var30 = field991[var18];
                    int var31 = field992[var18];
                    String var32 = field988[var18];
                    String var33 = field994[var18];
                    method958(var28, var29, var30, var31, var32, var33, class61.field722, class61.field728);
                }
                if (var1 == 2 && field1075 > 0) {
                    this.method1107(class61.field722, class61.field728);
                }
            }
            return;
        }
        if (Statics.field2148 != null && !field963 && field1075 > 0 && !this.method1160()) {
            int var26 = field1049;
            int var27 = field961;
            method482(Statics.field2103, var26, var27);
            Statics.field2103 = null;
        }
        field963 = false;
        field964 = 0;
        if (Statics.field2148 != null) {
            method3073(Statics.field2148);
        }
        Statics.field2148 = class243.method20(var22);
        field959 = var21;
        field1049 = class61.field722;
        field961 = class61.field728;
        if (var18 >= 0) {
            method244(var18);
        }
        method3073(Statics.field2148);
    }

    @ObfuscatedName("client.hg(B)Z")
    public final boolean method1160() {
        int var1 = field1075 - 1;
        return (field925 == 1 && field1075 > 2 || method34(var1)) && !field995[var1];
    }

    @ObfuscatedName("client.hp(III)V")
    public final void method1107(int arg0, int arg1) {
        int var3 = Statics.field2079.method5224(class252.field3299);
        for (int var4 = 0; var4 < field1075; var4++) {
            int var5 = Statics.field2079.method5224(method161(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field1075 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field695) {
            var7 = Statics.field695 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field2582) {
            var8 = Statics.field2582 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field1312.method2737(Statics.field505, arg0, arg1, false);
        field987 = true;
        Statics.field803 = var7;
        Statics.field3389 = var8;
        Statics.field1290 = var3;
        Statics.field3878 = field1075 * 15 + 22;
    }

    @ObfuscatedName("s.hw(II)Z")
    public static final boolean method34(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field991[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ad.he(Lcc;III)V")
    public static final void method482(class88 arg0, int arg1, int arg2) {
        method958(arg0.field1318, arg0.field1314, arg0.field1315, arg0.field1320, arg0.field1313, arg0.field1313, arg1, arg2);
    }

    @ObfuscatedName("bj.hs(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method958(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 8) {
            class85 var8 = field1035[arg3];
            if (var8 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var9 = class185.method251(class182.field2391, field900.field1471);
                var9.field2497.method3304(Statics.field786);
                var9.field2497.method3294(field1043);
                var9.field2497.method3432(arg3);
                var9.field2497.method3274(class52.field637[82] ? 1 : 0);
                field900.method1921(var9);
            }
        }
        if (arg2 == 28) {
            class185 var10 = class185.method251(class182.field2433, field900.field1471);
            var10.field2497.method3326(arg1);
            field900.method1921(var10);
            class243 var11 = class243.method20(arg1);
            if (var11.field2938 != null && var11.field2938[0][0] == 5) {
                int var12 = var11.field2938[0][1];
                class238.field2783[var12] = 1 - class238.field2783[var12];
                method2934(var12);
            }
        }
        if (arg2 == 1002) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            class185 var13 = class185.method251(class182.field2384, field900.field1471);
            var13.field2497.method3360(arg3 >> 14 & 0x7FFF);
            field900.method1921(var13);
        }
        if (arg2 == 23) {
            if (field987) {
                Statics.field1312.method2738();
            } else {
                Statics.field1312.method2737(Statics.field505, arg0, arg1, true);
            }
        }
        if (arg2 == 24) {
            class243 var14 = class243.method20(arg1);
            boolean var15 = true;
            if (var14.field2922 > 0) {
                var15 = method3(var14);
            }
            if (var15) {
                class185 var16 = class185.method251(class182.field2433, field900.field1471);
                var16.field2497.method3326(arg1);
                field900.method1921(var16);
            }
        }
        if (arg2 == 1005) {
            class243 var17 = class243.method20(arg1);
            if (var17 == null || var17.field2954[arg0] < 100000) {
                class185 var18 = class185.method251(class182.field2410, field900.field1471);
                var18.field2497.method3360(arg3);
                field900.method1921(var18);
            } else {
                class96.method140(27, "", var17.field2954[arg0] + " x " + class284.method4245(arg3).field3650);
            }
            field957 = 0;
            Statics.field478 = class243.method20(arg1);
            field958 = arg0;
        }
        if (arg2 == 11) {
            class85 var19 = field1035[arg3];
            if (var19 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var20 = class185.method251(class182.field2466, field900.field1471);
                var20.field2497.method3259(class52.field637[82] ? 1 : 0);
                var20.field2497.method3432(arg3);
                field900.method1921(var20);
            }
        }
        if (arg2 == 14) {
            class73 var21 = field967[arg3];
            if (var21 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var22 = class185.method251(class182.field2463, field900.field1471);
                var22.field2497.method3243(class52.field637[82] ? 1 : 0);
                var22.field2497.method3424(arg3);
                var22.field2497.method3432(Statics.field541);
                var22.field2497.method3468(Statics.field821);
                var22.field2497.method3424(Statics.field1439);
                field900.method1921(var22);
            }
        }
        if (arg2 == 38) {
            method4160();
            class243 var23 = class243.method20(arg1);
            field1004 = 1;
            Statics.field541 = arg0;
            Statics.field821 = arg1;
            Statics.field1439 = arg3;
            method3073(var23);
            field1005 = class87.method3100(16748608) + class284.method4245(arg3).field3650 + class87.method3100(16777215);
            if (field1005 == null) {
                field1005 = class252.field3160;
            }
            return;
        }
        if (arg2 == 37) {
            class185 var24 = class185.method251(class182.field2443, field900.field1471);
            var24.field2497.method3360(arg3);
            var24.field2497.method3432(arg0);
            var24.field2497.method3303(arg1);
            field900.method1921(var24);
            field957 = 0;
            Statics.field478 = class243.method20(arg1);
            field958 = arg0;
        }
        if (arg2 == 1) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            field1079 = arg0;
            field1112 = arg1;
            class185 var25 = class185.method251(class182.field2382, field900.field1471);
            var25.field2497.method3360(arg3 >> 14 & 0x7FFF);
            var25.field2497.method3424(Statics.field541);
            var25.field2497.method3259(class52.field637[82] ? 1 : 0);
            var25.field2497.method3432(Statics.field1439);
            var25.field2497.method3360(Statics.field445 + arg0);
            var25.field2497.method3304(Statics.field821);
            var25.field2497.method3424(Statics.field3556 + arg1);
            field900.method1921(var25);
        }
        if (arg2 == 39) {
            class185 var26 = class185.method251(class182.field2402, field900.field1471);
            var26.field2497.method3303(arg1);
            var26.field2497.method3294(arg0);
            var26.field2497.method3294(arg3);
            field900.method1921(var26);
            field957 = 0;
            Statics.field478 = class243.method20(arg1);
            field958 = arg0;
        }
        if (arg2 == 32) {
            class185 var27 = class185.method251(class182.field2460, field900.field1471);
            var27.field2497.method3424(arg0);
            var27.field2497.method3424(field1043);
            var27.field2497.method3303(arg1);
            var27.field2497.method3424(arg3);
            var27.field2497.method3326(Statics.field786);
            field900.method1921(var27);
            field957 = 0;
            Statics.field478 = class243.method20(arg1);
            field958 = arg0;
        }
        if (arg2 == 22) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            field1079 = arg0;
            field1112 = arg1;
            class185 var28 = class185.method251(class182.field2468, field900.field1471);
            var28.field2497.method3274(class52.field637[82] ? 1 : 0);
            var28.field2497.method3432(Statics.field445 + arg0);
            var28.field2497.method3360(Statics.field3556 + arg1);
            var28.field2497.method3432(arg3);
            field900.method1921(var28);
        }
        if (arg2 == 25) {
            class243 var29 = class243.method3513(arg1, arg0);
            if (var29 != null) {
                method4160();
                int var32 = method1737(var29);
                int var33 = var32 >> 11 & 0x3F;
                method10(arg1, arg0, var33, var29.field2946);
                field1004 = 0;
                field1098 = method3068(var29);
                if (field1098 == null) {
                    field1098 = "Null";
                }
                if (var29.field2825) {
                    field942 = var29.field2899 + class87.method3100(16777215);
                } else {
                    field942 = class87.method3100(65280) + var29.field2942 + class87.method3100(16777215);
                }
            }
            return;
        }
        if (arg2 == 3) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            field1079 = arg0;
            field1112 = arg1;
            class185 var34 = class185.method251(class182.field2441, field900.field1471);
            var34.field2497.method3432(arg3 >> 14 & 0x7FFF);
            var34.field2497.method3360(Statics.field3556 + arg1);
            var34.field2497.method3294(Statics.field445 + arg0);
            var34.field2497.method3243(class52.field637[82] ? 1 : 0);
            field900.method1921(var34);
        }
        if (arg2 == 45) {
            class73 var35 = field967[arg3];
            if (var35 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var36 = class185.method251(class182.field2397, field900.field1471);
                var36.field2497.method3259(class52.field637[82] ? 1 : 0);
                var36.field2497.method3424(arg3);
                field900.method1921(var36);
            }
        }
        if (arg2 == 30 && field1015 == null) {
            method920(arg1, arg0);
            field1015 = class243.method3513(arg1, arg0);
            method3073(field1015);
        }
        if (arg2 == 46) {
            class73 var37 = field967[arg3];
            if (var37 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var38 = class185.method251(class182.field2459, field900.field1471);
                var38.field2497.method3432(arg3);
                var38.field2497.method3259(class52.field637[82] ? 1 : 0);
                field900.method1921(var38);
            }
        }
        if (arg2 == 26) {
            method239();
        }
        if (arg2 == 18) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            field1079 = arg0;
            field1112 = arg1;
            class185 var39 = class185.method251(class182.field2429, field900.field1471);
            var39.field2497.method3360(arg3);
            var39.field2497.method3424(Statics.field445 + arg0);
            var39.field2497.method3294(Statics.field3556 + arg1);
            var39.field2497.method3243(class52.field637[82] ? 1 : 0);
            field900.method1921(var39);
        }
        if (arg2 == 49) {
            class73 var40 = field967[arg3];
            if (var40 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var41 = class185.method251(class182.field2414, field900.field1471);
                var41.field2497.method3360(arg3);
                var41.field2497.method3274(class52.field637[82] ? 1 : 0);
                field900.method1921(var41);
            }
        }
        if (arg2 == 21) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            field1079 = arg0;
            field1112 = arg1;
            class185 var42 = class185.method251(class182.field2393, field900.field1471);
            var42.field2497.method3424(Statics.field445 + arg0);
            var42.field2497.method3259(class52.field637[82] ? 1 : 0);
            var42.field2497.method3432(arg3);
            var42.field2497.method3432(Statics.field3556 + arg1);
            field900.method1921(var42);
        }
        if (arg2 == 51) {
            class73 var43 = field967[arg3];
            if (var43 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var44 = class185.method251(class182.field2426, field900.field1471);
                var44.field2497.method3294(arg3);
                var44.field2497.method3285(class52.field637[82] ? 1 : 0);
                field900.method1921(var44);
            }
        }
        if (arg2 == 19) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            field1079 = arg0;
            field1112 = arg1;
            class185 var45 = class185.method251(class182.field2420, field900.field1471);
            var45.field2497.method3360(Statics.field445 + arg0);
            var45.field2497.method3274(class52.field637[82] ? 1 : 0);
            var45.field2497.method3360(arg3);
            var45.field2497.method3294(Statics.field3556 + arg1);
            field900.method1921(var45);
        }
        if (arg2 == 16) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            field1079 = arg0;
            field1112 = arg1;
            class185 var46 = class185.method251(class182.field2379, field900.field1471);
            var46.field2497.method3294(arg3);
            var46.field2497.method3424(Statics.field1439);
            var46.field2497.method3432(Statics.field3556 + arg1);
            var46.field2497.method3424(Statics.field541);
            var46.field2497.method3259(class52.field637[82] ? 1 : 0);
            var46.field2497.method3360(Statics.field445 + arg0);
            var46.field2497.method3326(Statics.field821);
            field900.method1921(var46);
        }
        if (arg2 == 33) {
            class185 var47 = class185.method251(class182.field2439, field900.field1471);
            var47.field2497.method3294(arg3);
            var47.field2497.method3360(arg0);
            var47.field2497.method3303(arg1);
            field900.method1921(var47);
            field957 = 0;
            Statics.field478 = class243.method20(arg1);
            field958 = arg0;
        }
        if (arg2 == 15) {
            class73 var48 = field967[arg3];
            if (var48 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var49 = class185.method251(class182.field2444, field900.field1471);
                var49.field2497.method3326(Statics.field786);
                var49.field2497.method3274(class52.field637[82] ? 1 : 0);
                var49.field2497.method3294(arg3);
                var49.field2497.method3424(field1043);
                field900.method1921(var49);
            }
        }
        if (arg2 == 17) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            field1079 = arg0;
            field1112 = arg1;
            class185 var50 = class185.method251(class182.field2421, field900.field1471);
            var50.field2497.method3304(Statics.field786);
            var50.field2497.method3424(field1043);
            var50.field2497.method3243(class52.field637[82] ? 1 : 0);
            var50.field2497.method3424(Statics.field3556 + arg1);
            var50.field2497.method3424(arg3);
            var50.field2497.method3294(Statics.field445 + arg0);
            field900.method1921(var50);
        }
        if (arg2 == 48) {
            class73 var51 = field967[arg3];
            if (var51 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var52 = class185.method251(class182.field2417, field900.field1471);
                var52.field2497.method3285(class52.field637[82] ? 1 : 0);
                var52.field2497.method3432(arg3);
                field900.method1921(var52);
            }
        }
        if (arg2 == 58) {
            class243 var53 = class243.method3513(arg1, arg0);
            if (var53 != null) {
                class185 var54 = class185.method251(class182.field2438, field900.field1471);
                var54.field2497.method3432(field1008);
                var54.field2497.method3360(arg0);
                var54.field2497.method3326(Statics.field786);
                var54.field2497.method3360(field1043);
                var54.field2497.method3360(var53.field2946);
                var54.field2497.method3304(arg1);
                field900.method1921(var54);
            }
        }
        if (arg2 == 20) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            field1079 = arg0;
            field1112 = arg1;
            class185 var55 = class185.method251(class182.field2401, field900.field1471);
            var55.field2497.method3294(arg3);
            var55.field2497.method3243(class52.field637[82] ? 1 : 0);
            var55.field2497.method3424(Statics.field445 + arg0);
            var55.field2497.method3424(Statics.field3556 + arg1);
            field900.method1921(var55);
        }
        if (arg2 == 41) {
            class185 var56 = class185.method251(class182.field2464, field900.field1471);
            var56.field2497.method3424(arg0);
            var56.field2497.method3304(arg1);
            var56.field2497.method3424(arg3);
            field900.method1921(var56);
            field957 = 0;
            Statics.field478 = class243.method20(arg1);
            field958 = arg0;
        }
        if (arg2 == 7) {
            class85 var57 = field1035[arg3];
            if (var57 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var58 = class185.method251(class182.field2383, field900.field1471);
                var58.field2497.method3304(Statics.field821);
                var58.field2497.method3259(class52.field637[82] ? 1 : 0);
                var58.field2497.method3360(arg3);
                var58.field2497.method3294(Statics.field541);
                var58.field2497.method3432(Statics.field1439);
                field900.method1921(var58);
            }
        }
        if (arg2 == 1004) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            class185 var59 = class185.method251(class182.field2410, field900.field1471);
            var59.field2497.method3360(arg3);
            field900.method1921(var59);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field3008.method5657(arg2, arg3, new class239(arg0), new class239(arg1));
        }
        if (arg2 == 44) {
            class73 var60 = field967[arg3];
            if (var60 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var61 = class185.method251(class182.field2451, field900.field1471);
                var61.field2497.method3285(class52.field637[82] ? 1 : 0);
                var61.field2497.method3432(arg3);
                field900.method1921(var61);
            }
        }
        if (arg2 == 34) {
            class185 var62 = class185.method251(class182.field2399, field900.field1471);
            var62.field2497.method3326(arg1);
            var62.field2497.method3432(arg0);
            var62.field2497.method3294(arg3);
            field900.method1921(var62);
            field957 = 0;
            Statics.field478 = class243.method20(arg1);
            field958 = arg0;
        }
        if (arg2 == 12) {
            class85 var63 = field1035[arg3];
            if (var63 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var64 = class185.method251(class182.field2418, field900.field1471);
                var64.field2497.method3294(arg3);
                var64.field2497.method3243(class52.field637[82] ? 1 : 0);
                field900.method1921(var64);
            }
        }
        if (arg2 == 36) {
            class185 var65 = class185.method251(class182.field2411, field900.field1471);
            var65.field2497.method3303(arg1);
            var65.field2497.method3432(arg3);
            var65.field2497.method3294(arg0);
            field900.method1921(var65);
            field957 = 0;
            Statics.field478 = class243.method20(arg1);
            field958 = arg0;
        }
        if (arg2 == 1003) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            class85 var66 = field1035[arg3];
            if (var66 != null) {
                class286 var67 = var66.field1292;
                if (var67.field3734 != null) {
                    var67 = var67.method4853();
                }
                if (var67 != null) {
                    class185 var68 = class185.method251(class182.field2470, field900.field1471);
                    var68.field2497.method3294(var67.field3708);
                    field900.method1921(var68);
                }
            }
        }
        if (arg2 == 47) {
            class73 var69 = field967[arg3];
            if (var69 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var70 = class185.method251(class182.field2442, field900.field1471);
                var70.field2497.method3360(arg3);
                var70.field2497.method3243(class52.field637[82] ? 1 : 0);
                field900.method1921(var70);
            }
        }
        if (arg2 == 29) {
            class185 var71 = class185.method251(class182.field2433, field900.field1471);
            var71.field2497.method3326(arg1);
            field900.method1921(var71);
            class243 var72 = class243.method20(arg1);
            if (var72.field2938 != null && var72.field2938[0][0] == 5) {
                int var73 = var72.field2938[0][1];
                if (class238.field2783[var73] != var72.field2940[0]) {
                    class238.field2783[var73] = var72.field2940[0];
                    method2934(var73);
                }
            }
        }
        if (arg2 == 43) {
            class185 var74 = class185.method251(class182.field2453, field900.field1471);
            var74.field2497.method3294(arg0);
            var74.field2497.method3360(arg3);
            var74.field2497.method3326(arg1);
            field900.method1921(var74);
            field957 = 0;
            Statics.field478 = class243.method20(arg1);
            field958 = arg0;
        }
        if (arg2 == 50) {
            class73 var75 = field967[arg3];
            if (var75 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var76 = class185.method251(class182.field2457, field900.field1471);
                var76.field2497.method3285(class52.field637[82] ? 1 : 0);
                var76.field2497.method3432(arg3);
                field900.method1921(var76);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class243 var77 = class243.method3513(arg1, arg0);
            if (var77 != null) {
                int var78 = var77.field2946;
                class243 var79 = class243.method3513(arg1, arg0);
                if (var79 != null) {
                    if (var79.field2926 != null) {
                        class69 var80 = new class69();
                        var80.field788 = var79;
                        var80.field799 = arg3;
                        var80.field797 = arg5;
                        var80.field790 = var79.field2926;
                        class82.method697(var80);
                    }
                    boolean var81 = true;
                    if (var79.field2922 > 0) {
                        var81 = method3(var79);
                    }
                    if (var81 && class244.method3506(method1737(var79), arg3 - 1)) {
                        if (arg3 == 1) {
                            class185 var82 = class185.method251(class182.field2450, field900.field1471);
                            var82.field2497.method3326(arg1);
                            var82.field2497.method3360(arg0);
                            var82.field2497.method3360(var78);
                            field900.method1921(var82);
                        }
                        if (arg3 == 2) {
                            class185 var83 = class185.method251(class182.field2472, field900.field1471);
                            var83.field2497.method3326(arg1);
                            var83.field2497.method3360(arg0);
                            var83.field2497.method3360(var78);
                            field900.method1921(var83);
                        }
                        if (arg3 == 3) {
                            class185 var84 = class185.method251(class182.field2440, field900.field1471);
                            var84.field2497.method3326(arg1);
                            var84.field2497.method3360(arg0);
                            var84.field2497.method3360(var78);
                            field900.method1921(var84);
                        }
                        if (arg3 == 4) {
                            class185 var85 = class185.method251(class182.field2434, field900.field1471);
                            var85.field2497.method3326(arg1);
                            var85.field2497.method3360(arg0);
                            var85.field2497.method3360(var78);
                            field900.method1921(var85);
                        }
                        if (arg3 == 5) {
                            class185 var86 = class185.method251(class182.field2467, field900.field1471);
                            var86.field2497.method3326(arg1);
                            var86.field2497.method3360(arg0);
                            var86.field2497.method3360(var78);
                            field900.method1921(var86);
                        }
                        if (arg3 == 6) {
                            class185 var87 = class185.method251(class182.field2445, field900.field1471);
                            var87.field2497.method3326(arg1);
                            var87.field2497.method3360(arg0);
                            var87.field2497.method3360(var78);
                            field900.method1921(var87);
                        }
                        if (arg3 == 7) {
                            class185 var88 = class185.method251(class182.field2407, field900.field1471);
                            var88.field2497.method3326(arg1);
                            var88.field2497.method3360(arg0);
                            var88.field2497.method3360(var78);
                            field900.method1921(var88);
                        }
                        if (arg3 == 8) {
                            class185 var89 = class185.method251(class182.field2396, field900.field1471);
                            var89.field2497.method3326(arg1);
                            var89.field2497.method3360(arg0);
                            var89.field2497.method3360(var78);
                            field900.method1921(var89);
                        }
                        if (arg3 == 9) {
                            class185 var90 = class185.method251(class182.field2447, field900.field1471);
                            var90.field2497.method3326(arg1);
                            var90.field2497.method3360(arg0);
                            var90.field2497.method3360(var78);
                            field900.method1921(var90);
                        }
                        if (arg3 == 10) {
                            class185 var91 = class185.method251(class182.field2454, field900.field1471);
                            var91.field2497.method3326(arg1);
                            var91.field2497.method3360(arg0);
                            var91.field2497.method3360(var78);
                            field900.method1921(var91);
                        }
                    }
                }
            }
        }
        if (arg2 == 10) {
            class85 var92 = field1035[arg3];
            if (var92 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var93 = class185.method251(class182.field2413, field900.field1471);
                var93.field2497.method3285(class52.field637[82] ? 1 : 0);
                var93.field2497.method3360(arg3);
                field900.method1921(var93);
            }
        }
        if (arg2 == 2) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            field1079 = arg0;
            field1112 = arg1;
            class185 var94 = class185.method251(class182.field2395, field900.field1471);
            var94.field2497.method3432(Statics.field3556 + arg1);
            var94.field2497.method3432(field1043);
            var94.field2497.method3274(class52.field637[82] ? 1 : 0);
            var94.field2497.method3424(arg3 >> 14 & 0x7FFF);
            var94.field2497.method3468(Statics.field786);
            var94.field2497.method3360(Statics.field445 + arg0);
            field900.method1921(var94);
        }
        if (arg2 == 42) {
            class185 var95 = class185.method251(class182.field2386, field900.field1471);
            var95.field2497.method3424(arg3);
            var95.field2497.method3360(arg0);
            var95.field2497.method3304(arg1);
            field900.method1921(var95);
            field957 = 0;
            Statics.field478 = class243.method20(arg1);
            field958 = arg0;
        }
        if (arg2 == 9) {
            class85 var96 = field1035[arg3];
            if (var96 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var97 = class185.method251(class182.field2398, field900.field1471);
                var97.field2497.method3243(class52.field637[82] ? 1 : 0);
                var97.field2497.method3424(arg3);
                field900.method1921(var97);
            }
        }
        if (arg2 == 4) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            field1079 = arg0;
            field1112 = arg1;
            class185 var98 = class185.method251(class182.field2388, field900.field1471);
            var98.field2497.method3424(Statics.field445 + arg0);
            var98.field2497.method3424(Statics.field3556 + arg1);
            var98.field2497.method3274(class52.field637[82] ? 1 : 0);
            var98.field2497.method3432(arg3 >> 14 & 0x7FFF);
            field900.method1921(var98);
        }
        if (arg2 == 40) {
            class185 var99 = class185.method251(class182.field2462, field900.field1471);
            var99.field2497.method3326(arg1);
            var99.field2497.method3432(arg3);
            var99.field2497.method3432(arg0);
            field900.method1921(var99);
            field957 = 0;
            Statics.field478 = class243.method20(arg1);
            field958 = arg0;
        }
        if (arg2 == 5) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            field1079 = arg0;
            field1112 = arg1;
            class185 var100 = class185.method251(class182.field2455, field900.field1471);
            var100.field2497.method3432(arg3 >> 14 & 0x7FFF);
            var100.field2497.method3274(class52.field637[82] ? 1 : 0);
            var100.field2497.method3424(Statics.field445 + arg0);
            var100.field2497.method3424(Statics.field3556 + arg1);
            field900.method1921(var100);
        }
        if (arg2 == 1001) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            field1079 = arg0;
            field1112 = arg1;
            class185 var101 = class185.method251(class182.field2437, field900.field1471);
            var101.field2497.method3285(class52.field637[82] ? 1 : 0);
            var101.field2497.method3360(Statics.field3556 + arg1);
            var101.field2497.method3432(Statics.field445 + arg0);
            var101.field2497.method3360(arg3 >> 14 & 0x7FFF);
            field900.method1921(var101);
        }
        if (arg2 == 13) {
            class85 var102 = field1035[arg3];
            if (var102 != null) {
                field952 = arg6;
                field931 = arg7;
                field876 = 2;
                field954 = 0;
                field1079 = arg0;
                field1112 = arg1;
                class185 var103 = class185.method251(class182.field2409, field900.field1471);
                var103.field2497.method3274(class52.field637[82] ? 1 : 0);
                var103.field2497.method3432(arg3);
                field900.method1921(var103);
            }
        }
        if (arg2 == 35) {
            class185 var104 = class185.method251(class182.field2430, field900.field1471);
            var104.field2497.method3294(arg3);
            var104.field2497.method3424(arg0);
            var104.field2497.method3303(arg1);
            field900.method1921(var104);
            field957 = 0;
            Statics.field478 = class243.method20(arg1);
            field958 = arg0;
        }
        if (arg2 == 31) {
            class185 var105 = class185.method251(class182.field2436, field900.field1471);
            var105.field2497.method3468(arg1);
            var105.field2497.method3360(Statics.field541);
            var105.field2497.method3424(arg3);
            var105.field2497.method3424(Statics.field1439);
            var105.field2497.method3424(arg0);
            var105.field2497.method3468(Statics.field821);
            field900.method1921(var105);
            field957 = 0;
            Statics.field478 = class243.method20(arg1);
            field958 = arg0;
        }
        if (arg2 == 6) {
            field952 = arg6;
            field931 = arg7;
            field876 = 2;
            field954 = 0;
            field1079 = arg0;
            field1112 = arg1;
            class185 var106 = class185.method251(class182.field2404, field900.field1471);
            var106.field2497.method3432(Statics.field445 + arg0);
            var106.field2497.method3424(Statics.field3556 + arg1);
            var106.field2497.method3243(class52.field637[82] ? 1 : 0);
            var106.field2497.method3432(arg3 >> 14 & 0x7FFF);
            field900.method1921(var106);
        }
        if (field1004 != 0) {
            field1004 = 0;
            method3073(class243.method20(Statics.field821));
        }
        if (field1006) {
            method4160();
        }
        if (Statics.field478 != null && field957 == 0) {
            method3073(Statics.field478);
        }
    }

    @ObfuscatedName("r.ho(IIIII)V")
    public static void method10(int arg0, int arg1, int arg2, int arg3) {
        class243 var4 = class243.method3513(arg0, arg1);
        if (var4 != null && var4.field2917 != null) {
            class69 var5 = new class69();
            var5.field788 = var4;
            var5.field790 = var4.field2917;
            class82.method697(var5);
        }
        field1008 = arg3;
        field1006 = true;
        Statics.field786 = arg0;
        field1043 = arg1;
        Statics.field2961 = arg2;
        method3073(var4);
    }

    @ObfuscatedName("in.hv(B)V")
    public static void method4160() {
        if (!field1006) {
            return;
        }
        class243 var0 = class243.method3513(Statics.field786, field1043);
        if (var0 != null && var0.field2815 != null) {
            class69 var1 = new class69();
            var1.field788 = var0;
            var1.field790 = var0.field2815;
            class82.method697(var1);
        }
        field1006 = false;
        method3073(var0);
    }

    @ObfuscatedName("bf.hu(III)V")
    public static void method920(int arg0, int arg1) {
        class185 var2 = class185.method251(class182.field2403, field900.field1471);
        var2.field2497.method3360(arg1);
        var2.field2497.method3303(arg0);
        field900.method1921(var2);
    }

    @ObfuscatedName("ir.hf(I)V")
    public static final void method4235() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field1075 - 1; var1++) {
                if (field991[var1] < 1000 && field991[var1 + 1] > 1000) {
                    String var2 = field994[var1];
                    field994[var1] = field994[var1 + 1];
                    field994[var1 + 1] = var2;
                    String var3 = field988[var1];
                    field988[var1] = field988[var1 + 1];
                    field988[var1 + 1] = var3;
                    int var4 = field991[var1];
                    field991[var1] = field991[var1 + 1];
                    field991[var1 + 1] = var4;
                    int var5 = field1047[var1];
                    field1047[var1] = field1047[var1 + 1];
                    field1047[var1 + 1] = var5;
                    int var6 = field953[var1];
                    field953[var1] = field953[var1 + 1];
                    field953[var1 + 1] = var6;
                    int var7 = field992[var1];
                    field992[var1] = field992[var1 + 1];
                    field992[var1 + 1] = var7;
                    boolean var8 = field995[var1];
                    field995[var1] = field995[var1 + 1];
                    field995[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("db.hh(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method2423(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var12 = false;
        if (field987 || field1075 >= 500) {
            return;
        }
        field988[field1075] = arg0;
        field994[field1075] = arg1;
        field991[field1075] = arg2;
        field992[field1075] = arg3;
        field1047[field1075] = arg4;
        field953[field1075] = arg5;
        field995[field1075] = var12;
        field1075++;
    }

    @ObfuscatedName("ja.ha(B)V")
    public static void method4371() {
        for (int var0 = 0; var0 < field1075; var0++) {
            int var1 = field991[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field1075 - 1) {
                    for (int var3 = var0; var3 < field1075 - 1; var3++) {
                        field988[var3] = field988[var3 + 1];
                        field994[var3] = field994[var3 + 1];
                        field991[var3] = field991[var3 + 1];
                        field992[var3] = field992[var3 + 1];
                        field1047[var3] = field1047[var3 + 1];
                        field953[var3] = field953[var3 + 1];
                        field995[var3] = field995[var3 + 1];
                    }
                }
                field1075--;
            }
        }
    }

    @ObfuscatedName("g.hx(II)Ljava/lang/String;")
    public static String method161(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field994[arg0].length() > 0) {
            return field988[arg0] + class252.field3180 + field994[arg0];
        } else {
            return field988[arg0];
        }
    }

    @ObfuscatedName("jy.hm(IIIII)V")
    public static final void method4558(int arg0, int arg1, int arg2, int arg3) {
        if (field1004 == 0 && !field1006) {
            method2423(class252.field3220, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class133.field1910; var6++) {
            int var7 = class133.field1909[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field1312.method2730(Statics.field505, var8, var9, var7) >= 0) {
                    class283 var12 = class283.method3065(var11);
                    if (var12.field3630 != null) {
                        var12 = var12.method4723();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field1004 == 1) {
                        method2423(class252.field3170, field1005 + " " + class87.field1306 + " " + class87.method3100(65535) + var12.field3599, 1, var7, var8, var9);
                    } else if (!field1006) {
                        String[] var13 = var12.field3631;
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
                                    method2423(var13[var14], class87.method3100(65535) + var12.field3599, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2423(class252.field3171, class87.method3100(65535) + var12.field3599, 1002, var12.field3637 << 14, var8, var9);
                    } else if ((Statics.field2961 & 0x4) == 4) {
                        method2423(field1098, field942 + " " + class87.field1306 + " " + class87.method3100(65535) + var12.field3599, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class85 var16 = field1035[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field1292.field3710 == 1 && (var16.field1186 & 0x7F) == 64 && (var16.field1151 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field896; var17++) {
                            class85 var18 = field1035[field897[var17]];
                            if (var18 != null && var16 != var18 && var18.field1292.field3710 == 1 && var16.field1186 == var18.field1186 && var16.field1151 == var18.field1151) {
                                method2961(var18.field1292, field897[var17], var8, var9);
                            }
                        }
                        int var19 = class94.field1407;
                        int[] var20 = class94.field1408;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class73 var22 = field967[var20[var21]];
                            if (var22 != null && var16.field1186 == var22.field1186 && var16.field1151 == var22.field1151) {
                                method164(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method2961(var16.field1292, var11, var8, var9);
                }
                if (var10 == 0) {
                    class73 var23 = field967[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field1186 & 0x7F) == 64 && (var23.field1151 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field896; var24++) {
                            class85 var25 = field1035[field897[var24]];
                            if (var25 != null && var25.field1292.field3710 == 1 && var23.field1186 == var25.field1186 && var23.field1151 == var25.field1151) {
                                method2961(var25.field1292, field897[var24], var8, var9);
                            }
                        }
                        int var26 = class94.field1407;
                        int[] var27 = class94.field1408;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class73 var29 = field967[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field1186 == var29.field1186 && var23.field1151 == var29.field1151) {
                                method164(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field1104 == var11) {
                        var4 = var7;
                    } else {
                        method164(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class218 var30 = field962[Statics.field505][var8][var9];
                    if (var30 != null) {
                        for (class93 var31 = (class93) var30.method3799(); var31 != null; var31 = (class93) var30.method3801()) {
                            class284 var32 = class284.method4245(var31.field1398);
                            if (field1004 == 1) {
                                method2423(class252.field3170, field1005 + " " + class87.field1306 + " " + class87.method3100(16748608) + var32.field3650, 16, var31.field1398, var8, var9);
                            } else if (!field1006) {
                                String[] var33 = var32.field3664;
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
                                        method2423(var33[var34], class87.method3100(16748608) + var32.field3650, var35, var31.field1398, var8, var9);
                                    } else if (var34 == 2) {
                                        method2423(class252.field3020, class87.method3100(16748608) + var32.field3650, 20, var31.field1398, var8, var9);
                                    }
                                }
                                method2423(class252.field3171, class87.method3100(16748608) + var32.field3650, 1004, var31.field1398, var8, var9);
                            } else if ((Statics.field2961 & 0x1) == 1) {
                                method2423(field1098, field942 + " " + class87.field1306 + " " + class87.method3100(16748608) + var32.field3650, 17, var31.field1398, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class73 var38 = field967[field1104];
            method164(var38, field1104, var36, var37);
        }
    }

    @ObfuscatedName("en.hy(Ljg;IIIB)V")
    public static final void method2961(class286 arg0, int arg1, int arg2, int arg3) {
        if (field1075 >= 400) {
            return;
        }
        if (arg0.field3734 != null) {
            arg0 = arg0.method4853();
        }
        if (arg0 == null || !arg0.field3719 || arg0.field3739 && field1009 != arg1) {
            return;
        }
        String var4 = arg0.field3720;
        if (arg0.field3726 != 0) {
            var4 = var4 + Statics.method554(arg0.field3726, Statics.field302.field829) + " " + class87.field1305 + class252.field3176 + arg0.field3726 + class87.field1304;
        }
        if (arg0.field3739 && field938) {
            method2423(class252.field3171, class87.method3100(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field1004 == 1) {
            method2423(class252.field3170, field1005 + " " + class87.field1306 + " " + class87.method3100(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field1006) {
            int var5 = arg0.field3739 && field938 ? 2000 : 0;
            String[] var6 = arg0.field3724;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class252.field3172)) {
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
                        method2423(var6[var7], class87.method3100(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class252.field3172)) {
                        short var10 = 0;
                        if (field883 != class90.field1329) {
                            if (field883 == class90.field1333 || field883 == class90.field1331 && arg0.field3726 > Statics.field302.field829) {
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
                            method2423(var6[var9], class87.method3100(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3739 || !field938) {
                method2423(class252.field3171, class87.method3100(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field2961 & 0x2) == 2) {
            method2423(field1098, field942 + " " + class87.field1306 + " " + class87.method3100(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("g.hj(Lbd;IIII)V")
    public static final void method164(class73 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field302 == arg0 || field1075 >= 400) {
            return;
        }
        String var4;
        if (arg0.field830 == 0) {
            var4 = arg0.field828[0] + arg0.field848 + arg0.field828[1] + Statics.method554(arg0.field829, Statics.field302.field829) + " " + class87.field1305 + class252.field3176 + arg0.field829 + class87.field1304 + arg0.field828[2];
        } else {
            var4 = arg0.field828[0] + arg0.field848 + arg0.field828[1] + " " + class87.field1305 + class252.field3235 + arg0.field830 + class87.field1304 + arg0.field828[2];
        }
        if (field1004 == 1) {
            method2423(class252.field3170, field1005 + " " + class87.field1306 + " " + class87.method3100(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field1006) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field975[var5] != null) {
                    short var6 = 0;
                    if (field975[var5].equalsIgnoreCase(class252.field3172)) {
                        if (field882 == class90.field1329) {
                            continue;
                        }
                        if (field882 == class90.field1333 || field882 == class90.field1331 && arg0.field829 > Statics.field302.field829) {
                            var6 = 2000;
                        }
                        if (Statics.field302.field843 != 0 && arg0.field843 != 0) {
                            if (Statics.field302.field843 == arg0.field843) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field976[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field974[var5] + var6;
                    method2423(field975[var5], class87.method3100(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2961 & 0x8) == 8) {
            method2423(field1098, field942 + " " + class87.field1306 + " " + class87.method3100(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field1075; var9++) {
            if (field991[var9] == 23) {
                field994[var9] = class87.method3100(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("z.hn(IIIIIIIIB)V")
    public static final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class243.method129(arg0)) {
            Statics.field2185 = null;
            method66(Statics.field2817[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2185 != null) {
                method66(Statics.field2185, -1412584499, arg1, arg2, arg3, arg4, Statics.field1309, Statics.field759, arg7);
                Statics.field2185 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1054[var8] = true;
            }
        } else {
            field1054[arg7] = true;
        }
    }

    @ObfuscatedName("t.hi([Liw;IIIIIIIII)V")
    public static final void method66(class243[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class328.method5340(arg2, arg3, arg4, arg5);
        class135.method2674();
        label1006: for (int var9 = 0; var9 < arg0.length; var9++) {
            class243 var10 = arg0[var9];
            if (var10 != null && (var10.field2845 == arg1 || arg1 == -1412584499 && field1022 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field930[field1052] = var10.field2839 + arg6;
                    field1058[field1052] = var10.field2870 + arg7;
                    field1059[field1052] = var10.field2841;
                    field1060[field1052] = var10.field2950;
                    var11 = ++field1052 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2957 = var11;
                var10.field2958 = field866;
                if (!var10.field2825 || !Statics.method4090(var10)) {
                    if (var10.field2922 > 0) {
                        method4089(var10);
                    }
                    int var12 = var10.field2839 + arg6;
                    int var13 = var10.field2870 + arg7;
                    int var14 = var10.field2857;
                    if (field1022 == var10) {
                        if (arg1 != -1412584499 && !var10.field2904) {
                            Statics.field2185 = arg0;
                            Statics.field1309 = arg6;
                            Statics.field759 = arg7;
                            continue;
                        }
                        if (field1033 && field1027) {
                            int var15 = class61.field723;
                            int var16 = class61.field715;
                            int var17 = var15 - field1024;
                            int var18 = var16 - field1057;
                            if (var17 < field1028) {
                                var17 = field1028;
                            }
                            if (var10.field2841 + var17 > field1028 + field1023.field2841) {
                                var17 = field1028 + field1023.field2841 - var10.field2841;
                            }
                            if (var18 < field1029) {
                                var18 = field1029;
                            }
                            if (var10.field2950 + var18 > field1029 + field1023.field2950) {
                                var18 = field1029 + field1023.field2950 - var10.field2950;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2904) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2893 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2893 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2841 + var12;
                        int var26 = var10.field2950 + var13;
                        if (var25 < var12) {
                            var23 = var25;
                            var25 = var12;
                        }
                        if (var26 < var13) {
                            var24 = var26;
                            var26 = var13;
                        }
                        var25++;
                        var26++;
                        var19 = var23 > arg2 ? var23 : arg2;
                        var20 = var24 > arg3 ? var24 : arg3;
                        var21 = var25 < arg4 ? var25 : arg4;
                        var22 = var26 < arg5 ? var26 : arg5;
                    } else {
                        int var29 = var10.field2841 + var12;
                        int var30 = var10.field2950 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2825 || var19 < var21 && var20 < var22) {
                        if (var10.field2922 != 0) {
                            if (var10.field2922 == 1336) {
                                if (field1034) {
                                    var13 += 15;
                                    Statics.field648.method5164("Fps:" + field686, var10.field2841 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field862) {
                                        var33 = 16711680;
                                    }
                                    Statics.field648.method5164("Mem:" + var32 + "k", var10.field2841 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2922 == 1337) {
                                field1000 = var12;
                                field920 = var13;
                                int var36 = var10.field2841;
                                int var37 = var10.field2950;
                                field1109++;
                                if (Statics.field302.field1186 >> 7 == field1079 && Statics.field302.field1151 >> 7 == field1112) {
                                    field1079 = 0;
                                }
                                method1750();
                                method65();
                                method211(true);
                                method3596();
                                method211(false);
                                method2905();
                                method913();
                                method3101(var12, var13, var36, var37, true);
                                int var38 = field1107;
                                int var39 = field1108;
                                int var40 = field877;
                                int var41 = field1110;
                                class328.method5340(var38, var39, var38 + var40, var39 + var41);
                                class135.method2674();
                                if (!field1093) {
                                    int var42 = field880;
                                    if (field937 / 256 > var42) {
                                        var42 = field937 / 256;
                                    }
                                    if (field1094[4] && field895[4] + 128 > var42) {
                                        var42 = field895[4] + 128;
                                    }
                                    int var43 = field923 & 0x7FF;
                                    method4075(Statics.field444, Statics.field477, Statics.field2219, var42, var43, var42 * 3 + 600);
                                }
                                int var44;
                                if (field1093) {
                                    int var45;
                                    if (Statics.field663.field1224) {
                                        var45 = Statics.field505;
                                    } else {
                                        int var46 = method466(Statics.field1606, Statics.field446, Statics.field505);
                                        if (var46 - Statics.field617 >= 800 || (class63.field736[Statics.field505][Statics.field1606 >> 7][Statics.field446 >> 7] & 0x4) == 0) {
                                            var45 = 3;
                                        } else {
                                            var45 = Statics.field505;
                                        }
                                    }
                                    var44 = var45;
                                } else {
                                    var44 = method1593();
                                }
                                int var47 = Statics.field1606;
                                int var48 = Statics.field617;
                                int var49 = Statics.field446;
                                int var50 = Statics.field658;
                                int var51 = Statics.field3373;
                                for (int var52 = 0; var52 < 5; var52++) {
                                    if (field1094[var52]) {
                                        int var53 = (int) (Math.random() * (double) (field996[var52] * 2 + 1) - (double) field996[var52] + Math.sin((double) field904[var52] / 100.0D * (double) field1092[var52]) * (double) field895[var52]);
                                        if (var52 == 0) {
                                            Statics.field1606 += var53;
                                        }
                                        if (var52 == 1) {
                                            Statics.field617 += var53;
                                        }
                                        if (var52 == 2) {
                                            Statics.field446 += var53;
                                        }
                                        if (var52 == 3) {
                                            Statics.field3373 = Statics.field3373 + var53 & 0x7FF;
                                        }
                                        if (var52 == 4) {
                                            Statics.field658 += var53;
                                            if (Statics.field658 < 128) {
                                                Statics.field658 = 128;
                                            }
                                            if (Statics.field658 > 383) {
                                                Statics.field658 = 383;
                                            }
                                        }
                                    }
                                }
                                int var54 = class61.field723;
                                int var55 = class61.field715;
                                if (class61.field729 != 0) {
                                    var54 = class61.field722;
                                    var55 = class61.field728;
                                }
                                if (var54 >= var38 && var54 < var38 + var40 && var55 >= var39 && var55 < var39 + var41) {
                                    class133.method979(var54 - var38, var55 - var39);
                                } else {
                                    class133.field1907 = false;
                                    class133.field1910 = 0;
                                }
                                method3188();
                                class328.method5381(var38, var39, var40, var41, 0);
                                method3188();
                                int var56 = class135.field1921;
                                class135.field1921 = field1111;
                                Statics.field1312.method2741(Statics.field1606, Statics.field617, Statics.field446, Statics.field658, Statics.field3373, var44);
                                while (true) {
                                    class10 var57 = (class10) class8.field238.method3753();
                                    if (var57 == null) {
                                        class135.field1921 = var56;
                                        method3188();
                                        Statics.field1312.method2714();
                                        field864 = 0;
                                        boolean var58 = false;
                                        int var59 = -1;
                                        int var60 = -1;
                                        int var61 = class94.field1407;
                                        int[] var62 = class94.field1408;
                                        for (int var63 = 0; var63 < field896 + var61; var63++) {
                                            class76 var64;
                                            if (var63 < var61) {
                                                var64 = field967[var62[var63]];
                                                if (field1104 == var62[var63]) {
                                                    var58 = true;
                                                    var59 = var63;
                                                    continue;
                                                }
                                                if (Statics.field302 == var64) {
                                                    var60 = var63;
                                                    continue;
                                                }
                                            } else {
                                                var64 = field1035[field897[var63 - var61]];
                                            }
                                            method988(var64, var63, var38, var39, var40, var41);
                                        }
                                        if (field970 && var60 != -1) {
                                            method988(Statics.field302, var60, var38, var39, var40, var41);
                                        }
                                        if (var58) {
                                            method988(field967[field1104], var59, var38, var39, var40, var41);
                                        }
                                        for (int var65 = 0; var65 < field864; var65++) {
                                            int var66 = field940[var65];
                                            int var67 = field941[var65];
                                            int var68 = field943[var65];
                                            int var69 = field1086[var65];
                                            boolean var70 = true;
                                            while (var70) {
                                                var70 = false;
                                                for (int var71 = 0; var71 < var65; var71++) {
                                                    if (var67 + 2 > field941[var71] - field1086[var71] && var67 - var69 < field941[var71] + 2 && var66 - var68 < field943[var71] + field940[var71] && var66 + var68 > field940[var71] - field943[var71] && field941[var71] - field1086[var71] < var67) {
                                                        var67 = field941[var71] - field1086[var71];
                                                        var70 = true;
                                                    }
                                                }
                                            }
                                            field950 = field940[var65];
                                            field951 = field941[var65] = var67;
                                            String var72 = field947[var65];
                                            if (field1013 == 0) {
                                                int var73 = 16776960;
                                                if (field944[var65] < 6) {
                                                    var73 = field1064[field944[var65]];
                                                }
                                                if (field944[var65] == 6) {
                                                    var73 = field1109 % 20 < 10 ? 16711680 : 16776960;
                                                }
                                                if (field944[var65] == 7) {
                                                    var73 = field1109 % 20 < 10 ? 255 : 65535;
                                                }
                                                if (field944[var65] == 8) {
                                                    var73 = field1109 % 20 < 10 ? 45056 : 8454016;
                                                }
                                                if (field944[var65] == 9) {
                                                    int var74 = 150 - field972[var65];
                                                    if (var74 < 50) {
                                                        var73 = var74 * 1280 + 16711680;
                                                    } else if (var74 < 100) {
                                                        var73 = 16776960 - (var74 - 50) * 327680;
                                                    } else if (var74 < 150) {
                                                        var73 = (var74 - 100) * 5 + 65280;
                                                    }
                                                }
                                                if (field944[var65] == 10) {
                                                    int var75 = 150 - field972[var65];
                                                    if (var75 < 50) {
                                                        var73 = var75 * 5 + 16711680;
                                                    } else if (var75 < 100) {
                                                        var73 = 16711935 - (var75 - 50) * 327680;
                                                    } else if (var75 < 150) {
                                                        var73 = (var75 - 100) * 327680 + 255 - (var75 - 100) * 5;
                                                    }
                                                }
                                                if (field944[var65] == 11) {
                                                    int var76 = 150 - field972[var65];
                                                    if (var76 < 50) {
                                                        var73 = 16777215 - var76 * 327685;
                                                    } else if (var76 < 100) {
                                                        var73 = (var76 - 50) * 327685 + 65280;
                                                    } else if (var76 < 150) {
                                                        var73 = 16777215 - (var76 - 100) * 327680;
                                                    }
                                                }
                                                if (field916[var65] == 0) {
                                                    Statics.field2079.method5222(var72, field950 + var38, field951 + var39, var73, 0);
                                                }
                                                if (field916[var65] == 1) {
                                                    Statics.field2079.method5225(var72, field950 + var38, field951 + var39, var73, 0, field1109);
                                                }
                                                if (field916[var65] == 2) {
                                                    Statics.field2079.method5168(var72, field950 + var38, field951 + var39, var73, 0, field1109);
                                                }
                                                if (field916[var65] == 3) {
                                                    Statics.field2079.method5169(var72, field950 + var38, field951 + var39, var73, 0, field1109, 150 - field972[var65]);
                                                }
                                                if (field916[var65] == 4) {
                                                    int var77 = (150 - field972[var65]) * (Statics.field2079.method5224(var72) + 100) / 150;
                                                    class328.method5341(field950 + var38 - 50, var39, field950 + var38 + 50, var39 + var41);
                                                    Statics.field2079.method5232(var72, field950 + var38 + 50 - var77, field951 + var39, var73, 0);
                                                    class328.method5340(var38, var39, var38 + var40, var39 + var41);
                                                }
                                                if (field916[var65] == 5) {
                                                    int var78 = 150 - field972[var65];
                                                    int var79 = 0;
                                                    if (var78 < 25) {
                                                        var79 = var78 - 25;
                                                    } else if (var78 > 125) {
                                                        var79 = var78 - 125;
                                                    }
                                                    class328.method5341(var38, field951 + var39 - Statics.field2079.field3885 - 1, var38 + var40, field951 + var39 + 5);
                                                    Statics.field2079.method5222(var72, field950 + var38, field951 + var39 + var79, var73, 0);
                                                    class328.method5340(var38, var39, var38 + var40, var39 + var41);
                                                }
                                            } else {
                                                Statics.field2079.method5222(var72, field950 + var38, field951 + var39, 16776960, 0);
                                            }
                                        }
                                        if (field901 == 2) {
                                            method2988((field1095 - Statics.field445 << 7) + field936, (field878 - Statics.field3556 << 7) + field881, field885 * 2);
                                            if (field950 > -1 && field866 % 20 < 10) {
                                                Statics.field1954[0].method5459(field950 + var38 - 12, field951 + var39 - 28);
                                            }
                                        }
                                        ((class124) Statics.field1941).method2398(field915);
                                        method2887(var38, var39, var40, var41);
                                        Statics.field1606 = var47;
                                        Statics.field617 = var48;
                                        Statics.field446 = var49;
                                        Statics.field658 = var50;
                                        Statics.field3373 = var51;
                                        if (field1069) {
                                            byte var80 = 0;
                                            int var81 = class265.field3410 + class265.field3407 + var80;
                                            if (var81 == 0) {
                                                field1069 = false;
                                            }
                                        }
                                        if (field1069) {
                                            class328.method5381(var38, var39, var40, var41, 0);
                                            method680(class252.field3030, false);
                                        }
                                        field1054[var10.field2957] = true;
                                        class328.method5340(arg2, arg3, arg4, arg5);
                                        continue label1006;
                                    }
                                    var57.method41();
                                }
                            }
                            if (var10.field2922 == 1338) {
                                method963(var10, var12, var13, var11);
                                class328.method5340(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2922 == 1339) {
                                class237 var83 = var10.method4177(false);
                                if (var83 != null) {
                                    if (field1081 < 3) {
                                        Statics.field1958.method5473(var12, var13, var83.field2778, var83.field2776, 25, 25, field923, 256, var83.field2779, var83.field2780);
                                    } else {
                                        class328.method5363(var12, var13, 0, var83.field2779, var83.field2780);
                                    }
                                }
                                class328.method5340(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2922 == 1400) {
                                Statics.field3008.method5632(var12, var13, var10.field2841, var10.field2950, field866);
                            }
                            if (var10.field2922 == 1401) {
                                Statics.field3008.method5623(var12, var13, var10.field2841, var10.field2950);
                            }
                        }
                        if (var10.field2893 == 0) {
                            if (!var10.field2825 && Statics.method4090(var10) && Statics.field580 != var10) {
                                continue;
                            }
                            if (!var10.field2825) {
                                if (var10.field2905 > var10.field2850 - var10.field2950) {
                                    var10.field2905 = var10.field2850 - var10.field2950;
                                }
                                if (var10.field2905 < 0) {
                                    var10.field2905 = 0;
                                }
                            }
                            method66(arg0, var10.field2856, var19, var20, var21, var22, var12 - var10.field2847, var13 - var10.field2905, var11);
                            if (var10.field2822 != null) {
                                method66(var10.field2822, var10.field2856, var19, var20, var21, var22, var12 - var10.field2847, var13 - var10.field2905, var11);
                            }
                            class68 var84 = (class68) field1012.method3736((long) var10.field2856);
                            if (var84 != null) {
                                method1(var84.field784, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class328.method5340(arg2, arg3, arg4, arg5);
                            class135.method2674();
                        }
                        if (field1063 || field1056[var11] || field1061 > 1) {
                            if (var10.field2893 == 0 && !var10.field2825 && var10.field2850 > var10.field2950) {
                                int var85 = var10.field2841 + var12;
                                int var86 = var10.field2905;
                                int var87 = var10.field2950;
                                int var88 = var10.field2850;
                                Statics.field2769[0].method5434(var85, var13);
                                Statics.field2769[1].method5434(var85, var13 + var87 - 16);
                                class328.method5381(var85, var13 + 16, 16, var87 - 32, field990);
                                int var89 = (var87 - 32) * var87 / var88;
                                if (var89 < 8) {
                                    var89 = 8;
                                }
                                int var90 = (var87 - 32 - var89) * var86 / (var88 - var87);
                                class328.method5381(var85, var13 + 16 + var90, 16, var89, field917);
                                class328.method5359(var85, var13 + 16 + var90, var89, field956);
                                class328.method5359(var85 + 1, var13 + 16 + var90, var89, field956);
                                class328.method5357(var85, var13 + 16 + var90, 16, field956);
                                class328.method5357(var85, var13 + 17 + var90, 16, field956);
                                class328.method5359(var85 + 15, var13 + 16 + var90, var89, field918);
                                class328.method5359(var85 + 14, var13 + 17 + var90, var89 - 1, field918);
                                class328.method5357(var85, var13 + 15 + var90 + var89, 16, field918);
                                class328.method5357(var85 + 1, var13 + 14 + var90 + var89, 15, field918);
                            }
                            if (var10.field2893 != 1) {
                                if (var10.field2893 == 2) {
                                    int var91 = 0;
                                    for (int var92 = 0; var92 < var10.field2838; var92++) {
                                        for (int var93 = 0; var93 < var10.field2837; var93++) {
                                            int var94 = (var10.field2939 + 32) * var93 + var12;
                                            int var95 = (var10.field2920 + 32) * var92 + var13;
                                            if (var91 < 20) {
                                                var94 += var10.field2894[var91];
                                                var95 += var10.field2895[var91];
                                            }
                                            if (var10.field2944[var91] > 0) {
                                                boolean var96 = false;
                                                boolean var97 = false;
                                                int var98 = var10.field2944[var91] - 1;
                                                if (var94 + 32 > arg2 && var94 < arg4 && var95 + 32 > arg3 && var95 < arg5 || Statics.field2148 == var10 && field959 == var91) {
                                                    class332 var99;
                                                    if (field1004 == 1 && Statics.field541 == var91 && Statics.field821 == var10.field2856) {
                                                        var99 = Statics.method3146(var98, var10.field2954[var91], 2, 0, 2, false);
                                                    } else {
                                                        var99 = Statics.method3146(var98, var10.field2954[var91], 1, 3153952, 2, false);
                                                    }
                                                    if (var99 == null) {
                                                        method3073(var10);
                                                    } else if (Statics.field2148 == var10 && field959 == var91) {
                                                        int var100 = class61.field723 - field1049;
                                                        int var101 = class61.field715 - field961;
                                                        if (var100 < 5 && var100 > -5) {
                                                            var100 = 0;
                                                        }
                                                        if (var101 < 5 && var101 > -5) {
                                                            var101 = 0;
                                                        }
                                                        if (field964 < 5) {
                                                            var100 = 0;
                                                            var101 = 0;
                                                        }
                                                        var99.method5462(var94 + var100, var95 + var101, 128);
                                                        if (arg1 != -1) {
                                                            class243 var102 = arg0[arg1 & 0xFFFF];
                                                            if (var95 + var101 < class328.field3952 && var102.field2905 > 0) {
                                                                int var103 = field915 * (class328.field3952 - var95 - var101) / 3;
                                                                if (var103 > field915 * 10) {
                                                                    var103 = field915 * 10;
                                                                }
                                                                if (var103 > var102.field2905) {
                                                                    var103 = var102.field2905;
                                                                }
                                                                var102.field2905 -= var103;
                                                                field961 += var103;
                                                                method3073(var102);
                                                            }
                                                            if (var95 + var101 + 32 > class328.field3956 && var102.field2905 < var102.field2850 - var102.field2950) {
                                                                int var104 = field915 * (var95 + var101 + 32 - class328.field3956) / 3;
                                                                if (var104 > field915 * 10) {
                                                                    var104 = field915 * 10;
                                                                }
                                                                if (var104 > var102.field2850 - var102.field2950 - var102.field2905) {
                                                                    var104 = var102.field2850 - var102.field2950 - var102.field2905;
                                                                }
                                                                var102.field2905 += var104;
                                                                field961 -= var104;
                                                                method3073(var102);
                                                            }
                                                        }
                                                    } else if (Statics.field478 == var10 && field958 == var91) {
                                                        var99.method5462(var94, var95, 128);
                                                    } else {
                                                        var99.method5459(var94, var95);
                                                    }
                                                }
                                            } else if (var10.field2903 != null && var91 < 20) {
                                                class332 var105 = var10.method4209(var91);
                                                if (var105 != null) {
                                                    var105.method5459(var94, var95);
                                                } else if (class243.field2824) {
                                                    method3073(var10);
                                                }
                                            }
                                            var91++;
                                        }
                                    }
                                } else if (var10.field2893 == 3) {
                                    int var106;
                                    if (method505(var10)) {
                                        var106 = var10.field2852;
                                        if (Statics.field580 == var10 && var10.field2854 != 0) {
                                            var106 = var10.field2854;
                                        }
                                    } else {
                                        var106 = var10.field2929;
                                        if (Statics.field580 == var10 && var10.field2853 != 0) {
                                            var106 = var10.field2853;
                                        }
                                    }
                                    if (var10.field2928) {
                                        switch(var10.field2869.field3968) {
                                            case 1:
                                                class328.method5349(var12, var13, var10.field2841, var10.field2950, var10.field2929, var10.field2852, 256 - (var10.field2857 & 0xFF), 256 - (var10.field2858 & 0xFF));
                                                break;
                                            case 2:
                                                class328.method5337(var12, var13, var10.field2841, var10.field2950, var10.field2929, var10.field2852, 256 - (var10.field2857 & 0xFF), 256 - (var10.field2858 & 0xFF));
                                                break;
                                            case 3:
                                                class328.method5352(var12, var13, var10.field2841, var10.field2950, var10.field2929, var10.field2852, 256 - (var10.field2857 & 0xFF), 256 - (var10.field2858 & 0xFF));
                                                break;
                                            case 4:
                                                class328.method5399(var12, var13, var10.field2841, var10.field2950, var10.field2929, var10.field2852, 256 - (var10.field2857 & 0xFF), 256 - (var10.field2858 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class328.method5381(var12, var13, var10.field2841, var10.field2950, var106);
                                                } else {
                                                    class328.method5347(var12, var13, var10.field2841, var10.field2950, var106, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class328.method5394(var12, var13, var10.field2841, var10.field2950, var106);
                                    } else {
                                        class328.method5398(var12, var13, var10.field2841, var10.field2950, var106, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2893 == 4) {
                                    class312 var107 = var10.method4176();
                                    if (var107 != null) {
                                        String var108 = var10.field2833;
                                        int var109;
                                        if (method505(var10)) {
                                            var109 = var10.field2852;
                                            if (Statics.field580 == var10 && var10.field2854 != 0) {
                                                var109 = var10.field2854;
                                            }
                                            if (var10.field2890.length() > 0) {
                                                var108 = var10.field2890;
                                            }
                                        } else {
                                            var109 = var10.field2929;
                                            if (Statics.field580 == var10 && var10.field2853 != 0) {
                                                var109 = var10.field2853;
                                            }
                                        }
                                        if (var10.field2825 && var10.field2946 != -1) {
                                            class284 var110 = class284.method4245(var10.field2946);
                                            var108 = var110.field3650;
                                            if (var108 == null) {
                                                var108 = class252.field3160;
                                            }
                                            if ((var110.field3661 == 1 || var10.field2896 != 1) && var10.field2896 != -1) {
                                                var108 = class87.method3100(16748608) + var108 + class87.field1308 + " " + 'x' + method630(var10.field2896);
                                            }
                                        }
                                        if (field1015 == var10) {
                                            var108 = class252.field3178;
                                            var109 = var10.field2929;
                                        }
                                        if (!var10.field2825) {
                                            var108 = method919(var108, var10);
                                        }
                                        var107.method5174(var108, var12, var13, var10.field2841, var10.field2950, var109, var10.field2891 ? 0 : -1, var10.field2889, var10.field2892, var10.field2851);
                                    } else if (class243.field2824) {
                                        method3073(var10);
                                    }
                                } else if (var10.field2893 == 5) {
                                    if (var10.field2825) {
                                        class332 var112;
                                        if (var10.field2946 == -1) {
                                            var112 = var10.method4175(false);
                                        } else {
                                            var112 = Statics.method3146(var10.field2946, var10.field2896, var10.field2865, var10.field2916, var10.field2959, false);
                                        }
                                        if (var112 != null) {
                                            int var113 = var112.field3979;
                                            int var114 = var112.field3985;
                                            if (var10.field2864) {
                                                class328.method5341(var12, var13, var10.field2841 + var12, var10.field2950 + var13);
                                                int var115 = (var10.field2841 + (var113 - 1)) / var113;
                                                int var116 = (var10.field2950 + (var114 - 1)) / var114;
                                                for (int var117 = 0; var117 < var115; var117++) {
                                                    for (int var118 = 0; var118 < var116; var118++) {
                                                        if (var10.field2814 != 0) {
                                                            var112.method5475(var113 / 2 + var113 * var117 + var12, var114 / 2 + var114 * var118 + var13, var10.field2814, 4096);
                                                        } else if (var14 == 0) {
                                                            var112.method5459(var113 * var117 + var12, var114 * var118 + var13);
                                                        } else {
                                                            var112.method5462(var113 * var117 + var12, var114 * var118 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class328.method5340(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var119 = var10.field2841 * 4096 / var113;
                                                if (var10.field2814 != 0) {
                                                    var112.method5475(var10.field2841 / 2 + var12, var10.field2950 / 2 + var13, var10.field2814, var119);
                                                } else if (var14 != 0) {
                                                    var112.method5464(var12, var13, var10.field2841, var10.field2950, 256 - (var14 & 0xFF));
                                                } else if (var10.field2841 == var113 && var10.field2950 == var114) {
                                                    var112.method5459(var12, var13);
                                                } else {
                                                    var112.method5524(var12, var13, var10.field2841, var10.field2950);
                                                }
                                            }
                                        } else if (class243.field2824) {
                                            method3073(var10);
                                        }
                                    } else {
                                        class332 var111 = var10.method4175(method505(var10));
                                        if (var111 != null) {
                                            var111.method5459(var12, var13);
                                        } else if (class243.field2824) {
                                            method3073(var10);
                                        }
                                    }
                                } else if (var10.field2893 == 6) {
                                    boolean var120 = method505(var10);
                                    int var121;
                                    if (var120) {
                                        var121 = var10.field2874;
                                    } else {
                                        var121 = var10.field2821;
                                    }
                                    class132 var122 = null;
                                    int var123 = 0;
                                    if (var10.field2946 != -1) {
                                        class284 var124 = class284.method4245(var10.field2946);
                                        if (var124 != null) {
                                            class284 var125 = var124.method4757(var10.field2896);
                                            var122 = var125.method4756(1);
                                            if (var122 == null) {
                                                method3073(var10);
                                            } else {
                                                var122.method2592();
                                                var123 = var122.field2027 / 2;
                                            }
                                        }
                                    } else if (var10.field2866 == 5) {
                                        if (var10.field2910 == 0) {
                                            var122 = field1010.method4131((class288) null, -1, (class288) null, -1);
                                        } else {
                                            var122 = Statics.field302.method1067();
                                        }
                                    } else if (var121 == -1) {
                                        var122 = var10.method4172((class288) null, -1, var120, Statics.field302.field824);
                                        if (var122 == null && class243.field2824) {
                                            method3073(var10);
                                        }
                                    } else {
                                        class288 var126 = class288.method4510(var121);
                                        var122 = var10.method4172(var126, var10.field2948, var120, Statics.field302.field824);
                                        if (var122 == null && class243.field2824) {
                                            method3073(var10);
                                        }
                                    }
                                    class135.method2693(var10.field2841 / 2 + var12, var10.field2950 / 2 + var13);
                                    int var127 = var10.field2898 * class135.field1940[var10.field2877] >> 16;
                                    int var128 = var10.field2898 * class135.field1945[var10.field2877] >> 16;
                                    if (var122 != null) {
                                        if (var10.field2825) {
                                            var122.method2592();
                                            if (var10.field2883) {
                                                var122.method2542(0, var10.field2878, var10.field2879, var10.field2877, var10.field2875, var10.field2876 + var123 + var127, var10.field2876 + var128, var10.field2898);
                                            } else {
                                                var122.method2541(0, var10.field2878, var10.field2879, var10.field2877, var10.field2875, var10.field2876 + var123 + var127, var10.field2876 + var128);
                                            }
                                        } else {
                                            var122.method2541(0, var10.field2878, 0, var10.field2877, 0, var127, var128);
                                        }
                                    }
                                    class135.method2628();
                                } else {
                                    if (var10.field2893 == 7) {
                                        class312 var129 = var10.method4176();
                                        if (var129 == null) {
                                            if (class243.field2824) {
                                                method3073(var10);
                                            }
                                            continue;
                                        }
                                        int var130 = 0;
                                        for (int var131 = 0; var131 < var10.field2838; var131++) {
                                            for (int var132 = 0; var132 < var10.field2837; var132++) {
                                                if (var10.field2944[var130] > 0) {
                                                    class284 var133 = class284.method4245(var10.field2944[var130] - 1);
                                                    String var134;
                                                    if (var133.field3661 != 1 && var10.field2954[var130] == 1) {
                                                        var134 = class87.method3100(16748608) + var133.field3650 + class87.field1308;
                                                    } else {
                                                        var134 = class87.method3100(16748608) + var133.field3650 + class87.field1308 + " " + 'x' + method630(var10.field2954[var130]);
                                                    }
                                                    int var135 = (var10.field2939 + 115) * var132 + var12;
                                                    int var136 = (var10.field2920 + 12) * var131 + var13;
                                                    if (var10.field2889 == 0) {
                                                        var129.method5232(var134, var135, var136, var10.field2929, var10.field2891 ? 0 : -1);
                                                    } else if (var10.field2889 == 1) {
                                                        var129.method5222(var134, var10.field2841 / 2 + var135, var136, var10.field2929, var10.field2891 ? 0 : -1);
                                                    } else {
                                                        var129.method5164(var134, var10.field2841 + var135 - 1, var136, var10.field2929, var10.field2891 ? 0 : -1);
                                                    }
                                                }
                                                var130++;
                                            }
                                        }
                                    }
                                    if (var10.field2893 == 8 && Statics.field498 == var10 && field1003 == field1002) {
                                        int var137 = 0;
                                        int var138 = 0;
                                        class312 var139 = Statics.field648;
                                        String var140 = var10.field2833;
                                        String var141 = method919(var140, var10);
                                        while (var141.length() > 0) {
                                            int var142 = var141.indexOf(class87.field1307);
                                            String var143;
                                            if (var142 == -1) {
                                                var143 = var141;
                                                var141 = "";
                                            } else {
                                                var143 = var141.substring(0, var142);
                                                var141 = var141.substring(var142 + 4);
                                            }
                                            int var144 = var139.method5224(var143);
                                            if (var144 > var137) {
                                                var137 = var144;
                                            }
                                            var138 += var139.field3885 + 1;
                                        }
                                        var137 += 6;
                                        var138 += 7;
                                        int var145 = var10.field2841 + var12 - 5 - var137;
                                        int var146 = var10.field2950 + var13 + 5;
                                        if (var145 < var12 + 5) {
                                            var145 = var12 + 5;
                                        }
                                        if (var137 + var145 > arg4) {
                                            var145 = arg4 - var137;
                                        }
                                        if (var138 + var146 > arg5) {
                                            var146 = arg5 - var138;
                                        }
                                        class328.method5381(var145, var146, var137, var138, 16777120);
                                        class328.method5394(var145, var146, var137, var138, 0);
                                        String var147 = var10.field2833;
                                        int var148 = var139.field3885 + var146 + 2;
                                        String var149 = method919(var147, var10);
                                        while (var149.length() > 0) {
                                            int var150 = var149.indexOf(class87.field1307);
                                            String var151;
                                            if (var150 == -1) {
                                                var151 = var149;
                                                var149 = "";
                                            } else {
                                                var151 = var149.substring(0, var150);
                                                var149 = var149.substring(var150 + 4);
                                            }
                                            var139.method5232(var151, var145 + 3, var148, 0, -1);
                                            var148 += var139.field3885 + 1;
                                        }
                                    }
                                    if (var10.field2893 == 9) {
                                        int var152;
                                        int var153;
                                        int var154;
                                        int var155;
                                        if (var10.field2947) {
                                            var152 = var12;
                                            var153 = var10.field2950 + var13;
                                            var154 = var10.field2841 + var12;
                                            var155 = var13;
                                        } else {
                                            var152 = var12;
                                            var153 = var13;
                                            var154 = var10.field2841 + var12;
                                            var155 = var10.field2950 + var13;
                                        }
                                        if (var10.field2855 == 1) {
                                            class328.method5356(var152, var153, var154, var155, var10.field2929);
                                        } else {
                                            int var158 = var10.field2929;
                                            int var159 = var10.field2855;
                                            int var160 = var154 - var152;
                                            int var161 = var155 - var153;
                                            int var162 = var160 >= 0 ? var160 : -var160;
                                            int var163 = var161 >= 0 ? var161 : -var161;
                                            int var164 = var162;
                                            if (var162 < var163) {
                                                var164 = var163;
                                            }
                                            if (var164 != 0) {
                                                int var165 = (var160 << 16) / var164;
                                                int var166 = (var161 << 16) / var164;
                                                if (var166 <= var165) {
                                                    var165 = -var165;
                                                } else {
                                                    var166 = -var166;
                                                }
                                                int var167 = var159 * var166 >> 17;
                                                int var168 = var159 * var166 + 1 >> 17;
                                                int var169 = var159 * var165 >> 17;
                                                int var170 = var159 * var165 + 1 >> 17;
                                                int var171 = var152 - class328.field3957;
                                                int var172 = var153 - class328.field3952;
                                                int var173 = var167 + var171;
                                                int var174 = var171 - var168;
                                                int var175 = var160 + var171 - var168;
                                                int var176 = var160 + var171 + var167;
                                                int var177 = var169 + var172;
                                                int var178 = var172 - var170;
                                                int var179 = var161 + var172 - var170;
                                                int var180 = var161 + var172 + var169;
                                                class135.method2638(var173, var174, var175);
                                                class135.method2637(var177, var178, var179, var173, var174, var175, var158);
                                                class135.method2638(var173, var175, var176);
                                                class135.method2637(var177, var179, var180, var173, var175, var176, var158);
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

    @ObfuscatedName("bf.hc(Ljava/lang/String;Liw;I)Ljava/lang/String;")
    public static String method919(String arg0, class243 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method975(arg1, var2 - 1);
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

    @ObfuscatedName("ay.hl(IB)Ljava/lang/String;")
    public static final String method630(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class87.field1302 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class87.method3100(65408) + var1.substring(0, var1.length() - 8) + class252.field3163 + " " + class87.field1305 + var1 + class87.field1304 + class87.field1308;
        } else if (var1.length() > 6) {
            return " " + class87.method3100(16777215) + var1.substring(0, var1.length() - 4) + class252.field3035 + " " + class87.field1305 + var1 + class87.field1304 + class87.field1308;
        } else {
            return " " + class87.method3100(16776960) + var1 + class87.field1308;
        }
    }

    @ObfuscatedName("client.hk(ZI)V")
    public final void method1108(boolean arg0) {
        int var2 = field1011;
        int var3 = Statics.field695;
        int var4 = Statics.field2582;
        if (class243.method129(var2)) {
            method1025(Statics.field2817[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.hz(Liw;I)V")
    public void method1109(class243 arg0) {
        class243 var2 = arg0.field2845 == -1 ? null : class243.method20(arg0.field2845);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field695;
            var4 = Statics.field2582;
        } else {
            var3 = var2.field2841;
            var4 = var2.field2950;
        }
        method3187(arg0, var3, var4, false);
        method1005(arg0, var3, var4);
    }

    @ObfuscatedName("gh.ht([Liw;Liw;ZI)V")
    public static void method3162(class243[] arg0, class243 arg1, boolean arg2) {
        int var3 = arg1.field2826 == 0 ? arg1.field2841 : arg1.field2826;
        int var4 = arg1.field2850 == 0 ? arg1.field2950 : arg1.field2850;
        method1025(arg0, arg1.field2856, var3, var4, arg2);
        if (arg1.field2822 != null) {
            method1025(arg1.field2822, arg1.field2856, var3, var4, arg2);
        }
        class68 var5 = (class68) field1012.method3736((long) arg1.field2856);
        if (var5 != null) {
            int var6 = var5.field784;
            if (class243.method129(var6)) {
                method1025(Statics.field2817[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2922 == 1337) {
        }
    }

    @ObfuscatedName("bv.iu([Liw;IIIZB)V")
    public static void method1025(class243[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class243 var6 = arg0[var5];
            if (var6 != null && var6.field2845 == arg1) {
                method3187(var6, arg2, arg3, arg4);
                method1005(var6, arg2, arg3);
                if (var6.field2847 > var6.field2826 - var6.field2841) {
                    var6.field2847 = var6.field2826 - var6.field2841;
                }
                if (var6.field2847 < 0) {
                    var6.field2847 = 0;
                }
                if (var6.field2905 > var6.field2850 - var6.field2950) {
                    var6.field2905 = var6.field2850 - var6.field2950;
                }
                if (var6.field2905 < 0) {
                    var6.field2905 = 0;
                }
                if (var6.field2893 == 0) {
                    method3162(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("go.ip(Liw;IIZI)V")
    public static void method3187(class243 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2841;
        int var5 = arg0.field2950;
        if (arg0.field2902 == 0) {
            arg0.field2841 = arg0.field2837;
        } else if (arg0.field2902 == 1) {
            arg0.field2841 = arg1 - arg0.field2837;
        } else if (arg0.field2902 == 2) {
            arg0.field2841 = arg0.field2837 * arg1 >> 14;
        }
        if (arg0.field2887 == 0) {
            arg0.field2950 = arg0.field2838;
        } else if (arg0.field2887 == 1) {
            arg0.field2950 = arg2 - arg0.field2838;
        } else if (arg0.field2887 == 2) {
            arg0.field2950 = arg0.field2838 * arg2 >> 14;
        }
        if (arg0.field2902 == 4) {
            arg0.field2841 = arg0.field2950 * arg0.field2843 / arg0.field2844;
        }
        if (arg0.field2887 == 4) {
            arg0.field2950 = arg0.field2844 * arg0.field2841 / arg0.field2843;
        }
        if (arg0.field2922 == 1337) {
            field1021 = arg0;
        }
        if (arg3 && arg0.field2935 != null && (arg0.field2841 != var4 || arg0.field2950 != var5)) {
            class69 var6 = new class69();
            var6.field788 = arg0;
            var6.field790 = arg0.field2935;
            field1048.method3793(var6);
        }
    }

    @ObfuscatedName("bv.ik(Liw;III)V")
    public static void method1005(class243 arg0, int arg1, int arg2) {
        if (arg0.field2831 == 0) {
            arg0.field2839 = arg0.field2835;
        } else if (arg0.field2831 == 1) {
            arg0.field2839 = (arg1 - arg0.field2841) / 2 + arg0.field2835;
        } else if (arg0.field2831 == 2) {
            arg0.field2839 = arg1 - arg0.field2841 - arg0.field2835;
        } else if (arg0.field2831 == 3) {
            arg0.field2839 = arg0.field2835 * arg1 >> 14;
        } else if (arg0.field2831 == 4) {
            arg0.field2839 = (arg0.field2835 * arg1 >> 14) + (arg1 - arg0.field2841) / 2;
        } else {
            arg0.field2839 = arg1 - arg0.field2841 - (arg0.field2835 * arg1 >> 14);
        }
        if (arg0.field2832 == 0) {
            arg0.field2870 = arg0.field2886;
        } else if (arg0.field2832 == 1) {
            arg0.field2870 = (arg2 - arg0.field2950) / 2 + arg0.field2886;
        } else if (arg0.field2832 == 2) {
            arg0.field2870 = arg2 - arg0.field2950 - arg0.field2886;
        } else if (arg0.field2832 == 3) {
            arg0.field2870 = arg0.field2886 * arg2 >> 14;
        } else if (arg0.field2832 == 4) {
            arg0.field2870 = (arg0.field2886 * arg2 >> 14) + (arg2 - arg0.field2950) / 2;
        } else {
            arg0.field2870 = arg2 - arg0.field2950 - (arg0.field2886 * arg2 >> 14);
        }
    }

    @ObfuscatedName("i.id(Liw;IIIIIII)V")
    public static final void method72(class243 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field1025) {
            field921 = 32;
        } else {
            field921 = 0;
        }
        field1025 = false;
        if (class61.field718 == 1 || !Statics.field3560 && class61.field718 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2905 -= 4;
                method3073(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2905 += 4;
                method3073(arg0);
            } else if (arg5 >= arg1 - field921 && arg5 < field921 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2905 = (arg4 - arg3) * var8 / var9;
                method3073(arg0);
                field1025 = true;
            }
        }
        if (field1103 == 0) {
            return;
        }
        int var10 = arg0.field2841;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2905 += field1103 * 45;
            method3073(arg0);
        }
    }

    @ObfuscatedName("ag.ic(Liw;I)Z")
    public static final boolean method505(class243 arg0) {
        if (arg0.field2867 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2867.length; var1++) {
            int var2 = method975(arg0, var1);
            int var3 = arg0.field2940[var1];
            if (arg0.field2867[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2867[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2867[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bn.ij(Liw;II)I")
    public static final int method975(class243 arg0, int arg1) {
        if (arg0.field2938 == null || arg1 >= arg0.field2938.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2938[arg1];
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
                    var7 = field906[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field984[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field985[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class243 var11 = class243.method20(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class284.method4245(var12).field3663 || field1031)) {
                        for (int var13 = 0; var13 < var11.field2944.length; var13++) {
                            if (var12 + 1 == var11.field2944[var13]) {
                                var7 += var11.field2954[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class238.field2783[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class249.field3011[field984[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class238.field2783[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field302.field829;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class249.field3009[var14]) {
                            var7 += field984[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class243 var17 = class243.method20(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class284.method4245(var18).field3663 || field1031)) {
                        for (int var19 = 0; var19 < var17.field2944.length; var19++) {
                            if (var18 + 1 == var17.field2944[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field1016;
                }
                if (var6 == 12) {
                    var7 = field1017;
                }
                if (var6 == 13) {
                    int var20 = class238.field2783[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class238.method728(var22);
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
                    var7 = (Statics.field302.field1186 >> 7) + Statics.field445;
                }
                if (var6 == 19) {
                    var7 = (Statics.field302.field1151 >> 7) + Statics.field3556;
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

    @ObfuscatedName("o.in(Liw;Ljx;IIZI)V")
    public static final void method166(class243 arg0, class284 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3679;
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
            var7 = class252.field3021;
        }
        if (var6 == -1 || var7 == null) {
            return;
        }
        String var9 = class87.method3100(16748608) + arg1.field3650;
        int var11 = arg1.field3675;
        int var13 = arg0.field2856;
        if (field987 || field1075 >= 500) {
            return;
        }
        field988[field1075] = var7;
        field994[field1075] = var9;
        field991[field1075] = var6;
        field992[field1075] = var11;
        field1047[field1075] = arg2;
        field953[field1075] = var13;
        field995[field1075] = arg4;
        field1075++;
    }

    @ObfuscatedName("u.ia(Liw;III)V")
    public static final void method80(class243 arg0, int arg1, int arg2) {
        if (arg0.field2888 == 1) {
            method2423(arg0.field2943, "", 24, 0, 0, arg0.field2856);
        }
        if (arg0.field2888 == 2 && !field1006) {
            String var3 = method3068(arg0);
            if (var3 != null) {
                method2423(var3, class87.method3100(65280) + arg0.field2942, 25, 0, -1, arg0.field2856);
            }
        }
        if (arg0.field2888 == 3) {
            method2423(class252.field3228, "", 26, 0, 0, arg0.field2856);
        }
        if (arg0.field2888 == 4) {
            method2423(arg0.field2943, "", 28, 0, 0, arg0.field2856);
        }
        if (arg0.field2888 == 5) {
            method2423(arg0.field2943, "", 29, 0, 0, arg0.field2856);
        }
        if (arg0.field2888 == 6 && field1015 == null) {
            method2423(arg0.field2943, "", 30, 0, -1, arg0.field2856);
        }
        if (arg0.field2893 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2950; var5++) {
                for (int var6 = 0; var6 < arg0.field2841; var6++) {
                    int var7 = (arg0.field2939 + 32) * var6;
                    int var8 = (arg0.field2920 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2894[var4];
                        var8 += arg0.field2895[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field919 = var4;
                        Statics.field2115 = arg0;
                        if (arg0.field2944[var4] > 0) {
                            class284 var9 = class284.method4245(arg0.field2944[var4] - 1);
                            if (field1004 == 1 && class244.method1715(method1737(arg0))) {
                                if (Statics.field821 != arg0.field2856 || Statics.field541 != var4) {
                                    method2423(class252.field3170, field1005 + " " + class87.field1306 + " " + class87.method3100(16748608) + var9.field3650, 31, var9.field3675, var4, arg0.field2856);
                                }
                            } else if (!field1006 || !class244.method1715(method1737(arg0))) {
                                String[] var10 = var9.field3679;
                                int var11 = -1;
                                if (field997 && method1039()) {
                                    var11 = var9.method4814();
                                }
                                if (class244.method1715(method1737(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != var12) {
                                            method166(arg0, var9, var4, var12, false);
                                        }
                                    }
                                }
                                int var13 = method1737(arg0);
                                boolean var14 = (var13 >> 31 & 0x1) != 0;
                                if (var14) {
                                    method2423(class252.field3170, class87.method3100(16748608) + var9.field3650, 38, var9.field3675, var4, arg0.field2856);
                                }
                                class244 var10000 = (class244) null;
                                if (class244.method1715(method1737(arg0))) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var11 != var15) {
                                            method166(arg0, var9, var4, var15, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method166(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var16 = arg0.field2897;
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 39;
                                            }
                                            if (var17 == 1) {
                                                var18 = 40;
                                            }
                                            if (var17 == 2) {
                                                var18 = 41;
                                            }
                                            if (var17 == 3) {
                                                var18 = 42;
                                            }
                                            if (var17 == 4) {
                                                var18 = 43;
                                            }
                                            method2423(var16[var17], class87.method3100(16748608) + var9.field3650, var18, var9.field3675, var4, arg0.field2856);
                                        }
                                    }
                                }
                                method2423(class252.field3171, class87.method3100(16748608) + var9.field3650, 1005, var9.field3675, var4, arg0.field2856);
                            } else if ((Statics.field2961 & 0x10) == 16) {
                                method2423(field1098, field942 + " " + class87.field1306 + " " + class87.method3100(16748608) + var9.field3650, 32, var9.field3675, var4, arg0.field2856);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2825) {
            return;
        }
        if (!field1006) {
            for (int var19 = 9; var19 >= 5; var19--) {
                int var20 = method1737(arg0);
                boolean var21 = (var20 >> var19 + 1 & 0x1) != 0;
                String var22;
                if (!var21 && arg0.field2926 == null) {
                    var22 = null;
                } else if (arg0.field2900 == null || arg0.field2900.length <= var19 || arg0.field2900[var19] == null || arg0.field2900[var19].trim().length() == 0) {
                    var22 = null;
                } else {
                    var22 = arg0.field2900[var19];
                }
                if (var22 != null) {
                    method2423(var22, arg0.field2899, 1007, var19 + 1, arg0.field2827, arg0.field2856);
                }
            }
            String var24 = method3068(arg0);
            if (var24 != null) {
                method2423(var24, arg0.field2899, 25, 0, arg0.field2827, arg0.field2856);
            }
            for (int var25 = 4; var25 >= 0; var25--) {
                int var26 = method1737(arg0);
                boolean var27 = (var26 >> var25 + 1 & 0x1) != 0;
                String var28;
                if (!var27 && arg0.field2926 == null) {
                    var28 = null;
                } else if (arg0.field2900 == null || arg0.field2900.length <= var25 || arg0.field2900[var25] == null || arg0.field2900[var25].trim().length() == 0) {
                    var28 = null;
                } else {
                    var28 = arg0.field2900[var25];
                }
                if (var28 != null) {
                    method2423(var28, arg0.field2899, 57, var25 + 1, arg0.field2827, arg0.field2856);
                }
            }
            if (class244.method44(method1737(arg0))) {
                method2423(class252.field3144, "", 30, 0, arg0.field2827, arg0.field2856);
            }
        } else if (class244.method51(method1737(arg0)) && (Statics.field2961 & 0x20) == 32) {
            method2423(field1098, field942 + " " + class87.field1306 + " " + arg0.field2899, 58, 0, arg0.field2827, arg0.field2856);
        }
    }

    @ObfuscatedName("bd.iw(I)Z")
    public static boolean method1039() {
        return field998 || class52.field637[81];
    }

    @ObfuscatedName("f.is(IIIIIIIB)V")
    public static final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class243.method129(arg0)) {
            method162(Statics.field2817[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("g.im([Liw;IIIIIIIB)V")
    public static final void method162(class243[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class243 var9 = arg0[var8];
            if (var9 != null && (!var9.field2825 || var9.field2893 == 0 || var9.field2906 || method1737(var9) != 0 || field1023 == var9 || var9.field2922 == 1338) && var9.field2845 == arg1 && (!var9.field2825 || !Statics.method4090(var9))) {
                int var10 = var9.field2839 + arg6;
                int var11 = var9.field2870 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2893 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2893 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2841 + var10;
                    int var19 = var9.field2950 + var11;
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
                    int var22 = var9.field2841 + var10;
                    int var23 = var9.field2950 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field1022 == var9) {
                    field1030 = true;
                    field946 = var10;
                    field1032 = var11;
                }
                if (!var9.field2825 || var12 < var14 && var13 < var15) {
                    int var24 = class61.field723;
                    int var25 = class61.field715;
                    if (class61.field729 != 0) {
                        var24 = class61.field722;
                        var25 = class61.field728;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2922 == 1337) {
                        if (!field1069 && !field987 && var26) {
                            method4558(var24, var25, var12, var13);
                        }
                    } else if (var9.field2922 != 1338) {
                        if (var9.field2922 == 1400) {
                            Statics.field3008.method5628(class61.field723, class61.field715, var26, var10, var11, var9.field2841, var9.field2950);
                        }
                        if (!field987 && var26) {
                            if (var9.field2922 == 1400) {
                                Statics.field3008.method5655(var10, var11, var9.field2841, var9.field2950, var24, var25);
                            } else {
                                method80(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2893 == 0) {
                            if (!var9.field2825 && Statics.method4090(var9) && Statics.field580 != var9) {
                                continue;
                            }
                            method162(arg0, var9.field2856, var12, var13, var14, var15, var10 - var9.field2847, var11 - var9.field2905);
                            if (var9.field2822 != null) {
                                method162(var9.field2822, var9.field2856, var12, var13, var14, var15, var10 - var9.field2847, var11 - var9.field2905);
                            }
                            class68 var40 = (class68) field1012.method3736((long) var9.field2856);
                            if (var40 != null) {
                                if (var40.field783 == 0 && class61.field723 >= var12 && class61.field715 >= var13 && class61.field723 < var14 && class61.field715 < var15 && !field987) {
                                    for (class69 var41 = (class69) field1048.method3798(); var41 != null; var41 = (class69) field1048.method3800()) {
                                        if (var41.field789) {
                                            var41.method3785();
                                            var41.field788.field2951 = false;
                                        }
                                    }
                                    if (Statics.field450 == 0) {
                                        field1022 = null;
                                        field1023 = null;
                                    }
                                    if (!field987) {
                                        method474();
                                        field988[0] = class252.field3045;
                                        field994[0] = "";
                                        field991[0] = 1006;
                                        field995[0] = false;
                                        field1075 = 1;
                                    }
                                }
                                method117(var40.field784, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2825) {
                            if (var9.field2840) {
                                if (class61.field723 >= var12 && class61.field715 >= var13 && class61.field723 < var14 && class61.field715 < var15) {
                                    for (class69 var42 = (class69) field1048.method3798(); var42 != null; var42 = (class69) field1048.method3800()) {
                                        if (var42.field789) {
                                            var42.method3785();
                                            var42.field788.field2951 = false;
                                        }
                                    }
                                    if (Statics.field450 == 0) {
                                        field1022 = null;
                                        field1023 = null;
                                    }
                                    if (!field987) {
                                        method474();
                                        field988[0] = class252.field3045;
                                        field994[0] = "";
                                        field991[0] = 1006;
                                        field995[0] = false;
                                        field1075 = 1;
                                    }
                                }
                            } else if (var9.field2960 && class61.field723 >= var12 && class61.field715 >= var13 && class61.field723 < var14 && class61.field715 < var15) {
                                for (class69 var43 = (class69) field1048.method3798(); var43 != null; var43 = (class69) field1048.method3800()) {
                                    if (var43.field789 && var43.field788.field2818 == var43.field790) {
                                        var43.method3785();
                                    }
                                }
                            }
                            boolean var44;
                            if (class61.field723 >= var12 && class61.field715 >= var13 && class61.field723 < var14 && class61.field715 < var15) {
                                var44 = true;
                            } else {
                                var44 = false;
                            }
                            boolean var45 = false;
                            if ((class61.field718 == 1 || !Statics.field3560 && class61.field718 == 4) && var44) {
                                var45 = true;
                            }
                            boolean var46 = false;
                            if ((class61.field729 == 1 || !Statics.field3560 && class61.field729 == 4) && class61.field722 >= var12 && class61.field728 >= var13 && class61.field722 < var14 && class61.field728 < var15) {
                                var46 = true;
                            }
                            if (var46) {
                                method21(var9, class61.field722 - var10, class61.field728 - var11);
                            }
                            if (var9.field2922 == 1400) {
                                Statics.field3008.method5643(var24, var25, var44 & var45, var44 & var46);
                            }
                            if (field1022 != null && field1022 != var9 && var44 && class244.method3227(method1737(var9))) {
                                field1026 = var9;
                            }
                            if (field1023 == var9) {
                                field1027 = true;
                                field1028 = var10;
                                field1029 = var11;
                            }
                            if (var9.field2906) {
                                if (var44 && field1103 != 0 && var9.field2818 != null) {
                                    class69 var47 = new class69();
                                    var47.field789 = true;
                                    var47.field788 = var9;
                                    var47.field791 = field1103;
                                    var47.field790 = var9.field2818;
                                    field1048.method3793(var47);
                                }
                                if (field1022 != null || Statics.field2148 != null || field987) {
                                    var46 = false;
                                    var45 = false;
                                    var44 = false;
                                }
                                if (!var9.field2952 && var46) {
                                    var9.field2952 = true;
                                    if (var9.field2908 != null) {
                                        class69 var48 = new class69();
                                        var48.field789 = true;
                                        var48.field788 = var9;
                                        var48.field792 = class61.field722 - var10;
                                        var48.field791 = class61.field728 - var11;
                                        var48.field790 = var9.field2908;
                                        field1048.method3793(var48);
                                    }
                                }
                                if (var9.field2952 && var45 && var9.field2909 != null) {
                                    class69 var49 = new class69();
                                    var49.field789 = true;
                                    var49.field788 = var9;
                                    var49.field792 = class61.field723 - var10;
                                    var49.field791 = class61.field715 - var11;
                                    var49.field790 = var9.field2909;
                                    field1048.method3793(var49);
                                }
                                if (var9.field2952 && !var45) {
                                    var9.field2952 = false;
                                    if (var9.field2859 != null) {
                                        class69 var50 = new class69();
                                        var50.field789 = true;
                                        var50.field788 = var9;
                                        var50.field792 = class61.field723 - var10;
                                        var50.field791 = class61.field715 - var11;
                                        var50.field790 = var9.field2859;
                                        field978.method3793(var50);
                                    }
                                }
                                if (var45 && var9.field2911 != null) {
                                    class69 var51 = new class69();
                                    var51.field789 = true;
                                    var51.field788 = var9;
                                    var51.field792 = class61.field723 - var10;
                                    var51.field791 = class61.field715 - var11;
                                    var51.field790 = var9.field2911;
                                    field1048.method3793(var51);
                                }
                                if (!var9.field2951 && var44) {
                                    var9.field2951 = true;
                                    if (var9.field2912 != null) {
                                        class69 var52 = new class69();
                                        var52.field789 = true;
                                        var52.field788 = var9;
                                        var52.field792 = class61.field723 - var10;
                                        var52.field791 = class61.field715 - var11;
                                        var52.field790 = var9.field2912;
                                        field1048.method3793(var52);
                                    }
                                }
                                if (var9.field2951 && var44 && var9.field2913 != null) {
                                    class69 var53 = new class69();
                                    var53.field789 = true;
                                    var53.field788 = var9;
                                    var53.field792 = class61.field723 - var10;
                                    var53.field791 = class61.field715 - var11;
                                    var53.field790 = var9.field2913;
                                    field1048.method3793(var53);
                                }
                                if (var9.field2951 && !var44) {
                                    var9.field2951 = false;
                                    if (var9.field2873 != null) {
                                        class69 var54 = new class69();
                                        var54.field789 = true;
                                        var54.field788 = var9;
                                        var54.field792 = class61.field723 - var10;
                                        var54.field791 = class61.field715 - var11;
                                        var54.field790 = var9.field2873;
                                        field978.method3793(var54);
                                    }
                                }
                                if (var9.field2925 != null) {
                                    class69 var55 = new class69();
                                    var55.field788 = var9;
                                    var55.field790 = var9.field2925;
                                    field1019.method3793(var55);
                                }
                                if (var9.field2945 != null && field1113 > var9.field2836) {
                                    if (var9.field2927 == null || field1113 - var9.field2836 > 32) {
                                        class69 var60 = new class69();
                                        var60.field788 = var9;
                                        var60.field790 = var9.field2945;
                                        field1048.method3793(var60);
                                    } else {
                                        label522: for (int var56 = var9.field2836; var56 < field1113; var56++) {
                                            int var57 = field1055[var56 & 0x1F];
                                            for (int var58 = 0; var58 < var9.field2927.length; var58++) {
                                                if (var9.field2927[var58] == var57) {
                                                    class69 var59 = new class69();
                                                    var59.field788 = var9;
                                                    var59.field790 = var9.field2945;
                                                    field1048.method3793(var59);
                                                    break label522;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2836 = field1113;
                                }
                                if (var9.field2921 != null && field1038 > var9.field2955) {
                                    if (var9.field2860 == null || field1038 - var9.field2955 > 32) {
                                        class69 var65 = new class69();
                                        var65.field788 = var9;
                                        var65.field790 = var9.field2921;
                                        field1048.method3793(var65);
                                    } else {
                                        label498: for (int var61 = var9.field2955; var61 < field1038; var61++) {
                                            int var62 = field1037[var61 & 0x1F];
                                            for (int var63 = 0; var63 < var9.field2860.length; var63++) {
                                                if (var9.field2860[var63] == var62) {
                                                    class69 var64 = new class69();
                                                    var64.field788 = var9;
                                                    var64.field790 = var9.field2921;
                                                    field1048.method3793(var64);
                                                    break label498;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2955 = field1038;
                                }
                                if (var9.field2923 != null && field1040 > var9.field2956) {
                                    if (var9.field2924 == null || field1040 - var9.field2956 > 32) {
                                        class69 var70 = new class69();
                                        var70.field788 = var9;
                                        var70.field790 = var9.field2923;
                                        field1048.method3793(var70);
                                    } else {
                                        label474: for (int var66 = var9.field2956; var66 < field1040; var66++) {
                                            int var67 = field1039[var66 & 0x1F];
                                            for (int var68 = 0; var68 < var9.field2924.length; var68++) {
                                                if (var9.field2924[var68] == var67) {
                                                    class69 var69 = new class69();
                                                    var69.field788 = var9;
                                                    var69.field790 = var9.field2923;
                                                    field1048.method3793(var69);
                                                    break label474;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2956 = field1040;
                                }
                                if (field1080 > var9.field2953 && var9.field2829 != null) {
                                    class69 var71 = new class69();
                                    var71.field788 = var9;
                                    var71.field790 = var9.field2829;
                                    field1048.method3793(var71);
                                }
                                if (field1042 > var9.field2953 && var9.field2930 != null) {
                                    class69 var72 = new class69();
                                    var72.field788 = var9;
                                    var72.field790 = var9.field2930;
                                    field1048.method3793(var72);
                                }
                                if (field1036 > var9.field2953 && var9.field2931 != null) {
                                    class69 var73 = new class69();
                                    var73.field788 = var9;
                                    var73.field790 = var9.field2931;
                                    field1048.method3793(var73);
                                }
                                if (field945 > var9.field2953 && var9.field2936 != null) {
                                    class69 var74 = new class69();
                                    var74.field788 = var9;
                                    var74.field790 = var9.field2936;
                                    field1048.method3793(var74);
                                }
                                if (field1045 > var9.field2953 && var9.field2937 != null) {
                                    class69 var75 = new class69();
                                    var75.field788 = var9;
                                    var75.field790 = var9.field2937;
                                    field1048.method3793(var75);
                                }
                                if (field1046 > var9.field2953 && var9.field2932 != null) {
                                    class69 var76 = new class69();
                                    var76.field788 = var9;
                                    var76.field790 = var9.field2932;
                                    field1048.method3793(var76);
                                }
                                var9.field2953 = field857;
                                if (var9.field2907 != null) {
                                    for (int var77 = 0; var77 < field981; var77++) {
                                        class69 var78 = new class69();
                                        var78.field788 = var9;
                                        var78.field795 = field1072[var77];
                                        var78.field796 = field1071[var77];
                                        var78.field790 = var9.field2907;
                                        field1048.method3793(var78);
                                    }
                                }
                            }
                        }
                        if (!var9.field2825 && field1022 == null && Statics.field2148 == null && !field987) {
                            if ((var9.field2941 >= 0 || var9.field2853 != 0) && class61.field723 >= var12 && class61.field715 >= var13 && class61.field723 < var14 && class61.field715 < var15) {
                                if (var9.field2941 >= 0) {
                                    Statics.field580 = arg0[var9.field2941];
                                } else {
                                    Statics.field580 = var9;
                                }
                            }
                            if (var9.field2893 == 8 && class61.field723 >= var12 && class61.field715 >= var13 && class61.field723 < var14 && class61.field715 < var15) {
                                Statics.field498 = var9;
                            }
                            if (var9.field2850 > var9.field2950) {
                                method72(var9, var9.field2841 + var10, var11, var9.field2950, var9.field2850, class61.field723, class61.field715);
                            }
                        }
                    } else if ((field1081 == 0 || field1081 == 3) && (class61.field729 == 1 || !Statics.field3560 && class61.field729 == 4)) {
                        class237 var27 = var9.method4177(true);
                        if (var27 != null) {
                            int var28 = class61.field722 - var10;
                            int var29 = class61.field728 - var11;
                            if (var27.method4088(var28, var29)) {
                                int var30 = var28 - var27.field2778 / 2;
                                int var31 = var29 - var27.field2776 / 2;
                                int var32 = field923 & 0x7FF;
                                int var33 = class135.field1940[var32];
                                int var34 = class135.field1945[var32];
                                int var35 = var30 * var34 + var31 * var33 >> 11;
                                int var36 = var31 * var34 - var30 * var33 >> 11;
                                int var37 = Statics.field302.field1186 + var35 >> 7;
                                int var38 = Statics.field302.field1151 - var36 >> 7;
                                class185 var39 = class185.method251(class182.field2419, field900.field1471);
                                var39.field2497.method3243(18);
                                var39.field2497.method3243(class52.field637[82] ? (class52.field637[81] ? 2 : 1) : 0);
                                var39.field2497.method3294(Statics.field3556 + var38);
                                var39.field2497.method3360(Statics.field445 + var37);
                                var39.field2497.method3243(var30);
                                var39.field2497.method3243(var31);
                                var39.field2497.method3360(field923);
                                var39.field2497.method3243(57);
                                var39.field2497.method3243(0);
                                var39.field2497.method3243(0);
                                var39.field2497.method3243(89);
                                var39.field2497.method3360(Statics.field302.field1186);
                                var39.field2497.method3360(Statics.field302.field1151);
                                var39.field2497.method3243(63);
                                field900.method1921(var39);
                                field1079 = var37;
                                field1112 = var38;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bo.ir([Liw;II)V")
    public static final void method1515(class243[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class243 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2893 == 0) {
                    if (var3.field2822 != null) {
                        method1515(var3.field2822, arg1);
                    }
                    class68 var4 = (class68) field1012.method3736((long) var3.field2856);
                    if (var4 != null) {
                        int var5 = var4.field784;
                        if (class243.method129(var5)) {
                            method1515(Statics.field2817[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2933 != null) {
                    class69 var6 = new class69();
                    var6.field788 = var3;
                    var6.field790 = var3.field2933;
                    class82.method697(var6);
                }
                if (arg1 == 1 && var3.field2934 != null) {
                    if (var3.field2827 >= 0) {
                        class243 var7 = class243.method20(var3.field2856);
                        if (var7 == null || var7.field2822 == null || var3.field2827 >= var7.field2822.length || var7.field2822[var3.field2827] != var3) {
                            continue;
                        }
                    }
                    class69 var8 = new class69();
                    var8.field788 = var3;
                    var8.field790 = var3.field2934;
                    class82.method697(var8);
                }
            }
        }
    }

    @ObfuscatedName("y.il(Liw;IIB)V")
    public static final void method21(class243 arg0, int arg1, int arg2) {
        if (field1022 != null || field987 || arg0 == null || method1043(arg0) == null) {
            return;
        }
        field1022 = arg0;
        field1023 = method1043(arg0);
        field1024 = arg1;
        field1057 = arg2;
        Statics.field450 = 0;
        field1033 = false;
        int var3 = field1075 - 1;
        if (var3 != -1) {
            method244(var3);
        }
    }

    @ObfuscatedName("client.ib(I)V")
    public final void method1110() {
        method3073(field1022);
        Statics.field450++;
        if (field1030 && field1027) {
            int var1 = class61.field723;
            int var2 = class61.field715;
            int var3 = var1 - field1024;
            int var4 = var2 - field1057;
            if (var3 < field1028) {
                var3 = field1028;
            }
            if (field1022.field2841 + var3 > field1028 + field1023.field2841) {
                var3 = field1028 + field1023.field2841 - field1022.field2841;
            }
            if (var4 < field1029) {
                var4 = field1029;
            }
            if (field1022.field2950 + var4 > field1029 + field1023.field2950) {
                var4 = field1029 + field1023.field2950 - field1022.field2950;
            }
            int var5 = var3 - field946;
            int var6 = var4 - field1032;
            int var7 = field1022.field2828;
            if (Statics.field450 > field1022.field2834 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1033 = true;
            }
            int var8 = field1023.field2847 + (var3 - field1028);
            int var9 = field1023.field2905 + (var4 - field1029);
            if (field1022.field2915 != null && field1033) {
                class69 var10 = new class69();
                var10.field788 = field1022;
                var10.field792 = var8;
                var10.field791 = var9;
                var10.field790 = field1022.field2915;
                class82.method697(var10);
            }
            if (class61.field718 == 0) {
                if (field1033) {
                    if (field1022.field2842 != null) {
                        class69 var11 = new class69();
                        var11.field788 = field1022;
                        var11.field792 = var8;
                        var11.field791 = var9;
                        var11.field793 = field1026;
                        var11.field790 = field1022.field2842;
                        class82.method697(var11);
                    }
                    if (field1026 != null) {
                        class243 var12 = field1022;
                        int var13 = class244.method215(method1737(var12));
                        class243 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = class243.method20(var12.field2845);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class185 var16 = class185.method251(class182.field2375, field900.field1471);
                            var16.field2497.method3424(field1026.field2946);
                            var16.field2497.method3360(field1022.field2946);
                            var16.field2497.method3424(field1022.field2827);
                            var16.field2497.method3468(field1026.field2856);
                            var16.field2497.method3304(field1022.field2856);
                            var16.field2497.method3294(field1026.field2827);
                            field900.method1921(var16);
                        }
                    }
                } else if (this.method1160()) {
                    this.method1107(field946 + field1024, field1057 + field1032);
                } else if (field1075 > 0) {
                    int var17 = field946 + field1024;
                    int var18 = field1057 + field1032;
                    method482(Statics.field2103, var17, var18);
                    Statics.field2103 = null;
                }
                field1022 = null;
            }
        } else if (Statics.field450 > 1) {
            field1022 = null;
        }
    }

    @ObfuscatedName("as.ii(II)V")
    public static void method244(int arg0) {
        Statics.field2103 = new class88();
        Statics.field2103.field1318 = field1047[arg0];
        Statics.field2103.field1314 = field953[arg0];
        Statics.field2103.field1315 = field991[arg0];
        Statics.field2103.field1320 = field992[arg0];
        Statics.field2103.field1313 = field988[arg0];
    }

    @ObfuscatedName("fg.ie(Liw;I)V")
    public static void method3073(class243 arg0) {
        if (field1053 == arg0.field2958) {
            field1054[arg0.field2957] = true;
        }
    }

    @ObfuscatedName("n.ix(I)V")
    public static void method7() {
        for (class68 var0 = (class68) field1012.method3739(); var0 != null; var0 = (class68) field1012.method3740()) {
            int var1 = var0.field784;
            if (class243.method129(var1)) {
                boolean var2 = true;
                class243[] var3 = Statics.field2817[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2825;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2655;
                    class243 var6 = class243.method20(var5);
                    if (var6 != null) {
                        method3073(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bd.if(Liw;B)Liw;")
    public static class243 method1043(class243 arg0) {
        class243 var1 = arg0;
        int var2 = class244.method215(method1737(arg0));
        class243 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = class243.method20(var1.field2845);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class243 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2901;
        }
        return var5;
    }

    @ObfuscatedName("aw.iv(II)V")
    public static final void method242(int arg0) {
        if (!class243.method129(arg0)) {
            return;
        }
        class243[] var1 = Statics.field2817[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class243 var3 = var1[var2];
            if (var3 != null) {
                var3.field2948 = 0;
                var3.field2949 = 0;
            }
        }
    }

    @ObfuscatedName("gt.ih(II)V")
    public static final void method3594(int arg0) {
        if (class243.method129(arg0)) {
            method132(Statics.field2817[arg0], -1);
        }
    }

    @ObfuscatedName("c.io([Liw;II)V")
    public static final void method132(class243[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class243 var3 = arg0[var2];
            if (var3 != null && var3.field2845 == arg1 && (!var3.field2825 || !Statics.method4090(var3))) {
                if (var3.field2893 == 0) {
                    if (!var3.field2825 && Statics.method4090(var3) && Statics.field580 != var3) {
                        continue;
                    }
                    method132(arg0, var3.field2856);
                    if (var3.field2822 != null) {
                        method132(var3.field2822, var3.field2856);
                    }
                    class68 var4 = (class68) field1012.method3736((long) var3.field2856);
                    if (var4 != null) {
                        method3594(var4.field784);
                    }
                }
                if (var3.field2893 == 6) {
                    if (var3.field2821 != -1 || var3.field2874 != -1) {
                        boolean var5 = method505(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2874;
                        } else {
                            var6 = var3.field2821;
                        }
                        if (var6 != -1) {
                            class288 var7 = class288.method4510(var6);
                            var3.field2949 += field915;
                            while (var3.field2949 > var7.field3758[var3.field2948]) {
                                var3.field2949 -= var7.field3758[var3.field2948];
                                var3.field2948++;
                                if (var3.field2948 >= var7.field3764.length) {
                                    var3.field2948 -= var7.field3760;
                                    if (var3.field2948 < 0 || var3.field2948 >= var7.field3764.length) {
                                        var3.field2948 = 0;
                                    }
                                }
                                method3073(var3);
                            }
                        }
                    }
                    if (var3.field2882 != 0 && !var3.field2825) {
                        int var8 = var3.field2882 >> 16;
                        int var9 = var3.field2882 << 16 >> 16;
                        int var10 = field915 * var8;
                        int var11 = field915 * var9;
                        var3.field2877 = var3.field2877 + var10 & 0x7FF;
                        var3.field2878 = var3.field2878 + var11 & 0x7FF;
                        method3073(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("eo.iy(II)V")
    public static final void method2934(int arg0) {
        method7();
        for (class81 var1 = (class81) class81.field1254.method3798(); var1 != null; var1 = (class81) class81.field1254.method3800()) {
            if (var1.field1243 != null) {
                var1.method1652();
            }
        }
        int var2 = class269.method4248(arg0).field3448;
        if (var2 == 0) {
            return;
        }
        int var3 = class238.field2783[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class135.method2619(0.9D);
                ((class124) Statics.field1941).method2392(0.9D);
            }
            if (var3 == 2) {
                class135.method2619(0.8D);
                ((class124) Statics.field1941).method2392(0.8D);
            }
            if (var3 == 3) {
                class135.method2619(0.7D);
                ((class124) Statics.field1941).method2392(0.7D);
            }
            if (var3 == 4) {
                class135.method2619(0.6D);
                ((class124) Statics.field1941).method2392(0.6D);
            }
            class284.field3647.method3700();
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
            if (field982 != var4) {
                if (field982 == 0 && field1116 != -1) {
                    class230.method992(Statics.field2129, field1116, 0, var4, false);
                    field971 = false;
                } else if (var4 == 0) {
                    class230.method3514();
                    field971 = false;
                } else {
                    class230.method3225(var4);
                }
                field982 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field1085 = 127;
            }
            if (var3 == 1) {
                field1085 = 96;
            }
            if (var3 == 2) {
                field1085 = 64;
            }
            if (var3 == 3) {
                field1085 = 32;
            }
            if (var3 == 4) {
                field1085 = 0;
            }
        }
        if (var2 == 5) {
            field925 = var3;
        }
        if (var2 == 6) {
            field1013 = var3;
        }
        if (var2 == 9) {
            field1014 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field912 = 127;
            }
            if (var3 == 1) {
                field912 = 96;
            }
            if (var3 == 2) {
                field912 = 64;
            }
            if (var3 == 3) {
                field912 = 32;
            }
            if (var3 == 4) {
                field912 = 0;
            }
        }
        if (var2 == 17) {
            field1009 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            class90[] var5 = new class90[] { class90.field1329, class90.field1331, class90.field1328, class90.field1333 };
            field882 = (class90) class190.method500(var5, var3);
            if (field882 == null) {
                field882 = class90.field1331;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field1104 = -1;
            } else {
                field1104 = var3 & 0x7FF;
            }
        }
        if (var2 != 22) {
            return;
        }
        class90[] var6 = new class90[] { class90.field1329, class90.field1331, class90.field1328, class90.field1333 };
        field883 = (class90) class190.method500(var6, var3);
        if (field883 == null) {
            field883 = class90.field1331;
        }
    }

    @ObfuscatedName("ik.ig(Liw;B)V")
    public static final void method4089(class243 arg0) {
        int var1 = arg0.field2922;
        if (var1 == 324) {
            if (field968 == -1) {
                field968 = arg0.field2861;
                field1114 = arg0.field2862;
            }
            if (field1010.field2795) {
                arg0.field2861 = field968;
            } else {
                arg0.field2861 = field1114;
            }
        } else if (var1 == 325) {
            if (field968 == -1) {
                field968 = arg0.field2861;
                field1114 = arg0.field2862;
            }
            if (field1010.field2795) {
                arg0.field2861 = field1114;
            } else {
                arg0.field2861 = field968;
            }
        } else if (var1 == 327) {
            arg0.field2877 = 150;
            arg0.field2878 = (int) (Math.sin((double) field866 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2866 = 5;
            arg0.field2910 = 0;
        } else if (var1 == 328) {
            arg0.field2877 = 150;
            arg0.field2878 = (int) (Math.sin((double) field866 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2866 = 5;
            arg0.field2910 = 1;
        }
    }

    @ObfuscatedName("aw.iz(B)V")
    public static final void method239() {
        class185 var0 = class185.method251(class182.field2432, field900.field1471);
        field900.method1921(var0);
        for (class68 var1 = (class68) field1012.method3739(); var1 != null; var1 = (class68) field1012.method3740()) {
            if (var1.field783 == 0 || var1.field783 == 3) {
                method4249(var1, true);
            }
        }
        if (field1015 != null) {
            method3073(field1015);
            field1015 = null;
        }
    }

    @ObfuscatedName("bt.iq(IIII)Lbg;")
    public static final class68 method882(int arg0, int arg1, int arg2) {
        class68 var3 = new class68();
        var3.field784 = arg1;
        var3.field783 = arg2;
        field1012.method3745(var3, (long) arg0);
        method242(arg1);
        class243 var4 = class243.method20(arg0);
        method3073(var4);
        if (field1015 != null) {
            method3073(field1015);
            field1015 = null;
        }
        method4371();
        method3162(Statics.field2817[arg0 >> 16], var4, false);
        class82.method333(arg1);
        if (field1011 != -1) {
            int var5 = field1011;
            if (class243.method129(var5)) {
                method1515(Statics.field2817[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("io.it(Lbg;ZI)V")
    public static final void method4249(class68 arg0, boolean arg1) {
        int var2 = arg0.field784;
        int var3 = (int) arg0.field2655;
        arg0.method3785();
        if (arg1) {
            class243.method1886(var2);
        }
        method165(var2);
        class243 var4 = class243.method20(var3);
        if (var4 != null) {
            method3073(var4);
        }
        method4371();
        if (field1011 != -1) {
            int var5 = field1011;
            if (class243.method129(var5)) {
                method1515(Statics.field2817[var5], 1);
            }
        }
    }

    @ObfuscatedName("z.jt(Liw;B)Z")
    public static final boolean method3(class243 arg0) {
        int var1 = arg0.field2922;
        if (var1 == 205) {
            field887 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1010.method4132(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1010.method4129(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1010.method4127(false);
        }
        if (var1 == 325) {
            field1010.method4127(true);
        }
        if (var1 == 326) {
            class185 var6 = class185.method251(class182.field2423, field900.field1471);
            field1010.method4145(var6.field2497);
            field900.method1921(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("be.jk(Liw;IIIB)V")
    public static final void method963(class243 arg0, int arg1, int arg2, int arg3) {
        method3188();
        class237 var4 = arg0.method4177(false);
        if (var4 == null) {
            return;
        }
        class328.method5340(arg1, arg2, var4.field2778 + arg1, var4.field2776 + arg2);
        if (field1081 == 2 || field1081 == 5) {
            class328.method5363(arg1, arg2, 0, var4.field2779, var4.field2780);
        } else {
            int var5 = field923 & 0x7FF;
            int var6 = Statics.field302.field1186 / 32 + 48;
            int var7 = 464 - Statics.field302.field1151 / 32;
            Statics.field382.method5473(arg1, arg2, var4.field2778, var4.field2776, var6, var7, var5, 256, var4.field2779, var4.field2780);
            for (int var8 = 0; var8 < field1007; var8++) {
                int var9 = field1076[var8] * 4 + 2 - Statics.field302.field1186 / 32;
                int var10 = field1065[var8] * 4 + 2 - Statics.field302.field1151 / 32;
                method1502(arg1, arg2, var9, var10, field1099[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class218 var13 = field962[Statics.field505][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field302.field1186 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field302.field1151 / 32;
                        method1502(arg1, arg2, var14, var15, Statics.field388[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field896; var16++) {
                class85 var17 = field1035[field897[var16]];
                if (var17 != null && var17.method1048()) {
                    class286 var18 = var17.field1292;
                    if (var18 != null && var18.field3734 != null) {
                        var18 = var18.method4853();
                    }
                    if (var18 != null && var18.field3725 && var18.field3719) {
                        int var19 = var17.field1186 / 32 - Statics.field302.field1186 / 32;
                        int var20 = var17.field1151 / 32 - Statics.field302.field1151 / 32;
                        method1502(arg1, arg2, var19, var20, Statics.field388[1], var4);
                    }
                }
            }
            int var21 = class94.field1407;
            int[] var22 = class94.field1408;
            for (int var23 = 0; var23 < var21; var23++) {
                class73 var24 = field967[var22[var23]];
                if (var24 != null && var24.method1048() && !var24.field844 && Statics.field302 != var24) {
                    int var25 = var24.field1186 / 32 - Statics.field302.field1186 / 32;
                    int var26 = var24.field1151 / 32 - Statics.field302.field1151 / 32;
                    boolean var27 = false;
                    if (Statics.field302.field843 != 0 && var24.field843 != 0 && Statics.field302.field843 == var24.field843) {
                        var27 = true;
                    }
                    if (var24.method1037()) {
                        method1502(arg1, arg2, var25, var26, Statics.field388[3], var4);
                    } else if (var27) {
                        method1502(arg1, arg2, var25, var26, Statics.field388[4], var4);
                    } else if (var24.method1064()) {
                        method1502(arg1, arg2, var25, var26, Statics.field388[5], var4);
                    } else {
                        method1502(arg1, arg2, var25, var26, Statics.field388[2], var4);
                    }
                }
            }
            if (field901 != 0 && field866 % 20 < 10) {
                if (field901 == 1 && field875 >= 0 && field875 < field1035.length) {
                    class85 var28 = field1035[field875];
                    if (var28 != null) {
                        int var29 = var28.field1186 / 32 - Statics.field302.field1186 / 32;
                        int var30 = var28.field1151 / 32 - Statics.field302.field1151 / 32;
                        method1940(arg1, arg2, var29, var30, Statics.field27[1], var4);
                    }
                }
                if (field901 == 2) {
                    int var31 = field1095 * 4 - Statics.field445 * 4 + 2 - Statics.field302.field1186 / 32;
                    int var32 = field878 * 4 - Statics.field3556 * 4 + 2 - Statics.field302.field1151 / 32;
                    method1940(arg1, arg2, var31, var32, Statics.field27[1], var4);
                }
                if (field901 == 10 && field1083 >= 0 && field1083 < field967.length) {
                    class73 var33 = field967[field1083];
                    if (var33 != null) {
                        int var34 = var33.field1186 / 32 - Statics.field302.field1186 / 32;
                        int var35 = var33.field1151 / 32 - Statics.field302.field1151 / 32;
                        method1940(arg1, arg2, var34, var35, Statics.field27[1], var4);
                    }
                }
            }
            if (field1079 != 0) {
                int var36 = field1079 * 4 + 2 - Statics.field302.field1186 / 32;
                int var37 = field1112 * 4 + 2 - Statics.field302.field1151 / 32;
                method1502(arg1, arg2, var36, var37, Statics.field27[0], var4);
            }
            if (!Statics.field302.field844) {
                class328.method5381(var4.field2778 / 2 + arg1 - 1, var4.field2776 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field1044[arg3] = true;
    }

    @ObfuscatedName("cb.ja(IIIILly;Lik;I)V")
    public static final void method1940(int arg0, int arg1, int arg2, int arg3, class332 arg4, class237 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1502(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field923 & 0x7FF;
        int var8 = class135.field1940[var7];
        int var9 = class135.field1945[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2778 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field2211.method5474(arg5.field2778 / 2 + arg0 - var17 / 2 + var15, arg5.field2776 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("bh.js(IIIILly;Lik;B)V")
    public static final void method1502(int arg0, int arg1, int arg2, int arg3, class332 arg4, class237 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field923 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class135.field1940[var6];
        int var9 = class135.field1945[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5472(arg5.field2778 / 2 + var10 - arg4.field3979 / 2, arg5.field2776 / 2 - var11 - arg4.field3985 / 2, arg0, arg1, arg5.field2778, arg5.field2776, arg5.field2779, arg5.field2780);
        } else {
            arg4.method5459(arg5.field2778 / 2 + arg0 + var10 - arg4.field3979 / 2, arg5.field2776 / 2 + arg1 - var11 - arg4.field3985 / 2);
        }
    }

    @ObfuscatedName("h.jv(I)V")
    public static final void method53() {
        for (int var0 = 0; var0 < class94.field1407; var0++) {
            class73 var1 = field967[class94.field1408[var0]];
            var1.method1038();
        }
        class96.method978();
        if (Statics.field785 != null) {
            Statics.field785.method5122();
        }
    }

    @ObfuscatedName("aq.jj(I)V")
    public static final void method468() {
        class96.method1742();
        if (Statics.field785 != null) {
            Statics.field785.method5124();
        }
    }

    @ObfuscatedName("v.jh(B)V")
    public static final void method108() {
        for (int var0 = 0; var0 < class94.field1407; var0++) {
            class73 var1 = field967[class94.field1408[var0]];
            var1.method1041();
        }
    }

    @ObfuscatedName("o.jp(I)V")
    public static final void method178() {
        field1042 = field857;
    }

    @ObfuscatedName("u.jo(Ljava/lang/String;I)V")
    public static final void method77(String arg0) {
        if (Statics.field785 != null) {
            class185 var1 = class185.method251(class182.field2390, field900.field1471);
            var1.field2497.method3243(class195.method240(arg0));
            var1.field2497.method3250(arg0);
            field900.method1921(var1);
        }
    }

    @ObfuscatedName("at.jw(Ljava/lang/String;I)V")
    public static final void method503(String arg0) {
        if (!arg0.equals("")) {
            class185 var1 = class185.method251(class182.field2376, field900.field1471);
            var1.field2497.method3243(class195.method240(arg0));
            var1.field2497.method3250(arg0);
            field900.method1921(var1);
        }
    }

    @ObfuscatedName("g.jr(IB)V")
    public static void method165(int arg0) {
        for (class224 var1 = (class224) field1051.method3739(); var1 != null; var1 = (class224) field1051.method3740()) {
            if ((var1.field2655 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3785();
            }
        }
    }

    @ObfuscatedName("ce.ju(Liw;I)I")
    public static int method1737(class243 arg0) {
        class224 var1 = (class224) field1051.method3736(((long) arg0.field2856 << 32) + (long) arg0.field2827);
        return var1 == null ? arg0.field2919 : var1.field2670;
    }

    @ObfuscatedName("fw.jy(Liw;I)Ljava/lang/String;")
    public static String method3068(class243 arg0) {
        int var1 = method1737(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2880 == null || arg0.field2880.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2880;
        }
    }

    @ObfuscatedName("jb.je(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method4701(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field860 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field860 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field860 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field860 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field860 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field376 != null) {
            var3 = "/p=" + Statics.field376;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field863 + "/a=" + Statics.field760 + var3 + "/";
    }

    @ObfuscatedName("v.jc(Ljava/lang/String;I)V")
    public static void method94(String arg0) {
        Statics.field376 = arg0;
        try {
            String var1 = Statics.field357.getParameter(class294.field3810.field3794);
            String var2 = Statics.field357.getParameter(class294.field3807.field3794);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class205.method5144(class197.method1501() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field357;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("as.jl(Ljava/lang/String;ZI)V")
    public static void method249(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3644; var5++) {
            class284 var6 = class284.method4245(var5);
            if ((!arg1 || var6.field3666) && var6.field3684 == -1 && var6.field3650.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1334 = -1;
                    Statics.field579 = null;
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
        Statics.field579 = var3;
        Statics.field29 = 0;
        Statics.field1334 = var4;
        String[] var9 = new String[Statics.field1334];
        for (int var10 = 0; var10 < Statics.field1334; var10++) {
            var9[var10] = class284.method4245(var3[var10]).field3650;
        }
        short[] var11 = Statics.field579;
        class192.method695(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("bq.jf([BIB)V")
    public static void method1559(byte[] arg0, int arg1) {
        if (field890 == null) {
            field890 = new byte[24];
        }
        class206.method3599(arg0, arg1, field890, 0, 24);
    }

    @ObfuscatedName("bc.jm(Lgy;II)V")
    public static void method681(class195 arg0, int arg1) {
        method1559(arg0.field2569, arg1);
        if (class168.field2199 == null) {
            return;
        }
        try {
            class168.field2199.method2344(0L);
            class168.field2199.method2357(arg0.field2569, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("bb.ji(Lgy;I)V")
    public static void method996(class195 arg0) {
        if (field890 != null) {
            arg0.method3253(field890, 0, field890.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class168.field2199.method2344(0L);
            class168.field2199.method2347(var1);
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
        arg0.method3253(var1, 0, var1.length);
    }

    @ObfuscatedName("client.jn(S)Lko;")
    public class306 method1111() {
        return Statics.field302 == null ? null : Statics.field302.field848;
    }

    @ObfuscatedName("r.jb(IIIZI)V")
    public static void method9(int arg0, int arg1, int arg2, boolean arg3) {
        class185 var4 = class185.method251(class182.field2449, field900.field1471);
        var4.field2497.method3304(arg3 ? field933 : 0);
        var4.field2497.method3274(arg2);
        var4.field2497.method3360(arg1);
        var4.field2497.method3424(arg0);
        field900.method1921(var4);
    }

    @ObfuscatedName("e.jd(B)V")
    public static void method13() {
        field900.method1921(class185.method251(class182.field2428, field900.field1471));
        field928 = 0;
    }

    @ObfuscatedName("b.jx(I)V")
    public static void method128() {
        if (field928 == 1) {
            field934 = true;
        }
    }

    @ObfuscatedName("ax.jz(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method545(String arg0) {
        class257[] var1 = class257.method4166();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class257 var3 = var1[var2];
            if (var3.field3339 != -1 && arg0.startsWith(class87.method693(var3.field3339))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3339).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ap.jg(B)V")
    public static void method212() {
        if (Statics.field853 == null) {
            return;
        }
        field1117 = field866;
        Statics.field853.method4419();
        for (int var0 = 0; var0 < field967.length; var0++) {
            if (field967[var0] != null) {
                Statics.field853.method4418((field967[var0].field1186 >> 7) + Statics.field445, (field967[var0].field1151 >> 7) + Statics.field3556);
            }
        }
    }
}
