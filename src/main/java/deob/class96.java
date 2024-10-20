package deob;

@ObfuscatedName("cm")
public final class class96 extends class145 {

    @ObfuscatedName("cm.n")
    public int field1247;

    @ObfuscatedName("cm.v")
    public int field1231;

    @ObfuscatedName("cm.d")
    public int field1232;

    @ObfuscatedName("cm.c")
    public int field1233;

    @ObfuscatedName("cm.y")
    public int field1234;

    @ObfuscatedName("cm.h")
    public int field1235;

    @ObfuscatedName("cm.z")
    public int field1236;

    @ObfuscatedName("cm.e")
    public int field1237;

    @ObfuscatedName("cm.q")
    public int field1238;

    @ObfuscatedName("cm.l")
    public int field1239;

    @ObfuscatedName("cm.s")
    public int field1252;

    @ObfuscatedName("cm.b")
    public boolean field1241 = false;

    @ObfuscatedName("cm.a")
    public double field1240;

    @ObfuscatedName("cm.w")
    public double field1243;

    @ObfuscatedName("cm.k")
    public double field1242;

    @ObfuscatedName("cm.i")
    public double field1245;

    @ObfuscatedName("cm.x")
    public double field1251;

    @ObfuscatedName("cm.f")
    public double field1253;

    @ObfuscatedName("cm.g")
    public double field1248;

    @ObfuscatedName("cm.u")
    public double field1249;

    @ObfuscatedName("cm.t")
    public int field1250;

    @ObfuscatedName("cm.p")
    public int field1246;

    @ObfuscatedName("cm.m")
    public class270 field1244;

    @ObfuscatedName("cm.r")
    public int field1230 = 0;

    @ObfuscatedName("cm.o")
    public int field1254 = 0;

    public class96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1247 = arg0;
        this.field1231 = arg1;
        this.field1232 = arg2;
        this.field1233 = arg3;
        this.field1234 = arg4;
        this.field1236 = arg5;
        this.field1237 = arg6;
        this.field1238 = arg7;
        this.field1239 = arg8;
        this.field1252 = arg9;
        this.field1235 = arg10;
        this.field1241 = false;
        int var12 = class255.method4871(this.field1247).field3279;
        if (var12 == -1) {
            this.field1244 = null;
        } else {
            this.field1244 = Statics.method1124(var12);
        }
    }

    @ObfuscatedName("cm.n(IIIIB)V")
    public final void method2077(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1241) {
            double var5 = (double) (arg0 - this.field1232);
            double var7 = (double) (arg1 - this.field1233);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1240 = (double) this.field1239 * var5 / var9 + (double) this.field1232;
            this.field1243 = (double) this.field1239 * var7 / var9 + (double) this.field1233;
            this.field1242 = (double) this.field1234;
        }
        double var11 = (double) (this.field1237 + 1 - arg3);
        this.field1245 = ((double) arg0 - this.field1240) / var11;
        this.field1251 = ((double) arg1 - this.field1243) / var11;
        this.field1253 = Math.sqrt(this.field1251 * this.field1251 + this.field1245 * this.field1245);
        if (!this.field1241) {
            this.field1248 = -this.field1253 * Math.tan((double) this.field1238 * 0.02454369D);
        }
        this.field1249 = ((double) arg2 - this.field1242 - this.field1248 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("cm.v(IB)V")
    public final void method2078(int arg0) {
        this.field1241 = true;
        this.field1240 += (double) arg0 * this.field1245;
        this.field1243 += (double) arg0 * this.field1251;
        this.field1242 += this.field1249 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1248;
        this.field1248 += (double) arg0 * this.field1249;
        this.field1250 = (int) (Math.atan2(this.field1245, this.field1251) * 325.949D) + 1024 & 0x7FF;
        this.field1246 = (int) (Math.atan2(this.field1248, this.field1253) * 325.949D) & 0x7FF;
        if (this.field1244 == null) {
            return;
        }
        this.field1254 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1254 <= this.field1244.field3556[this.field1230]) {
                        return;
                    }
                    this.field1254 -= this.field1244.field3556[this.field1230];
                    this.field1230++;
                } while (this.field1230 < this.field1244.field3554.length);
                this.field1230 -= this.field1244.field3558;
            } while (this.field1230 >= 0 && this.field1230 < this.field1244.field3554.length);
            this.field1230 = 0;
        }
    }

    @ObfuscatedName("cm.q(B)Lef;")
    public final class137 method1214() {
        class255 var1 = class255.method4871(this.field1247);
        class137 var2 = var1.method4216(this.field1230);
        if (var2 == null) {
            return null;
        } else {
            var2.method2809(this.field1246);
            return var2;
        }
    }
}
