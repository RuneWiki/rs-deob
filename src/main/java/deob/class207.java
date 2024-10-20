package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class207 implements Iterator {

    @ObfuscatedName("gm.b")
    public class201 field3110;

    @ObfuscatedName("gm.g")
    public class205 field3109;

    @ObfuscatedName("gm.j")
    public class205 field3111 = null;

    public class207(class201 arg0) {
        this.field3110 = arg0;
        this.field3109 = this.field3110.field3100.field3104;
        this.field3111 = null;
    }

    public Object next() {
        class205 var1 = this.field3109;
        if (this.field3110.field3100 == var1) {
            var1 = null;
            this.field3109 = null;
        } else {
            this.field3109 = var1.field3104;
        }
        this.field3111 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3110.field3100 != this.field3109;
    }

    public void remove() {
        if (this.field3111 == null) {
            throw new IllegalStateException();
        }
        this.field3111.method3620();
        this.field3111 = null;
    }
}
