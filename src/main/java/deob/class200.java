package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class200 implements Iterable {

    @ObfuscatedName("gm.z")
    public class204 field3087 = new class204();

    public class200() {
        this.field3087.field3092 = this.field3087;
        this.field3087.field3091 = this.field3087;
    }

    @ObfuscatedName("gm.z()V")
    public void method3530() {
        while (this.field3087.field3092 != this.field3087) {
            this.field3087.field3092.method3565();
        }
    }

    @ObfuscatedName("gm.q(Lgx;)V")
    public void method3526(class204 arg0) {
        if (arg0.field3091 != null) {
            arg0.method3565();
        }
        arg0.field3091 = this.field3087.field3091;
        arg0.field3092 = this.field3087;
        arg0.field3091.field3092 = arg0;
        arg0.field3092.field3091 = arg0;
    }

    public Iterator iterator() {
        return new class206(this);
    }
}
