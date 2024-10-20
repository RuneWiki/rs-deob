package deob;

import java.io.IOException;

@ObfuscatedName("cs")
public class class95 {

    @ObfuscatedName("cs.n")
    public class165 field1276;

    @ObfuscatedName("cs.h")
    public class211 field1286 = new class211();

    @ObfuscatedName("cs.l")
    public int field1275 = 0;

    @ObfuscatedName("cs.g")
    public class190 field1274 = new class190(5000);

    @ObfuscatedName("cs.b")
    public class198 field1271;

    @ObfuscatedName("cs.a")
    public class197 field1281 = new class197(40000);

    @ObfuscatedName("cs.c")
    public class176 field1277 = null;

    @ObfuscatedName("cs.z")
    public int field1278 = 0;

    @ObfuscatedName("cs.j")
    public boolean field1288 = true;

    @ObfuscatedName("cs.d")
    public int field1280 = 0;

    @ObfuscatedName("cs.t")
    public int field1272 = 0;

    @ObfuscatedName("cs.f")
    public class176 field1282;

    @ObfuscatedName("cs.i")
    public class176 field1283;

    @ObfuscatedName("cs.m")
    public class176 field1284;

    @ObfuscatedName("cs.n(B)V")
    public final void method2057() {
        this.field1286.method3949();
        this.field1275 = 0;
    }

    @ObfuscatedName("cs.h(B)V")
    public final void method2063() throws IOException {
        if (this.field1276 == null || this.field1275 <= 0) {
            return;
        }
        this.field1274.field2423 = 0;
        while (true) {
            class180 var1 = (class180) this.field1286.method3953();
            if (var1 == null || var1.field2346 > this.field1274.field2424.length - this.field1274.field2423) {
                this.field1276.method3288(this.field1274.field2424, 0, this.field1274.field2423);
                this.field1272 = 0;
                break;
            }
            this.field1274.method3519(var1.field2345.field2424, 0, var1.field2346);
            this.field1275 -= var1.field2346;
            var1.method3973();
            var1.field2345.method3494();
            var1.method3424();
        }
    }

    @ObfuscatedName("cs.l(Lfv;I)V")
    public final void method2059(class180 arg0) {
        this.field1286.method3950(arg0);
        arg0.field2346 = arg0.field2345.field2423;
        arg0.field2345.field2423 = 0;
        this.field1275 += arg0.field2346;
    }

    @ObfuscatedName("cs.g(Lfm;I)V")
    public void method2060(class165 arg0) {
        this.field1276 = arg0;
    }

    @ObfuscatedName("cs.b(I)V")
    public void method2066() {
        if (this.field1276 != null) {
            this.field1276.method3287();
            this.field1276 = null;
        }
    }

    @ObfuscatedName("cs.a(I)V")
    public void method2056() {
        this.field1276 = null;
    }

    @ObfuscatedName("cs.c(I)Lfm;")
    public class165 method2061() {
        return this.field1276;
    }
}
