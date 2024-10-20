package deob;

import java.util.Iterator;

@ObfuscatedName("jl")
public class class264 implements Iterator {

    @ObfuscatedName("jl.q")
    public class266 field3545;

    @ObfuscatedName("jl.w")
    public class176 field3546;

    @ObfuscatedName("jl.e")
    public class176 field3547 = null;

    public class264(class266 arg0) {
        this.field3545 = arg0;
        this.field3546 = this.field3545.field3552.field2105;
        this.field3547 = null;
    }

    public Object next() {
        class176 var1 = this.field3546;
        if (this.field3545.field3552 == var1) {
            var1 = null;
            this.field3546 = null;
        } else {
            this.field3546 = var1.field2105;
        }
        this.field3547 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3545.field3552 != this.field3546;
    }

    public void remove() {
        if (this.field3547 == null) {
            throw new IllegalStateException();
        }
        this.field3547.method3276();
        this.field3547 = null;
    }
}
