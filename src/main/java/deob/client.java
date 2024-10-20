package deob;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import netscape.javascript.JSObject;

public final class client extends class59 implements class278 {

    @ObfuscatedName("client.w")
    public static class167[] field896 = new class167[4];

    @ObfuscatedName("client.ac")
    public static boolean field986 = true;

    @ObfuscatedName("client.bj")
    public static int field841 = 1;

    @ObfuscatedName("client.bo")
    public static int field842 = 0;

    @ObfuscatedName("client.bm")
    public static int field1016 = 0;

    @ObfuscatedName("client.bt")
    public static boolean field958 = false;

    @ObfuscatedName("client.bi")
    public static boolean field991 = false;

    @ObfuscatedName("client.bq")
    public static int field846 = 0;

    @ObfuscatedName("client.bk")
    public static int field848 = 0;

    @ObfuscatedName("client.bl")
    public static boolean field849 = true;

    @ObfuscatedName("client.bc")
    public static int field1036 = 0;

    @ObfuscatedName("client.bz")
    public static long field843 = 1L;

    @ObfuscatedName("client.bd")
    public static int field852 = -1;

    @ObfuscatedName("client.by")
    public static int field853 = -1;

    @ObfuscatedName("client.bw")
    public static int field854 = -1;

    @ObfuscatedName("client.bu")
    public static boolean field962 = true;

    @ObfuscatedName("client.be")
    public static boolean field989 = false;

    @ObfuscatedName("client.bb")
    public static int field995 = 0;

    @ObfuscatedName("client.bs")
    public static int field1001 = 0;

    @ObfuscatedName("client.bg")
    public static int field844 = 0;

    @ObfuscatedName("client.cw")
    public static int field860 = 0;

    @ObfuscatedName("client.cc")
    public static int field861 = 0;

    @ObfuscatedName("client.co")
    public static int field862 = 0;

    @ObfuscatedName("client.ce")
    public static int field863 = 0;

    @ObfuscatedName("client.ch")
    public static int field864 = 0;

    @ObfuscatedName("client.cd")
    public static int field865 = 0;

    @ObfuscatedName("client.ci")
    public static class89 field866 = class89.field1310;

    @ObfuscatedName("client.cj")
    public static class89 field867 = class89.field1310;

    @ObfuscatedName("client.cp")
    public static int field868 = 0;

    @ObfuscatedName("client.ck")
    public static int field869 = 0;

    @ObfuscatedName("client.cb")
    public static int field1019 = 0;

    @ObfuscatedName("client.dh")
    public static int field873 = 0;

    @ObfuscatedName("client.dj")
    public static int field874 = 0;

    @ObfuscatedName("client.do")
    public static int field875 = 0;

    @ObfuscatedName("client.dv")
    public static int field876 = 0;

    @ObfuscatedName("client.dg")
    public static int field877 = 0;

    @ObfuscatedName("client.dt")
    public static class149 field878 = class149.field2087;

    @ObfuscatedName("client.dp")
    public static byte[] field1007 = null;

    @ObfuscatedName("client.dn")
    public static class84[] field880 = new class84[32768];

    @ObfuscatedName("client.di")
    public static int field881 = 0;

    @ObfuscatedName("client.du")
    public static int[] field882 = new int[32768];

    @ObfuscatedName("client.de")
    public static int field883 = 0;

    @ObfuscatedName("client.es")
    public static int[] field884 = new int[250];

    @ObfuscatedName("client.eg")
    public static final class99 field938 = new class99();

    @ObfuscatedName("client.eo")
    public static int field944 = 0;

    @ObfuscatedName("client.ec")
    public static boolean field887 = false;

    @ObfuscatedName("client.eq")
    public static boolean field1055 = true;

    @ObfuscatedName("client.eh")
    public static class300 field889 = new class300();

    @ObfuscatedName("client.en")
    public static HashMap field890 = new HashMap();

    @ObfuscatedName("client.ee")
    public static int field891 = 0;

    @ObfuscatedName("client.ep")
    public static int field892 = 1;

    @ObfuscatedName("client.et")
    public static int field893 = 0;

    @ObfuscatedName("client.eb")
    public static int field894 = 1;

    @ObfuscatedName("client.ed")
    public static int field895 = 0;

    @ObfuscatedName("client.fo")
    public static boolean field985 = false;

    @ObfuscatedName("client.fu")
    public static int[][][] field898 = new int[4][13][13];

    @ObfuscatedName("client.fg")
    public static final int[] field899 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fj")
    public static int field1092 = 0;

    @ObfuscatedName("client.fp")
    public static int field902 = 2301979;

    @ObfuscatedName("client.fl")
    public static int field906 = 5063219;

    @ObfuscatedName("client.gn")
    public static int field932 = 3353893;

    @ObfuscatedName("client.gk")
    public static int field905 = 7759444;

    @ObfuscatedName("client.gy")
    public static boolean field928 = false;

    @ObfuscatedName("client.gd")
    public static int field1094 = 0;

    @ObfuscatedName("client.go")
    public static int field908 = 128;

    @ObfuscatedName("client.ga")
    public static int field909 = 0;

    @ObfuscatedName("client.gh")
    public static int field910 = 0;

    @ObfuscatedName("client.gb")
    public static int field911 = 0;

    @ObfuscatedName("client.gp")
    public static int field912 = 0;

    @ObfuscatedName("client.gq")
    public static int field913 = 0;

    @ObfuscatedName("client.gz")
    public static int field1062 = 50;

    @ObfuscatedName("client.gc")
    public static int field915 = 0;

    @ObfuscatedName("client.gs")
    public static boolean field1045 = false;

    @ObfuscatedName("client.gi")
    public static int field917 = 0;

    @ObfuscatedName("client.gf")
    public static int field918 = 0;

    @ObfuscatedName("client.gw")
    public static int field972 = 50;

    @ObfuscatedName("client.gv")
    public static int[] field888 = new int[field972];

    @ObfuscatedName("client.gu")
    public static int[] field921 = new int[field972];

    @ObfuscatedName("client.gr")
    public static int[] field1057 = new int[field972];

    @ObfuscatedName("client.he")
    public static int[] field923 = new int[field972];

    @ObfuscatedName("client.hq")
    public static int[] field1081 = new int[field972];

    @ObfuscatedName("client.hp")
    public static int[] field925 = new int[field972];

    @ObfuscatedName("client.hb")
    public static int[] field926 = new int[field972];

    @ObfuscatedName("client.hk")
    public static String[] field927 = new String[field972];

    @ObfuscatedName("client.ht")
    public static int[][] field1028 = new int[104][104];

    @ObfuscatedName("client.hf")
    public static int field929 = 0;

    @ObfuscatedName("client.hw")
    public static int field930 = -1;

    @ObfuscatedName("client.hh")
    public static int field998 = -1;

    @ObfuscatedName("client.hx")
    public static int field1078 = 0;

    @ObfuscatedName("client.hn")
    public static int field1006 = 0;

    @ObfuscatedName("client.hl")
    public static int field934 = 0;

    @ObfuscatedName("client.hu")
    public static int field1080 = 0;

    @ObfuscatedName("client.hy")
    public static int field936 = 0;

    @ObfuscatedName("client.hv")
    public static int field937 = 0;

    @ObfuscatedName("client.hd")
    public static int field988 = 0;

    @ObfuscatedName("client.hs")
    public static int field994 = 0;

    @ObfuscatedName("client.ha")
    public static int field940 = 0;

    @ObfuscatedName("client.hc")
    public static int field897 = 0;

    @ObfuscatedName("client.hj")
    public static boolean field942 = false;

    @ObfuscatedName("client.hz")
    public static int field943 = 0;

    @ObfuscatedName("client.hi")
    public static int field840 = 0;

    @ObfuscatedName("client.ii")
    public static class72[] field945 = new class72[2048];

    @ObfuscatedName("client.ig")
    public static int field946 = -1;

    @ObfuscatedName("client.ie")
    public static int field947 = 0;

    @ObfuscatedName("client.io")
    public static int field948 = 0;

    @ObfuscatedName("client.ik")
    public static int[] field949 = new int[1000];

    @ObfuscatedName("client.it")
    public static String field904 = null;

    @ObfuscatedName("client.ih")
    public static final int[] field950 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ir")
    public static String[] field951 = new String[8];

    @ObfuscatedName("client.ij")
    public static boolean[] field845 = new boolean[8];

    @ObfuscatedName("client.id")
    public static int[] field953 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.if")
    public static int field954 = -1;

    @ObfuscatedName("client.ia")
    public static class205[][][] field955 = new class205[4][104][104];

    @ObfuscatedName("client.in")
    public static class205 field990 = new class205();

    @ObfuscatedName("client.ip")
    public static class205 field957 = new class205();

    @ObfuscatedName("client.is")
    public static class205 field924 = new class205();

    @ObfuscatedName("client.iq")
    public static int[] field959 = new int[25];

    @ObfuscatedName("client.iv")
    public static int[] field960 = new int[25];

    @ObfuscatedName("client.il")
    public static int[] field961 = new int[25];

    @ObfuscatedName("client.iw")
    public static int field856 = 0;

    @ObfuscatedName("client.iu")
    public static boolean field1072 = false;

    @ObfuscatedName("client.jt")
    public static int field885 = 0;

    @ObfuscatedName("client.ju")
    public static int[] field965 = new int[500];

    @ObfuscatedName("client.jc")
    public static int[] field966 = new int[500];

    @ObfuscatedName("client.jo")
    public static int[] field901 = new int[500];

    @ObfuscatedName("client.jv")
    public static int[] field968 = new int[500];

    @ObfuscatedName("client.jm")
    public static String[] field1005 = new String[500];

    @ObfuscatedName("client.je")
    public static String[] field970 = new String[500];

    @ObfuscatedName("client.jn")
    public static boolean[] field971 = new boolean[500];

    @ObfuscatedName("client.jq")
    public static boolean field1014 = false;

    @ObfuscatedName("client.jj")
    public static boolean field973 = false;

    @ObfuscatedName("client.jb")
    public static int field974 = -1;

    @ObfuscatedName("client.jz")
    public static int field975 = -1;

    @ObfuscatedName("client.ji")
    public static int field976 = 0;

    @ObfuscatedName("client.jw")
    public static int field977 = 50;

    @ObfuscatedName("client.jh")
    public static int field978 = 0;

    @ObfuscatedName("client.js")
    public static boolean field980 = false;

    @ObfuscatedName("client.ky")
    public static int field1039 = -1;

    @ObfuscatedName("client.ke")
    public static int field1061 = -1;

    @ObfuscatedName("client.ko")
    public static String field855 = null;

    @ObfuscatedName("client.kn")
    public static String field996 = null;

    @ObfuscatedName("client.kw")
    public static int field859 = -1;

    @ObfuscatedName("client.kg")
    public static class202 field1052 = new class202(8);

    @ObfuscatedName("client.kf")
    public static int field987 = 0;

    @ObfuscatedName("client.kv")
    public static int field1066 = 0;

    @ObfuscatedName("client.kc")
    public static class228 field886 = null;

    @ObfuscatedName("client.ks")
    public static int field919 = 0;

    @ObfuscatedName("client.km")
    public static int field935 = 0;

    @ObfuscatedName("client.kr")
    public static int field1084 = 0;

    @ObfuscatedName("client.kb")
    public static int field993 = -1;

    @ObfuscatedName("client.kl")
    public static boolean field858 = false;

    @ObfuscatedName("client.kk")
    public static boolean field1099 = false;

    @ObfuscatedName("client.ku")
    public static boolean field914 = false;

    @ObfuscatedName("client.kq")
    public static class228 field1004 = null;

    @ObfuscatedName("client.kj")
    public static class228 field941 = null;

    @ObfuscatedName("client.kd")
    public static class228 field931 = null;

    @ObfuscatedName("client.ka")
    public static int field1000 = 0;

    @ObfuscatedName("client.kh")
    public static int field922 = 0;

    @ObfuscatedName("client.ki")
    public static class228 field1002 = null;

    @ObfuscatedName("client.kz")
    public static boolean field1003 = false;

    @ObfuscatedName("client.kx")
    public static int field857 = -1;

    @ObfuscatedName("client.lr")
    public static int field1071 = -1;

    @ObfuscatedName("client.ld")
    public static boolean field981 = false;

    @ObfuscatedName("client.lx")
    public static int field920 = -1;

    @ObfuscatedName("client.lm")
    public static int field1008 = -1;

    @ObfuscatedName("client.lp")
    public static boolean field1009 = false;

    @ObfuscatedName("client.lv")
    public static int field1010 = 1;

    @ObfuscatedName("client.la")
    public static int[] field1011 = new int[32];

    @ObfuscatedName("client.ll")
    public static int field1012 = 0;

    @ObfuscatedName("client.lk")
    public static int[] field1013 = new int[32];

    @ObfuscatedName("client.lt")
    public static int field1091 = 0;

    @ObfuscatedName("client.lg")
    public static int[] field1015 = new int[32];

    @ObfuscatedName("client.lh")
    public static int field997 = 0;

    @ObfuscatedName("client.lw")
    public static int field1017 = 0;

    @ObfuscatedName("client.lz")
    public static int field1018 = 0;

    @ObfuscatedName("client.li")
    public static int field1031 = 0;

    @ObfuscatedName("client.ln")
    public static int field1020 = 0;

    @ObfuscatedName("client.lq")
    public static int field1021 = 0;

    @ObfuscatedName("client.lo")
    public static int field1022 = 0;

    @ObfuscatedName("client.md")
    public static int field1023 = 0;

    @ObfuscatedName("client.mt")
    public static class205 field1024 = new class205();

    @ObfuscatedName("client.mr")
    public static class205 field1025 = new class205();

    @ObfuscatedName("client.mx")
    public static class205 field1026 = new class205();

    @ObfuscatedName("client.mk")
    public static class202 field1027 = new class202(512);

    @ObfuscatedName("client.mh")
    public static int field850 = 0;

    @ObfuscatedName("client.mg")
    public static int field1029 = -2;

    @ObfuscatedName("client.mw")
    public static boolean[] field1030 = new boolean[100];

    @ObfuscatedName("client.mf")
    public static boolean[] field907 = new boolean[100];

    @ObfuscatedName("client.ma")
    public static boolean[] field1032 = new boolean[100];

    @ObfuscatedName("client.mu")
    public static int[] field1033 = new int[100];

    @ObfuscatedName("client.mq")
    public static int[] field1034 = new int[100];

    @ObfuscatedName("client.mz")
    public static int[] field956 = new int[100];

    @ObfuscatedName("client.me")
    public static int[] field964 = new int[100];

    @ObfuscatedName("client.mb")
    public static int field1037 = 0;

    @ObfuscatedName("client.mn")
    public static long field1038 = 0L;

    @ObfuscatedName("client.ms")
    public static boolean field969 = true;

    @ObfuscatedName("client.mp")
    public static int[] field1040 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.mi")
    public static int field1041 = 0;

    @ObfuscatedName("client.nq")
    public static int field1042 = 0;

    @ObfuscatedName("client.no")
    public static String field1043 = "";

    @ObfuscatedName("client.na")
    public static long[] field1044 = new long[100];

    @ObfuscatedName("client.nu")
    public static int field900 = 0;

    @ObfuscatedName("client.nd")
    public static int field1046 = 0;

    @ObfuscatedName("client.nk")
    public static int[] field1047 = new int[128];

    @ObfuscatedName("client.nf")
    public static int[] field967 = new int[128];

    @ObfuscatedName("client.nv")
    public static long field1049 = -1L;

    @ObfuscatedName("client.ns")
    public static int field1050 = -1;

    @ObfuscatedName("client.nr")
    public static int field1051 = 0;

    @ObfuscatedName("client.nh")
    public static int[] field1035 = new int[1000];

    @ObfuscatedName("client.nt")
    public static int[] field1053 = new int[1000];

    @ObfuscatedName("client.ny")
    public static class310[] field1054 = new class310[1000];

    @ObfuscatedName("client.ng")
    public static int field984 = 0;

    @ObfuscatedName("client.nl")
    public static int field1056 = 0;

    @ObfuscatedName("client.oi")
    public static int field979 = 0;

    @ObfuscatedName("client.ob")
    public static int field1058 = 255;

    @ObfuscatedName("client.od")
    public static int field903 = -1;

    @ObfuscatedName("client.on")
    public static boolean field1060 = false;

    @ObfuscatedName("client.ok")
    public static int field1059 = 127;

    @ObfuscatedName("client.og")
    public static int field879 = 127;

    @ObfuscatedName("client.oy")
    public static int field1063 = 0;

    @ObfuscatedName("client.ol")
    public static int[] field1064 = new int[50];

    @ObfuscatedName("client.oz")
    public static int[] field1065 = new int[50];

    @ObfuscatedName("client.ov")
    public static int[] field1089 = new int[50];

    @ObfuscatedName("client.os")
    public static int[] field1067 = new int[50];

    @ObfuscatedName("client.op")
    public static class105[] field1068 = new class105[50];

    @ObfuscatedName("client.oa")
    public static boolean field1069 = false;

    @ObfuscatedName("client.pc")
    public static boolean[] field1070 = new boolean[5];

    @ObfuscatedName("client.pu")
    public static int[] field999 = new int[5];

    @ObfuscatedName("client.pi")
    public static int[] field933 = new int[5];

    @ObfuscatedName("client.px")
    public static int[] field1073 = new int[5];

    @ObfuscatedName("client.pv")
    public static int[] field1074 = new int[5];

    @ObfuscatedName("client.pg")
    public static short field1083 = 256;

    @ObfuscatedName("client.pr")
    public static short field1076 = 205;

    @ObfuscatedName("client.pt")
    public static short field1077 = 256;

    @ObfuscatedName("client.pn")
    public static short field963 = 320;

    @ObfuscatedName("client.pl")
    public static short field1079 = 1;

    @ObfuscatedName("client.pa")
    public static short field939 = 32767;

    @ObfuscatedName("client.ph")
    public static short field983 = 1;

    @ObfuscatedName("client.pq")
    public static short field1082 = 32767;

    @ObfuscatedName("client.ps")
    public static int field952 = 0;

    @ObfuscatedName("client.pm")
    public static int field1048 = 0;

    @ObfuscatedName("client.pd")
    public static int field1085 = 0;

    @ObfuscatedName("client.pf")
    public static int field1086 = 0;

    @ObfuscatedName("client.pp")
    public static int field1087 = 0;

    @ObfuscatedName("client.pw")
    public static class225 field1088 = new class225();

    @ObfuscatedName("client.pz")
    public static int field851 = -1;

    @ObfuscatedName("client.py")
    public static int field1090 = -1;

    @ObfuscatedName("client.qg")
    public static class17[] field870 = new class17[8];

    @ObfuscatedName("client.qh")
    public static class73 field1075 = new class73();

    @ObfuscatedName("client.ql")
    public static ArrayList field1093 = new ArrayList(10);

    @ObfuscatedName("client.qq")
    public static int field992 = 0;

    @ObfuscatedName("client.qj")
    public static final class71 field1095 = new class71();

    @ObfuscatedName("client.qz")
    public static int[] field1096 = new int[50];

    @ObfuscatedName("client.qd")
    public static int[] field1097 = new int[50];

    @ObfuscatedName("ax.ee(B)Llr;")
    public static class313 method312() {
        return Statics.field2449;
    }

    @ObfuscatedName("client.au(I)V")
    public final void method749() {
    }

    public final void init() {
        if (!this.method728()) {
            return;
        }
        class299[] var1 = class299.method942();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class299 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3842);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3842)) {
                    case 1:
                        field842 = Integer.parseInt(var4);
                    case 2:
                    case 3:
                    default:
                        break;
                    case 4:
                        Statics.field2192 = var4;
                        break;
                    case 5:
                        field846 = Integer.parseInt(var4);
                        break;
                    case 6:
                        if (var4.equalsIgnoreCase(class86.field1287)) {
                            field958 = true;
                        } else {
                            field958 = false;
                        }
                        break;
                    case 7:
                        class244[] var5 = new class244[] { class244.field3283, class244.field3290, class244.field3284, class244.field3288, class244.field3289, class244.field3285 };
                        Statics.field1554 = (class244) class180.method1823(var5, Integer.parseInt(var4));
                        if (Statics.field1554 == class244.field3283) {
                            Statics.field2740 = class314.field3967;
                        } else {
                            Statics.field2740 = class314.field3975;
                        }
                        break;
                    case 8:
                        Statics.field31 = Integer.parseInt(var4);
                        break;
                    case 9:
                        field841 = Integer.parseInt(var4);
                        break;
                    case 10:
                        Statics.field3503 = Integer.parseInt(var4);
                        break;
                    case 11:
                        field1016 = Integer.parseInt(var4);
                        break;
                    case 12:
                        field1055 = Integer.parseInt(var4) != 0;
                        break;
                    case 13:
                        if (var4.equalsIgnoreCase(class86.field1287)) {
                        }
                        break;
                    case 14:
                        Statics.field707 = class243.method531(Integer.parseInt(var4));
                        break;
                    case 15:
                        Statics.field847 = var4;
                }
            }
        }
        method310();
        Statics.field2117 = this.getCodeBase().getHost();
        String var6 = Statics.field707.field3276;
        byte var7 = 0;
        try {
            class158.method3209("oldschool", var6, var7, 17);
        } catch (Exception var9) {
            class155.method73((String) null, var9);
        }
        Statics.field2445 = this;
        this.method806(765, 503, 163);
    }

    @ObfuscatedName("as.et(I)V")
    public static final void method310() {
        class137.field1986 = false;
        field991 = false;
    }

    @ObfuscatedName("client.ab(I)V")
    public final void method766() {
        class186.method3130(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field491 = field1016 == 0 ? 43594 : field841 + 40000;
        Statics.field2019 = field1016 == 0 ? 443 : field841 + 50000;
        Statics.field545 = Statics.field491;
        Statics.field2723 = class226.field2736;
        Statics.field238 = class226.field2733;
        Statics.field450 = class226.field2738;
        Statics.field2729 = class226.field2735;
        Statics.field1270 = new class147();
        this.method755();
        this.method721();
        Statics.field449 = this.method847();
        Statics.field1795 = new class165(255, class158.field2151, class158.field2152, 500000);
        Statics.field263 = class78.method640();
        this.method765();
        String var2 = Statics.field1274;
        class57.field640 = this;
        if (var2 != null) {
            class57.field639 = var2;
        }
        if (field1016 != 0) {
            field989 = true;
        }
        method4980(Statics.field263.field1202);
        Statics.field473 = new class79(Statics.field2740);
    }

    @ObfuscatedName("client.am(B)V")
    public final void method740() {
        field1036++;
        this.method1088();
        class248.method3497();
        class215.method3499();
        method3498();
        class51 var1 = class51.field620;
        synchronized (class51.field620) {
            class51.field601++;
            class51.field623 = class51.field619;
            class51.field608 = 0;
            if (class51.field615 >= 0) {
                while (class51.field615 != class51.field611) {
                    int var3 = class51.field610[class51.field611];
                    class51.field611 = class51.field611 + 1 & 0x7F;
                    if (var3 < 0) {
                        class51.field618[~var3] = false;
                    } else {
                        if (!class51.field618[var3] && class51.field608 < class51.field616.length - 1) {
                            class51.field616[++class51.field608 - 1] = var3;
                        }
                        class51.field618[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class51.field618[var2] = false;
                }
                class51.field615 = class51.field611;
            }
            if (class51.field608 > 0) {
                class51.field601 = 0;
            }
            class51.field619 = class51.field592;
        }
        class60 var5 = class60.field685;
        synchronized (class60.field685) {
            class60.field690 = class60.field687;
            class60.field691 = class60.field683;
            class60.field692 = class60.field689;
            class60.field697 = class60.field693;
            class60.field698 = class60.field702;
            class60.field701 = class60.field695;
            class60.field700 = class60.field696;
            class60.field693 = 0;
        }
        if (Statics.field449 != null) {
            int var7 = Statics.field449.method615();
            field1023 = var7;
        }
        if (field848 == 0) {
            method5136();
            Statics.field492.method2956();
            for (int var8 = 0; var8 < 32; var8++) {
                field676[var8] = 0L;
            }
            for (int var9 = 0; var9 < 32; var9++) {
                field677[var9] = 0L;
            }
            Statics.field653 = 0;
        } else if (field848 == 5) {
            class90.method3136(this);
            method5136();
            Statics.field492.method2956();
            for (int var10 = 0; var10 < 32; var10++) {
                field676[var10] = 0L;
            }
            for (int var11 = 0; var11 < 32; var11++) {
                field677[var11] = 0L;
            }
            Statics.field653 = 0;
        } else if (field848 == 10 || field848 == 11) {
            class90.method3136(this);
        } else if (field848 == 20) {
            class90.method3136(this);
            this.method1091();
        } else if (field848 == 25) {
            method4164(false);
            field891 = 0;
            boolean var12 = true;
            for (int var13 = 0; var13 < Statics.field14.length; var13++) {
                if (Statics.field577[var13] != -1 && Statics.field14[var13] == null) {
                    Statics.field14[var13] = Statics.field872.method4231(Statics.field577[var13], 0);
                    if (Statics.field14[var13] == null) {
                        var12 = false;
                        field891++;
                    }
                }
                if (Statics.field1279[var13] != -1 && Statics.field572[var13] == null) {
                    Statics.field572[var13] = Statics.field872.method4185(Statics.field1279[var13], 0, Statics.field1098[var13]);
                    if (Statics.field572[var13] == null) {
                        var12 = false;
                        field891++;
                    }
                }
            }
            if (var12) {
                field893 = 0;
                boolean var14 = true;
                for (int var15 = 0; var15 < Statics.field14.length; var15++) {
                    byte[] var16 = Statics.field572[var15];
                    if (var16 != null) {
                        int var17 = (Statics.field1386[var15] >> 8) * 64 - Statics.field3737;
                        int var18 = (Statics.field1386[var15] & 0xFF) * 64 - Statics.field435;
                        if (field985) {
                            var17 = 10;
                            var18 = 10;
                        }
                        boolean var20 = true;
                        class185 var21 = new class185(var16);
                        int var22 = -1;
                        label611: while (true) {
                            int var23 = var21.method3253();
                            if (var23 == 0) {
                                var14 &= var20;
                                break;
                            }
                            var22 += var23;
                            int var24 = 0;
                            boolean var25 = false;
                            while (true) {
                                while (!var25) {
                                    int var27 = var21.method3253();
                                    if (var27 == 0) {
                                        continue label611;
                                    }
                                    var24 += var27 - 1;
                                    int var28 = var24 & 0x3F;
                                    int var29 = var24 >> 6 & 0x3F;
                                    int var30 = var21.method3239() >> 2;
                                    int var31 = var17 + var29;
                                    int var32 = var18 + var28;
                                    if (var31 > 0 && var32 > 0 && var31 < 103 && var32 < 103) {
                                        class267 var33 = class267.method4025(var22);
                                        if (var30 != 22 || !field991 || var33.field3548 != 0 || var33.field3535 == 1 || var33.field3556) {
                                            if (!var33.method4591()) {
                                                field893++;
                                                var20 = false;
                                            }
                                            var25 = true;
                                        }
                                    }
                                }
                                int var26 = var21.method3253();
                                if (var26 == 0) {
                                    break;
                                }
                                var21.method3239();
                            }
                        }
                    }
                }
                if (var14) {
                    if (field895 != 0) {
                        method38(class237.field3184 + class86.field1285 + class86.field1288 + 100 + "%" + class86.field1289, true);
                    }
                    method3498();
                    method4602();
                    method3498();
                    Statics.field291.method2907();
                    method3498();
                    System.gc();
                    for (int var35 = 0; var35 < 4; var35++) {
                        field896[var35].method3084();
                    }
                    for (int var36 = 0; var36 < 4; var36++) {
                        for (int var37 = 0; var37 < 104; var37++) {
                            for (int var38 = 0; var38 < 104; var38++) {
                                class63.field723[var36][var37][var38] = 0;
                            }
                        }
                    }
                    method3498();
                    class63.method4538();
                    int var39 = Statics.field14.length;
                    for (class80 var40 = (class80) class80.field1234.method3752(); var40 != null; var40 = (class80) class80.field1234.method3762()) {
                        if (var40.field1232 != null) {
                            Statics.field451.method1980(var40.field1232);
                            var40.field1232 = null;
                        }
                        if (var40.field1221 != null) {
                            Statics.field451.method1980(var40.field1221);
                            var40.field1221 = null;
                        }
                    }
                    class80.field1234.method3746();
                    method4164(true);
                    if (!field985) {
                        for (int var41 = 0; var41 < var39; var41++) {
                            int var42 = (Statics.field1386[var41] >> 8) * 64 - Statics.field3737;
                            int var43 = (Statics.field1386[var41] & 0xFF) * 64 - Statics.field435;
                            byte[] var44 = Statics.field14[var41];
                            if (var44 != null) {
                                method3498();
                                class63.method2618(var44, var42, var43, Statics.field799 * 8 - 48, Statics.field1441 * 8 - 48, field896);
                            }
                        }
                        for (int var45 = 0; var45 < var39; var45++) {
                            int var46 = (Statics.field1386[var45] >> 8) * 64 - Statics.field3737;
                            int var47 = (Statics.field1386[var45] & 0xFF) * 64 - Statics.field435;
                            byte[] var48 = Statics.field14[var45];
                            if (var48 == null && Statics.field1441 < 800) {
                                method3498();
                                class63.method522(var46, var47, 64, 64);
                            }
                        }
                        method4164(true);
                        for (int var49 = 0; var49 < var39; var49++) {
                            byte[] var50 = Statics.field572[var49];
                            if (var50 != null) {
                                int var51 = (Statics.field1386[var49] >> 8) * 64 - Statics.field3737;
                                int var52 = (Statics.field1386[var49] & 0xFF) * 64 - Statics.field435;
                                method3498();
                                class137 var53 = Statics.field291;
                                class167[] var54 = field896;
                                class185 var55 = new class185(var50);
                                int var56 = -1;
                                while (true) {
                                    int var57 = var55.method3253();
                                    if (var57 == 0) {
                                        break;
                                    }
                                    var56 += var57;
                                    int var58 = 0;
                                    while (true) {
                                        int var59 = var55.method3253();
                                        if (var59 == 0) {
                                            break;
                                        }
                                        var58 += var59 - 1;
                                        int var60 = var58 & 0x3F;
                                        int var61 = var58 >> 6 & 0x3F;
                                        int var62 = var58 >> 12;
                                        int var63 = var55.method3239();
                                        int var64 = var63 >> 2;
                                        int var65 = var63 & 0x3;
                                        int var66 = var51 + var61;
                                        int var67 = var52 + var60;
                                        if (var66 > 0 && var67 > 0 && var66 < 103 && var67 < 103) {
                                            int var68 = var62;
                                            if ((class63.field723[1][var66][var67] & 0x2) == 2) {
                                                var68 = var62 - 1;
                                            }
                                            class167 var69 = null;
                                            if (var68 >= 0) {
                                                var69 = var54[var68];
                                            }
                                            class63.method1047(var62, var66, var67, var56, var65, var64, var53, var69);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (field985) {
                        int var70 = 0;
                        label510: while (true) {
                            if (var70 >= 4) {
                                for (int var110 = 0; var110 < 13; var110++) {
                                    for (int var111 = 0; var111 < 13; var111++) {
                                        int var112 = field898[0][var110][var111];
                                        if (var112 == -1) {
                                            class63.method522(var110 * 8, var111 * 8, 8, 8);
                                        }
                                    }
                                }
                                method4164(true);
                                int var113 = 0;
                                while (true) {
                                    if (var113 >= 4) {
                                        break label510;
                                    }
                                    method3498();
                                    for (int var114 = 0; var114 < 13; var114++) {
                                        for (int var115 = 0; var115 < 13; var115++) {
                                            int var116 = field898[var113][var114][var115];
                                            if (var116 != -1) {
                                                int var117 = var116 >> 24 & 0x3;
                                                int var118 = var116 >> 1 & 0x3;
                                                int var119 = var116 >> 14 & 0x3FF;
                                                int var120 = var116 >> 3 & 0x7FF;
                                                int var121 = (var119 / 8 << 8) + var120 / 8;
                                                for (int var122 = 0; var122 < Statics.field1386.length; var122++) {
                                                    if (Statics.field1386[var122] == var121 && Statics.field572[var122] != null) {
                                                        class63.method3588(Statics.field572[var122], var113, var114 * 8, var115 * 8, var117, (var119 & 0x7) * 8, (var120 & 0x7) * 8, var118, Statics.field291, field896);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var113++;
                                }
                            }
                            method3498();
                            for (int var71 = 0; var71 < 13; var71++) {
                                for (int var72 = 0; var72 < 13; var72++) {
                                    boolean var73 = false;
                                    int var74 = field898[var70][var71][var72];
                                    if (var74 != -1) {
                                        int var75 = var74 >> 24 & 0x3;
                                        int var76 = var74 >> 1 & 0x3;
                                        int var77 = var74 >> 14 & 0x3FF;
                                        int var78 = var74 >> 3 & 0x7FF;
                                        int var79 = (var77 / 8 << 8) + var78 / 8;
                                        for (int var80 = 0; var80 < Statics.field1386.length; var80++) {
                                            if (Statics.field1386[var80] == var79 && Statics.field14[var80] != null) {
                                                byte[] var81 = Statics.field14[var80];
                                                int var82 = var71 * 8;
                                                int var83 = var72 * 8;
                                                int var84 = (var77 & 0x7) * 8;
                                                int var85 = (var78 & 0x7) * 8;
                                                class167[] var86 = field896;
                                                for (int var87 = 0; var87 < 8; var87++) {
                                                    for (int var88 = 0; var88 < 8; var88++) {
                                                        if (var82 + var87 > 0 && var82 + var87 < 103 && var83 + var88 > 0 && var83 + var88 < 103) {
                                                            var86[var70].field2210[var82 + var87][var83 + var88] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class185 var89 = new class185(var81);
                                                for (int var90 = 0; var90 < 4; var90++) {
                                                    for (int var91 = 0; var91 < 64; var91++) {
                                                        for (int var92 = 0; var92 < 64; var92++) {
                                                            if (var75 == var90 && var91 >= var84 && var91 < var84 + 8 && var92 >= var85 && var92 < var85 + 8) {
                                                                int var96 = var91 & 0x7;
                                                                int var97 = var92 & 0x7;
                                                                int var99 = var76 & 0x3;
                                                                int var100;
                                                                if (var99 == 0) {
                                                                    var100 = var96;
                                                                } else if (var99 == 1) {
                                                                    var100 = var97;
                                                                } else if (var99 == 2) {
                                                                    var100 = 7 - var96;
                                                                } else {
                                                                    var100 = 7 - var97;
                                                                }
                                                                int var103 = var82 + var100;
                                                                int var105 = var91 & 0x7;
                                                                int var106 = var92 & 0x7;
                                                                int var108 = var76 & 0x3;
                                                                int var109;
                                                                if (var108 == 0) {
                                                                    var109 = var106;
                                                                } else if (var108 == 1) {
                                                                    var109 = 7 - var105;
                                                                } else if (var108 == 2) {
                                                                    var109 = 7 - var106;
                                                                } else {
                                                                    var109 = var105;
                                                                }
                                                                class63.method2707(var89, var70, var103, var83 + var109, 0, 0, var76);
                                                            } else {
                                                                class63.method2707(var89, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var73 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var73) {
                                        class63.method455(var70, var71 * 8, var72 * 8);
                                    }
                                }
                            }
                            var70++;
                        }
                    }
                    method4164(true);
                    method4602();
                    method3498();
                    class63.method114(Statics.field291, field896);
                    method4164(true);
                    int var123 = class63.field737;
                    if (var123 > Statics.field706) {
                        var123 = Statics.field706;
                    }
                    if (var123 < Statics.field706 - 1) {
                        int var124 = Statics.field706 - 1;
                    }
                    if (field991) {
                        Statics.field291.method2713(class63.field737);
                    } else {
                        Statics.field291.method2713(0);
                    }
                    for (int var125 = 0; var125 < 104; var125++) {
                        for (int var126 = 0; var126 < 104; var126++) {
                            method95(var125, var126);
                        }
                    }
                    method3498();
                    for (class74 var127 = (class74) field990.method3752(); var127 != null; var127 = (class74) field990.method3762()) {
                        if (var127.field1111 == -1) {
                            var127.field1110 = 0;
                            method1477(var127);
                        } else {
                            var127.method3740();
                        }
                    }
                    class267.field3521.method3674();
                    if (Statics.field2445.method748()) {
                        class175 var128 = class175.method1891(class172.field2367, field938.field1455);
                        var128.field2440.method3242(1057001181);
                        field938.method1907(var128);
                    }
                    if (!field985) {
                        int var129 = (Statics.field799 - 6) / 8;
                        int var130 = (Statics.field799 + 6) / 8;
                        int var131 = (Statics.field1441 - 6) / 8;
                        int var132 = (Statics.field1441 + 6) / 8;
                        for (int var133 = var129 - 1; var133 <= var130 + 1; var133++) {
                            for (int var134 = var131 - 1; var134 <= var132 + 1; var134++) {
                                if (var133 < var129 || var133 > var130 || var134 < var131 || var134 > var132) {
                                    Statics.field872.method4261("m" + var133 + "_" + var134);
                                    Statics.field872.method4261("l" + var133 + "_" + var134);
                                }
                            }
                        }
                    }
                    method1754(30);
                    method3498();
                    Statics.method967();
                    class175 var135 = class175.method1891(class172.field2410, field938.field1455);
                    field938.method1907(var135);
                    Statics.field492.method2956();
                    for (int var136 = 0; var136 < 32; var136++) {
                        field676[var136] = 0L;
                    }
                    for (int var137 = 0; var137 < 32; var137++) {
                        field677[var137] = 0L;
                    }
                    Statics.field653 = 0;
                } else {
                    field895 = 2;
                }
            } else {
                field895 = 1;
            }
        }
        if (field848 == 30) {
            this.method1272();
        } else if (field848 == 40 || field848 == 45) {
            this.method1091();
        }
    }

    @ObfuscatedName("client.ah(ZI)V")
    public final void method752(boolean arg0) {
        boolean var2;
        label140: {
            try {
                if (class215.field2618 == 2) {
                    if (Statics.field638 == null) {
                        Statics.field638 = class221.method4033(Statics.field2615, Statics.field3799, Statics.field343);
                        if (Statics.field638 == null) {
                            var2 = false;
                            break label140;
                        }
                    }
                    if (Statics.field2233 == null) {
                        Statics.field2233 = new class112(Statics.field2620, Statics.field2616);
                    }
                    if (Statics.field357.method3855(Statics.field638, Statics.field2619, Statics.field2233, 22050)) {
                        Statics.field357.method3895();
                        Statics.field357.method3853(Statics.field2193);
                        Statics.field357.method3858(Statics.field638, Statics.field447);
                        class215.field2618 = 0;
                        Statics.field638 = null;
                        Statics.field2233 = null;
                        Statics.field2615 = null;
                        var2 = true;
                        break label140;
                    }
                }
            } catch (Exception var10) {
                var10.printStackTrace();
                Statics.field357.method3859();
                class215.field2618 = 0;
                Statics.field638 = null;
                Statics.field2233 = null;
                Statics.field2615 = null;
            }
            var2 = false;
        }
        if (var2 && field1060 && Statics.field237 != null) {
            Statics.field237.method2127();
        }
        if ((field848 == 10 || field848 == 20 || field848 == 30) && field1038 != 0L && class187.method2705() > field1038) {
            method4980(method39());
        }
        if (arg0) {
            for (int var5 = 0; var5 < 100; var5++) {
                field1030[var5] = true;
            }
        }
        if (field848 == 0) {
            this.method774(class90.field1334, class90.field1335, arg0);
        } else if (field848 == 5) {
            class90.method4177(Statics.field3322, Statics.field12, Statics.field1668, arg0);
        } else if (field848 == 10 || field848 == 11) {
            class90.method4177(Statics.field3322, Statics.field12, Statics.field1668, arg0);
        } else if (field848 == 20) {
            class90.method4177(Statics.field3322, Statics.field12, Statics.field1668, arg0);
        } else if (field848 == 25) {
            if (field895 == 1) {
                if (field891 > field892) {
                    field892 = field891;
                }
                int var6 = (field892 * 50 - field891 * 50) / field892;
                method38(class237.field3184 + class86.field1285 + class86.field1288 + var6 + "%" + class86.field1289, false);
            } else if (field895 == 2) {
                if (field893 > field894) {
                    field894 = field893;
                }
                int var7 = (field894 * 50 - field893 * 50) / field894 + 50;
                method38(class237.field3184 + class86.field1285 + class86.field1288 + var7 + "%" + class86.field1289, false);
            } else {
                method38(class237.field3184, false);
            }
        } else if (field848 == 30) {
            this.method1095();
        } else if (field848 == 40) {
            method38(class237.field3151 + class86.field1285 + class237.field2964, false);
        } else if (field848 == 45) {
            method38(class237.field3110, false);
        }
        if (field848 == 30 && field1037 == 0 && !arg0 && !field969) {
            for (int var8 = 0; var8 < field850; var8++) {
                if (field907[var8]) {
                    Statics.field336.method697(field1033[var8], field1034[var8], field956[var8], field964[var8]);
                    field907[var8] = false;
                }
            }
        } else if (field848 > 0) {
            Statics.field336.method698(0, 0);
            for (int var9 = 0; var9 < field850; var9++) {
                field907[var9] = false;
            }
        }
    }

    @ObfuscatedName("client.ag(B)V")
    public final void method844() {
        if (Statics.field470.method1844()) {
            Statics.field470.method1841();
        }
        if (Statics.field532 != null) {
            Statics.field532.field793 = false;
        }
        Statics.field532 = null;
        field938.method1909();
        if (class51.field620 != null) {
            class51 var1 = class51.field620;
            synchronized (class51.field620) {
                class51.field620 = null;
            }
        }
        class60.method608();
        Statics.field449 = null;
        if (Statics.field237 != null) {
            Statics.field237.method2124();
        }
        if (Statics.field3488 != null) {
            Statics.field3488.method2124();
        }
        class250.method2706();
        class248.method100();
        if (Statics.field1270 != null) {
            Statics.field1270.method2937();
            Statics.field1270 = null;
        }
        class158.method4004();
    }

    @ObfuscatedName("cn.eb(II)V")
    public static void method1754(int arg0) {
        if (field848 == arg0) {
            return;
        }
        if (field848 == 0) {
            Statics.field2445.method744();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field874 = 0;
            field875 = 0;
            field876 = 0;
            field889.method5155(arg0);
            if (arg0 != 20) {
                method2916(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2162 != null) {
            Statics.field2162.method3022();
            Statics.field2162 = null;
        }
        if (field848 == 25) {
            field895 = 0;
            field891 = 0;
            field892 = 1;
            field893 = 0;
            field894 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class90.method968(Statics.field752, Statics.field485, true, 0);
        } else if (arg0 == 20) {
            class90.method968(Statics.field752, Statics.field485, true, field848 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class90.method968(Statics.field752, Statics.field485, false, 4);
        } else if (Statics.field1330) {
            Statics.field2532 = null;
            Statics.field1320 = null;
            Statics.field1321 = null;
            Statics.field308 = null;
            Statics.field484 = null;
            Statics.field1999 = null;
            Statics.field475 = null;
            Statics.field351 = null;
            Statics.field1322 = null;
            Statics.field1292 = null;
            Statics.field1352 = null;
            Statics.field1353 = null;
            Statics.field2714 = null;
            Statics.field1890 = null;
            Statics.field624 = null;
            Statics.field1327 = null;
            Statics.field1252 = null;
            Statics.field30 = null;
            Statics.field548 = null;
            Statics.field835 = null;
            Statics.field839 = null;
            Statics.field425 = null;
            class215.method127(2);
            class250.method3047(true);
            Statics.field1330 = false;
        }
        field848 = arg0;
    }

    @ObfuscatedName("client.ed(S)V")
    public void method1088() {
        if (field848 != 1000) {
            boolean var1 = class250.method2910();
            if (!var1) {
                this.method1181();
            }
        }
    }

    @ObfuscatedName("client.fy(B)V")
    public void method1181() {
        if (class250.field3355 >= 4) {
            this.method745("js5crc");
            field848 = 1000;
            return;
        }
        if (class250.field3356 >= 4) {
            if (field848 <= 5) {
                this.method745("js5io");
                field848 = 1000;
                return;
            }
            field1019 = 3000;
            class250.field3356 = 3;
        }
        if (--field1019 + 1 > 0) {
            return;
        }
        try {
            if (field869 == 0) {
                Statics.field1389 = Statics.field669.method2991(Statics.field2117, Statics.field545);
                field869++;
            }
            if (field869 == 1) {
                if (Statics.field1389.field2128 == 2) {
                    this.method1090(-1);
                    return;
                }
                if (Statics.field1389.field2128 == 1) {
                    field869++;
                }
            }
            if (field869 == 2) {
                if (field1055) {
                    Socket var1 = (Socket) Statics.field1389.field2130;
                    class162 var2 = new class162(var1, 40000, 5000);
                    Statics.field2719 = var2;
                } else {
                    Statics.field2719 = new class164((Socket) Statics.field1389.field2130, Statics.field669, 5000);
                }
                class185 var3 = new class185(5);
                var3.method3223(15);
                var3.method3242(163);
                Statics.field2719.method3029(var3.field2512, 0, 5);
                field869++;
                Statics.field871 = class187.method2705();
            }
            if (field869 == 3) {
                if (Statics.field2719.method3019() > 0 || !field1055 && field848 <= 5) {
                    int var4 = Statics.field2719.method3024();
                    if (var4 != 0) {
                        this.method1090(var4);
                        return;
                    }
                    field869++;
                } else if (class187.method2705() - Statics.field871 > 30000L) {
                    this.method1090(-2);
                    return;
                }
            }
            if (field869 == 4) {
                class160 var5 = Statics.field2719;
                boolean var6 = field848 > 20;
                if (Statics.field319 != null) {
                    try {
                        Statics.field319.method3022();
                    } catch (Exception var16) {
                    }
                    Statics.field319 = null;
                }
                Statics.field319 = var5;
                class250.method3047(var6);
                class250.field3349.field2514 = 0;
                Statics.field1886 = null;
                Statics.field3350 = null;
                class250.field3339 = 0;
                while (true) {
                    class246 var8 = (class246) class250.field3342.method3693();
                    if (var8 == null) {
                        while (true) {
                            class246 var9 = (class246) class250.field3347.method3693();
                            if (var9 == null) {
                                if (class250.field3354 != 0) {
                                    try {
                                        class185 var10 = new class185(4);
                                        var10.method3223(4);
                                        var10.method3223(class250.field3354);
                                        var10.method3403(0);
                                        Statics.field319.method3029(var10.field2512, 0, 4);
                                    } catch (IOException var15) {
                                        try {
                                            Statics.field319.method3022();
                                        } catch (Exception var14) {
                                        }
                                        class250.field3356++;
                                        Statics.field319 = null;
                                    }
                                }
                                class250.field3343 = 0;
                                Statics.field3338 = class187.method2705();
                                Statics.field1389 = null;
                                Statics.field2719 = null;
                                field869 = 0;
                                field873 = 0;
                                return;
                            }
                            class250.field3346.method3639(var9);
                            class250.field3353.method3691(var9, var9.field2585);
                            class250.field3351++;
                            class250.field3341--;
                        }
                    }
                    class250.field3340.method3691(var8, var8.field2585);
                    class250.field3344++;
                    class250.field3345--;
                }
            }
        } catch (IOException var17) {
            this.method1090(-3);
        }
    }

    @ObfuscatedName("client.fn(II)V")
    public void method1090(int arg0) {
        Statics.field1389 = null;
        Statics.field2719 = null;
        field869 = 0;
        if (Statics.field545 == Statics.field491) {
            Statics.field545 = Statics.field2019;
        } else {
            Statics.field545 = Statics.field491;
        }
        field873++;
        if (field873 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field848 <= 5) {
                this.method745("js5connect_full");
                field848 = 1000;
            } else {
                field1019 = 3000;
            }
        } else if (field873 >= 2 && arg0 == 6) {
            this.method745("js5connect_outofdate");
            field848 = 1000;
        } else if (field873 >= 4) {
            if (field848 <= 5) {
                this.method745("js5connect");
                field848 = 1000;
            } else {
                field1019 = 3000;
            }
        }
    }

    @ObfuscatedName("x.fa(Lij;Ljava/lang/String;I)V")
    public static void method115(class249 arg0, String arg1) {
        class64 var2 = new class64(arg0, arg1);
        field1093.add(var2);
    }

    @ObfuscatedName("kg.ff(B)V")
    public static void method5136() {
        if (field868 == 0) {
            Statics.field291 = new class137(4, 104, 104, class63.field731);
            for (int var0 = 0; var0 < 4; var0++) {
                field896[var0] = new class167(104, 104);
            }
            Statics.field1577 = new class310(512, 512);
            class90.field1335 = class237.field2965;
            class90.field1334 = 5;
            field868 = 20;
        } else if (field868 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class134.field1918[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class137.method2849(var1, 500, 800, 512, 334);
            class90.field1335 = class237.field2966;
            class90.field1334 = 10;
            field868 = 30;
        } else if (field868 == 30) {
            Statics.field2116 = Statics.method1065(0, false, true, true);
            Statics.field232 = Statics.method1065(1, false, true, true);
            Statics.field2020 = Statics.method1065(2, true, false, true);
            Statics.field761 = Statics.method1065(3, false, true, true);
            Statics.field741 = Statics.method1065(4, false, true, true);
            Statics.field872 = Statics.method1065(5, true, true, true);
            Statics.field2914 = Statics.method1065(6, true, true, true);
            Statics.field588 = Statics.method1065(7, false, true, true);
            Statics.field485 = Statics.method1065(8, false, true, true);
            Statics.field2114 = Statics.method1065(9, false, true, true);
            Statics.field752 = Statics.method1065(10, false, true, true);
            Statics.field633 = Statics.method1065(11, false, true, true);
            Statics.field335 = Statics.method1065(12, false, true, true);
            Statics.field379 = Statics.method1065(13, true, false, true);
            Statics.field381 = Statics.method1065(14, false, true, true);
            Statics.field2525 = Statics.method1065(15, false, true, true);
            Statics.field3357 = Statics.method1065(16, false, true, true);
            class90.field1335 = class237.field2967;
            class90.field1334 = 20;
            field868 = 40;
        } else if (field868 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2116.method4280() * 4 / 100;
            int var8 = var7 + Statics.field232.method4280() * 4 / 100;
            int var9 = var8 + Statics.field2020.method4280() * 2 / 100;
            int var10 = var9 + Statics.field761.method4280() * 2 / 100;
            int var11 = var10 + Statics.field741.method4280() * 6 / 100;
            int var12 = var11 + Statics.field872.method4280() * 4 / 100;
            int var13 = var12 + Statics.field2914.method4280() * 2 / 100;
            int var14 = var13 + Statics.field588.method4280() * 58 / 100;
            int var15 = var14 + Statics.field485.method4280() * 2 / 100;
            int var16 = var15 + Statics.field2114.method4280() * 2 / 100;
            int var17 = var16 + Statics.field752.method4280() * 2 / 100;
            int var18 = var17 + Statics.field633.method4280() * 2 / 100;
            int var19 = var18 + Statics.field335.method4280() * 2 / 100;
            int var20 = var19 + Statics.field379.method4280() * 2 / 100;
            int var21 = var20 + Statics.field381.method4280() * 2 / 100;
            int var22 = var21 + Statics.field2525.method4280() * 2 / 100;
            int var23 = var22 + Statics.field3357.method4280() * 2 / 100;
            if (var23 == 100) {
                method115(Statics.field2116, "Animations");
                method115(Statics.field232, "Skeletons");
                method115(Statics.field741, "Sound FX");
                method115(Statics.field872, "Maps");
                method115(Statics.field2914, "Music Tracks");
                method115(Statics.field588, "Models");
                method115(Statics.field485, "Sprites");
                method115(Statics.field633, "Music Jingles");
                method115(Statics.field381, "Music Samples");
                method115(Statics.field2525, "Music Patches");
                method115(Statics.field3357, "World Map");
                class90.field1335 = class237.field3108;
                class90.field1334 = 30;
                field868 = 45;
            } else {
                if (var23 != 0) {
                    class90.field1335 = class237.field2968 + var23 + "%";
                }
                class90.field1334 = 30;
            }
        } else if (field868 == 45) {
            class109.method4013(22050, !field991, 2);
            class216 var24 = new class216();
            var24.method3861(9, 128);
            Statics.field237 = class109.method1753(Statics.field669, 0, 22050);
            Statics.field237.method2138(var24);
            class249 var25 = Statics.field2525;
            class249 var26 = Statics.field381;
            class249 var27 = Statics.field741;
            Statics.field2619 = var25;
            Statics.field2616 = var26;
            Statics.field2620 = var27;
            Statics.field357 = var24;
            Statics.field3488 = class109.method1753(Statics.field669, 1, 2048);
            Statics.field451 = new class102();
            Statics.field3488.method2138(Statics.field451);
            Statics.field3371 = new class116(22050, Statics.field1562);
            class90.field1335 = class237.field2970;
            class90.field1334 = 35;
            field868 = 50;
            Statics.field235 = new class286(Statics.field485, Statics.field379);
        } else if (field868 == 50) {
            int var28 = class285.method4982().length;
            field890 = Statics.field235.method4986(class285.method4982());
            if (field890.size() < var28) {
                class90.field1335 = class237.field2971 + field890.size() * 100 / var28 + "%";
                class90.field1334 = 40;
            } else {
                Statics.field12 = (class287) field890.get(class285.field3748);
                Statics.field1668 = (class287) field890.get(class285.field3749);
                Statics.field3322 = (class287) field890.get(class285.field3756);
                Statics.field750 = new class316(true);
                class90.field1335 = class237.field3118;
                class90.field1334 = 40;
                field868 = 60;
            }
        } else if (field868 == 60) {
            int var29 = class90.method1500(Statics.field752, Statics.field485);
            int var30 = class90.method1824();
            if (var29 < var30) {
                class90.field1335 = class237.field2973 + var29 * 100 / var30 + "%";
                class90.field1334 = 50;
            } else {
                class90.field1335 = class237.field3143;
                class90.field1334 = 50;
                method1754(5);
                field868 = 70;
            }
        } else if (field868 == 70) {
            if (Statics.field2020.method4189()) {
                class249 var31 = Statics.field2020;
                Statics.field3667 = var31;
                class249 var32 = Statics.field2020;
                Statics.field3426 = var32;
                class259.method4551(Statics.field2020, Statics.field588);
                class249 var33 = Statics.field2020;
                class249 var34 = Statics.field588;
                boolean var35 = field991;
                Statics.field3517 = var33;
                Statics.field3519 = var34;
                class267.field3547 = var35;
                class270.method648(Statics.field2020, Statics.field588);
                class264.method4249(Statics.field2020);
                class249 var36 = Statics.field2020;
                class249 var37 = Statics.field588;
                boolean var38 = field958;
                class287 var39 = Statics.field12;
                Statics.field3604 = var36;
                Statics.field2093 = var37;
                Statics.field472 = var38;
                Statics.field2950 = Statics.field3604.method4209(10);
                Statics.field794 = var39;
                class249 var40 = Statics.field2020;
                class249 var41 = Statics.field2116;
                class249 var42 = Statics.field232;
                Statics.field3691 = var40;
                Statics.field3678 = var41;
                Statics.field3679 = var42;
                class257.method52(Statics.field2020, Statics.field588);
                class249 var43 = Statics.field2020;
                Statics.field3461 = var43;
                class249 var44 = Statics.field2020;
                Statics.field290 = var44;
                Statics.field3374 = Statics.field290.method4209(16);
                class249 var45 = Statics.field761;
                class249 var46 = Statics.field588;
                class249 var47 = Statics.field485;
                class249 var48 = Statics.field379;
                Statics.field710 = var45;
                Statics.field2746 = var46;
                Statics.field2747 = var47;
                Statics.field2748 = var48;
                Statics.field713 = new class228[Statics.field710.method4197()][];
                Statics.field305 = new boolean[Statics.field710.method4197()];
                class252.method4163(Statics.field2020);
                class249 var49 = Statics.field2020;
                Statics.field3487 = var49;
                class255.method3220(Statics.field2020);
                class249 var50 = Statics.field2020;
                Statics.field3403 = var50;
                class249 var51 = Statics.field2020;
                Statics.field3469 = var51;
                Statics.field470 = new class94();
                class266.method50(Statics.field2020, Statics.field485, Statics.field379);
                class249 var52 = Statics.field2020;
                class249 var53 = Statics.field485;
                Statics.field3448 = var52;
                Statics.field3444 = var53;
                class254.method659(Statics.field2020, Statics.field485);
                class90.field1335 = class237.field2976;
                class90.field1334 = 60;
                field868 = 80;
            } else {
                class90.field1335 = class237.field2975 + Statics.field2020.method4293() + "%";
                class90.field1334 = 60;
            }
        } else if (field868 == 80) {
            int var54 = 0;
            if (Statics.field681 == null) {
                Statics.field681 = class311.method5124(Statics.field485, "compass", "");
            } else {
                var54++;
            }
            if (Statics.field386 == null) {
                Statics.field386 = class311.method5124(Statics.field485, "mapedge", "");
            } else {
                var54++;
            }
            if (Statics.field1331 == null) {
                Statics.field1331 = class311.method4160(Statics.field485, "mapscene", "");
            } else {
                var54++;
            }
            if (Statics.field982 == null) {
                Statics.field982 = class311.method459(Statics.field485, "headicons_pk", "");
            } else {
                var54++;
            }
            if (Statics.field749 == null) {
                Statics.field749 = class311.method459(Statics.field485, "headicons_prayer", "");
            } else {
                var54++;
            }
            if (Statics.field1584 == null) {
                Statics.field1584 = class311.method459(Statics.field485, "headicons_hint", "");
            } else {
                var54++;
            }
            if (Statics.field715 == null) {
                Statics.field715 = class311.method459(Statics.field485, "mapmarker", "");
            } else {
                var54++;
            }
            if (Statics.field3489 == null) {
                Statics.field3489 = class311.method459(Statics.field485, "cross", "");
            } else {
                var54++;
            }
            if (Statics.field770 == null) {
                Statics.field770 = class311.method459(Statics.field485, "mapdots", "");
            } else {
                var54++;
            }
            if (Statics.field468 == null) {
                Statics.field468 = class311.method4160(Statics.field485, "scrollbar", "");
            } else {
                var54++;
            }
            if (Statics.field1218 == null) {
                Statics.field1218 = class311.method4160(Statics.field485, "mod_icons", "");
            } else {
                var54++;
            }
            if (var54 < 11) {
                class90.field1335 = class237.field2977 + var54 * 100 / 12 + "%";
                class90.field1334 = 70;
            } else {
                Statics.field3770 = Statics.field1218;
                Statics.field386.method5304();
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1331[0].method5270(var55 + var58, var56 + var58, var57 + var58);
                class90.field1335 = class237.field2978;
                class90.field1334 = 70;
                field868 = 90;
            }
        } else if (field868 == 90) {
            if (Statics.field2114.method4189()) {
                Statics.field1472 = new class123(Statics.field2114, Statics.field485, 20, 0.8D, field991 ? 64 : 128);
                class134.method2629(Statics.field1472);
                class134.method2688(0.8D);
                field868 = 100;
            } else {
                class90.field1335 = class237.field2979 + "0%";
                class90.field1334 = 90;
            }
        } else if (field868 == 100) {
            int var59 = Statics.field1472.method2403();
            if (var59 < 100) {
                class90.field1335 = class237.field2979 + var59 + "%";
                class90.field1334 = 90;
            } else {
                class90.field1335 = class237.field2980;
                class90.field1334 = 90;
                field868 = 110;
            }
        } else if (field868 == 110) {
            Statics.field532 = new class69();
            Statics.field669.method2993(Statics.field532, 10);
            class90.field1335 = class237.field2981;
            class90.field1334 = 92;
            field868 = 120;
        } else if (field868 == 120) {
            if (Statics.field752.method4205("huffman", "")) {
                class177 var60 = new class177(Statics.field752.method4191("huffman", ""));
                class289.method3153(var60);
                class90.field1335 = class237.field2983;
                class90.field1334 = 94;
                field868 = 130;
            } else {
                class90.field1335 = class237.field2982 + "%";
                class90.field1334 = 94;
            }
        } else if (field868 == 130) {
            if (!Statics.field761.method4189()) {
                class90.field1335 = class237.field3155 + Statics.field761.method4293() * 4 / 5 + "%";
                class90.field1334 = 96;
            } else if (!Statics.field335.method4189()) {
                class90.field1335 = class237.field3155 + (80 + Statics.field335.method4293() / 6) + "%";
                class90.field1334 = 96;
            } else if (Statics.field379.method4189()) {
                class90.field1335 = class237.field2969;
                class90.field1334 = 98;
                field868 = 140;
            } else {
                class90.field1335 = class237.field3155 + (96 + Statics.field379.method4293() / 50) + "%";
                class90.field1334 = 96;
            }
        } else if (field868 == 140) {
            class90.field1334 = 100;
            if (Statics.field3357.method4206(class41.field522.field516)) {
                if (Statics.field2449 == null) {
                    Statics.field2449 = new class313();
                    Statics.field2449.method5429(Statics.field3357, Statics.field3322, field890, Statics.field1331);
                }
                int var61 = Statics.field2449.method5430();
                if (var61 < 100) {
                    class90.field1335 = class237.field2986 + (var61 * 9 / 10 + 10) + "%";
                } else {
                    class90.field1335 = class237.field2987;
                    field868 = 150;
                }
            } else {
                class90.field1335 = class237.field2986 + Statics.field3357.method4208(class41.field522.field516) / 10 + "%";
            }
        } else if (field868 == 150) {
            method1754(10);
        }
    }

    @ObfuscatedName("client.fk(I)V")
    public final void method1091() {
        class160 var1 = field938.method1911();
        class191 var2 = field938.field1454;
        try {
            if (field874 == 0) {
                if (var1 != null) {
                    var1.method3022();
                    var1 = null;
                }
                Statics.field455 = null;
                field887 = false;
                field875 = 0;
                field874 = 1;
            }
            if (field874 == 1) {
                if (Statics.field455 == null) {
                    Statics.field455 = Statics.field669.method2991(Statics.field2117, Statics.field545);
                }
                if (Statics.field455.field2128 == 2) {
                    throw new IOException();
                }
                if (Statics.field455.field2128 == 1) {
                    if (field1055) {
                        Socket var3 = (Socket) Statics.field455.field2130;
                        class162 var4 = new class162(var3, 40000, 5000);
                        var1 = var4;
                    } else {
                        var1 = new class164((Socket) Statics.field455.field2130, Statics.field669, 5000);
                    }
                    field938.method1923(var1);
                    Statics.field455 = null;
                    field874 = 2;
                }
            }
            if (field874 == 2) {
                field938.method1904();
                class175 var5;
                if (class175.field2442 == 0) {
                    var5 = new class175();
                } else {
                    var5 = class175.field2441[--class175.field2442];
                }
                var5.field2439 = null;
                var5.field2443 = 0;
                var5.field2440 = new class191(5000);
                var5.field2440.method3223(class173.field2423.field2422);
                field938.method1907(var5);
                field938.method1906();
                var2.field2514 = 0;
                field874 = 3;
            }
            if (field874 == 3) {
                if (Statics.field237 != null) {
                    Statics.field237.method2122();
                }
                if (Statics.field3488 != null) {
                    Statics.field3488.method2122();
                }
                boolean var9 = true;
                if (field1055 && !var1.method3018(1)) {
                    var9 = false;
                }
                if (var9) {
                    int var10 = var1.method3024();
                    if (Statics.field237 != null) {
                        Statics.field237.method2122();
                    }
                    if (Statics.field3488 != null) {
                        Statics.field3488.method2122();
                    }
                    if (var10 != 0) {
                        method235(var10);
                        return;
                    }
                    var2.field2514 = 0;
                    field874 = 4;
                }
            }
            if (field874 == 4) {
                if (var2.field2514 < 8) {
                    int var11 = var1.method3019();
                    if (var11 > 8 - var2.field2514) {
                        var11 = 8 - var2.field2514;
                    }
                    if (var11 > 0) {
                        var1.method3021(var2.field2512, var2.field2514, var11);
                        var2.field2514 += var11;
                    }
                }
                if (var2.field2514 == 8) {
                    var2.field2514 = 0;
                    Statics.field311 = var2.method3405();
                    field874 = 5;
                }
            }
            if (field874 == 5) {
                field938.field1454.field2514 = 0;
                field938.method1904();
                class191 var12 = new class191(500);
                int[] var13 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field311 >> 32), (int) (Statics.field311 & 0xFFFFFFFFFFFFFFFFL) };
                var12.field2514 = 0;
                var12.method3223(1);
                var12.method3223(field878.method10());
                var12.method3242(var13[0]);
                var12.method3242(var13[1]);
                var12.method3242(var13[2]);
                var12.method3242(var13[3]);
                switch(field878.field2083) {
                    case 0:
                    case 2:
                        var12.method3225(Statics.field688);
                        var12.field2514 += 5;
                        break;
                    case 1:
                        LinkedHashMap var15 = Statics.field263.field1198;
                        String var16 = class90.field1341;
                        int var17 = var16.length();
                        int var18 = 0;
                        for (int var19 = 0; var19 < var17; var19++) {
                            var18 = (var18 << 5) - var18 + var16.charAt(var19);
                        }
                        var12.method3242((Integer) var15.get(var18));
                        var12.field2514 += 4;
                        break;
                    case 3:
                        var12.field2514 += 8;
                }
                var12.method3230(class90.field1342);
                var12.method3261(class88.field1302, class88.field1307);
                class175 var21;
                if (class175.field2442 == 0) {
                    var21 = new class175();
                } else {
                    var21 = class175.field2441[--class175.field2442];
                }
                var21.field2439 = null;
                var21.field2443 = 0;
                var21.field2440 = new class191(5000);
                var21.field2440.field2514 = 0;
                if (field848 == 40) {
                    var21.field2440.method3223(class173.field2420.field2422);
                } else {
                    var21.field2440.method3223(class173.field2418.field2422);
                }
                var21.field2440.method3403(0);
                int var25 = var21.field2440.field2514;
                var21.field2440.method3242(163);
                var21.field2440.method3233(var12.field2512, 0, var12.field2514);
                int var26 = var21.field2440.field2514;
                var21.field2440.method3230(class90.field1341);
                var21.field2440.method3223((field969 ? 1 : 0) << 1 | (field991 ? 1 : 0));
                var21.field2440.method3403(Statics.field663);
                var21.field2440.method3403(Statics.field2191);
                class191 var27 = var21.field2440;
                if (field1007 == null) {
                    byte[] var28 = new byte[24];
                    try {
                        class158.field2143.method1935(0L);
                        class158.field2143.method1945(var28);
                        int var29;
                        for (var29 = 0; var29 < 24 && var28[var29] == 0; var29++) {
                        }
                        if (var29 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var64) {
                        for (int var31 = 0; var31 < 24; var31++) {
                            var28[var31] = -1;
                        }
                    }
                    var27.method3233(var28, 0, var28.length);
                } else {
                    var27.method3233(field1007, 0, field1007.length);
                }
                var21.field2440.method3230(Statics.field2192);
                var21.field2440.method3242(Statics.field3503);
                class185 var34 = new class185(Statics.field750.method5630());
                Statics.field750.method5629(var34);
                var21.field2440.method3233(var34.field2512, 0, var34.field2512.length);
                var21.field2440.method3223(Statics.field31);
                var21.field2440.method3242(0);
                var21.field2440.method3242(Statics.field2116.field3317);
                var21.field2440.method3242(Statics.field232.field3317);
                var21.field2440.method3242(Statics.field2020.field3317);
                var21.field2440.method3242(Statics.field761.field3317);
                var21.field2440.method3242(Statics.field741.field3317);
                var21.field2440.method3242(Statics.field872.field3317);
                var21.field2440.method3242(Statics.field2914.field3317);
                var21.field2440.method3242(Statics.field588.field3317);
                var21.field2440.method3242(Statics.field485.field3317);
                var21.field2440.method3242(Statics.field2114.field3317);
                var21.field2440.method3242(Statics.field752.field3317);
                var21.field2440.method3242(Statics.field633.field3317);
                var21.field2440.method3242(Statics.field335.field3317);
                var21.field2440.method3242(Statics.field379.field3317);
                var21.field2440.method3242(Statics.field381.field3317);
                var21.field2440.method3242(Statics.field2525.field3317);
                var21.field2440.method3242(Statics.field3357.field3317);
                var21.field2440.method3259(var13, var26, var21.field2440.field2514);
                var21.field2440.method3235(var21.field2440.field2514 - var25);
                field938.method1907(var21);
                field938.method1906();
                field938.field1455 = new class192(var13);
                for (int var35 = 0; var35 < 4; var35++) {
                    var13[var35] += 50;
                }
                var2.method3536(var13);
                field874 = 6;
            }
            if (field874 == 6 && var1.method3019() > 0) {
                int var36 = var1.method3024();
                if (var36 == 21 && field848 == 20) {
                    field874 = 7;
                } else if (var36 == 2) {
                    field874 = 9;
                } else if (var36 == 15 && field848 == 40) {
                    field938.field1452 = -1;
                    field874 = 13;
                } else if (var36 == 23 && field876 < 1) {
                    field876++;
                    field874 = 0;
                } else if (var36 == 29) {
                    field874 = 11;
                } else {
                    method235(var36);
                    return;
                }
            }
            if (field874 == 7 && var1.method3019() > 0) {
                field877 = (var1.method3024() + 3) * 60;
                field874 = 8;
            }
            if (field874 == 8) {
                field875 = 0;
                class90.method609(class237.field2991, class237.field2992, field877 / 60 + class237.field3046);
                if (--field877 <= 0) {
                    field874 = 0;
                }
            } else {
                if (field874 == 9 && var1.method3019() >= 13) {
                    boolean var37 = var1.method3024() == 1;
                    var1.method3021(var2.field2512, 0, 4);
                    var2.field2514 = 0;
                    boolean var38 = false;
                    if (var37) {
                        int var39 = var2.method3533() << 24;
                        int var40 = var39 | var2.method3533() << 16;
                        int var41 = var40 | var2.method3533() << 8;
                        int var42 = var41 | var2.method3533();
                        String var43 = class90.field1341;
                        int var44 = var43.length();
                        int var45 = 0;
                        int var46 = 0;
                        while (true) {
                            if (var46 >= var44) {
                                if (Statics.field263.field1198.size() >= 10 && !Statics.field263.field1198.containsKey(var45)) {
                                    Iterator var49 = Statics.field263.field1198.entrySet().iterator();
                                    var49.next();
                                    var49.remove();
                                }
                                Statics.field263.field1198.put(var45, var42);
                                break;
                            }
                            var45 = (var45 << 5) - var45 + var43.charAt(var46);
                            var46++;
                        }
                    }
                    if (class90.field1343) {
                        Statics.field263.field1205 = class90.field1341;
                    } else {
                        Statics.field263.field1205 = null;
                    }
                    class78.method1502();
                    field1084 = var1.method3024();
                    field858 = var1.method3024() == 1;
                    field946 = var1.method3024();
                    field946 <<= 0x8;
                    field946 += var1.method3024();
                    field947 = var1.method3024();
                    var1.method3021(var2.field2512, 0, 1);
                    var2.field2514 = 0;
                    class171[] var50 = class171.method3075();
                    int var51 = var2.method3559();
                    if (var51 < 0 || var51 >= var50.length) {
                        throw new IOException(var51 + " " + var2.field2514);
                    }
                    field938.field1451 = var50[var51];
                    field938.field1452 = field938.field1451.field2319;
                    var1.method3021(var2.field2512, 0, 2);
                    var2.field2514 = 0;
                    field938.field1452 = var2.method3241();
                    try {
                        client var52 = Statics.field2445;
                        JSObject.getWindow(var52).call("zap", (Object[]) null);
                    } catch (Throwable var63) {
                    }
                    field874 = 10;
                }
                if (field874 != 10) {
                    if (field874 == 11 && var1.method3019() >= 2) {
                        var2.field2514 = 0;
                        var1.method3021(var2.field2512, 0, 2);
                        var2.field2514 = 0;
                        Statics.field2453 = var2.method3241();
                        field874 = 12;
                    }
                    if (field874 == 12 && var1.method3019() >= Statics.field2453) {
                        var2.field2514 = 0;
                        var1.method3021(var2.field2512, 0, Statics.field2453);
                        var2.field2514 = 0;
                        String var54 = var2.method3248();
                        String var55 = var2.method3248();
                        String var56 = var2.method3248();
                        class90.method609(var54, var55, var56);
                        method1754(10);
                    }
                    if (field874 == 13) {
                        if (field938.field1452 == -1) {
                            if (var1.method3019() < 2) {
                                return;
                            }
                            var1.method3021(var2.field2512, 0, 2);
                            var2.field2514 = 0;
                            field938.field1452 = var2.method3241();
                        }
                        if (var1.method3019() >= field938.field1452) {
                            var1.method3021(var2.field2512, 0, field938.field1452);
                            var2.field2514 = 0;
                            int var57 = field938.field1452;
                            field889.method5146();
                            field938.method1904();
                            field938.field1454.field2514 = 0;
                            field938.field1451 = null;
                            field938.field1456 = null;
                            field938.field1447 = null;
                            field938.field1458 = null;
                            field938.field1452 = 0;
                            field938.field1457 = 0;
                            field995 = 0;
                            field885 = 0;
                            field1072 = false;
                            field979 = 0;
                            field984 = 0;
                            for (int var58 = 0; var58 < 2048; var58++) {
                                field945[var58] = null;
                            }
                            Statics.field1754 = null;
                            for (int var59 = 0; var59 < field880.length; var59++) {
                                class84 var60 = field880[var59];
                                if (var60 != null) {
                                    var60.field1156 = -1;
                                    var60.field1142 = false;
                                }
                            }
                            class65.field746 = new class202(32);
                            method1754(30);
                            for (int var61 = 0; var61 < 100; var61++) {
                                field1030[var61] = true;
                            }
                            method894();
                            class93.method82(var2);
                            if (var2.field2514 != var57) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field875++;
                        if (field875 > 2000) {
                            if (field876 < 1) {
                                if (Statics.field545 == Statics.field491) {
                                    Statics.field545 = Statics.field2019;
                                } else {
                                    Statics.field545 = Statics.field491;
                                }
                                field876++;
                                field874 = 0;
                            } else {
                                method235(-3);
                            }
                        }
                    }
                } else if (var1.method3019() >= field938.field1452) {
                    var2.field2514 = 0;
                    var1.method3021(var2.field2512, 0, field938.field1452);
                    field889.method5144();
                    method3142();
                    class93.method82(var2);
                    Statics.field799 = -1;
                    method168(false, var2);
                    field938.field1451 = null;
                }
            }
        } catch (IOException var65) {
            if (field876 < 1) {
                if (Statics.field545 == Statics.field491) {
                    Statics.field545 = Statics.field2019;
                } else {
                    Statics.field545 = Statics.field491;
                }
                field876++;
                field874 = 0;
            } else {
                method235(-2);
            }
        }
    }

    @ObfuscatedName("fq.fh(I)V")
    public static void method3142() {
        field843 = 1L;
        field854 = -1;
        Statics.field532.field788 = 0;
        Statics.field15 = true;
        field962 = true;
        field1049 = -1L;
        class305.field3870 = new class203();
        field938.method1904();
        field938.field1454.field2514 = 0;
        field938.field1451 = null;
        field938.field1456 = null;
        field938.field1447 = null;
        field938.field1458 = null;
        field938.field1452 = 0;
        field938.field1457 = 0;
        field995 = 0;
        field944 = 0;
        field1001 = 0;
        field885 = 0;
        field1072 = false;
        class60.method2190(0);
        class95.method1740();
        field978 = 0;
        field980 = false;
        field1063 = 0;
        field909 = 0;
        field979 = 0;
        field1050 = -1;
        field984 = 0;
        field1056 = 0;
        field866 = class89.field1310;
        field867 = class89.field1310;
        field881 = 0;
        class93.field1388 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class93.field1399[var0] = null;
            class93.field1391[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field945[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field880[var2] = null;
        }
        field954 = -1;
        field957.method3746();
        field924.method3746();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field955[var3][var4][var5] = null;
                }
            }
        }
        field990 = new class205();
        Statics.field473.method1626();
        for (int var6 = 0; var6 < Statics.field3374; var6++) {
            class253 var7 = class253.method3037(var6);
            if (var7 != null) {
                class223.field2711[var6] = 0;
                class223.field2713[var6] = 0;
            }
        }
        Statics.field470.method1838();
        field993 = -1;
        if (field859 != -1) {
            int var8 = field859;
            if (var8 != -1 && Statics.field305[var8]) {
                Statics.field710.method4198(var8);
                if (Statics.field713[var8] != null) {
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field713[var8].length; var10++) {
                        if (Statics.field713[var8][var10] != null) {
                            if (Statics.field713[var8][var10].field2864 == 2) {
                                var9 = false;
                            } else {
                                Statics.field713[var8][var10] = null;
                            }
                        }
                    }
                    if (var9) {
                        Statics.field713[var8] = null;
                    }
                    Statics.field305[var8] = false;
                }
            }
        }
        for (class67 var11 = (class67) field1052.method3693(); var11 != null; var11 = (class67) field1052.method3694()) {
            method2911(var11, true);
        }
        field859 = -1;
        field1052 = new class202(8);
        field886 = null;
        field885 = 0;
        field1072 = false;
        field1088.method4069((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field951[var12] = null;
            field845[var12] = false;
        }
        class65.method2710();
        field849 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field1030[var13] = true;
        }
        method894();
        Statics.field334 = null;
        for (int var14 = 0; var14 < 8; var14++) {
            field870[var14] = new class17();
        }
        Statics.field1892 = null;
    }

    @ObfuscatedName("ar.fo(II)V")
    public static void method235(int arg0) {
        if (arg0 == -3) {
            class90.method609(class237.field3215, class237.field2995, class237.field2996);
        } else if (arg0 == -2) {
            class90.method609(class237.field2997, class237.field3024, class237.field2999);
        } else if (arg0 == -1) {
            class90.method609(class237.field3000, class237.field3040, class237.field3002);
        } else if (arg0 == 3) {
            class90.field1336 = 3;
        } else if (arg0 == 4) {
            class90.method609(class237.field3053, class237.field3007, class237.field3005);
        } else if (arg0 == 5) {
            class90.method609(class237.field3006, class237.field3023, class237.field3199);
        } else if (arg0 == 6) {
            class90.method609(class237.field2972, class237.field3061, class237.field3003);
        } else if (arg0 == 7) {
            class90.method609(class237.field3220, class237.field3063, class237.field3014);
        } else if (arg0 == 8) {
            class90.method609(class237.field3015, class237.field3164, class237.field3017);
        } else if (arg0 == 9) {
            class90.method609(class237.field3153, class237.field3019, class237.field3020);
        } else if (arg0 == 10) {
            class90.method609(class237.field3021, class237.field3022, class237.field3099);
        } else if (arg0 == 11) {
            class90.method609(class237.field3204, class237.field3025, class237.field3018);
        } else if (arg0 == 12) {
            class90.method609(class237.field3027, class237.field3047, class237.field3029);
        } else if (arg0 == 13) {
            class90.method609(class237.field3030, class237.field3031, class237.field3032);
        } else if (arg0 == 14) {
            class90.method609(class237.field3033, class237.field3034, class237.field3035);
        } else if (arg0 == 16) {
            class90.method609(class237.field3036, class237.field3037, class237.field3230);
        } else if (arg0 == 17) {
            class90.method609(class237.field3039, class237.field3117, class237.field3211);
        } else if (arg0 == 18) {
            class90.method609(class237.field3038, class237.field3043, class237.field3044);
        } else if (arg0 == 19) {
            class90.method609(class237.field3045, class237.field3089, class237.field3224);
        } else if (arg0 == 20) {
            class90.method609(class237.field3048, class237.field3049, class237.field3009);
        } else if (arg0 == 22) {
            class90.method609(class237.field3051, class237.field3150, class237.field2988);
        } else if (arg0 == 23) {
            class90.method609(class237.field3054, class237.field3055, class237.field3056);
        } else if (arg0 == 24) {
            class90.method609(class237.field3057, class237.field3058, class237.field3197);
        } else if (arg0 == 25) {
            class90.method609(class237.field3060, class237.field3067, class237.field3178);
        } else if (arg0 == 26) {
            class90.method609(class237.field2984, class237.field3064, class237.field3016);
        } else if (arg0 == 27) {
            class90.method609(class237.field3066, class237.field3069, class237.field3068);
        } else if (arg0 == 31) {
            class90.method609(class237.field3208, class237.field3076, class237.field3077);
        } else if (arg0 == 32) {
            class90.method609(class237.field3078, class237.field2963, class237.field3080);
        } else if (arg0 == 37) {
            class90.method609(class237.field3133, class237.field2958, class237.field3083);
        } else if (arg0 == 38) {
            class90.method609(class237.field3084, class237.field3234, class237.field3112);
        } else if (arg0 == 55) {
            class90.method609(class237.field3173, class237.field2998, class237.field3192);
        } else if (arg0 == 56) {
            class90.method609(class237.field3223, class237.field3091, class237.field3183);
            method1754(11);
            return;
        } else if (arg0 == 57) {
            class90.method609(class237.field3093, class237.field3094, class237.field3095);
            method1754(11);
            return;
        } else {
            class90.method609(class237.field3096, class237.field3097, class237.field3098);
        }
        method1754(10);
    }

    @ObfuscatedName("am.fu(I)V")
    public static final void method467() {
        field938.method1909();
        method4602();
        Statics.field291.method2907();
        for (int var0 = 0; var0 < 4; var0++) {
            field896[var0].method3084();
        }
        System.gc();
        class215.method127(2);
        field903 = -1;
        field1060 = false;
        for (class80 var1 = (class80) class80.field1234.method3752(); var1 != null; var1 = (class80) class80.field1234.method3762()) {
            if (var1.field1232 != null) {
                Statics.field451.method1980(var1.field1232);
                var1.field1232 = null;
            }
            if (var1.field1221 != null) {
                Statics.field451.method1980(var1.field1221);
                var1.field1221 = null;
            }
        }
        class80.field1234.method3746();
        method1754(10);
    }

    @ObfuscatedName("ju.fg(I)V")
    public static final void method4602() {
        class271.field3666.method3674();
        class258.field3429.method3674();
        class259.field3433.method3674();
        class267.field3520.method3674();
        class267.field3521.method3674();
        class267.field3522.method3674();
        class267.field3523.method3674();
        class270.field3630.method3674();
        class270.field3649.method3674();
        Statics.method4175();
        class272.field3680.method3674();
        class272.field3681.method3674();
        class257.field3407.method3674();
        class257.field3408.method3674();
        class262.field3462.method3674();
        class253.method1710();
        class266.method3481();
        class260.method4008();
        class264.field3474.method3674();
        class263.field3467.method3674();
        class254.field3396.method3674();
        class225.field2724.method3674();
        class228.method2507();
        ((class123) Statics.field1915).method2404();
        class96.field1425.method3674();
        Statics.field2116.method4258();
        Statics.field232.method4258();
        Statics.field761.method4258();
        Statics.field741.method4258();
        Statics.field872.method4258();
        Statics.field2914.method4258();
        Statics.field588.method4258();
        Statics.field485.method4258();
        Statics.field2114.method4258();
        Statics.field752.method4258();
        Statics.field633.method4258();
        Statics.field335.method4258();
    }

    @ObfuscatedName("jk.fb(I)V")
    public static final void method4535() {
        if (field944 > 0) {
            method467();
        } else {
            field889.method5142();
            method1754(40);
            Statics.field2162 = field938.method1911();
            field938.method1910();
        }
    }

    @ObfuscatedName("eu.fd(ZS)V")
    public static final void method2916(boolean arg0) {
        if (arg0) {
            field878 = class90.field1347 ? class149.field2084 : class149.field2085;
            return;
        }
        LinkedHashMap var1 = Statics.field263.field1198;
        String var2 = class90.field1341;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field878 = var1.containsKey(var4) ? class149.field2086 : class149.field2087;
    }

    @ObfuscatedName("client.fj(B)V")
    public final void method1272() {
        if (field995 > 1) {
            field995--;
        }
        if (field944 > 0) {
            field944--;
        }
        if (field887) {
            field887 = false;
            method4535();
            return;
        }
        if (!field1072) {
            field885 = 0;
            field1072 = false;
            field1005[0] = class237.field3062;
            field970[0] = "";
            field901[0] = 1006;
            field971[0] = false;
            field885 = 1;
        }
        for (int var1 = 0; var1 < 100 && this.method1096(field938); var1++) {
        }
        if (field848 != 30) {
            return;
        }
        while (true) {
            class304 var2 = (class304) class305.field3870.method3723();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field889.field3845) {
                    class175 var6 = class175.method1891(class172.field2331, field938.field1455);
                    var6.field2440.method3223(0);
                    int var7 = var6.field2440.field2514;
                    field889.method5154(var6.field2440);
                    var6.field2440.method3236(var6.field2440.field2514 - var7);
                    field938.method1907(var6);
                    field889.method5145();
                }
                Object var8 = Statics.field532.field789;
                synchronized (Statics.field532.field789) {
                    if (!field986) {
                        Statics.field532.field788 = 0;
                    } else if (class60.field697 != 0 || Statics.field532.field788 >= 40) {
                        class175 var9 = class175.method1891(class172.field2383, field938.field1455);
                        var9.field2440.method3223(0);
                        int var10 = var9.field2440.field2514;
                        int var11 = 0;
                        for (int var12 = 0; var12 < Statics.field532.field788 && var9.field2440.field2514 - var10 < 240; var12++) {
                            var11++;
                            int var13 = Statics.field532.field792[var12];
                            if (var13 < 0) {
                                var13 = 0;
                            } else if (var13 > 502) {
                                var13 = 502;
                            }
                            int var14 = Statics.field532.field795[var12];
                            if (var14 < 0) {
                                var14 = 0;
                            } else if (var14 > 764) {
                                var14 = 764;
                            }
                            int var15 = var13 * 765 + var14;
                            if (Statics.field532.field792[var12] == -1 && Statics.field532.field795[var12] == -1) {
                                var14 = -1;
                                var13 = -1;
                                var15 = 524287;
                            }
                            if (field852 != var14 || field853 != var13) {
                                int var16 = var14 - field852;
                                field852 = var14;
                                int var17 = var13 - field853;
                                field853 = var13;
                                if (field854 < 8 && var16 >= -32 && var16 <= 31 && var17 >= -32 && var17 <= 31) {
                                    var16 += 32;
                                    var17 += 32;
                                    var9.field2440.method3403((field854 << 12) + (var16 << 6) + var17);
                                    field854 = 0;
                                } else if (field854 < 8) {
                                    var9.field2440.method3225((field854 << 19) + 8388608 + var15);
                                    field854 = 0;
                                } else {
                                    var9.field2440.method3242((field854 << 19) + -1073741824 + var15);
                                    field854 = 0;
                                }
                            } else if (field854 < 2047) {
                                field854++;
                            }
                        }
                        var9.field2440.method3236(var9.field2440.field2514 - var10);
                        field938.method1907(var9);
                        if (var11 >= Statics.field532.field788) {
                            Statics.field532.field788 = 0;
                        } else {
                            Statics.field532.field788 -= var11;
                            for (int var18 = 0; var18 < Statics.field532.field788; var18++) {
                                Statics.field532.field795[var18] = Statics.field532.field795[var11 + var18];
                                Statics.field532.field792[var18] = Statics.field532.field792[var11 + var18];
                            }
                        }
                    }
                }
                if (class60.field697 == 1 || !Statics.field407 && class60.field697 == 4 || class60.field697 == 2) {
                    long var20 = (class60.field700 - field843 * -1L) / 50L;
                    if (var20 > 4095L) {
                        var20 = 4095L;
                    }
                    field843 = class60.field700 * -1L;
                    int var22 = class60.field701;
                    if (var22 < 0) {
                        var22 = 0;
                    } else if (var22 > Statics.field2191) {
                        var22 = Statics.field2191;
                    }
                    int var23 = class60.field698;
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 > Statics.field663) {
                        var23 = Statics.field663;
                    }
                    int var24 = (int) var20;
                    class175 var25 = class175.method1891(class172.field2406, field938.field1455);
                    var25.field2440.method3403((var24 << 1) + (class60.field697 == 2 ? 1 : 0));
                    var25.field2440.method3403(var23);
                    var25.field2440.method3403(var22);
                    field938.method1907(var25);
                }
                if (class51.field608 > 0) {
                    class175 var26 = class175.method1891(class172.field2321, field938.field1455);
                    var26.field2440.method3403(0);
                    int var27 = var26.field2440.field2514;
                    long var28 = class187.method2705();
                    for (int var30 = 0; var30 < class51.field608; var30++) {
                        long var31 = var28 - field1049;
                        if (var31 > 16777215L) {
                            var31 = 16777215L;
                        }
                        field1049 = var28;
                        var26.field2440.method3282((int) var31);
                        var26.field2440.method3265(class51.field616[var30]);
                    }
                    var26.field2440.method3235(var26.field2440.field2514 - var27);
                    field938.method1907(var26);
                }
                if (field915 > 0) {
                    field915--;
                }
                if (class51.field618[96] || class51.field618[97] || class51.field618[98] || class51.field618[99]) {
                    field1045 = true;
                }
                if (field1045 && field915 <= 0) {
                    field915 = 20;
                    field1045 = false;
                    class175 var33 = class175.method1891(class172.field2402, field938.field1455);
                    var33.field2440.method3257(field909);
                    var33.field2440.method3257(field908);
                    field938.method1907(var33);
                }
                if (Statics.field15 && !field962) {
                    field962 = true;
                    class175 var34 = class175.method1891(class172.field2325, field938.field1455);
                    var34.field2440.method3223(1);
                    field938.method1907(var34);
                }
                if (!Statics.field15 && field962) {
                    field962 = false;
                    class175 var35 = class175.method1891(class172.field2325, field938.field1455);
                    var35.field2440.method3223(0);
                    field938.method1907(var35);
                }
                method2934();
                method2917();
                if (field848 != 30) {
                    return;
                }
                method1544();
                method2619();
                field938.field1457++;
                if (field938.field1457 > 750) {
                    method4535();
                    return;
                }
                method690();
                method5093();
                int[] var36 = class93.field1394;
                for (int var37 = 0; var37 < class93.field1388; var37++) {
                    class72 var38 = field945[var36[var37]];
                    if (var38 != null && var38.field1131 > 0) {
                        var38.field1131--;
                        if (var38.field1131 == 0) {
                            var38.field1139 = null;
                        }
                    }
                }
                for (int var39 = 0; var39 < field881; var39++) {
                    int var40 = field882[var39];
                    class84 var41 = field880[var40];
                    if (var41 != null && var41.field1131 > 0) {
                        var41.field1131--;
                        if (var41.field1131 == 0) {
                            var41.field1139 = null;
                        }
                    }
                }
                field1092++;
                if (field1080 != 0) {
                    field934 += 20;
                    if (field934 >= 400) {
                        field1080 = 0;
                    }
                }
                if (Statics.field567 != null) {
                    field936++;
                    if (field936 >= 15) {
                        method313(Statics.field567);
                        Statics.field567 = null;
                    }
                }
                class228 var42 = Statics.field625;
                class228 var43 = Statics.field1217;
                Statics.field625 = null;
                Statics.field1217 = null;
                field1002 = null;
                field981 = false;
                field1003 = false;
                field1046 = 0;
                while (class51.method2929() && field1046 < 128) {
                    if (field1084 >= 2 && class51.field618[82] && Statics.field609 == 66) {
                        String var44 = "";
                        Iterator var45 = class95.field1416.iterator();
                        while (var45.hasNext()) {
                            class70 var46 = (class70) var45.next();
                            var44 = var44 + var46.field798 + ':' + var46.field804 + '\n';
                        }
                        Statics.field2445.method719(var44);
                    } else {
                        field967[field1046] = Statics.field609;
                        field1047[field1046] = Statics.field3236;
                        field1046++;
                    }
                }
                if (method43() && class51.field618[82] && class51.field618[81] && field1023 != 0) {
                    int var49 = Statics.field1754.field828 - field1023;
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 3) {
                        var49 = 3;
                    }
                    if (Statics.field1754.field828 != var49) {
                        int var50 = Statics.field3737 + Statics.field1754.field1170[0];
                        int var51 = Statics.field435 + Statics.field1754.field1174[0];
                        class175 var52 = class175.method1891(class172.field2384, field938.field1455);
                        var52.field2440.method3247(var51);
                        var52.field2440.method3265(var49);
                        var52.field2440.method3257(var50);
                        field938.method1907(var52);
                    }
                    field1023 = 0;
                }
                if (field859 != -1) {
                    int var53 = field859;
                    int var54 = Statics.field663;
                    int var55 = Statics.field2191;
                    if (class228.method3132(var53)) {
                        method169(Statics.field713[var53], -1, 0, 0, var54, var55, 0, 0);
                    }
                }
                field1010++;
                while (true) {
                    class68 var56;
                    class228 var57;
                    class228 var58;
                    do {
                        var56 = (class68) field1025.method3750();
                        if (var56 == null) {
                            while (true) {
                                class68 var59;
                                class228 var60;
                                class228 var61;
                                do {
                                    var59 = (class68) field1026.method3750();
                                    if (var59 == null) {
                                        while (true) {
                                            class68 var62;
                                            class228 var63;
                                            class228 var64;
                                            do {
                                                var62 = (class68) field1024.method3750();
                                                if (var62 == null) {
                                                    this.method1097();
                                                    method606();
                                                    if (field941 != null) {
                                                        this.method1102();
                                                    }
                                                    if (Statics.field3516 != null) {
                                                        method313(Statics.field3516);
                                                        field943++;
                                                        if (class60.field690 == 0) {
                                                            if (field942) {
                                                                if (Statics.field563 == Statics.field3516 && field988 != field897) {
                                                                    class228 var65 = Statics.field3516;
                                                                    byte var66 = 0;
                                                                    if (field1066 == 1 && var65.field2759 == 206) {
                                                                        var66 = 1;
                                                                    }
                                                                    if (var65.field2876[field897] <= 0) {
                                                                        var66 = 0;
                                                                    }
                                                                    int var67 = method53(var65);
                                                                    boolean var68 = (var67 >> 29 & 0x1) != 0;
                                                                    if (var68) {
                                                                        int var69 = field988;
                                                                        int var70 = field897;
                                                                        var65.field2876[var70] = var65.field2876[var69];
                                                                        var65.field2874[var70] = var65.field2874[var69];
                                                                        var65.field2876[var69] = -1;
                                                                        var65.field2874[var69] = 0;
                                                                    } else if (var66 == 1) {
                                                                        int var71 = field988;
                                                                        int var72 = field897;
                                                                        while (var71 != var72) {
                                                                            if (var71 > var72) {
                                                                                var65.method4103(var71 - 1, var71);
                                                                                var71--;
                                                                            } else if (var71 < var72) {
                                                                                var65.method4103(var71 + 1, var71);
                                                                                var71++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var65.method4103(field897, field988);
                                                                    }
                                                                    class175 var73 = class175.method1891(class172.field2358, field938.field1455);
                                                                    var73.field2440.method3247(field897);
                                                                    var73.field2440.method3368(Statics.field3516.field2755);
                                                                    var73.field2440.method3247(field988);
                                                                    var73.field2440.method3264(var66);
                                                                    field938.method1907(var73);
                                                                }
                                                            } else if (this.method1098()) {
                                                                this.method1192(field994, field940);
                                                            } else if (field885 > 0) {
                                                                method1771(field994, field940);
                                                            }
                                                            field936 = 10;
                                                            class60.field697 = 0;
                                                            Statics.field3516 = null;
                                                        } else if (field943 >= 5 && (class60.field691 > field994 + 5 || class60.field691 < field994 - 5 || class60.field692 > field940 + 5 || class60.field692 < field940 - 5)) {
                                                            field942 = true;
                                                        }
                                                    }
                                                    if (class137.method2751()) {
                                                        int var74 = class137.field1971;
                                                        int var75 = class137.field1938;
                                                        class175 var76 = class175.method1891(class172.field2348, field938.field1455);
                                                        var76.field2440.method3223(5);
                                                        var76.field2440.method3257(Statics.field435 + var75);
                                                        var76.field2440.method3403(Statics.field3737 + var74);
                                                        var76.field2440.method3266(class51.field618[82] ? (class51.field618[81] ? 2 : 1) : 0);
                                                        field938.method1907(var76);
                                                        class137.method2752();
                                                        field1078 = class60.field698;
                                                        field1006 = class60.field701;
                                                        field1080 = 1;
                                                        field934 = 0;
                                                        field984 = var74;
                                                        field1056 = var75;
                                                    }
                                                    if (Statics.field625 != var42) {
                                                        if (var42 != null) {
                                                            method313(var42);
                                                        }
                                                        if (Statics.field625 != null) {
                                                            method313(Statics.field625);
                                                        }
                                                    }
                                                    if (Statics.field1217 != var43 && field977 == field976) {
                                                        if (var43 != null) {
                                                            method313(var43);
                                                        }
                                                        if (Statics.field1217 != null) {
                                                            method313(Statics.field1217);
                                                        }
                                                    }
                                                    if (Statics.field1217 == null) {
                                                        if (field976 > 0) {
                                                            field976--;
                                                        }
                                                    } else if (field976 < field977) {
                                                        field976++;
                                                        if (field977 == field976) {
                                                            method313(Statics.field1217);
                                                        }
                                                    }
                                                    int var77 = Statics.field1754.field1129;
                                                    int var78 = Statics.field1754.field1116;
                                                    if (Statics.field790 - var77 < -500 || Statics.field790 - var77 > 500 || Statics.field28 - var78 < -500 || Statics.field28 - var78 > 500) {
                                                        Statics.field790 = var77;
                                                        Statics.field28 = var78;
                                                    }
                                                    if (Statics.field790 != var77) {
                                                        Statics.field790 += (var77 - Statics.field790) / 16;
                                                    }
                                                    if (Statics.field28 != var78) {
                                                        Statics.field28 += (var78 - Statics.field28) / 16;
                                                    }
                                                    if (class60.field690 == 4 && Statics.field407) {
                                                        int var79 = class60.field692 - field913;
                                                        field911 = var79 * 2;
                                                        field913 = var79 == -1 || var79 == 1 ? class60.field692 : (field913 + class60.field692) / 2;
                                                        int var80 = field912 - class60.field691;
                                                        field910 = var80 * 2;
                                                        field912 = var80 == -1 || var80 == 1 ? class60.field691 : (field912 + class60.field691) / 2;
                                                    } else {
                                                        if (class51.field618[96]) {
                                                            field910 += (-24 - field910) / 2;
                                                        } else if (class51.field618[97]) {
                                                            field910 += (24 - field910) / 2;
                                                        } else {
                                                            field910 /= 2;
                                                        }
                                                        if (class51.field618[98]) {
                                                            field911 += (12 - field911) / 2;
                                                        } else if (class51.field618[99]) {
                                                            field911 += (-12 - field911) / 2;
                                                        } else {
                                                            field911 /= 2;
                                                        }
                                                        field913 = class60.field692;
                                                        field912 = class60.field691;
                                                    }
                                                    field909 = field910 / 2 + field909 & 0x7FF;
                                                    field908 += field911 / 2;
                                                    if (field908 < 128) {
                                                        field908 = 128;
                                                    }
                                                    if (field908 > 383) {
                                                        field908 = 383;
                                                    }
                                                    int var81 = Statics.field790 >> 7;
                                                    int var82 = Statics.field28 >> 7;
                                                    int var83 = method1017(Statics.field790, Statics.field28, Statics.field706);
                                                    int var84 = 0;
                                                    if (var81 > 3 && var82 > 3 && var81 < 100 && var82 < 100) {
                                                        for (int var85 = var81 - 4; var85 <= var81 + 4; var85++) {
                                                            for (int var86 = var82 - 4; var86 <= var82 + 4; var86++) {
                                                                int var87 = Statics.field706;
                                                                if (var87 < 3 && (class63.field723[1][var85][var86] & 0x2) == 2) {
                                                                    var87++;
                                                                }
                                                                int var88 = var83 - class63.field731[var87][var85][var86];
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
                                                    if (var89 > field917) {
                                                        field917 += (var89 - field917) / 24;
                                                    } else if (var89 < field917) {
                                                        field917 += (var89 - field917) / 80;
                                                    }
                                                    if (field1069) {
                                                        int var90 = Statics.field2529 * 128 + 64;
                                                        int var91 = Statics.field3816 * 128 + 64;
                                                        int var92 = method1017(var90, var91, Statics.field706) - Statics.field312;
                                                        if (Statics.field1344 < var90) {
                                                            Statics.field1344 += Statics.field270 * (var90 - Statics.field1344) / 1000 + Statics.field3296;
                                                            if (Statics.field1344 > var90) {
                                                                Statics.field1344 = var90;
                                                            }
                                                        }
                                                        if (Statics.field1344 > var90) {
                                                            Statics.field1344 -= Statics.field270 * (Statics.field1344 - var90) / 1000 + Statics.field3296;
                                                            if (Statics.field1344 < var90) {
                                                                Statics.field1344 = var90;
                                                            }
                                                        }
                                                        if (Statics.field2664 < var92) {
                                                            Statics.field2664 += Statics.field270 * (var92 - Statics.field2664) / 1000 + Statics.field3296;
                                                            if (Statics.field2664 > var92) {
                                                                Statics.field2664 = var92;
                                                            }
                                                        }
                                                        if (Statics.field2664 > var92) {
                                                            Statics.field2664 -= Statics.field270 * (Statics.field2664 - var92) / 1000 + Statics.field3296;
                                                            if (Statics.field2664 < var92) {
                                                                Statics.field2664 = var92;
                                                            }
                                                        }
                                                        if (Statics.field16 < var91) {
                                                            Statics.field16 += Statics.field270 * (var91 - Statics.field16) / 1000 + Statics.field3296;
                                                            if (Statics.field16 > var91) {
                                                                Statics.field16 = var91;
                                                            }
                                                        }
                                                        if (Statics.field16 > var91) {
                                                            Statics.field16 -= Statics.field270 * (Statics.field16 - var91) / 1000 + Statics.field3296;
                                                            if (Statics.field16 < var91) {
                                                                Statics.field16 = var91;
                                                            }
                                                        }
                                                        int var93 = Statics.field27 * 128 + 64;
                                                        int var94 = Statics.field716 * 128 + 64;
                                                        int var95 = method1017(var93, var94, Statics.field706) - Statics.field2700;
                                                        int var96 = var93 - Statics.field1344;
                                                        int var97 = var95 - Statics.field2664;
                                                        int var98 = var94 - Statics.field16;
                                                        int var99 = (int) Math.sqrt((double) (var96 * var96 + var98 * var98));
                                                        int var100 = (int) (Math.atan2((double) var97, (double) var99) * 325.949D) & 0x7FF;
                                                        int var101 = (int) (Math.atan2((double) var96, (double) var98) * -325.949D) & 0x7FF;
                                                        if (var100 < 128) {
                                                            var100 = 128;
                                                        }
                                                        if (var100 > 383) {
                                                            var100 = 383;
                                                        }
                                                        if (Statics.field784 < var100) {
                                                            Statics.field784 += Statics.field11 * (var100 - Statics.field784) / 1000 + Statics.field382;
                                                            if (Statics.field784 > var100) {
                                                                Statics.field784 = var100;
                                                            }
                                                        }
                                                        if (Statics.field784 > var100) {
                                                            Statics.field784 -= Statics.field11 * (Statics.field784 - var100) / 1000 + Statics.field382;
                                                            if (Statics.field784 < var100) {
                                                                Statics.field784 = var100;
                                                            }
                                                        }
                                                        int var102 = var101 - Statics.field1254;
                                                        if (var102 > 1024) {
                                                            var102 -= 2048;
                                                        }
                                                        if (var102 < -1024) {
                                                            var102 += 2048;
                                                        }
                                                        if (var102 > 0) {
                                                            Statics.field1254 += Statics.field11 * var102 / 1000 + Statics.field382;
                                                            Statics.field1254 &= 0x7FF;
                                                        }
                                                        if (var102 < 0) {
                                                            Statics.field1254 -= Statics.field11 * -var102 / 1000 + Statics.field382;
                                                            Statics.field1254 &= 0x7FF;
                                                        }
                                                        int var103 = var101 - Statics.field1254;
                                                        if (var103 > 1024) {
                                                            var103 -= 2048;
                                                        }
                                                        if (var103 < -1024) {
                                                            var103 += 2048;
                                                        }
                                                        if (var103 < 0 && var102 > 0 || var103 > 0 && var102 < 0) {
                                                            Statics.field1254 = var101;
                                                        }
                                                    }
                                                    for (int var104 = 0; var104 < 5; var104++) {
                                                        int var10002 = field1074[var104]++;
                                                    }
                                                    Statics.field470.method1843();
                                                    int var105 = class60.method3067();
                                                    int var106 = class51.method14();
                                                    if (var105 > 15000 && var106 > 15000) {
                                                        field944 = 250;
                                                        class60.method2190(14500);
                                                        class175 var107 = class175.method1891(class172.field2404, field938.field1455);
                                                        field938.method1907(var107);
                                                    }
                                                    Statics.field473.method1570();
                                                    field938.field1450++;
                                                    if (field938.field1450 > 50) {
                                                        class175 var108 = class175.method1891(class172.field2346, field938.field1455);
                                                        field938.method1907(var108);
                                                    }
                                                    try {
                                                        field938.method1906();
                                                    } catch (IOException var110) {
                                                        method4535();
                                                    }
                                                    return;
                                                }
                                                var63 = var62.field774;
                                                if (var63.field2756 < 0) {
                                                    break;
                                                }
                                                var64 = class228.method3956(var63.field2774);
                                            } while (var64 == null || var64.field2879 == null || var63.field2756 >= var64.field2879.length || var64.field2879[var63.field2756] != var63);
                                            class81.method1742(var62);
                                        }
                                    }
                                    var60 = var59.field774;
                                    if (var60.field2756 < 0) {
                                        break;
                                    }
                                    var61 = class228.method3956(var60.field2774);
                                } while (var61 == null || var61.field2879 == null || var60.field2756 >= var61.field2879.length || var61.field2879[var60.field2756] != var60);
                                class81.method1742(var59);
                            }
                        }
                        var57 = var56.field774;
                        if (var57.field2756 < 0) {
                            break;
                        }
                        var58 = class228.method3956(var57.field2774);
                    } while (var58 == null || var58.field2879 == null || var57.field2756 >= var58.field2879.length || var58.field2879[var57.field2756] != var57);
                    class81.method1742(var56);
                }
            }
            class175 var4 = class175.method1891(class172.field2339, field938.field1455);
            var4.field2440.method3223(0);
            int var5 = var4.field2440.field2514;
            class305.method5156(var4.field2440);
            var4.field2440.method3236(var4.field2440.field2514 - var5);
            field938.method1907(var4);
        }
    }

    @ObfuscatedName("gl.ft(B)V")
    public static final void method3498() {
        if (Statics.field3488 != null) {
            Statics.field3488.method2121();
        }
        if (Statics.field237 != null) {
            Statics.field237.method2121();
        }
    }

    @ObfuscatedName("ew.fx(I)V")
    public static final void method2619() {
        for (int var0 = 0; var0 < field1063; var0++) {
            int var10002 = field1089[var0]--;
            if (field1089[var0] >= -10) {
                class105 var2 = field1068[var0];
                if (var2 == null) {
                    class105 var10000 = (class105) null;
                    var2 = class105.method2043(Statics.field741, field1064[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field1089[var0] += var2.method2048();
                    field1068[var0] = var2;
                }
                if (field1089[var0] < 0) {
                    int var9;
                    if (field1067[var0] == 0) {
                        var9 = field1059;
                    } else {
                        int var3 = (field1067[var0] & 0xFF) * 128;
                        int var4 = field1067[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1754.field1129;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field1067[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1754.field1116;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field1089[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field879 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class107 var10 = var2.method2040().method2092(Statics.field3371);
                        class117 var11 = class117.method2351(var10, 100, var9);
                        var11.method2227(field1065[var0] - 1);
                        Statics.field451.method1992(var11);
                    }
                    field1089[var0] = -100;
                }
            } else {
                field1063--;
                for (int var1 = var0; var1 < field1063; var1++) {
                    field1064[var1] = field1064[var1 + 1];
                    field1068[var1] = field1068[var1 + 1];
                    field1065[var1] = field1065[var1 + 1];
                    field1089[var1] = field1089[var1 + 1];
                    field1067[var1] = field1067[var1 + 1];
                }
                var0--;
            }
        }
        if (!field1060) {
            return;
        }
        boolean var12;
        if (class215.field2618 == 0) {
            var12 = Statics.field357.method3930();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field1058 != 0 && field903 != -1) {
                class215.method8(Statics.field2914, field903, 0, field1058, false);
            }
            field1060 = false;
        }
    }

    @ObfuscatedName("t.fm(Lje;IIII)V")
    public static void method17(class272 arg0, int arg1, int arg2, int arg3) {
        if (field1063 >= 50 || field879 == 0 || arg0.field3685 == null || arg1 >= arg0.field3685.length) {
            return;
        }
        int var4 = arg0.field3685[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1064[field1063] = var5;
        field1065[field1063] = var6;
        field1089[field1063] = 0;
        field1068[field1063] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1067[field1063] = (var8 << 16) + (var9 << 8) + var7;
        field1063++;
    }

    @ObfuscatedName("cm.fi(IS)V")
    public static void method1864(int arg0) {
        if (arg0 == -1 && !field1060) {
            Statics.field357.method3859();
            class215.field2618 = 1;
            Statics.field2615 = null;
        } else if (arg0 != -1 && field903 != arg0 && field1058 != 0 && !field1060) {
            Statics.method3219(2, Statics.field2914, arg0, 0, field1058, false);
        }
        field903 = arg0;
    }

    @ObfuscatedName("ey.fq(B)V")
    public static final void method2934() {
        if (!Statics.field283) {
            return;
        }
        if (Statics.field334 != null) {
            Statics.field334.method4849();
        }
        method3202();
        Statics.field283 = false;
    }

    @ObfuscatedName("eu.fv(B)V")
    public static final void method2917() {
        if (Statics.field706 != field1050) {
            field1050 = Statics.field706;
            method170(Statics.field706);
        }
    }

    @ObfuscatedName("bs.fe(Ljava/lang/String;I)V")
    public static final void method1546(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field263.field1203 = !Statics.field263.field1203;
            class78.method1502();
            if (Statics.field263.field1203) {
                class95.method649(99, "", "Roofs are now all hidden");
            } else {
                class95.method649(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field989 = !field989;
        }
        if (field1084 >= 2) {
            if (arg0.equalsIgnoreCase("aabb")) {
                if (!class8.field225) {
                    class8.field225 = true;
                    class8.field221 = class12.field253;
                } else if (class8.field221 == class12.field253) {
                    class8.field225 = true;
                    class8.field221 = class12.field256;
                } else {
                    class8.field225 = false;
                }
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field989 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field989 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method4535();
            }
            if (arg0.equalsIgnoreCase("cs")) {
                class95.method649(99, "", "" + field1055);
            }
            if (arg0.equalsIgnoreCase("errortest") && field1016 == 2) {
                throw new RuntimeException();
            }
        }
        class175 var1 = class175.method1891(class172.field2323, field938.field1455);
        var1.field2440.method3223(arg0.length() + 1);
        var1.field2440.method3230(arg0);
        field938.method1907(var1);
    }

    @ObfuscatedName("bf.fr(I)V")
    public static final void method690() {
        int var0 = class93.field1388;
        int[] var1 = class93.field1394;
        for (int var2 = 0; var2 < var0; var2++) {
            class72 var3 = field945[var1[var2]];
            if (var3 != null) {
                method1903(var3, 1);
            }
        }
    }

    @ObfuscatedName("kt.fc(I)V")
    public static final void method5093() {
        for (int var0 = 0; var0 < field881; var0++) {
            int var1 = field882[var0];
            class84 var2 = field880[var1];
            if (var2 != null) {
                method1903(var2, var2.field1271.field3634);
            }
        }
    }

    @ObfuscatedName("cr.fw(Lbe;II)V")
    public static final void method1903(class75 arg0, int arg1) {
        if (arg0.field1161 > field1036) {
            method3143(arg0);
        } else if (arg0.field1150 >= field1036) {
            if (field1036 == arg0.field1150 || arg0.field1147 == -1 || arg0.field1115 != 0 || arg0.field1141 + 1 > class272.method4180(arg0.field1147).field3684[arg0.field1171]) {
                int var2 = arg0.field1150 - arg0.field1161;
                int var3 = field1036 - arg0.field1161;
                int var4 = arg0.field1163 * 128 + arg0.field1128 * 64;
                int var5 = arg0.field1159 * 128 + arg0.field1128 * 64;
                int var6 = arg0.field1158 * 128 + arg0.field1128 * 64;
                int var7 = arg0.field1160 * 128 + arg0.field1128 * 64;
                arg0.field1129 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field1116 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field1173 = 0;
            arg0.field1148 = arg0.field1119;
            arg0.field1117 = arg0.field1148;
        } else {
            method548(arg0);
        }
        if (arg0.field1129 < 128 || arg0.field1116 < 128 || arg0.field1129 >= 13184 || arg0.field1116 >= 13184) {
            arg0.field1147 = -1;
            arg0.field1152 = -1;
            arg0.field1161 = 0;
            arg0.field1150 = 0;
            arg0.field1129 = arg0.field1170[0] * 128 + arg0.field1128 * 64;
            arg0.field1116 = arg0.field1174[0] * 128 + arg0.field1128 * 64;
            arg0.method1487();
        }
        if (Statics.field1754 == arg0 && (arg0.field1129 < 1536 || arg0.field1116 < 1536 || arg0.field1129 >= 11776 || arg0.field1116 >= 11776)) {
            arg0.field1147 = -1;
            arg0.field1152 = -1;
            arg0.field1161 = 0;
            arg0.field1150 = 0;
            arg0.field1129 = arg0.field1170[0] * 128 + arg0.field1128 * 64;
            arg0.field1116 = arg0.field1174[0] * 128 + arg0.field1128 * 64;
            arg0.method1487();
        }
        method458(arg0);
        Statics.method1550(arg0);
    }

    @ObfuscatedName("fq.fs(Lbe;B)V")
    public static final void method3143(class75 arg0) {
        int var1 = arg0.field1161 - field1036;
        int var2 = arg0.field1163 * 128 + arg0.field1128 * 64;
        int var3 = arg0.field1159 * 128 + arg0.field1128 * 64;
        arg0.field1129 += (var2 - arg0.field1129) / var1;
        arg0.field1116 += (var3 - arg0.field1116) / var1;
        arg0.field1173 = 0;
        arg0.field1148 = arg0.field1119;
    }

    @ObfuscatedName("aj.fp(Lbe;I)V")
    public static final void method548(class75 arg0) {
        arg0.field1144 = arg0.field1138;
        if (arg0.field1123 == 0) {
            arg0.field1173 = 0;
            return;
        }
        if (arg0.field1147 != -1 && arg0.field1115 == 0) {
            class272 var1 = class272.method4180(arg0.field1147);
            if (arg0.field1162 > 0 && var1.field3693 == 0) {
                arg0.field1173++;
                return;
            }
            if (arg0.field1162 <= 0 && var1.field3694 == 0) {
                arg0.field1173++;
                return;
            }
        }
        int var2 = arg0.field1129;
        int var3 = arg0.field1116;
        int var4 = arg0.field1170[arg0.field1123 - 1] * 128 + arg0.field1128 * 64;
        int var5 = arg0.field1174[arg0.field1123 - 1] * 128 + arg0.field1128 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1148 = 1280;
            } else if (var3 > var5) {
                arg0.field1148 = 1792;
            } else {
                arg0.field1148 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1148 = 768;
            } else if (var3 > var5) {
                arg0.field1148 = 256;
            } else {
                arg0.field1148 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1148 = 1024;
        } else if (var3 > var5) {
            arg0.field1148 = 0;
        }
        byte var6 = arg0.field1166[arg0.field1123 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1129 = var4;
            arg0.field1116 = var5;
            arg0.field1123--;
            if (arg0.field1162 > 0) {
                arg0.field1162--;
            }
            return;
        }
        int var7 = arg0.field1148 - arg0.field1117 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1124;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1157;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1126;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1125;
        }
        if (var8 == -1) {
            var8 = arg0.field1157;
        }
        arg0.field1144 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class84) {
            var10 = ((class84) arg0).field1271.field3662;
        }
        if (var10) {
            if (arg0.field1148 != arg0.field1117 && arg0.field1156 == -1 && arg0.field1168 != 0) {
                var9 = 2;
            }
            if (arg0.field1123 > 2) {
                var9 = 6;
            }
            if (arg0.field1123 > 3) {
                var9 = 8;
            }
            if (arg0.field1173 > 0 && arg0.field1123 > 1) {
                var9 = 8;
                arg0.field1173--;
            }
        } else {
            if (arg0.field1123 > 1) {
                var9 = 6;
            }
            if (arg0.field1123 > 2) {
                var9 = 8;
            }
            if (arg0.field1173 > 0 && arg0.field1123 > 1) {
                var9 = 8;
                arg0.field1173--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1157 == arg0.field1144 && arg0.field1127 != -1) {
            arg0.field1144 = arg0.field1127;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1129 += var9;
                if (arg0.field1129 > var4) {
                    arg0.field1129 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1129 -= var9;
                if (arg0.field1129 < var4) {
                    arg0.field1129 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1116 += var9;
                if (arg0.field1116 > var5) {
                    arg0.field1116 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1116 -= var9;
                if (arg0.field1116 < var5) {
                    arg0.field1116 = var5;
                }
            }
        }
        if (arg0.field1129 == var4 && arg0.field1116 == var5) {
            arg0.field1123--;
            if (arg0.field1162 > 0) {
                arg0.field1162--;
            }
        }
    }

    @ObfuscatedName("ai.fl(Lbe;I)V")
    public static final void method458(class75 arg0) {
        if (arg0.field1168 == 0) {
            return;
        }
        if (arg0.field1156 != -1) {
            class75 var1 = null;
            if (arg0.field1156 < 32768) {
                var1 = field880[arg0.field1156];
            } else if (arg0.field1156 >= 32768) {
                var1 = field945[arg0.field1156 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1129 - var1.field1129;
                int var3 = arg0.field1116 - var1.field1116;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1148 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1142) {
                arg0.field1156 = -1;
                arg0.field1142 = false;
            }
        }
        if (arg0.field1143 != -1 && (arg0.field1123 == 0 || arg0.field1173 > 0)) {
            arg0.field1148 = arg0.field1143;
            arg0.field1143 = -1;
        }
        int var4 = arg0.field1148 - arg0.field1117 & 0x7FF;
        if (var4 == 0 && arg0.field1142) {
            arg0.field1156 = -1;
            arg0.field1142 = false;
        }
        if (var4 == 0) {
            arg0.field1167 = 0;
            return;
        }
        arg0.field1167++;
        if (var4 > 1024) {
            arg0.field1117 -= arg0.field1168;
            boolean var5 = true;
            if (var4 < arg0.field1168 || var4 > 2048 - arg0.field1168) {
                arg0.field1117 = arg0.field1148;
                var5 = false;
            }
            if (arg0.field1144 == arg0.field1138 && (arg0.field1167 > 25 || var5)) {
                if (arg0.field1121 == -1) {
                    arg0.field1144 = arg0.field1157;
                } else {
                    arg0.field1144 = arg0.field1121;
                }
            }
        } else {
            arg0.field1117 += arg0.field1168;
            boolean var6 = true;
            if (var4 < arg0.field1168 || var4 > 2048 - arg0.field1168) {
                arg0.field1117 = arg0.field1148;
                var6 = false;
            }
            if (arg0.field1144 == arg0.field1138 && (arg0.field1167 > 25 || var6)) {
                if (arg0.field1122 == -1) {
                    arg0.field1144 = arg0.field1157;
                } else {
                    arg0.field1144 = arg0.field1122;
                }
            }
        }
        arg0.field1117 &= 0x7FF;
    }

    @ObfuscatedName("au.gk(I)V")
    public static void method606() {
        if (Statics.field2449 != null) {
            Statics.field2449.method5435(Statics.field706, (Statics.field1754.field1129 >> 7) + Statics.field3737, (Statics.field1754.field1116 >> 7) + Statics.field435, false);
            Statics.field2449.method5451();
        }
    }

    @ObfuscatedName("k.gd(I)I")
    public static int method39() {
        return field969 ? 2 : 1;
    }

    @ObfuscatedName("jh.gl(II)V")
    public static void method4980(int arg0) {
        field1038 = 0L;
        if (arg0 >= 2) {
            field969 = true;
        } else {
            field969 = false;
        }
        if (method39() == 1) {
            Statics.field2445.method715(765, 503);
        } else {
            Statics.field2445.method715(7680, 2160);
        }
        if (field848 >= 25) {
            method894();
        }
    }

    @ObfuscatedName("bn.gg(B)V")
    public static void method894() {
        class175 var0 = class175.method1891(class172.field2371, field938.field1455);
        var0.field2440.method3223(method39());
        var0.field2440.method3403(Statics.field663);
        var0.field2440.method3403(Statics.field2191);
        field938.method1907(var0);
    }

    @ObfuscatedName("client.q(B)V")
    public final void method723() {
        field1038 = class187.method2705() + 500L;
        this.method1094();
        if (field859 != -1) {
            this.method1100(true);
        }
    }

    @ObfuscatedName("client.gj(B)V")
    public void method1094() {
        int var1 = Statics.field663;
        int var2 = Statics.field2191;
        if (this.field659 < var1) {
            int var3 = this.field659;
        }
        if (this.field660 < var2) {
            int var4 = this.field660;
        }
        if (Statics.field263 == null) {
            return;
        }
        try {
            client var5 = Statics.field2445;
            Object[] var6 = new Object[] { method39() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.ge(I)V")
    public final void method1095() {
        if (field859 != -1) {
            int var1 = field859;
            if (class228.method3132(var1)) {
                Statics.method75(Statics.field713[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field850; var2++) {
            if (field1030[var2]) {
                field907[var2] = true;
            }
            field1032[var2] = field1030[var2];
            field1030[var2] = false;
        }
        field1029 = field1036;
        field974 = -1;
        field975 = -1;
        Statics.field563 = null;
        if (field859 != -1) {
            field850 = 0;
            method3141(field859, 0, 0, Statics.field663, Statics.field2191, 0, 0, -1);
        }
        class306.method5228();
        if (field1072) {
            method641();
        } else if (field974 != -1) {
            method962(field974, field975);
        }
        if (field1037 == 3) {
            for (int var3 = 0; var3 < field850; var3++) {
                if (field1032[var3]) {
                    class306.method5188(field1033[var3], field1034[var3], field956[var3], field964[var3], 16711935, 128);
                } else if (field907[var3]) {
                    class306.method5188(field1033[var3], field1034[var3], field956[var3], field964[var3], 16711680, 128);
                }
            }
        }
        class80.method464(Statics.field706, Statics.field1754.field1129, Statics.field1754.field1116, field1092);
        field1092 = 0;
    }

    @ObfuscatedName("z.gt(Ljava/lang/String;ZI)V")
    public static final void method38(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1668.method5072(arg0, 250);
        int var6 = Statics.field1668.method5001(arg0, 250) * 13;
        class306.method5225(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class306.method5196(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1668.method5007(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method3519(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field336.method698(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field850; var11++) {
            if (field956[var11] + field1033[var11] > var7 && field1033[var11] < var7 + var9 && field964[var11] + field1034[var11] > var8 && field1034[var11] < var8 + var10) {
                field907[var11] = true;
            }
        }
    }

    @ObfuscatedName("z.go(IIIIZI)V")
    public static final void method37(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field1076 - field1083) * var5 / 100 + field1083;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field983) {
            short var8 = field983;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field939) {
                var6 = field939;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class306.method5228();
                    class306.method5225(arg0, arg1, var10, arg3, -16777216);
                    class306.method5225(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field1082) {
            short var11 = field1082;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field1079) {
                var6 = field1079;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class306.method5228();
                    class306.method5225(arg0, arg1, arg2, var13, -16777216);
                    class306.method5225(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field963 - field1077) * var5 / 100 + field1077;
        field1087 = arg3 * var6 * var14 / 85504 << 1;
        if (field1085 != arg2 || field1086 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class134.field1918[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class137.method2849(var15, 500, 800, arg2, arg3);
        }
        field952 = arg0;
        field1048 = arg1;
        field1085 = arg2;
        field1086 = arg3;
    }

    @ObfuscatedName("bx.ga(I)V")
    public static void method1020() {
        if (field954 >= 0 && field945[field954] != null) {
            method3848(field945[field954], false);
        }
    }

    @ObfuscatedName("et.gh(B)V")
    public static void method2984() {
        int var0 = class93.field1388;
        int[] var1 = class93.field1394;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field954 != var1[var2] && field946 != var1[var2]) {
                method3848(field945[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("hf.gb(Lby;ZB)V")
    public static void method3848(class72 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1046() || arg0.field827) {
            return;
        }
        int var2 = arg0.field823 << 14;
        arg0.field825 = false;
        if ((field991 && class93.field1388 > 50 || class93.field1388 > 200) && arg1 && arg0.field1144 == arg0.field1138) {
            arg0.field825 = true;
        }
        int var3 = arg0.field1129 >> 7;
        int var4 = arg0.field1116 >> 7;
        if (var3 < 0 || var3 >= 104 || var4 < 0 || var4 >= 104) {
            return;
        }
        if (arg0.field826 != null && field1036 >= arg0.field815 && field1036 < arg0.field824) {
            arg0.field825 = false;
            arg0.field814 = method1017(arg0.field1129, arg0.field1116, Statics.field706);
            Statics.field291.method2818(Statics.field706, arg0.field1129, arg0.field1116, arg0.field814, 60, arg0, arg0.field1117, var2, arg0.field821, arg0.field822, arg0.field816, arg0.field813);
            return;
        }
        if ((arg0.field1129 & 0x7F) == 64 && (arg0.field1116 & 0x7F) == 64) {
            if (field929 == field1028[var3][var4]) {
                return;
            }
            field1028[var3][var4] = field929;
        }
        arg0.field814 = method1017(arg0.field1129, arg0.field1116, Statics.field706);
        Statics.field291.method2723(Statics.field706, arg0.field1129, arg0.field1116, arg0.field814, 60, arg0, arg0.field1117, var2, arg0.field1118);
    }

    @ObfuscatedName("ff.gp(ZI)V")
    public static final void method3036(boolean arg0) {
        for (int var1 = 0; var1 < field881; var1++) {
            class84 var2 = field880[field882[var1]];
            int var3 = (field882[var1] << 14) + 536870912;
            if (var2 != null && var2.method1046() && var2.field1271.field3653 == arg0 && var2.field1271.method4695()) {
                int var4 = var2.field1129 >> 7;
                int var5 = var2.field1116 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1128 == 1 && (var2.field1129 & 0x7F) == 64 && (var2.field1116 & 0x7F) == 64) {
                        if (field929 == field1028[var4][var5]) {
                            continue;
                        }
                        field1028[var4][var5] = field929;
                    }
                    if (!var2.field1271.field3661) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field291.method2723(Statics.field706, var2.field1129, var2.field1116, method1017(var2.field1129 + (var2.field1128 * 64 - 64), var2.field1116 + (var2.field1128 * 64 - 64), Statics.field706), var2.field1128 * 64 - 64 + 60, var2, var2.field1117, var3, var2.field1118);
                }
            }
        }
    }

    @ObfuscatedName("cg.gq(B)V")
    public static final void method1811() {
        for (class91 var0 = (class91) field957.method3752(); var0 != null; var0 = (class91) field957.method3762()) {
            if (Statics.field706 != var0.field1360 || field1036 > var0.field1366) {
                var0.method3740();
            } else if (field1036 >= var0.field1365) {
                if (var0.field1369 > 0) {
                    class84 var1 = field880[var0.field1369 - 1];
                    if (var1 != null && var1.field1129 >= 0 && var1.field1129 < 13312 && var1.field1116 >= 0 && var1.field1116 < 13312) {
                        var0.method1816(var1.field1129, var1.field1116, method1017(var1.field1129, var1.field1116, var0.field1360) - var0.field1380, field1036);
                    }
                }
                if (var0.field1369 < 0) {
                    int var2 = -var0.field1369 - 1;
                    class72 var3;
                    if (field946 == var2) {
                        var3 = Statics.field1754;
                    } else {
                        var3 = field945[var2];
                    }
                    if (var3 != null && var3.field1129 >= 0 && var3.field1129 < 13312 && var3.field1116 >= 0 && var3.field1116 < 13312) {
                        var0.method1816(var3.field1129, var3.field1116, method1017(var3.field1129, var3.field1116, var0.field1360) - var0.field1380, field1036);
                    }
                }
                var0.method1817(field1092);
                Statics.field291.method2723(Statics.field706, (int) var0.field1375, (int) var0.field1372, (int) var0.field1373, 60, var0, var0.field1379, -1, false);
            }
        }
    }

    @ObfuscatedName("q.gz(I)I")
    public static final int method83() {
        if (Statics.field263.field1203) {
            return Statics.field706;
        }
        int var0 = 3;
        if (Statics.field784 < 310) {
            int var1 = Statics.field1344 >> 7;
            int var2 = Statics.field16 >> 7;
            int var3 = Statics.field1754.field1129 >> 7;
            int var4 = Statics.field1754.field1116 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field706;
            }
            if ((class63.field723[Statics.field706][var1][var2] & 0x4) != 0) {
                var0 = Statics.field706;
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
                    if ((class63.field723[Statics.field706][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field706;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class63.field723[Statics.field706][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field706;
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
                    if ((class63.field723[Statics.field706][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field706;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class63.field723[Statics.field706][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field706;
                        }
                    }
                }
            }
        }
        if (Statics.field1754.field1129 >= 0 && Statics.field1754.field1116 >= 0 && Statics.field1754.field1129 < 13312 && Statics.field1754.field1116 < 13312) {
            if ((class63.field723[Statics.field706][Statics.field1754.field1129 >> 7][Statics.field1754.field1116 >> 7] & 0x4) != 0) {
                var0 = Statics.field706;
            }
            return var0;
        } else {
            return Statics.field706;
        }
    }

    @ObfuscatedName("bs.gm(B)I")
    public static final int method1543() {
        if (Statics.field263.field1203) {
            return Statics.field706;
        } else {
            int var0 = method1017(Statics.field1344, Statics.field16, Statics.field706);
            return var0 - Statics.field2664 >= 800 || (class63.field723[Statics.field706][Statics.field1344 >> 7][Statics.field16 >> 7] & 0x4) == 0 ? 3 : Statics.field706;
        }
    }

    @ObfuscatedName("bx.gx(III)V")
    public static final void method1009(int arg0, int arg1) {
        if (field1001 == 2) {
            method2187((field861 - Statics.field3737 << 7) + field864, (field862 - Statics.field435 << 7) + field865, field863 * 2);
            if (field930 > -1 && field1036 % 20 < 10) {
                Statics.field1584[0].method5302(field930 + arg0 - 12, field998 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("i.gc(Lbe;IIIIIB)V")
    public static final void method13(class75 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1046()) {
            return;
        }
        if (arg0 instanceof class84) {
            class270 var6 = ((class84) arg0).field1271;
            if (var6.field3657 != null) {
                var6 = var6.method4696();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class93.field1388;
        int[] var8 = class93.field1394;
        int var9 = 3;
        if (!arg0.field1140.method3708()) {
            method7(arg0, arg0.field1165 + 15);
            for (class83 var10 = (class83) arg0.field1140.method3723(); var10 != null; var10 = (class83) arg0.field1140.method3705()) {
                class76 var11 = var10.method1723(field1036);
                if (var11 != null) {
                    class260 var12 = var10.field1266;
                    class310 var13 = var12.method4466();
                    class310 var14 = var12.method4465();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3456;
                    } else {
                        if (var12.field3457 * 2 < var14.field3900) {
                            var15 = var12.field3457;
                        }
                        var16 = var14.field3900 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field1036 - var11.field1180;
                    int var20 = var11.field1177 * var16 / var12.field3456;
                    int var23;
                    if (var11.field1178 > var19) {
                        int var21 = var12.field3452 == 0 ? 0 : var19 / var12.field3452 * var12.field3452;
                        int var22 = var11.field1176 * var16 / var12.field3456;
                        var23 = (var20 - var22) * var21 / var11.field1178 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1178 + var12.field3453 - var19;
                        if (var12.field3451 >= 0) {
                            var17 = (var24 << 8) / (var12.field3453 - var12.field3451);
                        }
                    }
                    if (var11.field1177 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field930 + arg2 - (var16 >> 1);
                    int var26 = field998 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field930 > -1) {
                            class306.method5225(var25, var26, var23, 5, 65280);
                            class306.method5225(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3899;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method5308(var27, var26, var17);
                            class306.method5182(var27, var26, var27 + var28, var26 + var29);
                            var14.method5308(var27, var26, var17);
                        } else {
                            var13.method5302(var27, var26);
                            class306.method5182(var27, var26, var27 + var28, var26 + var29);
                            var14.method5302(var27, var26);
                        }
                        class306.method5181(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1722()) {
                    var10.method3740();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class72 var30 = (class72) arg0;
            if (var30.field827) {
                return;
            }
            if (var30.field809 != -1 || var30.field810 != -1) {
                method7(arg0, arg0.field1165 + 15);
                if (field930 > -1) {
                    if (var30.field809 != -1) {
                        Statics.field982[var30.field809].method5302(field930 + arg2 - 12, field998 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field810 != -1) {
                        Statics.field749[var30.field810].method5302(field930 + arg2 - 12, field998 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field1001 == 10 && field860 == var8[arg1]) {
                method7(arg0, arg0.field1165 + 15);
                if (field930 > -1) {
                    Statics.field1584[1].method5302(field930 + arg2 - 12, field998 + arg3 - var9);
                }
            }
        } else {
            class270 var31 = ((class84) arg0).field1271;
            if (var31.field3657 != null) {
                var31 = var31.method4696();
            }
            if (var31.field3656 >= 0 && var31.field3656 < Statics.field749.length) {
                method7(arg0, arg0.field1165 + 15);
                if (field930 > -1) {
                    Statics.field749[var31.field3656].method5302(field930 + arg2 - 12, field998 + arg3 - 30);
                }
            }
            if (field1001 == 1 && field844 == field882[arg1 - var7] && field1036 % 20 < 10) {
                method7(arg0, arg0.field1165 + 15);
                if (field930 > -1) {
                    Statics.field1584[0].method5302(field930 + arg2 - 12, field998 + arg3 - 28);
                }
            }
        }
        if (arg0.field1139 != null && (arg1 >= var7 || !arg0.field1130 && (field1041 == 4 || !arg0.field1120 && (field1041 == 0 || field1041 == 3 || field1041 == 1 && ((class72) arg0).method1032())))) {
            method7(arg0, arg0.field1165);
            if (field930 > -1 && field918 < field972) {
                field923[field918] = Statics.field3322.method4998(arg0.field1139) / 2;
                field1057[field918] = Statics.field3322.field3782;
                field888[field918] = field930;
                field921[field918] = field998;
                field1081[field918] = arg0.field1132;
                field925[field918] = arg0.field1133;
                field926[field918] = arg0.field1131;
                field927[field918] = arg0.field1139;
                field918++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1137[var32];
            int var34 = arg0.field1135[var32];
            class266 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field1036) {
                    continue;
                }
                var35 = class266.method176(arg0.field1135[var32]);
                var36 = var35.field3500;
                if (var35 != null && var35.field3515 != null) {
                    var35 = var35.method4557();
                    if (var35 == null) {
                        arg0.field1137[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1172[var32];
            class266 var38 = null;
            if (var37 >= 0) {
                var38 = class266.method176(var37);
                if (var38 != null && var38.field3515 != null) {
                    var38 = var38.method4557();
                }
            }
            if (var33 - var36 <= field1036) {
                if (var35 == null) {
                    arg0.field1137[var32] = -1;
                } else {
                    method7(arg0, arg0.field1165 / 2);
                    if (field930 > -1) {
                        if (var32 == 1) {
                            field998 -= 20;
                        }
                        if (var32 == 2) {
                            field930 -= 15;
                            field998 -= 10;
                        }
                        if (var32 == 3) {
                            field930 += 15;
                            field998 -= 10;
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
                        class310 var51 = null;
                        class310 var52 = null;
                        class310 var53 = null;
                        class310 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class310 var64 = var35.method4575();
                        if (var64 != null) {
                            var43 = var64.field3900;
                            int var65 = var64.field3899;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3906;
                        }
                        class310 var66 = var35.method4560();
                        if (var66 != null) {
                            var44 = var66.field3900;
                            int var67 = var66.field3899;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3906;
                        }
                        class310 var68 = var35.method4571();
                        if (var68 != null) {
                            var45 = var68.field3900;
                            int var69 = var68.field3899;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3906;
                        }
                        class310 var70 = var35.method4562();
                        if (var70 != null) {
                            var46 = var70.field3900;
                            int var71 = var70.field3899;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3906;
                        }
                        if (var38 != null) {
                            var51 = var38.method4575();
                            if (var51 != null) {
                                var55 = var51.field3900;
                                int var72 = var51.field3899;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3906;
                            }
                            var52 = var38.method4560();
                            if (var52 != null) {
                                var56 = var52.field3900;
                                int var73 = var52.field3899;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3906;
                            }
                            var53 = var38.method4571();
                            if (var53 != null) {
                                var57 = var53.field3900;
                                int var74 = var53.field3899;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3906;
                            }
                            var54 = var38.method4562();
                            if (var54 != null) {
                                var58 = var54.field3900;
                                int var75 = var54.field3899;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3906;
                            }
                        }
                        class287 var76 = var35.method4574();
                        if (var76 == null) {
                            var76 = Statics.field12;
                        }
                        class287 var77;
                        if (var38 == null) {
                            var77 = Statics.field12;
                        } else {
                            var77 = var38.method4574();
                            if (var77 == null) {
                                var77 = Statics.field12;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4558(arg0.field1136[var32]);
                        int var83 = var76.method4998(var82);
                        if (var38 != null) {
                            var79 = var38.method4558(arg0.field1149[var32]);
                            var81 = var77.method4998(var79);
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
                        int var100 = arg0.field1137[var32] - field1036;
                        int var101 = var35.field3505 - var35.field3505 * var100 / var35.field3500;
                        int var102 = var35.field3506 * var100 / var35.field3500 + -var35.field3506;
                        int var103 = field930 + arg2 - (var92 >> 1) + var101;
                        int var104 = field998 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3497 + var104 + 15;
                        int var108 = var107 - var76.field3768;
                        int var109 = var76.field3769 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3497 + var104 + 15;
                            int var111 = var110 - var77.field3768;
                            int var112 = var77.field3769 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3507 >= 0) {
                            var115 = (var100 << 8) / (var35.field3500 - var35.field3507);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method5308(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method5308(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method5308(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method5308(var93 + var103 - var50, var104, var115);
                            }
                            var76.method5004(var82, var90 + var103, var107, var35.field3499, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method5308(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method5308(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method5308(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method5308(var97 + var103 - var62, var104, var115);
                                }
                                var77.method5004(var79, var98 + var103, var110, var38.field3499, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method5302(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method5302(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method5302(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method5302(var93 + var103 - var50, var104);
                            }
                            var76.method5015(var82, var90 + var103, var107, var35.field3499 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method5302(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method5302(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method5302(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method5302(var97 + var103 - var62, var104);
                                }
                                var77.method5015(var79, var98 + var103, var110, var38.field3499 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.gs(S)V")
    public static final void method224() {
        field840 = 0;
        int var0 = (Statics.field1754.field1129 >> 7) + Statics.field3737;
        int var1 = (Statics.field1754.field1116 >> 7) + Statics.field435;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field840 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field840 = 1;
        }
        if (field840 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field840 = 0;
        }
    }

    @ObfuscatedName("h.gi(Lbe;IB)V")
    public static final void method7(class75 arg0, int arg1) {
        method2187(arg0.field1129, arg0.field1116, arg1);
    }

    @ObfuscatedName("dh.gf(IIIB)V")
    public static final void method2187(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field930 = -1;
            field998 = -1;
            return;
        }
        int var3 = method1017(arg0, arg1, Statics.field706) - arg2;
        int var4 = arg0 - Statics.field1344;
        int var5 = var3 - Statics.field2664;
        int var6 = arg1 - Statics.field16;
        int var7 = class134.field1918[Statics.field784];
        int var8 = class134.field1903[Statics.field784];
        int var9 = class134.field1918[Statics.field1254];
        int var10 = class134.field1903[Statics.field1254];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field930 = field1087 * var11 / var15 + field1085 / 2;
            field998 = field1087 * var14 / var15 + field1086 / 2;
        } else {
            field930 = -1;
            field998 = -1;
        }
    }

    @ObfuscatedName("bx.gw(IIIB)I")
    public static final int method1017(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class63.field723[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class63.field731[var5][var3][var4] + class63.field731[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class63.field731[var5][var3][var4 + 1] + class63.field731[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("ac.gv(IIIIIII)V")
    public static final void method647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class134.field1918[var6];
            int var12 = class134.field1903[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class134.field1918[var7];
            int var15 = class134.field1903[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1344 = arg0 - var8;
        Statics.field2664 = arg1 - var9;
        Statics.field16 = arg2 - var10;
        Statics.field784 = arg3;
        Statics.field1254 = arg4;
    }

    @ObfuscatedName("e.gu(ZLgt;I)V")
    public static final void method168(boolean arg0, class191 arg1) {
        field985 = arg0;
        if (!field985) {
            int var2 = arg1.method3241();
            int var3 = arg1.method3241();
            int var4 = arg1.method3241();
            Statics.field1098 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1098[var5][var6] = arg1.method3292();
                }
            }
            Statics.field1386 = new int[var4];
            Statics.field577 = new int[var4];
            Statics.field1279 = new int[var4];
            Statics.field14 = new byte[var4][];
            Statics.field572 = new byte[var4][];
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
                        Statics.field1386[var8] = var11;
                        Statics.field577[var8] = Statics.field872.method4201("m" + var9 + "_" + var10);
                        Statics.field1279[var8] = Statics.field872.method4201("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method529(var2, var3, true);
            return;
        }
        int var12 = arg1.method3277();
        boolean var13 = arg1.method3239() == 1;
        int var14 = arg1.method3241();
        int var15 = arg1.method3241();
        arg1.method3558();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3538(1);
                    if (var19 == 1) {
                        field898[var16][var17][var18] = arg1.method3538(26);
                    } else {
                        field898[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3535();
        Statics.field1098 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field1098[var20][var21] = arg1.method3292();
            }
        }
        Statics.field1386 = new int[var15];
        Statics.field577 = new int[var15];
        Statics.field1279 = new int[var15];
        Statics.field14 = new byte[var15][];
        Statics.field572 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field898[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field1386[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field1386[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field577[var22] = Statics.field872.method4201("m" + var31 + "_" + var32);
                            Statics.field1279[var22] = Statics.field872.method4201("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method529(var12, var14, !var13);
    }

    @ObfuscatedName("ao.gr(IIZI)V")
    public static final void method529(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field799 == arg0 && Statics.field1441 == arg1) {
            return;
        }
        Statics.field799 = arg0;
        Statics.field1441 = arg1;
        method1754(25);
        method38(class237.field3184, true);
        int var3 = Statics.field3737;
        int var4 = Statics.field435;
        Statics.field3737 = (arg0 - 6) * 8;
        Statics.field435 = (arg1 - 6) * 8;
        int var5 = Statics.field3737 - var3;
        int var6 = Statics.field435 - var4;
        int var7 = Statics.field3737;
        int var8 = Statics.field435;
        for (int var9 = 0; var9 < 32768; var9++) {
            class84 var10 = field880[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1170[var11] -= var5;
                    var10.field1174[var11] -= var6;
                }
                var10.field1129 -= var5 * 128;
                var10.field1116 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class72 var13 = field945[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1170[var14] -= var5;
                    var13.field1174[var14] -= var6;
                }
                var13.field1129 -= var5 * 128;
                var13.field1116 -= var6 * 128;
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
                        field955[var25][var21][var22] = field955[var25][var23][var24];
                    } else {
                        field955[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class74 var26 = (class74) field990.method3752(); var26 != null; var26 = (class74) field990.method3762()) {
            var26.field1112 -= var5;
            var26.field1103 -= var6;
            if (var26.field1112 < 0 || var26.field1103 < 0 || var26.field1112 >= 104 || var26.field1103 >= 104) {
                var26.method3740();
            }
        }
        if (field984 != 0) {
            field984 -= var5;
            field1056 -= var6;
        }
        field1063 = 0;
        field1069 = false;
        field1050 = -1;
        field924.method3746();
        field957.method3746();
        for (int var27 = 0; var27 < 4; var27++) {
            field896[var27].method3084();
        }
    }

    @ObfuscatedName("ig.he(ZI)V")
    public static final void method4164(boolean arg0) {
        method3498();
        field938.field1450++;
        if (field938.field1450 < 50 && !arg0) {
            return;
        }
        field938.field1450 = 0;
        if (field887 || field938.method1911() == null) {
            return;
        }
        class175 var1 = class175.method1891(class172.field2346, field938.field1455);
        field938.method1907(var1);
        try {
            field938.method1906();
        } catch (IOException var3) {
            field887 = true;
        }
    }

    @ObfuscatedName("v.hq(IB)V")
    public static final void method170(int arg0) {
        int[] var1 = Statics.field1577.field3901;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class63.field723[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field291.method2792(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class63.field723[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field291.method2792(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1577.method5295();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class63.field723[arg0][var10][var9] & 0x18) == 0) {
                    method1716(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class63.field723[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method1716(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1051 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field291.method2741(Statics.field706, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class267.method4025(var14).field3546;
                    if (var15 >= 0) {
                        field1054[field1051] = Statics.field3378[var15].method4354(false);
                        field1035[field1051] = var11;
                        field1053[field1051] = var12;
                        field1051++;
                    }
                }
            }
        }
        Statics.field336.method5267();
    }

    @ObfuscatedName("ce.hp(IIIIII)V")
    public static final void method1716(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field291.method2738(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field291.method2756(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1577.field3901;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class267 var13 = class267.method4025(var12);
            if (var13.field3538 == -1) {
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
                class309 var14 = Statics.field1331[var13.field3538];
                if (var14 != null) {
                    int var15 = (var13.field3537 * 4 - var14.field3889) / 2;
                    int var16 = (var13.field3534 * 4 - var14.field3892) / 2;
                    var14.method5271(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3534) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field291.method2740(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field291.method2756(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class267 var22 = class267.method4025(var21);
            if (var22.field3538 != -1) {
                class309 var23 = Statics.field1331[var22.field3538];
                if (var23 != null) {
                    int var24 = (var22.field3537 * 4 - var23.field3889) / 2;
                    int var25 = (var22.field3534 * 4 - var23.field3892) / 2;
                    var23.method5271(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3534) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1577.field3901;
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
        int var29 = Statics.field291.method2741(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class267 var31 = class267.method4025(var30);
        if (var31.field3538 == -1) {
            return;
        }
        class309 var32 = Statics.field1331[var31.field3538];
        if (var32 != null) {
            int var33 = (var31.field3537 * 4 - var32.field3889) / 2;
            int var34 = (var31.field3534 * 4 - var32.field3892) / 2;
            var32.method5271(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3534) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.hb(Lca;I)Z")
    public final boolean method1096(class99 arg0) {
        class160 var2 = arg0.method1911();
        class191 var3 = arg0.field1454;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1451 == null) {
                if (arg0.field1453) {
                    if (!var2.method3018(1)) {
                        return false;
                    }
                    var2.method3021(arg0.field1454.field2512, 0, 1);
                    arg0.field1457 = 0;
                    arg0.field1453 = false;
                }
                var3.field2514 = 0;
                if (var3.method3534()) {
                    if (!var2.method3018(1)) {
                        return false;
                    }
                    var2.method3021(arg0.field1454.field2512, 1, 1);
                    arg0.field1457 = 0;
                }
                arg0.field1453 = true;
                class171[] var4 = class171.method3075();
                int var5 = var3.method3559();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field2514);
                }
                arg0.field1451 = var4[var5];
                arg0.field1452 = arg0.field1451.field2319;
            }
            if (arg0.field1452 == -1) {
                if (!var2.method3018(1)) {
                    return false;
                }
                arg0.method1911().method3021(var3.field2512, 0, 1);
                arg0.field1452 = var3.field2512[0] & 0xFF;
            }
            if (arg0.field1452 == -2) {
                if (!var2.method3018(2)) {
                    return false;
                }
                arg0.method1911().method3021(var3.field2512, 0, 2);
                var3.field2514 = 0;
                arg0.field1452 = var3.method3241();
            }
            if (!var2.method3018(arg0.field1452)) {
                return false;
            }
            var3.field2514 = 0;
            var2.method3021(var3.field2512, 0, arg0.field1452);
            arg0.field1457 = 0;
            field889.method5141();
            arg0.field1458 = arg0.field1447;
            arg0.field1447 = arg0.field1456;
            arg0.field1456 = arg0.field1451;
            if (class171.field2263 == arg0.field1451) {
                Statics.field473.method1568();
                field1018 = field1010;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2266 == arg0.field1451) {
                method479(class174.field2428);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2242 == arg0.field1451) {
                method153();
                field935 = var3.method3221();
                field1022 = field1010;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2310 == arg0.field1451) {
                class305.method5111(var3, arg0.field1452);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2257 == arg0.field1451) {
                method467();
                arg0.field1451 = null;
                return false;
            }
            if (class171.field2317 == arg0.field1451) {
                method153();
                int var6 = var3.method3269();
                int var7 = var3.method3269();
                int var8 = var3.method3288();
                field961[var7] = var8;
                field959[var7] = var6;
                field960[var7] = 1;
                for (int var9 = 0; var9 < 98; var9++) {
                    if (var8 >= class234.field2942[var9]) {
                        field960[var7] = var9 + 2;
                    }
                }
                field1015[++field997 - 1 & 0x1F] = var7;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2251 == arg0.field1451) {
                boolean var10 = var3.method3239() == 1;
                int var11 = var3.method3287();
                class228 var12 = class228.method3956(var11);
                if (var12.field2775 != var10) {
                    var12.field2775 = var10;
                    method313(var12);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2281 == arg0.field1451) {
                int var13 = var3.method3241();
                field859 = var13;
                this.method1100(false);
                method86(var13);
                class81.method2708(field859);
                for (int var14 = 0; var14 < 100; var14++) {
                    field1030[var14] = true;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2256 == arg0.field1451) {
                var3.field2514 += 28;
                if (var3.method3263()) {
                    method2172(var3, var3.field2514 - 28);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2292 == arg0.field1451) {
                field1069 = true;
                Statics.field27 = var3.method3239();
                Statics.field716 = var3.method3239();
                Statics.field2700 = var3.method3241();
                Statics.field382 = var3.method3239();
                Statics.field11 = var3.method3239();
                if (Statics.field11 >= 100) {
                    int var15 = Statics.field27 * 128 + 64;
                    int var16 = Statics.field716 * 128 + 64;
                    int var17 = method1017(var15, var16, Statics.field706) - Statics.field2700;
                    int var18 = var15 - Statics.field1344;
                    int var19 = var17 - Statics.field2664;
                    int var20 = var16 - Statics.field16;
                    int var21 = (int) Math.sqrt((double) (var18 * var18 + var20 * var20));
                    Statics.field784 = (int) (Math.atan2((double) var19, (double) var21) * 325.949D) & 0x7FF;
                    Statics.field1254 = (int) (Math.atan2((double) var18, (double) var20) * -325.949D) & 0x7FF;
                    if (Statics.field784 < 128) {
                        Statics.field784 = 128;
                    }
                    if (Statics.field784 > 383) {
                        Statics.field784 = 383;
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2243 == arg0.field1451) {
                int var22 = var3.method3292();
                class67 var23 = (class67) field1052.method3704((long) var22);
                if (var23 != null) {
                    method2911(var23, true);
                }
                if (field886 != null) {
                    method313(field886);
                    field886 = null;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2303 == arg0.field1451) {
                for (int var24 = 0; var24 < field945.length; var24++) {
                    if (field945[var24] != null) {
                        field945[var24].field1147 = -1;
                    }
                }
                for (int var25 = 0; var25 < field880.length; var25++) {
                    if (field880[var25] != null) {
                        field880[var25].field1147 = -1;
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2312 == arg0.field1451) {
                field1042 = var3.method3267();
                field1041 = var3.method3239();
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2241 == arg0.field1451) {
                method168(false, arg0.field1454);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2300 == arg0.field1451) {
                int var26 = var3.method3241();
                if (var26 == 65535) {
                    var26 = -1;
                }
                method1864(var26);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2284 == arg0.field1451) {
                int var27 = var3.method3276();
                if (var27 == 65535) {
                    var27 = -1;
                }
                int var28 = var3.method3283();
                if (field1058 != 0 && var27 != -1) {
                    class215.method8(Statics.field633, var27, 0, field1058, false);
                    field1060 = true;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2259 == arg0.field1451) {
                field1069 = false;
                for (int var29 = 0; var29 < 5; var29++) {
                    field1070[var29] = false;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2237 == arg0.field1451) {
                method479(class174.field2434);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2279 == arg0.field1451) {
                method479(class174.field2435);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2308 == arg0.field1451) {
                method479(class174.field2432);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2309 == arg0.field1451) {
                int var30 = var3.method3241();
                int var31 = var3.method3239();
                int var32 = var3.method3241();
                if (field1059 != 0 && var31 != 0 && field1063 < 50) {
                    field1064[field1063] = var30;
                    field1065[field1063] = var31;
                    field1089[field1063] = var32;
                    field1068[field1063] = null;
                    field1067[field1063] = 0;
                    field1063++;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2286 == arg0.field1451) {
                int var36 = var3.method3287();
                class228 var37 = class228.method3956(var36);
                var37.field2798 = 3;
                var37.field2799 = Statics.field1754.field820.method4076();
                method313(var37);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2240 == arg0.field1451) {
                int var38 = arg0.field1452;
                int var39 = var3.field2514;
                class93.field1400 = 0;
                int var40 = 0;
                var3.method3558();
                for (int var41 = 0; var41 < class93.field1388; var41++) {
                    int var42 = class93.field1394[var41];
                    if ((class93.field1390[var42] & 0x1) == 0) {
                        if (var40 > 0) {
                            var40--;
                            class93.field1390[var42] = (byte) (class93.field1390[var42] | 0x2);
                        } else {
                            int var43 = var3.method3538(1);
                            if (var43 == 0) {
                                var40 = class93.method1701(var3);
                                class93.field1390[var42] = (byte) (class93.field1390[var42] | 0x2);
                            } else {
                                class93.method1743(var3, var42);
                            }
                        }
                    }
                }
                var3.method3535();
                if (var40 != 0) {
                    throw new RuntimeException();
                }
                var3.method3558();
                for (int var44 = 0; var44 < class93.field1388; var44++) {
                    int var45 = class93.field1394[var44];
                    if ((class93.field1390[var45] & 0x1) != 0) {
                        if (var40 > 0) {
                            var40--;
                            class93.field1390[var45] = (byte) (class93.field1390[var45] | 0x2);
                        } else {
                            int var46 = var3.method3538(1);
                            if (var46 == 0) {
                                var40 = class93.method1701(var3);
                                class93.field1390[var45] = (byte) (class93.field1390[var45] | 0x2);
                            } else {
                                class93.method1743(var3, var45);
                            }
                        }
                    }
                }
                var3.method3535();
                if (var40 != 0) {
                    throw new RuntimeException();
                }
                var3.method3558();
                for (int var47 = 0; var47 < class93.field1395; var47++) {
                    int var48 = class93.field1403[var47];
                    if ((class93.field1390[var48] & 0x1) != 0) {
                        if (var40 > 0) {
                            var40--;
                            class93.field1390[var48] = (byte) (class93.field1390[var48] | 0x2);
                        } else {
                            int var49 = var3.method3538(1);
                            if (var49 == 0) {
                                var40 = class93.method1701(var3);
                                class93.field1390[var48] = (byte) (class93.field1390[var48] | 0x2);
                            } else if (class93.method1598(var3, var48)) {
                                class93.field1390[var48] = (byte) (class93.field1390[var48] | 0x2);
                            }
                        }
                    }
                }
                var3.method3535();
                if (var40 != 0) {
                    throw new RuntimeException();
                }
                var3.method3558();
                for (int var50 = 0; var50 < class93.field1395; var50++) {
                    int var51 = class93.field1403[var50];
                    if ((class93.field1390[var51] & 0x1) == 0) {
                        if (var40 > 0) {
                            var40--;
                            class93.field1390[var51] = (byte) (class93.field1390[var51] | 0x2);
                        } else {
                            int var52 = var3.method3538(1);
                            if (var52 == 0) {
                                var40 = class93.method1701(var3);
                                class93.field1390[var51] = (byte) (class93.field1390[var51] | 0x2);
                            } else if (class93.method1598(var3, var51)) {
                                class93.field1390[var51] = (byte) (class93.field1390[var51] | 0x2);
                            }
                        }
                    }
                }
                var3.method3535();
                if (var40 != 0) {
                    throw new RuntimeException();
                }
                class93.field1388 = 0;
                class93.field1395 = 0;
                for (int var53 = 1; var53 < 2048; var53++) {
                    class93.field1390[var53] = (byte) (class93.field1390[var53] >> 1);
                    class72 var54 = field945[var53];
                    if (var54 == null) {
                        class93.field1403[++class93.field1395 - 1] = var53;
                    } else {
                        class93.field1394[++class93.field1388 - 1] = var53;
                    }
                }
                for (int var55 = 0; var55 < class93.field1400; var55++) {
                    int var56 = class93.field1401[var55];
                    class72 var57 = field945[var56];
                    int var58 = var3.method3239();
                    if ((var58 & 0x2) != 0) {
                        var58 += var3.method3239() << 8;
                    }
                    class93.method3135(var3, var56, var57, var58);
                }
                if (var3.field2514 - var39 != var38) {
                    throw new RuntimeException(var3.field2514 - var39 + " " + var38);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2291 == arg0.field1451) {
                String var59 = var3.method3248();
                Object[] var60 = new Object[var59.length() + 1];
                for (int var61 = var59.length() - 1; var61 >= 0; var61--) {
                    if (var59.charAt(var61) == 's') {
                        var60[var61 + 1] = var3.method3248();
                    } else {
                        var60[var61 + 1] = Integer.valueOf(var3.method3292());
                    }
                }
                var60[0] = Integer.valueOf(var3.method3292());
                class68 var62 = new class68();
                var62.field787 = var60;
                class81.method1742(var62);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2293 == arg0.field1451) {
                int var63 = var3.method3292();
                int var64 = var3.method3241();
                if (var63 < -70000) {
                    var64 += 32768;
                }
                class228 var65;
                if (var63 >= 0) {
                    var65 = class228.method3956(var63);
                } else {
                    var65 = null;
                }
                while (var3.field2514 < arg0.field1452) {
                    int var66 = var3.method3253();
                    int var67 = var3.method3241();
                    int var68 = 0;
                    if (var67 != 0) {
                        var68 = var3.method3239();
                        if (var68 == 255) {
                            var68 = var3.method3292();
                        }
                    }
                    if (var65 != null && var66 >= 0 && var66 < var65.field2876.length) {
                        var65.field2876[var66] = var67;
                        var65.field2874[var66] = var68;
                    }
                    class65.method4911(var64, var66, var67 - 1, var68);
                }
                if (var65 != null) {
                    method313(var65);
                }
                method153();
                field1013[++field1091 - 1 & 0x1F] = var64 & 0x7FFF;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2288 == arg0.field1451) {
                int var69 = var3.method3280();
                int var70 = var3.method3288();
                class228 var71 = class228.method3956(var70);
                if (var71.field2802 != var69 || var69 == -1) {
                    var71.field2802 = var69;
                    var71.field2877 = 0;
                    var71.field2890 = 0;
                    method313(var71);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2272 == arg0.field1451) {
                int var72 = var3.method3276();
                int var73 = var3.method3292();
                class228 var74 = class228.method3956(var73);
                if (var74.field2798 != 1 || var74.field2799 != var72) {
                    var74.field2798 = 1;
                    var74.field2799 = var72;
                    method313(var74);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2289 == arg0.field1451) {
                if (Statics.field334 != null) {
                    Statics.field334.method4952(var3);
                }
                method3114();
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2314 == arg0.field1451) {
                for (int var75 = 0; var75 < Statics.field3374; var75++) {
                    class253 var76 = class253.method3037(var75);
                    if (var76 != null) {
                        class223.field2711[var75] = 0;
                        class223.field2713[var75] = 0;
                    }
                }
                method153();
                field1012 += 32;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2275 == arg0.field1451) {
                for (int var77 = 0; var77 < class223.field2713.length; var77++) {
                    if (class223.field2713[var77] != class223.field2711[var77]) {
                        class223.field2713[var77] = class223.field2711[var77];
                        method2(var77);
                        field1011[++field1012 - 1 & 0x1F] = var77;
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2253 == arg0.field1451) {
                Statics.field473.field1213.method4828(var3, arg0.field1452);
                class95.method3218();
                if (Statics.field334 != null) {
                    Statics.field334.method4950();
                }
                field1018 = field1010;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2290 == arg0.field1451) {
                int var78 = arg0.field1452 + var3.field2514;
                int var79 = var3.method3241();
                int var80 = var3.method3241();
                if (field859 != var79) {
                    field859 = var79;
                    this.method1100(false);
                    method86(field859);
                    class81.method2708(field859);
                    for (int var81 = 0; var81 < 100; var81++) {
                        field1030[var81] = true;
                    }
                }
                while (var80-- > 0) {
                    int var82 = var3.method3292();
                    int var83 = var3.method3241();
                    int var84 = var3.method3239();
                    class67 var85 = (class67) field1052.method3704((long) var82);
                    if (var85 != null && var85.field771 != var83) {
                        method2911(var85, true);
                        var85 = null;
                    }
                    if (var85 == null) {
                        var85 = method2171(var82, var83, var84);
                    }
                    var85.field769 = true;
                }
                for (class67 var86 = (class67) field1052.method3693(); var86 != null; var86 = (class67) field1052.method3694()) {
                    if (var86.field769) {
                        var86.field769 = false;
                    } else {
                        method2911(var86, true);
                    }
                }
                field1027 = new class202(512);
                while (var3.field2514 < var78) {
                    int var87 = var3.method3292();
                    int var88 = var3.method3241();
                    int var89 = var3.method3241();
                    int var90 = var3.method3292();
                    for (int var91 = var88; var91 <= var89; var91++) {
                        long var92 = ((long) var87 << 32) + (long) var91;
                        field1027.method3691(new class210(var90), var92);
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2267 == arg0.field1451) {
                Statics.field372 = var3.method3269();
                Statics.field2115 = var3.method3237();
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2311 == arg0.field1451) {
                Statics.field2115 = var3.method3267();
                Statics.field372 = var3.method3267();
                while (var3.field2514 < arg0.field1452) {
                    int var94 = var3.method3239();
                    class174[] var95 = new class174[] { class174.field2430, class174.field2432, class174.field2433, class174.field2428, class174.field2427, class174.field2431, class174.field2426, class174.field2429, class174.field2434, class174.field2435 };
                    class174 var96 = var95[var94];
                    method479(var96);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2247 == arg0.field1451) {
                method479(class174.field2430);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2246 == arg0.field1451) {
                String var97 = var3.method3248();
                long var98 = (long) var3.method3241();
                long var100 = (long) var3.method3243();
                class242 var102 = (class242) class180.method1823(class242.method2613(), var3.method3239());
                long var103 = (var98 << 32) + var100;
                boolean var105 = false;
                for (int var106 = 0; var106 < 100; var106++) {
                    if (field1044[var106] == var103) {
                        var105 = true;
                        break;
                    }
                }
                if (Statics.field473.method1573(new class281(var97, Statics.field2740))) {
                    var105 = true;
                }
                if (!var105 && field840 == 0) {
                    field1044[field900] = var103;
                    field900 = (field900 + 1) % 100;
                    String var107 = class288.method5002(class294.method3592(class289.method4552(var3)));
                    byte var108;
                    if (var102.field3273) {
                        var108 = 7;
                    } else {
                        var108 = 3;
                    }
                    if (var102.field3271 == -1) {
                        class95.method649(var108, var97, var107);
                    } else {
                        int var110 = var102.field3271;
                        String var111 = "<img=" + var110 + ">";
                        class95.method649(var108, var111 + var97, var107);
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2265 == arg0.field1451) {
                class77 var112 = new class77();
                var112.field1192 = var3.method3248();
                var112.field1189 = var3.method3241();
                int var113 = var3.method3292();
                var112.field1190 = var113;
                method1754(45);
                var2.method3022();
                Object var114 = null;
                class90.method682(var112);
                arg0.field1451 = null;
                return false;
            }
            if (class171.field2244 == arg0.field1451) {
                field979 = var3.method3239();
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2295 == arg0.field1451) {
                int var115 = var3.method3292();
                String var116 = var3.method3248();
                class228 var117 = class228.method3956(var115);
                if (!var116.equals(var117.field2815)) {
                    var117.field2815 = var116;
                    method313(var117);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2294 == arg0.field1451) {
                String var118 = var3.method3248();
                String var119 = class288.method5002(class294.method3592(class289.method4552(var3)));
                class95.method649(6, var118, var119);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2268 == arg0.field1451) {
                int var120 = var3.method3288();
                int var121 = var3.method3287();
                int var122 = var3.method3241();
                if (var122 == 65535) {
                    var122 = -1;
                }
                class228 var123 = class228.method3956(var121);
                if (var123.field2754) {
                    var123.field2875 = var122;
                    var123.field2812 = var120;
                    class268 var125 = class268.method965(var122);
                    var123.field2873 = var125.field3597;
                    var123.field2807 = var125.field3584;
                    var123.field2808 = var125.field3585;
                    var123.field2778 = var125.field3586;
                    var123.field2865 = var125.field3587;
                    var123.field2809 = var125.field3582;
                    if (var125.field3588 == 1) {
                        var123.field2863 = 1;
                    } else {
                        var123.field2863 = 2;
                    }
                    if (var123.field2810 > 0) {
                        var123.field2809 = var123.field2809 * 32 / var123.field2810;
                    } else if (var123.field2766 > 0) {
                        var123.field2809 = var123.field2809 * 32 / var123.field2766;
                    }
                    method313(var123);
                } else if (var122 == -1) {
                    var123.field2798 = 0;
                    arg0.field1451 = null;
                    return true;
                } else {
                    class268 var124 = class268.method965(var122);
                    var123.field2798 = 4;
                    var123.field2799 = var122;
                    var123.field2873 = var124.field3597;
                    var123.field2807 = var124.field3584;
                    var123.field2809 = var124.field3582 * 100 / var120;
                    method313(var123);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2301 == arg0.field1451) {
                field1001 = var3.method3239();
                if (field1001 == 1) {
                    field844 = var3.method3241();
                }
                if (field1001 >= 2 && field1001 <= 6) {
                    if (field1001 == 2) {
                        field864 = 64;
                        field865 = 64;
                    }
                    if (field1001 == 3) {
                        field864 = 0;
                        field865 = 64;
                    }
                    if (field1001 == 4) {
                        field864 = 128;
                        field865 = 64;
                    }
                    if (field1001 == 5) {
                        field864 = 64;
                        field865 = 0;
                    }
                    if (field1001 == 6) {
                        field864 = 64;
                        field865 = 128;
                    }
                    field1001 = 2;
                    field861 = var3.method3241();
                    field862 = var3.method3241();
                    field863 = var3.method3239();
                }
                if (field1001 == 10) {
                    field860 = var3.method3241();
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2306 == arg0.field1451) {
                Statics.method2982(var3.method3248());
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2282 == arg0.field1451) {
                int var126 = var3.method3237();
                String var127 = var3.method3248();
                int var128 = var3.method3239();
                if (var126 >= 1 && var126 <= 8) {
                    if (var127.equalsIgnoreCase("null")) {
                        var127 = null;
                    }
                    field951[var126 - 1] = var127;
                    field845[var126 - 1] = var128 == 0;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2260 == arg0.field1451) {
                int var129 = var3.method3277();
                int var130 = var3.method3287();
                class228 var131 = class228.method3956(var130);
                if (var131 != null && var131.field2864 == 0) {
                    if (var129 > var131.field2785 - var131.field2790) {
                        var129 = var131.field2785 - var131.field2790;
                    }
                    if (var129 < 0) {
                        var129 = 0;
                    }
                    if (var131.field2777 != var129) {
                        var131.field2777 = var129;
                        method313(var131);
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2278 == arg0.field1451) {
                method479(class174.field2431);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2296 == arg0.field1451) {
                Statics.field473.method1607(var3, arg0.field1452);
                field1018 = field1010;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2245 == arg0.field1451) {
                if (arg0.field1452 == 0) {
                    Statics.field334 = null;
                } else {
                    if (Statics.field334 == null) {
                        Statics.field334 = new class282(Statics.field2740, Statics.field2445);
                    }
                    Statics.field334.method4953(var3);
                }
                method3114();
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2299 == arg0.field1451) {
                int var132 = var3.method3292();
                int var133 = var3.method3241();
                class228 var134 = class228.method3956(var132);
                if (var134.field2798 != 2 || var134.field2799 != var133) {
                    var134.field2798 = 2;
                    var134.field2799 = var133;
                    method313(var134);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2276 == arg0.field1451) {
                int var135 = var3.method3253();
                boolean var136 = var3.method3239() == 1;
                String var137 = "";
                boolean var138 = false;
                if (var136) {
                    var137 = var3.method3248();
                    if (Statics.field473.method1573(new class281(var137, Statics.field2740))) {
                        var138 = true;
                    }
                }
                String var139 = var3.method3248();
                if (!var138) {
                    class95.method649(var135, var137, var139);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2269 == arg0.field1451) {
                int var140 = var3.method3239();
                if (var3.method3239() == 0) {
                    field870[var140] = new class17();
                    var3.field2514 += 18;
                } else {
                    var3.field2514--;
                    field870[var140] = new class17(var3, false);
                }
                field1020 = field1010;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2283 == arg0.field1451) {
                method479(class174.field2429);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2315 == arg0.field1451) {
                int var141 = var3.method3241();
                int var142 = var3.method3453();
                int var143 = var141 >> 10 & 0x1F;
                int var144 = var141 >> 5 & 0x1F;
                int var145 = var141 & 0x1F;
                int var146 = (var145 << 3) + (var143 << 19) + (var144 << 11);
                class228 var147 = class228.method3956(var142);
                if (var147.field2780 != var146) {
                    var147.field2780 = var146;
                    method313(var147);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2264 == arg0.field1451) {
                int var148 = var3.method3292();
                int var149 = var3.method3241();
                if (var148 < -70000) {
                    var149 += 32768;
                }
                class228 var150;
                if (var148 >= 0) {
                    var150 = class228.method3956(var148);
                } else {
                    var150 = null;
                }
                if (var150 != null) {
                    for (int var151 = 0; var151 < var150.field2876.length; var151++) {
                        var150.field2876[var151] = 0;
                        var150.field2874[var151] = 0;
                    }
                }
                class65 var152 = (class65) class65.field746.method3704((long) var149);
                if (var152 != null) {
                    for (int var153 = 0; var153 < var152.field748.length; var153++) {
                        var152.field748[var153] = -1;
                        var152.field745[var153] = 0;
                    }
                }
                int var154 = var3.method3241();
                for (int var155 = 0; var155 < var154; var155++) {
                    int var156 = var3.method3267();
                    if (var156 == 255) {
                        var156 = var3.method3287();
                    }
                    int var157 = var3.method3241();
                    if (var150 != null && var155 < var150.field2876.length) {
                        var150.field2876[var155] = var157;
                        var150.field2874[var155] = var156;
                    }
                    class65.method4911(var149, var155, var157 - 1, var156);
                }
                if (var150 != null) {
                    method313(var150);
                }
                method153();
                field1013[++field1091 - 1 & 0x1F] = var149 & 0x7FFF;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2277 == arg0.field1451) {
                field1069 = true;
                Statics.field2529 = var3.method3239();
                Statics.field3816 = var3.method3239();
                Statics.field312 = var3.method3241();
                Statics.field3296 = var3.method3239();
                Statics.field270 = var3.method3239();
                if (Statics.field270 >= 100) {
                    Statics.field1344 = Statics.field2529 * 128 + 64;
                    Statics.field16 = Statics.field3816 * 128 + 64;
                    Statics.field2664 = method1017(Statics.field1344, Statics.field16, Statics.field706) - Statics.field312;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2287 == arg0.field1451) {
                int var158 = var3.method3277();
                int var159 = var3.method3453();
                class223.field2711[var158] = var159;
                if (class223.field2713[var158] != var159) {
                    class223.field2713[var158] = var159;
                }
                method2(var158);
                field1011[++field1012 - 1 & 0x1F] = var158;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2270 == arg0.field1451) {
                int var160 = var3.method3239();
                int var161 = var3.method3239();
                int var162 = var3.method3239();
                int var163 = var3.method3239();
                field1070[var160] = true;
                field999[var160] = var161;
                field933[var160] = var162;
                field1073[var160] = var163;
                field1074[var160] = 0;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2298 == arg0.field1451) {
                field995 = var3.method3277() * 30;
                field1022 = field1010;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2261 == arg0.field1451) {
                int var164 = var3.method3241();
                byte var165 = var3.method3271();
                class223.field2711[var164] = var165;
                if (class223.field2713[var164] != var165) {
                    class223.field2713[var164] = var165;
                }
                method2(var164);
                field1011[++field1012 - 1 & 0x1F] = var164;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2280 == arg0.field1451) {
                int var166 = var3.method3276();
                Statics.method972(var166);
                field1013[++field1091 - 1 & 0x1F] = var166 & 0x7FFF;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2316 == arg0.field1451) {
                int var167 = var3.method3279();
                int var168 = var3.method3221();
                int var169 = var3.method3453();
                class228 var170 = class228.method3956(var169);
                if (var170.field2764 != var168 || var170.field2765 != var167 || var170.field2771 != 0 || var170.field2761 != 0) {
                    var170.field2764 = var168;
                    var170.field2765 = var167;
                    var170.field2771 = 0;
                    var170.field2761 = 0;
                    method313(var170);
                    this.method1443(var170);
                    if (var170.field2864 == 0) {
                        method15(Statics.field713[var169 >> 16], var170, false);
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2285 == arg0.field1451) {
                int var171 = var3.method3292();
                int var172 = var3.method3278();
                if (var172 == 65535) {
                    var172 = -1;
                }
                int var173 = var3.method3287();
                int var174 = var3.method3241();
                if (var174 == 65535) {
                    var174 = -1;
                }
                for (int var175 = var172; var175 <= var174; var175++) {
                    long var176 = ((long) var173 << 32) + (long) var175;
                    class204 var178 = field1027.method3704(var176);
                    if (var178 != null) {
                        var178.method3740();
                    }
                    field1027.method3691(new class210(var171), var176);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2238 == arg0.field1451) {
                method168(true, arg0.field1454);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2302 == arg0.field1451) {
                method479(class174.field2426);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2239 == arg0.field1451) {
                int var179 = var3.method3278();
                int var180 = var3.method3276();
                int var181 = var3.method3292();
                class228 var182 = class228.method3956(var181);
                var182.field2811 = (var180 << 16) + var179;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2307 == arg0.field1451) {
                int var183 = var3.method3453();
                class228 var184 = class228.method3956(var183);
                for (int var185 = 0; var185 < var184.field2876.length; var185++) {
                    var184.field2876[var185] = -1;
                    var184.field2876[var185] = 0;
                }
                method313(var184);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2258 == arg0.field1451) {
                method153();
                field919 = var3.method3239();
                field1022 = field1010;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2262 == arg0.field1451) {
                field984 = var3.method3239();
                if (field984 == 255) {
                    field984 = 0;
                }
                field1056 = var3.method3239();
                if (field1056 == 255) {
                    field1056 = 0;
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2250 == arg0.field1451) {
                method479(class174.field2433);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2248 == arg0.field1451) {
                method152(false, var3);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2249 == arg0.field1451) {
                int var186 = var3.method3239();
                class302[] var187 = new class302[] { class302.field3854, class302.field3855, class302.field3856 };
                class302[] var188 = var187;
                int var189 = 0;
                class302 var191;
                while (true) {
                    if (var189 >= var188.length) {
                        var191 = null;
                        break;
                    }
                    class302 var190 = var188[var189];
                    if (var190.field3857 == var186) {
                        var191 = var190;
                        break;
                    }
                    var189++;
                }
                Statics.field2186 = var191;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2304 == arg0.field1451) {
                int var192 = var3.method3241();
                int var193 = var3.method3453();
                int var194 = var3.method3269();
                class67 var195 = (class67) field1052.method3704((long) var193);
                if (var195 != null) {
                    method2911(var195, var195.field771 != var192);
                }
                method2171(var193, var192, var194);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2273 == arg0.field1451) {
                boolean var196 = var3.method3239() == 1;
                if (var196) {
                    Statics.field767 = class187.method2705() - var3.method3405();
                    Statics.field1892 = new class14(var3, true);
                } else {
                    Statics.field1892 = null;
                }
                field1021 = field1010;
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2254 == arg0.field1451) {
                int var197 = var3.method3292();
                int var198 = var3.method3292();
                int var199 = 0;
                if (Statics.field2540 == null || !Statics.field2540.isValid()) {
                    try {
                        Iterator var200 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var200.hasNext()) {
                            GarbageCollectorMXBean var201 = (GarbageCollectorMXBean) var200.next();
                            if (var201.isValid()) {
                                Statics.field2540 = var201;
                                field658 = -1L;
                                field679 = -1L;
                            }
                        }
                    } catch (Throwable var249) {
                    }
                }
                if (Statics.field2540 != null) {
                    long var203 = class187.method2705();
                    long var205 = Statics.field2540.getCollectionTime();
                    if (field679 != -1L) {
                        long var207 = var205 - field679;
                        long var209 = var203 - field658;
                        if (var209 != 0L) {
                            var199 = (int) (var207 * 100L / var209);
                        }
                    }
                    field679 = var205;
                    field658 = var203;
                }
                class175 var213 = class175.method1891(class172.field2326, field938.field1455);
                var213.field2440.method3265(var199);
                var213.field2440.method3285(var197);
                var213.field2440.method3285(var198);
                var213.field2440.method3266(field656);
                field938.method1907(var213);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2274 == arg0.field1451) {
                if (field859 != -1) {
                    int var214 = field859;
                    if (class228.method3132(var214)) {
                        method241(Statics.field713[var214], 0);
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2255 == arg0.field1451) {
                String var215 = var3.method3248();
                long var216 = var3.method3405();
                long var218 = (long) var3.method3241();
                long var220 = (long) var3.method3243();
                class242 var222 = (class242) class180.method1823(class242.method2613(), var3.method3239());
                long var223 = (var218 << 32) + var220;
                boolean var225 = false;
                for (int var226 = 0; var226 < 100; var226++) {
                    if (field1044[var226] == var223) {
                        var225 = true;
                        break;
                    }
                }
                if (var222.field3274 && Statics.field473.method1573(new class281(var215, Statics.field2740))) {
                    var225 = true;
                }
                if (!var225 && field840 == 0) {
                    field1044[field900] = var223;
                    field900 = (field900 + 1) % 100;
                    String var227 = class288.method5002(class294.method3592(class289.method4552(var3)));
                    if (var222.field3271 == -1) {
                        class95.method1730(9, var215, var227, class292.method1908(var216));
                    } else {
                        int var228 = var222.field3271;
                        String var229 = "<img=" + var228 + ">";
                        class95.method1730(9, var229 + var215, var227, class292.method1908(var216));
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2313 == arg0.field1451) {
                int var230 = var3.method3277();
                int var231 = var3.method3278();
                int var232 = var3.method3277();
                int var233 = var3.method3288();
                class228 var234 = class228.method3956(var233);
                if (var234.field2873 != var230 || var234.field2807 != var231 || var234.field2809 != var232) {
                    var234.field2873 = var230;
                    var234.field2807 = var231;
                    var234.field2809 = var232;
                    method313(var234);
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2271 == arg0.field1451) {
                method152(true, var3);
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2252 == arg0.field1451) {
                Statics.field372 = var3.method3239();
                Statics.field2115 = var3.method3237();
                for (int var235 = Statics.field372; var235 < Statics.field372 + 8; var235++) {
                    for (int var236 = Statics.field2115; var236 < Statics.field2115 + 8; var236++) {
                        if (field955[Statics.field706][var235][var236] != null) {
                            field955[Statics.field706][var235][var236] = null;
                            method95(var235, var236);
                        }
                    }
                }
                for (class74 var237 = (class74) field990.method3752(); var237 != null; var237 = (class74) field990.method3762()) {
                    if (var237.field1112 >= Statics.field372 && var237.field1112 < Statics.field372 + 8 && var237.field1103 >= Statics.field2115 && var237.field1103 < Statics.field2115 + 8 && Statics.field706 == var237.field1100) {
                        var237.field1111 = 0;
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2297 == arg0.field1451) {
                int var238 = var3.method3453();
                int var239 = var3.method3288();
                class67 var240 = (class67) field1052.method3704((long) var238);
                class67 var241 = (class67) field1052.method3704((long) var239);
                if (var241 != null) {
                    method2911(var241, var240 == null || var240.field771 != var241.field771);
                }
                if (var240 != null) {
                    var240.method3740();
                    field1052.method3691(var240, (long) var239);
                }
                class228 var242 = class228.method3956(var238);
                if (var242 != null) {
                    method313(var242);
                }
                class228 var243 = class228.method3956(var239);
                if (var243 != null) {
                    method313(var243);
                    method15(Statics.field713[var243.field2755 >>> 16], var243, true);
                }
                if (field859 != -1) {
                    int var244 = field859;
                    if (class228.method3132(var244)) {
                        method241(Statics.field713[var244], 1);
                    }
                }
                arg0.field1451 = null;
                return true;
            }
            if (class171.field2305 == arg0.field1451) {
                method479(class174.field2427);
                arg0.field1451 = null;
                return true;
            }
            class155.method73("" + (arg0.field1451 == null ? -1 : arg0.field1451.field2318) + class86.field1286 + (arg0.field1447 == null ? -1 : arg0.field1447.field2318) + class86.field1286 + (arg0.field1458 == null ? -1 : arg0.field1458.field2318) + class86.field1286 + arg0.field1452, (Throwable) null);
            method467();
        } catch (IOException var250) {
            method4535();
        } catch (Exception var251) {
            String var247 = "" + (arg0.field1451 == null ? -1 : arg0.field1451.field2318) + class86.field1286 + (arg0.field1447 == null ? -1 : arg0.field1447.field2318) + class86.field1286 + (arg0.field1458 == null ? -1 : arg0.field1458.field2318) + class86.field1286 + arg0.field1452 + class86.field1286 + (Statics.field3737 + Statics.field1754.field1170[0]) + class86.field1286 + (Statics.field435 + Statics.field1754.field1174[0]) + class86.field1286;
            for (int var248 = 0; var248 < arg0.field1452 && var248 < 50; var248++) {
                var247 = var247 + var3.field2512[var248] + class86.field1286;
            }
            class155.method73(var247, var251);
            method467();
        }
        return true;
    }

    @ObfuscatedName("ah.hk(Lfq;S)V")
    public static final void method479(class174 arg0) {
        class191 var1 = field938.field1454;
        if (class174.field2429 == arg0) {
            int var2 = var1.method3276();
            int var3 = var1.method3237();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field899[var4];
            int var7 = var1.method3267();
            int var8 = (var7 >> 4 & 0x7) + Statics.field372;
            int var9 = (var7 & 0x7) + Statics.field2115;
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                method1718(Statics.field706, var8, var9, var6, var2, var4, var5, 0, -1);
            }
            return;
        }
        if (class174.field2435 == arg0) {
            byte var10 = var1.method3271();
            int var11 = var1.method3269();
            int var12 = (var11 >> 4 & 0x7) + Statics.field372;
            int var13 = (var11 & 0x7) + Statics.field2115;
            int var14 = var1.method3239();
            int var15 = var14 >> 2;
            int var16 = var14 & 0x3;
            int var17 = field899[var15];
            int var18 = var1.method3278();
            byte var19 = var1.method3271();
            int var20 = var1.method3276();
            byte var21 = var1.method3270();
            byte var22 = var1.method3271();
            int var23 = var1.method3241();
            int var24 = var1.method3278();
            class72 var25;
            if (field946 == var24) {
                var25 = Statics.field1754;
            } else {
                var25 = field945[var24];
            }
            if (var25 != null) {
                class267 var26 = class267.method4025(var23);
                int var27;
                int var28;
                if (var16 == 1 || var16 == 3) {
                    var27 = var26.field3534;
                    var28 = var26.field3537;
                } else {
                    var27 = var26.field3537;
                    var28 = var26.field3534;
                }
                int var29 = (var27 >> 1) + var12;
                int var30 = (var27 + 1 >> 1) + var12;
                int var31 = (var28 >> 1) + var13;
                int var32 = (var28 + 1 >> 1) + var13;
                int[][] var33 = class63.field731[Statics.field706];
                int var34 = var33[var29][var31] + var33[var30][var31] + var33[var29][var32] + var33[var30][var32] >> 2;
                int var35 = (var12 << 7) + (var27 << 6);
                int var36 = (var13 << 7) + (var28 << 6);
                class131 var37 = var26.method4593(var15, var16, var33, var35, var34, var36);
                if (var37 != null) {
                    method1718(Statics.field706, var12, var13, var17, -1, 0, 0, var18 + 1, var20 + 1);
                    var25.field815 = field1036 + var18;
                    var25.field824 = field1036 + var20;
                    var25.field826 = var37;
                    var25.field817 = var12 * 128 + var27 * 64;
                    var25.field808 = var13 * 128 + var28 * 64;
                    var25.field818 = var34;
                    if (var10 > var22) {
                        byte var38 = var10;
                        var10 = var22;
                        var22 = var38;
                    }
                    if (var19 > var21) {
                        byte var39 = var19;
                        var19 = var21;
                        var21 = var39;
                    }
                    var25.field821 = var10 + var12;
                    var25.field816 = var12 + var22;
                    var25.field822 = var13 + var19;
                    var25.field813 = var13 + var21;
                }
            }
        }
        if (class174.field2434 == arg0) {
            int var40 = var1.method3237();
            int var41 = (var40 >> 4 & 0x7) + Statics.field372;
            int var42 = (var40 & 0x7) + Statics.field2115;
            int var43 = var1.method3241();
            int var44 = var1.method3278();
            int var45 = var1.method3269();
            if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                int var46 = var41 * 128 + 64;
                int var47 = var42 * 128 + 64;
                class82 var48 = new class82(var43, Statics.field706, var46, var47, method1017(var46, var47, Statics.field706) - var45, var44, field1036);
                field924.method3747(var48);
            }
        } else if (class174.field2426 == arg0) {
            int var49 = var1.method3278();
            int var50 = var1.method3237() * 4;
            int var51 = var1.method3269();
            int var52 = (var51 >> 4 & 0x7) + Statics.field372;
            int var53 = (var51 & 0x7) + Statics.field2115;
            byte var54 = var1.method3240();
            int var55 = var1.method3267();
            int var56 = var1.method3281();
            int var57 = var1.method3237();
            int var58 = var1.method3237() * 4;
            int var59 = var1.method3277();
            int var60 = var1.method3278();
            byte var61 = var1.method3271();
            int var62 = var52 + var61;
            int var63 = var53 + var54;
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && var60 != 65535) {
                int var64 = var52 * 128 + 64;
                int var65 = var53 * 128 + 64;
                int var66 = var62 * 128 + 64;
                int var67 = var63 * 128 + 64;
                class91 var68 = new class91(var60, Statics.field706, var64, var65, method1017(var64, var65, Statics.field706) - var58, field1036 + var59, field1036 + var49, var55, var57, var56, var50);
                var68.method1816(var66, var67, method1017(var66, var67, Statics.field706) - var50, field1036 + var59);
                field957.method3747(var68);
            }
        } else {
            if (class174.field2431 == arg0) {
                int var69 = var1.method3278();
                int var70 = var1.method3269();
                int var71 = var1.method3237();
                int var72 = (var71 >> 4 & 0x7) + Statics.field372;
                int var73 = (var71 & 0x7) + Statics.field2115;
                int var74 = var1.method3267();
                int var75 = var74 >> 4 & 0xF;
                int var76 = var74 & 0x7;
                if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
                    int var77 = var75 + 1;
                    if (Statics.field1754.field1170[0] >= var72 - var77 && Statics.field1754.field1170[0] <= var72 + var77 && Statics.field1754.field1174[0] >= var73 - var77 && Statics.field1754.field1174[0] <= var73 + var77 && field879 != 0 && var76 > 0 && field1063 < 50) {
                        field1064[field1063] = var69;
                        field1065[field1063] = var76;
                        field1089[field1063] = var70;
                        field1068[field1063] = null;
                        field1067[field1063] = (var72 << 16) + (var73 << 8) + var75;
                        field1063++;
                    }
                }
            }
            if (class174.field2427 == arg0) {
                int var78 = var1.method3277();
                int var79 = var1.method3267();
                int var80 = var79 >> 2;
                int var81 = var79 & 0x3;
                int var82 = field899[var80];
                int var83 = var1.method3239();
                int var84 = (var83 >> 4 & 0x7) + Statics.field372;
                int var85 = (var83 & 0x7) + Statics.field2115;
                if (var84 >= 0 && var85 >= 0 && var84 < 103 && var85 < 103) {
                    if (var82 == 0) {
                        class140 var86 = Statics.field291.method2734(Statics.field706, var84, var85);
                        if (var86 != null) {
                            int var87 = var86.field2009 >> 14 & 0x7FFF;
                            if (var80 == 2) {
                                var86.field2007 = new class97(var87, 2, var81 + 4, Statics.field706, var84, var85, var78, false, var86.field2007);
                                var86.field2008 = new class97(var87, 2, var81 + 1 & 0x3, Statics.field706, var84, var85, var78, false, var86.field2008);
                            } else {
                                var86.field2007 = new class97(var87, var80, var81, Statics.field706, var84, var85, var78, false, var86.field2007);
                            }
                        }
                    }
                    if (var82 == 1) {
                        class145 var88 = Statics.field291.method2735(Statics.field706, var84, var85);
                        if (var88 != null) {
                            int var89 = var88.field2055 >> 14 & 0x7FFF;
                            if (var80 == 4 || var80 == 5) {
                                var88.field2053 = new class97(var89, 4, var81, Statics.field706, var84, var85, var78, false, var88.field2053);
                            } else if (var80 == 6) {
                                var88.field2053 = new class97(var89, 4, var81 + 4, Statics.field706, var84, var85, var78, false, var88.field2053);
                            } else if (var80 == 7) {
                                var88.field2053 = new class97(var89, 4, (var81 + 2 & 0x3) + 4, Statics.field706, var84, var85, var78, false, var88.field2053);
                            } else if (var80 == 8) {
                                var88.field2053 = new class97(var89, 4, var81 + 4, Statics.field706, var84, var85, var78, false, var88.field2053);
                                var88.field2054 = new class97(var89, 4, (var81 + 2 & 0x3) + 4, Statics.field706, var84, var85, var78, false, var88.field2054);
                            }
                        }
                    }
                    if (var82 == 2) {
                        class146 var90 = Statics.field291.method2712(Statics.field706, var84, var85);
                        if (var80 == 11) {
                            var80 = 10;
                        }
                        if (var90 != null) {
                            var90.field2063 = new class97(var90.field2072 >> 14 & 0x7FFF, var80, var81, Statics.field706, var84, var85, var78, false, var90.field2063);
                        }
                    }
                    if (var82 == 3) {
                        class127 var91 = Statics.field291.method2724(Statics.field706, var84, var85);
                        if (var91 != null) {
                            var91.field1748 = new class97(var91.field1752 >> 14 & 0x7FFF, 22, var81, Statics.field706, var84, var85, var78, false, var91.field1748);
                        }
                    }
                }
            } else if (class174.field2432 == arg0) {
                int var92 = var1.method3267();
                int var93 = (var92 >> 4 & 0x7) + Statics.field372;
                int var94 = (var92 & 0x7) + Statics.field2115;
                int var95 = var1.method3239();
                int var96 = var95 >> 2;
                int var97 = var95 & 0x3;
                int var98 = field899[var96];
                if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                    method1718(Statics.field706, var93, var94, var98, -1, var96, var97, 0, -1);
                }
            } else if (class174.field2433 == arg0) {
                int var99 = var1.method3278();
                int var100 = var1.method3239();
                int var101 = (var100 >> 4 & 0x7) + Statics.field372;
                int var102 = (var100 & 0x7) + Statics.field2115;
                if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                    class205 var103 = field955[Statics.field706][var101][var102];
                    if (var103 != null) {
                        for (class92 var104 = (class92) var103.method3752(); var104 != null; var104 = (class92) var103.method3762()) {
                            if ((var99 & 0x7FFF) == var104.field1384) {
                                var104.method3740();
                                break;
                            }
                        }
                        if (var103.method3752() == null) {
                            field955[Statics.field706][var101][var102] = null;
                        }
                        method95(var101, var102);
                    }
                }
            } else if (class174.field2430 == arg0) {
                int var105 = var1.method3276();
                int var106 = var1.method3269();
                int var107 = (var106 >> 4 & 0x7) + Statics.field372;
                int var108 = (var106 & 0x7) + Statics.field2115;
                int var109 = var1.method3276();
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    class92 var110 = new class92();
                    var110.field1384 = var105;
                    var110.field1387 = var109;
                    if (field955[Statics.field706][var107][var108] == null) {
                        field955[Statics.field706][var107][var108] = new class205();
                    }
                    field955[Statics.field706][var107][var108].method3747(var110);
                    method95(var107, var108);
                }
            } else if (class174.field2428 == arg0) {
                int var111 = var1.method3278();
                int var112 = var1.method3267();
                int var113 = (var112 >> 4 & 0x7) + Statics.field372;
                int var114 = (var112 & 0x7) + Statics.field2115;
                int var115 = var1.method3241();
                int var116 = var1.method3241();
                if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                    class205 var117 = field955[Statics.field706][var113][var114];
                    if (var117 != null) {
                        for (class92 var118 = (class92) var117.method3752(); var118 != null; var118 = (class92) var117.method3762()) {
                            if ((var116 & 0x7FFF) == var118.field1384 && var118.field1387 == var115) {
                                var118.field1387 = var111;
                                break;
                            }
                        }
                        method95(var113, var114);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ce.ht(IIIIIIIIIB)V")
    public static final void method1718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class74 var9 = null;
        for (class74 var10 = (class74) field990.method3752(); var10 != null; var10 = (class74) field990.method3762()) {
            if (var10.field1100 == arg0 && var10.field1112 == arg1 && var10.field1103 == arg2 && var10.field1101 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class74();
            var9.field1100 = arg0;
            var9.field1101 = arg3;
            var9.field1112 = arg1;
            var9.field1103 = arg2;
            method1477(var9);
            field990.method3747(var9);
        }
        var9.field1107 = arg4;
        var9.field1109 = arg5;
        var9.field1102 = arg6;
        var9.field1110 = arg7;
        var9.field1111 = arg8;
    }

    @ObfuscatedName("client.hf(Lbu;I)V")
    public static final void method1477(class74 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1101 == 0) {
            var1 = Statics.field291.method2738(arg0.field1100, arg0.field1112, arg0.field1103);
        }
        if (arg0.field1101 == 1) {
            var1 = Statics.field291.method2739(arg0.field1100, arg0.field1112, arg0.field1103);
        }
        if (arg0.field1101 == 2) {
            var1 = Statics.field291.method2740(arg0.field1100, arg0.field1112, arg0.field1103);
        }
        if (arg0.field1101 == 3) {
            var1 = Statics.field291.method2741(arg0.field1100, arg0.field1112, arg0.field1103);
        }
        if (var1 != 0) {
            int var5 = Statics.field291.method2756(arg0.field1100, arg0.field1112, arg0.field1103, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1104 = var2;
        arg0.field1106 = var3;
        arg0.field1105 = var4;
    }

    @ObfuscatedName("bs.hw(I)V")
    public static final void method1544() {
        for (class74 var0 = (class74) field990.method3752(); var0 != null; var0 = (class74) field990.method3762()) {
            if (var0.field1111 > 0) {
                var0.field1111--;
            }
            if (var0.field1111 == 0) {
                if (var0.field1104 >= 0) {
                    int var1 = var0.field1104;
                    int var2 = var0.field1106;
                    class267 var3 = class267.method4025(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method4626(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method986(var0.field1100, var0.field1101, var0.field1112, var0.field1103, var0.field1104, var0.field1105, var0.field1106);
                var0.method3740();
            } else {
                if (var0.field1110 > 0) {
                    var0.field1110--;
                }
                if (var0.field1110 == 0 && var0.field1112 >= 1 && var0.field1103 >= 1 && var0.field1112 <= 102 && var0.field1103 <= 102) {
                    if (var0.field1107 >= 0) {
                        int var5 = var0.field1107;
                        int var6 = var0.field1109;
                        class267 var7 = class267.method4025(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method4626(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method986(var0.field1100, var0.field1101, var0.field1112, var0.field1103, var0.field1107, var0.field1102, var0.field1109);
                    var0.field1110 = -1;
                    if (var0.field1107 == var0.field1104 && var0.field1104 == -1) {
                        var0.method3740();
                    } else if (var0.field1107 == var0.field1104 && var0.field1105 == var0.field1102 && var0.field1109 == var0.field1106) {
                        var0.method3740();
                    }
                }
            }
        }
    }

    @ObfuscatedName("bz.hh(IIIIIIIB)V")
    public static final void method986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field991 && Statics.field706 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field291.method2738(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field291.method2739(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field291.method2740(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field291.method2741(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field291.method2756(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field291.method2729(arg0, arg2, arg3);
                class267 var15 = class267.method4025(var12);
                if (var15.field3535 != 0) {
                    field896[arg0].method3086(arg2, arg3, var13, var14, var15.field3536);
                }
            }
            if (arg1 == 1) {
                Statics.field291.method2730(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field291.method2747(arg0, arg2, arg3);
                class267 var16 = class267.method4025(var12);
                if (var16.field3537 + arg2 > 103 || var16.field3537 + arg3 > 103 || var16.field3534 + arg2 > 103 || var16.field3534 + arg3 > 103) {
                    return;
                }
                if (var16.field3535 != 0) {
                    field896[arg0].method3090(arg2, arg3, var16.field3537, var16.field3534, var14, var16.field3536);
                }
            }
            if (arg1 == 3) {
                Statics.field291.method2732(arg0, arg2, arg3);
                class267 var17 = class267.method4025(var12);
                if (var17.field3535 == 1) {
                    field896[arg0].method3089(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class63.field723[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class63.method478(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field291, field896[arg0]);
    }

    @ObfuscatedName("r.hx(IIS)V")
    public static final void method95(int arg0, int arg1) {
        class205 var2 = field955[Statics.field706][arg0][arg1];
        if (var2 == null) {
            Statics.field291.method2843(Statics.field706, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class92 var5 = null;
        for (class92 var6 = (class92) var2.method3752(); var6 != null; var6 = (class92) var2.method3762()) {
            class268 var7 = class268.method965(var6.field1384);
            long var8 = (long) var7.field3580;
            if (var7.field3588 == 1) {
                var8 = (long) (var6.field1387 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field291.method2843(Statics.field706, arg0, arg1);
            return;
        }
        var2.method3748(var5);
        class92 var10 = null;
        class92 var11 = null;
        for (class92 var12 = (class92) var2.method3752(); var12 != null; var12 = (class92) var2.method3762()) {
            if (var5.field1384 != var12.field1384) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1384 != var12.field1384 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field291.method2719(Statics.field706, arg0, arg1, method1017(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field706), var5, var13, var10, var11);
    }

    @ObfuscatedName("y.hn(ZLgt;B)V")
    public static final void method152(boolean arg0, class191 arg1) {
        field948 = 0;
        field883 = 0;
        method60();
        method981(arg0, arg1);
        for (int var2 = 0; var2 < field883; var2++) {
            int var3 = field884[var2];
            class84 var4 = field880[var3];
            int var5 = arg1.method3239();
            if ((var5 & 0x1) != 0) {
                var4.field1152 = arg1.method3276();
                int var6 = arg1.method3288();
                var4.field1169 = var6 >> 16;
                var4.field1155 = (var6 & 0xFFFF) + field1036;
                var4.field1153 = 0;
                var4.field1154 = 0;
                if (var4.field1155 > field1036) {
                    var4.field1153 = -1;
                }
                if (var4.field1152 == 65535) {
                    var4.field1152 = -1;
                }
            }
            if ((var5 & 0x10) != 0) {
                var4.field1139 = arg1.method3248();
                var4.field1131 = 100;
            }
            if ((var5 & 0x8) != 0) {
                var4.field1156 = arg1.method3278();
                if (var4.field1156 == 65535) {
                    var4.field1156 = -1;
                }
            }
            if ((var5 & 0x40) != 0) {
                int var7 = arg1.method3277();
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = arg1.method3269();
                if (var4.field1147 == var7 && var7 != -1) {
                    int var9 = class272.method4180(var7).field3695;
                    if (var9 == 1) {
                        var4.field1171 = 0;
                        var4.field1141 = 0;
                        var4.field1115 = var8;
                        var4.field1151 = 0;
                    }
                    if (var9 == 2) {
                        var4.field1151 = 0;
                    }
                } else if (var7 == -1 || var4.field1147 == -1 || class272.method4180(var7).field3686 >= class272.method4180(var4.field1147).field3686) {
                    var4.field1147 = var7;
                    var4.field1171 = 0;
                    var4.field1141 = 0;
                    var4.field1115 = var8;
                    var4.field1151 = 0;
                    var4.field1162 = var4.field1123;
                }
            }
            if ((var5 & 0x4) != 0) {
                int var10 = arg1.method3277();
                int var11 = arg1.method3278();
                int var12 = var4.field1129 - (var10 - Statics.field3737 - Statics.field3737) * 64;
                int var13 = var4.field1116 - (var11 - Statics.field435 - Statics.field435) * 64;
                if (var12 != 0 || var13 != 0) {
                    var4.field1143 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                }
            }
            if ((var5 & 0x20) != 0) {
                var4.field1271 = class270.method4416(arg1.method3277());
                var4.field1128 = var4.field1271.field3634;
                var4.field1168 = var4.field1271.field3635;
                var4.field1157 = var4.field1271.field3628;
                var4.field1124 = var4.field1271.field3641;
                var4.field1125 = var4.field1271.field3646;
                var4.field1126 = var4.field1271.field3643;
                var4.field1138 = var4.field1271.field3637;
                var4.field1121 = var4.field1271.field3638;
                var4.field1122 = var4.field1271.field3640;
            }
            if ((var5 & 0x2) != 0) {
                int var14 = arg1.method3239();
                if (var14 > 0) {
                    for (int var15 = 0; var15 < var14; var15++) {
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = -1;
                        int var19 = arg1.method3253();
                        if (var19 == 32767) {
                            var19 = arg1.method3253();
                            var17 = arg1.method3253();
                            var16 = arg1.method3253();
                            var18 = arg1.method3253();
                        } else if (var19 == 32766) {
                            var19 = -1;
                        } else {
                            var17 = arg1.method3253();
                        }
                        int var20 = arg1.method3253();
                        var4.method1484(var19, var17, var16, var18, field1036, var20);
                    }
                }
                int var21 = arg1.method3267();
                if (var21 > 0) {
                    for (int var22 = 0; var22 < var21; var22++) {
                        int var23 = arg1.method3253();
                        int var24 = arg1.method3253();
                        if (var24 == 32767) {
                            var4.method1489(var23);
                        } else {
                            int var25 = arg1.method3253();
                            int var26 = arg1.method3269();
                            int var27 = var24 > 0 ? arg1.method3239() : var26;
                            var4.method1485(var23, field1036, var24, var25, var26, var27);
                        }
                    }
                }
            }
        }
        for (int var28 = 0; var28 < field948; var28++) {
            int var29 = field949[var28];
            if (field1036 != field880[var29].field1164) {
                field880[var29].field1271 = null;
                field880[var29] = null;
            }
        }
        if (field938.field1452 != arg1.field2514) {
            throw new RuntimeException(arg1.field2514 + class86.field1286 + field938.field1452);
        }
        for (int var30 = 0; var30 < field881; var30++) {
            if (field880[field882[var30]] == null) {
                throw new RuntimeException(var30 + class86.field1286 + field881);
            }
        }
    }

    @ObfuscatedName("l.hl(I)V")
    public static final void method60() {
        class191 var0 = field938.field1454;
        var0.method3558();
        int var1 = var0.method3538(8);
        if (var1 < field881) {
            for (int var2 = var1; var2 < field881; var2++) {
                field949[++field948 - 1] = field882[var2];
            }
        }
        if (var1 > field881) {
            throw new RuntimeException("");
        }
        field881 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field882[var3];
            class84 var5 = field880[var4];
            int var6 = var0.method3538(1);
            if (var6 == 0) {
                field882[++field881 - 1] = var4;
                var5.field1164 = field1036;
            } else {
                int var7 = var0.method3538(2);
                if (var7 == 0) {
                    field882[++field881 - 1] = var4;
                    var5.field1164 = field1036;
                    field884[++field883 - 1] = var4;
                } else if (var7 == 1) {
                    field882[++field881 - 1] = var4;
                    var5.field1164 = field1036;
                    int var8 = var0.method3538(3);
                    var5.method1732(var8, (byte) 1);
                    int var9 = var0.method3538(1);
                    if (var9 == 1) {
                        field884[++field883 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field882[++field881 - 1] = var4;
                    var5.field1164 = field1036;
                    int var10 = var0.method3538(3);
                    var5.method1732(var10, (byte) 2);
                    int var11 = var0.method3538(3);
                    var5.method1732(var11, (byte) 2);
                    int var12 = var0.method3538(1);
                    if (var12 == 1) {
                        field884[++field883 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field949[++field948 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("bc.hu(ZLgt;I)V")
    public static final void method981(boolean arg0, class191 arg1) {
        while (true) {
            if (arg1.method3539(field938.field1452) >= 27) {
                int var2 = arg1.method3538(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field880[var2] == null) {
                        field880[var2] = new class84();
                        var3 = true;
                    }
                    class84 var4 = field880[var2];
                    field882[++field881 - 1] = var2;
                    var4.field1164 = field1036;
                    int var5 = arg1.method3538(1);
                    if (var5 == 1) {
                        field884[++field883 - 1] = var2;
                    }
                    int var6 = arg1.method3538(1);
                    int var7;
                    if (arg0) {
                        var7 = arg1.method3538(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = arg1.method3538(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    var4.field1271 = class270.method4416(arg1.method3538(14));
                    int var8;
                    if (arg0) {
                        var8 = arg1.method3538(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = arg1.method3538(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    int var9 = field953[arg1.method3538(3)];
                    if (var3) {
                        var4.field1148 = var4.field1117 = var9;
                    }
                    var4.field1128 = var4.field1271.field3634;
                    var4.field1168 = var4.field1271.field3635;
                    if (var4.field1168 == 0) {
                        var4.field1117 = 0;
                    }
                    var4.field1157 = var4.field1271.field3628;
                    var4.field1124 = var4.field1271.field3641;
                    var4.field1125 = var4.field1271.field3646;
                    var4.field1126 = var4.field1271.field3643;
                    var4.field1138 = var4.field1271.field3637;
                    var4.field1121 = var4.field1271.field3638;
                    var4.field1122 = var4.field1271.field3640;
                    var4.method1733(Statics.field1754.field1170[0] + var8, Statics.field1754.field1174[0] + var7, var6 == 1);
                    continue;
                }
            }
            arg1.method3535();
            return;
        }
    }

    @ObfuscatedName("iv.hg(III)Lfj;")
    public static class169 method4403(int arg0, int arg1) {
        field1095.field2230 = arg0;
        field1095.field2229 = arg1;
        field1095.field2234 = 1;
        field1095.field2232 = 1;
        return field1095;
    }

    @ObfuscatedName("ba.hy(IIB)V")
    public static final void method962(int arg0, int arg1) {
        if (field885 < 2 && field978 == 0 && !field980) {
            return;
        }
        int var2 = field885 - 1;
        String var4;
        if (field978 == 1 && field885 < 2) {
            var4 = class237.field3102 + class237.field3008 + field904 + " " + class86.field1290;
        } else if (field980 && field885 < 2) {
            var4 = field855 + class237.field3008 + field996 + " " + class86.field1290;
        } else {
            String var5;
            if (var2 < 0) {
                var5 = "";
            } else if (field970[var2].length() > 0) {
                var5 = field1005[var2] + class237.field3008 + field970[var2];
            } else {
                var5 = field1005[var2];
            }
            var4 = var5;
        }
        if (field885 > 2) {
            var4 = var4 + class86.method1026(16777215) + " " + '/' + " " + (field885 - 2) + class237.field3106;
        }
        Statics.field3322.method5011(var4, arg0 + 4, arg1 + 15, 16777215, 0, field1036 / 1000);
    }

    @ObfuscatedName("at.hv(B)V")
    public static final void method641() {
        int var0 = Statics.field641;
        int var1 = Statics.field2739;
        int var2 = Statics.field266;
        int var3 = Statics.field773;
        int var4 = 6116423;
        class306.method5225(var0, var1, var2, var3, var4);
        class306.method5225(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class306.method5196(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field3322.method5015(class237.field3105, var0 + 3, var1 + 14, var4, -1);
        int var5 = class60.field691;
        int var6 = class60.field692;
        for (int var7 = 0; var7 < field885; var7++) {
            int var8 = (field885 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class287 var10 = Statics.field3322;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field970[var7].length() > 0) {
                var11 = field1005[var7] + class237.field3008 + field970[var7];
            } else {
                var11 = field1005[var7];
            }
            var10.method5015(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field641;
        int var13 = Statics.field2739;
        int var14 = Statics.field266;
        int var15 = Statics.field773;
        for (int var16 = 0; var16 < field850; var16++) {
            if (field956[var16] + field1033[var16] > var12 && field1033[var16] < var12 + var14 && field964[var16] + field1034[var16] > var13 && field1034[var16] < var13 + var15) {
                field907[var16] = true;
            }
        }
    }

    @ObfuscatedName("gj.ho(IIIII)V")
    public static final void method3519(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field850; var4++) {
            if (field956[var4] + field1033[var4] > arg0 && field1033[var4] < arg0 + arg2 && field964[var4] + field1034[var4] > arg1 && field1034[var4] < arg1 + arg3) {
                field1030[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hr(I)V")
    public final void method1097() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field885 - 1; var2++) {
                if (field901[var2] < 1000 && field901[var2 + 1] > 1000) {
                    String var3 = field970[var2];
                    field970[var2] = field970[var2 + 1];
                    field970[var2 + 1] = var3;
                    String var4 = field1005[var2];
                    field1005[var2] = field1005[var2 + 1];
                    field1005[var2 + 1] = var4;
                    int var5 = field901[var2];
                    field901[var2] = field901[var2 + 1];
                    field901[var2 + 1] = var5;
                    int var6 = field965[var2];
                    field965[var2] = field965[var2 + 1];
                    field965[var2 + 1] = var6;
                    int var7 = field966[var2];
                    field966[var2] = field966[var2 + 1];
                    field966[var2 + 1] = var7;
                    int var8 = field968[var2];
                    field968[var2] = field968[var2 + 1];
                    field968[var2 + 1] = var8;
                    boolean var9 = field971[var2];
                    field971[var2] = field971[var2 + 1];
                    field971[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field3516 != null || field941 != null) {
            return;
        }
        int var21;
        int var23;
        int var24;
        label214: {
            int var10 = class60.field697;
            if (field1072) {
                if (var10 != 1 && (Statics.field407 || var10 != 4)) {
                    int var11 = class60.field691;
                    int var12 = class60.field692;
                    if (var11 < Statics.field641 - 10 || var11 > Statics.field641 + Statics.field266 + 10 || var12 < Statics.field2739 - 10 || var12 > Statics.field773 + Statics.field2739 + 10) {
                        field1072 = false;
                        method3519(Statics.field641, Statics.field2739, Statics.field266, Statics.field773);
                    }
                }
                if (var10 == 1 || !Statics.field407 && var10 == 4) {
                    int var13 = Statics.field641;
                    int var14 = Statics.field2739;
                    int var15 = Statics.field266;
                    int var16 = class60.field698;
                    int var17 = class60.field701;
                    int var18 = -1;
                    for (int var19 = 0; var19 < field885; var19++) {
                        int var20 = (field885 - 1 - var19) * 15 + var14 + 31;
                        if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                            var18 = var19;
                        }
                    }
                    if (var18 != -1) {
                        method48(var18);
                    }
                    field1072 = false;
                    method3519(Statics.field641, Statics.field2739, Statics.field266, Statics.field773);
                }
            } else {
                var21 = method47();
                if ((var10 == 1 || !Statics.field407 && var10 == 4) && var21 >= 0) {
                    int var22 = field901[var21];
                    if (var22 == 39 || var22 == 40 || var22 == 41 || var22 == 42 || var22 == 43 || var22 == 33 || var22 == 34 || var22 == 35 || var22 == 36 || var22 == 37 || var22 == 38 || var22 == 1005) {
                        var23 = field965[var21];
                        var24 = field966[var21];
                        class228 var25 = class228.method3956(var24);
                        int var26 = method53(var25);
                        boolean var27 = (var26 >> 28 & 0x1) != 0;
                        if (var27) {
                            break label214;
                        }
                        int var28 = method53(var25);
                        boolean var29 = (var28 >> 29 & 0x1) != 0;
                        if (var29) {
                            break label214;
                        }
                    }
                }
                if ((var10 == 1 || !Statics.field407 && var10 == 4) && this.method1098()) {
                    var10 = 2;
                }
                if ((var10 == 1 || !Statics.field407 && var10 == 4) && field885 > 0) {
                    method48(var21);
                }
                if (var10 == 2 && field885 > 0) {
                    this.method1192(class60.field698, class60.field701);
                }
            }
            return;
        }
        if (Statics.field3516 != null && !field942 && field885 > 0 && !this.method1098()) {
            method1771(field994, field940);
        }
        field942 = false;
        field943 = 0;
        if (Statics.field3516 != null) {
            method313(Statics.field3516);
        }
        Statics.field3516 = class228.method3956(var24);
        field988 = var23;
        field994 = class60.field698;
        field940 = class60.field701;
        if (var21 >= 0) {
            method964(var21);
        }
        method313(Statics.field3516);
    }

    @ObfuscatedName("client.hd(B)Z")
    public final boolean method1098() {
        int var1 = method47();
        return field885 > 2 && (field856 == 1 && !field971[var1] || method3496(var1));
    }

    @ObfuscatedName("client.hs(IIB)V")
    public final void method1192(int arg0, int arg1) {
        int var3 = Statics.field3322.method4998(class237.field3105);
        for (int var4 = 0; var4 < field885; var4++) {
            class287 var5 = Statics.field3322;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field970[var4].length() > 0) {
                var6 = field1005[var4] + class237.field3008 + field970[var4];
            } else {
                var6 = field1005[var4];
            }
            int var7 = var5.method4998(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field885 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field663) {
            var9 = Statics.field663 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field2191) {
            var10 = Statics.field2191 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field291.method2805(Statics.field706, arg0, arg1, false);
        field1072 = true;
        Statics.field641 = var9;
        Statics.field2739 = var10;
        Statics.field266 = var3;
        Statics.field773 = field885 * 15 + 22;
    }

    @ObfuscatedName("gl.ha(IS)Z")
    public static final boolean method3496(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field901[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("c.hc(IB)V")
    public static final void method48(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field965[arg0];
        int var2 = field966[arg0];
        int var3 = field901[arg0];
        int var4 = field968[arg0];
        String var5 = field1005[arg0];
        String var6 = field970[arg0];
        method1475(var1, var2, var3, var4, var5, var6, class60.field698, class60.field701);
    }

    @ObfuscatedName("hd.hj(Lcj;III)V")
    public static final void method4101(class87 arg0, int arg1, int arg2) {
        method1475(arg0.field1298, arg0.field1296, arg0.field1297, arg0.field1295, arg0.field1300, arg0.field1300, arg1, arg2);
    }

    @ObfuscatedName("client.hz(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method1475(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 44) {
            class72 var8 = field945[arg3];
            if (var8 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var9 = class175.method1891(class172.field2385, field938.field1455);
                var9.field2440.method3264(class51.field618[82] ? 1 : 0);
                var9.field2440.method3247(arg3);
                field938.method1907(var9);
            }
        }
        if (arg2 == 45) {
            class72 var10 = field945[arg3];
            if (var10 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var11 = class175.method1891(class172.field2408, field938.field1455);
                var11.field2440.method3403(arg3);
                var11.field2440.method3223(class51.field618[82] ? 1 : 0);
                field938.method1907(var11);
            }
        }
        if (arg2 == 48) {
            class72 var12 = field945[arg3];
            if (var12 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var13 = class175.method1891(class172.field2386, field938.field1455);
                var13.field2440.method3273(arg3);
                var13.field2440.method3264(class51.field618[82] ? 1 : 0);
                field938.method1907(var13);
            }
        }
        if (arg2 == 41) {
            class175 var14 = class175.method1891(class172.field2355, field938.field1455);
            var14.field2440.method3242(arg1);
            var14.field2440.method3403(arg0);
            var14.field2440.method3247(arg3);
            field938.method1907(var14);
            field936 = 0;
            Statics.field567 = class228.method3956(arg1);
            field937 = arg0;
        }
        if (arg2 == 4) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            field984 = arg0;
            field1056 = arg1;
            class175 var15 = class175.method1891(class172.field2365, field938.field1455);
            var15.field2440.method3257(Statics.field435 + arg1);
            var15.field2440.method3273(Statics.field3737 + arg0);
            var15.field2440.method3257(arg3 >> 14 & 0x7FFF);
            var15.field2440.method3264(class51.field618[82] ? 1 : 0);
            field938.method1907(var15);
        }
        if (arg2 == 22) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            field984 = arg0;
            field1056 = arg1;
            class175 var16 = class175.method1891(class172.field2369, field938.field1455);
            var16.field2440.method3264(class51.field618[82] ? 1 : 0);
            var16.field2440.method3403(Statics.field435 + arg1);
            var16.field2440.method3403(Statics.field3737 + arg0);
            var16.field2440.method3403(arg3);
            field938.method1907(var16);
        }
        if (arg2 == 21) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            field984 = arg0;
            field1056 = arg1;
            class175 var17 = class175.method1891(class172.field2403, field938.field1455);
            var17.field2440.method3247(arg3);
            var17.field2440.method3273(Statics.field3737 + arg0);
            var17.field2440.method3403(Statics.field435 + arg1);
            var17.field2440.method3265(class51.field618[82] ? 1 : 0);
            field938.method1907(var17);
        }
        if (arg2 == 38) {
            method1516();
            class228 var18 = class228.method3956(arg1);
            field978 = 1;
            Statics.field313 = arg0;
            Statics.field3703 = arg1;
            Statics.field170 = arg3;
            method313(var18);
            field904 = class86.method1026(16748608) + class268.method965(arg3).field3599 + class86.method1026(16777215);
            if (field904 == null) {
                field904 = "null";
            }
            return;
        }
        if (arg2 == 40) {
            class175 var19 = class175.method1891(class172.field2400, field938.field1455);
            var19.field2440.method3273(arg0);
            var19.field2440.method3284(arg1);
            var19.field2440.method3247(arg3);
            field938.method1907(var19);
            field936 = 0;
            Statics.field567 = class228.method3956(arg1);
            field937 = arg0;
        }
        if (arg2 == 13) {
            class84 var20 = field880[arg3];
            if (var20 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var21 = class175.method1891(class172.field2330, field938.field1455);
                var21.field2440.method3265(class51.field618[82] ? 1 : 0);
                var21.field2440.method3273(arg3);
                field938.method1907(var21);
            }
        }
        if (arg2 == 31) {
            class175 var22 = class175.method1891(class172.field2380, field938.field1455);
            var22.field2440.method3285(arg1);
            var22.field2440.method3273(Statics.field313);
            var22.field2440.method3403(Statics.field170);
            var22.field2440.method3247(arg0);
            var22.field2440.method3285(Statics.field3703);
            var22.field2440.method3257(arg3);
            field938.method1907(var22);
            field936 = 0;
            Statics.field567 = class228.method3956(arg1);
            field937 = arg0;
        }
        if (arg2 == 28) {
            class175 var23 = class175.method1891(class172.field2387, field938.field1455);
            var23.field2440.method3242(arg1);
            field938.method1907(var23);
            class228 var24 = class228.method3956(arg1);
            if (var24.field2867 != null && var24.field2867[0][0] == 5) {
                int var25 = var24.field2867[0][1];
                class223.field2713[var25] = 1 - class223.field2713[var25];
                method2(var25);
            }
        }
        if (arg2 == 58) {
            class228 var26 = class228.method539(arg1, arg0);
            if (var26 != null) {
                class175 var27 = class175.method1891(class172.field2378, field938.field1455);
                var27.field2440.method3257(field1039);
                var27.field2440.method3257(field1061);
                var27.field2440.method3247(var26.field2875);
                var27.field2440.method3284(Statics.field3358);
                var27.field2440.method3403(arg0);
                var27.field2440.method3368(arg1);
                field938.method1907(var27);
            }
        }
        if (arg2 == 32) {
            class175 var28 = class175.method1891(class172.field2379, field938.field1455);
            var28.field2440.method3242(Statics.field3358);
            var28.field2440.method3257(arg3);
            var28.field2440.method3273(field1039);
            var28.field2440.method3403(arg0);
            var28.field2440.method3242(arg1);
            field938.method1907(var28);
            field936 = 0;
            Statics.field567 = class228.method3956(arg1);
            field937 = arg0;
        }
        if (arg2 == 12) {
            class84 var29 = field880[arg3];
            if (var29 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var30 = class175.method1891(class172.field2393, field938.field1455);
                var30.field2440.method3247(arg3);
                var30.field2440.method3223(class51.field618[82] ? 1 : 0);
                field938.method1907(var30);
            }
        }
        if (arg2 == 50) {
            class72 var31 = field945[arg3];
            if (var31 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var32 = class175.method1891(class172.field2373, field938.field1455);
                var32.field2440.method3264(class51.field618[82] ? 1 : 0);
                var32.field2440.method3247(arg3);
                field938.method1907(var32);
            }
        }
        if (arg2 == 9) {
            class84 var33 = field880[arg3];
            if (var33 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var34 = class175.method1891(class172.field2356, field938.field1455);
                var34.field2440.method3257(arg3);
                var34.field2440.method3266(class51.field618[82] ? 1 : 0);
                field938.method1907(var34);
            }
        }
        if (arg2 == 1005) {
            class228 var35 = class228.method3956(arg1);
            if (var35 == null || var35.field2874[arg0] < 100000) {
                class175 var36 = class175.method1891(class172.field2392, field938.field1455);
                var36.field2440.method3257(arg3);
                field938.method1907(var36);
            } else {
                class95.method649(27, "", var35.field2874[arg0] + " x " + class268.method965(arg3).field3599);
            }
            field936 = 0;
            Statics.field567 = class228.method3956(arg1);
            field937 = arg0;
        }
        if (arg2 == 8) {
            class84 var37 = field880[arg3];
            if (var37 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var38 = class175.method1891(class172.field2395, field938.field1455);
                var38.field2440.method3242(Statics.field3358);
                var38.field2440.method3265(class51.field618[82] ? 1 : 0);
                var38.field2440.method3403(field1039);
                var38.field2440.method3247(arg3);
                field938.method1907(var38);
            }
        }
        if (arg2 == 16) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            field984 = arg0;
            field1056 = arg1;
            class175 var39 = class175.method1891(class172.field2377, field938.field1455);
            var39.field2440.method3223(class51.field618[82] ? 1 : 0);
            var39.field2440.method3242(Statics.field3703);
            var39.field2440.method3273(Statics.field435 + arg1);
            var39.field2440.method3257(Statics.field313);
            var39.field2440.method3273(Statics.field170);
            var39.field2440.method3403(Statics.field3737 + arg0);
            var39.field2440.method3247(arg3);
            field938.method1907(var39);
        }
        if (arg2 == 29) {
            class175 var40 = class175.method1891(class172.field2387, field938.field1455);
            var40.field2440.method3242(arg1);
            field938.method1907(var40);
            class228 var41 = class228.method3956(arg1);
            if (var41.field2867 != null && var41.field2867[0][0] == 5) {
                int var42 = var41.field2867[0][1];
                if (class223.field2713[var42] != var41.field2869[0]) {
                    class223.field2713[var42] = var41.field2869[0];
                    method2(var42);
                }
            }
        }
        if (arg2 == 7) {
            class84 var43 = field880[arg3];
            if (var43 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var44 = class175.method1891(class172.field2414, field938.field1455);
                var44.field2440.method3257(Statics.field313);
                var44.field2440.method3247(arg3);
                var44.field2440.method3403(Statics.field170);
                var44.field2440.method3223(class51.field618[82] ? 1 : 0);
                var44.field2440.method3284(Statics.field3703);
                field938.method1907(var44);
            }
        }
        if (arg2 == 1) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            field984 = arg0;
            field1056 = arg1;
            class175 var45 = class175.method1891(class172.field2381, field938.field1455);
            var45.field2440.method3264(class51.field618[82] ? 1 : 0);
            var45.field2440.method3257(arg3 >> 14 & 0x7FFF);
            var45.field2440.method3273(Statics.field170);
            var45.field2440.method3273(Statics.field3737 + arg0);
            var45.field2440.method3247(Statics.field435 + arg1);
            var45.field2440.method3368(Statics.field3703);
            var45.field2440.method3247(Statics.field313);
            field938.method1907(var45);
        }
        if (arg2 == 36) {
            class175 var46 = class175.method1891(class172.field2341, field938.field1455);
            var46.field2440.method3273(arg0);
            var46.field2440.method3242(arg1);
            var46.field2440.method3403(arg3);
            field938.method1907(var46);
            field936 = 0;
            Statics.field567 = class228.method3956(arg1);
            field937 = arg0;
        }
        if (arg2 == 15) {
            class72 var47 = field945[arg3];
            if (var47 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var48 = class175.method1891(class172.field2372, field938.field1455);
                var48.field2440.method3257(arg3);
                var48.field2440.method3242(Statics.field3358);
                var48.field2440.method3403(field1039);
                var48.field2440.method3264(class51.field618[82] ? 1 : 0);
                field938.method1907(var48);
            }
        }
        if (arg2 == 49) {
            class72 var49 = field945[arg3];
            if (var49 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var50 = class175.method1891(class172.field2405, field938.field1455);
                var50.field2440.method3265(class51.field618[82] ? 1 : 0);
                var50.field2440.method3403(arg3);
                field938.method1907(var50);
            }
        }
        if (arg2 == 30 && field886 == null) {
            class175 var51 = class175.method1891(class172.field2399, field938.field1455);
            var51.field2440.method3368(arg1);
            var51.field2440.method3247(arg0);
            field938.method1907(var51);
            field886 = class228.method539(arg1, arg0);
            method313(field886);
        }
        if (arg2 == 11) {
            class84 var52 = field880[arg3];
            if (var52 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var53 = class175.method1891(class172.field2352, field938.field1455);
                var53.field2440.method3264(class51.field618[82] ? 1 : 0);
                var53.field2440.method3257(arg3);
                field938.method1907(var53);
            }
        }
        if (arg2 == 20) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            field984 = arg0;
            field1056 = arg1;
            class175 var54 = class175.method1891(class172.field2353, field938.field1455);
            var54.field2440.method3403(arg3);
            var54.field2440.method3257(Statics.field435 + arg1);
            var54.field2440.method3247(Statics.field3737 + arg0);
            var54.field2440.method3264(class51.field618[82] ? 1 : 0);
            field938.method1907(var54);
        }
        if (arg2 == 18) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            field984 = arg0;
            field1056 = arg1;
            class175 var55 = class175.method1891(class172.field2413, field938.field1455);
            var55.field2440.method3265(class51.field618[82] ? 1 : 0);
            var55.field2440.method3273(Statics.field3737 + arg0);
            var55.field2440.method3273(arg3);
            var55.field2440.method3247(Statics.field435 + arg1);
            field938.method1907(var55);
        }
        if (arg2 == 1001) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            field984 = arg0;
            field1056 = arg1;
            class175 var56 = class175.method1891(class172.field2342, field938.field1455);
            var56.field2440.method3265(class51.field618[82] ? 1 : 0);
            var56.field2440.method3273(Statics.field435 + arg1);
            var56.field2440.method3247(Statics.field3737 + arg0);
            var56.field2440.method3273(arg3 >> 14 & 0x7FFF);
            field938.method1907(var56);
        }
        if (arg2 == 19) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            field984 = arg0;
            field1056 = arg1;
            class175 var57 = class175.method1891(class172.field2417, field938.field1455);
            var57.field2440.method3273(arg3);
            var57.field2440.method3265(class51.field618[82] ? 1 : 0);
            var57.field2440.method3273(Statics.field3737 + arg0);
            var57.field2440.method3403(Statics.field435 + arg1);
            field938.method1907(var57);
        }
        if (arg2 == 51) {
            class72 var58 = field945[arg3];
            if (var58 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var59 = class175.method1891(class172.field2340, field938.field1455);
                var59.field2440.method3403(arg3);
                var59.field2440.method3223(class51.field618[82] ? 1 : 0);
                field938.method1907(var59);
            }
        }
        if (arg2 == 2) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            field984 = arg0;
            field1056 = arg1;
            class175 var60 = class175.method1891(class172.field2363, field938.field1455);
            var60.field2440.method3257(arg3 >> 14 & 0x7FFF);
            var60.field2440.method3223(class51.field618[82] ? 1 : 0);
            var60.field2440.method3247(field1039);
            var60.field2440.method3368(Statics.field3358);
            var60.field2440.method3403(Statics.field435 + arg1);
            var60.field2440.method3403(Statics.field3737 + arg0);
            field938.method1907(var60);
        }
        if (arg2 == 1002) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            class175 var61 = class175.method1891(class172.field2351, field938.field1455);
            var61.field2440.method3403(arg3 >> 14 & 0x7FFF);
            field938.method1907(var61);
        }
        if (arg2 == 26) {
            class175 var62 = class175.method1891(class172.field2412, field938.field1455);
            field938.method1907(var62);
            for (class67 var63 = (class67) field1052.method3693(); var63 != null; var63 = (class67) field1052.method3694()) {
                if (var63.field768 == 0 || var63.field768 == 3) {
                    method2911(var63, true);
                }
            }
            if (field886 != null) {
                method313(field886);
                field886 = null;
            }
        }
        if (arg2 == 23) {
            if (field1072) {
                Statics.field291.method2750();
            } else {
                Statics.field291.method2805(Statics.field706, arg0, arg1, true);
            }
        }
        if (arg2 == 33) {
            class175 var64 = class175.method1891(class172.field2368, field938.field1455);
            var64.field2440.method3284(arg1);
            var64.field2440.method3247(arg0);
            var64.field2440.method3273(arg3);
            field938.method1907(var64);
            field936 = 0;
            Statics.field567 = class228.method3956(arg1);
            field937 = arg0;
        }
        if (arg2 == 43) {
            class175 var65 = class175.method1891(class172.field2364, field938.field1455);
            var65.field2440.method3273(arg0);
            var65.field2440.method3273(arg3);
            var65.field2440.method3285(arg1);
            field938.method1907(var65);
            field936 = 0;
            Statics.field567 = class228.method3956(arg1);
            field937 = arg0;
        }
        if (arg2 == 17) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            field984 = arg0;
            field1056 = arg1;
            class175 var66 = class175.method1891(class172.field2366, field938.field1455);
            var66.field2440.method3265(class51.field618[82] ? 1 : 0);
            var66.field2440.method3403(Statics.field435 + arg1);
            var66.field2440.method3247(Statics.field3737 + arg0);
            var66.field2440.method3285(Statics.field3358);
            var66.field2440.method3247(field1039);
            var66.field2440.method3257(arg3);
            field938.method1907(var66);
        }
        if (arg2 == 5) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            field984 = arg0;
            field1056 = arg1;
            class175 var67 = class175.method1891(class172.field2347, field938.field1455);
            var67.field2440.method3257(Statics.field435 + arg1);
            var67.field2440.method3266(class51.field618[82] ? 1 : 0);
            var67.field2440.method3257(arg3 >> 14 & 0x7FFF);
            var67.field2440.method3257(Statics.field3737 + arg0);
            field938.method1907(var67);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field2449.method5595(arg2, arg3, new class224(arg0), new class224(arg1));
        }
        if (arg2 == 57 || arg2 == 1007) {
            class228 var68 = class228.method539(arg1, arg0);
            if (var68 != null) {
                int var69 = var68.field2875;
                class228 var70 = class228.method539(arg1, arg0);
                if (var70 != null) {
                    if (var70.field2847 != null) {
                        class68 var71 = new class68();
                        var71.field774 = var70;
                        var71.field782 = arg3;
                        var71.field779 = arg5;
                        var71.field787 = var70.field2847;
                        class81.method1742(var71);
                    }
                    boolean var72 = true;
                    if (var70.field2759 > 0) {
                        var72 = method155(var70);
                    }
                    if (var72) {
                        int var73 = method53(var70);
                        int var74 = arg3 - 1;
                        boolean var75 = (var73 >> var74 + 1 & 0x1) != 0;
                        if (var75) {
                            if (arg3 == 1) {
                                class175 var76 = class175.method1891(class172.field2396, field938.field1455);
                                var76.field2440.method3242(arg1);
                                var76.field2440.method3403(arg0);
                                var76.field2440.method3403(var69);
                                field938.method1907(var76);
                            }
                            if (arg3 == 2) {
                                class175 var77 = class175.method1891(class172.field2361, field938.field1455);
                                var77.field2440.method3242(arg1);
                                var77.field2440.method3403(arg0);
                                var77.field2440.method3403(var69);
                                field938.method1907(var77);
                            }
                            if (arg3 == 3) {
                                class175 var78 = class175.method1891(class172.field2336, field938.field1455);
                                var78.field2440.method3242(arg1);
                                var78.field2440.method3403(arg0);
                                var78.field2440.method3403(var69);
                                field938.method1907(var78);
                            }
                            if (arg3 == 4) {
                                class175 var79 = class175.method1891(class172.field2337, field938.field1455);
                                var79.field2440.method3242(arg1);
                                var79.field2440.method3403(arg0);
                                var79.field2440.method3403(var69);
                                field938.method1907(var79);
                            }
                            if (arg3 == 5) {
                                class175 var80 = class175.method1891(class172.field2382, field938.field1455);
                                var80.field2440.method3242(arg1);
                                var80.field2440.method3403(arg0);
                                var80.field2440.method3403(var69);
                                field938.method1907(var80);
                            }
                            if (arg3 == 6) {
                                class175 var81 = class175.method1891(class172.field2354, field938.field1455);
                                var81.field2440.method3242(arg1);
                                var81.field2440.method3403(arg0);
                                var81.field2440.method3403(var69);
                                field938.method1907(var81);
                            }
                            if (arg3 == 7) {
                                class175 var82 = class175.method1891(class172.field2359, field938.field1455);
                                var82.field2440.method3242(arg1);
                                var82.field2440.method3403(arg0);
                                var82.field2440.method3403(var69);
                                field938.method1907(var82);
                            }
                            if (arg3 == 8) {
                                class175 var83 = class175.method1891(class172.field2322, field938.field1455);
                                var83.field2440.method3242(arg1);
                                var83.field2440.method3403(arg0);
                                var83.field2440.method3403(var69);
                                field938.method1907(var83);
                            }
                            if (arg3 == 9) {
                                class175 var84 = class175.method1891(class172.field2360, field938.field1455);
                                var84.field2440.method3242(arg1);
                                var84.field2440.method3403(arg0);
                                var84.field2440.method3403(var69);
                                field938.method1907(var84);
                            }
                            if (arg3 == 10) {
                                class175 var85 = class175.method1891(class172.field2345, field938.field1455);
                                var85.field2440.method3242(arg1);
                                var85.field2440.method3403(arg0);
                                var85.field2440.method3403(var69);
                                field938.method1907(var85);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 == 24) {
            class228 var86 = class228.method3956(arg1);
            boolean var87 = true;
            if (var86.field2759 > 0) {
                var87 = method155(var86);
            }
            if (var87) {
                class175 var88 = class175.method1891(class172.field2387, field938.field1455);
                var88.field2440.method3242(arg1);
                field938.method1907(var88);
            }
        }
        if (arg2 == 46) {
            class72 var89 = field945[arg3];
            if (var89 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var90 = class175.method1891(class172.field2338, field938.field1455);
                var90.field2440.method3264(class51.field618[82] ? 1 : 0);
                var90.field2440.method3247(arg3);
                field938.method1907(var90);
            }
        }
        if (arg2 == 42) {
            class175 var91 = class175.method1891(class172.field2344, field938.field1455);
            var91.field2440.method3247(arg0);
            var91.field2440.method3403(arg3);
            var91.field2440.method3284(arg1);
            field938.method1907(var91);
            field936 = 0;
            Statics.field567 = class228.method3956(arg1);
            field937 = arg0;
        }
        if (arg2 == 10) {
            class84 var92 = field880[arg3];
            if (var92 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var93 = class175.method1891(class172.field2376, field938.field1455);
                var93.field2440.method3264(class51.field618[82] ? 1 : 0);
                var93.field2440.method3247(arg3);
                field938.method1907(var93);
            }
        }
        if (arg2 == 39) {
            class175 var94 = class175.method1891(class172.field2388, field938.field1455);
            var94.field2440.method3285(arg1);
            var94.field2440.method3273(arg3);
            var94.field2440.method3247(arg0);
            field938.method1907(var94);
            field936 = 0;
            Statics.field567 = class228.method3956(arg1);
            field937 = arg0;
        }
        if (arg2 == 37) {
            class175 var95 = class175.method1891(class172.field2409, field938.field1455);
            var95.field2440.method3257(arg0);
            var95.field2440.method3403(arg3);
            var95.field2440.method3284(arg1);
            field938.method1907(var95);
            field936 = 0;
            Statics.field567 = class228.method3956(arg1);
            field937 = arg0;
        }
        if (arg2 == 34) {
            class175 var96 = class175.method1891(class172.field2411, field938.field1455);
            var96.field2440.method3403(arg0);
            var96.field2440.method3247(arg3);
            var96.field2440.method3242(arg1);
            field938.method1907(var96);
            field936 = 0;
            Statics.field567 = class228.method3956(arg1);
            field937 = arg0;
        }
        if (arg2 == 14) {
            class72 var97 = field945[arg3];
            if (var97 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var98 = class175.method1891(class172.field2398, field938.field1455);
                var98.field2440.method3257(Statics.field170);
                var98.field2440.method3273(Statics.field313);
                var98.field2440.method3223(class51.field618[82] ? 1 : 0);
                var98.field2440.method3273(arg3);
                var98.field2440.method3285(Statics.field3703);
                field938.method1907(var98);
            }
        }
        if (arg2 == 1003) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            class84 var99 = field880[arg3];
            if (var99 != null) {
                class270 var100 = var99.field1271;
                if (var100.field3657 != null) {
                    var100 = var100.method4696();
                }
                if (var100 != null) {
                    class175 var101 = class175.method1891(class172.field2328, field938.field1455);
                    var101.field2440.method3257(var100.field3648);
                    field938.method1907(var101);
                }
            }
        }
        if (arg2 == 47) {
            class72 var102 = field945[arg3];
            if (var102 != null) {
                field1078 = arg6;
                field1006 = arg7;
                field1080 = 2;
                field934 = 0;
                field984 = arg0;
                field1056 = arg1;
                class175 var103 = class175.method1891(class172.field2350, field938.field1455);
                var103.field2440.method3264(class51.field618[82] ? 1 : 0);
                var103.field2440.method3247(arg3);
                field938.method1907(var103);
            }
        }
        if (arg2 == 6) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            field984 = arg0;
            field1056 = arg1;
            class175 var104 = class175.method1891(class172.field2401, field938.field1455);
            var104.field2440.method3403(arg3 >> 14 & 0x7FFF);
            var104.field2440.method3264(class51.field618[82] ? 1 : 0);
            var104.field2440.method3403(Statics.field3737 + arg0);
            var104.field2440.method3273(Statics.field435 + arg1);
            field938.method1907(var104);
        }
        if (arg2 == 1004) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            class175 var105 = class175.method1891(class172.field2392, field938.field1455);
            var105.field2440.method3257(arg3);
            field938.method1907(var105);
        }
        if (arg2 == 35) {
            class175 var106 = class175.method1891(class172.field2362, field938.field1455);
            var106.field2440.method3403(arg0);
            var106.field2440.method3284(arg1);
            var106.field2440.method3273(arg3);
            field938.method1907(var106);
            field936 = 0;
            Statics.field567 = class228.method3956(arg1);
            field937 = arg0;
        }
        if (arg2 == 25) {
            class228 var107 = class228.method539(arg1, arg0);
            if (var107 != null) {
                method1516();
                int var110 = method53(var107);
                int var111 = var110 >> 11 & 0x3F;
                method84(arg1, arg0, var111, var107.field2875);
                field978 = 0;
                field855 = method233(var107);
                if (field855 == null) {
                    field855 = "Null";
                }
                if (var107.field2754) {
                    field996 = var107.field2888 + class86.method1026(16777215);
                } else {
                    field996 = class86.method1026(65280) + var107.field2871 + class86.method1026(16777215);
                }
            }
            return;
        }
        if (arg2 == 3) {
            field1078 = arg6;
            field1006 = arg7;
            field1080 = 2;
            field934 = 0;
            field984 = arg0;
            field1056 = arg1;
            class175 var112 = class175.method1891(class172.field2333, field938.field1455);
            var112.field2440.method3273(Statics.field3737 + arg0);
            var112.field2440.method3247(Statics.field435 + arg1);
            var112.field2440.method3257(arg3 >> 14 & 0x7FFF);
            var112.field2440.method3264(class51.field618[82] ? 1 : 0);
            field938.method1907(var112);
        }
        if (field978 != 0) {
            field978 = 0;
            method313(class228.method3956(Statics.field3703));
        }
        if (field980) {
            method1516();
        }
        if (Statics.field567 != null && field936 == 0) {
            method313(Statics.field567);
        }
    }

    @ObfuscatedName("t.hi(ILjava/lang/String;I)V")
    public static void method21(int arg0, String arg1) {
        int var2 = class93.field1388;
        int[] var3 = class93.field1394;
        boolean var4 = false;
        class281 var5 = new class281(arg1, Statics.field2740);
        for (int var6 = 0; var6 < var2; var6++) {
            class72 var7 = field945[var3[var6]];
            if (var7 != null && Statics.field1754 != var7 && var7.field819 != null && var7.field819.equals(var5)) {
                if (arg0 == 1) {
                    class175 var8 = class175.method1891(class172.field2385, field938.field1455);
                    var8.field2440.method3264(0);
                    var8.field2440.method3247(var3[var6]);
                    field938.method1907(var8);
                } else if (arg0 == 4) {
                    class175 var9 = class175.method1891(class172.field2350, field938.field1455);
                    var9.field2440.method3264(0);
                    var9.field2440.method3247(var3[var6]);
                    field938.method1907(var9);
                } else if (arg0 == 6) {
                    class175 var10 = class175.method1891(class172.field2405, field938.field1455);
                    var10.field2440.method3265(0);
                    var10.field2440.method3403(var3[var6]);
                    field938.method1907(var10);
                } else if (arg0 == 7) {
                    class175 var11 = class175.method1891(class172.field2373, field938.field1455);
                    var11.field2440.method3264(0);
                    var11.field2440.method3247(var3[var6]);
                    field938.method1907(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class95.method649(4, "", class237.field3101 + arg1);
        }
    }

    @ObfuscatedName("r.hm(IIIII)V")
    public static void method84(int arg0, int arg1, int arg2, int arg3) {
        class228 var4 = class228.method539(arg0, arg1);
        if (var4 != null && var4.field2846 != null) {
            class68 var5 = new class68();
            var5.field774 = var4;
            var5.field787 = var4.field2846;
            class81.method1742(var5);
        }
        field1061 = arg3;
        field980 = true;
        Statics.field3358 = arg0;
        field1039 = arg1;
        Statics.field2039 = arg2;
        method313(var4);
    }

    @ObfuscatedName("bs.ic(I)V")
    public static void method1516() {
        if (!field980) {
            return;
        }
        class228 var0 = class228.method539(Statics.field3358, field1039);
        if (var0 != null && var0.field2782 != null) {
            class68 var1 = new class68();
            var1.field774 = var0;
            var1.field787 = var0.field2782;
            class81.method1742(var1);
        }
        field980 = false;
        method313(var0);
    }

    @ObfuscatedName("jv.ii(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method4711(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method2220(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("dg.im(Ljava/lang/String;Ljava/lang/String;IIIIZB)V")
    public static final void method2220(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field1072 || field885 >= 500) {
            return;
        }
        field1005[field885] = arg0;
        field970[field885] = arg1;
        field901[field885] = arg2;
        field968[field885] = arg3;
        field965[field885] = arg4;
        field966[field885] = arg5;
        field971[field885] = arg6;
        field885++;
    }

    @ObfuscatedName("c.ig(I)I")
    public static final int method47() {
        return field885 - 1;
    }

    @ObfuscatedName("co.ie(I)V")
    public static void method1709() {
        for (int var0 = 0; var0 < field885; var0++) {
            if (method4429(field901[var0])) {
                if (var0 < field885 - 1) {
                    for (int var1 = var0; var1 < field885 - 1; var1++) {
                        field1005[var1] = field1005[var1 + 1];
                        field970[var1] = field970[var1 + 1];
                        field901[var1] = field901[var1 + 1];
                        field968[var1] = field968[var1 + 1];
                        field965[var1] = field965[var1 + 1];
                        field966[var1] = field966[var1 + 1];
                        field971[var1] = field971[var1 + 1];
                    }
                }
                field885--;
            }
        }
    }

    @ObfuscatedName("il.ib(II)Z")
    public static boolean method4429(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("au.io(IIIII)V")
    public static final void method607(int arg0, int arg1, int arg2, int arg3) {
        if (field978 == 0 && !field980) {
            method4711(class237.field3107, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class132.field1878; var6++) {
            int var7 = class132.field1884[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field291.method2756(Statics.field706, var8, var9, var7) >= 0) {
                    class267 var12 = class267.method4025(var11);
                    if (var12.field3559 != null) {
                        var12 = var12.method4596();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field978 == 1) {
                        method4711(class237.field3102, field904 + " " + class86.field1290 + " " + class86.method1026(65535) + var12.field3533, 1, var7, var8, var9);
                    } else if (!field980) {
                        String[] var13 = var12.field3545;
                        if (field914) {
                            var13 = method1741(var13);
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
                                    method4711(var13[var14], class86.method1026(65535) + var12.field3533, var15, var7, var8, var9);
                                }
                            }
                        }
                        method4711(class237.field3103, class86.method1026(65535) + var12.field3533, 1002, var12.field3525 << 14, var8, var9);
                    } else if ((Statics.field2039 & 0x4) == 4) {
                        method4711(field855, field996 + " " + class86.field1290 + " " + class86.method1026(65535) + var12.field3533, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class84 var16 = field880[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field1271.field3634 == 1 && (var16.field1129 & 0x7F) == 64 && (var16.field1116 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field881; var17++) {
                            class84 var18 = field880[field882[var17]];
                            if (var18 != null && var16 != var18 && var18.field1271.field3634 == 1 && var16.field1129 == var18.field1129 && var16.field1116 == var18.field1116) {
                                method36(var18.field1271, field882[var17], var8, var9);
                            }
                        }
                        int var19 = class93.field1388;
                        int[] var20 = class93.field1394;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class72 var22 = field945[var20[var21]];
                            if (var22 != null && var16.field1129 == var22.field1129 && var16.field1116 == var22.field1116) {
                                method1834(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method36(var16.field1271, var11, var8, var9);
                }
                if (var10 == 0) {
                    class72 var23 = field945[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field1129 & 0x7F) == 64 && (var23.field1116 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field881; var24++) {
                            class84 var25 = field880[field882[var24]];
                            if (var25 != null && var25.field1271.field3634 == 1 && var23.field1129 == var25.field1129 && var23.field1116 == var25.field1116) {
                                method36(var25.field1271, field882[var24], var8, var9);
                            }
                        }
                        int var26 = class93.field1388;
                        int[] var27 = class93.field1394;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class72 var29 = field945[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field1129 == var29.field1129 && var23.field1116 == var29.field1116) {
                                method1834(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field954 == var11) {
                        var4 = var7;
                    } else {
                        method1834(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class205 var30 = field955[Statics.field706][var8][var9];
                    if (var30 != null) {
                        for (class92 var31 = (class92) var30.method3753(); var31 != null; var31 = (class92) var30.method3745()) {
                            class268 var32 = class268.method965(var31.field1384);
                            if (field978 == 1) {
                                method4711(class237.field3102, field904 + " " + class86.field1290 + " " + class86.method1026(16748608) + var32.field3599, 16, var31.field1384, var8, var9);
                            } else if (!field980) {
                                String[] var33 = var32.field3591;
                                if (field914) {
                                    var33 = method1741(var33);
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
                                        method4711(var33[var34], class86.method1026(16748608) + var32.field3599, var35, var31.field1384, var8, var9);
                                    } else if (var34 == 2) {
                                        method4711(class237.field2953, class86.method1026(16748608) + var32.field3599, 20, var31.field1384, var8, var9);
                                    }
                                }
                                method4711(class237.field3103, class86.method1026(16748608) + var32.field3599, 1004, var31.field1384, var8, var9);
                            } else if ((Statics.field2039 & 0x1) == 1) {
                                method4711(field855, field996 + " " + class86.field1290 + " " + class86.method1026(16748608) + var32.field3599, 17, var31.field1384, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class72 var38 = field945[field954];
            method1834(var38, field954, var36, var37);
        }
    }

    @ObfuscatedName("z.ik(Ljv;IIII)V")
    public static final void method36(class270 arg0, int arg1, int arg2, int arg3) {
        if (field885 >= 400) {
            return;
        }
        if (arg0.field3657 != null) {
            arg0 = arg0.method4696();
        }
        if (arg0 == null || !arg0.field3661 || arg0.field3639 && field993 != arg1) {
            return;
        }
        String var4 = arg0.field3633;
        if (arg0.field3650 != 0) {
            var4 = var4 + method2519(arg0.field3650, Statics.field1754.field812) + " " + class86.field1288 + class237.field3075 + arg0.field3650 + class86.field1289;
        }
        if (arg0.field3639 && field1014) {
            method4711(class237.field3103, class86.method1026(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field978 == 1) {
            method4711(class237.field3102, field904 + " " + class86.field1290 + " " + class86.method1026(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field980) {
            int var5 = arg0.field3639 && field1014 ? 2000 : 0;
            String[] var6 = arg0.field3632;
            if (field914) {
                var6 = method1741(var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class237.field3104)) {
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
                        method4711(var6[var7], class86.method1026(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class237.field3104)) {
                        short var10 = 0;
                        if (field867 != class89.field1310) {
                            if (field867 == class89.field1311 || field867 == class89.field1314 && arg0.field3650 > Statics.field1754.field812) {
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
                            method4711(var6[var9], class86.method1026(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3639 || !field1014) {
                method4711(class237.field3103, class86.method1026(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field2039 & 0x2) == 2) {
            method4711(field855, field996 + " " + class86.field1290 + " " + class86.method1026(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("cb.it(Lby;IIIB)V")
    public static final void method1834(class72 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1754 == arg0 || field885 >= 400) {
            return;
        }
        String var4;
        if (arg0.field807 == 0) {
            var4 = arg0.field811[0] + arg0.field819 + arg0.field811[1] + method2519(arg0.field812, Statics.field1754.field812) + " " + class86.field1288 + class237.field3075 + arg0.field812 + class86.field1289 + arg0.field811[2];
        } else {
            var4 = arg0.field811[0] + arg0.field819 + arg0.field811[1] + " " + class86.field1288 + class237.field3109 + arg0.field807 + class86.field1289 + arg0.field811[2];
        }
        if (field978 == 1) {
            method4711(class237.field3102, field904 + " " + class86.field1290 + " " + class86.method1026(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field980) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field951[var5] != null) {
                    short var6 = 0;
                    if (field951[var5].equalsIgnoreCase(class237.field3104)) {
                        if (field866 == class89.field1310) {
                            continue;
                        }
                        if (field866 == class89.field1311 || field866 == class89.field1314 && arg0.field812 > Statics.field1754.field812) {
                            var6 = 2000;
                        }
                        if (Statics.field1754.field829 != 0 && arg0.field829 != 0) {
                            if (Statics.field1754.field829 == arg0.field829) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field845[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field950[var5] + var6;
                    method4711(field951[var5], class86.method1026(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2039 & 0x8) == 8) {
            method4711(field855, field996 + " " + class86.field1290 + " " + class86.method1026(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field885; var9++) {
            if (field901[var9] == 23) {
                field970[var9] = class86.method1026(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("de.iy(III)Ljava/lang/String;")
    public static final String method2519(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class86.method1026(16711680);
        } else if (var2 < -6) {
            return class86.method1026(16723968);
        } else if (var2 < -3) {
            return class86.method1026(16740352);
        } else if (var2 < 0) {
            return class86.method1026(16756736);
        } else if (var2 > 9) {
            return class86.method1026(65280);
        } else if (var2 > 6) {
            return class86.method1026(4259584);
        } else if (var2 > 3) {
            return class86.method1026(8453888);
        } else if (var2 > 0) {
            return class86.method1026(12648192);
        } else {
            return class86.method1026(16776960);
        }
    }

    @ObfuscatedName("fi.ix(IIIIIIIIB)V")
    public static final void method3141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class228.method3132(arg0)) {
            Statics.field629 = null;
            method3(Statics.field713[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field629 != null) {
                method3(Statics.field629, -1412584499, arg1, arg2, arg3, arg4, Statics.field3364, Statics.field269, arg7);
                Statics.field629 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field1030[var8] = true;
            }
        } else {
            field1030[arg7] = true;
        }
    }

    @ObfuscatedName("m.ih([Lhs;IIIIIIIII)V")
    public static final void method3(class228[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class306.method5181(arg2, arg3, arg4, arg5);
        class134.method2625();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class228 var10 = arg0[var9];
            if (var10 != null && (var10.field2774 == arg1 || arg1 == -1412584499 && field941 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field1033[field850] = var10.field2768 + arg6;
                    field1034[field850] = var10.field2769 + arg7;
                    field956[field850] = var10.field2770;
                    field964[field850] = var10.field2790;
                    var11 = ++field850 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2742 = var11;
                var10.field2887 = field1036;
                if (!var10.field2754 || !method1751(var10)) {
                    if (var10.field2759 > 0) {
                        int var12 = var10.field2759;
                        if (var12 == 324) {
                            if (field851 == -1) {
                                field851 = var10.field2827;
                                field1090 = var10.field2791;
                            }
                            if (field1088.field2730) {
                                var10.field2827 = field851;
                            } else {
                                var10.field2827 = field1090;
                            }
                        } else if (var12 == 325) {
                            if (field851 == -1) {
                                field851 = var10.field2827;
                                field1090 = var10.field2791;
                            }
                            if (field1088.field2730) {
                                var10.field2827 = field1090;
                            } else {
                                var10.field2827 = field851;
                            }
                        } else if (var12 == 327) {
                            var10.field2873 = 150;
                            var10.field2807 = (int) (Math.sin((double) field1036 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2798 = 5;
                            var10.field2799 = 0;
                        } else if (var12 == 328) {
                            var10.field2873 = 150;
                            var10.field2807 = (int) (Math.sin((double) field1036 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2798 = 5;
                            var10.field2799 = 1;
                        }
                    }
                    int var13 = var10.field2768 + arg6;
                    int var14 = var10.field2769 + arg7;
                    int var15 = var10.field2786;
                    if (field941 == var10) {
                        if (arg1 != -1412584499 && !var10.field2820) {
                            Statics.field629 = arg0;
                            Statics.field3364 = arg6;
                            Statics.field269 = arg7;
                            continue;
                        }
                        if (field1009 && field1003) {
                            int var16 = class60.field691;
                            int var17 = class60.field692;
                            int var18 = var16 - field1000;
                            int var19 = var17 - field922;
                            if (var18 < field857) {
                                var18 = field857;
                            }
                            if (var10.field2770 + var18 > field857 + field931.field2770) {
                                var18 = field857 + field931.field2770 - var10.field2770;
                            }
                            if (var19 < field1071) {
                                var19 = field1071;
                            }
                            if (var10.field2790 + var19 > field1071 + field931.field2790) {
                                var19 = field1071 + field931.field2790 - var10.field2790;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2820) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2864 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2864 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2770 + var13;
                        int var27 = var10.field2790 + var14;
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
                        int var30 = var10.field2770 + var13;
                        int var31 = var10.field2790 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2754 || var20 < var22 && var21 < var23) {
                        if (var10.field2759 != 0) {
                            if (var10.field2759 == 1336) {
                                if (field989) {
                                    var14 += 15;
                                    Statics.field1668.method5040("Fps:" + field656, var10.field2770 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field991) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field991) {
                                        var34 = 16711680;
                                    }
                                    Statics.field1668.method5040("Mem:" + var33 + "k", var10.field2770 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2759 == 1337) {
                                field974 = var13;
                                field975 = var14;
                                int var37 = var10.field2770;
                                int var38 = var10.field2790;
                                field929++;
                                if (Statics.field1754.field1129 >> 7 == field984 && Statics.field1754.field1116 >> 7 == field1056) {
                                    field984 = 0;
                                }
                                method3848(Statics.field1754, false);
                                method1020();
                                method3036(true);
                                method2984();
                                method3036(false);
                                method1811();
                                for (class82 var39 = (class82) field924.method3752(); var39 != null; var39 = (class82) field924.method3762()) {
                                    if (Statics.field706 != var39.field1262 || var39.field1264) {
                                        var39.method3740();
                                    } else if (field1036 >= var39.field1259) {
                                        var39.method1713(field1092);
                                        if (var39.field1264) {
                                            var39.method3740();
                                        } else {
                                            Statics.field291.method2723(var39.field1262, var39.field1258, var39.field1255, var39.field1256, 60, var39, 0, -1, false);
                                        }
                                    }
                                }
                                method37(var13, var14, var37, var38, true);
                                int var40 = field952;
                                int var41 = field1048;
                                int var42 = field1085;
                                int var43 = field1086;
                                class306.method5181(var40, var41, var40 + var42, var41 + var43);
                                class134.method2625();
                                if (!field1069) {
                                    int var44 = field908;
                                    if (field917 / 256 > var44) {
                                        var44 = field917 / 256;
                                    }
                                    if (field1070[4] && field933[4] + 128 > var44) {
                                        var44 = field933[4] + 128;
                                    }
                                    int var45 = field909 & 0x7FF;
                                    method647(Statics.field790, method1017(Statics.field1754.field1129, Statics.field1754.field1116, Statics.field706) - field1062, Statics.field28, var44, var45, var44 * 3 + 600);
                                }
                                int var46;
                                if (field1069) {
                                    var46 = method1543();
                                } else {
                                    var46 = method83();
                                }
                                int var47 = Statics.field1344;
                                int var48 = Statics.field2664;
                                int var49 = Statics.field16;
                                int var50 = Statics.field784;
                                int var51 = Statics.field1254;
                                for (int var52 = 0; var52 < 5; var52++) {
                                    if (field1070[var52]) {
                                        int var53 = (int) (Math.random() * (double) (field999[var52] * 2 + 1) - (double) field999[var52] + Math.sin((double) field1073[var52] / 100.0D * (double) field1074[var52]) * (double) field933[var52]);
                                        if (var52 == 0) {
                                            Statics.field1344 += var53;
                                        }
                                        if (var52 == 1) {
                                            Statics.field2664 += var53;
                                        }
                                        if (var52 == 2) {
                                            Statics.field16 += var53;
                                        }
                                        if (var52 == 3) {
                                            Statics.field1254 = Statics.field1254 + var53 & 0x7FF;
                                        }
                                        if (var52 == 4) {
                                            Statics.field784 += var53;
                                            if (Statics.field784 < 128) {
                                                Statics.field784 = 128;
                                            }
                                            if (Statics.field784 > 383) {
                                                Statics.field784 = 383;
                                            }
                                        }
                                    }
                                }
                                int var54 = class60.field691;
                                int var55 = class60.field692;
                                if (class60.field697 != 0) {
                                    var54 = class60.field698;
                                    var55 = class60.field701;
                                }
                                if (var54 >= var40 && var54 < var40 + var42 && var55 >= var41 && var55 < var41 + var43) {
                                    int var56 = var54 - var40;
                                    int var57 = var55 - var41;
                                    class132.field1883 = var56;
                                    class132.field1879 = var57;
                                    class132.field1880 = true;
                                    class132.field1878 = 0;
                                    class132.field1881 = false;
                                } else {
                                    class132.method156();
                                }
                                method3498();
                                class306.method5225(var40, var41, var42, var43, 0);
                                method3498();
                                int var58 = class134.field1913;
                                class134.field1913 = field1087;
                                Statics.field291.method2753(Statics.field1344, Statics.field2664, Statics.field16, Statics.field784, Statics.field1254, var46);
                                class8.method1075();
                                class134.field1913 = var58;
                                method3498();
                                Statics.field291.method2821();
                                field918 = 0;
                                boolean var59 = false;
                                int var60 = -1;
                                int var61 = class93.field1388;
                                int[] var62 = class93.field1394;
                                for (int var63 = 0; var63 < field881 + var61; var63++) {
                                    class75 var64;
                                    if (var63 < var61) {
                                        var64 = field945[var62[var63]];
                                        if (field954 == var62[var63]) {
                                            var59 = true;
                                            var60 = var63;
                                            continue;
                                        }
                                    } else {
                                        var64 = field880[field882[var63 - var61]];
                                    }
                                    method13(var64, var63, var40, var41, var42, var43);
                                }
                                if (var59) {
                                    method13(field945[field954], var60, var40, var41, var42, var43);
                                }
                                for (int var65 = 0; var65 < field918; var65++) {
                                    int var66 = field888[var65];
                                    int var67 = field921[var65];
                                    int var68 = field923[var65];
                                    int var69 = field1057[var65];
                                    boolean var70 = true;
                                    while (var70) {
                                        var70 = false;
                                        for (int var71 = 0; var71 < var65; var71++) {
                                            if (var67 + 2 > field921[var71] - field1057[var71] && var67 - var69 < field921[var71] + 2 && var66 - var68 < field923[var71] + field888[var71] && var66 + var68 > field888[var71] - field923[var71] && field921[var71] - field1057[var71] < var67) {
                                                var67 = field921[var71] - field1057[var71];
                                                var70 = true;
                                            }
                                        }
                                    }
                                    field930 = field888[var65];
                                    field998 = field921[var65] = var67;
                                    String var72 = field927[var65];
                                    if (field987 == 0) {
                                        int var73 = 16776960;
                                        if (field1081[var65] < 6) {
                                            var73 = field1040[field1081[var65]];
                                        }
                                        if (field1081[var65] == 6) {
                                            var73 = field929 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field1081[var65] == 7) {
                                            var73 = field929 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field1081[var65] == 8) {
                                            var73 = field929 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field1081[var65] == 9) {
                                            int var74 = 150 - field926[var65];
                                            if (var74 < 50) {
                                                var73 = var74 * 1280 + 16711680;
                                            } else if (var74 < 100) {
                                                var73 = 16776960 - (var74 - 50) * 327680;
                                            } else if (var74 < 150) {
                                                var73 = (var74 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field1081[var65] == 10) {
                                            int var75 = 150 - field926[var65];
                                            if (var75 < 50) {
                                                var73 = var75 * 5 + 16711680;
                                            } else if (var75 < 100) {
                                                var73 = 16711935 - (var75 - 50) * 327680;
                                            } else if (var75 < 150) {
                                                var73 = (var75 - 100) * 327680 + 255 - (var75 - 100) * 5;
                                            }
                                        }
                                        if (field1081[var65] == 11) {
                                            int var76 = 150 - field926[var65];
                                            if (var76 < 50) {
                                                var73 = 16777215 - var76 * 327685;
                                            } else if (var76 < 100) {
                                                var73 = (var76 - 50) * 327685 + 65280;
                                            } else if (var76 < 150) {
                                                var73 = 16777215 - (var76 - 100) * 327680;
                                            }
                                        }
                                        if (field925[var65] == 0) {
                                            Statics.field3322.method5042(var72, field930 + var40, field998 + var41, var73, 0);
                                        }
                                        if (field925[var65] == 1) {
                                            Statics.field3322.method4995(var72, field930 + var40, field998 + var41, var73, 0, field929);
                                        }
                                        if (field925[var65] == 2) {
                                            Statics.field3322.method5003(var72, field930 + var40, field998 + var41, var73, 0, field929);
                                        }
                                        if (field925[var65] == 3) {
                                            Statics.field3322.method5010(var72, field930 + var40, field998 + var41, var73, 0, field929, 150 - field926[var65]);
                                        }
                                        if (field925[var65] == 4) {
                                            int var77 = (150 - field926[var65]) * (Statics.field3322.method4998(var72) + 100) / 150;
                                            class306.method5182(field930 + var40 - 50, var41, field930 + var40 + 50, var41 + var43);
                                            Statics.field3322.method5015(var72, field930 + var40 + 50 - var77, field998 + var41, var73, 0);
                                            class306.method5181(var40, var41, var40 + var42, var41 + var43);
                                        }
                                        if (field925[var65] == 5) {
                                            int var78 = 150 - field926[var65];
                                            int var79 = 0;
                                            if (var78 < 25) {
                                                var79 = var78 - 25;
                                            } else if (var78 > 125) {
                                                var79 = var78 - 125;
                                            }
                                            class306.method5182(var40, field998 + var41 - Statics.field3322.field3782 - 1, var40 + var42, field998 + var41 + 5);
                                            Statics.field3322.method5042(var72, field930 + var40, field998 + var41 + var79, var73, 0);
                                            class306.method5181(var40, var41, var40 + var42, var41 + var43);
                                        }
                                    } else {
                                        Statics.field3322.method5042(var72, field930 + var40, field998 + var41, 16776960, 0);
                                    }
                                }
                                method1009(var40, var41);
                                ((class123) Statics.field1915).method2405(field1092);
                                if (field1080 == 1) {
                                    Statics.field3489[field934 / 100].method5302(field1078 - 8, field1006 - 8);
                                }
                                if (field1080 == 2) {
                                    Statics.field3489[field934 / 100 + 4].method5302(field1078 - 8, field1006 - 8);
                                }
                                method224();
                                Statics.field1344 = var47;
                                Statics.field2664 = var48;
                                Statics.field16 = var49;
                                Statics.field784 = var50;
                                Statics.field1254 = var51;
                                if (field849 && class250.method2620(true, false) == 0) {
                                    field849 = false;
                                }
                                if (field849) {
                                    class306.method5225(var40, var41, var42, var43, 0);
                                    method38(class237.field3184, false);
                                }
                                field1030[var10.field2742] = true;
                                class306.method5181(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2759 == 1338) {
                                method3498();
                                class222 var80 = var10.method4112(false);
                                if (var80 != null) {
                                    class306.method5181(var13, var14, var80.field2709 + var13, var80.field2704 + var14);
                                    if (field979 == 2 || field979 == 5) {
                                        class306.method5223(var13, var14, 0, var80.field2705, var80.field2703);
                                    } else {
                                        int var81 = field909 & 0x7FF;
                                        int var82 = Statics.field1754.field1129 / 32 + 48;
                                        int var83 = 464 - Statics.field1754.field1116 / 32;
                                        Statics.field1577.method5313(var13, var14, var80.field2709, var80.field2704, var82, var83, var81, 256, var80.field2705, var80.field2703);
                                        for (int var84 = 0; var84 < field1051; var84++) {
                                            int var85 = field1035[var84] * 4 + 2 - Statics.field1754.field1129 / 32;
                                            int var86 = field1053[var84] * 4 + 2 - Statics.field1754.field1116 / 32;
                                            method468(var13, var14, var85, var86, field1054[var84], var80);
                                        }
                                        int var87 = 0;
                                        while (true) {
                                            if (var87 >= 104) {
                                                for (int var92 = 0; var92 < field881; var92++) {
                                                    class84 var93 = field880[field882[var92]];
                                                    if (var93 != null && var93.method1046()) {
                                                        class270 var94 = var93.field1271;
                                                        if (var94 != null && var94.field3657 != null) {
                                                            var94 = var94.method4696();
                                                        }
                                                        if (var94 != null && var94.field3663 && var94.field3661) {
                                                            int var95 = var93.field1129 / 32 - Statics.field1754.field1129 / 32;
                                                            int var96 = var93.field1116 / 32 - Statics.field1754.field1116 / 32;
                                                            method468(var13, var14, var95, var96, Statics.field770[1], var80);
                                                        }
                                                    }
                                                }
                                                int var97 = class93.field1388;
                                                int[] var98 = class93.field1394;
                                                for (int var99 = 0; var99 < var97; var99++) {
                                                    class72 var100 = field945[var98[var99]];
                                                    if (var100 != null && var100.method1046() && !var100.field827 && Statics.field1754 != var100) {
                                                        int var101 = var100.field1129 / 32 - Statics.field1754.field1129 / 32;
                                                        int var102 = var100.field1116 / 32 - Statics.field1754.field1116 / 32;
                                                        boolean var103 = false;
                                                        if (Statics.field1754.field829 != 0 && var100.field829 != 0 && Statics.field1754.field829 == var100.field829) {
                                                            var103 = true;
                                                        }
                                                        if (var100.method1032()) {
                                                            method468(var13, var14, var101, var102, Statics.field770[3], var80);
                                                        } else if (var103) {
                                                            method468(var13, var14, var101, var102, Statics.field770[4], var80);
                                                        } else if (var100.method1036()) {
                                                            method468(var13, var14, var101, var102, Statics.field770[5], var80);
                                                        } else {
                                                            method468(var13, var14, var101, var102, Statics.field770[2], var80);
                                                        }
                                                    }
                                                }
                                                if (field1001 != 0 && field1036 % 20 < 10) {
                                                    if (field1001 == 1 && field844 >= 0 && field844 < field880.length) {
                                                        class84 var104 = field880[field844];
                                                        if (var104 != null) {
                                                            int var105 = var104.field1129 / 32 - Statics.field1754.field1129 / 32;
                                                            int var106 = var104.field1116 / 32 - Statics.field1754.field1116 / 32;
                                                            method1019(var13, var14, var105, var106, Statics.field715[1], var80);
                                                        }
                                                    }
                                                    if (field1001 == 2) {
                                                        int var107 = field861 * 4 - Statics.field3737 * 4 + 2 - Statics.field1754.field1129 / 32;
                                                        int var108 = field862 * 4 - Statics.field435 * 4 + 2 - Statics.field1754.field1116 / 32;
                                                        method1019(var13, var14, var107, var108, Statics.field715[1], var80);
                                                    }
                                                    if (field1001 == 10 && field860 >= 0 && field860 < field945.length) {
                                                        class72 var109 = field945[field860];
                                                        if (var109 != null) {
                                                            int var110 = var109.field1129 / 32 - Statics.field1754.field1129 / 32;
                                                            int var111 = var109.field1116 / 32 - Statics.field1754.field1116 / 32;
                                                            method1019(var13, var14, var110, var111, Statics.field715[1], var80);
                                                        }
                                                    }
                                                }
                                                if (field984 != 0) {
                                                    int var112 = field984 * 4 + 2 - Statics.field1754.field1129 / 32;
                                                    int var113 = field1056 * 4 + 2 - Statics.field1754.field1116 / 32;
                                                    method468(var13, var14, var112, var113, Statics.field715[0], var80);
                                                }
                                                if (!Statics.field1754.field827) {
                                                    class306.method5225(var80.field2709 / 2 + var13 - 1, var80.field2704 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var88 = 0; var88 < 104; var88++) {
                                                class205 var89 = field955[Statics.field706][var87][var88];
                                                if (var89 != null) {
                                                    int var90 = var87 * 4 + 2 - Statics.field1754.field1129 / 32;
                                                    int var91 = var88 * 4 + 2 - Statics.field1754.field1116 / 32;
                                                    method468(var13, var14, var90, var91, Statics.field770[0], var80);
                                                }
                                            }
                                            var87++;
                                        }
                                    }
                                    field907[var11] = true;
                                }
                                class306.method5181(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2759 == 1339) {
                                method2426(var10, var13, var14, var11);
                                class306.method5181(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2759 == 1400) {
                                Statics.field2449.method5445(var13, var14, var10.field2770, var10.field2790, field1036);
                            }
                            if (var10.field2759 == 1401) {
                                Statics.field2449.method5544(var13, var14, var10.field2770, var10.field2790);
                            }
                        }
                        if (var10.field2864 == 0) {
                            if (!var10.field2754 && method1751(var10) && Statics.field625 != var10) {
                                continue;
                            }
                            if (!var10.field2754) {
                                if (var10.field2777 > var10.field2785 - var10.field2790) {
                                    var10.field2777 = var10.field2785 - var10.field2790;
                                }
                                if (var10.field2777 < 0) {
                                    var10.field2777 = 0;
                                }
                            }
                            method3(arg0, var10.field2755, var20, var21, var22, var23, var13 - var10.field2776, var14 - var10.field2777, var11);
                            if (var10.field2879 != null) {
                                method3(var10.field2879, var10.field2755, var20, var21, var22, var23, var13 - var10.field2776, var14 - var10.field2777, var11);
                            }
                            class67 var114 = (class67) field1052.method3704((long) var10.field2755);
                            if (var114 != null) {
                                method3141(var114.field771, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class306.method5181(arg2, arg3, arg4, arg5);
                            class134.method2625();
                        }
                        if (field969 || field1032[var11] || field1037 > 1) {
                            if (var10.field2864 == 0 && !var10.field2754 && var10.field2785 > var10.field2790) {
                                method3849(var10.field2770 + var13, var14, var10.field2777, var10.field2790, var10.field2785);
                            }
                            if (var10.field2864 != 1) {
                                if (var10.field2864 == 2) {
                                    int var115 = 0;
                                    for (int var116 = 0; var116 < var10.field2767; var116++) {
                                        for (int var117 = 0; var117 < var10.field2766; var117++) {
                                            int var118 = (var10.field2866 + 32) * var117 + var13;
                                            int var119 = (var10.field2845 + 32) * var116 + var14;
                                            if (var115 < 20) {
                                                var118 += var10.field2792[var115];
                                                var119 += var10.field2824[var115];
                                            }
                                            if (var10.field2876[var115] > 0) {
                                                boolean var120 = false;
                                                boolean var121 = false;
                                                int var122 = var10.field2876[var115] - 1;
                                                if (var118 + 32 > arg2 && var118 < arg4 && var119 + 32 > arg3 && var119 < arg5 || Statics.field3516 == var10 && field988 == var115) {
                                                    class310 var123;
                                                    if (field978 == 1 && Statics.field313 == var115 && Statics.field3703 == var10.field2755) {
                                                        var123 = class268.method4633(var122, var10.field2874[var115], 2, 0, 2, false);
                                                    } else {
                                                        var123 = class268.method4633(var122, var10.field2874[var115], 1, 3153952, 2, false);
                                                    }
                                                    if (var123 == null) {
                                                        method313(var10);
                                                    } else if (Statics.field3516 == var10 && field988 == var115) {
                                                        int var124 = class60.field691 - field994;
                                                        int var125 = class60.field692 - field940;
                                                        if (var124 < 5 && var124 > -5) {
                                                            var124 = 0;
                                                        }
                                                        if (var125 < 5 && var125 > -5) {
                                                            var125 = 0;
                                                        }
                                                        if (field943 < 5) {
                                                            var124 = 0;
                                                            var125 = 0;
                                                        }
                                                        var123.method5308(var118 + var124, var119 + var125, 128);
                                                        if (arg1 != -1) {
                                                            class228 var126 = arg0[arg1 & 0xFFFF];
                                                            if (var119 + var125 < class306.field3874 && var126.field2777 > 0) {
                                                                int var127 = field1092 * (class306.field3874 - var119 - var125) / 3;
                                                                if (var127 > field1092 * 10) {
                                                                    var127 = field1092 * 10;
                                                                }
                                                                if (var127 > var126.field2777) {
                                                                    var127 = var126.field2777;
                                                                }
                                                                var126.field2777 -= var127;
                                                                field940 += var127;
                                                                method313(var126);
                                                            }
                                                            if (var119 + var125 + 32 > class306.field3873 && var126.field2777 < var126.field2785 - var126.field2790) {
                                                                int var128 = field1092 * (var119 + var125 + 32 - class306.field3873) / 3;
                                                                if (var128 > field1092 * 10) {
                                                                    var128 = field1092 * 10;
                                                                }
                                                                if (var128 > var126.field2785 - var126.field2790 - var126.field2777) {
                                                                    var128 = var126.field2785 - var126.field2790 - var126.field2777;
                                                                }
                                                                var126.field2777 += var128;
                                                                field940 -= var128;
                                                                method313(var126);
                                                            }
                                                        }
                                                    } else if (Statics.field567 == var10 && field937 == var115) {
                                                        var123.method5308(var118, var119, 128);
                                                    } else {
                                                        var123.method5302(var118, var119);
                                                    }
                                                }
                                            } else if (var10.field2825 != null && var115 < 20) {
                                                class310 var129 = var10.method4110(var115);
                                                if (var129 != null) {
                                                    var129.method5302(var118, var119);
                                                } else if (class228.field2753) {
                                                    method313(var10);
                                                }
                                            }
                                            var115++;
                                        }
                                    }
                                } else if (var10.field2864 == 3) {
                                    int var130;
                                    if (method530(var10)) {
                                        var130 = var10.field2781;
                                        if (Statics.field625 == var10 && var10.field2783 != 0) {
                                            var130 = var10.field2783;
                                        }
                                    } else {
                                        var130 = var10.field2780;
                                        if (Statics.field625 == var10 && var10.field2868 != 0) {
                                            var130 = var10.field2868;
                                        }
                                    }
                                    if (var10.field2784) {
                                        switch(var10.field2833.field3887) {
                                            case 1:
                                                class306.method5190(var13, var14, var10.field2770, var10.field2790, var10.field2780, var10.field2781, 256 - (var10.field2786 & 0xFF), 256 - (var10.field2787 & 0xFF));
                                                break;
                                            case 2:
                                                class306.method5191(var13, var14, var10.field2770, var10.field2790, var10.field2780, var10.field2781, 256 - (var10.field2786 & 0xFF), 256 - (var10.field2787 & 0xFF));
                                                break;
                                            case 3:
                                                class306.method5192(var13, var14, var10.field2770, var10.field2790, var10.field2780, var10.field2781, 256 - (var10.field2786 & 0xFF), 256 - (var10.field2787 & 0xFF));
                                                break;
                                            case 4:
                                                class306.method5193(var13, var14, var10.field2770, var10.field2790, var10.field2780, var10.field2781, 256 - (var10.field2786 & 0xFF), 256 - (var10.field2787 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class306.method5225(var13, var14, var10.field2770, var10.field2790, var130);
                                                } else {
                                                    class306.method5188(var13, var14, var10.field2770, var10.field2790, var130, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class306.method5196(var13, var14, var10.field2770, var10.field2790, var130);
                                    } else {
                                        class306.method5197(var13, var14, var10.field2770, var10.field2790, var130, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2864 == 4) {
                                    class287 var131 = var10.method4109();
                                    if (var131 != null) {
                                        String var132 = var10.field2815;
                                        int var133;
                                        if (method530(var10)) {
                                            var133 = var10.field2781;
                                            if (Statics.field625 == var10 && var10.field2783 != 0) {
                                                var133 = var10.field2783;
                                            }
                                            if (var10.field2751.length() > 0) {
                                                var132 = var10.field2751;
                                            }
                                        } else {
                                            var133 = var10.field2780;
                                            if (Statics.field625 == var10 && var10.field2868 != 0) {
                                                var133 = var10.field2868;
                                            }
                                        }
                                        if (var10.field2754 && var10.field2875 != -1) {
                                            class268 var134 = class268.method965(var10.field2875);
                                            var132 = var134.field3599;
                                            if (var132 == null) {
                                                var132 = "null";
                                            }
                                            if ((var134.field3588 == 1 || var10.field2812 != 1) && var10.field2812 != -1) {
                                                var132 = class86.method1026(16748608) + var132 + class86.field1291 + " " + 'x' + method970(var10.field2812);
                                            }
                                        }
                                        if (field886 == var10) {
                                            class237 var10000 = (class237) null;
                                            var132 = class237.field3110;
                                            var133 = var10.field2780;
                                        }
                                        if (!var10.field2754) {
                                            var132 = method5108(var132, var10);
                                        }
                                        var131.method5007(var132, var13, var14, var10.field2770, var10.field2790, var133, var10.field2853 ? 0 : -1, var10.field2818, var10.field2819, var10.field2817);
                                    } else if (class228.field2753) {
                                        method313(var10);
                                    }
                                } else if (var10.field2864 == 5) {
                                    if (var10.field2754) {
                                        class310 var136;
                                        if (var10.field2875 == -1) {
                                            var136 = var10.method4108(false);
                                        } else {
                                            var136 = class268.method4633(var10.field2875, var10.field2812, var10.field2794, var10.field2795, var10.field2863, false);
                                        }
                                        if (var136 != null) {
                                            int var137 = var136.field3898;
                                            int var138 = var136.field3903;
                                            if (var10.field2793) {
                                                class306.method5182(var13, var14, var10.field2770 + var13, var10.field2790 + var14);
                                                int var139 = (var10.field2770 + (var137 - 1)) / var137;
                                                int var140 = (var10.field2790 + (var138 - 1)) / var138;
                                                for (int var141 = 0; var141 < var139; var141++) {
                                                    for (int var142 = 0; var142 < var140; var142++) {
                                                        if (var10.field2796 != 0) {
                                                            var136.method5301(var137 / 2 + var137 * var141 + var13, var138 / 2 + var138 * var142 + var14, var10.field2796, 4096);
                                                        } else if (var15 == 0) {
                                                            var136.method5302(var137 * var141 + var13, var138 * var142 + var14);
                                                        } else {
                                                            var136.method5308(var137 * var141 + var13, var138 * var142 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class306.method5181(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var143 = var10.field2770 * 4096 / var137;
                                                if (var10.field2796 != 0) {
                                                    var136.method5301(var10.field2770 / 2 + var13, var10.field2790 / 2 + var14, var10.field2796, var143);
                                                } else if (var15 != 0) {
                                                    var136.method5310(var13, var14, var10.field2770, var10.field2790, 256 - (var15 & 0xFF));
                                                } else if (var10.field2770 == var137 && var10.field2790 == var138) {
                                                    var136.method5302(var13, var14);
                                                } else {
                                                    var136.method5349(var13, var14, var10.field2770, var10.field2790);
                                                }
                                            }
                                        } else if (class228.field2753) {
                                            method313(var10);
                                        }
                                    } else {
                                        class310 var135 = var10.method4108(method530(var10));
                                        if (var135 != null) {
                                            var135.method5302(var13, var14);
                                        } else if (class228.field2753) {
                                            method313(var10);
                                        }
                                    }
                                } else if (var10.field2864 == 6) {
                                    boolean var144 = method530(var10);
                                    int var145;
                                    if (var144) {
                                        var145 = var10.field2832;
                                    } else {
                                        var145 = var10.field2802;
                                    }
                                    class131 var146 = null;
                                    int var147 = 0;
                                    if (var10.field2875 != -1) {
                                        class268 var148 = class268.method965(var10.field2875);
                                        if (var148 != null) {
                                            class268 var149 = var148.method4643(var10.field2812);
                                            var146 = var149.method4665(1);
                                            if (var146 == null) {
                                                method313(var10);
                                            } else {
                                                var146.method2578();
                                                var147 = var146.field2001 / 2;
                                            }
                                        }
                                    } else if (var10.field2798 == 5) {
                                        if (var10.field2799 == 0) {
                                            var146 = field1088.method4075((class272) null, -1, (class272) null, -1);
                                        } else {
                                            var146 = Statics.field1754.method1039();
                                        }
                                    } else if (var145 == -1) {
                                        var146 = var10.method4105((class272) null, -1, var144, Statics.field1754.field820);
                                        if (var146 == null && class228.field2753) {
                                            method313(var10);
                                        }
                                    } else {
                                        class272 var150 = class272.method4180(var145);
                                        var146 = var10.method4105(var150, var10.field2877, var144, Statics.field1754.field820);
                                        if (var146 == null && class228.field2753) {
                                            method313(var10);
                                        }
                                    }
                                    class134.method2628(var10.field2770 / 2 + var13, var10.field2790 / 2 + var14);
                                    int var151 = var10.field2809 * class134.field1918[var10.field2873] >> 16;
                                    int var152 = var10.field2809 * class134.field1903[var10.field2873] >> 16;
                                    if (var146 != null) {
                                        if (var10.field2754) {
                                            var146.method2578();
                                            if (var10.field2779) {
                                                var146.method2541(0, var10.field2807, var10.field2808, var10.field2873, var10.field2778, var10.field2865 + var147 + var151, var10.field2865 + var152, var10.field2809);
                                            } else {
                                                var146.method2540(0, var10.field2807, var10.field2808, var10.field2873, var10.field2778, var10.field2865 + var147 + var151, var10.field2865 + var152);
                                            }
                                        } else {
                                            var146.method2540(0, var10.field2807, 0, var10.field2873, 0, var151, var152);
                                        }
                                    }
                                    class134.method2657();
                                } else {
                                    if (var10.field2864 == 7) {
                                        class287 var153 = var10.method4109();
                                        if (var153 == null) {
                                            if (class228.field2753) {
                                                method313(var10);
                                            }
                                            continue;
                                        }
                                        int var154 = 0;
                                        for (int var155 = 0; var155 < var10.field2767; var155++) {
                                            for (int var156 = 0; var156 < var10.field2766; var156++) {
                                                if (var10.field2876[var154] > 0) {
                                                    class268 var157 = class268.method965(var10.field2876[var154] - 1);
                                                    String var158;
                                                    if (var157.field3588 != 1 && var10.field2874[var154] == 1) {
                                                        var158 = class86.method1026(16748608) + var157.field3599 + class86.field1291;
                                                    } else {
                                                        var158 = class86.method1026(16748608) + var157.field3599 + class86.field1291 + " " + 'x' + method970(var10.field2874[var154]);
                                                    }
                                                    int var159 = (var10.field2866 + 115) * var156 + var13;
                                                    int var160 = (var10.field2845 + 12) * var155 + var14;
                                                    if (var10.field2818 == 0) {
                                                        var153.method5015(var158, var159, var160, var10.field2780, var10.field2853 ? 0 : -1);
                                                    } else if (var10.field2818 == 1) {
                                                        var153.method5042(var158, var10.field2770 / 2 + var159, var160, var10.field2780, var10.field2853 ? 0 : -1);
                                                    } else {
                                                        var153.method5040(var158, var10.field2770 + var159 - 1, var160, var10.field2780, var10.field2853 ? 0 : -1);
                                                    }
                                                }
                                                var154++;
                                            }
                                        }
                                    }
                                    if (var10.field2864 == 8 && Statics.field1217 == var10 && field977 == field976) {
                                        int var161 = 0;
                                        int var162 = 0;
                                        class287 var163 = Statics.field1668;
                                        String var164 = var10.field2815;
                                        String var165 = method5108(var164, var10);
                                        while (var165.length() > 0) {
                                            int var166 = var165.indexOf(class86.field1285);
                                            String var167;
                                            if (var166 == -1) {
                                                var167 = var165;
                                                var165 = "";
                                            } else {
                                                var167 = var165.substring(0, var166);
                                                var165 = var165.substring(var166 + 4);
                                            }
                                            int var168 = var163.method4998(var167);
                                            if (var168 > var161) {
                                                var161 = var168;
                                            }
                                            var162 += var163.field3782 + 1;
                                        }
                                        var161 += 6;
                                        var162 += 7;
                                        int var169 = var10.field2770 + var13 - 5 - var161;
                                        int var170 = var10.field2790 + var14 + 5;
                                        if (var169 < var13 + 5) {
                                            var169 = var13 + 5;
                                        }
                                        if (var161 + var169 > arg4) {
                                            var169 = arg4 - var161;
                                        }
                                        if (var162 + var170 > arg5) {
                                            var170 = arg5 - var162;
                                        }
                                        class306.method5225(var169, var170, var161, var162, 16777120);
                                        class306.method5196(var169, var170, var161, var162, 0);
                                        String var171 = var10.field2815;
                                        int var172 = var163.field3782 + var170 + 2;
                                        String var173 = method5108(var171, var10);
                                        while (var173.length() > 0) {
                                            int var174 = var173.indexOf(class86.field1285);
                                            String var175;
                                            if (var174 == -1) {
                                                var175 = var173;
                                                var173 = "";
                                            } else {
                                                var175 = var173.substring(0, var174);
                                                var173 = var173.substring(var174 + 4);
                                            }
                                            var163.method5015(var175, var169 + 3, var172, 0, -1);
                                            var172 += var163.field3782 + 1;
                                        }
                                    }
                                    if (var10.field2864 == 9) {
                                        int var176;
                                        int var177;
                                        int var178;
                                        int var179;
                                        if (var10.field2821) {
                                            var176 = var13;
                                            var177 = var10.field2790 + var14;
                                            var178 = var10.field2770 + var13;
                                            var179 = var14;
                                        } else {
                                            var176 = var13;
                                            var177 = var14;
                                            var178 = var10.field2770 + var13;
                                            var179 = var10.field2790 + var14;
                                        }
                                        if (var10.field2788 == 1) {
                                            class306.method5183(var176, var177, var178, var179, var10.field2780);
                                        } else {
                                            method941(var176, var177, var178, var179, var10.field2780, var10.field2788);
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

    @ObfuscatedName("bv.ir(IIIIIII)V")
    public static final void method941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class306.field3877;
        int var18 = arg1 - class306.field3874;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class134.method2704(var19, var20, var21);
        class134.method2636(var23, var24, var25, var19, var20, var21, arg4);
        class134.method2704(var19, var21, var22);
        class134.method2636(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("kw.iz(Ljava/lang/String;Lhs;I)Ljava/lang/String;")
    public static String method5108(String arg0, class228 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method1564(method1480(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("bk.ij(IB)Ljava/lang/String;")
    public static final String method970(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class86.field1286 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class86.method1026(65408) + var1.substring(0, var1.length() - 8) + class237.field3113 + " " + class86.field1288 + var1 + class86.field1289 + class86.field1291;
        } else if (var1.length() > 6) {
            return " " + class86.method1026(16777215) + var1.substring(0, var1.length() - 4) + class237.field3221 + " " + class86.field1288 + var1 + class86.field1289 + class86.field1291;
        } else {
            return " " + class86.method1026(16776960) + var1 + class86.field1291;
        }
    }

    @ObfuscatedName("client.id(ZI)V")
    public final void method1100(boolean arg0) {
        method2915(field859, Statics.field663, Statics.field2191, arg0);
    }

    @ObfuscatedName("client.if(Lhs;I)V")
    public void method1443(class228 arg0) {
        class228 var2 = arg0.field2774 == -1 ? null : class228.method3956(arg0.field2774);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field663;
            var4 = Statics.field2191;
        } else {
            var3 = var2.field2770;
            var4 = var2.field2790;
        }
        method1481(arg0, var3, var4, false);
        method3953(arg0, var3, var4);
    }

    @ObfuscatedName("w.ia([Lhs;Lhs;ZI)V")
    public static void method15(class228[] arg0, class228 arg1, boolean arg2) {
        int var3 = arg1.field2800 == 0 ? arg1.field2770 : arg1.field2800;
        int var4 = arg1.field2785 == 0 ? arg1.field2790 : arg1.field2785;
        method966(arg0, arg1.field2755, var3, var4, arg2);
        if (arg1.field2879 != null) {
            method966(arg1.field2879, arg1.field2755, var3, var4, arg2);
        }
        class67 var5 = (class67) field1052.method3704((long) arg1.field2755);
        if (var5 != null) {
            method2915(var5.field771, var3, var4, arg2);
        }
        if (arg1.field2759 == 1337) {
        }
    }

    @ObfuscatedName("em.in(IIIZI)V")
    public static final void method2915(int arg0, int arg1, int arg2, boolean arg3) {
        if (class228.method3132(arg0)) {
            method966(Statics.field713[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bk.ip([Lhs;IIIZI)V")
    public static void method966(class228[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class228 var6 = arg0[var5];
            if (var6 != null && var6.field2774 == arg1) {
                method1481(var6, arg2, arg3, arg4);
                method3953(var6, arg2, arg3);
                if (var6.field2776 > var6.field2800 - var6.field2770) {
                    var6.field2776 = var6.field2800 - var6.field2770;
                }
                if (var6.field2776 < 0) {
                    var6.field2776 = 0;
                }
                if (var6.field2777 > var6.field2785 - var6.field2790) {
                    var6.field2777 = var6.field2785 - var6.field2790;
                }
                if (var6.field2777 < 0) {
                    var6.field2777 = 0;
                }
                if (var6.field2864 == 0) {
                    method15(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("bu.is(Lhs;IIZI)V")
    public static void method1481(class228 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2770;
        int var5 = arg0.field2790;
        if (arg0.field2749 == 0) {
            arg0.field2770 = arg0.field2766;
        } else if (arg0.field2749 == 1) {
            arg0.field2770 = arg1 - arg0.field2766;
        } else if (arg0.field2749 == 2) {
            arg0.field2770 = arg0.field2766 * arg1 >> 14;
        }
        if (arg0.field2763 == 0) {
            arg0.field2790 = arg0.field2767;
        } else if (arg0.field2763 == 1) {
            arg0.field2790 = arg2 - arg0.field2767;
        } else if (arg0.field2763 == 2) {
            arg0.field2790 = arg0.field2767 * arg2 >> 14;
        }
        if (arg0.field2749 == 4) {
            arg0.field2770 = arg0.field2790 * arg0.field2772 / arg0.field2773;
        }
        if (arg0.field2763 == 4) {
            arg0.field2790 = arg0.field2773 * arg0.field2770 / arg0.field2772;
        }
        if (field1099 && arg0.field2864 == 0) {
            if (arg0.field2790 < 5 && arg0.field2770 < 5) {
                arg0.field2790 = 5;
                arg0.field2770 = 5;
            } else {
                if (arg0.field2790 <= 0) {
                    arg0.field2790 = 5;
                }
                if (arg0.field2770 <= 0) {
                    arg0.field2770 = 5;
                }
            }
        }
        if (arg0.field2759 == 1337) {
            field1004 = arg0;
        }
        if (arg3 && arg0.field2813 != null && (arg0.field2770 != var4 || arg0.field2790 != var5)) {
            class68 var6 = new class68();
            var6.field774 = arg0;
            var6.field787 = arg0.field2813;
            field1024.method3747(var6);
        }
    }

    @ObfuscatedName("hh.iq(Lhs;III)V")
    public static void method3953(class228 arg0, int arg1, int arg2) {
        if (arg0.field2771 == 0) {
            arg0.field2768 = arg0.field2764;
        } else if (arg0.field2771 == 1) {
            arg0.field2768 = (arg1 - arg0.field2770) / 2 + arg0.field2764;
        } else if (arg0.field2771 == 2) {
            arg0.field2768 = arg1 - arg0.field2770 - arg0.field2764;
        } else if (arg0.field2771 == 3) {
            arg0.field2768 = arg0.field2764 * arg1 >> 14;
        } else if (arg0.field2771 == 4) {
            arg0.field2768 = (arg0.field2764 * arg1 >> 14) + (arg1 - arg0.field2770) / 2;
        } else {
            arg0.field2768 = arg1 - arg0.field2770 - (arg0.field2764 * arg1 >> 14);
        }
        if (arg0.field2761 == 0) {
            arg0.field2769 = arg0.field2765;
        } else if (arg0.field2761 == 1) {
            arg0.field2769 = (arg2 - arg0.field2790) / 2 + arg0.field2765;
        } else if (arg0.field2761 == 2) {
            arg0.field2769 = arg2 - arg0.field2790 - arg0.field2765;
        } else if (arg0.field2761 == 3) {
            arg0.field2769 = arg0.field2765 * arg2 >> 14;
        } else if (arg0.field2761 == 4) {
            arg0.field2769 = (arg0.field2765 * arg2 >> 14) + (arg2 - arg0.field2790) / 2;
        } else {
            arg0.field2769 = arg2 - arg0.field2790 - (arg0.field2765 * arg2 >> 14);
        }
        if (!field1099 || arg0.field2864 != 0) {
            return;
        }
        if (arg0.field2768 < 0) {
            arg0.field2768 = 0;
        } else if (arg0.field2770 + arg0.field2768 > arg1) {
            arg0.field2768 = arg1 - arg0.field2770;
        }
        if (arg0.field2769 < 0) {
            arg0.field2769 = 0;
        } else if (arg0.field2790 + arg0.field2769 > arg2) {
            arg0.field2769 = arg2 - arg0.field2790;
        }
    }

    @ObfuscatedName("hf.iv(IIIIII)V")
    public static final void method3849(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field468[0].method5271(arg0, arg1);
        Statics.field468[1].method5271(arg0, arg1 + arg3 - 16);
        class306.method5225(arg0, arg1 + 16, 16, arg3 - 32, field902);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class306.method5225(arg0, arg1 + 16 + var6, 16, var5, field906);
        class306.method5200(arg0, arg1 + 16 + var6, var5, field905);
        class306.method5200(arg0 + 1, arg1 + 16 + var6, var5, field905);
        class306.method5198(arg0, arg1 + 16 + var6, 16, field905);
        class306.method5198(arg0, arg1 + 17 + var6, 16, field905);
        class306.method5200(arg0 + 15, arg1 + 16 + var6, var5, field932);
        class306.method5200(arg0 + 14, arg1 + 17 + var6, var5 - 1, field932);
        class306.method5198(arg0, arg1 + 15 + var6 + var5, 16, field932);
        class306.method5198(arg0 + 1, arg1 + 14 + var6 + var5, 15, field932);
    }

    @ObfuscatedName("bg.il(II)Ljava/lang/String;")
    public static final String method1564(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ao.iw(Lhs;I)Z")
    public static final boolean method530(class228 arg0) {
        if (arg0.field2757 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2757.length; var1++) {
            int var2 = method1480(arg0, var1);
            int var3 = arg0.field2869[var1];
            if (arg0.field2757[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2757[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2757[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bu.iu(Lhs;II)I")
    public static final int method1480(class228 arg0, int arg1) {
        if (arg0.field2867 == null || arg1 >= arg0.field2867.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2867[arg1];
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
                    var7 = field959[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field960[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field961[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class228 var11 = class228.method3956(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class268.method965(var12).field3590 || field958)) {
                        for (int var13 = 0; var13 < var11.field2876.length; var13++) {
                            if (var12 + 1 == var11.field2876[var13]) {
                                var7 += var11.field2874[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class223.field2713[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class234.field2942[field960[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class223.field2713[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1754.field812;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class234.field2941[var14]) {
                            var7 += field960[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class228 var17 = class228.method3956(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class268.method965(var18).field3590 || field958)) {
                        for (int var19 = 0; var19 < var17.field2876.length; var19++) {
                            if (var18 + 1 == var17.field2876[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field919;
                }
                if (var6 == 12) {
                    var7 = field935;
                }
                if (var6 == 13) {
                    int var20 = class223.field2713[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class223.method51(var22);
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
                    var7 = (Statics.field1754.field1129 >> 7) + Statics.field3737;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1754.field1116 >> 7) + Statics.field435;
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

    @ObfuscatedName("fb.jf(Lhs;Ljc;IIZI)V")
    public static final void method3092(class228 arg0, class268 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3592;
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
            var7 = class237.field2994;
        }
        if (var6 != -1 && var7 != null) {
            method2220(var7, class86.method1026(16748608) + arg1.field3599, var6, arg1.field3575, arg2, arg0.field2755, arg4);
        }
    }

    @ObfuscatedName("ac.jp(Lhs;III)V")
    public static final void method652(class228 arg0, int arg1, int arg2) {
        if (arg0.field2861 == 1) {
            method4711(arg0.field2872, "", 24, 0, 0, arg0.field2755);
        }
        if (arg0.field2861 == 2 && !field980) {
            String var3 = method233(arg0);
            if (var3 != null) {
                method4711(var3, class86.method1026(65280) + arg0.field2871, 25, 0, -1, arg0.field2755);
            }
        }
        if (arg0.field2861 == 3) {
            method4711(class237.field3111, "", 26, 0, 0, arg0.field2755);
        }
        if (arg0.field2861 == 4) {
            method4711(arg0.field2872, "", 28, 0, 0, arg0.field2755);
        }
        if (arg0.field2861 == 5) {
            method4711(arg0.field2872, "", 29, 0, 0, arg0.field2755);
        }
        if (arg0.field2861 == 6 && field886 == null) {
            method4711(arg0.field2872, "", 30, 0, -1, arg0.field2755);
        }
        if (arg0.field2864 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2790; var5++) {
                for (int var6 = 0; var6 < arg0.field2770; var6++) {
                    int var7 = (arg0.field2866 + 32) * var6;
                    int var8 = (arg0.field2845 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2792[var4];
                        var8 += arg0.field2824[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field897 = var4;
                        Statics.field563 = arg0;
                        if (arg0.field2876[var4] > 0) {
                            class268 var9 = class268.method965(arg0.field2876[var4] - 1);
                            if (field978 == 1 && class229.method661(method53(arg0))) {
                                if (Statics.field3703 != arg0.field2755 || Statics.field313 != var4) {
                                    method4711(class237.field3102, field904 + " " + class86.field1290 + " " + class86.method1026(16748608) + var9.field3599, 31, var9.field3575, var4, arg0.field2755);
                                }
                            } else if (!field980 || !class229.method661(method53(arg0))) {
                                String[] var10 = var9.field3592;
                                if (field914) {
                                    String[] var11 = method1741(var10);
                                }
                                int var12 = -1;
                                if (field973 && class51.field618[81]) {
                                    var12 = var9.method4652();
                                }
                                if (class229.method661(method53(arg0))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var12 != var13) {
                                            method3092(arg0, var9, var4, var13, false);
                                        }
                                    }
                                }
                                int var14 = method53(arg0);
                                boolean var15 = (var14 >> 31 & 0x1) != 0;
                                if (var15) {
                                    method4711(class237.field3102, class86.method1026(16748608) + var9.field3599, 38, var9.field3575, var4, arg0.field2755);
                                }
                                class229 var10000 = (class229) null;
                                if (class229.method661(method53(arg0))) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var12 != var16) {
                                            method3092(arg0, var9, var4, var16, false);
                                        }
                                    }
                                    if (var12 >= 0) {
                                        method3092(arg0, var9, var4, var12, true);
                                    }
                                }
                                String[] var17 = arg0.field2878;
                                if (field914) {
                                    var17 = method1741(var17);
                                }
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 39;
                                            }
                                            if (var18 == 1) {
                                                var19 = 40;
                                            }
                                            if (var18 == 2) {
                                                var19 = 41;
                                            }
                                            if (var18 == 3) {
                                                var19 = 42;
                                            }
                                            if (var18 == 4) {
                                                var19 = 43;
                                            }
                                            method4711(var17[var18], class86.method1026(16748608) + var9.field3599, var19, var9.field3575, var4, arg0.field2755);
                                        }
                                    }
                                }
                                method4711(class237.field3103, class86.method1026(16748608) + var9.field3599, 1005, var9.field3575, var4, arg0.field2755);
                            } else if ((Statics.field2039 & 0x10) == 16) {
                                method4711(field855, field996 + " " + class86.field1290 + " " + class86.method1026(16748608) + var9.field3599, 32, var9.field3575, var4, arg0.field2755);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2754) {
            return;
        }
        if (!field980) {
            for (int var20 = 9; var20 >= 5; var20--) {
                String var21 = method236(arg0, var20);
                if (var21 != null) {
                    method4711(var21, arg0.field2888, 1007, var20 + 1, arg0.field2756, arg0.field2755);
                }
            }
            String var22 = method233(arg0);
            if (var22 != null) {
                method4711(var22, arg0.field2888, 25, 0, arg0.field2756, arg0.field2755);
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24 = method236(arg0, var23);
                if (var24 != null) {
                    method4711(var24, arg0.field2888, 57, var23 + 1, arg0.field2756, arg0.field2755);
                }
            }
            int var25 = method53(arg0);
            boolean var26 = (var25 & 0x1) != 0;
            if (var26) {
                method4711(class237.field3001, "", 30, 0, arg0.field2756, arg0.field2755);
            }
        } else if (class229.method642(method53(arg0)) && (Statics.field2039 & 0x20) == 32) {
            method4711(field855, field996 + " " + class86.field1290 + " " + arg0.field2888, 58, 0, arg0.field2756, arg0.field2755);
        }
    }

    @ObfuscatedName("e.jl([Lhs;IIIIIIII)V")
    public static final void method169(class228[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class228 var9 = arg0[var8];
            if (var9 != null && (!var9.field2754 || var9.field2864 == 0 || var9.field2835 || method53(var9) != 0 || field931 == var9 || var9.field2759 == 1338) && var9.field2774 == arg1 && (!var9.field2754 || !method1751(var9))) {
                int var10 = var9.field2768 + arg6;
                int var11 = var9.field2769 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2864 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2864 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2770 + var10;
                    int var19 = var9.field2790 + var11;
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
                    int var22 = var9.field2770 + var10;
                    int var23 = var9.field2790 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field941 == var9) {
                    field981 = true;
                    field920 = var10;
                    field1008 = var11;
                }
                if (!var9.field2754 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field691;
                    int var25 = class60.field692;
                    if (class60.field697 != 0) {
                        var24 = class60.field698;
                        var25 = class60.field701;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2759 == 1337) {
                        if (!field849 && !field1072 && var26) {
                            method607(var24, var25, var12, var13);
                        }
                    } else if (var9.field2759 != 1338) {
                        if (var9.field2759 == 1400) {
                            Statics.field2449.method5540(class60.field691, class60.field692, var26, var10, var11, var9.field2770, var9.field2790);
                        }
                        if (!field1072 && var26) {
                            if (var9.field2759 == 1400) {
                                Statics.field2449.method5478(var10, var11, var9.field2770, var9.field2790, var24, var25);
                            } else {
                                method652(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2864 == 0) {
                            if (!var9.field2754 && method1751(var9) && Statics.field625 != var9) {
                                continue;
                            }
                            method169(arg0, var9.field2755, var12, var13, var14, var15, var10 - var9.field2776, var11 - var9.field2777);
                            if (var9.field2879 != null) {
                                method169(var9.field2879, var9.field2755, var12, var13, var14, var15, var10 - var9.field2776, var11 - var9.field2777);
                            }
                            class67 var40 = (class67) field1052.method3704((long) var9.field2755);
                            if (var40 != null) {
                                if (var40.field768 == 0 && class60.field691 >= var12 && class60.field692 >= var13 && class60.field691 < var14 && class60.field692 < var15 && !field1072 && !field1099) {
                                    for (class68 var41 = (class68) field1024.method3752(); var41 != null; var41 = (class68) field1024.method3762()) {
                                        if (var41.field777) {
                                            var41.method3740();
                                            var41.field774.field2855 = false;
                                        }
                                    }
                                    if (Statics.field309 == 0) {
                                        field941 = null;
                                        field931 = null;
                                    }
                                    if (!field1072) {
                                        field885 = 0;
                                        field1072 = false;
                                        field1005[0] = class237.field3062;
                                        field970[0] = "";
                                        field901[0] = 1006;
                                        field971[0] = false;
                                        field885 = 1;
                                    }
                                }
                                int var42 = var40.field771;
                                if (class228.method3132(var42)) {
                                    method169(Statics.field713[var42], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2754) {
                            if (var9.field2828) {
                                if (class60.field691 >= var12 && class60.field692 >= var13 && class60.field691 < var14 && class60.field692 < var15) {
                                    for (class68 var43 = (class68) field1024.method3752(); var43 != null; var43 = (class68) field1024.method3762()) {
                                        if (var43.field777) {
                                            var43.method3740();
                                            var43.field774.field2855 = false;
                                        }
                                    }
                                    if (Statics.field309 == 0) {
                                        field941 = null;
                                        field931 = null;
                                    }
                                    if (!field1072) {
                                        field885 = 0;
                                        field1072 = false;
                                        field1005[0] = class237.field3062;
                                        field970[0] = "";
                                        field901[0] = 1006;
                                        field971[0] = false;
                                        field885 = 1;
                                    }
                                }
                            } else if (var9.field2889 && class60.field691 >= var12 && class60.field692 >= var13 && class60.field691 < var14 && class60.field692 < var15) {
                                for (class68 var44 = (class68) field1024.method3752(); var44 != null; var44 = (class68) field1024.method3762()) {
                                    if (var44.field777 && var44.field774.field2856 == var44.field787) {
                                        var44.method3740();
                                    }
                                }
                            }
                            boolean var45;
                            if (class60.field691 >= var12 && class60.field692 >= var13 && class60.field691 < var14 && class60.field692 < var15) {
                                var45 = true;
                            } else {
                                var45 = false;
                            }
                            boolean var46 = false;
                            if ((class60.field690 == 1 || !Statics.field407 && class60.field690 == 4) && var45) {
                                var46 = true;
                            }
                            boolean var47 = false;
                            if ((class60.field697 == 1 || !Statics.field407 && class60.field697 == 4) && class60.field698 >= var12 && class60.field701 >= var13 && class60.field698 < var14 && class60.field701 < var15) {
                                var47 = true;
                            }
                            if (var47) {
                                method2961(var9, class60.field698 - var10, class60.field701 - var11);
                            }
                            if (var9.field2759 == 1400) {
                                Statics.field2449.method5432(class60.field691, class60.field692, var45 & var46, var45 & var47);
                            }
                            if (field941 != null && field941 != var9 && var45) {
                                int var48 = method53(var9);
                                boolean var49 = (var48 >> 20 & 0x1) != 0;
                                if (var49) {
                                    field1002 = var9;
                                }
                            }
                            if (field931 == var9) {
                                field1003 = true;
                                field857 = var10;
                                field1071 = var11;
                            }
                            if (var9.field2835) {
                                if (var45 && field1023 != 0 && var9.field2856 != null) {
                                    class68 var50 = new class68();
                                    var50.field777 = true;
                                    var50.field774 = var9;
                                    var50.field776 = field1023;
                                    var50.field787 = var9.field2856;
                                    field1024.method3747(var50);
                                }
                                if (field941 != null || Statics.field3516 != null || field1072) {
                                    var47 = false;
                                    var46 = false;
                                    var45 = false;
                                }
                                if (!var9.field2881 && var47) {
                                    var9.field2881 = true;
                                    if (var9.field2837 != null) {
                                        class68 var51 = new class68();
                                        var51.field777 = true;
                                        var51.field774 = var9;
                                        var51.field775 = class60.field698 - var10;
                                        var51.field776 = class60.field701 - var11;
                                        var51.field787 = var9.field2837;
                                        field1024.method3747(var51);
                                    }
                                }
                                if (var9.field2881 && var46 && var9.field2838 != null) {
                                    class68 var52 = new class68();
                                    var52.field777 = true;
                                    var52.field774 = var9;
                                    var52.field775 = class60.field691 - var10;
                                    var52.field776 = class60.field692 - var11;
                                    var52.field787 = var9.field2838;
                                    field1024.method3747(var52);
                                }
                                if (var9.field2881 && !var46) {
                                    var9.field2881 = false;
                                    if (var9.field2826 != null) {
                                        class68 var53 = new class68();
                                        var53.field777 = true;
                                        var53.field774 = var9;
                                        var53.field775 = class60.field691 - var10;
                                        var53.field776 = class60.field692 - var11;
                                        var53.field787 = var9.field2826;
                                        field1026.method3747(var53);
                                    }
                                }
                                if (var46 && var9.field2840 != null) {
                                    class68 var54 = new class68();
                                    var54.field777 = true;
                                    var54.field774 = var9;
                                    var54.field775 = class60.field691 - var10;
                                    var54.field776 = class60.field692 - var11;
                                    var54.field787 = var9.field2840;
                                    field1024.method3747(var54);
                                }
                                if (!var9.field2855 && var45) {
                                    var9.field2855 = true;
                                    if (var9.field2841 != null) {
                                        class68 var55 = new class68();
                                        var55.field777 = true;
                                        var55.field774 = var9;
                                        var55.field775 = class60.field691 - var10;
                                        var55.field776 = class60.field692 - var11;
                                        var55.field787 = var9.field2841;
                                        field1024.method3747(var55);
                                    }
                                }
                                if (var9.field2855 && var45 && var9.field2842 != null) {
                                    class68 var56 = new class68();
                                    var56.field777 = true;
                                    var56.field774 = var9;
                                    var56.field775 = class60.field691 - var10;
                                    var56.field776 = class60.field692 - var11;
                                    var56.field787 = var9.field2842;
                                    field1024.method3747(var56);
                                }
                                if (var9.field2855 && !var45) {
                                    var9.field2855 = false;
                                    if (var9.field2843 != null) {
                                        class68 var57 = new class68();
                                        var57.field777 = true;
                                        var57.field774 = var9;
                                        var57.field775 = class60.field691 - var10;
                                        var57.field776 = class60.field692 - var11;
                                        var57.field787 = var9.field2843;
                                        field1026.method3747(var57);
                                    }
                                }
                                if (var9.field2848 != null) {
                                    class68 var58 = new class68();
                                    var58.field774 = var9;
                                    var58.field787 = var9.field2848;
                                    field1025.method3747(var58);
                                }
                                if (var9.field2816 != null && field1012 > var9.field2883) {
                                    if (var9.field2849 == null || field1012 - var9.field2883 > 32) {
                                        class68 var63 = new class68();
                                        var63.field774 = var9;
                                        var63.field787 = var9.field2816;
                                        field1024.method3747(var63);
                                    } else {
                                        label592: for (int var59 = var9.field2883; var59 < field1012; var59++) {
                                            int var60 = field1011[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field2849.length; var61++) {
                                                if (var9.field2849[var61] == var60) {
                                                    class68 var62 = new class68();
                                                    var62.field774 = var9;
                                                    var62.field787 = var9.field2816;
                                                    field1024.method3747(var62);
                                                    break label592;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2883 = field1012;
                                }
                                if (var9.field2850 != null && field1091 > var9.field2822) {
                                    if (var9.field2851 == null || field1091 - var9.field2822 > 32) {
                                        class68 var68 = new class68();
                                        var68.field774 = var9;
                                        var68.field787 = var9.field2850;
                                        field1024.method3747(var68);
                                    } else {
                                        label568: for (int var64 = var9.field2822; var64 < field1091; var64++) {
                                            int var65 = field1013[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var9.field2851.length; var66++) {
                                                if (var9.field2851[var66] == var65) {
                                                    class68 var67 = new class68();
                                                    var67.field774 = var9;
                                                    var67.field787 = var9.field2850;
                                                    field1024.method3747(var67);
                                                    break label568;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2822 = field1091;
                                }
                                if (var9.field2852 != null && field997 > var9.field2885) {
                                    if (var9.field2741 == null || field997 - var9.field2885 > 32) {
                                        class68 var73 = new class68();
                                        var73.field774 = var9;
                                        var73.field787 = var9.field2852;
                                        field1024.method3747(var73);
                                    } else {
                                        label544: for (int var69 = var9.field2885; var69 < field997; var69++) {
                                            int var70 = field1015[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var9.field2741.length; var71++) {
                                                if (var9.field2741[var71] == var70) {
                                                    class68 var72 = new class68();
                                                    var72.field774 = var9;
                                                    var72.field787 = var9.field2852;
                                                    field1024.method3747(var72);
                                                    break label544;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2885 = field997;
                                }
                                if (field1017 > var9.field2882 && var9.field2857 != null) {
                                    class68 var74 = new class68();
                                    var74.field774 = var9;
                                    var74.field787 = var9.field2857;
                                    field1024.method3747(var74);
                                }
                                if (field1018 > var9.field2882 && var9.field2859 != null) {
                                    class68 var75 = new class68();
                                    var75.field774 = var9;
                                    var75.field787 = var9.field2859;
                                    field1024.method3747(var75);
                                }
                                if (field1031 > var9.field2882 && var9.field2860 != null) {
                                    class68 var76 = new class68();
                                    var76.field774 = var9;
                                    var76.field787 = var9.field2860;
                                    field1024.method3747(var76);
                                }
                                if (field1020 > var9.field2882 && var9.field2760 != null) {
                                    class68 var77 = new class68();
                                    var77.field774 = var9;
                                    var77.field787 = var9.field2760;
                                    field1024.method3747(var77);
                                }
                                if (field1021 > var9.field2882 && var9.field2834 != null) {
                                    class68 var78 = new class68();
                                    var78.field774 = var9;
                                    var78.field787 = var9.field2834;
                                    field1024.method3747(var78);
                                }
                                if (field1022 > var9.field2882 && var9.field2884 != null) {
                                    class68 var79 = new class68();
                                    var79.field774 = var9;
                                    var79.field787 = var9.field2884;
                                    field1024.method3747(var79);
                                }
                                var9.field2882 = field1010;
                                if (var9.field2858 != null) {
                                    for (int var80 = 0; var80 < field1046; var80++) {
                                        class68 var81 = new class68();
                                        var81.field774 = var9;
                                        var81.field785 = field967[var80];
                                        var81.field780 = field1047[var80];
                                        var81.field787 = var9.field2858;
                                        field1024.method3747(var81);
                                    }
                                }
                            }
                        }
                        if (!var9.field2754 && field941 == null && Statics.field3516 == null && !field1072) {
                            if ((var9.field2870 >= 0 || var9.field2868 != 0) && class60.field691 >= var12 && class60.field692 >= var13 && class60.field691 < var14 && class60.field692 < var15) {
                                if (var9.field2870 >= 0) {
                                    Statics.field625 = arg0[var9.field2870];
                                } else {
                                    Statics.field625 = var9;
                                }
                            }
                            if (var9.field2864 == 8 && class60.field691 >= var12 && class60.field692 >= var13 && class60.field691 < var14 && class60.field692 < var15) {
                                Statics.field1217 = var9;
                            }
                            if (var9.field2785 > var9.field2790) {
                                int var82 = var9.field2770 + var10;
                                int var83 = var9.field2790;
                                int var84 = var9.field2785;
                                int var85 = class60.field691;
                                int var86 = class60.field692;
                                if (field928) {
                                    field1094 = 32;
                                } else {
                                    field1094 = 0;
                                }
                                field928 = false;
                                if (class60.field690 == 1 || !Statics.field407 && class60.field690 == 4) {
                                    if (var85 >= var82 && var85 < var82 + 16 && var86 >= var11 && var86 < var11 + 16) {
                                        var9.field2777 -= 4;
                                        method313(var9);
                                    } else if (var85 >= var82 && var85 < var82 + 16 && var86 >= var11 + var83 - 16 && var86 < var11 + var83) {
                                        var9.field2777 += 4;
                                        method313(var9);
                                    } else if (var85 >= var82 - field1094 && var85 < field1094 + var82 + 16 && var86 >= var11 + 16 && var86 < var11 + var83 - 16) {
                                        int var87 = (var83 - 32) * var83 / var84;
                                        if (var87 < 8) {
                                            var87 = 8;
                                        }
                                        int var88 = var86 - var11 - 16 - var87 / 2;
                                        int var89 = var83 - 32 - var87;
                                        var9.field2777 = (var84 - var83) * var88 / var89;
                                        method313(var9);
                                        field928 = true;
                                    }
                                }
                                if (field1023 != 0) {
                                    int var90 = var9.field2770;
                                    if (var85 >= var82 - var90 && var86 >= var11 && var85 < var82 + 16 && var86 <= var11 + var83) {
                                        var9.field2777 += field1023 * 45;
                                        method313(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field979 == 0 || field979 == 3) && (class60.field697 == 1 || !Statics.field407 && class60.field697 == 4)) {
                        class222 var27 = var9.method4112(true);
                        if (var27 != null) {
                            int var28 = class60.field698 - var10;
                            int var29 = class60.field701 - var11;
                            if (var27.method4038(var28, var29)) {
                                int var30 = var28 - var27.field2709 / 2;
                                int var31 = var29 - var27.field2704 / 2;
                                int var32 = field909 & 0x7FF;
                                int var33 = class134.field1918[var32];
                                int var34 = class134.field1903[var32];
                                int var35 = var30 * var34 + var31 * var33 >> 11;
                                int var36 = var31 * var34 - var30 * var33 >> 11;
                                int var37 = Statics.field1754.field1129 + var35 >> 7;
                                int var38 = Statics.field1754.field1116 - var36 >> 7;
                                class175 var39 = class175.method1891(class172.field2324, field938.field1455);
                                var39.field2440.method3223(18);
                                var39.field2440.method3257(Statics.field435 + var38);
                                var39.field2440.method3403(Statics.field3737 + var37);
                                var39.field2440.method3266(class51.field618[82] ? (class51.field618[81] ? 2 : 1) : 0);
                                var39.field2440.method3223(var30);
                                var39.field2440.method3223(var31);
                                var39.field2440.method3403(field909);
                                var39.field2440.method3223(57);
                                var39.field2440.method3223(0);
                                var39.field2440.method3223(0);
                                var39.field2440.method3223(89);
                                var39.field2440.method3403(Statics.field1754.field1129);
                                var39.field2440.method3403(Statics.field1754.field1116);
                                var39.field2440.method3223(63);
                                field938.method1907(var39);
                                field984 = var37;
                                field1056 = var38;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("an.jk([Lhs;IB)V")
    public static final void method241(class228[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class228 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2864 == 0) {
                    if (var3.field2879 != null) {
                        method241(var3.field2879, arg1);
                    }
                    class67 var4 = (class67) field1052.method3704((long) var3.field2755);
                    if (var4 != null) {
                        int var5 = var4.field771;
                        if (class228.method3132(var5)) {
                            method241(Statics.field713[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2862 != null) {
                    class68 var6 = new class68();
                    var6.field774 = var3;
                    var6.field787 = var3.field2862;
                    class81.method1742(var6);
                }
                if (arg1 == 1 && var3.field2801 != null) {
                    if (var3.field2756 >= 0) {
                        class228 var7 = class228.method3956(var3.field2755);
                        if (var7 == null || var7.field2879 == null || var3.field2756 >= var7.field2879.length || var7.field2879[var3.field2756] != var3) {
                            continue;
                        }
                    }
                    class68 var8 = new class68();
                    var8.field774 = var3;
                    var8.field787 = var3.field2801;
                    class81.method1742(var8);
                }
            }
        }
    }

    @ObfuscatedName("ep.jg(Lhs;III)V")
    public static final void method2961(class228 arg0, int arg1, int arg2) {
        if (field941 != null || field1072 || arg0 == null || method3126(arg0) == null) {
            return;
        }
        field941 = arg0;
        field931 = method3126(arg0);
        field1000 = arg1;
        field922 = arg2;
        Statics.field309 = 0;
        field1009 = false;
        int var3 = field885 - 1;
        if (var3 != -1) {
            method964(var3);
        }
    }

    @ObfuscatedName("client.jt(I)V")
    public final void method1102() {
        method313(field941);
        Statics.field309++;
        if (field981 && field1003) {
            int var1 = class60.field691;
            int var2 = class60.field692;
            int var3 = var1 - field1000;
            int var4 = var2 - field922;
            if (var3 < field857) {
                var3 = field857;
            }
            if (field941.field2770 + var3 > field857 + field931.field2770) {
                var3 = field857 + field931.field2770 - field941.field2770;
            }
            if (var4 < field1071) {
                var4 = field1071;
            }
            if (field941.field2790 + var4 > field1071 + field931.field2790) {
                var4 = field1071 + field931.field2790 - field941.field2790;
            }
            int var5 = var3 - field920;
            int var6 = var4 - field1008;
            int var7 = field941.field2831;
            if (Statics.field309 > field941.field2823 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field1009 = true;
            }
            int var8 = field931.field2776 + (var3 - field857);
            int var9 = field931.field2777 + (var4 - field1071);
            if (field941.field2844 != null && field1009) {
                class68 var10 = new class68();
                var10.field774 = field941;
                var10.field775 = var8;
                var10.field776 = var9;
                var10.field787 = field941.field2844;
                class81.method1742(var10);
            }
            if (class60.field690 == 0) {
                if (field1009) {
                    if (field941.field2854 != null) {
                        class68 var11 = new class68();
                        var11.field774 = field941;
                        var11.field775 = var8;
                        var11.field776 = var9;
                        var11.field778 = field1002;
                        var11.field787 = field941.field2854;
                        class81.method1742(var11);
                    }
                    if (field1002 != null && method3040(field941) != null) {
                        class175 var12 = class175.method1891(class172.field2349, field938.field1455);
                        var12.field2440.method3285(field1002.field2755);
                        var12.field2440.method3257(field941.field2756);
                        var12.field2440.method3247(field1002.field2875);
                        var12.field2440.method3403(field1002.field2756);
                        var12.field2440.method3285(field941.field2755);
                        var12.field2440.method3403(field941.field2875);
                        field938.method1907(var12);
                    }
                } else if (this.method1098()) {
                    this.method1192(field920 + field1000, field922 + field1008);
                } else if (field885 > 0) {
                    method1771(field920 + field1000, field922 + field1008);
                }
                field941 = null;
            }
        } else if (Statics.field309 > 1) {
            field941 = null;
        }
    }

    @ObfuscatedName("ba.ju(II)V")
    public static void method964(int arg0) {
        Statics.field482 = new class87();
        Statics.field482.field1298 = field965[arg0];
        Statics.field482.field1296 = field966[arg0];
        Statics.field482.field1297 = field901[arg0];
        Statics.field482.field1295 = field968[arg0];
        Statics.field482.field1300 = field1005[arg0];
    }

    @ObfuscatedName("cg.jc(III)V")
    public static void method1771(int arg0, int arg1) {
        method4101(Statics.field482, arg0, arg1);
        Statics.field482 = null;
    }

    @ObfuscatedName("ax.jo(Lhs;I)V")
    public static void method313(class228 arg0) {
        if (field1029 == arg0.field2887) {
            field1030[arg0.field2742] = true;
        }
    }

    @ObfuscatedName("y.jv(B)V")
    public static void method153() {
        for (class67 var0 = (class67) field1052.method3693(); var0 != null; var0 = (class67) field1052.method3694()) {
            int var1 = var0.field771;
            if (class228.method3132(var1)) {
                boolean var2 = true;
                class228[] var3 = Statics.field713[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2754;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2585;
                    class228 var6 = class228.method3956(var5);
                    if (var6 != null) {
                        method313(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fd.jm(Lhs;I)Lhs;")
    public static class228 method3126(class228 arg0) {
        class228 var1 = method3040(arg0);
        if (var1 == null) {
            var1 = arg0.field2830;
        }
        return var1;
    }

    @ObfuscatedName("cv.je([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1741(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("r.jn(II)V")
    public static final void method86(int arg0) {
        if (!class228.method3132(arg0)) {
            return;
        }
        class228[] var1 = Statics.field713[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class228 var3 = var1[var2];
            if (var3 != null) {
                var3.field2877 = 0;
                var3.field2890 = 0;
            }
        }
    }

    @ObfuscatedName("g.jr(II)V")
    public static final void method2(int arg0) {
        method153();
        class80.method3480();
        int var1 = class253.method3037(arg0).field3370;
        if (var1 == 0) {
            return;
        }
        int var2 = class223.field2713[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class134.method2688(0.9D);
                ((class123) Statics.field1915).method2413(0.9D);
            }
            if (var2 == 2) {
                class134.method2688(0.8D);
                ((class123) Statics.field1915).method2413(0.8D);
            }
            if (var2 == 3) {
                class134.method2688(0.7D);
                ((class123) Statics.field1915).method2413(0.7D);
            }
            if (var2 == 4) {
                class134.method2688(0.6D);
                ((class123) Statics.field1915).method2413(0.6D);
            }
            class268.field3612.method3674();
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
            if (field1058 != var3) {
                if (field1058 == 0 && field903 != -1) {
                    class215.method8(Statics.field2914, field903, 0, var3, false);
                    field1060 = false;
                } else if (var3 == 0) {
                    Statics.field357.method3859();
                    class215.field2618 = 1;
                    Statics.field2615 = null;
                    field1060 = false;
                } else {
                    class215.method2177(var3);
                }
                field1058 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field1059 = 127;
            }
            if (var2 == 1) {
                field1059 = 96;
            }
            if (var2 == 2) {
                field1059 = 64;
            }
            if (var2 == 3) {
                field1059 = 32;
            }
            if (var2 == 4) {
                field1059 = 0;
            }
        }
        if (var1 == 5) {
            field856 = var2;
        }
        if (var1 == 6) {
            field987 = var2;
        }
        if (var1 == 9) {
            field1066 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field879 = 127;
            }
            if (var2 == 1) {
                field879 = 96;
            }
            if (var2 == 2) {
                field879 = 64;
            }
            if (var2 == 3) {
                field879 = 32;
            }
            if (var2 == 4) {
                field879 = 0;
            }
        }
        if (var1 == 17) {
            field993 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field866 = (class89) class180.method1823(class89.method3489(), var2);
            if (field866 == null) {
                field866 = class89.field1314;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field954 = -1;
            } else {
                field954 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field867 = (class89) class180.method1823(class89.method3489(), var2);
            if (field867 == null) {
                field867 = class89.field1314;
            }
        }
    }

    @ObfuscatedName("da.jj(IIII)Lbl;")
    public static final class67 method2171(int arg0, int arg1, int arg2) {
        class67 var3 = new class67();
        var3.field771 = arg1;
        var3.field768 = arg2;
        field1052.method3691(var3, (long) arg0);
        method86(arg1);
        class228 var4 = class228.method3956(arg0);
        method313(var4);
        if (field886 != null) {
            method313(field886);
            field886 = null;
        }
        method1709();
        method15(Statics.field713[arg0 >> 16], var4, false);
        class81.method2708(arg1);
        if (field859 != -1) {
            int var5 = field859;
            if (class228.method3132(var5)) {
                method241(Statics.field713[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("eq.jb(Lbl;ZB)V")
    public static final void method2911(class67 arg0, boolean arg1) {
        int var2 = arg0.field771;
        int var3 = (int) arg0.field2585;
        arg0.method3740();
        if (arg1 && var2 != -1 && Statics.field305[var2]) {
            Statics.field710.method4198(var2);
            if (Statics.field713[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field713[var2].length; var5++) {
                    if (Statics.field713[var2][var5] != null) {
                        if (Statics.field713[var2][var5].field2864 == 2) {
                            var4 = false;
                        } else {
                            Statics.field713[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field713[var2] = null;
                }
                Statics.field305[var2] = false;
            }
        }
        method1545(var2);
        class228 var6 = class228.method3956(var3);
        if (var6 != null) {
            method313(var6);
        }
        method1709();
        if (field859 != -1) {
            int var7 = field859;
            if (class228.method3132(var7)) {
                method241(Statics.field713[var7], 1);
            }
        }
    }

    @ObfuscatedName("n.jz(Lhs;I)Z")
    public static final boolean method155(class228 arg0) {
        int var1 = arg0.field2759;
        if (var1 == 205) {
            field944 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1088.method4091(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1088.method4071(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1088.method4072(false);
        }
        if (var1 == 325) {
            field1088.method4072(true);
        }
        if (var1 == 326) {
            class175 var6 = class175.method1891(class172.field2415, field938.field1455);
            field1088.method4070(var6.field2440);
            field938.method1907(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dm.jy(Lhs;IIII)V")
    public static final void method2426(class228 arg0, int arg1, int arg2, int arg3) {
        class222 var4 = arg0.method4112(false);
        if (var4 == null) {
            return;
        }
        if (field979 < 3) {
            Statics.field681.method5313(arg1, arg2, var4.field2709, var4.field2704, 25, 25, field909, 256, var4.field2705, var4.field2703);
        } else {
            class306.method5223(arg1, arg2, 0, var4.field2705, var4.field2703);
        }
    }

    @ObfuscatedName("bx.jd(IIIILki;Lhg;I)V")
    public static final void method1019(int arg0, int arg1, int arg2, int arg3, class310 arg4, class222 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method468(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field909 & 0x7FF;
        int var8 = class134.field1918[var7];
        int var9 = class134.field1903[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2709 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field386.method5296(arg5.field2709 / 2 + arg0 - var17 / 2 + var15, arg5.field2704 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("am.ja(IIIILki;Lhg;I)V")
    public static final void method468(int arg0, int arg1, int arg2, int arg3, class310 arg4, class222 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field909 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class134.field1918[var6];
        int var9 = class134.field1903[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method5319(arg5.field2709 / 2 + var10 - arg4.field3898 / 2, arg5.field2704 / 2 - var11 - arg4.field3903 / 2, arg0, arg1, arg5.field2709, arg5.field2704, arg5.field2705, arg5.field2703);
        } else {
            arg4.method5302(arg5.field2709 / 2 + arg0 + var10 - arg4.field3898 / 2, arg5.field2704 / 2 + arg1 - var11 - arg4.field3903 / 2);
        }
    }

    @ObfuscatedName("fs.ji(I)V")
    public static final void method3202() {
        for (int var0 = 0; var0 < class93.field1388; var0++) {
            class72 var1 = field945[class93.field1394[var0]];
            var1.method1062();
        }
    }

    @ObfuscatedName("kt.jw(I)V")
    public static final void method5084() {
        field1018 = field1010;
    }

    @ObfuscatedName("fb.jh(I)V")
    public static final void method3114() {
        field1031 = field1010;
        Statics.field283 = true;
    }

    @ObfuscatedName("ga.jx(Ljava/lang/String;I)V")
    public static final void method3589(String arg0) {
        if (!arg0.equals("")) {
            class175 var1 = class175.method1891(class172.field2335, field938.field1455);
            var1.field2440.method3223(class185.method2709(arg0));
            var1.field2440.method3230(arg0);
            field938.method1907(var1);
        }
    }

    @ObfuscatedName("bs.js(II)V")
    public static void method1545(int arg0) {
        for (class210 var1 = (class210) field1027.method3693(); var1 != null; var1 = (class210) field1027.method3694()) {
            if ((var1.field2585 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3740();
            }
        }
    }

    @ObfuscatedName("l.kp(Lhs;B)I")
    public static int method53(class228 arg0) {
        class210 var1 = (class210) field1027.method3704(((long) arg0.field2755 << 32) + (long) arg0.field2756);
        return var1 == null ? arg0.field2743 : var1.field2599;
    }

    @ObfuscatedName("fz.ky(Lhs;I)Lhs;")
    public static class228 method3040(class228 arg0) {
        int var1 = method53(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class228.method3956(arg0.field2774);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("cj.ke(Lhs;I)Z")
    public static boolean method1751(class228 arg0) {
        if (field1099) {
            if (method53(arg0) != 0) {
                return false;
            }
            if (arg0.field2864 == 0) {
                return false;
            }
        }
        return arg0.field2775;
    }

    @ObfuscatedName("ar.kt(Lhs;IS)Ljava/lang/String;")
    public static String method236(class228 arg0, int arg1) {
        int var2 = method53(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2847 == null) {
            return null;
        } else if (arg0.field2829 == null || arg0.field2829.length <= arg1 || arg0.field2829[arg1] == null || arg0.field2829[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2829[arg1];
        }
    }

    @ObfuscatedName("aq.ko(Lhs;B)Ljava/lang/String;")
    public static String method233(class228 arg0) {
        int var1 = method53(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2880 == null || arg0.field2880.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2880;
        }
    }

    @ObfuscatedName("fd.kn(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method3127(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field1016 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field1016 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field1016 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field1016 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field1016 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field2192 != null) {
            var3 = "/p=" + Statics.field2192;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field846 + "/a=" + Statics.field3503 + var3 + "/";
    }

    @ObfuscatedName("hf.kg(Ljava/lang/String;ZI)V")
    public static void method3843(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2950; var5++) {
            class268 var6 = class268.method965(var5);
            if ((!arg1 || var6.field3617) && var6.field3609 == -1 && var6.field3599.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field837 = -1;
                    Statics.field383 = null;
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
        Statics.field383 = var3;
        Statics.field2153 = 0;
        Statics.field837 = var4;
        String[] var9 = new String[Statics.field837];
        for (int var10 = 0; var10 < Statics.field837; var10++) {
            var9[var10] = class268.method965(var3[var10]).field3599;
        }
        class182.method2981(var9, Statics.field383);
    }

    @ObfuscatedName("al.kf([BII)V")
    public static void method206(byte[] arg0, int arg1) {
        if (field1007 == null) {
            field1007 = new byte[24];
        }
        class195.method3624(arg0, arg1, field1007, 0, 24);
    }

    @ObfuscatedName("da.kv(Lgy;II)V")
    public static void method2172(class185 arg0, int arg1) {
        method206(arg0.field2512, arg1);
        if (class158.field2143 == null) {
            return;
        }
        try {
            class158.field2143.method1935(0L);
            class158.field2143.method1940(arg0.field2512, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("client.kc(I)Lja;")
    public class281 method1400() {
        return Statics.field1754 == null ? null : Statics.field1754.field819;
    }

    @ObfuscatedName("k.ks(I)Z")
    public static boolean method43() {
        return field1084 >= 2;
    }

    @ObfuscatedName("cp.km(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method1758(String arg0) {
        class242[] var1 = class242.method2613();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class242 var3 = var1[var2];
            if (var3.field3271 != -1) {
                int var5 = var3.field3271;
                String var6 = "<img=" + var5 + ">";
                if (arg0.startsWith(var6)) {
                    arg0 = arg0.substring(6 + Integer.toString(var3.field3271).length());
                    break;
                }
            }
        }
        return arg0;
    }
}
