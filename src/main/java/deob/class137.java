package deob;

import java.util.Iterator;

@ObfuscatedName("er")
public class class137 implements Iterable {

    @ObfuscatedName("er.u")
    public class130 field1887 = new class130();

    public class137() {
        this.field1887.field1873 = this.field1887;
        this.field1887.field1872 = this.field1887;
    }

    @ObfuscatedName("er.u()V")
    public void method2300() {
        while (this.field1887.field1873 != this.field1887) {
            this.field1887.field1873.method2264();
        }
    }

    @ObfuscatedName("er.x(Ldm;)V")
    public void method2301(class130 arg0) {
        if (arg0.field1872 != null) {
            arg0.method2264();
        }
        arg0.field1872 = this.field1887.field1872;
        arg0.field1873 = this.field1887;
        arg0.field1872.field1873 = arg0;
        arg0.field1873.field1872 = arg0;
    }

    public Iterator iterator() {
        return new class136(this);
    }
}
