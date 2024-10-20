package deob;

import java.util.Comparator;

@ObfuscatedName("r")
public final class class19 implements Comparator {

    @ObfuscatedName("r.m(Lk;Lk;I)I")
    public int method135(class15 arg0, class15 arg1) {
        return arg0.method86().compareTo(arg1.method86());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method135((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
