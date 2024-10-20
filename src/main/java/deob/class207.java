package deob;

import java.util.Comparator;

@ObfuscatedName("gr")
public final class class207 implements Comparator {

    @ObfuscatedName("gr.n(Lgg;Lgg;I)I")
    public int method3597(class205 arg0, class205 arg1) {
        return arg0.field3050.field3066 < arg1.field3050.field3066 ? -1 : (arg0.field3050.field3066 == arg1.field3050.field3066 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3597((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
