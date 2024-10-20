package deob;

import java.util.Comparator;

@ObfuscatedName("bb")
public class class68 implements Comparator {

    @ObfuscatedName("bb.f")
    public boolean field622;

    @ObfuscatedName("bb.f(Lx;Lx;I)I")
    public int method1142(class8 arg0, class8 arg1) {
        if (arg0.field37 == arg1.field37) {
            return 0;
        }
        if (this.field622) {
            if (client.field829 == arg0.field37) {
                return -1;
            }
            if (client.field829 == arg1.field37) {
                return 1;
            }
        }
        return arg0.field37 < arg1.field37 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1142((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
