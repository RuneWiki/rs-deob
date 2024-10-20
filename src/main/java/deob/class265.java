package deob;

import java.util.Iterator;

@ObfuscatedName("ja")
public class class265 implements Iterator {

    @ObfuscatedName("ja.f")
    public class261 field3509;

    @ObfuscatedName("ja.i")
    public class188 field3510;

    @ObfuscatedName("ja.y")
    public class188 field3511 = null;

    public class265(class261 arg0) {
        this.method4584(arg0);
    }

    @ObfuscatedName("ja.c(Ljl;)V")
    public void method4584(class261 arg0) {
        this.field3509 = arg0;
        this.method4592();
    }

    @ObfuscatedName("ja.o()V")
    public void method4592() {
        this.field3510 = this.field3509 == null ? null : this.field3509.field3501.field2323;
        this.field3511 = null;
    }

    public Object next() {
        class188 var1 = this.field3510;
        if (this.field3509.field3501 == var1) {
            var1 = null;
            this.field3510 = null;
        } else {
            this.field3510 = var1.field2323;
        }
        this.field3511 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3509.field3501 != this.field3510;
    }

    public void remove() {
        if (this.field3511 == null) {
            throw new IllegalStateException();
        }
        this.field3511.method3292();
        this.field3511 = null;
    }
}
