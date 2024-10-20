package deob;

import java.util.Comparator;

@ObfuscatedName("ls")
public class class314 implements Comparator {

    @ObfuscatedName("ls.f")
    public final boolean field3823;

    public class314(boolean arg0) {
        this.field3823 = arg0;
    }

    @ObfuscatedName("ls.f(Ljw;Ljw;B)I")
    public int method5268(class285 arg0, class285 arg1) {
        return this.field3823 ? arg0.method4932(arg1) : arg1.method4932(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5268((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
