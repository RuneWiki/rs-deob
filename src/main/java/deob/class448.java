package deob;

import java.util.Comparator;

@ObfuscatedName("qi")
public class class448 implements Comparator {

    @ObfuscatedName("qi.c")
    public final boolean field4762;

    public class448(boolean arg0) {
        this.field4762 = arg0;
    }

    @ObfuscatedName("qi.c(Lne;Lne;B)I")
    public int method7326(class371 arg0, class371 arg1) {
        return this.field4762 ? arg0.method6033(arg1) : arg1.method6033(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7326((class371) arg0, (class371) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
