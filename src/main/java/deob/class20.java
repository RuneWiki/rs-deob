package deob;

import java.io.EOFException;

@ObfuscatedName("n")
public class class20 {

    @ObfuscatedName("n.g")
    public boolean[] field267 = new boolean[this.field276.length];

    @ObfuscatedName("n.h")
    public boolean[] field268;

    @ObfuscatedName("n.z")
    public int[] field276 = new int[Statics.field2242.method3012(19)];

    @ObfuscatedName("n.r")
    public String[] field265 = new String[Statics.field2242.method3012(15)];

    @ObfuscatedName("n.f")
    public boolean field271 = false;

    @ObfuscatedName("n.s")
    public long field269;

    public class20() {
        for (int var1 = 0; var1 < this.field276.length; var1++) {
            class46 var2 = (class46) class46.field1043.method3453((long) var1);
            class46 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field1047.method3002(19, var1);
                class46 var5 = new class46();
                if (var4 != null) {
                    var5.method890(new class120(var4));
                }
                class46.field1043.method3461(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field267[var1] = var3.field1045;
        }
        this.field268 = new boolean[this.field265.length];
        for (int var7 = 0; var7 < this.field265.length; var7++) {
            class50 var8 = (class50) class50.field1099.method3453((long) var7);
            class50 var9;
            if (var8 == null) {
                byte[] var10 = Statics.field1100.method3002(15, var7);
                class50 var11 = new class50();
                if (var10 != null) {
                    var11.method942(new class120(var10));
                }
                class50.field1099.method3461(var11, (long) var7);
                var9 = var11;
            } else {
                var9 = var8;
            }
            this.field268[var7] = var9.field1098;
        }
        for (int var13 = 0; var13 < this.field276.length; var13++) {
            this.field276[var13] = -1;
        }
        this.method178();
    }

    @ObfuscatedName("n.t(III)V")
    public void method171(int arg0, int arg1) {
        this.field276[arg0] = arg1;
        if (this.field267[arg0]) {
            this.field271 = true;
        }
    }

    @ObfuscatedName("n.i(II)I")
    public int method172(int arg0) {
        return this.field276[arg0];
    }

    @ObfuscatedName("n.g(ILjava/lang/String;I)V")
    public void method173(int arg0, String arg1) {
        this.field265[arg0] = arg1;
        if (this.field268[arg0]) {
            this.field271 = true;
        }
    }

    @ObfuscatedName("n.h(IB)Ljava/lang/String;")
    public String method174(int arg0) {
        return this.field265[arg0];
    }

    @ObfuscatedName("n.z(I)V")
    public void method183() {
        for (int var1 = 0; var1 < this.field276.length; var1++) {
            if (!this.field267[var1]) {
                this.field276[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field265.length; var2++) {
            if (!this.field268[var2]) {
                this.field265[var2] = null;
            }
        }
    }

    @ObfuscatedName("n.r(ZI)Lha;")
    public class228 method176(boolean arg0) {
        return class150.method161("2", Statics.field3159.field2317, arg0);
    }

    @ObfuscatedName("n.f(I)V")
    public void method197() {
        class228 var1 = this.method176(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field276.length; var4++) {
                if (this.field267[var4] && this.field276[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field265.length; var6++) {
                if (this.field268[var6] && this.field265[var6] != null) {
                    var2 += 2 + class120.method2086(this.field265[var6]);
                    var5++;
                }
            }
            class120 var7 = new class120(var2);
            var7.method2293(1);
            var7.method2294(var3);
            for (int var8 = 0; var8 < this.field276.length; var8++) {
                if (this.field267[var8] && this.field276[var8] != -1) {
                    var7.method2294(var8);
                    var7.method2296(this.field276[var8]);
                }
            }
            var7.method2294(var5);
            for (int var9 = 0; var9 < this.field265.length; var9++) {
                if (this.field268[var9] && this.field265[var9] != null) {
                    var7.method2294(var9);
                    var7.method2426(this.field265[var9]);
                }
            }
            var1.method3802(var7.field2002, 0, var7.field2001);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method3803();
            } catch (Exception var20) {
            }
        }
        this.field271 = false;
        this.field269 = class116.method2586();
    }

    @ObfuscatedName("n.s(S)V")
    public void method178() {
        class228 var1 = this.method176(false);
        label183: {
            try {
                byte[] var2 = new byte[(int) var1.method3804()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method3815(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class120 var5 = new class120(var2);
                if (var5.field2002.length - var5.field2001 >= 1) {
                    int var7 = var5.method2334();
                    if (var7 < 0 || var7 > 1) {
                        return;
                    }
                    int var9 = var5.method2310();
                    for (int var10 = 0; var10 < var9; var10++) {
                        int var11 = var5.method2310();
                        int var12 = var5.method2345();
                        if (this.field267[var11]) {
                            this.field276[var11] = var12;
                        }
                    }
                    int var13 = var5.method2310();
                    int var14 = 0;
                    while (true) {
                        if (var14 >= var13) {
                            break label183;
                        }
                        int var15 = var5.method2310();
                        String var16 = var5.method2316();
                        if (this.field268[var15]) {
                            this.field265[var15] = var16;
                        }
                        var14++;
                    }
                }
            } catch (Exception var30) {
                break label183;
            } finally {
                try {
                    var1.method3803();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field271 = false;
    }

    @ObfuscatedName("n.d(I)V")
    public void method179() {
        if (this.field271 && this.field269 < class116.method2586() - 60000L) {
            this.method197();
        }
    }

    @ObfuscatedName("n.l(I)Z")
    public boolean method175() {
        return this.field271;
    }
}
