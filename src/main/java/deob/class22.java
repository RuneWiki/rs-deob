package deob;

import java.util.Comparator;

@ObfuscatedName("u")
public final class class22 implements Comparator {

    @ObfuscatedName("u.z(Lf;Lf;B)I")
    public int method201(class17 arg0, class17 arg1) {
        return arg0.field75 < arg1.field75 ? -1 : (arg0.field75 == arg1.field75 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method201((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
