package deob;

@ObfuscatedName("bq")
public abstract class class70 extends class135 {

    @ObfuscatedName("bq.aa")
    public int field948;

    @ObfuscatedName("bq.ab")
    public int field949;

    @ObfuscatedName("bq.ah")
    public int field990;

    @ObfuscatedName("bq.aw")
    public boolean field942 = false;

    @ObfuscatedName("bq.an")
    public int field943 = 1;

    @ObfuscatedName("bq.at")
    public int field961;

    @ObfuscatedName("bq.ae")
    public int field952 = -1;

    @ObfuscatedName("bq.av")
    public int field946 = -1;

    @ObfuscatedName("bq.au")
    public int field947 = -1;

    @ObfuscatedName("bq.aj")
    public int field945 = -1;

    @ObfuscatedName("bq.as")
    public int field980 = -1;

    @ObfuscatedName("bq.ar")
    public int field950 = -1;

    @ObfuscatedName("bq.ai")
    public int field972 = -1;

    @ObfuscatedName("bq.aq")
    public int field969 = -1;

    @ObfuscatedName("bq.al")
    public String field953 = null;

    @ObfuscatedName("bq.az")
    public boolean field954;

    @ObfuscatedName("bq.ac")
    public boolean field955 = false;

    @ObfuscatedName("bq.ao")
    public int field983 = 100;

    @ObfuscatedName("bq.ad")
    public int field957 = 0;

    @ObfuscatedName("bq.ax")
    public int field958 = 0;

    @ObfuscatedName("bq.ak")
    public byte field959 = 0;

    @ObfuscatedName("bq.am")
    public int[] field960 = new int[4];

    @ObfuscatedName("bq.bf")
    public int[] field997 = new int[4];

    @ObfuscatedName("bq.bo")
    public int[] field962 = new int[4];

    @ObfuscatedName("bq.be")
    public int[] field963 = new int[4];

    @ObfuscatedName("bq.bd")
    public int[] field964 = new int[4];

    @ObfuscatedName("bq.bz")
    public class211 field995 = new class211();

    @ObfuscatedName("bq.bi")
    public int field966 = -1;

    @ObfuscatedName("bq.bp")
    public boolean field967 = false;

    @ObfuscatedName("bq.bv")
    public int field968 = -1;

    @ObfuscatedName("bq.bg")
    public int field970 = -1;

    @ObfuscatedName("bq.bk")
    public int field981 = 0;

    @ObfuscatedName("bq.br")
    public int field971 = 0;

    @ObfuscatedName("bq.bn")
    public int field939 = -1;

    @ObfuscatedName("bq.bl")
    public int field973 = 0;

    @ObfuscatedName("bq.bb")
    public int field974 = 0;

    @ObfuscatedName("bq.bw")
    public int field975 = 0;

    @ObfuscatedName("bq.bh")
    public int field976 = 0;

    @ObfuscatedName("bq.bj")
    public int field977 = -1;

    @ObfuscatedName("bq.bq")
    public int field965 = 0;

    @ObfuscatedName("bq.by")
    public int field979 = 0;

    @ObfuscatedName("bq.bu")
    public int field941;

    @ObfuscatedName("bq.bt")
    public int field993;

    @ObfuscatedName("bq.bc")
    public int field982;

    @ObfuscatedName("bq.bs")
    public int field944;

    @ObfuscatedName("bq.bx")
    public int field984;

    @ObfuscatedName("bq.ba")
    public int field985;

    @ObfuscatedName("bq.bm")
    public int field986;

    @ObfuscatedName("bq.cm")
    public int field987;

    @ObfuscatedName("bq.ch")
    public int field988;

    @ObfuscatedName("bq.cg")
    public int field989 = 0;

    @ObfuscatedName("bq.ca")
    public int field978 = 200;

    @ObfuscatedName("bq.cy")
    public int field991;

    @ObfuscatedName("bq.cx")
    public int field992 = 0;

    @ObfuscatedName("bq.cc")
    public int field940 = 32;

    @ObfuscatedName("bq.ct")
    public int field994 = 0;

    @ObfuscatedName("bq.cb")
    public int[] field999 = new int[10];

    @ObfuscatedName("bq.cp")
    public int[] field996 = new int[10];

    @ObfuscatedName("bq.cd")
    public byte[] field956 = new byte[10];

    @ObfuscatedName("bq.cq")
    public int field998 = 0;

    @ObfuscatedName("bq.cf")
    public int field951 = 0;

    @ObfuscatedName("bq.be(I)V")
    public final void method1588() {
        this.field994 = 0;
        this.field951 = 0;
    }

    @ObfuscatedName("bq.r(I)Z")
    public boolean method1116() {
        return false;
    }

    @ObfuscatedName("bq.bd(IIIIIII)V")
    public final void method1587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field962[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class274 var13 = class274.method3278(arg0);
            var11 = var13.field3430;
            var12 = var13.field3438;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field962[0];
            } else if (var11 == 1) {
                var14 = this.field997[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field962[var15] < var14) {
                        var10 = var15;
                        var14 = this.field962[var15];
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
                this.field959 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field959;
                this.field959 = (byte) ((this.field959 + 1) % 4);
                if (this.field962[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field960[var10] = arg0;
        this.field997[var10] = arg1;
        this.field963[var10] = arg2;
        this.field964[var10] = arg3;
        this.field962[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bq.bz(IIIIIII)V")
    public final void method1590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class268 var7 = (class268) class268.field3387.method3885((long) arg0);
        class268 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3398.method4422(33, arg0);
            class268 var10 = new class268();
            if (var9 != null) {
                var10.method4707(new class190(var9));
            }
            class268.field3387.method3878(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class268 var11 = var8;
        class78 var12 = null;
        class78 var13 = null;
        int var14 = var8.field3392;
        int var15 = 0;
        for (class78 var16 = (class78) this.field995.method3936(); var16 != null; var16 = (class78) this.field995.method3937()) {
            var15++;
            if (var16.field1101.field3401 == var11.field3401) {
                var16.method1892(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1101.field3397 <= var11.field3397) {
                var12 = var16;
            }
            if (var16.field1101.field3392 > var14) {
                var13 = var16;
                var14 = var16.field1101.field3392;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class78 var17 = new class78(var11);
        if (var12 == null) {
            this.field995.method3930(var17);
        } else {
            class211.method3934(var17, var12);
        }
        var17.method1892(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3960();
        }
    }

    @ObfuscatedName("bq.bi(II)V")
    public final void method1591(int arg0) {
        class268 var2 = (class268) class268.field3387.method3885((long) arg0);
        class268 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3398.method4422(33, arg0);
            class268 var5 = new class268();
            if (var4 != null) {
                var5.method4707(new class190(var4));
            }
            class268.field3387.method3878(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class268 var6 = var3;
        for (class78 var7 = (class78) this.field995.method3936(); var7 != null; var7 = (class78) this.field995.method3937()) {
            if (var7.field1101 == var6) {
                var7.method3960();
                return;
            }
        }
    }
}
