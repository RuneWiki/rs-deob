package deob;

import java.util.Iterator;

@ObfuscatedName("mj")
public class class339 implements Iterator {

    @ObfuscatedName("mj.o")
    public class340 field4151;

    @ObfuscatedName("mj.q")
    public class406 field4152;

    @ObfuscatedName("mj.l")
    public class406 field4153 = null;

    public class339(class340 arg0) {
        this.field4151 = arg0;
        this.field4152 = this.field4151.field4154.field4460;
        this.field4153 = null;
    }

    public Object next() {
        class406 var1 = this.field4152;
        if (this.field4151.field4154 == var1) {
            var1 = null;
            this.field4152 = null;
        } else {
            this.field4152 = var1.field4460;
        }
        this.field4153 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4151.field4154 != this.field4152;
    }

    public void remove() {
        if (this.field4153 == null) {
            throw new IllegalStateException();
        }
        this.field4153.method6393();
        this.field4153 = null;
    }
}
