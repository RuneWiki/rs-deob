package deob;

import java.util.Comparator;

@ObfuscatedName("oy")
public class class407 implements Comparator {

    @ObfuscatedName("oy.i")
    public final boolean field4361;

    public class407(boolean arg0) {
        this.field4361 = arg0;
    }

    @ObfuscatedName("oy.i(Lla;Lla;B)I")
    public int method6506(class338 arg0, class338 arg1) {
        return this.field4361 ? arg0.method5471().method6815(arg1.method5471()) : arg1.method5471().method6815(arg0.method5471());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6506((class338) arg0, (class338) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
