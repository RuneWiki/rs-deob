package deob;

import java.util.Comparator;

@ObfuscatedName("lo")
public class class322 implements Comparator {

    @ObfuscatedName("lo.o")
    public final boolean field3938;

    public class322(boolean arg0) {
        this.field3938 = arg0;
    }

    @ObfuscatedName("lo.o(Lku;Lku;I)I")
    public int method5228(class297 arg0, class297 arg1) {
        return this.field3938 ? arg0.method4880(arg1) : arg1.method4880(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5228((class297) arg0, (class297) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
