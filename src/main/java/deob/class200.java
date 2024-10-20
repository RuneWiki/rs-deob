package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public class class200 implements Iterable {

    @ObfuscatedName("gd.g")
    public class204 field3084 = new class204();

    public class200() {
        this.field3084.field3089 = this.field3084;
        this.field3084.field3088 = this.field3084;
    }

    @ObfuscatedName("gd.g()V")
    public void method3633() {
        while (this.field3084.field3089 != this.field3084) {
            this.field3084.field3089.method3671();
        }
    }

    @ObfuscatedName("gd.b(Lgm;)V")
    public void method3632(class204 arg0) {
        if (arg0.field3088 != null) {
            arg0.method3671();
        }
        arg0.field3088 = this.field3084.field3088;
        arg0.field3089 = this.field3084;
        arg0.field3088.field3089 = arg0;
        arg0.field3089.field3088 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
