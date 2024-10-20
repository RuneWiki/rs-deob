package deob;

import java.util.Comparator;

@ObfuscatedName("uw")
public class class538 implements Comparator {

    @ObfuscatedName("uw.am")
    public final boolean field5243;

    public class538(boolean arg0) {
        this.field5243 = arg0;
    }

    @ObfuscatedName("uw.am(Lrq;Lrq;I)I")
    public int method8856(class449 arg0, class449 arg1) {
        return this.field5243 ? arg0.method7544().method9159(arg1.method7544()) : arg1.method7544().method9159(arg0.method7544());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8856((class449) arg0, (class449) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
