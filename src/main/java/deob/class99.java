package deob;

import java.io.IOException;

@ObfuscatedName("cj")
public class class99 {

    @ObfuscatedName("cj.p")
    public class160 field1437;

    @ObfuscatedName("cj.i")
    public class203 field1446 = new class203();

    @ObfuscatedName("cj.w")
    public int field1438 = 0;

    @ObfuscatedName("cj.s")
    public class185 field1448 = new class185(5000);

    @ObfuscatedName("cj.j")
    public class192 field1440;

    @ObfuscatedName("cj.a")
    public class191 field1442 = new class191(40000);

    @ObfuscatedName("cj.t")
    public class171 field1445 = null;

    @ObfuscatedName("cj.r")
    public int field1443 = 0;

    @ObfuscatedName("cj.m")
    public boolean field1444 = true;

    @ObfuscatedName("cj.h")
    public int field1451 = 0;

    @ObfuscatedName("cj.o")
    public int field1439 = 0;

    @ObfuscatedName("cj.x")
    public class171 field1447;

    @ObfuscatedName("cj.q")
    public class171 field1436;

    @ObfuscatedName("cj.v")
    public class171 field1449;

    @ObfuscatedName("cj.p(I)V")
    public final void method1898() {
        this.field1446.method3539();
        this.field1438 = 0;
    }

    @ObfuscatedName("cj.i(I)V")
    public final void method1878() throws IOException {
        if (this.field1437 == null || this.field1438 <= 0) {
            return;
        }
        this.field1448.field2488 = 0;
        while (true) {
            class175 var1 = (class175) this.field1446.method3556();
            if (var1 == null || var1.field2401 > this.field1448.field2491.length - this.field1448.field2488) {
                this.field1437.method2896(this.field1448.field2491, 0, this.field1448.field2488);
                this.field1439 = 0;
                break;
            }
            this.field1448.method3117(var1.field2403.field2491, 0, var1.field2401);
            this.field1438 -= var1.field2401;
            var1.method3561();
            var1.field2403.method3106();
            var1.method3020();
        }
    }

    @ObfuscatedName("cj.w(Lfa;I)V")
    public final void method1879(class175 arg0) {
        this.field1446.method3533(arg0);
        arg0.field2401 = arg0.field2403.field2488;
        arg0.field2403.field2488 = 0;
        this.field1438 += arg0.field2401;
    }

    @ObfuscatedName("cj.s(Lfn;B)V")
    public void method1885(class160 arg0) {
        this.field1437 = arg0;
    }

    @ObfuscatedName("cj.j(I)V")
    public void method1877() {
        if (this.field1437 != null) {
            this.field1437.method2897();
            this.field1437 = null;
        }
    }

    @ObfuscatedName("cj.a(I)V")
    public void method1881() {
        this.field1437 = null;
    }

    @ObfuscatedName("cj.t(I)Lfn;")
    public class160 method1880() {
        return this.field1437;
    }
}
