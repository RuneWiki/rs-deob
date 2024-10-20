package deob;

import java.util.Iterator;

@ObfuscatedName("kh")
public class class300 implements Iterator {

    @ObfuscatedName("kh.s")
    public class301 field3729;

    @ObfuscatedName("kh.t")
    public class349 field3727;

    @ObfuscatedName("kh.v")
    public class349 field3728 = null;

    public class300(class301 arg0) {
        this.field3729 = arg0;
        this.field3727 = this.field3729.field3731.field3959;
        this.field3728 = null;
    }

    public Object next() {
        class349 var1 = this.field3727;
        if (this.field3729.field3731 == var1) {
            var1 = null;
            this.field3727 = null;
        } else {
            this.field3727 = var1.field3959;
        }
        this.field3728 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3729.field3731 != this.field3727;
    }

    public void remove() {
        if (this.field3728 == null) {
            throw new IllegalStateException();
        }
        this.field3728.method5445();
        this.field3728 = null;
    }
}
