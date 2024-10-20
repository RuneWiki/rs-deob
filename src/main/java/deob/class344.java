package deob;

import java.util.Comparator;

@ObfuscatedName("nk")
public class class344 implements Comparator {

    @ObfuscatedName("nk.ab(Lmt;Lmt;I)I")
    public int method5897(class337 arg0, class337 arg1) {
        return arg0.field3626 - arg1.field3626;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5897((class337) arg0, (class337) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
