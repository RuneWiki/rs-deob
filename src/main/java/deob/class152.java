package deob;

import java.util.Comparator;

@ObfuscatedName("en")
public class class152 implements Comparator {

    @ObfuscatedName("en.u")
    public final boolean field1963;

    public class152(boolean arg0) {
        this.field1963 = arg0;
    }

    @ObfuscatedName("en.u(Ljt;Ljt;I)I")
    public int method3129(class279 arg0, class279 arg1) {
        return this.field1963 ? arg0.field3613 - arg1.field3613 : arg1.field3613 - arg0.field3613;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3129((class279) arg0, (class279) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
