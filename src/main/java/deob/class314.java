package deob;

import java.util.Comparator;

@ObfuscatedName("lx")
public class class314 implements Comparator {

    @ObfuscatedName("lx.c")
    public final boolean field3817;

    public class314(boolean arg0) {
        this.field3817 = arg0;
    }

    @ObfuscatedName("lx.c(Ljw;Ljw;B)I")
    public int method5477(class274 arg0, class274 arg1) {
        return this.field3817 ? arg0.method4686(arg1) : arg1.method4686(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5477((class274) arg0, (class274) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
