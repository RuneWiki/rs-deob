package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public class class183 implements Iterable {

    @ObfuscatedName("gb.b")
    public class187 field2890 = new class187();

    public class183() {
        this.field2890.field2894 = this.field2890;
        this.field2890.field2895 = this.field2890;
    }

    @ObfuscatedName("gb.b()V")
    public void method3329() {
        while (this.field2890.field2894 != this.field2890) {
            this.field2890.field2894.method3367();
        }
    }

    @ObfuscatedName("gb.e(Lgw;)V")
    public void method3320(class187 arg0) {
        if (arg0.field2895 != null) {
            arg0.method3367();
        }
        arg0.field2895 = this.field2890.field2895;
        arg0.field2894 = this.field2890;
        arg0.field2895.field2894 = arg0;
        arg0.field2894.field2895 = arg0;
    }

    public Iterator iterator() {
        return new class189(this);
    }
}
