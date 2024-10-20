package deob;

import java.util.Comparator;

@ObfuscatedName("li")
public final class class320 implements Comparator {

    @ObfuscatedName("li.v(Llc;Llc;B)I")
    public int method5403(class324 arg0, class324 arg1) {
        return arg0.method5432().compareTo(arg1.method5432());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5403((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
