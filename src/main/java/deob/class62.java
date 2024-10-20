package deob;

import java.util.Comparator;

@ObfuscatedName("bg")
public class class62 implements Comparator {

    @ObfuscatedName("bg.z")
    public boolean field576;

    @ObfuscatedName("bg.z(Ls;Ls;B)I")
    public int method1044(class3 arg0, class3 arg1) {
        if (arg0.field20 == arg1.field20) {
            return 0;
        }
        if (this.field576) {
            if (client.field582 == arg0.field20) {
                return -1;
            }
            if (client.field582 == arg1.field20) {
                return 1;
            }
        }
        return arg0.field20 < arg1.field20 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1044((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
