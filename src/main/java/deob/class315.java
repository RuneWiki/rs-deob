package deob;

import java.util.Comparator;

@ObfuscatedName("le")
public class class315 implements Comparator {

    @ObfuscatedName("le.c")
    public final boolean field3818;

    public class315(boolean arg0) {
        this.field3818 = arg0;
    }

    @ObfuscatedName("le.c(Ljw;Ljw;I)I")
    public int method5482(class274 arg0, class274 arg1) {
        return this.field3818 ? arg0.method4683().method4818(arg1.method4683()) : arg1.method4683().method4818(arg0.method4683());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5482((class274) arg0, (class274) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
