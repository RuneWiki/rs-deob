package deob;

import java.util.Comparator;

@ObfuscatedName("su")
public class class485 implements Comparator {

    @ObfuscatedName("su.aj")
    public final boolean field4965;

    public class485(boolean arg0) {
        this.field4965 = arg0;
    }

    @ObfuscatedName("su.aj(Lpb;Lpb;I)I")
    public int method8221(class404 arg0, class404 arg1) {
        return this.field4965 ? arg0.method6921().method8502(arg1.method6921()) : arg1.method6921().method8502(arg0.method6921());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8221((class404) arg0, (class404) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
