package deob;

import java.util.Iterator;

@ObfuscatedName("gb")
public class class205 implements Iterator {

    @ObfuscatedName("gb.i")
    public class202 field3090;

    @ObfuscatedName("gb.v")
    public class208 field3091;

    @ObfuscatedName("gb.f")
    public class208 field3092 = null;

    public class205(class202 arg0) {
        this.field3090 = arg0;
        this.field3091 = this.field3090.field3086.field3098;
        this.field3092 = null;
    }

    public Object next() {
        class208 var1 = this.field3091;
        if (this.field3090.field3086 == var1) {
            var1 = null;
            this.field3091 = null;
        } else {
            this.field3091 = var1.field3098;
        }
        this.field3092 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3090.field3086 != this.field3091;
    }

    public void remove() {
        if (this.field3092 == null) {
            throw new IllegalStateException();
        }
        this.field3092.method3624();
        this.field3092 = null;
    }
}
