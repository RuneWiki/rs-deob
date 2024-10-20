package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public class class198 implements Iterator {

    @ObfuscatedName("gi.s")
    public class202 field3136;

    @ObfuscatedName("gi.z")
    public class212 field3135;

    @ObfuscatedName("gi.t")
    public int field3134;

    @ObfuscatedName("gi.y")
    public class212 field3137 = null;

    public class198(class202 arg0) {
        this.field3136 = arg0;
        this.method3536();
    }

    @ObfuscatedName("gi.s()V")
    public void method3536() {
        this.field3135 = this.field3136.field3147[0].field3166;
        this.field3134 = 1;
        this.field3137 = null;
    }

    public Object next() {
        if (this.field3136.field3147[this.field3134 - 1] != this.field3135) {
            class212 var1 = this.field3135;
            this.field3135 = var1.field3166;
            this.field3137 = var1;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3134 >= this.field3136.field3146) {
                return null;
            }
            var2 = this.field3136.field3147[this.field3134++].field3166;
        } while (this.field3136.field3147[this.field3134 - 1] == var2);
        this.field3135 = var2.field3166;
        this.field3137 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3136.field3147[this.field3134 - 1] != this.field3135) {
            return true;
        }
        while (this.field3134 < this.field3136.field3146) {
            if (this.field3136.field3147[this.field3134++].field3166 != this.field3136.field3147[this.field3134 - 1]) {
                this.field3135 = this.field3136.field3147[this.field3134 - 1].field3166;
                return true;
            }
            this.field3135 = this.field3136.field3147[this.field3134 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3137 == null) {
            throw new IllegalStateException();
        }
        this.field3137.method3699();
        this.field3137 = null;
    }
}
