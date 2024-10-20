package deob;

import java.util.Comparator;

@ObfuscatedName("hm")
public final class class217 implements Comparator {

    @ObfuscatedName("hm.j(Lhp;Lhp;I)I")
    public int method3679(class215 arg0, class215 arg1) {
        return arg0.field3159.field3177 < arg1.field3159.field3177 ? -1 : (arg0.field3159.field3177 == arg1.field3159.field3177 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3679((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
