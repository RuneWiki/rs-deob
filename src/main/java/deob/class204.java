package deob;

import java.util.Iterator;

@ObfuscatedName("gv")
public class class204 implements Iterable {

    @ObfuscatedName("gv.x")
    public class208 field3158 = new class208();

    public class204() {
        this.field3158.field3163 = this.field3158;
        this.field3158.field3164 = this.field3158;
    }

    @ObfuscatedName("gv.x()V")
    public void method3623() {
        while (this.field3158.field3163 != this.field3158) {
            this.field3158.field3163.method3675();
        }
    }

    @ObfuscatedName("gv.r(Lgi;)V")
    public void method3627(class208 arg0) {
        if (arg0.field3164 != null) {
            arg0.method3675();
        }
        arg0.field3164 = this.field3158.field3164;
        arg0.field3163 = this.field3158;
        arg0.field3164.field3163 = arg0;
        arg0.field3163.field3164 = arg0;
    }

    public Iterator iterator() {
        return new class210(this);
    }
}
