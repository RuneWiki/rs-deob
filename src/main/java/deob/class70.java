package deob;

@ObfuscatedName("bx")
public abstract class class70 extends class136 {

    @ObfuscatedName("bx.ax")
    public int field983;

    @ObfuscatedName("bx.aj")
    public int field940;

    @ObfuscatedName("bx.au")
    public int field972;

    @ObfuscatedName("bx.ay")
    public boolean field948 = false;

    @ObfuscatedName("bx.aa")
    public int field943 = 1;

    @ObfuscatedName("bx.aq")
    public int field944;

    @ObfuscatedName("bx.as")
    public int field945 = -1;

    @ObfuscatedName("bx.ak")
    public int field951 = -1;

    @ObfuscatedName("bx.ac")
    public int field947 = -1;

    @ObfuscatedName("bx.aw")
    public int field994 = -1;

    @ObfuscatedName("bx.ar")
    public int field967 = -1;

    @ObfuscatedName("bx.av")
    public int field977 = -1;

    @ObfuscatedName("bx.al")
    public int field960 = -1;

    @ObfuscatedName("bx.ad")
    public int field952 = -1;

    @ObfuscatedName("bx.am")
    public String field953 = null;

    @ObfuscatedName("bx.ao")
    public boolean field941;

    @ObfuscatedName("bx.at")
    public boolean field955 = false;

    @ObfuscatedName("bx.an")
    public int field956 = 100;

    @ObfuscatedName("bx.ag")
    public int field949 = 0;

    @ObfuscatedName("bx.ai")
    public int field942 = 0;

    @ObfuscatedName("bx.ap")
    public byte field959 = 0;

    @ObfuscatedName("bx.ah")
    public int[] field939 = new int[4];

    @ObfuscatedName("bx.bq")
    public int[] field961 = new int[4];

    @ObfuscatedName("bx.bf")
    public int[] field950 = new int[4];

    @ObfuscatedName("bx.bc")
    public int[] field963 = new int[4];

    @ObfuscatedName("bx.bk")
    public int[] field964 = new int[4];

    @ObfuscatedName("bx.bb")
    public class262 field965 = new class262();

    @ObfuscatedName("bx.bi")
    public int field966 = -1;

    @ObfuscatedName("bx.bp")
    public boolean field946 = false;

    @ObfuscatedName("bx.bl")
    public int field968 = -1;

    @ObfuscatedName("bx.by")
    public int field969 = -1;

    @ObfuscatedName("bx.be")
    public int field970 = 0;

    @ObfuscatedName("bx.bw")
    public int field971 = 0;

    @ObfuscatedName("bx.bt")
    public int field995 = -1;

    @ObfuscatedName("bx.bn")
    public int field973 = 0;

    @ObfuscatedName("bx.bm")
    public int field990 = 0;

    @ObfuscatedName("bx.ba")
    public int field975 = 0;

    @ObfuscatedName("bx.bd")
    public int field984 = 0;

    @ObfuscatedName("bx.bs")
    public int field985 = -1;

    @ObfuscatedName("bx.bx")
    public int field979 = 0;

    @ObfuscatedName("bx.bh")
    public int field993 = 0;

    @ObfuscatedName("bx.bg")
    public int field980;

    @ObfuscatedName("bx.bz")
    public int field981;

    @ObfuscatedName("bx.bj")
    public int field982;

    @ObfuscatedName("bx.bu")
    public int field962;

    @ObfuscatedName("bx.bv")
    public int field958;

    @ObfuscatedName("bx.bo")
    public int field992;

    @ObfuscatedName("bx.br")
    public int field986;

    @ObfuscatedName("bx.cp")
    public int field987;

    @ObfuscatedName("bx.cg")
    public int field988;

    @ObfuscatedName("bx.cr")
    public int field989 = 0;

    @ObfuscatedName("bx.co")
    public int field954 = 200;

    @ObfuscatedName("bx.ck")
    public int field991;

    @ObfuscatedName("bx.cn")
    public int field957 = 0;

    @ObfuscatedName("bx.cd")
    public int field976 = 32;

    @ObfuscatedName("bx.ct")
    public int field974 = 0;

    @ObfuscatedName("bx.cb")
    public int[] field978 = new int[10];

    @ObfuscatedName("bx.cf")
    public int[] field996 = new int[10];

    @ObfuscatedName("bx.cm")
    public byte[] field997 = new byte[10];

    @ObfuscatedName("bx.cz")
    public int field998 = 0;

    @ObfuscatedName("bx.cu")
    public int field999 = 0;

    @ObfuscatedName("bx.ai(I)V")
    public final void method1573() {
        this.field974 = 0;
        this.field999 = 0;
    }

    @ObfuscatedName("bx.v(I)Z")
    public boolean method1141() {
        return false;
    }

    @ObfuscatedName("bx.ab(IIIIIII)V")
    public final void method1576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field950[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class254 var13 = (class254) class254.field3337.method3100((long) arg0);
            class254 var14;
            if (var13 == null) {
                byte[] var15 = Statics.field426.method3845(32, arg0);
                class254 var16 = new class254();
                if (var15 != null) {
                    var16.method4246(new class301(var15));
                }
                class254.field3337.method3102(var16, (long) arg0);
                var14 = var16;
            } else {
                var14 = var13;
            }
            var11 = var14.field3338;
            var12 = var14.field3329;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var18 = 0;
            if (var11 == 0) {
                var18 = this.field950[0];
            } else if (var11 == 1) {
                var18 = this.field961[0];
            }
            for (int var19 = 1; var19 < 4; var19++) {
                if (var11 == 0) {
                    if (this.field950[var19] < var18) {
                        var10 = var19;
                        var18 = this.field950[var19];
                    }
                } else if (var11 == 1 && this.field961[var19] < var18) {
                    var10 = var19;
                    var18 = this.field961[var19];
                }
            }
            if (var11 == 1 && var18 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field959 = 0;
            }
            for (int var20 = 0; var20 < 4; var20++) {
                byte var21 = this.field959;
                this.field959 = (byte) ((this.field959 + 1) % 4);
                if (this.field950[var21] <= arg4) {
                    var10 = var21;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field939[var10] = arg0;
        this.field961[var10] = arg1;
        this.field963[var10] = arg2;
        this.field964[var10] = arg3;
        this.field950[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bx.ap(IIIIIII)V")
    public final void method1572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class248 var7 = class248.method2133(arg0);
        class79 var8 = null;
        class79 var9 = null;
        int var10 = var7.field3275;
        int var11 = 0;
        for (class79 var12 = (class79) this.field965.method4491(); var12 != null; var12 = (class79) this.field965.method4490()) {
            var11++;
            if (var12.field1113.field3276 == var7.field3276) {
                var12.method1896(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1113.field3279 <= var7.field3279) {
                var8 = var12;
            }
            if (var12.field1113.field3275 > var10) {
                var9 = var12;
                var10 = var12.field1113.field3275;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class79 var13 = new class79(var7);
        if (var8 == null) {
            this.field965.method4480(var13);
        } else {
            class262.method4481(var13, var8);
        }
        var13.method1896(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3351();
        }
    }

    @ObfuscatedName("bx.ah(IB)V")
    public final void method1577(int arg0) {
        class248 var2 = class248.method2133(arg0);
        for (class79 var3 = (class79) this.field965.method4491(); var3 != null; var3 = (class79) this.field965.method4490()) {
            if (var3.field1113 == var2) {
                var3.method3351();
                return;
            }
        }
    }
}
