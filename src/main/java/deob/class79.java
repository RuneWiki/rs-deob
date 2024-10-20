package deob;

@ObfuscatedName("cg")
public abstract class class79 extends class145 {

    @ObfuscatedName("cg.ae")
    public int field995;

    @ObfuscatedName("cg.an")
    public boolean field975 = false;

    @ObfuscatedName("cg.am")
    public int field1024;

    @ObfuscatedName("cg.ap")
    public int field1030;

    @ObfuscatedName("cg.au")
    public int field1015 = 1;

    @ObfuscatedName("cg.aa")
    public int field977;

    @ObfuscatedName("cg.ar")
    public int field978 = -1;

    @ObfuscatedName("cg.at")
    public int field979 = -1;

    @ObfuscatedName("cg.aq")
    public int field980 = -1;

    @ObfuscatedName("cg.al")
    public int field981 = -1;

    @ObfuscatedName("cg.ah")
    public int field982 = -1;

    @ObfuscatedName("cg.av")
    public int field983 = -1;

    @ObfuscatedName("cg.ax")
    public int field984 = -1;

    @ObfuscatedName("cg.as")
    public int field985 = -1;

    @ObfuscatedName("cg.az")
    public String field1021 = null;

    @ObfuscatedName("cg.ad")
    public boolean field986;

    @ObfuscatedName("cg.ai")
    public boolean field987 = false;

    @ObfuscatedName("cg.ay")
    public int field989 = 100;

    @ObfuscatedName("cg.aj")
    public int field990 = 0;

    @ObfuscatedName("cg.aw")
    public int field991 = 0;

    @ObfuscatedName("cg.ak")
    public byte field992 = 0;

    @ObfuscatedName("cg.ac")
    public int[] field1019 = new int[4];

    @ObfuscatedName("cg.bl")
    public int[] field994 = new int[4];

    @ObfuscatedName("cg.bc")
    public int[] field993 = new int[4];

    @ObfuscatedName("cg.bz")
    public int[] field996 = new int[4];

    @ObfuscatedName("cg.bj")
    public int[] field997 = new int[4];

    @ObfuscatedName("cg.bh")
    public class271 field973 = new class271();

    @ObfuscatedName("cg.bi")
    public int field999 = -1;

    @ObfuscatedName("cg.bg")
    public boolean field1000 = false;

    @ObfuscatedName("cg.br")
    public int field1001 = -1;

    @ObfuscatedName("cg.bp")
    public int field1002 = -1;

    @ObfuscatedName("cg.bn")
    public int field1003 = 0;

    @ObfuscatedName("cg.bw")
    public int field976 = 0;

    @ObfuscatedName("cg.be")
    public int field1005 = -1;

    @ObfuscatedName("cg.bu")
    public int field1009 = 0;

    @ObfuscatedName("cg.ba")
    public int field1007 = 0;

    @ObfuscatedName("cg.bm")
    public int field1008 = 0;

    @ObfuscatedName("cg.bd")
    public int field1010 = 0;

    @ObfuscatedName("cg.bb")
    public int field972 = -1;

    @ObfuscatedName("cg.bx")
    public int field1011 = 0;

    @ObfuscatedName("cg.bq")
    public int field988 = 0;

    @ObfuscatedName("cg.by")
    public int field1014;

    @ObfuscatedName("cg.bo")
    public int field1004;

    @ObfuscatedName("cg.bk")
    public int field998;

    @ObfuscatedName("cg.bv")
    public int field1016;

    @ObfuscatedName("cg.bf")
    public int field1017;

    @ObfuscatedName("cg.bt")
    public int field1018;

    @ObfuscatedName("cg.bs")
    public int field1027;

    @ObfuscatedName("cg.cg")
    public int field1020;

    @ObfuscatedName("cg.ca")
    public int field1028;

    @ObfuscatedName("cg.ct")
    public int field1022 = 0;

    @ObfuscatedName("cg.cv")
    public int field1023 = 200;

    @ObfuscatedName("cg.ce")
    public int field1032;

    @ObfuscatedName("cg.cr")
    public int field1025 = 0;

    @ObfuscatedName("cg.cn")
    public int field1026 = 32;

    @ObfuscatedName("cg.ci")
    public int field1006 = 0;

    @ObfuscatedName("cg.cm")
    public int[] field1031 = new int[10];

    @ObfuscatedName("cg.cu")
    public int[] field1029 = new int[10];

    @ObfuscatedName("cg.cw")
    public byte[] field1013 = new byte[10];

    @ObfuscatedName("cg.cq")
    public int field1033 = 0;

    @ObfuscatedName("cg.cc")
    public int field974 = 0;

    @ObfuscatedName("cg.bc(B)V")
    public final void method1631() {
        this.field1006 = 0;
        this.field974 = 0;
    }

    @ObfuscatedName("cg.h(I)Z")
    public boolean method1165() {
        return false;
    }

    @ObfuscatedName("cg.bz(IIIIIII)V")
    public final void method1633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field993[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class263 var13 = class263.method3603(arg0);
            var11 = var13.field3366;
            var12 = var13.field3357;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field993[0];
            } else if (var11 == 1) {
                var14 = this.field994[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field993[var15] < var14) {
                        var10 = var15;
                        var14 = this.field993[var15];
                    }
                } else if (var11 == 1 && this.field994[var15] < var14) {
                    var10 = var15;
                    var14 = this.field994[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field992 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field992;
                this.field992 = (byte) ((this.field992 + 1) % 4);
                if (this.field993[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1019[var10] = arg0;
        this.field994[var10] = arg1;
        this.field996[var10] = arg2;
        this.field997[var10] = arg3;
        this.field993[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cg.bj(IIIIIIB)V")
    public final void method1634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class257 var7 = class257.method3468(arg0);
        class88 var8 = null;
        class88 var9 = null;
        int var10 = var7.field3317;
        int var11 = 0;
        for (class88 var12 = (class88) this.field973.method4551(); var12 != null; var12 = (class88) this.field973.method4553()) {
            var11++;
            if (var12.field1152.field3315 == var7.field3315) {
                var12.method1926(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1152.field3308 <= var7.field3308) {
                var8 = var12;
            }
            if (var12.field1152.field3317 > var10) {
                var9 = var12;
                var10 = var12.field1152.field3317;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class88 var13 = new class88(var7);
        if (var8 == null) {
            this.field973.method4548(var13);
        } else {
            class271.method4560(var13, var8);
        }
        var13.method1926(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3401();
        }
    }

    @ObfuscatedName("cg.bh(IB)V")
    public final void method1635(int arg0) {
        class257 var2 = class257.method3468(arg0);
        for (class88 var3 = (class88) this.field973.method4551(); var3 != null; var3 = (class88) this.field973.method4553()) {
            if (var3.field1152 == var2) {
                var3.method3401();
                return;
            }
        }
    }
}
