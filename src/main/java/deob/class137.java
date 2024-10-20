package deob;

import java.util.Iterator;

@ObfuscatedName("ed")
public class class137 implements Iterable {

    @ObfuscatedName("ed.s")
    public class130 field1907 = new class130();

    public class137() {
        this.field1907.field1893 = this.field1907;
        this.field1907.field1892 = this.field1907;
    }

    @ObfuscatedName("ed.s()V")
    public void method2251() {
        while (this.field1907.field1893 != this.field1907) {
            this.field1907.field1893.method2218();
        }
    }

    @ObfuscatedName("ed.c(Ldt;)V")
    public void method2246(class130 arg0) {
        if (arg0.field1892 != null) {
            arg0.method2218();
        }
        arg0.field1892 = this.field1907.field1892;
        arg0.field1893 = this.field1907;
        arg0.field1892.field1893 = arg0;
        arg0.field1893.field1892 = arg0;
    }

    public Iterator iterator() {
        return new class136(this);
    }
}
