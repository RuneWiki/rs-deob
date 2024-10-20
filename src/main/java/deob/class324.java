package deob;

import java.util.Comparator;

@Deprecated
@ObfuscatedName("lw")
public final class class324 implements Comparator {

    @ObfuscatedName("lw.c(Lla;Lla;I)I")
    public int method5556(class325 arg0, class325 arg1) {
        return arg0.field4100 < arg1.field4100 ? -1 : (arg0.field4100 == arg1.field4100 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5556((class325) arg0, (class325) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
