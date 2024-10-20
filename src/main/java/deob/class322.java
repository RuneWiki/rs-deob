package deob;

import java.util.Comparator;

@ObfuscatedName("ls")
public final class class322 implements Comparator {

    @ObfuscatedName("ls.c(Lla;Lla;B)I")
    public int method5546(class325 arg0, class325 arg1) {
        return arg0.field4105 < arg1.field4105 ? -1 : (arg0.field4105 == arg1.field4105 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5546((class325) arg0, (class325) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
