package deob;

@ObfuscatedName("bq")
public abstract class class70 extends class136 {

    @ObfuscatedName("bq.aw")
    public int field1006;

    @ObfuscatedName("bq.ad")
    public int field950;

    @ObfuscatedName("bq.ag")
    public int field951;

    @ObfuscatedName("bq.ar")
    public boolean field968 = false;

    @ObfuscatedName("bq.ax")
    public int field953 = 1;

    @ObfuscatedName("bq.az")
    public int field954;

    @ObfuscatedName("bq.ae")
    public int field1005 = -1;

    @ObfuscatedName("bq.ao")
    public int field956 = -1;

    @ObfuscatedName("bq.aj")
    public int field957 = -1;

    @ObfuscatedName("bq.at")
    public int field958 = -1;

    @ObfuscatedName("bq.ac")
    public int field959 = -1;

    @ObfuscatedName("bq.ap")
    public int field960 = -1;

    @ObfuscatedName("bq.aq")
    public int field961 = -1;

    @ObfuscatedName("bq.aa")
    public int field962 = -1;

    @ObfuscatedName("bq.an")
    public String field978 = null;

    @ObfuscatedName("bq.au")
    public boolean field964;

    @ObfuscatedName("bq.ai")
    public boolean field999 = false;

    @ObfuscatedName("bq.ak")
    public int field1003 = 100;

    @ObfuscatedName("bq.ah")
    public int field967 = 0;

    @ObfuscatedName("bq.am")
    public int field983 = 0;

    @ObfuscatedName("bq.af")
    public byte field969 = 0;

    @ObfuscatedName("bq.ab")
    public int[] field970 = new int[4];

    @ObfuscatedName("bq.bp")
    public int[] field981 = new int[4];

    @ObfuscatedName("bq.bz")
    public int[] field972 = new int[4];

    @ObfuscatedName("bq.bi")
    public int[] field973 = new int[4];

    @ObfuscatedName("bq.bg")
    public int[] field971 = new int[4];

    @ObfuscatedName("bq.bh")
    public class261 field955 = new class261();

    @ObfuscatedName("bq.bm")
    public int field976 = -1;

    @ObfuscatedName("bq.bn")
    public boolean field965 = false;

    @ObfuscatedName("bq.bc")
    public int field977 = -1;

    @ObfuscatedName("bq.bx")
    public int field979 = -1;

    @ObfuscatedName("bq.bo")
    public int field980 = 0;

    @ObfuscatedName("bq.bb")
    public int field1002 = 0;

    @ObfuscatedName("bq.bs")
    public int field982 = -1;

    @ObfuscatedName("bq.bj")
    public int field952 = 0;

    @ObfuscatedName("bq.bl")
    public int field975 = 0;

    @ObfuscatedName("bq.bd")
    public int field985 = 0;

    @ObfuscatedName("bq.by")
    public int field986 = 0;

    @ObfuscatedName("bq.bt")
    public int field987 = -1;

    @ObfuscatedName("bq.bq")
    public int field988 = 0;

    @ObfuscatedName("bq.bu")
    public int field989 = 0;

    @ObfuscatedName("bq.bw")
    public int field990;

    @ObfuscatedName("bq.br")
    public int field991;

    @ObfuscatedName("bq.bk")
    public int field992;

    @ObfuscatedName("bq.bf")
    public int field993;

    @ObfuscatedName("bq.bv")
    public int field994;

    @ObfuscatedName("bq.be")
    public int field984;

    @ObfuscatedName("bq.ba")
    public int field996;

    @ObfuscatedName("bq.cr")
    public int field997;

    @ObfuscatedName("bq.cf")
    public int field998;

    @ObfuscatedName("bq.cj")
    public int field974 = 0;

    @ObfuscatedName("bq.cl")
    public int field1000 = 200;

    @ObfuscatedName("bq.cn")
    public int field1001;

    @ObfuscatedName("bq.cy")
    public int field1010 = 0;

    @ObfuscatedName("bq.ct")
    public int field949 = 32;

    @ObfuscatedName("bq.cq")
    public int field1004 = 0;

    @ObfuscatedName("bq.cp")
    public int[] field995 = new int[10];

    @ObfuscatedName("bq.ch")
    public int[] field963 = new int[10];

    @ObfuscatedName("bq.co")
    public byte[] field1007 = new byte[10];

    @ObfuscatedName("bq.cw")
    public int field1008 = 0;

    @ObfuscatedName("bq.ca")
    public int field1009 = 0;

    @ObfuscatedName("bq.bp(I)V")
    public final void method1495() {
        this.field1004 = 0;
        this.field1009 = 0;
    }

    @ObfuscatedName("bq.v(I)Z")
    public boolean method1045() {
        return false;
    }

    @ObfuscatedName("bq.bz(IIIIIII)V")
    public final void method1494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field972[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class253 var13 = class253.method1860(arg0);
            var11 = var13.field3349;
            var12 = var13.field3345;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field972[0];
            } else if (var11 == 1) {
                var14 = this.field981[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field972[var15] < var14) {
                        var10 = var15;
                        var14 = this.field972[var15];
                    }
                } else if (var11 == 1 && this.field981[var15] < var14) {
                    var10 = var15;
                    var14 = this.field981[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field969 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field969;
                this.field969 = (byte) ((this.field969 + 1) % 4);
                if (this.field972[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field970[var10] = arg0;
        this.field981[var10] = arg1;
        this.field973[var10] = arg2;
        this.field971[var10] = arg3;
        this.field972[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bq.bi(IIIIIIB)V")
    public final void method1493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class247 var7 = class247.method716(arg0);
        class79 var8 = null;
        class79 var9 = null;
        int var10 = var7.field3283;
        int var11 = 0;
        for (class79 var12 = (class79) this.field955.method4453(); var12 != null; var12 = (class79) this.field955.method4423()) {
            var11++;
            if (var12.field1129.field3280 == var7.field3280) {
                var12.method1779(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1129.field3276 <= var7.field3276) {
                var8 = var12;
            }
            if (var12.field1129.field3283 > var10) {
                var9 = var12;
                var10 = var12.field1129.field3283;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class79 var13 = new class79(var7);
        if (var8 == null) {
            this.field955.method4420(var13);
        } else {
            class261.method4431(var13, var8);
        }
        var13.method1779(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3286();
        }
    }

    @ObfuscatedName("bq.bg(II)V")
    public final void method1496(int arg0) {
        class247 var2 = class247.method716(arg0);
        for (class79 var3 = (class79) this.field955.method4453(); var3 != null; var3 = (class79) this.field955.method4423()) {
            if (var3.field1129 == var2) {
                var3.method3286();
                return;
            }
        }
    }
}
