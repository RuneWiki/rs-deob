package deob;

@ObfuscatedName("cv")
public abstract class class79 extends class145 {

    @ObfuscatedName("cv.ae")
    public int field957;

    @ObfuscatedName("cv.ac")
    public int field954;

    @ObfuscatedName("cv.aq")
    public int field955;

    @ObfuscatedName("cv.at")
    public boolean field956 = false;

    @ObfuscatedName("cv.ak")
    public int field1008 = 1;

    @ObfuscatedName("cv.ax")
    public int field991;

    @ObfuscatedName("cv.ar")
    public int field973 = -1;

    @ObfuscatedName("cv.al")
    public int field1014 = -1;

    @ObfuscatedName("cv.aa")
    public int field961 = -1;

    @ObfuscatedName("cv.as")
    public int field981 = -1;

    @ObfuscatedName("cv.aw")
    public int field963 = -1;

    @ObfuscatedName("cv.az")
    public int field985 = -1;

    @ObfuscatedName("cv.ah")
    public int field1012 = -1;

    @ObfuscatedName("cv.ap")
    public int field966 = -1;

    @ObfuscatedName("cv.aj")
    public String field967 = null;

    @ObfuscatedName("cv.an")
    public boolean field968;

    @ObfuscatedName("cv.ai")
    public boolean field969 = false;

    @ObfuscatedName("cv.ab")
    public int field970 = 100;

    @ObfuscatedName("cv.au")
    public int field971 = 0;

    @ObfuscatedName("cv.ad")
    public int field972 = 0;

    @ObfuscatedName("cv.av")
    public byte field978 = 0;

    @ObfuscatedName("cv.ao")
    public int[] field1006 = new int[4];

    @ObfuscatedName("cv.bj")
    public int[] field975 = new int[4];

    @ObfuscatedName("cv.bn")
    public int[] field976 = new int[4];

    @ObfuscatedName("cv.bi")
    public int[] field977 = new int[4];

    @ObfuscatedName("cv.bp")
    public int[] field959 = new int[4];

    @ObfuscatedName("cv.br")
    public class272 field979 = new class272();

    @ObfuscatedName("cv.bq")
    public int field980 = -1;

    @ObfuscatedName("cv.bx")
    public boolean field1010 = false;

    @ObfuscatedName("cv.bc")
    public int field982 = -1;

    @ObfuscatedName("cv.bw")
    public int field983 = -1;

    @ObfuscatedName("cv.bv")
    public int field984 = 0;

    @ObfuscatedName("cv.bt")
    public int field960 = 0;

    @ObfuscatedName("cv.bl")
    public int field998 = -1;

    @ObfuscatedName("cv.bh")
    public int field996 = 0;

    @ObfuscatedName("cv.bz")
    public int field962 = 0;

    @ObfuscatedName("cv.bg")
    public int field989 = 0;

    @ObfuscatedName("cv.bm")
    public int field974 = 0;

    @ObfuscatedName("cv.bf")
    public int field988 = -1;

    @ObfuscatedName("cv.be")
    public int field992 = 0;

    @ObfuscatedName("cv.bs")
    public int field987 = 0;

    @ObfuscatedName("cv.by")
    public int field994;

    @ObfuscatedName("cv.bb")
    public int field995;

    @ObfuscatedName("cv.bd")
    public int field993;

    @ObfuscatedName("cv.ba")
    public int field997;

    @ObfuscatedName("cv.bk")
    public int field953;

    @ObfuscatedName("cv.bu")
    public int field999;

    @ObfuscatedName("cv.bo")
    public int field1000;

    @ObfuscatedName("cv.cv")
    public int field1001;

    @ObfuscatedName("cv.cd")
    public int field1002;

    @ObfuscatedName("cv.cq")
    public int field1003 = 0;

    @ObfuscatedName("cv.cb")
    public int field1004 = 200;

    @ObfuscatedName("cv.cf")
    public int field1005;

    @ObfuscatedName("cv.cp")
    public int field958 = 0;

    @ObfuscatedName("cv.ck")
    public int field1007 = 32;

    @ObfuscatedName("cv.cn")
    public int field964 = 0;

    @ObfuscatedName("cv.cj")
    public int[] field1009 = new int[10];

    @ObfuscatedName("cv.cr")
    public int[] field986 = new int[10];

    @ObfuscatedName("cv.ca")
    public byte[] field1011 = new byte[10];

    @ObfuscatedName("cv.cz")
    public int field990 = 0;

    @ObfuscatedName("cv.cs")
    public int field1013 = 0;

    @ObfuscatedName("cv.ad(I)V")
    public final void method1689() {
        this.field964 = 0;
        this.field1013 = 0;
    }

    @ObfuscatedName("cv.a(I)Z")
    public boolean method1192() {
        return false;
    }

    @ObfuscatedName("cv.af(IIIIIIB)V")
    public final void method1690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field976[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class264 var13 = class264.method1084(arg0);
            var11 = var13.field3376;
            var12 = var13.field3365;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field976[0];
            } else if (var11 == 1) {
                var14 = this.field975[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field976[var15] < var14) {
                        var10 = var15;
                        var14 = this.field976[var15];
                    }
                } else if (var11 == 1 && this.field975[var15] < var14) {
                    var10 = var15;
                    var14 = this.field975[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field978 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field978;
                this.field978 = (byte) ((this.field978 + 1) % 4);
                if (this.field976[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1006[var10] = arg0;
        this.field975[var10] = arg1;
        this.field977[var10] = arg2;
        this.field959[var10] = arg3;
        this.field976[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cv.av(IIIIIIB)V")
    public final void method1691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class258 var7 = (class258) class258.field3311.method3220((long) arg0);
        class258 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3315.method4032(33, arg0);
            class258 var10 = new class258();
            if (var9 != null) {
                var10.method4262(new class311(var9));
            }
            class258.field3311.method3217(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class258 var11 = var8;
        class88 var12 = null;
        class88 var13 = null;
        int var14 = var8.field3316;
        int var15 = 0;
        for (class88 var16 = (class88) this.field979.method4682(); var16 != null; var16 = (class88) this.field979.method4642()) {
            var15++;
            if (var16.field1142.field3313 == var11.field3313) {
                var16.method1992(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1142.field3320 <= var11.field3320) {
                var12 = var16;
            }
            if (var16.field1142.field3316 > var14) {
                var13 = var16;
                var14 = var16.field1142.field3316;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class88 var17 = new class88(var11);
        if (var12 == null) {
            this.field979.method4630(var17);
        } else {
            class272.method4656(var17, var12);
        }
        var17.method1992(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3486();
        }
    }

    @ObfuscatedName("cv.ao(IB)V")
    public final void method1699(int arg0) {
        class258 var2 = (class258) class258.field3311.method3220((long) arg0);
        class258 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3315.method4032(33, arg0);
            class258 var5 = new class258();
            if (var4 != null) {
                var5.method4262(new class311(var4));
            }
            class258.field3311.method3217(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class258 var6 = var3;
        for (class88 var7 = (class88) this.field979.method4682(); var7 != null; var7 = (class88) this.field979.method4642()) {
            if (var7.field1142 == var6) {
                var7.method3486();
                return;
            }
        }
    }
}
