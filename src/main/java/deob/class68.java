package deob;

import java.util.Comparator;

@ObfuscatedName("bj")
public class class68 implements Comparator {

    @ObfuscatedName("bj.m")
    public boolean field619;

    @ObfuscatedName("bj.m(Ll;Ll;B)I")
    public int method1146(class8 arg0, class8 arg1) {
        if (arg0.field40 == arg1.field40) {
            return 0;
        }
        if (this.field619) {
            if (client.field622 == arg0.field40) {
                return -1;
            }
            if (client.field622 == arg1.field40) {
                return 1;
            }
        }
        return arg0.field40 < arg1.field40 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1146((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
