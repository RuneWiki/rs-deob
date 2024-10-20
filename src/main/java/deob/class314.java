package deob;

import java.util.Comparator;

@ObfuscatedName("le")
public class class314 implements Comparator {

    @ObfuscatedName("le.b")
    public final boolean field3858;

    public class314(boolean arg0) {
        this.field3858 = arg0;
    }

    @ObfuscatedName("le.b(Ljw;Ljw;B)I")
    public int method5174(class283 arg0, class283 arg1) {
        return this.field3858 ? arg0.method4799(arg1) : arg1.method4799(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5174((class283) arg0, (class283) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
