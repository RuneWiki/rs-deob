package deob;

import java.util.Comparator;

@ObfuscatedName("lb")
public class class315 implements Comparator {

    @ObfuscatedName("lb.f")
    public final boolean field3826;

    public class315(boolean arg0) {
        this.field3826 = arg0;
    }

    @ObfuscatedName("lb.f(Ljw;Ljw;B)I")
    public int method5284(class285 arg0, class285 arg1) {
        return this.field3826 ? arg0.method4927().method5063(arg1.method4927()) : arg1.method4927().method5063(arg0.method4927());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5284((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
