package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class204 implements Iterable {

    @ObfuscatedName("go.e")
    public class208 field3147 = new class208();

    public class204() {
        this.field3147.field3153 = this.field3147;
        this.field3147.field3152 = this.field3147;
    }

    @ObfuscatedName("go.e()V")
    public void method3681() {
        while (this.field3147.field3153 != this.field3147) {
            this.field3147.field3153.method3733();
        }
    }

    @ObfuscatedName("go.l(Lgf;)V")
    public void method3682(class208 arg0) {
        if (arg0.field3152 != null) {
            arg0.method3733();
        }
        arg0.field3152 = this.field3147.field3152;
        arg0.field3153 = this.field3147;
        arg0.field3152.field3153 = arg0;
        arg0.field3153.field3152 = arg0;
    }

    public Iterator iterator() {
        return new class210(this);
    }
}
