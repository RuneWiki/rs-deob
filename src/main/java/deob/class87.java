package deob;

@ObfuscatedName("cp")
public final class class87 extends class136 {

    @ObfuscatedName("cp.s")
    public int field1204;

    @ObfuscatedName("cp.j")
    public int field1195;

    @ObfuscatedName("cp.i")
    public int field1187;

    @ObfuscatedName("cp.k")
    public int field1188;

    @ObfuscatedName("cp.u")
    public int field1210;

    @ObfuscatedName("cp.n")
    public int field1190;

    @ObfuscatedName("cp.t")
    public int field1202;

    @ObfuscatedName("cp.q")
    public int field1199;

    @ObfuscatedName("cp.x")
    public int field1193;

    @ObfuscatedName("cp.d")
    public int field1194;

    @ObfuscatedName("cp.f")
    public int field1198;

    @ObfuscatedName("cp.c")
    public boolean field1196 = false;

    @ObfuscatedName("cp.r")
    public double field1197;

    @ObfuscatedName("cp.y")
    public double field1189;

    @ObfuscatedName("cp.p")
    public double field1185;

    @ObfuscatedName("cp.b")
    public double field1200;

    @ObfuscatedName("cp.g")
    public double field1201;

    @ObfuscatedName("cp.e")
    public double field1205;

    @ObfuscatedName("cp.z")
    public double field1203;

    @ObfuscatedName("cp.a")
    public double field1207;

    @ObfuscatedName("cp.w")
    public int field1191;

    @ObfuscatedName("cp.l")
    public int field1206;

    @ObfuscatedName("cp.h")
    public class259 field1192;

    @ObfuscatedName("cp.v")
    public int field1208 = 0;

    @ObfuscatedName("cp.m")
    public int field1209 = 0;

    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1204 = arg0;
        this.field1195 = arg1;
        this.field1187 = arg2;
        this.field1188 = arg3;
        this.field1210 = arg4;
        this.field1202 = arg5;
        this.field1199 = arg6;
        this.field1193 = arg7;
        this.field1194 = arg8;
        this.field1198 = arg9;
        this.field1190 = arg10;
        this.field1196 = false;
        int var12 = class244.method1579(this.field1204).field3229;
        if (var12 == -1) {
            this.field1192 = null;
        } else {
            this.field1192 = Statics.method3725(var12);
        }
    }

    @ObfuscatedName("cp.s(IIIII)V")
    public final void method1914(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1196) {
            double var5 = (double) (arg0 - this.field1187);
            double var7 = (double) (arg1 - this.field1188);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1197 = (double) this.field1194 * var5 / var9 + (double) this.field1187;
            this.field1189 = (double) this.field1194 * var7 / var9 + (double) this.field1188;
            this.field1185 = (double) this.field1210;
        }
        double var11 = (double) (this.field1199 + 1 - arg3);
        this.field1200 = ((double) arg0 - this.field1197) / var11;
        this.field1201 = ((double) arg1 - this.field1189) / var11;
        this.field1205 = Math.sqrt(this.field1201 * this.field1201 + this.field1200 * this.field1200);
        if (!this.field1196) {
            this.field1203 = -this.field1205 * Math.tan((double) this.field1193 * 0.02454369D);
        }
        this.field1207 = ((double) arg2 - this.field1185 - this.field1203 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cp.j(II)V")
    public final void method1915(int arg0) {
        this.field1196 = true;
        this.field1197 += (double) arg0 * this.field1200;
        this.field1189 += (double) arg0 * this.field1201;
        this.field1185 += this.field1207 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1203;
        this.field1203 += (double) arg0 * this.field1207;
        this.field1191 = (int) (Math.atan2(this.field1200, this.field1201) * 325.949D) + 1024 & 0x7FF;
        this.field1206 = (int) (Math.atan2(this.field1203, this.field1205) * 325.949D) & 0x7FF;
        if (this.field1192 == null) {
            return;
        }
        this.field1209 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1209 <= this.field1192.field3498[this.field1208]) {
                        return;
                    }
                    this.field1209 -= this.field1192.field3498[this.field1208];
                    this.field1208++;
                } while (this.field1208 < this.field1192.field3496.length);
                this.field1208 -= this.field1192.field3500;
            } while (this.field1208 >= 0 && this.field1208 < this.field1192.field3496.length);
            this.field1208 = 0;
        }
    }

    @ObfuscatedName("cp.x(I)Ldo;")
    public final class128 method1064() {
        class244 var1 = class244.method1579(this.field1204);
        class128 var2 = var1.method4011(this.field1208);
        if (var2 == null) {
            return null;
        } else {
            var2.method2637(this.field1206);
            return var2;
        }
    }
}
