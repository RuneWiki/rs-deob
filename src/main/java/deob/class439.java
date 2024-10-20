package deob;

import java.util.Iterator;

@ObfuscatedName("py")
public class class439 implements Iterator {

    @ObfuscatedName("py.a")
    public class440 field4767;

    @ObfuscatedName("py.f")
    public class430 field4768;

    @ObfuscatedName("py.c")
    public int field4769;

    @ObfuscatedName("py.x")
    public class430 field4770 = null;

    public class439(class440 arg0) {
        this.field4767 = arg0;
        this.method7437();
    }

    @ObfuscatedName("py.a()V")
    public void method7437() {
        this.field4768 = this.field4767.field4775[0].field4636;
        this.field4769 = 1;
        this.field4770 = null;
    }

    public Object next() {
        if (this.field4767.field4775[this.field4769 - 1] != this.field4768) {
            class430 var1 = this.field4768;
            this.field4768 = var1.field4636;
            this.field4770 = var1;
            return var1;
        }
        class430 var2;
        do {
            if (this.field4769 >= this.field4767.field4772) {
                return null;
            }
            var2 = this.field4767.field4775[this.field4769++].field4636;
        } while (this.field4767.field4775[this.field4769 - 1] == var2);
        this.field4768 = var2.field4636;
        this.field4770 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4767.field4775[this.field4769 - 1] != this.field4768) {
            return true;
        }
        while (this.field4769 < this.field4767.field4772) {
            if (this.field4767.field4775[this.field4769++].field4636 != this.field4767.field4775[this.field4769 - 1]) {
                this.field4768 = this.field4767.field4775[this.field4769 - 1].field4636;
                return true;
            }
            this.field4768 = this.field4767.field4775[this.field4769 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4770 == null) {
            throw new IllegalStateException();
        }
        this.field4770.method7170();
        this.field4770 = null;
    }
}
