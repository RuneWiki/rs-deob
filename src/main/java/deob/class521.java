package deob;

import java.util.Comparator;

@ObfuscatedName("uw")
public class class521 implements Comparator {

    @ObfuscatedName("uw.aw")
    public final boolean field5133;

    public class521(boolean arg0) {
        this.field5133 = arg0;
    }

    @ObfuscatedName("uw.aw(Lqe;Lqe;I)I")
    public int method8564(class434 arg0, class434 arg1) {
        return this.field5133 ? arg0.method7233().method8880(arg1.method7233()) : arg1.method7233().method8880(arg0.method7233());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8564((class434) arg0, (class434) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
