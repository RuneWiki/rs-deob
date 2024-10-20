package deob;

import java.util.Iterator;

@ObfuscatedName("ta")
public class class518 implements Iterator {

    @ObfuscatedName("ta.ak")
    public class519 field5202;

    @ObfuscatedName("ta.al")
    public class504 field5204;

    @ObfuscatedName("ta.aj")
    public int field5203;

    @ObfuscatedName("ta.az")
    public class504 field5201 = null;

    public class518(class519 arg0) {
        this.field5202 = arg0;
        this.method8485();
    }

    @ObfuscatedName("ta.ak()V")
    public void method8485() {
        this.field5204 = this.field5202.field5209[0].field5048;
        this.field5203 = 1;
        this.field5201 = null;
    }

    @ObfuscatedName("ta.al()Ltl;")
    public class504 method8498() {
        this.method8485();
        return (class504) this.next();
    }

    public Object next() {
        if (this.field5202.field5209[this.field5203 - 1] != this.field5204) {
            class504 var1 = this.field5204;
            this.field5204 = var1.field5048;
            this.field5201 = var1;
            return var1;
        }
        class504 var2;
        do {
            if (this.field5203 >= this.field5202.field5206) {
                return null;
            }
            var2 = this.field5202.field5209[this.field5203++].field5048;
        } while (this.field5202.field5209[this.field5203 - 1] == var2);
        this.field5204 = var2.field5048;
        this.field5201 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field5202.field5209[this.field5203 - 1] != this.field5204) {
            return true;
        }
        while (this.field5203 < this.field5202.field5206) {
            if (this.field5202.field5209[this.field5203++].field5048 != this.field5202.field5209[this.field5203 - 1]) {
                this.field5204 = this.field5202.field5209[this.field5203 - 1].field5048;
                return true;
            }
            this.field5204 = this.field5202.field5209[this.field5203 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field5201 == null) {
            throw new IllegalStateException();
        }
        this.field5201.method8189();
        this.field5201 = null;
    }
}
