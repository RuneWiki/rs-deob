package deob;

import java.util.Comparator;

@ObfuscatedName("op")
public class class391 implements Comparator {

    @ObfuscatedName("op.s")
    public final boolean field4240;

    public class391(boolean arg0) {
        this.field4240 = arg0;
    }

    @ObfuscatedName("op.s(Llm;Llm;I)I")
    public int method6250(class324 arg0, class324 arg1) {
        return this.field4240 ? arg0.method5204().method6523(arg1.method5204()) : arg1.method5204().method6523(arg0.method5204());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6250((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
