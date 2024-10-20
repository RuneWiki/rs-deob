package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public class class205 implements Iterator {

    @ObfuscatedName("gb.g")
    public class202 field3091;

    @ObfuscatedName("gb.b")
    public class208 field3090;

    @ObfuscatedName("gb.w")
    public class208 field3092 = null;

    public class205(class202 arg0) {
        this.field3091 = arg0;
        this.field3090 = this.field3091.field3086.field3098;
        this.field3092 = null;
    }

    public Object next() {
        class208 var1 = this.field3090;
        if (this.field3091.field3086 == var1) {
            var1 = null;
            this.field3090 = null;
        } else {
            this.field3090 = var1.field3098;
        }
        this.field3092 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3091.field3086 != this.field3090;
    }

    public void remove() {
        if (this.field3092 == null) {
            throw new IllegalStateException();
        }
        this.field3092.method3693();
        this.field3092 = null;
    }
}
