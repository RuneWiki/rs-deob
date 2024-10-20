package deob;

import java.util.Comparator;

@ObfuscatedName("ne")
public class class390 implements Comparator {

    @ObfuscatedName("ne.s")
    public final boolean field4239;

    public class390(boolean arg0) {
        this.field4239 = arg0;
    }

    @ObfuscatedName("ne.s(Llm;Llm;I)I")
    public int method6240(class324 arg0, class324 arg1) {
        return this.field4239 ? arg0.method5167(arg1) : arg1.method5167(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6240((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
