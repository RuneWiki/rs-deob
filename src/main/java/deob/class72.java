package deob;

@ObfuscatedName("bx")
public abstract class class72 extends class201 {

    @ObfuscatedName("bx.an")
    public boolean field1023 = false;

    @ObfuscatedName("bx.aa")
    public int field1069;

    @ObfuscatedName("bx.ab")
    public int field1059;

    @ObfuscatedName("bx.ax")
    public int field1022;

    @ObfuscatedName("bx.au")
    public int field1024 = 1;

    @ObfuscatedName("bx.av")
    public int field1025;

    @ObfuscatedName("bx.as")
    public int field1030 = -1;

    @ObfuscatedName("bx.ao")
    public int field1052 = -1;

    @ObfuscatedName("bx.az")
    public int field1020 = -1;

    @ObfuscatedName("bx.ak")
    public int field1029 = -1;

    @ObfuscatedName("bx.aj")
    public int field1072 = -1;

    @ObfuscatedName("bx.at")
    public int field1046 = -1;

    @ObfuscatedName("bx.af")
    public int field1021 = -1;

    @ObfuscatedName("bx.ar")
    public int field1033 = -1;

    @ObfuscatedName("bx.ay")
    public String field1034 = null;

    @ObfuscatedName("bx.ap")
    public boolean field1035;

    @ObfuscatedName("bx.ah")
    public boolean field1080 = false;

    @ObfuscatedName("bx.ag")
    public int field1037 = 100;

    @ObfuscatedName("bx.ai")
    public int field1038 = 0;

    @ObfuscatedName("bx.ad")
    public int field1039 = 0;

    @ObfuscatedName("bx.aw")
    public byte field1040 = 0;

    @ObfuscatedName("bx.bt")
    public int[] field1036 = new int[4];

    @ObfuscatedName("bx.bk")
    public int[] field1048 = new int[4];

    @ObfuscatedName("bx.br")
    public int[] field1026 = new int[4];

    @ObfuscatedName("bx.by")
    public int[] field1041 = new int[4];

    @ObfuscatedName("bx.bv")
    public int[] field1045 = new int[4];

    @ObfuscatedName("bx.bf")
    public class298 field1078 = new class298();

    @ObfuscatedName("bx.bd")
    public int field1047 = -1;

    @ObfuscatedName("bx.bg")
    public boolean field1032 = false;

    @ObfuscatedName("bx.bw")
    public int field1049 = -1;

    @ObfuscatedName("bx.bo")
    public int field1050 = -1;

    @ObfuscatedName("bx.bm")
    public int field1042 = 0;

    @ObfuscatedName("bx.ba")
    public int field1044 = 0;

    @ObfuscatedName("bx.bu")
    public int field1053 = -1;

    @ObfuscatedName("bx.bl")
    public int field1054 = 0;

    @ObfuscatedName("bx.bj")
    public int field1055 = 0;

    @ObfuscatedName("bx.bq")
    public int field1056 = 0;

    @ObfuscatedName("bx.bn")
    public int field1057 = 0;

    @ObfuscatedName("bx.bb")
    public int field1058 = -1;

    @ObfuscatedName("bx.bs")
    public int field1028 = 0;

    @ObfuscatedName("bx.bx")
    public int field1060 = 0;

    @ObfuscatedName("bx.bz")
    public int field1061;

    @ObfuscatedName("bx.bi")
    public int field1062;

    @ObfuscatedName("bx.bc")
    public int field1063;

    @ObfuscatedName("bx.bp")
    public int field1064;

    @ObfuscatedName("bx.bh")
    public int field1065;

    @ObfuscatedName("bx.be")
    public int field1066;

    @ObfuscatedName("bx.cb")
    public int field1074;

    @ObfuscatedName("bx.cl")
    public int field1068;

    @ObfuscatedName("bx.ce")
    public int field1051;

    @ObfuscatedName("bx.cf")
    public int field1070 = 0;

    @ObfuscatedName("bx.cw")
    public int field1071 = 200;

    @ObfuscatedName("bx.ci")
    public int field1043;

    @ObfuscatedName("bx.cq")
    public int field1073 = 0;

    @ObfuscatedName("bx.cj")
    public int field1075 = 32;

    @ObfuscatedName("bx.cn")
    public int field1027 = 0;

    @ObfuscatedName("bx.cd")
    public int[] field1076 = new int[10];

    @ObfuscatedName("bx.co")
    public int[] field1077 = new int[10];

    @ObfuscatedName("bx.cm")
    public byte[] field1031 = new byte[10];

    @ObfuscatedName("bx.ct")
    public int field1079 = 0;

    @ObfuscatedName("bx.ch")
    public int field1067 = 0;

    @ObfuscatedName("bx.ac(I)V")
    public final void method1775() {
        this.field1027 = 0;
        this.field1067 = 0;
    }

    @ObfuscatedName("bx.u(B)Z")
    public boolean method1738() {
        return false;
    }

    @ObfuscatedName("bx.aw(IIIIIIB)V")
    public final void method1783(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1026[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class155 var13 = class155.method2725(arg0);
            var11 = var13.field1726;
            var12 = var13.field1717;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1026[0];
            } else if (var11 == 1) {
                var14 = this.field1048[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1026[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1026[var15];
                    }
                } else if (var11 == 1 && this.field1048[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1048[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1040 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1040;
                this.field1040 = (byte) ((this.field1040 + 1) % 4);
                if (this.field1026[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1036[var10] = arg0;
        this.field1048[var10] = arg1;
        this.field1041[var10] = arg2;
        this.field1045[var10] = arg3;
        this.field1026[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bx.bt(IIIIIII)V")
    public final void method1776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class144 var7 = class144.method1558(arg0);
        class77 var8 = null;
        class77 var9 = null;
        int var10 = var7.field1589;
        int var11 = 0;
        for (class77 var12 = (class77) this.field1078.method4758(); var12 != null; var12 = (class77) this.field1078.method4760()) {
            var11++;
            if (var12.field1129.field1579 == var7.field1579) {
                var12.method1851(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1129.field1583 <= var7.field1583) {
                var8 = var12;
            }
            if (var12.field1129.field1589 > var10) {
                var9 = var12;
                var10 = var12.field1129.field1589;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class77 var13 = new class77(var7);
        if (var8 == null) {
            this.field1078.method4756(var13);
        } else {
            class298.method4811(var13, var8);
        }
        var13.method1851(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method5447();
        }
    }

    @ObfuscatedName("bx.bk(II)V")
    public final void method1777(int arg0) {
        class144 var2 = class144.method1558(arg0);
        for (class77 var3 = (class77) this.field1078.method4758(); var3 != null; var3 = (class77) this.field1078.method4760()) {
            if (var3.field1129 == var2) {
                var3.method5447();
                return;
            }
        }
    }
}
