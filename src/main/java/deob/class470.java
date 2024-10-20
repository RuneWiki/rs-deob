package deob;

import java.util.Comparator;

@ObfuscatedName("rv")
public class class470 implements Comparator {

    @ObfuscatedName("rv.a")
    public final boolean field4930;

    public class470(boolean arg0) {
        this.field4930 = arg0;
    }

    @ObfuscatedName("rv.a(Loj;Loj;B)I")
    public int method7998(class391 arg0, class391 arg1) {
        return this.field4930 ? arg0.method6728().method8304(arg1.method6728()) : arg1.method6728().method8304(arg0.method6728());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7998((class391) arg0, (class391) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
