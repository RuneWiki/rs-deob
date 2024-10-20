package deob;

import java.util.Iterator;

@ObfuscatedName("gi")
public class class198 implements Iterator {

    @ObfuscatedName("gi.a")
    public class202 field3139;

    @ObfuscatedName("gi.d")
    public class212 field3141;

    @ObfuscatedName("gi.v")
    public int field3138;

    @ObfuscatedName("gi.r")
    public class212 field3140 = null;

    public class198(class202 arg0) {
        this.field3139 = arg0;
        this.method3558();
    }

    @ObfuscatedName("gi.a()V")
    public void method3558() {
        this.field3141 = this.field3139.field3150[0].field3170;
        this.field3138 = 1;
        this.field3140 = null;
    }

    public Object next() {
        if (this.field3139.field3150[this.field3138 - 1] != this.field3141) {
            class212 var1 = this.field3141;
            this.field3141 = var1.field3170;
            this.field3140 = var1;
            return var1;
        }
        class212 var2;
        do {
            if (this.field3138 >= this.field3139.field3151) {
                return null;
            }
            var2 = this.field3139.field3150[this.field3138++].field3170;
        } while (this.field3139.field3150[this.field3138 - 1] == var2);
        this.field3141 = var2.field3170;
        this.field3140 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3139.field3150[this.field3138 - 1] != this.field3141) {
            return true;
        }
        while (this.field3138 < this.field3139.field3151) {
            if (this.field3139.field3150[this.field3138++].field3170 != this.field3139.field3150[this.field3138 - 1]) {
                this.field3141 = this.field3139.field3150[this.field3138 - 1].field3170;
                return true;
            }
            this.field3141 = this.field3139.field3150[this.field3138 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3140 == null) {
            throw new IllegalStateException();
        }
        this.field3140.method3729();
        this.field3140 = null;
    }
}
