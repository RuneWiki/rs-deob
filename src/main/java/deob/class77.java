package deob;

import java.util.Comparator;

@ObfuscatedName("bu")
public class class77 implements Comparator {

    @ObfuscatedName("bu.f")
    public boolean field677;

    @ObfuscatedName("bu.f(Ly;Ly;B)I")
    public int method1213(class17 arg0, class17 arg1) {
        if (arg0.field77 == arg1.field77) {
            return 0;
        }
        if (this.field677) {
            if (client.field817 == arg0.field77) {
                return -1;
            }
            if (client.field817 == arg1.field77) {
                return 1;
            }
        }
        return arg0.field77 < arg1.field77 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1213((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
