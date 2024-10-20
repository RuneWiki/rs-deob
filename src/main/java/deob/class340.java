package deob;

import java.util.Comparator;

@ObfuscatedName("mc")
public final class class340 implements Comparator {

    @ObfuscatedName("mc.a(Llp;Llp;B)I")
    public int method5952(class338 arg0, class338 arg1) {
        return arg0.field4207.field4214 < arg1.field4207.field4214 ? -1 : (arg0.field4207.field4214 == arg1.field4207.field4214 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5952((class338) arg0, (class338) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
