package deob;

import java.util.Comparator;

@ObfuscatedName("je")
public final class class280 implements Comparator {

    @ObfuscatedName("je.f(Ljt;Ljt;I)I")
    public int method4616(class284 arg0, class284 arg1) {
        return arg0.method4639().compareTo(arg1.method4639());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4616((class284) arg0, (class284) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
