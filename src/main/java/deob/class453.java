package deob;

import java.util.Iterator;

@ObfuscatedName("rp")
public class class453 implements Iterator {

    @ObfuscatedName("rp.aj")
    public class454 field4802;

    @ObfuscatedName("rp.al")
    public class444 field4803;

    @ObfuscatedName("rp.ac")
    public int field4805;

    @ObfuscatedName("rp.ab")
    public class444 field4804 = null;

    public class453(class454 arg0) {
        this.field4802 = arg0;
        this.method7581();
    }

    @ObfuscatedName("rp.aj()V")
    public void method7581() {
        this.field4803 = this.field4802.field4806[0].field4672;
        this.field4805 = 1;
        this.field4804 = null;
    }

    public Object next() {
        if (this.field4802.field4806[this.field4805 - 1] != this.field4803) {
            class444 var1 = this.field4803;
            this.field4803 = var1.field4672;
            this.field4804 = var1;
            return var1;
        }
        class444 var2;
        do {
            if (this.field4805 >= this.field4802.field4807) {
                return null;
            }
            var2 = this.field4802.field4806[this.field4805++].field4672;
        } while (this.field4802.field4806[this.field4805 - 1] == var2);
        this.field4803 = var2.field4672;
        this.field4804 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field4802.field4806[this.field4805 - 1] != this.field4803) {
            return true;
        }
        while (this.field4805 < this.field4802.field4807) {
            if (this.field4802.field4806[this.field4805++].field4672 != this.field4802.field4806[this.field4805 - 1]) {
                this.field4803 = this.field4802.field4806[this.field4805 - 1].field4672;
                return true;
            }
            this.field4803 = this.field4802.field4806[this.field4805 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field4804 == null) {
            throw new IllegalStateException();
        }
        this.field4804.method7335();
        this.field4804 = null;
    }
}
