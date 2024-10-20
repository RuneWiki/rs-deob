package deob;

import java.util.Comparator;

@ObfuscatedName("b")
public final class class7 implements Comparator {

    @ObfuscatedName("b.g(Le;Le;B)I")
    public int method69(class3 arg0, class3 arg1) {
        return arg0.method19().compareTo(arg1.method19());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method69((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
