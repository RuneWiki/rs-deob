package deob;

@ObfuscatedName("bc")
public abstract class class65 extends class130 {

    @ObfuscatedName("bc.an")
    public boolean field942 = false;

    @ObfuscatedName("bc.ae")
    public int field954;

    @ObfuscatedName("bc.ac")
    public int field1000;

    @ObfuscatedName("bc.az")
    public int field941;

    @ObfuscatedName("bc.aj")
    public int field965 = 1;

    @ObfuscatedName("bc.ag")
    public int field944;

    @ObfuscatedName("bc.ab")
    public int field945 = -1;

    @ObfuscatedName("bc.ar")
    public int field946 = -1;

    @ObfuscatedName("bc.at")
    public int field958 = -1;

    @ObfuscatedName("bc.as")
    public int field943 = -1;

    @ObfuscatedName("bc.aa")
    public int field949 = -1;

    @ObfuscatedName("bc.ai")
    public int field950 = -1;

    @ObfuscatedName("bc.ad")
    public int field951 = -1;

    @ObfuscatedName("bc.al")
    public int field952 = -1;

    @ObfuscatedName("bc.ak")
    public String field969 = null;

    @ObfuscatedName("bc.ao")
    public boolean field959;

    @ObfuscatedName("bc.am")
    public boolean field955 = false;

    @ObfuscatedName("bc.ay")
    public int field982 = 100;

    @ObfuscatedName("bc.ah")
    public int field957 = 0;

    @ObfuscatedName("bc.ap")
    public int field975 = 0;

    @ObfuscatedName("bc.au")
    public byte field939 = 0;

    @ObfuscatedName("bc.aq")
    public int[] field993 = new int[4];

    @ObfuscatedName("bc.bs")
    public int[] field961 = new int[4];

    @ObfuscatedName("bc.bz")
    public int[] field962 = new int[4];

    @ObfuscatedName("bc.ba")
    public int[] field963 = new int[4];

    @ObfuscatedName("bc.bi")
    public int[] field964 = new int[4];

    @ObfuscatedName("bc.bp")
    public class206 field988 = new class206();

    @ObfuscatedName("bc.bv")
    public int field966 = -1;

    @ObfuscatedName("bc.bq")
    public boolean field967 = false;

    @ObfuscatedName("bc.bw")
    public int field968 = -1;

    @ObfuscatedName("bc.bf")
    public int field973 = -1;

    @ObfuscatedName("bc.bk")
    public int field970 = 0;

    @ObfuscatedName("bc.bb")
    public int field971 = 0;

    @ObfuscatedName("bc.bl")
    public int field972 = -1;

    @ObfuscatedName("bc.bc")
    public int field987 = 0;

    @ObfuscatedName("bc.bg")
    public int field990 = 0;

    @ObfuscatedName("bc.be")
    public int field999 = 0;

    @ObfuscatedName("bc.bj")
    public int field976 = 0;

    @ObfuscatedName("bc.bh")
    public int field977 = -1;

    @ObfuscatedName("bc.by")
    public int field994 = 0;

    @ObfuscatedName("bc.bm")
    public int field979 = 0;

    @ObfuscatedName("bc.bx")
    public int field980;

    @ObfuscatedName("bc.bd")
    public int field981;

    @ObfuscatedName("bc.bo")
    public int field984;

    @ObfuscatedName("bc.bn")
    public int field983;

    @ObfuscatedName("bc.bu")
    public int field996;

    @ObfuscatedName("bc.br")
    public int field985;

    @ObfuscatedName("bc.bt")
    public int field986;

    @ObfuscatedName("bc.cb")
    public int field978;

    @ObfuscatedName("bc.ce")
    public int field998;

    @ObfuscatedName("bc.cg")
    public int field989 = 0;

    @ObfuscatedName("bc.cm")
    public int field947 = 200;

    @ObfuscatedName("bc.cl")
    public int field991;

    @ObfuscatedName("bc.cr")
    public int field992 = 0;

    @ObfuscatedName("bc.cd")
    public int field948 = 32;

    @ObfuscatedName("bc.cc")
    public int field940 = 0;

    @ObfuscatedName("bc.cx")
    public int[] field995 = new int[10];

    @ObfuscatedName("bc.cy")
    public int[] field953 = new int[10];

    @ObfuscatedName("bc.ca")
    public byte[] field997 = new byte[10];

    @ObfuscatedName("bc.cf")
    public int field956 = 0;

    @ObfuscatedName("bc.cn")
    public int field960 = 0;

    @ObfuscatedName("bc.aq(B)V")
    public final void method1558() {
        this.field940 = 0;
        this.field960 = 0;
    }

    @ObfuscatedName("bc.h(I)Z")
    public boolean method1104() {
        return false;
    }

    @ObfuscatedName("bc.bs(IIIIIII)V")
    public final void method1568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
            class270 var13 = class270.method4179(arg0);
            var11 = var13.field3446;
            var12 = var13.field3429;
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
                var14 = this.field961[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field962[var15] < var14) {
                        var10 = var15;
                        var14 = this.field962[var15];
                    }
                } else if (var11 == 1 && this.field961[var15] < var14) {
                    var10 = var15;
                    var14 = this.field961[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field939 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field939;
                this.field939 = (byte) ((this.field939 + 1) % 4);
                if (this.field962[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field993[var10] = arg0;
        this.field961[var10] = arg1;
        this.field963[var10] = arg2;
        this.field964[var10] = arg3;
        this.field962[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bc.bz(IIIIIII)V")
    public final void method1570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class264 var7 = class264.method635(arg0);
        class73 var8 = null;
        class73 var9 = null;
        int var10 = var7.field3387;
        int var11 = 0;
        for (class73 var12 = (class73) this.field988.method3931(); var12 != null; var12 = (class73) this.field988.method3929()) {
            var11++;
            if (var12.field1098.field3384 == var7.field3384) {
                var12.method1849(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1098.field3392 <= var7.field3392) {
                var8 = var12;
            }
            if (var12.field1098.field3387 > var10) {
                var9 = var12;
                var10 = var12.field1098.field3387;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class73 var13 = new class73(var7);
        if (var8 == null) {
            this.field988.method3927(var13);
        } else {
            class206.method3926(var13, var8);
        }
        var13.method1849(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3952();
        }
    }

    @ObfuscatedName("bc.ba(II)V")
    public final void method1561(int arg0) {
        class264 var2 = class264.method635(arg0);
        for (class73 var3 = (class73) this.field988.method3931(); var3 != null; var3 = (class73) this.field988.method3929()) {
            if (var3.field1098 == var2) {
                var3.method3952();
                return;
            }
        }
    }
}
