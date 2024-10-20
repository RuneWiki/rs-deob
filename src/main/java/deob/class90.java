package deob;

import java.io.IOException;

@ObfuscatedName("cq")
public class class90 {

    @ObfuscatedName("cq.f")
    public class160 field1282;

    @ObfuscatedName("cq.l")
    public class206 field1280 = new class206();

    @ObfuscatedName("cq.w")
    public int field1277 = 0;

    @ObfuscatedName("cq.s")
    public class185 field1278 = new class185(5000);

    @ObfuscatedName("cq.e")
    public class193 field1287;

    @ObfuscatedName("cq.a")
    public class192 field1281 = new class192(40000);

    @ObfuscatedName("cq.c")
    public class171 field1276 = null;

    @ObfuscatedName("cq.p")
    public int field1285 = 0;

    @ObfuscatedName("cq.r")
    public boolean field1283 = true;

    @ObfuscatedName("cq.m")
    public int field1284 = 0;

    @ObfuscatedName("cq.d")
    public int field1279 = 0;

    @ObfuscatedName("cq.z")
    public class171 field1286;

    @ObfuscatedName("cq.x")
    public class171 field1275;

    @ObfuscatedName("cq.v")
    public class171 field1288;

    @ObfuscatedName("cq.f(I)V")
    public final void method1942() {
        this.field1280.method3801();
        this.field1277 = 0;
    }

    @ObfuscatedName("cq.l(I)V")
    public final void method1962() throws IOException {
        if (this.field1282 == null || this.field1277 <= 0) {
            return;
        }
        this.field1278.field2414 = 0;
        while (true) {
            class175 var1 = (class175) this.field1280.method3793();
            if (var1 == null || var1.field2337 > this.field1278.field2415.length - this.field1278.field2414) {
                this.field1282.method3112(this.field1278.field2415, 0, this.field1278.field2414);
                this.field1279 = 0;
                break;
            }
            this.field1278.method3339(var1.field2335.field2415, 0, var1.field2337);
            this.field1277 -= var1.field2337;
            var1.method3818();
            var1.field2335.method3328();
            var1.method3245();
        }
    }

    @ObfuscatedName("cq.w(Lfl;B)V")
    public final void method1944(class175 arg0) {
        this.field1280.method3796(arg0);
        arg0.field2337 = arg0.field2335.field2414;
        arg0.field2335.field2414 = 0;
        this.field1277 += arg0.field2337;
    }

    @ObfuscatedName("cq.s(Lfo;B)V")
    public void method1945(class160 arg0) {
        this.field1282 = arg0;
    }

    @ObfuscatedName("cq.e(I)V")
    public void method1963() {
        if (this.field1282 != null) {
            this.field1282.method3113();
            this.field1282 = null;
        }
    }

    @ObfuscatedName("cq.c(B)V")
    public void method1947() {
        this.field1282 = null;
    }

    @ObfuscatedName("cq.p(I)Lfo;")
    public class160 method1957() {
        return this.field1282;
    }
}
