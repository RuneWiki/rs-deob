package deob;

import java.util.Comparator;

@ObfuscatedName("bw")
public class class68 implements Comparator {

    @ObfuscatedName("bw.u")
    public boolean field641;

    @ObfuscatedName("bw.u(Ly;Ly;I)I")
    public int method1142(class8 arg0, class8 arg1) {
        if (arg0.field50 == arg1.field50) {
            return 0;
        }
        if (this.field641) {
            if (client.field645 == arg0.field50) {
                return -1;
            }
            if (client.field645 == arg1.field50) {
                return 1;
            }
        }
        return arg0.field50 < arg1.field50 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1142((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
