package deob;

@ObfuscatedName("hi")
public class class214 {

    @ObfuscatedName("hi.e")
    public class124[] field2511;

    @ObfuscatedName("hi.v")
    public int field2516;

    public class214(class467 arg0, int arg1) {
        this.field2511 = new class124[arg1];
        this.field2516 = arg0.method7792();
        for (int var3 = 0; var3 < this.field2511.length; var3++) {
            class124 var4 = new class124(this.field2516, arg0, false);
            this.field2511[var3] = var4;
        }
        this.method4012();
    }

    @ObfuscatedName("hi.h(I)V")
    public void method4012() {
        class124[] var1 = this.field2511;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class124 var3 = var1[var2];
            if (var3.field1517 >= 0) {
                var3.field1514 = this.field2511[var3.field1517];
            }
        }
    }

    @ObfuscatedName("hi.e(I)I")
    public int method4013() {
        return this.field2511.length;
    }

    @ObfuscatedName("hi.v(II)Ldt;")
    public class124 method4014(int arg0) {
        return arg0 >= this.method4013() ? null : this.field2511[arg0];
    }

    @ObfuscatedName("hi.x(I)[Ldt;")
    public class124[] method4025() {
        return this.field2511;
    }

    @ObfuscatedName("hi.m(Lew;IB)V")
    public void method4016(class131 arg0, int arg1) {
        this.method4027(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("hi.q(Lew;I[ZZI)V")
    public void method4027(class131 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2866();
        int var6 = 0;
        class124[] var7 = this.method4025();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class124 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2848(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
