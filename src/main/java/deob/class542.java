package deob;

import java.util.Comparator;

@ObfuscatedName("uc")
public class class542 implements Comparator {

    @ObfuscatedName("uc.az")
    public final boolean field5299;

    public class542(boolean arg0) {
        this.field5299 = arg0;
    }

    @ObfuscatedName("uc.az(Lrr;Lrr;B)I")
    public int method8764(class453 arg0, class453 arg1) {
        return this.field5299 ? arg0.method7433().method9080(arg1.method7433()) : arg1.method7433().method9080(arg0.method7433());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8764((class453) arg0, (class453) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
