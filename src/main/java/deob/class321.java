package deob;

import java.util.Comparator;

@ObfuscatedName("lq")
public final class class321 implements Comparator {

    @ObfuscatedName("lq.v(Llc;Llc;B)I")
    public int method5414(class324 arg0, class324 arg1) {
        return arg0.field4025 < arg1.field4025 ? -1 : (arg0.field4025 == arg1.field4025 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5414((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
