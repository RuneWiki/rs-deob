package deob;

import java.util.Iterator;

@ObfuscatedName("hj")
public class class209 implements Iterator {

    @ObfuscatedName("hj.e")
    public class206 field3154;

    @ObfuscatedName("hj.l")
    public class212 field3155;

    @ObfuscatedName("hj.c")
    public class212 field3156 = null;

    public class209(class206 arg0) {
        this.field3154 = arg0;
        this.field3155 = this.field3154.field3150.field3163;
        this.field3156 = null;
    }

    public Object next() {
        class212 var1 = this.field3155;
        if (this.field3154.field3150 == var1) {
            var1 = null;
            this.field3155 = null;
        } else {
            this.field3155 = var1.field3163;
        }
        this.field3156 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3154.field3150 != this.field3155;
    }

    public void remove() {
        if (this.field3156 == null) {
            throw new IllegalStateException();
        }
        this.field3156.method3755();
        this.field3156 = null;
    }
}
