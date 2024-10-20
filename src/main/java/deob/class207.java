package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class207 implements Iterator {

    @ObfuscatedName("gp.t")
    public class201 field3122;

    @ObfuscatedName("gp.i")
    public class205 field3120;

    @ObfuscatedName("gp.g")
    public class205 field3121 = null;

    public class207(class201 arg0) {
        this.field3122 = arg0;
        this.field3120 = this.field3122.field3111.field3115;
        this.field3121 = null;
    }

    public Object next() {
        class205 var1 = this.field3120;
        if (this.field3122.field3111 == var1) {
            var1 = null;
            this.field3120 = null;
        } else {
            this.field3120 = var1.field3115;
        }
        this.field3121 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3122.field3111 != this.field3120;
    }

    public void remove() {
        if (this.field3121 == null) {
            throw new IllegalStateException();
        }
        this.field3121.method3581();
        this.field3121 = null;
    }
}
