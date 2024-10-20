package deob;

@ObfuscatedName("ba")
public abstract class class64 extends class128 {

    @ObfuscatedName("ba.aw")
    public int field932;

    @ObfuscatedName("ba.ak")
    public int field882;

    @ObfuscatedName("ba.as")
    public int field906;

    @ObfuscatedName("ba.an")
    public boolean field874 = false;

    @ObfuscatedName("ba.ao")
    public int field875 = 1;

    @ObfuscatedName("ba.at")
    public int field890;

    @ObfuscatedName("ba.ai")
    public int field894 = -1;

    @ObfuscatedName("ba.ac")
    public int field878 = -1;

    @ObfuscatedName("ba.ap")
    public int field879 = -1;

    @ObfuscatedName("ba.aa")
    public int field900 = -1;

    @ObfuscatedName("ba.ar")
    public int field881 = -1;

    @ObfuscatedName("ba.au")
    public int field871 = -1;

    @ObfuscatedName("ba.av")
    public int field883 = -1;

    @ObfuscatedName("ba.al")
    public int field884 = -1;

    @ObfuscatedName("ba.ae")
    public String field885 = null;

    @ObfuscatedName("ba.az")
    public boolean field886;

    @ObfuscatedName("ba.aq")
    public boolean field887 = false;

    @ObfuscatedName("ba.ad")
    public int field888 = 100;

    @ObfuscatedName("ba.aj")
    public int field889 = 0;

    @ObfuscatedName("ba.ax")
    public int field928 = 0;

    @ObfuscatedName("ba.ay")
    public byte field891 = 0;

    @ObfuscatedName("ba.ag")
    public int[] field913 = new int[4];

    @ObfuscatedName("ba.bk")
    public int[] field893 = new int[4];

    @ObfuscatedName("ba.bp")
    public int[] field896 = new int[4];

    @ObfuscatedName("ba.bi")
    public int[] field895 = new int[4];

    @ObfuscatedName("ba.bj")
    public int[] field922 = new int[4];

    @ObfuscatedName("ba.bo")
    public class204 field897 = new class204();

    @ObfuscatedName("ba.bq")
    public int field898 = -1;

    @ObfuscatedName("ba.bh")
    public boolean field899 = false;

    @ObfuscatedName("ba.bz")
    public int field921 = -1;

    @ObfuscatedName("ba.bu")
    public int field901 = -1;

    @ObfuscatedName("ba.bg")
    public int field909 = 0;

    @ObfuscatedName("ba.bl")
    public int field903 = 0;

    @ObfuscatedName("ba.ba")
    public int field904 = -1;

    @ObfuscatedName("ba.bn")
    public int field905 = 0;

    @ObfuscatedName("ba.bb")
    public int field902 = 0;

    @ObfuscatedName("ba.bx")
    public int field907 = 0;

    @ObfuscatedName("ba.bc")
    public int field908 = 0;

    @ObfuscatedName("ba.bs")
    public int field892 = -1;

    @ObfuscatedName("ba.be")
    public int field877 = 0;

    @ObfuscatedName("ba.by")
    public int field911 = 0;

    @ObfuscatedName("ba.bv")
    public int field912;

    @ObfuscatedName("ba.br")
    public int field872;

    @ObfuscatedName("ba.bd")
    public int field914;

    @ObfuscatedName("ba.bw")
    public int field917;

    @ObfuscatedName("ba.bf")
    public int field916;

    @ObfuscatedName("ba.bt")
    public int field930;

    @ObfuscatedName("ba.bm")
    public int field918;

    @ObfuscatedName("ba.cy")
    public int field919;

    @ObfuscatedName("ba.cd")
    public int field920;

    @ObfuscatedName("ba.cb")
    public int field915 = 0;

    @ObfuscatedName("ba.co")
    public int field926 = 200;

    @ObfuscatedName("ba.cq")
    public int field927;

    @ObfuscatedName("ba.cl")
    public int field876 = 0;

    @ObfuscatedName("ba.ce")
    public int field925 = 32;

    @ObfuscatedName("ba.ch")
    public int field910 = 0;

    @ObfuscatedName("ba.cw")
    public int[] field923 = new int[10];

    @ObfuscatedName("ba.cf")
    public int[] field873 = new int[10];

    @ObfuscatedName("ba.ca")
    public byte[] field929 = new byte[10];

    @ObfuscatedName("ba.cr")
    public int field924 = 0;

    @ObfuscatedName("ba.cv")
    public int field931 = 0;

    @ObfuscatedName("ba.ae(I)V")
    public final void method1436() {
        this.field910 = 0;
        this.field931 = 0;
    }

    @ObfuscatedName("ba.f(B)Z")
    public boolean method1042() {
        return false;
    }

    @ObfuscatedName("ba.az(IIIIIIB)V")
    public final void method1437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field896[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class268 var13 = class268.method124(arg0);
            var11 = var13.field3361;
            var12 = var13.field3356;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field896[0];
            } else if (var11 == 1) {
                var14 = this.field893[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field896[var15] < var14) {
                        var10 = var15;
                        var14 = this.field896[var15];
                    }
                } else if (var11 == 1 && this.field893[var15] < var14) {
                    var10 = var15;
                    var14 = this.field893[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field891 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field891;
                this.field891 = (byte) ((this.field891 + 1) % 4);
                if (this.field896[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field913[var10] = arg0;
        this.field893[var10] = arg1;
        this.field895[var10] = arg2;
        this.field922[var10] = arg3;
        this.field896[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ba.aq(IIIIIII)V")
    public final void method1438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class262 var7 = (class262) class262.field3306.method3681((long) arg0);
        class262 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3305.method4247(33, arg0);
            class262 var10 = new class262();
            if (var9 != null) {
                var10.method4524(new class183(var9));
            }
            class262.field3306.method3675(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class262 var11 = var8;
        class72 var12 = null;
        class72 var13 = null;
        int var14 = var8.field3308;
        int var15 = 0;
        for (class72 var16 = (class72) this.field897.method3740(); var16 != null; var16 = (class72) this.field897.method3725()) {
            var15++;
            if (var16.field1026.field3318 == var11.field3318) {
                var16.method1661(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1026.field3311 <= var11.field3311) {
                var12 = var16;
            }
            if (var16.field1026.field3308 > var14) {
                var13 = var16;
                var14 = var16.field1026.field3308;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class72 var17 = new class72(var11);
        if (var12 == null) {
            this.field897.method3730(var17);
        } else {
            class204.method3728(var17, var12);
        }
        var17.method1661(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3756();
        }
    }

    @ObfuscatedName("ba.ad(II)V")
    public final void method1450(int arg0) {
        class262 var2 = (class262) class262.field3306.method3681((long) arg0);
        class262 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3305.method4247(33, arg0);
            class262 var5 = new class262();
            if (var4 != null) {
                var5.method4524(new class183(var4));
            }
            class262.field3306.method3675(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class262 var6 = var3;
        for (class72 var7 = (class72) this.field897.method3740(); var7 != null; var7 = (class72) this.field897.method3725()) {
            if (var7.field1026 == var6) {
                var7.method3756();
                return;
            }
        }
    }
}
