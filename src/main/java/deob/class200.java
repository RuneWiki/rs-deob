package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public class class200 implements Iterable {

    @ObfuscatedName("gi.o")
    public class204 field3083 = new class204();

    public class200() {
        this.field3083.field3088 = this.field3083;
        this.field3083.field3087 = this.field3083;
    }

    @ObfuscatedName("gi.o()V")
    public void method3550() {
        while (this.field3083.field3088 != this.field3083) {
            this.field3083.field3088.method3580();
        }
    }

    @ObfuscatedName("gi.f(Lgn;)V")
    public void method3553(class204 arg0) {
        if (arg0.field3087 != null) {
            arg0.method3580();
        }
        arg0.field3087 = this.field3083.field3087;
        arg0.field3088 = this.field3083;
        arg0.field3087.field3088 = arg0;
        arg0.field3088.field3087 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
