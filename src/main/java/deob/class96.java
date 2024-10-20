package deob;

import java.io.IOException;

@ObfuscatedName("cc")
public class class96 {

    @ObfuscatedName("cc.u")
    public class305 field1304;

    @ObfuscatedName("cc.f")
    public class261 field1301 = new class261();

    @ObfuscatedName("cc.b")
    public int field1302 = 0;

    @ObfuscatedName("cc.g")
    public class300 field1309 = new class300(5000);

    @ObfuscatedName("cc.z")
    public class328 field1311;

    @ObfuscatedName("cc.p")
    public class299 field1305 = new class299(40000);

    @ObfuscatedName("cc.h")
    public class183 field1310 = null;

    @ObfuscatedName("cc.y")
    public int field1307 = 0;

    @ObfuscatedName("cc.w")
    public boolean field1308 = true;

    @ObfuscatedName("cc.i")
    public int field1306 = 0;

    @ObfuscatedName("cc.k")
    public int field1303 = 0;

    @ObfuscatedName("cc.x")
    public class183 field1300;

    @ObfuscatedName("cc.o")
    public class183 field1312;

    @ObfuscatedName("cc.e")
    public class183 field1313;

    @ObfuscatedName("cc.u(B)V")
    public final void method2069() {
        this.field1301.method4488();
        this.field1302 = 0;
    }

    @ObfuscatedName("cc.f(I)V")
    public final void method2070() throws IOException {
        if (this.field1304 == null || this.field1302 <= 0) {
            return;
        }
        this.field1309.field3707 = 0;
        while (true) {
            class188 var1 = (class188) this.field1301.method4491();
            if (var1 == null || var1.field2349 > this.field1309.field3708.length - this.field1309.field3707) {
                this.field1304.method3250(this.field1309.field3708, 0, this.field1309.field3707);
                this.field1303 = 0;
                break;
            }
            this.field1309.method5132(var1.field2347.field3708, 0, var1.field2349);
            this.field1302 -= var1.field2349;
            var1.method3332();
            var1.field2347.method5121();
            var1.method3347();
        }
    }

    @ObfuscatedName("cc.b(Lgx;B)V")
    public final void method2071(class188 arg0) {
        this.field1301.method4521(arg0);
        arg0.field2349 = arg0.field2347.field3707;
        arg0.field2347.field3707 = 0;
        this.field1302 += arg0.field2349;
    }

    @ObfuscatedName("cc.g(Lkn;I)V")
    public void method2072(class305 arg0) {
        this.field1304 = arg0;
    }

    @ObfuscatedName("cc.z(I)V")
    public void method2073() {
        if (this.field1304 != null) {
            this.field1304.method3243();
            this.field1304 = null;
        }
    }

    @ObfuscatedName("cc.p(B)V")
    public void method2076() {
        this.field1304 = null;
    }

    @ObfuscatedName("cc.h(B)Lkn;")
    public class305 method2075() {
        return this.field1304;
    }
}
