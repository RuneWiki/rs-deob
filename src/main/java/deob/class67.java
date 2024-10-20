package deob;

import java.util.Comparator;

@ObfuscatedName("cu")
public class class67 implements Comparator {

    @ObfuscatedName("cu.aw")
    public boolean field511;

    @ObfuscatedName("cu.aw(Lol;Lol;I)I")
    public int method1178(class368 arg0, class368 arg1) {
        if (arg0.field4345 == arg1.field4345) {
            return 0;
        }
        if (this.field511) {
            if (client.field517 == arg0.field4345) {
                return -1;
            }
            if (client.field517 == arg1.field4345) {
                return 1;
            }
        }
        return arg0.field4345 < arg1.field4345 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1178((class368) arg0, (class368) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
