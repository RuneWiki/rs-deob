package deob;

@ObfuscatedName("bv")
public abstract class class70 extends class136 {

    @ObfuscatedName("bv.as")
    public int field937;

    @ObfuscatedName("bv.ak")
    public int field923;

    @ObfuscatedName("bv.au")
    public int field924;

    @ObfuscatedName("bv.ah")
    public boolean field948 = false;

    @ObfuscatedName("bv.aq")
    public int field926 = 1;

    @ObfuscatedName("bv.ao")
    public int field925;

    @ObfuscatedName("bv.an")
    public int field928 = -1;

    @ObfuscatedName("bv.ar")
    public int field929 = -1;

    @ObfuscatedName("bv.az")
    public int field976 = -1;

    @ObfuscatedName("bv.ay")
    public int field960 = -1;

    @ObfuscatedName("bv.ag")
    public int field963 = -1;

    @ObfuscatedName("bv.ac")
    public int field933 = -1;

    @ObfuscatedName("bv.al")
    public int field934 = -1;

    @ObfuscatedName("bv.ae")
    public int field935 = -1;

    @ObfuscatedName("bv.ad")
    public String field936 = null;

    @ObfuscatedName("bv.aj")
    public boolean field932;

    @ObfuscatedName("bv.ax")
    public boolean field938 = false;

    @ObfuscatedName("bv.at")
    public int field939 = 100;

    @ObfuscatedName("bv.af")
    public int field965 = 0;

    @ObfuscatedName("bv.ap")
    public int field941 = 0;

    @ObfuscatedName("bv.am")
    public byte field940 = 0;

    @ObfuscatedName("bv.ab")
    public int[] field968 = new int[4];

    @ObfuscatedName("bv.bj")
    public int[] field945 = new int[4];

    @ObfuscatedName("bv.bg")
    public int[] field980 = new int[4];

    @ObfuscatedName("bv.bw")
    public int[] field946 = new int[4];

    @ObfuscatedName("bv.bk")
    public int[] field947 = new int[4];

    @ObfuscatedName("bv.bl")
    public class261 field943 = new class261();

    @ObfuscatedName("bv.bq")
    public int field949 = -1;

    @ObfuscatedName("bv.bx")
    public boolean field950 = false;

    @ObfuscatedName("bv.bc")
    public int field961 = -1;

    @ObfuscatedName("bv.by")
    public int field952 = -1;

    @ObfuscatedName("bv.bz")
    public int field953 = 0;

    @ObfuscatedName("bv.bm")
    public int field942 = 0;

    @ObfuscatedName("bv.bo")
    public int field955 = -1;

    @ObfuscatedName("bv.bs")
    public int field956 = 0;

    @ObfuscatedName("bv.ba")
    public int field957 = 0;

    @ObfuscatedName("bv.bn")
    public int field958 = 0;

    @ObfuscatedName("bv.bb")
    public int field959 = 0;

    @ObfuscatedName("bv.bh")
    public int field982 = -1;

    @ObfuscatedName("bv.bv")
    public int field954 = 0;

    @ObfuscatedName("bv.bu")
    public int field962 = 0;

    @ObfuscatedName("bv.be")
    public int field944;

    @ObfuscatedName("bv.bd")
    public int field964;

    @ObfuscatedName("bv.bf")
    public int field922;

    @ObfuscatedName("bv.bi")
    public int field966;

    @ObfuscatedName("bv.br")
    public int field967;

    @ObfuscatedName("bv.bt")
    public int field930;

    @ObfuscatedName("bv.bp")
    public int field951;

    @ObfuscatedName("bv.co")
    public int field970;

    @ObfuscatedName("bv.cp")
    public int field971;

    @ObfuscatedName("bv.cd")
    public int field972 = 0;

    @ObfuscatedName("bv.cj")
    public int field973 = 200;

    @ObfuscatedName("bv.cq")
    public int field974;

    @ObfuscatedName("bv.cb")
    public int field975 = 0;

    @ObfuscatedName("bv.cf")
    public int field969 = 32;

    @ObfuscatedName("bv.cs")
    public int field977 = 0;

    @ObfuscatedName("bv.ch")
    public int[] field978 = new int[10];

    @ObfuscatedName("bv.ca")
    public int[] field979 = new int[10];

    @ObfuscatedName("bv.cn")
    public byte[] field931 = new byte[10];

    @ObfuscatedName("bv.cx")
    public int field981 = 0;

    @ObfuscatedName("bv.ck")
    public int field927 = 0;

    @ObfuscatedName("bv.ai(B)V")
    public final void method1576() {
        this.field977 = 0;
        this.field927 = 0;
    }

    @ObfuscatedName("bv.l(S)Z")
    public boolean method1108() {
        return false;
    }

    @ObfuscatedName("bv.am(IIIIIII)V")
    public final void method1581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field980[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class253 var13 = class253.method3479(arg0);
            var11 = var13.field3300;
            var12 = var13.field3299;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field980[0];
            } else if (var11 == 1) {
                var14 = this.field945[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field980[var15] < var14) {
                        var10 = var15;
                        var14 = this.field980[var15];
                    }
                } else if (var11 == 1 && this.field945[var15] < var14) {
                    var10 = var15;
                    var14 = this.field945[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field940 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field940;
                this.field940 = (byte) ((this.field940 + 1) % 4);
                if (this.field980[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field968[var10] = arg0;
        this.field945[var10] = arg1;
        this.field946[var10] = arg2;
        this.field947[var10] = arg3;
        this.field980[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bv.ab(IIIIIII)V")
    public final void method1575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class247 var7 = class247.method485(arg0);
        class79 var8 = null;
        class79 var9 = null;
        int var10 = var7.field3254;
        int var11 = 0;
        for (class79 var12 = (class79) this.field943.method4447(); var12 != null; var12 = (class79) this.field943.method4487()) {
            var11++;
            if (var12.field1099.field3250 == var7.field3250) {
                var12.method1861(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1099.field3259 <= var7.field3259) {
                var8 = var12;
            }
            if (var12.field1099.field3254 > var10) {
                var9 = var12;
                var10 = var12.field1099.field3254;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class79 var13 = new class79(var7);
        if (var8 == null) {
            this.field943.method4446(var13);
        } else {
            class261.method4453(var13, var8);
        }
        var13.method1861(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3292();
        }
    }

    @ObfuscatedName("bv.bj(II)V")
    public final void method1578(int arg0) {
        class247 var2 = class247.method485(arg0);
        for (class79 var3 = (class79) this.field943.method4447(); var3 != null; var3 = (class79) this.field943.method4487()) {
            if (var3.field1099 == var2) {
                var3.method3292();
                return;
            }
        }
    }
}
