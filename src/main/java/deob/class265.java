package deob;

import java.util.Iterator;

@ObfuscatedName("jq")
public class class265 implements Iterator {

    @ObfuscatedName("jq.q")
    public class261 field3549;

    @ObfuscatedName("jq.w")
    public class181 field3550;

    @ObfuscatedName("jq.e")
    public class181 field3548 = null;

    public class265(class261 arg0) {
        this.method4554(arg0);
    }

    @ObfuscatedName("jq.b(Lju;)V")
    public void method4554(class261 arg0) {
        this.field3549 = arg0;
        this.method4556();
    }

    @ObfuscatedName("jq.i()V")
    public void method4556() {
        this.field3550 = this.field3549 == null ? null : this.field3549.field3540.field2115;
        this.field3548 = null;
    }

    public Object next() {
        class181 var1 = this.field3550;
        if (this.field3549.field3540 == var1) {
            var1 = null;
            this.field3550 = null;
        } else {
            this.field3550 = var1.field2115;
        }
        this.field3548 = var1;
        return var1;
    }

    public boolean hasNext() {
        return this.field3549.field3540 != this.field3550;
    }

    public void remove() {
        if (this.field3548 == null) {
            throw new IllegalStateException();
        }
        this.field3548.method3286();
        this.field3548 = null;
    }
}
