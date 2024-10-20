package deob;

import java.util.Comparator;

@ObfuscatedName("cp")
public class class67 implements Comparator {

    @ObfuscatedName("cp.az")
    public boolean field479;

    @ObfuscatedName("cp.az(Log;Log;B)I")
    public int method1123(class387 arg0, class387 arg1) {
        if (arg0.field4482 == arg1.field4482) {
            return 0;
        }
        if (this.field479) {
            if (client.field509 == arg0.field4482) {
                return -1;
            }
            if (client.field509 == arg1.field4482) {
                return 1;
            }
        }
        return arg0.field4482 < arg1.field4482 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1123((class387) arg0, (class387) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
