package deob;

import java.util.Comparator;

@ObfuscatedName("gv")
public final class class207 implements Comparator {

    @ObfuscatedName("gv.q(Lgd;Lgd;B)I")
    public int method3442(class204 arg0, class204 arg1) {
        return arg0.field2991.field3023 < arg1.field2991.field3023 ? -1 : (arg0.field2991.field3023 == arg1.field2991.field3023 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3442((class204) arg0, (class204) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
