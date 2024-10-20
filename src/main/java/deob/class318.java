package deob;

import java.util.Comparator;

@ObfuscatedName("lk")
public class class318 implements Comparator {

    @ObfuscatedName("lk.a")
    public final boolean field3842;

    public class318(boolean arg0) {
        this.field3842 = arg0;
    }

    @ObfuscatedName("lk.a(Lkn;Lkn;B)I")
    public int method5475(class289 arg0, class289 arg1) {
        return this.field3842 ? arg0.method5091(arg1) : arg1.method5091(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5475((class289) arg0, (class289) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
