package deob;

import java.util.Comparator;

@ObfuscatedName("bd")
public class class68 implements Comparator {

    @ObfuscatedName("bd.c")
    public boolean field643;

    @ObfuscatedName("bd.c(Ll;Ll;I)I")
    public int method1163(class8 arg0, class8 arg1) {
        if (arg0.field41 == arg1.field41) {
            return 0;
        }
        if (this.field643) {
            if (client.field646 == arg0.field41) {
                return -1;
            }
            if (client.field646 == arg1.field41) {
                return 1;
            }
        }
        return arg0.field41 < arg1.field41 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1163((class8) arg0, (class8) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
