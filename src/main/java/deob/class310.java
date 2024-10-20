package deob;

import java.util.Comparator;

@ObfuscatedName("ki")
public class class310 implements Comparator {

    @ObfuscatedName("ki.z")
    public final boolean field3742;

    public class310(boolean arg0) {
        this.field3742 = arg0;
    }

    @ObfuscatedName("ki.z(Ljx;Ljx;I)I")
    public int method5238(class283 arg0, class283 arg1) {
        return this.field3742 ? arg0.method4893().method5021(arg1.method4893()) : arg1.method4893().method5021(arg0.method4893());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5238((class283) arg0, (class283) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
