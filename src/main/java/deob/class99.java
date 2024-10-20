package deob;

import java.io.IOException;

@ObfuscatedName("ca")
public class class99 {

    @ObfuscatedName("ca.s")
    public class160 field1449;

    @ObfuscatedName("ca.g")
    public class203 field1445 = new class203();

    @ObfuscatedName("ca.m")
    public int field1446 = 0;

    @ObfuscatedName("ca.h")
    public class185 field1448 = new class185(5000);

    @ObfuscatedName("ca.i")
    public class192 field1455;

    @ObfuscatedName("ca.w")
    public class191 field1454 = new class191(40000);

    @ObfuscatedName("ca.t")
    public class171 field1451 = null;

    @ObfuscatedName("ca.d")
    public int field1452 = 0;

    @ObfuscatedName("ca.z")
    public boolean field1453 = true;

    @ObfuscatedName("ca.k")
    public int field1457 = 0;

    @ObfuscatedName("ca.c")
    public int field1450 = 0;

    @ObfuscatedName("ca.o")
    public class171 field1456;

    @ObfuscatedName("ca.l")
    public class171 field1447;

    @ObfuscatedName("ca.f")
    public class171 field1458;

    @ObfuscatedName("ca.s(B)V")
    public final void method1904() {
        this.field1445.method3706();
        this.field1446 = 0;
    }

    @ObfuscatedName("ca.g(I)V")
    public final void method1906() throws IOException {
        if (this.field1449 == null || this.field1446 <= 0) {
            return;
        }
        this.field1448.field2514 = 0;
        while (true) {
            class175 var1 = (class175) this.field1445.method3723();
            if (var1 == null || var1.field2438 > this.field1448.field2512.length - this.field1448.field2514) {
                this.field1449.method3029(this.field1448.field2512, 0, this.field1448.field2514);
                this.field1450 = 0;
                break;
            }
            this.field1448.method3233(var1.field2440.field2512, 0, var1.field2438);
            this.field1446 -= var1.field2438;
            var1.method3740();
            var1.field2440.method3305();
            var1.method3144();
        }
    }

    @ObfuscatedName("ca.m(Lfv;B)V")
    public final void method1907(class175 arg0) {
        this.field1445.method3707(arg0);
        arg0.field2438 = arg0.field2440.field2514;
        arg0.field2440.field2514 = 0;
        this.field1446 += arg0.field2438;
    }

    @ObfuscatedName("ca.h(Lff;I)V")
    public void method1923(class160 arg0) {
        this.field1449 = arg0;
    }

    @ObfuscatedName("ca.i(I)V")
    public void method1909() {
        if (this.field1449 != null) {
            this.field1449.method3022();
            this.field1449 = null;
        }
    }

    @ObfuscatedName("ca.w(B)V")
    public void method1910() {
        this.field1449 = null;
    }

    @ObfuscatedName("ca.t(I)Lff;")
    public class160 method1911() {
        return this.field1449;
    }
}
