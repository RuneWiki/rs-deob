package deob;

import java.util.Iterator;

@ObfuscatedName("hw")
public class class223 implements Iterable {

    @ObfuscatedName("hw.a")
    public class214 field2533 = new class214();

    @ObfuscatedName("hw.s")
    public class214 field2534;

    public class223() {
        this.field2533.field2516 = this.field2533;
        this.field2533.field2515 = this.field2533;
    }

    @ObfuscatedName("hw.a()V")
    public void method4034() {
        while (this.field2533.field2516 != this.field2533) {
            this.field2533.field2516.method3997();
        }
    }

    @ObfuscatedName("hw.s(Lho;)V")
    public void method4027(class214 arg0) {
        if (arg0.field2515 != null) {
            arg0.method3997();
        }
        arg0.field2515 = this.field2533.field2515;
        arg0.field2516 = this.field2533;
        arg0.field2515.field2516 = arg0;
        arg0.field2516.field2515 = arg0;
    }

    @ObfuscatedName("hw.g()Lho;")
    public class214 method4028() {
        class214 var1 = this.field2533.field2516;
        if (this.field2533 == var1) {
            return null;
        } else {
            var1.method3997();
            return var1;
        }
    }

    @ObfuscatedName("hw.x()Lho;")
    public class214 method4025() {
        return this.method4048((class214) null);
    }

    @ObfuscatedName("hw.h(Lho;)Lho;")
    public class214 method4048(class214 arg0) {
        class214 var2;
        if (arg0 == null) {
            var2 = this.field2533.field2516;
        } else {
            var2 = arg0;
        }
        if (this.field2533 == var2) {
            this.field2534 = null;
            return null;
        } else {
            this.field2534 = var2.field2516;
            return var2;
        }
    }

    @ObfuscatedName("hw.f()Lho;")
    public class214 method4026() {
        class214 var1 = this.field2534;
        if (this.field2533 == var1) {
            this.field2534 = null;
            return null;
        } else {
            this.field2534 = var1.field2516;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class222(this);
    }
}
