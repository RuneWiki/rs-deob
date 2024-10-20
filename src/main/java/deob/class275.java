package deob;

@ObfuscatedName("jg")
public class class275 extends class219 {

    @ObfuscatedName("jg.z")
    public static class213 field3514 = new class213(64);

    @ObfuscatedName("jg.n")
    public int field3513 = -1;

    @ObfuscatedName("jg.l")
    public int[] field3517;

    @ObfuscatedName("jg.s")
    public short[] field3509;

    @ObfuscatedName("jg.y")
    public short[] field3516;

    @ObfuscatedName("jg.c")
    public short[] field3511;

    @ObfuscatedName("jg.h")
    public short[] field3518;

    @ObfuscatedName("jg.i")
    public int[] field3519 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("jg.o")
    public boolean field3512 = false;

    @ObfuscatedName("by.g(II)Ljg;")
    public static class275 method1172(int arg0) {
        class275 var1 = (class275) field3514.method3706((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3520.method4294(3, arg0);
        class275 var3 = new class275();
        if (var2 != null) {
            var3.method4542(new class195(var2));
        }
        field3514.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.e(Lgg;I)V")
    public void method4542(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4558(arg0, var2);
        }
    }

    @ObfuscatedName("jg.b(Lgg;II)V")
    public void method4558(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3513 = arg0.method3332();
        } else if (arg1 == 2) {
            int var3 = arg0.method3332();
            this.field3517 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3517[var4] = arg0.method3310();
            }
        } else if (arg1 == 3) {
            this.field3512 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3332();
            this.field3509 = new short[var5];
            this.field3516 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3509[var6] = (short) arg0.method3310();
                this.field3516[var6] = (short) arg0.method3310();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3332();
            this.field3511 = new short[var7];
            this.field3518 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3511[var8] = (short) arg0.method3310();
                this.field3518[var8] = (short) arg0.method3310();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3519[arg1 - 60] = arg0.method3310();
        }
    }

    @ObfuscatedName("jg.z(I)Z")
    public boolean method4544() {
        if (this.field3517 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3517.length; var2++) {
            if (!Statics.field3510.method4269(this.field3517[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jg.n(I)Ldi;")
    public class126 method4564() {
        if (this.field3517 == null) {
            return null;
        }
        class126[] var1 = new class126[this.field3517.length];
        for (int var2 = 0; var2 < this.field3517.length; var2++) {
            var1[var2] = class126.method2485(Statics.field3510, this.field3517[var2], 0);
        }
        class126 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class126(var1, var1.length);
        }
        if (this.field3509 != null) {
            for (int var4 = 0; var4 < this.field3509.length; var4++) {
                var3.method2534(this.field3509[var4], this.field3516[var4]);
            }
        }
        if (this.field3511 != null) {
            for (int var5 = 0; var5 < this.field3511.length; var5++) {
                var3.method2498(this.field3511[var5], this.field3518[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("jg.l(B)Z")
    public boolean method4545() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3519[var2] != -1 && !Statics.field3510.method4269(this.field3519[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jg.s(B)Ldi;")
    public class126 method4546() {
        class126[] var1 = new class126[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3519[var3] != -1) {
                var1[var2++] = class126.method2485(Statics.field3510, this.field3519[var3], 0);
            }
        }
        class126 var4 = new class126(var1, var2);
        if (this.field3509 != null) {
            for (int var5 = 0; var5 < this.field3509.length; var5++) {
                var4.method2534(this.field3509[var5], this.field3516[var5]);
            }
        }
        if (this.field3511 != null) {
            for (int var6 = 0; var6 < this.field3511.length; var6++) {
                var4.method2498(this.field3511[var6], this.field3518[var6]);
            }
        }
        return var4;
    }
}
