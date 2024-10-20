package deob;

import java.util.Comparator;

@ObfuscatedName("br")
public class class68 implements Comparator {

    @ObfuscatedName("br.s")
    public boolean field620;

    @ObfuscatedName("br.s(Lq;Lq;I)I")
    public int method1105(class8 arg0, class8 arg1) {
        if (arg0.field54 == arg1.field54) {
            return 0;
        }
        if (this.field620) {
            if (client.field872 == arg0.field54) {
                return -1;
            }
            if (client.field872 == arg1.field54) {
                return 1;
            }
        }
        return arg0.field54 < arg1.field54 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1105((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
