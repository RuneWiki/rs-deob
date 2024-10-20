package deob;

import java.util.Comparator;

@ObfuscatedName("ea")
public class class152 implements Comparator {

    @ObfuscatedName("ea.q")
    public final boolean field1974;

    public class152(boolean arg0) {
        this.field1974 = arg0;
    }

    @ObfuscatedName("ea.q(Ljz;Ljz;I)I")
    public int method3084(class280 arg0, class280 arg1) {
        return this.field1974 ? arg0.field3634 - arg1.field3634 : arg1.field3634 - arg0.field3634;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3084((class280) arg0, (class280) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
