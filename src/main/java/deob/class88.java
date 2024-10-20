package deob;

import java.io.IOException;

@ObfuscatedName("cj")
public class class88 {

    @ObfuscatedName("cj.w")
    public class158 field1244;

    @ObfuscatedName("cj.m")
    public class204 field1242 = new class204();

    @ObfuscatedName("cj.q")
    public int field1243 = 0;

    @ObfuscatedName("cj.b")
    public class183 field1245 = new class183(5000);

    @ObfuscatedName("cj.f")
    public class191 field1251;

    @ObfuscatedName("cj.n")
    public class190 field1255 = new class190(40000);

    @ObfuscatedName("cj.h")
    public class169 field1247 = null;

    @ObfuscatedName("cj.x")
    public int field1248 = 0;

    @ObfuscatedName("cj.j")
    public boolean field1249 = true;

    @ObfuscatedName("cj.a")
    public int field1250 = 0;

    @ObfuscatedName("cj.l")
    public int field1253 = 0;

    @ObfuscatedName("cj.d")
    public class169 field1252;

    @ObfuscatedName("cj.s")
    public class169 field1246;

    @ObfuscatedName("cj.p")
    public class169 field1254;

    @ObfuscatedName("cj.w(B)V")
    public final void method1874() {
        this.field1242.method3764();
        this.field1243 = 0;
    }

    @ObfuscatedName("cj.m(B)V")
    public final void method1888() throws IOException {
        if (this.field1244 == null || this.field1243 <= 0) {
            return;
        }
        this.field1245.field2360 = 0;
        while (true) {
            class173 var1 = (class173) this.field1242.method3756();
            if (var1 == null || var1.field2281 > this.field1245.field2366.length - this.field1245.field2360) {
                this.field1244.method3042(this.field1245.field2366, 0, this.field1245.field2360);
                this.field1253 = 0;
                break;
            }
            this.field1245.method3322(var1.field2280.field2366, 0, var1.field2281);
            this.field1243 -= var1.field2281;
            var1.method3782();
            var1.field2280.method3245();
            var1.method3173();
        }
    }

    @ObfuscatedName("cj.q(Lfe;I)V")
    public final void method1873(class173 arg0) {
        this.field1242.method3753(arg0);
        arg0.field2281 = arg0.field2280.field2360;
        arg0.field2280.field2360 = 0;
        this.field1243 += arg0.field2281;
    }

    @ObfuscatedName("cj.x(Lft;I)V")
    public void method1876(class158 arg0) {
        this.field1244 = arg0;
    }

    @ObfuscatedName("cj.j(I)V")
    public void method1877() {
        if (this.field1244 != null) {
            this.field1244.method3043();
            this.field1244 = null;
        }
    }

    @ObfuscatedName("cj.a(B)V")
    public void method1878() {
        this.field1244 = null;
    }

    @ObfuscatedName("cj.l(B)Lft;")
    public class158 method1899() {
        return this.field1244;
    }
}
