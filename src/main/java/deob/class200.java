package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public class class200 implements Iterable {

    @ObfuscatedName("gu.n")
    public class204 field3082 = new class204();

    public class200() {
        this.field3082.field3087 = this.field3082;
        this.field3082.field3086 = this.field3082;
    }

    @ObfuscatedName("gu.n()V")
    public void method3588() {
        while (this.field3082.field3087 != this.field3082) {
            this.field3082.field3087.method3627();
        }
    }

    @ObfuscatedName("gu.d(Lgt;)V")
    public void method3589(class204 arg0) {
        if (arg0.field3086 != null) {
            arg0.method3627();
        }
        arg0.field3086 = this.field3082.field3086;
        arg0.field3087 = this.field3082;
        arg0.field3086.field3087 = arg0;
        arg0.field3087.field3086 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
