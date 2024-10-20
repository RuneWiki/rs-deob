package deob;

import java.util.Iterator;

@ObfuscatedName("fm")
public class class178 implements Iterable {

    @ObfuscatedName("fm.g")
    public class182 field2861 = new class182();

    public class178() {
        this.field2861.field2865 = this.field2861;
        this.field2861.field2866 = this.field2861;
    }

    @ObfuscatedName("fm.g()V")
    public void method3259() {
        while (this.field2861.field2865 != this.field2861) {
            this.field2861.field2865.method3299();
        }
    }

    @ObfuscatedName("fm.v(Lfl;)V")
    public void method3260(class182 arg0) {
        if (arg0.field2866 != null) {
            arg0.method3299();
        }
        arg0.field2866 = this.field2861.field2866;
        arg0.field2865 = this.field2861;
        arg0.field2866.field2865 = arg0;
        arg0.field2865.field2866 = arg0;
    }

    public Iterator iterator() {
        return new class184(this);
    }
}
