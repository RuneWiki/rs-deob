package deob;

@ObfuscatedName("by")
public abstract class class70 extends class136 {

    @ObfuscatedName("by.aa")
    public int field986;

    @ObfuscatedName("by.ap")
    public int field930;

    @ObfuscatedName("by.ar")
    public int field931;

    @ObfuscatedName("by.ab")
    public boolean field932 = false;

    @ObfuscatedName("by.ax")
    public int field933 = 1;

    @ObfuscatedName("by.as")
    public int field934;

    @ObfuscatedName("by.ao")
    public int field935 = -1;

    @ObfuscatedName("by.al")
    public int field946 = -1;

    @ObfuscatedName("by.ad")
    public int field979 = -1;

    @ObfuscatedName("by.an")
    public int field938 = -1;

    @ObfuscatedName("by.ai")
    public int field939 = -1;

    @ObfuscatedName("by.ak")
    public int field940 = -1;

    @ObfuscatedName("by.aq")
    public int field941 = -1;

    @ObfuscatedName("by.am")
    public int field942 = -1;

    @ObfuscatedName("by.ae")
    public String field929 = null;

    @ObfuscatedName("by.av")
    public boolean field944;

    @ObfuscatedName("by.ah")
    public boolean field945 = false;

    @ObfuscatedName("by.ag")
    public int field988 = 100;

    @ObfuscatedName("by.aj")
    public int field947 = 0;

    @ObfuscatedName("by.ay")
    public int field948 = 0;

    @ObfuscatedName("by.af")
    public byte field963 = 0;

    @ObfuscatedName("by.at")
    public int[] field957 = new int[4];

    @ObfuscatedName("by.bx")
    public int[] field959 = new int[4];

    @ObfuscatedName("by.bh")
    public int[] field952 = new int[4];

    @ObfuscatedName("by.bd")
    public int[] field953 = new int[4];

    @ObfuscatedName("by.bm")
    public int[] field962 = new int[4];

    @ObfuscatedName("by.bv")
    public class261 field955 = new class261();

    @ObfuscatedName("by.bj")
    public int field956 = -1;

    @ObfuscatedName("by.bs")
    public boolean field951 = false;

    @ObfuscatedName("by.bz")
    public int field958 = -1;

    @ObfuscatedName("by.bc")
    public int field980 = -1;

    @ObfuscatedName("by.bk")
    public int field965 = 0;

    @ObfuscatedName("by.ba")
    public int field954 = 0;

    @ObfuscatedName("by.bn")
    public int field936 = -1;

    @ObfuscatedName("by.be")
    public int field961 = 0;

    @ObfuscatedName("by.bu")
    public int field964 = 0;

    @ObfuscatedName("by.bi")
    public int field937 = 0;

    @ObfuscatedName("by.bb")
    public int field966 = 0;

    @ObfuscatedName("by.bt")
    public int field967 = -1;

    @ObfuscatedName("by.by")
    public int field968 = 0;

    @ObfuscatedName("by.bq")
    public int field969 = 0;

    @ObfuscatedName("by.bo")
    public int field970;

    @ObfuscatedName("by.br")
    public int field971;

    @ObfuscatedName("by.bl")
    public int field972;

    @ObfuscatedName("by.bf")
    public int field973;

    @ObfuscatedName("by.bg")
    public int field974;

    @ObfuscatedName("by.bw")
    public int field975;

    @ObfuscatedName("by.bp")
    public int field949;

    @ObfuscatedName("by.cz")
    public int field977;

    @ObfuscatedName("by.ck")
    public int field978;

    @ObfuscatedName("by.cv")
    public int field976 = 0;

    @ObfuscatedName("by.co")
    public int field943 = 200;

    @ObfuscatedName("by.cs")
    public int field981;

    @ObfuscatedName("by.cg")
    public int field982 = 0;

    @ObfuscatedName("by.cn")
    public int field983 = 32;

    @ObfuscatedName("by.cd")
    public int field984 = 0;

    @ObfuscatedName("by.cy")
    public int[] field985 = new int[10];

    @ObfuscatedName("by.cj")
    public int[] field960 = new int[10];

    @ObfuscatedName("by.cb")
    public byte[] field987 = new byte[10];

    @ObfuscatedName("by.cr")
    public int field950 = 0;

    @ObfuscatedName("by.ct")
    public int field989 = 0;

    @ObfuscatedName("by.ag(B)V")
    public final void method1580() {
        this.field984 = 0;
        this.field989 = 0;
    }

    @ObfuscatedName("by.o(S)Z")
    public boolean method1108() {
        return false;
    }

    @ObfuscatedName("by.aj(IIIIIII)V")
    public final void method1573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field952[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class253 var13 = (class253) class253.field3321.method2992((long) arg0);
            class253 var14;
            if (var13 == null) {
                byte[] var15 = Statics.field3316.method3726(32, arg0);
                class253 var16 = new class253();
                if (var15 != null) {
                    var16.method4109(new class300(var15));
                }
                class253.field3321.method2994(var16, (long) arg0);
                var14 = var16;
            } else {
                var14 = var13;
            }
            var11 = var14.field3328;
            var12 = var14.field3319;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var18 = 0;
            if (var11 == 0) {
                var18 = this.field952[0];
            } else if (var11 == 1) {
                var18 = this.field959[0];
            }
            for (int var19 = 1; var19 < 4; var19++) {
                if (var11 == 0) {
                    if (this.field952[var19] < var18) {
                        var10 = var19;
                        var18 = this.field952[var19];
                    }
                } else if (var11 == 1 && this.field959[var19] < var18) {
                    var10 = var19;
                    var18 = this.field959[var19];
                }
            }
            if (var11 == 1 && var18 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field963 = 0;
            }
            for (int var20 = 0; var20 < 4; var20++) {
                byte var21 = this.field963;
                this.field963 = (byte) ((this.field963 + 1) % 4);
                if (this.field952[var21] <= arg4) {
                    var10 = var21;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field957[var10] = arg0;
        this.field959[var10] = arg1;
        this.field953[var10] = arg2;
        this.field962[var10] = arg3;
        this.field952[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("by.ay(IIIIIIB)V")
    public final void method1571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class247 var7 = (class247) class247.field3255.method2992((long) arg0);
        class247 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3268.method3726(33, arg0);
            class247 var10 = new class247();
            if (var9 != null) {
                var10.method4029(new class300(var9));
            }
            class247.field3255.method2994(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class247 var11 = var8;
        class79 var12 = null;
        class79 var13 = null;
        int var14 = var8.field3263;
        int var15 = 0;
        for (class79 var16 = (class79) this.field955.method4385(); var16 != null; var16 = (class79) this.field955.method4365()) {
            var15++;
            if (var16.field1110.field3259 == var11.field3259) {
                var16.method1844(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1110.field3262 <= var11.field3262) {
                var12 = var16;
            }
            if (var16.field1110.field3263 > var14) {
                var13 = var16;
                var14 = var16.field1110.field3263;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class79 var17 = new class79(var11);
        if (var12 == null) {
            this.field955.method4368(var17);
        } else {
            class261.method4362(var17, var12);
        }
        var17.method1844(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3249();
        }
    }

    @ObfuscatedName("by.au(II)V")
    public final void method1572(int arg0) {
        class247 var2 = (class247) class247.field3255.method2992((long) arg0);
        class247 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3268.method3726(33, arg0);
            class247 var5 = new class247();
            if (var4 != null) {
                var5.method4029(new class300(var4));
            }
            class247.field3255.method2994(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class247 var6 = var3;
        for (class79 var7 = (class79) this.field955.method4385(); var7 != null; var7 = (class79) this.field955.method4365()) {
            if (var7.field1110 == var6) {
                var7.method3249();
                return;
            }
        }
    }
}
