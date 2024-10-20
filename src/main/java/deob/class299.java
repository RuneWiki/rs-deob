package deob;

import java.util.Iterator;

@ObfuscatedName("kl")
public class class299 implements Iterator {

    @ObfuscatedName("kl.f")
    public class300 field3719;

    @ObfuscatedName("kl.e")
    public class348 field3717;

    @ObfuscatedName("kl.v")
    public class348 field3718 = null;

    public class299(class300 arg0) {
        this.field3719 = arg0;
        this.field3717 = this.field3719.field3720.field3929;
        this.field3718 = null;
    }

    public Object next() {
        class348 var1 = this.field3717;
        if (this.field3719.field3720 == var1) {
            var1 = null;
            this.field3717 = null;
        } else {
            this.field3717 = var1.field3929;
        }
        this.field3718 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3719.field3720 != this.field3717;
    }

    public void remove() {
        if (this.field3718 == null) {
            throw new IllegalStateException();
        }
        this.field3718.method5404();
        this.field3718 = null;
    }
}
