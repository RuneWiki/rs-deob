package deob;

import java.util.Iterator;

@ObfuscatedName("fo")
public class class181 implements Iterable {

    @ObfuscatedName("fo.p")
    public class187 field2867 = new class187();

    public class181() {
        this.field2867.field2880 = this.field2867;
        this.field2867.field2879 = this.field2867;
    }

    @ObfuscatedName("fo.p(Lgq;)V")
    public void method3326(class187 arg0) {
        if (arg0.field2879 != null) {
            arg0.method3378();
        }
        arg0.field2879 = this.field2867.field2879;
        arg0.field2880 = this.field2867;
        arg0.field2879.field2880 = arg0;
        arg0.field2880.field2879 = arg0;
    }

    @ObfuscatedName("fo.g()Lgq;")
    public class187 method3330() {
        return this.method3328((class187) null);
    }

    @ObfuscatedName("fo.x(Lgq;)Lgq;")
    public class187 method3328(class187 arg0) {
        class187 var2;
        if (arg0 == null) {
            var2 = this.field2867.field2880;
        } else {
            var2 = arg0;
        }
        return this.field2867 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class184(this);
    }
}
