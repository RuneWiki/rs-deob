package deob;

import java.util.Iterator;

@ObfuscatedName("hu")
public class class210 implements Iterator {

    @ObfuscatedName("hu.f")
    public class204 field3161;

    @ObfuscatedName("hu.e")
    public class208 field3162;

    @ObfuscatedName("hu.n")
    public class208 field3163 = null;

    public class210(class204 arg0) {
        this.field3161 = arg0;
        this.field3162 = this.field3161.field3151.field3157;
        this.field3163 = null;
    }

    public Object next() {
        class208 var1 = this.field3162;
        if (this.field3161.field3151 == var1) {
            var1 = null;
            this.field3162 = null;
        } else {
            this.field3162 = var1.field3157;
        }
        this.field3163 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3161.field3151 != this.field3162;
    }

    public void remove() {
        if (this.field3163 == null) {
            throw new IllegalStateException();
        }
        this.field3163.method3724();
        this.field3163 = null;
    }
}
