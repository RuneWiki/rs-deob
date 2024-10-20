package deob;

import java.util.Comparator;

@ObfuscatedName("ok")
public class class406 implements Comparator {

    @ObfuscatedName("ok.l")
    public final boolean field4351;

    public class406(boolean arg0) {
        this.field4351 = arg0;
    }

    @ObfuscatedName("ok.l(Llu;Llu;B)I")
    public int method6532(class338 arg0, class338 arg1) {
        return this.field4351 ? arg0.method5482(arg1) : arg1.method5482(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6532((class338) arg0, (class338) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
