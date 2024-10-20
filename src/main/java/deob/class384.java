package deob;

import java.util.Comparator;

@ObfuscatedName("oj")
public final class class384 implements Comparator {

    @ObfuscatedName("oj.ac(Lod;Lod;I)I")
    public int method6461(class382 arg0, class382 arg1) {
        return arg0.field4392.field4400 < arg1.field4392.field4400 ? -1 : (arg0.field4392.field4400 == arg1.field4392.field4400 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6461((class382) arg0, (class382) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
