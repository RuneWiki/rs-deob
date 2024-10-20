package deob;

import java.util.Comparator;

@ObfuscatedName("lj")
public class class315 implements Comparator {

    @ObfuscatedName("lj.b")
    public final boolean field3860;

    public class315(boolean arg0) {
        this.field3860 = arg0;
    }

    @ObfuscatedName("lj.b(Ljw;Ljw;I)I")
    public int method5183(class283 arg0, class283 arg1) {
        return this.field3860 ? arg0.method4780().method4928(arg1.method4780()) : arg1.method4780().method4928(arg0.method4780());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5183((class283) arg0, (class283) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
