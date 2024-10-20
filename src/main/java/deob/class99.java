package deob;

import java.io.IOException;

@ObfuscatedName("cf")
public class class99 {

    @ObfuscatedName("cf.b")
    public class169 field1436;

    @ObfuscatedName("cf.q")
    public class212 field1432 = new class212();

    @ObfuscatedName("cf.o")
    public int field1431 = 0;

    @ObfuscatedName("cf.p")
    public class194 field1434 = new class194(5000);

    @ObfuscatedName("cf.a")
    public class201 field1435;

    @ObfuscatedName("cf.h")
    public class200 field1439 = new class200(40000);

    @ObfuscatedName("cf.l")
    public class180 field1437 = null;

    @ObfuscatedName("cf.y")
    public int field1438 = 0;

    @ObfuscatedName("cf.g")
    public boolean field1445 = true;

    @ObfuscatedName("cf.c")
    public int field1440 = 0;

    @ObfuscatedName("cf.u")
    public int field1441 = 0;

    @ObfuscatedName("cf.r")
    public class180 field1442;

    @ObfuscatedName("cf.d")
    public class180 field1443;

    @ObfuscatedName("cf.v")
    public class180 field1444;

    @ObfuscatedName("cf.b(I)V")
    public final void method1885() {
        this.field1432.method3691();
        this.field1431 = 0;
    }

    @ObfuscatedName("cf.q(I)V")
    public final void method1911() throws IOException {
        if (this.field1436 == null || this.field1431 <= 0) {
            return;
        }
        this.field1434.field2538 = 0;
        while (true) {
            class184 var1 = (class184) this.field1432.method3696();
            if (var1 == null || var1.field2461 > this.field1434.field2541.length - this.field1434.field2538) {
                this.field1436.method3019(this.field1434.field2541, 0, this.field1434.field2538);
                this.field1441 = 0;
                break;
            }
            this.field1434.method3242(var1.field2468.field2541, 0, var1.field2461);
            this.field1431 -= var1.field2461;
            var1.method3726();
            var1.field2468.method3231();
            var1.method3147();
        }
    }

    @ObfuscatedName("cf.o(Lgc;S)V")
    public final void method1893(class184 arg0) {
        this.field1432.method3720(arg0);
        arg0.field2461 = arg0.field2468.field2538;
        arg0.field2468.field2538 = 0;
        this.field1431 += arg0.field2461;
    }

    @ObfuscatedName("cf.p(Lfi;I)V")
    public void method1887(class169 arg0) {
        this.field1436 = arg0;
    }

    @ObfuscatedName("cf.a(I)V")
    public void method1888() {
        if (this.field1436 != null) {
            this.field1436.method3020();
            this.field1436 = null;
        }
    }

    @ObfuscatedName("cf.h(I)V")
    public void method1889() {
        this.field1436 = null;
    }

    @ObfuscatedName("cf.l(I)Lfi;")
    public class169 method1902() {
        return this.field1436;
    }
}
