package deob;

@ObfuscatedName("cd")
public abstract class class85 extends class214 {

    @ObfuscatedName("cd.ah")
    public int field1140;

    @ObfuscatedName("cd.ay")
    public int field1124;

    @ObfuscatedName("cd.al")
    public int field1133;

    @ObfuscatedName("cd.ao")
    public boolean field1144 = false;

    @ObfuscatedName("cd.au")
    public int field1110 = 1;

    @ObfuscatedName("cd.aa")
    public int field1111;

    @ObfuscatedName("cd.ag")
    public int field1112 = -1;

    @ObfuscatedName("cd.aq")
    public int field1113 = -1;

    @ObfuscatedName("cd.ar")
    public int field1153 = -1;

    @ObfuscatedName("cd.ac")
    public int field1115 = -1;

    @ObfuscatedName("cd.at")
    public int field1116 = -1;

    @ObfuscatedName("cd.ax")
    public int field1117 = -1;

    @ObfuscatedName("cd.an")
    public int field1118 = -1;

    @ObfuscatedName("cd.av")
    public int field1119 = -1;

    @ObfuscatedName("cd.ap")
    public String field1120 = null;

    @ObfuscatedName("cd.aj")
    public boolean field1121;

    @ObfuscatedName("cd.am")
    public boolean field1122 = false;

    @ObfuscatedName("cd.aw")
    public int field1123 = 100;

    @ObfuscatedName("cd.az")
    public int field1137 = 0;

    @ObfuscatedName("cd.ae")
    public int field1108 = 0;

    @ObfuscatedName("cd.af")
    public byte field1141 = 0;

    @ObfuscatedName("cd.bz")
    public int[] field1107 = new int[4];

    @ObfuscatedName("cd.bt")
    public int[] field1128 = new int[4];

    @ObfuscatedName("cd.bg")
    public int[] field1129 = new int[4];

    @ObfuscatedName("cd.bf")
    public int[] field1154 = new int[4];

    @ObfuscatedName("cd.bj")
    public int[] field1131 = new int[4];

    @ObfuscatedName("cd.bo")
    public class311 field1155 = new class311();

    @ObfuscatedName("cd.bx")
    public int field1160 = -1;

    @ObfuscatedName("cd.bu")
    public boolean field1134 = false;

    @ObfuscatedName("cd.bc")
    public int field1135 = -1;

    @ObfuscatedName("cd.ba")
    public int field1136 = -1;

    @ObfuscatedName("cd.bm")
    public int field1132 = 0;

    @ObfuscatedName("cd.bv")
    public int field1138 = 0;

    @ObfuscatedName("cd.bs")
    public int field1139 = -1;

    @ObfuscatedName("cd.bd")
    public int field1164 = 0;

    @ObfuscatedName("cd.bb")
    public int field1151 = 0;

    @ObfuscatedName("cd.bh")
    public int field1142 = 0;

    @ObfuscatedName("cd.bi")
    public int field1143 = 0;

    @ObfuscatedName("cd.bq")
    public int field1125 = -1;

    @ObfuscatedName("cd.by")
    public int field1145 = 0;

    @ObfuscatedName("cd.be")
    public int field1109 = 0;

    @ObfuscatedName("cd.bw")
    public int field1106;

    @ObfuscatedName("cd.bn")
    public int field1148;

    @ObfuscatedName("cd.bl")
    public int field1149;

    @ObfuscatedName("cd.bk")
    public int field1150;

    @ObfuscatedName("cd.bp")
    public int field1127;

    @ObfuscatedName("cd.br")
    public int field1126;

    @ObfuscatedName("cd.ca")
    public int field1146;

    @ObfuscatedName("cd.ct")
    public int field1166;

    @ObfuscatedName("cd.cy")
    public int field1152;

    @ObfuscatedName("cd.cg")
    public int field1156 = 0;

    @ObfuscatedName("cd.ci")
    public int field1157 = 200;

    @ObfuscatedName("cd.cx")
    public int field1158;

    @ObfuscatedName("cd.cd")
    public int field1159 = 0;

    @ObfuscatedName("cd.cp")
    public int field1147 = 32;

    @ObfuscatedName("cd.cl")
    public int field1161 = 0;

    @ObfuscatedName("cd.cr")
    public int[] field1162 = new int[10];

    @ObfuscatedName("cd.cq")
    public int[] field1163 = new int[10];

    @ObfuscatedName("cd.cs")
    public byte[] field1114 = new byte[10];

    @ObfuscatedName("cd.cw")
    public int field1165 = 0;

    @ObfuscatedName("cd.ce")
    public int field1130 = 0;

    @ObfuscatedName("cd.bj(I)V")
    public final void method2044() {
        this.field1161 = 0;
        this.field1130 = 0;
    }

    @ObfuscatedName("cd.b(I)Z")
    public boolean method1999() {
        return false;
    }

    @ObfuscatedName("cd.bo(IIIIIIB)V")
    public final void method2046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1129[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class168 var13 = class168.method1966(arg0);
            var11 = var13.field1816;
            var12 = var13.field1807;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1129[0];
            } else if (var11 == 1) {
                var14 = this.field1128[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1129[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1129[var15];
                    }
                } else if (var11 == 1 && this.field1128[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1128[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1141 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1141;
                this.field1141 = (byte) ((this.field1141 + 1) % 4);
                if (this.field1129[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1107[var10] = arg0;
        this.field1128[var10] = arg1;
        this.field1154[var10] = arg2;
        this.field1131[var10] = arg3;
        this.field1129[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("cd.bx(IIIIIII)V")
    public final void method2047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class157 var7 = (class157) class157.field1675.method4223((long) arg0);
        class157 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field1683.method4756(33, arg0);
            class157 var10 = new class157();
            if (var9 != null) {
                var10.method2724(new class401(var9));
            }
            class157.field1675.method4225(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class157 var11 = var8;
        class90 var12 = null;
        class90 var13 = null;
        int var14 = var8.field1678;
        int var15 = 0;
        for (class90 var16 = (class90) this.field1155.method5074(); var16 != null; var16 = (class90) this.field1155.method5094()) {
            var15++;
            if (var16.field1216.field1676 == var11.field1676) {
                var16.method2116(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1216.field1685 <= var11.field1685) {
                var12 = var16;
            }
            if (var16.field1216.field1678 > var14) {
                var13 = var16;
                var14 = var16.field1216.field1678;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class90 var17 = new class90(var11);
        if (var12 == null) {
            this.field1155.method5072(var17);
        } else {
            class311.method5073(var17, var12);
        }
        var17.method2116(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method5775();
        }
    }

    @ObfuscatedName("cd.bu(IB)V")
    public final void method2048(int arg0) {
        class157 var2 = (class157) class157.field1675.method4223((long) arg0);
        class157 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field1683.method4756(33, arg0);
            class157 var5 = new class157();
            if (var4 != null) {
                var5.method2724(new class401(var4));
            }
            class157.field1675.method4225(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        class157 var6 = var3;
        for (class90 var7 = (class90) this.field1155.method5074(); var7 != null; var7 = (class90) this.field1155.method5094()) {
            if (var7.field1216 == var6) {
                var7.method5775();
                return;
            }
        }
    }
}
