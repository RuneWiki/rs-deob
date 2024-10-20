package deob;

import java.util.Comparator;

@ObfuscatedName("bx")
public class class63 implements Comparator {

    @ObfuscatedName("bx.y")
    public boolean field622;

    @ObfuscatedName("bx.y(Ln;Ln;B)I")
    public int method1098(class3 arg0, class3 arg1) {
        if (arg0.field18 == arg1.field18) {
            return 0;
        }
        if (this.field622) {
            if (client.field627 == arg0.field18) {
                return -1;
            }
            if (client.field627 == arg1.field18) {
                return 1;
            }
        }
        return arg0.field18 < arg1.field18 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1098((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
