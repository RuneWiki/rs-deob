package deob;

import java.util.Comparator;

@ObfuscatedName("pd")
public class class424 implements Comparator {

    @ObfuscatedName("pd.c")
    public final boolean field4533;

    public class424(boolean arg0) {
        this.field4533 = arg0;
    }

    @ObfuscatedName("pd.c(Lmv;Lmv;B)I")
    public int method6912(class350 arg0, class350 arg1) {
        return this.field4533 ? arg0.method5718(arg1) : arg1.method5718(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6912((class350) arg0, (class350) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
