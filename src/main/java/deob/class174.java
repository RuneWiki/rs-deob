package deob;

@ObfuscatedName("fh")
public final class class174 {

    @ObfuscatedName("fh.p")
    public int field2799;

    @ObfuscatedName("fh.j")
    public class178[] field2801;

    @ObfuscatedName("fh.w")
    public class178 field2800;

    @ObfuscatedName("fh.h")
    public class178 field2802;

    @ObfuscatedName("fh.v")
    public int field2803 = 0;

    public class174(int arg0) {
        this.field2799 = arg0;
        this.field2801 = new class178[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class178 var3 = this.field2801[var2] = new class178();
            var3.field2810 = var3;
            var3.field2811 = var3;
        }
    }

    @ObfuscatedName("fh.p(J)Lfi;")
    public class178 method3261(long arg0) {
        class178 var3 = this.field2801[(int) (arg0 & (long) (this.field2799 - 1))];
        for (this.field2800 = var3.field2810; this.field2800 != var3; this.field2800 = this.field2800.field2810) {
            if (this.field2800.field2809 == arg0) {
                class178 var4 = this.field2800;
                this.field2800 = this.field2800.field2810;
                return var4;
            }
        }
        this.field2800 = null;
        return null;
    }

    @ObfuscatedName("fh.j(Lfi;J)V")
    public void method3262(class178 arg0, long arg1) {
        if (arg0.field2811 != null) {
            arg0.method3327();
        }
        class178 var4 = this.field2801[(int) (arg1 & (long) (this.field2799 - 1))];
        arg0.field2811 = var4.field2811;
        arg0.field2810 = var4;
        arg0.field2811.field2810 = arg0;
        arg0.field2810.field2811 = arg0;
        arg0.field2809 = arg1;
    }

    @ObfuscatedName("fh.w()V")
    public void method3263() {
        for (int var1 = 0; var1 < this.field2799; var1++) {
            class178 var2 = this.field2801[var1];
            while (true) {
                class178 var3 = var2.field2810;
                if (var2 == var3) {
                    break;
                }
                var3.method3327();
            }
        }
        this.field2800 = null;
        this.field2802 = null;
    }

    @ObfuscatedName("fh.h()Lfi;")
    public class178 method3277() {
        this.field2803 = 0;
        return this.method3265();
    }

    @ObfuscatedName("fh.v()Lfi;")
    public class178 method3265() {
        if (this.field2803 > 0 && this.field2801[this.field2803 - 1] != this.field2802) {
            class178 var1 = this.field2802;
            this.field2802 = var1.field2810;
            return var1;
        }
        class178 var2;
        do {
            if (this.field2803 >= this.field2799) {
                return null;
            }
            var2 = this.field2801[this.field2803++].field2810;
        } while (this.field2801[this.field2803 - 1] == var2);
        this.field2802 = var2.field2810;
        return var2;
    }
}
