package deob;

import java.util.Comparator;

@ObfuscatedName("ef")
public class class150 implements Comparator {

    @ObfuscatedName("ef.t")
    public final boolean field2099;

    public class150(boolean arg0) {
        this.field2099 = arg0;
    }

    @ObfuscatedName("ef.t(Lkp;Lkp;I)I")
    public int method2859(class302 arg0, class302 arg1) {
        return this.field2099 ? arg0.field3843 - arg1.field3843 : arg1.field3843 - arg0.field3843;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2859((class302) arg0, (class302) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
