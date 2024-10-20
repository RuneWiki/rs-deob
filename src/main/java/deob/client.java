package deob;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class59 implements class289 {

    @ObfuscatedName("client.w")
    public static class176[] field875 = new class176[4];

    @ObfuscatedName("client.an")
    public static boolean field906 = true;

    @ObfuscatedName("client.bh")
    public static int field1043 = 1;

    @ObfuscatedName("client.bx")
    public static int field823 = 0;

    @ObfuscatedName("client.bf")
    public static int field824 = 0;

    @ObfuscatedName("client.bi")
    public static boolean field825 = false;

    @ObfuscatedName("client.br")
    public static boolean field826 = false;

    @ObfuscatedName("client.be")
    public static int field827 = 0;

    @ObfuscatedName("client.bc")
    public static int field828 = 0;

    @ObfuscatedName("client.bw")
    public static boolean field829 = true;

    @ObfuscatedName("client.ba")
    public static int field830 = 0;

    @ObfuscatedName("client.bz")
    public static long field1075 = -1L;

    @ObfuscatedName("client.bn")
    public static int field832 = -1;

    @ObfuscatedName("client.bl")
    public static int field833 = -1;

    @ObfuscatedName("client.bm")
    public static int field834 = -1;

    @ObfuscatedName("client.by")
    public static boolean field1019 = true;

    @ObfuscatedName("client.bq")
    public static boolean field916 = false;

    @ObfuscatedName("client.bo")
    public static int field837 = 0;

    @ObfuscatedName("client.bs")
    public static int field838 = 0;

    @ObfuscatedName("client.bv")
    public static int field839 = 0;

    @ObfuscatedName("client.cq")
    public static int field925 = 0;

    @ObfuscatedName("client.cu")
    public static int field841 = 0;

    @ObfuscatedName("client.cw")
    public static int field842 = 0;

    @ObfuscatedName("client.cd")
    public static int field843 = 0;

    @ObfuscatedName("client.cv")
    public static int field844 = 0;

    @ObfuscatedName("client.cg")
    public static int field1074 = 0;

    @ObfuscatedName("client.cn")
    public static class89 field846 = class89.field1294;

    @ObfuscatedName("client.cl")
    public static class89 field847 = class89.field1294;

    @ObfuscatedName("client.cm")
    public static int field848 = 0;

    @ObfuscatedName("client.co")
    public static int field855 = 0;

    @ObfuscatedName("client.ct")
    public static int field850 = 0;

    @ObfuscatedName("client.dq")
    public static int field947 = 0;

    @ObfuscatedName("client.dt")
    public static int field853 = 0;

    @ObfuscatedName("client.dl")
    public static int field854 = 0;

    @ObfuscatedName("client.dp")
    public static int field862 = 0;

    @ObfuscatedName("client.di")
    public static int field1009 = 0;

    @ObfuscatedName("client.dn")
    public static class158 field857 = class158.field2120;

    @ObfuscatedName("client.dk")
    public static byte[] field858 = null;

    @ObfuscatedName("client.dd")
    public static class84[] field859 = new class84[32768];

    @ObfuscatedName("client.da")
    public static int field860 = 0;

    @ObfuscatedName("client.dz")
    public static int[] field840 = new int[32768];

    @ObfuscatedName("client.ds")
    public static int field968 = 0;

    @ObfuscatedName("client.ee")
    public static int[] field849 = new int[250];

    @ObfuscatedName("client.ek")
    public static final class99 field864 = new class99();

    @ObfuscatedName("client.ei")
    public static int field865 = 0;

    @ObfuscatedName("client.ev")
    public static boolean field866 = false;

    @ObfuscatedName("client.el")
    public static boolean field867 = true;

    @ObfuscatedName("client.es")
    public static class311 field913 = new class311();

    @ObfuscatedName("client.ew")
    public static HashMap field889 = new HashMap();

    @ObfuscatedName("client.em")
    public static int field863 = 0;

    @ObfuscatedName("client.eu")
    public static int field871 = 1;

    @ObfuscatedName("client.ep")
    public static int field845 = 0;

    @ObfuscatedName("client.eb")
    public static int field873 = 1;

    @ObfuscatedName("client.ey")
    public static int field874 = 0;

    @ObfuscatedName("client.fc")
    public static boolean field876 = false;

    @ObfuscatedName("client.fk")
    public static int[][][] field877 = new int[4][13][13];

    @ObfuscatedName("client.ff")
    public static final int[] field852 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.fi")
    public static int field879 = 0;

    @ObfuscatedName("client.fe")
    public static int field958 = 2301979;

    @ObfuscatedName("client.fd")
    public static int field881 = 5063219;

    @ObfuscatedName("client.gt")
    public static int field882 = 3353893;

    @ObfuscatedName("client.gc")
    public static int field1036 = 7759444;

    @ObfuscatedName("client.gr")
    public static boolean field884 = false;

    @ObfuscatedName("client.gq")
    public static int field856 = 0;

    @ObfuscatedName("client.gx")
    public static int field886 = 128;

    @ObfuscatedName("client.gl")
    public static int field887 = 0;

    @ObfuscatedName("client.gn")
    public static int field965 = 0;

    @ObfuscatedName("client.gz")
    public static int field945 = 0;

    @ObfuscatedName("client.gf")
    public static int field1012 = 0;

    @ObfuscatedName("client.gm")
    public static int field891 = 0;

    @ObfuscatedName("client.gh")
    public static int field892 = 50;

    @ObfuscatedName("client.go")
    public static int field928 = 0;

    @ObfuscatedName("client.gg")
    public static boolean field894 = false;

    @ObfuscatedName("client.gp")
    public static int field895 = 0;

    @ObfuscatedName("client.ge")
    public static int field896 = 0;

    @ObfuscatedName("client.gk")
    public static int field1004 = 50;

    @ObfuscatedName("client.gw")
    public static int[] field909 = new int[field1004];

    @ObfuscatedName("client.gv")
    public static int[] field899 = new int[field1004];

    @ObfuscatedName("client.ga")
    public static int[] field1033 = new int[field1004];

    @ObfuscatedName("client.hz")
    public static int[] field901 = new int[field1004];

    @ObfuscatedName("client.hj")
    public static int[] field902 = new int[field1004];

    @ObfuscatedName("client.hk")
    public static int[] field903 = new int[field1004];

    @ObfuscatedName("client.hl")
    public static int[] field904 = new int[field1004];

    @ObfuscatedName("client.he")
    public static String[] field1014 = new String[field1004];

    @ObfuscatedName("client.hh")
    public static int[][] field1058 = new int[104][104];

    @ObfuscatedName("client.ht")
    public static int field869 = 0;

    @ObfuscatedName("client.hb")
    public static int field974 = -1;

    @ObfuscatedName("client.hg")
    public static int field955 = -1;

    @ObfuscatedName("client.hd")
    public static int field905 = 0;

    @ObfuscatedName("client.hi")
    public static int field911 = 0;

    @ObfuscatedName("client.hf")
    public static int field912 = 0;

    @ObfuscatedName("client.hn")
    public static int field1070 = 0;

    @ObfuscatedName("client.hw")
    public static int field914 = 0;

    @ObfuscatedName("client.hr")
    public static int field1011 = 0;

    @ObfuscatedName("client.hm")
    public static int field935 = 0;

    @ObfuscatedName("client.hc")
    public static int field917 = 0;

    @ObfuscatedName("client.hx")
    public static int field918 = 0;

    @ObfuscatedName("client.hv")
    public static int field919 = 0;

    @ObfuscatedName("client.hq")
    public static boolean field920 = false;

    @ObfuscatedName("client.hu")
    public static int field921 = 0;

    @ObfuscatedName("client.hp")
    public static int field922 = 0;

    @ObfuscatedName("client.iy")
    public static class72[] field923 = new class72[2048];

    @ObfuscatedName("client.ip")
    public static int field924 = -1;

    @ObfuscatedName("client.ig")
    public static int field1029 = 0;

    @ObfuscatedName("client.ic")
    public static boolean field926 = true;

    @ObfuscatedName("client.iq")
    public static int field927 = 0;

    @ObfuscatedName("client.il")
    public static int[] field893 = new int[1000];

    @ObfuscatedName("client.it")
    public static String field982 = null;

    @ObfuscatedName("client.id")
    public static final int[] field929 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ih")
    public static String[] field930 = new String[8];

    @ObfuscatedName("client.ik")
    public static boolean[] field868 = new boolean[8];

    @ObfuscatedName("client.ib")
    public static int[] field994 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.iv")
    public static int field973 = -1;

    @ObfuscatedName("client.ii")
    public static class214[][][] field888 = new class214[4][104][104];

    @ObfuscatedName("client.ir")
    public static class214 field1049 = new class214();

    @ObfuscatedName("client.is")
    public static class214 field936 = new class214();

    @ObfuscatedName("client.ie")
    public static class214 field937 = new class214();

    @ObfuscatedName("client.in")
    public static int[] field938 = new int[25];

    @ObfuscatedName("client.ia")
    public static int[] field939 = new int[25];

    @ObfuscatedName("client.io")
    public static int[] field1010 = new int[25];

    @ObfuscatedName("client.if")
    public static int field941 = 0;

    @ObfuscatedName("client.jt")
    public static boolean field942 = false;

    @ObfuscatedName("client.jp")
    public static int field943 = 0;

    @ObfuscatedName("client.je")
    public static int[] field944 = new int[500];

    @ObfuscatedName("client.jn")
    public static int[] field932 = new int[500];

    @ObfuscatedName("client.jf")
    public static int[] field946 = new int[500];

    @ObfuscatedName("client.jm")
    public static int[] field1037 = new int[500];

    @ObfuscatedName("client.jr")
    public static String[] field872 = new String[500];

    @ObfuscatedName("client.jy")
    public static String[] field949 = new String[500];

    @ObfuscatedName("client.jh")
    public static boolean[] field1068 = new boolean[500];

    @ObfuscatedName("client.js")
    public static boolean field951 = false;

    @ObfuscatedName("client.jx")
    public static boolean field952 = false;

    @ObfuscatedName("client.jj")
    public static int field953 = -1;

    @ObfuscatedName("client.jd")
    public static int field954 = -1;

    @ObfuscatedName("client.jw")
    public static int field934 = 0;

    @ObfuscatedName("client.ju")
    public static int field880 = 50;

    @ObfuscatedName("client.jq")
    public static int field836 = 0;

    @ObfuscatedName("client.kc")
    public static boolean field959 = false;

    @ObfuscatedName("client.kb")
    public static int field960 = -1;

    @ObfuscatedName("client.kd")
    public static int field961 = -1;

    @ObfuscatedName("client.kp")
    public static String field962 = null;

    @ObfuscatedName("client.km")
    public static String field963 = null;

    @ObfuscatedName("client.kg")
    public static int field964 = -1;

    @ObfuscatedName("client.kn")
    public static class211 field986 = new class211(8);

    @ObfuscatedName("client.ki")
    public static int field966 = 0;

    @ObfuscatedName("client.kx")
    public static int field967 = 0;

    @ObfuscatedName("client.kt")
    public static class237 field931 = null;

    @ObfuscatedName("client.kz")
    public static int field969 = 0;

    @ObfuscatedName("client.kv")
    public static int field970 = 0;

    @ObfuscatedName("client.kj")
    public static int field907 = 0;

    @ObfuscatedName("client.kq")
    public static int field997 = -1;

    @ObfuscatedName("client.ks")
    public static boolean field1028 = false;

    @ObfuscatedName("client.ka")
    public static boolean field1001 = false;

    @ObfuscatedName("client.ke")
    public static boolean field975 = false;

    @ObfuscatedName("client.kl")
    public static class237 field976 = null;

    @ObfuscatedName("client.kk")
    public static class237 field977 = null;

    @ObfuscatedName("client.ky")
    public static class237 field978 = null;

    @ObfuscatedName("client.kf")
    public static int field1024 = 0;

    @ObfuscatedName("client.kh")
    public static int field915 = 0;

    @ObfuscatedName("client.kw")
    public static class237 field981 = null;

    @ObfuscatedName("client.ko")
    public static boolean field979 = false;

    @ObfuscatedName("client.lc")
    public static int field983 = -1;

    @ObfuscatedName("client.le")
    public static int field1005 = -1;

    @ObfuscatedName("client.lj")
    public static boolean field985 = false;

    @ObfuscatedName("client.lq")
    public static int field1015 = -1;

    @ObfuscatedName("client.lh")
    public static int field987 = -1;

    @ObfuscatedName("client.lt")
    public static boolean field988 = false;

    @ObfuscatedName("client.lm")
    public static int field989 = 1;

    @ObfuscatedName("client.ll")
    public static int[] field991 = new int[32];

    @ObfuscatedName("client.ld")
    public static int field992 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field898 = new int[32];

    @ObfuscatedName("client.li")
    public static int field1017 = 0;

    @ObfuscatedName("client.la")
    public static int[] field995 = new int[32];

    @ObfuscatedName("client.ly")
    public static int field996 = 0;

    @ObfuscatedName("client.lw")
    public static int field870 = 0;

    @ObfuscatedName("client.lu")
    public static int field998 = 0;

    @ObfuscatedName("client.lz")
    public static int field999 = 0;

    @ObfuscatedName("client.lo")
    public static int field1000 = 0;

    @ObfuscatedName("client.lr")
    public static int field885 = 0;

    @ObfuscatedName("client.lb")
    public static int field908 = 0;

    @ObfuscatedName("client.mh")
    public static int field1003 = 0;

    @ObfuscatedName("client.mg")
    public static class214 field822 = new class214();

    @ObfuscatedName("client.mq")
    public static class214 field993 = new class214();

    @ObfuscatedName("client.me")
    public static class214 field1050 = new class214();

    @ObfuscatedName("client.ml")
    public static class211 field1007 = new class211(512);

    @ObfuscatedName("client.mn")
    public static int field1008 = 0;

    @ObfuscatedName("client.mi")
    public static int field878 = -2;

    @ObfuscatedName("client.mu")
    public static boolean[] field980 = new boolean[100];

    @ObfuscatedName("client.mx")
    public static boolean[] field821 = new boolean[100];

    @ObfuscatedName("client.mb")
    public static boolean[] field1032 = new boolean[100];

    @ObfuscatedName("client.mt")
    public static int[] field1013 = new int[100];

    @ObfuscatedName("client.mk")
    public static int[] field1030 = new int[100];

    @ObfuscatedName("client.mw")
    public static int[] field1002 = new int[100];

    @ObfuscatedName("client.mj")
    public static int[] field1057 = new int[100];

    @ObfuscatedName("client.mp")
    public static int field1027 = 0;

    @ObfuscatedName("client.ma")
    public static long field1018 = 0L;

    @ObfuscatedName("client.mm")
    public static boolean field971 = true;

    @ObfuscatedName("client.mc")
    public static int[] field1020 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ni")
    public static int field1021 = 0;

    @ObfuscatedName("client.nm")
    public static int field1022 = 0;

    @ObfuscatedName("client.nw")
    public static String field1023 = "";

    @ObfuscatedName("client.nz")
    public static long[] field883 = new long[100];

    @ObfuscatedName("client.nu")
    public static int field1025 = 0;

    @ObfuscatedName("client.ns")
    public static int field1026 = 0;

    @ObfuscatedName("client.np")
    public static int[] field897 = new int[128];

    @ObfuscatedName("client.nq")
    public static int[] field957 = new int[128];

    @ObfuscatedName("client.na")
    public static long field910 = -1L;

    @ObfuscatedName("client.nd")
    public static int field1078 = -1;

    @ObfuscatedName("client.nh")
    public static int field1031 = 0;

    @ObfuscatedName("client.nx")
    public static int[] field851 = new int[1000];

    @ObfuscatedName("client.nt")
    public static int[] field1038 = new int[1000];

    @ObfuscatedName("client.nv")
    public static class323[] field1034 = new class323[1000];

    @ObfuscatedName("client.nj")
    public static int field1035 = 0;

    @ObfuscatedName("client.ng")
    public static int field940 = 0;

    @ObfuscatedName("client.on")
    public static int field835 = 0;

    @ObfuscatedName("client.ob")
    public static int field972 = 255;

    @ObfuscatedName("client.oc")
    public static int field1016 = -1;

    @ObfuscatedName("client.ol")
    public static boolean field1040 = false;

    @ObfuscatedName("client.oy")
    public static int field1041 = 127;

    @ObfuscatedName("client.of")
    public static int field1042 = 127;

    @ObfuscatedName("client.oe")
    public static int field950 = 0;

    @ObfuscatedName("client.oa")
    public static int[] field1044 = new int[50];

    @ObfuscatedName("client.om")
    public static int[] field1045 = new int[50];

    @ObfuscatedName("client.ox")
    public static int[] field1046 = new int[50];

    @ObfuscatedName("client.oq")
    public static int[] field1047 = new int[50];

    @ObfuscatedName("client.oi")
    public static class103[] field1048 = new class103[50];

    @ObfuscatedName("client.oj")
    public static boolean field984 = false;

    @ObfuscatedName("client.pb")
    public static boolean[] field1051 = new boolean[5];

    @ObfuscatedName("client.pu")
    public static int[] field1052 = new int[5];

    @ObfuscatedName("client.pi")
    public static int[] field1053 = new int[5];

    @ObfuscatedName("client.pv")
    public static int[] field890 = new int[5];

    @ObfuscatedName("client.pn")
    public static int[] field1055 = new int[5];

    @ObfuscatedName("client.pd")
    public static short field1056 = 256;

    @ObfuscatedName("client.pt")
    public static short field948 = 205;

    @ObfuscatedName("client.ps")
    public static short field900 = 256;

    @ObfuscatedName("client.pm")
    public static short field1059 = 320;

    @ObfuscatedName("client.pz")
    public static short field1060 = 1;

    @ObfuscatedName("client.pg")
    public static short field1061 = 32767;

    @ObfuscatedName("client.ph")
    public static short field1062 = 1;

    @ObfuscatedName("client.pl")
    public static short field1063 = 32767;

    @ObfuscatedName("client.py")
    public static int field1064 = 0;

    @ObfuscatedName("client.px")
    public static int field1065 = 0;

    @ObfuscatedName("client.pw")
    public static int field1066 = 0;

    @ObfuscatedName("client.po")
    public static int field1067 = 0;

    @ObfuscatedName("client.pq")
    public static int field831 = 0;

    @ObfuscatedName("client.pk")
    public static class234 field1069 = new class234();

    @ObfuscatedName("client.pa")
    public static int field956 = -1;

    @ObfuscatedName("client.qv")
    public static int field1071 = -1;

    @ObfuscatedName("client.qc")
    public static class17[] field1073 = new class17[8];

    @ObfuscatedName("client.qp")
    public static class73 field861 = new class73();

    @ObfuscatedName("client.ql")
    public static ArrayList field933 = new ArrayList(10);

    @ObfuscatedName("client.qq")
    public static int field1076 = 0;

    @ObfuscatedName("client.qm")
    public static final class71 field1077 = new class71();

    @ObfuscatedName("client.qr")
    public static int[] field1054 = new int[50];

    @ObfuscatedName("client.qy")
    public static int[] field1079 = new int[50];

    @ObfuscatedName("bs.eb(I)Lll;")
    public static class326 method1560() {
        return Statics.field251;
    }

    @ObfuscatedName("client.aa(I)V")
    public final void method799() {
    }

    public final void init() {
        if (!this.method777()) {
            return;
        }
        class310[] var1 = new class310[] { class310.field3825, class310.field3834, class310.field3829, class310.field3839, class310.field3836, class310.field3837, class310.field3830, class310.field3824, class310.field3828, class310.field3832, class310.field3826, class310.field3838, class310.field3835, class310.field3827, class310.field3833, class310.field3831 };
        class310[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class310 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3840);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3840)) {
                    case 1:
                        if (var5.equalsIgnoreCase(class86.field1271)) {
                        }
                        break;
                    case 2:
                        int var7 = Integer.parseInt(var5);
                        class252[] var8 = new class252[] { class252.field3299, class252.field3300, class252.field3302, class252.field3298 };
                        class252[] var9 = var8;
                        int var10 = 0;
                        class252 var12;
                        while (true) {
                            if (var10 >= var9.length) {
                                var12 = null;
                                break;
                            }
                            class252 var11 = var9[var10];
                            if (var11.field3301 == var7) {
                                var12 = var11;
                                break;
                            }
                            var10++;
                        }
                        Statics.field2195 = var12;
                        break;
                    case 3:
                        field1043 = Integer.parseInt(var5);
                        break;
                    case 4:
                        class253[] var6 = new class253[] { class253.field3305, class253.field3306, class253.field3308, class253.field3307, class253.field3310, class253.field3309 };
                        Statics.field457 = (class253) class189.method2486(var6, Integer.parseInt(var5));
                        if (Statics.field457 == class253.field3307) {
                            Statics.field2759 = class327.field3974;
                        } else {
                            Statics.field2759 = class327.field3978;
                        }
                        break;
                    case 5:
                        Statics.field513 = Integer.parseInt(var5);
                        break;
                    case 6:
                        field827 = Integer.parseInt(var5);
                        break;
                    case 7:
                        Statics.field408 = var5;
                    case 8:
                    case 12:
                    default:
                        break;
                    case 9:
                        if (var5.equalsIgnoreCase(class86.field1271)) {
                            field825 = true;
                        } else {
                            field825 = false;
                        }
                        break;
                    case 10:
                        field867 = Integer.parseInt(var5) != 0;
                        break;
                    case 11:
                        Statics.field542 = var5;
                        break;
                    case 13:
                        field823 = Integer.parseInt(var5);
                        break;
                    case 14:
                        field824 = Integer.parseInt(var5);
                        break;
                    case 15:
                        Statics.field3382 = Integer.parseInt(var5);
                }
            }
        }
        class137.field1965 = false;
        field826 = false;
        Statics.field500 = this.getCodeBase().getHost();
        String var13 = Statics.field2195.field3303;
        byte var14 = 0;
        try {
            Statics.field2170 = 17;
            Statics.field298 = var14;
            try {
                Statics.field2491 = System.getProperty("os.name");
            } catch (Exception var59) {
                Statics.field2491 = "Unknown";
            }
            Statics.field2487 = Statics.field2491.toLowerCase();
            try {
                Statics.field2033 = System.getProperty("user.home");
                if (Statics.field2033 != null) {
                    Statics.field2033 = Statics.field2033 + "/";
                }
            } catch (Exception var58) {
            }
            try {
                if (Statics.field2487.startsWith("win")) {
                    if (Statics.field2033 == null) {
                        Statics.field2033 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2033 == null) {
                    Statics.field2033 = System.getenv("HOME");
                }
                if (Statics.field2033 != null) {
                    Statics.field2033 = Statics.field2033 + "/";
                }
            } catch (Exception var57) {
            }
            if (Statics.field2033 == null) {
                Statics.field2033 = "~/";
            }
            Statics.field267 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2033, "/tmp/", "" };
            Statics.field2109 = new String[] { ".jagex_cache_" + Statics.field298, ".file_store_" + Statics.field298 };
            int var18 = 0;
            label270: while (var18 < 4) {
                String var19 = var18 == 0 ? "" : "" + var18;
                Statics.field2169 = new File(Statics.field2033, "jagex_cl_oldschool_" + var13 + var19 + ".dat");
                String var20 = null;
                String var21 = null;
                boolean var22 = false;
                if (Statics.field2169.exists()) {
                    try {
                        class122 var23 = new class122(Statics.field2169, "rw", 10000L);
                        class194 var24 = new class194((int) var23.method2359());
                        while (var24.field2538 < var24.field2541.length) {
                            int var25 = var23.method2340(var24.field2541, var24.field2538, var24.field2541.length - var24.field2538);
                            if (var25 == -1) {
                                throw new IOException();
                            }
                            var24.field2538 += var25;
                        }
                        var24.field2538 = 0;
                        int var26 = var24.method3247();
                        if (var26 < 1 || var26 > 3) {
                            throw new IOException("" + var26);
                        }
                        int var27 = 0;
                        if (var26 > 1) {
                            var27 = var24.method3247();
                        }
                        if (var26 <= 2) {
                            var20 = var24.method3257();
                            if (var27 == 1) {
                                var21 = var24.method3257();
                            }
                        } else {
                            var20 = var24.method3258();
                            if (var27 == 1) {
                                var21 = var24.method3258();
                            }
                        }
                        var23.method2335();
                    } catch (IOException var61) {
                        var61.printStackTrace();
                    }
                    if (var20 != null) {
                        File var29 = new File(var20);
                        if (!var29.exists()) {
                            var20 = null;
                        }
                    }
                    if (var20 != null) {
                        File var30 = new File(var20, "test.dat");
                        if (!class167.method653(var30, true)) {
                            var20 = null;
                        }
                    }
                }
                if (var20 == null && var18 == 0) {
                    label245: for (int var31 = 0; var31 < Statics.field2109.length; var31++) {
                        for (int var32 = 0; var32 < Statics.field267.length; var32++) {
                            File var33 = new File(Statics.field267[var32] + Statics.field2109[var31] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var33.exists() && class167.method653(new File(var33, "test.dat"), true)) {
                                var20 = var33.toString();
                                var22 = true;
                                break label245;
                            }
                        }
                    }
                }
                if (var20 == null) {
                    var20 = Statics.field2033 + File.separatorChar + "jagexcache" + var19 + File.separatorChar + "oldschool" + File.separatorChar + var13 + File.separatorChar;
                    var22 = true;
                }
                if (var21 != null) {
                    File var34 = new File(var21);
                    File var35 = new File(var20);
                    try {
                        File[] var36 = var34.listFiles();
                        File[] var37 = var36;
                        for (int var38 = 0; var38 < var37.length; var38++) {
                            File var39 = var37[var38];
                            File var40 = new File(var35, var39.getName());
                            boolean var41 = var39.renameTo(var40);
                            if (!var41) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var60) {
                        var60.printStackTrace();
                    }
                    var22 = true;
                }
                if (var22) {
                    File var43 = new File(var20);
                    Object var44 = null;
                    try {
                        class122 var45 = new class122(Statics.field2169, "rw", 10000L);
                        class194 var46 = new class194(500);
                        var46.method3232(3);
                        var46.method3232(var44 == null ? 0 : 1);
                        var46.method3467(var43.getPath());
                        if (var44 != null) {
                            var46.method3467(((File) var44).getPath());
                        }
                        var45.method2336(var46.field2541, 0, var46.field2538);
                        var45.method2335();
                    } catch (IOException var56) {
                        var56.printStackTrace();
                    }
                }
                File var48 = new File(var20);
                Statics.field388 = var48;
                if (!Statics.field388.exists()) {
                    Statics.field388.mkdirs();
                }
                File[] var49 = Statics.field388.listFiles();
                if (var49 != null) {
                    File[] var50 = var49;
                    for (int var51 = 0; var51 < var50.length; var51++) {
                        File var52 = var50[var51];
                        if (!class167.method653(var52, false)) {
                            var18++;
                            continue label270;
                        }
                    }
                }
                break;
            }
            File var53 = Statics.field388;
            Statics.field2183 = var53;
            if (!Statics.field2183.exists()) {
                throw new RuntimeException("");
            }
            class170.field2186 = true;
            class167.method3134();
            class167.field2167 = new class121(new class122(class170.method2384("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class167.field2175 = new class121(new class122(class170.method2384("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field2088 = new class121[Statics.field2170];
            for (int var54 = 0; var54 < Statics.field2170; var54++) {
                Statics.field2088[var54] = new class121(new class122(class170.method2384("main_file_cache.idx" + var54), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var62) {
            class164.method482((String) null, var62);
        }
        Statics.field3973 = this;
        this.method907(765, 503, 164);
    }

    @ObfuscatedName("client.ah(I)V")
    public final void method790() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field2548 = null;
            Statics.field3285 = null;
            Statics.field3874 = (byte[][][]) null;
        } else {
            Statics.field2548 = var1;
            Statics.field3285 = new int[var1.length];
            Statics.field3874 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field2548.length; var3++) {
                Statics.field3874[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field1218 = field824 == 0 ? 43594 : field1043 + 40000;
        Statics.field18 = field824 == 0 ? 443 : field1043 + 50000;
        Statics.field756 = Statics.field1218;
        Statics.field2746 = class235.field2763;
        Statics.field2751 = class235.field2757;
        Statics.field2744 = class235.field2758;
        Statics.field2749 = class235.field2762;
        Statics.field548 = new class147();
        this.method770();
        this.method841();
        Statics.field303 = this.method767();
        Statics.field2142 = new class174(255, class167.field2167, class167.field2175, 500000);
        class122 var4 = null;
        class78 var5 = new class78();
        try {
            var4 = class167.method57("", Statics.field457.field3311, false);
            byte[] var6 = new byte[(int) var4.method2359()];
            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method2340(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }
            var5 = new class78(new class194(var6));
        } catch (Exception var16) {
        }
        try {
            if (var4 != null) {
                var4.method2335();
            }
        } catch (Exception var15) {
        }
        Statics.field1072 = var5;
        this.method851();
        String var13 = Statics.field255;
        class57.field613 = this;
        if (var13 != null) {
            class57.field617 = var13;
        }
        if (field824 != 0) {
            field916 = true;
        }
        int var14 = Statics.field1072.field1184;
        field1018 = 0L;
        if (var14 >= 2) {
            field971 = true;
        } else {
            field971 = false;
        }
        if (method1082() == 1) {
            Statics.field3973.method765(765, 503);
        } else {
            Statics.field3973.method765(7680, 2160);
        }
        if (field828 >= 25) {
            method2139();
        }
        Statics.field1278 = new class79(Statics.field2759);
    }

    @ObfuscatedName("client.af(I)V")
    public final void method870() {
        field830++;
        this.method1134();
        class257.method3225();
        class224.method1006();
        method604();
        class51.method2100();
        class60 var1 = class60.field661;
        synchronized (class60.field661) {
            class60.field664 = class60.field663;
            class60.field670 = class60.field659;
            class60.field668 = class60.field665;
            class60.field673 = class60.field669;
            class60.field672 = class60.field666;
            class60.field675 = class60.field676;
            class60.field667 = class60.field677;
            class60.field669 = 0;
        }
        if (Statics.field303 != null) {
            int var3 = Statics.field303.method664();
            field1003 = var3;
        }
        if (field828 == 0) {
            method1850();
            Statics.field629.method2935();
            for (int var4 = 0; var4 < 32; var4++) {
                field640[var4] = 0L;
            }
            for (int var5 = 0; var5 < 32; var5++) {
                field635[var5] = 0L;
            }
            Statics.field625 = 0;
        } else if (field828 == 5) {
            class90.method3136(this);
            method1850();
            Statics.field629.method2935();
            for (int var6 = 0; var6 < 32; var6++) {
                field640[var6] = 0L;
            }
            for (int var7 = 0; var7 < 32; var7++) {
                field635[var7] = 0L;
            }
            Statics.field625 = 0;
        } else if (field828 == 10 || field828 == 11) {
            class90.method3136(this);
        } else if (field828 == 20) {
            class90.method3136(this);
            this.method1139();
        } else if (field828 == 25) {
            method652(false);
            field863 = 0;
            boolean var8 = true;
            for (int var9 = 0; var9 < Statics.field2121.length; var9++) {
                if (Statics.field532[var9] != -1 && Statics.field2121[var9] == null) {
                    Statics.field2121[var9] = Statics.field1412.method4158(Statics.field532[var9], 0);
                    if (Statics.field2121[var9] == null) {
                        var8 = false;
                        field863++;
                    }
                }
                if (Statics.field499[var9] != -1 && Statics.field590[var9] == null) {
                    Statics.field590[var9] = Statics.field1412.method4171(Statics.field499[var9], 0, Statics.field1190[var9]);
                    if (Statics.field590[var9] == null) {
                        var8 = false;
                        field863++;
                    }
                }
            }
            if (var8) {
                field845 = 0;
                boolean var10 = true;
                for (int var11 = 0; var11 < Statics.field2121.length; var11++) {
                    byte[] var12 = Statics.field590[var11];
                    if (var12 != null) {
                        int var13 = (Statics.field3356[var11] >> 8) * 64 - Statics.field710;
                        int var14 = (Statics.field3356[var11] & 0xFF) * 64 - Statics.field401;
                        if (field876) {
                            var13 = 10;
                            var14 = 10;
                        }
                        var10 &= class62.method553(var12, var13, var14);
                    }
                }
                if (var10) {
                    if (field874 != 0) {
                        method4068(class246.field3071 + class86.field1273 + class86.field1267 + 100 + "%" + class86.field1270, true);
                    }
                    method604();
                    method3155();
                    method604();
                    Statics.field2065.method2671();
                    method604();
                    System.gc();
                    for (int var15 = 0; var15 < 4; var15++) {
                        field875[var15].method3101();
                    }
                    for (int var16 = 0; var16 < 4; var16++) {
                        for (int var17 = 0; var17 < 104; var17++) {
                            for (int var18 = 0; var18 < 104; var18++) {
                                class62.field698[var16][var17][var18] = 0;
                            }
                        }
                    }
                    method604();
                    class62.field687 = 99;
                    Statics.field688 = new byte[4][104][104];
                    Statics.field2765 = new byte[4][104][104];
                    Statics.field1283 = new byte[4][104][104];
                    Statics.field28 = new byte[4][104][104];
                    Statics.field620 = new int[4][105][105];
                    Statics.field2489 = new byte[4][105][105];
                    Statics.field2470 = new int[105][105];
                    Statics.field2739 = new int[104];
                    Statics.field335 = new int[104];
                    Statics.field685 = new int[104];
                    Statics.field693 = new int[104];
                    Statics.field701 = new int[104];
                    int var19 = Statics.field2121.length;
                    for (class80 var20 = (class80) class80.field1211.method3739(); var20 != null; var20 = (class80) class80.field1211.method3745()) {
                        if (var20.field1202 != null) {
                            Statics.field584.method1923(var20.field1202);
                            var20.field1202 = null;
                        }
                        if (var20.field1214 != null) {
                            Statics.field584.method1923(var20.field1214);
                            var20.field1214 = null;
                        }
                    }
                    class80.field1211.method3734();
                    method652(true);
                    if (!field876) {
                        for (int var21 = 0; var21 < var19; var21++) {
                            int var22 = (Statics.field3356[var21] >> 8) * 64 - Statics.field710;
                            int var23 = (Statics.field3356[var21] & 0xFF) * 64 - Statics.field401;
                            byte[] var24 = Statics.field2121[var21];
                            if (var24 != null) {
                                method604();
                                class62.method1840(var24, var22, var23, Statics.field2091 * 8 - 48, Statics.field2087 * 8 - 48, field875);
                            }
                        }
                        for (int var25 = 0; var25 < var19; var25++) {
                            int var26 = (Statics.field3356[var25] >> 8) * 64 - Statics.field710;
                            int var27 = (Statics.field3356[var25] & 0xFF) * 64 - Statics.field401;
                            byte[] var28 = Statics.field2121[var25];
                            if (var28 == null && Statics.field2087 < 800) {
                                method604();
                                class62.method4121(var26, var27, 64, 64);
                            }
                        }
                        method652(true);
                        for (int var29 = 0; var29 < var19; var29++) {
                            byte[] var30 = Statics.field590[var29];
                            if (var30 != null) {
                                int var31 = (Statics.field3356[var29] >> 8) * 64 - Statics.field710;
                                int var32 = (Statics.field3356[var29] & 0xFF) * 64 - Statics.field401;
                                method604();
                                class137 var33 = Statics.field2065;
                                class176[] var34 = field875;
                                class194 var35 = new class194(var30);
                                int var36 = -1;
                                while (true) {
                                    int var37 = var35.method3368();
                                    if (var37 == 0) {
                                        break;
                                    }
                                    var36 += var37;
                                    int var38 = 0;
                                    while (true) {
                                        int var39 = var35.method3368();
                                        if (var39 == 0) {
                                            break;
                                        }
                                        var38 += var39 - 1;
                                        int var40 = var38 & 0x3F;
                                        int var41 = var38 >> 6 & 0x3F;
                                        int var42 = var38 >> 12;
                                        int var43 = var35.method3247();
                                        int var44 = var43 >> 2;
                                        int var45 = var43 & 0x3;
                                        int var46 = var31 + var41;
                                        int var47 = var32 + var40;
                                        if (var46 > 0 && var47 > 0 && var46 < 103 && var47 < 103) {
                                            int var48 = var42;
                                            if ((class62.field698[1][var46][var47] & 0x2) == 2) {
                                                var48 = var42 - 1;
                                            }
                                            class176 var49 = null;
                                            if (var48 >= 0) {
                                                var49 = var34[var48];
                                            }
                                            class62.method149(var42, var46, var47, var36, var45, var44, var33, var49);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (field876) {
                        int var50 = 0;
                        label493: while (true) {
                            if (var50 >= 4) {
                                for (int var89 = 0; var89 < 13; var89++) {
                                    for (int var90 = 0; var90 < 13; var90++) {
                                        int var91 = field877[0][var89][var90];
                                        if (var91 == -1) {
                                            class62.method4121(var89 * 8, var90 * 8, 8, 8);
                                        }
                                    }
                                }
                                method652(true);
                                int var92 = 0;
                                while (true) {
                                    if (var92 >= 4) {
                                        break label493;
                                    }
                                    method604();
                                    for (int var93 = 0; var93 < 13; var93++) {
                                        for (int var94 = 0; var94 < 13; var94++) {
                                            int var95 = field877[var92][var93][var94];
                                            if (var95 != -1) {
                                                int var96 = var95 >> 24 & 0x3;
                                                int var97 = var95 >> 1 & 0x3;
                                                int var98 = var95 >> 14 & 0x3FF;
                                                int var99 = var95 >> 3 & 0x7FF;
                                                int var100 = (var98 / 8 << 8) + var99 / 8;
                                                for (int var101 = 0; var101 < Statics.field3356.length; var101++) {
                                                    if (Statics.field3356[var101] == var100 && Statics.field590[var101] != null) {
                                                        class62.method1693(Statics.field590[var101], var92, var93 * 8, var94 * 8, var96, (var98 & 0x7) * 8, (var99 & 0x7) * 8, var97, Statics.field2065, field875);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var92++;
                                }
                            }
                            method604();
                            for (int var51 = 0; var51 < 13; var51++) {
                                for (int var52 = 0; var52 < 13; var52++) {
                                    boolean var53 = false;
                                    int var54 = field877[var50][var51][var52];
                                    if (var54 != -1) {
                                        int var55 = var54 >> 24 & 0x3;
                                        int var56 = var54 >> 1 & 0x3;
                                        int var57 = var54 >> 14 & 0x3FF;
                                        int var58 = var54 >> 3 & 0x7FF;
                                        int var59 = (var57 / 8 << 8) + var58 / 8;
                                        for (int var60 = 0; var60 < Statics.field3356.length; var60++) {
                                            if (Statics.field3356[var60] == var59 && Statics.field2121[var60] != null) {
                                                byte[] var61 = Statics.field2121[var60];
                                                int var62 = var51 * 8;
                                                int var63 = var52 * 8;
                                                int var64 = (var57 & 0x7) * 8;
                                                int var65 = (var58 & 0x7) * 8;
                                                class176[] var66 = field875;
                                                for (int var67 = 0; var67 < 8; var67++) {
                                                    for (int var68 = 0; var68 < 8; var68++) {
                                                        if (var62 + var67 > 0 && var62 + var67 < 103 && var63 + var68 > 0 && var63 + var68 < 103) {
                                                            var66[var50].field2225[var62 + var67][var63 + var68] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class194 var69 = new class194(var61);
                                                for (int var70 = 0; var70 < 4; var70++) {
                                                    for (int var71 = 0; var71 < 64; var71++) {
                                                        for (int var72 = 0; var72 < 64; var72++) {
                                                            if (var55 == var70 && var71 >= var64 && var71 < var64 + 8 && var72 >= var65 && var72 < var65 + 8) {
                                                                int var75 = var62 + class236.method176(var71 & 0x7, var72 & 0x7, var56);
                                                                int var77 = var71 & 0x7;
                                                                int var78 = var72 & 0x7;
                                                                int var80 = var56 & 0x3;
                                                                int var81;
                                                                if (var80 == 0) {
                                                                    var81 = var78;
                                                                } else if (var80 == 1) {
                                                                    var81 = 7 - var77;
                                                                } else if (var80 == 2) {
                                                                    var81 = 7 - var78;
                                                                } else {
                                                                    var81 = var77;
                                                                }
                                                                class62.method2137(var69, var50, var75, var63 + var81, 0, 0, var56);
                                                            } else {
                                                                class62.method2137(var69, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var53 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var53) {
                                        int var82 = var50;
                                        int var83 = var51 * 8;
                                        int var84 = var52 * 8;
                                        for (int var85 = 0; var85 < 8; var85++) {
                                            for (int var86 = 0; var86 < 8; var86++) {
                                                class62.field689[var82][var83 + var85][var84 + var86] = 0;
                                            }
                                        }
                                        if (var83 > 0) {
                                            for (int var87 = 1; var87 < 8; var87++) {
                                                class62.field689[var82][var83][var84 + var87] = class62.field689[var82][var83 - 1][var84 + var87];
                                            }
                                        }
                                        if (var84 > 0) {
                                            for (int var88 = 1; var88 < 8; var88++) {
                                                class62.field689[var82][var83 + var88][var84] = class62.field689[var82][var83 + var88][var84 - 1];
                                            }
                                        }
                                        if (var83 > 0 && class62.field689[var82][var83 - 1][var84] != 0) {
                                            class62.field689[var82][var83][var84] = class62.field689[var82][var83 - 1][var84];
                                        } else if (var84 > 0 && class62.field689[var82][var83][var84 - 1] != 0) {
                                            class62.field689[var82][var83][var84] = class62.field689[var82][var83][var84 - 1];
                                        } else if (var83 > 0 && var84 > 0 && class62.field689[var82][var83 - 1][var84 - 1] != 0) {
                                            class62.field689[var82][var83][var84] = class62.field689[var82][var83 - 1][var84 - 1];
                                        }
                                    }
                                }
                            }
                            var50++;
                        }
                    }
                    method652(true);
                    method3155();
                    method604();
                    class62.method554(Statics.field2065, field875);
                    method652(true);
                    int var102 = class62.field687;
                    if (var102 > Statics.field2735) {
                        var102 = Statics.field2735;
                    }
                    if (var102 < Statics.field2735 - 1) {
                        int var103 = Statics.field2735 - 1;
                    }
                    if (field826) {
                        Statics.field2065.method2672(class62.field687);
                    } else {
                        Statics.field2065.method2672(0);
                    }
                    for (int var104 = 0; var104 < 104; var104++) {
                        for (int var105 = 0; var105 < 104; var105++) {
                            method175(var104, var105);
                        }
                    }
                    method604();
                    method1124();
                    class276.field3521.method3661();
                    if (Statics.field3973.method798()) {
                        class184 var106 = class184.method979(class181.field2374, field864.field1435);
                        var106.field2468.method3235(1057001181);
                        field864.method1893(var106);
                    }
                    if (!field876) {
                        int var107 = (Statics.field2091 - 6) / 8;
                        int var108 = (Statics.field2091 + 6) / 8;
                        int var109 = (Statics.field2087 - 6) / 8;
                        int var110 = (Statics.field2087 + 6) / 8;
                        for (int var111 = var107 - 1; var111 <= var108 + 1; var111++) {
                            for (int var112 = var109 - 1; var112 <= var110 + 1; var112++) {
                                if (var111 < var107 || var111 > var108 || var112 < var109 || var112 > var110) {
                                    Statics.field1412.method4169("m" + var111 + "_" + var112);
                                    Statics.field1412.method4169("l" + var111 + "_" + var112);
                                }
                            }
                        }
                    }
                    method262(30);
                    method604();
                    class62.method4412();
                    class184 var113 = class184.method979(class181.field2417, field864.field1435);
                    field864.method1893(var113);
                    Statics.field629.method2935();
                    for (int var114 = 0; var114 < 32; var114++) {
                        field640[var114] = 0L;
                    }
                    for (int var115 = 0; var115 < 32; var115++) {
                        field635[var115] = 0L;
                    }
                    Statics.field625 = 0;
                } else {
                    field874 = 2;
                }
            } else {
                field874 = 1;
            }
        }
        if (field828 == 30) {
            this.method1140();
        } else if (field828 == 40 || field828 == 45) {
            this.method1139();
        }
    }

    @ObfuscatedName("client.ai(ZB)V")
    public final void method791(boolean arg0) {
        boolean var2 = class224.method1043();
        if (var2 && field1040 && Statics.field416 != null) {
            Statics.field416.method2056();
        }
        if ((field828 == 10 || field828 == 20 || field828 == 30) && field1018 != 0L && class196.method3211() > field1018) {
            int var3 = field971 ? 2 : 1;
            field1018 = 0L;
            if (var3 >= 2) {
                field971 = true;
            } else {
                field971 = false;
            }
            if (method1082() == 1) {
                Statics.field3973.method765(765, 503);
            } else {
                Statics.field3973.method765(7680, 2160);
            }
            if (field828 >= 25) {
                method2139();
            }
        }
        if (arg0) {
            for (int var4 = 0; var4 < 100; var4++) {
                field980[var4] = true;
            }
        }
        if (field828 == 0) {
            this.method807(class90.field1306, class90.field1314, arg0);
        } else if (field828 == 5) {
            class90.method265(Statics.field2093, Statics.field3380, Statics.field3747, arg0);
        } else if (field828 == 10 || field828 == 11) {
            class90.method265(Statics.field2093, Statics.field3380, Statics.field3747, arg0);
        } else if (field828 == 20) {
            class90.method265(Statics.field2093, Statics.field3380, Statics.field3747, arg0);
        } else if (field828 == 25) {
            if (field874 == 1) {
                if (field863 > field871) {
                    field871 = field863;
                }
                int var5 = (field871 * 50 - field863 * 50) / field871;
                method4068(class246.field3071 + class86.field1273 + class86.field1267 + var5 + "%" + class86.field1270, false);
            } else if (field874 == 2) {
                if (field845 > field873) {
                    field873 = field845;
                }
                int var6 = (field873 * 50 - field845 * 50) / field873 + 50;
                method4068(class246.field3071 + class86.field1273 + class86.field1267 + var6 + "%" + class86.field1270, false);
            } else {
                method4068(class246.field3071, false);
            }
        } else if (field828 == 30) {
            this.method1278();
        } else if (field828 == 40) {
            method4068(class246.field2983 + class86.field1273 + class246.field3252, false);
        } else if (field828 == 45) {
            method4068(class246.field3052, false);
        }
        if (field828 == 30 && field1027 == 0 && !arg0 && !field971) {
            for (int var7 = 0; var7 < field1008; var7++) {
                if (field821[var7]) {
                    Statics.field3926.method749(field1013[var7], field1030[var7], field1002[var7], field1057[var7]);
                    field821[var7] = false;
                }
            }
        } else if (field828 > 0) {
            Statics.field3926.method751(0, 0);
            for (int var8 = 0; var8 < field1008; var8++) {
                field821[var8] = false;
            }
        }
    }

    @ObfuscatedName("client.aq(I)V")
    public final void method792() {
        if (Statics.field684.method1833()) {
            Statics.field684.method1837();
        }
        if (Statics.field411 != null) {
            Statics.field411.field763 = false;
        }
        Statics.field411 = null;
        field864.method1888();
        class51.method2979();
        if (class60.field661 != null) {
            class60 var1 = class60.field661;
            synchronized (class60.field661) {
                class60.field661 = null;
            }
        }
        Statics.field303 = null;
        if (Statics.field416 != null) {
            Statics.field416.method2057();
        }
        if (Statics.field1289 != null) {
            Statics.field1289.method2057();
        }
        class259.method565();
        Object var3 = class257.field3341;
        synchronized (class257.field3341) {
            if (class257.field3339 != 0) {
                class257.field3339 = 1;
                try {
                    class257.field3341.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        if (Statics.field548 != null) {
            Statics.field548.method2844();
            Statics.field548 = null;
        }
        try {
            class167.field2167.method2303();
            for (int var6 = 0; var6 < Statics.field2170; var6++) {
                Statics.field2088[var6].method2303();
            }
            class167.field2175.method2303();
            class167.field2178.method2303();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("ah.fo(II)V")
    public static void method262(int arg0) {
        if (field828 == arg0) {
            return;
        }
        if (field828 == 0) {
            Statics.field3973.method794();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field853 = 0;
            field854 = 0;
            field862 = 0;
            field913.method5146(arg0);
            if (arg0 != 20) {
                method71(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field12 != null) {
            Statics.field12.method3020();
            Statics.field12 = null;
        }
        if (field828 == 25) {
            field874 = 0;
            field863 = 0;
            field871 = 1;
            field845 = 0;
            field873 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class90.method707(Statics.field1275, Statics.field776, true, 0);
        } else if (arg0 == 20) {
            class90.method707(Statics.field1275, Statics.field776, true, field828 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class90.method707(Statics.field1275, Statics.field776, false, 4);
        } else if (Statics.field31) {
            Statics.field1300 = null;
            Statics.field1265 = null;
            Statics.field1301 = null;
            Statics.field2760 = null;
            Statics.field3807 = null;
            Statics.field1302 = null;
            Statics.field1542 = null;
            Statics.field260 = null;
            Statics.field1303 = null;
            Statics.field606 = null;
            Statics.field3344 = null;
            Statics.field435 = null;
            Statics.field248 = null;
            Statics.field407 = null;
            Statics.field386 = null;
            Statics.field2094 = null;
            Statics.field371 = null;
            Statics.field1430 = null;
            Statics.field472 = null;
            Statics.field468 = null;
            Statics.field1308 = null;
            Statics.field1423 = null;
            class224.method4151(2);
            class259.method4013(true);
            Statics.field31 = false;
        }
        field828 = arg0;
    }

    @ObfuscatedName("client.fl(B)V")
    public void method1134() {
        if (field828 == 1000) {
            return;
        }
        long var1 = class196.method3211();
        int var3 = (int) (var1 - Statics.field3359);
        Statics.field3359 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class259.field3374 += var3;
        boolean var4;
        if (class259.field3367 == 0 && class259.field3358 == 0 && class259.field3363 == 0 && class259.field3361 == 0) {
            var4 = true;
        } else if (Statics.field3366 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class259.field3374 > 30000) {
                        throw new IOException();
                    }
                    while (class259.field3358 < 200 && class259.field3361 > 0) {
                        class255 var5 = (class255) class259.field3360.method3677();
                        class194 var6 = new class194(4);
                        var6.method3232(1);
                        var6.method3234((int) var5.field2613);
                        Statics.field3366.method3019(var6.field2541, 0, 4);
                        class259.field3364.method3675(var5, var5.field2613);
                        class259.field3361--;
                        class259.field3358++;
                    }
                    while (class259.field3367 < 200 && class259.field3363 > 0) {
                        class255 var7 = (class255) class259.field3357.method3621();
                        class194 var8 = new class194(4);
                        var8.method3232(0);
                        var8.method3234((int) var7.field2613);
                        Statics.field3366.method3019(var8.field2541, 0, 4);
                        var7.method3766();
                        class259.field3362.method3675(var7, var7.field2613);
                        class259.field3363--;
                        class259.field3367++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3366.method3028();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class259.field3374 = 0;
                        byte var11 = 0;
                        if (Statics.field2181 == null) {
                            var11 = 8;
                        } else if (class259.field3370 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class259.field3369.field2538;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3366.method3031(class259.field3369.field2541, class259.field3369.field2538, var12);
                            if (class259.field3373 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class259.field3369.field2541[class259.field3369.field2538 + var13] ^= class259.field3373;
                                }
                            }
                            class259.field3369.field2538 += var12;
                            if (class259.field3369.field2538 < var11) {
                                break;
                            }
                            if (Statics.field2181 == null) {
                                class259.field3369.field2538 = 0;
                                int var14 = class259.field3369.method3247();
                                int var15 = class259.field3369.method3249();
                                int var16 = class259.field3369.method3247();
                                int var17 = class259.field3369.method3261();
                                long var18 = (long) ((var14 << 16) + var15);
                                class255 var20 = (class255) class259.field3364.method3674(var18);
                                Statics.field3277 = true;
                                if (var20 == null) {
                                    var20 = (class255) class259.field3362.method3674(var18);
                                    Statics.field3277 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2181 = var20;
                                Statics.field1882 = new class194(var17 + var21 + Statics.field2181.field3318);
                                Statics.field1882.method3232(var16);
                                Statics.field1882.method3235(var17);
                                class259.field3370 = 8;
                                class259.field3369.field2538 = 0;
                            } else if (class259.field3370 == 0) {
                                if (class259.field3369.field2541[0] == -1) {
                                    class259.field3370 = 1;
                                    class259.field3369.field2538 = 0;
                                } else {
                                    Statics.field2181 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1882.field2541.length - Statics.field2181.field3318;
                            int var23 = 512 - class259.field3370;
                            if (var23 > var22 - Statics.field1882.field2538) {
                                var23 = var22 - Statics.field1882.field2538;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3366.method3031(Statics.field1882.field2541, Statics.field1882.field2538, var23);
                            if (class259.field3373 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1882.field2541[Statics.field1882.field2538 + var24] ^= class259.field3373;
                                }
                            }
                            Statics.field1882.field2538 += var23;
                            class259.field3370 += var23;
                            if (Statics.field1882.field2538 == var22) {
                                if (Statics.field2181.field2613 == 16711935L) {
                                    Statics.field3755 = Statics.field1882;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class258 var26 = class259.field3372[var25];
                                        if (var26 != null) {
                                            Statics.field3755.field2538 = var25 * 8 + 5;
                                            int var27 = Statics.field3755.method3261();
                                            int var28 = Statics.field3755.method3261();
                                            var26.method4286(var27, var28);
                                        }
                                    }
                                } else {
                                    class259.field3371.reset();
                                    class259.field3371.update(Statics.field1882.field2541, 0, var22);
                                    int var29 = (int) class259.field3371.getValue();
                                    if (Statics.field2181.field3319 != var29) {
                                        try {
                                            Statics.field3366.method3020();
                                        } catch (Exception var35) {
                                        }
                                        class259.field3368++;
                                        Statics.field3366 = null;
                                        class259.field3373 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class259.field3368 = 0;
                                    class259.field3375 = 0;
                                    Statics.field2181.field3320.method4270((int) (Statics.field2181.field2613 & 0xFFFFL), Statics.field1882.field2541, (Statics.field2181.field2613 & 0xFF0000L) == 16711680L, Statics.field3277);
                                }
                                Statics.field2181.method3726();
                                if (Statics.field3277) {
                                    class259.field3358--;
                                } else {
                                    class259.field3367--;
                                }
                                class259.field3370 = 0;
                                Statics.field2181 = null;
                                Statics.field1882 = null;
                            } else {
                                if (class259.field3370 != 512) {
                                    break;
                                }
                                class259.field3370 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3366.method3020();
                } catch (Exception var34) {
                }
                class259.field3375++;
                Statics.field3366 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1247();
        }
    }

    @ObfuscatedName("client.fa(S)V")
    public void method1247() {
        if (class259.field3368 >= 4) {
            this.method773("js5crc");
            field828 = 1000;
            return;
        }
        if (class259.field3375 >= 4) {
            if (field828 <= 5) {
                this.method773("js5io");
                field828 = 1000;
                return;
            }
            field850 = 3000;
            class259.field3375 = 3;
        }
        if (--field850 + 1 > 0) {
            return;
        }
        try {
            if (field855 == 0) {
                Statics.field523 = Statics.field636.method2983(Statics.field500, Statics.field756);
                field855++;
            }
            if (field855 == 1) {
                if (Statics.field523.field2154 == 2) {
                    this.method1138(-1);
                    return;
                }
                if (Statics.field523.field2154 == 1) {
                    field855++;
                }
            }
            if (field855 == 2) {
                if (field867) {
                    Socket var1 = (Socket) Statics.field523.field2158;
                    class171 var2 = new class171(var1, 40000, 5000);
                    Statics.field2066 = var2;
                } else {
                    Statics.field2066 = new class173((Socket) Statics.field523.field2158, Statics.field636, 5000);
                }
                class194 var3 = new class194(5);
                var3.method3232(15);
                var3.method3235(164);
                Statics.field2066.method3019(var3.field2541, 0, 5);
                field855++;
                Statics.field315 = class196.method3211();
            }
            if (field855 == 3) {
                if (Statics.field2066.method3028() > 0 || !field867 && field828 <= 5) {
                    int var4 = Statics.field2066.method3014();
                    if (var4 != 0) {
                        this.method1138(var4);
                        return;
                    }
                    field855++;
                } else if (class196.method3211() - Statics.field315 > 30000L) {
                    this.method1138(-2);
                    return;
                }
            }
            if (field855 == 4) {
                class259.method2135(Statics.field2066, field828 > 20);
                Statics.field523 = null;
                Statics.field2066 = null;
                field855 = 0;
                field947 = 0;
            }
        } catch (IOException var6) {
            this.method1138(-3);
        }
    }

    @ObfuscatedName("client.fs(IB)V")
    public void method1138(int arg0) {
        Statics.field523 = null;
        Statics.field2066 = null;
        field855 = 0;
        if (Statics.field756 == Statics.field1218) {
            Statics.field756 = Statics.field18;
        } else {
            Statics.field756 = Statics.field1218;
        }
        field947++;
        if (field947 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field828 <= 5) {
                this.method773("js5connect_full");
                field828 = 1000;
            } else {
                field850 = 3000;
            }
        } else if (field947 >= 2 && arg0 == 6) {
            this.method773("js5connect_outofdate");
            field828 = 1000;
        } else if (field947 >= 4) {
            if (field828 <= 5) {
                this.method773("js5connect");
                field828 = 1000;
            } else {
                field850 = 3000;
            }
        }
    }

    @ObfuscatedName("gq.fg(Lia;Ljava/lang/String;I)V")
    public static void method3162(class258 arg0, String arg1) {
        class64 var2 = new class64(arg0, arg1);
        field933.add(var2);
    }

    @ObfuscatedName("ce.fj(I)V")
    public static void method1850() {
        if (field848 == 0) {
            Statics.field2065 = new class137(4, 104, 104, class62.field689);
            for (int var0 = 0; var0 < 4; var0++) {
                field875[var0] = new class176(104, 104);
            }
            Statics.field1881 = new class323(512, 512);
            class90.field1314 = class246.field2985;
            class90.field1306 = 5;
            field848 = 20;
        } else if (field848 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class134.field1902[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class137.method2783(var1, 500, 800, 512, 334);
            class90.field1314 = class246.field2986;
            class90.field1306 = 10;
            field848 = 30;
        } else if (field848 == 30) {
            Statics.field1006 = method156(0, false, true, true);
            Statics.field2108 = method156(1, false, true, true);
            Statics.field1551 = method156(2, true, false, true);
            Statics.field604 = method156(3, false, true, true);
            Statics.field605 = method156(4, false, true, true);
            Statics.field1412 = method156(5, true, true, true);
            Statics.field2107 = method156(6, true, true, true);
            Statics.field1414 = method156(7, false, true, true);
            Statics.field776 = method156(8, false, true, true);
            Statics.field714 = method156(9, false, true, true);
            Statics.field1275 = method156(10, false, true, true);
            Statics.field286 = method156(11, false, true, true);
            Statics.field1233 = method156(12, false, true, true);
            Statics.field13 = method156(13, true, false, true);
            Statics.field2554 = method156(14, false, true, true);
            Statics.field367 = method156(15, false, true, true);
            Statics.field467 = method156(16, false, true, true);
            class90.field1314 = class246.field2987;
            class90.field1306 = 20;
            field848 = 40;
        } else if (field848 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1006.method4269() * 4 / 100;
            int var8 = var7 + Statics.field2108.method4269() * 4 / 100;
            int var9 = var8 + Statics.field1551.method4269() * 2 / 100;
            int var10 = var9 + Statics.field604.method4269() * 2 / 100;
            int var11 = var10 + Statics.field605.method4269() * 6 / 100;
            int var12 = var11 + Statics.field1412.method4269() * 4 / 100;
            int var13 = var12 + Statics.field2107.method4269() * 2 / 100;
            int var14 = var13 + Statics.field1414.method4269() * 58 / 100;
            int var15 = var14 + Statics.field776.method4269() * 2 / 100;
            int var16 = var15 + Statics.field714.method4269() * 2 / 100;
            int var17 = var16 + Statics.field1275.method4269() * 2 / 100;
            int var18 = var17 + Statics.field286.method4269() * 2 / 100;
            int var19 = var18 + Statics.field1233.method4269() * 2 / 100;
            int var20 = var19 + Statics.field13.method4269() * 2 / 100;
            int var21 = var20 + Statics.field2554.method4269() * 2 / 100;
            int var22 = var21 + Statics.field367.method4269() * 2 / 100;
            int var23 = var22 + Statics.field467.method4269() * 2 / 100;
            if (var23 == 100) {
                method3162(Statics.field1006, "Animations");
                method3162(Statics.field2108, "Skeletons");
                method3162(Statics.field605, "Sound FX");
                method3162(Statics.field1412, "Maps");
                method3162(Statics.field2107, "Music Tracks");
                method3162(Statics.field1414, "Models");
                method3162(Statics.field776, "Sprites");
                method3162(Statics.field286, "Music Jingles");
                method3162(Statics.field2554, "Music Samples");
                method3162(Statics.field367, "Music Patches");
                method3162(Statics.field467, "World Map");
                class90.field1314 = class246.field3173;
                class90.field1306 = 30;
                field848 = 45;
            } else {
                if (var23 != 0) {
                    class90.field1314 = class246.field3120 + var23 + "%";
                }
                class90.field1306 = 30;
            }
        } else if (field848 == 45) {
            class107.method4070(22050, !field826, 2);
            class225 var24 = new class225();
            var24.method3830(9, 128);
            Statics.field416 = class107.method1869(Statics.field636, 0, 22050);
            Statics.field416.method2053(var24);
            class258 var25 = Statics.field367;
            class258 var26 = Statics.field2554;
            class258 var27 = Statics.field605;
            Statics.field2645 = var25;
            Statics.field602 = var26;
            Statics.field1363 = var27;
            Statics.field2106 = var24;
            Statics.field1289 = class107.method1869(Statics.field636, 1, 2048);
            Statics.field584 = new class100();
            Statics.field1289.method2053(Statics.field584);
            Statics.field2566 = new class114(22050, Statics.field1523);
            class90.field1314 = class246.field3211;
            class90.field1306 = 35;
            field848 = 50;
            Statics.field715 = new class297(Statics.field776, Statics.field13);
        } else if (field848 == 50) {
            int var28 = class296.method4978().length;
            field889 = Statics.field715.method4984(class296.method4978());
            if (field889.size() < var28) {
                class90.field1314 = class246.field3070 + field889.size() * 100 / var28 + "%";
                class90.field1306 = 40;
            } else {
                Statics.field3380 = (class298) field889.get(class296.field3751);
                Statics.field3747 = (class298) field889.get(class296.field3752);
                Statics.field2093 = (class298) field889.get(class296.field3753);
                Statics.field718 = new class329(true);
                class90.field1314 = class246.field2992;
                class90.field1306 = 40;
                field848 = 60;
            }
        } else if (field848 == 60) {
            class258 var29 = Statics.field1275;
            class258 var30 = Statics.field776;
            int var31 = 0;
            if (var29.method4181("title.jpg", "")) {
                var31++;
            }
            if (var30.method4181("logo", "")) {
                var31++;
            }
            if (var30.method4181("logo_deadman_mode", "")) {
                var31++;
            }
            if (var30.method4181("titlebox", "")) {
                var31++;
            }
            if (var30.method4181("titlebutton", "")) {
                var31++;
            }
            if (var30.method4181("runes", "")) {
                var31++;
            }
            if (var30.method4181("title_mute", "")) {
                var31++;
            }
            if (var30.method4181("options_radio_buttons,0", "")) {
                var31++;
            }
            if (var30.method4181("options_radio_buttons,2", "")) {
                var31++;
            }
            if (var30.method4181("options_radio_buttons,4", "")) {
                var31++;
            }
            if (var30.method4181("options_radio_buttons,6", "")) {
                var31++;
            }
            var30.method4181("sl_back", "");
            var30.method4181("sl_flags", "");
            var30.method4181("sl_arrows", "");
            var30.method4181("sl_stars", "");
            var30.method4181("sl_button", "");
            int var34 = class90.method2917();
            if (var31 < var34) {
                class90.field1314 = class246.field3100 + var31 * 100 / var34 + "%";
                class90.field1306 = 50;
            } else {
                class90.field1314 = class246.field2994;
                class90.field1306 = 50;
                method262(5);
                field848 = 70;
            }
        } else if (field848 == 70) {
            if (Statics.field1551.method4191()) {
                class258 var35 = Statics.field1551;
                Statics.field3666 = var35;
                class258 var36 = Statics.field1551;
                Statics.field3438 = var36;
                class258 var37 = Statics.field1551;
                class258 var38 = Statics.field1414;
                Statics.field3445 = var37;
                Statics.field2168 = var38;
                Statics.field3444 = Statics.field3445.method4172(3);
                class258 var39 = Statics.field1551;
                class258 var40 = Statics.field1414;
                boolean var41 = field826;
                Statics.field1545 = var39;
                Statics.field2097 = var40;
                class276.field3530 = var41;
                Statics.method2102(Statics.field1551, Statics.field1414);
                class273.method2836(Statics.field1551);
                class258 var42 = Statics.field1551;
                class258 var43 = Statics.field1414;
                boolean var44 = field825;
                class298 var45 = Statics.field3380;
                Statics.field3572 = var42;
                Statics.field304 = var43;
                Statics.field3573 = var44;
                Statics.field1198 = Statics.field3572.method4172(10);
                Statics.field658 = var45;
                class258 var46 = Statics.field1551;
                class258 var47 = Statics.field1006;
                class258 var48 = Statics.field2108;
                Statics.field3685 = var46;
                Statics.field3680 = var47;
                Statics.field3686 = var48;
                class266.method1777(Statics.field1551, Statics.field1414);
                class258 var49 = Statics.field1551;
                Statics.field293 = var49;
                class262.method567(Statics.field1551);
                class237.method264(Statics.field604, Statics.field1414, Statics.field776, Statics.field13);
                class258 var50 = Statics.field1551;
                Statics.field3385 = var50;
                class274.method1916(Statics.field1551);
                class264.method1751(Statics.field1551);
                Statics.method99(Statics.field1551);
                class272.method252(Statics.field1551);
                Statics.field684 = new class94();
                class258 var51 = Statics.field1551;
                class258 var52 = Statics.field776;
                class258 var53 = Statics.field13;
                Statics.field3516 = var51;
                Statics.field3502 = var52;
                Statics.field3498 = var53;
                class258 var54 = Statics.field1551;
                class258 var55 = Statics.field776;
                Statics.field3469 = var54;
                Statics.field3455 = var55;
                class263.method3082(Statics.field1551, Statics.field776);
                class90.field1314 = class246.field2996;
                class90.field1306 = 60;
                field848 = 80;
            } else {
                class90.field1314 = class246.field2995 + Statics.field1551.method4276() + "%";
                class90.field1306 = 60;
            }
        } else if (field848 == 80) {
            int var56 = 0;
            if (Statics.field294 == null) {
                Statics.field294 = class324.method4145(Statics.field776, "compass", "");
            } else {
                var56++;
            }
            if (Statics.field477 == null) {
                Statics.field477 = class324.method4145(Statics.field776, "mapedge", "");
            } else {
                var56++;
            }
            if (Statics.field15 == null) {
                Statics.field15 = class324.method3228(Statics.field776, "mapscene", "");
            } else {
                var56++;
            }
            if (Statics.field739 == null) {
                Statics.field739 = class324.method4575(Statics.field776, "headicons_pk", "");
            } else {
                var56++;
            }
            if (Statics.field2143 == null) {
                Statics.field2143 = class324.method4575(Statics.field776, "headicons_prayer", "");
            } else {
                var56++;
            }
            if (Statics.field2010 == null) {
                Statics.field2010 = class324.method4575(Statics.field776, "headicons_hint", "");
            } else {
                var56++;
            }
            if (Statics.field459 == null) {
                Statics.field459 = class324.method4575(Statics.field776, "mapmarker", "");
            } else {
                var56++;
            }
            if (Statics.field346 == null) {
                Statics.field346 = class324.method4575(Statics.field776, "cross", "");
            } else {
                var56++;
            }
            if (Statics.field3415 == null) {
                Statics.field3415 = class324.method4575(Statics.field776, "mapdots", "");
            } else {
                var56++;
            }
            if (Statics.field1648 == null) {
                Statics.field1648 = class324.method3228(Statics.field776, "scrollbar", "");
            } else {
                var56++;
            }
            if (Statics.field2587 == null) {
                Statics.field2587 = class324.method3228(Statics.field776, "mod_icons", "");
            } else {
                var56++;
            }
            if (var56 < 11) {
                class90.field1314 = class246.field3127 + var56 * 100 / 12 + "%";
                class90.field1306 = 70;
            } else {
                Statics.field3782 = Statics.field2587;
                Statics.field477.method5356();
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 41.0D) - 20;
                Statics.field15[0].method5311(var57 + var60, var58 + var60, var59 + var60);
                class90.field1314 = class246.field2998;
                class90.field1306 = 70;
                field848 = 90;
            }
        } else if (field848 == 90) {
            if (Statics.field714.method4191()) {
                Statics.field608 = new class123(Statics.field714, Statics.field776, 20, 0.8D, field826 ? 64 : 128);
                class134.method2597(Statics.field608);
                class134.method2611(0.8D);
                field848 = 100;
            } else {
                class90.field1314 = class246.field3128 + "0%";
                class90.field1306 = 90;
            }
        } else if (field848 == 100) {
            int var61 = Statics.field608.method2362();
            if (var61 < 100) {
                class90.field1314 = class246.field3128 + var61 + "%";
                class90.field1306 = 90;
            } else {
                class90.field1314 = class246.field3000;
                class90.field1306 = 90;
                field848 = 110;
            }
        } else if (field848 == 110) {
            Statics.field411 = new class69();
            Statics.field636.method2985(Statics.field411, 10);
            class90.field1314 = class246.field3117;
            class90.field1306 = 92;
            field848 = 120;
        } else if (field848 == 120) {
            if (Statics.field1275.method4181("huffman", "")) {
                class186 var62 = new class186(Statics.field1275.method4180("huffman", ""));
                class300.method221(var62);
                class90.field1314 = class246.field3055;
                class90.field1306 = 94;
                field848 = 130;
            } else {
                class90.field1314 = class246.field3002 + "%";
                class90.field1306 = 94;
            }
        } else if (field848 == 130) {
            if (!Statics.field604.method4191()) {
                class90.field1314 = class246.field3083 + Statics.field604.method4276() * 4 / 5 + "%";
                class90.field1306 = 96;
            } else if (!Statics.field1233.method4191()) {
                class90.field1314 = class246.field3083 + (80 + Statics.field1233.method4276() / 6) + "%";
                class90.field1306 = 96;
            } else if (Statics.field13.method4191()) {
                class90.field1314 = class246.field3005;
                class90.field1306 = 98;
                field848 = 140;
            } else {
                class90.field1314 = class246.field3083 + (96 + Statics.field13.method4276() / 50) + "%";
                class90.field1306 = 96;
            }
        } else if (field848 == 140) {
            class90.field1306 = 100;
            if (Statics.field467.method4182(class41.field498.field503)) {
                if (Statics.field251 == null) {
                    Statics.field251 = new class326();
                    Statics.field251.method5496(Statics.field467, Statics.field2093, field889, Statics.field15);
                }
                int var63 = Statics.field251.method5497();
                if (var63 < 100) {
                    class90.field1314 = class246.field3006 + (var63 * 9 / 10 + 10) + "%";
                } else {
                    class90.field1314 = class246.field3131;
                    field848 = 150;
                }
            } else {
                class90.field1314 = class246.field3006 + Statics.field467.method4184(class41.field498.field503) / 10 + "%";
            }
        } else if (field848 == 150) {
            method262(10);
        }
    }

    @ObfuscatedName("j.fr(IZZZI)Lia;")
    public static class258 method156(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class174 var4 = null;
        if (class167.field2167 != null) {
            var4 = new class174(arg0, class167.field2167, Statics.field2088[arg0], 1000000);
        }
        return new class258(var4, Statics.field2142, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fc(I)V")
    public final void method1139() {
        class169 var1 = field864.method1902();
        class200 var2 = field864.field1439;
        try {
            if (field853 == 0) {
                if (var1 != null) {
                    var1.method3020();
                    var1 = null;
                }
                Statics.field2492 = null;
                field866 = false;
                field854 = 0;
                field853 = 1;
            }
            if (field853 == 1) {
                if (Statics.field2492 == null) {
                    Statics.field2492 = Statics.field636.method2983(Statics.field500, Statics.field756);
                }
                if (Statics.field2492.field2154 == 2) {
                    throw new IOException();
                }
                if (Statics.field2492.field2154 == 1) {
                    if (field867) {
                        Socket var3 = (Socket) Statics.field2492.field2158;
                        class171 var4 = new class171(var3, 40000, 5000);
                        var1 = var4;
                    } else {
                        var1 = new class173((Socket) Statics.field2492.field2158, Statics.field636, 5000);
                    }
                    field864.method1887(var1);
                    Statics.field2492 = null;
                    field853 = 2;
                }
            }
            if (field853 == 2) {
                field864.method1885();
                class184 var5 = class184.method1513();
                var5.field2468.method3232(class182.field2437.field2439);
                field864.method1893(var5);
                field864.method1911();
                var2.field2538 = 0;
                field853 = 3;
            }
            if (field853 == 3) {
                if (Statics.field416 != null) {
                    Statics.field416.method2060();
                }
                if (Statics.field1289 != null) {
                    Statics.field1289.method2060();
                }
                boolean var6 = true;
                if (field867 && !var1.method3024(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method3014();
                    if (Statics.field416 != null) {
                        Statics.field416.method2060();
                    }
                    if (Statics.field1289 != null) {
                        Statics.field1289.method2060();
                    }
                    if (var7 != 0) {
                        method135(var7);
                        return;
                    }
                    var2.field2538 = 0;
                    field853 = 4;
                }
            }
            if (field853 == 4) {
                if (var2.field2538 < 8) {
                    int var8 = var1.method3028();
                    if (var8 > 8 - var2.field2538) {
                        var8 = 8 - var2.field2538;
                    }
                    if (var8 > 0) {
                        var1.method3031(var2.field2541, var2.field2538, var8);
                        var2.field2538 += var8;
                    }
                }
                if (var2.field2538 == 8) {
                    var2.field2538 = 0;
                    Statics.field1890 = var2.method3253();
                    field853 = 5;
                }
            }
            if (field853 == 5) {
                field864.field1439.field2538 = 0;
                field864.method1885();
                class200 var9 = new class200(500);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Statics.field1890 >> 32), (int) (Statics.field1890 & 0xFFFFFFFFFFFFFFFFL) };
                var9.field2538 = 0;
                var9.method3232(1);
                var9.method3232(field857.method12());
                var9.method3235(var10[0]);
                var9.method3235(var10[1]);
                var9.method3235(var10[2]);
                var9.method3235(var10[3]);
                switch(field857.field2115) {
                    case 0:
                        var9.field2538 += 8;
                        break;
                    case 1:
                    case 3:
                        var9.method3234(Statics.field254);
                        var9.field2538 += 5;
                        break;
                    case 2:
                        var9.method3235((Integer) Statics.field1072.field1187.get(class305.method4139(class90.field1320)));
                        var9.field2538 += 4;
                }
                var9.method3239(class90.field1299);
                var9.method3269(class88.field1293, class88.field1288);
                class184 var11 = class184.method1513();
                var11.field2468.field2538 = 0;
                if (field828 == 40) {
                    var11.field2468.method3232(class182.field2440.field2439);
                } else {
                    var11.field2468.method3232(class182.field2445.field2439);
                }
                var11.field2468.method3233(0);
                int var12 = var11.field2468.field2538;
                var11.field2468.method3235(164);
                var11.field2468.method3242(var9.field2541, 0, var9.field2538);
                int var13 = var11.field2468.field2538;
                var11.field2468.method3239(class90.field1320);
                var11.field2468.method3232((field971 ? 1 : 0) << 1 | (field826 ? 1 : 0));
                var11.field2468.method3233(Statics.field9);
                var11.field2468.method3233(Statics.field342);
                class200 var14 = var11.field2468;
                if (field858 == null) {
                    byte[] var15 = class167.method2923();
                    var14.method3242(var15, 0, var15.length);
                } else {
                    var14.method3242(field858, 0, field858.length);
                }
                var11.field2468.method3239(Statics.field542);
                var11.field2468.method3235(Statics.field513);
                class194 var16 = new class194(Statics.field718.method5688());
                Statics.field718.method5687(var16);
                var11.field2468.method3242(var16.field2541, 0, var16.field2541.length);
                var11.field2468.method3232(Statics.field3382);
                var11.field2468.method3235(0);
                var11.field2468.method3235(Statics.field1006.field3329);
                var11.field2468.method3235(Statics.field2108.field3329);
                var11.field2468.method3235(Statics.field1551.field3329);
                var11.field2468.method3235(Statics.field604.field3329);
                var11.field2468.method3235(Statics.field605.field3329);
                var11.field2468.method3235(Statics.field1412.field3329);
                var11.field2468.method3235(Statics.field2107.field3329);
                var11.field2468.method3235(Statics.field1414.field3329);
                var11.field2468.method3235(Statics.field776.field3329);
                var11.field2468.method3235(Statics.field714.field3329);
                var11.field2468.method3235(Statics.field1275.field3329);
                var11.field2468.method3235(Statics.field286.field3329);
                var11.field2468.method3235(Statics.field1233.field3329);
                var11.field2468.method3235(Statics.field13.field3329);
                var11.field2468.method3235(Statics.field2554.field3329);
                var11.field2468.method3235(Statics.field367.field3329);
                var11.field2468.method3235(Statics.field467.field3329);
                var11.field2468.method3443(var10, var13, var11.field2468.field2538);
                var11.field2468.method3355(var11.field2468.field2538 - var12);
                field864.method1893(var11);
                field864.method1911();
                field864.field1435 = new class201(var10);
                for (int var17 = 0; var17 < 4; var17++) {
                    var10[var17] += 50;
                }
                var2.method3519(var10);
                field853 = 6;
            }
            if (field853 == 6 && var1.method3028() > 0) {
                int var18 = var1.method3014();
                if (var18 == 21 && field828 == 20) {
                    field853 = 7;
                } else if (var18 == 2) {
                    field853 = 9;
                } else if (var18 == 15 && field828 == 40) {
                    field864.field1438 = -1;
                    field853 = 13;
                } else if (var18 == 23 && field862 < 1) {
                    field862++;
                    field853 = 0;
                } else if (var18 == 29) {
                    field853 = 11;
                } else {
                    method135(var18);
                    return;
                }
            }
            if (field853 == 7 && var1.method3028() > 0) {
                field1009 = (var1.method3014() + 3) * 60;
                field853 = 8;
            }
            if (field853 == 8) {
                field854 = 0;
                class90.method3494(class246.field3212, class246.field3012, field1009 / 60 + class246.field3013);
                if (--field1009 <= 0) {
                    field853 = 0;
                }
            } else {
                if (field853 == 9 && var1.method3028() >= 13) {
                    boolean var19 = var1.method3014() == 1;
                    var1.method3031(var2.field2541, 0, 4);
                    var2.field2538 = 0;
                    boolean var20 = false;
                    if (var19) {
                        int var21 = var2.method3522() << 24;
                        int var22 = var21 | var2.method3522() << 16;
                        int var23 = var22 | var2.method3522() << 8;
                        int var24 = var23 | var2.method3522();
                        int var25 = class305.method4139(class90.field1320);
                        if (Statics.field1072.field1187.size() >= 10 && !Statics.field1072.field1187.containsKey(var25)) {
                            Iterator var26 = Statics.field1072.field1187.entrySet().iterator();
                            var26.next();
                            var26.remove();
                        }
                        Statics.field1072.field1187.put(var25, var24);
                    }
                    if (class90.field1322) {
                        Statics.field1072.field1185 = class90.field1320;
                    } else {
                        Statics.field1072.field1185 = null;
                    }
                    class78.method2590();
                    field907 = var1.method3014();
                    field1028 = var1.method3014() == 1;
                    field924 = var1.method3014();
                    field924 <<= 0x8;
                    field924 += var1.method3014();
                    field1029 = var1.method3014();
                    var1.method3031(var2.field2541, 0, 1);
                    var2.field2538 = 0;
                    class180[] var27 = Statics.method1040();
                    int var28 = var2.method3524();
                    if (var28 < 0 || var28 >= var27.length) {
                        throw new IOException(var28 + " " + var2.field2538);
                    }
                    field864.field1437 = var27[var28];
                    field864.field1438 = field864.field1437.field2256;
                    var1.method3031(var2.field2541, 0, 2);
                    var2.field2538 = 0;
                    field864.field1438 = var2.method3249();
                    try {
                        client var29 = Statics.field3973;
                        JSObject.getWindow(var29).call("zap", (Object[]) null);
                    } catch (Throwable var36) {
                    }
                    field853 = 10;
                }
                if (field853 != 10) {
                    if (field853 == 11 && var1.method3028() >= 2) {
                        var2.field2538 = 0;
                        var1.method3031(var2.field2541, 0, 2);
                        var2.field2538 = 0;
                        Statics.field3304 = var2.method3249();
                        field853 = 12;
                    }
                    if (field853 == 12 && var1.method3028() >= Statics.field3304) {
                        var2.field2538 = 0;
                        var1.method3031(var2.field2541, 0, Statics.field3304);
                        var2.field2538 = 0;
                        String var31 = var2.method3256();
                        String var32 = var2.method3256();
                        String var33 = var2.method3256();
                        class90.method3494(var31, var32, var33);
                        method262(10);
                    }
                    if (field853 == 13) {
                        if (field864.field1438 == -1) {
                            if (var1.method3028() < 2) {
                                return;
                            }
                            var1.method3031(var2.field2541, 0, 2);
                            var2.field2538 = 0;
                            field864.field1438 = var2.method3249();
                        }
                        if (var1.method3028() >= field864.field1438) {
                            var1.method3031(var2.field2541, 0, field864.field1438);
                            var2.field2538 = 0;
                            int var34 = field864.field1438;
                            field913.method5166();
                            method1029();
                            class93.method555(var2);
                            if (var2.field2538 != var34) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field854++;
                        if (field854 > 2000) {
                            if (field862 < 1) {
                                if (Statics.field756 == Statics.field1218) {
                                    Statics.field756 = Statics.field18;
                                } else {
                                    Statics.field756 = Statics.field1218;
                                }
                                field862++;
                                field853 = 0;
                            } else {
                                method135(-3);
                            }
                        }
                    }
                } else if (var1.method3028() >= field864.field1438) {
                    var2.field2538 = 0;
                    var1.method3031(var2.field2541, 0, field864.field1438);
                    field913.method5147();
                    method500();
                    class93.method555(var2);
                    Statics.field2091 = -1;
                    method1047(false, var2);
                    field864.field1437 = null;
                }
            }
        } catch (IOException var37) {
            if (field862 < 1) {
                if (Statics.field756 == Statics.field1218) {
                    Statics.field756 = Statics.field18;
                } else {
                    Statics.field756 = Statics.field1218;
                }
                field862++;
                field853 = 0;
            } else {
                method135(-2);
            }
        }
    }

    @ObfuscatedName("ad.fk(I)V")
    public static void method500() {
        field1075 = -1L;
        field834 = -1;
        Statics.field411.field759 = 0;
        Statics.field2177 = true;
        field1019 = true;
        field910 = -1L;
        class318.method2840();
        field864.method1885();
        field864.field1439.field2538 = 0;
        field864.field1437 = null;
        field864.field1442 = null;
        field864.field1443 = null;
        field864.field1444 = null;
        field864.field1438 = 0;
        field864.field1440 = 0;
        field837 = 0;
        field865 = 0;
        field838 = 0;
        Statics.method4505();
        class60.method3820(0);
        class95.field1399.clear();
        class95.field1400.method3635();
        class95.field1398.method3800();
        class95.field1401 = 0;
        field836 = 0;
        field959 = false;
        field950 = 0;
        field887 = 0;
        field835 = 0;
        field1078 = -1;
        field1035 = 0;
        field940 = 0;
        field846 = class89.field1294;
        field847 = class89.field1294;
        field860 = 0;
        class93.method1841();
        for (int var0 = 0; var0 < 2048; var0++) {
            field923[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field859[var1] = null;
        }
        field973 = -1;
        field936.method3734();
        field937.method3734();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field888[var2][var3][var4] = null;
                }
            }
        }
        field1049 = new class214();
        Statics.field1278.method1589();
        for (int var5 = 0; var5 < Statics.field2567; var5++) {
            class262 var6 = Statics.method1500(var5);
            if (var6 != null) {
                class232.field2737[var5] = 0;
                class232.field2740[var5] = 0;
            }
        }
        Statics.field684.method1804();
        field997 = -1;
        if (field964 != -1) {
            class237.method748(field964);
        }
        for (class67 var7 = (class67) field986.method3677(); var7 != null; var7 = (class67) field986.method3678()) {
            method3502(var7, true);
        }
        field964 = -1;
        field986 = new class211(8);
        field931 = null;
        Statics.method4505();
        field1069.method4044((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field930[var8] = null;
            field868[var8] = false;
        }
        class65.field720 = new class211(32);
        field829 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field980[var9] = true;
        }
        method2139();
        Statics.field14 = null;
        for (int var10 = 0; var10 < 8; var10++) {
            field1073[var10] = new class17();
        }
        Statics.field10 = null;
    }

    @ObfuscatedName("bw.ff(B)V")
    public static void method1029() {
        field864.method1885();
        field864.field1439.field2538 = 0;
        field864.field1437 = null;
        field864.field1442 = null;
        field864.field1443 = null;
        field864.field1444 = null;
        field864.field1438 = 0;
        field864.field1440 = 0;
        field837 = 0;
        Statics.method4505();
        field835 = 0;
        field1035 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field923[var0] = null;
        }
        Statics.field818 = null;
        for (int var1 = 0; var1 < field859.length; var1++) {
            class84 var2 = field859[var1];
            if (var2 != null) {
                var2.field1139 = -1;
                var2.field1122 = false;
            }
        }
        class65.field720 = new class211(32);
        method262(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field980[var3] = true;
        }
        method2139();
    }

    @ObfuscatedName("x.fb(II)V")
    public static void method135(int arg0) {
        if (arg0 == -3) {
            class90.method3494(class246.field3014, class246.field3015, class246.field3016);
        } else if (arg0 == -2) {
            class90.method3494(class246.field3017, class246.field3018, class246.field3059);
        } else if (arg0 == -1) {
            class90.method3494(class246.field3020, class246.field3186, class246.field3022);
        } else if (arg0 == 3) {
            class90.field1318 = 3;
        } else if (arg0 == 4) {
            class90.method3494(class246.field3023, class246.field3024, class246.field3025);
        } else if (arg0 == 5) {
            class90.method3494(class246.field3026, class246.field3027, class246.field3107);
        } else if (arg0 == 6) {
            class90.method3494(class246.field3167, class246.field3030, class246.field2982);
        } else if (arg0 == 7) {
            class90.method3494(class246.field3032, class246.field3033, class246.field3034);
        } else if (arg0 == 8) {
            class90.method3494(class246.field3229, class246.field3036, class246.field3037);
        } else if (arg0 == 9) {
            class90.method3494(class246.field3038, class246.field3050, class246.field3040);
        } else if (arg0 == 10) {
            class90.method3494(class246.field3247, class246.field3073, class246.field3043);
        } else if (arg0 == 11) {
            class90.method3494(class246.field3069, class246.field3045, class246.field3046);
        } else if (arg0 == 12) {
            class90.method3494(class246.field3047, class246.field3048, class246.field3049);
        } else if (arg0 == 13) {
            class90.method3494(class246.field3021, class246.field3051, class246.field3096);
        } else if (arg0 == 14) {
            class90.method3494(class246.field3112, class246.field2999, class246.field3175);
        } else if (arg0 == 16) {
            class90.method3494(class246.field3056, class246.field3170, class246.field3058);
        } else if (arg0 == 17) {
            class90.method3494(class246.field3101, class246.field3060, class246.field3142);
        } else if (arg0 == 18) {
            class90.method3494(class246.field3062, class246.field3063, class246.field3041);
        } else if (arg0 == 19) {
            class90.method3494(class246.field3065, class246.field3066, class246.field3098);
        } else if (arg0 == 20) {
            class90.method3494(class246.field3068, class246.field3003, class246.field3239);
        } else if (arg0 == 22) {
            class90.method3494(class246.field3233, class246.field3072, class246.field3253);
        } else if (arg0 == 23) {
            class90.method3494(class246.field3061, class246.field3075, class246.field3133);
        } else if (arg0 == 24) {
            class90.method3494(class246.field3077, class246.field3078, class246.field3079);
        } else if (arg0 == 25) {
            class90.method3494(class246.field3080, class246.field3081, class246.field3082);
        } else if (arg0 == 26) {
            class90.method3494(class246.field3213, class246.field3084, class246.field3076);
        } else if (arg0 == 27) {
            class90.method3494(class246.field3086, class246.field3221, class246.field3165);
        } else if (arg0 == 31) {
            class90.method3494(class246.field3095, class246.field3250, class246.field3097);
        } else if (arg0 == 32) {
            class90.method3494(class246.field3028, class246.field3099, class246.field3108);
        } else if (arg0 == 37) {
            class90.method3494(class246.field3035, class246.field3102, class246.field3103);
        } else if (arg0 == 38) {
            class90.method3494(class246.field3104, class246.field3105, class246.field3106);
        } else if (arg0 == 55) {
            class90.method3494(class246.field3182, class246.field3143, class246.field3109);
        } else if (arg0 == 56) {
            class90.method3494(class246.field3110, class246.field3207, class246.field3010);
            method262(11);
            return;
        } else if (arg0 == 57) {
            class90.method3494(class246.field3113, class246.field3114, class246.field3115);
            method262(11);
            return;
        } else {
            class90.method3494(class246.field3116, class246.field3200, class246.field3118);
        }
        method262(10);
    }

    @ObfuscatedName("ed.fu(I)V")
    public static final void method2588() {
        field864.method1888();
        method3155();
        Statics.field2065.method2671();
        for (int var0 = 0; var0 < 4; var0++) {
            field875[var0].method3101();
        }
        System.gc();
        class224.method4151(2);
        field1016 = -1;
        field1040 = false;
        for (class80 var1 = (class80) class80.field1211.method3739(); var1 != null; var1 = (class80) class80.field1211.method3745()) {
            if (var1.field1202 != null) {
                Statics.field584.method1923(var1.field1202);
                var1.field1202 = null;
            }
            if (var1.field1214 != null) {
                Statics.field584.method1923(var1.field1214);
                var1.field1214 = null;
            }
        }
        class80.field1211.method3734();
        method262(10);
    }

    @ObfuscatedName("gr.fi(I)V")
    public static final void method3155() {
        class280.field3678.method3661();
        class267.field3437.method3661();
        class268.method2862();
        class276.method3154();
        class279.field3655.method3661();
        class279.field3656.method3661();
        class277.field3616.method3661();
        class277.field3575.method3661();
        class277.field3576.method3661();
        class281.method4120();
        Statics.method3083();
        class271.field3474.method3661();
        class262.method506();
        class275.method3038();
        class269.field3456.method3661();
        class269.field3457.method3661();
        class273.field3481.method3661();
        class272.field3475.method3661();
        class263.method2833();
        class234.field2755.method3661();
        class237.method3133();
        ((class123) Statics.field1913).method2368();
        class96.field1407.method3661();
        Statics.field1006.method4237();
        Statics.field2108.method4237();
        Statics.field604.method4237();
        Statics.field605.method4237();
        Statics.field1412.method4237();
        Statics.field2107.method4237();
        Statics.field1414.method4237();
        Statics.field776.method4237();
        Statics.field714.method4237();
        Statics.field1275.method4237();
        Statics.field286.method4237();
        Statics.field1233.method4237();
    }

    @ObfuscatedName("s.ft(ZI)V")
    public static final void method71(boolean arg0) {
        if (arg0) {
            field857 = class90.field1313 ? class158.field2116 : class158.field2114;
        } else {
            field857 = Statics.field1072.field1187.containsKey(class305.method4139(class90.field1320)) ? class158.field2118 : class158.field2120;
        }
    }

    @ObfuscatedName("client.fy(I)V")
    public final void method1140() {
        if (field837 > 1) {
            field837--;
        }
        if (field865 > 0) {
            field865--;
        }
        if (field866) {
            field866 = false;
            if (field865 > 0) {
                method2588();
            } else {
                field913.method5145();
                method262(40);
                Statics.field12 = field864.method1902();
                field864.method1889();
            }
            return;
        }
        if (!field942) {
            method31();
        }
        for (int var1 = 0; var1 < 100 && this.method1155(field864); var1++) {
        }
        if (field828 != 30) {
            return;
        }
        while (true) {
            class317 var2 = (class317) class318.field3873.method3696();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field913.field3844) {
                    class184 var6 = class184.method979(class181.field2401, field864.field1435);
                    var6.field2468.method3232(0);
                    int var7 = var6.field2468.field2538;
                    field913.method5150(var6.field2468);
                    var6.field2468.method3245(var6.field2468.field2538 - var7);
                    field864.method1893(var6);
                    field913.method5148();
                }
                Object var8 = Statics.field411.field758;
                synchronized (Statics.field411.field758) {
                    if (!field906) {
                        Statics.field411.field759 = 0;
                    } else if (class60.field673 != 0 || Statics.field411.field759 >= 40) {
                        class184 var9 = class184.method979(class181.field2404, field864.field1435);
                        var9.field2468.method3232(0);
                        int var10 = var9.field2468.field2538;
                        int var11 = 0;
                        for (int var12 = 0; var12 < Statics.field411.field759 && var9.field2468.field2538 - var10 < 240; var12++) {
                            var11++;
                            int var13 = Statics.field411.field761[var12];
                            if (var13 < 0) {
                                var13 = 0;
                            } else if (var13 > 502) {
                                var13 = 502;
                            }
                            int var14 = Statics.field411.field764[var12];
                            if (var14 < 0) {
                                var14 = 0;
                            } else if (var14 > 764) {
                                var14 = 764;
                            }
                            int var15 = var13 * 765 + var14;
                            if (Statics.field411.field761[var12] == -1 && Statics.field411.field764[var12] == -1) {
                                var14 = -1;
                                var13 = -1;
                                var15 = 524287;
                            }
                            if (field832 != var14 || field833 != var13) {
                                int var16 = var14 - field832;
                                field832 = var14;
                                int var17 = var13 - field833;
                                field833 = var13;
                                if (field834 < 8 && var16 >= -32 && var16 <= 31 && var17 >= -32 && var17 <= 31) {
                                    var16 += 32;
                                    var17 += 32;
                                    var9.field2468.method3233((field834 << 12) + (var16 << 6) + var17);
                                    field834 = 0;
                                } else if (field834 < 8) {
                                    var9.field2468.method3234((field834 << 19) + 8388608 + var15);
                                    field834 = 0;
                                } else {
                                    var9.field2468.method3235((field834 << 19) + -1073741824 + var15);
                                    field834 = 0;
                                }
                            } else if (field834 < 2047) {
                                field834++;
                            }
                        }
                        var9.field2468.method3245(var9.field2468.field2538 - var10);
                        field864.method1893(var9);
                        if (var11 >= Statics.field411.field759) {
                            Statics.field411.field759 = 0;
                        } else {
                            Statics.field411.field759 -= var11;
                            for (int var18 = 0; var18 < Statics.field411.field759; var18++) {
                                Statics.field411.field764[var18] = Statics.field411.field764[var11 + var18];
                                Statics.field411.field761[var18] = Statics.field411.field761[var11 + var18];
                            }
                        }
                    }
                }
                if (class60.field673 == 1 || !Statics.field333 && class60.field673 == 4 || class60.field673 == 2) {
                    long var20 = (class60.field667 - field1075) / 50L;
                    if (var20 > 4095L) {
                        var20 = 4095L;
                    }
                    field1075 = class60.field667;
                    int var22 = class60.field675;
                    if (var22 < 0) {
                        var22 = 0;
                    } else if (var22 > Statics.field342) {
                        var22 = Statics.field342;
                    }
                    int var23 = class60.field672;
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 > Statics.field9) {
                        var23 = Statics.field9;
                    }
                    int var24 = (int) var20;
                    class184 var25 = class184.method979(class181.field2416, field864.field1435);
                    var25.field2468.method3233((class60.field673 == 2 ? 1 : 0) + (var24 << 1));
                    var25.field2468.method3233(var23);
                    var25.field2468.method3233(var22);
                    field864.method1893(var25);
                }
                if (class51.field594 > 0) {
                    class184 var26 = class184.method979(class181.field2388, field864.field1435);
                    var26.field2468.method3233(0);
                    int var27 = var26.field2468.field2538;
                    long var28 = class196.method3211();
                    for (int var30 = 0; var30 < class51.field594; var30++) {
                        long var31 = var28 - field910;
                        if (var31 > 16777215L) {
                            var31 = 16777215L;
                        }
                        field910 = var28;
                        var26.field2468.method3274(class51.field586[var30]);
                        var26.field2468.method3234((int) var31);
                    }
                    var26.field2468.method3355(var26.field2468.field2538 - var27);
                    field864.method1893(var26);
                }
                if (field928 > 0) {
                    field928--;
                }
                if (class51.field593[96] || class51.field593[97] || class51.field593[98] || class51.field593[99]) {
                    field894 = true;
                }
                if (field894 && field928 <= 0) {
                    field928 = 20;
                    field894 = false;
                    class184 var33 = class184.method979(class181.field2341, field864.field1435);
                    var33.field2468.method3233(field886);
                    var33.field2468.method3341(field887);
                    field864.method1893(var33);
                }
                if (Statics.field2177 && !field1019) {
                    field1019 = true;
                    class184 var34 = class184.method979(class181.field2392, field864.field1435);
                    var34.field2468.method3232(1);
                    field864.method1893(var34);
                }
                if (!Statics.field2177 && field1019) {
                    field1019 = false;
                    class184 var35 = class184.method979(class181.field2392, field864.field1435);
                    var35.field2468.method3232(0);
                    field864.method1893(var35);
                }
                method3557();
                if (Statics.field2735 != field1078) {
                    field1078 = Statics.field2735;
                    method2098(Statics.field2735);
                }
                if (field828 != 30) {
                    return;
                }
                for (class74 var36 = (class74) field1049.method3739(); var36 != null; var36 = (class74) field1049.method3745()) {
                    if (var36.field1094 > 0) {
                        var36.field1094--;
                    }
                    if (var36.field1094 != 0) {
                        if (var36.field1081 > 0) {
                            var36.field1081--;
                        }
                        if (var36.field1081 == 0 && var36.field1083 >= 1 && var36.field1084 >= 1 && var36.field1083 <= 102 && var36.field1084 <= 102 && (var36.field1088 < 0 || class62.method4016(var36.field1088, var36.field1085))) {
                            method101(var36.field1092, var36.field1090, var36.field1083, var36.field1084, var36.field1088, var36.field1089, var36.field1085);
                            var36.field1081 = -1;
                            if (var36.field1091 == var36.field1088 && var36.field1091 == -1) {
                                var36.method3726();
                            } else if (var36.field1091 == var36.field1088 && var36.field1089 == var36.field1086 && var36.field1087 == var36.field1085) {
                                var36.method3726();
                            }
                        }
                    } else if (var36.field1091 < 0 || class62.method4016(var36.field1091, var36.field1087)) {
                        method101(var36.field1092, var36.field1090, var36.field1083, var36.field1084, var36.field1091, var36.field1086, var36.field1087);
                        var36.method3726();
                    }
                }
                method3013();
                field864.field1440++;
                if (field864.field1440 > 750) {
                    if (field865 > 0) {
                        method2588();
                    } else {
                        field913.method5145();
                        method262(40);
                        Statics.field12 = field864.method1902();
                        field864.method1889();
                    }
                    return;
                }
                method2858();
                method3576();
                method2138();
                field879++;
                if (field1070 != 0) {
                    field912 += 20;
                    if (field912 >= 400) {
                        field1070 = 0;
                    }
                }
                if (Statics.field299 != null) {
                    field914++;
                    if (field914 >= 15) {
                        method1035(Statics.field299);
                        Statics.field299 = null;
                    }
                }
                class237 var37 = Statics.field1390;
                class237 var38 = Statics.field259;
                Statics.field1390 = null;
                Statics.field259 = null;
                field981 = null;
                field985 = false;
                field979 = false;
                field1026 = 0;
                while (class51.method635() && field1026 < 128) {
                    if (field907 >= 2 && class51.field593[82] && Statics.field1564 == 66) {
                        String var39 = "";
                        Iterator var40 = class95.field1400.iterator();
                        while (var40.hasNext()) {
                            class70 var41 = (class70) var40.next();
                            var39 = var39 + var41.field768 + ':' + var41.field769 + '\n';
                        }
                        Statics.field3973.method769(var39);
                    } else {
                        field957[field1026] = Statics.field1564;
                        field897[field1026] = Statics.field30;
                        field1026++;
                    }
                }
                boolean var44 = field907 >= 2;
                if (var44 && class51.field593[82] && class51.field593[81] && field1003 != 0) {
                    int var45 = Statics.field818.field803 - field1003;
                    if (var45 < 0) {
                        var45 = 0;
                    } else if (var45 > 3) {
                        var45 = 3;
                    }
                    if (Statics.field818.field803 != var45) {
                        int var46 = Statics.field710 + Statics.field818.field1150[0];
                        int var47 = Statics.field401 + Statics.field818.field1151[0];
                        class184 var48 = class184.method979(class181.field2380, field864.field1435);
                        var48.field2468.method3281(var46);
                        var48.field2468.method3232(var45);
                        var48.field2468.method3341(var47);
                        field864.method1893(var48);
                    }
                    field1003 = 0;
                }
                if (field964 != -1) {
                    int var49 = field964;
                    int var50 = Statics.field9;
                    int var51 = Statics.field342;
                    if (class237.method1(var49)) {
                        method3207(Statics.field2770[var49], -1, 0, 0, var50, var51, 0, 0);
                    }
                }
                field989++;
                while (true) {
                    class68 var52;
                    class237 var53;
                    class237 var54;
                    do {
                        var52 = (class68) field993.method3737();
                        if (var52 == null) {
                            while (true) {
                                class68 var55;
                                class237 var56;
                                class237 var57;
                                do {
                                    var55 = (class68) field1050.method3737();
                                    if (var55 == null) {
                                        while (true) {
                                            class68 var58;
                                            class237 var59;
                                            class237 var60;
                                            do {
                                                var58 = (class68) field822.method3737();
                                                if (var58 == null) {
                                                    this.method1182();
                                                    method2101();
                                                    if (field977 != null) {
                                                        this.method1275();
                                                    }
                                                    if (Statics.field349 != null) {
                                                        method1035(Statics.field349);
                                                        field921++;
                                                        if (class60.field664 == 0) {
                                                            if (field920) {
                                                                if (Statics.field349 == Statics.field1553 && field935 != field919) {
                                                                    class237 var61 = Statics.field349;
                                                                    byte var62 = 0;
                                                                    if (field967 == 1 && var61.field2782 == 206) {
                                                                        var62 = 1;
                                                                    }
                                                                    if (var61.field2896[field919] <= 0) {
                                                                        var62 = 0;
                                                                    }
                                                                    if (class238.method967(method4010(var61))) {
                                                                        int var63 = field935;
                                                                        int var64 = field919;
                                                                        var61.field2896[var64] = var61.field2896[var63];
                                                                        var61.field2891[var64] = var61.field2891[var63];
                                                                        var61.field2896[var63] = -1;
                                                                        var61.field2891[var63] = 0;
                                                                    } else if (var62 == 1) {
                                                                        int var65 = field935;
                                                                        int var66 = field919;
                                                                        while (var65 != var66) {
                                                                            if (var65 > var66) {
                                                                                var61.method4090(var65 - 1, var65);
                                                                                var65--;
                                                                            } else if (var65 < var66) {
                                                                                var61.method4090(var65 + 1, var65);
                                                                                var65++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var61.method4090(field919, field935);
                                                                    }
                                                                    class184 var67 = class184.method979(class181.field2422, field864.field1435);
                                                                    var67.field2468.method3274(var62);
                                                                    var67.field2468.method3341(field935);
                                                                    var67.field2468.method3235(Statics.field349.field2795);
                                                                    var67.field2468.method3341(field919);
                                                                    field864.method1893(var67);
                                                                }
                                                            } else if (this.method1145()) {
                                                                this.method1146(field917, field918);
                                                            } else if (field943 > 0) {
                                                                method5142(field917, field918);
                                                            }
                                                            field914 = 10;
                                                            class60.field673 = 0;
                                                            Statics.field349 = null;
                                                        } else if (field921 >= 5 && (class60.field670 > field917 + 5 || class60.field670 < field917 - 5 || class60.field668 > field918 + 5 || class60.field668 < field918 - 5)) {
                                                            field920 = true;
                                                        }
                                                    }
                                                    if (class137.method2710()) {
                                                        int var68 = class137.field1967;
                                                        int var69 = class137.field1968;
                                                        class184 var70 = class184.method979(class181.field2395, field864.field1435);
                                                        var70.field2468.method3232(5);
                                                        var70.field2468.method3284(Statics.field710 + var68);
                                                        var70.field2468.method3272(class51.field593[82] ? (class51.field593[81] ? 2 : 1) : 0);
                                                        var70.field2468.method3284(Statics.field401 + var69);
                                                        field864.method1893(var70);
                                                        class137.method2711();
                                                        field905 = class60.field672;
                                                        field911 = class60.field675;
                                                        field1070 = 1;
                                                        field912 = 0;
                                                        field1035 = var68;
                                                        field940 = var69;
                                                    }
                                                    if (Statics.field1390 != var37) {
                                                        if (var37 != null) {
                                                            method1035(var37);
                                                        }
                                                        if (Statics.field1390 != null) {
                                                            method1035(Statics.field1390);
                                                        }
                                                    }
                                                    if (Statics.field259 != var38 && field934 == field880) {
                                                        if (var38 != null) {
                                                            method1035(var38);
                                                        }
                                                        if (Statics.field259 != null) {
                                                            method1035(Statics.field259);
                                                        }
                                                    }
                                                    if (Statics.field259 == null) {
                                                        if (field934 > 0) {
                                                            field934--;
                                                        }
                                                    } else if (field934 < field880) {
                                                        field934++;
                                                        if (field934 == field880) {
                                                            method1035(Statics.field259);
                                                        }
                                                    }
                                                    int var71 = Statics.field818.field1133;
                                                    int var72 = Statics.field818.field1096;
                                                    if (Statics.field2565 - var71 < -500 || Statics.field2565 - var71 > 500 || Statics.field26 - var72 < -500 || Statics.field26 - var72 > 500) {
                                                        Statics.field2565 = var71;
                                                        Statics.field26 = var72;
                                                    }
                                                    if (Statics.field2565 != var71) {
                                                        Statics.field2565 += (var71 - Statics.field2565) / 16;
                                                    }
                                                    if (Statics.field26 != var72) {
                                                        Statics.field26 += (var72 - Statics.field26) / 16;
                                                    }
                                                    if (class60.field664 == 4 && Statics.field333) {
                                                        int var73 = class60.field668 - field891;
                                                        field945 = var73 * 2;
                                                        field891 = var73 == -1 || var73 == 1 ? class60.field668 : (field891 + class60.field668) / 2;
                                                        int var74 = field1012 - class60.field670;
                                                        field965 = var74 * 2;
                                                        field1012 = var74 == -1 || var74 == 1 ? class60.field670 : (field1012 + class60.field670) / 2;
                                                    } else {
                                                        if (class51.field593[96]) {
                                                            field965 += (-24 - field965) / 2;
                                                        } else if (class51.field593[97]) {
                                                            field965 += (24 - field965) / 2;
                                                        } else {
                                                            field965 /= 2;
                                                        }
                                                        if (class51.field593[98]) {
                                                            field945 += (12 - field945) / 2;
                                                        } else if (class51.field593[99]) {
                                                            field945 += (-12 - field945) / 2;
                                                        } else {
                                                            field945 /= 2;
                                                        }
                                                        field891 = class60.field668;
                                                        field1012 = class60.field670;
                                                    }
                                                    field887 = field965 / 2 + field887 & 0x7FF;
                                                    field886 += field945 / 2;
                                                    if (field886 < 128) {
                                                        field886 = 128;
                                                    }
                                                    if (field886 > 383) {
                                                        field886 = 383;
                                                    }
                                                    int var75 = Statics.field2565 >> 7;
                                                    int var76 = Statics.field26 >> 7;
                                                    int var77 = method261(Statics.field2565, Statics.field26, Statics.field2735);
                                                    int var78 = 0;
                                                    if (var75 > 3 && var76 > 3 && var75 < 100 && var76 < 100) {
                                                        for (int var79 = var75 - 4; var79 <= var75 + 4; var79++) {
                                                            for (int var80 = var76 - 4; var80 <= var76 + 4; var80++) {
                                                                int var81 = Statics.field2735;
                                                                if (var81 < 3 && (class62.field698[1][var79][var80] & 0x2) == 2) {
                                                                    var81++;
                                                                }
                                                                int var82 = var77 - class62.field689[var81][var79][var80];
                                                                if (var82 > var78) {
                                                                    var78 = var82;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var83 = var78 * 192;
                                                    if (var83 > 98048) {
                                                        var83 = 98048;
                                                    }
                                                    if (var83 < 32768) {
                                                        var83 = 32768;
                                                    }
                                                    if (var83 > field895) {
                                                        field895 += (var83 - field895) / 24;
                                                    } else if (var83 < field895) {
                                                        field895 += (var83 - field895) / 80;
                                                    }
                                                    if (field984) {
                                                        method338();
                                                    }
                                                    for (int var84 = 0; var84 < 5; var84++) {
                                                        int var10002 = field1055[var84]++;
                                                    }
                                                    Statics.field684.method1808();
                                                    int var85 = class60.method1722();
                                                    int var86 = class51.method266();
                                                    if (var85 > 15000 && var86 > 15000) {
                                                        field865 = 250;
                                                        class60.method3820(14500);
                                                        class184 var87 = class184.method979(class181.field2412, field864.field1435);
                                                        field864.method1893(var87);
                                                    }
                                                    Statics.field1278.method1578();
                                                    field864.field1441++;
                                                    if (field864.field1441 > 50) {
                                                        class184 var88 = class184.method979(class181.field2386, field864.field1435);
                                                        field864.method1893(var88);
                                                    }
                                                    try {
                                                        field864.method1911();
                                                    } catch (IOException var90) {
                                                        if (field865 > 0) {
                                                            method2588();
                                                        } else {
                                                            field913.method5145();
                                                            method262(40);
                                                            Statics.field12 = field864.method1902();
                                                            field864.method1889();
                                                        }
                                                    }
                                                    return;
                                                }
                                                var59 = var58.field749;
                                                if (var59.field2769 < 0) {
                                                    break;
                                                }
                                                var60 = class237.method1884(var59.field2807);
                                            } while (var60 == null || var60.field2863 == null || var59.field2769 >= var60.field2863.length || var60.field2863[var59.field2769] != var59);
                                            class81.method3491(var58);
                                        }
                                    }
                                    var56 = var55.field749;
                                    if (var56.field2769 < 0) {
                                        break;
                                    }
                                    var57 = class237.method1884(var56.field2807);
                                } while (var57 == null || var57.field2863 == null || var56.field2769 >= var57.field2863.length || var57.field2863[var56.field2769] != var56);
                                class81.method3491(var55);
                            }
                        }
                        var53 = var52.field749;
                        if (var53.field2769 < 0) {
                            break;
                        }
                        var54 = class237.method1884(var53.field2807);
                    } while (var54 == null || var54.field2863 == null || var53.field2769 >= var54.field2863.length || var54.field2863[var53.field2769] != var53);
                    class81.method3491(var52);
                }
            }
            class184 var4 = class184.method979(class181.field2434, field864.field1435);
            var4.field2468.method3232(0);
            int var5 = var4.field2468.field2538;
            class318.method1013(var4.field2468);
            var4.field2468.method3245(var4.field2468.field2538 - var5);
            field864.method1893(var4);
        }
    }

    @ObfuscatedName("at.fx(B)V")
    public static final void method604() {
        if (Statics.field1289 != null) {
            Statics.field1289.method2054();
        }
        if (Statics.field416 != null) {
            Statics.field416.method2054();
        }
    }

    @ObfuscatedName("fb.fv(I)V")
    public static final void method3013() {
        for (int var0 = 0; var0 < field950; var0++) {
            int var10002 = field1046[var0]--;
            if (field1046[var0] >= -10) {
                class103 var2 = field1048[var0];
                if (var2 == null) {
                    class103 var10000 = (class103) null;
                    var2 = class103.method1985(Statics.field605, field1044[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field1046[var0] += var2.method1976();
                    field1048[var0] = var2;
                }
                if (field1046[var0] < 0) {
                    int var9;
                    if (field1047[var0] == 0) {
                        var9 = field1041;
                    } else {
                        int var3 = (field1047[var0] & 0xFF) * 128;
                        int var4 = field1047[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field818.field1133;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field1047[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field818.field1096;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field1046[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field1042 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class105 var10 = var2.method1975().method2029(Statics.field2566);
                        class115 var11 = class115.method2143(var10, 100, var9);
                        var11.method2146(field1045[var0] - 1);
                        Statics.field584.method1918(var11);
                    }
                    field1046[var0] = -100;
                }
            } else {
                field950--;
                for (int var1 = var0; var1 < field950; var1++) {
                    field1044[var1] = field1044[var1 + 1];
                    field1048[var1] = field1048[var1 + 1];
                    field1045[var1] = field1045[var1 + 1];
                    field1046[var1] = field1046[var1 + 1];
                    field1047[var1] = field1047[var1 + 1];
                }
                var0--;
            }
        }
        if (!field1040) {
            return;
        }
        boolean var12;
        if (class224.field2647 == 0) {
            var12 = Statics.field2106.method3855();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field972 != 0 && field1016 != -1) {
                class224.method2898(Statics.field2107, field1016, 0, field972, false);
            }
            field1040 = false;
        }
    }

    @ObfuscatedName("il.fn(Ljo;IIII)V")
    public static void method4143(class281 arg0, int arg1, int arg2, int arg3) {
        if (field950 >= 50 || field1042 == 0 || arg0.field3687 == null || arg1 >= arg0.field3687.length) {
            return;
        }
        int var4 = arg0.field3687[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field1044[field950] = var5;
        field1045[field950] = var6;
        field1046[field950] = 0;
        field1048[field950] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field1047[field950] = (var8 << 16) + (var9 << 8) + var7;
        field950++;
    }

    @ObfuscatedName("j.fp(II)V")
    public static void method157(int arg0) {
        if (arg0 == -1 && !field1040) {
            Statics.field2106.method3828();
            class224.field2647 = 1;
            Statics.field2472 = null;
        } else if (arg0 != -1 && field1016 != arg0 && field972 != 0 && !field1040) {
            class258 var1 = Statics.field2107;
            int var2 = field972;
            class224.field2647 = 1;
            Statics.field2472 = var1;
            Statics.field2649 = arg0;
            Statics.field1659 = 0;
            Statics.field2646 = var2;
            Statics.field2648 = false;
            Statics.field1889 = 2;
        }
        field1016 = arg0;
    }

    @ObfuscatedName("h.fq(III)V")
    public static void method13(int arg0, int arg1) {
        if (field972 != 0 && arg0 != -1) {
            class224.method2898(Statics.field286, arg0, 0, field972, false);
            field1040 = true;
        }
    }

    @ObfuscatedName("go.fm(I)V")
    public static final void method3557() {
        if (!Statics.field1925) {
            return;
        }
        if (Statics.field14 != null) {
            Statics.field14.method4838();
        }
        for (int var0 = 0; var0 < class93.field1372; var0++) {
            class72 var1 = field923[class93.field1377[var0]];
            var1.method1089();
        }
        Statics.field1925 = false;
    }

    @ObfuscatedName("bs.fh(Lim;IIB)V")
    public static final void method1557(class237 arg0, int arg1, int arg2) {
        if (field835 != 0 && field835 != 3 || class60.field673 != 1 && Statics.field333 || class60.field673 != 4) {
            return;
        }
        class231 var3 = arg0.method4081(true);
        if (var3 == null) {
            return;
        }
        int var4 = class60.field672 - arg1;
        int var5 = class60.field675 - arg2;
        if (!var3.method4014(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2733 / 2;
        int var7 = var5 - var3.field2731 / 2;
        int var8 = field887 & 0x7FF;
        int var9 = class134.field1902[var8];
        int var10 = class134.field1917[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field818.field1133 + var11 >> 7;
        int var14 = Statics.field818.field1096 - var12 >> 7;
        class184 var15 = class184.method979(class181.field2428, field864.field1435);
        var15.field2468.method3232(18);
        var15.field2468.method3284(Statics.field710 + var13);
        var15.field2468.method3272(class51.field593[82] ? (class51.field593[81] ? 2 : 1) : 0);
        var15.field2468.method3284(Statics.field401 + var14);
        var15.field2468.method3232(var6);
        var15.field2468.method3232(var7);
        var15.field2468.method3233(field887);
        var15.field2468.method3232(57);
        var15.field2468.method3232(0);
        var15.field2468.method3232(0);
        var15.field2468.method3232(89);
        var15.field2468.method3233(Statics.field818.field1133);
        var15.field2468.method3233(Statics.field818.field1096);
        var15.field2468.method3232(63);
        field864.method1893(var15);
        field1035 = var13;
        field940 = var14;
    }

    @ObfuscatedName("dl.fz(B)V")
    public static final void method2138() {
        int[] var0 = class93.field1377;
        for (int var1 = 0; var1 < class93.field1372; var1++) {
            class72 var2 = field923[var0[var1]];
            if (var2 != null && var2.field1111 > 0) {
                var2.field1111--;
                if (var2.field1111 == 0) {
                    var2.field1147 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field860; var3++) {
            int var4 = field840[var3];
            class84 var5 = field859[var4];
            if (var5 != null && var5.field1111 > 0) {
                var5.field1111--;
                if (var5.field1111 == 0) {
                    var5.field1147 = null;
                }
            }
        }
    }

    @ObfuscatedName("cl.fw(Ljava/lang/String;I)V")
    public static final void method1728(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1072.field1182 = !Statics.field1072.field1182;
            class78.method2590();
            if (Statics.field1072.field1182) {
                class95.method2873(99, "", "Roofs are now all hidden");
            } else {
                class95.method2873(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field916 = !field916;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field926 = !field926;
        }
        if (field907 >= 2) {
            if (arg0.equalsIgnoreCase("aabb")) {
                if (!class8.field230) {
                    class8.field230 = true;
                    class8.field223 = class12.field253;
                } else if (class8.field223 == class12.field253) {
                    class8.field230 = true;
                    class8.field223 = class12.field256;
                } else {
                    class8.field230 = false;
                }
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field916 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field916 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field865 > 0) {
                    method2588();
                } else {
                    field913.method5145();
                    method262(40);
                    Statics.field12 = field864.method1902();
                    field864.method1889();
                }
            }
            if (arg0.equalsIgnoreCase("cs")) {
                class95.method2873(99, "", "" + field867);
            }
            if (arg0.equalsIgnoreCase("errortest") && field824 == 2) {
                throw new RuntimeException();
            }
        }
        class184 var1 = class184.method979(class181.field2430, field864.field1435);
        var1.field2468.method3232(arg0.length() + 1);
        var1.field2468.method3239(arg0);
        field864.method1893(var1);
    }

    @ObfuscatedName("aq.fe(I)V")
    public static final void method338() {
        int var0 = Statics.field2117 * 128 + 64;
        int var1 = Statics.field1039 * 128 + 64;
        int var2 = method261(var0, var1, Statics.field2735) - Statics.field2651;
        if (Statics.field490 < var0) {
            Statics.field490 += Statics.field1426 * (var0 - Statics.field490) / 1000 + Statics.field1413;
            if (Statics.field490 > var0) {
                Statics.field490 = var0;
            }
        }
        if (Statics.field490 > var0) {
            Statics.field490 -= Statics.field1426 * (Statics.field490 - var0) / 1000 + Statics.field1413;
            if (Statics.field490 < var0) {
                Statics.field490 = var0;
            }
        }
        if (Statics.field2124 < var2) {
            Statics.field2124 += Statics.field1426 * (var2 - Statics.field2124) / 1000 + Statics.field1413;
            if (Statics.field2124 > var2) {
                Statics.field2124 = var2;
            }
        }
        if (Statics.field2124 > var2) {
            Statics.field2124 -= Statics.field1426 * (Statics.field2124 - var2) / 1000 + Statics.field1413;
            if (Statics.field2124 < var2) {
                Statics.field2124 = var2;
            }
        }
        if (Statics.field1155 < var1) {
            Statics.field1155 += Statics.field1426 * (var1 - Statics.field1155) / 1000 + Statics.field1413;
            if (Statics.field1155 > var1) {
                Statics.field1155 = var1;
            }
        }
        if (Statics.field1155 > var1) {
            Statics.field1155 -= Statics.field1426 * (Statics.field1155 - var1) / 1000 + Statics.field1413;
            if (Statics.field1155 < var1) {
                Statics.field1155 = var1;
            }
        }
        int var3 = Statics.field1880 * 128 + 64;
        int var4 = Statics.field3805 * 128 + 64;
        int var5 = method261(var3, var4, Statics.field2735) - Statics.field1525;
        int var6 = var3 - Statics.field490;
        int var7 = var5 - Statics.field2124;
        int var8 = var4 - Statics.field1155;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2047 < var10) {
            Statics.field2047 += Statics.field760 * (var10 - Statics.field2047) / 1000 + Statics.field436;
            if (Statics.field2047 > var10) {
                Statics.field2047 = var10;
            }
        }
        if (Statics.field2047 > var10) {
            Statics.field2047 -= Statics.field760 * (Statics.field2047 - var10) / 1000 + Statics.field436;
            if (Statics.field2047 < var10) {
                Statics.field2047 = var10;
            }
        }
        int var12 = var11 - Statics.field683;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field683 += Statics.field760 * var12 / 1000 + Statics.field436;
            Statics.field683 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field683 -= Statics.field760 * -var12 / 1000 + Statics.field436;
            Statics.field683 &= 0x7FF;
        }
        int var13 = var11 - Statics.field683;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field683 = var11;
        }
    }

    @ObfuscatedName("ec.fd(B)V")
    public static final void method2858() {
        int var0 = class93.field1372;
        int[] var1 = class93.field1377;
        for (int var2 = 0; var2 < var0; var2++) {
            class72 var3 = field923[var1[var2]];
            if (var3 != null) {
                method2587(var3, 1);
            }
        }
    }

    @ObfuscatedName("gg.gt(B)V")
    public static final void method3576() {
        for (int var0 = 0; var0 < field860; var0++) {
            int var1 = field840[var0];
            class84 var2 = field859[var1];
            if (var2 != null) {
                method2587(var2, var2.field1253.field3662);
            }
        }
    }

    @ObfuscatedName("ex.gc(Lbq;II)V")
    public static final void method2587(class75 arg0, int arg1) {
        if (arg0.field1141 > field830) {
            method713(arg0);
        } else if (arg0.field1142 >= field830) {
            if (field830 == arg0.field1142 || arg0.field1127 == -1 || arg0.field1130 != 0 || arg0.field1134 + 1 > class281.method2838(arg0.field1127).field3693[arg0.field1128]) {
                int var2 = arg0.field1142 - arg0.field1141;
                int var3 = field830 - arg0.field1141;
                int var4 = arg0.field1137 * 128 + arg0.field1099 * 64;
                int var5 = arg0.field1109 * 128 + arg0.field1099 * 64;
                int var6 = arg0.field1138 * 128 + arg0.field1099 * 64;
                int var7 = arg0.field1120 * 128 + arg0.field1099 * 64;
                arg0.field1133 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field1096 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field1129 = 0;
            arg0.field1146 = arg0.field1143;
            arg0.field1117 = arg0.field1146;
        } else {
            arg0.field1124 = arg0.field1097;
            if (arg0.field1149 == 0) {
                arg0.field1129 = 0;
            } else {
                label334: {
                    if (arg0.field1127 != -1 && arg0.field1130 == 0) {
                        class281 var8 = class281.method2838(arg0.field1127);
                        if (arg0.field1154 > 0 && var8.field3695 == 0) {
                            arg0.field1129++;
                            break label334;
                        }
                        if (arg0.field1154 <= 0 && var8.field3696 == 0) {
                            arg0.field1129++;
                            break label334;
                        }
                    }
                    int var9 = arg0.field1133;
                    int var10 = arg0.field1096;
                    int var11 = arg0.field1150[arg0.field1149 - 1] * 128 + arg0.field1099 * 64;
                    int var12 = arg0.field1151[arg0.field1149 - 1] * 128 + arg0.field1099 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field1146 = 1280;
                        } else if (var10 > var12) {
                            arg0.field1146 = 1792;
                        } else {
                            arg0.field1146 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field1146 = 768;
                        } else if (var10 > var12) {
                            arg0.field1146 = 256;
                        } else {
                            arg0.field1146 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field1146 = 1024;
                    } else if (var10 > var12) {
                        arg0.field1146 = 0;
                    }
                    byte var13 = arg0.field1153[arg0.field1149 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field1146 - arg0.field1117 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field1100;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field1103;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field1106;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field1131;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field1103;
                        }
                        arg0.field1124 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class84) {
                            var17 = ((class84) arg0).field1253.field3659;
                        }
                        if (var17) {
                            if (arg0.field1146 != arg0.field1117 && arg0.field1139 == -1 && arg0.field1148 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field1149 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field1149 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field1129 > 0 && arg0.field1149 > 1) {
                                var16 = 8;
                                arg0.field1129--;
                            }
                        } else {
                            if (arg0.field1149 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field1149 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field1129 > 0 && arg0.field1149 > 1) {
                                var16 = 8;
                                arg0.field1129--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field1124 == arg0.field1103 && arg0.field1107 != -1) {
                            arg0.field1124 = arg0.field1107;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field1133 += var16;
                                if (arg0.field1133 > var11) {
                                    arg0.field1133 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field1133 -= var16;
                                if (arg0.field1133 < var11) {
                                    arg0.field1133 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field1096 += var16;
                                if (arg0.field1096 > var12) {
                                    arg0.field1096 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field1096 -= var16;
                                if (arg0.field1096 < var12) {
                                    arg0.field1096 = var12;
                                }
                            }
                        }
                        if (arg0.field1133 == var11 && arg0.field1096 == var12) {
                            arg0.field1149--;
                            if (arg0.field1154 > 0) {
                                arg0.field1154--;
                            }
                        }
                    } else {
                        arg0.field1133 = var11;
                        arg0.field1096 = var12;
                        arg0.field1149--;
                        if (arg0.field1154 > 0) {
                            arg0.field1154--;
                        }
                    }
                }
            }
        }
        if (arg0.field1133 < 128 || arg0.field1096 < 128 || arg0.field1133 >= 13184 || arg0.field1096 >= 13184) {
            arg0.field1127 = -1;
            arg0.field1108 = -1;
            arg0.field1141 = 0;
            arg0.field1142 = 0;
            arg0.field1133 = arg0.field1150[0] * 128 + arg0.field1099 * 64;
            arg0.field1096 = arg0.field1151[0] * 128 + arg0.field1099 * 64;
            arg0.method1502();
        }
        if (Statics.field818 == arg0 && (arg0.field1133 < 1536 || arg0.field1096 < 1536 || arg0.field1133 >= 11776 || arg0.field1096 >= 11776)) {
            arg0.field1127 = -1;
            arg0.field1108 = -1;
            arg0.field1141 = 0;
            arg0.field1142 = 0;
            arg0.field1133 = arg0.field1150[0] * 128 + arg0.field1099 * 64;
            arg0.field1096 = arg0.field1151[0] * 128 + arg0.field1099 * 64;
            arg0.method1502();
        }
        method2372(arg0);
        arg0.field1098 = false;
        if (arg0.field1124 != -1) {
            class281 var18 = class281.method2838(arg0.field1124);
            if (var18 == null || var18.field3684 == null) {
                arg0.field1124 = -1;
            } else {
                arg0.field1126++;
                if (arg0.field1125 < var18.field3684.length && arg0.field1126 > var18.field3693[arg0.field1125]) {
                    arg0.field1126 = 1;
                    arg0.field1125++;
                    method4143(var18, arg0.field1125, arg0.field1133, arg0.field1096);
                }
                if (arg0.field1125 >= var18.field3684.length) {
                    arg0.field1126 = 0;
                    arg0.field1125 = 0;
                    method4143(var18, arg0.field1125, arg0.field1133, arg0.field1096);
                }
            }
        }
        if (arg0.field1108 != -1 && field830 >= arg0.field1135) {
            if (arg0.field1105 < 0) {
                arg0.field1105 = 0;
            }
            int var19 = class266.method3059(arg0.field1108).field3426;
            if (var19 == -1) {
                arg0.field1108 = -1;
            } else {
                class281 var20 = class281.method2838(var19);
                if (var20 == null || var20.field3684 == null) {
                    arg0.field1108 = -1;
                } else {
                    arg0.field1145++;
                    if (arg0.field1105 < var20.field3684.length && arg0.field1145 > var20.field3693[arg0.field1105]) {
                        arg0.field1145 = 1;
                        arg0.field1105++;
                        method4143(var20, arg0.field1105, arg0.field1133, arg0.field1096);
                    }
                    if (arg0.field1105 >= var20.field3684.length && (arg0.field1105 < 0 || arg0.field1105 >= var20.field3684.length)) {
                        arg0.field1108 = -1;
                    }
                }
            }
        }
        if (arg0.field1127 != -1 && arg0.field1130 <= 1) {
            class281 var21 = class281.method2838(arg0.field1127);
            if (var21.field3695 == 1 && arg0.field1154 > 0 && arg0.field1141 <= field830 && arg0.field1142 < field830) {
                arg0.field1130 = 1;
                return;
            }
        }
        if (arg0.field1127 != -1 && arg0.field1130 == 0) {
            class281 var22 = class281.method2838(arg0.field1127);
            if (var22 == null || var22.field3684 == null) {
                arg0.field1127 = -1;
            } else {
                arg0.field1134++;
                if (arg0.field1128 < var22.field3684.length && arg0.field1134 > var22.field3693[arg0.field1128]) {
                    arg0.field1134 = 1;
                    arg0.field1128++;
                    method4143(var22, arg0.field1128, arg0.field1133, arg0.field1096);
                }
                if (arg0.field1128 >= var22.field3684.length) {
                    arg0.field1128 -= var22.field3688;
                    arg0.field1095++;
                    if (arg0.field1095 >= var22.field3694) {
                        arg0.field1127 = -1;
                    } else if (arg0.field1128 >= 0 && arg0.field1128 < var22.field3684.length) {
                        method4143(var22, arg0.field1128, arg0.field1133, arg0.field1096);
                    } else {
                        arg0.field1127 = -1;
                    }
                }
                arg0.field1098 = var22.field3690;
            }
        }
        if (arg0.field1130 > 0) {
            arg0.field1130--;
        }
    }

    @ObfuscatedName("bb.gr(Lbq;I)V")
    public static final void method713(class75 arg0) {
        int var1 = arg0.field1141 - field830;
        int var2 = arg0.field1137 * 128 + arg0.field1099 * 64;
        int var3 = arg0.field1109 * 128 + arg0.field1099 * 64;
        arg0.field1133 += (var2 - arg0.field1133) / var1;
        arg0.field1096 += (var3 - arg0.field1096) / var1;
        arg0.field1129 = 0;
        arg0.field1146 = arg0.field1143;
    }

    @ObfuscatedName("dk.gq(Lbq;I)V")
    public static final void method2372(class75 arg0) {
        if (arg0.field1148 == 0) {
            return;
        }
        if (arg0.field1139 != -1) {
            class75 var1 = null;
            if (arg0.field1139 < 32768) {
                var1 = field859[arg0.field1139];
            } else if (arg0.field1139 >= 32768) {
                var1 = field923[arg0.field1139 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1133 - var1.field1133;
                int var3 = arg0.field1096 - var1.field1096;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1146 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1122) {
                arg0.field1139 = -1;
                arg0.field1122 = false;
            }
        }
        if (arg0.field1123 != -1 && (arg0.field1149 == 0 || arg0.field1129 > 0)) {
            arg0.field1146 = arg0.field1123;
            arg0.field1123 = -1;
        }
        int var4 = arg0.field1146 - arg0.field1117 & 0x7FF;
        if (var4 == 0 && arg0.field1122) {
            arg0.field1139 = -1;
            arg0.field1122 = false;
        }
        if (var4 == 0) {
            arg0.field1121 = 0;
            return;
        }
        arg0.field1121++;
        if (var4 > 1024) {
            arg0.field1117 -= arg0.field1148;
            boolean var5 = true;
            if (var4 < arg0.field1148 || var4 > 2048 - arg0.field1148) {
                arg0.field1117 = arg0.field1146;
                var5 = false;
            }
            if (arg0.field1124 == arg0.field1097 && (arg0.field1121 > 25 || var5)) {
                if (arg0.field1101 == -1) {
                    arg0.field1124 = arg0.field1103;
                } else {
                    arg0.field1124 = arg0.field1101;
                }
            }
        } else {
            arg0.field1117 += arg0.field1148;
            boolean var6 = true;
            if (var4 < arg0.field1148 || var4 > 2048 - arg0.field1148) {
                arg0.field1117 = arg0.field1146;
                var6 = false;
            }
            if (arg0.field1124 == arg0.field1097 && (arg0.field1121 > 25 || var6)) {
                if (arg0.field1102 == -1) {
                    arg0.field1124 = arg0.field1103;
                } else {
                    arg0.field1124 = arg0.field1102;
                }
            }
        }
        arg0.field1117 &= 0x7FF;
    }

    @ObfuscatedName("dj.gj(I)V")
    public static void method2101() {
        if (Statics.field251 != null) {
            Statics.field251.method5505(Statics.field2735, (Statics.field818.field1133 >> 7) + Statics.field710, (Statics.field818.field1096 >> 7) + Statics.field401, false);
            Statics.field251.method5519();
        }
    }

    @ObfuscatedName("gc.gb(Lbl;III)V")
    public static void method3141(class72 arg0, int arg1, int arg2) {
        if (arg0.field1127 == arg1 && arg1 != -1) {
            int var3 = class281.method2838(arg1).field3697;
            if (var3 == 1) {
                arg0.field1128 = 0;
                arg0.field1134 = 0;
                arg0.field1130 = arg2;
                arg0.field1095 = 0;
            }
            if (var3 == 2) {
                arg0.field1095 = 0;
            }
        } else if (arg1 == -1 || arg0.field1127 == -1 || class281.method2838(arg1).field3691 >= class281.method2838(arg0.field1127).field3691) {
            arg0.field1127 = arg1;
            arg0.field1128 = 0;
            arg0.field1134 = 0;
            arg0.field1130 = arg2;
            arg0.field1095 = 0;
            arg0.field1154 = arg0.field1149;
        }
    }

    @ObfuscatedName("bn.gi(B)I")
    public static int method1082() {
        return field971 ? 2 : 1;
    }

    @ObfuscatedName("in.gs(II)V")
    public static void method4248(int arg0) {
        field1018 = 0L;
        if (arg0 >= 2) {
            field971 = true;
        } else {
            field971 = false;
        }
        if (method1082() == 1) {
            Statics.field3973.method765(765, 503);
        } else {
            Statics.field3973.method765(7680, 2160);
        }
        if (field828 >= 25) {
            method2139();
        }
    }

    @ObfuscatedName("dl.gy(I)V")
    public static void method2139() {
        class184 var0 = class184.method979(class181.field2347, field864.field1435);
        class200 var1 = var0.field2468;
        int var2 = field971 ? 2 : 1;
        var1.method3232(var2);
        var0.field2468.method3233(Statics.field9);
        var0.field2468.method3233(Statics.field342);
        field864.method1893(var0);
    }

    @ObfuscatedName("client.f(I)V")
    public final void method865() {
        field1018 = class196.method3211() + 500L;
        this.method1141();
        if (field964 != -1) {
            this.method1375(true);
        }
    }

    @ObfuscatedName("client.gx(B)V")
    public void method1141() {
        int var1 = Statics.field9;
        int var2 = Statics.field342;
        if (this.field653 < var1) {
            int var3 = this.field653;
        }
        if (this.field633 < var2) {
            int var4 = this.field633;
        }
        if (Statics.field1072 != null) {
            try {
                class53.method705(Statics.field3973, "resize", new Object[] { method1082() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.gl(I)V")
    public final void method1278() {
        if (field964 != -1) {
            method2832(field964);
        }
        for (int var1 = 0; var1 < field1008; var1++) {
            if (field980[var1]) {
                field821[var1] = true;
            }
            field1032[var1] = field980[var1];
            field980[var1] = false;
        }
        field878 = field830;
        field953 = -1;
        field954 = -1;
        Statics.field1553 = null;
        if (field964 != -1) {
            field1008 = 0;
            method4396(field964, 0, 0, Statics.field9, Statics.field342, 0, 0, -1);
        }
        class319.method5211();
        if (field942) {
            int var2 = Statics.field347;
            int var3 = Statics.field329;
            int var4 = Statics.field2173;
            int var5 = Statics.field232;
            int var6 = 6116423;
            class319.method5232(var2, var3, var4, var5, var6);
            class319.method5232(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class319.method5227(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field2093.method5003(class246.field3125, var2 + 3, var3 + 14, var6, -1);
            int var7 = class60.field670;
            int var8 = class60.field668;
            for (int var9 = 0; var9 < field943; var9++) {
                int var10 = (field943 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                Statics.field2093.method5003(method60(var9), var2 + 3, var10, var11, 0);
            }
            method1080(Statics.field347, Statics.field329, Statics.field2173, Statics.field232);
        } else if (field953 != -1) {
            method793(field953, field954);
        }
        if (field1027 == 3) {
            for (int var12 = 0; var12 < field1008; var12++) {
                if (field1032[var12]) {
                    class319.method5219(field1013[var12], field1030[var12], field1002[var12], field1057[var12], 16711935, 128);
                } else if (field821[var12]) {
                    class319.method5219(field1013[var12], field1030[var12], field1002[var12], field1057[var12], 16711680, 128);
                }
            }
        }
        int var13 = Statics.field2735;
        int var14 = Statics.field818.field1133;
        int var15 = Statics.field818.field1096;
        int var16 = field879;
        for (class80 var17 = (class80) class80.field1211.method3739(); var17 != null; var17 = (class80) class80.field1211.method3745()) {
            if (var17.field1208 != -1 || var17.field1212 != null) {
                int var18 = 0;
                if (var14 > var17.field1205) {
                    var18 += var14 - var17.field1205;
                } else if (var14 < var17.field1203) {
                    var18 += var17.field1203 - var14;
                }
                if (var15 > var17.field1209) {
                    var18 += var15 - var17.field1209;
                } else if (var15 < var17.field1204) {
                    var18 += var17.field1204 - var15;
                }
                if (var18 - 64 > var17.field1207 || field1042 == 0 || var17.field1206 != var13) {
                    if (var17.field1202 != null) {
                        Statics.field584.method1923(var17.field1202);
                        var17.field1202 = null;
                    }
                    if (var17.field1214 != null) {
                        Statics.field584.method1923(var17.field1214);
                        var17.field1214 = null;
                    }
                } else {
                    var18 -= 64;
                    if (var18 < 0) {
                        var18 = 0;
                    }
                    int var19 = field1042 * (var17.field1207 - var18) / var17.field1207;
                    class103 var10000;
                    if (var17.field1202 != null) {
                        var17.field1202.method2147(var19);
                    } else if (var17.field1208 >= 0) {
                        var10000 = (class103) null;
                        class103 var20 = class103.method1985(Statics.field605, var17.field1208, 0);
                        if (var20 != null) {
                            class105 var21 = var20.method1975().method2029(Statics.field2566);
                            class115 var22 = class115.method2143(var21, 100, var19);
                            var22.method2146(-1);
                            Statics.field584.method1918(var22);
                            var17.field1202 = var22;
                        }
                    }
                    if (var17.field1214 != null) {
                        var17.field1214.method2147(var19);
                        if (!var17.field1214.method3730()) {
                            var17.field1214 = null;
                        }
                    } else if (var17.field1212 != null && (var17.field1217 -= var16) <= 0) {
                        int var23 = (int) (Math.random() * (double) var17.field1212.length);
                        var10000 = (class103) null;
                        class103 var24 = class103.method1985(Statics.field605, var17.field1212[var23], 0);
                        if (var24 != null) {
                            class105 var25 = var24.method1975().method2029(Statics.field2566);
                            class115 var26 = class115.method2143(var25, 100, var19);
                            var26.method2146(0);
                            Statics.field584.method1918(var26);
                            var17.field1214 = var26;
                            var17.field1217 = var17.field1210 + (int) (Math.random() * (double) (var17.field1213 - var17.field1210));
                        }
                    }
                }
            }
        }
        field879 = 0;
    }

    @ObfuscatedName("iy.gn(Ljava/lang/String;ZI)V")
    public static final void method4068(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field3747.method5056(arg0, 250);
        int var6 = Statics.field3747.method5001(arg0, 250) * 13;
        class319.method5232(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class319.method5227(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field3747.method5007(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method4156(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field3926.method751(0, 0);
        } else {
            method1080(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("t.gf(Lbl;ZI)V")
    public static void method88(class72 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1096() || arg0.field802) {
            return;
        }
        int var2 = arg0.field809 << 14;
        arg0.field789 = false;
        if ((field826 && class93.field1372 > 50 || class93.field1372 > 200) && arg1 && arg0.field1124 == arg0.field1097) {
            arg0.field789 = true;
        }
        int var3 = arg0.field1133 >> 7;
        int var4 = arg0.field1096 >> 7;
        if (var3 < 0 || var3 >= 104 || var4 < 0 || var4 >= 104) {
            return;
        }
        if (arg0.field795 != null && field830 >= arg0.field790 && field830 < arg0.field791) {
            arg0.field789 = false;
            arg0.field798 = method261(arg0.field1133, arg0.field1096, Statics.field2735);
            Statics.field2065.method2683(Statics.field2735, arg0.field1133, arg0.field1096, arg0.field798, 60, arg0, arg0.field1117, var2, arg0.field782, arg0.field797, arg0.field785, arg0.field796);
            return;
        }
        if ((arg0.field1133 & 0x7F) == 64 && (arg0.field1096 & 0x7F) == 64) {
            if (field869 == field1058[var3][var4]) {
                return;
            }
            field1058[var3][var4] = field869;
        }
        arg0.field798 = method261(arg0.field1133, arg0.field1096, Statics.field2735);
        Statics.field2065.method2718(Statics.field2735, arg0.field1133, arg0.field1096, arg0.field798, 60, arg0, arg0.field1117, var2, arg0.field1098);
    }

    @ObfuscatedName("h.gm(ZI)V")
    public static final void method14(boolean arg0) {
        for (int var1 = 0; var1 < field860; var1++) {
            class84 var2 = field859[field840[var1]];
            int var3 = (field840[var1] << 14) + 536870912;
            if (var2 != null && var2.method1096() && var2.field1253.field3653 == arg0 && var2.field1253.method4672()) {
                int var4 = var2.field1133 >> 7;
                int var5 = var2.field1096 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field1099 == 1 && (var2.field1133 & 0x7F) == 64 && (var2.field1096 & 0x7F) == 64) {
                        if (field869 == field1058[var4][var5]) {
                            continue;
                        }
                        field1058[var4][var5] = field869;
                    }
                    if (!var2.field1253.field3661) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2065.method2718(Statics.field2735, var2.field1133, var2.field1096, method261(var2.field1133 + (var2.field1099 * 64 - 64), var2.field1096 + (var2.field1099 * 64 - 64), Statics.field2735), var2.field1099 * 64 - 64 + 60, var2, var2.field1117, var3, var2.field1098);
                }
            }
        }
    }

    @ObfuscatedName("ad.gh(I)V")
    public static final void method503() {
        for (class91 var0 = (class91) field936.method3739(); var0 != null; var0 = (class91) field936.method3745()) {
            if (Statics.field2735 != var0.field1337 || field830 > var0.field1351) {
                var0.method3726();
            } else if (field830 >= var0.field1346) {
                if (var0.field1356 > 0) {
                    class84 var1 = field859[var0.field1356 - 1];
                    if (var1 != null && var1.field1133 >= 0 && var1.field1133 < 13312 && var1.field1096 >= 0 && var1.field1096 < 13312) {
                        var0.method1768(var1.field1133, var1.field1096, method261(var1.field1133, var1.field1096, var0.field1337) - var0.field1342, field830);
                    }
                }
                if (var0.field1356 < 0) {
                    int var2 = -var0.field1356 - 1;
                    class72 var3;
                    if (field924 == var2) {
                        var3 = Statics.field818;
                    } else {
                        var3 = field923[var2];
                    }
                    if (var3 != null && var3.field1133 >= 0 && var3.field1133 < 13312 && var3.field1096 >= 0 && var3.field1096 < 13312) {
                        var0.method1768(var3.field1133, var3.field1096, method261(var3.field1133, var3.field1096, var0.field1337) - var0.field1342, field830);
                    }
                }
                var0.method1769(field879);
                Statics.field2065.method2718(Statics.field2735, (int) var0.field1349, (int) var0.field1350, (int) var0.field1338, 60, var0, var0.field1357, -1, false);
            }
        }
    }

    @ObfuscatedName("ca.gd(I)I")
    public static final int method1864() {
        if (Statics.field1072.field1182) {
            return Statics.field2735;
        }
        int var0 = 3;
        if (Statics.field2047 < 310) {
            int var1 = Statics.field490 >> 7;
            int var2 = Statics.field1155 >> 7;
            int var3 = Statics.field818.field1133 >> 7;
            int var4 = Statics.field818.field1096 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field2735;
            }
            if ((class62.field698[Statics.field2735][var1][var2] & 0x4) != 0) {
                var0 = Statics.field2735;
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
                    if ((class62.field698[Statics.field2735][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2735;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class62.field698[Statics.field2735][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2735;
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
                    if ((class62.field698[Statics.field2735][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2735;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class62.field698[Statics.field2735][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2735;
                        }
                    }
                }
            }
        }
        if (Statics.field818.field1133 >= 0 && Statics.field818.field1096 >= 0 && Statics.field818.field1133 < 13312 && Statics.field818.field1096 < 13312) {
            if ((class62.field698[Statics.field2735][Statics.field818.field1133 >> 7][Statics.field818.field1096 >> 7] & 0x4) != 0) {
                var0 = Statics.field2735;
            }
            return var0;
        } else {
            return Statics.field2735;
        }
    }

    @ObfuscatedName("fm.gu(I)I")
    public static final int method3126() {
        if (Statics.field1072.field1182) {
            return Statics.field2735;
        } else {
            int var0 = method261(Statics.field490, Statics.field1155, Statics.field2735);
            return var0 - Statics.field2124 >= 800 || (class62.field698[Statics.field2735][Statics.field490 >> 7][Statics.field1155 >> 7] & 0x4) == 0 ? 3 : Statics.field2735;
        }
    }

    @ObfuscatedName("jr.go(III)V")
    public static final void method4484(int arg0, int arg1) {
        if (field838 == 2) {
            method3932((field841 - Statics.field710 << 7) + field844, (field842 - Statics.field401 << 7) + field1074, field843 * 2);
            if (field974 > -1 && field830 % 20 < 10) {
                Statics.field2010[0].method5344(field974 + arg0 - 12, field955 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("bs.gg(Lbq;IIIIII)V")
    public static final void method1558(class75 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1096()) {
            return;
        }
        if (arg0 instanceof class84) {
            class279 var6 = ((class84) arg0).field1253;
            if (var6.field3658 != null) {
                var6 = var6.method4671();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class93.field1372;
        int[] var8 = class93.field1377;
        int var9 = 3;
        if (!arg0.field1140.method3699()) {
            method486(arg0, arg0.field1132 + 15);
            for (class83 var10 = (class83) arg0.field1140.method3696(); var10 != null; var10 = (class83) arg0.field1140.method3718()) {
                class76 var11 = var10.method1699(field830);
                if (var11 != null) {
                    class269 var12 = var10.field1250;
                    class323 var13 = var12.method4445();
                    class323 var14 = var12.method4444();
                    int var15 = 0;
                    int var16;
                    if (var13 == null || var14 == null) {
                        var16 = var12.field3468;
                    } else {
                        if (var12.field3465 * 2 < var14.field3901) {
                            var15 = var12.field3465;
                        }
                        var16 = var14.field3901 - var15 * 2;
                    }
                    int var17 = 255;
                    boolean var18 = true;
                    int var19 = field830 - var11.field1161;
                    int var20 = var11.field1157 * var16 / var12.field3468;
                    int var23;
                    if (var11.field1158 > var19) {
                        int var21 = var12.field3464 == 0 ? 0 : var19 / var12.field3464 * var12.field3464;
                        int var22 = var11.field1156 * var16 / var12.field3468;
                        var23 = (var20 - var22) * var21 / var11.field1158 + var22;
                    } else {
                        var23 = var20;
                        int var24 = var11.field1158 + var12.field3461 - var19;
                        if (var12.field3463 >= 0) {
                            var17 = (var24 << 8) / (var12.field3461 - var12.field3463);
                        }
                    }
                    if (var11.field1157 > 0 && var23 < 1) {
                        var23 = 1;
                    }
                    int var25 = field974 + arg2 - (var16 >> 1);
                    int var26 = field955 + arg3 - var9;
                    if (var13 == null || var14 == null) {
                        if (field974 > -1) {
                            class319.method5232(var25, var26, var23, 5, 65280);
                            class319.method5232(var23 + var25, var26, var16 - var23, 5, 16711680);
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
                        int var29 = var13.field3911;
                        var9 += var29;
                        if (var17 >= 0 && var17 < 255) {
                            var13.method5332(var27, var26, var17);
                            class319.method5213(var27, var26, var27 + var28, var26 + var29);
                            var14.method5332(var27, var26, var17);
                        } else {
                            var13.method5344(var27, var26);
                            class319.method5213(var27, var26, var27 + var28, var26 + var29);
                            var14.method5344(var27, var26);
                        }
                        class319.method5212(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var9 += 2;
                    }
                } else if (var10.method1702()) {
                    var10.method3726();
                }
            }
        }
        if (var9 < 30) {
            var9 = 30;
        }
        if (arg1 < var7) {
            class72 var30 = (class72) arg0;
            if (var30.field802) {
                return;
            }
            if (var30.field783 != -1 || var30.field804 != -1) {
                method486(arg0, arg0.field1132 + 15);
                if (field974 > -1) {
                    if (var30.field783 != -1) {
                        Statics.field739[var30.field783].method5344(field974 + arg2 - 12, field955 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var30.field804 != -1) {
                        Statics.field2143[var30.field804].method5344(field974 + arg2 - 12, field955 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field838 == 10 && field925 == var8[arg1]) {
                method486(arg0, arg0.field1132 + 15);
                if (field974 > -1) {
                    Statics.field2010[1].method5344(field974 + arg2 - 12, field955 + arg3 - var9);
                }
            }
        } else {
            class279 var31 = ((class84) arg0).field1253;
            if (var31.field3658 != null) {
                var31 = var31.method4671();
            }
            if (var31.field3636 >= 0 && var31.field3636 < Statics.field2143.length) {
                method486(arg0, arg0.field1132 + 15);
                if (field974 > -1) {
                    Statics.field2143[var31.field3636].method5344(field974 + arg2 - 12, field955 + arg3 - 30);
                }
            }
            if (field838 == 1 && field839 == field840[arg1 - var7] && field830 % 20 < 10) {
                method486(arg0, arg0.field1132 + 15);
                if (field974 > -1) {
                    Statics.field2010[0].method5344(field974 + arg2 - 12, field955 + arg3 - 28);
                }
            }
        }
        if (arg0.field1147 != null && (arg1 >= var7 || !arg0.field1110 && (field1021 == 4 || !arg0.field1104 && (field1021 == 0 || field1021 == 3 || field1021 == 1 && ((class72) arg0).method1085())))) {
            method486(arg0, arg0.field1132);
            if (field974 > -1 && field896 < field1004) {
                field901[field896] = Statics.field2093.method5018(arg0.field1147) / 2;
                field1033[field896] = Statics.field2093.field3771;
                field909[field896] = field974;
                field899[field896] = field955;
                field902[field896] = arg0.field1112;
                field903[field896] = arg0.field1113;
                field904[field896] = arg0.field1111;
                field1014[field896] = arg0.field1147;
                field896++;
            }
        }
        for (int var32 = 0; var32 < 4; var32++) {
            int var33 = arg0.field1152[var32];
            int var34 = arg0.field1115[var32];
            class275 var35 = null;
            int var36 = 0;
            if (var34 >= 0) {
                if (var33 <= field830) {
                    continue;
                }
                var35 = class275.method1716(arg0.field1115[var32]);
                var36 = var35.field3517;
                if (var35 != null && var35.field3515 != null) {
                    var35 = var35.method4522();
                    if (var35 == null) {
                        arg0.field1152[var32] = -1;
                        continue;
                    }
                }
            } else if (var33 < 0) {
                continue;
            }
            int var37 = arg0.field1118[var32];
            class275 var38 = null;
            if (var37 >= 0) {
                var38 = class275.method1716(var37);
                if (var38 != null && var38.field3515 != null) {
                    var38 = var38.method4522();
                }
            }
            if (var33 - var36 <= field830) {
                if (var35 == null) {
                    arg0.field1152[var32] = -1;
                } else {
                    method486(arg0, arg0.field1132 / 2);
                    if (field974 > -1) {
                        if (var32 == 1) {
                            field955 -= 20;
                        }
                        if (var32 == 2) {
                            field974 -= 15;
                            field955 -= 10;
                        }
                        if (var32 == 3) {
                            field974 += 15;
                            field955 -= 10;
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
                        class323 var51 = null;
                        class323 var52 = null;
                        class323 var53 = null;
                        class323 var54 = null;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        class323 var64 = var35.method4524();
                        if (var64 != null) {
                            var43 = var64.field3901;
                            int var65 = var64.field3911;
                            if (var65 > var63) {
                                var63 = var65;
                            }
                            var47 = var64.field3905;
                        }
                        class323 var66 = var35.method4541();
                        if (var66 != null) {
                            var44 = var66.field3901;
                            int var67 = var66.field3911;
                            if (var67 > var63) {
                                var63 = var67;
                            }
                            var48 = var66.field3905;
                        }
                        class323 var68 = var35.method4526();
                        if (var68 != null) {
                            var45 = var68.field3901;
                            int var69 = var68.field3911;
                            if (var69 > var63) {
                                var63 = var69;
                            }
                            var49 = var68.field3905;
                        }
                        class323 var70 = var35.method4540();
                        if (var70 != null) {
                            var46 = var70.field3901;
                            int var71 = var70.field3911;
                            if (var71 > var63) {
                                var63 = var71;
                            }
                            var50 = var70.field3905;
                        }
                        if (var38 != null) {
                            var51 = var38.method4524();
                            if (var51 != null) {
                                var55 = var51.field3901;
                                int var72 = var51.field3911;
                                if (var72 > var63) {
                                    var63 = var72;
                                }
                                var59 = var51.field3905;
                            }
                            var52 = var38.method4541();
                            if (var52 != null) {
                                var56 = var52.field3901;
                                int var73 = var52.field3911;
                                if (var73 > var63) {
                                    var63 = var73;
                                }
                                var60 = var52.field3905;
                            }
                            var53 = var38.method4526();
                            if (var53 != null) {
                                var57 = var53.field3901;
                                int var74 = var53.field3911;
                                if (var74 > var63) {
                                    var63 = var74;
                                }
                                var61 = var53.field3905;
                            }
                            var54 = var38.method4540();
                            if (var54 != null) {
                                var58 = var54.field3901;
                                int var75 = var54.field3911;
                                if (var75 > var63) {
                                    var63 = var75;
                                }
                                var62 = var54.field3905;
                            }
                        }
                        class298 var76 = var35.method4528();
                        if (var76 == null) {
                            var76 = Statics.field3380;
                        }
                        class298 var77;
                        if (var38 == null) {
                            var77 = Statics.field3380;
                        } else {
                            var77 = var38.method4528();
                            if (var77 == null) {
                                var77 = Statics.field3380;
                            }
                        }
                        Object var78 = null;
                        String var79 = null;
                        boolean var80 = false;
                        int var81 = 0;
                        String var82 = var35.method4523(arg0.field1116[var32]);
                        int var83 = var76.method5018(var82);
                        if (var38 != null) {
                            var79 = var38.method4523(arg0.field1119[var32]);
                            var81 = var77.method5018(var79);
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
                        int var100 = arg0.field1152[var32] - field830;
                        int var101 = var35.field3510 - var35.field3510 * var100 / var35.field3517;
                        int var102 = var35.field3497 * var100 / var35.field3517 + -var35.field3497;
                        int var103 = field974 + arg2 - (var92 >> 1) + var101;
                        int var104 = field955 + arg3 - 12 + var102;
                        int var105 = var104;
                        int var106 = var63 + var104;
                        int var107 = var35.field3504 + var104 + 15;
                        int var108 = var107 - var76.field3785;
                        int var109 = var76.field3783 + var107;
                        if (var108 < var104) {
                            var105 = var108;
                        }
                        if (var109 > var106) {
                            var106 = var109;
                        }
                        int var110 = 0;
                        if (var38 != null) {
                            var110 = var38.field3504 + var104 + 15;
                            int var111 = var110 - var77.field3785;
                            int var112 = var77.field3783 + var110;
                            if (var111 < var105) {
                                ;
                            }
                            if (var112 > var106) {
                                ;
                            }
                        }
                        int var115 = 255;
                        if (var35.field3511 >= 0) {
                            var115 = (var100 << 8) / (var35.field3517 - var35.field3511);
                        }
                        if (var115 >= 0 && var115 < 255) {
                            if (var64 != null) {
                                var64.method5332(var87 + var103 - var47, var104, var115);
                            }
                            if (var68 != null) {
                                var68.method5332(var88 + var103 - var49, var104, var115);
                            }
                            if (var66 != null) {
                                for (int var116 = 0; var116 < var84; var116++) {
                                    var66.method5332(var44 * var116 + (var89 + var103 - var48), var104, var115);
                                }
                            }
                            if (var70 != null) {
                                var70.method5332(var93 + var103 - var50, var104, var115);
                            }
                            var76.method5004(var82, var90 + var103, var107, var35.field3503, 0, var115);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method5332(var94 + var103 - var59, var104, var115);
                                }
                                if (var53 != null) {
                                    var53.method5332(var95 + var103 - var61, var104, var115);
                                }
                                if (var52 != null) {
                                    for (int var117 = 0; var117 < var85; var117++) {
                                        var52.method5332(var56 * var117 + (var96 + var103 - var60), var104, var115);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method5332(var97 + var103 - var62, var104, var115);
                                }
                                var77.method5004(var79, var98 + var103, var110, var38.field3503, 0, var115);
                            }
                        } else {
                            if (var64 != null) {
                                var64.method5344(var87 + var103 - var47, var104);
                            }
                            if (var68 != null) {
                                var68.method5344(var88 + var103 - var49, var104);
                            }
                            if (var66 != null) {
                                for (int var118 = 0; var118 < var84; var118++) {
                                    var66.method5344(var44 * var118 + (var89 + var103 - var48), var104);
                                }
                            }
                            if (var70 != null) {
                                var70.method5344(var93 + var103 - var50, var104);
                            }
                            var76.method5003(var82, var90 + var103, var107, var35.field3503 | 0xFF000000, 0);
                            if (var38 != null) {
                                if (var51 != null) {
                                    var51.method5344(var94 + var103 - var59, var104);
                                }
                                if (var53 != null) {
                                    var53.method5344(var95 + var103 - var61, var104);
                                }
                                if (var52 != null) {
                                    for (int var119 = 0; var119 < var85; var119++) {
                                        var52.method5344(var56 * var119 + (var96 + var103 - var60), var104);
                                    }
                                }
                                if (var54 != null) {
                                    var54.method5344(var97 + var103 - var62, var104);
                                }
                                var77.method5003(var79, var98 + var103, var110, var38.field3503 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aj.gp(I)V")
    public static final void method253() {
        field922 = 0;
        int var0 = (Statics.field818.field1133 >> 7) + Statics.field710;
        int var1 = (Statics.field818.field1096 >> 7) + Statics.field401;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field922 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field922 = 1;
        }
        if (field922 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field922 = 0;
        }
    }

    @ObfuscatedName("d.ge(IIIII)V")
    public static final void method55(int arg0, int arg1, int arg2, int arg3) {
        if (field1070 == 1) {
            Statics.field346[field912 / 100].method5344(field905 - 8, field911 - 8);
        }
        if (field1070 == 2) {
            Statics.field346[field912 / 100 + 4].method5344(field905 - 8, field911 - 8);
        }
        method253();
    }

    @ObfuscatedName("ax.gk(Lbq;II)V")
    public static final void method486(class75 arg0, int arg1) {
        method3932(arg0.field1133, arg0.field1096, arg1);
    }

    @ObfuscatedName("hs.gw(IIII)V")
    public static final void method3932(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field974 = -1;
            field955 = -1;
            return;
        }
        int var3 = method261(arg0, arg1, Statics.field2735) - arg2;
        int var4 = arg0 - Statics.field490;
        int var5 = var3 - Statics.field2124;
        int var6 = arg1 - Statics.field1155;
        int var7 = class134.field1902[Statics.field2047];
        int var8 = class134.field1917[Statics.field2047];
        int var9 = class134.field1902[Statics.field683];
        int var10 = class134.field1917[Statics.field683];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field974 = field831 * var11 / var15 + field1066 / 2;
            field955 = field831 * var14 / var15 + field1067 / 2;
        } else {
            field974 = -1;
            field955 = -1;
        }
    }

    @ObfuscatedName("ah.gv(IIII)I")
    public static final int method261(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class62.field698[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class62.field689[var5][var3][var4] + class62.field689[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class62.field689[var5][var3][var4 + 1] + class62.field689[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bz.ga(ZLgu;I)V")
    public static final void method1047(boolean arg0, class200 arg1) {
        field876 = arg0;
        if (!field876) {
            int var2 = arg1.method3285();
            int var3 = arg1.method3399();
            int var4 = arg1.method3249();
            Statics.field1190 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1190[var5][var6] = arg1.method3261();
                }
            }
            Statics.field3356 = new int[var4];
            Statics.field532 = new int[var4];
            Statics.field499 = new int[var4];
            Statics.field2121 = new byte[var4][];
            Statics.field590 = new byte[var4][];
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
                        Statics.field3356[var8] = var11;
                        Statics.field532[var8] = Statics.field1412.method4177("m" + var9 + "_" + var10);
                        Statics.field499[var8] = Statics.field1412.method4177("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method1824(var3, var2, true);
            return;
        }
        boolean var12 = arg1.method3277() == 1;
        int var13 = arg1.method3399();
        int var14 = arg1.method3285();
        int var15 = arg1.method3249();
        arg1.method3518();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method3529(1);
                    if (var19 == 1) {
                        field877[var16][var17][var18] = arg1.method3529(26);
                    } else {
                        field877[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method3540();
        Statics.field1190 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field1190[var20][var21] = arg1.method3261();
            }
        }
        Statics.field3356 = new int[var15];
        Statics.field532 = new int[var15];
        Statics.field499 = new int[var15];
        Statics.field2121 = new byte[var15][];
        Statics.field590 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field877[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field3356[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field3356[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field532[var22] = Statics.field1412.method4177("m" + var31 + "_" + var32);
                            Statics.field499[var22] = Statics.field1412.method4177("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method1824(var14, var13, !var12);
    }

    @ObfuscatedName("cj.hz(IIZI)V")
    public static final void method1824(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field2091 == arg0 && Statics.field2087 == arg1) {
            return;
        }
        Statics.field2091 = arg0;
        Statics.field2087 = arg1;
        method262(25);
        method4068(class246.field3071, true);
        int var3 = Statics.field710;
        int var4 = Statics.field401;
        Statics.field710 = (arg0 - 6) * 8;
        Statics.field401 = (arg1 - 6) * 8;
        int var5 = Statics.field710 - var3;
        int var6 = Statics.field401 - var4;
        int var7 = Statics.field710;
        int var8 = Statics.field401;
        for (int var9 = 0; var9 < 32768; var9++) {
            class84 var10 = field859[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1150[var11] -= var5;
                    var10.field1151[var11] -= var6;
                }
                var10.field1133 -= var5 * 128;
                var10.field1096 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class72 var13 = field923[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1150[var14] -= var5;
                    var13.field1151[var14] -= var6;
                }
                var13.field1133 -= var5 * 128;
                var13.field1096 -= var6 * 128;
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
                        field888[var25][var21][var22] = field888[var25][var23][var24];
                    } else {
                        field888[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class74 var26 = (class74) field1049.method3739(); var26 != null; var26 = (class74) field1049.method3745()) {
            var26.field1083 -= var5;
            var26.field1084 -= var6;
            if (var26.field1083 < 0 || var26.field1084 < 0 || var26.field1083 >= 104 || var26.field1084 >= 104) {
                var26.method3726();
            }
        }
        if (field1035 != 0) {
            field1035 -= var5;
            field940 -= var6;
        }
        field950 = 0;
        field984 = false;
        field1078 = -1;
        field937.method3734();
        field936.method3734();
        for (int var27 = 0; var27 < 4; var27++) {
            field875[var27].method3101();
        }
    }

    @ObfuscatedName("aw.hj(ZS)V")
    public static final void method652(boolean arg0) {
        method604();
        field864.field1441++;
        if (field864.field1441 < 50 && !arg0) {
            return;
        }
        field864.field1441 = 0;
        if (field866 || field864.method1902() == null) {
            return;
        }
        class184 var1 = class184.method979(class181.field2386, field864.field1435);
        field864.method1893(var1);
        try {
            field864.method1911();
        } catch (IOException var3) {
            field866 = true;
        }
    }

    @ObfuscatedName("dj.hk(II)V")
    public static final void method2098(int arg0) {
        int[] var1 = Statics.field1881.field3904;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class62.field698[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field2065.method2705(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class62.field698[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2065.method2705(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1881.method5335();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class62.field698[arg0][var10][var9] & 0x18) == 0) {
                    method494(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class62.field698[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method494(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field1031 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field2065.method2700(Statics.field2735, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class276.method1566(var14).field3546;
                    if (var15 >= 0) {
                        field1034[field1031] = Statics.field4025[var15].method4342(false);
                        field851[field1031] = var11;
                        field1038[field1031] = var12;
                        field1031++;
                    }
                }
            }
        }
        Statics.field3926.method5302();
    }

    @ObfuscatedName("ad.hl(IIIIII)V")
    public static final void method494(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2065.method2729(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2065.method2701(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1881.field3904;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class276 var13 = class276.method1566(var12);
            if (var13.field3539 == -1) {
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
                class322 var14 = Statics.field15[var13.field3539];
                if (var14 != null) {
                    int var15 = (var13.field3533 * 4 - var14.field3895) / 2;
                    int var16 = (var13.field3534 * 4 - var14.field3896) / 2;
                    var14.method5316(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field3534) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2065.method2699(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2065.method2701(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class276 var22 = class276.method1566(var21);
            if (var22.field3539 != -1) {
                class322 var23 = Statics.field15[var22.field3539];
                if (var23 != null) {
                    int var24 = (var22.field3533 * 4 - var23.field3895) / 2;
                    int var25 = (var22.field3534 * 4 - var23.field3896) / 2;
                    var23.method5316(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field3534) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1881.field3904;
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
        int var29 = Statics.field2065.method2700(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class276 var31 = class276.method1566(var30);
        if (var31.field3539 == -1) {
            return;
        }
        class322 var32 = Statics.field15[var31.field3539];
        if (var32 != null) {
            int var33 = (var31.field3533 * 4 - var32.field3895) / 2;
            int var34 = (var31.field3534 * 4 - var32.field3896) / 2;
            var32.method5316(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field3534) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("client.he(Lcf;I)Z")
    public final boolean method1155(class99 arg0) {
        class169 var2 = arg0.method1902();
        class200 var3 = arg0.field1439;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1437 == null) {
                if (arg0.field1445) {
                    if (!var2.method3024(1)) {
                        return false;
                    }
                    var2.method3031(arg0.field1439.field2541, 0, 1);
                    arg0.field1440 = 0;
                    arg0.field1445 = false;
                }
                var3.field2538 = 0;
                if (var3.method3551()) {
                    if (!var2.method3024(1)) {
                        return false;
                    }
                    var2.method3031(arg0.field1439.field2541, 1, 1);
                    arg0.field1440 = 0;
                }
                arg0.field1445 = true;
                class180[] var4 = Statics.method1040();
                int var5 = var3.method3524();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field2538);
                }
                arg0.field1437 = var4[var5];
                arg0.field1438 = arg0.field1437.field2256;
            }
            if (arg0.field1438 == -1) {
                if (!var2.method3024(1)) {
                    return false;
                }
                arg0.method1902().method3031(var3.field2541, 0, 1);
                arg0.field1438 = var3.field2541[0] & 0xFF;
            }
            if (arg0.field1438 == -2) {
                if (!var2.method3024(2)) {
                    return false;
                }
                arg0.method1902().method3031(var3.field2541, 0, 2);
                var3.field2538 = 0;
                arg0.field1438 = var3.method3249();
            }
            if (!var2.method3024(arg0.field1438)) {
                return false;
            }
            var3.field2538 = 0;
            var2.method3031(var3.field2541, 0, arg0.field1438);
            arg0.field1440 = 0;
            field913.method5149();
            arg0.field1444 = arg0.field1443;
            arg0.field1443 = arg0.field1442;
            arg0.field1442 = arg0.field1437;
            if (class180.field2280 == arg0.field1437) {
                Statics.field735 = var3.method3276();
                Statics.field775 = var3.method3275();
                while (var3.field2538 < arg0.field1438) {
                    int var6 = var3.method3247();
                    class183[] var7 = new class183[] { class183.field2454, class183.field2446, class183.field2448, class183.field2449, class183.field2450, class183.field2451, class183.field2457, class183.field2456, class183.field2452, class183.field2453 };
                    class183 var8 = var7[var6];
                    method4494(var8);
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2328 == arg0.field1437) {
                int var9 = var3.method3261();
                int var10 = var3.method3261();
                int var11 = class59.method255();
                class184 var12 = class184.method979(class181.field2406, field864.field1435);
                var12.field2468.method3235(var9);
                var12.field2468.method3324(var10);
                var12.field2468.method3274(var11);
                var12.field2468.method3273(field632);
                field864.method1893(var12);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2292 == arg0.field1437) {
                for (int var13 = 0; var13 < Statics.field2567; var13++) {
                    class262 var14 = Statics.method1500(var13);
                    if (var14 != null) {
                        class232.field2737[var13] = 0;
                        class232.field2740[var13] = 0;
                    }
                }
                method1895();
                field992 += 32;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2295 == arg0.field1437) {
                int var15 = var3.method3249();
                int var16 = var3.method3247();
                int var17 = var3.method3249();
                if (field1041 != 0 && var16 != 0 && field950 < 50) {
                    field1044[field950] = var15;
                    field1045[field950] = var16;
                    field1046[field950] = var17;
                    field1048[field950] = null;
                    field1047[field950] = 0;
                    field950++;
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2290 == arg0.field1437) {
                int var21 = var3.method3261();
                int var22 = var3.method3249();
                if (var21 < -70000) {
                    var22 += 32768;
                }
                class237 var23;
                if (var21 >= 0) {
                    var23 = class237.method1884(var21);
                } else {
                    var23 = null;
                }
                while (var3.field2538 < arg0.field1438) {
                    int var24 = var3.method3368();
                    int var25 = var3.method3249();
                    int var26 = 0;
                    if (var25 != 0) {
                        var26 = var3.method3247();
                        if (var26 == 255) {
                            var26 = var3.method3261();
                        }
                    }
                    if (var23 != null && var24 >= 0 && var24 < var23.field2896.length) {
                        var23.field2896[var24] = var25;
                        var23.field2891[var24] = var26;
                    }
                    class65.method1883(var22, var24, var25 - 1, var26);
                }
                if (var23 != null) {
                    method1035(var23);
                }
                method1895();
                field898[++field1017 - 1 & 0x1F] = var22 & 0x7FFF;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2327 == arg0.field1437) {
                String var27 = var3.method3256();
                Statics.field542 = var27;
                try {
                    String var28 = Statics.field3973.getParameter(class310.field3826.field3840);
                    String var29 = Statics.field3973.getParameter(class310.field3834.field3840);
                    String var30 = var28 + "settings=" + var27 + "; version=1; path=/; domain=" + var29;
                    String var31;
                    if (var27.length() == 0) {
                        var31 = var30 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    } else {
                        var31 = var30 + "; Expires=" + class203.method3011(class196.method3211() + 94608000000L) + "; Max-Age=" + 94608000L;
                    }
                    client var32 = Statics.field3973;
                    String var33 = "document.cookie=\"" + var31 + "\"";
                    JSObject.getWindow(var32).eval(var33);
                } catch (Throwable var257) {
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2308 == arg0.field1437) {
                method4325(false, var3);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2315 == arg0.field1437) {
                int var35 = var3.method3294();
                class237 var36 = class237.method1884(var35);
                var36.field2787 = 3;
                var36.field2847 = Statics.field818.field781.method4052();
                method1035(var36);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2281 == arg0.field1437) {
                int var37 = var3.method3294();
                int var38 = var3.method3399();
                class237 var39 = class237.method1884(var37);
                if (var39.field2787 != 2 || var39.field2847 != var38) {
                    var39.field2787 = 2;
                    var39.field2847 = var38;
                    method1035(var39);
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2325 == arg0.field1437) {
                int var40 = var3.method3399();
                int var41 = var3.method3294();
                class232.field2737[var40] = var41;
                if (class232.field2740[var40] != var41) {
                    class232.field2740[var40] = var41;
                }
                method2066(var40);
                field991[++field992 - 1 & 0x1F] = var40;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2310 == arg0.field1437) {
                method1895();
                field970 = var3.method3230();
                field908 = field989;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2264 == arg0.field1437) {
                for (int var42 = 0; var42 < class232.field2740.length; var42++) {
                    if (class232.field2740[var42] != class232.field2737[var42]) {
                        class232.field2740[var42] = class232.field2737[var42];
                        method2066(var42);
                        field991[++field992 - 1 & 0x1F] = var42;
                    }
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2273 == arg0.field1437) {
                int var43 = var3.method3261();
                class237 var44 = class237.method1884(var43);
                for (int var45 = 0; var45 < var44.field2896.length; var45++) {
                    var44.field2896[var45] = -1;
                    var44.field2896[var45] = 0;
                }
                method1035(var44);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2304 == arg0.field1437) {
                class77 var46 = new class77();
                var46.field1175 = var3.method3256();
                var46.field1163 = var3.method3249();
                int var47 = var3.method3261();
                var46.field1173 = var47;
                method262(45);
                var2.method3020();
                Object var48 = null;
                class90.method579(var46);
                arg0.field1437 = null;
                return false;
            }
            if (class180.field2282 == arg0.field1437) {
                method4494(class183.field2454);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2333 == arg0.field1437) {
                field1021 = var3.method3247();
                field1022 = var3.method3276();
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2276 == arg0.field1437) {
                method4494(class183.field2453);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2263 == arg0.field1437) {
                int var49 = var3.method3261();
                String var50 = var3.method3256();
                class237 var51 = class237.method1884(var49);
                if (!var50.equals(var51.field2838)) {
                    var51.field2838 = var50;
                    method1035(var51);
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2266 == arg0.field1437) {
                if (arg0.field1438 == 0) {
                    Statics.field14 = null;
                } else {
                    if (Statics.field14 == null) {
                        Statics.field14 = new class294(Statics.field2759, Statics.field3973);
                    }
                    Statics.field14.method4954(var3);
                }
                field999 = field989;
                Statics.field1925 = true;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2286 == arg0.field1437) {
                boolean var52 = var3.method3247() == 1;
                int var53 = var3.method3294();
                class237 var54 = class237.method1884(var53);
                if (var54.field2798 != var52) {
                    var54.field2798 = var52;
                    method1035(var54);
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2321 == arg0.field1437) {
                int var55 = var3.method3295();
                int var56 = var3.method3399();
                class237 var57 = class237.method1884(var55);
                if (var57.field2787 != 1 || var57.field2847 != var56) {
                    var57.field2787 = 1;
                    var57.field2847 = var56;
                    method1035(var57);
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2302 == arg0.field1437) {
                int var58 = var3.method3247();
                class313[] var59 = class313.method1113();
                int var60 = 0;
                class313 var62;
                while (true) {
                    if (var60 >= var59.length) {
                        var62 = null;
                        break;
                    }
                    class313 var61 = var59[var60];
                    if (var61.field3854 == var58) {
                        var62 = var61;
                        break;
                    }
                    var60++;
                }
                Statics.field780 = var62;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2318 == arg0.field1437) {
                int var63 = var3.method3249();
                int var64 = var3.method3276();
                int var65 = var3.method3295();
                class67 var66 = (class67) field986.method3674((long) var65);
                if (var66 != null) {
                    method3502(var66, var66.field738 != var63);
                }
                class67 var67 = new class67();
                var67.field738 = var63;
                var67.field737 = var64;
                field986.method3675(var67, (long) var65);
                method4148(var63);
                class237 var68 = class237.method1884(var65);
                method1035(var68);
                if (field931 != null) {
                    method1035(field931);
                    field931 = null;
                }
                method2386();
                method108(Statics.field2770[var65 >> 16], var68, false);
                class81.method20(var63);
                if (field964 != -1) {
                    method2669(field964, 1);
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2311 == arg0.field1437) {
                if (Statics.field14 != null) {
                    Statics.field14.method4976(var3);
                }
                field999 = field989;
                Statics.field1925 = true;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2299 == arg0.field1437) {
                method4494(class183.field2452);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2294 == arg0.field1437) {
                field984 = false;
                for (int var69 = 0; var69 < 5; var69++) {
                    field1051[var69] = false;
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2279 == arg0.field1437) {
                method4494(class183.field2446);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2314 == arg0.field1437) {
                int var70 = var3.method3247();
                if (var3.method3247() == 0) {
                    field1073[var70] = new class17();
                    var3.field2538 += 18;
                } else {
                    var3.field2538--;
                    field1073[var70] = new class17(var3, false);
                }
                field1000 = field989;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2334 == arg0.field1437) {
                int var71 = var3.method3261();
                class67 var72 = (class67) field986.method3674((long) var71);
                if (var72 != null) {
                    method3502(var72, true);
                }
                if (field931 != null) {
                    method1035(field931);
                    field931 = null;
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2326 == arg0.field1437) {
                int var73 = var3.method3264();
                int var74 = var3.method3295();
                class237 var75 = class237.method1884(var74);
                if (var75.field2825 != var73 || var73 == -1) {
                    var75.field2825 = var73;
                    var75.field2900 = 0;
                    var75.field2801 = 0;
                    method1035(var75);
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2261 == arg0.field1437) {
                int var76 = var3.method3399();
                int var77 = var3.method3396();
                int var78 = var3.method3366();
                class237 var79 = class237.method1884(var77);
                var79.field2834 = (var78 << 16) + var76;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2269 == arg0.field1437) {
                int var80 = var3.method3247();
                int var81 = var3.method3247();
                int var82 = var3.method3247();
                int var83 = var3.method3247();
                field1051[var80] = true;
                field1052[var80] = var81;
                field1053[var80] = var82;
                field890[var80] = var83;
                field1055[var80] = 0;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2313 == arg0.field1437) {
                int var84 = var3.method3366();
                int var85 = var3.method3261();
                int var86 = var84 >> 10 & 0x1F;
                int var87 = var84 >> 5 & 0x1F;
                int var88 = var84 & 0x1F;
                int var89 = (var88 << 3) + (var86 << 19) + (var87 << 11);
                class237 var90 = class237.method1884(var85);
                if (var90.field2803 != var89) {
                    var90.field2803 = var89;
                    method1035(var90);
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2284 == arg0.field1437) {
                Statics.field735 = var3.method3276();
                Statics.field775 = var3.method3277();
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2320 == arg0.field1437) {
                method1047(true, arg0.field1439);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2301 == arg0.field1437) {
                method4494(class183.field2457);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2267 == arg0.field1437) {
                String var91 = var3.method3256();
                String var92 = class299.method5037(class305.method965(class300.method3575(var3)));
                class95.method2873(6, var91, var92);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2300 == arg0.field1437) {
                int var93 = var3.method3399();
                byte var94 = var3.method3385();
                class232.field2737[var93] = var94;
                if (class232.field2740[var93] != var94) {
                    class232.field2740[var93] = var94;
                }
                method2066(var93);
                field991[++field992 - 1 & 0x1F] = var93;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2317 == arg0.field1437) {
                int var95 = var3.method3399();
                class65.method600(var95);
                field898[++field1017 - 1 & 0x1F] = var95 & 0x7FFF;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2257 == arg0.field1437) {
                int var96 = var3.method3399();
                int var97 = var3.method3295();
                class237 var98 = class237.method1884(var97);
                if (var98 != null && var98.field2902 == 0) {
                    if (var96 > var98.field2802 - var98.field2794) {
                        var96 = var98.field2802 - var98.field2794;
                    }
                    if (var96 < 0) {
                        var96 = 0;
                    }
                    if (var98.field2778 != var96) {
                        var98.field2778 = var96;
                        method1035(var98);
                    }
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2323 == arg0.field1437) {
                int var99 = var3.method3261();
                int var100 = var3.method3249();
                if (var99 < -70000) {
                    var100 += 32768;
                }
                class237 var101;
                if (var99 >= 0) {
                    var101 = class237.method1884(var99);
                } else {
                    var101 = null;
                }
                if (var101 != null) {
                    for (int var102 = 0; var102 < var101.field2896.length; var102++) {
                        var101.field2896[var102] = 0;
                        var101.field2891[var102] = 0;
                    }
                }
                class65.method504(var100);
                int var103 = var3.method3249();
                for (int var104 = 0; var104 < var103; var104++) {
                    int var105 = var3.method3366();
                    int var106 = var3.method3247();
                    if (var106 == 255) {
                        var106 = var3.method3294();
                    }
                    if (var101 != null && var104 < var101.field2896.length) {
                        var101.field2896[var104] = var105;
                        var101.field2891[var104] = var106;
                    }
                    class65.method1883(var100, var104, var105 - 1, var106);
                }
                if (var101 != null) {
                    method1035(var101);
                }
                method1895();
                field898[++field1017 - 1 & 0x1F] = var100 & 0x7FFF;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2312 == arg0.field1437) {
                boolean var107 = var3.method3247() == 1;
                if (var107) {
                    Statics.field1 = class196.method3211() - var3.method3253();
                    Statics.field10 = new class14(var3, true);
                } else {
                    Statics.field10 = null;
                }
                field885 = field989;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2332 == arg0.field1437) {
                method4494(class183.field2448);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2296 == arg0.field1437) {
                field984 = true;
                Statics.field2117 = var3.method3247();
                Statics.field1039 = var3.method3247();
                Statics.field2651 = var3.method3249();
                Statics.field1413 = var3.method3247();
                Statics.field1426 = var3.method3247();
                if (Statics.field1426 >= 100) {
                    Statics.field490 = Statics.field2117 * 128 + 64;
                    Statics.field1155 = Statics.field1039 * 128 + 64;
                    Statics.field2124 = method261(Statics.field490, Statics.field1155, Statics.field2735) - Statics.field2651;
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2331 == arg0.field1437) {
                field837 = var3.method3285() * 30;
                field908 = field989;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2268 == arg0.field1437) {
                Statics.field1278.method1581(var3, arg0.field1438);
                field998 = field989;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2289 == arg0.field1437) {
                method1895();
                int var108 = var3.method3261();
                int var109 = var3.method3275();
                int var110 = var3.method3277();
                field1010[var109] = var108;
                field938[var109] = var110;
                field939[var109] = 1;
                for (int var111 = 0; var111 < 98; var111++) {
                    if (var108 >= class243.field2962[var111]) {
                        field939[var109] = var111 + 2;
                    }
                }
                field995[++field996 - 1 & 0x1F] = var109;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2270 == arg0.field1437) {
                int var112 = var3.method3396();
                int var113 = var3.method3294();
                class67 var114 = (class67) field986.method3674((long) var113);
                class67 var115 = (class67) field986.method3674((long) var112);
                if (var115 != null) {
                    method3502(var115, var114 == null || var114.field738 != var115.field738);
                }
                if (var114 != null) {
                    var114.method3726();
                    field986.method3675(var114, (long) var112);
                }
                class237 var116 = class237.method1884(var113);
                if (var116 != null) {
                    method1035(var116);
                }
                class237 var117 = class237.method1884(var112);
                if (var117 != null) {
                    method1035(var117);
                    method108(Statics.field2770[var117.field2795 >>> 16], var117, true);
                }
                if (field964 != -1) {
                    method2669(field964, 1);
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2303 == arg0.field1437) {
                int var118 = var3.method3399();
                field964 = var118;
                this.method1375(false);
                method4148(var118);
                class81.method20(field964);
                for (int var119 = 0; var119 < 100; var119++) {
                    field980[var119] = true;
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2272 == arg0.field1437) {
                int var120 = var3.method3249();
                if (var120 == 65535) {
                    var120 = -1;
                }
                int var121 = var3.method3294();
                int var122 = var3.method3396();
                int var123 = var3.method3249();
                if (var123 == 65535) {
                    var123 = -1;
                }
                for (int var124 = var123; var124 <= var120; var124++) {
                    long var125 = ((long) var122 << 32) + (long) var124;
                    class213 var127 = field1007.method3674(var125);
                    if (var127 != null) {
                        var127.method3726();
                    }
                    field1007.method3675(new class219(var121), var125);
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2260 == arg0.field1437) {
                for (int var128 = 0; var128 < field923.length; var128++) {
                    if (field923[var128] != null) {
                        field923[var128].field1127 = -1;
                    }
                }
                for (int var129 = 0; var129 < field859.length; var129++) {
                    if (field859[var129] != null) {
                        field859[var129].field1127 = -1;
                    }
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2293 == arg0.field1437) {
                int var130 = arg0.field1438;
                class317 var131 = new class317();
                var131.field3867 = var3.method3247();
                var131.field3866 = var3.method3261();
                var131.field3870 = new int[var131.field3867];
                var131.field3868 = new int[var131.field3867];
                var131.field3869 = new Field[var131.field3867];
                var131.field3871 = new int[var131.field3867];
                var131.field3865 = new Method[var131.field3867];
                var131.field3872 = new byte[var131.field3867][][];
                for (int var132 = 0; var132 < var131.field3867; var132++) {
                    try {
                        int var133 = var3.method3247();
                        if (var133 == 0 || var133 == 1 || var133 == 2) {
                            String var134 = var3.method3256();
                            String var135 = var3.method3256();
                            int var136 = 0;
                            if (var133 == 1) {
                                var136 = var3.method3261();
                            }
                            var131.field3870[var132] = var133;
                            var131.field3871[var132] = var136;
                            if (class318.method3(var134).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            var131.field3869[var132] = class318.method3(var134).getDeclaredField(var135);
                        } else if (var133 == 3 || var133 == 4) {
                            String var137 = var3.method3256();
                            String var138 = var3.method3256();
                            int var139 = var3.method3247();
                            String[] var140 = new String[var139];
                            for (int var141 = 0; var141 < var139; var141++) {
                                var140[var141] = var3.method3256();
                            }
                            String var142 = var3.method3256();
                            byte[][] var143 = new byte[var139][];
                            if (var133 == 3) {
                                for (int var144 = 0; var144 < var139; var144++) {
                                    int var145 = var3.method3261();
                                    var143[var144] = new byte[var145];
                                    var3.method3447(var143[var144], 0, var145);
                                }
                            }
                            var131.field3870[var132] = var133;
                            Class[] var146 = new Class[var139];
                            for (int var147 = 0; var147 < var139; var147++) {
                                var146[var147] = class318.method3(var140[var147]);
                            }
                            Class var148 = class318.method3(var142);
                            if (class318.method3(var137).getClassLoader() == null) {
                                throw new SecurityException();
                            }
                            Method[] var149 = class318.method3(var137).getDeclaredMethods();
                            Method[] var150 = var149;
                            for (int var151 = 0; var151 < var150.length; var151++) {
                                Method var152 = var150[var151];
                                if (var152.getName().equals(var138)) {
                                    Class[] var153 = var152.getParameterTypes();
                                    if (var146.length == var153.length) {
                                        boolean var154 = true;
                                        for (int var155 = 0; var155 < var146.length; var155++) {
                                            if (var146[var155] != var153[var155]) {
                                                var154 = false;
                                                break;
                                            }
                                        }
                                        if (var154 && var148 == var152.getReturnType()) {
                                            var131.field3865[var132] = var152;
                                        }
                                    }
                                }
                            }
                            var131.field3872[var132] = var143;
                        }
                    } catch (ClassNotFoundException var258) {
                        var131.field3868[var132] = -1;
                    } catch (SecurityException var259) {
                        var131.field3868[var132] = -2;
                    } catch (NullPointerException var260) {
                        var131.field3868[var132] = -3;
                    } catch (Exception var261) {
                        var131.field3868[var132] = -4;
                    } catch (Throwable var262) {
                        var131.field3868[var132] = -5;
                    }
                }
                class318.field3873.method3720(var131);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2291 == arg0.field1437) {
                int var161 = var3.method3366();
                if (var161 == 65535) {
                    var161 = -1;
                }
                method157(var161);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2305 == arg0.field1437) {
                int var162 = var3.method3366();
                if (var162 == 65535) {
                    var162 = -1;
                }
                int var163 = var3.method3289();
                method13(var162, var163);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2277 == arg0.field1437) {
                method1047(false, arg0.field1439);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2262 == arg0.field1437) {
                class93.method2970(var3, arg0.field1438);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2259 == arg0.field1437) {
                int var164 = var3.method3396();
                int var165 = var3.method3396();
                int var166 = var3.method3366();
                if (var166 == 65535) {
                    var166 = -1;
                }
                class237 var167 = class237.method1884(var165);
                if (var167.field2777) {
                    var167.field2898 = var166;
                    var167.field2813 = var164;
                    class277 var169 = class277.method1730(var166);
                    var167.field2829 = var169.field3585;
                    var167.field2830 = var169.field3586;
                    var167.field2899 = var169.field3583;
                    var167.field2836 = var169.field3588;
                    var167.field2796 = var169.field3589;
                    var167.field2832 = var169.field3584;
                    if (var169.field3590 == 1) {
                        var167.field2859 = 1;
                    } else {
                        var167.field2859 = 2;
                    }
                    if (var167.field2833 > 0) {
                        var167.field2832 = var167.field2832 * 32 / var167.field2833;
                    } else if (var167.field2789 > 0) {
                        var167.field2832 = var167.field2832 * 32 / var167.field2789;
                    }
                    method1035(var167);
                } else if (var166 == -1) {
                    var167.field2787 = 0;
                    arg0.field1437 = null;
                    return true;
                } else {
                    class277 var168 = class277.method1730(var166);
                    var167.field2787 = 4;
                    var167.field2847 = var166;
                    var167.field2829 = var168.field3585;
                    var167.field2830 = var168.field3586;
                    var167.field2832 = var168.field3584 * 100 / var164;
                    method1035(var167);
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2297 == arg0.field1437) {
                var3.field2538 += 28;
                if (var3.method3271()) {
                    int var170 = var3.field2538 - 28;
                    method160(var3.field2541, var170);
                    if (class167.field2178 != null) {
                        try {
                            class167.field2178.method2332(0L);
                            class167.field2178.method2309(var3.field2541, var170, 24);
                        } catch (Exception var256) {
                        }
                    }
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2307 == arg0.field1437) {
                method4494(class183.field2456);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2274 == arg0.field1437) {
                String var172 = var3.method3256();
                Object[] var173 = new Object[var172.length() + 1];
                for (int var174 = var172.length() - 1; var174 >= 0; var174--) {
                    if (var172.charAt(var174) == 's') {
                        var173[var174 + 1] = var3.method3256();
                    } else {
                        var173[var174 + 1] = Integer.valueOf(var3.method3261());
                    }
                }
                var173[0] = Integer.valueOf(var3.method3261());
                class68 var175 = new class68();
                var175.field747 = var173;
                class81.method3491(var175);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2271 == arg0.field1437) {
                Statics.field775 = var3.method3275();
                Statics.field735 = var3.method3276();
                for (int var176 = Statics.field775; var176 < Statics.field775 + 8; var176++) {
                    for (int var177 = Statics.field735; var177 < Statics.field735 + 8; var177++) {
                        if (field888[Statics.field2735][var176][var177] != null) {
                            field888[Statics.field2735][var176][var177] = null;
                            method175(var176, var177);
                        }
                    }
                }
                for (class74 var178 = (class74) field1049.method3739(); var178 != null; var178 = (class74) field1049.method3745()) {
                    if (var178.field1083 >= Statics.field775 && var178.field1083 < Statics.field775 + 8 && var178.field1084 >= Statics.field735 && var178.field1084 < Statics.field735 + 8 && Statics.field2735 == var178.field1092) {
                        var178.field1094 = 0;
                    }
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2309 == arg0.field1437) {
                int var179 = var3.method3368();
                boolean var180 = var3.method3247() == 1;
                String var181 = "";
                boolean var182 = false;
                if (var180) {
                    var181 = var3.method3256();
                    if (Statics.field1278.method1580(new class292(var181, Statics.field2759))) {
                        var182 = true;
                    }
                }
                String var183 = var3.method3256();
                if (!var182) {
                    class95.method2873(var179, var181, var183);
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2324 == arg0.field1437) {
                method4325(true, var3);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2258 == arg0.field1437) {
                method2588();
                arg0.field1437 = null;
                return false;
            }
            if (class180.field2287 == arg0.field1437) {
                method4494(class183.field2451);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2330 == arg0.field1437) {
                Statics.field1278.method1575();
                field998 = field989;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2278 == arg0.field1437) {
                field1035 = var3.method3247();
                if (field1035 == 255) {
                    field1035 = 0;
                }
                field940 = var3.method3247();
                if (field940 == 255) {
                    field940 = 0;
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2283 == arg0.field1437) {
                method1895();
                field969 = var3.method3247();
                field908 = field989;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2265 == arg0.field1437) {
                field835 = var3.method3247();
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2322 == arg0.field1437) {
                field984 = true;
                Statics.field1880 = var3.method3247();
                Statics.field3805 = var3.method3247();
                Statics.field1525 = var3.method3249();
                Statics.field436 = var3.method3247();
                Statics.field760 = var3.method3247();
                if (Statics.field760 >= 100) {
                    int var184 = Statics.field1880 * 128 + 64;
                    int var185 = Statics.field3805 * 128 + 64;
                    int var186 = method261(var184, var185, Statics.field2735) - Statics.field1525;
                    int var187 = var184 - Statics.field490;
                    int var188 = var186 - Statics.field2124;
                    int var189 = var185 - Statics.field1155;
                    int var190 = (int) Math.sqrt((double) (var187 * var187 + var189 * var189));
                    Statics.field2047 = (int) (Math.atan2((double) var188, (double) var190) * 325.949D) & 0x7FF;
                    Statics.field683 = (int) (Math.atan2((double) var187, (double) var189) * -325.949D) & 0x7FF;
                    if (Statics.field2047 < 128) {
                        Statics.field2047 = 128;
                    }
                    if (Statics.field2047 > 383) {
                        Statics.field2047 = 383;
                    }
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2306 == arg0.field1437) {
                int var191 = var3.method3277();
                int var192 = var3.method3275();
                String var193 = var3.method3256();
                if (var191 >= 1 && var191 <= 8) {
                    if (var193.equalsIgnoreCase("null")) {
                        var193 = null;
                    }
                    field930[var191 - 1] = var193;
                    field868[var191 - 1] = var192 == 0;
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2285 == arg0.field1437) {
                Statics.field1278.field1194.method4824(var3, arg0.field1438);
                class95.method1723();
                if (Statics.field14 != null) {
                    Statics.field14.method4956();
                }
                field998 = field989;
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2329 == arg0.field1437) {
                int var194 = var3.method3395();
                int var195 = var3.method3261();
                int var196 = var3.method3395();
                class237 var197 = class237.method1884(var195);
                if (var197.field2853 != var194 || var197.field2788 != var196 || var197.field2783 != 0 || var197.field2784 != 0) {
                    var197.field2853 = var194;
                    var197.field2788 = var196;
                    var197.field2783 = 0;
                    var197.field2784 = 0;
                    method1035(var197);
                    this.method1288(var197);
                    if (var197.field2902 == 0) {
                        method108(Statics.field2770[var195 >> 16], var197, false);
                    }
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2275 == arg0.field1437) {
                method4494(class183.field2449);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2316 == arg0.field1437) {
                String var198 = var3.method3256();
                long var199 = (long) var3.method3249();
                long var201 = (long) var3.method3251();
                class251 var203 = (class251) class189.method2486(class251.method358(), var3.method3247());
                long var204 = (var199 << 32) + var201;
                boolean var206 = false;
                for (int var207 = 0; var207 < 100; var207++) {
                    if (field883[var207] == var204) {
                        var206 = true;
                        break;
                    }
                }
                if (Statics.field1278.method1580(new class292(var198, Statics.field2759))) {
                    var206 = true;
                }
                if (!var206 && field922 == 0) {
                    field883[field1025] = var204;
                    field1025 = (field1025 + 1) % 100;
                    String var208 = class299.method5037(class305.method965(class300.method3575(var3)));
                    byte var209;
                    if (var203.field3295) {
                        var209 = 7;
                    } else {
                        var209 = 3;
                    }
                    if (var203.field3294 == -1) {
                        class95.method2873(var209, var198, var208);
                    } else {
                        int var211 = var203.field3294;
                        String var212 = "<img=" + var211 + ">";
                        class95.method2873(var209, var212 + var198, var208);
                    }
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2288 == arg0.field1437) {
                String var213 = var3.method3256();
                long var214 = var3.method3253();
                long var216 = (long) var3.method3249();
                long var218 = (long) var3.method3251();
                class251 var220 = (class251) class189.method2486(class251.method358(), var3.method3247());
                long var221 = (var216 << 32) + var218;
                boolean var223 = false;
                for (int var224 = 0; var224 < 100; var224++) {
                    if (field883[var224] == var221) {
                        var223 = true;
                        break;
                    }
                }
                if (var220.field3296 && Statics.field1278.method1580(new class292(var213, Statics.field2759))) {
                    var223 = true;
                }
                if (!var223 && field922 == 0) {
                    field883[field1025] = var221;
                    field1025 = (field1025 + 1) % 100;
                    String var225 = class299.method5037(class305.method965(class300.method3575(var3)));
                    if (var220.field3294 == -1) {
                        class95.method660(9, var213, var225, class303.method651(var214));
                    } else {
                        int var226 = var220.field3294;
                        String var227 = "<img=" + var226 + ">";
                        class95.method660(9, var227 + var213, var225, class303.method651(var214));
                    }
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2319 == arg0.field1437) {
                method4494(class183.field2450);
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2298 == arg0.field1437) {
                int var228 = var3.method3399();
                int var229 = var3.method3294();
                int var230 = var3.method3285();
                int var231 = var3.method3366();
                class237 var232 = class237.method1884(var229);
                if (var232.field2829 != var228 || var232.field2830 != var230 || var232.field2832 != var231) {
                    var232.field2829 = var228;
                    var232.field2830 = var230;
                    var232.field2832 = var231;
                    method1035(var232);
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2336 == arg0.field1437) {
                field838 = var3.method3247();
                if (field838 == 1) {
                    field839 = var3.method3249();
                }
                if (field838 >= 2 && field838 <= 6) {
                    if (field838 == 2) {
                        field844 = 64;
                        field1074 = 64;
                    }
                    if (field838 == 3) {
                        field844 = 0;
                        field1074 = 64;
                    }
                    if (field838 == 4) {
                        field844 = 128;
                        field1074 = 64;
                    }
                    if (field838 == 5) {
                        field844 = 64;
                        field1074 = 0;
                    }
                    if (field838 == 6) {
                        field844 = 64;
                        field1074 = 128;
                    }
                    field838 = 2;
                    field841 = var3.method3249();
                    field842 = var3.method3249();
                    field843 = var3.method3247();
                }
                if (field838 == 10) {
                    field925 = var3.method3249();
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2335 == arg0.field1437) {
                int var233 = arg0.field1438 + var3.field2538;
                int var234 = var3.method3249();
                int var235 = var3.method3249();
                if (field964 != var234) {
                    field964 = var234;
                    this.method1375(false);
                    method4148(field964);
                    class81.method20(field964);
                    for (int var236 = 0; var236 < 100; var236++) {
                        field980[var236] = true;
                    }
                }
                while (var235-- > 0) {
                    int var237 = var3.method3261();
                    int var238 = var3.method3249();
                    int var239 = var3.method3247();
                    class67 var240 = (class67) field986.method3674((long) var237);
                    if (var240 != null && var240.field738 != var238) {
                        method3502(var240, true);
                        var240 = null;
                    }
                    if (var240 == null) {
                        class67 var241 = new class67();
                        var241.field738 = var238;
                        var241.field737 = var239;
                        field986.method3675(var241, (long) var237);
                        method4148(var238);
                        class237 var242 = class237.method1884(var237);
                        method1035(var242);
                        if (field931 != null) {
                            method1035(field931);
                            field931 = null;
                        }
                        method2386();
                        method108(Statics.field2770[var237 >> 16], var242, false);
                        class81.method20(var238);
                        if (field964 != -1) {
                            method2669(field964, 1);
                        }
                        var240 = var241;
                    }
                    var240.field740 = true;
                }
                for (class67 var244 = (class67) field986.method3677(); var244 != null; var244 = (class67) field986.method3678()) {
                    if (var244.field740) {
                        var244.field740 = false;
                    } else {
                        method3502(var244, true);
                    }
                }
                field1007 = new class211(512);
                while (var3.field2538 < var233) {
                    int var245 = var3.method3261();
                    int var246 = var3.method3249();
                    int var247 = var3.method3249();
                    int var248 = var3.method3261();
                    for (int var249 = var246; var249 <= var247; var249++) {
                        long var250 = ((long) var245 << 32) + (long) var249;
                        field1007.method3675(new class219(var248), var250);
                    }
                }
                arg0.field1437 = null;
                return true;
            }
            if (class180.field2338 == arg0.field1437) {
                if (field964 != -1) {
                    method2669(field964, 0);
                }
                arg0.field1437 = null;
                return true;
            }
            class164.method482("" + (arg0.field1437 == null ? -1 : arg0.field1437.field2337) + class86.field1268 + (arg0.field1443 == null ? -1 : arg0.field1443.field2337) + class86.field1268 + (arg0.field1444 == null ? -1 : arg0.field1444.field2337) + class86.field1268 + arg0.field1438, (Throwable) null);
            method2588();
        } catch (IOException var263) {
            if (field865 > 0) {
                method2588();
            } else {
                field913.method5145();
                method262(40);
                Statics.field12 = field864.method1902();
                field864.method1889();
            }
        } catch (Exception var264) {
            String var254 = "" + (arg0.field1437 == null ? -1 : arg0.field1437.field2337) + class86.field1268 + (arg0.field1443 == null ? -1 : arg0.field1443.field2337) + class86.field1268 + (arg0.field1444 == null ? -1 : arg0.field1444.field2337) + class86.field1268 + arg0.field1438 + class86.field1268 + (Statics.field710 + Statics.field818.field1150[0]) + class86.field1268 + (Statics.field401 + Statics.field818.field1151[0]) + class86.field1268;
            for (int var255 = 0; var255 < arg0.field1438 && var255 < 50; var255++) {
                var254 = var254 + var3.field2541[var255] + class86.field1268;
            }
            class164.method482(var254, var264);
            method2588();
        }
        return true;
    }

    @ObfuscatedName("jy.hh(Lgt;S)V")
    public static final void method4494(class183 arg0) {
        class200 var1 = field864.field1439;
        if (class183.field2453 == arg0) {
            int var2 = var1.method3276();
            int var3 = (var2 >> 4 & 0x7) + Statics.field775;
            int var4 = (var2 & 0x7) + Statics.field735;
            int var5 = var1.method3275();
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = field852[var6];
            int var9 = var1.method3285();
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                method958(Statics.field2735, var3, var4, var8, var9, var6, var7, 0, -1);
            }
        } else if (class183.field2452 == arg0) {
            int var10 = var1.method3277();
            int var11 = var10 >> 2;
            int var12 = var10 & 0x3;
            int var13 = field852[var11];
            int var14 = var1.method3277();
            int var15 = (var14 >> 4 & 0x7) + Statics.field775;
            int var16 = (var14 & 0x7) + Statics.field735;
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                method958(Statics.field2735, var15, var16, var13, -1, var11, var12, 0, -1);
            }
        } else {
            if (class183.field2446 == arg0) {
                int var17 = var1.method3277();
                int var18 = var17 >> 4 & 0xF;
                int var19 = var17 & 0x7;
                int var20 = var1.method3277();
                int var21 = var1.method3285();
                int var22 = var1.method3247();
                int var23 = (var22 >> 4 & 0x7) + Statics.field775;
                int var24 = (var22 & 0x7) + Statics.field735;
                if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                    int var25 = var18 + 1;
                    if (Statics.field818.field1150[0] >= var23 - var25 && Statics.field818.field1150[0] <= var23 + var25 && Statics.field818.field1151[0] >= var24 - var25 && Statics.field818.field1151[0] <= var24 + var25 && field1042 != 0 && var19 > 0 && field950 < 50) {
                        field1044[field950] = var21;
                        field1045[field950] = var19;
                        field1046[field950] = var20;
                        field1048[field950] = null;
                        field1047[field950] = (var23 << 16) + (var24 << 8) + var18;
                        field950++;
                    }
                }
            }
            if (class183.field2449 == arg0) {
                int var26 = var1.method3277() * 4;
                int var27 = var1.method3366();
                byte var28 = var1.method3385();
                int var29 = var1.method3285();
                byte var30 = var1.method3248();
                int var31 = var1.method3264();
                int var32 = var1.method3277();
                int var33 = var1.method3285();
                int var34 = var1.method3247();
                int var35 = (var34 >> 4 & 0x7) + Statics.field775;
                int var36 = (var34 & 0x7) + Statics.field735;
                int var37 = var1.method3247() * 4;
                int var38 = var1.method3275();
                int var39 = var30 + var35;
                int var40 = var28 + var36;
                if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104 && var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104 && var29 != 65535) {
                    int var41 = var35 * 128 + 64;
                    int var42 = var36 * 128 + 64;
                    int var43 = var39 * 128 + 64;
                    int var44 = var40 * 128 + 64;
                    class91 var45 = new class91(var29, Statics.field2735, var41, var42, method261(var41, var42, Statics.field2735) - var26, field830 + var33, field830 + var27, var38, var32, var31, var37);
                    var45.method1768(var43, var44, method261(var43, var44, Statics.field2735) - var37, field830 + var33);
                    field936.method3741(var45);
                }
            } else if (class183.field2450 == arg0) {
                int var46 = var1.method3399();
                int var47 = var1.method3249();
                int var48 = var1.method3275();
                int var49 = (var48 >> 4 & 0x7) + Statics.field775;
                int var50 = (var48 & 0x7) + Statics.field735;
                if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                    class92 var51 = new class92();
                    var51.field1370 = var47;
                    var51.field1364 = var46;
                    if (field888[Statics.field2735][var49][var50] == null) {
                        field888[Statics.field2735][var49][var50] = new class214();
                    }
                    field888[Statics.field2735][var49][var50].method3741(var51);
                    method175(var49, var50);
                }
            } else if (class183.field2454 == arg0) {
                int var52 = var1.method3366();
                int var53 = var1.method3247();
                int var54 = (var53 >> 4 & 0x7) + Statics.field775;
                int var55 = (var53 & 0x7) + Statics.field735;
                if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                    class214 var56 = field888[Statics.field2735][var54][var55];
                    if (var56 != null) {
                        for (class92 var57 = (class92) var56.method3739(); var57 != null; var57 = (class92) var56.method3745()) {
                            if ((var52 & 0x7FFF) == var57.field1370) {
                                var57.method3726();
                                break;
                            }
                        }
                        if (var56.method3739() == null) {
                            field888[Statics.field2735][var54][var55] = null;
                        }
                        method175(var54, var55);
                    }
                }
            } else if (class183.field2457 == arg0) {
                int var58 = var1.method3275();
                int var59 = (var58 >> 4 & 0x7) + Statics.field775;
                int var60 = (var58 & 0x7) + Statics.field735;
                int var61 = var1.method3399();
                int var62 = var1.method3249();
                int var63 = var1.method3366();
                if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                    class214 var64 = field888[Statics.field2735][var59][var60];
                    if (var64 != null) {
                        for (class92 var65 = (class92) var64.method3739(); var65 != null; var65 = (class92) var64.method3745()) {
                            if ((var63 & 0x7FFF) == var65.field1370 && var65.field1364 == var61) {
                                var65.field1364 = var62;
                                break;
                            }
                        }
                        method175(var59, var60);
                    }
                }
            } else {
                if (class183.field2451 == arg0) {
                    byte var66 = var1.method3279();
                    int var67 = var1.method3399();
                    int var68 = var1.method3285();
                    int var69 = var1.method3366();
                    byte var70 = var1.method3248();
                    byte var71 = var1.method3279();
                    int var72 = var1.method3276();
                    int var73 = (var72 >> 4 & 0x7) + Statics.field775;
                    int var74 = (var72 & 0x7) + Statics.field735;
                    byte var75 = var1.method3248();
                    int var76 = var1.method3249();
                    int var77 = var1.method3276();
                    int var78 = var77 >> 2;
                    int var79 = var77 & 0x3;
                    int var80 = field852[var78];
                    class72 var81;
                    if (field924 == var69) {
                        var81 = Statics.field818;
                    } else {
                        var81 = field923[var69];
                    }
                    if (var81 != null) {
                        class276 var82 = class276.method1566(var67);
                        int var83;
                        int var84;
                        if (var79 == 1 || var79 == 3) {
                            var83 = var82.field3534;
                            var84 = var82.field3533;
                        } else {
                            var83 = var82.field3533;
                            var84 = var82.field3534;
                        }
                        int var85 = (var83 >> 1) + var73;
                        int var86 = (var83 + 1 >> 1) + var73;
                        int var87 = (var84 >> 1) + var74;
                        int var88 = (var84 + 1 >> 1) + var74;
                        int[][] var89 = class62.field689[Statics.field2735];
                        int var90 = var89[var85][var87] + var89[var86][var87] + var89[var85][var88] + var89[var86][var88] >> 2;
                        int var91 = (var73 << 7) + (var83 << 6);
                        int var92 = (var74 << 7) + (var84 << 6);
                        class131 var93 = var82.method4560(var78, var79, var89, var91, var90, var92);
                        if (var93 != null) {
                            method958(Statics.field2735, var73, var74, var80, -1, 0, 0, var68 + 1, var76 + 1);
                            var81.field790 = field830 + var68;
                            var81.field791 = field830 + var76;
                            var81.field795 = var93;
                            var81.field799 = var73 * 128 + var83 * 64;
                            var81.field794 = var74 * 128 + var84 * 64;
                            var81.field793 = var90;
                            if (var71 > var75) {
                                byte var94 = var71;
                                var71 = var75;
                                var75 = var94;
                            }
                            if (var66 > var70) {
                                byte var95 = var66;
                                var66 = var70;
                                var70 = var95;
                            }
                            var81.field782 = var71 + var73;
                            var81.field785 = var73 + var75;
                            var81.field797 = var66 + var74;
                            var81.field796 = var70 + var74;
                        }
                    }
                }
                if (class183.field2448 == arg0) {
                    int var96 = var1.method3275();
                    int var97 = (var96 >> 4 & 0x7) + Statics.field775;
                    int var98 = (var96 & 0x7) + Statics.field735;
                    int var99 = var1.method3399();
                    int var100 = var1.method3275();
                    int var101 = var100 >> 2;
                    int var102 = var100 & 0x3;
                    int var103 = field852[var101];
                    if (var97 >= 0 && var98 >= 0 && var97 < 103 && var98 < 103) {
                        if (var103 == 0) {
                            class140 var104 = Statics.field2065.method2753(Statics.field2735, var97, var98);
                            if (var104 != null) {
                                int var105 = var104.field2004 >> 14 & 0x7FFF;
                                if (var101 == 2) {
                                    var104.field1999 = new class97(var105, 2, var102 + 4, Statics.field2735, var97, var98, var99, false, var104.field1999);
                                    var104.field1997 = new class97(var105, 2, var102 + 1 & 0x3, Statics.field2735, var97, var98, var99, false, var104.field1997);
                                } else {
                                    var104.field1999 = new class97(var105, var101, var102, Statics.field2735, var97, var98, var99, false, var104.field1999);
                                }
                            }
                        }
                        if (var103 == 1) {
                            class145 var106 = Statics.field2065.method2694(Statics.field2735, var97, var98);
                            if (var106 != null) {
                                int var107 = var106.field2040 >> 14 & 0x7FFF;
                                if (var101 == 4 || var101 == 5) {
                                    var106.field2045 = new class97(var107, 4, var102, Statics.field2735, var97, var98, var99, false, var106.field2045);
                                } else if (var101 == 6) {
                                    var106.field2045 = new class97(var107, 4, var102 + 4, Statics.field2735, var97, var98, var99, false, var106.field2045);
                                } else if (var101 == 7) {
                                    var106.field2045 = new class97(var107, 4, (var102 + 2 & 0x3) + 4, Statics.field2735, var97, var98, var99, false, var106.field2045);
                                } else if (var101 == 8) {
                                    var106.field2045 = new class97(var107, 4, var102 + 4, Statics.field2735, var97, var98, var99, false, var106.field2045);
                                    var106.field2044 = new class97(var107, 4, (var102 + 2 & 0x3) + 4, Statics.field2735, var97, var98, var99, false, var106.field2044);
                                }
                            }
                        }
                        if (var103 == 2) {
                            class146 var108 = Statics.field2065.method2769(Statics.field2735, var97, var98);
                            if (var101 == 11) {
                                var101 = 10;
                            }
                            if (var108 != null) {
                                var108.field2052 = new class97(var108.field2058 >> 14 & 0x7FFF, var101, var102, Statics.field2735, var97, var98, var99, false, var108.field2052);
                            }
                        }
                        if (var103 == 3) {
                            class127 var109 = Statics.field2065.method2696(Statics.field2735, var97, var98);
                            if (var109 != null) {
                                var109.field1746 = new class97(var109.field1750 >> 14 & 0x7FFF, 22, var102, Statics.field2735, var97, var98, var99, false, var109.field1746);
                            }
                        }
                    }
                } else if (class183.field2456 == arg0) {
                    int var110 = var1.method3275();
                    int var111 = (var110 >> 4 & 0x7) + Statics.field775;
                    int var112 = (var110 & 0x7) + Statics.field735;
                    int var113 = var1.method3275();
                    int var114 = var1.method3285();
                    int var115 = var1.method3366();
                    if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
                        int var116 = var111 * 128 + 64;
                        int var117 = var112 * 128 + 64;
                        class82 var118 = new class82(var115, Statics.field2735, var116, var117, method261(var116, var117, Statics.field2735) - var113, var114, field830);
                        field937.method3741(var118);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bk.ht(IIIIIIIIII)V")
    public static final void method958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class74 var9 = null;
        for (class74 var10 = (class74) field1049.method3739(); var10 != null; var10 = (class74) field1049.method3745()) {
            if (var10.field1092 == arg0 && var10.field1083 == arg1 && var10.field1084 == arg2 && var10.field1090 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class74();
            var9.field1092 = arg0;
            var9.field1090 = arg3;
            var9.field1083 = arg1;
            var9.field1084 = arg2;
            method4704(var9);
            field1049.method3741(var9);
        }
        var9.field1088 = arg4;
        var9.field1085 = arg5;
        var9.field1089 = arg6;
        var9.field1081 = arg7;
        var9.field1094 = arg8;
    }

    @ObfuscatedName("bm.hb(I)V")
    public static final void method1124() {
        for (class74 var0 = (class74) field1049.method3739(); var0 != null; var0 = (class74) field1049.method3745()) {
            if (var0.field1094 == -1) {
                var0.field1081 = 0;
                method4704(var0);
            } else {
                var0.method3726();
            }
        }
    }

    @ObfuscatedName("jd.hg(Lby;B)V")
    public static final void method4704(class74 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field1090 == 0) {
            var1 = Statics.field2065.method2729(arg0.field1092, arg0.field1083, arg0.field1084);
        }
        if (arg0.field1090 == 1) {
            var1 = Statics.field2065.method2698(arg0.field1092, arg0.field1083, arg0.field1084);
        }
        if (arg0.field1090 == 2) {
            var1 = Statics.field2065.method2699(arg0.field1092, arg0.field1083, arg0.field1084);
        }
        if (arg0.field1090 == 3) {
            var1 = Statics.field2065.method2700(arg0.field1092, arg0.field1083, arg0.field1084);
        }
        if (var1 != 0) {
            int var5 = Statics.field2065.method2701(arg0.field1092, arg0.field1083, arg0.field1084, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field1091 = var2;
        arg0.field1087 = var3;
        arg0.field1086 = var4;
    }

    @ObfuscatedName("f.hd(IIIIIIII)V")
    public static final void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field826 && Statics.field2735 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2065.method2729(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2065.method2698(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2065.method2699(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2065.method2700(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2065.method2701(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2065.method2688(arg0, arg2, arg3);
                class276 var15 = class276.method1566(var12);
                if (var15.field3542 != 0) {
                    field875[arg0].method3115(arg2, arg3, var13, var14, var15.field3536);
                }
            }
            if (arg1 == 1) {
                Statics.field2065.method2733(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2065.method2690(arg0, arg2, arg3);
                class276 var16 = class276.method1566(var12);
                if (var16.field3533 + arg2 > 103 || var16.field3533 + arg3 > 103 || var16.field3534 + arg2 > 103 || var16.field3534 + arg3 > 103) {
                    return;
                }
                if (var16.field3542 != 0) {
                    field875[arg0].method3092(arg2, arg3, var16.field3533, var16.field3534, var14, var16.field3536);
                }
            }
            if (arg1 == 3) {
                Statics.field2065.method2791(arg0, arg2, arg3);
                class276 var17 = class276.method1566(var12);
                if (var17.field3542 == 1) {
                    field875[arg0].method3094(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class62.field698[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class62.method4784(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field2065, field875[arg0]);
    }

    @ObfuscatedName("e.hi(IIB)V")
    public static final void method175(int arg0, int arg1) {
        class214 var2 = field888[Statics.field2735][arg0][arg1];
        if (var2 == null) {
            Statics.field2065.method2692(Statics.field2735, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class92 var5 = null;
        for (class92 var6 = (class92) var2.method3739(); var6 != null; var6 = (class92) var2.method3745()) {
            class277 var7 = class277.method1730(var6.field1370);
            long var8 = (long) var7.field3591;
            if (var7.field3590 == 1) {
                var8 = (long) (var6.field1364 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2065.method2692(Statics.field2735, arg0, arg1);
            return;
        }
        var2.method3747(var5);
        class92 var10 = null;
        class92 var11 = null;
        for (class92 var12 = (class92) var2.method3739(); var12 != null; var12 = (class92) var2.method3745()) {
            if (var5.field1370 != var12.field1370) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1370 != var12.field1370 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2065.method2797(Statics.field2735, arg0, arg1, method261(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2735), var5, var13, var10, var11);
    }

    @ObfuscatedName("jg.hf(ZLgu;S)V")
    public static final void method4325(boolean arg0, class200 arg1) {
        field927 = 0;
        field968 = 0;
        class200 var2 = field864.field1439;
        var2.method3518();
        int var3 = var2.method3529(8);
        if (var3 < field860) {
            for (int var4 = var3; var4 < field860; var4++) {
                field893[++field927 - 1] = field840[var4];
            }
        }
        if (var3 > field860) {
            throw new RuntimeException("");
        }
        field860 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field840[var5];
            class84 var7 = field859[var6];
            int var8 = var2.method3529(1);
            if (var8 == 0) {
                field840[++field860 - 1] = var6;
                var7.field1144 = field830;
            } else {
                int var9 = var2.method3529(2);
                if (var9 == 0) {
                    field840[++field860 - 1] = var6;
                    var7.field1144 = field830;
                    field849[++field968 - 1] = var6;
                } else if (var9 == 1) {
                    field840[++field860 - 1] = var6;
                    var7.field1144 = field830;
                    int var10 = var2.method3529(3);
                    var7.method1709(var10, (byte) 1);
                    int var11 = var2.method3529(1);
                    if (var11 == 1) {
                        field849[++field968 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field840[++field860 - 1] = var6;
                    var7.field1144 = field830;
                    int var12 = var2.method3529(3);
                    var7.method1709(var12, (byte) 2);
                    int var13 = var2.method3529(3);
                    var7.method1709(var13, (byte) 2);
                    int var14 = var2.method3529(1);
                    if (var14 == 1) {
                        field849[++field968 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field893[++field927 - 1] = var6;
                }
            }
        }
        method339(arg0, arg1);
        method712(arg1);
        for (int var15 = 0; var15 < field927; var15++) {
            int var16 = field893[var15];
            if (field830 != field859[var16].field1144) {
                field859[var16].field1253 = null;
                field859[var16] = null;
            }
        }
        if (field864.field1438 != arg1.field2538) {
            throw new RuntimeException(arg1.field2538 + class86.field1268 + field864.field1438);
        }
        for (int var17 = 0; var17 < field860; var17++) {
            if (field859[field840[var17]] == null) {
                throw new RuntimeException(var17 + class86.field1268 + field860);
            }
        }
    }

    @ObfuscatedName("aq.hn(ZLgu;B)V")
    public static final void method339(boolean arg0, class200 arg1) {
        while (true) {
            if (arg1.method3528(field864.field1438) >= 27) {
                int var2 = arg1.method3529(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field859[var2] == null) {
                        field859[var2] = new class84();
                        var3 = true;
                    }
                    class84 var4 = field859[var2];
                    field840[++field860 - 1] = var2;
                    var4.field1144 = field830;
                    int var5;
                    if (arg0) {
                        var5 = arg1.method3529(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = arg1.method3529(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    var4.field1253 = class279.method2487(arg1.method3529(14));
                    int var6 = field994[arg1.method3529(3)];
                    if (var3) {
                        var4.field1146 = var4.field1117 = var6;
                    }
                    int var7;
                    if (arg0) {
                        var7 = arg1.method3529(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = arg1.method3529(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8 = arg1.method3529(1);
                    if (var8 == 1) {
                        field849[++field968 - 1] = var2;
                    }
                    int var9 = arg1.method3529(1);
                    var4.field1099 = var4.field1253.field3662;
                    var4.field1148 = var4.field1253.field3629;
                    if (var4.field1148 == 0) {
                        var4.field1117 = 0;
                    }
                    var4.field1103 = var4.field1253.field3649;
                    var4.field1100 = var4.field1253.field3643;
                    var4.field1131 = var4.field1253.field3642;
                    var4.field1106 = var4.field1253.field3640;
                    var4.field1097 = var4.field1253.field3637;
                    var4.field1101 = var4.field1253.field3638;
                    var4.field1102 = var4.field1253.field3639;
                    var4.method1710(Statics.field818.field1150[0] + var5, Statics.field818.field1151[0] + var7, var9 == 1);
                    continue;
                }
            }
            arg1.method3540();
            return;
        }
    }

    @ObfuscatedName("bb.ha(Lgu;I)V")
    public static final void method712(class200 arg0) {
        for (int var1 = 0; var1 < field968; var1++) {
            int var2 = field849[var1];
            class84 var3 = field859[var2];
            int var4 = arg0.method3247();
            if ((var4 & 0x8) != 0) {
                int var5 = arg0.method3275();
                if (var5 > 0) {
                    for (int var6 = 0; var6 < var5; var6++) {
                        int var7 = -1;
                        int var8 = -1;
                        int var9 = -1;
                        int var10 = arg0.method3368();
                        if (var10 == 32767) {
                            var10 = arg0.method3368();
                            var8 = arg0.method3368();
                            var7 = arg0.method3368();
                            var9 = arg0.method3368();
                        } else if (var10 == 32766) {
                            var10 = -1;
                        } else {
                            var8 = arg0.method3368();
                        }
                        int var11 = arg0.method3368();
                        var3.method1503(var10, var8, var7, var9, field830, var11);
                    }
                }
                int var12 = arg0.method3275();
                if (var12 > 0) {
                    for (int var13 = 0; var13 < var12; var13++) {
                        int var14 = arg0.method3368();
                        int var15 = arg0.method3368();
                        if (var15 == 32767) {
                            var3.method1504(var14);
                        } else {
                            int var16 = arg0.method3368();
                            int var17 = arg0.method3276();
                            int var18 = var15 > 0 ? arg0.method3277() : var17;
                            var3.method1505(var14, field830, var15, var16, var17, var18);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field1108 = arg0.method3366();
                int var19 = arg0.method3295();
                var3.field1136 = var19 >> 16;
                var3.field1135 = (var19 & 0xFFFF) + field830;
                var3.field1105 = 0;
                var3.field1145 = 0;
                if (var3.field1135 > field830) {
                    var3.field1105 = -1;
                }
                if (var3.field1108 == 65535) {
                    var3.field1108 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var20 = arg0.method3399();
                int var21 = arg0.method3399();
                int var22 = var3.field1133 - (var20 - Statics.field710 - Statics.field710) * 64;
                int var23 = var3.field1096 - (var21 - Statics.field401 - Statics.field401) * 64;
                if (var22 != 0 || var23 != 0) {
                    var3.field1123 = (int) (Math.atan2((double) var22, (double) var23) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1139 = arg0.method3285();
                if (var3.field1139 == 65535) {
                    var3.field1139 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field1147 = arg0.method3256();
                var3.field1111 = 100;
            }
            if ((var4 & 0x10) != 0) {
                int var24 = arg0.method3249();
                if (var24 == 65535) {
                    var24 = -1;
                }
                int var25 = arg0.method3275();
                if (var3.field1127 == var24 && var24 != -1) {
                    int var26 = class281.method2838(var24).field3697;
                    if (var26 == 1) {
                        var3.field1128 = 0;
                        var3.field1134 = 0;
                        var3.field1130 = var25;
                        var3.field1095 = 0;
                    }
                    if (var26 == 2) {
                        var3.field1095 = 0;
                    }
                } else if (var24 == -1 || var3.field1127 == -1 || class281.method2838(var24).field3691 >= class281.method2838(var3.field1127).field3691) {
                    var3.field1127 = var24;
                    var3.field1128 = 0;
                    var3.field1134 = 0;
                    var3.field1130 = var25;
                    var3.field1095 = 0;
                    var3.field1154 = var3.field1149;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1253 = class279.method2487(arg0.method3366());
                var3.field1099 = var3.field1253.field3662;
                var3.field1148 = var3.field1253.field3629;
                var3.field1103 = var3.field1253.field3649;
                var3.field1100 = var3.field1253.field3643;
                var3.field1131 = var3.field1253.field3642;
                var3.field1106 = var3.field1253.field3640;
                var3.field1097 = var3.field1253.field3637;
                var3.field1101 = var3.field1253.field3638;
                var3.field1102 = var3.field1253.field3639;
            }
        }
    }

    @ObfuscatedName("bc.hw(Lbl;IIBI)V")
    public static final void method1026(class72 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field1150[0];
        int var5 = arg0.field1151[0];
        int var6 = arg0.method1091();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method1091();
        field1077.field2251 = arg1;
        field1077.field2250 = arg2;
        field1077.field2253 = 1;
        field1077.field2249 = 1;
        class71 var10 = field1077;
        int var11 = class177.method40(var4, var5, var9, var10, field875[arg0.field803], true, field1054, field1079);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method1095(field1054[var12], field1079[var12], arg3);
            }
        }
    }

    @ObfuscatedName("g.ho(B)V")
    public static void method31() {
        Statics.method4505();
        field872[0] = class246.field3054;
        field949[0] = "";
        field946[0] = 1006;
        field1068[0] = false;
        field943 = 1;
    }

    @ObfuscatedName("bi.hs(III)V")
    public static final void method793(int arg0, int arg1) {
        if (field943 < 2 && field836 == 0 && !field959) {
            return;
        }
        int var2 = method51();
        String var3;
        if (field836 == 1 && field943 < 2) {
            var3 = class246.field3122 + class246.field3064 + field982 + " " + class86.field1272;
        } else if (field959 && field943 < 2) {
            var3 = field962 + class246.field3064 + field963 + " " + class86.field1272;
        } else {
            var3 = method60(var2);
        }
        if (field943 > 2) {
            var3 = var3 + class86.method38(16777215) + " " + '/' + " " + (field943 - 2) + class246.field3126;
        }
        Statics.field2093.method5011(var3, arg0 + 4, arg1 + 15, 16777215, 0, field830 / 1000);
    }

    @ObfuscatedName("iv.hm(IIIII)V")
    public static final void method4156(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1008; var4++) {
            if (field1013[var4] + field1002[var4] > arg0 && field1013[var4] < arg0 + arg2 && field1057[var4] + field1030[var4] > arg1 && field1030[var4] < arg1 + arg3) {
                field980[var4] = true;
            }
        }
    }

    @ObfuscatedName("bn.hc(IIIII)V")
    public static final void method1080(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field1008; var4++) {
            if (field1013[var4] + field1002[var4] > arg0 && field1013[var4] < arg0 + arg2 && field1057[var4] + field1030[var4] > arg1 && field1030[var4] < arg1 + arg3) {
                field821[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hx(I)V")
    public final void method1182() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field943 - 1; var2++) {
                if (field946[var2] < 1000 && field946[var2 + 1] > 1000) {
                    String var3 = field949[var2];
                    field949[var2] = field949[var2 + 1];
                    field949[var2 + 1] = var3;
                    String var4 = field872[var2];
                    field872[var2] = field872[var2 + 1];
                    field872[var2 + 1] = var4;
                    int var5 = field946[var2];
                    field946[var2] = field946[var2 + 1];
                    field946[var2 + 1] = var5;
                    int var6 = field944[var2];
                    field944[var2] = field944[var2 + 1];
                    field944[var2 + 1] = var6;
                    int var7 = field932[var2];
                    field932[var2] = field932[var2 + 1];
                    field932[var2 + 1] = var7;
                    int var8 = field1037[var2];
                    field1037[var2] = field1037[var2 + 1];
                    field1037[var2 + 1] = var8;
                    boolean var9 = field1068[var2];
                    field1068[var2] = field1068[var2 + 1];
                    field1068[var2 + 1] = var9;
                    var1 = false;
                }
            }
        }
        if (Statics.field349 != null || field977 != null) {
            return;
        }
        int var10 = class60.field673;
        if (field942) {
            if (var10 != 1 && (Statics.field333 || var10 != 4)) {
                int var11 = class60.field670;
                int var12 = class60.field668;
                if (var11 < Statics.field347 - 10 || var11 > Statics.field347 + Statics.field2173 + 10 || var12 < Statics.field329 - 10 || var12 > Statics.field329 + Statics.field232 + 10) {
                    field942 = false;
                    method4156(Statics.field347, Statics.field329, Statics.field2173, Statics.field232);
                }
            }
            if (var10 == 1 || !Statics.field333 && var10 == 4) {
                int var13 = Statics.field347;
                int var14 = Statics.field329;
                int var15 = Statics.field2173;
                int var16 = class60.field672;
                int var17 = class60.field675;
                int var18 = -1;
                for (int var19 = 0; var19 < field943; var19++) {
                    int var20 = (field943 - 1 - var19) * 15 + var14 + 31;
                    if (var16 > var13 && var16 < var13 + var15 && var17 > var20 - 13 && var17 < var20 + 3) {
                        var18 = var19;
                    }
                }
                if (var18 != -1) {
                    method56(var18);
                }
                field942 = false;
                method4156(Statics.field347, Statics.field329, Statics.field2173, Statics.field232);
            }
            return;
        }
        int var21 = method51();
        if ((var10 == 1 || !Statics.field333 && var10 == 4) && var21 >= 0) {
            int var22 = field946[var21];
            if (var22 == 39 || var22 == 40 || var22 == 41 || var22 == 42 || var22 == 43 || var22 == 33 || var22 == 34 || var22 == 35 || var22 == 36 || var22 == 37 || var22 == 38 || var22 == 1005) {
                label209: {
                    int var23 = field944[var21];
                    int var24 = field932[var21];
                    class237 var25 = class237.method1884(var24);
                    if (!class238.method3138(method4010(var25))) {
                        int var26 = method4010(var25);
                        boolean var27 = (var26 >> 29 & 0x1) != 0;
                        if (!var27) {
                            break label209;
                        }
                    }
                    if (Statics.field349 != null && !field920 && field943 > 0 && !this.method1145()) {
                        method5142(field917, field918);
                    }
                    field920 = false;
                    field921 = 0;
                    if (Statics.field349 != null) {
                        method1035(Statics.field349);
                    }
                    Statics.field349 = class237.method1884(var24);
                    field935 = var23;
                    field917 = class60.field672;
                    field918 = class60.field675;
                    if (var21 >= 0) {
                        method605(var21);
                    }
                    method1035(Statics.field349);
                    return;
                }
            }
        }
        if ((var10 == 1 || !Statics.field333 && var10 == 4) && this.method1145()) {
            var10 = 2;
        }
        if ((var10 == 1 || !Statics.field333 && var10 == 4) && field943 > 0) {
            method56(var21);
        }
        if (var10 == 2 && field943 > 0) {
            this.method1146(class60.field672, class60.field675);
        }
    }

    @ObfuscatedName("client.hv(I)Z")
    public final boolean method1145() {
        int var1 = method51();
        return (field941 == 1 && field943 > 2 || method2322(var1)) && !field1068[var1];
    }

    @ObfuscatedName("client.hq(IIB)V")
    public final void method1146(int arg0, int arg1) {
        int var3 = Statics.field2093.method5018(class246.field3125);
        for (int var4 = 0; var4 < field943; var4++) {
            int var5 = Statics.field2093.method5018(method60(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field943 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field9) {
            var7 = Statics.field9 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field342) {
            var8 = Statics.field342 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field2065.method2760(Statics.field2735, arg0, arg1, false);
        field942 = true;
        Statics.field347 = var7;
        Statics.field329 = var8;
        Statics.field2173 = var3;
        Statics.field232 = field943 * 15 + 22;
    }

    @ObfuscatedName("de.hu(II)Z")
    public static final boolean method2322(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field946[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("d.hp(IB)V")
    public static final void method56(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field944[arg0];
        int var2 = field932[arg0];
        int var3 = field946[arg0];
        int var4 = field1037[arg0];
        String var5 = field872[arg0];
        String var6 = field949[arg0];
        method655(var1, var2, var3, var4, var5, var6, class60.field672, class60.field675);
    }

    @ObfuscatedName("dx.hy(Lcl;III)V")
    public static final void method2360(class87 arg0, int arg1, int arg2) {
        method655(arg0.field1285, arg0.field1279, arg0.field1280, arg0.field1281, arg0.field1282, arg0.field1282, arg1, arg2);
    }

    @ObfuscatedName("aw.ij(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method655(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 14) {
            class72 var8 = field923[arg3];
            if (var8 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var9 = class184.method979(class181.field2361, field864.field1435);
                var9.field2468.method3479(Statics.field671);
                var9.field2468.method3281(Statics.field2064);
                var9.field2468.method3341(arg3);
                var9.field2468.method3273(class51.field593[82] ? 1 : 0);
                var9.field2468.method3233(Statics.field2556);
                field864.method1893(var9);
            }
        }
        if (arg2 == 35) {
            class184 var10 = class184.method979(class181.field2359, field864.field1435);
            var10.field2468.method3291(arg1);
            var10.field2468.method3233(arg3);
            var10.field2468.method3341(arg0);
            field864.method1893(var10);
            field914 = 0;
            Statics.field299 = class237.method1884(arg1);
            field1011 = arg0;
        }
        if (arg2 == 6) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            field1035 = arg0;
            field940 = arg1;
            class184 var11 = class184.method979(class181.field2423, field864.field1435);
            var11.field2468.method3281(Statics.field401 + arg1);
            var11.field2468.method3233(arg3 >> 14 & 0x7FFF);
            var11.field2468.method3272(class51.field593[82] ? 1 : 0);
            var11.field2468.method3281(Statics.field710 + arg0);
            field864.method1893(var11);
        }
        if (arg2 == 42) {
            class184 var12 = class184.method979(class181.field2393, field864.field1435);
            var12.field2468.method3233(arg3);
            var12.field2468.method3233(arg0);
            var12.field2468.method3324(arg1);
            field864.method1893(var12);
            field914 = 0;
            Statics.field299 = class237.method1884(arg1);
            field1011 = arg0;
        }
        if (arg2 == 45) {
            class72 var13 = field923[arg3];
            if (var13 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var14 = class184.method979(class181.field2385, field864.field1435);
                var14.field2468.method3272(class51.field593[82] ? 1 : 0);
                var14.field2468.method3233(arg3);
                field864.method1893(var14);
            }
        }
        if (arg2 == 33) {
            class184 var15 = class184.method979(class181.field2432, field864.field1435);
            var15.field2468.method3233(arg0);
            var15.field2468.method3291(arg1);
            var15.field2468.method3233(arg3);
            field864.method1893(var15);
            field914 = 0;
            Statics.field299 = class237.method1884(arg1);
            field1011 = arg0;
        }
        if (arg2 == 12) {
            class84 var16 = field859[arg3];
            if (var16 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var17 = class184.method979(class181.field2344, field864.field1435);
                var17.field2468.method3272(class51.field593[82] ? 1 : 0);
                var17.field2468.method3281(arg3);
                field864.method1893(var17);
            }
        }
        if (arg2 == 28) {
            class184 var18 = class184.method979(class181.field2373, field864.field1435);
            var18.field2468.method3235(arg1);
            field864.method1893(var18);
            class237 var19 = class237.method1884(arg1);
            if (var19.field2841 != null && var19.field2841[0][0] == 5) {
                int var20 = var19.field2841[0][1];
                class232.field2740[var20] = 1 - class232.field2740[var20];
                method2066(var20);
            }
        }
        if (arg2 == 20) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            field1035 = arg0;
            field940 = arg1;
            class184 var21 = class184.method979(class181.field2421, field864.field1435);
            var21.field2468.method3274(class51.field593[82] ? 1 : 0);
            var21.field2468.method3341(arg3);
            var21.field2468.method3341(Statics.field401 + arg1);
            var21.field2468.method3281(Statics.field710 + arg0);
            field864.method1893(var21);
        }
        if (arg2 == 4) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            field1035 = arg0;
            field940 = arg1;
            class184 var22 = class184.method979(class181.field2424, field864.field1435);
            var22.field2468.method3281(arg3 >> 14 & 0x7FFF);
            var22.field2468.method3281(Statics.field401 + arg1);
            var22.field2468.method3233(Statics.field710 + arg0);
            var22.field2468.method3232(class51.field593[82] ? 1 : 0);
            field864.method1893(var22);
        }
        if (arg2 == 50) {
            class72 var23 = field923[arg3];
            if (var23 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var24 = class184.method979(class181.field2390, field864.field1435);
                var24.field2468.method3284(arg3);
                var24.field2468.method3273(class51.field593[82] ? 1 : 0);
                field864.method1893(var24);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field251.method5548(arg2, arg3, new class233(arg0), new class233(arg1));
        }
        if (arg2 == 1005) {
            class237 var25 = class237.method1884(arg1);
            if (var25 == null || var25.field2891[arg0] < 100000) {
                class184 var26 = class184.method979(class181.field2367, field864.field1435);
                var26.field2468.method3284(arg3);
                field864.method1893(var26);
            } else {
                class95.method2873(27, "", var25.field2891[arg0] + " x " + class277.method1730(arg3).field3579);
            }
            field914 = 0;
            Statics.field299 = class237.method1884(arg1);
            field1011 = arg0;
        }
        if (arg2 == 23) {
            if (field942) {
                Statics.field2065.method2709();
            } else {
                Statics.field2065.method2760(Statics.field2735, arg0, arg1, true);
            }
        }
        if (arg2 == 43) {
            class184 var27 = class184.method979(class181.field2342, field864.field1435);
            var27.field2468.method3281(arg3);
            var27.field2468.method3233(arg0);
            var27.field2468.method3291(arg1);
            field864.method1893(var27);
            field914 = 0;
            Statics.field299 = class237.method1884(arg1);
            field1011 = arg0;
        }
        if (arg2 == 29) {
            class184 var28 = class184.method979(class181.field2373, field864.field1435);
            var28.field2468.method3235(arg1);
            field864.method1893(var28);
            class237 var29 = class237.method1884(arg1);
            if (var29.field2841 != null && var29.field2841[0][0] == 5) {
                int var30 = var29.field2841[0][1];
                if (class232.field2740[var30] != var29.field2892[0]) {
                    class232.field2740[var30] = var29.field2892[0];
                    method2066(var30);
                }
            }
        }
        if (arg2 == 8) {
            class84 var31 = field859[arg3];
            if (var31 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var32 = class184.method979(class181.field2379, field864.field1435);
                var32.field2468.method3479(Statics.field762);
                var32.field2468.method3274(class51.field593[82] ? 1 : 0);
                var32.field2468.method3233(arg3);
                var32.field2468.method3284(field960);
                field864.method1893(var32);
            }
        }
        if (arg2 == 31) {
            class184 var33 = class184.method979(class181.field2384, field864.field1435);
            var33.field2468.method3479(Statics.field671);
            var33.field2468.method3233(arg3);
            var33.field2468.method3233(Statics.field2556);
            var33.field2468.method3281(Statics.field2064);
            var33.field2468.method3235(arg1);
            var33.field2468.method3233(arg0);
            field864.method1893(var33);
            field914 = 0;
            Statics.field299 = class237.method1884(arg1);
            field1011 = arg0;
        }
        if (arg2 == 21) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            field1035 = arg0;
            field940 = arg1;
            class184 var34 = class184.method979(class181.field2382, field864.field1435);
            var34.field2468.method3273(class51.field593[82] ? 1 : 0);
            var34.field2468.method3284(arg3);
            var34.field2468.method3341(Statics.field401 + arg1);
            var34.field2468.method3284(Statics.field710 + arg0);
            field864.method1893(var34);
        }
        if (arg2 == 49) {
            class72 var35 = field923[arg3];
            if (var35 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var36 = class184.method979(class181.field2339, field864.field1435);
                var36.field2468.method3272(class51.field593[82] ? 1 : 0);
                var36.field2468.method3233(arg3);
                field864.method1893(var36);
            }
        }
        if (arg2 == 37) {
            class184 var37 = class184.method979(class181.field2402, field864.field1435);
            var37.field2468.method3233(arg0);
            var37.field2468.method3324(arg1);
            var37.field2468.method3233(arg3);
            field864.method1893(var37);
            field914 = 0;
            Statics.field299 = class237.method1884(arg1);
            field1011 = arg0;
        }
        if (arg2 == 1001) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            field1035 = arg0;
            field940 = arg1;
            class184 var38 = class184.method979(class181.field2396, field864.field1435);
            var38.field2468.method3284(Statics.field710 + arg0);
            var38.field2468.method3233(arg3 >> 14 & 0x7FFF);
            var38.field2468.method3272(class51.field593[82] ? 1 : 0);
            var38.field2468.method3341(Statics.field401 + arg1);
            field864.method1893(var38);
        }
        if (arg2 == 7) {
            class84 var39 = field859[arg3];
            if (var39 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var40 = class184.method979(class181.field2407, field864.field1435);
                var40.field2468.method3281(Statics.field2556);
                var40.field2468.method3324(Statics.field671);
                var40.field2468.method3281(arg3);
                var40.field2468.method3273(class51.field593[82] ? 1 : 0);
                var40.field2468.method3281(Statics.field2064);
                field864.method1893(var40);
            }
        }
        if (arg2 == 36) {
            class184 var41 = class184.method979(class181.field2376, field864.field1435);
            var41.field2468.method3233(arg0);
            var41.field2468.method3233(arg3);
            var41.field2468.method3291(arg1);
            field864.method1893(var41);
            field914 = 0;
            Statics.field299 = class237.method1884(arg1);
            field1011 = arg0;
        }
        if (arg2 == 16) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            field1035 = arg0;
            field940 = arg1;
            class184 var42 = class184.method979(class181.field2400, field864.field1435);
            var42.field2468.method3233(Statics.field2064);
            var42.field2468.method3291(Statics.field671);
            var42.field2468.method3281(Statics.field710 + arg0);
            var42.field2468.method3284(Statics.field401 + arg1);
            var42.field2468.method3232(class51.field593[82] ? 1 : 0);
            var42.field2468.method3233(Statics.field2556);
            var42.field2468.method3284(arg3);
            field864.method1893(var42);
        }
        if (arg2 == 18) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            field1035 = arg0;
            field940 = arg1;
            class184 var43 = class184.method979(class181.field2363, field864.field1435);
            var43.field2468.method3284(arg3);
            var43.field2468.method3233(Statics.field401 + arg1);
            var43.field2468.method3272(class51.field593[82] ? 1 : 0);
            var43.field2468.method3341(Statics.field710 + arg0);
            field864.method1893(var43);
        }
        if (arg2 == 22) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            field1035 = arg0;
            field940 = arg1;
            class184 var44 = class184.method979(class181.field2370, field864.field1435);
            var44.field2468.method3341(arg3);
            var44.field2468.method3341(Statics.field710 + arg0);
            var44.field2468.method3273(class51.field593[82] ? 1 : 0);
            var44.field2468.method3284(Statics.field401 + arg1);
            field864.method1893(var44);
        }
        if (arg2 == 26) {
            method2945();
        }
        if (arg2 == 13) {
            class84 var45 = field859[arg3];
            if (var45 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var46 = class184.method979(class181.field2360, field864.field1435);
                var46.field2468.method3284(arg3);
                var46.field2468.method3272(class51.field593[82] ? 1 : 0);
                field864.method1893(var46);
            }
        }
        if (arg2 == 41) {
            class184 var47 = class184.method979(class181.field2387, field864.field1435);
            var47.field2468.method3235(arg1);
            var47.field2468.method3341(arg3);
            var47.field2468.method3341(arg0);
            field864.method1893(var47);
            field914 = 0;
            Statics.field299 = class237.method1884(arg1);
            field1011 = arg0;
        }
        if (arg2 == 39) {
            class184 var48 = class184.method979(class181.field2362, field864.field1435);
            var48.field2468.method3479(arg1);
            var48.field2468.method3281(arg0);
            var48.field2468.method3341(arg3);
            field864.method1893(var48);
            field914 = 0;
            Statics.field299 = class237.method1884(arg1);
            field1011 = arg0;
        }
        if (arg2 == 48) {
            class72 var49 = field923[arg3];
            if (var49 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var50 = class184.method979(class181.field2372, field864.field1435);
                var50.field2468.method3284(arg3);
                var50.field2468.method3272(class51.field593[82] ? 1 : 0);
                field864.method1893(var50);
            }
        }
        if (arg2 == 40) {
            class184 var51 = class184.method979(class181.field2381, field864.field1435);
            var51.field2468.method3324(arg1);
            var51.field2468.method3233(arg3);
            var51.field2468.method3233(arg0);
            field864.method1893(var51);
            field914 = 0;
            Statics.field299 = class237.method1884(arg1);
            field1011 = arg0;
        }
        if (arg2 == 1003) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            class84 var52 = field859[arg3];
            if (var52 != null) {
                class279 var53 = var52.field1253;
                if (var53.field3658 != null) {
                    var53 = var53.method4671();
                }
                if (var53 != null) {
                    class184 var54 = class184.method979(class181.field2408, field864.field1435);
                    var54.field2468.method3341(var53.field3632);
                    field864.method1893(var54);
                }
            }
        }
        if (arg2 == 25) {
            class237 var55 = class237.method3581(arg1, arg0);
            if (var55 != null) {
                method4906();
                int var56 = class238.method1742(method4010(var55));
                int var57 = var55.field2898;
                class237 var58 = class237.method3581(arg1, arg0);
                if (var58 != null && var58.field2869 != null) {
                    class68 var59 = new class68();
                    var59.field749 = var58;
                    var59.field747 = var58.field2869;
                    class81.method3491(var59);
                }
                field961 = var57;
                field959 = true;
                Statics.field762 = arg1;
                field960 = arg0;
                Statics.field341 = var56;
                method1035(var58);
                field836 = 0;
                String var60;
                if (class238.method1742(method4010(var55)) == 0) {
                    var60 = null;
                } else if (var55.field2857 == null || var55.field2857.trim().length() == 0) {
                    var60 = null;
                } else {
                    var60 = var55.field2857;
                }
                field962 = var60;
                if (field962 == null) {
                    field962 = "Null";
                }
                if (var55.field2777) {
                    field963 = var55.field2909 + class86.method38(16777215);
                } else {
                    field963 = class86.method38(65280) + var55.field2805 + class86.method38(16777215);
                }
            }
            return;
        }
        if (arg2 == 30 && field931 == null) {
            class184 var61 = class184.method979(class181.field2413, field864.field1435);
            var61.field2468.method3233(arg0);
            var61.field2468.method3479(arg1);
            field864.method1893(var61);
            field931 = class237.method3581(arg1, arg0);
            method1035(field931);
        }
        if (arg2 == 10) {
            class84 var62 = field859[arg3];
            if (var62 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var63 = class184.method979(class181.field2371, field864.field1435);
                var63.field2468.method3274(class51.field593[82] ? 1 : 0);
                var63.field2468.method3284(arg3);
                field864.method1893(var63);
            }
        }
        if (arg2 == 32) {
            class184 var64 = class184.method979(class181.field2345, field864.field1435);
            var64.field2468.method3233(field960);
            var64.field2468.method3284(arg3);
            var64.field2468.method3324(Statics.field762);
            var64.field2468.method3479(arg1);
            var64.field2468.method3281(arg0);
            field864.method1893(var64);
            field914 = 0;
            Statics.field299 = class237.method1884(arg1);
            field1011 = arg0;
        }
        if (arg2 == 34) {
            class184 var65 = class184.method979(class181.field2353, field864.field1435);
            var65.field2468.method3233(arg3);
            var65.field2468.method3284(arg0);
            var65.field2468.method3324(arg1);
            field864.method1893(var65);
            field914 = 0;
            Statics.field299 = class237.method1884(arg1);
            field1011 = arg0;
        }
        if (arg2 == 1002) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            class184 var66 = class184.method979(class181.field2433, field864.field1435);
            var66.field2468.method3341(arg3 >> 14 & 0x7FFF);
            field864.method1893(var66);
        }
        if (arg2 == 5) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            field1035 = arg0;
            field940 = arg1;
            class184 var67 = class184.method979(class181.field2418, field864.field1435);
            var67.field2468.method3273(class51.field593[82] ? 1 : 0);
            var67.field2468.method3341(Statics.field401 + arg1);
            var67.field2468.method3284(Statics.field710 + arg0);
            var67.field2468.method3341(arg3 >> 14 & 0x7FFF);
            field864.method1893(var67);
        }
        if (arg2 == 17) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            field1035 = arg0;
            field940 = arg1;
            class184 var68 = class184.method979(class181.field2340, field864.field1435);
            var68.field2468.method3281(arg3);
            var68.field2468.method3235(Statics.field762);
            var68.field2468.method3281(field960);
            var68.field2468.method3233(Statics.field710 + arg0);
            var68.field2468.method3341(Statics.field401 + arg1);
            var68.field2468.method3274(class51.field593[82] ? 1 : 0);
            field864.method1893(var68);
        }
        if (arg2 == 19) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            field1035 = arg0;
            field940 = arg1;
            class184 var69 = class184.method979(class181.field2405, field864.field1435);
            var69.field2468.method3272(class51.field593[82] ? 1 : 0);
            var69.field2468.method3284(Statics.field401 + arg1);
            var69.field2468.method3233(Statics.field710 + arg0);
            var69.field2468.method3233(arg3);
            field864.method1893(var69);
        }
        if (arg2 == 15) {
            class72 var70 = field923[arg3];
            if (var70 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var71 = class184.method979(class181.field2426, field864.field1435);
                var71.field2468.method3272(class51.field593[82] ? 1 : 0);
                var71.field2468.method3284(arg3);
                var71.field2468.method3284(field960);
                var71.field2468.method3235(Statics.field762);
                field864.method1893(var71);
            }
        }
        if (arg2 == 11) {
            class84 var72 = field859[arg3];
            if (var72 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var73 = class184.method979(class181.field2348, field864.field1435);
                var73.field2468.method3272(class51.field593[82] ? 1 : 0);
                var73.field2468.method3341(arg3);
                field864.method1893(var73);
            }
        }
        if (arg2 == 1004) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            class184 var74 = class184.method979(class181.field2367, field864.field1435);
            var74.field2468.method3284(arg3);
            field864.method1893(var74);
        }
        if (arg2 == 47) {
            class72 var75 = field923[arg3];
            if (var75 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var76 = class184.method979(class181.field2389, field864.field1435);
                var76.field2468.method3274(class51.field593[82] ? 1 : 0);
                var76.field2468.method3281(arg3);
                field864.method1893(var76);
            }
        }
        if (arg2 == 51) {
            class72 var77 = field923[arg3];
            if (var77 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var78 = class184.method979(class181.field2358, field864.field1435);
                var78.field2468.method3233(arg3);
                var78.field2468.method3274(class51.field593[82] ? 1 : 0);
                field864.method1893(var78);
            }
        }
        if (arg2 == 2) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            field1035 = arg0;
            field940 = arg1;
            class184 var79 = class184.method979(class181.field2369, field864.field1435);
            var79.field2468.method3232(class51.field593[82] ? 1 : 0);
            var79.field2468.method3233(Statics.field401 + arg1);
            var79.field2468.method3233(Statics.field710 + arg0);
            var79.field2468.method3284(arg3 >> 14 & 0x7FFF);
            var79.field2468.method3284(field960);
            var79.field2468.method3291(Statics.field762);
            field864.method1893(var79);
        }
        if (arg2 == 24) {
            class237 var80 = class237.method1884(arg1);
            boolean var81 = true;
            if (var80.field2782 > 0) {
                var81 = method254(var80);
            }
            if (var81) {
                class184 var82 = class184.method979(class181.field2373, field864.field1435);
                var82.field2468.method3235(arg1);
                field864.method1893(var82);
            }
        }
        if (arg2 == 58) {
            class237 var83 = class237.method3581(arg1, arg0);
            if (var83 != null) {
                class184 var84 = class184.method979(class181.field2366, field864.field1435);
                var84.field2468.method3341(field961);
                var84.field2468.method3281(field960);
                var84.field2468.method3291(Statics.field762);
                var84.field2468.method3291(arg1);
                var84.field2468.method3341(var83.field2898);
                var84.field2468.method3284(arg0);
                field864.method1893(var84);
            }
        }
        if (arg2 == 44) {
            class72 var85 = field923[arg3];
            if (var85 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var86 = class184.method979(class181.field2409, field864.field1435);
                var86.field2468.method3274(class51.field593[82] ? 1 : 0);
                var86.field2468.method3233(arg3);
                field864.method1893(var86);
            }
        }
        if (arg2 == 46) {
            class72 var87 = field923[arg3];
            if (var87 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var88 = class184.method979(class181.field2414, field864.field1435);
                var88.field2468.method3273(class51.field593[82] ? 1 : 0);
                var88.field2468.method3281(arg3);
                field864.method1893(var88);
            }
        }
        if (arg2 == 1) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            field1035 = arg0;
            field940 = arg1;
            class184 var89 = class184.method979(class181.field2355, field864.field1435);
            var89.field2468.method3232(class51.field593[82] ? 1 : 0);
            var89.field2468.method3281(arg3 >> 14 & 0x7FFF);
            var89.field2468.method3233(Statics.field2556);
            var89.field2468.method3341(Statics.field710 + arg0);
            var89.field2468.method3281(Statics.field2064);
            var89.field2468.method3479(Statics.field671);
            var89.field2468.method3233(Statics.field401 + arg1);
            field864.method1893(var89);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class237 var90 = class237.method3581(arg1, arg0);
            if (var90 != null) {
                method3148(arg3, arg1, arg0, var90.field2898, arg5);
            }
        }
        if (arg2 == 38) {
            method4906();
            class237 var91 = class237.method1884(arg1);
            field836 = 1;
            Statics.field2064 = arg0;
            Statics.field671 = arg1;
            Statics.field2556 = arg3;
            method1035(var91);
            field982 = class86.method38(16748608) + class277.method1730(arg3).field3579 + class86.method38(16777215);
            if (field982 == null) {
                field982 = "null";
            }
            return;
        }
        if (arg2 == 3) {
            field905 = arg6;
            field911 = arg7;
            field1070 = 2;
            field912 = 0;
            field1035 = arg0;
            field940 = arg1;
            class184 var92 = class184.method979(class181.field2431, field864.field1435);
            var92.field2468.method3274(class51.field593[82] ? 1 : 0);
            var92.field2468.method3233(Statics.field401 + arg1);
            var92.field2468.method3284(arg3 >> 14 & 0x7FFF);
            var92.field2468.method3233(Statics.field710 + arg0);
            field864.method1893(var92);
        }
        if (arg2 == 9) {
            class84 var93 = field859[arg3];
            if (var93 != null) {
                field905 = arg6;
                field911 = arg7;
                field1070 = 2;
                field912 = 0;
                field1035 = arg0;
                field940 = arg1;
                class184 var94 = class184.method979(class181.field2377, field864.field1435);
                var94.field2468.method3233(arg3);
                var94.field2468.method3232(class51.field593[82] ? 1 : 0);
                field864.method1893(var94);
            }
        }
        if (field836 != 0) {
            field836 = 0;
            method1035(class237.method1884(Statics.field671));
        }
        if (field959) {
            method4906();
        }
        if (Statics.field299 != null && field914 == 0) {
            method1035(Statics.field299);
        }
    }

    @ObfuscatedName("ja.iy(I)V")
    public static void method4906() {
        if (!field959) {
            return;
        }
        class237 var0 = class237.method3581(Statics.field762, field960);
        if (var0 != null && var0.field2870 != null) {
            class68 var1 = new class68();
            var1.field749 = var0;
            var1.field747 = var0.field2870;
            class81.method3491(var1);
        }
        field959 = false;
        method1035(var0);
    }

    @ObfuscatedName("gc.im(IIIILjava/lang/String;I)V")
    public static void method3148(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class237 var5 = class237.method3581(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2878 != null) {
            class68 var6 = new class68();
            var6.field749 = var5;
            var6.field754 = arg0;
            var6.field751 = arg4;
            var6.field747 = var5.field2878;
            class81.method3491(var6);
        }
        boolean var7 = true;
        if (var5.field2782 > 0) {
            var7 = method254(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method4010(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class184 var11 = class184.method979(class181.field2378, field864.field1435);
            var11.field2468.method3235(arg1);
            var11.field2468.method3233(arg2);
            var11.field2468.method3233(arg3);
            field864.method1893(var11);
        }
        if (arg0 == 2) {
            class184 var12 = class184.method979(class181.field2357, field864.field1435);
            var12.field2468.method3235(arg1);
            var12.field2468.method3233(arg2);
            var12.field2468.method3233(arg3);
            field864.method1893(var12);
        }
        if (arg0 == 3) {
            class184 var13 = class184.method979(class181.field2351, field864.field1435);
            var13.field2468.method3235(arg1);
            var13.field2468.method3233(arg2);
            var13.field2468.method3233(arg3);
            field864.method1893(var13);
        }
        if (arg0 == 4) {
            class184 var14 = class184.method979(class181.field2356, field864.field1435);
            var14.field2468.method3235(arg1);
            var14.field2468.method3233(arg2);
            var14.field2468.method3233(arg3);
            field864.method1893(var14);
        }
        if (arg0 == 5) {
            class184 var15 = class184.method979(class181.field2394, field864.field1435);
            var15.field2468.method3235(arg1);
            var15.field2468.method3233(arg2);
            var15.field2468.method3233(arg3);
            field864.method1893(var15);
        }
        if (arg0 == 6) {
            class184 var16 = class184.method979(class181.field2383, field864.field1435);
            var16.field2468.method3235(arg1);
            var16.field2468.method3233(arg2);
            var16.field2468.method3233(arg3);
            field864.method1893(var16);
        }
        if (arg0 == 7) {
            class184 var17 = class184.method979(class181.field2415, field864.field1435);
            var17.field2468.method3235(arg1);
            var17.field2468.method3233(arg2);
            var17.field2468.method3233(arg3);
            field864.method1893(var17);
        }
        if (arg0 == 8) {
            class184 var18 = class184.method979(class181.field2429, field864.field1435);
            var18.field2468.method3235(arg1);
            var18.field2468.method3233(arg2);
            var18.field2468.method3233(arg3);
            field864.method1893(var18);
        }
        if (arg0 == 9) {
            class184 var19 = class184.method979(class181.field2403, field864.field1435);
            var19.field2468.method3235(arg1);
            var19.field2468.method3233(arg2);
            var19.field2468.method3233(arg3);
            field864.method1893(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class184 var20 = class184.method979(class181.field2350, field864.field1435);
        var20.field2468.method3235(arg1);
        var20.field2468.method3233(arg2);
        var20.field2468.method3233(arg3);
        field864.method1893(var20);
    }

    @ObfuscatedName("z.ip(Ljava/lang/String;Ljava/lang/String;IIIIS)V")
    public static final void method158(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var12 = false;
        if (field942 || field943 >= 500) {
            return;
        }
        field872[field943] = arg0;
        field949[field943] = arg1;
        field946[field943] = arg2;
        field1037[field943] = arg3;
        field944[field943] = arg4;
        field932[field943] = arg5;
        field1068[field943] = var12;
        field943++;
    }

    @ObfuscatedName("d.ig(B)I")
    public static final int method51() {
        return field943 - 1;
    }

    @ObfuscatedName("dg.iu(S)V")
    public static void method2386() {
        for (int var0 = 0; var0 < field943; var0++) {
            int var1 = field946[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field943 - 1) {
                    for (int var3 = var0; var3 < field943 - 1; var3++) {
                        field872[var3] = field872[var3 + 1];
                        field949[var3] = field949[var3 + 1];
                        field946[var3] = field946[var3 + 1];
                        field1037[var3] = field1037[var3 + 1];
                        field944[var3] = field944[var3 + 1];
                        field932[var3] = field932[var3 + 1];
                        field1068[var3] = field1068[var3 + 1];
                    }
                }
                field943--;
            }
        }
    }

    @ObfuscatedName("d.ic(II)Ljava/lang/String;")
    public static String method60(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field949[arg0].length() > 0) {
            return field872[arg0] + class246.field3064 + field949[arg0];
        } else {
            return field872[arg0];
        }
    }

    @ObfuscatedName("af.iq(IIIII)V")
    public static final void method267(int arg0, int arg1, int arg2, int arg3) {
        if (field836 == 0 && !field959) {
            method158(class246.field3185, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class132.field1878; var6++) {
            int var7 = class132.field1879[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field2065.method2701(Statics.field2735, var8, var9, var7) >= 0) {
                    class276 var12 = class276.method1566(var11);
                    if (var12.field3541 != null) {
                        var12 = var12.method4563();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field836 == 1) {
                        method158(class246.field3122, field982 + " " + class86.field1272 + " " + class86.method38(65535) + var12.field3525, 1, var7, var8, var9);
                    } else if (!field959) {
                        String[] var13 = var12.field3550;
                        if (field975) {
                            var13 = method1775(var13);
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
                                    method158(var13[var14], class86.method38(65535) + var12.field3525, var15, var7, var8, var9);
                                }
                            }
                        }
                        method158(class246.field3123, class86.method38(65535) + var12.field3525, 1002, var12.field3522 << 14, var8, var9);
                    } else if ((Statics.field341 & 0x4) == 4) {
                        method158(field962, field963 + " " + class86.field1272 + " " + class86.method38(65535) + var12.field3525, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class84 var16 = field859[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field1253.field3662 == 1 && (var16.field1133 & 0x7F) == 64 && (var16.field1096 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field860; var17++) {
                            class84 var18 = field859[field840[var17]];
                            if (var18 != null && var16 != var18 && var18.field1253.field3662 == 1 && var16.field1133 == var18.field1133 && var16.field1096 == var18.field1096) {
                                method3135(var18.field1253, field840[var17], var8, var9);
                            }
                        }
                        int var19 = class93.field1372;
                        int[] var20 = class93.field1377;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class72 var22 = field923[var20[var21]];
                            if (var22 != null && var16.field1133 == var22.field1133 && var16.field1096 == var22.field1096) {
                                method251(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method3135(var16.field1253, var11, var8, var9);
                }
                if (var10 == 0) {
                    class72 var23 = field923[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field1133 & 0x7F) == 64 && (var23.field1096 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field860; var24++) {
                            class84 var25 = field859[field840[var24]];
                            if (var25 != null && var25.field1253.field3662 == 1 && var23.field1133 == var25.field1133 && var23.field1096 == var25.field1096) {
                                method3135(var25.field1253, field840[var24], var8, var9);
                            }
                        }
                        int var26 = class93.field1372;
                        int[] var27 = class93.field1377;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class72 var29 = field923[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field1133 == var29.field1133 && var23.field1096 == var29.field1096) {
                                method251(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field973 == var11) {
                        var4 = var7;
                    } else {
                        method251(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class214 var30 = field888[Statics.field2735][var8][var9];
                    if (var30 != null) {
                        for (class92 var31 = (class92) var30.method3733(); var31 != null; var31 = (class92) var30.method3742()) {
                            class277 var32 = class277.method1730(var31.field1370);
                            if (field836 == 1) {
                                method158(class246.field3122, field982 + " " + class86.field1272 + " " + class86.method38(16748608) + var32.field3579, 16, var31.field1370, var8, var9);
                            } else if (!field959) {
                                String[] var33 = var32.field3593;
                                if (field975) {
                                    var33 = method1775(var33);
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
                                        method158(var33[var34], class86.method38(16748608) + var32.field3579, var35, var31.field1370, var8, var9);
                                    } else if (var34 == 2) {
                                        method158(class246.field3178, class86.method38(16748608) + var32.field3579, 20, var31.field1370, var8, var9);
                                    }
                                }
                                method158(class246.field3123, class86.method38(16748608) + var32.field3579, 1004, var31.field1370, var8, var9);
                            } else if ((Statics.field341 & 0x1) == 1) {
                                method158(field962, field963 + " " + class86.field1272 + " " + class86.method38(16748608) + var32.field3579, 17, var31.field1370, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class72 var38 = field923[field973];
            method251(var38, field973, var36, var37);
        }
    }

    @ObfuscatedName("fd.il(Ljd;IIII)V")
    public static final void method3135(class279 arg0, int arg1, int arg2, int arg3) {
        if (field943 >= 400) {
            return;
        }
        if (arg0.field3658 != null) {
            arg0 = arg0.method4671();
        }
        if (arg0 == null || !arg0.field3661 || arg0.field3663 && field997 != arg1) {
            return;
        }
        String var4 = arg0.field3633;
        if (arg0.field3650 != 0) {
            var4 = var4 + method2980(arg0.field3650, Statics.field818.field787) + " " + class86.field1267 + class246.field3087 + arg0.field3650 + class86.field1270;
        }
        if (arg0.field3663 && field951) {
            method158(class246.field3123, class86.method38(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field836 == 1) {
            method158(class246.field3122, field982 + " " + class86.field1272 + " " + class86.method38(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field959) {
            int var5 = arg0.field3663 && field951 ? 2000 : 0;
            String[] var6 = arg0.field3648;
            if (field975) {
                var6 = method1775(var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].equalsIgnoreCase(class246.field3124)) {
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
                        method158(var6[var7], class86.method38(16776960) + var4, var8, arg1, arg2, arg3);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].equalsIgnoreCase(class246.field3124)) {
                        short var10 = 0;
                        if (field847 != class89.field1294) {
                            if (field847 == class89.field1295 || field847 == class89.field1297 && arg0.field3650 > Statics.field818.field787) {
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
                            method158(var6[var9], class86.method38(16776960) + var4, var11, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field3663 || !field951) {
                method158(class246.field3123, class86.method38(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field341 & 0x2) == 2) {
            method158(field962, field963 + " " + class86.field1272 + " " + class86.method38(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("am.ix(Lbl;IIII)V")
    public static final void method251(class72 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field818 == arg0 || field943 >= 400) {
            return;
        }
        String var4;
        if (arg0.field788 == 0) {
            var4 = arg0.field786[0] + arg0.field800 + arg0.field786[1] + method2980(arg0.field787, Statics.field818.field787) + " " + class86.field1267 + class246.field3087 + arg0.field787 + class86.field1270 + arg0.field786[2];
        } else {
            var4 = arg0.field786[0] + arg0.field800 + arg0.field786[1] + " " + class86.field1267 + class246.field3129 + arg0.field788 + class86.field1270 + arg0.field786[2];
        }
        if (field836 == 1) {
            method158(class246.field3122, field982 + " " + class86.field1272 + " " + class86.method38(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field959) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field930[var5] != null) {
                    short var6 = 0;
                    if (field930[var5].equalsIgnoreCase(class246.field3124)) {
                        if (field846 == class89.field1294) {
                            continue;
                        }
                        if (field846 == class89.field1295 || field846 == class89.field1297 && arg0.field787 > Statics.field818.field787) {
                            var6 = 2000;
                        }
                        if (Statics.field818.field801 != 0 && arg0.field801 != 0) {
                            if (Statics.field818.field801 == arg0.field801) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field868[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field929[var5] + var6;
                    method158(field930[var5], class86.method38(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field341 & 0x8) == 8) {
            method158(field962, field963 + " " + class86.field1272 + " " + class86.method38(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field943; var9++) {
            if (field946[var9] == 23) {
                field949[var9] = class86.method38(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("fc.it(III)Ljava/lang/String;")
    public static final String method2980(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class86.method38(16711680);
        } else if (var2 < -6) {
            return class86.method38(16723968);
        } else if (var2 < -3) {
            return class86.method38(16740352);
        } else if (var2 < 0) {
            return class86.method38(16756736);
        } else if (var2 > 9) {
            return class86.method38(65280);
        } else if (var2 > 6) {
            return class86.method38(4259584);
        } else if (var2 > 3) {
            return class86.method38(8453888);
        } else if (var2 > 0) {
            return class86.method38(12648192);
        } else {
            return class86.method38(16776960);
        }
    }

    @ObfuscatedName("jk.iw(IIIIIIIII)V")
    public static final void method4396(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class237.method1(arg0)) {
            Statics.field3669 = null;
            Statics.method2591(Statics.field2770[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field3669 != null) {
                Statics.method2591(Statics.field3669, -1412584499, arg1, arg2, arg3, arg4, Statics.field722, Statics.field3470, arg7);
                Statics.field3669 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field980[var8] = true;
            }
        } else {
            field980[arg7] = true;
        }
    }

    @ObfuscatedName("aw.ih(Ljava/lang/String;Lim;I)Ljava/lang/String;")
    public static String method656(String arg0, class237 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1007(arg1, var2 - 1);
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

    @ObfuscatedName("client.ik(ZI)V")
    public final void method1375(boolean arg0) {
        int var2 = field964;
        int var3 = Statics.field9;
        int var4 = Statics.field342;
        if (class237.method1(var2)) {
            method1796(Statics.field2770[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.ib(Lim;I)V")
    public void method1288(class237 arg0) {
        class237 var2 = arg0.field2807 == -1 ? null : class237.method1884(arg0.field2807);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field9;
            var4 = Statics.field342;
        } else {
            var3 = var2.field2793;
            var4 = var2.field2794;
        }
        method3988(arg0, var3, var4, false);
        method44(arg0, var3, var4);
    }

    @ObfuscatedName("f.iz([Lim;Lim;ZI)V")
    public static void method108(class237[] arg0, class237 arg1, boolean arg2) {
        int var3 = arg1.field2827 == 0 ? arg1.field2793 : arg1.field2827;
        int var4 = arg1.field2802 == 0 ? arg1.field2794 : arg1.field2802;
        method1796(arg0, arg1.field2795, var3, var4, arg2);
        if (arg1.field2863 != null) {
            method1796(arg1.field2863, arg1.field2795, var3, var4, arg2);
        }
        class67 var5 = (class67) field986.method3674((long) arg1.field2795);
        if (var5 != null) {
            int var6 = var5.field738;
            if (class237.method1(var6)) {
                method1796(Statics.field2770[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2782 == 1337) {
        }
    }

    @ObfuscatedName("ct.iv([Lim;IIIZI)V")
    public static void method1796(class237[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class237 var6 = arg0[var5];
            if (var6 != null && var6.field2807 == arg1) {
                method3988(var6, arg2, arg3, arg4);
                method44(var6, arg2, arg3);
                if (var6.field2799 > var6.field2827 - var6.field2793) {
                    var6.field2799 = var6.field2827 - var6.field2793;
                }
                if (var6.field2799 < 0) {
                    var6.field2799 = 0;
                }
                if (var6.field2778 > var6.field2802 - var6.field2794) {
                    var6.field2778 = var6.field2802 - var6.field2794;
                }
                if (var6.field2778 < 0) {
                    var6.field2778 = 0;
                }
                if (var6.field2902 == 0) {
                    method108(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("hc.ii(Lim;IIZB)V")
    public static void method3988(class237 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2793;
        int var5 = arg0.field2794;
        if (arg0.field2785 == 0) {
            arg0.field2793 = arg0.field2789;
        } else if (arg0.field2785 == 1) {
            arg0.field2793 = arg1 - arg0.field2789;
        } else if (arg0.field2785 == 2) {
            arg0.field2793 = arg0.field2789 * arg1 >> 14;
        }
        if (arg0.field2786 == 0) {
            arg0.field2794 = arg0.field2790;
        } else if (arg0.field2786 == 1) {
            arg0.field2794 = arg2 - arg0.field2790;
        } else if (arg0.field2786 == 2) {
            arg0.field2794 = arg0.field2790 * arg2 >> 14;
        }
        if (arg0.field2785 == 4) {
            arg0.field2793 = arg0.field2889 * arg0.field2794 / arg0.field2910;
        }
        if (arg0.field2786 == 4) {
            arg0.field2794 = arg0.field2910 * arg0.field2793 / arg0.field2889;
        }
        if (field1001 && arg0.field2902 == 0) {
            if (arg0.field2794 < 5 && arg0.field2793 < 5) {
                arg0.field2794 = 5;
                arg0.field2793 = 5;
            } else {
                if (arg0.field2794 <= 0) {
                    arg0.field2794 = 5;
                }
                if (arg0.field2793 <= 0) {
                    arg0.field2793 = 5;
                }
            }
        }
        if (arg0.field2782 == 1337) {
            field976 = arg0;
        }
        if (arg3 && arg0.field2887 != null && (arg0.field2793 != var4 || arg0.field2794 != var5)) {
            class68 var6 = new class68();
            var6.field749 = arg0;
            var6.field747 = arg0.field2887;
            field822.method3741(var6);
        }
    }

    @ObfuscatedName("d.ir(Lim;III)V")
    public static void method44(class237 arg0, int arg1, int arg2) {
        if (arg0.field2783 == 0) {
            arg0.field2791 = arg0.field2853;
        } else if (arg0.field2783 == 1) {
            arg0.field2791 = (arg1 - arg0.field2793) / 2 + arg0.field2853;
        } else if (arg0.field2783 == 2) {
            arg0.field2791 = arg1 - arg0.field2793 - arg0.field2853;
        } else if (arg0.field2783 == 3) {
            arg0.field2791 = arg0.field2853 * arg1 >> 14;
        } else if (arg0.field2783 == 4) {
            arg0.field2791 = (arg0.field2853 * arg1 >> 14) + (arg1 - arg0.field2793) / 2;
        } else {
            arg0.field2791 = arg1 - arg0.field2793 - (arg0.field2853 * arg1 >> 14);
        }
        if (arg0.field2784 == 0) {
            arg0.field2792 = arg0.field2788;
        } else if (arg0.field2784 == 1) {
            arg0.field2792 = (arg2 - arg0.field2794) / 2 + arg0.field2788;
        } else if (arg0.field2784 == 2) {
            arg0.field2792 = arg2 - arg0.field2794 - arg0.field2788;
        } else if (arg0.field2784 == 3) {
            arg0.field2792 = arg0.field2788 * arg2 >> 14;
        } else if (arg0.field2784 == 4) {
            arg0.field2792 = (arg0.field2788 * arg2 >> 14) + (arg2 - arg0.field2794) / 2;
        } else {
            arg0.field2792 = arg2 - arg0.field2794 - (arg0.field2788 * arg2 >> 14);
        }
        if (!field1001 || arg0.field2902 != 0) {
            return;
        }
        if (arg0.field2791 < 0) {
            arg0.field2791 = 0;
        } else if (arg0.field2793 + arg0.field2791 > arg1) {
            arg0.field2791 = arg1 - arg0.field2793;
        }
        if (arg0.field2792 < 0) {
            arg0.field2792 = 0;
        } else if (arg0.field2794 + arg0.field2792 > arg2) {
            arg0.field2792 = arg2 - arg0.field2794;
        }
    }

    @ObfuscatedName("es.is(Lim;B)Z")
    public static final boolean method2831(class237 arg0) {
        if (arg0.field2809 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2809.length; var1++) {
            int var2 = method1007(arg0, var1);
            int var3 = arg0.field2892[var1];
            if (arg0.field2809[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2809[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2809[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bt.ie(Lim;II)I")
    public static final int method1007(class237 arg0, int arg1) {
        if (arg0.field2841 == null || arg1 >= arg0.field2841.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2841[arg1];
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
                    var7 = field938[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field939[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field1010[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class237 var11 = class237.method1884(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class277.method1730(var12).field3592 || field825)) {
                        for (int var13 = 0; var13 < var11.field2896.length; var13++) {
                            if (var12 + 1 == var11.field2896[var13]) {
                                var7 += var11.field2891[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class232.field2740[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class243.field2962[field939[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class232.field2740[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field818.field787;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class243.field2960[var14]) {
                            var7 += field939[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class237 var17 = class237.method1884(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class277.method1730(var18).field3592 || field825)) {
                        for (int var19 = 0; var19 < var17.field2896.length; var19++) {
                            if (var18 + 1 == var17.field2896[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field969;
                }
                if (var6 == 12) {
                    var7 = field970;
                }
                if (var6 == 13) {
                    int var20 = class232.field2740[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class232.method248(var22);
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
                    var7 = (Statics.field818.field1133 >> 7) + Statics.field710;
                }
                if (var6 == 19) {
                    var7 = (Statics.field818.field1096 >> 7) + Statics.field401;
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

    @ObfuscatedName("jv.in(Lim;Ljx;IIZI)V")
    public static final void method4721(class237 arg0, class277 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field3594;
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
            var7 = class246.field2974;
        }
        if (var6 == -1 || var7 == null) {
            return;
        }
        String var9 = class86.method38(16748608) + arg1.field3579;
        int var11 = arg1.field3577;
        int var13 = arg0.field2795;
        if (field942 || field943 >= 500) {
            return;
        }
        field872[field943] = var7;
        field949[field943] = var9;
        field946[field943] = var6;
        field1037[field943] = var11;
        field944[field943] = arg2;
        field932[field943] = var13;
        field1068[field943] = arg4;
        field943++;
    }

    @ObfuscatedName("bu.ia(Lim;IIS)V")
    public static final void method1008(class237 arg0, int arg1, int arg2) {
        if (arg0.field2800 == 1) {
            method158(arg0.field2895, "", 24, 0, 0, arg0.field2795);
        }
        if (arg0.field2800 == 2 && !field959) {
            String var3;
            if (class238.method1742(method4010(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2857 == null || arg0.field2857.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2857;
            }
            if (var3 != null) {
                method158(var3, class86.method38(65280) + arg0.field2805, 25, 0, -1, arg0.field2795);
            }
        }
        if (arg0.field2800 == 3) {
            method158(class246.field3183, "", 26, 0, 0, arg0.field2795);
        }
        if (arg0.field2800 == 4) {
            method158(arg0.field2895, "", 28, 0, 0, arg0.field2795);
        }
        if (arg0.field2800 == 5) {
            method158(arg0.field2895, "", 29, 0, 0, arg0.field2795);
        }
        if (arg0.field2800 == 6 && field931 == null) {
            method158(arg0.field2895, "", 30, 0, -1, arg0.field2795);
        }
        if (arg0.field2902 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2794; var6++) {
                for (int var7 = 0; var7 < arg0.field2793; var7++) {
                    int var8 = (arg0.field2844 + 32) * var7;
                    int var9 = (arg0.field2845 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2846[var5];
                        var9 += arg0.field2826[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field919 = var5;
                        Statics.field1553 = arg0;
                        if (arg0.field2896[var5] > 0) {
                            label304: {
                                class277 var10 = class277.method1730(arg0.field2896[var5] - 1);
                                if (field836 == 1) {
                                    int var11 = method4010(arg0);
                                    boolean var12 = (var11 >> 30 & 0x1) != 0;
                                    if (var12) {
                                        if (Statics.field671 != arg0.field2795 || Statics.field2064 != var5) {
                                            method158(class246.field3122, field982 + " " + class86.field1272 + " " + class86.method38(16748608) + var10.field3579, 31, var10.field3577, var5, arg0.field2795);
                                        }
                                        break label304;
                                    }
                                }
                                if (field959) {
                                    int var13 = method4010(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        if ((Statics.field341 & 0x10) == 16) {
                                            method158(field962, field963 + " " + class86.field1272 + " " + class86.method38(16748608) + var10.field3579, 32, var10.field3577, var5, arg0.field2795);
                                        }
                                        break label304;
                                    }
                                }
                                String[] var15 = var10.field3594;
                                if (field975) {
                                    String[] var16 = method1775(var15);
                                }
                                int var17 = -1;
                                if (field952 && class51.field593[81]) {
                                    var17 = var10.method4617();
                                }
                                int var18 = method4010(arg0);
                                boolean var19 = (var18 >> 30 & 0x1) != 0;
                                if (var19) {
                                    for (int var20 = 4; var20 >= 3; var20--) {
                                        if (var17 != var20) {
                                            method4721(arg0, var10, var5, var20, false);
                                        }
                                    }
                                }
                                int var21 = method4010(arg0);
                                boolean var22 = (var21 >> 31 & 0x1) != 0;
                                if (var22) {
                                    method158(class246.field3122, class86.method38(16748608) + var10.field3579, 38, var10.field3577, var5, arg0.field2795);
                                }
                                int var23 = method4010(arg0);
                                boolean var24 = (var23 >> 30 & 0x1) != 0;
                                if (var24) {
                                    for (int var25 = 2; var25 >= 0; var25--) {
                                        if (var17 != var25) {
                                            method4721(arg0, var10, var5, var25, false);
                                        }
                                    }
                                    if (var17 >= 0) {
                                        method4721(arg0, var10, var5, var17, true);
                                    }
                                }
                                String[] var26 = arg0.field2849;
                                if (field975) {
                                    var26 = method1775(var26);
                                }
                                if (var26 != null) {
                                    for (int var27 = 4; var27 >= 0; var27--) {
                                        if (var26[var27] != null) {
                                            byte var28 = 0;
                                            if (var27 == 0) {
                                                var28 = 39;
                                            }
                                            if (var27 == 1) {
                                                var28 = 40;
                                            }
                                            if (var27 == 2) {
                                                var28 = 41;
                                            }
                                            if (var27 == 3) {
                                                var28 = 42;
                                            }
                                            if (var27 == 4) {
                                                var28 = 43;
                                            }
                                            method158(var26[var27], class86.method38(16748608) + var10.field3579, var28, var10.field3577, var5, arg0.field2795);
                                        }
                                    }
                                }
                                method158(class246.field3123, class86.method38(16748608) + var10.field3579, 1005, var10.field3577, var5, arg0.field2795);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2777) {
            return;
        }
        if (!field959) {
            for (int var29 = 9; var29 >= 5; var29--) {
                String var30 = method3039(arg0, var29);
                if (var30 != null) {
                    method158(var30, arg0.field2909, 1007, var29 + 1, arg0.field2769, arg0.field2795);
                }
            }
            String var31;
            if (class238.method1742(method4010(arg0)) == 0) {
                var31 = null;
            } else if (arg0.field2857 == null || arg0.field2857.trim().length() == 0) {
                var31 = null;
            } else {
                var31 = arg0.field2857;
            }
            if (var31 != null) {
                method158(var31, arg0.field2909, 25, 0, arg0.field2769, arg0.field2795);
            }
            for (int var33 = 4; var33 >= 0; var33--) {
                String var34 = method3039(arg0, var33);
                if (var34 != null) {
                    method158(var34, arg0.field2909, 57, var33 + 1, arg0.field2769, arg0.field2795);
                }
            }
            int var35 = method4010(arg0);
            boolean var36 = (var35 & 0x1) != 0;
            if (var36) {
                method158(class246.field2978, "", 30, 0, arg0.field2769, arg0.field2795);
            }
        } else if (class238.method2839(method4010(arg0)) && (Statics.field341 & 0x20) == 32) {
            method158(field962, field963 + " " + class86.field1272 + " " + arg0.field2909, 58, 0, arg0.field2769, arg0.field2795);
        }
    }

    @ObfuscatedName("gi.io([Lim;IIIIIIIS)V")
    public static final void method3207(class237[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class237 var9 = arg0[var8];
            if (var9 != null && (!var9.field2777 || var9.field2902 == 0 || var9.field2858 || method4010(var9) != 0 || field978 == var9 || var9.field2782 == 1338) && var9.field2807 == arg1 && (!var9.field2777 || !method3517(var9))) {
                int var10 = var9.field2791 + arg6;
                int var11 = var9.field2792 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2902 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2902 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2793 + var10;
                    int var19 = var9.field2794 + var11;
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
                    int var22 = var9.field2793 + var10;
                    int var23 = var9.field2794 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field977 == var9) {
                    field985 = true;
                    field1015 = var10;
                    field987 = var11;
                }
                if (!var9.field2777 || var12 < var14 && var13 < var15) {
                    int var24 = class60.field670;
                    int var25 = class60.field668;
                    if (class60.field673 != 0) {
                        var24 = class60.field672;
                        var25 = class60.field675;
                    }
                    boolean var26 = var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15;
                    if (var9.field2782 == 1337) {
                        if (!field829 && !field942 && var26) {
                            method267(var24, var25, var12, var13);
                        }
                    } else if (var9.field2782 == 1338) {
                        method1557(var9, var10, var11);
                    } else {
                        if (var9.field2782 == 1400) {
                            Statics.field251.method5498(class60.field670, class60.field668, var26, var10, var11, var9.field2793, var9.field2794);
                        }
                        if (!field942 && var26) {
                            if (var9.field2782 == 1400) {
                                Statics.field251.method5546(var10, var11, var9.field2793, var9.field2794, var24, var25);
                            } else {
                                method1008(var9, var24 - var10, var25 - var11);
                            }
                        }
                        if (var9.field2902 == 0) {
                            if (!var9.field2777 && method3517(var9) && Statics.field1390 != var9) {
                                continue;
                            }
                            method3207(arg0, var9.field2795, var12, var13, var14, var15, var10 - var9.field2799, var11 - var9.field2778);
                            if (var9.field2863 != null) {
                                method3207(var9.field2863, var9.field2795, var12, var13, var14, var15, var10 - var9.field2799, var11 - var9.field2778);
                            }
                            class67 var27 = (class67) field986.method3674((long) var9.field2795);
                            if (var27 != null) {
                                if (var27.field737 == 0 && class60.field670 >= var12 && class60.field668 >= var13 && class60.field670 < var14 && class60.field668 < var15 && !field942 && !field1001) {
                                    for (class68 var28 = (class68) field822.method3739(); var28 != null; var28 = (class68) field822.method3745()) {
                                        if (var28.field743) {
                                            var28.method3726();
                                            var28.field749.field2903 = false;
                                        }
                                    }
                                    if (Statics.field1362 == 0) {
                                        field977 = null;
                                        field978 = null;
                                    }
                                    if (!field942) {
                                        method31();
                                    }
                                }
                                int var29 = var27.field738;
                                if (class237.method1(var29)) {
                                    method3207(Statics.field2770[var29], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2777) {
                            if (var9.field2911) {
                                if (class60.field670 >= var12 && class60.field668 >= var13 && class60.field670 < var14 && class60.field668 < var15) {
                                    for (class68 var30 = (class68) field822.method3739(); var30 != null; var30 = (class68) field822.method3745()) {
                                        if (var30.field743) {
                                            var30.method3726();
                                            var30.field749.field2903 = false;
                                        }
                                    }
                                    if (Statics.field1362 == 0) {
                                        field977 = null;
                                        field978 = null;
                                    }
                                    if (!field942) {
                                        method31();
                                    }
                                }
                            } else if (var9.field2912 && class60.field670 >= var12 && class60.field668 >= var13 && class60.field670 < var14 && class60.field668 < var15) {
                                for (class68 var31 = (class68) field822.method3739(); var31 != null; var31 = (class68) field822.method3745()) {
                                    if (var31.field743 && var31.field749.field2879 == var31.field747) {
                                        var31.method3726();
                                    }
                                }
                            }
                            boolean var32;
                            if (class60.field670 >= var12 && class60.field668 >= var13 && class60.field670 < var14 && class60.field668 < var15) {
                                var32 = true;
                            } else {
                                var32 = false;
                            }
                            boolean var33 = false;
                            if ((class60.field664 == 1 || !Statics.field333 && class60.field664 == 4) && var32) {
                                var33 = true;
                            }
                            boolean var34 = false;
                            if ((class60.field673 == 1 || !Statics.field333 && class60.field673 == 4) && class60.field672 >= var12 && class60.field675 >= var13 && class60.field672 < var14 && class60.field675 < var15) {
                                var34 = true;
                            }
                            if (var34) {
                                method21(var9, class60.field672 - var10, class60.field675 - var11);
                            }
                            if (var9.field2782 == 1400) {
                                Statics.field251.method5674(class60.field670, class60.field668, var32 & var33, var32 & var34);
                            }
                            if (field977 != null && field977 != var9 && var32 && class238.method123(method4010(var9))) {
                                field981 = var9;
                            }
                            if (field978 == var9) {
                                field979 = true;
                                field983 = var10;
                                field1005 = var11;
                            }
                            if (var9.field2858) {
                                if (var32 && field1003 != 0 && var9.field2879 != null) {
                                    class68 var35 = new class68();
                                    var35.field743 = true;
                                    var35.field749 = var9;
                                    var35.field746 = field1003;
                                    var35.field747 = var9.field2879;
                                    field822.method3741(var35);
                                }
                                if (field977 != null || Statics.field349 != null || field942) {
                                    var34 = false;
                                    var33 = false;
                                    var32 = false;
                                }
                                if (!var9.field2776 && var34) {
                                    var9.field2776 = true;
                                    if (var9.field2860 != null) {
                                        class68 var36 = new class68();
                                        var36.field743 = true;
                                        var36.field749 = var9;
                                        var36.field745 = class60.field672 - var10;
                                        var36.field746 = class60.field675 - var11;
                                        var36.field747 = var9.field2860;
                                        field822.method3741(var36);
                                    }
                                }
                                if (var9.field2776 && var33 && var9.field2767 != null) {
                                    class68 var37 = new class68();
                                    var37.field743 = true;
                                    var37.field749 = var9;
                                    var37.field745 = class60.field670 - var10;
                                    var37.field746 = class60.field668 - var11;
                                    var37.field747 = var9.field2767;
                                    field822.method3741(var37);
                                }
                                if (var9.field2776 && !var33) {
                                    var9.field2776 = false;
                                    if (var9.field2862 != null) {
                                        class68 var38 = new class68();
                                        var38.field743 = true;
                                        var38.field749 = var9;
                                        var38.field745 = class60.field670 - var10;
                                        var38.field746 = class60.field668 - var11;
                                        var38.field747 = var9.field2862;
                                        field1050.method3741(var38);
                                    }
                                }
                                if (var33 && var9.field2842 != null) {
                                    class68 var39 = new class68();
                                    var39.field743 = true;
                                    var39.field749 = var9;
                                    var39.field745 = class60.field670 - var10;
                                    var39.field746 = class60.field668 - var11;
                                    var39.field747 = var9.field2842;
                                    field822.method3741(var39);
                                }
                                if (!var9.field2903 && var32) {
                                    var9.field2903 = true;
                                    if (var9.field2864 != null) {
                                        class68 var40 = new class68();
                                        var40.field743 = true;
                                        var40.field749 = var9;
                                        var40.field745 = class60.field670 - var10;
                                        var40.field746 = class60.field668 - var11;
                                        var40.field747 = var9.field2864;
                                        field822.method3741(var40);
                                    }
                                }
                                if (var9.field2903 && var32 && var9.field2865 != null) {
                                    class68 var41 = new class68();
                                    var41.field743 = true;
                                    var41.field749 = var9;
                                    var41.field745 = class60.field670 - var10;
                                    var41.field746 = class60.field668 - var11;
                                    var41.field747 = var9.field2865;
                                    field822.method3741(var41);
                                }
                                if (var9.field2903 && !var32) {
                                    var9.field2903 = false;
                                    if (var9.field2851 != null) {
                                        class68 var42 = new class68();
                                        var42.field743 = true;
                                        var42.field749 = var9;
                                        var42.field745 = class60.field670 - var10;
                                        var42.field746 = class60.field668 - var11;
                                        var42.field747 = var9.field2851;
                                        field1050.method3741(var42);
                                    }
                                }
                                if (var9.field2877 != null) {
                                    class68 var43 = new class68();
                                    var43.field749 = var9;
                                    var43.field747 = var9.field2877;
                                    field993.method3741(var43);
                                }
                                if (var9.field2852 != null && field992 > var9.field2906) {
                                    if (var9.field2872 == null || field992 - var9.field2906 > 32) {
                                        class68 var48 = new class68();
                                        var48.field749 = var9;
                                        var48.field747 = var9.field2852;
                                        field822.method3741(var48);
                                    } else {
                                        label559: for (int var44 = var9.field2906; var44 < field992; var44++) {
                                            int var45 = field991[var44 & 0x1F];
                                            for (int var46 = 0; var46 < var9.field2872.length; var46++) {
                                                if (var9.field2872[var46] == var45) {
                                                    class68 var47 = new class68();
                                                    var47.field749 = var9;
                                                    var47.field747 = var9.field2852;
                                                    field822.method3741(var47);
                                                    break label559;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2906 = field992;
                                }
                                if (var9.field2873 != null && field1017 > var9.field2781) {
                                    if (var9.field2874 == null || field1017 - var9.field2781 > 32) {
                                        class68 var53 = new class68();
                                        var53.field749 = var9;
                                        var53.field747 = var9.field2873;
                                        field822.method3741(var53);
                                    } else {
                                        label535: for (int var49 = var9.field2781; var49 < field1017; var49++) {
                                            int var50 = field898[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2874.length; var51++) {
                                                if (var9.field2874[var51] == var50) {
                                                    class68 var52 = new class68();
                                                    var52.field749 = var9;
                                                    var52.field747 = var9.field2873;
                                                    field822.method3741(var52);
                                                    break label535;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2781 = field1017;
                                }
                                if (var9.field2888 != null && field996 > var9.field2908) {
                                    if (var9.field2876 == null || field996 - var9.field2908 > 32) {
                                        class68 var58 = new class68();
                                        var58.field749 = var9;
                                        var58.field747 = var9.field2888;
                                        field822.method3741(var58);
                                    } else {
                                        label511: for (int var54 = var9.field2908; var54 < field996; var54++) {
                                            int var55 = field995[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field2876.length; var56++) {
                                                if (var9.field2876[var56] == var55) {
                                                    class68 var57 = new class68();
                                                    var57.field749 = var9;
                                                    var57.field747 = var9.field2888;
                                                    field822.method3741(var57);
                                                    break label511;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2908 = field996;
                                }
                                if (field870 > var9.field2905 && var9.field2880 != null) {
                                    class68 var59 = new class68();
                                    var59.field749 = var9;
                                    var59.field747 = var9.field2880;
                                    field822.method3741(var59);
                                }
                                if (field998 > var9.field2905 && var9.field2882 != null) {
                                    class68 var60 = new class68();
                                    var60.field749 = var9;
                                    var60.field747 = var9.field2882;
                                    field822.method3741(var60);
                                }
                                if (field999 > var9.field2905 && var9.field2883 != null) {
                                    class68 var61 = new class68();
                                    var61.field749 = var9;
                                    var61.field747 = var9.field2883;
                                    field822.method3741(var61);
                                }
                                if (field1000 > var9.field2905 && var9.field2779 != null) {
                                    class68 var62 = new class68();
                                    var62.field749 = var9;
                                    var62.field747 = var9.field2779;
                                    field822.method3741(var62);
                                }
                                if (field885 > var9.field2905 && var9.field2797 != null) {
                                    class68 var63 = new class68();
                                    var63.field749 = var9;
                                    var63.field747 = var9.field2797;
                                    field822.method3741(var63);
                                }
                                if (field908 > var9.field2905 && var9.field2831 != null) {
                                    class68 var64 = new class68();
                                    var64.field749 = var9;
                                    var64.field747 = var9.field2831;
                                    field822.method3741(var64);
                                }
                                var9.field2905 = field989;
                                if (var9.field2881 != null) {
                                    for (int var65 = 0; var65 < field1026; var65++) {
                                        class68 var66 = new class68();
                                        var66.field749 = var9;
                                        var66.field755 = field957[var65];
                                        var66.field750 = field897[var65];
                                        var66.field747 = var9.field2881;
                                        field822.method3741(var66);
                                    }
                                }
                            }
                        }
                        if (!var9.field2777 && field977 == null && Statics.field349 == null && !field942) {
                            if ((var9.field2886 >= 0 || var9.field2897 != 0) && class60.field670 >= var12 && class60.field668 >= var13 && class60.field670 < var14 && class60.field668 < var15) {
                                if (var9.field2886 >= 0) {
                                    Statics.field1390 = arg0[var9.field2886];
                                } else {
                                    Statics.field1390 = var9;
                                }
                            }
                            if (var9.field2902 == 8 && class60.field670 >= var12 && class60.field668 >= var13 && class60.field670 < var14 && class60.field668 < var15) {
                                Statics.field259 = var9;
                            }
                            if (var9.field2802 > var9.field2794) {
                                int var67 = var9.field2793 + var10;
                                int var68 = var9.field2794;
                                int var69 = var9.field2802;
                                int var70 = class60.field670;
                                int var71 = class60.field668;
                                if (field884) {
                                    field856 = 32;
                                } else {
                                    field856 = 0;
                                }
                                field884 = false;
                                if (class60.field664 == 1 || !Statics.field333 && class60.field664 == 4) {
                                    if (var70 >= var67 && var70 < var67 + 16 && var71 >= var11 && var71 < var11 + 16) {
                                        var9.field2778 -= 4;
                                        method1035(var9);
                                    } else if (var70 >= var67 && var70 < var67 + 16 && var71 >= var11 + var68 - 16 && var71 < var11 + var68) {
                                        var9.field2778 += 4;
                                        method1035(var9);
                                    } else if (var70 >= var67 - field856 && var70 < field856 + var67 + 16 && var71 >= var11 + 16 && var71 < var11 + var68 - 16) {
                                        int var72 = (var68 - 32) * var68 / var69;
                                        if (var72 < 8) {
                                            var72 = 8;
                                        }
                                        int var73 = var71 - var11 - 16 - var72 / 2;
                                        int var74 = var68 - 32 - var72;
                                        var9.field2778 = (var69 - var68) * var73 / var74;
                                        method1035(var9);
                                        field884 = true;
                                    }
                                }
                                if (field1003 != 0) {
                                    int var75 = var9.field2793;
                                    if (var70 >= var67 - var75 && var71 >= var11 && var70 < var67 + 16 && var71 <= var11 + var68) {
                                        var9.field2778 += field1003 * 45;
                                        method1035(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ei.if(IIB)V")
    public static final void method2669(int arg0, int arg1) {
        if (class237.method1(arg0)) {
            Statics.method1041(Statics.field2770[arg0], arg1);
        }
    }

    @ObfuscatedName("l.jg(Lim;IIB)V")
    public static final void method21(class237 arg0, int arg1, int arg2) {
        if (field977 != null || field942 || arg0 == null || method1867(arg0) == null) {
            return;
        }
        field977 = arg0;
        field978 = method1867(arg0);
        field1024 = arg1;
        field915 = arg2;
        Statics.field1362 = 0;
        field988 = false;
        int var3 = method51();
        if (var3 == -1) {
            return;
        }
        Statics.field311 = new class87();
        Statics.field311.field1285 = field944[var3];
        Statics.field311.field1279 = field932[var3];
        Statics.field311.field1280 = field946[var3];
        Statics.field311.field1281 = field1037[var3];
        Statics.field311.field1282 = field872[var3];
    }

    @ObfuscatedName("client.jz(B)V")
    public final void method1275() {
        method1035(field977);
        Statics.field1362++;
        if (field985 && field979) {
            int var1 = class60.field670;
            int var2 = class60.field668;
            int var3 = var1 - field1024;
            int var4 = var2 - field915;
            if (var3 < field983) {
                var3 = field983;
            }
            if (field977.field2793 + var3 > field983 + field978.field2793) {
                var3 = field983 + field978.field2793 - field977.field2793;
            }
            if (var4 < field1005) {
                var4 = field1005;
            }
            if (field977.field2794 + var4 > field1005 + field978.field2794) {
                var4 = field1005 + field978.field2794 - field977.field2794;
            }
            int var5 = var3 - field1015;
            int var6 = var4 - field987;
            int var7 = field977.field2854;
            if (Statics.field1362 > field977.field2855 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field988 = true;
            }
            int var8 = field978.field2799 + (var3 - field983);
            int var9 = field978.field2778 + (var4 - field1005);
            if (field977.field2907 != null && field988) {
                class68 var10 = new class68();
                var10.field749 = field977;
                var10.field745 = var8;
                var10.field746 = var9;
                var10.field747 = field977.field2907;
                class81.method3491(var10);
            }
            if (class60.field664 == 0) {
                if (field988) {
                    if (field977.field2868 != null) {
                        class68 var11 = new class68();
                        var11.field749 = field977;
                        var11.field745 = var8;
                        var11.field746 = var9;
                        var11.field748 = field981;
                        var11.field747 = field977.field2868;
                        class81.method3491(var11);
                    }
                    if (field981 != null) {
                        class237 var12 = field977;
                        int var13 = method4010(var12);
                        int var14 = var13 >> 17 & 0x7;
                        int var15 = var14;
                        class237 var16;
                        if (var14 == 0) {
                            var16 = null;
                        } else {
                            int var17 = 0;
                            while (true) {
                                if (var17 >= var15) {
                                    var16 = var12;
                                    break;
                                }
                                var12 = class237.method1884(var12.field2807);
                                if (var12 == null) {
                                    var16 = null;
                                    break;
                                }
                                var17++;
                            }
                        }
                        if (var16 != null) {
                            class184 var18 = class184.method979(class181.field2368, field864.field1435);
                            var18.field2468.method3291(field981.field2795);
                            var18.field2468.method3233(field977.field2769);
                            var18.field2468.method3479(field977.field2795);
                            var18.field2468.method3341(field977.field2898);
                            var18.field2468.method3284(field981.field2769);
                            var18.field2468.method3341(field981.field2898);
                            field864.method1893(var18);
                        }
                    }
                } else if (this.method1145()) {
                    this.method1146(field1024 + field1015, field987 + field915);
                } else if (field943 > 0) {
                    method5142(field1024 + field1015, field987 + field915);
                }
                field977 = null;
            }
        } else if (Statics.field1362 > 1) {
            field977 = null;
        }
    }

    @ObfuscatedName("at.ji(II)V")
    public static void method605(int arg0) {
        Statics.field311 = new class87();
        Statics.field311.field1285 = field944[arg0];
        Statics.field311.field1279 = field932[arg0];
        Statics.field311.field1280 = field946[arg0];
        Statics.field311.field1281 = field1037[arg0];
        Statics.field311.field1282 = field872[arg0];
    }

    @ObfuscatedName("kf.jl(III)V")
    public static void method5142(int arg0, int arg1) {
        method2360(Statics.field311, arg0, arg1);
        Statics.field311 = null;
    }

    @ObfuscatedName("ba.jk(Lim;B)V")
    public static void method1035(class237 arg0) {
        if (field878 == arg0.field2871) {
            field980[arg0.field2893] = true;
        }
    }

    @ObfuscatedName("cf.jp(B)V")
    public static void method1895() {
        for (class67 var0 = (class67) field986.method3677(); var0 != null; var0 = (class67) field986.method3678()) {
            int var1 = var0.field738;
            if (class237.method1(var1)) {
                boolean var2 = true;
                class237[] var3 = Statics.field2770[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2777;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2613;
                    class237 var6 = class237.method1884(var5);
                    if (var6 != null) {
                        method1035(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cs.je(Lim;I)Lim;")
    public static class237 method1867(class237 arg0) {
        class237 var1 = arg0;
        int var2 = method4010(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class237 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = class237.method1884(var1.field2807);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class237 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2861;
        }
        return var7;
    }

    @ObfuscatedName("co.jn([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1775(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("iw.jf(IB)V")
    public static final void method4148(int arg0) {
        if (!class237.method1(arg0)) {
            return;
        }
        class237[] var1 = Statics.field2770[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class237 var3 = var1[var2];
            if (var3 != null) {
                var3.field2900 = 0;
                var3.field2801 = 0;
            }
        }
    }

    @ObfuscatedName("es.jm(IS)V")
    public static final void method2832(int arg0) {
        if (class237.method1(arg0)) {
            Statics.method1731(Statics.field2770[arg0], -1);
        }
    }

    @ObfuscatedName("dw.jy(II)V")
    public static final void method2066(int arg0) {
        method1895();
        Statics.method2387();
        int var1 = Statics.method1500(arg0).field3386;
        if (var1 == 0) {
            return;
        }
        int var2 = class232.field2740[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class134.method2611(0.9D);
                ((class123) Statics.field1913).method2371(0.9D);
            }
            if (var2 == 2) {
                class134.method2611(0.8D);
                ((class123) Statics.field1913).method2371(0.8D);
            }
            if (var2 == 3) {
                class134.method2611(0.7D);
                ((class123) Statics.field1913).method2371(0.7D);
            }
            if (var2 == 4) {
                class134.method2611(0.6D);
                ((class123) Statics.field1913).method2371(0.6D);
            }
            class277.method3567();
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
            if (field972 != var3) {
                if (field972 == 0 && field1016 != -1) {
                    class224.method2898(Statics.field2107, field1016, 0, var3, false);
                    field1040 = false;
                } else if (var3 == 0) {
                    Statics.field2106.method3828();
                    class224.field2647 = 1;
                    Statics.field2472 = null;
                    field1040 = false;
                } else if (class224.field2647 == 0) {
                    Statics.field2106.method3822(var3);
                } else {
                    Statics.field2646 = var3;
                }
                field972 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field1041 = 127;
            }
            if (var2 == 1) {
                field1041 = 96;
            }
            if (var2 == 2) {
                field1041 = 64;
            }
            if (var2 == 3) {
                field1041 = 32;
            }
            if (var2 == 4) {
                field1041 = 0;
            }
        }
        if (var1 == 5) {
            field941 = var2;
        }
        if (var1 == 6) {
            field966 = var2;
        }
        if (var1 == 9) {
            field967 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field1042 = 127;
            }
            if (var2 == 1) {
                field1042 = 96;
            }
            if (var2 == 2) {
                field1042 = 64;
            }
            if (var2 == 3) {
                field1042 = 32;
            }
            if (var2 == 4) {
                field1042 = 0;
            }
        }
        if (var1 == 17) {
            field997 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class89[] var4 = new class89[] { class89.field1297, class89.field1296, class89.field1295, class89.field1294 };
            field846 = (class89) class189.method2486(var4, var2);
            if (field846 == null) {
                field846 = class89.field1297;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field973 = -1;
            } else {
                field973 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class89[] var5 = new class89[] { class89.field1297, class89.field1296, class89.field1295, class89.field1294 };
        field847 = (class89) class189.method2486(var5, var2);
        if (field847 == null) {
            field847 = class89.field1297;
        }
    }

    @ObfuscatedName("hs.jh(Lim;I)V")
    public static final void method3930(class237 arg0) {
        int var1 = arg0.field2782;
        if (var1 == 324) {
            if (field956 == -1) {
                field956 = arg0.field2875;
                field1071 = arg0.field2884;
            }
            if (field1069.field2752) {
                arg0.field2875 = field956;
            } else {
                arg0.field2875 = field1071;
            }
        } else if (var1 == 325) {
            if (field956 == -1) {
                field956 = arg0.field2875;
                field1071 = arg0.field2884;
            }
            if (field1069.field2752) {
                arg0.field2875 = field1071;
            } else {
                arg0.field2875 = field956;
            }
        } else if (var1 == 327) {
            arg0.field2829 = 150;
            arg0.field2830 = (int) (Math.sin((double) field830 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2787 = 5;
            arg0.field2847 = 0;
        } else if (var1 == 328) {
            arg0.field2829 = 150;
            arg0.field2830 = (int) (Math.sin((double) field830 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2787 = 5;
            arg0.field2847 = 1;
        }
    }

    @ObfuscatedName("fj.js(I)V")
    public static final void method2945() {
        class184 var0 = class184.method979(class181.field2397, field864.field1435);
        field864.method1893(var0);
        for (class67 var1 = (class67) field986.method3677(); var1 != null; var1 = (class67) field986.method3678()) {
            if (var1.field737 == 0 || var1.field737 == 3) {
                method3502(var1, true);
            }
        }
        if (field931 != null) {
            method1035(field931);
            field931 = null;
        }
    }

    @ObfuscatedName("gm.jb(Lbw;ZI)V")
    public static final void method3502(class67 arg0, boolean arg1) {
        int var2 = arg0.field738;
        int var3 = (int) arg0.field2613;
        arg0.method3726();
        if (arg1 && var2 != -1 && Statics.field1335[var2]) {
            Statics.field2096.method4174(var2);
            if (Statics.field2770[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2770[var2].length; var5++) {
                    if (Statics.field2770[var2][var5] != null) {
                        if (Statics.field2770[var2][var5].field2902 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2770[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2770[var2] = null;
                }
                Statics.field1335[var2] = false;
            }
        }
        method4723(var2);
        class237 var6 = class237.method1884(var3);
        if (var6 != null) {
            method1035(var6);
        }
        method2386();
        if (field964 != -1) {
            method2669(field964, 1);
        }
    }

    @ObfuscatedName("aj.jx(Lim;I)Z")
    public static final boolean method254(class237 arg0) {
        int var1 = arg0.field2782;
        if (var1 == 205) {
            field865 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field1069.method4045(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field1069.method4053(var4, var5 == 1);
        }
        if (var1 == 324) {
            field1069.method4066(false);
        }
        if (var1 == 325) {
            field1069.method4066(true);
        }
        if (var1 == 326) {
            class184 var6 = class184.method979(class181.field2399, field864.field1435);
            field1069.method4048(var6.field2468);
            field864.method1893(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aw.jj(Lim;IIII)V")
    public static final void method657(class237 arg0, int arg1, int arg2, int arg3) {
        method604();
        class231 var4 = arg0.method4081(false);
        if (var4 == null) {
            return;
        }
        class319.method5212(arg1, arg2, var4.field2733 + arg1, var4.field2731 + arg2);
        if (field835 == 2 || field835 == 5) {
            class319.method5235(arg1, arg2, 0, var4.field2734, var4.field2732);
        } else {
            int var5 = field887 & 0x7FF;
            int var6 = Statics.field818.field1133 / 32 + 48;
            int var7 = 464 - Statics.field818.field1096 / 32;
            Statics.field1881.method5354(arg1, arg2, var4.field2733, var4.field2731, var6, var7, var5, 256, var4.field2734, var4.field2732);
            for (int var8 = 0; var8 < field1031; var8++) {
                int var9 = field851[var8] * 4 + 2 - Statics.field818.field1133 / 32;
                int var10 = field1038[var8] * 4 + 2 - Statics.field818.field1096 / 32;
                Statics.method161(arg1, arg2, var9, var10, field1034[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class214 var13 = field888[Statics.field2735][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field818.field1133 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field818.field1096 / 32;
                        Statics.method161(arg1, arg2, var14, var15, Statics.field3415[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field860; var16++) {
                class84 var17 = field859[field840[var16]];
                if (var17 != null && var17.method1096()) {
                    class279 var18 = var17.field1253;
                    if (var18 != null && var18.field3658 != null) {
                        var18 = var18.method4671();
                    }
                    if (var18 != null && var18.field3631 && var18.field3661) {
                        int var19 = var17.field1133 / 32 - Statics.field818.field1133 / 32;
                        int var20 = var17.field1096 / 32 - Statics.field818.field1096 / 32;
                        Statics.method161(arg1, arg2, var19, var20, Statics.field3415[1], var4);
                    }
                }
            }
            int var21 = class93.field1372;
            int[] var22 = class93.field1377;
            for (int var23 = 0; var23 < var21; var23++) {
                class72 var24 = field923[var22[var23]];
                if (var24 != null && var24.method1096() && !var24.field802 && Statics.field818 != var24) {
                    int var25 = var24.field1133 / 32 - Statics.field818.field1133 / 32;
                    int var26 = var24.field1096 / 32 - Statics.field818.field1096 / 32;
                    boolean var27 = false;
                    if (Statics.field818.field801 != 0 && var24.field801 != 0 && Statics.field818.field801 == var24.field801) {
                        var27 = true;
                    }
                    if (var24.method1085()) {
                        Statics.method161(arg1, arg2, var25, var26, Statics.field3415[3], var4);
                    } else if (var27) {
                        Statics.method161(arg1, arg2, var25, var26, Statics.field3415[4], var4);
                    } else if (var24.method1088()) {
                        Statics.method161(arg1, arg2, var25, var26, Statics.field3415[5], var4);
                    } else {
                        Statics.method161(arg1, arg2, var25, var26, Statics.field3415[2], var4);
                    }
                }
            }
            if (field838 != 0 && field830 % 20 < 10) {
                if (field838 == 1 && field839 >= 0 && field839 < field859.length) {
                    class84 var28 = field859[field839];
                    if (var28 != null) {
                        int var29 = var28.field1133 / 32 - Statics.field818.field1133 / 32;
                        int var30 = var28.field1096 / 32 - Statics.field818.field1096 / 32;
                        method151(arg1, arg2, var29, var30, Statics.field459[1], var4);
                    }
                }
                if (field838 == 2) {
                    int var31 = field841 * 4 - Statics.field710 * 4 + 2 - Statics.field818.field1133 / 32;
                    int var32 = field842 * 4 - Statics.field401 * 4 + 2 - Statics.field818.field1096 / 32;
                    method151(arg1, arg2, var31, var32, Statics.field459[1], var4);
                }
                if (field838 == 10 && field925 >= 0 && field925 < field923.length) {
                    class72 var33 = field923[field925];
                    if (var33 != null) {
                        int var34 = var33.field1133 / 32 - Statics.field818.field1133 / 32;
                        int var35 = var33.field1096 / 32 - Statics.field818.field1096 / 32;
                        method151(arg1, arg2, var34, var35, Statics.field459[1], var4);
                    }
                }
            }
            if (field1035 != 0) {
                int var36 = field1035 * 4 + 2 - Statics.field818.field1133 / 32;
                int var37 = field940 * 4 + 2 - Statics.field818.field1096 / 32;
                Statics.method161(arg1, arg2, var36, var37, Statics.field459[0], var4);
            }
            if (!Statics.field818.field802) {
                class319.method5232(var4.field2733 / 2 + arg1 - 1, var4.field2731 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field821[arg3] = true;
    }

    @ObfuscatedName("w.jv(IIIILlm;Lhq;B)V")
    public static final void method151(int arg0, int arg1, int arg2, int arg3, class323 arg4, class231 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            Statics.method161(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field887 & 0x7FF;
        int var8 = class134.field1902[var7];
        int var9 = class134.field1917[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2733 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field477.method5355(arg5.field2733 / 2 + arg0 - var17 / 2 + var15, arg5.field2731 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("dg.jc(I)V")
    public static final void method2388() {
        for (int var0 = 0; var0 < class93.field1372; var0++) {
            class72 var1 = field923[class93.field1377[var0]];
            var1.method1117();
        }
        Iterator var2 = class95.field1400.iterator();
        while (var2.hasNext()) {
            class70 var3 = (class70) var2.next();
            var3.method1052();
        }
        if (Statics.field14 != null) {
            Statics.field14.method4960();
        }
    }

    @ObfuscatedName("ad.ju(Ljava/lang/String;S)V")
    public static final void method490(String arg0) {
        if (Statics.field14 != null) {
            class184 var1 = class184.method979(class181.field2425, field864.field1435);
            var1.field2468.method3232(class194.method564(arg0));
            var1.field2468.method3239(arg0);
            field864.method1893(var1);
        }
    }

    @ObfuscatedName("jv.jq(II)V")
    public static void method4723(int arg0) {
        for (class219 var1 = (class219) field1007.method3677(); var1 != null; var1 = (class219) field1007.method3678()) {
            if ((var1.field2613 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3726();
            }
        }
    }

    @ObfuscatedName("hq.ja(Lim;I)I")
    public static int method4010(class237 arg0) {
        class219 var1 = (class219) field1007.method3674(((long) arg0.field2795 << 32) + (long) arg0.field2769);
        return var1 == null ? arg0.field2850 : var1.field2626;
    }

    @ObfuscatedName("gh.kc(Lim;I)Z")
    public static boolean method3517(class237 arg0) {
        if (field1001) {
            if (method4010(arg0) != 0) {
                return false;
            }
            if (arg0.field2902 == 0) {
                return false;
            }
        }
        return arg0.field2798;
    }

    @ObfuscatedName("fv.ku(Lim;IB)Ljava/lang/String;")
    public static String method3039(class237 arg0, int arg1) {
        int var2 = method4010(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2878 == null) {
            return null;
        } else if (arg0.field2811 == null || arg0.field2811.length <= arg1 || arg0.field2811[arg1] == null || arg0.field2811[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2811[arg1];
        }
    }

    @ObfuscatedName("ba.kb(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method1039(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field824 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field824 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field824 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field824 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field824 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field542 != null) {
            var3 = "/p=" + Statics.field542;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field827 + "/a=" + Statics.field513 + var3 + "/";
    }

    @ObfuscatedName("bt.kd(Ljava/lang/String;ZI)V")
    public static void method1005(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1198; var5++) {
            class277 var6 = class277.method1730(var5);
            if ((!arg1 || var6.field3619) && var6.field3580 == -1 && var6.field3579.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1368 = -1;
                    Statics.field1433 = null;
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
        Statics.field1433 = var3;
        Statics.field269 = 0;
        Statics.field1368 = var4;
        String[] var9 = new String[Statics.field1368];
        for (int var10 = 0; var10 < Statics.field1368; var10++) {
            var9[var10] = class277.method1730(var3[var10]).field3579;
        }
        class191.method1559(var9, Statics.field1433);
    }

    @ObfuscatedName("z.kr([BIB)V")
    public static void method160(byte[] arg0, int arg1) {
        if (field858 == null) {
            field858 = new byte[24];
        }
        class204.method3584(arg0, arg1, field858, 0, 24);
    }

    @ObfuscatedName("client.kp(I)Lkp;")
    public class292 method1149() {
        return Statics.field818 == null ? null : Statics.field818.field800;
    }

    @ObfuscatedName("cx.km(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method1717(String arg0) {
        class251[] var1 = class251.method358();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class251 var3 = var1[var2];
            if (var3.field3294 != -1) {
                int var5 = var3.field3294;
                String var6 = "<img=" + var5 + ">";
                if (arg0.startsWith(var6)) {
                    arg0 = arg0.substring(6 + Integer.toString(var3.field3294).length());
                    break;
                }
            }
        }
        return arg0;
    }
}
