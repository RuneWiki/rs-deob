package deob;

import java.util.Comparator;

@ObfuscatedName("ej")
public class class145 implements Comparator {

    @ObfuscatedName("ej.a")
    public final boolean field1948;

    public class145(boolean arg0) {
        this.field1948 = arg0;
    }

    @ObfuscatedName("ej.a(Lkl;Lkl;I)I")
    public int method3103(class294 arg0, class294 arg1) {
        return this.field1948 ? arg0.field3712 - arg1.field3712 : arg1.field3712 - arg0.field3712;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3103((class294) arg0, (class294) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
