package deob;

import java.io.IOException;

@ObfuscatedName("ci")
public class class96 {

    @ObfuscatedName("ci.c")
    public class306 field1307;

    @ObfuscatedName("ci.t")
    public class262 field1295 = new class262();

    @ObfuscatedName("ci.o")
    public int field1296 = 0;

    @ObfuscatedName("ci.e")
    public class301 field1305 = new class301(5000);

    @ObfuscatedName("ci.i")
    public class329 field1298;

    @ObfuscatedName("ci.g")
    public class300 field1299 = new class300(40000);

    @ObfuscatedName("ci.d")
    public class183 field1303 = null;

    @ObfuscatedName("ci.l")
    public int field1301 = 0;

    @ObfuscatedName("ci.j")
    public boolean field1302 = true;

    @ObfuscatedName("ci.m")
    public int field1300 = 0;

    @ObfuscatedName("ci.p")
    public int field1304 = 0;

    @ObfuscatedName("ci.h")
    public class183 field1310;

    @ObfuscatedName("ci.v")
    public class183 field1306;

    @ObfuscatedName("ci.n")
    public class183 field1308;

    @ObfuscatedName("ci.c(B)V")
    public final void method2128() {
        this.field1295.method4520();
        this.field1296 = 0;
    }

    @ObfuscatedName("ci.t(I)V")
    public final void method2108() throws IOException {
        if (this.field1307 == null || this.field1296 <= 0) {
            return;
        }
        this.field1305.field3707 = 0;
        while (true) {
            class188 var1 = (class188) this.field1295.method4491();
            if (var1 == null || var1.field2340 > this.field1305.field3708.length - this.field1305.field3707) {
                this.field1307.method3274(this.field1305.field3708, 0, this.field1305.field3707);
                this.field1304 = 0;
                break;
            }
            this.field1305.method5211(var1.field2335.field3708, 0, var1.field2340);
            this.field1296 -= var1.field2340;
            var1.method3351();
            var1.field2335.method5121();
            var1.method3368();
        }
    }

    @ObfuscatedName("ci.o(Lgs;I)V")
    public final void method2109(class188 arg0) {
        this.field1295.method4479(arg0);
        arg0.field2340 = arg0.field2335.field3707;
        arg0.field2335.field3707 = 0;
        this.field1296 += arg0.field2340;
    }

    @ObfuscatedName("ci.e(Lkr;I)V")
    public void method2110(class306 arg0) {
        this.field1307 = arg0;
    }

    @ObfuscatedName("ci.i(I)V")
    public void method2111() {
        if (this.field1307 != null) {
            this.field1307.method3269();
            this.field1307 = null;
        }
    }

    @ObfuscatedName("ci.g(B)V")
    public void method2124() {
        this.field1307 = null;
    }

    @ObfuscatedName("ci.d(B)Lkr;")
    public class306 method2113() {
        return this.field1307;
    }
}
