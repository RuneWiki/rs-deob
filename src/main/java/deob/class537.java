package deob;

import java.util.Comparator;

@ObfuscatedName("up")
public class class537 implements Comparator {

    @ObfuscatedName("up.am")
    public final boolean field5241;

    public class537(boolean arg0) {
        this.field5241 = arg0;
    }

    @ObfuscatedName("up.am(Lrq;Lrq;I)I")
    public int method8845(class449 arg0, class449 arg1) {
        return this.field5241 ? arg0.method7509(arg1) : arg1.method7509(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8845((class449) arg0, (class449) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
