package deob;

@ObfuscatedName("bt")
public abstract class class70 extends class136 {

    @ObfuscatedName("bt.ai")
    public int field992;

    @ObfuscatedName("bt.ag")
    public int field936;

    @ObfuscatedName("bt.ao")
    public int field937;

    @ObfuscatedName("bt.aw")
    public boolean field938 = false;

    @ObfuscatedName("bt.ak")
    public int field939 = 1;

    @ObfuscatedName("bt.aa")
    public int field940;

    @ObfuscatedName("bt.ab")
    public int field986 = -1;

    @ObfuscatedName("bt.ar")
    public int field942 = -1;

    @ObfuscatedName("bt.av")
    public int field943 = -1;

    @ObfuscatedName("bt.aq")
    public int field944 = -1;

    @ObfuscatedName("bt.ac")
    public int field945 = -1;

    @ObfuscatedName("bt.az")
    public int field946 = -1;

    @ObfuscatedName("bt.at")
    public int field964 = -1;

    @ObfuscatedName("bt.ae")
    public int field948 = -1;

    @ObfuscatedName("bt.aj")
    public String field949 = null;

    @ObfuscatedName("bt.ap")
    public boolean field994;

    @ObfuscatedName("bt.an")
    public boolean field951 = false;

    @ObfuscatedName("bt.al")
    public int field952 = 100;

    @ObfuscatedName("bt.ay")
    public int field953 = 0;

    @ObfuscatedName("bt.ax")
    public int field954 = 0;

    @ObfuscatedName("bt.as")
    public byte field955 = 0;

    @ObfuscatedName("bt.ah")
    public int[] field961 = new int[4];

    @ObfuscatedName("bt.bi")
    public int[] field957 = new int[4];

    @ObfuscatedName("bt.bo")
    public int[] field958 = new int[4];

    @ObfuscatedName("bt.bx")
    public int[] field959 = new int[4];

    @ObfuscatedName("bt.bu")
    public int[] field968 = new int[4];

    @ObfuscatedName("bt.bd")
    public class261 field965 = new class261();

    @ObfuscatedName("bt.bn")
    public int field962 = -1;

    @ObfuscatedName("bt.bj")
    public boolean field963 = false;

    @ObfuscatedName("bt.bm")
    public int field966 = -1;

    @ObfuscatedName("bt.bq")
    public int field985 = -1;

    @ObfuscatedName("bt.bf")
    public int field996 = 0;

    @ObfuscatedName("bt.by")
    public int field978 = 0;

    @ObfuscatedName("bt.br")
    public int field990 = -1;

    @ObfuscatedName("bt.ba")
    public int field969 = 0;

    @ObfuscatedName("bt.bb")
    public int field970 = 0;

    @ObfuscatedName("bt.bg")
    public int field971 = 0;

    @ObfuscatedName("bt.bw")
    public int field972 = 0;

    @ObfuscatedName("bt.be")
    public int field973 = -1;

    @ObfuscatedName("bt.bt")
    public int field974 = 0;

    @ObfuscatedName("bt.bl")
    public int field975 = 0;

    @ObfuscatedName("bt.bp")
    public int field976;

    @ObfuscatedName("bt.bv")
    public int field997;

    @ObfuscatedName("bt.bs")
    public int field947;

    @ObfuscatedName("bt.bz")
    public int field979;

    @ObfuscatedName("bt.bc")
    public int field980;

    @ObfuscatedName("bt.bh")
    public int field981;

    @ObfuscatedName("bt.bk")
    public int field935;

    @ObfuscatedName("bt.cm")
    public int field983;

    @ObfuscatedName("bt.cd")
    public int field984;

    @ObfuscatedName("bt.cv")
    public int field941 = 0;

    @ObfuscatedName("bt.cl")
    public int field950 = 200;

    @ObfuscatedName("bt.cg")
    public int field987;

    @ObfuscatedName("bt.ch")
    public int field988 = 0;

    @ObfuscatedName("bt.co")
    public int field989 = 32;

    @ObfuscatedName("bt.cr")
    public int field967 = 0;

    @ObfuscatedName("bt.ck")
    public int[] field991 = new int[10];

    @ObfuscatedName("bt.cb")
    public int[] field956 = new int[10];

    @ObfuscatedName("bt.cy")
    public byte[] field993 = new byte[10];

    @ObfuscatedName("bt.cn")
    public int field977 = 0;

    @ObfuscatedName("bt.cj")
    public int field995 = 0;

    @ObfuscatedName("bt.au(I)V")
    public final void method1579() {
        this.field967 = 0;
        this.field995 = 0;
    }

    @ObfuscatedName("bt.o(I)Z")
    public boolean method1096() {
        return false;
    }

    @ObfuscatedName("bt.as(IIIIIII)V")
    public final void method1578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field958[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class253 var13 = class253.method660(arg0);
            var11 = var13.field3348;
            var12 = var13.field3339;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field958[0];
            } else if (var11 == 1) {
                var14 = this.field957[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field958[var15] < var14) {
                        var10 = var15;
                        var14 = this.field958[var15];
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
                this.field955 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field955;
                this.field955 = (byte) ((this.field955 + 1) % 4);
                if (this.field958[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field961[var10] = arg0;
        this.field957[var10] = arg1;
        this.field959[var10] = arg2;
        this.field968[var10] = arg3;
        this.field958[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bt.ah(IIIIIII)V")
    public final void method1576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class247 var7 = (class247) class247.field3284.method3076((long) arg0);
        class247 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3293.method3928(33, arg0);
            class247 var10 = new class247();
            if (var9 != null) {
                var10.method4166(new class300(var9));
            }
            class247.field3284.method3078(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class247 var11 = var8;
        class79 var12 = null;
        class79 var13 = null;
        int var14 = var8.field3288;
        int var15 = 0;
        for (class79 var16 = (class79) this.field965.method4491(); var16 != null; var16 = (class79) this.field965.method4520()) {
            var15++;
            if (var16.field1120.field3295 == var11.field3295) {
                var16.method1859(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1120.field3287 <= var11.field3287) {
                var12 = var16;
            }
            if (var16.field1120.field3288 > var14) {
                var13 = var16;
                var14 = var16.field1120.field3288;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class79 var17 = new class79(var11);
        if (var12 == null) {
            this.field965.method4487(var17);
        } else {
            class261.method4502(var17, var12);
        }
        var17.method1859(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3332();
        }
    }

    @ObfuscatedName("bt.bi(II)V")
    public final void method1588(int arg0) {
        class247 var2 = class247.method659(arg0);
        for (class79 var3 = (class79) this.field965.method4491(); var3 != null; var3 = (class79) this.field965.method4520()) {
            if (var3.field1120 == var2) {
                var3.method3332();
                return;
            }
        }
    }
}
