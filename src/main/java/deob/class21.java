package deob;

import java.util.Comparator;

@ObfuscatedName("l")
public final class class21 implements Comparator {

    @ObfuscatedName("l.m(Ls;Ls;I)I")
    public int method179(class17 arg0, class17 arg1) {
        return arg0.method121().compareTo(arg1.method121());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method179((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
