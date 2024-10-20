package deob;

import java.util.Iterator;

@ObfuscatedName("gj")
public class class206 implements Iterator {

    @ObfuscatedName("gj.g")
    public class200 field3095;

    @ObfuscatedName("gj.b")
    public class204 field3094;

    @ObfuscatedName("gj.w")
    public class204 field3093 = null;

    public class206(class200 arg0) {
        this.field3095 = arg0;
        this.field3094 = this.field3095.field3084.field3089;
        this.field3093 = null;
    }

    public Object next() {
        class204 var1 = this.field3094;
        if (this.field3095.field3084 == var1) {
            var1 = null;
            this.field3094 = null;
        } else {
            this.field3094 = var1.field3089;
        }
        this.field3093 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3095.field3084 != this.field3094;
    }

    public void remove() {
        if (this.field3093 == null) {
            throw new IllegalStateException();
        }
        this.field3093.method3671();
        this.field3093 = null;
    }
}
