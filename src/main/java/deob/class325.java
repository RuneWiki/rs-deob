package deob;

import java.util.Comparator;

@ObfuscatedName("lh")
public class class325 implements Comparator {

    @ObfuscatedName("lh.x")
    public final boolean field3839;

    public class325(boolean arg0) {
        this.field3839 = arg0;
    }

    @ObfuscatedName("lh.x(Ljd;Ljd;I)I")
    public int method5502(class284 arg0, class284 arg1) {
        return this.field3839 ? arg0.method4696().method4847(arg1.method4696()) : arg1.method4696().method4847(arg0.method4696());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5502((class284) arg0, (class284) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
