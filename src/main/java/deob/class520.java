package deob;

import java.util.Comparator;

@ObfuscatedName("tz")
public class class520 implements Comparator {

    @ObfuscatedName("tz.aw")
    public final boolean field5131;

    public class520(boolean arg0) {
        this.field5131 = arg0;
    }

    @ObfuscatedName("tz.aw(Lqe;Lqe;B)I")
    public int method8555(class434 arg0, class434 arg1) {
        return this.field5131 ? arg0.method7203(arg1) : arg1.method7203(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8555((class434) arg0, (class434) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
