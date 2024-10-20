package deob;

import java.util.Comparator;

@ObfuscatedName("lh")
public class class316 implements Comparator {

    @ObfuscatedName("lh.c")
    public final boolean field3819;

    public class316(boolean arg0) {
        this.field3819 = arg0;
    }

    @ObfuscatedName("lh.c(Ljk;Ljk;I)I")
    public int method5486(class275 arg0, class275 arg1) {
        return this.field3819 ? arg0.method4689().method4832(arg1.method4689()) : arg1.method4689().method4832(arg0.method4689());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5486((class275) arg0, (class275) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
