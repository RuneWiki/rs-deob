package deob;

import java.util.Comparator;

@ObfuscatedName("gv")
public final class class204 implements Comparator {

    @ObfuscatedName("gv.n(Lgy;Lgy;I)I")
    public int method3572(class205 arg0, class205 arg1) {
        return arg0.method3574().compareTo(arg1.method3574());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3572((class205) arg0, (class205) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
