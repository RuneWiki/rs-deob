package deob;

import java.io.IOException;

@ObfuscatedName("cr")
public class class90 {

    @ObfuscatedName("cr.c")
    public class160 field1281;

    @ObfuscatedName("cr.q")
    public class206 field1275 = new class206();

    @ObfuscatedName("cr.m")
    public int field1276 = 0;

    @ObfuscatedName("cr.j")
    public class185 field1274 = new class185(5000);

    @ObfuscatedName("cr.g")
    public class193 field1278;

    @ObfuscatedName("cr.i")
    public class192 field1279 = new class192(40000);

    @ObfuscatedName("cr.h")
    public class171 field1283 = null;

    @ObfuscatedName("cr.l")
    public int field1288 = 0;

    @ObfuscatedName("cr.d")
    public boolean field1282 = true;

    @ObfuscatedName("cr.o")
    public int field1285 = 0;

    @ObfuscatedName("cr.s")
    public int field1284 = 0;

    @ObfuscatedName("cr.k")
    public class171 field1280;

    @ObfuscatedName("cr.v")
    public class171 field1286;

    @ObfuscatedName("cr.p")
    public class171 field1287;

    @ObfuscatedName("cr.c(I)V")
    public final void method1854() {
        this.field1275.method3703();
        this.field1276 = 0;
    }

    @ObfuscatedName("cr.q(B)V")
    public final void method1845() throws IOException {
        if (this.field1281 == null || this.field1276 <= 0) {
            return;
        }
        this.field1274.field2386 = 0;
        while (true) {
            class175 var1 = (class175) this.field1275.method3706();
            if (var1 == null || var1.field2304 > this.field1274.field2388.length - this.field1274.field2386) {
                this.field1281.method3013(this.field1274.field2388, 0, this.field1274.field2386);
                this.field1284 = 0;
                break;
            }
            this.field1274.method3237(var1.field2308.field2388, 0, var1.field2304);
            this.field1276 -= var1.field2304;
            var1.method3733();
            var1.field2308.method3417();
            var1.method3146();
        }
    }

    @ObfuscatedName("cr.m(Lfn;I)V")
    public final void method1848(class175 arg0) {
        this.field1275.method3702(arg0);
        arg0.field2304 = arg0.field2308.field2386;
        arg0.field2308.field2386 = 0;
        this.field1276 += arg0.field2304;
    }

    @ObfuscatedName("cr.j(Lfu;I)V")
    public void method1861(class160 arg0) {
        this.field1281 = arg0;
    }

    @ObfuscatedName("cr.g(I)V")
    public void method1847() {
        if (this.field1281 != null) {
            this.field1281.method3034();
            this.field1281 = null;
        }
    }

    @ObfuscatedName("cr.i(I)V")
    public void method1849() {
        this.field1281 = null;
    }

    @ObfuscatedName("cr.h(B)Lfu;")
    public class160 method1850() {
        return this.field1281;
    }
}
