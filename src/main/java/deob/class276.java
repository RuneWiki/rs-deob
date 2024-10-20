package deob;

import java.util.Iterator;

@ObfuscatedName("ja")
public class class276 implements Iterator {

    @ObfuscatedName("ja.n")
    public class272 field3578;

    @ObfuscatedName("ja.v")
    public class190 field3579;

    @ObfuscatedName("ja.d")
    public class190 field3580 = null;

    public class276(class272 arg0) {
        this.method4750(arg0);
    }

    @ObfuscatedName("ja.e(Ljv;)V")
    public void method4750(class272 arg0) {
        this.field3578 = arg0;
        this.method4751();
    }

    @ObfuscatedName("ja.q()V")
    public void method4751() {
        this.field3579 = this.field3578 == null ? null : this.field3578.field3570.field2140;
        this.field3580 = null;
    }

    public Object next() {
        class190 var1 = this.field3579;
        if (this.field3578.field3570 == var1) {
            var1 = null;
            this.field3579 = null;
        } else {
            this.field3579 = var1.field2140;
        }
        this.field3580 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3578.field3570 != this.field3579;
    }

    public void remove() {
        if (this.field3580 == null) {
            throw new IllegalStateException();
        }
        this.field3580.method3486();
        this.field3580 = null;
    }
}
