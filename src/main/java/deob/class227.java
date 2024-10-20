package deob;

import java.util.Iterator;

@ObfuscatedName("hr")
public class class227 implements Iterator {

    @ObfuscatedName("hr.d")
    public class228 field2675;

    @ObfuscatedName("hr.z")
    public class219 field2673;

    @ObfuscatedName("hr.n")
    public class219 field2674 = null;

    public class227(class228 arg0) {
        this.field2675 = arg0;
        this.field2673 = this.field2675.field2677.field2660;
        this.field2674 = null;
    }

    public Object next() {
        class219 var1 = this.field2673;
        if (this.field2675.field2677 == var1) {
            var1 = null;
            this.field2673 = null;
        } else {
            this.field2673 = var1.field2660;
        }
        this.field2674 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2675.field2677 != this.field2673;
    }

    public void remove() {
        if (this.field2674 == null) {
            throw new IllegalStateException();
        }
        this.field2674.method3828();
        this.field2674 = null;
    }
}
