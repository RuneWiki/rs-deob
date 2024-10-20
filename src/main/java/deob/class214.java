package deob;

import java.util.Comparator;

@ObfuscatedName("hl")
public final class class214 implements Comparator {

    @ObfuscatedName("hl.b(Lhn;Lhn;I)I")
    public int method3668(class215 arg0, class215 arg1) {
        return arg0.method3677().compareTo(arg1.method3677());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3668((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
