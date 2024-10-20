package deob;

import java.util.Comparator;

@ObfuscatedName("ah")
public class class47 implements Comparator {

    @ObfuscatedName("ah.s")
    public boolean field399;

    @ObfuscatedName("ah.s(Ljj;Ljj;I)I")
    public int method832(class285 arg0, class285 arg1) {
        if (arg0.field3648 == arg1.field3648) {
            return 0;
        }
        if (this.field399) {
            if (client.field405 == arg0.field3648) {
                return -1;
            }
            if (client.field405 == arg1.field3648) {
                return 1;
            }
        }
        return arg0.field3648 < arg1.field3648 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method832((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
