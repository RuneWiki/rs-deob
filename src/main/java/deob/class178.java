package deob;

import java.util.Iterator;

@ObfuscatedName("fv")
public class class178 implements Iterable {

    @ObfuscatedName("fv.e")
    public class182 field2851 = new class182();

    public class178() {
        this.field2851.field2855 = this.field2851;
        this.field2851.field2856 = this.field2851;
    }

    @ObfuscatedName("fv.e()V")
    public void method3220() {
        while (this.field2851.field2855 != this.field2851) {
            this.field2851.field2855.method3254();
        }
    }

    @ObfuscatedName("fv.v(Lfa;)V")
    public void method3218(class182 arg0) {
        if (arg0.field2856 != null) {
            arg0.method3254();
        }
        arg0.field2856 = this.field2851.field2856;
        arg0.field2855 = this.field2851;
        arg0.field2856.field2855 = arg0;
        arg0.field2855.field2856 = arg0;
    }

    public Iterator iterator() {
        return new class184(this);
    }
}
