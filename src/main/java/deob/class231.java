package deob;

import java.util.Comparator;

@ObfuscatedName("ip")
public class class231 implements Comparator {

    @ObfuscatedName("ip.at(Lir;Lir;I)I")
    public int method4080(class226 arg0, class226 arg1) {
        return arg0.method4015() - arg1.method4015();
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4080((class226) arg0, (class226) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
