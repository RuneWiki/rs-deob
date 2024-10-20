package deob;

import java.io.IOException;

@ObfuscatedName("cf")
public class class90 {

    @ObfuscatedName("cf.g")
    public class160 field1292;

    @ObfuscatedName("cf.r")
    public class206 field1280 = new class206();

    @ObfuscatedName("cf.e")
    public int field1291 = 0;

    @ObfuscatedName("cf.q")
    public class185 field1282 = new class185(5000);

    @ObfuscatedName("cf.c")
    public class193 field1283;

    @ObfuscatedName("cf.l")
    public class192 field1284 = new class192(40000);

    @ObfuscatedName("cf.b")
    public class171 field1281 = null;

    @ObfuscatedName("cf.w")
    public int field1286 = 0;

    @ObfuscatedName("cf.n")
    public boolean field1287 = true;

    @ObfuscatedName("cf.i")
    public int field1288 = 0;

    @ObfuscatedName("cf.p")
    public int field1289 = 0;

    @ObfuscatedName("cf.m")
    public class171 field1296;

    @ObfuscatedName("cf.d")
    public class171 field1285;

    @ObfuscatedName("cf.j")
    public class171 field1279;

    @ObfuscatedName("cf.g(I)V")
    public final void method2061() {
        this.field1280.method3948();
        this.field1291 = 0;
    }

    @ObfuscatedName("cf.r(I)V")
    public final void method2054() throws IOException {
        if (this.field1292 == null || this.field1291 <= 0) {
            return;
        }
        this.field1282.field2406 = 0;
        while (true) {
            class175 var1 = (class175) this.field1280.method3931();
            if (var1 == null || var1.field2334 > this.field1282.field2405.length - this.field1282.field2406) {
                this.field1292.method3234(this.field1282.field2405, 0, this.field1282.field2406);
                this.field1289 = 0;
                break;
            }
            this.field1282.method3459(var1.field2333.field2405, 0, var1.field2334);
            this.field1291 -= var1.field2334;
            var1.method3952();
            var1.field2333.method3448();
            var1.method3364();
        }
    }

    @ObfuscatedName("cf.e(Lfm;I)V")
    public final void method2060(class175 arg0) {
        this.field1280.method3950(arg0);
        arg0.field2334 = arg0.field2333.field2406;
        arg0.field2333.field2406 = 0;
        this.field1291 += arg0.field2334;
    }

    @ObfuscatedName("cf.q(Lfh;I)V")
    public void method2056(class160 arg0) {
        this.field1292 = arg0;
    }

    @ObfuscatedName("cf.c(B)V")
    public void method2057() {
        if (this.field1292 != null) {
            this.field1292.method3230();
            this.field1292 = null;
        }
    }

    @ObfuscatedName("cf.i(B)V")
    public void method2058() {
        this.field1292 = null;
    }

    @ObfuscatedName("cf.p(B)Lfh;")
    public class160 method2059() {
        return this.field1292;
    }
}
