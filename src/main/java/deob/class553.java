package deob;

import java.util.Comparator;

@ObfuscatedName("vy")
public class class553 implements Comparator {

    @ObfuscatedName("vy.aq")
    public final boolean field5426;

    public class553(boolean arg0) {
        this.field5426 = arg0;
    }

    @ObfuscatedName("vy.aq(Lsk;Lsk;B)I")
    public int method9027(class471 arg0, class471 arg1) {
        return this.field5426 ? arg0.method7810(arg1) : arg1.method7810(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method9027((class471) arg0, (class471) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
