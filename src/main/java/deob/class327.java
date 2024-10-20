package deob;

import java.util.Comparator;

@ObfuscatedName("lt")
public final class class327 implements Comparator {

    @ObfuscatedName("lt.c(Lla;Lla;B)I")
    public int method5587(class325 arg0, class325 arg1) {
        return arg0.field4104.field4110 < arg1.field4104.field4110 ? -1 : (arg0.field4104.field4110 == arg1.field4104.field4110 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5587((class325) arg0, (class325) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
