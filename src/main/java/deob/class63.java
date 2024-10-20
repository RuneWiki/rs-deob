package deob;

import java.util.Comparator;

@ObfuscatedName("bf")
public class class63 implements Comparator {

    @ObfuscatedName("bf.v")
    public boolean field618;

    @ObfuscatedName("bf.v(Lo;Lo;I)I")
    public int method1072(class3 arg0, class3 arg1) {
        if (arg0.field24 == arg1.field24) {
            return 0;
        }
        if (this.field618) {
            if (client.field711 == arg0.field24) {
                return -1;
            }
            if (client.field711 == arg1.field24) {
                return 1;
            }
        }
        return arg0.field24 < arg1.field24 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1072((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
