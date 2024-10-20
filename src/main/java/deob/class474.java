package deob;

import java.util.Comparator;

@ObfuscatedName("ry")
public class class474 implements Comparator {

    @ObfuscatedName("ry.h")
    public final boolean field4980;

    public class474(boolean arg0) {
        this.field4980 = arg0;
    }

    @ObfuscatedName("ry.h(Lov;Lov;I)I")
    public int method8097(class394 arg0, class394 arg1) {
        return this.field4980 ? arg0.method6844().method8391(arg1.method6844()) : arg1.method6844().method8391(arg0.method6844());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8097((class394) arg0, (class394) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
