package deob;

import java.util.Comparator;

@ObfuscatedName("cs")
public class class67 implements Comparator {

    @ObfuscatedName("cs.aq")
    public boolean field466;

    @ObfuscatedName("cs.aq(Lpm;Lpm;I)I")
    public int method1151(class396 arg0, class396 arg1) {
        if (arg0.field4594 == arg1.field4594) {
            return 0;
        }
        if (this.field466) {
            if (client.field500 == arg0.field4594) {
                return -1;
            }
            if (client.field500 == arg1.field4594) {
                return 1;
            }
        }
        return arg0.field4594 < arg1.field4594 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1151((class396) arg0, (class396) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
