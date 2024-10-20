package deob;

import java.util.Comparator;

@ObfuscatedName("rl")
public class class473 implements Comparator {

    @ObfuscatedName("rl.h")
    public final boolean field4979;

    public class473(boolean arg0) {
        this.field4979 = arg0;
    }

    @ObfuscatedName("rl.h(Lov;Lov;I)I")
    public int method8089(class394 arg0, class394 arg1) {
        return this.field4979 ? arg0.method6805(arg1) : arg1.method6805(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8089((class394) arg0, (class394) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
