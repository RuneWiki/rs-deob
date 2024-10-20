package deob;

import java.util.Comparator;

@ObfuscatedName("lx")
public class class323 implements Comparator {

    @ObfuscatedName("lx.c")
    public final boolean field3935;

    public class323(boolean arg0) {
        this.field3935 = arg0;
    }

    @ObfuscatedName("lx.c(Lku;Lku;I)I")
    public int method5265(class297 arg0, class297 arg1) {
        return this.field3935 ? arg0.method4884().method5043(arg1.method4884()) : arg1.method4884().method5043(arg0.method4884());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5265((class297) arg0, (class297) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
