package deob;

import java.util.Comparator;

@ObfuscatedName("us")
public class class541 implements Comparator {

    @ObfuscatedName("us.az")
    public final boolean field5295;

    public class541(boolean arg0) {
        this.field5295 = arg0;
    }

    @ObfuscatedName("us.az(Lrr;Lrr;I)I")
    public int method8756(class453 arg0, class453 arg1) {
        return this.field5295 ? arg0.method7403(arg1) : arg1.method7403(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8756((class453) arg0, (class453) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
