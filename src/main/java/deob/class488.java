package deob;

import java.util.Iterator;

@ObfuscatedName("sw")
public class class488 implements Iterator {

    @ObfuscatedName("sw.aw")
    public class489 field4966;

    @ObfuscatedName("sw.ay")
    public class474 field4969;

    @ObfuscatedName("sw.ar")
    public int field4968;

    @ObfuscatedName("sw.am")
    public class474 field4967 = null;

    public class488(class489 arg0) {
        this.field4966 = arg0;
        this.method7950();
    }

    @ObfuscatedName("sw.aw()V")
    public void method7950() {
        this.field4969 = this.field4966.field4970[0].field4820;
        this.field4968 = 1;
        this.field4967 = null;
    }

    @ObfuscatedName("sw.ay()Lsb;")
    public class474 method7959() {
        this.method7950();
        return (class474) this.next();
    }

    public Object next() {
        if (this.field4966.field4970[this.field4968 - 1] != this.field4969) {
            class474 var1 = this.field4969;
            this.field4969 = var1.field4820;
            this.field4967 = var1;
            return var1;
        }
        class474 var2;
        do {
            if (this.field4968 >= this.field4966.field4971) {
                return null;
            }
            var2 = this.field4966.field4970[this.field4968++].field4820;
        } while (this.field4966.field4970[this.field4968 - 1] == var2);
        this.field4969 = var2.field4820;
        this.field4967 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4966.field4970[this.field4968 - 1] != this.field4969) {
            return true;
        }
        while (this.field4968 < this.field4966.field4971) {
            if (this.field4966.field4970[this.field4968++].field4820 != this.field4966.field4970[this.field4968 - 1]) {
                this.field4969 = this.field4966.field4970[this.field4968 - 1].field4820;
                return true;
            }
            this.field4969 = this.field4966.field4970[this.field4968 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4967 == null) {
            throw new IllegalStateException();
        }
        this.field4967.method7662();
        this.field4967 = null;
    }
}
