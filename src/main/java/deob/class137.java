package deob;

import java.util.Iterator;

@ObfuscatedName("er")
public class class137 implements Iterable {

    @ObfuscatedName("er.o")
    public class130 field1914 = new class130();

    public class137() {
        this.field1914.field1900 = this.field1914;
        this.field1914.field1899 = this.field1914;
    }

    @ObfuscatedName("er.o()V")
    public void method2260() {
        while (this.field1914.field1900 != this.field1914) {
            this.field1914.field1900.method2232();
        }
    }

    @ObfuscatedName("er.m(Ldn;)V")
    public void method2261(class130 arg0) {
        if (arg0.field1899 != null) {
            arg0.method2232();
        }
        arg0.field1899 = this.field1914.field1899;
        arg0.field1900 = this.field1914;
        arg0.field1899.field1900 = arg0;
        arg0.field1900.field1899 = arg0;
    }

    public Iterator iterator() {
        return new class136(this);
    }
}
