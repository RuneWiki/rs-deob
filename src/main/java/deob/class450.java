package deob;

import java.util.Comparator;

@ObfuscatedName("qc")
public class class450 implements Comparator {

    @ObfuscatedName("qc.s")
    public final boolean field4768;

    public class450(boolean arg0) {
        this.field4768 = arg0;
    }

    @ObfuscatedName("qc.s(Lnb;Lnb;I)I")
    public int method7221(class372 arg0, class372 arg1) {
        return this.field4768 ? arg0.method5996().method7490(arg1.method5996()) : arg1.method5996().method7490(arg0.method5996());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7221((class372) arg0, (class372) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
