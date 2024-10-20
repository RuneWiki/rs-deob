package deob;

import java.util.Comparator;

@ObfuscatedName("ll")
public class class324 implements Comparator {

    @ObfuscatedName("ll.x")
    public final boolean field3836;

    public class324(boolean arg0) {
        this.field3836 = arg0;
    }

    @ObfuscatedName("ll.x(Ljd;Ljd;I)I")
    public int method5494(class284 arg0, class284 arg1) {
        return this.field3836 ? arg0.method4699(arg1) : arg1.method4699(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5494((class284) arg0, (class284) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
