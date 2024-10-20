package deob;

import java.util.Comparator;

@ObfuscatedName("qw")
public class class423 implements Comparator {

    // $FF: synthetic field
    public final class424 this$0;

    public class423(class424 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("qw.au(Lqj;Lqj;I)I")
    public int method7149(class425 arg0, class425 arg1) {
        if (arg0.field4623 > arg1.field4623) {
            return 1;
        } else if (arg0.field4623 < arg1.field4623) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7149((class425) arg0, (class425) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
