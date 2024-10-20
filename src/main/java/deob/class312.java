package deob;

import java.util.Comparator;

@ObfuscatedName("kd")
public final class class312 implements Comparator {

    @ObfuscatedName("kd.c(Lld;Lld;I)I")
    public int method5148(class315 arg0, class315 arg1) {
        return arg0.field3953 < arg1.field3953 ? -1 : (arg0.field3953 == arg1.field3953 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5148((class315) arg0, (class315) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
