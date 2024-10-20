package deob;

import java.util.Comparator;

@ObfuscatedName("nt")
public class class388 implements Comparator {

    @ObfuscatedName("nt.f")
    public final boolean field4213;

    public class388(boolean arg0) {
        this.field4213 = arg0;
    }

    @ObfuscatedName("nt.f(Llt;Llt;I)I")
    public int method6107(class321 arg0, class321 arg1) {
        return this.field4213 ? arg0.method5088().method5203(arg1.method5088()) : arg1.method5088().method5203(arg0.method5088());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6107((class321) arg0, (class321) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
