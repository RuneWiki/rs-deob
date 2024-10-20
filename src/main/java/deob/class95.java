package deob;

import java.io.IOException;

@ObfuscatedName("ck")
public class class95 {

    @ObfuscatedName("ck.a")
    public class165 field1321;

    @ObfuscatedName("ck.s")
    public class211 field1305 = new class211();

    @ObfuscatedName("ck.g")
    public int field1311 = 0;

    @ObfuscatedName("ck.x")
    public class190 field1307 = new class190(5000);

    @ObfuscatedName("ck.h")
    public class198 field1308;

    @ObfuscatedName("ck.f")
    public class197 field1309 = new class197(40000);

    @ObfuscatedName("ck.p")
    public class176 field1310 = null;

    @ObfuscatedName("ck.m")
    public int field1313 = 0;

    @ObfuscatedName("ck.q")
    public boolean field1304 = true;

    @ObfuscatedName("ck.b")
    public int field1306 = 0;

    @ObfuscatedName("ck.n")
    public int field1314 = 0;

    @ObfuscatedName("ck.e")
    public class176 field1315;

    @ObfuscatedName("ck.r")
    public class176 field1316;

    @ObfuscatedName("ck.t")
    public class176 field1317;

    @ObfuscatedName("ck.a(B)V")
    public final void method2101() {
        this.field1305.method3931();
        this.field1311 = 0;
    }

    @ObfuscatedName("ck.s(B)V")
    public final void method2096() throws IOException {
        if (this.field1321 == null || this.field1311 <= 0) {
            return;
        }
        this.field1307.field2419 = 0;
        while (true) {
            class180 var1 = (class180) this.field1305.method3936();
            if (var1 == null || var1.field2347 > this.field1307.field2420.length - this.field1307.field2419) {
                this.field1321.method3255(this.field1307.field2420, 0, this.field1307.field2419);
                this.field1314 = 0;
                break;
            }
            this.field1307.method3449(var1.field2350.field2420, 0, var1.field2347);
            this.field1311 -= var1.field2347;
            var1.method3960();
            var1.field2350.method3438();
            var1.method3366();
        }
    }

    @ObfuscatedName("ck.g(Lfa;I)V")
    public final void method2097(class180 arg0) {
        this.field1305.method3932(arg0);
        arg0.field2347 = arg0.field2350.field2419;
        arg0.field2350.field2419 = 0;
        this.field1311 += arg0.field2347;
    }

    @ObfuscatedName("ck.x(Lfq;I)V")
    public void method2098(class165 arg0) {
        this.field1321 = arg0;
    }

    @ObfuscatedName("ck.h(B)V")
    public void method2099() {
        if (this.field1321 != null) {
            this.field1321.method3251();
            this.field1321 = null;
        }
    }

    @ObfuscatedName("ck.f(B)V")
    public void method2115() {
        this.field1321 = null;
    }

    @ObfuscatedName("ck.p(B)Lfq;")
    public class165 method2117() {
        return this.field1321;
    }
}
