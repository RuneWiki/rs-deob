package deob;

import java.util.Iterator;

@ObfuscatedName("fc")
public class class179 implements Iterable {

    @ObfuscatedName("fc.p")
    public class183 field2865 = new class183();

    public class179() {
        this.field2865.field2870 = this.field2865;
        this.field2865.field2869 = this.field2865;
    }

    @ObfuscatedName("fc.p()V")
    public void method3320() {
        while (this.field2865.field2870 != this.field2865) {
            this.field2865.field2870.method3356();
        }
    }

    @ObfuscatedName("fc.g(Lgl;)V")
    public void method3325(class183 arg0) {
        if (arg0.field2869 != null) {
            arg0.method3356();
        }
        arg0.field2869 = this.field2865.field2869;
        arg0.field2870 = this.field2865;
        arg0.field2869.field2870 = arg0;
        arg0.field2870.field2869 = arg0;
    }

    public Iterator iterator() {
        return new class185(this);
    }
}
