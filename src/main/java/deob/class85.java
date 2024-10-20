package deob;

@ObfuscatedName("ct")
public abstract class class85 extends class214 {

    @ObfuscatedName("ct.am")
    public int field1092;

    @ObfuscatedName("ct.ai")
    public int field1085;

    @ObfuscatedName("ct.ah")
    public int field1089;

    @ObfuscatedName("ct.as")
    public boolean field1087 = false;

    @ObfuscatedName("ct.at")
    public int field1088 = 1;

    @ObfuscatedName("ct.az")
    public int field1140;

    @ObfuscatedName("ct.ac")
    public int field1090 = -1;

    @ObfuscatedName("ct.ak")
    public int field1141 = -1;

    @ObfuscatedName("ct.ab")
    public int field1112 = -1;

    @ObfuscatedName("ct.ar")
    public int field1094 = -1;

    @ObfuscatedName("ct.ad")
    public int field1114 = -1;

    @ObfuscatedName("ct.an")
    public int field1095 = -1;

    @ObfuscatedName("ct.ax")
    public int field1096 = -1;

    @ObfuscatedName("ct.av")
    public int field1097 = -1;

    @ObfuscatedName("ct.ap")
    public String field1098 = null;

    @ObfuscatedName("ct.au")
    public boolean field1099;

    @ObfuscatedName("ct.aj")
    public boolean field1100 = false;

    @ObfuscatedName("ct.af")
    public int field1105 = 100;

    @ObfuscatedName("ct.aw")
    public int field1106 = 0;

    @ObfuscatedName("ct.ao")
    public int field1103 = 0;

    @ObfuscatedName("ct.ay")
    public byte field1104 = 0;

    @ObfuscatedName("ct.bg")
    public int[] field1093 = new int[4];

    @ObfuscatedName("ct.bl")
    public int[] field1124 = new int[4];

    @ObfuscatedName("ct.bx")
    public int[] field1107 = new int[4];

    @ObfuscatedName("ct.bd")
    public int[] field1108 = new int[4];

    @ObfuscatedName("ct.bt")
    public int[] field1109 = new int[4];

    @ObfuscatedName("ct.bf")
    public class311 field1110 = new class311();

    @ObfuscatedName("ct.bs")
    public int field1111 = -1;

    @ObfuscatedName("ct.bh")
    public boolean field1102 = false;

    @ObfuscatedName("ct.bw")
    public int field1113 = -1;

    @ObfuscatedName("ct.bm")
    public boolean field1128;

    @ObfuscatedName("ct.br")
    public int field1115 = -1;

    @ObfuscatedName("ct.bj")
    public int field1116 = 0;

    @ObfuscatedName("ct.bo")
    public int field1130 = 0;

    @ObfuscatedName("ct.bv")
    public int field1118 = -1;

    @ObfuscatedName("ct.bu")
    public int field1119 = 0;

    @ObfuscatedName("ct.bz")
    public int field1120 = 0;

    @ObfuscatedName("ct.bc")
    public int field1121 = 0;

    @ObfuscatedName("ct.bi")
    public int field1117 = 0;

    @ObfuscatedName("ct.bk")
    public int field1123 = -1;

    @ObfuscatedName("ct.bp")
    public int field1142 = 0;

    @ObfuscatedName("ct.bn")
    public int field1125 = 0;

    @ObfuscatedName("ct.be")
    public int field1126;

    @ObfuscatedName("ct.bb")
    public int field1127;

    @ObfuscatedName("ct.by")
    public int field1084;

    @ObfuscatedName("ct.ba")
    public int field1129;

    @ObfuscatedName("ct.bq")
    public int field1101;

    @ObfuscatedName("ct.ca")
    public int field1131;

    @ObfuscatedName("ct.cq")
    public int field1132;

    @ObfuscatedName("ct.ck")
    public int field1133;

    @ObfuscatedName("ct.ci")
    public int field1134;

    @ObfuscatedName("ct.cx")
    public int field1135 = 0;

    @ObfuscatedName("ct.cn")
    public int field1136 = 200;

    @ObfuscatedName("ct.ct")
    public int field1137;

    @ObfuscatedName("ct.cd")
    public int field1138 = 0;

    @ObfuscatedName("ct.cj")
    public int field1139 = 32;

    @ObfuscatedName("ct.cl")
    public int field1122 = 0;

    @ObfuscatedName("ct.cs")
    public int[] field1091 = new int[10];

    @ObfuscatedName("ct.ce")
    public int[] field1144 = new int[10];

    @ObfuscatedName("ct.cp")
    public byte[] field1143 = new byte[10];

    @ObfuscatedName("ct.cg")
    public int field1086 = 0;

    @ObfuscatedName("ct.cw")
    public int field1145 = 0;

    @ObfuscatedName("ct.cr")
    public int field1146 = -1;

    @ObfuscatedName("ct.bv(B)V")
    public final void method2054() {
        this.field1122 = 0;
        this.field1145 = 0;
    }

    @ObfuscatedName("ct.d(I)Z")
    public boolean method2005() {
        return false;
    }

    @ObfuscatedName("ct.bu(IIIIIIB)V")
    public final void method2056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1107[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class168 var13 = class168.method364(arg0);
            var11 = var13.field1817;
            var12 = var13.field1806;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1107[0];
            } else if (var11 == 1) {
                var14 = this.field1124[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1107[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1107[var15];
                    }
                } else if (var11 == 1 && this.field1124[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1124[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1104 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1104;
                this.field1104 = (byte) ((this.field1104 + 1) % 4);
                if (this.field1107[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1093[var10] = arg0;
        this.field1124[var10] = arg1;
        this.field1108[var10] = arg2;
        this.field1109[var10] = arg3;
        this.field1107[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("ct.bz(IIIIIII)V")
    public final void method2055(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class157 var7 = class157.method1676(arg0);
        class90 var8 = null;
        class90 var9 = null;
        int var10 = var7.field1665;
        int var11 = 0;
        for (class90 var12 = (class90) this.field1110.method5026(); var12 != null; var12 = (class90) this.field1110.method5028()) {
            var11++;
            if (var12.field1198.field1669 == var7.field1669) {
                var12.method2118(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1198.field1664 <= var7.field1664) {
                var8 = var12;
            }
            if (var12.field1198.field1665 > var10) {
                var9 = var12;
                var10 = var12.field1198.field1665;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class90 var13 = new class90(var7);
        if (var8 == null) {
            this.field1110.method5024(var13);
        } else {
            class311.method5025(var13, var8);
        }
        var13.method2118(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method5752();
        }
    }

    @ObfuscatedName("ct.bc(II)V")
    public final void method2063(int arg0) {
        class157 var2 = class157.method1676(arg0);
        for (class90 var3 = (class90) this.field1110.method5026(); var3 != null; var3 = (class90) this.field1110.method5028()) {
            if (var3.field1198 == var2) {
                var3.method5752();
                return;
            }
        }
    }
}
