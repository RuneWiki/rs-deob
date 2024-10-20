package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class206 implements Iterator {

    @ObfuscatedName("gf.s")
    public class203 field3118;

    @ObfuscatedName("gf.j")
    public class209 field3117;

    @ObfuscatedName("gf.p")
    public class209 field3119 = null;

    public class206(class203 arg0) {
        this.field3118 = arg0;
        this.field3117 = this.field3118.field3113.field3125;
        this.field3119 = null;
    }

    public Object next() {
        class209 var1 = this.field3117;
        if (this.field3118.field3113 == var1) {
            var1 = null;
            this.field3117 = null;
        } else {
            this.field3117 = var1.field3125;
        }
        this.field3119 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3118.field3113 != this.field3117;
    }

    public void remove() {
        if (this.field3119 == null) {
            throw new IllegalStateException();
        }
        this.field3119.method3639();
        this.field3119 = null;
    }
}
