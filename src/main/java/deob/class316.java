package deob;

import java.util.Comparator;

@ObfuscatedName("le")
public class class316 implements Comparator {

    @ObfuscatedName("le.q")
    public final boolean field3848;

    public class316(boolean arg0) {
        this.field3848 = arg0;
    }

    @ObfuscatedName("le.q(Ljd;Ljd;B)I")
    public int method5445(class275 arg0, class275 arg1) {
        return this.field3848 ? arg0.method4656().method4791(arg1.method4656()) : arg1.method4656().method4791(arg0.method4656());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5445((class275) arg0, (class275) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
