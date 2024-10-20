package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class201 implements Iterable {

    @ObfuscatedName("gm.a")
    public class205 field3110 = new class205();

    public class201() {
        this.field3110.field3115 = this.field3110;
        this.field3110.field3114 = this.field3110;
    }

    @ObfuscatedName("gm.a()V")
    public void method3680() {
        while (this.field3110.field3115 != this.field3110) {
            this.field3110.field3115.method3718();
        }
    }

    @ObfuscatedName("gm.w(Lgi;)V")
    public void method3676(class205 arg0) {
        if (arg0.field3114 != null) {
            arg0.method3718();
        }
        arg0.field3114 = this.field3110.field3114;
        arg0.field3115 = this.field3110;
        arg0.field3114.field3115 = arg0;
        arg0.field3115.field3114 = arg0;
    }

    public Iterator iterator() {
        return new class207(this);
    }
}
