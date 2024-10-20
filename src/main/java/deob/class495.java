package deob;

import java.util.Comparator;

@ObfuscatedName("tw")
public class class495 implements Comparator {

    @ObfuscatedName("tw.af")
    public final boolean field5053;

    public class495(boolean arg0) {
        this.field5053 = arg0;
    }

    @ObfuscatedName("tw.af(Lpw;Lpw;I)I")
    public int method8539(class408 arg0, class408 arg1) {
        return this.field5053 ? arg0.method7139(arg1) : arg1.method7139(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8539((class408) arg0, (class408) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
