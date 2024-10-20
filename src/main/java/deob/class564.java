package deob;

import java.util.Comparator;

@ObfuscatedName("vg")
public class class564 implements Comparator {

    @ObfuscatedName("vg.ap")
    public final boolean field5526;

    public class564(boolean arg0) {
        this.field5526 = arg0;
    }

    @ObfuscatedName("vg.ap(Lse;Lse;I)I")
    public int method9585(class475 arg0, class475 arg1) {
        return this.field5526 ? arg0.method8303(arg1) : arg1.method8303(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method9585((class475) arg0, (class475) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
