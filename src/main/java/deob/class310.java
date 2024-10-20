package deob;

import java.util.Iterator;

@ObfuscatedName("kw")
public class class310 implements Iterator {

    @ObfuscatedName("kw.i")
    public class311 field3815;

    @ObfuscatedName("kw.w")
    public class370 field3814;

    @ObfuscatedName("kw.s")
    public class370 field3813 = null;

    public class310(class311 arg0) {
        this.method5007(arg0);
    }

    @ObfuscatedName("kw.i(Lkf;)V")
    public void method5007(class311 arg0) {
        this.field3815 = arg0;
        this.method5008();
    }

    @ObfuscatedName("kw.w()V")
    public void method5008() {
        this.field3814 = this.field3815 == null ? null : this.field3815.field3816.field4074;
        this.field3813 = null;
    }

    public Object next() {
        class370 var1 = this.field3814;
        if (this.field3815.field3816 == var1) {
            var1 = null;
            this.field3814 = null;
        } else {
            this.field3814 = var1.field4074;
        }
        this.field3813 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3815.field3816 != this.field3814 && this.field3814 != null;
    }

    public void remove() {
        if (this.field3813 == null) {
            throw new IllegalStateException();
        }
        this.field3813.method5752();
        this.field3813 = null;
    }
}
