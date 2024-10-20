package deob;

import java.util.Iterator;

@ObfuscatedName("jo")
public class class264 implements Iterator {

    @ObfuscatedName("jo.f")
    public class266 field3507;

    @ObfuscatedName("jo.i")
    public class183 field3508;

    @ObfuscatedName("jo.y")
    public class183 field3506 = null;

    public class264(class266 arg0) {
        this.field3507 = arg0;
        this.field3508 = this.field3507.field3512.field2314;
        this.field3506 = null;
    }

    public Object next() {
        class183 var1 = this.field3508;
        if (this.field3507.field3512 == var1) {
            var1 = null;
            this.field3508 = null;
        } else {
            this.field3508 = var1.field2314;
        }
        this.field3506 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3507.field3512 != this.field3508;
    }

    public void remove() {
        if (this.field3506 == null) {
            throw new IllegalStateException();
        }
        this.field3506.method3286();
        this.field3506 = null;
    }
}
