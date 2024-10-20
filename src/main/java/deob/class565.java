package deob;

import java.util.Comparator;

@ObfuscatedName("vx")
public class class565 implements Comparator {

    @ObfuscatedName("vx.ap")
    public final boolean field5527;

    public class565(boolean arg0) {
        this.field5527 = arg0;
    }

    @ObfuscatedName("vx.ap(Lse;Lse;I)I")
    public int method9590(class475 arg0, class475 arg1) {
        return this.field5527 ? arg0.method8345().method9978(arg1.method8345()) : arg1.method8345().method9978(arg0.method8345());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method9590((class475) arg0, (class475) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
