package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public class class183 implements Iterable {

    @ObfuscatedName("gr.f")
    public class189 field2870 = new class189();

    public class183() {
        this.field2870.field2883 = this.field2870;
        this.field2870.field2884 = this.field2870;
    }

    @ObfuscatedName("gr.f(Lgx;)V")
    public void method3323(class189 arg0) {
        if (arg0.field2884 != null) {
            arg0.method3367();
        }
        arg0.field2884 = this.field2870.field2884;
        arg0.field2883 = this.field2870;
        arg0.field2884.field2883 = arg0;
        arg0.field2883.field2884 = arg0;
    }

    @ObfuscatedName("gr.k()Lgx;")
    public class189 method3318() {
        return this.method3316((class189) null);
    }

    @ObfuscatedName("gr.y(Lgx;)Lgx;")
    public class189 method3316(class189 arg0) {
        class189 var2;
        if (arg0 == null) {
            var2 = this.field2870.field2883;
        } else {
            var2 = arg0;
        }
        return this.field2870 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class186(this);
    }
}
