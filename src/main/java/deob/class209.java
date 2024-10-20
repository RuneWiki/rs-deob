package deob;

import java.util.Iterator;

@ObfuscatedName("hg")
public class class209 implements Iterator {

    @ObfuscatedName("hg.m")
    public class206 field3161;

    @ObfuscatedName("hg.w")
    public class212 field3160;

    @ObfuscatedName("hg.e")
    public class212 field3159 = null;

    public class209(class206 arg0) {
        this.field3161 = arg0;
        this.field3160 = this.field3161.field3155.field3169;
        this.field3159 = null;
    }

    public Object next() {
        class212 var1 = this.field3160;
        if (this.field3161.field3155 == var1) {
            var1 = null;
            this.field3160 = null;
        } else {
            this.field3160 = var1.field3169;
        }
        this.field3159 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3161.field3155 != this.field3160;
    }

    public void remove() {
        if (this.field3159 == null) {
            throw new IllegalStateException();
        }
        this.field3159.method3729();
        this.field3159 = null;
    }
}
