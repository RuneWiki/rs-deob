package deob;

import java.util.Comparator;

@ObfuscatedName("fr")
public class class161 implements Comparator {

    @ObfuscatedName("fr.f")
    public final boolean field1989;

    public class161(boolean arg0) {
        this.field1989 = arg0;
    }

    @ObfuscatedName("fr.f(Lkl;Lkl;I)I")
    public int method3202(class290 arg0, class290 arg1) {
        return this.field1989 ? arg0.field3642 - arg1.field3642 : arg1.field3642 - arg0.field3642;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3202((class290) arg0, (class290) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
