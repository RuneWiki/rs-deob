package deob;

import java.io.IOException;

@ObfuscatedName("cw")
public class class90 {

    @ObfuscatedName("cw.y")
    public class160 field1271;

    @ObfuscatedName("cw.c")
    public class206 field1270 = new class206();

    @ObfuscatedName("cw.n")
    public int field1277 = 0;

    @ObfuscatedName("cw.u")
    public class185 field1276 = new class185(5000);

    @ObfuscatedName("cw.i")
    public class193 field1273;

    @ObfuscatedName("cw.r")
    public class192 field1274 = new class192(40000);

    @ObfuscatedName("cw.j")
    public class171 field1275 = null;

    @ObfuscatedName("cw.p")
    public int field1278 = 0;

    @ObfuscatedName("cw.e")
    public boolean field1282 = true;

    @ObfuscatedName("cw.s")
    public int field1281 = 0;

    @ObfuscatedName("cw.v")
    public int field1279 = 0;

    @ObfuscatedName("cw.k")
    public class171 field1280;

    @ObfuscatedName("cw.o")
    public class171 field1269;

    @ObfuscatedName("cw.q")
    public class171 field1283;

    @ObfuscatedName("cw.y(I)V")
    public final void method1899() {
        this.field1270.method3736();
        this.field1277 = 0;
    }

    @ObfuscatedName("cw.c(I)V")
    public final void method1915() throws IOException {
        if (this.field1271 == null || this.field1277 <= 0) {
            return;
        }
        this.field1276.field2374 = 0;
        while (true) {
            class175 var1 = (class175) this.field1270.method3740();
            if (var1 == null || var1.field2298 > this.field1276.field2373.length - this.field1276.field2374) {
                this.field1271.method3031(this.field1276.field2373, 0, this.field1276.field2374);
                this.field1279 = 0;
                break;
            }
            this.field1276.method3263(var1.field2299.field2373, 0, var1.field2298);
            this.field1277 -= var1.field2298;
            var1.method3766();
            var1.field2299.method3329();
            var1.method3174();
        }
    }

    @ObfuscatedName("cw.n(Lfi;B)V")
    public final void method1901(class175 arg0) {
        this.field1270.method3749(arg0);
        arg0.field2298 = arg0.field2299.field2374;
        arg0.field2299.field2374 = 0;
        this.field1277 += arg0.field2298;
    }

    @ObfuscatedName("cw.u(Lfv;I)V")
    public void method1909(class160 arg0) {
        this.field1271 = arg0;
    }

    @ObfuscatedName("cw.i(I)V")
    public void method1903() {
        if (this.field1271 != null) {
            this.field1271.method3035();
            this.field1271 = null;
        }
    }

    @ObfuscatedName("cw.p(B)V")
    public void method1904() {
        this.field1271 = null;
    }

    @ObfuscatedName("cw.e(I)Lfv;")
    public class160 method1900() {
        return this.field1271;
    }
}
