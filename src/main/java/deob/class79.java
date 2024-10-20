package deob;

@ObfuscatedName("cs")
public abstract class class79 extends class145 {

    @ObfuscatedName("cs.af")
    public int field1000;

    @ObfuscatedName("cs.av")
    public int field976;

    @ObfuscatedName("cs.ar")
    public int field977;

    @ObfuscatedName("cs.ay")
    public boolean field978 = false;

    @ObfuscatedName("cs.ah")
    public int field1012 = 1;

    @ObfuscatedName("cs.az")
    public int field980;

    @ObfuscatedName("cs.ak")
    public int field998 = -1;

    @ObfuscatedName("cs.au")
    public int field982 = -1;

    @ObfuscatedName("cs.ai")
    public int field983 = -1;

    @ObfuscatedName("cs.ax")
    public int field991 = -1;

    @ObfuscatedName("cs.ag")
    public int field985 = -1;

    @ObfuscatedName("cs.aq")
    public int field986 = -1;

    @ObfuscatedName("cs.aw")
    public int field984 = -1;

    @ObfuscatedName("cs.an")
    public int field988 = -1;

    @ObfuscatedName("cs.am")
    public String field989 = null;

    @ObfuscatedName("cs.aa")
    public boolean field1030;

    @ObfuscatedName("cs.at")
    public boolean field975 = false;

    @ObfuscatedName("cs.as")
    public int field992 = 100;

    @ObfuscatedName("cs.aj")
    public int field993 = 0;

    @ObfuscatedName("cs.ae")
    public int field994 = 0;

    @ObfuscatedName("cs.ap")
    public byte field995 = 0;

    @ObfuscatedName("cs.ad")
    public int[] field1009 = new int[4];

    @ObfuscatedName("cs.bb")
    public int[] field997 = new int[4];

    @ObfuscatedName("cs.bf")
    public int[] field1022 = new int[4];

    @ObfuscatedName("cs.bp")
    public int[] field996 = new int[4];

    @ObfuscatedName("cs.bg")
    public int[] field987 = new int[4];

    @ObfuscatedName("cs.bc")
    public class272 field1001 = new class272();

    @ObfuscatedName("cs.bj")
    public int field1002 = -1;

    @ObfuscatedName("cs.bl")
    public boolean field1003 = false;

    @ObfuscatedName("cs.bn")
    public int field1004 = -1;

    @ObfuscatedName("cs.bo")
    public int field1005 = -1;

    @ObfuscatedName("cs.be")
    public int field1006 = 0;

    @ObfuscatedName("cs.ba")
    public int field1034 = 0;

    @ObfuscatedName("cs.bt")
    public int field1008 = -1;

    @ObfuscatedName("cs.bw")
    public int field1007 = 0;

    @ObfuscatedName("cs.bm")
    public int field990 = 0;

    @ObfuscatedName("cs.by")
    public int field981 = 0;

    @ObfuscatedName("cs.bq")
    public int field1023 = 0;

    @ObfuscatedName("cs.bv")
    public int field1013 = -1;

    @ObfuscatedName("cs.br")
    public int field1014 = 0;

    @ObfuscatedName("cs.bs")
    public int field1015 = 0;

    @ObfuscatedName("cs.bd")
    public int field1016;

    @ObfuscatedName("cs.bh")
    public int field1017;

    @ObfuscatedName("cs.bk")
    public int field1018;

    @ObfuscatedName("cs.bx")
    public int field1019;

    @ObfuscatedName("cs.bi")
    public int field1020;

    @ObfuscatedName("cs.bu")
    public int field1021;

    @ObfuscatedName("cs.bz")
    public int field1010;

    @ObfuscatedName("cs.cs")
    public int field1025;

    @ObfuscatedName("cs.ce")
    public int field1024;

    @ObfuscatedName("cs.cf")
    public int field1011 = 0;

    @ObfuscatedName("cs.cg")
    public int field1026 = 200;

    @ObfuscatedName("cs.cp")
    public int field1027;

    @ObfuscatedName("cs.cc")
    public int field1028 = 0;

    @ObfuscatedName("cs.cl")
    public int field1029 = 32;

    @ObfuscatedName("cs.ci")
    public int field999 = 0;

    @ObfuscatedName("cs.cy")
    public int[] field1031 = new int[10];

    @ObfuscatedName("cs.cx")
    public int[] field1032 = new int[10];

    @ObfuscatedName("cs.ca")
    public byte[] field1033 = new byte[10];

    @ObfuscatedName("cs.cn")
    public int field979 = 0;

    @ObfuscatedName("cs.cw")
    public int field1035 = 0;

    @ObfuscatedName("cs.as(B)V")
    public final void method1666() {
        this.field999 = 0;
        this.field1035 = 0;
    }

    @ObfuscatedName("cs.n(I)Z")
    public boolean method1179() {
        return false;
    }

    @ObfuscatedName("cs.aj(IIIIIIB)V")
    public final void method1667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1022[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class264 var13 = class264.method4245(arg0);
            var11 = var13.field3362;
            var12 = var13.field3371;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1022[0];
            } else if (var11 == 1) {
                var14 = this.field997[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1022[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1022[var15];
                    }
                } else if (var11 == 1 && this.field997[var15] < var14) {
                    var10 = var15;
                    var14 = this.field997[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field995 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field995;
                this.field995 = (byte) ((this.field995 + 1) % 4);
                if (this.field1022[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1009[var10] = arg0;
        this.field997[var10] = arg1;
        this.field996[var10] = arg2;
        this.field987[var10] = arg3;
        this.field1022[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cs.ae(IIIIIIS)V")
    public final void method1665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class258 var7 = (class258) class258.field3318.method3155((long) arg0);
        class258 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3310.method3905(33, arg0);
            class258 var10 = new class258();
            if (var9 != null) {
                var10.method4226(new class311(var9));
            }
            class258.field3318.method3157(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class258 var11 = var8;
        class88 var12 = null;
        class88 var13 = null;
        int var14 = var8.field3313;
        int var15 = 0;
        for (class88 var16 = (class88) this.field1001.method4572(); var16 != null; var16 = (class88) this.field1001.method4574()) {
            var15++;
            if (var16.field1149.field3311 == var11.field3311) {
                var16.method1944(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1149.field3312 <= var11.field3312) {
                var12 = var16;
            }
            if (var16.field1149.field3313 > var14) {
                var13 = var16;
                var14 = var16.field1149.field3313;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class88 var17 = new class88(var11);
        if (var12 == null) {
            this.field1001.method4570(var17);
        } else {
            class272.method4571(var17, var12);
        }
        var17.method1944(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3407();
        }
    }

    @ObfuscatedName("cs.al(II)V")
    public final void method1669(int arg0) {
        class258 var2 = (class258) class258.field3318.method3155((long) arg0);
        class258 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3310.method3905(33, arg0);
            class258 var5 = new class258();
            if (var4 != null) {
                var5.method4226(new class311(var4));
            }
            class258.field3318.method3157(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class258 var6 = var3;
        for (class88 var7 = (class88) this.field1001.method4572(); var7 != null; var7 = (class88) this.field1001.method4574()) {
            if (var7.field1149 == var6) {
                var7.method3407();
                return;
            }
        }
    }
}
