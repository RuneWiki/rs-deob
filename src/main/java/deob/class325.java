package deob;

import java.util.Comparator;

@ObfuscatedName("lt")
public class class325 implements Comparator {

    @ObfuscatedName("lt.m")
    public final boolean field3849;

    public class325(boolean arg0) {
        this.field3849 = arg0;
    }

    @ObfuscatedName("lt.m(Ljf;Ljf;I)I")
    public int method5606(class284 arg0, class284 arg1) {
        return this.field3849 ? arg0.method4796().method4927(arg1.method4796()) : arg1.method4796().method4927(arg0.method4796());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5606((class284) arg0, (class284) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
