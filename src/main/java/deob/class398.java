package deob;

import java.util.Comparator;

@ObfuscatedName("pd")
public final class class398 implements Comparator {

    @ObfuscatedName("pd.ac(Lpv;Lpv;B)I")
    public int method6926(class399 arg0, class399 arg1) {
        return arg0.field4614 < arg1.field4614 ? -1 : (arg0.field4614 == arg1.field4614 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6926((class399) arg0, (class399) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
