package deob;

import java.util.Comparator;

@ObfuscatedName("qn")
public class class450 implements Comparator {

    @ObfuscatedName("qn.c")
    public final boolean field4794;

    public class450(boolean arg0) {
        this.field4794 = arg0;
    }

    @ObfuscatedName("qn.c(Lnc;Lnc;I)I")
    public int method7461(class373 arg0, class373 arg1) {
        return this.field4794 ? arg0.method6198(arg1) : arg1.method6198(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7461((class373) arg0, (class373) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
