package deob;

import java.util.Iterator;

@ObfuscatedName("pj")
public class class394 implements Iterator {

    @ObfuscatedName("pj.ac")
    public class395 field4462;

    @ObfuscatedName("pj.al")
    public class488 field4461;

    @ObfuscatedName("pj.ak")
    public class488 field4460 = null;

    public class394(class395 arg0) {
        this.method6562(arg0);
    }

    @ObfuscatedName("pj.ac(Lpy;)V")
    public void method6562(class395 arg0) {
        this.field4462 = arg0;
        this.method6563();
    }

    @ObfuscatedName("pj.al()V")
    public void method6563() {
        this.field4461 = this.field4462 == null ? null : this.field4462.field4464.field4856;
        this.field4460 = null;
    }

    public Object next() {
        class488 var1 = this.field4461;
        if (this.field4462.field4464 == var1) {
            var1 = null;
            this.field4461 = null;
        } else {
            this.field4461 = var1.field4856;
        }
        this.field4460 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field4462.field4464 != this.field4461 && this.field4461 != null;
    }

    public void remove() {
        if (this.field4460 == null) {
            throw new IllegalStateException();
        }
        this.field4460.method7776();
        this.field4460 = null;
    }
}
