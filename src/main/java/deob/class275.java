package deob;

import java.util.Iterator;

@ObfuscatedName("jo")
public class class275 implements Iterator {

    @ObfuscatedName("jo.z")
    public class271 field3564;

    @ObfuscatedName("jo.k")
    public class190 field3563;

    @ObfuscatedName("jo.s")
    public class190 field3565 = null;

    public class275(class271 arg0) {
        this.method4668(arg0);
    }

    @ObfuscatedName("jo.x(Ljv;)V")
    public void method4668(class271 arg0) {
        this.field3564 = arg0;
        this.method4670();
    }

    @ObfuscatedName("jo.w()V")
    public void method4670() {
        this.field3563 = this.field3564 == null ? null : this.field3564.field3554.field2155;
        this.field3565 = null;
    }

    public Object next() {
        class190 var1 = this.field3563;
        if (this.field3564.field3554 == var1) {
            var1 = null;
            this.field3563 = null;
        } else {
            this.field3563 = var1.field2155;
        }
        this.field3565 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3564.field3554 != this.field3563;
    }

    public void remove() {
        if (this.field3565 == null) {
            throw new IllegalStateException();
        }
        this.field3565.method3401();
        this.field3565 = null;
    }
}
