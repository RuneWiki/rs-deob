package deob;

@ObfuscatedName("cf")
public abstract class class85 extends class214 {

    @ObfuscatedName("cf.aw")
    public int field1119;

    @ObfuscatedName("cf.at")
    public int field1096;

    @ObfuscatedName("cf.as")
    public int field1095;

    @ObfuscatedName("cf.ae")
    public boolean field1094 = false;

    @ObfuscatedName("cf.av")
    public int field1138 = 1;

    @ObfuscatedName("cf.ak")
    public int field1112;

    @ObfuscatedName("cf.an")
    public int field1099 = -1;

    @ObfuscatedName("cf.ab")
    public int field1123 = -1;

    @ObfuscatedName("cf.au")
    public int field1101 = -1;

    @ObfuscatedName("cf.am")
    public int field1121 = -1;

    @ObfuscatedName("cf.ao")
    public int field1103 = -1;

    @ObfuscatedName("cf.ay")
    public int field1104 = -1;

    @ObfuscatedName("cf.aj")
    public int field1105 = -1;

    @ObfuscatedName("cf.ap")
    public int field1106 = -1;

    @ObfuscatedName("cf.ai")
    public String field1107 = null;

    @ObfuscatedName("cf.ac")
    public boolean field1108;

    @ObfuscatedName("cf.ag")
    public boolean field1109 = false;

    @ObfuscatedName("cf.ar")
    public int field1110 = 100;

    @ObfuscatedName("cf.az")
    public int field1137 = 0;

    @ObfuscatedName("cf.ah")
    public int field1133 = 0;

    @ObfuscatedName("cf.ax")
    public byte field1093 = 0;

    @ObfuscatedName("cf.bd")
    public int[] field1114 = new int[4];

    @ObfuscatedName("cf.bt")
    public int[] field1115 = new int[4];

    @ObfuscatedName("cf.bf")
    public int[] field1116 = new int[4];

    @ObfuscatedName("cf.bp")
    public int[] field1117 = new int[4];

    @ObfuscatedName("cf.bl")
    public int[] field1118 = new int[4];

    @ObfuscatedName("cf.bc")
    public class311 field1098 = new class311();

    @ObfuscatedName("cf.br")
    public int field1120 = -1;

    @ObfuscatedName("cf.bw")
    public boolean field1144 = false;

    @ObfuscatedName("cf.bh")
    public int field1097 = -1;

    @ObfuscatedName("cf.bj")
    public int field1143 = -1;

    @ObfuscatedName("cf.be")
    public int field1124 = 0;

    @ObfuscatedName("cf.bq")
    public int field1149 = 0;

    @ObfuscatedName("cf.bu")
    public int field1130 = -1;

    @ObfuscatedName("cf.bn")
    public int field1127 = 0;

    @ObfuscatedName("cf.bk")
    public int field1128 = 0;

    @ObfuscatedName("cf.bm")
    public int field1129 = 0;

    @ObfuscatedName("cf.bb")
    public int field1100 = 0;

    @ObfuscatedName("cf.bx")
    public int field1131 = -1;

    @ObfuscatedName("cf.ba")
    public int field1132 = 0;

    @ObfuscatedName("cf.bg")
    public int field1125 = 0;

    @ObfuscatedName("cf.bo")
    public int field1134;

    @ObfuscatedName("cf.bv")
    public int field1135;

    @ObfuscatedName("cf.bi")
    public int field1136;

    @ObfuscatedName("cf.bs")
    public int field1122;

    @ObfuscatedName("cf.by")
    public int field1142;

    @ObfuscatedName("cf.bz")
    public int field1111;

    @ObfuscatedName("cf.cw")
    public int field1140;

    @ObfuscatedName("cf.ci")
    public int field1141;

    @ObfuscatedName("cf.cl")
    public int field1102;

    @ObfuscatedName("cf.cu")
    public int field1139 = 0;

    @ObfuscatedName("cf.co")
    public int field1113 = 200;

    @ObfuscatedName("cf.cb")
    public int field1145;

    @ObfuscatedName("cf.cf")
    public int field1146 = 0;

    @ObfuscatedName("cf.cc")
    public int field1147 = 32;

    @ObfuscatedName("cf.cn")
    public int field1148 = 0;

    @ObfuscatedName("cf.ch")
    public int[] field1126 = new int[10];

    @ObfuscatedName("cf.cx")
    public int[] field1150 = new int[10];

    @ObfuscatedName("cf.cv")
    public byte[] field1151 = new byte[10];

    @ObfuscatedName("cf.cr")
    public int field1152 = 0;

    @ObfuscatedName("cf.cq")
    public int field1153 = 0;

    @ObfuscatedName("cf.br(B)V")
    public final void method2016() {
        this.field1148 = 0;
        this.field1153 = 0;
    }

    @ObfuscatedName("cf.q(I)Z")
    public boolean method1993() {
        return false;
    }

    @ObfuscatedName("cf.bw(IIIIIIB)V")
    public final void method2017(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1116[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class168 var13 = class168.method2013(arg0);
            var11 = var13.field1814;
            var12 = var13.field1805;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1116[0];
            } else if (var11 == 1) {
                var14 = this.field1115[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1116[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1116[var15];
                    }
                } else if (var11 == 1 && this.field1115[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1115[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1093 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1093;
                this.field1093 = (byte) ((this.field1093 + 1) % 4);
                if (this.field1116[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1114[var10] = arg0;
        this.field1115[var10] = arg1;
        this.field1117[var10] = arg2;
        this.field1118[var10] = arg3;
        this.field1116[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cf.bh(IIIIIIB)V")
    public final void method2018(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class157 var7 = class157.method13(arg0);
        class90 var8 = null;
        class90 var9 = null;
        int var10 = var7.field1674;
        int var11 = 0;
        for (class90 var12 = (class90) this.field1098.method5007(); var12 != null; var12 = (class90) this.field1098.method5009()) {
            var11++;
            if (var12.field1203.field1671 == var7.field1671) {
                var12.method2091(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1203.field1670 <= var7.field1670) {
                var8 = var12;
            }
            if (var12.field1203.field1674 > var10) {
                var9 = var12;
                var10 = var12.field1203.field1674;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class90 var13 = new class90(var7);
        if (var8 == null) {
            this.field1098.method5005(var13);
        } else {
            class311.method5031(var13, var8);
        }
        var13.method2091(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method5732();
        }
    }

    @ObfuscatedName("cf.bj(II)V")
    public final void method2019(int arg0) {
        class157 var2 = class157.method13(arg0);
        for (class90 var3 = (class90) this.field1098.method5007(); var3 != null; var3 = (class90) this.field1098.method5009()) {
            if (var3.field1203 == var2) {
                var3.method5732();
                return;
            }
        }
    }
}
