package deob;

import java.util.Comparator;

@ObfuscatedName("bp")
public class class75 implements Comparator {

    @ObfuscatedName("bp.f")
    public boolean field612;

    @ObfuscatedName("bp.f(Ljt;Ljt;B)I")
    public int method1044(class284 arg0, class284 arg1) {
        if (arg0.field3649 == arg1.field3649) {
            return 0;
        }
        if (this.field612) {
            if (client.field804 == arg0.field3649) {
                return -1;
            }
            if (client.field804 == arg1.field3649) {
                return 1;
            }
        }
        return arg0.field3649 < arg1.field3649 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1044((class284) arg0, (class284) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
