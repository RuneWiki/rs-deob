package deob;

import java.util.Comparator;

@ObfuscatedName("vr")
public class class554 implements Comparator {

    @ObfuscatedName("vr.aq")
    public final boolean field5427;

    public class554(boolean arg0) {
        this.field5427 = arg0;
    }

    @ObfuscatedName("vr.aq(Lsk;Lsk;I)I")
    public int method9035(class471 arg0, class471 arg1) {
        return this.field5427 ? arg0.method7842().method9357(arg1.method7842()) : arg1.method7842().method9357(arg0.method7842());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method9035((class471) arg0, (class471) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
