package deob;

import java.util.Comparator;

@ObfuscatedName("lx")
public class class317 implements Comparator {

    @ObfuscatedName("lx.n")
    public final boolean field3827;

    public class317(boolean arg0) {
        this.field3827 = arg0;
    }

    @ObfuscatedName("lx.n(Lke;Lke;B)I")
    public int method5538(class288 arg0, class288 arg1) {
        return this.field3827 ? arg0.method5140(arg1) : arg1.method5140(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5538((class288) arg0, (class288) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
