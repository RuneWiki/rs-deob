package deob;

import java.util.Iterator;

@ObfuscatedName("fv")
public class class181 implements Iterable {

    @ObfuscatedName("fv.f")
    public class185 field2868 = new class185();

    public class181() {
        this.field2868.field2873 = this.field2868;
        this.field2868.field2872 = this.field2868;
    }

    @ObfuscatedName("fv.f()V")
    public void method3305() {
        while (this.field2868.field2873 != this.field2868) {
            this.field2868.field2873.method3347();
        }
    }

    @ObfuscatedName("fv.k(Lgt;)V")
    public void method3306(class185 arg0) {
        if (arg0.field2872 != null) {
            arg0.method3347();
        }
        arg0.field2872 = this.field2868.field2872;
        arg0.field2873 = this.field2868;
        arg0.field2872.field2873 = arg0;
        arg0.field2873.field2872 = arg0;
    }

    public Iterator iterator() {
        return new class187(this);
    }
}
