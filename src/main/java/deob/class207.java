package deob;

import java.util.Comparator;

@ObfuscatedName("ga")
public final class class207 implements Comparator {

    @ObfuscatedName("ga.b(Lgk;Lgk;I)I")
    public int method3461(class205 arg0, class205 arg1) {
        return arg0.field3041.field3069 < arg1.field3041.field3069 ? -1 : (arg0.field3041.field3069 == arg1.field3041.field3069 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3461((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
