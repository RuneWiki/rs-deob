package deob;

@ObfuscatedName("cw")
public abstract class class79 extends class145 {

    @ObfuscatedName("cw.an")
    public boolean field1002 = false;

    @ObfuscatedName("cw.ab")
    public int field984;

    @ObfuscatedName("cw.ar")
    public int field974;

    @ObfuscatedName("cw.af")
    public int field996;

    @ObfuscatedName("cw.at")
    public int field977 = 1;

    @ObfuscatedName("cw.al")
    public int field978;

    @ObfuscatedName("cw.as")
    public int field979 = -1;

    @ObfuscatedName("cw.am")
    public int field1011 = -1;

    @ObfuscatedName("cw.au")
    public int field981 = -1;

    @ObfuscatedName("cw.ao")
    public int field994 = -1;

    @ObfuscatedName("cw.aq")
    public int field983 = -1;

    @ObfuscatedName("cw.av")
    public int field1004 = -1;

    @ObfuscatedName("cw.ak")
    public int field985 = -1;

    @ObfuscatedName("cw.aa")
    public int field986 = -1;

    @ObfuscatedName("cw.ax")
    public String field1003 = null;

    @ObfuscatedName("cw.az")
    public boolean field1031;

    @ObfuscatedName("cw.aj")
    public boolean field989 = false;

    @ObfuscatedName("cw.ay")
    public int field990 = 100;

    @ObfuscatedName("cw.ad")
    public int field988 = 0;

    @ObfuscatedName("cw.ac")
    public int field992 = 0;

    @ObfuscatedName("cw.ag")
    public byte field993 = 0;

    @ObfuscatedName("cw.aw")
    public int[] field976 = new int[4];

    @ObfuscatedName("cw.bf")
    public int[] field995 = new int[4];

    @ObfuscatedName("cw.bc")
    public int[] field982 = new int[4];

    @ObfuscatedName("cw.bo")
    public int[] field997 = new int[4];

    @ObfuscatedName("cw.bd")
    public int[] field998 = new int[4];

    @ObfuscatedName("cw.bk")
    public class271 field999 = new class271();

    @ObfuscatedName("cw.bu")
    public int field1000 = -1;

    @ObfuscatedName("cw.be")
    public boolean field1001 = false;

    @ObfuscatedName("cw.bg")
    public int field1016 = -1;

    @ObfuscatedName("cw.bt")
    public int field1025 = -1;

    @ObfuscatedName("cw.bh")
    public int field975 = 0;

    @ObfuscatedName("cw.br")
    public int field1005 = 0;

    @ObfuscatedName("cw.bq")
    public int field1017 = -1;

    @ObfuscatedName("cw.ba")
    public int field1015 = 0;

    @ObfuscatedName("cw.bv")
    public int field1008 = 0;

    @ObfuscatedName("cw.bx")
    public int field1009 = 0;

    @ObfuscatedName("cw.bz")
    public int field1012 = 0;

    @ObfuscatedName("cw.bs")
    public int field1010 = -1;

    @ObfuscatedName("cw.bp")
    public int field1007 = 0;

    @ObfuscatedName("cw.bm")
    public int field1013 = 0;

    @ObfuscatedName("cw.bb")
    public int field1014;

    @ObfuscatedName("cw.bn")
    public int field1034;

    @ObfuscatedName("cw.by")
    public int field991;

    @ObfuscatedName("cw.bj")
    public int field973;

    @ObfuscatedName("cw.bi")
    public int field1018;

    @ObfuscatedName("cw.bl")
    public int field1019;

    @ObfuscatedName("cw.bw")
    public int field1020;

    @ObfuscatedName("cw.cw")
    public int field1021;

    @ObfuscatedName("cw.cc")
    public int field1022;

    @ObfuscatedName("cw.ch")
    public int field1006 = 0;

    @ObfuscatedName("cw.cr")
    public int field1024 = 200;

    @ObfuscatedName("cw.cq")
    public int field980;

    @ObfuscatedName("cw.co")
    public int field1026 = 0;

    @ObfuscatedName("cw.cm")
    public int field1027 = 32;

    @ObfuscatedName("cw.cu")
    public int field1028 = 0;

    @ObfuscatedName("cw.cs")
    public int[] field1029 = new int[10];

    @ObfuscatedName("cw.cg")
    public int[] field1030 = new int[10];

    @ObfuscatedName("cw.cd")
    public byte[] field1023 = new byte[10];

    @ObfuscatedName("cw.cx")
    public int field1032 = 0;

    @ObfuscatedName("cw.cn")
    public int field1033 = 0;

    @ObfuscatedName("cw.bu(I)V")
    public final void method1663() {
        this.field1028 = 0;
        this.field1033 = 0;
    }

    @ObfuscatedName("cw.n(I)Z")
    public boolean method1179() {
        return false;
    }

    @ObfuscatedName("cw.be(IIIIIII)V")
    public final void method1677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field982[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class263 var13 = class263.method183(arg0);
            var11 = var13.field3328;
            var12 = var13.field3330;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field982[0];
            } else if (var11 == 1) {
                var14 = this.field995[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field982[var15] < var14) {
                        var10 = var15;
                        var14 = this.field982[var15];
                    }
                } else if (var11 == 1 && this.field995[var15] < var14) {
                    var10 = var15;
                    var14 = this.field995[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field993 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field993;
                this.field993 = (byte) ((this.field993 + 1) % 4);
                if (this.field982[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field976[var10] = arg0;
        this.field995[var10] = arg1;
        this.field997[var10] = arg2;
        this.field998[var10] = arg3;
        this.field982[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cw.bg(IIIIIIB)V")
    public final void method1666(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class257 var7 = (class257) class257.field3280.method3146((long) arg0);
        class257 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3274.method3869(33, arg0);
            class257 var10 = new class257();
            if (var9 != null) {
                var10.method4153(new class310(var9));
            }
            class257.field3280.method3152(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class257 var11 = var8;
        class88 var12 = null;
        class88 var13 = null;
        int var14 = var8.field3279;
        int var15 = 0;
        for (class88 var16 = (class88) this.field999.method4488(); var16 != null; var16 = (class88) this.field999.method4543()) {
            var15++;
            if (var16.field1144.field3277 == var11.field3277) {
                var16.method1940(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1144.field3278 <= var11.field3278) {
                var12 = var16;
            }
            if (var16.field1144.field3279 > var14) {
                var13 = var16;
                var14 = var16.field1144.field3279;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class88 var17 = new class88(var11);
        if (var12 == null) {
            this.field999.method4508(var17);
        } else {
            class271.method4521(var17, var12);
        }
        var17.method1940(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3355();
        }
    }

    @ObfuscatedName("cw.bt(II)V")
    public final void method1667(int arg0) {
        class257 var2 = (class257) class257.field3280.method3146((long) arg0);
        class257 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3274.method3869(33, arg0);
            class257 var5 = new class257();
            if (var4 != null) {
                var5.method4153(new class310(var4));
            }
            class257.field3280.method3152(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class257 var6 = var3;
        for (class88 var7 = (class88) this.field999.method4488(); var7 != null; var7 = (class88) this.field999.method4543()) {
            if (var7.field1144 == var6) {
                var7.method3355();
                return;
            }
        }
    }
}
