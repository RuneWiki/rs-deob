package deob;

import java.util.Comparator;

@ObfuscatedName("cf")
public class class63 implements Comparator {

    @ObfuscatedName("cf.af")
    public boolean field486;

    @ObfuscatedName("cf.af(Lnu;Lnu;B)I")
    public int method1148(class352 arg0, class352 arg1) {
        if (arg0.field4284 == arg1.field4284) {
            return 0;
        }
        if (this.field486) {
            if (client.field579 == arg0.field4284) {
                return -1;
            }
            if (client.field579 == arg1.field4284) {
                return 1;
            }
        }
        return arg0.field4284 < arg1.field4284 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1148((class352) arg0, (class352) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
