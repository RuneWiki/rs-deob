package deob;

import java.util.Comparator;

@ObfuscatedName("lt")
public final class class326 implements Comparator {

    @ObfuscatedName("lt.o(Lln;Lln;B)I")
    public int method5355(class324 arg0, class324 arg1) {
        return arg0.field4083.field4094 < arg1.field4083.field4094 ? -1 : (arg0.field4083.field4094 == arg1.field4083.field4094 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5355((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
