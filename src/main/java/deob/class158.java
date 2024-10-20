package deob;

import java.util.Iterator;

@ObfuscatedName("fe")
public class class158 implements Iterable {

    @ObfuscatedName("fe.d")
    public class151 field2052 = new class151();

    public class158() {
        this.field2052.field2037 = this.field2052;
        this.field2052.field2038 = this.field2052;
    }

    @ObfuscatedName("fe.d()V")
    public void method2722() {
        while (this.field2052.field2037 != this.field2052) {
            this.field2052.field2037.method2689();
        }
    }

    @ObfuscatedName("fe.c(Lev;)V")
    public void method2721(class151 arg0) {
        if (arg0.field2038 != null) {
            arg0.method2689();
        }
        arg0.field2038 = this.field2052.field2038;
        arg0.field2037 = this.field2052;
        arg0.field2038.field2037 = arg0;
        arg0.field2037.field2038 = arg0;
    }

    public Iterator iterator() {
        return new class157(this);
    }
}
