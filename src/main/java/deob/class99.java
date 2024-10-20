package deob;

import java.io.IOException;

@ObfuscatedName("cv")
public class class99 {

    @ObfuscatedName("cv.i")
    public class344 field1283;

    @ObfuscatedName("cv.w")
    public class311 field1274 = new class311();

    @ObfuscatedName("cv.s")
    public int field1275 = 0;

    @ObfuscatedName("cv.a")
    public class401 field1284 = new class401(5000);

    @ObfuscatedName("cv.o")
    public class417 field1277;

    @ObfuscatedName("cv.g")
    public class400 field1280 = new class400(40000);

    @ObfuscatedName("cv.e")
    public class243 field1279 = null;

    @ObfuscatedName("cv.p")
    public int field1282 = 0;

    @ObfuscatedName("cv.j")
    public boolean field1281 = true;

    @ObfuscatedName("cv.b")
    public int field1276 = 0;

    @ObfuscatedName("cv.x")
    public int field1273 = 0;

    @ObfuscatedName("cv.y")
    public class243 field1278;

    @ObfuscatedName("cv.k")
    public class243 field1285;

    @ObfuscatedName("cv.t")
    public class243 field1286;

    @ObfuscatedName("cv.i(I)V")
    public final void method2267() {
        this.field1274.method5022();
        this.field1275 = 0;
    }

    @ObfuscatedName("cv.w(I)V")
    public final void method2278() throws IOException {
        if (this.field1283 == null || this.field1275 <= 0) {
            return;
        }
        this.field1284.field4300 = 0;
        while (true) {
            class242 var1 = (class242) this.field1274.method5026();
            if (var1 == null || var1.field2787 > this.field1284.field4302.length - this.field1284.field4300) {
                this.field1283.method2642(this.field1284.field4302, 0, this.field1284.field4300);
                this.field1273 = 0;
                break;
            }
            this.field1284.method6233(var1.field2792.field4302, 0, var1.field2787);
            this.field1275 -= var1.field2787;
            var1.method5752();
            var1.field2792.method6222();
            var1.method4223();
        }
    }

    @ObfuscatedName("cv.s(Lib;B)V")
    public final void method2269(class242 arg0) {
        this.field1274.method5023(arg0);
        arg0.field2787 = arg0.field2792.field4300;
        arg0.field2792.field4300 = 0;
        this.field1275 += arg0.field2787;
    }

    @ObfuscatedName("cv.a(Lmp;I)V")
    public void method2270(class344 arg0) {
        this.field1283 = arg0;
    }

    @ObfuscatedName("cv.o(I)V")
    public void method2271() {
        if (this.field1283 != null) {
            this.field1283.method2613();
            this.field1283 = null;
        }
    }

    @ObfuscatedName("cv.g(I)V")
    public void method2272() {
        this.field1283 = null;
    }

    @ObfuscatedName("cv.e(B)Lmp;")
    public class344 method2273() {
        return this.field1283;
    }
}
