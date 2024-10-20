package deob;

import java.util.Comparator;

@ObfuscatedName("lq")
public class class322 implements Comparator {

    @ObfuscatedName("lq.g")
    public final boolean field3942;

    public class322(boolean arg0) {
        this.field3942 = arg0;
    }

    @ObfuscatedName("lq.g(Lkg;Lkg;I)I")
    public int method5299(class297 arg0, class297 arg1) {
        return this.field3942 ? arg0.method4932(arg1) : arg1.method4932(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5299((class297) arg0, (class297) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
