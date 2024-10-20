package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public final class class202 implements Iterable {

    @ObfuscatedName("gu.e")
    public int field3142;

    @ObfuscatedName("gu.l")
    public class212[] field3143;

    @ObfuscatedName("gu.c")
    public class212 field3144;

    public class202(int arg0) {
        this.field3142 = arg0;
        this.field3143 = new class212[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class212 var3 = this.field3143[var2] = new class212();
            var3.field3163 = var3;
            var3.field3164 = var3;
        }
    }

    @ObfuscatedName("gu.e(J)Lhs;")
    public class212 method3637(long arg0) {
        class212 var3 = this.field3143[(int) (arg0 & (long) (this.field3142 - 1))];
        for (this.field3144 = var3.field3163; this.field3144 != var3; this.field3144 = this.field3144.field3163) {
            if (this.field3144.field3162 == arg0) {
                class212 var4 = this.field3144;
                this.field3144 = this.field3144.field3163;
                return var4;
            }
        }
        this.field3144 = null;
        return null;
    }

    @ObfuscatedName("gu.l(Lhs;J)V")
    public void method3638(class212 arg0, long arg1) {
        if (arg0.field3164 != null) {
            arg0.method3755();
        }
        class212 var4 = this.field3143[(int) (arg1 & (long) (this.field3142 - 1))];
        arg0.field3164 = var4.field3164;
        arg0.field3163 = var4;
        arg0.field3164.field3163 = arg0;
        arg0.field3163.field3164 = arg0;
        arg0.field3162 = arg1;
    }

    @ObfuscatedName("gu.c()V")
    public void method3639() {
        for (int var1 = 0; var1 < this.field3142; var1++) {
            class212 var2 = this.field3143[var1];
            while (true) {
                class212 var3 = var2.field3163;
                if (var2 == var3) {
                    break;
                }
                var3.method3755();
            }
        }
        this.field3144 = null;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
