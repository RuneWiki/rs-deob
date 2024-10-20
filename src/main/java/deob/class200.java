package deob;

import java.util.Iterator;

@ObfuscatedName("gd")
public class class200 implements Iterable {

    @ObfuscatedName("gd.c")
    public class204 field3082 = new class204();

    public class200() {
        this.field3082.field3087 = this.field3082;
        this.field3082.field3086 = this.field3082;
    }

    @ObfuscatedName("gd.c()V")
    public void method3592() {
        while (this.field3082.field3087 != this.field3082) {
            this.field3082.field3087.method3626();
        }
    }

    @ObfuscatedName("gd.h(Lgq;)V")
    public void method3589(class204 arg0) {
        if (arg0.field3086 != null) {
            arg0.method3626();
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
