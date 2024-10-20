package deob;

@ObfuscatedName("cb")
public final class class87 extends class136 {

    @ObfuscatedName("cb.c")
    public int field1220;

    @ObfuscatedName("cb.t")
    public int field1213;

    @ObfuscatedName("cb.o")
    public int field1204;

    @ObfuscatedName("cb.e")
    public int field1201;

    @ObfuscatedName("cb.i")
    public int field1202;

    @ObfuscatedName("cb.g")
    public int field1205;

    @ObfuscatedName("cb.d")
    public int field1218;

    @ObfuscatedName("cb.l")
    public int field1217;

    @ObfuscatedName("cb.j")
    public int field1206;

    @ObfuscatedName("cb.m")
    public int field1207;

    @ObfuscatedName("cb.p")
    public int field1208;

    @ObfuscatedName("cb.h")
    public boolean field1209 = false;

    @ObfuscatedName("cb.v")
    public double field1210;

    @ObfuscatedName("cb.n")
    public double field1211;

    @ObfuscatedName("cb.x")
    public double field1212;

    @ObfuscatedName("cb.w")
    public double field1215;

    @ObfuscatedName("cb.k")
    public double field1214;

    @ObfuscatedName("cb.q")
    public double field1198;

    @ObfuscatedName("cb.z")
    public double field1216;

    @ObfuscatedName("cb.y")
    public double field1221;

    @ObfuscatedName("cb.f")
    public int field1203;

    @ObfuscatedName("cb.b")
    public int field1219;

    @ObfuscatedName("cb.r")
    public class260 field1223;

    @ObfuscatedName("cb.s")
    public int field1199 = 0;

    @ObfuscatedName("cb.a")
    public int field1222 = 0;

    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1220 = arg0;
        this.field1213 = arg1;
        this.field1204 = arg2;
        this.field1201 = arg3;
        this.field1202 = arg4;
        this.field1218 = arg5;
        this.field1217 = arg6;
        this.field1206 = arg7;
        this.field1207 = arg8;
        this.field1208 = arg9;
        this.field1205 = arg10;
        this.field1209 = false;
        int var12 = class245.method1108(this.field1220).field3246;
        if (var12 == -1) {
            this.field1223 = null;
        } else {
            this.field1223 = class260.method5476(var12);
        }
    }

    @ObfuscatedName("cb.c(IIIII)V")
    public final void method1967(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1209) {
            double var5 = (double) (arg0 - this.field1204);
            double var7 = (double) (arg1 - this.field1201);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1210 = (double) this.field1207 * var5 / var9 + (double) this.field1204;
            this.field1211 = (double) this.field1207 * var7 / var9 + (double) this.field1201;
            this.field1212 = (double) this.field1202;
        }
        double var11 = (double) (this.field1217 + 1 - arg3);
        this.field1215 = ((double) arg0 - this.field1210) / var11;
        this.field1214 = ((double) arg1 - this.field1211) / var11;
        this.field1198 = Math.sqrt(this.field1215 * this.field1215 + this.field1214 * this.field1214);
        if (!this.field1209) {
            this.field1216 = -this.field1198 * Math.tan((double) this.field1206 * 0.02454369D);
        }
        this.field1221 = ((double) arg2 - this.field1212 - this.field1216 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cb.t(II)V")
    public final void method1968(int arg0) {
        this.field1209 = true;
        this.field1210 += (double) arg0 * this.field1215;
        this.field1211 += (double) arg0 * this.field1214;
        this.field1212 += this.field1221 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1216;
        this.field1216 += (double) arg0 * this.field1221;
        this.field1203 = (int) (Math.atan2(this.field1215, this.field1214) * 325.949D) + 1024 & 0x7FF;
        this.field1219 = (int) (Math.atan2(this.field1216, this.field1198) * 325.949D) & 0x7FF;
        if (this.field1223 == null) {
            return;
        }
        this.field1222 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1222 <= this.field1223.field3515[this.field1199]) {
                        return;
                    }
                    this.field1222 -= this.field1223.field3515[this.field1199];
                    this.field1199++;
                } while (this.field1199 < this.field1223.field3526.length);
                this.field1199 -= this.field1223.field3520;
            } while (this.field1199 >= 0 && this.field1199 < this.field1223.field3526.length);
            this.field1199 = 0;
        }
    }

    @ObfuscatedName("cb.j(I)Ldx;")
    public final class128 method1118() {
        class245 var1 = class245.method1108(this.field1220);
        class128 var2 = var1.method4090(this.field1199);
        if (var2 == null) {
            return null;
        } else {
            var2.method2679(this.field1219);
            return var2;
        }
    }
}
