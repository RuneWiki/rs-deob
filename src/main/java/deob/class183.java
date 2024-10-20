package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public class class183 implements Iterable {

    @ObfuscatedName("gr.c")
    public class189 field2873 = new class189();

    public class183() {
        this.field2873.field2885 = this.field2873;
        this.field2873.field2887 = this.field2873;
    }

    @ObfuscatedName("gr.c(Lgy;)V")
    public void method3284(class189 arg0) {
        if (arg0.field2887 != null) {
            arg0.method3334();
        }
        arg0.field2887 = this.field2873.field2887;
        arg0.field2885 = this.field2873;
        arg0.field2887.field2885 = arg0;
        arg0.field2885.field2887 = arg0;
    }

    @ObfuscatedName("gr.j()Lgy;")
    public class189 method3285() {
        return this.method3286((class189) null);
    }

    @ObfuscatedName("gr.y(Lgy;)Lgy;")
    public class189 method3286(class189 arg0) {
        class189 var2;
        if (arg0 == null) {
            var2 = this.field2873.field2885;
        } else {
            var2 = arg0;
        }
        return this.field2873 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class186(this);
    }
}
