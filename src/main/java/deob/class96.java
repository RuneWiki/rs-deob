package deob;

import java.io.IOException;

@ObfuscatedName("cl")
public class class96 {

    @ObfuscatedName("cl.z")
    public class305 field1297;

    @ObfuscatedName("cl.n")
    public class261 field1289 = new class261();

    @ObfuscatedName("cl.v")
    public int field1300 = 0;

    @ObfuscatedName("cl.u")
    public class300 field1290 = new class300(5000);

    @ObfuscatedName("cl.r")
    public class328 field1293;

    @ObfuscatedName("cl.p")
    public class299 field1294 = new class299(40000);

    @ObfuscatedName("cl.q")
    public class183 field1295 = null;

    @ObfuscatedName("cl.m")
    public int field1296 = 0;

    @ObfuscatedName("cl.y")
    public boolean field1291 = true;

    @ObfuscatedName("cl.i")
    public int field1298 = 0;

    @ObfuscatedName("cl.c")
    public int field1299 = 0;

    @ObfuscatedName("cl.b")
    public class183 field1301;

    @ObfuscatedName("cl.o")
    public class183 field1292;

    @ObfuscatedName("cl.a")
    public class183 field1302;

    @ObfuscatedName("cl.z(I)V")
    public final void method2036() {
        this.field1289.method4373();
        this.field1300 = 0;
    }

    @ObfuscatedName("cl.n(I)V")
    public final void method2037() throws IOException {
        if (this.field1297 == null || this.field1300 <= 0) {
            return;
        }
        this.field1290.field3702 = 0;
        while (true) {
            class188 var1 = (class188) this.field1289.method4385();
            if (var1 == null || var1.field2313 > this.field1290.field3699.length - this.field1290.field3702) {
                this.field1297.method3160(this.field1290.field3699, 0, this.field1290.field3702);
                this.field1299 = 0;
                break;
            }
            this.field1290.method4984(var1.field2315.field3699, 0, var1.field2313);
            this.field1300 -= var1.field2313;
            var1.method3249();
            var1.field2315.method4973();
            var1.method3274();
        }
    }

    @ObfuscatedName("cl.v(Lgn;I)V")
    public final void method2040(class188 arg0) {
        this.field1289.method4360(arg0);
        arg0.field2313 = arg0.field2315.field3702;
        arg0.field2315.field3702 = 0;
        this.field1300 += arg0.field2313;
    }

    @ObfuscatedName("cl.u(Lky;I)V")
    public void method2039(class305 arg0) {
        this.field1297 = arg0;
    }

    @ObfuscatedName("cl.r(I)V")
    public void method2041() {
        if (this.field1297 != null) {
            this.field1297.method3184();
            this.field1297 = null;
        }
    }

    @ObfuscatedName("cl.p(B)V")
    public void method2055() {
        this.field1297 = null;
    }

    @ObfuscatedName("cl.q(I)Lky;")
    public class305 method2042() {
        return this.field1297;
    }
}
