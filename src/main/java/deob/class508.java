package deob;

import java.util.Comparator;

@ObfuscatedName("ty")
public class class508 implements Comparator {

    @ObfuscatedName("ty.at")
    public final boolean field5083;

    public class508(boolean arg0) {
        this.field5083 = arg0;
    }

    @ObfuscatedName("ty.at(Lqm;Lqm;I)I")
    public int method8443(class421 arg0, class421 arg1) {
        return this.field5083 ? arg0.method7150().method8760(arg1.method7150()) : arg1.method7150().method8760(arg0.method7150());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8443((class421) arg0, (class421) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
