package deob;

import java.util.Iterator;

@ObfuscatedName("hi")
public class class218 implements Iterable {

    @ObfuscatedName("hi.y")
    public class209 field2494 = new class209();

    @ObfuscatedName("hi.c")
    public class209 field2493;

    public class218() {
        this.field2494.field2476 = this.field2494;
        this.field2494.field2477 = this.field2494;
    }

    @ObfuscatedName("hi.y()V")
    public void method3854() {
        while (this.field2494.field2476 != this.field2494) {
            this.field2494.field2476.method3809();
        }
    }

    @ObfuscatedName("hi.c(Lhn;)V")
    public void method3845(class209 arg0) {
        if (arg0.field2477 != null) {
            arg0.method3809();
        }
        arg0.field2477 = this.field2494.field2477;
        arg0.field2476 = this.field2494;
        arg0.field2477.field2476 = arg0;
        arg0.field2476.field2477 = arg0;
    }

    @ObfuscatedName("hi.n()Lhn;")
    public class209 method3852() {
        class209 var1 = this.field2494.field2476;
        if (this.field2494 == var1) {
            return null;
        } else {
            var1.method3809();
            return var1;
        }
    }

    @ObfuscatedName("hi.u()Lhn;")
    public class209 method3857() {
        return this.method3848((class209) null);
    }

    @ObfuscatedName("hi.i(Lhn;)Lhn;")
    public class209 method3848(class209 arg0) {
        class209 var2;
        if (arg0 == null) {
            var2 = this.field2494.field2476;
        } else {
            var2 = arg0;
        }
        if (this.field2494 == var2) {
            this.field2493 = null;
            return null;
        } else {
            this.field2493 = var2.field2476;
            return var2;
        }
    }

    @ObfuscatedName("hi.p()Lhn;")
    public class209 method3849() {
        class209 var1 = this.field2493;
        if (this.field2494 == var1) {
            this.field2493 = null;
            return null;
        } else {
            this.field2493 = var1.field2476;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class217(this);
    }
}
