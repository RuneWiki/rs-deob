package deob;

import java.util.Comparator;

@ObfuscatedName("it")
public class class220 implements Comparator {

    @ObfuscatedName("it.au(Lio;Lio;I)I")
    public int method3933(class215 arg0, class215 arg1) {
        return arg0.method3863() - arg1.method3863();
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3933((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
