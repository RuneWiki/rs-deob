package deob;

@ObfuscatedName("cx")
public abstract class class79 extends class145 {

    @ObfuscatedName("cx.an")
    public boolean field951 = false;

    @ObfuscatedName("cx.au")
    public int field991;

    @ObfuscatedName("cx.as")
    public int field939;

    @ObfuscatedName("cx.ae")
    public int field940;

    @ObfuscatedName("cx.ac")
    public int field942 = 1;

    @ObfuscatedName("cx.ak")
    public int field984;

    @ObfuscatedName("cx.av")
    public int field944 = -1;

    @ObfuscatedName("cx.aq")
    public int field945 = -1;

    @ObfuscatedName("cx.ah")
    public int field946 = -1;

    @ObfuscatedName("cx.am")
    public int field947 = -1;

    @ObfuscatedName("cx.aa")
    public int field948 = -1;

    @ObfuscatedName("cx.ao")
    public int field949 = -1;

    @ObfuscatedName("cx.ab")
    public int field950 = -1;

    @ObfuscatedName("cx.aw")
    public int field943 = -1;

    @ObfuscatedName("cx.ap")
    public String field952 = null;

    @ObfuscatedName("cx.ad")
    public boolean field953;

    @ObfuscatedName("cx.ai")
    public boolean field954 = false;

    @ObfuscatedName("cx.al")
    public int field992 = 100;

    @ObfuscatedName("cx.ay")
    public int field956 = 0;

    @ObfuscatedName("cx.af")
    public int field995 = 0;

    @ObfuscatedName("cx.az")
    public byte field998 = 0;

    @ObfuscatedName("cx.at")
    public int[] field967 = new int[4];

    @ObfuscatedName("cx.bh")
    public int[] field993 = new int[4];

    @ObfuscatedName("cx.by")
    public int[] field961 = new int[4];

    @ObfuscatedName("cx.bs")
    public int[] field962 = new int[4];

    @ObfuscatedName("cx.br")
    public int[] field963 = new int[4];

    @ObfuscatedName("cx.bl")
    public class272 field958 = new class272();

    @ObfuscatedName("cx.bx")
    public int field981 = -1;

    @ObfuscatedName("cx.bf")
    public boolean field966 = false;

    @ObfuscatedName("cx.bz")
    public int field960 = -1;

    @ObfuscatedName("cx.bm")
    public int field968 = -1;

    @ObfuscatedName("cx.bn")
    public int field965 = 0;

    @ObfuscatedName("cx.bd")
    public int field970 = 0;

    @ObfuscatedName("cx.bc")
    public int field971 = -1;

    @ObfuscatedName("cx.bi")
    public int field972 = 0;

    @ObfuscatedName("cx.bk")
    public int field973 = 0;

    @ObfuscatedName("cx.bw")
    public int field938 = 0;

    @ObfuscatedName("cx.bo")
    public int field975 = 0;

    @ObfuscatedName("cx.bj")
    public int field976 = -1;

    @ObfuscatedName("cx.bu")
    public int field977 = 0;

    @ObfuscatedName("cx.bt")
    public int field978 = 0;

    @ObfuscatedName("cx.bb")
    public int field979;

    @ObfuscatedName("cx.bv")
    public int field980;

    @ObfuscatedName("cx.bg")
    public int field982;

    @ObfuscatedName("cx.ba")
    public int field959;

    @ObfuscatedName("cx.bq")
    public int field983;

    @ObfuscatedName("cx.be")
    public int field957;

    @ObfuscatedName("cx.bp")
    public int field985;

    @ObfuscatedName("cx.cx")
    public int field974;

    @ObfuscatedName("cx.ci")
    public int field987;

    @ObfuscatedName("cx.cj")
    public int field988 = 0;

    @ObfuscatedName("cx.ca")
    public int field989 = 200;

    @ObfuscatedName("cx.cd")
    public int field990;

    @ObfuscatedName("cx.cm")
    public int field955 = 0;

    @ObfuscatedName("cx.cz")
    public int field941 = 32;

    @ObfuscatedName("cx.cc")
    public int field986 = 0;

    @ObfuscatedName("cx.ce")
    public int[] field994 = new int[10];

    @ObfuscatedName("cx.cb")
    public int[] field969 = new int[10];

    @ObfuscatedName("cx.cf")
    public byte[] field996 = new byte[10];

    @ObfuscatedName("cx.cr")
    public int field964 = 0;

    @ObfuscatedName("cx.ch")
    public int field997 = 0;

    @ObfuscatedName("cx.bh(I)V")
    public final void method1657() {
        this.field986 = 0;
        this.field997 = 0;
    }

    @ObfuscatedName("cx.m(I)Z")
    public boolean method1195() {
        return false;
    }

    @ObfuscatedName("cx.by(IIIIIII)V")
    public final void method1659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field961[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class264 var13 = class264.method3399(arg0);
            var11 = var13.field3374;
            var12 = var13.field3365;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field961[0];
            } else if (var11 == 1) {
                var14 = this.field993[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field961[var15] < var14) {
                        var10 = var15;
                        var14 = this.field961[var15];
                    }
                } else if (var11 == 1 && this.field993[var15] < var14) {
                    var10 = var15;
                    var14 = this.field993[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field998 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field998;
                this.field998 = (byte) ((this.field998 + 1) % 4);
                if (this.field961[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field967[var10] = arg0;
        this.field993[var10] = arg1;
        this.field962[var10] = arg2;
        this.field963[var10] = arg3;
        this.field961[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cx.bs(IIIIIII)V")
    public final void method1667(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class258 var7 = class258.method1678(arg0);
        class88 var8 = null;
        class88 var9 = null;
        int var10 = var7.field3321;
        int var11 = 0;
        for (class88 var12 = (class88) this.field958.method4467(); var12 != null; var12 = (class88) this.field958.method4466()) {
            var11++;
            if (var12.field1127.field3314 == var7.field3314) {
                var12.method1948(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1127.field3313 <= var7.field3313) {
                var8 = var12;
            }
            if (var12.field1127.field3321 > var10) {
                var9 = var12;
                var10 = var12.field1127.field3321;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class88 var13 = new class88(var7);
        if (var8 == null) {
            this.field958.method4462(var13);
        } else {
            class272.method4463(var13, var8);
        }
        var13.method1948(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3359();
        }
    }

    @ObfuscatedName("cx.br(II)V")
    public final void method1660(int arg0) {
        class258 var2 = class258.method1678(arg0);
        for (class88 var3 = (class88) this.field958.method4467(); var3 != null; var3 = (class88) this.field958.method4466()) {
            if (var3.field1127 == var2) {
                var3.method3359();
                return;
            }
        }
    }
}
