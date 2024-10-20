package deob;

import java.util.Comparator;

@ObfuscatedName("ok")
public final class class367 implements Comparator {

    @ObfuscatedName("ok.aw(Lol;Lol;I)I")
    public int method6270(class368 arg0, class368 arg1) {
        return arg0.field4345 < arg1.field4345 ? -1 : (arg0.field4345 == arg1.field4345 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6270((class368) arg0, (class368) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
