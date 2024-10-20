package deob;

import java.util.Comparator;

@ObfuscatedName("pq")
public final class class396 implements Comparator {

    @ObfuscatedName("pq.ap(Lpv;Lpv;I)I")
    public int method7121(class400 arg0, class400 arg1) {
        return arg0.method7152().compareTo(arg1.method7152());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7121((class400) arg0, (class400) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
