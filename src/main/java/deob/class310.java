package deob;

import java.util.Iterator;

@ObfuscatedName("ka")
public class class310 implements Iterator {

    @ObfuscatedName("ka.l")
    public class311 field3828;

    @ObfuscatedName("ka.q")
    public class370 field3827;

    @ObfuscatedName("ka.f")
    public class370 field3826 = null;

    public class310(class311 arg0) {
        this.method5055(arg0);
    }

    @ObfuscatedName("ka.l(Lkt;)V")
    public void method5055(class311 arg0) {
        this.field3828 = arg0;
        this.method5056();
    }

    @ObfuscatedName("ka.q()V")
    public void method5056() {
        this.field3827 = this.field3828 == null ? null : this.field3828.field3830.field4076;
        this.field3826 = null;
    }

    public Object next() {
        class370 var1 = this.field3827;
        if (this.field3828.field3830 == var1) {
            var1 = null;
            this.field3827 = null;
        } else {
            this.field3827 = var1.field4076;
        }
        this.field3826 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3828.field3830 != this.field3827 && this.field3827 != null;
    }

    public void remove() {
        if (this.field3826 == null) {
            throw new IllegalStateException();
        }
        this.field3826.method5775();
        this.field3826 = null;
    }
}
