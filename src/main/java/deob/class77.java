package deob;

import java.util.Comparator;

@ObfuscatedName("bl")
public class class77 implements Comparator {

    @ObfuscatedName("bl.x")
    public boolean field679;

    @ObfuscatedName("bl.x(Li;Li;B)I")
    public int method1235(class17 arg0, class17 arg1) {
        if (arg0.field82 == arg1.field82) {
            return 0;
        }
        if (this.field679) {
            if (client.field681 == arg0.field82) {
                return -1;
            }
            if (client.field681 == arg1.field82) {
                return 1;
            }
        }
        return arg0.field82 < arg1.field82 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1235((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
