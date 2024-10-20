package deob;

import java.util.Iterator;

@ObfuscatedName("pk")
public class class391 implements Iterator {

    @ObfuscatedName("pk.at")
    public class392 field4439;

    @ObfuscatedName("pk.ah")
    public class485 field4438;

    @ObfuscatedName("pk.ar")
    public class485 field4440 = null;

    public class391(class392 arg0) {
        this.method6596(arg0);
    }

    @ObfuscatedName("pk.at(Lpm;)V")
    public void method6596(class392 arg0) {
        this.field4439 = arg0;
        this.method6584();
    }

    @ObfuscatedName("pk.ah()V")
    public void method6584() {
        this.field4438 = this.field4439 == null ? null : this.field4439.field4441.field4850;
        this.field4440 = null;
    }

    public Object next() {
        class485 var1 = this.field4438;
        if (this.field4439.field4441 == var1) {
            var1 = null;
            this.field4438 = null;
        } else {
            this.field4438 = var1.field4850;
        }
        this.field4440 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4439.field4441 != this.field4438 && this.field4438 != null;
    }

    public void remove() {
        if (this.field4440 == null) {
            throw new IllegalStateException();
        }
        this.field4440.method7828();
        this.field4440 = null;
    }
}
