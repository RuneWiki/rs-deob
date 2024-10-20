package deob;

import java.util.Comparator;

@ObfuscatedName("bw")
public class class60 implements Comparator {

    @ObfuscatedName("bw.s")
    public boolean field470;

    @ObfuscatedName("bw.s(Llh;Llh;B)I")
    public int method996(class324 arg0, class324 arg1) {
        if (arg0.field4068 == arg1.field4068) {
            return 0;
        }
        if (this.field470) {
            if (client.field476 == arg0.field4068) {
                return -1;
            }
            if (client.field476 == arg1.field4068) {
                return 1;
            }
        }
        return arg0.field4068 < arg1.field4068 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method996((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
