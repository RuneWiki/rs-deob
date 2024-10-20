package deob;

import java.util.Comparator;

@ObfuscatedName("lt")
public class class324 implements Comparator {

    @ObfuscatedName("lt.z")
    public final boolean field3851;

    public class324(boolean arg0) {
        this.field3851 = arg0;
    }

    @ObfuscatedName("lt.z(Ljc;Ljc;B)I")
    public int method5566(class284 arg0, class284 arg1) {
        return this.field3851 ? arg0.method4762(arg1) : arg1.method4762(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5566((class284) arg0, (class284) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
