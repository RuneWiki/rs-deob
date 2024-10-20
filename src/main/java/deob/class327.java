package deob;

import java.util.Iterator;

@ObfuscatedName("lo")
public class class327 implements Iterator {

    @ObfuscatedName("lo.z")
    public class326 field3863;

    @ObfuscatedName("lo.k")
    public class190 field3862;

    @ObfuscatedName("lo.s")
    public int field3864;

    @ObfuscatedName("lo.t")
    public class190 field3865 = null;

    public class327(class326 arg0) {
        this.field3863 = arg0;
        this.method5596();
    }

    @ObfuscatedName("lo.x()V")
    public void method5596() {
        this.field3862 = this.field3863.field3858[0].field2155;
        this.field3864 = 1;
        this.field3865 = null;
    }

    public Object next() {
        if (this.field3863.field3858[this.field3864 - 1] != this.field3862) {
            class190 var1 = this.field3862;
            this.field3862 = var1.field2155;
            this.field3865 = var1;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3864 >= this.field3863.field3861) {
                return null;
            }
            var2 = this.field3863.field3858[this.field3864++].field2155;
        } while (this.field3863.field3858[this.field3864 - 1] == var2);
        this.field3862 = var2.field2155;
        this.field3865 = var2;
        return var2;
    }

    public boolean hasNext() {
        if (this.field3863.field3858[this.field3864 - 1] != this.field3862) {
            return true;
        }
        while (this.field3864 < this.field3863.field3861) {
            if (this.field3863.field3858[this.field3864++].field2155 != this.field3863.field3858[this.field3864 - 1]) {
                this.field3862 = this.field3863.field3858[this.field3864 - 1].field2155;
                return true;
            }
            this.field3862 = this.field3863.field3858[this.field3864 - 1];
        }
        return false;
    }

    public void remove() {
        if (this.field3865 == null) {
            throw new IllegalStateException();
        }
        this.field3865.method3401();
        this.field3865 = null;
    }
}
