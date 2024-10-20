package deob;

import java.util.Iterator;

@ObfuscatedName("gt")
public class class201 implements Iterable {

    @ObfuscatedName("gt.f")
    public class205 field3102 = new class205();

    public class201() {
        this.field3102.field3106 = this.field3102;
        this.field3102.field3107 = this.field3102;
    }

    @ObfuscatedName("gt.f()V")
    public void method3619() {
        while (this.field3102.field3106 != this.field3102) {
            this.field3102.field3106.method3655();
        }
    }

    @ObfuscatedName("gt.u(Lgi;)V")
    public void method3620(class205 arg0) {
        if (arg0.field3107 != null) {
            arg0.method3655();
        }
        arg0.field3107 = this.field3102.field3107;
        arg0.field3106 = this.field3102;
        arg0.field3107.field3106 = arg0;
        arg0.field3106.field3107 = arg0;
    }

    public Iterator iterator() {
        return new class207(this);
    }
}
