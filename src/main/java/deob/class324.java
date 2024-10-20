package deob;

import java.util.Comparator;

@ObfuscatedName("la")
public class class324 implements Comparator {

    @ObfuscatedName("la.m")
    public final boolean field3845;

    public class324(boolean arg0) {
        this.field3845 = arg0;
    }

    @ObfuscatedName("la.m(Ljf;Ljf;I)I")
    public int method5597(class284 arg0, class284 arg1) {
        return this.field3845 ? arg0.method4773(arg1) : arg1.method4773(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5597((class284) arg0, (class284) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
