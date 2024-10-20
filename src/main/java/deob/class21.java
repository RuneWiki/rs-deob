package deob;

import java.util.Comparator;

@ObfuscatedName("r")
public final class class21 implements Comparator {

    @ObfuscatedName("r.z(Lf;Lf;I)I")
    public int method194(class17 arg0, class17 arg1) {
        return arg0.method120().compareTo(arg1.method120());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method194((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
