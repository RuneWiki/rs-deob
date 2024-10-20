package deob;

@ObfuscatedName("be")
public abstract class class75 extends class139 {

    @ObfuscatedName("be.ar")
    public int field1129;

    @ObfuscatedName("be.an")
    public boolean field1118 = false;

    @ObfuscatedName("be.af")
    public int field1116;

    @ObfuscatedName("be.as")
    public int field1117;

    @ObfuscatedName("be.ax")
    public int field1128 = 1;

    @ObfuscatedName("be.ak")
    public int field1138 = -1;

    @ObfuscatedName("be.aw")
    public int field1121 = -1;

    @ObfuscatedName("be.ai")
    public int field1122 = -1;

    @ObfuscatedName("be.ab")
    public int field1157 = -1;

    @ObfuscatedName("be.am")
    public int field1124 = -1;

    @ObfuscatedName("be.ah")
    public int field1125 = -1;

    @ObfuscatedName("be.ag")
    public int field1126 = -1;

    @ObfuscatedName("be.az")
    public int field1127 = -1;

    @ObfuscatedName("be.ae")
    public String field1139 = null;

    @ObfuscatedName("be.ao")
    public boolean field1120;

    @ObfuscatedName("be.av")
    public boolean field1130 = false;

    @ObfuscatedName("be.aj")
    public int field1131 = 100;

    @ObfuscatedName("be.ap")
    public int field1132 = 0;

    @ObfuscatedName("be.au")
    public int field1133 = 0;

    @ObfuscatedName("be.aa")
    public byte field1134 = 0;

    @ObfuscatedName("be.at")
    public int[] field1135 = new int[4];

    @ObfuscatedName("be.ac")
    public int[] field1136 = new int[4];

    @ObfuscatedName("be.bj")
    public int[] field1137 = new int[4];

    @ObfuscatedName("be.bo")
    public int[] field1172 = new int[4];

    @ObfuscatedName("be.br")
    public int[] field1149 = new int[4];

    @ObfuscatedName("be.bm")
    public class203 field1140 = new class203();

    @ObfuscatedName("be.bf")
    public int field1156 = -1;

    @ObfuscatedName("be.bh")
    public boolean field1142 = false;

    @ObfuscatedName("be.bt")
    public int field1143 = -1;

    @ObfuscatedName("be.bi")
    public int field1144 = -1;

    @ObfuscatedName("be.bq")
    public int field1145 = 0;

    @ObfuscatedName("be.bn")
    public int field1146 = 0;

    @ObfuscatedName("be.bv")
    public int field1147 = -1;

    @ObfuscatedName("be.bp")
    public int field1171 = 0;

    @ObfuscatedName("be.ba")
    public int field1141 = 0;

    @ObfuscatedName("be.bk")
    public int field1115 = 0;

    @ObfuscatedName("be.bl")
    public int field1151 = 0;

    @ObfuscatedName("be.bc")
    public int field1152 = -1;

    @ObfuscatedName("be.bz")
    public int field1153 = 0;

    @ObfuscatedName("be.bx")
    public int field1154 = 0;

    @ObfuscatedName("be.bd")
    public int field1155;

    @ObfuscatedName("be.by")
    public int field1169;

    @ObfuscatedName("be.bw")
    public int field1163;

    @ObfuscatedName("be.bu")
    public int field1158;

    @ObfuscatedName("be.be")
    public int field1159;

    @ObfuscatedName("be.bb")
    public int field1160;

    @ObfuscatedName("be.bs")
    public int field1161;

    @ObfuscatedName("be.bg")
    public int field1150;

    @ObfuscatedName("be.cw")
    public int field1119;

    @ObfuscatedName("be.cc")
    public int field1164 = 0;

    @ObfuscatedName("be.co")
    public int field1165 = 200;

    @ObfuscatedName("be.ce")
    public int field1148;

    @ObfuscatedName("be.ch")
    public int field1167 = 0;

    @ObfuscatedName("be.cd")
    public int field1168 = 32;

    @ObfuscatedName("be.cv")
    public int field1123 = 0;

    @ObfuscatedName("be.ci")
    public int[] field1170 = new int[10];

    @ObfuscatedName("be.cj")
    public int[] field1174 = new int[10];

    @ObfuscatedName("be.cn")
    public byte[] field1166 = new byte[10];

    @ObfuscatedName("be.cp")
    public int field1173 = 0;

    @ObfuscatedName("be.cg")
    public int field1162 = 0;

    @ObfuscatedName("be.at(I)V")
    public final void method1487() {
        this.field1123 = 0;
        this.field1162 = 0;
    }

    @ObfuscatedName("be.l(B)Z")
    public boolean method1046() {
        return false;
    }

    @ObfuscatedName("be.ac(IIIIIII)V")
    public final void method1484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1137[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class266 var13 = class266.method176(arg0);
            var11 = var13.field3509;
            var12 = var13.field3500;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1137[0];
            } else if (var11 == 1) {
                var14 = this.field1136[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1137[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1137[var15];
                    }
                } else if (var11 == 1 && this.field1136[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1136[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1134 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1134;
                this.field1134 = (byte) ((this.field1134 + 1) % 4);
                if (this.field1137[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1135[var10] = arg0;
        this.field1136[var10] = arg1;
        this.field1172[var10] = arg2;
        this.field1149[var10] = arg3;
        this.field1137[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("be.bj(IIIIIII)V")
    public final void method1485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class260 var7 = class260.method1548(arg0);
        class83 var8 = null;
        class83 var9 = null;
        int var10 = var7.field3446;
        int var11 = 0;
        for (class83 var12 = (class83) this.field1140.method3723(); var12 != null; var12 = (class83) this.field1140.method3705()) {
            var11++;
            if (var12.field1266.field3449 == var7.field3449) {
                var12.method1720(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var12.field1266.field3450 <= var7.field3450) {
                var8 = var12;
            }
            if (var12.field1266.field3446 > var10) {
                var9 = var12;
                var10 = var12.field1266.field3446;
            }
        }
        if (var9 == null && var11 >= 4) {
            return;
        }
        class83 var13 = new class83(var7);
        if (var8 == null) {
            this.field1140.method3724(var13);
        } else {
            class203.method3709(var13, var8);
        }
        var13.method1720(arg1 + arg3, arg4, arg5, arg2);
        if (var11 >= 4) {
            var9.method3740();
        }
    }

    @ObfuscatedName("be.bo(II)V")
    public final void method1489(int arg0) {
        class260 var2 = class260.method1548(arg0);
        for (class83 var3 = (class83) this.field1140.method3723(); var3 != null; var3 = (class83) this.field1140.method3705()) {
            if (var3.field1266 == var2) {
                var3.method3740();
                return;
            }
        }
    }
}
