package deob;

import java.util.Comparator;

@ObfuscatedName("bj")
public class class77 implements Comparator {

    @ObfuscatedName("bj.m")
    public boolean field668;

    @ObfuscatedName("bj.m(Ls;Ls;I)I")
    public int method1181(class17 arg0, class17 arg1) {
        if (arg0.field76 == arg1.field76) {
            return 0;
        }
        if (this.field668) {
            if (client.field729 == arg0.field76) {
                return -1;
            }
            if (client.field729 == arg1.field76) {
                return 1;
            }
        }
        return arg0.field76 < arg1.field76 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1181((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
