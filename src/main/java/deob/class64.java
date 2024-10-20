package deob;

import java.util.Comparator;

@ObfuscatedName("bg")
public class class64 implements Comparator {

    @ObfuscatedName("bg.h")
    public boolean field503;

    @ObfuscatedName("bg.h(Lmg;Lmg;B)I")
    public int method1146(class341 arg0, class341 arg1) {
        if (arg0.field4266 == arg1.field4266) {
            return 0;
        }
        if (this.field503) {
            if (client.field683 == arg0.field4266) {
                return -1;
            }
            if (client.field683 == arg1.field4266) {
                return 1;
            }
        }
        return arg0.field4266 < arg1.field4266 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1146((class341) arg0, (class341) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
