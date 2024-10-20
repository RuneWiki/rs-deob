package deob;

import java.util.Comparator;

@ObfuscatedName("sb")
public class class484 implements Comparator {

    @ObfuscatedName("sb.aj")
    public final boolean field4964;

    public class484(boolean arg0) {
        this.field4964 = arg0;
    }

    @ObfuscatedName("sb.aj(Lpb;Lpb;I)I")
    public int method8214(class404 arg0, class404 arg1) {
        return this.field4964 ? arg0.method6896(arg1) : arg1.method6896(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8214((class404) arg0, (class404) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
