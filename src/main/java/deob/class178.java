package deob;

import java.util.Iterator;

@ObfuscatedName("fu")
public class class178 implements Iterable {

    @ObfuscatedName("fu.t")
    public class182 field2850 = new class182();

    public class178() {
        this.field2850.field2854 = this.field2850;
        this.field2850.field2855 = this.field2850;
    }

    @ObfuscatedName("fu.t()V")
    public void method3203() {
        while (this.field2850.field2854 != this.field2850) {
            this.field2850.field2854.method3242();
        }
    }

    @ObfuscatedName("fu.o(Lfi;)V")
    public void method3205(class182 arg0) {
        if (arg0.field2855 != null) {
            arg0.method3242();
        }
        arg0.field2855 = this.field2850.field2855;
        arg0.field2854 = this.field2850;
        arg0.field2855.field2854 = arg0;
        arg0.field2854.field2855 = arg0;
    }

    public Iterator iterator() {
        return new class184(this);
    }
}
