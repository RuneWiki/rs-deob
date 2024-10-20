package deob;

import java.util.Comparator;

@ObfuscatedName("ou")
public final class class365 implements Comparator {

    @ObfuscatedName("ou.aw(Lol;Lol;I)I")
    public int method6266(class368 arg0, class368 arg1) {
        return arg0.field4348 < arg1.field4348 ? -1 : (arg0.field4348 == arg1.field4348 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6266((class368) arg0, (class368) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
