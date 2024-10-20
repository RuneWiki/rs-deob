package deob;

@ObfuscatedName("bu")
public abstract class class65 extends class130 {

    @ObfuscatedName("bu.an")
    public boolean field920 = false;

    @ObfuscatedName("bu.aa")
    public int field951;

    @ObfuscatedName("bu.ag")
    public int field956;

    @ObfuscatedName("bu.av")
    public int field925;

    @ObfuscatedName("bu.am")
    public int field921 = 1;

    @ObfuscatedName("bu.ap")
    public int field948;

    @ObfuscatedName("bu.au")
    public int field923 = -1;

    @ObfuscatedName("bu.ae")
    public int field932 = -1;

    @ObfuscatedName("bu.ai")
    public int field970 = -1;

    @ObfuscatedName("bu.ab")
    public int field926 = -1;

    @ObfuscatedName("bu.aw")
    public int field927 = -1;

    @ObfuscatedName("bu.ac")
    public int field928 = -1;

    @ObfuscatedName("bu.aq")
    public int field917 = -1;

    @ObfuscatedName("bu.az")
    public int field930 = -1;

    @ObfuscatedName("bu.ay")
    public String field931 = null;

    @ObfuscatedName("bu.ao")
    public boolean field966;

    @ObfuscatedName("bu.ak")
    public boolean field969 = false;

    @ObfuscatedName("bu.af")
    public int field968 = 100;

    @ObfuscatedName("bu.ax")
    public int field935 = 0;

    @ObfuscatedName("bu.ar")
    public int field936 = 0;

    @ObfuscatedName("bu.aj")
    public byte field973 = 0;

    @ObfuscatedName("bu.as")
    public int[] field938 = new int[4];

    @ObfuscatedName("bu.br")
    public int[] field939 = new int[4];

    @ObfuscatedName("bu.bd")
    public int[] field940 = new int[4];

    @ObfuscatedName("bu.bp")
    public int[] field941 = new int[4];

    @ObfuscatedName("bu.bk")
    public int[] field942 = new int[4];

    @ObfuscatedName("bu.bm")
    public class206 field943 = new class206();

    @ObfuscatedName("bu.bc")
    public int field944 = -1;

    @ObfuscatedName("bu.bi")
    public boolean field962 = false;

    @ObfuscatedName("bu.bo")
    public int field946 = -1;

    @ObfuscatedName("bu.bh")
    public int field947 = -1;

    @ObfuscatedName("bu.bg")
    public int field922 = 0;

    @ObfuscatedName("bu.bx")
    public int field949 = 0;

    @ObfuscatedName("bu.bn")
    public int field950 = -1;

    @ObfuscatedName("bu.bu")
    public int field955 = 0;

    @ObfuscatedName("bu.bj")
    public int field952 = 0;

    @ObfuscatedName("bu.bl")
    public int field953 = 0;

    @ObfuscatedName("bu.bv")
    public int field924 = 0;

    @ObfuscatedName("bu.bz")
    public int field975 = -1;

    @ObfuscatedName("bu.bb")
    public int field934 = 0;

    @ObfuscatedName("bu.bs")
    public int field954 = 0;

    @ObfuscatedName("bu.bf")
    public int field958;

    @ObfuscatedName("bu.be")
    public int field959;

    @ObfuscatedName("bu.ba")
    public int field960;

    @ObfuscatedName("bu.bw")
    public int field961;

    @ObfuscatedName("bu.bq")
    public int field937;

    @ObfuscatedName("bu.bt")
    public int field963;

    @ObfuscatedName("bu.by")
    public int field919;

    @ObfuscatedName("bu.cv")
    public int field965;

    @ObfuscatedName("bu.co")
    public int field929;

    @ObfuscatedName("bu.cg")
    public int field967 = 0;

    @ObfuscatedName("bu.cb")
    public int field964 = 200;

    @ObfuscatedName("bu.cq")
    public int field945;

    @ObfuscatedName("bu.ca")
    public int field971 = 0;

    @ObfuscatedName("bu.ci")
    public int field957 = 32;

    @ObfuscatedName("bu.cr")
    public int field972 = 0;

    @ObfuscatedName("bu.cu")
    public int[] field933 = new int[10];

    @ObfuscatedName("bu.cm")
    public int[] field974 = new int[10];

    @ObfuscatedName("bu.cl")
    public byte[] field918 = new byte[10];

    @ObfuscatedName("bu.cw")
    public int field976 = 0;

    @ObfuscatedName("bu.ct")
    public int field977 = 0;

    @ObfuscatedName("bu.ax(I)V")
    public final void method1456() {
        this.field972 = 0;
        this.field977 = 0;
    }

    @ObfuscatedName("bu.l(I)Z")
    public boolean method1083() {
        return false;
    }

    @ObfuscatedName("bu.ar(IIIIIII)V")
    public final void method1458(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field940[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class270 var13 = class270.method4250(arg0);
            var11 = var13.field3416;
            var12 = var13.field3414;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field940[0];
            } else if (var11 == 1) {
                var14 = this.field939[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field940[var15] < var14) {
                        var10 = var15;
                        var14 = this.field940[var15];
                    }
                } else if (var11 == 1 && this.field939[var15] < var14) {
                    var10 = var15;
                    var14 = this.field939[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field973 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field973;
                this.field973 = (byte) ((this.field973 + 1) % 4);
                if (this.field940[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field938[var10] = arg0;
        this.field939[var10] = arg1;
        this.field941[var10] = arg2;
        this.field942[var10] = arg3;
        this.field940[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bu.at(IIIIIII)V")
    public final void method1459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class264 var7 = (class264) class264.field3365.method3685((long) arg0);
        class264 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3363.method4263(33, arg0);
            class264 var10 = new class264();
            if (var9 != null) {
                var10.method4558(new class185(var9));
            }
            class264.field3365.method3687(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class264 var11 = var8;
        class73 var12 = null;
        class73 var13 = null;
        int var14 = var8.field3360;
        int var15 = 0;
        for (class73 var16 = (class73) this.field943.method3740(); var16 != null; var16 = (class73) this.field943.method3759()) {
            var15++;
            if (var16.field1077.field3356 == var11.field3356) {
                var16.method1664(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1077.field3352 <= var11.field3352) {
                var12 = var16;
            }
            if (var16.field1077.field3360 > var14) {
                var13 = var16;
                var14 = var16.field1077.field3360;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class73 var17 = new class73(var11);
        if (var12 == null) {
            this.field943.method3751(var17);
        } else {
            class206.method3744(var17, var12);
        }
        var17.method1664(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3766();
        }
    }

    @ObfuscatedName("bu.aj(II)V")
    public final void method1462(int arg0) {
        class264 var2 = (class264) class264.field3365.method3685((long) arg0);
        class264 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3363.method4263(33, arg0);
            class264 var5 = new class264();
            if (var4 != null) {
                var5.method4558(new class185(var4));
            }
            class264.field3365.method3687(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class264 var6 = var3;
        for (class73 var7 = (class73) this.field943.method3740(); var7 != null; var7 = (class73) this.field943.method3759()) {
            if (var7.field1077 == var6) {
                var7.method3766();
                return;
            }
        }
    }
}
