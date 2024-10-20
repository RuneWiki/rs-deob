package deob;

import java.util.Iterator;

@ObfuscatedName("pw")
public class class418 implements Iterator {

    @ObfuscatedName("pw.c")
    public class419 field4593;

    @ObfuscatedName("pw.v")
    public class410 field4592;

    @ObfuscatedName("pw.q")
    public int field4594;

    @ObfuscatedName("pw.f")
    public class410 field4591 = null;

    public class418(class419 arg0) {
        this.field4593 = arg0;
        this.method6737();
    }

    @ObfuscatedName("pw.c()V")
    public void method6737() {
        this.field4592 = this.field4593.field4596[0].field4463;
        this.field4594 = 1;
        this.field4591 = null;
    }

    public Object next() {
        if (this.field4593.field4596[this.field4594 - 1] != this.field4592) {
            class410 var1 = this.field4592;
            this.field4592 = var1.field4463;
            this.field4591 = var1;
            return var1;
        }
        class410 var2;
        do {
            if (this.field4594 >= this.field4593.field4599) {
                return null;
            }
            var2 = this.field4593.field4596[this.field4594++].field4463;
        } while (this.field4593.field4596[this.field4594 - 1] == var2);
        this.field4592 = var2.field4463;
        this.field4591 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4593.field4596[this.field4594 - 1] != this.field4592) {
            return true;
        }
        while (this.field4594 < this.field4593.field4599) {
            if (this.field4593.field4596[this.field4594++].field4463 != this.field4593.field4596[this.field4594 - 1]) {
                this.field4592 = this.field4593.field4596[this.field4594 - 1].field4463;
                return true;
            }
            this.field4592 = this.field4593.field4596[this.field4594 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4591 == null) {
            throw new IllegalStateException();
        }
        this.field4591.method6497();
        this.field4591 = null;
    }
}
