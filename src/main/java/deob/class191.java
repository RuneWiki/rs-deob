package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class191 implements Iterable {

    @ObfuscatedName("gz.b")
    public class195 field2991 = new class195();

    public class191() {
        this.field2991.field2996 = this.field2991;
        this.field2991.field2995 = this.field2991;
    }

    @ObfuscatedName("gz.b()V")
    public void method3352() {
        while (this.field2991.field2996 != this.field2991) {
            this.field2991.field2996.method3396();
        }
    }

    @ObfuscatedName("gz.e(Lgr;)V")
    public void method3354(class195 arg0) {
        if (arg0.field2995 != null) {
            arg0.method3396();
        }
        arg0.field2995 = this.field2991.field2995;
        arg0.field2996 = this.field2991;
        arg0.field2995.field2996 = arg0;
        arg0.field2996.field2995 = arg0;
    }

    public Iterator iterator() {
        return new class197(this);
    }
}
