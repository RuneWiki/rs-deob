package deob;

import java.util.Iterator;

@ObfuscatedName("ez")
public class class137 implements Iterable {

    @ObfuscatedName("ez.x")
    public class130 field1904 = new class130();

    public class137() {
        this.field1904.field1889 = this.field1904;
        this.field1904.field1890 = this.field1904;
    }

    @ObfuscatedName("ez.x()V")
    public void method2395() {
        while (this.field1904.field1889 != this.field1904) {
            this.field1904.field1889.method2362();
        }
    }

    @ObfuscatedName("ez.n(Ldi;)V")
    public void method2397(class130 arg0) {
        if (arg0.field1890 != null) {
            arg0.method2362();
        }
        arg0.field1890 = this.field1904.field1890;
        arg0.field1889 = this.field1904;
        arg0.field1890.field1889 = arg0;
        arg0.field1889.field1890 = arg0;
    }

    public Iterator iterator() {
        return new class136(this);
    }
}
