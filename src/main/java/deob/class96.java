package deob;

import java.io.IOException;

@ObfuscatedName("cr")
public class class96 {

    @ObfuscatedName("cr.f")
    public class305 field1295;

    @ObfuscatedName("cr.i")
    public class261 field1291 = new class261();

    @ObfuscatedName("cr.y")
    public int field1292 = 0;

    @ObfuscatedName("cr.w")
    public class300 field1293 = new class300(5000);

    @ObfuscatedName("cr.p")
    public class328 field1294;

    @ObfuscatedName("cr.b")
    public class299 field1290 = new class299(40000);

    @ObfuscatedName("cr.e")
    public class177 field1303 = null;

    @ObfuscatedName("cr.x")
    public int field1296 = 0;

    @ObfuscatedName("cr.a")
    public boolean field1298 = true;

    @ObfuscatedName("cr.d")
    public int field1299 = 0;

    @ObfuscatedName("cr.c")
    public int field1297 = 0;

    @ObfuscatedName("cr.o")
    public class177 field1301;

    @ObfuscatedName("cr.v")
    public class177 field1302;

    @ObfuscatedName("cr.k")
    public class177 field1300;

    @ObfuscatedName("cr.f(B)V")
    public final void method2101() {
        this.field1291.method4444();
        this.field1292 = 0;
    }

    @ObfuscatedName("cr.i(I)V")
    public final void method2083() throws IOException {
        if (this.field1295 == null || this.field1292 <= 0) {
            return;
        }
        this.field1293.field3703 = 0;
        while (true) {
            class182 var1 = (class182) this.field1291.method4447();
            if (var1 == null || var1.field2307 > this.field1293.field3704.length - this.field1293.field3703) {
                this.field1295.method3197(this.field1293.field3704, 0, this.field1293.field3703);
                this.field1297 = 0;
                break;
            }
            this.field1293.method5104(var1.field2303.field3704, 0, var1.field2307);
            this.field1292 -= var1.field2307;
            var1.method3292();
            var1.field2303.method5173();
            var1.method3279();
        }
    }

    @ObfuscatedName("cr.y(Lfz;I)V")
    public final void method2084(class182 arg0) {
        this.field1291.method4445(arg0);
        arg0.field2307 = arg0.field2303.field3703;
        arg0.field2303.field3703 = 0;
        this.field1292 += arg0.field2307;
    }

    @ObfuscatedName("cr.w(Lky;I)V")
    public void method2100(class305 arg0) {
        this.field1295 = arg0;
    }

    @ObfuscatedName("cr.p(I)V")
    public void method2086() {
        if (this.field1295 != null) {
            this.field1295.method3191();
            this.field1295 = null;
        }
    }

    @ObfuscatedName("cr.b(I)V")
    public void method2087() {
        this.field1295 = null;
    }

    @ObfuscatedName("cr.e(I)Lky;")
    public class305 method2103() {
        return this.field1295;
    }
}
