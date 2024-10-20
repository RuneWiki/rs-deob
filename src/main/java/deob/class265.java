package deob;

import java.util.Iterator;

@ObfuscatedName("jh")
public class class265 implements Iterator {

    @ObfuscatedName("jh.c")
    public class261 field3516;

    @ObfuscatedName("jh.x")
    public class181 field3517;

    @ObfuscatedName("jh.t")
    public class181 field3518 = null;

    public class265(class261 arg0) {
        this.method4595(arg0);
    }

    @ObfuscatedName("jh.j(Ljd;)V")
    public void method4595(class261 arg0) {
        this.field3516 = arg0;
        this.method4604();
    }

    @ObfuscatedName("jh.v()V")
    public void method4604() {
        this.field3517 = this.field3516 == null ? null : this.field3516.field3508.field2095;
        this.field3518 = null;
    }

    public Object next() {
        class181 var1 = this.field3517;
        if (this.field3516.field3508 == var1) {
            var1 = null;
            this.field3517 = null;
        } else {
            this.field3517 = var1.field2095;
        }
        this.field3518 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3516.field3508 != this.field3517;
    }

    public void remove() {
        if (this.field3518 == null) {
            throw new IllegalStateException();
        }
        this.field3518.method3326();
        this.field3518 = null;
    }
}
