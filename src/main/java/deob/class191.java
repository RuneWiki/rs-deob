package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class191 implements Iterable {

    @ObfuscatedName("gq.n")
    public class195 field2993 = new class195();

    public class191() {
        this.field2993.field2997 = this.field2993;
        this.field2993.field2998 = this.field2993;
    }

    @ObfuscatedName("gq.n()V")
    public void method3510() {
        while (this.field2993.field2997 != this.field2993) {
            this.field2993.field2997.method3541();
        }
    }

    @ObfuscatedName("gq.d(Lgb;)V")
    public void method3507(class195 arg0) {
        if (arg0.field2998 != null) {
            arg0.method3541();
        }
        arg0.field2998 = this.field2993.field2998;
        arg0.field2997 = this.field2993;
        arg0.field2998.field2997 = arg0;
        arg0.field2997.field2998 = arg0;
    }

    public Iterator iterator() {
        return new class197(this);
    }
}
