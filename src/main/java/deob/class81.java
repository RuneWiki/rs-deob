package deob;

@ObfuscatedName("cg")
public final class class81 extends class130 {

    @ObfuscatedName("cg.g")
    public int field1197;

    @ObfuscatedName("cg.r")
    public int field1184;

    @ObfuscatedName("cg.e")
    public int field1207;

    @ObfuscatedName("cg.q")
    public int field1203;

    @ObfuscatedName("cg.c")
    public int field1187;

    @ObfuscatedName("cg.l")
    public int field1188;

    @ObfuscatedName("cg.b")
    public int field1189;

    @ObfuscatedName("cg.w")
    public int field1190;

    @ObfuscatedName("cg.n")
    public int field1191;

    @ObfuscatedName("cg.i")
    public int field1196;

    @ObfuscatedName("cg.p")
    public int field1193;

    @ObfuscatedName("cg.m")
    public boolean field1194 = false;

    @ObfuscatedName("cg.d")
    public double field1186;

    @ObfuscatedName("cg.j")
    public double field1192;

    @ObfuscatedName("cg.x")
    public double field1185;

    @ObfuscatedName("cg.v")
    public double field1198;

    @ObfuscatedName("cg.h")
    public double field1183;

    @ObfuscatedName("cg.f")
    public double field1200;

    @ObfuscatedName("cg.a")
    public double field1201;

    @ObfuscatedName("cg.t")
    public double field1202;

    @ObfuscatedName("cg.k")
    public int field1195;

    @ObfuscatedName("cg.z")
    public int field1204;

    @ObfuscatedName("cg.s")
    public class276 field1205;

    @ObfuscatedName("cg.y")
    public int field1206 = 0;

    @ObfuscatedName("cg.u")
    public int field1199 = 0;

    public class81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1197 = arg0;
        this.field1184 = arg1;
        this.field1207 = arg2;
        this.field1203 = arg3;
        this.field1187 = arg4;
        this.field1189 = arg5;
        this.field1190 = arg6;
        this.field1191 = arg7;
        this.field1196 = arg8;
        this.field1193 = arg9;
        this.field1188 = arg10;
        this.field1194 = false;
        int var12 = class261.method4525(this.field1197).field3349;
        if (var12 == -1) {
            this.field1205 = null;
        } else {
            this.field1205 = class276.method493(var12);
        }
    }

    @ObfuscatedName("cg.g(IIIII)V")
    public final void method1918(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1194) {
            double var5 = (double) (arg0 - this.field1207);
            double var7 = (double) (arg1 - this.field1203);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1186 = (double) this.field1196 * var5 / var9 + (double) this.field1207;
            this.field1192 = (double) this.field1196 * var7 / var9 + (double) this.field1203;
            this.field1185 = (double) this.field1187;
        }
        double var11 = (double) (this.field1190 + 1 - arg3);
        this.field1198 = ((double) arg0 - this.field1186) / var11;
        this.field1183 = ((double) arg1 - this.field1192) / var11;
        this.field1200 = Math.sqrt(this.field1198 * this.field1198 + this.field1183 * this.field1183);
        if (!this.field1194) {
            this.field1201 = -this.field1200 * Math.tan((double) this.field1191 * 0.02454369D);
        }
        this.field1202 = ((double) arg2 - this.field1185 - this.field1201 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cg.r(II)V")
    public final void method1921(int arg0) {
        this.field1194 = true;
        this.field1186 += (double) arg0 * this.field1198;
        this.field1192 += (double) arg0 * this.field1183;
        this.field1185 += this.field1202 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1201;
        this.field1201 += (double) arg0 * this.field1202;
        this.field1195 = (int) (Math.atan2(this.field1198, this.field1183) * 325.949D) + 1024 & 0x7FF;
        this.field1204 = (int) (Math.atan2(this.field1201, this.field1200) * 325.949D) & 0x7FF;
        if (this.field1205 == null) {
            return;
        }
        this.field1199 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1199 <= this.field1205.field3631[this.field1206]) {
                        return;
                    }
                    this.field1199 -= this.field1205.field3631[this.field1206];
                    this.field1206++;
                } while (this.field1206 < this.field1205.field3624.length);
                this.field1206 -= this.field1205.field3625;
            } while (this.field1206 >= 0 && this.field1206 < this.field1205.field3624.length);
            this.field1206 = 0;
        }
    }

    @ObfuscatedName("cg.d(I)Ldl;")
    public final class122 method1130() {
        class261 var1 = class261.method4525(this.field1197);
        class122 var2 = var1.method4680(this.field1206);
        if (var2 == null) {
            return null;
        } else {
            var2.method2736(this.field1204);
            return var2;
        }
    }
}
