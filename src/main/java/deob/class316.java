package deob;

import java.util.Comparator;

@ObfuscatedName("li")
public class class316 implements Comparator {

    @ObfuscatedName("li.m")
    public final boolean field3838;

    public class316(boolean arg0) {
        this.field3838 = arg0;
    }

    @ObfuscatedName("li.m(Ljs;Ljs;I)I")
    public int method5373(class286 arg0, class286 arg1) {
        return this.field3838 ? arg0.method4997().method5134(arg1.method4997()) : arg1.method4997().method5134(arg0.method4997());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5373((class286) arg0, (class286) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
