package deob;

import java.util.Iterator;

@ObfuscatedName("gs")
public class class204 implements Iterable {

    @ObfuscatedName("gs.a")
    public class208 field3155 = new class208();

    public class204() {
        this.field3155.field3160 = this.field3155;
        this.field3155.field3161 = this.field3155;
    }

    @ObfuscatedName("gs.a()V")
    public void method3650() {
        while (this.field3155.field3160 != this.field3155) {
            this.field3155.field3160.method3701();
        }
    }

    @ObfuscatedName("gs.d(Lgb;)V")
    public void method3651(class208 arg0) {
        if (arg0.field3161 != null) {
            arg0.method3701();
        }
        arg0.field3161 = this.field3155.field3161;
        arg0.field3160 = this.field3155;
        arg0.field3161.field3160 = arg0;
        arg0.field3160.field3161 = arg0;
    }

    public Iterator iterator() {
        return new class210(this);
    }
}
