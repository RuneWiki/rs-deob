package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class196 implements Iterator {

    @ObfuscatedName("gf.n")
    public class193 field3010;

    @ObfuscatedName("gf.o")
    public class199 field3011;

    @ObfuscatedName("gf.a")
    public class199 field3012 = null;

    public class196(class193 arg0) {
        this.field3010 = arg0;
        this.field3011 = this.field3010.field3006.field3019;
        this.field3012 = null;
    }

    public Object next() {
        class199 var1 = this.field3011;
        if (this.field3010.field3006 == var1) {
            var1 = null;
            this.field3011 = null;
        } else {
            this.field3011 = var1.field3019;
        }
        this.field3012 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3010.field3006 != this.field3011;
    }

    public void remove() {
        if (this.field3012 == null) {
            throw new IllegalStateException();
        }
        this.field3012.method3540();
        this.field3012 = null;
    }
}
