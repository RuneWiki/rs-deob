package deob;

import java.util.Comparator;

@ObfuscatedName("ox")
public class class406 implements Comparator {

    @ObfuscatedName("ox.i")
    public final boolean field4359;

    public class406(boolean arg0) {
        this.field4359 = arg0;
    }

    @ObfuscatedName("ox.i(Lla;Lla;S)I")
    public int method6503(class338 arg0, class338 arg1) {
        return this.field4359 ? arg0.method5447(arg1) : arg1.method5447(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6503((class338) arg0, (class338) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
