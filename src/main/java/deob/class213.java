package deob;

import java.util.Comparator;

@ObfuscatedName("hf")
public final class class213 implements Comparator {

    @ObfuscatedName("hf.v(Lhu;Lhu;I)I")
    public int method3675(class214 arg0, class214 arg1) {
        return arg0.method3686().compareTo(arg1.method3686());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3675((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
