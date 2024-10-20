package deob;

import java.util.Comparator;

@ObfuscatedName("lh")
public class class322 implements Comparator {

    @ObfuscatedName("lh.t")
    public final boolean field3939;

    public class322(boolean arg0) {
        this.field3939 = arg0;
    }

    @ObfuscatedName("lh.t(Lkv;Lkv;I)I")
    public int method5212(class297 arg0, class297 arg1) {
        return this.field3939 ? arg0.method4859(arg1) : arg1.method4859(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5212((class297) arg0, (class297) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
