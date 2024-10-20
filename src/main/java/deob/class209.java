package deob;

import java.util.Iterator;

@ObfuscatedName("ht")
public class class209 implements Iterator {

    @ObfuscatedName("ht.x")
    public class206 field3166;

    @ObfuscatedName("ht.r")
    public class212 field3167;

    @ObfuscatedName("ht.j")
    public class212 field3165 = null;

    public class209(class206 arg0) {
        this.field3166 = arg0;
        this.field3167 = this.field3166.field3161.field3175;
        this.field3165 = null;
    }

    public Object next() {
        class212 var1 = this.field3167;
        if (this.field3166.field3161 == var1) {
            var1 = null;
            this.field3167 = null;
        } else {
            this.field3167 = var1.field3175;
        }
        this.field3165 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3166.field3161 != this.field3167;
    }

    public void remove() {
        if (this.field3165 == null) {
            throw new IllegalStateException();
        }
        this.field3165.method3695();
        this.field3165 = null;
    }
}
