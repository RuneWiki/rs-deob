package deob;

@ObfuscatedName("ck")
public final class class87 extends class136 {

    @ObfuscatedName("ck.c")
    public int field1201;

    @ObfuscatedName("ck.x")
    public int field1186;

    @ObfuscatedName("ck.t")
    public int field1191;

    @ObfuscatedName("ck.g")
    public int field1188;

    @ObfuscatedName("ck.l")
    public int field1190;

    @ObfuscatedName("ck.u")
    public int field1187;

    @ObfuscatedName("ck.j")
    public int field1206;

    @ObfuscatedName("ck.v")
    public int field1192;

    @ObfuscatedName("ck.d")
    public int field1193;

    @ObfuscatedName("ck.z")
    public int field1194;

    @ObfuscatedName("ck.n")
    public int field1195;

    @ObfuscatedName("ck.h")
    public boolean field1196 = false;

    @ObfuscatedName("ck.f")
    public double field1209;

    @ObfuscatedName("ck.s")
    public double field1198;

    @ObfuscatedName("ck.p")
    public double field1199;

    @ObfuscatedName("ck.e")
    public double field1200;

    @ObfuscatedName("ck.i")
    public double field1185;

    @ObfuscatedName("ck.q")
    public double field1202;

    @ObfuscatedName("ck.y")
    public double field1203;

    @ObfuscatedName("ck.r")
    public double field1204;

    @ObfuscatedName("ck.k")
    public int field1205;

    @ObfuscatedName("ck.w")
    public int field1189;

    @ObfuscatedName("ck.m")
    public class259 field1207;

    @ObfuscatedName("ck.o")
    public int field1197 = 0;

    @ObfuscatedName("ck.a")
    public int field1208 = 0;

    public class87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1201 = arg0;
        this.field1186 = arg1;
        this.field1191 = arg2;
        this.field1188 = arg3;
        this.field1190 = arg4;
        this.field1206 = arg5;
        this.field1192 = arg6;
        this.field1193 = arg7;
        this.field1194 = arg8;
        this.field1195 = arg9;
        this.field1187 = arg10;
        this.field1196 = false;
        int var12 = class244.method3966(this.field1201).field3220;
        if (var12 == -1) {
            this.field1207 = null;
        } else {
            this.field1207 = class259.method1897(var12);
        }
    }

    @ObfuscatedName("ck.c(IIIII)V")
    public final void method1932(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1196) {
            double var5 = (double) (arg0 - this.field1191);
            double var7 = (double) (arg1 - this.field1188);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1209 = (double) this.field1194 * var5 / var9 + (double) this.field1191;
            this.field1198 = (double) this.field1194 * var7 / var9 + (double) this.field1188;
            this.field1199 = (double) this.field1190;
        }
        double var11 = (double) (this.field1192 + 1 - arg3);
        this.field1200 = ((double) arg0 - this.field1209) / var11;
        this.field1185 = ((double) arg1 - this.field1198) / var11;
        this.field1202 = Math.sqrt(this.field1200 * this.field1200 + this.field1185 * this.field1185);
        if (!this.field1196) {
            this.field1203 = -this.field1202 * Math.tan((double) this.field1193 * 0.02454369D);
        }
        this.field1204 = ((double) arg2 - this.field1199 - this.field1203 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ck.x(II)V")
    public final void method1937(int arg0) {
        this.field1196 = true;
        this.field1209 += (double) arg0 * this.field1200;
        this.field1198 += (double) arg0 * this.field1185;
        this.field1199 += this.field1204 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1203;
        this.field1203 += (double) arg0 * this.field1204;
        this.field1205 = (int) (Math.atan2(this.field1200, this.field1185) * 325.949D) + 1024 & 0x7FF;
        this.field1189 = (int) (Math.atan2(this.field1203, this.field1202) * 325.949D) & 0x7FF;
        if (this.field1207 == null) {
            return;
        }
        this.field1208 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1208 <= this.field1207.field3485[this.field1197]) {
                        return;
                    }
                    this.field1208 -= this.field1207.field3485[this.field1197];
                    this.field1197++;
                } while (this.field1197 < this.field1207.field3490.length);
                this.field1197 -= this.field1207.field3494;
            } while (this.field1197 >= 0 && this.field1197 < this.field1207.field3490.length);
            this.field1197 = 0;
        }
    }

    @ObfuscatedName("ck.d(B)Ldr;")
    public final class128 method1062() {
        class244 var1 = class244.method3966(this.field1201);
        class128 var2 = var1.method4082(this.field1197);
        if (var2 == null) {
            return null;
        } else {
            var2.method2645(this.field1189);
            return var2;
        }
    }
}
