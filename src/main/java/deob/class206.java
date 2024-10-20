package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public class class206 implements Iterator {

    @ObfuscatedName("gb.w")
    public class203 field3116;

    @ObfuscatedName("gb.x")
    public class209 field3117;

    @ObfuscatedName("gb.t")
    public class209 field3118 = null;

    public class206(class203 arg0) {
        this.field3116 = arg0;
        this.field3117 = this.field3116.field3112.field3125;
        this.field3118 = null;
    }

    public Object next() {
        class209 var1 = this.field3117;
        if (this.field3116.field3112 == var1) {
            var1 = null;
            this.field3117 = null;
        } else {
            this.field3117 = var1.field3125;
        }
        this.field3118 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3116.field3112 != this.field3117;
    }

    public void remove() {
        if (this.field3118 == null) {
            throw new IllegalStateException();
        }
        this.field3118.method3684();
        this.field3118 = null;
    }
}
