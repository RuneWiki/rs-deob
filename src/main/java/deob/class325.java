package deob;

import java.util.Comparator;

@ObfuscatedName("lg")
public class class325 implements Comparator {

    @ObfuscatedName("lg.z")
    public final boolean field3856;

    public class325(boolean arg0) {
        this.field3856 = arg0;
    }

    @ObfuscatedName("lg.z(Ljc;Ljc;I)I")
    public int method5574(class284 arg0, class284 arg1) {
        return this.field3856 ? arg0.method4757().method4890(arg1.method4757()) : arg1.method4757().method4890(arg0.method4757());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5574((class284) arg0, (class284) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
