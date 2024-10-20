package deob;

import java.util.Comparator;

@ObfuscatedName("ez")
public class class140 implements Comparator {

    @ObfuscatedName("ez.g")
    public final boolean field1930;

    public class140(boolean arg0) {
        this.field1930 = arg0;
    }

    @ObfuscatedName("ez.g(Lkv;Lkv;B)I")
    public int method3071(class290 arg0, class290 arg1) {
        return this.field1930 ? arg0.field3707 - arg1.field3707 : arg1.field3707 - arg0.field3707;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3071((class290) arg0, (class290) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
