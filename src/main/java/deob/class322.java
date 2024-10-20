package deob;

import java.util.Comparator;

@ObfuscatedName("lm")
public final class class322 implements Comparator {

    @ObfuscatedName("lm.c(Llj;Llj;B)I")
    public int method5435(class323 arg0, class323 arg1) {
        return arg0.field4062 < arg1.field4062 ? -1 : (arg0.field4062 == arg1.field4062 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5435((class323) arg0, (class323) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
