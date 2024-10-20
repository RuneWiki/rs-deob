package deob;

@ObfuscatedName("bs")
public abstract class class64 extends class128 {

    @ObfuscatedName("bs.ac")
    public int field901;

    @ObfuscatedName("bs.ay")
    public int field919;

    @ObfuscatedName("bs.an")
    public boolean field885 = false;

    @ObfuscatedName("bs.as")
    public int field884;

    @ObfuscatedName("bs.aw")
    public int field886 = 1;

    @ObfuscatedName("bs.ag")
    public int field906;

    @ObfuscatedName("bs.ah")
    public int field910 = -1;

    @ObfuscatedName("bs.az")
    public int field893 = -1;

    @ObfuscatedName("bs.ao")
    public int field890 = -1;

    @ObfuscatedName("bs.ap")
    public int field891 = -1;

    @ObfuscatedName("bs.af")
    public int field892 = -1;

    @ObfuscatedName("bs.am")
    public int field883 = -1;

    @ObfuscatedName("bs.aq")
    public int field894 = -1;

    @ObfuscatedName("bs.aj")
    public int field895 = -1;

    @ObfuscatedName("bs.ae")
    public String field896 = null;

    @ObfuscatedName("bs.au")
    public boolean field939;

    @ObfuscatedName("bs.av")
    public boolean field942 = false;

    @ObfuscatedName("bs.ab")
    public int field899 = 100;

    @ObfuscatedName("bs.aa")
    public int field900 = 0;

    @ObfuscatedName("bs.ar")
    public int field888 = 0;

    @ObfuscatedName("bs.al")
    public byte field903 = 0;

    @ObfuscatedName("bs.ak")
    public int[] field944 = new int[4];

    @ObfuscatedName("bs.bc")
    public int[] field905 = new int[4];

    @ObfuscatedName("bs.bo")
    public int[] field882 = new int[4];

    @ObfuscatedName("bs.bx")
    public int[] field907 = new int[4];

    @ObfuscatedName("bs.be")
    public int[] field908 = new int[4];

    @ObfuscatedName("bs.br")
    public class204 field909 = new class204();

    @ObfuscatedName("bs.bk")
    public int field936 = -1;

    @ObfuscatedName("bs.bn")
    public boolean field911 = false;

    @ObfuscatedName("bs.bp")
    public int field898 = -1;

    @ObfuscatedName("bs.bu")
    public int field913 = -1;

    @ObfuscatedName("bs.by")
    public int field912 = 0;

    @ObfuscatedName("bs.bl")
    public int field915 = 0;

    @ObfuscatedName("bs.bs")
    public int field916 = -1;

    @ObfuscatedName("bs.bi")
    public int field917 = 0;

    @ObfuscatedName("bs.bb")
    public int field918 = 0;

    @ObfuscatedName("bs.bt")
    public int field914 = 0;

    @ObfuscatedName("bs.bm")
    public int field920 = 0;

    @ObfuscatedName("bs.bw")
    public int field921 = -1;

    @ObfuscatedName("bs.bv")
    public int field922 = 0;

    @ObfuscatedName("bs.bf")
    public int field904 = 0;

    @ObfuscatedName("bs.bj")
    public int field924;

    @ObfuscatedName("bs.ba")
    public int field925;

    @ObfuscatedName("bs.bg")
    public int field926;

    @ObfuscatedName("bs.bh")
    public int field927;

    @ObfuscatedName("bs.bd")
    public int field928;

    @ObfuscatedName("bs.bz")
    public int field889;

    @ObfuscatedName("bs.bq")
    public int field897;

    @ObfuscatedName("bs.cq")
    public int field902;

    @ObfuscatedName("bs.ci")
    public int field932;

    @ObfuscatedName("bs.cn")
    public int field933 = 0;

    @ObfuscatedName("bs.ct")
    public int field923 = 200;

    @ObfuscatedName("bs.cw")
    public int field935;

    @ObfuscatedName("bs.cf")
    public int field931 = 0;

    @ObfuscatedName("bs.cs")
    public int field930 = 32;

    @ObfuscatedName("bs.ce")
    public int field938 = 0;

    @ObfuscatedName("bs.co")
    public int[] field929 = new int[10];

    @ObfuscatedName("bs.cj")
    public int[] field940 = new int[10];

    @ObfuscatedName("bs.cp")
    public byte[] field941 = new byte[10];

    @ObfuscatedName("bs.ck")
    public int field937 = 0;

    @ObfuscatedName("bs.ca")
    public int field943 = 0;

    @ObfuscatedName("bs.bo(I)V")
    public final void method1475() {
        this.field938 = 0;
        this.field943 = 0;
    }

    @ObfuscatedName("bs.c(B)Z")
    public boolean method1052() {
        return false;
    }

    @ObfuscatedName("bs.bx(IIIIIII)V")
    public final void method1469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field882[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class268 var13 = class268.method93(arg0);
            var11 = var13.field3385;
            var12 = var13.field3376;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field882[0];
            } else if (var11 == 1) {
                var14 = this.field905[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field882[var15] < var14) {
                        var10 = var15;
                        var14 = this.field882[var15];
                    }
                } else if (var11 == 1 && this.field905[var15] < var14) {
                    var10 = var15;
                    var14 = this.field905[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field903 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field903;
                this.field903 = (byte) ((this.field903 + 1) % 4);
                if (this.field882[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field944[var10] = arg0;
        this.field905[var10] = arg1;
        this.field907[var10] = arg2;
        this.field908[var10] = arg3;
        this.field882[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bs.be(IIIIIII)V")
    public final void method1470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class262 var7 = class262.method4202(arg0);
        class72 var8 = null;
        class72 var9 = null;
        int var10 = var7.field3328;
        int var11 = 0;
        for (class72 var12 = (class72) this.field909.method3756(); var12 != null; var12 = (class72) this.field909.method3758()) {
            var11++;
            if (var12.field1047.field3326 == var7.field3326) {
                var12.method1694(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1047.field3327 <= var7.field3327) {
                var8 = var12;
            }
            if (var12.field1047.field3328 > var10) {
                var9 = var12;
                var10 = var12.field1047.field3328;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class72 var13 = new class72(var7);
        if (var8 == null) {
            this.field909.method3754(var13);
        } else {
            class204.method3773(var13, var8);
        }
        var13.method1694(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3782();
        }
    }

    @ObfuscatedName("bs.br(II)V")
    public final void method1466(int arg0) {
        class262 var2 = class262.method4202(arg0);
        for (class72 var3 = (class72) this.field909.method3756(); var3 != null; var3 = (class72) this.field909.method3758()) {
            if (var3.field1047 == var2) {
                var3.method3782();
                return;
            }
        }
    }
}
