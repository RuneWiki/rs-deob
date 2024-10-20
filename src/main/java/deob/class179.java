package deob;

import java.util.Iterator;

@ObfuscatedName("fr")
public class class179 implements Iterable {

    @ObfuscatedName("fr.n")
    public class183 field2872 = new class183();

    public class179() {
        this.field2872.field2877 = this.field2872;
        this.field2872.field2876 = this.field2872;
    }

    @ObfuscatedName("fr.n()V")
    public void method3219() {
        while (this.field2872.field2877 != this.field2872) {
            this.field2872.field2877.method3253();
        }
    }

    @ObfuscatedName("fr.x(Lgr;)V")
    public void method3214(class183 arg0) {
        if (arg0.field2876 != null) {
            arg0.method3253();
        }
        arg0.field2876 = this.field2872.field2876;
        arg0.field2877 = this.field2872;
        arg0.field2876.field2877 = arg0;
        arg0.field2877.field2876 = arg0;
    }

    public Iterator iterator() {
        return new class185(this);
    }
}
