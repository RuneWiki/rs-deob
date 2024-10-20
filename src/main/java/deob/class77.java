package deob;

import java.util.Comparator;

@ObfuscatedName("bt")
public class class77 implements Comparator {

    @ObfuscatedName("bt.z")
    public boolean field667;

    @ObfuscatedName("bt.z(Lf;Lf;I)I")
    public int method1185(class17 arg0, class17 arg1) {
        if (arg0.field79 == arg1.field79) {
            return 0;
        }
        if (this.field667) {
            if (client.field672 == arg0.field79) {
                return -1;
            }
            if (client.field672 == arg1.field79) {
                return 1;
            }
        }
        return arg0.field79 < arg1.field79 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1185((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
