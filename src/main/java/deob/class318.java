package deob;

import java.util.Comparator;

@ObfuscatedName("lg")
public class class318 implements Comparator {

    @ObfuscatedName("lg.n")
    public final boolean field3831;

    public class318(boolean arg0) {
        this.field3831 = arg0;
    }

    @ObfuscatedName("lg.n(Lke;Lke;I)I")
    public int method5548(class288 arg0, class288 arg1) {
        return this.field3831 ? arg0.method5125().method5263(arg1.method5125()) : arg1.method5125().method5263(arg0.method5125());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5548((class288) arg0, (class288) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
