package deob;

import java.io.EOFException;

@ObfuscatedName("ce")
public class class98 {

    @ObfuscatedName("ce.a")
    public boolean[] field1537 = new boolean[this.field1539.length];

    @ObfuscatedName("ce.t")
    public boolean[] field1542;

    @ObfuscatedName("ce.s")
    public int[] field1539 = new int[Statics.field1447.method3787(19)];

    @ObfuscatedName("ce.r")
    public String[] field1540 = new String[Statics.field1447.method3787(15)];

    @ObfuscatedName("ce.v")
    public boolean field1541 = false;

    @ObfuscatedName("ce.y")
    public long field1538;

    public class98() {
        for (int var1 = 0; var1 < this.field1539.length; var1++) {
            class244 var2 = (class244) class244.field3318.method3235((long) var1);
            class244 var3;
            if (var2 == null) {
                byte[] var4 = Statics.field3320.method3768(19, var1);
                class244 var5 = new class244();
                if (var4 != null) {
                    var5.method3956(new class174(var4));
                }
                class244.field3318.method3234(var5, (long) var1);
                var3 = var5;
            } else {
                var3 = var2;
            }
            this.field1537[var1] = var3.field3319;
        }
        this.field1542 = new boolean[this.field1540.length];
        for (int var7 = 0; var7 < this.field1540.length; var7++) {
            class245 var8 = class245.method3502(var7);
            this.field1542[var7] = var8.field3324;
        }
        for (int var9 = 0; var9 < this.field1539.length; var9++) {
            this.field1539[var9] = -1;
        }
        this.method1653();
    }

    @ObfuscatedName("ce.i(III)V")
    public void method1649(int arg0, int arg1) {
        this.field1539[arg0] = arg1;
        if (this.field1537[arg0]) {
            this.field1541 = true;
        }
    }

    @ObfuscatedName("ce.w(II)I")
    public int method1650(int arg0) {
        return this.field1539[arg0];
    }

    @ObfuscatedName("ce.a(ILjava/lang/String;I)V")
    public void method1651(int arg0, String arg1) {
        this.field1540[arg0] = arg1;
        if (this.field1542[arg0]) {
            this.field1541 = true;
        }
    }

    @ObfuscatedName("ce.t(II)Ljava/lang/String;")
    public String method1652(int arg0) {
        return this.field1540[arg0];
    }

    @ObfuscatedName("ce.s(B)V")
    public void method1656() {
        for (int var1 = 0; var1 < this.field1539.length; var1++) {
            if (!this.field1537[var1]) {
                this.field1539[var1] = -1;
            }
        }
        for (int var2 = 0; var2 < this.field1540.length; var2++) {
            if (!this.field1542[var2]) {
                this.field1540[var2] = null;
            }
        }
    }

    @ObfuscatedName("ce.r(ZI)Ldp;")
    public class125 method1654(boolean arg0) {
        return class156.method150("2", Statics.field1208.field3204, arg0);
    }

    @ObfuscatedName("ce.v(B)V")
    public void method1655() {
        class125 var1 = this.method1654(true);
        try {
            int var2 = 3;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field1539.length; var4++) {
                if (this.field1537[var4] && this.field1539[var4] != -1) {
                    var2 += 6;
                    var3++;
                }
            }
            var2 += 2;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field1540.length; var6++) {
                if (this.field1542[var6] && this.field1540[var6] != null) {
                    var2 += 2 + class174.method4370(this.field1540[var6]);
                    var5++;
                }
            }
            class174 var7 = new class174(var2);
            var7.method2865(1);
            var7.method2990(var3);
            for (int var8 = 0; var8 < this.field1539.length; var8++) {
                if (this.field1537[var8] && this.field1539[var8] != -1) {
                    var7.method2990(var8);
                    var7.method2868(this.field1539[var8]);
                }
            }
            var7.method2990(var5);
            for (int var9 = 0; var9 < this.field1540.length; var9++) {
                if (this.field1542[var9] && this.field1540[var9] != null) {
                    var7.method2990(var9);
                    var7.method2871(this.field1540[var9]);
                }
            }
            var1.method2139(var7.field2405, 0, var7.field2399);
        } catch (Exception var21) {
        } finally {
            try {
                var1.method2157();
            } catch (Exception var20) {
            }
        }
        this.field1541 = false;
        this.field1538 = class176.method2862();
    }

    @ObfuscatedName("ce.y(I)V")
    public void method1653() {
        class125 var1 = this.method1654(false);
        label197: {
            try {
                byte[] var2 = new byte[(int) var1.method2155()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2143(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class174 var5 = new class174(var2);
                if (var5.field2405.length - var5.field2399 >= 1) {
                    int var7 = var5.method3061();
                    if (var7 >= 0 && var7 <= 1) {
                        int var9 = var5.method2882();
                        for (int var10 = 0; var10 < var9; var10++) {
                            int var11 = var5.method2882();
                            int var12 = var5.method2885();
                            if (this.field1537[var11]) {
                                this.field1539[var11] = var12;
                            }
                        }
                        int var13 = var5.method2882();
                        int var14 = 0;
                        while (true) {
                            if (var14 >= var13) {
                                break label197;
                            }
                            int var15 = var5.method2882();
                            String var16 = var5.method2884();
                            if (this.field1542[var15]) {
                                this.field1540[var15] = var16;
                            }
                            var14++;
                        }
                    }
                    return;
                }
            } catch (Exception var30) {
                break label197;
            } finally {
                try {
                    var1.method2157();
                } catch (Exception var29) {
                }
            }
            return;
        }
        this.field1541 = false;
    }

    @ObfuscatedName("ce.j(B)V")
    public void method1679() {
        if (this.field1541 && this.field1538 < class176.method2862() - 60000L) {
            this.method1655();
        }
    }

    @ObfuscatedName("ce.k(I)Z")
    public boolean method1657() {
        return this.field1541;
    }
}
