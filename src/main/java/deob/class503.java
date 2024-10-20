package deob;

import java.util.Iterator;

@ObfuscatedName("tj")
public class class503 implements Iterator {

    @ObfuscatedName("tj.am")
    public class504 field5046;

    @ObfuscatedName("tj.ap")
    public class489 field5045;

    @ObfuscatedName("tj.af")
    public int field5044;

    @ObfuscatedName("tj.aj")
    public class489 field5047 = null;

    public class503(class504 arg0) {
        this.field5046 = arg0;
        this.method8270();
    }

    @ObfuscatedName("tj.am()V")
    public void method8270() {
        this.field5045 = this.field5046.field5048[0].field4888;
        this.field5044 = 1;
        this.field5047 = null;
    }

    @ObfuscatedName("tj.ap()Lse;")
    public class489 method8271() {
        this.method8270();
        return (class489) this.next();
    }

    public Object next() {
        if (this.field5046.field5048[this.field5044 - 1] != this.field5045) {
            class489 var1 = this.field5045;
            this.field5045 = var1.field4888;
            this.field5047 = var1;
            return var1;
        }
        class489 var2;
        do {
            if (this.field5044 >= this.field5046.field5050) {
                return null;
            }
            var2 = this.field5046.field5048[this.field5044++].field4888;
        } while (this.field5046.field5048[this.field5044 - 1] == var2);
        this.field5045 = var2.field4888;
        this.field5047 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field5046.field5048[this.field5044 - 1] != this.field5045) {
            return true;
        }
        while (this.field5044 < this.field5046.field5050) {
            if (this.field5046.field5048[this.field5044++].field4888 != this.field5046.field5048[this.field5044 - 1]) {
                this.field5045 = this.field5046.field5048[this.field5044 - 1].field4888;
                return true;
            }
            this.field5045 = this.field5046.field5048[this.field5044 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field5047 == null) {
            throw new IllegalStateException();
        }
        this.field5047.method7988();
        this.field5047 = null;
    }
}
