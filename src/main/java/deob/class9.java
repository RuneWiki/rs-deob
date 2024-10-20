package deob;

import java.util.Comparator;

@ObfuscatedName("d")
public final class class9 implements Comparator {

    @ObfuscatedName("d.c(Lv;Lv;I)I")
    public int method64(class8 arg0, class8 arg1) {
        return arg0.field52.field60 < arg1.field52.field60 ? -1 : (arg0.field52.field60 == arg1.field52.field60 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method64((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
