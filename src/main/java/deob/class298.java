package deob;

import java.util.Iterator;

@ObfuscatedName("kg")
public class class298 implements Iterator {

    @ObfuscatedName("kg.v")
    public class299 field3716;

    @ObfuscatedName("kg.n")
    public class347 field3715;

    @ObfuscatedName("kg.f")
    public class347 field3714 = null;

    public class298(class299 arg0) {
        this.field3716 = arg0;
        this.field3715 = this.field3716.field3718.field3931;
        this.field3714 = null;
    }

    public Object next() {
        class347 var1 = this.field3715;
        if (this.field3716.field3718 == var1) {
            var1 = null;
            this.field3715 = null;
        } else {
            this.field3715 = var1.field3931;
        }
        this.field3714 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3716.field3718 != this.field3715;
    }

    public void remove() {
        if (this.field3714 == null) {
            throw new IllegalStateException();
        }
        this.field3714.method5487();
        this.field3714 = null;
    }
}
