package deob;

import java.util.Iterator;

@ObfuscatedName("he")
public class class213 implements Iterable {

    @ObfuscatedName("he.n")
    public class206 field2616 = new class206();

    public class213() {
        this.field2616.field2601 = this.field2616;
        this.field2616.field2602 = this.field2616;
    }

    @ObfuscatedName("he.n()V")
    public void method3555() {
        while (this.field2616.field2601 != this.field2616) {
            this.field2616.field2601.method3515();
        }
    }

    @ObfuscatedName("he.v(Lgd;)V")
    public void method3553(class206 arg0) {
        if (arg0.field2602 != null) {
            arg0.method3515();
        }
        arg0.field2602 = this.field2616.field2602;
        arg0.field2601 = this.field2616;
        arg0.field2602.field2601 = arg0;
        arg0.field2601.field2602 = arg0;
    }

    public Iterator iterator() {
        return new class212(this);
    }
}
