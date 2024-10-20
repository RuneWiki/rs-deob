package deob;

import java.util.Comparator;

@ObfuscatedName("ey")
public class class140 implements Comparator {

    @ObfuscatedName("ey.y")
    public final boolean field1919;

    public class140(boolean arg0) {
        this.field1919 = arg0;
    }

    @ObfuscatedName("ey.y(Lkk;Lkk;I)I")
    public int method2893(class290 arg0, class290 arg1) {
        return this.field1919 ? arg0.field3683 - arg1.field3683 : arg1.field3683 - arg0.field3683;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2893((class290) arg0, (class290) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
