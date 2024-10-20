package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class204 implements Iterable {

    @ObfuscatedName("gm.m")
    public class208 field3152 = new class208();

    public class204() {
        this.field3152.field3157 = this.field3152;
        this.field3152.field3158 = this.field3152;
    }

    @ObfuscatedName("gm.m()V")
    public void method3653() {
        while (this.field3152.field3157 != this.field3152) {
            this.field3152.field3157.method3699();
        }
    }

    @ObfuscatedName("gm.w(Lgs;)V")
    public void method3651(class208 arg0) {
        if (arg0.field3158 != null) {
            arg0.method3699();
        }
        arg0.field3158 = this.field3152.field3158;
        arg0.field3157 = this.field3152;
        arg0.field3158.field3157 = arg0;
        arg0.field3157.field3158 = arg0;
    }

    public Iterator iterator() {
        return new class210(this);
    }
}
