package deob;

@ObfuscatedName("cc")
public abstract class class79 extends class145 {

    @ObfuscatedName("cc.ae")
    public int field983;

    @ObfuscatedName("cc.ax")
    public int field965;

    @ObfuscatedName("cc.ag")
    public int field966;

    @ObfuscatedName("cc.ab")
    public boolean field1011 = false;

    @ObfuscatedName("cc.am")
    public int field968 = 1;

    @ObfuscatedName("cc.ak")
    public int field969;

    @ObfuscatedName("cc.ad")
    public int field970 = -1;

    @ObfuscatedName("cc.as")
    public int field971 = -1;

    @ObfuscatedName("cc.ar")
    public int field964 = -1;

    @ObfuscatedName("cc.ap")
    public int field973 = -1;

    @ObfuscatedName("cc.al")
    public int field1013 = -1;

    @ObfuscatedName("cc.an")
    public int field975 = -1;

    @ObfuscatedName("cc.ac")
    public int field978 = -1;

    @ObfuscatedName("cc.av")
    public int field982 = -1;

    @ObfuscatedName("cc.af")
    public String field972 = null;

    @ObfuscatedName("cc.at")
    public boolean field979;

    @ObfuscatedName("cc.aa")
    public boolean field980 = false;

    @ObfuscatedName("cc.aw")
    public int field981 = 100;

    @ObfuscatedName("cc.az")
    public int field997 = 0;

    @ObfuscatedName("cc.aq")
    public int field977 = 0;

    @ObfuscatedName("cc.au")
    public byte field984 = 0;

    @ObfuscatedName("cc.aj")
    public int[] field985 = new int[4];

    @ObfuscatedName("cc.bk")
    public int[] field986 = new int[4];

    @ObfuscatedName("cc.bh")
    public int[] field1025 = new int[4];

    @ObfuscatedName("cc.bg")
    public int[] field1026 = new int[4];

    @ObfuscatedName("cc.be")
    public int[] field989 = new int[4];

    @ObfuscatedName("cc.bf")
    public class271 field990 = new class271();

    @ObfuscatedName("cc.ba")
    public int field991 = -1;

    @ObfuscatedName("cc.bd")
    public boolean field1003 = false;

    @ObfuscatedName("cc.bb")
    public int field993 = -1;

    @ObfuscatedName("cc.bw")
    public int field1019 = -1;

    @ObfuscatedName("cc.bq")
    public int field995 = 0;

    @ObfuscatedName("cc.bn")
    public int field994 = 0;

    @ObfuscatedName("cc.bc")
    public int field992 = -1;

    @ObfuscatedName("cc.bo")
    public int field998 = 0;

    @ObfuscatedName("cc.bp")
    public int field999 = 0;

    @ObfuscatedName("cc.bm")
    public int field1000 = 0;

    @ObfuscatedName("cc.bl")
    public int field1001 = 0;

    @ObfuscatedName("cc.bv")
    public int field1002 = -1;

    @ObfuscatedName("cc.bi")
    public int field974 = 0;

    @ObfuscatedName("cc.bz")
    public int field1004 = 0;

    @ObfuscatedName("cc.bu")
    public int field988;

    @ObfuscatedName("cc.bx")
    public int field1006;

    @ObfuscatedName("cc.br")
    public int field996;

    @ObfuscatedName("cc.bs")
    public int field1008;

    @ObfuscatedName("cc.by")
    public int field1009;

    @ObfuscatedName("cc.bj")
    public int field1010;

    @ObfuscatedName("cc.bt")
    public int field967;

    @ObfuscatedName("cc.cc")
    public int field1012;

    @ObfuscatedName("cc.cb")
    public int field1007;

    @ObfuscatedName("cc.ch")
    public int field1014 = 0;

    @ObfuscatedName("cc.cw")
    public int field1015 = 200;

    @ObfuscatedName("cc.cz")
    public int field1016;

    @ObfuscatedName("cc.cg")
    public int field1017 = 0;

    @ObfuscatedName("cc.cn")
    public int field1018 = 32;

    @ObfuscatedName("cc.ce")
    public int field976 = 0;

    @ObfuscatedName("cc.cj")
    public int[] field1020 = new int[10];

    @ObfuscatedName("cc.ck")
    public int[] field1021 = new int[10];

    @ObfuscatedName("cc.cv")
    public byte[] field1022 = new byte[10];

    @ObfuscatedName("cc.cp")
    public int field1023 = 0;

    @ObfuscatedName("cc.ci")
    public int field1024 = 0;

    @ObfuscatedName("cc.bg(B)V")
    public final void method1619() {
        this.field976 = 0;
        this.field1024 = 0;
    }

    @ObfuscatedName("cc.c(B)Z")
    public boolean method1124() {
        return false;
    }

    @ObfuscatedName("cc.be(IIIIIII)V")
    public final void method1620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1025[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class263 var13 = (class263) class263.field3359.method3127((long) arg0);
            class263 var14;
            if (var13 == null) {
                byte[] var15 = Statics.field3377.method3891(32, arg0);
                class263 var16 = new class263();
                if (var15 != null) {
                    var16.method4345(new class310(var15));
                }
                class263.field3359.method3137(var16, (long) arg0);
                var14 = var16;
            } else {
                var14 = var13;
            }
            var11 = var14.field3374;
            var12 = var14.field3365;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var18 = 0;
            if (var11 == 0) {
                var18 = this.field1025[0];
            } else if (var11 == 1) {
                var18 = this.field986[0];
            }
            for (int var19 = 1; var19 < 4; var19++) {
                if (var11 == 0) {
                    if (this.field1025[var19] < var18) {
                        var10 = var19;
                        var18 = this.field1025[var19];
                    }
                } else if (var11 == 1 && this.field986[var19] < var18) {
                    var10 = var19;
                    var18 = this.field986[var19];
                }
            }
            if (var11 == 1 && var18 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field984 = 0;
            }
            for (int var20 = 0; var20 < 4; var20++) {
                byte var21 = this.field984;
                this.field984 = (byte) ((this.field984 + 1) % 4);
                if (this.field1025[var21] <= arg4) {
                    var10 = var21;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field985[var10] = arg0;
        this.field986[var10] = arg1;
        this.field1026[var10] = arg2;
        this.field989[var10] = arg3;
        this.field1025[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cc.bf(IIIIIII)V")
    public final void method1631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class257 var7 = (class257) class257.field3312.method3127((long) arg0);
        class257 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3310.method3891(33, arg0);
            class257 var10 = new class257();
            if (var9 != null) {
                var10.method4221(new class310(var9));
            }
            class257.field3312.method3137(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class257 var11 = var8;
        class88 var12 = null;
        class88 var13 = null;
        int var14 = var8.field3316;
        int var15 = 0;
        for (class88 var16 = (class88) this.field990.method4569(); var16 != null; var16 = (class88) this.field990.method4588()) {
            var15++;
            if (var16.field1149.field3313 == var11.field3313) {
                var16.method1924(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1149.field3311 <= var11.field3311) {
                var12 = var16;
            }
            if (var16.field1149.field3316 > var14) {
                var13 = var16;
                var14 = var16.field1149.field3316;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class88 var17 = new class88(var11);
        if (var12 == null) {
            this.field990.method4567(var17);
        } else {
            class271.method4568(var17, var12);
        }
        var17.method1924(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3388();
        }
    }

    @ObfuscatedName("cc.ba(IB)V")
    public final void method1618(int arg0) {
        class257 var2 = class257.method3397(arg0);
        for (class88 var3 = (class88) this.field990.method4569(); var3 != null; var3 = (class88) this.field990.method4588()) {
            if (var3.field1149 == var2) {
                var3.method3388();
                return;
            }
        }
    }
}
