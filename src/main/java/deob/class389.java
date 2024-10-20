package deob;

import java.util.Comparator;

@ObfuscatedName("nj")
public class class389 implements Comparator {

    @ObfuscatedName("nj.v")
    public final boolean field4217;

    public class389(boolean arg0) {
        this.field4217 = arg0;
    }

    @ObfuscatedName("nj.v(Llx;Llx;B)I")
    public int method6231(class322 arg0, class322 arg1) {
        return this.field4217 ? arg0.method5229().method5341(arg1.method5229()) : arg1.method5229().method5341(arg0.method5229());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6231((class322) arg0, (class322) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
