package deob;

import java.util.Comparator;

@ObfuscatedName("li")
public class class315 implements Comparator {

    @ObfuscatedName("li.s")
    public final boolean field3825;

    public class315(boolean arg0) {
        this.field3825 = arg0;
    }

    @ObfuscatedName("li.s(Lju;Lju;I)I")
    public int method5393(class274 arg0, class274 arg1) {
        return this.field3825 ? arg0.method4632().method4770(arg1.method4632()) : arg1.method4632().method4770(arg0.method4632());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5393((class274) arg0, (class274) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
