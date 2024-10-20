package deob;

import java.util.Iterator;

@ObfuscatedName("fh")
public final class class179 implements Iterable {

    @ObfuscatedName("fh.l")
    public int field2867;

    @ObfuscatedName("fh.y")
    public class189[] field2866;

    @ObfuscatedName("fh.g")
    public class189 field2868;

    public class179(int arg0) {
        this.field2867 = arg0;
        this.field2866 = new class189[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class189 var3 = this.field2866[var2] = new class189();
            var3.field2885 = var3;
            var3.field2887 = var3;
        }
    }

    @ObfuscatedName("fh.l(J)Lgv;")
    public class189 method3267(long arg0) {
        class189 var3 = this.field2866[(int) (arg0 & (long) (this.field2867 - 1))];
        for (this.field2868 = var3.field2885; this.field2868 != var3; this.field2868 = this.field2868.field2885) {
            if (this.field2868.field2886 == arg0) {
                class189 var4 = this.field2868;
                this.field2868 = this.field2868.field2885;
                return var4;
            }
        }
        this.field2868 = null;
        return null;
    }

    @ObfuscatedName("fh.y(Lgv;J)V")
    public void method3269(class189 arg0, long arg1) {
        if (arg0.field2887 != null) {
            arg0.method3375();
        }
        class189 var4 = this.field2866[(int) (arg1 & (long) (this.field2867 - 1))];
        arg0.field2887 = var4.field2887;
        arg0.field2885 = var4;
        arg0.field2887.field2885 = arg0;
        arg0.field2885.field2887 = arg0;
        arg0.field2886 = arg1;
    }

    @ObfuscatedName("fh.g()V")
    public void method3268() {
        for (int var1 = 0; var1 < this.field2867; var1++) {
            class189 var2 = this.field2866[var1];
            while (true) {
                class189 var3 = var2.field2885;
                if (var2 == var3) {
                    break;
                }
                var3.method3375();
            }
        }
        this.field2868 = null;
    }

    public Iterator iterator() {
        return new class175(this);
    }
}
