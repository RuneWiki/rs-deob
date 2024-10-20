package deob;

import java.util.Arrays;
import java.util.HashMap;

@ObfuscatedName("ka")
public class class280 extends class273 {

    @ObfuscatedName("ka.at")
    public static class280 field2932 = new class280();

    @ObfuscatedName("ka.ah")
    public static byte[] field2931 = new byte[1];

    @ObfuscatedName("ka.ar")
    public static class280 field2969 = new class280();

    @ObfuscatedName("ka.ao")
    public static byte[] field2946 = new byte[1];

    @ObfuscatedName("ka.ab")
    public static class463 field2934 = new class463();

    @ObfuscatedName("ka.au")
    public static class463 field2935 = new class463();

    @ObfuscatedName("ka.aa")
    public static class463 field2997 = new class463();

    @ObfuscatedName("ka.ac")
    public int field2937 = 0;

    @ObfuscatedName("ka.al")
    public int[] field2989;

    @ObfuscatedName("ka.az")
    public int[] field2939;

    @ObfuscatedName("ka.ap")
    public int[] field2940;

    @ObfuscatedName("ka.av")
    public int field2941 = 0;

    @ObfuscatedName("ka.ax")
    public int[] field2930;

    @ObfuscatedName("ka.as")
    public int[] field2943;

    @ObfuscatedName("ka.ay")
    public int[] field2965;

    @ObfuscatedName("ka.ak")
    public int[] field2945;

    @ObfuscatedName("ka.aj")
    public int[] field3006;

    @ObfuscatedName("ka.am")
    public int[] field2947;

    @ObfuscatedName("ka.aq")
    public byte[] field2948;

    @ObfuscatedName("ka.ai")
    public byte[] field2949;

    @ObfuscatedName("ka.aw")
    public byte[] field2950;

    @ObfuscatedName("ka.ae")
    public short[] field2951;

    @ObfuscatedName("ka.an")
    public byte field2952 = 0;

    @ObfuscatedName("ka.ag")
    public int field2953 = 0;

    @ObfuscatedName("ka.ad")
    public int[] field2954;

    @ObfuscatedName("ka.af")
    public int[] field2986;

    @ObfuscatedName("ka.be")
    public int[] field2956;

    @ObfuscatedName("ka.bd")
    public int[][] field2957;

    @ObfuscatedName("ka.bl")
    public int[][] field2964;

    @ObfuscatedName("ka.bi")
    public int[][] field2959;

    @ObfuscatedName("ka.bv")
    public int[][] field2936;

    @ObfuscatedName("ka.bf")
    public boolean field2990 = false;

    @ObfuscatedName("ka.bg")
    public int field2962;

    @ObfuscatedName("ka.ba")
    public int field2961;

    @ObfuscatedName("ka.bm")
    public int field2955;

    @ObfuscatedName("ka.bp")
    public int field3005;

    @ObfuscatedName("ka.bw")
    public int field2966;

    @ObfuscatedName("ka.bj")
    public HashMap field2944 = new HashMap();

    @ObfuscatedName("ka.bo")
    public static boolean[] field2933 = new boolean[6500];

    @ObfuscatedName("ka.bt")
    public static boolean[] field2958 = new boolean[6500];

    @ObfuscatedName("ka.bu")
    public static int[] field2971 = new int[6500];

    @ObfuscatedName("ka.by")
    public static int[] field2994 = new int[6500];

    @ObfuscatedName("ka.bh")
    public static float[] field2973 = new float[6500];

    @ObfuscatedName("ka.bz")
    public static int[] field2974 = new int[6500];

    @ObfuscatedName("ka.bc")
    public static int[] field2975 = new int[6500];

    @ObfuscatedName("ka.bs")
    public static int[] field2960 = new int[6500];

    @ObfuscatedName("ka.bx")
    public static int[] field2977 = new int[6500];

    @ObfuscatedName("ka.bk")
    public static char[] field2979 = new char[6000];

    @ObfuscatedName("ka.br")
    public static char[][] field2980 = new char[6000][512];

    @ObfuscatedName("ka.bq")
    public static int[] field2981 = new int[12];

    @ObfuscatedName("ka.cf")
    public static int[][] field2982 = new int[12][2000];

    @ObfuscatedName("ka.cg")
    public static int[] field2983 = new int[2000];

    @ObfuscatedName("ka.cv")
    public static int[] field2988 = new int[2000];

    @ObfuscatedName("ka.cx")
    public static int[] field2987 = new int[10];

    @ObfuscatedName("ka.cp")
    public static int[] field2985 = new int[12];

    @ObfuscatedName("ka.ce")
    public static int[] field2938 = new int[10];

    @ObfuscatedName("ka.ci")
    public static int[] field2984 = new int[10];

    @ObfuscatedName("ka.ct")
    public static float[] field2972 = new float[10];

    @ObfuscatedName("ka.cs")
    public static boolean field2993 = true;

    @ObfuscatedName("ka.cn")
    public static int[] field2996 = class267.field2771;

    @ObfuscatedName("ka.cr")
    public static int[] field3002 = class267.field2769;

    @ObfuscatedName("ka.cj")
    public static int[] field2998 = class267.field2772;

    @ObfuscatedName("ka.ca")
    public static int[] field2976 = class267.field2776;

    @ObfuscatedName("ka.ch")
    public static final float field2942 = class279.method4510(50);

    @ObfuscatedName("ka.cb")
    public byte field3003;

    @ObfuscatedName("ka.cz")
    public byte field3004;

    @ObfuscatedName("ka.cy")
    public byte field2999;

    @ObfuscatedName("ka.ck")
    public byte field2967;

    @ObfuscatedName("ka.cd")
    public short field3007;

    public class280() {
    }

    public class280(class280[] arg0, int arg1) {
        this.field2937 = 0;
        this.field2941 = 0;
        this.field2953 = 0;
        this.field2952 = -1;
        for (int var3 = 0; var3 < arg1; var3++) {
            class280 var4 = arg0[var3];
            if (var4 != null) {
                this.field2937 += var4.field2937;
                this.field2941 += var4.field2941;
                this.field2953 += var4.field2953;
                if (this.field2952 == -1) {
                    this.field2952 = var4.field2952;
                }
            }
        }
        this.method5059(this.field2937, this.field2941, this.field2953);
        this.field2937 = 0;
        this.field2941 = 0;
        this.field2953 = 0;
        for (int var5 = 0; var5 < arg1; var5++) {
            this.method5109(arg0[var5]);
        }
    }

    public class280(int arg0, int arg1, int arg2, byte arg3) {
        this.method5059(arg0, arg1, arg2);
        this.field2952 = arg3;
        this.field2937 = 0;
        this.field2941 = 0;
        this.field2953 = 0;
    }

    @ObfuscatedName("ka.at(III)V")
    public void method5059(int arg0, int arg1, int arg2) {
        this.field2989 = new int[arg0];
        this.field2939 = new int[arg0];
        this.field2940 = new int[arg0];
        this.field2930 = new int[arg1];
        this.field2943 = new int[arg1];
        this.field2965 = new int[arg1];
        this.field2945 = new int[arg1];
        this.field3006 = new int[arg1];
        this.field2947 = new int[arg1];
        if (arg2 > 0) {
            this.field2954 = new int[arg2];
            this.field2986 = new int[arg2];
            this.field2956 = new int[arg2];
        }
    }

    @ObfuscatedName("ka.ar(Lka;)V")
    public void method5041(class280 arg0) {
        int var2 = this.field2930.length;
        if (this.field2948 == null && (arg0.field2948 != null || this.field2952 != arg0.field2952)) {
            this.field2948 = new byte[var2];
            Arrays.fill(this.field2948, this.field2952);
        }
        if (this.field2949 == null && arg0.field2949 != null) {
            this.field2949 = new byte[var2];
            Arrays.fill(this.field2949, (byte) 0);
        }
        if (this.field2951 == null && arg0.field2951 != null) {
            this.field2951 = new short[var2];
            Arrays.fill(this.field2951, (short) -1);
        }
        if (this.field2950 == null && arg0.field2950 != null) {
            this.field2950 = new byte[var2];
            Arrays.fill(this.field2950, (byte) -1);
        }
    }

    @ObfuscatedName("ka.ao(Lka;)V")
    public void method5109(class280 arg0) {
        if (arg0 == null) {
            return;
        }
        this.method5041(arg0);
        for (int var2 = 0; var2 < arg0.field2941; var2++) {
            this.field2930[this.field2941] = arg0.field2930[var2] + this.field2937;
            this.field2943[this.field2941] = arg0.field2943[var2] + this.field2937;
            this.field2965[this.field2941] = arg0.field2965[var2] + this.field2937;
            this.field2945[this.field2941] = arg0.field2945[var2];
            this.field3006[this.field2941] = arg0.field3006[var2];
            this.field2947[this.field2941] = arg0.field2947[var2];
            if (this.field2948 != null) {
                this.field2948[this.field2941] = arg0.field2948 == null ? arg0.field2952 : arg0.field2948[var2];
            }
            if (this.field2949 != null && arg0.field2949 != null) {
                this.field2949[this.field2941] = arg0.field2949[var2];
            }
            if (this.field2951 != null) {
                this.field2951[this.field2941] = arg0.field2951 == null ? -1 : arg0.field2951[var2];
            }
            if (this.field2950 != null) {
                if (arg0.field2950 == null || arg0.field2950[var2] == -1) {
                    this.field2950[this.field2941] = -1;
                } else {
                    this.field2950[this.field2941] = (byte) (arg0.field2950[var2] + this.field2953);
                }
            }
            this.field2941++;
        }
        for (int var3 = 0; var3 < arg0.field2953; var3++) {
            this.field2954[this.field2953] = arg0.field2954[var3] + this.field2937;
            this.field2986[this.field2953] = arg0.field2986[var3] + this.field2937;
            this.field2956[this.field2953] = arg0.field2956[var3] + this.field2937;
            this.field2953++;
        }
        for (int var4 = 0; var4 < arg0.field2937; var4++) {
            this.field2989[this.field2937] = arg0.field2989[var4];
            this.field2939[this.field2937] = arg0.field2939[var4];
            this.field2940[this.field2937] = arg0.field2940[var4];
            this.field2937++;
        }
    }

    @ObfuscatedName("ka.ab([[IIIIZI)Lka;")
    public class280 method5028(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method5033();
        int var7 = arg1 - this.field2955;
        int var8 = this.field2955 + arg1;
        int var9 = arg3 - this.field2955;
        int var10 = this.field2955 + arg3;
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
        class280 var15;
        if (arg4) {
            var15 = new class280();
            var15.field2937 = this.field2937;
            var15.field2941 = this.field2941;
            var15.field2953 = this.field2953;
            var15.field2989 = this.field2989;
            var15.field2940 = this.field2940;
            var15.field2930 = this.field2930;
            var15.field2943 = this.field2943;
            var15.field2965 = this.field2965;
            var15.field2945 = this.field2945;
            var15.field3006 = this.field3006;
            var15.field2947 = this.field2947;
            var15.field2948 = this.field2948;
            var15.field2949 = this.field2949;
            var15.field2950 = this.field2950;
            var15.field2951 = this.field2951;
            var15.field2952 = this.field2952;
            var15.field2954 = this.field2954;
            var15.field2986 = this.field2986;
            var15.field2956 = this.field2956;
            var15.field2957 = this.field2957;
            var15.field2964 = this.field2964;
            var15.field2990 = this.field2990;
            var15.field2939 = new int[var15.field2937];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2937; var16++) {
                int var17 = this.field2989[var16] + arg1;
                int var18 = this.field2940[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2939[var16] = this.field2939[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2937; var26++) {
                int var27 = (-this.field2939[var26] << 16) / this.field2874;
                if (var27 < arg5) {
                    int var28 = this.field2989[var26] + arg1;
                    int var29 = this.field2940[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2939[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2939[var26];
                }
            }
        }
        var15.method5036();
        return var15;
    }

    @ObfuscatedName("ka.az(Z)Lka;")
    public class280 method5029(boolean arg0) {
        if (!arg0 && field2931.length < this.field2941) {
            field2931 = new byte[this.field2941 + 100];
        }
        return this.method5031(arg0, field2932, field2931);
    }

    @ObfuscatedName("ka.ap(Z)Lka;")
    public class280 method5101(boolean arg0) {
        if (!arg0 && field2946.length < this.field2941) {
            field2946 = new byte[this.field2941 + 100];
        }
        return this.method5031(arg0, field2969, field2946);
    }

    @ObfuscatedName("ka.av(ZLka;[B)Lka;")
    public class280 method5031(boolean arg0, class280 arg1, byte[] arg2) {
        arg1.field2937 = this.field2937;
        arg1.field2941 = this.field2941;
        arg1.field2953 = this.field2953;
        if (arg1.field2989 == null || arg1.field2989.length < this.field2937) {
            arg1.field2989 = new int[this.field2937 + 100];
            arg1.field2939 = new int[this.field2937 + 100];
            arg1.field2940 = new int[this.field2937 + 100];
        }
        for (int var4 = 0; var4 < this.field2937; var4++) {
            arg1.field2989[var4] = this.field2989[var4];
            arg1.field2939[var4] = this.field2939[var4];
            arg1.field2940[var4] = this.field2940[var4];
        }
        if (arg0) {
            arg1.field2949 = this.field2949;
        } else {
            arg1.field2949 = arg2;
            if (this.field2949 == null) {
                for (int var5 = 0; var5 < this.field2941; var5++) {
                    arg1.field2949[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field2941; var6++) {
                    arg1.field2949[var6] = this.field2949[var6];
                }
            }
        }
        arg1.field2930 = this.field2930;
        arg1.field2943 = this.field2943;
        arg1.field2965 = this.field2965;
        arg1.field2945 = this.field2945;
        arg1.field3006 = this.field3006;
        arg1.field2947 = this.field2947;
        arg1.field2948 = this.field2948;
        arg1.field2950 = this.field2950;
        arg1.field2951 = this.field2951;
        arg1.field2952 = this.field2952;
        arg1.field2954 = this.field2954;
        arg1.field2986 = this.field2986;
        arg1.field2956 = this.field2956;
        arg1.field2957 = this.field2957;
        arg1.field2964 = this.field2964;
        arg1.field2959 = this.field2959;
        arg1.field2936 = this.field2936;
        arg1.field2990 = this.field2990;
        arg1.method5036();
        arg1.field2967 = 0;
        return arg1;
    }

    @ObfuscatedName("ka.ax(I)V")
    public void method5032(int arg0) {
        if (this.field2944.containsKey(arg0)) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field3002[arg0];
        int var9 = field2996[arg0];
        for (int var10 = 0; var10 < this.field2937; var10++) {
            int var11 = class279.method4569(this.field2989[var10], this.field2940[var10], var8, var9);
            int var12 = this.field2939[var10];
            int var13 = this.field2989[var10];
            int var14 = this.field2940[var10];
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
        class272 var17 = new class272((var2 + var5) / 2, (var3 + var6) / 2, (var4 + var7) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
        boolean var18 = true;
        if (var17.field2867 < 32) {
            var17.field2867 = 32;
        }
        if (var17.field2869 < 32) {
            var17.field2869 = 32;
        }
        if (this.field2990) {
            boolean var19 = true;
            var17.field2867 += 8;
            var17.field2869 += 8;
        }
        this.field2944.put(arg0, var17);
    }

    @ObfuscatedName("ka.as()V")
    public void method5033() {
        if (this.field2962 == 1) {
            return;
        }
        this.field2962 = 1;
        this.field2874 = 0;
        this.field2961 = 0;
        this.field2955 = 0;
        for (int var1 = 0; var1 < this.field2937; var1++) {
            int var2 = this.field2989[var1];
            int var3 = this.field2939[var1];
            int var4 = this.field2940[var1];
            if (-var3 > this.field2874) {
                this.field2874 = -var3;
            }
            if (var3 > this.field2961) {
                this.field2961 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2955) {
                this.field2955 = var5;
            }
        }
        this.field2955 = (int) (Math.sqrt((double) this.field2955) + 0.99D);
        this.field2966 = (int) (Math.sqrt((double) (this.field2874 * this.field2874 + this.field2955 * this.field2955)) + 0.99D);
        this.field3005 = this.field2966 + (int) (Math.sqrt((double) (this.field2961 * this.field2961 + this.field2955 * this.field2955)) + 0.99D);
    }

    @ObfuscatedName("ka.ay()V")
    public void method5034() {
        if (this.field2962 == 2) {
            return;
        }
        this.field2962 = 2;
        this.field2955 = 0;
        for (int var1 = 0; var1 < this.field2937; var1++) {
            int var2 = this.field2989[var1];
            int var3 = this.field2939[var1];
            int var4 = this.field2940[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field2955) {
                this.field2955 = var5;
            }
        }
        this.field2955 = (int) (Math.sqrt((double) this.field2955) + 0.99D);
        this.field2966 = this.field2955;
        this.field3005 = this.field2955 + this.field2955;
    }

    @ObfuscatedName("ka.ak()I")
    public int method5035() {
        this.method5033();
        return this.field2955;
    }

    @ObfuscatedName("ka.aj()V")
    public void method5036() {
        this.field2962 = 0;
        this.field2944.clear();
    }

    @ObfuscatedName("ka.am(Lko;I)V")
    public void method5037(class275 arg0, int arg1) {
        if (this.field2957 == null || arg1 == -1) {
            return;
        }
        class265 var3 = arg0.field2878[arg1];
        class270 var4 = var3.field2735;
        Statics.field2970 = 0;
        Statics.field2991 = 0;
        Statics.field2992 = 0;
        for (int var5 = 0; var5 < var3.field2736; var5++) {
            int var6 = var3.field2740[var5];
            this.method5044(var4.field2797[var6], var4.field2798[var6], var3.field2738[var5], var3.field2741[var5], var3.field2733[var5]);
        }
        this.method5036();
    }

    @ObfuscatedName("ka.aq(Lfo;I)V")
    public void method5038(class140 arg0, int arg1) {
        class270 var3 = arg0.field1601;
        class268 var4 = var3.method4788();
        if (var4 != null) {
            var3.method4788().method4743(arg0, arg1);
            this.method5091(var3.method4788(), arg0.method3031());
        }
        if (arg0.method3028()) {
            this.method5039(arg0, arg1);
        }
        this.method5036();
    }

    @ObfuscatedName("ka.ai(Lfo;I)V")
    public void method5039(class140 arg0, int arg1) {
        class270 var3 = arg0.field1601;
        for (int var4 = 0; var4 < var3.field2793; var4++) {
            int var5 = var3.field2797[var4];
            if (var5 == 5 && arg0.field1597 != null && arg0.field1597[var4] != null && arg0.field1597[var4][0] != null && this.field2964 != null && this.field2949 != null) {
                class132 var6 = arg0.field1597[var4][0];
                int[] var7 = var3.field2798[var4];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10 = var7[var9];
                    if (var10 < this.field2964.length) {
                        int[] var11 = this.field2964[var10];
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            int var13 = var11[var12];
                            int var14 = (int) ((float) (this.field2949[var13] & 0xFF) + var6.method2945(arg1) * 255.0F);
                            if (var14 < 0) {
                                var14 = 0;
                            } else if (var14 > 255) {
                                var14 = 255;
                            }
                            this.field2949[var13] = (byte) var14;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ka.aw(Lkz;I)V")
    public void method5091(class268 arg0, int arg1) {
        this.method5125(arg0, arg1);
    }

    @ObfuscatedName("ka.ae(Lko;ILko;I[I)V")
    public void method5094(class275 arg0, int arg1, class275 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method5037(arg0, arg1);
            return;
        }
        class265 var6 = arg0.field2878[arg1];
        class265 var7 = arg2.field2878[arg3];
        class270 var8 = var6.field2735;
        Statics.field2970 = 0;
        Statics.field2991 = 0;
        Statics.field2992 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field2736; var11++) {
            int var12 = var6.field2740[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2797[var12] == 0) {
                this.method5044(var8.field2797[var12], var8.field2798[var12], var6.field2738[var11], var6.field2741[var11], var6.field2733[var11]);
            }
        }
        Statics.field2970 = 0;
        Statics.field2991 = 0;
        Statics.field2992 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field2736; var15++) {
            int var16 = var7.field2740[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2797[var16] == 0) {
                this.method5044(var8.field2797[var16], var8.field2798[var16], var7.field2738[var15], var7.field2741[var15], var7.field2733[var15]);
            }
        }
        this.method5036();
    }

    @ObfuscatedName("ka.an(Lkd;Lfo;I[ZZZ)V")
    public void method5042(class270 arg0, class140 arg1, int arg2, boolean[] arg3, boolean arg4, boolean arg5) {
        class268 var7 = arg0.method4788();
        if (var7 != null) {
            var7.method4753(arg1, arg2, arg3, arg4);
            if (arg5) {
                this.method5091(var7, arg1.method3031());
            }
        }
        if (!arg4 && arg1.method3028()) {
            this.method5039(arg1, arg2);
        }
    }

    @ObfuscatedName("ka.ag(Lko;I[IZ)V")
    public void method5043(class275 arg0, int arg1, int[] arg2, boolean arg3) {
        if (arg2 == null) {
            this.method5037(arg0, arg1);
            return;
        }
        class265 var5 = arg0.field2878[arg1];
        class270 var6 = var5.field2735;
        byte var7 = 0;
        int var11 = var7 + 1;
        int var8 = arg2[var7];
        Statics.field2970 = 0;
        Statics.field2991 = 0;
        Statics.field2992 = 0;
        for (int var9 = 0; var9 < var5.field2736; var9++) {
            int var10 = var5.field2740[var9];
            while (var10 > var8) {
                var8 = arg2[var11++];
            }
            if (arg3) {
                if (var8 == var10 || var6.field2797[var10] == 0) {
                    this.method5044(var6.field2797[var10], var6.field2798[var10], var5.field2738[var9], var5.field2741[var9], var5.field2733[var9]);
                }
            } else if (var8 != var10 || var6.field2797[var10] == 0) {
                this.method5044(var6.field2797[var10], var6.field2798[var10], var5.field2738[var9], var5.field2741[var9], var5.field2733[var9]);
            }
        }
    }

    @ObfuscatedName("ka.ad(I[IIII)V")
    public void method5044(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field2970 = 0;
            Statics.field2991 = 0;
            Statics.field2992 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field2957.length) {
                    int[] var10 = this.field2957[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field2970 += this.field2989[var12];
                        Statics.field2991 += this.field2939[var12];
                        Statics.field2992 += this.field2940[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field2970 = Statics.field2970 / var7 + arg2;
                Statics.field2991 = Statics.field2991 / var7 + arg3;
                Statics.field2992 = Statics.field2992 / var7 + arg4;
            } else {
                Statics.field2970 = arg2;
                Statics.field2991 = arg3;
                Statics.field2992 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field2957.length) {
                    int[] var15 = this.field2957[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field2989[var17] += arg2;
                        this.field2939[var17] += arg3;
                        this.field2940[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field2957.length) {
                    int[] var20 = this.field2957[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field2989[var22] -= Statics.field2970;
                        this.field2939[var22] -= Statics.field2991;
                        this.field2940[var22] -= Statics.field2992;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field2996[var25];
                            int var27 = field3002[var25];
                            int var28 = this.field2989[var22] * var27 + this.field2939[var22] * var26 >> 16;
                            this.field2939[var22] = this.field2939[var22] * var27 - this.field2989[var22] * var26 >> 16;
                            this.field2989[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field2996[var23];
                            int var30 = field3002[var23];
                            int var31 = this.field2939[var22] * var30 - this.field2940[var22] * var29 >> 16;
                            this.field2940[var22] = this.field2940[var22] * var30 + this.field2939[var22] * var29 >> 16;
                            this.field2939[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field2996[var24];
                            int var33 = field3002[var24];
                            int var34 = this.field2989[var22] * var33 + this.field2940[var22] * var32 >> 16;
                            this.field2940[var22] = this.field2940[var22] * var33 - this.field2989[var22] * var32 >> 16;
                            this.field2989[var22] = var34;
                        }
                        this.field2989[var22] += Statics.field2970;
                        this.field2939[var22] += Statics.field2991;
                        this.field2940[var22] += Statics.field2992;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field2957.length) {
                    int[] var37 = this.field2957[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field2989[var39] -= Statics.field2970;
                        this.field2939[var39] -= Statics.field2991;
                        this.field2940[var39] -= Statics.field2992;
                        this.field2989[var39] = this.field2989[var39] * arg2 / 128;
                        this.field2939[var39] = this.field2939[var39] * arg3 / 128;
                        this.field2940[var39] = this.field2940[var39] * arg4 / 128;
                        this.field2989[var39] += Statics.field2970;
                        this.field2939[var39] += Statics.field2991;
                        this.field2940[var39] += Statics.field2992;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2964 != null && this.field2949 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field2964.length) {
                    int[] var42 = this.field2964[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field2949[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field2949[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ka.af()V")
    public void method5068() {
        for (int var1 = 0; var1 < this.field2937; var1++) {
            int var2 = this.field2989[var1];
            this.field2989[var1] = this.field2940[var1];
            this.field2940[var1] = -var2;
        }
        this.method5036();
    }

    @ObfuscatedName("ka.be()V")
    public void method5048() {
        for (int var1 = 0; var1 < this.field2937; var1++) {
            this.field2989[var1] = -this.field2989[var1];
            this.field2940[var1] = -this.field2940[var1];
        }
        this.method5036();
    }

    @ObfuscatedName("ka.bd()V")
    public void method5047() {
        for (int var1 = 0; var1 < this.field2937; var1++) {
            int var2 = this.field2940[var1];
            this.field2940[var1] = this.field2989[var1];
            this.field2989[var1] = -var2;
        }
        this.method5036();
    }

    @ObfuscatedName("ka.bl(I)V")
    public void method5100(int arg0) {
        int var2 = field2996[arg0];
        int var3 = field3002[arg0];
        for (int var4 = 0; var4 < this.field2937; var4++) {
            int var5 = this.field2939[var4] * var3 - this.field2940[var4] * var2 >> 16;
            this.field2940[var4] = this.field2940[var4] * var3 + this.field2939[var4] * var2 >> 16;
            this.field2939[var4] = var5;
        }
        this.method5036();
    }

    @ObfuscatedName("ka.bi(III)V")
    public void method5133(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2937; var4++) {
            this.field2989[var4] += arg0;
            this.field2939[var4] += arg1;
            this.field2940[var4] += arg2;
        }
        this.method5036();
    }

    @ObfuscatedName("ka.bv(III)V")
    public void method5050(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2937; var4++) {
            this.field2989[var4] = this.field2989[var4] * arg0 / 128;
            this.field2939[var4] = this.field2939[var4] * arg1 / 128;
            this.field2940[var4] = this.field2940[var4] * arg2 / 128;
        }
        this.method5036();
    }

    @ObfuscatedName("ka.bf(IIIIIII)V")
    public final void method5024(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field2962 != 2 && this.field2962 != 1) {
            this.method5034();
        }
        int var8 = class267.method4665();
        int var9 = class267.method4666();
        int var10 = field2996[arg0];
        int var11 = field3002[arg0];
        int var12 = field2996[arg1];
        int var13 = field3002[arg1];
        int var14 = field2996[arg2];
        int var15 = field3002[arg2];
        int var16 = field2996[arg3];
        int var17 = field3002[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field2937; var19++) {
            int var20 = this.field2989[var19];
            int var21 = this.field2939[var19];
            int var22 = this.field2940[var19];
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
            field2974[var19] = var30 - var18;
            field2971[var19] = var8 + var26 * class267.method4671() / var30;
            field2994[var19] = var9 + var29 * class267.method4671() / var30;
            field2973[var19] = class279.method4510(var30);
            if (this.field2953 > 0) {
                field2975[var19] = var26;
                field2960[var19] = var29;
                field2977[var19] = var30;
            }
        }
        try {
            this.method5053(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ka.bg(IIIIIIII)V")
    public final void method5052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (this.field2962 != 2 && this.field2962 != 1) {
            this.method5034();
        }
        int var9 = class267.method4665();
        int var10 = class267.method4666();
        int var11 = field2996[arg0];
        int var12 = field3002[arg0];
        int var13 = field2996[arg1];
        int var14 = field3002[arg1];
        int var15 = field2996[arg2];
        int var16 = field3002[arg2];
        int var17 = field2996[arg3];
        int var18 = field3002[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field2937; var20++) {
            int var21 = this.field2989[var20];
            int var22 = this.field2939[var20];
            int var23 = this.field2940[var20];
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
            field2974[var20] = var31 - var19;
            field2971[var20] = var9 + var27 * class267.method4671() / arg7;
            field2994[var20] = var10 + var30 * class267.method4671() / arg7;
            field2973[var20] = class279.method4510(arg7);
            if (this.field2953 > 0) {
                field2975[var20] = var27;
                field2960[var20] = var30;
                field2977[var20] = var31;
            }
        }
        try {
            this.method5053(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ka.dw(IIIIIIIIJ)V")
    public void method4974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field2962 != 1) {
            this.method5033();
        }
        this.method5032(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field2955 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field2955) * class267.method4671();
        if (var16 / var14 >= class267.method4668()) {
            return;
        }
        int var17 = (this.field2955 + var15) * class267.method4671();
        if (var17 / var14 <= class267.method4669()) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field2955 * arg1 >> 16;
        int var20 = (this.field2961 * arg2 >> 16) + var19;
        int var21 = (var18 + var20) * class267.method4671();
        if (var21 / var14 <= class267.method4670()) {
            return;
        }
        int var22 = (this.field2874 * arg2 >> 16) + var19;
        int var23 = (var18 - var22) * class267.method4671();
        if (var23 / var14 >= class267.method4673()) {
            return;
        }
        int var24 = (this.field2874 * arg1 >> 16) + var13;
        boolean var25 = false;
        boolean var26 = false;
        if (var12 - var24 <= 50) {
            var26 = true;
        }
        boolean var27 = var26 || this.field2953 > 0;
        int var28 = class281.field3013;
        int var30 = class281.field3010;
        boolean var32 = class281.field3020;
        boolean var34 = class281.method3798(arg8);
        boolean var35 = false;
        if (var34 && var32) {
            boolean var36 = false;
            if (field2993) {
                boolean var38 = class281.field3020;
                boolean var39;
                if (var38) {
                    if (!class281.field3011) {
                        int var40 = Statics.field2802;
                        int var41 = Statics.field2827;
                        int var42 = Statics.field2826;
                        int var43 = Statics.field2829;
                        byte var44 = 50;
                        short var45 = 3500;
                        int var46 = (class281.field3013 - class267.method4665()) * var44 / class267.method4671();
                        int var47 = (class281.field3010 - class267.method4666()) * var44 / class267.method4671();
                        int var48 = (class281.field3013 - class267.method4665()) * var45 / class267.method4671();
                        int var49 = (class281.field3010 - class267.method4666()) * var45 / class267.method4671();
                        int var50 = var40 * var44 + var41 * var47 >> 16;
                        int var52 = var41 * var44 - var40 * var47 >> 16;
                        int var55 = var40 * var45 + var41 * var49 >> 16;
                        int var57 = var41 * var45 - var40 * var49 >> 16;
                        int var60 = class279.method2404(var46, var52, var43, var42);
                        int var61 = class279.method3200(var46, var52, var43, var42);
                        int var63 = class279.method2404(var48, var57, var43, var42);
                        int var64 = class279.method3200(var48, var57, var43, var42);
                        Statics.field4569 = (var60 + var63) / 2;
                        Statics.field1353 = (var50 + var55) / 2;
                        Statics.field1791 = (var61 + var64) / 2;
                        Statics.field3124 = (var63 - var60) / 2;
                        Statics.field4476 = (var55 - var50) / 2;
                        Statics.field3012 = (var64 - var61) / 2;
                        Statics.field3014 = Math.abs(Statics.field3124);
                        Statics.field3404 = Math.abs(Statics.field4476);
                        Statics.field3009 = Math.abs(Statics.field3012);
                    }
                    class272 var66 = (class272) this.field2944.get(arg0);
                    int var67 = var66.field2872 + arg5;
                    int var68 = var66.field2868 + arg6;
                    int var69 = var66.field2870 + arg7;
                    int var70 = var66.field2867;
                    int var71 = var66.field2871;
                    int var72 = var66.field2869;
                    int var73 = Statics.field4569 - var67;
                    int var74 = Statics.field1353 - var68;
                    int var75 = Statics.field1791 - var69;
                    if (Math.abs(var73) > Statics.field3014 + var70) {
                        var39 = false;
                    } else if (Math.abs(var74) > Statics.field3404 + var71) {
                        var39 = false;
                    } else if (Math.abs(var75) > Statics.field3009 + var72) {
                        var39 = false;
                    } else if (Math.abs(Statics.field4476 * var75 - Statics.field3012 * var74) > Statics.field3404 * var72 + Statics.field3009 * var71) {
                        var39 = false;
                    } else if (Math.abs(Statics.field3012 * var73 - Statics.field3124 * var75) > Statics.field3014 * var72 + Statics.field3009 * var70) {
                        var39 = false;
                    } else if (Math.abs(Statics.field3124 * var74 - Statics.field4476 * var73) > Statics.field3404 * var70 + Statics.field3014 * var71) {
                        var39 = false;
                    } else {
                        var39 = true;
                    }
                } else {
                    var39 = false;
                }
                var36 = var39;
            } else {
                int var76 = var12 - var13;
                if (var76 <= 50) {
                    var76 = 50;
                }
                int var77;
                int var78;
                if (var15 > 0) {
                    var77 = var16 / var14;
                    var78 = var17 / var76;
                } else {
                    var78 = var17 / var14;
                    var77 = var16 / var76;
                }
                int var79;
                int var80;
                if (var18 > 0) {
                    var79 = var23 / var14;
                    var80 = var21 / var76;
                } else {
                    var80 = var21 / var14;
                    var79 = var23 / var76;
                }
                int var81 = var28 - class267.method4665();
                int var82 = var30 - class267.method4666();
                if (var81 > var77 && var81 < var78 && var82 > var79 && var82 < var80) {
                    var36 = true;
                }
            }
            if (var36) {
                if (this.field2990) {
                    class281.field3008[++class281.field3015 - 1] = arg8;
                } else {
                    var35 = true;
                }
            }
        }
        int var85 = class267.method4665();
        int var86 = class267.method4666();
        int var87 = 0;
        int var88 = 0;
        if (arg0 != 0) {
            var87 = field2996[arg0];
            var88 = field3002[arg0];
        }
        for (int var89 = 0; var89 < this.field2937; var89++) {
            int var90 = this.field2989[var89];
            int var91 = this.field2939[var89];
            int var92 = this.field2940[var89];
            if (arg0 != 0) {
                int var93 = var87 * var92 + var88 * var90 >> 16;
                var92 = var88 * var92 - var87 * var90 >> 16;
                var90 = var93;
            }
            int var94 = arg5 + var90;
            int var95 = arg6 + var91;
            int var96 = arg7 + var92;
            int var97 = arg3 * var96 + arg4 * var94 >> 16;
            int var98 = arg4 * var96 - arg3 * var94 >> 16;
            int var100 = arg2 * var95 - arg1 * var98 >> 16;
            int var101 = arg1 * var95 + arg2 * var98 >> 16;
            field2974[var89] = var101 - var12;
            if (var101 >= 50) {
                field2971[var89] = var85 + var97 * class267.method4671() / var101;
                field2994[var89] = var86 + var100 * class267.method4671() / var101;
                field2973[var89] = class279.method4510(var101);
            } else {
                field2971[var89] = -5000;
                var25 = true;
            }
            if (var27) {
                field2975[var89] = var97;
                field2960[var89] = var100;
                field2977[var89] = var101;
            }
        }
        try {
            this.method5053(var25, var35, this.field2990, arg8);
        } catch (Exception var104) {
        }
    }

    @ObfuscatedName("ka.ba(ZZZJ)V")
    public final void method5053(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field3005 >= 6000) {
            return;
        }
        for (int var6 = 0; var6 < this.field3005; var6++) {
            field2979[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (char var8 = 0; var8 < this.field2941; var8++) {
            if (this.field2947[var8] != -2) {
                int var9 = this.field2930[var8];
                int var10 = this.field2943[var8];
                int var11 = this.field2965[var8];
                int var12 = field2971[var9];
                int var13 = field2971[var10];
                int var14 = field2971[var11];
                if (arg0 && var12 == -5000 || var13 == -5000 || var14 == -5000) {
                    int var15 = field2975[var9];
                    int var16 = field2975[var10];
                    int var17 = field2975[var11];
                    int var18 = field2960[var9];
                    int var19 = field2960[var10];
                    int var20 = field2960[var11];
                    int var21 = field2977[var9];
                    int var22 = field2977[var10];
                    int var23 = field2977[var11];
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
                        field2958[var8] = true;
                        int var33 = (field2974[var9] + field2974[var10] + field2974[var11]) / 3 + this.field2966;
                        field2980[var33][field2979[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class281.method4016(field2994[var9], field2994[var10], field2994[var11], var12, var13, var14, var7)) {
                        class281.field3008[++class281.field3015 - 1] = arg3;
                        arg1 = false;
                    }
                    if ((field2994[var11] - field2994[var10]) * (var12 - var13) - (field2994[var9] - field2994[var10]) * (var14 - var13) > 0) {
                        field2958[var8] = false;
                        int var36 = class267.method4708();
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= var36 && var13 <= var36 && var14 <= var36) {
                            field2933[var8] = false;
                        } else {
                            field2933[var8] = true;
                        }
                        int var37 = (field2974[var9] + field2974[var10] + field2974[var11]) / 3 + this.field2966;
                        field2980[var37][field2979[var37]++] = var8;
                    }
                }
            }
        }
        if (this.field2948 == null) {
            for (int var38 = this.field3005 - 1; var38 >= 0; var38--) {
                char var39 = field2979[var38];
                if (var39 > 0) {
                    char[] var40 = field2980[var38];
                    for (int var41 = 0; var41 < var39; var41++) {
                        this.method5054(var40[var41]);
                    }
                }
            }
            return;
        }
        for (int var42 = 0; var42 < 12; var42++) {
            field2981[var42] = 0;
            field2985[var42] = 0;
        }
        for (int var43 = this.field3005 - 1; var43 >= 0; var43--) {
            char var44 = field2979[var43];
            if (var44 > 0) {
                char[] var45 = field2980[var43];
                for (int var46 = 0; var46 < var44; var46++) {
                    char var47 = var45[var46];
                    byte var48 = this.field2948[var47];
                    int var49 = field2981[var48]++;
                    field2982[var48][var49] = var47;
                    if (var48 < 10) {
                        field2985[var48] += var43;
                    } else if (var48 == 10) {
                        field2983[var49] = var43;
                    } else {
                        field2988[var49] = var43;
                    }
                }
            }
        }
        int var50 = 0;
        if (field2981[1] > 0 || field2981[2] > 0) {
            var50 = (field2985[1] + field2985[2]) / (field2981[1] + field2981[2]);
        }
        int var51 = 0;
        if (field2981[3] > 0 || field2981[4] > 0) {
            var51 = (field2985[3] + field2985[4]) / (field2981[3] + field2981[4]);
        }
        int var52 = 0;
        if (field2981[6] > 0 || field2981[8] > 0) {
            var52 = (field2985[6] + field2985[8]) / (field2981[6] + field2981[8]);
        }
        int var53 = 0;
        int var54 = field2981[10];
        int[] var55 = field2982[10];
        int[] var56 = field2983;
        if (var53 == var54) {
            var53 = 0;
            var54 = field2981[11];
            var55 = field2982[11];
            var56 = field2988;
        }
        int var57;
        if (var53 < var54) {
            var57 = var56[var53];
        } else {
            var57 = -1000;
        }
        for (int var58 = 0; var58 < 10; var58++) {
            while (var58 == 0 && var57 > var50) {
                this.method5054(var55[var53++]);
                if (var53 == var54 && field2982[11] != var55) {
                    var53 = 0;
                    var54 = field2981[11];
                    var55 = field2982[11];
                    var56 = field2988;
                }
                if (var53 < var54) {
                    var57 = var56[var53];
                } else {
                    var57 = -1000;
                }
            }
            while (var58 == 3 && var57 > var51) {
                this.method5054(var55[var53++]);
                if (var53 == var54 && field2982[11] != var55) {
                    var53 = 0;
                    var54 = field2981[11];
                    var55 = field2982[11];
                    var56 = field2988;
                }
                if (var53 < var54) {
                    var57 = var56[var53];
                } else {
                    var57 = -1000;
                }
            }
            while (var58 == 5 && var57 > var52) {
                this.method5054(var55[var53++]);
                if (var53 == var54 && field2982[11] != var55) {
                    var53 = 0;
                    var54 = field2981[11];
                    var55 = field2982[11];
                    var56 = field2988;
                }
                if (var53 < var54) {
                    var57 = var56[var53];
                } else {
                    var57 = -1000;
                }
            }
            int var59 = field2981[var58];
            int[] var60 = field2982[var58];
            for (int var61 = 0; var61 < var59; var61++) {
                this.method5054(var60[var61]);
            }
        }
        while (var57 != -1000) {
            this.method5054(var55[var53++]);
            if (var53 == var54 && field2982[11] != var55) {
                var53 = 0;
                var55 = field2982[11];
                var54 = field2981[11];
                var56 = field2988;
            }
            if (var53 < var54) {
                var57 = var56[var53];
            } else {
                var57 = -1000;
            }
        }
    }

    @ObfuscatedName("ka.bm(I)V")
    public final void method5054(int arg0) {
        if (field2958[arg0]) {
            this.method5057(arg0);
            return;
        }
        int var2 = this.field2930[arg0];
        int var3 = this.field2943[arg0];
        int var4 = this.field2965[arg0];
        class267.field2773.field3037 = field2933[arg0];
        if (this.field2949 == null) {
            class267.field2773.field3052 = 0;
        } else {
            class267.field2773.field3052 = (this.field2949[arg0] == -1 ? 253 : this.field2949[arg0]) & 0xFF;
        }
        this.method5056(arg0, field2994[var2], field2994[var3], field2994[var4], field2971[var2], field2971[var3], field2971[var4], field2973[var2], field2973[var3], field2973[var4], this.field2945[arg0], this.field3006[arg0], this.field2947[arg0]);
    }

    @ObfuscatedName("ka.bp(I)Z")
    public boolean method5055(int arg0) {
        return this.field2967 > 0 && arg0 < this.field3007;
    }

    @ObfuscatedName("ka.bw(IIIIIIIFFFIII)V")
    public final void method5056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8, float arg9, int arg10, int arg11, int arg12) {
        if (this.field2951 == null || this.field2951[arg0] == -1) {
            boolean var18 = this.method5055(arg0);
            if (this.field2947[arg0] == -1 && var18) {
                class267.method4684(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, field2998[this.field2945[arg0]], this.field3003, this.field3004, this.field2999, this.field2967);
            } else if (this.field2947[arg0] == -1) {
                class267.method4680(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, field2998[this.field2945[arg0]]);
            } else if (var18) {
                class267.method4683(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, this.field3003, this.field3004, this.field2999, this.field2967);
            } else {
                class267.method4685(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
            }
            return;
        }
        int var15;
        int var16;
        int var17;
        if (this.field2950 == null || this.field2950[arg0] == -1) {
            var15 = this.field2930[arg0];
            var16 = this.field2943[arg0];
            var17 = this.field2965[arg0];
        } else {
            int var14 = this.field2950[arg0] & 0xFF;
            var15 = this.field2954[var14];
            var16 = this.field2986[var14];
            var17 = this.field2956[var14];
        }
        if (this.field2947[arg0] == -1) {
            class267.method4737(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg10, arg10, field2975[var15], field2975[var16], field2975[var17], field2960[var15], field2960[var16], field2960[var17], field2977[var15], field2977[var16], field2977[var17], this.field2951[arg0]);
        } else {
            class267.method4737(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, field2975[var15], field2975[var16], field2975[var17], field2960[var15], field2960[var16], field2960[var17], field2977[var15], field2977[var16], field2977[var17], this.field2951[arg0]);
        }
    }

    @ObfuscatedName("ka.bj(I)V")
    public final void method5057(int arg0) {
        int var2 = class267.method4665();
        int var3 = class267.method4666();
        int var4 = 0;
        int var5 = this.field2930[arg0];
        int var6 = this.field2943[arg0];
        int var7 = this.field2965[arg0];
        int var8 = field2977[var5];
        int var9 = field2977[var6];
        int var10 = field2977[var7];
        if (this.field2949 == null) {
            class267.field2773.field3052 = 0;
        } else {
            class267.field2773.field3052 = this.field2949[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field2938[var4] = field2971[var5];
            field2987[var4] = field2994[var5];
            field2972[var4] = field2973[var7];
            field2984[var4++] = this.field2945[arg0];
        } else {
            int var11 = field2975[var5];
            int var12 = field2960[var5];
            int var13 = this.field2945[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field2976[var10 - var8];
                field2938[var4] = var2 + (((field2975[var7] - var11) * var14 >> 16) + var11) * class267.method4671() / 50;
                field2987[var4] = var3 + (((field2960[var7] - var12) * var14 >> 16) + var12) * class267.method4671() / 50;
                field2972[var4] = field2942;
                field2984[var4++] = ((this.field2947[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field2976[var9 - var8];
                field2938[var4] = var2 + (((field2975[var6] - var11) * var15 >> 16) + var11) * class267.method4671() / 50;
                field2987[var4] = var3 + (((field2960[var6] - var12) * var15 >> 16) + var12) * class267.method4671() / 50;
                field2972[var4] = field2942;
                field2984[var4++] = ((this.field3006[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field2938[var4] = field2971[var6];
            field2987[var4] = field2994[var6];
            field2972[var4] = field2973[var7];
            field2984[var4++] = this.field3006[arg0];
        } else {
            int var16 = field2975[var6];
            int var17 = field2960[var6];
            int var18 = this.field3006[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field2976[var8 - var9];
                field2938[var4] = var2 + (((field2975[var5] - var16) * var19 >> 16) + var16) * class267.method4671() / 50;
                field2987[var4] = var3 + (((field2960[var5] - var17) * var19 >> 16) + var17) * class267.method4671() / 50;
                field2972[var4] = field2942;
                field2984[var4++] = ((this.field2945[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field2976[var10 - var9];
                field2938[var4] = var2 + (((field2975[var7] - var16) * var20 >> 16) + var16) * class267.method4671() / 50;
                field2987[var4] = var3 + (((field2960[var7] - var17) * var20 >> 16) + var17) * class267.method4671() / 50;
                field2984[var4++] = ((this.field2947[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field2938[var4] = field2971[var7];
            field2987[var4] = field2994[var7];
            field2972[var4] = field2973[var7];
            field2984[var4++] = this.field2947[arg0];
        } else {
            int var21 = field2975[var7];
            int var22 = field2960[var7];
            int var23 = this.field2947[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field2976[var9 - var10];
                field2938[var4] = var2 + (((field2975[var6] - var21) * var24 >> 16) + var21) * class267.method4671() / 50;
                field2987[var4] = var3 + (((field2960[var6] - var22) * var24 >> 16) + var22) * class267.method4671() / 50;
                field2972[var4] = field2942;
                field2984[var4++] = ((this.field3006[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field2976[var8 - var10];
                field2938[var4] = var2 + (((field2975[var5] - var21) * var25 >> 16) + var21) * class267.method4671() / 50;
                field2987[var4] = var3 + (((field2960[var5] - var22) * var25 >> 16) + var22) * class267.method4671() / 50;
                field2972[var4] = field2942;
                field2984[var4++] = ((this.field2945[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field2938[0];
        int var27 = field2938[1];
        int var28 = field2938[2];
        int var29 = field2987[0];
        int var30 = field2987[1];
        int var31 = field2987[2];
        float var32 = field2972[0];
        float var33 = field2972[1];
        float var34 = field2972[2];
        class267.field2773.field3037 = false;
        int var35 = class267.method4708();
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > var35 || var27 > var35 || var28 > var35) {
                class267.field2773.field3037 = true;
            }
            this.method5056(arg0, var29, var30, var31, var26, var27, var28, var32, var33, var34, field2984[0], field2984[1], field2984[2]);
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > var35 || var27 > var35 || var28 > var35 || field2938[3] < 0 || field2938[3] > var35) {
            class267.field2773.field3037 = true;
        }
        if (this.field2951 == null || this.field2951[arg0] == -1) {
            boolean var41 = this.method5055(arg0);
            if (this.field2947[arg0] == -1 && var41) {
                int var42 = field2998[this.field2945[arg0]];
                class267.method4684(var29, var30, var31, var26, var27, var28, var32, var33, var34, var42, this.field3003, this.field3004, this.field2999, this.field2967);
                class267.method4684(var29, var31, field2987[3], var26, var28, field2938[3], var32, var34, field2972[3], var42, this.field3003, this.field3004, this.field2999, this.field2967);
            } else if (this.field2947[arg0] == -1) {
                int var43 = field2998[this.field2945[arg0]];
                class267.method4680(var29, var30, var31, var26, var27, var28, var32, var33, var34, var43);
                class267.method4680(var29, var31, field2987[3], var26, var28, field2938[3], var32, var34, field2972[3], var43);
            } else if (var41) {
                class267.method4683(var29, var30, var31, var26, var27, var28, var32, var33, var34, field2984[0], field2984[1], field2984[2], this.field3003, this.field2999, this.field3004, this.field2967);
                class267.method4683(var29, var31, field2987[3], var26, var28, field2938[3], 0.0F, 0.0F, 0.0F, field2984[0], field2984[2], field2984[3], this.field3003, this.field2999, this.field3004, this.field2967);
            } else {
                class267.method4685(var29, var30, var31, var26, var27, var28, var32, var33, var34, field2984[0], field2984[1], field2984[2]);
                class267.method4685(var29, var31, field2987[3], var26, var28, field2938[3], var32, var34, field2972[3], field2984[0], field2984[2], field2984[3]);
            }
            return;
        }
        int var37;
        int var38;
        int var39;
        if (this.field2950 == null || this.field2950[arg0] == -1) {
            var37 = var5;
            var38 = var6;
            var39 = var7;
        } else {
            int var36 = this.field2950[arg0] & 0xFF;
            var37 = this.field2954[var36];
            var38 = this.field2986[var36];
            var39 = this.field2956[var36];
        }
        short var40 = this.field2951[arg0];
        if (this.field2947[arg0] == -1) {
            class267.method4737(var29, var30, var31, var26, var27, var28, var32, var33, var34, this.field2945[arg0], this.field2945[arg0], this.field2945[arg0], field2975[var37], field2975[var38], field2975[var39], field2960[var37], field2960[var38], field2960[var39], field2977[var37], field2977[var38], field2977[var39], var40);
            class267.method4737(var29, var31, field2987[3], var26, var28, field2938[3], var32, var34, field2972[3], this.field2945[arg0], this.field2945[arg0], this.field2945[arg0], field2975[var37], field2975[var38], field2975[var39], field2960[var37], field2960[var38], field2960[var39], field2977[var37], field2977[var38], field2977[var39], var40);
        } else {
            class267.method4737(var29, var30, var31, var26, var27, var28, var32, var33, var34, field2984[0], field2984[1], field2984[2], field2975[var37], field2975[var38], field2975[var39], field2960[var37], field2960[var38], field2960[var39], field2977[var37], field2977[var38], field2977[var39], var40);
            class267.method4737(var29, var31, field2987[3], var26, var28, field2938[3], var32, var34, field2972[3], field2984[0], field2984[2], field2984[3], field2975[var37], field2975[var38], field2975[var39], field2960[var37], field2960[var38], field2960[var39], field2977[var37], field2977[var38], field2977[var39], var40);
        }
    }

    @ObfuscatedName("ka.bn(ILrz;)V")
    public void method5058(int arg0, class463 arg1) {
        float var3 = (float) this.field2989[arg0];
        float var4 = (float) (-this.field2939[arg0]);
        float var5 = (float) (-this.field2940[arg0]);
        float var6 = 1.0F;
        this.field2989[arg0] = (int) (arg1.field4773[12] * var6 + arg1.field4773[8] * var5 + arg1.field4773[0] * var3 + arg1.field4773[4] * var4);
        this.field2939[arg0] = -((int) (arg1.field4773[13] * var6 + arg1.field4773[9] * var5 + arg1.field4773[1] * var3 + arg1.field4773[5] * var4));
        this.field2940[arg0] = -((int) (arg1.field4773[14] * var6 + arg1.field4773[10] * var5 + arg1.field4773[2] * var3 + arg1.field4773[6] * var4));
    }

    @ObfuscatedName("ka.bo(Lkz;I)V")
    public void method5125(class268 arg0, int arg1) {
        if (this.field2959 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2937; var3++) {
            int[] var4 = this.field2959[var3];
            if (var4 != null && var4.length != 0) {
                int[] var5 = this.field2936[var3];
                field2934.method7717();
                for (int var6 = 0; var6 < var4.length; var6++) {
                    int var7 = var4[var6];
                    class129 var8 = arg0.method4741(var7);
                    if (var8 != null) {
                        field2935.method7691((float) var5[var6] / 255.0F);
                        field2997.method7664(var8.method2902(arg1));
                        field2997.method7674(field2935);
                        field2934.method7671(field2997);
                    }
                }
                this.method5058(var3, field2934);
            }
        }
    }
}
