package deob;

import java.util.Comparator;

@ObfuscatedName("bs")
public class class60 implements Comparator {

    @ObfuscatedName("bs.o")
    public boolean field476;

    @ObfuscatedName("bs.o(Lln;Lln;I)I")
    public int method1046(class324 arg0, class324 arg1) {
        if (arg0.field4084 == arg1.field4084) {
            return 0;
        }
        if (this.field476) {
            if (client.field539 == arg0.field4084) {
                return -1;
            }
            if (client.field539 == arg1.field4084) {
                return 1;
            }
        }
        return arg0.field4084 < arg1.field4084 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1046((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
