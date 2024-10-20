package deob;

import java.util.Comparator;

@ObfuscatedName("qh")
public class class443 implements Comparator {

    @ObfuscatedName("qh.v")
    public final boolean field4680;

    public class443(boolean arg0) {
        this.field4680 = arg0;
    }

    @ObfuscatedName("qh.v(Lnn;Lnn;I)I")
    public int method7228(class371 arg0, class371 arg1) {
        return this.field4680 ? arg0.method6046(arg1) : arg1.method6046(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7228((class371) arg0, (class371) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
