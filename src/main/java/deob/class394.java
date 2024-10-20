package deob;

import java.util.Comparator;

@ObfuscatedName("pe")
public final class class394 implements Comparator {

    @ObfuscatedName("pe.ac(Lpv;Lpv;I)I")
    public int method6897(class399 arg0, class399 arg1) {
        return arg0.field4616.field4623 < arg1.field4616.field4623 ? -1 : (arg0.field4616.field4623 == arg1.field4616.field4623 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6897((class399) arg0, (class399) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
