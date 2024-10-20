package deob;

import java.util.Comparator;

@ObfuscatedName("ns")
public class class388 implements Comparator {

    @ObfuscatedName("ns.v")
    public final boolean field4215;

    public class388(boolean arg0) {
        this.field4215 = arg0;
    }

    @ObfuscatedName("ns.v(Llx;Llx;I)I")
    public int method6216(class322 arg0, class322 arg1) {
        return this.field4215 ? arg0.method5188(arg1) : arg1.method5188(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6216((class322) arg0, (class322) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
