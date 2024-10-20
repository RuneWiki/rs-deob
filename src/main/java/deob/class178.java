package deob;

import java.util.Iterator;

@ObfuscatedName("fp")
public class class178 implements Iterable {

    @ObfuscatedName("fp.i")
    public class182 field2855 = new class182();

    public class178() {
        this.field2855.field2859 = this.field2855;
        this.field2855.field2860 = this.field2855;
    }

    @ObfuscatedName("fp.i()V")
    public void method3276() {
        while (this.field2855.field2859 != this.field2855) {
            this.field2855.field2859.method3305();
        }
    }

    @ObfuscatedName("fp.c(Lfq;)V")
    public void method3277(class182 arg0) {
        if (arg0.field2860 != null) {
            arg0.method3305();
        }
        arg0.field2860 = this.field2855.field2860;
        arg0.field2859 = this.field2855;
        arg0.field2860.field2859 = arg0;
        arg0.field2859.field2860 = arg0;
    }

    public Iterator iterator() {
        return new class184(this);
    }
}
