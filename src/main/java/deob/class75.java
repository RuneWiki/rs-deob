package deob;

@ObfuscatedName("bx")
public abstract class class75 extends class139 {

    @ObfuscatedName("bx.ar")
    public int field1152;

    @ObfuscatedName("bx.ay")
    public int field1117;

    @ObfuscatedName("bx.ax")
    public int field1100;

    @ObfuscatedName("bx.ae")
    public boolean field1133 = false;

    @ObfuscatedName("bx.ah")
    public int field1128 = 1;

    @ObfuscatedName("bx.ai")
    public int field1103 = -1;

    @ObfuscatedName("bx.au")
    public int field1107 = -1;

    @ObfuscatedName("bx.am")
    public int field1150 = -1;

    @ObfuscatedName("bx.af")
    public int field1106 = -1;

    @ObfuscatedName("bx.an")
    public int field1145 = -1;

    @ObfuscatedName("bx.ag")
    public int field1105 = -1;

    @ObfuscatedName("bx.av")
    public int field1109 = -1;

    @ObfuscatedName("bx.aw")
    public int field1110 = -1;

    @ObfuscatedName("bx.ad")
    public String field1111 = null;

    @ObfuscatedName("bx.ab")
    public boolean field1104;

    @ObfuscatedName("bx.aq")
    public boolean field1131 = false;

    @ObfuscatedName("bx.ac")
    public int field1114 = 100;

    @ObfuscatedName("bx.ak")
    public int field1115 = 0;

    @ObfuscatedName("bx.az")
    public int field1116 = 0;

    @ObfuscatedName("bx.at")
    public byte field1129 = 0;

    @ObfuscatedName("bx.aj")
    public int[] field1112 = new int[4];

    @ObfuscatedName("bx.al")
    public int[] field1119 = new int[4];

    @ObfuscatedName("bx.bw")
    public int[] field1120 = new int[4];

    @ObfuscatedName("bx.bt")
    public int[] field1138 = new int[4];

    @ObfuscatedName("bx.by")
    public int[] field1122 = new int[4];

    @ObfuscatedName("bx.bq")
    public class203 field1123 = new class203();

    @ObfuscatedName("bx.bf")
    public int field1113 = -1;

    @ObfuscatedName("bx.bp")
    public boolean field1125 = false;

    @ObfuscatedName("bx.bn")
    public int field1126 = -1;

    @ObfuscatedName("bx.bb")
    public int field1127 = -1;

    @ObfuscatedName("bx.bm")
    public int field1118 = 0;

    @ObfuscatedName("bx.bg")
    public int field1156 = 0;

    @ObfuscatedName("bx.bz")
    public int field1130 = -1;

    @ObfuscatedName("bx.bu")
    public int field1098 = 0;

    @ObfuscatedName("bx.br")
    public int field1124 = 0;

    @ObfuscatedName("bx.bs")
    public int field1101 = 0;

    @ObfuscatedName("bx.be")
    public int field1134 = 0;

    @ObfuscatedName("bx.bk")
    public int field1135 = -1;

    @ObfuscatedName("bx.bd")
    public int field1136 = 0;

    @ObfuscatedName("bx.bl")
    public int field1132 = 0;

    @ObfuscatedName("bx.bo")
    public int field1147;

    @ObfuscatedName("bx.bc")
    public int field1139;

    @ObfuscatedName("bx.bv")
    public int field1121;

    @ObfuscatedName("bx.ba")
    public int field1141;

    @ObfuscatedName("bx.bx")
    public int field1142;

    @ObfuscatedName("bx.bj")
    public int field1143;

    @ObfuscatedName("bx.bi")
    public int field1144;

    @ObfuscatedName("bx.bh")
    public int field1108;

    @ObfuscatedName("bx.cx")
    public int field1146;

    @ObfuscatedName("bx.cv")
    public int field1102 = 0;

    @ObfuscatedName("bx.cc")
    public int field1148 = 200;

    @ObfuscatedName("bx.cg")
    public int field1149;

    @ObfuscatedName("bx.cw")
    public int field1140 = 0;

    @ObfuscatedName("bx.ch")
    public int field1151 = 32;

    @ObfuscatedName("bx.ca")
    public int field1099 = 0;

    @ObfuscatedName("bx.ct")
    public int[] field1153 = new int[10];

    @ObfuscatedName("bx.cl")
    public int[] field1154 = new int[10];

    @ObfuscatedName("bx.ci")
    public byte[] field1155 = new byte[10];

    @ObfuscatedName("bx.cu")
    public int field1137 = 0;

    @ObfuscatedName("bx.co")
    public int field1157 = 0;

    @ObfuscatedName("bx.at(B)V")
    public final void method1467() {
        this.field1099 = 0;
        this.field1157 = 0;
    }

    @ObfuscatedName("bx.q(I)Z")
    public boolean method1048() {
        return false;
    }

    @ObfuscatedName("bx.aj(IIIIIIB)V")
    public final void method1466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = true;
        boolean var8 = true;
        for (int var9 = 0; var9 < 4; var9++) {
            if (this.field1120[var9] > arg4) {
                var7 = false;
            } else {
                var8 = false;
            }
        }
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (arg0 >= 0) {
            class266 var13 = class266.method2942(arg0);
            var11 = var13.field3490;
            var12 = var13.field3488;
        }
        if (var8) {
            if (var11 == -1) {
                return;
            }
            var10 = 0;
            int var14 = 0;
            if (var11 == 0) {
                var14 = this.field1120[0];
            } else if (var11 == 1) {
                var14 = this.field1119[0];
            }
            for (int var15 = 1; var15 < 4; var15++) {
                if (var11 == 0) {
                    if (this.field1120[var15] < var14) {
                        var10 = var15;
                        var14 = this.field1120[var15];
                    }
                } else if (var11 == 1 && this.field1119[var15] < var14) {
                    var10 = var15;
                    var14 = this.field1119[var15];
                }
            }
            if (var11 == 1 && var14 >= arg1) {
                return;
            }
        } else {
            if (var7) {
                this.field1129 = 0;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = this.field1129;
                this.field1129 = (byte) ((this.field1129 + 1) % 4);
                if (this.field1120[var17] <= arg4) {
                    var10 = var17;
                    break;
                }
            }
        }
        if (var10 < 0) {
            return;
        }
        this.field1112[var10] = arg0;
        this.field1119[var10] = arg1;
        this.field1138[var10] = arg2;
        this.field1122[var10] = arg3;
        this.field1120[var10] = arg4 + var12 + arg5;
    }

    @ObfuscatedName("bx.al(IIIIIII)V")
    public final void method1480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class260 var7 = (class260) class260.field3422.method3504((long) arg0);
        class260 var8;
        if (var7 == null) {
            byte[] var9 = Statics.field3424.method4032(33, arg0);
            class260 var10 = new class260();
            if (var9 != null) {
                var10.method4311(new class185(var9));
            }
            class260.field3422.method3506(var10, (long) arg0);
            var8 = var10;
        } else {
            var8 = var7;
        }
        class260 var11 = var8;
        class83 var12 = null;
        class83 var13 = null;
        int var14 = var8.field3431;
        int var15 = 0;
        for (class83 var16 = (class83) this.field1123.method3556(); var16 != null; var16 = (class83) this.field1123.method3537()) {
            var15++;
            if (var16.field1250.field3433 == var11.field3433) {
                var16.method1687(arg1 + arg3, arg4, arg5, arg2);
                return;
            }
            if (var16.field1250.field3426 <= var11.field3426) {
                var12 = var16;
            }
            if (var16.field1250.field3431 > var14) {
                var13 = var16;
                var14 = var16.field1250.field3431;
            }
        }
        if (var13 == null && var15 >= 4) {
            return;
        }
        class83 var17 = new class83(var11);
        if (var12 == null) {
            this.field1123.method3532(var17);
        } else {
            class203.method3542(var17, var12);
        }
        var17.method1687(arg1 + arg3, arg4, arg5, arg2);
        if (var15 >= 4) {
            var13.method3561();
        }
    }

    @ObfuscatedName("bx.bw(IB)V")
    public final void method1473(int arg0) {
        class260 var2 = class260.method1465(arg0);
        for (class83 var3 = (class83) this.field1123.method3556(); var3 != null; var3 = (class83) this.field1123.method3537()) {
            if (var3.field1250 == var2) {
                var3.method3561();
                return;
            }
        }
    }
}
