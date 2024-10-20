package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public class class204 implements Iterator {

    @ObfuscatedName("gi.s")
    public class205 field2505;

    @ObfuscatedName("gi.c")
    public class198 field2503;

    @ObfuscatedName("gi.f")
    public class198 field2504 = null;

    public class204(class205 arg0) {
        this.field2505 = arg0;
        this.field2503 = this.field2505.field2506.field2492;
        this.field2504 = null;
    }

    public Object next() {
        class198 var1 = this.field2503;
        if (this.field2505.field2506 == var1) {
            var1 = null;
            this.field2503 = null;
        } else {
            this.field2503 = var1.field2492;
        }
        this.field2504 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field2505.field2506 != this.field2503;
    }

    public void remove() {
        if (this.field2504 == null) {
            throw new IllegalStateException();
        }
        this.field2504.method3413();
        this.field2504 = null;
    }
}
