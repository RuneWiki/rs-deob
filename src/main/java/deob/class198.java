package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public final class class198 implements Iterable {

    @ObfuscatedName("gu.z")
    public int field2399;

    @ObfuscatedName("gu.w")
    public class205[] field2398;

    @ObfuscatedName("gu.s")
    public class205 field2401;

    @ObfuscatedName("gu.l")
    public class205 field2400;

    @ObfuscatedName("gu.u")
    public int field2397 = 0;

    public class198(int arg0) {
        this.field2399 = arg0;
        this.field2398 = new class205[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class205 var3 = this.field2398[var2] = new class205();
            var3.field2423 = var3;
            var3.field2424 = var3;
        }
    }

    @ObfuscatedName("gu.z(J)Lga;")
    public class205 method3637(long arg0) {
        class205 var3 = this.field2398[(int) (arg0 & (long) (this.field2399 - 1))];
        for (this.field2401 = var3.field2423; this.field2401 != var3; this.field2401 = this.field2401.field2423) {
            if (this.field2401.field2422 == arg0) {
                class205 var4 = this.field2401;
                this.field2401 = this.field2401.field2423;
                return var4;
            }
        }
        this.field2401 = null;
        return null;
    }

    @ObfuscatedName("gu.w(Lga;J)V")
    public void method3636(class205 arg0, long arg1) {
        if (arg0.field2424 != null) {
            arg0.method3756();
        }
        class205 var4 = this.field2398[(int) (arg1 & (long) (this.field2399 - 1))];
        arg0.field2424 = var4.field2424;
        arg0.field2423 = var4;
        arg0.field2424.field2423 = arg0;
        arg0.field2423.field2424 = arg0;
        arg0.field2422 = arg1;
    }

    @ObfuscatedName("gu.s()V")
    public void method3643() {
        for (int var1 = 0; var1 < this.field2399; var1++) {
            class205 var2 = this.field2398[var1];
            while (true) {
                class205 var3 = var2.field2423;
                if (var2 == var3) {
                    break;
                }
                var3.method3756();
            }
        }
        this.field2401 = null;
        this.field2400 = null;
    }

    @ObfuscatedName("gu.l()Lga;")
    public class205 method3647() {
        this.field2397 = 0;
        return this.method3639();
    }

    @ObfuscatedName("gu.u()Lga;")
    public class205 method3639() {
        if (this.field2397 > 0 && this.field2398[this.field2397 - 1] != this.field2400) {
            class205 var1 = this.field2400;
            this.field2400 = var1.field2423;
            return var1;
        }
        class205 var2;
        do {
            if (this.field2397 >= this.field2399) {
                return null;
            }
            var2 = this.field2398[this.field2397++].field2423;
        } while (this.field2398[this.field2397 - 1] == var2);
        this.field2400 = var2.field2423;
        return var2;
    }

    public Iterator iterator() {
        return new class211(this);
    }
}
