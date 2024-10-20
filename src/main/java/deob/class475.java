package deob;

import java.util.Iterator;

@ObfuscatedName("sc")
public class class475 implements Iterator {

    @ObfuscatedName("sc.at")
    public class476 field4909;

    @ObfuscatedName("sc.an")
    public class461 field4907;

    @ObfuscatedName("sc.av")
    public int field4906;

    @ObfuscatedName("sc.as")
    public class461 field4908 = null;

    public class475(class476 arg0) {
        this.field4909 = arg0;
        this.method7839();
    }

    @ObfuscatedName("sc.at()V")
    public void method7839() {
        this.field4907 = this.field4909.field4911[0].field4756;
        this.field4906 = 1;
        this.field4908 = null;
    }

    @ObfuscatedName("sc.an()Lrz;")
    public class461 method7840() {
        this.method7839();
        return (class461) this.next();
    }

    public Object next() {
        if (this.field4909.field4911[this.field4906 - 1] != this.field4907) {
            class461 var1 = this.field4907;
            this.field4907 = var1.field4756;
            this.field4908 = var1;
            return var1;
        }
        class461 var2;
        do {
            if (this.field4906 >= this.field4909.field4913) {
                return null;
            }
            var2 = this.field4909.field4911[this.field4906++].field4756;
        } while (this.field4909.field4911[this.field4906 - 1] == var2);
        this.field4907 = var2.field4756;
        this.field4908 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4909.field4911[this.field4906 - 1] != this.field4907) {
            return true;
        }
        while (this.field4906 < this.field4909.field4913) {
            if (this.field4909.field4911[this.field4906++].field4756 != this.field4909.field4911[this.field4906 - 1]) {
                this.field4907 = this.field4909.field4911[this.field4906 - 1].field4756;
                return true;
            }
            this.field4907 = this.field4909.field4911[this.field4906 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4908 == null) {
            throw new IllegalStateException();
        }
        this.field4908.method7560();
        this.field4908 = null;
    }
}
