package deob;

import java.util.Comparator;

@ObfuscatedName("hn")
public final class class221 implements Comparator {

    @ObfuscatedName("hn.i(Lhl;Lhl;B)I")
    public int method3749(class218 arg0, class218 arg1) {
        return arg0.field3206.field3228 < arg1.field3206.field3228 ? -1 : (arg0.field3206.field3228 == arg1.field3206.field3228 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3749((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
