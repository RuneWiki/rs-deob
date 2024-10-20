package deob;

@ObfuscatedName("bn")
public abstract class class65 extends class130 {

    @ObfuscatedName("bn.az")
    public int field943;

    @ObfuscatedName("bn.at")
    public int field925;

    @ObfuscatedName("bn.ac")
    public int field926;

    @ObfuscatedName("bn.am")
    public boolean field927 = false;

    @ObfuscatedName("bn.aw")
    public int field928 = 1;

    @ObfuscatedName("bn.aa")
    public int field929;

    @ObfuscatedName("bn.as")
    public int field942 = -1;

    @ObfuscatedName("bn.al")
    public int field980 = -1;

    @ObfuscatedName("bn.ad")
    public int field975 = -1;

    @ObfuscatedName("bn.ax")
    public int field956 = -1;

    @ObfuscatedName("bn.ao")
    public int field933 = -1;

    @ObfuscatedName("bn.ae")
    public int field930 = -1;

    @ObfuscatedName("bn.ap")
    public int field936 = -1;

    @ObfuscatedName("bn.ar")
    public int field937 = -1;

    @ObfuscatedName("bn.ab")
    public String field938 = null;

    @ObfuscatedName("bn.aq")
    public boolean field935;

    @ObfuscatedName("bn.au")
    public boolean field940 = false;

    @ObfuscatedName("bn.aj")
    public int field934 = 100;

    @ObfuscatedName("bn.ah")
    public int field932 = 0;

    @ObfuscatedName("bn.ai")
    public int field941 = 0;

    @ObfuscatedName("bn.ay")
    public byte field959 = 0;

    @ObfuscatedName("bn.ak")
    public int[] field953 = new int[4];

    @ObfuscatedName("bn.be")
    public int[] field957 = new int[4];

    @ObfuscatedName("bn.bo")
    public int[] field947 = new int[4];

    @ObfuscatedName("bn.bx")
    public int[] field948 = new int[4];

    @ObfuscatedName("bn.bf")
    public int[] field944 = new int[4];

    @ObfuscatedName("bn.bl")
    public class206 field950 = new class206();

    @ObfuscatedName("bn.bs")
    public int field951 = -1;

    @ObfuscatedName("bn.ba")
    public boolean field949 = false;

    @ObfuscatedName("bn.bm")
    public int field967 = -1;

    @ObfuscatedName("bn.bg")
    public int field931 = -1;

    @ObfuscatedName("bn.bw")
    public int field955 = 0;

    @ObfuscatedName("bn.bq")
    public int field946 = 0;

    @ObfuscatedName("bn.bi")
    public int field939 = -1;

    @ObfuscatedName("bn.bn")
    public int field958 = 0;

    @ObfuscatedName("bn.bv")
    public int field983 = 0;

    @ObfuscatedName("bn.bu")
    public int field960 = 0;

    @ObfuscatedName("bn.bk")
    public int field961 = 0;

    @ObfuscatedName("bn.bt")
    public int field962 = -1;

    @ObfuscatedName("bn.bb")
    public int field963 = 0;

    @ObfuscatedName("bn.bj")
    public int field964 = 0;

    @ObfuscatedName("bn.by")
    public int field965;

    @ObfuscatedName("bn.bz")
    public int field952;

    @ObfuscatedName("bn.bd")
    public int field979;

    @ObfuscatedName("bn.bc")
    public int field968;

    @ObfuscatedName("bn.br")
    public int field969;

    @ObfuscatedName("bn.bh")
    public int field970;

    @ObfuscatedName("bn.bp")
    public int field971;

    @ObfuscatedName("bn.cf")
    public int field972;

    @ObfuscatedName("bn.ci")
    public int field966;

    @ObfuscatedName("bn.cu")
    public int field974 = 0;

    @ObfuscatedName("bn.cm")
    public int field924 = 200;

    @ObfuscatedName("bn.cj")
    public int field976;

    @ObfuscatedName("bn.cy")
    public int field977 = 0;

    @ObfuscatedName("bn.cg")
    public int field978 = 32;

    @ObfuscatedName("bn.cv")
    public int field945 = 0;

    @ObfuscatedName("bn.cz")
    public int[] field954 = new int[10];

    @ObfuscatedName("bn.cc")
    public int[] field981 = new int[10];

    @ObfuscatedName("bn.co")
    public byte[] field982 = new byte[10];

    @ObfuscatedName("bn.cq")
    public int field973 = 0;

    @ObfuscatedName("bn.cw")
    public int field984 = 0;

    @ObfuscatedName("bn.bo(I)V")
    public final void method1498() {
        this.field945 = 0;
        this.field984 = 0;
    }

    @ObfuscatedName("bn.v(B)Z")
    public boolean method1043() {
        return false;
    }

    @ObfuscatedName("bn.bx(IIIIIIB)V")
    public final void method1491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field947[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class270 var13 = class270.method521(arg0);
            var11 = var13.field3439;
            var12 = var13.field3430;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field947[0];
            } else if (var11 == 1) {
                var14 = this.field957[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field947[var15] < var14) {
                        var10 = var15;
                        var14 = this.field947[var15];
                    }
                } else if (var11 == 1 && this.field957[var15] < var14) {
                    var10 = var15;
                    var14 = this.field957[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field959 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field959;
                this.field959 = (byte) ((this.field959 + 1) % 4);
                if (this.field947[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field953[var10] = arg0;
        this.field957[var10] = arg1;
        this.field948[var10] = arg2;
        this.field944[var10] = arg3;
        this.field947[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bn.bf(IIIIIII)V")
    public final void method1499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class264 var7 = (class264) class264.field3372.method3737((long) arg0);
        class264 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3374.method4289(33, arg0);
            class264 var10 = new class264();
            if (var9 != null) {
                var10.method4611(new class185(var9));
            }
            class264.field3372.method3744(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class264 var11 = var8;
        class73 var12 = null;
        class73 var13 = null;
        int var14 = var8.field3376;
        int var15 = 0;
        for (class73 var16 = (class73) this.field950.method3793(); var16 != null; var16 = (class73) this.field950.method3795()) {
            var15++;
            if (var16.field1079.field3369 == var11.field3369) {
                var16.method1744(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1079.field3378 <= var11.field3378) {
                var12 = var16;
            }
            if (var16.field1079.field3376 > var14) {
                var13 = var16;
                var14 = var16.field1079.field3376;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class73 var17 = new class73(var11);
        if (var12 == null) {
            this.field950.method3810(var17);
        } else {
            class206.method3792(var17, var12);
        }
        var17.method1744(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3818();
        }
    }

    @ObfuscatedName("bn.bl(II)V")
    public final void method1488(int arg0) {
        class264 var2 = class264.method2921(arg0);
        for (class73 var3 = (class73) this.field950.method3793(); var3 != null; var3 = (class73) this.field950.method3795()) {
            if (var3.field1079 == var2) {
                var3.method3818();
                return;
            }
        }
    }
}
