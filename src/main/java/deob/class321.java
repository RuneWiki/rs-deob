package deob;

import java.util.Comparator;

@ObfuscatedName("lw")
public final class class321 implements Comparator {

    @ObfuscatedName("lw.o(Lln;Lln;I)I")
    public int method5315(class324 arg0, class324 arg1) {
        return arg0.field4085 < arg1.field4085 ? -1 : (arg0.field4085 == arg1.field4085 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5315((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
