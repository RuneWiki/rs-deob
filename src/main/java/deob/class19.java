package deob;

import java.util.Comparator;

@ObfuscatedName("x")
public final class class19 implements Comparator {

    @ObfuscatedName("x.b(Ls;Ls;I)I")
    public int method124(class15 arg0, class15 arg1) {
        return arg0.method65().compareTo(arg1.method65());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method124((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
