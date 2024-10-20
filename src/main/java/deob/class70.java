package deob;

@ObfuscatedName("be")
public abstract class class70 extends class136 {

    @ObfuscatedName("be.av")
    public int field971;

    @ObfuscatedName("be.an")
    public boolean field920 = false;

    @ObfuscatedName("be.al")
    public int field918;

    @ObfuscatedName("be.as")
    public int field931;

    @ObfuscatedName("be.ad")
    public int field939 = 1;

    @ObfuscatedName("be.ap")
    public int field922;

    @ObfuscatedName("be.ax")
    public int field923 = -1;

    @ObfuscatedName("be.aj")
    public int field956 = -1;

    @ObfuscatedName("be.ab")
    public int field947 = -1;

    @ObfuscatedName("be.af")
    public int field926 = -1;

    @ObfuscatedName("be.ak")
    public int field927 = -1;

    @ObfuscatedName("be.ay")
    public int field924 = -1;

    @ObfuscatedName("be.ae")
    public int field929 = -1;

    @ObfuscatedName("be.ah")
    public int field930 = -1;

    @ObfuscatedName("be.aa")
    public String field921 = null;

    @ObfuscatedName("be.aq")
    public boolean field932;

    @ObfuscatedName("be.ar")
    public boolean field957 = false;

    @ObfuscatedName("be.ac")
    public int field934 = 100;

    @ObfuscatedName("be.az")
    public int field935 = 0;

    @ObfuscatedName("be.ai")
    public int field936 = 0;

    @ObfuscatedName("be.aw")
    public byte field937 = 0;

    @ObfuscatedName("be.au")
    public int[] field938 = new int[4];

    @ObfuscatedName("be.bg")
    public int[] field933 = new int[4];

    @ObfuscatedName("be.bn")
    public int[] field978 = new int[4];

    @ObfuscatedName("be.bk")
    public int[] field941 = new int[4];

    @ObfuscatedName("be.bp")
    public int[] field942 = new int[4];

    @ObfuscatedName("be.bu")
    public class261 field943 = new class261();

    @ObfuscatedName("be.bi")
    public int field944 = -1;

    @ObfuscatedName("be.bv")
    public boolean field945 = false;

    @ObfuscatedName("be.bf")
    public int field946 = -1;

    @ObfuscatedName("be.bm")
    public int field973 = -1;

    @ObfuscatedName("be.bw")
    public int field948 = 0;

    @ObfuscatedName("be.bs")
    public int field949 = 0;

    @ObfuscatedName("be.bt")
    public int field950 = -1;

    @ObfuscatedName("be.bj")
    public int field951 = 0;

    @ObfuscatedName("be.bd")
    public int field952 = 0;

    @ObfuscatedName("be.by")
    public int field953 = 0;

    @ObfuscatedName("be.bh")
    public int field925 = 0;

    @ObfuscatedName("be.bo")
    public int field955 = -1;

    @ObfuscatedName("be.be")
    public int field919 = 0;

    @ObfuscatedName("be.bl")
    public int field917 = 0;

    @ObfuscatedName("be.bb")
    public int field958;

    @ObfuscatedName("be.ba")
    public int field959;

    @ObfuscatedName("be.bz")
    public int field960;

    @ObfuscatedName("be.bc")
    public int field961;

    @ObfuscatedName("be.br")
    public int field962;

    @ObfuscatedName("be.bx")
    public int field963;

    @ObfuscatedName("be.bq")
    public int field964;

    @ObfuscatedName("be.cb")
    public int field965;

    @ObfuscatedName("be.ct")
    public int field966;

    @ObfuscatedName("be.ch")
    public int field967 = 0;

    @ObfuscatedName("be.cc")
    public int field968 = 200;

    @ObfuscatedName("be.cv")
    public int field969;

    @ObfuscatedName("be.cr")
    public int field977 = 0;

    @ObfuscatedName("be.cl")
    public int field954 = 32;

    @ObfuscatedName("be.ca")
    public int field972 = 0;

    @ObfuscatedName("be.ck")
    public int[] field940 = new int[10];

    @ObfuscatedName("be.cm")
    public int[] field974 = new int[10];

    @ObfuscatedName("be.ce")
    public byte[] field975 = new byte[10];

    @ObfuscatedName("be.cn")
    public int field976 = 0;

    @ObfuscatedName("be.cj")
    public int field970 = 0;

    @ObfuscatedName("be.au(I)V")
    public final void method1568() {
        this.field972 = 0;
        this.field970 = 0;
    }

    @ObfuscatedName("be.e(B)Z")
    public boolean method1066() {
        return false;
    }

    @ObfuscatedName("be.bg(IIIIIII)V")
    public final void method1560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field978[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class253 var13 = class253.method1797(arg0);
            var11 = var13.field3316;
            var12 = var13.field3307;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field978[0];
            } else if (var11 == 1) {
                var14 = this.field933[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field978[var15] < var14) {
                        var10 = var15;
                        var14 = this.field978[var15];
                    }
                } else if (var11 == 1 && this.field933[var15] < var14) {
                    var10 = var15;
                    var14 = this.field933[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field937 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field937;
                this.field937 = (byte) ((this.field937 + 1) % 4);
                if (this.field978[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field938[var10] = arg0;
        this.field933[var10] = arg1;
        this.field941[var10] = arg2;
        this.field942[var10] = arg3;
        this.field978[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("be.bn(IIIIIIS)V")
    public final void method1561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class247 var7 = (class247) class247.field3257.method3061((long) arg0);
        class247 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3263.method3825(33, arg0);
            class247 var10 = new class247();
            if (var9 != null) {
                var10.method4143(new class300(var9));
            }
            class247.field3257.method3062(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class247 var11 = var8;
        class79 var12 = null;
        class79 var13 = null;
        int var14 = var8.field3258;
        int var15 = 0;
        for (class79 var16 = (class79) this.field943.method4492(); var16 != null; var16 = (class79) this.field943.method4482()) {
            var15++;
            if (var16.field1093.field3254 == var11.field3254) {
                var16.method1862(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1093.field3250 <= var11.field3250) {
                var12 = var16;
            }
            if (var16.field1093.field3258 > var14) {
                var13 = var16;
                var14 = var16.field1093.field3258;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class79 var17 = new class79(var11);
        if (var12 == null) {
            this.field943.method4493(var17);
        } else {
            class261.method4512(var17, var12);
        }
        var17.method1862(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3326();
        }
    }

    @ObfuscatedName("be.bk(IB)V")
    public final void method1570(int arg0) {
        class247 var2 = (class247) class247.field3257.method3061((long) arg0);
        class247 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3263.method3825(33, arg0);
            class247 var5 = new class247();
            if (var4 != null) {
                var5.method4143(new class300(var4));
            }
            class247.field3257.method3062(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class247 var6 = var3;
        for (class79 var7 = (class79) this.field943.method4492(); var7 != null; var7 = (class79) this.field943.method4482()) {
            if (var7.field1093 == var6) {
                var7.method3326();
                return;
            }
        }
    }
}
