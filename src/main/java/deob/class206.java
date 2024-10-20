package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class206 implements Iterator {

    @ObfuscatedName("gm.j")
    public class203 field3115;

    @ObfuscatedName("gm.h")
    public class209 field3116;

    @ObfuscatedName("gm.m")
    public class209 field3117 = null;

    public class206(class203 arg0) {
        this.field3115 = arg0;
        this.field3116 = this.field3115.field3111.field3124;
        this.field3117 = null;
    }

    public Object next() {
        class209 var1 = this.field3116;
        if (this.field3115.field3111 == var1) {
            var1 = null;
            this.field3116 = null;
        } else {
            this.field3116 = var1.field3124;
        }
        this.field3117 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3115.field3111 != this.field3116;
    }

    public void remove() {
        if (this.field3117 == null) {
            throw new IllegalStateException();
        }
        this.field3117.method3639();
        this.field3117 = null;
    }
}
