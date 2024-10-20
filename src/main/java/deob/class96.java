package deob;

import java.io.IOException;

@ObfuscatedName("cp")
public class class96 {

    @ObfuscatedName("cp.a")
    public class305 field1280;

    @ObfuscatedName("cp.t")
    public class261 field1281 = new class261();

    @ObfuscatedName("cp.n")
    public int field1282 = 0;

    @ObfuscatedName("cp.q")
    public class300 field1283 = new class300(5000);

    @ObfuscatedName("cp.v")
    public class328 field1284;

    @ObfuscatedName("cp.l")
    public class299 field1285 = new class299(40000);

    @ObfuscatedName("cp.c")
    public class183 field1286 = null;

    @ObfuscatedName("cp.o")
    public int field1289 = 0;

    @ObfuscatedName("cp.i")
    public boolean field1288 = true;

    @ObfuscatedName("cp.d")
    public int field1292 = 0;

    @ObfuscatedName("cp.m")
    public int field1290 = 0;

    @ObfuscatedName("cp.p")
    public class183 field1291;

    @ObfuscatedName("cp.h")
    public class183 field1287;

    @ObfuscatedName("cp.k")
    public class183 field1293;

    @ObfuscatedName("cp.a(B)V")
    public final void method2175() {
        this.field1281.method4500();
        this.field1282 = 0;
    }

    @ObfuscatedName("cp.t(I)V")
    public final void method2176() throws IOException {
        if (this.field1280 == null || this.field1282 <= 0) {
            return;
        }
        this.field1283.field3694 = 0;
        while (true) {
            class188 var1 = (class188) this.field1281.method4509();
            if (var1 == null || var1.field2309 > this.field1283.field3699.length - this.field1283.field3694) {
                this.field1280.method3299(this.field1283.field3699, 0, this.field1283.field3694);
                this.field1290 = 0;
                break;
            }
            this.field1283.method5238(var1.field2308.field3699, 0, var1.field2309);
            this.field1282 -= var1.field2309;
            var1.method3386();
            var1.field2308.method5106();
            var1.method3417();
        }
    }

    @ObfuscatedName("cp.n(Lgk;B)V")
    public final void method2177(class188 arg0) {
        this.field1281.method4501(arg0);
        arg0.field2309 = arg0.field2308.field3694;
        arg0.field2308.field3694 = 0;
        this.field1282 += arg0.field2309;
    }

    @ObfuscatedName("cp.q(Lku;B)V")
    public void method2178(class305 arg0) {
        this.field1280 = arg0;
    }

    @ObfuscatedName("cp.v(I)V")
    public void method2179() {
        if (this.field1280 != null) {
            this.field1280.method3292();
            this.field1280 = null;
        }
    }

    @ObfuscatedName("cp.l(I)V")
    public void method2180() {
        this.field1280 = null;
    }

    @ObfuscatedName("cp.c(I)Lku;")
    public class305 method2181() {
        return this.field1280;
    }
}
