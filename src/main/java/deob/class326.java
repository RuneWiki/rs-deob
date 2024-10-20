package deob;

import java.util.Comparator;

@ObfuscatedName("lv")
public class class326 implements Comparator {

    @ObfuscatedName("lv.h")
    public final boolean field3863;

    public class326(boolean arg0) {
        this.field3863 = arg0;
    }

    @ObfuscatedName("lv.h(Lju;Lju;B)I")
    public int method5483(class285 arg0, class285 arg1) {
        return this.field3863 ? arg0.method4699().method4830(arg1.method4699()) : arg1.method4699().method4830(arg0.method4699());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5483((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
