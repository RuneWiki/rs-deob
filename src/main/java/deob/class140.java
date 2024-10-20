package deob;

import java.util.Comparator;

@ObfuscatedName("ex")
public class class140 implements Comparator {

    @ObfuscatedName("ex.c")
    public final boolean field1925;

    public class140(boolean arg0) {
        this.field1925 = arg0;
    }

    @ObfuscatedName("ex.c(Lkx;Lkx;S)I")
    public int method2854(class290 arg0, class290 arg1) {
        return this.field1925 ? arg0.field3678 - arg1.field3678 : arg1.field3678 - arg0.field3678;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2854((class290) arg0, (class290) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
