package deob;

import java.util.Comparator;

@ObfuscatedName("mf")
public class class331 implements Comparator {

    @ObfuscatedName("mf.am(Lmj;Lmj;I)I")
    public int method5692(class324 arg0, class324 arg1) {
        return arg0.field3521 - arg1.field3521;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5692((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
