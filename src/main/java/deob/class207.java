package deob;

import java.util.Iterator;

@ObfuscatedName("gk")
public class class207 implements Iterator {

    @ObfuscatedName("gk.e")
    public class201 field3111;

    @ObfuscatedName("gk.w")
    public class205 field3110;

    @ObfuscatedName("gk.f")
    public class205 field3112 = null;

    public class207(class201 arg0) {
        this.field3111 = arg0;
        this.field3110 = this.field3111.field3101.field3106;
        this.field3112 = null;
    }

    public Object next() {
        class205 var1 = this.field3110;
        if (this.field3111.field3101 == var1) {
            var1 = null;
            this.field3110 = null;
        } else {
            this.field3110 = var1.field3106;
        }
        this.field3112 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3111.field3101 != this.field3110;
    }

    public void remove() {
        if (this.field3112 == null) {
            throw new IllegalStateException();
        }
        this.field3112.method3610();
        this.field3112 = null;
    }
}
