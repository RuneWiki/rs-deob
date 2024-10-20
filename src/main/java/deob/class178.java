package deob;

import java.util.Iterator;

@ObfuscatedName("fk")
public class class178 implements Iterable {

    @ObfuscatedName("fk.k")
    public class182 field2861 = new class182();

    public class178() {
        this.field2861.field2866 = this.field2861;
        this.field2861.field2865 = this.field2861;
    }

    @ObfuscatedName("fk.k()V")
    public void method3222() {
        while (this.field2861.field2866 != this.field2861) {
            this.field2861.field2866.method3256();
        }
    }

    @ObfuscatedName("fk.r(Lfj;)V")
    public void method3227(class182 arg0) {
        if (arg0.field2865 != null) {
            arg0.method3256();
        }
        arg0.field2865 = this.field2861.field2865;
        arg0.field2866 = this.field2861;
        arg0.field2865.field2866 = arg0;
        arg0.field2866.field2865 = arg0;
    }

    public Iterator iterator() {
        return new class184(this);
    }
}
