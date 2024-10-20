package deob;

import java.util.Iterator;

@ObfuscatedName("jc")
public class class276 implements Iterator {

    @ObfuscatedName("jc.f")
    public class272 field3565;

    @ObfuscatedName("jc.b")
    public class190 field3564;

    @ObfuscatedName("jc.l")
    public class190 field3566 = null;

    public class276(class272 arg0) {
        this.method4679(arg0);
    }

    @ObfuscatedName("jc.e(Ljs;)V")
    public void method4679(class272 arg0) {
        this.field3565 = arg0;
        this.method4681();
    }

    @ObfuscatedName("jc.o()V")
    public void method4681() {
        this.field3564 = this.field3565 == null ? null : this.field3565.field3555.field2141;
        this.field3566 = null;
    }

    public Object next() {
        class190 var1 = this.field3564;
        if (this.field3565.field3555 == var1) {
            var1 = null;
            this.field3564 = null;
        } else {
            this.field3564 = var1.field2141;
        }
        this.field3566 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3565.field3555 != this.field3564;
    }

    public void remove() {
        if (this.field3566 == null) {
            throw new IllegalStateException();
        }
        this.field3566.method3407();
        this.field3566 = null;
    }
}
