package deob;

import java.util.Iterator;

@ObfuscatedName("eo")
public class class137 implements Iterable {

    @ObfuscatedName("eo.i")
    public class130 field1897 = new class130();

    public class137() {
        this.field1897.field1882 = this.field1897;
        this.field1897.field1883 = this.field1897;
    }

    @ObfuscatedName("eo.i()V")
    public void method2278() {
        while (this.field1897.field1882 != this.field1897) {
            this.field1897.field1882.method2238();
        }
    }

    @ObfuscatedName("eo.e(Ldk;)V")
    public void method2279(class130 arg0) {
        if (arg0.field1883 != null) {
            arg0.method2238();
        }
        arg0.field1883 = this.field1897.field1883;
        arg0.field1882 = this.field1897;
        arg0.field1883.field1882 = arg0;
        arg0.field1882.field1883 = arg0;
    }

    public Iterator iterator() {
        return new class136(this);
    }
}
