package deob;

import java.util.Iterator;

@ObfuscatedName("fz")
public class class178 implements Iterable {

    @ObfuscatedName("fz.t")
    public class182 field2849 = new class182();

    public class178() {
        this.field2849.field2853 = this.field2849;
        this.field2849.field2854 = this.field2849;
    }

    @ObfuscatedName("fz.t()V")
    public void method3265() {
        while (this.field2849.field2853 != this.field2849) {
            this.field2849.field2853.method3299();
        }
    }

    @ObfuscatedName("fz.s(Lfe;)V")
    public void method3269(class182 arg0) {
        if (arg0.field2854 != null) {
            arg0.method3299();
        }
        arg0.field2854 = this.field2849.field2854;
        arg0.field2853 = this.field2849;
        arg0.field2854.field2853 = arg0;
        arg0.field2853.field2854 = arg0;
    }

    public Iterator iterator() {
        return new class184(this);
    }
}
