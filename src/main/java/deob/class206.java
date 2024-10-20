package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public class class206 implements Iterator {

    @ObfuscatedName("gf.b")
    public class203 field3108;

    @ObfuscatedName("gf.g")
    public class209 field3107;

    @ObfuscatedName("gf.j")
    public class209 field3106 = null;

    public class206(class203 arg0) {
        this.field3108 = arg0;
        this.field3107 = this.field3108.field3102.field3115;
        this.field3106 = null;
    }

    public Object next() {
        class209 var1 = this.field3107;
        if (this.field3108.field3102 == var1) {
            var1 = null;
            this.field3107 = null;
        } else {
            this.field3107 = var1.field3115;
        }
        this.field3106 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3108.field3102 != this.field3107;
    }

    public void remove() {
        if (this.field3106 == null) {
            throw new IllegalStateException();
        }
        this.field3106.method3647();
        this.field3106 = null;
    }
}
