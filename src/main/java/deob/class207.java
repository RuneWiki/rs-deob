package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class207 implements Iterator {

    @ObfuscatedName("gq.f")
    public class201 field3111;

    @ObfuscatedName("gq.u")
    public class205 field3112;

    @ObfuscatedName("gq.x")
    public class205 field3113 = null;

    public class207(class201 arg0) {
        this.field3111 = arg0;
        this.field3112 = this.field3111.field3102.field3106;
        this.field3113 = null;
    }

    public Object next() {
        class205 var1 = this.field3112;
        if (this.field3111.field3102 == var1) {
            var1 = null;
            this.field3112 = null;
        } else {
            this.field3112 = var1.field3106;
        }
        this.field3113 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3111.field3102 != this.field3112;
    }

    public void remove() {
        if (this.field3113 == null) {
            throw new IllegalStateException();
        }
        this.field3113.method3655();
        this.field3113 = null;
    }
}
