package deob;

import java.io.IOException;

@ObfuscatedName("ch")
public class class99 {

    @ObfuscatedName("ch.c")
    public class356 field1287;

    @ObfuscatedName("ch.b")
    public class323 field1280 = new class323();

    @ObfuscatedName("ch.p")
    public int field1283 = 0;

    @ObfuscatedName("ch.m")
    public class419 field1282 = new class419(5000);

    @ObfuscatedName("ch.t")
    public class435 field1286;

    @ObfuscatedName("ch.s")
    public class418 field1284 = new class418(40000);

    @ObfuscatedName("ch.j")
    public class256 field1285 = null;

    @ObfuscatedName("ch.w")
    public int field1293 = 0;

    @ObfuscatedName("ch.n")
    public boolean field1279 = true;

    @ObfuscatedName("ch.r")
    public int field1288 = 0;

    @ObfuscatedName("ch.o")
    public int field1289 = 0;

    @ObfuscatedName("ch.v")
    public class256 field1290;

    @ObfuscatedName("ch.d")
    public class256 field1291;

    @ObfuscatedName("ch.h")
    public class256 field1292;

    @ObfuscatedName("ch.c(I)V")
    public final void method2335() {
        this.field1280.method5344();
        this.field1283 = 0;
    }

    @ObfuscatedName("ch.b(I)V")
    public final void method2329() throws IOException {
        if (this.field1287 == null || this.field1283 <= 0) {
            return;
        }
        this.field1282.field4475 = 0;
        while (true) {
            class255 var1 = (class255) this.field1280.method5348();
            if (var1 == null || var1.field2925 > this.field1282.field4477.length - this.field1282.field4475) {
                this.field1287.method2834(this.field1282.field4477, 0, this.field1282.field4475);
                this.field1289 = 0;
                break;
            }
            this.field1282.method6678(var1.field2930.field4477, 0, var1.field2925);
            this.field1283 -= var1.field2925;
            var1.method6163();
            var1.field2930.method6806();
            var1.method4536();
        }
    }

    @ObfuscatedName("ch.p(Liw;I)V")
    public final void method2328(class255 arg0) {
        this.field1280.method5345(arg0);
        arg0.field2925 = arg0.field2930.field4475;
        arg0.field2930.field4475 = 0;
        this.field1283 += arg0.field2925;
    }

    @ObfuscatedName("ch.m(Lmd;I)V")
    public void method2346(class356 arg0) {
        this.field1287 = arg0;
    }

    @ObfuscatedName("ch.t(I)V")
    public void method2332() {
        if (this.field1287 != null) {
            this.field1287.method2817();
            this.field1287 = null;
        }
    }

    @ObfuscatedName("ch.s(I)V")
    public void method2333() {
        this.field1287 = null;
    }

    @ObfuscatedName("ch.j(I)Lmd;")
    public class356 method2334() {
        return this.field1287;
    }
}
