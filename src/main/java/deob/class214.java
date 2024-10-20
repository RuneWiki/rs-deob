package deob;

import java.util.Comparator;

@ObfuscatedName("hd")
public final class class214 implements Comparator {

    @ObfuscatedName("hd.f(Lho;Lho;I)I")
    public int method3701(class215 arg0, class215 arg1) {
        return arg0.method3707().compareTo(arg1.method3707());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3701((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
