package deob;

import java.io.IOException;

@ObfuscatedName("cc")
public class class99 {

    @ObfuscatedName("cc.l")
    public class344 field1285;

    @ObfuscatedName("cc.q")
    public class311 field1283 = new class311();

    @ObfuscatedName("cc.f")
    public int field1284 = 0;

    @ObfuscatedName("cc.j")
    public class401 field1296 = new class401(5000);

    @ObfuscatedName("cc.m")
    public class417 field1287;

    @ObfuscatedName("cc.k")
    public class400 field1295 = new class400(40000);

    @ObfuscatedName("cc.t")
    public class243 field1288 = null;

    @ObfuscatedName("cc.a")
    public int field1293 = 0;

    @ObfuscatedName("cc.e")
    public boolean field1290 = true;

    @ObfuscatedName("cc.i")
    public int field1291 = 0;

    @ObfuscatedName("cc.y")
    public int field1292 = 0;

    @ObfuscatedName("cc.w")
    public class243 field1282;

    @ObfuscatedName("cc.g")
    public class243 field1294;

    @ObfuscatedName("cc.v")
    public class243 field1289;

    @ObfuscatedName("cc.l(I)V")
    public final void method2262() {
        this.field1283.method5125();
        this.field1284 = 0;
    }

    @ObfuscatedName("cc.q(B)V")
    public final void method2253() throws IOException {
        if (this.field1285 == null || this.field1284 <= 0) {
            return;
        }
        this.field1296.field4292 = 0;
        while (true) {
            class242 var1 = (class242) this.field1283.method5074();
            if (var1 == null || var1.field2779 > this.field1296.field4294.length - this.field1296.field4292) {
                this.field1285.method2596(this.field1296.field4294, 0, this.field1296.field4292);
                this.field1292 = 0;
                break;
            }
            this.field1296.method6265(var1.field2780.field4294, 0, var1.field2779);
            this.field1284 -= var1.field2779;
            var1.method5775();
            var1.field2780.method6254();
            var1.method4236();
        }
    }

    @ObfuscatedName("cc.f(Lis;B)V")
    public final void method2246(class242 arg0) {
        this.field1283.method5089(arg0);
        arg0.field2779 = arg0.field2780.field4292;
        arg0.field2780.field4292 = 0;
        this.field1284 += arg0.field2779;
    }

    @ObfuscatedName("cc.j(Lmk;I)V")
    public void method2248(class344 arg0) {
        this.field1285 = arg0;
    }

    @ObfuscatedName("cc.m(I)V")
    public void method2249() {
        if (this.field1285 != null) {
            this.field1285.method2615();
            this.field1285 = null;
        }
    }

    @ObfuscatedName("cc.k(I)V")
    public void method2254() {
        this.field1285 = null;
    }

    @ObfuscatedName("cc.t(B)Lmk;")
    public class344 method2251() {
        return this.field1285;
    }
}
