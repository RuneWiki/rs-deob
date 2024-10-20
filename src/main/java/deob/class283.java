package deob;

import java.util.Arrays;
import java.util.HashMap;

@ObfuscatedName("ko")
public class class283 extends class276 {

    @ObfuscatedName("ko.am")
    public static class283 field2995 = new class283();

    @ObfuscatedName("ko.ap")
    public static byte[] field2993 = new byte[1];

    @ObfuscatedName("ko.af")
    public static class283 field2980 = new class283();

    @ObfuscatedName("ko.aj")
    public static byte[] field2974 = new byte[1];

    @ObfuscatedName("ko.aq")
    public static class467 field3032 = new class467();

    @ObfuscatedName("ko.ar")
    public static class467 field2977 = new class467();

    @ObfuscatedName("ko.ag")
    public static class467 field2978 = new class467();

    @ObfuscatedName("ko.ao")
    public int field2979 = 0;

    @ObfuscatedName("ko.ae")
    public int[] field2984;

    @ObfuscatedName("ko.aa")
    public int[] field2981;

    @ObfuscatedName("ko.au")
    public int[] field2982;

    @ObfuscatedName("ko.an")
    public int field2983 = 0;

    @ObfuscatedName("ko.ad")
    public int[] field3022;

    @ObfuscatedName("ko.ax")
    public int[] field2985;

    @ObfuscatedName("ko.aw")
    public int[] field2986;

    @ObfuscatedName("ko.az")
    public int[] field2987;

    @ObfuscatedName("ko.av")
    public int[] field2991;

    @ObfuscatedName("ko.ak")
    public int[] field2989;

    @ObfuscatedName("ko.ay")
    public byte[] field3024;

    @ObfuscatedName("ko.as")
    public byte[] field2975;

    @ObfuscatedName("ko.ab")
    public byte[] field2992;

    @ObfuscatedName("ko.ah")
    public short[] field3018;

    @ObfuscatedName("ko.ai")
    public byte field2994 = 0;

    @ObfuscatedName("ko.ac")
    public int field3044 = 0;

    @ObfuscatedName("ko.al")
    public int[] field3040;

    @ObfuscatedName("ko.at")
    public int[] field2997;

    @ObfuscatedName("ko.bj")
    public int[] field2998;

    @ObfuscatedName("ko.bd")
    public int[][] field2999;

    @ObfuscatedName("ko.bg")
    public int[][] field3000;

    @ObfuscatedName("ko.bt")
    public int[][] field3001;

    @ObfuscatedName("ko.br")
    public int[][] field3002;

    @ObfuscatedName("ko.ba")
    public boolean field3003 = false;

    @ObfuscatedName("ko.bk")
    public int field3004;

    @ObfuscatedName("ko.bn")
    public int field3005;

    @ObfuscatedName("ko.by")
    public int field3006;

    @ObfuscatedName("ko.bc")
    public int field3007;

    @ObfuscatedName("ko.bx")
    public int field3008;

    @ObfuscatedName("ko.bf")
    public HashMap field3009 = new HashMap();

    @ObfuscatedName("ko.bv")
    public static boolean[] field3029 = new boolean[6500];

    @ObfuscatedName("ko.bm")
    public static boolean[] field3012 = new boolean[6500];

    @ObfuscatedName("ko.bq")
    public static int[] field3013 = new int[6500];

    @ObfuscatedName("ko.bb")
    public static int[] field3014 = new int[6500];

    @ObfuscatedName("ko.bh")
    public static float[] field2988 = new float[6500];

    @ObfuscatedName("ko.bw")
    public static int[] field3016 = new int[6500];

    @ObfuscatedName("ko.bi")
    public static int[] field3031 = new int[6500];

    @ObfuscatedName("ko.bu")
    public static int[] field3019 = new int[6500];

    @ObfuscatedName("ko.be")
    public static int[] field2990 = new int[6500];

    @ObfuscatedName("ko.bl")
    public static char[] field3021 = new char[6000];

    @ObfuscatedName("ko.bz")
    public static char[][] field3023 = new char[6000][512];

    @ObfuscatedName("ko.bo")
    public static int[] field2973 = new int[12];

    @ObfuscatedName("ko.cg")
    public static int[][] field3011 = new int[12][2000];

    @ObfuscatedName("ko.cb")
    public static int[] field3025 = new int[2000];

    @ObfuscatedName("ko.ci")
    public static int[] field3026 = new int[2000];

    @ObfuscatedName("ko.cv")
    public static int[] field3027 = new int[12];

    @ObfuscatedName("ko.ct")
    public static int[] field3028 = new int[10];

    @ObfuscatedName("ko.cp")
    public static int[] field2972 = new int[10];

    @ObfuscatedName("ko.cq")
    public static int[] field3017 = new int[10];

    @ObfuscatedName("ko.cl")
    public static float[] field3015 = new float[10];

    @ObfuscatedName("ko.cu")
    public static boolean field3035 = true;

    @ObfuscatedName("ko.cn")
    public static int[] field3038 = class270.field2803;

    @ObfuscatedName("ko.ch")
    public static int[] field3039 = class270.field2808;

    @ObfuscatedName("ko.cr")
    public static int[] field3043 = class270.field2807;

    @ObfuscatedName("ko.ce")
    public static int[] field3041 = class270.field2805;

    @ObfuscatedName("ko.cm")
    public static final float field2976 = class282.method845(50);

    @ObfuscatedName("ko.cj")
    public byte field3045;

    @ObfuscatedName("ko.cf")
    public byte field3046;

    @ObfuscatedName("ko.cw")
    public byte field3047;

    @ObfuscatedName("ko.cx")
    public byte field3048;

    @ObfuscatedName("ko.ca")
    public short field2996;

    public class283() {
    }

    public class283(class283[] arg0, int arg1) {
        this.field2979 = 0;
        this.field2983 = 0;
        this.field3044 = 0;
        this.field2994 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            class283 var4 = arg0[var3];
            if (var4 != null) {
                this.field2979 += var4.field2979;
                this.field2983 += var4.field2983;
                this.field3044 += var4.field3044;
                if (this.field2994 == -1) {
                    this.field2994 = var4.field2994;
                }
            }
        }
        this.method5151(this.field2979, this.field2983, this.field3044);
        this.field2979 = 0;
        this.field2983 = 0;
        this.field3044 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            this.method5129(arg0[var5]);
        }
    }

    public class283(int arg0, int arg1, int arg2, byte arg3) {
        this.method5151(arg0, arg1, arg2);
        this.field2994 = arg3;
        this.field2979 = 0;
        this.field2983 = 0;
        this.field3044 = 0;
    }

    @ObfuscatedName("ko.am(III)V")
    public void method5151(int arg0, int arg1, int arg2) {
        this.field2984 = new int[arg0];
        this.field2981 = new int[arg0];
        this.field2982 = new int[arg0];
        this.field3022 = new int[arg1];
        this.field2985 = new int[arg1];
        this.field2986 = new int[arg1];
        this.field2987 = new int[arg1];
        this.field2991 = new int[arg1];
        this.field2989 = new int[arg1];
        if (arg2 > 0) {
            this.field3040 = new int[arg2];
            this.field2997 = new int[arg2];
            this.field2998 = new int[arg2];
        }
    }

    @ObfuscatedName("ko.af(Lko;)V")
    public void method5130(class283 arg0) {
        int var2 = this.field3022.length;
        if (this.field3024 == null && (arg0.field3024 != null || this.field2994 != arg0.field2994)) {
            this.field3024 = new byte[var2];
            Arrays.fill(this.field3024, this.field2994);
        }
        if (this.field2975 == null && arg0.field2975 != null) {
            this.field2975 = new byte[var2];
            Arrays.fill(this.field2975, (byte) 0);
        }
        if (this.field3018 == null && arg0.field3018 != null) {
            this.field3018 = new short[var2];
            Arrays.fill(this.field3018, (short) -1);
        }
        if (this.field2992 == null && arg0.field2992 != null) {
            this.field2992 = new byte[var2];
            Arrays.fill(this.field2992, (byte) -1);
        }
    }

    @ObfuscatedName("ko.aj(Lko;)V")
    public void method5129(class283 arg0) {
        if (arg0 == null) {
            return;
        }
        this.method5130(arg0);
        for (int var2 = 0; var2 < arg0.field2983; var2++) {
            this.field3022[this.field2983] = arg0.field3022[var2] + this.field2979;
            this.field2985[this.field2983] = arg0.field2985[var2] + this.field2979;
            this.field2986[this.field2983] = arg0.field2986[var2] + this.field2979;
            this.field2987[this.field2983] = arg0.field2987[var2];
            this.field2991[this.field2983] = arg0.field2991[var2];
            this.field2989[this.field2983] = arg0.field2989[var2];
            if (this.field3024 != null) {
                this.field3024[this.field2983] = arg0.field3024 == null ? arg0.field2994 : arg0.field3024[var2];
            }
            if (this.field2975 != null && arg0.field2975 != null) {
                this.field2975[this.field2983] = arg0.field2975[var2];
            }
            if (this.field3018 != null) {
                this.field3018[this.field2983] = arg0.field3018 == null ? -1 : arg0.field3018[var2];
            }
            if (this.field2992 != null) {
                if (arg0.field2992 == null || arg0.field2992[var2] == -1) {
                    this.field2992[this.field2983] = -1;
                } else {
                    this.field2992[this.field2983] = (byte) (arg0.field2992[var2] + this.field3044);
                }
            }
            this.field2983++;
        }
        for (int var3 = 0; var3 < arg0.field3044; var3++) {
            this.field3040[this.field3044] = arg0.field3040[var3] + this.field2979;
            this.field2997[this.field3044] = arg0.field2997[var3] + this.field2979;
            this.field2998[this.field3044] = arg0.field2998[var3] + this.field2979;
            this.field3044++;
        }
        for (int var4 = 0; var4 < arg0.field2979; var4++) {
            this.field2984[this.field2979] = arg0.field2984[var4];
            this.field2981[this.field2979] = arg0.field2981[var4];
            this.field2982[this.field2979] = arg0.field2982[var4];
            this.field2979++;
        }
    }

    @ObfuscatedName("ko.aq([[IIIIZI)Lko;")
    public class283 method5131(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method5136();
        int var7 = arg1 - this.field3006;
        int var8 = this.field3006 + arg1;
        int var9 = arg3 - this.field3006;
        int var10 = this.field3006 + arg3;
        if (var7 < 0 || var8 + 128 >> 7 >= arg0.length || var9 < 0 || var10 + 128 >> 7 >= arg0[0].length) {
            return this;
        }
        int var11 = var7 >> 7;
        int var12 = var8 + 127 >> 7;
        int var13 = var9 >> 7;
        int var14 = var10 + 127 >> 7;
        if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
            return this;
        }
        class283 var15;
        if (arg4) {
            var15 = new class283();
            var15.field2979 = this.field2979;
            var15.field2983 = this.field2983;
            var15.field3044 = this.field3044;
            var15.field2984 = this.field2984;
            var15.field2982 = this.field2982;
            var15.field3022 = this.field3022;
            var15.field2985 = this.field2985;
            var15.field2986 = this.field2986;
            var15.field2987 = this.field2987;
            var15.field2991 = this.field2991;
            var15.field2989 = this.field2989;
            var15.field3024 = this.field3024;
            var15.field2975 = this.field2975;
            var15.field2992 = this.field2992;
            var15.field3018 = this.field3018;
            var15.field2994 = this.field2994;
            var15.field3040 = this.field3040;
            var15.field2997 = this.field2997;
            var15.field2998 = this.field2998;
            var15.field2999 = this.field2999;
            var15.field3000 = this.field3000;
            var15.field3003 = this.field3003;
            var15.field2981 = new int[var15.field2979];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2979; var16++) {
                int var17 = this.field2984[var16] + arg1;
                int var18 = this.field2982[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2981[var16] = this.field2981[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2979; var26++) {
                int var27 = (-this.field2981[var26] << 16) / this.field2910;
                if (var27 < arg5) {
                    int var28 = this.field2984[var26] + arg1;
                    int var29 = this.field2982[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2981[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2981[var26];
                }
            }
        }
        var15.method5196();
        return var15;
    }

    @ObfuscatedName("ko.ae(Z)Lko;")
    public class283 method5132(boolean arg0) {
        if (!arg0 && field2993.length < this.field2983) {
            field2993 = new byte[this.field2983 + 100];
        }
        return this.method5134(arg0, field2995, field2993);
    }

    @ObfuscatedName("ko.aa(Z)Lko;")
    public class283 method5133(boolean arg0) {
        if (!arg0 && field2974.length < this.field2983) {
            field2974 = new byte[this.field2983 + 100];
        }
        return this.method5134(arg0, field2980, field2974);
    }

    @ObfuscatedName("ko.au(ZLko;[B)Lko;")
    public class283 method5134(boolean arg0, class283 arg1, byte[] arg2) {
        arg1.field2979 = this.field2979;
        arg1.field2983 = this.field2983;
        arg1.field3044 = this.field3044;
        if (arg1.field2984 == null || arg1.field2984.length < this.field2979) {
            arg1.field2984 = new int[this.field2979 + 100];
            arg1.field2981 = new int[this.field2979 + 100];
            arg1.field2982 = new int[this.field2979 + 100];
        }
        for (int var4 = 0; var4 < this.field2979; var4++) {
            arg1.field2984[var4] = this.field2984[var4];
            arg1.field2981[var4] = this.field2981[var4];
            arg1.field2982[var4] = this.field2982[var4];
        }
        if (arg0) {
            arg1.field2975 = this.field2975;
        } else {
            arg1.field2975 = arg2;
            if (this.field2975 == null) {
                for (int var5 = 0; var5 < this.field2983; var5++) {
                    arg1.field2975[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field2983; var6++) {
                    arg1.field2975[var6] = this.field2975[var6];
                }
            }
        }
        arg1.field3022 = this.field3022;
        arg1.field2985 = this.field2985;
        arg1.field2986 = this.field2986;
        arg1.field2987 = this.field2987;
        arg1.field2991 = this.field2991;
        arg1.field2989 = this.field2989;
        arg1.field3024 = this.field3024;
        arg1.field2992 = this.field2992;
        arg1.field3018 = this.field3018;
        arg1.field2994 = this.field2994;
        arg1.field3040 = this.field3040;
        arg1.field2997 = this.field2997;
        arg1.field2998 = this.field2998;
        arg1.field2999 = this.field2999;
        arg1.field3000 = this.field3000;
        arg1.field3001 = this.field3001;
        arg1.field3002 = this.field3002;
        arg1.field3003 = this.field3003;
        arg1.method5196();
        arg1.field3048 = 0;
        return arg1;
    }

    @ObfuscatedName("ko.an(I)V")
    public void method5135(int arg0) {
        if (this.field3009.containsKey(arg0)) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field3039[arg0];
        int var9 = field3038[arg0];
        for (int var10 = 0; var10 < this.field2979; var10++) {
            int var11 = class282.method6277(this.field2984[var10], this.field2982[var10], var8, var9);
            int var12 = this.field2981[var10];
            int var13 = this.field2984[var10];
            int var14 = this.field2982[var10];
            int var15 = var8 * var14 - var9 * var13 >> 16;
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var15 < var4) {
                var4 = var15;
            }
            if (var15 > var7) {
                var7 = var15;
            }
        }
        class275 var17 = new class275((var2 + var5) / 2, (var3 + var6) / 2, (var4 + var7) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
        boolean var18 = true;
        if (var17.field2902 < 32) {
            var17.field2902 = 32;
        }
        if (var17.field2899 < 32) {
            var17.field2899 = 32;
        }
        if (this.field3003) {
            boolean var19 = true;
            var17.field2902 += 8;
            var17.field2899 += 8;
        }
        this.field3009.put(arg0, var17);
    }

    @ObfuscatedName("ko.ad()V")
    public void method5136() {
        if (this.field3004 == 1) {
            return;
        }
        this.field3004 = 1;
        this.field2910 = 0;
        this.field3005 = 0;
        this.field3006 = 0;
        for (int var1 = 0; var1 < this.field2979; var1++) {
            int var2 = this.field2984[var1];
            int var3 = this.field2981[var1];
            int var4 = this.field2982[var1];
            if (-var3 > this.field2910) {
                this.field2910 = -var3;
            }
            if (var3 > this.field3005) {
                this.field3005 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field3006) {
                this.field3006 = var5;
            }
        }
        this.field3006 = (int) (Math.sqrt((double) this.field3006) + 0.99D);
        this.field3008 = (int) (Math.sqrt((double) (this.field2910 * this.field2910 + this.field3006 * this.field3006)) + 0.99D);
        this.field3007 = this.field3008 + (int) (Math.sqrt((double) (this.field3006 * this.field3006 + this.field3005 * this.field3005)) + 0.99D);
    }

    @ObfuscatedName("ko.ax()V")
    public void method5188() {
        if (this.field3004 == 2) {
            return;
        }
        this.field3004 = 2;
        this.field3006 = 0;
        for (int var1 = 0; var1 < this.field2979; var1++) {
            int var2 = this.field2984[var1];
            int var3 = this.field2981[var1];
            int var4 = this.field2982[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field3006) {
                this.field3006 = var5;
            }
        }
        this.field3006 = (int) (Math.sqrt((double) this.field3006) + 0.99D);
        this.field3008 = this.field3006;
        this.field3007 = this.field3006 + this.field3006;
    }

    @ObfuscatedName("ko.aw()I")
    public int method5138() {
        this.method5136();
        return this.field3006;
    }

    @ObfuscatedName("ko.az()V")
    public void method5196() {
        this.field3004 = 0;
        this.field3009.clear();
    }

    @ObfuscatedName("ko.av(Lky;I)V")
    public void method5140(class278 arg0, int arg1) {
        if (this.field2999 == null || arg1 == -1) {
            return;
        }
        class268 var3 = arg0.field2915[arg1];
        class273 var4 = var3.field2772;
        Statics.field3030 = 0;
        Statics.field3033 = 0;
        Statics.field3034 = 0;
        for (int var5 = 0; var5 < var3.field2773; var5++) {
            int var6 = var3.field2774[var5];
            this.method5149(var4.field2829[var6], var4.field2828[var6], var3.field2775[var5], var3.field2768[var5], var3.field2770[var5]);
        }
        this.method5196();
    }

    @ObfuscatedName("ko.ak(Lfu;I)V")
    public void method5240(class139 arg0, int arg1) {
        class273 var3 = arg0.field1602;
        class271 var4 = var3.method4871();
        if (var4 != null) {
            var3.method4871().method4824(arg0, arg1);
            this.method5143(var3.method4871(), arg0.method3027());
        }
        if (arg0.method3028()) {
            this.method5142(arg0, arg1);
        }
        this.method5196();
    }

    @ObfuscatedName("ko.ay(Lfu;I)V")
    public void method5142(class139 arg0, int arg1) {
        class273 var3 = arg0.field1602;
        for (int var4 = 0; var4 < var3.field2824; var4++) {
            int var5 = var3.field2829[var4];
            if (var5 == 5 && arg0.field1599 != null && arg0.field1599[var4] != null && arg0.field1599[var4][0] != null && this.field3000 != null && this.field2975 != null) {
                class132 var6 = arg0.field1599[var4][0];
                int[] var7 = var3.field2828[var4];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10 = var7[var9];
                    if (var10 < this.field3000.length) {
                        int[] var11 = this.field3000[var10];
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            int var13 = var11[var12];
                            int var14 = (int) ((float) (this.field2975[var13] & 0xFF) + var6.method2959(arg1) * 255.0F);
                            if (var14 < 0) {
                                var14 = 0;
                            } else if (var14 > 255) {
                                var14 = 255;
                            }
                            this.field2975[var13] = (byte) var14;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ko.as(Lkx;I)V")
    public void method5143(class271 arg0, int arg1) {
        this.method5162(arg0, arg1);
    }

    @ObfuscatedName("ko.ab(Lky;ILky;I[I)V")
    public void method5231(class278 arg0, int arg1, class278 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method5140(arg0, arg1);
            return;
        }
        class268 var6 = arg0.field2915[arg1];
        class268 var7 = arg2.field2915[arg3];
        class273 var8 = var6.field2772;
        Statics.field3030 = 0;
        Statics.field3033 = 0;
        Statics.field3034 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field2773; var11++) {
            int var12 = var6.field2774[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2829[var12] == 0) {
                this.method5149(var8.field2829[var12], var8.field2828[var12], var6.field2775[var11], var6.field2768[var11], var6.field2770[var11]);
            }
        }
        Statics.field3030 = 0;
        Statics.field3033 = 0;
        Statics.field3034 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field2773; var15++) {
            int var16 = var7.field2774[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2829[var16] == 0) {
                this.method5149(var8.field2829[var16], var8.field2828[var16], var7.field2775[var15], var7.field2768[var15], var7.field2770[var15]);
            }
        }
        this.method5196();
    }

    @ObfuscatedName("ko.ah(Lkr;Lfu;I[ZZZ)V")
    public void method5144(class273 arg0, class139 arg1, int arg2, boolean[] arg3, boolean arg4, boolean arg5) {
        class271 var7 = arg0.method4871();
        if (var7 != null) {
            var7.method4825(arg1, arg2, arg3, arg4);
            if (arg5) {
                this.method5143(var7, arg1.method3027());
            }
        }
        if (!arg4 && arg1.method3028()) {
            this.method5142(arg1, arg2);
        }
    }

    @ObfuscatedName("ko.ai(Lky;I[IZ)V")
    public void method5146(class278 arg0, int arg1, int[] arg2, boolean arg3) {
        if (arg2 == null) {
            this.method5140(arg0, arg1);
            return;
        }
        class268 var5 = arg0.field2915[arg1];
        class273 var6 = var5.field2772;
        byte var7 = 0;
        int var11 = var7 + 1;
        int var8 = arg2[var7];
        Statics.field3030 = 0;
        Statics.field3033 = 0;
        Statics.field3034 = 0;
        for (int var9 = 0; var9 < var5.field2773; var9++) {
            int var10 = var5.field2774[var9];
            while (var10 > var8) {
                var8 = arg2[var11++];
            }
            if (arg3) {
                if (var8 == var10 || var6.field2829[var10] == 0) {
                    this.method5149(var6.field2829[var10], var6.field2828[var10], var5.field2775[var9], var5.field2768[var9], var5.field2770[var9]);
                }
            } else if (var8 != var10 || var6.field2829[var10] == 0) {
                this.method5149(var6.field2829[var10], var6.field2828[var10], var5.field2775[var9], var5.field2768[var9], var5.field2770[var9]);
            }
        }
    }

    @ObfuscatedName("ko.ac(I[IIII)V")
    public void method5149(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field3030 = 0;
            Statics.field3033 = 0;
            Statics.field3034 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field2999.length) {
                    int[] var10 = this.field2999[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field3030 += this.field2984[var12];
                        Statics.field3033 += this.field2981[var12];
                        Statics.field3034 += this.field2982[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field3030 = Statics.field3030 / var7 + arg2;
                Statics.field3033 = Statics.field3033 / var7 + arg3;
                Statics.field3034 = Statics.field3034 / var7 + arg4;
            } else {
                Statics.field3030 = arg2;
                Statics.field3033 = arg3;
                Statics.field3034 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field2999.length) {
                    int[] var15 = this.field2999[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field2984[var17] += arg2;
                        this.field2981[var17] += arg3;
                        this.field2982[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field2999.length) {
                    int[] var20 = this.field2999[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field2984[var22] -= Statics.field3030;
                        this.field2981[var22] -= Statics.field3033;
                        this.field2982[var22] -= Statics.field3034;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field3038[var25];
                            int var27 = field3039[var25];
                            int var28 = this.field2984[var22] * var27 + this.field2981[var22] * var26 >> 16;
                            this.field2981[var22] = this.field2981[var22] * var27 - this.field2984[var22] * var26 >> 16;
                            this.field2984[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field3038[var23];
                            int var30 = field3039[var23];
                            int var31 = this.field2981[var22] * var30 - this.field2982[var22] * var29 >> 16;
                            this.field2982[var22] = this.field2982[var22] * var30 + this.field2981[var22] * var29 >> 16;
                            this.field2981[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field3038[var24];
                            int var33 = field3039[var24];
                            int var34 = this.field2984[var22] * var33 + this.field2982[var22] * var32 >> 16;
                            this.field2982[var22] = this.field2982[var22] * var33 - this.field2984[var22] * var32 >> 16;
                            this.field2984[var22] = var34;
                        }
                        this.field2984[var22] += Statics.field3030;
                        this.field2981[var22] += Statics.field3033;
                        this.field2982[var22] += Statics.field3034;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field2999.length) {
                    int[] var37 = this.field2999[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field2984[var39] -= Statics.field3030;
                        this.field2981[var39] -= Statics.field3033;
                        this.field2982[var39] -= Statics.field3034;
                        this.field2984[var39] = this.field2984[var39] * arg2 / 128;
                        this.field2981[var39] = this.field2981[var39] * arg3 / 128;
                        this.field2982[var39] = this.field2982[var39] * arg4 / 128;
                        this.field2984[var39] += Statics.field3030;
                        this.field2981[var39] += Statics.field3033;
                        this.field2982[var39] += Statics.field3034;
                    }
                }
            }
        } else if (arg0 == 5 && this.field3000 != null && this.field2975 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field3000.length) {
                    int[] var42 = this.field3000[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field2975[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field2975[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ko.al()V")
    public void method5148() {
        for (int var1 = 0; var1 < this.field2979; var1++) {
            int var2 = this.field2984[var1];
            this.field2984[var1] = this.field2982[var1];
            this.field2982[var1] = -var2;
        }
        this.method5196();
    }

    @ObfuscatedName("ko.at()V")
    public void method5163() {
        for (int var1 = 0; var1 < this.field2979; var1++) {
            this.field2984[var1] = -this.field2984[var1];
            this.field2982[var1] = -this.field2982[var1];
        }
        this.method5196();
    }

    @ObfuscatedName("ko.bj()V")
    public void method5181() {
        for (int var1 = 0; var1 < this.field2979; var1++) {
            int var2 = this.field2982[var1];
            this.field2982[var1] = this.field2984[var1];
            this.field2984[var1] = -var2;
        }
        this.method5196();
    }

    @ObfuscatedName("ko.bd(I)V")
    public void method5137(int arg0) {
        int var2 = field3038[arg0];
        int var3 = field3039[arg0];
        for (int var4 = 0; var4 < this.field2979; var4++) {
            int var5 = this.field2981[var4] * var3 - this.field2982[var4] * var2 >> 16;
            this.field2982[var4] = this.field2982[var4] * var3 + this.field2981[var4] * var2 >> 16;
            this.field2981[var4] = var5;
        }
        this.method5196();
    }

    @ObfuscatedName("ko.bg(III)V")
    public void method5152(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2979; var4++) {
            this.field2984[var4] += arg0;
            this.field2981[var4] += arg1;
            this.field2982[var4] += arg2;
        }
        this.method5196();
    }

    @ObfuscatedName("ko.bt(III)V")
    public void method5153(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2979; var4++) {
            this.field2984[var4] = this.field2984[var4] * arg0 / 128;
            this.field2981[var4] = this.field2981[var4] * arg1 / 128;
            this.field2982[var4] = this.field2982[var4] * arg2 / 128;
        }
        this.method5196();
    }

    @ObfuscatedName("ko.br(IIIIIII)V")
    public final void method5154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field3004 != 2 && this.field3004 != 1) {
            this.method5188();
        }
        int var8 = class270.method4767();
        int var9 = class270.method4751();
        int var10 = field3038[arg0];
        int var11 = field3039[arg0];
        int var12 = field3038[arg1];
        int var13 = field3039[arg1];
        int var14 = field3038[arg2];
        int var15 = field3039[arg2];
        int var16 = field3038[arg3];
        int var17 = field3039[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field2979; var19++) {
            int var20 = this.field2984[var19];
            int var21 = this.field2981[var19];
            int var22 = this.field2982[var19];
            if (arg2 != 0) {
                int var23 = var14 * var21 + var15 * var20 >> 16;
                var21 = var15 * var21 - var14 * var20 >> 16;
                var20 = var23;
            }
            if (arg0 != 0) {
                int var24 = var11 * var21 - var10 * var22 >> 16;
                var22 = var10 * var21 + var11 * var22 >> 16;
                var21 = var24;
            }
            if (arg1 != 0) {
                int var25 = var12 * var22 + var13 * var20 >> 16;
                var22 = var13 * var22 - var12 * var20 >> 16;
                var20 = var25;
            }
            int var26 = arg4 + var20;
            int var27 = arg5 + var21;
            int var28 = arg6 + var22;
            int var29 = var17 * var27 - var16 * var28 >> 16;
            int var30 = var16 * var27 + var17 * var28 >> 16;
            field3016[var19] = var30 - var18;
            field3013[var19] = var8 + var26 * class270.method4818() / var30;
            field3014[var19] = var9 + var29 * class270.method4818() / var30;
            field2988[var19] = class282.method845(var30);
            if (this.field3044 > 0) {
                field3031[var19] = var26;
                field3019[var19] = var29;
                field2990[var19] = var30;
            }
        }
        try {
            this.method5156(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ko.ba(IIIIIIII)V")
    public final void method5155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.field3004 != 2 && this.field3004 != 1) {
            this.method5188();
        }
        int var9 = class270.method4767();
        int var10 = class270.method4751();
        int var11 = field3038[arg0];
        int var12 = field3039[arg0];
        int var13 = field3038[arg1];
        int var14 = field3039[arg1];
        int var15 = field3038[arg2];
        int var16 = field3039[arg2];
        int var17 = field3038[arg3];
        int var18 = field3039[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field2979; var20++) {
            int var21 = this.field2984[var20];
            int var22 = this.field2981[var20];
            int var23 = this.field2982[var20];
            if (arg2 != 0) {
                int var24 = var15 * var22 + var16 * var21 >> 16;
                var22 = var16 * var22 - var15 * var21 >> 16;
                var21 = var24;
            }
            if (arg0 != 0) {
                int var25 = var12 * var22 - var11 * var23 >> 16;
                var23 = var11 * var22 + var12 * var23 >> 16;
                var22 = var25;
            }
            if (arg1 != 0) {
                int var26 = var13 * var23 + var14 * var21 >> 16;
                var23 = var14 * var23 - var13 * var21 >> 16;
                var21 = var26;
            }
            int var27 = arg4 + var21;
            int var28 = arg5 + var22;
            int var29 = arg6 + var23;
            int var30 = var18 * var28 - var17 * var29 >> 16;
            int var31 = var17 * var28 + var18 * var29 >> 16;
            field3016[var20] = var31 - var19;
            field3013[var20] = var9 + var27 * class270.method4818() / arg7;
            field3014[var20] = var10 + var30 * class270.method4818() / arg7;
            field2988[var20] = class282.method845(arg7);
            if (this.field3044 > 0) {
                field3031[var20] = var27;
                field3019[var20] = var30;
                field2990[var20] = var31;
            }
        }
        try {
            this.method5156(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ko.do(IIIIIIIIJ)V")
    public void method5071(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field3004 != 1) {
            this.method5136();
        }
        this.method5135(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field3006 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field3006) * class270.method4818();
        if (var16 / var14 >= class270.method4753()) {
            return;
        }
        int var17 = (this.field3006 + var15) * class270.method4818();
        if (var17 / var14 <= class270.method4752()) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field3006 * arg1 >> 16;
        int var20 = (this.field3005 * arg2 >> 16) + var19;
        int var21 = (var18 + var20) * class270.method4818();
        if (var21 / var14 <= class270.method4755()) {
            return;
        }
        int var22 = (this.field2910 * arg2 >> 16) + var19;
        int var23 = (var18 - var22) * class270.method4818();
        if (var23 / var14 >= class270.method4744()) {
            return;
        }
        int var24 = (this.field2910 * arg1 >> 16) + var13;
        boolean var25 = false;
        boolean var26 = false;
        if (var12 - var24 <= 50) {
            var26 = true;
        }
        boolean var27 = var26 || this.field3044 > 0;
        int var28 = class284.method307();
        int var29 = class284.method5469();
        boolean var30 = class284.method1125();
        boolean var31 = Statics.method7336(arg8);
        boolean var32 = false;
        if (var31 && var30) {
            boolean var33 = false;
            if (field3035) {
                boolean var35;
                if (class284.method1125()) {
                    class284.method3371();
                    class275 var36 = (class275) this.field3009.get(arg0);
                    int var37 = var36.field2909 + arg5;
                    int var38 = var36.field2900 + arg6;
                    int var39 = var36.field2904 + arg7;
                    int var40 = var36.field2902;
                    int var41 = var36.field2903;
                    int var42 = var36.field2899;
                    int var43 = Statics.field4502 - var37;
                    int var44 = Statics.field3064 - var38;
                    int var45 = Statics.field3055 - var39;
                    if (Math.abs(var43) > Statics.field1663 + var40) {
                        var35 = false;
                    } else if (Math.abs(var44) > Statics.field1451 + var41) {
                        var35 = false;
                    } else if (Math.abs(var45) > Statics.field999 + var42) {
                        var35 = false;
                    } else if (Math.abs(Statics.field1682 * var45 - Statics.field1626 * var44) > Statics.field999 * var41 + Statics.field1451 * var42) {
                        var35 = false;
                    } else if (Math.abs(Statics.field1626 * var43 - Statics.field3056 * var45) > Statics.field999 * var40 + Statics.field1663 * var42) {
                        var35 = false;
                    } else if (Math.abs(Statics.field3056 * var44 - Statics.field1682 * var43) > Statics.field1663 * var41 + Statics.field1451 * var40) {
                        var35 = false;
                    } else {
                        var35 = true;
                    }
                } else {
                    var35 = false;
                }
                var33 = var35;
            } else {
                int var46 = var12 - var13;
                if (var46 <= 50) {
                    var46 = 50;
                }
                int var47;
                int var48;
                if (var15 > 0) {
                    var47 = var16 / var14;
                    var48 = var17 / var46;
                } else {
                    var48 = var17 / var14;
                    var47 = var16 / var46;
                }
                int var49;
                int var50;
                if (var18 > 0) {
                    var49 = var23 / var14;
                    var50 = var21 / var46;
                } else {
                    var50 = var21 / var14;
                    var49 = var23 / var46;
                }
                int var51 = var28 - class270.method4767();
                int var52 = var29 - class270.method4751();
                if (var51 > var47 && var51 < var48 && var52 > var49 && var52 < var50) {
                    var33 = true;
                }
            }
            if (var33) {
                if (this.field3003) {
                    class284.method2643(arg8);
                } else {
                    var32 = true;
                }
            }
        }
        int var53 = class270.method4767();
        int var54 = class270.method4751();
        int var55 = 0;
        int var56 = 0;
        if (arg0 != 0) {
            var55 = field3038[arg0];
            var56 = field3039[arg0];
        }
        for (int var57 = 0; var57 < this.field2979; var57++) {
            int var58 = this.field2984[var57];
            int var59 = this.field2981[var57];
            int var60 = this.field2982[var57];
            if (arg0 != 0) {
                int var61 = var55 * var60 + var56 * var58 >> 16;
                var60 = var56 * var60 - var55 * var58 >> 16;
                var58 = var61;
            }
            int var62 = arg5 + var58;
            int var63 = arg6 + var59;
            int var64 = arg7 + var60;
            int var65 = arg3 * var64 + arg4 * var62 >> 16;
            int var66 = arg4 * var64 - arg3 * var62 >> 16;
            int var68 = arg2 * var63 - arg1 * var66 >> 16;
            int var69 = arg1 * var63 + arg2 * var66 >> 16;
            field3016[var57] = var69 - var12;
            if (var69 >= 50) {
                field3013[var57] = var53 + var65 * class270.method4818() / var69;
                field3014[var57] = var54 + var68 * class270.method4818() / var69;
                field2988[var57] = class282.method845(var69);
            } else {
                field3013[var57] = -5000;
                var25 = true;
            }
            if (var27) {
                field3031[var57] = var65;
                field3019[var57] = var68;
                field2990[var57] = var69;
            }
        }
        try {
            this.method5156(var25, var32, this.field3003, arg8);
        } catch (Exception var72) {
        }
    }

    @ObfuscatedName("ko.bk(ZZZJ)V")
    public final void method5156(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field3007 >= 6000) {
            return;
        }
        for (int var6 = 0; var6 < this.field3007; var6++) {
            field3021[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (char var8 = 0; var8 < this.field2983; var8++) {
            if (this.field2989[var8] != -2) {
                int var9 = this.field3022[var8];
                int var10 = this.field2985[var8];
                int var11 = this.field2986[var8];
                int var12 = field3013[var9];
                int var13 = field3013[var10];
                int var14 = field3013[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field3031[var9];
                    int var16 = field3031[var10];
                    int var17 = field3031[var11];
                    int var18 = field3019[var9];
                    int var19 = field3019[var10];
                    int var20 = field3019[var11];
                    int var21 = field2990[var9];
                    int var22 = field2990[var10];
                    int var23 = field2990[var11];
                    int var24 = var15 - var16;
                    int var25 = var17 - var16;
                    int var26 = var18 - var19;
                    int var27 = var20 - var19;
                    int var28 = var21 - var22;
                    int var29 = var23 - var22;
                    int var30 = var26 * var29 - var27 * var28;
                    int var31 = var25 * var28 - var24 * var29;
                    int var32 = var24 * var27 - var25 * var26;
                    if (var22 * var32 + var16 * var30 + var19 * var31 > 0) {
                        field3012[var8] = true;
                        int var33 = (field3016[var9] + field3016[var10] + field3016[var11]) / 3 + this.field3008;
                        field3023[var33][field3021[var33]++] = var8;
                    }
                } else {
                    if (arg1) {
                        int var34 = field3014[var9];
                        int var35 = field3014[var10];
                        int var36 = field3014[var11];
                        int var37 = class284.field3061 + var7;
                        boolean var38;
                        if (var37 < var34 && var37 < var35 && var37 < var36) {
                            var38 = false;
                        } else {
                            int var39 = class284.field3061 - var7;
                            if (var39 > var34 && var39 > var35 && var39 > var36) {
                                var38 = false;
                            } else {
                                int var40 = class284.field3058 + var7;
                                if (var40 < var12 && var40 < var13 && var40 < var14) {
                                    var38 = false;
                                } else {
                                    int var41 = class284.field3058 - var7;
                                    if (var41 > var12 && var41 > var13 && var41 > var14) {
                                        var38 = false;
                                    } else {
                                        var38 = true;
                                    }
                                }
                            }
                        }
                        if (var38) {
                            class284.field3050[++class284.field3057 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field3014[var11] - field3014[var10]) * (var12 - var13) - (field3014[var9] - field3014[var10]) * (var14 - var13) > 0) {
                        field3012[var8] = false;
                        int var44 = class270.method4757();
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= var44 && var13 <= var44 && var14 <= var44) {
                            field3029[var8] = false;
                        } else {
                            field3029[var8] = true;
                        }
                        int var45 = (field3016[var9] + field3016[var10] + field3016[var11]) / 3 + this.field3008;
                        field3023[var45][field3021[var45]++] = var8;
                    }
                }
            }
        }
        if (this.field3024 == null) {
            for (int var46 = this.field3007 - 1; var46 >= 0; var46--) {
                char var47 = field3021[var46];
                if (var47 > 0) {
                    char[] var48 = field3023[var46];
                    for (int var49 = 0; var49 < var47; var49++) {
                        this.method5177(var48[var49]);
                    }
                }
            }
            return;
        }
        for (int var50 = 0; var50 < 12; var50++) {
            field2973[var50] = 0;
            field3027[var50] = 0;
        }
        for (int var51 = this.field3007 - 1; var51 >= 0; var51--) {
            char var52 = field3021[var51];
            if (var52 > 0) {
                char[] var53 = field3023[var51];
                for (int var54 = 0; var54 < var52; var54++) {
                    char var55 = var53[var54];
                    byte var56 = this.field3024[var55];
                    int var57 = field2973[var56]++;
                    field3011[var56][var57] = var55;
                    if (var56 < 10) {
                        field3027[var56] += var51;
                    } else if (var56 == 10) {
                        field3025[var57] = var51;
                    } else {
                        field3026[var57] = var51;
                    }
                }
            }
        }
        int var58 = 0;
        if (field2973[1] > 0 || field2973[2] > 0) {
            var58 = (field3027[1] + field3027[2]) / (field2973[1] + field2973[2]);
        }
        int var59 = 0;
        if (field2973[3] > 0 || field2973[4] > 0) {
            var59 = (field3027[3] + field3027[4]) / (field2973[3] + field2973[4]);
        }
        int var60 = 0;
        if (field2973[6] > 0 || field2973[8] > 0) {
            var60 = (field3027[6] + field3027[8]) / (field2973[6] + field2973[8]);
        }
        int var61 = 0;
        int var62 = field2973[10];
        int[] var63 = field3011[10];
        int[] var64 = field3025;
        if (var61 == var62) {
            var61 = 0;
            var62 = field2973[11];
            var63 = field3011[11];
            var64 = field3026;
        }
        int var65;
        if (var61 < var62) {
            var65 = var64[var61];
        } else {
            var65 = -1000;
        }
        for (int var66 = 0; var66 < 10; var66++) {
            while (var66 == 0 && var65 > var58) {
                this.method5177(var63[var61++]);
                if (var61 == var62 && field3011[11] != var63) {
                    var61 = 0;
                    var62 = field2973[11];
                    var63 = field3011[11];
                    var64 = field3026;
                }
                if (var61 < var62) {
                    var65 = var64[var61];
                } else {
                    var65 = -1000;
                }
            }
            while (var66 == 3 && var65 > var59) {
                this.method5177(var63[var61++]);
                if (var61 == var62 && field3011[11] != var63) {
                    var61 = 0;
                    var62 = field2973[11];
                    var63 = field3011[11];
                    var64 = field3026;
                }
                if (var61 < var62) {
                    var65 = var64[var61];
                } else {
                    var65 = -1000;
                }
            }
            while (var66 == 5 && var65 > var60) {
                this.method5177(var63[var61++]);
                if (var61 == var62 && field3011[11] != var63) {
                    var61 = 0;
                    var62 = field2973[11];
                    var63 = field3011[11];
                    var64 = field3026;
                }
                if (var61 < var62) {
                    var65 = var64[var61];
                } else {
                    var65 = -1000;
                }
            }
            int var67 = field2973[var66];
            int[] var68 = field3011[var66];
            for (int var69 = 0; var69 < var67; var69++) {
                this.method5177(var68[var69]);
            }
        }
        while (var65 != -1000) {
            this.method5177(var63[var61++]);
            if (var61 == var62 && field3011[11] != var63) {
                var61 = 0;
                var63 = field3011[11];
                var62 = field2973[11];
                var64 = field3026;
            }
            if (var61 < var62) {
                var65 = var64[var61];
            } else {
                var65 = -1000;
            }
        }
    }

    @ObfuscatedName("ko.bn(I)V")
    public final void method5177(int arg0) {
        if (field3012[arg0]) {
            this.method5160(arg0);
            return;
        }
        int var2 = this.field3022[arg0];
        int var3 = this.field2985[arg0];
        int var4 = this.field2986[arg0];
        class270.field2810.field3099 = field3029[arg0];
        if (this.field2975 == null) {
            class270.field2810.field3082 = 0;
        } else {
            class270.field2810.field3082 = (this.field2975[arg0] == -1 ? 253 : this.field2975[arg0]) & 0xFF;
        }
        this.method5159(arg0, field3014[var2], field3014[var3], field3014[var4], field3013[var2], field3013[var3], field3013[var4], field2988[var2], field2988[var3], field2988[var4], this.field2987[arg0], this.field2991[arg0], this.field2989[arg0]);
    }

    @ObfuscatedName("ko.by(I)Z")
    public boolean method5158(int arg0) {
        return this.field3048 > 0 && arg0 < this.field2996;
    }

    @ObfuscatedName("ko.bc(IIIIIIIFFFIII)V")
    public final void method5159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8, float arg9, int arg10, int arg11, int arg12) {
        if (this.field3018 == null || this.field3018[arg0] == -1) {
            boolean var18 = this.method5158(arg0);
            if (this.field2989[arg0] == -1 && var18) {
                class270.method4768(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, field3043[this.field2987[arg0]], this.field3045, this.field3046, this.field3047, this.field3048);
            } else if (this.field2989[arg0] == -1) {
                class270.method4807(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, field3043[this.field2987[arg0]]);
            } else if (var18) {
                class270.method4789(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, this.field3045, this.field3046, this.field3047, this.field3048);
            } else {
                class270.method4764(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
            }
            return;
        }
        int var15;
        int var16;
        int var17;
        if (this.field2992 == null || this.field2992[arg0] == -1) {
            var15 = this.field3022[arg0];
            var16 = this.field2985[arg0];
            var17 = this.field2986[arg0];
        } else {
            int var14 = this.field2992[arg0] & 0xFF;
            var15 = this.field3040[var14];
            var16 = this.field2997[var14];
            var17 = this.field2998[var14];
        }
        if (this.field2989[arg0] == -1) {
            class270.method4759(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg10, arg10, field3031[var15], field3031[var16], field3031[var17], field3019[var15], field3019[var16], field3019[var17], field2990[var15], field2990[var16], field2990[var17], this.field3018[arg0]);
        } else {
            class270.method4759(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, field3031[var15], field3031[var16], field3031[var17], field3019[var15], field3019[var16], field3019[var17], field2990[var15], field2990[var16], field2990[var17], this.field3018[arg0]);
        }
    }

    @ObfuscatedName("ko.bx(I)V")
    public final void method5160(int arg0) {
        int var2 = class270.method4767();
        int var3 = class270.method4751();
        int var4 = 0;
        int var5 = this.field3022[arg0];
        int var6 = this.field2985[arg0];
        int var7 = this.field2986[arg0];
        int var8 = field2990[var5];
        int var9 = field2990[var6];
        int var10 = field2990[var7];
        if (this.field2975 == null) {
            class270.field2810.field3082 = 0;
        } else {
            class270.field2810.field3082 = this.field2975[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field3028[var4] = field3013[var5];
            field2972[var4] = field3014[var5];
            field3015[var4] = field2988[var7];
            field3017[var4++] = this.field2987[arg0];
        } else {
            int var11 = field3031[var5];
            int var12 = field3019[var5];
            int var13 = this.field2987[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field3041[var10 - var8];
                field3028[var4] = var2 + (((field3031[var7] - var11) * var14 >> 16) + var11) * class270.method4818() / 50;
                field2972[var4] = var3 + (((field3019[var7] - var12) * var14 >> 16) + var12) * class270.method4818() / 50;
                field3015[var4] = field2976;
                field3017[var4++] = ((this.field2989[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field3041[var9 - var8];
                field3028[var4] = var2 + (((field3031[var6] - var11) * var15 >> 16) + var11) * class270.method4818() / 50;
                field2972[var4] = var3 + (((field3019[var6] - var12) * var15 >> 16) + var12) * class270.method4818() / 50;
                field3015[var4] = field2976;
                field3017[var4++] = ((this.field2991[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field3028[var4] = field3013[var6];
            field2972[var4] = field3014[var6];
            field3015[var4] = field2988[var7];
            field3017[var4++] = this.field2991[arg0];
        } else {
            int var16 = field3031[var6];
            int var17 = field3019[var6];
            int var18 = this.field2991[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field3041[var8 - var9];
                field3028[var4] = var2 + (((field3031[var5] - var16) * var19 >> 16) + var16) * class270.method4818() / 50;
                field2972[var4] = var3 + (((field3019[var5] - var17) * var19 >> 16) + var17) * class270.method4818() / 50;
                field3015[var4] = field2976;
                field3017[var4++] = ((this.field2987[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field3041[var10 - var9];
                field3028[var4] = var2 + (((field3031[var7] - var16) * var20 >> 16) + var16) * class270.method4818() / 50;
                field2972[var4] = var3 + (((field3019[var7] - var17) * var20 >> 16) + var17) * class270.method4818() / 50;
                field3017[var4++] = ((this.field2989[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field3028[var4] = field3013[var7];
            field2972[var4] = field3014[var7];
            field3015[var4] = field2988[var7];
            field3017[var4++] = this.field2989[arg0];
        } else {
            int var21 = field3031[var7];
            int var22 = field3019[var7];
            int var23 = this.field2989[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field3041[var9 - var10];
                field3028[var4] = var2 + (((field3031[var6] - var21) * var24 >> 16) + var21) * class270.method4818() / 50;
                field2972[var4] = var3 + (((field3019[var6] - var22) * var24 >> 16) + var22) * class270.method4818() / 50;
                field3015[var4] = field2976;
                field3017[var4++] = ((this.field2991[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field3041[var8 - var10];
                field3028[var4] = var2 + (((field3031[var5] - var21) * var25 >> 16) + var21) * class270.method4818() / 50;
                field2972[var4] = var3 + (((field3019[var5] - var22) * var25 >> 16) + var22) * class270.method4818() / 50;
                field3015[var4] = field2976;
                field3017[var4++] = ((this.field2987[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field3028[0];
        int var27 = field3028[1];
        int var28 = field3028[2];
        int var29 = field2972[0];
        int var30 = field2972[1];
        int var31 = field2972[2];
        float var32 = field3015[0];
        float var33 = field3015[1];
        float var34 = field3015[2];
        class270.field2810.field3099 = false;
        int var35 = class270.method4757();
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > var35 || var27 > var35 || var28 > var35) {
                class270.field2810.field3099 = true;
            }
            this.method5159(arg0, var29, var30, var31, var26, var27, var28, var32, var33, var34, field3017[0], field3017[1], field3017[2]);
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > var35 || var27 > var35 || var28 > var35 || field3028[3] < 0 || field3028[3] > var35) {
            class270.field2810.field3099 = true;
        }
        if (this.field3018 == null || this.field3018[arg0] == -1) {
            boolean var41 = this.method5158(arg0);
            if (this.field2989[arg0] == -1 && var41) {
                int var42 = field3043[this.field2987[arg0]];
                class270.method4768(var29, var30, var31, var26, var27, var28, var32, var33, var34, var42, this.field3045, this.field3046, this.field3047, this.field3048);
                class270.method4768(var29, var31, field2972[3], var26, var28, field3028[3], var32, var34, field3015[3], var42, this.field3045, this.field3046, this.field3047, this.field3048);
            } else if (this.field2989[arg0] == -1) {
                int var43 = field3043[this.field2987[arg0]];
                class270.method4807(var29, var30, var31, var26, var27, var28, var32, var33, var34, var43);
                class270.method4807(var29, var31, field2972[3], var26, var28, field3028[3], var32, var34, field3015[3], var43);
            } else if (var41) {
                class270.method4789(var29, var30, var31, var26, var27, var28, var32, var33, var34, field3017[0], field3017[1], field3017[2], this.field3045, this.field3047, this.field3046, this.field3048);
                class270.method4789(var29, var31, field2972[3], var26, var28, field3028[3], 0.0F, 0.0F, 0.0F, field3017[0], field3017[2], field3017[3], this.field3045, this.field3047, this.field3046, this.field3048);
            } else {
                class270.method4764(var29, var30, var31, var26, var27, var28, var32, var33, var34, field3017[0], field3017[1], field3017[2]);
                class270.method4764(var29, var31, field2972[3], var26, var28, field3028[3], var32, var34, field3015[3], field3017[0], field3017[2], field3017[3]);
            }
            return;
        }
        int var37;
        int var38;
        int var39;
        if (this.field2992 == null || this.field2992[arg0] == -1) {
            var37 = var5;
            var38 = var6;
            var39 = var7;
        } else {
            int var36 = this.field2992[arg0] & 0xFF;
            var37 = this.field3040[var36];
            var38 = this.field2997[var36];
            var39 = this.field2998[var36];
        }
        short var40 = this.field3018[arg0];
        if (this.field2989[arg0] == -1) {
            class270.method4759(var29, var30, var31, var26, var27, var28, var32, var33, var34, this.field2987[arg0], this.field2987[arg0], this.field2987[arg0], field3031[var37], field3031[var38], field3031[var39], field3019[var37], field3019[var38], field3019[var39], field2990[var37], field2990[var38], field2990[var39], var40);
            class270.method4759(var29, var31, field2972[3], var26, var28, field3028[3], var32, var34, field3015[3], this.field2987[arg0], this.field2987[arg0], this.field2987[arg0], field3031[var37], field3031[var38], field3031[var39], field3019[var37], field3019[var38], field3019[var39], field2990[var37], field2990[var38], field2990[var39], var40);
        } else {
            class270.method4759(var29, var30, var31, var26, var27, var28, var32, var33, var34, field3017[0], field3017[1], field3017[2], field3031[var37], field3031[var38], field3031[var39], field3019[var37], field3019[var38], field3019[var39], field2990[var37], field2990[var38], field2990[var39], var40);
            class270.method4759(var29, var31, field2972[3], var26, var28, field3028[3], var32, var34, field3015[3], field3017[0], field3017[2], field3017[3], field3031[var37], field3031[var38], field3031[var39], field3019[var37], field3019[var38], field3019[var39], field2990[var37], field2990[var38], field2990[var39], var40);
        }
    }

    @ObfuscatedName("ko.bf(ILrh;)V")
    public void method5161(int arg0, class467 arg1) {
        float var3 = (float) this.field2984[arg0];
        float var4 = (float) (-this.field2981[arg0]);
        float var5 = (float) (-this.field2982[arg0]);
        float var6 = 1.0F;
        this.field2984[arg0] = (int) (arg1.field4810[12] * var6 + arg1.field4810[8] * var5 + arg1.field4810[0] * var3 + arg1.field4810[4] * var4);
        this.field2981[arg0] = -((int) (arg1.field4810[13] * var6 + arg1.field4810[9] * var5 + arg1.field4810[1] * var3 + arg1.field4810[5] * var4));
        this.field2982[arg0] = -((int) (arg1.field4810[14] * var6 + arg1.field4810[10] * var5 + arg1.field4810[2] * var3 + arg1.field4810[6] * var4));
    }

    @ObfuscatedName("ko.bp(Lkx;I)V")
    public void method5162(class271 arg0, int arg1) {
        if (this.field3001 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2979; var3++) {
            int[] var4 = this.field3001[var3];
            if (var4 != null && var4.length != 0) {
                int[] var5 = this.field3002[var3];
                field3032.method7804();
                for (int var6 = 0; var6 < var4.length; var6++) {
                    int var7 = var4[var6];
                    class129 var8 = arg0.method4822(var7);
                    if (var8 != null) {
                        field2977.method7806((float) var5[var6] / 255.0F);
                        field2978.method7805(var8.method2913(arg1));
                        field2978.method7809(field2977);
                        field3032.method7808(field2978);
                    }
                }
                this.method5161(var3, field3032);
            }
        }
    }
}
