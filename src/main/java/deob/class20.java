package deob;

import java.io.EOFException;

@ObfuscatedName("u")
public class class20 {

    @ObfuscatedName("u.v")
    public boolean[] field281 = new boolean[this.field293.length];

    @ObfuscatedName("u.n")
    public boolean[] field289;

    @ObfuscatedName("u.f")
    public int[] field293 = new int[Statics.field83.method3092(19)];

    @ObfuscatedName("u.g")
    public String[] field282 = new String[Statics.field83.method3092(15)];

    @ObfuscatedName("u.o")
    public boolean field278 = false;

    @ObfuscatedName("u.s")
    public long field284;

    public class20() {
        for (int var1 = 0; var1 < this.field293.length; var1++) {
            class46 var2 = (class46) class46.field1054.method3538((long) var1);
            class46 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1049.method3073(19, var1);
                class46 var5 = new class46();
                if (var4 != null) {
                    var5.method933(new class119(var4));
                }
                class46.field1054.method3540(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field281[var1] = var3.field1051;
        }
        this.field289 = new boolean[this.field282.length];
        for (int var7 = 0; var7 < this.field282.length; var7++) {
            class50 var8 = class50.method137(var7);
            this.field289[var7] = var8.field1096;
        }
        for (int var9 = 0; var9 < this.field293.length; var9++) {
            this.field293[var9] = -1;
        }
        this.method210();
    }

    @ObfuscatedName("u.h(III)V")
    public void method203(int arg0, int arg1) {
        this.field293[arg0] = arg1;
        if (this.field281[arg0]) {
            this.field278 = true;
        }
    }

    @ObfuscatedName("u.q(II)I")
    public int method204(int arg0) {
        return this.field293[arg0];
    }

    @ObfuscatedName("u.v(ILjava/lang/String;I)V")
    public void method218(int arg0, String arg1) {
        this.field282[arg0] = arg1;
        if (this.field289[arg0]) {
            this.field278 = true;
        }
    }

    @ObfuscatedName("u.n(IB)Ljava/lang/String;")
    public String method224(int arg0) {
        return this.field282[arg0];
    }

    @ObfuscatedName("u.f(B)V")
    public void method219() {
        for (int var1 = 0; var1 < this.field293.length; var1++) {
            if (!this.field281[var1]) {
                this.field293[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field282.length; var2++) {
            if (!this.field289[var2]) {
                this.field282[var2] = null;
            }
        }
    }

    @ObfuscatedName("u.g(ZB)Lha;")
    public class227 method208(boolean arg0) {
        return Statics.method3301("2", Statics.field299.field2277, arg0);
    }

    @ObfuscatedName("u.o(I)V")
    public void method205() {
        class227 var1 = this.method208(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field293.length; var4++) {
                if (this.field281[var4] && this.field293[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field282.length; var6++) {
                if (this.field289[var6] && this.field282[var6] != null) {
                    var2 += 2 + class119.method2072(this.field282[var6]);
                    var5++;
                }
            }
            class119 var7 = new class119(var2);
            var7.method2499(1);
            var7.method2369(var3);
            for (int var8 = 0; var8 < this.field293.length; var8++) {
                if (this.field281[var8] && this.field293[var8] != -1) {
                    var7.method2369(var8);
                    var7.method2556(this.field293[var8]);
                }
            }
            var7.method2369(var5);
            for (int var9 = 0; var9 < this.field282.length; var9++) {
                if (this.field289[var9] && this.field282[var9] != null) {
                    var7.method2369(var9);
                    var7.method2374(this.field282[var9]);
                }
            }
            var1.method3917(var7.field1978, 0, var7.field1973);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3909();
            } catch (Exception var20) {
            }
        }
        this.field278 = false;
        this.field284 = class115.method2082();
    }

    @ObfuscatedName("u.s(B)V")
    public void method210() {
        class227 var1 = this.method208(false);
        label195: {
            try {
                byte[] var2 = new byte[(int) var1.method3910()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3915(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class119 var5 = new class119(var2);
                if (var5.field1978.length - var5.field1973 < 1) {
                    return;
                }
                int var7 = var5.method2383();
                if (var7 >= 0 && var7 <= 1) {
                    int var9 = var5.method2385();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2385();
                        int var12 = var5.method2388();
                        if (this.field281[var11]) {
                            this.field293[var11] = var12;
                        }
                    }
                    int var13 = var5.method2385();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label195;
                        }
                        int var15 = var5.method2385();
                        String var16 = var5.method2391();
                        if (this.field289[var15]) {
                            this.field282[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label195;
            } finally {
                try {
                    var1.method3909();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field278 = false;
    }

    @ObfuscatedName("u.k(I)V")
    public void method211() {
        if (this.field278 && this.field284 < class115.method2082() - 60000L) {
            this.method205();
        }
    }

    @ObfuscatedName("u.b(I)Z")
    public boolean method212() {
        return this.field278;
    }
}
