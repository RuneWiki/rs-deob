package deob;

import java.io.IOException;

@ObfuscatedName("cx")
public class class99 {

    @ObfuscatedName("cx.c")
    public class361 field1317;

    @ObfuscatedName("cx.l")
    public class328 field1316 = new class328();

    @ObfuscatedName("cx.s")
    public int field1315 = 0;

    @ObfuscatedName("cx.e")
    public class421 field1322 = new class421(5000);

    @ObfuscatedName("cx.r")
    public class437 field1319;

    @ObfuscatedName("cx.o")
    public class420 field1318 = new class420(40000);

    @ObfuscatedName("cx.i")
    public class258 field1321 = null;

    @ObfuscatedName("cx.w")
    public int field1320 = 0;

    @ObfuscatedName("cx.v")
    public boolean field1323 = true;

    @ObfuscatedName("cx.a")
    public int field1324 = 0;

    @ObfuscatedName("cx.y")
    public int field1325 = 0;

    @ObfuscatedName("cx.u")
    public class258 field1326;

    @ObfuscatedName("cx.h")
    public class258 field1327;

    @ObfuscatedName("cx.q")
    public class258 field1328;

    @ObfuscatedName("cx.c(B)V")
    public final void method2266() {
        this.field1316.method5307();
        this.field1315 = 0;
    }

    @ObfuscatedName("cx.l(I)V")
    public final void method2267() throws IOException {
        if (this.field1317 == null || this.field1315 <= 0) {
            return;
        }
        this.field1322.field4512 = 0;
        while (true) {
            class257 var1 = (class257) this.field1316.method5311();
            if (var1 == null || var1.field2957 > this.field1322.field4511.length - this.field1322.field4512) {
                this.field1317.method2788(this.field1322.field4511, 0, this.field1322.field4512);
                this.field1325 = 0;
                break;
            }
            this.field1322.method6657(var1.field2960.field4511, 0, var1.field2957);
            this.field1315 -= var1.field2957;
            var1.method6167();
            var1.field2960.method6690();
            var1.method4497();
        }
    }

    @ObfuscatedName("cx.s(Lii;I)V")
    public final void method2268(class257 arg0) {
        this.field1316.method5347(arg0);
        arg0.field2957 = arg0.field2960.field4512;
        arg0.field2960.field4512 = 0;
        this.field1315 += arg0.field2957;
    }

    @ObfuscatedName("cx.e(Lmg;I)V")
    public void method2278(class361 arg0) {
        this.field1317 = arg0;
    }

    @ObfuscatedName("cx.r(B)V")
    public void method2270() {
        if (this.field1317 != null) {
            this.field1317.method2780();
            this.field1317 = null;
        }
    }

    @ObfuscatedName("cx.o(I)V")
    public void method2284() {
        this.field1317 = null;
    }

    @ObfuscatedName("cx.i(I)Lmg;")
    public class361 method2271() {
        return this.field1317;
    }
}
