package deob;

import java.io.IOException;

@ObfuscatedName("cx")
public class class96 {

    @ObfuscatedName("cx.c")
    public class305 field1278;

    @ObfuscatedName("cx.x")
    public class261 field1276 = new class261();

    @ObfuscatedName("cx.t")
    public int field1286 = 0;

    @ObfuscatedName("cx.g")
    public class300 field1280 = new class300(5000);

    @ObfuscatedName("cx.l")
    public class328 field1279;

    @ObfuscatedName("cx.u")
    public class299 field1283 = new class299(40000);

    @ObfuscatedName("cx.j")
    public class183 field1281 = null;

    @ObfuscatedName("cx.v")
    public int field1277 = 0;

    @ObfuscatedName("cx.d")
    public boolean field1282 = true;

    @ObfuscatedName("cx.z")
    public int field1284 = 0;

    @ObfuscatedName("cx.n")
    public int field1285 = 0;

    @ObfuscatedName("cx.h")
    public class183 field1275;

    @ObfuscatedName("cx.f")
    public class183 field1287;

    @ObfuscatedName("cx.s")
    public class183 field1288;

    @ObfuscatedName("cx.c(I)V")
    public final void method2073() {
        this.field1276.method4476();
        this.field1286 = 0;
    }

    @ObfuscatedName("cx.x(B)V")
    public final void method2074() throws IOException {
        if (this.field1278 == null || this.field1286 <= 0) {
            return;
        }
        this.field1280.field3696 = 0;
        while (true) {
            class188 var1 = (class188) this.field1276.method4492();
            if (var1 == null || var1.field2312 > this.field1280.field3694.length - this.field1280.field3696) {
                this.field1278.method3250(this.field1280.field3694, 0, this.field1280.field3696);
                this.field1285 = 0;
                break;
            }
            this.field1280.method5169(var1.field2313.field3694, 0, var1.field2312);
            this.field1286 -= var1.field2312;
            var1.method3326();
            var1.field2313.method5086();
            var1.method3353();
        }
    }

    @ObfuscatedName("cx.t(Lgj;S)V")
    public final void method2075(class188 arg0) {
        this.field1276.method4477(arg0);
        arg0.field2312 = arg0.field2313.field3696;
        arg0.field2313.field3696 = 0;
        this.field1286 += arg0.field2312;
    }

    @ObfuscatedName("cx.g(Lks;B)V")
    public void method2096(class305 arg0) {
        this.field1278 = arg0;
    }

    @ObfuscatedName("cx.l(B)V")
    public void method2072() {
        if (this.field1278 != null) {
            this.field1278.method3242();
            this.field1278 = null;
        }
    }

    @ObfuscatedName("cx.u(I)V")
    public void method2078() {
        this.field1278 = null;
    }

    @ObfuscatedName("cx.j(I)Lks;")
    public class305 method2079() {
        return this.field1278;
    }
}
