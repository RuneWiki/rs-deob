package deob;

import java.util.Comparator;

@ObfuscatedName("bi")
public class class63 implements Comparator {

    @ObfuscatedName("bi.f")
    public boolean field492;

    @ObfuscatedName("bi.f(Lmv;Lmv;I)I")
    public int method1132(class345 arg0, class345 arg1) {
        if (arg0.field4289 == arg1.field4289) {
            return 0;
        }
        if (this.field492) {
            if (client.field601 == arg0.field4289) {
                return -1;
            }
            if (client.field601 == arg1.field4289) {
                return 1;
            }
        }
        return arg0.field4289 < arg1.field4289 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1132((class345) arg0, (class345) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
