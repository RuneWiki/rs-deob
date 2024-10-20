package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public class class183 implements Iterable {

    @ObfuscatedName("gd.a")
    public class187 field2893 = new class187();

    public class183() {
        this.field2893.field2897 = this.field2893;
        this.field2893.field2898 = this.field2893;
    }

    @ObfuscatedName("gd.a()V")
    public void method3289() {
        while (this.field2893.field2897 != this.field2893) {
            this.field2893.field2897.method3320();
        }
    }

    @ObfuscatedName("gd.v(Lge;)V")
    public void method3288(class187 arg0) {
        if (arg0.field2898 != null) {
            arg0.method3320();
        }
        arg0.field2898 = this.field2893.field2898;
        arg0.field2897 = this.field2893;
        arg0.field2898.field2897 = arg0;
        arg0.field2897.field2898 = arg0;
    }

    public Iterator iterator() {
        return new class189(this);
    }
}
