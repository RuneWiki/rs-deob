package deob;

import java.io.IOException;

@ObfuscatedName("cj")
public class class86 {

    @ObfuscatedName("cj.s")
    public class330 field1208;

    @ObfuscatedName("cj.t")
    public class298 field1202 = new class298();

    @ObfuscatedName("cj.v")
    public int field1203 = 0;

    @ObfuscatedName("cj.j")
    public class385 field1204 = new class385(5000);

    @ObfuscatedName("cj.l")
    public class401 field1205;

    @ObfuscatedName("cj.n")
    public class384 field1201 = new class384(40000);

    @ObfuscatedName("cj.w")
    public class230 field1206 = null;

    @ObfuscatedName("cj.f")
    public int field1209 = 0;

    @ObfuscatedName("cj.o")
    public boolean field1211 = true;

    @ObfuscatedName("cj.x")
    public int field1210 = 0;

    @ObfuscatedName("cj.r")
    public int field1216 = 0;

    @ObfuscatedName("cj.p")
    public class230 field1212;

    @ObfuscatedName("cj.h")
    public class230 field1214;

    @ObfuscatedName("cj.k")
    public class230 field1213;

    @ObfuscatedName("cj.s(I)V")
    public final void method1999() {
        this.field1202.method4796();
        this.field1203 = 0;
    }

    @ObfuscatedName("cj.t(S)V")
    public final void method1986() throws IOException {
        if (this.field1208 == null || this.field1203 <= 0) {
            return;
        }
        this.field1204.field4182 = 0;
        while (true) {
            class229 var1 = (class229) this.field1202.method4758();
            if (var1 == null || var1.field2688 > this.field1204.field4184.length - this.field1204.field4182) {
                this.field1208.method2342(this.field1204.field4184, 0, this.field1204.field4182);
                this.field1216 = 0;
                break;
            }
            this.field1204.method6013(var1.field2691.field4184, 0, var1.field2688);
            this.field1203 -= var1.field2688;
            var1.method5447();
            var1.field2691.method5951();
            var1.method3942();
        }
    }

    @ObfuscatedName("cj.v(Lhg;I)V")
    public final void method1987(class229 arg0) {
        this.field1202.method4755(arg0);
        arg0.field2688 = arg0.field2691.field4182;
        arg0.field2691.field4182 = 0;
        this.field1203 += arg0.field2688;
    }

    @ObfuscatedName("cj.j(Llp;I)V")
    public void method1988(class330 arg0) {
        this.field1208 = arg0;
    }

    @ObfuscatedName("cj.l(I)V")
    public void method1989() {
        if (this.field1208 != null) {
            this.field1208.method2335();
            this.field1208 = null;
        }
    }

    @ObfuscatedName("cj.n(I)V")
    public void method1985() {
        this.field1208 = null;
    }

    @ObfuscatedName("cj.w(I)Llp;")
    public class330 method1992() {
        return this.field1208;
    }
}
