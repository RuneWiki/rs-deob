package deob;

import java.util.Iterator;

@ObfuscatedName("up")
public class class529 implements Iterator {

    @ObfuscatedName("up.ap")
    public class530 field5321;

    @ObfuscatedName("up.aw")
    public class515 field5320;

    @ObfuscatedName("up.ak")
    public int field5322;

    @ObfuscatedName("up.aj")
    public class515 field5319 = null;

    public class529(class530 arg0) {
        this.field5321 = arg0;
        this.method8960();
    }

    @ObfuscatedName("up.ap()V")
    public void method8960() {
        this.field5320 = this.field5321.field5324[0].field5171;
        this.field5322 = 1;
        this.field5319 = null;
    }

    @ObfuscatedName("up.aw()Ltw;")
    public class515 method8949() {
        this.method8960();
        return (class515) this.next();
    }

    public Object next() {
        if (this.field5321.field5324[this.field5322 - 1] != this.field5320) {
            class515 var1 = this.field5320;
            this.field5320 = var1.field5171;
            this.field5319 = var1;
            return var1;
        }
        class515 var2;
        do {
            if (this.field5322 >= this.field5321.field5325) {
                return null;
            }
            var2 = this.field5321.field5324[this.field5322++].field5171;
        } while (this.field5321.field5324[this.field5322 - 1] == var2);
        this.field5320 = var2.field5171;
        this.field5319 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field5321.field5324[this.field5322 - 1] != this.field5320) {
            return true;
        }
        while (this.field5322 < this.field5321.field5325) {
            if (this.field5321.field5324[this.field5322++].field5171 != this.field5321.field5324[this.field5322 - 1]) {
                this.field5320 = this.field5321.field5324[this.field5322 - 1].field5171;
                return true;
            }
            this.field5320 = this.field5321.field5324[this.field5322 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field5319 == null) {
            throw new IllegalStateException();
        }
        this.field5319.method8667();
        this.field5319 = null;
    }
}
