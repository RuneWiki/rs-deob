package deob;

@ObfuscatedName("cd")
public final class class80 extends class128 {

    @ObfuscatedName("cd.z")
    public int field1121;

    @ObfuscatedName("cd.w")
    public int field1122;

    @ObfuscatedName("cd.s")
    public int field1123;

    @ObfuscatedName("cd.l")
    public int field1131;

    @ObfuscatedName("cd.u")
    public int field1125;

    @ObfuscatedName("cd.q")
    public int field1124;

    @ObfuscatedName("cd.k")
    public int field1127;

    @ObfuscatedName("cd.i")
    public int field1128;

    @ObfuscatedName("cd.x")
    public int field1129;

    @ObfuscatedName("cd.e")
    public int field1133;

    @ObfuscatedName("cd.p")
    public int field1136;

    @ObfuscatedName("cd.b")
    public boolean field1134 = false;

    @ObfuscatedName("cd.n")
    public double field1145;

    @ObfuscatedName("cd.f")
    public double field1126;

    @ObfuscatedName("cd.g")
    public double field1138;

    @ObfuscatedName("cd.m")
    public double field1132;

    @ObfuscatedName("cd.r")
    public double field1137;

    @ObfuscatedName("cd.t")
    public double field1130;

    @ObfuscatedName("cd.o")
    public double field1139;

    @ObfuscatedName("cd.y")
    public double field1140;

    @ObfuscatedName("cd.a")
    public int field1141;

    @ObfuscatedName("cd.j")
    public int field1142;

    @ObfuscatedName("cd.d")
    public class274 field1143;

    @ObfuscatedName("cd.h")
    public int field1144 = 0;

    @ObfuscatedName("cd.c")
    public int field1135 = 0;

    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1121 = arg0;
        this.field1122 = arg1;
        this.field1123 = arg2;
        this.field1131 = arg3;
        this.field1125 = arg4;
        this.field1127 = arg5;
        this.field1128 = arg6;
        this.field1129 = arg7;
        this.field1133 = arg8;
        this.field1136 = arg9;
        this.field1124 = arg10;
        this.field1134 = false;
        int var12 = class259.method956(this.field1121).field3272;
        if (var12 == -1) {
            this.field1143 = null;
        } else {
            this.field1143 = class274.method26(var12);
        }
    }

    @ObfuscatedName("cd.z(IIIII)V")
    public final void method1728(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1134) {
            double var5 = (double) (arg0 - this.field1123);
            double var7 = (double) (arg1 - this.field1131);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1145 = (double) this.field1133 * var5 / var9 + (double) this.field1123;
            this.field1126 = (double) this.field1133 * var7 / var9 + (double) this.field1131;
            this.field1138 = (double) this.field1125;
        }
        double var11 = (double) (this.field1128 + 1 - arg3);
        this.field1132 = ((double) arg0 - this.field1145) / var11;
        this.field1137 = ((double) arg1 - this.field1126) / var11;
        this.field1130 = Math.sqrt(this.field1137 * this.field1137 + this.field1132 * this.field1132);
        if (!this.field1134) {
            this.field1139 = -this.field1130 * Math.tan((double) this.field1129 * 0.02454369D);
        }
        this.field1140 = ((double) arg2 - this.field1138 - this.field1139 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cd.w(II)V")
    public final void method1729(int arg0) {
        this.field1134 = true;
        this.field1145 += (double) arg0 * this.field1132;
        this.field1126 += (double) arg0 * this.field1137;
        this.field1138 += this.field1140 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1139;
        this.field1139 += (double) arg0 * this.field1140;
        this.field1141 = (int) (Math.atan2(this.field1132, this.field1137) * 325.949D) + 1024 & 0x7FF;
        this.field1142 = (int) (Math.atan2(this.field1139, this.field1130) * 325.949D) & 0x7FF;
        if (this.field1143 == null) {
            return;
        }
        this.field1135 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1135 <= this.field1143.field3542[this.field1144]) {
                        return;
                    }
                    this.field1135 -= this.field1143.field3542[this.field1144];
                    this.field1144++;
                } while (this.field1144 < this.field1143.field3541.length);
                this.field1144 -= this.field1143.field3545;
            } while (this.field1144 >= 0 && this.field1144 < this.field1143.field3541.length);
            this.field1144 = 0;
        }
    }

    @ObfuscatedName("cd.e(I)Ldc;")
    public final class120 method1010() {
        class259 var1 = class259.method956(this.field1121);
        class120 var2 = var1.method4475(this.field1144);
        if (var2 == null) {
            return null;
        } else {
            var2.method2476(this.field1142);
            return var2;
        }
    }
}
