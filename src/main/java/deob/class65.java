package deob;

@ObfuscatedName("bj")
public abstract class class65 extends class130 {

    @ObfuscatedName("bj.az")
    public int field947;

    @ObfuscatedName("bj.aj")
    public int field960;

    @ObfuscatedName("bj.af")
    public int field932;

    @ObfuscatedName("bj.ah")
    public boolean field933 = false;

    @ObfuscatedName("bj.ab")
    public int field934 = 1;

    @ObfuscatedName("bj.aa")
    public int field986;

    @ObfuscatedName("bj.ac")
    public int field930 = -1;

    @ObfuscatedName("bj.ad")
    public int field937 = -1;

    @ObfuscatedName("bj.aq")
    public int field938 = -1;

    @ObfuscatedName("bj.ax")
    public int field939 = -1;

    @ObfuscatedName("bj.an")
    public int field940 = -1;

    @ObfuscatedName("bj.ag")
    public int field941 = -1;

    @ObfuscatedName("bj.ap")
    public int field983 = -1;

    @ObfuscatedName("bj.aw")
    public int field943 = -1;

    @ObfuscatedName("bj.al")
    public String field989 = null;

    @ObfuscatedName("bj.ar")
    public boolean field945;

    @ObfuscatedName("bj.au")
    public boolean field946 = false;

    @ObfuscatedName("bj.av")
    public int field950 = 100;

    @ObfuscatedName("bj.am")
    public int field948 = 0;

    @ObfuscatedName("bj.ao")
    public int field949 = 0;

    @ObfuscatedName("bj.ae")
    public byte field931 = 0;

    @ObfuscatedName("bj.as")
    public int[] field951 = new int[4];

    @ObfuscatedName("bj.bw")
    public int[] field952 = new int[4];

    @ObfuscatedName("bj.bg")
    public int[] field953 = new int[4];

    @ObfuscatedName("bj.bu")
    public int[] field954 = new int[4];

    @ObfuscatedName("bj.bs")
    public int[] field955 = new int[4];

    @ObfuscatedName("bj.ba")
    public class206 field956 = new class206();

    @ObfuscatedName("bj.bt")
    public int field944 = -1;

    @ObfuscatedName("bj.br")
    public boolean field958 = false;

    @ObfuscatedName("bj.bq")
    public int field959 = -1;

    @ObfuscatedName("bj.bp")
    public int field970 = -1;

    @ObfuscatedName("bj.bb")
    public int field979 = 0;

    @ObfuscatedName("bj.bf")
    public int field962 = 0;

    @ObfuscatedName("bj.bv")
    public int field963 = -1;

    @ObfuscatedName("bj.bj")
    public int field964 = 0;

    @ObfuscatedName("bj.bn")
    public int field942 = 0;

    @ObfuscatedName("bj.bl")
    public int field987 = 0;

    @ObfuscatedName("bj.bi")
    public int field967 = 0;

    @ObfuscatedName("bj.bo")
    public int field971 = -1;

    @ObfuscatedName("bj.be")
    public int field969 = 0;

    @ObfuscatedName("bj.bz")
    public int field966 = 0;

    @ObfuscatedName("bj.bd")
    public int field957;

    @ObfuscatedName("bj.bh")
    public int field972;

    @ObfuscatedName("bj.bx")
    public int field973;

    @ObfuscatedName("bj.bc")
    public int field974;

    @ObfuscatedName("bj.bm")
    public int field968;

    @ObfuscatedName("bj.by")
    public int field935;

    @ObfuscatedName("bj.bk")
    public int field965;

    @ObfuscatedName("bj.cq")
    public int field978;

    @ObfuscatedName("bj.ci")
    public int field936;

    @ObfuscatedName("bj.cv")
    public int field980 = 0;

    @ObfuscatedName("bj.cn")
    public int field981 = 200;

    @ObfuscatedName("bj.cf")
    public int field982;

    @ObfuscatedName("bj.cd")
    public int field961 = 0;

    @ObfuscatedName("bj.ce")
    public int field984 = 32;

    @ObfuscatedName("bj.ct")
    public int field985 = 0;

    @ObfuscatedName("bj.cb")
    public int[] field977 = new int[10];

    @ObfuscatedName("bj.cg")
    public int[] field975 = new int[10];

    @ObfuscatedName("bj.cm")
    public byte[] field988 = new byte[10];

    @ObfuscatedName("bj.cr")
    public int field976 = 0;

    @ObfuscatedName("bj.ck")
    public int field990 = 0;

    @ObfuscatedName("bj.aw(B)V")
    public final void method1455() {
        this.field985 = 0;
        this.field990 = 0;
    }

    @ObfuscatedName("bj.n(I)Z")
    public boolean method1040() {
        return false;
    }

    @ObfuscatedName("bj.al(IIIIIII)V")
    public final void method1460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field953[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class270 var13 = class270.method1728(arg0);
            var11 = var13.field3410;
            var12 = var13.field3390;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field953[0];
            } else if (var11 == 1) {
                var14 = this.field952[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field953[var15] < var14) {
                        var10 = var15;
                        var14 = this.field953[var15];
                    }
                } else if (var11 == 1 && this.field952[var15] < var14) {
                    var10 = var15;
                    var14 = this.field952[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field931 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field931;
                this.field931 = (byte) ((this.field931 + 1) % 4);
                if (this.field953[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field951[var10] = arg0;
        this.field952[var10] = arg1;
        this.field954[var10] = arg2;
        this.field955[var10] = arg3;
        this.field953[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bj.ar(IIIIIII)V")
    public final void method1457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class264 var7 = (class264) class264.field3342.method3654((long) arg0);
        class264 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3345.method4210(33, arg0);
            class264 var10 = new class264();
            if (var9 != null) {
                var10.method4530(new class185(var9));
            }
            class264.field3342.method3646(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class264 var11 = var8;
        class73 var12 = null;
        class73 var13 = null;
        int var14 = var8.field3348;
        int var15 = 0;
        for (class73 var16 = (class73) this.field956.method3706(); var16 != null; var16 = (class73) this.field956.method3714()) {
            var15++;
            if (var16.field1080.field3344 == var11.field3344) {
                var16.method1648(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1080.field3347 <= var11.field3347) {
                var12 = var16;
            }
            if (var16.field1080.field3348 > var14) {
                var13 = var16;
                var14 = var16.field1080.field3348;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class73 var17 = new class73(var11);
        if (var12 == null) {
            this.field956.method3704(var17);
        } else {
            class206.method3705(var17, var12);
        }
        var17.method1648(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3733();
        }
    }

    @ObfuscatedName("bj.au(II)V")
    public final void method1458(int arg0) {
        class264 var2 = (class264) class264.field3342.method3654((long) arg0);
        class264 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3345.method4210(33, arg0);
            class264 var5 = new class264();
            if (var4 != null) {
                var5.method4530(new class185(var4));
            }
            class264.field3342.method3646(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class264 var6 = var3;
        for (class73 var7 = (class73) this.field956.method3706(); var7 != null; var7 = (class73) this.field956.method3714()) {
            if (var7.field1080 == var6) {
                var7.method3733();
                return;
            }
        }
    }
}
