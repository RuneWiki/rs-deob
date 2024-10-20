package deob;

import java.util.Iterator;

@ObfuscatedName("ep")
public class class137 implements Iterable {

    @ObfuscatedName("ep.x")
    public class130 field1903 = new class130();

    public class137() {
        this.field1903.field1888 = this.field1903;
        this.field1903.field1889 = this.field1903;
    }

    @ObfuscatedName("ep.x()V")
    public void method2355() {
        while (this.field1903.field1888 != this.field1903) {
            this.field1903.field1888.method2318();
        }
    }

    @ObfuscatedName("ep.j(Ldf;)V")
    public void method2357(class130 arg0) {
        if (arg0.field1889 != null) {
            arg0.method2318();
        }
        arg0.field1889 = this.field1903.field1889;
        arg0.field1888 = this.field1903;
        arg0.field1889.field1888 = arg0;
        arg0.field1888.field1889 = arg0;
    }

    public Iterator iterator() {
        return new class136(this);
    }
}
