package deob;

@ObfuscatedName("ct")
public final class class96 extends class145 {

    @ObfuscatedName("ct.x")
    public int field1251;

    @ObfuscatedName("ct.m")
    public int field1228;

    @ObfuscatedName("ct.k")
    public int field1230;

    @ObfuscatedName("ct.d")
    public int field1244;

    @ObfuscatedName("ct.w")
    public int field1232;

    @ObfuscatedName("ct.v")
    public int field1233;

    @ObfuscatedName("ct.q")
    public int field1236;

    @ObfuscatedName("ct.z")
    public int field1235;

    @ObfuscatedName("ct.t")
    public int field1231;

    @ObfuscatedName("ct.e")
    public int field1237;

    @ObfuscatedName("ct.s")
    public int field1229;

    @ObfuscatedName("ct.p")
    public boolean field1239 = false;

    @ObfuscatedName("ct.n")
    public double field1241;

    @ObfuscatedName("ct.u")
    public double field1240;

    @ObfuscatedName("ct.h")
    public double field1242;

    @ObfuscatedName("ct.g")
    public double field1243;

    @ObfuscatedName("ct.i")
    public double field1246;

    @ObfuscatedName("ct.a")
    public double field1245;

    @ObfuscatedName("ct.b")
    public double field1250;

    @ObfuscatedName("ct.l")
    public double field1247;

    @ObfuscatedName("ct.r")
    public int field1248;

    @ObfuscatedName("ct.o")
    public int field1249;

    @ObfuscatedName("ct.c")
    public class269 field1234;

    @ObfuscatedName("ct.j")
    public int field1238 = 0;

    @ObfuscatedName("ct.y")
    public int field1252 = 0;

    public class96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1251 = arg0;
        this.field1228 = arg1;
        this.field1230 = arg2;
        this.field1244 = arg3;
        this.field1232 = arg4;
        this.field1236 = arg5;
        this.field1235 = arg6;
        this.field1231 = arg7;
        this.field1237 = arg8;
        this.field1229 = arg9;
        this.field1233 = arg10;
        this.field1239 = false;
        int var12 = class254.method1049(this.field1251).field3244;
        if (var12 == -1) {
            this.field1234 = null;
        } else {
            this.field1234 = class269.method4110(var12);
        }
    }

    @ObfuscatedName("ct.x(IIIII)V")
    public final void method2012(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field1239) {
            double var5 = (double) (arg0 - this.field1230);
            double var7 = (double) (arg1 - this.field1244);
            double var9 = Math.sqrt(var5 * var5 + var7 * var7);
            this.field1241 = (double) this.field1237 * var5 / var9 + (double) this.field1230;
            this.field1240 = (double) this.field1237 * var7 / var9 + (double) this.field1244;
            this.field1242 = (double) this.field1232;
        }
        double var11 = (double) (this.field1235 + 1 - arg3);
        this.field1243 = ((double) arg0 - this.field1241) / var11;
        this.field1246 = ((double) arg1 - this.field1240) / var11;
        this.field1245 = Math.sqrt(this.field1246 * this.field1246 + this.field1243 * this.field1243);
        if (!this.field1239) {
            this.field1250 = -this.field1245 * Math.tan((double) this.field1231 * 0.02454369D);
        }
        this.field1247 = ((double) arg2 - this.field1242 - this.field1250 * var11) * 2.0D / (var11 * var11);
    }

    @ObfuscatedName("ct.m(II)V")
    public final void method2010(int arg0) {
        this.field1239 = true;
        this.field1241 += (double) arg0 * this.field1243;
        this.field1240 += (double) arg0 * this.field1246;
        this.field1242 += this.field1247 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1250;
        this.field1250 += (double) arg0 * this.field1247;
        this.field1248 = (int) (Math.atan2(this.field1243, this.field1246) * 325.949D) + 1024 & 0x7FF;
        this.field1249 = (int) (Math.atan2(this.field1250, this.field1245) * 325.949D) & 0x7FF;
        if (this.field1234 == null) {
            return;
        }
        this.field1252 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1252 <= this.field1234.field3515[this.field1238]) {
                        return;
                    }
                    this.field1252 -= this.field1234.field3515[this.field1238];
                    this.field1238++;
                } while (this.field1238 < this.field1234.field3514.length);
                this.field1238 -= this.field1234.field3517;
            } while (this.field1238 >= 0 && this.field1238 < this.field1234.field3514.length);
            this.field1238 = 0;
        }
    }

    @ObfuscatedName("ct.t(I)Lel;")
    public final class137 method1182() {
        class254 var1 = class254.method1049(this.field1251);
        class137 var2 = var1.method4099(this.field1238);
        if (var2 == null) {
            return null;
        } else {
            var2.method2715(this.field1249);
            return var2;
        }
    }
}
