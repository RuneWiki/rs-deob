package deob;

import java.io.IOException;

@ObfuscatedName("cs")
public class class99 {

    @ObfuscatedName("cs.n")
    public class343 field1285;

    @ObfuscatedName("cs.c")
    public class311 field1294 = new class311();

    @ObfuscatedName("cs.m")
    public int field1283 = 0;

    @ObfuscatedName("cs.k")
    public class400 field1281 = new class400(5000);

    @ObfuscatedName("cs.o")
    public class416 field1282;

    @ObfuscatedName("cs.g")
    public class399 field1284 = new class399(40000);

    @ObfuscatedName("cs.z")
    public class243 field1278 = null;

    @ObfuscatedName("cs.a")
    public int field1279 = 0;

    @ObfuscatedName("cs.u")
    public boolean field1286 = true;

    @ObfuscatedName("cs.e")
    public int field1280 = 0;

    @ObfuscatedName("cs.l")
    public int field1288 = 0;

    @ObfuscatedName("cs.y")
    public class243 field1289;

    @ObfuscatedName("cs.v")
    public class243 field1290;

    @ObfuscatedName("cs.f")
    public class243 field1291;

    @ObfuscatedName("cs.n(B)V")
    public final void method2209() {
        this.field1294.method5012();
        this.field1283 = 0;
    }

    @ObfuscatedName("cs.c(B)V")
    public final void method2210() throws IOException {
        if (this.field1285 == null || this.field1283 <= 0) {
            return;
        }
        this.field1281.field4272 = 0;
        while (true) {
            class242 var1 = (class242) this.field1294.method5007();
            if (var1 == null || var1.field2768 > this.field1281.field4271.length - this.field1281.field4272) {
                this.field1285.method2567(this.field1281.field4271, 0, this.field1281.field4272);
                this.field1288 = 0;
                break;
            }
            this.field1281.method6210(var1.field2767.field4271, 0, var1.field2768);
            this.field1283 -= var1.field2768;
            var1.method5732();
            var1.field2767.method6199();
            var1.method4185();
        }
    }

    @ObfuscatedName("cs.m(Lil;I)V")
    public final void method2211(class242 arg0) {
        this.field1294.method5004(arg0);
        arg0.field2768 = arg0.field2767.field4272;
        arg0.field2767.field4272 = 0;
        this.field1283 += arg0.field2768;
    }

    @ObfuscatedName("cs.k(Lmv;I)V")
    public void method2208(class343 arg0) {
        this.field1285 = arg0;
    }

    @ObfuscatedName("cs.o(I)V")
    public void method2221() {
        if (this.field1285 != null) {
            this.field1285.method2541();
            this.field1285 = null;
        }
    }

    @ObfuscatedName("cs.g(I)V")
    public void method2220() {
        this.field1285 = null;
    }

    @ObfuscatedName("cs.z(B)Lmv;")
    public class343 method2215() {
        return this.field1285;
    }
}
