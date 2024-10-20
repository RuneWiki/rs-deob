package deob;

import java.io.IOException;

@ObfuscatedName("cl")
public class class96 {

    @ObfuscatedName("cl.m")
    public class171 field1291;

    @ObfuscatedName("cl.f")
    public class272 field1290 = new class272();

    @ObfuscatedName("cl.q")
    public int field1286 = 0;

    @ObfuscatedName("cl.w")
    public class202 field1287 = new class202(5000);

    @ObfuscatedName("cl.o")
    public class210 field1284;

    @ObfuscatedName("cl.u")
    public class209 field1289 = new class209(40000);

    @ObfuscatedName("cl.g")
    public class188 field1285 = null;

    @ObfuscatedName("cl.l")
    public int field1297 = 0;

    @ObfuscatedName("cl.e")
    public boolean field1292 = true;

    @ObfuscatedName("cl.x")
    public int field1293 = 0;

    @ObfuscatedName("cl.d")
    public int field1294 = 0;

    @ObfuscatedName("cl.k")
    public class188 field1295;

    @ObfuscatedName("cl.n")
    public class188 field1296;

    @ObfuscatedName("cl.i")
    public class188 field1288;

    @ObfuscatedName("cl.m(I)V")
    public final void method2054() {
        this.field1290.method4819();
        this.field1286 = 0;
    }

    @ObfuscatedName("cl.f(I)V")
    public final void method2071() throws IOException {
        if (this.field1291 == null || this.field1286 <= 0) {
            return;
        }
        this.field1287.field2439 = 0;
        while (true) {
            class192 var1 = (class192) this.field1290.method4823();
            if (var1 == null || var1.field2357 > this.field1287.field2440.length - this.field1287.field2439) {
                this.field1291.method3178(this.field1287.field2440, 0, this.field1287.field2439);
                this.field1294 = 0;
                break;
            }
            this.field1287.method3546(var1.field2356.field2440, 0, var1.field2357);
            this.field1286 -= var1.field2357;
            var1.method3306();
            var1.field2356.method3555();
            var1.method3323();
        }
    }

    @ObfuscatedName("cl.q(Lgg;I)V")
    public final void method2056(class192 arg0) {
        this.field1290.method4842(arg0);
        arg0.field2357 = arg0.field2356.field2439;
        arg0.field2356.field2439 = 0;
        this.field1286 += arg0.field2357;
    }

    @ObfuscatedName("cl.w(Lfu;B)V")
    public void method2057(class171 arg0) {
        this.field1291 = arg0;
    }

    @ObfuscatedName("cl.o(I)V")
    public void method2058() {
        if (this.field1291 != null) {
            this.field1291.method3179();
            this.field1291 = null;
        }
    }

    @ObfuscatedName("cl.u(B)V")
    public void method2055() {
        this.field1291 = null;
    }

    @ObfuscatedName("cl.g(I)Lfu;")
    public class171 method2061() {
        return this.field1291;
    }
}
