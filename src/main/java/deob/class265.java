package deob;

import java.util.Iterator;

@ObfuscatedName("jp")
public class class265 implements Iterator {

    @ObfuscatedName("jp.u")
    public class261 field3547;

    @ObfuscatedName("jp.f")
    public class181 field3546;

    @ObfuscatedName("jp.b")
    public class181 field3548 = null;

    public class265(class261 arg0) {
        this.method4619(arg0);
    }

    @ObfuscatedName("jp.y(Ljm;)V")
    public void method4619(class261 arg0) {
        this.field3547 = arg0;
        this.method4616();
    }

    @ObfuscatedName("jp.w()V")
    public void method4616() {
        this.field3546 = this.field3547 == null ? null : this.field3547.field3537.field2127;
        this.field3548 = null;
    }

    public Object next() {
        class181 var1 = this.field3546;
        if (this.field3547.field3537 == var1) {
            var1 = null;
            this.field3546 = null;
        } else {
            this.field3546 = var1.field2127;
        }
        this.field3548 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3547.field3537 != this.field3546;
    }

    public void remove() {
        if (this.field3548 == null) {
            throw new IllegalStateException();
        }
        this.field3548.method3332();
        this.field3548 = null;
    }
}
