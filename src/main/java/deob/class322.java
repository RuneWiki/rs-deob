package deob;

import java.util.Comparator;

@ObfuscatedName("lr")
public class class322 implements Comparator {

    @ObfuscatedName("lr.c")
    public final boolean field3934;

    public class322(boolean arg0) {
        this.field3934 = arg0;
    }

    @ObfuscatedName("lr.c(Lku;Lku;B)I")
    public int method5256(class297 arg0, class297 arg1) {
        return this.field3934 ? arg0.method4888(arg1) : arg1.method4888(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5256((class297) arg0, (class297) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
