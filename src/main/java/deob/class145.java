package deob;

import java.util.Comparator;

@ObfuscatedName("ef")
public class class145 implements Comparator {

    @ObfuscatedName("ef.n")
    public final boolean field1945;

    public class145(boolean arg0) {
        this.field1945 = arg0;
    }

    @ObfuscatedName("ef.n(Lkx;Lkx;I)I")
    public int method3107(class293 arg0, class293 arg1) {
        return this.field1945 ? arg0.field3702 - arg1.field3702 : arg1.field3702 - arg0.field3702;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3107((class293) arg0, (class293) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
