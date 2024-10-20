package deob;

import java.util.Comparator;

@ObfuscatedName("cu")
public class class67 implements Comparator {

    @ObfuscatedName("cu.au")
    public boolean field524;

    @ObfuscatedName("cu.au(Loz;Loz;I)I")
    public int method1178(class367 arg0, class367 arg1) {
        if (arg0.field4349 == arg1.field4349) {
            return 0;
        }
        if (this.field524) {
            if (client.field527 == arg0.field4349) {
                return -1;
            }
            if (client.field527 == arg1.field4349) {
                return 1;
            }
        }
        return arg0.field4349 < arg1.field4349 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1178((class367) arg0, (class367) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
