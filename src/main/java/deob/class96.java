package deob;

import java.io.IOException;

@ObfuscatedName("cg")
public class class96 {

    @ObfuscatedName("cg.q")
    public class306 field1321;

    @ObfuscatedName("cg.w")
    public class261 field1317 = new class261();

    @ObfuscatedName("cg.e")
    public int field1312 = 0;

    @ObfuscatedName("cg.p")
    public class301 field1313 = new class301(5000);

    @ObfuscatedName("cg.k")
    public class329 field1314;

    @ObfuscatedName("cg.l")
    public class300 field1315 = new class300(40000);

    @ObfuscatedName("cg.b")
    public class183 field1311 = null;

    @ObfuscatedName("cg.i")
    public int field1316 = 0;

    @ObfuscatedName("cg.c")
    public boolean field1323 = true;

    @ObfuscatedName("cg.f")
    public int field1319 = 0;

    @ObfuscatedName("cg.m")
    public int field1320 = 0;

    @ObfuscatedName("cg.u")
    public class183 field1310;

    @ObfuscatedName("cg.x")
    public class183 field1322;

    @ObfuscatedName("cg.r")
    public class183 field1318;

    @ObfuscatedName("cg.q(I)V")
    public final void method2022() {
        this.field1317.method4418();
        this.field1312 = 0;
    }

    @ObfuscatedName("cg.w(I)V")
    public final void method2038() throws IOException {
        if (this.field1321 == null || this.field1312 <= 0) {
            return;
        }
        this.field1313.field3733 = 0;
        while (true) {
            class188 var1 = (class188) this.field1317.method4453();
            if (var1 == null || var1.field2332 > this.field1313.field3731.length - this.field1313.field3733) {
                this.field1321.method3210(this.field1313.field3731, 0, this.field1313.field3733);
                this.field1320 = 0;
                break;
            }
            this.field1313.method5061(var1.field2334.field3731, 0, var1.field2332);
            this.field1312 -= var1.field2332;
            var1.method3286();
            var1.field2334.method5050();
            var1.method3299();
        }
    }

    @ObfuscatedName("cg.e(Lgb;I)V")
    public final void method2023(class188 arg0) {
        this.field1317.method4434(arg0);
        arg0.field2332 = arg0.field2334.field3733;
        arg0.field2334.field3733 = 0;
        this.field1312 += arg0.field2332;
    }

    @ObfuscatedName("cg.p(Lky;I)V")
    public void method2025(class306 arg0) {
        this.field1321 = arg0;
    }

    @ObfuscatedName("cg.k(S)V")
    public void method2037() {
        if (this.field1321 != null) {
            this.field1321.method3204();
            this.field1321 = null;
        }
    }

    @ObfuscatedName("cg.l(B)V")
    public void method2028() {
        this.field1321 = null;
    }

    @ObfuscatedName("cg.b(S)Lky;")
    public class306 method2027() {
        return this.field1321;
    }
}
