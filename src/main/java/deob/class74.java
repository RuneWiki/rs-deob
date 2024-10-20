package deob;

import java.util.Comparator;

@ObfuscatedName("bw")
public class class74 implements Comparator {

    @ObfuscatedName("bw.o")
    public boolean field866;

    @ObfuscatedName("bw.o(Ll;Ll;I)I")
    public int method1121(class15 arg0, class15 arg1) {
        if (arg0.field296 == arg1.field296) {
            return 0;
        }
        if (this.field866) {
            if (client.field871 == arg0.field296) {
                return -1;
            }
            if (client.field871 == arg1.field296) {
                return 1;
            }
        }
        return arg0.field296 < arg1.field296 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1121((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
