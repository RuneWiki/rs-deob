package deob;

import java.util.Comparator;

@ObfuscatedName("ha")
public final class class217 implements Comparator {

    @ObfuscatedName("ha.f(Lhn;Lhn;I)I")
    public int method3771(class218 arg0, class218 arg1) {
        return arg0.method3785().compareTo(arg1.method3785());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3771((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
