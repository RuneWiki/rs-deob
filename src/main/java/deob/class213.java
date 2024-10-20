package deob;

import java.util.Comparator;

@ObfuscatedName("hp")
public final class class213 implements Comparator {

    @ObfuscatedName("hp.d(Lhh;Lhh;I)I")
    public int method3739(class214 arg0, class214 arg1) {
        return arg0.method3752().compareTo(arg1.method3752());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3739((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
