package deob;

import java.util.Comparator;

@ObfuscatedName("or")
public class class407 implements Comparator {

    @ObfuscatedName("or.l")
    public final boolean field4352;

    public class407(boolean arg0) {
        this.field4352 = arg0;
    }

    @ObfuscatedName("or.l(Llu;Llu;B)I")
    public int method6537(class338 arg0, class338 arg1) {
        return this.field4352 ? arg0.method5508().method6829(arg1.method5508()) : arg1.method5508().method6829(arg0.method5508());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6537((class338) arg0, (class338) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
