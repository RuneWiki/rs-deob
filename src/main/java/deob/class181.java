package deob;

import java.util.Iterator;

@ObfuscatedName("fg")
public class class181 implements Iterable {

    @ObfuscatedName("fg.g")
    public class187 field2860 = new class187();

    public class181() {
        this.field2860.field2874 = this.field2860;
        this.field2860.field2872 = this.field2860;
    }

    @ObfuscatedName("fg.g(Lgg;)V")
    public void method3228(class187 arg0) {
        if (arg0.field2872 != null) {
            arg0.method3280();
        }
        arg0.field2872 = this.field2860.field2872;
        arg0.field2874 = this.field2860;
        arg0.field2872.field2874 = arg0;
        arg0.field2874.field2872 = arg0;
    }

    @ObfuscatedName("fg.s()Lgg;")
    public class187 method3227() {
        return this.method3225((class187) null);
    }

    @ObfuscatedName("fg.h(Lgg;)Lgg;")
    public class187 method3225(class187 arg0) {
        class187 var2;
        if (arg0 == null) {
            var2 = this.field2860.field2874;
        } else {
            var2 = arg0;
        }
        return this.field2860 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class184(this);
    }
}
