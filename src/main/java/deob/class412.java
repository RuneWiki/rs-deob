package deob;

import java.util.Iterator;

@ObfuscatedName("pz")
public class class412 implements Iterator {

    @ObfuscatedName("pz.ap")
    public class413 field4727;

    @ObfuscatedName("pz.aw")
    public class515 field4728;

    @ObfuscatedName("pz.ak")
    public class515 field4729 = null;

    public class412(class413 arg0) {
        this.method7281(arg0);
    }

    @ObfuscatedName("pz.ap(Lps;)V")
    public void method7281(class413 arg0) {
        this.field4727 = arg0;
        this.method7282();
    }

    @ObfuscatedName("pz.aw()V")
    public void method7282() {
        this.field4728 = this.field4727 == null ? null : this.field4727.field4730.field5171;
        this.field4729 = null;
    }

    public Object next() {
        class515 var1 = this.field4728;
        if (this.field4727.field4730 == var1) {
            var1 = null;
            this.field4728 = null;
        } else {
            this.field4728 = var1.field5171;
        }
        this.field4729 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4727.field4730 != this.field4728 && this.field4728 != null;
    }

    public void remove() {
        if (this.field4729 == null) {
            throw new IllegalStateException();
        }
        this.field4729.method8667();
        this.field4729 = null;
    }
}
