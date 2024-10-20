package deob;

import java.util.Comparator;

@ObfuscatedName("qq")
public class class449 implements Comparator {

    @ObfuscatedName("qq.c")
    public final boolean field4763;

    public class449(boolean arg0) {
        this.field4763 = arg0;
    }

    @ObfuscatedName("qq.c(Lne;Lne;B)I")
    public int method7333(class371 arg0, class371 arg1) {
        return this.field4763 ? arg0.method6075().method7621(arg1.method6075()) : arg1.method6075().method7621(arg0.method6075());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7333((class371) arg0, (class371) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
