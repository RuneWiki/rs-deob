package deob;

import java.util.Comparator;

@ObfuscatedName("nx")
public final class class362 implements Comparator {

    @ObfuscatedName("nx.au(Loz;Loz;I)I")
    public int method6248(class367 arg0, class367 arg1) {
        return arg0.field4345.field4353 < arg1.field4345.field4353 ? -1 : (arg0.field4345.field4353 == arg1.field4345.field4353 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6248((class367) arg0, (class367) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
