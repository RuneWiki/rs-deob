package deob;

import java.util.Comparator;

@ObfuscatedName("id")
public class class221 implements Comparator {

    @ObfuscatedName("id.aw(Lir;Lir;B)I")
    public int method3922(class216 arg0, class216 arg1) {
        return arg0.method3861() - arg1.method3861();
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3922((class216) arg0, (class216) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
