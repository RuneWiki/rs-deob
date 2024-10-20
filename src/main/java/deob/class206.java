package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class206 implements Iterator {

    @ObfuscatedName("gf.e")
    public class203 field3107;

    @ObfuscatedName("gf.w")
    public class209 field3108;

    @ObfuscatedName("gf.f")
    public class209 field3109 = null;

    public class206(class203 arg0) {
        this.field3107 = arg0;
        this.field3108 = this.field3107.field3103.field3115;
        this.field3109 = null;
    }

    public Object next() {
        class209 var1 = this.field3108;
        if (this.field3107.field3103 == var1) {
            var1 = null;
            this.field3108 = null;
        } else {
            this.field3108 = var1.field3115;
        }
        this.field3109 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3107.field3103 != this.field3108;
    }

    public void remove() {
        if (this.field3109 == null) {
            throw new IllegalStateException();
        }
        this.field3109.method3632();
        this.field3109 = null;
    }
}
